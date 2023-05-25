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

// fixpath
export class FixPath extends $tea.Model {
  // 路径
  path?: string;
  // 值
  value?: string;
  static names(): { [key: string]: string } {
    return {
      path: 'path',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      path: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 路径
export class Path extends $tea.Model {
  // fixpath
  fixPath?: FixPath;
  // shibai lujing
  failedPath?: string;
  static names(): { [key: string]: string } {
    return {
      fixPath: 'fix_path',
      failedPath: 'failed_path',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fixPath: FixPath,
      failedPath: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// rule
export class Rule extends $tea.Model {
  // 名称
  name: string;
  // 状态
  status?: string;
  // path
  paths?: Path[];
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      status: 'status',
      paths: 'paths',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      status: 'string',
      paths: { 'type': 'array', 'itemType': Path },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 基线扫描框架
export class Framework extends $tea.Model {
  // 策略id
  id?: string;
  // 框架名称
  name?: string;
  // 是否启用
  enable?: boolean;
  // 描述
  describe?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      enable: 'enable',
      describe: 'describe',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      enable: 'boolean',
      describe: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// cronjob
export class Cronjob extends $tea.Model {
  // crontab格式表述的cronjob
  crontab?: string;
  static names(): { [key: string]: string } {
    return {
      crontab: 'crontab',
    };
  }

  static types(): { [key: string]: any } {
    return {
      crontab: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 基线策略
export class BaselineStrategy extends $tea.Model {
  // 框架列表
  frameworks?: Framework[];
  // cronjob
  cronjob?: Cronjob;
  // 额外配置
  extended?: string;
  static names(): { [key: string]: string } {
    return {
      frameworks: 'frameworks',
      cronjob: 'cronjob',
      extended: 'extended',
    };
  }

  static types(): { [key: string]: any } {
    return {
      frameworks: { 'type': 'array', 'itemType': Framework },
      cronjob: Cronjob,
      extended: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 运行时相关策略
export class RuntimeStrategy extends $tea.Model {
  // 安全webshell配置
  webshell?: boolean;
  // 提权保护配置
  privilege?: boolean;
  // 是否打开
  enable?: boolean;
  static names(): { [key: string]: string } {
    return {
      webshell: 'webshell',
      privilege: 'privilege',
      enable: 'enable',
    };
  }

  static types(): { [key: string]: any } {
    return {
      webshell: 'boolean',
      privilege: 'boolean',
      enable: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 安全组件简报
export class ClusterSecurityComponentBrief extends $tea.Model {
  // 风险项数量
  cnt?: number;
  // 组件名称
  component?: string;
  // 描述
  content?: string;
  // 日期
  date?: string;
  static names(): { [key: string]: string } {
    return {
      cnt: 'cnt',
      component: 'component',
      content: 'content',
      date: 'date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cnt: 'number',
      component: 'string',
      content: 'string',
      date: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// control
export class Control extends $tea.Model {
  // id
  id: string;
  // rule
  rules?: Rule[];
  // 名称
  name?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      rules: 'rules',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      rules: { 'type': 'array', 'itemType': Rule },
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 镜像相关策略
export class ImageStrategy extends $tea.Model {
  // 准入
  access?: boolean;
  // 巡检
  cronjob?: Cronjob;
  static names(): { [key: string]: string } {
    return {
      access: 'access',
      cronjob: 'cronjob',
    };
  }

  static types(): { [key: string]: any } {
    return {
      access: 'boolean',
      cronjob: Cronjob,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 蚂蚁扫描镜像
export class AntScanImage extends $tea.Model {
  // 镜像名称
  image: string;
  // app名称
  appName: string;
  static names(): { [key: string]: string } {
    return {
      image: 'image',
      appName: 'app_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      image: 'string',
      appName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 策略
export class Strategy extends $tea.Model {
  // 策略id
  strategyId: string;
  // 策略名
  strategyName?: string;
  // 镜像相关策略内容
  image?: ImageStrategy;
  // 基线相关策略
  baseline?: BaselineStrategy;
  // 运行时策略
  runtime?: RuntimeStrategy;
  static names(): { [key: string]: string } {
    return {
      strategyId: 'strategy_id',
      strategyName: 'strategy_name',
      image: 'image',
      baseline: 'baseline',
      runtime: 'runtime',
    };
  }

  static types(): { [key: string]: any } {
    return {
      strategyId: 'string',
      strategyName: 'string',
      image: ImageStrategy,
      baseline: BaselineStrategy,
      runtime: RuntimeStrategy,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 仓库
export class Repository extends $tea.Model {
  // 仓库ID
  id: string;
  // 仓库名称
  name: string;
  // 项目ID
  projectId: string;
  // 仓库Tag数
  tagsCount: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      projectId: 'project_id',
      tagsCount: 'tags_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      projectId: 'string',
      tagsCount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 仓库项目
export class RepoProject extends $tea.Model {
  // project id
  id: string;
  // 项目名称
  name: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 风险操作审计
export class RiskTaskAudit extends $tea.Model {
  // 操作人
  operator: string;
  // 操作类型
  operationType: string;
  // 风险工单ID
  riskTaskId: string;
  // 评论
  comment: string;
  static names(): { [key: string]: string } {
    return {
      operator: 'operator',
      operationType: 'operation_type',
      riskTaskId: 'risk_task_id',
      comment: 'comment',
    };
  }

  static types(): { [key: string]: any } {
    return {
      operator: 'string',
      operationType: 'string',
      riskTaskId: 'string',
      comment: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 集群
export class Cluster extends $tea.Model {
  // id
  id: string;
  // 集群名称
  clusterName: string;
  // 环境
  env: string;
  // 纳管状态（imported已纳管/unimported未纳管）
  status: string;
  // 导入方式
  source: string;
  // 白名单
  namespaceWhitelist: string[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      clusterName: 'cluster_name',
      env: 'env',
      status: 'status',
      source: 'source',
      namespaceWhitelist: 'namespace_whitelist',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      clusterName: 'string',
      env: 'string',
      status: 'string',
      source: 'string',
      namespaceWhitelist: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 扫描结果
export class ScanResult extends $tea.Model {
  // 安全组件名
  component: string;
  // 结果
  result: string;
  static names(): { [key: string]: string } {
    return {
      component: 'component',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      component: 'string',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 蚂蚁扫描镜像列表
export class AntScanImageList extends $tea.Model {
  // 镜像镜像扫描
  list: AntScanImage[];
  static names(): { [key: string]: string } {
    return {
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': AntScanImage },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 风险解决方案
export class RiskSolution extends $tea.Model {
  // 风险解决方案ID
  id: string;
  // 名称
  name: string;
  // 风险名称
  riskName: string;
  // 来源
  source: string;
  // 修复类型
  fixType: string;
  // 风险描述
  riskDescription: string;
  // 风险解决方案
  solutionPlan: string;
  // 应急解决方案
  emergencyPlan: string;
  // 负责人
  owner: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      riskName: 'risk_name',
      source: 'source',
      fixType: 'fix_type',
      riskDescription: 'risk_description',
      solutionPlan: 'solution_plan',
      emergencyPlan: 'emergency_plan',
      owner: 'owner',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      riskName: 'string',
      source: 'string',
      fixType: 'string',
      riskDescription: 'string',
      solutionPlan: 'string',
      emergencyPlan: 'string',
      owner: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 基线扫描结果
export class BaselineScanResult extends $tea.Model {
  // 类型
  kind: string;
  // 资源名称
  name: string;
  // 命名空间
  namespace?: string;
  // 资源id
  resourceId: string;
  // 紧急control
  criticals?: Control[];
  // 高危control
  highs?: Control[];
  // 中危controls
  mids?: Control[];
  // 低危controls
  lows?: Control[];
  // 资源内容
  object?: string;
  static names(): { [key: string]: string } {
    return {
      kind: 'kind',
      name: 'name',
      namespace: 'namespace',
      resourceId: 'resource_id',
      criticals: 'criticals',
      highs: 'highs',
      mids: 'mids',
      lows: 'lows',
      object: 'object',
    };
  }

  static types(): { [key: string]: any } {
    return {
      kind: 'string',
      name: 'string',
      namespace: 'string',
      resourceId: 'string',
      criticals: { 'type': 'array', 'itemType': Control },
      highs: { 'type': 'array', 'itemType': Control },
      mids: { 'type': 'array', 'itemType': Control },
      lows: { 'type': 'array', 'itemType': Control },
      object: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 镜像仓库
export class ImageRepo extends $tea.Model {
  // repo ID
  id: string;
  // 镜像仓库名称
  name: string;
  // 镜像仓库域名
  domain: string;
  // 用户名
  userName: string;
  // 密码
  password: string;
  // 状态
  status: boolean;
  // 创建时间
  createTime: string;
  // 上次连接时间
  lastConnectTime: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      domain: 'domain',
      userName: 'user_name',
      password: 'password',
      status: 'status',
      createTime: 'create_time',
      lastConnectTime: 'last_connect_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      domain: 'string',
      userName: 'string',
      password: 'string',
      status: 'boolean',
      createTime: 'string',
      lastConnectTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 仓库扫描策略
export class RepoScanStrategy extends $tea.Model {
  // 策略ID
  id: string;
  // 仓库ID
  repoId: string;
  // 仓库列表
  projects: string[];
  // 仓库列表
  repositories: string[];
  // 扫描开始时间
  imageBeginTime: string;
  // 定时扫描任务
  crontab: string;
  // 下个日期
  nextDate: string;
  // 策略状态
  state: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      repoId: 'repo_id',
      projects: 'projects',
      repositories: 'repositories',
      imageBeginTime: 'image_begin_time',
      crontab: 'crontab',
      nextDate: 'next_date',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      repoId: 'string',
      projects: { 'type': 'array', 'itemType': 'string' },
      repositories: { 'type': 'array', 'itemType': 'string' },
      imageBeginTime: 'string',
      crontab: 'string',
      nextDate: 'string',
      state: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 集群安全简报
export class ClusterSecurityBrief extends $tea.Model {
  // 集群id
  clusterId: string;
  // 集群名
  clusterName: string;
  // 防护状态
  status: string;
  // 最后一次安全扫描时间
  lastScan: string;
  // 风险数量
  riskCnt: number;
  // 风险简报
  brief: ClusterSecurityComponentBrief[];
  // 扫描id
  scanId?: string;
  static names(): { [key: string]: string } {
    return {
      clusterId: 'cluster_id',
      clusterName: 'cluster_name',
      status: 'status',
      lastScan: 'last_scan',
      riskCnt: 'risk_cnt',
      brief: 'brief',
      scanId: 'scan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      clusterId: 'string',
      clusterName: 'string',
      status: 'string',
      lastScan: 'string',
      riskCnt: 'number',
      brief: { 'type': 'array', 'itemType': ClusterSecurityComponentBrief },
      scanId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 镜像
export class Image extends $tea.Model {
  // 镜像Ref
  imageRef: string;
  // 镜像标签
  imageTag: string;
  // 应用名称
  appName: string;
  // 扫描状态
  scanStatus: string;
  // 镜像漏洞
  imageVul: number;
  // 镜像风险漏洞
  imageRiskVul: number;
  // 开始时间
  startTime: string;
  // 结束时间
  endTime: string;
  static names(): { [key: string]: string } {
    return {
      imageRef: 'image_ref',
      imageTag: 'image_tag',
      appName: 'app_name',
      scanStatus: 'scan_status',
      imageVul: 'image_vul',
      imageRiskVul: 'image_risk_vul',
      startTime: 'start_time',
      endTime: 'end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      imageRef: 'string',
      imageTag: 'string',
      appName: 'string',
      scanStatus: 'string',
      imageVul: 'number',
      imageRiskVul: 'number',
      startTime: 'string',
      endTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 风险详情
export class Risk extends $tea.Model {
  // 风险ID
  id: string;
  // 风险名称
  name: string;
  // 类型
  source: string;
  // 等级
  priority: string;
  // 风险唯一标识
  identity: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      source: 'source',
      priority: 'priority',
      identity: 'identity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      source: 'string',
      priority: 'string',
      identity: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 标签
export class Label extends $tea.Model {
  // 标签key
  key: string;
  // 标签value
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

// 风险任务/工单
export class RiskTask extends $tea.Model {
  // ID
  id: string;
  // 风险名称
  displayName: string;
  // 优先级
  priority: string;
  // 当前状态
  state: string;
  // 风险类型
  riskType: string;
  // 负责人
  owner: string;
  // 到期时间
  deadlineTime: string;
  // 创建时间
  createdTime: string;
  // 响应阶段
  respondPhase: string;
  // 风险关注者
  followers: string[];
  // 安全工程师
  secOwner: string;
  // 到期天数
  daysLeft: number;
  // 风险ID
  riskId: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      displayName: 'display_name',
      priority: 'priority',
      state: 'state',
      riskType: 'risk_type',
      owner: 'owner',
      deadlineTime: 'deadline_time',
      createdTime: 'created_time',
      respondPhase: 'respond_phase',
      followers: 'followers',
      secOwner: 'sec_owner',
      daysLeft: 'days_left',
      riskId: 'risk_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      displayName: 'string',
      priority: 'string',
      state: 'string',
      riskType: 'string',
      owner: 'string',
      deadlineTime: 'string',
      createdTime: 'string',
      respondPhase: 'string',
      followers: { 'type': 'array', 'itemType': 'string' },
      secOwner: 'string',
      daysLeft: 'number',
      riskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRiskTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 风险任务名称
  name: string;
  // 风险来源，image/benchmark/runtime
  source: string;
  // 风险唯一标识
  identity: string;
  // 风险等级
  priority?: string;
  // 风险任务显示名称
  displayName: string;
  // 响应阶段，默认是日常阶段
  respondPhase?: string;
  // 风险责任人
  owner: string;
  // 安全责任人
  secOwner: string;
  // 风险关注者
  followers: string[];
  // 到期时间
  deadlineTime: string;
  // 环境标识ID
  envId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      source: 'source',
      identity: 'identity',
      priority: 'priority',
      displayName: 'display_name',
      respondPhase: 'respond_phase',
      owner: 'owner',
      secOwner: 'sec_owner',
      followers: 'followers',
      deadlineTime: 'deadline_time',
      envId: 'env_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      source: 'string',
      identity: 'string',
      priority: 'string',
      displayName: 'string',
      respondPhase: 'string',
      owner: 'string',
      secOwner: 'string',
      followers: { 'type': 'array', 'itemType': 'string' },
      deadlineTime: 'string',
      envId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRiskTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 风险任务ID
  riskTaskId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      riskTaskId: 'risk_task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      riskTaskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRiskTasksRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 当前页数
  page: number;
  // 页大小
  pageSize: number;
  // 风险ID
  riskTaskId?: string;
  // 风险名称
  displayName?: string;
  // 风险等级
  priority?: string;
  // 风险类型
  riskType?: string;
  // 风险状态
  riskTaskState?: string;
  // FROM时间点， 按照时间范围搜索的开始时间点
  creationTimeFrom?: string;
  // to时间点， 按照时间范围搜索的结束时间点	
  // 
  creationTimeTo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      page: 'page',
      pageSize: 'page_size',
      riskTaskId: 'risk_task_id',
      displayName: 'display_name',
      priority: 'priority',
      riskType: 'risk_type',
      riskTaskState: 'risk_task_state',
      creationTimeFrom: 'creation_time_from',
      creationTimeTo: 'creation_time_to',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      page: 'number',
      pageSize: 'number',
      riskTaskId: 'string',
      displayName: 'string',
      priority: 'string',
      riskType: 'string',
      riskTaskState: 'string',
      creationTimeFrom: 'string',
      creationTimeTo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRiskTasksResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 风险任务列表
  riskTasks?: RiskTask[];
  // 总条目数
  totalSize?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      riskTasks: 'risk_tasks',
      totalSize: 'total_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      riskTasks: { 'type': 'array', 'itemType': RiskTask },
      totalSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRiskTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 风险工单ID
  riskTaskId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      riskTaskId: 'risk_task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      riskTaskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRiskTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 风险共担详情
  riskTask?: RiskTask;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      riskTask: 'risk_task',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      riskTask: RiskTask,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateRiskTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 风险共担ID
  riskTaskId: string;
  // 风险工单状态
  state: string;
  // 风险责任人
  owner?: string;
  // 安全责任人
  secOwner?: string;
  // 风险关注人员列表
  followers?: string[];
  // 风险解决方案ID
  riskSolutionId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      riskTaskId: 'risk_task_id',
      state: 'state',
      owner: 'owner',
      secOwner: 'sec_owner',
      followers: 'followers',
      riskSolutionId: 'risk_solution_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      riskTaskId: 'string',
      state: 'string',
      owner: 'string',
      secOwner: 'string',
      followers: { 'type': 'array', 'itemType': 'string' },
      riskSolutionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateRiskTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 风险工单ID
  riskTaskId?: string;
  // 是否成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      riskTaskId: 'risk_task_id',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      riskTaskId: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmRiskTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 风险工单ID
  riskTaskId: string;
  // 评论
  comment?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      riskTaskId: 'risk_task_id',
      comment: 'comment',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      riskTaskId: 'string',
      comment: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmRiskTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是够成功
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

export class CancelRiskTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 风险工单ID
  riskTaskId: string;
  // 评论，理由
  comment?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      riskTaskId: 'risk_task_id',
      comment: 'comment',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      riskTaskId: 'string',
      comment: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelRiskTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
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

export class RefuseRiskTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 风险工单ID
  riskTaskId: string;
  // 评论
  comment?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      riskTaskId: 'risk_task_id',
      comment: 'comment',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      riskTaskId: 'string',
      comment: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RefuseRiskTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
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

export class VerifyRiskTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 风险工单ID
  riskTaskId: string;
  // 评论
  comment?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      riskTaskId: 'risk_task_id',
      comment: 'comment',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      riskTaskId: 'string',
      comment: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyRiskTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 成功与否
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

export class SendRiskTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 风险工单ID
  riskTaskId: string;
  // 责任人
  owner: string;
  // 评论
  comment?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      riskTaskId: 'risk_task_id',
      owner: 'owner',
      comment: 'comment',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      riskTaskId: 'string',
      owner: 'string',
      comment: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendRiskTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
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

export class CloseRiskTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 风险工单ID
  riskTaskId: string;
  // 描述，评论
  comment?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      riskTaskId: 'risk_task_id',
      comment: 'comment',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      riskTaskId: 'string',
      comment: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CloseRiskTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
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

export class GetRiskStatisticsRequest extends $tea.Model {
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

export class GetRiskStatisticsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 风险总数
  totalRiskTasksCount?: number;
  // 未修复风险数
  unfixedRiskTasksCount?: number;
  // 未响应风险数
  unconfirmedRisksTasksCount?: number;
  // 镜像漏洞风险数
  imageRiskTasksCount?: number;
  // 基线风险数
  benchmarkRiskTasksCount?: number;
  // 运行时风险数
  runtimeRiskTasksCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalRiskTasksCount: 'total_risk_tasks_count',
      unfixedRiskTasksCount: 'unfixed_risk_tasks_count',
      unconfirmedRisksTasksCount: 'unconfirmed_risks_tasks_count',
      imageRiskTasksCount: 'image_risk_tasks_count',
      benchmarkRiskTasksCount: 'benchmark_risk_tasks_count',
      runtimeRiskTasksCount: 'runtime_risk_tasks_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalRiskTasksCount: 'number',
      unfixedRiskTasksCount: 'number',
      unconfirmedRisksTasksCount: 'number',
      imageRiskTasksCount: 'number',
      benchmarkRiskTasksCount: 'number',
      runtimeRiskTasksCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRiskAuditsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 风险工单ID
  riskTaskId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      riskTaskId: 'risk_task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      riskTaskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRiskAuditsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 风险任务审计
  riskTaskAudits?: RiskTaskAudit[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      riskTaskAudits: 'risk_task_audits',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      riskTaskAudits: { 'type': 'array', 'itemType': RiskTaskAudit },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRiskSolutionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 名称
  name: string;
  // 关联风险ID
  riskId: string;
  // 解决方案来源
  source: string;
  // 修复类型
  fixType: string;
  // 风险描述
  riskDescription: string;
  // 风险解决方案
  solutionPlan: string;
  // 应急解决方案
  emergencyPlan: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      riskId: 'risk_id',
      source: 'source',
      fixType: 'fix_type',
      riskDescription: 'risk_description',
      solutionPlan: 'solution_plan',
      emergencyPlan: 'emergency_plan',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      riskId: 'string',
      source: 'string',
      fixType: 'string',
      riskDescription: 'string',
      solutionPlan: 'string',
      emergencyPlan: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRiskSolutionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 风险解决方案ID
  riskSolutionId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      riskSolutionId: 'risk_solution_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      riskSolutionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRiskSolutionsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 风险解决方案名称
  name?: string;
  // 风险ID
  riskId?: string;
  // 当前页
  page: number;
  // 页大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      riskId: 'risk_id',
      page: 'page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      riskId: 'string',
      page: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRiskSolutionsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 风险解决方案列表
  riskSolutions?: RiskSolution[];
  // 总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      riskSolutions: 'risk_solutions',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      riskSolutions: { 'type': 'array', 'itemType': RiskSolution },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRiskSolutionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 风险解决方案ID, risk_id和risk_solution_id至少有一个非空
  riskSolutionId?: string;
  // 风险ID，risk_id和risk_solution_id至少有一个非空
  riskId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      riskSolutionId: 'risk_solution_id',
      riskId: 'risk_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      riskSolutionId: 'string',
      riskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRiskSolutionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 风险解决方案
  riskSolution?: RiskSolution;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      riskSolution: 'risk_solution',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      riskSolution: RiskSolution,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateRiskSolutionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 风险解决方案ID
  riskSolutionId: string;
  // 解决方案类型
  fixType?: string;
  // 风险描述
  riskDescription?: string;
  // 风险解决方案
  solutionPlan?: string;
  // 应急解决方案
  emergencyPlan?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      riskSolutionId: 'risk_solution_id',
      fixType: 'fix_type',
      riskDescription: 'risk_description',
      solutionPlan: 'solution_plan',
      emergencyPlan: 'emergency_plan',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      riskSolutionId: 'string',
      fixType: 'string',
      riskDescription: 'string',
      solutionPlan: 'string',
      emergencyPlan: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateRiskSolutionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  更新是否成功
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

export class DeleteRiskSolutionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 风险解决方案ID
  riskSolutionId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      riskSolutionId: 'risk_solution_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      riskSolutionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteRiskSolutionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
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

export class ImportClusterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群id
  clusterId?: string;
  // 集群名称
  clusterName: string;
  // 环境
  env: string;
  // 导入方式（手工manual/自动auto）
  source: string;
  // 命名空间白名单
  namespaceWhitelist?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterId: 'cluster_id',
      clusterName: 'cluster_name',
      env: 'env',
      source: 'source',
      namespaceWhitelist: 'namespace_whitelist',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterId: 'string',
      clusterName: 'string',
      env: 'string',
      source: 'string',
      namespaceWhitelist: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportClusterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 被纳管的集群id
  clusterId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      clusterId: 'cluster_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      clusterId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddClusterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群名
  clusterName: string;
  // 环境
  env: string;
  // 必为manual
  source: string;
  // 命名空间白名单
  namespaceWhitelist: string[];
  // 新增集群kubeconfig
  kubeconfig: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterName: 'cluster_name',
      env: 'env',
      source: 'source',
      namespaceWhitelist: 'namespace_whitelist',
      kubeconfig: 'kubeconfig',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterName: 'string',
      env: 'string',
      source: 'string',
      namespaceWhitelist: { 'type': 'array', 'itemType': 'string' },
      kubeconfig: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddClusterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 	
  // 被纳管的集群id
  clusterId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      clusterId: 'cluster_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      clusterId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryClusterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群id
  clusterId?: string;
  // 集群名
  clusterName?: string;
  // 来源
  source?: string;
  // 状态
  status?: string;
  // 环境
  env?: string;
  // 当前页
  page: number;
  // 页大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterId: 'cluster_id',
      clusterName: 'cluster_name',
      source: 'source',
      status: 'status',
      env: 'env',
      page: 'page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterId: 'string',
      clusterName: 'string',
      source: 'string',
      status: 'string',
      env: 'string',
      page: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryClusterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总数
  totalCnt?: number;
  // 集群信息
  clusters?: Cluster[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalCnt: 'total_cnt',
      clusters: 'clusters',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalCnt: 'number',
      clusters: { 'type': 'array', 'itemType': Cluster },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryClusterNamespaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群id
  clusterId: string;
  // 集群名
  clusterName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterId: 'cluster_id',
      clusterName: 'cluster_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterId: 'string',
      clusterName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryClusterNamespaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 命名空间列表
  namespaces?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      namespaces: 'namespaces',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      namespaces: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReclaimClusterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群id
  clusterId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterId: 'cluster_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReclaimClusterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 被解绑的集群id
  clusterId?: string;
  // 被解绑的集群名
  clusterName?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      clusterId: 'cluster_id',
      clusterName: 'cluster_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      clusterId: 'string',
      clusterName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryClusterBriefRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群id
  clusterId?: string;
  // 集群名
  clusterName?: string;
  // 分野
  page: number;
  // 分页大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterId: 'cluster_id',
      clusterName: 'cluster_name',
      page: 'page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterId: 'string',
      clusterName: 'string',
      page: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryClusterBriefResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 安全简报
  brief?: ClusterSecurityBrief[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      brief: 'brief',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      brief: { 'type': 'array', 'itemType': ClusterSecurityBrief },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetStrategyDefaultRequest extends $tea.Model {
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

export class GetStrategyDefaultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 策略内容
  content?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddStrategyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 策略id
  strategyId?: string;
  // 策略内容
  content: Strategy;
  // 绑定的集群id
  clusterId?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      strategyId: 'strategy_id',
      content: 'content',
      clusterId: 'cluster_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      strategyId: 'string',
      content: Strategy,
      clusterId: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddStrategyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 策略id
  strategyId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      strategyId: 'strategy_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      strategyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindStrategyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 策略id
  strategyId: string;
  // 集群id
  clusterId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      strategyId: 'strategy_id',
      clusterId: 'cluster_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      strategyId: 'string',
      clusterId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindStrategyResponse extends $tea.Model {
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

export class QueryRisksRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 当前页
  page: number;
  // 页大小
  pageSize: number;
  // 风险名称
  name?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      page: 'page',
      pageSize: 'page_size',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      page: 'number',
      pageSize: 'number',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRisksResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 风险列表
  risks?: Risk[];
  // 总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      risks: 'risks',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      risks: { 'type': 'array', 'itemType': Risk },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateStrategyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 策略id
  strategyId: string;
  // 策略内容
  content: Strategy;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      strategyId: 'strategy_id',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      strategyId: 'string',
      content: Strategy,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateStrategyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 策略id
  strategyId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      strategyId: 'strategy_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      strategyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryStrategyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 策略id
  strategyId?: string;
  // 集群id
  clusterId?: string;
  // 分页
  page: number;
  // 分页大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      strategyId: 'strategy_id',
      clusterId: 'cluster_id',
      page: 'page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      strategyId: 'string',
      clusterId: 'string',
      page: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryStrategyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 策略数组
  strategy?: Strategy[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      strategy: 'strategy',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      strategy: { 'type': 'array', 'itemType': Strategy },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ScaleRiskTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 风险任务ID
  riskTaskId: string;
  // 延期时间
  deadlineTime: string;
  // comment描述
  comment?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      riskTaskId: 'risk_task_id',
      deadlineTime: 'deadline_time',
      comment: 'comment',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      riskTaskId: 'string',
      deadlineTime: 'string',
      comment: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ScaleRiskTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作成功
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

export class ListClusterImagesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  clusterId: string;
  // 目标命名空间
  namespace?: string;
  // 工作负载类型
  workloadTypes?: string[];
  // 标签列表
  labels?: Label[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterId: 'cluster_id',
      namespace: 'namespace',
      workloadTypes: 'workload_types',
      labels: 'labels',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterId: 'string',
      namespace: 'string',
      workloadTypes: { 'type': 'array', 'itemType': 'string' },
      labels: { 'type': 'array', 'itemType': Label },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListClusterImagesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 镜像列表
  images?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      images: 'images',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      images: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartClusterQuickscanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群id
  clusterId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterId: 'cluster_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartClusterQuickscanResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 集群id
  clusterId?: string;
  // 扫描id
  scanId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      clusterId: 'cluster_id',
      scanId: 'scan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      clusterId: 'string',
      scanId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryClusterScanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群id
  clusterId?: string;
  // 扫描id
  scanId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterId: 'cluster_id',
      scanId: 'scan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterId: 'string',
      scanId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryClusterScanResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果
  result?: ScanResult[];
  // 扫描id
  scanId?: string;
  // 集群id
  clusterId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
      scanId: 'scan_id',
      clusterId: 'cluster_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: { 'type': 'array', 'itemType': ScanResult },
      scanId: 'string',
      clusterId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRuntimePolicyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  clusterId: string;
  // 命名空间
  namespace: string;
  // 名称
  name: string;
  // 运行时策略yaml文件内容
  content: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterId: 'cluster_id',
      namespace: 'namespace',
      name: 'name',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterId: 'string',
      namespace: 'string',
      name: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRuntimePolicyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建是否成功
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

export class ListRuntimePoliciesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  clusterId: string;
  // 命名空间
  namespace: string;
  // 标签选择
  labelSelectors?: Label[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterId: 'cluster_id',
      namespace: 'namespace',
      labelSelectors: 'label_selectors',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterId: 'string',
      namespace: 'string',
      labelSelectors: { 'type': 'array', 'itemType': Label },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRuntimePoliciesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 策略列表
  policyList?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      policyList: 'policy_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      policyList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateRuntimePolicyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  clusterId: string;
  // 命名空间
  namespace: string;
  // 名称
  name: string;
  // 内容
  content: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterId: 'cluster_id',
      namespace: 'namespace',
      name: 'name',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterId: 'string',
      namespace: 'string',
      name: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateRuntimePolicyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
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

export class DeleteRuntimePolicyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  clusterId: string;
  // 运行时策略命名空间
  namespace: string;
  // 运行时策略名称
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterId: 'cluster_id',
      namespace: 'namespace',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterId: 'string',
      namespace: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteRuntimePolicyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
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

export class ListRuntimepolicyPodsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  clusterId: string;
  // 命名空间
  namespace: string;
  // 策略名称
  policyName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterId: 'cluster_id',
      namespace: 'namespace',
      policyName: 'policy_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterId: 'string',
      namespace: 'string',
      policyName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRuntimepolicyPodsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // pod列表
  pods?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pods: 'pods',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pods: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRuntimepolicyNodesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  clusterId: string;
  // 命名空间
  namespace: string;
  // 名称
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterId: 'cluster_id',
      namespace: 'namespace',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterId: 'string',
      namespace: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRuntimepolicyNodesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 节点列表
  nodes?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      nodes: 'nodes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      nodes: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRuntimePolicyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  clusterId: string;
  // 命名空间
  namespace: string;
  // 名称
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterId: 'cluster_id',
      namespace: 'namespace',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterId: 'string',
      namespace: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRuntimePolicyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 策略详情
  policy?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      policy: 'policy',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      policy: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryClusterBaselineRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群id
  clusterId: string;
  // 扫描id，不填默认最近一次
  scanId?: string;
  // 页码
  page?: number;
  // 分页大小
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterId: 'cluster_id',
      scanId: 'scan_id',
      page: 'page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterId: 'string',
      scanId: 'string',
      page: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryClusterBaselineResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 扫描结果
  result?: BaselineScanResult[];
  // 结果条目总数
  totalCnt?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
      totalCnt: 'total_cnt',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: { 'type': 'array', 'itemType': BaselineScanResult },
      totalCnt: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitImagesReposcanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 镜像仓库ID
  repoId: string;
  // 项目列表
  projects?: string[];
  // 仓库列表
  repositories?: string[];
  // 镜像起始时间
  imageBeginTime?: string;
  // 并发扫描数
  concurrentCount?: number;
  // 扫描轮询间隔，单位s
  pollInterval?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      repoId: 'repo_id',
      projects: 'projects',
      repositories: 'repositories',
      imageBeginTime: 'image_begin_time',
      concurrentCount: 'concurrent_count',
      pollInterval: 'poll_interval',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      repoId: 'string',
      projects: { 'type': 'array', 'itemType': 'string' },
      repositories: { 'type': 'array', 'itemType': 'string' },
      imageBeginTime: 'string',
      concurrentCount: 'number',
      pollInterval: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitImagesReposcanResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
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

export class CreateImageRepoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 镜像仓库名称
  name: string;
  // 镜像仓库类型
  repoType: string;
  // hub域名
  domain: string;
  // API endpoint
  endpoint: string;
  // 用户名
  userName: string;
  // 仓库密码
  password: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      repoType: 'repo_type',
      domain: 'domain',
      endpoint: 'endpoint',
      userName: 'user_name',
      password: 'password',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      repoType: 'string',
      domain: 'string',
      endpoint: 'string',
      userName: 'string',
      password: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateImageRepoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 仓库ID
  repoId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      repoId: 'repo_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      repoId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryImageReposRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 仓库名称
  name?: string;
  // 当前页
  page: number;
  // 页大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      page: 'page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      page: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryImageReposResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 镜像仓库列表
  repos?: ImageRepo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      repos: 'repos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      repos: { 'type': 'array', 'itemType': ImageRepo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteImageRepoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 镜像仓库ID
  repoId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      repoId: 'repo_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      repoId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteImageRepoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 成功与否
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

export class GetImageRiskdetailurlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 镜像地址
  image: string;
  // 应用名称
  appName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      image: 'image',
      appName: 'app_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      image: 'string',
      appName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetImageRiskdetailurlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 镜像漏洞详情展示地址
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

export class CreateImageReposcanstrategyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 仓库ID
  repoId: string;
  //  项目列表
  projects?: string[];
  // 仓库列表
  repositories?: string[];
  // 镜像开始时间
  imageBeginTime?: string;
  // 定时crontab
  crontab: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      repoId: 'repo_id',
      projects: 'projects',
      repositories: 'repositories',
      imageBeginTime: 'image_begin_time',
      crontab: 'crontab',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      repoId: 'string',
      projects: { 'type': 'array', 'itemType': 'string' },
      repositories: { 'type': 'array', 'itemType': 'string' },
      imageBeginTime: 'string',
      crontab: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateImageReposcanstrategyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 定时任务ID
  cronjobId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      cronjobId: 'cronjob_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      cronjobId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryImagerepoProjectsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 仓库ID
  repoId: string;
  // 当前页
  page: number;
  // 页大小
  pageSize: number;
  // 仓库名称
  projectName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      repoId: 'repo_id',
      page: 'page',
      pageSize: 'page_size',
      projectName: 'project_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      repoId: 'string',
      page: 'number',
      pageSize: 'number',
      projectName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryImagerepoProjectsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 项目列表
  projects?: RepoProject[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      projects: 'projects',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      projects: { 'type': 'array', 'itemType': RepoProject },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryImagerepoRepositoriesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 仓库ID
  repoId: string;
  // 项目ID
  projectId: string;
  // 当前页
  page: number;
  // 页大小
  pageSize: number;
  // 仓库名称
  repositoryName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      repoId: 'repo_id',
      projectId: 'project_id',
      page: 'page',
      pageSize: 'page_size',
      repositoryName: 'repository_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      repoId: 'string',
      projectId: 'string',
      page: 'number',
      pageSize: 'number',
      repositoryName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryImagerepoRepositoriesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 仓库列表
  repositories?: Repository[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      repositories: 'repositories',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      repositories: { 'type': 'array', 'itemType': Repository },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateImageRepoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 仓库ID
  repoId: string;
  // 用户名
  userName?: string;
  // 密码
  password?: string;
  // 仓库名称
  name?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      repoId: 'repo_id',
      userName: 'user_name',
      password: 'password',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      repoId: 'string',
      userName: 'string',
      password: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateImageRepoResponse extends $tea.Model {
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

export class GetImageRepoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // repo ID
  repoId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      repoId: 'repo_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      repoId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetImageRepoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 镜像仓库详情
  imageRepo?: ImageRepo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      imageRepo: 'image_repo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      imageRepo: ImageRepo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyImageRepoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // repo_id
  repoId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      repoId: 'repo_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      repoId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyImageRepoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 仓库ID
  repoId?: string;
  // 状态
  state?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      repoId: 'repo_id',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      repoId: 'string',
      state: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryImageReposcanstrategiesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 仓库ID
  repoId: string;
  // 当前页
  page: number;
  // 页大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      repoId: 'repo_id',
      page: 'page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      repoId: 'string',
      page: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryImageReposcanstrategiesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 镜像扫描策略
  repoStrategies?: RepoScanStrategy[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      repoStrategies: 'repo_strategies',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      repoStrategies: { 'type': 'array', 'itemType': RepoScanStrategy },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteImageReposcanstrategyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 策略ID
  strategyId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      strategyId: 'strategy_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      strategyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteImageReposcanstrategyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
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

export class UpdateImageReposcanstrategyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 策略ID 
  strategyId: string;
  // 项目列表
  projects?: string[];
  // 仓库列表
  repositories?: string[];
  // 镜像开始时间
  imageBeginTime?: string;
  // 定时描述
  crontab?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      strategyId: 'strategy_id',
      projects: 'projects',
      repositories: 'repositories',
      imageBeginTime: 'image_begin_time',
      crontab: 'crontab',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      strategyId: 'string',
      projects: { 'type': 'array', 'itemType': 'string' },
      repositories: { 'type': 'array', 'itemType': 'string' },
      imageBeginTime: 'string',
      crontab: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateImageReposcanstrategyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 更新成功
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

export class SkipClusterBaselineRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群id
  clusterId: string;
  // 资源名称
  name?: string;
  // 资源命名空间
  namespace?: string;
  // 资源id
  resourceId: string;
  // 资源类型
  kind?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      clusterId: 'cluster_id',
      name: 'name',
      namespace: 'namespace',
      resourceId: 'resource_id',
      kind: 'kind',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      clusterId: 'string',
      name: 'string',
      namespace: 'string',
      resourceId: 'string',
      kind: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SkipClusterBaselineResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 资源id
  resourceId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resourceId: 'resource_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resourceId: 'string',
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
          sdk_version: "1.0.80",
          _prod_code: "CATRONUS",
          _prod_channel: "default",
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
   * Description: 创建风险工单/任务
   * Summary: 创建风险工单/任务
   */
  async createRiskTask(request: CreateRiskTaskRequest): Promise<CreateRiskTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createRiskTaskEx(request, headers, runtime);
  }

  /**
   * Description: 创建风险工单/任务
   * Summary: 创建风险工单/任务
   */
  async createRiskTaskEx(request: CreateRiskTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateRiskTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateRiskTaskResponse>(await this.doRequest("1.0", "antcloud.catronus.risk.task.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateRiskTaskResponse({}));
  }

  /**
   * Description: 查询风险任务列表
   * Summary: 查询风险任务列表
   */
  async queryRiskTasks(request: QueryRiskTasksRequest): Promise<QueryRiskTasksResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRiskTasksEx(request, headers, runtime);
  }

  /**
   * Description: 查询风险任务列表
   * Summary: 查询风险任务列表
   */
  async queryRiskTasksEx(request: QueryRiskTasksRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRiskTasksResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRiskTasksResponse>(await this.doRequest("1.0", "antcloud.catronus.risk.tasks.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRiskTasksResponse({}));
  }

  /**
   * Description: 获取风险更单详情
   * Summary: 获取风险更单详情
   */
  async getRiskTask(request: GetRiskTaskRequest): Promise<GetRiskTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getRiskTaskEx(request, headers, runtime);
  }

  /**
   * Description: 获取风险更单详情
   * Summary: 获取风险更单详情
   */
  async getRiskTaskEx(request: GetRiskTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetRiskTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<GetRiskTaskResponse>(await this.doRequest("1.0", "antcloud.catronus.risk.task.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetRiskTaskResponse({}));
  }

  /**
   * Description: 更新风险工单，包括驳回工单，转派工单，撤销工单，确认接收工单，确认修复工单等操作，及添加关注人等
   * Summary: 更新风险工单
   */
  async updateRiskTask(request: UpdateRiskTaskRequest): Promise<UpdateRiskTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateRiskTaskEx(request, headers, runtime);
  }

  /**
   * Description: 更新风险工单，包括驳回工单，转派工单，撤销工单，确认接收工单，确认修复工单等操作，及添加关注人等
   * Summary: 更新风险工单
   */
  async updateRiskTaskEx(request: UpdateRiskTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateRiskTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateRiskTaskResponse>(await this.doRequest("1.0", "antcloud.catronus.risk.task.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateRiskTaskResponse({}));
  }

  /**
   * Description: 确认风险工单
   * Summary: 确认风险工单
   */
  async confirmRiskTask(request: ConfirmRiskTaskRequest): Promise<ConfirmRiskTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmRiskTaskEx(request, headers, runtime);
  }

  /**
   * Description: 确认风险工单
   * Summary: 确认风险工单
   */
  async confirmRiskTaskEx(request: ConfirmRiskTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmRiskTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmRiskTaskResponse>(await this.doRequest("1.0", "antcloud.catronus.risk.task.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmRiskTaskResponse({}));
  }

  /**
   * Description: 撤销风险工单
   * Summary: 撤销风险工单
   */
  async cancelRiskTask(request: CancelRiskTaskRequest): Promise<CancelRiskTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelRiskTaskEx(request, headers, runtime);
  }

  /**
   * Description: 撤销风险工单
   * Summary: 撤销风险工单
   */
  async cancelRiskTaskEx(request: CancelRiskTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelRiskTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelRiskTaskResponse>(await this.doRequest("1.0", "antcloud.catronus.risk.task.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelRiskTaskResponse({}));
  }

  /**
   * Description: 驳回风险工单
   * Summary: 驳回风险工单
   */
  async refuseRiskTask(request: RefuseRiskTaskRequest): Promise<RefuseRiskTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.refuseRiskTaskEx(request, headers, runtime);
  }

  /**
   * Description: 驳回风险工单
   * Summary: 驳回风险工单
   */
  async refuseRiskTaskEx(request: RefuseRiskTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RefuseRiskTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<RefuseRiskTaskResponse>(await this.doRequest("1.0", "antcloud.catronus.risk.task.refuse", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RefuseRiskTaskResponse({}));
  }

  /**
   * Description: 确认风险工单修复
   * Summary: 确认风险工单修复
   */
  async verifyRiskTask(request: VerifyRiskTaskRequest): Promise<VerifyRiskTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyRiskTaskEx(request, headers, runtime);
  }

  /**
   * Description: 确认风险工单修复
   * Summary: 确认风险工单修复
   */
  async verifyRiskTaskEx(request: VerifyRiskTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyRiskTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyRiskTaskResponse>(await this.doRequest("1.0", "antcloud.catronus.risk.task.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyRiskTaskResponse({}));
  }

  /**
   * Description: 转派工单负责人
   * Summary: 转派工单负责人
   */
  async sendRiskTask(request: SendRiskTaskRequest): Promise<SendRiskTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendRiskTaskEx(request, headers, runtime);
  }

  /**
   * Description: 转派工单负责人
   * Summary: 转派工单负责人
   */
  async sendRiskTaskEx(request: SendRiskTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendRiskTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<SendRiskTaskResponse>(await this.doRequest("1.0", "antcloud.catronus.risk.task.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendRiskTaskResponse({}));
  }

  /**
   * Description: 确认风险工单修复，待安全Owner确认
   * Summary: 确认风险工单修复
   */
  async closeRiskTask(request: CloseRiskTaskRequest): Promise<CloseRiskTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.closeRiskTaskEx(request, headers, runtime);
  }

  /**
   * Description: 确认风险工单修复，待安全Owner确认
   * Summary: 确认风险工单修复
   */
  async closeRiskTaskEx(request: CloseRiskTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CloseRiskTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<CloseRiskTaskResponse>(await this.doRequest("1.0", "antcloud.catronus.risk.task.close", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CloseRiskTaskResponse({}));
  }

  /**
   * Description: 获取个人风险项统计
   * Summary: 获取个人风险项统计
   */
  async getRiskStatistics(request: GetRiskStatisticsRequest): Promise<GetRiskStatisticsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getRiskStatisticsEx(request, headers, runtime);
  }

  /**
   * Description: 获取个人风险项统计
   * Summary: 获取个人风险项统计
   */
  async getRiskStatisticsEx(request: GetRiskStatisticsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetRiskStatisticsResponse> {
    Util.validateModel(request);
    return $tea.cast<GetRiskStatisticsResponse>(await this.doRequest("1.0", "antcloud.catronus.risk.statistics.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetRiskStatisticsResponse({}));
  }

  /**
   * Description: 查询风险日志审计
   * Summary: 查询风险日志审计
   */
  async queryRiskAudits(request: QueryRiskAuditsRequest): Promise<QueryRiskAuditsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRiskAuditsEx(request, headers, runtime);
  }

  /**
   * Description: 查询风险日志审计
   * Summary: 查询风险日志审计
   */
  async queryRiskAuditsEx(request: QueryRiskAuditsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRiskAuditsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRiskAuditsResponse>(await this.doRequest("1.0", "antcloud.catronus.risk.audits.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRiskAuditsResponse({}));
  }

  /**
   * Description: 创建风险解决方案
   * Summary: 创建风险解决方案
   */
  async createRiskSolution(request: CreateRiskSolutionRequest): Promise<CreateRiskSolutionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createRiskSolutionEx(request, headers, runtime);
  }

  /**
   * Description: 创建风险解决方案
   * Summary: 创建风险解决方案
   */
  async createRiskSolutionEx(request: CreateRiskSolutionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateRiskSolutionResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateRiskSolutionResponse>(await this.doRequest("1.0", "antcloud.catronus.risk.solution.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateRiskSolutionResponse({}));
  }

  /**
   * Description: 查询风险解决方案列表
   * Summary: 查询风险解决方案
   */
  async queryRiskSolutions(request: QueryRiskSolutionsRequest): Promise<QueryRiskSolutionsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRiskSolutionsEx(request, headers, runtime);
  }

  /**
   * Description: 查询风险解决方案列表
   * Summary: 查询风险解决方案
   */
  async queryRiskSolutionsEx(request: QueryRiskSolutionsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRiskSolutionsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRiskSolutionsResponse>(await this.doRequest("1.0", "antcloud.catronus.risk.solutions.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRiskSolutionsResponse({}));
  }

  /**
   * Description: 获取风险解决方案详情
   * Summary: 获取风险解决方案
   */
  async getRiskSolution(request: GetRiskSolutionRequest): Promise<GetRiskSolutionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getRiskSolutionEx(request, headers, runtime);
  }

  /**
   * Description: 获取风险解决方案详情
   * Summary: 获取风险解决方案
   */
  async getRiskSolutionEx(request: GetRiskSolutionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetRiskSolutionResponse> {
    Util.validateModel(request);
    return $tea.cast<GetRiskSolutionResponse>(await this.doRequest("1.0", "antcloud.catronus.risk.solution.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetRiskSolutionResponse({}));
  }

  /**
   * Description: 更新风险解决方案
   * Summary: 更新风险解决方案
   */
  async updateRiskSolution(request: UpdateRiskSolutionRequest): Promise<UpdateRiskSolutionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateRiskSolutionEx(request, headers, runtime);
  }

  /**
   * Description: 更新风险解决方案
   * Summary: 更新风险解决方案
   */
  async updateRiskSolutionEx(request: UpdateRiskSolutionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateRiskSolutionResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateRiskSolutionResponse>(await this.doRequest("1.0", "antcloud.catronus.risk.solution.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateRiskSolutionResponse({}));
  }

  /**
   * Description: 删除风险解决方案
   * Summary: 删除风险解决方案
   */
  async deleteRiskSolution(request: DeleteRiskSolutionRequest): Promise<DeleteRiskSolutionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteRiskSolutionEx(request, headers, runtime);
  }

  /**
   * Description: 删除风险解决方案
   * Summary: 删除风险解决方案
   */
  async deleteRiskSolutionEx(request: DeleteRiskSolutionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteRiskSolutionResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteRiskSolutionResponse>(await this.doRequest("1.0", "antcloud.catronus.risk.solution.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteRiskSolutionResponse({}));
  }

  /**
   * Description: 纳管目标k8s集群
   * Summary: 导入（纳管）集群
   */
  async importCluster(request: ImportClusterRequest): Promise<ImportClusterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importClusterEx(request, headers, runtime);
  }

  /**
   * Description: 纳管目标k8s集群
   * Summary: 导入（纳管）集群
   */
  async importClusterEx(request: ImportClusterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportClusterResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportClusterResponse>(await this.doRequest("1.0", "antcloud.catronus.cluster.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportClusterResponse({}));
  }

  /**
   * Description: 手动新增集群
   * Summary: 手动新增集群
   */
  async addCluster(request: AddClusterRequest): Promise<AddClusterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addClusterEx(request, headers, runtime);
  }

  /**
   * Description: 手动新增集群
   * Summary: 手动新增集群
   */
  async addClusterEx(request: AddClusterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddClusterResponse> {
    Util.validateModel(request);
    return $tea.cast<AddClusterResponse>(await this.doRequest("1.0", "antcloud.catronus.cluster.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddClusterResponse({}));
  }

  /**
   * Description: 查询集群
   * Summary: 查询集群
   */
  async queryCluster(request: QueryClusterRequest): Promise<QueryClusterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryClusterEx(request, headers, runtime);
  }

  /**
   * Description: 查询集群
   * Summary: 查询集群
   */
  async queryClusterEx(request: QueryClusterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryClusterResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryClusterResponse>(await this.doRequest("1.0", "antcloud.catronus.cluster.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryClusterResponse({}));
  }

  /**
   * Description: 查询集群namespace
   * Summary: 查询集群namespace
   */
  async queryClusterNamespace(request: QueryClusterNamespaceRequest): Promise<QueryClusterNamespaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryClusterNamespaceEx(request, headers, runtime);
  }

  /**
   * Description: 查询集群namespace
   * Summary: 查询集群namespace
   */
  async queryClusterNamespaceEx(request: QueryClusterNamespaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryClusterNamespaceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryClusterNamespaceResponse>(await this.doRequest("1.0", "antcloud.catronus.cluster.namespace.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryClusterNamespaceResponse({}));
  }

  /**
   * Description: 解绑集群
   * Summary: 解绑集群
   */
  async reclaimCluster(request: ReclaimClusterRequest): Promise<ReclaimClusterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.reclaimClusterEx(request, headers, runtime);
  }

  /**
   * Description: 解绑集群
   * Summary: 解绑集群
   */
  async reclaimClusterEx(request: ReclaimClusterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReclaimClusterResponse> {
    Util.validateModel(request);
    return $tea.cast<ReclaimClusterResponse>(await this.doRequest("1.0", "antcloud.catronus.cluster.reclaim", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReclaimClusterResponse({}));
  }

  /**
   * Description: 获取集群安全简报列表
   * Summary: 获取集群安全简报列表
   */
  async queryClusterBrief(request: QueryClusterBriefRequest): Promise<QueryClusterBriefResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryClusterBriefEx(request, headers, runtime);
  }

  /**
   * Description: 获取集群安全简报列表
   * Summary: 获取集群安全简报列表
   */
  async queryClusterBriefEx(request: QueryClusterBriefRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryClusterBriefResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryClusterBriefResponse>(await this.doRequest("1.0", "antcloud.catronus.cluster.brief.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryClusterBriefResponse({}));
  }

  /**
   * Description: 获取默认策略
   * Summary: 获取默认策略
   */
  async getStrategyDefault(request: GetStrategyDefaultRequest): Promise<GetStrategyDefaultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getStrategyDefaultEx(request, headers, runtime);
  }

  /**
   * Description: 获取默认策略
   * Summary: 获取默认策略
   */
  async getStrategyDefaultEx(request: GetStrategyDefaultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetStrategyDefaultResponse> {
    Util.validateModel(request);
    return $tea.cast<GetStrategyDefaultResponse>(await this.doRequest("1.0", "antcloud.catronus.strategy.default.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetStrategyDefaultResponse({}));
  }

  /**
   * Description: 设置安全策略
   * Summary: 设置安全策略
   */
  async addStrategy(request: AddStrategyRequest): Promise<AddStrategyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addStrategyEx(request, headers, runtime);
  }

  /**
   * Description: 设置安全策略
   * Summary: 设置安全策略
   */
  async addStrategyEx(request: AddStrategyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddStrategyResponse> {
    Util.validateModel(request);
    return $tea.cast<AddStrategyResponse>(await this.doRequest("1.0", "antcloud.catronus.strategy.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddStrategyResponse({}));
  }

  /**
   * Description: 绑定集群
   * Summary: 绑定集群
   */
  async bindStrategy(request: BindStrategyRequest): Promise<BindStrategyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindStrategyEx(request, headers, runtime);
  }

  /**
   * Description: 绑定集群
   * Summary: 绑定集群
   */
  async bindStrategyEx(request: BindStrategyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindStrategyResponse> {
    Util.validateModel(request);
    return $tea.cast<BindStrategyResponse>(await this.doRequest("1.0", "antcloud.catronus.strategy.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindStrategyResponse({}));
  }

  /**
   * Description: 风险列表
   * Summary: 风险列表
   */
  async queryRisks(request: QueryRisksRequest): Promise<QueryRisksResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRisksEx(request, headers, runtime);
  }

  /**
   * Description: 风险列表
   * Summary: 风险列表
   */
  async queryRisksEx(request: QueryRisksRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRisksResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRisksResponse>(await this.doRequest("1.0", "antcloud.catronus.risks.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRisksResponse({}));
  }

  /**
   * Description: 更新策略
   * Summary: 更新策略
   */
  async updateStrategy(request: UpdateStrategyRequest): Promise<UpdateStrategyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateStrategyEx(request, headers, runtime);
  }

  /**
   * Description: 更新策略
   * Summary: 更新策略
   */
  async updateStrategyEx(request: UpdateStrategyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateStrategyResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateStrategyResponse>(await this.doRequest("1.0", "antcloud.catronus.strategy.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateStrategyResponse({}));
  }

  /**
   * Description: 拉策略列表
   * Summary: 拉策略列表
   */
  async queryStrategy(request: QueryStrategyRequest): Promise<QueryStrategyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryStrategyEx(request, headers, runtime);
  }

  /**
   * Description: 拉策略列表
   * Summary: 拉策略列表
   */
  async queryStrategyEx(request: QueryStrategyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryStrategyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryStrategyResponse>(await this.doRequest("1.0", "antcloud.catronus.strategy.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryStrategyResponse({}));
  }

  /**
   * Description: 风险任务延期
   * Summary: 风险任务延期
   */
  async scaleRiskTask(request: ScaleRiskTaskRequest): Promise<ScaleRiskTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.scaleRiskTaskEx(request, headers, runtime);
  }

  /**
   * Description: 风险任务延期
   * Summary: 风险任务延期
   */
  async scaleRiskTaskEx(request: ScaleRiskTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ScaleRiskTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<ScaleRiskTaskResponse>(await this.doRequest("1.0", "antcloud.catronus.risk.task.scale", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ScaleRiskTaskResponse({}));
  }

  /**
   * Description: 查询集群镜像列表
   * Summary: 查询集群镜像列表
   */
  async listClusterImages(request: ListClusterImagesRequest): Promise<ListClusterImagesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listClusterImagesEx(request, headers, runtime);
  }

  /**
   * Description: 查询集群镜像列表
   * Summary: 查询集群镜像列表
   */
  async listClusterImagesEx(request: ListClusterImagesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListClusterImagesResponse> {
    Util.validateModel(request);
    return $tea.cast<ListClusterImagesResponse>(await this.doRequest("1.0", "antcloud.catronus.cluster.images.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListClusterImagesResponse({}));
  }

  /**
   * Description: 主动触发快速扫描
   * Summary: 主动触发快速扫描
   */
  async startClusterQuickscan(request: StartClusterQuickscanRequest): Promise<StartClusterQuickscanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startClusterQuickscanEx(request, headers, runtime);
  }

  /**
   * Description: 主动触发快速扫描
   * Summary: 主动触发快速扫描
   */
  async startClusterQuickscanEx(request: StartClusterQuickscanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartClusterQuickscanResponse> {
    Util.validateModel(request);
    return $tea.cast<StartClusterQuickscanResponse>(await this.doRequest("1.0", "antcloud.catronus.cluster.quickscan.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartClusterQuickscanResponse({}));
  }

  /**
   * Description: 查询扫描结果
   * Summary: 查询扫描结果
   */
  async queryClusterScan(request: QueryClusterScanRequest): Promise<QueryClusterScanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryClusterScanEx(request, headers, runtime);
  }

  /**
   * Description: 查询扫描结果
   * Summary: 查询扫描结果
   */
  async queryClusterScanEx(request: QueryClusterScanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryClusterScanResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryClusterScanResponse>(await this.doRequest("1.0", "antcloud.catronus.cluster.scan.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryClusterScanResponse({}));
  }

  /**
   * Description: 创建运行时策略
   * Summary: 创建运行时策略
   */
  async createRuntimePolicy(request: CreateRuntimePolicyRequest): Promise<CreateRuntimePolicyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createRuntimePolicyEx(request, headers, runtime);
  }

  /**
   * Description: 创建运行时策略
   * Summary: 创建运行时策略
   */
  async createRuntimePolicyEx(request: CreateRuntimePolicyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateRuntimePolicyResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateRuntimePolicyResponse>(await this.doRequest("1.0", "antcloud.catronus.runtime.policy.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateRuntimePolicyResponse({}));
  }

  /**
   * Description: 查询运行时策略列表
   * Summary: 查询运行时策略列表
   */
  async listRuntimePolicies(request: ListRuntimePoliciesRequest): Promise<ListRuntimePoliciesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listRuntimePoliciesEx(request, headers, runtime);
  }

  /**
   * Description: 查询运行时策略列表
   * Summary: 查询运行时策略列表
   */
  async listRuntimePoliciesEx(request: ListRuntimePoliciesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListRuntimePoliciesResponse> {
    Util.validateModel(request);
    return $tea.cast<ListRuntimePoliciesResponse>(await this.doRequest("1.0", "antcloud.catronus.runtime.policies.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListRuntimePoliciesResponse({}));
  }

  /**
   * Description: 更新运行时策略
   * Summary: 更新运行时策略
   */
  async updateRuntimePolicy(request: UpdateRuntimePolicyRequest): Promise<UpdateRuntimePolicyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateRuntimePolicyEx(request, headers, runtime);
  }

  /**
   * Description: 更新运行时策略
   * Summary: 更新运行时策略
   */
  async updateRuntimePolicyEx(request: UpdateRuntimePolicyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateRuntimePolicyResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateRuntimePolicyResponse>(await this.doRequest("1.0", "antcloud.catronus.runtime.policy.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateRuntimePolicyResponse({}));
  }

  /**
   * Description: 删除运行时策略
   * Summary: 删除运行时策略
   */
  async deleteRuntimePolicy(request: DeleteRuntimePolicyRequest): Promise<DeleteRuntimePolicyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteRuntimePolicyEx(request, headers, runtime);
  }

  /**
   * Description: 删除运行时策略
   * Summary: 删除运行时策略
   */
  async deleteRuntimePolicyEx(request: DeleteRuntimePolicyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteRuntimePolicyResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteRuntimePolicyResponse>(await this.doRequest("1.0", "antcloud.catronus.runtime.policy.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteRuntimePolicyResponse({}));
  }

  /**
   * Description: 获取运行时策略目标Pods
   * Summary: 获取运行时策略Pods
   */
  async listRuntimepolicyPods(request: ListRuntimepolicyPodsRequest): Promise<ListRuntimepolicyPodsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listRuntimepolicyPodsEx(request, headers, runtime);
  }

  /**
   * Description: 获取运行时策略目标Pods
   * Summary: 获取运行时策略Pods
   */
  async listRuntimepolicyPodsEx(request: ListRuntimepolicyPodsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListRuntimepolicyPodsResponse> {
    Util.validateModel(request);
    return $tea.cast<ListRuntimepolicyPodsResponse>(await this.doRequest("1.0", "antcloud.catronus.runtimepolicy.pods.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListRuntimepolicyPodsResponse({}));
  }

  /**
   * Description: 获取运行时策略Nodes
   * Summary: 获取运行时策略Nodes
   */
  async listRuntimepolicyNodes(request: ListRuntimepolicyNodesRequest): Promise<ListRuntimepolicyNodesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listRuntimepolicyNodesEx(request, headers, runtime);
  }

  /**
   * Description: 获取运行时策略Nodes
   * Summary: 获取运行时策略Nodes
   */
  async listRuntimepolicyNodesEx(request: ListRuntimepolicyNodesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListRuntimepolicyNodesResponse> {
    Util.validateModel(request);
    return $tea.cast<ListRuntimepolicyNodesResponse>(await this.doRequest("1.0", "antcloud.catronus.runtimepolicy.nodes.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListRuntimepolicyNodesResponse({}));
  }

  /**
   * Description: 获取运行时策略详情
   * Summary: 获取运行时策略详情
   */
  async getRuntimePolicy(request: GetRuntimePolicyRequest): Promise<GetRuntimePolicyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getRuntimePolicyEx(request, headers, runtime);
  }

  /**
   * Description: 获取运行时策略详情
   * Summary: 获取运行时策略详情
   */
  async getRuntimePolicyEx(request: GetRuntimePolicyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetRuntimePolicyResponse> {
    Util.validateModel(request);
    return $tea.cast<GetRuntimePolicyResponse>(await this.doRequest("1.0", "antcloud.catronus.runtime.policy.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetRuntimePolicyResponse({}));
  }

  /**
   * Description: 基线扫描结果查询
   * Summary: 基线扫描结果查询
   */
  async queryClusterBaseline(request: QueryClusterBaselineRequest): Promise<QueryClusterBaselineResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryClusterBaselineEx(request, headers, runtime);
  }

  /**
   * Description: 基线扫描结果查询
   * Summary: 基线扫描结果查询
   */
  async queryClusterBaselineEx(request: QueryClusterBaselineRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryClusterBaselineResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryClusterBaselineResponse>(await this.doRequest("1.0", "antcloud.catronus.cluster.baseline.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryClusterBaselineResponse({}));
  }

  /**
   * Description: 提交镜像扫描触发任务
   * Summary: 提交镜像扫描触发任务
   */
  async submitImagesReposcan(request: SubmitImagesReposcanRequest): Promise<SubmitImagesReposcanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitImagesReposcanEx(request, headers, runtime);
  }

  /**
   * Description: 提交镜像扫描触发任务
   * Summary: 提交镜像扫描触发任务
   */
  async submitImagesReposcanEx(request: SubmitImagesReposcanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitImagesReposcanResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitImagesReposcanResponse>(await this.doRequest("1.0", "antcloud.catronus.images.reposcan.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitImagesReposcanResponse({}));
  }

  /**
   * Description: 创建镜像仓库
   * Summary: 创建镜像仓库
   */
  async createImageRepo(request: CreateImageRepoRequest): Promise<CreateImageRepoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createImageRepoEx(request, headers, runtime);
  }

  /**
   * Description: 创建镜像仓库
   * Summary: 创建镜像仓库
   */
  async createImageRepoEx(request: CreateImageRepoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateImageRepoResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateImageRepoResponse>(await this.doRequest("1.0", "antcloud.catronus.image.repo.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateImageRepoResponse({}));
  }

  /**
   * Description: 查询镜像仓库列表
   * Summary: 查询镜像仓库列表
   */
  async queryImageRepos(request: QueryImageReposRequest): Promise<QueryImageReposResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryImageReposEx(request, headers, runtime);
  }

  /**
   * Description: 查询镜像仓库列表
   * Summary: 查询镜像仓库列表
   */
  async queryImageReposEx(request: QueryImageReposRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryImageReposResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryImageReposResponse>(await this.doRequest("1.0", "antcloud.catronus.image.repos.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryImageReposResponse({}));
  }

  /**
   * Description: 删除镜像仓库
   * Summary: 删除镜像仓库
   */
  async deleteImageRepo(request: DeleteImageRepoRequest): Promise<DeleteImageRepoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteImageRepoEx(request, headers, runtime);
  }

  /**
   * Description: 删除镜像仓库
   * Summary: 删除镜像仓库
   */
  async deleteImageRepoEx(request: DeleteImageRepoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteImageRepoResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteImageRepoResponse>(await this.doRequest("1.0", "antcloud.catronus.image.repo.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteImageRepoResponse({}));
  }

  /**
   * Description: 获取镜像漏洞详情地址
   * Summary: 获取镜像漏洞详情地址
   */
  async getImageRiskdetailurl(request: GetImageRiskdetailurlRequest): Promise<GetImageRiskdetailurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getImageRiskdetailurlEx(request, headers, runtime);
  }

  /**
   * Description: 获取镜像漏洞详情地址
   * Summary: 获取镜像漏洞详情地址
   */
  async getImageRiskdetailurlEx(request: GetImageRiskdetailurlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetImageRiskdetailurlResponse> {
    Util.validateModel(request);
    return $tea.cast<GetImageRiskdetailurlResponse>(await this.doRequest("1.0", "antcloud.catronus.image.riskdetailurl.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetImageRiskdetailurlResponse({}));
  }

  /**
   * Description: 创建镜像仓库扫描策略
   * Summary: 创建镜像仓库扫描策略
   */
  async createImageReposcanstrategy(request: CreateImageReposcanstrategyRequest): Promise<CreateImageReposcanstrategyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createImageReposcanstrategyEx(request, headers, runtime);
  }

  /**
   * Description: 创建镜像仓库扫描策略
   * Summary: 创建镜像仓库扫描策略
   */
  async createImageReposcanstrategyEx(request: CreateImageReposcanstrategyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateImageReposcanstrategyResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateImageReposcanstrategyResponse>(await this.doRequest("1.0", "antcloud.catronus.image.reposcanstrategy.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateImageReposcanstrategyResponse({}));
  }

  /**
   * Description: 查询仓库项目列表
   * Summary: 查询仓库项目列表
   */
  async queryImagerepoProjects(request: QueryImagerepoProjectsRequest): Promise<QueryImagerepoProjectsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryImagerepoProjectsEx(request, headers, runtime);
  }

  /**
   * Description: 查询仓库项目列表
   * Summary: 查询仓库项目列表
   */
  async queryImagerepoProjectsEx(request: QueryImagerepoProjectsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryImagerepoProjectsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryImagerepoProjectsResponse>(await this.doRequest("1.0", "antcloud.catronus.imagerepo.projects.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryImagerepoProjectsResponse({}));
  }

  /**
   * Description: 查询仓库列表
   * Summary: 查询仓库列表
   */
  async queryImagerepoRepositories(request: QueryImagerepoRepositoriesRequest): Promise<QueryImagerepoRepositoriesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryImagerepoRepositoriesEx(request, headers, runtime);
  }

  /**
   * Description: 查询仓库列表
   * Summary: 查询仓库列表
   */
  async queryImagerepoRepositoriesEx(request: QueryImagerepoRepositoriesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryImagerepoRepositoriesResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryImagerepoRepositoriesResponse>(await this.doRequest("1.0", "antcloud.catronus.imagerepo.repositories.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryImagerepoRepositoriesResponse({}));
  }

  /**
   * Description: 更新镜像仓库
   * Summary: 更新镜像仓库
   */
  async updateImageRepo(request: UpdateImageRepoRequest): Promise<UpdateImageRepoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateImageRepoEx(request, headers, runtime);
  }

  /**
   * Description: 更新镜像仓库
   * Summary: 更新镜像仓库
   */
  async updateImageRepoEx(request: UpdateImageRepoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateImageRepoResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateImageRepoResponse>(await this.doRequest("1.0", "antcloud.catronus.image.repo.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateImageRepoResponse({}));
  }

  /**
   * Description: 获取镜像仓库详情
   * Summary: 获取镜像仓库详情
   */
  async getImageRepo(request: GetImageRepoRequest): Promise<GetImageRepoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getImageRepoEx(request, headers, runtime);
  }

  /**
   * Description: 获取镜像仓库详情
   * Summary: 获取镜像仓库详情
   */
  async getImageRepoEx(request: GetImageRepoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetImageRepoResponse> {
    Util.validateModel(request);
    return $tea.cast<GetImageRepoResponse>(await this.doRequest("1.0", "antcloud.catronus.image.repo.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetImageRepoResponse({}));
  }

  /**
   * Description: 校验仓库配置
   * Summary: 校验仓库配置
   */
  async verifyImageRepo(request: VerifyImageRepoRequest): Promise<VerifyImageRepoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyImageRepoEx(request, headers, runtime);
  }

  /**
   * Description: 校验仓库配置
   * Summary: 校验仓库配置
   */
  async verifyImageRepoEx(request: VerifyImageRepoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyImageRepoResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyImageRepoResponse>(await this.doRequest("1.0", "antcloud.catronus.image.repo.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyImageRepoResponse({}));
  }

  /**
   * Description: 查询镜像扫描策略
   * Summary: 查询镜像扫描策略
   */
  async queryImageReposcanstrategies(request: QueryImageReposcanstrategiesRequest): Promise<QueryImageReposcanstrategiesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryImageReposcanstrategiesEx(request, headers, runtime);
  }

  /**
   * Description: 查询镜像扫描策略
   * Summary: 查询镜像扫描策略
   */
  async queryImageReposcanstrategiesEx(request: QueryImageReposcanstrategiesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryImageReposcanstrategiesResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryImageReposcanstrategiesResponse>(await this.doRequest("1.0", "antcloud.catronus.image.reposcanstrategies.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryImageReposcanstrategiesResponse({}));
  }

  /**
   * Description: 删除镜像扫描策略
   * Summary: 删除镜像扫描策略
   */
  async deleteImageReposcanstrategy(request: DeleteImageReposcanstrategyRequest): Promise<DeleteImageReposcanstrategyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteImageReposcanstrategyEx(request, headers, runtime);
  }

  /**
   * Description: 删除镜像扫描策略
   * Summary: 删除镜像扫描策略
   */
  async deleteImageReposcanstrategyEx(request: DeleteImageReposcanstrategyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteImageReposcanstrategyResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteImageReposcanstrategyResponse>(await this.doRequest("1.0", "antcloud.catronus.image.reposcanstrategy.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteImageReposcanstrategyResponse({}));
  }

  /**
   * Description: 更新镜像仓库扫描策略
   * Summary: 更新镜像仓库扫描策略
   */
  async updateImageReposcanstrategy(request: UpdateImageReposcanstrategyRequest): Promise<UpdateImageReposcanstrategyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateImageReposcanstrategyEx(request, headers, runtime);
  }

  /**
   * Description: 更新镜像仓库扫描策略
   * Summary: 更新镜像仓库扫描策略
   */
  async updateImageReposcanstrategyEx(request: UpdateImageReposcanstrategyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateImageReposcanstrategyResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateImageReposcanstrategyResponse>(await this.doRequest("1.0", "antcloud.catronus.image.reposcanstrategy.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateImageReposcanstrategyResponse({}));
  }

  /**
   * Description: 忽略某个baseline风险
   * Summary: 忽略某个baseline风险
   */
  async skipClusterBaseline(request: SkipClusterBaselineRequest): Promise<SkipClusterBaselineResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.skipClusterBaselineEx(request, headers, runtime);
  }

  /**
   * Description: 忽略某个baseline风险
   * Summary: 忽略某个baseline风险
   */
  async skipClusterBaselineEx(request: SkipClusterBaselineRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SkipClusterBaselineResponse> {
    Util.validateModel(request);
    return $tea.cast<SkipClusterBaselineResponse>(await this.doRequest("1.0", "antcloud.catronus.cluster.baseline.skip", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SkipClusterBaselineResponse({}));
  }

}
