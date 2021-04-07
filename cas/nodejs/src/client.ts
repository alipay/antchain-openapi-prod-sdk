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

// 资源所属的App
export class AssignedApp extends $tea.Model {
  // workspace_id
  workspaceId: string;
  // app_id
  appId: string;
  static names(): { [key: string]: string } {
    return {
      workspaceId: 'workspace_id',
      appId: 'app_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      workspaceId: 'string',
      appId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据库
export class Database extends $tea.Model {
  // app_ids
  appIds?: string[];
  // app_service_ids
  appServiceIds?: string[];
  // assignedApps
  assignedApps?: AssignedApp[];
  // assigned_app_service_ids
  assignedAppServiceIds?: string[];
  // autoRenew
  autoRenew?: boolean;
  // auto_renew_period
  autoRenewPeriod?: number;
  // connection_address
  connectionAddress?: string;
  // cpu
  cpu?: number;
  // description
  description?: string;
  // engine
  engine?: string;
  // engine_version
  engineVersion?: string;
  // iaasId
  iaasId?: string;
  // iaas_type
  iaasType?: string;
  // id
  id: string;
  // master_zone_id
  masterZoneId?: string;
  // max_connections
  maxConnections?: number;
  // max_iops
  maxIops?: number;
  // memory
  memory?: number;
  // name
  name: string;
  // network_type
  networkType?: string;
  // net_type
  netType?: string;
  // port
  port?: number;
  // shared_workspace_ids
  sharedWorkspaceIds?: string[];
  // spec_iaas_id
  specIaasId?: string;
  // status
  status: string;
  // storage
  storage?: number;
  // type
  type?: string;
  // utc_create
  utcCreate?: string;
  // utc_modified
  utcModified?: string;
  // vpc_id
  vpcId?: string;
  // v_switch_iaas_id
  vSwitchIaasId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      appIds: 'app_ids',
      appServiceIds: 'app_service_ids',
      assignedApps: 'assigned_apps',
      assignedAppServiceIds: 'assigned_app_service_ids',
      autoRenew: 'auto_renew',
      autoRenewPeriod: 'auto_renew_period',
      connectionAddress: 'connection_address',
      cpu: 'cpu',
      description: 'description',
      engine: 'engine',
      engineVersion: 'engine_version',
      iaasId: 'iaas_id',
      iaasType: 'iaas_type',
      id: 'id',
      masterZoneId: 'master_zone_id',
      maxConnections: 'max_connections',
      maxIops: 'max_iops',
      memory: 'memory',
      name: 'name',
      networkType: 'network_type',
      netType: 'net_type',
      port: 'port',
      sharedWorkspaceIds: 'shared_workspace_ids',
      specIaasId: 'spec_iaas_id',
      status: 'status',
      storage: 'storage',
      type: 'type',
      utcCreate: 'utc_create',
      utcModified: 'utc_modified',
      vpcId: 'vpc_id',
      vSwitchIaasId: 'v_switch_iaas_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appIds: { 'type': 'array', 'itemType': 'string' },
      appServiceIds: { 'type': 'array', 'itemType': 'string' },
      assignedApps: { 'type': 'array', 'itemType': AssignedApp },
      assignedAppServiceIds: { 'type': 'array', 'itemType': 'string' },
      autoRenew: 'boolean',
      autoRenewPeriod: 'number',
      connectionAddress: 'string',
      cpu: 'number',
      description: 'string',
      engine: 'string',
      engineVersion: 'string',
      iaasId: 'string',
      iaasType: 'string',
      id: 'string',
      masterZoneId: 'string',
      maxConnections: 'number',
      maxIops: 'number',
      memory: 'number',
      name: 'string',
      networkType: 'string',
      netType: 'string',
      port: 'number',
      sharedWorkspaceIds: { 'type': 'array', 'itemType': 'string' },
      specIaasId: 'string',
      status: 'string',
      storage: 'number',
      type: 'string',
      utcCreate: 'string',
      utcModified: 'string',
      vpcId: 'string',
      vSwitchIaasId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// RegionView
export class RegionView extends $tea.Model {
  // id
  id: string;
  // identity
  identity: string;
  // providerId
  providerId: string;
  // name
  name: string;
  // state
  state: string;
  // description
  description: string;
  // networkType
  networkType: string;
  // availableNetworkTypes
  availableNetworkTypes: string[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      identity: 'identity',
      providerId: 'provider_id',
      name: 'name',
      state: 'state',
      description: 'description',
      networkType: 'network_type',
      availableNetworkTypes: 'available_network_types',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      identity: 'string',
      providerId: 'string',
      name: 'string',
      state: 'string',
      description: 'string',
      networkType: 'string',
      availableNetworkTypes: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// WorkspaceZoneView
export class WorkspaceZoneView extends $tea.Model {
  // id
  id: string;
  // identity
  identity: string;
  // name
  name: string;
  // state
  state: string;
  // description
  description: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      identity: 'identity',
      name: 'name',
      state: 'state',
      description: 'description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      identity: 'string',
      name: 'string',
      state: 'string',
      description: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 一个 key-value 键值对
export class MapStringToStringEntity extends $tea.Model {
  // 键名
  key: string;
  // 键值
  value: string;
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

// disk related computer infos
export class DiskComputer extends $tea.Model {
  // name
  name?: string;
  // id
  id?: string;
  // iaas id
  iaasId?: string;
  // status
  status?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      id: 'id',
      iaasId: 'iaas_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      id: 'string',
      iaasId: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// CloudPlatform
export class CloudPlatform extends $tea.Model {
  // host
  host?: string;
  // login_name
  loginName?: string;
  // name
  name?: string;
  // password
  password?: string;
  static names(): { [key: string]: string } {
    return {
      host: 'host',
      loginName: 'login_name',
      name: 'name',
      password: 'password',
    };
  }

  static types(): { [key: string]: any } {
    return {
      host: 'string',
      loginName: 'string',
      name: 'string',
      password: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// db account
export class DatabaseAccount extends $tea.Model {
  // database
  database?: Database;
  // description
  description?: string;
  // iaas_type
  iaasType?: string;
  // id
  id: string;
  // 名称
  name: string;
  // 密码
  password: string;
  // 权限
  privilege: string;
  // status
  status?: string;
  // utc_create
  utcCreate?: string;
  // utc_modified
  utcModified?: string;
  static names(): { [key: string]: string } {
    return {
      database: 'database',
      description: 'description',
      iaasType: 'iaas_type',
      id: 'id',
      name: 'name',
      password: 'password',
      privilege: 'privilege',
      status: 'status',
      utcCreate: 'utc_create',
      utcModified: 'utc_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      database: Database,
      description: 'string',
      iaasType: 'string',
      id: 'string',
      name: 'string',
      password: 'string',
      privilege: 'string',
      status: 'string',
      utcCreate: 'string',
      utcModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户信息
export class UserInfo extends $tea.Model {
  // ID
  id: string;
  // 用户来源系统，例如BUC,LDAP
  sourceSystem?: string;
  // 用户在源系统的id
  sourceUserId?: string;
  // 登录名
  loginName?: string;
  // 真实名
  realName?: string;
  // 昵称
  nickName?: string;
  // 客户ID
  customerId?: string;
  // 是否超级管理员
  type?: string;
  // 用户状态
  status?: string;
  // 即时通信账号
  imAccount?: string;
  // 邮箱
  email?: string;
  // 联系座机
  phone?: string;
  // 手机号
  mobile?: string;
  // 工号
  workNo?: string;
  // 英文名
  enName?: string;
  // 性别
  sex?: string;
  // 国籍
  nationCountry?: string;
  // 民族
  nation?: string;
  // 个人照片路径
  personalPhoto?: string;
  // 上次登录时间.
  lastLogonTime?: string;
  // 创建时间
  gmtCreate?: string;
  // 修改时间
  gmtModified?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      sourceSystem: 'source_system',
      sourceUserId: 'source_user_id',
      loginName: 'login_name',
      realName: 'real_name',
      nickName: 'nick_name',
      customerId: 'customer_id',
      type: 'type',
      status: 'status',
      imAccount: 'im_account',
      email: 'email',
      phone: 'phone',
      mobile: 'mobile',
      workNo: 'work_no',
      enName: 'en_name',
      sex: 'sex',
      nationCountry: 'nation_country',
      nation: 'nation',
      personalPhoto: 'personal_photo',
      lastLogonTime: 'last_logon_time',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      sourceSystem: 'string',
      sourceUserId: 'string',
      loginName: 'string',
      realName: 'string',
      nickName: 'string',
      customerId: 'string',
      type: 'string',
      status: 'string',
      imAccount: 'string',
      email: 'string',
      phone: 'string',
      mobile: 'string',
      workNo: 'string',
      enName: 'string',
      sex: 'string',
      nationCountry: 'string',
      nation: 'string',
      personalPhoto: 'string',
      lastLogonTime: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// WorkspaceView
export class WorkspaceView extends $tea.Model {
  // id
  id: string;
  // identity
  identity: string;
  // name
  name: string;
  // status
  status: string;
  // region
  region: RegionView;
  // zones
  zones: WorkspaceZoneView[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      identity: 'identity',
      name: 'name',
      status: 'status',
      region: 'region',
      zones: 'zones',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      identity: 'string',
      name: 'string',
      status: 'string',
      region: RegionView,
      zones: { 'type': 'array', 'itemType': WorkspaceZoneView },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// scope
export class Scope extends $tea.Model {
  // cell identity
  cell?: string;
  // region identity
  region?: string;
  // tenant name
  tenant?: string;
  // workspace
  workspace?: string;
  // workspace_group
  workspaceGroup?: string;
  // zone identity
  zone?: string;
  // cluster identity
  cluster?: string;
  static names(): { [key: string]: string } {
    return {
      cell: 'cell',
      region: 'region',
      tenant: 'tenant',
      workspace: 'workspace',
      workspaceGroup: 'workspace_group',
      zone: 'zone',
      cluster: 'cluster',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cell: 'string',
      region: 'string',
      tenant: 'string',
      workspace: 'string',
      workspaceGroup: 'string',
      zone: 'string',
      cluster: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// workspace zone
export class WorkspaceZoneDto extends $tea.Model {
  // id
  id: string;
  // workspace_id
  workspaceId: string;
  // zone_id
  zoneId: string;
  // zone name
  zoneName?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      workspaceId: 'workspace_id',
      zoneId: 'zone_id',
      zoneName: 'zone_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      workspaceId: 'string',
      zoneId: 'string',
      zoneName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 代码仓库
export class CodeRepository extends $tea.Model {
  // 代码仓库ID
  id: string;
  // 名称
  name: string;
  // VCS源代码管理系统
  type?: string;
  // 负责人
  owner?: string;
  // 源代码地址
  sourceLocation?: string;
  // 被SCM管理的远程仓库ID
  remoteRepoId?: string;
  // 流程标记id(可选参数)
  instanceId?: string;
  // 是否初始化目录(可选参数，目前金融云传与不传都不初始化)
  isInitStandardPath?: boolean;
  // 代码库是否可复用(默认为不复用 0)
  repoReuse?: string;
  // 父代码库名称(reposReuse为0时可以不传)
  parentReposName?: string;
  // 代码仓库状态
  status?: string;
  // 扩展参数，JSON字符串
  extraParams?: string;
  // 是否使用已有仓库
  useExist?: boolean;
  // 分组名称
  groupName?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      type: 'type',
      owner: 'owner',
      sourceLocation: 'source_location',
      remoteRepoId: 'remote_repo_id',
      instanceId: 'instance_id',
      isInitStandardPath: 'is_init_standard_path',
      repoReuse: 'repo_reuse',
      parentReposName: 'parent_repos_name',
      status: 'status',
      extraParams: 'extra_params',
      useExist: 'use_exist',
      groupName: 'group_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      type: 'string',
      owner: 'string',
      sourceLocation: 'string',
      remoteRepoId: 'string',
      instanceId: 'string',
      isInitStandardPath: 'boolean',
      repoReuse: 'string',
      parentReposName: 'string',
      status: 'string',
      extraParams: 'string',
      useExist: 'boolean',
      groupName: 'string',
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

// Zone视图
export class ZoneView extends $tea.Model {
  // id
  id?: string;
  // name
  name?: string;
  // displayName
  displayName?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      displayName: 'display_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      displayName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用负责人
export class AppOwner extends $tea.Model {
  // 研发负责人
  devOwner?: UserInfo;
  // backup开发人员
  backupDevOwners?: UserInfo[];
  // 测试负责人
  testOwner?: UserInfo;
  // 备用测试人员
  backupTestOwners?: UserInfo[];
  // 运维负责人
  ops?: UserInfo;
  // 备用SRE人员
  backupOpses?: UserInfo[];
  // 开发architect负责人
  devArchitect?: UserInfo;
  // 备用Architects联系人
  backupDevArchitects?: UserInfo[];
  // 测试architect
  testArchitect?: UserInfo;
  // 备用测试architects
  backupTestArchitects?: UserInfo[];
  static names(): { [key: string]: string } {
    return {
      devOwner: 'dev_owner',
      backupDevOwners: 'backup_dev_owners',
      testOwner: 'test_owner',
      backupTestOwners: 'backup_test_owners',
      ops: 'ops',
      backupOpses: 'backup_opses',
      devArchitect: 'dev_architect',
      backupDevArchitects: 'backup_dev_architects',
      testArchitect: 'test_architect',
      backupTestArchitects: 'backup_test_architects',
    };
  }

  static types(): { [key: string]: any } {
    return {
      devOwner: UserInfo,
      backupDevOwners: { 'type': 'array', 'itemType': UserInfo },
      testOwner: UserInfo,
      backupTestOwners: { 'type': 'array', 'itemType': UserInfo },
      ops: UserInfo,
      backupOpses: { 'type': 'array', 'itemType': UserInfo },
      devArchitect: UserInfo,
      backupDevArchitects: { 'type': 'array', 'itemType': UserInfo },
      testArchitect: UserInfo,
      backupTestArchitects: { 'type': 'array', 'itemType': UserInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Sofa arche type
export class ScmSofaArchetype extends $tea.Model {
  // 用户创建archetype必须要的参数
  generateCode?: boolean;
  // Maven代码框架使用 groupId
  groupId?: string;
  // Maven代码框架使用 artifactId
  artifactId: string;
  // Maven代码框架使用 codePackage
  codePackage?: string;
  // Sofa代码框架使用 projectType
  projectType?: string;
  // Sofa代码框架使用 版本号
  version: string;
  // Sofa代码框架使用 编码方式
  encoding?: string;
  // 是否使用私有maven
  usePrivateRepo?: boolean;
  // 提供给快速研发平台使用，格式为JSON字符串
  metaData?: string;
  static names(): { [key: string]: string } {
    return {
      generateCode: 'generate_code',
      groupId: 'group_id',
      artifactId: 'artifact_id',
      codePackage: 'code_package',
      projectType: 'project_type',
      version: 'version',
      encoding: 'encoding',
      usePrivateRepo: 'use_private_repo',
      metaData: 'meta_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      generateCode: 'boolean',
      groupId: 'string',
      artifactId: 'string',
      codePackage: 'string',
      projectType: 'string',
      version: 'string',
      encoding: 'string',
      usePrivateRepo: 'boolean',
      metaData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 解决DbSchema结构嵌套用的，其他人不要用这个，用grant
export class DbSchemaGrant extends $tea.Model {
  // privilege
  privilege: string;
  // account
  account?: DatabaseAccount;
  static names(): { [key: string]: string } {
    return {
      privilege: 'privilege',
      account: 'account',
    };
  }

  static types(): { [key: string]: any } {
    return {
      privilege: 'string',
      account: DatabaseAccount,
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

// disk
export class Disk extends $tea.Model {
  // ssd, cloud_efficiency
  category?: string;
  // disk related computer info
  computer?: DiskComputer;
  // 是否同时删除自动快照
  deleteAutoSnapshot?: boolean;
  // 磁盘是否随container一起释放
  deleteWithComputer?: boolean;
  // device info
  device?: string;
  // 磁盘是否执行自动快照策略
  enableAutoSnapshot?: boolean;
  // iaasId
  iaasId?: string;
  // id
  id?: string;
  // 创建磁盘的镜像
  imageId?: string;
  // name
  name?: string;
  // 磁盘是否可卸载
  portable?: boolean;
  // providerId
  providerId?: string;
  // regionId
  regionId?: string;
  // disk size
  size?: number;
  // disk status
  status?: string;
  // tenantId
  tenantId?: string;
  // SYSTEM, DATA
  type?: string;
  // utcCreate
  utcCreate?: string;
  // utcModified
  utcModified?: string;
  // workspaceId
  workspaceId?: string;
  // zoneId
  zoneId?: string;
  static names(): { [key: string]: string } {
    return {
      category: 'category',
      computer: 'computer',
      deleteAutoSnapshot: 'delete_auto_snapshot',
      deleteWithComputer: 'delete_with_computer',
      device: 'device',
      enableAutoSnapshot: 'enable_auto_snapshot',
      iaasId: 'iaas_id',
      id: 'id',
      imageId: 'image_id',
      name: 'name',
      portable: 'portable',
      providerId: 'provider_id',
      regionId: 'region_id',
      size: 'size',
      status: 'status',
      tenantId: 'tenant_id',
      type: 'type',
      utcCreate: 'utc_create',
      utcModified: 'utc_modified',
      workspaceId: 'workspace_id',
      zoneId: 'zone_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      category: 'string',
      computer: DiskComputer,
      deleteAutoSnapshot: 'boolean',
      deleteWithComputer: 'boolean',
      device: 'string',
      enableAutoSnapshot: 'boolean',
      iaasId: 'string',
      id: 'string',
      imageId: 'string',
      name: 'string',
      portable: 'boolean',
      providerId: 'string',
      regionId: 'string',
      size: 'number',
      status: 'string',
      tenantId: 'string',
      type: 'string',
      utcCreate: 'string',
      utcModified: 'string',
      workspaceId: 'string',
      zoneId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用生命周期
export class AppLifeCycle extends $tea.Model {
  // ID
  id?: string;
  // 应用ID
  appId?: string;
  // 工作空间ID
  workspaceId?: string;
  // 应用状态
  state?: string;
  // 最近运维单号
  lastOpsorderId?: string;
  // 上次发布版本
  lastDeployVersion: string;
  // 上次发布时间
  lastDeployTime: string;
  // 上线时间
  onlineTime?: string;
  // 创建时间
  gmtCreate?: string;
  // 最近修改时间
  gmtModified?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      appId: 'app_id',
      workspaceId: 'workspace_id',
      state: 'state',
      lastOpsorderId: 'last_opsorder_id',
      lastDeployVersion: 'last_deploy_version',
      lastDeployTime: 'last_deploy_time',
      onlineTime: 'online_time',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      appId: 'string',
      workspaceId: 'string',
      state: 'string',
      lastOpsorderId: 'string',
      lastDeployVersion: 'string',
      lastDeployTime: 'string',
      onlineTime: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用扩展信息
export class AppExtraInfo extends $tea.Model {
  // ID
  id?: string;
  // 名称
  name?: string;
  // 值
  value?: string;
  // 描述
  description?: string;
  // 模板ID
  templateId?: string;
  // 模板类型
  type?: string;
  // 创建时间
  utcCreate?: string;
  // 最近修改时间
  utcModified?: string;
  // 应用扩展信息ID
  appExtrainfoId?: string;
  // 应用ID
  appId?: string;
  // 模板数据ID
  templateDataId?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      value: 'value',
      description: 'description',
      templateId: 'template_id',
      type: 'type',
      utcCreate: 'utc_create',
      utcModified: 'utc_modified',
      appExtrainfoId: 'app_extrainfo_id',
      appId: 'app_id',
      templateDataId: 'template_data_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      value: 'string',
      description: 'string',
      templateId: 'string',
      type: 'string',
      utcCreate: 'string',
      utcModified: 'string',
      appExtrainfoId: 'string',
      appId: 'string',
      templateDataId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云日志服务(SLS)-脱敏功能配置
export class SLSConfigSensitiveKey extends $tea.Model {
  // 是否替换该字段中所有的敏感内容。建议设置为true
  all: boolean;
  // 当type设置为const时必须填写
  constValue?: string;
  // 日志Key名称
  key: string;
  // 敏感内容的前缀
  regexBegin: string;
  // 敏感内容正则表达式。
  regexContent: string;
  // 脱敏方式，取值为const、md5。
  // 若取值为const，则将敏感内容替换成const字段取值内容。
  // 若取值为md5，则将敏感内容替换为其对应的MD5值。
  type: string;
  static names(): { [key: string]: string } {
    return {
      all: 'all',
      constValue: 'const_value',
      key: 'key',
      regexBegin: 'regex_begin',
      regexContent: 'regex_content',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      all: 'boolean',
      constValue: 'string',
      key: 'string',
      regexBegin: 'string',
      regexContent: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// LoadBalancer
export class LoadBalancer extends $tea.Model {
  // app_id
  appId?: string;
  // app_service_ids
  appServiceIds?: string[];
  // assigned_app_ids
  assignedAppIds?: string[];
  // assigned_app_service_ids
  assignedAppServiceIds?: string[];
  // auto_renew
  autoRenew?: boolean;
  // auto_renew_period
  autoRenewPeriod?: number;
  // bandwidth
  bandwidth?: number;
  // cluster_id
  clusterId?: string;
  // cluster_mode
  clusterMode?: boolean;
  // domains
  domains?: string[];
  // iaas_id
  iaasId?: string;
  // iaas_type
  iaasType?: string;
  // lb id
  id: string;
  // internet_charge_type
  internetChargeType?: string;
  // lb名称
  name?: string;
  // network_type
  networkType?: string;
  // provider_id
  providerId?: string;
  // regionId
  regionId?: string;
  // scope
  scope?: Scope;
  // share_mode
  shareMode?: boolean;
  // lb状态
  status?: string;
  // utc_create
  utcCreate?: string;
  // utc_modified
  utcModified?: string;
  // vip_addresses
  vipAddresses?: string[];
  // vip_address_type
  vipAddressType?: string;
  // vip_type
  vipType?: string;
  // vpc_id
  vpcId?: string;
  // v_switch_iaas_id
  vSwitchIaasId?: string;
  // workspace_id
  workspaceId?: string;
  // zone_id
  zoneId?: string;
  // options，扩展字段
  options?: MapStringToStringEntity[];
  // load_balancer_spec
  loadBalancerSpec?: string;
  static names(): { [key: string]: string } {
    return {
      appId: 'app_id',
      appServiceIds: 'app_service_ids',
      assignedAppIds: 'assigned_app_ids',
      assignedAppServiceIds: 'assigned_app_service_ids',
      autoRenew: 'auto_renew',
      autoRenewPeriod: 'auto_renew_period',
      bandwidth: 'bandwidth',
      clusterId: 'cluster_id',
      clusterMode: 'cluster_mode',
      domains: 'domains',
      iaasId: 'iaas_id',
      iaasType: 'iaas_type',
      id: 'id',
      internetChargeType: 'internet_charge_type',
      name: 'name',
      networkType: 'network_type',
      providerId: 'provider_id',
      regionId: 'region_id',
      scope: 'scope',
      shareMode: 'share_mode',
      status: 'status',
      utcCreate: 'utc_create',
      utcModified: 'utc_modified',
      vipAddresses: 'vip_addresses',
      vipAddressType: 'vip_address_type',
      vipType: 'vip_type',
      vpcId: 'vpc_id',
      vSwitchIaasId: 'v_switch_iaas_id',
      workspaceId: 'workspace_id',
      zoneId: 'zone_id',
      options: 'options',
      loadBalancerSpec: 'load_balancer_spec',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appId: 'string',
      appServiceIds: { 'type': 'array', 'itemType': 'string' },
      assignedAppIds: { 'type': 'array', 'itemType': 'string' },
      assignedAppServiceIds: { 'type': 'array', 'itemType': 'string' },
      autoRenew: 'boolean',
      autoRenewPeriod: 'number',
      bandwidth: 'number',
      clusterId: 'string',
      clusterMode: 'boolean',
      domains: { 'type': 'array', 'itemType': 'string' },
      iaasId: 'string',
      iaasType: 'string',
      id: 'string',
      internetChargeType: 'string',
      name: 'string',
      networkType: 'string',
      providerId: 'string',
      regionId: 'string',
      scope: Scope,
      shareMode: 'boolean',
      status: 'string',
      utcCreate: 'string',
      utcModified: 'string',
      vipAddresses: { 'type': 'array', 'itemType': 'string' },
      vipAddressType: 'string',
      vipType: 'string',
      vpcId: 'string',
      vSwitchIaasId: 'string',
      workspaceId: 'string',
      zoneId: 'string',
      options: { 'type': 'array', 'itemType': MapStringToStringEntity },
      loadBalancerSpec: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 路由的下一跳详细信息。
export class NextHopItem extends $tea.Model {
  // 	
  // 下一跳的类型。
  // 
  // Instance：ECS实例。
  // HaVip：高可用虚拟IP。
  // VpnGateway：VPN网关。
  // NatGateway：NAT网关。
  // NetworkInterface：辅助弹性网卡。
  // RouterInterface：路由器接口。
  // IPv6Gateway：IPv6网关。
  nextHopType?: string;
  // 下一跳实例的ID。
  nextHopId?: string;
  // 是否启用下一跳。
  // 
  // 0：不启用。
  // 1：启用。
  enable?: number;
  // 下一跳的路由权重。
  weight?: number;
  static names(): { [key: string]: string } {
    return {
      nextHopType: 'next_hop_type',
      nextHopId: 'next_hop_id',
      enable: 'enable',
      weight: 'weight',
    };
  }

  static types(): { [key: string]: any } {
    return {
      nextHopType: 'string',
      nextHopId: 'string',
      enable: 'number',
      weight: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用等级
export class AppLevel extends $tea.Model {
  // ID
  id: string;
  // 应用等级名称
  name?: string;
  // 创建者
  creatorId?: string;
  // 租户ID
  tenantId?: string;
  // 创建时间
  utcCreate?: string;
  // 最近修改时间
  utcModified?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      creatorId: 'creator_id',
      tenantId: 'tenant_id',
      utcCreate: 'utc_create',
      utcModified: 'utc_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      creatorId: 'string',
      tenantId: 'string',
      utcCreate: 'string',
      utcModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// WorkspaceGroupView
export class WorkspaceGroupView extends $tea.Model {
  // id
  id: string;
  // name
  name: string;
  // displayName
  displayName: string;
  // tenantId
  tenantId: string;
  // properties
  properties: string;
  // status
  status: string;
  // workspaces
  workspaces: WorkspaceView[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      displayName: 'display_name',
      tenantId: 'tenant_id',
      properties: 'properties',
      status: 'status',
      workspaces: 'workspaces',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      displayName: 'string',
      tenantId: 'string',
      properties: 'string',
      status: 'string',
      workspaces: { 'type': 'array', 'itemType': WorkspaceView },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用于Task的嵌套Request，其他API请直接使用Request
export class TaskRequest extends $tea.Model {
  // id
  id: string;
  // operator
  operator?: string;
  // token
  token?: string;
  // type
  type: string;
  // status
  status?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      operator: 'operator',
      token: 'token',
      type: 'type',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      operator: 'string',
      token: 'string',
      type: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// IaasRequest
export class IaasRequest extends $tea.Model {
  // requestMethod
  requestMethod?: string;
  // requestUrl
  requestUrl?: string;
  // requestBody
  requestBody?: string;
  // request_headers
  requestHeaders?: MapStringToStringEntity[];
  static names(): { [key: string]: string } {
    return {
      requestMethod: 'request_method',
      requestUrl: 'request_url',
      requestBody: 'request_body',
      requestHeaders: 'request_headers',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestMethod: 'string',
      requestUrl: 'string',
      requestBody: 'string',
      requestHeaders: { 'type': 'array', 'itemType': MapStringToStringEntity },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// IaasResponse
export class IaasResponse extends $tea.Model {
  // response_body
  responseBody?: string;
  // response_headers
  responseHeaders?: MapStringToStringEntity[];
  static names(): { [key: string]: string } {
    return {
      responseBody: 'response_body',
      responseHeaders: 'response_headers',
    };
  }

  static types(): { [key: string]: any } {
    return {
      responseBody: 'string',
      responseHeaders: { 'type': 'array', 'itemType': MapStringToStringEntity },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分页查询基类
export class PaginationQuery extends $tea.Model {
  // 当前页数
  currentPage?: number;
  // isLocaleEnabled
  isLocaleEnabled?: boolean;
  // local
  local?: string;
  // 分页大小
  pageSize?: number;
  // paging
  paging?: boolean;
  // 查询类型
  queryType?: string;
  // search
  search?: boolean;
  // 排序关键字列表
  orders?: string[];
  static names(): { [key: string]: string } {
    return {
      currentPage: 'current_page',
      isLocaleEnabled: 'is_locale_enabled',
      local: 'local',
      pageSize: 'page_size',
      paging: 'paging',
      queryType: 'query_type',
      search: 'search',
      orders: 'orders',
    };
  }

  static types(): { [key: string]: any } {
    return {
      currentPage: 'number',
      isLocaleEnabled: 'boolean',
      local: 'string',
      pageSize: 'number',
      paging: 'boolean',
      queryType: 'string',
      search: 'boolean',
      orders: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 部署单元（Cell）
export class CellView extends $tea.Model {
  // id
  id?: string;
  // name
  name?: string;
  // displayName
  displayName?: string;
  // description
  description?: string;
  // deploymentZoneId
  deploymentZoneId?: string;
  // workspaceId
  workspaceId?: string;
  // workspaceGroupId
  workspaceGroupId?: string;
  // status
  status?: string;
  // masterZoneId
  masterZoneId?: string;
  // appendedZoneIds
  appendedZoneIds?: string[];
  // List<ZoneView> zones
  zones?: ZoneView[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      displayName: 'display_name',
      description: 'description',
      deploymentZoneId: 'deployment_zone_id',
      workspaceId: 'workspace_id',
      workspaceGroupId: 'workspace_group_id',
      status: 'status',
      masterZoneId: 'master_zone_id',
      appendedZoneIds: 'appended_zone_ids',
      zones: 'zones',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      displayName: 'string',
      description: 'string',
      deploymentZoneId: 'string',
      workspaceId: 'string',
      workspaceGroupId: 'string',
      status: 'string',
      masterZoneId: 'string',
      appendedZoneIds: { 'type': 'array', 'itemType': 'string' },
      zones: { 'type': 'array', 'itemType': ZoneView },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// TaskVO用Resource字段
export class Resource extends $tea.Model {
  // name
  name: string;
  // description
  description?: string;
  // instance_charge_type
  instanceChargeType?: string;
  // expiredTime
  expiredTime?: string;
  // auto_renew
  autoRenew?: boolean;
  // autoRenewPeriod
  autoRenewPeriod?: number;
  // iaas_id
  iaasId?: string;
  // iaas_type
  iaasType?: string;
  // region_id
  regionId?: string;
  // zone_id
  zoneId: string;
  // id
  id: string;
  // utc_create
  utcCreate?: string;
  // utc_modified
  utcModified?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      description: 'description',
      instanceChargeType: 'instance_charge_type',
      expiredTime: 'expired_time',
      autoRenew: 'auto_renew',
      autoRenewPeriod: 'auto_renew_period',
      iaasId: 'iaas_id',
      iaasType: 'iaas_type',
      regionId: 'region_id',
      zoneId: 'zone_id',
      id: 'id',
      utcCreate: 'utc_create',
      utcModified: 'utc_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      description: 'string',
      instanceChargeType: 'string',
      expiredTime: 'string',
      autoRenew: 'boolean',
      autoRenewPeriod: 'number',
      iaasId: 'string',
      iaasType: 'string',
      regionId: 'string',
      zoneId: 'string',
      id: 'string',
      utcCreate: 'string',
      utcModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AppManifest
export class AppManifest extends $tea.Model {
  // app_id
  appId?: string;
  // app_version
  appVersion?: string;
  // code_commit
  codeCommit?: CodeCommit;
  // etag
  etag?: string;
  // id
  id?: string;
  // location
  location?: string;
  // name
  name?: string;
  // remark
  remark?: string;
  // store_location
  storeLocation?: string;
  // utc_create
  utcCreate?: string;
  // utc_modified
  utcModified?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      appId: 'app_id',
      appVersion: 'app_version',
      codeCommit: 'code_commit',
      etag: 'etag',
      id: 'id',
      location: 'location',
      name: 'name',
      remark: 'remark',
      storeLocation: 'store_location',
      utcCreate: 'utc_create',
      utcModified: 'utc_modified',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appId: 'string',
      appVersion: 'string',
      codeCommit: CodeCommit,
      etag: 'string',
      id: 'string',
      location: 'string',
      name: 'string',
      remark: 'string',
      storeLocation: 'string',
      utcCreate: 'string',
      utcModified: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 监听器健康检查配置
export class ListenerHealthMonitor extends $tea.Model {
  // check_type
  checkType?: string;
  // 默认 80
  connectPort?: number;
  // 域名
  domain?: string;
  // 健康阈值
  healthyThreshold?: number;
  // health_check_http_code
  healthCheckHttpCode?: string[];
  // http_method
  httpMethod?: string;
  // id
  id?: string;
  // 监控检查间隔
  interval: number;
  // 超时时间
  timeout: number;
  // 不健康阈值
  unHealthyThreshold?: number;
  // uri
  uri?: string;
  static names(): { [key: string]: string } {
    return {
      checkType: 'check_type',
      connectPort: 'connect_port',
      domain: 'domain',
      healthyThreshold: 'healthy_threshold',
      healthCheckHttpCode: 'health_check_http_code',
      httpMethod: 'http_method',
      id: 'id',
      interval: 'interval',
      timeout: 'timeout',
      unHealthyThreshold: 'un_healthy_threshold',
      uri: 'uri',
    };
  }

  static types(): { [key: string]: any } {
    return {
      checkType: 'string',
      connectPort: 'number',
      domain: 'string',
      healthyThreshold: 'number',
      healthCheckHttpCode: { 'type': 'array', 'itemType': 'string' },
      httpMethod: 'string',
      id: 'string',
      interval: 'number',
      timeout: 'number',
      unHealthyThreshold: 'number',
      uri: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用分组
export class AppDomain extends $tea.Model {
  // 创建人id
  creatorId?: string;
  // id
  id?: string;
  // 名称
  name?: string;
  // parentId
  parentId?: string;
  // 租户id
  tenantId?: string;
  // toRootPath
  toRootPath?: string;
  // utcCreate
  utcCreate?: string;
  // utcModified
  utcModified?: string;
  static names(): { [key: string]: string } {
    return {
      creatorId: 'creator_id',
      id: 'id',
      name: 'name',
      parentId: 'parent_id',
      tenantId: 'tenant_id',
      toRootPath: 'to_root_path',
      utcCreate: 'utc_create',
      utcModified: 'utc_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      creatorId: 'string',
      id: 'string',
      name: 'string',
      parentId: 'string',
      tenantId: 'string',
      toRootPath: 'string',
      utcCreate: 'string',
      utcModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云日志服务(SLS)-日志配置-输出类型配置
export class SLSConfigOutputDetail extends $tea.Model {
  // 项目名称，必须为请求的project名。
  projectName: string;
  // 日志库名称
  logstoreName: string;
  static names(): { [key: string]: string } {
    return {
      projectName: 'project_name',
      logstoreName: 'logstore_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      projectName: 'string',
      logstoreName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用信息
export class AppView extends $tea.Model {
  // 应用组id
  appDomainId?: string;
  // 应用扩展信息
  appExtraInfos?: AppExtraInfo[];
  // 应用等级
  appLevel?: AppLevel;
  // 应用负责人
  appOwner?: AppOwner;
  // scm sofa archetype
  archetype?: ScmSofaArchetype;
  // 技术栈版本
  buildpackVersion?: string;
  // 中文名称
  chineseName?: string;
  // 代码仓库
  codeRepository?: CodeRepository;
  // 描述信息
  description?: string;
  // 扩展参数，JSOn字符串
  extraParams?: string;
  // 应用ID
  id: string;
  // 是否组件中心应用
  isService?: boolean;
  // 应用名称
  name: string;
  // 负责人ID
  ownerId?: string;
  // 技术栈所属分类ID
  stackId: string;
  // 应用状态
  status?: string;
  // 应用标签，JSOn字符串
  tags?: string;
  // 租户ID
  tenantId?: string;
  // 创建时间
  utcCreate?: string;
  // 修改时间
  utcModified?: string;
  // 工作空间ID
  workspaceId?: string;
  // 负责人名称
  ownerName?: string;
  // 应用负责人真实名称
  realOwnerName: string;
  // 应用域路径名
  domainNames?: string[];
  // 应用分组名称
  appDomainName: string;
  // 应用等级名称
  appLevelName: string;
  // 技术栈名称
  stackName?: string;
  // 技术栈版本
  stackVersion?: string;
  // 服务器数量
  containerCount?: number;
  // 数据库个数
  databaseCount?: number;
  // SLB个数
  slbCount?: number;
  // ocs个数
  ocsCount?: number;
  // 发布包个数
  packageCount?: number;
  // 生命周期信息
  lifeCycle?: AppLifeCycle;
  static names(): { [key: string]: string } {
    return {
      appDomainId: 'app_domain_id',
      appExtraInfos: 'app_extra_infos',
      appLevel: 'app_level',
      appOwner: 'app_owner',
      archetype: 'archetype',
      buildpackVersion: 'buildpack_version',
      chineseName: 'chinese_name',
      codeRepository: 'code_repository',
      description: 'description',
      extraParams: 'extra_params',
      id: 'id',
      isService: 'is_service',
      name: 'name',
      ownerId: 'owner_id',
      stackId: 'stack_id',
      status: 'status',
      tags: 'tags',
      tenantId: 'tenant_id',
      utcCreate: 'utc_create',
      utcModified: 'utc_modified',
      workspaceId: 'workspace_id',
      ownerName: 'owner_name',
      realOwnerName: 'real_owner_name',
      domainNames: 'domain_names',
      appDomainName: 'app_domain_name',
      appLevelName: 'app_level_name',
      stackName: 'stack_name',
      stackVersion: 'stack_version',
      containerCount: 'container_count',
      databaseCount: 'database_count',
      slbCount: 'slb_count',
      ocsCount: 'ocs_count',
      packageCount: 'package_count',
      lifeCycle: 'life_cycle',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appDomainId: 'string',
      appExtraInfos: { 'type': 'array', 'itemType': AppExtraInfo },
      appLevel: AppLevel,
      appOwner: AppOwner,
      archetype: ScmSofaArchetype,
      buildpackVersion: 'string',
      chineseName: 'string',
      codeRepository: CodeRepository,
      description: 'string',
      extraParams: 'string',
      id: 'string',
      isService: 'boolean',
      name: 'string',
      ownerId: 'string',
      stackId: 'string',
      status: 'string',
      tags: 'string',
      tenantId: 'string',
      utcCreate: 'string',
      utcModified: 'string',
      workspaceId: 'string',
      ownerName: 'string',
      realOwnerName: 'string',
      domainNames: { 'type': 'array', 'itemType': 'string' },
      appDomainName: 'string',
      appLevelName: 'string',
      stackName: 'string',
      stackVersion: 'string',
      containerCount: 'number',
      databaseCount: 'number',
      slbCount: 'number',
      ocsCount: 'number',
      packageCount: 'number',
      lifeCycle: AppLifeCycle,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 一个部署起来提供服务的应用实例信息
export class AppService extends $tea.Model {
  // app_id
  appId?: string;
  // app_name
  appName?: string;
  // buildpack_full_version
  buildpackFullVersion?: string;
  // buildpack_id
  buildpackId?: string;
  // cell_ids
  cellIds?: string[];
  // description
  description?: string;
  // extend_properties
  extendProperties?: string;
  // id
  id?: string;
  // is_default
  isDefault?: boolean;
  // is_service
  isService?: boolean;
  // last_deploy_status
  lastDeployStatus?: string;
  // last_deploy_version
  lastDeployVersion?: string;
  // last_ops_order_id
  lastOpsOrderId?: string;
  // name
  name?: string;
  // owner_id
  ownerId?: string;
  // techstack_id
  techstackId?: number;
  // techstack_identity
  techstackIdentity?: string;
  // techstack_name
  techstackName?: string;
  // utc_create
  utcCreate?: string;
  // utc_modified
  utcModified?: string;
  // workspace_id
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

// 路由条目的详细信息。
export class VRouteEntry extends $tea.Model {
  // 路由条目的目标网段。
  desinationCidrBlock?: string;
  // 下一跳的实例ID。
  instanceId?: string;
  // 下一跳的实例名称。
  instanceName?: string;
  // 路由条目ID。
  nextHopId?: string;
  // 路由的下一跳列表。
  nextHopItemList?: NextHopItem[];
  // 路由类型。
  // 
  // local：交换机路由。
  // service：云服务路由。
  // classicLink：开启ClassicLink功能后系统自动添加的路由。
  nextHopType?: string;
  // 路由条目所属路由表的ID。
  routeTableId?: string;
  // 	
  // 路由条目的状态。
  // 
  // Pending：配置中。
  // Available：可用。
  // Modifying：修改中。
  status?: string;
  // 路由条目的类型。
  // 
  // System：系统路由。
  // Custom：自定义路由。
  // BGP：BGP路由。
  // 
  type?: string;
  static names(): { [key: string]: string } {
    return {
      desinationCidrBlock: 'desination_cidr_block',
      instanceId: 'instance_id',
      instanceName: 'instance_name',
      nextHopId: 'next_hop_id',
      nextHopItemList: 'next_hop_item_list',
      nextHopType: 'next_hop_type',
      routeTableId: 'route_table_id',
      status: 'status',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      desinationCidrBlock: 'string',
      instanceId: 'string',
      instanceName: 'string',
      nextHopId: 'string',
      nextHopItemList: { 'type': 'array', 'itemType': NextHopItem },
      nextHopType: 'string',
      routeTableId: 'string',
      status: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// vpc import info
export class ImportInfo extends $tea.Model {
  // 已导入的workspace name
  importedWorkspaceName?: string;
  // vpc是否已导入workspace
  isImported?: boolean;
  // 是否可以删除已导入的workspace
  isUnimportable?: boolean;
  // 不可删除已导入workspace的原因
  unimportableReason?: string;
  static names(): { [key: string]: string } {
    return {
      importedWorkspaceName: 'imported_workspace_name',
      isImported: 'is_imported',
      isUnimportable: 'is_unimportable',
      unimportableReason: 'unimportable_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      importedWorkspaceName: 'string',
      isImported: 'boolean',
      isUnimportable: 'boolean',
      unimportableReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Database ImportVO
export class ImportVO extends $tea.Model {
  // is_imported
  isImported: boolean;
  // imported_workspace_name
  importedWorkspaceName: string;
  // is_unimportable
  isUnimportable?: boolean;
  // unimportable_reason
  unimportableReason?: string;
  static names(): { [key: string]: string } {
    return {
      isImported: 'is_imported',
      importedWorkspaceName: 'imported_workspace_name',
      isUnimportable: 'is_unimportable',
      unimportableReason: 'unimportable_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      isImported: 'boolean',
      importedWorkspaceName: 'string',
      isUnimportable: 'boolean',
      unimportableReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// JoinedSecurityGroupVO
export class JoinedSecurityGroupVO extends $tea.Model {
  // iaas id
  iaasId?: string;
  // name
  name?: string;
  // workspace id
  workspaceId?: string;
  // workspace name
  workspaceName?: string;
  static names(): { [key: string]: string } {
    return {
      iaasId: 'iaas_id',
      name: 'name',
      workspaceId: 'workspace_id',
      workspaceName: 'workspace_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      iaasId: 'string',
      name: 'string',
      workspaceId: 'string',
      workspaceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 安全组规则
export class SecurityGroupRule extends $tea.Model {
  // 规则描述信息
  description?: string;
  // 目的端IP地址范围。支持CIDR格式和IPv4格式的IP地址范围。
  destCidrIp?: string;
  // 传输层协议。不区分大小写。取值范围：
  // 
  // icmp
  // gre
  // tcp
  // udp
  // all：支持所有协议
  ipProtocol?: string;
  // 经典网络类型安全组规则的网卡类型。取值范围：
  // 
  // internet：公网。
  // intranet：内网。
  // 默认值：internet。
  // 
  // 在以下情况中，参数NicType取值只能为intranet：
  // 
  // 安全组规则的网络类型为专有网络VPC时，您无需设置NicType参数，默认并且只能为intranet。
  // 当设置安全组之间互相访问时，即指定了DestGroupId且没有指定DestCidrIp时。
  nicType?: string;
  // 访问权限。取值范围：
  // 
  // accept：接受访问。
  // drop：拒绝访问，不返回拒绝信息。
  // 默认值：accept。
  policy?: string;
  // 目的端安全组开放的传输层协议相关的端口范围。取值范围：
  // 
  // TCP/UDP协议：取值范围为1~65535。使用斜线（/）隔开起始端口和终止端口。正确示范：1/200；错误示范：200/1。
  // ICMP协议：-1/-1。
  // GRE协议：-1/-1。
  // all：-1/-1。
  portRange?: string;
  // 安全组规则优先级。取值范围：1~100
  // 
  // 默认值：1。
  priority?: string;
  // 源端IP地址范围。支持CIDR格式和IPv4格式的IP地址范围。
  // 
  // 默认值：0.0.0.0/0。
  sourceCidrIp?: string;
  static names(): { [key: string]: string } {
    return {
      description: 'description',
      destCidrIp: 'dest_cidr_ip',
      ipProtocol: 'ip_protocol',
      nicType: 'nic_type',
      policy: 'policy',
      portRange: 'port_range',
      priority: 'priority',
      sourceCidrIp: 'source_cidr_ip',
    };
  }

  static types(): { [key: string]: any } {
    return {
      description: 'string',
      destCidrIp: 'string',
      ipProtocol: 'string',
      nicType: 'string',
      policy: 'string',
      portRange: 'string',
      priority: 'string',
      sourceCidrIp: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// WorkspaceWithGroupView
export class WorkspaceWithGroupView extends $tea.Model {
  // id
  id: string;
  // identity
  identity: string;
  // name
  name: string;
  // networkType
  networkType: string;
  // region
  region: RegionView;
  // status
  status: string;
  // tenantId
  tenantId: string;
  // zones
  zones: WorkspaceZoneView[];
  // workspaceGroup
  workspaceGroup: WorkspaceGroupView;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      identity: 'identity',
      name: 'name',
      networkType: 'network_type',
      region: 'region',
      status: 'status',
      tenantId: 'tenant_id',
      zones: 'zones',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      identity: 'string',
      name: 'string',
      networkType: 'string',
      region: RegionView,
      status: 'string',
      tenantId: 'string',
      zones: { 'type': 'array', 'itemType': WorkspaceZoneView },
      workspaceGroup: WorkspaceGroupView,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AcsClusterUnit
export class AcsClusterUnit extends $tea.Model {
  // cluster_id
  clusterId: string;
  // address
  address?: string;
  // unit_status
  unitStatus?: number;
  // create_time
  createTime?: string;
  // modify_time
  modifyTime?: string;
  // container_id
  containerId?: string;
  static names(): { [key: string]: string } {
    return {
      clusterId: 'cluster_id',
      address: 'address',
      unitStatus: 'unit_status',
      createTime: 'create_time',
      modifyTime: 'modify_time',
      containerId: 'container_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      clusterId: 'string',
      address: 'string',
      unitStatus: 'number',
      createTime: 'string',
      modifyTime: 'string',
      containerId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// WorkspaceRegion
export class WorkspaceRegion extends $tea.Model {
  // id
  id: string;
  // workspaceId
  workspaceId: string;
  // regionId
  regionId: string;
  // type
  type: string;
  // securedIsolationIdentity
  securedIsolationIdentity: string;
  // securedIsolationName
  securedIsolationName: string;
  // securedZoneId
  securedZoneId: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      workspaceId: 'workspace_id',
      regionId: 'region_id',
      type: 'type',
      securedIsolationIdentity: 'secured_isolation_identity',
      securedIsolationName: 'secured_isolation_name',
      securedZoneId: 'secured_zone_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      workspaceId: 'string',
      regionId: 'string',
      type: 'string',
      securedIsolationIdentity: 'string',
      securedIsolationName: 'string',
      securedZoneId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// WorkspaceRegionDto
export class WorkspaceRegionDto extends $tea.Model {
  // id
  id: string;
  // networkType
  networkType?: string;
  // region id
  regionId: string;
  // regionName
  regionName?: string;
  // 安全域id
  securedZoneId?: string;
  // workspace_id
  workspaceId: string;
  // workspaceLogicRegionStatus
  workspaceLogicRegionStatus?: string;
  // workspaceLogicRegionType
  workspaceLogicRegionType?: string;
  // workspaceZoneDtos
  workspaceZoneDtos?: WorkspaceZoneDto[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      networkType: 'network_type',
      regionId: 'region_id',
      regionName: 'region_name',
      securedZoneId: 'secured_zone_id',
      workspaceId: 'workspace_id',
      workspaceLogicRegionStatus: 'workspace_logic_region_status',
      workspaceLogicRegionType: 'workspace_logic_region_type',
      workspaceZoneDtos: 'workspace_zone_dtos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      networkType: 'string',
      regionId: 'string',
      regionName: 'string',
      securedZoneId: 'string',
      workspaceId: 'string',
      workspaceLogicRegionStatus: 'string',
      workspaceLogicRegionType: 'string',
      workspaceZoneDtos: { 'type': 'array', 'itemType': WorkspaceZoneDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// LB后端专用的vComputerGroup
export class VComputerGroup extends $tea.Model {
  // name
  name: string;
  // id
  id: string;
  // workspace_id
  workspaceId: string;
  // load_balancer
  loadBalancer: LoadBalancer;
  // status
  status: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      id: 'id',
      workspaceId: 'workspace_id',
      loadBalancer: 'load_balancer',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      id: 'string',
      workspaceId: 'string',
      loadBalancer: LoadBalancer,
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云日志服务(SLS)-日志配置-输入类型配置
export class SLSConfigInputDetail extends $tea.Model {
  // 用于过滤日志的key，只有key的值满足对应filterRegex列中设定的正则表达式，该日志数据才会被采集。
  filterKey?: string[];
  // 与filterKey对应的正则表达式， filterRegex的长度和filterKey的长度必须相同。
  filterRegex?: string[];
  // 数据写入的模式。默认按照写入，开启后按照写入。支持的值包括 __topic__，__hostname__, __source__。
  shardHashKey?: string[];
  // 是否上传原始日志。
  enableRawLog?: boolean;
  // 脱敏功能配置，类型为数组
  sensitiveKeys?: SLSConfigSensitiveKey[];
  // 聚合方式，默认为topic，表示按照Topic方式聚合。支持的值为 topic、logstore。
  mergeType?: string;
  // 采集进度落后的告警阈值，默认为209715200，即200MB。
  delayAlarmBytes?: number;
  // 是否调整日志时区，仅在配置时间解析的情况下使用。
  adjustTimezone?: boolean;
  // 时区偏移量，例如日志时间为东八区，则该值为GMT+08:00
  logTimezone?: string;
  // 日志发送优先级，默认为0，若需设置为高优先级，则设置为1。
  priority?: number;
  // 日志的采集模式。如果Logtail配置参数inputType选择为file，则该参数为必填项。目前可选：
  // json_log：JSON模式。
  // apsara_log：飞天模式。
  // common_reg_log：完整正则模式。
  // delimiter_log：分隔符模式。
  logType: string;
  // 日志所在的父目录，例如/var/logs/。
  logPath: string;
  // 日志文件的Pattern，例如access*.log。
  filePattern: string;
  // Topic生成方式，支持以下四种类型：
  // none，表示topic为空。
  // default，表示将日志文件路径作为topic。
  // group_topic，表示将应用该配置的机器组topic属性作为topic。
  // 也可以将日志文件路径的某一部分作为topic，如/var/log/(.*).log。
  topicFormat: string;
  // 日志时间格式，如%Y/%m/%d %H:%M:%S。
  timeFormat?: string;
  // 监控目录超时设置。默认为true，代表监控目录永不超时，false代表监控目录超过30分钟则超时。
  preserve?: boolean;
  // 当设置preserve为false时，指定监控不超时目录的深度，最大深度支持3。
  preserveDepth?: number;
  // 支持两种类型：utf8、gbk
  fileEncoding?: string;
  // 是否丢弃匹配失败的日志。
  discardUnmatch?: boolean;
  // 最大目录监控深度范围0-1000，0代表只监控本层目录。
  maxDepth?: number;
  // 采集落后时是否丢弃落后数据的阈值，默认为0，即不丢弃。当采集落后超过该值时，则直接丢弃落后的数据
  delaySkipBytes?: number;
  // 采集的目标文件是否为容器内文件，默认为false。
  dockerFile?: boolean;
  // 容器Label白名单，采集包含白名单中Label的Docker容器日志，为空表示全部采集。
  dockerIncludeLabel?: MapStringToStringEntity[];
  // 容器Label黑名单，不采集包含黑名单中Label的Docker容器日志，为空表示全部采集。
  dockerExcludeLabel?: MapStringToStringEntity[];
  // 容器环境变量白名单，采集包含白名单中的环境变量的日志，为空表示全部采集。
  dockerIncludeEnv?: MapStringToStringEntity[];
  // 容器环境变量黑名单，采集不包含黑名单中的环境变量的日志，为空表示全部采集。
  dockerExcludeEnv?: MapStringToStringEntity[];
  // 完整正则/极简模式特有配置，日志内容提取结果的key列表。
  // 完整正则/极简模式 下 必填
  // 分隔符模式特有配置，日志内容提取结果的key列表。
  // 分隔符模式 下 必填
  key?: string[];
  // 完整正则/极简模式特有配置，行首正则表达式。
  // 完整正则/极简模式 下 非必填。
  // 飞天模式特有配置，行首正则表达式。
  // 飞天模式 下 非必填。
  logBeginRegex?: string;
  // 完整正则/极简模式特有配置，提取字段的正则表达式。
  // 完整正则/极简模式 下 非必填
  regex?: string;
  // JSON模式特有配置，指定时间字段的key名称。
  // JSON模式 下 非必填。
  // 分隔符模式特有配置，指定时间字段key名称，必须在key列表里面。
  // 分割符模式 下 必填。
  timeKey?: string;
  // 分隔符模式特有配置，分隔符
  // 分隔符模式 下 非必填
  separator?: string;
  // 分隔符模式特有配置，引用符。
  // 分隔符模式 下 必填
  quote?: string;
  // 分隔符模式特有配置，当日志中实际的key数量大于配置的key数量时，是否自动扩展。
  // 分隔符模式 下 非必填。
  autoExtend?: boolean;
  // 插件所需JSON对象字符串，具体请参见。
  plugin?: string;
  static names(): { [key: string]: string } {
    return {
      filterKey: 'filter_key',
      filterRegex: 'filter_regex',
      shardHashKey: 'shard_hash_key',
      enableRawLog: 'enable_raw_log',
      sensitiveKeys: 'sensitive_keys',
      mergeType: 'merge_type',
      delayAlarmBytes: 'delay_alarm_bytes',
      adjustTimezone: 'adjust_timezone',
      logTimezone: 'log_timezone',
      priority: 'priority',
      logType: 'log_type',
      logPath: 'log_path',
      filePattern: 'file_pattern',
      topicFormat: 'topic_format',
      timeFormat: 'time_format',
      preserve: 'preserve',
      preserveDepth: 'preserve_depth',
      fileEncoding: 'file_encoding',
      discardUnmatch: 'discard_unmatch',
      maxDepth: 'max_depth',
      delaySkipBytes: 'delay_skip_bytes',
      dockerFile: 'docker_file',
      dockerIncludeLabel: 'docker_include_label',
      dockerExcludeLabel: 'docker_exclude_label',
      dockerIncludeEnv: 'docker_include_env',
      dockerExcludeEnv: 'docker_exclude_env',
      key: 'key',
      logBeginRegex: 'log_begin_regex',
      regex: 'regex',
      timeKey: 'time_key',
      separator: 'separator',
      quote: 'quote',
      autoExtend: 'auto_extend',
      plugin: 'plugin',
    };
  }

  static types(): { [key: string]: any } {
    return {
      filterKey: { 'type': 'array', 'itemType': 'string' },
      filterRegex: { 'type': 'array', 'itemType': 'string' },
      shardHashKey: { 'type': 'array', 'itemType': 'string' },
      enableRawLog: 'boolean',
      sensitiveKeys: { 'type': 'array', 'itemType': SLSConfigSensitiveKey },
      mergeType: 'string',
      delayAlarmBytes: 'number',
      adjustTimezone: 'boolean',
      logTimezone: 'string',
      priority: 'number',
      logType: 'string',
      logPath: 'string',
      filePattern: 'string',
      topicFormat: 'string',
      timeFormat: 'string',
      preserve: 'boolean',
      preserveDepth: 'number',
      fileEncoding: 'string',
      discardUnmatch: 'boolean',
      maxDepth: 'number',
      delaySkipBytes: 'number',
      dockerFile: 'boolean',
      dockerIncludeLabel: { 'type': 'array', 'itemType': MapStringToStringEntity },
      dockerExcludeLabel: { 'type': 'array', 'itemType': MapStringToStringEntity },
      dockerIncludeEnv: { 'type': 'array', 'itemType': MapStringToStringEntity },
      dockerExcludeEnv: { 'type': 'array', 'itemType': MapStringToStringEntity },
      key: { 'type': 'array', 'itemType': 'string' },
      logBeginRegex: 'string',
      regex: 'string',
      timeKey: 'string',
      separator: 'string',
      quote: 'string',
      autoExtend: 'boolean',
      plugin: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// request中的单个任务
export class Task extends $tea.Model {
  // context
  context?: string;
  // execution_times
  executionTimes?: number;
  // id
  id?: string;
  // resource_id
  resourceId?: string;
  // resource_type
  resourceType?: string;
  // status
  status?: string;
  // utc_create
  utcCreate?: string;
  // utc_modified
  utcModified?: string;
  // workspace_id
  workspaceId?: string;
  // request
  request?: TaskRequest;
  static names(): { [key: string]: string } {
    return {
      context: 'context',
      executionTimes: 'execution_times',
      id: 'id',
      resourceId: 'resource_id',
      resourceType: 'resource_type',
      status: 'status',
      utcCreate: 'utc_create',
      utcModified: 'utc_modified',
      workspaceId: 'workspace_id',
      request: 'request',
    };
  }

  static types(): { [key: string]: any } {
    return {
      context: 'string',
      executionTimes: 'number',
      id: 'string',
      resourceId: 'string',
      resourceType: 'string',
      status: 'string',
      utcCreate: 'string',
      utcModified: 'string',
      workspaceId: 'string',
      request: TaskRequest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云日志服务(SLS) - 日志内容，是一个键值对
export class SLSLogContent extends $tea.Model {
  // 键名
  key: string;
  // 键值
  value: string;
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

// WorkspaceDc
export class WorkspaceDc extends $tea.Model {
  // id
  id: string;
  // datacenterId
  datacenterId: string;
  // workspaceId
  workspaceId: string;
  // datacenterType
  datacenterType: string;
  // gmtCreate
  gmtCreate: string;
  // gmtModified
  gmtModified: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      datacenterId: 'datacenter_id',
      workspaceId: 'workspace_id',
      datacenterType: 'datacenter_type',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      datacenterId: 'string',
      workspaceId: 'string',
      datacenterType: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// IaasErrorInfo
export class IaasErrorInfo extends $tea.Model {
  // error_code
  errorCode?: string;
  // error_message
  errorMessage?: string;
  // status_code
  statusCode?: number;
  // host_id
  hostId?: string;
  // requestId
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      errorCode: 'error_code',
      errorMessage: 'error_message',
      statusCode: 'status_code',
      hostId: 'host_id',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      errorCode: 'string',
      errorMessage: 'string',
      statusCode: 'number',
      hostId: 'string',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 表示单个云服务器
export class Computer extends $tea.Model {
  // app_id
  appId?: string;
  // appServiceIds
  appServiceIds?: string[];
  // assignedAppServiceIds
  assignedAppServiceIds?: string[];
  // 是否自动续费
  autoRenew?: boolean;
  // 每次自动续费的时长，当参数AutoRenew取值True时为必填。
  autoRenewPeriod?: number;
  // bandwidth
  bandwidth?: number;
  // common_image
  commonImage?: boolean;
  // vCPU数。
  cpu?: number;
  // cpu_shared
  cpuShared?: boolean;
  // 实例创建时间
  creationTime?: string;
  // data_disk
  dataDisks?: Disk[];
  // 这是SIGMA模式下的专用字段，阿里云模式下无意义
  deployMode?: string;
  // 服务器描述
  description?: string;
  // elastic_ip
  elasticIp?: string;
  // 过期时间
  expiredTime?: string;
  // ecs iaas id
  iaasId?: string;
  // iaasStatus
  iaasStatus?: string;
  // iaasType
  iaasType?: string;
  // 主机id
  id: string;
  // image_iaas_id
  imageIaasId?: string;
  // image_id
  imageId?: string;
  // image_name
  imageName?: string;
  // initialized
  initialized?: boolean;
  // instanceChargeType
  instanceChargeType?: string;
  // io_optimized
  ioOptimized?: boolean;
  // last_ops_order_id
  lastOpsOrderId?: string;
  // last_ops_type
  lastOpsType?: string;
  // memory
  memory?: number;
  // name
  name?: string;
  // networkType
  networkType?: string;
  // Options字段
  options?: MapStringToStringEntity[];
  // os
  os?: string;
  // os_bit
  osBit?: number;
  // os_version
  osVersion?: string;
  // paas_status
  paasStatus?: string;
  // password
  password?: string;
  // private_ip
  privateIp?: string;
  // providerId
  providerId?: string;
  // public_ip
  publicIp?: string;
  // regionId
  regionId?: string;
  // serial_number
  serialNumber?: string;
  // spec_iaas_id
  specIaasId?: string;
  // 实例状态。
  status?: string;
  // system_disk
  systemDisk?: Disk;
  // Tags
  tags?: MapStringToStringEntity[];
  // tenantId
  tenantId?: string;
  // tenantId2
  tenantId2?: string;
  // CPU线程数。
  threadsPerCore?: number;
  // utcCreate
  utcCreate?: string;
  // utcModified
  utcModified?: string;
  // vpcId
  vpcId?: string;
  // vSwitchIaasId
  vSwitchIaasId?: string;
  // workspace_id
  workspaceId?: string;
  // zoneId
  zoneId?: string;
  static names(): { [key: string]: string } {
    return {
      appId: 'app_id',
      appServiceIds: 'app_service_ids',
      assignedAppServiceIds: 'assigned_app_service_ids',
      autoRenew: 'auto_renew',
      autoRenewPeriod: 'auto_renew_period',
      bandwidth: 'bandwidth',
      commonImage: 'common_image',
      cpu: 'cpu',
      cpuShared: 'cpu_shared',
      creationTime: 'creation_time',
      dataDisks: 'data_disks',
      deployMode: 'deploy_mode',
      description: 'description',
      elasticIp: 'elastic_ip',
      expiredTime: 'expired_time',
      iaasId: 'iaas_id',
      iaasStatus: 'iaas_status',
      iaasType: 'iaas_type',
      id: 'id',
      imageIaasId: 'image_iaas_id',
      imageId: 'image_id',
      imageName: 'image_name',
      initialized: 'initialized',
      instanceChargeType: 'instance_charge_type',
      ioOptimized: 'io_optimized',
      lastOpsOrderId: 'last_ops_order_id',
      lastOpsType: 'last_ops_type',
      memory: 'memory',
      name: 'name',
      networkType: 'network_type',
      options: 'options',
      os: 'os',
      osBit: 'os_bit',
      osVersion: 'os_version',
      paasStatus: 'paas_status',
      password: 'password',
      privateIp: 'private_ip',
      providerId: 'provider_id',
      publicIp: 'public_ip',
      regionId: 'region_id',
      serialNumber: 'serial_number',
      specIaasId: 'spec_iaas_id',
      status: 'status',
      systemDisk: 'system_disk',
      tags: 'tags',
      tenantId: 'tenant_id',
      tenantId2: 'tenant_id2',
      threadsPerCore: 'threads_per_core',
      utcCreate: 'utc_create',
      utcModified: 'utc_modified',
      vpcId: 'vpc_id',
      vSwitchIaasId: 'v_switch_iaas_id',
      workspaceId: 'workspace_id',
      zoneId: 'zone_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appId: 'string',
      appServiceIds: { 'type': 'array', 'itemType': 'string' },
      assignedAppServiceIds: { 'type': 'array', 'itemType': 'string' },
      autoRenew: 'boolean',
      autoRenewPeriod: 'number',
      bandwidth: 'number',
      commonImage: 'boolean',
      cpu: 'number',
      cpuShared: 'boolean',
      creationTime: 'string',
      dataDisks: { 'type': 'array', 'itemType': Disk },
      deployMode: 'string',
      description: 'string',
      elasticIp: 'string',
      expiredTime: 'string',
      iaasId: 'string',
      iaasStatus: 'string',
      iaasType: 'string',
      id: 'string',
      imageIaasId: 'string',
      imageId: 'string',
      imageName: 'string',
      initialized: 'boolean',
      instanceChargeType: 'string',
      ioOptimized: 'boolean',
      lastOpsOrderId: 'string',
      lastOpsType: 'string',
      memory: 'number',
      name: 'string',
      networkType: 'string',
      options: { 'type': 'array', 'itemType': MapStringToStringEntity },
      os: 'string',
      osBit: 'number',
      osVersion: 'string',
      paasStatus: 'string',
      password: 'string',
      privateIp: 'string',
      providerId: 'string',
      publicIp: 'string',
      regionId: 'string',
      serialNumber: 'string',
      specIaasId: 'string',
      status: 'string',
      systemDisk: Disk,
      tags: { 'type': 'array', 'itemType': MapStringToStringEntity },
      tenantId: 'string',
      tenantId2: 'string',
      threadsPerCore: 'number',
      utcCreate: 'string',
      utcModified: 'string',
      vpcId: 'string',
      vSwitchIaasId: 'string',
      workspaceId: 'string',
      zoneId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ConnectionStub
export class ConnectionStub extends $tea.Model {
  // cloud
  cloud?: Cloud;
  // id
  id?: number;
  // tenant_id
  tenantId?: string;
  // tenant_name
  tenantName?: string;
  // type
  type?: string;
  static names(): { [key: string]: string } {
    return {
      cloud: 'cloud',
      id: 'id',
      tenantId: 'tenant_id',
      tenantName: 'tenant_name',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cloud: Cloud,
      id: 'number',
      tenantId: 'string',
      tenantName: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 技术栈运行时属性
export class BuildpackInstances extends $tea.Model {
  // ecs个数
  ecses?: number;
  // 绑定应用个数
  appBinded?: number;
  static names(): { [key: string]: string } {
    return {
      ecses: 'ecses',
      appBinded: 'app_binded',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ecses: 'number',
      appBinded: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ZoneDto
export class ZoneDto extends $tea.Model {
  // id
  id: string;
  // identity
  identity: string;
  // iaasProviderId
  iaasProviderId: string;
  // displayName
  displayName: string;
  // state
  state: string;
  // regionId
  regionId: string;
  // no
  no: number;
  // name
  name: string;
  // description
  description: string;
  // utcCreate
  utcCreate: string;
  // utcModified
  utcModified: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      identity: 'identity',
      iaasProviderId: 'iaas_provider_id',
      displayName: 'display_name',
      state: 'state',
      regionId: 'region_id',
      no: 'no',
      name: 'name',
      description: 'description',
      utcCreate: 'utc_create',
      utcModified: 'utc_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      identity: 'string',
      iaasProviderId: 'string',
      displayName: 'string',
      state: 'string',
      regionId: 'string',
      no: 'number',
      name: 'string',
      description: 'string',
      utcCreate: 'string',
      utcModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 查询用的DbSchema
export class DbSchema extends $tea.Model {
  // charSet
  charSet?: string;
  // database
  database?: Database;
  // description
  description?: string;
  // grants
  grants: DbSchemaGrant[];
  // iaas_type
  iaasType?: string;
  // id
  id: string;
  // name
  name: string;
  // status
  status: string;
  // utc_create
  utcCreate?: string;
  // utc_modified
  utcModified?: string;
  static names(): { [key: string]: string } {
    return {
      charSet: 'char_set',
      database: 'database',
      description: 'description',
      grants: 'grants',
      iaasType: 'iaas_type',
      id: 'id',
      name: 'name',
      status: 'status',
      utcCreate: 'utc_create',
      utcModified: 'utc_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      charSet: 'string',
      database: Database,
      description: 'string',
      grants: { 'type': 'array', 'itemType': DbSchemaGrant },
      iaasType: 'string',
      id: 'string',
      name: 'string',
      status: 'string',
      utcCreate: 'string',
      utcModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// property
export class Property extends $tea.Model {
  // key
  key: string;
  // value
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

// 技术栈
export class Buildpack extends $tea.Model {
  // 技术栈标识ID
  id?: string;
  // 技术栈名称
  name?: string;
  // 技术栈描述
  des?: string;
  // 技术栈版本
  version?: string;
  // 技术栈类别
  stack?: string;
  // 部署脚本id
  deployScriptId?: string;
  // 构建脚本ID
  buildScriptId?: string;
  // 配置id
  configId?: string;
  // 组件id
  componentId?: string;
  // 命令id
  commandId?: string;
  // 启用蓝绿
  bgEnable?: boolean;
  // 创建人
  creator?: string;
  // 租户ID
  tenantId?: string;
  // 客户id列表
  customerIds?: string[];
  // 技术栈定义类型
  // 系统模板 TEMPLATE
  // 用户自定义 CUSTOM
  // 后台服务 BACKGROUND_SERVICE
  type?: string;
  // 技术栈状态
  // 草稿 DRAFT
  // 已提交 COMMITED 
  // 已对外发布 PUBLISHED
  // 已退役 RETIRED
  status?: string;
  // 创建日期
  gmtCreate?: string;
  // 最近修改时间
  gmtModified?: string;
  // 技术栈信息汇总
  resultMsg?: string;
  // 可用 USABLE
  // 不可用 UNUSABLE
  versionStatus?: string;
  // 运行时属性
  instances?: BuildpackInstances;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      des: 'des',
      version: 'version',
      stack: 'stack',
      deployScriptId: 'deploy_script_id',
      buildScriptId: 'build_script_id',
      configId: 'config_id',
      componentId: 'component_id',
      commandId: 'command_id',
      bgEnable: 'bg_enable',
      creator: 'creator',
      tenantId: 'tenant_id',
      customerIds: 'customer_ids',
      type: 'type',
      status: 'status',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      resultMsg: 'result_msg',
      versionStatus: 'version_status',
      instances: 'instances',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      des: 'string',
      version: 'string',
      stack: 'string',
      deployScriptId: 'string',
      buildScriptId: 'string',
      configId: 'string',
      componentId: 'string',
      commandId: 'string',
      bgEnable: 'boolean',
      creator: 'string',
      tenantId: 'string',
      customerIds: { 'type': 'array', 'itemType': 'string' },
      type: 'string',
      status: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      resultMsg: 'string',
      versionStatus: 'string',
      instances: BuildpackInstances,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云日志服务(SLS)-日志库
export class SLSLogStore extends $tea.Model {
  // 日志库名称
  name: string;
  // Shard个数，单位为个，范围为1~100。
  shardCount: number;
  // 数据的保存时间，单位为天，范围1~3600。
  ttl: number;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      shardCount: 'shard_count',
      ttl: 'ttl',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      shardCount: 'number',
      ttl: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 旧版-应用服务放入前端展示内容
export class AppServiceViewModel extends $tea.Model {
  // 基类
  baseAppService?: AppService;
  // 应用负责人姓名
  ownerName?: string;
  // 技术栈名称
  buildpackName?: string;
  // App的别名
  chineseName?: string;
  // buildpackVersion
  buildpackVersion?: string;
  // computerCount
  computerCount?: number;
  // databaseCount
  databaseCount?: number;
  // loadBalancerCount
  loadBalancerCount?: number;
  // cacheCount
  cacheCount?: number;
  // cellViewList
  cellViewList?: CellView[];
  static names(): { [key: string]: string } {
    return {
      baseAppService: 'base_app_service',
      ownerName: 'owner_name',
      buildpackName: 'buildpack_name',
      chineseName: 'chinese_name',
      buildpackVersion: 'buildpack_version',
      computerCount: 'computer_count',
      databaseCount: 'database_count',
      loadBalancerCount: 'load_balancer_count',
      cacheCount: 'cache_count',
      cellViewList: 'cell_view_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      baseAppService: AppService,
      ownerName: 'string',
      buildpackName: 'string',
      chineseName: 'string',
      buildpackVersion: 'string',
      computerCount: 'number',
      databaseCount: 'number',
      loadBalancerCount: 'number',
      cacheCount: 'number',
      cellViewList: { 'type': 'array', 'itemType': CellView },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// lb 监听器
export class Listener extends $tea.Model {
  // 后端服务器端口
  backendServerPort: number;
  // 带宽
  bandwidth?: number;
  // certificate_iaas_id
  certificateIaasId?: string;
  // 证书 id
  certificateId?: string;
  // cookie
  cookie?: string;
  // cookie 超时时间
  cookieTimeout?: number;
  // description
  description?: string;
  // 连接超时时间
  establishedTimeout?: number;
  // gm_crypto_cert_iaas_id
  gmCryptoCertIaasId?: string;
  // 健康检查
  healthMonitor?: ListenerHealthMonitor;
  // iaas_id
  iaasId?: string;
  // iaasType
  iaasType?: string;
  // id
  id?: string;
  // is_health_monitor
  isHealthMonitor?: string;
  // 监听器端口
  listenerPort: number;
  // load_balancer
  loadBalancer?: LoadBalancer;
  // name
  name: string;
  // 会话保持的超时时间
  persistTimeout?: number;
  // 转发规则
  scheduler?: string;
  // status
  status: string;
  // sticky_session
  stickySession?: string;
  // cookie 处理方式
  stickySessionType?: string;
  // 监听类型
  type: string;
  // url_path
  urlPath?: string;
  // x_forwarded_for
  xForwardedFor?: string;
  static names(): { [key: string]: string } {
    return {
      backendServerPort: 'backend_server_port',
      bandwidth: 'bandwidth',
      certificateIaasId: 'certificate_iaas_id',
      certificateId: 'certificate_id',
      cookie: 'cookie',
      cookieTimeout: 'cookie_timeout',
      description: 'description',
      establishedTimeout: 'established_timeout',
      gmCryptoCertIaasId: 'gm_crypto_cert_iaas_id',
      healthMonitor: 'health_monitor',
      iaasId: 'iaas_id',
      iaasType: 'iaas_type',
      id: 'id',
      isHealthMonitor: 'is_health_monitor',
      listenerPort: 'listener_port',
      loadBalancer: 'load_balancer',
      name: 'name',
      persistTimeout: 'persist_timeout',
      scheduler: 'scheduler',
      status: 'status',
      stickySession: 'sticky_session',
      stickySessionType: 'sticky_session_type',
      type: 'type',
      urlPath: 'url_path',
      xForwardedFor: 'x_forwarded_for',
    };
  }

  static types(): { [key: string]: any } {
    return {
      backendServerPort: 'number',
      bandwidth: 'number',
      certificateIaasId: 'string',
      certificateId: 'string',
      cookie: 'string',
      cookieTimeout: 'number',
      description: 'string',
      establishedTimeout: 'number',
      gmCryptoCertIaasId: 'string',
      healthMonitor: ListenerHealthMonitor,
      iaasId: 'string',
      iaasType: 'string',
      id: 'string',
      isHealthMonitor: 'string',
      listenerPort: 'number',
      loadBalancer: LoadBalancer,
      name: 'string',
      persistTimeout: 'number',
      scheduler: 'string',
      status: 'string',
      stickySession: 'string',
      stickySessionType: 'string',
      type: 'string',
      urlPath: 'string',
      xForwardedFor: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// db schema
export class DatabaseSchema extends $tea.Model {
  // 字符集
  charSet: string;
  // 数量
  count?: number;
  // 是否自动生成名称。默认为 true
  isAutoName?: boolean;
  // 名称
  name: string;
  // 序列号是否连续。默认为 false
  isSerial?: boolean;
  static names(): { [key: string]: string } {
    return {
      charSet: 'char_set',
      count: 'count',
      isAutoName: 'is_auto_name',
      name: 'name',
      isSerial: 'is_serial',
    };
  }

  static types(): { [key: string]: any } {
    return {
      charSet: 'string',
      count: 'number',
      isAutoName: 'boolean',
      name: 'string',
      isSerial: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// <String, Boolean> 映射
export class MapStringToBooleanEntity extends $tea.Model {
  // key
  key: string;
  // value
  value: boolean;
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

// IAM用户信息
export class UserDTO extends $tea.Model {
  // 用户ID
  id?: string;
  // 创建时间
  utcCreate?: string;
  // 最近修改时间
  utcModified?: string;
  // 客户ID
  customerId?: string;
  // 用户类型
  type?: string;
  // 用户显示名称
  realName?: string;
  // 用户名
  name?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      utcCreate: 'utc_create',
      utcModified: 'utc_modified',
      customerId: 'customer_id',
      type: 'type',
      realName: 'real_name',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      utcCreate: 'string',
      utcModified: 'string',
      customerId: 'string',
      type: 'string',
      realName: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// rmc 交换机详细信息
export class VSwitchVO extends $tea.Model {
  // 交换机的iaas ID
  iaasId?: string;
  // 交换机名称
  name?: string;
  // 交换机描述信息
  description?: string;
  // 交换机的状态，取值： Pending：配置中。 Available：可用。
  status?: string;
  // vpc id
  vpcId?: string;
  // workspace id
  workspaceId?: string;
  // zone id
  zoneId?: string;
  // zone iaas id
  zoneIaasId?: string;
  // region id
  regionId?: string;
  // 换机的IPv4网段
  cidrBlock?: string;
  // 交换机创建时间
  utcCreate?: string;
  // 可用ip数目
  availableIpAddressCount?: number;
  static names(): { [key: string]: string } {
    return {
      iaasId: 'iaas_id',
      name: 'name',
      description: 'description',
      status: 'status',
      vpcId: 'vpc_id',
      workspaceId: 'workspace_id',
      zoneId: 'zone_id',
      zoneIaasId: 'zone_iaas_id',
      regionId: 'region_id',
      cidrBlock: 'cidr_block',
      utcCreate: 'utc_create',
      availableIpAddressCount: 'available_ip_address_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      iaasId: 'string',
      name: 'string',
      description: 'string',
      status: 'string',
      vpcId: 'string',
      workspaceId: 'string',
      zoneId: 'string',
      zoneIaasId: 'string',
      regionId: 'string',
      cidrBlock: 'string',
      utcCreate: 'string',
      availableIpAddressCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// LoadBalancerRule
export class LoadBalancerRule extends $tea.Model {
  // load_balancer
  loadBalancer?: LoadBalancer;
  // name
  name: string;
  // id
  id?: string;
  // listener_port
  listenerPort?: number;
  // status
  status?: string;
  // domain
  domain?: string;
  // url
  url: string;
  // cookie
  cookie?: string;
  // is_health_monitor
  isHealthMonitor?: string;
  // health_monitor
  healthMonitor?: ListenerHealthMonitor;
  // sticky_session
  stickySession?: string;
  // app_id
  appId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      loadBalancer: 'load_balancer',
      name: 'name',
      id: 'id',
      listenerPort: 'listener_port',
      status: 'status',
      domain: 'domain',
      url: 'url',
      cookie: 'cookie',
      isHealthMonitor: 'is_health_monitor',
      healthMonitor: 'health_monitor',
      stickySession: 'sticky_session',
      appId: 'app_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      loadBalancer: LoadBalancer,
      name: 'string',
      id: 'string',
      listenerPort: 'number',
      status: 'string',
      domain: 'string',
      url: 'string',
      cookie: 'string',
      isHealthMonitor: 'string',
      healthMonitor: ListenerHealthMonitor,
      stickySession: 'string',
      appId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// LB的vip类型
export class VipType extends $tea.Model {
  // name
  name: string;
  // vip_address_type
  vipAddressType: string;
  // vip_type
  vipType: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      vipAddressType: 'vip_address_type',
      vipType: 'vip_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      vipAddressType: 'string',
      vipType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// DatabaseSpec
export class DatabaseSpec extends $tea.Model {
  // cpu
  cpu?: number;
  // custom_storage
  customStorage?: boolean;
  // engine
  engine?: string;
  // engine_version
  engineVersion?: string[];
  // iaas_id
  iaasId?: string;
  // id
  id?: string;
  // max_connections
  maxConnections?: number;
  // max_iops
  maxIops?: number;
  // max_storage
  maxStorage?: number;
  // memory
  memory?: number;
  // min_storage
  minStorage?: number;
  // name
  name?: string;
  // supported_storages
  supportedStorages?: number[];
  // type
  type?: string;
  static names(): { [key: string]: string } {
    return {
      cpu: 'cpu',
      customStorage: 'custom_storage',
      engine: 'engine',
      engineVersion: 'engine_version',
      iaasId: 'iaas_id',
      id: 'id',
      maxConnections: 'max_connections',
      maxIops: 'max_iops',
      maxStorage: 'max_storage',
      memory: 'memory',
      minStorage: 'min_storage',
      name: 'name',
      supportedStorages: 'supported_storages',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cpu: 'number',
      customStorage: 'boolean',
      engine: 'string',
      engineVersion: { 'type': 'array', 'itemType': 'string' },
      iaasId: 'string',
      id: 'string',
      maxConnections: 'number',
      maxIops: 'number',
      maxStorage: 'number',
      memory: 'number',
      minStorage: 'number',
      name: 'string',
      supportedStorages: { 'type': 'array', 'itemType': 'number' },
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// getfinaltask专用数据解雇，包含resource的详细信息
export class TaskVO extends $tea.Model {
  // context
  context: string;
  // execution_times
  executionTimes?: number;
  // id
  id?: string;
  // request
  request?: TaskRequest;
  // resource_id
  resourceId?: string;
  // resource_type
  resourceType?: string;
  // status
  status: string;
  // utc_create
  utcCreate?: string;
  // utc_modified
  utcModified?: string;
  // workspace_id
  workspaceId: string;
  // resource
  resource: Resource;
  static names(): { [key: string]: string } {
    return {
      context: 'context',
      executionTimes: 'execution_times',
      id: 'id',
      request: 'request',
      resourceId: 'resource_id',
      resourceType: 'resource_type',
      status: 'status',
      utcCreate: 'utc_create',
      utcModified: 'utc_modified',
      workspaceId: 'workspace_id',
      resource: 'resource',
    };
  }

  static types(): { [key: string]: any } {
    return {
      context: 'string',
      executionTimes: 'number',
      id: 'string',
      request: TaskRequest,
      resourceId: 'string',
      resourceType: 'string',
      status: 'string',
      utcCreate: 'string',
      utcModified: 'string',
      workspaceId: 'string',
      resource: Resource,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 任务日志
export class ResourceLog extends $tea.Model {
  // host
  host?: string;
  // log_time
  logTime: string;
  // message
  message: string;
  // resource_id
  resourceId?: string;
  // resource_type
  resourceType?: string;
  // severity
  severity?: string;
  // source
  source?: string;
  // task_id
  taskId: string;
  // task_times
  taskTimes: number;
  // type
  type?: string;
  // iaas_error_info
  iaasErrorInfo?: IaasErrorInfo;
  // iaas_request
  iaasRequest?: IaasRequest;
  // iaas_response
  iaasResponse?: IaasResponse;
  static names(): { [key: string]: string } {
    return {
      host: 'host',
      logTime: 'log_time',
      message: 'message',
      resourceId: 'resource_id',
      resourceType: 'resource_type',
      severity: 'severity',
      source: 'source',
      taskId: 'task_id',
      taskTimes: 'task_times',
      type: 'type',
      iaasErrorInfo: 'iaas_error_info',
      iaasRequest: 'iaas_request',
      iaasResponse: 'iaas_response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      host: 'string',
      logTime: 'string',
      message: 'string',
      resourceId: 'string',
      resourceType: 'string',
      severity: 'string',
      source: 'string',
      taskId: 'string',
      taskTimes: 'number',
      type: 'string',
      iaasErrorInfo: IaasErrorInfo,
      iaasRequest: IaasRequest,
      iaasResponse: IaasResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 地域信息
export class Region extends $tea.Model {
  // description
  description?: string;
  // identity
  identity: string;
  // instanceStatus: AVAILABLE  UNAVAILABLE  RETIRED  DELETED
  instancestatus: string;
  // name
  name: string;
  // properties
  properties?: Property[];
  static names(): { [key: string]: string } {
    return {
      description: 'description',
      identity: 'identity',
      instancestatus: 'instancestatus',
      name: 'name',
      properties: 'properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      description: 'string',
      identity: 'string',
      instancestatus: 'string',
      name: 'string',
      properties: { 'type': 'array', 'itemType': Property },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 一次异步请求
export class RequestVO extends $tea.Model {
  // context
  context?: string;
  // id
  id: string;
  // operator
  operator?: string;
  // operator_name
  operatorName: string;
  // operator_type
  operatorType?: string;
  // status
  status?: string;
  // token
  token?: string;
  // type
  type?: string;
  // utc_create
  utcCreate?: string;
  // utc_modified
  utcModified?: string;
  // tasks
  tasks?: Task[];
  static names(): { [key: string]: string } {
    return {
      context: 'context',
      id: 'id',
      operator: 'operator',
      operatorName: 'operator_name',
      operatorType: 'operator_type',
      status: 'status',
      token: 'token',
      type: 'type',
      utcCreate: 'utc_create',
      utcModified: 'utc_modified',
      tasks: 'tasks',
    };
  }

  static types(): { [key: string]: any } {
    return {
      context: 'string',
      id: 'string',
      operator: 'string',
      operatorName: 'string',
      operatorType: 'string',
      status: 'string',
      token: 'string',
      type: 'string',
      utcCreate: 'string',
      utcModified: 'string',
      tasks: { 'type': 'array', 'itemType': Task },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// staragent info
export class StarAgentInfo extends $tea.Model {
  // computer serial number
  sn?: string;
  // hostname
  hostname?: string;
  // ip
  ip?: string;
  // ip list
  ipList?: string;
  // 状态取值：RUNNING，ERROR，REGISTER，NOFIND
  status?: string;
  static names(): { [key: string]: string } {
    return {
      sn: 'sn',
      hostname: 'hostname',
      ip: 'ip',
      ipList: 'ip_list',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sn: 'string',
      hostname: 'string',
      ip: 'string',
      ipList: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// map <String,integer>
export class MapStringToIntegerEntity extends $tea.Model {
  // key
  key: string;
  // value
  value: number;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// BasicCertificate
export class BasicCertificate extends $tea.Model {
  // serverCertificateId
  serverCertificateId: string;
  // serverCertificateName
  serverCertificateName: string;
  // fingerprint
  fingerprint?: string;
  // cert_type
  certType: number;
  static names(): { [key: string]: string } {
    return {
      serverCertificateId: 'server_certificate_id',
      serverCertificateName: 'server_certificate_name',
      fingerprint: 'fingerprint',
      certType: 'cert_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      serverCertificateId: 'string',
      serverCertificateName: 'string',
      fingerprint: 'string',
      certType: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Connection
export class Connection extends $tea.Model {
  // access_key
  accessKey?: string;
  // access_secret
  accessSecret?: string;
  // created_time
  createdTime?: string;
  // executor
  executor?: string;
  // id
  id?: number;
  // identity
  identity?: string;
  // 修改时间
  modifiedTime?: string;
  // name
  name?: string;
  // plug
  plug?: ConnectionStub;
  // socket
  socket?: ConnectionStub;
  // status
  status?: string;
  // tenant_id
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      accessKey: 'access_key',
      accessSecret: 'access_secret',
      createdTime: 'created_time',
      executor: 'executor',
      id: 'id',
      identity: 'identity',
      modifiedTime: 'modified_time',
      name: 'name',
      plug: 'plug',
      socket: 'socket',
      status: 'status',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accessKey: 'string',
      accessSecret: 'string',
      createdTime: 'string',
      executor: 'string',
      id: 'number',
      identity: 'string',
      modifiedTime: 'string',
      name: 'string',
      plug: ConnectionStub,
      socket: ConnectionStub,
      status: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ComputerImportVO
export class ComputerImportVO extends $tea.Model {
  // computer iaaas id
  iaasId?: string;
  // name
  name?: string;
  // zone identity
  zoneIaasId?: string;
  // zone name
  zoneName?: string;
  // description
  description?: string;
  // private ip
  privateIp?: string;
  // public ip
  publicIp?: string;
  // elasticIp
  elasticIp?: string;
  // vpcIaasId
  vpcIaasId?: string;
  // joined security group infos
  joinedSecurityGroup?: JoinedSecurityGroupVO[];
  // creation time
  utcCreate?: string;
  // import info
  importInfo?: ImportVO;
  static names(): { [key: string]: string } {
    return {
      iaasId: 'iaas_id',
      name: 'name',
      zoneIaasId: 'zone_iaas_id',
      zoneName: 'zone_name',
      description: 'description',
      privateIp: 'private_ip',
      publicIp: 'public_ip',
      elasticIp: 'elastic_ip',
      vpcIaasId: 'vpc_iaas_id',
      joinedSecurityGroup: 'joined_security_group',
      utcCreate: 'utc_create',
      importInfo: 'import_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      iaasId: 'string',
      name: 'string',
      zoneIaasId: 'string',
      zoneName: 'string',
      description: 'string',
      privateIp: 'string',
      publicIp: 'string',
      elasticIp: 'string',
      vpcIaasId: 'string',
      joinedSecurityGroup: { 'type': 'array', 'itemType': JoinedSecurityGroupVO },
      utcCreate: 'string',
      importInfo: ImportVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// computer quota
export class ComputerQuota extends $tea.Model {
  // cpu shared
  cpuShared?: number;
  // cpu
  cpu?: number;
  // memory
  memory?: number;
  // disk
  disk?: number;
  static names(): { [key: string]: string } {
    return {
      cpuShared: 'cpu_shared',
      cpu: 'cpu',
      memory: 'memory',
      disk: 'disk',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cpuShared: 'number',
      cpu: 'number',
      memory: 'number',
      disk: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用分组查询
export class AppDomainQuery extends $tea.Model {
  // creatorId
  creatorId?: string;
  // 是否为一方化请求
  isOnePartyRequest?: boolean;
  // name
  name?: string;
  // parentId
  parentId?: string;
  // tenantId
  tenantId?: string;
  // utcCreate
  utcCreate?: string;
  // 分页大小
  pageSize?: number;
  // query_type
  queryType?: string;
  // orders
  orders?: string[];
  // 当前页数
  currentPage?: number;
  static names(): { [key: string]: string } {
    return {
      creatorId: 'creator_id',
      isOnePartyRequest: 'is_one_party_request',
      name: 'name',
      parentId: 'parent_id',
      tenantId: 'tenant_id',
      utcCreate: 'utc_create',
      pageSize: 'page_size',
      queryType: 'query_type',
      orders: 'orders',
      currentPage: 'current_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      creatorId: 'string',
      isOnePartyRequest: 'boolean',
      name: 'string',
      parentId: 'string',
      tenantId: 'string',
      utcCreate: 'string',
      pageSize: 'number',
      queryType: 'string',
      orders: { 'type': 'array', 'itemType': 'string' },
      currentPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// disk spec
export class DiskSpec extends $tea.Model {
  // id
  id?: string;
  // name
  name?: string;
  // description
  description?: string;
  // iaas id
  iaasId?: string;
  // providerId
  providerId?: string;
  // iaasType
  iaasType?: string;
  // enable
  enable?: boolean;
  // minSize
  minSize?: number;
  // maxSize
  maxSize?: number;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      description: 'description',
      iaasId: 'iaas_id',
      providerId: 'provider_id',
      iaasType: 'iaas_type',
      enable: 'enable',
      minSize: 'min_size',
      maxSize: 'max_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      description: 'string',
      iaasId: 'string',
      providerId: 'string',
      iaasType: 'string',
      enable: 'boolean',
      minSize: 'number',
      maxSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// LoadBalancerImportVO
export class LoadBalancerImportVO extends $tea.Model {
  // iaas_id
  iaasId?: string;
  // name
  name: string;
  // network_type
  networkType?: string;
  // inner_ip_address
  innerIpAddress?: string[];
  // public_ip_address
  publicIpAddress?: string[];
  // utc_create
  utcCreate?: string;
  // import_info
  importInfo: ImportVO;
  static names(): { [key: string]: string } {
    return {
      iaasId: 'iaas_id',
      name: 'name',
      networkType: 'network_type',
      innerIpAddress: 'inner_ip_address',
      publicIpAddress: 'public_ip_address',
      utcCreate: 'utc_create',
      importInfo: 'import_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      iaasId: 'string',
      name: 'string',
      networkType: 'string',
      innerIpAddress: { 'type': 'array', 'itemType': 'string' },
      publicIpAddress: { 'type': 'array', 'itemType': 'string' },
      utcCreate: 'string',
      importInfo: ImportVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用查询
export class AppQuery extends $tea.Model {
  // id
  id?: string;
  // tenantId
  tenantId?: string;
  // name
  name?: string;
  // chineseName
  chineseName?: string;
  // stackId
  stackId?: string;
  // startVersion
  startVersion?: string;
  // endVersion
  endVersion?: string;
  // appIds
  appIds?: string[];
  // appDomainId
  appDomainId?: string;
  // appDomainIds
  appDomainIds?: string[];
  // appDomainName
  appDomainName?: string;
  // appLevelId
  appLevelId?: string;
  // ownerId
  ownerId?: string;
  // isComponent
  isComponent?: boolean;
  // simpleQuery
  simpleQuery?: boolean;
  // workspaceId
  workspaceId?: string;
  // containerCount
  containerCount?: string;
  // databaseCount
  databaseCount?: string;
  // slbCount
  slbCount?: string;
  // utcCreate
  utcCreate?: string;
  // isOnePartyRequest
  isOnePartyRequest?: boolean;
  // 分页大小
  pageSize?: number;
  // 当前页数
  currentPage?: number;
  // orders
  orders?: string[];
  // queryType
  queryType?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      tenantId: 'tenant_id',
      name: 'name',
      chineseName: 'chinese_name',
      stackId: 'stack_id',
      startVersion: 'start_version',
      endVersion: 'end_version',
      appIds: 'app_ids',
      appDomainId: 'app_domain_id',
      appDomainIds: 'app_domain_ids',
      appDomainName: 'app_domain_name',
      appLevelId: 'app_level_id',
      ownerId: 'owner_id',
      isComponent: 'is_component',
      simpleQuery: 'simple_query',
      workspaceId: 'workspace_id',
      containerCount: 'container_count',
      databaseCount: 'database_count',
      slbCount: 'slb_count',
      utcCreate: 'utc_create',
      isOnePartyRequest: 'is_one_party_request',
      pageSize: 'page_size',
      currentPage: 'current_page',
      orders: 'orders',
      queryType: 'query_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      tenantId: 'string',
      name: 'string',
      chineseName: 'string',
      stackId: 'string',
      startVersion: 'string',
      endVersion: 'string',
      appIds: { 'type': 'array', 'itemType': 'string' },
      appDomainId: 'string',
      appDomainIds: { 'type': 'array', 'itemType': 'string' },
      appDomainName: 'string',
      appLevelId: 'string',
      ownerId: 'string',
      isComponent: 'boolean',
      simpleQuery: 'boolean',
      workspaceId: 'string',
      containerCount: 'string',
      databaseCount: 'string',
      slbCount: 'string',
      utcCreate: 'string',
      isOnePartyRequest: 'boolean',
      pageSize: 'number',
      currentPage: 'number',
      orders: { 'type': 'array', 'itemType': 'string' },
      queryType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 安全组详细信息
export class SecurityGroup extends $tea.Model {
  // 创建时间。按照ISO8601标准表示，并需要使用UTC时间。格式为：yyyy-MM-ddThh:mmZ。
  creationTime: string;
  // 安全组的描述信息。
  description?: string;
  // region_id
  regionId: string;
  // 安全组ID。
  securityGroupId: string;
  // 安全组名称。
  securityGroupName: string;
  // 安全组所属的专有网络。
  vpcId: string;
  // 安全组入方向规则
  ingressRules?: SecurityGroupRule[];
  // 安全组出方向规则
  egressRules?: SecurityGroupRule[];
  static names(): { [key: string]: string } {
    return {
      creationTime: 'creation_time',
      description: 'description',
      regionId: 'region_id',
      securityGroupId: 'security_group_id',
      securityGroupName: 'security_group_name',
      vpcId: 'vpc_id',
      ingressRules: 'ingress_rules',
      egressRules: 'egress_rules',
    };
  }

  static types(): { [key: string]: any } {
    return {
      creationTime: 'string',
      description: 'string',
      regionId: 'string',
      securityGroupId: 'string',
      securityGroupName: 'string',
      vpcId: 'string',
      ingressRules: { 'type': 'array', 'itemType': SecurityGroupRule },
      egressRules: { 'type': 'array', 'itemType': SecurityGroupRule },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 一组具有依赖关系的 AppDomain，可以转换为一个树形结构
export class AppDomainFlatten extends $tea.Model {
  // 一组具有依赖关系的 AppDomain
  appDomains?: AppDomain[];
  static names(): { [key: string]: string } {
    return {
      appDomains: 'app_domains',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appDomains: { 'type': 'array', 'itemType': AppDomain },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// computer common image
export class CommonImage extends $tea.Model {
  // description
  description?: string;
  // is enable
  enable?: boolean;
  // iaas id
  iaasId?: string;
  // iaas type
  iaasType?: string;
  // id
  id?: string;
  // 是否仅杭州金区 vpc 可用镜像
  onlyHzFinVpcSupported?: boolean;
  // name
  name?: string;
  // os
  os?: string;
  // os bit取值：32，64
  osBit?: number;
  // os version
  osVersion?: string;
  // provider id
  providerId?: string;
  // region id
  regionId?: string;
  // status
  status?: string;
  // system disk size(GB)
  systemDiskSize?: number;
  static names(): { [key: string]: string } {
    return {
      description: 'description',
      enable: 'enable',
      iaasId: 'iaas_id',
      iaasType: 'iaas_type',
      id: 'id',
      onlyHzFinVpcSupported: 'only_hz_fin_vpc_supported',
      name: 'name',
      os: 'os',
      osBit: 'os_bit',
      osVersion: 'os_version',
      providerId: 'provider_id',
      regionId: 'region_id',
      status: 'status',
      systemDiskSize: 'system_disk_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      description: 'string',
      enable: 'boolean',
      iaasId: 'string',
      iaasType: 'string',
      id: 'string',
      onlyHzFinVpcSupported: 'boolean',
      name: 'string',
      os: 'string',
      osBit: 'number',
      osVersion: 'string',
      providerId: 'string',
      regionId: 'string',
      status: 'string',
      systemDiskSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// PermissionVO
export class PermissionVO extends $tea.Model {
  // authorizedCidrIp
  authorizedCidrIp?: string;
  // authorize_type
  authorizeType?: string;
  // direction
  direction?: string;
  // endPort
  endPort?: number;
  // ipProtocol
  ipProtocol?: string;
  // nicType
  nicType?: string;
  // policy
  policy?: string;
  // priority
  priority?: number;
  // securityGroupId
  securityGroupId?: string;
  // startPort
  startPort?: number;
  // id
  id: string;
  static names(): { [key: string]: string } {
    return {
      authorizedCidrIp: 'authorized_cidr_ip',
      authorizeType: 'authorize_type',
      direction: 'direction',
      endPort: 'end_port',
      ipProtocol: 'ip_protocol',
      nicType: 'nic_type',
      policy: 'policy',
      priority: 'priority',
      securityGroupId: 'security_group_id',
      startPort: 'start_port',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authorizedCidrIp: 'string',
      authorizeType: 'string',
      direction: 'string',
      endPort: 'number',
      ipProtocol: 'string',
      nicType: 'string',
      policy: 'string',
      priority: 'number',
      securityGroupId: 'string',
      startPort: 'number',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// LB后端健康状态
export class LoadBalanceHealthStatus extends $tea.Model {
  // server_id
  serverId: string;
  // status
  status: string;
  static names(): { [key: string]: string } {
    return {
      serverId: 'server_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      serverId: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 旧版应用管理-发布包上传策略
export class PackageUploadPolicy extends $tea.Model {
  // accessKey
  accessKey?: string;
  // 策略
  policy?: string;
  // 签名
  signature?: string;
  // 路径前缀
  pathPrefix?: string;
  // endpoint
  endpoint?: string;
  // expire
  expire?: string;
  // bucket
  bucket?: string;
  static names(): { [key: string]: string } {
    return {
      accessKey: 'access_key',
      policy: 'policy',
      signature: 'signature',
      pathPrefix: 'path_prefix',
      endpoint: 'endpoint',
      expire: 'expire',
      bucket: 'bucket',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accessKey: 'string',
      policy: 'string',
      signature: 'string',
      pathPrefix: 'string',
      endpoint: 'string',
      expire: 'string',
      bucket: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 服务器规格
export class ComputerSpec extends $tea.Model {
  // cpu个数
  cpu?: number;
  // 可以挂载的磁盘类型
  diskSpecIds?: string[];
  // 服务器规格名称
  group: string;
  // 是否有IO优化
  ioOptimized?: boolean;
  // 内存大小
  memory?: number;
  // description
  description?: string;
  // enable
  enable?: boolean;
  // iaasId
  iaasId?: string;
  // COMPUTER_ECS
  iaasType?: string;
  // id
  id?: string;
  // name
  name?: string;
  // providerId
  providerId?: string;
  static names(): { [key: string]: string } {
    return {
      cpu: 'cpu',
      diskSpecIds: 'disk_spec_ids',
      group: 'group',
      ioOptimized: 'io_optimized',
      memory: 'memory',
      description: 'description',
      enable: 'enable',
      iaasId: 'iaas_id',
      iaasType: 'iaas_type',
      id: 'id',
      name: 'name',
      providerId: 'provider_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cpu: 'number',
      diskSpecIds: { 'type': 'array', 'itemType': 'string' },
      group: 'string',
      ioOptimized: 'boolean',
      memory: 'number',
      description: 'string',
      enable: 'boolean',
      iaasId: 'string',
      iaasType: 'string',
      id: 'string',
      name: 'string',
      providerId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ComputerParam
export class ComputerParam extends $tea.Model {
  // description
  description?: string;
  // name
  name?: string;
  // image_id
  imageId?: string;
  // instance_type
  instanceType?: string;
  // region_id
  regionId?: string;
  // security_group_id
  securityGroupId?: string;
  // instance_name
  instanceName?: string;
  // zone_id
  zoneId?: string;
  static names(): { [key: string]: string } {
    return {
      description: 'description',
      name: 'name',
      imageId: 'image_id',
      instanceType: 'instance_type',
      regionId: 'region_id',
      securityGroupId: 'security_group_id',
      instanceName: 'instance_name',
      zoneId: 'zone_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      description: 'string',
      name: 'string',
      imageId: 'string',
      instanceType: 'string',
      regionId: 'string',
      securityGroupId: 'string',
      instanceName: 'string',
      zoneId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// LB后端挂载的主机
export class MountComputer extends $tea.Model {
  // computer
  computer?: Computer;
  // domain
  domain?: string;
  // loadbalancer
  loadbalancer?: LoadBalancer;
  // status
  status?: string;
  // weight
  weight: number;
  static names(): { [key: string]: string } {
    return {
      computer: 'computer',
      domain: 'domain',
      loadbalancer: 'loadbalancer',
      status: 'status',
      weight: 'weight',
    };
  }

  static types(): { [key: string]: any } {
    return {
      computer: Computer,
      domain: 'string',
      loadbalancer: LoadBalancer,
      status: 'string',
      weight: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// LB查询对应的VComputer
export class VComputer extends $tea.Model {
  // v_computer_group
  vComputerGroup?: VComputerGroup;
  // ip
  ip?: string;
  // computer
  computer?: Computer;
  // port
  port?: number;
  // weight
  weight?: number;
  static names(): { [key: string]: string } {
    return {
      vComputerGroup: 'v_computer_group',
      ip: 'ip',
      computer: 'computer',
      port: 'port',
      weight: 'weight',
    };
  }

  static types(): { [key: string]: any } {
    return {
      vComputerGroup: VComputerGroup,
      ip: 'string',
      computer: Computer,
      port: 'number',
      weight: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 专有网络
export class VPC extends $tea.Model {
  // VPC的IPv4网段
  cidrBlock: string;
  // VPC的创建时间
  creationTime: string;
  // VPC的描述信息
  description?: string;
  // VPC所在的地域
  regionId: string;
  // 路由表ID
  routerTableIds: string[];
  // VPC的状态，取值：
  // 
  // Pending：配置中。
  // Available：可用。
  status: string;
  // 用户侧网段的列表
  userCidrs?: string;
  // VPC的id
  vpcId: string;
  // VPC的名称
  vpcName: string;
  // VPC路由器的ID
  vRouterId: string;
  // 关联的workspace id
  workspaceId?: string;
  // vpc是否已导入workspace
  importInfo?: ImportInfo;
  static names(): { [key: string]: string } {
    return {
      cidrBlock: 'cidr_block',
      creationTime: 'creation_time',
      description: 'description',
      regionId: 'region_id',
      routerTableIds: 'router_table_ids',
      status: 'status',
      userCidrs: 'user_cidrs',
      vpcId: 'vpc_id',
      vpcName: 'vpc_name',
      vRouterId: 'v_router_id',
      workspaceId: 'workspace_id',
      importInfo: 'import_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cidrBlock: 'string',
      creationTime: 'string',
      description: 'string',
      regionId: 'string',
      routerTableIds: { 'type': 'array', 'itemType': 'string' },
      status: 'string',
      userCidrs: 'string',
      vpcId: 'string',
      vpcName: 'string',
      vRouterId: 'string',
      workspaceId: 'string',
      importInfo: ImportInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 工作空间
export class Workspace extends $tea.Model {
  // id
  id?: string;
  // 名称
  name?: string;
  // 网络类型
  networkType?: string;
  // 租户
  tenant?: string;
  // 可用区 id
  zoneIds?: string;
  // region id
  regionId?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      networkType: 'network_type',
      tenant: 'tenant',
      zoneIds: 'zone_ids',
      regionId: 'region_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      networkType: 'string',
      tenant: 'string',
      zoneIds: 'string',
      regionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// SecurityGroupParam
export class SecurityGroupParam extends $tea.Model {
  // description
  description?: string;
  // region id
  regionId?: string;
  // security_group_name
  securityGroupName?: string;
  // vpc_id
  vpcId?: string;
  static names(): { [key: string]: string } {
    return {
      description: 'description',
      regionId: 'region_id',
      securityGroupName: 'security_group_name',
      vpcId: 'vpc_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      description: 'string',
      regionId: 'string',
      securityGroupName: 'string',
      vpcId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户查询
export class UserQuery extends $tea.Model {
  // 基础查询
  baseQuery?: PaginationQuery;
  // id
  id?: string;
  // customerId
  customerId?: string;
  // tenantId
  tenantId?: string;
  // type
  type?: string;
  // types
  types?: string[];
  // email
  email?: string;
  // mobile
  mobile?: string;
  // realName
  realName?: string;
  // loginName
  loginName?: string;
  static names(): { [key: string]: string } {
    return {
      baseQuery: 'base_query',
      id: 'id',
      customerId: 'customer_id',
      tenantId: 'tenant_id',
      type: 'type',
      types: 'types',
      email: 'email',
      mobile: 'mobile',
      realName: 'real_name',
      loginName: 'login_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      baseQuery: PaginationQuery,
      id: 'string',
      customerId: 'string',
      tenantId: 'string',
      type: 'string',
      types: { 'type': 'array', 'itemType': 'string' },
      email: 'string',
      mobile: 'string',
      realName: 'string',
      loginName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// DatabaseImportVO
export class DatabaseImportVO extends $tea.Model {
  // iaas_id
  iaasId?: string;
  // description
  description?: string;
  // type
  type?: string;
  // status
  status?: string;
  // engine
  engine?: string;
  // net_type
  netType?: string;
  // utc_create
  utcCreate?: string;
  // importInfo
  importInfo: ImportVO;
  static names(): { [key: string]: string } {
    return {
      iaasId: 'iaas_id',
      description: 'description',
      type: 'type',
      status: 'status',
      engine: 'engine',
      netType: 'net_type',
      utcCreate: 'utc_create',
      importInfo: 'import_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      iaasId: 'string',
      description: 'string',
      type: 'string',
      status: 'string',
      engine: 'string',
      netType: 'string',
      utcCreate: 'string',
      importInfo: ImportVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用等级视图
export class AppLevelView extends $tea.Model {
  // 应用等级基类
  baseAppLevel?: AppLevel;
  // 应用数量
  appCount?: number;
  // 创建者名称
  creatorName?: string;
  static names(): { [key: string]: string } {
    return {
      baseAppLevel: 'base_app_level',
      appCount: 'app_count',
      creatorName: 'creator_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      baseAppLevel: AppLevel,
      appCount: 'number',
      creatorName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云日志服务(SLS)-日志项目
export class SLSProject extends $tea.Model {
  // 项目描述
  description?: string;
  // 项目名称
  name: string;
  static names(): { [key: string]: string } {
    return {
      description: 'description',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      description: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Staragent Operation Task info
export class OperationTask extends $tea.Model {
  // id
  id?: string;
  // computer id
  computerId?: string;
  // computer ip
  computerIp?: string;
  // command
  command?: string;
  // 状态取值：INIT，PROCESSING，SUCCEEDED，FAILED，TIMEOUT，NOT_FOUND
  status?: string;
  // errorCode
  errorCode?: string;
  // resultMsg
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      computerId: 'computer_id',
      computerIp: 'computer_ip',
      command: 'command',
      status: 'status',
      errorCode: 'error_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      computerId: 'string',
      computerIp: 'string',
      command: 'string',
      status: 'string',
      errorCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用服务查询
export class AppServiceQuery extends $tea.Model {
  // 根据 id 查询
  id?: string;
  // workspaceId
  workspaceId?: string;
  // appId
  appId?: string;
  // name
  name?: string;
  // deployStatus
  deployStatus?: string;
  // ownerId
  ownerId?: string;
  // workspaceIds
  workspaceIds?: string[];
  // appIds
  appIds?: string[];
  // 是否为一方化查询请求
  isOnePartyRequest?: boolean;
  // startIndex
  startIndex?: number;
  // pageSize
  pageSize?: number;
  // currentPage
  currentPage?: number;
  // orders
  orders?: string[];
  // 查询类型
  queryType?: string;
  // Map<String, String>
  conditions?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      workspaceId: 'workspace_id',
      appId: 'app_id',
      name: 'name',
      deployStatus: 'deploy_status',
      ownerId: 'owner_id',
      workspaceIds: 'workspace_ids',
      appIds: 'app_ids',
      isOnePartyRequest: 'is_one_party_request',
      startIndex: 'start_index',
      pageSize: 'page_size',
      currentPage: 'current_page',
      orders: 'orders',
      queryType: 'query_type',
      conditions: 'conditions',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      workspaceId: 'string',
      appId: 'string',
      name: 'string',
      deployStatus: 'string',
      ownerId: 'string',
      workspaceIds: { 'type': 'array', 'itemType': 'string' },
      appIds: { 'type': 'array', 'itemType': 'string' },
      isOnePartyRequest: 'boolean',
      startIndex: 'number',
      pageSize: 'number',
      currentPage: 'number',
      orders: { 'type': 'array', 'itemType': 'string' },
      queryType: 'string',
      conditions: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 云服务器规格族
export class ComputerTypeFamily extends $tea.Model {
  // computer type family id
  id: string;
  // 实例规格族所属代数。
  generation: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      generation: 'generation',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      generation: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// DatabaseSecurityIp
export class DatabaseSecurityIp extends $tea.Model {
  // id
  id: string;
  // resource_id
  resourceId?: string;
  // resource_type
  resourceType?: string;
  // ip
  ip?: string;
  // status
  status?: string;
  // type
  type?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      resourceId: 'resource_id',
      resourceType: 'resource_type',
      ip: 'ip',
      status: 'status',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      resourceId: 'string',
      resourceType: 'string',
      ip: 'string',
      status: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// WorkspaceDto
export class WorkspaceDto extends $tea.Model {
  // displayName
  displayName?: string;
  // id
  id: string;
  // name
  name: string;
  // networkType
  networkType: string;
  // projectId
  projectId: string;
  // status
  status: string;
  // type
  type?: string;
  // utcCreate
  utcCreate: string;
  // utcModified
  utcModified?: string;
  // workspaceRegionDto
  workspaceRegionDto?: WorkspaceRegionDto;
  static names(): { [key: string]: string } {
    return {
      displayName: 'display_name',
      id: 'id',
      name: 'name',
      networkType: 'network_type',
      projectId: 'project_id',
      status: 'status',
      type: 'type',
      utcCreate: 'utc_create',
      utcModified: 'utc_modified',
      workspaceRegionDto: 'workspace_region_dto',
    };
  }

  static types(): { [key: string]: any } {
    return {
      displayName: 'string',
      id: 'string',
      name: 'string',
      networkType: 'string',
      projectId: 'string',
      status: 'string',
      type: 'string',
      utcCreate: 'string',
      utcModified: 'string',
      workspaceRegionDto: WorkspaceRegionDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// RegionWorkspaceVO
export class RegionWorkspaceVO extends $tea.Model {
  // availableNetworkTypes
  availableNetworkTypes: string[];
  // description
  description: string;
  // id
  id: string;
  // identity
  identity: string;
  // name
  name: string;
  // networkType
  networkType: string;
  // providerId
  providerId: string;
  // state
  state: string;
  // workspaces
  workspaces: WorkspaceWithGroupView[];
  static names(): { [key: string]: string } {
    return {
      availableNetworkTypes: 'available_network_types',
      description: 'description',
      id: 'id',
      identity: 'identity',
      name: 'name',
      networkType: 'network_type',
      providerId: 'provider_id',
      state: 'state',
      workspaces: 'workspaces',
    };
  }

  static types(): { [key: string]: any } {
    return {
      availableNetworkTypes: { 'type': 'array', 'itemType': 'string' },
      description: 'string',
      id: 'string',
      identity: 'string',
      name: 'string',
      networkType: 'string',
      providerId: 'string',
      state: 'string',
      workspaces: { 'type': 'array', 'itemType': WorkspaceWithGroupView },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据库Grant
export class Grant extends $tea.Model {
  // account
  account: DatabaseAccount;
  // privilege
  privilege: string;
  // schema
  schema: DbSchema;
  static names(): { [key: string]: string } {
    return {
      account: 'account',
      privilege: 'privilege',
      schema: 'schema',
    };
  }

  static types(): { [key: string]: any } {
    return {
      account: DatabaseAccount,
      privilege: 'string',
      schema: DbSchema,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// DatabaseEngine
export class DatabaseEngine extends $tea.Model {
  // iaas_type
  iaasType?: string;
  // engine
  engine?: string;
  // engine_versions
  engineVersions?: string[];
  static names(): { [key: string]: string } {
    return {
      iaasType: 'iaas_type',
      engine: 'engine',
      engineVersions: 'engine_versions',
    };
  }

  static types(): { [key: string]: any } {
    return {
      iaasType: 'string',
      engine: 'string',
      engineVersions: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// CellGroup
export class CellGroup extends $tea.Model {
  // identity
  identity: string;
  // name
  name: string;
  // description
  description?: string;
  // properties
  properties?: Property[];
  // instancestatus
  instancestatus: string;
  static names(): { [key: string]: string } {
    return {
      identity: 'identity',
      name: 'name',
      description: 'description',
      properties: 'properties',
      instancestatus: 'instancestatus',
    };
  }

  static types(): { [key: string]: any } {
    return {
      identity: 'string',
      name: 'string',
      description: 'string',
      properties: { 'type': 'array', 'itemType': Property },
      instancestatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// VSwitchParam
export class VSwitchParam extends $tea.Model {
  // cidr_block
  cidrBlock?: string;
  // description
  description?: string;
  // region_id
  regionId?: string;
  // vpc_id
  vpcId?: string;
  // vswitch_name
  vswitchName?: string;
  // zone_id
  zoneId?: string;
  static names(): { [key: string]: string } {
    return {
      cidrBlock: 'cidr_block',
      description: 'description',
      regionId: 'region_id',
      vpcId: 'vpc_id',
      vswitchName: 'vswitch_name',
      zoneId: 'zone_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cidrBlock: 'string',
      description: 'string',
      regionId: 'string',
      vpcId: 'string',
      vswitchName: 'string',
      zoneId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用分级查询
export class AppLevelQuery extends $tea.Model {
  // appCountInclude
  appCountInclude?: boolean;
  // creator_id
  creatorId?: string;
  // is_one_party_request
  isOnePartyRequest?: boolean;
  // name
  name?: string;
  // tenant_id
  tenantId?: string;
  // utc_create
  utcCreate?: string;
  // 当前页数
  currentPage?: number;
  // orders
  orders?: string[];
  // 分页大小
  pageSize?: number;
  // query_type
  queryType?: string;
  static names(): { [key: string]: string } {
    return {
      appCountInclude: 'app_count_include',
      creatorId: 'creator_id',
      isOnePartyRequest: 'is_one_party_request',
      name: 'name',
      tenantId: 'tenant_id',
      utcCreate: 'utc_create',
      currentPage: 'current_page',
      orders: 'orders',
      pageSize: 'page_size',
      queryType: 'query_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appCountInclude: 'boolean',
      creatorId: 'string',
      isOnePartyRequest: 'boolean',
      name: 'string',
      tenantId: 'string',
      utcCreate: 'string',
      currentPage: 'number',
      orders: { 'type': 'array', 'itemType': 'string' },
      pageSize: 'number',
      queryType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云日志服务(SLS) - 日志结果数组
export class SLSLogItem extends $tea.Model {
  // 日志的时间戳（精度为秒，从 1970-1-1 00:00:00 UTC 计算起的秒数）。
  logTime: number;
  // 日志的来源，写入日志时指定。
  source: string;
  // 日志原始内容
  contents: SLSLogContent[];
  static names(): { [key: string]: string } {
    return {
      logTime: 'log_time',
      source: 'source',
      contents: 'contents',
    };
  }

  static types(): { [key: string]: any } {
    return {
      logTime: 'number',
      source: 'string',
      contents: { 'type': 'array', 'itemType': SLSLogContent },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ComputerType
export class ComputerType extends $tea.Model {
  // cpu core count
  cpuCoreCount?: number;
  // instance type id
  id: string;
  // 实例规格族
  instanceTypeFamily?: string;
  // memory size
  memorySize?: number;
  // 实例状态，可能值： Available：资源充足 Sold...
  status: string;
  static names(): { [key: string]: string } {
    return {
      cpuCoreCount: 'cpu_core_count',
      id: 'id',
      instanceTypeFamily: 'instance_type_family',
      memorySize: 'memory_size',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cpuCoreCount: 'number',
      id: 'string',
      instanceTypeFamily: 'string',
      memorySize: 'number',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 路由表信息
export class RouteTable extends $tea.Model {
  // 路由表的创建时间。
  creationTime?: string;
  // 路由表所属的路由器类型，取值：
  // 
  // VRouter：VPC路由器。
  // VBR：边界路由器。
  routerType?: string;
  // 	
  // 路由条目的详细信息。
  entryVOs?: VRouteEntry[];
  // 要查询的路由表的ID。
  routeTableId?: string;
  // 要查询的路由表所属的VPC路由器的ID。
  vRouterId?: string;
  static names(): { [key: string]: string } {
    return {
      creationTime: 'creation_time',
      routerType: 'router_type',
      entryVOs: 'entry_v_os',
      routeTableId: 'route_table_id',
      vRouterId: 'v_router_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      creationTime: 'string',
      routerType: 'string',
      entryVOs: { 'type': 'array', 'itemType': VRouteEntry },
      routeTableId: 'string',
      vRouterId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 交换机详细信息
export class VSwitch extends $tea.Model {
  // 交换机的IPv4网段
  cidrBlock?: string;
  // 交换机的创建时间
  creationTime?: string;
  // 交换机的描述信息
  description?: string;
  // cn-hangzhou
  regionId?: string;
  // 交换机的状态，取值：
  // 
  // Pending：配置中。
  // Available：可用。
  status?: string;
  // 交换机所属VPC的ID
  vpcId?: string;
  // 交换机的ID
  vSwitchId?: string;
  // 交换机的名称
  vSwitchName?: string;
  // 交换机所属的可用区
  zoneId?: string;
  // zone iaas id
  zoneIaasId?: string;
  static names(): { [key: string]: string } {
    return {
      cidrBlock: 'cidr_block',
      creationTime: 'creation_time',
      description: 'description',
      regionId: 'region_id',
      status: 'status',
      vpcId: 'vpc_id',
      vSwitchId: 'v_switch_id',
      vSwitchName: 'v_switch_name',
      zoneId: 'zone_id',
      zoneIaasId: 'zone_iaas_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cidrBlock: 'string',
      creationTime: 'string',
      description: 'string',
      regionId: 'string',
      status: 'string',
      vpcId: 'string',
      vSwitchId: 'string',
      vSwitchName: 'string',
      zoneId: 'string',
      zoneIaasId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 一个应用发布包视图
export class AppPackageListView extends $tea.Model {
  // app_id
  appId?: string;
  // app_name
  appName?: string;
  // app_owner_id
  appOwnerId?: string;
  // app_owner_name
  appOwnerName?: string;
  // app_status
  appStatus?: string;
  // buildpack_id
  buildpackId?: string;
  // buildpack_name
  buildpackName?: string;
  // buildpack_version
  buildpackVersion?: string;
  // latest_package
  latestPackage?: AppManifest;
  // package_count
  packageCount?: number;
  static names(): { [key: string]: string } {
    return {
      appId: 'app_id',
      appName: 'app_name',
      appOwnerId: 'app_owner_id',
      appOwnerName: 'app_owner_name',
      appStatus: 'app_status',
      buildpackId: 'buildpack_id',
      buildpackName: 'buildpack_name',
      buildpackVersion: 'buildpack_version',
      latestPackage: 'latest_package',
      packageCount: 'package_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appId: 'string',
      appName: 'string',
      appOwnerId: 'string',
      appOwnerName: 'string',
      appStatus: 'string',
      buildpackId: 'string',
      buildpackName: 'string',
      buildpackVersion: 'string',
      latestPackage: AppManifest,
      packageCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// LbCluster
export class LbCluster extends $tea.Model {
  // container_cpu
  containerCpu?: number;
  // container_cpu_exclusive
  containerCpuExclusive?: boolean;
  // container_device_type
  containerDeviceType?: string;
  // container_disk
  containerDisk?: number;
  // container_mem
  containerMem?: number;
  // id
  id: string;
  // image
  image: string;
  // name
  name: string;
  // status
  status: number;
  // unit_infos
  unitInfos?: AcsClusterUnit[];
  // unit_type
  unitType?: number;
  // used_ports
  usedPorts?: number[];
  static names(): { [key: string]: string } {
    return {
      containerCpu: 'container_cpu',
      containerCpuExclusive: 'container_cpu_exclusive',
      containerDeviceType: 'container_device_type',
      containerDisk: 'container_disk',
      containerMem: 'container_mem',
      id: 'id',
      image: 'image',
      name: 'name',
      status: 'status',
      unitInfos: 'unit_infos',
      unitType: 'unit_type',
      usedPorts: 'used_ports',
    };
  }

  static types(): { [key: string]: any } {
    return {
      containerCpu: 'number',
      containerCpuExclusive: 'boolean',
      containerDeviceType: 'string',
      containerDisk: 'number',
      containerMem: 'number',
      id: 'string',
      image: 'string',
      name: 'string',
      status: 'number',
      unitInfos: { 'type': 'array', 'itemType': AcsClusterUnit },
      unitType: 'number',
      usedPorts: { 'type': 'array', 'itemType': 'number' },
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
  query: string;
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

// RegionDto
export class RegionDto extends $tea.Model {
  // availableNetworkTypes
  availableNetworkTypes: string[];
  // description
  description: string;
  // displayName
  displayName: string;
  // iaasProviderId
  iaasProviderId: string;
  // id
  id: string;
  // identity
  identity: string;
  // networkType
  networkType: string;
  // state
  state: string;
  // utcCreate
  utcCreate: string;
  // utcModified
  utcModified: string;
  // zoneDtos
  zoneDtos: ZoneDto[];
  static names(): { [key: string]: string } {
    return {
      availableNetworkTypes: 'available_network_types',
      description: 'description',
      displayName: 'display_name',
      iaasProviderId: 'iaas_provider_id',
      id: 'id',
      identity: 'identity',
      networkType: 'network_type',
      state: 'state',
      utcCreate: 'utc_create',
      utcModified: 'utc_modified',
      zoneDtos: 'zone_dtos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      availableNetworkTypes: { 'type': 'array', 'itemType': 'string' },
      description: 'string',
      displayName: 'string',
      iaasProviderId: 'string',
      id: 'string',
      identity: 'string',
      networkType: 'string',
      state: 'string',
      utcCreate: 'string',
      utcModified: 'string',
      zoneDtos: { 'type': 'array', 'itemType': ZoneDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ListenerSecurityIp
export class ListenerSecurityIp extends $tea.Model {
  // access_control
  accessControl: boolean;
  // ips
  ips: string[];
  static names(): { [key: string]: string } {
    return {
      accessControl: 'access_control',
      ips: 'ips',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accessControl: 'boolean',
      ips: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// TenantWorkspace
export class TenantWorkspace extends $tea.Model {
  // displayName
  displayName: string;
  // gmtCreate
  gmtCreate: string;
  // gmtModified
  gmtModified: string;
  // id
  id: string;
  // name
  name: string;
  // networkType
  networkType: string;
  // status
  status: string;
  // tenantId
  tenantId: string;
  // type
  type: string;
  // workspaceDcs
  workspaceDcs: WorkspaceDc[];
  // workspaceRegions
  workspaceRegions: WorkspaceRegion[];
  static names(): { [key: string]: string } {
    return {
      displayName: 'display_name',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      id: 'id',
      name: 'name',
      networkType: 'network_type',
      status: 'status',
      tenantId: 'tenant_id',
      type: 'type',
      workspaceDcs: 'workspace_dcs',
      workspaceRegions: 'workspace_regions',
    };
  }

  static types(): { [key: string]: any } {
    return {
      displayName: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      id: 'string',
      name: 'string',
      networkType: 'string',
      status: 'string',
      tenantId: 'string',
      type: 'string',
      workspaceDcs: { 'type': 'array', 'itemType': WorkspaceDc },
      workspaceRegions: { 'type': 'array', 'itemType': WorkspaceRegion },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云日志服务(SLS)-日志配置
export class SLSConfig extends $tea.Model {
  // Logtail配置名称，同一Project下配置名必须唯一。
  // 只能包括小写字母、数字、连字符（-）和下划线（_）。
  // 必须以小写字母或者数字开头和结尾。
  // 长度必须为2~128字节。
  name: string;
  // 配置类型，支持plugin、file。
  inputType: string;
  // 输出类型，目前只支持LogService。
  outputType?: string;
  // 日志样例
  logSample?: string;
  // 输入类型配置
  inputDetail: SLSConfigInputDetail;
  // 输出类型配置
  outputDetail: SLSConfigOutputDetail;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      inputType: 'input_type',
      outputType: 'output_type',
      logSample: 'log_sample',
      inputDetail: 'input_detail',
      outputDetail: 'output_detail',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      inputType: 'string',
      outputType: 'string',
      logSample: 'string',
      inputDetail: SLSConfigInputDetail,
      outputDetail: SLSConfigOutputDetail,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// rmc vpc 详细信息
export class VpcVO extends $tea.Model {
  // VPC的状态，取值： Pending：配置中。 Available：可用。
  status?: string;
  // VPC的IPv4网段
  cidrBlock?: string;
  // VPC路由器的ID
  vRouterIaasId?: string;
  // workspace id
  workspaceId?: string;
  // vpc name
  name?: string;
  // 描述信息
  description?: string;
  // 计费类型
  instanceChargeType?: string;
  // vpc iaas id
  iaasId?: string;
  // provider id
  providerId?: string;
  // iaas 底座类型
  iaasType?: string;
  // region id
  regionId?: string;
  // zone id
  zoneId?: string;
  // vpc id
  id?: string;
  // 创建时间
  utcCreate?: string;
  // 最近一次修改时间
  utcModified?: string;
  static names(): { [key: string]: string } {
    return {
      status: 'status',
      cidrBlock: 'cidr_block',
      vRouterIaasId: 'v_router_iaas_id',
      workspaceId: 'workspace_id',
      name: 'name',
      description: 'description',
      instanceChargeType: 'instance_charge_type',
      iaasId: 'iaas_id',
      providerId: 'provider_id',
      iaasType: 'iaas_type',
      regionId: 'region_id',
      zoneId: 'zone_id',
      id: 'id',
      utcCreate: 'utc_create',
      utcModified: 'utc_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      status: 'string',
      cidrBlock: 'string',
      vRouterIaasId: 'string',
      workspaceId: 'string',
      name: 'string',
      description: 'string',
      instanceChargeType: 'string',
      iaasId: 'string',
      providerId: 'string',
      iaasType: 'string',
      regionId: 'string',
      zoneId: 'string',
      id: 'string',
      utcCreate: 'string',
      utcModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// vpc import info
export class VpcImport extends $tea.Model {
  // cidr block
  cidrBlock?: string;
  // vpc描述信息
  description?: string;
  // vpc iaas id
  iaasId: string;
  // import workspace info
  importInfo: ImportInfo;
  // vpc name
  name: string;
  // vpc status
  status: string;
  static names(): { [key: string]: string } {
    return {
      cidrBlock: 'cidr_block',
      description: 'description',
      iaasId: 'iaas_id',
      importInfo: 'import_info',
      name: 'name',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cidrBlock: 'string',
      description: 'string',
      iaasId: 'string',
      importInfo: ImportInfo,
      name: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// QuotaKv
export class QuotaKv extends $tea.Model {
  // type
  type: string;
  // quota
  quota: number;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      quota: 'quota',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      quota: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用分组视图
export class AppDomainView extends $tea.Model {
  // ownerName
  ownerName?: string;
  // fatherDomainName
  fatherDomainName?: string;
  // 应用列表
  apps?: AppView[];
  // AppDomainView 的父类 AppDomain
  baseAppDomain?: AppDomain[];
  static names(): { [key: string]: string } {
    return {
      ownerName: 'owner_name',
      fatherDomainName: 'father_domain_name',
      apps: 'apps',
      baseAppDomain: 'base_app_domain',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ownerName: 'string',
      fatherDomainName: 'string',
      apps: { 'type': 'array', 'itemType': AppView },
      baseAppDomain: { 'type': 'array', 'itemType': AppDomain },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 机房信息
export class Zone extends $tea.Model {
  // name
  name: string;
  // identity
  identity: string;
  // description
  description?: string;
  // instanceStatus: AVAILABLE  UNAVAILABLE  RETIRED  DELETED
  instancestatus: string;
  // region name
  region: string;
  // properties
  properties: Property[];
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      identity: 'identity',
      description: 'description',
      instancestatus: 'instancestatus',
      region: 'region',
      properties: 'properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      identity: 'string',
      description: 'string',
      instancestatus: 'string',
      region: 'string',
      properties: { 'type': 'array', 'itemType': Property },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// SecurityGroupVO
export class SecurityGroupVO extends $tea.Model {
  // id
  id?: string;
  // iaasIds
  iaasIds?: string[];
  // name
  name?: string;
  // description
  description?: string;
  // status
  status?: string;
  // type
  type?: string;
  // utcCreate
  utcCreate?: string;
  // instanceCount
  instanceCount?: number;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      iaasIds: 'iaas_ids',
      name: 'name',
      description: 'description',
      status: 'status',
      type: 'type',
      utcCreate: 'utc_create',
      instanceCount: 'instance_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      iaasIds: { 'type': 'array', 'itemType': 'string' },
      name: 'string',
      description: 'string',
      status: 'string',
      type: 'string',
      utcCreate: 'string',
      instanceCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// computer 数据盘
export class DataDisk extends $tea.Model {
  // 磁盘大小
  size: number;
  // 若使用磁盘创建，需填写此字段
  snapshotSequence?: string;
  // 磁盘规格
  specId: string;
  // 数据盘设备
  device: string;
  static names(): { [key: string]: string } {
    return {
      size: 'size',
      snapshotSequence: 'snapshot_sequence',
      specId: 'spec_id',
      device: 'device',
    };
  }

  static types(): { [key: string]: any } {
    return {
      size: 'number',
      snapshotSequence: 'string',
      specId: 'string',
      device: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// VpcParam
export class VPCParam extends $tea.Model {
  // cidr_block
  cidrBlock?: string;
  // description
  description?: string;
  // region id
  regionId?: string;
  // vpc_name
  vpcName?: string;
  static names(): { [key: string]: string } {
    return {
      cidrBlock: 'cidr_block',
      description: 'description',
      regionId: 'region_id',
      vpcName: 'vpc_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cidrBlock: 'string',
      description: 'string',
      regionId: 'string',
      vpcName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchdeleteApplicationBuildRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // app_id
  appId: string;
  // build_ids
  buildIds: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appId: 'app_id',
      buildIds: 'build_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appId: 'string',
      buildIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchdeleteApplicationBuildResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // Map<String, Boolean>
  data?: MapStringToBooleanEntity[];
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
      data: { 'type': 'array', 'itemType': MapStringToBooleanEntity },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListApplicationManifestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // app_id
  appId: string;
  // DynamicQuery
  query: DynamicQuery;
  // workspace_id
  workspaceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appId: 'app_id',
      query: 'query',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appId: 'string',
      query: DynamicQuery,
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListApplicationManifestResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // List<AppManifest>
  data?: AppManifest[];
  // 总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': AppManifest },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchdeleteApplicationPackageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // app_id
  appId: string;
  // List<String> versionIds
  versionIds: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appId: 'app_id',
      versionIds: 'version_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appId: 'string',
      versionIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchdeleteApplicationPackageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // Map<String, Boolean>
  data?: MapStringToBooleanEntity[];
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
      data: { 'type': 'array', 'itemType': MapStringToBooleanEntity },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateApplicationPackageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // app_id
  appId: string;
  // manifest
  manifest: AppManifest;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appId: 'app_id',
      manifest: 'manifest',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appId: 'string',
      manifest: AppManifest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateApplicationPackageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class DeleteApplicationPackageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // version_id
  versionId: string;
  // 应用id，用于鉴权
  appId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      versionId: 'version_id',
      appId: 'app_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      versionId: 'string',
      appId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteApplicationPackageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 删除结果
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

export class ListApplicationPackageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间id，用于做鉴权
  workspaceId: string;
  // 动态查询
  dynamicQuery?: DynamicQuery;
  // 应用查询
  query?: AppQuery;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceId: 'workspace_id',
      dynamicQuery: 'dynamic_query',
      query: 'query',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceId: 'string',
      dynamicQuery: DynamicQuery,
      query: AppQuery,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListApplicationPackageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // List<AppPackageListView>
  data?: AppPackageListView[];
  // 总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': AppPackageListView },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadApplicationPackageconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace_id
  workspaceId: string;
  // 应用id，用于鉴权
  appId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceId: 'workspace_id',
      appId: 'app_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceId: 'string',
      appId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadApplicationPackageconfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // Map<String, Boolean>
  data?: MapStringToBooleanEntity[];
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
      data: { 'type': 'array', 'itemType': MapStringToBooleanEntity },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAppserviceCellRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace_id
  workspaceId: string;
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

export class ListAppserviceCellResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // List<CellView>
  data?: CellView[];
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
      data: { 'type': 'array', 'itemType': CellView },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAppserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // app_service
  appService: AppService;
  // 工作空间id，用于鉴权
  workspaceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appService: 'app_service',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appService: AppService,
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAppserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建结果
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

export class GetAppserviceDefaultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // app_id
  appId: string;
  // workspace_id
  workspaceId: string;
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

export class GetAppserviceDefaultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // AppService
  data?: AppService;
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
      data: AppService,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExistAppserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // app_id
  appId: string;
  // name
  name: string;
  // workspace_id
  workspaceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appId: 'app_id',
      name: 'name',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appId: 'string',
      name: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExistAppserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class UpdateAppserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // app_service
  appService: AppService;
  // 工作空间id，用于鉴权
  workspaceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appService: 'app_service',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appService: AppService,
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAppserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 更新结果
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

export class QueryBuildpackRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 技术栈版本
  bpVersion?: string;
  // 是否分页，默认为true
  byPage?: boolean;
  // 组件ID
  componentId?: string;
  // 配置ID
  configId?: string;
  // 页码：默认值为1，表示第一页
  currentPage?: number;
  // 部署脚本id
  deployScriptId?: string;
  // 技术栈ID标识
  id?: string;
  // 是否包含模板
  includeTemplate?: boolean;
  // 技术栈名称
  name?: string;
  // 每页返回个数
  pageSize?: number;
  // 查询名称过滤方式
  // 模糊查询 FUZZY
  // 精准匹配 ACCURATE
  // 前缀查询 START_WITH
  queryType?: string;
  // 所属技术栈类别ID
  stackId?: string;
  // 技术栈状态
  status?: string;
  // 技术栈定义类型
  // 系统模板 TEMPLATE,
  // 用户自定义 CUSTOM,
  // 后台服务 BACKGROUND_SERVICE
  types?: string[];
  // 工作空间
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      bpVersion: 'bp_version',
      byPage: 'by_page',
      componentId: 'component_id',
      configId: 'config_id',
      currentPage: 'current_page',
      deployScriptId: 'deploy_script_id',
      id: 'id',
      includeTemplate: 'include_template',
      name: 'name',
      pageSize: 'page_size',
      queryType: 'query_type',
      stackId: 'stack_id',
      status: 'status',
      types: 'types',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      bpVersion: 'string',
      byPage: 'boolean',
      componentId: 'string',
      configId: 'string',
      currentPage: 'number',
      deployScriptId: 'string',
      id: 'string',
      includeTemplate: 'boolean',
      name: 'string',
      pageSize: 'number',
      queryType: 'string',
      stackId: 'string',
      status: 'string',
      types: { 'type': 'array', 'itemType': 'string' },
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBuildpackResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前页码
  currentPage?: number;
  // 技术栈列表
  list?: Buildpack[];
  // 每页个数
  pageSize?: number;
  // 起始位置
  startIndex?: number;
  // 总计
  totalSize?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      currentPage: 'current_page',
      list: 'list',
      pageSize: 'page_size',
      startIndex: 'start_index',
      totalSize: 'total_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      currentPage: 'number',
      list: { 'type': 'array', 'itemType': Buildpack },
      pageSize: 'number',
      startIndex: 'number',
      totalSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetApplicationDetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 应用ID
  appId: string;
  // 工作空间ID
  workspaceId: string;
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

export class GetApplicationDetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 应用详情信息
  data?: AppView;
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
      data: AppView,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 当前页码
  currentPage?: number;
  // customer_id
  customerId?: string;
  // 邮箱
  email?: string;
  // 用户ID
  id?: string;
  // is_locale_enabled
  isLocaleEnabled?: boolean;
  // local
  local?: string;
  // 登录名称
  loginName?: string;
  // 手机号
  mobile?: string;
  // 排序关键字列表
  orders?: string[];
  // 每页个数
  pageSize?: number;
  // 是否分页
  paging?: boolean;
  // 查询类型
  // 模糊查询 FUZZY
  // 精准查询 ACCURATE,
  //  前缀查询 START_WITH
  queryType?: string;
  // 实际名称
  realName?: string;
  // search
  search?: boolean;
  // 账户类型
  // MASTER 主账号
  // OPERATOR 操作员
  // SERVICE 服务账号
  // STS_ACTOR 虚拟身份
  type?: string;
  // 账户类型列表
  types?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      currentPage: 'current_page',
      customerId: 'customer_id',
      email: 'email',
      id: 'id',
      isLocaleEnabled: 'is_locale_enabled',
      local: 'local',
      loginName: 'login_name',
      mobile: 'mobile',
      orders: 'orders',
      pageSize: 'page_size',
      paging: 'paging',
      queryType: 'query_type',
      realName: 'real_name',
      search: 'search',
      type: 'type',
      types: 'types',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      currentPage: 'number',
      customerId: 'string',
      email: 'string',
      id: 'string',
      isLocaleEnabled: 'boolean',
      local: 'string',
      loginName: 'string',
      mobile: 'string',
      orders: { 'type': 'array', 'itemType': 'string' },
      pageSize: 'number',
      paging: 'boolean',
      queryType: 'string',
      realName: 'string',
      search: 'boolean',
      type: 'string',
      types: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户列表
  data?: UserDTO[];
  // 页数
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
      data: { 'type': 'array', 'itemType': UserDTO },
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
  // OAuth模式下的授权token
  authToken?: string;
  // 动态查询
  dynamicQuery?: DynamicQuery;
  // 应用分组查询
  query?: AppDomainQuery;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      dynamicQuery: 'dynamic_query',
      query: 'query',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      dynamicQuery: DynamicQuery,
      query: AppDomainQuery,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAppgroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: AppDomainView[];
  // totalCount
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': AppDomainView },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExistAppgroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // name
  name: string;
  // parentId
  parentId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      parentId: 'parent_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      parentId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExistAppgroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class CreateAppgroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // domain tree
  domain: AppDomainFlatten;
  // 占位
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      domain: 'domain',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      domain: AppDomainFlatten,
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAppgroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class ListAppgroupOwnerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 用户查询
  query: UserQuery;
  // 占位
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      query: 'query',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      query: UserQuery,
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAppgroupOwnerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户列表
  data?: UserDTO[];
  // 总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': UserDTO },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAppgroupTreeRequest extends $tea.Model {
  // OAuth模式下的授权token
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

export class GetAppgroupTreeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 应用列表，包含依赖关系
  data?: AppDomainFlatten[];
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
      data: { 'type': 'array', 'itemType': AppDomainFlatten },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAppgroupSystemtreeRequest extends $tea.Model {
  // OAuth模式下的授权token
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

export class GetAppgroupSystemtreeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 应用分组结构
  data?: AppDomainFlatten[];
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
      data: { 'type': 'array', 'itemType': AppDomainFlatten },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAppgroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 分组 id
  id: string;
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

export class DeleteAppgroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 删除结果
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

export class UpdateAppgroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 更新内容
  domain: AppDomainFlatten;
  // 应用分组id
  id: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      domain: 'domain',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      domain: AppDomainFlatten,
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAppgroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 更新结果
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

export class ListApplevelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 动态查询
  dynamicQuery?: DynamicQuery;
  // 应用分级查询
  query?: AppLevelQuery;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      dynamicQuery: 'dynamic_query',
      query: 'query',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      dynamicQuery: DynamicQuery,
      query: AppLevelQuery,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListApplevelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 应用等级列表
  data?: AppLevelView[];
  // 总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': AppLevelView },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExistApplevelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 应用等级名称
  name: string;
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

export class ExistApplevelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class CreateApplevelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 应用等级
  level: AppLevel;
  // 占位，因为入参不能只有一个结构体
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      level: 'level',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      level: AppLevel,
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateApplevelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建结果
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

export class DeleteApplevelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 应用等级 id
  id: string;
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

export class DeleteApplevelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 删除结果
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

export class UpdateApplevelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 应用等级id
  id: string;
  // 应用等级名称
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateApplevelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 更新结果
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

export class ListApplicationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 动态查询
  dynamicQuery?: DynamicQuery;
  // 应用查询
  query?: AppQuery;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      dynamicQuery: 'dynamic_query',
      query: 'query',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      dynamicQuery: DynamicQuery,
      query: AppQuery,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListApplicationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 应用列表
  data?: AppView[];
  // 总数量
  totalCount?: number;
  // 当前页码
  pageNum?: number;
  // 分页大小
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      totalCount: 'total_count',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': AppView },
      totalCount: 'number',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateApplicationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // appDomainId
  appDomainId?: string;
  // appExtraInfos
  appExtraInfos?: AppExtraInfo[];
  // 应用等级
  appLevel?: AppLevel;
  // appOwner
  appOwner?: AppOwner;
  // archetype
  archetype?: ScmSofaArchetype;
  // buildpackVersion
  buildpackVersion?: string;
  // 中文名称
  chineseName?: string;
  // 代码库
  codeRepository?: CodeRepository;
  // 描述
  description?: string;
  // 额外信息
  extraParams?: string;
  // id
  id?: string;
  // isService
  isService?: boolean;
  // name
  name?: string;
  // ownerId
  ownerId?: string;
  // stack_id
  stackId?: string;
  // 状态
  status?: string;
  // tags
  tags?: string;
  // 创建时间
  utcCreate?: string;
  // 修改时间
  utcModified?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appDomainId: 'app_domain_id',
      appExtraInfos: 'app_extra_infos',
      appLevel: 'app_level',
      appOwner: 'app_owner',
      archetype: 'archetype',
      buildpackVersion: 'buildpack_version',
      chineseName: 'chinese_name',
      codeRepository: 'code_repository',
      description: 'description',
      extraParams: 'extra_params',
      id: 'id',
      isService: 'is_service',
      name: 'name',
      ownerId: 'owner_id',
      stackId: 'stack_id',
      status: 'status',
      tags: 'tags',
      utcCreate: 'utc_create',
      utcModified: 'utc_modified',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appDomainId: 'string',
      appExtraInfos: { 'type': 'array', 'itemType': AppExtraInfo },
      appLevel: AppLevel,
      appOwner: AppOwner,
      archetype: ScmSofaArchetype,
      buildpackVersion: 'string',
      chineseName: 'string',
      codeRepository: CodeRepository,
      description: 'string',
      extraParams: 'string',
      id: 'string',
      isService: 'boolean',
      name: 'string',
      ownerId: 'string',
      stackId: 'string',
      status: 'string',
      tags: 'string',
      utcCreate: 'string',
      utcModified: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateApplicationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 更新结果
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

export class ListAppserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 动态查询
  dynamicQuery?: DynamicQuery;
  // 应用服务查询
  query?: AppServiceQuery;
  // 工作空间id，用于鉴权
  workspaceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      dynamicQuery: 'dynamic_query',
      query: 'query',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      dynamicQuery: DynamicQuery,
      query: AppServiceQuery,
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAppserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前页面
  currentPage?: number;
  // PaginationResult<AppServiceViewModel>
  data?: AppServiceViewModel[];
  // 分页大小
  pageSize?: number;
  // 总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      currentPage: 'current_page',
      data: 'data',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      currentPage: 'number',
      data: { 'type': 'array', 'itemType': AppServiceViewModel },
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAppserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // id
  id: string;
  // 工作空间id，用于鉴权
  workspaceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAppserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: number;
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
      data: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAppserviceDetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 应用服务id
  appServiceId: string;
  // 工作空间id，用于鉴权
  workspaceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appServiceId: 'app_service_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appServiceId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAppserviceDetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 应用服务详情
  data?: AppServiceViewModel;
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
      data: AppServiceViewModel,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExistApplicationPackageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // appId
  appId: string;
  // version
  appVersion: string;
  // workspaceId
  workspaceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appId: 'app_id',
      appVersion: 'app_version',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appId: 'string',
      appVersion: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExistApplicationPackageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
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

export class GetApplicationPackageuploadpolicyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // appId
  appId: string;
  // workspaceId
  workspaceId: string;
  // version
  appVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appId: 'app_id',
      workspaceId: 'workspace_id',
      appVersion: 'app_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appId: 'string',
      workspaceId: 'string',
      appVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetApplicationPackageuploadpolicyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发布包上传策略
  data?: PackageUploadPolicy;
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
      data: PackageUploadPolicy,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetApplicationPackagedownloadurlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // versionId
  versionId: string;
  // 应用id，用于鉴权
  appId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      versionId: 'version_id',
      appId: 'app_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      versionId: 'string',
      appId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetApplicationPackagedownloadurlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 下载链接
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

export class ExistApplicationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 应用名称
  appName: string;
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

export class ExistApplicationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class QueryAppserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 应用服务 id 数组
  ids: string[];
  // workspaceId 用于鉴权
  workspaceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      ids: 'ids',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      ids: { 'type': 'array', 'itemType': 'string' },
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 应用服务数组
  data?: AppService[];
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
      data: { 'type': 'array', 'itemType': AppService },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAppgrayconfigsRequest extends $tea.Model {
  // OAuth模式下的授权token
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

export class GetAppgrayconfigsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 开关配置清单
  data?: MapStringToBooleanEntity[];
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
      data: { 'type': 'array', 'itemType': MapStringToBooleanEntity },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateComputerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // app id
  appId?: string;
  // app service id
  appServiceId?: string;
  // 是否自动续费
  autoRenew?: boolean;
  // 每次自动续费的时长，当参数AutoRenew取值True时为必填取值范围：
  //    1
  //      2
  //      3
  //       6
  //      12
  //     
  autoRenewPeriod?: number;
  // cell id
  cellId?: string;
  // 通用镜像文件ID，启动实例时选择的镜像资源。
  // 
  commonImageSequence?: string;
  // AKE模式下可以指定此值
  cpuShared?: boolean;
  // 数据盘信息
  dataDisks?: DataDisk[];
  // sigma模式取值，公有云模式下无意义
  deployMode?: string;
  // 实例描述
  // 
  description?: string;
  // 是否使用全局唯一名称
  distinctName?: boolean;
  // 自定义镜像文件ID，启动实例时选择的镜像资源。
  // 
  imageSequence?: string;
  // 计费方式，默认按量计费
  instanceChargeType?: string;
  // 创建的实例数量。默认为 1 台
  instanceCount?: number;
  // 实例名称前缀。可包含小写字母(a-z)，数字(0-9) 和中划线(-)，以字母开头，中划线不能结尾或连续使用，2 ~ 40 个字符。
  name?: string;
  // 实例的密码。长度为8至30个字符，必须同时包含大小写英文字母、数字和特殊符号中的三类字符。特殊符号可以是： ()`~!@#^&*-_+=|{}[]:;'<>,.?/ 其中，Windows实例不能以斜线号（/）为密码首字符。
  password?: string;
  // 购买资源的时长，单位为：月。当参数 InstanceChargeType 取值为 PrePaid 时才生效且为必选值。取值范围：1 - 9
  //      12
  //      24
  //      36
  //      48
  //      60
  // 
  period?: number;
  //  购买资源的时长。可选值Week | Month。
  //  PeriodUnit 为 Week 时：
  //  Period 取值 {“1”, “2”, “3”, “4”}
  // AutoRenewPeriod 取值 {“1”, “2”, “3”}
  //  Period 取值 { “1”, “2”, “3”, “4”, “5”, “6”, “7”, “8”, “9”, “12”, “24”, “36”,”48”,”60”}
  //    AutoRenewPeriod 取值 {“1”, “2”, “3”, “6”, “12”}
  //     默认值：Month
  periodUnit?: string;
  // 新创建实例所属于的安全组/域序列号，同一个安全组内的实例之间可以互相访问。
  securityGroupSequence: string;
  // 实例的资源规格。
  // 
  specId: string;
  // 单位 G。系统盘大小，需根据选择的 image 类型决定。
  systemDiskSize: number;
  // 系统盘类型
  // 
  systemDiskType: string;
  // VPC类型的实例，需要指定虚拟交换机ID。
  vSwitchId?: string;
  // 实例所在工作空间
  workspace: string;
  // workspace_id
  workspaceId?: string;
  // 实例所在可用区的 zone identity
  zone: string;
  // zone_id如果为空，则zone必填，建议使用zone_id
  zoneId?: string;
  // 公有云上标签
  tags?: MapStringToStringEntity[];
  // cmp模式下使用的vpc，一般场景勿用
  vpcIaasId?: string;
  // cmp模式下传的token，一般场景勿用
  cloudManageToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appId: 'app_id',
      appServiceId: 'app_service_id',
      autoRenew: 'auto_renew',
      autoRenewPeriod: 'auto_renew_period',
      cellId: 'cell_id',
      commonImageSequence: 'common_image_sequence',
      cpuShared: 'cpu_shared',
      dataDisks: 'data_disks',
      deployMode: 'deploy_mode',
      description: 'description',
      distinctName: 'distinct_name',
      imageSequence: 'image_sequence',
      instanceChargeType: 'instance_charge_type',
      instanceCount: 'instance_count',
      name: 'name',
      password: 'password',
      period: 'period',
      periodUnit: 'period_unit',
      securityGroupSequence: 'security_group_sequence',
      specId: 'spec_id',
      systemDiskSize: 'system_disk_size',
      systemDiskType: 'system_disk_type',
      vSwitchId: 'v_switch_id',
      workspace: 'workspace',
      workspaceId: 'workspace_id',
      zone: 'zone',
      zoneId: 'zone_id',
      tags: 'tags',
      vpcIaasId: 'vpc_iaas_id',
      cloudManageToken: 'cloud_manage_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appId: 'string',
      appServiceId: 'string',
      autoRenew: 'boolean',
      autoRenewPeriod: 'number',
      cellId: 'string',
      commonImageSequence: 'string',
      cpuShared: 'boolean',
      dataDisks: { 'type': 'array', 'itemType': DataDisk },
      deployMode: 'string',
      description: 'string',
      distinctName: 'boolean',
      imageSequence: 'string',
      instanceChargeType: 'string',
      instanceCount: 'number',
      name: 'string',
      password: 'string',
      period: 'number',
      periodUnit: 'string',
      securityGroupSequence: 'string',
      specId: 'string',
      systemDiskSize: 'number',
      systemDiskType: 'string',
      vSwitchId: 'string',
      workspace: 'string',
      workspaceId: 'string',
      zone: 'string',
      zoneId: 'string',
      tags: { 'type': 'array', 'itemType': MapStringToStringEntity },
      vpcIaasId: 'string',
      cloudManageToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateComputerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // computer_sequences
  computerSequences?: string[];
  // paas_request_id，可以根据这个值查询日志
  paasRequestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      computerSequences: 'computer_sequences',
      paasRequestId: 'paas_request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      computerSequences: { 'type': 'array', 'itemType': 'string' },
      paasRequestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteComputerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // computer_sequences
  computerSequences: string[];
  // 后续这个字段必填
  workspaceId?: string;
  // 是否强制删除
  force?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      computerSequences: 'computer_sequences',
      workspaceId: 'workspace_id',
      force: 'force',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      computerSequences: { 'type': 'array', 'itemType': 'string' },
      workspaceId: 'string',
      force: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteComputerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // paas_request_id
  paasRequestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      paasRequestId: 'paas_request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      paasRequestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportComputerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // computer iaas ids
  computerIds: string[];
  // workspace 名称
  workspace: string;
  // computer 所在的 zone identity。可不填。
  zone?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      computerIds: 'computer_ids',
      workspace: 'workspace',
      zone: 'zone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      computerIds: { 'type': 'array', 'itemType': 'string' },
      workspace: 'string',
      zone: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportComputerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 导入的 computer 序列号
  computerIdMapping?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      computerIdMapping: 'computer_id_mapping',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      computerIdMapping: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDatabaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 数据库账户
  databaseAccounts?: DatabaseAccount[];
  // db schema
  databaseSchema?: DatabaseSchema;
  // db 引擎，默认为在 MYSQL
  engine?: string;
  // 引擎版本，默认为 MYSQL6
  engineVersion?: string;
  // 创建的实例数量。默认为 1 台
  instanceCount?: number;
  // database 名称
  name?: string;
  // db 规格。
  specId: string;
  // db 存储空间大小
  storageSize: number;
  // database 类型，默认为 DATABASE 类型
  type?: string;
  // VPC类型的实例，需要指定虚拟交换机ID。
  vSwitchId?: string;
  // database 所在工作空间
  workspace: string;
  // app service ids
  appServiceIds?: string[];
  // app ids
  appIds?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      databaseAccounts: 'database_accounts',
      databaseSchema: 'database_schema',
      engine: 'engine',
      engineVersion: 'engine_version',
      instanceCount: 'instance_count',
      name: 'name',
      specId: 'spec_id',
      storageSize: 'storage_size',
      type: 'type',
      vSwitchId: 'v_switch_id',
      workspace: 'workspace',
      appServiceIds: 'app_service_ids',
      appIds: 'app_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      databaseAccounts: { 'type': 'array', 'itemType': DatabaseAccount },
      databaseSchema: DatabaseSchema,
      engine: 'string',
      engineVersion: 'string',
      instanceCount: 'number',
      name: 'string',
      specId: 'string',
      storageSize: 'number',
      type: 'string',
      vSwitchId: 'string',
      workspace: 'string',
      appServiceIds: { 'type': 'array', 'itemType': 'string' },
      appIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDatabaseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // database 实例 ids
  databaseSequences?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      databaseSequences: 'database_sequences',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      databaseSequences: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportDatabaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // database iaas ids
  databaseIds: string[];
  // database 类型，默认为 DATABASE 类型
  type?: string;
  // 工作空间
  workspace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      databaseIds: 'database_ids',
      type: 'type',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      databaseIds: { 'type': 'array', 'itemType': 'string' },
      type: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportDatabaseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 导入的 computer 序列号
  databaseIdMapping?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      databaseIdMapping: 'database_id_mapping',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      databaseIdMapping: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteDatabaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // database 序列号
  databaseSequences: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      databaseSequences: 'database_sequences',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      databaseSequences: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteDatabaseResponse extends $tea.Model {
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

export class CreateLoadbalanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 负载均衡实例的网络类型。有 INTERNET 和 INTRANET
  addressType?: string;
  // app id
  appId?: string;
  // app service id
  appServiceId?: string;
  // cluster_mode
  clusterMode?: boolean;
  // 	
  // 创建的实例数量。默认为 1 台
  instanceCount?: number;
  // 公网类型实例的付费方式。取值：
  // PAY_BY_BANDWIDTH：按带宽计费。
  // PAY_BY_TRAFFIC：按流量计费（默认值）。
  internetChargeType?: string;
  // listener JSON Array
  listeners?: string[];
  // 名称
  name?: string;
  // 共享模式
  shareMode: boolean;
  // ALB模式专用
  vipType?: string;
  // VPC类型的实例，需要指定虚拟交换机ID。
  vSwitchId?: string;
  // 工作空间
  workspace: string;
  // workspace_id
  workspaceId?: string;
  // 可用区
  zoneId?: string;
  // 负载均衡实例的规格。取值：
  // 
  // slb.s1.small
  // slb.s2.small
  // slb.s2.medium
  // slb.s3.small
  // slb.s3.medium
  // slb.s3.large
  // 每个地域支持的规格不同。
  // 
  // 目前支持性能保障型实例的地域有：华北 1（青岛）、华北 2（北京）、华东 1（杭州）、华东 2（上海）、华南 1（深圳）、华北 3（张家口）、华北 5 （呼和浩特）、亚太东南 1（新加坡）、英国（伦敦）、欧洲中部 1（法兰克福）、亚太东南 2（悉尼）、亚太东南 3（吉隆坡）、中东东部 1（迪拜）、亚太东南 5（雅加达）、美西 1（硅谷）、亚太南部 1（孟买）、亚太东北 1（东京）、中国香港和美东 1（弗吉尼亚）
  loadBalancerSpec?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      addressType: 'address_type',
      appId: 'app_id',
      appServiceId: 'app_service_id',
      clusterMode: 'cluster_mode',
      instanceCount: 'instance_count',
      internetChargeType: 'internet_charge_type',
      listeners: 'listeners',
      name: 'name',
      shareMode: 'share_mode',
      vipType: 'vip_type',
      vSwitchId: 'v_switch_id',
      workspace: 'workspace',
      workspaceId: 'workspace_id',
      zoneId: 'zone_id',
      loadBalancerSpec: 'load_balancer_spec',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      addressType: 'string',
      appId: 'string',
      appServiceId: 'string',
      clusterMode: 'boolean',
      instanceCount: 'number',
      internetChargeType: 'string',
      listeners: { 'type': 'array', 'itemType': 'string' },
      name: 'string',
      shareMode: 'boolean',
      vipType: 'string',
      vSwitchId: 'string',
      workspace: 'string',
      workspaceId: 'string',
      zoneId: 'string',
      loadBalancerSpec: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLoadbalanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 实例 id
  loadbalanceSequences?: string[];
  // paas_request_id
  paasRequestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      loadbalanceSequences: 'loadbalance_sequences',
      paasRequestId: 'paas_request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      loadbalanceSequences: { 'type': 'array', 'itemType': 'string' },
      paasRequestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteLoadbalanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // loadbalance 序列号
  loadbalanceSequences: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      loadbalanceSequences: 'loadbalance_sequences',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      loadbalanceSequences: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteLoadbalanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // paas_request_id
  paasRequestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      paasRequestId: 'paas_request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      paasRequestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportLoadbalanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // loadbalance iaas ids
  loadbalanceIds: string[];
  // 工作空间
  workspace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      loadbalanceIds: 'loadbalance_ids',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      loadbalanceIds: { 'type': 'array', 'itemType': 'string' },
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportLoadbalanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 导入的 loadbalance 序列号
  loadbalanceIdMapping?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      loadbalanceIdMapping: 'loadbalance_id_mapping',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      loadbalanceIdMapping: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateVpcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 专有网络网段
  cidrLock: string;
  // 名称
  name: string;
  // 工作空间
  workspace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      cidrLock: 'cidr_lock',
      name: 'name',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      cidrLock: 'string',
      name: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateVpcResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 专有网络序列号
  vpcSequence?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      vpcSequence: 'vpc_sequence',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      vpcSequence: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteVpcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 专有网络序列号
  vpcSequence: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      vpcSequence: 'vpc_sequence',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      vpcSequence: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteVpcResponse extends $tea.Model {
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

export class ReleaseComputerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 需要释放的 computer ids
  computerSequences: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      computerSequences: 'computer_sequences',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      computerSequences: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReleaseComputerResponse extends $tea.Model {
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

export class ReinitComputerPasswordRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // computer_sequence
  computerSequence: string;
  // 密码
  password: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      computerSequence: 'computer_sequence',
      password: 'password',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      computerSequence: 'string',
      password: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReinitComputerPasswordResponse extends $tea.Model {
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

export class ReleaseDatabaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 需要释放的应用 ids
  appIds?: string[];
  // 应用实例 ids
  appServiceIds?: string[];
  // 需要释放应用的 database sequence
  databaseSequences: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appIds: 'app_ids',
      appServiceIds: 'app_service_ids',
      databaseSequences: 'database_sequences',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appIds: { 'type': 'array', 'itemType': 'string' },
      appServiceIds: { 'type': 'array', 'itemType': 'string' },
      databaseSequences: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReleaseDatabaseResponse extends $tea.Model {
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

export class RemoveComputerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // computer ids
  computerSequences: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      computerSequences: 'computer_sequences',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      computerSequences: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RemoveComputerResponse extends $tea.Model {
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

export class RemoveLoadbalanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // lb ids
  loadbalanceSequences: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      loadbalanceSequences: 'loadbalance_sequences',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      loadbalanceSequences: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RemoveLoadbalanceResponse extends $tea.Model {
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

export class RemoveDatabaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // database ids
  databaseSequences: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      databaseSequences: 'database_sequences',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      databaseSequences: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RemoveDatabaseResponse extends $tea.Model {
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

export class ReleaseLoadbalanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // loadbalance ids
  loadbalanceSequences: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      loadbalanceSequences: 'loadbalance_sequences',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      loadbalanceSequences: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReleaseLoadbalanceResponse extends $tea.Model {
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

export class CreateDatabaseAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // database 序列号
  databaseSequence: string;
  // 账户名称
  name: string;
  // 账户密码
  password: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      databaseSequence: 'database_sequence',
      name: 'name',
      password: 'password',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      databaseSequence: 'string',
      name: 'string',
      password: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDatabaseAccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 账户序列号
  accountSequence?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accountSequence: 'account_sequence',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accountSequence: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSecuritygroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 描述
  description?: string;
  // 安全域/组 名称
  name: string;
  // 所在区域
  region: string;
  // 工作空间名称
  workspace: string;
  // SECURITY_GROUP | SECURITY_ZONE
  // 默认为安全组
  type?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      description: 'description',
      name: 'name',
      region: 'region',
      workspace: 'workspace',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      description: 'string',
      name: 'string',
      region: 'string',
      workspace: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSecuritygroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 安全组/域 序列号
  securityGroupSequence?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      securityGroupSequence: 'security_group_sequence',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      securityGroupSequence: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportSecuritygroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // sg-zm042uh9f8gb1lfcsng6 的 iaas 层 id
  securitygroupId: string;
  // securityGroup 名称
  name: string;
  // 工作空间
  workspace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      securitygroupId: 'securitygroup_id',
      name: 'name',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      securitygroupId: 'string',
      name: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportSecuritygroupResponse extends $tea.Model {
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

export class RemoveSecuritygroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 安全组 id
  securityGroupSequence: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      securityGroupSequence: 'security_group_sequence',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      securityGroupSequence: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RemoveSecuritygroupResponse extends $tea.Model {
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

export class DeleteSecuritygroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 需要删除的 security group id
  securityGroupSequence: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      securityGroupSequence: 'security_group_sequence',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      securityGroupSequence: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSecuritygroupResponse extends $tea.Model {
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

export class DeleteDatabaseSchemaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 欲删除的的 schema id
  schemaSequence: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      schemaSequence: 'schema_sequence',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      schemaSequence: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteDatabaseSchemaResponse extends $tea.Model {
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

export class DeleteDatabaseAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // account id
  accountSequence: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      accountSequence: 'account_sequence',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      accountSequence: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteDatabaseAccountResponse extends $tea.Model {
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

export class DeleteVpcVswitchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // vpc id
  vpcSequence: string;
  // vswitch 的 iaasIds
  vswitchIds: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      vpcSequence: 'vpc_sequence',
      vswitchIds: 'vswitch_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      vpcSequence: 'string',
      vswitchIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteVpcVswitchResponse extends $tea.Model {
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

export class DeleteLoadbalanceListenerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // listener 端口
  listenerPort: number;
  // lb id
  loadbalanceSequence: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      listenerPort: 'listener_port',
      loadbalanceSequence: 'loadbalance_sequence',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      listenerPort: 'number',
      loadbalanceSequence: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteLoadbalanceListenerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // paas_request_id
  paasRequestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      paasRequestId: 'paas_request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      paasRequestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteVpcVroutertableRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 目标网段
  destinationCidrBlock: string;
  // 下一跳实例 iaas id
  nextHopId: string;
  // 路由表 iaasId
  vRouteTableId: string;
  // vpc paas id
  vpcSequence: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      destinationCidrBlock: 'destination_cidr_block',
      nextHopId: 'next_hop_id',
      vRouteTableId: 'v_route_table_id',
      vpcSequence: 'vpc_sequence',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      destinationCidrBlock: 'string',
      nextHopId: 'string',
      vRouteTableId: 'string',
      vpcSequence: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteVpcVroutertableResponse extends $tea.Model {
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

export class RemoveSecuritygroupInstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 安全组 paas id
  securityGroupSequence: string;
  // 要移除的实例序列号
  instanceSequences: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      securityGroupSequence: 'security_group_sequence',
      instanceSequences: 'instance_sequences',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      securityGroupSequence: 'string',
      instanceSequences: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RemoveSecuritygroupInstanceResponse extends $tea.Model {
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

export class DeleteSecuritygroupPermissionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 安全组 paas id
  securityGroupSequence: string;
  // 12345
  permissionHash: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      securityGroupSequence: 'security_group_sequence',
      permissionHash: 'permission_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      securityGroupSequence: 'string',
      permissionHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSecuritygroupPermissionResponse extends $tea.Model {
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

export class RemoveLoadbalanceSecurityipRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 要删除的 ip
  ips: string[];
  // 监听器端口
  listenerPort: number;
  // lb paas id
  loadbalanceSequence: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      ips: 'ips',
      listenerPort: 'listener_port',
      loadbalanceSequence: 'loadbalance_sequence',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      ips: { 'type': 'array', 'itemType': 'string' },
      listenerPort: 'number',
      loadbalanceSequence: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RemoveLoadbalanceSecurityipResponse extends $tea.Model {
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

export class CreateApplicationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 应用分组 id
  appDomainId?: string;
  // 应用等级 id
  appLevelId?: string;
  // 页面请求用户无需自行填写此字段。此字段用于代码库的创建权限认证。为 iam 返回的 authorization 值。
  authorization?: string;
  // 技术栈版本
  buildpackVersion?: string;
  // 应用中文名称
  chineseName?: string;
  // 使用已有的代码库。默认为否。
  codeRepositoryExisted?: boolean;
  // 代码库 group 名称
  codeRepositoryGroupName?: string;
  // 默认无需填写。代码库名称。默认无需关联代码库。
  codeRepositoryName?: string;
  // 默认为 GITLAB。无代码库时，无需填写。
  codeRepositoryType?: string;
  // 应用描述
  description?: string;
  // 应用名称
  name: string;
  // 应用负责人 id
  ownerId?: string;
  // 技术栈 id
  stackId?: string;
  // 当设置代码库时，需设置此字段
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appDomainId: 'app_domain_id',
      appLevelId: 'app_level_id',
      authorization: 'authorization',
      buildpackVersion: 'buildpack_version',
      chineseName: 'chinese_name',
      codeRepositoryExisted: 'code_repository_existed',
      codeRepositoryGroupName: 'code_repository_group_name',
      codeRepositoryName: 'code_repository_name',
      codeRepositoryType: 'code_repository_type',
      description: 'description',
      name: 'name',
      ownerId: 'owner_id',
      stackId: 'stack_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appDomainId: 'string',
      appLevelId: 'string',
      authorization: 'string',
      buildpackVersion: 'string',
      chineseName: 'string',
      codeRepositoryExisted: 'boolean',
      codeRepositoryGroupName: 'string',
      codeRepositoryName: 'string',
      codeRepositoryType: 'string',
      description: 'string',
      name: 'string',
      ownerId: 'string',
      stackId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateApplicationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 应用 id
  applicationId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      applicationId: 'application_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      applicationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteApplicationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 欲删除的应用 id
  applicationIds?: string[];
  // 是否删除绑定的代码库。默认为 false
  deleteCodeRepo?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      applicationIds: 'application_ids',
      deleteCodeRepo: 'delete_code_repo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      applicationIds: { 'type': 'array', 'itemType': 'string' },
      deleteCodeRepo: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteApplicationResponse extends $tea.Model {
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

export class CreateVpcVswitchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 网段
  cidrBlock: string;
  // 描述
  description: string;
  // switch 名称
  name: string;
  // vpc paas id
  vpcSequence: string;
  // zone
  zone: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      cidrBlock: 'cidr_block',
      description: 'description',
      name: 'name',
      vpcSequence: 'vpc_sequence',
      zone: 'zone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      cidrBlock: 'string',
      description: 'string',
      name: 'string',
      vpcSequence: 'string',
      zone: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateVpcVswitchResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // switch paas id
  vswitchSequence?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      vswitchSequence: 'vswitch_sequence',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      vswitchSequence: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateVpcVroutertableRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 目标网端
  destinationCidrBlock: string;
  // 下一跳资源 id
  nextHopId: string;
  // 下一跳类型
  nextHopType: string;
  // 路由表 id
  vRouteTableId: string;
  // vpc paas id
  vpcSequence: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      destinationCidrBlock: 'destination_cidr_block',
      nextHopId: 'next_hop_id',
      nextHopType: 'next_hop_type',
      vRouteTableId: 'v_route_table_id',
      vpcSequence: 'vpc_sequence',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      destinationCidrBlock: 'string',
      nextHopId: 'string',
      nextHopType: 'string',
      vRouteTableId: 'string',
      vpcSequence: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateVpcVroutertableResponse extends $tea.Model {
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

export class AddSecuritygroupInstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 需向安全组中添加的实例 paas 序列号
  instanceSequences: string[];
  // 安全组 paas id
  securityGroupSequence: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      instanceSequences: 'instance_sequences',
      securityGroupSequence: 'security_group_sequence',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      instanceSequences: { 'type': 'array', 'itemType': 'string' },
      securityGroupSequence: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddSecuritygroupInstanceResponse extends $tea.Model {
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

export class UpdateDatabaseSpecRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // db paas id
  databaseSequences: string[];
  // 实例规格 id
  specId: string;
  // 存储空间大小
  storageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      databaseSequences: 'database_sequences',
      specId: 'spec_id',
      storageSize: 'storage_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      databaseSequences: { 'type': 'array', 'itemType': 'string' },
      specId: 'string',
      storageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDatabaseSpecResponse extends $tea.Model {
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

export class UpdateLoadbalanceAccesscontrolRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // lb paas id
  loadbalanceSequence: string;
  // 监听器端口
  listenerPort: number;
  // 是否打开访问控制
  accessControl: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      loadbalanceSequence: 'loadbalance_sequence',
      listenerPort: 'listener_port',
      accessControl: 'access_control',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      loadbalanceSequence: 'string',
      listenerPort: 'number',
      accessControl: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateLoadbalanceAccesscontrolResponse extends $tea.Model {
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

export class UpdateLoadbalanceSpecRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 公网类型实例的付费方式。取值： PAY_BY_BANDWIDTH：按带宽计费。 PAY_BY_TRAFFIC：按流量计费（默认值）。
  internetChargeType: string;
  // 若为按带宽计费类型需填写此字段
  bandwidth?: number;
  // lb paas id
  loadbalanceSequence: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      internetChargeType: 'internet_charge_type',
      bandwidth: 'bandwidth',
      loadbalanceSequence: 'loadbalance_sequence',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      internetChargeType: 'string',
      bandwidth: 'number',
      loadbalanceSequence: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateLoadbalanceSpecResponse extends $tea.Model {
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

export class UpdateVpcVswitchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 修改会的 vswitch 名称
  name: string;
  // vswitch id
  vswitchId: string;
  // vpc paas id
  vpcSequence: string;
  // 描述
  description?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      vswitchId: 'vswitch_id',
      vpcSequence: 'vpc_sequence',
      description: 'description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      vswitchId: 'string',
      vpcSequence: 'string',
      description: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateVpcVswitchResponse extends $tea.Model {
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

export class CreateWorkspaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace 显示名称
  displayName: string;
  // workspace 唯一标识符。
  name: string;
  // VPC ｜ Classic
  networkType: string;
  // 地域
  region: string;
  // 可用区
  zones?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      displayName: 'display_name',
      name: 'name',
      networkType: 'network_type',
      region: 'region',
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
      zones: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateWorkspaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class CreateMetaWorkspaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace 显示名称
  displayName: string;
  // workspace 唯一标识符
  name: string;
  // VPC ｜ Classic
  networkType: string;
  // 地域
  region: string;
  // 可用区
  zones?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      displayName: 'display_name',
      name: 'name',
      networkType: 'network_type',
      region: 'region',
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
      zones: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateMetaWorkspaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class QueryMetaWorkspaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace id
  workspaceId: string;
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

export class QueryMetaWorkspaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // workspace 信息
  data?: Workspace;
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
      data: Workspace,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteMetaWorkspaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace id
  workspaceId: string;
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

export class DeleteMetaWorkspaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class CreateResourceVpcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // VPC的网段。您可以使用以下网段或其子集作为VPC的网段：
  // 
  // 172.16.0.0/12（默认值）。
  // 10.0.0.0/8。
  // 192.168.0.0/16。
  cidrBlock?: string;
  // 描述信息
  description?: string;
  // VPC的名称
  name: string;
  // VPC所在的地域
  region: string;
  // 用户侧网络的网段
  userCidr?: string;
  // 所属工作空间 identity
  workspace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      cidrBlock: 'cidr_block',
      description: 'description',
      name: 'name',
      region: 'region',
      userCidr: 'user_cidr',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      cidrBlock: 'string',
      description: 'string',
      name: 'string',
      region: 'string',
      userCidr: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateResourceVpcResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建VPC后，系统自动创建的路由表的ID。
  routeTableId?: string;
  // 创建的VPC的ID
  vpcId?: string;
  // 创建VPC后，系统自动创建的路由器的ID。
  vRouterId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      routeTableId: 'route_table_id',
      vpcId: 'vpc_id',
      vRouterId: 'v_router_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      routeTableId: 'string',
      vpcId: 'string',
      vRouterId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryResourceVpcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 是否使用缓存进行查询，默认false，使用缓存查询
  disableCache?: boolean;
  // 地域identity
  region: string;
  // VPC的id
  vpcId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      disableCache: 'disable_cache',
      region: 'region',
      vpcId: 'vpc_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      disableCache: 'boolean',
      region: 'string',
      vpcId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryResourceVpcResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 列表条目数
  totalCount?: number;
  // VPC详细信息
  vpcs?: VPC[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalCount: 'total_count',
      vpcs: 'vpcs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalCount: 'number',
      vpcs: { 'type': 'array', 'itemType': VPC },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteResourceVpcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 要删除的VPC所在的地域identity
  region: string;
  // 要删除的VPC ID
  vpcId: string;
  // workspace id
  workspace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      region: 'region',
      vpcId: 'vpc_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      region: 'string',
      vpcId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteResourceVpcResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 删除VPC是否成功
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

export class CreateResourceVswitchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 交换机的网段。交换机网段要求如下：
  // 
  // 交换机的网段的掩码长度范围为16~29位。
  // 交换机的网段必须从属于所在VPC的网段。
  // 交换机的网段不能与所在VPC中路由条目的目标网段相同，但可以是目标网段的子集。
  cidrBlock: string;
  // 描述信息
  description?: string;
  // 交换机的名称。
  // 
  // 名称长度为2~128个字符，必须以字母或中文开头，但不能以http://或https://开头。
  name: string;
  // 要创建的交换机的地域 identity
  region: string;
  // 要创建的交换机所属的VPC ID。
  vpcId: string;
  // workspace name
  workspace: string;
  // 要创建的交换机所属的可用区 identity
  zone: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      cidrBlock: 'cidr_block',
      description: 'description',
      name: 'name',
      region: 'region',
      vpcId: 'vpc_id',
      workspace: 'workspace',
      zone: 'zone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      cidrBlock: 'string',
      description: 'string',
      name: 'string',
      region: 'string',
      vpcId: 'string',
      workspace: 'string',
      zone: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateResourceVswitchResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建的交换机的ID。
  vSwitchId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      vSwitchId: 'v_switch_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      vSwitchId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryResourceVswitchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 交换机所属地域的identity
  region: string;
  // 要查询的交换机所属VPC的ID
  vpcId?: string;
  // 要查询的交换机的ID
  vSwitchId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      region: 'region',
      vpcId: 'vpc_id',
      vSwitchId: 'v_switch_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      region: 'string',
      vpcId: 'string',
      vSwitchId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryResourceVswitchResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 列表条目数
  totalCount?: number;
  // 交换机的详细信息
  vSwitches?: VSwitch[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalCount: 'total_count',
      vSwitches: 'v_switches',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalCount: 'number',
      vSwitches: { 'type': 'array', 'itemType': VSwitch },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteResourceVswitchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 要删除的交换机的地域identity
  region: string;
  // 要删除的交换机所处专有网络的ID
  vpcId: string;
  // 要删除的交换机的ID
  vSwitchId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      region: 'region',
      vpcId: 'vpc_id',
      vSwitchId: 'v_switch_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      region: 'string',
      vpcId: 'string',
      vSwitchId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteResourceVswitchResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 删除交换机是否成功
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

export class QueryResourceSecuritygroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // disable cache
  disableCache?: boolean;
  // 地域identity
  region: string;
  // 安全组ID。
  securityGroupId?: string;
  // 安全组所在的专有网络ID。
  vpcId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      disableCache: 'disable_cache',
      region: 'region',
      securityGroupId: 'security_group_id',
      vpcId: 'vpc_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      disableCache: 'boolean',
      region: 'string',
      securityGroupId: 'string',
      vpcId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryResourceSecuritygroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 安全组详细信息。
  securityGroups?: SecurityGroup[];
  // 安全组的总数。
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      securityGroups: 'security_groups',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      securityGroups: { 'type': 'array', 'itemType': SecurityGroup },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListMetaWorkspaceRequest extends $tea.Model {
  // OAuth模式下的授权token
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

export class ListMetaWorkspaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 工作空间详细信息列表
  data?: Workspace[];
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
      data: { 'type': 'array', 'itemType': Workspace },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateResourceSecuritygroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 安全组描述信息。长度为2~256个英文或中文字符，不能以http://和https://开头。
  // 
  // 默认值：空。
  description?: string;
  // 安全组入方向规则
  ingressRules?: SecurityGroupRule[];
  // 安全组出方向规则
  egressRules?: SecurityGroupRule[];
  // 安全组名称。长度为2~128个英文或中文字符。必须以大小字母或中文开头，不能以 http://和https://开头。可以包含数字、半角冒号（:）、下划线（_）或者连字符（-）。默认值：空。
  name: string;
  // 安全组所属地域identity
  region: string;
  // 安全组所属VPC ID。
  vpcId: string;
  // workspace name
  workspace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      description: 'description',
      ingressRules: 'ingress_rules',
      egressRules: 'egress_rules',
      name: 'name',
      region: 'region',
      vpcId: 'vpc_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      description: 'string',
      ingressRules: { 'type': 'array', 'itemType': SecurityGroupRule },
      egressRules: { 'type': 'array', 'itemType': SecurityGroupRule },
      name: 'string',
      region: 'string',
      vpcId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateResourceSecuritygroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 安全组ID。
  securityGroupId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      securityGroupId: 'security_group_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      securityGroupId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteResourceSecuritygroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 地域identity
  region: string;
  // 安全组ID。
  securityGroupId: string;
  // 要删除的安全组所处专有网络的ID
  vpcId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      region: 'region',
      securityGroupId: 'security_group_id',
      vpcId: 'vpc_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      region: 'string',
      securityGroupId: 'string',
      vpcId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteResourceSecuritygroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 删除安全组是否成功
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

export class CreateResourceComputerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 实例所属的部署单元
  cell: string;
  // 数据盘的云盘种类。取值范围：
  // 
  // cloud_efficiency：高效云盘
  // cloud_ssd：SSD云盘
  // ephemeral_ssd：本地SSD盘
  // cloud_essd：ESSD云盘
  // cloud：普通云盘
  // I/O优化实例的默认值为cloud_efficiency，非I/O优化实例的默认值为cloud。
  dataDiskCategory?: string;
  // 数据盘的容量大小，n的取值范围为1~16，内存单位为GiB。取值范围：
  // 
  // cloud_efficiency：20~32768
  // cloud_ssd：20~32768
  // cloud_essd：20~32768
  // ephemeral_ssd：5~800
  // cloud：5~2000
  // 该参数的取值必须大于等于参数SnapshotId指定的快照的大小。
  dataDiskSize?: number;
  // 实例的描述信息
  description?: string;
  // 云服务器的主机名。
  // 
  // 点号（.）和短横线（-）不能作为首尾字符，更不能连续使用。
  // Windows实例：字符长度为2~15，不支持点号（.），不能全是数字。允许大小写英文字母、数字和短横线（-）。
  // 其他类型实例（Linux等）：字符长度为2~64，支持多个点号（.），点之间为一段，每段允许大小写英文字母、数字和短横线（-）。
  hostName: string;
  // 镜像文件ID，启动实例时选择的镜像资源。
  imageId: string;
  // 实例的资源规格。
  instanceType: string;
  // 实例的密码。长度为8至30个字符，必须同时包含大小写英文字母、数字和特殊符号中的三类字符。
  password: string;
  // 实例所属的地域ID。
  regionId: string;
  // 系统盘的云盘种类。取值范围：
  // 
  // cloud_efficiency：高效云盘
  // cloud_ssd：SSD云盘
  // cloud：普通云盘
  systemDiskCategory: string;
  // 系统盘大小，单位为GiB。取值范围：20~500
  // 
  // 该参数的取值必须大于或者等于max{20, ImageSize}。
  systemDiskSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      cell: 'cell',
      dataDiskCategory: 'data_disk_category',
      dataDiskSize: 'data_disk_size',
      description: 'description',
      hostName: 'host_name',
      imageId: 'image_id',
      instanceType: 'instance_type',
      password: 'password',
      regionId: 'region_id',
      systemDiskCategory: 'system_disk_category',
      systemDiskSize: 'system_disk_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      cell: 'string',
      dataDiskCategory: 'string',
      dataDiskSize: 'number',
      description: 'string',
      hostName: 'string',
      imageId: 'string',
      instanceType: 'string',
      password: 'string',
      regionId: 'string',
      systemDiskCategory: 'string',
      systemDiskSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateResourceComputerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 实例ID。
  instanceId?: string;
  // 异步任务ID
  jobId?: string;
  // 0表示正常，非0表示异常
  retCode?: number;
  // 错误描述信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      instanceId: 'instance_id',
      jobId: 'job_id',
      retCode: 'ret_code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      instanceId: 'string',
      jobId: 'string',
      retCode: 'number',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryResourceComputerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // iaas id
  iaasId?: string;
  // 逗号分隔的实例ID，最多支持100个
  instanceIds?: string[];
  // 实例名称，支持使用通配符*进行模糊搜索。
  instanceName?: string;
  // 实例的规格
  instanceType?: string;
  // 主机的内网ip，取值可以由多个IP组成一个JSON数组，最多支持100个IP，IP之间用半角逗号（,）隔开。
  privateIpAddresses?: string[];
  // 供应商id
  providerId?: string;
  // 实例所属的地域ID
  regionId: string;
  // 实例所在的企业资源组ID。
  resourceGroupId?: string;
  // 实例状态。取值范围：
  // 
  // Running：运行中
  // Starting：启动中
  // Stopping：停止中
  // Stopped：已停止
  status?: string;
  // 主机所在工作空间
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      iaasId: 'iaas_id',
      instanceIds: 'instance_ids',
      instanceName: 'instance_name',
      instanceType: 'instance_type',
      privateIpAddresses: 'private_ip_addresses',
      providerId: 'provider_id',
      regionId: 'region_id',
      resourceGroupId: 'resource_group_id',
      status: 'status',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      iaasId: 'string',
      instanceIds: { 'type': 'array', 'itemType': 'string' },
      instanceName: 'string',
      instanceType: 'string',
      privateIpAddresses: { 'type': 'array', 'itemType': 'string' },
      providerId: 'string',
      regionId: 'string',
      resourceGroupId: 'string',
      status: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryResourceComputerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询的实例集合
  instances?: Computer[];
  // 实例列表的页码。
  pageNumber?: number;
  // 输入时设置的每页行数。
  pageSize?: number;
  // 请求ID
  requestId?: string;
  // 查询到的实例总数。
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      instances: 'instances',
      pageNumber: 'page_number',
      pageSize: 'page_size',
      requestId: 'request_id',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      instances: { 'type': 'array', 'itemType': Computer },
      pageNumber: 'number',
      pageSize: 'number',
      requestId: 'string',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryResourceComputerspecRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 机器规格族
  instanceTypeGroups?: string;
  // CPU最大值
  maxCpu?: number;
  // 最大内存
  maxMem?: number;
  // CPU最小值
  minCpu?: number;
  // 最小内存
  minMem?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      instanceTypeGroups: 'instance_type_groups',
      maxCpu: 'max_cpu',
      maxMem: 'max_mem',
      minCpu: 'min_cpu',
      minMem: 'min_mem',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      instanceTypeGroups: 'string',
      maxCpu: 'number',
      maxMem: 'number',
      minCpu: 'number',
      minMem: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryResourceComputerspecResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 符合筛选条件的机器规格
  computerSpecs?: ComputerSpec[];
  // 返回的数量
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      computerSpecs: 'computer_specs',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      computerSpecs: { 'type': 'array', 'itemType': ComputerSpec },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteResourceComputerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 要删除的机器ID
  instanceId: string;
  // 是否强制删除
  force?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      instanceId: 'instance_id',
      force: 'force',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      instanceId: 'string',
      force: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteResourceComputerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 0表示正常，非0表示异常
  retCode?: number;
  // 错误描述信息
  message?: string;
  // 异步执行任务id
  jobId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      retCode: 'ret_code',
      message: 'message',
      jobId: 'job_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      retCode: 'number',
      message: 'string',
      jobId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReinitResourceComputerpasswordRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 需要修改的机器Id
  instanceId: string;
  // 重置的密码
  password: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      instanceId: 'instance_id',
      password: 'password',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      instanceId: 'string',
      password: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReinitResourceComputerpasswordResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 0表示正常，非0表示异常
  retCode?: number;
  // 错误描述信息
  message?: string;
  // 异步任务ID
  jobId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      retCode: 'ret_code',
      message: 'message',
      jobId: 'job_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      retCode: 'number',
      message: 'string',
      jobId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartResourceComputerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 机器id
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartResourceComputerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 0表示正常，非0表示异常
  retCode?: number;
  // 异步任务执行id
  jobId?: string;
  // 错误描述信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      retCode: 'ret_code',
      jobId: 'job_id',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      retCode: 'number',
      jobId: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StopResourceComputerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 需要停止的机器id
  instanceId: string;
  // 是否强制停止
  force?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      instanceId: 'instance_id',
      force: 'force',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      instanceId: 'string',
      force: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StopResourceComputerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 非0表示异常，0表示正常
  retCode?: number;
  // 异步执行的任务ID
  jobId?: string;
  // 错误信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      retCode: 'ret_code',
      jobId: 'job_id',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      retCode: 'number',
      jobId: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSlsProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 日志项目名称
  projectName: string;
  // 区域id
  slsRegionId?: string;
  // 租户id
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      projectName: 'project_name',
      slsRegionId: 'sls_region_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      projectName: 'string',
      slsRegionId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSlsProjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建日志项目结果
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

export class ListSlsProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 区域id
  slsRegionId?: string;
  // 租户id
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      slsRegionId: 'sls_region_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      slsRegionId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSlsProjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 日志项目数组
  data?: SLSProject[];
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
      data: { 'type': 'array', 'itemType': SLSProject },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSlsLogstoreRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 日志库名称，在Project下必须唯一
  logstoreName: string;
  // 日志项目名称
  projectName: string;
  // 区域id
  slsRegionId?: string;
  // Shard个数，单位为个，范围为1~100
  shardCount: number;
  // 租户id
  tenantId?: string;
  // 数据的保存时间，单位为天，范围1~3600。
  ttl: number;
  // 是否添加索引
  addIndex?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      logstoreName: 'logstore_name',
      projectName: 'project_name',
      slsRegionId: 'sls_region_id',
      shardCount: 'shard_count',
      tenantId: 'tenant_id',
      ttl: 'ttl',
      addIndex: 'add_index',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      logstoreName: 'string',
      projectName: 'string',
      slsRegionId: 'string',
      shardCount: 'number',
      tenantId: 'string',
      ttl: 'number',
      addIndex: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSlsLogstoreResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 日志库创建结果
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

export class ListSlsLogstoreRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 用于请求的 Logstore 名称（支持部分匹配）。
  logstoreName?: string;
  // 日志项目名称
  projectName: string;
  // 区域id
  slsRegionId?: string;
  // 租户id
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      logstoreName: 'logstore_name',
      projectName: 'project_name',
      slsRegionId: 'sls_region_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      logstoreName: 'string',
      projectName: 'string',
      slsRegionId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSlsLogstoreResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 日志库名称列表
  data?: string[];
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
      data: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSlsLogstoreRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 日志库名称，在Project下必须唯一
  logstoreName: string;
  // 日志项目名称
  projectName: string;
  // 区域id
  slsRegionId?: string;
  // 租户id
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      logstoreName: 'logstore_name',
      projectName: 'project_name',
      slsRegionId: 'sls_region_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      logstoreName: 'string',
      projectName: 'string',
      slsRegionId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSlsLogstoreResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 单个日志库信息
  data?: SLSLogStore;
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
      data: SLSLogStore,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSlsConfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 日志配置详情
  config: SLSConfig;
  // 日志项目名称
  projectName: string;
  // 区域id
  slsRegionId?: string;
  // 租户id
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      config: 'config',
      projectName: 'project_name',
      slsRegionId: 'sls_region_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      config: SLSConfig,
      projectName: 'string',
      slsRegionId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSlsConfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建日志配置结果
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

export class ListSlsConfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 日志项目名称
  projectName: string;
  // 区域id
  slsRegionId?: string;
  // 租户id
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      projectName: 'project_name',
      slsRegionId: 'sls_region_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      projectName: 'string',
      slsRegionId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSlsConfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 日志配置名称列表
  data?: string[];
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
      data: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSlsConfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 要更新的日志配置详情
  config: SLSConfig;
  // 日志项目名称
  projectName: string;
  // 区域id
  slsRegionId?: string;
  // 租户id
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      config: 'config',
      projectName: 'project_name',
      slsRegionId: 'sls_region_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      config: SLSConfig,
      projectName: 'string',
      slsRegionId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSlsConfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 更新日志配置是否成功
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

export class DeleteSlsConfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 要删除的日志配置名称
  name: string;
  // 日志项目名称
  projectName: string;
  // 区域id
  slsRegionId?: string;
  // 租户id
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      projectName: 'project_name',
      slsRegionId: 'sls_region_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      projectName: 'string',
      slsRegionId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSlsConfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 删除日志配置是否成功
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

export class QuerySlsLogRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 查询开始时间点（精度为秒，从 1970-1-1 00:00:00 UTC 计算起的秒数）。
  from: number;
  // 请求返回的最大日志条数。取值范围为 0~100，默认值为 100。
  line?: number;
  // 需要查询日志的 Logstore 名称。
  logstoreName: string;
  // 请求返回日志的起始点。取值范围为 0 或正整数，默认值为 0。
  offset?: number;
  // 日志项目名称
  projectName: string;
  // 查询表达式。关于查询表达式的详细语法，请参见 。
  query?: string;
  // 区域id
  slsRegionId?: string;
  // 是否按日志时间戳逆序返回日志，精确到分钟级别。true 表示逆序，false 表示顺序，默认值为 false。
  reverse?: boolean;
  // 租户id
  tenantId?: string;
  // 查询结束时间点（精度为秒，从 1970-1-1 00:00:00 UTC 计算起的秒数）。
  to: number;
  // 查询日志主题。
  topic?: string;
  // 查询 Logstore 数据的类型。在 GetLogs 接口中该参数必须为 log。
  type?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      from: 'from',
      line: 'line',
      logstoreName: 'logstore_name',
      offset: 'offset',
      projectName: 'project_name',
      query: 'query',
      slsRegionId: 'sls_region_id',
      reverse: 'reverse',
      tenantId: 'tenant_id',
      to: 'to',
      topic: 'topic',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      from: 'number',
      line: 'number',
      logstoreName: 'string',
      offset: 'number',
      projectName: 'string',
      query: 'string',
      slsRegionId: 'string',
      reverse: 'boolean',
      tenantId: 'string',
      to: 'number',
      topic: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySlsLogResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // GetLogs的响应body是一个数组，数组中每个元素是一条日志结果
  data?: SLSLogItem[];
  // 页数
  pageNum?: number;
  // 分页大小
  pageSize?: number;
  // 结果总数
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
      data: { 'type': 'array', 'itemType': SLSLogItem },
      pageNum: 'number',
      pageSize: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateResourceIngressrulesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 安全组入口规则
  ingressRules: SecurityGroupRule[];
  // region identity
  region: string;
  // 安全组id
  securityGroupId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      ingressRules: 'ingress_rules',
      region: 'region',
      securityGroupId: 'security_group_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      ingressRules: { 'type': 'array', 'itemType': SecurityGroupRule },
      region: 'string',
      securityGroupId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateResourceIngressrulesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 安全组入方向规则是否添加成功
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

export class BatchcreateResourceEgressrulesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 安全组出方向规则
  egressRules: SecurityGroupRule[];
  // region identity
  region: string;
  // 安全组id
  securityGroupId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      egressRules: 'egress_rules',
      region: 'region',
      securityGroupId: 'security_group_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      egressRules: { 'type': 'array', 'itemType': SecurityGroupRule },
      region: 'string',
      securityGroupId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateResourceEgressrulesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 安全组出方向规则是否添加成功
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

export class QueryLoadbalanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // app_ids
  appIds?: string[];
  // app_service_ids
  appServiceIds?: string[];
  // cluster_ids
  clusterIds?: string[];
  // cluster_mode
  clusterMode?: boolean;
  // current_page
  currentPage?: number;
  // domains
  domains?: string[];
  // health_levels 
  healthLevels?: string[];
  // iaas_ids
  iaasIds?: string[];
  // name
  name?: string;
  // 网络类型
  networkType?: string;
  // page_size
  pageSize?: number;
  // share_mode
  shareMode?: boolean;
  // lb状态
  statuses?: string[];
  // vip地址
  vipAddresses?: string[];
  // vip地址类型
  vipAddressType?: string;
  // vip类型
  vipType?: string;
  // vpc_ids
  vpcIds?: string[];
  // vswitch_iaas_ids
  vswitchIaasIds?: string[];
  // workspace
  workspace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appIds: 'app_ids',
      appServiceIds: 'app_service_ids',
      clusterIds: 'cluster_ids',
      clusterMode: 'cluster_mode',
      currentPage: 'current_page',
      domains: 'domains',
      healthLevels: 'health_levels',
      iaasIds: 'iaas_ids',
      name: 'name',
      networkType: 'network_type',
      pageSize: 'page_size',
      shareMode: 'share_mode',
      statuses: 'statuses',
      vipAddresses: 'vip_addresses',
      vipAddressType: 'vip_address_type',
      vipType: 'vip_type',
      vpcIds: 'vpc_ids',
      vswitchIaasIds: 'vswitch_iaas_ids',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appIds: { 'type': 'array', 'itemType': 'string' },
      appServiceIds: { 'type': 'array', 'itemType': 'string' },
      clusterIds: { 'type': 'array', 'itemType': 'string' },
      clusterMode: 'boolean',
      currentPage: 'number',
      domains: { 'type': 'array', 'itemType': 'string' },
      healthLevels: { 'type': 'array', 'itemType': 'string' },
      iaasIds: { 'type': 'array', 'itemType': 'string' },
      name: 'string',
      networkType: 'string',
      pageSize: 'number',
      shareMode: 'boolean',
      statuses: { 'type': 'array', 'itemType': 'string' },
      vipAddresses: { 'type': 'array', 'itemType': 'string' },
      vipAddressType: 'string',
      vipType: 'string',
      vpcIds: { 'type': 'array', 'itemType': 'string' },
      vswitchIaasIds: { 'type': 'array', 'itemType': 'string' },
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLoadbalanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回的lb
  data?: LoadBalancer[];
  // total_count
  totalCount?: number;
  // current_page
  currentPage?: number;
  // page_size
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      totalCount: 'total_count',
      currentPage: 'current_page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': LoadBalancer },
      totalCount: 'number',
      currentPage: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetLoadbalanceHealthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // lb_id
  lbId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      lbId: 'lb_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      lbId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetLoadbalanceHealthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // statuses
  data?: LoadBalanceHealthStatus[];
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
      data: { 'type': 'array', 'itemType': LoadBalanceHealthStatus },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllLoadbalanceViptypeRequest extends $tea.Model {
  // OAuth模式下的授权token
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

export class AllLoadbalanceViptypeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // vip_types
  data?: VipType[];
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
      data: { 'type': 'array', 'itemType': VipType },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllLoadbalanceClusterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace
  workspace: string;
  // zone_id
  zoneId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspace: 'workspace',
      zoneId: 'zone_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspace: 'string',
      zoneId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllLoadbalanceClusterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: LbCluster[];
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
      data: { 'type': 'array', 'itemType': LbCluster },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryVpcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // vpc id
  id?: string;
  // workspace name
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

export class QueryVpcResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // vpc detail info
  data?: VpcVO;
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
      data: VpcVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListVpcImportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // region name
  region: string;
  // workspace name
  workspace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      region: 'region',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      region: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListVpcImportResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // vpc import infos
  data?: VpcImport[];
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
      data: { 'type': 'array', 'itemType': VpcImport },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListVpcCidrblockRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // region
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

export class ListVpcCidrblockResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // cidr block list
  data?: string[];
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
      data: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryVpcVswitchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // vpc paas id
  vpcId: string;
  // vswitch iaas id
  vswitchId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      vpcId: 'vpc_id',
      vswitchId: 'vswitch_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      vpcId: 'string',
      vswitchId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryVpcVswitchResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // vswitch detail infos
  data?: VSwitchVO[];
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
      data: { 'type': 'array', 'itemType': VSwitchVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryVpcVroutertableRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // vpc id
  vpcId: string;
  // 路由器id
  vRouterId: string;
  // workspace name
  workspace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      vpcId: 'vpc_id',
      vRouterId: 'v_router_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      vpcId: 'string',
      vRouterId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryVpcVroutertableResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 	
  // 路由表的详细信息。
  data?: RouteTable[];
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
      data: { 'type': 'array', 'itemType': RouteTable },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetLoadbalanceRuleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // rule id
  id: string;
  // workspace
  workspace: string;
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

export class GetLoadbalanceRuleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // rule
  data?: LoadBalancerRule;
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
      data: LoadBalancerRule,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLoadbalanceRuleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // app_ids
  appIds?: string[];
  // cookies
  cookies?: string[];
  // current_page
  currentPage?: number;
  // domains
  domains?: string[];
  // domain_urls
  domainUrls?: string[];
  // health_monitor_ids
  healthMonitorIds?: string[];
  // listener_ports
  listenerPorts?: number[];
  // loadbalancer_ids
  loadbalancerIds?: string[];
  // page_size
  pageSize?: number;
  // statuses
  statuses?: string[];
  // urls
  urls?: string[];
  // vcomputer_group_ids
  vcomputerGroupIds?: string[];
  // workspace
  workspace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appIds: 'app_ids',
      cookies: 'cookies',
      currentPage: 'current_page',
      domains: 'domains',
      domainUrls: 'domain_urls',
      healthMonitorIds: 'health_monitor_ids',
      listenerPorts: 'listener_ports',
      loadbalancerIds: 'loadbalancer_ids',
      pageSize: 'page_size',
      statuses: 'statuses',
      urls: 'urls',
      vcomputerGroupIds: 'vcomputer_group_ids',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appIds: { 'type': 'array', 'itemType': 'string' },
      cookies: { 'type': 'array', 'itemType': 'string' },
      currentPage: 'number',
      domains: { 'type': 'array', 'itemType': 'string' },
      domainUrls: { 'type': 'array', 'itemType': 'string' },
      healthMonitorIds: { 'type': 'array', 'itemType': 'string' },
      listenerPorts: { 'type': 'array', 'itemType': 'number' },
      loadbalancerIds: { 'type': 'array', 'itemType': 'string' },
      pageSize: 'number',
      statuses: { 'type': 'array', 'itemType': 'string' },
      urls: { 'type': 'array', 'itemType': 'string' },
      vcomputerGroupIds: { 'type': 'array', 'itemType': 'string' },
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLoadbalanceRuleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // rules
  data?: LoadBalancerRule[];
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
      data: { 'type': 'array', 'itemType': LoadBalancerRule },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetLoadbalanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // id
  id: string;
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

export class GetLoadbalanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: LoadBalancer;
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
      data: LoadBalancer,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllLoadbalanceMountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // loadbalance_id
  loadbalanceId: string;
  // workspace
  workspace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      loadbalanceId: 'loadbalance_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      loadbalanceId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllLoadbalanceMountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: MountComputer[];
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
      data: { 'type': 'array', 'itemType': MountComputer },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLoadbalanceMountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // app_ids
  appIds?: string[];
  // current_page
  currentPage?: number;
  // domains
  domains?: string[];
  // iaas_ids_exclude
  iaasIdsExclude?: string[];
  // initialized
  initialized?: boolean;
  // loadbalance_ids
  loadbalanceIds: string[];
  // mounted
  mounted?: boolean;
  // page_size
  pageSize?: number;
  // statuses
  statuses?: string[];
  // workspace
  workspace: string;
  // region_ids
  regionIds?: string[];
  // zone_ids
  zoneIds?: string[];
  // name
  name?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appIds: 'app_ids',
      currentPage: 'current_page',
      domains: 'domains',
      iaasIdsExclude: 'iaas_ids_exclude',
      initialized: 'initialized',
      loadbalanceIds: 'loadbalance_ids',
      mounted: 'mounted',
      pageSize: 'page_size',
      statuses: 'statuses',
      workspace: 'workspace',
      regionIds: 'region_ids',
      zoneIds: 'zone_ids',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appIds: { 'type': 'array', 'itemType': 'string' },
      currentPage: 'number',
      domains: { 'type': 'array', 'itemType': 'string' },
      iaasIdsExclude: { 'type': 'array', 'itemType': 'string' },
      initialized: 'boolean',
      loadbalanceIds: { 'type': 'array', 'itemType': 'string' },
      mounted: 'boolean',
      pageSize: 'number',
      statuses: { 'type': 'array', 'itemType': 'string' },
      workspace: 'string',
      regionIds: { 'type': 'array', 'itemType': 'string' },
      zoneIds: { 'type': 'array', 'itemType': 'string' },
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLoadbalanceMountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // current_page
  currentPage?: number;
  // data
  data?: MountComputer[];
  // page_size
  pageSize?: number;
  // total_count
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      currentPage: 'current_page',
      data: 'data',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      currentPage: 'number',
      data: { 'type': 'array', 'itemType': MountComputer },
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetLoadbalanceVcomputergroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // id
  id: string;
  // workspace
  workspace: string;
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

export class GetLoadbalanceVcomputergroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: VComputerGroup;
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
      data: VComputerGroup,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLoadbalanceVcomputergroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // load_balance_ids
  loadBalanceIds: string[];
  // name
  name?: string;
  // statuses
  statuses?: string[];
  // workspace
  workspace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      loadBalanceIds: 'load_balance_ids',
      name: 'name',
      statuses: 'statuses',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      loadBalanceIds: { 'type': 'array', 'itemType': 'string' },
      name: 'string',
      statuses: { 'type': 'array', 'itemType': 'string' },
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLoadbalanceVcomputergroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: VComputerGroup[];
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
      data: { 'type': 'array', 'itemType': VComputerGroup },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllLoadbalanceVcomputergroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace
  workspace: string;
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

export class AllLoadbalanceVcomputergroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: VComputerGroup[];
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
      data: { 'type': 'array', 'itemType': VComputerGroup },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLoadbalanceVcomputerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // computer_ids
  computerIds?: string[];
  // computer_ports
  computerPorts?: string[];
  // current_page
  currentPage?: number;
  // ips
  ips?: string[];
  // ip_ports
  ipPorts?: string[];
  // max_weight
  maxWeight?: number;
  // min_weight
  minWeight?: number;
  // page_size
  pageSize?: number;
  // ports
  ports?: string[];
  // v_computer_group_ids
  vComputerGroupIds?: string[];
  // workspace
  workspace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      computerIds: 'computer_ids',
      computerPorts: 'computer_ports',
      currentPage: 'current_page',
      ips: 'ips',
      ipPorts: 'ip_ports',
      maxWeight: 'max_weight',
      minWeight: 'min_weight',
      pageSize: 'page_size',
      ports: 'ports',
      vComputerGroupIds: 'v_computer_group_ids',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      computerIds: { 'type': 'array', 'itemType': 'string' },
      computerPorts: { 'type': 'array', 'itemType': 'string' },
      currentPage: 'number',
      ips: { 'type': 'array', 'itemType': 'string' },
      ipPorts: { 'type': 'array', 'itemType': 'string' },
      maxWeight: 'number',
      minWeight: 'number',
      pageSize: 'number',
      ports: { 'type': 'array', 'itemType': 'string' },
      vComputerGroupIds: { 'type': 'array', 'itemType': 'string' },
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLoadbalanceVcomputerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // v_computers
  data?: VComputer[];
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
      data: { 'type': 'array', 'itemType': VComputer },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLoadbalanceListenerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // backend_server_ports
  backendServerPorts?: number[];
  // certificate_iaas_ids
  certificateIaasIds?: string[];
  // certificate_ids
  certificateIds?: string[];
  // current_page
  currentPage?: number;
  // gm_crypto_cert_iaas_ids
  gmCryptoCertIaasIds?: string[];
  // gm_sign_cert_iaas_ids
  gmSignCertIaasIds?: string[];
  // listener_ports
  listenerPorts?: number[];
  // load_balancer_ids
  loadBalancerIds?: string[];
  // page_size
  pageSize?: number;
  // types
  types?: string[];
  // v_computer_group_ids
  vComputerGroupIds?: string[];
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      backendServerPorts: 'backend_server_ports',
      certificateIaasIds: 'certificate_iaas_ids',
      certificateIds: 'certificate_ids',
      currentPage: 'current_page',
      gmCryptoCertIaasIds: 'gm_crypto_cert_iaas_ids',
      gmSignCertIaasIds: 'gm_sign_cert_iaas_ids',
      listenerPorts: 'listener_ports',
      loadBalancerIds: 'load_balancer_ids',
      pageSize: 'page_size',
      types: 'types',
      vComputerGroupIds: 'v_computer_group_ids',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      backendServerPorts: { 'type': 'array', 'itemType': 'number' },
      certificateIaasIds: { 'type': 'array', 'itemType': 'string' },
      certificateIds: { 'type': 'array', 'itemType': 'string' },
      currentPage: 'number',
      gmCryptoCertIaasIds: { 'type': 'array', 'itemType': 'string' },
      gmSignCertIaasIds: { 'type': 'array', 'itemType': 'string' },
      listenerPorts: { 'type': 'array', 'itemType': 'number' },
      loadBalancerIds: { 'type': 'array', 'itemType': 'string' },
      pageSize: 'number',
      types: { 'type': 'array', 'itemType': 'string' },
      vComputerGroupIds: { 'type': 'array', 'itemType': 'string' },
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLoadbalanceListenerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // listeners
  data?: Listener[];
  // total_count
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': Listener },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllLoadbalanceListenerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // lb_id
  lbId: string;
  // workspace
  workspace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      lbId: 'lb_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      lbId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllLoadbalanceListenerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: Listener[];
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
      data: { 'type': 'array', 'itemType': Listener },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLoadbalanceSecurityipRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // listener_port
  listenerPort: number;
  // load_balancer_id
  loadBalancerId: string;
  // workspace
  workspace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      listenerPort: 'listener_port',
      loadBalancerId: 'load_balancer_id',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      listenerPort: 'number',
      loadBalancerId: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLoadbalanceSecurityipResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // security_ips
  data?: ListenerSecurityIp;
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
      data: ListenerSecurityIp,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDatabaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // id
  id: string;
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

export class GetDatabaseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: Database;
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
      data: Database,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllDatabaseMasterzoneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace
  workspace: string;
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

export class AllDatabaseMasterzoneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // master_zones
  masterZones?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      masterZones: 'master_zones',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      masterZones: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDatabaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // app_ids
  appIds?: string[];
  // app_service_ids
  appServiceIds?: string[];
  // connection_addresses
  connectionAddresses?: string[];
  // current_page
  currentPage?: number;
  // engines
  engines?: string[];
  // engine_versions
  engineVersions?: string[];
  // include_shared
  includeShared?: boolean;
  // master_ids
  masterIds?: string[];
  // max_cpu
  maxCpu?: number;
  // max_max_connections
  maxMaxConnections?: number;
  // max_max_iops
  maxMaxIops?: number;
  // max_memory
  maxMemory?: number;
  // max_port
  maxPort?: number;
  // max_storage
  maxStorage?: number;
  // min_cpu
  minCpu?: number;
  // min_max_connections
  minMaxConnections?: number;
  // min_max_iops
  minMaxIops?: number;
  // min_memory
  minMemory?: number;
  // min_port
  minPort?: number;
  // min_storage
  minStorage?: number;
  // name
  name?: string;
  // network_type
  networkType?: string;
  // net_type
  netType?: string;
  // page_size
  pageSize?: number;
  // spec_iaas_ids
  specIaasIds?: string[];
  // statuses
  statuses?: string[];
  // types
  types?: string[];
  // vpc_ids
  vpcIds?: string[];
  // v_switch_iaas_ids
  vSwitchIaasIds?: string[];
  // workspace_ids
  workspaceIds?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appIds: 'app_ids',
      appServiceIds: 'app_service_ids',
      connectionAddresses: 'connection_addresses',
      currentPage: 'current_page',
      engines: 'engines',
      engineVersions: 'engine_versions',
      includeShared: 'include_shared',
      masterIds: 'master_ids',
      maxCpu: 'max_cpu',
      maxMaxConnections: 'max_max_connections',
      maxMaxIops: 'max_max_iops',
      maxMemory: 'max_memory',
      maxPort: 'max_port',
      maxStorage: 'max_storage',
      minCpu: 'min_cpu',
      minMaxConnections: 'min_max_connections',
      minMaxIops: 'min_max_iops',
      minMemory: 'min_memory',
      minPort: 'min_port',
      minStorage: 'min_storage',
      name: 'name',
      networkType: 'network_type',
      netType: 'net_type',
      pageSize: 'page_size',
      specIaasIds: 'spec_iaas_ids',
      statuses: 'statuses',
      types: 'types',
      vpcIds: 'vpc_ids',
      vSwitchIaasIds: 'v_switch_iaas_ids',
      workspaceIds: 'workspace_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appIds: { 'type': 'array', 'itemType': 'string' },
      appServiceIds: { 'type': 'array', 'itemType': 'string' },
      connectionAddresses: { 'type': 'array', 'itemType': 'string' },
      currentPage: 'number',
      engines: { 'type': 'array', 'itemType': 'string' },
      engineVersions: { 'type': 'array', 'itemType': 'string' },
      includeShared: 'boolean',
      masterIds: { 'type': 'array', 'itemType': 'string' },
      maxCpu: 'number',
      maxMaxConnections: 'number',
      maxMaxIops: 'number',
      maxMemory: 'number',
      maxPort: 'number',
      maxStorage: 'number',
      minCpu: 'number',
      minMaxConnections: 'number',
      minMaxIops: 'number',
      minMemory: 'number',
      minPort: 'number',
      minStorage: 'number',
      name: 'string',
      networkType: 'string',
      netType: 'string',
      pageSize: 'number',
      specIaasIds: { 'type': 'array', 'itemType': 'string' },
      statuses: { 'type': 'array', 'itemType': 'string' },
      types: { 'type': 'array', 'itemType': 'string' },
      vpcIds: { 'type': 'array', 'itemType': 'string' },
      vSwitchIaasIds: { 'type': 'array', 'itemType': 'string' },
      workspaceIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDatabaseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: Database[];
  // total_count
  totalCount?: number;
  // current_page
  currentPage?: number;
  // page_size
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      totalCount: 'total_count',
      currentPage: 'current_page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': Database },
      totalCount: 'number',
      currentPage: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDatabaseSpecRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // current_page
  currentPage?: number;
  // custom_storage
  customStorage?: boolean;
  // engines
  engines?: string[];
  // engine_versions
  engineVersions?: string[];
  // iaas_ids
  iaasIds?: string[];
  // ids
  ids?: string[];
  // max_cpu
  maxCpu?: number;
  // max_max_connections
  maxMaxConnections?: number;
  // max_max_iops
  maxMaxIops?: number;
  // max_memory
  maxMemory?: number;
  // min_cpu
  minCpu?: number;
  // min_max_connections
  minMaxConnections?: number;
  // min_max_iops
  minMaxIops?: number;
  // min_memory
  minMemory?: number;
  // pageSize
  pageSize?: number;
  // types
  types?: string[];
  // provider_ids
  providerIds?: string[];
  // enable
  enable?: boolean;
  // iaas_types
  iaasTypes?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      currentPage: 'current_page',
      customStorage: 'custom_storage',
      engines: 'engines',
      engineVersions: 'engine_versions',
      iaasIds: 'iaas_ids',
      ids: 'ids',
      maxCpu: 'max_cpu',
      maxMaxConnections: 'max_max_connections',
      maxMaxIops: 'max_max_iops',
      maxMemory: 'max_memory',
      minCpu: 'min_cpu',
      minMaxConnections: 'min_max_connections',
      minMaxIops: 'min_max_iops',
      minMemory: 'min_memory',
      pageSize: 'page_size',
      types: 'types',
      providerIds: 'provider_ids',
      enable: 'enable',
      iaasTypes: 'iaas_types',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      currentPage: 'number',
      customStorage: 'boolean',
      engines: { 'type': 'array', 'itemType': 'string' },
      engineVersions: { 'type': 'array', 'itemType': 'string' },
      iaasIds: { 'type': 'array', 'itemType': 'string' },
      ids: { 'type': 'array', 'itemType': 'string' },
      maxCpu: 'number',
      maxMaxConnections: 'number',
      maxMaxIops: 'number',
      maxMemory: 'number',
      minCpu: 'number',
      minMaxConnections: 'number',
      minMaxIops: 'number',
      minMemory: 'number',
      pageSize: 'number',
      types: { 'type': 'array', 'itemType': 'string' },
      providerIds: { 'type': 'array', 'itemType': 'string' },
      enable: 'boolean',
      iaasTypes: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDatabaseSpecResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: DatabaseSpec[];
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
      data: { 'type': 'array', 'itemType': DatabaseSpec },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllDatabaseEngineRequest extends $tea.Model {
  // OAuth模式下的授权token
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

export class AllDatabaseEngineResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: DatabaseEngine[];
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
      data: { 'type': 'array', 'itemType': DatabaseEngine },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllDatabaseQuotaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace
  workspace: string;
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

export class AllDatabaseQuotaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // quotas
  quotas?: QuotaKv[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      quotas: 'quotas',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      quotas: { 'type': 'array', 'itemType': QuotaKv },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllDatabaseSecurityipRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 数据库id
  id: string;
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

export class AllDatabaseSecurityipResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // security_ips
  data?: DatabaseSecurityIp[];
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
      data: { 'type': 'array', 'itemType': DatabaseSecurityIp },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDatabaseSchemeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // char_sets
  charSets?: string[];
  // current_page
  currentPage?: number;
  // database_id
  databaseId: string;
  // iaas_ids
  iaasIds?: string[];
  // ids
  ids?: string[];
  // name
  name?: string;
  // page_size
  pageSize?: number;
  // statuses
  statuses?: string[];
  // workspace
  workspace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      charSets: 'char_sets',
      currentPage: 'current_page',
      databaseId: 'database_id',
      iaasIds: 'iaas_ids',
      ids: 'ids',
      name: 'name',
      pageSize: 'page_size',
      statuses: 'statuses',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      charSets: { 'type': 'array', 'itemType': 'string' },
      currentPage: 'number',
      databaseId: 'string',
      iaasIds: { 'type': 'array', 'itemType': 'string' },
      ids: { 'type': 'array', 'itemType': 'string' },
      name: 'string',
      pageSize: 'number',
      statuses: { 'type': 'array', 'itemType': 'string' },
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDatabaseSchemeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: DbSchema[];
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
      data: { 'type': 'array', 'itemType': DbSchema },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllDatabaseImportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace
  workspace: string;
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

export class AllDatabaseImportResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // imports
  imports?: DatabaseImportVO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      imports: 'imports',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      imports: { 'type': 'array', 'itemType': DatabaseImportVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryComputerAgentstatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // computer serial numbers
  sn: string[];
  // workspace name
  workspace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      sn: 'sn',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      sn: { 'type': 'array', 'itemType': 'string' },
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryComputerAgentstatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // staragent info
  data?: StarAgentInfo[];
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
      data: { 'type': 'array', 'itemType': StarAgentInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryComputerAgentsetupcommandRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // computer serial numbers
  sn: string[];
  // workspace name
  workspace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      sn: 'sn',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      sn: { 'type': 'array', 'itemType': 'string' },
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryComputerAgentsetupcommandResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // operation tasks
  results?: OperationTask[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      results: 'results',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      results: { 'type': 'array', 'itemType': OperationTask },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryComputerImportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace name
  workspace: string;
  // zone identity
  zone?: string;
  // page size
  pageSize: number;
  // current page
  currentPage: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspace: 'workspace',
      zone: 'zone',
      pageSize: 'page_size',
      currentPage: 'current_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspace: 'string',
      zone: 'string',
      pageSize: 'number',
      currentPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryComputerImportResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // computer import infos
  data?: ComputerImportVO[];
  // total count
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': ComputerImportVO },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListComputerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // appserviceIds
  appServiceIds?: string[];
  // current page
  currentPage?: number;
  // name
  name?: string;
  // current page
  pageSize?: number;
  // workspace name
  workspace: string;
  // CMP模式下使用的token，一般场景勿用
  cloudManageToken?: string;
  // vpc_iaas_id
  vpcIaasId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appServiceIds: 'app_service_ids',
      currentPage: 'current_page',
      name: 'name',
      pageSize: 'page_size',
      workspace: 'workspace',
      cloudManageToken: 'cloud_manage_token',
      vpcIaasId: 'vpc_iaas_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appServiceIds: { 'type': 'array', 'itemType': 'string' },
      currentPage: 'number',
      name: 'string',
      pageSize: 'number',
      workspace: 'string',
      cloudManageToken: 'string',
      vpcIaasId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListComputerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // computer infos
  data?: Computer[];
  // total count
  totalCount?: number;
  // page size
  pageSize?: number;
  // current page
  currentPage?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      totalCount: 'total_count',
      pageSize: 'page_size',
      currentPage: 'current_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': Computer },
      totalCount: 'number',
      pageSize: 'number',
      currentPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryComputerSpecRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // prviderIds
  providerIds: string[];
  // zoneIds
  zoneIds: string[];
  // workspace name
  workspace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      providerIds: 'provider_ids',
      zoneIds: 'zone_ids',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      providerIds: { 'type': 'array', 'itemType': 'string' },
      zoneIds: { 'type': 'array', 'itemType': 'string' },
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryComputerSpecResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // computer spec list
  data?: ComputerSpec[];
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
      data: { 'type': 'array', 'itemType': ComputerSpec },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryComputerCommonimageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // providerIds
  providerIds: string[];
  // regionIds
  regionIds: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      providerIds: 'provider_ids',
      regionIds: 'region_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      providerIds: { 'type': 'array', 'itemType': 'string' },
      regionIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryComputerCommonimageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // common images
  data?: CommonImage[];
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
      data: { 'type': 'array', 'itemType': CommonImage },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllLoadbalanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace_ids
  workspaceIds: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceIds: 'workspace_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllLoadbalanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: LoadBalancer[];
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
      data: { 'type': 'array', 'itemType': LoadBalancer },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLoadbalanceImportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // current_page
  currentPage?: number;
  // page_size
  pageSize?: number;
  // workspace
  workspace?: string;
  // zone_id
  zoneId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      currentPage: 'current_page',
      pageSize: 'page_size',
      workspace: 'workspace',
      zoneId: 'zone_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      currentPage: 'number',
      pageSize: 'number',
      workspace: 'string',
      zoneId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLoadbalanceImportResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: LoadBalancerImportVO[];
  // total_count
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': LoadBalancerImportVO },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDatabaseImportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // current_page
  currentPage?: number;
  // iaas_type
  iaasType: string;
  // page_size
  pageSize?: number;
  // workspace
  workspace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      currentPage: 'current_page',
      iaasType: 'iaas_type',
      pageSize: 'page_size',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      currentPage: 'number',
      iaasType: 'string',
      pageSize: 'number',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDatabaseImportResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: DatabaseImportVO[];
  // total_count
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': DatabaseImportVO },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDatabaseMasterzoneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace
  workspace: string;
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

export class QueryDatabaseMasterzoneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: string[];
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
      data: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDatabaseQuotaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace
  workspace: string;
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

export class QueryDatabaseQuotaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: QuotaKv[];
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
      data: { 'type': 'array', 'itemType': QuotaKv },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDatabaseSecurityipRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // id
  id: string;
  // workspace
  workspace: string;
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

export class QueryDatabaseSecurityipResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: DatabaseSecurityIp[];
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
      data: { 'type': 'array', 'itemType': DatabaseSecurityIp },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDatabaseSchemaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // char_sets
  charSets?: string[];
  // current_page
  currentPage?: number;
  // database_id
  databaseId: string;
  // iaas_ids
  iaasIds?: string[];
  // ids
  ids?: string[];
  // name
  name?: string;
  // page_size
  pageSize?: number;
  // statuses
  statuses?: string[];
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      charSets: 'char_sets',
      currentPage: 'current_page',
      databaseId: 'database_id',
      iaasIds: 'iaas_ids',
      ids: 'ids',
      name: 'name',
      pageSize: 'page_size',
      statuses: 'statuses',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      charSets: { 'type': 'array', 'itemType': 'string' },
      currentPage: 'number',
      databaseId: 'string',
      iaasIds: { 'type': 'array', 'itemType': 'string' },
      ids: { 'type': 'array', 'itemType': 'string' },
      name: 'string',
      pageSize: 'number',
      statuses: { 'type': 'array', 'itemType': 'string' },
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDatabaseSchemaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: DbSchema[];
  // total_count
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': DbSchema },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDatabaseAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // current_page
  currentPage?: number;
  // database_id
  databaseId: string;
  // page_size
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      currentPage: 'current_page',
      databaseId: 'database_id',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      currentPage: 'number',
      databaseId: 'string',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDatabaseAccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: DatabaseAccount[];
  // total_count
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': DatabaseAccount },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetWorkspaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // id
  id: string;
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

export class GetWorkspaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // workspaceDto
  data?: WorkspaceDto;
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
      data: WorkspaceDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRegionRequest extends $tea.Model {
  // OAuth模式下的授权token
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
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // list
  data?: RegionDto[];
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
      data: { 'type': 'array', 'itemType': RegionDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRegionAccessibleRequest extends $tea.Model {
  // OAuth模式下的授权token
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

export class ListRegionAccessibleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: RegionDto[];
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
      data: { 'type': 'array', 'itemType': RegionDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDatabaseInfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // name
  name?: string;
  // description
  description?: string;
  // id
  id: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      description: 'description',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      description: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDatabaseInfoResponse extends $tea.Model {
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

export class SetDatabaseAssignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // app_service_ids
  appServiceIds?: string[];
  // app_ids
  appIds?: string[];
  // workspace
  workspace?: string;
  // ids
  ids?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appServiceIds: 'app_service_ids',
      appIds: 'app_ids',
      workspace: 'workspace',
      ids: 'ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appServiceIds: { 'type': 'array', 'itemType': 'string' },
      appIds: { 'type': 'array', 'itemType': 'string' },
      workspace: 'string',
      ids: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetDatabaseAssignResponse extends $tea.Model {
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

export class SetDatabaseShareRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace_ids
  workspaceIds: string[];
  // ids
  ids: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceIds: 'workspace_ids',
      ids: 'ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceIds: { 'type': 'array', 'itemType': 'string' },
      ids: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetDatabaseShareResponse extends $tea.Model {
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

export class RebootDatabaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // id
  id: string;
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

export class RebootDatabaseResponse extends $tea.Model {
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

export class UpdateDatabaseAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // description
  description?: string;
  // id
  id: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      description: 'description',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      description: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDatabaseAccountResponse extends $tea.Model {
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

export class SetDatabaseAccountpasswordRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // id
  id: string;
  // password
  password: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      password: 'password',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      password: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetDatabaseAccountpasswordResponse extends $tea.Model {
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

export class AuthDatabaseAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // schema_id
  schemaId: string;
  // privilege
  privilege: string;
  // id
  id: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      schemaId: 'schema_id',
      privilege: 'privilege',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      schemaId: 'string',
      privilege: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthDatabaseAccountResponse extends $tea.Model {
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

export class GetRegionTenantRequest extends $tea.Model {
  // OAuth模式下的授权token
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

export class GetRegionTenantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // regionDto
  data?: RegionDto;
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
      data: RegionDto,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRegionAliasbyidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // region_id
  regionId: string;
  // providerId
  providerId: string;
  // iaasConnType
  iaasConnType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      regionId: 'region_id',
      providerId: 'provider_id',
      iaasConnType: 'iaas_conn_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      regionId: 'string',
      providerId: 'string',
      iaasConnType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRegionAliasbyidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // region alias
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

export class QueryDiskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // current page
  currentPage?: number;
  // page size
  pageSize?: number;
  // workspace name
  workspace: string;
  // statuses
  statuses?: string[];
  // type
  type?: string;
  // computer_ids
  computerIds?: string[];
  // devices
  devices?: string[];
  // max_size
  maxSize?: number;
  // min_size
  minSize?: number;
  // workspace_ids
  workspaceIds?: string[];
  // name
  name?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      currentPage: 'current_page',
      pageSize: 'page_size',
      workspace: 'workspace',
      statuses: 'statuses',
      type: 'type',
      computerIds: 'computer_ids',
      devices: 'devices',
      maxSize: 'max_size',
      minSize: 'min_size',
      workspaceIds: 'workspace_ids',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      currentPage: 'number',
      pageSize: 'number',
      workspace: 'string',
      statuses: { 'type': 'array', 'itemType': 'string' },
      type: 'string',
      computerIds: { 'type': 'array', 'itemType': 'string' },
      devices: { 'type': 'array', 'itemType': 'string' },
      maxSize: 'number',
      minSize: 'number',
      workspaceIds: { 'type': 'array', 'itemType': 'string' },
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDiskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // disk detail infos
  data?: Disk[];
  // total count
  totalCount?: number;
  // page size
  pageSize?: number;
  // current page
  currentPage?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      totalCount: 'total_count',
      pageSize: 'page_size',
      currentPage: 'current_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': Disk },
      totalCount: 'number',
      pageSize: 'number',
      currentPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryImageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // current page
  currentPage?: number;
  // page size
  pageSize?: number;
  // workspace name
  workspace: string;
  // status
  statuses?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      currentPage: 'current_page',
      pageSize: 'page_size',
      workspace: 'workspace',
      statuses: 'statuses',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      currentPage: 'number',
      pageSize: 'number',
      workspace: 'string',
      statuses: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryImageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // image infos
  data?: CommonImage[];
  // total count
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': CommonImage },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDatabaseSchemaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // char_set
  charSet: string;
  // description
  description?: string;
  // grant_map
  grantMap?: MapStringToStringEntity[];
  // 数据库id
  id: string;
  // name
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      charSet: 'char_set',
      description: 'description',
      grantMap: 'grant_map',
      id: 'id',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      charSet: 'string',
      description: 'string',
      grantMap: { 'type': 'array', 'itemType': MapStringToStringEntity },
      id: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDatabaseSchemaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回的schemaid
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

export class CreateLoadbalanceMountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // mount_map
  mountMap: MapStringToIntegerEntity[];
  // domain
  domain?: string;
  // id
  id: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      mountMap: 'mount_map',
      domain: 'domain',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      mountMap: { 'type': 'array', 'itemType': MapStringToIntegerEntity },
      domain: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLoadbalanceMountResponse extends $tea.Model {
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

export class CreateLoadbalanceListenerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // backend_server_port
  backendServerPort?: number;
  // bandwidth
  bandwidth?: number;
  // certificate_iaas_id
  certificateIaasId?: string;
  // certificate_id
  certificateId?: string;
  // cookie
  cookie?: string;
  // cookie_timeout
  cookieTimeout?: number;
  // established_timeout
  establishedTimeout?: number;
  // gm_crypto_cert_iaas_id
  gmCryptoCertIaasId?: string;
  // gm_sign_cert_iaas_id
  gmSignCertIaasId?: string;
  // health_monitor
  healthMonitor?: ListenerHealthMonitor;
  // lb id
  id: string;
  // listener_port
  listenerPort: number;
  // persist_timeout
  persistTimeout?: number;
  // scheduler
  scheduler?: string;
  // sticky_session_type
  stickySessionType?: string;
  // tls_cipher_policy
  tlsCipherPolicy?: string;
  // type
  type?: string;
  // v_computer_group_id
  vComputerGroupId?: string;
  // x_forwarded_for
  xForwardedFor?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      backendServerPort: 'backend_server_port',
      bandwidth: 'bandwidth',
      certificateIaasId: 'certificate_iaas_id',
      certificateId: 'certificate_id',
      cookie: 'cookie',
      cookieTimeout: 'cookie_timeout',
      establishedTimeout: 'established_timeout',
      gmCryptoCertIaasId: 'gm_crypto_cert_iaas_id',
      gmSignCertIaasId: 'gm_sign_cert_iaas_id',
      healthMonitor: 'health_monitor',
      id: 'id',
      listenerPort: 'listener_port',
      persistTimeout: 'persist_timeout',
      scheduler: 'scheduler',
      stickySessionType: 'sticky_session_type',
      tlsCipherPolicy: 'tls_cipher_policy',
      type: 'type',
      vComputerGroupId: 'v_computer_group_id',
      xForwardedFor: 'x_forwarded_for',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      backendServerPort: 'number',
      bandwidth: 'number',
      certificateIaasId: 'string',
      certificateId: 'string',
      cookie: 'string',
      cookieTimeout: 'number',
      establishedTimeout: 'number',
      gmCryptoCertIaasId: 'string',
      gmSignCertIaasId: 'string',
      healthMonitor: ListenerHealthMonitor,
      id: 'string',
      listenerPort: 'number',
      persistTimeout: 'number',
      scheduler: 'string',
      stickySessionType: 'string',
      tlsCipherPolicy: 'string',
      type: 'string',
      vComputerGroupId: 'string',
      xForwardedFor: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLoadbalanceListenerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class StopLoadbalanceListenerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // load_balancer_id
  loadBalancerId: string;
  // listener_port
  listenerPort: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      loadBalancerId: 'load_balancer_id',
      listenerPort: 'listener_port',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      loadBalancerId: 'string',
      listenerPort: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StopLoadbalanceListenerResponse extends $tea.Model {
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

export class StartLoadbalanceListenerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // load_balancer_id
  loadBalancerId: string;
  // listener_port
  listenerPort: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      loadBalancerId: 'load_balancer_id',
      listenerPort: 'listener_port',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      loadBalancerId: 'string',
      listenerPort: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartLoadbalanceListenerResponse extends $tea.Model {
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

export class UpdateLoadbalanceListenerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // bandwidth
  bandwidth?: number;
  // certificate_iaas_id
  certificateIaasId?: string;
  // certificate_id
  certificateId?: string;
  // cookie
  cookie?: string;
  // cookie_timeout
  cookieTimeout?: number;
  // established_timeout
  establishedTimeout?: number;
  // gm_crypto_cert_iaas_id
  gmCryptoCertIaasId?: string;
  // gm_sign_cert_iaas_id
  gmSignCertIaasId?: string;
  // health_monitor
  healthMonitor?: ListenerHealthMonitor;
  // listener_port
  listenerPort: number;
  // load_balancer_id
  loadBalancerId: string;
  // persist_timeout
  persistTimeout?: number;
  // scheduler
  scheduler?: string;
  // sticky_session_type
  stickySessionType?: string;
  // tls_cipher_policy
  tlsCipherPolicy?: string;
  // use_v_computer_group
  useVComputerGroup?: boolean;
  // v_computer_group_id
  vComputerGroupId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      bandwidth: 'bandwidth',
      certificateIaasId: 'certificate_iaas_id',
      certificateId: 'certificate_id',
      cookie: 'cookie',
      cookieTimeout: 'cookie_timeout',
      establishedTimeout: 'established_timeout',
      gmCryptoCertIaasId: 'gm_crypto_cert_iaas_id',
      gmSignCertIaasId: 'gm_sign_cert_iaas_id',
      healthMonitor: 'health_monitor',
      listenerPort: 'listener_port',
      loadBalancerId: 'load_balancer_id',
      persistTimeout: 'persist_timeout',
      scheduler: 'scheduler',
      stickySessionType: 'sticky_session_type',
      tlsCipherPolicy: 'tls_cipher_policy',
      useVComputerGroup: 'use_v_computer_group',
      vComputerGroupId: 'v_computer_group_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      bandwidth: 'number',
      certificateIaasId: 'string',
      certificateId: 'string',
      cookie: 'string',
      cookieTimeout: 'number',
      establishedTimeout: 'number',
      gmCryptoCertIaasId: 'string',
      gmSignCertIaasId: 'string',
      healthMonitor: ListenerHealthMonitor,
      listenerPort: 'number',
      loadBalancerId: 'string',
      persistTimeout: 'number',
      scheduler: 'string',
      stickySessionType: 'string',
      tlsCipherPolicy: 'string',
      useVComputerGroup: 'boolean',
      vComputerGroupId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateLoadbalanceListenerResponse extends $tea.Model {
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

export class QueryDiskspecRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // provider id
  providerId?: string;
  // enable
  enable?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      providerId: 'provider_id',
      enable: 'enable',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      providerId: 'string',
      enable: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDiskspecResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // disk spec infos
  data?: DiskSpec[];
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
      data: { 'type': 'array', 'itemType': DiskSpec },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryComputerquotaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace name
  workspace: string;
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

export class QueryComputerquotaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // computer quota info jsonstring
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

export class StopComputerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // computer ids
  ids: string[];
  // 后续版本必填
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      ids: 'ids',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      ids: { 'type': 'array', 'itemType': 'string' },
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StopComputerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // paas_request_id
  paasRequestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      paasRequestId: 'paas_request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      paasRequestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RebootComputerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // ids
  ids: string[];
  // 后续必填
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      ids: 'ids',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      ids: { 'type': 'array', 'itemType': 'string' },
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RebootComputerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // paas_request_id
  paasRequestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      paasRequestId: 'paas_request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      paasRequestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryComputerSecuritygroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // computer id
  id: string;
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

export class QueryComputerSecuritygroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // security group info
  data?: JoinedSecurityGroupVO[];
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
      data: { 'type': 'array', 'itemType': JoinedSecurityGroupVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySecuritygroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace name
  workspace: string;
  // current page
  currentPage?: number;
  // page size
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspace: 'workspace',
      currentPage: 'current_page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspace: 'string',
      currentPage: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySecuritygroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // currentPage
  currentPage?: number;
  // pageSize
  pageSize?: number;
  // totalCount
  totalCount?: number;
  // security group infos
  data?: SecurityGroupVO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalCount: 'total_count',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      currentPage: 'number',
      pageSize: 'number',
      totalCount: 'number',
      data: { 'type': 'array', 'itemType': SecurityGroupVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSecuritygroupPermissionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // PermissionVO
  permission: PermissionVO;
  // securityGroupId
  securityGroupId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      permission: 'permission',
      securityGroupId: 'security_group_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      permission: PermissionVO,
      securityGroupId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSecuritygroupPermissionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class QuerySecuritygroupPermissionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // securityGroupId
  securityGroupId: string;
  // autoRefresh
  autoRefresh?: boolean;
  // nicType
  nicType?: string;
  // direction
  direction?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      securityGroupId: 'security_group_id',
      autoRefresh: 'auto_refresh',
      nicType: 'nic_type',
      direction: 'direction',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      securityGroupId: 'string',
      autoRefresh: 'boolean',
      nicType: 'string',
      direction: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySecuritygroupPermissionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // securitygroup permission infos
  data?: PermissionVO[];
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
      data: { 'type': 'array', 'itemType': PermissionVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateLoadbalanaceSecurityipRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // lb id
  id: string;
  // listener_port
  listenerPort: number;
  // access_control
  accessControl: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      listenerPort: 'listener_port',
      accessControl: 'access_control',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      listenerPort: 'number',
      accessControl: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateLoadbalanaceSecurityipResponse extends $tea.Model {
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

export class CreateLoadbalanceSecurityipRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // lb id
  id: string;
  // listener_port
  listenerPort: number;
  // ips
  ips: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      listenerPort: 'listener_port',
      ips: 'ips',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      listenerPort: 'number',
      ips: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLoadbalanceSecurityipResponse extends $tea.Model {
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

export class UpdateDatabaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // id
  id: string;
  // name
  name?: string;
  // description
  description?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      name: 'name',
      description: 'description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      name: 'string',
      description: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDatabaseResponse extends $tea.Model {
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

export class UpdateLoadbalanceMountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // id
  id: string;
  // mountMap
  mountMap?: MapStringToIntegerEntity[];
  // domain
  domain?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      mountMap: 'mount_map',
      domain: 'domain',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      mountMap: { 'type': 'array', 'itemType': MapStringToIntegerEntity },
      domain: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateLoadbalanceMountResponse extends $tea.Model {
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

export class DeleteLoadbalanceMountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // id
  id: string;
  // computer_ids
  computerIds: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      computerIds: 'computer_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      computerIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteLoadbalanceMountResponse extends $tea.Model {
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

export class QueryRequestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // current_page
  currentPage?: number;
  // ids
  ids?: string[];
  // max_time
  maxTime?: string;
  // min_time
  minTime?: string;
  // operators
  operators?: string[];
  // operator_type
  operatorType?: string;
  // page_size
  pageSize?: number;
  // parent_ids
  parentIds?: string[];
  // resource_ids
  resourceIds?: string[];
  // resource_types
  resourceTypes?: string[];
  // statuses
  statuses?: string[];
  // task_statuses
  taskStatuses?: string[];
  // tokens
  tokens?: string[];
  // types
  types?: string[];
  // workspace_ids
  workspaceIds?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      currentPage: 'current_page',
      ids: 'ids',
      maxTime: 'max_time',
      minTime: 'min_time',
      operators: 'operators',
      operatorType: 'operator_type',
      pageSize: 'page_size',
      parentIds: 'parent_ids',
      resourceIds: 'resource_ids',
      resourceTypes: 'resource_types',
      statuses: 'statuses',
      taskStatuses: 'task_statuses',
      tokens: 'tokens',
      types: 'types',
      workspaceIds: 'workspace_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      currentPage: 'number',
      ids: { 'type': 'array', 'itemType': 'string' },
      maxTime: 'string',
      minTime: 'string',
      operators: { 'type': 'array', 'itemType': 'string' },
      operatorType: 'string',
      pageSize: 'number',
      parentIds: { 'type': 'array', 'itemType': 'string' },
      resourceIds: { 'type': 'array', 'itemType': 'string' },
      resourceTypes: { 'type': 'array', 'itemType': 'string' },
      statuses: { 'type': 'array', 'itemType': 'string' },
      taskStatuses: { 'type': 'array', 'itemType': 'string' },
      tokens: { 'type': 'array', 'itemType': 'string' },
      types: { 'type': 'array', 'itemType': 'string' },
      workspaceIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRequestResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: RequestVO[];
  // total_count
  totalCount?: number;
  // current_page
  currentPage?: number;
  // page_size
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      totalCount: 'total_count',
      currentPage: 'current_page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': RequestVO },
      totalCount: 'number',
      currentPage: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRequestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace
  workspace: string;
  // id
  id: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspace: 'workspace',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspace: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRequestResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: RequestVO;
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
      data: RequestVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRequestTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // current_page
  currentPage?: number;
  // ids
  ids?: string[];
  // max_time
  maxTime?: string;
  // min_time
  minTime?: string;
  // operators
  operators?: string[];
  // operatorType
  operatorType?: string;
  // page_size
  pageSize?: number;
  // requestIds
  requestIds?: string[];
  // request_statuses
  requestStatuses?: string[];
  // request_types
  requestTypes?: string[];
  // resource_ids
  resourceIds?: string[];
  // resource_types
  resourceTypes?: string[];
  // statuses
  statuses?: string[];
  // workspace_ids
  workspaceIds?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      currentPage: 'current_page',
      ids: 'ids',
      maxTime: 'max_time',
      minTime: 'min_time',
      operators: 'operators',
      operatorType: 'operator_type',
      pageSize: 'page_size',
      requestIds: 'request_ids',
      requestStatuses: 'request_statuses',
      requestTypes: 'request_types',
      resourceIds: 'resource_ids',
      resourceTypes: 'resource_types',
      statuses: 'statuses',
      workspaceIds: 'workspace_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      currentPage: 'number',
      ids: { 'type': 'array', 'itemType': 'string' },
      maxTime: 'string',
      minTime: 'string',
      operators: { 'type': 'array', 'itemType': 'string' },
      operatorType: 'string',
      pageSize: 'number',
      requestIds: { 'type': 'array', 'itemType': 'string' },
      requestStatuses: { 'type': 'array', 'itemType': 'string' },
      requestTypes: { 'type': 'array', 'itemType': 'string' },
      resourceIds: { 'type': 'array', 'itemType': 'string' },
      resourceTypes: { 'type': 'array', 'itemType': 'string' },
      statuses: { 'type': 'array', 'itemType': 'string' },
      workspaceIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRequestTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: Task[];
  // total_count
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': Task },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTaskLogRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // execution_times
  executionTimes?: number;
  // task_id
  taskId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      executionTimes: 'execution_times',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      executionTimes: 'number',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTaskLogResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ResourceLog[];
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
      data: { 'type': 'array', 'itemType': ResourceLog },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListTenantworkspaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // status
  status?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListTenantworkspaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // worksapce列表
  data?: TenantWorkspace[];
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
      data: { 'type': 'array', 'itemType': TenantWorkspace },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTenantworkspaceFilterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // statuses
  statuses?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      statuses: 'statuses',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      statuses: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTenantworkspaceFilterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // workspaces
  data?: TenantWorkspace[];
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
      data: { 'type': 'array', 'itemType': TenantWorkspace },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRegionGroupbyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // status
  status?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRegionGroupbyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // RegionWorkspaceVO
  data?: RegionWorkspaceVO[];
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
      data: { 'type': 'array', 'itemType': RegionWorkspaceVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRequestFinaltaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // request_id
  id: string;
  // workspace_id
  workspaceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRequestFinaltaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: TaskVO[];
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
      data: { 'type': 'array', 'itemType': TaskVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFeatureRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // region_id
  regionId: string;
  // project_id
  projectId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      regionId: 'region_id',
      projectId: 'project_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      regionId: 'string',
      projectId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFeatureResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class StartComputerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // computer ids
  ids: string[];
  // workspace_id，后续版本会变成必填
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      ids: 'ids',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      ids: { 'type': 'array', 'itemType': 'string' },
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartComputerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // paas_request_id
  paasRequestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      paasRequestId: 'paas_request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      paasRequestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartLoadbalanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // ids
  ids: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      ids: 'ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      ids: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartLoadbalanceResponse extends $tea.Model {
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

export class StopLoadbalanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // ids
  ids: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      ids: 'ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      ids: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StopLoadbalanceResponse extends $tea.Model {
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

export class UpdateLoadbalanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // id
  id: string;
  // name
  name: string;
  // description
  description: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      name: 'name',
      description: 'description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      name: 'string',
      description: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateLoadbalanceResponse extends $tea.Model {
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

export class AddLoadbalanceAssignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // app_id
  appId?: string;
  // appServiceId
  appServiceId?: string;
  // ids
  ids: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appId: 'app_id',
      appServiceId: 'app_service_id',
      ids: 'ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appId: 'string',
      appServiceId: 'string',
      ids: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddLoadbalanceAssignResponse extends $tea.Model {
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

export class QueryCertificateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace_id
  workspaceId: string;
  // zone_id
  zoneId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceId: 'workspace_id',
      zoneId: 'zone_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceId: 'string',
      zoneId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCertificateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: BasicCertificate[];
  // total_count
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': BasicCertificate },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCertificateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace_id
  workspaceId: string;
  // zoneId
  zoneId?: string;
  // name
  name: string;
  // paas_region_id
  paasRegionId: string;
  // certificate
  certificate: string;
  // privateKey
  privateKey: string;
  // cert_type
  certType?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceId: 'workspace_id',
      zoneId: 'zone_id',
      name: 'name',
      paasRegionId: 'paas_region_id',
      certificate: 'certificate',
      privateKey: 'private_key',
      certType: 'cert_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceId: 'string',
      zoneId: 'string',
      name: 'string',
      paasRegionId: 'string',
      certificate: 'string',
      privateKey: 'string',
      certType: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCertificateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class DeleteCertificateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // id
  id: string;
  // workspace_id
  workspaceId: string;
  // zone_id
  zoneId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspaceId: 'workspace_id',
      zoneId: 'zone_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspaceId: 'string',
      zoneId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteCertificateResponse extends $tea.Model {
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

export class DescribeUnifiedresourceVpcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 提供商类型
  providerType: string;
  // region
  region: string;
  // 工作空间
  workspace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      providerType: 'provider_type',
      region: 'region',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      providerType: 'string',
      region: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeUnifiedresourceVpcResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // vpc对象
  vpc?: VPC;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      vpc: 'vpc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      vpc: VPC,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListUnifiedresourceInstancefamiliesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // region id
  regionId: string;
  // 提供商类型
  providerType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      regionId: 'region_id',
      providerType: 'provider_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      regionId: 'string',
      providerType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListUnifiedresourceInstancefamiliesResponse extends $tea.Model {
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

export class ListUnifiedresourceInstancetypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // region name
  region: string;
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

export class ListUnifiedresourceInstancetypeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // instancetype详细信息，jsonstring
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

export class QueryComputerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // computer id
  id: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryComputerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // computer info
  data?: Computer;
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
      data: Computer,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListResourceComputertypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // region name
  region: string;
  // zone name
  zone?: string;
  // 实例规格族
  instanceTypeFamily: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      region: 'region',
      zone: 'zone',
      instanceTypeFamily: 'instance_type_family',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      region: 'string',
      zone: 'string',
      instanceTypeFamily: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListResourceComputertypeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 可用computer type列表
  data?: ComputerType[];
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
      data: { 'type': 'array', 'itemType': ComputerType },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListResourceDiskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 要查询的云盘或本地盘类型。取值范围：
  // 
  // all：同时查询系统盘与数据盘
  // system：只查询系统盘
  // data：只查询数据盘
  // 默认值：all。
  diskType?: string;
  // 实例规格
  instanceType: string;
  // region name
  region: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      diskType: 'disk_type',
      instanceType: 'instance_type',
      region: 'region',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      diskType: 'string',
      instanceType: 'string',
      region: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListResourceDiskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // disk infos
  data?: Disk[];
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
      data: { 'type': 'array', 'itemType': Disk },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListResourceComputertypefamilyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // region name
  region: string;
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

export class ListResourceComputertypefamilyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // computer 规格族
  data?: ComputerTypeFamily[];
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
      data: { 'type': 'array', 'itemType': ComputerTypeFamily },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListUnifiedresourceVswitchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // region name
  region: string;
  // 要查询的交换机所属VPC的ID
  vpcId?: string;
  // 要查询的交换机的ID
  vSwitchId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      region: 'region',
      vpcId: 'vpc_id',
      vSwitchId: 'v_switch_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      region: 'string',
      vpcId: 'string',
      vSwitchId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListUnifiedresourceVswitchResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交换机的详细信息
  data?: VSwitch[];
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
      data: { 'type': 'array', 'itemType': VSwitch },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListUnifiedresourceVpcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // region name
  region: string;
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

export class ListUnifiedresourceVpcResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // vpc list
  data?: VPC[];
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
      data: { 'type': 'array', 'itemType': VPC },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportResourceVpcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // region identity
  region: string;
  // vpc iaas id
  vpcId: string;
  // workspace identity
  workspace: string;
  // vrouter id
  vrouterId: string;
  // vpc name
  vpcName: string;
  // cidr block
  cidrBlock: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      region: 'region',
      vpcId: 'vpc_id',
      workspace: 'workspace',
      vrouterId: 'vrouter_id',
      vpcName: 'vpc_name',
      cidrBlock: 'cidr_block',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      region: 'string',
      vpcId: 'string',
      workspace: 'string',
      vrouterId: 'string',
      vpcName: 'string',
      cidrBlock: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportResourceVpcResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // vpc关联到workspace是否成功
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

export class DeleteResourceRuleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 传输层协议。参数值大小写敏感。取值范围：
  // 
  // icmp
  // gre
  // tcp
  // udp
  // all：支持所有协议
  ipProtocol: string;
  // 目的端安全组开放的传输层协议相关的端口范围。取值范围：
  // 
  // TCP/UDP协议：取值范围为1~65535。使用斜线（/）隔开起始端口和终止端口。例如：1/200
  // ICMP协议：-1/-1
  // GRE协议：-1/-1
  // all：-1/-1
  portRange: string;
  // CN-HANGZHOU_FINANCE
  region: string;
  // 枚举值：
  // ingress：入口规则
  // egress：出口规则
  ruleType: string;
  // 目的端安全组ID。
  securityGroupId: string;
  // 源端IP地址范围。支持CIDR格式和IPv4格式的IP地址范围。默认值：0.0.0.0/0
  sourceCidrIp?: string;
  // 目的端IP地址范围。支持CIDR格式和IPv4格式的IP地址范围。默认值：0.0.0.0/0
  destCidrIp?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      ipProtocol: 'ip_protocol',
      portRange: 'port_range',
      region: 'region',
      ruleType: 'rule_type',
      securityGroupId: 'security_group_id',
      sourceCidrIp: 'source_cidr_ip',
      destCidrIp: 'dest_cidr_ip',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      ipProtocol: 'string',
      portRange: 'string',
      region: 'string',
      ruleType: 'string',
      securityGroupId: 'string',
      sourceCidrIp: 'string',
      destCidrIp: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteResourceRuleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作是否成功
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

export class ListRouteEntryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 所属地域
  region: string;
  // 要查询的路由条目所属路由表的所属路由器的ID。
  routerId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      region: 'region',
      routerId: 'router_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      region: 'string',
      routerId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRouteEntryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 路由条目信息
  data?: VRouteEntry[];
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
      data: { 'type': 'array', 'itemType': VRouteEntry },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAvailableDiskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // region name
  region: string;
  // 磁盘类型：
  // SystemDisk;
  // DataDisk
  diskType: string;
  // 实例规格
  instanceType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      region: 'region',
      diskType: 'disk_type',
      instanceType: 'instance_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      region: 'string',
      diskType: 'string',
      instanceType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAvailableDiskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 磁盘类型详细信息，jsonstring
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

export class ListAvailableInstancetypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // region name
  region: string;
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

export class ListAvailableInstancetypeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 实例类型详细信息，jsonstring
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

export class QueryResourcemetaNodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace name
  workspace: string;
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

export class QueryResourcemetaNodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // node meta list jsonstring
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

export class QueryResourcemetaAppserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace name
  workspace: string;
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

export class QueryResourcemetaAppserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // app service metadata json
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

export class SyncComputerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 工作空间
  workspaceId: string;
  // computer_id
  computerId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceId: 'workspace_id',
      computerId: 'computer_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceId: 'string',
      computerId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncComputerResponse extends $tea.Model {
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

export class SyncLoadbalanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // workspace_id
  workspaceId: string;
  // lb_id
  lbId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      workspaceId: 'workspace_id',
      lbId: 'lb_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      workspaceId: 'string',
      lbId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncLoadbalanceResponse extends $tea.Model {
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

export class UpdateComputerInfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // name
  name: string;
  // description
  description?: string;
  // workspace_id
  workspaceId: string;
  // computer_id
  computerId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      description: 'description',
      workspaceId: 'workspace_id',
      computerId: 'computer_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      description: 'string',
      workspaceId: 'string',
      computerId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateComputerInfoResponse extends $tea.Model {
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

export class SetComputerAssignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // app_id
  appId?: string;
  // 应用服务实例
  appServiceId: string;
  // computer_ids
  computerIds: string[];
  // workspace_id
  workspaceId: string;
  // cell信息
  cell?: MapStringToStringEntity[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      appId: 'app_id',
      appServiceId: 'app_service_id',
      computerIds: 'computer_ids',
      workspaceId: 'workspace_id',
      cell: 'cell',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      appId: 'string',
      appServiceId: 'string',
      computerIds: { 'type': 'array', 'itemType': 'string' },
      workspaceId: 'string',
      cell: { 'type': 'array', 'itemType': MapStringToStringEntity },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetComputerAssignResponse extends $tea.Model {
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

export class ExecRequestTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // rmc_request_id，注意区分OPENAPI自身的request_id
  rmcRequestId: string;
  // task_ids
  taskIds: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      rmcRequestId: 'rmc_request_id',
      taskIds: 'task_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      rmcRequestId: 'string',
      taskIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecRequestTaskResponse extends $tea.Model {
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

export class ReinitDiskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // ids
  ids: string[];
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      ids: 'ids',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      ids: { 'type': 'array', 'itemType': 'string' },
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReinitDiskResponse extends $tea.Model {
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

export class UpdateDiskStrategyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // delete_with_computer
  deleteWithComputer?: boolean;
  // delete_auto_snapshot
  deleteAutoSnapshot?: boolean;
  // enable_auto_snapshot
  enableAutoSnapshot?: boolean;
  // ids
  ids: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      deleteWithComputer: 'delete_with_computer',
      deleteAutoSnapshot: 'delete_auto_snapshot',
      enableAutoSnapshot: 'enable_auto_snapshot',
      ids: 'ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      deleteWithComputer: 'boolean',
      deleteAutoSnapshot: 'boolean',
      enableAutoSnapshot: 'boolean',
      ids: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDiskStrategyResponse extends $tea.Model {
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
      keepAliveDurationMillis: this._keepAliveDurationMillis,
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
          sdk_version: "1.3.19",
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
   * Description: 批量删除构建记录
   * Summary: 批量删除构建记录
   */
  async batchdeleteApplicationBuild(request: BatchdeleteApplicationBuildRequest): Promise<BatchdeleteApplicationBuildResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchdeleteApplicationBuildEx(request, headers, runtime);
  }

  /**
   * Description: 批量删除构建记录
   * Summary: 批量删除构建记录
   */
  async batchdeleteApplicationBuildEx(request: BatchdeleteApplicationBuildRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchdeleteApplicationBuildResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchdeleteApplicationBuildResponse>(await this.doRequest("1.0", "antcloud.cas.application.build.batchdelete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchdeleteApplicationBuildResponse({}));
  }

  /**
   * Description: 批量查询应用明细
   * Summary: 批量查询应用明细
   */
  async listApplicationManifest(request: ListApplicationManifestRequest): Promise<ListApplicationManifestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listApplicationManifestEx(request, headers, runtime);
  }

  /**
   * Description: 批量查询应用明细
   * Summary: 批量查询应用明细
   */
  async listApplicationManifestEx(request: ListApplicationManifestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListApplicationManifestResponse> {
    Util.validateModel(request);
    return $tea.cast<ListApplicationManifestResponse>(await this.doRequest("1.0", "antcloud.cas.application.manifest.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListApplicationManifestResponse({}));
  }

  /**
   * Description: 批量删除应用发布包
   * Summary: 批量删除应用发布包
   */
  async batchdeleteApplicationPackage(request: BatchdeleteApplicationPackageRequest): Promise<BatchdeleteApplicationPackageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchdeleteApplicationPackageEx(request, headers, runtime);
  }

  /**
   * Description: 批量删除应用发布包
   * Summary: 批量删除应用发布包
   */
  async batchdeleteApplicationPackageEx(request: BatchdeleteApplicationPackageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchdeleteApplicationPackageResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchdeleteApplicationPackageResponse>(await this.doRequest("1.0", "antcloud.cas.application.package.batchdelete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchdeleteApplicationPackageResponse({}));
  }

  /**
   * Description: 创建应用发布包
   * Summary: 创建应用发布包
   */
  async createApplicationPackage(request: CreateApplicationPackageRequest): Promise<CreateApplicationPackageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createApplicationPackageEx(request, headers, runtime);
  }

  /**
   * Description: 创建应用发布包
   * Summary: 创建应用发布包
   */
  async createApplicationPackageEx(request: CreateApplicationPackageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateApplicationPackageResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateApplicationPackageResponse>(await this.doRequest("1.0", "antcloud.cas.application.package.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateApplicationPackageResponse({}));
  }

  /**
   * Description: 删除应用发布包
   * Summary: 删除应用发布包
   */
  async deleteApplicationPackage(request: DeleteApplicationPackageRequest): Promise<DeleteApplicationPackageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteApplicationPackageEx(request, headers, runtime);
  }

  /**
   * Description: 删除应用发布包
   * Summary: 删除应用发布包
   */
  async deleteApplicationPackageEx(request: DeleteApplicationPackageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteApplicationPackageResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteApplicationPackageResponse>(await this.doRequest("1.0", "antcloud.cas.application.package.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteApplicationPackageResponse({}));
  }

  /**
   * Description: 批量获取应用发布包
   * Summary: 批量获取应用发布包
   */
  async listApplicationPackage(request: ListApplicationPackageRequest): Promise<ListApplicationPackageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listApplicationPackageEx(request, headers, runtime);
  }

  /**
   * Description: 批量获取应用发布包
   * Summary: 批量获取应用发布包
   */
  async listApplicationPackageEx(request: ListApplicationPackageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListApplicationPackageResponse> {
    Util.validateModel(request);
    return $tea.cast<ListApplicationPackageResponse>(await this.doRequest("1.0", "antcloud.cas.application.package.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListApplicationPackageResponse({}));
  }

  /**
   * Description: 获取上传应用发布包下载配置
   * Summary: 获取上传应用发布包下载配置
   */
  async uploadApplicationPackageconfig(request: UploadApplicationPackageconfigRequest): Promise<UploadApplicationPackageconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadApplicationPackageconfigEx(request, headers, runtime);
  }

  /**
   * Description: 获取上传应用发布包下载配置
   * Summary: 获取上传应用发布包下载配置
   */
  async uploadApplicationPackageconfigEx(request: UploadApplicationPackageconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadApplicationPackageconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadApplicationPackageconfigResponse>(await this.doRequest("1.0", "antcloud.cas.application.packageconfig.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadApplicationPackageconfigResponse({}));
  }

  /**
   * Description: 批量获取应用实例的 cell
   * Summary: 批量获取应用实例的 cell
   */
  async listAppserviceCell(request: ListAppserviceCellRequest): Promise<ListAppserviceCellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAppserviceCellEx(request, headers, runtime);
  }

  /**
   * Description: 批量获取应用实例的 cell
   * Summary: 批量获取应用实例的 cell
   */
  async listAppserviceCellEx(request: ListAppserviceCellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAppserviceCellResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAppserviceCellResponse>(await this.doRequest("1.0", "antcloud.cas.appservice.cell.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAppserviceCellResponse({}));
  }

  /**
   * Description: 创建应用实例
   * Summary: 创建应用实例
   */
  async createAppservice(request: CreateAppserviceRequest): Promise<CreateAppserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAppserviceEx(request, headers, runtime);
  }

  /**
   * Description: 创建应用实例
   * Summary: 创建应用实例
   */
  async createAppserviceEx(request: CreateAppserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAppserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAppserviceResponse>(await this.doRequest("1.0", "antcloud.cas.appservice.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAppserviceResponse({}));
  }

  /**
   * Description: 旧版应用管理-根据appId获得默认的APPService,只有当isCreateDefault为true并且没有默认AppService时才会创建默认AppService
   * Summary: 旧版应用管理-获取默认的应用服务
   */
  async getAppserviceDefault(request: GetAppserviceDefaultRequest): Promise<GetAppserviceDefaultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAppserviceDefaultEx(request, headers, runtime);
  }

  /**
   * Description: 旧版应用管理-根据appId获得默认的APPService,只有当isCreateDefault为true并且没有默认AppService时才会创建默认AppService
   * Summary: 旧版应用管理-获取默认的应用服务
   */
  async getAppserviceDefaultEx(request: GetAppserviceDefaultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAppserviceDefaultResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAppserviceDefaultResponse>(await this.doRequest("1.0", "antcloud.cas.appservice.default.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAppserviceDefaultResponse({}));
  }

  /**
   * Description: 判断应用实例是否存在
   * Summary: 判断应用实例是否存在
   */
  async existAppservice(request: ExistAppserviceRequest): Promise<ExistAppserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.existAppserviceEx(request, headers, runtime);
  }

  /**
   * Description: 判断应用实例是否存在
   * Summary: 判断应用实例是否存在
   */
  async existAppserviceEx(request: ExistAppserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExistAppserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<ExistAppserviceResponse>(await this.doRequest("1.0", "antcloud.cas.appservice.exist", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExistAppserviceResponse({}));
  }

  /**
   * Description: 更新应用实例
   * Summary: 更新应用实例
   */
  async updateAppservice(request: UpdateAppserviceRequest): Promise<UpdateAppserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAppserviceEx(request, headers, runtime);
  }

  /**
   * Description: 更新应用实例
   * Summary: 更新应用实例
   */
  async updateAppserviceEx(request: UpdateAppserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAppserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAppserviceResponse>(await this.doRequest("1.0", "antcloud.cas.appservice.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAppserviceResponse({}));
  }

  /**
   * Description: 技术栈1.0查询（opsware）
   * Summary: 技术栈查询
   */
  async queryBuildpack(request: QueryBuildpackRequest): Promise<QueryBuildpackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBuildpackEx(request, headers, runtime);
  }

  /**
   * Description: 技术栈1.0查询（opsware）
   * Summary: 技术栈查询
   */
  async queryBuildpackEx(request: QueryBuildpackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBuildpackResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBuildpackResponse>(await this.doRequest("1.0", "antcloud.cas.buildpack.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBuildpackResponse({}));
  }

  /**
   * Description: 旧版应用管理-获取指定应用详情
   * Summary: 旧版应用管理-获取应用详情
   */
  async getApplicationDetail(request: GetApplicationDetailRequest): Promise<GetApplicationDetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getApplicationDetailEx(request, headers, runtime);
  }

  /**
   * Description: 旧版应用管理-获取指定应用详情
   * Summary: 旧版应用管理-获取应用详情
   */
  async getApplicationDetailEx(request: GetApplicationDetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetApplicationDetailResponse> {
    Util.validateModel(request);
    return $tea.cast<GetApplicationDetailResponse>(await this.doRequest("1.0", "antcloud.cas.application.detail.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetApplicationDetailResponse({}));
  }

  /**
   * Description: 查询用户信息
   * Summary: 查询用户信息
   */
  async queryUser(request: QueryUserRequest): Promise<QueryUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUserEx(request, headers, runtime);
  }

  /**
   * Description: 查询用户信息
   * Summary: 查询用户信息
   */
  async queryUserEx(request: QueryUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUserResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUserResponse>(await this.doRequest("1.0", "antcloud.cas.user.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUserResponse({}));
  }

  /**
   * Description: 获取应用分组列表
   * Summary: 获取应用分组列表
   */
  async listAppgroup(request: ListAppgroupRequest): Promise<ListAppgroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAppgroupEx(request, headers, runtime);
  }

  /**
   * Description: 获取应用分组列表
   * Summary: 获取应用分组列表
   */
  async listAppgroupEx(request: ListAppgroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAppgroupResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAppgroupResponse>(await this.doRequest("1.0", "antcloud.cas.appgroup.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAppgroupResponse({}));
  }

  /**
   * Description: 检查应用分组是否存在
   * Summary: 检查应用分组是否存在
   */
  async existAppgroup(request: ExistAppgroupRequest): Promise<ExistAppgroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.existAppgroupEx(request, headers, runtime);
  }

  /**
   * Description: 检查应用分组是否存在
   * Summary: 检查应用分组是否存在
   */
  async existAppgroupEx(request: ExistAppgroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExistAppgroupResponse> {
    Util.validateModel(request);
    return $tea.cast<ExistAppgroupResponse>(await this.doRequest("1.0", "antcloud.cas.appgroup.exist", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExistAppgroupResponse({}));
  }

  /**
   * Description: 创建应用分组
   * Summary: 创建应用分组
   */
  async createAppgroup(request: CreateAppgroupRequest): Promise<CreateAppgroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAppgroupEx(request, headers, runtime);
  }

  /**
   * Description: 创建应用分组
   * Summary: 创建应用分组
   */
  async createAppgroupEx(request: CreateAppgroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAppgroupResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAppgroupResponse>(await this.doRequest("1.0", "antcloud.cas.appgroup.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAppgroupResponse({}));
  }

  /**
   * Description: 获取应用owner列表
   * Summary: 获取应用owner列表
   */
  async listAppgroupOwner(request: ListAppgroupOwnerRequest): Promise<ListAppgroupOwnerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAppgroupOwnerEx(request, headers, runtime);
  }

  /**
   * Description: 获取应用owner列表
   * Summary: 获取应用owner列表
   */
  async listAppgroupOwnerEx(request: ListAppgroupOwnerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAppgroupOwnerResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAppgroupOwnerResponse>(await this.doRequest("1.0", "antcloud.cas.appgroup.owner.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAppgroupOwnerResponse({}));
  }

  /**
   * Description: 应用分组结构查询
   * Summary: 应用分组结构查询
   */
  async getAppgroupTree(request: GetAppgroupTreeRequest): Promise<GetAppgroupTreeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAppgroupTreeEx(request, headers, runtime);
  }

  /**
   * Description: 应用分组结构查询
   * Summary: 应用分组结构查询
   */
  async getAppgroupTreeEx(request: GetAppgroupTreeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAppgroupTreeResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAppgroupTreeResponse>(await this.doRequest("1.0", "antcloud.cas.appgroup.tree.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAppgroupTreeResponse({}));
  }

  /**
   * Description: 应用分组结构查询
   * Summary: 应用分组结构查询
   */
  async getAppgroupSystemtree(request: GetAppgroupSystemtreeRequest): Promise<GetAppgroupSystemtreeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAppgroupSystemtreeEx(request, headers, runtime);
  }

  /**
   * Description: 应用分组结构查询
   * Summary: 应用分组结构查询
   */
  async getAppgroupSystemtreeEx(request: GetAppgroupSystemtreeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAppgroupSystemtreeResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAppgroupSystemtreeResponse>(await this.doRequest("1.0", "antcloud.cas.appgroup.systemtree.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAppgroupSystemtreeResponse({}));
  }

  /**
   * Description: 删除分组
   * Summary: 删除分组
   */
  async deleteAppgroup(request: DeleteAppgroupRequest): Promise<DeleteAppgroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteAppgroupEx(request, headers, runtime);
  }

  /**
   * Description: 删除分组
   * Summary: 删除分组
   */
  async deleteAppgroupEx(request: DeleteAppgroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteAppgroupResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteAppgroupResponse>(await this.doRequest("1.0", "antcloud.cas.appgroup.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteAppgroupResponse({}));
  }

  /**
   * Description: 更新分组
   * Summary: 更新分组
   */
  async updateAppgroup(request: UpdateAppgroupRequest): Promise<UpdateAppgroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAppgroupEx(request, headers, runtime);
  }

  /**
   * Description: 更新分组
   * Summary: 更新分组
   */
  async updateAppgroupEx(request: UpdateAppgroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAppgroupResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAppgroupResponse>(await this.doRequest("1.0", "antcloud.cas.appgroup.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAppgroupResponse({}));
  }

  /**
   * Description: 列出所有应用等级
   * Summary: 列出所有应用等级
   */
  async listApplevel(request: ListApplevelRequest): Promise<ListApplevelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listApplevelEx(request, headers, runtime);
  }

  /**
   * Description: 列出所有应用等级
   * Summary: 列出所有应用等级
   */
  async listApplevelEx(request: ListApplevelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListApplevelResponse> {
    Util.validateModel(request);
    return $tea.cast<ListApplevelResponse>(await this.doRequest("1.0", "antcloud.cas.applevel.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListApplevelResponse({}));
  }

  /**
   * Description: 应用等级是否存在
   * Summary: 应用等级是否存在
   */
  async existApplevel(request: ExistApplevelRequest): Promise<ExistApplevelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.existApplevelEx(request, headers, runtime);
  }

  /**
   * Description: 应用等级是否存在
   * Summary: 应用等级是否存在
   */
  async existApplevelEx(request: ExistApplevelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExistApplevelResponse> {
    Util.validateModel(request);
    return $tea.cast<ExistApplevelResponse>(await this.doRequest("1.0", "antcloud.cas.applevel.exist", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExistApplevelResponse({}));
  }

  /**
   * Description: 创建应用等级
   * Summary: 创建应用等级
   */
  async createApplevel(request: CreateApplevelRequest): Promise<CreateApplevelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createApplevelEx(request, headers, runtime);
  }

  /**
   * Description: 创建应用等级
   * Summary: 创建应用等级
   */
  async createApplevelEx(request: CreateApplevelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateApplevelResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateApplevelResponse>(await this.doRequest("1.0", "antcloud.cas.applevel.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateApplevelResponse({}));
  }

  /**
   * Description: 删除应用分组
   * Summary: 删除应用分组
   */
  async deleteApplevel(request: DeleteApplevelRequest): Promise<DeleteApplevelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteApplevelEx(request, headers, runtime);
  }

  /**
   * Description: 删除应用分组
   * Summary: 删除应用分组
   */
  async deleteApplevelEx(request: DeleteApplevelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteApplevelResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteApplevelResponse>(await this.doRequest("1.0", "antcloud.cas.applevel.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteApplevelResponse({}));
  }

  /**
   * Description: 更新应用等级
   * Summary: 更新应用等级
   */
  async updateApplevel(request: UpdateApplevelRequest): Promise<UpdateApplevelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateApplevelEx(request, headers, runtime);
  }

  /**
   * Description: 更新应用等级
   * Summary: 更新应用等级
   */
  async updateApplevelEx(request: UpdateApplevelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateApplevelResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateApplevelResponse>(await this.doRequest("1.0", "antcloud.cas.applevel.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateApplevelResponse({}));
  }

  /**
   * Description: 旧版应用管理-获取应用列表
   * Summary: 旧版应用管理-获取应用列表
   */
  async listApplication(request: ListApplicationRequest): Promise<ListApplicationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listApplicationEx(request, headers, runtime);
  }

  /**
   * Description: 旧版应用管理-获取应用列表
   * Summary: 旧版应用管理-获取应用列表
   */
  async listApplicationEx(request: ListApplicationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListApplicationResponse> {
    Util.validateModel(request);
    return $tea.cast<ListApplicationResponse>(await this.doRequest("1.0", "antcloud.cas.application.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListApplicationResponse({}));
  }

  /**
   * Description: 旧版应用管理-更新应用
   * Summary: 旧版应用管理-更新应用
   */
  async updateApplication(request: UpdateApplicationRequest): Promise<UpdateApplicationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateApplicationEx(request, headers, runtime);
  }

  /**
   * Description: 旧版应用管理-更新应用
   * Summary: 旧版应用管理-更新应用
   */
  async updateApplicationEx(request: UpdateApplicationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateApplicationResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateApplicationResponse>(await this.doRequest("1.0", "antcloud.cas.application.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateApplicationResponse({}));
  }

  /**
   * Description: 旧版应用管理-批量查询应用服务
   * Summary: 旧版应用管理-批量查询应用服务
   */
  async listAppservice(request: ListAppserviceRequest): Promise<ListAppserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAppserviceEx(request, headers, runtime);
  }

  /**
   * Description: 旧版应用管理-批量查询应用服务
   * Summary: 旧版应用管理-批量查询应用服务
   */
  async listAppserviceEx(request: ListAppserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAppserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAppserviceResponse>(await this.doRequest("1.0", "antcloud.cas.appservice.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAppserviceResponse({}));
  }

  /**
   * Description: 旧版应用管理-删除应用服务
   * Summary: 旧版应用管理-删除应用服务
   */
  async deleteAppservice(request: DeleteAppserviceRequest): Promise<DeleteAppserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteAppserviceEx(request, headers, runtime);
  }

  /**
   * Description: 旧版应用管理-删除应用服务
   * Summary: 旧版应用管理-删除应用服务
   */
  async deleteAppserviceEx(request: DeleteAppserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteAppserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteAppserviceResponse>(await this.doRequest("1.0", "antcloud.cas.appservice.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteAppserviceResponse({}));
  }

  /**
   * Description: 旧版应用管理-获取应用服务详情
   * Summary: 旧版应用管理-获取应用服务详情
   */
  async getAppserviceDetail(request: GetAppserviceDetailRequest): Promise<GetAppserviceDetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAppserviceDetailEx(request, headers, runtime);
  }

  /**
   * Description: 旧版应用管理-获取应用服务详情
   * Summary: 旧版应用管理-获取应用服务详情
   */
  async getAppserviceDetailEx(request: GetAppserviceDetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAppserviceDetailResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAppserviceDetailResponse>(await this.doRequest("1.0", "antcloud.cas.appservice.detail.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAppserviceDetailResponse({}));
  }

  /**
   * Description: 旧版应用管理-检查应用发布包是否存在
   * Summary: 旧版应用管理-检查应用发布包是否存在
   */
  async existApplicationPackage(request: ExistApplicationPackageRequest): Promise<ExistApplicationPackageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.existApplicationPackageEx(request, headers, runtime);
  }

  /**
   * Description: 旧版应用管理-检查应用发布包是否存在
   * Summary: 旧版应用管理-检查应用发布包是否存在
   */
  async existApplicationPackageEx(request: ExistApplicationPackageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExistApplicationPackageResponse> {
    Util.validateModel(request);
    return $tea.cast<ExistApplicationPackageResponse>(await this.doRequest("1.0", "antcloud.cas.application.package.exist", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExistApplicationPackageResponse({}));
  }

  /**
   * Description: 旧版应用管理-获取应用包上传策略
   * Summary: 旧版应用管理-获取应用包上传策略
   */
  async getApplicationPackageuploadpolicy(request: GetApplicationPackageuploadpolicyRequest): Promise<GetApplicationPackageuploadpolicyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getApplicationPackageuploadpolicyEx(request, headers, runtime);
  }

  /**
   * Description: 旧版应用管理-获取应用包上传策略
   * Summary: 旧版应用管理-获取应用包上传策略
   */
  async getApplicationPackageuploadpolicyEx(request: GetApplicationPackageuploadpolicyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetApplicationPackageuploadpolicyResponse> {
    Util.validateModel(request);
    return $tea.cast<GetApplicationPackageuploadpolicyResponse>(await this.doRequest("1.0", "antcloud.cas.application.packageuploadpolicy.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetApplicationPackageuploadpolicyResponse({}));
  }

  /**
   * Description: 旧版应用管理-获取发布包下载链接
   * Summary: 旧版应用管理-获取发布包下载链接
   */
  async getApplicationPackagedownloadurl(request: GetApplicationPackagedownloadurlRequest): Promise<GetApplicationPackagedownloadurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getApplicationPackagedownloadurlEx(request, headers, runtime);
  }

  /**
   * Description: 旧版应用管理-获取发布包下载链接
   * Summary: 旧版应用管理-获取发布包下载链接
   */
  async getApplicationPackagedownloadurlEx(request: GetApplicationPackagedownloadurlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetApplicationPackagedownloadurlResponse> {
    Util.validateModel(request);
    return $tea.cast<GetApplicationPackagedownloadurlResponse>(await this.doRequest("1.0", "antcloud.cas.application.packagedownloadurl.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetApplicationPackagedownloadurlResponse({}));
  }

  /**
   * Description: 旧版应用管理-判断应用是否存在
   * Summary: 旧版应用管理-判断应用是否存在
   */
  async existApplication(request: ExistApplicationRequest): Promise<ExistApplicationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.existApplicationEx(request, headers, runtime);
  }

  /**
   * Description: 旧版应用管理-判断应用是否存在
   * Summary: 旧版应用管理-判断应用是否存在
   */
  async existApplicationEx(request: ExistApplicationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExistApplicationResponse> {
    Util.validateModel(request);
    return $tea.cast<ExistApplicationResponse>(await this.doRequest("1.0", "antcloud.cas.application.exist", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExistApplicationResponse({}));
  }

  /**
   * Description: 旧版应用管理-根据 appServiceIds 查询应用服务
   * Summary: 根据应用服务ids查询应用服务
   */
  async queryAppservice(request: QueryAppserviceRequest): Promise<QueryAppserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAppserviceEx(request, headers, runtime);
  }

  /**
   * Description: 旧版应用管理-根据 appServiceIds 查询应用服务
   * Summary: 根据应用服务ids查询应用服务
   */
  async queryAppserviceEx(request: QueryAppserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAppserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAppserviceResponse>(await this.doRequest("1.0", "antcloud.cas.appservice.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAppserviceResponse({}));
  }

  /**
   * Description: 历史遗留接口-获取开关配置清单
   * Summary: 历史遗留接口-获取开关配置清单
   */
  async getAppgrayconfigs(request: GetAppgrayconfigsRequest): Promise<GetAppgrayconfigsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAppgrayconfigsEx(request, headers, runtime);
  }

  /**
   * Description: 历史遗留接口-获取开关配置清单
   * Summary: 历史遗留接口-获取开关配置清单
   */
  async getAppgrayconfigsEx(request: GetAppgrayconfigsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAppgrayconfigsResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAppgrayconfigsResponse>(await this.doRequest("1.0", "antcloud.cas.appgrayconfigs.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAppgrayconfigsResponse({}));
  }

  /**
   * Description: 创建 computer 实例
   * Summary: 创建 computer 实例
   */
  async createComputer(request: CreateComputerRequest): Promise<CreateComputerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createComputerEx(request, headers, runtime);
  }

  /**
   * Description: 创建 computer 实例
   * Summary: 创建 computer 实例
   */
  async createComputerEx(request: CreateComputerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateComputerResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateComputerResponse>(await this.doRequest("1.0", "antcloud.cas.computer.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateComputerResponse({}));
  }

  /**
   * Description: computer 删除
   * Summary: computer 删除
   */
  async deleteComputer(request: DeleteComputerRequest): Promise<DeleteComputerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteComputerEx(request, headers, runtime);
  }

  /**
   * Description: computer 删除
   * Summary: computer 删除
   */
  async deleteComputerEx(request: DeleteComputerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteComputerResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteComputerResponse>(await this.doRequest("1.0", "antcloud.cas.computer.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteComputerResponse({}));
  }

  /**
   * Description: computer 导入
   * Summary: computer 导入
   */
  async importComputer(request: ImportComputerRequest): Promise<ImportComputerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importComputerEx(request, headers, runtime);
  }

  /**
   * Description: computer 导入
   * Summary: computer 导入
   */
  async importComputerEx(request: ImportComputerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportComputerResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportComputerResponse>(await this.doRequest("1.0", "antcloud.cas.computer.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportComputerResponse({}));
  }

  /**
   * Description: database 创建
   * Summary: database 创建
   */
  async createDatabase(request: CreateDatabaseRequest): Promise<CreateDatabaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDatabaseEx(request, headers, runtime);
  }

  /**
   * Description: database 创建
   * Summary: database 创建
   */
  async createDatabaseEx(request: CreateDatabaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDatabaseResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDatabaseResponse>(await this.doRequest("1.0", "antcloud.cas.database.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDatabaseResponse({}));
  }

  /**
   * Description: database 导入
   * Summary: database 导入
   */
  async importDatabase(request: ImportDatabaseRequest): Promise<ImportDatabaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importDatabaseEx(request, headers, runtime);
  }

  /**
   * Description: database 导入
   * Summary: database 导入
   */
  async importDatabaseEx(request: ImportDatabaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportDatabaseResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportDatabaseResponse>(await this.doRequest("1.0", "antcloud.cas.database.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportDatabaseResponse({}));
  }

  /**
   * Description: database 删除
   * Summary: database 删除
   */
  async deleteDatabase(request: DeleteDatabaseRequest): Promise<DeleteDatabaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteDatabaseEx(request, headers, runtime);
  }

  /**
   * Description: database 删除
   * Summary: database 删除
   */
  async deleteDatabaseEx(request: DeleteDatabaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteDatabaseResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteDatabaseResponse>(await this.doRequest("1.0", "antcloud.cas.database.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteDatabaseResponse({}));
  }

  /**
   * Description: loadbalance 创建
   * Summary: loadbalance 创建
   */
  async createLoadbalance(request: CreateLoadbalanceRequest): Promise<CreateLoadbalanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLoadbalanceEx(request, headers, runtime);
  }

  /**
   * Description: loadbalance 创建
   * Summary: loadbalance 创建
   */
  async createLoadbalanceEx(request: CreateLoadbalanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLoadbalanceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLoadbalanceResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLoadbalanceResponse({}));
  }

  /**
   * Description: loadbalance 删除
   * Summary: loadbalance 删除
   */
  async deleteLoadbalance(request: DeleteLoadbalanceRequest): Promise<DeleteLoadbalanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteLoadbalanceEx(request, headers, runtime);
  }

  /**
   * Description: loadbalance 删除
   * Summary: loadbalance 删除
   */
  async deleteLoadbalanceEx(request: DeleteLoadbalanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteLoadbalanceResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteLoadbalanceResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteLoadbalanceResponse({}));
  }

  /**
   * Description: loadbalance 导入
   * Summary: loadbalance 导入
   */
  async importLoadbalance(request: ImportLoadbalanceRequest): Promise<ImportLoadbalanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importLoadbalanceEx(request, headers, runtime);
  }

  /**
   * Description: loadbalance 导入
   * Summary: loadbalance 导入
   */
  async importLoadbalanceEx(request: ImportLoadbalanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportLoadbalanceResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportLoadbalanceResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportLoadbalanceResponse({}));
  }

  /**
   * Description: vpc 创建
   * Summary: vpc 创建
   */
  async createVpc(request: CreateVpcRequest): Promise<CreateVpcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createVpcEx(request, headers, runtime);
  }

  /**
   * Description: vpc 创建
   * Summary: vpc 创建
   */
  async createVpcEx(request: CreateVpcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateVpcResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateVpcResponse>(await this.doRequest("1.0", "antcloud.cas.vpc.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateVpcResponse({}));
  }

  /**
   * Description: vpc 删除
   * Summary: vpc 删除
   */
  async deleteVpc(request: DeleteVpcRequest): Promise<DeleteVpcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteVpcEx(request, headers, runtime);
  }

  /**
   * Description: vpc 删除
   * Summary: vpc 删除
   */
  async deleteVpcEx(request: DeleteVpcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteVpcResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteVpcResponse>(await this.doRequest("1.0", "antcloud.cas.vpc.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteVpcResponse({}));
  }

  /**
   * Description: computer 从应用中释放
   * Summary: computer 从应用中释放
   */
  async releaseComputer(request: ReleaseComputerRequest): Promise<ReleaseComputerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.releaseComputerEx(request, headers, runtime);
  }

  /**
   * Description: computer 从应用中释放
   * Summary: computer 从应用中释放
   */
  async releaseComputerEx(request: ReleaseComputerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReleaseComputerResponse> {
    Util.validateModel(request);
    return $tea.cast<ReleaseComputerResponse>(await this.doRequest("1.0", "antcloud.cas.computer.release", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReleaseComputerResponse({}));
  }

  /**
   * Description: 重置 computer 密码
   * Summary: 重置 computer 密码
   */
  async reinitComputerPassword(request: ReinitComputerPasswordRequest): Promise<ReinitComputerPasswordResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.reinitComputerPasswordEx(request, headers, runtime);
  }

  /**
   * Description: 重置 computer 密码
   * Summary: 重置 computer 密码
   */
  async reinitComputerPasswordEx(request: ReinitComputerPasswordRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReinitComputerPasswordResponse> {
    Util.validateModel(request);
    return $tea.cast<ReinitComputerPasswordResponse>(await this.doRequest("1.0", "antcloud.cas.computer.password.reinit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReinitComputerPasswordResponse({}));
  }

  /**
   * Description: database 从应用中释放
   * Summary: database 从应用中释放
   */
  async releaseDatabase(request: ReleaseDatabaseRequest): Promise<ReleaseDatabaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.releaseDatabaseEx(request, headers, runtime);
  }

  /**
   * Description: database 从应用中释放
   * Summary: database 从应用中释放
   */
  async releaseDatabaseEx(request: ReleaseDatabaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReleaseDatabaseResponse> {
    Util.validateModel(request);
    return $tea.cast<ReleaseDatabaseResponse>(await this.doRequest("1.0", "antcloud.cas.database.release", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReleaseDatabaseResponse({}));
  }

  /**
   * Description: 移除 computer 
   * Summary: 移除 computer 
   */
  async removeComputer(request: RemoveComputerRequest): Promise<RemoveComputerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.removeComputerEx(request, headers, runtime);
  }

  /**
   * Description: 移除 computer 
   * Summary: 移除 computer 
   */
  async removeComputerEx(request: RemoveComputerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RemoveComputerResponse> {
    Util.validateModel(request);
    return $tea.cast<RemoveComputerResponse>(await this.doRequest("1.0", "antcloud.cas.computer.remove", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RemoveComputerResponse({}));
  }

  /**
   * Description: loadbalance 移除
   * Summary: loadbalance 移除
   */
  async removeLoadbalance(request: RemoveLoadbalanceRequest): Promise<RemoveLoadbalanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.removeLoadbalanceEx(request, headers, runtime);
  }

  /**
   * Description: loadbalance 移除
   * Summary: loadbalance 移除
   */
  async removeLoadbalanceEx(request: RemoveLoadbalanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RemoveLoadbalanceResponse> {
    Util.validateModel(request);
    return $tea.cast<RemoveLoadbalanceResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.remove", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RemoveLoadbalanceResponse({}));
  }

  /**
   * Description: database 移除
   * Summary: database 移除
   */
  async removeDatabase(request: RemoveDatabaseRequest): Promise<RemoveDatabaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.removeDatabaseEx(request, headers, runtime);
  }

  /**
   * Description: database 移除
   * Summary: database 移除
   */
  async removeDatabaseEx(request: RemoveDatabaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RemoveDatabaseResponse> {
    Util.validateModel(request);
    return $tea.cast<RemoveDatabaseResponse>(await this.doRequest("1.0", "antcloud.cas.database.remove", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RemoveDatabaseResponse({}));
  }

  /**
   * Description: loadbalance 从应用中释放
   * Summary: loadbalance 从应用中释放
   */
  async releaseLoadbalance(request: ReleaseLoadbalanceRequest): Promise<ReleaseLoadbalanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.releaseLoadbalanceEx(request, headers, runtime);
  }

  /**
   * Description: loadbalance 从应用中释放
   * Summary: loadbalance 从应用中释放
   */
  async releaseLoadbalanceEx(request: ReleaseLoadbalanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReleaseLoadbalanceResponse> {
    Util.validateModel(request);
    return $tea.cast<ReleaseLoadbalanceResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.release", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReleaseLoadbalanceResponse({}));
  }

  /**
   * Description: database account 创建
   * Summary: database account 创建
   */
  async createDatabaseAccount(request: CreateDatabaseAccountRequest): Promise<CreateDatabaseAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDatabaseAccountEx(request, headers, runtime);
  }

  /**
   * Description: database account 创建
   * Summary: database account 创建
   */
  async createDatabaseAccountEx(request: CreateDatabaseAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDatabaseAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDatabaseAccountResponse>(await this.doRequest("1.0", "antcloud.cas.database.account.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDatabaseAccountResponse({}));
  }

  /**
   * Description: 安全域/组 创建
   * Summary: 安全域/组 创建
   */
  async createSecuritygroup(request: CreateSecuritygroupRequest): Promise<CreateSecuritygroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSecuritygroupEx(request, headers, runtime);
  }

  /**
   * Description: 安全域/组 创建
   * Summary: 安全域/组 创建
   */
  async createSecuritygroupEx(request: CreateSecuritygroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSecuritygroupResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSecuritygroupResponse>(await this.doRequest("1.0", "antcloud.cas.securitygroup.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSecuritygroupResponse({}));
  }

  /**
   * Description: securitygroup 导入
   * Summary: securitygroup 导入
   */
  async importSecuritygroup(request: ImportSecuritygroupRequest): Promise<ImportSecuritygroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importSecuritygroupEx(request, headers, runtime);
  }

  /**
   * Description: securitygroup 导入
   * Summary: securitygroup 导入
   */
  async importSecuritygroupEx(request: ImportSecuritygroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportSecuritygroupResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportSecuritygroupResponse>(await this.doRequest("1.0", "antcloud.cas.securitygroup.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportSecuritygroupResponse({}));
  }

  /**
   * Description: securitygroup 移除
   * Summary: securitygroup 移除
   */
  async removeSecuritygroup(request: RemoveSecuritygroupRequest): Promise<RemoveSecuritygroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.removeSecuritygroupEx(request, headers, runtime);
  }

  /**
   * Description: securitygroup 移除
   * Summary: securitygroup 移除
   */
  async removeSecuritygroupEx(request: RemoveSecuritygroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RemoveSecuritygroupResponse> {
    Util.validateModel(request);
    return $tea.cast<RemoveSecuritygroupResponse>(await this.doRequest("1.0", "antcloud.cas.securitygroup.remove", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RemoveSecuritygroupResponse({}));
  }

  /**
   * Description: securitygroup 删除
   * Summary: securitygroup 删除
   */
  async deleteSecuritygroup(request: DeleteSecuritygroupRequest): Promise<DeleteSecuritygroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSecuritygroupEx(request, headers, runtime);
  }

  /**
   * Description: securitygroup 删除
   * Summary: securitygroup 删除
   */
  async deleteSecuritygroupEx(request: DeleteSecuritygroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSecuritygroupResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSecuritygroupResponse>(await this.doRequest("1.0", "antcloud.cas.securitygroup.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSecuritygroupResponse({}));
  }

  /**
   * Description: schema 删除
   * Summary: schema 删除
   */
  async deleteDatabaseSchema(request: DeleteDatabaseSchemaRequest): Promise<DeleteDatabaseSchemaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteDatabaseSchemaEx(request, headers, runtime);
  }

  /**
   * Description: schema 删除
   * Summary: schema 删除
   */
  async deleteDatabaseSchemaEx(request: DeleteDatabaseSchemaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteDatabaseSchemaResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteDatabaseSchemaResponse>(await this.doRequest("1.0", "antcloud.cas.database.schema.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteDatabaseSchemaResponse({}));
  }

  /**
   * Description: account 删除
   * Summary: account 删除
   */
  async deleteDatabaseAccount(request: DeleteDatabaseAccountRequest): Promise<DeleteDatabaseAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteDatabaseAccountEx(request, headers, runtime);
  }

  /**
   * Description: account 删除
   * Summary: account 删除
   */
  async deleteDatabaseAccountEx(request: DeleteDatabaseAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteDatabaseAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteDatabaseAccountResponse>(await this.doRequest("1.0", "antcloud.cas.database.account.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteDatabaseAccountResponse({}));
  }

  /**
   * Description: vswitch 删除
   * Summary: vswitch 删除
   */
  async deleteVpcVswitch(request: DeleteVpcVswitchRequest): Promise<DeleteVpcVswitchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteVpcVswitchEx(request, headers, runtime);
  }

  /**
   * Description: vswitch 删除
   * Summary: vswitch 删除
   */
  async deleteVpcVswitchEx(request: DeleteVpcVswitchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteVpcVswitchResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteVpcVswitchResponse>(await this.doRequest("1.0", "antcloud.cas.vpc.vswitch.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteVpcVswitchResponse({}));
  }

  /**
   * Description: listener 删除
   * Summary: listener 删除
   */
  async deleteLoadbalanceListener(request: DeleteLoadbalanceListenerRequest): Promise<DeleteLoadbalanceListenerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteLoadbalanceListenerEx(request, headers, runtime);
  }

  /**
   * Description: listener 删除
   * Summary: listener 删除
   */
  async deleteLoadbalanceListenerEx(request: DeleteLoadbalanceListenerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteLoadbalanceListenerResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteLoadbalanceListenerResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.listener.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteLoadbalanceListenerResponse({}));
  }

  /**
   * Description: 路由表删除
   * Summary: 路由表删除
   */
  async deleteVpcVroutertable(request: DeleteVpcVroutertableRequest): Promise<DeleteVpcVroutertableResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteVpcVroutertableEx(request, headers, runtime);
  }

  /**
   * Description: 路由表删除
   * Summary: 路由表删除
   */
  async deleteVpcVroutertableEx(request: DeleteVpcVroutertableRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteVpcVroutertableResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteVpcVroutertableResponse>(await this.doRequest("1.0", "antcloud.cas.vpc.vroutertable.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteVpcVroutertableResponse({}));
  }

  /**
   * Description: 安全组中实例移除
   * Summary: 安全组中实例移除
   */
  async removeSecuritygroupInstance(request: RemoveSecuritygroupInstanceRequest): Promise<RemoveSecuritygroupInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.removeSecuritygroupInstanceEx(request, headers, runtime);
  }

  /**
   * Description: 安全组中实例移除
   * Summary: 安全组中实例移除
   */
  async removeSecuritygroupInstanceEx(request: RemoveSecuritygroupInstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RemoveSecuritygroupInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<RemoveSecuritygroupInstanceResponse>(await this.doRequest("1.0", "antcloud.cas.securitygroup.instance.remove", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RemoveSecuritygroupInstanceResponse({}));
  }

  /**
   * Description: 安全组 permission 删除
   * Summary: 安全组 permission 删除
   */
  async deleteSecuritygroupPermission(request: DeleteSecuritygroupPermissionRequest): Promise<DeleteSecuritygroupPermissionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSecuritygroupPermissionEx(request, headers, runtime);
  }

  /**
   * Description: 安全组 permission 删除
   * Summary: 安全组 permission 删除
   */
  async deleteSecuritygroupPermissionEx(request: DeleteSecuritygroupPermissionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSecuritygroupPermissionResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSecuritygroupPermissionResponse>(await this.doRequest("1.0", "antcloud.cas.securitygroup.permission.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSecuritygroupPermissionResponse({}));
  }

  /**
   * Description: lb 监听器访问 ip 删除
   * Summary: lb 监听器访问 ip 删除
   */
  async removeLoadbalanceSecurityip(request: RemoveLoadbalanceSecurityipRequest): Promise<RemoveLoadbalanceSecurityipResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.removeLoadbalanceSecurityipEx(request, headers, runtime);
  }

  /**
   * Description: lb 监听器访问 ip 删除
   * Summary: lb 监听器访问 ip 删除
   */
  async removeLoadbalanceSecurityipEx(request: RemoveLoadbalanceSecurityipRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RemoveLoadbalanceSecurityipResponse> {
    Util.validateModel(request);
    return $tea.cast<RemoveLoadbalanceSecurityipResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.securityip.remove", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RemoveLoadbalanceSecurityipResponse({}));
  }

  /**
   * Description: 应用创建
   * Summary: 应用创建
   */
  async createApplication(request: CreateApplicationRequest): Promise<CreateApplicationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createApplicationEx(request, headers, runtime);
  }

  /**
   * Description: 应用创建
   * Summary: 应用创建
   */
  async createApplicationEx(request: CreateApplicationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateApplicationResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateApplicationResponse>(await this.doRequest("1.0", "antcloud.cas.application.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateApplicationResponse({}));
  }

  /**
   * Description: 应用删除
   * Summary: 应用删除
   */
  async deleteApplication(request: DeleteApplicationRequest): Promise<DeleteApplicationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteApplicationEx(request, headers, runtime);
  }

  /**
   * Description: 应用删除
   * Summary: 应用删除
   */
  async deleteApplicationEx(request: DeleteApplicationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteApplicationResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteApplicationResponse>(await this.doRequest("1.0", "antcloud.cas.application.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteApplicationResponse({}));
  }

  /**
   * Description: vswitch 创建
   * Summary: vswitch 创建
   */
  async createVpcVswitch(request: CreateVpcVswitchRequest): Promise<CreateVpcVswitchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createVpcVswitchEx(request, headers, runtime);
  }

  /**
   * Description: vswitch 创建
   * Summary: vswitch 创建
   */
  async createVpcVswitchEx(request: CreateVpcVswitchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateVpcVswitchResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateVpcVswitchResponse>(await this.doRequest("1.0", "antcloud.cas.vpc.vswitch.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateVpcVswitchResponse({}));
  }

  /**
   * Description: vRouterTable 创建
   * Summary: vRouterTable 创建
   */
  async createVpcVroutertable(request: CreateVpcVroutertableRequest): Promise<CreateVpcVroutertableResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createVpcVroutertableEx(request, headers, runtime);
  }

  /**
   * Description: vRouterTable 创建
   * Summary: vRouterTable 创建
   */
  async createVpcVroutertableEx(request: CreateVpcVroutertableRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateVpcVroutertableResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateVpcVroutertableResponse>(await this.doRequest("1.0", "antcloud.cas.vpc.vroutertable.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateVpcVroutertableResponse({}));
  }

  /**
   * Description: 安全组添加实例
   * Summary: 安全组添加实例
   */
  async addSecuritygroupInstance(request: AddSecuritygroupInstanceRequest): Promise<AddSecuritygroupInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addSecuritygroupInstanceEx(request, headers, runtime);
  }

  /**
   * Description: 安全组添加实例
   * Summary: 安全组添加实例
   */
  async addSecuritygroupInstanceEx(request: AddSecuritygroupInstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddSecuritygroupInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<AddSecuritygroupInstanceResponse>(await this.doRequest("1.0", "antcloud.cas.securitygroup.instance.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddSecuritygroupInstanceResponse({}));
  }

  /**
   * Description: db 规格修改
   * Summary: db 规格修改
   */
  async updateDatabaseSpec(request: UpdateDatabaseSpecRequest): Promise<UpdateDatabaseSpecResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateDatabaseSpecEx(request, headers, runtime);
  }

  /**
   * Description: db 规格修改
   * Summary: db 规格修改
   */
  async updateDatabaseSpecEx(request: UpdateDatabaseSpecRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateDatabaseSpecResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDatabaseSpecResponse>(await this.doRequest("1.0", "antcloud.cas.database.spec.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateDatabaseSpecResponse({}));
  }

  /**
   * Description: lb 访问控制修改
   * Summary: lb 访问控制修改
   */
  async updateLoadbalanceAccesscontrol(request: UpdateLoadbalanceAccesscontrolRequest): Promise<UpdateLoadbalanceAccesscontrolResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateLoadbalanceAccesscontrolEx(request, headers, runtime);
  }

  /**
   * Description: lb 访问控制修改
   * Summary: lb 访问控制修改
   */
  async updateLoadbalanceAccesscontrolEx(request: UpdateLoadbalanceAccesscontrolRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateLoadbalanceAccesscontrolResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateLoadbalanceAccesscontrolResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.accesscontrol.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateLoadbalanceAccesscontrolResponse({}));
  }

  /**
   * Description: lb 规格修改
   * Summary: lb 规格修改
   */
  async updateLoadbalanceSpec(request: UpdateLoadbalanceSpecRequest): Promise<UpdateLoadbalanceSpecResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateLoadbalanceSpecEx(request, headers, runtime);
  }

  /**
   * Description: lb 规格修改
   * Summary: lb 规格修改
   */
  async updateLoadbalanceSpecEx(request: UpdateLoadbalanceSpecRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateLoadbalanceSpecResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateLoadbalanceSpecResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.spec.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateLoadbalanceSpecResponse({}));
  }

  /**
   * Description: vswitch 信息修改
   * Summary: vswitch 信息修改
   */
  async updateVpcVswitch(request: UpdateVpcVswitchRequest): Promise<UpdateVpcVswitchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateVpcVswitchEx(request, headers, runtime);
  }

  /**
   * Description: vswitch 信息修改
   * Summary: vswitch 信息修改
   */
  async updateVpcVswitchEx(request: UpdateVpcVswitchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateVpcVswitchResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateVpcVswitchResponse>(await this.doRequest("1.0", "antcloud.cas.vpc.vswitch.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateVpcVswitchResponse({}));
  }

  /**
   * Description: 创建 workspace
   * Summary: 创建 workspace
   */
  async createWorkspace(request: CreateWorkspaceRequest): Promise<CreateWorkspaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createWorkspaceEx(request, headers, runtime);
  }

  /**
   * Description: 创建 workspace
   * Summary: 创建 workspace
   */
  async createWorkspaceEx(request: CreateWorkspaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateWorkspaceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateWorkspaceResponse>(await this.doRequest("1.0", "antcloud.cas.workspace.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateWorkspaceResponse({}));
  }

  /**
   * Description: 元数据workspace创建
   * Summary: 元数据workspace创建
   */
  async createMetaWorkspace(request: CreateMetaWorkspaceRequest): Promise<CreateMetaWorkspaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createMetaWorkspaceEx(request, headers, runtime);
  }

  /**
   * Description: 元数据workspace创建
   * Summary: 元数据workspace创建
   */
  async createMetaWorkspaceEx(request: CreateMetaWorkspaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateMetaWorkspaceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateMetaWorkspaceResponse>(await this.doRequest("1.0", "antcloud.cas.meta.workspace.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateMetaWorkspaceResponse({}));
  }

  /**
   * Description: workspace查询
   * Summary: workspace查询
   */
  async queryMetaWorkspace(request: QueryMetaWorkspaceRequest): Promise<QueryMetaWorkspaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMetaWorkspaceEx(request, headers, runtime);
  }

  /**
   * Description: workspace查询
   * Summary: workspace查询
   */
  async queryMetaWorkspaceEx(request: QueryMetaWorkspaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMetaWorkspaceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMetaWorkspaceResponse>(await this.doRequest("1.0", "antcloud.cas.meta.workspace.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMetaWorkspaceResponse({}));
  }

  /**
   * Description: 元数据workspace删除
   * Summary: 元数据workspace删除
   */
  async deleteMetaWorkspace(request: DeleteMetaWorkspaceRequest): Promise<DeleteMetaWorkspaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteMetaWorkspaceEx(request, headers, runtime);
  }

  /**
   * Description: 元数据workspace删除
   * Summary: 元数据workspace删除
   */
  async deleteMetaWorkspaceEx(request: DeleteMetaWorkspaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteMetaWorkspaceResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteMetaWorkspaceResponse>(await this.doRequest("1.0", "antcloud.cas.meta.workspace.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteMetaWorkspaceResponse({}));
  }

  /**
   * Description: 资源VPC创建
   * Summary: 资源VPC创建
   */
  async createResourceVpc(request: CreateResourceVpcRequest): Promise<CreateResourceVpcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createResourceVpcEx(request, headers, runtime);
  }

  /**
   * Description: 资源VPC创建
   * Summary: 资源VPC创建
   */
  async createResourceVpcEx(request: CreateResourceVpcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateResourceVpcResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateResourceVpcResponse>(await this.doRequest("1.0", "antcloud.cas.resource.vpc.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateResourceVpcResponse({}));
  }

  /**
   * Description: 资源VPC查询
   * Summary: 资源VPC查询
   */
  async queryResourceVpc(request: QueryResourceVpcRequest): Promise<QueryResourceVpcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryResourceVpcEx(request, headers, runtime);
  }

  /**
   * Description: 资源VPC查询
   * Summary: 资源VPC查询
   */
  async queryResourceVpcEx(request: QueryResourceVpcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryResourceVpcResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryResourceVpcResponse>(await this.doRequest("1.0", "antcloud.cas.resource.vpc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryResourceVpcResponse({}));
  }

  /**
   * Description: 资源VPC删除
   * Summary: 资源VPC删除
   */
  async deleteResourceVpc(request: DeleteResourceVpcRequest): Promise<DeleteResourceVpcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteResourceVpcEx(request, headers, runtime);
  }

  /**
   * Description: 资源VPC删除
   * Summary: 资源VPC删除
   */
  async deleteResourceVpcEx(request: DeleteResourceVpcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteResourceVpcResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteResourceVpcResponse>(await this.doRequest("1.0", "antcloud.cas.resource.vpc.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteResourceVpcResponse({}));
  }

  /**
   * Description: 资源vswitch创建
   * Summary: 资源vswitch创建
   */
  async createResourceVswitch(request: CreateResourceVswitchRequest): Promise<CreateResourceVswitchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createResourceVswitchEx(request, headers, runtime);
  }

  /**
   * Description: 资源vswitch创建
   * Summary: 资源vswitch创建
   */
  async createResourceVswitchEx(request: CreateResourceVswitchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateResourceVswitchResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateResourceVswitchResponse>(await this.doRequest("1.0", "antcloud.cas.resource.vswitch.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateResourceVswitchResponse({}));
  }

  /**
   * Description: 资源vswitch查询
   * Summary: 资源vswitch查询
   */
  async queryResourceVswitch(request: QueryResourceVswitchRequest): Promise<QueryResourceVswitchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryResourceVswitchEx(request, headers, runtime);
  }

  /**
   * Description: 资源vswitch查询
   * Summary: 资源vswitch查询
   */
  async queryResourceVswitchEx(request: QueryResourceVswitchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryResourceVswitchResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryResourceVswitchResponse>(await this.doRequest("1.0", "antcloud.cas.resource.vswitch.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryResourceVswitchResponse({}));
  }

  /**
   * Description: 资源vswitch删除
   * Summary: 资源vswitch删除
   */
  async deleteResourceVswitch(request: DeleteResourceVswitchRequest): Promise<DeleteResourceVswitchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteResourceVswitchEx(request, headers, runtime);
  }

  /**
   * Description: 资源vswitch删除
   * Summary: 资源vswitch删除
   */
  async deleteResourceVswitchEx(request: DeleteResourceVswitchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteResourceVswitchResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteResourceVswitchResponse>(await this.doRequest("1.0", "antcloud.cas.resource.vswitch.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteResourceVswitchResponse({}));
  }

  /**
   * Description: 资源securitygroup查询
   * Summary: 资源securitygroup查询
   */
  async queryResourceSecuritygroup(request: QueryResourceSecuritygroupRequest): Promise<QueryResourceSecuritygroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryResourceSecuritygroupEx(request, headers, runtime);
  }

  /**
   * Description: 资源securitygroup查询
   * Summary: 资源securitygroup查询
   */
  async queryResourceSecuritygroupEx(request: QueryResourceSecuritygroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryResourceSecuritygroupResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryResourceSecuritygroupResponse>(await this.doRequest("1.0", "antcloud.cas.resource.securitygroup.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryResourceSecuritygroupResponse({}));
  }

  /**
   * Description: workspace 列表
   * Summary: workspace 列表
   */
  async listMetaWorkspace(request: ListMetaWorkspaceRequest): Promise<ListMetaWorkspaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listMetaWorkspaceEx(request, headers, runtime);
  }

  /**
   * Description: workspace 列表
   * Summary: workspace 列表
   */
  async listMetaWorkspaceEx(request: ListMetaWorkspaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListMetaWorkspaceResponse> {
    Util.validateModel(request);
    return $tea.cast<ListMetaWorkspaceResponse>(await this.doRequest("1.0", "antcloud.cas.meta.workspace.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListMetaWorkspaceResponse({}));
  }

  /**
   * Description: 创建安全组资源
   * Summary: 创建安全组
   */
  async createResourceSecuritygroup(request: CreateResourceSecuritygroupRequest): Promise<CreateResourceSecuritygroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createResourceSecuritygroupEx(request, headers, runtime);
  }

  /**
   * Description: 创建安全组资源
   * Summary: 创建安全组
   */
  async createResourceSecuritygroupEx(request: CreateResourceSecuritygroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateResourceSecuritygroupResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateResourceSecuritygroupResponse>(await this.doRequest("1.0", "antcloud.cas.resource.securitygroup.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateResourceSecuritygroupResponse({}));
  }

  /**
   * Description: 删除安全组
   * Summary: 删除安全组
   */
  async deleteResourceSecuritygroup(request: DeleteResourceSecuritygroupRequest): Promise<DeleteResourceSecuritygroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteResourceSecuritygroupEx(request, headers, runtime);
  }

  /**
   * Description: 删除安全组
   * Summary: 删除安全组
   */
  async deleteResourceSecuritygroupEx(request: DeleteResourceSecuritygroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteResourceSecuritygroupResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteResourceSecuritygroupResponse>(await this.doRequest("1.0", "antcloud.cas.resource.securitygroup.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteResourceSecuritygroupResponse({}));
  }

  /**
   * Description: 创建云主机instance
   * Summary: 创建云主机instance
   */
  async createResourceComputer(request: CreateResourceComputerRequest): Promise<CreateResourceComputerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createResourceComputerEx(request, headers, runtime);
  }

  /**
   * Description: 创建云主机instance
   * Summary: 创建云主机instance
   */
  async createResourceComputerEx(request: CreateResourceComputerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateResourceComputerResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateResourceComputerResponse>(await this.doRequest("1.0", "antcloud.cas.resource.computer.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateResourceComputerResponse({}));
  }

  /**
   * Description: computer 查询
   * Summary: computer 查询
   */
  async queryResourceComputer(request: QueryResourceComputerRequest): Promise<QueryResourceComputerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryResourceComputerEx(request, headers, runtime);
  }

  /**
   * Description: computer 查询
   * Summary: computer 查询
   */
  async queryResourceComputerEx(request: QueryResourceComputerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryResourceComputerResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryResourceComputerResponse>(await this.doRequest("1.0", "antcloud.cas.resource.computer.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryResourceComputerResponse({}));
  }

  /**
   * Description: 根据CPU内存机器规格查询api
   * Summary: 机器规格查询api
   */
  async queryResourceComputerspec(request: QueryResourceComputerspecRequest): Promise<QueryResourceComputerspecResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryResourceComputerspecEx(request, headers, runtime);
  }

  /**
   * Description: 根据CPU内存机器规格查询api
   * Summary: 机器规格查询api
   */
  async queryResourceComputerspecEx(request: QueryResourceComputerspecRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryResourceComputerspecResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryResourceComputerspecResponse>(await this.doRequest("1.0", "antcloud.cas.resource.computerspec.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryResourceComputerspecResponse({}));
  }

  /**
   * Description: 删除computer
   * Summary: 删除computer
   */
  async deleteResourceComputer(request: DeleteResourceComputerRequest): Promise<DeleteResourceComputerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteResourceComputerEx(request, headers, runtime);
  }

  /**
   * Description: 删除computer
   * Summary: 删除computer
   */
  async deleteResourceComputerEx(request: DeleteResourceComputerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteResourceComputerResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteResourceComputerResponse>(await this.doRequest("1.0", "antcloud.cas.resource.computer.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteResourceComputerResponse({}));
  }

  /**
   * Description: 重置computer密码
   * Summary: 重置computer密码
   */
  async reinitResourceComputerpassword(request: ReinitResourceComputerpasswordRequest): Promise<ReinitResourceComputerpasswordResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.reinitResourceComputerpasswordEx(request, headers, runtime);
  }

  /**
   * Description: 重置computer密码
   * Summary: 重置computer密码
   */
  async reinitResourceComputerpasswordEx(request: ReinitResourceComputerpasswordRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReinitResourceComputerpasswordResponse> {
    Util.validateModel(request);
    return $tea.cast<ReinitResourceComputerpasswordResponse>(await this.doRequest("1.0", "antcloud.cas.resource.computerpassword.reinit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReinitResourceComputerpasswordResponse({}));
  }

  /**
   * Description: 启动computer
   * Summary: 启动computer
   */
  async startResourceComputer(request: StartResourceComputerRequest): Promise<StartResourceComputerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startResourceComputerEx(request, headers, runtime);
  }

  /**
   * Description: 启动computer
   * Summary: 启动computer
   */
  async startResourceComputerEx(request: StartResourceComputerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartResourceComputerResponse> {
    Util.validateModel(request);
    return $tea.cast<StartResourceComputerResponse>(await this.doRequest("1.0", "antcloud.cas.resource.computer.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartResourceComputerResponse({}));
  }

  /**
   * Description: 停止机器
   * Summary: 停止机器
   */
  async stopResourceComputer(request: StopResourceComputerRequest): Promise<StopResourceComputerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.stopResourceComputerEx(request, headers, runtime);
  }

  /**
   * Description: 停止机器
   * Summary: 停止机器
   */
  async stopResourceComputerEx(request: StopResourceComputerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StopResourceComputerResponse> {
    Util.validateModel(request);
    return $tea.cast<StopResourceComputerResponse>(await this.doRequest("1.0", "antcloud.cas.resource.computer.stop", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StopResourceComputerResponse({}));
  }

  /**
   * Description: 阿里云日志服务(SLS)-创建日志项目
   * Summary: 创建日志项目
   */
  async createSlsProject(request: CreateSlsProjectRequest): Promise<CreateSlsProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSlsProjectEx(request, headers, runtime);
  }

  /**
   * Description: 阿里云日志服务(SLS)-创建日志项目
   * Summary: 创建日志项目
   */
  async createSlsProjectEx(request: CreateSlsProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSlsProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSlsProjectResponse>(await this.doRequest("1.0", "antcloud.cas.sls.project.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSlsProjectResponse({}));
  }

  /**
   * Description: 阿里云日志服务(SLS)-获取日志项目列表
   * Summary: 获取日志项目列表
   */
  async listSlsProject(request: ListSlsProjectRequest): Promise<ListSlsProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSlsProjectEx(request, headers, runtime);
  }

  /**
   * Description: 阿里云日志服务(SLS)-获取日志项目列表
   * Summary: 获取日志项目列表
   */
  async listSlsProjectEx(request: ListSlsProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSlsProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSlsProjectResponse>(await this.doRequest("1.0", "antcloud.cas.sls.project.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSlsProjectResponse({}));
  }

  /**
   * Description: 阿里云日志服务(SLS)-创建日志库
   * Summary: 创建日志库
   */
  async createSlsLogstore(request: CreateSlsLogstoreRequest): Promise<CreateSlsLogstoreResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSlsLogstoreEx(request, headers, runtime);
  }

  /**
   * Description: 阿里云日志服务(SLS)-创建日志库
   * Summary: 创建日志库
   */
  async createSlsLogstoreEx(request: CreateSlsLogstoreRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSlsLogstoreResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSlsLogstoreResponse>(await this.doRequest("1.0", "antcloud.cas.sls.logstore.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSlsLogstoreResponse({}));
  }

  /**
   * Description: 阿里云日志服务(SLS)-获取日志库列表
   * Summary: 获取日志库列表
   */
  async listSlsLogstore(request: ListSlsLogstoreRequest): Promise<ListSlsLogstoreResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSlsLogstoreEx(request, headers, runtime);
  }

  /**
   * Description: 阿里云日志服务(SLS)-获取日志库列表
   * Summary: 获取日志库列表
   */
  async listSlsLogstoreEx(request: ListSlsLogstoreRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSlsLogstoreResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSlsLogstoreResponse>(await this.doRequest("1.0", "antcloud.cas.sls.logstore.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSlsLogstoreResponse({}));
  }

  /**
   * Description: 阿里云日志服务(SLS)-获取单个日志库
   * Summary: 获取单个日志库
   */
  async getSlsLogstore(request: GetSlsLogstoreRequest): Promise<GetSlsLogstoreResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getSlsLogstoreEx(request, headers, runtime);
  }

  /**
   * Description: 阿里云日志服务(SLS)-获取单个日志库
   * Summary: 获取单个日志库
   */
  async getSlsLogstoreEx(request: GetSlsLogstoreRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetSlsLogstoreResponse> {
    Util.validateModel(request);
    return $tea.cast<GetSlsLogstoreResponse>(await this.doRequest("1.0", "antcloud.cas.sls.logstore.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetSlsLogstoreResponse({}));
  }

  /**
   * Description: 阿里云日志服务(SLS)-创建日志配置
   * Summary: 创建日志配置
   */
  async createSlsConfig(request: CreateSlsConfigRequest): Promise<CreateSlsConfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSlsConfigEx(request, headers, runtime);
  }

  /**
   * Description: 阿里云日志服务(SLS)-创建日志配置
   * Summary: 创建日志配置
   */
  async createSlsConfigEx(request: CreateSlsConfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSlsConfigResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSlsConfigResponse>(await this.doRequest("1.0", "antcloud.cas.sls.config.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSlsConfigResponse({}));
  }

  /**
   * Description: 阿里云日志服务(SLS)-获取日志配置列表
   * Summary: 获取日志配置列表
   */
  async listSlsConfig(request: ListSlsConfigRequest): Promise<ListSlsConfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSlsConfigEx(request, headers, runtime);
  }

  /**
   * Description: 阿里云日志服务(SLS)-获取日志配置列表
   * Summary: 获取日志配置列表
   */
  async listSlsConfigEx(request: ListSlsConfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSlsConfigResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSlsConfigResponse>(await this.doRequest("1.0", "antcloud.cas.sls.config.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSlsConfigResponse({}));
  }

  /**
   * Description: 阿里云日志服务(SLS)-更新日志配置
   * Summary: 更新日志配置
   */
  async updateSlsConfig(request: UpdateSlsConfigRequest): Promise<UpdateSlsConfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSlsConfigEx(request, headers, runtime);
  }

  /**
   * Description: 阿里云日志服务(SLS)-更新日志配置
   * Summary: 更新日志配置
   */
  async updateSlsConfigEx(request: UpdateSlsConfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSlsConfigResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSlsConfigResponse>(await this.doRequest("1.0", "antcloud.cas.sls.config.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSlsConfigResponse({}));
  }

  /**
   * Description: 阿里云日志服务(SLS)-删除日志配置
   * Summary: 删除日志配置
   */
  async deleteSlsConfig(request: DeleteSlsConfigRequest): Promise<DeleteSlsConfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSlsConfigEx(request, headers, runtime);
  }

  /**
   * Description: 阿里云日志服务(SLS)-删除日志配置
   * Summary: 删除日志配置
   */
  async deleteSlsConfigEx(request: DeleteSlsConfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSlsConfigResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSlsConfigResponse>(await this.doRequest("1.0", "antcloud.cas.sls.config.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSlsConfigResponse({}));
  }

  /**
   * Description: 阿里云日志服务(SLS) - 查询日志
   * Summary: 查询日志
   */
  async querySlsLog(request: QuerySlsLogRequest): Promise<QuerySlsLogResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySlsLogEx(request, headers, runtime);
  }

  /**
   * Description: 阿里云日志服务(SLS) - 查询日志
   * Summary: 查询日志
   */
  async querySlsLogEx(request: QuerySlsLogRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySlsLogResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySlsLogResponse>(await this.doRequest("1.0", "antcloud.cas.sls.log.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySlsLogResponse({}));
  }

  /**
   * Description: 批量添加安全组入规则
   * Summary: 批量添加安全组规则
   */
  async batchcreateResourceIngressrules(request: BatchcreateResourceIngressrulesRequest): Promise<BatchcreateResourceIngressrulesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateResourceIngressrulesEx(request, headers, runtime);
  }

  /**
   * Description: 批量添加安全组入规则
   * Summary: 批量添加安全组规则
   */
  async batchcreateResourceIngressrulesEx(request: BatchcreateResourceIngressrulesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateResourceIngressrulesResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateResourceIngressrulesResponse>(await this.doRequest("1.0", "antcloud.cas.resource.ingressrules.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateResourceIngressrulesResponse({}));
  }

  /**
   * Description: 批量添加安全组出方向规则
   * Summary: 批量添加安全组出方向规则
   */
  async batchcreateResourceEgressrules(request: BatchcreateResourceEgressrulesRequest): Promise<BatchcreateResourceEgressrulesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateResourceEgressrulesEx(request, headers, runtime);
  }

  /**
   * Description: 批量添加安全组出方向规则
   * Summary: 批量添加安全组出方向规则
   */
  async batchcreateResourceEgressrulesEx(request: BatchcreateResourceEgressrulesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateResourceEgressrulesResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateResourceEgressrulesResponse>(await this.doRequest("1.0", "antcloud.cas.resource.egressrules.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateResourceEgressrulesResponse({}));
  }

  /**
   * Description: loadbalance查询
   * Summary: loadbalance查询
   */
  async queryLoadbalance(request: QueryLoadbalanceRequest): Promise<QueryLoadbalanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLoadbalanceEx(request, headers, runtime);
  }

  /**
   * Description: loadbalance查询
   * Summary: loadbalance查询
   */
  async queryLoadbalanceEx(request: QueryLoadbalanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLoadbalanceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLoadbalanceResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLoadbalanceResponse({}));
  }

  /**
   * Description: 获取单个LB的健康状态
   * Summary: 获取单个LB的健康状态
   */
  async getLoadbalanceHealth(request: GetLoadbalanceHealthRequest): Promise<GetLoadbalanceHealthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getLoadbalanceHealthEx(request, headers, runtime);
  }

  /**
   * Description: 获取单个LB的健康状态
   * Summary: 获取单个LB的健康状态
   */
  async getLoadbalanceHealthEx(request: GetLoadbalanceHealthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetLoadbalanceHealthResponse> {
    Util.validateModel(request);
    return $tea.cast<GetLoadbalanceHealthResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.health.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetLoadbalanceHealthResponse({}));
  }

  /**
   * Description: 获取所有的vip类型
   * Summary: 获取所有的vip类型
   */
  async allLoadbalanceViptype(request: AllLoadbalanceViptypeRequest): Promise<AllLoadbalanceViptypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allLoadbalanceViptypeEx(request, headers, runtime);
  }

  /**
   * Description: 获取所有的vip类型
   * Summary: 获取所有的vip类型
   */
  async allLoadbalanceViptypeEx(request: AllLoadbalanceViptypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllLoadbalanceViptypeResponse> {
    Util.validateModel(request);
    return $tea.cast<AllLoadbalanceViptypeResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.viptype.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllLoadbalanceViptypeResponse({}));
  }

  /**
   * Description: 获取所有的LB集群
   * Summary: 获取所有的LB集群
   */
  async allLoadbalanceCluster(request: AllLoadbalanceClusterRequest): Promise<AllLoadbalanceClusterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allLoadbalanceClusterEx(request, headers, runtime);
  }

  /**
   * Description: 获取所有的LB集群
   * Summary: 获取所有的LB集群
   */
  async allLoadbalanceClusterEx(request: AllLoadbalanceClusterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllLoadbalanceClusterResponse> {
    Util.validateModel(request);
    return $tea.cast<AllLoadbalanceClusterResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.cluster.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllLoadbalanceClusterResponse({}));
  }

  /**
   * Description: 查询vpc详细信息
   * Summary: 查询vpc详细信息
   */
  async queryVpc(request: QueryVpcRequest): Promise<QueryVpcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryVpcEx(request, headers, runtime);
  }

  /**
   * Description: 查询vpc详细信息
   * Summary: 查询vpc详细信息
   */
  async queryVpcEx(request: QueryVpcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryVpcResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryVpcResponse>(await this.doRequest("1.0", "antcloud.cas.vpc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryVpcResponse({}));
  }

  /**
   * Description: 查询已导入workspace的vpc
   * Summary: 查询已导入workspace的vpc
   */
  async listVpcImport(request: ListVpcImportRequest): Promise<ListVpcImportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listVpcImportEx(request, headers, runtime);
  }

  /**
   * Description: 查询已导入workspace的vpc
   * Summary: 查询已导入workspace的vpc
   */
  async listVpcImportEx(request: ListVpcImportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListVpcImportResponse> {
    Util.validateModel(request);
    return $tea.cast<ListVpcImportResponse>(await this.doRequest("1.0", "antcloud.cas.vpc.import.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListVpcImportResponse({}));
  }

  /**
   * Description: 查询vpc cidrblock信息
   * Summary: 查询vpc cidrblock信息
   */
  async listVpcCidrblock(request: ListVpcCidrblockRequest): Promise<ListVpcCidrblockResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listVpcCidrblockEx(request, headers, runtime);
  }

  /**
   * Description: 查询vpc cidrblock信息
   * Summary: 查询vpc cidrblock信息
   */
  async listVpcCidrblockEx(request: ListVpcCidrblockRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListVpcCidrblockResponse> {
    Util.validateModel(request);
    return $tea.cast<ListVpcCidrblockResponse>(await this.doRequest("1.0", "antcloud.cas.vpc.cidrblock.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListVpcCidrblockResponse({}));
  }

  /**
   * Description: 查询交换机信息
   * Summary: 查询交换机信息
   */
  async queryVpcVswitch(request: QueryVpcVswitchRequest): Promise<QueryVpcVswitchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryVpcVswitchEx(request, headers, runtime);
  }

  /**
   * Description: 查询交换机信息
   * Summary: 查询交换机信息
   */
  async queryVpcVswitchEx(request: QueryVpcVswitchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryVpcVswitchResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryVpcVswitchResponse>(await this.doRequest("1.0", "antcloud.cas.vpc.vswitch.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryVpcVswitchResponse({}));
  }

  /**
   * Description: 查询路由表信息
   * Summary: 查询路由表信息
   */
  async queryVpcVroutertable(request: QueryVpcVroutertableRequest): Promise<QueryVpcVroutertableResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryVpcVroutertableEx(request, headers, runtime);
  }

  /**
   * Description: 查询路由表信息
   * Summary: 查询路由表信息
   */
  async queryVpcVroutertableEx(request: QueryVpcVroutertableRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryVpcVroutertableResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryVpcVroutertableResponse>(await this.doRequest("1.0", "antcloud.cas.vpc.vroutertable.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryVpcVroutertableResponse({}));
  }

  /**
   * Description: 获取单个rule
   * Summary: 获取单个rule
   */
  async getLoadbalanceRule(request: GetLoadbalanceRuleRequest): Promise<GetLoadbalanceRuleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getLoadbalanceRuleEx(request, headers, runtime);
  }

  /**
   * Description: 获取单个rule
   * Summary: 获取单个rule
   */
  async getLoadbalanceRuleEx(request: GetLoadbalanceRuleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetLoadbalanceRuleResponse> {
    Util.validateModel(request);
    return $tea.cast<GetLoadbalanceRuleResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.rule.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetLoadbalanceRuleResponse({}));
  }

  /**
   * Description: 批量查询Lb rule
   * Summary: 批量查询Lb rule
   */
  async queryLoadbalanceRule(request: QueryLoadbalanceRuleRequest): Promise<QueryLoadbalanceRuleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLoadbalanceRuleEx(request, headers, runtime);
  }

  /**
   * Description: 批量查询Lb rule
   * Summary: 批量查询Lb rule
   */
  async queryLoadbalanceRuleEx(request: QueryLoadbalanceRuleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLoadbalanceRuleResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLoadbalanceRuleResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.rule.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLoadbalanceRuleResponse({}));
  }

  /**
   * Description: 获取单个Lb ById
   * Summary: 获取单个Lb ById
   */
  async getLoadbalance(request: GetLoadbalanceRequest): Promise<GetLoadbalanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getLoadbalanceEx(request, headers, runtime);
  }

  /**
   * Description: 获取单个Lb ById
   * Summary: 获取单个Lb ById
   */
  async getLoadbalanceEx(request: GetLoadbalanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetLoadbalanceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetLoadbalanceResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetLoadbalanceResponse({}));
  }

  /**
   * Description: 获取LB后端所有主机
   * Summary: 获取LB后端所有主机
   */
  async allLoadbalanceMount(request: AllLoadbalanceMountRequest): Promise<AllLoadbalanceMountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allLoadbalanceMountEx(request, headers, runtime);
  }

  /**
   * Description: 获取LB后端所有主机
   * Summary: 获取LB后端所有主机
   */
  async allLoadbalanceMountEx(request: AllLoadbalanceMountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllLoadbalanceMountResponse> {
    Util.validateModel(request);
    return $tea.cast<AllLoadbalanceMountResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.mount.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllLoadbalanceMountResponse({}));
  }

  /**
   * Description: 根据条件查询后端的主机
   * Summary: 根据条件查询后端的主机
   */
  async queryLoadbalanceMount(request: QueryLoadbalanceMountRequest): Promise<QueryLoadbalanceMountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLoadbalanceMountEx(request, headers, runtime);
  }

  /**
   * Description: 根据条件查询后端的主机
   * Summary: 根据条件查询后端的主机
   */
  async queryLoadbalanceMountEx(request: QueryLoadbalanceMountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLoadbalanceMountResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLoadbalanceMountResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.mount.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLoadbalanceMountResponse({}));
  }

  /**
   * Description: 获取单个vcomputergroup
   * Summary: 获取单个vcomputergroup
   */
  async getLoadbalanceVcomputergroup(request: GetLoadbalanceVcomputergroupRequest): Promise<GetLoadbalanceVcomputergroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getLoadbalanceVcomputergroupEx(request, headers, runtime);
  }

  /**
   * Description: 获取单个vcomputergroup
   * Summary: 获取单个vcomputergroup
   */
  async getLoadbalanceVcomputergroupEx(request: GetLoadbalanceVcomputergroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetLoadbalanceVcomputergroupResponse> {
    Util.validateModel(request);
    return $tea.cast<GetLoadbalanceVcomputergroupResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.vcomputergroup.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetLoadbalanceVcomputergroupResponse({}));
  }

  /**
   * Description: 查询vcomputergroup
   * Summary: 查询vcomputergroup
   */
  async queryLoadbalanceVcomputergroup(request: QueryLoadbalanceVcomputergroupRequest): Promise<QueryLoadbalanceVcomputergroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLoadbalanceVcomputergroupEx(request, headers, runtime);
  }

  /**
   * Description: 查询vcomputergroup
   * Summary: 查询vcomputergroup
   */
  async queryLoadbalanceVcomputergroupEx(request: QueryLoadbalanceVcomputergroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLoadbalanceVcomputergroupResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLoadbalanceVcomputergroupResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.vcomputergroup.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLoadbalanceVcomputergroupResponse({}));
  }

  /**
   * Description: 获取所有vcomputergroup
   * Summary: 获取所有vcomputergroup
   */
  async allLoadbalanceVcomputergroup(request: AllLoadbalanceVcomputergroupRequest): Promise<AllLoadbalanceVcomputergroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allLoadbalanceVcomputergroupEx(request, headers, runtime);
  }

  /**
   * Description: 获取所有vcomputergroup
   * Summary: 获取所有vcomputergroup
   */
  async allLoadbalanceVcomputergroupEx(request: AllLoadbalanceVcomputergroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllLoadbalanceVcomputergroupResponse> {
    Util.validateModel(request);
    return $tea.cast<AllLoadbalanceVcomputergroupResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.vcomputergroup.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllLoadbalanceVcomputergroupResponse({}));
  }

  /**
   * Description: 获取vcomputer
   * Summary: 获取vcomputer
   */
  async queryLoadbalanceVcomputer(request: QueryLoadbalanceVcomputerRequest): Promise<QueryLoadbalanceVcomputerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLoadbalanceVcomputerEx(request, headers, runtime);
  }

  /**
   * Description: 获取vcomputer
   * Summary: 获取vcomputer
   */
  async queryLoadbalanceVcomputerEx(request: QueryLoadbalanceVcomputerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLoadbalanceVcomputerResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLoadbalanceVcomputerResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.vcomputer.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLoadbalanceVcomputerResponse({}));
  }

  /**
   * Description: 查询listener
   * Summary: 查询listener
   */
  async queryLoadbalanceListener(request: QueryLoadbalanceListenerRequest): Promise<QueryLoadbalanceListenerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLoadbalanceListenerEx(request, headers, runtime);
  }

  /**
   * Description: 查询listener
   * Summary: 查询listener
   */
  async queryLoadbalanceListenerEx(request: QueryLoadbalanceListenerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLoadbalanceListenerResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLoadbalanceListenerResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.listener.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLoadbalanceListenerResponse({}));
  }

  /**
   * Description: 获取所有listener
   * Summary: 获取所有listener
   */
  async allLoadbalanceListener(request: AllLoadbalanceListenerRequest): Promise<AllLoadbalanceListenerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allLoadbalanceListenerEx(request, headers, runtime);
  }

  /**
   * Description: 获取所有listener
   * Summary: 获取所有listener
   */
  async allLoadbalanceListenerEx(request: AllLoadbalanceListenerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllLoadbalanceListenerResponse> {
    Util.validateModel(request);
    return $tea.cast<AllLoadbalanceListenerResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.listener.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllLoadbalanceListenerResponse({}));
  }

  /**
   * Description: 查询securityip
   * Summary: 查询securityip
   */
  async queryLoadbalanceSecurityip(request: QueryLoadbalanceSecurityipRequest): Promise<QueryLoadbalanceSecurityipResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLoadbalanceSecurityipEx(request, headers, runtime);
  }

  /**
   * Description: 查询securityip
   * Summary: 查询securityip
   */
  async queryLoadbalanceSecurityipEx(request: QueryLoadbalanceSecurityipRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLoadbalanceSecurityipResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLoadbalanceSecurityipResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.securityip.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLoadbalanceSecurityipResponse({}));
  }

  /**
   * Description: 获取单个database
   * Summary: 获取单个database
   */
  async getDatabase(request: GetDatabaseRequest): Promise<GetDatabaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDatabaseEx(request, headers, runtime);
  }

  /**
   * Description: 获取单个database
   * Summary: 获取单个database
   */
  async getDatabaseEx(request: GetDatabaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDatabaseResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDatabaseResponse>(await this.doRequest("1.0", "antcloud.cas.database.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDatabaseResponse({}));
  }

  /**
   * Description: 获取所有masterzone
   * Summary: 获取所有masterzone
   */
  async allDatabaseMasterzone(request: AllDatabaseMasterzoneRequest): Promise<AllDatabaseMasterzoneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allDatabaseMasterzoneEx(request, headers, runtime);
  }

  /**
   * Description: 获取所有masterzone
   * Summary: 获取所有masterzone
   */
  async allDatabaseMasterzoneEx(request: AllDatabaseMasterzoneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllDatabaseMasterzoneResponse> {
    Util.validateModel(request);
    return $tea.cast<AllDatabaseMasterzoneResponse>(await this.doRequest("1.0", "antcloud.cas.database.masterzone.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllDatabaseMasterzoneResponse({}));
  }

  /**
   * Description: 查询数据库
   * Summary: 查询数据库
   */
  async queryDatabase(request: QueryDatabaseRequest): Promise<QueryDatabaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDatabaseEx(request, headers, runtime);
  }

  /**
   * Description: 查询数据库
   * Summary: 查询数据库
   */
  async queryDatabaseEx(request: QueryDatabaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDatabaseResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDatabaseResponse>(await this.doRequest("1.0", "antcloud.cas.database.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDatabaseResponse({}));
  }

  /**
   * Description: 查询数据库规格
   * Summary: 查询数据库规格
   */
  async queryDatabaseSpec(request: QueryDatabaseSpecRequest): Promise<QueryDatabaseSpecResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDatabaseSpecEx(request, headers, runtime);
  }

  /**
   * Description: 查询数据库规格
   * Summary: 查询数据库规格
   */
  async queryDatabaseSpecEx(request: QueryDatabaseSpecRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDatabaseSpecResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDatabaseSpecResponse>(await this.doRequest("1.0", "antcloud.cas.database.spec.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDatabaseSpecResponse({}));
  }

  /**
   * Description: 查询数据引擎
   * Summary: 查询数据引擎
   */
  async allDatabaseEngine(request: AllDatabaseEngineRequest): Promise<AllDatabaseEngineResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allDatabaseEngineEx(request, headers, runtime);
  }

  /**
   * Description: 查询数据引擎
   * Summary: 查询数据引擎
   */
  async allDatabaseEngineEx(request: AllDatabaseEngineRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllDatabaseEngineResponse> {
    Util.validateModel(request);
    return $tea.cast<AllDatabaseEngineResponse>(await this.doRequest("1.0", "antcloud.cas.database.engine.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllDatabaseEngineResponse({}));
  }

  /**
   * Description: 查询数据库quota
   * Summary: 查询数据库quota
   */
  async allDatabaseQuota(request: AllDatabaseQuotaRequest): Promise<AllDatabaseQuotaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allDatabaseQuotaEx(request, headers, runtime);
  }

  /**
   * Description: 查询数据库quota
   * Summary: 查询数据库quota
   */
  async allDatabaseQuotaEx(request: AllDatabaseQuotaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllDatabaseQuotaResponse> {
    Util.validateModel(request);
    return $tea.cast<AllDatabaseQuotaResponse>(await this.doRequest("1.0", "antcloud.cas.database.quota.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllDatabaseQuotaResponse({}));
  }

  /**
   * Description: 查询数据库所有securityip
   * Summary: 查询数据库所有securityip
   */
  async allDatabaseSecurityip(request: AllDatabaseSecurityipRequest): Promise<AllDatabaseSecurityipResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allDatabaseSecurityipEx(request, headers, runtime);
  }

  /**
   * Description: 查询数据库所有securityip
   * Summary: 查询数据库所有securityip
   */
  async allDatabaseSecurityipEx(request: AllDatabaseSecurityipRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllDatabaseSecurityipResponse> {
    Util.validateModel(request);
    return $tea.cast<AllDatabaseSecurityipResponse>(await this.doRequest("1.0", "antcloud.cas.database.securityip.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllDatabaseSecurityipResponse({}));
  }

  /**
   * Description: ！！！！不要用，typo
   * Summary: ！！！！不要用，typo
   */
  async queryDatabaseScheme(request: QueryDatabaseSchemeRequest): Promise<QueryDatabaseSchemeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDatabaseSchemeEx(request, headers, runtime);
  }

  /**
   * Description: ！！！！不要用，typo
   * Summary: ！！！！不要用，typo
   */
  async queryDatabaseSchemeEx(request: QueryDatabaseSchemeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDatabaseSchemeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDatabaseSchemeResponse>(await this.doRequest("1.0", "antcloud.cas.database.scheme.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDatabaseSchemeResponse({}));
  }

  /**
   * Description: 获取数据库导入记录
   * Summary: 获取数据库导入记录
   */
  async allDatabaseImport(request: AllDatabaseImportRequest): Promise<AllDatabaseImportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allDatabaseImportEx(request, headers, runtime);
  }

  /**
   * Description: 获取数据库导入记录
   * Summary: 获取数据库导入记录
   */
  async allDatabaseImportEx(request: AllDatabaseImportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllDatabaseImportResponse> {
    Util.validateModel(request);
    return $tea.cast<AllDatabaseImportResponse>(await this.doRequest("1.0", "antcloud.cas.database.import.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllDatabaseImportResponse({}));
  }

  /**
   * Description: 查询computer agent状态
   * Summary: 查询computer agent状态
   */
  async queryComputerAgentstatus(request: QueryComputerAgentstatusRequest): Promise<QueryComputerAgentstatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryComputerAgentstatusEx(request, headers, runtime);
  }

  /**
   * Description: 查询computer agent状态
   * Summary: 查询computer agent状态
   */
  async queryComputerAgentstatusEx(request: QueryComputerAgentstatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryComputerAgentstatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryComputerAgentstatusResponse>(await this.doRequest("1.0", "antcloud.cas.computer.agentstatus.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryComputerAgentstatusResponse({}));
  }

  /**
   * Description: 查询computer staragent 启动命令
   * Summary: 查询 staragent 启动命令
   */
  async queryComputerAgentsetupcommand(request: QueryComputerAgentsetupcommandRequest): Promise<QueryComputerAgentsetupcommandResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryComputerAgentsetupcommandEx(request, headers, runtime);
  }

  /**
   * Description: 查询computer staragent 启动命令
   * Summary: 查询 staragent 启动命令
   */
  async queryComputerAgentsetupcommandEx(request: QueryComputerAgentsetupcommandRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryComputerAgentsetupcommandResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryComputerAgentsetupcommandResponse>(await this.doRequest("1.0", "antcloud.cas.computer.agentsetupcommand.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryComputerAgentsetupcommandResponse({}));
  }

  /**
   * Description: 查询已导入的computer信息
   * Summary: 查询已导入的computer信息
   */
  async queryComputerImport(request: QueryComputerImportRequest): Promise<QueryComputerImportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryComputerImportEx(request, headers, runtime);
  }

  /**
   * Description: 查询已导入的computer信息
   * Summary: 查询已导入的computer信息
   */
  async queryComputerImportEx(request: QueryComputerImportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryComputerImportResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryComputerImportResponse>(await this.doRequest("1.0", "antcloud.cas.computer.import.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryComputerImportResponse({}));
  }

  /**
   * Description: list computers
   * Summary: list computers
   */
  async listComputer(request: ListComputerRequest): Promise<ListComputerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listComputerEx(request, headers, runtime);
  }

  /**
   * Description: list computers
   * Summary: list computers
   */
  async listComputerEx(request: ListComputerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListComputerResponse> {
    Util.validateModel(request);
    return $tea.cast<ListComputerResponse>(await this.doRequest("1.0", "antcloud.cas.computer.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListComputerResponse({}));
  }

  /**
   * Description: query computer specs
   * Summary: query computer specs
   */
  async queryComputerSpec(request: QueryComputerSpecRequest): Promise<QueryComputerSpecResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryComputerSpecEx(request, headers, runtime);
  }

  /**
   * Description: query computer specs
   * Summary: query computer specs
   */
  async queryComputerSpecEx(request: QueryComputerSpecRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryComputerSpecResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryComputerSpecResponse>(await this.doRequest("1.0", "antcloud.cas.computer.spec.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryComputerSpecResponse({}));
  }

  /**
   * Description: query computer common image
   * Summary: query common image
   */
  async queryComputerCommonimage(request: QueryComputerCommonimageRequest): Promise<QueryComputerCommonimageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryComputerCommonimageEx(request, headers, runtime);
  }

  /**
   * Description: query computer common image
   * Summary: query common image
   */
  async queryComputerCommonimageEx(request: QueryComputerCommonimageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryComputerCommonimageResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryComputerCommonimageResponse>(await this.doRequest("1.0", "antcloud.cas.computer.commonimage.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryComputerCommonimageResponse({}));
  }

  /**
   * Description: 获取所有loadbalance
   * Summary: 获取所有loadbalance
   */
  async allLoadbalance(request: AllLoadbalanceRequest): Promise<AllLoadbalanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allLoadbalanceEx(request, headers, runtime);
  }

  /**
   * Description: 获取所有loadbalance
   * Summary: 获取所有loadbalance
   */
  async allLoadbalanceEx(request: AllLoadbalanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllLoadbalanceResponse> {
    Util.validateModel(request);
    return $tea.cast<AllLoadbalanceResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllLoadbalanceResponse({}));
  }

  /**
   * Description: 查询导入信息
   * Summary: 查询导入信息
   */
  async queryLoadbalanceImport(request: QueryLoadbalanceImportRequest): Promise<QueryLoadbalanceImportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLoadbalanceImportEx(request, headers, runtime);
  }

  /**
   * Description: 查询导入信息
   * Summary: 查询导入信息
   */
  async queryLoadbalanceImportEx(request: QueryLoadbalanceImportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLoadbalanceImportResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLoadbalanceImportResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.import.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLoadbalanceImportResponse({}));
  }

  /**
   * Description: 查询数据库导入记录
   * Summary: 查询数据库导入记录
   */
  async queryDatabaseImport(request: QueryDatabaseImportRequest): Promise<QueryDatabaseImportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDatabaseImportEx(request, headers, runtime);
  }

  /**
   * Description: 查询数据库导入记录
   * Summary: 查询数据库导入记录
   */
  async queryDatabaseImportEx(request: QueryDatabaseImportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDatabaseImportResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDatabaseImportResponse>(await this.doRequest("1.0", "antcloud.cas.database.import.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDatabaseImportResponse({}));
  }

  /**
   * Description: 查询masterzone
   * Summary: 查询masterzone
   */
  async queryDatabaseMasterzone(request: QueryDatabaseMasterzoneRequest): Promise<QueryDatabaseMasterzoneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDatabaseMasterzoneEx(request, headers, runtime);
  }

  /**
   * Description: 查询masterzone
   * Summary: 查询masterzone
   */
  async queryDatabaseMasterzoneEx(request: QueryDatabaseMasterzoneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDatabaseMasterzoneResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDatabaseMasterzoneResponse>(await this.doRequest("1.0", "antcloud.cas.database.masterzone.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDatabaseMasterzoneResponse({}));
  }

  /**
   * Description: 查询数据库额度
   * Summary: 查询数据库额度
   */
  async queryDatabaseQuota(request: QueryDatabaseQuotaRequest): Promise<QueryDatabaseQuotaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDatabaseQuotaEx(request, headers, runtime);
  }

  /**
   * Description: 查询数据库额度
   * Summary: 查询数据库额度
   */
  async queryDatabaseQuotaEx(request: QueryDatabaseQuotaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDatabaseQuotaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDatabaseQuotaResponse>(await this.doRequest("1.0", "antcloud.cas.database.quota.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDatabaseQuotaResponse({}));
  }

  /**
   * Description: 查询securityip
   * Summary: 查询securityip
   */
  async queryDatabaseSecurityip(request: QueryDatabaseSecurityipRequest): Promise<QueryDatabaseSecurityipResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDatabaseSecurityipEx(request, headers, runtime);
  }

  /**
   * Description: 查询securityip
   * Summary: 查询securityip
   */
  async queryDatabaseSecurityipEx(request: QueryDatabaseSecurityipRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDatabaseSecurityipResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDatabaseSecurityipResponse>(await this.doRequest("1.0", "antcloud.cas.database.securityip.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDatabaseSecurityipResponse({}));
  }

  /**
   * Description: 查询当前数据库的schema
   * Summary: 查询当前数据库的schema
   */
  async queryDatabaseSchema(request: QueryDatabaseSchemaRequest): Promise<QueryDatabaseSchemaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDatabaseSchemaEx(request, headers, runtime);
  }

  /**
   * Description: 查询当前数据库的schema
   * Summary: 查询当前数据库的schema
   */
  async queryDatabaseSchemaEx(request: QueryDatabaseSchemaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDatabaseSchemaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDatabaseSchemaResponse>(await this.doRequest("1.0", "antcloud.cas.database.schema.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDatabaseSchemaResponse({}));
  }

  /**
   * Description: 查询数据库的账号
   * Summary: 查询数据库的账号
   */
  async queryDatabaseAccount(request: QueryDatabaseAccountRequest): Promise<QueryDatabaseAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDatabaseAccountEx(request, headers, runtime);
  }

  /**
   * Description: 查询数据库的账号
   * Summary: 查询数据库的账号
   */
  async queryDatabaseAccountEx(request: QueryDatabaseAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDatabaseAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDatabaseAccountResponse>(await this.doRequest("1.0", "antcloud.cas.database.account.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDatabaseAccountResponse({}));
  }

  /**
   * Description: 查询workspace
   * Summary: 查询workspace
   */
  async getWorkspace(request: GetWorkspaceRequest): Promise<GetWorkspaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getWorkspaceEx(request, headers, runtime);
  }

  /**
   * Description: 查询workspace
   * Summary: 查询workspace
   */
  async getWorkspaceEx(request: GetWorkspaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetWorkspaceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetWorkspaceResponse>(await this.doRequest("1.0", "antcloud.cas.workspace.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetWorkspaceResponse({}));
  }

  /**
   * Description: 查询region
   * Summary: 查询region
   */
  async listRegion(request: ListRegionRequest): Promise<ListRegionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listRegionEx(request, headers, runtime);
  }

  /**
   * Description: 查询region
   * Summary: 查询region
   */
  async listRegionEx(request: ListRegionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListRegionResponse> {
    Util.validateModel(request);
    return $tea.cast<ListRegionResponse>(await this.doRequest("1.0", "antcloud.cas.region.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListRegionResponse({}));
  }

  /**
   * Description: 租户可用region
   * Summary: 租户可用region
   */
  async listRegionAccessible(request: ListRegionAccessibleRequest): Promise<ListRegionAccessibleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listRegionAccessibleEx(request, headers, runtime);
  }

  /**
   * Description: 租户可用region
   * Summary: 租户可用region
   */
  async listRegionAccessibleEx(request: ListRegionAccessibleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListRegionAccessibleResponse> {
    Util.validateModel(request);
    return $tea.cast<ListRegionAccessibleResponse>(await this.doRequest("1.0", "antcloud.cas.region.accessible.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListRegionAccessibleResponse({}));
  }

  /**
   * Description: 更新基本信息
   * Summary: 更新基本信息
   */
  async updateDatabaseInfo(request: UpdateDatabaseInfoRequest): Promise<UpdateDatabaseInfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateDatabaseInfoEx(request, headers, runtime);
  }

  /**
   * Description: 更新基本信息
   * Summary: 更新基本信息
   */
  async updateDatabaseInfoEx(request: UpdateDatabaseInfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateDatabaseInfoResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDatabaseInfoResponse>(await this.doRequest("1.0", "antcloud.cas.database.info.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateDatabaseInfoResponse({}));
  }

  /**
   * Description: 把数据库分配给应用
   * Summary: 把数据库分配给应用
   */
  async setDatabaseAssign(request: SetDatabaseAssignRequest): Promise<SetDatabaseAssignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setDatabaseAssignEx(request, headers, runtime);
  }

  /**
   * Description: 把数据库分配给应用
   * Summary: 把数据库分配给应用
   */
  async setDatabaseAssignEx(request: SetDatabaseAssignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetDatabaseAssignResponse> {
    Util.validateModel(request);
    return $tea.cast<SetDatabaseAssignResponse>(await this.doRequest("1.0", "antcloud.cas.database.assign.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetDatabaseAssignResponse({}));
  }

  /**
   * Description: 共享数据库给其他workspace
   * Summary: 共享数据库给其他workspace
   */
  async setDatabaseShare(request: SetDatabaseShareRequest): Promise<SetDatabaseShareResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setDatabaseShareEx(request, headers, runtime);
  }

  /**
   * Description: 共享数据库给其他workspace
   * Summary: 共享数据库给其他workspace
   */
  async setDatabaseShareEx(request: SetDatabaseShareRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetDatabaseShareResponse> {
    Util.validateModel(request);
    return $tea.cast<SetDatabaseShareResponse>(await this.doRequest("1.0", "antcloud.cas.database.share.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetDatabaseShareResponse({}));
  }

  /**
   * Description: 重启数据库
   * Summary: 重启数据库
   */
  async rebootDatabase(request: RebootDatabaseRequest): Promise<RebootDatabaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.rebootDatabaseEx(request, headers, runtime);
  }

  /**
   * Description: 重启数据库
   * Summary: 重启数据库
   */
  async rebootDatabaseEx(request: RebootDatabaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RebootDatabaseResponse> {
    Util.validateModel(request);
    return $tea.cast<RebootDatabaseResponse>(await this.doRequest("1.0", "antcloud.cas.database.reboot", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RebootDatabaseResponse({}));
  }

  /**
   * Description: 更新账户信息
   * Summary: 更新账户信息
   */
  async updateDatabaseAccount(request: UpdateDatabaseAccountRequest): Promise<UpdateDatabaseAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateDatabaseAccountEx(request, headers, runtime);
  }

  /**
   * Description: 更新账户信息
   * Summary: 更新账户信息
   */
  async updateDatabaseAccountEx(request: UpdateDatabaseAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateDatabaseAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDatabaseAccountResponse>(await this.doRequest("1.0", "antcloud.cas.database.account.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateDatabaseAccountResponse({}));
  }

  /**
   * Description: 重设databaseaccount密码
   * Summary: 重设databaseaccount密码
   */
  async setDatabaseAccountpassword(request: SetDatabaseAccountpasswordRequest): Promise<SetDatabaseAccountpasswordResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setDatabaseAccountpasswordEx(request, headers, runtime);
  }

  /**
   * Description: 重设databaseaccount密码
   * Summary: 重设databaseaccount密码
   */
  async setDatabaseAccountpasswordEx(request: SetDatabaseAccountpasswordRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetDatabaseAccountpasswordResponse> {
    Util.validateModel(request);
    return $tea.cast<SetDatabaseAccountpasswordResponse>(await this.doRequest("1.0", "antcloud.cas.database.accountpassword.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetDatabaseAccountpasswordResponse({}));
  }

  /**
   * Description: 数据库账户授权schema
   * Summary: 数据库账户授权schema
   */
  async authDatabaseAccount(request: AuthDatabaseAccountRequest): Promise<AuthDatabaseAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authDatabaseAccountEx(request, headers, runtime);
  }

  /**
   * Description: 数据库账户授权schema
   * Summary: 数据库账户授权schema
   */
  async authDatabaseAccountEx(request: AuthDatabaseAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthDatabaseAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthDatabaseAccountResponse>(await this.doRequest("1.0", "antcloud.cas.database.account.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthDatabaseAccountResponse({}));
  }

  /**
   * Description: 查询tenantRegion
   * Summary: 查询tenantRegion
   */
  async getRegionTenant(request: GetRegionTenantRequest): Promise<GetRegionTenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getRegionTenantEx(request, headers, runtime);
  }

  /**
   * Description: 查询tenantRegion
   * Summary: 查询tenantRegion
   */
  async getRegionTenantEx(request: GetRegionTenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetRegionTenantResponse> {
    Util.validateModel(request);
    return $tea.cast<GetRegionTenantResponse>(await this.doRequest("1.0", "antcloud.cas.region.tenant.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetRegionTenantResponse({}));
  }

  /**
   * Description: getRegionAliasById
   * Summary: getRegionAliasById
   */
  async getRegionAliasbyid(request: GetRegionAliasbyidRequest): Promise<GetRegionAliasbyidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getRegionAliasbyidEx(request, headers, runtime);
  }

  /**
   * Description: getRegionAliasById
   * Summary: getRegionAliasById
   */
  async getRegionAliasbyidEx(request: GetRegionAliasbyidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetRegionAliasbyidResponse> {
    Util.validateModel(request);
    return $tea.cast<GetRegionAliasbyidResponse>(await this.doRequest("1.0", "antcloud.cas.region.aliasbyid.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetRegionAliasbyidResponse({}));
  }

  /**
   * Description: 查询disk信息
   * Summary: 查询disk信息
   */
  async queryDisk(request: QueryDiskRequest): Promise<QueryDiskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDiskEx(request, headers, runtime);
  }

  /**
   * Description: 查询disk信息
   * Summary: 查询disk信息
   */
  async queryDiskEx(request: QueryDiskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDiskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDiskResponse>(await this.doRequest("1.0", "antcloud.cas.disk.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDiskResponse({}));
  }

  /**
   * Description: 查询computer image信息
   * Summary: 查询computer image信息
   */
  async queryImage(request: QueryImageRequest): Promise<QueryImageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryImageEx(request, headers, runtime);
  }

  /**
   * Description: 查询computer image信息
   * Summary: 查询computer image信息
   */
  async queryImageEx(request: QueryImageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryImageResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryImageResponse>(await this.doRequest("1.0", "antcloud.cas.image.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryImageResponse({}));
  }

  /**
   * Description: 创建数据库schema
   * Summary: 创建数据库schema
   */
  async createDatabaseSchema(request: CreateDatabaseSchemaRequest): Promise<CreateDatabaseSchemaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDatabaseSchemaEx(request, headers, runtime);
  }

  /**
   * Description: 创建数据库schema
   * Summary: 创建数据库schema
   */
  async createDatabaseSchemaEx(request: CreateDatabaseSchemaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDatabaseSchemaResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDatabaseSchemaResponse>(await this.doRequest("1.0", "antcloud.cas.database.schema.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDatabaseSchemaResponse({}));
  }

  /**
   * Description: LB挂载后端主机
   * Summary: LB挂载后端主机
   */
  async createLoadbalanceMount(request: CreateLoadbalanceMountRequest): Promise<CreateLoadbalanceMountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLoadbalanceMountEx(request, headers, runtime);
  }

  /**
   * Description: LB挂载后端主机
   * Summary: LB挂载后端主机
   */
  async createLoadbalanceMountEx(request: CreateLoadbalanceMountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLoadbalanceMountResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLoadbalanceMountResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.mount.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLoadbalanceMountResponse({}));
  }

  /**
   * Description: 创建监听器
   * Summary: 创建监听器
   */
  async createLoadbalanceListener(request: CreateLoadbalanceListenerRequest): Promise<CreateLoadbalanceListenerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLoadbalanceListenerEx(request, headers, runtime);
  }

  /**
   * Description: 创建监听器
   * Summary: 创建监听器
   */
  async createLoadbalanceListenerEx(request: CreateLoadbalanceListenerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLoadbalanceListenerResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLoadbalanceListenerResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.listener.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLoadbalanceListenerResponse({}));
  }

  /**
   * Description: 停止监听器
   * Summary: 停止监听器
   */
  async stopLoadbalanceListener(request: StopLoadbalanceListenerRequest): Promise<StopLoadbalanceListenerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.stopLoadbalanceListenerEx(request, headers, runtime);
  }

  /**
   * Description: 停止监听器
   * Summary: 停止监听器
   */
  async stopLoadbalanceListenerEx(request: StopLoadbalanceListenerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StopLoadbalanceListenerResponse> {
    Util.validateModel(request);
    return $tea.cast<StopLoadbalanceListenerResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.listener.stop", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StopLoadbalanceListenerResponse({}));
  }

  /**
   * Description: 启动lb
   * Summary: 启动lb
   */
  async startLoadbalanceListener(request: StartLoadbalanceListenerRequest): Promise<StartLoadbalanceListenerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startLoadbalanceListenerEx(request, headers, runtime);
  }

  /**
   * Description: 启动lb
   * Summary: 启动lb
   */
  async startLoadbalanceListenerEx(request: StartLoadbalanceListenerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartLoadbalanceListenerResponse> {
    Util.validateModel(request);
    return $tea.cast<StartLoadbalanceListenerResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.listener.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartLoadbalanceListenerResponse({}));
  }

  /**
   * Description: 更新listener配置
   * Summary: 更新listener配置
   */
  async updateLoadbalanceListener(request: UpdateLoadbalanceListenerRequest): Promise<UpdateLoadbalanceListenerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateLoadbalanceListenerEx(request, headers, runtime);
  }

  /**
   * Description: 更新listener配置
   * Summary: 更新listener配置
   */
  async updateLoadbalanceListenerEx(request: UpdateLoadbalanceListenerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateLoadbalanceListenerResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateLoadbalanceListenerResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.listener.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateLoadbalanceListenerResponse({}));
  }

  /**
   * Description: 查询disk spec信息
   * Summary: 查询disk spec信息
   */
  async queryDiskspec(request: QueryDiskspecRequest): Promise<QueryDiskspecResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDiskspecEx(request, headers, runtime);
  }

  /**
   * Description: 查询disk spec信息
   * Summary: 查询disk spec信息
   */
  async queryDiskspecEx(request: QueryDiskspecRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDiskspecResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDiskspecResponse>(await this.doRequest("1.0", "antcloud.cas.diskspec.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDiskspecResponse({}));
  }

  /**
   * Description: 查询computer quota
   * Summary: 查询computer quota
   */
  async queryComputerquota(request: QueryComputerquotaRequest): Promise<QueryComputerquotaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryComputerquotaEx(request, headers, runtime);
  }

  /**
   * Description: 查询computer quota
   * Summary: 查询computer quota
   */
  async queryComputerquotaEx(request: QueryComputerquotaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryComputerquotaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryComputerquotaResponse>(await this.doRequest("1.0", "antcloud.cas.computerquota.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryComputerquotaResponse({}));
  }

  /**
   * Description: 停止computer
   * Summary: 停止computer
   */
  async stopComputer(request: StopComputerRequest): Promise<StopComputerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.stopComputerEx(request, headers, runtime);
  }

  /**
   * Description: 停止computer
   * Summary: 停止computer
   */
  async stopComputerEx(request: StopComputerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StopComputerResponse> {
    Util.validateModel(request);
    return $tea.cast<StopComputerResponse>(await this.doRequest("1.0", "antcloud.cas.computer.stop", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StopComputerResponse({}));
  }

  /**
   * Description: 重启computer
   * Summary: 重启computer
   */
  async rebootComputer(request: RebootComputerRequest): Promise<RebootComputerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.rebootComputerEx(request, headers, runtime);
  }

  /**
   * Description: 重启computer
   * Summary: 重启computer
   */
  async rebootComputerEx(request: RebootComputerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RebootComputerResponse> {
    Util.validateModel(request);
    return $tea.cast<RebootComputerResponse>(await this.doRequest("1.0", "antcloud.cas.computer.reboot", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RebootComputerResponse({}));
  }

  /**
   * Description: 查询computer所属安全组
   * Summary: 查询computer所属安全组
   */
  async queryComputerSecuritygroup(request: QueryComputerSecuritygroupRequest): Promise<QueryComputerSecuritygroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryComputerSecuritygroupEx(request, headers, runtime);
  }

  /**
   * Description: 查询computer所属安全组
   * Summary: 查询computer所属安全组
   */
  async queryComputerSecuritygroupEx(request: QueryComputerSecuritygroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryComputerSecuritygroupResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryComputerSecuritygroupResponse>(await this.doRequest("1.0", "antcloud.cas.computer.securitygroup.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryComputerSecuritygroupResponse({}));
  }

  /**
   * Description: 查询安全组信息
   * Summary: 查询安全组信息
   */
  async querySecuritygroup(request: QuerySecuritygroupRequest): Promise<QuerySecuritygroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySecuritygroupEx(request, headers, runtime);
  }

  /**
   * Description: 查询安全组信息
   * Summary: 查询安全组信息
   */
  async querySecuritygroupEx(request: QuerySecuritygroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySecuritygroupResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySecuritygroupResponse>(await this.doRequest("1.0", "antcloud.cas.securitygroup.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySecuritygroupResponse({}));
  }

  /**
   * Description: 创建安全组规则
   * Summary: 创建安全组规则
   */
  async createSecuritygroupPermission(request: CreateSecuritygroupPermissionRequest): Promise<CreateSecuritygroupPermissionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSecuritygroupPermissionEx(request, headers, runtime);
  }

  /**
   * Description: 创建安全组规则
   * Summary: 创建安全组规则
   */
  async createSecuritygroupPermissionEx(request: CreateSecuritygroupPermissionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSecuritygroupPermissionResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSecuritygroupPermissionResponse>(await this.doRequest("1.0", "antcloud.cas.securitygroup.permission.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSecuritygroupPermissionResponse({}));
  }

  /**
   * Description: 查询安全组规则信息
   * Summary: 查询安全组规则信息
   */
  async querySecuritygroupPermission(request: QuerySecuritygroupPermissionRequest): Promise<QuerySecuritygroupPermissionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySecuritygroupPermissionEx(request, headers, runtime);
  }

  /**
   * Description: 查询安全组规则信息
   * Summary: 查询安全组规则信息
   */
  async querySecuritygroupPermissionEx(request: QuerySecuritygroupPermissionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySecuritygroupPermissionResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySecuritygroupPermissionResponse>(await this.doRequest("1.0", "antcloud.cas.securitygroup.permission.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySecuritygroupPermissionResponse({}));
  }

  /**
   * Description: 更新监听器的安全控制
   * Summary: 更新监听器的安全控制
   */
  async updateLoadbalanaceSecurityip(request: UpdateLoadbalanaceSecurityipRequest): Promise<UpdateLoadbalanaceSecurityipResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateLoadbalanaceSecurityipEx(request, headers, runtime);
  }

  /**
   * Description: 更新监听器的安全控制
   * Summary: 更新监听器的安全控制
   */
  async updateLoadbalanaceSecurityipEx(request: UpdateLoadbalanaceSecurityipRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateLoadbalanaceSecurityipResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateLoadbalanaceSecurityipResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalanace.securityip.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateLoadbalanaceSecurityipResponse({}));
  }

  /**
   * Description: 创建lb监听器的安全控制
   * Summary: 创建lb监听器的安全控制
   */
  async createLoadbalanceSecurityip(request: CreateLoadbalanceSecurityipRequest): Promise<CreateLoadbalanceSecurityipResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLoadbalanceSecurityipEx(request, headers, runtime);
  }

  /**
   * Description: 创建lb监听器的安全控制
   * Summary: 创建lb监听器的安全控制
   */
  async createLoadbalanceSecurityipEx(request: CreateLoadbalanceSecurityipRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLoadbalanceSecurityipResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLoadbalanceSecurityipResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.securityip.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLoadbalanceSecurityipResponse({}));
  }

  /**
   * Description: 编辑数据库的基本属性
   * Summary: 编辑数据库的基本属性
   */
  async updateDatabase(request: UpdateDatabaseRequest): Promise<UpdateDatabaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateDatabaseEx(request, headers, runtime);
  }

  /**
   * Description: 编辑数据库的基本属性
   * Summary: 编辑数据库的基本属性
   */
  async updateDatabaseEx(request: UpdateDatabaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateDatabaseResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDatabaseResponse>(await this.doRequest("1.0", "antcloud.cas.database.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateDatabaseResponse({}));
  }

  /**
   * Description: 更新后端权重
   * Summary: 更新后端权重
   */
  async updateLoadbalanceMount(request: UpdateLoadbalanceMountRequest): Promise<UpdateLoadbalanceMountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateLoadbalanceMountEx(request, headers, runtime);
  }

  /**
   * Description: 更新后端权重
   * Summary: 更新后端权重
   */
  async updateLoadbalanceMountEx(request: UpdateLoadbalanceMountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateLoadbalanceMountResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateLoadbalanceMountResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.mount.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateLoadbalanceMountResponse({}));
  }

  /**
   * Description: 删除LB后端挂载主机
   * Summary: 删除LB后端挂载主机
   */
  async deleteLoadbalanceMount(request: DeleteLoadbalanceMountRequest): Promise<DeleteLoadbalanceMountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteLoadbalanceMountEx(request, headers, runtime);
  }

  /**
   * Description: 删除LB后端挂载主机
   * Summary: 删除LB后端挂载主机
   */
  async deleteLoadbalanceMountEx(request: DeleteLoadbalanceMountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteLoadbalanceMountResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteLoadbalanceMountResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.mount.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteLoadbalanceMountResponse({}));
  }

  /**
   * Description: 查询任务记录
   * Summary: 查询任务记录
   */
  async queryRequest(request: QueryRequestRequest): Promise<QueryRequestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRequestEx(request, headers, runtime);
  }

  /**
   * Description: 查询任务记录
   * Summary: 查询任务记录
   */
  async queryRequestEx(request: QueryRequestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRequestResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRequestResponse>(await this.doRequest("1.0", "antcloud.cas.request.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRequestResponse({}));
  }

  /**
   * Description: 获取单个request
   * Summary: 获取单个request
   */
  async getRequest(request: GetRequestRequest): Promise<GetRequestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getRequestEx(request, headers, runtime);
  }

  /**
   * Description: 获取单个request
   * Summary: 获取单个request
   */
  async getRequestEx(request: GetRequestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetRequestResponse> {
    Util.validateModel(request);
    return $tea.cast<GetRequestResponse>(await this.doRequest("1.0", "antcloud.cas.request.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetRequestResponse({}));
  }

  /**
   * Description: 查询task
   * Summary: 查询task
   */
  async queryRequestTask(request: QueryRequestTaskRequest): Promise<QueryRequestTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRequestTaskEx(request, headers, runtime);
  }

  /**
   * Description: 查询task
   * Summary: 查询task
   */
  async queryRequestTaskEx(request: QueryRequestTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRequestTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRequestTaskResponse>(await this.doRequest("1.0", "antcloud.cas.request.task.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRequestTaskResponse({}));
  }

  /**
   * Description: 查询任务日志
   * Summary: 查询任务日志
   */
  async queryTaskLog(request: QueryTaskLogRequest): Promise<QueryTaskLogResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTaskLogEx(request, headers, runtime);
  }

  /**
   * Description: 查询任务日志
   * Summary: 查询任务日志
   */
  async queryTaskLogEx(request: QueryTaskLogRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTaskLogResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTaskLogResponse>(await this.doRequest("1.0", "antcloud.cas.task.log.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTaskLogResponse({}));
  }

  /**
   * Description: /webapi/apconsole/v2/tenant/0069443310/workspaces?status=CREATED
   * Summary: 列出 tenant workspace
   */
  async listTenantworkspace(request: ListTenantworkspaceRequest): Promise<ListTenantworkspaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listTenantworkspaceEx(request, headers, runtime);
  }

  /**
   * Description: /webapi/apconsole/v2/tenant/0069443310/workspaces?status=CREATED
   * Summary: 列出 tenant workspace
   */
  async listTenantworkspaceEx(request: ListTenantworkspaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListTenantworkspaceResponse> {
    Util.validateModel(request);
    return $tea.cast<ListTenantworkspaceResponse>(await this.doRequest("1.0", "antcloud.cas.tenantworkspace.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListTenantworkspaceResponse({}));
  }

  /**
   * Description: /webapi/tenants/0069443310/workspaces/filterStatus?projectUniqueId=0069443310&statuses=CREATED
   * Summary: 环境filterStatus
   */
  async queryTenantworkspaceFilter(request: QueryTenantworkspaceFilterRequest): Promise<QueryTenantworkspaceFilterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTenantworkspaceFilterEx(request, headers, runtime);
  }

  /**
   * Description: /webapi/tenants/0069443310/workspaces/filterStatus?projectUniqueId=0069443310&statuses=CREATED
   * Summary: 环境filterStatus
   */
  async queryTenantworkspaceFilterEx(request: QueryTenantworkspaceFilterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTenantworkspaceFilterResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTenantworkspaceFilterResponse>(await this.doRequest("1.0", "antcloud.cas.tenantworkspace.filter.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTenantworkspaceFilterResponse({}));
  }

  /**
   * Description: group by region列表
   * Summary: group by region列表
   */
  async listRegionGroupby(request: ListRegionGroupbyRequest): Promise<ListRegionGroupbyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listRegionGroupbyEx(request, headers, runtime);
  }

  /**
   * Description: group by region列表
   * Summary: group by region列表
   */
  async listRegionGroupbyEx(request: ListRegionGroupbyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListRegionGroupbyResponse> {
    Util.validateModel(request);
    return $tea.cast<ListRegionGroupbyResponse>(await this.doRequest("1.0", "antcloud.cas.region.groupby.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListRegionGroupbyResponse({}));
  }

  /**
   * Description: 查询任务最后的步骤
   * Summary: 查询任务最后的步骤
   */
  async queryRequestFinaltask(request: QueryRequestFinaltaskRequest): Promise<QueryRequestFinaltaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRequestFinaltaskEx(request, headers, runtime);
  }

  /**
   * Description: 查询任务最后的步骤
   * Summary: 查询任务最后的步骤
   */
  async queryRequestFinaltaskEx(request: QueryRequestFinaltaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRequestFinaltaskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRequestFinaltaskResponse>(await this.doRequest("1.0", "antcloud.cas.request.finaltask.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRequestFinaltaskResponse({}));
  }

  /**
   * Description: 查询当前支持的功能
   * Summary: 查询当前支持的功能
   */
  async queryFeature(request: QueryFeatureRequest): Promise<QueryFeatureResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFeatureEx(request, headers, runtime);
  }

  /**
   * Description: 查询当前支持的功能
   * Summary: 查询当前支持的功能
   */
  async queryFeatureEx(request: QueryFeatureRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFeatureResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFeatureResponse>(await this.doRequest("1.0", "antcloud.cas.feature.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFeatureResponse({}));
  }

  /**
   * Description: start computer
   * Summary: start computer
   */
  async startComputer(request: StartComputerRequest): Promise<StartComputerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startComputerEx(request, headers, runtime);
  }

  /**
   * Description: start computer
   * Summary: start computer
   */
  async startComputerEx(request: StartComputerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartComputerResponse> {
    Util.validateModel(request);
    return $tea.cast<StartComputerResponse>(await this.doRequest("1.0", "antcloud.cas.computer.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartComputerResponse({}));
  }

  /**
   * Description: 开启lb
   * Summary: 开启lb
   */
  async startLoadbalance(request: StartLoadbalanceRequest): Promise<StartLoadbalanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startLoadbalanceEx(request, headers, runtime);
  }

  /**
   * Description: 开启lb
   * Summary: 开启lb
   */
  async startLoadbalanceEx(request: StartLoadbalanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartLoadbalanceResponse> {
    Util.validateModel(request);
    return $tea.cast<StartLoadbalanceResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartLoadbalanceResponse({}));
  }

  /**
   * Description: 停止lb
   * Summary: 停止lb
   */
  async stopLoadbalance(request: StopLoadbalanceRequest): Promise<StopLoadbalanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.stopLoadbalanceEx(request, headers, runtime);
  }

  /**
   * Description: 停止lb
   * Summary: 停止lb
   */
  async stopLoadbalanceEx(request: StopLoadbalanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StopLoadbalanceResponse> {
    Util.validateModel(request);
    return $tea.cast<StopLoadbalanceResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.stop", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StopLoadbalanceResponse({}));
  }

  /**
   * Description: 更新lb信息
   * Summary: 更新lb信息
   */
  async updateLoadbalance(request: UpdateLoadbalanceRequest): Promise<UpdateLoadbalanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateLoadbalanceEx(request, headers, runtime);
  }

  /**
   * Description: 更新lb信息
   * Summary: 更新lb信息
   */
  async updateLoadbalanceEx(request: UpdateLoadbalanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateLoadbalanceResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateLoadbalanceResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateLoadbalanceResponse({}));
  }

  /**
   * Description: 把LB分配给应用
   * Summary: 把LB分配给应用
   */
  async addLoadbalanceAssign(request: AddLoadbalanceAssignRequest): Promise<AddLoadbalanceAssignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addLoadbalanceAssignEx(request, headers, runtime);
  }

  /**
   * Description: 把LB分配给应用
   * Summary: 把LB分配给应用
   */
  async addLoadbalanceAssignEx(request: AddLoadbalanceAssignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddLoadbalanceAssignResponse> {
    Util.validateModel(request);
    return $tea.cast<AddLoadbalanceAssignResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.assign.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddLoadbalanceAssignResponse({}));
  }

  /**
   * Description: 证书查询
   * Summary: 证书查询
   */
  async queryCertificate(request: QueryCertificateRequest): Promise<QueryCertificateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCertificateEx(request, headers, runtime);
  }

  /**
   * Description: 证书查询
   * Summary: 证书查询
   */
  async queryCertificateEx(request: QueryCertificateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCertificateResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCertificateResponse>(await this.doRequest("1.0", "antcloud.cas.certificate.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCertificateResponse({}));
  }

  /**
   * Description: 创建证书
   * Summary: 创建证书
   */
  async createCertificate(request: CreateCertificateRequest): Promise<CreateCertificateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCertificateEx(request, headers, runtime);
  }

  /**
   * Description: 创建证书
   * Summary: 创建证书
   */
  async createCertificateEx(request: CreateCertificateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCertificateResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCertificateResponse>(await this.doRequest("1.0", "antcloud.cas.certificate.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCertificateResponse({}));
  }

  /**
   * Description: 删除证书
   * Summary: 删除证书
   */
  async deleteCertificate(request: DeleteCertificateRequest): Promise<DeleteCertificateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteCertificateEx(request, headers, runtime);
  }

  /**
   * Description: 删除证书
   * Summary: 删除证书
   */
  async deleteCertificateEx(request: DeleteCertificateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteCertificateResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteCertificateResponse>(await this.doRequest("1.0", "antcloud.cas.certificate.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteCertificateResponse({}));
  }

  /**
   * Description: 查询已创建的VPC
   * Summary: 查询已创建的VPC
   */
  async describeUnifiedresourceVpc(request: DescribeUnifiedresourceVpcRequest): Promise<DescribeUnifiedresourceVpcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.describeUnifiedresourceVpcEx(request, headers, runtime);
  }

  /**
   * Description: 查询已创建的VPC
   * Summary: 查询已创建的VPC
   */
  async describeUnifiedresourceVpcEx(request: DescribeUnifiedresourceVpcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DescribeUnifiedresourceVpcResponse> {
    Util.validateModel(request);
    return $tea.cast<DescribeUnifiedresourceVpcResponse>(await this.doRequest("1.0", "antcloud.cas.unifiedresource.vpc.describe", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DescribeUnifiedresourceVpcResponse({}));
  }

  /**
   * Description: 查询实例规格族列表
   * Summary: 查询实例规格族列表
   */
  async listUnifiedresourceInstancefamilies(request: ListUnifiedresourceInstancefamiliesRequest): Promise<ListUnifiedresourceInstancefamiliesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listUnifiedresourceInstancefamiliesEx(request, headers, runtime);
  }

  /**
   * Description: 查询实例规格族列表
   * Summary: 查询实例规格族列表
   */
  async listUnifiedresourceInstancefamiliesEx(request: ListUnifiedresourceInstancefamiliesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListUnifiedresourceInstancefamiliesResponse> {
    Util.validateModel(request);
    return $tea.cast<ListUnifiedresourceInstancefamiliesResponse>(await this.doRequest("1.0", "antcloud.cas.unifiedresource.instancefamilies.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListUnifiedresourceInstancefamiliesResponse({}));
  }

  /**
   * Description: 查询所有实例规格详细信息
   * Summary: 查询实例规格资源
   */
  async listUnifiedresourceInstancetype(request: ListUnifiedresourceInstancetypeRequest): Promise<ListUnifiedresourceInstancetypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listUnifiedresourceInstancetypeEx(request, headers, runtime);
  }

  /**
   * Description: 查询所有实例规格详细信息
   * Summary: 查询实例规格资源
   */
  async listUnifiedresourceInstancetypeEx(request: ListUnifiedresourceInstancetypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListUnifiedresourceInstancetypeResponse> {
    Util.validateModel(request);
    return $tea.cast<ListUnifiedresourceInstancetypeResponse>(await this.doRequest("1.0", "antcloud.cas.unifiedresource.instancetype.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListUnifiedresourceInstancetypeResponse({}));
  }

  /**
   * Description: query cas computer detail info by id
   * Summary: 获取单个computer的详细信息
   */
  async queryComputer(request: QueryComputerRequest): Promise<QueryComputerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryComputerEx(request, headers, runtime);
  }

  /**
   * Description: query cas computer detail info by id
   * Summary: 获取单个computer的详细信息
   */
  async queryComputerEx(request: QueryComputerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryComputerResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryComputerResponse>(await this.doRequest("1.0", "antcloud.cas.computer.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryComputerResponse({}));
  }

  /**
   * Description: 列出iaas提供商在当前可用区的所有可使用的实例类型
   * Summary: 查询可用实例类型
   */
  async listResourceComputertype(request: ListResourceComputertypeRequest): Promise<ListResourceComputertypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listResourceComputertypeEx(request, headers, runtime);
  }

  /**
   * Description: 列出iaas提供商在当前可用区的所有可使用的实例类型
   * Summary: 查询可用实例类型
   */
  async listResourceComputertypeEx(request: ListResourceComputertypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListResourceComputertypeResponse> {
    Util.validateModel(request);
    return $tea.cast<ListResourceComputertypeResponse>(await this.doRequest("1.0", "antcloud.cas.resource.computertype.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListResourceComputertypeResponse({}));
  }

  /**
   * Description: 查询ecs disk 列表
   * Summary: 查询ecs disk info
   */
  async listResourceDisk(request: ListResourceDiskRequest): Promise<ListResourceDiskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listResourceDiskEx(request, headers, runtime);
  }

  /**
   * Description: 查询ecs disk 列表
   * Summary: 查询ecs disk info
   */
  async listResourceDiskEx(request: ListResourceDiskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListResourceDiskResponse> {
    Util.validateModel(request);
    return $tea.cast<ListResourceDiskResponse>(await this.doRequest("1.0", "antcloud.cas.resource.disk.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListResourceDiskResponse({}));
  }

  /**
   * Description: 查询云服务器规格族列表
   * Summary: 查询云服务器规格族列表
   */
  async listResourceComputertypefamily(request: ListResourceComputertypefamilyRequest): Promise<ListResourceComputertypefamilyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listResourceComputertypefamilyEx(request, headers, runtime);
  }

  /**
   * Description: 查询云服务器规格族列表
   * Summary: 查询云服务器规格族列表
   */
  async listResourceComputertypefamilyEx(request: ListResourceComputertypefamilyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListResourceComputertypefamilyResponse> {
    Util.validateModel(request);
    return $tea.cast<ListResourceComputertypefamilyResponse>(await this.doRequest("1.0", "antcloud.cas.resource.computertypefamily.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListResourceComputertypefamilyResponse({}));
  }

  /**
   * Description: 查询交换机信息
   * Summary: 查询交换机信息
   */
  async listUnifiedresourceVswitch(request: ListUnifiedresourceVswitchRequest): Promise<ListUnifiedresourceVswitchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listUnifiedresourceVswitchEx(request, headers, runtime);
  }

  /**
   * Description: 查询交换机信息
   * Summary: 查询交换机信息
   */
  async listUnifiedresourceVswitchEx(request: ListUnifiedresourceVswitchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListUnifiedresourceVswitchResponse> {
    Util.validateModel(request);
    return $tea.cast<ListUnifiedresourceVswitchResponse>(await this.doRequest("1.0", "antcloud.cas.unifiedresource.vswitch.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListUnifiedresourceVswitchResponse({}));
  }

  /**
   * Description: 查询当前region的vpc列表
   * Summary: 查询region vpc列表
   */
  async listUnifiedresourceVpc(request: ListUnifiedresourceVpcRequest): Promise<ListUnifiedresourceVpcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listUnifiedresourceVpcEx(request, headers, runtime);
  }

  /**
   * Description: 查询当前region的vpc列表
   * Summary: 查询region vpc列表
   */
  async listUnifiedresourceVpcEx(request: ListUnifiedresourceVpcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListUnifiedresourceVpcResponse> {
    Util.validateModel(request);
    return $tea.cast<ListUnifiedresourceVpcResponse>(await this.doRequest("1.0", "antcloud.cas.unifiedresource.vpc.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListUnifiedresourceVpcResponse({}));
  }

  /**
   * Description: 导入vpc到workspace
   * Summary: 导入vpc
   */
  async importResourceVpc(request: ImportResourceVpcRequest): Promise<ImportResourceVpcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importResourceVpcEx(request, headers, runtime);
  }

  /**
   * Description: 导入vpc到workspace
   * Summary: 导入vpc
   */
  async importResourceVpcEx(request: ImportResourceVpcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportResourceVpcResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportResourceVpcResponse>(await this.doRequest("1.0", "antcloud.cas.resource.vpc.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportResourceVpcResponse({}));
  }

  /**
   * Description: 删除安全组规则
   * Summary: 删除安全组规则
   */
  async deleteResourceRule(request: DeleteResourceRuleRequest): Promise<DeleteResourceRuleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteResourceRuleEx(request, headers, runtime);
  }

  /**
   * Description: 删除安全组规则
   * Summary: 删除安全组规则
   */
  async deleteResourceRuleEx(request: DeleteResourceRuleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteResourceRuleResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteResourceRuleResponse>(await this.doRequest("1.0", "antcloud.cas.resource.rule.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteResourceRuleResponse({}));
  }

  /**
   * Description: 查询路由表条目列表
   * Summary: 查询路由表条目列表
   */
  async listRouteEntry(request: ListRouteEntryRequest): Promise<ListRouteEntryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listRouteEntryEx(request, headers, runtime);
  }

  /**
   * Description: 查询路由表条目列表
   * Summary: 查询路由表条目列表
   */
  async listRouteEntryEx(request: ListRouteEntryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListRouteEntryResponse> {
    Util.validateModel(request);
    return $tea.cast<ListRouteEntryResponse>(await this.doRequest("1.0", "antcloud.cas.route.entry.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListRouteEntryResponse({}));
  }

  /**
   * Description: 查询可用disk资源详细信息
   * Summary: 查询可用disk资源详细信息
   */
  async listAvailableDisk(request: ListAvailableDiskRequest): Promise<ListAvailableDiskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAvailableDiskEx(request, headers, runtime);
  }

  /**
   * Description: 查询可用disk资源详细信息
   * Summary: 查询可用disk资源详细信息
   */
  async listAvailableDiskEx(request: ListAvailableDiskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAvailableDiskResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAvailableDiskResponse>(await this.doRequest("1.0", "antcloud.cas.available.disk.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAvailableDiskResponse({}));
  }

  /**
   * Description: 查询可用实例类型信息
   * Summary: 查询可用实例类型信息
   */
  async listAvailableInstancetype(request: ListAvailableInstancetypeRequest): Promise<ListAvailableInstancetypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAvailableInstancetypeEx(request, headers, runtime);
  }

  /**
   * Description: 查询可用实例类型信息
   * Summary: 查询可用实例类型信息
   */
  async listAvailableInstancetypeEx(request: ListAvailableInstancetypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAvailableInstancetypeResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAvailableInstancetypeResponse>(await this.doRequest("1.0", "antcloud.cas.available.instancetype.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAvailableInstancetypeResponse({}));
  }

  /**
   * Description: 查询node meta数据
   * Summary: 查询node meta数据
   */
  async queryResourcemetaNode(request: QueryResourcemetaNodeRequest): Promise<QueryResourcemetaNodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryResourcemetaNodeEx(request, headers, runtime);
  }

  /**
   * Description: 查询node meta数据
   * Summary: 查询node meta数据
   */
  async queryResourcemetaNodeEx(request: QueryResourcemetaNodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryResourcemetaNodeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryResourcemetaNodeResponse>(await this.doRequest("1.0", "antcloud.cas.resourcemeta.node.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryResourcemetaNodeResponse({}));
  }

  /**
   * Description: 查询应用服务meta数据
   * Summary: 查询应用服务meta数据
   */
  async queryResourcemetaAppservice(request: QueryResourcemetaAppserviceRequest): Promise<QueryResourcemetaAppserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryResourcemetaAppserviceEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用服务meta数据
   * Summary: 查询应用服务meta数据
   */
  async queryResourcemetaAppserviceEx(request: QueryResourcemetaAppserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryResourcemetaAppserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryResourcemetaAppserviceResponse>(await this.doRequest("1.0", "antcloud.cas.resourcemeta.appservice.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryResourcemetaAppserviceResponse({}));
  }

  /**
   * Description: 调用底层API同步状态，如果底层是删除的，则直接置为删除
   * Summary: 同步机器状态
   */
  async syncComputer(request: SyncComputerRequest): Promise<SyncComputerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncComputerEx(request, headers, runtime);
  }

  /**
   * Description: 调用底层API同步状态，如果底层是删除的，则直接置为删除
   * Summary: 同步机器状态
   */
  async syncComputerEx(request: SyncComputerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncComputerResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncComputerResponse>(await this.doRequest("1.0", "antcloud.cas.computer.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncComputerResponse({}));
  }

  /**
   * Description: 同步LB状态
   * Summary: 同步LB状态
   */
  async syncLoadbalance(request: SyncLoadbalanceRequest): Promise<SyncLoadbalanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncLoadbalanceEx(request, headers, runtime);
  }

  /**
   * Description: 同步LB状态
   * Summary: 同步LB状态
   */
  async syncLoadbalanceEx(request: SyncLoadbalanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncLoadbalanceResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncLoadbalanceResponse>(await this.doRequest("1.0", "antcloud.cas.loadbalance.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncLoadbalanceResponse({}));
  }

  /**
   * Description: 更新机器基本信息
   * Summary: 更新机器基本信息
   */
  async updateComputerInfo(request: UpdateComputerInfoRequest): Promise<UpdateComputerInfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateComputerInfoEx(request, headers, runtime);
  }

  /**
   * Description: 更新机器基本信息
   * Summary: 更新机器基本信息
   */
  async updateComputerInfoEx(request: UpdateComputerInfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateComputerInfoResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateComputerInfoResponse>(await this.doRequest("1.0", "antcloud.cas.computer.info.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateComputerInfoResponse({}));
  }

  /**
   * Description: 将机器分配给应用
   * Summary: 将机器分配给应用
   */
  async setComputerAssign(request: SetComputerAssignRequest): Promise<SetComputerAssignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setComputerAssignEx(request, headers, runtime);
  }

  /**
   * Description: 将机器分配给应用
   * Summary: 将机器分配给应用
   */
  async setComputerAssignEx(request: SetComputerAssignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetComputerAssignResponse> {
    Util.validateModel(request);
    return $tea.cast<SetComputerAssignResponse>(await this.doRequest("1.0", "antcloud.cas.computer.assign.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetComputerAssignResponse({}));
  }

  /**
   * Description: 执行任务
   * Summary: 执行任务
   */
  async execRequestTask(request: ExecRequestTaskRequest): Promise<ExecRequestTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execRequestTaskEx(request, headers, runtime);
  }

  /**
   * Description: 执行任务
   * Summary: 执行任务
   */
  async execRequestTaskEx(request: ExecRequestTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecRequestTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecRequestTaskResponse>(await this.doRequest("1.0", "antcloud.cas.request.task.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecRequestTaskResponse({}));
  }

  /**
   * Description: 重新初始化机器
   * Summary: 重新初始化机器
   */
  async reinitDisk(request: ReinitDiskRequest): Promise<ReinitDiskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.reinitDiskEx(request, headers, runtime);
  }

  /**
   * Description: 重新初始化机器
   * Summary: 重新初始化机器
   */
  async reinitDiskEx(request: ReinitDiskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReinitDiskResponse> {
    Util.validateModel(request);
    return $tea.cast<ReinitDiskResponse>(await this.doRequest("1.0", "antcloud.cas.disk.reinit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReinitDiskResponse({}));
  }

  /**
   * Description: 修改磁盘策略
   * Summary: 修改磁盘策略
   */
  async updateDiskStrategy(request: UpdateDiskStrategyRequest): Promise<UpdateDiskStrategyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateDiskStrategyEx(request, headers, runtime);
  }

  /**
   * Description: 修改磁盘策略
   * Summary: 修改磁盘策略
   */
  async updateDiskStrategyEx(request: UpdateDiskStrategyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateDiskStrategyResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDiskStrategyResponse>(await this.doRequest("1.0", "antcloud.cas.disk.strategy.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateDiskStrategyResponse({}));
  }

}
