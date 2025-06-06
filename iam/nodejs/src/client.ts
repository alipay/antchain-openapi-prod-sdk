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

export class Condition extends $tea.Model {
  key?: string;
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

// 阿里云资源结构体
export class AliyunResource extends $tea.Model {
  // resource_type/resource_id
  resource: string;
  // 资源所属的租户
  resourceTenant: string;
  static names(): { [key: string]: string } {
    return {
      resource: 'resource',
      resourceTenant: 'resource_tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      resource: 'string',
      resourceTenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 鉴权事件（蚂蚁侧）
export class AuthenticateEvent extends $tea.Model {
  // 鉴权操作列表
  actions: string[];
  // 鉴权对象ID
  actorId: string;
  // 鉴权条件
  conditions?: Condition[];
  // 唯一ID
  id?: string;
  static names(): { [key: string]: string } {
    return {
      actions: 'actions',
      actorId: 'actor_id',
      conditions: 'conditions',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      actions: { 'type': 'array', 'itemType': 'string' },
      actorId: 'string',
      conditions: { 'type': 'array', 'itemType': Condition },
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 来源为Onex的操作类型的额外信息
export class OnexExtraInfo extends $tea.Model {
  // Onex接口路径
  path: string;
  // Onex接口的HTTP Method
  method: string;
  static names(): { [key: string]: string } {
    return {
      path: 'path',
      method: 'method',
    };
  }

  static types(): { [key: string]: any } {
    return {
      path: 'string',
      method: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云鉴权上下文
export class AliyunRamAuthContext extends $tea.Model {
  // 操作名称
  action: string;
  // 条件
  conditions?: Condition[];
  // 唯一ID
  id?: string;
  // regionId
  regionId: string;
  // 资源
  resources: AliyunResource[];
  // 服务名称
  serviceName: string;
  static names(): { [key: string]: string } {
    return {
      action: 'action',
      conditions: 'conditions',
      id: 'id',
      regionId: 'region_id',
      resources: 'resources',
      serviceName: 'service_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      action: 'string',
      conditions: { 'type': 'array', 'itemType': Condition },
      id: 'string',
      regionId: 'string',
      resources: { 'type': 'array', 'itemType': AliyunResource },
      serviceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ScopeEntity extends $tea.Model {
  key?: string;
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

// 阿里云POP透传参数
export class AliyunPopRequestInfo extends $tea.Model {
  // AccessKey
  accessKeyId?: string;
  // 是否开启MFA
  akMfaPresent?: boolean;
  // Ak系统中记录的客户端代理信息，比如来源于Ecs控制台的请求取之就是EcsConsole
  akProxy?: string;
  // API名称
  apiName?: string;
  // 调用者IP
  // 
  appIp?: string;
  // 调用者BID
  callerBid?: string;
  // 调用者主账号ID
  callerParentId?: string;
  // 调用者类型，支持partner, customer, sub, AssumedRoleUser
  callerType: string;
  // 调用者ID
  callerUid?: string;
  // 用户原始请求是否使用https
  proxyOriginalSecurityTransport?: boolean;
  // 用户原始IP
  // 
  proxyOriginalSourceIp?: string;
  // 提交给网关的原始IP等信息是否可信
  proxyTrustTransportInfo?: boolean;
  // request_id
  requestId?: string;
  // STS token
  securityToken?: string;
  // security_transport
  securityTransport?: boolean;
  // 来源IP
  sourceIp?: string;
  // StsTokenAccountBID，创建子账号的主账号 的BID。使用StsToken调用POP时才有此参数
  stsTokenCallerBid?: string;
  // STS token调用者ID
  stsTokenCallerUid?: string;
  // 子账号id:sessioname。调用者阿里云principalId，使用StsToken调用POP时才有此参数
  stsTokenPrincipalId?: string;
  // 调用者阿里云roleId，使用StsToken调用POP时才有此参数
  // 
  stsTokenRoleId?: string;
  // STS token绑定用户ID
  stsTokenUserId?: string;
  // 版本
  version?: string;
  static names(): { [key: string]: string } {
    return {
      accessKeyId: 'access_key_id',
      akMfaPresent: 'ak_mfa_present',
      akProxy: 'ak_proxy',
      apiName: 'api_name',
      appIp: 'app_ip',
      callerBid: 'caller_bid',
      callerParentId: 'caller_parent_id',
      callerType: 'caller_type',
      callerUid: 'caller_uid',
      proxyOriginalSecurityTransport: 'proxy_original_security_transport',
      proxyOriginalSourceIp: 'proxy_original_source_ip',
      proxyTrustTransportInfo: 'proxy_trust_transport_info',
      requestId: 'request_id',
      securityToken: 'security_token',
      securityTransport: 'security_transport',
      sourceIp: 'source_ip',
      stsTokenCallerBid: 'sts_token_caller_bid',
      stsTokenCallerUid: 'sts_token_caller_uid',
      stsTokenPrincipalId: 'sts_token_principal_id',
      stsTokenRoleId: 'sts_token_role_id',
      stsTokenUserId: 'sts_token_user_id',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accessKeyId: 'string',
      akMfaPresent: 'boolean',
      akProxy: 'string',
      apiName: 'string',
      appIp: 'string',
      callerBid: 'string',
      callerParentId: 'string',
      callerType: 'string',
      callerUid: 'string',
      proxyOriginalSecurityTransport: 'boolean',
      proxyOriginalSourceIp: 'string',
      proxyTrustTransportInfo: 'boolean',
      requestId: 'string',
      securityToken: 'string',
      securityTransport: 'boolean',
      sourceIp: 'string',
      stsTokenCallerBid: 'string',
      stsTokenCallerUid: 'string',
      stsTokenPrincipalId: 'string',
      stsTokenRoleId: 'string',
      stsTokenUserId: 'string',
      version: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 虚拟身份受信关系
export class StsActorBinding extends $tea.Model {
  // 虚拟身份ID
  actorId?: string;
  // 受信对象ID
  bindId?: string;
  // 虚拟身份受信类型，可以为TENANT或者ALIYUN_SERVICE
  bindType?: string;
  static names(): { [key: string]: string } {
    return {
      actorId: 'actor_id',
      bindId: 'bind_id',
      bindType: 'bind_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      actorId: 'string',
      bindId: 'string',
      bindType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 操作点
export class Action extends $tea.Model {
  // 操作点描述
  description?: string;
  // 操作点ID
  id?: string;
  // 操作点名称
  name?: string;
  static names(): { [key: string]: string } {
    return {
      description: 'description',
      id: 'id',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      description: 'string',
      id: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 操作类型
export class OperationType extends $tea.Model {
  // 操作描述
  description: string;
  // 展示名称
  displayName: string;
  // 是否启用
  enabled: string;
  // 操作名称
  name: string;
  // 产品码
  product: string;
  // 操作来源
  source: string;
  // Onex接口额外信息
  onexExtraInfo?: OnexExtraInfo;
  // 资源类型
  resourceType?: string;
  // 资源表达式
  resourceExp?: string;
  static names(): { [key: string]: string } {
    return {
      description: 'description',
      displayName: 'display_name',
      enabled: 'enabled',
      name: 'name',
      product: 'product',
      source: 'source',
      onexExtraInfo: 'onex_extra_info',
      resourceType: 'resource_type',
      resourceExp: 'resource_exp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      description: 'string',
      displayName: 'string',
      enabled: 'string',
      name: 'string',
      product: 'string',
      source: 'string',
      onexExtraInfo: OnexExtraInfo,
      resourceType: 'string',
      resourceExp: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 部门用户关系
export class DepartmentUser extends $tea.Model {
  // 部门唯一码
  departmentCode?: string;
  // 用户 id
  userId?: string;
  // 部门成员类型，
  type?: string;
  static names(): { [key: string]: string } {
    return {
      departmentCode: 'department_code',
      userId: 'user_id',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      departmentCode: 'string',
      userId: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云批量鉴权
export class AliyunAuthenticateBatchEvent extends $tea.Model {
  // 金融云用户ID
  userId: string;
  // 阿里云鉴权列表
  ramAuthContexts: AliyunRamAuthContext[];
  // BSB透传下来的阿里云信息
  requestInfo: AliyunPopRequestInfo;
  static names(): { [key: string]: string } {
    return {
      userId: 'user_id',
      ramAuthContexts: 'ram_auth_contexts',
      requestInfo: 'request_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userId: 'string',
      ramAuthContexts: { 'type': 'array', 'itemType': AliyunRamAuthContext },
      requestInfo: AliyunPopRequestInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 鉴权结果
export class Judgement extends $tea.Model {
  // 唯一ID
  id?: string;
  // 是否通过
  pass: boolean;
  // 失败原因
  reason?: string;
  // 解决方案
  solution?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      pass: 'pass',
      reason: 'reason',
      solution: 'solution',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      pass: 'boolean',
      reason: 'string',
      solution: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 角色
export class Role extends $tea.Model {
  // 操作点列表
  actions?: Action[];
  // 创建时间，ISO8601格式
  createTime?: string;
  // 角色描述
  description?: string;
  // 角色ID
  id?: string;
  // 角色名称
  name?: string;
  // 角色归属租户
  tenant?: string;
  // 角色类型，CUSTOM:自定义角色，COMMON:系统通用角色
  type?: string;
  // 更新时间，ISO8601格式
  updateTime?: string;
  static names(): { [key: string]: string } {
    return {
      actions: 'actions',
      createTime: 'create_time',
      description: 'description',
      id: 'id',
      name: 'name',
      tenant: 'tenant',
      type: 'type',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      actions: { 'type': 'array', 'itemType': Action },
      createTime: 'string',
      description: 'string',
      id: 'string',
      name: 'string',
      tenant: 'string',
      type: 'string',
      updateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 授权组
export class AuthGroup extends $tea.Model {
  // 创建时间，ISO8601格式
  creationTime?: string;
  // 授权组ID
  id?: string;
  // 授权组名称
  name?: string;
  // 更新时间，ISO8601格式
  updateTime?: string;
  static names(): { [key: string]: string } {
    return {
      creationTime: 'creation_time',
      id: 'id',
      name: 'name',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      creationTime: 'string',
      id: 'string',
      name: 'string',
      updateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AccessKey
export class AccessKey extends $tea.Model {
  // AccessKey创建时间，ISO8601格式
  createTime?: string;
  // AccessKey唯一标识
  id?: string;
  // AccessKey的秘钥，加密传输，网关返回后，使用调用方的AccesSecret进行解密
  secret?: string;
  // 状态
  status?: string;
  // AccessKey最近一次修改时间，ISO8601格式
  updateTime?: string;
  static names(): { [key: string]: string } {
    return {
      createTime: 'create_time',
      id: 'id',
      secret: 'secret',
      status: 'status',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      createTime: 'string',
      id: 'string',
      secret: 'string',
      status: 'string',
      updateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 虚拟身份
export class StsActor extends $tea.Model {
  // 虚拟身份受信关系集合，通常只包含一个
  bindings: StsActorBinding[];
  // 针对虚拟身份的描述
  description?: string;
  // 虚拟身份名称，租户内唯一
  name: string;
  // 虚拟身份所在租户
  tenant: string;
  static names(): { [key: string]: string } {
    return {
      bindings: 'bindings',
      description: 'description',
      name: 'name',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bindings: { 'type': 'array', 'itemType': StsActorBinding },
      description: 'string',
      name: 'string',
      tenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 授权策略
export class AuthPolicy extends $tea.Model {
  // 授权能力Id
  abilityId?: string;
  // 授权能力类型（ROLE：角色，ACTION：操作）
  abilityType?: string;
  // 授权条件
  conditions?: Condition[];
  // 创建时间，ISO8601格式
  createTime?: string;
  // 权限策略描述
  description?: string;
  // 授权策略ID
  id?: string;
  // 授权策略名称
  name?: string;
  // 授权条件
  scopeEntities?: ScopeEntity[];
  // 授权策略归属租户
  tenant?: string;
  // 授权策略类型（CUSTOM：自定义授权策略）
  type?: string;
  // 更新时间，ISO8601格式
  updateTime?: string;
  static names(): { [key: string]: string } {
    return {
      abilityId: 'ability_id',
      abilityType: 'ability_type',
      conditions: 'conditions',
      createTime: 'create_time',
      description: 'description',
      id: 'id',
      name: 'name',
      scopeEntities: 'scope_entities',
      tenant: 'tenant',
      type: 'type',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      abilityId: 'string',
      abilityType: 'string',
      conditions: { 'type': 'array', 'itemType': Condition },
      createTime: 'string',
      description: 'string',
      id: 'string',
      name: 'string',
      scopeEntities: { 'type': 'array', 'itemType': ScopeEntity },
      tenant: 'string',
      type: 'string',
      updateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 租户
export class Tenant extends $tea.Model {
  // 蚂蚁通行证签约账户
  antAccount?: string;
  // 蚂蚁通行证uid
  antUid?: string;
  // 金融云官网:ANTCLOUD,蚂蚁开放平台：ANTOPEN
  businessOwnerId?: string;
  // 租户创建时间，ISO8601格式
  createTime?: string;
  // 租户所在的企业的唯一标识
  customer?: string;
  // 租户描述信息
  description?: string;
  // 租户唯一标识
  id?: string;
  // 租户内部id
  internalId?: string;
  // 租户显示名称
  name?: string;
  // 租户最近一次修改时间，ISO8601格式
  updateTime?: string;
  // 标签
  tags?: string[];
  static names(): { [key: string]: string } {
    return {
      antAccount: 'ant_account',
      antUid: 'ant_uid',
      businessOwnerId: 'business_owner_id',
      createTime: 'create_time',
      customer: 'customer',
      description: 'description',
      id: 'id',
      internalId: 'internal_id',
      name: 'name',
      updateTime: 'update_time',
      tags: 'tags',
    };
  }

  static types(): { [key: string]: any } {
    return {
      antAccount: 'string',
      antUid: 'string',
      businessOwnerId: 'string',
      createTime: 'string',
      customer: 'string',
      description: 'string',
      id: 'string',
      internalId: 'string',
      name: 'string',
      updateTime: 'string',
      tags: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 部门
export class Department extends $tea.Model {
  // 部门唯一代码
  code?: string;
  // 部门名称
  name?: string;
  // 部门描述信息
  description?: string;
  // 父部门 code
  parentCode?: string;
  // 父部门一直到根节点的路径，例如：DP0000000001/DP0000000002
  parentPath?: string;
  // 企业 id
  customerId?: string;
  // 是否为叶子结点
  isLeaf?: boolean;
  // 创建时间，ISO8601格式
  creationTime?: string;
  // 更新时间，ISO8601格式
  updateTime?: string;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      name: 'name',
      description: 'description',
      parentCode: 'parent_code',
      parentPath: 'parent_path',
      customerId: 'customer_id',
      isLeaf: 'is_leaf',
      creationTime: 'creation_time',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      name: 'string',
      description: 'string',
      parentCode: 'string',
      parentPath: 'string',
      customerId: 'string',
      isLeaf: 'boolean',
      creationTime: 'string',
      updateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 批量鉴权对象
export class AuthenticateBatchEvent extends $tea.Model {
  // 鉴权事件列表
  events: AuthenticateEvent[];
  static names(): { [key: string]: string } {
    return {
      events: 'events',
    };
  }

  static types(): { [key: string]: any } {
    return {
      events: { 'type': 'array', 'itemType': AuthenticateEvent },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 访问IaaS层的身份
export class Accessor extends $tea.Model {
  // Accessor关联的AccessKey
  accessKey?: string;
  // Accessor关联的AccessKey的密钥，加密传输，网关返回后，使用调用方的AccessSecret进行解密
  accessSecret?: string;
  // AccessKey的密钥，加密传输，网关返回后，使用调用方的AccessSecret进行解密
  account?: string;
  // AccessKey创建时间，ISO8601格式
  createTime?: string;
  // Accessor唯一标识
  id?: string;
  // Accessor类型(RAM/ACCOUNT)
  type?: string;
  static names(): { [key: string]: string } {
    return {
      accessKey: 'access_key',
      accessSecret: 'access_secret',
      account: 'account',
      createTime: 'create_time',
      id: 'id',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accessKey: 'string',
      accessSecret: 'string',
      account: 'string',
      createTime: 'string',
      id: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业
export class Customer extends $tea.Model {
  // 企业创建时间，ISO8601格式
  createTime?: string;
  // 企业ID
  id?: string;
  // 企业名称
  name?: string;
  // 企业最近一次修改时间，ISO8601格式
  updateTime?: string;
  static names(): { [key: string]: string } {
    return {
      createTime: 'create_time',
      id: 'id',
      name: 'name',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      createTime: 'string',
      id: 'string',
      name: 'string',
      updateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Mfa 配置
export class MfaConfig extends $tea.Model {
  // 用户id
  userId?: string;
  // MFA状态, 取值范围：ENABLED, DISABLED
  status?: string;
  // MFA类型，取值范围：SELF(自有MFA), SYMANTEC(赛门铁克MFA)
  type?: string;
  // 密钥
  secretKey?: string;
  // 最后一次密钥生成时间
  lastGeneratedTime?: string;
  // (校验失败时)重试校验的次数, 0 代表不限次数
  verifyAttempts?: number;
  // 第一次校验失败时间, ISO8601格式
  firstFailureTime?: string;
  static names(): { [key: string]: string } {
    return {
      userId: 'user_id',
      status: 'status',
      type: 'type',
      secretKey: 'secret_key',
      lastGeneratedTime: 'last_generated_time',
      verifyAttempts: 'verify_attempts',
      firstFailureTime: 'first_failure_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userId: 'string',
      status: 'string',
      type: 'string',
      secretKey: 'string',
      lastGeneratedTime: 'string',
      verifyAttempts: 'number',
      firstFailureTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 成员组
export class Group extends $tea.Model {
  // 成员组ID
  id: string;
  // 成员组名称
  name: string;
  // 成员组描述
  description: string;
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

// 操作员
export class Operator extends $tea.Model {
  // 操作员创建时间，ISO8601格式
  createTime?: string;
  // 操作员所在的企业
  customer?: string;
  // 邮箱
  email?: string;
  // 外部对接系统操作员id
  externalId?: string;
  // 外部对接系统类型
  externalSystem?: string;
  // 操作员ID
  id?: string;
  // 是否是主账号
  isMaster?: boolean;
  // 登录名
  loginName?: string;
  // 手机号
  mobile?: string;
  // 昵称
  nickname?: string;
  // 真实姓名
  realName?: string;
  // 操作员状态(INACTIVE：未激活，NORMAL：正常状态，FROZEN：冻结状态)
  status?: string;
  // 操作员加入的租户列表
  tenants?: string[];
  // 操作员最近一次修改时间，ISO8601格式
  updateTime?: string;
  // 操作员工号
  workNo?: string;
  // 部门唯一码
  departmentCode?: string;
  // 最近一次登录时间，为空则代表没有登录过，ISO8601格式，
  lastLoginTime?: string;
  static names(): { [key: string]: string } {
    return {
      createTime: 'create_time',
      customer: 'customer',
      email: 'email',
      externalId: 'external_id',
      externalSystem: 'external_system',
      id: 'id',
      isMaster: 'is_master',
      loginName: 'login_name',
      mobile: 'mobile',
      nickname: 'nickname',
      realName: 'real_name',
      status: 'status',
      tenants: 'tenants',
      updateTime: 'update_time',
      workNo: 'work_no',
      departmentCode: 'department_code',
      lastLoginTime: 'last_login_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      createTime: 'string',
      customer: 'string',
      email: 'string',
      externalId: 'string',
      externalSystem: 'string',
      id: 'string',
      isMaster: 'boolean',
      loginName: 'string',
      mobile: 'string',
      nickname: 'string',
      realName: 'string',
      status: 'string',
      tenants: { 'type': 'array', 'itemType': 'string' },
      updateTime: 'string',
      workNo: 'string',
      departmentCode: 'string',
      lastLoginTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRoleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 角色ID
  roleId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      roleId: 'role_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      roleId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRoleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 角色所包含的操作点
  actions?: Action[];
  // 创建时间,ISO8601格式
  createTime?: string;
  // 角色描述
  description?: string;
  // 角色Id
  id?: string;
  // 角色名称
  name?: string;
  // 角色归属租户
  tenant?: string;
  // 角色类型，CUSTOM:自定义角色，COMMON:系统通用角色
  type?: string;
  // 更新时间,ISO8601格式
  updateTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      actions: 'actions',
      createTime: 'create_time',
      description: 'description',
      id: 'id',
      name: 'name',
      tenant: 'tenant',
      type: 'type',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      actions: { 'type': 'array', 'itemType': Action },
      createTime: 'string',
      description: 'string',
      id: 'string',
      name: 'string',
      tenant: 'string',
      type: 'string',
      updateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPolicyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 授权对象id
  actorId: string;
  // 授权对象类型
  actorType: string;
  // 当前页，默认值为1
  pageNum?: number;
  // 分页大小，默认值为10
  pageSize?: number;
  // 授权策略所属租户
  tenant: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      actorId: 'actor_id',
      actorType: 'actor_type',
      pageNum: 'page_num',
      pageSize: 'page_size',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      actorId: 'string',
      actorType: 'string',
      pageNum: 'number',
      pageSize: 'number',
      tenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPolicyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 传入的页码, 如果没有传入, 则取默认值1
  pageNum: number;
  // 传入的页大小, 如果没有传入, 则取默认值10
  pageSize: number;
  // 授权策略列表
  policies: AuthPolicy[];
  // 查询结果的总条目数量
  totalCount: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pageNum: 'page_num',
      pageSize: 'page_size',
      policies: 'policies',
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
      policies: { 'type': 'array', 'itemType': AuthPolicy },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 授权组成员ID。授权组成员是操作员
  memberId?: string;
  // 授权组名称
  name?: string;
  // 当前页码，默认为1
  pageNum?: number;
  // 分页大小，默认10
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      memberId: 'member_id',
      name: 'name',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      memberId: 'string',
      name: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授权组列表
  groups: AuthGroup[];
  // 当前页码
  pageNum: number;
  // 分页大小
  pageSize: number;
  // 应用总数
  totalCount: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      groups: 'groups',
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
      groups: { 'type': 'array', 'itemType': AuthGroup },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreatePolicyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 角色Id
  abilityId: string;
  // 授权能力类型（ROLE：角色)
  abilityType: string;
  // 授权策略的限制条件
  conditons?: Condition[];
  // 策略的描述
  description?: string;
  // 授权策略名称
  name: string;
  // 八位租户ID
  tenant: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      abilityId: 'ability_id',
      abilityType: 'ability_type',
      conditons: 'conditons',
      description: 'description',
      name: 'name',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      abilityId: 'string',
      abilityType: 'string',
      conditons: { 'type': 'array', 'itemType': Condition },
      description: 'string',
      name: 'string',
      tenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreatePolicyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授权策略id
  policyId: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      policyId: 'policy_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      policyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeletePolicyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 授权策略Id
  policyId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      policyId: 'policy_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      policyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeletePolicyResponse extends $tea.Model {
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

export class AttachPolicyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 授权对象Id
  actorId?: string;
  // 授权对象类型
  actorType?: string;
  // 授权策略Id
  policyId?: string;
  // 授权操作员的登录名，当配置actor_id与actor_type时可不填
  loginName?: string;
  // 授权策略的唯一名称，当配置policy_id时可不填
  policyName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      actorId: 'actor_id',
      actorType: 'actor_type',
      policyId: 'policy_id',
      loginName: 'login_name',
      policyName: 'policy_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      actorId: 'string',
      actorType: 'string',
      policyId: 'string',
      loginName: 'string',
      policyName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AttachPolicyResponse extends $tea.Model {
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

export class DetachPolicyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 授权对象Id
  actorId?: string;
  // 授权对象类型
  actorType?: string;
  // 授权策略Id
  policyId?: string;
  // 授权操作员的登录名，当配置actor_id与actor_type时可不填
  loginName?: string;
  // 授权策略的唯一名称，当配置policy_id时可不填
  policyName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      actorId: 'actor_id',
      actorType: 'actor_type',
      policyId: 'policy_id',
      loginName: 'login_name',
      policyName: 'policy_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      actorId: 'string',
      actorType: 'string',
      policyId: 'string',
      loginName: 'string',
      policyName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetachPolicyResponse extends $tea.Model {
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

export class ListPolicyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 授权对象id
  actorId: string;
  // 授权对象类型
  actorType: string;
  // 授权策略所属租户
  tenant?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      actorId: 'actor_id',
      actorType: 'actor_type',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      actorId: 'string',
      actorType: 'string',
      tenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListPolicyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授权策略列表
  policies: AuthPolicy[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      policies: 'policies',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      policies: { 'type': 'array', 'itemType': AuthPolicy },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class JudgeAuthorityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 操作点id
  actionId: string;
  // 鉴权条件
  conditions?: Condition[];
  // 鉴权对象id
  operatorId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      actionId: 'action_id',
      conditions: 'conditions',
      operatorId: 'operator_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      actionId: 'string',
      conditions: { 'type': 'array', 'itemType': Condition },
      operatorId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class JudgeAuthorityResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 判断结果。true：鉴权通过；false：鉴权未通过
  result: string;
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

export class CreateProductActionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 操作点ID
  actionId: string;
  // 操作点所属功能分类ID
  categoryId?: string;
  // 操作点描述
  description?: string;
  // 操作点名称
  name: string;
  // 操作点所属产品
  product: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      actionId: 'action_id',
      categoryId: 'category_id',
      description: 'description',
      name: 'name',
      product: 'product',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      actionId: 'string',
      categoryId: 'string',
      description: 'string',
      name: 'string',
      product: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateProductActionResponse extends $tea.Model {
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

export class VerifyOauthTokenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // token值
  accessToken: string;
  // 是否刷新access_token有限期
  extend?: boolean;
  // token应用场景，LOGIN或AUTH
  scene: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      accessToken: 'access_token',
      extend: 'extend',
      scene: 'scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      accessToken: 'string',
      extend: 'boolean',
      scene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyOauthTokenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // token关联的用户id
  id?: string;
  // token关联的用户类型
  type?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      id: 'id',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      id: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifySessionTokenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // token值
  token: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      token: 'token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      token: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifySessionTokenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户所在企业的唯一标识
  customer?: string;
  // 登录名
  loginName?: string;
  // 用户加入的租户ID列表
  tenants?: string[];
  // session关联的用户id
  userId?: string;
  // 租户详情列表
  tenantDetails?: Tenant[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      customer: 'customer',
      loginName: 'login_name',
      tenants: 'tenants',
      userId: 'user_id',
      tenantDetails: 'tenant_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      customer: 'string',
      loginName: 'string',
      tenants: { 'type': 'array', 'itemType': 'string' },
      userId: 'string',
      tenantDetails: { 'type': 'array', 'itemType': Tenant },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRoleOperatorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 角色ID
  roleId: string;
  // 租户信息
  tenant: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      roleId: 'role_id',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      roleId: 'string',
      tenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRoleOperatorResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作员列表
  operators: Operator[];
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
      operators: { 'type': 'array', 'itemType': Operator },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyTrustloginUrlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 	跳转地址
  gotoUrl: string;
  // 	操作员id
  operatorId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      gotoUrl: 'goto_url',
      operatorId: 'operator_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      gotoUrl: 'string',
      operatorId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyTrustloginUrlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 信登URL
  trustLoginUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      trustLoginUrl: 'trust_login_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      trustLoginUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AssumeStsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 虚拟身份唯一名称
  actorName: string;
  // 虚拟身份所属租户
  actorTenant: string;
  // 过期时间，单位为秒，范围900-3600，默认为3600
  durationSeconds?: number;
  // 会话名称
  sessionName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      actorName: 'actor_name',
      actorTenant: 'actor_tenant',
      durationSeconds: 'duration_seconds',
      sessionName: 'session_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      actorName: 'string',
      actorTenant: 'string',
      durationSeconds: 'number',
      sessionName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AssumeStsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 安全令牌accessKey
  accessKey?: string;
  // 安全令牌accessSecret
  accessSecret?: string;
  // 过期时间戳，单位为毫秒
  expiredTime?: number;
  // 安全令牌
  securityToken?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accessKey: 'access_key',
      accessSecret: 'access_secret',
      expiredTime: 'expired_time',
      securityToken: 'security_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accessKey: 'string',
      accessSecret: 'string',
      expiredTime: 'number',
      securityToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateStsActorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 虚拟身份受信关系集合，通常只包含一个
  bindings: StsActorBinding[];
  // 针对虚拟身份的描述
  description?: string;
  // 虚拟身份名称，租户内唯一
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      bindings: 'bindings',
      description: 'description',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      bindings: { 'type': 'array', 'itemType': StsActorBinding },
      description: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateStsActorResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 虚拟身份ID
  actorId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      actorId: 'actor_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      actorId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteStsActorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 虚拟身份ID，与虚拟身份名称两个参数二选一传入
  actorId?: string;
  // 虚拟身份名称，与虚拟身份名称两个参数二选一传入
  actorName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      actorId: 'actor_id',
      actorName: 'actor_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      actorId: 'string',
      actorName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteStsActorResponse extends $tea.Model {
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

export class GetStsActorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 虚拟身份ID，与虚拟身份名称两个参数二选一传入
  actorId?: string;
  // 虚拟身份名称，与虚拟身份名称两个参数二选一传入
  actorName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      actorId: 'actor_id',
      actorName: 'actor_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      actorId: 'string',
      actorName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetStsActorResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 虚拟身份受信关系集合，通常只包含一个
  bindings?: StsActorBinding[];
  // 针对虚拟身份的描述
  description?: string;
  // 虚拟身份ID
  id?: string;
  // 虚拟身份名称，租户内唯一
  name?: string;
  // 虚拟身份所在租户
  tenant?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bindings: 'bindings',
      description: 'description',
      id: 'id',
      name: 'name',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bindings: { 'type': 'array', 'itemType': StsActorBinding },
      description: 'string',
      id: 'string',
      name: 'string',
      tenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListStsActorRequest extends $tea.Model {
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

export class ListStsActorResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 虚拟身份列表
  actors?: StsActor[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      actors: 'actors',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      actors: { 'type': 'array', 'itemType': StsActor },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateStsActorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 虚拟身份ID
  actorId: string;
  // 针对虚拟身份的描述
  description?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      actorId: 'actor_id',
      description: 'description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      actorId: 'string',
      description: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateStsActorResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 虚拟身份受信关系集合，通常只包含一个
  bindings?: StsActorBinding[];
  // 针对虚拟身份的描述
  description?: string;
  // 虚拟身份ID
  id?: string;
  // 虚拟身份名称，租户内唯一
  name?: string;
  // 虚拟身份所在租户
  tenant?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bindings: 'bindings',
      description: 'description',
      id: 'id',
      name: 'name',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bindings: { 'type': 'array', 'itemType': StsActorBinding },
      description: 'string',
      id: 'string',
      name: 'string',
      tenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRoleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 角色名称
  name?: string;
  // 当前页,默认1
  pageNum?: number;
  // 分页大小，取值范围[1~50],默认10
  pageSize?: number;
  // 是否分页，默认true
  paging?: boolean;
  // 角色类型，自定义角色为CUSTOM或者系统角色为COMMON
  type?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      pageNum: 'page_num',
      pageSize: 'page_size',
      paging: 'paging',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      pageNum: 'number',
      pageSize: 'number',
      paging: 'boolean',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRoleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前页
  pageNum?: number;
  // 分页大小
  pageSize?: number;
  // 角色列表
  roles?: Role[];
  // 记录总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pageNum: 'page_num',
      pageSize: 'page_size',
      roles: 'roles',
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
      roles: { 'type': 'array', 'itemType': Role },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetIaasaccountBaseinfoRequest extends $tea.Model {
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

export class GetIaasaccountBaseinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 账号名称
  account?: string;
  // 账号ID
  id?: string;
  // iaas账号类型
  // ALIYUN_BID: 阿里云BID类型
  // ALIYUN_BID_MIG: 原本是阿里云BID类型，迁移后可两侧登录
  // ALIYUN_MPK: 阿里云MPK类型
  // ALIYUN_LOCALIZATION: 阿里云一方化类型
  sourceType?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      account: 'account',
      id: 'id',
      sourceType: 'source_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      account: 'string',
      id: 'string',
      sourceType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyPasswordRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 加密过的密码值，使用AccessSecret进行3DES加密
  encryptedPassword: string;
  // 登录名
  loginName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      encryptedPassword: 'encrypted_password',
      loginName: 'login_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      encryptedPassword: 'string',
      loginName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyPasswordResponse extends $tea.Model {
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

export class UpdateOperatorStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 操作员ID
  operatorId: string;
  // 要更新到的状态，FROZEN为冻结，NORMAL为正常
  status: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operatorId: 'operator_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operatorId: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateOperatorStatusResponse extends $tea.Model {
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

export class FreezeOperatorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 操作员ID
  operatorId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operatorId: 'operator_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operatorId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FreezeOperatorResponse extends $tea.Model {
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

export class UnfreezeOperatorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 操作员ID
  operatorId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operatorId: 'operator_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operatorId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnfreezeOperatorResponse extends $tea.Model {
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

export class GetInternalMasterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 阿里云PK
  iaasId?: string;
  // 主账号ID
  masterId?: string;
  // 来源系统，例如MAYI，ALBABACLOUD
  sourceSystem?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      iaasId: 'iaas_id',
      masterId: 'master_id',
      sourceSystem: 'source_system',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      iaasId: 'string',
      masterId: 'string',
      sourceSystem: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInternalMasterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 证件ID
  certNo?: string;
  // 证件类型
  certType?: string;
  // 所属客户ID
  customerId?: string;
  // 邮箱
  email?: string;
  // 企业认证名称
  firmName?: string;
  // havanaId
  havanaId?: string;
  // 主账号ID
  id?: string;
  // 登录名
  loginName?: string;
  // 手机
  mobile?: string;
  // 真实姓名
  realName?: string;
  // 来源用户类型，CUSTOMER（企业用户），PERSONAL（个人用户）
  sourceUserType?: string;
  // 主账号行业标签，I表示金融机构，C表示特殊机构，N表示非金融机构
  industryLabel?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certNo: 'cert_no',
      certType: 'cert_type',
      customerId: 'customer_id',
      email: 'email',
      firmName: 'firm_name',
      havanaId: 'havana_id',
      id: 'id',
      loginName: 'login_name',
      mobile: 'mobile',
      realName: 'real_name',
      sourceUserType: 'source_user_type',
      industryLabel: 'industry_label',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certNo: 'string',
      certType: 'string',
      customerId: 'string',
      email: 'string',
      firmName: 'string',
      havanaId: 'string',
      id: 'string',
      loginName: 'string',
      mobile: 'string',
      realName: 'string',
      sourceUserType: 'string',
      industryLabel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAliyunUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 阿里云用户ID
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAliyunUserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 阿里云用户ID
  id?: string;
  // 主账号类型下有值，即type为ENTERPRISE和PERSONAL时有值
  loginName?: string;
  // 用户名称，ENTERPRISE类型为企业名称，PERSONAL为个人姓名，RAM为唯一名称
  name?: string;
  // RAM子账号的显示名称
  ramDisplayName?: string;
  // 用户所属租户
  tenant?: string;
  // 阿里云用户类型，分为主账号企业（ENTERPRISE），主账号个人（PERSONAL），和子账号（RAM）
  type?: string;
  // 显示名
  displayName?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      id: 'id',
      loginName: 'login_name',
      name: 'name',
      ramDisplayName: 'ram_display_name',
      tenant: 'tenant',
      type: 'type',
      displayName: 'display_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      id: 'string',
      loginName: 'string',
      name: 'string',
      ramDisplayName: 'string',
      tenant: 'string',
      type: 'string',
      displayName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class JudgeAliyunAuthorityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 阿里云POP API名称
  action: string;
  // 阿里云资源描述数组
  aliyunResources: AliyunResource[];
  // 自定义条件
  conditions?: Condition[];
  // regionId
  regionId: string;
  // 阿里云POP透传参数
  requestInfo: AliyunPopRequestInfo;
  // 阿里云服务名称
  serviceName: string;
  // 0000000001
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      action: 'action',
      aliyunResources: 'aliyun_resources',
      conditions: 'conditions',
      regionId: 'region_id',
      requestInfo: 'request_info',
      serviceName: 'service_name',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      action: 'string',
      aliyunResources: { 'type': 'array', 'itemType': AliyunResource },
      conditions: { 'type': 'array', 'itemType': Condition },
      regionId: 'string',
      requestInfo: AliyunPopRequestInfo,
      serviceName: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class JudgeAliyunAuthorityResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 权限校验是否通过
  result?: boolean;
  // 失败原因
  reason?: string;
  // 解决方案
  solution?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
      reason: 'reason',
      solution: 'solution',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: 'boolean',
      reason: 'string',
      solution: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSessionAccessorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 登录态
  authorization: string;
  // 用户所属租户
  userTenant: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      authorization: 'authorization',
      userTenant: 'user_tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      authorization: 'string',
      userTenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSessionAccessorResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // access_key
  accessKey?: string;
  // access_secret
  accessSecret?: string;
  // 关联租户名称
  tenant?: string;
  // 用户ID
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accessKey: 'access_key',
      accessSecret: 'access_secret',
      tenant: 'tenant',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accessKey: 'string',
      accessSecret: 'string',
      tenant: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdatePasswordRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 登录名
  loginName: string;
  // 加密过的新密码值，使用AccessSecret进行3DES加密
  // 
  newEncryptedPassword: string;
  // 加密过的旧密码值，使用AccessSecret进行DES加密
  // 
  oldEncryptedPassword: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      loginName: 'login_name',
      newEncryptedPassword: 'new_encrypted_password',
      oldEncryptedPassword: 'old_encrypted_password',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      loginName: 'string',
      newEncryptedPassword: 'string',
      oldEncryptedPassword: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdatePasswordResponse extends $tea.Model {
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

export class JudgeMultiauthorityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 批量鉴权对象
  batchEvent: AuthenticateBatchEvent;
  // 上下文信息
  context?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      batchEvent: 'batch_event',
      context: 'context',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      batchEvent: AuthenticateBatchEvent,
      context: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class JudgeMultiauthorityResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 鉴权结果列表
  judgements?: Judgement[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      judgements: 'judgements',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      judgements: { 'type': 'array', 'itemType': Judgement },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class JudgeAliyunMultiauthorityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 阿里云批量鉴权
  batchEvent: AliyunAuthenticateBatchEvent;
  // 上下文信息
  context?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      batchEvent: 'batch_event',
      context: 'context',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      batchEvent: AliyunAuthenticateBatchEvent,
      context: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class JudgeAliyunMultiauthorityResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 鉴权结果列表
  judgements?: Judgement[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      judgements: 'judgements',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      judgements: { 'type': 'array', 'itemType': Judgement },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAccessorCurrentRequest extends $tea.Model {
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

export class GetAccessorCurrentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 一方化链路为阿里云用户ID，蚂蚁链路为金融云用户ID
  id?: string;
  // 登录名
  loginName?: string;
  // 一方化链路：
  // 用户名称，ENTERPRISE类型为企业名称，PERSONAL为个人姓名，RAM为唯一名称
  // 蚂蚁链路：
  // 用户真实姓名
  // 
  name?: string;
  // 当前AK所属租户
  tenant?: string;
  // 一方化链路：
  // 阿里云用户类型，主账号为CUSTOMER，操作员为SUB，RAM角色为RAM_ROLE
  // 蚂蚁链路：
  // 主账号为MASTER，操作员为OPERATOR，服务账号为SERVICE
  type?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      id: 'id',
      loginName: 'login_name',
      name: 'name',
      tenant: 'tenant',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      id: 'string',
      loginName: 'string',
      name: 'string',
      tenant: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetServiceaccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 服务账号名称
  name?: string;
  // 服务账号ID
  serviceAccountId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      serviceAccountId: 'service_account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      serviceAccountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetServiceaccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 服务账号别名
  alias?: string;
  // 服务账号描述
  description?: string;
  // 服务账号ID
  id?: string;
  // 服务账号名称
  name?: string;
  // 服务账号所属租户
  tenant?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      alias: 'alias',
      description: 'description',
      id: 'id',
      name: 'name',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      alias: 'string',
      description: 'string',
      id: 'string',
      name: 'string',
      tenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateServiceaccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 服务账号描述
  description?: string;
  // 服务账号别名
  alias: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      description: 'description',
      alias: 'alias',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      description: 'string',
      alias: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateServiceaccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 服务账号AK
  accessKey?: string;
  // 服务账号SK
  accessSecret?: string;
  // 服务账号别名
  alias?: string;
  // 服务账号描述
  description?: string;
  // 服务账号ID
  id?: string;
  // 服务账号名称
  name?: string;
  // 服务账号所属租户
  tenant?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accessKey: 'access_key',
      accessSecret: 'access_secret',
      alias: 'alias',
      description: 'description',
      id: 'id',
      name: 'name',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accessKey: 'string',
      accessSecret: 'string',
      alias: 'string',
      description: 'string',
      id: 'string',
      name: 'string',
      tenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteServiceaccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 服务账号名称
  name?: string;
  // 服务账号ID
  serviceAccountId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      serviceAccountId: 'service_account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      serviceAccountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteServiceaccountResponse extends $tea.Model {
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

export class UpdateServiceaccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 服务账号别名
  alias?: string;
  // 服务账号描述
  description?: string;
  // 服务账号名称，与服务账号ID任选其一传入
  name?: string;
  // 服务账号ID
  serviceAccountId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      alias: 'alias',
      description: 'description',
      name: 'name',
      serviceAccountId: 'service_account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      alias: 'string',
      description: 'string',
      name: 'string',
      serviceAccountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateServiceaccountResponse extends $tea.Model {
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

export class RemoveTenantMemberRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 操作员ID
  operatorId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operatorId: 'operator_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operatorId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RemoveTenantMemberResponse extends $tea.Model {
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

export class CreateGroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 名称
  name: string;
  // 描述
  description?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      description: 'description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      description: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateGroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 成员组ID
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

export class DeleteGroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 成员组ID
  groupId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      groupId: 'group_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      groupId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteGroupResponse extends $tea.Model {
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

export class UpdateGroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 成员组ID
  groupId: string;
  // 名称
  name?: string;
  // 描述
  description?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      groupId: 'group_id',
      name: 'name',
      description: 'description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      groupId: 'string',
      name: 'string',
      description: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateGroupResponse extends $tea.Model {
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

export class AddGroupMemberRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 成员组ID
  groupId: string;
  // 操作员ID
  operatorIds: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      groupId: 'group_id',
      operatorIds: 'operator_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      groupId: 'string',
      operatorIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddGroupMemberResponse extends $tea.Model {
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

export class RemoveGroupMemberRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 成员组ID
  groupId: string;
  // 操作员ID
  operatorIds: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      groupId: 'group_id',
      operatorIds: 'operator_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      groupId: 'string',
      operatorIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RemoveGroupMemberResponse extends $tea.Model {
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

export class GetGroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 成员组ID
  groupId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      groupId: 'group_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      groupId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 成员组ID
  id?: string;
  // 名称
  name?: string;
  // 描述
  description?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      id: 'id',
      name: 'name',
      description: 'description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      id: 'string',
      name: 'string',
      description: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGroupMemberRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 成员组ID
  groupId: string;
  // 页大小
  pageSize?: number;
  // 当前页
  currentPage?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      groupId: 'group_id',
      pageSize: 'page_size',
      currentPage: 'current_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      groupId: 'string',
      pageSize: 'number',
      currentPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGroupMemberResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 成员列表
  operators?: Operator[];
  // 当前页
  currentPage?: number;
  // 页大小
  pageSize?: number;
  // 总计
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      operators: 'operators',
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
      operators: { 'type': 'array', 'itemType': Operator },
      currentPage: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListOperatorGroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 操作员ID
  operatorId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operatorId: 'operator_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operatorId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListOperatorGroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 成员组列表
  groups?: Group[];
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
      groups: { 'type': 'array', 'itemType': Group },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddRoleActionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 角色ID
  roleId: string;
  // 权限码
  actions: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      roleId: 'role_id',
      actions: 'actions',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      roleId: 'string',
      actions: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddRoleActionResponse extends $tea.Model {
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

export class RemoveRoleActionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 角色ID
  roleId: string;
  // 权限码
  actions: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      roleId: 'role_id',
      actions: 'actions',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      roleId: 'string',
      actions: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RemoveRoleActionResponse extends $tea.Model {
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

export class CreateRoleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 名称
  name: string;
  // 描述
  description?: string;
  // 权限码列表
  actions?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      description: 'description',
      actions: 'actions',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      description: 'string',
      actions: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRoleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 角色ID
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

export class DeleteRoleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 角色ID
  roleId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      roleId: 'role_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      roleId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteRoleResponse extends $tea.Model {
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

export class UpdateRoleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 角色ID
  roleId: string;
  // 名称
  name?: string;
  // 描述
  description?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      roleId: 'role_id',
      name: 'name',
      description: 'description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      roleId: 'string',
      name: 'string',
      description: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateRoleResponse extends $tea.Model {
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

export class GetDepartmentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 部门唯一代码
  code: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      code: 'code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      code: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDepartmentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 部门唯一代码
  code?: string;
  // 部门名称
  name?: string;
  // 部门描述信息
  description?: string;
  // 父部门 code
  parentCode?: string;
  // 企业 id
  customerId?: string;
  // 是否为叶子结点
  isLeaf?: boolean;
  // 创建时间，ISO8601格式
  creationTime?: string;
  // 更新时间，ISO8601格式
  updateTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      name: 'name',
      description: 'description',
      parentCode: 'parent_code',
      customerId: 'customer_id',
      isLeaf: 'is_leaf',
      creationTime: 'creation_time',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      name: 'string',
      description: 'string',
      parentCode: 'string',
      customerId: 'string',
      isLeaf: 'boolean',
      creationTime: 'string',
      updateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDepartmentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 部门唯一码
  code: string;
  // 部门名称
  name: string;
  // 部门描述信息
  description?: string;
  // 父部门 code，如果需要创建根部门，需填：ROOT
  parentCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      code: 'code',
      name: 'name',
      description: 'description',
      parentCode: 'parent_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      code: 'string',
      name: 'string',
      description: 'string',
      parentCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDepartmentResponse extends $tea.Model {
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

export class UpdateDepartmentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 部门唯一码
  code: string;
  // 部门名称
  name?: string;
  // 部门描述信息
  description?: string;
  // 父部们唯一码
  parentCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      code: 'code',
      name: 'name',
      description: 'description',
      parentCode: 'parent_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      code: 'string',
      name: 'string',
      description: 'string',
      parentCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDepartmentResponse extends $tea.Model {
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

export class DeleteDepartmentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 部门唯一码
  code: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      code: 'code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      code: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteDepartmentResponse extends $tea.Model {
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

export class PagequeryDepartmentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 部门唯一码
  code?: string;
  // 部门名称
  name?: string;
  // 部门描述信息
  description?: string;
  // 父部门唯一码
  parentCode?: string;
  // 分页大小
  pageSize?: number;
  // 当前页
  pageNum?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      code: 'code',
      name: 'name',
      description: 'description',
      parentCode: 'parent_code',
      pageSize: 'page_size',
      pageNum: 'page_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      code: 'string',
      name: 'string',
      description: 'string',
      parentCode: 'string',
      pageSize: 'number',
      pageNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryDepartmentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 部门列表
  departments?: Department[];
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
      departments: 'departments',
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
      departments: { 'type': 'array', 'itemType': Department },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryDepartmentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 部门唯一码
  codes?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      codes: 'codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      codes: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryDepartmentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 部门列表
  departments?: Department[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      departments: 'departments',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      departments: { 'type': 'array', 'itemType': Department },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveDepartmentUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 待添加或更新的部门成员关系列表
  departmentUsers: DepartmentUser[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      departmentUsers: 'department_users',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      departmentUsers: { 'type': 'array', 'itemType': DepartmentUser },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveDepartmentUserResponse extends $tea.Model {
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

export class RemoveDepartmentUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 待删除的部门成员关系列表
  departmentUsers: DepartmentUser[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      departmentUsers: 'department_users',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      departmentUsers: { 'type': 'array', 'itemType': DepartmentUser },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RemoveDepartmentUserResponse extends $tea.Model {
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

export class QueryDepartmentUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 部门唯一码
  departmentCode?: string;
  // 用户 id
  userId?: string;
  // 部门成员类型
  type?: string;
  // 分页大小
  pageSize?: number;
  // 当前页
  pageNum?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      departmentCode: 'department_code',
      userId: 'user_id',
      type: 'type',
      pageSize: 'page_size',
      pageNum: 'page_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      departmentCode: 'string',
      userId: 'string',
      type: 'string',
      pageSize: 'number',
      pageNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDepartmentUserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 部门成员列表
  departmentUsers?: DepartmentUser[];
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
      departmentUsers: 'department_users',
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
      departmentUsers: { 'type': 'array', 'itemType': DepartmentUser },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetLoginconfigRequest extends $tea.Model {
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

export class GetLoginconfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 密码最小长度
  passwordMinLength?: number;
  // 密码最大长度
  passwordMaxLength?: number;
  // 密码是否必须包含小写字母
  passwordLowercaseLetter?: boolean;
  // 密码是否必须包含大写字母
  passwordUppercaseLetter?: boolean;
  // 密码是否必须包含字母
  passwordLetter?: boolean;
  // 密码是否必须包含数字
  passwordDigit?: boolean;
  // 密码是否必须包含特殊字符
  passwordSpecialChar?: boolean;
  // 是否检查密码有效
  passwordValidCheck?: boolean;
  // 密码有效期
  passwordValidPeriod?: number;
  // 密码过期后是否允许登录
  passwordExpiredLogin?: boolean;
  // 是否检查密码历史
  passwordHistoryCheck?: boolean;
  // 密码历史个数
  passwordHistoryNum?: number;
  // 重试校验是否触发锁定
  verifyAttemptsCheck?: boolean;
  // 重试校验窗口
  verifyAttemptsWindow?: number;
  // 重试校验触发锁定阈值
  verifyAttemptsThreshold?: number;
  // 锁定时间
  lockoutDuration?: number;
  // 是否检查账户活跃
  activeCheck?: boolean;
  // 活跃周期，非活跃时锁定登录
  activePeriod?: number;
  // 是否允许自主管理密码
  passwordSelfManage?: boolean;
  // 是否允许自主管理MFA
  mfaSelfManage?: boolean;
  // 状态, 取值范围：NORMAL(正常状态), LOCK(锁定), ONE_PARTY_MIGRATING(一方化迁移中), ONE_PARTY_MIGRATION_LOCK(一方化迁移完成，禁用蚂蚁登录)
  status?: string;
  // 并发登录的ip数量，小于1表示不限制
  concurrentIpCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      passwordMinLength: 'password_min_length',
      passwordMaxLength: 'password_max_length',
      passwordLowercaseLetter: 'password_lowercase_letter',
      passwordUppercaseLetter: 'password_uppercase_letter',
      passwordLetter: 'password_letter',
      passwordDigit: 'password_digit',
      passwordSpecialChar: 'password_special_char',
      passwordValidCheck: 'password_valid_check',
      passwordValidPeriod: 'password_valid_period',
      passwordExpiredLogin: 'password_expired_login',
      passwordHistoryCheck: 'password_history_check',
      passwordHistoryNum: 'password_history_num',
      verifyAttemptsCheck: 'verify_attempts_check',
      verifyAttemptsWindow: 'verify_attempts_window',
      verifyAttemptsThreshold: 'verify_attempts_threshold',
      lockoutDuration: 'lockout_duration',
      activeCheck: 'active_check',
      activePeriod: 'active_period',
      passwordSelfManage: 'password_self_manage',
      mfaSelfManage: 'mfa_self_manage',
      status: 'status',
      concurrentIpCount: 'concurrent_ip_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      passwordMinLength: 'number',
      passwordMaxLength: 'number',
      passwordLowercaseLetter: 'boolean',
      passwordUppercaseLetter: 'boolean',
      passwordLetter: 'boolean',
      passwordDigit: 'boolean',
      passwordSpecialChar: 'boolean',
      passwordValidCheck: 'boolean',
      passwordValidPeriod: 'number',
      passwordExpiredLogin: 'boolean',
      passwordHistoryCheck: 'boolean',
      passwordHistoryNum: 'number',
      verifyAttemptsCheck: 'boolean',
      verifyAttemptsWindow: 'number',
      verifyAttemptsThreshold: 'number',
      lockoutDuration: 'number',
      activeCheck: 'boolean',
      activePeriod: 'number',
      passwordSelfManage: 'boolean',
      mfaSelfManage: 'boolean',
      status: 'string',
      concurrentIpCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateLoginconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 密码最小长度
  passwordMinLength?: number;
  // 密码最大长度
  passwordMaxLength?: number;
  // 密码是否必须包含小写字母
  passwordLowercaseLetter?: boolean;
  // 密码是否必须包含大写字母
  passwordUppercaseLetter?: boolean;
  // 密码是否必须包含字母
  passwordLetter?: boolean;
  // 密码是否必须包含数字
  passwordDigit?: boolean;
  // 密码是否必须包含特殊字符
  passwordSpecialChar?: boolean;
  // 是否检查密码有效
  passwordValidCheck?: boolean;
  // 密码有效期
  passwordValidPeriod?: number;
  // 密码过期后是否允许登录
  passwordExpiredLogin?: boolean;
  // 是否检查密码历史
  passwordHistoryCheck?: boolean;
  // 密码历史个数
  passwordHistoryNum?: number;
  // 重试校验是否触发锁定
  verifyAttemptsCheck?: boolean;
  // 重试校验窗口
  verifyAttemptsWindow?: number;
  // 重试校验触发锁定阈值
  verifyAttemptsThreshold?: number;
  // 锁定时间
  lockoutDuration?: number;
  // 是否检查账户活跃
  activeCheck?: boolean;
  // 活跃周期，非活跃时锁定登录
  activePeriod?: number;
  // 是否允许自主管理密码
  passwordSelfManage?: boolean;
  // 是否允许自主管理MFA
  mfaSelfManage?: boolean;
  // 并发登录的ip数量，小于1表示不限制
  concurrentIpCount?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      passwordMinLength: 'password_min_length',
      passwordMaxLength: 'password_max_length',
      passwordLowercaseLetter: 'password_lowercase_letter',
      passwordUppercaseLetter: 'password_uppercase_letter',
      passwordLetter: 'password_letter',
      passwordDigit: 'password_digit',
      passwordSpecialChar: 'password_special_char',
      passwordValidCheck: 'password_valid_check',
      passwordValidPeriod: 'password_valid_period',
      passwordExpiredLogin: 'password_expired_login',
      passwordHistoryCheck: 'password_history_check',
      passwordHistoryNum: 'password_history_num',
      verifyAttemptsCheck: 'verify_attempts_check',
      verifyAttemptsWindow: 'verify_attempts_window',
      verifyAttemptsThreshold: 'verify_attempts_threshold',
      lockoutDuration: 'lockout_duration',
      activeCheck: 'active_check',
      activePeriod: 'active_period',
      passwordSelfManage: 'password_self_manage',
      mfaSelfManage: 'mfa_self_manage',
      concurrentIpCount: 'concurrent_ip_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      passwordMinLength: 'number',
      passwordMaxLength: 'number',
      passwordLowercaseLetter: 'boolean',
      passwordUppercaseLetter: 'boolean',
      passwordLetter: 'boolean',
      passwordDigit: 'boolean',
      passwordSpecialChar: 'boolean',
      passwordValidCheck: 'boolean',
      passwordValidPeriod: 'number',
      passwordExpiredLogin: 'boolean',
      passwordHistoryCheck: 'boolean',
      passwordHistoryNum: 'number',
      verifyAttemptsCheck: 'boolean',
      verifyAttemptsWindow: 'number',
      verifyAttemptsThreshold: 'number',
      lockoutDuration: 'number',
      activeCheck: 'boolean',
      activePeriod: 'number',
      passwordSelfManage: 'boolean',
      mfaSelfManage: 'boolean',
      concurrentIpCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateLoginconfigResponse extends $tea.Model {
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

export class GetMfaStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 用户id
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetMfaStatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // MFA状态, 取值范围：ENABLED, DISABLED
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

export class EnableMfaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 用户 id
  userId: string;
  // 验证码
  verificationCode: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      userId: 'user_id',
      verificationCode: 'verification_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      userId: 'string',
      verificationCode: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class EnableMfaResponse extends $tea.Model {
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

export class DisableMfaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 用户 id
  userId: string;
  // 验证码
  verificationCode?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      userId: 'user_id',
      verificationCode: 'verification_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      userId: 'string',
      verificationCode: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DisableMfaResponse extends $tea.Model {
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

export class InitMfaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 用户 id
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitMfaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 密钥
  secretKey?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      secretKey: 'secret_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      secretKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyMfaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 用户 id
  userId: string;
  // 验证码
  verificationCode: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      userId: 'user_id',
      verificationCode: 'verification_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      userId: 'string',
      verificationCode: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyMfaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 校验结果
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

export class GetMfaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 用户 id
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetMfaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户 id
  userId?: string;
  // MFA状态, 取值范围：ENABLED, DISABLED
  status?: string;
  // 密钥
  secretKey?: string;
  // 最后一次密钥生成时间
  lastGeneratedTime?: string;
  // (校验失败时)重试校验的次数
  verifyAttempts?: number;
  // 第一次校验失败时间
  firstFailureTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      userId: 'user_id',
      status: 'status',
      secretKey: 'secret_key',
      lastGeneratedTime: 'last_generated_time',
      verifyAttempts: 'verify_attempts',
      firstFailureTime: 'first_failure_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      userId: 'string',
      status: 'string',
      secretKey: 'string',
      lastGeneratedTime: 'string',
      verifyAttempts: 'number',
      firstFailureTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateOperatorPasswordRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 登录名
  loginName: string;
  // 加密过的新密码值，使用AccessSecret进行3DES加密
  newEncryptedPassword: string;
  // 加密过的旧密码值，使用AccessSecret进行DES加密
  oldEncryptedPassword: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      loginName: 'login_name',
      newEncryptedPassword: 'new_encrypted_password',
      oldEncryptedPassword: 'old_encrypted_password',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      loginName: 'string',
      newEncryptedPassword: 'string',
      oldEncryptedPassword: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateOperatorPasswordResponse extends $tea.Model {
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

export class ResetOperatorPasswordRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 登录名
  loginName: string;
  // 加密过的新密码值，使用AccessSecret进行3DES加密
  newEncryptedPassword: string;
  // 登录凭证状态，取值范围：NORMAL, EXPIRED
  // 
  // 默认为 NORMAL，设为 EXPIRED 用户登录时会要求重置密码
  status?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      loginName: 'login_name',
      newEncryptedPassword: 'new_encrypted_password',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      loginName: 'string',
      newEncryptedPassword: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ResetOperatorPasswordResponse extends $tea.Model {
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

export class BatchqueryOperatorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 用户id列表
  operatorIds?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operatorIds: 'operator_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operatorIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryOperatorResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作员列表
  operators?: Operator[];
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
      operators: { 'type': 'array', 'itemType': Operator },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushOperationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // {产品}.{资源}.{子资源}.{操作}
  operationCode: string;
  // 操作参数
  params: string;
  // 可用区域信息，非必填
  region?: string;
  // 资源ID
  resourceId?: string;
  // 资源类型
  resourceType?: string;
  // 相应结果
  response?: string;
  // 操作来源，由接入方上报自身系统host
  source?: string;
  // 操作来源IP，由接入方上报
  sourceIpAddress?: string;
  // 触发时间
  time: string;
  // TraceId用于事件追踪
  traceId?: string;
  // agent信息
  userAgent?: string;
  // 用户ID
  userId: string;
  // 租户8位ID
  userTenant: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operationCode: 'operation_code',
      params: 'params',
      region: 'region',
      resourceId: 'resource_id',
      resourceType: 'resource_type',
      response: 'response',
      source: 'source',
      sourceIpAddress: 'source_ip_address',
      time: 'time',
      traceId: 'trace_id',
      userAgent: 'user_agent',
      userId: 'user_id',
      userTenant: 'user_tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operationCode: 'string',
      params: 'string',
      region: 'string',
      resourceId: 'string',
      resourceType: 'string',
      response: 'string',
      source: 'string',
      sourceIpAddress: 'string',
      time: 'string',
      traceId: 'string',
      userAgent: 'string',
      userId: 'string',
      userTenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushOperationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 事件唯一ID
  uniqueId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      uniqueId: 'unique_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      uniqueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOperationtypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 产品码
  product: string;
  // 来源信息
  source?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      product: 'product',
      source: 'source',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      product: 'string',
      source: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOperationtypeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作类型列表
  operationTypes?: OperationType[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      operationTypes: 'operation_types',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      operationTypes: { 'type': 'array', 'itemType': OperationType },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetOperationtypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 操作类型名称
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

export class GetOperationtypeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作类型
  data?: OperationType;
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
      data: OperationType,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddTenantMemberRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 操作员唯一id
  operatorId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operatorId: 'operator_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operatorId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddTenantMemberResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // Accessor关联的AccessKey
  accessKey?: string;
  // Accessor关联的AccessKey的密钥
  accessSecret?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accessKey: 'access_key',
      accessSecret: 'access_secret',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accessKey: 'string',
      accessSecret: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetOperatorLogintokenRequest extends $tea.Model {
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

export class GetOperatorLogintokenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 一次性登录认证 token
  loginToken?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      loginToken: 'login_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      loginToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyTrustloginTokenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 用户ID
  userId: string;
  // 系统来源
  sourceSystem: string;
  // 登录账号
  loginName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      userId: 'user_id',
      sourceSystem: 'source_system',
      loginName: 'login_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      userId: 'string',
      sourceSystem: 'string',
      loginName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyTrustloginTokenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用于登录的token
  accessToken?: string;
  // 用户ID
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accessToken: 'access_token',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accessToken: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyTrustloginTokenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 用户ID
  userId: string;
  // 系统来源
  sourceSystem: string;
  // 申请免密登录时获取的token
  accessToken: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      userId: 'user_id',
      sourceSystem: 'source_system',
      accessToken: 'access_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      userId: 'string',
      sourceSystem: 'string',
      accessToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyTrustloginTokenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户ID
  userId?: string;
  // 验证结果，valid有效，invalid无效
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      userId: 'user_id',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      userId: 'string',
      result: 'string',
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
    if (Util.isUnset(config)) {
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
          sdk_version: "3.13.1",
          _prod_code: "IAM",
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
   * Description: 获取Role
   * Summary: 获取角色
   */
  async getRole(request: GetRoleRequest): Promise<GetRoleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getRoleEx(request, headers, runtime);
  }

  /**
   * Description: 获取Role
   * Summary: 获取角色
   */
  async getRoleEx(request: GetRoleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetRoleResponse> {
    Util.validateModel(request);
    return $tea.cast<GetRoleResponse>(await this.doRequest("1.0", "antcloud.iam.role.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetRoleResponse({}));
  }

  /**
   * Description: 查询授权对象在指定租户下的所有授权策略
   * Summary: 查询授权
   */
  async queryPolicy(request: QueryPolicyRequest): Promise<QueryPolicyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPolicyEx(request, headers, runtime);
  }

  /**
   * Description: 查询授权对象在指定租户下的所有授权策略
   * Summary: 查询授权
   */
  async queryPolicyEx(request: QueryPolicyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPolicyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPolicyResponse>(await this.doRequest("1.0", "antcloud.iam.policy.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPolicyResponse({}));
  }

  /**
   * Description: 查询租户下的权限组
   * Summary: 查询授权组
   */
  async queryGroup(request: QueryGroupRequest): Promise<QueryGroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGroupEx(request, headers, runtime);
  }

  /**
   * Description: 查询租户下的权限组
   * Summary: 查询授权组
   */
  async queryGroupEx(request: QueryGroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGroupResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGroupResponse>(await this.doRequest("1.0", "antcloud.iam.group.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGroupResponse({}));
  }

  /**
   * Description: 创建授权策略
   * Summary: 创建授权策略
   */
  async createPolicy(request: CreatePolicyRequest): Promise<CreatePolicyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createPolicyEx(request, headers, runtime);
  }

  /**
   * Description: 创建授权策略
   * Summary: 创建授权策略
   */
  async createPolicyEx(request: CreatePolicyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreatePolicyResponse> {
    Util.validateModel(request);
    return $tea.cast<CreatePolicyResponse>(await this.doRequest("1.0", "antcloud.iam.policy.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreatePolicyResponse({}));
  }

  /**
   * Description: 删除授权策略
   * Summary: 删除授权策略
   */
  async deletePolicy(request: DeletePolicyRequest): Promise<DeletePolicyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deletePolicyEx(request, headers, runtime);
  }

  /**
   * Description: 删除授权策略
   * Summary: 删除授权策略
   */
  async deletePolicyEx(request: DeletePolicyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeletePolicyResponse> {
    Util.validateModel(request);
    return $tea.cast<DeletePolicyResponse>(await this.doRequest("1.0", "antcloud.iam.policy.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeletePolicyResponse({}));
  }

  /**
   * Description: 授权策略赋予某个对象
   * Summary: 添加授权
   */
  async attachPolicy(request: AttachPolicyRequest): Promise<AttachPolicyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.attachPolicyEx(request, headers, runtime);
  }

  /**
   * Description: 授权策略赋予某个对象
   * Summary: 添加授权
   */
  async attachPolicyEx(request: AttachPolicyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AttachPolicyResponse> {
    Util.validateModel(request);
    return $tea.cast<AttachPolicyResponse>(await this.doRequest("1.0", "antcloud.iam.policy.attach", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AttachPolicyResponse({}));
  }

  /**
   * Description: 解除授权对象的授权策略
   * Summary: 解除授权
   */
  async detachPolicy(request: DetachPolicyRequest): Promise<DetachPolicyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detachPolicyEx(request, headers, runtime);
  }

  /**
   * Description: 解除授权对象的授权策略
   * Summary: 解除授权
   */
  async detachPolicyEx(request: DetachPolicyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetachPolicyResponse> {
    Util.validateModel(request);
    return $tea.cast<DetachPolicyResponse>(await this.doRequest("1.0", "antcloud.iam.policy.detach", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetachPolicyResponse({}));
  }

  /**
   * Description: 查询授权对象在指定租户下的所有授权策略,如果是操作员，包含其所在组的授权
   * Summary: 查询授权
   */
  async listPolicy(request: ListPolicyRequest): Promise<ListPolicyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listPolicyEx(request, headers, runtime);
  }

  /**
   * Description: 查询授权对象在指定租户下的所有授权策略,如果是操作员，包含其所在组的授权
   * Summary: 查询授权
   */
  async listPolicyEx(request: ListPolicyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListPolicyResponse> {
    Util.validateModel(request);
    return $tea.cast<ListPolicyResponse>(await this.doRequest("1.0", "antcloud.iam.policy.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListPolicyResponse({}));
  }

  /**
   * Description: 授权对象的权限校验
   * Summary: 校验权限
   */
  async judgeAuthority(request: JudgeAuthorityRequest): Promise<JudgeAuthorityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.judgeAuthorityEx(request, headers, runtime);
  }

  /**
   * Description: 授权对象的权限校验
   * Summary: 校验权限
   */
  async judgeAuthorityEx(request: JudgeAuthorityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<JudgeAuthorityResponse> {
    Util.validateModel(request);
    return $tea.cast<JudgeAuthorityResponse>(await this.doRequest("1.0", "antcloud.iam.authority.judge", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new JudgeAuthorityResponse({}));
  }

  /**
   * Description: 添加产品操作元数据
   * Summary: 创建产品操作点
   */
  async createProductAction(request: CreateProductActionRequest): Promise<CreateProductActionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createProductActionEx(request, headers, runtime);
  }

  /**
   * Description: 添加产品操作元数据
   * Summary: 创建产品操作点
   */
  async createProductActionEx(request: CreateProductActionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateProductActionResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateProductActionResponse>(await this.doRequest("1.0", "antcloud.iam.product.action.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateProductActionResponse({}));
  }

  /**
   * Description: 校验token合法性
   * Summary: 校验token合法性
   */
  async verifyOauthToken(request: VerifyOauthTokenRequest): Promise<VerifyOauthTokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyOauthTokenEx(request, headers, runtime);
  }

  /**
   * Description: 校验token合法性
   * Summary: 校验token合法性
   */
  async verifyOauthTokenEx(request: VerifyOauthTokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyOauthTokenResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyOauthTokenResponse>(await this.doRequest("1.0", "antcloud.iam.oauth.token.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyOauthTokenResponse({}));
  }

  /**
   * Description: 校验中枢登录态合法性
   * Summary: 校验中枢登录态合法性
   */
  async verifySessionToken(request: VerifySessionTokenRequest): Promise<VerifySessionTokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifySessionTokenEx(request, headers, runtime);
  }

  /**
   * Description: 校验中枢登录态合法性
   * Summary: 校验中枢登录态合法性
   */
  async verifySessionTokenEx(request: VerifySessionTokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifySessionTokenResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifySessionTokenResponse>(await this.doRequest("1.0", "antcloud.iam.session.token.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifySessionTokenResponse({}));
  }

  /**
   * Description: 获取授予角色的操作员列表
   * Summary: 授予角色的操作员列表
   */
  async listRoleOperator(request: ListRoleOperatorRequest): Promise<ListRoleOperatorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listRoleOperatorEx(request, headers, runtime);
  }

  /**
   * Description: 获取授予角色的操作员列表
   * Summary: 授予角色的操作员列表
   */
  async listRoleOperatorEx(request: ListRoleOperatorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListRoleOperatorResponse> {
    Util.validateModel(request);
    return $tea.cast<ListRoleOperatorResponse>(await this.doRequest("1.0", "antcloud.iam.role.operator.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListRoleOperatorResponse({}));
  }

  /**
   * Description: 申请信任登录URL
   * Summary: 申请信任登录URL
   */
  async applyTrustloginUrl(request: ApplyTrustloginUrlRequest): Promise<ApplyTrustloginUrlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyTrustloginUrlEx(request, headers, runtime);
  }

  /**
   * Description: 申请信任登录URL
   * Summary: 申请信任登录URL
   */
  async applyTrustloginUrlEx(request: ApplyTrustloginUrlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyTrustloginUrlResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyTrustloginUrlResponse>(await this.doRequest("1.0", "antcloud.iam.trustlogin.url.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyTrustloginUrlResponse({}));
  }

  /**
   * Description: 扮演虚拟身份，获取安全令牌
   * Summary: 扮演虚拟身份，获取安全令牌
   */
  async assumeSts(request: AssumeStsRequest): Promise<AssumeStsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.assumeStsEx(request, headers, runtime);
  }

  /**
   * Description: 扮演虚拟身份，获取安全令牌
   * Summary: 扮演虚拟身份，获取安全令牌
   */
  async assumeStsEx(request: AssumeStsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AssumeStsResponse> {
    Util.validateModel(request);
    return $tea.cast<AssumeStsResponse>(await this.doRequest("1.0", "antcloud.iam.sts.assume", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AssumeStsResponse({}));
  }

  /**
   * Description: 创建虚拟身份
   * Summary: 创建虚拟身份
   */
  async createStsActor(request: CreateStsActorRequest): Promise<CreateStsActorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createStsActorEx(request, headers, runtime);
  }

  /**
   * Description: 创建虚拟身份
   * Summary: 创建虚拟身份
   */
  async createStsActorEx(request: CreateStsActorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateStsActorResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateStsActorResponse>(await this.doRequest("1.0", "antcloud.iam.sts.actor.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateStsActorResponse({}));
  }

  /**
   * Description: 删除虚拟身份
   * Summary: 删除虚拟身份
   */
  async deleteStsActor(request: DeleteStsActorRequest): Promise<DeleteStsActorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteStsActorEx(request, headers, runtime);
  }

  /**
   * Description: 删除虚拟身份
   * Summary: 删除虚拟身份
   */
  async deleteStsActorEx(request: DeleteStsActorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteStsActorResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteStsActorResponse>(await this.doRequest("1.0", "antcloud.iam.sts.actor.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteStsActorResponse({}));
  }

  /**
   * Description: 唯一查询虚拟身份
   * Summary: 唯一查询虚拟身份
   */
  async getStsActor(request: GetStsActorRequest): Promise<GetStsActorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getStsActorEx(request, headers, runtime);
  }

  /**
   * Description: 唯一查询虚拟身份
   * Summary: 唯一查询虚拟身份
   */
  async getStsActorEx(request: GetStsActorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetStsActorResponse> {
    Util.validateModel(request);
    return $tea.cast<GetStsActorResponse>(await this.doRequest("1.0", "antcloud.iam.sts.actor.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetStsActorResponse({}));
  }

  /**
   * Description: 获取租户内的虚拟身份
   * Summary: 获取租户内的虚拟身份
   */
  async listStsActor(request: ListStsActorRequest): Promise<ListStsActorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listStsActorEx(request, headers, runtime);
  }

  /**
   * Description: 获取租户内的虚拟身份
   * Summary: 获取租户内的虚拟身份
   */
  async listStsActorEx(request: ListStsActorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListStsActorResponse> {
    Util.validateModel(request);
    return $tea.cast<ListStsActorResponse>(await this.doRequest("1.0", "antcloud.iam.sts.actor.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListStsActorResponse({}));
  }

  /**
   * Description: 更新虚拟身份
   * Summary: 更新虚拟身份
   */
  async updateStsActor(request: UpdateStsActorRequest): Promise<UpdateStsActorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateStsActorEx(request, headers, runtime);
  }

  /**
   * Description: 更新虚拟身份
   * Summary: 更新虚拟身份
   */
  async updateStsActorEx(request: UpdateStsActorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateStsActorResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateStsActorResponse>(await this.doRequest("1.0", "antcloud.iam.sts.actor.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateStsActorResponse({}));
  }

  /**
   * Description: 查询租户内可见的角色
   * Summary: 角色查询
   */
  async queryRole(request: QueryRoleRequest): Promise<QueryRoleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRoleEx(request, headers, runtime);
  }

  /**
   * Description: 查询租户内可见的角色
   * Summary: 角色查询
   */
  async queryRoleEx(request: QueryRoleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRoleResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRoleResponse>(await this.doRequest("1.0", "antcloud.iam.role.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRoleResponse({}));
  }

  /**
   * Description: 获取租户Iaas账号基本信息
   * Summary: 获取租户Iaas账号基本信息
   */
  async getIaasaccountBaseinfo(request: GetIaasaccountBaseinfoRequest): Promise<GetIaasaccountBaseinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getIaasaccountBaseinfoEx(request, headers, runtime);
  }

  /**
   * Description: 获取租户Iaas账号基本信息
   * Summary: 获取租户Iaas账号基本信息
   */
  async getIaasaccountBaseinfoEx(request: GetIaasaccountBaseinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetIaasaccountBaseinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<GetIaasaccountBaseinfoResponse>(await this.doRequest("1.0", "antcloud.iam.iaasaccount.baseinfo.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetIaasaccountBaseinfoResponse({}));
  }

  /**
   * Description: 内部接口，用于校验密码是否正确，公有云环境只适用于操作员
   * Summary: 校验密码是否正确
   */
  async verifyPassword(request: VerifyPasswordRequest): Promise<VerifyPasswordResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyPasswordEx(request, headers, runtime);
  }

  /**
   * Description: 内部接口，用于校验密码是否正确，公有云环境只适用于操作员
   * Summary: 校验密码是否正确
   */
  async verifyPasswordEx(request: VerifyPasswordRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyPasswordResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyPasswordResponse>(await this.doRequest("1.0", "antcloud.iam.password.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyPasswordResponse({}));
  }

  /**
   * Description: 更显操作员状态，NORMAL为正常状态，FROZEN为冻结状态，INACTIVE为未激活状态
   * Summary: 更新操作员状态
   */
  async updateOperatorStatus(request: UpdateOperatorStatusRequest): Promise<UpdateOperatorStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateOperatorStatusEx(request, headers, runtime);
  }

  /**
   * Description: 更显操作员状态，NORMAL为正常状态，FROZEN为冻结状态，INACTIVE为未激活状态
   * Summary: 更新操作员状态
   */
  async updateOperatorStatusEx(request: UpdateOperatorStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateOperatorStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateOperatorStatusResponse>(await this.doRequest("1.0", "antcloud.iam.operator.status.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateOperatorStatusResponse({}));
  }

  /**
   * Description: 冻结操作员
   * Summary: 冻结操作员
   */
  async freezeOperator(request: FreezeOperatorRequest): Promise<FreezeOperatorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.freezeOperatorEx(request, headers, runtime);
  }

  /**
   * Description: 冻结操作员
   * Summary: 冻结操作员
   */
  async freezeOperatorEx(request: FreezeOperatorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<FreezeOperatorResponse> {
    Util.validateModel(request);
    return $tea.cast<FreezeOperatorResponse>(await this.doRequest("1.0", "antcloud.iam.operator.freeze", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new FreezeOperatorResponse({}));
  }

  /**
   * Description: 解冻操作员
   * Summary: 解冻操作员
   */
  async unfreezeOperator(request: UnfreezeOperatorRequest): Promise<UnfreezeOperatorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.unfreezeOperatorEx(request, headers, runtime);
  }

  /**
   * Description: 解冻操作员
   * Summary: 解冻操作员
   */
  async unfreezeOperatorEx(request: UnfreezeOperatorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UnfreezeOperatorResponse> {
    Util.validateModel(request);
    return $tea.cast<UnfreezeOperatorResponse>(await this.doRequest("1.0", "antcloud.iam.operator.unfreeze", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UnfreezeOperatorResponse({}));
  }

  /**
   * Description: 获取主账号信息
   * Summary: 获取主账号信息
   */
  async getInternalMaster(request: GetInternalMasterRequest): Promise<GetInternalMasterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getInternalMasterEx(request, headers, runtime);
  }

  /**
   * Description: 获取主账号信息
   * Summary: 获取主账号信息
   */
  async getInternalMasterEx(request: GetInternalMasterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetInternalMasterResponse> {
    Util.validateModel(request);
    return $tea.cast<GetInternalMasterResponse>(await this.doRequest("1.0", "antcloud.iam.internal.master.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetInternalMasterResponse({}));
  }

  /**
   * Description: 公有云一方化场景下，获取用户信息，内部接口，专为一方化设计
   * Summary: 获取阿里云用户信息
   */
  async getAliyunUser(request: GetAliyunUserRequest): Promise<GetAliyunUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAliyunUserEx(request, headers, runtime);
  }

  /**
   * Description: 公有云一方化场景下，获取用户信息，内部接口，专为一方化设计
   * Summary: 获取阿里云用户信息
   */
  async getAliyunUserEx(request: GetAliyunUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAliyunUserResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAliyunUserResponse>(await this.doRequest("1.0", "antcloud.iam.aliyun.user.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAliyunUserResponse({}));
  }

  /**
   * Description: 阿里云RAM权限校验
   * Summary: 阿里云RAM权限校验
   */
  async judgeAliyunAuthority(request: JudgeAliyunAuthorityRequest): Promise<JudgeAliyunAuthorityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.judgeAliyunAuthorityEx(request, headers, runtime);
  }

  /**
   * Description: 阿里云RAM权限校验
   * Summary: 阿里云RAM权限校验
   */
  async judgeAliyunAuthorityEx(request: JudgeAliyunAuthorityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<JudgeAliyunAuthorityResponse> {
    Util.validateModel(request);
    return $tea.cast<JudgeAliyunAuthorityResponse>(await this.doRequest("1.0", "antcloud.iam.aliyun.authority.judge", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new JudgeAliyunAuthorityResponse({}));
  }

  /**
   * Description: 根据登录态获取ak
   * Summary: 根据登录态获取ak
   */
  async getSessionAccessor(request: GetSessionAccessorRequest): Promise<GetSessionAccessorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getSessionAccessorEx(request, headers, runtime);
  }

  /**
   * Description: 根据登录态获取ak
   * Summary: 根据登录态获取ak
   */
  async getSessionAccessorEx(request: GetSessionAccessorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetSessionAccessorResponse> {
    Util.validateModel(request);
    return $tea.cast<GetSessionAccessorResponse>(await this.doRequest("1.0", "antcloud.iam.session.accessor.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetSessionAccessorResponse({}));
  }

  /**
   * Description: 更新密码
   * Summary: 更新密码
   */
  async updatePassword(request: UpdatePasswordRequest): Promise<UpdatePasswordResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updatePasswordEx(request, headers, runtime);
  }

  /**
   * Description: 更新密码
   * Summary: 更新密码
   */
  async updatePasswordEx(request: UpdatePasswordRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdatePasswordResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdatePasswordResponse>(await this.doRequest("1.0", "antcloud.iam.password.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdatePasswordResponse({}));
  }

  /**
   * Description: 蚂蚁侧批量鉴权
   * Summary: 蚂蚁侧批量鉴权
   */
  async judgeMultiauthority(request: JudgeMultiauthorityRequest): Promise<JudgeMultiauthorityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.judgeMultiauthorityEx(request, headers, runtime);
  }

  /**
   * Description: 蚂蚁侧批量鉴权
   * Summary: 蚂蚁侧批量鉴权
   */
  async judgeMultiauthorityEx(request: JudgeMultiauthorityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<JudgeMultiauthorityResponse> {
    Util.validateModel(request);
    return $tea.cast<JudgeMultiauthorityResponse>(await this.doRequest("1.0", "antcloud.iam.multiauthority.judge", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new JudgeMultiauthorityResponse({}));
  }

  /**
   * Description: 阿里云批量鉴权
   * Summary: 阿里云批量鉴权
   */
  async judgeAliyunMultiauthority(request: JudgeAliyunMultiauthorityRequest): Promise<JudgeAliyunMultiauthorityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.judgeAliyunMultiauthorityEx(request, headers, runtime);
  }

  /**
   * Description: 阿里云批量鉴权
   * Summary: 阿里云批量鉴权
   */
  async judgeAliyunMultiauthorityEx(request: JudgeAliyunMultiauthorityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<JudgeAliyunMultiauthorityResponse> {
    Util.validateModel(request);
    return $tea.cast<JudgeAliyunMultiauthorityResponse>(await this.doRequest("1.0", "antcloud.iam.aliyun.multiauthority.judge", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new JudgeAliyunMultiauthorityResponse({}));
  }

  /**
   * Description: 辰霖
   * Summary: 获取当前AK关联的用户实体信息
   */
  async getAccessorCurrent(request: GetAccessorCurrentRequest): Promise<GetAccessorCurrentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAccessorCurrentEx(request, headers, runtime);
  }

  /**
   * Description: 辰霖
   * Summary: 获取当前AK关联的用户实体信息
   */
  async getAccessorCurrentEx(request: GetAccessorCurrentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAccessorCurrentResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAccessorCurrentResponse>(await this.doRequest("1.0", "antcloud.iam.accessor.current.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAccessorCurrentResponse({}));
  }

  /**
   * Description: 获取单个服务账号信息
   * Summary: 获取单个服务账号信息
   */
  async getServiceaccount(request: GetServiceaccountRequest): Promise<GetServiceaccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getServiceaccountEx(request, headers, runtime);
  }

  /**
   * Description: 获取单个服务账号信息
   * Summary: 获取单个服务账号信息
   */
  async getServiceaccountEx(request: GetServiceaccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetServiceaccountResponse> {
    Util.validateModel(request);
    return $tea.cast<GetServiceaccountResponse>(await this.doRequest("1.0", "antcloud.iam.serviceaccount.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetServiceaccountResponse({}));
  }

  /**
   * Description: 创建服务账号
   * Summary: 创建服务账号
   */
  async createServiceaccount(request: CreateServiceaccountRequest): Promise<CreateServiceaccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createServiceaccountEx(request, headers, runtime);
  }

  /**
   * Description: 创建服务账号
   * Summary: 创建服务账号
   */
  async createServiceaccountEx(request: CreateServiceaccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateServiceaccountResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateServiceaccountResponse>(await this.doRequest("1.0", "antcloud.iam.serviceaccount.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateServiceaccountResponse({}));
  }

  /**
   * Description: 删除服务账号
   * Summary: 删除服务账号
   */
  async deleteServiceaccount(request: DeleteServiceaccountRequest): Promise<DeleteServiceaccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteServiceaccountEx(request, headers, runtime);
  }

  /**
   * Description: 删除服务账号
   * Summary: 删除服务账号
   */
  async deleteServiceaccountEx(request: DeleteServiceaccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteServiceaccountResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteServiceaccountResponse>(await this.doRequest("1.0", "antcloud.iam.serviceaccount.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteServiceaccountResponse({}));
  }

  /**
   * Description: 更新服务账号信息
   * Summary: 更新服务账号信息
   */
  async updateServiceaccount(request: UpdateServiceaccountRequest): Promise<UpdateServiceaccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateServiceaccountEx(request, headers, runtime);
  }

  /**
   * Description: 更新服务账号信息
   * Summary: 更新服务账号信息
   */
  async updateServiceaccountEx(request: UpdateServiceaccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateServiceaccountResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateServiceaccountResponse>(await this.doRequest("1.0", "antcloud.iam.serviceaccount.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateServiceaccountResponse({}));
  }

  /**
   * Description: 移除租户成员
   * Summary: 移除租户成员
   */
  async removeTenantMember(request: RemoveTenantMemberRequest): Promise<RemoveTenantMemberResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.removeTenantMemberEx(request, headers, runtime);
  }

  /**
   * Description: 移除租户成员
   * Summary: 移除租户成员
   */
  async removeTenantMemberEx(request: RemoveTenantMemberRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RemoveTenantMemberResponse> {
    Util.validateModel(request);
    return $tea.cast<RemoveTenantMemberResponse>(await this.doRequest("1.0", "antcloud.iam.tenant.member.remove", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RemoveTenantMemberResponse({}));
  }

  /**
   * Description: 创建成员组
   * Summary: 创建成员组
   */
  async createGroup(request: CreateGroupRequest): Promise<CreateGroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createGroupEx(request, headers, runtime);
  }

  /**
   * Description: 创建成员组
   * Summary: 创建成员组
   */
  async createGroupEx(request: CreateGroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateGroupResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateGroupResponse>(await this.doRequest("1.0", "antcloud.iam.group.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateGroupResponse({}));
  }

  /**
   * Description: 删除成员组
   * Summary: 删除成员组
   */
  async deleteGroup(request: DeleteGroupRequest): Promise<DeleteGroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteGroupEx(request, headers, runtime);
  }

  /**
   * Description: 删除成员组
   * Summary: 删除成员组
   */
  async deleteGroupEx(request: DeleteGroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteGroupResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteGroupResponse>(await this.doRequest("1.0", "antcloud.iam.group.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteGroupResponse({}));
  }

  /**
   * Description: 更新成员组
   * Summary: 更新成员组
   */
  async updateGroup(request: UpdateGroupRequest): Promise<UpdateGroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateGroupEx(request, headers, runtime);
  }

  /**
   * Description: 更新成员组
   * Summary: 更新成员组
   */
  async updateGroupEx(request: UpdateGroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateGroupResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateGroupResponse>(await this.doRequest("1.0", "antcloud.iam.group.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateGroupResponse({}));
  }

  /**
   * Description: 添加成员组成员
   * Summary: 添加成员组成员
   */
  async addGroupMember(request: AddGroupMemberRequest): Promise<AddGroupMemberResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addGroupMemberEx(request, headers, runtime);
  }

  /**
   * Description: 添加成员组成员
   * Summary: 添加成员组成员
   */
  async addGroupMemberEx(request: AddGroupMemberRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddGroupMemberResponse> {
    Util.validateModel(request);
    return $tea.cast<AddGroupMemberResponse>(await this.doRequest("1.0", "antcloud.iam.group.member.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddGroupMemberResponse({}));
  }

  /**
   * Description: 移除成员组成员
   * Summary: 移除成员组成员
   */
  async removeGroupMember(request: RemoveGroupMemberRequest): Promise<RemoveGroupMemberResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.removeGroupMemberEx(request, headers, runtime);
  }

  /**
   * Description: 移除成员组成员
   * Summary: 移除成员组成员
   */
  async removeGroupMemberEx(request: RemoveGroupMemberRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RemoveGroupMemberResponse> {
    Util.validateModel(request);
    return $tea.cast<RemoveGroupMemberResponse>(await this.doRequest("1.0", "antcloud.iam.group.member.remove", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RemoveGroupMemberResponse({}));
  }

  /**
   * Description: 成员组基本信息查询
   * Summary: 成员组基本信息查询
   */
  async getGroup(request: GetGroupRequest): Promise<GetGroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getGroupEx(request, headers, runtime);
  }

  /**
   * Description: 成员组基本信息查询
   * Summary: 成员组基本信息查询
   */
  async getGroupEx(request: GetGroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetGroupResponse> {
    Util.validateModel(request);
    return $tea.cast<GetGroupResponse>(await this.doRequest("1.0", "antcloud.iam.group.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetGroupResponse({}));
  }

  /**
   * Description: 成员组成员查询
   * Summary: 成员组成员查询
   */
  async queryGroupMember(request: QueryGroupMemberRequest): Promise<QueryGroupMemberResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGroupMemberEx(request, headers, runtime);
  }

  /**
   * Description: 成员组成员查询
   * Summary: 成员组成员查询
   */
  async queryGroupMemberEx(request: QueryGroupMemberRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGroupMemberResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGroupMemberResponse>(await this.doRequest("1.0", "antcloud.iam.group.member.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGroupMemberResponse({}));
  }

  /**
   * Description: 获取用户所在成员组
   * Summary: 获取用户所在成员组
   */
  async listOperatorGroup(request: ListOperatorGroupRequest): Promise<ListOperatorGroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listOperatorGroupEx(request, headers, runtime);
  }

  /**
   * Description: 获取用户所在成员组
   * Summary: 获取用户所在成员组
   */
  async listOperatorGroupEx(request: ListOperatorGroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListOperatorGroupResponse> {
    Util.validateModel(request);
    return $tea.cast<ListOperatorGroupResponse>(await this.doRequest("1.0", "antcloud.iam.operator.group.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListOperatorGroupResponse({}));
  }

  /**
   * Description: 为角色添加权限码
   * Summary: 为角色添加权限码
   */
  async addRoleAction(request: AddRoleActionRequest): Promise<AddRoleActionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addRoleActionEx(request, headers, runtime);
  }

  /**
   * Description: 为角色添加权限码
   * Summary: 为角色添加权限码
   */
  async addRoleActionEx(request: AddRoleActionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddRoleActionResponse> {
    Util.validateModel(request);
    return $tea.cast<AddRoleActionResponse>(await this.doRequest("1.0", "antcloud.iam.role.action.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddRoleActionResponse({}));
  }

  /**
   * Description: 移除角色权限
   * Summary: 移除角色权限
   */
  async removeRoleAction(request: RemoveRoleActionRequest): Promise<RemoveRoleActionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.removeRoleActionEx(request, headers, runtime);
  }

  /**
   * Description: 移除角色权限
   * Summary: 移除角色权限
   */
  async removeRoleActionEx(request: RemoveRoleActionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RemoveRoleActionResponse> {
    Util.validateModel(request);
    return $tea.cast<RemoveRoleActionResponse>(await this.doRequest("1.0", "antcloud.iam.role.action.remove", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RemoveRoleActionResponse({}));
  }

  /**
   * Description: 创建自定义角色
   * Summary: 创建自定义角色
   */
  async createRole(request: CreateRoleRequest): Promise<CreateRoleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createRoleEx(request, headers, runtime);
  }

  /**
   * Description: 创建自定义角色
   * Summary: 创建自定义角色
   */
  async createRoleEx(request: CreateRoleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateRoleResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateRoleResponse>(await this.doRequest("1.0", "antcloud.iam.role.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateRoleResponse({}));
  }

  /**
   * Description: 删除角色
   * Summary: 删除角色
   */
  async deleteRole(request: DeleteRoleRequest): Promise<DeleteRoleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteRoleEx(request, headers, runtime);
  }

  /**
   * Description: 删除角色
   * Summary: 删除角色
   */
  async deleteRoleEx(request: DeleteRoleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteRoleResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteRoleResponse>(await this.doRequest("1.0", "antcloud.iam.role.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteRoleResponse({}));
  }

  /**
   * Description: 更新角色
   * Summary: 更新角色
   */
  async updateRole(request: UpdateRoleRequest): Promise<UpdateRoleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateRoleEx(request, headers, runtime);
  }

  /**
   * Description: 更新角色
   * Summary: 更新角色
   */
  async updateRoleEx(request: UpdateRoleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateRoleResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateRoleResponse>(await this.doRequest("1.0", "antcloud.iam.role.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateRoleResponse({}));
  }

  /**
   * Description: 获取单个部门信息
   * Summary: 获取单个部门信息
   */
  async getDepartment(request: GetDepartmentRequest): Promise<GetDepartmentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDepartmentEx(request, headers, runtime);
  }

  /**
   * Description: 获取单个部门信息
   * Summary: 获取单个部门信息
   */
  async getDepartmentEx(request: GetDepartmentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDepartmentResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDepartmentResponse>(await this.doRequest("1.0", "antcloud.iam.department.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDepartmentResponse({}));
  }

  /**
   * Description: 创建部门
   * Summary: 创建部门
   */
  async createDepartment(request: CreateDepartmentRequest): Promise<CreateDepartmentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDepartmentEx(request, headers, runtime);
  }

  /**
   * Description: 创建部门
   * Summary: 创建部门
   */
  async createDepartmentEx(request: CreateDepartmentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDepartmentResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDepartmentResponse>(await this.doRequest("1.0", "antcloud.iam.department.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDepartmentResponse({}));
  }

  /**
   * Description: 更新部门信息
   * Summary: 更新部门信息
   */
  async updateDepartment(request: UpdateDepartmentRequest): Promise<UpdateDepartmentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateDepartmentEx(request, headers, runtime);
  }

  /**
   * Description: 更新部门信息
   * Summary: 更新部门信息
   */
  async updateDepartmentEx(request: UpdateDepartmentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateDepartmentResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDepartmentResponse>(await this.doRequest("1.0", "antcloud.iam.department.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateDepartmentResponse({}));
  }

  /**
   * Description: 删除部门
   * Summary: 删除部门
   */
  async deleteDepartment(request: DeleteDepartmentRequest): Promise<DeleteDepartmentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteDepartmentEx(request, headers, runtime);
  }

  /**
   * Description: 删除部门
   * Summary: 删除部门
   */
  async deleteDepartmentEx(request: DeleteDepartmentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteDepartmentResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteDepartmentResponse>(await this.doRequest("1.0", "antcloud.iam.department.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteDepartmentResponse({}));
  }

  /**
   * Description: 分页查询部门信息
   * Summary: 分页查询部门信息
   */
  async pagequeryDepartment(request: PagequeryDepartmentRequest): Promise<PagequeryDepartmentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryDepartmentEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询部门信息
   * Summary: 分页查询部门信息
   */
  async pagequeryDepartmentEx(request: PagequeryDepartmentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryDepartmentResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryDepartmentResponse>(await this.doRequest("1.0", "antcloud.iam.department.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryDepartmentResponse({}));
  }

  /**
   * Description: 批量查询部门
   * Summary: 批量查询部门
   */
  async batchqueryDepartment(request: BatchqueryDepartmentRequest): Promise<BatchqueryDepartmentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryDepartmentEx(request, headers, runtime);
  }

  /**
   * Description: 批量查询部门
   * Summary: 批量查询部门
   */
  async batchqueryDepartmentEx(request: BatchqueryDepartmentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryDepartmentResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryDepartmentResponse>(await this.doRequest("1.0", "antcloud.iam.department.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryDepartmentResponse({}));
  }

  /**
   * Description: 添加或更新部门成员
   * Summary: 添加或更新部门成员
   */
  async saveDepartmentUser(request: SaveDepartmentUserRequest): Promise<SaveDepartmentUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveDepartmentUserEx(request, headers, runtime);
  }

  /**
   * Description: 添加或更新部门成员
   * Summary: 添加或更新部门成员
   */
  async saveDepartmentUserEx(request: SaveDepartmentUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveDepartmentUserResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveDepartmentUserResponse>(await this.doRequest("1.0", "antcloud.iam.department.user.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveDepartmentUserResponse({}));
  }

  /**
   * Description: 移除部门成员
   * Summary: 移除部门成员
   */
  async removeDepartmentUser(request: RemoveDepartmentUserRequest): Promise<RemoveDepartmentUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.removeDepartmentUserEx(request, headers, runtime);
  }

  /**
   * Description: 移除部门成员
   * Summary: 移除部门成员
   */
  async removeDepartmentUserEx(request: RemoveDepartmentUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RemoveDepartmentUserResponse> {
    Util.validateModel(request);
    return $tea.cast<RemoveDepartmentUserResponse>(await this.doRequest("1.0", "antcloud.iam.department.user.remove", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RemoveDepartmentUserResponse({}));
  }

  /**
   * Description: 分页查询部门成员信息
   * Summary: 分页查询部门成员信息
   */
  async queryDepartmentUser(request: QueryDepartmentUserRequest): Promise<QueryDepartmentUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDepartmentUserEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询部门成员信息
   * Summary: 分页查询部门成员信息
   */
  async queryDepartmentUserEx(request: QueryDepartmentUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDepartmentUserResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDepartmentUserResponse>(await this.doRequest("1.0", "antcloud.iam.department.user.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDepartmentUserResponse({}));
  }

  /**
   * Description: 获取租户级安全设置
   * Summary: 获取租户级安全设置
   */
  async getLoginconfig(request: GetLoginconfigRequest): Promise<GetLoginconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getLoginconfigEx(request, headers, runtime);
  }

  /**
   * Description: 获取租户级安全设置
   * Summary: 获取租户级安全设置
   */
  async getLoginconfigEx(request: GetLoginconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetLoginconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<GetLoginconfigResponse>(await this.doRequest("1.0", "antcloud.iam.loginconfig.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetLoginconfigResponse({}));
  }

  /**
   * Description: 更新租户级安全设置
   * Summary: 更新租户级安全设置
   */
  async updateLoginconfig(request: UpdateLoginconfigRequest): Promise<UpdateLoginconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateLoginconfigEx(request, headers, runtime);
  }

  /**
   * Description: 更新租户级安全设置
   * Summary: 更新租户级安全设置
   */
  async updateLoginconfigEx(request: UpdateLoginconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateLoginconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateLoginconfigResponse>(await this.doRequest("1.0", "antcloud.iam.loginconfig.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateLoginconfigResponse({}));
  }

  /**
   * Description: 唯一条件查询MFA状态
   * Summary: 唯一条件查询MFA状态
   */
  async getMfaStatus(request: GetMfaStatusRequest): Promise<GetMfaStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getMfaStatusEx(request, headers, runtime);
  }

  /**
   * Description: 唯一条件查询MFA状态
   * Summary: 唯一条件查询MFA状态
   */
  async getMfaStatusEx(request: GetMfaStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetMfaStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<GetMfaStatusResponse>(await this.doRequest("1.0", "antcloud.iam.mfa.status.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetMfaStatusResponse({}));
  }

  /**
   * Description: 开启MFA
   * Summary: 开启MFA
   */
  async enableMfa(request: EnableMfaRequest): Promise<EnableMfaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.enableMfaEx(request, headers, runtime);
  }

  /**
   * Description: 开启MFA
   * Summary: 开启MFA
   */
  async enableMfaEx(request: EnableMfaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<EnableMfaResponse> {
    Util.validateModel(request);
    return $tea.cast<EnableMfaResponse>(await this.doRequest("1.0", "antcloud.iam.mfa.enable", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new EnableMfaResponse({}));
  }

  /**
   * Description: 关闭MFA
   * Summary: 关闭MFA
   */
  async disableMfa(request: DisableMfaRequest): Promise<DisableMfaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.disableMfaEx(request, headers, runtime);
  }

  /**
   * Description: 关闭MFA
   * Summary: 关闭MFA
   */
  async disableMfaEx(request: DisableMfaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DisableMfaResponse> {
    Util.validateModel(request);
    return $tea.cast<DisableMfaResponse>(await this.doRequest("1.0", "antcloud.iam.mfa.disable", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DisableMfaResponse({}));
  }

  /**
   * Description: 初始化MFA
   * Summary: 初始化MFA
   */
  async initMfa(request: InitMfaRequest): Promise<InitMfaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initMfaEx(request, headers, runtime);
  }

  /**
   * Description: 初始化MFA
   * Summary: 初始化MFA
   */
  async initMfaEx(request: InitMfaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitMfaResponse> {
    Util.validateModel(request);
    return $tea.cast<InitMfaResponse>(await this.doRequest("1.0", "antcloud.iam.mfa.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitMfaResponse({}));
  }

  /**
   * Description: 校验 MFA
   * Summary: 校验 MFA
   */
  async verifyMfa(request: VerifyMfaRequest): Promise<VerifyMfaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyMfaEx(request, headers, runtime);
  }

  /**
   * Description: 校验 MFA
   * Summary: 校验 MFA
   */
  async verifyMfaEx(request: VerifyMfaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyMfaResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyMfaResponse>(await this.doRequest("1.0", "antcloud.iam.mfa.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyMfaResponse({}));
  }

  /**
   * Description: 唯一条件查询MFA配置
   * Summary: 唯一条件查询MFA配置
   */
  async getMfa(request: GetMfaRequest): Promise<GetMfaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getMfaEx(request, headers, runtime);
  }

  /**
   * Description: 唯一条件查询MFA配置
   * Summary: 唯一条件查询MFA配置
   */
  async getMfaEx(request: GetMfaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetMfaResponse> {
    Util.validateModel(request);
    return $tea.cast<GetMfaResponse>(await this.doRequest("1.0", "antcloud.iam.mfa.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetMfaResponse({}));
  }

  /**
   * Description: 更新密码
   * Summary: 更新密码
   */
  async updateOperatorPassword(request: UpdateOperatorPasswordRequest): Promise<UpdateOperatorPasswordResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateOperatorPasswordEx(request, headers, runtime);
  }

  /**
   * Description: 更新密码
   * Summary: 更新密码
   */
  async updateOperatorPasswordEx(request: UpdateOperatorPasswordRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateOperatorPasswordResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateOperatorPasswordResponse>(await this.doRequest("1.0", "antcloud.iam.operator.password.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateOperatorPasswordResponse({}));
  }

  /**
   * Description: 重置账号密码
   * Summary: 重置账号密码
   */
  async resetOperatorPassword(request: ResetOperatorPasswordRequest): Promise<ResetOperatorPasswordResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.resetOperatorPasswordEx(request, headers, runtime);
  }

  /**
   * Description: 重置账号密码
   * Summary: 重置账号密码
   */
  async resetOperatorPasswordEx(request: ResetOperatorPasswordRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ResetOperatorPasswordResponse> {
    Util.validateModel(request);
    return $tea.cast<ResetOperatorPasswordResponse>(await this.doRequest("1.0", "antcloud.iam.operator.password.reset", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ResetOperatorPasswordResponse({}));
  }

  /**
   * Description: 批量查询操作员
   * Summary: 批量查询操作员
   */
  async batchqueryOperator(request: BatchqueryOperatorRequest): Promise<BatchqueryOperatorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryOperatorEx(request, headers, runtime);
  }

  /**
   * Description: 批量查询操作员
   * Summary: 批量查询操作员
   */
  async batchqueryOperatorEx(request: BatchqueryOperatorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryOperatorResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryOperatorResponse>(await this.doRequest("1.0", "antcloud.iam.operator.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryOperatorResponse({}));
  }

  /**
   * Description: 推送操作事件，事件需要事先定义
   * Summary: 推送操作事件
   */
  async pushOperation(request: PushOperationRequest): Promise<PushOperationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushOperationEx(request, headers, runtime);
  }

  /**
   * Description: 推送操作事件，事件需要事先定义
   * Summary: 推送操作事件
   */
  async pushOperationEx(request: PushOperationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushOperationResponse> {
    Util.validateModel(request);
    return $tea.cast<PushOperationResponse>(await this.doRequest("1.0", "antcloud.iam.operation.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushOperationResponse({}));
  }

  /**
   * Description: 查询操作类型
   * Summary: 查询操作类型
   */
  async queryOperationtype(request: QueryOperationtypeRequest): Promise<QueryOperationtypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryOperationtypeEx(request, headers, runtime);
  }

  /**
   * Description: 查询操作类型
   * Summary: 查询操作类型
   */
  async queryOperationtypeEx(request: QueryOperationtypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryOperationtypeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryOperationtypeResponse>(await this.doRequest("1.0", "antcloud.iam.operationtype.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryOperationtypeResponse({}));
  }

  /**
   * Description: 唯一查询操作类型
   * Summary: 唯一查询操作类型
   */
  async getOperationtype(request: GetOperationtypeRequest): Promise<GetOperationtypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getOperationtypeEx(request, headers, runtime);
  }

  /**
   * Description: 唯一查询操作类型
   * Summary: 唯一查询操作类型
   */
  async getOperationtypeEx(request: GetOperationtypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetOperationtypeResponse> {
    Util.validateModel(request);
    return $tea.cast<GetOperationtypeResponse>(await this.doRequest("1.0", "antcloud.iam.operationtype.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetOperationtypeResponse({}));
  }

  /**
   * Description: 添加租户成员
   * Summary: 添加租户成员
   */
  async addTenantMember(request: AddTenantMemberRequest): Promise<AddTenantMemberResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addTenantMemberEx(request, headers, runtime);
  }

  /**
   * Description: 添加租户成员
   * Summary: 添加租户成员
   */
  async addTenantMemberEx(request: AddTenantMemberRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddTenantMemberResponse> {
    Util.validateModel(request);
    return $tea.cast<AddTenantMemberResponse>(await this.doRequest("1.0", "antcloud.iam.tenant.member.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddTenantMemberResponse({}));
  }

  /**
   * Description: 获取 logintoken，该 token 为一次性使用，且过期时间短。
   * Summary: 获取操作员 signtoken
   */
  async getOperatorLogintoken(request: GetOperatorLogintokenRequest): Promise<GetOperatorLogintokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getOperatorLogintokenEx(request, headers, runtime);
  }

  /**
   * Description: 获取 logintoken，该 token 为一次性使用，且过期时间短。
   * Summary: 获取操作员 signtoken
   */
  async getOperatorLogintokenEx(request: GetOperatorLogintokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetOperatorLogintokenResponse> {
    Util.validateModel(request);
    return $tea.cast<GetOperatorLogintokenResponse>(await this.doRequest("1.0", "antcloud.iam.operator.logintoken.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetOperatorLogintokenResponse({}));
  }

  /**
   * Description: token用于三方会员免密登录，与数科官网token不通用
   * Summary: 三方会员免密登录token申请
   */
  async applyTrustloginToken(request: ApplyTrustloginTokenRequest): Promise<ApplyTrustloginTokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyTrustloginTokenEx(request, headers, runtime);
  }

  /**
   * Description: token用于三方会员免密登录，与数科官网token不通用
   * Summary: 三方会员免密登录token申请
   */
  async applyTrustloginTokenEx(request: ApplyTrustloginTokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyTrustloginTokenResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyTrustloginTokenResponse>(await this.doRequest("1.0", "antcloud.iam.trustlogin.token.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyTrustloginTokenResponse({}));
  }

  /**
   * Description: 三方会员免密登录token校验，与数科官网token不通用
   * Summary: 三方会员免密登录token校验
   */
  async verifyTrustloginToken(request: VerifyTrustloginTokenRequest): Promise<VerifyTrustloginTokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyTrustloginTokenEx(request, headers, runtime);
  }

  /**
   * Description: 三方会员免密登录token校验，与数科官网token不通用
   * Summary: 三方会员免密登录token校验
   */
  async verifyTrustloginTokenEx(request: VerifyTrustloginTokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyTrustloginTokenResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyTrustloginTokenResponse>(await this.doRequest("1.0", "antcloud.iam.trustlogin.token.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyTrustloginTokenResponse({}));
  }

}
