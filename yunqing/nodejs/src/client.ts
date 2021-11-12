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
  static names(): { [key: string]: string } {
    return {
      namespace: 'namespace',
      podList: 'pod_list',
      appName: 'app_name',
      appVersion: 'app_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      namespace: 'string',
      podList: { 'type': 'array', 'itemType': PodInfo },
      appName: 'string',
      appVersion: 'string',
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
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      envId: 'env_id',
      productCode: 'product_code',
      unitId: 'unit_id',
      unitName: 'unit_name',
      cellId: 'cell_id',
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
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appServiceId: 'app_service_id',
      containerIds: 'container_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appServiceId: 'string',
      containerIds: { 'type': 'array', 'itemType': 'string' },
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
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apps: 'apps',
      cellIds: 'cell_ids',
      prodCode: 'prod_code',
      solutionId: 'solution_id',
      force: 'force',
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
  // com.alipay.cloud.apyunqing.boxing.model.box序列化后的结果
  boxData: string;
  // 环境id
  envId: string;
  // 工号
  workNo: string;
  // 花名
  name?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      boxData: 'box_data',
      envId: 'env_id',
      workNo: 'work_no',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      boxData: 'string',
      envId: 'string',
      workNo: 'string',
      name: 'string',
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

export class CheckSolutioninstanceImportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 环境id
  envId: string;
  // com.alipay.cloud.apyunqing.boxing.model.box序列化后的结果
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
  // 单元实例ID
  unitInstanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cellId: 'cell_id',
      envId: 'env_id',
      productCode: 'product_code',
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
      unitInstanceId: 'string',
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
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      envId: 'env_id',
      prodCode: 'prod_code',
      appNames: 'app_names',
      opsAction: 'ops_action',
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

export class QuerySolutionPreviewtaskRequest extends $tea.Model {
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

export class QuerySolutionPreviewtaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 产品预览任务查询
  prodPreviewTasks?: ProdPreviewTasks[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      prodPreviewTasks: 'prod_preview_tasks',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      prodPreviewTasks: { 'type': 'array', 'itemType': ProdPreviewTasks },
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
          sdk_version: "3.12.4",
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
   * Description: 卸载应用服务实例。
   * Summary: 卸载应用服务实例。
   */
  async uninstallProdinstanceAppservice(request: UninstallProdinstanceAppserviceRequest): Promise<UninstallProdinstanceAppserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uninstallProdinstanceAppserviceEx(request, headers, runtime);
  }

  /**
   * Description: 卸载应用服务实例。
   * Summary: 卸载应用服务实例。
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
   * Description: 解决方案应用previewtask查询
   * Summary: 解决方案应用previewtask查询
   */
  async querySolutionPreviewtask(request: QuerySolutionPreviewtaskRequest): Promise<QuerySolutionPreviewtaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySolutionPreviewtaskEx(request, headers, runtime);
  }

  /**
   * Description: 解决方案应用previewtask查询
   * Summary: 解决方案应用previewtask查询
   */
  async querySolutionPreviewtaskEx(request: QuerySolutionPreviewtaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySolutionPreviewtaskResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySolutionPreviewtaskResponse>(await this.doRequest("1.0", "yunyou.yunqing.solution.previewtask.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySolutionPreviewtaskResponse({}));
  }

}
