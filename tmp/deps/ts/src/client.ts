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

// 键值对
export class Pair extends $tea.Model {
  // 键
  key?: string;
  // 值
  value?: string;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 运维策略
export class OpsActionPolicy extends $tea.Model {
  // 运维动作类型
  opsActionType?: string;
  // 超时时间
  timeout?: number;
  // 检查间隔
  checkInterval?: number;
  // 重试次数
  retryTimes?: number;
  static names(): { [key: string]: string } {
    return {
      opsActionType: 'ops_action_type',
      timeout: 'timeout',
      checkInterval: 'check_interval',
      retryTimes: 'retry_times',
    };
  }

  static types(): { [key: string]: any } {
    return {
      opsActionType: 'string',
      timeout: 'number',
      checkInterval: 'number',
      retryTimes: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 灰度流量配置
export class GrayTrafficConfig extends $tea.Model {
  // 灰度流量类型
  grayTrafficType?: string;
  // 主机名
  hostname?: string;
  // 匹配规则
  matchPatterns?: string;
  // 端口号
  port?: number;
  // 比例
  proportion?: string;
  // 目标 uri
  targetUri?: string;
  static names(): { [key: string]: string } {
    return {
      grayTrafficType: 'gray_traffic_type',
      hostname: 'hostname',
      matchPatterns: 'match_patterns',
      port: 'port',
      proportion: 'proportion',
      targetUri: 'target_uri',
    };
  }

  static types(): { [key: string]: any } {
    return {
      grayTrafficType: 'string',
      hostname: 'string',
      matchPatterns: 'string',
      port: 'number',
      proportion: 'string',
      targetUri: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 一个部署起来提供服务的应用实例信息
export class AppService extends $tea.Model {
  // 应用名称
  applicationName?: string;
  // 关联的部署单元
  cellIds?: string[];
  // 服务实例描述
  description?: string;
  // 用户自定义的扩展属性
  extraInfos?: string;
  // 最近一次执行的运维操作单号
  latestOperationId?: string;
  // 最近一次执行的运维操作类型。取值列表：
  //                     DEPLOYMENT：部署操作
  //                 
  latestOperationType?: string;
  // 最近成功部署的版本号
  latestVersionNo?: string;
  // 服务实例名称
  serviceName?: string;
  // 环境名称
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      applicationName: 'application_name',
      cellIds: 'cell_ids',
      description: 'description',
      extraInfos: 'extra_infos',
      latestOperationId: 'latest_operation_id',
      latestOperationType: 'latest_operation_type',
      latestVersionNo: 'latest_version_no',
      serviceName: 'service_name',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      applicationName: 'string',
      cellIds: { 'type': 'array', 'itemType': 'string' },
      description: 'string',
      extraInfos: 'string',
      latestOperationId: 'string',
      latestOperationType: 'string',
      latestVersionNo: 'string',
      serviceName: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// CloudPlatform
export class CloudPlatform extends $tea.Model {
  // name
  name?: string;
  // host
  host?: string;
  // loginName
  loginName?: string;
  // password
  password?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      host: 'host',
      loginName: 'login_name',
      password: 'password',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      host: 'string',
      loginName: 'string',
      password: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发布概览信息
export class ArrangementInfo extends $tea.Model {
  // 类型
  arrangementType?: string;
  // 环境变量
  envConfig?: Pair[];
  // 发布概览名称
  name?: string;
  // 发布进程ID
  processDefinitionId?: string;
  // 环境 ID
  workspaceId?: string;
  // 策略
  opsActionPolicies?: OpsActionPolicy[];
  static names(): { [key: string]: string } {
    return {
      arrangementType: 'arrangement_type',
      envConfig: 'env_config',
      name: 'name',
      processDefinitionId: 'process_definition_id',
      workspaceId: 'workspace_id',
      opsActionPolicies: 'ops_action_policies',
    };
  }

  static types(): { [key: string]: any } {
    return {
      arrangementType: 'string',
      envConfig: { 'type': 'array', 'itemType': Pair },
      name: 'string',
      processDefinitionId: 'string',
      workspaceId: 'string',
      opsActionPolicies: { 'type': 'array', 'itemType': OpsActionPolicy },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 任务执行进度
export class TaskExecutionProgress extends $tea.Model {
  // 任务名
  name?: string;
  // 显示名
  showName?: string;
  // 业务类型
  businessEntityCode?: string;
  // 错误代码
  errorCode?: string;
  // 状态
  state?: string;
  // 执行次数
  executionCount?: string;
  // 详细信息
  detailMsg?: string;
  // 开始时间
  startedTime?: string;
  // 结束时间
  finishedTime?: string;
  // 是否可独立执行
  standaloneExecutable?: boolean;
  // ID
  id?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      showName: 'show_name',
      businessEntityCode: 'business_entity_code',
      errorCode: 'error_code',
      state: 'state',
      executionCount: 'execution_count',
      detailMsg: 'detail_msg',
      startedTime: 'started_time',
      finishedTime: 'finished_time',
      standaloneExecutable: 'standalone_executable',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      showName: 'string',
      businessEntityCode: 'string',
      errorCode: 'string',
      state: 'string',
      executionCount: 'string',
      detailMsg: 'string',
      startedTime: 'string',
      finishedTime: 'string',
      standaloneExecutable: 'boolean',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ResourceGroupExecutionProgress
export class ResourceGroupExecutionProgress extends $tea.Model {
  // finished_time
  finishedTime?: boolean;
  // id
  id?: string;
  // paas_id
  paasId?: string;
  // resource_count
  resourceCount?: number;
  // resource_states
  resourceStates?: Pair[];
  // standalone_executable
  standaloneExecutable?: boolean;
  // started_time
  startedTime?: string;
  // state
  state?: string;
  // refer_key
  referKey?: string;
  static names(): { [key: string]: string } {
    return {
      finishedTime: 'finished_time',
      id: 'id',
      paasId: 'paas_id',
      resourceCount: 'resource_count',
      resourceStates: 'resource_states',
      standaloneExecutable: 'standalone_executable',
      startedTime: 'started_time',
      state: 'state',
      referKey: 'refer_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      finishedTime: 'boolean',
      id: 'string',
      paasId: 'string',
      resourceCount: 'number',
      resourceStates: { 'type': 'array', 'itemType': Pair },
      standaloneExecutable: 'boolean',
      startedTime: 'string',
      state: 'string',
      referKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 一个计算容器上正在执行的任务。
export class OpsComputerTask extends $tea.Model {
  // 任务描述
  description?: string;
  // 执行详情。如果任务成功，为执行日志；如果任务失败，为错误信息
  executeDetails?: string;
  // 任务结束时间
  finishTime?: string;
  // 任务名称
  name?: string;
  // 任务开始时间
  startTime?: string;
  // 任务状态。取值列表：
  //                     EXECUTING：执行中；
  //                     SUCCESS：执行成功；
  //                     FAILED：执行失败
  //                 
  status?: string;
  static names(): { [key: string]: string } {
    return {
      description: 'description',
      executeDetails: 'execute_details',
      finishTime: 'finish_time',
      name: 'name',
      startTime: 'start_time',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      description: 'string',
      executeDetails: 'string',
      finishTime: 'string',
      name: 'string',
      startTime: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 运维操作中的应用（服务）
export class OpsApplication extends $tea.Model {
  // 应用（服务）名称
  name?: string;
  // 应用（服务）当前运维状态。取值列表：
  //                     INITING：初始化中；
  //                     INIT_FAILED：初始化失败；
  //                     INITED：初始化完成；
  //                     EXECUTING：执行中；
  //                     SUCCESS：执行成功；
  //                     FAILED：执行失败；
  //                     ROLLBACKED：已回滚；
  //                     CANCELED：已取消
  //                 
  status?: string;
  // APPLICATION和APP_SERVICE。设置为APPLICATION表示该实例描述对象为应用; APP_SERVICE表示该实例描述对象为应用服务。
  type?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      status: 'status',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      status: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 部署单元视图
export class CellView extends $tea.Model {
  // 扩展部署机房id
  deploymentZoneId?: string;
  // 部署单元描述
  description?: string;
  // 显示名称
  displayName?: string;
  // table id
  id?: string;
  // 标识
  identity?: string;
  // master zone id
  masterZoneId?: string;
  // 部署单元状态
  status?: string;
  // 工作空间 id
  workspaceId?: string;
  // 工作空间组 id
  workspaceGroupId?: string;
  static names(): { [key: string]: string } {
    return {
      deploymentZoneId: 'deployment_zone_id',
      description: 'description',
      displayName: 'display_name',
      id: 'id',
      identity: 'identity',
      masterZoneId: 'master_zone_id',
      status: 'status',
      workspaceId: 'workspace_id',
      workspaceGroupId: 'workspace_group_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deploymentZoneId: 'string',
      description: 'string',
      displayName: 'string',
      id: 'string',
      identity: 'string',
      masterZoneId: 'string',
      status: 'string',
      workspaceId: 'string',
      workspaceGroupId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// SLB 执行进度
export class SlbExecutionProgress extends $tea.Model {
  // 进度 ID
  id?: string;
  // 进度名称
  name?: string;
  // 状态
  state?: string;
  // 挂载权重
  mountWeights?: Pair[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      state: 'state',
      mountWeights: 'mount_weights',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      state: 'string',
      mountWeights: { 'type': 'array', 'itemType': Pair },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Region
export class Region extends $tea.Model {
  // description
  description?: string;
  // iaasProviderId
  iaasProviderId?: string;
  // region名称
  id?: string;
  // identity
  identity?: string;
  // region显示名称
  name?: string;
  // networkType
  networkType?: string;
  // state
  state?: string;
  // utcCreate
  utcCreate?: string;
  // utcModified
  utcModified?: string;
  // zoneDtos
  zoneDtos?: string;
  // buildpackId
  buildpackId?: string;
  // fileStatus
  fileStatus?: string;
  // fileLocation
  fileLocation?: string;
  // objectName
  objectName?: string;
  // fileSize
  fileSize?: number;
  // readableFileSize
  readableFileSize?: string;
  // fileChecksum
  fileChecksum?: string;
  // originalFileName
  originalFileName?: string;
  // buildpackTenantId
  buildpackTenantId?: string;
  // fromRegionId
  fromRegionId?: string;
  // creationTime
  creationTime?: string;
  // modificationTime
  modificationTime?: string;
  static names(): { [key: string]: string } {
    return {
      description: 'description',
      iaasProviderId: 'iaas_provider_id',
      id: 'id',
      identity: 'identity',
      name: 'name',
      networkType: 'network_type',
      state: 'state',
      utcCreate: 'utc_create',
      utcModified: 'utc_modified',
      zoneDtos: 'zone_dtos',
      buildpackId: 'buildpack_id',
      fileStatus: 'file_status',
      fileLocation: 'file_location',
      objectName: 'object_name',
      fileSize: 'file_size',
      readableFileSize: 'readable_file_size',
      fileChecksum: 'file_checksum',
      originalFileName: 'original_file_name',
      buildpackTenantId: 'buildpack_tenant_id',
      fromRegionId: 'from_region_id',
      creationTime: 'creation_time',
      modificationTime: 'modification_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      description: 'string',
      iaasProviderId: 'string',
      id: 'string',
      identity: 'string',
      name: 'string',
      networkType: 'string',
      state: 'string',
      utcCreate: 'string',
      utcModified: 'string',
      zoneDtos: 'string',
      buildpackId: 'string',
      fileStatus: 'string',
      fileLocation: 'string',
      objectName: 'string',
      fileSize: 'number',
      readableFileSize: 'string',
      fileChecksum: 'string',
      originalFileName: 'string',
      buildpackTenantId: 'string',
      fromRegionId: 'string',
      creationTime: 'string',
      modificationTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发布应用信息
export class ServiceInfo extends $tea.Model {
  // 应用名
  appName?: string;
  // 部署单元 ID 列表
  cellIds?: string[];
  // 默认执行账号
  defaultExecuteAccount?: string;
  // 环境变量
  envConfig?: Pair[];
  // 是否可以强制执行
  forceExecutable?: boolean;
  // 灰度规则配置
  grayTrafficConfigs?: GrayTrafficConfig[];
  // 分组数
  groupAmount?: number;
  // 分组策略
  groupStrategyType?: string;
  // 从缓存安装
  installFromCache?: boolean;
  // 应用发布名
  name?: string;
  // 是否需要 beta
  needBeta?: boolean;
  // 是否需要灰度
  needGrayTraffic?: boolean;
  // 后置任务列表
  postArrangementInfo?: ArrangementInfo[];
  // 前置任务列表
  preArrangementInfo?: ArrangementInfo[];
  // 发布概览
  serviceArrangement?: ArrangementInfo;
  // 发布应用 ID
  serviceId?: string;
  // 静态资源下载链接
  staticResourceDownloadUrl?: string;
  // 静态资源目标文件
  staticResourceTargetFile?: string;
  // 类型
  type?: string;
  // 版本
  version?: string;
  // 环境 ID
  workspaceId?: string;
  // update_buildpack_version
  updateBuildpackVersion?: string;
  // update_buildpack_id
  updateBuildpackId?: string;
  // custom_params
  customParams?: string;
  static names(): { [key: string]: string } {
    return {
      appName: 'app_name',
      cellIds: 'cell_ids',
      defaultExecuteAccount: 'default_execute_account',
      envConfig: 'env_config',
      forceExecutable: 'force_executable',
      grayTrafficConfigs: 'gray_traffic_configs',
      groupAmount: 'group_amount',
      groupStrategyType: 'group_strategy_type',
      installFromCache: 'install_from_cache',
      name: 'name',
      needBeta: 'need_beta',
      needGrayTraffic: 'need_gray_traffic',
      postArrangementInfo: 'post_arrangement_info',
      preArrangementInfo: 'pre_arrangement_info',
      serviceArrangement: 'service_arrangement',
      serviceId: 'service_id',
      staticResourceDownloadUrl: 'static_resource_download_url',
      staticResourceTargetFile: 'static_resource_target_file',
      type: 'type',
      version: 'version',
      workspaceId: 'workspace_id',
      updateBuildpackVersion: 'update_buildpack_version',
      updateBuildpackId: 'update_buildpack_id',
      customParams: 'custom_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appName: 'string',
      cellIds: { 'type': 'array', 'itemType': 'string' },
      defaultExecuteAccount: 'string',
      envConfig: { 'type': 'array', 'itemType': Pair },
      forceExecutable: 'boolean',
      grayTrafficConfigs: { 'type': 'array', 'itemType': GrayTrafficConfig },
      groupAmount: 'number',
      groupStrategyType: 'string',
      installFromCache: 'boolean',
      name: 'string',
      needBeta: 'boolean',
      needGrayTraffic: 'boolean',
      postArrangementInfo: { 'type': 'array', 'itemType': ArrangementInfo },
      preArrangementInfo: { 'type': 'array', 'itemType': ArrangementInfo },
      serviceArrangement: ArrangementInfo,
      serviceId: 'string',
      staticResourceDownloadUrl: 'string',
      staticResourceTargetFile: 'string',
      type: 'string',
      version: 'string',
      workspaceId: 'string',
      updateBuildpackVersion: 'string',
      updateBuildpackId: 'string',
      customParams: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 代码提交
export class CodeCommit extends $tea.Model {
  // 作者
  author?: string;
  // 分支
  branch?: string;
  // 代码版本
  codeVersion?: string;
  // 时间
  date?: string;
  // id
  id?: string;
  // 消息
  msg?: string;
  // 仓库名称
  repoName?: string;
  // 创建时间
  utcCreate?: string;
  // 修改时间
  utcModified?: string;
  static names(): { [key: string]: string } {
    return {
      author: 'author',
      branch: 'branch',
      codeVersion: 'code_version',
      date: 'date',
      id: 'id',
      msg: 'msg',
      repoName: 'repo_name',
      utcCreate: 'utc_create',
      utcModified: 'utc_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      author: 'string',
      branch: 'string',
      codeVersion: 'string',
      date: 'string',
      id: 'string',
      msg: 'string',
      repoName: 'string',
      utcCreate: 'string',
      utcModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Cloud
export class Cloud extends $tea.Model {
  // id
  id?: number;
  // identity
  identity?: string;
  // name
  name?: string;
  // platforms
  platforms?: CloudPlatform[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      identity: 'identity',
      name: 'name',
      platforms: 'platforms',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      identity: 'string',
      name: 'string',
      platforms: { 'type': 'array', 'itemType': CloudPlatform },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 一个正在进行运维操作的计算容器。
export class OpsComputer extends $tea.Model {
  // 计算容器id
  id?: string;
  // 计算容器内网ip
  innerIp?: string;
  // 计算容器名称
  name?: string;
  // 计算容器当前运维状态。取值列表：
  //                     INITED：初始化完成；
  //                     EXECUTING：执行中；
  //                     SUCCESS：执行成功；
  //                     FAILED：执行失败；
  //                     CANCELED：已取消；
  //                     IGNORED：已忽略
  //                 
  status?: string;
  // 计算容器上执行的任务信息。任务信息列表中包含正在执行和执行完成的任务。
  tasks?: OpsComputerTask[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      innerIp: 'inner_ip',
      name: 'name',
      status: 'status',
      tasks: 'tasks',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      innerIp: 'string',
      name: 'string',
      status: 'string',
      tasks: { 'type': 'array', 'itemType': OpsComputerTask },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据库资源信息
export class DepsDatabase extends $tea.Model {
  // 服务实例列表
  appServices?: AppService[];
  // 连接地址
  connectionAddress?: string;
  // CPU
  cpu?: number;
  // 数据库类型，取值 MYSQL, OCEANBASE
  engine?: string;
  // 数据库版本，取值 MYSQL5, MYSQL6, MYSQL7, OCEANBASE1_4, 分别对应Mysql5.5, 5.6, 5.7, Ocea
  engineVersion?: string;
  // iaaS在创建该资源时为其分配的唯一标示，创建中或创建失败时为空
  iaasId?: string;
  // 资源唯一标识
  id?: string;
  // 最大连接数
  maxConnections?: number;
  // 最大IOPS
  maxIops?: number;
  // 内存大小，单位：MB
  memory?: number;
  // 资源名称
  name?: string;
  // 网络类型，Classic或VPC
  networkType?: string;
  // 网络连接类型，取值 Internet：外网，Intranet：内网
  netType?: string;
  // 连接端口
  port?: number;
  // 资源所属的地域id
  region?: string;
  // 数据库实例规格
  specIaasId?: string;
  // 
  //                     
  //               资源状态，取值 CREATING：正在创建，CREATEFAILED：创建失败，RUNNING: 运行中，REBOOTING: 重启，REBOOT_FAILED: 重启失败，
  //               DELETING：正在删除，DELETED：删除成功，DELETE_FAILED：删除失败，RESOURCE_IMPORTING：资源导入中，RESOURCE_IMPORT_FAILED：资源导入失败，
  //               RESOURCE_REMOVING：资源删除中，RESOURCE_REMOVE_FAILED：资源删除失败，DBINSTANCECLASSCHANGING：修改规格中，
  //               MODIFY_SPEC_FAILED：修改规格失败
  //                 
  status?: string;
  // 存储空间GB
  storage?: number;
  static names(): { [key: string]: string } {
    return {
      appServices: 'app_services',
      connectionAddress: 'connection_address',
      cpu: 'cpu',
      engine: 'engine',
      engineVersion: 'engine_version',
      iaasId: 'iaas_id',
      id: 'id',
      maxConnections: 'max_connections',
      maxIops: 'max_iops',
      memory: 'memory',
      name: 'name',
      networkType: 'network_type',
      netType: 'net_type',
      port: 'port',
      region: 'region',
      specIaasId: 'spec_iaas_id',
      status: 'status',
      storage: 'storage',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appServices: { 'type': 'array', 'itemType': AppService },
      connectionAddress: 'string',
      cpu: 'number',
      engine: 'string',
      engineVersion: 'string',
      iaasId: 'string',
      id: 'string',
      maxConnections: 'number',
      maxIops: 'number',
      memory: 'number',
      name: 'string',
      networkType: 'string',
      netType: 'string',
      port: 'number',
      region: 'string',
      specIaasId: 'string',
      status: 'string',
      storage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AppServiceExecutionProgress
export class AppServiceExecutionProgress extends $tea.Model {
  // base_progress
  baseProgress?: ResourceGroupExecutionProgress;
  // group_count
  groupCount?: number;
  // pre_deployment_execution_progresses
  preDeploymentExecutionProgresses?: TaskExecutionProgress[];
  // post_deployment_execution_progresses
  postDeploymentExecutionProgresses?: TaskExecutionProgress[];
  // group_execution_progresses
  groupExecutionProgresses?: ResourceGroupExecutionProgress[];
  static names(): { [key: string]: string } {
    return {
      baseProgress: 'base_progress',
      groupCount: 'group_count',
      preDeploymentExecutionProgresses: 'pre_deployment_execution_progresses',
      postDeploymentExecutionProgresses: 'post_deployment_execution_progresses',
      groupExecutionProgresses: 'group_execution_progresses',
    };
  }

  static types(): { [key: string]: any } {
    return {
      baseProgress: ResourceGroupExecutionProgress,
      groupCount: 'number',
      preDeploymentExecutionProgresses: { 'type': 'array', 'itemType': TaskExecutionProgress },
      postDeploymentExecutionProgresses: { 'type': 'array', 'itemType': TaskExecutionProgress },
      groupExecutionProgresses: { 'type': 'array', 'itemType': ResourceGroupExecutionProgress },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 计算资源信息
export class Computer extends $tea.Model {
  // 服务实例列表
  appServices?: AppService[];
  // 服务器所属的cell ID
  cellId?: string;
  // 类型:POD/DOCKER_VM
  computerType?: string;
  // CPU核数
  cpu?: number;
  // 弹性ip地址
  elasticIp?: string;
  // iaas_id
  iaasId?: string;
  // 计算资源唯一标识
  id?: string;
  // 内网ip地址
  innerIp?: string;
  // 内存大小，单位：MB
  memory?: number;
  // 资源名称
  name?: string;
  // 公网ip地址
  publicIp?: string;
  // 资源所属的地域id
  region?: string;
  // 资源状态，取值：
  //                     CREATING：创建中；
  //                     CREATE_FAILED：创建失败；
  //                     CREATED：已创建；
  //                     STARTING：开机中；
  //                     START_FAILED：开机失败；
  //                     UNALLOCATED：待分配；
  //                     INITIALIZING：初始化中；
  //                     INITIALIZE_FAILED：初始化失败；
  //                     OFFLINE：已下线；
  //                     READY：待部署；
  //                     DEPLOYING：部署中；
  //                     DEPLOY_FAILED：部署失败；
  //                     DEPLOYED：已部署；
  //                     RELEASING：释放中；
  //                     RELEASE_FAILED：释放失败；
  //                     STOPPING：关机中；
  //                     STOP_FAILED：关机失败；
  //                     STOPPED：已关机；
  //                     REBOOTING：重启中；
  //                     REBOOT_FAILED：重启失败；
  //                     DISK_INITIALIZING：初始化磁盘中；
  //                     SPEC_CHANGING：变配中；
  //                     LOCKED：被锁定；
  //                     EXPIRED：已过期；
  //                     TO_EXPIR：即将过期；
  //                     DELETING：删除中；
  //                     DELETE_FAILED：删除失败；
  //                     DELETED：删除成功
  //                 
  status?: string;
  // 资源所属的可用区id
  zone?: string;
  // 机器是否镜像化
  deployMode?: string;
  static names(): { [key: string]: string } {
    return {
      appServices: 'app_services',
      cellId: 'cell_id',
      computerType: 'computer_type',
      cpu: 'cpu',
      elasticIp: 'elastic_ip',
      iaasId: 'iaas_id',
      id: 'id',
      innerIp: 'inner_ip',
      memory: 'memory',
      name: 'name',
      publicIp: 'public_ip',
      region: 'region',
      status: 'status',
      zone: 'zone',
      deployMode: 'deploy_mode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appServices: { 'type': 'array', 'itemType': AppService },
      cellId: 'string',
      computerType: 'string',
      cpu: 'number',
      elasticIp: 'string',
      iaasId: 'string',
      id: 'string',
      innerIp: 'string',
      memory: 'number',
      name: 'string',
      publicIp: 'string',
      region: 'string',
      status: 'string',
      zone: 'string',
      deployMode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// SLB 信息
export class SLBInfo extends $tea.Model {
  // 名称
  name?: string;
  // 机器ID
  machineId?: string;
  // 端口
  port?: number;
  // paas id
  paasId?: string;
  // iaas id
  iaasId?: string;
  // 虚拟服务器组 id
  vServerGroupId?: string;
  // 虚拟服务器组名
  vServerGroupName?: string;
  // 计算资源 ID
  computerId?: string;
  // 应用 ID
  appId?: string;
  // 应用服务 ID
  appSvcId?: string;
  // vip 地址列表
  vipAddresses?: string[];
  // 权重
  weight?: number;
  // 状态
  state?: string;
  // ID
  id?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      machineId: 'machine_id',
      port: 'port',
      paasId: 'paas_id',
      iaasId: 'iaas_id',
      vServerGroupId: 'v_server_group_id',
      vServerGroupName: 'v_server_group_name',
      computerId: 'computer_id',
      appId: 'app_id',
      appSvcId: 'app_svc_id',
      vipAddresses: 'vip_addresses',
      weight: 'weight',
      state: 'state',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      machineId: 'string',
      port: 'number',
      paasId: 'string',
      iaasId: 'string',
      vServerGroupId: 'string',
      vServerGroupName: 'string',
      computerId: 'string',
      appId: 'string',
      appSvcId: 'string',
      vipAddresses: { 'type': 'array', 'itemType': 'string' },
      weight: 'number',
      state: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 挂载权重
export class MountWeight extends $tea.Model {
  // 挂载目标 ID
  mountTargetId?: string;
  // 端口
  port?: number;
  // 权重
  weight?: number;
  static names(): { [key: string]: string } {
    return {
      mountTargetId: 'mount_target_id',
      port: 'port',
      weight: 'weight',
    };
  }

  static types(): { [key: string]: any } {
    return {
      mountTargetId: 'string',
      port: 'number',
      weight: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 一组执行运维操作的应用（服务），同一个组中的应用（服务）将并行执行操作。
export class OpsApplicationGroup extends $tea.Model {
  // 此运维应用（服务）组中包含的应用（服务）列表
  applications?: OpsApplication[];
  static names(): { [key: string]: string } {
    return {
      applications: 'applications',
    };
  }

  static types(): { [key: string]: any } {
    return {
      applications: { 'type': 'array', 'itemType': OpsApplication },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 一个运维应用（服务）操作链。一个操作链中包含一个顺序的运维应用（服务）组列表，这些运维应用（服务）组将依次串行的执行运维操作。不同的操作链将并行执行。
export class OpsApplicationChain extends $tea.Model {
  // 此运维应用链中包含的应用（服务）组列表
  groups?: OpsApplicationGroup[];
  static names(): { [key: string]: string } {
    return {
      groups: 'groups',
    };
  }

  static types(): { [key: string]: any } {
    return {
      groups: { 'type': 'array', 'itemType': OpsApplicationGroup },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// UserDTO
export class UserDTO extends $tea.Model {
  // customerId
  customerId?: string;
  // name
  name?: string;
  // realName
  realName?: string;
  // type
  type?: string;
  // 用户id
  id?: string;
  // 登录名称
  loginName?: string;
  // 邮箱
  email?: string;
  // 手机号
  mobile?: string;
  static names(): { [key: string]: string } {
    return {
      customerId: 'customer_id',
      name: 'name',
      realName: 'real_name',
      type: 'type',
      id: 'id',
      loginName: 'login_name',
      email: 'email',
      mobile: 'mobile',
    };
  }

  static types(): { [key: string]: any } {
    return {
      customerId: 'string',
      name: 'string',
      realName: 'string',
      type: 'string',
      id: 'string',
      loginName: 'string',
      email: 'string',
      mobile: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 执行指令的一个参数。
export class OpsCmdArg extends $tea.Model {
  // 指令参数名称
  name?: string;
  // 指令参数值
  value?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 机器信息
export class Machine extends $tea.Model {
  // 机器名
  name?: string;
  // 所属发布服务id
  serviceId?: string;
  // 包版本
  servicePackageVersion?: string;
  // 应用服务分组集合 ID
  serviceGroupCollectionId?: string;
  // 发布分组 ID
  serviceGroupId?: string;
  // 概览 ID
  arrangementId?: string;
  // 服务类型
  serviceType?: string;
  // paas 服务 ID
  paasServiceId?: string;
  // paas 状态
  paasState?: string;
  // 关联目标 ID
  refTargetId?: string;
  // 目标 iaas id
  targetIaasId?: string;
  // 内网 IP
  innerIp?: string;
  // 公网 IP
  publicIp?: string;
  // 主机名
  hostName?: string;
  // 主机域名
  hostDomain?: string;
  // 安全组ID
  securityDomainId?: string;
  // 安全组创建人 ID
  securityDomainCreatorId?: string;
  // 安全组名
  securityDomainName?: string;
  // 默认执行账号
  defaultExecuteAccount?: string;
  // 可用区 ID
  zoneId?: string;
  // 部署单元 ID
  cellId?: string;
  // 用户名
  username?: string;
  // 加密密码
  encodedPwd?: string;
  // 加密秘钥
  encodedSecreyKey?: string;
  // 公钥
  publicKey?: string;
  // star manage ip
  starManagerIp?: string;
  // star manager port
  starManagerPort?: number;
  // 初始化脚本 url
  scriptUrl?: string;
  // 特殊初始化脚本 url
  specialScriptUrl?: string;
  // 代理 url
  agentUrl?: string;
  // 代理设置 url
  agentSetupUrl?: string;
  // 机器初始 url
  machineInitUrl?: string;
  // 特殊机器初始 url
  specialMachineInitUrl?: string;
  // 控制类型
  controlType?: string;
  // 控制对象
  controlTarget?: string;
  // 是否需要初始化
  needInitialize?: boolean;
  // SLB 信息
  slbInfoList?: SLBInfo[];
  // 子任务 id 
  taskIds?: string[];
  // 环境变量
  envConfig?: Pair[];
  // pd id
  processDefinitionId?: string;
  // 父节点 id
  parentId?: string;
  // 父节点类型
  parentEntityType?: string;
  // 流程节点 ID
  nodeId?: string;
  // 状态
  state?: string;
  // 开始时间
  startedTime?: string;
  // 结束时间
  finishedTime?: string;
  // 是否可独立执行
  standaloneExecutable?: boolean;
  // ID
  id?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      serviceId: 'service_id',
      servicePackageVersion: 'service_package_version',
      serviceGroupCollectionId: 'service_group_collection_id',
      serviceGroupId: 'service_group_id',
      arrangementId: 'arrangement_id',
      serviceType: 'service_type',
      paasServiceId: 'paas_service_id',
      paasState: 'paas_state',
      refTargetId: 'ref_target_id',
      targetIaasId: 'target_iaas_id',
      innerIp: 'inner_ip',
      publicIp: 'public_ip',
      hostName: 'host_name',
      hostDomain: 'host_domain',
      securityDomainId: 'security_domain_id',
      securityDomainCreatorId: 'security_domain_creator_id',
      securityDomainName: 'security_domain_name',
      defaultExecuteAccount: 'default_execute_account',
      zoneId: 'zone_id',
      cellId: 'cell_id',
      username: 'username',
      encodedPwd: 'encoded_pwd',
      encodedSecreyKey: 'encoded_secrey_key',
      publicKey: 'public_key',
      starManagerIp: 'star_manager_ip',
      starManagerPort: 'star_manager_port',
      scriptUrl: 'script_url',
      specialScriptUrl: 'special_script_url',
      agentUrl: 'agent_url',
      agentSetupUrl: 'agent_setup_url',
      machineInitUrl: 'machine_init_url',
      specialMachineInitUrl: 'special_machine_init_url',
      controlType: 'control_type',
      controlTarget: 'control_target',
      needInitialize: 'need_initialize',
      slbInfoList: 'slb_info_list',
      taskIds: 'task_ids',
      envConfig: 'env_config',
      processDefinitionId: 'process_definition_id',
      parentId: 'parent_id',
      parentEntityType: 'parent_entity_type',
      nodeId: 'node_id',
      state: 'state',
      startedTime: 'started_time',
      finishedTime: 'finished_time',
      standaloneExecutable: 'standalone_executable',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      serviceId: 'string',
      servicePackageVersion: 'string',
      serviceGroupCollectionId: 'string',
      serviceGroupId: 'string',
      arrangementId: 'string',
      serviceType: 'string',
      paasServiceId: 'string',
      paasState: 'string',
      refTargetId: 'string',
      targetIaasId: 'string',
      innerIp: 'string',
      publicIp: 'string',
      hostName: 'string',
      hostDomain: 'string',
      securityDomainId: 'string',
      securityDomainCreatorId: 'string',
      securityDomainName: 'string',
      defaultExecuteAccount: 'string',
      zoneId: 'string',
      cellId: 'string',
      username: 'string',
      encodedPwd: 'string',
      encodedSecreyKey: 'string',
      publicKey: 'string',
      starManagerIp: 'string',
      starManagerPort: 'number',
      scriptUrl: 'string',
      specialScriptUrl: 'string',
      agentUrl: 'string',
      agentSetupUrl: 'string',
      machineInitUrl: 'string',
      specialMachineInitUrl: 'string',
      controlType: 'string',
      controlTarget: 'string',
      needInitialize: 'boolean',
      slbInfoList: { 'type': 'array', 'itemType': SLBInfo },
      taskIds: { 'type': 'array', 'itemType': 'string' },
      envConfig: { 'type': 'array', 'itemType': Pair },
      processDefinitionId: 'string',
      parentId: 'string',
      parentEntityType: 'string',
      nodeId: 'string',
      state: 'string',
      startedTime: 'string',
      finishedTime: 'string',
      standaloneExecutable: 'boolean',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 执行失败任务节点
export class ErrorTaskExecutionNode extends $tea.Model {
  // 节点 ID
  nodeId?: string;
  // 节点名
  nodeName?: string;
  // 错误码
  code?: string;
  // 错误信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      nodeId: 'node_id',
      nodeName: 'node_name',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      nodeId: 'string',
      nodeName: 'string',
      code: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AppManifest
export class AppManifest extends $tea.Model {
  // id
  id?: string;
  // workspaceId
  workspaceId?: string;
  // appId
  appId?: string;
  // version
  appVersion?: string;
  // name
  name?: string;
  // storeLocation
  storeLocation?: string;
  // location
  location?: string;
  // etag
  etag?: string;
  // remark
  remark?: string;
  // 代码提交
  codeCommit?: CodeCommit;
  // 创建时间
  utcCreate?: string;
  // 修改时间
  utcModified?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      workspaceId: 'workspace_id',
      appId: 'app_id',
      appVersion: 'app_version',
      name: 'name',
      storeLocation: 'store_location',
      location: 'location',
      etag: 'etag',
      remark: 'remark',
      codeCommit: 'code_commit',
      utcCreate: 'utc_create',
      utcModified: 'utc_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      workspaceId: 'string',
      appId: 'string',
      appVersion: 'string',
      name: 'string',
      storeLocation: 'string',
      location: 'string',
      etag: 'string',
      remark: 'string',
      codeCommit: CodeCommit,
      utcCreate: 'string',
      utcModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// sidecar环境参数配置
export class SidecarParamsConfig extends $tea.Model {
  // 类型：默认、透明劫持
  type?: string;
  // 环境参数内容
  params?: string;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      params: 'params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      params: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 部署单元
export class DeployCell extends $tea.Model {
  // 所属逻辑单元名称[单元化模式特有]
  cellGroup?: string;
  // 所属集群	
  // 
  cluster?: string;
  // 蓝绿着色信息[单元化模式特有]
  color?: string;
  // 创建时间
  createdTime?: string;
  // cell名称，与name一样，为了兼容已有代码
  displayName?: string;
  // 部署单元标识，创建之后不允许修改
  identity?: string;
  // 是否灰度[单元化模式特有]
  isGray?: boolean;
  // 部署单元名称，主要用作页面展示
  name?: string;
  // 压测权重
  pressWeight?: number;
  // 部署单元类型[单元化模式特有]
  type?: string;
  // 默认权重[单元化模式特有]
  weight?: number;
  // 所属工作空间名称
  workspace?: string;
  // 所属机房名称
  zone?: string;
  // cell id
  id?: string;
  static names(): { [key: string]: string } {
    return {
      cellGroup: 'cell_group',
      cluster: 'cluster',
      color: 'color',
      createdTime: 'created_time',
      displayName: 'display_name',
      identity: 'identity',
      isGray: 'is_gray',
      name: 'name',
      pressWeight: 'press_weight',
      type: 'type',
      weight: 'weight',
      workspace: 'workspace',
      zone: 'zone',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cellGroup: 'string',
      cluster: 'string',
      color: 'string',
      createdTime: 'string',
      displayName: 'string',
      identity: 'string',
      isGray: 'boolean',
      name: 'string',
      pressWeight: 'number',
      type: 'string',
      weight: 'number',
      workspace: 'string',
      zone: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// BuildCommandParams
export class BuildCommandParams extends $tea.Model {
  // buildpackId
  buildpackId?: string;
  // description
  description?: string;
  // key
  key?: string;
  // value
  value?: string;
  static names(): { [key: string]: string } {
    return {
      buildpackId: 'buildpack_id',
      description: 'description',
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      buildpackId: 'string',
      description: 'string',
      key: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// NotificationReceiver
export class NotificationReceiver extends $tea.Model {
  // config id
  configId?: string;
  // receiver
  receiver?: string;
  // description
  description?: string;
  // id
  id?: string;
  static names(): { [key: string]: string } {
    return {
      configId: 'config_id',
      receiver: 'receiver',
      description: 'description',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      configId: 'string',
      receiver: 'string',
      description: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 技术栈包上传地址信息
export class UploadEndpoint extends $tea.Model {
  // 对象存储的access_key_id
  accessKeyId?: string;
  // 上传的目标bucket名称
  bucket?: string;
  // 加密策略，仅storage_type为SYSTEM_OSS时有效
  encodedPolicy?: string;
  // 文件失效的日期时间
  expiration?: string;
  // 对象存储的上传目标文件路径
  filePath?: string;
  // 上传的目标主机名，仅storage_type为SYSTEM_OSS时有效
  host?: string;
  // 地域ID
  regionId?: string;
  // 签名，仅storage_type为SYSTEM_OSS时有效
  signature?: string;
  // 存储类型，取值如下： SYSTEM_AFS表示AFS存储，SYSTEM_OSS表示OSS存储
  storageType?: string;
  // 上传的目标URL
  url?: string;
  static names(): { [key: string]: string } {
    return {
      accessKeyId: 'access_key_id',
      bucket: 'bucket',
      encodedPolicy: 'encoded_policy',
      expiration: 'expiration',
      filePath: 'file_path',
      host: 'host',
      regionId: 'region_id',
      signature: 'signature',
      storageType: 'storage_type',
      url: 'url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accessKeyId: 'string',
      bucket: 'string',
      encodedPolicy: 'string',
      expiration: 'string',
      filePath: 'string',
      host: 'string',
      regionId: 'string',
      signature: 'string',
      storageType: 'string',
      url: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 机房视图
export class ZoneView extends $tea.Model {
  // 显示名称
  displayName?: string;
  // table id
  id?: string;
  // 标识
  identity?: string;
  // 状态
  state?: string;
  static names(): { [key: string]: string } {
    return {
      displayName: 'display_name',
      id: 'id',
      identity: 'identity',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      displayName: 'string',
      id: 'string',
      identity: 'string',
      state: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ServiceInfoGroup
export class ServiceInfoGroup extends $tea.Model {
  // 发布应用列表
  serviceInfoList?: ServiceInfo[];
  static names(): { [key: string]: string } {
    return {
      serviceInfoList: 'service_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      serviceInfoList: { 'type': 'array', 'itemType': ServiceInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// sidecar过滤条件
export class SidecarCondition extends $tea.Model {
  // 支持的workspaceGroup
  workspaceGroups?: string;
  // 支持的cell列表
  cells?: string;
  static names(): { [key: string]: string } {
    return {
      workspaceGroups: 'workspace_groups',
      cells: 'cells',
    };
  }

  static types(): { [key: string]: any } {
    return {
      workspaceGroups: 'string',
      cells: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// BuildpackRegionRelationDetail
export class BuildpackRegionRelationDetail extends $tea.Model {
  // buildpackId
  buildpackId?: string;
  // buildpackTenantId
  buildpackTenantId?: string;
  // creationTime
  creationTime?: string;
  // fileChecksum
  fileChecksum?: string;
  // fileLocation
  fileLocation?: string;
  // fileSize
  fileSize?: number;
  // fileStatus
  fileStatus?: string;
  // fromRegionId
  fromRegionId?: string;
  // id
  id?: string;
  // modificationTime
  modificationTime?: string;
  // objectName
  objectName?: string;
  // originalFileName
  originalFileName?: string;
  // readableFileSize
  readableFileSize?: string;
  // RegionDto
  region?: Region;
  static names(): { [key: string]: string } {
    return {
      buildpackId: 'buildpack_id',
      buildpackTenantId: 'buildpack_tenant_id',
      creationTime: 'creation_time',
      fileChecksum: 'file_checksum',
      fileLocation: 'file_location',
      fileSize: 'file_size',
      fileStatus: 'file_status',
      fromRegionId: 'from_region_id',
      id: 'id',
      modificationTime: 'modification_time',
      objectName: 'object_name',
      originalFileName: 'original_file_name',
      readableFileSize: 'readable_file_size',
      region: 'region',
    };
  }

  static types(): { [key: string]: any } {
    return {
      buildpackId: 'string',
      buildpackTenantId: 'string',
      creationTime: 'string',
      fileChecksum: 'string',
      fileLocation: 'string',
      fileSize: 'number',
      fileStatus: 'string',
      fromRegionId: 'string',
      id: 'string',
      modificationTime: 'string',
      objectName: 'string',
      originalFileName: 'string',
      readableFileSize: 'string',
      region: Region,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 逻辑单元灾备信息
export class DisasterInfo extends $tea.Model {
  // 正常容灾状态
  disasterRecoveryState?: string;
  // 同城灾备单元(组)
  localFailoverTarget?: string;
  // 压测容灾状态
  pressDisasterRecoveryState?: string;
  // 异地灾备单元(组)
  remoteFailoverTarget?: string;
  // 逻辑单元&部署单元名称
  source?: string;
  // 容灾类型
  type?: string;
  static names(): { [key: string]: string } {
    return {
      disasterRecoveryState: 'disaster_recovery_state',
      localFailoverTarget: 'local_failover_target',
      pressDisasterRecoveryState: 'press_disaster_recovery_state',
      remoteFailoverTarget: 'remote_failover_target',
      source: 'source',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      disasterRecoveryState: 'string',
      localFailoverTarget: 'string',
      pressDisasterRecoveryState: 'string',
      remoteFailoverTarget: 'string',
      source: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用参数配置管理-某个参数在某个 scope + scope id 中渲染后的值
export class ParamVal extends $tea.Model {
  // 参数渲染后的值
  renderVal?: string;
  // 某个 scope_id
  scopeId?: string;
  // scope 类型
  scope?: string;
  static names(): { [key: string]: string } {
    return {
      renderVal: 'render_val',
      scopeId: 'scope_id',
      scope: 'scope',
    };
  }

  static types(): { [key: string]: any } {
    return {
      renderVal: 'string',
      scopeId: 'string',
      scope: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// BGReleaseExecutionProgress
export class BGReleaseExecutionProgress extends $tea.Model {
  // unit_id
  unitId?: string;
  // unit_type
  unitType?: string;
  // resource_type
  resourceType?: string;
  // traffic_execution_progress_of_service
  trafficExecutionProgressOfService?: SlbExecutionProgress[];
  // service_execution_progress_group
  serviceExecutionProgressGroup?: TaskExecutionProgress[];
  // rollback_service_execution_progress_group
  rollbackServiceExecutionProgressGroup?: TaskExecutionProgress[];
  // base_progress
  baseProgress?: ResourceGroupExecutionProgress;
  static names(): { [key: string]: string } {
    return {
      unitId: 'unit_id',
      unitType: 'unit_type',
      resourceType: 'resource_type',
      trafficExecutionProgressOfService: 'traffic_execution_progress_of_service',
      serviceExecutionProgressGroup: 'service_execution_progress_group',
      rollbackServiceExecutionProgressGroup: 'rollback_service_execution_progress_group',
      baseProgress: 'base_progress',
    };
  }

  static types(): { [key: string]: any } {
    return {
      unitId: 'string',
      unitType: 'string',
      resourceType: 'string',
      trafficExecutionProgressOfService: { 'type': 'array', 'itemType': SlbExecutionProgress },
      serviceExecutionProgressGroup: { 'type': 'array', 'itemType': TaskExecutionProgress },
      rollbackServiceExecutionProgressGroup: { 'type': 'array', 'itemType': TaskExecutionProgress },
      baseProgress: ResourceGroupExecutionProgress,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 对一个对象执行一条指令的结果。
export class SingleExecResult extends $tea.Model {
  // 执行结果详情。如果成功，为执行日志；如果失败，为错误信息
  executeDetails?: string;
  // 执行结束时间
  finishTime?: number;
  // 执行开始时间
  startTime?: number;
  // 执行结果状态。取值列表：
  //                     EXECUTING：执行中；
  //                     SUCCESS：执行成功；
  //                     FAILED：执行失败；
  //                     IGNORED：已忽略；
  //                     TIME_OUT：已超时
  //                 
  status?: string;
  // 执行对象。比如一台机器的ip 
  target?: string;
  static names(): { [key: string]: string } {
    return {
      executeDetails: 'execute_details',
      finishTime: 'finish_time',
      startTime: 'start_time',
      status: 'status',
      target: 'target',
    };
  }

  static types(): { [key: string]: any } {
    return {
      executeDetails: 'string',
      finishTime: 'number',
      startTime: 'number',
      status: 'string',
      target: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 虚拟服务器组挂载信息
export class VServerGroupMountInfo extends $tea.Model {
  // iaas id
  iaasId?: string;
  // 名称
  name?: string;
  // paas id
  paasId?: string;
  // 权重信息
  mountWeights?: MountWeight[];
  static names(): { [key: string]: string } {
    return {
      iaasId: 'iaas_id',
      name: 'name',
      paasId: 'paas_id',
      mountWeights: 'mount_weights',
    };
  }

  static types(): { [key: string]: any } {
    return {
      iaasId: 'string',
      name: 'string',
      paasId: 'string',
      mountWeights: { 'type': 'array', 'itemType': MountWeight },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 运维进程
export class OpsProcessDefinition extends $tea.Model {
  // 描述
  description?: string;
  // 指令名称
  instruction?: string;
  // 进程名
  name?: string;
  // 运维类型
  opsType?: string;
  // 发布单ID
  planId?: string;
  // 类型
  type?: string;
  // 概览信息
  arrangements?: ArrangementInfo[];
  // 环境变量
  envConfig?: Pair[];
  // 支持的状态转换列表
  supportedTransitions?: string[];
  // 节点ID
  nodeId?: string;
  // 状态
  state?: string;
  // 开始时间
  startedTime?: string;
  // 结束时间
  finishedTime?: string;
  // 可独立执行
  standaloneExecutable?: boolean;
  // ID
  id?: string;
  static names(): { [key: string]: string } {
    return {
      description: 'description',
      instruction: 'instruction',
      name: 'name',
      opsType: 'ops_type',
      planId: 'plan_id',
      type: 'type',
      arrangements: 'arrangements',
      envConfig: 'env_config',
      supportedTransitions: 'supported_transitions',
      nodeId: 'node_id',
      state: 'state',
      startedTime: 'started_time',
      finishedTime: 'finished_time',
      standaloneExecutable: 'standalone_executable',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      description: 'string',
      instruction: 'string',
      name: 'string',
      opsType: 'string',
      planId: 'string',
      type: 'string',
      arrangements: { 'type': 'array', 'itemType': ArrangementInfo },
      envConfig: { 'type': 'array', 'itemType': Pair },
      supportedTransitions: { 'type': 'array', 'itemType': 'string' },
      nodeId: 'string',
      state: 'string',
      startedTime: 'string',
      finishedTime: 'string',
      standaloneExecutable: 'boolean',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 记录额外信息，核心是一个 Key-Value 对
export class Tag extends $tea.Model {
  // 可读键名
  displayName?: string;
  // 键名
  key?: string;
  // 映射类型，可选
  type?: string;
  // 键值
  value?: string;
  static names(): { [key: string]: string } {
    return {
      displayName: 'display_name',
      key: 'key',
      type: 'type',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      displayName: 'string',
      key: 'string',
      type: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Workspace
export class Workspace extends $tea.Model {
  // 创建时间
  createTime?: string;
  // workspace 显示名称
  displayName?: string;
  // workspace 名称
  id?: string;
  // 工作空间唯一标识
  identity?: string;
  // workspace 名称（等同于唯一标识）
  name?: string;
  // 网络类型
  networkType?: string;
  // workspace所在regionId
  region?: string;
  // region id
  regionId?: string;
  // 所属租户名称
  tenant?: string;
  // 最近更新时间
  updateTime?: string;
  // workspace所在zoneIdentity列表
  zones?: string[];
  // 工作空间类型
  type?: string;
  static names(): { [key: string]: string } {
    return {
      createTime: 'create_time',
      displayName: 'display_name',
      id: 'id',
      identity: 'identity',
      name: 'name',
      networkType: 'network_type',
      region: 'region',
      regionId: 'region_id',
      tenant: 'tenant',
      updateTime: 'update_time',
      zones: 'zones',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      createTime: 'string',
      displayName: 'string',
      id: 'string',
      identity: 'string',
      name: 'string',
      networkType: 'string',
      region: 'string',
      regionId: 'string',
      tenant: 'string',
      updateTime: 'string',
      zones: { 'type': 'array', 'itemType': 'string' },
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用额外元数据信息
export class AppExtraInfo extends $tea.Model {
  // 应用额外元数据名称
  name?: string;
  // 元数据类型为 TEXT, USER 类型
  type?: string;
  // 元数据值
  value?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      type: 'type',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      type: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合法的运维状态
export class OpsTargetLegalStates extends $tea.Model {
  // 目标类型
  targetType?: string;
  // 合法状态
  states?: string[];
  static names(): { [key: string]: string } {
    return {
      targetType: 'target_type',
      states: 'states',
    };
  }

  static types(): { [key: string]: any } {
    return {
      targetType: 'string',
      states: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// sidecar生效范围详情
export class SidecarScopeDetail extends $tea.Model {
  // sidecar生效范围：workspace、workspace_group、region	
  // 
  scope?: string;
  // scope对应的唯一id，例如workspace对应workspace id	
  // 
  scopeIdentity?: string;
  // scope identity展示名称
  scopeIdentityDisplayName?: string;
  // scope对应的唯一标识符
  scopeIdentityName?: string;
  static names(): { [key: string]: string } {
    return {
      scope: 'scope',
      scopeIdentity: 'scope_identity',
      scopeIdentityDisplayName: 'scope_identity_display_name',
      scopeIdentityName: 'scope_identity_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      scope: 'string',
      scopeIdentity: 'string',
      scopeIdentityDisplayName: 'string',
      scopeIdentityName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 技术栈支持的操作系统
export class BuildpackOS extends $tea.Model {
  // creationTime
  creationTime?: string;
  // 描述
  description?: string;
  // extraInfo
  extraInfo?: string;
  // 全名
  fullName?: string;
  // id
  id?: number;
  // modificationTime
  modificationTime?: string;
  // 名字
  name?: string;
  // 操作系统位数
  osBit?: number;
  // supportedCloudDisplayNames
  supportedCloudDisplayNames?: string[];
  // supportedCloudNames
  supportedCloudNames?: string[];
  // 版本
  version?: string;
  // 操作系统位数，e.g. 32 or 64
  osBitNum?: number;
  static names(): { [key: string]: string } {
    return {
      creationTime: 'creation_time',
      description: 'description',
      extraInfo: 'extra_info',
      fullName: 'full_name',
      id: 'id',
      modificationTime: 'modification_time',
      name: 'name',
      osBit: 'os_bit',
      supportedCloudDisplayNames: 'supported_cloud_display_names',
      supportedCloudNames: 'supported_cloud_names',
      version: 'version',
      osBitNum: 'os_bit_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      creationTime: 'string',
      description: 'string',
      extraInfo: 'string',
      fullName: 'string',
      id: 'number',
      modificationTime: 'string',
      name: 'string',
      osBit: 'number',
      supportedCloudDisplayNames: { 'type': 'array', 'itemType': 'string' },
      supportedCloudNames: { 'type': 'array', 'itemType': 'string' },
      version: 'string',
      osBitNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AppServiceExecutionProgressWithRollbackInfo
export class AppServiceExecutionProgressWithRollbackInfo extends $tea.Model {
  // progress
  progress?: AppServiceExecutionProgress;
  // rollback_progress
  rollbackProgress?: AppServiceExecutionProgress;
  static names(): { [key: string]: string } {
    return {
      progress: 'progress',
      rollbackProgress: 'rollback_progress',
    };
  }

  static types(): { [key: string]: any } {
    return {
      progress: AppServiceExecutionProgress,
      rollbackProgress: AppServiceExecutionProgress,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 工作空间视图
export class WorkspaceView extends $tea.Model {
  // 部署单元列表
  cells?: CellView[];
  // 显示名称
  displayName?: string;
  // table id
  id?: string;
  // 标识
  identity?: string;
  // 网络类型
  networkType?: string;
  // workspace所在region名称
  region?: string;
  static names(): { [key: string]: string } {
    return {
      cells: 'cells',
      displayName: 'display_name',
      id: 'id',
      identity: 'identity',
      networkType: 'network_type',
      region: 'region',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cells: { 'type': 'array', 'itemType': CellView },
      displayName: 'string',
      id: 'string',
      identity: 'string',
      networkType: 'string',
      region: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// sidecar版本模板配置
export class SidecarTemplateConfig extends $tea.Model {
  // 类型：默认、透明劫持
  type?: string;
  // 模板内容
  template?: string;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      template: 'template',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      template: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Cell
export class Cell extends $tea.Model {
  // 部署区域名称
  deploymentZone?: string;
  // 部署单元描述
  description?: string;
  // 部署单元名称
  id?: string;
  // 部署单元所属主可用区ID列表
  masterZone?: string;
  // 部署单元显示名称
  name?: string;
  // 部署单元对应的paas id
  paasId?: string;
  // 部署单元状态
  status?: string;
  // 租户名称
  tenant?: string;
  // 部署单元类型[单元化模式特有]。
  type?: string;
  // 工作空间名称
  workspace?: string;
  // 环境名称
  workspaceGroup?: string;
  // 部署单元所属可用区ID列表
  zones?: string[];
  // displayName
  displayName?: string;
  // appendedZoneIds
  appendedZoneIds?: string[];
  static names(): { [key: string]: string } {
    return {
      deploymentZone: 'deployment_zone',
      description: 'description',
      id: 'id',
      masterZone: 'master_zone',
      name: 'name',
      paasId: 'paas_id',
      status: 'status',
      tenant: 'tenant',
      type: 'type',
      workspace: 'workspace',
      workspaceGroup: 'workspace_group',
      zones: 'zones',
      displayName: 'display_name',
      appendedZoneIds: 'appended_zone_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deploymentZone: 'string',
      description: 'string',
      id: 'string',
      masterZone: 'string',
      name: 'string',
      paasId: 'string',
      status: 'string',
      tenant: 'string',
      type: 'string',
      workspace: 'string',
      workspaceGroup: 'string',
      zones: { 'type': 'array', 'itemType': 'string' },
      displayName: 'string',
      appendedZoneIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用参数配置管理-模板参数定义
export class TemplateParamDef extends $tea.Model {
  // 数据保密级别，L1,L2,L3
  dataLevel?: string;
  // 默认值，表达式解析结果为空时使用
  defaultVal?: string;
  // 是否已删除
  deleted?: boolean;
  // 参数描述
  desc?: string;
  // 参数id
  id?: string;
  // 参数名
  key?: string;
  // 版本
  paramVersion?: number;
  // 参数值类型，CONST/EXPR
  type?: string;
  // 参数值，可能是一个常量或者表达式
  value?: string;
  // 创建时间
  createdTime?: string;
  // 修改时间
  modifiedTime?: string;
  static names(): { [key: string]: string } {
    return {
      dataLevel: 'data_level',
      defaultVal: 'default_val',
      deleted: 'deleted',
      desc: 'desc',
      id: 'id',
      key: 'key',
      paramVersion: 'param_version',
      type: 'type',
      value: 'value',
      createdTime: 'created_time',
      modifiedTime: 'modified_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dataLevel: 'string',
      defaultVal: 'string',
      deleted: 'boolean',
      desc: 'string',
      id: 'string',
      key: 'string',
      paramVersion: 'number',
      type: 'string',
      value: 'string',
      createdTime: 'string',
      modifiedTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 技术栈版本的参数
export class BuildpackParamTemplate extends $tea.Model {
  // 技术栈版本的id
  buildpackId?: string;
  // 技术栈版本参数的默认值
  defaultValue?: string;
  // 技术栈版本参数的描述
  description?: string;
  // id
  id?: string;
  // 技术栈版本参数的key
  key?: string;
  // 该技术栈版本参数是否是只读的
  readonly?: boolean;
  // 该技术栈版本参数是否是必须的
  required?: boolean;
  static names(): { [key: string]: string } {
    return {
      buildpackId: 'buildpack_id',
      defaultValue: 'default_value',
      description: 'description',
      id: 'id',
      key: 'key',
      readonly: 'readonly',
      required: 'required',
    };
  }

  static types(): { [key: string]: any } {
    return {
      buildpackId: 'string',
      defaultValue: 'string',
      description: 'string',
      id: 'string',
      key: 'string',
      readonly: 'boolean',
      required: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 一个部署起来提供服务的应用实例信息
export class AppServiceEntity extends $tea.Model {
  // appId
  appId?: string;
  // appName
  appName?: string;
  // buildpackFullVersion
  buildpackFullVersion?: string;
  // 构建包id
  buildpackId?: string;
  // cellIds
  cellIds?: string[];
  // description
  description?: string;
  // 当前应用服务用到的 ecs 资源列表
  ecsList?: Computer[];
  // extendProperties
  extendProperties?: string;
  // id
  id?: string;
  // isDefault
  isDefault?: boolean;
  // isService
  isService?: boolean;
  // lastDeployStatus
  lastDeployStatus?: string;
  // lastDeployVersion
  lastDeployVersion?: string;
  // lastOpsOrderId
  lastOpsOrderId?: string;
  // name
  name?: string;
  // ownerId
  ownerId?: string;
  // 当前应用服务使用的 rds 资源列表
  rdsList?: DepsDatabase[];
  // 当前应用服务使用的 slb 资源列表
  slbList?: SLBInfo[];
  // techstackId
  techstackId?: number;
  // techstackIdentity
  techstackIdentity?: string;
  // techstackName
  techstackName?: string;
  // 创建时间
  utcCreate?: string;
  // 修改时间
  utcModified?: string;
  // 工作空间显示名称
  workspaceDisplayName?: string;
  // workspaceId
  workspaceId?: string;
  // 工作空间名称
  workspaceName?: string;
  // 负责人登录名称
  ownerLoginName?: string;
  // 负责人显示名称
  ownerDisplayName?: string;
  static names(): { [key: string]: string } {
    return {
      appId: 'app_id',
      appName: 'app_name',
      buildpackFullVersion: 'buildpack_full_version',
      buildpackId: 'buildpack_id',
      cellIds: 'cell_ids',
      description: 'description',
      ecsList: 'ecs_list',
      extendProperties: 'extend_properties',
      id: 'id',
      isDefault: 'is_default',
      isService: 'is_service',
      lastDeployStatus: 'last_deploy_status',
      lastDeployVersion: 'last_deploy_version',
      lastOpsOrderId: 'last_ops_order_id',
      name: 'name',
      ownerId: 'owner_id',
      rdsList: 'rds_list',
      slbList: 'slb_list',
      techstackId: 'techstack_id',
      techstackIdentity: 'techstack_identity',
      techstackName: 'techstack_name',
      utcCreate: 'utc_create',
      utcModified: 'utc_modified',
      workspaceDisplayName: 'workspace_display_name',
      workspaceId: 'workspace_id',
      workspaceName: 'workspace_name',
      ownerLoginName: 'owner_login_name',
      ownerDisplayName: 'owner_display_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appId: 'string',
      appName: 'string',
      buildpackFullVersion: 'string',
      buildpackId: 'string',
      cellIds: { 'type': 'array', 'itemType': 'string' },
      description: 'string',
      ecsList: { 'type': 'array', 'itemType': Computer },
      extendProperties: 'string',
      id: 'string',
      isDefault: 'boolean',
      isService: 'boolean',
      lastDeployStatus: 'string',
      lastDeployVersion: 'string',
      lastOpsOrderId: 'string',
      name: 'string',
      ownerId: 'string',
      rdsList: { 'type': 'array', 'itemType': DepsDatabase },
      slbList: { 'type': 'array', 'itemType': SLBInfo },
      techstackId: 'number',
      techstackIdentity: 'string',
      techstackName: 'string',
      utcCreate: 'string',
      utcModified: 'string',
      workspaceDisplayName: 'string',
      workspaceId: 'string',
      workspaceName: 'string',
      ownerLoginName: 'string',
      ownerDisplayName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 技术栈信息
export class Techstack extends $tea.Model {
  // 描述信息
  description?: string;
  // extraInfo
  extraInfo?: string;
  // 技术栈ID
  id?: string;
  // 标识符
  identity?: string;
  // 名称
  name?: string;
  // 作用域
  scope?: string;
  // 技术栈状态
  status?: string;
  static names(): { [key: string]: string } {
    return {
      description: 'description',
      extraInfo: 'extra_info',
      id: 'id',
      identity: 'identity',
      name: 'name',
      scope: 'scope',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      description: 'string',
      extraInfo: 'string',
      id: 'string',
      identity: 'string',
      name: 'string',
      scope: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ConnectionStub
export class ConnectionStub extends $tea.Model {
  // id
  id?: number;
  // cloud
  cloud?: Cloud;
  // StubType
  type?: string;
  // tenantName
  tenantName?: string;
  // tenantId
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      cloud: 'cloud',
      type: 'type',
      tenantName: 'tenant_name',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      cloud: Cloud,
      type: 'string',
      tenantName: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 一个运维操作单元。
export class OpsUnit extends $tea.Model {
  // 单元所属部署区
  cell?: string;
  // 包含在此单元中进行运维操作的计算容器列表
  computers?: OpsComputer[];
  // 单元所属地域
  region?: string;
  // 单元所属可用区
  zone?: string;
  static names(): { [key: string]: string } {
    return {
      cell: 'cell',
      computers: 'computers',
      region: 'region',
      zone: 'zone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cell: 'string',
      computers: { 'type': 'array', 'itemType': OpsComputer },
      region: 'string',
      zone: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用管理-当前应用的依赖关系
export class AppDepend extends $tea.Model {
  // 当前应用名称
  appName?: string;
  // 该应用依赖的所有应用的 id 列表字符串
  dependAppNames?: string;
  // 应用显示名称
  appDisplayName?: string;
  static names(): { [key: string]: string } {
    return {
      appName: 'app_name',
      dependAppNames: 'depend_app_names',
      appDisplayName: 'app_display_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appName: 'string',
      dependAppNames: 'string',
      appDisplayName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 一个技术栈版本的基本信息
export class Buildpack extends $tea.Model {
  // 可以使用该技术栈版本的租户名称
  availableTenantNames?: string[];
  // 技术栈版本的编译打包命令
  buildCommand?: string;
  // 分享给其他租户时留下的联系信息
  contactInfo?: string;
  // 当前技术栈版本是否是debug模式
  debugMode?: boolean;
  // 废弃技术栈版本的原因
  depracationNote?: string;
  // 描述
  description?: string;
  // 技术栈的版本号
  fullVersion?: string;
  // 技术栈版本ID
  id?: string;
  // 行业标志,I(金区)或者N(非金区)
  industryLabel?: string;
  // 主要版本号
  majorVersion?: number;
  // 次要版本号
  minorVersion?: number;
  // 补丁版本号
  patchVersion?: number;
  // 发布时间
  publicationTime?: string;
  // 技术栈版本是系统系统的还是用户自定义的
  scope?: string;
  // 技术栈版本的状态
  status?: string;
  static names(): { [key: string]: string } {
    return {
      availableTenantNames: 'available_tenant_names',
      buildCommand: 'build_command',
      contactInfo: 'contact_info',
      debugMode: 'debug_mode',
      depracationNote: 'depracation_note',
      description: 'description',
      fullVersion: 'full_version',
      id: 'id',
      industryLabel: 'industry_label',
      majorVersion: 'major_version',
      minorVersion: 'minor_version',
      patchVersion: 'patch_version',
      publicationTime: 'publication_time',
      scope: 'scope',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      availableTenantNames: { 'type': 'array', 'itemType': 'string' },
      buildCommand: 'string',
      contactInfo: 'string',
      debugMode: 'boolean',
      depracationNote: 'string',
      description: 'string',
      fullVersion: 'string',
      id: 'string',
      industryLabel: 'string',
      majorVersion: 'number',
      minorVersion: 'number',
      patchVersion: 'number',
      publicationTime: 'string',
      scope: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// TechstackBuildpackCount
export class TechstackBuildpackCount extends $tea.Model {
  // buildpackCount
  buildpackCount?: number;
  // creation_time
  creationTime?: string;
  // description
  description?: string;
  // extra_info
  extraInfo?: string;
  // id
  id?: string;
  // identity
  identity?: string;
  // modification_time
  modificationTime?: string;
  // name
  name?: string;
  // scope
  scope?: string;
  // status
  status?: string;
  static names(): { [key: string]: string } {
    return {
      buildpackCount: 'buildpack_count',
      creationTime: 'creation_time',
      description: 'description',
      extraInfo: 'extra_info',
      id: 'id',
      identity: 'identity',
      modificationTime: 'modification_time',
      name: 'name',
      scope: 'scope',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      buildpackCount: 'number',
      creationTime: 'string',
      description: 'string',
      extraInfo: 'string',
      id: 'string',
      identity: 'string',
      modificationTime: 'string',
      name: 'string',
      scope: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ServiceInfoGroupCollection
export class ServiceInfoGroupCollection extends $tea.Model {
  // service info groups
  serviceInfoGroups?: ServiceInfoGroup;
  static names(): { [key: string]: string } {
    return {
      serviceInfoGroups: 'service_info_groups',
    };
  }

  static types(): { [key: string]: any } {
    return {
      serviceInfoGroups: ServiceInfoGroup,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// NotificationConfig
export class NotificationConfig extends $tea.Model {
  // 接收人列表
  receivers?: NotificationReceiver[];
  // 类型
  notificationType?: string;
  // 是否开启，默认不开启
  enabled?: boolean;
  // cloud_web_url
  cloudWebUrl?: string;
  // id
  id?: string;
  static names(): { [key: string]: string } {
    return {
      receivers: 'receivers',
      notificationType: 'notification_type',
      enabled: 'enabled',
      cloudWebUrl: 'cloud_web_url',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      receivers: { 'type': 'array', 'itemType': NotificationReceiver },
      notificationType: 'string',
      enabled: 'boolean',
      cloudWebUrl: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分页查询
export class PaginationQuery extends $tea.Model {
  // 当前页码
  currentPage?: number;
  // 分页大小
  pageSize?: number;
  // 模糊搜索
  fuzzyName?: string;
  static names(): { [key: string]: string } {
    return {
      currentPage: 'current_page',
      pageSize: 'page_size',
      fuzzyName: 'fuzzy_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      currentPage: 'number',
      pageSize: 'number',
      fuzzyName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AppTechstackRelation
export class AppTechstackRelation extends $tea.Model {
  // appId
  appId?: string;
  // buildpackArch
  buildpackArch?: string;
  // creationTime
  creationTime?: string;
  // extraInfo
  extraInfo?: string;
  // id
  id?: string;
  // modificationTime
  modificationTime?: string;
  // techstackId
  techstackId?: number;
  // techstackIdentity
  techstackIdentity?: string;
  // techstackName
  techstackName?: string;
  static names(): { [key: string]: string } {
    return {
      appId: 'app_id',
      buildpackArch: 'buildpack_arch',
      creationTime: 'creation_time',
      extraInfo: 'extra_info',
      id: 'id',
      modificationTime: 'modification_time',
      techstackId: 'techstack_id',
      techstackIdentity: 'techstack_identity',
      techstackName: 'techstack_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appId: 'string',
      buildpackArch: 'string',
      creationTime: 'string',
      extraInfo: 'string',
      id: 'string',
      modificationTime: 'string',
      techstackId: 'number',
      techstackIdentity: 'string',
      techstackName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// <String, Boolean> 映射
export class MapStringToBooleanEntity extends $tea.Model {
  // key
  key?: string;
  // value
  value?: boolean;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 蓝绿发布概览
export class BGReleaseArrangement extends $tea.Model {
  // 活跃单元 ID
  activeUnitId?: string;
  // 非活跃单元 ID
  deactivatedUnitId?: string;
  // 灰度进程ID
  grayTrafficProcessId?: string;
  // 回滚进程ID
  rollbackProcessId?: string;
  // 发布应用信息集合
  serviceInfoCollection?: ServiceInfo[];
  // 类型
  stepType?: string;
  // 单元类型
  unitType?: string;
  // 名称
  name?: string;
  // 类型
  arrangementType?: string;
  // 环境变量
  envConfig?: Pair[];
  // 合法状态列表
  targetsLegalStates?: OpsTargetLegalStates[];
  // 运维进程ID
  processDefinitionId?: string;
  // 父运维进程ID
  parentId?: string;
  // 父进程类型
  parentEntityType?: string;
  // 支持的转换类型
  supportedTransitions?: string[];
  // 流程节点 ID
  nodeId?: string;
  // 状态
  state?: string;
  // 开始时间
  startedTime?: string;
  // 结束时间
  finishedTime?: string;
  // 是否可以独立运行
  standaloneExecutable?: boolean;
  // ID
  id?: string;
  static names(): { [key: string]: string } {
    return {
      activeUnitId: 'active_unit_id',
      deactivatedUnitId: 'deactivated_unit_id',
      grayTrafficProcessId: 'gray_traffic_process_id',
      rollbackProcessId: 'rollback_process_id',
      serviceInfoCollection: 'service_info_collection',
      stepType: 'step_type',
      unitType: 'unit_type',
      name: 'name',
      arrangementType: 'arrangement_type',
      envConfig: 'env_config',
      targetsLegalStates: 'targets_legal_states',
      processDefinitionId: 'process_definition_id',
      parentId: 'parent_id',
      parentEntityType: 'parent_entity_type',
      supportedTransitions: 'supported_transitions',
      nodeId: 'node_id',
      state: 'state',
      startedTime: 'started_time',
      finishedTime: 'finished_time',
      standaloneExecutable: 'standalone_executable',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      activeUnitId: 'string',
      deactivatedUnitId: 'string',
      grayTrafficProcessId: 'string',
      rollbackProcessId: 'string',
      serviceInfoCollection: { 'type': 'array', 'itemType': ServiceInfo },
      stepType: 'string',
      unitType: 'string',
      name: 'string',
      arrangementType: 'string',
      envConfig: { 'type': 'array', 'itemType': Pair },
      targetsLegalStates: { 'type': 'array', 'itemType': OpsTargetLegalStates },
      processDefinitionId: 'string',
      parentId: 'string',
      parentEntityType: 'string',
      supportedTransitions: { 'type': 'array', 'itemType': 'string' },
      nodeId: 'string',
      state: 'string',
      startedTime: 'string',
      finishedTime: 'string',
      standaloneExecutable: 'boolean',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用sidecar基线配置
export class AppBaselineSidecarConfig extends $tea.Model {
  // 应用名
  appName?: string;
  // sidecar类型
  category?: string;
  // 应用基线适用条件，金融云环境仅能指定workspaceGroups属性，并且只能指定一个workspaceGroup
  conditions?: SidecarCondition[];
  // 是否开启sidecar
  enable?: boolean;
  // sidecar版本号，金融云环境必填
  sidecarVersion?: string;
  // 应用基线id
  id?: string;
  static names(): { [key: string]: string } {
    return {
      appName: 'app_name',
      category: 'category',
      conditions: 'conditions',
      enable: 'enable',
      sidecarVersion: 'sidecar_version',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appName: 'string',
      category: 'string',
      conditions: { 'type': 'array', 'itemType': SidecarCondition },
      enable: 'boolean',
      sidecarVersion: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// StateCount
export class StateCount extends $tea.Model {
  // state
  state?: string;
  // count
  count?: number;
  static names(): { [key: string]: string } {
    return {
      state: 'state',
      count: 'count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      state: 'string',
      count: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 错误原因
export class Reason extends $tea.Model {
  // content
  content?: string;
  // visible
  visible?: boolean;
  // code
  code?: string;
  // placeholder
  placeholder?: string;
  // params
  params?: string[];
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      visible: 'visible',
      code: 'code',
      placeholder: 'placeholder',
      params: 'params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: 'string',
      visible: 'boolean',
      code: 'string',
      placeholder: 'string',
      params: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// BuildpackCompositeVO
export class BuildpackCompositeVO extends $tea.Model {
  // app_service_count
  appServiceCount?: number;
  // creator
  creator?: UserDTO;
  // origin_type
  originType?: string;
  // publisher
  publisher?: UserDTO;
  // supported_o_s
  supportedOS?: BuildpackOS[];
  // supported_regions
  supportedRegions?: BuildpackRegionRelationDetail[];
  // techstack
  techstack?: Techstack;
  // id
  id?: string;
  // description
  description?: string;
  // fullVersion
  fullVersion?: string;
  static names(): { [key: string]: string } {
    return {
      appServiceCount: 'app_service_count',
      creator: 'creator',
      originType: 'origin_type',
      publisher: 'publisher',
      supportedOS: 'supported_o_s',
      supportedRegions: 'supported_regions',
      techstack: 'techstack',
      id: 'id',
      description: 'description',
      fullVersion: 'full_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appServiceCount: 'number',
      creator: UserDTO,
      originType: 'string',
      publisher: UserDTO,
      supportedOS: { 'type': 'array', 'itemType': BuildpackOS },
      supportedRegions: { 'type': 'array', 'itemType': BuildpackRegionRelationDetail },
      techstack: Techstack,
      id: 'string',
      description: 'string',
      fullVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用分组。
export class AppGroup extends $tea.Model {
  // 应用依赖规划
  appScheme?: AppDepend[];
  // 应用分组描述
  description?: string;
  // 应用分组ID
  id?: string;
  // 应用分组名称
  name?: string;
  // 应用分组负责人登录名
  ownerLoginName?: string;
  // 父应用分组ID
  parentId?: string;
  // 应用分组层级，从1开始，1代表一级分组，2代表二级分组
  layer?: number;
  static names(): { [key: string]: string } {
    return {
      appScheme: 'app_scheme',
      description: 'description',
      id: 'id',
      name: 'name',
      ownerLoginName: 'owner_login_name',
      parentId: 'parent_id',
      layer: 'layer',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appScheme: { 'type': 'array', 'itemType': AppDepend },
      description: 'string',
      id: 'string',
      name: 'string',
      ownerLoginName: 'string',
      parentId: 'string',
      layer: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发生增量变动的workspace信息
export class WorkspaceDeltaInfo extends $tea.Model {
  // 租户名
  tenant?: string;
  // 环境名
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      tenant: 'tenant',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tenant: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 技术栈的详细信息，包括关联信息
export class BuildpackDetail extends $tea.Model {
  // 使用该技术栈版本的appservice的数量
  appServiceCount?: number;
  // 可以使用该技术栈版本的租户ID
  availableTenantNames?: string[];
  // buildCommand
  buildCommand?: string;
  // 分享给其他租户留下的联系信息
  contactInfo?: string;
  // createdFrom
  createdFrom?: string;
  // creationChain
  creationChain?: string[];
  // creationTime
  creationTime?: string;
  // 当前技术栈版本是否是debug模式
  debugMode?: boolean;
  // 废弃技术栈版本的原因
  depracationNote?: string;
  // 描述
  description?: string;
  // extraInfo
  extraInfo?: string;
  // 技术栈版本号
  fullVersion?: string;
  // 技术栈版本ID
  id?: string;
  // 行业标志,I(金区)或者N(非金区)
  industryLabel?: string;
  // 主要版本号
  majorVersion?: number;
  // 次要版本号
  minorVersion?: number;
  // modificationTime
  modificationTime?: string;
  // 原始类型
  originType?: string;
  // 补丁版本号
  patchVersion?: number;
  // 发布时间
  publicationTime?: string;
  // 发布时间，日期格式
  publicationTimeDate?: string;
  // 技术栈版本提供方所在域
  scope?: string;
  // 技术栈版本的状态
  status?: string;
  // 支持的操作系统列表
  supportedOs?: BuildpackOS[];
  // 支持的地域ID列表
  supportedRegions?: string[];
  // 支持的地域列表
  supportedRegionsList?: BuildpackRegionRelationDetail[];
  // techstack
  techstack?: Techstack;
  // 关联的 Techstack ID
  techstackId?: number;
  // tenantId
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      appServiceCount: 'app_service_count',
      availableTenantNames: 'available_tenant_names',
      buildCommand: 'build_command',
      contactInfo: 'contact_info',
      createdFrom: 'created_from',
      creationChain: 'creation_chain',
      creationTime: 'creation_time',
      debugMode: 'debug_mode',
      depracationNote: 'depracation_note',
      description: 'description',
      extraInfo: 'extra_info',
      fullVersion: 'full_version',
      id: 'id',
      industryLabel: 'industry_label',
      majorVersion: 'major_version',
      minorVersion: 'minor_version',
      modificationTime: 'modification_time',
      originType: 'origin_type',
      patchVersion: 'patch_version',
      publicationTime: 'publication_time',
      publicationTimeDate: 'publication_time_date',
      scope: 'scope',
      status: 'status',
      supportedOs: 'supported_os',
      supportedRegions: 'supported_regions',
      supportedRegionsList: 'supported_regions_list',
      techstack: 'techstack',
      techstackId: 'techstack_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appServiceCount: 'number',
      availableTenantNames: { 'type': 'array', 'itemType': 'string' },
      buildCommand: 'string',
      contactInfo: 'string',
      createdFrom: 'string',
      creationChain: { 'type': 'array', 'itemType': 'string' },
      creationTime: 'string',
      debugMode: 'boolean',
      depracationNote: 'string',
      description: 'string',
      extraInfo: 'string',
      fullVersion: 'string',
      id: 'string',
      industryLabel: 'string',
      majorVersion: 'number',
      minorVersion: 'number',
      modificationTime: 'string',
      originType: 'string',
      patchVersion: 'number',
      publicationTime: 'string',
      publicationTimeDate: 'string',
      scope: 'string',
      status: 'string',
      supportedOs: { 'type': 'array', 'itemType': BuildpackOS },
      supportedRegions: { 'type': 'array', 'itemType': 'string' },
      supportedRegionsList: { 'type': 'array', 'itemType': BuildpackRegionRelationDetail },
      techstack: Techstack,
      techstackId: 'number',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用参数配置管理-应用参数模板
export class AppConfigTemplate extends $tea.Model {
  // 应用名称
  appName?: string;
  // 描述
  comment?: string;
  // 应用参数模板 id
  id?: string;
  // 操作人 id
  operatorId?: string;
  // 参数定义列表
  params?: TemplateParamDef[];
  // 参数模板发布时间
  releaseTime?: string;
  // 模板状态，DRAFT 草稿，RELEASE 已发布，发布后才会生成 version，否则为空
  state?: string;
  // 租户 id
  tenantId?: string;
  // 模板版本
  tplVersion?: string;
  // 创建时间
  createdTime?: string;
  // 修改时间
  modifiedTime?: string;
  static names(): { [key: string]: string } {
    return {
      appName: 'app_name',
      comment: 'comment',
      id: 'id',
      operatorId: 'operator_id',
      params: 'params',
      releaseTime: 'release_time',
      state: 'state',
      tenantId: 'tenant_id',
      tplVersion: 'tpl_version',
      createdTime: 'created_time',
      modifiedTime: 'modified_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appName: 'string',
      comment: 'string',
      id: 'string',
      operatorId: 'string',
      params: { 'type': 'array', 'itemType': TemplateParamDef },
      releaseTime: 'string',
      state: 'string',
      tenantId: 'string',
      tplVersion: 'string',
      createdTime: 'string',
      modifiedTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AggregateExecutableProgress
export class AggregateExecutableProgress extends $tea.Model {
  // base_progress
  baseProgress?: ResourceGroupExecutionProgress;
  // bg_release_progresses
  bgReleaseProgresses?: BGReleaseExecutionProgress[];
  // app_service_progresses
  appServiceProgresses?: AppServiceExecutionProgressWithRollbackInfo[];
  // common_progresses
  commonProgresses?: ResourceGroupExecutionProgress[];
  static names(): { [key: string]: string } {
    return {
      baseProgress: 'base_progress',
      bgReleaseProgresses: 'bg_release_progresses',
      appServiceProgresses: 'app_service_progresses',
      commonProgresses: 'common_progresses',
    };
  }

  static types(): { [key: string]: any } {
    return {
      baseProgress: ResourceGroupExecutionProgress,
      bgReleaseProgresses: { 'type': 'array', 'itemType': BGReleaseExecutionProgress },
      appServiceProgresses: { 'type': 'array', 'itemType': AppServiceExecutionProgressWithRollbackInfo },
      commonProgresses: { 'type': 'array', 'itemType': ResourceGroupExecutionProgress },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Connection
export class Connection extends $tea.Model {
  // id
  id?: number;
  // tenantId
  tenantId?: string;
  // identity
  identity?: string;
  // name
  name?: string;
  // plug
  plug?: ConnectionStub;
  // socket
  socket?: ConnectionStub;
  // accessKey
  accessKey?: string;
  // accessSecret
  accessSecret?: string;
  // 创建时间
  createdTime?: string;
  // 修改时间
  modifiedTime?: string;
  // executor
  executor?: string;
  // status
  status?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      tenantId: 'tenant_id',
      identity: 'identity',
      name: 'name',
      plug: 'plug',
      socket: 'socket',
      accessKey: 'access_key',
      accessSecret: 'access_secret',
      createdTime: 'created_time',
      modifiedTime: 'modified_time',
      executor: 'executor',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      tenantId: 'string',
      identity: 'string',
      name: 'string',
      plug: ConnectionStub,
      socket: ConnectionStub,
      accessKey: 'string',
      accessSecret: 'string',
      createdTime: 'string',
      modifiedTime: 'string',
      executor: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 部署可用区
export class DeploymentZone extends $tea.Model {
  // id
  id?: string;
  // 名称
  name?: string;
  // 显示名
  displayName?: string;
  // 描述
  description?: string;
  // 环境 id
  workspaceId?: string;
  // 工作空间组 id
  workspaceGroupId?: string;
  // 状态
  status?: string;
  // 主可用区 ID
  masterZoneId?: string;
  // 附属可用区 ID
  appendedZoneIds?: string[];
  // 包含部署单元
  cells?: Cell[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      displayName: 'display_name',
      description: 'description',
      workspaceId: 'workspace_id',
      workspaceGroupId: 'workspace_group_id',
      status: 'status',
      masterZoneId: 'master_zone_id',
      appendedZoneIds: 'appended_zone_ids',
      cells: 'cells',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      displayName: 'string',
      description: 'string',
      workspaceId: 'string',
      workspaceGroupId: 'string',
      status: 'string',
      masterZoneId: 'string',
      appendedZoneIds: { 'type': 'array', 'itemType': 'string' },
      cells: { 'type': 'array', 'itemType': Cell },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用管理-应用代码库信息
export class Repository extends $tea.Model {
  // 代码库名字
  name?: string;
  // 代码库类型，svn或者git
  type?: string;
  // 代码库地址
  url?: string;
  // 代码库负责人登录名称
  ownerLoginName?: string;
  // 代码库负责人显示名称
  ownerDisplayName?: string;
  // 创建时间
  createdTime?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      type: 'type',
      url: 'url',
      ownerLoginName: 'owner_login_name',
      ownerDisplayName: 'owner_display_name',
      createdTime: 'created_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      type: 'string',
      url: 'string',
      ownerLoginName: 'string',
      ownerDisplayName: 'string',
      createdTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// sidecar信息
// 
export class Sidecar extends $tea.Model {
  // sidecar描述内容
  description?: string;
  // 创建时间
  gmtCreated?: string;
  // 修改时间
  gmtModified?: string;
  // sidecar名称
  sidecarName?: string;
  // scope生效范围详情
  scopeDetail?: SidecarScopeDetail;
  static names(): { [key: string]: string } {
    return {
      description: 'description',
      gmtCreated: 'gmt_created',
      gmtModified: 'gmt_modified',
      sidecarName: 'sidecar_name',
      scopeDetail: 'scope_detail',
    };
  }

  static types(): { [key: string]: any } {
    return {
      description: 'string',
      gmtCreated: 'string',
      gmtModified: 'string',
      sidecarName: 'string',
      scopeDetail: SidecarScopeDetail,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 执行进度
export class ExecutorProgress extends $tea.Model {
  // 请求 ID
  requestId?: string;
  // 请求 ID 列表
  requestIds?: string[];
  // 状态
  status?: string;
  // 错误信息
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      requestId: 'request_id',
      requestIds: 'request_ids',
      status: 'status',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
      requestIds: { 'type': 'array', 'itemType': 'string' },
      status: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// BuildpackDetailVO
export class BuildpackDetailVO extends $tea.Model {
  // appServiceCount
  appServiceCount?: number;
  // availableTenantNames
  availableTenantNames?: string[];
  // buildpack_params
  buildpackParams?: BuildpackParamTemplate[];
  // buildCommand
  buildCommand?: string;
  // build_commandp_params
  buildCommandParams?: BuildCommandParams[];
  // contactInfo
  contactInfo?: string;
  // createdFrom
  createdFrom?: string;
  // creationChain
  creationChain?: string[];
  // creationTime
  creationTime?: string;
  // creator
  creator?: UserDTO;
  // debugMode
  debugMode?: boolean;
  // depracationNote
  depracationNote?: string;
  // description
  description?: string;
  // extraInfo
  extraInfo?: string;
  // fullVersion
  fullVersion?: string;
  // id
  id?: string;
  // industryLabel
  industryLabel?: string;
  // majorVersion
  majorVersion?: number;
  // minorVersion
  minorVersion?: number;
  // modificationTime
  modificationTime?: string;
  // originType
  originType?: string;
  // patchVersion
  patchVersion?: number;
  // publicationTime
  publicationTime?: string;
  // publisher
  publisher?: UserDTO;
  // scope
  scope?: string;
  // status
  status?: string;
  // storageUploadEndpoints
  storageUploadEndpoints?: UploadEndpoint[];
  // supportedOS
  supportedOS?: BuildpackOS[];
  // supportedRegions
  supportedRegions?: BuildpackRegionRelationDetail[];
  // techstack
  techstack?: Techstack;
  // tenantId
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      appServiceCount: 'app_service_count',
      availableTenantNames: 'available_tenant_names',
      buildpackParams: 'buildpack_params',
      buildCommand: 'build_command',
      buildCommandParams: 'build_command_params',
      contactInfo: 'contact_info',
      createdFrom: 'created_from',
      creationChain: 'creation_chain',
      creationTime: 'creation_time',
      creator: 'creator',
      debugMode: 'debug_mode',
      depracationNote: 'depracation_note',
      description: 'description',
      extraInfo: 'extra_info',
      fullVersion: 'full_version',
      id: 'id',
      industryLabel: 'industry_label',
      majorVersion: 'major_version',
      minorVersion: 'minor_version',
      modificationTime: 'modification_time',
      originType: 'origin_type',
      patchVersion: 'patch_version',
      publicationTime: 'publication_time',
      publisher: 'publisher',
      scope: 'scope',
      status: 'status',
      storageUploadEndpoints: 'storage_upload_endpoints',
      supportedOS: 'supported_o_s',
      supportedRegions: 'supported_regions',
      techstack: 'techstack',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appServiceCount: 'number',
      availableTenantNames: { 'type': 'array', 'itemType': 'string' },
      buildpackParams: { 'type': 'array', 'itemType': BuildpackParamTemplate },
      buildCommand: 'string',
      buildCommandParams: { 'type': 'array', 'itemType': BuildCommandParams },
      contactInfo: 'string',
      createdFrom: 'string',
      creationChain: { 'type': 'array', 'itemType': 'string' },
      creationTime: 'string',
      creator: UserDTO,
      debugMode: 'boolean',
      depracationNote: 'string',
      description: 'string',
      extraInfo: 'string',
      fullVersion: 'string',
      id: 'string',
      industryLabel: 'string',
      majorVersion: 'number',
      minorVersion: 'number',
      modificationTime: 'string',
      originType: 'string',
      patchVersion: 'number',
      publicationTime: 'string',
      publisher: UserDTO,
      scope: 'string',
      status: 'string',
      storageUploadEndpoints: { 'type': 'array', 'itemType': UploadEndpoint },
      supportedOS: { 'type': 'array', 'itemType': BuildpackOS },
      supportedRegions: { 'type': 'array', 'itemType': BuildpackRegionRelationDetail },
      techstack: Techstack,
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用信息
export class Application extends $tea.Model {
  // 应用部署时依赖的应用名称，只允许取此次调用参数中列出的应用。不允许形成循环依赖。
  depends?: string[];
  // 执行部署操作的目标应用名称，应用名称最大60个UTF-8字符
  name?: string;
  // 执行部署操作的目标应用服务名称，应用服务名称最大60个UTF-8字符
  serviceName?: string;
  // 执行部署操作的目标应用版本。如果某个应用未指定版本，则使用最新版本部署。
  version?: string;
  // 自定义参数 jsonStr Map<String,List<String>>
  customParamsMap?: string;
  static names(): { [key: string]: string } {
    return {
      depends: 'depends',
      name: 'name',
      serviceName: 'service_name',
      version: 'version',
      customParamsMap: 'custom_params_map',
    };
  }

  static types(): { [key: string]: any } {
    return {
      depends: { 'type': 'array', 'itemType': 'string' },
      name: 'string',
      serviceName: 'string',
      version: 'string',
      customParamsMap: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// OpsTaskExecutionDetail
export class OpsTaskExecutionDetail extends $tea.Model {
  // task_id
  taskId?: string;
  // request_token
  requestToken?: string;
  // node_id
  nodeId?: string;
  // request_id
  requestId?: string;
  // execution_count
  executionCount?: number;
  // executionState
  executionState?: string;
  // target_id
  targetId?: string;
  // error_code
  errorCode?: string;
  // result_msg
  resultMsg?: string;
  // startedTime
  startedTime?: string;
  // finished_time
  finishedTime?: string;
  // standalone_executable
  standaloneExecutable?: boolean;
  // id
  id?: string;
  static names(): { [key: string]: string } {
    return {
      taskId: 'task_id',
      requestToken: 'request_token',
      nodeId: 'node_id',
      requestId: 'request_id',
      executionCount: 'execution_count',
      executionState: 'execution_state',
      targetId: 'target_id',
      errorCode: 'error_code',
      resultMsg: 'result_msg',
      startedTime: 'started_time',
      finishedTime: 'finished_time',
      standaloneExecutable: 'standalone_executable',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      taskId: 'string',
      requestToken: 'string',
      nodeId: 'string',
      requestId: 'string',
      executionCount: 'number',
      executionState: 'string',
      targetId: 'string',
      errorCode: 'string',
      resultMsg: 'string',
      startedTime: 'string',
      finishedTime: 'string',
      standaloneExecutable: 'boolean',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 一条指令执行的结果。
export class CmdExecResult extends $tea.Model {
  // 错误信息。内容为指令无法下发到机器上的详细原因
  errMsg?: string;
  // 执行结束时间
  finishTime?: number;
  // 执行的结果
  results?: SingleExecResult[];
  // 执行开始时间
  startTime?: number;
  // 执行结果状态。取值列表：
  //                     EXECUTING：执行中；
  //                     SUCCESS：执行成功；
  //                     FAILED：执行失败；
  //                     IGNORED：已忽略；
  //                     TIME_OUT：已超时
  //                 
  status?: string;
  static names(): { [key: string]: string } {
    return {
      errMsg: 'err_msg',
      finishTime: 'finish_time',
      results: 'results',
      startTime: 'start_time',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      errMsg: 'string',
      finishTime: 'number',
      results: { 'type': 'array', 'itemType': SingleExecResult },
      startTime: 'number',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// SLB 挂载信息
export class SLBMountInfo extends $tea.Model {
  // iaas id
  iaasId?: string;
  // slb id
  id?: string;
  // SLB 名
  name?: string;
  // vip 地址
  vipAddresses?: string[];
  // 挂载权重
  mountWeights?: MountWeight[];
  // 虚拟服务器组挂载信息
  vServerGroupMountInfoList?: VServerGroupMountInfo[];
  static names(): { [key: string]: string } {
    return {
      iaasId: 'iaas_id',
      id: 'id',
      name: 'name',
      vipAddresses: 'vip_addresses',
      mountWeights: 'mount_weights',
      vServerGroupMountInfoList: 'v_server_group_mount_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      iaasId: 'string',
      id: 'string',
      name: 'string',
      vipAddresses: { 'type': 'array', 'itemType': 'string' },
      mountWeights: { 'type': 'array', 'itemType': MountWeight },
      vServerGroupMountInfoList: { 'type': 'array', 'itemType': VServerGroupMountInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// BuildpackParam
export class BuildpackParam extends $tea.Model {
  // default_value
  defaultValue?: string;
  // key
  key?: string;
  // readonly
  readonly?: boolean;
  // required
  required?: boolean;
  // description
  description?: string;
  static names(): { [key: string]: string } {
    return {
      defaultValue: 'default_value',
      key: 'key',
      readonly: 'readonly',
      required: 'required',
      description: 'description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      defaultValue: 'string',
      key: 'string',
      readonly: 'boolean',
      required: 'boolean',
      description: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用管理-应用服务计数
export class AppServiceCount extends $tea.Model {
  // 经典容器服务数量
  classicCount?: number;
  // 容器应用服务数量
  containerCount?: number;
  // 无服务器应用服务数
  serverlessCount?: number;
  static names(): { [key: string]: string } {
    return {
      classicCount: 'classic_count',
      containerCount: 'container_count',
      serverlessCount: 'serverless_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      classicCount: 'number',
      containerCount: 'number',
      serverlessCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// DepracationNotePayload
export class DepracationNotePayload extends $tea.Model {
  // depracationNote
  depracationNote?: string;
  static names(): { [key: string]: string } {
    return {
      depracationNote: 'depracation_note',
    };
  }

  static types(): { [key: string]: any } {
    return {
      depracationNote: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用版本构建和发布包信息
export class AppVersion extends $tea.Model {
  // 所属应用id `内部id对用户无用，不应返回，应使用应用名称`
  appId?: string;
  // 从源代码构建时标识代码分支，上传新版本时为空 `混淆了应用版本和编译任务；目前没必要返回`
  branch?: string;
  // 应用发布包构建类型:**scm**(源代码构建)，**upload_file**(发布包上传包括本地上传和从某个文件交换源上传) `混淆了应用版本和编译任务；目前没必要返回`
  //                 
  buildType?: string;
  // 从源代码构建时标识代码版本，上传新版本时为空 `混淆了应用版本和编译任务；目前没必要返回`
  codeVersion?: string;
  // 版本描述
  description?: string;
  // 新版本构建的错误码，成功则为空 `混淆了应用版本和编译任务`
  errorCode?: string;
  // 新版本构建的错误提示信息，成功则为空 `混淆了应用版本和编译任务`
  errorMsg?: string;
  // 构建成功后标识应用发布包的md5
  etag?: string;
  // 应用版本id `内部id对用户无用，不应返回`
  id?: string;
  // 应用构建状态:**doing**(进行中),**success**(成功),**failed**(失败)
  status?: string;
  // 本次应用发布包构建后台任务的id `混淆了应用版本和构建任务，应使用2个不同的模型`
  taskId?: string;
  // 创建时间 `命名建议为create_time`
  utcCreate?: string;
  // 应用版本号
  version?: string;
  // 所属工作空间 `内部id对用户无用，不应返回，应使用workspace unique名称`
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      appId: 'app_id',
      branch: 'branch',
      buildType: 'build_type',
      codeVersion: 'code_version',
      description: 'description',
      errorCode: 'error_code',
      errorMsg: 'error_msg',
      etag: 'etag',
      id: 'id',
      status: 'status',
      taskId: 'task_id',
      utcCreate: 'utc_create',
      version: 'version',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appId: 'string',
      branch: 'string',
      buildType: 'string',
      codeVersion: 'string',
      description: 'string',
      errorCode: 'string',
      errorMsg: 'string',
      etag: 'string',
      id: 'string',
      status: 'string',
      taskId: 'string',
      utcCreate: 'string',
      version: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 一个执行的指令。
export class OpsCmd extends $tea.Model {
  // 执行指令的参数列表
  args?: OpsCmdArg[];
  // 失败重试的间隔，单位为秒
  retryInterval?: number;
  // 失败重试次数
  retryTimes?: number;
  // 指令模板ID
  templateId?: string;
  // 单次执行的超时时间，单位为秒
  timeOut?: number;
  static names(): { [key: string]: string } {
    return {
      args: 'args',
      retryInterval: 'retry_interval',
      retryTimes: 'retry_times',
      templateId: 'template_id',
      timeOut: 'time_out',
    };
  }

  static types(): { [key: string]: any } {
    return {
      args: { 'type': 'array', 'itemType': OpsCmdArg },
      retryInterval: 'number',
      retryTimes: 'number',
      templateId: 'string',
      timeOut: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// OpsTask
export class OpsTask extends $tea.Model {
  // parent_group_id
  parentGroupId?: string;
  // service_id
  serviceId?: string;
  // arrangement_id
  arrangementId?: string;
  // action_handler_code
  actionHandlerCode?: string;
  // max_retry_attempts
  maxRetryAttempts?: number;
  // context
  context?: Pair[];
  // process_definition_id
  processDefinitionId?: string;
  // parent_id
  parentId?: string;
  // parent_entity_type
  parentEntityType?: string;
  // state
  state?: string;
  // started_time
  startedTime?: string;
  // finished_time
  finishedTime?: string;
  // standalone_executable
  standaloneExecutable?: boolean;
  // id
  id?: string;
  static names(): { [key: string]: string } {
    return {
      parentGroupId: 'parent_group_id',
      serviceId: 'service_id',
      arrangementId: 'arrangement_id',
      actionHandlerCode: 'action_handler_code',
      maxRetryAttempts: 'max_retry_attempts',
      context: 'context',
      processDefinitionId: 'process_definition_id',
      parentId: 'parent_id',
      parentEntityType: 'parent_entity_type',
      state: 'state',
      startedTime: 'started_time',
      finishedTime: 'finished_time',
      standaloneExecutable: 'standalone_executable',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      parentGroupId: 'string',
      serviceId: 'string',
      arrangementId: 'string',
      actionHandlerCode: 'string',
      maxRetryAttempts: 'number',
      context: { 'type': 'array', 'itemType': Pair },
      processDefinitionId: 'string',
      parentId: 'string',
      parentEntityType: 'string',
      state: 'string',
      startedTime: 'string',
      finishedTime: 'string',
      standaloneExecutable: 'boolean',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用参数配置管理-某个参数在不同环境中渲染后的值
export class RenderParam extends $tea.Model {
  // 参数名
  key?: string;
  // 参数值，可能是一个常量或者表达式
  value?: string;
  // 参数值类型，CONST/EXPR
  type?: string;
  // 参数描述
  desc?: string;
  // 数据保密级别，L1,L2,L3
  dataLevel?: string;
  // 参数渲染后的值
  renderVals?: ParamVal[];
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
      type: 'type',
      desc: 'desc',
      dataLevel: 'data_level',
      renderVals: 'render_vals',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: 'string',
      type: 'string',
      desc: 'string',
      dataLevel: 'string',
      renderVals: { 'type': 'array', 'itemType': ParamVal },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// BuildpackV2Adapter
export class BuildpackAdapter extends $tea.Model {
  // buildpackArch
  buildpackArch?: string;
  // fullVersion
  fullVersion?: string;
  // supportedOS
  supportedOS?: BuildpackOS[];
  // supportedRegions
  supportedRegions?: BuildpackRegionRelationDetail[];
  // techstack
  techstack?: Techstack;
  static names(): { [key: string]: string } {
    return {
      buildpackArch: 'buildpack_arch',
      fullVersion: 'full_version',
      supportedOS: 'supported_o_s',
      supportedRegions: 'supported_regions',
      techstack: 'techstack',
    };
  }

  static types(): { [key: string]: any } {
    return {
      buildpackArch: 'string',
      fullVersion: 'string',
      supportedOS: { 'type': 'array', 'itemType': BuildpackOS },
      supportedRegions: { 'type': 'array', 'itemType': BuildpackRegionRelationDetail },
      techstack: Techstack,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AppServiceEnvParam
export class AppServiceEnvParam extends $tea.Model {
  // app_id
  appId?: string;
  // app_service_id
  appServiceId?: string;
  // baseline_buildpack_id
  baselineBuildpackId?: string;
  // creation_time
  creationTime?: string;
  // default_value
  defaultValue?: string;
  // description
  description?: string;
  // id
  id?: string;
  // key
  key?: string;
  // modification_time
  modificationTime?: string;
  // original_default_value
  originalDefaultValue?: string;
  // original_description
  originalDescription?: string;
  // original_readonly
  originalReadonly?: string;
  // original_required
  originalRequired?: boolean;
  // readonly
  readonly?: boolean;
  // required
  required?: boolean;
  // status
  status?: string;
  // value
  value?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      appId: 'app_id',
      appServiceId: 'app_service_id',
      baselineBuildpackId: 'baseline_buildpack_id',
      creationTime: 'creation_time',
      defaultValue: 'default_value',
      description: 'description',
      id: 'id',
      key: 'key',
      modificationTime: 'modification_time',
      originalDefaultValue: 'original_default_value',
      originalDescription: 'original_description',
      originalReadonly: 'original_readonly',
      originalRequired: 'original_required',
      readonly: 'readonly',
      required: 'required',
      status: 'status',
      value: 'value',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appId: 'string',
      appServiceId: 'string',
      baselineBuildpackId: 'string',
      creationTime: 'string',
      defaultValue: 'string',
      description: 'string',
      id: 'string',
      key: 'string',
      modificationTime: 'string',
      originalDefaultValue: 'string',
      originalDescription: 'string',
      originalReadonly: 'string',
      originalRequired: 'boolean',
      readonly: 'boolean',
      required: 'boolean',
      status: 'string',
      value: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 角色信息
export class Role extends $tea.Model {
  // id
  id?: string;
  // name
  name?: string;
  // description
  description?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      description: 'description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      description: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// BuildpackAppService
export class BuildpackAppService extends $tea.Model {
  // appId
  appId?: string;
  // appName
  appName?: string;
  // buildpackFullVersion
  buildpackFullVersion?: string;
  // buildpackId
  buildpackId?: string;
  // cellIds
  cellIds?: string[];
  // description
  description?: string;
  // extendProperties
  extendProperties?: string;
  // id
  id?: string;
  // isDefault
  isDefault?: boolean;
  // isService
  isService?: boolean;
  // lastDeployStatus
  lastDeployStatus?: string;
  // lastDeployVersion
  lastDeployVersion?: string;
  // lastOpsOrderId
  lastOpsOrderId?: string;
  // name
  name?: string;
  // ownerId
  ownerId?: string;
  // techstackId
  techstackId?: number;
  // techstackIdentity
  techstackIdentity?: string;
  // techstackName
  techstackName?: string;
  // utcCreate
  utcCreate?: string;
  // utcModified
  utcModified?: string;
  // workspaceId
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      appId: 'app_id',
      appName: 'app_name',
      buildpackFullVersion: 'buildpack_full_version',
      buildpackId: 'buildpack_id',
      cellIds: 'cell_ids',
      description: 'description',
      extendProperties: 'extend_properties',
      id: 'id',
      isDefault: 'is_default',
      isService: 'is_service',
      lastDeployStatus: 'last_deploy_status',
      lastDeployVersion: 'last_deploy_version',
      lastOpsOrderId: 'last_ops_order_id',
      name: 'name',
      ownerId: 'owner_id',
      techstackId: 'techstack_id',
      techstackIdentity: 'techstack_identity',
      techstackName: 'techstack_name',
      utcCreate: 'utc_create',
      utcModified: 'utc_modified',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appId: 'string',
      appName: 'string',
      buildpackFullVersion: 'string',
      buildpackId: 'string',
      cellIds: { 'type': 'array', 'itemType': 'string' },
      description: 'string',
      extendProperties: 'string',
      id: 'string',
      isDefault: 'boolean',
      isService: 'boolean',
      lastDeployStatus: 'string',
      lastDeployVersion: 'string',
      lastOpsOrderId: 'string',
      name: 'string',
      ownerId: 'string',
      techstackId: 'number',
      techstackIdentity: 'string',
      techstackName: 'string',
      utcCreate: 'string',
      utcModified: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用管理-当前 workspace 的部署图/拓扑图
export class DeployView extends $tea.Model {
  // 当前 workspace 下的所有应用服务
  workspaceAppServices?: AppServiceEntity[];
  // workspace 显示名称
  workspaceDisplayName?: string;
  // workspace id
  workspaceId?: string;
  // workspace 名称
  workspaceName?: string;
  static names(): { [key: string]: string } {
    return {
      workspaceAppServices: 'workspace_app_services',
      workspaceDisplayName: 'workspace_display_name',
      workspaceId: 'workspace_id',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      workspaceAppServices: { 'type': 'array', 'itemType': AppServiceEntity },
      workspaceDisplayName: 'string',
      workspaceId: 'string',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// sidecar规则
export class SidecarRule extends $tea.Model {
  // sidecar规则描述
  description?: string;
  // 创建时间
  gmtCreated?: string;
  // 修改时间
  gmtModified?: string;
  // 版本实例名称
  instanceName?: string;
  // 规则优先级
  level?: number;
  // scope生效范围详情
  scopeDetail?: SidecarScopeDetail;
  // sidecar版本实例id
  sidecarVersionInstanceId?: string;
  // 规则状态
  status?: number;
  // 发布、下线、废弃原因
  // 
  statusReason?: string;
  static names(): { [key: string]: string } {
    return {
      description: 'description',
      gmtCreated: 'gmt_created',
      gmtModified: 'gmt_modified',
      instanceName: 'instance_name',
      level: 'level',
      scopeDetail: 'scope_detail',
      sidecarVersionInstanceId: 'sidecar_version_instance_id',
      status: 'status',
      statusReason: 'status_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      description: 'string',
      gmtCreated: 'string',
      gmtModified: 'string',
      instanceName: 'string',
      level: 'number',
      scopeDetail: SidecarScopeDetail,
      sidecarVersionInstanceId: 'string',
      status: 'number',
      statusReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// SupportedRegion
export class SupportedRegion extends $tea.Model {
  // file_size
  fileSize?: number;
  // file_status
  fileStatus?: string;
  // original_file_name
  originalFileName?: string;
  // region_id
  regionNum?: string;
  static names(): { [key: string]: string } {
    return {
      fileSize: 'file_size',
      fileStatus: 'file_status',
      originalFileName: 'original_file_name',
      regionNum: 'region_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fileSize: 'number',
      fileStatus: 'string',
      originalFileName: 'string',
      regionNum: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 异步任务执行结果。
export class TaskResult extends $tea.Model {
  // 任务执行结果。取值：
  //                     SUCCESSFUL：任务执行成功；
  //                     FAILED：任务执行失败
  //                 
  result?: string;
  // 任务目标id，如：一个Computer的id
  targetId?: string;
  static names(): { [key: string]: string } {
    return {
      result: 'result',
      targetId: 'target_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      result: 'string',
      targetId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用参数配置管理-应用参数
export class AppParam extends $tea.Model {
  // 应用名称
  appName?: string;
  // 创建时间
  createdTime?: string;
  // 数据保密等级
  dataLevel?: string;
  // 参数描述
  desc?: string;
  // 应用参数 id
  id?: string;
  // 参数名
  key?: string;
  // 修改时间
  modifiedTime?: string;
  // 版本
  paramVersion?: number;
  // 该参数属于哪个 scope
  scope?: string;
  // 该参数在该 scope 中的 id
  scopeId?: string;
  // 租户 id
  tenantId?: string;
  // 参数类型
  type?: string;
  // 参数值
  value?: string;
  static names(): { [key: string]: string } {
    return {
      appName: 'app_name',
      createdTime: 'created_time',
      dataLevel: 'data_level',
      desc: 'desc',
      id: 'id',
      key: 'key',
      modifiedTime: 'modified_time',
      paramVersion: 'param_version',
      scope: 'scope',
      scopeId: 'scope_id',
      tenantId: 'tenant_id',
      type: 'type',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appName: 'string',
      createdTime: 'string',
      dataLevel: 'string',
      desc: 'string',
      id: 'string',
      key: 'string',
      modifiedTime: 'string',
      paramVersion: 'number',
      scope: 'string',
      scopeId: 'string',
      tenantId: 'string',
      type: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// sidecar版本实例
export class SidecarVersionInstance extends $tea.Model {
  // 版本实例描述
  description?: string;
  // 创建时间
  gmtCreated?: string;
  // 修改时间
  gmtModified?: string;
  // 版本实例名称
  instanceName?: string;
  // 环境参数模板
  params?: string;
  // sidecar参数配置
  paramsConfigs?: SidecarParamsConfig[];
  // sidecar版本发布说明
  releaseNote?: string;
  // scope生效范围详情
  scopeDetail?: SidecarScopeDetail;
  // sidecar名称
  sidecarName?: string;
  // sidecar版本id
  sidecarReleaseVersionId?: string;
  // sidecar版本号
  sidecarVersion?: string;
  // sidecar版本实例id
  sidecarVersionInstanceId?: string;
  // 版本实例状态
  status?: number;
  // 发布、下线、废弃原因
  // 
  statusReason?: string;
  // sidecar版本模板
  template?: string;
  // sidecar模板配置
  templateConfigs?: SidecarTemplateConfig[];
  static names(): { [key: string]: string } {
    return {
      description: 'description',
      gmtCreated: 'gmt_created',
      gmtModified: 'gmt_modified',
      instanceName: 'instance_name',
      params: 'params',
      paramsConfigs: 'params_configs',
      releaseNote: 'release_note',
      scopeDetail: 'scope_detail',
      sidecarName: 'sidecar_name',
      sidecarReleaseVersionId: 'sidecar_release_version_id',
      sidecarVersion: 'sidecar_version',
      sidecarVersionInstanceId: 'sidecar_version_instance_id',
      status: 'status',
      statusReason: 'status_reason',
      template: 'template',
      templateConfigs: 'template_configs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      description: 'string',
      gmtCreated: 'string',
      gmtModified: 'string',
      instanceName: 'string',
      params: 'string',
      paramsConfigs: { 'type': 'array', 'itemType': SidecarParamsConfig },
      releaseNote: 'string',
      scopeDetail: SidecarScopeDetail,
      sidecarName: 'string',
      sidecarReleaseVersionId: 'string',
      sidecarVersion: 'string',
      sidecarVersionInstanceId: 'string',
      status: 'number',
      statusReason: 'string',
      template: 'string',
      templateConfigs: { 'type': 'array', 'itemType': SidecarTemplateConfig },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 技术栈版本和地域之间的关联
export class BuildpackRegionRelation extends $tea.Model {
  // 技术栈版本的id
  buildpackId?: string;
  // 技术栈租户ID
  buildpackTenantId?: string;
  // 文件的checksum
  fileChecksum?: string;
  // 文件存储地址
  fileLocation?: string;
  // 文件大小，类似1100
  fileSize?: number;
  // 文件状态
  fileStatus?: string;
  // 文件的初始名称
  originalFileName?: string;
  // 文件可读的大小，类似1.1MB
  readableFileSize?: string;
  // region的ID
  regionId?: string;
  // region的标识符
  regionIdentity?: string;
  // region的名称
  regionName?: string;
  // 存储类型，取值如下： SYSTEM_AFS表示AFS存储，SYSTEM_OSS表示OSS存储
  storageType?: string;
  static names(): { [key: string]: string } {
    return {
      buildpackId: 'buildpack_id',
      buildpackTenantId: 'buildpack_tenant_id',
      fileChecksum: 'file_checksum',
      fileLocation: 'file_location',
      fileSize: 'file_size',
      fileStatus: 'file_status',
      originalFileName: 'original_file_name',
      readableFileSize: 'readable_file_size',
      regionId: 'region_id',
      regionIdentity: 'region_identity',
      regionName: 'region_name',
      storageType: 'storage_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      buildpackId: 'string',
      buildpackTenantId: 'string',
      fileChecksum: 'string',
      fileLocation: 'string',
      fileSize: 'number',
      fileStatus: 'string',
      originalFileName: 'string',
      readableFileSize: 'string',
      regionId: 'string',
      regionIdentity: 'string',
      regionName: 'string',
      storageType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// region info
export class RegionMeta extends $tea.Model {
  // region支持的网络类型
  availableNetworkTypes?: string[];
  // region display name
  displayName?: string;
  // region identity
  id?: string;
  // region paas id
  paasId?: string;
  // region iaas id
  regionIaasId?: string;
  // region包含的所有zone id列表
  zoneIds?: string[];
  // region state.
  state?: string;
  static names(): { [key: string]: string } {
    return {
      availableNetworkTypes: 'available_network_types',
      displayName: 'display_name',
      id: 'id',
      paasId: 'paas_id',
      regionIaasId: 'region_iaas_id',
      zoneIds: 'zone_ids',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      availableNetworkTypes: { 'type': 'array', 'itemType': 'string' },
      displayName: 'string',
      id: 'string',
      paasId: 'string',
      regionIaasId: 'string',
      zoneIds: { 'type': 'array', 'itemType': 'string' },
      state: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// WorkspaceGroup
export class WorkspaceGroup extends $tea.Model {
  // 环境名称
  id?: string;
  // 环境显示名称
  name?: string;
  // 环境状态
  status?: string;
  // 租户名称
  tenant?: string;
  // 工作空间名称列表
  workspaces?: string[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      status: 'status',
      tenant: 'tenant',
      workspaces: 'workspaces',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      status: 'string',
      tenant: 'string',
      workspaces: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 聚合任务执行进度
export class AggregatedTaskExecutionProgress extends $tea.Model {
  // 错误节点信息
  errorTaskExecutionNodes?: ErrorTaskExecutionNode[];
  // 任务执行进度
  taskExecutionProgress?: TaskExecutionProgress;
  static names(): { [key: string]: string } {
    return {
      errorTaskExecutionNodes: 'error_task_execution_nodes',
      taskExecutionProgress: 'task_execution_progress',
    };
  }

  static types(): { [key: string]: any } {
    return {
      errorTaskExecutionNodes: { 'type': 'array', 'itemType': ErrorTaskExecutionNode },
      taskExecutionProgress: TaskExecutionProgress,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发布单
export class OpsPlan extends $tea.Model {
  // 是否自动执行
  autoExecution?: boolean;
  // 上下文
  context?: Pair[];
  // 描述
  description?: string;
  // 是否开启通知
  enableNotification?: boolean;
  // 执行人 ID
  executorId?: string;
  // 执行人
  executorName?: string;
  // 完成时间
  finishedTime?: string;
  // ID
  id?: string;
  // last operator
  lastOperator?: string;
  // 详情
  messageDetail?: Pair[];
  // 信息
  messageParams?: string;
  // 名称
  name?: string;
  // 类型
  opsType?: string;
  // 发布进程
  processDefinitions?: OpsProcessDefinition[];
  // release_mode
  releaseMode?: string;
  // 回滚单ID
  rollbackPlanId?: string;
  // 是否可独立执行
  standaloneExecutable?: boolean;
  // 开始时间
  startedTime?: string;
  // 状态
  state?: string;
  // 发布单 ID
  timeSeriesId?: string;
  static names(): { [key: string]: string } {
    return {
      autoExecution: 'auto_execution',
      context: 'context',
      description: 'description',
      enableNotification: 'enable_notification',
      executorId: 'executor_id',
      executorName: 'executor_name',
      finishedTime: 'finished_time',
      id: 'id',
      lastOperator: 'last_operator',
      messageDetail: 'message_detail',
      messageParams: 'message_params',
      name: 'name',
      opsType: 'ops_type',
      processDefinitions: 'process_definitions',
      releaseMode: 'release_mode',
      rollbackPlanId: 'rollback_plan_id',
      standaloneExecutable: 'standalone_executable',
      startedTime: 'started_time',
      state: 'state',
      timeSeriesId: 'time_series_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      autoExecution: 'boolean',
      context: { 'type': 'array', 'itemType': Pair },
      description: 'string',
      enableNotification: 'boolean',
      executorId: 'string',
      executorName: 'string',
      finishedTime: 'string',
      id: 'string',
      lastOperator: 'string',
      messageDetail: { 'type': 'array', 'itemType': Pair },
      messageParams: 'string',
      name: 'string',
      opsType: 'string',
      processDefinitions: { 'type': 'array', 'itemType': OpsProcessDefinition },
      releaseMode: 'string',
      rollbackPlanId: 'string',
      standaloneExecutable: 'boolean',
      startedTime: 'string',
      state: 'string',
      timeSeriesId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 逻辑单元
export class CellGroup extends $tea.Model {
  // 包含部署单元列表
  cells?: DeployCell[];
  // 机房名称
  datacenter?: string;
  // 默认全局域
  defaultGzone?: string;
  // 逻辑单元灾备信息
  disasterInfo?: DisasterInfo[];
  // 修改时间
  modifiedTime?: string;
  // 逻辑单元名称
  name?: string;
  // 操作人
  operator?: string;
  // 所属地域：CZone Group 必填
  region?: string;
  // 逻辑单元类型
  type?: string;
  static names(): { [key: string]: string } {
    return {
      cells: 'cells',
      datacenter: 'datacenter',
      defaultGzone: 'default_gzone',
      disasterInfo: 'disaster_info',
      modifiedTime: 'modified_time',
      name: 'name',
      operator: 'operator',
      region: 'region',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cells: { 'type': 'array', 'itemType': DeployCell },
      datacenter: 'string',
      defaultGzone: 'string',
      disasterInfo: { 'type': 'array', 'itemType': DisasterInfo },
      modifiedTime: 'string',
      name: 'string',
      operator: 'string',
      region: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AppServiceBuildpackRelation
export class AppServiceBuildpackRelation extends $tea.Model {
  // app_id
  appId?: string;
  // app_service_id
  appServiceId?: string;
  // buildpack_arch
  buildpackArch?: string;
  // buildpack_full_version
  buildpackFullVersion?: string;
  // buildpack_id
  buildpackId?: string;
  // creation_time
  creationTime?: string;
  // extra_info
  extraInfo?: string;
  // id
  id?: string;
  // modification_time
  modificationTime?: string;
  // techstack_id
  techstackId?: number;
  // techstack_identity
  techstackIdentity?: string;
  // techstack_name
  techstackName?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      appId: 'app_id',
      appServiceId: 'app_service_id',
      buildpackArch: 'buildpack_arch',
      buildpackFullVersion: 'buildpack_full_version',
      buildpackId: 'buildpack_id',
      creationTime: 'creation_time',
      extraInfo: 'extra_info',
      id: 'id',
      modificationTime: 'modification_time',
      techstackId: 'techstack_id',
      techstackIdentity: 'techstack_identity',
      techstackName: 'techstack_name',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appId: 'string',
      appServiceId: 'string',
      buildpackArch: 'string',
      buildpackFullVersion: 'string',
      buildpackId: 'string',
      creationTime: 'string',
      extraInfo: 'string',
      id: 'string',
      modificationTime: 'string',
      techstackId: 'number',
      techstackIdentity: 'string',
      techstackName: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 区域视图
export class RegionView extends $tea.Model {
  // 支持的网络类型列表
  availableNetworkTypes?: string[];
  // 显示名称
  displayName?: string;
  // table id
  id?: string;
  // 标识
  identity?: string;
  // region包含的所有zone 列表
  zones?: ZoneView[];
  static names(): { [key: string]: string } {
    return {
      availableNetworkTypes: 'available_network_types',
      displayName: 'display_name',
      id: 'id',
      identity: 'identity',
      zones: 'zones',
    };
  }

  static types(): { [key: string]: any } {
    return {
      availableNetworkTypes: { 'type': 'array', 'itemType': 'string' },
      displayName: 'string',
      id: 'string',
      identity: 'string',
      zones: { 'type': 'array', 'itemType': ZoneView },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 计算资源与Cell的关系信息
export class ComputerCell extends $tea.Model {
  // 部署单元唯一标识
  cellId?: string;
  // 计算资源唯一标识
  computerId?: string;
  static names(): { [key: string]: string } {
    return {
      cellId: 'cell_id',
      computerId: 'computer_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cellId: 'string',
      computerId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 一个指令模板。
export class CmdTemplate extends $tea.Model {
  // 指令模板定义的参数名称。比如：./install_env.sh --version 2.2，其中的 --version 就是参数名称
  argNames?: string[];
  // 指令模板内容，可以为一个简单命令，也可是一个自定义脚本
  content?: string;
  // 指令模板创建者，通常为改用户注册蚂蚁金融云的email
  creator?: string;
  // 指令模板描述
  description?: string;
  // 在机器上执行该指令的账号，比如：root, admin
  executeAccount?: string;
  // 指令模板ID
  id?: string;
  // 指令名称
  name?: string;
  // 失败重试的间隔，单位为秒
  retryInterval?: number;
  // 失败重试次数
  retryTimes?: number;
  // 单次执行的超时时间，单位为秒
  timeOut?: number;
  // 模板类型。目前取值列表：
  //                     SIMPLE_COMMAND：简单指令类型；
  //                     CUSTOM_SHELL_SCRIPT：用户自定义shell脚本
  type?: string;
  static names(): { [key: string]: string } {
    return {
      argNames: 'arg_names',
      content: 'content',
      creator: 'creator',
      description: 'description',
      executeAccount: 'execute_account',
      id: 'id',
      name: 'name',
      retryInterval: 'retry_interval',
      retryTimes: 'retry_times',
      timeOut: 'time_out',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      argNames: { 'type': 'array', 'itemType': 'string' },
      content: 'string',
      creator: 'string',
      description: 'string',
      executeAccount: 'string',
      id: 'string',
      name: 'string',
      retryInterval: 'number',
      retryTimes: 'number',
      timeOut: 'number',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 一个应用发布包视图
export class AppPackageListView extends $tea.Model {
  // appId
  appId?: string;
  // appName
  appName?: string;
  // packageCount
  packageCount?: number;
  // buildpackId
  buildpackId?: string;
  // buildpackName
  buildpackName?: string;
  // buildpackVersion
  buildpackVersion?: string;
  // appOwnerId
  appOwnerId?: string;
  // appOwnerName
  appOwnerName?: string;
  // latestPackage
  latestPackage?: AppManifest;
  // appStatus
  appStatus?: string;
  static names(): { [key: string]: string } {
    return {
      appId: 'app_id',
      appName: 'app_name',
      packageCount: 'package_count',
      buildpackId: 'buildpack_id',
      buildpackName: 'buildpack_name',
      buildpackVersion: 'buildpack_version',
      appOwnerId: 'app_owner_id',
      appOwnerName: 'app_owner_name',
      latestPackage: 'latest_package',
      appStatus: 'app_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appId: 'string',
      appName: 'string',
      packageCount: 'number',
      buildpackId: 'string',
      buildpackName: 'string',
      buildpackVersion: 'string',
      appOwnerId: 'string',
      appOwnerName: 'string',
      latestPackage: AppManifest,
      appStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 重试信息
export class RetryInfo extends $tea.Model {
  // action
  action?: string;
  // check_interval
  checkInterval?: number;
  // retry_failed_only
  retryFailedOnly?: boolean;
  // retry_times
  retryTimes?: number;
  // timeout
  timeout?: number;
  static names(): { [key: string]: string } {
    return {
      action: 'action',
      checkInterval: 'check_interval',
      retryFailedOnly: 'retry_failed_only',
      retryTimes: 'retry_times',
      timeout: 'timeout',
    };
  }

  static types(): { [key: string]: any } {
    return {
      action: 'string',
      checkInterval: 'number',
      retryFailedOnly: 'boolean',
      retryTimes: 'number',
      timeout: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// DeploymentCell
export class DeploymentCell extends $tea.Model {
  // name
  name?: string;
  // 部署单元 id
  cellIds?: string[];
  // description
  description?: string;
  // id
  id?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      cellIds: 'cell_ids',
      description: 'description',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      cellIds: { 'type': 'array', 'itemType': 'string' },
      description: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用信息
export class ApplicationInfo extends $tea.Model {
  // 应用别名
  alias?: string;
  // 应用名称
  applicationName?: string;
  // 应用额外元数据信息
  appExtraInfos?: AppExtraInfo[];
  // 应用所属分组名
  appGroupName?: string;
  // 应用等级名称
  appLevel?: string;
  // 技术栈名称
  buildpackName?: string;
  // 技术栈版本
  buildpackVersion?: string;
  // 应用创建时间
  creationTime?: string;
  // 应用描述
  description?: string;
  // 用户真实名称
  ownerLoginName?: string;
  // 应用负责人登录名
  realOwnerLoginName?: string;
  // 应用状态。取值列表：
  //                     CREATING：应用创建中；
  //                     CREATED：应用成功创建，可正常使用；
  //                     CREATE_FAILED：应用创建失败；
  //                     DELETING：应用删除中；
  //                     DELETE_FAILED：应用删除失败
  //                 
  status?: string;
  // 全局唯一名字
  globalName?: string;
  // 发布模式， package，image，mixed
  deployType?: string;
  static names(): { [key: string]: string } {
    return {
      alias: 'alias',
      applicationName: 'application_name',
      appExtraInfos: 'app_extra_infos',
      appGroupName: 'app_group_name',
      appLevel: 'app_level',
      buildpackName: 'buildpack_name',
      buildpackVersion: 'buildpack_version',
      creationTime: 'creation_time',
      description: 'description',
      ownerLoginName: 'owner_login_name',
      realOwnerLoginName: 'real_owner_login_name',
      status: 'status',
      globalName: 'global_name',
      deployType: 'deploy_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      alias: 'string',
      applicationName: 'string',
      appExtraInfos: { 'type': 'array', 'itemType': AppExtraInfo },
      appGroupName: 'string',
      appLevel: 'string',
      buildpackName: 'string',
      buildpackVersion: 'string',
      creationTime: 'string',
      description: 'string',
      ownerLoginName: 'string',
      realOwnerLoginName: 'string',
      status: 'string',
      globalName: 'string',
      deployType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 动态查询
export class DynamicQuery extends $tea.Model {
  // 分页规则-currentPage
  currentPage?: number;
  // 字段过滤
  filter?: string;
  // 分页规则-pageSize
  pageSize?: number;
  // 具体的查询条件字符串
  query?: string;
  // 查询结果的排序规则
  sort?: string;
  static names(): { [key: string]: string } {
    return {
      currentPage: 'current_page',
      filter: 'filter',
      pageSize: 'page_size',
      query: 'query',
      sort: 'sort',
    };
  }

  static types(): { [key: string]: any } {
    return {
      currentPage: 'number',
      filter: 'string',
      pageSize: 'number',
      query: 'string',
      sort: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用管理-应用模型
export class App extends $tea.Model {
  // 应用所属分组 id
  appGroupId?: string;
  // 应用分组名称
  appGroupName?: string;
  // 技术栈名称
  buildpackName?: string;
  // 技术栈版本
  buildpackVersion?: string;
  // 创建时间
  createdTime?: string;
  // 允许访问公网
  defaultRoute?: boolean;
  // 应用发布模式，发布包，发布镜像，混合发布。
  // 默认为空 - 表示包发布模式
  deployType?: string;
  // 应用描述
  description?: string;
  // 显示名称
  displayName?: string;
  // 域内应用全局唯一名称
  globalName?: string;
  // 应用 id
  id?: string;
  // 应用名称
  name?: string;
  // 应用负责人显示名称
  ownerDisplayName?: string;
  // 应用负责人登录名称
  ownerLoginName?: string;
  // 技术栈id
  stackId?: string;
  // 应用状态
  status?: string;
  // 应用额外信息（应用标签）
  tags?: Tag[];
  // 应用负责人id
  ownerId?: string;
  static names(): { [key: string]: string } {
    return {
      appGroupId: 'app_group_id',
      appGroupName: 'app_group_name',
      buildpackName: 'buildpack_name',
      buildpackVersion: 'buildpack_version',
      createdTime: 'created_time',
      defaultRoute: 'default_route',
      deployType: 'deploy_type',
      description: 'description',
      displayName: 'display_name',
      globalName: 'global_name',
      id: 'id',
      name: 'name',
      ownerDisplayName: 'owner_display_name',
      ownerLoginName: 'owner_login_name',
      stackId: 'stack_id',
      status: 'status',
      tags: 'tags',
      ownerId: 'owner_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appGroupId: 'string',
      appGroupName: 'string',
      buildpackName: 'string',
      buildpackVersion: 'string',
      createdTime: 'string',
      defaultRoute: 'boolean',
      deployType: 'string',
      description: 'string',
      displayName: 'string',
      globalName: 'string',
      id: 'string',
      name: 'string',
      ownerDisplayName: 'string',
      ownerLoginName: 'string',
      stackId: 'string',
      status: 'string',
      tags: { 'type': 'array', 'itemType': Tag },
      ownerId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用等级
export class AppLevel extends $tea.Model {
  // 应用等级ID
  id?: string;
  // 应用等级名称
  name?: string;
  // 应用等级负责人登录名
  ownerLoginName?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      ownerLoginName: 'owner_login_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      ownerLoginName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 通过appid查到的buildpack
export class BuildpackByAppV extends $tea.Model {
  // id
  id?: string;
  // name
  name?: string;
  // des
  des?: string;
  // version
  version?: string;
  // deployScriptId
  deployScriptId?: string;
  // buildScriptId
  buildScriptId?: string;
  // configId
  configId?: string;
  // componentId
  componentId?: string;
  // commandId
  commandId?: string;
  // bgEnable
  bgEnable?: boolean;
  // creator
  creator?: string;
  // tenantId
  tenantId?: string;
  // customerIds
  customerIds?: string;
  // gmtCreate
  gmtCreate?: string;
  // gmtModified
  gmtModified?: string;
  // resultMsg
  resultMsg?: string;
  // utcCreate
  utcCreate?: string;
  // utcModified
  utcModified?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      des: 'des',
      version: 'version',
      deployScriptId: 'deploy_script_id',
      buildScriptId: 'build_script_id',
      configId: 'config_id',
      componentId: 'component_id',
      commandId: 'command_id',
      bgEnable: 'bg_enable',
      creator: 'creator',
      tenantId: 'tenant_id',
      customerIds: 'customer_ids',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      resultMsg: 'result_msg',
      utcCreate: 'utc_create',
      utcModified: 'utc_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      des: 'string',
      version: 'string',
      deployScriptId: 'string',
      buildScriptId: 'string',
      configId: 'string',
      componentId: 'string',
      commandId: 'string',
      bgEnable: 'boolean',
      creator: 'string',
      tenantId: 'string',
      customerIds: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      resultMsg: 'string',
      utcCreate: 'string',
      utcModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用单元资源统计
export class AppUnitResource extends $tea.Model {
  // 应用 ID
  appId?: string;
  // 单元id
  unitId?: string;
  // 机器数
  machineCount?: number;
  // 已挂载机器数
  mountedMachineCount?: number;
  // 负载均衡数
  slbCount?: number;
  // 负载均衡权重
  slbWeight?: number;
  static names(): { [key: string]: string } {
    return {
      appId: 'app_id',
      unitId: 'unit_id',
      machineCount: 'machine_count',
      mountedMachineCount: 'mounted_machine_count',
      slbCount: 'slb_count',
      slbWeight: 'slb_weight',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appId: 'string',
      unitId: 'string',
      machineCount: 'number',
      mountedMachineCount: 'number',
      slbCount: 'number',
      slbWeight: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 工作空间组视图
export class WorkspaceGroupView extends $tea.Model {
  // 显示名称
  displayName?: string;
  // table id
  id?: string;
  // 标识
  identity?: string;
  // 环境状态
  status?: string;
  // 租户id
  tenantId?: string;
  // 工作空间列表
  workspaces?: WorkspaceView[];
  static names(): { [key: string]: string } {
    return {
      displayName: 'display_name',
      id: 'id',
      identity: 'identity',
      status: 'status',
      tenantId: 'tenant_id',
      workspaces: 'workspaces',
    };
  }

  static types(): { [key: string]: any } {
    return {
      displayName: 'string',
      id: 'string',
      identity: 'string',
      status: 'string',
      tenantId: 'string',
      workspaces: { 'type': 'array', 'itemType': WorkspaceView },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 机器分组
export class MachineGroup extends $tea.Model {
  // 机器名
  name?: string;
  // 所属发布服务 ID
  serviceId?: string;
  // 所属发布服务分组 ID
  serviceGroupId?: string;
  // 发布服务分组集合 ID
  serviceGroupCollectionId?: string;
  // 概览 ID
  arrangementId?: string;
  // 服务类型
  serviceType?: string;
  // paas 服务 ID
  paasServiceId?: string;
  // 是否 beta 分组
  needBeta?: boolean;
  // 是否需要确认
  needConfirm?: boolean;
  // 是否需要分组预确认
  needReserve?: boolean;
  // 是否需要引流确认
  needConfirmTraffic?: boolean;
  // 机器信息组
  machines?: Machine[];
  // pd id
  processDefinitionId?: string;
  // 父节点 ID
  parentId?: string;
  // 父节点类型
  parentEntityType?: string;
  // 流程节点 ID
  nodeId?: string;
  // 状态
  state?: string;
  // 开始时间
  startedTime?: string;
  // 结束时间
  finishedTime?: string;
  // 是否可以独立执行
  standaloneExecutable?: boolean;
  // ID
  id?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      serviceId: 'service_id',
      serviceGroupId: 'service_group_id',
      serviceGroupCollectionId: 'service_group_collection_id',
      arrangementId: 'arrangement_id',
      serviceType: 'service_type',
      paasServiceId: 'paas_service_id',
      needBeta: 'need_beta',
      needConfirm: 'need_confirm',
      needReserve: 'need_reserve',
      needConfirmTraffic: 'need_confirm_traffic',
      machines: 'machines',
      processDefinitionId: 'process_definition_id',
      parentId: 'parent_id',
      parentEntityType: 'parent_entity_type',
      nodeId: 'node_id',
      state: 'state',
      startedTime: 'started_time',
      finishedTime: 'finished_time',
      standaloneExecutable: 'standalone_executable',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      serviceId: 'string',
      serviceGroupId: 'string',
      serviceGroupCollectionId: 'string',
      arrangementId: 'string',
      serviceType: 'string',
      paasServiceId: 'string',
      needBeta: 'boolean',
      needConfirm: 'boolean',
      needReserve: 'boolean',
      needConfirmTraffic: 'boolean',
      machines: { 'type': 'array', 'itemType': Machine },
      processDefinitionId: 'string',
      parentId: 'string',
      parentEntityType: 'string',
      nodeId: 'string',
      state: 'string',
      startedTime: 'string',
      finishedTime: 'string',
      standaloneExecutable: 'boolean',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Zone
export class Zone extends $tea.Model {
  // zone名称
  id?: string;
  // zone显示名称
  name?: string;
  // zone paas id
  paasId?: string;
  // region identity
  regionId?: string;
  // zone state
  state?: string;
  // 机房iaas identity
  iaasId?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      paasId: 'paas_id',
      regionId: 'region_id',
      state: 'state',
      iaasId: 'iaas_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      paasId: 'string',
      regionId: 'string',
      state: 'string',
      iaasId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 一个运维操作组
export class OpsGroup extends $tea.Model {
  // 运维操作组当前状态。取值列表：
  //                     INITED：初始化完成；
  //                     EXECUTING：执行中；
  //                     SUCCESS：执行成功；
  //                     FAILED：执行失败；
  //                     CANCELED：已取消；
  //                     CONFIRM_WAITING：待确认
  //                 
  status?: string;
  // 包含在此运维操作组中的运维单元列表
  units?: OpsUnit[];
  static names(): { [key: string]: string } {
    return {
      status: 'status',
      units: 'units',
    };
  }

  static types(): { [key: string]: any } {
    return {
      status: 'string',
      units: { 'type': 'array', 'itemType': OpsUnit },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 回滚信息
export class RollbackInfo extends $tea.Model {
  // group_amount
  groupAmount?: number;
  // group_strategy
  groupStrategy?: string;
  // reason
  reason?: string;
  // sub_entities
  subEntities?: string[];
  // target_id
  targetId?: string;
  // target_version
  targetVersion?: string;
  // need_beta_group
  needBetaGroup?: boolean;
  // env_config
  envConfig?: Pair[];
  // confirm_succeeded_rollback
  confirmSucceededRollback?: boolean;
  // retry_rollbacked
  retryRollbacked?: boolean;
  static names(): { [key: string]: string } {
    return {
      groupAmount: 'group_amount',
      groupStrategy: 'group_strategy',
      reason: 'reason',
      subEntities: 'sub_entities',
      targetId: 'target_id',
      targetVersion: 'target_version',
      needBetaGroup: 'need_beta_group',
      envConfig: 'env_config',
      confirmSucceededRollback: 'confirm_succeeded_rollback',
      retryRollbacked: 'retry_rollbacked',
    };
  }

  static types(): { [key: string]: any } {
    return {
      groupAmount: 'number',
      groupStrategy: 'string',
      reason: 'string',
      subEntities: { 'type': 'array', 'itemType': 'string' },
      targetId: 'string',
      targetVersion: 'string',
      needBetaGroup: 'boolean',
      envConfig: { 'type': 'array', 'itemType': Pair },
      confirmSucceededRollback: 'boolean',
      retryRollbacked: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用参数配置管理-全局参数
export class GlobalParam extends $tea.Model {
  // 创建时间
  createdTime?: string;
  // 数据保密等级
  dataLevel?: string;
  // 参数描述
  desc?: string;
  // 全局参数 id
  id?: string;
  // 参数名
  key?: string;
  // 修改时间
  modifiedTime?: string;
  // 版本
  paramVersion?: number;
  // 该参数属于哪个 scope
  scope?: string;
  // 该参数在该 scope 中的 id
  scopeId?: string;
  // 参数值类型
  type?: string;
  // 参数值
  value?: string;
  static names(): { [key: string]: string } {
    return {
      createdTime: 'created_time',
      dataLevel: 'data_level',
      desc: 'desc',
      id: 'id',
      key: 'key',
      modifiedTime: 'modified_time',
      paramVersion: 'param_version',
      scope: 'scope',
      scopeId: 'scope_id',
      type: 'type',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      createdTime: 'string',
      dataLevel: 'string',
      desc: 'string',
      id: 'string',
      key: 'string',
      modifiedTime: 'string',
      paramVersion: 'number',
      scope: 'string',
      scopeId: 'string',
      type: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发布单信息
export class OpsDeployment extends $tea.Model {
  // 此部署操作中所有被操作的应用（服务）详情，以操作链的形式体现
  applicationChains?: OpsApplicationChain[];
  // 部署操作执行者
  executor?: string;
  // 部署单id
  operationId?: string;
  // 
  //                     
  //     部署单状态。取值列表：
  //     INITING：初始化中；
  //     INIT_FAILED：初始化失败；
  //     INITED：初始化完成；
  //     EXECUTING：执行中；
  //     SUCCESS：执行成功；
  //     FAILED：执行失败；
  //     CANCELING：取消中；
  //     CANCELED：已取消
  //                     
  //                 
  status?: string;
  // 部署单标题。长度不超过50个UTF-8字符
  title?: string;
  static names(): { [key: string]: string } {
    return {
      applicationChains: 'application_chains',
      executor: 'executor',
      operationId: 'operation_id',
      status: 'status',
      title: 'title',
    };
  }

  static types(): { [key: string]: any } {
    return {
      applicationChains: { 'type': 'array', 'itemType': OpsApplicationChain },
      executor: 'string',
      operationId: 'string',
      status: 'string',
      title: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 工作空间组详细信息。
export class WorkspaceGroupInfo extends $tea.Model {
  // 创建时间。
  createdTime?: string;
  // 工作空间组显示名称。
  displayName?: string;
  // 域名后缀。
  domainSuffix?: string;
  // 工作空间组id。
  id?: string;
  // 主工作空间id。
  masterWorkspaceId?: string;
  // 主工作空间名称。
  masterWorkspaceIdentity?: string;
  // 修改时间。
  modifiedTime?: string;
  // 工作空间组唯一标识。
  name?: string;
  // 发布模式。
  releaseMode?: string;
  // the belonging tenant name.
  tenantName?: string;
  // 包含工作空间列表。
  workspaces?: Workspace[];
  // workspace name
  identity?: string;
  static names(): { [key: string]: string } {
    return {
      createdTime: 'created_time',
      displayName: 'display_name',
      domainSuffix: 'domain_suffix',
      id: 'id',
      masterWorkspaceId: 'master_workspace_id',
      masterWorkspaceIdentity: 'master_workspace_identity',
      modifiedTime: 'modified_time',
      name: 'name',
      releaseMode: 'release_mode',
      tenantName: 'tenant_name',
      workspaces: 'workspaces',
      identity: 'identity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      createdTime: 'string',
      displayName: 'string',
      domainSuffix: 'string',
      id: 'string',
      masterWorkspaceId: 'string',
      masterWorkspaceIdentity: 'string',
      modifiedTime: 'string',
      name: 'string',
      releaseMode: 'string',
      tenantName: 'string',
      workspaces: { 'type': 'array', 'itemType': Workspace },
      identity: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 负载均衡
export class DepsLoadBalancer extends $tea.Model {
  // 服务实例列表
  appServices?: AppService[];
  // 网络带宽
  bandwidth?: number;
  // iaaS在创建该资源时为其分配的唯一标示，创建中或创建失败时为空
  iaasId?: string;
  // 资源唯一标识
  id?: string;
  // 公网计费方式
  internetChargeType?: string;
  // 资源名称
  name?: string;
  // VIP类型
  networkType?: string;
  // 资源所属的地域id
  region?: string;
  // 
  //                     
  //                     资源所处的状态，资源状态，取值 CREATING：正在创建，CREATE_FAILED：创建失败，DELETING：正在删除，DELETED：删除成功，
  //                     DELETE_FAILED：删除失败，RESOURCE_IMPORTING：资源导入中，RESOURCE_IMPORT_FAILED：资源导入失败，RESOURCE_REMOVING：资源删除中，
  //                     RESOURCE_REMOVE_FAILED：资源删除失败，INACTIVE：未激活，STOPPING：正在停止，STARTING：正在启动，ACTIVE：已激活，LOCKED：已锁定，
  //                     RELEASING：正在释放，UPDATING：正在更新，MOUNTING：正在挂载，UMOUNTING：正在卸载  
  //                 
  status?: string;
  // vip地址
  vipAddress?: string;
  // address 类型：INTERNET, INTRANET
  vipAddressType?: string;
  // VIP类型
  vipType?: string;
  // vpc的id
  vpcId?: string;
  // 资源所属的可用区id
  zone?: string;
  static names(): { [key: string]: string } {
    return {
      appServices: 'app_services',
      bandwidth: 'bandwidth',
      iaasId: 'iaas_id',
      id: 'id',
      internetChargeType: 'internet_charge_type',
      name: 'name',
      networkType: 'network_type',
      region: 'region',
      status: 'status',
      vipAddress: 'vip_address',
      vipAddressType: 'vip_address_type',
      vipType: 'vip_type',
      vpcId: 'vpc_id',
      zone: 'zone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appServices: { 'type': 'array', 'itemType': AppService },
      bandwidth: 'number',
      iaasId: 'string',
      id: 'string',
      internetChargeType: 'string',
      name: 'string',
      networkType: 'string',
      region: 'string',
      status: 'string',
      vipAddress: 'string',
      vipAddressType: 'string',
      vipType: 'string',
      vpcId: 'string',
      zone: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// sidecar发布版本
export class SidecarReleaseVersion extends $tea.Model {
  // sidecar版本描述
  description?: string;
  // 创建时间
  gmtCreated?: string;
  // 修改时间
  gmtModified?: string;
  // release note
  releaseNote?: string;
  // scope生效范围详情
  scopeDetail?: SidecarScopeDetail;
  // sidecar名称
  sidecarName?: string;
  // sidecar版本id
  sidecarReleaseVersionId?: string;
  // sidecar版本号
  sidecarVersion?: string;
  // 版本状态
  status?: number;
  // 发布、下线、废弃原因
  statusReason?: string;
  // sidecar模板内容
  template?: string;
  // sidecar模板配置
  templateConfigs?: SidecarTemplateConfig[];
  // sidecar版本类型
  type?: string;
  // 版本周期：alpha/beta/release
  versionPeriod?: string;
  static names(): { [key: string]: string } {
    return {
      description: 'description',
      gmtCreated: 'gmt_created',
      gmtModified: 'gmt_modified',
      releaseNote: 'release_note',
      scopeDetail: 'scope_detail',
      sidecarName: 'sidecar_name',
      sidecarReleaseVersionId: 'sidecar_release_version_id',
      sidecarVersion: 'sidecar_version',
      status: 'status',
      statusReason: 'status_reason',
      template: 'template',
      templateConfigs: 'template_configs',
      type: 'type',
      versionPeriod: 'version_period',
    };
  }

  static types(): { [key: string]: any } {
    return {
      description: 'string',
      gmtCreated: 'string',
      gmtModified: 'string',
      releaseNote: 'string',
      scopeDetail: SidecarScopeDetail,
      sidecarName: 'string',
      sidecarReleaseVersionId: 'string',
      sidecarVersion: 'string',
      status: 'number',
      statusReason: 'string',
      template: 'string',
      templateConfigs: { 'type': 'array', 'itemType': SidecarTemplateConfig },
      type: 'string',
      versionPeriod: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Operator
export class Operator extends $tea.Model {
  // id
  id?: string;
  // login_name
  loginName?: string;
  // email
  email?: string;
  // nick_name
  nickName?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      loginName: 'login_name',
      email: 'email',
      nickName: 'nick_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      loginName: 'string',
      email: 'string',
      nickName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateApplicationRequest extends $tea.Model {
  authToken?: string;
  // 应用别称。最大60个UTF-8字符
  alias?: string;
  // 创建的应用名称。最大60个UTF-8字符
  applicationName?: string;
  // 技术栈架构版本，默认使用BUILDPACK_V1，取值列表：BUILDPACK_V1、BUILDPACK_V2
  buildpackArch?: string;
  // 应用使用的技术栈名称
  buildpackName?: string;
  // 应用使用的技术栈版本
  buildpackVersion?: string;
  // 应用描述。最大200个UTF-8字符
  description?: string;
  // 应用负责人登录名
  ownerLoginName?: string;
  // 应用发布类型，默认不填入表示包发布，支持 mixed,image,workload
  deployType?: string;
  // 是否允许公网访问
  defaultRoute?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      alias: 'alias',
      applicationName: 'application_name',
      buildpackArch: 'buildpack_arch',
      buildpackName: 'buildpack_name',
      buildpackVersion: 'buildpack_version',
      description: 'description',
      ownerLoginName: 'owner_login_name',
      deployType: 'deploy_type',
      defaultRoute: 'default_route',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      alias: 'string',
      applicationName: 'string',
      buildpackArch: 'string',
      buildpackName: 'string',
      buildpackVersion: 'string',
      description: 'string',
      ownerLoginName: 'string',
      deployType: 'string',
      defaultRoute: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateApplicationResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateApplicationServiceRequest extends $tea.Model {
  authToken?: string;
  // 应用名称
  applicationName?: string;
  // 应用使用的技术栈版本
  buildpackVersion?: string;
  // 部署单元paas id列表
  cellIds?: string[];
  // 描述
  description?: string;
  // 负责人登录名
  ownerLoginName?: string;
  // 应用服务实例名称
  serviceName?: string;
  // 租户名称
  tenant?: string;
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      applicationName: 'application_name',
      buildpackVersion: 'buildpack_version',
      cellIds: 'cell_ids',
      description: 'description',
      ownerLoginName: 'owner_login_name',
      serviceName: 'service_name',
      tenant: 'tenant',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      applicationName: 'string',
      buildpackVersion: 'string',
      cellIds: { 'type': 'array', 'itemType': 'string' },
      description: 'string',
      ownerLoginName: 'string',
      serviceName: 'string',
      tenant: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateApplicationServiceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 新建应用服务id
  id?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class EnabledApplicationServiceRequest extends $tea.Model {
  authToken?: string;
  // 租户名称
  tenant?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class EnabledApplicationServiceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 是否启用
  isEnabled?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      isEnabled: 'is_enabled',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      isEnabled: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetApplicationRequest extends $tea.Model {
  authToken?: string;
  // 待查询的应用名称。最大60个UTF-8字符
  applicationName?: string;
  // 查询结果是否返回应用额外元数据信息。默认为 false
  queryExtraInfo?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      applicationName: 'application_name',
      queryExtraInfo: 'query_extra_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      applicationName: 'string',
      queryExtraInfo: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetApplicationResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 应用别名
  alias?: string;
  // 应用名称
  applicationName?: string;
  // 应用额外元数据信息
  appExtraInfos?: AppExtraInfo[];
  // 应用所属分组名
  appGroupName?: string;
  // 应用等级名称
  appLevel?: string;
  // 技术栈名称
  buildpackName?: string;
  // 应用创建时间
  creationTime?: string;
  // 应用描述
  description?: string;
  // 应用负责人登录名
  ownerLoginName?: string;
  // 应用状态。取值列表：
  //                             CREATING：应用创建中；
  //                             CREATED：应用成功创建，可正常使用；
  //                             CREATE_FAILED：应用创建失败
  //                         
  status?: string;
  // 发布模式， package，image，mixed
  deployType?: string;
  // 全局唯一名字
  globalName?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      alias: 'alias',
      applicationName: 'application_name',
      appExtraInfos: 'app_extra_infos',
      appGroupName: 'app_group_name',
      appLevel: 'app_level',
      buildpackName: 'buildpack_name',
      creationTime: 'creation_time',
      description: 'description',
      ownerLoginName: 'owner_login_name',
      status: 'status',
      deployType: 'deploy_type',
      globalName: 'global_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      alias: 'string',
      applicationName: 'string',
      appExtraInfos: { 'type': 'array', 'itemType': AppExtraInfo },
      appGroupName: 'string',
      appLevel: 'string',
      buildpackName: 'string',
      creationTime: 'string',
      description: 'string',
      ownerLoginName: 'string',
      status: 'string',
      deployType: 'string',
      globalName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetApplicationServiceRequest extends $tea.Model {
  authToken?: string;
  // 待查询的应用名称。最大60个UTF-8字符
  applicationName?: string;
  // 待查询服务实例名称
  serviceName?: string;
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      applicationName: 'application_name',
      serviceName: 'service_name',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      applicationName: 'string',
      serviceName: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetApplicationServiceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 应用名称
  applicationName?: string;
  // 技术栈版本
  buildpackVersion?: string;
  // 关联的部署单元
  cellIds?: string[];
  // 服务实例描述
  description?: string;
  // 用户自定义的扩展属性
  extraInfos?: string;
  // 最近一次执行的运维操作单号
  latestOperationId?: string;
  // 最近一次执行的运维操作类型。取值列表：
  //                             DEPLOYMENT：部署操作
  //                         
  latestOperationType?: string;
  // 最近成功部署的版本号
  latestVersionNo?: string;
  // 服务实例名称
  serviceName?: string;
  // 环境名称
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      applicationName: 'application_name',
      buildpackVersion: 'buildpack_version',
      cellIds: 'cell_ids',
      description: 'description',
      extraInfos: 'extra_infos',
      latestOperationId: 'latest_operation_id',
      latestOperationType: 'latest_operation_type',
      latestVersionNo: 'latest_version_no',
      serviceName: 'service_name',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      applicationName: 'string',
      buildpackVersion: 'string',
      cellIds: { 'type': 'array', 'itemType': 'string' },
      description: 'string',
      extraInfos: 'string',
      latestOperationId: 'string',
      latestOperationType: 'string',
      latestVersionNo: 'string',
      serviceName: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApplicationServiceRequest extends $tea.Model {
  authToken?: string;
  // 待查询的应用名称。最大60个UTF-8字符
  applicationName?: string;
  // 当前页码，默认为1
  pageNum?: number;
  // 分页大小，默认10，最大50
  pageSize?: number;
  // 目标环境名称
  workspaces?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      applicationName: 'application_name',
      pageNum: 'page_num',
      pageSize: 'page_size',
      workspaces: 'workspaces',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      applicationName: 'string',
      pageNum: 'number',
      pageSize: 'number',
      workspaces: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApplicationServiceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 当前页码
  pageNum?: number;
  // 分页大小
  pageSize?: number;
  // 服务实例列表
  services?: AppService[];
  // 应用总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pageNum: 'page_num',
      pageSize: 'page_size',
      services: 'services',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pageNum: 'number',
      pageSize: 'number',
      services: { 'type': 'array', 'itemType': AppService },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteApplicationServiceRequest extends $tea.Model {
  authToken?: string;
  // 待删除的服务实例的应用名称
  applicationName?: string;
  // 待删除服务实例名称
  serviceName?: string;
  // 待删除服务实例所在环境名称
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      applicationName: 'application_name',
      serviceName: 'service_name',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      applicationName: 'string',
      serviceName: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteApplicationServiceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class GetApplicationPackageRequest extends $tea.Model {
  authToken?: string;
  // 发布包所属的应用名称。最大60个UTF-8字符
  applicationName?: string;
  // 版本号。长度不超过50个单字节字符
  versionNo?: string;
  // 环境
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      applicationName: 'application_name',
      versionNo: 'version_no',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      applicationName: 'string',
      versionNo: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetApplicationPackageResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 应用发布包所属应用名字
  appName?: string;
  // 应用发布包创建时间
  creationTime?: string;
  // 应用发布包下载地址
  downloadUrl?: string;
  // 应用发布包的校验码
  etag?: string;
  // 应用发布包名称
  name?: string;
  // 应用发布包备注
  versionMemo?: string;
  // 应用发布包版本
  versionNo?: string;
  // 应用发布包所属环境
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appName: 'app_name',
      creationTime: 'creation_time',
      downloadUrl: 'download_url',
      etag: 'etag',
      name: 'name',
      versionMemo: 'version_memo',
      versionNo: 'version_no',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appName: 'string',
      creationTime: 'string',
      downloadUrl: 'string',
      etag: 'string',
      name: 'string',
      versionMemo: 'string',
      versionNo: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppVersionRequest extends $tea.Model {
  authToken?: string;
  // 版本构建id
  buildId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      buildId: 'build_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      buildId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppVersionResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 应用发布包详情
  version?: AppVersion;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      version: AppVersion,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteApplicationRequest extends $tea.Model {
  authToken?: string;
  // 目标应用完整名称
  applicationName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      applicationName: 'application_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      applicationName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteApplicationResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ListApplicationRequest extends $tea.Model {
  authToken?: string;
  // 当前页码，默认为1
  pageNum?: number;
  // 分页大小，默认10
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListApplicationResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 应用名称列表
  applicationNames?: string[];
  // 当前页码
  pageNum?: number;
  // 分页大小
  pageSize?: number;
  // 应用总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      applicationNames: 'application_names',
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      applicationNames: { 'type': 'array', 'itemType': 'string' },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAppgroupRequest extends $tea.Model {
  authToken?: string;
  // 当前页码，默认为1
  pageNum?: number;
  // 分页大小，默认10
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAppgroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 应用名称列表
  appGroups?: AppGroup[];
  // 当前页码
  pageNum?: number;
  // 分页大小
  pageSize?: number;
  // 应用总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appGroups: 'app_groups',
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appGroups: { 'type': 'array', 'itemType': AppGroup },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApplicationComputerRequest extends $tea.Model {
  authToken?: string;
  // 目标服务实例名称，填写application时有意义。application不填时，service_name的值会被忽略
  application?: string;
  // assign=true代表分配了app/appservice的computer,反之代表没有分配app/appservice的computer
  assign?: boolean;
  // 资源类型
  computerType?: string;
  // cpu核数
  cpu?: number;
  // 内存大小，单位MB
  memory?: number;
  // 资源名称
  name?: string;
  // 当前页码，默认为1
  pageNum?: number;
  // 分页大小，默认10
  pageSize?: number;
  // 目标服务实例名称
  serviceName?: string;
  // 资源所处的状态，可指定多个
  statuses?: string[];
  // 目标工作空间名称
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      application: 'application',
      assign: 'assign',
      computerType: 'computer_type',
      cpu: 'cpu',
      memory: 'memory',
      name: 'name',
      pageNum: 'page_num',
      pageSize: 'page_size',
      serviceName: 'service_name',
      statuses: 'statuses',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      application: 'string',
      assign: 'boolean',
      computerType: 'string',
      cpu: 'number',
      memory: 'number',
      name: 'string',
      pageNum: 'number',
      pageSize: 'number',
      serviceName: 'string',
      statuses: { 'type': 'array', 'itemType': 'string' },
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApplicationComputerResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 资源列表
  computers?: Computer[];
  // 当前页码
  pageNum?: number;
  // 分页大小
  pageSize?: number;
  // 资源总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      computers: 'computers',
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      computers: { 'type': 'array', 'itemType': Computer },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetApplicationRepositoryRequest extends $tea.Model {
  authToken?: string;
  // 待查询的应用名称。最大60个UTF-8字符
  applicationName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      applicationName: 'application_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      applicationName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetApplicationRepositoryResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 代码库信息
  repository?: Repository;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      repository: 'repository',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      repository: Repository,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppgroupRequest extends $tea.Model {
  authToken?: string;
  // 应用分组名称
  name?: string;
  // 当前页码，默认为1
  pageNum?: number;
  // 分页大小，默认10
  pageSize?: number;
  // 租户名称
  tenant?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      pageNum: 'page_num',
      pageSize: 'page_size',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      pageNum: 'number',
      pageSize: 'number',
      tenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppgroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 应用分组列表
  appGroups?: AppGroup[];
  // 当前页码
  pageNum?: number;
  // 分页大小
  pageSize?: number;
  // 资源总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appGroups: 'app_groups',
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appGroups: { 'type': 'array', 'itemType': AppGroup },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApplevelRequest extends $tea.Model {
  authToken?: string;
  // 应用等级名称
  name?: string;
  // 当前页码，默认为1
  pageNum?: number;
  // 分页大小，默认10
  pageSize?: number;
  // 租户名称
  tenant?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      pageNum: 'page_num',
      pageSize: 'page_size',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      pageNum: 'number',
      pageSize: 'number',
      tenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApplevelResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 应用等级列表
  appLevels?: AppLevel[];
  // 当前页码
  pageNum?: number;
  // 分页大小
  pageSize?: number;
  // 资源总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appLevels: 'app_levels',
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appLevels: { 'type': 'array', 'itemType': AppLevel },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApplicationRequest extends $tea.Model {
  authToken?: string;
  // 应用名称
  applicationName?: string;
  // 应用分组名
  appGroupName?: string;
  // 应用级别
  appLevelName?: string;
  // 登录名
  ownerLoginName?: string;
  // 当前页码，默认为1
  pageNum?: number;
  // 分页大小，默认10
  pageSize?: number;
  // 查询结果是否返回应用额外元数据信息。此字段为 true 时，为保证查询效率，列表大小将强制修改为 10 （若超过）
  queryExtraInfo?: boolean;
  // 租户名称
  tenant?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      applicationName: 'application_name',
      appGroupName: 'app_group_name',
      appLevelName: 'app_level_name',
      ownerLoginName: 'owner_login_name',
      pageNum: 'page_num',
      pageSize: 'page_size',
      queryExtraInfo: 'query_extra_info',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      applicationName: 'string',
      appGroupName: 'string',
      appLevelName: 'string',
      ownerLoginName: 'string',
      pageNum: 'number',
      pageSize: 'number',
      queryExtraInfo: 'boolean',
      tenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApplicationResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 应用列表
  applications?: ApplicationInfo[];
  // 当前页码
  pageNum?: number;
  // 分页大小
  pageSize?: number;
  // 资源总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      applications: 'applications',
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      applications: { 'type': 'array', 'itemType': ApplicationInfo },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAppVersionRequest extends $tea.Model {
  authToken?: string;
  // 目标应用完整名称
  applicationName?: string;
  // 应用部署包文件16字节md5值，以32位十六进制字符表示，不区分大小写。如果提供，APPMS下载应用部署包完成后，将会以此md5值进行校验，检验不通过则认为下载失败
  //                         
  fileMd5?: string;
  // 应用部署包文件路径。长度不超过1024个单字节字符
  filePath?: string;
  // 应用部署包文件大小，单位字节。取值范围[1,524288000]，即最大支持500M, 524288000 = 500 x 1024 x 1024
  //                         
  fileSize?: number;
  // 文件交换源id
  fileSource?: string;
  // 目标租户名称
  tenant?: string;
  // 版本备注。长度不超过100个双字节字符
  versionMemo?: string;
  // 版本号。长度不超过50个单字节字符
  versionNo?: string;
  // 目标工作空间名称
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      applicationName: 'application_name',
      fileMd5: 'file_md5',
      filePath: 'file_path',
      fileSize: 'file_size',
      fileSource: 'file_source',
      tenant: 'tenant',
      versionMemo: 'version_memo',
      versionNo: 'version_no',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      applicationName: 'string',
      fileMd5: 'string',
      filePath: 'string',
      fileSize: 'number',
      fileSource: 'string',
      tenant: 'string',
      versionMemo: 'string',
      versionNo: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAppVersionResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 发布包任务id，可用于查询应用发布包生成状态
  buildId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      buildId: 'build_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      buildId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppDeltaRequest extends $tea.Model {
  authToken?: string;
  // 结束时间点
  endTime?: string;
  // 开始时间点
  startTime?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      endTime: 'end_time',
      startTime: 'start_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      endTime: 'string',
      startTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppDeltaResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 发生变化的租户列表
  tenants?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tenants: 'tenants',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tenants: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApplicationLoadbalancerRequest extends $tea.Model {
  authToken?: string;
  // 目标服务实例名称，填写application时有意义。application不填时，service_name的值会被忽略
  application?: string;
  // 资源名称
  name?: string;
  // VIP类型
  networkType?: string;
  // 当前页码，默认为1
  pageNum?: number;
  // 分页大小，默认10
  pageSize?: number;
  // 目标服务实例名称
  serviceName?: string;
  // 资源所处的状态，可指定多个
  statuses?: string[];
  // vip地址
  vipAddress?: string;
  // address 类型：INTERNET, INTRANET
  vipAddressType?: string;
  // VIP类型
  vipType?: string;
  // vpc的id
  vpcIds?: string[];
  // 目标工作空间名称
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      application: 'application',
      name: 'name',
      networkType: 'network_type',
      pageNum: 'page_num',
      pageSize: 'page_size',
      serviceName: 'service_name',
      statuses: 'statuses',
      vipAddress: 'vip_address',
      vipAddressType: 'vip_address_type',
      vipType: 'vip_type',
      vpcIds: 'vpc_ids',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      application: 'string',
      name: 'string',
      networkType: 'string',
      pageNum: 'number',
      pageSize: 'number',
      serviceName: 'string',
      statuses: { 'type': 'array', 'itemType': 'string' },
      vipAddress: 'string',
      vipAddressType: 'string',
      vipType: 'string',
      vpcIds: { 'type': 'array', 'itemType': 'string' },
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApplicationLoadbalancerResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 负载均衡资源列表
  loadbalancers?: DepsLoadBalancer[];
  // 当前页码
  pageNum?: number;
  // 分页大小
  pageSize?: number;
  // 应用总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      loadbalancers: 'loadbalancers',
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      loadbalancers: { 'type': 'array', 'itemType': DepsLoadBalancer },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApplicationDatabaseRequest extends $tea.Model {
  authToken?: string;
  // 目标服务实例名称，填写application时有意义。application不填时，service_name的值会被忽略
  application?: string;
  // 连接地址
  connectionAddress?: string;
  // 资源名称
  name?: string;
  // 网络类型，Classic或VPC
  networkType?: string;
  // 网络连接类型，取值 Internet：外网，Intranet：内网
  netType?: string;
  // 当前页码，默认为1
  pageNum?: number;
  // 分页大小，默认10
  pageSize?: number;
  // 连接端口
  port?: number;
  // 目标服务实例名称
  serviceName?: string;
  // 资源所处的状态，可指定多个
  statuses?: string[];
  // 目标工作空间名称
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      application: 'application',
      connectionAddress: 'connection_address',
      name: 'name',
      networkType: 'network_type',
      netType: 'net_type',
      pageNum: 'page_num',
      pageSize: 'page_size',
      port: 'port',
      serviceName: 'service_name',
      statuses: 'statuses',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      application: 'string',
      connectionAddress: 'string',
      name: 'string',
      networkType: 'string',
      netType: 'string',
      pageNum: 'number',
      pageSize: 'number',
      port: 'number',
      serviceName: 'string',
      statuses: { 'type': 'array', 'itemType': 'string' },
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApplicationDatabaseResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 资源列表
  databases?: DepsDatabase[];
  // 当前页码
  pageNum?: number;
  // 分页大小
  pageSize?: number;
  // 应用总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      databases: 'databases',
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      databases: { 'type': 'array', 'itemType': DepsDatabase },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadApplicationPackageRequest extends $tea.Model {
  authToken?: string;
  // 目标应用完整名称
  applicationName?: string;
  // 应用发布包名称。长度不超过100个双字节字符
  packageName?: string;
  // 目标租户名称
  tenant?: string;
  // 版本号。长度不超过50个单字节字符
  versionNo?: string;
  // 目标工作空间名称
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      applicationName: 'application_name',
      packageName: 'package_name',
      tenant: 'tenant',
      versionNo: 'version_no',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      applicationName: 'string',
      packageName: 'string',
      tenant: 'string',
      versionNo: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadApplicationPackageResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 上传oss的bucket名称
  bucketName?: string;
  // 上传应用发布包的授权签名上传地址
  signedUploadUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bucketName: 'bucket_name',
      signedUploadUrl: 'signed_upload_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bucketName: 'string',
      signedUploadUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncreateApplicationVersionRequest extends $tea.Model {
  authToken?: string;
  // 目标应用完整名称
  applicationName?: string;
  // 应用部署包文件16字节md5值，以32位十六进制字符表示，不区分大小写。如果提供，将会以此md5值进行校验，检验不通过则认为创建失败
  //                                 
  packageEtag?: string;
  // 应用发布包名称。长度不超过100个双字节字符
  packageName?: string;
  // 目标租户名称
  tenant?: string;
  // 应用发布包备注
  versionMemo?: string;
  // 版本号。长度不超过50个单字节字符
  versionNo?: string;
  // 目标工作空间名称
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      applicationName: 'application_name',
      packageEtag: 'package_etag',
      packageName: 'package_name',
      tenant: 'tenant',
      versionMemo: 'version_memo',
      versionNo: 'version_no',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      applicationName: 'string',
      packageEtag: 'string',
      packageName: 'string',
      tenant: 'string',
      versionMemo: 'string',
      versionNo: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncreateApplicationVersionResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ListCloudconnectorConnectionRequest extends $tea.Model {
  authToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCloudconnectorConnectionResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // List<Connection>
  data?: Connection[];
  // startIndex
  startIndex?: number;
  // pageSize
  pageSize?: number;
  // totalSize
  totalSize?: number;
  // currentPage
  currentPage?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      startIndex: 'start_index',
      pageSize: 'page_size',
      totalSize: 'total_size',
      currentPage: 'current_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': Connection },
      startIndex: 'number',
      pageSize: 'number',
      totalSize: 'number',
      currentPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppservicebuildpackrelationRequest extends $tea.Model {
  authToken?: string;
  // 一组应用服务id
  appserviceIds?: string[];
  // 一组应用id
  // 
  appIds?: string[];
  // buildpackArch
  buildpackArch?: string;
  // buildpackIds
  buildpackIds?: string[];
  // 当前页
  currentPage?: number;
  // 是否降序
  descend?: boolean;
  // ids
  ids?: string[];
  // 每页个数
  pageSize?: number;
  // 分类
  sortField?: string;
  // 开始索引
  startIndex?: number;
  // techstackIdentities
  techstackIdentities?: string[];
  // 一组技术栈id
  techstackIds?: string[];
  // workspaceId
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appserviceIds: 'appservice_ids',
      appIds: 'app_ids',
      buildpackArch: 'buildpack_arch',
      buildpackIds: 'buildpack_ids',
      currentPage: 'current_page',
      descend: 'descend',
      ids: 'ids',
      pageSize: 'page_size',
      sortField: 'sort_field',
      startIndex: 'start_index',
      techstackIdentities: 'techstack_identities',
      techstackIds: 'techstack_ids',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appserviceIds: { 'type': 'array', 'itemType': 'string' },
      appIds: { 'type': 'array', 'itemType': 'string' },
      buildpackArch: 'string',
      buildpackIds: { 'type': 'array', 'itemType': 'string' },
      currentPage: 'number',
      descend: 'boolean',
      ids: { 'type': 'array', 'itemType': 'string' },
      pageSize: 'number',
      sortField: 'string',
      startIndex: 'number',
      techstackIdentities: { 'type': 'array', 'itemType': 'string' },
      techstackIds: { 'type': 'array', 'itemType': 'string' },
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppservicebuildpackrelationResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // app_service_buildpack_relations
  appServiceBuildpackRelations?: AppServiceBuildpackRelation[];
  // current_page
  currentPage?: number;
  // page_size
  pageSize?: number;
  // total_count
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appServiceBuildpackRelations: 'app_service_buildpack_relations',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appServiceBuildpackRelations: { 'type': 'array', 'itemType': AppServiceBuildpackRelation },
      currentPage: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAppservicebuildpackrelationRequest extends $tea.Model {
  authToken?: string;
  // new_app_service
  newAppService?: BuildpackAppService;
  // original_app_service
  originalAppService?: BuildpackAppService;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      newAppService: 'new_app_service',
      originalAppService: 'original_app_service',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      newAppService: BuildpackAppService,
      originalAppService: BuildpackAppService,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAppservicebuildpackrelationResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryAppserviceenvparamRequest extends $tea.Model {
  authToken?: string;
  // appIds
  appIds?: string[];
  // appServiceIds
  appServiceIds?: string[];
  // buildpackIds
  buildpackIds?: string[];
  // creationTimeFrom
  creationTimeFrom?: string;
  // creationTimeTo
  creationTimeTo?: string;
  // 当前页
  currentPage?: number;
  // defaultValue
  defaultValue?: string;
  // 是否降序
  descend?: boolean;
  // ids
  ids?: string[];
  // isProcessed
  isProcessed?: boolean;
  // key
  key?: string;
  // modificationTimeFrom
  modificationTimeFrom?: string;
  // modificationTimeTo
  modificationTimeTo?: string;
  // 每页个数
  pageSize?: number;
  // 分类
  sortField?: string;
  // 开始索引
  startIndex?: number;
  // value
  value?: string;
  // workspaceId
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appIds: 'app_ids',
      appServiceIds: 'app_service_ids',
      buildpackIds: 'buildpack_ids',
      creationTimeFrom: 'creation_time_from',
      creationTimeTo: 'creation_time_to',
      currentPage: 'current_page',
      defaultValue: 'default_value',
      descend: 'descend',
      ids: 'ids',
      isProcessed: 'is_processed',
      key: 'key',
      modificationTimeFrom: 'modification_time_from',
      modificationTimeTo: 'modification_time_to',
      pageSize: 'page_size',
      sortField: 'sort_field',
      startIndex: 'start_index',
      value: 'value',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appIds: { 'type': 'array', 'itemType': 'string' },
      appServiceIds: { 'type': 'array', 'itemType': 'string' },
      buildpackIds: { 'type': 'array', 'itemType': 'string' },
      creationTimeFrom: 'string',
      creationTimeTo: 'string',
      currentPage: 'number',
      defaultValue: 'string',
      descend: 'boolean',
      ids: { 'type': 'array', 'itemType': 'string' },
      isProcessed: 'boolean',
      key: 'string',
      modificationTimeFrom: 'string',
      modificationTimeTo: 'string',
      pageSize: 'number',
      sortField: 'string',
      startIndex: 'number',
      value: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppserviceenvparamResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // app_service_env_params
  appServiceEnvParams?: AppServiceEnvParam[];
  // current_page
  currentPage?: number;
  // page_size
  pageSize?: number;
  // total_count
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appServiceEnvParams: 'app_service_env_params',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appServiceEnvParams: { 'type': 'array', 'itemType': AppServiceEnvParam },
      currentPage: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppserviceenvparamGroupbyappservicesRequest extends $tea.Model {
  authToken?: string;
  // appServiceIds
  appServiceIds?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appServiceIds: 'app_service_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appServiceIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppserviceenvparamGroupbyappservicesResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 环境变量json字符串
  appServiceEnvParam?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appServiceEnvParam: 'app_service_env_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appServiceEnvParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppserviceenvparamQuerywithdiffRequest extends $tea.Model {
  authToken?: string;
  // appServiceId
  appServiceId?: string;
  // buildpackId
  buildpackId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appServiceId: 'app_service_id',
      buildpackId: 'buildpack_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appServiceId: 'string',
      buildpackId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppserviceenvparamQuerywithdiffResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // json字符串
  appServiceEnvParamDiff?: AppServiceEnvParam[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appServiceEnvParamDiff: 'app_service_env_param_diff',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appServiceEnvParamDiff: { 'type': 'array', 'itemType': AppServiceEnvParam },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAppserviceenvparamUpdateparamsRequest extends $tea.Model {
  authToken?: string;
  // appServiceId
  appServiceId?: string;
  // buildpackId
  buildpackId?: string;
  // params
  params?: AppServiceEnvParam[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appServiceId: 'app_service_id',
      buildpackId: 'buildpack_id',
      params: 'params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appServiceId: 'string',
      buildpackId: 'string',
      params: { 'type': 'array', 'itemType': AppServiceEnvParam },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAppserviceenvparamUpdateparamsResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // AppServiceEnvParam集合
  appServiceEnvParam?: AppServiceEnvParam[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appServiceEnvParam: 'app_service_env_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appServiceEnvParam: { 'type': 'array', 'itemType': AppServiceEnvParam },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApptechstackrelationRequest extends $tea.Model {
  authToken?: string;
  // 一组应用id
  appIds?: string[];
  // buildpack_arch
  buildpackArch?: string;
  // creation_fime_from
  // 
  creationTimeFrom?: string;
  // creation_time_to
  // 
  creationTimeTo?: string;
  // current_page
  // 
  currentPage?: number;
  // 是否降序
  descend?: string;
  // ids
  ids?: number[];
  // isProcessed
  isProcessed?: boolean;
  // modification_time_from
  // 
  modificationTimeFrom?: string;
  // modification_time_to
  // 
  modificationTimeTo?: string;
  // page_size
  // 
  pageSize?: number;
  // 分类
  sortField?: string;
  // start_index
  // 
  startIndex?: number;
  // techstack_identities
  // 
  techstackIdentities?: string;
  // techstack_ids
  // 
  techstackIds?: number[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appIds: 'app_ids',
      buildpackArch: 'buildpack_arch',
      creationTimeFrom: 'creation_time_from',
      creationTimeTo: 'creation_time_to',
      currentPage: 'current_page',
      descend: 'descend',
      ids: 'ids',
      isProcessed: 'is_processed',
      modificationTimeFrom: 'modification_time_from',
      modificationTimeTo: 'modification_time_to',
      pageSize: 'page_size',
      sortField: 'sort_field',
      startIndex: 'start_index',
      techstackIdentities: 'techstack_identities',
      techstackIds: 'techstack_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appIds: { 'type': 'array', 'itemType': 'string' },
      buildpackArch: 'string',
      creationTimeFrom: 'string',
      creationTimeTo: 'string',
      currentPage: 'number',
      descend: 'string',
      ids: { 'type': 'array', 'itemType': 'number' },
      isProcessed: 'boolean',
      modificationTimeFrom: 'string',
      modificationTimeTo: 'string',
      pageSize: 'number',
      sortField: 'string',
      startIndex: 'number',
      techstackIdentities: 'string',
      techstackIds: { 'type': 'array', 'itemType': 'number' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApptechstackrelationResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // app_techstack_relations
  appTechstackRelations?: AppTechstackRelation[];
  // current_page
  currentPage?: number;
  // page_size
  pageSize?: number;
  // total_count
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appTechstackRelations: 'app_techstack_relations',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appTechstackRelations: { 'type': 'array', 'itemType': AppTechstackRelation },
      currentPage: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateApptechstackrelationRequest extends $tea.Model {
  authToken?: string;
  // appId
  appId?: string;
  // buildpackArch
  buildpackArch?: string;
  // creationTime
  creationTime?: string;
  // extraInfo
  extraInfo?: string;
  // id
  id?: string;
  // modificationTime
  modificationTime?: string;
  // techstackId
  techstackId?: number;
  // techstackIdentity
  techstackIdentity?: string;
  // techstackName
  techstackName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appId: 'app_id',
      buildpackArch: 'buildpack_arch',
      creationTime: 'creation_time',
      extraInfo: 'extra_info',
      id: 'id',
      modificationTime: 'modification_time',
      techstackId: 'techstack_id',
      techstackIdentity: 'techstack_identity',
      techstackName: 'techstack_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appId: 'string',
      buildpackArch: 'string',
      creationTime: 'string',
      extraInfo: 'string',
      id: 'string',
      modificationTime: 'string',
      techstackId: 'number',
      techstackIdentity: 'string',
      techstackName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateApptechstackrelationResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateAppRequest extends $tea.Model {
  authToken?: string;
  // 应用所属分组，至于应用所属分组的级别需要后端根据分组名称计算出来
  appgroupName?: string;
  // 应用描述
  description?: string;
  // 显示名称
  displayName?: string;
  // 应用名称
  name?: string;
  // 用户登录名
  ownerLoginName?: string;
  // 技术栈 id
  stackId?: string;
  // 应用额外信息（应用标签）
  tags?: Tag[];
  // 技术栈版本
  buildpackVersion?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appgroupName: 'appgroup_name',
      description: 'description',
      displayName: 'display_name',
      name: 'name',
      ownerLoginName: 'owner_login_name',
      stackId: 'stack_id',
      tags: 'tags',
      buildpackVersion: 'buildpack_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appgroupName: 'string',
      description: 'string',
      displayName: 'string',
      name: 'string',
      ownerLoginName: 'string',
      stackId: 'string',
      tags: { 'type': 'array', 'itemType': Tag },
      buildpackVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAppResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 创建的应用 id
  data?: string;
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
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAppGroupRequest extends $tea.Model {
  authToken?: string;
  // 应用依赖规划
  appScheme?: AppDepend[];
  // 应用分组描述
  description?: string;
  // 应用分组名称，支持中文
  name?: string;
  // 应用分组负责人登录名
  ownerLoginName?: string;
  // 父应用分组 id
  parentId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appScheme: 'app_scheme',
      description: 'description',
      name: 'name',
      ownerLoginName: 'owner_login_name',
      parentId: 'parent_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appScheme: { 'type': 'array', 'itemType': AppDepend },
      description: 'string',
      name: 'string',
      ownerLoginName: 'string',
      parentId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAppGroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 创建的应用分组名称
  data?: string;
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
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAppRequest extends $tea.Model {
  authToken?: string;
  // 待查询的应用名称
  name?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAppResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 应用基本信息
  data?: App;
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
      data: App,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountAppServiceRequest extends $tea.Model {
  authToken?: string;
  // 应用名称
  appName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appName: 'app_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountAppServiceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 应用服务计数
  data?: AppServiceCount;
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
      data: AppServiceCount,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllAppDeployviewRequest extends $tea.Model {
  authToken?: string;
  // 应用名称
  appName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appName: 'app_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllAppDeployviewResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 所有 workspace 的部署图/拓扑图
  data?: DeployView[];
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
      data: { 'type': 'array', 'itemType': DeployView },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppRequest extends $tea.Model {
  authToken?: string;
  // 根据应用分组查询，为空默认查询所有应用分组
  appGroupName?: string;
  // 根据应用名称查询，为空默认查询所有应用
  appName?: string;
  // 排序规则数组，默认为 UTC_CREATED_DESC，即 根据创建时间降序排序
  orders?: string[];
  // 当前页码，从1开始，默认为1
  pageNum?: number;
  // 分页大小，默认为10
  pageSize?: number;
  // 查询类型，支持精准查询、模糊查询、前缀模糊查询，这里默认为模糊查询；查询类型针对字段 app_name, app_group_name
  queryType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appGroupName: 'app_group_name',
      appName: 'app_name',
      orders: 'orders',
      pageNum: 'page_num',
      pageSize: 'page_size',
      queryType: 'query_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appGroupName: 'string',
      appName: 'string',
      orders: { 'type': 'array', 'itemType': 'string' },
      pageNum: 'number',
      pageSize: 'number',
      queryType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 查询到的应用列表，包含每个应用的分组信息
  data?: App[];
  // 当前页
  pageNum?: number;
  // 分页大小
  pageSize?: number;
  // 记录总数
  total?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      pageNum: 'page_num',
      pageSize: 'page_size',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': App },
      pageNum: 'number',
      pageSize: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAppGroupRequest extends $tea.Model {
  authToken?: string;
  // 应用分组名称
  name?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAppGroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 应用分组
  data?: AppGroup;
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
      data: AppGroup,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppGroupRequest extends $tea.Model {
  authToken?: string;
  // 根据应用分组名称查询
  appGroupName?: string;
  // 根据应用分组层级进行筛选
  layer?: number;
  // 排序规则数组，默认为 UTC_CREATED_DESC，即 根据创建时间降序排序
  orders?: string[];
  // 根据应用分组负责人登录名查询
  ownerLoginName?: string;
  // 当前页码，从1开始，默认为1
  pageNum?: number;
  // 分页大小，默认为10
  pageSize?: number;
  // 查询类型，支持精准查询、模糊查询、前缀模糊查询，这里默认为模糊查询；查询类型针对字段, app_group_name, owner_login_name
  queryType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appGroupName: 'app_group_name',
      layer: 'layer',
      orders: 'orders',
      ownerLoginName: 'owner_login_name',
      pageNum: 'page_num',
      pageSize: 'page_size',
      queryType: 'query_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appGroupName: 'string',
      layer: 'number',
      orders: { 'type': 'array', 'itemType': 'string' },
      ownerLoginName: 'string',
      pageNum: 'number',
      pageSize: 'number',
      queryType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppGroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 查询到的应用列表，包含每个应用的分组信息
  data?: AppGroup[];
  // 当前页
  pageNum?: number;
  // 分页大小
  pageSize?: number;
  // 记录总数
  total?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      pageNum: 'page_num',
      pageSize: 'page_size',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': AppGroup },
      pageNum: 'number',
      pageSize: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppServiceRequest extends $tea.Model {
  authToken?: string;
  // 根据应用名称查询，不能为空，不支持一次性查询所有应用
  appName?: string;
  // 排序规则数组，默认为 UTC_CREATED_DESC，即 根据创建时间降序排序
  orders?: string[];
  // 当前页码，从1开始，默认为1
  pageNum?: number;
  // 分页大小，默认为10
  pageSize?: number;
  // 工作空间列表
  workspaceIds?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appName: 'app_name',
      orders: 'orders',
      pageNum: 'page_num',
      pageSize: 'page_size',
      workspaceIds: 'workspace_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appName: 'string',
      orders: { 'type': 'array', 'itemType': 'string' },
      pageNum: 'number',
      pageSize: 'number',
      workspaceIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppServiceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 应用服务实例列表，每个应用服务实例包含 slb、ecs、db 等信息
  data?: AppServiceEntity[];
  // 当前页码
  pageNum?: number;
  // 分页大小
  pageSize?: number;
  // 总数
  total?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      pageNum: 'page_num',
      pageSize: 'page_size',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': AppServiceEntity },
      pageNum: 'number',
      pageSize: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAppFavouriteRequest extends $tea.Model {
  authToken?: string;
  // 用户要收藏的应用名称
  appName?: string;
  // 用户登录名
  ownerLoginName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appName: 'app_name',
      ownerLoginName: 'owner_login_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appName: 'string',
      ownerLoginName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAppFavouriteResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 收藏成功的记录id
  data?: string;
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
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAppFavouriteRequest extends $tea.Model {
  authToken?: string;
  // 用户要取消收藏的应用名称
  appName?: string;
  // 用户登录名
  ownerLoginName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appName: 'app_name',
      ownerLoginName: 'owner_login_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appName: 'string',
      ownerLoginName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAppFavouriteResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 是否取消收藏成功
  data?: boolean;
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
      data: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAppRequest extends $tea.Model {
  authToken?: string;
  // 应用所属分组，至于应用所属分组的级别需要后端根据分组名称计算出来
  appgroupName?: string;
  // 技术栈版本
  buildpackVersion?: string;
  // 应用描述
  description?: string;
  // 显示名称
  displayName?: string;
  // 应用名称
  name?: string;
  // 应用额外信息（应用标签）
  tags?: Tag[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appgroupName: 'appgroup_name',
      buildpackVersion: 'buildpack_version',
      description: 'description',
      displayName: 'display_name',
      name: 'name',
      tags: 'tags',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appgroupName: 'string',
      buildpackVersion: 'string',
      description: 'string',
      displayName: 'string',
      name: 'string',
      tags: { 'type': 'array', 'itemType': Tag },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAppResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 是否更新成功
  data?: boolean;
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
      data: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAppGroupRequest extends $tea.Model {
  authToken?: string;
  // 应用依赖拓扑图
  appScheme?: AppDepend[];
  // 应用分组描述
  description?: string;
  // 应用分组名称，支持中文
  name?: string;
  // 父应用分组 id
  parentId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appScheme: 'app_scheme',
      description: 'description',
      name: 'name',
      parentId: 'parent_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appScheme: { 'type': 'array', 'itemType': AppDepend },
      description: 'string',
      name: 'string',
      parentId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAppGroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 是否更新成功
  data?: boolean;
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
      data: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAppFavouriteRequest extends $tea.Model {
  authToken?: string;
  // 排序规则数组，默认为 UTC_CREATED_DESC，即 根据创建时间降序排序
  orders?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      orders: 'orders',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      orders: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAppFavouriteResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 当前用户收藏的所有应用
  data?: App[];
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
      data: { 'type': 'array', 'itemType': App },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAppRequest extends $tea.Model {
  authToken?: string;
  // 要删除的应用名称
  name?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAppResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 是否删除成功
  data?: boolean;
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
      data: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAppGroupRequest extends $tea.Model {
  authToken?: string;
  // 要删除的应用分组名称
  name?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAppGroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 是否删除成功
  data?: boolean;
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
      data: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppPlanRequest extends $tea.Model {
  authToken?: string;
  // 应用名称
  appName?: string;
  // 排序规则数组，默认为 UTC_CREATED_DESC，即 根据创建时间降序排序
  orders?: string[];
  // 发布单 order_id
  orderId?: string;
  // 当前页码，从1开始，默认为1
  pageNum?: number;
  // 分页大小，默认为10
  pageSize?: number;
  // 状态筛选列表
  stateList?: string[];
  // 工作空间名称
  workspace?: string;
  // 工作空间 id 列表
  workspaceIds?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appName: 'app_name',
      orders: 'orders',
      orderId: 'order_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
      stateList: 'state_list',
      workspace: 'workspace',
      workspaceIds: 'workspace_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appName: 'string',
      orders: { 'type': 'array', 'itemType': 'string' },
      orderId: 'string',
      pageNum: 'number',
      pageSize: 'number',
      stateList: { 'type': 'array', 'itemType': 'string' },
      workspace: 'string',
      workspaceIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppPlanResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 查询到的发布单列表
  data?: OpsPlan[];
  // 当前分页，默认为1
  pageNum?: number;
  // 分页大小，默认为10
  pageSize?: number;
  // 查询总数
  total?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      pageNum: 'page_num',
      pageSize: 'page_size',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': OpsPlan },
      pageNum: 'number',
      pageSize: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExistAppGroupRequest extends $tea.Model {
  authToken?: string;
  // 应用分组名称
  appgroupName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appgroupName: 'appgroup_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appgroupName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExistAppGroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 是否存在
  data?: boolean;
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
      data: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUserRequest extends $tea.Model {
  authToken?: string;
  // 没传递该参数时，返回当前登录用户信息
  loginName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      loginName: 'login_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      loginName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUserResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 用户信息
  data?: UserDTO;
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
      data: UserDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExistAppRequest extends $tea.Model {
  authToken?: string;
  // 应用名称
  appName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appName: 'app_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExistAppResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 是否存在
  data?: boolean;
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
      data: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetApplicationBuildpackRequest extends $tea.Model {
  authToken?: string;
  // 应用名称
  applicationName?: string;
  // 应用服务的名称
  serviceName?: string;
  // 环境
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      applicationName: 'application_name',
      serviceName: 'service_name',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      applicationName: 'string',
      serviceName: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetApplicationBuildpackResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 技术栈id
  buildpackId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      buildpackId: 'buildpack_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      buildpackId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetApplicationTechstackRequest extends $tea.Model {
  authToken?: string;
  // 应用名称
  applicationName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      applicationName: 'application_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      applicationName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetApplicationTechstackResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 技术栈框架
  techstack?: Techstack;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      techstack: 'techstack',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      techstack: Techstack,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetBuildpackRequest extends $tea.Model {
  authToken?: string;
  // 技术栈版本的ID
  buildpackId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      buildpackId: 'buildpack_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      buildpackId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetBuildpackResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // buildpackParams
  buildpackParams?: BuildpackParamTemplate[];
  // contactInfo
  contactInfo?: string;
  // creatorId
  creatorId?: string;
  // debugMode
  debugMode?: boolean;
  // depracationNote
  depracationNote?: string;
  // description
  description?: string;
  // fullVersion
  fullVersion?: string;
  // publicationTime
  publicationTime?: string;
  // publisherId
  publisherId?: string;
  // scope
  scope?: string;
  // sharedTenants
  sharedTenants?: string[];
  // status
  status?: string;
  // supportedOs
  supportedOs?: BuildpackOS[];
  // supportedRegions
  supportedRegions?: string[];
  // techstackId
  techstackId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      buildpackParams: 'buildpack_params',
      contactInfo: 'contact_info',
      creatorId: 'creator_id',
      debugMode: 'debug_mode',
      depracationNote: 'depracation_note',
      description: 'description',
      fullVersion: 'full_version',
      publicationTime: 'publication_time',
      publisherId: 'publisher_id',
      scope: 'scope',
      sharedTenants: 'shared_tenants',
      status: 'status',
      supportedOs: 'supported_os',
      supportedRegions: 'supported_regions',
      techstackId: 'techstack_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      buildpackParams: { 'type': 'array', 'itemType': BuildpackParamTemplate },
      contactInfo: 'string',
      creatorId: 'string',
      debugMode: 'boolean',
      depracationNote: 'string',
      description: 'string',
      fullVersion: 'string',
      publicationTime: 'string',
      publisherId: 'string',
      scope: 'string',
      sharedTenants: { 'type': 'array', 'itemType': 'string' },
      status: 'string',
      supportedOs: { 'type': 'array', 'itemType': BuildpackOS },
      supportedRegions: { 'type': 'array', 'itemType': 'string' },
      techstackId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListTechstackRequest extends $tea.Model {
  authToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListTechstackResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 技术栈列表
  techstacks?: Techstack[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      techstacks: 'techstacks',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      techstacks: { 'type': 'array', 'itemType': Techstack },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackRequest extends $tea.Model {
  authToken?: string;
  // 当前页码
  currentPage?: number;
  // 技术栈版本号
  fullVersion?: string;
  // 每页的大小
  pageSize?: number;
  // 开始时间
  publicationTimeFrom?: string;
  // 截至时间
  publicationTimeTo?: string;
  // 技术栈提供方所在域
  scopes?: string[];
  // 技术栈版本状态
  statuses?: string[];
  // 支持的操作系统ID列表
  supportedOsIds?: number[];
  // 支持的地域名称列表
  supportedRegions?: string[];
  // 技术栈ID列表
  techstackIds?: number[];
  // 技术栈名称
  techstackNames?: string[];
  // creatorIds
  creatorIds?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      currentPage: 'current_page',
      fullVersion: 'full_version',
      pageSize: 'page_size',
      publicationTimeFrom: 'publication_time_from',
      publicationTimeTo: 'publication_time_to',
      scopes: 'scopes',
      statuses: 'statuses',
      supportedOsIds: 'supported_os_ids',
      supportedRegions: 'supported_regions',
      techstackIds: 'techstack_ids',
      techstackNames: 'techstack_names',
      creatorIds: 'creator_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      currentPage: 'number',
      fullVersion: 'string',
      pageSize: 'number',
      publicationTimeFrom: 'string',
      publicationTimeTo: 'string',
      scopes: { 'type': 'array', 'itemType': 'string' },
      statuses: { 'type': 'array', 'itemType': 'string' },
      supportedOsIds: { 'type': 'array', 'itemType': 'number' },
      supportedRegions: { 'type': 'array', 'itemType': 'string' },
      techstackIds: { 'type': 'array', 'itemType': 'number' },
      techstackNames: { 'type': 'array', 'itemType': 'string' },
      creatorIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 符合条件的技术栈列表
  buildpacks?: BuildpackDetail[];
  // 当前页码
  currentPage?: number;
  // 每页的大小
  pageSize?: number;
  // 总数量
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      buildpacks: 'buildpacks',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      buildpacks: { 'type': 'array', 'itemType': BuildpackDetail },
      currentPage: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBuildpackRequest extends $tea.Model {
  authToken?: string;
  // 技术栈所支持的租户名称列表
  availableTenantNames?: string[];
  // 技术栈的编译打包命令
  buildCommand?: string;
  // 分享给其他租户时留下的联系信息
  contactInfo?: string;
  // 当前技术栈是否是debug模式
  debugMode?: boolean;
  // 描述
  description?: string;
  // 环境变量
  envParams?: BuildpackParamTemplate[];
  // 技术栈的版本号
  fullVersion?: string;
  // 主版本号
  majorVersion?: number;
  // 次版本号
  minorVersion?: number;
  // 补丁版本号
  patchVersion?: number;
  // 技术栈的作用域，可以是SYSTEM或者CUSTOM
  scope?: string;
  // 支持的操作系统ID
  supportedOs?: number[];
  // 技术栈支持的地域信息
  supportedRegions?: BuildpackRegionRelation[];
  // 技术栈大类的id
  techstackId?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      availableTenantNames: 'available_tenant_names',
      buildCommand: 'build_command',
      contactInfo: 'contact_info',
      debugMode: 'debug_mode',
      description: 'description',
      envParams: 'env_params',
      fullVersion: 'full_version',
      majorVersion: 'major_version',
      minorVersion: 'minor_version',
      patchVersion: 'patch_version',
      scope: 'scope',
      supportedOs: 'supported_os',
      supportedRegions: 'supported_regions',
      techstackId: 'techstack_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      availableTenantNames: { 'type': 'array', 'itemType': 'string' },
      buildCommand: 'string',
      contactInfo: 'string',
      debugMode: 'boolean',
      description: 'string',
      envParams: { 'type': 'array', 'itemType': BuildpackParamTemplate },
      fullVersion: 'string',
      majorVersion: 'number',
      minorVersion: 'number',
      patchVersion: 'number',
      scope: 'string',
      supportedOs: { 'type': 'array', 'itemType': 'number' },
      supportedRegions: { 'type': 'array', 'itemType': BuildpackRegionRelation },
      techstackId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBuildpackResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 创建完成的技术栈ID
  buildpackId?: string;
  // 技术栈包上传地址信息
  uploadEndpoints?: UploadEndpoint[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      buildpackId: 'buildpack_id',
      uploadEndpoints: 'upload_endpoints',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      buildpackId: 'string',
      uploadEndpoints: { 'type': 'array', 'itemType': UploadEndpoint },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadfinishBuildpackRequest extends $tea.Model {
  authToken?: string;
  // 技术栈的ID
  buildpackId?: string;
  // supportedRegions
  supportedRegions?: BuildpackRegionRelation[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      buildpackId: 'buildpack_id',
      supportedRegions: 'supported_regions',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      buildpackId: 'string',
      supportedRegions: { 'type': 'array', 'itemType': BuildpackRegionRelation },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadfinishBuildpackResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class PublishBuildpackRequest extends $tea.Model {
  authToken?: string;
  // buildpackId
  buildpackId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      buildpackId: 'buildpack_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      buildpackId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishBuildpackResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UpdateBuildpackRequest extends $tea.Model {
  authToken?: string;
  // 技术栈的编译打包命令
  buildCommand?: string;
  // 分享给其他租户时留下的联系信息
  contactInfo?: string;
  // 当前技术栈是否是debug模式
  debugMode?: boolean;
  // 描述
  description?: string;
  // 环境变量
  envParams?: BuildpackParamTemplate[];
  // 技术栈版本号
  fullVersion?: string;
  // 技术栈id
  id?: string;
  // 支持的操作系统ID
  supportedOs?: number[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      buildCommand: 'build_command',
      contactInfo: 'contact_info',
      debugMode: 'debug_mode',
      description: 'description',
      envParams: 'env_params',
      fullVersion: 'full_version',
      id: 'id',
      supportedOs: 'supported_os',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      buildCommand: 'string',
      contactInfo: 'string',
      debugMode: 'boolean',
      description: 'string',
      envParams: { 'type': 'array', 'itemType': BuildpackParamTemplate },
      fullVersion: 'string',
      id: 'string',
      supportedOs: { 'type': 'array', 'itemType': 'number' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBuildpackResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryBuildpackFindbynamesRequest extends $tea.Model {
  authToken?: string;
  // techstackNames
  techstackNames?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      techstackNames: 'techstack_names',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      techstackNames: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackFindbynamesResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // techstack对象的json串
  techstack?: Techstack[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      techstack: 'techstack',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      techstack: { 'type': 'array', 'itemType': Techstack },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountBuildpackRequest extends $tea.Model {
  authToken?: string;
  // buildpackId
  buildpackId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      buildpackId: 'buildpack_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      buildpackId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountBuildpackResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // count值
  count?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      count: 'count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      count: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeprecateBuildpackRequest extends $tea.Model {
  authToken?: string;
  // depracationNoteMap
  depracationNoteMap?: DepracationNotePayload;
  // ids
  id?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      depracationNoteMap: 'depracation_note_map',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      depracationNoteMap: DepracationNotePayload,
      id: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeprecateBuildpackResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // result
  result?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchdeleteBuildpackRequest extends $tea.Model {
  authToken?: string;
  // ids
  id?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchdeleteBuildpackResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // BuildpackDetailVO
  buildpackDetailVo?: BuildpackDetailVO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      buildpackDetailVo: 'buildpack_detail_vo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      buildpackDetailVo: { 'type': 'array', 'itemType': BuildpackDetailVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExistBuildpackRequest extends $tea.Model {
  authToken?: string;
  // buildpackId
  buildpackId?: string;
  // fullVersion
  fullVersion?: string;
  // techstackId
  techstackId?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      buildpackId: 'buildpack_id',
      fullVersion: 'full_version',
      techstackId: 'techstack_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      buildpackId: 'string',
      fullVersion: 'string',
      techstackId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExistBuildpackResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // result
  result?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBuildpackUpdatepackagesstatusRequest extends $tea.Model {
  authToken?: string;
  // buildpackId
  id?: string;
  // newFileStatus
  newFileStatus?: string;
  // originalFileStatus
  originalFileStatus?: string;
  // regionIds
  regionNum?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      newFileStatus: 'new_file_status',
      originalFileStatus: 'original_file_status',
      regionNum: 'region_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      newFileStatus: 'string',
      originalFileStatus: 'string',
      regionNum: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBuildpackUpdatepackagesstatusResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // result
  result?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackFindidversionpairsbyversionRequest extends $tea.Model {
  authToken?: string;
  // fullVersion
  fullVersion?: string;
  // statuses
  statuses?: string[];
  // techstackId
  techstackId?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      fullVersion: 'full_version',
      statuses: 'statuses',
      techstackId: 'techstack_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      fullVersion: 'string',
      statuses: { 'type': 'array', 'itemType': 'string' },
      techstackId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackFindidversionpairsbyversionResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // buildpack_composite_v_os
  buildpackCompositeVOs?: BuildpackCompositeVO[];
  // current_page
  currentPage?: number;
  // page_size
  pageSize?: number;
  // total_count
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      buildpackCompositeVOs: 'buildpack_composite_v_os',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      buildpackCompositeVOs: { 'type': 'array', 'itemType': BuildpackCompositeVO },
      currentPage: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackGroupbytechstackRequest extends $tea.Model {
  authToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackGroupbytechstackResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // count
  count?: TechstackBuildpackCount[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      count: 'count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      count: { 'type': 'array', 'itemType': TechstackBuildpackCount },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackFindvisibletechstacksRequest extends $tea.Model {
  authToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackFindvisibletechstacksResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // Techstack
  techstack?: Techstack[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      techstack: 'techstack',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      techstack: { 'type': 'array', 'itemType': Techstack },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackFindwritabletechstacksRequest extends $tea.Model {
  authToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackFindwritabletechstacksResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // Techstack
  techstack?: Techstack[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      techstack: 'techstack',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      techstack: { 'type': 'array', 'itemType': Techstack },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackFindosbycurrentcloudRequest extends $tea.Model {
  authToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackFindosbycurrentcloudResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // BuildpackOS
  buildpackOs?: BuildpackOS[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      buildpackOs: 'buildpack_os',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      buildpackOs: { 'type': 'array', 'itemType': BuildpackOS },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackFindbyappsvRequest extends $tea.Model {
  authToken?: string;
  // appIds
  appIds?: string[];
  // workspaceId
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appIds: 'app_ids',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appIds: { 'type': 'array', 'itemType': 'string' },
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackFindbyappsvResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 包含Buildpack对象的json串
  buildpack?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      buildpack: 'buildpack',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      buildpack: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackFindbyappsRequest extends $tea.Model {
  authToken?: string;
  // appIds
  appIds?: string[];
  // workspaceId
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appIds: 'app_ids',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appIds: { 'type': 'array', 'itemType': 'string' },
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackFindbyappsResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 包含BuildpackV2Adapter对象的json字符串
  buildpackv2adapter?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      buildpackv2adapter: 'buildpackv2adapter',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      buildpackv2adapter: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackFindbyappservicesRequest extends $tea.Model {
  authToken?: string;
  // appServiceIds
  appServiceIds?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appServiceIds: 'app_service_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appServiceIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackFindbyappservicesResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 包含BuildpackV2Adapter对象的json串
  buildpackV2Adapter?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      buildpackV2Adapter: 'buildpack_v2_adapter',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      buildpackV2Adapter: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackFindbyappvRequest extends $tea.Model {
  authToken?: string;
  // appId
  appId?: string;
  // workspaceId
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appId: 'app_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackFindbyappvResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // Buildpack
  buildpack?: BuildpackByAppV;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      buildpack: 'buildpack',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      buildpack: BuildpackByAppV,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackFindbyappRequest extends $tea.Model {
  authToken?: string;
  // appId
  appId?: string;
  // workspaceId
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appId: 'app_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackFindbyappResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // bgEnable
  bgEnable?: boolean;
  // buildpackArch
  buildpackArch?: string;
  // buildScriptId
  buildScriptId?: string;
  // commandId
  commandId?: string;
  // componentId
  componentId?: string;
  // configId
  configId?: string;
  // creator
  creator?: string;
  // customerIds
  customerIds?: string[];
  // deployScriptId
  deployScriptId?: string;
  // des
  des?: string;
  // fullVersion
  fullVersion?: string;
  // gmtCreate
  gmtCreate?: string;
  // gmtModified
  gmtModified?: string;
  // id
  id?: string;
  // name
  name?: string;
  // supportedOS
  supportedOS?: BuildpackOS[];
  // supportedRegions
  supportedRegions?: BuildpackRegionRelationDetail[];
  // techstack
  techstack?: Techstack;
  // tenantId
  tenantId?: string;
  // utcCreate
  utcCreate?: string;
  // utcModified
  utcModified?: string;
  // version
  version?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bgEnable: 'bg_enable',
      buildpackArch: 'buildpack_arch',
      buildScriptId: 'build_script_id',
      commandId: 'command_id',
      componentId: 'component_id',
      configId: 'config_id',
      creator: 'creator',
      customerIds: 'customer_ids',
      deployScriptId: 'deploy_script_id',
      des: 'des',
      fullVersion: 'full_version',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      id: 'id',
      name: 'name',
      supportedOS: 'supported_o_s',
      supportedRegions: 'supported_regions',
      techstack: 'techstack',
      tenantId: 'tenant_id',
      utcCreate: 'utc_create',
      utcModified: 'utc_modified',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bgEnable: 'boolean',
      buildpackArch: 'string',
      buildScriptId: 'string',
      commandId: 'string',
      componentId: 'string',
      configId: 'string',
      creator: 'string',
      customerIds: { 'type': 'array', 'itemType': 'string' },
      deployScriptId: 'string',
      des: 'string',
      fullVersion: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      id: 'string',
      name: 'string',
      supportedOS: { 'type': 'array', 'itemType': BuildpackOS },
      supportedRegions: { 'type': 'array', 'itemType': BuildpackRegionRelationDetail },
      techstack: Techstack,
      tenantId: 'string',
      utcCreate: 'string',
      utcModified: 'string',
      version: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBuildpackGeneratesignurlRequest extends $tea.Model {
  authToken?: string;
  // id
  id?: string;
  // 地域ID
  regionNum?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      regionNum: 'region_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      regionNum: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBuildpackGeneratesignurlResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // url
  url?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      url: 'url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      url: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackSumpackagessizeRequest extends $tea.Model {
  authToken?: string;
  // regionIds
  regionIds?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      regionIds: 'region_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      regionIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackSumpackagessizeResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // json
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackSupportcoderepoRequest extends $tea.Model {
  authToken?: string;
  // techstackId
  techstackId?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      techstackId: 'techstack_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      techstackId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackSupportcoderepoResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // result
  data?: boolean;
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
      data: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackFindavailablebyappserviceidsRequest extends $tea.Model {
  authToken?: string;
  // appServiceIds
  appServiceIds?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appServiceIds: 'app_service_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appServiceIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackFindavailablebyappserviceidsResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // json
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpacknewRequest extends $tea.Model {
  authToken?: string;
  // buildCommand
  buildCommand?: string;
  // createdFroms
  createdFroms?: string[];
  // creationTimeFrom
  creationTimeFrom?: string;
  // creationTimeTo
  creationTimeTo?: string;
  // creatorIds
  creatorIds?: string[];
  // currentPage
  currentPage?: number;
  // descend
  descend?: boolean;
  // fullVersion
  fullVersion?: string;
  // ids
  ids?: string[];
  // isProcessed
  isProcessed?: boolean;
  // modificationTimeFrom
  modificationTimeFrom?: string;
  // modificationTimeTo
  modificationTimeTo?: string;
  // pageSize
  pageSize?: number;
  // publicationTimeFrom
  publicationTimeFrom?: string;
  // publicationTimeTo
  publicationTimeTo?: string;
  // publisherIds
  publisherIds?: string[];
  // scopes
  scopes?: string[];
  // sortField
  sortField?: string;
  // statuses
  statuses?: string[];
  // supportedOsIds
  supportedOsIds?: number[];
  // supported_region_ids
  supportedRegionIds?: string[];
  // techstackIds
  techstackIds?: number[];
  // techstackNames
  techstackNames?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      buildCommand: 'build_command',
      createdFroms: 'created_froms',
      creationTimeFrom: 'creation_time_from',
      creationTimeTo: 'creation_time_to',
      creatorIds: 'creator_ids',
      currentPage: 'current_page',
      descend: 'descend',
      fullVersion: 'full_version',
      ids: 'ids',
      isProcessed: 'is_processed',
      modificationTimeFrom: 'modification_time_from',
      modificationTimeTo: 'modification_time_to',
      pageSize: 'page_size',
      publicationTimeFrom: 'publication_time_from',
      publicationTimeTo: 'publication_time_to',
      publisherIds: 'publisher_ids',
      scopes: 'scopes',
      sortField: 'sort_field',
      statuses: 'statuses',
      supportedOsIds: 'supported_os_ids',
      supportedRegionIds: 'supported_region_ids',
      techstackIds: 'techstack_ids',
      techstackNames: 'techstack_names',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      buildCommand: 'string',
      createdFroms: { 'type': 'array', 'itemType': 'string' },
      creationTimeFrom: 'string',
      creationTimeTo: 'string',
      creatorIds: { 'type': 'array', 'itemType': 'string' },
      currentPage: 'number',
      descend: 'boolean',
      fullVersion: 'string',
      ids: { 'type': 'array', 'itemType': 'string' },
      isProcessed: 'boolean',
      modificationTimeFrom: 'string',
      modificationTimeTo: 'string',
      pageSize: 'number',
      publicationTimeFrom: 'string',
      publicationTimeTo: 'string',
      publisherIds: { 'type': 'array', 'itemType': 'string' },
      scopes: { 'type': 'array', 'itemType': 'string' },
      sortField: 'string',
      statuses: { 'type': 'array', 'itemType': 'string' },
      supportedOsIds: { 'type': 'array', 'itemType': 'number' },
      supportedRegionIds: { 'type': 'array', 'itemType': 'string' },
      techstackIds: { 'type': 'array', 'itemType': 'number' },
      techstackNames: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpacknewResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // buildpacks
  buildpacks?: BuildpackDetail[];
  // currentPage
  currentPage?: number;
  // pageSize
  pageSize?: number;
  // totalCount
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      buildpacks: 'buildpacks',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      buildpacks: { 'type': 'array', 'itemType': BuildpackDetail },
      currentPage: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetBuildpacknewRequest extends $tea.Model {
  authToken?: string;
  // id
  id?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetBuildpacknewResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // buildpackDetailVO
  buildpackDetailVO?: BuildpackDetailVO;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      buildpackDetailVO: 'buildpack_detail_v_o',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      buildpackDetailVO: BuildpackDetailVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBuildpacknewUploadfinishRequest extends $tea.Model {
  authToken?: string;
  // buildpackId
  buildpackId?: string;
  // buildpackRegionRelation
  buildpackRegionRelation?: BuildpackRegionRelation;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      buildpackId: 'buildpack_id',
      buildpackRegionRelation: 'buildpack_region_relation',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      buildpackId: 'string',
      buildpackRegionRelation: BuildpackRegionRelation,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBuildpacknewUploadfinishResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UpdateBuildpacknewRequest extends $tea.Model {
  authToken?: string;
  // available_tenant_names
  availableTenantNames?: string[];
  // buildpack_id
  buildpackId?: string;
  // buildpack_params
  buildpackParams?: BuildpackParamTemplate[];
  // contactInfo
  contactInfo?: string;
  // description
  description?: string;
  // envParams
  envParams?: BuildpackParamTemplate[];
  // fullVersion
  fullVersion?: string;
  // id
  id?: string;
  // scope
  scope?: string;
  // status
  status?: string;
  // supportedOs
  supportedOs?: number[];
  // supported_regions
  supportedRegions?: BuildpackRegionRelation[];
  // techstack
  techstack?: Techstack;
  // techstack_id
  techstackId?: string;
  // BuildCommandParams
  buildCommandParams?: BuildCommandParams[];
  // creator
  creator?: UserDTO;
  // publisher
  publisher?: UserDTO;
  // originType
  originType?: string;
  // appServiceCount
  appServiceCount?: number;
  // debugMode
  debugMode?: boolean;
  // majorVersion
  majorVersion?: number;
  // minorVersion
  minorVersion?: number;
  // patchVersion
  patchVersion?: number;
  // buildCommand
  buildCommand?: string;
  // createdFrom
  createdFrom?: string;
  // publicationTime
  publicationTime?: string;
  // creationChain
  creationChain?: string[];
  // extraInfo
  extraInfo?: string;
  // depracationNote
  depracationNote?: string;
  // industryLabel
  industryLabel?: string;
  // creationTime
  creationTime?: string;
  // modificationTime
  modificationTime?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      availableTenantNames: 'available_tenant_names',
      buildpackId: 'buildpack_id',
      buildpackParams: 'buildpack_params',
      contactInfo: 'contact_info',
      description: 'description',
      envParams: 'env_params',
      fullVersion: 'full_version',
      id: 'id',
      scope: 'scope',
      status: 'status',
      supportedOs: 'supported_os',
      supportedRegions: 'supported_regions',
      techstack: 'techstack',
      techstackId: 'techstack_id',
      buildCommandParams: 'build_command_params',
      creator: 'creator',
      publisher: 'publisher',
      originType: 'origin_type',
      appServiceCount: 'app_service_count',
      debugMode: 'debug_mode',
      majorVersion: 'major_version',
      minorVersion: 'minor_version',
      patchVersion: 'patch_version',
      buildCommand: 'build_command',
      createdFrom: 'created_from',
      publicationTime: 'publication_time',
      creationChain: 'creation_chain',
      extraInfo: 'extra_info',
      depracationNote: 'depracation_note',
      industryLabel: 'industry_label',
      creationTime: 'creation_time',
      modificationTime: 'modification_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      availableTenantNames: { 'type': 'array', 'itemType': 'string' },
      buildpackId: 'string',
      buildpackParams: { 'type': 'array', 'itemType': BuildpackParamTemplate },
      contactInfo: 'string',
      description: 'string',
      envParams: { 'type': 'array', 'itemType': BuildpackParamTemplate },
      fullVersion: 'string',
      id: 'string',
      scope: 'string',
      status: 'string',
      supportedOs: { 'type': 'array', 'itemType': 'number' },
      supportedRegions: { 'type': 'array', 'itemType': BuildpackRegionRelation },
      techstack: Techstack,
      techstackId: 'string',
      buildCommandParams: { 'type': 'array', 'itemType': BuildCommandParams },
      creator: UserDTO,
      publisher: UserDTO,
      originType: 'string',
      appServiceCount: 'number',
      debugMode: 'boolean',
      majorVersion: 'number',
      minorVersion: 'number',
      patchVersion: 'number',
      buildCommand: 'string',
      createdFrom: 'string',
      publicationTime: 'string',
      creationChain: { 'type': 'array', 'itemType': 'string' },
      extraInfo: 'string',
      depracationNote: 'string',
      industryLabel: 'string',
      creationTime: 'string',
      modificationTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBuildpacknewResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // buildpack_id
  buildpackId?: string;
  // upload_endpoints
  uploadEndpoints?: UploadEndpoint[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      buildpackId: 'buildpack_id',
      uploadEndpoints: 'upload_endpoints',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      buildpackId: 'string',
      uploadEndpoints: { 'type': 'array', 'itemType': UploadEndpoint },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBuildpacknewRequest extends $tea.Model {
  authToken?: string;
  // availableTenantNames
  availableTenantNames?: string[];
  // buildpackParams
  buildpackParams?: BuildpackParamTemplate[];
  // buildCommand
  buildCommand?: string;
  // buildCommandParams
  buildCommandParams?: BuildCommandParams[];
  // contact_info
  // 
  contactInfo?: string;
  // debug_mode
  // 
  debugMode?: boolean;
  // description
  description?: string;
  // full_version
  // 
  fullVersion?: string;
  // major_version
  // 
  majorVersion?: number;
  // minor_version
  // 
  minorVersion?: number;
  // patch_version
  // 
  patchVersion?: number;
  // scope
  // 
  scope?: string;
  // StorageUploadEndpoint
  storageUploadEndpoints?: string;
  // supported_os
  // 
  supportedOs?: number[];
  // supported_regions
  // 
  supportedRegions?: BuildpackRegionRelation[];
  // techstack_id
  // 
  techstackId?: number;
  // techstack
  techstack?: Techstack;
  // status
  status?: string;
  // id
  id?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      availableTenantNames: 'available_tenant_names',
      buildpackParams: 'buildpack_params',
      buildCommand: 'build_command',
      buildCommandParams: 'build_command_params',
      contactInfo: 'contact_info',
      debugMode: 'debug_mode',
      description: 'description',
      fullVersion: 'full_version',
      majorVersion: 'major_version',
      minorVersion: 'minor_version',
      patchVersion: 'patch_version',
      scope: 'scope',
      storageUploadEndpoints: 'storage_upload_endpoints',
      supportedOs: 'supported_os',
      supportedRegions: 'supported_regions',
      techstackId: 'techstack_id',
      techstack: 'techstack',
      status: 'status',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      availableTenantNames: { 'type': 'array', 'itemType': 'string' },
      buildpackParams: { 'type': 'array', 'itemType': BuildpackParamTemplate },
      buildCommand: 'string',
      buildCommandParams: { 'type': 'array', 'itemType': BuildCommandParams },
      contactInfo: 'string',
      debugMode: 'boolean',
      description: 'string',
      fullVersion: 'string',
      majorVersion: 'number',
      minorVersion: 'number',
      patchVersion: 'number',
      scope: 'string',
      storageUploadEndpoints: 'string',
      supportedOs: { 'type': 'array', 'itemType': 'number' },
      supportedRegions: { 'type': 'array', 'itemType': BuildpackRegionRelation },
      techstackId: 'number',
      techstack: Techstack,
      status: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBuildpacknewResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // buildpack_id
  // 
  buildpackId?: string;
  // upload_endpoints
  // 
  uploadEndpoints?: UploadEndpoint[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      buildpackId: 'buildpack_id',
      uploadEndpoints: 'upload_endpoints',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      buildpackId: 'string',
      uploadEndpoints: { 'type': 'array', 'itemType': UploadEndpoint },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OnlineBuildpackRequest extends $tea.Model {
  authToken?: string;
  // buildpackId
  id?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OnlineBuildpackResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateConfigGlobalRequest extends $tea.Model {
  authToken?: string;
  // 数据保密等级
  dataLevel?: string;
  // 参数描述
  desc?: string;
  // 参数名
  key?: string;
  // 参数版本
  paramVersion?: number;
  // 该参数属于哪个 scope
  scope?: string;
  // 该参数在该 scope 中的 id
  scopeId?: string;
  // 参数类型
  type?: string;
  // 参数值
  value?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      dataLevel: 'data_level',
      desc: 'desc',
      key: 'key',
      paramVersion: 'param_version',
      scope: 'scope',
      scopeId: 'scope_id',
      type: 'type',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      dataLevel: 'string',
      desc: 'string',
      key: 'string',
      paramVersion: 'number',
      scope: 'string',
      scopeId: 'string',
      type: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateConfigGlobalResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 创建的全局参数 id
  globalParamId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      globalParamId: 'global_param_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      globalParamId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteConfigGlobalRequest extends $tea.Model {
  authToken?: string;
  // 要删除的全局参数 id
  globalParamId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      globalParamId: 'global_param_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      globalParamId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteConfigGlobalResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UpdateConfigGlobalRequest extends $tea.Model {
  authToken?: string;
  // 数据保密等级
  dataLevel?: string;
  // 参数描述
  desc?: string;
  // 全局参数 id
  id?: string;
  // 参数名
  key?: string;
  // 版本
  paramVersion?: number;
  // 该参数属于哪个 scope
  scope?: string;
  // 该参数在该 scope 中的 id
  scopeId?: string;
  // 参数类型
  type?: string;
  // 参数值
  value?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      dataLevel: 'data_level',
      desc: 'desc',
      id: 'id',
      key: 'key',
      paramVersion: 'param_version',
      scope: 'scope',
      scopeId: 'scope_id',
      type: 'type',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      dataLevel: 'string',
      desc: 'string',
      id: 'string',
      key: 'string',
      paramVersion: 'number',
      scope: 'string',
      scopeId: 'string',
      type: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateConfigGlobalResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryConfigGlobalRequest extends $tea.Model {
  authToken?: string;
  // 模板参数保密级别
  dataLevel?: string;
  // 参数名
  key?: string;
  // 排序规则数组，默认为 UTC_MODIFIED_DESC，即 根据修改时间降序排序
  orders?: string[];
  // 当前页码，从1开始，默认为1
  pageNum?: number;
  // 分页大小，默认为10
  pageSize?: number;
  // 根据参数类型进行查询
  paramType?: string;
  // 查询类型，支持精准查询、模糊查询、前缀模糊查询，这里默认为模糊查询；查询类型针对字段 key
  queryType?: string;
  // 该参数属于哪个 scope，可以在多个 scope 中查询
  scopes?: string[];
  // 该参数在该 scope 中的 id
  scopeId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      dataLevel: 'data_level',
      key: 'key',
      orders: 'orders',
      pageNum: 'page_num',
      pageSize: 'page_size',
      paramType: 'param_type',
      queryType: 'query_type',
      scopes: 'scopes',
      scopeId: 'scope_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      dataLevel: 'string',
      key: 'string',
      orders: { 'type': 'array', 'itemType': 'string' },
      pageNum: 'number',
      pageSize: 'number',
      paramType: 'string',
      queryType: 'string',
      scopes: { 'type': 'array', 'itemType': 'string' },
      scopeId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryConfigGlobalResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 符合条件的全局参数列表
  data?: GlobalParam[];
  // 当前页
  pageNum?: number;
  // 分页大小
  pageSize?: number;
  // 记录总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': GlobalParam },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetConfigGlobalRequest extends $tea.Model {
  authToken?: string;
  // 要获取的全局参数 id
  globalParamId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      globalParamId: 'global_param_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      globalParamId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetConfigGlobalResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 获取到的全局参数
  data?: GlobalParam;
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
      data: GlobalParam,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateConfigAppRequest extends $tea.Model {
  authToken?: string;
  // 应用名称
  appName?: string;
  // 数据保密等级
  dataLevel?: string;
  // 参数描述
  desc?: string;
  // 参数名
  key?: string;
  // 版本
  paramVersion?: number;
  // 该参数属于哪个 scope
  scope?: string;
  // 该参数在该 scope 中的 id
  scopeId?: string;
  // 参数类型
  type?: string;
  // 参数值
  value?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appName: 'app_name',
      dataLevel: 'data_level',
      desc: 'desc',
      key: 'key',
      paramVersion: 'param_version',
      scope: 'scope',
      scopeId: 'scope_id',
      type: 'type',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appName: 'string',
      dataLevel: 'string',
      desc: 'string',
      key: 'string',
      paramVersion: 'number',
      scope: 'string',
      scopeId: 'string',
      type: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateConfigAppResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 应用参数 id
  appParamId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appParamId: 'app_param_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appParamId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteConfigAppRequest extends $tea.Model {
  authToken?: string;
  // 要删除的应用参数 id
  appParamId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appParamId: 'app_param_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appParamId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteConfigAppResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UpdateConfigAppRequest extends $tea.Model {
  authToken?: string;
  // 数据保密等级
  dataLevel?: string;
  // 参数描述
  desc?: string;
  // 应用参数 id
  id?: string;
  // 参数名
  key?: string;
  // 版本
  paramVersion?: number;
  // 该参数属于哪个 scope
  scope?: string;
  // 该参数在该 scope 中的 id
  scopeId?: string;
  // 参数类型
  type?: string;
  // 参数值
  value?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      dataLevel: 'data_level',
      desc: 'desc',
      id: 'id',
      key: 'key',
      paramVersion: 'param_version',
      scope: 'scope',
      scopeId: 'scope_id',
      type: 'type',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      dataLevel: 'string',
      desc: 'string',
      id: 'string',
      key: 'string',
      paramVersion: 'number',
      scope: 'string',
      scopeId: 'string',
      type: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateConfigAppResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class GetConfigAppRequest extends $tea.Model {
  authToken?: string;
  // 应用参数 id
  appParamId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appParamId: 'app_param_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appParamId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetConfigAppResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 获取到的应用参数
  data?: AppParam;
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
      data: AppParam,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryConfigAppRequest extends $tea.Model {
  authToken?: string;
  // 应用名称
  appName?: string;
  // 模板参数保密级别
  dataLevel?: string;
  // 参数名
  key?: string;
  // 排序规则数组，默认为 UTC_CREATED_DESC，即 根创建时间降序排序
  orders?: string[];
  // 当前页码，从1开始，默认为1
  pageNum?: number;
  // 分页大小，默认为10
  pageSize?: number;
  // 根据参数类型进行查询
  paramType?: string;
  // 查询类型，支持精准查询、模糊查询、前缀模糊查询，这里默认为模糊查询；查询类型针对字段 app_name, key
  queryType?: string;
  // 该参数属于哪个 scope ，是个在多个 scope 中查询
  scopes?: string[];
  // 该参数在该 scope 中的 id
  scopeId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appName: 'app_name',
      dataLevel: 'data_level',
      key: 'key',
      orders: 'orders',
      pageNum: 'page_num',
      pageSize: 'page_size',
      paramType: 'param_type',
      queryType: 'query_type',
      scopes: 'scopes',
      scopeId: 'scope_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appName: 'string',
      dataLevel: 'string',
      key: 'string',
      orders: { 'type': 'array', 'itemType': 'string' },
      pageNum: 'number',
      pageSize: 'number',
      paramType: 'string',
      queryType: 'string',
      scopes: { 'type': 'array', 'itemType': 'string' },
      scopeId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryConfigAppResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 符合条件的应用参数列表
  data?: AppParam[];
  // 当前页
  pageNum?: number;
  // 分页大小
  pageSize?: number;
  // 记录总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': AppParam },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveConfigTemplateRequest extends $tea.Model {
  authToken?: string;
  // 应用名称
  appName?: string;
  // 描述
  comment?: string;
  // 参数定义列表
  params?: TemplateParamDef[];
  // 参数模板 id
  tplId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appName: 'app_name',
      comment: 'comment',
      params: 'params',
      tplId: 'tpl_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appName: 'string',
      comment: 'string',
      params: { 'type': 'array', 'itemType': TemplateParamDef },
      tplId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveConfigTemplateResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 应用参数模板 id
  tplId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tplId: 'tpl_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tplId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateConfigTemplateRequest extends $tea.Model {
  authToken?: string;
  // 应用名称
  appName?: string;
  // 描述
  comment?: string;
  // 参数定义列表
  params?: TemplateParamDef[];
  // 参数模板 id
  tplId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appName: 'app_name',
      comment: 'comment',
      params: 'params',
      tplId: 'tpl_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appName: 'string',
      comment: 'string',
      params: { 'type': 'array', 'itemType': TemplateParamDef },
      tplId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateConfigTemplateResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 应用参数模板 id
  tplId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tplId: 'tpl_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tplId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PullConfigTemplateRequest extends $tea.Model {
  authToken?: string;
  // 应用名称
  appName?: string;
  // RELEAES：获取最新的、已经发布的参数模板；
  // DRAFT：获取最新的参数模板草稿；
  // 不指定：获取已存在的最新的参数模板，不区分已发布或者草稿态；
  state?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appName: 'app_name',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appName: 'string',
      state: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PullConfigTemplateResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 应用参数模板
  data?: AppConfigTemplate;
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
      data: AppConfigTemplate,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteConfigTemplatedraftRequest extends $tea.Model {
  authToken?: string;
  // 要删除的应用参数模板 id
  tplId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tplId: 'tpl_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tplId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteConfigTemplatedraftResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class GetConfigTemplateRequest extends $tea.Model {
  authToken?: string;
  // 应用参数模板 id
  tplId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tplId: 'tpl_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tplId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetConfigTemplateResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 应用参数模板
  data?: AppConfigTemplate;
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
      data: AppConfigTemplate,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryConfigTemplateRequest extends $tea.Model {
  authToken?: string;
  // 应用名称
  appName?: string;
  // 排序规则数组，默认为 UTC_MODIFIED_DESC，即 根据修改时间降序排序
  orders?: string[];
  // 当前页码，从1开始，默认为1
  pageNum?: number;
  // 分页大小，默认为10
  pageSize?: number;
  // 查询类型，支持精准查询、模糊查询、前缀模糊查询，这里默认为模糊查询；查询类型针对字段 app_name
  queryType?: string;
  // 模板状态，DRAFT 草稿，RELEASE 已发布，发布后才会生成 version，否则为空
  state?: string;
  // 版本
  tplVersion?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appName: 'app_name',
      orders: 'orders',
      pageNum: 'page_num',
      pageSize: 'page_size',
      queryType: 'query_type',
      state: 'state',
      tplVersion: 'tpl_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appName: 'string',
      orders: { 'type': 'array', 'itemType': 'string' },
      pageNum: 'number',
      pageSize: 'number',
      queryType: 'string',
      state: 'string',
      tplVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryConfigTemplateResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 符合条件的参数配置模板
  data?: AppConfigTemplate[];
  // 当前页
  pageNum?: number;
  // 分页大小
  pageSize?: number;
  // 记录总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': AppConfigTemplate },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecConfigParseRequest extends $tea.Model {
  authToken?: string;
  // 应用名称
  appName?: string;
  // 参数定义列表
  params?: TemplateParamDef[];
  // 工作空间组 id
  workspaceGroupId?: string;
  // 工作空间 id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appName: 'app_name',
      params: 'params',
      workspaceGroupId: 'workspace_group_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appName: 'string',
      params: { 'type': 'array', 'itemType': TemplateParamDef },
      workspaceGroupId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecConfigParseResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 渲染后的参数列表
  data?: RenderParam[];
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
      data: { 'type': 'array', 'itemType': RenderParam },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateConfigGlobalRequest extends $tea.Model {
  authToken?: string;
  // 要创建的全局参数列表
  items?: GlobalParam[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      items: 'items',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      items: { 'type': 'array', 'itemType': GlobalParam },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateConfigGlobalResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class BatchcreateConfigAppRequest extends $tea.Model {
  authToken?: string;
  // 要创建的应用参数列表
  items?: AppParam[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      items: 'items',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      items: { 'type': 'array', 'itemType': AppParam },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateConfigAppResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class GetConfigSitetreeRequest extends $tea.Model {
  authToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetConfigSitetreeResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 当前租户下的所有 region 列表
  data?: RegionView[];
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
      data: { 'type': 'array', 'itemType': RegionView },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetConfigTenanttreeRequest extends $tea.Model {
  authToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetConfigTenanttreeResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 当前租户下的所有 workspaceGroup 列表
  data?: WorkspaceGroupView[];
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
      data: { 'type': 'array', 'itemType': WorkspaceGroupView },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExistConfigAppRequest extends $tea.Model {
  authToken?: string;
  // 应用名称
  appName?: string;
  // 应用参数名称，同一个 appName + scope + scopeId 下不能有同名的应用参数
  key?: string;
  // 作用域 id 数组，比如作用域类型（type）是 workspace，那么 scopeId 就是 workspace 的 id
  scopeIds?: string[];
  // 作用域类型
  type?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appName: 'app_name',
      key: 'key',
      scopeIds: 'scope_ids',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appName: 'string',
      key: 'string',
      scopeIds: { 'type': 'array', 'itemType': 'string' },
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExistConfigAppResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 应用参数是否已存在的数组，和入参顺序一一对应
  data?: boolean[];
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
      data: { 'type': 'array', 'itemType': 'boolean' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExistConfigGlobalRequest extends $tea.Model {
  authToken?: string;
  // 全局参数名称，同一个 scope + scopeId 下不能有同名的全局参数
  key?: string;
  // 作用域 id 数组，比如作用域类型（type）是 workspace，那么 scopeId 就是 workspace 的 id
  scopeIds?: string[];
  // 作用域类型
  type?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      key: 'key',
      scopeIds: 'scope_ids',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      key: 'string',
      scopeIds: { 'type': 'array', 'itemType': 'string' },
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExistConfigGlobalResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 应用参数是否已存在的数组，和入参顺序一一对应
  data?: boolean[];
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
      data: { 'type': 'array', 'itemType': 'boolean' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListWorkspacegroupRequest extends $tea.Model {
  authToken?: string;
  // 目标租户名称
  tenant?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListWorkspacegroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 环境列表
  workspaceGroups?: WorkspaceGroup[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      workspaceGroups: 'workspace_groups',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      workspaceGroups: { 'type': 'array', 'itemType': WorkspaceGroup },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetWorkspacegroupRequest extends $tea.Model {
  authToken?: string;
  // 目标租户名称
  tenant?: string;
  // 目标环境名称
  workspaceGroup?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenant: 'tenant',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenant: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetWorkspacegroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 环境名称
  id?: string;
  // 环境显示名称
  name?: string;
  // 环境状态
  status?: string;
  // 租户名称
  tenant?: string;
  // 工作空间名称列表
  workspaces?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      id: 'id',
      name: 'name',
      status: 'status',
      tenant: 'tenant',
      workspaces: 'workspaces',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      id: 'string',
      name: 'string',
      status: 'string',
      tenant: 'string',
      workspaces: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCellRequest extends $tea.Model {
  authToken?: string;
  // 目标租户名称
  tenant?: string;
  // 目标工作空间名称
  workspace?: string;
  // 目标环境名称
  workspaceGroup?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenant: 'tenant',
      workspace: 'workspace',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenant: 'string',
      workspace: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCellResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 部署单元列表
  cells?: Cell[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      cells: 'cells',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      cells: { 'type': 'array', 'itemType': Cell },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWorkspaceDeltaRequest extends $tea.Model {
  authToken?: string;
  // 结束时间点
  endTime?: string;
  // 开始时间点
  startTime?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      endTime: 'end_time',
      startTime: 'start_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      endTime: 'string',
      startTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWorkspaceDeltaResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 发生变化的workspace列表
  workspaceDeltaInfos?: WorkspaceDeltaInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      workspaceDeltaInfos: 'workspace_delta_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      workspaceDeltaInfos: { 'type': 'array', 'itemType': WorkspaceDeltaInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateWorkspacegroupRequest extends $tea.Model {
  authToken?: string;
  // 工作空间组显示名称。
  displayName?: string;
  // 域名后缀。
  domainSuffix?: string;
  // 工作空间组唯一标识。
  name?: string;
  // 发布部署模式。
  releaseMode?: string;
  // 包含工作空间列表。
  workspaces?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      displayName: 'display_name',
      domainSuffix: 'domain_suffix',
      name: 'name',
      releaseMode: 'release_mode',
      workspaces: 'workspaces',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      displayName: 'string',
      domainSuffix: 'string',
      name: 'string',
      releaseMode: 'string',
      workspaces: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateWorkspacegroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // workspaceGroupName
  data?: string;
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
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWorkspacegroupRequest extends $tea.Model {
  authToken?: string;
  // 环境组名称（唯一标识）
  name?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWorkspacegroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 工作空间组列表。
  workspaceGroups?: WorkspaceGroupInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      workspaceGroups: 'workspace_groups',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      workspaceGroups: { 'type': 'array', 'itemType': WorkspaceGroupInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteWorkspacegroupRequest extends $tea.Model {
  authToken?: string;
  // 工作空间组名称(唯一标识)。
  name?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteWorkspacegroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class GetSingleworkspaceRequest extends $tea.Model {
  authToken?: string;
  // 所属工作空间唯一标识
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSingleworkspaceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 创建时间。
  createdTime?: string;
  // workspace工作空间的显示名称
  displayName?: string;
  // workspace名称。
  id?: string;
  // 最近修改时间。
  modifiedTime?: string;
  // workspace显示名称。
  name?: string;
  // 网络类型。
  networkType?: string;
  // region id
  region?: string;
  // 所属租户信息。
  tenant?: string;
  // 工作空间类型：标准工作空间；单元化工作空间
  type?: string;
  // vpc iaas id
  vpcIaasId?: string;
  // workspace所属环境名称[可能不存在]。
  workspaceGroup?: string;
  // workspace对应的zoneId列表。
  zones?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      createdTime: 'created_time',
      displayName: 'display_name',
      id: 'id',
      modifiedTime: 'modified_time',
      name: 'name',
      networkType: 'network_type',
      region: 'region',
      tenant: 'tenant',
      type: 'type',
      vpcIaasId: 'vpc_iaas_id',
      workspaceGroup: 'workspace_group',
      zones: 'zones',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      createdTime: 'string',
      displayName: 'string',
      id: 'string',
      modifiedTime: 'string',
      name: 'string',
      networkType: 'string',
      region: 'string',
      tenant: 'string',
      type: 'string',
      vpcIaasId: 'string',
      workspaceGroup: 'string',
      zones: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSingleworkspacegroupRequest extends $tea.Model {
  authToken?: string;
  // 环境名称。
  name?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSingleworkspacegroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 工作空间组标识。
  identity?: string;
  // 工作空间组显示名称。
  name?: string;
  // 部署模式。
  releaseMode?: string;
  // 域名后缀。
  domainSuffix?: string;
  // 包含工作空间名称列表。
  workspaces?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      identity: 'identity',
      name: 'name',
      releaseMode: 'release_mode',
      domainSuffix: 'domain_suffix',
      workspaces: 'workspaces',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      identity: 'string',
      name: 'string',
      releaseMode: 'string',
      domainSuffix: 'string',
      workspaces: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCellRequest extends $tea.Model {
  authToken?: string;
  // 目标工作空间名称。
  workspace?: string;
  // 目标环境名称。
  workspaceGroup?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspace: 'workspace',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspace: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCellResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 部署单元列表。
  cells?: Cell[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      cells: 'cells',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      cells: { 'type': 'array', 'itemType': Cell },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSingleworkspaceRequest extends $tea.Model {
  authToken?: string;
  // workspace 显示名称
  displayName?: string;
  // workspace 唯一标识符
  name?: string;
  // VPC ｜ Classic
  networkType?: string;
  // 地域
  region?: string;
  // 枚举值：
  //   标准工作空间NORMAL;
  //   单元化工作空间UNIT
  type?: string;
  // 可用区
  zones?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      displayName: 'display_name',
      name: 'name',
      networkType: 'network_type',
      region: 'region',
      type: 'type',
      zones: 'zones',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      displayName: 'string',
      name: 'string',
      networkType: 'string',
      region: 'string',
      type: 'string',
      zones: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSingleworkspaceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // workspace id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSingleworkspaceRequest extends $tea.Model {
  authToken?: string;
  // workspace id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSingleworkspaceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 删除是否成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateVpcRequest extends $tea.Model {
  authToken?: string;
  // VPC所在的地域
  regionId?: string;
  // 租户id
  tenantId?: string;
  // 创建的VPC的ID
  vpcId?: string;
  // 	
  // 所属环境id
  workspaceId?: string;
  // vpc名称
  name?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      regionId: 'region_id',
      tenantId: 'tenant_id',
      vpcId: 'vpc_id',
      workspaceId: 'workspace_id',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      regionId: 'string',
      tenantId: 'string',
      vpcId: 'string',
      workspaceId: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateVpcResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // id
  id?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateWorkspacegroupRequest extends $tea.Model {
  authToken?: string;
  // 域名后缀。
  domainSuffix?: string;
  // workspacegroup名称，唯一标识一个环境。
  name?: string;
  // workspacegroup显示名称。
  displayName?: string;
  // 包含工作空间名称。
  workspaces?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      domainSuffix: 'domain_suffix',
      name: 'name',
      displayName: 'display_name',
      workspaces: 'workspaces',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      domainSuffix: 'string',
      name: 'string',
      displayName: 'string',
      workspaces: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateWorkspacegroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UpdateSingleworkspaceRequest extends $tea.Model {
  authToken?: string;
  // workspace 显示名称
  displayName?: string;
  // VPC ｜ Classic
  networkType?: string;
  // 地域id
  region?: string;
  // 可用区id列表
  zones?: string[];
  // 环境唯一标识
  name?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      displayName: 'display_name',
      networkType: 'network_type',
      region: 'region',
      zones: 'zones',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      displayName: 'string',
      networkType: 'string',
      region: 'string',
      zones: { 'type': 'array', 'itemType': 'string' },
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSingleworkspaceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 更新成功或失败
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRegionRequest extends $tea.Model {
  authToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRegionResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // region list
  data?: RegionMeta[];
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
      data: { 'type': 'array', 'itemType': RegionMeta },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListZoneRequest extends $tea.Model {
  authToken?: string;
  // region identity
  region?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      region: 'region',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      region: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListZoneResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // zone list
  data?: Zone[];
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
      data: { 'type': 'array', 'itemType': Zone },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCellgroupRequest extends $tea.Model {
  authToken?: string;
  // 所属idc
  datacenter?: string;
  // 默认全局域
  defaultGzone?: string;
  // 逻辑单元名称
  name?: string;
  // 操作人
  operator?: string;
  // 逻辑单元类型
  type?: string;
  // 所属环境组名称
  workspaceGroup?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      datacenter: 'datacenter',
      defaultGzone: 'default_gzone',
      name: 'name',
      operator: 'operator',
      type: 'type',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      datacenter: 'string',
      defaultGzone: 'string',
      name: 'string',
      operator: 'string',
      type: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCellgroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class DeleteCellgroupRequest extends $tea.Model {
  authToken?: string;
  // 逻辑单元名称
  name?: string;
  // 所属环境名称
  workspaceGroup?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteCellgroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryCellgroupRequest extends $tea.Model {
  authToken?: string;
  // cell group 查询前缀
  namePrefix?: string;
  // 所属环境名称
  workspaceGroup?: string;
  // 逻辑单元名称
  name?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      namePrefix: 'name_prefix',
      workspaceGroup: 'workspace_group',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      namePrefix: 'string',
      workspaceGroup: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCellgroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 逻辑单元信息
  data?: CellGroup[];
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
      data: { 'type': 'array', 'itemType': CellGroup },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateCellgroupDisasterinfoRequest extends $tea.Model {
  authToken?: string;
  // 灾备信息
  disasterInfo?: DisasterInfo[];
  // 逻辑单元名称
  name?: string;
  // 操作人
  operator?: string;
  // 所属环境组名称
  workspaceGroup?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      disasterInfo: 'disaster_info',
      name: 'name',
      operator: 'operator',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      disasterInfo: { 'type': 'array', 'itemType': DisasterInfo },
      name: 'string',
      operator: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateCellgroupDisasterinfoResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateDeploymentCellRequest extends $tea.Model {
  authToken?: string;
  // 所属逻辑单元名称[单元化模式特有]
  // 当type为"RZone"或"CZone"时，为必填项
  cellGroup?: string;
  // 蓝绿着色信息[单元化模式特有]
  color?: string;
  // 部署单元唯一标识
  identity?: string;
  // 是否灰度[单元化模式特有]
  isGray?: boolean;
  // 部署单元名称
  name?: string;
  // 部署单元类型:
  // RZone, CZone,GZone,default
  type?: string;
  // 权重[单元化模式特有]
  weight?: number;
  // 所属工作空间名称
  workspace?: string;
  // 所属环境组名称
  workspaceGroup?: string;
  // 所属机房名称
  zone?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      cellGroup: 'cell_group',
      color: 'color',
      identity: 'identity',
      isGray: 'is_gray',
      name: 'name',
      type: 'type',
      weight: 'weight',
      workspace: 'workspace',
      workspaceGroup: 'workspace_group',
      zone: 'zone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      cellGroup: 'string',
      color: 'string',
      identity: 'string',
      isGray: 'boolean',
      name: 'string',
      type: 'string',
      weight: 'number',
      workspace: 'string',
      workspaceGroup: 'string',
      zone: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDeploymentCellResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class DeleteDeploymentCellRequest extends $tea.Model {
  authToken?: string;
  // 部署单元名称
  name?: string;
  // 所属工作空间名称
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteDeploymentCellResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryDeploymentCellRequest extends $tea.Model {
  authToken?: string;
  // 部署单元名称
  name?: string;
  // 部署单元名称前缀
  namePrefix?: string;
  // 所属工作空间名称
  workspace?: string;
  // 所属环境组名称
  workspaceGroup?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      namePrefix: 'name_prefix',
      workspace: 'workspace',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      namePrefix: 'string',
      workspace: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeploymentCellResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 部署单元列表
  data?: DeployCell[];
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
      data: { 'type': 'array', 'itemType': DeployCell },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDeploymentCellRequest extends $tea.Model {
  authToken?: string;
  // 蓝绿着色信息
  color?: string;
  // 是否灰度
  isGray?: boolean;
  // 部署单元名称
  name?: string;
  // 权重
  weight?: number;
  // 所属工作空间名称
  workspace?: string;
  // 所属环境组名称
  workspaceGroup?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      color: 'color',
      isGray: 'is_gray',
      name: 'name',
      weight: 'weight',
      workspace: 'workspace',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      color: 'string',
      isGray: 'boolean',
      name: 'string',
      weight: 'number',
      workspace: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDeploymentCellResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryDeploymentRequest extends $tea.Model {
  authToken?: string;
  // 部署单包含的应用（服务）名称
  applicationName?: string;
  // 部署单创建日期，采用UTC时间，按照ISO8601标准表示，格式为：YYYY-MM-DDThh:mm:ssZ
  creationTime?: string;
  // 部署单id
  operationId?: string;
  // 当前页码，默认为1
  pageNum?: number;
  // 分页大小，默认10
  pageSize?: number;
  // 
  // 部署单状态。取值列表：
  // INITING：初始化中；
  // INIT_FAILED：初始化失败；
  // INITED：初始化完成；
  // EXECUTING：执行中；
  // SUCCESS：执行成功；
  // FAILED：执行失败；
  // CANCELING：取消中；
  // CANCELED：已取消
  //                             
  //                         
  statuses?: string[];
  // 精确部署单标题
  title?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      applicationName: 'application_name',
      creationTime: 'creation_time',
      operationId: 'operation_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
      statuses: 'statuses',
      title: 'title',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      applicationName: 'string',
      creationTime: 'string',
      operationId: 'string',
      pageNum: 'number',
      pageSize: 'number',
      statuses: { 'type': 'array', 'itemType': 'string' },
      title: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDeploymentResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 批量查询部署单结果，以操作链的形式体现
  deployments?: OpsDeployment[];
  // 当前页码
  pageNum?: number;
  // 分页大小
  pageSize?: number;
  // 发布单总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      deployments: 'deployments',
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      deployments: { 'type': 'array', 'itemType': OpsDeployment },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelDeploymentRequest extends $tea.Model {
  authToken?: string;
  // 部署单id
  operationId?: string;
  // 取消原因。长度不超过100个UTF-8字符
  reason?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operationId: 'operation_id',
      reason: 'reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operationId: 'string',
      reason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelDeploymentResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateDeploymentRequest extends $tea.Model {
  authToken?: string;
  // 应用列表
  applications?: Application[];
  // 是否启用自动运维，默认为**False**
  autoExecute?: boolean;
  // 部署维度，有两种取值：APPLICATION和APP_SERVICE。设置为APPLICATION，表示在尚未引入应用服务环境中对整个应用都执行部署操作; APP_SERVICE表示在引入应用服务的环境中对应用服务执行部署操作。
  deployDimension?: string;
  // 执行部署操作的目标租户
  tenant?: string;
  // 部署单标题。长度不超过50个UTF-8字符
  title?: string;
  // 执行部署操作的目标工作空间
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      applications: 'applications',
      autoExecute: 'auto_execute',
      deployDimension: 'deploy_dimension',
      tenant: 'tenant',
      title: 'title',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      applications: { 'type': 'array', 'itemType': Application },
      autoExecute: 'boolean',
      deployDimension: 'string',
      tenant: 'string',
      title: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDeploymentResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 创建完成的部署单id
  operationId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      operationId: 'operation_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      operationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDeploymentRequest extends $tea.Model {
  authToken?: string;
  // 部署单id
  operationId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operationId: 'operation_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDeploymentResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 此部署操作中所有被操作的应用详情，以操作链的形式体现
  applicationChains?: OpsApplicationChain[];
  // 部署操作执行者
  executor?: string;
  // 
  //                             
  // 部署单状态。取值列表：
  // INITING：初始化中；
  // INIT_FAILED：初始化失败；
  // INITED：初始化完成；
  // EXECUTING：执行中；
  // SUCCESS：执行成功；
  // FAILED：执行失败；
  // CANCELING：取消中；
  // CANCELED：已取消
  //                             
  //                         
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      applicationChains: 'application_chains',
      executor: 'executor',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      applicationChains: { 'type': 'array', 'itemType': OpsApplicationChain },
      executor: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryDeploymentRequest extends $tea.Model {
  authToken?: string;
  // 部署单id
  operationId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operationId: 'operation_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryDeploymentResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class StartDeploymentRequest extends $tea.Model {
  authToken?: string;
  // 部署单id
  operationId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operationId: 'operation_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartDeploymentResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class GetDeploymentApplicationRequest extends $tea.Model {
  authToken?: string;
  // 待查询的应用（服务）名称，必须是部署单中包含的应用（服务）
  applicationName?: string;
  // 部署单id
  operationId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      applicationName: 'application_name',
      operationId: 'operation_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      applicationName: 'string',
      operationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDeploymentApplicationResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 此应用下所有计算容器分组运维状态详情
  groups?: OpsGroup[];
  // 应用（服务）当前运维状态。取值列表：INITING：初始化中；INIT_FAILED：初始化失败；INITED：初始化完成；
  //                             EXECUTING：执行中；SUCCESS：执行成功；FAILED：执行失败
  //                         
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      groups: 'groups',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      groups: { 'type': 'array', 'itemType': OpsGroup },
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RollbackDeploymentApplicationRequest extends $tea.Model {
  authToken?: string;
  // 被回滚的应用（服务）名称，必须是部署单中包含的应用（服务）
  applicationName?: string;
  // 部署单id
  operationId?: string;
  // 回滚原因。长度不超过100个UTF-8字符
  reason?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      applicationName: 'application_name',
      operationId: 'operation_id',
      reason: 'reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      applicationName: 'string',
      operationId: 'string',
      reason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RollbackDeploymentApplicationResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ReinitDeploymentRequest extends $tea.Model {
  authToken?: string;
  // 部署单id
  operationId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operationId: 'operation_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReinitDeploymentResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryCmdtemplateRequest extends $tea.Model {
  authToken?: string;
  // 指令模板描述信息
  description?: string;
  // 指令名称
  name?: string;
  // 当前页码，默认为1
  pageNum?: number;
  // 分页大小，默认10
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      description: 'description',
      name: 'name',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      description: 'string',
      name: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCmdtemplateResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 当前页码
  pageNum?: number;
  // 分页大小
  pageSize?: number;
  // 指令模板ID列表
  templateIds?: string[];
  // 指令模板总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pageNum: 'page_num',
      pageSize: 'page_size',
      templateIds: 'template_ids',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pageNum: 'number',
      pageSize: 'number',
      templateIds: { 'type': 'array', 'itemType': 'string' },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCmdtemplateRequest extends $tea.Model {
  authToken?: string;
  // 指令模板ID
  id?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCmdtemplateResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 指令模板详情
  template?: CmdTemplate;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      template: 'template',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      template: CmdTemplate,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncexecuteCmdTaskRequest extends $tea.Model {
  authToken?: string;
  // 执行的指令。示例如下：cmd.template_id=000015678&cmd.args.1.name=--version&cmd.args.1.value=2.2
  cmd?: OpsCmd;
  // 执行指令的目标机器id列表。n代表第n个应用的名称，n从1开始，最大100。每个应用名称最大60个UTF-8字符。如果要输入多个机器，使用如下形式：computers.1.id=000112367&computers.2.id=000112367
  computers?: OpsComputer[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      cmd: 'cmd',
      computers: 'computers',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      cmd: OpsCmd,
      computers: { 'type': 'array', 'itemType': OpsComputer },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncexecuteCmdTaskResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 指令执行结果详情
  result?: CmdExecResult;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: CmdExecResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AsyncexecuteCmdTaskRequest extends $tea.Model {
  authToken?: string;
  // 执行的指令。示例如下：cmd.template_id=000015678&cmd.args.1.name=--version&cmd.args.1.value=2.2
  cmd?: OpsCmd;
  // 执行指令的目标机器id列表。n代表第n个应用的名称，n从1开始，最大100。每个应用名称最大60个UTF-8字符。如果要输入多个机器，使用如下形式：computers.1.id=000112367&computers.2.id=000112367
  computers?: OpsComputer[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      cmd: 'cmd',
      computers: 'computers',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      cmd: OpsCmd,
      computers: { 'type': 'array', 'itemType': OpsComputer },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AsyncexecuteCmdTaskResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 指令执行任务ID，用于查询任务详情
  taskId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCmdTaskRequest extends $tea.Model {
  authToken?: string;
  // 异步指令执行的任务ID
  taskId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCmdTaskResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 指令执行结果详情
  result?: CmdExecResult;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: CmdExecResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAppopsRequest extends $tea.Model {
  authToken?: string;
  // 执行运维操作的目标应用名称列表。n代表第n个应用的名称，n从1开始，最大100。每个应用名称最大60个UTF-8字符。如果要输入多个应用，使用如下形式：applications.1.name=myapp1&applications.2.name=myapp2
  applications?: Application[];
  // 是否启用自动运维，默认为**False**
  autoExecute?: boolean;
  // 执行运维操作的目标机器id列表。n代表第n个应用的名称，n从1开始，最大100。每个应用名称最大60个UTF-8字符。如果要输入多个机器，使用如下形式：computers.1.id=000112367&computers.2.id=000112367
  computers?: Computer[];
  // 应用运维的操作类型，取值列表：ONLINE：上线应用，OFFLINE：下线应用，RESTART:重启应用，DEPLOY_STATIC_RESOURCE：部署静态资源。
  //                         部署静态资源需传入 ops_action_params 为("default_execute_account", "resource_download_url", "resource_target_file")
  //                         
  opsAction?: string;
  // ops_action 所需要的参数，以JSON格式传入。以 {"param_name": "param_value"} 定义JSON。
  opsActionParams?: string;
  // 应用运维的维度，有三种取值：APPLICATION、APP_SERVICE和MACHINE。设置为APPLICATION，表示在非应用服务环境下整个应用都执行该应用运维操作；设置为APP_SERVICE，表示在应用服务环境下对应用服务执行运维操作;设置为MACHINE，表示应用下的一台或多台机器执行改应用运维操作。
  opsDimension?: string;
  // 运维单标题。长度不超过50个UTF-8字符
  title?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      applications: 'applications',
      autoExecute: 'auto_execute',
      computers: 'computers',
      opsAction: 'ops_action',
      opsActionParams: 'ops_action_params',
      opsDimension: 'ops_dimension',
      title: 'title',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      applications: { 'type': 'array', 'itemType': Application },
      autoExecute: 'boolean',
      computers: { 'type': 'array', 'itemType': Computer },
      opsAction: 'string',
      opsActionParams: 'string',
      opsDimension: 'string',
      title: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAppopsResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 创建完成的运维单id
  operationId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      operationId: 'operation_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      operationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAppopsRequest extends $tea.Model {
  authToken?: string;
  // 运维单id
  operationId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operationId: 'operation_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAppopsResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 此运维操作中所有被操作的应用详情，以操作链的形式体现
  applicationChains?: OpsApplicationChain[];
  // 运维操作执行者
  executor?: string;
  // 应用运维的操作类型，取值列表：ONLINE：上线应用，OFFLINE：下线应用，RESTART:重启应用，DEPLOY_STATIC_RESOURCE：部署静态资源
  opsAction?: string;
  // 应用运维的维度，有三种取值：APPLICATION、APP_SERVICE和MACHINE。设置为APPLICATION，表示在非应用服务环境下整个应用都执行该应用运维操作；设置为APP_SERVICE，表示在应用服务环境下对应用服务执行运维操作;设置为MACHINE，表示应用下的一台或多台机器执行改应用运维操作。
  opsDimension?: string;
  // 
  //                             
  // 部署单状态。取值列表：
  // INITING：初始化中；
  // INIT_FAILED：初始化失败；
  // INITED：初始化完成；
  // EXECUTING：执行中；
  // SUCCESS：执行成功；
  // FAILED：执行失败；
  // CANCELING：取消中；
  // CANCELED：已取消
  //                             
  //                         
  status?: string;
  // 应用运维单标题
  title?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      applicationChains: 'application_chains',
      executor: 'executor',
      opsAction: 'ops_action',
      opsDimension: 'ops_dimension',
      status: 'status',
      title: 'title',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      applicationChains: { 'type': 'array', 'itemType': OpsApplicationChain },
      executor: 'string',
      opsAction: 'string',
      opsDimension: 'string',
      status: 'string',
      title: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartAppopsRequest extends $tea.Model {
  authToken?: string;
  // 运维单id
  operationId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operationId: 'operation_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartAppopsResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ReinitAppopsRequest extends $tea.Model {
  authToken?: string;
  // 运维单id
  operationId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operationId: 'operation_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReinitAppopsResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CancelAppopsRequest extends $tea.Model {
  authToken?: string;
  // 运维单id
  operationId?: string;
  // 取消原因。长度不超过100个UTF-8字符
  reason?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operationId: 'operation_id',
      reason: 'reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operationId: 'string',
      reason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelAppopsResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class RetryAppopsRequest extends $tea.Model {
  authToken?: string;
  // 运维单id
  operationId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operationId: 'operation_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryAppopsResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateComputeropsRequest extends $tea.Model {
  authToken?: string;
  // 执行的指令列表。n代表第n个指令，n从1开始，最大20。示例如下：cmds.1.template_id=000015678&cmds.1.args.1.name=--version&cmds.1.args.1.value=2.2&cmds.2.template_id=000015688
  cmds?: OpsCmd[];
  // 执行运维操作的目标机器id列表。n代表第n个应用的名称，n从1开始，最大100。每个应用名称最大60个UTF-8字符。如果要输入多个机器，使用如下形式：computers.1.id=000112367&computers.2.id=000112367
  computers?: Computer[];
  // 运维单标题。长度不超过50个UTF-8字符
  title?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      cmds: 'cmds',
      computers: 'computers',
      title: 'title',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      cmds: { 'type': 'array', 'itemType': OpsCmd },
      computers: { 'type': 'array', 'itemType': Computer },
      title: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateComputeropsResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 创建完成的运维单id
  operationId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      operationId: 'operation_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      operationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetComputeropsRequest extends $tea.Model {
  authToken?: string;
  // 运维单id
  operationId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operationId: 'operation_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetComputeropsResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 运维操作执行者
  executor?: string;
  // 改运维单下所有计算容器分组运维状态详情
  groups?: OpsGroup[];
  // 
  //                             
  // 部署单状态。取值列表：
  // INITING：初始化中；
  // INIT_FAILED：初始化失败；
  // INITED：初始化完成；
  // EXECUTING：执行中；
  // SUCCESS：执行成功；
  // FAILED：执行失败；
  // CANCELING：取消中；
  // CANCELED：已取消
  //                             
  //                         
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      executor: 'executor',
      groups: 'groups',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      executor: 'string',
      groups: { 'type': 'array', 'itemType': OpsGroup },
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartComputeropsRequest extends $tea.Model {
  authToken?: string;
  // 运维单id
  operationId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operationId: 'operation_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartComputeropsResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ReinitComputeropsRequest extends $tea.Model {
  authToken?: string;
  // 运维单id
  operationId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operationId: 'operation_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReinitComputeropsResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CancelComputeropsRequest extends $tea.Model {
  authToken?: string;
  // 运维单id
  operationId?: string;
  // 取消原因。长度不超过100个UTF-8字符
  reason?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operationId: 'operation_id',
      reason: 'reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operationId: 'string',
      reason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelComputeropsResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class RetryComputeropsRequest extends $tea.Model {
  authToken?: string;
  // 运维单id
  operationId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operationId: 'operation_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryComputeropsResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryOpsappsvcRequest extends $tea.Model {
  authToken?: string;
  // 应用的名称
  appName?: string;
  // 当前页码，默认为1
  pageNum?: number;
  // 分页大小，默认10，最大50
  pageSize?: number;
  // 应用服务的名称，如果为空，会查询该应用下所有应用服务的运维历史
  serviceName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appName: 'app_name',
      pageNum: 'page_num',
      pageSize: 'page_size',
      serviceName: 'service_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appName: 'string',
      pageNum: 'number',
      pageSize: 'number',
      serviceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOpsappsvcResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 应用服务的运维历史
  opsappsvcs?: OpsApplication[];
  // 当前页码
  pageNum?: number;
  // 分页大小
  pageSize?: number;
  // 总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      opsappsvcs: 'opsappsvcs',
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      opsappsvcs: { 'type': 'array', 'itemType': OpsApplication },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AsyncexecuteBashcmdRequest extends $tea.Model {
  authToken?: string;
  // 执行的命令，长度不能超过500个字符
  command?: string;
  // 执行指令的目标机器id列表。n代表第n个机器，n从1开始，最大50。如果要输入多个机器，使用如下形式：computers.1.id=000112367&computers.2.id=000112367
  computers?: Computer[];
  // 单次执行的超时时间，单位为秒。最大值为1800秒，默认值也为1800秒
  timeOut?: number;
  // 机器上执行命令的用户,比如：root,admin
  user?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      command: 'command',
      computers: 'computers',
      timeOut: 'time_out',
      user: 'user',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      command: 'string',
      computers: { 'type': 'array', 'itemType': Computer },
      timeOut: 'number',
      user: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AsyncexecuteBashcmdResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 异步bash命令执行的任务ID
  taskId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetBashcmdResultRequest extends $tea.Model {
  authToken?: string;
  // 异步bash指令执行的任务ID
  taskId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetBashcmdResultResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 错误信息。内容为指令无法下发到机器上的详细原因
  errMsg?: string;
  // 执行结束时间
  finishTime?: string;
  // 执行的结果
  results?: SingleExecResult[];
  // 执行开始时间
  startTime?: string;
  // 执行结果状态。取值列表：EXECUTING：执行中；SUCCESS：执行成功；FAILED：执行失败；IGNORED：已忽略；TIME_OUT：已超时
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      errMsg: 'err_msg',
      finishTime: 'finish_time',
      results: 'results',
      startTime: 'start_time',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      errMsg: 'string',
      finishTime: 'string',
      results: { 'type': 'array', 'itemType': SingleExecResult },
      startTime: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckCloudconfigBgreleaseRequest extends $tea.Model {
  authToken?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckCloudconfigBgreleaseResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 是否已开通
  enabled?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      enabled: 'enabled',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      enabled: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckCloudconfigBgdeploymentcellRequest extends $tea.Model {
  authToken?: string;
  // require_release
  requireRelease?: boolean;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      requireRelease: 'require_release',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      requireRelease: 'boolean',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckCloudconfigBgdeploymentcellResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 是否已开通
  enabled?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      enabled: 'enabled',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      enabled: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckCloudconfigAppserviceRequest extends $tea.Model {
  authToken?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckCloudconfigAppserviceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 是否已开通
  enabled?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      enabled: 'enabled',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      enabled: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckCloudconfigSharedmwRequest extends $tea.Model {
  authToken?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckCloudconfigSharedmwResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 是否已开通
  enabled?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      enabled: 'enabled',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      enabled: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckCloudconfigVonereleaseRequest extends $tea.Model {
  authToken?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckCloudconfigVonereleaseResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 是否使用
  enabled?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      enabled: 'enabled',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      enabled: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckCloudconfigVoneappopsRequest extends $tea.Model {
  authToken?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckCloudconfigVoneappopsResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 是否使用
  enabled?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      enabled: 'enabled',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      enabled: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckCloudconfigOlduiRequest extends $tea.Model {
  authToken?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckCloudconfigOlduiResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 是否使用
  enabled?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      enabled: 'enabled',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      enabled: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckCloudconfigXdclbforbiddenRequest extends $tea.Model {
  authToken?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckCloudconfigXdclbforbiddenResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 是否禁用
  forbidden?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      forbidden: 'forbidden',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      forbidden: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCloudconfigOpenapiconfigRequest extends $tea.Model {
  authToken?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCloudconfigOpenapiconfigResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 配置内容
  config?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      config: 'config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      config: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountAppsPkgRequest extends $tea.Model {
  authToken?: string;
  // 应用 id 列表
  appIds?: string[];
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appIds: 'app_ids',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appIds: { 'type': 'array', 'itemType': 'string' },
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountAppsPkgResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 应用包个数，键为应用ID，值为对应包个数
  data?: Pair[];
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
      data: { 'type': 'array', 'itemType': Pair },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppUnitresourcesRequest extends $tea.Model {
  authToken?: string;
  // 应用 id 列表
  appIds?: string[];
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appIds: 'app_ids',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appIds: { 'type': 'array', 'itemType': 'string' },
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppUnitresourcesResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 资源统计
  resources?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resources: 'resources',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resources: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOauthTokenRequest extends $tea.Model {
  authToken?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOauthTokenResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 过期时间
  accessExpiredTime?: string;
  // access token
  accessToken?: string;
  // 用户 id
  customerId?: string;
  // 过期时间
  refreshExpiredTime?: string;
  // refresh token
  refreshToken?: string;
  // 租户名
  tenant?: string;
  // 租户 ID
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accessExpiredTime: 'access_expired_time',
      accessToken: 'access_token',
      customerId: 'customer_id',
      refreshExpiredTime: 'refresh_expired_time',
      refreshToken: 'refresh_token',
      tenant: 'tenant',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accessExpiredTime: 'string',
      accessToken: 'string',
      customerId: 'string',
      refreshExpiredTime: 'string',
      refreshToken: 'string',
      tenant: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateOauthTokenRequest extends $tea.Model {
  authToken?: string;
  // 过期时间
  accessExpiredTime?: string;
  // access token
  accessToken?: string;
  // 用户 ID
  customerId?: string;
  // 过期时间
  refreshExpiredTime?: string;
  // refresh token
  refreshToken?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      accessExpiredTime: 'access_expired_time',
      accessToken: 'access_token',
      customerId: 'customer_id',
      refreshExpiredTime: 'refresh_expired_time',
      refreshToken: 'refresh_token',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      accessExpiredTime: 'string',
      accessToken: 'string',
      customerId: 'string',
      refreshExpiredTime: 'string',
      refreshToken: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateOauthTokenResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class DeleteOauthTokenRequest extends $tea.Model {
  authToken?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteOauthTokenResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryBaseinfoDeploymentzonesRequest extends $tea.Model {
  authToken?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaseinfoDeploymentzonesResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 部署可用区列表
  deploymentZones?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      deploymentZones: 'deployment_zones',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      deploymentZones: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetBgreleaseArrangementRequest extends $tea.Model {
  authToken?: string;
  // 概览ID
  arrangementId?: string;
  // 发布单ID
  planId?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      arrangementId: 'arrangement_id',
      planId: 'plan_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      arrangementId: 'string',
      planId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetBgreleaseArrangementResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 概览内容
  arrangement?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      arrangement: 'arrangement',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      arrangement: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBgreleaseArrangementRequest extends $tea.Model {
  authToken?: string;
  // 发布单ID
  planId?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      planId: 'plan_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      planId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBgreleaseArrangementResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 蓝绿发布概览列表
  arrangements?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      arrangements: 'arrangements',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      arrangements: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBgreleaseArrangementprogressRequest extends $tea.Model {
  authToken?: string;
  // 概览ID
  arrangementId?: string;
  // 发布单ID
  planId?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      arrangementId: 'arrangement_id',
      planId: 'plan_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      arrangementId: 'string',
      planId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBgreleaseArrangementprogressResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 进度
  progresses?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      progresses: 'progresses',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      progresses: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBgreleaseTaskprogressRequest extends $tea.Model {
  authToken?: string;
  // 概览ID
  arrangementId?: string;
  // 发布单ID
  planId?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      arrangementId: 'arrangement_id',
      planId: 'plan_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      arrangementId: 'string',
      planId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBgreleaseTaskprogressResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 进度
  progresses?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      progresses: 'progresses',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      progresses: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBgreleaseArrangementRequest extends $tea.Model {
  authToken?: string;
  // 概览ID
  arrangementId?: string;
  // 发布单ID
  planId?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      arrangementId: 'arrangement_id',
      planId: 'plan_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      arrangementId: 'string',
      planId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBgreleaseArrangementResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 概览
  arrangement?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      arrangement: 'arrangement',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      arrangement: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmBgreleaseArrangementRequest extends $tea.Model {
  authToken?: string;
  // 概览ID
  arrangementId?: string;
  // 发布单ID
  planId?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      arrangementId: 'arrangement_id',
      planId: 'plan_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      arrangementId: 'string',
      planId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmBgreleaseArrangementResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 概览
  arrangement?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      arrangement: 'arrangement',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      arrangement: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmBgreleaseArrangementvalidationRequest extends $tea.Model {
  authToken?: string;
  // 概览ID
  arrangementId?: string;
  // 发布单ID
  planId?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      arrangementId: 'arrangement_id',
      planId: 'plan_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      arrangementId: 'string',
      planId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmBgreleaseArrangementvalidationResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 概览
  arrangement?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      arrangement: 'arrangement',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      arrangement: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryBgreleaseArrangementRequest extends $tea.Model {
  authToken?: string;
  // 发布概览ID
  arrangementId?: string;
  // 发布单
  planId?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      arrangementId: 'arrangement_id',
      planId: 'plan_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      arrangementId: 'string',
      planId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryBgreleaseArrangementResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 概览
  arrangement?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      arrangement: 'arrangement',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      arrangement: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryBgreleaseTaskRequest extends $tea.Model {
  authToken?: string;
  // 概览ID
  arrangementId?: string;
  // 发布单ID
  planId?: string;
  // retry_info
  retryInfo?: RetryInfo;
  // 任务ID
  taskId?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      arrangementId: 'arrangement_id',
      planId: 'plan_id',
      retryInfo: 'retry_info',
      taskId: 'task_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      arrangementId: 'string',
      planId: 'string',
      retryInfo: RetryInfo,
      taskId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryBgreleaseTaskResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 概览
  arrangement?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      arrangement: 'arrangement',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      arrangement: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SkipBgreleaseTaskRequest extends $tea.Model {
  authToken?: string;
  // 概览ID
  arrangementId?: string;
  // 发布单ID
  planId?: string;
  // 任务ID
  taskId?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      arrangementId: 'arrangement_id',
      planId: 'plan_id',
      taskId: 'task_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      arrangementId: 'string',
      planId: 'string',
      taskId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SkipBgreleaseTaskResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 概览
  arrangement?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      arrangement: 'arrangement',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      arrangement: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SkipBgreleaseArrangementRequest extends $tea.Model {
  authToken?: string;
  // 概览ID
  arrangementId?: string;
  // 发布单ID
  planId?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      arrangementId: 'arrangement_id',
      planId: 'plan_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      arrangementId: 'string',
      planId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SkipBgreleaseArrangementResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 概览
  arrangement?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      arrangement: 'arrangement',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      arrangement: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelBgreleaseArrangementRequest extends $tea.Model {
  authToken?: string;
  // 概览ID
  arrangementId?: string;
  // 发布单ID
  planId?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      arrangementId: 'arrangement_id',
      planId: 'plan_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      arrangementId: 'string',
      planId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelBgreleaseArrangementResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 概览
  arrangement?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      arrangement: 'arrangement',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      arrangement: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RollbackBgreleaseArrangementRequest extends $tea.Model {
  authToken?: string;
  // 概览ID
  arrangementId?: string;
  // 发布单ID
  planId?: string;
  // rollback_info
  rollbackInfo?: RollbackInfo;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      arrangementId: 'arrangement_id',
      planId: 'plan_id',
      rollbackInfo: 'rollback_info',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      arrangementId: 'string',
      planId: 'string',
      rollbackInfo: RollbackInfo,
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RollbackBgreleaseArrangementResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 概览
  arrangement?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      arrangement: 'arrangement',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      arrangement: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryrollbackBgreleaseArrangementRequest extends $tea.Model {
  authToken?: string;
  // 概览ID
  arrangementId?: string;
  // 发布单ID
  planId?: string;
  // rollback_info
  rollbackInfo?: RollbackInfo;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      arrangementId: 'arrangement_id',
      planId: 'plan_id',
      rollbackInfo: 'rollback_info',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      arrangementId: 'string',
      planId: 'string',
      rollbackInfo: RollbackInfo,
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryrollbackBgreleaseArrangementResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 概览
  arrangement?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      arrangement: 'arrangement',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      arrangement: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmrollbackBgreleaseArrangementRequest extends $tea.Model {
  authToken?: string;
  // 概览ID
  arrangementId?: string;
  // 发布单ID
  planId?: string;
  // retry_rollbacked
  retryRollbacked?: boolean;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      arrangementId: 'arrangement_id',
      planId: 'plan_id',
      retryRollbacked: 'retry_rollbacked',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      arrangementId: 'string',
      planId: 'string',
      retryRollbacked: 'boolean',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmrollbackBgreleaseArrangementResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 概览
  arrangement?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      arrangement: 'arrangement',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      arrangement: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SwitchBgreleaseGraytrafficRequest extends $tea.Model {
  authToken?: string;
  // 应用ID
  appId?: string;
  // 执行人
  executorId?: string;
  // 执行人
  executorName?: string;
  // 来自阿里云用户
  fromAliyun?: boolean;
  // 发布单ID
  planId?: string;
  // 比率
  proportion?: number;
  // 目标ID
  targetId?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appId: 'app_id',
      executorId: 'executor_id',
      executorName: 'executor_name',
      fromAliyun: 'from_aliyun',
      planId: 'plan_id',
      proportion: 'proportion',
      targetId: 'target_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appId: 'string',
      executorId: 'string',
      executorName: 'string',
      fromAliyun: 'boolean',
      planId: 'string',
      proportion: 'number',
      targetId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SwitchBgreleaseGraytrafficResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 灰度引流进程ID
  processId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      processId: 'process_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      processId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RollbackBgreleaseGraytrafficRequest extends $tea.Model {
  authToken?: string;
  // 概览ID
  arrangementId?: string;
  // 发布单ID
  planId?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      arrangementId: 'arrangement_id',
      planId: 'plan_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      arrangementId: 'string',
      planId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RollbackBgreleaseGraytrafficResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 回滚进程ID
  processId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      processId: 'process_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      processId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBgreleaseGrayprogressRequest extends $tea.Model {
  authToken?: string;
  // 概览ID
  arrangementId?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      arrangementId: 'arrangement_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      arrangementId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBgreleaseGrayprogressResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 进度
  progresses?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      progresses: 'progresses',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      progresses: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGrayProcessRequest extends $tea.Model {
  authToken?: string;
  // ID
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGrayProcessResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 进程信息
  processDefinition?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      processDefinition: 'process_definition',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      processDefinition: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGrayProgressRequest extends $tea.Model {
  authToken?: string;
  // ID
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGrayProgressResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 进度
  progresses?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      progresses: 'progresses',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      progresses: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReinitGrayProcessRequest extends $tea.Model {
  authToken?: string;
  // ID
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReinitGrayProcessResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 进程信息
  processDefinition?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      processDefinition: 'process_definition',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      processDefinition: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryGrayTaskRequest extends $tea.Model {
  authToken?: string;
  // 进程 ID
  processId?: string;
  // retry_info
  retryInfo?: RetryInfo;
  // 任务ID
  taskId?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      processId: 'process_id',
      retryInfo: 'retry_info',
      taskId: 'task_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      processId: 'string',
      retryInfo: RetryInfo,
      taskId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryGrayTaskResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 进程信息
  processDefinition?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      processDefinition: 'process_definition',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      processDefinition: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SkipGrayTaskRequest extends $tea.Model {
  authToken?: string;
  // 进程 ID
  processId?: string;
  // 任务ID
  taskId?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      processId: 'process_id',
      taskId: 'task_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      processId: 'string',
      taskId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SkipGrayTaskResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 进程信息
  processDefinition?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      processDefinition: 'process_definition',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      processDefinition: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMachineRequest extends $tea.Model {
  authToken?: string;
  // 当前页
  pageNo?: number;
  // 页大小，默认 20
  pageSize?: number;
  // 父节点ID
  parentId?: string;
  // pd id
  processDefinitionId?: string;
  // 对应发布服务 ID
  serviceId?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      pageNo: 'page_no',
      pageSize: 'page_size',
      parentId: 'parent_id',
      processDefinitionId: 'process_definition_id',
      serviceId: 'service_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      pageNo: 'number',
      pageSize: 'number',
      parentId: 'string',
      processDefinitionId: 'string',
      serviceId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMachineResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 发布机器信息
  machines?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      machines: 'machines',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      machines: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetMachineRequest extends $tea.Model {
  authToken?: string;
  // 发布机器 ID
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetMachineResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 发布机器信息
  machine?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      machine: 'machine',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      machine: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMachineProgressRequest extends $tea.Model {
  authToken?: string;
  // 发布机器ID
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMachineProgressResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 进度
  progresses?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      progresses: 'progresses',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      progresses: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryMachineRequest extends $tea.Model {
  authToken?: string;
  // 发布机器 ID
  id?: string;
  // retry_info
  retryInfo?: RetryInfo;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      retryInfo: 'retry_info',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      retryInfo: RetryInfo,
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryMachineResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 发布机器信息
  machine?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      machine: 'machine',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      machine: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SkipMachineRequest extends $tea.Model {
  authToken?: string;
  // 机器ID
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SkipMachineResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 机器信息
  machine?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      machine: 'machine',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      machine: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelMachineRequest extends $tea.Model {
  authToken?: string;
  // 发布机器 ID
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelMachineResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 机器信息
  machine?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      machine: 'machine',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      machine: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecMachineRequest extends $tea.Model {
  authToken?: string;
  // 机器 ID
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecMachineResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 机器信息
  machine?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      machine: 'machine',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      machine: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMachinegroupProgressRequest extends $tea.Model {
  authToken?: string;
  // ID
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMachinegroupProgressResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 进度
  progresses?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      progresses: 'progresses',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      progresses: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryMachinegroupRequest extends $tea.Model {
  authToken?: string;
  // 分组 ID
  id?: string;
  // retry info
  retryInfo?: RetryInfo;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      retryInfo: 'retry_info',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      retryInfo: RetryInfo,
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryMachinegroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 机器分组信息
  machineGroup?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      machineGroup: 'machine_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      machineGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SkipMachinegroupRequest extends $tea.Model {
  authToken?: string;
  // 分组 ID
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SkipMachinegroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 分组
  machineGroup?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      machineGroup: 'machine_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      machineGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelMachinegroupRequest extends $tea.Model {
  authToken?: string;
  // 分组 ID
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelMachinegroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 机器分组
  machineGroup?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      machineGroup: 'machine_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      machineGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteMachinegroupRequest extends $tea.Model {
  authToken?: string;
  // ID
  id?: string;
  // recursive
  recursive?: boolean;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      recursive: 'recursive',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      recursive: 'boolean',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteMachinegroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 机器分组
  machineGroup?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      machineGroup: 'machine_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      machineGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMachinegroupRequest extends $tea.Model {
  authToken?: string;
  // 分组 ID
  machineGroupId?: string;
  // 发布机器 ID
  machineIds?: string[];
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      machineGroupId: 'machine_group_id',
      machineIds: 'machine_ids',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      machineGroupId: 'string',
      machineIds: { 'type': 'array', 'itemType': 'string' },
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMachinegroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 机器分组信息
  machineGroup?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      machineGroup: 'machine_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      machineGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmMachinegroupRequest extends $tea.Model {
  authToken?: string;
  // 分组id
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmMachinegroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 分组信息
  machineGroup?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      machineGroup: 'machine_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      machineGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryMachinegroupProgressRequest extends $tea.Model {
  authToken?: string;
  // 当前页，默认 1
  pageNo?: number;
  // 分页大小，默认 20
  pageSize?: number;
  // 父节点 ID
  parentId?: string;
  // 发布单 ID
  planId?: string;
  // 发布进程 ID
  processDefinitionId?: string;
  // 发布服务 ID
  serviceId?: string;
  // 状态
  state?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      pageNo: 'page_no',
      pageSize: 'page_size',
      parentId: 'parent_id',
      planId: 'plan_id',
      processDefinitionId: 'process_definition_id',
      serviceId: 'service_id',
      state: 'state',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      pageNo: 'number',
      pageSize: 'number',
      parentId: 'string',
      planId: 'string',
      processDefinitionId: 'string',
      serviceId: 'string',
      state: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryMachinegroupProgressResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 机器分组列表
  machineGroups?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      machineGroups: 'machine_groups',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      machineGroups: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmMachinegroupReserveRequest extends $tea.Model {
  authToken?: string;
  // 分组 ID
  id?: string;
  // 是否需要预确认分组
  reserved?: boolean;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      reserved: 'reserved',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      reserved: 'boolean',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmMachinegroupReserveResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 分组信息
  machineGroup?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      machineGroup: 'machine_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      machineGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMachinegroupSlbmountweightRequest extends $tea.Model {
  authToken?: string;
  // from_aliyun
  fromAliyun?: boolean;
  // 分组 ID
  machineGroupId?: string;
  // 挂载权重信息列表
  slbMountInfoList?: string[];
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      fromAliyun: 'from_aliyun',
      machineGroupId: 'machine_group_id',
      slbMountInfoList: 'slb_mount_info_list',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      fromAliyun: 'boolean',
      machineGroupId: 'string',
      slbMountInfoList: { 'type': 'array', 'itemType': 'string' },
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMachinegroupSlbmountweightResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 请求 ID，用于追踪后续结果
  requestIds?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestIds: 'request_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMachinegroupSlbmountprogressRequest extends $tea.Model {
  authToken?: string;
  // 分组ID
  machineGroupId?: string;
  // 请求 ID 列表
  requestIds?: string[];
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      machineGroupId: 'machine_group_id',
      requestIds: 'request_ids',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      machineGroupId: 'string',
      requestIds: { 'type': 'array', 'itemType': 'string' },
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMachinegroupSlbmountprogressResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 执行进度
  executorProgress?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      executorProgress: 'executor_progress',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      executorProgress: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMachinegroupSlbmountRequest extends $tea.Model {
  authToken?: string;
  // 分组 id
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMachinegroupSlbmountResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // SLB 挂载信息
  slbMountInfoList?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      slbMountInfoList: 'slb_mount_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      slbMountInfoList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetMachinegroupRequest extends $tea.Model {
  authToken?: string;
  // 分组 ID
  id?: string;
  // 是否带上机器信息，默认 false
  withMachines?: boolean;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      withMachines: 'with_machines',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      withMachines: 'boolean',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetMachinegroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 分组信息
  machineGroup?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      machineGroup: 'machine_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      machineGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SkipMachinetaskRequest extends $tea.Model {
  authToken?: string;
  // 机器 ID
  machineId?: string;
  // 任务 ID
  taskId?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      machineId: 'machine_id',
      taskId: 'task_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      machineId: 'string',
      taskId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SkipMachinetaskResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 进度
  progress?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      progress: 'progress',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      progress: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryMachinetaskRequest extends $tea.Model {
  authToken?: string;
  // 机器 ID
  machineId?: string;
  // retry_info
  retryInfo?: RetryInfo;
  // 任务 ID
  taskId?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      machineId: 'machine_id',
      retryInfo: 'retry_info',
      taskId: 'task_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      machineId: 'string',
      retryInfo: RetryInfo,
      taskId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryMachinetaskResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 执行进度
  progress?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      progress: 'progress',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      progress: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMetaCellRequest extends $tea.Model {
  authToken?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMetaCellResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 部署单元列表
  cells?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      cells: 'cells',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      cells: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateMetaDeploymentcellRequest extends $tea.Model {
  authToken?: string;
  // deployment_cell
  deploymentCell?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      deploymentCell: 'deployment_cell',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      deploymentCell: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateMetaDeploymentcellResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // deployment cell
  deploymentCell?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      deploymentCell: 'deployment_cell',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      deploymentCell: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMetaDeploymentcellRequest extends $tea.Model {
  authToken?: string;
  // deployment_cell
  deploymentCell?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      deploymentCell: 'deployment_cell',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      deploymentCell: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMetaDeploymentcellResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // deployment cell
  deploymentCell?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      deploymentCell: 'deployment_cell',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      deploymentCell: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetMetaDeploymentcellRequest extends $tea.Model {
  authToken?: string;
  // id
  id?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetMetaDeploymentcellResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // deployment cell
  deploymentCell?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      deploymentCell: 'deployment_cell',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      deploymentCell: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMetaDeploymentcellRequest extends $tea.Model {
  authToken?: string;
  // ids
  ids?: string[];
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      ids: 'ids',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      ids: { 'type': 'array', 'itemType': 'string' },
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMetaDeploymentcellResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // deployment cells
  deploymentCells?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      deploymentCells: 'deployment_cells',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      deploymentCells: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateNotificationConfigRequest extends $tea.Model {
  authToken?: string;
  // cloud web url
  cloudWebUrl?: string;
  // 是否开启，默认关闭
  enabled?: boolean;
  // modified_version
  modifiedVersion?: number;
  // 接受者
  receivers?: string[];
  // 类型
  type?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      cloudWebUrl: 'cloud_web_url',
      enabled: 'enabled',
      modifiedVersion: 'modified_version',
      receivers: 'receivers',
      type: 'type',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      cloudWebUrl: 'string',
      enabled: 'boolean',
      modifiedVersion: 'number',
      receivers: { 'type': 'array', 'itemType': 'string' },
      type: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateNotificationConfigResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // config
  config?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      config: 'config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      config: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateNotificationConfigRequest extends $tea.Model {
  authToken?: string;
  // cloud web url
  cloudWebUrl?: string;
  // 是否开启
  enabled?: boolean;
  // id
  id?: string;
  // modified_version
  modifiedVersion?: number;
  // 接受者
  receivers?: string[];
  // 类型
  type?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      cloudWebUrl: 'cloud_web_url',
      enabled: 'enabled',
      id: 'id',
      modifiedVersion: 'modified_version',
      receivers: 'receivers',
      type: 'type',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      cloudWebUrl: 'string',
      enabled: 'boolean',
      id: 'string',
      modifiedVersion: 'number',
      receivers: { 'type': 'array', 'itemType': 'string' },
      type: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateNotificationConfigResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // config
  config?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      config: 'config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      config: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryNotificationConfigRequest extends $tea.Model {
  authToken?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryNotificationConfigResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 通知配置列表
  configs?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      configs: 'configs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      configs: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteNotificationConfigRequest extends $tea.Model {
  authToken?: string;
  // id
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteNotificationConfigResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOperatorRequest extends $tea.Model {
  authToken?: string;
  // 用户 ID
  customerId?: string;
  // 当前页
  pageNo?: number;
  // 分页大小
  pageSize?: number;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      customerId: 'customer_id',
      pageNo: 'page_no',
      pageSize: 'page_size',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      customerId: 'string',
      pageNo: 'number',
      pageSize: 'number',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOperatorResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 操作人列表
  operators?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      operators: 'operators',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      operators: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RollbackPlanServiceRequest extends $tea.Model {
  authToken?: string;
  // 发布单ID
  planId?: string;
  // rollback_info
  rollbackInfo?: RollbackInfo;
  // 发布服务
  service?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      planId: 'plan_id',
      rollbackInfo: 'rollback_info',
      service: 'service',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      planId: 'string',
      rollbackInfo: RollbackInfo,
      service: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RollbackPlanServiceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 发布单信息
  plan?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      plan: 'plan',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      plan: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreatePlanRequest extends $tea.Model {
  authToken?: string;
  // data
  data?: string;
  // from aliyun
  fromAliyun?: boolean;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      data: 'data',
      fromAliyun: 'from_aliyun',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      data: 'string',
      fromAliyun: 'boolean',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreatePlanResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // plan
  plan?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      plan: 'plan',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      plan: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckPlanRequest extends $tea.Model {
  authToken?: string;
  // data
  data?: string;
  // from_aliyun
  fromAliyun?: boolean;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      data: 'data',
      fromAliyun: 'from_aliyun',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      data: 'string',
      fromAliyun: 'boolean',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckPlanResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // data
  data?: string;
  // error_reasons
  errorReasons?: string[];
  // validation_messages
  validationMessages?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      errorReasons: 'error_reasons',
      validationMessages: 'validation_messages',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      errorReasons: { 'type': 'array', 'itemType': 'string' },
      validationMessages: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckPlanOperationRequest extends $tea.Model {
  authToken?: string;
  // data
  data?: string;
  // from_aliyun
  fromAliyun?: boolean;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      data: 'data',
      fromAliyun: 'from_aliyun',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      data: 'string',
      fromAliyun: 'boolean',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckPlanOperationResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // data
  data?: string;
  // error_messages
  errorReasons?: string[];
  // validation_messages
  validationMessages?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      errorReasons: 'error_reasons',
      validationMessages: 'validation_messages',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      errorReasons: { 'type': 'array', 'itemType': 'string' },
      validationMessages: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreatePlanOperationRequest extends $tea.Model {
  authToken?: string;
  // data
  data?: string;
  // from_aliyun
  fromAliyun?: boolean;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      data: 'data',
      fromAliyun: 'from_aliyun',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      data: 'string',
      fromAliyun: 'boolean',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreatePlanOperationResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // ops_plan
  opsPlan?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      opsPlan: 'ops_plan',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      opsPlan: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreatePlanAdvancedRequest extends $tea.Model {
  authToken?: string;
  // plan
  opsPlan?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      opsPlan: 'ops_plan',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      opsPlan: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreatePlanAdvancedResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // ops_plan
  opsPlan?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      opsPlan: 'ops_plan',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      opsPlan: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReinitPlanRequest extends $tea.Model {
  authToken?: string;
  // id
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReinitPlanResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // ops_plan
  opsPlan?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      opsPlan: 'ops_plan',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      opsPlan: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetPlanRequest extends $tea.Model {
  authToken?: string;
  // id
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetPlanResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 发布单详情
  opsPlan?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      opsPlan: 'ops_plan',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      opsPlan: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetPlanBasicRequest extends $tea.Model {
  authToken?: string;
  // show_basic
  showBasic?: boolean;
  // time_series_id
  timeSeriesId?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      showBasic: 'show_basic',
      timeSeriesId: 'time_series_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      showBasic: 'boolean',
      timeSeriesId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetPlanBasicResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // ops_plan
  opsPlan?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      opsPlan: 'ops_plan',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      opsPlan: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetPlanProgressRequest extends $tea.Model {
  authToken?: string;
  // id
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetPlanProgressResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // progress
  progress?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      progress: 'progress',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      progress: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPlanRequest extends $tea.Model {
  authToken?: string;
  // gmtCreateEnd
  gmtCreateEnd?: string;
  // gmtCreateStart
  gmtCreateStart?: string;
  // initialByTag
  initialByTag?: string;
  // name
  name?: string;
  // opsModes
  opsModes?: string[];
  // ops_types
  opsTypes?: string[];
  // page no
  pageNo?: number;
  // page size
  pageSize?: number;
  // plan_ids
  planIds?: string[];
  // plan_time_serials_id
  planTimeSerialsId?: string;
  // releaseModes
  releaseModes?: string[];
  // serviceName
  serviceName?: string;
  // states
  states?: string[];
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      gmtCreateEnd: 'gmt_create_end',
      gmtCreateStart: 'gmt_create_start',
      initialByTag: 'initial_by_tag',
      name: 'name',
      opsModes: 'ops_modes',
      opsTypes: 'ops_types',
      pageNo: 'page_no',
      pageSize: 'page_size',
      planIds: 'plan_ids',
      planTimeSerialsId: 'plan_time_serials_id',
      releaseModes: 'release_modes',
      serviceName: 'service_name',
      states: 'states',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      gmtCreateEnd: 'string',
      gmtCreateStart: 'string',
      initialByTag: 'string',
      name: 'string',
      opsModes: { 'type': 'array', 'itemType': 'string' },
      opsTypes: { 'type': 'array', 'itemType': 'string' },
      pageNo: 'number',
      pageSize: 'number',
      planIds: { 'type': 'array', 'itemType': 'string' },
      planTimeSerialsId: 'string',
      releaseModes: { 'type': 'array', 'itemType': 'string' },
      serviceName: 'string',
      states: { 'type': 'array', 'itemType': 'string' },
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPlanResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 列表
  list?: string[];
  // page_no
  pageNo?: number;
  // page_size
  pageSize?: number;
  // total_size
  totalSize?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      list: 'list',
      pageNo: 'page_no',
      pageSize: 'page_size',
      totalSize: 'total_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      list: { 'type': 'array', 'itemType': 'string' },
      pageNo: 'number',
      pageSize: 'number',
      totalSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountPlanStateRequest extends $tea.Model {
  authToken?: string;
  // gmt_create_end
  gmtCreateEnd?: string;
  // gmtCreateStart
  gmtCreateStart?: string;
  // initial_by_tag
  initialByTag?: string;
  // name
  name?: string;
  // ops_modes
  opsModes?: string[];
  // ops_types
  opsTypes?: string[];
  // page no
  pageNo?: number;
  // page size
  pageSize?: number;
  // plan ids
  planIds?: string[];
  // plan_time_serials_id
  planTimeSerialsId?: string;
  // release_modes
  releaseModes?: string[];
  // service_name
  serviceName?: string;
  // states
  states?: string[];
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      gmtCreateEnd: 'gmt_create_end',
      gmtCreateStart: 'gmt_create_start',
      initialByTag: 'initial_by_tag',
      name: 'name',
      opsModes: 'ops_modes',
      opsTypes: 'ops_types',
      pageNo: 'page_no',
      pageSize: 'page_size',
      planIds: 'plan_ids',
      planTimeSerialsId: 'plan_time_serials_id',
      releaseModes: 'release_modes',
      serviceName: 'service_name',
      states: 'states',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      gmtCreateEnd: 'string',
      gmtCreateStart: 'string',
      initialByTag: 'string',
      name: 'string',
      opsModes: { 'type': 'array', 'itemType': 'string' },
      opsTypes: { 'type': 'array', 'itemType': 'string' },
      pageNo: 'number',
      pageSize: 'number',
      planIds: { 'type': 'array', 'itemType': 'string' },
      planTimeSerialsId: 'string',
      releaseModes: { 'type': 'array', 'itemType': 'string' },
      serviceName: 'string',
      states: { 'type': 'array', 'itemType': 'string' },
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountPlanStateResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // state_counts
  stateCounts?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      stateCounts: 'state_counts',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      stateCounts: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecPlanRequest extends $tea.Model {
  authToken?: string;
  // id
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecPlanResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // ops_plan
  opsPlan?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      opsPlan: 'ops_plan',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      opsPlan: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryPlanRequest extends $tea.Model {
  authToken?: string;
  // id
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryPlanResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // ops plan
  opsPlan?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      opsPlan: 'ops_plan',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      opsPlan: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelPlanRequest extends $tea.Model {
  authToken?: string;
  // id
  id?: string;
  // reason
  reason?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      reason: 'reason',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      reason: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelPlanResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // ops_plan
  opsPlan?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      opsPlan: 'ops_plan',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      opsPlan: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RollbackPlanRequest extends $tea.Model {
  authToken?: string;
  // id
  id?: string;
  // rollback_info
  rollbackInfo?: RollbackInfo;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      rollbackInfo: 'rollback_info',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      rollbackInfo: RollbackInfo,
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RollbackPlanResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // ops_plan
  opsPlan?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      opsPlan: 'ops_plan',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      opsPlan: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTaskSummaryRequest extends $tea.Model {
  authToken?: string;
  // id
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTaskSummaryResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // task
  task?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      task: 'task',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      task: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SkipTaskRequest extends $tea.Model {
  authToken?: string;
  // id
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SkipTaskResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // task
  task?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      task: 'task',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      task: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryTaskRequest extends $tea.Model {
  authToken?: string;
  // id
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryTaskResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // task
  task?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      task: 'task',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      task: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRoleRequest extends $tea.Model {
  authToken?: string;
  // from_aliyun
  fromAliyun?: boolean;
  // page_size
  pageSize?: number;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      fromAliyun: 'from_aliyun',
      pageSize: 'page_size',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      fromAliyun: 'boolean',
      pageSize: 'number',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRoleResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 角色信息
  roles?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      roles: 'roles',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      roles: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateServicegroupcollectionRequest extends $tea.Model {
  authToken?: string;
  // arrangement_id
  arrangementId?: string;
  // process_definition_id
  processDefinitionId?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      arrangementId: 'arrangement_id',
      processDefinitionId: 'process_definition_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      arrangementId: 'string',
      processDefinitionId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateServicegroupcollectionResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 集合信息
  collection?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      collection: 'collection',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      collection: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteServicegroupcollectionRequest extends $tea.Model {
  authToken?: string;
  // arrangement_id
  arrangementId?: string;
  // process_definition_id
  processDefinitionId?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      arrangementId: 'arrangement_id',
      processDefinitionId: 'process_definition_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      arrangementId: 'string',
      processDefinitionId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteServicegroupcollectionResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 集合
  collections?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      collections: 'collections',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      collections: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryServicegroupRequest extends $tea.Model {
  authToken?: string;
  // id
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryServicegroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // group
  group?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      group: 'group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      group: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecServicegroupRequest extends $tea.Model {
  authToken?: string;
  // id
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecServicegroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 分组
  group?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      group: 'group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      group: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SkipServicegroupRequest extends $tea.Model {
  authToken?: string;
  // id
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SkipServicegroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 分组
  group?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      group: 'group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      group: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateServicegroupRequest extends $tea.Model {
  authToken?: string;
  // append
  append?: boolean;
  // service_group_id
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      append: 'append',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      append: 'boolean',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateServicegroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 分组
  group?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      group: 'group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      group: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteServicegroupRequest extends $tea.Model {
  authToken?: string;
  // id
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteServicegroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 分组
  group?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      group: 'group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      group: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SwitchServicegroupRequest extends $tea.Model {
  authToken?: string;
  // service_group_id
  serviceGroupId?: string;
  // service_id
  serviceId?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      serviceGroupId: 'service_group_id',
      serviceId: 'service_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      serviceGroupId: 'string',
      serviceId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SwitchServicegroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // groups
  groups?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      groups: 'groups',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      groups: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetServiceRequest extends $tea.Model {
  authToken?: string;
  // id
  id?: string;
  // 是否带上机器信息
  withMachineGroups?: boolean;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      withMachineGroups: 'with_machine_groups',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      withMachineGroups: 'boolean',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetServiceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // service
  service?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      service: 'service',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      service: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetServiceProgressRequest extends $tea.Model {
  authToken?: string;
  // id
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetServiceProgressResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 进度
  progress?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      progress: 'progress',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      progress: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryServiceProgressRequest extends $tea.Model {
  authToken?: string;
  // depth
  depth?: number;
  // gmt_create_end
  gmtCreateEnd?: string;
  // gmt_create_start
  gmtCreateStart?: string;
  // ids
  ids?: string[];
  // name
  name?: string;
  // ops_types
  opsTypes?: string[];
  // page_no
  pageNo?: number;
  // page_size
  pageSize?: number;
  // process_definition_id
  processDefinitionId?: string;
  // service_group_collection_id
  serviceGroupCollectionId?: string;
  // service_paas_id
  servicePaasId?: string;
  // state
  state?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      depth: 'depth',
      gmtCreateEnd: 'gmt_create_end',
      gmtCreateStart: 'gmt_create_start',
      ids: 'ids',
      name: 'name',
      opsTypes: 'ops_types',
      pageNo: 'page_no',
      pageSize: 'page_size',
      processDefinitionId: 'process_definition_id',
      serviceGroupCollectionId: 'service_group_collection_id',
      servicePaasId: 'service_paas_id',
      state: 'state',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      depth: 'number',
      gmtCreateEnd: 'string',
      gmtCreateStart: 'string',
      ids: { 'type': 'array', 'itemType': 'string' },
      name: 'string',
      opsTypes: { 'type': 'array', 'itemType': 'string' },
      pageNo: 'number',
      pageSize: 'number',
      processDefinitionId: 'string',
      serviceGroupCollectionId: 'string',
      servicePaasId: 'string',
      state: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryServiceProgressResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // progresses
  progresses?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      progresses: 'progresses',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      progresses: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryServiceSlbmountRequest extends $tea.Model {
  authToken?: string;
  // service_id
  serviceId?: string;
  // slb_id
  slbId?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      serviceId: 'service_id',
      slbId: 'slb_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      serviceId: 'string',
      slbId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryServiceSlbmountResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // mout_info_list
  mountInfoList?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      mountInfoList: 'mount_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      mountInfoList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryServiceSlbmountRequest extends $tea.Model {
  authToken?: string;
  // service_id
  serviceId?: string;
  // slb_ids
  slbIds?: string[];
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      serviceId: 'service_id',
      slbIds: 'slb_ids',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      serviceId: 'string',
      slbIds: { 'type': 'array', 'itemType': 'string' },
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryServiceSlbmountResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // slb_info_list
  mountInfoList?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      mountInfoList: 'mount_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      mountInfoList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateServiceSlbmountRequest extends $tea.Model {
  authToken?: string;
  // 权重
  mountInfo?: Pair[];
  // region_identity
  regionIdentity?: string;
  // service_id
  serviceId?: string;
  // slb_id
  slbId?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      mountInfo: 'mount_info',
      regionIdentity: 'region_identity',
      serviceId: 'service_id',
      slbId: 'slb_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      mountInfo: { 'type': 'array', 'itemType': Pair },
      regionIdentity: 'string',
      serviceId: 'string',
      slbId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateServiceSlbmountResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // process_id
  processId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      processId: 'process_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      processId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryServiceSlbmountprogressRequest extends $tea.Model {
  authToken?: string;
  // process_id
  processId?: string;
  // region_identity
  regionIdentity?: string;
  // service_id
  serviceId?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      processId: 'process_id',
      regionIdentity: 'region_identity',
      serviceId: 'service_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      processId: 'string',
      regionIdentity: 'string',
      serviceId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryServiceSlbmountprogressResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 执行进度
  progress?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      progress: 'progress',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      progress: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryServiceLatestsuccessRequest extends $tea.Model {
  authToken?: string;
  // service_paas_id
  servicePaasId?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      servicePaasId: 'service_paas_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      servicePaasId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryServiceLatestsuccessResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // service
  service?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      service: 'service',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      service: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReinitServiceRequest extends $tea.Model {
  authToken?: string;
  // id
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReinitServiceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // service
  service?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      service: 'service',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      service: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecServiceRequest extends $tea.Model {
  authToken?: string;
  // id
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecServiceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // service
  service?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      service: 'service',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      service: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelServiceRequest extends $tea.Model {
  authToken?: string;
  // id
  id?: string;
  // reason
  reason?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      reason: 'reason',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      reason: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelServiceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // service
  service?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      service: 'service',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      service: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SkipServiceRequest extends $tea.Model {
  authToken?: string;
  // id
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SkipServiceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // service
  service?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      service: 'service',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      service: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartServiceRequest extends $tea.Model {
  authToken?: string;
  // id
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartServiceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // service
  service?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      service: 'service',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      service: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmServiceRequest extends $tea.Model {
  authToken?: string;
  // id
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmServiceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // service
  service?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      service: 'service',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      service: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetServiceMachinegroupRequest extends $tea.Model {
  authToken?: string;
  // 分组数
  groupMount?: number;
  // groupStrategyType
  groupStrategyType?: string;
  // machine_groups
  machineGroups?: string[];
  // need_beta
  needBeta?: boolean;
  // service_id
  serviceId?: string;
  // use_default_setup
  useDefaultSetup?: boolean;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      groupMount: 'group_mount',
      groupStrategyType: 'group_strategy_type',
      machineGroups: 'machine_groups',
      needBeta: 'need_beta',
      serviceId: 'service_id',
      useDefaultSetup: 'use_default_setup',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      groupMount: 'number',
      groupStrategyType: 'string',
      machineGroups: { 'type': 'array', 'itemType': 'string' },
      needBeta: 'boolean',
      serviceId: 'string',
      useDefaultSetup: 'boolean',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetServiceMachinegroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // service
  service?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      service: 'service',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      service: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReinitServiceMachinegroupRequest extends $tea.Model {
  authToken?: string;
  // id
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReinitServiceMachinegroupResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // service
  service?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      service: 'service',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      service: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListServiceRollbackversionRequest extends $tea.Model {
  authToken?: string;
  // id
  id?: string;
  // limit
  limit?: number;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      limit: 'limit',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      limit: 'number',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListServiceRollbackversionResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // services
  services?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      services: 'services',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      services: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryServiceRollbackversionRequest extends $tea.Model {
  authToken?: string;
  // depth
  depth?: number;
  // gmt_create_end
  gmtCreateEnd?: string;
  // gmt_create_start
  gmtCreateStart?: string;
  // ids
  ids?: string[];
  // name
  name?: string;
  // ops_types
  opsTypes?: string[];
  // page_no
  pageNo?: number;
  // page_size
  pageSize?: number;
  // process_definition_id
  processDefinitionId?: string;
  // service_group_collection_id
  serviceGroupCollectionId?: string;
  // service_paas_id
  servicePaasId?: string;
  // state
  state?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      depth: 'depth',
      gmtCreateEnd: 'gmt_create_end',
      gmtCreateStart: 'gmt_create_start',
      ids: 'ids',
      name: 'name',
      opsTypes: 'ops_types',
      pageNo: 'page_no',
      pageSize: 'page_size',
      processDefinitionId: 'process_definition_id',
      serviceGroupCollectionId: 'service_group_collection_id',
      servicePaasId: 'service_paas_id',
      state: 'state',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      depth: 'number',
      gmtCreateEnd: 'string',
      gmtCreateStart: 'string',
      ids: { 'type': 'array', 'itemType': 'string' },
      name: 'string',
      opsTypes: { 'type': 'array', 'itemType': 'string' },
      pageNo: 'number',
      pageSize: 'number',
      processDefinitionId: 'string',
      serviceGroupCollectionId: 'string',
      servicePaasId: 'string',
      state: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryServiceRollbackversionResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 版本
  versions?: Pair[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      versions: 'versions',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      versions: { 'type': 'array', 'itemType': Pair },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RollbackServiceRequest extends $tea.Model {
  authToken?: string;
  // id
  id?: string;
  // rollback_info
  rollbackInfo?: RollbackInfo;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      rollbackInfo: 'rollback_info',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      rollbackInfo: RollbackInfo,
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RollbackServiceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 回滚信息
  service?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      service: 'service',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      service: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmrollbackServiceRequest extends $tea.Model {
  authToken?: string;
  // id
  id?: string;
  // retry_rollbacked
  retryRollbacked?: boolean;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      retryRollbacked: 'retry_rollbacked',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      retryRollbacked: 'boolean',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmrollbackServiceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // service
  service?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      service: 'service',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      service: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryrollbackServiceRequest extends $tea.Model {
  authToken?: string;
  // id
  id?: string;
  // rollback_info
  rollbackInfo?: RollbackInfo;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      rollbackInfo: 'rollback_info',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      rollbackInfo: RollbackInfo,
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryrollbackServiceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // service
  service?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      service: 'service',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      service: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetServiceArrangementRequest extends $tea.Model {
  authToken?: string;
  // node_id
  nodeId?: string;
  // service_id
  serviceId?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      nodeId: 'node_id',
      serviceId: 'service_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      nodeId: 'string',
      serviceId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetServiceArrangementResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // execution_detail
  executionDetail?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      executionDetail: 'execution_detail',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      executionDetail: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryServiceArrangementRequest extends $tea.Model {
  authToken?: string;
  // arrangement_id
  arrangementId?: string;
  // service_id
  serviceId?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      arrangementId: 'arrangement_id',
      serviceId: 'service_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      arrangementId: 'string',
      serviceId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryServiceArrangementResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // service
  service?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      service: 'service',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      service: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SkipServiceArrangementRequest extends $tea.Model {
  authToken?: string;
  // arrangement_id
  arrangementId?: string;
  // service_id
  serviceId?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      arrangementId: 'arrangement_id',
      serviceId: 'service_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      arrangementId: 'string',
      serviceId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SkipServiceArrangementResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // service
  service?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      service: 'service',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      service: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOperationlogRequest extends $tea.Model {
  authToken?: string;
  // event
  event?: string;
  // page_no
  pageNo?: number;
  // page_size
  pageSize?: number;
  // result
  result?: boolean;
  // target_id
  targetId?: string;
  // target_type
  targetType?: string;
  // user_id
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      event: 'event',
      pageNo: 'page_no',
      pageSize: 'page_size',
      result: 'result',
      targetId: 'target_id',
      targetType: 'target_type',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      event: 'string',
      pageNo: 'number',
      pageSize: 'number',
      result: 'boolean',
      targetId: 'string',
      targetType: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOperationlogResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // list
  list?: string[];
  // page_no
  pageNo?: number;
  // page_size
  pageSize?: number;
  // total_count
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      list: 'list',
      pageNo: 'page_no',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      list: { 'type': 'array', 'itemType': 'string' },
      pageNo: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOperationlogTimelineRequest extends $tea.Model {
  authToken?: string;
  // customer_id
  customerId?: string;
  // gmt_from
  gmtFrom?: string;
  // gmt_to
  gmtTo?: string;
  // module
  module?: string;
  // operation_status
  operationStatus?: string;
  // operation_target
  operationTarget?: string;
  // operation_type
  operationType?: string;
  // operator_id
  operatorId?: string;
  // page_no
  pageNo?: number;
  // page_size
  pageSize?: number;
  // status
  status?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      customerId: 'customer_id',
      gmtFrom: 'gmt_from',
      gmtTo: 'gmt_to',
      module: 'module',
      operationStatus: 'operation_status',
      operationTarget: 'operation_target',
      operationType: 'operation_type',
      operatorId: 'operator_id',
      pageNo: 'page_no',
      pageSize: 'page_size',
      status: 'status',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      customerId: 'string',
      gmtFrom: 'string',
      gmtTo: 'string',
      module: 'string',
      operationStatus: 'string',
      operationTarget: 'string',
      operationType: 'string',
      operatorId: 'string',
      pageNo: 'number',
      pageSize: 'number',
      status: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOperationlogTimelineResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // list
  list?: string[];
  // page_no
  pageNo?: number;
  // page_size
  pageSize?: number;
  // total_count
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      list: 'list',
      pageNo: 'page_no',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      list: { 'type': 'array', 'itemType': 'string' },
      pageNo: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetServiceDetailRequest extends $tea.Model {
  authToken?: string;
  // id
  id?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetServiceDetailResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // service
  service?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      service: 'service',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      service: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateMetaCellRequest extends $tea.Model {
  authToken?: string;
  // request
  request?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      request: 'request',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      request: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateMetaCellResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // data
  data?: string;
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
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMetaCellRequest extends $tea.Model {
  authToken?: string;
  // request
  request?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      request: 'request',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      request: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMetaCellResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class AddMetaMasterzonerelRequest extends $tea.Model {
  authToken?: string;
  // request
  request?: string;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      request: 'request',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      request: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddMetaMasterzonerelResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class AssignComputerRequest extends $tea.Model {
  authToken?: string;
  // 应用的完整名称
  applicationName?: string;
  // 是否启用自动运维，默认为**False**
  autoOps?: boolean;
  // 计算资源与cell的关系，如果不指定会根据分配的应用、服务实例以及computer的zone信息由系统决定，如果无法决定会导致失败，建议在指定了service_name参数的情形下指定该参数
  computerCells?: ComputerCell[];
  // 计算资源id，可以指定多个
  computerIds?: string[];
  // 是否重新初始化数据磁盘，默认为**False**
  initDataDisk?: boolean;
  // 是否重新初始化系统磁盘，默认为**False**
  initSysDisk?: boolean;
  // 请求业务id，用于幂等性控制等，需要客户端提供并保证唯一。最大64位单字节字符
  reqBizId?: string;
  // 目标服务实例名称
  serviceName?: string;
  // 目标工作空间名称
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      applicationName: 'application_name',
      autoOps: 'auto_ops',
      computerCells: 'computer_cells',
      computerIds: 'computer_ids',
      initDataDisk: 'init_data_disk',
      initSysDisk: 'init_sys_disk',
      reqBizId: 'req_biz_id',
      serviceName: 'service_name',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      applicationName: 'string',
      autoOps: 'boolean',
      computerCells: { 'type': 'array', 'itemType': ComputerCell },
      computerIds: { 'type': 'array', 'itemType': 'string' },
      initDataDisk: 'boolean',
      initSysDisk: 'boolean',
      reqBizId: 'string',
      serviceName: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AssignComputerResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 请求的id
  taskId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReleaseComputerRequest extends $tea.Model {
  authToken?: string;
  // 计算资源id，可以指定多个
  computerIds?: string[];
  // 请求业务id，用于幂等性控制等，需要客户端提供并保证唯一。最大64位单字节字符
  reqBizId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      computerIds: 'computer_ids',
      reqBizId: 'req_biz_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      computerIds: { 'type': 'array', 'itemType': 'string' },
      reqBizId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReleaseComputerResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 请求的id
  taskId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTaskRequest extends $tea.Model {
  authToken?: string;
  // 请求的业务号，当`task_id`参数指定时该参数会被忽略
  reqBizId?: string;
  // 异步请求的id， 当`req_biz_id`参数指定时可以不指定该参数，如果指定了该参数则忽略`req_biz_id`参数
  taskId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      reqBizId: 'req_biz_id',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      reqBizId: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTaskResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 
  //                             异步请求创建的时间和日期。采用UTC时间，按照[ISO8601](https://zh.wikipedia.org/wiki/ISO_8601)标准表示，格式为：`YYYY-MM-DDThh:mm:ssZ`
  //                         
  creationTime?: string;
  // 异步请求中任务的执行结果，key为任务操作对象id比如某个资源的id，value为操作结果
  executionResults?: TaskResult[];
  // 异步请求唯一标识
  id?: string;
  // 异步请求业务号
  reqBizId?: string;
  // 异步请求状态，取值：
  //                             INIT：初始化中；
  //                             READY：待执行；
  //                             PROCESSING：执行中；
  //                             COMPLETED：执行完成
  //                         
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      creationTime: 'creation_time',
      executionResults: 'execution_results',
      id: 'id',
      reqBizId: 'req_biz_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      creationTime: 'string',
      executionResults: { 'type': 'array', 'itemType': TaskResult },
      id: 'string',
      reqBizId: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateComputerRequest extends $tea.Model {
  authToken?: string;
  // 实例描述
  description?: string;
  // 镜像文件ID，启动实例时选择的镜像资源。
  imageId?: string;
  // 创建的实例数量。默认为 1 台
  instanceCount?: number;
  // 实例名称前缀。可包含小写字母(a-z)，数字(0-9) 和中划线(-)，以字母开头，中划线不能结尾或连续使用，2 ~ 40 个字符。
  name?: string;
  // 实例的密码。长度为8至30个字符，必须同时包含大小写英文字母、数字和特殊符号中的三类字符。特殊符号可以是：
  // ()`~!@#^&*-_+=|{}[]:;'<>,.?/
  // 其中，Windows实例不能以斜线号（/）为密码首字符。
  paasword?: string;
  // 实例所在地域
  region?: string;
  // image 或者 package
  deployType?: string;
  // 新创建实例所属于的安全组ID，同一个安全组内的实例之间可以互相访问。
  securityGroupId?: string;
  // 实例的资源规格。
  specId?: string;
  // 单位 G。系统盘大小，需根据选择的 image 类型决定。
  systemDiskSize?: string;
  // 系统盘类型
  systemDiskType?: string;
  // VPC类型的实例，需要指定虚拟交换机ID。
  vSwitchId?: string;
  // 实例所在工作空间
  workspace?: string;
  // 实例所在可用区
  zone?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      description: 'description',
      imageId: 'image_id',
      instanceCount: 'instance_count',
      name: 'name',
      paasword: 'paasword',
      region: 'region',
      deployType: 'deploy_type',
      securityGroupId: 'security_group_id',
      specId: 'spec_id',
      systemDiskSize: 'system_disk_size',
      systemDiskType: 'system_disk_type',
      vSwitchId: 'v_switch_id',
      workspace: 'workspace',
      zone: 'zone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      description: 'string',
      imageId: 'string',
      instanceCount: 'number',
      name: 'string',
      paasword: 'string',
      region: 'string',
      deployType: 'string',
      securityGroupId: 'string',
      specId: 'string',
      systemDiskSize: 'string',
      systemDiskType: 'string',
      vSwitchId: 'string',
      workspace: 'string',
      zone: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateComputerResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 实例 id
  computerIds?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      computerIds: 'computer_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      computerIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSidecarRequest extends $tea.Model {
  authToken?: string;
  // sidecar描述
  description?: string;
  // sidecar名称
  sidecarName?: string;
  // sidecar生效范围：workspace、workspace_group、region
  scope?: string;
  // scope对应的唯一标识，例如workspace对应workspace id
  scopeIdentity?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      description: 'description',
      sidecarName: 'sidecar_name',
      scope: 'scope',
      scopeIdentity: 'scope_identity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      description: 'string',
      sidecarName: 'string',
      scope: 'string',
      scopeIdentity: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSidecarResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ListSidecarRequest extends $tea.Model {
  authToken?: string;
  // 分页请求体
  paginationQuery?: PaginationQuery;
  // sidecar生效范围：workspace、workspace_group、region
  scope?: string;
  // scope对应的唯一标识符
  scopeIdentity?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      paginationQuery: 'pagination_query',
      scope: 'scope',
      scopeIdentity: 'scope_identity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      paginationQuery: PaginationQuery,
      scope: 'string',
      scopeIdentity: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSidecarResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // sidecar元信息结构体列表
  sidecars?: Sidecar[];
  // 总记录条数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sidecars: 'sidecars',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sidecars: { 'type': 'array', 'itemType': Sidecar },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSidecarVersionRequest extends $tea.Model {
  authToken?: string;
  // sidecar版本描述
  description?: string;
  // release note
  releaseNote?: string;
  // sidecar生效范围：workspace、workspace_group、region
  scope?: string;
  // scope对应的唯一标识，例如workspace对应workspace_name
  scopeIdentity?: string;
  // sidecar名称
  sidecarName?: string;
  // sidecar版本号
  sidecarVersion?: string;
  // 模板内容
  template?: string;
  // sidecar模板配置
  templateConfigs?: SidecarTemplateConfig[];
  // sidecar版本类型
  type?: string;
  // 版本周期：alpha/beta/release
  versionPeriod?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      description: 'description',
      releaseNote: 'release_note',
      scope: 'scope',
      scopeIdentity: 'scope_identity',
      sidecarName: 'sidecar_name',
      sidecarVersion: 'sidecar_version',
      template: 'template',
      templateConfigs: 'template_configs',
      type: 'type',
      versionPeriod: 'version_period',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      description: 'string',
      releaseNote: 'string',
      scope: 'string',
      scopeIdentity: 'string',
      sidecarName: 'string',
      sidecarVersion: 'string',
      template: 'string',
      templateConfigs: { 'type': 'array', 'itemType': SidecarTemplateConfig },
      type: 'string',
      versionPeriod: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSidecarVersionResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ListSidecarVersionRequest extends $tea.Model {
  authToken?: string;
  // 分页查询请求体
  paginationQuery?: PaginationQuery;
  // sidecar生效范围：workspace、workspace_group、region
  scope?: string;
  // scope对应的唯一标识，例如workspace对应workspace id
  scopeIdentity?: string;
  // sidecar名称
  sidecarName?: string;
  // sidecar版本号
  sidecarVersion?: string;
  // 版本状态
  status?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      paginationQuery: 'pagination_query',
      scope: 'scope',
      scopeIdentity: 'scope_identity',
      sidecarName: 'sidecar_name',
      sidecarVersion: 'sidecar_version',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      paginationQuery: PaginationQuery,
      scope: 'string',
      scopeIdentity: 'string',
      sidecarName: 'string',
      sidecarVersion: 'string',
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSidecarVersionResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // sidecar发布版本列表
  sidecarReleaseVersions?: SidecarReleaseVersion[];
  // 总记录条数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sidecarReleaseVersions: 'sidecar_release_versions',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sidecarReleaseVersions: { 'type': 'array', 'itemType': SidecarReleaseVersion },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSidecarVersionRequest extends $tea.Model {
  authToken?: string;
  // sidecar生效范围：workspace、workspace_group、region
  scope?: string;
  // scope对应的唯一标识，例如workspace对应workspace id
  scopeIdentity?: string;
  // sidecar版本
  sidecarName?: string;
  // sidecar版本号
  sidecarVersion?: string;
  // sidecar版本类型
  type?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      scope: 'scope',
      scopeIdentity: 'scope_identity',
      sidecarName: 'sidecar_name',
      sidecarVersion: 'sidecar_version',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      scope: 'string',
      scopeIdentity: 'string',
      sidecarName: 'string',
      sidecarVersion: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSidecarVersionResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // sidecar发布版本
  sidecarReleaseVersion?: SidecarReleaseVersion;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sidecarReleaseVersion: 'sidecar_release_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sidecarReleaseVersion: SidecarReleaseVersion,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSidecarRuleRequest extends $tea.Model {
  authToken?: string;
  // 规则描述
  description?: string;
  // 规则优先级
  level?: number;
  // sidecar生效范围：workspace、workspace_group、region
  scope?: string;
  // scope对应的唯一标识，例如workspace对应workspace id	
  // 
  scopeIdentity?: string;
  // sidecar版本实例id
  sidecarVersionInstanceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      description: 'description',
      level: 'level',
      scope: 'scope',
      scopeIdentity: 'scope_identity',
      sidecarVersionInstanceId: 'sidecar_version_instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      description: 'string',
      level: 'number',
      scope: 'string',
      scopeIdentity: 'string',
      sidecarVersionInstanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSidecarRuleResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class GetSidecarRuleRequest extends $tea.Model {
  authToken?: string;
  // sidecar生效范围：workspace、workspace_group、region
  scope?: string;
  // scope对应的唯一标识，例如workspace对应workspace id	
  // 
  scopeIdentity?: string;
  // sidecar版本id
  sidecarVersionInstanceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      scope: 'scope',
      scopeIdentity: 'scope_identity',
      sidecarVersionInstanceId: 'sidecar_version_instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      scope: 'string',
      scopeIdentity: 'string',
      sidecarVersionInstanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSidecarRuleResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // sidecar rule结构体
  sidecarRule?: SidecarRule;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sidecarRule: 'sidecar_rule',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sidecarRule: SidecarRule,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSidecarRuleRequest extends $tea.Model {
  authToken?: string;
  // 分页查询
  paginationQuery?: PaginationQuery;
  // sidecar生效范围：workspace、workspace_group、region
  scope?: string;
  // scope对应的唯一标识，例如workspace对应workspace id	
  // 
  scopeIdentity?: string;
  // sidecar名称
  sidecarName?: string;
  // 规则状态
  status?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      paginationQuery: 'pagination_query',
      scope: 'scope',
      scopeIdentity: 'scope_identity',
      sidecarName: 'sidecar_name',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      paginationQuery: PaginationQuery,
      scope: 'string',
      scopeIdentity: 'string',
      sidecarName: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSidecarRuleResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // sidecar规则详情列表
  sidecarRules?: SidecarRule[];
  // 总记录条数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sidecarRules: 'sidecar_rules',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sidecarRules: { 'type': 'array', 'itemType': SidecarRule },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSidecarInstanceRequest extends $tea.Model {
  authToken?: string;
  // 规则描述
  description?: string;
  // 实例名称
  instanceName?: string;
  // 环境参数模板
  params?: string;
  // 自定义规则内容
  rule?: string;
  // sidecar生效范围：workspace、workspace_group、region	
  // 
  scope?: string;
  // scope对应的唯一标识，例如workspace对应workspace id	
  // 
  scopeIdentity?: string;
  // sidecar版本id	
  // 
  sidecarReleaseVersionId?: string;
  // sidecar环境参数配置	
  // 
  paramsConfigs?: SidecarParamsConfig[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      description: 'description',
      instanceName: 'instance_name',
      params: 'params',
      rule: 'rule',
      scope: 'scope',
      scopeIdentity: 'scope_identity',
      sidecarReleaseVersionId: 'sidecar_release_version_id',
      paramsConfigs: 'params_configs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      description: 'string',
      instanceName: 'string',
      params: 'string',
      rule: 'string',
      scope: 'string',
      scopeIdentity: 'string',
      sidecarReleaseVersionId: 'string',
      paramsConfigs: { 'type': 'array', 'itemType': SidecarParamsConfig },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSidecarInstanceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ListSidecarInstanceRequest extends $tea.Model {
  authToken?: string;
  // 版本实例名称
  instanceName?: string;
  // 分页查询
  paginationQuery?: PaginationQuery;
  // sidecar生效范围：workspace、workspace_group、region	
  // 
  scope?: string;
  // scope对应的唯一标识，例如workspace对应workspace id	
  // 
  scopeIdentity?: string;
  // 版本实例状态
  status?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      instanceName: 'instance_name',
      paginationQuery: 'pagination_query',
      scope: 'scope',
      scopeIdentity: 'scope_identity',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      instanceName: 'string',
      paginationQuery: PaginationQuery,
      scope: 'string',
      scopeIdentity: 'string',
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSidecarInstanceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // sidecar版本实例列表
  sidecarVersionInstances?: SidecarVersionInstance[];
  // 总记录条数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sidecarVersionInstances: 'sidecar_version_instances',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sidecarVersionInstances: { 'type': 'array', 'itemType': SidecarVersionInstance },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSidecarInstanceRequest extends $tea.Model {
  authToken?: string;
  // 版本实例名称
  instanceName?: string;
  // sidecar生效范围：workspace、workspace_group、region	
  // 
  scope?: string;
  // scope对应的唯一标识，例如workspace对应workspace id	
  // 
  scopeIdentity?: string;
  // sidecar版本id
  sidecarReleaseVersionId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      instanceName: 'instance_name',
      scope: 'scope',
      scopeIdentity: 'scope_identity',
      sidecarReleaseVersionId: 'sidecar_release_version_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      instanceName: 'string',
      scope: 'string',
      scopeIdentity: 'string',
      sidecarReleaseVersionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSidecarInstanceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // sidecar版本实例
  sidecarVersionInstance?: SidecarVersionInstance;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sidecarVersionInstance: 'sidecar_version_instance',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sidecarVersionInstance: SidecarVersionInstance,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSidecarRequest extends $tea.Model {
  authToken?: string;
  // sidecar生效范围：workspace、workspace_group、region	
  // 
  scope?: string;
  // scope对应的唯一标识符
  scopeIdentity?: string;
  // sidecar名称
  sidecarName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      scope: 'scope',
      scopeIdentity: 'scope_identity',
      sidecarName: 'sidecar_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      scope: 'string',
      scopeIdentity: 'string',
      sidecarName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSidecarResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // sidecar类型
  sidecar?: Sidecar;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sidecar: 'sidecar',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sidecar: Sidecar,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSidecarRequest extends $tea.Model {
  authToken?: string;
  // sidecar类型描述
  description?: string;
  // sidecar生效范围：workspace、workspace_group、region	
  // 
  scope?: string;
  // scope对应的唯一标识，例如workspace对应workspace id	
  // 
  scopeIdentity?: string;
  // sidecar名称
  sidecarName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      description: 'description',
      scope: 'scope',
      scopeIdentity: 'scope_identity',
      sidecarName: 'sidecar_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      description: 'string',
      scope: 'string',
      scopeIdentity: 'string',
      sidecarName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSidecarResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class DeleteSidecarRequest extends $tea.Model {
  authToken?: string;
  // sidecar名称
  sidecarName?: string;
  // sidecar生效范围：workspace、workspace_group、region	
  // 
  scope?: string;
  // scope对应的唯一标识，例如workspace对应workspace id	
  // 
  scopeIdentity?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      sidecarName: 'sidecar_name',
      scope: 'scope',
      scopeIdentity: 'scope_identity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      sidecarName: 'string',
      scope: 'string',
      scopeIdentity: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSidecarResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UpdateSidecarVersionRequest extends $tea.Model {
  authToken?: string;
  // sidecar版本描述
  description?: string;
  // sidecar生效范围：workspace、workspace_group、region	
  // 
  scope?: string;
  // scope对应的唯一标识，例如workspace对应workspace id
  scopeIdentity?: string;
  // sidecar名称
  sidecarName?: string;
  // sidecar版本号
  sidecarVersion?: string;
  // 版本状态
  status?: number;
  // sidecar模板内容
  template?: string;
  // sidecar模板配置
  templateConfigs?: SidecarTemplateConfig[];
  // sidecar版本类型
  type?: string;
  // 版本周期：alpha/beta/release
  // 
  versionPeriod?: string;
  // 版本特性
  releaseNote?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      description: 'description',
      scope: 'scope',
      scopeIdentity: 'scope_identity',
      sidecarName: 'sidecar_name',
      sidecarVersion: 'sidecar_version',
      status: 'status',
      template: 'template',
      templateConfigs: 'template_configs',
      type: 'type',
      versionPeriod: 'version_period',
      releaseNote: 'release_note',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      description: 'string',
      scope: 'string',
      scopeIdentity: 'string',
      sidecarName: 'string',
      sidecarVersion: 'string',
      status: 'number',
      template: 'string',
      templateConfigs: { 'type': 'array', 'itemType': SidecarTemplateConfig },
      type: 'string',
      versionPeriod: 'string',
      releaseNote: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSidecarVersionResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class DeleteSidecarVersionRequest extends $tea.Model {
  authToken?: string;
  // sidecar生效范围：workspace、workspace_group、region	
  // 
  scope?: string;
  // scope对应的唯一标识，例如workspace对应workspace id	
  // 
  scopeIdentity?: string;
  // sidecar名称
  sidecarName?: string;
  // sidecar版本号
  sidecarVersion?: string;
  // sidecar版本类型
  type?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      scope: 'scope',
      scopeIdentity: 'scope_identity',
      sidecarName: 'sidecar_name',
      sidecarVersion: 'sidecar_version',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      scope: 'string',
      scopeIdentity: 'string',
      sidecarName: 'string',
      sidecarVersion: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSidecarVersionResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UpdateSidecarInstanceRequest extends $tea.Model {
  authToken?: string;
  // 版本实例描述	
  // 
  description?: string;
  // 版本实例名称
  instanceName?: string;
  // 环境模板参数
  params?: string;
  // 自定义规则内容
  rule?: string;
  // sidecar生效范围：workspace、workspace_group、region	
  // 
  scope?: string;
  // scope对应的唯一标识，例如workspace对应workspace id	
  // 
  scopeIdentity?: string;
  // sidecar版本id	
  // 
  sidecarReleaseVersionId?: string;
  // sidecar环境参数配置
  paramsConfigs?: SidecarParamsConfig[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      description: 'description',
      instanceName: 'instance_name',
      params: 'params',
      rule: 'rule',
      scope: 'scope',
      scopeIdentity: 'scope_identity',
      sidecarReleaseVersionId: 'sidecar_release_version_id',
      paramsConfigs: 'params_configs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      description: 'string',
      instanceName: 'string',
      params: 'string',
      rule: 'string',
      scope: 'string',
      scopeIdentity: 'string',
      sidecarReleaseVersionId: 'string',
      paramsConfigs: { 'type': 'array', 'itemType': SidecarParamsConfig },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSidecarInstanceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class DeleteSidecarInstanceRequest extends $tea.Model {
  authToken?: string;
  // 版本实例名称	
  // 
  instanceName?: string;
  // sidecar生效范围：workspace、workspace_group、region	
  // 
  scope?: string;
  // scope对应的唯一标识，例如workspace对应workspace id	
  // 
  scopeIdentity?: string;
  // sidecar版本id	
  // 
  sidecarReleaseVersionId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      instanceName: 'instance_name',
      scope: 'scope',
      scopeIdentity: 'scope_identity',
      sidecarReleaseVersionId: 'sidecar_release_version_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      instanceName: 'string',
      scope: 'string',
      scopeIdentity: 'string',
      sidecarReleaseVersionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSidecarInstanceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UpdateSidecarRuleRequest extends $tea.Model {
  authToken?: string;
  // 规则描述	
  // 
  description?: string;
  // 规则优先级
  level?: number;
  // sidecar生效范围：workspace、workspace_group、region	
  // 
  scope?: string;
  // scope对应的唯一标识，例如workspace对应workspace id	
  // 
  scopeIdentity?: string;
  // sidecar版本实例id
  sidecarVersionInstanceId?: string;
  // 规则状态
  status?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      description: 'description',
      level: 'level',
      scope: 'scope',
      scopeIdentity: 'scope_identity',
      sidecarVersionInstanceId: 'sidecar_version_instance_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      description: 'string',
      level: 'number',
      scope: 'string',
      scopeIdentity: 'string',
      sidecarVersionInstanceId: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSidecarRuleResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class DeleteSidecarRuleRequest extends $tea.Model {
  authToken?: string;
  // sidecar生效范围：workspace、workspace_group、region	
  // 
  scope?: string;
  // scope对应的唯一标识，例如workspace对应workspace id	
  // 
  scopeIdentity?: string;
  // sidecar版本实例id
  sidecarVersionInstanceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      scope: 'scope',
      scopeIdentity: 'scope_identity',
      sidecarVersionInstanceId: 'sidecar_version_instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      scope: 'string',
      scopeIdentity: 'string',
      sidecarVersionInstanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSidecarRuleResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UpdateSidecarVersionstatusRequest extends $tea.Model {
  authToken?: string;
  // sidecar生效范围：workspace、workspace_group、region	
  // 
  scope?: string;
  // scope对应的唯一标识，例如workspace对应workspace id	
  // 
  scopeIdentity?: string;
  // sidecar名称
  sidecarName?: string;
  // sidecar版本号
  sidecarVersion?: string;
  // 版本状态
  status?: number;
  // 发布、下线、废弃原因
  statusReason?: string;
  // sidecar版本类型
  type?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      scope: 'scope',
      scopeIdentity: 'scope_identity',
      sidecarName: 'sidecar_name',
      sidecarVersion: 'sidecar_version',
      status: 'status',
      statusReason: 'status_reason',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      scope: 'string',
      scopeIdentity: 'string',
      sidecarName: 'string',
      sidecarVersion: 'string',
      status: 'number',
      statusReason: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSidecarVersionstatusResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UpdateSidecarInstancestatusRequest extends $tea.Model {
  authToken?: string;
  // 版本实例名称
  instanceName?: string;
  // sidecar生效范围：workspace、workspace_group、region	
  // 
  scope?: string;
  // scope对应的唯一标识，例如workspace对应workspace id	
  // 
  scopeIdentity?: string;
  // sidecar版本id
  sidecarReleaseVersionId?: string;
  // 版本实例状态
  status?: number;
  // 发布、下线、废弃原因
  statusReason?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      instanceName: 'instance_name',
      scope: 'scope',
      scopeIdentity: 'scope_identity',
      sidecarReleaseVersionId: 'sidecar_release_version_id',
      status: 'status',
      statusReason: 'status_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      instanceName: 'string',
      scope: 'string',
      scopeIdentity: 'string',
      sidecarReleaseVersionId: 'string',
      status: 'number',
      statusReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSidecarInstancestatusResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UpdateSidecarRulestatusRequest extends $tea.Model {
  authToken?: string;
  // sidecar生效范围：workspace、workspace_group、region	
  // 
  scope?: string;
  // scope对应的唯一标识，例如workspace对应workspace id	
  // 
  scopeIdentity?: string;
  // sidecar版本实例id
  sidecarVersionInstanceId?: string;
  // 规则状态
  status?: number;
  // 发布、下线、废弃原因
  statusReason?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      scope: 'scope',
      scopeIdentity: 'scope_identity',
      sidecarVersionInstanceId: 'sidecar_version_instance_id',
      status: 'status',
      statusReason: 'status_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      scope: 'string',
      scopeIdentity: 'string',
      sidecarVersionInstanceId: 'string',
      status: 'number',
      statusReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSidecarRulestatusResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateAppbaselineSidecarRequest extends $tea.Model {
  authToken?: string;
  // 应用名
  appName?: string;
  // sidecar类型
  category?: string;
  // 应用基线适用条件，网商仅能指定workspaceGroups属性，并且只能指定一个workspaceGroup
  conditions?: SidecarCondition[];
  // 是否开启sidecar
  enable?: boolean;
  // sidecar版本号
  sidecarVersion?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appName: 'app_name',
      category: 'category',
      conditions: 'conditions',
      enable: 'enable',
      sidecarVersion: 'sidecar_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appName: 'string',
      category: 'string',
      conditions: { 'type': 'array', 'itemType': SidecarCondition },
      enable: 'boolean',
      sidecarVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAppbaselineSidecarResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 应用基线ID
  appbaselineId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appbaselineId: 'appbaseline_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appbaselineId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAppbaselineSidecarRequest extends $tea.Model {
  authToken?: string;
  // 应用名
  appName?: string;
  // sidecar类型
  category?: string;
  // 过滤条件，网商仅能指定workspaceGroups属性
  condition?: SidecarCondition;
  // sidecar版本号
  sidecarVersion?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appName: 'app_name',
      category: 'category',
      condition: 'condition',
      sidecarVersion: 'sidecar_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appName: 'string',
      category: 'string',
      condition: SidecarCondition,
      sidecarVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAppbaselineSidecarResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 应用基线列表
  appbaselines?: AppBaselineSidecarConfig[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appbaselines: 'appbaselines',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appbaselines: { 'type': 'array', 'itemType': AppBaselineSidecarConfig },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAppbaselineSidecarRequest extends $tea.Model {
  authToken?: string;
  // 应用基线ID
  appbaselineId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appbaselineId: 'appbaseline_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appbaselineId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAppbaselineSidecarResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UpdateAppbaselineSidecarRequest extends $tea.Model {
  authToken?: string;
  // 应用sidecar基线id
  appbaselineId?: string;
  // 是否开启sidecar
  enable?: boolean;
  // sidecar版本号
  sidecarVersion?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appbaselineId: 'appbaseline_id',
      enable: 'enable',
      sidecarVersion: 'sidecar_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appbaselineId: 'string',
      enable: 'boolean',
      sidecarVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAppbaselineSidecarResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class SaveAppbaselineSidecarRequest extends $tea.Model {
  authToken?: string;
  // 应用名
  appName?: string;
  // sidecar类型
  category?: string;
  // 应用基线适用条件，网商仅能指定workspaceGroups属性，并且只能指定一个workspaceGroup
  conditions?: SidecarCondition[];
  // 是否开启sidecar
  enable?: boolean;
  // sidecar版本号
  sidecarVersion?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appName: 'app_name',
      category: 'category',
      conditions: 'conditions',
      enable: 'enable',
      sidecarVersion: 'sidecar_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appName: 'string',
      category: 'string',
      conditions: { 'type': 'array', 'itemType': SidecarCondition },
      enable: 'boolean',
      sidecarVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveAppbaselineSidecarResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 应用基线ID
  appbaselineId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appbaselineId: 'appbaseline_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appbaselineId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetWorkspaceRequest extends $tea.Model {
  authToken?: string;
  // 所属工作空间名称
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetWorkspaceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 创建时间
  createTime?: string;
  // workspace 名称
  id?: string;
  // workspace 显示名称
  name?: string;
  // 网络类型
  networkType?: string;
  // workspace所在regionId
  region?: string;
  // 所属租户名称
  tenant?: string;
  // 最近更新时间
  updateTime?: string;
  // workspace所在zoneId列表
  zones?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      createTime: 'create_time',
      id: 'id',
      name: 'name',
      networkType: 'network_type',
      region: 'region',
      tenant: 'tenant',
      updateTime: 'update_time',
      zones: 'zones',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      createTime: 'string',
      id: 'string',
      name: 'string',
      networkType: 'string',
      region: 'string',
      tenant: 'string',
      updateTime: 'string',
      zones: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWorkspaceRequest extends $tea.Model {
  authToken?: string;
  // 工作空间状态。输入示例：status.1=CREATED
  status?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      status: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWorkspaceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 此应用下所有计算容器分组运维状态详情
  groups?: OpsGroup[];
  // 查询结果，workspace列表
  workspaces?: Workspace[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      groups: 'groups',
      workspaces: 'workspaces',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      groups: { 'type': 'array', 'itemType': OpsGroup },
      workspaces: { 'type': 'array', 'itemType': Workspace },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateWorkspaceRequest extends $tea.Model {
  authToken?: string;
  // workspace 显示名称
  displayName?: string;
  // workspace名称
  name?: string;
  // 网络类型
  networkType?: string;
  // 地域id
  regionId?: string;
  // 机房ID
  zoneIds?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      displayName: 'display_name',
      name: 'name',
      networkType: 'network_type',
      regionId: 'region_id',
      zoneIds: 'zone_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      displayName: 'string',
      name: 'string',
      networkType: 'string',
      regionId: 'string',
      zoneIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateWorkspaceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // workspace
  workspace?: Workspace;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      workspace: Workspace,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListWorkspaceRequest extends $tea.Model {
  authToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListWorkspaceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // workspace列表。
  workspaces?: Workspace[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      workspaces: 'workspaces',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      workspaces: { 'type': 'array', 'itemType': Workspace },
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
    this._readTimeout = config.readTimeout;
    this._connectTimeout = config.connectTimeout;
    this._httpProxy = config.httpProxy;
    this._httpsProxy = config.httpsProxy;
    this._noProxy = config.noProxy;
    this._socks5Proxy = config.socks5Proxy;
    this._socks5NetWork = config.socks5NetWork;
    this._maxIdleConns = config.maxIdleConns;
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
          sdk_version: "3.2.1",
        };
        if (!Util.empty(this._securityToken)) {
          request_.query["security_token"] = this._securityToken;
        }

        request_.headers = {
          host: Util.defaultString(this._endpoint, "undefined"),
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
   * Description: 创建一个应用。
   * Summary: 创建应用
   */
  async createApplication(request: CreateApplicationRequest): Promise<CreateApplicationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createApplicationEx(request, headers, runtime);
  }

  /**
   * Description: 创建一个应用。
   * Summary: 创建应用
   */
  async createApplicationEx(request: CreateApplicationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateApplicationResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateApplicationResponse>(await this.doRequest("1.0", "antcloud.deps.application.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateApplicationResponse({}));
  }

  /**
   * Description: 创建一个应用服务实例。
   * Summary: 创建应用服务实例
   */
  async createApplicationService(request: CreateApplicationServiceRequest): Promise<CreateApplicationServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createApplicationServiceEx(request, headers, runtime);
  }

  /**
   * Description: 创建一个应用服务实例。
   * Summary: 创建应用服务实例
   */
  async createApplicationServiceEx(request: CreateApplicationServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateApplicationServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateApplicationServiceResponse>(await this.doRequest("1.0", "antcloud.deps.application.service.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateApplicationServiceResponse({}));
  }

  /**
   * Description: 查询是否启用应用服务实例。
   * Summary: 查询是否启用应用服务实例
   */
  async enabledApplicationService(request: EnabledApplicationServiceRequest): Promise<EnabledApplicationServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.enabledApplicationServiceEx(request, headers, runtime);
  }

  /**
   * Description: 查询是否启用应用服务实例。
   * Summary: 查询是否启用应用服务实例
   */
  async enabledApplicationServiceEx(request: EnabledApplicationServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<EnabledApplicationServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<EnabledApplicationServiceResponse>(await this.doRequest("1.0", "antcloud.deps.application.service.enabled", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new EnabledApplicationServiceResponse({}));
  }

  /**
   * Description: 获取一个应用详情。
   * Summary: 获取应用
   */
  async getApplication(request: GetApplicationRequest): Promise<GetApplicationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getApplicationEx(request, headers, runtime);
  }

  /**
   * Description: 获取一个应用详情。
   * Summary: 获取应用
   */
  async getApplicationEx(request: GetApplicationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetApplicationResponse> {
    Util.validateModel(request);
    return $tea.cast<GetApplicationResponse>(await this.doRequest("1.0", "antcloud.deps.application.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetApplicationResponse({}));
  }

  /**
   * Description: 获取一个应用服务详情。
   * Summary: 获取应用服务
   */
  async getApplicationService(request: GetApplicationServiceRequest): Promise<GetApplicationServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getApplicationServiceEx(request, headers, runtime);
  }

  /**
   * Description: 获取一个应用服务详情。
   * Summary: 获取应用服务
   */
  async getApplicationServiceEx(request: GetApplicationServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetApplicationServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetApplicationServiceResponse>(await this.doRequest("1.0", "antcloud.deps.application.service.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetApplicationServiceResponse({}));
  }

  /**
   * Description: 查询应用服务实例列表。
   * Summary: 查询应用服务实例列表
   */
  async queryApplicationService(request: QueryApplicationServiceRequest): Promise<QueryApplicationServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryApplicationServiceEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用服务实例列表。
   * Summary: 查询应用服务实例列表
   */
  async queryApplicationServiceEx(request: QueryApplicationServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryApplicationServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryApplicationServiceResponse>(await this.doRequest("1.0", "antcloud.deps.application.service.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryApplicationServiceResponse({}));
  }

  /**
   * Description: 删除一个应用服务实例
   * Summary: 删除一个应用服务实例
   */
  async deleteApplicationService(request: DeleteApplicationServiceRequest): Promise<DeleteApplicationServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteApplicationServiceEx(request, headers, runtime);
  }

  /**
   * Description: 删除一个应用服务实例
   * Summary: 删除一个应用服务实例
   */
  async deleteApplicationServiceEx(request: DeleteApplicationServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteApplicationServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteApplicationServiceResponse>(await this.doRequest("1.0", "antcloud.deps.application.service.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteApplicationServiceResponse({}));
  }

  /**
   * Description: 获取应用发布包详情包括下载地址、校验码等。
   * Summary: 获取应用发布包详情包括下载地址、校验码等。
   */
  async getApplicationPackage(request: GetApplicationPackageRequest): Promise<GetApplicationPackageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getApplicationPackageEx(request, headers, runtime);
  }

  /**
   * Description: 获取应用发布包详情包括下载地址、校验码等。
   * Summary: 获取应用发布包详情包括下载地址、校验码等。
   */
  async getApplicationPackageEx(request: GetApplicationPackageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetApplicationPackageResponse> {
    Util.validateModel(request);
    return $tea.cast<GetApplicationPackageResponse>(await this.doRequest("1.0", "antcloud.deps.application.package.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetApplicationPackageResponse({}));
  }

  /**
   * Description: 查询应用发布包版本详情
   * Summary: 查询应用发布包版本详情
   */
  async queryAppVersion(request: QueryAppVersionRequest): Promise<QueryAppVersionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAppVersionEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用发布包版本详情
   * Summary: 查询应用发布包版本详情
   */
  async queryAppVersionEx(request: QueryAppVersionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAppVersionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAppVersionResponse>(await this.doRequest("1.0", "antcloud.deps.app.version.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAppVersionResponse({}));
  }

  /**
   * Description: 删除一个应用。
   * Summary: 删除应用
   */
  async deleteApplication(request: DeleteApplicationRequest): Promise<DeleteApplicationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteApplicationEx(request, headers, runtime);
  }

  /**
   * Description: 删除一个应用。
   * Summary: 删除应用
   */
  async deleteApplicationEx(request: DeleteApplicationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteApplicationResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteApplicationResponse>(await this.doRequest("1.0", "antcloud.deps.application.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteApplicationResponse({}));
  }

  /**
   * Description: 获取租户应用列表。
   * Summary: 列出应用
   */
  async listApplication(request: ListApplicationRequest): Promise<ListApplicationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listApplicationEx(request, headers, runtime);
  }

  /**
   * Description: 获取租户应用列表。
   * Summary: 列出应用
   */
  async listApplicationEx(request: ListApplicationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListApplicationResponse> {
    Util.validateModel(request);
    return $tea.cast<ListApplicationResponse>(await this.doRequest("1.0", "antcloud.deps.application.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListApplicationResponse({}));
  }

  /**
   * Description: 获取租户应用分组列表。
   * Summary: 列出应用分组
   */
  async listAppgroup(request: ListAppgroupRequest): Promise<ListAppgroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAppgroupEx(request, headers, runtime);
  }

  /**
   * Description: 获取租户应用分组列表。
   * Summary: 列出应用分组
   */
  async listAppgroupEx(request: ListAppgroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAppgroupResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAppgroupResponse>(await this.doRequest("1.0", "antcloud.deps.appgroup.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAppgroupResponse({}));
  }

  /**
   * Description: 根据指定的查询条件查询属于某个应用计算资源列表。
   * Summary: 查询应用计算资源
   */
  async queryApplicationComputer(request: QueryApplicationComputerRequest): Promise<QueryApplicationComputerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryApplicationComputerEx(request, headers, runtime);
  }

  /**
   * Description: 根据指定的查询条件查询属于某个应用计算资源列表。
   * Summary: 查询应用计算资源
   */
  async queryApplicationComputerEx(request: QueryApplicationComputerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryApplicationComputerResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryApplicationComputerResponse>(await this.doRequest("1.0", "antcloud.deps.application.computer.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryApplicationComputerResponse({}));
  }

  /**
   * Description: 获取一个应用的代码库信息。
   * Summary: 获取一个应用的代码库信息
   */
  async getApplicationRepository(request: GetApplicationRepositoryRequest): Promise<GetApplicationRepositoryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getApplicationRepositoryEx(request, headers, runtime);
  }

  /**
   * Description: 获取一个应用的代码库信息。
   * Summary: 获取一个应用的代码库信息
   */
  async getApplicationRepositoryEx(request: GetApplicationRepositoryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetApplicationRepositoryResponse> {
    Util.validateModel(request);
    return $tea.cast<GetApplicationRepositoryResponse>(await this.doRequest("1.0", "antcloud.deps.application.repository.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetApplicationRepositoryResponse({}));
  }

  /**
   * Description: 根据名称查询应用分组信息
   * Summary: 应用分组查询
   */
  async queryAppgroup(request: QueryAppgroupRequest): Promise<QueryAppgroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAppgroupEx(request, headers, runtime);
  }

  /**
   * Description: 根据名称查询应用分组信息
   * Summary: 应用分组查询
   */
  async queryAppgroupEx(request: QueryAppgroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAppgroupResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAppgroupResponse>(await this.doRequest("1.0", "antcloud.deps.appgroup.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAppgroupResponse({}));
  }

  /**
   * Description: 根据条件查询应用等级
   * Summary: 查询应用等级
   */
  async queryApplevel(request: QueryApplevelRequest): Promise<QueryApplevelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryApplevelEx(request, headers, runtime);
  }

  /**
   * Description: 根据条件查询应用等级
   * Summary: 查询应用等级
   */
  async queryApplevelEx(request: QueryApplevelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryApplevelResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryApplevelResponse>(await this.doRequest("1.0", "antcloud.deps.applevel.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryApplevelResponse({}));
  }

  /**
   * Description: 根据查询条件查询应用列表。
   * Summary: 查询应用
   */
  async queryApplication(request: QueryApplicationRequest): Promise<QueryApplicationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryApplicationEx(request, headers, runtime);
  }

  /**
   * Description: 根据查询条件查询应用列表。
   * Summary: 查询应用
   */
  async queryApplicationEx(request: QueryApplicationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryApplicationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryApplicationResponse>(await this.doRequest("1.0", "antcloud.deps.application.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryApplicationResponse({}));
  }

  /**
   * Description: 为一个应用创建一个新版本。调用者需要拥有一个文件交换源，APPMS将从指定的文件交换源中下载应用部署包文件，文件路径与名称由调用者指定。
  当应用部署包成功下载完成后，APPMS将为应用创建一个新版本，版本号由调用者指定，并关联此部署包。
   * Summary: 创建应用版本
   */
  async createAppVersion(request: CreateAppVersionRequest): Promise<CreateAppVersionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAppVersionEx(request, headers, runtime);
  }

  /**
   * Description: 为一个应用创建一个新版本。调用者需要拥有一个文件交换源，APPMS将从指定的文件交换源中下载应用部署包文件，文件路径与名称由调用者指定。
  当应用部署包成功下载完成后，APPMS将为应用创建一个新版本，版本号由调用者指定，并关联此部署包。
   * Summary: 创建应用版本
   */
  async createAppVersionEx(request: CreateAppVersionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAppVersionResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAppVersionResponse>(await this.doRequest("1.0", "antcloud.deps.app.version.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAppVersionResponse({}));
  }

  /**
   * Description: 查询应用增量统计信息
   * Summary: 查询应用增量统计信息
   */
  async queryAppDelta(request: QueryAppDeltaRequest): Promise<QueryAppDeltaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAppDeltaEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用增量统计信息
   * Summary: 查询应用增量统计信息
   */
  async queryAppDeltaEx(request: QueryAppDeltaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAppDeltaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAppDeltaResponse>(await this.doRequest("1.0", "antcloud.deps.app.delta.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAppDeltaResponse({}));
  }

  /**
   * Description: 根据指定的查询条件查询负载均衡资源列表
   * Summary: loadbalancer查询
   */
  async queryApplicationLoadbalancer(request: QueryApplicationLoadbalancerRequest): Promise<QueryApplicationLoadbalancerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryApplicationLoadbalancerEx(request, headers, runtime);
  }

  /**
   * Description: 根据指定的查询条件查询负载均衡资源列表
   * Summary: loadbalancer查询
   */
  async queryApplicationLoadbalancerEx(request: QueryApplicationLoadbalancerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryApplicationLoadbalancerResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryApplicationLoadbalancerResponse>(await this.doRequest("1.0", "antcloud.deps.application.loadbalancer.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryApplicationLoadbalancerResponse({}));
  }

  /**
   * Description: 根据指定的查询条件查询数据库资源列表
   * Summary: database查询
   */
  async queryApplicationDatabase(request: QueryApplicationDatabaseRequest): Promise<QueryApplicationDatabaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryApplicationDatabaseEx(request, headers, runtime);
  }

  /**
   * Description: 根据指定的查询条件查询数据库资源列表
   * Summary: database查询
   */
  async queryApplicationDatabaseEx(request: QueryApplicationDatabaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryApplicationDatabaseResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryApplicationDatabaseResponse>(await this.doRequest("1.0", "antcloud.deps.application.database.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryApplicationDatabaseResponse({}));
  }

  /**
   * Description: 获取上传应用发布包临时签名地址，用于直接向阿里云OSS上传，目前只支持阿里云底座，不支持58底座。注意：该api只能生成上传应用发布包临时签名地址，不会实际上传文件。
   * Summary: 获取上传应用发布包临时签名地址
   */
  async uploadApplicationPackage(request: UploadApplicationPackageRequest): Promise<UploadApplicationPackageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadApplicationPackageEx(request, headers, runtime);
  }

  /**
   * Description: 获取上传应用发布包临时签名地址，用于直接向阿里云OSS上传，目前只支持阿里云底座，不支持58底座。注意：该api只能生成上传应用发布包临时签名地址，不会实际上传文件。
   * Summary: 获取上传应用发布包临时签名地址
   */
  async uploadApplicationPackageEx(request: UploadApplicationPackageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadApplicationPackageResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadApplicationPackageResponse>(await this.doRequest("1.0", "antcloud.deps.application.package.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadApplicationPackageResponse({}));
  }

  /**
   * Description: 上传发布包成功后，同步创建对应的发布包版本信息，该接口为同步接口。
  调用步骤如下：
  调用antcloud.deps.application.package.upload获得上传应用发布包临时签名地址
  通过阿里云OSS客户端通过应用发布包临时签名地址完成上传，并获得校验码
  调用antcloud.deps.application.version.syncreate同步接口创建应用新版本
   * Summary: 同步创建对应的发布包版本信息
   */
  async syncreateApplicationVersion(request: SyncreateApplicationVersionRequest): Promise<SyncreateApplicationVersionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncreateApplicationVersionEx(request, headers, runtime);
  }

  /**
   * Description: 上传发布包成功后，同步创建对应的发布包版本信息，该接口为同步接口。
  调用步骤如下：
  调用antcloud.deps.application.package.upload获得上传应用发布包临时签名地址
  通过阿里云OSS客户端通过应用发布包临时签名地址完成上传，并获得校验码
  调用antcloud.deps.application.version.syncreate同步接口创建应用新版本
   * Summary: 同步创建对应的发布包版本信息
   */
  async syncreateApplicationVersionEx(request: SyncreateApplicationVersionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncreateApplicationVersionResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncreateApplicationVersionResponse>(await this.doRequest("1.0", "antcloud.deps.application.version.syncreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncreateApplicationVersionResponse({}));
  }

  /**
   * Description: 获取connection
   * Summary: 获取connection
   */
  async listCloudconnectorConnection(request: ListCloudconnectorConnectionRequest): Promise<ListCloudconnectorConnectionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listCloudconnectorConnectionEx(request, headers, runtime);
  }

  /**
   * Description: 获取connection
   * Summary: 获取connection
   */
  async listCloudconnectorConnectionEx(request: ListCloudconnectorConnectionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListCloudconnectorConnectionResponse> {
    Util.validateModel(request);
    return $tea.cast<ListCloudconnectorConnectionResponse>(await this.doRequest("1.0", "antcloud.deps.cloudconnector.connection.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListCloudconnectorConnectionResponse({}));
  }

  /**
   * Description: 查询技术栈关系
   * Summary: 查询技术栈关系
   */
  async queryAppservicebuildpackrelation(request: QueryAppservicebuildpackrelationRequest): Promise<QueryAppservicebuildpackrelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAppservicebuildpackrelationEx(request, headers, runtime);
  }

  /**
   * Description: 查询技术栈关系
   * Summary: 查询技术栈关系
   */
  async queryAppservicebuildpackrelationEx(request: QueryAppservicebuildpackrelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAppservicebuildpackrelationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAppservicebuildpackrelationResponse>(await this.doRequest("1.0", "antcloud.deps.appservicebuildpackrelation.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAppservicebuildpackrelationResponse({}));
  }

  /**
   * Description: 更新应用关系
   * Summary: 更新应用关系
   */
  async updateAppservicebuildpackrelation(request: UpdateAppservicebuildpackrelationRequest): Promise<UpdateAppservicebuildpackrelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAppservicebuildpackrelationEx(request, headers, runtime);
  }

  /**
   * Description: 更新应用关系
   * Summary: 更新应用关系
   */
  async updateAppservicebuildpackrelationEx(request: UpdateAppservicebuildpackrelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAppservicebuildpackrelationResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAppservicebuildpackrelationResponse>(await this.doRequest("1.0", "antcloud.deps.appservicebuildpackrelation.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAppservicebuildpackrelationResponse({}));
  }

  /**
   * Description: 查询环境变量
   * Summary: 查询环境变量
   */
  async queryAppserviceenvparam(request: QueryAppserviceenvparamRequest): Promise<QueryAppserviceenvparamResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAppserviceenvparamEx(request, headers, runtime);
  }

  /**
   * Description: 查询环境变量
   * Summary: 查询环境变量
   */
  async queryAppserviceenvparamEx(request: QueryAppserviceenvparamRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAppserviceenvparamResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAppserviceenvparamResponse>(await this.doRequest("1.0", "antcloud.deps.appserviceenvparam.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAppserviceenvparamResponse({}));
  }

  /**
   * Description: 查询环境变量
   * Summary: 查询环境变量
   */
  async queryAppserviceenvparamGroupbyappservices(request: QueryAppserviceenvparamGroupbyappservicesRequest): Promise<QueryAppserviceenvparamGroupbyappservicesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAppserviceenvparamGroupbyappservicesEx(request, headers, runtime);
  }

  /**
   * Description: 查询环境变量
   * Summary: 查询环境变量
   */
  async queryAppserviceenvparamGroupbyappservicesEx(request: QueryAppserviceenvparamGroupbyappservicesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAppserviceenvparamGroupbyappservicesResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAppserviceenvparamGroupbyappservicesResponse>(await this.doRequest("1.0", "antcloud.deps.appserviceenvparam.groupbyappservices.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAppserviceenvparamGroupbyappservicesResponse({}));
  }

  /**
   * Description: 和修改点比较查询
   * Summary: 和修改点比较查询
   */
  async queryAppserviceenvparamQuerywithdiff(request: QueryAppserviceenvparamQuerywithdiffRequest): Promise<QueryAppserviceenvparamQuerywithdiffResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAppserviceenvparamQuerywithdiffEx(request, headers, runtime);
  }

  /**
   * Description: 和修改点比较查询
   * Summary: 和修改点比较查询
   */
  async queryAppserviceenvparamQuerywithdiffEx(request: QueryAppserviceenvparamQuerywithdiffRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAppserviceenvparamQuerywithdiffResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAppserviceenvparamQuerywithdiffResponse>(await this.doRequest("1.0", "antcloud.deps.appserviceenvparam.querywithdiff.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAppserviceenvparamQuerywithdiffResponse({}));
  }

  /**
   * Description: 更新参数
   * Summary: 更新参数
   */
  async updateAppserviceenvparamUpdateparams(request: UpdateAppserviceenvparamUpdateparamsRequest): Promise<UpdateAppserviceenvparamUpdateparamsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAppserviceenvparamUpdateparamsEx(request, headers, runtime);
  }

  /**
   * Description: 更新参数
   * Summary: 更新参数
   */
  async updateAppserviceenvparamUpdateparamsEx(request: UpdateAppserviceenvparamUpdateparamsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAppserviceenvparamUpdateparamsResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAppserviceenvparamUpdateparamsResponse>(await this.doRequest("1.0", "antcloud.deps.appserviceenvparam.updateparams.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAppserviceenvparamUpdateparamsResponse({}));
  }

  /**
   * Description: 根据应用查询技术栈关系
   * Summary: 查询技术栈关系
   */
  async queryApptechstackrelation(request: QueryApptechstackrelationRequest): Promise<QueryApptechstackrelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryApptechstackrelationEx(request, headers, runtime);
  }

  /**
   * Description: 根据应用查询技术栈关系
   * Summary: 查询技术栈关系
   */
  async queryApptechstackrelationEx(request: QueryApptechstackrelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryApptechstackrelationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryApptechstackrelationResponse>(await this.doRequest("1.0", "antcloud.deps.apptechstackrelation.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryApptechstackrelationResponse({}));
  }

  /**
   * Description: 更新应用技术栈关系
   * Summary: 更新技术栈关系
   */
  async updateApptechstackrelation(request: UpdateApptechstackrelationRequest): Promise<UpdateApptechstackrelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateApptechstackrelationEx(request, headers, runtime);
  }

  /**
   * Description: 更新应用技术栈关系
   * Summary: 更新技术栈关系
   */
  async updateApptechstackrelationEx(request: UpdateApptechstackrelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateApptechstackrelationResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateApptechstackrelationResponse>(await this.doRequest("1.0", "antcloud.deps.apptechstackrelation.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateApptechstackrelationResponse({}));
  }

  /**
   * Description: 应用管理-创建应用
   * Summary: 应用管理-创建应用
   */
  async createApp(request: CreateAppRequest): Promise<CreateAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAppEx(request, headers, runtime);
  }

  /**
   * Description: 应用管理-创建应用
   * Summary: 应用管理-创建应用
   */
  async createAppEx(request: CreateAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAppResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAppResponse>(await this.doRequest("1.0", "antcloud.deps.app.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAppResponse({}));
  }

  /**
   * Description: 应用管理-应用分组创建
   * Summary: 应用管理-应用分组创建
   */
  async createAppGroup(request: CreateAppGroupRequest): Promise<CreateAppGroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAppGroupEx(request, headers, runtime);
  }

  /**
   * Description: 应用管理-应用分组创建
   * Summary: 应用管理-应用分组创建
   */
  async createAppGroupEx(request: CreateAppGroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAppGroupResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAppGroupResponse>(await this.doRequest("1.0", "antcloud.deps.app.group.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAppGroupResponse({}));
  }

  /**
   * Description: 应用管理-获取应用基本信息
   * Summary: 应用管理-获取应用基本信息
   */
  async getApp(request: GetAppRequest): Promise<GetAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAppEx(request, headers, runtime);
  }

  /**
   * Description: 应用管理-获取应用基本信息
   * Summary: 应用管理-获取应用基本信息
   */
  async getAppEx(request: GetAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAppResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAppResponse>(await this.doRequest("1.0", "antcloud.deps.app.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAppResponse({}));
  }

  /**
   * Description: 应用管理-查看应用所有应用服务数量
   * Summary: 应用管理-查看应用所有应用服务数量
   */
  async countAppService(request: CountAppServiceRequest): Promise<CountAppServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.countAppServiceEx(request, headers, runtime);
  }

  /**
   * Description: 应用管理-查看应用所有应用服务数量
   * Summary: 应用管理-查看应用所有应用服务数量
   */
  async countAppServiceEx(request: CountAppServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CountAppServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<CountAppServiceResponse>(await this.doRequest("1.0", "antcloud.deps.app.service.count", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CountAppServiceResponse({}));
  }

  /**
   * Description: 应用管理-获取当前应用所有环境中的部署图(经典应用服务)
   * Summary: (废弃)获取应用所有环境的部署图(经典)
   */
  async allAppDeployview(request: AllAppDeployviewRequest): Promise<AllAppDeployviewResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allAppDeployviewEx(request, headers, runtime);
  }

  /**
   * Description: 应用管理-获取当前应用所有环境中的部署图(经典应用服务)
   * Summary: (废弃)获取应用所有环境的部署图(经典)
   */
  async allAppDeployviewEx(request: AllAppDeployviewRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllAppDeployviewResponse> {
    Util.validateModel(request);
    return $tea.cast<AllAppDeployviewResponse>(await this.doRequest("1.0", "antcloud.deps.app.deployview.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllAppDeployviewResponse({}));
  }

  /**
   * Description: 应用管理-批量查询应用
   * Summary: 应用管理-批量查询应用
   */
  async queryApp(request: QueryAppRequest): Promise<QueryAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAppEx(request, headers, runtime);
  }

  /**
   * Description: 应用管理-批量查询应用
   * Summary: 应用管理-批量查询应用
   */
  async queryAppEx(request: QueryAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAppResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAppResponse>(await this.doRequest("1.0", "antcloud.deps.app.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAppResponse({}));
  }

  /**
   * Description: 应用管理-获取应用分组
   * Summary: 应用管理-获取单个应用分组
   */
  async getAppGroup(request: GetAppGroupRequest): Promise<GetAppGroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAppGroupEx(request, headers, runtime);
  }

  /**
   * Description: 应用管理-获取应用分组
   * Summary: 应用管理-获取单个应用分组
   */
  async getAppGroupEx(request: GetAppGroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAppGroupResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAppGroupResponse>(await this.doRequest("1.0", "antcloud.deps.app.group.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAppGroupResponse({}));
  }

  /**
   * Description: 应用管理-批量查询应用分组
   * Summary: 应用管理-批量查询应用分组
   */
  async queryAppGroup(request: QueryAppGroupRequest): Promise<QueryAppGroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAppGroupEx(request, headers, runtime);
  }

  /**
   * Description: 应用管理-批量查询应用分组
   * Summary: 应用管理-批量查询应用分组
   */
  async queryAppGroupEx(request: QueryAppGroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAppGroupResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAppGroupResponse>(await this.doRequest("1.0", "antcloud.deps.app.group.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAppGroupResponse({}));
  }

  /**
   * Description: 应用管理-查询当前应用的所有应用服务
   * Summary: 应用管理-查询当前应用的所有应用服务
   */
  async queryAppService(request: QueryAppServiceRequest): Promise<QueryAppServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAppServiceEx(request, headers, runtime);
  }

  /**
   * Description: 应用管理-查询当前应用的所有应用服务
   * Summary: 应用管理-查询当前应用的所有应用服务
   */
  async queryAppServiceEx(request: QueryAppServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAppServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAppServiceResponse>(await this.doRequest("1.0", "antcloud.deps.app.service.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAppServiceResponse({}));
  }

  /**
   * Description: 应用管理-用户收藏应用
   * Summary: 应用管理-用户收藏应用
   */
  async createAppFavourite(request: CreateAppFavouriteRequest): Promise<CreateAppFavouriteResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAppFavouriteEx(request, headers, runtime);
  }

  /**
   * Description: 应用管理-用户收藏应用
   * Summary: 应用管理-用户收藏应用
   */
  async createAppFavouriteEx(request: CreateAppFavouriteRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAppFavouriteResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAppFavouriteResponse>(await this.doRequest("1.0", "antcloud.deps.app.favourite.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAppFavouriteResponse({}));
  }

  /**
   * Description: 应用管理-用户取消收藏某应用
   * Summary: 应用管理-用户取消收藏某应用
   */
  async deleteAppFavourite(request: DeleteAppFavouriteRequest): Promise<DeleteAppFavouriteResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteAppFavouriteEx(request, headers, runtime);
  }

  /**
   * Description: 应用管理-用户取消收藏某应用
   * Summary: 应用管理-用户取消收藏某应用
   */
  async deleteAppFavouriteEx(request: DeleteAppFavouriteRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteAppFavouriteResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteAppFavouriteResponse>(await this.doRequest("1.0", "antcloud.deps.app.favourite.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteAppFavouriteResponse({}));
  }

  /**
   * Description: 应用管理-更新应用信息
   * Summary: 应用管理-更新应用信息
   */
  async updateApp(request: UpdateAppRequest): Promise<UpdateAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAppEx(request, headers, runtime);
  }

  /**
   * Description: 应用管理-更新应用信息
   * Summary: 应用管理-更新应用信息
   */
  async updateAppEx(request: UpdateAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAppResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAppResponse>(await this.doRequest("1.0", "antcloud.deps.app.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAppResponse({}));
  }

  /**
   * Description: 应用管理-更新应用分组信息
   * Summary: 应用管理-更新应用分组信息
   */
  async updateAppGroup(request: UpdateAppGroupRequest): Promise<UpdateAppGroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAppGroupEx(request, headers, runtime);
  }

  /**
   * Description: 应用管理-更新应用分组信息
   * Summary: 应用管理-更新应用分组信息
   */
  async updateAppGroupEx(request: UpdateAppGroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAppGroupResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAppGroupResponse>(await this.doRequest("1.0", "antcloud.deps.app.group.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAppGroupResponse({}));
  }

  /**
   * Description: 应用管理-列出当前用户收藏的应用
   * Summary: 应用管理-列出当前用户收藏的应用
   */
  async listAppFavourite(request: ListAppFavouriteRequest): Promise<ListAppFavouriteResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAppFavouriteEx(request, headers, runtime);
  }

  /**
   * Description: 应用管理-列出当前用户收藏的应用
   * Summary: 应用管理-列出当前用户收藏的应用
   */
  async listAppFavouriteEx(request: ListAppFavouriteRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAppFavouriteResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAppFavouriteResponse>(await this.doRequest("1.0", "antcloud.deps.app.favourite.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAppFavouriteResponse({}));
  }

  /**
   * Description: 应用管理-删除应用
   * Summary: 应用管理-删除应用
   */
  async deleteApp(request: DeleteAppRequest): Promise<DeleteAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteAppEx(request, headers, runtime);
  }

  /**
   * Description: 应用管理-删除应用
   * Summary: 应用管理-删除应用
   */
  async deleteAppEx(request: DeleteAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteAppResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteAppResponse>(await this.doRequest("1.0", "antcloud.deps.app.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteAppResponse({}));
  }

  /**
   * Description: 应用管理-删除应用分组
   * Summary: 应用管理-删除应用分组
   */
  async deleteAppGroup(request: DeleteAppGroupRequest): Promise<DeleteAppGroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteAppGroupEx(request, headers, runtime);
  }

  /**
   * Description: 应用管理-删除应用分组
   * Summary: 应用管理-删除应用分组
   */
  async deleteAppGroupEx(request: DeleteAppGroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteAppGroupResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteAppGroupResponse>(await this.doRequest("1.0", "antcloud.deps.app.group.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteAppGroupResponse({}));
  }

  /**
   * Description: 应用管理-应用维度查询经典应用服务发布单
   * Summary: 应用管理-应用维度查询经典应用服务发布单
   */
  async queryAppPlan(request: QueryAppPlanRequest): Promise<QueryAppPlanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAppPlanEx(request, headers, runtime);
  }

  /**
   * Description: 应用管理-应用维度查询经典应用服务发布单
   * Summary: 应用管理-应用维度查询经典应用服务发布单
   */
  async queryAppPlanEx(request: QueryAppPlanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAppPlanResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAppPlanResponse>(await this.doRequest("1.0", "antcloud.deps.app.plan.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAppPlanResponse({}));
  }

  /**
   * Description: 应用管理-判断应用分组是否存在。该接口判断应用分组是否存在的范围是租户级别唯一，也就是说不同级别的应用分组名称也不能同名
   * Summary: 应用管理-判断应用分组是否存在
   */
  async existAppGroup(request: ExistAppGroupRequest): Promise<ExistAppGroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.existAppGroupEx(request, headers, runtime);
  }

  /**
   * Description: 应用管理-判断应用分组是否存在。该接口判断应用分组是否存在的范围是租户级别唯一，也就是说不同级别的应用分组名称也不能同名
   * Summary: 应用管理-判断应用分组是否存在
   */
  async existAppGroupEx(request: ExistAppGroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExistAppGroupResponse> {
    Util.validateModel(request);
    return $tea.cast<ExistAppGroupResponse>(await this.doRequest("1.0", "antcloud.deps.app.group.exist", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExistAppGroupResponse({}));
  }

  /**
   * Description: 应用管理-当前登录用户信息查询（已废弃，用户信息应该由onex接口返回）
   * Summary: 应用管理-当前登录用户信息查询（已废弃）
   */
  async queryUser(request: QueryUserRequest): Promise<QueryUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUserEx(request, headers, runtime);
  }

  /**
   * Description: 应用管理-当前登录用户信息查询（已废弃，用户信息应该由onex接口返回）
   * Summary: 应用管理-当前登录用户信息查询（已废弃）
   */
  async queryUserEx(request: QueryUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUserResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUserResponse>(await this.doRequest("1.0", "antcloud.deps.user.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUserResponse({}));
  }

  /**
   * Description: 应用管理-判断应用是否存在
   * Summary: 应用管理-判断应用是否存在
   */
  async existApp(request: ExistAppRequest): Promise<ExistAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.existAppEx(request, headers, runtime);
  }

  /**
   * Description: 应用管理-判断应用是否存在
   * Summary: 应用管理-判断应用是否存在
   */
  async existAppEx(request: ExistAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExistAppResponse> {
    Util.validateModel(request);
    return $tea.cast<ExistAppResponse>(await this.doRequest("1.0", "antcloud.deps.app.exist", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExistAppResponse({}));
  }

  /**
   * Description: 根据应用服务实例查询对应的技术栈信息
   * Summary: 查询技术栈信息
   */
  async getApplicationBuildpack(request: GetApplicationBuildpackRequest): Promise<GetApplicationBuildpackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getApplicationBuildpackEx(request, headers, runtime);
  }

  /**
   * Description: 根据应用服务实例查询对应的技术栈信息
   * Summary: 查询技术栈信息
   */
  async getApplicationBuildpackEx(request: GetApplicationBuildpackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetApplicationBuildpackResponse> {
    Util.validateModel(request);
    return $tea.cast<GetApplicationBuildpackResponse>(await this.doRequest("1.0", "antcloud.deps.application.buildpack.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetApplicationBuildpackResponse({}));
  }

  /**
   * Description: 查询指定应用的技术栈框架信息
   * Summary: 查询指定应用的技术栈框架信息
   */
  async getApplicationTechstack(request: GetApplicationTechstackRequest): Promise<GetApplicationTechstackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getApplicationTechstackEx(request, headers, runtime);
  }

  /**
   * Description: 查询指定应用的技术栈框架信息
   * Summary: 查询指定应用的技术栈框架信息
   */
  async getApplicationTechstackEx(request: GetApplicationTechstackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetApplicationTechstackResponse> {
    Util.validateModel(request);
    return $tea.cast<GetApplicationTechstackResponse>(await this.doRequest("1.0", "antcloud.deps.application.techstack.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetApplicationTechstackResponse({}));
  }

  /**
   * Description: 获取技术栈信息
   * Summary: 获取技术栈信息
   */
  async getBuildpack(request: GetBuildpackRequest): Promise<GetBuildpackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getBuildpackEx(request, headers, runtime);
  }

  /**
   * Description: 获取技术栈信息
   * Summary: 获取技术栈信息
   */
  async getBuildpackEx(request: GetBuildpackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetBuildpackResponse> {
    Util.validateModel(request);
    return $tea.cast<GetBuildpackResponse>(await this.doRequest("1.0", "antcloud.deps.buildpack.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetBuildpackResponse({}));
  }

  /**
   * Description: 列出系统支持的所有技术栈框架
   * Summary: 列出系统支持的所有技术栈框架
   */
  async listTechstack(request: ListTechstackRequest): Promise<ListTechstackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listTechstackEx(request, headers, runtime);
  }

  /**
   * Description: 列出系统支持的所有技术栈框架
   * Summary: 列出系统支持的所有技术栈框架
   */
  async listTechstackEx(request: ListTechstackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListTechstackResponse> {
    Util.validateModel(request);
    return $tea.cast<ListTechstackResponse>(await this.doRequest("1.0", "antcloud.deps.techstack.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListTechstackResponse({}));
  }

  /**
   * Description: 搜索技术栈
   * Summary: 搜索技术栈
   */
  async queryBuildpack(request: QueryBuildpackRequest): Promise<QueryBuildpackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBuildpackEx(request, headers, runtime);
  }

  /**
   * Description: 搜索技术栈
   * Summary: 搜索技术栈
   */
  async queryBuildpackEx(request: QueryBuildpackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBuildpackResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBuildpackResponse>(await this.doRequest("1.0", "antcloud.deps.buildpack.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBuildpackResponse({}));
  }

  /**
   * Description: 创建一个技术栈
   * Summary: 创建一个技术栈
   */
  async createBuildpack(request: CreateBuildpackRequest): Promise<CreateBuildpackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBuildpackEx(request, headers, runtime);
  }

  /**
   * Description: 创建一个技术栈
   * Summary: 创建一个技术栈
   */
  async createBuildpackEx(request: CreateBuildpackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBuildpackResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBuildpackResponse>(await this.doRequest("1.0", "antcloud.deps.buildpack.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBuildpackResponse({}));
  }

  /**
   * Description: 更新技术栈包状态
   * Summary: 更新技术栈包状态
   */
  async uploadfinishBuildpack(request: UploadfinishBuildpackRequest): Promise<UploadfinishBuildpackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadfinishBuildpackEx(request, headers, runtime);
  }

  /**
   * Description: 更新技术栈包状态
   * Summary: 更新技术栈包状态
   */
  async uploadfinishBuildpackEx(request: UploadfinishBuildpackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadfinishBuildpackResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadfinishBuildpackResponse>(await this.doRequest("1.0", "antcloud.deps.buildpack.uploadfinish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadfinishBuildpackResponse({}));
  }

  /**
   * Description: 发布一个技术栈
   * Summary: 发布一个技术栈
   */
  async publishBuildpack(request: PublishBuildpackRequest): Promise<PublishBuildpackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.publishBuildpackEx(request, headers, runtime);
  }

  /**
   * Description: 发布一个技术栈
   * Summary: 发布一个技术栈
   */
  async publishBuildpackEx(request: PublishBuildpackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PublishBuildpackResponse> {
    Util.validateModel(request);
    return $tea.cast<PublishBuildpackResponse>(await this.doRequest("1.0", "antcloud.deps.buildpack.publish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PublishBuildpackResponse({}));
  }

  /**
   * Description: 更新一个技术栈
   * Summary: 更新一个技术栈
   */
  async updateBuildpack(request: UpdateBuildpackRequest): Promise<UpdateBuildpackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateBuildpackEx(request, headers, runtime);
  }

  /**
   * Description: 更新一个技术栈
   * Summary: 更新一个技术栈
   */
  async updateBuildpackEx(request: UpdateBuildpackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateBuildpackResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBuildpackResponse>(await this.doRequest("1.0", "antcloud.deps.buildpack.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateBuildpackResponse({}));
  }

  /**
   * Description: 根据名称查询
   * Summary: 根据名称查询
   */
  async queryBuildpackFindbynames(request: QueryBuildpackFindbynamesRequest): Promise<QueryBuildpackFindbynamesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBuildpackFindbynamesEx(request, headers, runtime);
  }

  /**
   * Description: 根据名称查询
   * Summary: 根据名称查询
   */
  async queryBuildpackFindbynamesEx(request: QueryBuildpackFindbynamesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBuildpackFindbynamesResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBuildpackFindbynamesResponse>(await this.doRequest("1.0", "antcloud.deps.buildpack.findbynames.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBuildpackFindbynamesResponse({}));
  }

  /**
   * Description: 计算
   * Summary: 计算
   */
  async countBuildpack(request: CountBuildpackRequest): Promise<CountBuildpackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.countBuildpackEx(request, headers, runtime);
  }

  /**
   * Description: 计算
   * Summary: 计算
   */
  async countBuildpackEx(request: CountBuildpackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CountBuildpackResponse> {
    Util.validateModel(request);
    return $tea.cast<CountBuildpackResponse>(await this.doRequest("1.0", "antcloud.deps.buildpack.count", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CountBuildpackResponse({}));
  }

  /**
   * Description: 废弃
   * Summary: 废弃
   */
  async deprecateBuildpack(request: DeprecateBuildpackRequest): Promise<DeprecateBuildpackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deprecateBuildpackEx(request, headers, runtime);
  }

  /**
   * Description: 废弃
   * Summary: 废弃
   */
  async deprecateBuildpackEx(request: DeprecateBuildpackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeprecateBuildpackResponse> {
    Util.validateModel(request);
    return $tea.cast<DeprecateBuildpackResponse>(await this.doRequest("1.0", "antcloud.deps.buildpack.deprecate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeprecateBuildpackResponse({}));
  }

  /**
   * Description: 批量删除
   * Summary: 批量删除
   */
  async batchdeleteBuildpack(request: BatchdeleteBuildpackRequest): Promise<BatchdeleteBuildpackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchdeleteBuildpackEx(request, headers, runtime);
  }

  /**
   * Description: 批量删除
   * Summary: 批量删除
   */
  async batchdeleteBuildpackEx(request: BatchdeleteBuildpackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchdeleteBuildpackResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchdeleteBuildpackResponse>(await this.doRequest("1.0", "antcloud.deps.buildpack.batchdelete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchdeleteBuildpackResponse({}));
  }

  /**
   * Description: 查询是否存在
   * Summary: 查询是否存在
   */
  async existBuildpack(request: ExistBuildpackRequest): Promise<ExistBuildpackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.existBuildpackEx(request, headers, runtime);
  }

  /**
   * Description: 查询是否存在
   * Summary: 查询是否存在
   */
  async existBuildpackEx(request: ExistBuildpackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExistBuildpackResponse> {
    Util.validateModel(request);
    return $tea.cast<ExistBuildpackResponse>(await this.doRequest("1.0", "antcloud.deps.buildpack.exist", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExistBuildpackResponse({}));
  }

  /**
   * Description: 更新打包状态
   * Summary: 更新打包状态
   */
  async updateBuildpackUpdatepackagesstatus(request: UpdateBuildpackUpdatepackagesstatusRequest): Promise<UpdateBuildpackUpdatepackagesstatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateBuildpackUpdatepackagesstatusEx(request, headers, runtime);
  }

  /**
   * Description: 更新打包状态
   * Summary: 更新打包状态
   */
  async updateBuildpackUpdatepackagesstatusEx(request: UpdateBuildpackUpdatepackagesstatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateBuildpackUpdatepackagesstatusResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBuildpackUpdatepackagesstatusResponse>(await this.doRequest("1.0", "antcloud.deps.buildpack.updatepackagesstatus.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateBuildpackUpdatepackagesstatusResponse({}));
  }

  /**
   * Description: 查询版本
   * Summary: 查询版本
   */
  async queryBuildpackFindidversionpairsbyversion(request: QueryBuildpackFindidversionpairsbyversionRequest): Promise<QueryBuildpackFindidversionpairsbyversionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBuildpackFindidversionpairsbyversionEx(request, headers, runtime);
  }

  /**
   * Description: 查询版本
   * Summary: 查询版本
   */
  async queryBuildpackFindidversionpairsbyversionEx(request: QueryBuildpackFindidversionpairsbyversionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBuildpackFindidversionpairsbyversionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBuildpackFindidversionpairsbyversionResponse>(await this.doRequest("1.0", "antcloud.deps.buildpack.findidversionpairsbyversion.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBuildpackFindidversionpairsbyversionResponse({}));
  }

  /**
   * Description: 根据技术栈分组查询
   * Summary: 根据技术栈分组查询
   */
  async queryBuildpackGroupbytechstack(request: QueryBuildpackGroupbytechstackRequest): Promise<QueryBuildpackGroupbytechstackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBuildpackGroupbytechstackEx(request, headers, runtime);
  }

  /**
   * Description: 根据技术栈分组查询
   * Summary: 根据技术栈分组查询
   */
  async queryBuildpackGroupbytechstackEx(request: QueryBuildpackGroupbytechstackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBuildpackGroupbytechstackResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBuildpackGroupbytechstackResponse>(await this.doRequest("1.0", "antcloud.deps.buildpack.groupbytechstack.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBuildpackGroupbytechstackResponse({}));
  }

  /**
   * Description: 查询可见技术栈
   * Summary: 查询可见技术栈
   */
  async queryBuildpackFindvisibletechstacks(request: QueryBuildpackFindvisibletechstacksRequest): Promise<QueryBuildpackFindvisibletechstacksResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBuildpackFindvisibletechstacksEx(request, headers, runtime);
  }

  /**
   * Description: 查询可见技术栈
   * Summary: 查询可见技术栈
   */
  async queryBuildpackFindvisibletechstacksEx(request: QueryBuildpackFindvisibletechstacksRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBuildpackFindvisibletechstacksResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBuildpackFindvisibletechstacksResponse>(await this.doRequest("1.0", "antcloud.deps.buildpack.findvisibletechstacks.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBuildpackFindvisibletechstacksResponse({}));
  }

  /**
   * Description: 查询可写技术栈
   * Summary: 查询可写技术栈
   */
  async queryBuildpackFindwritabletechstacks(request: QueryBuildpackFindwritabletechstacksRequest): Promise<QueryBuildpackFindwritabletechstacksResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBuildpackFindwritabletechstacksEx(request, headers, runtime);
  }

  /**
   * Description: 查询可写技术栈
   * Summary: 查询可写技术栈
   */
  async queryBuildpackFindwritabletechstacksEx(request: QueryBuildpackFindwritabletechstacksRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBuildpackFindwritabletechstacksResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBuildpackFindwritabletechstacksResponse>(await this.doRequest("1.0", "antcloud.deps.buildpack.findwritabletechstacks.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBuildpackFindwritabletechstacksResponse({}));
  }

  /**
   * Description: 查询os通过当前云
   * Summary: 查询os通过当前云
   */
  async queryBuildpackFindosbycurrentcloud(request: QueryBuildpackFindosbycurrentcloudRequest): Promise<QueryBuildpackFindosbycurrentcloudResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBuildpackFindosbycurrentcloudEx(request, headers, runtime);
  }

  /**
   * Description: 查询os通过当前云
   * Summary: 查询os通过当前云
   */
  async queryBuildpackFindosbycurrentcloudEx(request: QueryBuildpackFindosbycurrentcloudRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBuildpackFindosbycurrentcloudResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBuildpackFindosbycurrentcloudResponse>(await this.doRequest("1.0", "antcloud.deps.buildpack.findosbycurrentcloud.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBuildpackFindosbycurrentcloudResponse({}));
  }

  /**
   * Description: 通过appv1查询buildpack
   * Summary: 查询buildpack
   */
  async queryBuildpackFindbyappsv(request: QueryBuildpackFindbyappsvRequest): Promise<QueryBuildpackFindbyappsvResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBuildpackFindbyappsvEx(request, headers, runtime);
  }

  /**
   * Description: 通过appv1查询buildpack
   * Summary: 查询buildpack
   */
  async queryBuildpackFindbyappsvEx(request: QueryBuildpackFindbyappsvRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBuildpackFindbyappsvResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBuildpackFindbyappsvResponse>(await this.doRequest("1.0", "antcloud.deps.buildpack.findbyappsv.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBuildpackFindbyappsvResponse({}));
  }

  /**
   * Description: 通过app查询
   * Summary: 通过app查询
   */
  async queryBuildpackFindbyapps(request: QueryBuildpackFindbyappsRequest): Promise<QueryBuildpackFindbyappsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBuildpackFindbyappsEx(request, headers, runtime);
  }

  /**
   * Description: 通过app查询
   * Summary: 通过app查询
   */
  async queryBuildpackFindbyappsEx(request: QueryBuildpackFindbyappsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBuildpackFindbyappsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBuildpackFindbyappsResponse>(await this.doRequest("1.0", "antcloud.deps.buildpack.findbyapps.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBuildpackFindbyappsResponse({}));
  }

  /**
   * Description: 通过app服务查询
   * Summary: 通过app服务查询
   */
  async queryBuildpackFindbyappservices(request: QueryBuildpackFindbyappservicesRequest): Promise<QueryBuildpackFindbyappservicesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBuildpackFindbyappservicesEx(request, headers, runtime);
  }

  /**
   * Description: 通过app服务查询
   * Summary: 通过app服务查询
   */
  async queryBuildpackFindbyappservicesEx(request: QueryBuildpackFindbyappservicesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBuildpackFindbyappservicesResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBuildpackFindbyappservicesResponse>(await this.doRequest("1.0", "antcloud.deps.buildpack.findbyappservices.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBuildpackFindbyappservicesResponse({}));
  }

  /**
   * Description: 通过appv1查询
   * Summary: 通过appv1查询
   */
  async queryBuildpackFindbyappv(request: QueryBuildpackFindbyappvRequest): Promise<QueryBuildpackFindbyappvResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBuildpackFindbyappvEx(request, headers, runtime);
  }

  /**
   * Description: 通过appv1查询
   * Summary: 通过appv1查询
   */
  async queryBuildpackFindbyappvEx(request: QueryBuildpackFindbyappvRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBuildpackFindbyappvResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBuildpackFindbyappvResponse>(await this.doRequest("1.0", "antcloud.deps.buildpack.findbyappv.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBuildpackFindbyappvResponse({}));
  }

  /**
   * Description: 通过app查询
   * Summary: 通过app查询
   */
  async queryBuildpackFindbyapp(request: QueryBuildpackFindbyappRequest): Promise<QueryBuildpackFindbyappResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBuildpackFindbyappEx(request, headers, runtime);
  }

  /**
   * Description: 通过app查询
   * Summary: 通过app查询
   */
  async queryBuildpackFindbyappEx(request: QueryBuildpackFindbyappRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBuildpackFindbyappResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBuildpackFindbyappResponse>(await this.doRequest("1.0", "antcloud.deps.buildpack.findbyapp.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBuildpackFindbyappResponse({}));
  }

  /**
   * Description: 生成url
   * Summary: 生成url
   */
  async createBuildpackGeneratesignurl(request: CreateBuildpackGeneratesignurlRequest): Promise<CreateBuildpackGeneratesignurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBuildpackGeneratesignurlEx(request, headers, runtime);
  }

  /**
   * Description: 生成url
   * Summary: 生成url
   */
  async createBuildpackGeneratesignurlEx(request: CreateBuildpackGeneratesignurlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBuildpackGeneratesignurlResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBuildpackGeneratesignurlResponse>(await this.doRequest("1.0", "antcloud.deps.buildpack.generatesignurl.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBuildpackGeneratesignurlResponse({}));
  }

  /**
   * Description: 查询pagessize
   * Summary: 查询pagessize
   */
  async queryBuildpackSumpackagessize(request: QueryBuildpackSumpackagessizeRequest): Promise<QueryBuildpackSumpackagessizeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBuildpackSumpackagessizeEx(request, headers, runtime);
  }

  /**
   * Description: 查询pagessize
   * Summary: 查询pagessize
   */
  async queryBuildpackSumpackagessizeEx(request: QueryBuildpackSumpackagessizeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBuildpackSumpackagessizeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBuildpackSumpackagessizeResponse>(await this.doRequest("1.0", "antcloud.deps.buildpack.sumpackagessize.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBuildpackSumpackagessizeResponse({}));
  }

  /**
   * Description: 查询是否supportcode
   * Summary: 查询是否supportcode
   */
  async queryBuildpackSupportcoderepo(request: QueryBuildpackSupportcoderepoRequest): Promise<QueryBuildpackSupportcoderepoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBuildpackSupportcoderepoEx(request, headers, runtime);
  }

  /**
   * Description: 查询是否supportcode
   * Summary: 查询是否supportcode
   */
  async queryBuildpackSupportcoderepoEx(request: QueryBuildpackSupportcoderepoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBuildpackSupportcoderepoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBuildpackSupportcoderepoResponse>(await this.doRequest("1.0", "antcloud.deps.buildpack.supportcoderepo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBuildpackSupportcoderepoResponse({}));
  }

  /**
   * Description: 通过可用的app服务id查询Composite信息
   * Summary: 查询Composite信息
   */
  async queryBuildpackFindavailablebyappserviceids(request: QueryBuildpackFindavailablebyappserviceidsRequest): Promise<QueryBuildpackFindavailablebyappserviceidsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBuildpackFindavailablebyappserviceidsEx(request, headers, runtime);
  }

  /**
   * Description: 通过可用的app服务id查询Composite信息
   * Summary: 查询Composite信息
   */
  async queryBuildpackFindavailablebyappserviceidsEx(request: QueryBuildpackFindavailablebyappserviceidsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBuildpackFindavailablebyappserviceidsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBuildpackFindavailablebyappserviceidsResponse>(await this.doRequest("1.0", "antcloud.deps.buildpack.findavailablebyappserviceids.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBuildpackFindavailablebyappserviceidsResponse({}));
  }

  /**
   * Description: pageQuery
   * Summary: pageQuery
   */
  async queryBuildpacknew(request: QueryBuildpacknewRequest): Promise<QueryBuildpacknewResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBuildpacknewEx(request, headers, runtime);
  }

  /**
   * Description: pageQuery
   * Summary: pageQuery
   */
  async queryBuildpacknewEx(request: QueryBuildpacknewRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBuildpacknewResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBuildpacknewResponse>(await this.doRequest("1.0", "antcloud.deps.buildpacknew.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBuildpacknewResponse({}));
  }

  /**
   * Description: buildpacknewget
   * Summary: buildpacknewget
   */
  async getBuildpacknew(request: GetBuildpacknewRequest): Promise<GetBuildpacknewResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getBuildpacknewEx(request, headers, runtime);
  }

  /**
   * Description: buildpacknewget
   * Summary: buildpacknewget
   */
  async getBuildpacknewEx(request: GetBuildpacknewRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetBuildpacknewResponse> {
    Util.validateModel(request);
    return $tea.cast<GetBuildpacknewResponse>(await this.doRequest("1.0", "antcloud.deps.buildpacknew.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetBuildpacknewResponse({}));
  }

  /**
   * Description: update
   * Summary: update
   */
  async updateBuildpacknewUploadfinish(request: UpdateBuildpacknewUploadfinishRequest): Promise<UpdateBuildpacknewUploadfinishResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateBuildpacknewUploadfinishEx(request, headers, runtime);
  }

  /**
   * Description: update
   * Summary: update
   */
  async updateBuildpacknewUploadfinishEx(request: UpdateBuildpacknewUploadfinishRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateBuildpacknewUploadfinishResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBuildpacknewUploadfinishResponse>(await this.doRequest("1.0", "antcloud.deps.buildpacknew.uploadfinish.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateBuildpacknewUploadfinishResponse({}));
  }

  /**
   * Description: update
   * Summary: update
   */
  async updateBuildpacknew(request: UpdateBuildpacknewRequest): Promise<UpdateBuildpacknewResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateBuildpacknewEx(request, headers, runtime);
  }

  /**
   * Description: update
   * Summary: update
   */
  async updateBuildpacknewEx(request: UpdateBuildpacknewRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateBuildpacknewResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBuildpacknewResponse>(await this.doRequest("1.0", "antcloud.deps.buildpacknew.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateBuildpacknewResponse({}));
  }

  /**
   * Description: 创建技术栈
   * Summary: 创建技术栈
   */
  async createBuildpacknew(request: CreateBuildpacknewRequest): Promise<CreateBuildpacknewResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBuildpacknewEx(request, headers, runtime);
  }

  /**
   * Description: 创建技术栈
   * Summary: 创建技术栈
   */
  async createBuildpacknewEx(request: CreateBuildpacknewRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBuildpacknewResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBuildpacknewResponse>(await this.doRequest("1.0", "antcloud.deps.buildpacknew.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBuildpacknewResponse({}));
  }

  /**
   * Description: 发布一个技术栈
   * Summary: 发布一个技术栈
   */
  async onlineBuildpack(request: OnlineBuildpackRequest): Promise<OnlineBuildpackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.onlineBuildpackEx(request, headers, runtime);
  }

  /**
   * Description: 发布一个技术栈
   * Summary: 发布一个技术栈
   */
  async onlineBuildpackEx(request: OnlineBuildpackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OnlineBuildpackResponse> {
    Util.validateModel(request);
    return $tea.cast<OnlineBuildpackResponse>(await this.doRequest("1.0", "antcloud.deps.buildpack.online", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OnlineBuildpackResponse({}));
  }

  /**
   * Description: 创建一个全局参数
   * Summary: 创建一个全局参数
   */
  async createConfigGlobal(request: CreateConfigGlobalRequest): Promise<CreateConfigGlobalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createConfigGlobalEx(request, headers, runtime);
  }

  /**
   * Description: 创建一个全局参数
   * Summary: 创建一个全局参数
   */
  async createConfigGlobalEx(request: CreateConfigGlobalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateConfigGlobalResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateConfigGlobalResponse>(await this.doRequest("1.0", "antcloud.deps.config.global.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateConfigGlobalResponse({}));
  }

  /**
   * Description: 删除一个全局参数
   * Summary: 删除一个全局参数
   */
  async deleteConfigGlobal(request: DeleteConfigGlobalRequest): Promise<DeleteConfigGlobalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteConfigGlobalEx(request, headers, runtime);
  }

  /**
   * Description: 删除一个全局参数
   * Summary: 删除一个全局参数
   */
  async deleteConfigGlobalEx(request: DeleteConfigGlobalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteConfigGlobalResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteConfigGlobalResponse>(await this.doRequest("1.0", "antcloud.deps.config.global.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteConfigGlobalResponse({}));
  }

  /**
   * Description: 更新指定的全局参数
   * Summary: 更新指定的全局参数
   */
  async updateConfigGlobal(request: UpdateConfigGlobalRequest): Promise<UpdateConfigGlobalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateConfigGlobalEx(request, headers, runtime);
  }

  /**
   * Description: 更新指定的全局参数
   * Summary: 更新指定的全局参数
   */
  async updateConfigGlobalEx(request: UpdateConfigGlobalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateConfigGlobalResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateConfigGlobalResponse>(await this.doRequest("1.0", "antcloud.deps.config.global.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateConfigGlobalResponse({}));
  }

  /**
   * Description: 根据条件查询符合条件的全局参数
   * Summary: 根据条件查询符合条件的全局参数
   */
  async queryConfigGlobal(request: QueryConfigGlobalRequest): Promise<QueryConfigGlobalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryConfigGlobalEx(request, headers, runtime);
  }

  /**
   * Description: 根据条件查询符合条件的全局参数
   * Summary: 根据条件查询符合条件的全局参数
   */
  async queryConfigGlobalEx(request: QueryConfigGlobalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryConfigGlobalResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryConfigGlobalResponse>(await this.doRequest("1.0", "antcloud.deps.config.global.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryConfigGlobalResponse({}));
  }

  /**
   * Description: 获取单个全局参数
   * Summary: 获取单个全局参数
   */
  async getConfigGlobal(request: GetConfigGlobalRequest): Promise<GetConfigGlobalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getConfigGlobalEx(request, headers, runtime);
  }

  /**
   * Description: 获取单个全局参数
   * Summary: 获取单个全局参数
   */
  async getConfigGlobalEx(request: GetConfigGlobalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetConfigGlobalResponse> {
    Util.validateModel(request);
    return $tea.cast<GetConfigGlobalResponse>(await this.doRequest("1.0", "antcloud.deps.config.global.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetConfigGlobalResponse({}));
  }

  /**
   * Description: 创建一个应用参数
   * Summary: 创建一个应用参数
   */
  async createConfigApp(request: CreateConfigAppRequest): Promise<CreateConfigAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createConfigAppEx(request, headers, runtime);
  }

  /**
   * Description: 创建一个应用参数
   * Summary: 创建一个应用参数
   */
  async createConfigAppEx(request: CreateConfigAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateConfigAppResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateConfigAppResponse>(await this.doRequest("1.0", "antcloud.deps.config.app.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateConfigAppResponse({}));
  }

  /**
   * Description: 删除一个应用参数
   * Summary: 删除一个应用参数
   */
  async deleteConfigApp(request: DeleteConfigAppRequest): Promise<DeleteConfigAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteConfigAppEx(request, headers, runtime);
  }

  /**
   * Description: 删除一个应用参数
   * Summary: 删除一个应用参数
   */
  async deleteConfigAppEx(request: DeleteConfigAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteConfigAppResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteConfigAppResponse>(await this.doRequest("1.0", "antcloud.deps.config.app.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteConfigAppResponse({}));
  }

  /**
   * Description: 更新指定的应用参数
   * Summary: 更新指定的应用参数
   */
  async updateConfigApp(request: UpdateConfigAppRequest): Promise<UpdateConfigAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateConfigAppEx(request, headers, runtime);
  }

  /**
   * Description: 更新指定的应用参数
   * Summary: 更新指定的应用参数
   */
  async updateConfigAppEx(request: UpdateConfigAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateConfigAppResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateConfigAppResponse>(await this.doRequest("1.0", "antcloud.deps.config.app.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateConfigAppResponse({}));
  }

  /**
   * Description: 获取指定的应用参数
   * Summary: 获取指定的应用参数
   */
  async getConfigApp(request: GetConfigAppRequest): Promise<GetConfigAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getConfigAppEx(request, headers, runtime);
  }

  /**
   * Description: 获取指定的应用参数
   * Summary: 获取指定的应用参数
   */
  async getConfigAppEx(request: GetConfigAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetConfigAppResponse> {
    Util.validateModel(request);
    return $tea.cast<GetConfigAppResponse>(await this.doRequest("1.0", "antcloud.deps.config.app.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetConfigAppResponse({}));
  }

  /**
   * Description: 查询符合条件的应用参数
   * Summary: 查询符合条件的应用参数
   */
  async queryConfigApp(request: QueryConfigAppRequest): Promise<QueryConfigAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryConfigAppEx(request, headers, runtime);
  }

  /**
   * Description: 查询符合条件的应用参数
   * Summary: 查询符合条件的应用参数
   */
  async queryConfigAppEx(request: QueryConfigAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryConfigAppResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryConfigAppResponse>(await this.doRequest("1.0", "antcloud.deps.config.app.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryConfigAppResponse({}));
  }

  /**
   * Description: 保存一个应用参数模板草稿的修改，后端会将 state 置为 DRAFT，不会生成 version（一直为空）；此时该草稿记录可以反复被修改；点击保存时，如果参数模板还没创建（tpl_id 为空），那么后端会创建一个，如果已经存在参数模板草稿，那么更新该参数模板；
   * Summary: 将一个应用参数模板保存为草稿
   */
  async saveConfigTemplate(request: SaveConfigTemplateRequest): Promise<SaveConfigTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveConfigTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 保存一个应用参数模板草稿的修改，后端会将 state 置为 DRAFT，不会生成 version（一直为空）；此时该草稿记录可以反复被修改；点击保存时，如果参数模板还没创建（tpl_id 为空），那么后端会创建一个，如果已经存在参数模板草稿，那么更新该参数模板；
   * Summary: 将一个应用参数模板保存为草稿
   */
  async saveConfigTemplateEx(request: SaveConfigTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveConfigTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveConfigTemplateResponse>(await this.doRequest("1.0", "antcloud.deps.config.template.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveConfigTemplateResponse({}));
  }

  /**
   * Description: 发布一个应用参数模板，后端会将  state 置为 RELEASE，并且自动生成 version；此时该版本就已经固定，不能修改该条记录；点击发布时，如果之前没创建过参数模板草稿（tpl_id 为空），那么直接调用创建接口，如果当前参数模板是在草稿上发布的，那么调用更新接口，将 state 置为 RELEASE，并自动生成 version；
   * Summary: 发布一个应用参数模板
   */
  async createConfigTemplate(request: CreateConfigTemplateRequest): Promise<CreateConfigTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createConfigTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 发布一个应用参数模板，后端会将  state 置为 RELEASE，并且自动生成 version；此时该版本就已经固定，不能修改该条记录；点击发布时，如果之前没创建过参数模板草稿（tpl_id 为空），那么直接调用创建接口，如果当前参数模板是在草稿上发布的，那么调用更新接口，将 state 置为 RELEASE，并自动生成 version；
   * Summary: 发布一个应用参数模板
   */
  async createConfigTemplateEx(request: CreateConfigTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateConfigTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateConfigTemplateResponse>(await this.doRequest("1.0", "antcloud.deps.config.template.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateConfigTemplateResponse({}));
  }

  /**
   * Description: 获取某个应用最新版本的应用参数模板
   * Summary: 获取某个应用最新版本的应用参数模板
   */
  async pullConfigTemplate(request: PullConfigTemplateRequest): Promise<PullConfigTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pullConfigTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 获取某个应用最新版本的应用参数模板
   * Summary: 获取某个应用最新版本的应用参数模板
   */
  async pullConfigTemplateEx(request: PullConfigTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PullConfigTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<PullConfigTemplateResponse>(await this.doRequest("1.0", "antcloud.deps.config.template.pull", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PullConfigTemplateResponse({}));
  }

  /**
   * Description: 删除一个应用参数模板 草稿，后端判断是否为草稿状态，如果不是，删除失败
   * Summary: 删除一个应用参数模板草稿
   */
  async deleteConfigTemplatedraft(request: DeleteConfigTemplatedraftRequest): Promise<DeleteConfigTemplatedraftResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteConfigTemplatedraftEx(request, headers, runtime);
  }

  /**
   * Description: 删除一个应用参数模板 草稿，后端判断是否为草稿状态，如果不是，删除失败
   * Summary: 删除一个应用参数模板草稿
   */
  async deleteConfigTemplatedraftEx(request: DeleteConfigTemplatedraftRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteConfigTemplatedraftResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteConfigTemplatedraftResponse>(await this.doRequest("1.0", "antcloud.deps.config.templatedraft.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteConfigTemplatedraftResponse({}));
  }

  /**
   * Description: 获取某个指定的应用参数模板
   * Summary: 获取某个指定的应用参数模板
   */
  async getConfigTemplate(request: GetConfigTemplateRequest): Promise<GetConfigTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getConfigTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 获取某个指定的应用参数模板
   * Summary: 获取某个指定的应用参数模板
   */
  async getConfigTemplateEx(request: GetConfigTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetConfigTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<GetConfigTemplateResponse>(await this.doRequest("1.0", "antcloud.deps.config.template.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetConfigTemplateResponse({}));
  }

  /**
   * Description: 查询符合条件的应用参数模板
   * Summary: 查询符合条件的应用参数模板
   */
  async queryConfigTemplate(request: QueryConfigTemplateRequest): Promise<QueryConfigTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryConfigTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 查询符合条件的应用参数模板
   * Summary: 查询符合条件的应用参数模板
   */
  async queryConfigTemplateEx(request: QueryConfigTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryConfigTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryConfigTemplateResponse>(await this.doRequest("1.0", "antcloud.deps.config.template.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryConfigTemplateResponse({}));
  }

  /**
   * Description: 渲染一个指定的参数列表，包含渲染上下文和待解析的参数，其中 workspace_group_id 和 workspace_id 至少填一个，后端会做校验；
   * Summary: 渲染一个指定的参数列表
   */
  async execConfigParse(request: ExecConfigParseRequest): Promise<ExecConfigParseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execConfigParseEx(request, headers, runtime);
  }

  /**
   * Description: 渲染一个指定的参数列表，包含渲染上下文和待解析的参数，其中 workspace_group_id 和 workspace_id 至少填一个，后端会做校验；
   * Summary: 渲染一个指定的参数列表
   */
  async execConfigParseEx(request: ExecConfigParseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecConfigParseResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecConfigParseResponse>(await this.doRequest("1.0", "antcloud.deps.config.parse.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecConfigParseResponse({}));
  }

  /**
   * Description: 批量创建全局参数
   * Summary: 批量创建全局参数
   */
  async batchcreateConfigGlobal(request: BatchcreateConfigGlobalRequest): Promise<BatchcreateConfigGlobalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateConfigGlobalEx(request, headers, runtime);
  }

  /**
   * Description: 批量创建全局参数
   * Summary: 批量创建全局参数
   */
  async batchcreateConfigGlobalEx(request: BatchcreateConfigGlobalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateConfigGlobalResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateConfigGlobalResponse>(await this.doRequest("1.0", "antcloud.deps.config.global.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateConfigGlobalResponse({}));
  }

  /**
   * Description: 批量创建应用参数
   * Summary: 批量创建应用参数
   */
  async batchcreateConfigApp(request: BatchcreateConfigAppRequest): Promise<BatchcreateConfigAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateConfigAppEx(request, headers, runtime);
  }

  /**
   * Description: 批量创建应用参数
   * Summary: 批量创建应用参数
   */
  async batchcreateConfigAppEx(request: BatchcreateConfigAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateConfigAppResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateConfigAppResponse>(await this.doRequest("1.0", "antcloud.deps.config.app.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateConfigAppResponse({}));
  }

  /**
   * Description: 获取当前租户下的站点管理员视角的树形结构：区域(region)=>机房(az)
   * Summary: 获取当前租户下的站点管理员视角的树形结构
   */
  async getConfigSitetree(request: GetConfigSitetreeRequest): Promise<GetConfigSitetreeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getConfigSitetreeEx(request, headers, runtime);
  }

  /**
   * Description: 获取当前租户下的站点管理员视角的树形结构：区域(region)=>机房(az)
   * Summary: 获取当前租户下的站点管理员视角的树形结构
   */
  async getConfigSitetreeEx(request: GetConfigSitetreeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetConfigSitetreeResponse> {
    Util.validateModel(request);
    return $tea.cast<GetConfigSitetreeResponse>(await this.doRequest("1.0", "antcloud.deps.config.sitetree.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetConfigSitetreeResponse({}));
  }

  /**
   * Description: 获取当前租户下的租户管理员视角的树形结构：工作空间组(workspaceGroup)=>工作空间(workspace)=>部署单元(cell)
   * Summary: 获取当前租户下的租户管理员视角的树形结构
   */
  async getConfigTenanttree(request: GetConfigTenanttreeRequest): Promise<GetConfigTenanttreeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getConfigTenanttreeEx(request, headers, runtime);
  }

  /**
   * Description: 获取当前租户下的租户管理员视角的树形结构：工作空间组(workspaceGroup)=>工作空间(workspace)=>部署单元(cell)
   * Summary: 获取当前租户下的租户管理员视角的树形结构
   */
  async getConfigTenanttreeEx(request: GetConfigTenanttreeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetConfigTenanttreeResponse> {
    Util.validateModel(request);
    return $tea.cast<GetConfigTenanttreeResponse>(await this.doRequest("1.0", "antcloud.deps.config.tenanttree.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetConfigTenanttreeResponse({}));
  }

  /**
   * Description: 检查应用参数是否已存在
   * Summary: 检查应用参数是否已存在
   */
  async existConfigApp(request: ExistConfigAppRequest): Promise<ExistConfigAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.existConfigAppEx(request, headers, runtime);
  }

  /**
   * Description: 检查应用参数是否已存在
   * Summary: 检查应用参数是否已存在
   */
  async existConfigAppEx(request: ExistConfigAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExistConfigAppResponse> {
    Util.validateModel(request);
    return $tea.cast<ExistConfigAppResponse>(await this.doRequest("1.0", "antcloud.deps.config.app.exist", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExistConfigAppResponse({}));
  }

  /**
   * Description: 检查全局参数是否已存在
   * Summary: 检查全局参数是否已存在
   */
  async existConfigGlobal(request: ExistConfigGlobalRequest): Promise<ExistConfigGlobalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.existConfigGlobalEx(request, headers, runtime);
  }

  /**
   * Description: 检查全局参数是否已存在
   * Summary: 检查全局参数是否已存在
   */
  async existConfigGlobalEx(request: ExistConfigGlobalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExistConfigGlobalResponse> {
    Util.validateModel(request);
    return $tea.cast<ExistConfigGlobalResponse>(await this.doRequest("1.0", "antcloud.deps.config.global.exist", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExistConfigGlobalResponse({}));
  }

  /**
   * Description: 列出指定租户下所有环境
   * Summary: 列出指定租户下所有环境
   */
  async listWorkspacegroup(request: ListWorkspacegroupRequest): Promise<ListWorkspacegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listWorkspacegroupEx(request, headers, runtime);
  }

  /**
   * Description: 列出指定租户下所有环境
   * Summary: 列出指定租户下所有环境
   */
  async listWorkspacegroupEx(request: ListWorkspacegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListWorkspacegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<ListWorkspacegroupResponse>(await this.doRequest("1.0", "antcloud.deps.workspacegroup.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListWorkspacegroupResponse({}));
  }

  /**
   * Description: 查询指定环境信息
   * Summary: 查询指定环境信息
   */
  async getWorkspacegroup(request: GetWorkspacegroupRequest): Promise<GetWorkspacegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getWorkspacegroupEx(request, headers, runtime);
  }

  /**
   * Description: 查询指定环境信息
   * Summary: 查询指定环境信息
   */
  async getWorkspacegroupEx(request: GetWorkspacegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetWorkspacegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<GetWorkspacegroupResponse>(await this.doRequest("1.0", "antcloud.deps.workspacegroup.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetWorkspacegroupResponse({}));
  }

  /**
   * Description: 查询部署单元列表
   * Summary: 查询部署单元列表
   */
  async queryCell(request: QueryCellRequest): Promise<QueryCellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCellEx(request, headers, runtime);
  }

  /**
   * Description: 查询部署单元列表
   * Summary: 查询部署单元列表
   */
  async queryCellEx(request: QueryCellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCellResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCellResponse>(await this.doRequest("1.0", "antcloud.deps.cell.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCellResponse({}));
  }

  /**
   * Description: 查询环境增量统计信息
   * Summary: 查询环境增量统计信息
   */
  async queryWorkspaceDelta(request: QueryWorkspaceDeltaRequest): Promise<QueryWorkspaceDeltaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryWorkspaceDeltaEx(request, headers, runtime);
  }

  /**
   * Description: 查询环境增量统计信息
   * Summary: 查询环境增量统计信息
   */
  async queryWorkspaceDeltaEx(request: QueryWorkspaceDeltaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryWorkspaceDeltaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryWorkspaceDeltaResponse>(await this.doRequest("1.0", "antcloud.deps.workspace.delta.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryWorkspaceDeltaResponse({}));
  }

  /**
   * Description: 创建工作空间组。
   * Summary: 创建工作空间组
   */
  async createWorkspacegroup(request: CreateWorkspacegroupRequest): Promise<CreateWorkspacegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createWorkspacegroupEx(request, headers, runtime);
  }

  /**
   * Description: 创建工作空间组。
   * Summary: 创建工作空间组
   */
  async createWorkspacegroupEx(request: CreateWorkspacegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateWorkspacegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateWorkspacegroupResponse>(await this.doRequest("1.0", "antcloud.deps.workspacegroup.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateWorkspacegroupResponse({}));
  }

  /**
   * Description: 查询环境组详细信息
   * Summary: 查询环境组详细信息
   */
  async queryWorkspacegroup(request: QueryWorkspacegroupRequest): Promise<QueryWorkspacegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryWorkspacegroupEx(request, headers, runtime);
  }

  /**
   * Description: 查询环境组详细信息
   * Summary: 查询环境组详细信息
   */
  async queryWorkspacegroupEx(request: QueryWorkspacegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryWorkspacegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryWorkspacegroupResponse>(await this.doRequest("1.0", "antcloud.deps.workspacegroup.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryWorkspacegroupResponse({}));
  }

  /**
   * Description: 删除指定工作空间组。
   * Summary: 删除指定工作空间组。
   */
  async deleteWorkspacegroup(request: DeleteWorkspacegroupRequest): Promise<DeleteWorkspacegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteWorkspacegroupEx(request, headers, runtime);
  }

  /**
   * Description: 删除指定工作空间组。
   * Summary: 删除指定工作空间组。
   */
  async deleteWorkspacegroupEx(request: DeleteWorkspacegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteWorkspacegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteWorkspacegroupResponse>(await this.doRequest("1.0", "antcloud.deps.workspacegroup.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteWorkspacegroupResponse({}));
  }

  /**
   * Description: 查询workspace信息(V2)。
   * Summary: 查询workspace信息(V2)。
   */
  async getSingleworkspace(request: GetSingleworkspaceRequest): Promise<GetSingleworkspaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getSingleworkspaceEx(request, headers, runtime);
  }

  /**
   * Description: 查询workspace信息(V2)。
   * Summary: 查询workspace信息(V2)。
   */
  async getSingleworkspaceEx(request: GetSingleworkspaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetSingleworkspaceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetSingleworkspaceResponse>(await this.doRequest("1.0", "antcloud.deps.singleworkspace.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetSingleworkspaceResponse({}));
  }

  /**
   * Description: 查询指定环境信息。
   * Summary: 查询指定环境信息。
   */
  async getSingleworkspacegroup(request: GetSingleworkspacegroupRequest): Promise<GetSingleworkspacegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getSingleworkspacegroupEx(request, headers, runtime);
  }

  /**
   * Description: 查询指定环境信息。
   * Summary: 查询指定环境信息。
   */
  async getSingleworkspacegroupEx(request: GetSingleworkspacegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetSingleworkspacegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<GetSingleworkspacegroupResponse>(await this.doRequest("1.0", "antcloud.deps.singleworkspacegroup.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetSingleworkspacegroupResponse({}));
  }

  /**
   * Description: 查询部署单元列表。
   * Summary: 查询部署单元列表。
   */
  async listCell(request: ListCellRequest): Promise<ListCellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listCellEx(request, headers, runtime);
  }

  /**
   * Description: 查询部署单元列表。
   * Summary: 查询部署单元列表。
   */
  async listCellEx(request: ListCellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListCellResponse> {
    Util.validateModel(request);
    return $tea.cast<ListCellResponse>(await this.doRequest("1.0", "antcloud.deps.cell.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListCellResponse({}));
  }

  /**
   * Description: 创建workspace信息(V2)
   * Summary: 创建workspace信息(V2)
   */
  async createSingleworkspace(request: CreateSingleworkspaceRequest): Promise<CreateSingleworkspaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSingleworkspaceEx(request, headers, runtime);
  }

  /**
   * Description: 创建workspace信息(V2)
   * Summary: 创建workspace信息(V2)
   */
  async createSingleworkspaceEx(request: CreateSingleworkspaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSingleworkspaceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSingleworkspaceResponse>(await this.doRequest("1.0", "antcloud.deps.singleworkspace.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSingleworkspaceResponse({}));
  }

  /**
   * Description: 删除workspace信息(V2)
   * Summary: 删除workspace信息(V2)
   */
  async deleteSingleworkspace(request: DeleteSingleworkspaceRequest): Promise<DeleteSingleworkspaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSingleworkspaceEx(request, headers, runtime);
  }

  /**
   * Description: 删除workspace信息(V2)
   * Summary: 删除workspace信息(V2)
   */
  async deleteSingleworkspaceEx(request: DeleteSingleworkspaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSingleworkspaceResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSingleworkspaceResponse>(await this.doRequest("1.0", "antcloud.deps.singleworkspace.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSingleworkspaceResponse({}));
  }

  /**
   * Description: 创建专有网络vpc
   * Summary: 创建专有网络vpc
   */
  async createVpc(request: CreateVpcRequest): Promise<CreateVpcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createVpcEx(request, headers, runtime);
  }

  /**
   * Description: 创建专有网络vpc
   * Summary: 创建专有网络vpc
   */
  async createVpcEx(request: CreateVpcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateVpcResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateVpcResponse>(await this.doRequest("1.0", "antcloud.deps.vpc.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateVpcResponse({}));
  }

  /**
   * Description: 更新workspacegroup。
   * Summary: 更新workspacegroup。
   */
  async updateWorkspacegroup(request: UpdateWorkspacegroupRequest): Promise<UpdateWorkspacegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateWorkspacegroupEx(request, headers, runtime);
  }

  /**
   * Description: 更新workspacegroup。
   * Summary: 更新workspacegroup。
   */
  async updateWorkspacegroupEx(request: UpdateWorkspacegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateWorkspacegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateWorkspacegroupResponse>(await this.doRequest("1.0", "antcloud.deps.workspacegroup.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateWorkspacegroupResponse({}));
  }

  /**
   * Description: update workspace meta data
   * Summary: update workspace
   */
  async updateSingleworkspace(request: UpdateSingleworkspaceRequest): Promise<UpdateSingleworkspaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSingleworkspaceEx(request, headers, runtime);
  }

  /**
   * Description: update workspace meta data
   * Summary: update workspace
   */
  async updateSingleworkspaceEx(request: UpdateSingleworkspaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSingleworkspaceResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSingleworkspaceResponse>(await this.doRequest("1.0", "antcloud.deps.singleworkspace.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSingleworkspaceResponse({}));
  }

  /**
   * Description: list regions
   * Summary: list regions
   */
  async listRegion(request: ListRegionRequest): Promise<ListRegionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listRegionEx(request, headers, runtime);
  }

  /**
   * Description: list regions
   * Summary: list regions
   */
  async listRegionEx(request: ListRegionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListRegionResponse> {
    Util.validateModel(request);
    return $tea.cast<ListRegionResponse>(await this.doRequest("1.0", "antcloud.deps.region.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListRegionResponse({}));
  }

  /**
   * Description: zone list
   * Summary: zone list
   */
  async listZone(request: ListZoneRequest): Promise<ListZoneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listZoneEx(request, headers, runtime);
  }

  /**
   * Description: zone list
   * Summary: zone list
   */
  async listZoneEx(request: ListZoneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListZoneResponse> {
    Util.validateModel(request);
    return $tea.cast<ListZoneResponse>(await this.doRequest("1.0", "antcloud.deps.zone.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListZoneResponse({}));
  }

  /**
   * Description: 创建逻辑单元
   * Summary: 创建逻辑单元
   */
  async createCellgroup(request: CreateCellgroupRequest): Promise<CreateCellgroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCellgroupEx(request, headers, runtime);
  }

  /**
   * Description: 创建逻辑单元
   * Summary: 创建逻辑单元
   */
  async createCellgroupEx(request: CreateCellgroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCellgroupResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCellgroupResponse>(await this.doRequest("1.0", "antcloud.deps.cellgroup.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCellgroupResponse({}));
  }

  /**
   * Description: 删除逻辑单元
   * Summary: 删除逻辑单元
   */
  async deleteCellgroup(request: DeleteCellgroupRequest): Promise<DeleteCellgroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteCellgroupEx(request, headers, runtime);
  }

  /**
   * Description: 删除逻辑单元
   * Summary: 删除逻辑单元
   */
  async deleteCellgroupEx(request: DeleteCellgroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteCellgroupResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteCellgroupResponse>(await this.doRequest("1.0", "antcloud.deps.cellgroup.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteCellgroupResponse({}));
  }

  /**
   * Description: 查询逻辑单元
   * Summary: 查询逻辑单元
   */
  async queryCellgroup(request: QueryCellgroupRequest): Promise<QueryCellgroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCellgroupEx(request, headers, runtime);
  }

  /**
   * Description: 查询逻辑单元
   * Summary: 查询逻辑单元
   */
  async queryCellgroupEx(request: QueryCellgroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCellgroupResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCellgroupResponse>(await this.doRequest("1.0", "antcloud.deps.cellgroup.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCellgroupResponse({}));
  }

  /**
   * Description: 配置逻辑单元灾备信息
   * Summary: 配置逻辑单元灾备信息
   */
  async updateCellgroupDisasterinfo(request: UpdateCellgroupDisasterinfoRequest): Promise<UpdateCellgroupDisasterinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateCellgroupDisasterinfoEx(request, headers, runtime);
  }

  /**
   * Description: 配置逻辑单元灾备信息
   * Summary: 配置逻辑单元灾备信息
   */
  async updateCellgroupDisasterinfoEx(request: UpdateCellgroupDisasterinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateCellgroupDisasterinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateCellgroupDisasterinfoResponse>(await this.doRequest("1.0", "antcloud.deps.cellgroup.disasterinfo.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateCellgroupDisasterinfoResponse({}));
  }

  /**
   * Description: 创建部署单元
   * Summary: 创建部署单元
   */
  async createDeploymentCell(request: CreateDeploymentCellRequest): Promise<CreateDeploymentCellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDeploymentCellEx(request, headers, runtime);
  }

  /**
   * Description: 创建部署单元
   * Summary: 创建部署单元
   */
  async createDeploymentCellEx(request: CreateDeploymentCellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDeploymentCellResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDeploymentCellResponse>(await this.doRequest("1.0", "antcloud.deps.deployment.cell.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDeploymentCellResponse({}));
  }

  /**
   * Description: 删除部署单元
   * Summary: 删除部署单元
   */
  async deleteDeploymentCell(request: DeleteDeploymentCellRequest): Promise<DeleteDeploymentCellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteDeploymentCellEx(request, headers, runtime);
  }

  /**
   * Description: 删除部署单元
   * Summary: 删除部署单元
   */
  async deleteDeploymentCellEx(request: DeleteDeploymentCellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteDeploymentCellResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteDeploymentCellResponse>(await this.doRequest("1.0", "antcloud.deps.deployment.cell.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteDeploymentCellResponse({}));
  }

  /**
   * Description: 查询部署单元
   * Summary: 查询部署单元
   */
  async queryDeploymentCell(request: QueryDeploymentCellRequest): Promise<QueryDeploymentCellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDeploymentCellEx(request, headers, runtime);
  }

  /**
   * Description: 查询部署单元
   * Summary: 查询部署单元
   */
  async queryDeploymentCellEx(request: QueryDeploymentCellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDeploymentCellResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDeploymentCellResponse>(await this.doRequest("1.0", "antcloud.deps.deployment.cell.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDeploymentCellResponse({}));
  }

  /**
   * Description: 更新部署单元
   * Summary: 更新部署单元
   */
  async updateDeploymentCell(request: UpdateDeploymentCellRequest): Promise<UpdateDeploymentCellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateDeploymentCellEx(request, headers, runtime);
  }

  /**
   * Description: 更新部署单元
   * Summary: 更新部署单元
   */
  async updateDeploymentCellEx(request: UpdateDeploymentCellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateDeploymentCellResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDeploymentCellResponse>(await this.doRequest("1.0", "antcloud.deps.deployment.cell.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateDeploymentCellResponse({}));
  }

  /**
   * Description: 批量查询部署单基础信息
   * Summary: 批量查询部署单基础信息
   */
  async queryDeployment(request: QueryDeploymentRequest): Promise<QueryDeploymentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDeploymentEx(request, headers, runtime);
  }

  /**
   * Description: 批量查询部署单基础信息
   * Summary: 批量查询部署单基础信息
   */
  async queryDeploymentEx(request: QueryDeploymentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDeploymentResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDeploymentResponse>(await this.doRequest("1.0", "antcloud.deps.deployment.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDeploymentResponse({}));
  }

  /**
   * Description: 对一个部署单执行取消操作。
  当部署单处于以下状态时可执行取消操作：
  INITED：初始化完成
  INIT_FAILED：初始化失败
   * Summary: 取消发布
   */
  async cancelDeployment(request: CancelDeploymentRequest): Promise<CancelDeploymentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelDeploymentEx(request, headers, runtime);
  }

  /**
   * Description: 对一个部署单执行取消操作。
  当部署单处于以下状态时可执行取消操作：
  INITED：初始化完成
  INIT_FAILED：初始化失败
   * Summary: 取消发布
   */
  async cancelDeploymentEx(request: CancelDeploymentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelDeploymentResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelDeploymentResponse>(await this.doRequest("1.0", "antcloud.deps.deployment.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelDeploymentResponse({}));
  }

  /**
   * Description: 创建一个部署单，以对一组应用（服务）执行一次部署操作。
  - 部署依赖示例
  假设一个部署单将要部署myapp1、myapp2、myapp3，其中myapp1依赖myapp2、myapp3，则应输入参数：
  applications.1.name=myapp1&applications.2.name=myapp2&applications.3.name=myapp3&applications.1.depends.1=myapp2&applications.1.depends.2=myapp3
   * Summary: 创建发布
   */
  async createDeployment(request: CreateDeploymentRequest): Promise<CreateDeploymentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDeploymentEx(request, headers, runtime);
  }

  /**
   * Description: 创建一个部署单，以对一组应用（服务）执行一次部署操作。
  - 部署依赖示例
  假设一个部署单将要部署myapp1、myapp2、myapp3，其中myapp1依赖myapp2、myapp3，则应输入参数：
  applications.1.name=myapp1&applications.2.name=myapp2&applications.3.name=myapp3&applications.1.depends.1=myapp2&applications.1.depends.2=myapp3
   * Summary: 创建发布
   */
  async createDeploymentEx(request: CreateDeploymentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDeploymentResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDeploymentResponse>(await this.doRequest("1.0", "antcloud.deps.deployment.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDeploymentResponse({}));
  }

  /**
   * Description: 查询一个已经创建成功的部署操作。
   * Summary: 获取部署
   */
  async getDeployment(request: GetDeploymentRequest): Promise<GetDeploymentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDeploymentEx(request, headers, runtime);
  }

  /**
   * Description: 查询一个已经创建成功的部署操作。
   * Summary: 获取部署
   */
  async getDeploymentEx(request: GetDeploymentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDeploymentResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDeploymentResponse>(await this.doRequest("1.0", "antcloud.deps.deployment.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDeploymentResponse({}));
  }

  /**
   * Description: 对一个部署操作中所有部署失败的分组进行重试操作。
  当部署单处于以下状态时可执行重试操作：
  - FAILED：执行失败
   * Summary: 重试部署
   */
  async retryDeployment(request: RetryDeploymentRequest): Promise<RetryDeploymentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryDeploymentEx(request, headers, runtime);
  }

  /**
   * Description: 对一个部署操作中所有部署失败的分组进行重试操作。
  当部署单处于以下状态时可执行重试操作：
  - FAILED：执行失败
   * Summary: 重试部署
   */
  async retryDeploymentEx(request: RetryDeploymentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryDeploymentResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryDeploymentResponse>(await this.doRequest("1.0", "antcloud.deps.deployment.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryDeploymentResponse({}));
  }

  /**
   * Description: 开始执行一个已经创建成功的部署操作。如果此部署单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
   * Summary: 开始部署
   */
  async startDeployment(request: StartDeploymentRequest): Promise<StartDeploymentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startDeploymentEx(request, headers, runtime);
  }

  /**
   * Description: 开始执行一个已经创建成功的部署操作。如果此部署单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
   * Summary: 开始部署
   */
  async startDeploymentEx(request: StartDeploymentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartDeploymentResponse> {
    Util.validateModel(request);
    return $tea.cast<StartDeploymentResponse>(await this.doRequest("1.0", "antcloud.deps.deployment.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartDeploymentResponse({}));
  }

  /**
   * Description: 查询一个部署操作中某个应用（服务）的详情。
   * Summary: 获取部署应用（服务）
   */
  async getDeploymentApplication(request: GetDeploymentApplicationRequest): Promise<GetDeploymentApplicationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDeploymentApplicationEx(request, headers, runtime);
  }

  /**
   * Description: 查询一个部署操作中某个应用（服务）的详情。
   * Summary: 获取部署应用（服务）
   */
  async getDeploymentApplicationEx(request: GetDeploymentApplicationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDeploymentApplicationResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDeploymentApplicationResponse>(await this.doRequest("1.0", "antcloud.deps.deployment.application.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDeploymentApplicationResponse({}));
  }

  /**
   * Description: 对一个部署操作中，某个应用（服务）的部署操作执行回滚。执行成功后，将回滚到上次成功部署的版本。一个应用（服务）只可以执行一次回滚操作，即已执行回滚操作的应用无论回滚成功与否都无法再次回滚。
  当部署的应用（服务）且应用（服务）对应的部署单处于以下状态时可执行回滚：
  - EXECUTING：执行中
  - SUCCESS：执行成功
  - FAILED：执行失败
   * Summary: 回滚部署
   */
  async rollbackDeploymentApplication(request: RollbackDeploymentApplicationRequest): Promise<RollbackDeploymentApplicationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.rollbackDeploymentApplicationEx(request, headers, runtime);
  }

  /**
   * Description: 对一个部署操作中，某个应用（服务）的部署操作执行回滚。执行成功后，将回滚到上次成功部署的版本。一个应用（服务）只可以执行一次回滚操作，即已执行回滚操作的应用无论回滚成功与否都无法再次回滚。
  当部署的应用（服务）且应用（服务）对应的部署单处于以下状态时可执行回滚：
  - EXECUTING：执行中
  - SUCCESS：执行成功
  - FAILED：执行失败
   * Summary: 回滚部署
   */
  async rollbackDeploymentApplicationEx(request: RollbackDeploymentApplicationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RollbackDeploymentApplicationResponse> {
    Util.validateModel(request);
    return $tea.cast<RollbackDeploymentApplicationResponse>(await this.doRequest("1.0", "antcloud.deps.deployment.application.rollback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RollbackDeploymentApplicationResponse({}));
  }

  /**
   * Description: 重新初始化一个初始化失败的部署单。当部署单处于初始化失败状态时方可执行重新初始化操作。
   * Summary: 重新初始化部署
   */
  async reinitDeployment(request: ReinitDeploymentRequest): Promise<ReinitDeploymentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.reinitDeploymentEx(request, headers, runtime);
  }

  /**
   * Description: 重新初始化一个初始化失败的部署单。当部署单处于初始化失败状态时方可执行重新初始化操作。
   * Summary: 重新初始化部署
   */
  async reinitDeploymentEx(request: ReinitDeploymentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReinitDeploymentResponse> {
    Util.validateModel(request);
    return $tea.cast<ReinitDeploymentResponse>(await this.doRequest("1.0", "antcloud.deps.deployment.reinit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReinitDeploymentResponse({}));
  }

  /**
   * Description: 根据查询条件查询指令模板。
   * Summary: 查询指令模板
   */
  async queryCmdtemplate(request: QueryCmdtemplateRequest): Promise<QueryCmdtemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCmdtemplateEx(request, headers, runtime);
  }

  /**
   * Description: 根据查询条件查询指令模板。
   * Summary: 查询指令模板
   */
  async queryCmdtemplateEx(request: QueryCmdtemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCmdtemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCmdtemplateResponse>(await this.doRequest("1.0", "antcloud.deps.cmdtemplate.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCmdtemplateResponse({}));
  }

  /**
   * Description: 获取指令模板详情。
   * Summary: 获取指令模板详情。
   */
  async getCmdtemplate(request: GetCmdtemplateRequest): Promise<GetCmdtemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getCmdtemplateEx(request, headers, runtime);
  }

  /**
   * Description: 获取指令模板详情。
   * Summary: 获取指令模板详情。
   */
  async getCmdtemplateEx(request: GetCmdtemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetCmdtemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<GetCmdtemplateResponse>(await this.doRequest("1.0", "antcloud.deps.cmdtemplate.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetCmdtemplateResponse({}));
  }

  /**
   * Description: 同步执行指令。
   * Summary: 同步执行指令。
   */
  async syncexecuteCmdTask(request: SyncexecuteCmdTaskRequest): Promise<SyncexecuteCmdTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncexecuteCmdTaskEx(request, headers, runtime);
  }

  /**
   * Description: 同步执行指令。
   * Summary: 同步执行指令。
   */
  async syncexecuteCmdTaskEx(request: SyncexecuteCmdTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncexecuteCmdTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncexecuteCmdTaskResponse>(await this.doRequest("1.0", "antcloud.deps.cmd.task.syncexecute", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncexecuteCmdTaskResponse({}));
  }

  /**
   * Description: 异步执行指令。
   * Summary: 异步执行指令。
   */
  async asyncexecuteCmdTask(request: AsyncexecuteCmdTaskRequest): Promise<AsyncexecuteCmdTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.asyncexecuteCmdTaskEx(request, headers, runtime);
  }

  /**
   * Description: 异步执行指令。
   * Summary: 异步执行指令。
   */
  async asyncexecuteCmdTaskEx(request: AsyncexecuteCmdTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AsyncexecuteCmdTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<AsyncexecuteCmdTaskResponse>(await this.doRequest("1.0", "antcloud.deps.cmd.task.asyncexecute", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AsyncexecuteCmdTaskResponse({}));
  }

  /**
   * Description: 查询执行指令任务结果。
   * Summary: 查询执行指令任务结果。
   */
  async getCmdTask(request: GetCmdTaskRequest): Promise<GetCmdTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getCmdTaskEx(request, headers, runtime);
  }

  /**
   * Description: 查询执行指令任务结果。
   * Summary: 查询执行指令任务结果。
   */
  async getCmdTaskEx(request: GetCmdTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetCmdTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<GetCmdTaskResponse>(await this.doRequest("1.0", "antcloud.deps.cmd.task.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetCmdTaskResponse({}));
  }

  /**
   * Description: 创建一个应用运维单，以对一组应用（服务）执行一次运维操作
   * Summary: 创建一个应用（服务）运维单
   */
  async createAppops(request: CreateAppopsRequest): Promise<CreateAppopsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAppopsEx(request, headers, runtime);
  }

  /**
   * Description: 创建一个应用运维单，以对一组应用（服务）执行一次运维操作
   * Summary: 创建一个应用（服务）运维单
   */
  async createAppopsEx(request: CreateAppopsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAppopsResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAppopsResponse>(await this.doRequest("1.0", "antcloud.deps.appops.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAppopsResponse({}));
  }

  /**
   * Description: 查询一个已经创建成功的运维操作。
   * Summary: 获取运维单
   */
  async getAppops(request: GetAppopsRequest): Promise<GetAppopsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAppopsEx(request, headers, runtime);
  }

  /**
   * Description: 查询一个已经创建成功的运维操作。
   * Summary: 获取运维单
   */
  async getAppopsEx(request: GetAppopsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAppopsResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAppopsResponse>(await this.doRequest("1.0", "antcloud.deps.appops.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAppopsResponse({}));
  }

  /**
   * Description: 开始执行一个已经创建成功的运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
   * Summary: 开始运维
   */
  async startAppops(request: StartAppopsRequest): Promise<StartAppopsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startAppopsEx(request, headers, runtime);
  }

  /**
   * Description: 开始执行一个已经创建成功的运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
   * Summary: 开始运维
   */
  async startAppopsEx(request: StartAppopsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartAppopsResponse> {
    Util.validateModel(request);
    return $tea.cast<StartAppopsResponse>(await this.doRequest("1.0", "antcloud.deps.appops.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartAppopsResponse({}));
  }

  /**
   * Description: 重新初始化一个初始化失败的运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
   * Summary: 重新初始化运维
   */
  async reinitAppops(request: ReinitAppopsRequest): Promise<ReinitAppopsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.reinitAppopsEx(request, headers, runtime);
  }

  /**
   * Description: 重新初始化一个初始化失败的运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
   * Summary: 重新初始化运维
   */
  async reinitAppopsEx(request: ReinitAppopsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReinitAppopsResponse> {
    Util.validateModel(request);
    return $tea.cast<ReinitAppopsResponse>(await this.doRequest("1.0", "antcloud.deps.appops.reinit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReinitAppopsResponse({}));
  }

  /**
   * Description: 对一个运维单执行取消操作。
  当运维单处于以下状态时可执行取消操作：
  INITED：初始化完成
  INIT_FAILED：初始化失败
   * Summary: 取消发布
   */
  async cancelAppops(request: CancelAppopsRequest): Promise<CancelAppopsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelAppopsEx(request, headers, runtime);
  }

  /**
   * Description: 对一个运维单执行取消操作。
  当运维单处于以下状态时可执行取消操作：
  INITED：初始化完成
  INIT_FAILED：初始化失败
   * Summary: 取消发布
   */
  async cancelAppopsEx(request: CancelAppopsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelAppopsResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelAppopsResponse>(await this.doRequest("1.0", "antcloud.deps.appops.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelAppopsResponse({}));
  }

  /**
   * Description: 对一个运维操作中所有运维失败的分组进行重试操作。
  当运维单处于以下状态时可执行重试操作：
  - FAILED：执行失败
   * Summary: 重试运维
   */
  async retryAppops(request: RetryAppopsRequest): Promise<RetryAppopsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryAppopsEx(request, headers, runtime);
  }

  /**
   * Description: 对一个运维操作中所有运维失败的分组进行重试操作。
  当运维单处于以下状态时可执行重试操作：
  - FAILED：执行失败
   * Summary: 重试运维
   */
  async retryAppopsEx(request: RetryAppopsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryAppopsResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryAppopsResponse>(await this.doRequest("1.0", "antcloud.deps.appops.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryAppopsResponse({}));
  }

  /**
   * Description: 创建一个机器运维单，以对一组或多组机器执行一次运维操作
   * Summary: 创建一个机器运维单
   */
  async createComputerops(request: CreateComputeropsRequest): Promise<CreateComputeropsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createComputeropsEx(request, headers, runtime);
  }

  /**
   * Description: 创建一个机器运维单，以对一组或多组机器执行一次运维操作
   * Summary: 创建一个机器运维单
   */
  async createComputeropsEx(request: CreateComputeropsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateComputeropsResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateComputeropsResponse>(await this.doRequest("1.0", "antcloud.deps.computerops.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateComputeropsResponse({}));
  }

  /**
   * Description: 查询一个已经创建成功的机器运维操作。
   * Summary: 获取运维单
   */
  async getComputerops(request: GetComputeropsRequest): Promise<GetComputeropsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getComputeropsEx(request, headers, runtime);
  }

  /**
   * Description: 查询一个已经创建成功的机器运维操作。
   * Summary: 获取运维单
   */
  async getComputeropsEx(request: GetComputeropsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetComputeropsResponse> {
    Util.validateModel(request);
    return $tea.cast<GetComputeropsResponse>(await this.doRequest("1.0", "antcloud.deps.computerops.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetComputeropsResponse({}));
  }

  /**
   * Description: 开始执行一个已经创建成功的机器运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
   * Summary: 开始运维
   */
  async startComputerops(request: StartComputeropsRequest): Promise<StartComputeropsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startComputeropsEx(request, headers, runtime);
  }

  /**
   * Description: 开始执行一个已经创建成功的机器运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
   * Summary: 开始运维
   */
  async startComputeropsEx(request: StartComputeropsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartComputeropsResponse> {
    Util.validateModel(request);
    return $tea.cast<StartComputeropsResponse>(await this.doRequest("1.0", "antcloud.deps.computerops.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartComputeropsResponse({}));
  }

  /**
   * Description: 重新初始化一个初始化失败的机器运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
   * Summary: 重新初始化运维
   */
  async reinitComputerops(request: ReinitComputeropsRequest): Promise<ReinitComputeropsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.reinitComputeropsEx(request, headers, runtime);
  }

  /**
   * Description: 重新初始化一个初始化失败的机器运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
   * Summary: 重新初始化运维
   */
  async reinitComputeropsEx(request: ReinitComputeropsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReinitComputeropsResponse> {
    Util.validateModel(request);
    return $tea.cast<ReinitComputeropsResponse>(await this.doRequest("1.0", "antcloud.deps.computerops.reinit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReinitComputeropsResponse({}));
  }

  /**
   * Description: 对一个机器运维单执行取消操作。
  当运维单处于以下状态时可执行取消操作：
  INITED：初始化完成
  INIT_FAILED：初始化失败
   * Summary: 取消发布
   */
  async cancelComputerops(request: CancelComputeropsRequest): Promise<CancelComputeropsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelComputeropsEx(request, headers, runtime);
  }

  /**
   * Description: 对一个机器运维单执行取消操作。
  当运维单处于以下状态时可执行取消操作：
  INITED：初始化完成
  INIT_FAILED：初始化失败
   * Summary: 取消发布
   */
  async cancelComputeropsEx(request: CancelComputeropsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelComputeropsResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelComputeropsResponse>(await this.doRequest("1.0", "antcloud.deps.computerops.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelComputeropsResponse({}));
  }

  /**
   * Description: 对一个机器运维操作中所有运维失败的分组进行重试操作。
  当运维单处于以下状态时可执行重试操作：
  - FAILED：执行失败
   * Summary: 重试运维
   */
  async retryComputerops(request: RetryComputeropsRequest): Promise<RetryComputeropsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryComputeropsEx(request, headers, runtime);
  }

  /**
   * Description: 对一个机器运维操作中所有运维失败的分组进行重试操作。
  当运维单处于以下状态时可执行重试操作：
  - FAILED：执行失败
   * Summary: 重试运维
   */
  async retryComputeropsEx(request: RetryComputeropsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryComputeropsResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryComputeropsResponse>(await this.doRequest("1.0", "antcloud.deps.computerops.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryComputeropsResponse({}));
  }

  /**
   * Description: 查询应用服务的运维历史。
   * Summary: 查询应用服务的运维历史。
   */
  async queryOpsappsvc(request: QueryOpsappsvcRequest): Promise<QueryOpsappsvcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryOpsappsvcEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用服务的运维历史。
   * Summary: 查询应用服务的运维历史。
   */
  async queryOpsappsvcEx(request: QueryOpsappsvcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryOpsappsvcResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryOpsappsvcResponse>(await this.doRequest("1.0", "antcloud.deps.opsappsvc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryOpsappsvcResponse({}));
  }

  /**
   * Description: 异步执行Bash命令。
   * Summary: 异步执行Bash命令。
   */
  async asyncexecuteBashcmd(request: AsyncexecuteBashcmdRequest): Promise<AsyncexecuteBashcmdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.asyncexecuteBashcmdEx(request, headers, runtime);
  }

  /**
   * Description: 异步执行Bash命令。
   * Summary: 异步执行Bash命令。
   */
  async asyncexecuteBashcmdEx(request: AsyncexecuteBashcmdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AsyncexecuteBashcmdResponse> {
    Util.validateModel(request);
    return $tea.cast<AsyncexecuteBashcmdResponse>(await this.doRequest("1.0", "antcloud.deps.bashcmd.asyncexecute", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AsyncexecuteBashcmdResponse({}));
  }

  /**
   * Description: 根据异步执行bash命令的任务ID查询结果。
   * Summary: 根据异步执行bash命令的任务ID查询结果。
   */
  async getBashcmdResult(request: GetBashcmdResultRequest): Promise<GetBashcmdResultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getBashcmdResultEx(request, headers, runtime);
  }

  /**
   * Description: 根据异步执行bash命令的任务ID查询结果。
   * Summary: 根据异步执行bash命令的任务ID查询结果。
   */
  async getBashcmdResultEx(request: GetBashcmdResultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetBashcmdResultResponse> {
    Util.validateModel(request);
    return $tea.cast<GetBashcmdResultResponse>(await this.doRequest("1.0", "antcloud.deps.bashcmd.result.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetBashcmdResultResponse({}));
  }

  /**
   * Description: 查询当前环境是否已开通蓝绿发布
   * Summary: 查询当前环境是否已开通蓝绿发布
   */
  async checkCloudconfigBgrelease(request: CheckCloudconfigBgreleaseRequest): Promise<CheckCloudconfigBgreleaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkCloudconfigBgreleaseEx(request, headers, runtime);
  }

  /**
   * Description: 查询当前环境是否已开通蓝绿发布
   * Summary: 查询当前环境是否已开通蓝绿发布
   */
  async checkCloudconfigBgreleaseEx(request: CheckCloudconfigBgreleaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckCloudconfigBgreleaseResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckCloudconfigBgreleaseResponse>(await this.doRequest("1.0", "antcloud.deps.cloudconfig.bgrelease.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckCloudconfigBgreleaseResponse({}));
  }

  /**
   * Description: 查询是否已开通蓝绿发布部署单元
   * Summary: 查询是否已开通蓝绿发布部署单元
   */
  async checkCloudconfigBgdeploymentcell(request: CheckCloudconfigBgdeploymentcellRequest): Promise<CheckCloudconfigBgdeploymentcellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkCloudconfigBgdeploymentcellEx(request, headers, runtime);
  }

  /**
   * Description: 查询是否已开通蓝绿发布部署单元
   * Summary: 查询是否已开通蓝绿发布部署单元
   */
  async checkCloudconfigBgdeploymentcellEx(request: CheckCloudconfigBgdeploymentcellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckCloudconfigBgdeploymentcellResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckCloudconfigBgdeploymentcellResponse>(await this.doRequest("1.0", "antcloud.deps.cloudconfig.bgdeploymentcell.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckCloudconfigBgdeploymentcellResponse({}));
  }

  /**
   * Description: 查询是否已开通应用服务
   * Summary: 查询是否已开通应用服务
   */
  async checkCloudconfigAppservice(request: CheckCloudconfigAppserviceRequest): Promise<CheckCloudconfigAppserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkCloudconfigAppserviceEx(request, headers, runtime);
  }

  /**
   * Description: 查询是否已开通应用服务
   * Summary: 查询是否已开通应用服务
   */
  async checkCloudconfigAppserviceEx(request: CheckCloudconfigAppserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckCloudconfigAppserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckCloudconfigAppserviceResponse>(await this.doRequest("1.0", "antcloud.deps.cloudconfig.appservice.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckCloudconfigAppserviceResponse({}));
  }

  /**
   * Description: 查询是否已开通共享中间件
   * Summary: 查询是否已开通共享中间件
   */
  async checkCloudconfigSharedmw(request: CheckCloudconfigSharedmwRequest): Promise<CheckCloudconfigSharedmwResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkCloudconfigSharedmwEx(request, headers, runtime);
  }

  /**
   * Description: 查询是否已开通共享中间件
   * Summary: 查询是否已开通共享中间件
   */
  async checkCloudconfigSharedmwEx(request: CheckCloudconfigSharedmwRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckCloudconfigSharedmwResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckCloudconfigSharedmwResponse>(await this.doRequest("1.0", "antcloud.deps.cloudconfig.sharedmw.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckCloudconfigSharedmwResponse({}));
  }

  /**
   * Description: 查询是否使用 v1 发布策略
   * Summary: 查询是否使用 v1 发布策略
   */
  async checkCloudconfigVonerelease(request: CheckCloudconfigVonereleaseRequest): Promise<CheckCloudconfigVonereleaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkCloudconfigVonereleaseEx(request, headers, runtime);
  }

  /**
   * Description: 查询是否使用 v1 发布策略
   * Summary: 查询是否使用 v1 发布策略
   */
  async checkCloudconfigVonereleaseEx(request: CheckCloudconfigVonereleaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckCloudconfigVonereleaseResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckCloudconfigVonereleaseResponse>(await this.doRequest("1.0", "antcloud.deps.cloudconfig.vonerelease.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckCloudconfigVonereleaseResponse({}));
  }

  /**
   * Description: 查询是否使用 v1 应用运维策略
   * Summary: 查询是否使用 v1 应用运维策略
   */
  async checkCloudconfigVoneappops(request: CheckCloudconfigVoneappopsRequest): Promise<CheckCloudconfigVoneappopsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkCloudconfigVoneappopsEx(request, headers, runtime);
  }

  /**
   * Description: 查询是否使用 v1 应用运维策略
   * Summary: 查询是否使用 v1 应用运维策略
   */
  async checkCloudconfigVoneappopsEx(request: CheckCloudconfigVoneappopsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckCloudconfigVoneappopsResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckCloudconfigVoneappopsResponse>(await this.doRequest("1.0", "antcloud.deps.cloudconfig.voneappops.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckCloudconfigVoneappopsResponse({}));
  }

  /**
   * Description: 查询是否使用老版本界面
   * Summary: 查询是否使用老版本界面
   */
  async checkCloudconfigOldui(request: CheckCloudconfigOlduiRequest): Promise<CheckCloudconfigOlduiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkCloudconfigOlduiEx(request, headers, runtime);
  }

  /**
   * Description: 查询是否使用老版本界面
   * Summary: 查询是否使用老版本界面
   */
  async checkCloudconfigOlduiEx(request: CheckCloudconfigOlduiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckCloudconfigOlduiResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckCloudconfigOlduiResponse>(await this.doRequest("1.0", "antcloud.deps.cloudconfig.oldui.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckCloudconfigOlduiResponse({}));
  }

  /**
   * Description: 是否禁用 XDC LB
   * Summary: 是否禁用 XDC LB
   */
  async checkCloudconfigXdclbforbidden(request: CheckCloudconfigXdclbforbiddenRequest): Promise<CheckCloudconfigXdclbforbiddenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkCloudconfigXdclbforbiddenEx(request, headers, runtime);
  }

  /**
   * Description: 是否禁用 XDC LB
   * Summary: 是否禁用 XDC LB
   */
  async checkCloudconfigXdclbforbiddenEx(request: CheckCloudconfigXdclbforbiddenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckCloudconfigXdclbforbiddenResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckCloudconfigXdclbforbiddenResponse>(await this.doRequest("1.0", "antcloud.deps.cloudconfig.xdclbforbidden.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckCloudconfigXdclbforbiddenResponse({}));
  }

  /**
   * Description: 查询 openapi 配置信息
   * Summary: 查询 openapi 配置信息
   */
  async queryCloudconfigOpenapiconfig(request: QueryCloudconfigOpenapiconfigRequest): Promise<QueryCloudconfigOpenapiconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCloudconfigOpenapiconfigEx(request, headers, runtime);
  }

  /**
   * Description: 查询 openapi 配置信息
   * Summary: 查询 openapi 配置信息
   */
  async queryCloudconfigOpenapiconfigEx(request: QueryCloudconfigOpenapiconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCloudconfigOpenapiconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCloudconfigOpenapiconfigResponse>(await this.doRequest("1.0", "antcloud.deps.cloudconfig.openapiconfig.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCloudconfigOpenapiconfigResponse({}));
  }

  /**
   * Description: 查询应用包个数
   * Summary: 查询应用包个数
   */
  async countAppsPkg(request: CountAppsPkgRequest): Promise<CountAppsPkgResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.countAppsPkgEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用包个数
   * Summary: 查询应用包个数
   */
  async countAppsPkgEx(request: CountAppsPkgRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CountAppsPkgResponse> {
    Util.validateModel(request);
    return $tea.cast<CountAppsPkgResponse>(await this.doRequest("1.0", "antcloud.deps.apps.pkg.count", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CountAppsPkgResponse({}));
  }

  /**
   * Description: 查询app下的资源统计
   * Summary: 查询app下的资源统计
   */
  async queryAppUnitresources(request: QueryAppUnitresourcesRequest): Promise<QueryAppUnitresourcesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAppUnitresourcesEx(request, headers, runtime);
  }

  /**
   * Description: 查询app下的资源统计
   * Summary: 查询app下的资源统计
   */
  async queryAppUnitresourcesEx(request: QueryAppUnitresourcesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAppUnitresourcesResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAppUnitresourcesResponse>(await this.doRequest("1.0", "antcloud.deps.app.unitresources.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAppUnitresourcesResponse({}));
  }

  /**
   * Description: 查询认证 token
   * Summary: 查询认证 token
   */
  async queryOauthToken(request: QueryOauthTokenRequest): Promise<QueryOauthTokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryOauthTokenEx(request, headers, runtime);
  }

  /**
   * Description: 查询认证 token
   * Summary: 查询认证 token
   */
  async queryOauthTokenEx(request: QueryOauthTokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryOauthTokenResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryOauthTokenResponse>(await this.doRequest("1.0", "antcloud.deps.oauth.token.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryOauthTokenResponse({}));
  }

  /**
   * Description: 创建或更新 token
   * Summary: 创建或更新 token
   */
  async updateOauthToken(request: UpdateOauthTokenRequest): Promise<UpdateOauthTokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateOauthTokenEx(request, headers, runtime);
  }

  /**
   * Description: 创建或更新 token
   * Summary: 创建或更新 token
   */
  async updateOauthTokenEx(request: UpdateOauthTokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateOauthTokenResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateOauthTokenResponse>(await this.doRequest("1.0", "antcloud.deps.oauth.token.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateOauthTokenResponse({}));
  }

  /**
   * Description: 删除 token
   * Summary: 删除 token
   */
  async deleteOauthToken(request: DeleteOauthTokenRequest): Promise<DeleteOauthTokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteOauthTokenEx(request, headers, runtime);
  }

  /**
   * Description: 删除 token
   * Summary: 删除 token
   */
  async deleteOauthTokenEx(request: DeleteOauthTokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteOauthTokenResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteOauthTokenResponse>(await this.doRequest("1.0", "antcloud.deps.oauth.token.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteOauthTokenResponse({}));
  }

  /**
   * Description: 查询 DZ
   * Summary: 查询 DZ
   */
  async queryBaseinfoDeploymentzones(request: QueryBaseinfoDeploymentzonesRequest): Promise<QueryBaseinfoDeploymentzonesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBaseinfoDeploymentzonesEx(request, headers, runtime);
  }

  /**
   * Description: 查询 DZ
   * Summary: 查询 DZ
   */
  async queryBaseinfoDeploymentzonesEx(request: QueryBaseinfoDeploymentzonesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBaseinfoDeploymentzonesResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaseinfoDeploymentzonesResponse>(await this.doRequest("1.0", "antcloud.deps.baseinfo.deploymentzones.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBaseinfoDeploymentzonesResponse({}));
  }

  /**
   * Description: 获取蓝绿发布概览
   * Summary: 获取蓝绿发布概览
   */
  async getBgreleaseArrangement(request: GetBgreleaseArrangementRequest): Promise<GetBgreleaseArrangementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getBgreleaseArrangementEx(request, headers, runtime);
  }

  /**
   * Description: 获取蓝绿发布概览
   * Summary: 获取蓝绿发布概览
   */
  async getBgreleaseArrangementEx(request: GetBgreleaseArrangementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetBgreleaseArrangementResponse> {
    Util.validateModel(request);
    return $tea.cast<GetBgreleaseArrangementResponse>(await this.doRequest("1.0", "antcloud.deps.bgrelease.arrangement.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetBgreleaseArrangementResponse({}));
  }

  /**
   * Description: 查询蓝绿发布概览
   * Summary: 查询蓝绿发布概览
   */
  async queryBgreleaseArrangement(request: QueryBgreleaseArrangementRequest): Promise<QueryBgreleaseArrangementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBgreleaseArrangementEx(request, headers, runtime);
  }

  /**
   * Description: 查询蓝绿发布概览
   * Summary: 查询蓝绿发布概览
   */
  async queryBgreleaseArrangementEx(request: QueryBgreleaseArrangementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBgreleaseArrangementResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBgreleaseArrangementResponse>(await this.doRequest("1.0", "antcloud.deps.bgrelease.arrangement.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBgreleaseArrangementResponse({}));
  }

  /**
   * Description: 查询蓝绿发布进度
   * Summary: 查询蓝绿发布进度
   */
  async queryBgreleaseArrangementprogress(request: QueryBgreleaseArrangementprogressRequest): Promise<QueryBgreleaseArrangementprogressResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBgreleaseArrangementprogressEx(request, headers, runtime);
  }

  /**
   * Description: 查询蓝绿发布进度
   * Summary: 查询蓝绿发布进度
   */
  async queryBgreleaseArrangementprogressEx(request: QueryBgreleaseArrangementprogressRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBgreleaseArrangementprogressResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBgreleaseArrangementprogressResponse>(await this.doRequest("1.0", "antcloud.deps.bgrelease.arrangementprogress.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBgreleaseArrangementprogressResponse({}));
  }

  /**
   * Description: 查询蓝绿发布任务进度
   * Summary: 查询蓝绿发布任务进度
   */
  async queryBgreleaseTaskprogress(request: QueryBgreleaseTaskprogressRequest): Promise<QueryBgreleaseTaskprogressResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBgreleaseTaskprogressEx(request, headers, runtime);
  }

  /**
   * Description: 查询蓝绿发布任务进度
   * Summary: 查询蓝绿发布任务进度
   */
  async queryBgreleaseTaskprogressEx(request: QueryBgreleaseTaskprogressRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBgreleaseTaskprogressResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBgreleaseTaskprogressResponse>(await this.doRequest("1.0", "antcloud.deps.bgrelease.taskprogress.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBgreleaseTaskprogressResponse({}));
  }

  /**
   * Description: 执行蓝绿发布
   * Summary: 执行蓝绿发布
   */
  async execBgreleaseArrangement(request: ExecBgreleaseArrangementRequest): Promise<ExecBgreleaseArrangementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execBgreleaseArrangementEx(request, headers, runtime);
  }

  /**
   * Description: 执行蓝绿发布
   * Summary: 执行蓝绿发布
   */
  async execBgreleaseArrangementEx(request: ExecBgreleaseArrangementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecBgreleaseArrangementResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecBgreleaseArrangementResponse>(await this.doRequest("1.0", "antcloud.deps.bgrelease.arrangement.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecBgreleaseArrangementResponse({}));
  }

  /**
   * Description: 验证确认蓝绿发布
   * Summary: 验证确认蓝绿发布
   */
  async confirmBgreleaseArrangement(request: ConfirmBgreleaseArrangementRequest): Promise<ConfirmBgreleaseArrangementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmBgreleaseArrangementEx(request, headers, runtime);
  }

  /**
   * Description: 验证确认蓝绿发布
   * Summary: 验证确认蓝绿发布
   */
  async confirmBgreleaseArrangementEx(request: ConfirmBgreleaseArrangementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmBgreleaseArrangementResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmBgreleaseArrangementResponse>(await this.doRequest("1.0", "antcloud.deps.bgrelease.arrangement.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmBgreleaseArrangementResponse({}));
  }

  /**
   * Description: 蓝绿验证确认
   * Summary: 蓝绿验证确认
   */
  async confirmBgreleaseArrangementvalidation(request: ConfirmBgreleaseArrangementvalidationRequest): Promise<ConfirmBgreleaseArrangementvalidationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmBgreleaseArrangementvalidationEx(request, headers, runtime);
  }

  /**
   * Description: 蓝绿验证确认
   * Summary: 蓝绿验证确认
   */
  async confirmBgreleaseArrangementvalidationEx(request: ConfirmBgreleaseArrangementvalidationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmBgreleaseArrangementvalidationResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmBgreleaseArrangementvalidationResponse>(await this.doRequest("1.0", "antcloud.deps.bgrelease.arrangementvalidation.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmBgreleaseArrangementvalidationResponse({}));
  }

  /**
   * Description: 重试蓝绿发布
   * Summary: 重试蓝绿发布
   */
  async retryBgreleaseArrangement(request: RetryBgreleaseArrangementRequest): Promise<RetryBgreleaseArrangementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryBgreleaseArrangementEx(request, headers, runtime);
  }

  /**
   * Description: 重试蓝绿发布
   * Summary: 重试蓝绿发布
   */
  async retryBgreleaseArrangementEx(request: RetryBgreleaseArrangementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryBgreleaseArrangementResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryBgreleaseArrangementResponse>(await this.doRequest("1.0", "antcloud.deps.bgrelease.arrangement.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryBgreleaseArrangementResponse({}));
  }

  /**
   * Description: 重试蓝绿发布任务
   * Summary: 重试蓝绿发布任务
   */
  async retryBgreleaseTask(request: RetryBgreleaseTaskRequest): Promise<RetryBgreleaseTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryBgreleaseTaskEx(request, headers, runtime);
  }

  /**
   * Description: 重试蓝绿发布任务
   * Summary: 重试蓝绿发布任务
   */
  async retryBgreleaseTaskEx(request: RetryBgreleaseTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryBgreleaseTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryBgreleaseTaskResponse>(await this.doRequest("1.0", "antcloud.deps.bgrelease.task.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryBgreleaseTaskResponse({}));
  }

  /**
   * Description: 跳过蓝绿发布任务
   * Summary: 跳过蓝绿发布任务
   */
  async skipBgreleaseTask(request: SkipBgreleaseTaskRequest): Promise<SkipBgreleaseTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.skipBgreleaseTaskEx(request, headers, runtime);
  }

  /**
   * Description: 跳过蓝绿发布任务
   * Summary: 跳过蓝绿发布任务
   */
  async skipBgreleaseTaskEx(request: SkipBgreleaseTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SkipBgreleaseTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<SkipBgreleaseTaskResponse>(await this.doRequest("1.0", "antcloud.deps.bgrelease.task.skip", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SkipBgreleaseTaskResponse({}));
  }

  /**
   * Description: 跳过蓝绿发布
   * Summary: 跳过蓝绿发布
   */
  async skipBgreleaseArrangement(request: SkipBgreleaseArrangementRequest): Promise<SkipBgreleaseArrangementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.skipBgreleaseArrangementEx(request, headers, runtime);
  }

  /**
   * Description: 跳过蓝绿发布
   * Summary: 跳过蓝绿发布
   */
  async skipBgreleaseArrangementEx(request: SkipBgreleaseArrangementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SkipBgreleaseArrangementResponse> {
    Util.validateModel(request);
    return $tea.cast<SkipBgreleaseArrangementResponse>(await this.doRequest("1.0", "antcloud.deps.bgrelease.arrangement.skip", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SkipBgreleaseArrangementResponse({}));
  }

  /**
   * Description: 取消蓝绿发布
   * Summary: 取消蓝绿发布
   */
  async cancelBgreleaseArrangement(request: CancelBgreleaseArrangementRequest): Promise<CancelBgreleaseArrangementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelBgreleaseArrangementEx(request, headers, runtime);
  }

  /**
   * Description: 取消蓝绿发布
   * Summary: 取消蓝绿发布
   */
  async cancelBgreleaseArrangementEx(request: CancelBgreleaseArrangementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelBgreleaseArrangementResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelBgreleaseArrangementResponse>(await this.doRequest("1.0", "antcloud.deps.bgrelease.arrangement.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelBgreleaseArrangementResponse({}));
  }

  /**
   * Description: 回滚蓝绿发布
   * Summary: 回滚蓝绿发布
   */
  async rollbackBgreleaseArrangement(request: RollbackBgreleaseArrangementRequest): Promise<RollbackBgreleaseArrangementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.rollbackBgreleaseArrangementEx(request, headers, runtime);
  }

  /**
   * Description: 回滚蓝绿发布
   * Summary: 回滚蓝绿发布
   */
  async rollbackBgreleaseArrangementEx(request: RollbackBgreleaseArrangementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RollbackBgreleaseArrangementResponse> {
    Util.validateModel(request);
    return $tea.cast<RollbackBgreleaseArrangementResponse>(await this.doRequest("1.0", "antcloud.deps.bgrelease.arrangement.rollback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RollbackBgreleaseArrangementResponse({}));
  }

  /**
   * Description: 蓝绿发布回滚重试
   * Summary: 蓝绿发布回滚重试
   */
  async retryrollbackBgreleaseArrangement(request: RetryrollbackBgreleaseArrangementRequest): Promise<RetryrollbackBgreleaseArrangementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryrollbackBgreleaseArrangementEx(request, headers, runtime);
  }

  /**
   * Description: 蓝绿发布回滚重试
   * Summary: 蓝绿发布回滚重试
   */
  async retryrollbackBgreleaseArrangementEx(request: RetryrollbackBgreleaseArrangementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryrollbackBgreleaseArrangementResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryrollbackBgreleaseArrangementResponse>(await this.doRequest("1.0", "antcloud.deps.bgrelease.arrangement.retryrollback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryrollbackBgreleaseArrangementResponse({}));
  }

  /**
   * Description: 蓝绿发布回滚确认
   * Summary: 蓝绿发布回滚确认
   */
  async confirmrollbackBgreleaseArrangement(request: ConfirmrollbackBgreleaseArrangementRequest): Promise<ConfirmrollbackBgreleaseArrangementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmrollbackBgreleaseArrangementEx(request, headers, runtime);
  }

  /**
   * Description: 蓝绿发布回滚确认
   * Summary: 蓝绿发布回滚确认
   */
  async confirmrollbackBgreleaseArrangementEx(request: ConfirmrollbackBgreleaseArrangementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmrollbackBgreleaseArrangementResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmrollbackBgreleaseArrangementResponse>(await this.doRequest("1.0", "antcloud.deps.bgrelease.arrangement.confirmrollback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmrollbackBgreleaseArrangementResponse({}));
  }

  /**
   * Description: 蓝绿发布灰度流量迁移
   * Summary: 蓝绿发布灰度流量迁移
   */
  async switchBgreleaseGraytraffic(request: SwitchBgreleaseGraytrafficRequest): Promise<SwitchBgreleaseGraytrafficResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.switchBgreleaseGraytrafficEx(request, headers, runtime);
  }

  /**
   * Description: 蓝绿发布灰度流量迁移
   * Summary: 蓝绿发布灰度流量迁移
   */
  async switchBgreleaseGraytrafficEx(request: SwitchBgreleaseGraytrafficRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SwitchBgreleaseGraytrafficResponse> {
    Util.validateModel(request);
    return $tea.cast<SwitchBgreleaseGraytrafficResponse>(await this.doRequest("1.0", "antcloud.deps.bgrelease.graytraffic.switch", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SwitchBgreleaseGraytrafficResponse({}));
  }

  /**
   * Description: 蓝绿发布灰度流量回滚
   * Summary: 蓝绿发布灰度流量回滚
   */
  async rollbackBgreleaseGraytraffic(request: RollbackBgreleaseGraytrafficRequest): Promise<RollbackBgreleaseGraytrafficResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.rollbackBgreleaseGraytrafficEx(request, headers, runtime);
  }

  /**
   * Description: 蓝绿发布灰度流量回滚
   * Summary: 蓝绿发布灰度流量回滚
   */
  async rollbackBgreleaseGraytrafficEx(request: RollbackBgreleaseGraytrafficRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RollbackBgreleaseGraytrafficResponse> {
    Util.validateModel(request);
    return $tea.cast<RollbackBgreleaseGraytrafficResponse>(await this.doRequest("1.0", "antcloud.deps.bgrelease.graytraffic.rollback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RollbackBgreleaseGraytrafficResponse({}));
  }

  /**
   * Description: 查询灰度引流进度
   * Summary: 查询灰度引流进度
   */
  async queryBgreleaseGrayprogress(request: QueryBgreleaseGrayprogressRequest): Promise<QueryBgreleaseGrayprogressResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBgreleaseGrayprogressEx(request, headers, runtime);
  }

  /**
   * Description: 查询灰度引流进度
   * Summary: 查询灰度引流进度
   */
  async queryBgreleaseGrayprogressEx(request: QueryBgreleaseGrayprogressRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBgreleaseGrayprogressResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBgreleaseGrayprogressResponse>(await this.doRequest("1.0", "antcloud.deps.bgrelease.grayprogress.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBgreleaseGrayprogressResponse({}));
  }

  /**
   * Description: 获取灰度引流进度
   * Summary: 获取灰度引流进度
   */
  async getGrayProcess(request: GetGrayProcessRequest): Promise<GetGrayProcessResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getGrayProcessEx(request, headers, runtime);
  }

  /**
   * Description: 获取灰度引流进度
   * Summary: 获取灰度引流进度
   */
  async getGrayProcessEx(request: GetGrayProcessRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetGrayProcessResponse> {
    Util.validateModel(request);
    return $tea.cast<GetGrayProcessResponse>(await this.doRequest("1.0", "antcloud.deps.gray.process.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetGrayProcessResponse({}));
  }

  /**
   * Description: 查询灰度引流进度
   * Summary: 查询灰度引流进度
   */
  async queryGrayProgress(request: QueryGrayProgressRequest): Promise<QueryGrayProgressResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGrayProgressEx(request, headers, runtime);
  }

  /**
   * Description: 查询灰度引流进度
   * Summary: 查询灰度引流进度
   */
  async queryGrayProgressEx(request: QueryGrayProgressRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGrayProgressResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGrayProgressResponse>(await this.doRequest("1.0", "antcloud.deps.gray.progress.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGrayProgressResponse({}));
  }

  /**
   * Description: 重新初始化灰度发布
   * Summary: 重新初始化灰度发布
   */
  async reinitGrayProcess(request: ReinitGrayProcessRequest): Promise<ReinitGrayProcessResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.reinitGrayProcessEx(request, headers, runtime);
  }

  /**
   * Description: 重新初始化灰度发布
   * Summary: 重新初始化灰度发布
   */
  async reinitGrayProcessEx(request: ReinitGrayProcessRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReinitGrayProcessResponse> {
    Util.validateModel(request);
    return $tea.cast<ReinitGrayProcessResponse>(await this.doRequest("1.0", "antcloud.deps.gray.process.reinit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReinitGrayProcessResponse({}));
  }

  /**
   * Description: 重试灰度发布子任务
   * Summary: 重试灰度发布子任务
   */
  async retryGrayTask(request: RetryGrayTaskRequest): Promise<RetryGrayTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryGrayTaskEx(request, headers, runtime);
  }

  /**
   * Description: 重试灰度发布子任务
   * Summary: 重试灰度发布子任务
   */
  async retryGrayTaskEx(request: RetryGrayTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryGrayTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryGrayTaskResponse>(await this.doRequest("1.0", "antcloud.deps.gray.task.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryGrayTaskResponse({}));
  }

  /**
   * Description: 跳过灰度发布子任务
   * Summary: 跳过灰度发布子任务
   */
  async skipGrayTask(request: SkipGrayTaskRequest): Promise<SkipGrayTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.skipGrayTaskEx(request, headers, runtime);
  }

  /**
   * Description: 跳过灰度发布子任务
   * Summary: 跳过灰度发布子任务
   */
  async skipGrayTaskEx(request: SkipGrayTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SkipGrayTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<SkipGrayTaskResponse>(await this.doRequest("1.0", "antcloud.deps.gray.task.skip", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SkipGrayTaskResponse({}));
  }

  /**
   * Description: 查询发布机器信息
   * Summary: 查询发布机器信息
   */
  async queryMachine(request: QueryMachineRequest): Promise<QueryMachineResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMachineEx(request, headers, runtime);
  }

  /**
   * Description: 查询发布机器信息
   * Summary: 查询发布机器信息
   */
  async queryMachineEx(request: QueryMachineRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMachineResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMachineResponse>(await this.doRequest("1.0", "antcloud.deps.machine.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMachineResponse({}));
  }

  /**
   * Description: 获取发布机器信息
   * Summary: 获取发布机器信息
   */
  async getMachine(request: GetMachineRequest): Promise<GetMachineResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getMachineEx(request, headers, runtime);
  }

  /**
   * Description: 获取发布机器信息
   * Summary: 获取发布机器信息
   */
  async getMachineEx(request: GetMachineRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetMachineResponse> {
    Util.validateModel(request);
    return $tea.cast<GetMachineResponse>(await this.doRequest("1.0", "antcloud.deps.machine.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetMachineResponse({}));
  }

  /**
   * Description: 查询机器发布进度
   * Summary: 查询机器发布进度
   */
  async queryMachineProgress(request: QueryMachineProgressRequest): Promise<QueryMachineProgressResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMachineProgressEx(request, headers, runtime);
  }

  /**
   * Description: 查询机器发布进度
   * Summary: 查询机器发布进度
   */
  async queryMachineProgressEx(request: QueryMachineProgressRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMachineProgressResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMachineProgressResponse>(await this.doRequest("1.0", "antcloud.deps.machine.progress.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMachineProgressResponse({}));
  }

  /**
   * Description: 重试发布机器
   * Summary: 重试发布机器
   */
  async retryMachine(request: RetryMachineRequest): Promise<RetryMachineResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryMachineEx(request, headers, runtime);
  }

  /**
   * Description: 重试发布机器
   * Summary: 重试发布机器
   */
  async retryMachineEx(request: RetryMachineRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryMachineResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryMachineResponse>(await this.doRequest("1.0", "antcloud.deps.machine.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryMachineResponse({}));
  }

  /**
   * Description: 忽略机器发布
   * Summary: 忽略机器发布
   */
  async skipMachine(request: SkipMachineRequest): Promise<SkipMachineResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.skipMachineEx(request, headers, runtime);
  }

  /**
   * Description: 忽略机器发布
   * Summary: 忽略机器发布
   */
  async skipMachineEx(request: SkipMachineRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SkipMachineResponse> {
    Util.validateModel(request);
    return $tea.cast<SkipMachineResponse>(await this.doRequest("1.0", "antcloud.deps.machine.skip", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SkipMachineResponse({}));
  }

  /**
   * Description: 取消机器发布
   * Summary: 取消机器发布
   */
  async cancelMachine(request: CancelMachineRequest): Promise<CancelMachineResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelMachineEx(request, headers, runtime);
  }

  /**
   * Description: 取消机器发布
   * Summary: 取消机器发布
   */
  async cancelMachineEx(request: CancelMachineRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelMachineResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelMachineResponse>(await this.doRequest("1.0", "antcloud.deps.machine.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelMachineResponse({}));
  }

  /**
   * Description: 触发执行机器发布
   * Summary: 触发执行机器发布
   */
  async execMachine(request: ExecMachineRequest): Promise<ExecMachineResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execMachineEx(request, headers, runtime);
  }

  /**
   * Description: 触发执行机器发布
   * Summary: 触发执行机器发布
   */
  async execMachineEx(request: ExecMachineRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecMachineResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecMachineResponse>(await this.doRequest("1.0", "antcloud.deps.machine.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecMachineResponse({}));
  }

  /**
   * Description: 查询机器分组发布进度
   * Summary: 查询机器分组发布进度
   */
  async queryMachinegroupProgress(request: QueryMachinegroupProgressRequest): Promise<QueryMachinegroupProgressResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMachinegroupProgressEx(request, headers, runtime);
  }

  /**
   * Description: 查询机器分组发布进度
   * Summary: 查询机器分组发布进度
   */
  async queryMachinegroupProgressEx(request: QueryMachinegroupProgressRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMachinegroupProgressResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMachinegroupProgressResponse>(await this.doRequest("1.0", "antcloud.deps.machinegroup.progress.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMachinegroupProgressResponse({}));
  }

  /**
   * Description: 重试机器分组
   * Summary: 重试机器分组
   */
  async retryMachinegroup(request: RetryMachinegroupRequest): Promise<RetryMachinegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryMachinegroupEx(request, headers, runtime);
  }

  /**
   * Description: 重试机器分组
   * Summary: 重试机器分组
   */
  async retryMachinegroupEx(request: RetryMachinegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryMachinegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryMachinegroupResponse>(await this.doRequest("1.0", "antcloud.deps.machinegroup.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryMachinegroupResponse({}));
  }

  /**
   * Description: 忽略分组
   * Summary: 忽略分组
   */
  async skipMachinegroup(request: SkipMachinegroupRequest): Promise<SkipMachinegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.skipMachinegroupEx(request, headers, runtime);
  }

  /**
   * Description: 忽略分组
   * Summary: 忽略分组
   */
  async skipMachinegroupEx(request: SkipMachinegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SkipMachinegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<SkipMachinegroupResponse>(await this.doRequest("1.0", "antcloud.deps.machinegroup.skip", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SkipMachinegroupResponse({}));
  }

  /**
   * Description: 分组取消
   * Summary: 分组取消
   */
  async cancelMachinegroup(request: CancelMachinegroupRequest): Promise<CancelMachinegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelMachinegroupEx(request, headers, runtime);
  }

  /**
   * Description: 分组取消
   * Summary: 分组取消
   */
  async cancelMachinegroupEx(request: CancelMachinegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelMachinegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelMachinegroupResponse>(await this.doRequest("1.0", "antcloud.deps.machinegroup.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelMachinegroupResponse({}));
  }

  /**
   * Description: 分组删除
   * Summary: 分组删除
   */
  async deleteMachinegroup(request: DeleteMachinegroupRequest): Promise<DeleteMachinegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteMachinegroupEx(request, headers, runtime);
  }

  /**
   * Description: 分组删除
   * Summary: 分组删除
   */
  async deleteMachinegroupEx(request: DeleteMachinegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteMachinegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteMachinegroupResponse>(await this.doRequest("1.0", "antcloud.deps.machinegroup.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteMachinegroupResponse({}));
  }

  /**
   * Description: 更新分组
   * Summary: 更新分组
   */
  async updateMachinegroup(request: UpdateMachinegroupRequest): Promise<UpdateMachinegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateMachinegroupEx(request, headers, runtime);
  }

  /**
   * Description: 更新分组
   * Summary: 更新分组
   */
  async updateMachinegroupEx(request: UpdateMachinegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateMachinegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateMachinegroupResponse>(await this.doRequest("1.0", "antcloud.deps.machinegroup.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateMachinegroupResponse({}));
  }

  /**
   * Description: 机器分组确认
   * Summary: 机器分组确认
   */
  async confirmMachinegroup(request: ConfirmMachinegroupRequest): Promise<ConfirmMachinegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmMachinegroupEx(request, headers, runtime);
  }

  /**
   * Description: 机器分组确认
   * Summary: 机器分组确认
   */
  async confirmMachinegroupEx(request: ConfirmMachinegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmMachinegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmMachinegroupResponse>(await this.doRequest("1.0", "antcloud.deps.machinegroup.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmMachinegroupResponse({}));
  }

  /**
   * Description: 机器分组进度批量查询
   * Summary: 机器分组进度批量查询
   */
  async batchqueryMachinegroupProgress(request: BatchqueryMachinegroupProgressRequest): Promise<BatchqueryMachinegroupProgressResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryMachinegroupProgressEx(request, headers, runtime);
  }

  /**
   * Description: 机器分组进度批量查询
   * Summary: 机器分组进度批量查询
   */
  async batchqueryMachinegroupProgressEx(request: BatchqueryMachinegroupProgressRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryMachinegroupProgressResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryMachinegroupProgressResponse>(await this.doRequest("1.0", "antcloud.deps.machinegroup.progress.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryMachinegroupProgressResponse({}));
  }

  /**
   * Description: 分区预确认
   * Summary: 分区预确认
   */
  async confirmMachinegroupReserve(request: ConfirmMachinegroupReserveRequest): Promise<ConfirmMachinegroupReserveResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmMachinegroupReserveEx(request, headers, runtime);
  }

  /**
   * Description: 分区预确认
   * Summary: 分区预确认
   */
  async confirmMachinegroupReserveEx(request: ConfirmMachinegroupReserveRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmMachinegroupReserveResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmMachinegroupReserveResponse>(await this.doRequest("1.0", "antcloud.deps.machinegroup.reserve.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmMachinegroupReserveResponse({}));
  }

  /**
   * Description: 修改分组 SLB 权重
   * Summary: 修改分组 SLB 权重
   */
  async updateMachinegroupSlbmountweight(request: UpdateMachinegroupSlbmountweightRequest): Promise<UpdateMachinegroupSlbmountweightResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateMachinegroupSlbmountweightEx(request, headers, runtime);
  }

  /**
   * Description: 修改分组 SLB 权重
   * Summary: 修改分组 SLB 权重
   */
  async updateMachinegroupSlbmountweightEx(request: UpdateMachinegroupSlbmountweightRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateMachinegroupSlbmountweightResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateMachinegroupSlbmountweightResponse>(await this.doRequest("1.0", "antcloud.deps.machinegroup.slbmountweight.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateMachinegroupSlbmountweightResponse({}));
  }

  /**
   * Description: 查询分组 SLB 挂载进度
   * Summary: 查询分组 SLB 挂载进度
   */
  async queryMachinegroupSlbmountprogress(request: QueryMachinegroupSlbmountprogressRequest): Promise<QueryMachinegroupSlbmountprogressResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMachinegroupSlbmountprogressEx(request, headers, runtime);
  }

  /**
   * Description: 查询分组 SLB 挂载进度
   * Summary: 查询分组 SLB 挂载进度
   */
  async queryMachinegroupSlbmountprogressEx(request: QueryMachinegroupSlbmountprogressRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMachinegroupSlbmountprogressResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMachinegroupSlbmountprogressResponse>(await this.doRequest("1.0", "antcloud.deps.machinegroup.slbmountprogress.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMachinegroupSlbmountprogressResponse({}));
  }

  /**
   * Description: 查询 slb 挂载状态
   * Summary: 查询 slb 挂载状态
   */
  async queryMachinegroupSlbmount(request: QueryMachinegroupSlbmountRequest): Promise<QueryMachinegroupSlbmountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMachinegroupSlbmountEx(request, headers, runtime);
  }

  /**
   * Description: 查询 slb 挂载状态
   * Summary: 查询 slb 挂载状态
   */
  async queryMachinegroupSlbmountEx(request: QueryMachinegroupSlbmountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMachinegroupSlbmountResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMachinegroupSlbmountResponse>(await this.doRequest("1.0", "antcloud.deps.machinegroup.slbmount.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMachinegroupSlbmountResponse({}));
  }

  /**
   * Description: 获取分组信息
   * Summary: 获取分组信息
   */
  async getMachinegroup(request: GetMachinegroupRequest): Promise<GetMachinegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getMachinegroupEx(request, headers, runtime);
  }

  /**
   * Description: 获取分组信息
   * Summary: 获取分组信息
   */
  async getMachinegroupEx(request: GetMachinegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetMachinegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<GetMachinegroupResponse>(await this.doRequest("1.0", "antcloud.deps.machinegroup.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetMachinegroupResponse({}));
  }

  /**
   * Description: 忽略分组任务
   * Summary: 忽略分组任务
   */
  async skipMachinetask(request: SkipMachinetaskRequest): Promise<SkipMachinetaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.skipMachinetaskEx(request, headers, runtime);
  }

  /**
   * Description: 忽略分组任务
   * Summary: 忽略分组任务
   */
  async skipMachinetaskEx(request: SkipMachinetaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SkipMachinetaskResponse> {
    Util.validateModel(request);
    return $tea.cast<SkipMachinetaskResponse>(await this.doRequest("1.0", "antcloud.deps.machinetask.skip", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SkipMachinetaskResponse({}));
  }

  /**
   * Description: 机器任务重试
   * Summary: 机器任务重试
   */
  async retryMachinetask(request: RetryMachinetaskRequest): Promise<RetryMachinetaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryMachinetaskEx(request, headers, runtime);
  }

  /**
   * Description: 机器任务重试
   * Summary: 机器任务重试
   */
  async retryMachinetaskEx(request: RetryMachinetaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryMachinetaskResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryMachinetaskResponse>(await this.doRequest("1.0", "antcloud.deps.machinetask.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryMachinetaskResponse({}));
  }

  /**
   * Description: 查询部署单元
   * Summary: 查询部署单元
   */
  async queryMetaCell(request: QueryMetaCellRequest): Promise<QueryMetaCellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMetaCellEx(request, headers, runtime);
  }

  /**
   * Description: 查询部署单元
   * Summary: 查询部署单元
   */
  async queryMetaCellEx(request: QueryMetaCellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMetaCellResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMetaCellResponse>(await this.doRequest("1.0", "antcloud.deps.meta.cell.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMetaCellResponse({}));
  }

  /**
   * Description: 创建 deployment cell
   * Summary: 创建 deployment cell
   */
  async createMetaDeploymentcell(request: CreateMetaDeploymentcellRequest): Promise<CreateMetaDeploymentcellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createMetaDeploymentcellEx(request, headers, runtime);
  }

  /**
   * Description: 创建 deployment cell
   * Summary: 创建 deployment cell
   */
  async createMetaDeploymentcellEx(request: CreateMetaDeploymentcellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateMetaDeploymentcellResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateMetaDeploymentcellResponse>(await this.doRequest("1.0", "antcloud.deps.meta.deploymentcell.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateMetaDeploymentcellResponse({}));
  }

  /**
   * Description: 更新 deployment zone
   * Summary: 更新 deployment zone
   */
  async updateMetaDeploymentcell(request: UpdateMetaDeploymentcellRequest): Promise<UpdateMetaDeploymentcellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateMetaDeploymentcellEx(request, headers, runtime);
  }

  /**
   * Description: 更新 deployment zone
   * Summary: 更新 deployment zone
   */
  async updateMetaDeploymentcellEx(request: UpdateMetaDeploymentcellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateMetaDeploymentcellResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateMetaDeploymentcellResponse>(await this.doRequest("1.0", "antcloud.deps.meta.deploymentcell.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateMetaDeploymentcellResponse({}));
  }

  /**
   * Description: 获取 deployment cell
   * Summary: 获取 deployment cell
   */
  async getMetaDeploymentcell(request: GetMetaDeploymentcellRequest): Promise<GetMetaDeploymentcellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getMetaDeploymentcellEx(request, headers, runtime);
  }

  /**
   * Description: 获取 deployment cell
   * Summary: 获取 deployment cell
   */
  async getMetaDeploymentcellEx(request: GetMetaDeploymentcellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetMetaDeploymentcellResponse> {
    Util.validateModel(request);
    return $tea.cast<GetMetaDeploymentcellResponse>(await this.doRequest("1.0", "antcloud.deps.meta.deploymentcell.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetMetaDeploymentcellResponse({}));
  }

  /**
   * Description: 批量获取 deployment cell
   * Summary: 批量获取 deployment cell
   */
  async queryMetaDeploymentcell(request: QueryMetaDeploymentcellRequest): Promise<QueryMetaDeploymentcellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMetaDeploymentcellEx(request, headers, runtime);
  }

  /**
   * Description: 批量获取 deployment cell
   * Summary: 批量获取 deployment cell
   */
  async queryMetaDeploymentcellEx(request: QueryMetaDeploymentcellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMetaDeploymentcellResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMetaDeploymentcellResponse>(await this.doRequest("1.0", "antcloud.deps.meta.deploymentcell.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMetaDeploymentcellResponse({}));
  }

  /**
   * Description: 创建通知配置
   * Summary: 创建通知配置
   */
  async createNotificationConfig(request: CreateNotificationConfigRequest): Promise<CreateNotificationConfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createNotificationConfigEx(request, headers, runtime);
  }

  /**
   * Description: 创建通知配置
   * Summary: 创建通知配置
   */
  async createNotificationConfigEx(request: CreateNotificationConfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateNotificationConfigResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateNotificationConfigResponse>(await this.doRequest("1.0", "antcloud.deps.notification.config.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateNotificationConfigResponse({}));
  }

  /**
   * Description: 更新通知配置
   * Summary: 更新通知配置
   */
  async updateNotificationConfig(request: UpdateNotificationConfigRequest): Promise<UpdateNotificationConfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateNotificationConfigEx(request, headers, runtime);
  }

  /**
   * Description: 更新通知配置
   * Summary: 更新通知配置
   */
  async updateNotificationConfigEx(request: UpdateNotificationConfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateNotificationConfigResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateNotificationConfigResponse>(await this.doRequest("1.0", "antcloud.deps.notification.config.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateNotificationConfigResponse({}));
  }

  /**
   * Description: 查询通知配置
   * Summary: 查询通知配置
   */
  async queryNotificationConfig(request: QueryNotificationConfigRequest): Promise<QueryNotificationConfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryNotificationConfigEx(request, headers, runtime);
  }

  /**
   * Description: 查询通知配置
   * Summary: 查询通知配置
   */
  async queryNotificationConfigEx(request: QueryNotificationConfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryNotificationConfigResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryNotificationConfigResponse>(await this.doRequest("1.0", "antcloud.deps.notification.config.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryNotificationConfigResponse({}));
  }

  /**
   * Description: 删除通知配置
   * Summary: 删除通知配置
   */
  async deleteNotificationConfig(request: DeleteNotificationConfigRequest): Promise<DeleteNotificationConfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteNotificationConfigEx(request, headers, runtime);
  }

  /**
   * Description: 删除通知配置
   * Summary: 删除通知配置
   */
  async deleteNotificationConfigEx(request: DeleteNotificationConfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteNotificationConfigResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteNotificationConfigResponse>(await this.doRequest("1.0", "antcloud.deps.notification.config.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteNotificationConfigResponse({}));
  }

  /**
   * Description: 查询用户信息
   * Summary: 查询用户信息
   */
  async queryOperator(request: QueryOperatorRequest): Promise<QueryOperatorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryOperatorEx(request, headers, runtime);
  }

  /**
   * Description: 查询用户信息
   * Summary: 查询用户信息
   */
  async queryOperatorEx(request: QueryOperatorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryOperatorResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryOperatorResponse>(await this.doRequest("1.0", "antcloud.deps.operator.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryOperatorResponse({}));
  }

  /**
   * Description: 回滚
   * Summary: 回滚
   */
  async rollbackPlanService(request: RollbackPlanServiceRequest): Promise<RollbackPlanServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.rollbackPlanServiceEx(request, headers, runtime);
  }

  /**
   * Description: 回滚
   * Summary: 回滚
   */
  async rollbackPlanServiceEx(request: RollbackPlanServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RollbackPlanServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<RollbackPlanServiceResponse>(await this.doRequest("1.0", "antcloud.deps.plan.service.rollback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RollbackPlanServiceResponse({}));
  }

  /**
   * Description: 创建发布单
   * Summary: 创建发布单
   */
  async createPlan(request: CreatePlanRequest): Promise<CreatePlanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createPlanEx(request, headers, runtime);
  }

  /**
   * Description: 创建发布单
   * Summary: 创建发布单
   */
  async createPlanEx(request: CreatePlanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreatePlanResponse> {
    Util.validateModel(request);
    return $tea.cast<CreatePlanResponse>(await this.doRequest("1.0", "antcloud.deps.plan.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreatePlanResponse({}));
  }

  /**
   * Description: 发布单校验
   * Summary: 发布单校验
   */
  async checkPlan(request: CheckPlanRequest): Promise<CheckPlanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkPlanEx(request, headers, runtime);
  }

  /**
   * Description: 发布单校验
   * Summary: 发布单校验
   */
  async checkPlanEx(request: CheckPlanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckPlanResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckPlanResponse>(await this.doRequest("1.0", "antcloud.deps.plan.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckPlanResponse({}));
  }

  /**
   * Description: 校验运维单请求
   * Summary: 校验运维单请求
   */
  async checkPlanOperation(request: CheckPlanOperationRequest): Promise<CheckPlanOperationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkPlanOperationEx(request, headers, runtime);
  }

  /**
   * Description: 校验运维单请求
   * Summary: 校验运维单请求
   */
  async checkPlanOperationEx(request: CheckPlanOperationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckPlanOperationResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckPlanOperationResponse>(await this.doRequest("1.0", "antcloud.deps.plan.operation.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckPlanOperationResponse({}));
  }

  /**
   * Description: 创建运维单
   * Summary: 创建运维单
   */
  async createPlanOperation(request: CreatePlanOperationRequest): Promise<CreatePlanOperationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createPlanOperationEx(request, headers, runtime);
  }

  /**
   * Description: 创建运维单
   * Summary: 创建运维单
   */
  async createPlanOperationEx(request: CreatePlanOperationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreatePlanOperationResponse> {
    Util.validateModel(request);
    return $tea.cast<CreatePlanOperationResponse>(await this.doRequest("1.0", "antcloud.deps.plan.operation.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreatePlanOperationResponse({}));
  }

  /**
   * Description: 创建发布单
   * Summary: 创建发布单
   */
  async createPlanAdvanced(request: CreatePlanAdvancedRequest): Promise<CreatePlanAdvancedResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createPlanAdvancedEx(request, headers, runtime);
  }

  /**
   * Description: 创建发布单
   * Summary: 创建发布单
   */
  async createPlanAdvancedEx(request: CreatePlanAdvancedRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreatePlanAdvancedResponse> {
    Util.validateModel(request);
    return $tea.cast<CreatePlanAdvancedResponse>(await this.doRequest("1.0", "antcloud.deps.plan.advanced.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreatePlanAdvancedResponse({}));
  }

  /**
   * Description: 重新初始化发布单
   * Summary: 重新初始化发布单
   */
  async reinitPlan(request: ReinitPlanRequest): Promise<ReinitPlanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.reinitPlanEx(request, headers, runtime);
  }

  /**
   * Description: 重新初始化发布单
   * Summary: 重新初始化发布单
   */
  async reinitPlanEx(request: ReinitPlanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReinitPlanResponse> {
    Util.validateModel(request);
    return $tea.cast<ReinitPlanResponse>(await this.doRequest("1.0", "antcloud.deps.plan.reinit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReinitPlanResponse({}));
  }

  /**
   * Description: 获取发布单信息
   * Summary: 获取发布单信息
   */
  async getPlan(request: GetPlanRequest): Promise<GetPlanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getPlanEx(request, headers, runtime);
  }

  /**
   * Description: 获取发布单信息
   * Summary: 获取发布单信息
   */
  async getPlanEx(request: GetPlanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetPlanResponse> {
    Util.validateModel(request);
    return $tea.cast<GetPlanResponse>(await this.doRequest("1.0", "antcloud.deps.plan.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetPlanResponse({}));
  }

  /**
   * Description: 获取发布单基本信息
   * Summary: 获取发布单基本信息
   */
  async getPlanBasic(request: GetPlanBasicRequest): Promise<GetPlanBasicResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getPlanBasicEx(request, headers, runtime);
  }

  /**
   * Description: 获取发布单基本信息
   * Summary: 获取发布单基本信息
   */
  async getPlanBasicEx(request: GetPlanBasicRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetPlanBasicResponse> {
    Util.validateModel(request);
    return $tea.cast<GetPlanBasicResponse>(await this.doRequest("1.0", "antcloud.deps.plan.basic.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetPlanBasicResponse({}));
  }

  /**
   * Description: 获取发布进度
   * Summary: 获取发布进度
   */
  async getPlanProgress(request: GetPlanProgressRequest): Promise<GetPlanProgressResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getPlanProgressEx(request, headers, runtime);
  }

  /**
   * Description: 获取发布进度
   * Summary: 获取发布进度
   */
  async getPlanProgressEx(request: GetPlanProgressRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetPlanProgressResponse> {
    Util.validateModel(request);
    return $tea.cast<GetPlanProgressResponse>(await this.doRequest("1.0", "antcloud.deps.plan.progress.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetPlanProgressResponse({}));
  }

  /**
   * Description: 查询发布单
   * Summary: 查询发布单
   */
  async queryPlan(request: QueryPlanRequest): Promise<QueryPlanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPlanEx(request, headers, runtime);
  }

  /**
   * Description: 查询发布单
   * Summary: 查询发布单
   */
  async queryPlanEx(request: QueryPlanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPlanResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPlanResponse>(await this.doRequest("1.0", "antcloud.deps.plan.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPlanResponse({}));
  }

  /**
   * Description: 发布单状态统计
   * Summary: 发布单状态统计
   */
  async countPlanState(request: CountPlanStateRequest): Promise<CountPlanStateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.countPlanStateEx(request, headers, runtime);
  }

  /**
   * Description: 发布单状态统计
   * Summary: 发布单状态统计
   */
  async countPlanStateEx(request: CountPlanStateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CountPlanStateResponse> {
    Util.validateModel(request);
    return $tea.cast<CountPlanStateResponse>(await this.doRequest("1.0", "antcloud.deps.plan.state.count", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CountPlanStateResponse({}));
  }

  /**
   * Description:  执行
   * Summary:  执行
   */
  async execPlan(request: ExecPlanRequest): Promise<ExecPlanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execPlanEx(request, headers, runtime);
  }

  /**
   * Description:  执行
   * Summary:  执行
   */
  async execPlanEx(request: ExecPlanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecPlanResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecPlanResponse>(await this.doRequest("1.0", "antcloud.deps.plan.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecPlanResponse({}));
  }

  /**
   * Description: 重试
   * Summary: 重试
   */
  async retryPlan(request: RetryPlanRequest): Promise<RetryPlanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryPlanEx(request, headers, runtime);
  }

  /**
   * Description: 重试
   * Summary: 重试
   */
  async retryPlanEx(request: RetryPlanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryPlanResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryPlanResponse>(await this.doRequest("1.0", "antcloud.deps.plan.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryPlanResponse({}));
  }

  /**
   * Description: 取消发布
   * Summary: 取消发布
   */
  async cancelPlan(request: CancelPlanRequest): Promise<CancelPlanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelPlanEx(request, headers, runtime);
  }

  /**
   * Description: 取消发布
   * Summary: 取消发布
   */
  async cancelPlanEx(request: CancelPlanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelPlanResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelPlanResponse>(await this.doRequest("1.0", "antcloud.deps.plan.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelPlanResponse({}));
  }

  /**
   * Description: 回滚发布单
   * Summary: 回滚发布单
   */
  async rollbackPlan(request: RollbackPlanRequest): Promise<RollbackPlanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.rollbackPlanEx(request, headers, runtime);
  }

  /**
   * Description: 回滚发布单
   * Summary: 回滚发布单
   */
  async rollbackPlanEx(request: RollbackPlanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RollbackPlanResponse> {
    Util.validateModel(request);
    return $tea.cast<RollbackPlanResponse>(await this.doRequest("1.0", "antcloud.deps.plan.rollback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RollbackPlanResponse({}));
  }

  /**
   * Description: 获取任务详情
   * Summary: 获取任务详情
   */
  async getTaskSummary(request: GetTaskSummaryRequest): Promise<GetTaskSummaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTaskSummaryEx(request, headers, runtime);
  }

  /**
   * Description: 获取任务详情
   * Summary: 获取任务详情
   */
  async getTaskSummaryEx(request: GetTaskSummaryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTaskSummaryResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTaskSummaryResponse>(await this.doRequest("1.0", "antcloud.deps.task.summary.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTaskSummaryResponse({}));
  }

  /**
   * Description: 忽略任务
   * Summary: 忽略任务
   */
  async skipTask(request: SkipTaskRequest): Promise<SkipTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.skipTaskEx(request, headers, runtime);
  }

  /**
   * Description: 忽略任务
   * Summary: 忽略任务
   */
  async skipTaskEx(request: SkipTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SkipTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<SkipTaskResponse>(await this.doRequest("1.0", "antcloud.deps.task.skip", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SkipTaskResponse({}));
  }

  /**
   * Description: 重试任务
   * Summary: 重试任务
   */
  async retryTask(request: RetryTaskRequest): Promise<RetryTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryTaskEx(request, headers, runtime);
  }

  /**
   * Description: 重试任务
   * Summary: 重试任务
   */
  async retryTaskEx(request: RetryTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryTaskResponse>(await this.doRequest("1.0", "antcloud.deps.task.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryTaskResponse({}));
  }

  /**
   * Description: 查询角色信息
   * Summary: 查询角色信息
   */
  async queryRole(request: QueryRoleRequest): Promise<QueryRoleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRoleEx(request, headers, runtime);
  }

  /**
   * Description: 查询角色信息
   * Summary: 查询角色信息
   */
  async queryRoleEx(request: QueryRoleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRoleResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRoleResponse>(await this.doRequest("1.0", "antcloud.deps.role.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRoleResponse({}));
  }

  /**
   * Description: 创建应用服务分组集合
   * Summary: 创建应用服务分组集合
   */
  async createServicegroupcollection(request: CreateServicegroupcollectionRequest): Promise<CreateServicegroupcollectionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createServicegroupcollectionEx(request, headers, runtime);
  }

  /**
   * Description: 创建应用服务分组集合
   * Summary: 创建应用服务分组集合
   */
  async createServicegroupcollectionEx(request: CreateServicegroupcollectionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateServicegroupcollectionResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateServicegroupcollectionResponse>(await this.doRequest("1.0", "antcloud.deps.servicegroupcollection.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateServicegroupcollectionResponse({}));
  }

  /**
   * Description: 清除应用服务发布分组集合
   * Summary: 清除应用服务发布分组集合
   */
  async deleteServicegroupcollection(request: DeleteServicegroupcollectionRequest): Promise<DeleteServicegroupcollectionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteServicegroupcollectionEx(request, headers, runtime);
  }

  /**
   * Description: 清除应用服务发布分组集合
   * Summary: 清除应用服务发布分组集合
   */
  async deleteServicegroupcollectionEx(request: DeleteServicegroupcollectionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteServicegroupcollectionResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteServicegroupcollectionResponse>(await this.doRequest("1.0", "antcloud.deps.servicegroupcollection.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteServicegroupcollectionResponse({}));
  }

  /**
   * Description: 重试分组
   * Summary: 重试分组
   */
  async retryServicegroup(request: RetryServicegroupRequest): Promise<RetryServicegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryServicegroupEx(request, headers, runtime);
  }

  /**
   * Description: 重试分组
   * Summary: 重试分组
   */
  async retryServicegroupEx(request: RetryServicegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryServicegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryServicegroupResponse>(await this.doRequest("1.0", "antcloud.deps.servicegroup.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryServicegroupResponse({}));
  }

  /**
   * Description: 执行发布分组
   * Summary: 执行发布分组
   */
  async execServicegroup(request: ExecServicegroupRequest): Promise<ExecServicegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execServicegroupEx(request, headers, runtime);
  }

  /**
   * Description: 执行发布分组
   * Summary: 执行发布分组
   */
  async execServicegroupEx(request: ExecServicegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecServicegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecServicegroupResponse>(await this.doRequest("1.0", "antcloud.deps.servicegroup.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecServicegroupResponse({}));
  }

  /**
   * Description: 忽略分组
   * Summary: 忽略分组
   */
  async skipServicegroup(request: SkipServicegroupRequest): Promise<SkipServicegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.skipServicegroupEx(request, headers, runtime);
  }

  /**
   * Description: 忽略分组
   * Summary: 忽略分组
   */
  async skipServicegroupEx(request: SkipServicegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SkipServicegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<SkipServicegroupResponse>(await this.doRequest("1.0", "antcloud.deps.servicegroup.skip", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SkipServicegroupResponse({}));
  }

  /**
   * Description: 创建发布分组
   * Summary: 创建发布分组
   */
  async createServicegroup(request: CreateServicegroupRequest): Promise<CreateServicegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createServicegroupEx(request, headers, runtime);
  }

  /**
   * Description: 创建发布分组
   * Summary: 创建发布分组
   */
  async createServicegroupEx(request: CreateServicegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateServicegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateServicegroupResponse>(await this.doRequest("1.0", "antcloud.deps.servicegroup.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateServicegroupResponse({}));
  }

  /**
   * Description: 删除发布分组
   * Summary: 删除发布分组
   */
  async deleteServicegroup(request: DeleteServicegroupRequest): Promise<DeleteServicegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteServicegroupEx(request, headers, runtime);
  }

  /**
   * Description: 删除发布分组
   * Summary: 删除发布分组
   */
  async deleteServicegroupEx(request: DeleteServicegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteServicegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteServicegroupResponse>(await this.doRequest("1.0", "antcloud.deps.servicegroup.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteServicegroupResponse({}));
  }

  /**
   * Description: 转换分组
   * Summary: 转换分组
   */
  async switchServicegroup(request: SwitchServicegroupRequest): Promise<SwitchServicegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.switchServicegroupEx(request, headers, runtime);
  }

  /**
   * Description: 转换分组
   * Summary: 转换分组
   */
  async switchServicegroupEx(request: SwitchServicegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SwitchServicegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<SwitchServicegroupResponse>(await this.doRequest("1.0", "antcloud.deps.servicegroup.switch", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SwitchServicegroupResponse({}));
  }

  /**
   * Description: 获取发布服务详情
   * Summary: 获取发布服务详情
   */
  async getService(request: GetServiceRequest): Promise<GetServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getServiceEx(request, headers, runtime);
  }

  /**
   * Description: 获取发布服务详情
   * Summary: 获取发布服务详情
   */
  async getServiceEx(request: GetServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetServiceResponse>(await this.doRequest("1.0", "antcloud.deps.service.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetServiceResponse({}));
  }

  /**
   * Description: 获取应用发布信息
   * Summary: 获取应用发布信息
   */
  async getServiceProgress(request: GetServiceProgressRequest): Promise<GetServiceProgressResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getServiceProgressEx(request, headers, runtime);
  }

  /**
   * Description: 获取应用发布信息
   * Summary: 获取应用发布信息
   */
  async getServiceProgressEx(request: GetServiceProgressRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetServiceProgressResponse> {
    Util.validateModel(request);
    return $tea.cast<GetServiceProgressResponse>(await this.doRequest("1.0", "antcloud.deps.service.progress.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetServiceProgressResponse({}));
  }

  /**
   * Description: 查询发布进度
   * Summary: 查询发布进度
   */
  async queryServiceProgress(request: QueryServiceProgressRequest): Promise<QueryServiceProgressResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryServiceProgressEx(request, headers, runtime);
  }

  /**
   * Description: 查询发布进度
   * Summary: 查询发布进度
   */
  async queryServiceProgressEx(request: QueryServiceProgressRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryServiceProgressResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryServiceProgressResponse>(await this.doRequest("1.0", "antcloud.deps.service.progress.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryServiceProgressResponse({}));
  }

  /**
   * Description: 查询SLB挂载信息
   * Summary: 查询SLB挂载信息
   */
  async queryServiceSlbmount(request: QueryServiceSlbmountRequest): Promise<QueryServiceSlbmountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryServiceSlbmountEx(request, headers, runtime);
  }

  /**
   * Description: 查询SLB挂载信息
   * Summary: 查询SLB挂载信息
   */
  async queryServiceSlbmountEx(request: QueryServiceSlbmountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryServiceSlbmountResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryServiceSlbmountResponse>(await this.doRequest("1.0", "antcloud.deps.service.slbmount.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryServiceSlbmountResponse({}));
  }

  /**
   * Description: 批量查询 SLB 挂载信息
   * Summary: 批量查询 SLB 挂载信息
   */
  async batchqueryServiceSlbmount(request: BatchqueryServiceSlbmountRequest): Promise<BatchqueryServiceSlbmountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryServiceSlbmountEx(request, headers, runtime);
  }

  /**
   * Description: 批量查询 SLB 挂载信息
   * Summary: 批量查询 SLB 挂载信息
   */
  async batchqueryServiceSlbmountEx(request: BatchqueryServiceSlbmountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryServiceSlbmountResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryServiceSlbmountResponse>(await this.doRequest("1.0", "antcloud.deps.service.slbmount.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryServiceSlbmountResponse({}));
  }

  /**
   * Description: 更新slb挂载权重
   * Summary: 更新slb挂载权重
   */
  async updateServiceSlbmount(request: UpdateServiceSlbmountRequest): Promise<UpdateServiceSlbmountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateServiceSlbmountEx(request, headers, runtime);
  }

  /**
   * Description: 更新slb挂载权重
   * Summary: 更新slb挂载权重
   */
  async updateServiceSlbmountEx(request: UpdateServiceSlbmountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateServiceSlbmountResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateServiceSlbmountResponse>(await this.doRequest("1.0", "antcloud.deps.service.slbmount.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateServiceSlbmountResponse({}));
  }

  /**
   * Description: 查询挂载进度
   * Summary: 查询挂载进度
   */
  async queryServiceSlbmountprogress(request: QueryServiceSlbmountprogressRequest): Promise<QueryServiceSlbmountprogressResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryServiceSlbmountprogressEx(request, headers, runtime);
  }

  /**
   * Description: 查询挂载进度
   * Summary: 查询挂载进度
   */
  async queryServiceSlbmountprogressEx(request: QueryServiceSlbmountprogressRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryServiceSlbmountprogressResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryServiceSlbmountprogressResponse>(await this.doRequest("1.0", "antcloud.deps.service.slbmountprogress.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryServiceSlbmountprogressResponse({}));
  }

  /**
   * Description: 查询最近一次发布成功的应用记录
   * Summary: 查询最近一次发布成功的应用记录
   */
  async queryServiceLatestsuccess(request: QueryServiceLatestsuccessRequest): Promise<QueryServiceLatestsuccessResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryServiceLatestsuccessEx(request, headers, runtime);
  }

  /**
   * Description: 查询最近一次发布成功的应用记录
   * Summary: 查询最近一次发布成功的应用记录
   */
  async queryServiceLatestsuccessEx(request: QueryServiceLatestsuccessRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryServiceLatestsuccessResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryServiceLatestsuccessResponse>(await this.doRequest("1.0", "antcloud.deps.service.latestsuccess.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryServiceLatestsuccessResponse({}));
  }

  /**
   * Description: 重新初始化
   * Summary: 重新初始化
   */
  async reinitService(request: ReinitServiceRequest): Promise<ReinitServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.reinitServiceEx(request, headers, runtime);
  }

  /**
   * Description: 重新初始化
   * Summary: 重新初始化
   */
  async reinitServiceEx(request: ReinitServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReinitServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<ReinitServiceResponse>(await this.doRequest("1.0", "antcloud.deps.service.reinit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReinitServiceResponse({}));
  }

  /**
   * Description: 执行发布单
   * Summary: 执行发布单
   */
  async execService(request: ExecServiceRequest): Promise<ExecServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execServiceEx(request, headers, runtime);
  }

  /**
   * Description: 执行发布单
   * Summary: 执行发布单
   */
  async execServiceEx(request: ExecServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecServiceResponse>(await this.doRequest("1.0", "antcloud.deps.service.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecServiceResponse({}));
  }

  /**
   * Description: 取消应用发布
   * Summary: 取消应用发布
   */
  async cancelService(request: CancelServiceRequest): Promise<CancelServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelServiceEx(request, headers, runtime);
  }

  /**
   * Description: 取消应用发布
   * Summary: 取消应用发布
   */
  async cancelServiceEx(request: CancelServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelServiceResponse>(await this.doRequest("1.0", "antcloud.deps.service.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelServiceResponse({}));
  }

  /**
   * Description: 忽略分组
   * Summary: 忽略分组
   */
  async skipService(request: SkipServiceRequest): Promise<SkipServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.skipServiceEx(request, headers, runtime);
  }

  /**
   * Description: 忽略分组
   * Summary: 忽略分组
   */
  async skipServiceEx(request: SkipServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SkipServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<SkipServiceResponse>(await this.doRequest("1.0", "antcloud.deps.service.skip", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SkipServiceResponse({}));
  }

  /**
   * Description: 触发服务发布
   * Summary: 触发服务发布
   */
  async startService(request: StartServiceRequest): Promise<StartServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startServiceEx(request, headers, runtime);
  }

  /**
   * Description: 触发服务发布
   * Summary: 触发服务发布
   */
  async startServiceEx(request: StartServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<StartServiceResponse>(await this.doRequest("1.0", "antcloud.deps.service.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartServiceResponse({}));
  }

  /**
   * Description: 发布确认
   * Summary: 发布确认
   */
  async confirmService(request: ConfirmServiceRequest): Promise<ConfirmServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmServiceEx(request, headers, runtime);
  }

  /**
   * Description: 发布确认
   * Summary: 发布确认
   */
  async confirmServiceEx(request: ConfirmServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmServiceResponse>(await this.doRequest("1.0", "antcloud.deps.service.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmServiceResponse({}));
  }

  /**
   * Description: 配置机器分组
   * Summary: 配置机器分组
   */
  async setServiceMachinegroup(request: SetServiceMachinegroupRequest): Promise<SetServiceMachinegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setServiceMachinegroupEx(request, headers, runtime);
  }

  /**
   * Description: 配置机器分组
   * Summary: 配置机器分组
   */
  async setServiceMachinegroupEx(request: SetServiceMachinegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetServiceMachinegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<SetServiceMachinegroupResponse>(await this.doRequest("1.0", "antcloud.deps.service.machinegroup.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetServiceMachinegroupResponse({}));
  }

  /**
   * Description: 重新初始化机器分组
   * Summary: 重新初始化机器分组
   */
  async reinitServiceMachinegroup(request: ReinitServiceMachinegroupRequest): Promise<ReinitServiceMachinegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.reinitServiceMachinegroupEx(request, headers, runtime);
  }

  /**
   * Description: 重新初始化机器分组
   * Summary: 重新初始化机器分组
   */
  async reinitServiceMachinegroupEx(request: ReinitServiceMachinegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReinitServiceMachinegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<ReinitServiceMachinegroupResponse>(await this.doRequest("1.0", "antcloud.deps.service.machinegroup.reinit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReinitServiceMachinegroupResponse({}));
  }

  /**
   * Description: 查询可回滚服务
   * Summary: 查询可回滚服务
   */
  async listServiceRollbackversion(request: ListServiceRollbackversionRequest): Promise<ListServiceRollbackversionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listServiceRollbackversionEx(request, headers, runtime);
  }

  /**
   * Description: 查询可回滚服务
   * Summary: 查询可回滚服务
   */
  async listServiceRollbackversionEx(request: ListServiceRollbackversionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListServiceRollbackversionResponse> {
    Util.validateModel(request);
    return $tea.cast<ListServiceRollbackversionResponse>(await this.doRequest("1.0", "antcloud.deps.service.rollbackversion.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListServiceRollbackversionResponse({}));
  }

  /**
   * Description: 查询可回滚版本
   * Summary: 查询可回滚版本
   */
  async queryServiceRollbackversion(request: QueryServiceRollbackversionRequest): Promise<QueryServiceRollbackversionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryServiceRollbackversionEx(request, headers, runtime);
  }

  /**
   * Description: 查询可回滚版本
   * Summary: 查询可回滚版本
   */
  async queryServiceRollbackversionEx(request: QueryServiceRollbackversionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryServiceRollbackversionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryServiceRollbackversionResponse>(await this.doRequest("1.0", "antcloud.deps.service.rollbackversion.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryServiceRollbackversionResponse({}));
  }

  /**
   * Description: 回滚应用
   * Summary: 回滚应用
   */
  async rollbackService(request: RollbackServiceRequest): Promise<RollbackServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.rollbackServiceEx(request, headers, runtime);
  }

  /**
   * Description: 回滚应用
   * Summary: 回滚应用
   */
  async rollbackServiceEx(request: RollbackServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RollbackServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<RollbackServiceResponse>(await this.doRequest("1.0", "antcloud.deps.service.rollback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RollbackServiceResponse({}));
  }

  /**
   * Description: 回滚确认
   * Summary: 回滚确认
   */
  async confirmrollbackService(request: ConfirmrollbackServiceRequest): Promise<ConfirmrollbackServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmrollbackServiceEx(request, headers, runtime);
  }

  /**
   * Description: 回滚确认
   * Summary: 回滚确认
   */
  async confirmrollbackServiceEx(request: ConfirmrollbackServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmrollbackServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmrollbackServiceResponse>(await this.doRequest("1.0", "antcloud.deps.service.confirmrollback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmrollbackServiceResponse({}));
  }

  /**
   * Description: 回滚重试
   * Summary: 回滚重试
   */
  async retryrollbackService(request: RetryrollbackServiceRequest): Promise<RetryrollbackServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryrollbackServiceEx(request, headers, runtime);
  }

  /**
   * Description: 回滚重试
   * Summary: 回滚重试
   */
  async retryrollbackServiceEx(request: RetryrollbackServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryrollbackServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryrollbackServiceResponse>(await this.doRequest("1.0", "antcloud.deps.service.retryrollback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryrollbackServiceResponse({}));
  }

  /**
   * Description: 获取子流程进度
   * Summary: 获取子流程进度
   */
  async getServiceArrangement(request: GetServiceArrangementRequest): Promise<GetServiceArrangementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getServiceArrangementEx(request, headers, runtime);
  }

  /**
   * Description: 获取子流程进度
   * Summary: 获取子流程进度
   */
  async getServiceArrangementEx(request: GetServiceArrangementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetServiceArrangementResponse> {
    Util.validateModel(request);
    return $tea.cast<GetServiceArrangementResponse>(await this.doRequest("1.0", "antcloud.deps.service.arrangement.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetServiceArrangementResponse({}));
  }

  /**
   * Description: 重试子流程
   * Summary: 重试子流程
   */
  async retryServiceArrangement(request: RetryServiceArrangementRequest): Promise<RetryServiceArrangementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryServiceArrangementEx(request, headers, runtime);
  }

  /**
   * Description: 重试子流程
   * Summary: 重试子流程
   */
  async retryServiceArrangementEx(request: RetryServiceArrangementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryServiceArrangementResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryServiceArrangementResponse>(await this.doRequest("1.0", "antcloud.deps.service.arrangement.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryServiceArrangementResponse({}));
  }

  /**
   * Description: 忽略子流程
   * Summary: 忽略子流程
   */
  async skipServiceArrangement(request: SkipServiceArrangementRequest): Promise<SkipServiceArrangementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.skipServiceArrangementEx(request, headers, runtime);
  }

  /**
   * Description: 忽略子流程
   * Summary: 忽略子流程
   */
  async skipServiceArrangementEx(request: SkipServiceArrangementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SkipServiceArrangementResponse> {
    Util.validateModel(request);
    return $tea.cast<SkipServiceArrangementResponse>(await this.doRequest("1.0", "antcloud.deps.service.arrangement.skip", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SkipServiceArrangementResponse({}));
  }

  /**
   * Description: query op log
   * Summary: query op log
   */
  async queryOperationlog(request: QueryOperationlogRequest): Promise<QueryOperationlogResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryOperationlogEx(request, headers, runtime);
  }

  /**
   * Description: query op log
   * Summary: query op log
   */
  async queryOperationlogEx(request: QueryOperationlogRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryOperationlogResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryOperationlogResponse>(await this.doRequest("1.0", "antcloud.deps.operationlog.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryOperationlogResponse({}));
  }

  /**
   * Description: operation time line
   * Summary: operation time line
   */
  async queryOperationlogTimeline(request: QueryOperationlogTimelineRequest): Promise<QueryOperationlogTimelineResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryOperationlogTimelineEx(request, headers, runtime);
  }

  /**
   * Description: operation time line
   * Summary: operation time line
   */
  async queryOperationlogTimelineEx(request: QueryOperationlogTimelineRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryOperationlogTimelineResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryOperationlogTimelineResponse>(await this.doRequest("1.0", "antcloud.deps.operationlog.timeline.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryOperationlogTimelineResponse({}));
  }

  /**
   * Description: 获取发布应用详情
   * Summary: 获取发布应用详情
   */
  async getServiceDetail(request: GetServiceDetailRequest): Promise<GetServiceDetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getServiceDetailEx(request, headers, runtime);
  }

  /**
   * Description: 获取发布应用详情
   * Summary: 获取发布应用详情
   */
  async getServiceDetailEx(request: GetServiceDetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetServiceDetailResponse> {
    Util.validateModel(request);
    return $tea.cast<GetServiceDetailResponse>(await this.doRequest("1.0", "antcloud.deps.service.detail.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetServiceDetailResponse({}));
  }

  /**
   * Description: create cell
   * Summary: create cell
   */
  async createMetaCell(request: CreateMetaCellRequest): Promise<CreateMetaCellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createMetaCellEx(request, headers, runtime);
  }

  /**
   * Description: create cell
   * Summary: create cell
   */
  async createMetaCellEx(request: CreateMetaCellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateMetaCellResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateMetaCellResponse>(await this.doRequest("1.0", "antcloud.deps.meta.cell.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateMetaCellResponse({}));
  }

  /**
   * Description: update cell
   * Summary: update cell
   */
  async updateMetaCell(request: UpdateMetaCellRequest): Promise<UpdateMetaCellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateMetaCellEx(request, headers, runtime);
  }

  /**
   * Description: update cell
   * Summary: update cell
   */
  async updateMetaCellEx(request: UpdateMetaCellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateMetaCellResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateMetaCellResponse>(await this.doRequest("1.0", "antcloud.deps.meta.cell.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateMetaCellResponse({}));
  }

  /**
   * Description: 关联 master zone
   * Summary: 关联 master zone
   */
  async addMetaMasterzonerel(request: AddMetaMasterzonerelRequest): Promise<AddMetaMasterzonerelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addMetaMasterzonerelEx(request, headers, runtime);
  }

  /**
   * Description: 关联 master zone
   * Summary: 关联 master zone
   */
  async addMetaMasterzonerelEx(request: AddMetaMasterzonerelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddMetaMasterzonerelResponse> {
    Util.validateModel(request);
    return $tea.cast<AddMetaMasterzonerelResponse>(await this.doRequest("1.0", "antcloud.deps.meta.masterzonerel.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddMetaMasterzonerelResponse({}));
  }

  /**
   * Description: 分配指定的一个或者多个计算资源到指定的应用
   * Summary: 分配应用计算资源
   */
  async assignComputer(request: AssignComputerRequest): Promise<AssignComputerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.assignComputerEx(request, headers, runtime);
  }

  /**
   * Description: 分配指定的一个或者多个计算资源到指定的应用
   * Summary: 分配应用计算资源
   */
  async assignComputerEx(request: AssignComputerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AssignComputerResponse> {
    Util.validateModel(request);
    return $tea.cast<AssignComputerResponse>(await this.doRequest("1.0", "antcloud.deps.computer.assign", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AssignComputerResponse({}));
  }

  /**
   * Description: 从指定应用释放一个或者多个计算资源
   * Summary: 释放应用计算资源
   */
  async releaseComputer(request: ReleaseComputerRequest): Promise<ReleaseComputerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.releaseComputerEx(request, headers, runtime);
  }

  /**
   * Description: 从指定应用释放一个或者多个计算资源
   * Summary: 释放应用计算资源
   */
  async releaseComputerEx(request: ReleaseComputerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReleaseComputerResponse> {
    Util.validateModel(request);
    return $tea.cast<ReleaseComputerResponse>(await this.doRequest("1.0", "antcloud.deps.computer.release", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReleaseComputerResponse({}));
  }

  /**
   * Description: 查询异步请求的详情，包括请求状态，请求中的任务执行状态等
   * Summary: 获取异步任务
   */
  async getTask(request: GetTaskRequest): Promise<GetTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTaskEx(request, headers, runtime);
  }

  /**
   * Description: 查询异步请求的详情，包括请求状态，请求中的任务执行状态等
   * Summary: 获取异步任务
   */
  async getTaskEx(request: GetTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTaskResponse>(await this.doRequest("1.0", "antcloud.deps.task.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTaskResponse({}));
  }

  /**
   * Description: 创建 ecs 实例
   * Summary: 创建 ecs 实例
   */
  async createComputer(request: CreateComputerRequest): Promise<CreateComputerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createComputerEx(request, headers, runtime);
  }

  /**
   * Description: 创建 ecs 实例
   * Summary: 创建 ecs 实例
   */
  async createComputerEx(request: CreateComputerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateComputerResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateComputerResponse>(await this.doRequest("1.0", "antcloud.deps.computer.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateComputerResponse({}));
  }

  /**
   * Description: 创建sidecar元数据信息
   * Summary: 创建sidecar元数据信息
   */
  async createSidecar(request: CreateSidecarRequest): Promise<CreateSidecarResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSidecarEx(request, headers, runtime);
  }

  /**
   * Description: 创建sidecar元数据信息
   * Summary: 创建sidecar元数据信息
   */
  async createSidecarEx(request: CreateSidecarRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSidecarResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSidecarResponse>(await this.doRequest("1.0", "antcloud.deps.sidecar.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSidecarResponse({}));
  }

  /**
   * Description: 查询sidecar元信息列表
   * Summary: 查询sidecar元信息列表
   */
  async listSidecar(request: ListSidecarRequest): Promise<ListSidecarResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSidecarEx(request, headers, runtime);
  }

  /**
   * Description: 查询sidecar元信息列表
   * Summary: 查询sidecar元信息列表
   */
  async listSidecarEx(request: ListSidecarRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSidecarResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSidecarResponse>(await this.doRequest("1.0", "antcloud.deps.sidecar.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSidecarResponse({}));
  }

  /**
   * Description: 创建sidecar模板
   * Summary: 创建sidecar版本
   */
  async createSidecarVersion(request: CreateSidecarVersionRequest): Promise<CreateSidecarVersionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSidecarVersionEx(request, headers, runtime);
  }

  /**
   * Description: 创建sidecar模板
   * Summary: 创建sidecar版本
   */
  async createSidecarVersionEx(request: CreateSidecarVersionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSidecarVersionResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSidecarVersionResponse>(await this.doRequest("1.0", "antcloud.deps.sidecar.version.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSidecarVersionResponse({}));
  }

  /**
   * Description: 查询sidecar模板列表
   * Summary: 查询sidecar模板列表
   */
  async listSidecarVersion(request: ListSidecarVersionRequest): Promise<ListSidecarVersionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSidecarVersionEx(request, headers, runtime);
  }

  /**
   * Description: 查询sidecar模板列表
   * Summary: 查询sidecar模板列表
   */
  async listSidecarVersionEx(request: ListSidecarVersionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSidecarVersionResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSidecarVersionResponse>(await this.doRequest("1.0", "antcloud.deps.sidecar.version.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSidecarVersionResponse({}));
  }

  /**
   * Description: 获取sidecar版本详情
   * Summary: 获取sidecar版本详情
   */
  async getSidecarVersion(request: GetSidecarVersionRequest): Promise<GetSidecarVersionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getSidecarVersionEx(request, headers, runtime);
  }

  /**
   * Description: 获取sidecar版本详情
   * Summary: 获取sidecar版本详情
   */
  async getSidecarVersionEx(request: GetSidecarVersionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetSidecarVersionResponse> {
    Util.validateModel(request);
    return $tea.cast<GetSidecarVersionResponse>(await this.doRequest("1.0", "antcloud.deps.sidecar.version.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetSidecarVersionResponse({}));
  }

  /**
   * Description: 创建sidecar规则
   * Summary: 创建sidecar规则
   */
  async createSidecarRule(request: CreateSidecarRuleRequest): Promise<CreateSidecarRuleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSidecarRuleEx(request, headers, runtime);
  }

  /**
   * Description: 创建sidecar规则
   * Summary: 创建sidecar规则
   */
  async createSidecarRuleEx(request: CreateSidecarRuleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSidecarRuleResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSidecarRuleResponse>(await this.doRequest("1.0", "antcloud.deps.sidecar.rule.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSidecarRuleResponse({}));
  }

  /**
   * Description: 获取sidecar单个规则详情
   * Summary: 获取sidecar单个规则详情
   */
  async getSidecarRule(request: GetSidecarRuleRequest): Promise<GetSidecarRuleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getSidecarRuleEx(request, headers, runtime);
  }

  /**
   * Description: 获取sidecar单个规则详情
   * Summary: 获取sidecar单个规则详情
   */
  async getSidecarRuleEx(request: GetSidecarRuleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetSidecarRuleResponse> {
    Util.validateModel(request);
    return $tea.cast<GetSidecarRuleResponse>(await this.doRequest("1.0", "antcloud.deps.sidecar.rule.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetSidecarRuleResponse({}));
  }

  /**
   * Description: 获取sidecar规则列表
   * Summary: 获取sidecar规则列表
   */
  async listSidecarRule(request: ListSidecarRuleRequest): Promise<ListSidecarRuleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSidecarRuleEx(request, headers, runtime);
  }

  /**
   * Description: 获取sidecar规则列表
   * Summary: 获取sidecar规则列表
   */
  async listSidecarRuleEx(request: ListSidecarRuleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSidecarRuleResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSidecarRuleResponse>(await this.doRequest("1.0", "antcloud.deps.sidecar.rule.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSidecarRuleResponse({}));
  }

  /**
   * Description: 创建sidecar版本实例
   * Summary: 创建sidecar版本实例
   */
  async createSidecarInstance(request: CreateSidecarInstanceRequest): Promise<CreateSidecarInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSidecarInstanceEx(request, headers, runtime);
  }

  /**
   * Description: 创建sidecar版本实例
   * Summary: 创建sidecar版本实例
   */
  async createSidecarInstanceEx(request: CreateSidecarInstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSidecarInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSidecarInstanceResponse>(await this.doRequest("1.0", "antcloud.deps.sidecar.instance.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSidecarInstanceResponse({}));
  }

  /**
   * Description: 查询sidecar版本实例列表
   * Summary: 查询sidecar版本实例列表
   */
  async listSidecarInstance(request: ListSidecarInstanceRequest): Promise<ListSidecarInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSidecarInstanceEx(request, headers, runtime);
  }

  /**
   * Description: 查询sidecar版本实例列表
   * Summary: 查询sidecar版本实例列表
   */
  async listSidecarInstanceEx(request: ListSidecarInstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSidecarInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSidecarInstanceResponse>(await this.doRequest("1.0", "antcloud.deps.sidecar.instance.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSidecarInstanceResponse({}));
  }

  /**
   * Description: 获取sidecar版本实例
   * Summary: 获取sidecar版本实例
   */
  async getSidecarInstance(request: GetSidecarInstanceRequest): Promise<GetSidecarInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getSidecarInstanceEx(request, headers, runtime);
  }

  /**
   * Description: 获取sidecar版本实例
   * Summary: 获取sidecar版本实例
   */
  async getSidecarInstanceEx(request: GetSidecarInstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetSidecarInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetSidecarInstanceResponse>(await this.doRequest("1.0", "antcloud.deps.sidecar.instance.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetSidecarInstanceResponse({}));
  }

  /**
   * Description: 获取sidecar类型
   * Summary: 获取sidecar类型
   */
  async getSidecar(request: GetSidecarRequest): Promise<GetSidecarResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getSidecarEx(request, headers, runtime);
  }

  /**
   * Description: 获取sidecar类型
   * Summary: 获取sidecar类型
   */
  async getSidecarEx(request: GetSidecarRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetSidecarResponse> {
    Util.validateModel(request);
    return $tea.cast<GetSidecarResponse>(await this.doRequest("1.0", "antcloud.deps.sidecar.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetSidecarResponse({}));
  }

  /**
   * Description: 更新sidecar类型信息
   * Summary: 更新sidecar类型信息
   */
  async updateSidecar(request: UpdateSidecarRequest): Promise<UpdateSidecarResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSidecarEx(request, headers, runtime);
  }

  /**
   * Description: 更新sidecar类型信息
   * Summary: 更新sidecar类型信息
   */
  async updateSidecarEx(request: UpdateSidecarRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSidecarResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSidecarResponse>(await this.doRequest("1.0", "antcloud.deps.sidecar.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSidecarResponse({}));
  }

  /**
   * Description: 删除sidecar类型
   * Summary: 删除sidecar类型
   */
  async deleteSidecar(request: DeleteSidecarRequest): Promise<DeleteSidecarResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSidecarEx(request, headers, runtime);
  }

  /**
   * Description: 删除sidecar类型
   * Summary: 删除sidecar类型
   */
  async deleteSidecarEx(request: DeleteSidecarRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSidecarResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSidecarResponse>(await this.doRequest("1.0", "antcloud.deps.sidecar.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSidecarResponse({}));
  }

  /**
   * Description: 更新sidecar版本
   * Summary: 更新sidecar版本
   */
  async updateSidecarVersion(request: UpdateSidecarVersionRequest): Promise<UpdateSidecarVersionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSidecarVersionEx(request, headers, runtime);
  }

  /**
   * Description: 更新sidecar版本
   * Summary: 更新sidecar版本
   */
  async updateSidecarVersionEx(request: UpdateSidecarVersionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSidecarVersionResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSidecarVersionResponse>(await this.doRequest("1.0", "antcloud.deps.sidecar.version.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSidecarVersionResponse({}));
  }

  /**
   * Description: 删除sidecar模板
   * Summary: 删除sidecar模板
   */
  async deleteSidecarVersion(request: DeleteSidecarVersionRequest): Promise<DeleteSidecarVersionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSidecarVersionEx(request, headers, runtime);
  }

  /**
   * Description: 删除sidecar模板
   * Summary: 删除sidecar模板
   */
  async deleteSidecarVersionEx(request: DeleteSidecarVersionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSidecarVersionResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSidecarVersionResponse>(await this.doRequest("1.0", "antcloud.deps.sidecar.version.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSidecarVersionResponse({}));
  }

  /**
   * Description: 更新sidecar版本实例
   * Summary: 更新sidecar版本实例
   */
  async updateSidecarInstance(request: UpdateSidecarInstanceRequest): Promise<UpdateSidecarInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSidecarInstanceEx(request, headers, runtime);
  }

  /**
   * Description: 更新sidecar版本实例
   * Summary: 更新sidecar版本实例
   */
  async updateSidecarInstanceEx(request: UpdateSidecarInstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSidecarInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSidecarInstanceResponse>(await this.doRequest("1.0", "antcloud.deps.sidecar.instance.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSidecarInstanceResponse({}));
  }

  /**
   * Description: 删除sidecar版本实例
   * Summary: 删除sidecar版本实例
   */
  async deleteSidecarInstance(request: DeleteSidecarInstanceRequest): Promise<DeleteSidecarInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSidecarInstanceEx(request, headers, runtime);
  }

  /**
   * Description: 删除sidecar版本实例
   * Summary: 删除sidecar版本实例
   */
  async deleteSidecarInstanceEx(request: DeleteSidecarInstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSidecarInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSidecarInstanceResponse>(await this.doRequest("1.0", "antcloud.deps.sidecar.instance.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSidecarInstanceResponse({}));
  }

  /**
   * Description: 更新sidecar规则
   * Summary: 更新sidecar规则
   */
  async updateSidecarRule(request: UpdateSidecarRuleRequest): Promise<UpdateSidecarRuleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSidecarRuleEx(request, headers, runtime);
  }

  /**
   * Description: 更新sidecar规则
   * Summary: 更新sidecar规则
   */
  async updateSidecarRuleEx(request: UpdateSidecarRuleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSidecarRuleResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSidecarRuleResponse>(await this.doRequest("1.0", "antcloud.deps.sidecar.rule.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSidecarRuleResponse({}));
  }

  /**
   * Description: 删除sidecar规则
   * Summary: 删除sidecar规则
   */
  async deleteSidecarRule(request: DeleteSidecarRuleRequest): Promise<DeleteSidecarRuleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSidecarRuleEx(request, headers, runtime);
  }

  /**
   * Description: 删除sidecar规则
   * Summary: 删除sidecar规则
   */
  async deleteSidecarRuleEx(request: DeleteSidecarRuleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSidecarRuleResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSidecarRuleResponse>(await this.doRequest("1.0", "antcloud.deps.sidecar.rule.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSidecarRuleResponse({}));
  }

  /**
   * Description: 更新sidecar版本状态
   * Summary: 更新sidecar版本状态
   */
  async updateSidecarVersionstatus(request: UpdateSidecarVersionstatusRequest): Promise<UpdateSidecarVersionstatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSidecarVersionstatusEx(request, headers, runtime);
  }

  /**
   * Description: 更新sidecar版本状态
   * Summary: 更新sidecar版本状态
   */
  async updateSidecarVersionstatusEx(request: UpdateSidecarVersionstatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSidecarVersionstatusResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSidecarVersionstatusResponse>(await this.doRequest("1.0", "antcloud.deps.sidecar.versionstatus.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSidecarVersionstatusResponse({}));
  }

  /**
   * Description: 更新sidecar版本实例状态
   * Summary: 更新sidecar版本实例状态
   */
  async updateSidecarInstancestatus(request: UpdateSidecarInstancestatusRequest): Promise<UpdateSidecarInstancestatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSidecarInstancestatusEx(request, headers, runtime);
  }

  /**
   * Description: 更新sidecar版本实例状态
   * Summary: 更新sidecar版本实例状态
   */
  async updateSidecarInstancestatusEx(request: UpdateSidecarInstancestatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSidecarInstancestatusResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSidecarInstancestatusResponse>(await this.doRequest("1.0", "antcloud.deps.sidecar.instancestatus.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSidecarInstancestatusResponse({}));
  }

  /**
   * Description: 更新sidecar规则状态
   * Summary: 更新sidecar规则状态
   */
  async updateSidecarRulestatus(request: UpdateSidecarRulestatusRequest): Promise<UpdateSidecarRulestatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSidecarRulestatusEx(request, headers, runtime);
  }

  /**
   * Description: 更新sidecar规则状态
   * Summary: 更新sidecar规则状态
   */
  async updateSidecarRulestatusEx(request: UpdateSidecarRulestatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSidecarRulestatusResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSidecarRulestatusResponse>(await this.doRequest("1.0", "antcloud.deps.sidecar.rulestatus.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSidecarRulestatusResponse({}));
  }

  /**
   * Description: 创建应用sidecar基线
   * Summary: 创建应用sidecar基线
   */
  async createAppbaselineSidecar(request: CreateAppbaselineSidecarRequest): Promise<CreateAppbaselineSidecarResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAppbaselineSidecarEx(request, headers, runtime);
  }

  /**
   * Description: 创建应用sidecar基线
   * Summary: 创建应用sidecar基线
   */
  async createAppbaselineSidecarEx(request: CreateAppbaselineSidecarRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAppbaselineSidecarResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAppbaselineSidecarResponse>(await this.doRequest("1.0", "antcloud.deps.appbaseline.sidecar.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAppbaselineSidecarResponse({}));
  }

  /**
   * Description: 查询应用sidecar基线
   * Summary: 查询应用sidecar基线
   */
  async listAppbaselineSidecar(request: ListAppbaselineSidecarRequest): Promise<ListAppbaselineSidecarResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAppbaselineSidecarEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用sidecar基线
   * Summary: 查询应用sidecar基线
   */
  async listAppbaselineSidecarEx(request: ListAppbaselineSidecarRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAppbaselineSidecarResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAppbaselineSidecarResponse>(await this.doRequest("1.0", "antcloud.deps.appbaseline.sidecar.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAppbaselineSidecarResponse({}));
  }

  /**
   * Description: 删除应用sidecar基线
   * Summary: 删除应用sidecar基线
   */
  async deleteAppbaselineSidecar(request: DeleteAppbaselineSidecarRequest): Promise<DeleteAppbaselineSidecarResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteAppbaselineSidecarEx(request, headers, runtime);
  }

  /**
   * Description: 删除应用sidecar基线
   * Summary: 删除应用sidecar基线
   */
  async deleteAppbaselineSidecarEx(request: DeleteAppbaselineSidecarRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteAppbaselineSidecarResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteAppbaselineSidecarResponse>(await this.doRequest("1.0", "antcloud.deps.appbaseline.sidecar.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteAppbaselineSidecarResponse({}));
  }

  /**
   * Description: 更新应用sidecar基线
   * Summary: 更新应用sidecar基线
   */
  async updateAppbaselineSidecar(request: UpdateAppbaselineSidecarRequest): Promise<UpdateAppbaselineSidecarResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAppbaselineSidecarEx(request, headers, runtime);
  }

  /**
   * Description: 更新应用sidecar基线
   * Summary: 更新应用sidecar基线
   */
  async updateAppbaselineSidecarEx(request: UpdateAppbaselineSidecarRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAppbaselineSidecarResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAppbaselineSidecarResponse>(await this.doRequest("1.0", "antcloud.deps.appbaseline.sidecar.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAppbaselineSidecarResponse({}));
  }

  /**
   * Description: 创建或更新应用sidecar基线，app_name category conditions更新的时候是主键
   * Summary: 创建或更新应用sidecar基线
   */
  async saveAppbaselineSidecar(request: SaveAppbaselineSidecarRequest): Promise<SaveAppbaselineSidecarResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveAppbaselineSidecarEx(request, headers, runtime);
  }

  /**
   * Description: 创建或更新应用sidecar基线，app_name category conditions更新的时候是主键
   * Summary: 创建或更新应用sidecar基线
   */
  async saveAppbaselineSidecarEx(request: SaveAppbaselineSidecarRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveAppbaselineSidecarResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveAppbaselineSidecarResponse>(await this.doRequest("1.0", "antcloud.deps.appbaseline.sidecar.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveAppbaselineSidecarResponse({}));
  }

  /**
   * Description: 查询workspace详情
   * Summary: 获取workspace
   */
  async getWorkspace(request: GetWorkspaceRequest): Promise<GetWorkspaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getWorkspaceEx(request, headers, runtime);
  }

  /**
   * Description: 查询workspace详情
   * Summary: 获取workspace
   */
  async getWorkspaceEx(request: GetWorkspaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetWorkspaceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetWorkspaceResponse>(await this.doRequest("1.0", "antcloud.deps.workspace.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetWorkspaceResponse({}));
  }

  /**
   * Description: 查询workspace列表，可根据状态过滤。
   * Summary: 查询workspace
   */
  async queryWorkspace(request: QueryWorkspaceRequest): Promise<QueryWorkspaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryWorkspaceEx(request, headers, runtime);
  }

  /**
   * Description: 查询workspace列表，可根据状态过滤。
   * Summary: 查询workspace
   */
  async queryWorkspaceEx(request: QueryWorkspaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryWorkspaceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryWorkspaceResponse>(await this.doRequest("1.0", "antcloud.deps.workspace.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryWorkspaceResponse({}));
  }

  /**
   * Description: 创建workspace
   * Summary: 创建workspace
   */
  async createWorkspace(request: CreateWorkspaceRequest): Promise<CreateWorkspaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createWorkspaceEx(request, headers, runtime);
  }

  /**
   * Description: 创建workspace
   * Summary: 创建workspace
   */
  async createWorkspaceEx(request: CreateWorkspaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateWorkspaceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateWorkspaceResponse>(await this.doRequest("1.0", "antcloud.deps.workspace.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateWorkspaceResponse({}));
  }

  /**
   * Description: 查询workspace列表2.0。
   * Summary: 查询workspace列表2.0
   */
  async listWorkspace(request: ListWorkspaceRequest): Promise<ListWorkspaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listWorkspaceEx(request, headers, runtime);
  }

  /**
   * Description: 查询workspace列表2.0。
   * Summary: 查询workspace列表2.0
   */
  async listWorkspaceEx(request: ListWorkspaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListWorkspaceResponse> {
    Util.validateModel(request);
    return $tea.cast<ListWorkspaceResponse>(await this.doRequest("1.0", "antcloud.deps.workspace.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListWorkspaceResponse({}));
  }

}
