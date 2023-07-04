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

// 资源池信息
export class ResourcePool extends $tea.Model {
  // 资源池名称, Local站点下唯一
  name: string;
  // 资源的提供者, ALB,SLB,ALISQL,RDS,OCEANBASE,AFS,OSS,ECS,ALIYUNECS
  provider: string;
  // 支持的资源类型
  resourceType: string;
  // 资源池访问信息
  accessInfo: string;
  // 所属cloud的id
  cloudId: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      provider: 'provider',
      resourceType: 'resource_type',
      accessInfo: 'access_info',
      cloudId: 'cloud_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      provider: 'string',
      resourceType: 'string',
      accessInfo: 'string',
      cloudId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 地域
export class Region extends $tea.Model {
  // 地域标识（与阿里云identity对齐）
  identity: string;
  // 地域的名字
  name: string;
  // region的id
  regionId: string;
  // 显示的名字，可重复
  displayName: string;
  // 所在城市
  city: string;
  // 是否金区：FINANCIAL， NON_FINANCIAL
  tag: string;
  static names(): { [key: string]: string } {
    return {
      identity: 'identity',
      name: 'name',
      regionId: 'region_id',
      displayName: 'display_name',
      city: 'city',
      tag: 'tag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      identity: 'string',
      name: 'string',
      regionId: 'string',
      displayName: 'string',
      city: 'string',
      tag: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 巡检使用的pod信息
export class PodInfo extends $tea.Model {
  // podname
  podName: string;
  // 容器name
  containerName: string;
  // ip
  ip: string;
  // host ip
  hostIp: string;
  // hostname
  hostName?: string;
  // cpu
  cpu?: string;
  // 内存
  memory?: string;
  // status
  status?: string;
  // 产品码--应用名
  productApp?: string;
  // 租户信息
  // 
  tenantId?: string;
  // 环境信息
  // 
  envId?: string;
  static names(): { [key: string]: string } {
    return {
      podName: 'pod_name',
      containerName: 'container_name',
      ip: 'ip',
      hostIp: 'host_ip',
      hostName: 'host_name',
      cpu: 'cpu',
      memory: 'memory',
      status: 'status',
      productApp: 'product_app',
      tenantId: 'tenant_id',
      envId: 'env_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      podName: 'string',
      containerName: 'string',
      ip: 'string',
      hostIp: 'string',
      hostName: 'string',
      cpu: 'string',
      memory: 'string',
      status: 'string',
      productApp: 'string',
      tenantId: 'string',
      envId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 机房
export class Zone extends $tea.Model {
  // 机房的标识（与阿里云对齐）
  identity: string;
  // 机房的名字
  name: string;
  // 地域的id
  regionId: string;
  // 机房内关联的资源池列表
  resourcePools: ResourcePool[];
  // 机房的id
  zoneId: string;
  // 显示的名字
  displayName: string;
  static names(): { [key: string]: string } {
    return {
      identity: 'identity',
      name: 'name',
      regionId: 'region_id',
      resourcePools: 'resource_pools',
      zoneId: 'zone_id',
      displayName: 'display_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      identity: 'string',
      name: 'string',
      regionId: 'string',
      resourcePools: { 'type': 'array', 'itemType': ResourcePool },
      zoneId: 'string',
      displayName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 单元（逻辑机房）
export class Cell extends $tea.Model {
  // LDC下cellGroup的ID
  cellGroupId?: string;
  // 单元的id
  cellId: string;
  // LDC的蓝绿着色
  color?: string;
  // LDC的默认权重
  defaultWeight?: number;
  // LDC下是否灰度
  gray?: boolean;
  // 单元的名字
  name: string;
  // 所在地域的id
  regionId: string;
  // LDC的GRCZone类型
  type?: string;
  // 工作空间id
  workspaceId: string;
  // 所属机房的id
  zoneId: string;
  // 显示的名字
  displayName: string;
  static names(): { [key: string]: string } {
    return {
      cellGroupId: 'cell_group_id',
      cellId: 'cell_id',
      color: 'color',
      defaultWeight: 'default_weight',
      gray: 'gray',
      name: 'name',
      regionId: 'region_id',
      type: 'type',
      workspaceId: 'workspace_id',
      zoneId: 'zone_id',
      displayName: 'display_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cellGroupId: 'string',
      cellId: 'string',
      color: 'string',
      defaultWeight: 'number',
      gray: 'boolean',
      name: 'string',
      regionId: 'string',
      type: 'string',
      workspaceId: 'string',
      zoneId: 'string',
      displayName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 工作空间
export class Workspace extends $tea.Model {
  // 包含的单元（逻辑机房）
  cells: Cell[];
  // 显示的名字
  displayName: string;
  // workspace的名字
  name: string;
  // 所属地域
  region: Region;
  // 工作空间的id
  workspaceId: string;
  // 机房列表
  zones: Zone[];
  static names(): { [key: string]: string } {
    return {
      cells: 'cells',
      displayName: 'display_name',
      name: 'name',
      region: 'region',
      workspaceId: 'workspace_id',
      zones: 'zones',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cells: { 'type': 'array', 'itemType': Cell },
      displayName: 'string',
      name: 'string',
      region: Region,
      workspaceId: 'string',
      zones: { 'type': 'array', 'itemType': Zone },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 云
export class Cloud extends $tea.Model {
  // 云的ID
  cloudId: string;
  // 云的名字
  name: string;
  static names(): { [key: string]: string } {
    return {
      cloudId: 'cloud_id',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cloudId: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 巡检app信息
export class AppInfo extends $tea.Model {
  // 集群里面该app的namespace
  namespace: string;
  // pod信息列表
  podList: PodInfo[];
  // 应用名称
  appName: string;
  // ap version
  appVersion: string;
  // 应用类型
  appType?: string;
  static names(): { [key: string]: string } {
    return {
      namespace: 'namespace',
      podList: 'pod_list',
      appName: 'app_name',
      appVersion: 'app_version',
      appType: 'app_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      namespace: 'string',
      podList: { 'type': 'array', 'itemType': PodInfo },
      appName: 'string',
      appVersion: 'string',
      appType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// LDC下的CellGroup
export class CellGroup extends $tea.Model {
  // cellGroup的id
  cellGroupId: string;
  // 默认gzone cell的id
  defaultGzone?: string;
  // 是否弹性
  elastic?: boolean;
  // cellGroup的名字
  name: string;
  // 暂时不知道啥意思
  normalDrstat?: string;
  // 暂时不知道啥意思
  pressDrstat?: string;
  // LDC下cellGroup的类型
  type: string;
  // 显示的名字
  displayName: string;
  static names(): { [key: string]: string } {
    return {
      cellGroupId: 'cell_group_id',
      defaultGzone: 'default_gzone',
      elastic: 'elastic',
      name: 'name',
      normalDrstat: 'normal_drstat',
      pressDrstat: 'press_drstat',
      type: 'type',
      displayName: 'display_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cellGroupId: 'string',
      defaultGzone: 'string',
      elastic: 'boolean',
      name: 'string',
      normalDrstat: 'string',
      pressDrstat: 'string',
      type: 'string',
      displayName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 参数对象
export class ParamData extends $tea.Model {
  // 参数key
  key: string;
  // 参数值
  value?: string;
  // 类型, 对应Data的paramGroup
  type?: string;
  // 安全级别，脱敏用
  securityLevel?: string;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
      type: 'type',
      securityLevel: 'security_level',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: 'string',
      type: 'string',
      securityLevel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 租户
export class Tenant extends $tea.Model {
  // 租户名
  name: string;
  // 租户id
  tanentId?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      tanentId: 'tanent_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      tanentId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 容器信息。
export class Container extends $tea.Model {
  // 应用版本
  appVersion?: string;
  // cpu核数，单位C。
  cpu?: number;
  // 宿主机ip。
  hostIp?: string;
  // 宿主机名称。
  hostName?: string;
  // 容器id。
  id?: string;
  // 容器镜像。
  image?: string;
  // 容器ip。
  ip?: string;
  // 内存大小，单位M。
  memory?: number;
  // 容器名称。
  name?: string;
  // 容器所在的pod。
  pod?: string;
  // 资源所属的资源池的唯一标识。
  resourcePoolId?: string;
  // 容器状态。
  status?: string;
  // 应用名
  appName?: string;
  static names(): { [key: string]: string } {
    return {
      appVersion: 'app_version',
      cpu: 'cpu',
      hostIp: 'host_ip',
      hostName: 'host_name',
      id: 'id',
      image: 'image',
      ip: 'ip',
      memory: 'memory',
      name: 'name',
      pod: 'pod',
      resourcePoolId: 'resource_pool_id',
      status: 'status',
      appName: 'app_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appVersion: 'string',
      cpu: 'number',
      hostIp: 'string',
      hostName: 'string',
      id: 'string',
      image: 'string',
      ip: 'string',
      memory: 'number',
      name: 'string',
      pod: 'string',
      resourcePoolId: 'string',
      status: 'string',
      appName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// OpenAPI定义
export class OpenAPI extends $tea.Model {
  // API方法
  method: string;
  // API版本号
  version: string;
  static names(): { [key: string]: string } {
    return {
      method: 'method',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      method: 'string',
      version: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 包含应用启动参数的应用对象
export class AppParamData extends $tea.Model {
  // 产品码
  prodCode: string;
  // 应用名
  appName: string;
  // 应用启动参数
  appParams: ParamData[];
  static names(): { [key: string]: string } {
    return {
      prodCode: 'prod_code',
      appName: 'app_name',
      appParams: 'app_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      prodCode: 'string',
      appName: 'string',
      appParams: { 'type': 'array', 'itemType': ParamData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 容器状态
export class ContainerInfo extends $tea.Model {
  // 容器日志
  log: string;
  // 容器节点状态
  status: string;
  // 创建时间
  utcCreate: string;
  // 结束时间
  utcEnd: string;
  // 修改时间
  utcModified: string;
  // 开始时间
  utcStart: string;
  static names(): { [key: string]: string } {
    return {
      log: 'log',
      status: 'status',
      utcCreate: 'utc_create',
      utcEnd: 'utc_end',
      utcModified: 'utc_modified',
      utcStart: 'utc_start',
    };
  }

  static types(): { [key: string]: any } {
    return {
      log: 'string',
      status: 'string',
      utcCreate: 'string',
      utcEnd: 'string',
      utcModified: 'string',
      utcStart: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 巡检查询产品详情
export class ProdInfo extends $tea.Model {
  // 应用实例信息
  appInfos: AppInfo[];
  // 产品名
  prodName: string;
  // prod version
  prodVersion: string;
  static names(): { [key: string]: string } {
    return {
      appInfos: 'app_infos',
      prodName: 'prod_name',
      prodVersion: 'prod_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appInfos: { 'type': 'array', 'itemType': AppInfo },
      prodName: 'string',
      prodVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用SRE信息，云游资产使用。
export class Admin extends $tea.Model {
  // 应用SRE邮箱，云游资产使用。
  adminEmail?: string;
  // 应用SRE登陆名，云游资产使用。
  adminLoginName?: string;
  // 应用SRE昵称，云游资产使用
  adminNickName?: string;
  // 应用SRE真实名称，云游资产使用
  adminRealName?: string;
  // 应用SRE员工号，云游资产使用
  adminStaffNo?: string;
  static names(): { [key: string]: string } {
    return {
      adminEmail: 'admin_email',
      adminLoginName: 'admin_login_name',
      adminNickName: 'admin_nick_name',
      adminRealName: 'admin_real_name',
      adminStaffNo: 'admin_staff_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      adminEmail: 'string',
      adminLoginName: 'string',
      adminNickName: 'string',
      adminRealName: 'string',
      adminStaffNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用PreviewTask
export class AppPreviewTask extends $tea.Model {
  // app name
  appName: string;
  // 是否需要部署
  needDeploy: boolean;
  static names(): { [key: string]: string } {
    return {
      appName: 'app_name',
      needDeploy: 'need_deploy',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appName: 'string',
      needDeploy: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 测试用例详情
export class AutoTestCase extends $tea.Model {
  // 测试应用本身的名字
  appName: string;
  // 测试应用本身的版本
  appVersion: string;
  // case的级别
  caseLevel: string;
  // case的名字
  caseName: string;
  // case的状态
  caseStatus: string;
  // case的类型
  caseType: string;
  // case的类
  className: string;
  // 详情
  detail?: string;
  // case运行的时间，单位毫秒
  duration: number;
  // case的id
  id: string;
  // 测试方法名
  methodName: string;
  static names(): { [key: string]: string } {
    return {
      appName: 'app_name',
      appVersion: 'app_version',
      caseLevel: 'case_level',
      caseName: 'case_name',
      caseStatus: 'case_status',
      caseType: 'case_type',
      className: 'class_name',
      detail: 'detail',
      duration: 'duration',
      id: 'id',
      methodName: 'method_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appName: 'string',
      appVersion: 'string',
      caseLevel: 'string',
      caseName: 'string',
      caseStatus: 'string',
      caseType: 'string',
      className: 'string',
      detail: 'string',
      duration: 'number',
      id: 'string',
      methodName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据库实例。
export class Database extends $tea.Model {
  // acgotonecore_db_-4784849131397729849。
  name?: string;
  // 数据库访问端口。
  port?: number;
  // 数据库类型。MYSQL  |  OCEANBASE。
  provider?: string;
  // 实例id。
  resourceId?: string;
  // 资源池id。
  resourcePoolId?: string;
  // 数据库访问地址。
  url?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      port: 'port',
      provider: 'provider',
      resourceId: 'resource_id',
      resourcePoolId: 'resource_pool_id',
      url: 'url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      port: 'number',
      provider: 'string',
      resourceId: 'string',
      resourcePoolId: 'string',
      url: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用服务实例详情。
export class AppServiceInfo extends $tea.Model {
  // 应用名称
  appName?: string;
  // 应用版本
  appVersion?: string;
  // 所属单元ID
  cellId: string;
  // 容器列表。
  containers?: Container[];
  // 部署单元名称，产品实例下唯一。
  deployUnit?: string;
  // 环境唯一标识。
  envId?: string;
  // 应用服务实例唯一标识。
  id?: string;
  // 产品码
  productCode?: string;
  // 所属产品分组唯一标识。
  productGroupIdentity?: string;
  // 所属产品分组名称。
  productGroupName?: string;
  // 应用服务实例状态。DEPLOYING: 部署中；UPGRADING: 升级中；ROLL_BACKING: 回滚中；ACTIVE：可用；FAILED: 部署失败；ROLLBACKED: 已回滚。
  status?: string;
  static names(): { [key: string]: string } {
    return {
      appName: 'app_name',
      appVersion: 'app_version',
      cellId: 'cell_id',
      containers: 'containers',
      deployUnit: 'deploy_unit',
      envId: 'env_id',
      id: 'id',
      productCode: 'product_code',
      productGroupIdentity: 'product_group_identity',
      productGroupName: 'product_group_name',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appName: 'string',
      appVersion: 'string',
      cellId: 'string',
      containers: { 'type': 'array', 'itemType': Container },
      deployUnit: 'string',
      envId: 'string',
      id: 'string',
      productCode: 'string',
      productGroupIdentity: 'string',
      productGroupName: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 云游环境信息。
export class Env extends $tea.Model {
  // cellGroup的列表
  cellGroups: CellGroup[];
  // 云信息
  cloud: Cloud;
  // 关联的ake集群id
  clusterId: string;
  // 环境名
  displayName?: string;
  // 环境的id
  envId: string;
  // （已废弃）环境唯一标识。
  id?: string;
  // 是否ldc环境
  ldc: boolean;
  // 环境名称。
  name: string;
  // （已废弃）环境底座iaas技术栈。
  stack?: string;
  // 租户信息
  tenant?: Tenant;
  // 工作空间列表
  workspaces: Workspace[];
  // （已废弃）兼容逻辑老的workspace逻辑，非监控产品勿依赖。
  workspaceId?: string;
  // 环境类型
  envType: string;
  static names(): { [key: string]: string } {
    return {
      cellGroups: 'cell_groups',
      cloud: 'cloud',
      clusterId: 'cluster_id',
      displayName: 'display_name',
      envId: 'env_id',
      id: 'id',
      ldc: 'ldc',
      name: 'name',
      stack: 'stack',
      tenant: 'tenant',
      workspaces: 'workspaces',
      workspaceId: 'workspace_id',
      envType: 'env_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cellGroups: { 'type': 'array', 'itemType': CellGroup },
      cloud: Cloud,
      clusterId: 'string',
      displayName: 'string',
      envId: 'string',
      id: 'string',
      ldc: 'boolean',
      name: 'string',
      stack: 'string',
      tenant: Tenant,
      workspaces: { 'type': 'array', 'itemType': Workspace },
      workspaceId: 'string',
      envType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 负载均衡后端服务器。
export class BackendServer extends $tea.Model {
  // 容器id。
  containerId?: string;
  // 容器所在的资源池id。
  containerResourcePoolId?: string;
  // 资源池id。
  lbResourcePoolId?: string;
  // 负载均衡实例id。
  loadBalancerId?: string;
  // 权重。
  weight?: number;
  static names(): { [key: string]: string } {
    return {
      containerId: 'container_id',
      containerResourcePoolId: 'container_resource_pool_id',
      lbResourcePoolId: 'lb_resource_pool_id',
      loadBalancerId: 'load_balancer_id',
      weight: 'weight',
    };
  }

  static types(): { [key: string]: any } {
    return {
      containerId: 'string',
      containerResourcePoolId: 'string',
      lbResourcePoolId: 'string',
      loadBalancerId: 'string',
      weight: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 监听器。
export class Listener extends $tea.Model {
  // 后端端口。
  backendServerPort?: number;
  // 前端端口。
  listenerPort?: number;
  // 负载均衡实例id。
  loadBalancerId?: string;
  // 监听器协议。HTTP/HTTPS/TCP
  protocol?: string;
  // 资源池id。
  resourcePoolId?: string;
  static names(): { [key: string]: string } {
    return {
      backendServerPort: 'backend_server_port',
      listenerPort: 'listener_port',
      loadBalancerId: 'load_balancer_id',
      protocol: 'protocol',
      resourcePoolId: 'resource_pool_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      backendServerPort: 'number',
      listenerPort: 'number',
      loadBalancerId: 'string',
      protocol: 'string',
      resourcePoolId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用Owner信息
export class Owner extends $tea.Model {
  // 应用Owner邮箱，云游资产使用。
  ownerEmail?: string;
  // 应用Owner登陆名，云游资产使用。
  ownerLoginName?: string;
  // 应用Owner昵称，云游资产使用。
  ownerNickName?: string;
  // 应用Owner真实名称，云游资产使用。
  ownerRealName?: string;
  // 应用Owner员工号，云游资产使用。
  ownerStaffNo?: string;
  static names(): { [key: string]: string } {
    return {
      ownerEmail: 'owner_email',
      ownerLoginName: 'owner_login_name',
      ownerNickName: 'owner_nick_name',
      ownerRealName: 'owner_real_name',
      ownerStaffNo: 'owner_staff_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ownerEmail: 'string',
      ownerLoginName: 'string',
      ownerNickName: 'string',
      ownerRealName: 'string',
      ownerStaffNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发布单
export class OpsPlan extends $tea.Model {
  // id
  id: string;
  // 名称
  name: string;
  // 环境Id
  envId: string;
  // 解决方案Id
  solutionId: string;
  // 发布单类型
  opsType: string;
  // 发布单类型
  planType: string;
  // 创建人id
  creator: string;
  // 创建人名称
  creatorName: string;
  // 发布单状态
  opsPlanStatus: string;
  // 创建时间
  utcCreate: string;
  // 修改时间
  utcModified: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      envId: 'env_id',
      solutionId: 'solution_id',
      opsType: 'ops_type',
      planType: 'plan_type',
      creator: 'creator',
      creatorName: 'creator_name',
      opsPlanStatus: 'ops_plan_status',
      utcCreate: 'utc_create',
      utcModified: 'utc_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      envId: 'string',
      solutionId: 'string',
      opsType: 'string',
      planType: 'string',
      creator: 'string',
      creatorName: 'string',
      opsPlanStatus: 'string',
      utcCreate: 'string',
      utcModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 系统参数
export class SystemParameterInfo extends $tea.Model {
  // 参数名
  type: string;
  // 参数值
  value: string;
  // 环境Id
  envId: string;
  // 参数描述
  description?: string;
  // 记录id
  id?: string;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      value: 'value',
      envId: 'env_id',
      description: 'description',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      value: 'string',
      envId: 'string',
      description: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 云游应用元数据
export class Application extends $tea.Model {
  // 应用英文名
  applicationName?: string;
  // 应用所属的产品的产品码
  productCode?: string;
  static names(): { [key: string]: string } {
    return {
      applicationName: 'application_name',
      productCode: 'product_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      applicationName: 'string',
      productCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 部署单元实例信息
export class UnitInstanceInfo extends $tea.Model {
  // 部署单元内服务实例列表
  appServices: AppServiceInfo[];
  static names(): { [key: string]: string } {
    return {
      appServices: 'app_services',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appServices: { 'type': 'array', 'itemType': AppServiceInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 单元内的资源
export class UnitResource extends $tea.Model {
  // 资源地址
  address: string;
  // 环境标识
  envId: string;
  // 资源ID
  id: string;
  // 资源名称
  name: string;
  // 资源端口
  port?: number;
  // 资源类型:CONTAINER,LB,DB,CACHE,APP,STORAGE
  resourceType: string;
  // zone标识
  zoneId: string;
  static names(): { [key: string]: string } {
    return {
      address: 'address',
      envId: 'env_id',
      id: 'id',
      name: 'name',
      port: 'port',
      resourceType: 'resource_type',
      zoneId: 'zone_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      address: 'string',
      envId: 'string',
      id: 'string',
      name: 'string',
      port: 'number',
      resourceType: 'string',
      zoneId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 装箱数据
export class BoxData extends $tea.Model {
  // 装箱数据类型
  type: string;
  // 装箱的json数据
  data: string;
  // 装箱数据版本
  version: string;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      data: 'data',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      data: 'string',
      version: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 自动化测试的节点日志
export class AutoTestLog extends $tea.Model {
  // 日志id
  id: string;
  // 日志内容
  message: string;
  // 节点执行的动作
  nodeAction: string;
  // 节点id
  nodeId: string;
  // 节点所处的阶段
  stage: string;
  // 创建时间
  utcCreate: string;
  // 修改时间
  utcModified: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      message: 'message',
      nodeAction: 'node_action',
      nodeId: 'node_id',
      stage: 'stage',
      utcCreate: 'utc_create',
      utcModified: 'utc_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      message: 'string',
      nodeAction: 'string',
      nodeId: 'string',
      stage: 'string',
      utcCreate: 'string',
      utcModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 集群pod信息
export class ClusterInfo extends $tea.Model {
  // 产品信息
  prodInfos: ProdInfo[];
  static names(): { [key: string]: string } {
    return {
      prodInfos: 'prod_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      prodInfos: { 'type': 'array', 'itemType': ProdInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 产品预览任务
export class ProdPreviewTasks extends $tea.Model {
  // 应用是否需要部署
  appPreviewTasks: AppPreviewTask[];
  static names(): { [key: string]: string } {
    return {
      appPreviewTasks: 'app_preview_tasks',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appPreviewTasks: { 'type': 'array', 'itemType': AppPreviewTask },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 产品实例。
export class ProductInstance extends $tea.Model {
  // 单元ID
  cellId?: string;
  // 产品实例所在的环境唯一标识。
  envId?: string;
  // 产品码。
  productCode?: string;
  // 产品版本。
  productVersion?: string;
  // 产品基线状态
  status?: string;
  // 产品创建时间
  utcCreate?: string;
  // 产品修改时间
  utcModified?: string;
  // 产品拓扑id
  deployTopologyIdentity?: string;
  // 部署规格id
  deploySpecIdentity?: string;
  static names(): { [key: string]: string } {
    return {
      cellId: 'cell_id',
      envId: 'env_id',
      productCode: 'product_code',
      productVersion: 'product_version',
      status: 'status',
      utcCreate: 'utc_create',
      utcModified: 'utc_modified',
      deployTopologyIdentity: 'deploy_topology_identity',
      deploySpecIdentity: 'deploy_spec_identity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cellId: 'string',
      envId: 'string',
      productCode: 'string',
      productVersion: 'string',
      status: 'string',
      utcCreate: 'string',
      utcModified: 'string',
      deployTopologyIdentity: 'string',
      deploySpecIdentity: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 节点执行日志
export class NodeExecutionLog extends $tea.Model {
  // 当前节点的动作
  nodeAction: string;
  // 当前节点的执行日志信息
  message: string;
  static names(): { [key: string]: string } {
    return {
      nodeAction: 'node_action',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      nodeAction: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 负载均衡实例。
export class LoadBalancer extends $tea.Model {
  // 地址类型。INTRANET/INTERNET/OFFICE
  addressType?: string;
  // 后端服务器列表。
  backendServers?: BackendServer[];
  // 实例域名。
  domain?: string;
  // 监听器列表。
  listeners?: Listener[];
  // 实例名称。
  name?: string;
  // 类型。SLB/ALB。
  provider?: string;
  // 实例id。
  resourceId?: string;
  // 资源池id。
  resourcePoolId?: string;
  // vip地址。
  vip?: string;
  static names(): { [key: string]: string } {
    return {
      addressType: 'address_type',
      backendServers: 'backend_servers',
      domain: 'domain',
      listeners: 'listeners',
      name: 'name',
      provider: 'provider',
      resourceId: 'resource_id',
      resourcePoolId: 'resource_pool_id',
      vip: 'vip',
    };
  }

  static types(): { [key: string]: any } {
    return {
      addressType: 'string',
      backendServers: { 'type': 'array', 'itemType': BackendServer },
      domain: 'string',
      listeners: { 'type': 'array', 'itemType': Listener },
      name: 'string',
      provider: 'string',
      resourceId: 'string',
      resourcePoolId: 'string',
      vip: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 自动化测试工单中的产品
export class AutoTestProduct extends $tea.Model {
  // 部署单元id
  deployUnit?: string;
  // 产品码
  prodCode: string;
  // 应用启动参数数据
  appParamData?: AppParamData[];
  static names(): { [key: string]: string } {
    return {
      deployUnit: 'deploy_unit',
      prodCode: 'prod_code',
      appParamData: 'app_param_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deployUnit: 'string',
      prodCode: 'string',
      appParamData: { 'type': 'array', 'itemType': AppParamData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// （已废弃，请使用AppServiceInfo）一个环境中部署的应用服务信息。
export class AppService extends $tea.Model {
  // 应用英文名。
  appName?: string;
  // 应用版本
  appVersion?: string;
  // 单元ID
  cellId?: string;
  // 部署单元名称，产品实例下唯一。
  deployUnit?: string;
  // 部署域。
  deployZone?: string;
  // 环境唯一标识
  envId?: string;
  // 应用服务实例唯一标识。
  id?: string;
  // 应用所属的产品的产品码
  productCode?: string;
  // 应用服务实例状态。DEPLOYING: 部署中；UPGRADING: 升级中；ROLL_BACKING: 回滚中；ACTIVE：可用；FAILED: 部署失败；ROLLBACKED: 已回滚。
  status?: string;
  // 应用类型：BUSINESS | JOB | CONTROLLER
  appType?: string;
  // 应用显示名称，云游资产使用
  appDisplayName?: string;
  // 应用等级，云游资产使用
  appLevel?: string;
  // 租户信息，云游资产使用。
  tenantId?: string;
  // 产品码--应用名
  productApp?: string;
  // 产品Owner
  owner?: Owner;
  // 应用SRE信息
  admin?: Admin;
  // 副本数
  expectReplica?: number;
  // 镜像
  image?: string;
  // 2G
  cpu?: number;
  // 内存资源
  memory?: number;
  static names(): { [key: string]: string } {
    return {
      appName: 'app_name',
      appVersion: 'app_version',
      cellId: 'cell_id',
      deployUnit: 'deploy_unit',
      deployZone: 'deploy_zone',
      envId: 'env_id',
      id: 'id',
      productCode: 'product_code',
      status: 'status',
      appType: 'app_type',
      appDisplayName: 'app_display_name',
      appLevel: 'app_level',
      tenantId: 'tenant_id',
      productApp: 'product_app',
      owner: 'owner',
      admin: 'admin',
      expectReplica: 'expect_replica',
      image: 'image',
      cpu: 'cpu',
      memory: 'memory',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appName: 'string',
      appVersion: 'string',
      cellId: 'string',
      deployUnit: 'string',
      deployZone: 'string',
      envId: 'string',
      id: 'string',
      productCode: 'string',
      status: 'string',
      appType: 'string',
      appDisplayName: 'string',
      appLevel: 'string',
      tenantId: 'string',
      productApp: 'string',
      owner: Owner,
      admin: Admin,
      expectReplica: 'number',
      image: 'string',
      cpu: 'number',
      memory: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 回滚快照
export class DeploymentUnitSnapshotOP extends $tea.Model {
  // 环境ID
  envId?: string;
  // 产品码
  prodCode?: string;
  // 产品版本
  prodVersion?: string;
  // 关联的解决方案id
  solutionId?: string;
  // 快照关联的发布单id
  opsPlanId?: string;
  // 快照版本, 根据日期生成 
  snapshotVersion?: string;
  // 快照创建时间
  snapshotTime?: string;
  // 部署单元实例唯一标识
  deploymentUnitInstanceIdentity?: string;
  // 部署单元唯一标识
  deploymentUnitIdentity?: string;
  // 部署拓扑
  deployTopologyIdentity?: string;
  // 应用回滚快照
  appSnapshot?: string[];
  static names(): { [key: string]: string } {
    return {
      envId: 'env_id',
      prodCode: 'prod_code',
      prodVersion: 'prod_version',
      solutionId: 'solution_id',
      opsPlanId: 'ops_plan_id',
      snapshotVersion: 'snapshot_version',
      snapshotTime: 'snapshot_time',
      deploymentUnitInstanceIdentity: 'deployment_unit_instance_identity',
      deploymentUnitIdentity: 'deployment_unit_identity',
      deployTopologyIdentity: 'deploy_topology_identity',
      appSnapshot: 'app_snapshot',
    };
  }

  static types(): { [key: string]: any } {
    return {
      envId: 'string',
      prodCode: 'string',
      prodVersion: 'string',
      solutionId: 'string',
      opsPlanId: 'string',
      snapshotVersion: 'string',
      snapshotTime: 'string',
      deploymentUnitInstanceIdentity: 'string',
      deploymentUnitIdentity: 'string',
      deployTopologyIdentity: 'string',
      appSnapshot: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 解决方案检查项
export class CheckPoint extends $tea.Model {
  // 检查结果
  checkResult: string;
  // 检查点, 例如参数检查
  checkPoint: string;
  // 非法原因
  invalidReason?: string;
  static names(): { [key: string]: string } {
    return {
      checkResult: 'check_result',
      checkPoint: 'check_point',
      invalidReason: 'invalid_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      checkResult: 'string',
      checkPoint: 'string',
      invalidReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户删除
export class UserAuth extends $tea.Model {
  // 授权条件,  Local的授权条件使用正则规则, 其中 # 为特殊分隔符, 在权限比较时需要移除该符号
  condition: string;
  // YUNYOU_LOCAL_AUTH_KEY
  conditionKey: string;
  // 用户昵称, 如果是域内, 就是花名
  nickName?: string;
  // 是否为负责人
  primary: boolean;
  // 用户姓名
  realName: string;
  // PROCESS_ENGINEER: 全局运维工程师
  // PROD_PROCESS_ENGINEER: 产品运维工程师
  // DELIVERY_ENGINEER: 交付工程师
  // ENV_MANAGER: 环境管理员
  // LOCAL_OBSERVER: 观察者
  // AKE_PROCESS_ENGINEER: AKE运维工程师
  role: string;
  // ID来源, 该ID用于Global和Local进行信息同步使用, 因此该值就是域账号
  sourceId?: string;
  // 授权状态,
  // WAIT_REGIST: 等待用户注册
  // ACTIVE: 授权已经生效
  // DELETED: 授权已经删除
  status: string;
  // 用户ID, 该值为IAM上的User.ID属性
  userId: string;
  static names(): { [key: string]: string } {
    return {
      condition: 'condition',
      conditionKey: 'condition_key',
      nickName: 'nick_name',
      primary: 'primary',
      realName: 'real_name',
      role: 'role',
      sourceId: 'source_id',
      status: 'status',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      condition: 'string',
      conditionKey: 'string',
      nickName: 'string',
      primary: 'boolean',
      realName: 'string',
      role: 'string',
      sourceId: 'string',
      status: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 解决方案
export class SolutionInstance extends $tea.Model {
  // 解决方案id
  solutionId: string;
  // 环境ID
  envId: string;
  // 解决方案的名字
  name: string;
  // 解决方案的状态
  status: string;
  static names(): { [key: string]: string } {
    return {
      solutionId: 'solution_id',
      envId: 'env_id',
      name: 'name',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      solutionId: 'string',
      envId: 'string',
      name: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 测试用例是否可执行
export class AutoTestAvailableProdOption extends $tea.Model {
  // 是否可执行测试用例	
  isRunnable: boolean;
  // 不能执行自动化测试用例的原因	
  // 
  message: string;
  // 部署单元唯一标识（元数据）	
  // 
  deploymentUnitIdentity: string;
  // 部署单元实例唯一标识	
  identity: string;
  // 产品码
  prodCode: string;
  static names(): { [key: string]: string } {
    return {
      isRunnable: 'is_runnable',
      message: 'message',
      deploymentUnitIdentity: 'deployment_unit_identity',
      identity: 'identity',
      prodCode: 'prod_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      isRunnable: 'boolean',
      message: 'string',
      deploymentUnitIdentity: 'string',
      identity: 'string',
      prodCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 云游系统信息
export class System extends $tea.Model {
  // 系统的代码commit
  commitId: string;
  // 管理的环境列表
  envs: Env[];
  // 支持的OpenAPI列表
  openApis: OpenAPI[];
  // 云游的产品版本号, 该值可能为空
  version?: string;
  static names(): { [key: string]: string } {
    return {
      commitId: 'commit_id',
      envs: 'envs',
      openApis: 'open_apis',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      commitId: 'string',
      envs: { 'type': 'array', 'itemType': Env },
      openApis: { 'type': 'array', 'itemType': OpenAPI },
      version: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 产品测试结果
export class AutoTestProdResult extends $tea.Model {
  // 测试用例
  cases: AutoTestCase[];
  // 容器信息
  containers: ContainerInfo[];
  // 部署单元id
  deployUnit: string;
  // 产品码
  prodCode: string;
  // 产品测试状态
  status: string;
  // 测试创建时间
  utcCreate: string;
  // 结束时间
  utcEnd?: string;
  // 测试修改时间
  utcModified: string;
  // 测试开始时间
  utcStart?: string;
  // 单元的id
  cellId: string;
  static names(): { [key: string]: string } {
    return {
      cases: 'cases',
      containers: 'containers',
      deployUnit: 'deploy_unit',
      prodCode: 'prod_code',
      status: 'status',
      utcCreate: 'utc_create',
      utcEnd: 'utc_end',
      utcModified: 'utc_modified',
      utcStart: 'utc_start',
      cellId: 'cell_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cases: { 'type': 'array', 'itemType': AutoTestCase },
      containers: { 'type': 'array', 'itemType': ContainerInfo },
      deployUnit: 'string',
      prodCode: 'string',
      status: 'string',
      utcCreate: 'string',
      utcEnd: 'string',
      utcModified: 'string',
      utcStart: 'string',
      cellId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 部署单元。
export class DeployUnit extends $tea.Model {
  // 单元ID
  cellId: string;
  // 环境唯一标识。
  envId: string;
  // 部署单元id，产品实例下唯一。
  identity: string;
  // 部署单元名称。
  name: string;
  // 产品码。
  productCode: string;
  // 用户传入部署单元标识，如果没有传入，则为deployment_unit_identity
  unitIg: string;
  static names(): { [key: string]: string } {
    return {
      cellId: 'cell_id',
      envId: 'env_id',
      identity: 'identity',
      name: 'name',
      productCode: 'product_code',
      unitIg: 'unit_ig',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cellId: 'string',
      envId: 'string',
      identity: 'string',
      name: 'string',
      productCode: 'string',
      unitIg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据库schema
export class Schema extends $tea.Model {
  // schema所属的数据库实例信息。
  database?: Database;
  // schema名称。
  name?: string;
  // 资源所属的资源池id。
  resourcePoolId?: string;
  static names(): { [key: string]: string } {
    return {
      database: 'database',
      name: 'name',
      resourcePoolId: 'resource_pool_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      database: Database,
      name: 'string',
      resourcePoolId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// http配置
export class HTTP extends $tea.Model {
  // 检查path
  path: string;
  // http schema
  scheme: string;
  // port
  port: number;
  static names(): { [key: string]: string } {
    return {
      path: 'path',
      scheme: 'scheme',
      port: 'port',
    };
  }

  static types(): { [key: string]: any } {
    return {
      path: 'string',
      scheme: 'string',
      port: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 宿主机挂载配置，比如：挂载路径、目录还是文件
export class HostPathVolumeSource extends $tea.Model {
  // 宿主机挂载的路径
  path: string;
  //   挂载的类型：  FILE("File"),
  //     DIRECTORY("Directory");
  type: string;
  static names(): { [key: string]: string } {
    return {
      path: 'path',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      path: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 持久化存储数据卷配置
export class PersistentVolumeSource extends $tea.Model {
  //     READWRITEONCE("ReadWriteOnce"),
  //     READONLYMANY("ReadOnlyMany"),
  //     READWRITEMANY("ReadWriteMany");
  accessModes: string[];
  static names(): { [key: string]: string } {
    return {
      accessModes: 'access_modes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accessModes: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 探针配置Exec
export class Exec extends $tea.Model {
  // args
  args: string[];
  // cmd
  cmd: string;
  static names(): { [key: string]: string } {
    return {
      args: 'args',
      cmd: 'cmd',
    };
  }

  static types(): { [key: string]: any } {
    return {
      args: { 'type': 'array', 'itemType': 'string' },
      cmd: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 检测配置
export class TCP extends $tea.Model {
  // tcp port
  port: number;
  static names(): { [key: string]: string } {
    return {
      port: 'port',
    };
  }

  static types(): { [key: string]: any } {
    return {
      port: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用数据卷配置项，主要涉及：挂载路径、是否只读、挂载传递方式
export class MountOptions extends $tea.Model {
  // 容器内挂载路径
  mountPath: string;
  // 是否只读，默认false
  readOnly: string;
  // 挂载传递策略：    NONE("None"),
  //     HOSTTOCONTAINER("HostToContainer"),
  //     BIDIRECTIONAL("Bidirectional");
  // 
  mountPropagation: string;
  static names(): { [key: string]: string } {
    return {
      mountPath: 'mount_path',
      readOnly: 'read_only',
      mountPropagation: 'mount_propagation',
    };
  }

  static types(): { [key: string]: any } {
    return {
      mountPath: 'string',
      readOnly: 'string',
      mountPropagation: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 探针配置
export class ProbeConfig extends $tea.Model {
  // 超时时间，单位s
  timeout: string;
  // exec
  exec?: Exec;
  // http
  http?: HTTP;
  // tcp
  tcp?: TCP;
  static names(): { [key: string]: string } {
    return {
      timeout: 'timeout',
      exec: 'exec',
      http: 'http',
      tcp: 'tcp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      timeout: 'string',
      exec: Exec,
      http: HTTP,
      tcp: TCP,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 灰度发布策略
export class GrayRelease extends $tea.Model {
  // 需要更新到的副本数，比如：应用A有10个副本，本次更新updated_replicas=5，则会更新前5个
  updatedReplicas?: number;
  //     发布策略：TWO_GROUP("TWO_GROUP", "分两组"),
  //     ALL_ONE("ALL_ONE", "共分一组"),
  //     EACH_ONE("EACH_ONE", "每台一组"),
  //     SYSTEM_RECOMMENDATION("SYSTEM_RECOMMENDATION", "系统推荐"),
  //     CUSTOMIZE("CUSTOMIZE", "自定义分组")
  releaseStrategy: string;
  static names(): { [key: string]: string } {
    return {
      updatedReplicas: 'updated_replicas',
      releaseStrategy: 'release_strategy',
    };
  }

  static types(): { [key: string]: any } {
    return {
      updatedReplicas: 'number',
      releaseStrategy: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据卷挂载方式，比如：宿主机挂载、PV持久化存储挂载
export class VolumeSource extends $tea.Model {
  // 宿主机模式配置
  hostPath?: HostPathVolumeSource;
  // 和Host二选一
  persistentVolume?: PersistentVolumeSource;
  static names(): { [key: string]: string } {
    return {
      hostPath: 'host_path',
      persistentVolume: 'persistent_volume',
    };
  }

  static types(): { [key: string]: any } {
    return {
      hostPath: HostPathVolumeSource,
      persistentVolume: PersistentVolumeSource,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据库变更
export class SQLMigration extends $tea.Model {
  // 变更名称
  key: string;
  // 产品升级变更sql
  upgrade: string;
  // 回滚变更sql
  downgrade?: string;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      upgrade: 'upgrade',
      downgrade: 'downgrade',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      upgrade: 'string',
      downgrade: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AAP 应用亲和性配置
export class AffinityConfig extends $tea.Model {
  // 尽量满足的应用列表
  preferred?: string[];
  // 必须满足的应用列表
  required?: string[];
  static names(): { [key: string]: string } {
    return {
      preferred: 'preferred',
      required: 'required',
    };
  }

  static types(): { [key: string]: any } {
    return {
      preferred: { 'type': 'array', 'itemType': 'string' },
      required: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据卷规格
export class VolumeSpec extends $tea.Model {
  // 数据卷名称
  volumeName: string;
  // 数据卷容量，单位为G
  capacity: string;
  static names(): { [key: string]: string } {
    return {
      volumeName: 'volume_name',
      capacity: 'capacity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      volumeName: 'string',
      capacity: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 参数模版
export class ParameterTemplate extends $tea.Model {
  // template模板值
  template: string;
  // target 模版对象
  target?: string;
  static names(): { [key: string]: string } {
    return {
      template: 'template',
      target: 'target',
    };
  }

  static types(): { [key: string]: any } {
    return {
      template: 'string',
      target: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 产品实例元数据
export class ProductInstanceMeta extends $tea.Model {
  // 命名空间
  namespace: string;
  // 产品Code
  prodCode: string;
  // 实例名称，同一个ns下不可重复
  name: string;
  static names(): { [key: string]: string } {
    return {
      namespace: 'namespace',
      prodCode: 'prod_code',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      namespace: 'string',
      prodCode: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 参数
export class Parameter extends $tea.Model {
  // 参数默认值
  default: string;
  // 参数key
  key: string;
  //  参数描述
  description: string;
  // 参数类型        MANUAL("manual"),
  //         CONSTANT("constant"),
  //         EXPRESSION("expression");
  kind: string;
  // 是否必须
  required: boolean;
  // 参数模版
  parameters: ParameterTemplate[];
  //         STRING("string"),
  //         SECRET("secret"),
  //         INT("int"),
  //         FLOAT("float"),
  //         ANY("any");
  type: string;
  static names(): { [key: string]: string } {
    return {
      default: 'default',
      key: 'key',
      description: 'description',
      kind: 'kind',
      required: 'required',
      parameters: 'parameters',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      default: 'string',
      key: 'string',
      description: 'string',
      kind: 'string',
      required: 'boolean',
      parameters: { 'type': 'array', 'itemType': ParameterTemplate },
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 持久化存储配置
export class PersistentVolumeConfig extends $tea.Model {
  // 挂载名称
  volumeName: string;
  //     挂载的获取名称，默认：ReadWriteOnce。READWRITEONCE("ReadWriteOnce"),
  //     READONLYMANY("ReadOnlyMany"),
  //     READWRITEMANY("ReadWriteMany");
  accessModes?: string[];
  // 存储类
  storageClass?: string;
  // 是否使用匿名卷，，默认false
  useEmptyDir: boolean;
  static names(): { [key: string]: string } {
    return {
      volumeName: 'volume_name',
      accessModes: 'access_modes',
      storageClass: 'storage_class',
      useEmptyDir: 'use_empty_dir',
    };
  }

  static types(): { [key: string]: any } {
    return {
      volumeName: 'string',
      accessModes: { 'type': 'array', 'itemType': 'string' },
      storageClass: 'string',
      useEmptyDir: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AAP应用数据卷元数据
export class Volume extends $tea.Model {
  // 数据卷名称
  name: string;
  //  可挂载的配置
  volumeSource: VolumeSource;
  // 数据卷配置
  mountOptions: MountOptions;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      volumeSource: 'volume_source',
      mountOptions: 'mount_options',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      volumeSource: VolumeSource,
      mountOptions: MountOptions,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用部署拓扑约束，比如：亲和性、反亲和性、sidecar等
export class TopologyConstraints extends $tea.Model {
  // 亲和性配置
  affinity?: AffinityConfig;
  // 反亲和性配置
  antiAffinity?: AffinityConfig;
  // sidecar应用列表
  sidecars?: string[];
  static names(): { [key: string]: string } {
    return {
      affinity: 'affinity',
      antiAffinity: 'anti_affinity',
      sidecars: 'sidecars',
    };
  }

  static types(): { [key: string]: any } {
    return {
      affinity: AffinityConfig,
      antiAffinity: AffinityConfig,
      sidecars: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 资源规格
export class ResourceSpec extends $tea.Model {
  // cpu规格
  cpu: string;
  // gpu规格
  gpu?: string;
  // memory
  memory: string;
  // 规格名称
  name: string;
  // 应用副本数
  replicas: number;
  // 数据卷规格
  volumes: VolumeSpec[];
  static names(): { [key: string]: string } {
    return {
      cpu: 'cpu',
      gpu: 'gpu',
      memory: 'memory',
      name: 'name',
      replicas: 'replicas',
      volumes: 'volumes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cpu: 'string',
      gpu: 'string',
      memory: 'string',
      name: 'string',
      replicas: 'number',
      volumes: { 'type': 'array', 'itemType': VolumeSpec },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 底座配置
export class CloudStackConfig extends $tea.Model {
  // 阿里云accessKey获取
  accessKey: string;
  // 云游加密后的accessKeySecret
  encryptedAccessKeySecret: string;
  // 底座所在的region
  region: string;
  // 底座可用区
  zone: string;
  // 底座类型
  type: string;
  static names(): { [key: string]: string } {
    return {
      accessKey: 'access_key',
      encryptedAccessKeySecret: 'encrypted_access_key_secret',
      region: 'region',
      zone: 'zone',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accessKey: 'string',
      encryptedAccessKeySecret: 'string',
      region: 'string',
      zone: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用生命周期
export class Lifecycle extends $tea.Model {
  // 存活探针
  liveness?: ProbeConfig;
  // readiness
  readiness?: ProbeConfig;
  // preStop
  preStop?: ProbeConfig;
  // postStart
  postStart?: ProbeConfig;
  // startUp
  startUp?: ProbeConfig;
  // entrypoint
  entrypoint?: ProbeConfig;
  static names(): { [key: string]: string } {
    return {
      liveness: 'liveness',
      readiness: 'readiness',
      preStop: 'pre_stop',
      postStart: 'post_start',
      startUp: 'start_up',
      entrypoint: 'entrypoint',
    };
  }

  static types(): { [key: string]: any } {
    return {
      liveness: ProbeConfig,
      readiness: ProbeConfig,
      preStop: ProbeConfig,
      postStart: ProbeConfig,
      startUp: ProbeConfig,
      entrypoint: ProbeConfig,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AAP 应用实例环境变量值
export class AppEnv extends $tea.Model {
  // 应用部署时用于渲染的值，渲染为value
  renderValue: string;
  // 参数的值，部署的时候会被render_value的渲染结果覆盖
  value: string;
  // 参数的key
  key: string;
  static names(): { [key: string]: string } {
    return {
      renderValue: 'render_value',
      value: 'value',
      key: 'key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      renderValue: 'string',
      value: 'string',
      key: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据库schema
export class DatabaseSchema extends $tea.Model {
  // 数据库方言
  dialect: string;
  // 数据库schema名称
  name: string;
  // 拓扑名称
  topoCode: string;
  // schema数据库变更
  sqlMigrations: SQLMigration[];
  static names(): { [key: string]: string } {
    return {
      dialect: 'dialect',
      name: 'name',
      topoCode: 'topo_code',
      sqlMigrations: 'sql_migrations',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dialect: 'string',
      name: 'string',
      topoCode: 'string',
      sqlMigrations: { 'type': 'array', 'itemType': SQLMigration },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用镜像
export class ApplicationImage extends $tea.Model {
  // 架构:amd64，arm64
  arch: string;
  // 镜像名称
  image: string;
  static names(): { [key: string]: string } {
    return {
      arch: 'arch',
      image: 'image',
    };
  }

  static types(): { [key: string]: any } {
    return {
      arch: 'string',
      image: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用服务规格配置
export class ApplicationServiceSpec extends $tea.Model {
  // 服务域名
  domain?: string[];
  // 服务名称
  name: string;
  // 服务端口
  port: number;
  // 服务协议，http，tcp
  protocol: string;
  static names(): { [key: string]: string } {
    return {
      domain: 'domain',
      name: 'name',
      port: 'port',
      protocol: 'protocol',
    };
  }

  static types(): { [key: string]: any } {
    return {
      domain: { 'type': 'array', 'itemType': 'string' },
      name: 'string',
      port: 'number',
      protocol: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用发布配置
export class AppDeployInitOption extends $tea.Model {
  // 应用name
  name: string;
  // 产品内应用的依赖关系，决定应用的执行顺序
  releaseOrder: number;
  // 分组策略：
  //     TWO_GROUP("TWO_GROUP", "分两组"),
  //     ALL_ONE("ALL_ONE", "共分一组"),
  //     EACH_ONE("EACH_ONE", "每台一组"),
  //     SYSTEM_RECOMMENDATION("SYSTEM_RECOMMENDATION", "系统推荐")
  groupStrategy: string;
  // 分组是否需要手动确认，默认false
  needConfirm: boolean;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      releaseOrder: 'release_order',
      groupStrategy: 'group_strategy',
      needConfirm: 'need_confirm',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      releaseOrder: 'number',
      groupStrategy: 'string',
      needConfirm: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 运维配置
export class OpsSpec extends $tea.Model {
  // 需要下线的pod列表
  offlinePod?: string[];
  // 发布灰度策略
  grayRelease?: GrayRelease;
  static names(): { [key: string]: string } {
    return {
      offlinePod: 'offline_pod',
      grayRelease: 'gray_release',
    };
  }

  static types(): { [key: string]: any } {
    return {
      offlinePod: { 'type': 'array', 'itemType': 'string' },
      grayRelease: GrayRelease,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 产品元信息
export class ProductMeta extends $tea.Model {
  // 产品code
  code: string;
  // 产品名称
  name: string;
  // 产品标签
  labels?: string[];
  // 产品版本
  version: string;
  // 所属产品集
  group?: string;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      name: 'name',
      labels: 'labels',
      version: 'version',
      group: 'group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      name: 'string',
      labels: { 'type': 'array', 'itemType': 'string' },
      version: 'string',
      group: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 云游站点基本信息
export class EnvInfo extends $tea.Model {
  // 站点名称
  name: string;
  // 站点展示名称
  displayName: string;
  // IAM租户id
  tenantId: string;
  // 站点类型：DEV、PROD、SIT
  type: string;
  // 站点环境id
  envId: string;
  // 云环境站点类型
  cloudStack: string;
  // 客户名
  customerName: string;
  // 站点客户id
  customerId: string;
  // 站点资源前缀，云环境名称
  cloudName: string;
  // global云环境id
  cloudId: string;
  // global云环境中文名称
  realCloudName: string;
  // rdb资源池名称
  rdbPoolName: string;
  // 容器资源池ID
  containerPoolName: string;
  // lb资源池名称
  lbPoolName: string;
  // 对象资源池名称
  storagePoolName?: string;
  // ecs资源池名称
  ecsPoolName: string;
  // vpc资源池名称
  vpcPoolName: string;
  // dns资源池名称
  dnsPoolName: string;
  // keystone资源池名称
  keystonePoolName: string;
  // 底座配置
  cloudStackConfig: CloudStackConfig;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      displayName: 'display_name',
      tenantId: 'tenant_id',
      type: 'type',
      envId: 'env_id',
      cloudStack: 'cloud_stack',
      customerName: 'customer_name',
      customerId: 'customer_id',
      cloudName: 'cloud_name',
      cloudId: 'cloud_id',
      realCloudName: 'real_cloud_name',
      rdbPoolName: 'rdb_pool_name',
      containerPoolName: 'container_pool_name',
      lbPoolName: 'lb_pool_name',
      storagePoolName: 'storage_pool_name',
      ecsPoolName: 'ecs_pool_name',
      vpcPoolName: 'vpc_pool_name',
      dnsPoolName: 'dns_pool_name',
      keystonePoolName: 'keystone_pool_name',
      cloudStackConfig: 'cloud_stack_config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      displayName: 'string',
      tenantId: 'string',
      type: 'string',
      envId: 'string',
      cloudStack: 'string',
      customerName: 'string',
      customerId: 'string',
      cloudName: 'string',
      cloudId: 'string',
      realCloudName: 'string',
      rdbPoolName: 'string',
      containerPoolName: 'string',
      lbPoolName: 'string',
      storagePoolName: 'string',
      ecsPoolName: 'string',
      vpcPoolName: 'string',
      dnsPoolName: 'string',
      keystonePoolName: 'string',
      cloudStackConfig: CloudStackConfig,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// lb实例监听器
export class LbListener extends $tea.Model {
  // lb监听器协议：HTTP、TCP
  protocol: string;
  // 监听器端口
  listenerPort: number;
  // 监听器后端端口
  backendServerPort: number;
  // 后端转发端口
  backendServerForwardPort: number;
  // 健康检查开关
  healthMonitor: boolean;
  // 健康检查端口
  healthCheckPort: number;
  // 健康检查阈值
  healthCheckThreadhold: number;
  // 健康检查uri
  healthCheckUri?: string;
  // 健康检查间隔
  healthCheckInterval: number;
  // 健康检查http方法
  httpMethod: string;
  // 健康检查期望返回的http code
  expectCodes?: string;
  static names(): { [key: string]: string } {
    return {
      protocol: 'protocol',
      listenerPort: 'listener_port',
      backendServerPort: 'backend_server_port',
      backendServerForwardPort: 'backend_server_forward_port',
      healthMonitor: 'health_monitor',
      healthCheckPort: 'health_check_port',
      healthCheckThreadhold: 'health_check_threadhold',
      healthCheckUri: 'health_check_uri',
      healthCheckInterval: 'health_check_interval',
      httpMethod: 'http_method',
      expectCodes: 'expect_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      protocol: 'string',
      listenerPort: 'number',
      backendServerPort: 'number',
      backendServerForwardPort: 'number',
      healthMonitor: 'boolean',
      healthCheckPort: 'number',
      healthCheckThreadhold: 'number',
      healthCheckUri: 'string',
      healthCheckInterval: 'number',
      httpMethod: 'string',
      expectCodes: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 产品部署单元实例信息
export class DeploymentUnitInstance extends $tea.Model {
  // 环境id
  envId: string;
  // 产品码
  prodCode: string;
  // 产品版本
  prodVersion: string;
  // 部署单元实例id
  identity: string;
  // 部署单元标识id
  deploymentUnitIdentity: string;
  // 部署单元实例状态：ACTIVE、FAILED、UPGRADING
  status: string;
  // 部署拓扑标识
  deployTopologyIdentity: string;
  // 部署规格标识id
  deploySpecIdentity: string;
  // 部署单元部署在哪个zone
  zone?: string;
  // 逻辑部署单元实例id
  logicalInstanceId?: string;
  static names(): { [key: string]: string } {
    return {
      envId: 'env_id',
      prodCode: 'prod_code',
      prodVersion: 'prod_version',
      identity: 'identity',
      deploymentUnitIdentity: 'deployment_unit_identity',
      status: 'status',
      deployTopologyIdentity: 'deploy_topology_identity',
      deploySpecIdentity: 'deploy_spec_identity',
      zone: 'zone',
      logicalInstanceId: 'logical_instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      envId: 'string',
      prodCode: 'string',
      prodVersion: 'string',
      identity: 'string',
      deploymentUnitIdentity: 'string',
      status: 'string',
      deployTopologyIdentity: 'string',
      deploySpecIdentity: 'string',
      zone: 'string',
      logicalInstanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// lb基线实例
export class LbInstance extends $tea.Model {
  // lb资源池
  resourcePoolName: string;
  // lb资源id
  resourceId: string;
  // lb资源实例名称
  resourceName: string;
  // lb路由信息：prodCode_appName
  lbRouterName: string;
  // lb的vip
  vip: string;
  // lb绑定的域名
  domainName: string;
  // lb地址类型：INTENET公网，INTRANET内网
  addressType: string;
  // lb带宽
  bandwidth: string;
  // 是否是anytunnel lb
  anyTunnel: boolean;
  // 是否是办公网
  officialOnly: boolean;
  // lb类型：SLB、ALB
  provider: string;
  // lb状态，ACTIVE，FAILED
  status: string;
  // 部署单元实例id
  deploymentUnitInstanceIdentity: string;
  // 部署单元标识id
  deploymentUnitIdentity: string;
  static names(): { [key: string]: string } {
    return {
      resourcePoolName: 'resource_pool_name',
      resourceId: 'resource_id',
      resourceName: 'resource_name',
      lbRouterName: 'lb_router_name',
      vip: 'vip',
      domainName: 'domain_name',
      addressType: 'address_type',
      bandwidth: 'bandwidth',
      anyTunnel: 'any_tunnel',
      officialOnly: 'official_only',
      provider: 'provider',
      status: 'status',
      deploymentUnitInstanceIdentity: 'deployment_unit_instance_identity',
      deploymentUnitIdentity: 'deployment_unit_identity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      resourcePoolName: 'string',
      resourceId: 'string',
      resourceName: 'string',
      lbRouterName: 'string',
      vip: 'string',
      domainName: 'string',
      addressType: 'string',
      bandwidth: 'string',
      anyTunnel: 'boolean',
      officialOnly: 'boolean',
      provider: 'string',
      status: 'string',
      deploymentUnitInstanceIdentity: 'string',
      deploymentUnitIdentity: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 资源基线实例元信息
export class ResourceInstance extends $tea.Model {
  // 环境id
  envId: string;
  // 产品码
  prodCode: string;
  // zz-rdb
  resourcePoolName: string;
  // 资源id
  resourceId: string;
  // 资源类型：LB、SERVER、RDB
  resourceType: string;
  // 区域id
  regionId?: string;
  // 可用区id
  zoneId: string;
  // 部署单元标识id
  deploymentUnitIdentity: string;
  // 部署单元实例id
  deploymentUnitInstanceIdentity: string;
  static names(): { [key: string]: string } {
    return {
      envId: 'env_id',
      prodCode: 'prod_code',
      resourcePoolName: 'resource_pool_name',
      resourceId: 'resource_id',
      resourceType: 'resource_type',
      regionId: 'region_id',
      zoneId: 'zone_id',
      deploymentUnitIdentity: 'deployment_unit_identity',
      deploymentUnitInstanceIdentity: 'deployment_unit_instance_identity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      envId: 'string',
      prodCode: 'string',
      resourcePoolName: 'string',
      resourceId: 'string',
      resourceType: 'string',
      regionId: 'string',
      zoneId: 'string',
      deploymentUnitIdentity: 'string',
      deploymentUnitInstanceIdentity: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AAP 应用实例
export class ApplicationInstance extends $tea.Model {
  // 应用实例的名字，一般为应用code的小写字母
  name: string;
  // 应用版本
  appVersion: string;
  // 应用实例的命名空间，一般：站点code-prodCode小写
  namespace: string;
  // 一般为空，系统自动填充默认值
  storageClass?: string;
  // 应用部署的拓扑约束，一般为：亲和性、反亲和性、sidecar等
  topologyConstraints?: TopologyConstraints;
  // 健康检查、hook配置
  lifecycle?: Lifecycle;
  // 应用的环境变量
  appEnvs?: AppEnv[];
  // 依赖的应用名列表
  applicationDependencies?: string[];
  // 应用的规格
  resourceSpec: ResourceSpec;
  // 持久化存储，可为空数组
  persistentVolumeConfigs: PersistentVolumeConfig[];
  // 运维策略
  opsSpec: OpsSpec;
  // OrderedReady:顺序更新，Parallel：并行更新
  podManagementPolicy: string;
  // 镜像
  image: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      appVersion: 'app_version',
      namespace: 'namespace',
      storageClass: 'storage_class',
      topologyConstraints: 'topology_constraints',
      lifecycle: 'lifecycle',
      appEnvs: 'app_envs',
      applicationDependencies: 'application_dependencies',
      resourceSpec: 'resource_spec',
      persistentVolumeConfigs: 'persistent_volume_configs',
      opsSpec: 'ops_spec',
      podManagementPolicy: 'pod_management_policy',
      image: 'image',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      appVersion: 'string',
      namespace: 'string',
      storageClass: 'string',
      topologyConstraints: TopologyConstraints,
      lifecycle: Lifecycle,
      appEnvs: { 'type': 'array', 'itemType': AppEnv },
      applicationDependencies: { 'type': 'array', 'itemType': 'string' },
      resourceSpec: ResourceSpec,
      persistentVolumeConfigs: { 'type': 'array', 'itemType': PersistentVolumeConfig },
      opsSpec: OpsSpec,
      podManagementPolicy: 'string',
      image: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 容器基线实例信息
export class ContainerInstance extends $tea.Model {
  // 资源id
  resourceId: string;
  // 容器名称
  name: string;
  // 容器挂载的阿里云anytunnel的资源id
  anytunnelResourceId?: string;
  // 容器对应的index
  index: string;
  // 容器ip
  ip?: string;
  // 集群节点ip
  hostIp?: string;
  // 产品码
  prodCode: string;
  // 应用名称
  appName: string;
  // 应用镜像名
  image: string;
  // cpu
  cpu: string;
  // 内存大小
  memory: string;
  // 容器挂载的阿里云anytunnelIp
  anytunnelServiceIp?: string;
  // 部署单元实例id
  deploymentUnitInstanceIdentity: string;
  // 部署单元标识id
  deploymentUnitIdentity: string;
  static names(): { [key: string]: string } {
    return {
      resourceId: 'resource_id',
      name: 'name',
      anytunnelResourceId: 'anytunnel_resource_id',
      index: 'index',
      ip: 'ip',
      hostIp: 'host_ip',
      prodCode: 'prod_code',
      appName: 'app_name',
      image: 'image',
      cpu: 'cpu',
      memory: 'memory',
      anytunnelServiceIp: 'anytunnel_service_ip',
      deploymentUnitInstanceIdentity: 'deployment_unit_instance_identity',
      deploymentUnitIdentity: 'deployment_unit_identity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      resourceId: 'string',
      name: 'string',
      anytunnelResourceId: 'string',
      index: 'string',
      ip: 'string',
      hostIp: 'string',
      prodCode: 'string',
      appName: 'string',
      image: 'string',
      cpu: 'string',
      memory: 'string',
      anytunnelServiceIp: 'string',
      deploymentUnitInstanceIdentity: 'string',
      deploymentUnitIdentity: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用元数据
export class ApplicationMeta extends $tea.Model {
  // 产品名称
  name: string;
  // 应用code
  code: string;
  // 应用版本
  version: string;
  // 所属产品code
  productCode: string;
  // 应用之间的依赖
  dependencies?: string[];
  // 应用类型    STANDARD("standard"),
  //     JOB("job"),
  //     SIDECAR("sidecar"),
  //     DAEMON("daemon");
  kind: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      code: 'code',
      version: 'version',
      productCode: 'product_code',
      dependencies: 'dependencies',
      kind: 'kind',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      code: 'string',
      version: 'string',
      productCode: 'string',
      dependencies: { 'type': 'array', 'itemType': 'string' },
      kind: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

//  应用基线数据
export class AppInstance extends $tea.Model {
  // 环境id
  envId: string;
  // 产品码
  prodCode: string;
  // 应用名称
  appName: string;
  // 应用版本
  appVersion: string;
  // 应用镜像名
  image: string;
  // 应用基线状态：ACTIVE、FAILED、UPGRADING
  status: string;
  // 部署单元标识id
  deploymentUnitIdentity?: string;
  // 部署单元实例id
  deploymentUnitInstanceIdentity?: string;
  // 应用期望实例数
  expectReplica: string;
  static names(): { [key: string]: string } {
    return {
      envId: 'env_id',
      prodCode: 'prod_code',
      appName: 'app_name',
      appVersion: 'app_version',
      image: 'image',
      status: 'status',
      deploymentUnitIdentity: 'deployment_unit_identity',
      deploymentUnitInstanceIdentity: 'deployment_unit_instance_identity',
      expectReplica: 'expect_replica',
    };
  }

  static types(): { [key: string]: any } {
    return {
      envId: 'string',
      prodCode: 'string',
      appName: 'string',
      appVersion: 'string',
      image: 'string',
      status: 'string',
      deploymentUnitIdentity: 'string',
      deploymentUnitInstanceIdentity: 'string',
      expectReplica: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 站点信息
export class SiteInfo extends $tea.Model {
  // 站点名称
  name: string;
  // 站点code
  code: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      code: 'code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      code: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// lb后端服务器
export class LbBackendServer extends $tea.Model {
  // 应用容器名称
  containerName: string;
  // lb backendServer权值
  weight: number;
  // lb和backendServer关系
  relationType: string;
  // 环境id
  envId: string;
  static names(): { [key: string]: string } {
    return {
      containerName: 'container_name',
      weight: 'weight',
      relationType: 'relation_type',
      envId: 'env_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      containerName: 'string',
      weight: 'number',
      relationType: 'string',
      envId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 产品部署初始化配置
export class ProductDeployInitOption extends $tea.Model {
  // 命名空间
  namespace: string;
  // 产品实例名称
  name: string;
  // 产品code
  prodCode: string;
  // 站点code
  siteCode: string;
  // 多个产品实例时，本产品的发布顺序
  releaseOrder: number;
  // 产品内应用分部署配置
  apps: AppDeployInitOption[];
  static names(): { [key: string]: string } {
    return {
      namespace: 'namespace',
      name: 'name',
      prodCode: 'prod_code',
      siteCode: 'site_code',
      releaseOrder: 'release_order',
      apps: 'apps',
    };
  }

  static types(): { [key: string]: any } {
    return {
      namespace: 'string',
      name: 'string',
      prodCode: 'string',
      siteCode: 'string',
      releaseOrder: 'number',
      apps: { 'type': 'array', 'itemType': AppDeployInitOption },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 产品部署初始化请求
export class ProductDeployInitOptionRequest extends $tea.Model {
  // 站点code
  siteCode: string;
  // 需要部署的产品实例元数据
  productInstances: ProductInstanceMeta[];
  static names(): { [key: string]: string } {
    return {
      siteCode: 'site_code',
      productInstances: 'product_instances',
    };
  }

  static types(): { [key: string]: any } {
    return {
      siteCode: 'string',
      productInstances: { 'type': 'array', 'itemType': ProductInstanceMeta },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 产品元信息
export class Product extends $tea.Model {
  // 数据库变更
  database: DatabaseSchema[];
  // 产品元信息
  meta: ProductMeta;
  // 产品共享参数
  parameters?: Parameter[];
  static names(): { [key: string]: string } {
    return {
      database: 'database',
      meta: 'meta',
      parameters: 'parameters',
    };
  }

  static types(): { [key: string]: any } {
    return {
      database: { 'type': 'array', 'itemType': DatabaseSchema },
      meta: ProductMeta,
      parameters: { 'type': 'array', 'itemType': Parameter },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 产品基线元信息
export class ProdMetaInfo extends $tea.Model {
  // 环境id
  envId: string;
  // 产品码
  prodCode: string;
  // 产品版本
  prodVersion: string;
  // 产品部署拓扑标识id
  deployTopologyIdentity: string;
  // 产品部署规格标识id
  deploySpecIdentity: string;
  // 产品基线状态：AVTIVE、FAILED、UPGRADING
  status: string;
  static names(): { [key: string]: string } {
    return {
      envId: 'env_id',
      prodCode: 'prod_code',
      prodVersion: 'prod_version',
      deployTopologyIdentity: 'deploy_topology_identity',
      deploySpecIdentity: 'deploy_spec_identity',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      envId: 'string',
      prodCode: 'string',
      prodVersion: 'string',
      deployTopologyIdentity: 'string',
      deploySpecIdentity: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAppopsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 执行运维操作的目标应用列表。
  appServiceIds?: string[];
  // 执行运维操作的目标容器列表。当ops_dimension为CONTAINER时，该参数必填。
  containerIds?: string[];
  // 目标环境唯一标识。
  envId: string;
  // 应用运维的操作类型，取值列表：ONLINE：上线，OFFLINE：下线，RESTART:重启，RECOVERY_RESTART：容灾重启，DISABLE_SLB_TRAFFIC:应用摘流，ENABLE_SLB_TRAFFIC:应用挂流。
  opsAction: string;
  // 应用运维维度。两种取值：APP_SERVICE、CONTAINER。
  opsDimension: string;
  // 要执行运维操作的应用服务实例所在的单元。
  cellId: string;
  // 操作人ID
  submitterId?: string;
  // 操作人名称（花名或者真名）
  submitterName?: string;
  // 应用容器分组策略，默认取SYSTEM_RECOMMENDATION
  groupStrategy?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appServiceIds: 'app_service_ids',
      containerIds: 'container_ids',
      envId: 'env_id',
      opsAction: 'ops_action',
      opsDimension: 'ops_dimension',
      cellId: 'cell_id',
      submitterId: 'submitter_id',
      submitterName: 'submitter_name',
      groupStrategy: 'group_strategy',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appServiceIds: { 'type': 'array', 'itemType': 'string' },
      containerIds: { 'type': 'array', 'itemType': 'string' },
      envId: 'string',
      opsAction: 'string',
      opsDimension: 'string',
      cellId: 'string',
      submitterId: 'string',
      submitterName: 'string',
      groupStrategy: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAppopsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 运维单id。
  opsPlanId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      opsPlanId: 'ops_plan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      opsPlanId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAppopsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 运维单id。
  opsPlanId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      opsPlanId: 'ops_plan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      opsPlanId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAppopsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 执行失败的节点
  failedNodes?: NodeExecutionLog[];
  // 运维单执行日志。
  log?: string;
  // 运维单状态。取值列表：UNINITIALIZED:待初始化；ININTIALIZING:初始化中；INITIALIZED:初始化完成；EXECUTING:执行中；SUCCEEDED：执行成功；FAILED：执行失败；其他待补充。
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      failedNodes: 'failed_nodes',
      log: 'log',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      failedNodes: { 'type': 'array', 'itemType': NodeExecutionLog },
      log: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryAppopsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 运维单id。
  opsPlanId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      opsPlanId: 'ops_plan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      opsPlanId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryAppopsResponse extends $tea.Model {
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

export class CancelAppopsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 运维单id。
  opsPlanId: string;
  // 操作人id
  submitterId?: string;
  // 	
  // 操作人名称（花名或者真名）
  submitterName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      opsPlanId: 'ops_plan_id',
      submitterId: 'submitter_id',
      submitterName: 'submitter_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      opsPlanId: 'string',
      submitterId: 'string',
      submitterName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelAppopsResponse extends $tea.Model {
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

export class ScaleProdinstanceAppserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用服务实例唯一标识。
  appServiceId: string;
  // 集群容器目标数量。如果target_num>当前集群num，则扩容target_num-num个容器；如果target_num<当前集群num，则随机缩容target_num-num个容器。
  targetNum: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appServiceId: 'app_service_id',
      targetNum: 'target_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appServiceId: 'string',
      targetNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ScaleProdinstanceAppserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 运维单id。
  opsPlanId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      opsPlanId: 'ops_plan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      opsPlanId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListEnvRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListEnvResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 环境列表。
  envs?: Env[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      envs: 'envs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      envs: { 'type': 'array', 'itemType': Env },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetProdinstanceAppserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用服务实例id。
  appServiceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appServiceId: 'app_service_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appServiceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetProdinstanceAppserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 应用名。
  appName?: string;
  // 应用版本。
  appVersion?: string;
  // 单元ID
  cellId?: string;
  // 容器列表。
  containers?: Container[];
  // 部署单元。
  deployUnit?: string;
  // 部署域。
  deployZone?: string;
  // 环境唯一标识。
  envId?: string;
  // 负载均衡列表。
  loadBalancers?: LoadBalancer[];
  // 产品码。
  productCode?: string;
  // 数据库列表。
  schemas?: Schema[];
  // app service id，该openapi 的入参
  id?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appName: 'app_name',
      appVersion: 'app_version',
      cellId: 'cell_id',
      containers: 'containers',
      deployUnit: 'deploy_unit',
      deployZone: 'deploy_zone',
      envId: 'env_id',
      loadBalancers: 'load_balancers',
      productCode: 'product_code',
      schemas: 'schemas',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appName: 'string',
      appVersion: 'string',
      cellId: 'string',
      containers: { 'type': 'array', 'itemType': Container },
      deployUnit: 'string',
      deployZone: 'string',
      envId: 'string',
      loadBalancers: { 'type': 'array', 'itemType': LoadBalancer },
      productCode: 'string',
      schemas: { 'type': 'array', 'itemType': Schema },
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryProdinstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 单元ID
  cellId?: string;
  // 环境唯一标识。
  envId?: string;
  // 当前页码。
  pageNum?: number;
  // 分页大小。默认值为10，最大值100。
  pageSize?: number;
  // 产品码。
  productCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cellId: 'cell_id',
      envId: 'env_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
      productCode: 'product_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cellId: 'string',
      envId: 'string',
      pageNum: 'number',
      pageSize: 'number',
      productCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryProdinstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前页码。
  pageNum?: number;
  // 分页大小。
  pageSize?: number;
  // 产品实例列表。
  productInstances?: ProductInstance[];
  // 总数。
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pageNum: 'page_num',
      pageSize: 'page_size',
      productInstances: 'product_instances',
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
      productInstances: { 'type': 'array', 'itemType': ProductInstance },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UninstallProdinstanceAppserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境标识
  envId: string;
  // 产品码
  productCode: string;
  // 操作人Id
  submitterId: string;
  // 操作人名称（花名或者真名）
  submitterName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      envId: 'env_id',
      productCode: 'product_code',
      submitterId: 'submitter_id',
      submitterName: 'submitter_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      envId: 'string',
      productCode: 'string',
      submitterId: 'string',
      submitterName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UninstallProdinstanceAppserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 运维单id。
  opsPlanId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      opsPlanId: 'ops_plan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      opsPlanId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateProdinstanceDeployunitRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境标识
  envId?: string;
  // 云游内产品码
  productCode: string;
  // 执行部署单元实例id
  unitId: string;
  // 部署单元名称
  unitName: string;
  // 单元ID
  cellId: string;
  // 逻辑部署单元实例id
  logicalInstanceId: string;
  // 操作人id
  submitterId?: string;
  // 	
  // 操作人名称（花名或者真名）
  submitterName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      envId: 'env_id',
      productCode: 'product_code',
      unitId: 'unit_id',
      unitName: 'unit_name',
      cellId: 'cell_id',
      logicalInstanceId: 'logical_instance_id',
      submitterId: 'submitter_id',
      submitterName: 'submitter_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      envId: 'string',
      productCode: 'string',
      unitId: 'string',
      unitName: 'string',
      cellId: 'string',
      logicalInstanceId: 'string',
      submitterId: 'string',
      submitterName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateProdinstanceDeployunitResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发布单ID
  opsPlanId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      opsPlanId: 'ops_plan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      opsPlanId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUnitinstanceCreationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 发布单ID
  opsPlanId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      opsPlanId: 'ops_plan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      opsPlanId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUnitinstanceCreationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发布单状态
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetUnitDetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境标识
  envId?: string;
  // 产品码
  productCode: string;
  // 单元实例标识
  unitInstanceIdentity: string;
  // 单元ID
  cellId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      envId: 'env_id',
      productCode: 'product_code',
      unitInstanceIdentity: 'unit_instance_identity',
      cellId: 'cell_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      envId: 'string',
      productCode: 'string',
      unitInstanceIdentity: 'string',
      cellId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetUnitDetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 单元内资源列表
  resources?: UnitResource[];
  // 单元状态
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resources: 'resources',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resources: { 'type': 'array', 'itemType': UnitResource },
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryProdinstanceAppserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用名，当前版本应用名不是全局唯一的，请结合产品码一起查询。
  appName?: string;
  // 单元ID
  cellId?: string;
  // 部署单元。
  deployUnit?: string;
  // 部署域。当前版本暂不支持。
  deployZone?: string;
  // 环境唯一标识。
  envId?: string;
  // 当前页码，默认为1。
  pageNum?: number;
  // 分页大小，默认10，最大100。
  pageSize?: number;
  // 产品码。
  productCode?: string;
  // 产品分组。如果入参设置了产品码，则默认忽略产品分组。
  productGroup?: string;
  // 产品码--应用名
  productApp?: string;
  // 租户信息当前值为mock
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      cellId: 'cell_id',
      deployUnit: 'deploy_unit',
      deployZone: 'deploy_zone',
      envId: 'env_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
      productCode: 'product_code',
      productGroup: 'product_group',
      productApp: 'product_app',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      cellId: 'string',
      deployUnit: 'string',
      deployZone: 'string',
      envId: 'string',
      pageNum: 'number',
      pageSize: 'number',
      productCode: 'string',
      productGroup: 'string',
      productApp: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryProdinstanceAppserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 应用服务实例列表。
  appServices?: AppService[];
  // 当前页码。
  pageNum?: number;
  // 分页大小。
  pageSize?: number;
  // 服务实例总数。
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appServices: 'app_services',
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
      appServices: { 'type': 'array', 'itemType': AppService },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetProdinstanceDeployunitRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 单元ID
  cellId: string;
  // 环境唯一标识
  envId?: string;
  // 产品码
  productCode: string;
  // 用户传入部署单元标识
  unitId?: string;
  // 单元实例ID
  unitInstanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cellId: 'cell_id',
      envId: 'env_id',
      productCode: 'product_code',
      unitId: 'unit_id',
      unitInstanceId: 'unit_instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cellId: 'string',
      envId: 'string',
      productCode: 'string',
      unitId: 'string',
      unitInstanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetProdinstanceDeployunitResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // app实例列表
  appServices?: AppServiceInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appServices: 'app_services',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appServices: { 'type': 'array', 'itemType': AppServiceInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListProdinstanceDeployunitRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境唯一标识。
  envId?: string;
  // 产品码。
  productCode: string;
  // 单元ID
  cellId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      envId: 'env_id',
      productCode: 'product_code',
      cellId: 'cell_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      envId: 'string',
      productCode: 'string',
      cellId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListProdinstanceDeployunitResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 部署单元列表。
  deployUnits?: DeployUnit[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      deployUnits: 'deploy_units',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      deployUnits: { 'type': 'array', 'itemType': DeployUnit },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ScaleoutProdinstanceAppserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用服务实例唯一标识。
  appServiceId: string;
  // 集群容器目标数量。target_num需要大于当前集群容器数量，扩容（target_num-当前集群容器数量）个容器。
  targetNum: number;
  // 操作人
  submitterId?: string;
  // 操作人名称（花名或者真名）
  submitterName?: string;
  // 容器分组策略，默认SYSTEM_RECOMMENDATION
  groupStrategy?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appServiceId: 'app_service_id',
      targetNum: 'target_num',
      submitterId: 'submitter_id',
      submitterName: 'submitter_name',
      groupStrategy: 'group_strategy',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appServiceId: 'string',
      targetNum: 'number',
      submitterId: 'string',
      submitterName: 'string',
      groupStrategy: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ScaleoutProdinstanceAppserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 运维单id。
  opsPlanId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      opsPlanId: 'ops_plan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      opsPlanId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAuthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 条件前缀, 一般传入环境ID
  conditionPrefix?: string;
  // 授权状态
  statuses: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      conditionPrefix: 'condition_prefix',
      statuses: 'statuses',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      conditionPrefix: 'string',
      statuses: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAuthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户授权
  data?: UserAuth[];
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
      data: { 'type': 'array', 'itemType': UserAuth },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportAuthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授权的条件
  condition: string;
  // 授权的KEY, 目前Local只有YUNYOU_LOCAL_AUTH_KEY
  conditionKey: string;
  // 是否被删除授权
  deleted: boolean;
  // 授权的MD5
  md5: string;
  // 昵称
  nickName?: string;
  // 是否为负责人
  primary: boolean;
  // 用户真名
  realName: string;
  // 角色
  role: string;
  // 用户的域账号
  sourceId: string;
  // 工号
  workNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      condition: 'condition',
      conditionKey: 'condition_key',
      deleted: 'deleted',
      md5: 'md5',
      nickName: 'nick_name',
      primary: 'primary',
      realName: 'real_name',
      role: 'role',
      sourceId: 'source_id',
      workNo: 'work_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      condition: 'string',
      conditionKey: 'string',
      deleted: 'boolean',
      md5: 'string',
      nickName: 'string',
      primary: 'boolean',
      realName: 'string',
      role: 'string',
      sourceId: 'string',
      workNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportAuthResponse extends $tea.Model {
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

export class GetSystemRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSystemResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回数据
  data?: System;
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
      data: System,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ScaleinProdinstanceAppserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用服务实例唯一标识。
  appServiceId: string;
  // 执行运维操作的目标容器列表。
  containerIds: string[];
  // 操作人id
  submitterId?: string;
  // 操作人名称（花名或者真名）
  submitterName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appServiceId: 'app_service_id',
      containerIds: 'container_ids',
      submitterId: 'submitter_id',
      submitterName: 'submitter_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appServiceId: 'string',
      containerIds: { 'type': 'array', 'itemType': 'string' },
      submitterId: 'string',
      submitterName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ScaleinProdinstanceAppserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 运维单id。
  opsPlanId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      opsPlanId: 'ops_plan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      opsPlanId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllProdinstanceAppserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 单元ID
  cellId?: string;
  // 环境唯一标识。
  envId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cellId: 'cell_id',
      envId: 'env_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cellId: 'string',
      envId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllProdinstanceAppserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 应用服务实例详情列表。
  appServiceInfos?: AppServiceInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appServiceInfos: 'app_service_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appServiceInfos: { 'type': 'array', 'itemType': AppServiceInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAutotestopsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境id
  envId?: string;
  // 测试单名字
  name: string;
  // 需要测试的产品
  products: AutoTestProduct[];
  // 单元的id
  cellId: string;
  // 如果未设置，默认返回NORMAL_JOB，NORMAL_JOB：通用一次任务；HAS_JOB：巡检一次任务
  // 
  // 
  autoTestType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      envId: 'env_id',
      name: 'name',
      products: 'products',
      cellId: 'cell_id',
      autoTestType: 'auto_test_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      envId: 'string',
      name: 'string',
      products: { 'type': 'array', 'itemType': AutoTestProduct },
      cellId: 'string',
      autoTestType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAutotestopsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 测试单的id
  opsPlanId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      opsPlanId: 'ops_plan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      opsPlanId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAutotestopsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 测试单id
  opsPlanId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      opsPlanId: 'ops_plan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      opsPlanId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAutotestopsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 所属环境id
  envId?: string;
  // 测试单名字
  name?: string;
  // 测试单的id
  opsPlanId?: string;
  // 产品测试结果
  prodTestResult?: AutoTestProdResult[];
  // 当前状态
  status?: string;
  // 测试单创建时间
  utcCreate?: string;
  // 测试单结束时间
  utcEnd?: string;
  // 测试单修改时间
  utcModified?: string;
  // 测试单开始时间
  utcStart?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      envId: 'env_id',
      name: 'name',
      opsPlanId: 'ops_plan_id',
      prodTestResult: 'prod_test_result',
      status: 'status',
      utcCreate: 'utc_create',
      utcEnd: 'utc_end',
      utcModified: 'utc_modified',
      utcStart: 'utc_start',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      envId: 'string',
      name: 'string',
      opsPlanId: 'string',
      prodTestResult: { 'type': 'array', 'itemType': AutoTestProdResult },
      status: 'string',
      utcCreate: 'string',
      utcEnd: 'string',
      utcModified: 'string',
      utcStart: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportBaselineRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境id
  envId: string;
  // 单元id
  // 当cell_id为null时，回流资源池等公共信息。
  // 当cell_id不为null时，回流单元内的prod instance
  cellId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      envId: 'env_id',
      cellId: 'cell_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      envId: 'string',
      cellId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportBaselineResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 回流数据箱
  datas?: BoxData[];
  // 基线导出固定为BACK_FLOW
  type?: string;
  // 回流数据版本
  version?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      datas: 'datas',
      type: 'type',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      datas: { 'type': 'array', 'itemType': BoxData },
      type: 'string',
      version: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAppdeployRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用码
  apps: string[];
  // 将要发布的单元id
  cellIds: string[];
  // 产品码
  prodCode: string;
  // 解决方案id
  solutionId: string;
  // 是否强制重发
  force: boolean;
  // 是否需要手动的确认
  needBeta?: boolean;
  // TWO_GROUP分两组ALL_ONE共分一组无灰生产禁用EACH_ONE每台一组SYSTEM_RECOMMENDATION系统推荐
  groupStrategy?: string;
  // 操作人ID
  submitterId?: string;
  // 	
  // 操作人名称（花名或者真名）
  submitterName?: string;
  // 是否由云游自动确认资源规划，默认false；
  // 云游自动确认规划可能不符合预期，请谨慎使用
  autoConfirmPlan?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apps: 'apps',
      cellIds: 'cell_ids',
      prodCode: 'prod_code',
      solutionId: 'solution_id',
      force: 'force',
      needBeta: 'need_beta',
      groupStrategy: 'group_strategy',
      submitterId: 'submitter_id',
      submitterName: 'submitter_name',
      autoConfirmPlan: 'auto_confirm_plan',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apps: { 'type': 'array', 'itemType': 'string' },
      cellIds: { 'type': 'array', 'itemType': 'string' },
      prodCode: 'string',
      solutionId: 'string',
      force: 'boolean',
      needBeta: 'boolean',
      groupStrategy: 'string',
      submitterId: 'string',
      submitterName: 'string',
      autoConfirmPlan: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAppdeployResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发布单id
  opsPlanId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      opsPlanId: 'ops_plan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      opsPlanId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySolutioninstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境id
  envId: string;
  // 当前页码，默认为1。
  pageNum?: number;
  // 分页大小，默认10，最大100。
  // 
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      envId: 'env_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      envId: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySolutioninstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 解决方案
  solutionInstances?: SolutionInstance[];
  // 当前页码。
  // 
  pageNum?: number;
  // 分页大小。
  // 
  pageSize?: number;
  // 服务实例总数。
  // 
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      solutionInstances: 'solution_instances',
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
      solutionInstances: { 'type': 'array', 'itemType': SolutionInstance },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportSolutioninstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 解决方案序列化后的结果
  boxData: string;
  // 环境id
  envId: string;
  // 操作人ID
  submitterId: string;
  // 操作人名称
  submitterName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      boxData: 'box_data',
      envId: 'env_id',
      submitterId: 'submitter_id',
      submitterName: 'submitter_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      boxData: 'string',
      envId: 'string',
      submitterId: 'string',
      submitterName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportSolutioninstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发布单id
  opsPlanId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      opsPlanId: 'ops_plan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      opsPlanId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckSolutioninstanceImportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境id
  envId: string;
  // 解决方案文件序列化后的结果
  boxData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      envId: 'env_id',
      boxData: 'box_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      envId: 'string',
      boxData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckSolutioninstanceImportResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否可以导入此解决方案
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

export class DescribeSolutioninstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 解决方案id
  solutionId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      solutionId: 'solution_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      solutionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeSolutioninstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 支持的api列表
  supportedActions?: OpenAPI[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      supportedActions: 'supported_actions',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      supportedActions: { 'type': 'array', 'itemType': OpenAPI },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeprecateSolutioninstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 解决方案id
  solutionId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      solutionId: 'solution_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      solutionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeprecateSolutioninstanceResponse extends $tea.Model {
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

export class FinishSolutioninstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 解决方案id
  solutionId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      solutionId: 'solution_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      solutionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FinishSolutioninstanceResponse extends $tea.Model {
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

export class ReopenSolutioninstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 解决方案id
  solutionId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      solutionId: 'solution_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      solutionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReopenSolutioninstanceResponse extends $tea.Model {
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

export class ImportEnvMetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // com.alipay.cloud.apyunqing.boxing.model.box序列化后的结果
  boxData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      boxData: 'box_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      boxData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportEnvMetaResponse extends $tea.Model {
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

export class ImportProdMetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // com.alipay.cloud.apyunqing.boxing.model.box序列化后的结果
  boxData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      boxData: 'box_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      boxData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportProdMetaResponse extends $tea.Model {
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

export class UninstallProdinstanceDeployunitRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 单元ID
  cellId: string;
  // 环境唯一标识
  envId: string;
  // 产品码
  productCode: string;
  // 部署单元实例标识
  unitInstanceId: string;
  // 操作人ID
  submitterId: string;
  // 	
  // 操作人名称（花名或者真名）
  submitterName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cellId: 'cell_id',
      envId: 'env_id',
      productCode: 'product_code',
      unitInstanceId: 'unit_instance_id',
      submitterId: 'submitter_id',
      submitterName: 'submitter_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cellId: 'string',
      envId: 'string',
      productCode: 'string',
      unitInstanceId: 'string',
      submitterId: 'string',
      submitterName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UninstallProdinstanceDeployunitResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发布单ID
  opsPlanId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      opsPlanId: 'ops_plan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      opsPlanId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryClusterPodsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境id
  envId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      envId: 'env_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      envId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryClusterPodsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 集群内部详情
  clusterInfo?: ClusterInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      clusterInfo: 'cluster_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      clusterInfo: ClusterInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryClusterKubeconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境变量
  envId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      envId: 'env_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      envId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryClusterKubeconfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // kube_config
  kubeConfig?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      kubeConfig: 'kube_config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      kubeConfig: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class EnableDynamicslbRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // envid
  envid: string;
  // 部署单元id
  unitinstanceid: string;
  // prodCode
  prodcode: string;
  // appname
  appname: string;
  // protocol
  protocol: string;
  // 端口号
  port: number;
  // 目标端口号
  targetport: number;
  // 区间[-1 , 5120]
  bandwidth: number;
  // SLB名称
  loadbalancername: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      envid: 'envid',
      unitinstanceid: 'unitinstanceid',
      prodcode: 'prodcode',
      appname: 'appname',
      protocol: 'protocol',
      port: 'port',
      targetport: 'targetport',
      bandwidth: 'bandwidth',
      loadbalancername: 'loadbalancername',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      envid: 'string',
      unitinstanceid: 'string',
      prodcode: 'string',
      appname: 'string',
      protocol: 'string',
      port: 'number',
      targetport: 'number',
      bandwidth: 'number',
      loadbalancername: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class EnableDynamicslbResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // slb创建结果
  success?: boolean;
  // 生成的slb公网地址
  publicslbip?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      publicslbip: 'publicslbip',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      publicslbip: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DisableDynamicslbRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // envid
  envid: string;
  // 部署单元id
  unitinstanceid: string;
  // prodcode
  prodcode: string;
  // appname
  appname: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      envid: 'envid',
      unitinstanceid: 'unitinstanceid',
      prodcode: 'prodcode',
      appname: 'appname',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      envid: 'string',
      unitinstanceid: 'string',
      prodcode: 'string',
      appname: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DisableDynamicslbResponse extends $tea.Model {
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

export class ExecClusterDnsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境id
  envId: string;
  // 产品码
  prodCode: string;
  // 应用名列表
  appNames: string[];
  // dns域名的绑定/解绑
  opsAction: string;
  // 需要调用的adns所对应环境。
  // 例如A、B环境，A环境宕机了，此时需要调用B机房的adns进行A机房的环境域名解绑操作。
  // 如果不填，默认与env_id一致。
  operationEnvId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      envId: 'env_id',
      prodCode: 'prod_code',
      appNames: 'app_names',
      opsAction: 'ops_action',
      operationEnvId: 'operation_env_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      envId: 'string',
      prodCode: 'string',
      appNames: { 'type': 'array', 'itemType': 'string' },
      opsAction: 'string',
      operationEnvId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecClusterDnsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发布单id
  opsPlanId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      opsPlanId: 'ops_plan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      opsPlanId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OfflineClusterContainerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境id
  envId: string;
  // 产品码
  prodCode: string;
  // 应用名
  appName: string;
  // pod名字
  podName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      envId: 'env_id',
      prodCode: 'prod_code',
      appName: 'app_name',
      podName: 'pod_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      envId: 'string',
      prodCode: 'string',
      appName: 'string',
      podName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OfflineClusterContainerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发布单id
  opsPlanId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      opsPlanId: 'ops_plan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      opsPlanId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OnlineClusterContainerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境id
  envId: string;
  // 产品码
  prodCode: string;
  // 应用名
  appName: string;
  // pod name
  podName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      envId: 'env_id',
      prodCode: 'prod_code',
      appName: 'app_name',
      podName: 'pod_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      envId: 'string',
      prodCode: 'string',
      appName: 'string',
      podName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OnlineClusterContainerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发布单id
  opsPlanId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      opsPlanId: 'ops_plan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      opsPlanId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppparamRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 产品code
  prodCode: string;
  // 应用名
  appName: string;
  // 环境id
  envId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      prodCode: 'prod_code',
      appName: 'app_name',
      envId: 'env_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      prodCode: 'string',
      appName: 'string',
      envId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAppparamResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 环境id
  envId?: string;
  // 产品码
  prodCode?: string;
  // 应用名
  appName?: string;
  // 启动参数的key-value列表
  appParams?: ParamData[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      envId: 'env_id',
      prodCode: 'prod_code',
      appName: 'app_name',
      appParams: 'app_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      envId: 'string',
      prodCode: 'string',
      appName: 'string',
      appParams: { 'type': 'array', 'itemType': ParamData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequerySolutionOpsplanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 解决方案Id
  solutionId: string;
  // 环境Id
  envId: string;
  // 当前页
  currentPage: string;
  // 分页大小
  pageSize: string;
  // RELEASE
  planType: string;
  // FAILED
  opsPlanStatus: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      solutionId: 'solution_id',
      envId: 'env_id',
      currentPage: 'current_page',
      pageSize: 'page_size',
      planType: 'plan_type',
      opsPlanStatus: 'ops_plan_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      solutionId: 'string',
      envId: 'string',
      currentPage: 'string',
      pageSize: 'string',
      planType: 'string',
      opsPlanStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequerySolutionOpsplanResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发布单列表
  opsPlans?: OpsPlan[];
  // 总数
  totalCount?: number;
  // 页大小
  pageSize?: number;
  // 当前页
  currentPage?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      opsPlans: 'ops_plans',
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
      opsPlans: { 'type': 'array', 'itemType': OpsPlan },
      totalCount: 'number',
      pageSize: 'number',
      currentPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmSolutionPlanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 解决方案Id 
  solutionId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      solutionId: 'solution_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      solutionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmSolutionPlanResponse extends $tea.Model {
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

export class GetSolutionPlanstatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 解决方案id
  solutionId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      solutionId: 'solution_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      solutionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSolutionPlanstatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否完成规划
  allPlanConfirmed?: boolean;
  // sidecar规划状态
  sidecarPlanStatus?: string;
  // 持久化存储规划状态
  persistentVolumePlanStatus?: string;
  // 数据库规划状态
  // 
  dbPlanStatus?: string;
  // 负载均衡规划
  lbPlanStatus?: string;
  // 应用配置规划状态
  appDeploySpecStatus?: string;
  // 解决方案检查项结果
  checkPoint?: CheckPoint[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      allPlanConfirmed: 'all_plan_confirmed',
      sidecarPlanStatus: 'sidecar_plan_status',
      persistentVolumePlanStatus: 'persistent_volume_plan_status',
      dbPlanStatus: 'db_plan_status',
      lbPlanStatus: 'lb_plan_status',
      appDeploySpecStatus: 'app_deploy_spec_status',
      checkPoint: 'check_point',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      allPlanConfirmed: 'boolean',
      sidecarPlanStatus: 'string',
      persistentVolumePlanStatus: 'string',
      dbPlanStatus: 'string',
      lbPlanStatus: 'string',
      appDeploySpecStatus: 'string',
      checkPoint: { 'type': 'array', 'itemType': CheckPoint },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryProditerationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 产品码
  prodCode: string;
  // 产品版本
  prodVersion?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      prodCode: 'prod_code',
      prodVersion: 'prod_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      prodCode: 'string',
      prodVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryProditerationResponse extends $tea.Model {
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

export class CreateProdinstanceDeployunitbatchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境id
  envId: string;
  // 产品码
  prodCode: string;
  // 部署单元名称
  deploymentUnitName: string;
  // 部署单元实例id列表
  unitInstanceIds: string[];
  // 逻辑部署单元实例id
  logicalInstanceId: string;
  // 集群中哪个zone，公有云场景使用，专有云不需要部署
  cellId: string;
  // 操作人id
  submitterId?: string;
  // 	
  // 操作人名称（花名或者真名）
  submitterName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      envId: 'env_id',
      prodCode: 'prod_code',
      deploymentUnitName: 'deployment_unit_name',
      unitInstanceIds: 'unit_instance_ids',
      logicalInstanceId: 'logical_instance_id',
      cellId: 'cell_id',
      submitterId: 'submitter_id',
      submitterName: 'submitter_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      envId: 'string',
      prodCode: 'string',
      deploymentUnitName: 'string',
      unitInstanceIds: { 'type': 'array', 'itemType': 'string' },
      logicalInstanceId: 'string',
      cellId: 'string',
      submitterId: 'string',
      submitterName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateProdinstanceDeployunitbatchResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发布单id
  opsPlanId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      opsPlanId: 'ops_plan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      opsPlanId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RollbackOpsAppRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 发布单id
  opsPlanId: string;
  // 产品码
  prodCode: string;
  // 应用名
  appName: string;
  // 需要回滚的快照版本
  prodSnapshotVersion: string;
  // 部署单元ID
  unitInstanceId: string;
  // 操作人Id
  submitterId: string;
  // 	
  // 操作人名称（花名或者真名）
  submitterName?: string;
  // 分组策略，默认使用SYSTEM_RECOMMENDATION
  groupStrategy?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      opsPlanId: 'ops_plan_id',
      prodCode: 'prod_code',
      appName: 'app_name',
      prodSnapshotVersion: 'prod_snapshot_version',
      unitInstanceId: 'unit_instance_id',
      submitterId: 'submitter_id',
      submitterName: 'submitter_name',
      groupStrategy: 'group_strategy',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      opsPlanId: 'string',
      prodCode: 'string',
      appName: 'string',
      prodSnapshotVersion: 'string',
      unitInstanceId: 'string',
      submitterId: 'string',
      submitterName: 'string',
      groupStrategy: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RollbackOpsAppResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 回滚任务发布单
  opsPlanId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      opsPlanId: 'ops_plan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      opsPlanId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RollbackOpsProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需要回滚的解决方案ID
  solutionId: string;
  // 产品码
  prodCode: string;
  // 需要回滚的快照版本
  prodSnapshotVersion: string;
  // 分组策略
  groupStrategy?: string;
  // 部署单元ID
  unitInstanceId: string;
  // 操作人ID
  submitterId: string;
  // 操作人名称（花名或者真名）
  submitterName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      solutionId: 'solution_id',
      prodCode: 'prod_code',
      prodSnapshotVersion: 'prod_snapshot_version',
      groupStrategy: 'group_strategy',
      unitInstanceId: 'unit_instance_id',
      submitterId: 'submitter_id',
      submitterName: 'submitter_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      solutionId: 'string',
      prodCode: 'string',
      prodSnapshotVersion: 'string',
      groupStrategy: 'string',
      unitInstanceId: 'string',
      submitterId: 'string',
      submitterName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RollbackOpsProductResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 回滚发布单id
  opsPlanId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      opsPlanId: 'ops_plan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      opsPlanId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryClusterNativepodRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境id
  envId: string;
  // 产品码--应用名
  productApp?: string;
  // 租户信息
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      envId: 'env_id',
      productApp: 'product_app',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      envId: 'string',
      productApp: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryClusterNativepodResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // Pod信息
  podInfos?: PodInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      podInfos: 'pod_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      podInfos: { 'type': 'array', 'itemType': PodInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryBaselineAppcontainersRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境ID
  envId: string;
  // 产品码
  prodCode: string;
  // 应用名数组，没传则查询改产品下的所有参数
  apps?: string[];
  // 部署单元实例id。默认值为default
  deploymentUnitInstanceIdentities?: string[];
  // 页大小，默认每页12
  pageSize?: number;
  // 第几页，默认返回第一页
  // 
  currentPage?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      envId: 'env_id',
      prodCode: 'prod_code',
      apps: 'apps',
      deploymentUnitInstanceIdentities: 'deployment_unit_instance_identities',
      pageSize: 'page_size',
      currentPage: 'current_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      envId: 'string',
      prodCode: 'string',
      apps: { 'type': 'array', 'itemType': 'string' },
      deploymentUnitInstanceIdentities: { 'type': 'array', 'itemType': 'string' },
      pageSize: 'number',
      currentPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryBaselineAppcontainersResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分页查询中的总数目
  totalCount?: number;
  // 每页大小
  pageSize?: number;
  // 当前页码
  currentPage?: number;
  // 基线应用容器列表
  containers?: Container[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalCount: 'total_count',
      pageSize: 'page_size',
      currentPage: 'current_page',
      containers: 'containers',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalCount: 'number',
      pageSize: 'number',
      currentPage: 'number',
      containers: { 'type': 'array', 'itemType': Container },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryRollbackSnapshotversionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境Id 
  envId: string;
  // 产品码
  prodCode: string;
  // 每页大小，默认12
  pageSize?: number;
  // 当前页码。默认第一页
  currentPage?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      envId: 'env_id',
      prodCode: 'prod_code',
      pageSize: 'page_size',
      currentPage: 'current_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      envId: 'string',
      prodCode: 'string',
      pageSize: 'number',
      currentPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryRollbackSnapshotversionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 页大小
  pageSize?: number;
  // 当前页
  currentPage?: number;
  // 共有多少天记录
  totalCount?: number;
  // 快照版本
  deploymentUnitSnapshots?: DeploymentUnitSnapshotOP[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pageSize: 'page_size',
      currentPage: 'current_page',
      totalCount: 'total_count',
      deploymentUnitSnapshots: 'deployment_unit_snapshots',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pageSize: 'number',
      currentPage: 'number',
      totalCount: 'number',
      deploymentUnitSnapshots: { 'type': 'array', 'itemType': DeploymentUnitSnapshotOP },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class EnableProdAutotestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境id
  envId: string;
  // 产品码
  prodCodes?: string[];
  // READY("READY", "准备执行"), DEPLOYING("DEPLOYING", "部署中, 首次部署时的状态"),  UPGRADING("UPGRADING", "升级中, 首次部署时的状态"),      ROLL_BACKING("ROLL_BACKING", "回滚中, 包括产品回滚和应用回滚"),      ACTIVE("ACTIVE", "可用"),      FAILED("FAILED", "失败"),ROLLBACKED("ROLLBACKED", "已回滚"),APP_ROLLBACKED("APP_ROLLBACKED", "应用回滚")
  prodStatus?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      envId: 'env_id',
      prodCodes: 'prod_codes',
      prodStatus: 'prod_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      envId: 'string',
      prodCodes: { 'type': 'array', 'itemType': 'string' },
      prodStatus: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class EnableProdAutotestResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否可执行测试用例结果
  options?: AutoTestAvailableProdOption[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      options: 'options',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      options: { 'type': 'array', 'itemType': AutoTestAvailableProdOption },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySystemParameterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境ids
  envIds: string;
  // 参数名s
  types?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      envIds: 'env_ids',
      types: 'types',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      envIds: 'string',
      types: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySystemParameterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 系统参数值
  systemParameters?: SystemParameterInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      systemParameters: 'system_parameters',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      systemParameters: { 'type': 'array', 'itemType': SystemParameterInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOpsplanNodetreeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 发布单id
  opsPlanId: string;
  // 发布单节点树根节点id
  subTreeNodeRootId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      opsPlanId: 'ops_plan_id',
      subTreeNodeRootId: 'sub_tree_node_root_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      opsPlanId: 'string',
      subTreeNodeRootId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOpsplanNodetreeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发布单节点树，为json string
  nodeTree?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      nodeTree: 'node_tree',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      nodeTree: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAapSitesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAapSitesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // site list
  sites?: SiteInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sites: 'sites',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sites: { 'type': 'array', 'itemType': SiteInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportAapMetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // yaml的string格式
  metaContext: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      metaContext: 'meta_context',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      metaContext: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportAapMetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否上传成功
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

export class InitAapProductinstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 命名空间，命名格式：siteCode-prodCode （小写）
  namespace: string;
  // 产品实例名称，推荐产品code的小写字母
  name: string;
  // 产品code
  prodCode: string;
  // 产品版本
  prodVersion: string;
  // 产品部署的拓扑名称，部署时会根据该信息进行部署
  topologyCode: string;
  // 站点code
  siteCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      namespace: 'namespace',
      name: 'name',
      prodCode: 'prod_code',
      prodVersion: 'prod_version',
      topologyCode: 'topology_code',
      siteCode: 'site_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      namespace: 'string',
      name: 'string',
      prodCode: 'string',
      prodVersion: 'string',
      topologyCode: 'string',
      siteCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitAapProductinstanceResponse extends $tea.Model {
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

export class InitAapReleaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需要升级的产品实例
  productDeployInitOptionRequest: ProductDeployInitOptionRequest;
  // 站点code
  siteCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productDeployInitOptionRequest: 'product_deploy_init_option_request',
      siteCode: 'site_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productDeployInitOptionRequest: ProductDeployInitOptionRequest,
      siteCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitAapReleaseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 初始化的结果，可用此调用发布接口
  deployInitOptions?: ProductDeployInitOption[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      deployInitOptions: 'deploy_init_options',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      deployInitOptions: { 'type': 'array', 'itemType': ProductDeployInitOption },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeployAapProductinstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 站点code
  siteCode: string;
  // 产品部署参数
  productDeployInitOptions: ProductDeployInitOption[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      siteCode: 'site_code',
      productDeployInitOptions: 'product_deploy_init_options',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      siteCode: 'string',
      productDeployInitOptions: { 'type': 'array', 'itemType': ProductDeployInitOption },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeployAapProductinstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发布单id
  releasePlanId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      releasePlanId: 'release_plan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      releasePlanId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAapReleaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 发布单id
  releasePlanId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      releasePlanId: 'release_plan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      releasePlanId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAapReleaseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发布单状态:
  //     TOBE_DEPLOY("TOBE_DEPLOY","待执行","待执行"),
  //     EXECUTING("EXECUTING","执行中","执行中"),
  //     SUCCESS("SUCCESS","完成","完成"),
  //     CANCELED("CANCELED","已取消","已取消"),
  //     FAILED("FAILED","失败","失败"),
  //     WAITING_CONFIRM("WAITING_CONFIRM","待确认","待确认");
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAapApplicationinstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 站点code
  siteCode: string;
  // 应用实例
  applicationInstance: ApplicationInstance;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      siteCode: 'site_code',
      applicationInstance: 'application_instance',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      siteCode: 'string',
      applicationInstance: ApplicationInstance,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAapApplicationinstanceResponse extends $tea.Model {
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

export class QueryAapApplicationinstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // sitecode
  // 
  siteCode: string;
  // namespace
  namespace: string;
  // 产品code
  prodCode: string;
  // 产品实例name
  productInstanceName: string;
  // app name
  appName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      siteCode: 'site_code',
      namespace: 'namespace',
      prodCode: 'prod_code',
      productInstanceName: 'product_instance_name',
      appName: 'app_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      siteCode: 'string',
      namespace: 'string',
      prodCode: 'string',
      productInstanceName: 'string',
      appName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAapApplicationinstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // siteCode
  siteCode?: string;
  // 应用实例
  applicationInstance?: ApplicationInstance;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      siteCode: 'site_code',
      applicationInstance: 'application_instance',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      siteCode: 'string',
      applicationInstance: ApplicationInstance,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetAapApplicationinstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 规格修改
  resourceSpec: ResourceSpec;
  // 命名空间
  namespace: string;
  // 产品实例名称
  productInstanceName: string;
  // 产品code
  prodCode: string;
  // 应用名称
  appCode: string;
  // 站点code
  siteCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      resourceSpec: 'resource_spec',
      namespace: 'namespace',
      productInstanceName: 'product_instance_name',
      prodCode: 'prod_code',
      appCode: 'app_code',
      siteCode: 'site_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      resourceSpec: ResourceSpec,
      namespace: 'string',
      productInstanceName: 'string',
      prodCode: 'string',
      appCode: 'string',
      siteCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetAapApplicationinstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否修改成功
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

export class SetAapImagesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用镜像，默认使用amd64
  images: ApplicationImage;
  // namespace
  namespace: string;
  // siteCode
  siteCode: string;
  // 产品code
  prodCode: string;
  // 产品实例名称
  productInstanceName: string;
  // 应用code
  appCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      images: 'images',
      namespace: 'namespace',
      siteCode: 'site_code',
      prodCode: 'prod_code',
      productInstanceName: 'product_instance_name',
      appCode: 'app_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      images: ApplicationImage,
      namespace: 'string',
      siteCode: 'string',
      prodCode: 'string',
      productInstanceName: 'string',
      appCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetAapImagesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否修改成功
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

export class QueryAapProductinstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // site_code
  siteCode: string;
  // name space
  namespace: string;
  // 产品code
  prodCode: string;
  // 产品实例name
  productInstanceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      siteCode: 'site_code',
      namespace: 'namespace',
      prodCode: 'prod_code',
      productInstanceName: 'product_instance_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      siteCode: 'string',
      namespace: 'string',
      prodCode: 'string',
      productInstanceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAapProductinstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // namespace
  namespace?: string;
  // prod code
  prodCode?: string;
  // 产品实例名称
  name?: string;
  // 产品版本
  prodVersion?: string;
  // 拓扑code
  topologyCode?: string;
  // 拓扑名称
  topologyName?: string;
  // 产品实例状态
  status?: string;
  // 应用实例列表
  appInstances?: ApplicationMeta[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      namespace: 'namespace',
      prodCode: 'prod_code',
      name: 'name',
      prodVersion: 'prod_version',
      topologyCode: 'topology_code',
      topologyName: 'topology_name',
      status: 'status',
      appInstances: 'app_instances',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      namespace: 'string',
      prodCode: 'string',
      name: 'string',
      prodVersion: 'string',
      topologyCode: 'string',
      topologyName: 'string',
      status: 'string',
      appInstances: { 'type': 'array', 'itemType': ApplicationMeta },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailAapApplicationinstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // site code
  siteCode: string;
  // namespace
  namespace: string;
  // prod code
  prodCode: string;
  // 产品实例名称
  productInstanceName: string;
  // 应用code
  appCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      siteCode: 'site_code',
      namespace: 'namespace',
      prodCode: 'prod_code',
      productInstanceName: 'product_instance_name',
      appCode: 'app_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      siteCode: 'string',
      namespace: 'string',
      prodCode: 'string',
      productInstanceName: 'string',
      appCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailAapApplicationinstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 应用名称
  name?: string;
  // 镜像
  image?: string;
  // 副本数
  replicas?: number;
  // 容器详情
  podInstances?: ContainerInstance[];
  // 应用版本
  version?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      name: 'name',
      image: 'image',
      replicas: 'replicas',
      podInstances: 'pod_instances',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      name: 'string',
      image: 'string',
      replicas: 'number',
      podInstances: { 'type': 'array', 'itemType': ContainerInstance },
      version: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetAapParametersRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // site code
  siteCode: string;
  // namespace
  namespace: string;
  // prod code
  prodCode: string;
  // product_instance_name
  productInstanceName: string;
  // 应用code
  appCode: string;
  // 更新的应用参数
  appEnvs: AppEnv[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      siteCode: 'site_code',
      namespace: 'namespace',
      prodCode: 'prod_code',
      productInstanceName: 'product_instance_name',
      appCode: 'app_code',
      appEnvs: 'app_envs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      siteCode: 'string',
      namespace: 'string',
      prodCode: 'string',
      productInstanceName: 'string',
      appCode: 'string',
      appEnvs: { 'type': 'array', 'itemType': AppEnv },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetAapParametersResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 更新是否成功
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

export class DeleteAapProductinstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 站点code
  siteCode: string;
  // 产品实例所属命名空间
  namespace: string;
  // 产品实例code
  prodCode: string;
  // 产品实例名称
  productInstanceName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      siteCode: 'site_code',
      namespace: 'namespace',
      prodCode: 'prod_code',
      productInstanceName: 'product_instance_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      siteCode: 'string',
      namespace: 'string',
      prodCode: 'string',
      productInstanceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAapProductinstanceResponse extends $tea.Model {
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

export class CreateEnvRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境初始化参数配置
  envConfigInfo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      envConfigInfo: 'env_config_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      envConfigInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateEnvResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 环境ID
  envId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      envId: 'env_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      envId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllEnvsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllEnvsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 环境基本信息列表
  envs?: EnvInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      envs: 'envs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      envs: { 'type': 'array', 'itemType': EnvInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryProdsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境id
  envId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      envId: 'env_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      envId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryProdsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 产品基线元信息
  prodMetaInfos?: ProdMetaInfo[];
  // 1
  currentPage?: number;
  // 页大小
  pageSize?: number;
  // 总页数 
  totalPages?: number;
  // 总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      prodMetaInfos: 'prod_meta_infos',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalPages: 'total_pages',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      prodMetaInfos: { 'type': 'array', 'itemType': ProdMetaInfo },
      currentPage: 'number',
      pageSize: 'number',
      totalPages: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryProdsResourcesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境id
  envId: string;
  // 产品码
  prodCode: string;
  // 资源类型：LB、SERVER、RDB
  resourceType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      envId: 'env_id',
      prodCode: 'prod_code',
      resourceType: 'resource_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      envId: 'string',
      prodCode: 'string',
      resourceType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryProdsResourcesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前页
  currentPage?: number;
  // 页大小
  pageSize?: number;
  // 总数
  totalCount?: number;
  // 总页数
  totalPage?: number;
  // 资源基线实例信息列表
  data?: ResourceInstance[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalCount: 'total_count',
      totalPage: 'total_page',
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
      totalPage: 'number',
      data: { 'type': 'array', 'itemType': ResourceInstance },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryResourceinstancesContainersRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境id
  envId: string;
  // 产品码
  prodCode: string;
  // 应用名称
  appName: string;
  // 部署单元标识id
  deploymentUnitIdentity?: string;
  // 部署单元实例标识id
  deploymentUnitInstanceIdentity?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      envId: 'env_id',
      prodCode: 'prod_code',
      appName: 'app_name',
      deploymentUnitIdentity: 'deployment_unit_identity',
      deploymentUnitInstanceIdentity: 'deployment_unit_instance_identity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      envId: 'string',
      prodCode: 'string',
      appName: 'string',
      deploymentUnitIdentity: 'string',
      deploymentUnitInstanceIdentity: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryResourceinstancesContainersResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前页
  currentPage?: number;
  // 页大小
  pageSize?: number;
  // 总页数
  totalPage?: number;
  // 总数
  totalCount?: number;
  // 容器基线信息
  data?: ContainerInstance[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalPage: 'total_page',
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
      totalPage: 'number',
      totalCount: 'number',
      data: { 'type': 'array', 'itemType': ContainerInstance },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryProdsAppsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境id
  envId: string;
  // 产品码
  prodCode: string;
  // 部署单元标识id
  deploymentUnitIdentity?: string;
  // 部署单元实例id
  deploymentUnitInstanceIdentity?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      envId: 'env_id',
      prodCode: 'prod_code',
      deploymentUnitIdentity: 'deployment_unit_identity',
      deploymentUnitInstanceIdentity: 'deployment_unit_instance_identity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      envId: 'string',
      prodCode: 'string',
      deploymentUnitIdentity: 'string',
      deploymentUnitInstanceIdentity: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryProdsAppsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前页面id
  currentPage?: number;
  // 页大小
  pageSize?: number;
  // 应用基线总数
  totalCount?: number;
  // 总页数
  totalPage?: number;
  // 应用基线
  data?: AppInstance[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalCount: 'total_count',
      totalPage: 'total_page',
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
      totalPage: 'number',
      data: { 'type': 'array', 'itemType': AppInstance },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryProdsDeploymentunitsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境id
  envId: string;
  // 产品码
  prodCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      envId: 'env_id',
      prodCode: 'prod_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      envId: 'string',
      prodCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryProdsDeploymentunitsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 产品部署单元实例信息
  data?: DeploymentUnitInstance[];
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
      data: { 'type': 'array', 'itemType': DeploymentUnitInstance },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryResourceinstancesLbsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境id
  envId: string;
  // 产品码
  prodCode: string;
  // 应用名称
  appName: string;
  // 部署单元标识id
  deploymentUnitIdentity?: string;
  // 部署单元实例id
  deploymentUnitInstanceIdentity?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      envId: 'env_id',
      prodCode: 'prod_code',
      appName: 'app_name',
      deploymentUnitIdentity: 'deployment_unit_identity',
      deploymentUnitInstanceIdentity: 'deployment_unit_instance_identity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      envId: 'string',
      prodCode: 'string',
      appName: 'string',
      deploymentUnitIdentity: 'string',
      deploymentUnitInstanceIdentity: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryResourceinstancesLbsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前页面index
  currentPage?: number;
  // 页面大小
  pageSize?: number;
  // 总数
  totalCount?: number;
  // 总页数
  totalPage?: number;
  // 产品应用所属的lb实例
  lbInstances?: LbInstance[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalCount: 'total_count',
      totalPage: 'total_page',
      lbInstances: 'lb_instances',
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
      totalPage: 'number',
      lbInstances: { 'type': 'array', 'itemType': LbInstance },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateProdsAppopsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境id	
  envId: string;
  // 产品码
  prodCode: string;
  // 应用名称
  appName: string;
  // 部署单元标识id
  deploymentUnitIdentity: string;
  // 部署单元实例id
  deploymentUnitInstanceIdentity: string;
  // 应用运维的操作类型，取值列表：ONLINE：上线，OFFLINE：下线，RESTART:重启	
  // 
  opsAction: string;
  // 容器名称列表	
  // 
  containerNames: string[];
  // 应用容器分组策略，默认取SYSTEM_RECOMMENDATION
  groupStrategy: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      envId: 'env_id',
      prodCode: 'prod_code',
      appName: 'app_name',
      deploymentUnitIdentity: 'deployment_unit_identity',
      deploymentUnitInstanceIdentity: 'deployment_unit_instance_identity',
      opsAction: 'ops_action',
      containerNames: 'container_names',
      groupStrategy: 'group_strategy',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      envId: 'string',
      prodCode: 'string',
      appName: 'string',
      deploymentUnitIdentity: 'string',
      deploymentUnitInstanceIdentity: 'string',
      opsAction: 'string',
      containerNames: { 'type': 'array', 'itemType': 'string' },
      groupStrategy: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateProdsAppopsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发布单id
  opsPlanId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      opsPlanId: 'ops_plan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      opsPlanId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetProdsAppopsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 发布单id
  opsPlanId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      opsPlanId: 'ops_plan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      opsPlanId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetProdsAppopsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 运维单状态。取值列表：UNINITIALIZED:待初始化；ININTIALIZING:初始化中；INITIALIZED:初始化完成；EXECUTING:执行中；SUCCEEDED：执行成功；FAILED：执行失败；其他待补充。	
  // 
  status?: string;
  // 失败节点详情	
  // 
  failedNodes?: NodeExecutionLog[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      failedNodes: 'failed_nodes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      failedNodes: { 'type': 'array', 'itemType': NodeExecutionLog },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelProdsAppopsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 发布单id
  opsPlanId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      opsPlanId: 'ops_plan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      opsPlanId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelProdsAppopsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否操作成功
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

export class RetryProdsAppopsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 发布单id
  opsPlanId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      opsPlanId: 'ops_plan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      opsPlanId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryProdsAppopsResponse extends $tea.Model {
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

export class ScaleinProdsAppopsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境id
  envId: string;
  // 产品码
  prodCode: string;
  // 应用名称
  appName: string;
  // 部署单元标识id
  deploymentUnitIdentity: string;
  // 部署单元实例id
  deploymentUnitInstanceIdentity: string;
  // 应用期望副本数
  expectReplica: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      envId: 'env_id',
      prodCode: 'prod_code',
      appName: 'app_name',
      deploymentUnitIdentity: 'deployment_unit_identity',
      deploymentUnitInstanceIdentity: 'deployment_unit_instance_identity',
      expectReplica: 'expect_replica',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      envId: 'string',
      prodCode: 'string',
      appName: 'string',
      deploymentUnitIdentity: 'string',
      deploymentUnitInstanceIdentity: 'string',
      expectReplica: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ScaleinProdsAppopsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 运维单id
  opsPlanId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      opsPlanId: 'ops_plan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      opsPlanId: 'string',
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
          sdk_version: "4.0.5",
          _prod_code: "YUNQING",
          _prod_channel: "undefined",
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
   * Description: 创建一个运维单。
   * Summary: 创建一个运维单。
   */
  async createAppops(request: CreateAppopsRequest): Promise<CreateAppopsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAppopsEx(request, headers, runtime);
  }

  /**
   * Description: 创建一个运维单。
   * Summary: 创建一个运维单。
   */
  async createAppopsEx(request: CreateAppopsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAppopsResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAppopsResponse>(await this.doRequest("1.0", "yunyou.yunqing.appops.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAppopsResponse({}));
  }

  /**
   * Description: 查询一个运维单详情。
   * Summary: 查询一个运维单详情。
   */
  async getAppops(request: GetAppopsRequest): Promise<GetAppopsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAppopsEx(request, headers, runtime);
  }

  /**
   * Description: 查询一个运维单详情。
   * Summary: 查询一个运维单详情。
   */
  async getAppopsEx(request: GetAppopsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAppopsResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAppopsResponse>(await this.doRequest("1.0", "yunyou.yunqing.appops.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAppopsResponse({}));
  }

  /**
   * Description: 重试一个运维单，仅当运维单状态为FAILED时可执行。
   * Summary: 重试一个运维单。
   */
  async retryAppops(request: RetryAppopsRequest): Promise<RetryAppopsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryAppopsEx(request, headers, runtime);
  }

  /**
   * Description: 重试一个运维单，仅当运维单状态为FAILED时可执行。
   * Summary: 重试一个运维单。
   */
  async retryAppopsEx(request: RetryAppopsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryAppopsResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryAppopsResponse>(await this.doRequest("1.0", "yunyou.yunqing.appops.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryAppopsResponse({}));
  }

  /**
   * Description: 取消一个发布单。
   * Summary: 取消一个发布单。
   */
  async cancelAppops(request: CancelAppopsRequest): Promise<CancelAppopsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelAppopsEx(request, headers, runtime);
  }

  /**
   * Description: 取消一个发布单。
   * Summary: 取消一个发布单。
   */
  async cancelAppopsEx(request: CancelAppopsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelAppopsResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelAppopsResponse>(await this.doRequest("1.0", "yunyou.yunqing.appops.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelAppopsResponse({}));
  }

  /**
   * Description: 变更应用服务实例集群大小。
   * Summary: 已废弃，勿用！！！
   */
  async scaleProdinstanceAppservice(request: ScaleProdinstanceAppserviceRequest): Promise<ScaleProdinstanceAppserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.scaleProdinstanceAppserviceEx(request, headers, runtime);
  }

  /**
   * Description: 变更应用服务实例集群大小。
   * Summary: 已废弃，勿用！！！
   */
  async scaleProdinstanceAppserviceEx(request: ScaleProdinstanceAppserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ScaleProdinstanceAppserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<ScaleProdinstanceAppserviceResponse>(await this.doRequest("1.0", "yunyou.yunqing.prodinstance.appservice.scale", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ScaleProdinstanceAppserviceResponse({}));
  }

  /**
   * Description: 获取环境列表。
   * Summary: 获取环境列表。
   */
  async listEnv(request: ListEnvRequest): Promise<ListEnvResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listEnvEx(request, headers, runtime);
  }

  /**
   * Description: 获取环境列表。
   * Summary: 获取环境列表。
   */
  async listEnvEx(request: ListEnvRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListEnvResponse> {
    Util.validateModel(request);
    return $tea.cast<ListEnvResponse>(await this.doRequest("1.0", "yunyou.yunqing.env.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListEnvResponse({}));
  }

  /**
   * Description: 获取应用服务实例详情信息。
   * Summary: 获取应用服务实例详情信息。
   */
  async getProdinstanceAppservice(request: GetProdinstanceAppserviceRequest): Promise<GetProdinstanceAppserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getProdinstanceAppserviceEx(request, headers, runtime);
  }

  /**
   * Description: 获取应用服务实例详情信息。
   * Summary: 获取应用服务实例详情信息。
   */
  async getProdinstanceAppserviceEx(request: GetProdinstanceAppserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetProdinstanceAppserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetProdinstanceAppserviceResponse>(await this.doRequest("1.0", "yunyou.yunqing.prodinstance.appservice.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetProdinstanceAppserviceResponse({}));
  }

  /**
   * Description: 查询产品实例。
   * Summary: 查询产品实例。
   */
  async queryProdinstance(request: QueryProdinstanceRequest): Promise<QueryProdinstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryProdinstanceEx(request, headers, runtime);
  }

  /**
   * Description: 查询产品实例。
   * Summary: 查询产品实例。
   */
  async queryProdinstanceEx(request: QueryProdinstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryProdinstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryProdinstanceResponse>(await this.doRequest("1.0", "yunyou.yunqing.prodinstance.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryProdinstanceResponse({}));
  }

  /**
   * Description: 卸载基线产品实例
   * Summary: 卸载基线产品实例
   */
  async uninstallProdinstanceAppservice(request: UninstallProdinstanceAppserviceRequest): Promise<UninstallProdinstanceAppserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uninstallProdinstanceAppserviceEx(request, headers, runtime);
  }

  /**
   * Description: 卸载基线产品实例
   * Summary: 卸载基线产品实例
   */
  async uninstallProdinstanceAppserviceEx(request: UninstallProdinstanceAppserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UninstallProdinstanceAppserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<UninstallProdinstanceAppserviceResponse>(await this.doRequest("1.0", "yunyou.yunqing.prodinstance.appservice.uninstall", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UninstallProdinstanceAppserviceResponse({}));
  }

  /**
   * Description: 创建部署单元实例
   * Summary: 创建部署单元实例
   */
  async createProdinstanceDeployunit(request: CreateProdinstanceDeployunitRequest): Promise<CreateProdinstanceDeployunitResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createProdinstanceDeployunitEx(request, headers, runtime);
  }

  /**
   * Description: 创建部署单元实例
   * Summary: 创建部署单元实例
   */
  async createProdinstanceDeployunitEx(request: CreateProdinstanceDeployunitRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateProdinstanceDeployunitResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateProdinstanceDeployunitResponse>(await this.doRequest("1.0", "yunyou.yunqing.prodinstance.deployunit.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateProdinstanceDeployunitResponse({}));
  }

  /**
   * Description: 查询部署单元实例创建状态
   * Summary: 废弃，勿用！！！
   */
  async queryUnitinstanceCreation(request: QueryUnitinstanceCreationRequest): Promise<QueryUnitinstanceCreationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUnitinstanceCreationEx(request, headers, runtime);
  }

  /**
   * Description: 查询部署单元实例创建状态
   * Summary: 废弃，勿用！！！
   */
  async queryUnitinstanceCreationEx(request: QueryUnitinstanceCreationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUnitinstanceCreationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUnitinstanceCreationResponse>(await this.doRequest("1.0", "yunyou.yunqing.unitinstance.creation.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUnitinstanceCreationResponse({}));
  }

  /**
   * Description: 获取部署单元详情
   * Summary: 废弃，勿用！！！
   */
  async getUnitDetail(request: GetUnitDetailRequest): Promise<GetUnitDetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getUnitDetailEx(request, headers, runtime);
  }

  /**
   * Description: 获取部署单元详情
   * Summary: 废弃，勿用！！！
   */
  async getUnitDetailEx(request: GetUnitDetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetUnitDetailResponse> {
    Util.validateModel(request);
    return $tea.cast<GetUnitDetailResponse>(await this.doRequest("1.0", "yunyou.yunqing.unit.detail.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetUnitDetailResponse({}));
  }

  /**
   * Description: 查询应用服务实例信息。
   * Summary: 查询应用服务实例信息。
   */
  async queryProdinstanceAppservice(request: QueryProdinstanceAppserviceRequest): Promise<QueryProdinstanceAppserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryProdinstanceAppserviceEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用服务实例信息。
   * Summary: 查询应用服务实例信息。
   */
  async queryProdinstanceAppserviceEx(request: QueryProdinstanceAppserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryProdinstanceAppserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryProdinstanceAppserviceResponse>(await this.doRequest("1.0", "yunyou.yunqing.prodinstance.appservice.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryProdinstanceAppserviceResponse({}));
  }

  /**
   * Description: 获取单元实例信息
   * Summary: 获取单元实例信息
   */
  async getProdinstanceDeployunit(request: GetProdinstanceDeployunitRequest): Promise<GetProdinstanceDeployunitResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getProdinstanceDeployunitEx(request, headers, runtime);
  }

  /**
   * Description: 获取单元实例信息
   * Summary: 获取单元实例信息
   */
  async getProdinstanceDeployunitEx(request: GetProdinstanceDeployunitRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetProdinstanceDeployunitResponse> {
    Util.validateModel(request);
    return $tea.cast<GetProdinstanceDeployunitResponse>(await this.doRequest("1.0", "yunyou.yunqing.prodinstance.deployunit.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetProdinstanceDeployunitResponse({}));
  }

  /**
   * Description: 获取产品实例下的部署单元列表。
   * Summary: 获取产品实例下的部署单元列表
   */
  async listProdinstanceDeployunit(request: ListProdinstanceDeployunitRequest): Promise<ListProdinstanceDeployunitResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listProdinstanceDeployunitEx(request, headers, runtime);
  }

  /**
   * Description: 获取产品实例下的部署单元列表。
   * Summary: 获取产品实例下的部署单元列表
   */
  async listProdinstanceDeployunitEx(request: ListProdinstanceDeployunitRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListProdinstanceDeployunitResponse> {
    Util.validateModel(request);
    return $tea.cast<ListProdinstanceDeployunitResponse>(await this.doRequest("1.0", "yunyou.yunqing.prodinstance.deployunit.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListProdinstanceDeployunitResponse({}));
  }

  /**
   * Description: 指定应用服务扩容。
   * Summary: 指定应用服务扩容。
   */
  async scaleoutProdinstanceAppservice(request: ScaleoutProdinstanceAppserviceRequest): Promise<ScaleoutProdinstanceAppserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.scaleoutProdinstanceAppserviceEx(request, headers, runtime);
  }

  /**
   * Description: 指定应用服务扩容。
   * Summary: 指定应用服务扩容。
   */
  async scaleoutProdinstanceAppserviceEx(request: ScaleoutProdinstanceAppserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ScaleoutProdinstanceAppserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<ScaleoutProdinstanceAppserviceResponse>(await this.doRequest("1.0", "yunyou.yunqing.prodinstance.appservice.scaleout", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ScaleoutProdinstanceAppserviceResponse({}));
  }

  /**
   * Description: 查询用户授权信息
   * Summary: 查询用户授权信息
   */
  async queryAuth(request: QueryAuthRequest): Promise<QueryAuthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAuthEx(request, headers, runtime);
  }

  /**
   * Description: 查询用户授权信息
   * Summary: 查询用户授权信息
   */
  async queryAuthEx(request: QueryAuthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAuthResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAuthResponse>(await this.doRequest("1.0", "yunyou.yunqing.auth.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAuthResponse({}));
  }

  /**
   * Description: 导入用户授权
   * Summary: 导入用户授权
   */
  async importAuth(request: ImportAuthRequest): Promise<ImportAuthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importAuthEx(request, headers, runtime);
  }

  /**
   * Description: 导入用户授权
   * Summary: 导入用户授权
   */
  async importAuthEx(request: ImportAuthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportAuthResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportAuthResponse>(await this.doRequest("1.0", "yunyou.yunqing.auth.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportAuthResponse({}));
  }

  /**
   * Description: 系统信息
   * Summary: 获取Local系统信息
   */
  async getSystem(request: GetSystemRequest): Promise<GetSystemResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getSystemEx(request, headers, runtime);
  }

  /**
   * Description: 系统信息
   * Summary: 获取Local系统信息
   */
  async getSystemEx(request: GetSystemRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetSystemResponse> {
    Util.validateModel(request);
    return $tea.cast<GetSystemResponse>(await this.doRequest("1.0", "yunyou.yunqing.system.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetSystemResponse({}));
  }

  /**
   * Description: 应用服务缩容。
   * Summary: 应用服务缩容。
   */
  async scaleinProdinstanceAppservice(request: ScaleinProdinstanceAppserviceRequest): Promise<ScaleinProdinstanceAppserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.scaleinProdinstanceAppserviceEx(request, headers, runtime);
  }

  /**
   * Description: 应用服务缩容。
   * Summary: 应用服务缩容。
   */
  async scaleinProdinstanceAppserviceEx(request: ScaleinProdinstanceAppserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ScaleinProdinstanceAppserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<ScaleinProdinstanceAppserviceResponse>(await this.doRequest("1.0", "yunyou.yunqing.prodinstance.appservice.scalein", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ScaleinProdinstanceAppserviceResponse({}));
  }

  /**
   * Description: 查询一个环境内的全部应用服务实例信息，仅供监控调用。
   * Summary: 查询一个环境内的全部应用服务实例信息。
   */
  async allProdinstanceAppservice(request: AllProdinstanceAppserviceRequest): Promise<AllProdinstanceAppserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allProdinstanceAppserviceEx(request, headers, runtime);
  }

  /**
   * Description: 查询一个环境内的全部应用服务实例信息，仅供监控调用。
   * Summary: 查询一个环境内的全部应用服务实例信息。
   */
  async allProdinstanceAppserviceEx(request: AllProdinstanceAppserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllProdinstanceAppserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<AllProdinstanceAppserviceResponse>(await this.doRequest("1.0", "yunyou.yunqing.prodinstance.appservice.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllProdinstanceAppserviceResponse({}));
  }

  /**
   * Description: 输入产品码，自动创建一个测试单，并开始执行
   * Summary: 创建一个自动巡检测试单
   */
  async createAutotestops(request: CreateAutotestopsRequest): Promise<CreateAutotestopsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAutotestopsEx(request, headers, runtime);
  }

  /**
   * Description: 输入产品码，自动创建一个测试单，并开始执行
   * Summary: 创建一个自动巡检测试单
   */
  async createAutotestopsEx(request: CreateAutotestopsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAutotestopsResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAutotestopsResponse>(await this.doRequest("1.0", "yunyou.yunqing.autotestops.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAutotestopsResponse({}));
  }

  /**
   * Description: 获取测试单状态和case
   * Summary: 获取测试单详情
   */
  async getAutotestops(request: GetAutotestopsRequest): Promise<GetAutotestopsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAutotestopsEx(request, headers, runtime);
  }

  /**
   * Description: 获取测试单状态和case
   * Summary: 获取测试单详情
   */
  async getAutotestopsEx(request: GetAutotestopsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAutotestopsResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAutotestopsResponse>(await this.doRequest("1.0", "yunyou.yunqing.autotestops.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAutotestopsResponse({}));
  }

  /**
   * Description: 基线数据回流
   * Summary: 基线数据回流
   */
  async exportBaseline(request: ExportBaselineRequest): Promise<ExportBaselineResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.exportBaselineEx(request, headers, runtime);
  }

  /**
   * Description: 基线数据回流
   * Summary: 基线数据回流
   */
  async exportBaselineEx(request: ExportBaselineRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExportBaselineResponse> {
    Util.validateModel(request);
    return $tea.cast<ExportBaselineResponse>(await this.doRequest("1.0", "yunyou.yunqing.baseline.export", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExportBaselineResponse({}));
  }

  /**
   * Description: 创建一个发布单
   * Summary: 创建一个发布单
   */
  async createAppdeploy(request: CreateAppdeployRequest): Promise<CreateAppdeployResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAppdeployEx(request, headers, runtime);
  }

  /**
   * Description: 创建一个发布单
   * Summary: 创建一个发布单
   */
  async createAppdeployEx(request: CreateAppdeployRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAppdeployResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAppdeployResponse>(await this.doRequest("1.0", "yunyou.yunqing.appdeploy.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAppdeployResponse({}));
  }

  /**
   * Description: 查询环境中的解决方案实例
   * Summary: 查询环境中的解决方案实例
   */
  async querySolutioninstance(request: QuerySolutioninstanceRequest): Promise<QuerySolutioninstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySolutioninstanceEx(request, headers, runtime);
  }

  /**
   * Description: 查询环境中的解决方案实例
   * Summary: 查询环境中的解决方案实例
   */
  async querySolutioninstanceEx(request: QuerySolutioninstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySolutioninstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySolutioninstanceResponse>(await this.doRequest("1.0", "yunyou.yunqing.solutioninstance.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySolutioninstanceResponse({}));
  }

  /**
   * Description: 导入解决方案
   * Summary: 导入解决方案
   */
  async importSolutioninstance(request: ImportSolutioninstanceRequest): Promise<ImportSolutioninstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importSolutioninstanceEx(request, headers, runtime);
  }

  /**
   * Description: 导入解决方案
   * Summary: 导入解决方案
   */
  async importSolutioninstanceEx(request: ImportSolutioninstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportSolutioninstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportSolutioninstanceResponse>(await this.doRequest("1.0", "yunyou.yunqing.solutioninstance.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportSolutioninstanceResponse({}));
  }

  /**
   * Description: 检查解决方案是否可以导入
   * Summary: 检查解决方案是否可以导入
   */
  async checkSolutioninstanceImport(request: CheckSolutioninstanceImportRequest): Promise<CheckSolutioninstanceImportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkSolutioninstanceImportEx(request, headers, runtime);
  }

  /**
   * Description: 检查解决方案是否可以导入
   * Summary: 检查解决方案是否可以导入
   */
  async checkSolutioninstanceImportEx(request: CheckSolutioninstanceImportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckSolutioninstanceImportResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckSolutioninstanceImportResponse>(await this.doRequest("1.0", "yunyou.yunqing.solutioninstance.import.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckSolutioninstanceImportResponse({}));
  }

  /**
   * Description: 返回解决方案支持的操作列表
   * Summary: 返回解决方案支持的操作列表
   */
  async describeSolutioninstance(request: DescribeSolutioninstanceRequest): Promise<DescribeSolutioninstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.describeSolutioninstanceEx(request, headers, runtime);
  }

  /**
   * Description: 返回解决方案支持的操作列表
   * Summary: 返回解决方案支持的操作列表
   */
  async describeSolutioninstanceEx(request: DescribeSolutioninstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DescribeSolutioninstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<DescribeSolutioninstanceResponse>(await this.doRequest("1.0", "yunyou.yunqing.solutioninstance.describe", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DescribeSolutioninstanceResponse({}));
  }

  /**
   * Description: 废弃一个解决方案
   * Summary: 废弃一个解决方案
   */
  async deprecateSolutioninstance(request: DeprecateSolutioninstanceRequest): Promise<DeprecateSolutioninstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deprecateSolutioninstanceEx(request, headers, runtime);
  }

  /**
   * Description: 废弃一个解决方案
   * Summary: 废弃一个解决方案
   */
  async deprecateSolutioninstanceEx(request: DeprecateSolutioninstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeprecateSolutioninstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<DeprecateSolutioninstanceResponse>(await this.doRequest("1.0", "yunyou.yunqing.solutioninstance.deprecate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeprecateSolutioninstanceResponse({}));
  }

  /**
   * Description: 完成一个解决方案
   * Summary: 完成一个解决方案
   */
  async finishSolutioninstance(request: FinishSolutioninstanceRequest): Promise<FinishSolutioninstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.finishSolutioninstanceEx(request, headers, runtime);
  }

  /**
   * Description: 完成一个解决方案
   * Summary: 完成一个解决方案
   */
  async finishSolutioninstanceEx(request: FinishSolutioninstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<FinishSolutioninstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<FinishSolutioninstanceResponse>(await this.doRequest("1.0", "yunyou.yunqing.solutioninstance.finish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new FinishSolutioninstanceResponse({}));
  }

  /**
   * Description: reopen一个解决方案
   * Summary: reopen一个解决方案
   */
  async reopenSolutioninstance(request: ReopenSolutioninstanceRequest): Promise<ReopenSolutioninstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.reopenSolutioninstanceEx(request, headers, runtime);
  }

  /**
   * Description: reopen一个解决方案
   * Summary: reopen一个解决方案
   */
  async reopenSolutioninstanceEx(request: ReopenSolutioninstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReopenSolutioninstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<ReopenSolutioninstanceResponse>(await this.doRequest("1.0", "yunyou.yunqing.solutioninstance.reopen", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReopenSolutioninstanceResponse({}));
  }

  /**
   * Description: 导入一个云架构
   * Summary: 导入一个云架构
   */
  async importEnvMeta(request: ImportEnvMetaRequest): Promise<ImportEnvMetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importEnvMetaEx(request, headers, runtime);
  }

  /**
   * Description: 导入一个云架构
   * Summary: 导入一个云架构
   */
  async importEnvMetaEx(request: ImportEnvMetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportEnvMetaResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportEnvMetaResponse>(await this.doRequest("1.0", "yunyou.yunqing.env.meta.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportEnvMetaResponse({}));
  }

  /**
   * Description: 导入产品元数据
   * Summary: 导入产品元数据
   */
  async importProdMeta(request: ImportProdMetaRequest): Promise<ImportProdMetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importProdMetaEx(request, headers, runtime);
  }

  /**
   * Description: 导入产品元数据
   * Summary: 导入产品元数据
   */
  async importProdMetaEx(request: ImportProdMetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportProdMetaResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportProdMetaResponse>(await this.doRequest("1.0", "yunyou.yunqing.prod.meta.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportProdMetaResponse({}));
  }

  /**
   * Description: 卸载部署单元实例
   * Summary: 卸载部署单元实例
   */
  async uninstallProdinstanceDeployunit(request: UninstallProdinstanceDeployunitRequest): Promise<UninstallProdinstanceDeployunitResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uninstallProdinstanceDeployunitEx(request, headers, runtime);
  }

  /**
   * Description: 卸载部署单元实例
   * Summary: 卸载部署单元实例
   */
  async uninstallProdinstanceDeployunitEx(request: UninstallProdinstanceDeployunitRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UninstallProdinstanceDeployunitResponse> {
    Util.validateModel(request);
    return $tea.cast<UninstallProdinstanceDeployunitResponse>(await this.doRequest("1.0", "yunyou.yunqing.prodinstance.deployunit.uninstall", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UninstallProdinstanceDeployunitResponse({}));
  }

  /**
   * Description: 集群内部pod信息查询，巡检使用
   * Summary: 集群内部pod信息查询，巡检使用
   */
  async queryClusterPods(request: QueryClusterPodsRequest): Promise<QueryClusterPodsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryClusterPodsEx(request, headers, runtime);
  }

  /**
   * Description: 集群内部pod信息查询，巡检使用
   * Summary: 集群内部pod信息查询，巡检使用
   */
  async queryClusterPodsEx(request: QueryClusterPodsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryClusterPodsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryClusterPodsResponse>(await this.doRequest("1.0", "yunyou.yunqing.cluster.pods.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryClusterPodsResponse({}));
  }

  /**
   * Description: 集群内部kubeconfig查询巡检使用
   * Summary: 集群内部kubeconfig查询巡检使用
   */
  async queryClusterKubeconfig(request: QueryClusterKubeconfigRequest): Promise<QueryClusterKubeconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryClusterKubeconfigEx(request, headers, runtime);
  }

  /**
   * Description: 集群内部kubeconfig查询巡检使用
   * Summary: 集群内部kubeconfig查询巡检使用
   */
  async queryClusterKubeconfigEx(request: QueryClusterKubeconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryClusterKubeconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryClusterKubeconfigResponse>(await this.doRequest("1.0", "yunyou.yunqing.cluster.kubeconfig.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryClusterKubeconfigResponse({}));
  }

  /**
   * Description: 【ODP虚商迁移】公有云支持创建公网SLB
  https://aone.alipay.com/req/33161543?from=ak&
   * Summary: 生成公网访问的slb
   */
  async enableDynamicslb(request: EnableDynamicslbRequest): Promise<EnableDynamicslbResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.enableDynamicslbEx(request, headers, runtime);
  }

  /**
   * Description: 【ODP虚商迁移】公有云支持创建公网SLB
  https://aone.alipay.com/req/33161543?from=ak&
   * Summary: 生成公网访问的slb
   */
  async enableDynamicslbEx(request: EnableDynamicslbRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<EnableDynamicslbResponse> {
    Util.validateModel(request);
    return $tea.cast<EnableDynamicslbResponse>(await this.doRequest("1.0", "yunyou.yunqing.dynamicslb.enable", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new EnableDynamicslbResponse({}));
  }

  /**
   * Description: 移除公网SLB
  【ODP虚商迁移】公有云支持创建公网SLB https://aone.alipay.com/req/33161543?from=ak&
   * Summary: 移除公网访问的slb
   */
  async disableDynamicslb(request: DisableDynamicslbRequest): Promise<DisableDynamicslbResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.disableDynamicslbEx(request, headers, runtime);
  }

  /**
   * Description: 移除公网SLB
  【ODP虚商迁移】公有云支持创建公网SLB https://aone.alipay.com/req/33161543?from=ak&
   * Summary: 移除公网访问的slb
   */
  async disableDynamicslbEx(request: DisableDynamicslbRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DisableDynamicslbResponse> {
    Util.validateModel(request);
    return $tea.cast<DisableDynamicslbResponse>(await this.doRequest("1.0", "yunyou.yunqing.dynamicslb.disable", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DisableDynamicslbResponse({}));
  }

  /**
   * Description: 云游环境下应用dns的上下线
   * Summary: 云游环境下应用dns的上下线
   */
  async execClusterDns(request: ExecClusterDnsRequest): Promise<ExecClusterDnsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execClusterDnsEx(request, headers, runtime);
  }

  /**
   * Description: 云游环境下应用dns的上下线
   * Summary: 云游环境下应用dns的上下线
   */
  async execClusterDnsEx(request: ExecClusterDnsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecClusterDnsResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecClusterDnsResponse>(await this.doRequest("1.0", "yunyou.yunqing.cluster.dns.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecClusterDnsResponse({}));
  }

  /**
   * Description: 云游环境下应用容器的下线
   * Summary: 云游环境下应用容器的下线
   */
  async offlineClusterContainer(request: OfflineClusterContainerRequest): Promise<OfflineClusterContainerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.offlineClusterContainerEx(request, headers, runtime);
  }

  /**
   * Description: 云游环境下应用容器的下线
   * Summary: 云游环境下应用容器的下线
   */
  async offlineClusterContainerEx(request: OfflineClusterContainerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OfflineClusterContainerResponse> {
    Util.validateModel(request);
    return $tea.cast<OfflineClusterContainerResponse>(await this.doRequest("1.0", "yunyou.yunqing.cluster.container.offline", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OfflineClusterContainerResponse({}));
  }

  /**
   * Description: 云游环境下应用容器的上线
   * Summary: 云游环境下应用容器的上线
   */
  async onlineClusterContainer(request: OnlineClusterContainerRequest): Promise<OnlineClusterContainerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.onlineClusterContainerEx(request, headers, runtime);
  }

  /**
   * Description: 云游环境下应用容器的上线
   * Summary: 云游环境下应用容器的上线
   */
  async onlineClusterContainerEx(request: OnlineClusterContainerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OnlineClusterContainerResponse> {
    Util.validateModel(request);
    return $tea.cast<OnlineClusterContainerResponse>(await this.doRequest("1.0", "yunyou.yunqing.cluster.container.online", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OnlineClusterContainerResponse({}));
  }

  /**
   * Description: 查询应用启动参数
   * Summary: 查询应用启动参数
   */
  async queryAppparam(request: QueryAppparamRequest): Promise<QueryAppparamResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAppparamEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用启动参数
   * Summary: 查询应用启动参数
   */
  async queryAppparamEx(request: QueryAppparamRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAppparamResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAppparamResponse>(await this.doRequest("1.0", "yunyou.yunqing.appparam.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAppparamResponse({}));
  }

  /**
   * Description: 查询产品解决方案的所有发布单
   * Summary: 查询产品解决方案的所有发布单
   */
  async pagequerySolutionOpsplan(request: PagequerySolutionOpsplanRequest): Promise<PagequerySolutionOpsplanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequerySolutionOpsplanEx(request, headers, runtime);
  }

  /**
   * Description: 查询产品解决方案的所有发布单
   * Summary: 查询产品解决方案的所有发布单
   */
  async pagequerySolutionOpsplanEx(request: PagequerySolutionOpsplanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequerySolutionOpsplanResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequerySolutionOpsplanResponse>(await this.doRequest("1.0", "yunyou.yunqing.solution.opsplan.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequerySolutionOpsplanResponse({}));
  }

  /**
   * Description: 确认解决方案的各种规划
   * Summary: 确认解决方案规划
   */
  async confirmSolutionPlan(request: ConfirmSolutionPlanRequest): Promise<ConfirmSolutionPlanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmSolutionPlanEx(request, headers, runtime);
  }

  /**
   * Description: 确认解决方案的各种规划
   * Summary: 确认解决方案规划
   */
  async confirmSolutionPlanEx(request: ConfirmSolutionPlanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmSolutionPlanResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmSolutionPlanResponse>(await this.doRequest("1.0", "yunyou.yunqing.solution.plan.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmSolutionPlanResponse({}));
  }

  /**
   * Description: 解决方案是否完成规划
   * Summary: 解决方案是否完成规划
   */
  async getSolutionPlanstatus(request: GetSolutionPlanstatusRequest): Promise<GetSolutionPlanstatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getSolutionPlanstatusEx(request, headers, runtime);
  }

  /**
   * Description: 解决方案是否完成规划
   * Summary: 解决方案是否完成规划
   */
  async getSolutionPlanstatusEx(request: GetSolutionPlanstatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetSolutionPlanstatusResponse> {
    Util.validateModel(request);
    return $tea.cast<GetSolutionPlanstatusResponse>(await this.doRequest("1.0", "yunyou.yunqing.solution.planstatus.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetSolutionPlanstatusResponse({}));
  }

  /**
   * Description: 分页查询迭代详情
   * Summary: 分页查询迭代详情
   */
  async pagequeryProditeration(request: PagequeryProditerationRequest): Promise<PagequeryProditerationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryProditerationEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询迭代详情
   * Summary: 分页查询迭代详情
   */
  async pagequeryProditerationEx(request: PagequeryProditerationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryProditerationResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryProditerationResponse>(await this.doRequest("1.0", "yunyou.yunqing.proditeration.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryProditerationResponse({}));
  }

  /**
   * Description: 部署单元批量创建
   * Summary: 部署单元批量创建
   */
  async createProdinstanceDeployunitbatch(request: CreateProdinstanceDeployunitbatchRequest): Promise<CreateProdinstanceDeployunitbatchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createProdinstanceDeployunitbatchEx(request, headers, runtime);
  }

  /**
   * Description: 部署单元批量创建
   * Summary: 部署单元批量创建
   */
  async createProdinstanceDeployunitbatchEx(request: CreateProdinstanceDeployunitbatchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateProdinstanceDeployunitbatchResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateProdinstanceDeployunitbatchResponse>(await this.doRequest("1.0", "yunyou.yunqing.prodinstance.deployunitbatch.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateProdinstanceDeployunitbatchResponse({}));
  }

  /**
   * Description: 发布单应用回滚
   * Summary: 发布单应用回滚
   */
  async rollbackOpsApp(request: RollbackOpsAppRequest): Promise<RollbackOpsAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.rollbackOpsAppEx(request, headers, runtime);
  }

  /**
   * Description: 发布单应用回滚
   * Summary: 发布单应用回滚
   */
  async rollbackOpsAppEx(request: RollbackOpsAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RollbackOpsAppResponse> {
    Util.validateModel(request);
    return $tea.cast<RollbackOpsAppResponse>(await this.doRequest("1.0", "yunyou.yunqing.ops.app.rollback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RollbackOpsAppResponse({}));
  }

  /**
   * Description: 发布单产品回滚
   * Summary: 发布单产品回滚
   */
  async rollbackOpsProduct(request: RollbackOpsProductRequest): Promise<RollbackOpsProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.rollbackOpsProductEx(request, headers, runtime);
  }

  /**
   * Description: 发布单产品回滚
   * Summary: 发布单产品回滚
   */
  async rollbackOpsProductEx(request: RollbackOpsProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RollbackOpsProductResponse> {
    Util.validateModel(request);
    return $tea.cast<RollbackOpsProductResponse>(await this.doRequest("1.0", "yunyou.yunqing.ops.product.rollback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RollbackOpsProductResponse({}));
  }

  /**
   * Description: 直接查询集群的pod信息，不是查询云游的基线！
   * Summary: 查询集群pod信息
   */
  async queryClusterNativepod(request: QueryClusterNativepodRequest): Promise<QueryClusterNativepodResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryClusterNativepodEx(request, headers, runtime);
  }

  /**
   * Description: 直接查询集群的pod信息，不是查询云游的基线！
   * Summary: 查询集群pod信息
   */
  async queryClusterNativepodEx(request: QueryClusterNativepodRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryClusterNativepodResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryClusterNativepodResponse>(await this.doRequest("1.0", "yunyou.yunqing.cluster.nativepod.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryClusterNativepodResponse({}));
  }

  /**
   * Description: 查询基线应用容器
   * Summary: 查询基线应用容器
   */
  async pagequeryBaselineAppcontainers(request: PagequeryBaselineAppcontainersRequest): Promise<PagequeryBaselineAppcontainersResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryBaselineAppcontainersEx(request, headers, runtime);
  }

  /**
   * Description: 查询基线应用容器
   * Summary: 查询基线应用容器
   */
  async pagequeryBaselineAppcontainersEx(request: PagequeryBaselineAppcontainersRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryBaselineAppcontainersResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryBaselineAppcontainersResponse>(await this.doRequest("1.0", "yunyou.yunqing.baseline.appcontainers.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryBaselineAppcontainersResponse({}));
  }

  /**
   * Description: 回滚快照查询
   * Summary: 回滚快照查询
   */
  async pagequeryRollbackSnapshotversion(request: PagequeryRollbackSnapshotversionRequest): Promise<PagequeryRollbackSnapshotversionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryRollbackSnapshotversionEx(request, headers, runtime);
  }

  /**
   * Description: 回滚快照查询
   * Summary: 回滚快照查询
   */
  async pagequeryRollbackSnapshotversionEx(request: PagequeryRollbackSnapshotversionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryRollbackSnapshotversionResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryRollbackSnapshotversionResponse>(await this.doRequest("1.0", "yunyou.yunqing.rollback.snapshotversion.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryRollbackSnapshotversionResponse({}));
  }

  /**
   * Description: 产品是否可创建测试单
   * Summary: 产品是否可创建测试单
   */
  async enableProdAutotest(request: EnableProdAutotestRequest): Promise<EnableProdAutotestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.enableProdAutotestEx(request, headers, runtime);
  }

  /**
   * Description: 产品是否可创建测试单
   * Summary: 产品是否可创建测试单
   */
  async enableProdAutotestEx(request: EnableProdAutotestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<EnableProdAutotestResponse> {
    Util.validateModel(request);
    return $tea.cast<EnableProdAutotestResponse>(await this.doRequest("1.0", "yunyou.yunqing.prod.autotest.enable", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new EnableProdAutotestResponse({}));
  }

  /**
   * Description: 系统参数查询
   * Summary: 系统参数查询
   */
  async querySystemParameter(request: QuerySystemParameterRequest): Promise<QuerySystemParameterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySystemParameterEx(request, headers, runtime);
  }

  /**
   * Description: 系统参数查询
   * Summary: 系统参数查询
   */
  async querySystemParameterEx(request: QuerySystemParameterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySystemParameterResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySystemParameterResponse>(await this.doRequest("1.0", "yunyou.yunqing.system.parameter.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySystemParameterResponse({}));
  }

  /**
   * Description: 查询发布单详情
  发布单详情的任务树是嵌套结构，OP目前不支持定义此类型的结构体
  故本接口返回了json string，调用方需要自己构造
   * Summary: 查询发布单详情
   */
  async queryOpsplanNodetree(request: QueryOpsplanNodetreeRequest): Promise<QueryOpsplanNodetreeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryOpsplanNodetreeEx(request, headers, runtime);
  }

  /**
   * Description: 查询发布单详情
  发布单详情的任务树是嵌套结构，OP目前不支持定义此类型的结构体
  故本接口返回了json string，调用方需要自己构造
   * Summary: 查询发布单详情
   */
  async queryOpsplanNodetreeEx(request: QueryOpsplanNodetreeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryOpsplanNodetreeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryOpsplanNodetreeResponse>(await this.doRequest("1.0", "yunyou.yunqing.opsplan.nodetree.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryOpsplanNodetreeResponse({}));
  }

  /**
   * Description: 站点信息list
   * Summary: 站点信息list
   */
  async listAapSites(request: ListAapSitesRequest): Promise<ListAapSitesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAapSitesEx(request, headers, runtime);
  }

  /**
   * Description: 站点信息list
   * Summary: 站点信息list
   */
  async listAapSitesEx(request: ListAapSitesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAapSitesResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAapSitesResponse>(await this.doRequest("1.0", "yunyou.yunqing.aap.sites.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAapSitesResponse({}));
  }

  /**
   * Description: AAP 元数据导入，包含：产品、应用、拓扑信息 。https://yuque.antfin-inc.com/tpaas/ednkxs/izdpx9s4at32mwbi?singleDoc# 《AAP：用户自定义产品接入》
   * Summary: AAP 元数据导入
   */
  async importAapMeta(request: ImportAapMetaRequest): Promise<ImportAapMetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importAapMetaEx(request, headers, runtime);
  }

  /**
   * Description: AAP 元数据导入，包含：产品、应用、拓扑信息 。https://yuque.antfin-inc.com/tpaas/ednkxs/izdpx9s4at32mwbi?singleDoc# 《AAP：用户自定义产品接入》
   * Summary: AAP 元数据导入
   */
  async importAapMetaEx(request: ImportAapMetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportAapMetaResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportAapMetaResponse>(await this.doRequest("1.0", "yunyou.yunqing.aap.meta.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportAapMetaResponse({}));
  }

  /**
   * Description: AAP 产品实例初始化
   * Summary: AAP 产品实例初始化
   */
  async initAapProductinstance(request: InitAapProductinstanceRequest): Promise<InitAapProductinstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initAapProductinstanceEx(request, headers, runtime);
  }

  /**
   * Description: AAP 产品实例初始化
   * Summary: AAP 产品实例初始化
   */
  async initAapProductinstanceEx(request: InitAapProductinstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitAapProductinstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<InitAapProductinstanceResponse>(await this.doRequest("1.0", "yunyou.yunqing.aap.productinstance.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitAapProductinstanceResponse({}));
  }

  /**
   * Description: 产品实例发布初始化
   * Summary: 产品实例发布初始化
   */
  async initAapRelease(request: InitAapReleaseRequest): Promise<InitAapReleaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initAapReleaseEx(request, headers, runtime);
  }

  /**
   * Description: 产品实例发布初始化
   * Summary: 产品实例发布初始化
   */
  async initAapReleaseEx(request: InitAapReleaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitAapReleaseResponse> {
    Util.validateModel(request);
    return $tea.cast<InitAapReleaseResponse>(await this.doRequest("1.0", "yunyou.yunqing.aap.release.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitAapReleaseResponse({}));
  }

  /**
   * Description: 产品实例部署
   * Summary: 产品实例部署
   */
  async deployAapProductinstance(request: DeployAapProductinstanceRequest): Promise<DeployAapProductinstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deployAapProductinstanceEx(request, headers, runtime);
  }

  /**
   * Description: 产品实例部署
   * Summary: 产品实例部署
   */
  async deployAapProductinstanceEx(request: DeployAapProductinstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeployAapProductinstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<DeployAapProductinstanceResponse>(await this.doRequest("1.0", "yunyou.yunqing.aap.productinstance.deploy", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeployAapProductinstanceResponse({}));
  }

  /**
   * Description: 发布单状态查询
   * Summary: 发布单
   */
  async getAapRelease(request: GetAapReleaseRequest): Promise<GetAapReleaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAapReleaseEx(request, headers, runtime);
  }

  /**
   * Description: 发布单状态查询
   * Summary: 发布单
   */
  async getAapReleaseEx(request: GetAapReleaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAapReleaseResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAapReleaseResponse>(await this.doRequest("1.0", "yunyou.yunqing.aap.release.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAapReleaseResponse({}));
  }

  /**
   * Description: 应用实例更新，比如：规格、镜像、参数等
   * Summary: 应用实例更新
   */
  async updateAapApplicationinstance(request: UpdateAapApplicationinstanceRequest): Promise<UpdateAapApplicationinstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAapApplicationinstanceEx(request, headers, runtime);
  }

  /**
   * Description: 应用实例更新，比如：规格、镜像、参数等
   * Summary: 应用实例更新
   */
  async updateAapApplicationinstanceEx(request: UpdateAapApplicationinstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAapApplicationinstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAapApplicationinstanceResponse>(await this.doRequest("1.0", "yunyou.yunqing.aap.applicationinstance.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAapApplicationinstanceResponse({}));
  }

  /**
   * Description: 应用实例查询
   * Summary: 应用实例查询
   */
  async queryAapApplicationinstance(request: QueryAapApplicationinstanceRequest): Promise<QueryAapApplicationinstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAapApplicationinstanceEx(request, headers, runtime);
  }

  /**
   * Description: 应用实例查询
   * Summary: 应用实例查询
   */
  async queryAapApplicationinstanceEx(request: QueryAapApplicationinstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAapApplicationinstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAapApplicationinstanceResponse>(await this.doRequest("1.0", "yunyou.yunqing.aap.applicationinstance.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAapApplicationinstanceResponse({}));
  }

  /**
   * Description: 应用规格配置修改
   * Summary: 应用规格配置修改
   */
  async setAapApplicationinstance(request: SetAapApplicationinstanceRequest): Promise<SetAapApplicationinstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setAapApplicationinstanceEx(request, headers, runtime);
  }

  /**
   * Description: 应用规格配置修改
   * Summary: 应用规格配置修改
   */
  async setAapApplicationinstanceEx(request: SetAapApplicationinstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetAapApplicationinstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<SetAapApplicationinstanceResponse>(await this.doRequest("1.0", "yunyou.yunqing.aap.applicationinstance.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetAapApplicationinstanceResponse({}));
  }

  /**
   * Description: 应用镜像修改
   * Summary: 应用镜像修改
   */
  async setAapImages(request: SetAapImagesRequest): Promise<SetAapImagesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setAapImagesEx(request, headers, runtime);
  }

  /**
   * Description: 应用镜像修改
   * Summary: 应用镜像修改
   */
  async setAapImagesEx(request: SetAapImagesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetAapImagesResponse> {
    Util.validateModel(request);
    return $tea.cast<SetAapImagesResponse>(await this.doRequest("1.0", "yunyou.yunqing.aap.images.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetAapImagesResponse({}));
  }

  /**
   * Description: 产品实例查询
   * Summary: 产品实例查询
   */
  async queryAapProductinstance(request: QueryAapProductinstanceRequest): Promise<QueryAapProductinstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAapProductinstanceEx(request, headers, runtime);
  }

  /**
   * Description: 产品实例查询
   * Summary: 产品实例查询
   */
  async queryAapProductinstanceEx(request: QueryAapProductinstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAapProductinstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAapProductinstanceResponse>(await this.doRequest("1.0", "yunyou.yunqing.aap.productinstance.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAapProductinstanceResponse({}));
  }

  /**
   * Description: 应用实例详情查询
   * Summary: 应用实例详情查询
   */
  async detailAapApplicationinstance(request: DetailAapApplicationinstanceRequest): Promise<DetailAapApplicationinstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailAapApplicationinstanceEx(request, headers, runtime);
  }

  /**
   * Description: 应用实例详情查询
   * Summary: 应用实例详情查询
   */
  async detailAapApplicationinstanceEx(request: DetailAapApplicationinstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailAapApplicationinstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailAapApplicationinstanceResponse>(await this.doRequest("1.0", "yunyou.yunqing.aap.applicationinstance.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailAapApplicationinstanceResponse({}));
  }

  /**
   * Description: 应用参数更新
   * Summary: 应用参数更新
   */
  async setAapParameters(request: SetAapParametersRequest): Promise<SetAapParametersResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setAapParametersEx(request, headers, runtime);
  }

  /**
   * Description: 应用参数更新
   * Summary: 应用参数更新
   */
  async setAapParametersEx(request: SetAapParametersRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetAapParametersResponse> {
    Util.validateModel(request);
    return $tea.cast<SetAapParametersResponse>(await this.doRequest("1.0", "yunyou.yunqing.aap.parameters.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetAapParametersResponse({}));
  }

  /**
   * Description: 产品实例卸载
   * Summary: 产品实例卸载
   */
  async deleteAapProductinstance(request: DeleteAapProductinstanceRequest): Promise<DeleteAapProductinstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteAapProductinstanceEx(request, headers, runtime);
  }

  /**
   * Description: 产品实例卸载
   * Summary: 产品实例卸载
   */
  async deleteAapProductinstanceEx(request: DeleteAapProductinstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteAapProductinstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteAapProductinstanceResponse>(await this.doRequest("1.0", "yunyou.yunqing.aap.productinstance.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteAapProductinstanceResponse({}));
  }

  /**
   * Description: 初始化云游local环境
   * Summary: 初始化云游local环境
   */
  async createEnv(request: CreateEnvRequest): Promise<CreateEnvResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createEnvEx(request, headers, runtime);
  }

  /**
   * Description: 初始化云游local环境
   * Summary: 初始化云游local环境
   */
  async createEnvEx(request: CreateEnvRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateEnvResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateEnvResponse>(await this.doRequest("1.0", "yunyou.yunqing.env.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateEnvResponse({}));
  }

  /**
   * Description: 云游纳管的所有环境基本信息查询
   * Summary: 云游纳管的所有环境基本信息查询
   */
  async allEnvs(request: AllEnvsRequest): Promise<AllEnvsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allEnvsEx(request, headers, runtime);
  }

  /**
   * Description: 云游纳管的所有环境基本信息查询
   * Summary: 云游纳管的所有环境基本信息查询
   */
  async allEnvsEx(request: AllEnvsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllEnvsResponse> {
    Util.validateModel(request);
    return $tea.cast<AllEnvsResponse>(await this.doRequest("1.0", "yunyou.yunqing.envs.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllEnvsResponse({}));
  }

  /**
   * Description: 产品基线基本信息分页查询
   * Summary: 产品基线基本信息分页查询
   */
  async pagequeryProds(request: PagequeryProdsRequest): Promise<PagequeryProdsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryProdsEx(request, headers, runtime);
  }

  /**
   * Description: 产品基线基本信息分页查询
   * Summary: 产品基线基本信息分页查询
   */
  async pagequeryProdsEx(request: PagequeryProdsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryProdsResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryProdsResponse>(await this.doRequest("1.0", "yunyou.yunqing.prods.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryProdsResponse({}));
  }

  /**
   * Description: 产品基线资源元数据查询
   * Summary: 产品基线资源元数据查询
   */
  async pagequeryProdsResources(request: PagequeryProdsResourcesRequest): Promise<PagequeryProdsResourcesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryProdsResourcesEx(request, headers, runtime);
  }

  /**
   * Description: 产品基线资源元数据查询
   * Summary: 产品基线资源元数据查询
   */
  async pagequeryProdsResourcesEx(request: PagequeryProdsResourcesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryProdsResourcesResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryProdsResourcesResponse>(await this.doRequest("1.0", "yunyou.yunqing.prods.resources.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryProdsResourcesResponse({}));
  }

  /**
   * Description: 产品基线容器实例详情分页查询
   * Summary: 产品基线容器实例详情查询
   */
  async pagequeryResourceinstancesContainers(request: PagequeryResourceinstancesContainersRequest): Promise<PagequeryResourceinstancesContainersResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryResourceinstancesContainersEx(request, headers, runtime);
  }

  /**
   * Description: 产品基线容器实例详情分页查询
   * Summary: 产品基线容器实例详情查询
   */
  async pagequeryResourceinstancesContainersEx(request: PagequeryResourceinstancesContainersRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryResourceinstancesContainersResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryResourceinstancesContainersResponse>(await this.doRequest("1.0", "yunyou.yunqing.resourceinstances.containers.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryResourceinstancesContainersResponse({}));
  }

  /**
   * Description: 产品所属应用基线元数据分页查询
   * Summary: 产品所属应用基线元数据分页查询
   */
  async pagequeryProdsApps(request: PagequeryProdsAppsRequest): Promise<PagequeryProdsAppsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryProdsAppsEx(request, headers, runtime);
  }

  /**
   * Description: 产品所属应用基线元数据分页查询
   * Summary: 产品所属应用基线元数据分页查询
   */
  async pagequeryProdsAppsEx(request: PagequeryProdsAppsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryProdsAppsResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryProdsAppsResponse>(await this.doRequest("1.0", "yunyou.yunqing.prods.apps.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryProdsAppsResponse({}));
  }

  /**
   * Description: 产品部署单元实例列表查询
   * Summary: 产品部署单元实例列表查询
   */
  async queryProdsDeploymentunits(request: QueryProdsDeploymentunitsRequest): Promise<QueryProdsDeploymentunitsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryProdsDeploymentunitsEx(request, headers, runtime);
  }

  /**
   * Description: 产品部署单元实例列表查询
   * Summary: 产品部署单元实例列表查询
   */
  async queryProdsDeploymentunitsEx(request: QueryProdsDeploymentunitsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryProdsDeploymentunitsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryProdsDeploymentunitsResponse>(await this.doRequest("1.0", "yunyou.yunqing.prods.deploymentunits.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryProdsDeploymentunitsResponse({}));
  }

  /**
   * Description: 产品基线应用所属lb资源分页查询
   * Summary: 产品基线应用所属lb资源分页查询
   */
  async pagequeryResourceinstancesLbs(request: PagequeryResourceinstancesLbsRequest): Promise<PagequeryResourceinstancesLbsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryResourceinstancesLbsEx(request, headers, runtime);
  }

  /**
   * Description: 产品基线应用所属lb资源分页查询
   * Summary: 产品基线应用所属lb资源分页查询
   */
  async pagequeryResourceinstancesLbsEx(request: PagequeryResourceinstancesLbsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryResourceinstancesLbsResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryResourceinstancesLbsResponse>(await this.doRequest("1.0", "yunyou.yunqing.resourceinstances.lbs.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryResourceinstancesLbsResponse({}));
  }

  /**
   * Description: 产品所属应用运维发布单创建
   * Summary: 产品所属应用运维发布单创建
   */
  async createProdsAppops(request: CreateProdsAppopsRequest): Promise<CreateProdsAppopsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createProdsAppopsEx(request, headers, runtime);
  }

  /**
   * Description: 产品所属应用运维发布单创建
   * Summary: 产品所属应用运维发布单创建
   */
  async createProdsAppopsEx(request: CreateProdsAppopsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateProdsAppopsResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateProdsAppopsResponse>(await this.doRequest("1.0", "yunyou.yunqing.prods.appops.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateProdsAppopsResponse({}));
  }

  /**
   * Description: 运维发布单查询
   * Summary: 运维发布单查询
   */
  async getProdsAppops(request: GetProdsAppopsRequest): Promise<GetProdsAppopsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getProdsAppopsEx(request, headers, runtime);
  }

  /**
   * Description: 运维发布单查询
   * Summary: 运维发布单查询
   */
  async getProdsAppopsEx(request: GetProdsAppopsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetProdsAppopsResponse> {
    Util.validateModel(request);
    return $tea.cast<GetProdsAppopsResponse>(await this.doRequest("1.0", "yunyou.yunqing.prods.appops.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetProdsAppopsResponse({}));
  }

  /**
   * Description: 发布单取消
   * Summary: 发布单取消
   */
  async cancelProdsAppops(request: CancelProdsAppopsRequest): Promise<CancelProdsAppopsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelProdsAppopsEx(request, headers, runtime);
  }

  /**
   * Description: 发布单取消
   * Summary: 发布单取消
   */
  async cancelProdsAppopsEx(request: CancelProdsAppopsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelProdsAppopsResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelProdsAppopsResponse>(await this.doRequest("1.0", "yunyou.yunqing.prods.appops.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelProdsAppopsResponse({}));
  }

  /**
   * Description: 发布单重试
   * Summary: 发布单重试
   */
  async retryProdsAppops(request: RetryProdsAppopsRequest): Promise<RetryProdsAppopsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryProdsAppopsEx(request, headers, runtime);
  }

  /**
   * Description: 发布单重试
   * Summary: 发布单重试
   */
  async retryProdsAppopsEx(request: RetryProdsAppopsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryProdsAppopsResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryProdsAppopsResponse>(await this.doRequest("1.0", "yunyou.yunqing.prods.appops.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryProdsAppopsResponse({}));
  }

  /**
   * Description: 应用缩容
   * Summary: 应用缩容
   */
  async scaleinProdsAppops(request: ScaleinProdsAppopsRequest): Promise<ScaleinProdsAppopsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.scaleinProdsAppopsEx(request, headers, runtime);
  }

  /**
   * Description: 应用缩容
   * Summary: 应用缩容
   */
  async scaleinProdsAppopsEx(request: ScaleinProdsAppopsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ScaleinProdsAppopsResponse> {
    Util.validateModel(request);
    return $tea.cast<ScaleinProdsAppopsResponse>(await this.doRequest("1.0", "yunyou.yunqing.prods.appops.scalein", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ScaleinProdsAppopsResponse({}));
  }

}
