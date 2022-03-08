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

// ProtocolVO
export class ProtocolVO extends $tea.Model {
  // 协议类型
  protocol?: string;
  // 端口
  port?: string;
  static names(): { [key: string]: string } {
    return {
      protocol: 'protocol',
      port: 'port',
    };
  }

  static types(): { [key: string]: any } {
    return {
      protocol: 'string',
      port: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// RegistryVO
export class RegistryVO extends $tea.Model {
  // host
  host?: string;
  // protocol_support
  protocolSupport?: ProtocolVO[];
  // 注册中心类型
  type?: string;
  static names(): { [key: string]: string } {
    return {
      host: 'host',
      protocolSupport: 'protocol_support',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      host: 'string',
      protocolSupport: { 'type': 'array', 'itemType': ProtocolVO },
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AuthenticationConfigVO
export class AuthenticationConfigVO extends $tea.Model {
  // access_key
  accessKey?: string;
  // secret_key
  secretKey?: string;
  static names(): { [key: string]: string } {
    return {
      accessKey: 'access_key',
      secretKey: 'secret_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accessKey: 'string',
      secretKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 注册中心详情
export class RegistryInfoVO extends $tea.Model {
  // workspace_id
  workspaceId?: string;
  // tenant_id
  tenantId?: string;
  // 注册中心标识
  registryId?: string;
  // 注册中心类型
  registryType?: string;
  // 名称
  registryName?: string;
  // access_key
  accessKey?: string;
  // secret_key
  secretKey?: string;
  // 集群数量
  sysCount?: number;
  // host
  host?: string[];
  // can_delete
  canDelete?: boolean;
  // port
  port?: number;
  // gmt_create
  gmtCreate?: string;
  // gmt_modified
  gmtModified?: string;
  // operator
  operator?: string;
  // pub协议标识
  pubProtocol?: string;
  // can_update
  canUpdate?: boolean;
  // 注册中心分组
  registryGroup?: string;
  // 协议版本
  protocolVersion?: string;
  // 命名空间
  nameSpace?: string;
  // 集群名称
  clusterName?: string;
  static names(): { [key: string]: string } {
    return {
      workspaceId: 'workspace_id',
      tenantId: 'tenant_id',
      registryId: 'registry_id',
      registryType: 'registry_type',
      registryName: 'registry_name',
      accessKey: 'access_key',
      secretKey: 'secret_key',
      sysCount: 'sys_count',
      host: 'host',
      canDelete: 'can_delete',
      port: 'port',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      operator: 'operator',
      pubProtocol: 'pub_protocol',
      canUpdate: 'can_update',
      registryGroup: 'registry_group',
      protocolVersion: 'protocol_version',
      nameSpace: 'name_space',
      clusterName: 'cluster_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      workspaceId: 'string',
      tenantId: 'string',
      registryId: 'string',
      registryType: 'string',
      registryName: 'string',
      accessKey: 'string',
      secretKey: 'string',
      sysCount: 'number',
      host: { 'type': 'array', 'itemType': 'string' },
      canDelete: 'boolean',
      port: 'number',
      gmtCreate: 'string',
      gmtModified: 'string',
      operator: 'string',
      pubProtocol: 'string',
      canUpdate: 'boolean',
      registryGroup: 'string',
      protocolVersion: 'string',
      nameSpace: 'string',
      clusterName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// SystemClusterVO
export class SystemClusterVO extends $tea.Model {
  // api数
  apiCount?: number;
  // 认证配置
  authenticationConfig?: AuthenticationConfigVO;
  // 认证方式
  authenticationType?: string;
  // 是否可以删除
  canDelete?: boolean;
  // 描述
  description?: string;
  // 绑定的外部授权数量
  externalAuthCount?: number;
  // gmt_create
  gmtCreate?: string;
  // gmt_modified
  gmtModified?: string;
  // 系统host地址
  host?: string[];
  // 负载均衡策略类型
  lbType?: string;
  // 创建人
  operator?: string;
  // 端口
  port?: number;
  // 实例id
  instanceId?: string;
  // sys_id
  sysId?: string;
  // sys_name
  sysName?: string;
  // 系统类型(手工配置/sofa注册中心/zk)
  sysType?: string;
  // tenant_id
  tenantId?: string;
  // unique_id
  uniqueId?: string;
  // upstream_protocol
  upstreamProtocol?: string;
  // 下发协议的开头
  urlType?: string;
  // vpc_id
  vpcId?: string;
  // workspace_id
  workspaceId?: string;
  // registry_id
  registryId?: string;
  // registry_info
  registryInfo?: RegistryInfoVO;
  // triple域名
  tripleHost?: string;
  // need_tls
  needTls?: boolean;
  // 证书类型
  tlsType?: string;
  static names(): { [key: string]: string } {
    return {
      apiCount: 'api_count',
      authenticationConfig: 'authentication_config',
      authenticationType: 'authentication_type',
      canDelete: 'can_delete',
      description: 'description',
      externalAuthCount: 'external_auth_count',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      host: 'host',
      lbType: 'lb_type',
      operator: 'operator',
      port: 'port',
      instanceId: 'instance_id',
      sysId: 'sys_id',
      sysName: 'sys_name',
      sysType: 'sys_type',
      tenantId: 'tenant_id',
      uniqueId: 'unique_id',
      upstreamProtocol: 'upstream_protocol',
      urlType: 'url_type',
      vpcId: 'vpc_id',
      workspaceId: 'workspace_id',
      registryId: 'registry_id',
      registryInfo: 'registry_info',
      tripleHost: 'triple_host',
      needTls: 'need_tls',
      tlsType: 'tls_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiCount: 'number',
      authenticationConfig: AuthenticationConfigVO,
      authenticationType: 'string',
      canDelete: 'boolean',
      description: 'string',
      externalAuthCount: 'number',
      gmtCreate: 'string',
      gmtModified: 'string',
      host: { 'type': 'array', 'itemType': 'string' },
      lbType: 'string',
      operator: 'string',
      port: 'number',
      instanceId: 'string',
      sysId: 'string',
      sysName: 'string',
      sysType: 'string',
      tenantId: 'string',
      uniqueId: 'string',
      upstreamProtocol: 'string',
      urlType: 'string',
      vpcId: 'string',
      workspaceId: 'string',
      registryId: 'string',
      registryInfo: RegistryInfoVO,
      tripleHost: 'string',
      needTls: 'boolean',
      tlsType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// GateWayConfigVO
export class GateWayConfigVO extends $tea.Model {
  // 唯一标识
  gatewayId?: string;
  // host
  host?: string;
  // 唯一性标识
  id?: string;
  // zone名称、网关名称
  name?: string;
  // 注册中心
  routers?: RegistryVO[];
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  // zone
  zone?: string;
  // 流量比例
  weight?: number;
  static names(): { [key: string]: string } {
    return {
      gatewayId: 'gateway_id',
      host: 'host',
      id: 'id',
      name: 'name',
      routers: 'routers',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      zone: 'zone',
      weight: 'weight',
    };
  }

  static types(): { [key: string]: any } {
    return {
      gatewayId: 'string',
      host: 'string',
      id: 'string',
      name: 'string',
      routers: { 'type': 'array', 'itemType': RegistryVO },
      tenantId: 'string',
      workspaceId: 'string',
      zone: 'string',
      weight: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// RouterConfigVO
export class RouterConfigVO extends $tea.Model {
  // argKey
  argKey?: string;
  // argValue
  argValue?: string;
  // matchType
  matchType?: string;
  // param_location
  paramLocation?: string;
  // router_type
  routerType?: string;
  // systemCluster
  systemCluster?: SystemClusterVO;
  // sys_id
  sysId?: string;
  // weight
  weight?: number;
  // interceptionRule
  interceptionRule?: string;
  // 跨域标识
  gwId?: string;
  // region标识
  regionId?: string;
  // region名称
  regionName?: string;
  // gateway_config
  gatewayConfig?: GateWayConfigVO;
  static names(): { [key: string]: string } {
    return {
      argKey: 'arg_key',
      argValue: 'arg_value',
      matchType: 'match_type',
      paramLocation: 'param_location',
      routerType: 'router_type',
      systemCluster: 'system_cluster',
      sysId: 'sys_id',
      weight: 'weight',
      interceptionRule: 'interception_rule',
      gwId: 'gw_id',
      regionId: 'region_id',
      regionName: 'region_name',
      gatewayConfig: 'gateway_config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      argKey: 'string',
      argValue: 'string',
      matchType: 'string',
      paramLocation: 'string',
      routerType: 'string',
      systemCluster: SystemClusterVO,
      sysId: 'string',
      weight: 'number',
      interceptionRule: 'string',
      gwId: 'string',
      regionId: 'string',
      regionName: 'string',
      gatewayConfig: GateWayConfigVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// EncryptConfigVO
export class EncryptConfigVO extends $tea.Model {
  // app_id
  appId?: string;
  // 加密状态
  encryptionStatus?: string;
  // 加密类型
  encryptType?: string;
  // key_pair
  keyPair?: string;
  // private_key
  privateKey?: string;
  // pub_key
  pubKey?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      appId: 'app_id',
      encryptionStatus: 'encryption_status',
      encryptType: 'encrypt_type',
      keyPair: 'key_pair',
      privateKey: 'private_key',
      pubKey: 'pub_key',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appId: 'string',
      encryptionStatus: 'string',
      encryptType: 'string',
      keyPair: 'string',
      privateKey: 'string',
      pubKey: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiRspCodeVO
export class ApiRspCodeVO extends $tea.Model {
  // error_code
  errorCode?: string;
  // error_msg
  errorMsg?: string;
  // error_desc
  errorDesc?: string;
  static names(): { [key: string]: string } {
    return {
      errorCode: 'error_code',
      errorMsg: 'error_msg',
      errorDesc: 'error_desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      errorCode: 'string',
      errorMsg: 'string',
      errorDesc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiCacheKeyVO
export class ApiCacheKeyVO extends $tea.Model {
  // key
  key?: string;
  // location
  location?: string;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      location: 'location',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      location: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiParamVO
export class ApiParamVO extends $tea.Model {
  // API标识
  apiId?: string;
  // default_value
  defaultValue?: string;
  // description
  description?: string;
  // failure_demo
  failureDemo?: string;
  // location
  location?: string;
  // name
  name?: string;
  // 引用的模型类型	
  refType?: string;
  // 是否必填
  required?: boolean;
  // rsp_code_list
  rspCodeList?: ApiRspCodeVO[];
  // success_demo
  successDemo?: string;
  // 数据类型
  type?: string;
  // upstreamLocation
  upstreamLocation?: string;
  // upstream_name
  upstreamName?: string;
  // 工作空间标识
  workspaceId?: string;
  // tenant_id
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      apiId: 'api_id',
      defaultValue: 'default_value',
      description: 'description',
      failureDemo: 'failure_demo',
      location: 'location',
      name: 'name',
      refType: 'ref_type',
      required: 'required',
      rspCodeList: 'rsp_code_list',
      successDemo: 'success_demo',
      type: 'type',
      upstreamLocation: 'upstream_location',
      upstreamName: 'upstream_name',
      workspaceId: 'workspace_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiId: 'string',
      defaultValue: 'string',
      description: 'string',
      failureDemo: 'string',
      location: 'string',
      name: 'string',
      refType: 'string',
      required: 'boolean',
      rspCodeList: { 'type': 'array', 'itemType': ApiRspCodeVO },
      successDemo: 'string',
      type: 'string',
      upstreamLocation: 'string',
      upstreamName: 'string',
      workspaceId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// RouterInfoVO
export class RouterInfoVO extends $tea.Model {
  // api数
  apiCount?: number;
  // 是否可以删除
  canDelete?: boolean;
  // 创建时间
  gmtCreate?: string;
  // 更改时间
  gmtModified?: string;
  // operator
  operator?: string;
  // routerConfigs
  routerConfigs?: RouterConfigVO[];
  // router_id
  routerId?: string;
  // routerName
  routerName?: string;
  // routerType
  routerType?: string;
  // upstream_protocol
  upstreamProtocol?: string;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  // 跨域状态
  corsStatus?: string;
  static names(): { [key: string]: string } {
    return {
      apiCount: 'api_count',
      canDelete: 'can_delete',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      operator: 'operator',
      routerConfigs: 'router_configs',
      routerId: 'router_id',
      routerName: 'router_name',
      routerType: 'router_type',
      upstreamProtocol: 'upstream_protocol',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      corsStatus: 'cors_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiCount: 'number',
      canDelete: 'boolean',
      gmtCreate: 'string',
      gmtModified: 'string',
      operator: 'string',
      routerConfigs: { 'type': 'array', 'itemType': RouterConfigVO },
      routerId: 'string',
      routerName: 'string',
      routerType: 'string',
      upstreamProtocol: 'string',
      tenantId: 'string',
      workspaceId: 'string',
      corsStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AppInfoVO
export class AppInfoVO extends $tea.Model {
  // api_count
  apiCount?: number;
  // app_id
  appId?: string;
  // app_name
  appName?: string;
  // appSecret
  appSecret?: string;
  // app类型
  appType?: string;
  // authenticationConfig
  authenticationConfig?: AuthenticationConfigVO;
  // 是否可以删除
  canDelete?: boolean;
  // description
  description?: string;
  // encryptConfig
  encryptConfig?: EncryptConfigVO;
  // 创建时间
  gmtCreate?: string;
  // 更改时间
  gmtModified?: string;
  // operator
  operator?: string;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      apiCount: 'api_count',
      appId: 'app_id',
      appName: 'app_name',
      appSecret: 'app_secret',
      appType: 'app_type',
      authenticationConfig: 'authentication_config',
      canDelete: 'can_delete',
      description: 'description',
      encryptConfig: 'encrypt_config',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      operator: 'operator',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiCount: 'number',
      appId: 'string',
      appName: 'string',
      appSecret: 'string',
      appType: 'string',
      authenticationConfig: AuthenticationConfigVO,
      canDelete: 'boolean',
      description: 'string',
      encryptConfig: EncryptConfigVO,
      gmtCreate: 'string',
      gmtModified: 'string',
      operator: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据模型参数VO
export class ApiModelParamVO extends $tea.Model {
  // 默认值
  defaultValue?: string;
  // 描述
  description?: string;
  // 创建时间
  gmtCreate?: string;
  // 修改时间
  gmtModified?: string;
  // 模型id
  modelId?: string;
  // 模型提交 操作
  operation?: string;
  // 模型参数id（唯一标识）
  paramId?: string;
  // 参数名
  paramName?: string;
  // 参数类型
  paramType?: string;
  // 引用模型id
  refModelId?: string;
  // 工作空间标识
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  // model_description
  modelDescription?: string;
  static names(): { [key: string]: string } {
    return {
      defaultValue: 'default_value',
      description: 'description',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      modelId: 'model_id',
      operation: 'operation',
      paramId: 'param_id',
      paramName: 'param_name',
      paramType: 'param_type',
      refModelId: 'ref_model_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      modelDescription: 'model_description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      defaultValue: 'string',
      description: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      modelId: 'string',
      operation: 'string',
      paramId: 'string',
      paramName: 'string',
      paramType: 'string',
      refModelId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
      modelDescription: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiGroupDomainVO
export class ApiGroupDomainVO extends $tea.Model {
  // gmt_create
  gmtCreate?: string;
  // gmt_modified
  gmtModified?: string;
  // api_group_id
  apiGroupId?: string;
  // domain_name
  domainName?: string;
  static names(): { [key: string]: string } {
    return {
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      apiGroupId: 'api_group_id',
      domainName: 'domain_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      gmtCreate: 'string',
      gmtModified: 'string',
      apiGroupId: 'string',
      domainName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 授权信息
export class SofaGwAuthenticationVO extends $tea.Model {
  // 		
  // access key
  // 
  // 
  authAccessKey?: string;
  // secret key
  authSecretKey?: string;
  // id
  id?: number;
  static names(): { [key: string]: string } {
    return {
      authAccessKey: 'auth_access_key',
      authSecretKey: 'auth_secret_key',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authAccessKey: 'string',
      authSecretKey: 'string',
      id: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 排序信息
export class OrderInfo extends $tea.Model {
  // 要排序的字段
  key: string;
  // 升序or降序
  order: string;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      order: 'order',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      order: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AuthAppInfoVO
export class AuthAppInfoVO extends $tea.Model {
  // api数
  apiCount?: number;
  // 应用类型
  appType?: string;
  // auth_app_info_id
  authAppInfoId?: string;
  // authAppType
  authAppType?: string;
  // 是否可以删除
  canDelete?: boolean;
  // 创建时间
  gmtCreate?: string;
  // 更改时间
  gmtModified?: string;
  // operator
  operator?: string;
  // subAppCompany
  subAppCompany?: string;
  // subAppDesc
  subAppDesc?: string;
  // 订阅方appid
  subAppId?: string;
  // sub_app_info
  subAppInfo?: AppInfoVO;
  // subTenantId
  subTenantId?: string;
  // subWorkspaceId
  subWorkspaceId?: string;
  // api标识
  apiId?: string;
  // 应用名称
  appName?: string;
  // workspace_id
  workspaceId?: string;
  // tenant_id
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      apiCount: 'api_count',
      appType: 'app_type',
      authAppInfoId: 'auth_app_info_id',
      authAppType: 'auth_app_type',
      canDelete: 'can_delete',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      operator: 'operator',
      subAppCompany: 'sub_app_company',
      subAppDesc: 'sub_app_desc',
      subAppId: 'sub_app_id',
      subAppInfo: 'sub_app_info',
      subTenantId: 'sub_tenant_id',
      subWorkspaceId: 'sub_workspace_id',
      apiId: 'api_id',
      appName: 'app_name',
      workspaceId: 'workspace_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiCount: 'number',
      appType: 'string',
      authAppInfoId: 'string',
      authAppType: 'string',
      canDelete: 'boolean',
      gmtCreate: 'string',
      gmtModified: 'string',
      operator: 'string',
      subAppCompany: 'string',
      subAppDesc: 'string',
      subAppId: 'string',
      subAppInfo: AppInfoVO,
      subTenantId: 'string',
      subWorkspaceId: 'string',
      apiId: 'string',
      appName: 'string',
      workspaceId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 策略管理
export class StrategyInfoVO extends $tea.Model {
  // workspace_id
  workspaceId?: string;
  // tenant_id
  tenantId?: string;
  // 创建时间
  gmtCreate?: string;
  // 更新时间
  gmtModified?: string;
  // 策略唯一标识
  strategyId?: string;
  // 策略名称
  strategyName?: string;
  // 策略状态
  strategyStatus?: string;
  // 操作人
  operator?: string;
  // 	
  // API数量
  apiCount?: number;
  // 策略描述
  description?: string;
  // 策略类型
  strategyType?: string;
  // 名单集合
  host?: string[];
  // true, false
  canDelete?: boolean;
  static names(): { [key: string]: string } {
    return {
      workspaceId: 'workspace_id',
      tenantId: 'tenant_id',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      strategyId: 'strategy_id',
      strategyName: 'strategy_name',
      strategyStatus: 'strategy_status',
      operator: 'operator',
      apiCount: 'api_count',
      description: 'description',
      strategyType: 'strategy_type',
      host: 'host',
      canDelete: 'can_delete',
    };
  }

  static types(): { [key: string]: any } {
    return {
      workspaceId: 'string',
      tenantId: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      strategyId: 'string',
      strategyName: 'string',
      strategyStatus: 'string',
      operator: 'string',
      apiCount: 'number',
      description: 'string',
      strategyType: 'string',
      host: { 'type': 'array', 'itemType': 'string' },
      canDelete: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// SwitchVO
export class SwitchVO extends $tea.Model {
  // 唯一标识
  id?: string;
  // 键值
  key?: string;
  // 名称
  name?: string;
  // 开关
  value?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      key: 'key',
      name: 'name',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      key: 'string',
      name: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// LimitConfigVO
export class LimitConfigVO extends $tea.Model {
  // 是否需要限制
  needLimit?: boolean;
  // 限制阈值
  limit?: number;
  // 限制响应类型
  limitRspType?: string;
  // 响应信息
  rspMsg?: string;
  static names(): { [key: string]: string } {
    return {
      needLimit: 'need_limit',
      limit: 'limit',
      limitRspType: 'limit_rsp_type',
      rspMsg: 'rsp_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      needLimit: 'boolean',
      limit: 'number',
      limitRspType: 'string',
      rspMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiGroupVO
export class ApiGroupVO extends $tea.Model {
  // api数
  apiCount?: number;
  // 分组标识(全局唯一)
  apiGroupId?: string;
  // 用户授权开关
  authUserSwitch?: string;
  // 是否可以删除
  canDelete?: boolean;
  // 描述
  description?: string;
  // 域名
  domainName?: string;
  // 创建时间
  gmtCreate?: string;
  // 更改时间
  gmtModified?: string;
  // 分组名
  groupName?: string;
  // need_api_auth_user
  needApiAuthUser?: boolean;
  // 创建人
  operator?: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  // 是否可操作
  operationPermission?: boolean;
  // DEFAULT|CUSTOM
  domainType?: string;
  // 自定义域名
  domainList?: ApiGroupDomainVO[];
  static names(): { [key: string]: string } {
    return {
      apiCount: 'api_count',
      apiGroupId: 'api_group_id',
      authUserSwitch: 'auth_user_switch',
      canDelete: 'can_delete',
      description: 'description',
      domainName: 'domain_name',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      groupName: 'group_name',
      needApiAuthUser: 'need_api_auth_user',
      operator: 'operator',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      operationPermission: 'operation_permission',
      domainType: 'domain_type',
      domainList: 'domain_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiCount: 'number',
      apiGroupId: 'string',
      authUserSwitch: 'string',
      canDelete: 'boolean',
      description: 'string',
      domainName: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      groupName: 'string',
      needApiAuthUser: 'boolean',
      operator: 'string',
      tenantId: 'string',
      workspaceId: 'string',
      operationPermission: 'boolean',
      domainType: 'string',
      domainList: { 'type': 'array', 'itemType': ApiGroupDomainVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiflowOutputVO
export class ApiflowOutputVO extends $tea.Model {
  // name
  name?: string;
  // mapping_name
  mappingName?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      mappingName: 'mapping_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      mappingName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// GrayRuleConfigVO
export class GrayRuleConfigVO extends $tea.Model {
  // lable
  lable?: string;
  // weight
  weight?: number;
  // app_name
  appName?: string;
  // arg_key
  argKey?: string;
  // match_type
  matchType?: string;
  // arg_value
  argValue?: string;
  static names(): { [key: string]: string } {
    return {
      lable: 'lable',
      weight: 'weight',
      appName: 'app_name',
      argKey: 'arg_key',
      matchType: 'match_type',
      argValue: 'arg_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      lable: 'string',
      weight: 'number',
      appName: 'string',
      argKey: 'string',
      matchType: 'string',
      argValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// CorsInfoVO
export class CorsInfoVO extends $tea.Model {
  // 是否允许发送COOKIE
  allowCredentials?: boolean;
  // 允许的 request headers
  allowHeaders?: string[];
  // 允许的http method
  allowMethods?: string[];
  // 允许的 ORIGIN
  allowOrigins?: string[];
  // API数量
  apiCount?: number;
  // cors标识
  corsId?: string;
  // cors名称
  corsName?: string;
  // cors_scop
  corsScop?: string;
  // cors状态
  corsStatus?: string;
  // 允许暴露的 reponse header
  exposeHeaders?: string[];
  // 创建时间
  gmtCreate?: string;
  // 更新时间
  gmtModified?: string;
  // 预检请求的有效期
  maxAge?: number;
  // 创建人
  operator?: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      allowCredentials: 'allow_credentials',
      allowHeaders: 'allow_headers',
      allowMethods: 'allow_methods',
      allowOrigins: 'allow_origins',
      apiCount: 'api_count',
      corsId: 'cors_id',
      corsName: 'cors_name',
      corsScop: 'cors_scop',
      corsStatus: 'cors_status',
      exposeHeaders: 'expose_headers',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      maxAge: 'max_age',
      operator: 'operator',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      allowCredentials: 'boolean',
      allowHeaders: { 'type': 'array', 'itemType': 'string' },
      allowMethods: { 'type': 'array', 'itemType': 'string' },
      allowOrigins: { 'type': 'array', 'itemType': 'string' },
      apiCount: 'number',
      corsId: 'string',
      corsName: 'string',
      corsScop: 'string',
      corsStatus: 'string',
      exposeHeaders: { 'type': 'array', 'itemType': 'string' },
      gmtCreate: 'string',
      gmtModified: 'string',
      maxAge: 'number',
      operator: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiVersionVO
export class ApiVersionVO extends $tea.Model {
  // API标识
  apiId?: string;
  // editOperator
  editOperator?: string;
  // 创建时间
  gmtCreate?: string;
  // 编辑时间
  gmtEdit?: string;
  // 更改时间
  gmtModified?: string;
  // gmtOffline
  gmtOffline?: string;
  // gmtOnline
  gmtOnline?: string;
  // offlineDesc
  offlineDesc?: string;
  // offlineOperator
  offlineOperator?: string;
  // onlineDesc
  onlineDesc?: string;
  // onlineOperator
  onlineOperator?: string;
  // versionId
  versionId?: string;
  // 版本号
  versionNo?: string;
  // versionStatus
  versionStatus?: string;
  // 能否发布
  canOnline?: boolean;
  static names(): { [key: string]: string } {
    return {
      apiId: 'api_id',
      editOperator: 'edit_operator',
      gmtCreate: 'gmt_create',
      gmtEdit: 'gmt_edit',
      gmtModified: 'gmt_modified',
      gmtOffline: 'gmt_offline',
      gmtOnline: 'gmt_online',
      offlineDesc: 'offline_desc',
      offlineOperator: 'offline_operator',
      onlineDesc: 'online_desc',
      onlineOperator: 'online_operator',
      versionId: 'version_id',
      versionNo: 'version_no',
      versionStatus: 'version_status',
      canOnline: 'can_online',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiId: 'string',
      editOperator: 'string',
      gmtCreate: 'string',
      gmtEdit: 'string',
      gmtModified: 'string',
      gmtOffline: 'string',
      gmtOnline: 'string',
      offlineDesc: 'string',
      offlineOperator: 'string',
      onlineDesc: 'string',
      onlineOperator: 'string',
      versionId: 'string',
      versionNo: 'string',
      versionStatus: 'string',
      canOnline: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiMockConfigVO
export class ApiMockConfigVO extends $tea.Model {
  // mock_data
  mockData?: string;
  static names(): { [key: string]: string } {
    return {
      mockData: 'mock_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      mockData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiCrossZoneVO
export class ApiCrossZoneVO extends $tea.Model {
  // workspace_id
  workspaceId?: string;
  // tenant_id
  tenantId?: string;
  // api_id
  apiId?: string;
  // gw_id
  gwId?: string;
  // 注册中心类型
  sysType?: string;
  // 网关类型
  type?: string;
  // 创建时间
  gmtCreate?: string;
  // 更新时间
  gmtModified?: string;
  // registry_id
  registryId?: string;
  static names(): { [key: string]: string } {
    return {
      workspaceId: 'workspace_id',
      tenantId: 'tenant_id',
      apiId: 'api_id',
      gwId: 'gw_id',
      sysType: 'sys_type',
      type: 'type',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      registryId: 'registry_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      workspaceId: 'string',
      tenantId: 'string',
      apiId: 'string',
      gwId: 'string',
      sysType: 'string',
      type: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      registryId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ParamMappingInfoVO
export class ParamMappingInfoVO extends $tea.Model {
  // api_count
  apiCount?: number;
  // can_delete
  canDelete?: boolean;
  // 配置模板
  configTemplate?: string;
  // 描述
  description?: string;
  // gmt_create
  gmtCreate?: string;
  // gmt_modified
  gmtModified?: string;
  // 映射类型
  mappingType?: string;
  // 创建人
  operator?: string;
  // param_mapping_id
  paramMappingId?: string;
  // 参数映射名称
  paramMappingName?: string;
  // 脚本配置
  scriptConfig?: string;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  // 配置模板名称
  configTemplateName?: string;
  static names(): { [key: string]: string } {
    return {
      apiCount: 'api_count',
      canDelete: 'can_delete',
      configTemplate: 'config_template',
      description: 'description',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      mappingType: 'mapping_type',
      operator: 'operator',
      paramMappingId: 'param_mapping_id',
      paramMappingName: 'param_mapping_name',
      scriptConfig: 'script_config',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      configTemplateName: 'config_template_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiCount: 'number',
      canDelete: 'boolean',
      configTemplate: 'string',
      description: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      mappingType: 'string',
      operator: 'string',
      paramMappingId: 'string',
      paramMappingName: 'string',
      scriptConfig: 'string',
      tenantId: 'string',
      workspaceId: 'string',
      configTemplateName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiCacheVO
export class ApiCacheVO extends $tea.Model {
  // 是否需要缓存
  needCache?: boolean;
  // TTL
  ttl?: number;
  // cacheKeys
  cacheKeys?: ApiCacheKeyVO[];
  static names(): { [key: string]: string } {
    return {
      needCache: 'need_cache',
      ttl: 'ttl',
      cacheKeys: 'cache_keys',
    };
  }

  static types(): { [key: string]: any } {
    return {
      needCache: 'boolean',
      ttl: 'number',
      cacheKeys: { 'type': 'array', 'itemType': ApiCacheKeyVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 外部授权信息
export class ExternalAuthInfoVO extends $tea.Model {
  // 绑定api数量
  apiCount?: number;
  // 缓存开关
  cacheSwitch?: string;
  // 缓存时间
  cacheTtl?: number;
  // 能否删除
  canDelete?: boolean;
  // description
  description?: string;
  // 外部系统标识
  externalAuthId?: string;
  // 外部授权名称
  externalAuthName?: string;
  // 	
  // 方法名
  functionName?: string;
  // 	
  // 创建时间
  gmtCreate?: string;
  // 	
  // 更改时间
  gmtModified?: string;
  // 后端接口名
  interfaceName?: string;
  // 请求方法
  method?: string;
  // operationtype
  operationType?: string;
  // 		
  // 创建人
  operator?: string;
  // 外部api参数
  params?: ApiParamVO[];
  // 路由标识
  routerId?: string;
  // 路由规则
  routerInfo?: RouterInfoVO;
  // 路由策略类型
  routerType?: string;
  // SystemClusterVO
  systemCluster?: SystemClusterVO;
  // 系统集群标识
  sysId?: string;
  // 	
  // 租户标识
  tenantId?: string;
  // timeout
  timeout?: number;
  // 服务标识
  uniqueId?: string;
  // 后端路径
  upstreamPath?: string;
  // 后端协议类型
  upstreamProtocol?: string;
  // 后端服务类型
  upstreamType?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      apiCount: 'api_count',
      cacheSwitch: 'cache_switch',
      cacheTtl: 'cache_ttl',
      canDelete: 'can_delete',
      description: 'description',
      externalAuthId: 'external_auth_id',
      externalAuthName: 'external_auth_name',
      functionName: 'function_name',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      interfaceName: 'interface_name',
      method: 'method',
      operationType: 'operation_type',
      operator: 'operator',
      params: 'params',
      routerId: 'router_id',
      routerInfo: 'router_info',
      routerType: 'router_type',
      systemCluster: 'system_cluster',
      sysId: 'sys_id',
      tenantId: 'tenant_id',
      timeout: 'timeout',
      uniqueId: 'unique_id',
      upstreamPath: 'upstream_path',
      upstreamProtocol: 'upstream_protocol',
      upstreamType: 'upstream_type',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiCount: 'number',
      cacheSwitch: 'string',
      cacheTtl: 'number',
      canDelete: 'boolean',
      description: 'string',
      externalAuthId: 'string',
      externalAuthName: 'string',
      functionName: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      interfaceName: 'string',
      method: 'string',
      operationType: 'string',
      operator: 'string',
      params: { 'type': 'array', 'itemType': ApiParamVO },
      routerId: 'string',
      routerInfo: RouterInfoVO,
      routerType: 'string',
      systemCluster: SystemClusterVO,
      sysId: 'string',
      tenantId: 'string',
      timeout: 'number',
      uniqueId: 'string',
      upstreamPath: 'string',
      upstreamProtocol: 'string',
      upstreamType: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ActionResult
export class ActionResult extends $tea.Model {
  // 错误码
  code?: string;
  // 报错信息
  errorMessage?: string;
  // id
  id?: string;
  // 是否挂载成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      errorMessage: 'error_message',
      id: 'id',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      errorMessage: 'string',
      id: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiModelVO
export class ApiModelVO extends $tea.Model {
  // 绑定的api数量
  apiCount?: number;
  // 模板id(全局唯一)
  apiModelId?: string;
  // 是否可以删除
  canDelete?: boolean;
  // API模型描述
  description?: string;
  // 创建时间
  gmtCreate?: string;
  // 	
  // 更改时间
  gmtModified?: string;
  // 模型配置
  modelConfig?: string;
  // 模型名称
  modelName?: string;
  // 数据模型参数
  modelParams?: ApiModelParamVO[];
  // 创建人
  // 
  operator?: string;
  // 租户id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  // children
  children?: string;
  // option 表示模型是多参数
  modelType?: string;
  static names(): { [key: string]: string } {
    return {
      apiCount: 'api_count',
      apiModelId: 'api_model_id',
      canDelete: 'can_delete',
      description: 'description',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      modelConfig: 'model_config',
      modelName: 'model_name',
      modelParams: 'model_params',
      operator: 'operator',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      children: 'children',
      modelType: 'model_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiCount: 'number',
      apiModelId: 'string',
      canDelete: 'boolean',
      description: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      modelConfig: 'string',
      modelName: 'string',
      modelParams: { 'type': 'array', 'itemType': ApiModelParamVO },
      operator: 'string',
      tenantId: 'string',
      workspaceId: 'string',
      children: 'string',
      modelType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// PageInfo
export class PageInfo extends $tea.Model {
  // 排序信息
  orderInfos?: OrderInfo[];
  // 当前页
  pageIndex?: number;
  // 每页记录数
  pageSize?: number;
  // 总数
  total?: number;
  static names(): { [key: string]: string } {
    return {
      orderInfos: 'order_infos',
      pageIndex: 'page_index',
      pageSize: 'page_size',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderInfos: { 'type': 'array', 'itemType': OrderInfo },
      pageIndex: 'number',
      pageSize: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiflowMachineDefVO
export class ApiflowMachineDefVO extends $tea.Model {
  // 	
  // api数
  apiCount?: number;
  // workspace_id
  workspaceId?: string;
  // tenant_id
  tenantId?: string;
  // instance_id
  instanceId?: string;
  // can_delete
  canDelete?: boolean;
  // id
  id?: string;
  // name
  name?: string;
  // app_name
  appName?: string;
  // type
  type?: string;
  // comment
  comment?: string;
  // ver
  ver?: string;
  // gmt_create
  gmtCreate?: string;
  // status
  status?: string;
  // recover_strategy
  recoverStrategy?: string;
  // content
  content?: string;
  // machine_status
  machineStatus?: string;
  // field_mapping
  fieldMapping?: string;
  static names(): { [key: string]: string } {
    return {
      apiCount: 'api_count',
      workspaceId: 'workspace_id',
      tenantId: 'tenant_id',
      instanceId: 'instance_id',
      canDelete: 'can_delete',
      id: 'id',
      name: 'name',
      appName: 'app_name',
      type: 'type',
      comment: 'comment',
      ver: 'ver',
      gmtCreate: 'gmt_create',
      status: 'status',
      recoverStrategy: 'recover_strategy',
      content: 'content',
      machineStatus: 'machine_status',
      fieldMapping: 'field_mapping',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiCount: 'number',
      workspaceId: 'string',
      tenantId: 'string',
      instanceId: 'string',
      canDelete: 'boolean',
      id: 'string',
      name: 'string',
      appName: 'string',
      type: 'string',
      comment: 'string',
      ver: 'string',
      gmtCreate: 'string',
      status: 'string',
      recoverStrategy: 'string',
      content: 'string',
      machineStatus: 'string',
      fieldMapping: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiTransferVO
export class ApiTransferVO extends $tea.Model {
  // API缓存模型
  apiCacheModel?: ApiCacheVO;
  // api_group
  apiGroup?: ApiGroupVO;
  // API分组标识
  apiGroupId?: string;
  // 所属API分组名称
  apiGroupName?: string;
  // API标识
  apiId?: string;
  // API限流配置
  apiLimitConfig?: LimitConfigVO;
  // api_mock_config
  apiMockConfig?: ApiMockConfigVO;
  // API名称
  apiName?: string;
  // apiStatus
  apiStatus?: string;
  // 授权应用类型
  appType?: string;
  // authentication_type
  authenticationType?: string;
  // auth_app_count
  authAppCount?: number;
  // 是否可以删除
  canDelete?: boolean;
  // charset
  charset?: string;
  // 重复的配置  信息详情
  checkResult?: string;
  // 完整interface_name
  completeInterfaceName?: string;
  // contentType
  contentType?: string;
  // cors_id
  corsId?: string;
  // cors_info
  corsInfo?: CorsInfoVO;
  // 当前显示的版本
  currentVersionNo?: string;
  // description
  description?: string;
  // API分组域名
  domainName?: string;
  // downstreamProtocol
  downstreamProtocol?: string;
  // 编辑中的版本
  editVersion?: ApiVersionVO;
  // 编辑中的API版本号
  editVersionNo?: string;
  // external_auth
  externalAuth?: ExternalAuthInfoVO;
  // 外部系统标识
  externalAuthId?: string;
  // 方法名
  functionName?: string;
  // 创建时间
  gmtCreate?: string;
  // 更改时间
  gmtModified?: string;
  // 接口名称
  interfaceName?: string;
  // method
  method?: string;
  // onlineVersion
  onlineVersion?: ApiVersionVO;
  // 发布中的API版本号
  onlineVersionNo?: string;
  // operation_type
  operationType?: string;
  // 创建人
  operator?: string;
  // path
  path?: string;
  // 路径匹配类型
  pathMatchType?: string;
  // reqParams
  reqParams?: ApiParamVO[];
  // reqparammapping
  reqParamMapping?: ParamMappingInfoVO;
  // 请求参数映射标识
  reqParamMappingId?: string;
  // 参数映射类型（普通\高级）
  reqParamMappingType?: string;
  // respparammapping
  respParamMapping?: ParamMappingInfoVO;
  // 响应参数标识
  respParamMappingId?: string;
  // router_id
  routerId?: string;
  // 	
  // 路由规则
  routerInfo?: RouterInfoVO;
  // 路由策略类型
  routerType?: string;
  // rsqParam
  rsqParam?: ApiParamVO;
  // 	
  // 后端集群
  systemCluster?: SystemClusterVO;
  // sys_id
  sysId?: string;
  // 目标工作空间标识
  targetWorkspaceId?: string;
  // 租户标识
  tenantId?: string;
  // timeout
  timeout?: number;
  // 服务标识
  uniqueId?: string;
  // 需要覆盖的配置
  updateConfigList?: string[];
  // upstreamParamMappings
  upstreamParamMappings?: ApiParamVO[];
  // upstreamPath
  upstreamPath?: string;
  // upstreamProtocol
  upstreamProtocol?: string;
  // 后端服务类型
  upstreamType?: string;
  // 工作空间标识
  workspaceId?: string;
  // 导入失败的原因
  importResult?: string;
  // domain_list
  domainList?: ApiGroupDomainVO[];
  // 策略ID
  strategyId?: string;
  // 策略详情
  strategyInfo?: StrategyInfoVO;
  // crossZone双网关 (api 类型)
  apiType?: string;
  // api的网关配置列表
  apiCrossZoneList?: ApiCrossZoneVO[];
  // registry_group
  registryGroup?: string;
  // parameter
  parameter?: string[];
  // up_function_name
  upFunctionName?: string;
  // param_path_list
  paramPathList?: string[];
  // dubbo发布服务版本
  serviceVersion?: string;
  // auth_app_info_id
  authAppInfoId?: string;
  // operation_permission
  operationPermission?: boolean;
  // data_encryption
  dataEncryption?: string;
  // egress_list
  egressList?: GateWayConfigVO[];
  // history_version_list
  historyVersionList?: ApiVersionVO[];
  // GateWayConfigVO
  ingress?: string;
  // model
  model?: string;
  // req_model_id
  reqModelId?: string;
  // req_model_name	
  reqModelName?: string;
  // req_type
  reqType?: string;
  // resp_model_id
  respModelId?: string;
  // resp_model_name
  respModelName?: string;
  // resp_type
  respType?: string;
  // ingress_list
  ingressList?: GateWayConfigVO[];
  // content
  content?: string;
  // api_count
  apiCount?: number;
  // field_mapping
  fieldMapping?: ApiflowOutputVO[];
  // need_tls
  needTls?: boolean;
  static names(): { [key: string]: string } {
    return {
      apiCacheModel: 'api_cache_model',
      apiGroup: 'api_group',
      apiGroupId: 'api_group_id',
      apiGroupName: 'api_group_name',
      apiId: 'api_id',
      apiLimitConfig: 'api_limit_config',
      apiMockConfig: 'api_mock_config',
      apiName: 'api_name',
      apiStatus: 'api_status',
      appType: 'app_type',
      authenticationType: 'authentication_type',
      authAppCount: 'auth_app_count',
      canDelete: 'can_delete',
      charset: 'charset',
      checkResult: 'check_result',
      completeInterfaceName: 'complete_interface_name',
      contentType: 'content_type',
      corsId: 'cors_id',
      corsInfo: 'cors_info',
      currentVersionNo: 'current_version_no',
      description: 'description',
      domainName: 'domain_name',
      downstreamProtocol: 'downstream_protocol',
      editVersion: 'edit_version',
      editVersionNo: 'edit_version_no',
      externalAuth: 'external_auth',
      externalAuthId: 'external_auth_id',
      functionName: 'function_name',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      interfaceName: 'interface_name',
      method: 'method',
      onlineVersion: 'online_version',
      onlineVersionNo: 'online_version_no',
      operationType: 'operation_type',
      operator: 'operator',
      path: 'path',
      pathMatchType: 'path_match_type',
      reqParams: 'req_params',
      reqParamMapping: 'req_param_mapping',
      reqParamMappingId: 'req_param_mapping_id',
      reqParamMappingType: 'req_param_mapping_type',
      respParamMapping: 'resp_param_mapping',
      respParamMappingId: 'resp_param_mapping_id',
      routerId: 'router_id',
      routerInfo: 'router_info',
      routerType: 'router_type',
      rsqParam: 'rsq_param',
      systemCluster: 'system_cluster',
      sysId: 'sys_id',
      targetWorkspaceId: 'target_workspace_id',
      tenantId: 'tenant_id',
      timeout: 'timeout',
      uniqueId: 'unique_id',
      updateConfigList: 'update_config_list',
      upstreamParamMappings: 'upstream_param_mappings',
      upstreamPath: 'upstream_path',
      upstreamProtocol: 'upstream_protocol',
      upstreamType: 'upstream_type',
      workspaceId: 'workspace_id',
      importResult: 'import_result',
      domainList: 'domain_list',
      strategyId: 'strategy_id',
      strategyInfo: 'strategy_info',
      apiType: 'api_type',
      apiCrossZoneList: 'api_cross_zone_list',
      registryGroup: 'registry_group',
      parameter: 'parameter',
      upFunctionName: 'up_function_name',
      paramPathList: 'param_path_list',
      serviceVersion: 'service_version',
      authAppInfoId: 'auth_app_info_id',
      operationPermission: 'operation_permission',
      dataEncryption: 'data_encryption',
      egressList: 'egress_list',
      historyVersionList: 'history_version_list',
      ingress: 'ingress',
      model: 'model',
      reqModelId: 'req_model_id',
      reqModelName: 'req_model_name',
      reqType: 'req_type',
      respModelId: 'resp_model_id',
      respModelName: 'resp_model_name',
      respType: 'resp_type',
      ingressList: 'ingress_list',
      content: 'content',
      apiCount: 'api_count',
      fieldMapping: 'field_mapping',
      needTls: 'need_tls',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiCacheModel: ApiCacheVO,
      apiGroup: ApiGroupVO,
      apiGroupId: 'string',
      apiGroupName: 'string',
      apiId: 'string',
      apiLimitConfig: LimitConfigVO,
      apiMockConfig: ApiMockConfigVO,
      apiName: 'string',
      apiStatus: 'string',
      appType: 'string',
      authenticationType: 'string',
      authAppCount: 'number',
      canDelete: 'boolean',
      charset: 'string',
      checkResult: 'string',
      completeInterfaceName: 'string',
      contentType: 'string',
      corsId: 'string',
      corsInfo: CorsInfoVO,
      currentVersionNo: 'string',
      description: 'string',
      domainName: 'string',
      downstreamProtocol: 'string',
      editVersion: ApiVersionVO,
      editVersionNo: 'string',
      externalAuth: ExternalAuthInfoVO,
      externalAuthId: 'string',
      functionName: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      interfaceName: 'string',
      method: 'string',
      onlineVersion: ApiVersionVO,
      onlineVersionNo: 'string',
      operationType: 'string',
      operator: 'string',
      path: 'string',
      pathMatchType: 'string',
      reqParams: { 'type': 'array', 'itemType': ApiParamVO },
      reqParamMapping: ParamMappingInfoVO,
      reqParamMappingId: 'string',
      reqParamMappingType: 'string',
      respParamMapping: ParamMappingInfoVO,
      respParamMappingId: 'string',
      routerId: 'string',
      routerInfo: RouterInfoVO,
      routerType: 'string',
      rsqParam: ApiParamVO,
      systemCluster: SystemClusterVO,
      sysId: 'string',
      targetWorkspaceId: 'string',
      tenantId: 'string',
      timeout: 'number',
      uniqueId: 'string',
      updateConfigList: { 'type': 'array', 'itemType': 'string' },
      upstreamParamMappings: { 'type': 'array', 'itemType': ApiParamVO },
      upstreamPath: 'string',
      upstreamProtocol: 'string',
      upstreamType: 'string',
      workspaceId: 'string',
      importResult: 'string',
      domainList: { 'type': 'array', 'itemType': ApiGroupDomainVO },
      strategyId: 'string',
      strategyInfo: StrategyInfoVO,
      apiType: 'string',
      apiCrossZoneList: { 'type': 'array', 'itemType': ApiCrossZoneVO },
      registryGroup: 'string',
      parameter: { 'type': 'array', 'itemType': 'string' },
      upFunctionName: 'string',
      paramPathList: { 'type': 'array', 'itemType': 'string' },
      serviceVersion: 'string',
      authAppInfoId: 'string',
      operationPermission: 'boolean',
      dataEncryption: 'string',
      egressList: { 'type': 'array', 'itemType': GateWayConfigVO },
      historyVersionList: { 'type': 'array', 'itemType': ApiVersionVO },
      ingress: 'string',
      model: 'string',
      reqModelId: 'string',
      reqModelName: 'string',
      reqType: 'string',
      respModelId: 'string',
      respModelName: 'string',
      respType: 'string',
      ingressList: { 'type': 'array', 'itemType': GateWayConfigVO },
      content: 'string',
      apiCount: 'number',
      fieldMapping: { 'type': 'array', 'itemType': ApiflowOutputVO },
      needTls: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// GrayscaleConfigVO
export class GrayscaleConfigVO extends $tea.Model {
  // gmt_create
  gmtCreate?: string;
  // gmt_modified
  gmtModified?: string;
  // router_type
  routerType?: string;
  // service
  service?: string;
  // matchable_service
  matchableService?: string;
  // instance_id
  instanceId?: string;
  // router_id
  routerId?: string;
  // app_name
  appName?: string;
  // valid
  valid?: string;
  // gray_rule_config_list
  grayRuleConfigList?: GrayRuleConfigVO[];
  static names(): { [key: string]: string } {
    return {
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      routerType: 'router_type',
      service: 'service',
      matchableService: 'matchable_service',
      instanceId: 'instance_id',
      routerId: 'router_id',
      appName: 'app_name',
      valid: 'valid',
      grayRuleConfigList: 'gray_rule_config_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      gmtCreate: 'string',
      gmtModified: 'string',
      routerType: 'string',
      service: 'string',
      matchableService: 'string',
      instanceId: 'string',
      routerId: 'string',
      appName: 'string',
      valid: 'string',
      grayRuleConfigList: { 'type': 'array', 'itemType': GrayRuleConfigVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiflowInstVO
export class ApiflowInstVO extends $tea.Model {
  // id
  id?: string;
  // machine_inst_id
  machineInstId?: string;
  // name
  name?: string;
  // type
  type?: string;
  // service_name
  serviceName?: string;
  // service_method
  serviceMethod?: string;
  // service_type
  serviceType?: string;
  // business_key
  businessKey?: string;
  // state_id_compensated_for
  stateIdCompensatedFor?: string;
  // state_id_retried_for
  stateIdRetriedFor?: string;
  // gmt_started
  gmtStarted?: string;
  // is_for_update
  isForUpdate?: boolean;
  // input_params
  inputParams?: string;
  // output_params
  outputParams?: string;
  // status
  status?: string;
  // excep
  excep?: string;
  // gmt_updated
  gmtUpdated?: string;
  // gmt_end
  gmtEnd?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      machineInstId: 'machine_inst_id',
      name: 'name',
      type: 'type',
      serviceName: 'service_name',
      serviceMethod: 'service_method',
      serviceType: 'service_type',
      businessKey: 'business_key',
      stateIdCompensatedFor: 'state_id_compensated_for',
      stateIdRetriedFor: 'state_id_retried_for',
      gmtStarted: 'gmt_started',
      isForUpdate: 'is_for_update',
      inputParams: 'input_params',
      outputParams: 'output_params',
      status: 'status',
      excep: 'excep',
      gmtUpdated: 'gmt_updated',
      gmtEnd: 'gmt_end',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      machineInstId: 'string',
      name: 'string',
      type: 'string',
      serviceName: 'string',
      serviceMethod: 'string',
      serviceType: 'string',
      businessKey: 'string',
      stateIdCompensatedFor: 'string',
      stateIdRetriedFor: 'string',
      gmtStarted: 'string',
      isForUpdate: 'boolean',
      inputParams: 'string',
      outputParams: 'string',
      status: 'string',
      excep: 'string',
      gmtUpdated: 'string',
      gmtEnd: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 后端配置
export class SofaGwUpstreamVO extends $tea.Model {
  // GET/POST/PUT/DELETE
  method?: string;
  // 协议
  schema?: string;
  // timeout
  timeout?: number;
  // url
  url?: string;
  // 是否签名
  verify?: boolean;
  static names(): { [key: string]: string } {
    return {
      method: 'method',
      schema: 'schema',
      timeout: 'timeout',
      url: 'url',
      verify: 'verify',
    };
  }

  static types(): { [key: string]: any } {
    return {
      method: 'string',
      schema: 'string',
      timeout: 'number',
      url: 'string',
      verify: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiInfoVO
export class ApiInfoVO extends $tea.Model {
  // API缓存模型
  apiCacheModel?: ApiCacheVO;
  // api的网关配置列表
  apiCrossZoneList?: ApiCrossZoneVO[];
  // API分组标识
  apiGroupId?: string;
  // 所属API分组名称
  apiGroupName?: string;
  // API标识
  apiId?: string;
  // API限流配置
  apiLimitConfig?: LimitConfigVO;
  // api_mock_config
  apiMockConfig?: ApiMockConfigVO;
  // API名称
  apiName?: string;
  // apiStatus
  apiStatus?: string;
  // crossZone双网关 (api 类型)
  apiType?: string;
  // 授权应用类型
  appType?: string;
  // authentication_type
  authenticationType?: string;
  // auth_app_count
  authAppCount?: number;
  // 授权应用Id
  authAppInfoId?: string;
  // 是否可以删除
  canDelete?: boolean;
  // 操作权限
  operationPermission?: boolean;
  // charset
  charset?: string;
  // 完整interfacename
  completeInterfaceName?: string;
  // contentType
  contentType?: string;
  // cors_id
  corsId?: string;
  // cors_info
  corsInfo?: CorsInfoVO;
  // 当前显示的版本
  currentVersionNo?: string;
  // 数据加密
  dataEncryption?: string;
  // description
  description?: string;
  // API分组域名
  domainName?: string;
  // downstreamProtocol
  downstreamProtocol?: string;
  // edit_version
  editVersion?: ApiVersionVO;
  // 编辑中的API版本号
  editVersionNo?: string;
  // 出口网关列表
  egressList?: GateWayConfigVO[];
  // external_auth
  externalAuth?: ExternalAuthInfoVO;
  // 外部系统标识
  externalAuthId?: string;
  // 方法名
  functionName?: string;
  // 创建时间
  gmtCreate?: string;
  // 更改时间
  gmtModified?: string;
  // history_version
  historyVersionList?: ApiVersionVO[];
  // 入口网关
  ingress?: GateWayConfigVO;
  // 接口名称
  interfaceName?: string;
  // method
  method?: string;
  // 网关模式
  model?: string;
  // onlineVersion
  onlineVersion?: ApiVersionVO;
  // 发布中的API版本号
  onlineVersionNo?: string;
  // operationType
  operationType?: string;
  // 创建人
  operator?: string;
  // path
  path?: string;
  // 路径匹配类型
  pathMatchType?: string;
  // 请求body模型id
  reqModelId?: string;
  // 请求模型名称
  reqModelName?: string;
  // reqParams
  reqParams?: ApiParamVO[];
  // reqparammapping
  reqParamMapping?: ParamMappingInfoVO;
  // 请求参数映射标识
  reqParamMappingId?: string;
  // 参数映射类型（普通\高级）
  reqParamMappingType?: string;
  // body类型一级参数
  reqType?: string;
  // 响应参数模型
  respModelId?: string;
  // 响应模型名称
  respModelName?: string;
  // respparammapping
  respParamMapping?: ParamMappingInfoVO;
  // 响应参数标识
  respParamMappingId?: string;
  // 响应参数一级类型
  respType?: string;
  // router_id
  routerId?: string;
  // 路由规则
  routerInfo?: RouterInfoVO;
  // 路由策略类型
  routerType?: string;
  // rsqParam
  rsqParam?: ApiParamVO;
  // 后端集群
  systemCluster?: SystemClusterVO;
  // sys_id
  sysId?: string;
  // 租户标识
  tenantId?: string;
  // timeout
  timeout?: number;
  // unique_id
  uniqueId?: string;
  // upstreamParamMappings
  upstreamParamMappings?: ApiParamVO[];
  // upstreamPath
  upstreamPath?: string;
  // upstreamProtocol
  upstreamProtocol?: string;
  // 后端服务类型
  upstreamType?: string;
  // 工作空间标识
  workspaceId?: string;
  // 策略ID
  strategyId?: string;
  // 策略详情
  strategyInfo?: StrategyInfoVO;
  // domain_list
  domainList?: ApiGroupDomainVO[];
  // registry_group
  registryGroup?: string;
  // param_path_list
  paramPathList?: string[];
  // 后端方法名
  upFunctionName?: string;
  // dubbo发布服务版本
  serviceVersion?: string;
  // 入口网关
  ingressList?: GateWayConfigVO[];
  // content
  content?: string;
  // api_count
  apiCount?: number;
  // 流程编排的返回参数映射
  fieldMapping?: ApiflowOutputVO[];
  // triple协议证书开关
  needTls?: boolean;
  // api_group
  apiGroup?: ApiGroupVO;
  // 授权对象列表
  authAppInfoList?: AuthAppInfoVO[];
  // 请求body数据模型
  reqModelInfo?: ApiModelVO;
  // 返回body数据模型
  rspModelInfo?: ApiModelVO;
  // 实例ID
  upstreamInstanceId?: string;
  // 跨域状态
  corsStatus?: string;
  // gray_type
  grayType?: boolean;
  static names(): { [key: string]: string } {
    return {
      apiCacheModel: 'api_cache_model',
      apiCrossZoneList: 'api_cross_zone_list',
      apiGroupId: 'api_group_id',
      apiGroupName: 'api_group_name',
      apiId: 'api_id',
      apiLimitConfig: 'api_limit_config',
      apiMockConfig: 'api_mock_config',
      apiName: 'api_name',
      apiStatus: 'api_status',
      apiType: 'api_type',
      appType: 'app_type',
      authenticationType: 'authentication_type',
      authAppCount: 'auth_app_count',
      authAppInfoId: 'auth_app_info_id',
      canDelete: 'can_delete',
      operationPermission: 'operation_permission',
      charset: 'charset',
      completeInterfaceName: 'complete_interface_name',
      contentType: 'content_type',
      corsId: 'cors_id',
      corsInfo: 'cors_info',
      currentVersionNo: 'current_version_no',
      dataEncryption: 'data_encryption',
      description: 'description',
      domainName: 'domain_name',
      downstreamProtocol: 'downstream_protocol',
      editVersion: 'edit_version',
      editVersionNo: 'edit_version_no',
      egressList: 'egress_list',
      externalAuth: 'external_auth',
      externalAuthId: 'external_auth_id',
      functionName: 'function_name',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      historyVersionList: 'history_version_list',
      ingress: 'ingress',
      interfaceName: 'interface_name',
      method: 'method',
      model: 'model',
      onlineVersion: 'online_version',
      onlineVersionNo: 'online_version_no',
      operationType: 'operation_type',
      operator: 'operator',
      path: 'path',
      pathMatchType: 'path_match_type',
      reqModelId: 'req_model_id',
      reqModelName: 'req_model_name',
      reqParams: 'req_params',
      reqParamMapping: 'req_param_mapping',
      reqParamMappingId: 'req_param_mapping_id',
      reqParamMappingType: 'req_param_mapping_type',
      reqType: 'req_type',
      respModelId: 'resp_model_id',
      respModelName: 'resp_model_name',
      respParamMapping: 'resp_param_mapping',
      respParamMappingId: 'resp_param_mapping_id',
      respType: 'resp_type',
      routerId: 'router_id',
      routerInfo: 'router_info',
      routerType: 'router_type',
      rsqParam: 'rsq_param',
      systemCluster: 'system_cluster',
      sysId: 'sys_id',
      tenantId: 'tenant_id',
      timeout: 'timeout',
      uniqueId: 'unique_id',
      upstreamParamMappings: 'upstream_param_mappings',
      upstreamPath: 'upstream_path',
      upstreamProtocol: 'upstream_protocol',
      upstreamType: 'upstream_type',
      workspaceId: 'workspace_id',
      strategyId: 'strategy_id',
      strategyInfo: 'strategy_info',
      domainList: 'domain_list',
      registryGroup: 'registry_group',
      paramPathList: 'param_path_list',
      upFunctionName: 'up_function_name',
      serviceVersion: 'service_version',
      ingressList: 'ingress_list',
      content: 'content',
      apiCount: 'api_count',
      fieldMapping: 'field_mapping',
      needTls: 'need_tls',
      apiGroup: 'api_group',
      authAppInfoList: 'auth_app_info_list',
      reqModelInfo: 'req_model_info',
      rspModelInfo: 'rsp_model_info',
      upstreamInstanceId: 'upstream_instance_id',
      corsStatus: 'cors_status',
      grayType: 'gray_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiCacheModel: ApiCacheVO,
      apiCrossZoneList: { 'type': 'array', 'itemType': ApiCrossZoneVO },
      apiGroupId: 'string',
      apiGroupName: 'string',
      apiId: 'string',
      apiLimitConfig: LimitConfigVO,
      apiMockConfig: ApiMockConfigVO,
      apiName: 'string',
      apiStatus: 'string',
      apiType: 'string',
      appType: 'string',
      authenticationType: 'string',
      authAppCount: 'number',
      authAppInfoId: 'string',
      canDelete: 'boolean',
      operationPermission: 'boolean',
      charset: 'string',
      completeInterfaceName: 'string',
      contentType: 'string',
      corsId: 'string',
      corsInfo: CorsInfoVO,
      currentVersionNo: 'string',
      dataEncryption: 'string',
      description: 'string',
      domainName: 'string',
      downstreamProtocol: 'string',
      editVersion: ApiVersionVO,
      editVersionNo: 'string',
      egressList: { 'type': 'array', 'itemType': GateWayConfigVO },
      externalAuth: ExternalAuthInfoVO,
      externalAuthId: 'string',
      functionName: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      historyVersionList: { 'type': 'array', 'itemType': ApiVersionVO },
      ingress: GateWayConfigVO,
      interfaceName: 'string',
      method: 'string',
      model: 'string',
      onlineVersion: ApiVersionVO,
      onlineVersionNo: 'string',
      operationType: 'string',
      operator: 'string',
      path: 'string',
      pathMatchType: 'string',
      reqModelId: 'string',
      reqModelName: 'string',
      reqParams: { 'type': 'array', 'itemType': ApiParamVO },
      reqParamMapping: ParamMappingInfoVO,
      reqParamMappingId: 'string',
      reqParamMappingType: 'string',
      reqType: 'string',
      respModelId: 'string',
      respModelName: 'string',
      respParamMapping: ParamMappingInfoVO,
      respParamMappingId: 'string',
      respType: 'string',
      routerId: 'string',
      routerInfo: RouterInfoVO,
      routerType: 'string',
      rsqParam: ApiParamVO,
      systemCluster: SystemClusterVO,
      sysId: 'string',
      tenantId: 'string',
      timeout: 'number',
      uniqueId: 'string',
      upstreamParamMappings: { 'type': 'array', 'itemType': ApiParamVO },
      upstreamPath: 'string',
      upstreamProtocol: 'string',
      upstreamType: 'string',
      workspaceId: 'string',
      strategyId: 'string',
      strategyInfo: StrategyInfoVO,
      domainList: { 'type': 'array', 'itemType': ApiGroupDomainVO },
      registryGroup: 'string',
      paramPathList: { 'type': 'array', 'itemType': 'string' },
      upFunctionName: 'string',
      serviceVersion: 'string',
      ingressList: { 'type': 'array', 'itemType': GateWayConfigVO },
      content: 'string',
      apiCount: 'number',
      fieldMapping: { 'type': 'array', 'itemType': ApiflowOutputVO },
      needTls: 'boolean',
      apiGroup: ApiGroupVO,
      authAppInfoList: { 'type': 'array', 'itemType': AuthAppInfoVO },
      reqModelInfo: ApiModelVO,
      rspModelInfo: ApiModelVO,
      upstreamInstanceId: 'string',
      corsStatus: 'string',
      grayType: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AuthUserInfoVO
export class AuthUserInfoVO extends $tea.Model {
  // api分组标识符
  apiGroupId?: string;
  // api标识符
  apiId?: string;
  // 授权状态
  authStatus?: string;
  // 授权用户唯一标识
  authUserId?: string;
  // 企业的唯一标识
  customer?: string;
  // 邮箱
  email?: string;
  // 创建日期
  gmtCreate?: string;
  // 修改时间
  gmtModified?: string;
  // 登录名
  loginName?: string;
  // 手机号
  mobile?: string;
  // 昵称
  nickName?: string;
  // operator
  operator?: string;
  // 真实性名
  realName?: string;
  // 操作员状态
  status?: string;
  // 租户ID
  tenantId?: string;
  // 用户标识
  userId?: string;
  // workspace id
  workspaceId?: string;
  // 工号
  workNo?: string;
  // 能否操作授权
  canAuth?: boolean;
  static names(): { [key: string]: string } {
    return {
      apiGroupId: 'api_group_id',
      apiId: 'api_id',
      authStatus: 'auth_status',
      authUserId: 'auth_user_id',
      customer: 'customer',
      email: 'email',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      loginName: 'login_name',
      mobile: 'mobile',
      nickName: 'nick_name',
      operator: 'operator',
      realName: 'real_name',
      status: 'status',
      tenantId: 'tenant_id',
      userId: 'user_id',
      workspaceId: 'workspace_id',
      workNo: 'work_no',
      canAuth: 'can_auth',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiGroupId: 'string',
      apiId: 'string',
      authStatus: 'string',
      authUserId: 'string',
      customer: 'string',
      email: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      loginName: 'string',
      mobile: 'string',
      nickName: 'string',
      operator: 'string',
      realName: 'string',
      status: 'string',
      tenantId: 'string',
      userId: 'string',
      workspaceId: 'string',
      workNo: 'string',
      canAuth: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// BatchActionResult
export class BatchActionResult extends $tea.Model {
  // 批量挂载结果
  results?: ActionResult[];
  // total_count
  totalCount?: number;
  // success_count
  successCount?: number;
  // failed_count
  failedCount?: number;
  static names(): { [key: string]: string } {
    return {
      results: 'results',
      totalCount: 'total_count',
      successCount: 'success_count',
      failedCount: 'failed_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      results: { 'type': 'array', 'itemType': ActionResult },
      totalCount: 'number',
      successCount: 'number',
      failedCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiTestParamVO
export class ApiTestParamVO extends $tea.Model {
  // location
  location?: string;
  // key
  key?: string;
  // value
  value?: string;
  static names(): { [key: string]: string } {
    return {
      location: 'location',
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      location: 'string',
      key: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// MonitorData
export class MonitorData extends $tea.Model {
  // 时间点
  timestamp?: number;
  // value
  value?: number;
  static names(): { [key: string]: string } {
    return {
      timestamp: 'timestamp',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      timestamp: 'number',
      value: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 操作人
export class OperatorVO extends $tea.Model {
  // 创建时间
  createTime?: string;
  // 企业的唯一标识
  customer?: string;
  // 邮箱
  email?: string;
  // 操作员ID
  id?: string;
  // 登录名
  loginName?: string;
  // 手机号
  mobile?: string;
  // 昵称
  nickName?: string;
  // 真实姓名
  realName?: string;
  // 操作员状态
  status?: string;
  // 租户
  tenants?: string[];
  // 操作员最近一次修改时间，ISO8601格式
  updateTime?: string;
  // 操作员工号
  workNo?: string;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      createTime: 'create_time',
      customer: 'customer',
      email: 'email',
      id: 'id',
      loginName: 'login_name',
      mobile: 'mobile',
      nickName: 'nick_name',
      realName: 'real_name',
      status: 'status',
      tenants: 'tenants',
      updateTime: 'update_time',
      workNo: 'work_no',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      createTime: 'string',
      customer: 'string',
      email: 'string',
      id: 'string',
      loginName: 'string',
      mobile: 'string',
      nickName: 'string',
      realName: 'string',
      status: 'string',
      tenants: { 'type': 'array', 'itemType': 'string' },
      updateTime: 'string',
      workNo: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ImportResult
export class ImportResult extends $tea.Model {
  // code
  code?: string;
  // 覆盖报错的配置
  errorConfig?: string;
  // error_message
  errorMessage?: string;
  // API的ID
  id?: string;
  // API的名称
  name?: string;
  // 覆盖成功的标识
  success?: boolean;
  // 覆盖失败的配置名称
  configName?: string;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      errorConfig: 'error_config',
      errorMessage: 'error_message',
      id: 'id',
      name: 'name',
      success: 'success',
      configName: 'config_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      errorConfig: 'string',
      errorMessage: 'string',
      id: 'string',
      name: 'string',
      success: 'boolean',
      configName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 集群里的服务器信息
export class SofaGwHostVO extends $tea.Model {
  // 服务器地址，域名或ip(:端口)
  address?: string;
  // host name
  hostName?: string;
  // 元信息
  metaData?: string;
  static names(): { [key: string]: string } {
    return {
      address: 'address',
      hostName: 'host_name',
      metaData: 'meta_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      address: 'string',
      hostName: 'string',
      metaData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// SystemConfigVO
export class SystemConfigVO extends $tea.Model {
  // config_key
  configKey?: string;
  // config_value
  configValue?: string;
  // 描述
  description?: string;
  // gateway_list
  gatewayList?: GateWayConfigVO[];
  // 创建时间
  gmtCreate?: string;
  // 更改时间
  gmtModified?: string;
  // instance_id
  instanceId?: string;
  // 创建人
  operator?: string;
  // switch_list
  switchList?: SwitchVO[];
  static names(): { [key: string]: string } {
    return {
      configKey: 'config_key',
      configValue: 'config_value',
      description: 'description',
      gatewayList: 'gateway_list',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      instanceId: 'instance_id',
      operator: 'operator',
      switchList: 'switch_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      configKey: 'string',
      configValue: 'string',
      description: 'string',
      gatewayList: { 'type': 'array', 'itemType': GateWayConfigVO },
      gmtCreate: 'string',
      gmtModified: 'string',
      instanceId: 'string',
      operator: 'string',
      switchList: { 'type': 'array', 'itemType': SwitchVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 访问控制
export class SofaGwControlVO extends $tea.Model {
  // 要添加的授权的app_name列表
  addItems?: string[];
  // 实例标识
  instanceId?: string;
  // 授权的app_name列表
  items?: string[];
  // 固定值：app
  match?: string;
  // 要删除的授权的app_name列表
  removeItems?: string[];
  // service name
  serviceName?: string;
  // 子类型，固定值：whitelist
  subType?: string;
  // 控制类型，固定值：access-control
  type?: string;
  static names(): { [key: string]: string } {
    return {
      addItems: 'add_items',
      instanceId: 'instance_id',
      items: 'items',
      match: 'match',
      removeItems: 'remove_items',
      serviceName: 'service_name',
      subType: 'sub_type',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      addItems: { 'type': 'array', 'itemType': 'string' },
      instanceId: 'string',
      items: { 'type': 'array', 'itemType': 'string' },
      match: 'string',
      removeItems: { 'type': 'array', 'itemType': 'string' },
      serviceName: 'string',
      subType: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiflowMachineInstVO
export class ApiflowMachineInstVO extends $tea.Model {
  // id
  id?: string;
  // machine_id
  machineId?: string;
  // tenant_id
  tenantId?: string;
  // parent_id
  parentId?: string;
  // gmt_started
  gmtStarted?: string;
  // business_key
  businessKey?: string;
  // start_params
  startParams?: string;
  // gmt_end
  gmtEnd?: string;
  // excep
  excep?: string;
  // end_params
  endParams?: string;
  // status
  status?: string;
  // compensation_status
  compensationStatus?: string;
  // is_running
  isRunning?: boolean;
  // gmt_updated
  gmtUpdated?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      machineId: 'machine_id',
      tenantId: 'tenant_id',
      parentId: 'parent_id',
      gmtStarted: 'gmt_started',
      businessKey: 'business_key',
      startParams: 'start_params',
      gmtEnd: 'gmt_end',
      excep: 'excep',
      endParams: 'end_params',
      status: 'status',
      compensationStatus: 'compensation_status',
      isRunning: 'is_running',
      gmtUpdated: 'gmt_updated',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      machineId: 'string',
      tenantId: 'string',
      parentId: 'string',
      gmtStarted: 'string',
      businessKey: 'string',
      startParams: 'string',
      gmtEnd: 'string',
      excep: 'string',
      endParams: 'string',
      status: 'string',
      compensationStatus: 'string',
      isRunning: 'boolean',
      gmtUpdated: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 前端配置
export class SofaGwDownstream extends $tea.Model {
  // 认证信息
  auth?: SofaGwAuthenticationVO[];
  // GET/POST/PUT/DELETE
  method?: string;
  // 协议
  schema?: string;
  // url
  url?: string;
  // 是否签名
  verify?: boolean;
  static names(): { [key: string]: string } {
    return {
      auth: 'auth',
      method: 'method',
      schema: 'schema',
      url: 'url',
      verify: 'verify',
    };
  }

  static types(): { [key: string]: any } {
    return {
      auth: { 'type': 'array', 'itemType': SofaGwAuthenticationVO },
      method: 'string',
      schema: 'string',
      url: 'string',
      verify: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 联系方式
export class ContactInfoVO extends $tea.Model {
  // 授权App标识
  authAppInfoId?: string;
  // 公司名称
  company?: string;
  // 联系方式标识
  contactId?: string;
  // 电子邮箱
  mail?: string;
  // 联系人姓名
  name?: string;
  // 电话号码
  tel?: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  // 创建时间
  gmtCreate?: string;
  // 更新时间
  gmtModified?: string;
  static names(): { [key: string]: string } {
    return {
      authAppInfoId: 'auth_app_info_id',
      company: 'company',
      contactId: 'contact_id',
      mail: 'mail',
      name: 'name',
      tel: 'tel',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authAppInfoId: 'string',
      company: 'string',
      contactId: 'string',
      mail: 'string',
      name: 'string',
      tel: 'string',
      tenantId: 'string',
      workspaceId: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiGroupPagedListVO
export class ApiGroupPagedListVO extends $tea.Model {
  // 当前页的数据
  list?: ApiGroupVO[];
  // page_info
  pageInfo?: PageInfo;
  static names(): { [key: string]: string } {
    return {
      list: 'list',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': ApiGroupVO },
      pageInfo: PageInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ExternalAuthInfoQueryVO
export class ExternalAuthInfoQueryVO extends $tea.Model {
  // 是否模糊搜索
  fuzzySearch?: boolean;
  // pageInfo
  pageInfo?: PageInfo;
  // query
  query?: ExternalAuthInfoVO;
  static names(): { [key: string]: string } {
    return {
      fuzzySearch: 'fuzzy_search',
      pageInfo: 'page_info',
      query: 'query',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fuzzySearch: 'boolean',
      pageInfo: PageInfo,
      query: ExternalAuthInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiflowMachineDefQueryVO
export class ApiflowMachineDefQueryVO extends $tea.Model {
  // fuzzy_search
  fuzzySearch?: boolean;
  // page_info
  pageInfo?: PageInfo;
  // query
  query?: ApiflowMachineDefVO;
  static names(): { [key: string]: string } {
    return {
      fuzzySearch: 'fuzzy_search',
      pageInfo: 'page_info',
      query: 'query',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fuzzySearch: 'boolean',
      pageInfo: PageInfo,
      query: ApiflowMachineDefVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiInfoQueryVO
export class ApiInfoQueryVO extends $tea.Model {
  // 是否模糊搜索
  fuzzySearch?: boolean;
  // pageInfo
  pageInfo?: PageInfo;
  // query
  query?: ApiInfoVO;
  // 自定义查询条件
  queryCondition?: string;
  static names(): { [key: string]: string } {
    return {
      fuzzySearch: 'fuzzy_search',
      pageInfo: 'page_info',
      query: 'query',
      queryCondition: 'query_condition',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fuzzySearch: 'boolean',
      pageInfo: PageInfo,
      query: ApiInfoVO,
      queryCondition: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// MonitoryAggregationVO
export class MonitoryAggregationVO extends $tea.Model {
  // invoke_num
  invokeNum?: MonitorData[];
  // qps
  qps?: MonitorData[];
  // rt
  rt?: MonitorData[];
  // 错误码
  errCode?: MonitorData[];
  // 错误率
  errRate?: MonitorData[];
  // byte_in
  byteIn?: MonitorData[];
  // byte_out
  byteOut?: MonitorData[];
  static names(): { [key: string]: string } {
    return {
      invokeNum: 'invoke_num',
      qps: 'qps',
      rt: 'rt',
      errCode: 'err_code',
      errRate: 'err_rate',
      byteIn: 'byte_in',
      byteOut: 'byte_out',
    };
  }

  static types(): { [key: string]: any } {
    return {
      invokeNum: { 'type': 'array', 'itemType': MonitorData },
      qps: { 'type': 'array', 'itemType': MonitorData },
      rt: { 'type': 'array', 'itemType': MonitorData },
      errCode: { 'type': 'array', 'itemType': MonitorData },
      errRate: { 'type': 'array', 'itemType': MonitorData },
      byteIn: { 'type': 'array', 'itemType': MonitorData },
      byteOut: { 'type': 'array', 'itemType': MonitorData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// RouterInfoQueryVO
export class RouterInfoQueryVO extends $tea.Model {
  // pageInfo
  pageInfo?: PageInfo;
  // query
  query?: RouterInfoVO;
  // 是否模糊搜索
  fuzzySearch?: boolean;
  static names(): { [key: string]: string } {
    return {
      pageInfo: 'page_info',
      query: 'query',
      fuzzySearch: 'fuzzy_search',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageInfo: PageInfo,
      query: RouterInfoVO,
      fuzzySearch: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// SystemClusterQueryVO
export class SystemClusterQueryVO extends $tea.Model {
  // 是否模糊搜索
  fuzzySearch?: boolean;
  // page_info
  pageInfo?: PageInfo;
  // query
  query?: SystemClusterVO;
  static names(): { [key: string]: string } {
    return {
      fuzzySearch: 'fuzzy_search',
      pageInfo: 'page_info',
      query: 'query',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fuzzySearch: 'boolean',
      pageInfo: PageInfo,
      query: SystemClusterVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiflowInstPagedListVO
export class ApiflowInstPagedListVO extends $tea.Model {
  // list
  list?: ApiflowInstVO[];
  // page_info
  pageInfo?: PageInfo;
  static names(): { [key: string]: string } {
    return {
      list: 'list',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': ApiflowInstVO },
      pageInfo: PageInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiflowMachineDefPagedListVO
export class ApiflowMachineDefPagedListVO extends $tea.Model {
  // list
  list?: ApiflowMachineDefVO[];
  // page_info
  pageInfo?: PageInfo;
  static names(): { [key: string]: string } {
    return {
      list: 'list',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': ApiflowMachineDefVO },
      pageInfo: PageInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AuthAppInfoQueryVO
export class AuthAppInfoQueryVO extends $tea.Model {
  // pageInfo
  pageInfo?: PageInfo;
  // query
  query?: AuthAppInfoVO;
  // 自定义查询条件
  queryCondition?: string;
  // 是否支持模糊查询
  fuzzySearch?: boolean;
  static names(): { [key: string]: string } {
    return {
      pageInfo: 'page_info',
      query: 'query',
      queryCondition: 'query_condition',
      fuzzySearch: 'fuzzy_search',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageInfo: PageInfo,
      query: AuthAppInfoVO,
      queryCondition: 'string',
      fuzzySearch: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiflowTestReqVO
export class ApiflowTestReqVO extends $tea.Model {
  // api_id
  apiId?: string;
  // workspace_id
  workspaceId?: string;
  // tenant_id
  tenantId?: string;
  // machine_name
  machineName?: string;
  // params
  inputParams?: ApiTestParamVO[];
  // output_params
  outputParams?: ApiflowOutputVO[];
  static names(): { [key: string]: string } {
    return {
      apiId: 'api_id',
      workspaceId: 'workspace_id',
      tenantId: 'tenant_id',
      machineName: 'machine_name',
      inputParams: 'input_params',
      outputParams: 'output_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiId: 'string',
      workspaceId: 'string',
      tenantId: 'string',
      machineName: 'string',
      inputParams: { 'type': 'array', 'itemType': ApiTestParamVO },
      outputParams: { 'type': 'array', 'itemType': ApiflowOutputVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// RouterInfoPagedListVO
export class RouterInfoPagedListVO extends $tea.Model {
  // list
  list?: RouterInfoVO[];
  // pageInfo
  pageInfo?: PageInfo;
  static names(): { [key: string]: string } {
    return {
      list: 'list',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': RouterInfoVO },
      pageInfo: PageInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// RegistryInfoQueryVO
export class RegistryInfoQueryVO extends $tea.Model {
  // 是否模糊搜索
  fuzzySearch?: boolean;
  // page_info
  pageInfo?: PageInfo;
  // query
  query?: RegistryInfoVO;
  static names(): { [key: string]: string } {
    return {
      fuzzySearch: 'fuzzy_search',
      pageInfo: 'page_info',
      query: 'query',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fuzzySearch: 'boolean',
      pageInfo: PageInfo,
      query: RegistryInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 入参
export class EngineVO extends $tea.Model {
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  // 流程编排标识
  templateId?: string;
  // 内嵌模式、云端模式
  engineType?: string;
  // add_request
  addRequest?: boolean;
  // add_timestamp
  addTimestamp?: boolean;
  // save_to_db
  saveToDb?: boolean;
  // 流程编排  （内嵌模式）初始化的入参
  params?: string;
  static names(): { [key: string]: string } {
    return {
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      templateId: 'template_id',
      engineType: 'engine_type',
      addRequest: 'add_request',
      addTimestamp: 'add_timestamp',
      saveToDb: 'save_to_db',
      params: 'params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tenantId: 'string',
      workspaceId: 'string',
      templateId: 'string',
      engineType: 'string',
      addRequest: 'boolean',
      addTimestamp: 'boolean',
      saveToDb: 'boolean',
      params: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// GrayscaleConfigPagedListVO
export class GrayscaleConfigPagedListVO extends $tea.Model {
  // list
  list?: GrayscaleConfigVO[];
  // page_info
  pageInfo?: PageInfo;
  static names(): { [key: string]: string } {
    return {
      list: 'list',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': GrayscaleConfigVO },
      pageInfo: PageInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// BatchImportResult
export class BatchImportResult extends $tea.Model {
  // failed_count
  failedCount?: number;
  // 重复的API列表
  repeatApiList?: ApiTransferVO[];
  // results
  results?: ImportResult[];
  // success_count
  successCount?: number;
  // total_count
  totalCount?: number;
  // 导入成功的API列表
  successApiList?: ApiInfoVO[];
  static names(): { [key: string]: string } {
    return {
      failedCount: 'failed_count',
      repeatApiList: 'repeat_api_list',
      results: 'results',
      successCount: 'success_count',
      totalCount: 'total_count',
      successApiList: 'success_api_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      failedCount: 'number',
      repeatApiList: { 'type': 'array', 'itemType': ApiTransferVO },
      results: { 'type': 'array', 'itemType': ImportResult },
      successCount: 'number',
      totalCount: 'number',
      successApiList: { 'type': 'array', 'itemType': ApiInfoVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 查询联系方式
export class ContactInfoQueryVO extends $tea.Model {
  // 分页信息
  pageInfo?: PageInfo;
  // query
  query?: ContactInfoVO;
  // 是否模糊搜索
  fuzzySearch?: boolean;
  static names(): { [key: string]: string } {
    return {
      pageInfo: 'page_info',
      query: 'query',
      fuzzySearch: 'fuzzy_search',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageInfo: PageInfo,
      query: ContactInfoVO,
      fuzzySearch: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// OperatorPagedListVO
export class OperatorPagedListVO extends $tea.Model {
  // 当前页的数据
  list?: OperatorVO[];
  // page_info
  pageInfo?: PageInfo;
  static names(): { [key: string]: string } {
    return {
      list: 'list',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': OperatorVO },
      pageInfo: PageInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 联系方式分页列表
export class ContactInfoPagedListVO extends $tea.Model {
  // 分页信息
  pageInfo?: PageInfo;
  // 联系方式列表
  list?: ContactInfoVO[];
  static names(): { [key: string]: string } {
    return {
      pageInfo: 'page_info',
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageInfo: PageInfo,
      list: { 'type': 'array', 'itemType': ContactInfoVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Api信息
export class SofaGwService extends $tea.Model {
  // app name
  appName?: string;
  // cluster name
  clusterName?: string;
  // controls
  controls?: SofaGwControlVO[];
  // downstream
  downstream?: SofaGwDownstream;
  // id
  id?: number;
  // 实例标识
  instanceId?: string;
  // service name
  name?: string;
  // service_version
  serviceVersion?: string;
  // 上线:online, 下线:offline
  status?: string;
  // upstream
  upstream?: SofaGwUpstreamVO;
  static names(): { [key: string]: string } {
    return {
      appName: 'app_name',
      clusterName: 'cluster_name',
      controls: 'controls',
      downstream: 'downstream',
      id: 'id',
      instanceId: 'instance_id',
      name: 'name',
      serviceVersion: 'service_version',
      status: 'status',
      upstream: 'upstream',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appName: 'string',
      clusterName: 'string',
      controls: { 'type': 'array', 'itemType': SofaGwControlVO },
      downstream: SofaGwDownstream,
      id: 'number',
      instanceId: 'string',
      name: 'string',
      serviceVersion: 'string',
      status: 'string',
      upstream: SofaGwUpstreamVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// cors分页信息
export class CorsInfoPagedListVO extends $tea.Model {
  // cors列表
  list?: CorsInfoVO[];
  // 分页信息
  pageInfo?: PageInfo;
  static names(): { [key: string]: string } {
    return {
      list: 'list',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': CorsInfoVO },
      pageInfo: PageInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiflowMachineInstQueryVO
export class ApiflowMachineInstQueryVO extends $tea.Model {
  // fuzzy_search
  fuzzySearch?: boolean;
  // page_info
  pageInfo?: PageInfo;
  // query
  query?: ApiflowMachineInstVO;
  static names(): { [key: string]: string } {
    return {
      fuzzySearch: 'fuzzy_search',
      pageInfo: 'page_info',
      query: 'query',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fuzzySearch: 'boolean',
      pageInfo: PageInfo,
      query: ApiflowMachineInstVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// SystemConfigQueryVO
export class SystemConfigQueryVO extends $tea.Model {
  // 是否模糊搜索
  fuzzySearch?: boolean;
  // page_info
  pageInfo?: PageInfo;
  // query
  query?: SystemConfigVO;
  static names(): { [key: string]: string } {
    return {
      fuzzySearch: 'fuzzy_search',
      pageInfo: 'page_info',
      query: 'query',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fuzzySearch: 'boolean',
      pageInfo: PageInfo,
      query: SystemConfigVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// StrategyInfoQueryVO
export class StrategyInfoQueryVO extends $tea.Model {
  // 分页信息
  pageInfo?: PageInfo;
  // query
  query?: StrategyInfoVO;
  // 是否模糊搜索
  fuzzySearch?: boolean;
  static names(): { [key: string]: string } {
    return {
      pageInfo: 'page_info',
      query: 'query',
      fuzzySearch: 'fuzzy_search',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageInfo: PageInfo,
      query: StrategyInfoVO,
      fuzzySearch: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// OperatorQueryVO
export class OperatorQueryVO extends $tea.Model {
  // pageInfo
  pageInfo?: PageInfo;
  // query
  query?: OperatorVO;
  static names(): { [key: string]: string } {
    return {
      pageInfo: 'page_info',
      query: 'query',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageInfo: PageInfo,
      query: OperatorVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiInfoPagedListVO
export class ApiInfoPagedListVO extends $tea.Model {
  // list
  list?: ApiInfoVO[];
  // pageInfo
  pageInfo?: PageInfo;
  static names(): { [key: string]: string } {
    return {
      list: 'list',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': ApiInfoVO },
      pageInfo: PageInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AppInfoPagedListVO
export class AppInfoPagedListVO extends $tea.Model {
  // list
  list?: AppInfoVO[];
  // pageInfo
  pageInfo?: PageInfo;
  static names(): { [key: string]: string } {
    return {
      list: 'list',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': AppInfoVO },
      pageInfo: PageInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ldc信息
export class LdcInfoVO extends $tea.Model {
  // 是否开启
  enable?: boolean;
  // 参数位置
  paramLocation?: string;
  // 参数名
  paramKey?: string;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      enable: 'enable',
      paramLocation: 'param_location',
      paramKey: 'param_key',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      enable: 'boolean',
      paramLocation: 'string',
      paramKey: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AppInfoQueryVO
export class AppInfoQueryVO extends $tea.Model {
  // pageInfo
  pageInfo?: PageInfo;
  // query
  query?: AppInfoVO;
  static names(): { [key: string]: string } {
    return {
      pageInfo: 'page_info',
      query: 'query',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageInfo: PageInfo,
      query: AppInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 策略分页信息
export class StrategyPagedListVO extends $tea.Model {
  // list
  list?: StrategyInfoVO[];
  // 分页信息
  pageInfo?: PageInfo;
  static names(): { [key: string]: string } {
    return {
      list: 'list',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': StrategyInfoVO },
      pageInfo: PageInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// RegionVO
export class RegionVO extends $tea.Model {
  // region_id
  id?: string;
  // region名称
  name?: string;
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

// ApiTransferResult
export class ApiTransferResult extends $tea.Model {
  // api配置
  apiTransferList?: ApiInfoVO[];
  // 批量转移结果
  batchActionResult?: BatchActionResult;
  // file_name
  fileName?: string;
  // 流程编排列表
  apiflowList?: ApiInfoVO[];
  static names(): { [key: string]: string } {
    return {
      apiTransferList: 'api_transfer_list',
      batchActionResult: 'batch_action_result',
      fileName: 'file_name',
      apiflowList: 'apiflow_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiTransferList: { 'type': 'array', 'itemType': ApiInfoVO },
      batchActionResult: BatchActionResult,
      fileName: 'string',
      apiflowList: { 'type': 'array', 'itemType': ApiInfoVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// HomePageVO
export class HomePageVO extends $tea.Model {
  // api分组数量
  apiGroupCount?: number;
  // api数量
  apiCount?: number;
  // app数量
  appCount?: number;
  static names(): { [key: string]: string } {
    return {
      apiGroupCount: 'api_group_count',
      apiCount: 'api_count',
      appCount: 'app_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiGroupCount: 'number',
      apiCount: 'number',
      appCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiflowInstQueryVO
export class ApiflowInstQueryVO extends $tea.Model {
  // fuzzy_search
  fuzzySearch?: boolean;
  // page_info
  pageInfo?: PageInfo;
  // query
  query?: ApiflowInstVO;
  static names(): { [key: string]: string } {
    return {
      fuzzySearch: 'fuzzy_search',
      pageInfo: 'page_info',
      query: 'query',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fuzzySearch: 'boolean',
      pageInfo: PageInfo,
      query: ApiflowInstVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ParamMappingInfoQueryVO
export class ParamMappingInfoQueryVO extends $tea.Model {
  // pageInfo
  pageInfo?: PageInfo;
  // query
  query?: ParamMappingInfoVO;
  // 支持模糊查询
  fuzzySearch?: boolean;
  static names(): { [key: string]: string } {
    return {
      pageInfo: 'page_info',
      query: 'query',
      fuzzySearch: 'fuzzy_search',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageInfo: PageInfo,
      query: ParamMappingInfoVO,
      fuzzySearch: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// RegistryInfoPagedListVO
export class RegistryInfoPagedListVO extends $tea.Model {
  // list
  list?: RegistryInfoVO[];
  // page_info
  pageInfo?: PageInfo;
  static names(): { [key: string]: string } {
    return {
      list: 'list',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': RegistryInfoVO },
      pageInfo: PageInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiGroupQueryVO
export class ApiGroupQueryVO extends $tea.Model {
  // page_info
  pageInfo?: PageInfo;
  // query
  query?: ApiGroupVO;
  // 是否模糊搜索
  fuzzySearch?: boolean;
  static names(): { [key: string]: string } {
    return {
      pageInfo: 'page_info',
      query: 'query',
      fuzzySearch: 'fuzzy_search',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageInfo: PageInfo,
      query: ApiGroupVO,
      fuzzySearch: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiTestRspVO
export class ApiTestRspVO extends $tea.Model {
  // code
  code?: string;
  // cost
  cost?: number;
  // size
  size?: number;
  // payload
  payload?: string;
  // headers
  headers?: ApiTestParamVO[];
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      cost: 'cost',
      size: 'size',
      payload: 'payload',
      headers: 'headers',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      cost: 'number',
      size: 'number',
      payload: 'string',
      headers: { 'type': 'array', 'itemType': ApiTestParamVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiModelPagedListVO
export class ApiModelPagedListVO extends $tea.Model {
  // list
  list?: ApiModelVO[];
  // page_info
  pageInfo?: PageInfo;
  static names(): { [key: string]: string } {
    return {
      list: 'list',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': ApiModelVO },
      pageInfo: PageInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiflowMachineInstPagedListVO
export class ApiflowMachineInstPagedListVO extends $tea.Model {
  // list
  list?: ApiflowMachineInstVO[];
  // page_info
  pageInfo?: PageInfo;
  static names(): { [key: string]: string } {
    return {
      list: 'list',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': ApiflowMachineInstVO },
      pageInfo: PageInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// api导入 效验返回体
export class CheckApiResult extends $tea.Model {
  // 导入的所有的API集合
  allApiList?: ApiTransferVO[];
  // API或者配置中有重复的集合
  failedApiList?: ApiTransferVO[];
  // 	
  // API包括配置无重复的集合
  successApiList?: ApiTransferVO[];
  // 失败api配置详情
  checkResult?: string;
  static names(): { [key: string]: string } {
    return {
      allApiList: 'all_api_list',
      failedApiList: 'failed_api_list',
      successApiList: 'success_api_list',
      checkResult: 'check_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      allApiList: { 'type': 'array', 'itemType': ApiTransferVO },
      failedApiList: { 'type': 'array', 'itemType': ApiTransferVO },
      successApiList: { 'type': 'array', 'itemType': ApiTransferVO },
      checkResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// CorsInfoQueryVO
export class CorsInfoQueryVO extends $tea.Model {
  // 分页信息
  pageInfo?: PageInfo;
  // query
  query?: CorsInfoVO;
  // 是否模糊搜索
  fuzzySearch?: boolean;
  static names(): { [key: string]: string } {
    return {
      pageInfo: 'page_info',
      query: 'query',
      fuzzySearch: 'fuzzy_search',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageInfo: PageInfo,
      query: CorsInfoVO,
      fuzzySearch: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 集群信息
export class SofaGwClusterVO extends $tea.Model {
  // app name
  appName?: string;
  // hosts
  hosts?: SofaGwHostVO[];
  // id
  id?: number;
  // 实例标识
  instanceId?: string;
  // 集群名
  name?: string;
  static names(): { [key: string]: string } {
    return {
      appName: 'app_name',
      hosts: 'hosts',
      id: 'id',
      instanceId: 'instance_id',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appName: 'string',
      hosts: { 'type': 'array', 'itemType': SofaGwHostVO },
      id: 'number',
      instanceId: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiGroupAuthUserConfigVO
export class ApiGroupAuthUserConfigVO extends $tea.Model {
  // api授权管理开关
  apiAuthUserSwitch?: string;
  // 是否是管理员
  checkMaster?: boolean;
  // 需要api授权管理
  needApiAuthUser?: boolean;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      apiAuthUserSwitch: 'api_auth_user_switch',
      checkMaster: 'check_master',
      needApiAuthUser: 'need_api_auth_user',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiAuthUserSwitch: 'string',
      checkMaster: 'boolean',
      needApiAuthUser: 'boolean',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiModelQueryVO
export class ApiModelQueryVO extends $tea.Model {
  // 支持模糊查询
  fuzzySearch?: boolean;
  // page_info
  pageInfo?: PageInfo;
  // query
  query?: ApiModelVO;
  static names(): { [key: string]: string } {
    return {
      fuzzySearch: 'fuzzy_search',
      pageInfo: 'page_info',
      query: 'query',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fuzzySearch: 'boolean',
      pageInfo: PageInfo,
      query: ApiModelVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ApiTestReqVO
export class ApiTestReqVO extends $tea.Model {
  // API标识
  apiId?: string;
  // 应用标识
  appId?: string;
  // params
  params?: ApiTestParamVO[];
  // payload
  payload?: string;
  // tenant_id
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      apiId: 'api_id',
      appId: 'app_id',
      params: 'params',
      payload: 'payload',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiId: 'string',
      appId: 'string',
      params: { 'type': 'array', 'itemType': ApiTestParamVO },
      payload: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ParamMappingInfoPagedListVO
export class ParamMappingInfoPagedListVO extends $tea.Model {
  // list
  list?: ParamMappingInfoVO[];
  // pageInfo
  pageInfo?: PageInfo;
  static names(): { [key: string]: string } {
    return {
      list: 'list',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': ParamMappingInfoVO },
      pageInfo: PageInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// MonitoryRequest
export class MonitoryRequest extends $tea.Model {
  // API标识
  apiId?: string;
  // App标识
  appId?: string;
  // code
  code?: string;
  // 开始时间
  startTime?: number;
  // end_time
  endTime?: number;
  static names(): { [key: string]: string } {
    return {
      apiId: 'api_id',
      appId: 'app_id',
      code: 'code',
      startTime: 'start_time',
      endTime: 'end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiId: 'string',
      appId: 'string',
      code: 'string',
      startTime: 'number',
      endTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AuthUserInfoQueryVO
export class AuthUserInfoQueryVO extends $tea.Model {
  // pageInfo
  pageInfo?: PageInfo;
  // OperatorVO
  query?: AuthUserInfoVO;
  // 是否模糊搜索
  fuzzySearch?: boolean;
  static names(): { [key: string]: string } {
    return {
      pageInfo: 'page_info',
      query: 'query',
      fuzzySearch: 'fuzzy_search',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageInfo: PageInfo,
      query: AuthUserInfoVO,
      fuzzySearch: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ExternalAuthInfoPagedListVO
export class ExternalAuthInfoPagedListVO extends $tea.Model {
  // list
  list?: ExternalAuthInfoVO[];
  // pageInfo
  pageInfo?: PageInfo;
  static names(): { [key: string]: string } {
    return {
      list: 'list',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': ExternalAuthInfoVO },
      pageInfo: PageInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// SystemClusterPagedListVO
export class SystemClusterPagedListVO extends $tea.Model {
  // list
  list?: SystemClusterVO[];
  // page_info
  pageInfo?: PageInfo;
  static names(): { [key: string]: string } {
    return {
      list: 'list',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': SystemClusterVO },
      pageInfo: PageInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// GrayscaleConfigQueryVO
export class GrayscaleConfigQueryVO extends $tea.Model {
  // fuzzy_search
  fuzzySearch?: boolean;
  // page_info
  pageInfo?: PageInfo;
  // query
  query?: GrayscaleConfigVO;
  static names(): { [key: string]: string } {
    return {
      fuzzySearch: 'fuzzy_search',
      pageInfo: 'page_info',
      query: 'query',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fuzzySearch: 'boolean',
      pageInfo: PageInfo,
      query: GrayscaleConfigVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// API分组 或 应用
export class SofaGwAppVO extends $tea.Model {
  // 应用认证信息
  authentications?: SofaGwAuthenticationVO[];
  // 应用描述信息
  description?: string;
  // 实例标识
  id?: number;
  // 实例标识
  instanceId?: string;
  // 名称
  name?: string;
  // services
  services?: string[];
  // api分组(服务提供方)用 PUBLISHER，应用(服务使用方)用 SUBSCRIBER
  type?: string;
  static names(): { [key: string]: string } {
    return {
      authentications: 'authentications',
      description: 'description',
      id: 'id',
      instanceId: 'instance_id',
      name: 'name',
      services: 'services',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authentications: { 'type': 'array', 'itemType': SofaGwAuthenticationVO },
      description: 'string',
      id: 'number',
      instanceId: 'string',
      name: 'string',
      services: { 'type': 'array', 'itemType': 'string' },
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AuthAppInfoPagedListVO
export class AuthAppInfoPagedListVO extends $tea.Model {
  // list
  list?: AuthAppInfoVO[];
  // pageInfo
  pageInfo?: PageInfo;
  static names(): { [key: string]: string } {
    return {
      list: 'list',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': AuthAppInfoVO },
      pageInfo: PageInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AuthUserInfoPagedListVO
export class AuthUserInfoPagedListVO extends $tea.Model {
  // 当前页的数据
  list?: AuthUserInfoVO[];
  // page_info
  pageInfo?: PageInfo;
  static names(): { [key: string]: string } {
    return {
      list: 'list',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': AuthUserInfoVO },
      pageInfo: PageInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateApigroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ApiGroupVO;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiGroupVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateApigroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiGroupVO;
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
      data: ApiGroupVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllApigroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ApiGroupQueryVO;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiGroupQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllApigroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiGroupVO[];
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
      data: { 'type': 'array', 'itemType': ApiGroupVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListApigroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ApiGroupQueryVO;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiGroupQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListApigroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiGroupPagedListVO;
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
      data: ApiGroupPagedListVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSysRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: SystemClusterVO;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: SystemClusterVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSysResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: SystemClusterVO;
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
      data: SystemClusterVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllSysRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: SystemClusterQueryVO;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: SystemClusterQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllSysResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: SystemClusterVO[];
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
      data: { 'type': 'array', 'itemType': SystemClusterVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSysRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: SystemClusterQueryVO;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: SystemClusterQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSysResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: SystemClusterPagedListVO;
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
      data: SystemClusterPagedListVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetApigroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // api_group_id
  apiGroupId: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiGroupId: 'api_group_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiGroupId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetApigroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiGroupVO;
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
      data: ApiGroupVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateApigroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ApiGroupVO;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiGroupVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateApigroupResponse extends $tea.Model {
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

export class DeleteApigroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // api_group_id
  apiGroupId: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiGroupId: 'api_group_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiGroupId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteApigroupResponse extends $tea.Model {
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

export class CreateApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ApiInfoVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiInfoVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiInfoVO;
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
      data: ApiInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ApiInfoVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiInfoVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateApiResponse extends $tea.Model {
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

export class AllApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ApiInfoQueryVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiInfoQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiInfoVO[];
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
      data: { 'type': 'array', 'itemType': ApiInfoVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ApiInfoQueryVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiInfoQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiInfoPagedListVO;
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
      data: ApiInfoPagedListVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // API标识
  apiId: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  // api_type
  apiType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiId: 'api_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      apiType: 'api_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
      apiType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiInfoVO;
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
      data: ApiInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAppRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: AppInfoVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: AppInfoVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAppResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: AppInfoVO;
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
      data: AppInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAppRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: AppInfoVO;
  // 租户 标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: AppInfoVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAppResponse extends $tea.Model {
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

export class AllAppRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: AppInfoQueryVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: AppInfoQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllAppResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: AppInfoVO[];
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
      data: { 'type': 'array', 'itemType': AppInfoVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAppRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: AppInfoQueryVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: AppInfoQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAppResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: AppInfoPagedListVO;
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
      data: AppInfoPagedListVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAppRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // App标识
  appId: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  // 查询类型，不填默认查询传递的wsId的appId,填写outer可以查询跨租户app
  queryType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appId: 'app_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      queryType: 'query_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
      queryType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAppResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: AppInfoVO;
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
      data: AppInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAuthappRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: AuthAppInfoVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: AuthAppInfoVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAuthappResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: AuthAppInfoVO;
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
      data: AuthAppInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAuthappRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: AuthAppInfoVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: AuthAppInfoVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAuthappResponse extends $tea.Model {
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

export class DeleteAuthappRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授权App信息标识
  authAppInfoId: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authAppInfoId: 'auth_app_info_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authAppInfoId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAuthappResponse extends $tea.Model {
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

export class AllAuthappRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: AuthAppInfoQueryVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: AuthAppInfoQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllAuthappResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: AuthAppInfoVO[];
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
      data: { 'type': 'array', 'itemType': AuthAppInfoVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAuthappRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: AuthAppInfoQueryVO;
  // 租户标识
  tenantId?: string;
  // 工作空间 标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: AuthAppInfoQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAuthappResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: AuthAppInfoPagedListVO;
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
      data: AuthAppInfoPagedListVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAuthappRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授权App信息标识
  authAppInfoId: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authAppInfoId: 'auth_app_info_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authAppInfoId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAuthappResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: AuthAppInfoVO;
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
      data: AuthAppInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRouterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: RouterInfoVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: RouterInfoVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRouterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: RouterInfoVO;
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
      data: RouterInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateRouterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: RouterInfoVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: RouterInfoVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateRouterResponse extends $tea.Model {
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

export class DeleteRouterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 路由规则标识
  routerId: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      routerId: 'router_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      routerId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteRouterResponse extends $tea.Model {
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

export class AllRouterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: RouterInfoQueryVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: RouterInfoQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllRouterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: RouterInfoVO[];
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
      data: { 'type': 'array', 'itemType': RouterInfoVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRouterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: RouterInfoQueryVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: RouterInfoQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRouterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: RouterInfoPagedListVO;
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
      data: RouterInfoPagedListVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRouterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 路由规则标识
  routerId: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      routerId: 'router_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      routerId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRouterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: RouterInfoVO;
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
      data: RouterInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSysRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: SystemClusterVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: SystemClusterVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSysResponse extends $tea.Model {
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

export class DeleteSysRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 后端集群标识
  sysId: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sysId: 'sys_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sysId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSysResponse extends $tea.Model {
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

export class GetSysRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 后端集群标识
  sysId: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sysId: 'sys_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sysId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSysResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: SystemClusterVO;
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
      data: SystemClusterVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllApigroupApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // API分组标识
  apiGroupId: string;
  // param
  param?: ApiInfoQueryVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiGroupId: 'api_group_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiGroupId: 'string',
      param: ApiInfoQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllApigroupApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiInfoVO[];
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
      data: { 'type': 'array', 'itemType': ApiInfoVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAppRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // App标识
  appId: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appId: 'app_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAppResponse extends $tea.Model {
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

export class DeleteApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // API标识
  apiId: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  // api_type
  apiType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiId: 'api_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      apiType: 'api_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
      apiType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteApiResponse extends $tea.Model {
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

export class ListApigroupApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // API分组标识
  apiGroupId: string;
  // param
  param?: ApiInfoQueryVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiGroupId: 'api_group_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiGroupId: 'string',
      param: ApiInfoQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListApigroupApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiInfoPagedListVO;
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
      data: ApiInfoPagedListVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAuthappApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授权API标识
  authAppInfoId: string;
  // param
  param?: ApiInfoQueryVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authAppInfoId: 'auth_app_info_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authAppInfoId: 'string',
      param: ApiInfoQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAuthappApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiInfoPagedListVO;
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
      data: ApiInfoPagedListVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllSysApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ApiInfoQueryVO;
  // 后端集群标识
  sysId: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      sysId: 'sys_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiInfoQueryVO,
      sysId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllSysApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiInfoVO[];
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
      data: { 'type': 'array', 'itemType': ApiInfoVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSysApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ApiInfoQueryVO;
  // 后端集群标识
  sysId: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      sysId: 'sys_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiInfoQueryVO,
      sysId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSysApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiInfoPagedListVO;
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
      data: ApiInfoPagedListVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllRouterApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ApiInfoQueryVO;
  // 路由规则ID
  routerId?: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      routerId: 'router_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiInfoQueryVO,
      routerId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllRouterApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiInfoVO[];
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
      data: { 'type': 'array', 'itemType': ApiInfoVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRouterApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ApiInfoQueryVO;
  // 路由规则ID
  routerId?: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      routerId: 'router_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiInfoQueryVO,
      routerId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRouterApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiInfoPagedListVO;
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
      data: ApiInfoPagedListVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateApiVersionnoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // API标识
  apiId?: string;
  // 租户标识
  tenantId?: string;
  // 版本号
  versionNo?: string;
  // 工作空间标识
  workspaceId?: string;
  // api_type
  apiType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiId: 'api_id',
      tenantId: 'tenant_id',
      versionNo: 'version_no',
      workspaceId: 'workspace_id',
      apiType: 'api_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiId: 'string',
      tenantId: 'string',
      versionNo: 'string',
      workspaceId: 'string',
      apiType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateApiVersionnoResponse extends $tea.Model {
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

export class OfflineApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // API标识
  apiIdList: string[];
  // 下线描述
  offlineDesc?: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  // api_type
  apiType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiIdList: 'api_id_list',
      offlineDesc: 'offline_desc',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      apiType: 'api_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiIdList: { 'type': 'array', 'itemType': 'string' },
      offlineDesc: 'string',
      tenantId: 'string',
      workspaceId: 'string',
      apiType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OfflineApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: BatchActionResult;
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
      data: BatchActionResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllAuthappApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授权App标识
  authAppInfoId: string;
  // param
  param?: ApiInfoQueryVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authAppInfoId: 'auth_app_info_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authAppInfoId: 'string',
      param: ApiInfoQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllAuthappApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiInfoVO[];
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
      data: { 'type': 'array', 'itemType': ApiInfoVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class MountApiAuthappRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // API标识
  apiId: string;
  // 授权App标识列表
  authAppInfoIdList: string[];
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiId: 'api_id',
      authAppInfoIdList: 'auth_app_info_id_list',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiId: 'string',
      authAppInfoIdList: { 'type': 'array', 'itemType': 'string' },
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class MountApiAuthappResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: BatchActionResult;
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
      data: BatchActionResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OnlineApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // API标识
  apiIdList: string[];
  // 上线描述
  onlineDesc?: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  // api_type
  apiType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiIdList: 'api_id_list',
      onlineDesc: 'online_desc',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      apiType: 'api_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiIdList: { 'type': 'array', 'itemType': 'string' },
      onlineDesc: 'string',
      tenantId: 'string',
      workspaceId: 'string',
      apiType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OnlineApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: BatchActionResult;
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
      data: BatchActionResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllApiAuthappRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // API标识
  apiId: string;
  // param
  param?: AuthAppInfoQueryVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiId: 'api_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiId: 'string',
      param: AuthAppInfoQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllApiAuthappResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: AuthAppInfoVO[];
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
      data: { 'type': 'array', 'itemType': AuthAppInfoVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListApiAuthappRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // API标识
  apiId: string;
  // param
  param?: AuthAppInfoQueryVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiId: 'api_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiId: 'string',
      param: AuthAppInfoQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListApiAuthappResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: AuthAppInfoPagedListVO;
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
      data: AuthAppInfoPagedListVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllAppApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // App标识
  appId: string;
  // param
  param?: ApiInfoQueryVO;
  // 工作空间标识
  workspaceId?: string;
  // 租户标识
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appId: 'app_id',
      param: 'param',
      workspaceId: 'workspace_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appId: 'string',
      param: ApiInfoQueryVO,
      workspaceId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllAppApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiInfoVO[];
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
      data: { 'type': 'array', 'itemType': ApiInfoVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAppApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // App标识
  appId: string;
  // param
  param?: ApiInfoQueryVO;
  // 工作空间标识
  workspaceId?: string;
  // 租户标识
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appId: 'app_id',
      param: 'param',
      workspaceId: 'workspace_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appId: 'string',
      param: ApiInfoQueryVO,
      workspaceId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAppApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiInfoPagedListVO;
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
      data: ApiInfoPagedListVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCommonRandomakskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCommonRandomakskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: AuthenticationConfigVO;
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
      data: AuthenticationConfigVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContactRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ContactInfoVO;
  // 工作空间标识
  workspaceId?: string;
  // 租户标识
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      workspaceId: 'workspace_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ContactInfoVO,
      workspaceId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContactResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ContactInfoVO;
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
      data: ContactInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateContactRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ContactInfoVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ContactInfoVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateContactResponse extends $tea.Model {
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

export class DeleteContactRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  // 联系方式标识
  contactId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      contactId: 'contact_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
      contactId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteContactResponse extends $tea.Model {
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

export class GetContactRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联系方式标识
  contactId?: string;
  // 工作空间标识
  workspaceId?: string;
  // 租户标识
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      contactId: 'contact_id',
      workspaceId: 'workspace_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      contactId: 'string',
      workspaceId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetContactResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ContactInfoVO;
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
      data: ContactInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListContactRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ContactInfoQueryVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ContactInfoQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListContactResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ContactInfoPagedListVO;
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
      data: ContactInfoPagedListVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListContactAuthappRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授权App ID
  authAppInfoId?: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  // param
  param?: ContactInfoQueryVO;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authAppInfoId: 'auth_app_info_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      param: 'param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authAppInfoId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
      param: ContactInfoQueryVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListContactAuthappResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ContactInfoPagedListVO;
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
      data: ContactInfoPagedListVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnmountApiAuthappRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // api_id
  apiId: string;
  // auth_app_info_id_list
  authAppInfoIdList: string[];
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiId: 'api_id',
      authAppInfoIdList: 'auth_app_info_id_list',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiId: 'string',
      authAppInfoIdList: { 'type': 'array', 'itemType': 'string' },
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnmountApiAuthappResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: BatchActionResult;
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
      data: BatchActionResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetApiVersionapiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // api_id
  apiId: string;
  // tenant_id
  tenantId?: string;
  // version_id
  versionId: string;
  // workspace_id
  workspaceId?: string;
  // api_type
  apiType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiId: 'api_id',
      tenantId: 'tenant_id',
      versionId: 'version_id',
      workspaceId: 'workspace_id',
      apiType: 'api_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiId: 'string',
      tenantId: 'string',
      versionId: 'string',
      workspaceId: 'string',
      apiType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetApiVersionapiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiInfoVO;
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
      data: ApiInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCorsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: CorsInfoVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: CorsInfoVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCorsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: CorsInfoVO;
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
      data: CorsInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateCorsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: CorsInfoVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: CorsInfoVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateCorsResponse extends $tea.Model {
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

export class DeleteCorsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 路由规则标识
  corsId?: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      corsId: 'cors_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      corsId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteCorsResponse extends $tea.Model {
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

export class AllCorsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: CorsInfoQueryVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: CorsInfoQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllCorsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: CorsInfoVO[];
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
      data: { 'type': 'array', 'itemType': CorsInfoVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCorsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: CorsInfoQueryVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: CorsInfoQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCorsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: CorsInfoPagedListVO;
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
      data: CorsInfoPagedListVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCorsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 路由规则标识
  corsId?: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      corsId: 'cors_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      corsId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCorsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: CorsInfoVO;
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
      data: CorsInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllCorsApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ApiInfoQueryVO;
  // cors标识
  corsId?: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      corsId: 'cors_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiInfoQueryVO,
      corsId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllCorsApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiInfoVO[];
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
      data: { 'type': 'array', 'itemType': ApiInfoVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCorsApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ApiInfoQueryVO;
  // cors标识
  corsId?: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      corsId: 'cors_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiInfoQueryVO,
      corsId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCorsApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiInfoPagedListVO;
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
      data: ApiInfoPagedListVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class MountCorsApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 绑定的API ID列表
  apiIdList?: string[];
  // cors标识
  corsId?: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiIdList: 'api_id_list',
      corsId: 'cors_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiIdList: { 'type': 'array', 'itemType': 'string' },
      corsId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class MountCorsApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: BatchActionResult;
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
      data: BatchActionResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnmountCorsApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 绑定的API ID列表
  apiIdList?: string[];
  // cors标识
  corsId?: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiIdList: 'api_id_list',
      corsId: 'cors_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiIdList: { 'type': 'array', 'itemType': 'string' },
      corsId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnmountCorsApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: BatchActionResult;
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
      data: BatchActionResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecTestHttpRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ApiTestReqVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiTestReqVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecTestHttpResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiTestRspVO;
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
      data: ApiTestRspVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateApiAuthapplimitRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // API标识
  apiId?: string;
  // 授权应用标识
  authAppInfoId?: string;
  // 限流配置
  limitConfig?: LimitConfigVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiId: 'api_id',
      authAppInfoId: 'auth_app_info_id',
      limitConfig: 'limit_config',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiId: 'string',
      authAppInfoId: 'string',
      limitConfig: LimitConfigVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateApiAuthapplimitResponse extends $tea.Model {
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

export class GetApiAuthapplimitRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // api_id
  apiId?: string;
  // 授权应用标识
  authAppInfoId?: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiId: 'api_id',
      authAppInfoId: 'auth_app_info_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiId: 'string',
      authAppInfoId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetApiAuthapplimitResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: LimitConfigVO;
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
      data: LimitConfigVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateApiLimitconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // API标识
  apiId: string;
  // 限流配置
  limitConfig?: LimitConfigVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiId: 'api_id',
      limitConfig: 'limit_config',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiId: 'string',
      limitConfig: LimitConfigVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateApiLimitconfigResponse extends $tea.Model {
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

export class UpdateApiCacheinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // API标识
  apiId?: string;
  // param
  param?: ApiCacheVO;
  // 工作空间标识
  workspaceId?: string;
  // 租户标识
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiId: 'api_id',
      param: 'param',
      workspaceId: 'workspace_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiId: 'string',
      param: ApiCacheVO,
      workspaceId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateApiCacheinfoResponse extends $tea.Model {
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

export class QueryMonitorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  // param
  param?: MonitoryRequest;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      param: 'param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
      param: MonitoryRequest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMonitorResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: MonitoryAggregationVO;
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
      data: MonitoryAggregationVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryResultcodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 工作空间标识
  workspaceId?: string;
  // 租户标识
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      workspaceId: 'workspace_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      workspaceId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryResultcodeResponse extends $tea.Model {
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

export class OnlineApiVersionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // api_id
  apiId?: string;
  // online_desc
  onlineDesc?: string;
  // tenant_id
  tenantId?: string;
  // version_id
  versionId?: string;
  // workspace_id
  workspaceId?: string;
  // api_type
  apiType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiId: 'api_id',
      onlineDesc: 'online_desc',
      tenantId: 'tenant_id',
      versionId: 'version_id',
      workspaceId: 'workspace_id',
      apiType: 'api_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiId: 'string',
      onlineDesc: 'string',
      tenantId: 'string',
      versionId: 'string',
      workspaceId: 'string',
      apiType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OnlineApiVersionResponse extends $tea.Model {
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

export class CreateLdcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: LdcInfoVO;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: LdcInfoVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLdcResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: LdcInfoVO;
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
      data: LdcInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateLdcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: LdcInfoVO;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: LdcInfoVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateLdcResponse extends $tea.Model {
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

export class DeleteLdcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // tenant_id
  tenantId: string;
  // workspace_id
  workspaceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteLdcResponse extends $tea.Model {
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

export class GetLdcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // tenant_id
  tenantId: string;
  // workspace_id
  workspaceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetLdcResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: LdcInfoVO;
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
      data: LdcInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveLdcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: LdcInfoVO;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: LdcInfoVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveLdcResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: LdcInfoVO;
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
      data: LdcInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class MountAuthappApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // api标识列表
  apiInfoIdList: string[];
  // 授权APP标识
  authAppInfoId: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiInfoIdList: 'api_info_id_list',
      authAppInfoId: 'auth_app_info_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiInfoIdList: { 'type': 'array', 'itemType': 'string' },
      authAppInfoId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class MountAuthappApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: BatchActionResult;
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
      data: BatchActionResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnmountAuthappApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // api标识列表
  apiInfoIdList: string[];
  // 授权APP标识
  authAppInfoId: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiInfoIdList: 'api_info_id_list',
      authAppInfoId: 'auth_app_info_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiInfoIdList: { 'type': 'array', 'itemType': 'string' },
      authAppInfoId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnmountAuthappApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: BatchActionResult;
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
      data: BatchActionResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 分组id
  apiGroupId?: string;
  // api_transfer_list字符串
  apiTransferList?: string;
  // 租户标识
  tenantId?: string;
  // null效验api及配置是否重复，true覆盖，false跳过
  updateFlag?: boolean;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiGroupId: 'api_group_id',
      apiTransferList: 'api_transfer_list',
      tenantId: 'tenant_id',
      updateFlag: 'update_flag',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiGroupId: 'string',
      apiTransferList: 'string',
      tenantId: 'string',
      updateFlag: 'boolean',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: BatchImportResult;
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
      data: BatchImportResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // apiId集合
  apiInfoIdList: string[];
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiInfoIdList: 'api_info_id_list',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiInfoIdList: { 'type': 'array', 'itemType': 'string' },
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiTransferResult;
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
      data: ApiTransferResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportApigroupApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // API分组标识
  apiGroupId: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiGroupId: 'api_group_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiGroupId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportApigroupApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiTransferResult;
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
      data: ApiTransferResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateParammappingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ParamMappingInfoVO;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ParamMappingInfoVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateParammappingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ParamMappingInfoVO;
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
      data: ParamMappingInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateParammappingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ParamMappingInfoVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ParamMappingInfoVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateParammappingResponse extends $tea.Model {
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

export class DeleteParammappingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 参数映射标识
  paramMappingId: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      paramMappingId: 'param_mapping_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      paramMappingId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteParammappingResponse extends $tea.Model {
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

export class ListParammappingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ParamMappingInfoQueryVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ParamMappingInfoQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListParammappingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ParamMappingInfoPagedListVO;
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
      data: ParamMappingInfoPagedListVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllParammappingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ParamMappingInfoQueryVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ParamMappingInfoQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllParammappingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ParamMappingInfoVO[];
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
      data: { 'type': 'array', 'itemType': ParamMappingInfoVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetParammappingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 参数映射标识
  paramMappingId: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  // 
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      paramMappingId: 'param_mapping_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      paramMappingId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetParammappingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ParamMappingInfoVO;
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
      data: ParamMappingInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListParammappingApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ApiInfoQueryVO;
  // 参数映射标识
  paramMappingId: string;
  // 	
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      paramMappingId: 'param_mapping_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiInfoQueryVO,
      paramMappingId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListParammappingApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiInfoPagedListVO;
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
      data: ApiInfoPagedListVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllApimodelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ApiModelQueryVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识	
  // 
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiModelQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllApimodelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiModelVO[];
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
      data: { 'type': 'array', 'itemType': ApiModelVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListApimodelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ApiModelQueryVO;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiModelQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListApimodelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiModelPagedListVO;
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
      data: ApiModelPagedListVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateApimodelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ApiModelVO;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiModelVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateApimodelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiModelVO;
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
      data: ApiModelVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteApimodelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // api_model_id
  apiModelId: string;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiModelId: 'api_model_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiModelId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteApimodelResponse extends $tea.Model {
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

export class GetApimodelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // api_model_id
  apiModelId: string;
  // 查询模型的名称
  modelName?: string;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiModelId: 'api_model_id',
      modelName: 'model_name',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiModelId: 'string',
      modelName: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetApimodelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiModelVO;
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
      data: ApiModelVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateApimodelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ApiModelVO;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiModelVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateApimodelResponse extends $tea.Model {
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

export class AllApimodelApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 模型id
  apiModelId: string;
  // param
  param?: ApiInfoQueryVO;
  // 	
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiModelId: 'api_model_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiModelId: 'string',
      param: ApiInfoQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllApimodelApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiInfoVO[];
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
      data: { 'type': 'array', 'itemType': ApiInfoVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListApimodelApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 模型ID
  apiModelId: string;
  // param
  param?: ApiInfoQueryVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiModelId: 'api_model_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiModelId: 'string',
      param: ApiInfoQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListApimodelApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiInfoPagedListVO;
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
      data: ApiInfoPagedListVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateExternalauthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ExternalAuthInfoVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ExternalAuthInfoVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateExternalauthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ExternalAuthInfoVO;
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
      data: ExternalAuthInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateExternalauthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ExternalAuthInfoVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ExternalAuthInfoVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateExternalauthResponse extends $tea.Model {
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

export class DeleteExternalauthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部授权标识
  externalAuthId: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      externalAuthId: 'external_auth_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      externalAuthId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteExternalauthResponse extends $tea.Model {
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

export class GetExternalauthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部授权标识
  externalAuthId: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      externalAuthId: 'external_auth_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      externalAuthId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetExternalauthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ExternalAuthInfoVO;
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
      data: ExternalAuthInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListExternalauthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ExternalAuthInfoQueryVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ExternalAuthInfoQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListExternalauthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ExternalAuthInfoPagedListVO;
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
      data: ExternalAuthInfoPagedListVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllExternalauthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ExternalAuthInfoQueryVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ExternalAuthInfoQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllExternalauthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ExternalAuthInfoVO[];
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
      data: { 'type': 'array', 'itemType': ExternalAuthInfoVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class MountExternalauthApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // api标识列表
  apiInfoIdList: string[];
  // 外部授权标识
  externalAuthId: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiInfoIdList: 'api_info_id_list',
      externalAuthId: 'external_auth_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiInfoIdList: { 'type': 'array', 'itemType': 'string' },
      externalAuthId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class MountExternalauthApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: BatchActionResult;
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
      data: BatchActionResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnmountExternalauthApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // api标识列表
  apiInfoIdList: string[];
  // 外部授权标识
  externalAuthId: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiInfoIdList: 'api_info_id_list',
      externalAuthId: 'external_auth_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiInfoIdList: { 'type': 'array', 'itemType': 'string' },
      externalAuthId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnmountExternalauthApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: BatchActionResult;
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
      data: BatchActionResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteApimodelParamRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 模型参数id
  paramId: string;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  // 最外层的父类模型id
  apiModelId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      paramId: 'param_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      apiModelId: 'api_model_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      paramId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
      apiModelId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteApimodelParamResponse extends $tea.Model {
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

export class UpdateApimodelParamRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ApiModelParamVO;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiModelParamVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateApimodelParamResponse extends $tea.Model {
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

export class CreateApimodelParamRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ApiModelParamVO;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiModelParamVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateApimodelParamResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiModelParamVO;
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
      data: ApiModelParamVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListExternalauthApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部授权标识符
  externalAuthId: string;
  // param
  param?: ApiInfoQueryVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      externalAuthId: 'external_auth_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      externalAuthId: 'string',
      param: ApiInfoQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListExternalauthApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiInfoPagedListVO;
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
      data: ApiInfoPagedListVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckApimodelParamRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  // 校检的模型id
  modelId: string;
  // 模型引用的id
  refModelId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      modelId: 'model_id',
      refModelId: 'ref_model_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
      modelId: 'string',
      refModelId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckApimodelParamResponse extends $tea.Model {
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

export class ResolveApimodelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 待解析的父类模型名称
  modelName?: string;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  // description
  description?: string;
  // 包名
  packageName?: string;
  // json
  json?: string;
  // type
  type?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      modelName: 'model_name',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      description: 'description',
      packageName: 'package_name',
      json: 'json',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      modelName: 'string',
      tenantId: 'string',
      workspaceId: 'string',
      description: 'string',
      packageName: 'string',
      json: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ResolveApimodelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据模型
  data?: ApiModelVO;
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
      data: ApiModelVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportApimodelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // apimodelVO
  param?: ApiModelVO;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiModelVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportApimodelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 导入后的模型
  data?: ApiModelVO;
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
      data: ApiModelVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyApimodelMgsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // modelDataSource指mgs平台  get模型返回的json字符串
  modelList: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      modelList: 'model_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      modelList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyApimodelMgsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据迁移成功失败
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

export class ListOperatorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: OperatorQueryVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: OperatorQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListOperatorResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: OperatorPagedListVO;
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
      data: OperatorPagedListVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateApigroupAuthuserconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // api_auth_user_config
  param?: ApiGroupAuthUserConfigVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiGroupAuthUserConfigVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateApigroupAuthuserconfigResponse extends $tea.Model {
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

export class GetApigroupAuthuserconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetApigroupAuthuserconfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiGroupAuthUserConfigVO;
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
      data: ApiGroupAuthUserConfigVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddApigroupAuthuserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 	
  // API标识
  apiGroupId: string;
  // 用户标识列表
  operatorIdList: string[];
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiGroupId: 'api_group_id',
      operatorIdList: 'operator_id_list',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiGroupId: 'string',
      operatorIdList: { 'type': 'array', 'itemType': 'string' },
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddApigroupAuthuserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: BatchActionResult;
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
      data: BatchActionResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class MountApigroupAuthuserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // api标识
  apiGroupId: string;
  // 授权状态
  authStatus: string;
  // 授权用户Id列表
  authUserIdList: string[];
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiGroupId: 'api_group_id',
      authStatus: 'auth_status',
      authUserIdList: 'auth_user_id_list',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiGroupId: 'string',
      authStatus: 'string',
      authUserIdList: { 'type': 'array', 'itemType': 'string' },
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class MountApigroupAuthuserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: BatchActionResult;
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
      data: BatchActionResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnmountApigroupAuthuserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // api分组标识
  apiGroupId: string;
  // 授权用户Id列表
  authUserIdList: string[];
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  // 授权状态
  authStatus: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiGroupId: 'api_group_id',
      authUserIdList: 'auth_user_id_list',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      authStatus: 'auth_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiGroupId: 'string',
      authUserIdList: { 'type': 'array', 'itemType': 'string' },
      tenantId: 'string',
      workspaceId: 'string',
      authStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnmountApigroupAuthuserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: BatchActionResult;
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
      data: BatchActionResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListApigroupAuthuserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: AuthUserInfoQueryVO;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: AuthUserInfoQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListApigroupAuthuserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: AuthUserInfoPagedListVO;
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
      data: AuthUserInfoPagedListVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteApigroupAuthuserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // api分组标识
  apiGroupId: string;
  // 用户id列表
  userIdList: string[];
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiGroupId: 'api_group_id',
      userIdList: 'user_id_list',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiGroupId: 'string',
      userIdList: { 'type': 'array', 'itemType': 'string' },
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteApigroupAuthuserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: BatchActionResult;
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
      data: BatchActionResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyApiApigroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  // api分组标识
  apiGroupId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      apiGroupId: 'api_group_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
      apiGroupId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyApiApigroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // api
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

export class UpdateAppAuthapiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // api标识列表
  apiInfoIdList: string[];
  // app标识
  appId: string;
  // 加密状态
  encryptionStatus: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiInfoIdList: 'api_info_id_list',
      appId: 'app_id',
      encryptionStatus: 'encryption_status',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiInfoIdList: { 'type': 'array', 'itemType': 'string' },
      appId: 'string',
      encryptionStatus: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAppAuthapiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // app
  data?: BatchActionResult;
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
      data: BatchActionResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateGwconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: SystemConfigVO;
  // 租户标识
  tenantId?: string;
  // 	
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: SystemConfigVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateGwconfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: SystemConfigVO;
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
      data: SystemConfigVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGwconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // config_key
  configKey?: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      configKey: 'config_key',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      configKey: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGwconfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: SystemConfigVO;
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
      data: SystemConfigVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateGwconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: SystemConfigVO;
  // 	
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  // 更新的网关id
  gwIdList?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      gwIdList: 'gw_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: SystemConfigVO,
      tenantId: 'string',
      workspaceId: 'string',
      gwIdList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateGwconfigResponse extends $tea.Model {
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

export class AllGwconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 	
  // 租户标识
  tenantId?: string;
  // param
  param?: SystemConfigQueryVO;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      param: 'param',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      param: SystemConfigQueryVO,
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllGwconfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: GateWayConfigVO[];
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
      data: { 'type': 'array', 'itemType': GateWayConfigVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // instance_id
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

export class CheckGwconfigDeleteRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // zone和网关标识
  configKey?: string;
  // param
  param?: GateWayConfigVO;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      configKey: 'config_key',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      configKey: 'string',
      param: GateWayConfigVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckGwconfigDeleteResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // true, false
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

export class CheckGwconfigUpdateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 	
  // zone和网关标识
  configKey?: string;
  // param
  gatewayIdList?: string[];
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      configKey: 'config_key',
      gatewayIdList: 'gateway_id_list',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      configKey: 'string',
      gatewayIdList: { 'type': 'array', 'itemType': 'string' },
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckGwconfigUpdateResponse extends $tea.Model {
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

export class CreateApiGwconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ApiInfoVO;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiInfoVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateApiGwconfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiInfoVO;
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
      data: ApiInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateApiGwconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ApiInfoVO;
  // workspace_id
  workspaceId?: string;
  // tenant_id
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      workspaceId: 'workspace_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiInfoVO,
      workspaceId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateApiGwconfigResponse extends $tea.Model {
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

export class CheckApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // api参数
  param?: ApiInfoVO;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiInfoVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // true成功，false失败
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

export class CheckSysUpdateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  sysId?: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sysId: 'sys_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sysId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckSysUpdateResponse extends $tea.Model {
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

export class GetApiHistoryversionapiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // api_id
  apiId: string;
  // tenant_id
  tenantId?: string;
  // version_id
  versionId: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiId: 'api_id',
      tenantId: 'tenant_id',
      versionId: 'version_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiId: 'string',
      tenantId: 'string',
      versionId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetApiHistoryversionapiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiInfoVO;
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
      data: ApiInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllStrategyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: StrategyInfoQueryVO;
  // 	
  // 工作空间标识
  workspaceId?: string;
  // 租户标识
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      workspaceId: 'workspace_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: StrategyInfoQueryVO,
      workspaceId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllStrategyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: StrategyInfoVO[];
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
      data: { 'type': 'array', 'itemType': StrategyInfoVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllStrategyApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ApiInfoQueryVO;
  // strategy_id
  strategyId?: string;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      strategyId: 'strategy_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiInfoQueryVO,
      strategyId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllStrategyApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiInfoVO[];
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
      data: { 'type': 'array', 'itemType': ApiInfoVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListStrategyApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ApiInfoQueryVO;
  // strategy_id
  strategyId?: string;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      strategyId: 'strategy_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiInfoQueryVO,
      strategyId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListStrategyApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiInfoPagedListVO;
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
      data: ApiInfoPagedListVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class MountStrategyApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 绑定的API ID列表
  apiIdList?: string[];
  // strategy_id
  strategyId?: string;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiIdList: 'api_id_list',
      strategyId: 'strategy_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiIdList: { 'type': 'array', 'itemType': 'string' },
      strategyId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class MountStrategyApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: BatchActionResult;
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
      data: BatchActionResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnmountStrategyApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 绑定的API ID列表
  apiIdList?: string[];
  // strategy_id
  strategyId?: string;
  // workspace_id
  workspaceId?: string;
  // tenant_id
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiIdList: 'api_id_list',
      strategyId: 'strategy_id',
      workspaceId: 'workspace_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiIdList: { 'type': 'array', 'itemType': 'string' },
      strategyId: 'string',
      workspaceId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnmountStrategyApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: BatchActionResult;
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
      data: BatchActionResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateStrategyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: StrategyInfoVO;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: StrategyInfoVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateStrategyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: StrategyInfoVO;
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
      data: StrategyInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteStrategyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // strategy_id
  strategyId?: string;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      strategyId: 'strategy_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      strategyId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteStrategyResponse extends $tea.Model {
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

export class GetStrategyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // strategy_id
  strategyId?: string;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      strategyId: 'strategy_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      strategyId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetStrategyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: StrategyInfoVO;
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
      data: StrategyInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListStrategyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: StrategyInfoQueryVO;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: StrategyInfoQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListStrategyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: StrategyPagedListVO;
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
      data: StrategyPagedListVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateStrategyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: StrategyInfoVO;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: StrategyInfoVO,
      tenantId: 'string',
      workspaceId: 'string',
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

export class GetHomeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetHomeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: HomePageVO;
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
      data: HomePageVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckApigroupDomainRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ApiGroupDomainVO;
  // workspace_id
  workspaceId?: string;
  // tenant_id
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      workspaceId: 'workspace_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiGroupDomainVO,
      workspaceId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckApigroupDomainResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 	
  // true成功，false失败
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

export class GetApigroupDomainRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // workspace_id
  workspaceId?: string;
  // tenant_id
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      workspaceId: 'workspace_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      workspaceId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetApigroupDomainResponse extends $tea.Model {
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

export class GetApiSwaggerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // API标识列表
  apiInfoIdList: string[];
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiInfoIdList: 'api_info_id_list',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiInfoIdList: { 'type': 'array', 'itemType': 'string' },
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetApiSwaggerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // swaggerJson
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

export class DownloadApiSwaggerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // API标识列表
  apiInfoIdList?: string[];
  // swaggerJson
  swaggerJsonStr?: string;
  // 租户标识
  tenantId?: string;
  // 工作空间标识
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiInfoIdList: 'api_info_id_list',
      swaggerJsonStr: 'swagger_json_str',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiInfoIdList: { 'type': 'array', 'itemType': 'string' },
      swaggerJsonStr: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DownloadApiSwaggerResponse extends $tea.Model {
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

export class DownloadApimodelCodegenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // APp标识列表
  appId?: string;
  // 租户标识
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  // api_group_id
  apiGroupId?: string;
  // package_name
  packageName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appId: 'app_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      apiGroupId: 'api_group_id',
      packageName: 'package_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
      apiGroupId: 'string',
      packageName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DownloadApimodelCodegenResponse extends $tea.Model {
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

export class GetGwconfigGatewayswitchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGwconfigGatewayswitchResponse extends $tea.Model {
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

export class AllRegistryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: RegistryInfoQueryVO;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: RegistryInfoQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllRegistryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: RegistryInfoVO[];
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
      data: { 'type': 'array', 'itemType': RegistryInfoVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllRegistrySysRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: SystemClusterQueryVO;
  // registry_id
  registryId?: string;
  // workspace_id
  workspaceId?: string;
  // tenant_id
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      registryId: 'registry_id',
      workspaceId: 'workspace_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: SystemClusterQueryVO,
      registryId: 'string',
      workspaceId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllRegistrySysResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: SystemClusterVO[];
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
      data: { 'type': 'array', 'itemType': SystemClusterVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRegistrySysRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: SystemClusterQueryVO;
  // registry_id
  registryId?: string;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      registryId: 'registry_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: SystemClusterQueryVO,
      registryId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRegistrySysResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: SystemClusterPagedListVO;
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
      data: SystemClusterPagedListVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRegistryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: RegistryInfoVO;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: RegistryInfoVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRegistryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: RegistryInfoVO;
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
      data: RegistryInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteRegistryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // registry_id
  registryId: string;
  // workspace_id
  workspaceId?: string;
  // tenant_id
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      registryId: 'registry_id',
      workspaceId: 'workspace_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      registryId: 'string',
      workspaceId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteRegistryResponse extends $tea.Model {
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

export class GetRegistryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // registry_id
  registryId: string;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      registryId: 'registry_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      registryId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRegistryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: RegistryInfoVO;
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
      data: RegistryInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRegistryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: RegistryInfoQueryVO;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: RegistryInfoQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRegistryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: RegistryInfoPagedListVO;
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
      data: RegistryInfoPagedListVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateRegistryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: RegistryInfoVO;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: RegistryInfoVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateRegistryResponse extends $tea.Model {
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

export class ExecApiflowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  // param
  param?: ApiflowTestReqVO;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      param: 'param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
      param: ApiflowTestReqVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecApiflowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiTestRspVO;
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
      data: ApiTestRspVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteApiflowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // api_id
  apiId: string;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiId: 'api_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteApiflowResponse extends $tea.Model {
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

export class AllApiflowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ApiflowMachineDefQueryVO;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiflowMachineDefQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllApiflowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiflowMachineDefVO[];
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
      data: { 'type': 'array', 'itemType': ApiflowMachineDefVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListApiflowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ApiflowMachineDefQueryVO;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiflowMachineDefQueryVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListApiflowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiflowMachineDefPagedListVO;
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
      data: ApiflowMachineDefPagedListVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateApiflowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ApiInfoVO;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiInfoVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateApiflowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiInfoVO;
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
      data: ApiInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetApiflowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // API标识
  apiId: string;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  // api_type
  apiType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiId: 'api_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      apiType: 'api_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
      apiType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetApiflowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: ApiInfoVO;
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
      data: ApiInfoVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateApiflowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: ApiInfoVO;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: ApiInfoVO,
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateApiflowResponse extends $tea.Model {
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

export class GetApimodelJsonRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // api_model_id
  apiModelId: string;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  // model_type
  modelType?: string;
  // 是否使用默认值
  useDefault?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiModelId: 'api_model_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      modelType: 'model_type',
      useDefault: 'use_default',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiModelId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
      modelType: 'string',
      useDefault: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetApimodelJsonResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: string;
  // req_params
  reqParams?: ApiParamVO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      reqParams: 'req_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      reqParams: { 'type': 'array', 'itemType': ApiParamVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReplaceApimodelJsonRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // workspace_id
  workspaceId?: string;
  // tenant_id
  tenantId?: string;
  // ApiTestParamVO
  param?: ApiTestParamVO[];
  // json
  json?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      workspaceId: 'workspace_id',
      tenantId: 'tenant_id',
      param: 'param',
      json: 'json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      workspaceId: 'string',
      tenantId: 'string',
      param: { 'type': 'array', 'itemType': ApiTestParamVO },
      json: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReplaceApimodelJsonResponse extends $tea.Model {
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

export class GetGwconfigTripleswitchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // tenant_id
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGwconfigTripleswitchResponse extends $tea.Model {
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

export class QueryGwconfigTripleswitchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // workspace_id
  workspaceId?: string;
  // tenant_id
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      workspaceId: 'workspace_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      workspaceId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGwconfigTripleswitchResponse extends $tea.Model {
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

export class AllGrayscaleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: GrayscaleConfigQueryVO;
  // workspace_id
  workspaceId?: string;
  // tenant_id
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      workspaceId: 'workspace_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: GrayscaleConfigQueryVO,
      workspaceId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllGrayscaleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: GrayscaleConfigVO[];
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
      data: { 'type': 'array', 'itemType': GrayscaleConfigVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListGrayscaleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // param
  param?: GrayscaleConfigQueryVO;
  // workspace_id
  workspaceId?: string;
  // tenant_id
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
      workspaceId: 'workspace_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: GrayscaleConfigQueryVO,
      workspaceId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListGrayscaleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: GrayscaleConfigPagedListVO;
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
      data: GrayscaleConfigPagedListVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllRouterRegionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户ID
  tenantId?: string;
  // workspace_id
  workspaceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      workspaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllRouterRegionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: RegionVO[];
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
      data: { 'type': 'array', 'itemType': RegionVO },
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
          sdk_version: "1.1.325",
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
   * Description: 创建API分组
   * Summary: 创建API分组
   */
  async createApigroup(request: CreateApigroupRequest): Promise<CreateApigroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createApigroupEx(request, headers, runtime);
  }

  /**
   * Description: 创建API分组
   * Summary: 创建API分组
   */
  async createApigroupEx(request: CreateApigroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateApigroupResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateApigroupResponse>(await this.doRequest("1.0", "sofa.apigateway.apigroup.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateApigroupResponse({}));
  }

  /**
   * Description: 查询API分组列表
   * Summary: 查询API分组列表
   */
  async allApigroup(request: AllApigroupRequest): Promise<AllApigroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allApigroupEx(request, headers, runtime);
  }

  /**
   * Description: 查询API分组列表
   * Summary: 查询API分组列表
   */
  async allApigroupEx(request: AllApigroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllApigroupResponse> {
    Util.validateModel(request);
    return $tea.cast<AllApigroupResponse>(await this.doRequest("1.0", "sofa.apigateway.apigroup.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllApigroupResponse({}));
  }

  /**
   * Description: 查询API分组分页列表
   * Summary: 查询API分组分页列表
   */
  async listApigroup(request: ListApigroupRequest): Promise<ListApigroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listApigroupEx(request, headers, runtime);
  }

  /**
   * Description: 查询API分组分页列表
   * Summary: 查询API分组分页列表
   */
  async listApigroupEx(request: ListApigroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListApigroupResponse> {
    Util.validateModel(request);
    return $tea.cast<ListApigroupResponse>(await this.doRequest("1.0", "sofa.apigateway.apigroup.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListApigroupResponse({}));
  }

  /**
   * Description: 创建后端集群
   * Summary: 创建后端集群
   */
  async createSys(request: CreateSysRequest): Promise<CreateSysResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSysEx(request, headers, runtime);
  }

  /**
   * Description: 创建后端集群
   * Summary: 创建后端集群
   */
  async createSysEx(request: CreateSysRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSysResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSysResponse>(await this.doRequest("1.0", "sofa.apigateway.sys.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSysResponse({}));
  }

  /**
   * Description: 查询后端集群列表
   * Summary: 查询后端集群列表
   */
  async allSys(request: AllSysRequest): Promise<AllSysResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allSysEx(request, headers, runtime);
  }

  /**
   * Description: 查询后端集群列表
   * Summary: 查询后端集群列表
   */
  async allSysEx(request: AllSysRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllSysResponse> {
    Util.validateModel(request);
    return $tea.cast<AllSysResponse>(await this.doRequest("1.0", "sofa.apigateway.sys.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllSysResponse({}));
  }

  /**
   * Description: 查询后端集群分页列表
   * Summary: 查询后端集群分页列表
   */
  async listSys(request: ListSysRequest): Promise<ListSysResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSysEx(request, headers, runtime);
  }

  /**
   * Description: 查询后端集群分页列表
   * Summary: 查询后端集群分页列表
   */
  async listSysEx(request: ListSysRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSysResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSysResponse>(await this.doRequest("1.0", "sofa.apigateway.sys.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSysResponse({}));
  }

  /**
   * Description: 通过ID查询API分组
   * Summary: 通过ID查询API分组
   */
  async getApigroup(request: GetApigroupRequest): Promise<GetApigroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getApigroupEx(request, headers, runtime);
  }

  /**
   * Description: 通过ID查询API分组
   * Summary: 通过ID查询API分组
   */
  async getApigroupEx(request: GetApigroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetApigroupResponse> {
    Util.validateModel(request);
    return $tea.cast<GetApigroupResponse>(await this.doRequest("1.0", "sofa.apigateway.apigroup.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetApigroupResponse({}));
  }

  /**
   * Description: 更新API分组
   * Summary: 更新API分组
   */
  async updateApigroup(request: UpdateApigroupRequest): Promise<UpdateApigroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateApigroupEx(request, headers, runtime);
  }

  /**
   * Description: 更新API分组
   * Summary: 更新API分组
   */
  async updateApigroupEx(request: UpdateApigroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateApigroupResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateApigroupResponse>(await this.doRequest("1.0", "sofa.apigateway.apigroup.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateApigroupResponse({}));
  }

  /**
   * Description: 删除API分组
   * Summary: 删除API分组
   */
  async deleteApigroup(request: DeleteApigroupRequest): Promise<DeleteApigroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteApigroupEx(request, headers, runtime);
  }

  /**
   * Description: 删除API分组
   * Summary: 删除API分组
   */
  async deleteApigroupEx(request: DeleteApigroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteApigroupResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteApigroupResponse>(await this.doRequest("1.0", "sofa.apigateway.apigroup.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteApigroupResponse({}));
  }

  /**
   * Description: 创建API信息
   * Summary: 创建API信息
   */
  async createApi(request: CreateApiRequest): Promise<CreateApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createApiEx(request, headers, runtime);
  }

  /**
   * Description: 创建API信息
   * Summary: 创建API信息
   */
  async createApiEx(request: CreateApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateApiResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateApiResponse>(await this.doRequest("1.0", "sofa.apigateway.api.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateApiResponse({}));
  }

  /**
   * Description: 更新API信息
   * Summary: 更新API信息
   */
  async updateApi(request: UpdateApiRequest): Promise<UpdateApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateApiEx(request, headers, runtime);
  }

  /**
   * Description: 更新API信息
   * Summary: 更新API信息
   */
  async updateApiEx(request: UpdateApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateApiResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateApiResponse>(await this.doRequest("1.0", "sofa.apigateway.api.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateApiResponse({}));
  }

  /**
   * Description: 查询API列表
   * Summary: 查询API列表
   */
  async allApi(request: AllApiRequest): Promise<AllApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allApiEx(request, headers, runtime);
  }

  /**
   * Description: 查询API列表
   * Summary: 查询API列表
   */
  async allApiEx(request: AllApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllApiResponse> {
    Util.validateModel(request);
    return $tea.cast<AllApiResponse>(await this.doRequest("1.0", "sofa.apigateway.api.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllApiResponse({}));
  }

  /**
   * Description: 查询API分页列表
   * Summary: 查询API分页列表
   */
  async listApi(request: ListApiRequest): Promise<ListApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listApiEx(request, headers, runtime);
  }

  /**
   * Description: 查询API分页列表
   * Summary: 查询API分页列表
   */
  async listApiEx(request: ListApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListApiResponse> {
    Util.validateModel(request);
    return $tea.cast<ListApiResponse>(await this.doRequest("1.0", "sofa.apigateway.api.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListApiResponse({}));
  }

  /**
   * Description: 通过ID查询API
   * Summary: 通过ID查询API
   */
  async getApi(request: GetApiRequest): Promise<GetApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getApiEx(request, headers, runtime);
  }

  /**
   * Description: 通过ID查询API
   * Summary: 通过ID查询API
   */
  async getApiEx(request: GetApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetApiResponse> {
    Util.validateModel(request);
    return $tea.cast<GetApiResponse>(await this.doRequest("1.0", "sofa.apigateway.api.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetApiResponse({}));
  }

  /**
   * Description: 创建App
   * Summary: 创建App
   */
  async createApp(request: CreateAppRequest): Promise<CreateAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAppEx(request, headers, runtime);
  }

  /**
   * Description: 创建App
   * Summary: 创建App
   */
  async createAppEx(request: CreateAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAppResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAppResponse>(await this.doRequest("1.0", "sofa.apigateway.app.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAppResponse({}));
  }

  /**
   * Description: 更新App信息
   * Summary: 更新App信息
   */
  async updateApp(request: UpdateAppRequest): Promise<UpdateAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAppEx(request, headers, runtime);
  }

  /**
   * Description: 更新App信息
   * Summary: 更新App信息
   */
  async updateAppEx(request: UpdateAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAppResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAppResponse>(await this.doRequest("1.0", "sofa.apigateway.app.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAppResponse({}));
  }

  /**
   * Description: 查询App列表
   * Summary: 查询App列表
   */
  async allApp(request: AllAppRequest): Promise<AllAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allAppEx(request, headers, runtime);
  }

  /**
   * Description: 查询App列表
   * Summary: 查询App列表
   */
  async allAppEx(request: AllAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllAppResponse> {
    Util.validateModel(request);
    return $tea.cast<AllAppResponse>(await this.doRequest("1.0", "sofa.apigateway.app.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllAppResponse({}));
  }

  /**
   * Description: 查询App分页列表
   * Summary: 查询App分页列表
   */
  async listApp(request: ListAppRequest): Promise<ListAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAppEx(request, headers, runtime);
  }

  /**
   * Description: 查询App分页列表
   * Summary: 查询App分页列表
   */
  async listAppEx(request: ListAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAppResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAppResponse>(await this.doRequest("1.0", "sofa.apigateway.app.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAppResponse({}));
  }

  /**
   * Description: 通过ID查询App
   * Summary: 通过ID查询App
   */
  async getApp(request: GetAppRequest): Promise<GetAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAppEx(request, headers, runtime);
  }

  /**
   * Description: 通过ID查询App
   * Summary: 通过ID查询App
   */
  async getAppEx(request: GetAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAppResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAppResponse>(await this.doRequest("1.0", "sofa.apigateway.app.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAppResponse({}));
  }

  /**
   * Description: 创建授权App
   * Summary: 创建授权App
   */
  async createAuthapp(request: CreateAuthappRequest): Promise<CreateAuthappResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAuthappEx(request, headers, runtime);
  }

  /**
   * Description: 创建授权App
   * Summary: 创建授权App
   */
  async createAuthappEx(request: CreateAuthappRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAuthappResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAuthappResponse>(await this.doRequest("1.0", "sofa.apigateway.authapp.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAuthappResponse({}));
  }

  /**
   * Description: 更新授权App
   * Summary: 更新授权App
   */
  async updateAuthapp(request: UpdateAuthappRequest): Promise<UpdateAuthappResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAuthappEx(request, headers, runtime);
  }

  /**
   * Description: 更新授权App
   * Summary: 更新授权App
   */
  async updateAuthappEx(request: UpdateAuthappRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAuthappResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAuthappResponse>(await this.doRequest("1.0", "sofa.apigateway.authapp.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAuthappResponse({}));
  }

  /**
   * Description: 删除授权App
   * Summary: 删除授权App
   */
  async deleteAuthapp(request: DeleteAuthappRequest): Promise<DeleteAuthappResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteAuthappEx(request, headers, runtime);
  }

  /**
   * Description: 删除授权App
   * Summary: 删除授权App
   */
  async deleteAuthappEx(request: DeleteAuthappRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteAuthappResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteAuthappResponse>(await this.doRequest("1.0", "sofa.apigateway.authapp.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteAuthappResponse({}));
  }

  /**
   * Description: 查询授权App列表
   * Summary: 查询授权App列表
   */
  async allAuthapp(request: AllAuthappRequest): Promise<AllAuthappResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allAuthappEx(request, headers, runtime);
  }

  /**
   * Description: 查询授权App列表
   * Summary: 查询授权App列表
   */
  async allAuthappEx(request: AllAuthappRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllAuthappResponse> {
    Util.validateModel(request);
    return $tea.cast<AllAuthappResponse>(await this.doRequest("1.0", "sofa.apigateway.authapp.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllAuthappResponse({}));
  }

  /**
   * Description: 查询获取授权App分页列表
   * Summary: 查询授权App分页列表
   */
  async listAuthapp(request: ListAuthappRequest): Promise<ListAuthappResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAuthappEx(request, headers, runtime);
  }

  /**
   * Description: 查询获取授权App分页列表
   * Summary: 查询授权App分页列表
   */
  async listAuthappEx(request: ListAuthappRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAuthappResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAuthappResponse>(await this.doRequest("1.0", "sofa.apigateway.authapp.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAuthappResponse({}));
  }

  /**
   * Description: 通过ID查询授权App
   * Summary: 通过ID查询授权App
   */
  async getAuthapp(request: GetAuthappRequest): Promise<GetAuthappResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAuthappEx(request, headers, runtime);
  }

  /**
   * Description: 通过ID查询授权App
   * Summary: 通过ID查询授权App
   */
  async getAuthappEx(request: GetAuthappRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAuthappResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAuthappResponse>(await this.doRequest("1.0", "sofa.apigateway.authapp.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAuthappResponse({}));
  }

  /**
   * Description: 创建路由规则
   * Summary: 创建路由规则
   */
  async createRouter(request: CreateRouterRequest): Promise<CreateRouterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createRouterEx(request, headers, runtime);
  }

  /**
   * Description: 创建路由规则
   * Summary: 创建路由规则
   */
  async createRouterEx(request: CreateRouterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateRouterResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateRouterResponse>(await this.doRequest("1.0", "sofa.apigateway.router.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateRouterResponse({}));
  }

  /**
   * Description: 更新路由规则
   * Summary: 更新路由规则
   */
  async updateRouter(request: UpdateRouterRequest): Promise<UpdateRouterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateRouterEx(request, headers, runtime);
  }

  /**
   * Description: 更新路由规则
   * Summary: 更新路由规则
   */
  async updateRouterEx(request: UpdateRouterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateRouterResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateRouterResponse>(await this.doRequest("1.0", "sofa.apigateway.router.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateRouterResponse({}));
  }

  /**
   * Description: 通过ID删除路由规则
   * Summary: 通过ID删除路由规则
   */
  async deleteRouter(request: DeleteRouterRequest): Promise<DeleteRouterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteRouterEx(request, headers, runtime);
  }

  /**
   * Description: 通过ID删除路由规则
   * Summary: 通过ID删除路由规则
   */
  async deleteRouterEx(request: DeleteRouterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteRouterResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteRouterResponse>(await this.doRequest("1.0", "sofa.apigateway.router.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteRouterResponse({}));
  }

  /**
   * Description: 查询路由信息列表
   * Summary: 查询路由信息列表
   */
  async allRouter(request: AllRouterRequest): Promise<AllRouterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allRouterEx(request, headers, runtime);
  }

  /**
   * Description: 查询路由信息列表
   * Summary: 查询路由信息列表
   */
  async allRouterEx(request: AllRouterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllRouterResponse> {
    Util.validateModel(request);
    return $tea.cast<AllRouterResponse>(await this.doRequest("1.0", "sofa.apigateway.router.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllRouterResponse({}));
  }

  /**
   * Description: 查询路由规则分页列表
   * Summary: 查询路由规则分页列表
   */
  async listRouter(request: ListRouterRequest): Promise<ListRouterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listRouterEx(request, headers, runtime);
  }

  /**
   * Description: 查询路由规则分页列表
   * Summary: 查询路由规则分页列表
   */
  async listRouterEx(request: ListRouterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListRouterResponse> {
    Util.validateModel(request);
    return $tea.cast<ListRouterResponse>(await this.doRequest("1.0", "sofa.apigateway.router.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListRouterResponse({}));
  }

  /**
   * Description: 通过ID查询路由规则
   * Summary: 通过ID查询路由规则
   */
  async getRouter(request: GetRouterRequest): Promise<GetRouterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getRouterEx(request, headers, runtime);
  }

  /**
   * Description: 通过ID查询路由规则
   * Summary: 通过ID查询路由规则
   */
  async getRouterEx(request: GetRouterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetRouterResponse> {
    Util.validateModel(request);
    return $tea.cast<GetRouterResponse>(await this.doRequest("1.0", "sofa.apigateway.router.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetRouterResponse({}));
  }

  /**
   * Description: 更新后端集群
   * Summary: 更新后端集群
   */
  async updateSys(request: UpdateSysRequest): Promise<UpdateSysResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSysEx(request, headers, runtime);
  }

  /**
   * Description: 更新后端集群
   * Summary: 更新后端集群
   */
  async updateSysEx(request: UpdateSysRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSysResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSysResponse>(await this.doRequest("1.0", "sofa.apigateway.sys.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSysResponse({}));
  }

  /**
   * Description: 通过ID删除后端集群
   * Summary: 通过ID删除后端集群
   */
  async deleteSys(request: DeleteSysRequest): Promise<DeleteSysResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSysEx(request, headers, runtime);
  }

  /**
   * Description: 通过ID删除后端集群
   * Summary: 通过ID删除后端集群
   */
  async deleteSysEx(request: DeleteSysRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSysResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSysResponse>(await this.doRequest("1.0", "sofa.apigateway.sys.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSysResponse({}));
  }

  /**
   * Description: 通过ID查询后端集群
   * Summary: 通过ID查询后端集群
   */
  async getSys(request: GetSysRequest): Promise<GetSysResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getSysEx(request, headers, runtime);
  }

  /**
   * Description: 通过ID查询后端集群
   * Summary: 通过ID查询后端集群
   */
  async getSysEx(request: GetSysRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetSysResponse> {
    Util.validateModel(request);
    return $tea.cast<GetSysResponse>(await this.doRequest("1.0", "sofa.apigateway.sys.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetSysResponse({}));
  }

  /**
   * Description: 通过API分组ID查询API列表
   * Summary: 通过API分组ID查询API列表
   */
  async allApigroupApi(request: AllApigroupApiRequest): Promise<AllApigroupApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allApigroupApiEx(request, headers, runtime);
  }

  /**
   * Description: 通过API分组ID查询API列表
   * Summary: 通过API分组ID查询API列表
   */
  async allApigroupApiEx(request: AllApigroupApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllApigroupApiResponse> {
    Util.validateModel(request);
    return $tea.cast<AllApigroupApiResponse>(await this.doRequest("1.0", "sofa.apigateway.apigroup.api.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllApigroupApiResponse({}));
  }

  /**
   * Description: 通过ID删除App
   * Summary: 通过ID删除App
   */
  async deleteApp(request: DeleteAppRequest): Promise<DeleteAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteAppEx(request, headers, runtime);
  }

  /**
   * Description: 通过ID删除App
   * Summary: 通过ID删除App
   */
  async deleteAppEx(request: DeleteAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteAppResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteAppResponse>(await this.doRequest("1.0", "sofa.apigateway.app.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteAppResponse({}));
  }

  /**
   * Description: 通过ID删除API
   * Summary: 通过ID删除API
   */
  async deleteApi(request: DeleteApiRequest): Promise<DeleteApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteApiEx(request, headers, runtime);
  }

  /**
   * Description: 通过ID删除API
   * Summary: 通过ID删除API
   */
  async deleteApiEx(request: DeleteApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteApiResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteApiResponse>(await this.doRequest("1.0", "sofa.apigateway.api.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteApiResponse({}));
  }

  /**
   * Description: 通过API分组ID查询API分页列表
   * Summary: 通过API分组ID查询API分页列表
   */
  async listApigroupApi(request: ListApigroupApiRequest): Promise<ListApigroupApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listApigroupApiEx(request, headers, runtime);
  }

  /**
   * Description: 通过API分组ID查询API分页列表
   * Summary: 通过API分组ID查询API分页列表
   */
  async listApigroupApiEx(request: ListApigroupApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListApigroupApiResponse> {
    Util.validateModel(request);
    return $tea.cast<ListApigroupApiResponse>(await this.doRequest("1.0", "sofa.apigateway.apigroup.api.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListApigroupApiResponse({}));
  }

  /**
   * Description: 通过授权App ID查询API分页列表
   * Summary: 通过授权App ID查询API分页列表
   */
  async listAuthappApi(request: ListAuthappApiRequest): Promise<ListAuthappApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAuthappApiEx(request, headers, runtime);
  }

  /**
   * Description: 通过授权App ID查询API分页列表
   * Summary: 通过授权App ID查询API分页列表
   */
  async listAuthappApiEx(request: ListAuthappApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAuthappApiResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAuthappApiResponse>(await this.doRequest("1.0", "sofa.apigateway.authapp.api.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAuthappApiResponse({}));
  }

  /**
   * Description: 通过后端集群ID查询API列表
   * Summary: 通过后端集群ID查询API列表
   */
  async allSysApi(request: AllSysApiRequest): Promise<AllSysApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allSysApiEx(request, headers, runtime);
  }

  /**
   * Description: 通过后端集群ID查询API列表
   * Summary: 通过后端集群ID查询API列表
   */
  async allSysApiEx(request: AllSysApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllSysApiResponse> {
    Util.validateModel(request);
    return $tea.cast<AllSysApiResponse>(await this.doRequest("1.0", "sofa.apigateway.sys.api.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllSysApiResponse({}));
  }

  /**
   * Description: 通过后端集群ID查询API分页列表
   * Summary: 通过后端集群ID查询API分页列表
   */
  async listSysApi(request: ListSysApiRequest): Promise<ListSysApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSysApiEx(request, headers, runtime);
  }

  /**
   * Description: 通过后端集群ID查询API分页列表
   * Summary: 通过后端集群ID查询API分页列表
   */
  async listSysApiEx(request: ListSysApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSysApiResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSysApiResponse>(await this.doRequest("1.0", "sofa.apigateway.sys.api.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSysApiResponse({}));
  }

  /**
   * Description: 通过路由规则ID查询API列表
   * Summary: 通过路由规则ID查询API列表
   */
  async allRouterApi(request: AllRouterApiRequest): Promise<AllRouterApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allRouterApiEx(request, headers, runtime);
  }

  /**
   * Description: 通过路由规则ID查询API列表
   * Summary: 通过路由规则ID查询API列表
   */
  async allRouterApiEx(request: AllRouterApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllRouterApiResponse> {
    Util.validateModel(request);
    return $tea.cast<AllRouterApiResponse>(await this.doRequest("1.0", "sofa.apigateway.router.api.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllRouterApiResponse({}));
  }

  /**
   * Description: 通过路由规则ID查询API分页列表
   * Summary: 通过路由规则ID查询API分页列表
   */
  async listRouterApi(request: ListRouterApiRequest): Promise<ListRouterApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listRouterApiEx(request, headers, runtime);
  }

  /**
   * Description: 通过路由规则ID查询API分页列表
   * Summary: 通过路由规则ID查询API分页列表
   */
  async listRouterApiEx(request: ListRouterApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListRouterApiResponse> {
    Util.validateModel(request);
    return $tea.cast<ListRouterApiResponse>(await this.doRequest("1.0", "sofa.apigateway.router.api.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListRouterApiResponse({}));
  }

  /**
   * Description: 更新API版本号
   * Summary: 更新API版本号
   */
  async updateApiVersionno(request: UpdateApiVersionnoRequest): Promise<UpdateApiVersionnoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateApiVersionnoEx(request, headers, runtime);
  }

  /**
   * Description: 更新API版本号
   * Summary: 更新API版本号
   */
  async updateApiVersionnoEx(request: UpdateApiVersionnoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateApiVersionnoResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateApiVersionnoResponse>(await this.doRequest("1.0", "sofa.apigateway.api.versionno.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateApiVersionnoResponse({}));
  }

  /**
   * Description: 下线API
   * Summary: 下线API
   */
  async offlineApi(request: OfflineApiRequest): Promise<OfflineApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.offlineApiEx(request, headers, runtime);
  }

  /**
   * Description: 下线API
   * Summary: 下线API
   */
  async offlineApiEx(request: OfflineApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OfflineApiResponse> {
    Util.validateModel(request);
    return $tea.cast<OfflineApiResponse>(await this.doRequest("1.0", "sofa.apigateway.api.offline", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OfflineApiResponse({}));
  }

  /**
   * Description: 通过授权App ID查询API列表
   * Summary: 通过授权App ID查询API列表
   */
  async allAuthappApi(request: AllAuthappApiRequest): Promise<AllAuthappApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allAuthappApiEx(request, headers, runtime);
  }

  /**
   * Description: 通过授权App ID查询API列表
   * Summary: 通过授权App ID查询API列表
   */
  async allAuthappApiEx(request: AllAuthappApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllAuthappApiResponse> {
    Util.validateModel(request);
    return $tea.cast<AllAuthappApiResponse>(await this.doRequest("1.0", "sofa.apigateway.authapp.api.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllAuthappApiResponse({}));
  }

  /**
   * Description: api挂载授权App
   * Summary: api挂载授权App
   */
  async mountApiAuthapp(request: MountApiAuthappRequest): Promise<MountApiAuthappResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.mountApiAuthappEx(request, headers, runtime);
  }

  /**
   * Description: api挂载授权App
   * Summary: api挂载授权App
   */
  async mountApiAuthappEx(request: MountApiAuthappRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<MountApiAuthappResponse> {
    Util.validateModel(request);
    return $tea.cast<MountApiAuthappResponse>(await this.doRequest("1.0", "sofa.apigateway.api.authapp.mount", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new MountApiAuthappResponse({}));
  }

  /**
   * Description: 上线API
   * Summary: 上线API
   */
  async onlineApi(request: OnlineApiRequest): Promise<OnlineApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.onlineApiEx(request, headers, runtime);
  }

  /**
   * Description: 上线API
   * Summary: 上线API
   */
  async onlineApiEx(request: OnlineApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OnlineApiResponse> {
    Util.validateModel(request);
    return $tea.cast<OnlineApiResponse>(await this.doRequest("1.0", "sofa.apigateway.api.online", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OnlineApiResponse({}));
  }

  /**
   * Description: 通过API ID查询授权App列表
   * Summary: 通过API ID查询授权App列表
   */
  async allApiAuthapp(request: AllApiAuthappRequest): Promise<AllApiAuthappResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allApiAuthappEx(request, headers, runtime);
  }

  /**
   * Description: 通过API ID查询授权App列表
   * Summary: 通过API ID查询授权App列表
   */
  async allApiAuthappEx(request: AllApiAuthappRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllApiAuthappResponse> {
    Util.validateModel(request);
    return $tea.cast<AllApiAuthappResponse>(await this.doRequest("1.0", "sofa.apigateway.api.authapp.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllApiAuthappResponse({}));
  }

  /**
   * Description: 通过API ID查询授权App分页列表
   * Summary: 通过API ID查询授权App分页列表
   */
  async listApiAuthapp(request: ListApiAuthappRequest): Promise<ListApiAuthappResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listApiAuthappEx(request, headers, runtime);
  }

  /**
   * Description: 通过API ID查询授权App分页列表
   * Summary: 通过API ID查询授权App分页列表
   */
  async listApiAuthappEx(request: ListApiAuthappRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListApiAuthappResponse> {
    Util.validateModel(request);
    return $tea.cast<ListApiAuthappResponse>(await this.doRequest("1.0", "sofa.apigateway.api.authapp.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListApiAuthappResponse({}));
  }

  /**
   * Description: 通过App ID查询API列表
   * Summary: 通过App ID查询API列表
   */
  async allAppApi(request: AllAppApiRequest): Promise<AllAppApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allAppApiEx(request, headers, runtime);
  }

  /**
   * Description: 通过App ID查询API列表
   * Summary: 通过App ID查询API列表
   */
  async allAppApiEx(request: AllAppApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllAppApiResponse> {
    Util.validateModel(request);
    return $tea.cast<AllAppApiResponse>(await this.doRequest("1.0", "sofa.apigateway.app.api.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllAppApiResponse({}));
  }

  /**
   * Description: 通过App ID查询API分页列表
   * Summary: 通过App ID查询API分页列表
   */
  async listAppApi(request: ListAppApiRequest): Promise<ListAppApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAppApiEx(request, headers, runtime);
  }

  /**
   * Description: 通过App ID查询API分页列表
   * Summary: 通过App ID查询API分页列表
   */
  async listAppApiEx(request: ListAppApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAppApiResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAppApiResponse>(await this.doRequest("1.0", "sofa.apigateway.app.api.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAppApiResponse({}));
  }

  /**
   * Description: 获取随机密钥
   * Summary: 获取随机密钥
   */
  async getCommonRandomaksk(request: GetCommonRandomakskRequest): Promise<GetCommonRandomakskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getCommonRandomakskEx(request, headers, runtime);
  }

  /**
   * Description: 获取随机密钥
   * Summary: 获取随机密钥
   */
  async getCommonRandomakskEx(request: GetCommonRandomakskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetCommonRandomakskResponse> {
    Util.validateModel(request);
    return $tea.cast<GetCommonRandomakskResponse>(await this.doRequest("1.0", "sofa.apigateway.common.randomaksk.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetCommonRandomakskResponse({}));
  }

  /**
   * Description: 创建联系方式
   * Summary: 创建联系方式
   */
  async createContact(request: CreateContactRequest): Promise<CreateContactResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContactEx(request, headers, runtime);
  }

  /**
   * Description: 创建联系方式
   * Summary: 创建联系方式
   */
  async createContactEx(request: CreateContactRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContactResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContactResponse>(await this.doRequest("1.0", "sofa.apigateway.contact.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContactResponse({}));
  }

  /**
   * Description: 更新联系方式
   * Summary: 更新联系方式
   */
  async updateContact(request: UpdateContactRequest): Promise<UpdateContactResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateContactEx(request, headers, runtime);
  }

  /**
   * Description: 更新联系方式
   * Summary: 更新联系方式
   */
  async updateContactEx(request: UpdateContactRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateContactResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateContactResponse>(await this.doRequest("1.0", "sofa.apigateway.contact.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateContactResponse({}));
  }

  /**
   * Description: 删除联系方式
   * Summary: 删除联系方式
   */
  async deleteContact(request: DeleteContactRequest): Promise<DeleteContactResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteContactEx(request, headers, runtime);
  }

  /**
   * Description: 删除联系方式
   * Summary: 删除联系方式
   */
  async deleteContactEx(request: DeleteContactRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteContactResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteContactResponse>(await this.doRequest("1.0", "sofa.apigateway.contact.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteContactResponse({}));
  }

  /**
   * Description: 通过ID查询联系方式
   * Summary: 通过ID查询联系方式
   */
  async getContact(request: GetContactRequest): Promise<GetContactResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getContactEx(request, headers, runtime);
  }

  /**
   * Description: 通过ID查询联系方式
   * Summary: 通过ID查询联系方式
   */
  async getContactEx(request: GetContactRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetContactResponse> {
    Util.validateModel(request);
    return $tea.cast<GetContactResponse>(await this.doRequest("1.0", "sofa.apigateway.contact.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetContactResponse({}));
  }

  /**
   * Description: 查询联系方式分页列表
   * Summary: 查询联系方式分页列表
   */
  async listContact(request: ListContactRequest): Promise<ListContactResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listContactEx(request, headers, runtime);
  }

  /**
   * Description: 查询联系方式分页列表
   * Summary: 查询联系方式分页列表
   */
  async listContactEx(request: ListContactRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListContactResponse> {
    Util.validateModel(request);
    return $tea.cast<ListContactResponse>(await this.doRequest("1.0", "sofa.apigateway.contact.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListContactResponse({}));
  }

  /**
   * Description: 通过授权App ID查询联系方式列表
   * Summary: 通过授权App ID查询联系方式列表
   */
  async listContactAuthapp(request: ListContactAuthappRequest): Promise<ListContactAuthappResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listContactAuthappEx(request, headers, runtime);
  }

  /**
   * Description: 通过授权App ID查询联系方式列表
   * Summary: 通过授权App ID查询联系方式列表
   */
  async listContactAuthappEx(request: ListContactAuthappRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListContactAuthappResponse> {
    Util.validateModel(request);
    return $tea.cast<ListContactAuthappResponse>(await this.doRequest("1.0", "sofa.apigateway.contact.authapp.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListContactAuthappResponse({}));
  }

  /**
   * Description: api解除授权App
   * Summary: api解除授权App
   */
  async unmountApiAuthapp(request: UnmountApiAuthappRequest): Promise<UnmountApiAuthappResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.unmountApiAuthappEx(request, headers, runtime);
  }

  /**
   * Description: api解除授权App
   * Summary: api解除授权App
   */
  async unmountApiAuthappEx(request: UnmountApiAuthappRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UnmountApiAuthappResponse> {
    Util.validateModel(request);
    return $tea.cast<UnmountApiAuthappResponse>(await this.doRequest("1.0", "sofa.apigateway.api.authapp.unmount", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UnmountApiAuthappResponse({}));
  }

  /**
   * Description: 获取指定版本的api
   * Summary: 获取指定版本的api
   */
  async getApiVersionapi(request: GetApiVersionapiRequest): Promise<GetApiVersionapiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getApiVersionapiEx(request, headers, runtime);
  }

  /**
   * Description: 获取指定版本的api
   * Summary: 获取指定版本的api
   */
  async getApiVersionapiEx(request: GetApiVersionapiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetApiVersionapiResponse> {
    Util.validateModel(request);
    return $tea.cast<GetApiVersionapiResponse>(await this.doRequest("1.0", "sofa.apigateway.api.versionapi.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetApiVersionapiResponse({}));
  }

  /**
   * Description: 创建cors
   * Summary: 创建cors
   */
  async createCors(request: CreateCorsRequest): Promise<CreateCorsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCorsEx(request, headers, runtime);
  }

  /**
   * Description: 创建cors
   * Summary: 创建cors
   */
  async createCorsEx(request: CreateCorsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCorsResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCorsResponse>(await this.doRequest("1.0", "sofa.apigateway.cors.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCorsResponse({}));
  }

  /**
   * Description: 编辑cors
   * Summary: 编辑cors
   */
  async updateCors(request: UpdateCorsRequest): Promise<UpdateCorsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateCorsEx(request, headers, runtime);
  }

  /**
   * Description: 编辑cors
   * Summary: 编辑cors
   */
  async updateCorsEx(request: UpdateCorsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateCorsResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateCorsResponse>(await this.doRequest("1.0", "sofa.apigateway.cors.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateCorsResponse({}));
  }

  /**
   * Description: 删除cors
   * Summary: 删除cors
   */
  async deleteCors(request: DeleteCorsRequest): Promise<DeleteCorsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteCorsEx(request, headers, runtime);
  }

  /**
   * Description: 删除cors
   * Summary: 删除cors
   */
  async deleteCorsEx(request: DeleteCorsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteCorsResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteCorsResponse>(await this.doRequest("1.0", "sofa.apigateway.cors.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteCorsResponse({}));
  }

  /**
   * Description: 查询cors列表
   * Summary: 查询cors列表
   */
  async allCors(request: AllCorsRequest): Promise<AllCorsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allCorsEx(request, headers, runtime);
  }

  /**
   * Description: 查询cors列表
   * Summary: 查询cors列表
   */
  async allCorsEx(request: AllCorsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllCorsResponse> {
    Util.validateModel(request);
    return $tea.cast<AllCorsResponse>(await this.doRequest("1.0", "sofa.apigateway.cors.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllCorsResponse({}));
  }

  /**
   * Description: 查询cors分页列表
   * Summary: 查询cors分页列表
   */
  async listCors(request: ListCorsRequest): Promise<ListCorsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listCorsEx(request, headers, runtime);
  }

  /**
   * Description: 查询cors分页列表
   * Summary: 查询cors分页列表
   */
  async listCorsEx(request: ListCorsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListCorsResponse> {
    Util.validateModel(request);
    return $tea.cast<ListCorsResponse>(await this.doRequest("1.0", "sofa.apigateway.cors.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListCorsResponse({}));
  }

  /**
   * Description: 根据ID查询cors
   * Summary: 根据ID查询cors
   */
  async getCors(request: GetCorsRequest): Promise<GetCorsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getCorsEx(request, headers, runtime);
  }

  /**
   * Description: 根据ID查询cors
   * Summary: 根据ID查询cors
   */
  async getCorsEx(request: GetCorsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetCorsResponse> {
    Util.validateModel(request);
    return $tea.cast<GetCorsResponse>(await this.doRequest("1.0", "sofa.apigateway.cors.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetCorsResponse({}));
  }

  /**
   * Description: 根据 cors ID 查询 API 列表
   * Summary: 根据 cors ID 查询 API 列表
   */
  async allCorsApi(request: AllCorsApiRequest): Promise<AllCorsApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allCorsApiEx(request, headers, runtime);
  }

  /**
   * Description: 根据 cors ID 查询 API 列表
   * Summary: 根据 cors ID 查询 API 列表
   */
  async allCorsApiEx(request: AllCorsApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllCorsApiResponse> {
    Util.validateModel(request);
    return $tea.cast<AllCorsApiResponse>(await this.doRequest("1.0", "sofa.apigateway.cors.api.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllCorsApiResponse({}));
  }

  /**
   * Description: 根据cors ID查询API分页列表
   * Summary: 根据cors ID查询API分页列表
   */
  async listCorsApi(request: ListCorsApiRequest): Promise<ListCorsApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listCorsApiEx(request, headers, runtime);
  }

  /**
   * Description: 根据cors ID查询API分页列表
   * Summary: 根据cors ID查询API分页列表
   */
  async listCorsApiEx(request: ListCorsApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListCorsApiResponse> {
    Util.validateModel(request);
    return $tea.cast<ListCorsApiResponse>(await this.doRequest("1.0", "sofa.apigateway.cors.api.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListCorsApiResponse({}));
  }

  /**
   * Description: 根据cors ID绑定API
   * Summary: 根据cors ID绑定API
   */
  async mountCorsApi(request: MountCorsApiRequest): Promise<MountCorsApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.mountCorsApiEx(request, headers, runtime);
  }

  /**
   * Description: 根据cors ID绑定API
   * Summary: 根据cors ID绑定API
   */
  async mountCorsApiEx(request: MountCorsApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<MountCorsApiResponse> {
    Util.validateModel(request);
    return $tea.cast<MountCorsApiResponse>(await this.doRequest("1.0", "sofa.apigateway.cors.api.mount", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new MountCorsApiResponse({}));
  }

  /**
   * Description: 根据cors ID 解绑API
   * Summary: 根据cors ID 解绑API
   */
  async unmountCorsApi(request: UnmountCorsApiRequest): Promise<UnmountCorsApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.unmountCorsApiEx(request, headers, runtime);
  }

  /**
   * Description: 根据cors ID 解绑API
   * Summary: 根据cors ID 解绑API
   */
  async unmountCorsApiEx(request: UnmountCorsApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UnmountCorsApiResponse> {
    Util.validateModel(request);
    return $tea.cast<UnmountCorsApiResponse>(await this.doRequest("1.0", "sofa.apigateway.cors.api.unmount", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UnmountCorsApiResponse({}));
  }

  /**
   * Description: API调试
   * Summary: API调试
   */
  async execTestHttp(request: ExecTestHttpRequest): Promise<ExecTestHttpResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execTestHttpEx(request, headers, runtime);
  }

  /**
   * Description: API调试
   * Summary: API调试
   */
  async execTestHttpEx(request: ExecTestHttpRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecTestHttpResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecTestHttpResponse>(await this.doRequest("1.0", "sofa.apigateway.test.http.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecTestHttpResponse({}));
  }

  /**
   * Description: 更新授权应用限流
   * Summary: 更新授权应用限流
   */
  async updateApiAuthapplimit(request: UpdateApiAuthapplimitRequest): Promise<UpdateApiAuthapplimitResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateApiAuthapplimitEx(request, headers, runtime);
  }

  /**
   * Description: 更新授权应用限流
   * Summary: 更新授权应用限流
   */
  async updateApiAuthapplimitEx(request: UpdateApiAuthapplimitRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateApiAuthapplimitResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateApiAuthapplimitResponse>(await this.doRequest("1.0", "sofa.apigateway.api.authapplimit.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateApiAuthapplimitResponse({}));
  }

  /**
   * Description: 查询授权应用限制
   * Summary: 查询授权应用限制
   */
  async getApiAuthapplimit(request: GetApiAuthapplimitRequest): Promise<GetApiAuthapplimitResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getApiAuthapplimitEx(request, headers, runtime);
  }

  /**
   * Description: 查询授权应用限制
   * Summary: 查询授权应用限制
   */
  async getApiAuthapplimitEx(request: GetApiAuthapplimitRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetApiAuthapplimitResponse> {
    Util.validateModel(request);
    return $tea.cast<GetApiAuthapplimitResponse>(await this.doRequest("1.0", "sofa.apigateway.api.authapplimit.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetApiAuthapplimitResponse({}));
  }

  /**
   * Description: 编辑限流配置
   * Summary: 编辑限流配置
   */
  async updateApiLimitconfig(request: UpdateApiLimitconfigRequest): Promise<UpdateApiLimitconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateApiLimitconfigEx(request, headers, runtime);
  }

  /**
   * Description: 编辑限流配置
   * Summary: 编辑限流配置
   */
  async updateApiLimitconfigEx(request: UpdateApiLimitconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateApiLimitconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateApiLimitconfigResponse>(await this.doRequest("1.0", "sofa.apigateway.api.limitconfig.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateApiLimitconfigResponse({}));
  }

  /**
   * Description: 更新缓存信息
   * Summary: 更新缓存信息
   */
  async updateApiCacheinfo(request: UpdateApiCacheinfoRequest): Promise<UpdateApiCacheinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateApiCacheinfoEx(request, headers, runtime);
  }

  /**
   * Description: 更新缓存信息
   * Summary: 更新缓存信息
   */
  async updateApiCacheinfoEx(request: UpdateApiCacheinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateApiCacheinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateApiCacheinfoResponse>(await this.doRequest("1.0", "sofa.apigateway.api.cacheinfo.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateApiCacheinfoResponse({}));
  }

  /**
   * Description: 查询监控
   * Summary: 查询监控
   */
  async queryMonitor(request: QueryMonitorRequest): Promise<QueryMonitorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMonitorEx(request, headers, runtime);
  }

  /**
   * Description: 查询监控
   * Summary: 查询监控
   */
  async queryMonitorEx(request: QueryMonitorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMonitorResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMonitorResponse>(await this.doRequest("1.0", "sofa.apigateway.monitor.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMonitorResponse({}));
  }

  /**
   * Description: 查询结果码
   * Summary: 查询结果码
   */
  async queryResultcode(request: QueryResultcodeRequest): Promise<QueryResultcodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryResultcodeEx(request, headers, runtime);
  }

  /**
   * Description: 查询结果码
   * Summary: 查询结果码
   */
  async queryResultcodeEx(request: QueryResultcodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryResultcodeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryResultcodeResponse>(await this.doRequest("1.0", "sofa.apigateway.resultcode.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryResultcodeResponse({}));
  }

  /**
   * Description: 上线指定版本api
   * Summary: 上线指定版本api
   */
  async onlineApiVersion(request: OnlineApiVersionRequest): Promise<OnlineApiVersionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.onlineApiVersionEx(request, headers, runtime);
  }

  /**
   * Description: 上线指定版本api
   * Summary: 上线指定版本api
   */
  async onlineApiVersionEx(request: OnlineApiVersionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OnlineApiVersionResponse> {
    Util.validateModel(request);
    return $tea.cast<OnlineApiVersionResponse>(await this.doRequest("1.0", "sofa.apigateway.api.version.online", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OnlineApiVersionResponse({}));
  }

  /**
   * Description: 创建LDC规则
   * Summary: 创建LDC规则
   */
  async createLdc(request: CreateLdcRequest): Promise<CreateLdcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLdcEx(request, headers, runtime);
  }

  /**
   * Description: 创建LDC规则
   * Summary: 创建LDC规则
   */
  async createLdcEx(request: CreateLdcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLdcResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLdcResponse>(await this.doRequest("1.0", "sofa.apigateway.ldc.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLdcResponse({}));
  }

  /**
   * Description: 修改 LDC规则
   * Summary: 修改 LDC规则
   */
  async updateLdc(request: UpdateLdcRequest): Promise<UpdateLdcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateLdcEx(request, headers, runtime);
  }

  /**
   * Description: 修改 LDC规则
   * Summary: 修改 LDC规则
   */
  async updateLdcEx(request: UpdateLdcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateLdcResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateLdcResponse>(await this.doRequest("1.0", "sofa.apigateway.ldc.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateLdcResponse({}));
  }

  /**
   * Description: 删除LDC规则
   * Summary: 删除LDC规则
   */
  async deleteLdc(request: DeleteLdcRequest): Promise<DeleteLdcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteLdcEx(request, headers, runtime);
  }

  /**
   * Description: 删除LDC规则
   * Summary: 删除LDC规则
   */
  async deleteLdcEx(request: DeleteLdcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteLdcResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteLdcResponse>(await this.doRequest("1.0", "sofa.apigateway.ldc.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteLdcResponse({}));
  }

  /**
   * Description: 查询ldc规则
   * Summary: 查询ldc规则
   */
  async getLdc(request: GetLdcRequest): Promise<GetLdcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getLdcEx(request, headers, runtime);
  }

  /**
   * Description: 查询ldc规则
   * Summary: 查询ldc规则
   */
  async getLdcEx(request: GetLdcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetLdcResponse> {
    Util.validateModel(request);
    return $tea.cast<GetLdcResponse>(await this.doRequest("1.0", "sofa.apigateway.ldc.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetLdcResponse({}));
  }

  /**
   * Description: 保存ldc规则
   * Summary: 保存ldc规则
   */
  async saveLdc(request: SaveLdcRequest): Promise<SaveLdcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveLdcEx(request, headers, runtime);
  }

  /**
   * Description: 保存ldc规则
   * Summary: 保存ldc规则
   */
  async saveLdcEx(request: SaveLdcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveLdcResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveLdcResponse>(await this.doRequest("1.0", "sofa.apigateway.ldc.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveLdcResponse({}));
  }

  /**
   * Description: 授权APP绑定API
   * Summary: 授权APP绑定API
   */
  async mountAuthappApi(request: MountAuthappApiRequest): Promise<MountAuthappApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.mountAuthappApiEx(request, headers, runtime);
  }

  /**
   * Description: 授权APP绑定API
   * Summary: 授权APP绑定API
   */
  async mountAuthappApiEx(request: MountAuthappApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<MountAuthappApiResponse> {
    Util.validateModel(request);
    return $tea.cast<MountAuthappApiResponse>(await this.doRequest("1.0", "sofa.apigateway.authapp.api.mount", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new MountAuthappApiResponse({}));
  }

  /**
   * Description: 授权app解除绑定Api
   * Summary: 授权app解除绑定Api
   */
  async unmountAuthappApi(request: UnmountAuthappApiRequest): Promise<UnmountAuthappApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.unmountAuthappApiEx(request, headers, runtime);
  }

  /**
   * Description: 授权app解除绑定Api
   * Summary: 授权app解除绑定Api
   */
  async unmountAuthappApiEx(request: UnmountAuthappApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UnmountAuthappApiResponse> {
    Util.validateModel(request);
    return $tea.cast<UnmountAuthappApiResponse>(await this.doRequest("1.0", "sofa.apigateway.authapp.api.unmount", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UnmountAuthappApiResponse({}));
  }

  /**
   * Description: 导入 API
   * Summary: 导入 API
   */
  async importApi(request: ImportApiRequest): Promise<ImportApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importApiEx(request, headers, runtime);
  }

  /**
   * Description: 导入 API
   * Summary: 导入 API
   */
  async importApiEx(request: ImportApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportApiResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportApiResponse>(await this.doRequest("1.0", "sofa.apigateway.api.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportApiResponse({}));
  }

  /**
   * Description: api批量导出
   * Summary: api批量导出
   */
  async exportApi(request: ExportApiRequest): Promise<ExportApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.exportApiEx(request, headers, runtime);
  }

  /**
   * Description: api批量导出
   * Summary: api批量导出
   */
  async exportApiEx(request: ExportApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExportApiResponse> {
    Util.validateModel(request);
    return $tea.cast<ExportApiResponse>(await this.doRequest("1.0", "sofa.apigateway.api.export", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExportApiResponse({}));
  }

  /**
   * Description: 根据API分组ID导出API
   * Summary: 根据API分组ID导出API
   */
  async exportApigroupApi(request: ExportApigroupApiRequest): Promise<ExportApigroupApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.exportApigroupApiEx(request, headers, runtime);
  }

  /**
   * Description: 根据API分组ID导出API
   * Summary: 根据API分组ID导出API
   */
  async exportApigroupApiEx(request: ExportApigroupApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExportApigroupApiResponse> {
    Util.validateModel(request);
    return $tea.cast<ExportApigroupApiResponse>(await this.doRequest("1.0", "sofa.apigateway.apigroup.api.export", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExportApigroupApiResponse({}));
  }

  /**
   * Description: 创建参数映射
   * Summary: 创建参数映射
   */
  async createParammapping(request: CreateParammappingRequest): Promise<CreateParammappingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createParammappingEx(request, headers, runtime);
  }

  /**
   * Description: 创建参数映射
   * Summary: 创建参数映射
   */
  async createParammappingEx(request: CreateParammappingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateParammappingResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateParammappingResponse>(await this.doRequest("1.0", "sofa.apigateway.parammapping.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateParammappingResponse({}));
  }

  /**
   * Description:  更新参数映射
   * Summary:  更新参数映射
   */
  async updateParammapping(request: UpdateParammappingRequest): Promise<UpdateParammappingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateParammappingEx(request, headers, runtime);
  }

  /**
   * Description:  更新参数映射
   * Summary:  更新参数映射
   */
  async updateParammappingEx(request: UpdateParammappingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateParammappingResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateParammappingResponse>(await this.doRequest("1.0", "sofa.apigateway.parammapping.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateParammappingResponse({}));
  }

  /**
   * Description: 删除参数映射
   * Summary: 删除参数映射
   */
  async deleteParammapping(request: DeleteParammappingRequest): Promise<DeleteParammappingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteParammappingEx(request, headers, runtime);
  }

  /**
   * Description: 删除参数映射
   * Summary: 删除参数映射
   */
  async deleteParammappingEx(request: DeleteParammappingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteParammappingResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteParammappingResponse>(await this.doRequest("1.0", "sofa.apigateway.parammapping.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteParammappingResponse({}));
  }

  /**
   * Description: 查询参数映射分页列表
   * Summary: 查询参数映射分页列表
   */
  async listParammapping(request: ListParammappingRequest): Promise<ListParammappingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listParammappingEx(request, headers, runtime);
  }

  /**
   * Description: 查询参数映射分页列表
   * Summary: 查询参数映射分页列表
   */
  async listParammappingEx(request: ListParammappingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListParammappingResponse> {
    Util.validateModel(request);
    return $tea.cast<ListParammappingResponse>(await this.doRequest("1.0", "sofa.apigateway.parammapping.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListParammappingResponse({}));
  }

  /**
   * Description: 查询API列表
   * Summary: 查询API列表
   */
  async allParammapping(request: AllParammappingRequest): Promise<AllParammappingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allParammappingEx(request, headers, runtime);
  }

  /**
   * Description: 查询API列表
   * Summary: 查询API列表
   */
  async allParammappingEx(request: AllParammappingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllParammappingResponse> {
    Util.validateModel(request);
    return $tea.cast<AllParammappingResponse>(await this.doRequest("1.0", "sofa.apigateway.parammapping.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllParammappingResponse({}));
  }

  /**
   * Description: 通过IDF查询参数映射
   * Summary: 通过IDF查询参数映射
   */
  async getParammapping(request: GetParammappingRequest): Promise<GetParammappingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getParammappingEx(request, headers, runtime);
  }

  /**
   * Description: 通过IDF查询参数映射
   * Summary: 通过IDF查询参数映射
   */
  async getParammappingEx(request: GetParammappingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetParammappingResponse> {
    Util.validateModel(request);
    return $tea.cast<GetParammappingResponse>(await this.doRequest("1.0", "sofa.apigateway.parammapping.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetParammappingResponse({}));
  }

  /**
   * Description: 根据映射参数ID查询api分页列表
   * Summary: 根据映射参数ID查询api分页列表
   */
  async listParammappingApi(request: ListParammappingApiRequest): Promise<ListParammappingApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listParammappingApiEx(request, headers, runtime);
  }

  /**
   * Description: 根据映射参数ID查询api分页列表
   * Summary: 根据映射参数ID查询api分页列表
   */
  async listParammappingApiEx(request: ListParammappingApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListParammappingApiResponse> {
    Util.validateModel(request);
    return $tea.cast<ListParammappingApiResponse>(await this.doRequest("1.0", "sofa.apigateway.parammapping.api.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListParammappingApiResponse({}));
  }

  /**
   * Description: 查询模型列表
   * Summary: 查询模型列表
   */
  async allApimodel(request: AllApimodelRequest): Promise<AllApimodelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allApimodelEx(request, headers, runtime);
  }

  /**
   * Description: 查询模型列表
   * Summary: 查询模型列表
   */
  async allApimodelEx(request: AllApimodelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllApimodelResponse> {
    Util.validateModel(request);
    return $tea.cast<AllApimodelResponse>(await this.doRequest("1.0", "sofa.apigateway.apimodel.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllApimodelResponse({}));
  }

  /**
   * Description: 查询api模板分页列表
   * Summary: 查询模型分页列表
   */
  async listApimodel(request: ListApimodelRequest): Promise<ListApimodelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listApimodelEx(request, headers, runtime);
  }

  /**
   * Description: 查询api模板分页列表
   * Summary: 查询模型分页列表
   */
  async listApimodelEx(request: ListApimodelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListApimodelResponse> {
    Util.validateModel(request);
    return $tea.cast<ListApimodelResponse>(await this.doRequest("1.0", "sofa.apigateway.apimodel.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListApimodelResponse({}));
  }

  /**
   * Description: 创建api模型
   * Summary: 创建api模型
   */
  async createApimodel(request: CreateApimodelRequest): Promise<CreateApimodelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createApimodelEx(request, headers, runtime);
  }

  /**
   * Description: 创建api模型
   * Summary: 创建api模型
   */
  async createApimodelEx(request: CreateApimodelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateApimodelResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateApimodelResponse>(await this.doRequest("1.0", "sofa.apigateway.apimodel.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateApimodelResponse({}));
  }

  /**
   * Description: 删除api模型
   * Summary: 删除api模型
   */
  async deleteApimodel(request: DeleteApimodelRequest): Promise<DeleteApimodelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteApimodelEx(request, headers, runtime);
  }

  /**
   * Description: 删除api模型
   * Summary: 删除api模型
   */
  async deleteApimodelEx(request: DeleteApimodelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteApimodelResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteApimodelResponse>(await this.doRequest("1.0", "sofa.apigateway.apimodel.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteApimodelResponse({}));
  }

  /**
   * Description: 根据模型ID查询模型
   * Summary: 根据模型ID查询模型
   */
  async getApimodel(request: GetApimodelRequest): Promise<GetApimodelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getApimodelEx(request, headers, runtime);
  }

  /**
   * Description: 根据模型ID查询模型
   * Summary: 根据模型ID查询模型
   */
  async getApimodelEx(request: GetApimodelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetApimodelResponse> {
    Util.validateModel(request);
    return $tea.cast<GetApimodelResponse>(await this.doRequest("1.0", "sofa.apigateway.apimodel.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetApimodelResponse({}));
  }

  /**
   * Description: 更新模型
   * Summary: 更新模型
   */
  async updateApimodel(request: UpdateApimodelRequest): Promise<UpdateApimodelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateApimodelEx(request, headers, runtime);
  }

  /**
   * Description: 更新模型
   * Summary: 更新模型
   */
  async updateApimodelEx(request: UpdateApimodelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateApimodelResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateApimodelResponse>(await this.doRequest("1.0", "sofa.apigateway.apimodel.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateApimodelResponse({}));
  }

  /**
   * Description: 通过模型ID查询使用的API列表
   * Summary: 通过模型ID查询使用的API列表
   */
  async allApimodelApi(request: AllApimodelApiRequest): Promise<AllApimodelApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allApimodelApiEx(request, headers, runtime);
  }

  /**
   * Description: 通过模型ID查询使用的API列表
   * Summary: 通过模型ID查询使用的API列表
   */
  async allApimodelApiEx(request: AllApimodelApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllApimodelApiResponse> {
    Util.validateModel(request);
    return $tea.cast<AllApimodelApiResponse>(await this.doRequest("1.0", "sofa.apigateway.apimodel.api.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllApimodelApiResponse({}));
  }

  /**
   * Description: 通过模型ID查询使用的API分页列表
   * Summary: 通过模型ID查询使用的API分页列表
   */
  async listApimodelApi(request: ListApimodelApiRequest): Promise<ListApimodelApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listApimodelApiEx(request, headers, runtime);
  }

  /**
   * Description: 通过模型ID查询使用的API分页列表
   * Summary: 通过模型ID查询使用的API分页列表
   */
  async listApimodelApiEx(request: ListApimodelApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListApimodelApiResponse> {
    Util.validateModel(request);
    return $tea.cast<ListApimodelApiResponse>(await this.doRequest("1.0", "sofa.apigateway.apimodel.api.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListApimodelApiResponse({}));
  }

  /**
   * Description: 创建外部授权
   * Summary: 创建外部授权
   */
  async createExternalauth(request: CreateExternalauthRequest): Promise<CreateExternalauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createExternalauthEx(request, headers, runtime);
  }

  /**
   * Description: 创建外部授权
   * Summary: 创建外部授权
   */
  async createExternalauthEx(request: CreateExternalauthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateExternalauthResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateExternalauthResponse>(await this.doRequest("1.0", "sofa.apigateway.externalauth.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateExternalauthResponse({}));
  }

  /**
   * Description: 更新外部系统
   * Summary: 更新外部系统
   */
  async updateExternalauth(request: UpdateExternalauthRequest): Promise<UpdateExternalauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateExternalauthEx(request, headers, runtime);
  }

  /**
   * Description: 更新外部系统
   * Summary: 更新外部系统
   */
  async updateExternalauthEx(request: UpdateExternalauthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateExternalauthResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateExternalauthResponse>(await this.doRequest("1.0", "sofa.apigateway.externalauth.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateExternalauthResponse({}));
  }

  /**
   * Description: 删除外部授权
   * Summary: 删除外部授权
   */
  async deleteExternalauth(request: DeleteExternalauthRequest): Promise<DeleteExternalauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteExternalauthEx(request, headers, runtime);
  }

  /**
   * Description: 删除外部授权
   * Summary: 删除外部授权
   */
  async deleteExternalauthEx(request: DeleteExternalauthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteExternalauthResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteExternalauthResponse>(await this.doRequest("1.0", "sofa.apigateway.externalauth.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteExternalauthResponse({}));
  }

  /**
   * Description: 通过ID查询外部授权
   * Summary: 通过ID查询外部授权
   */
  async getExternalauth(request: GetExternalauthRequest): Promise<GetExternalauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getExternalauthEx(request, headers, runtime);
  }

  /**
   * Description: 通过ID查询外部授权
   * Summary: 通过ID查询外部授权
   */
  async getExternalauthEx(request: GetExternalauthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetExternalauthResponse> {
    Util.validateModel(request);
    return $tea.cast<GetExternalauthResponse>(await this.doRequest("1.0", "sofa.apigateway.externalauth.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetExternalauthResponse({}));
  }

  /**
   * Description: 查询外部授权分页列表
   * Summary: 查询外部授权分页列表
   */
  async listExternalauth(request: ListExternalauthRequest): Promise<ListExternalauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listExternalauthEx(request, headers, runtime);
  }

  /**
   * Description: 查询外部授权分页列表
   * Summary: 查询外部授权分页列表
   */
  async listExternalauthEx(request: ListExternalauthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListExternalauthResponse> {
    Util.validateModel(request);
    return $tea.cast<ListExternalauthResponse>(await this.doRequest("1.0", "sofa.apigateway.externalauth.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListExternalauthResponse({}));
  }

  /**
   * Description:  查询外部系统列表
   * Summary:  查询外部系统列表
   */
  async allExternalauth(request: AllExternalauthRequest): Promise<AllExternalauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allExternalauthEx(request, headers, runtime);
  }

  /**
   * Description:  查询外部系统列表
   * Summary:  查询外部系统列表
   */
  async allExternalauthEx(request: AllExternalauthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllExternalauthResponse> {
    Util.validateModel(request);
    return $tea.cast<AllExternalauthResponse>(await this.doRequest("1.0", "sofa.apigateway.externalauth.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllExternalauthResponse({}));
  }

  /**
   * Description: 外部授权绑定api
   * Summary: 外部授权绑定api
   */
  async mountExternalauthApi(request: MountExternalauthApiRequest): Promise<MountExternalauthApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.mountExternalauthApiEx(request, headers, runtime);
  }

  /**
   * Description: 外部授权绑定api
   * Summary: 外部授权绑定api
   */
  async mountExternalauthApiEx(request: MountExternalauthApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<MountExternalauthApiResponse> {
    Util.validateModel(request);
    return $tea.cast<MountExternalauthApiResponse>(await this.doRequest("1.0", "sofa.apigateway.externalauth.api.mount", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new MountExternalauthApiResponse({}));
  }

  /**
   * Description: 外部授权解绑api
   * Summary: 外部授权解绑api
   */
  async unmountExternalauthApi(request: UnmountExternalauthApiRequest): Promise<UnmountExternalauthApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.unmountExternalauthApiEx(request, headers, runtime);
  }

  /**
   * Description: 外部授权解绑api
   * Summary: 外部授权解绑api
   */
  async unmountExternalauthApiEx(request: UnmountExternalauthApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UnmountExternalauthApiResponse> {
    Util.validateModel(request);
    return $tea.cast<UnmountExternalauthApiResponse>(await this.doRequest("1.0", "sofa.apigateway.externalauth.api.unmount", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UnmountExternalauthApiResponse({}));
  }

  /**
   * Description: 删除模型参数
   * Summary: 删除模型参数
   */
  async deleteApimodelParam(request: DeleteApimodelParamRequest): Promise<DeleteApimodelParamResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteApimodelParamEx(request, headers, runtime);
  }

  /**
   * Description: 删除模型参数
   * Summary: 删除模型参数
   */
  async deleteApimodelParamEx(request: DeleteApimodelParamRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteApimodelParamResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteApimodelParamResponse>(await this.doRequest("1.0", "sofa.apigateway.apimodel.param.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteApimodelParamResponse({}));
  }

  /**
   * Description: 更新模型参数
   * Summary: 更新模型参数
   */
  async updateApimodelParam(request: UpdateApimodelParamRequest): Promise<UpdateApimodelParamResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateApimodelParamEx(request, headers, runtime);
  }

  /**
   * Description: 更新模型参数
   * Summary: 更新模型参数
   */
  async updateApimodelParamEx(request: UpdateApimodelParamRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateApimodelParamResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateApimodelParamResponse>(await this.doRequest("1.0", "sofa.apigateway.apimodel.param.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateApimodelParamResponse({}));
  }

  /**
   * Description: 新增模型参数
   * Summary: 新增模型参数
   */
  async createApimodelParam(request: CreateApimodelParamRequest): Promise<CreateApimodelParamResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createApimodelParamEx(request, headers, runtime);
  }

  /**
   * Description: 新增模型参数
   * Summary: 新增模型参数
   */
  async createApimodelParamEx(request: CreateApimodelParamRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateApimodelParamResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateApimodelParamResponse>(await this.doRequest("1.0", "sofa.apigateway.apimodel.param.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateApimodelParamResponse({}));
  }

  /**
   * Description: 通过外部授权ID查询API分页列表
   * Summary: 通过外部授权ID查询API分页列表
   */
  async listExternalauthApi(request: ListExternalauthApiRequest): Promise<ListExternalauthApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listExternalauthApiEx(request, headers, runtime);
  }

  /**
   * Description: 通过外部授权ID查询API分页列表
   * Summary: 通过外部授权ID查询API分页列表
   */
  async listExternalauthApiEx(request: ListExternalauthApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListExternalauthApiResponse> {
    Util.validateModel(request);
    return $tea.cast<ListExternalauthApiResponse>(await this.doRequest("1.0", "sofa.apigateway.externalauth.api.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListExternalauthApiResponse({}));
  }

  /**
   * Description: 校检 模型引用是否死循环
   * Summary: 校检 模型引用是否死循环
   */
  async checkApimodelParam(request: CheckApimodelParamRequest): Promise<CheckApimodelParamResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkApimodelParamEx(request, headers, runtime);
  }

  /**
   * Description: 校检 模型引用是否死循环
   * Summary: 校检 模型引用是否死循环
   */
  async checkApimodelParamEx(request: CheckApimodelParamRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckApimodelParamResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckApimodelParamResponse>(await this.doRequest("1.0", "sofa.apigateway.apimodel.param.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckApimodelParamResponse({}));
  }

  /**
   * Description: 解析数据模型
   * Summary: 解析数据模型
   */
  async resolveApimodel(request: ResolveApimodelRequest): Promise<ResolveApimodelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.resolveApimodelEx(request, headers, runtime);
  }

  /**
   * Description: 解析数据模型
   * Summary: 解析数据模型
   */
  async resolveApimodelEx(request: ResolveApimodelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ResolveApimodelResponse> {
    Util.validateModel(request);
    return $tea.cast<ResolveApimodelResponse>(await this.doRequest("1.0", "sofa.apigateway.apimodel.resolve", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ResolveApimodelResponse({}));
  }

  /**
   * Description: 侯志波
   * Summary: 导入数据模型
   */
  async importApimodel(request: ImportApimodelRequest): Promise<ImportApimodelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importApimodelEx(request, headers, runtime);
  }

  /**
   * Description: 侯志波
   * Summary: 导入数据模型
   */
  async importApimodelEx(request: ImportApimodelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportApimodelResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportApimodelResponse>(await this.doRequest("1.0", "sofa.apigateway.apimodel.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportApimodelResponse({}));
  }

  /**
   * Description: mgs模型转换 为网关模型
   * Summary: （mgs模型数据迁移）转换 为网关模型
   */
  async applyApimodelMgs(request: ApplyApimodelMgsRequest): Promise<ApplyApimodelMgsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyApimodelMgsEx(request, headers, runtime);
  }

  /**
   * Description: mgs模型转换 为网关模型
   * Summary: （mgs模型数据迁移）转换 为网关模型
   */
  async applyApimodelMgsEx(request: ApplyApimodelMgsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyApimodelMgsResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyApimodelMgsResponse>(await this.doRequest("1.0", "sofa.apigateway.apimodel.mgs.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyApimodelMgsResponse({}));
  }

  /**
   * Description: 查询操作人分页列表
   * Summary: 查询操作人分页列表
   */
  async listOperator(request: ListOperatorRequest): Promise<ListOperatorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listOperatorEx(request, headers, runtime);
  }

  /**
   * Description: 查询操作人分页列表
   * Summary: 查询操作人分页列表
   */
  async listOperatorEx(request: ListOperatorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListOperatorResponse> {
    Util.validateModel(request);
    return $tea.cast<ListOperatorResponse>(await this.doRequest("1.0", "sofa.apigateway.operator.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListOperatorResponse({}));
  }

  /**
   * Description: 更新api分组授权用户配置
   * Summary: 更新api分组授权用户配置
   */
  async updateApigroupAuthuserconfig(request: UpdateApigroupAuthuserconfigRequest): Promise<UpdateApigroupAuthuserconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateApigroupAuthuserconfigEx(request, headers, runtime);
  }

  /**
   * Description: 更新api分组授权用户配置
   * Summary: 更新api分组授权用户配置
   */
  async updateApigroupAuthuserconfigEx(request: UpdateApigroupAuthuserconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateApigroupAuthuserconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateApigroupAuthuserconfigResponse>(await this.doRequest("1.0", "sofa.apigateway.apigroup.authuserconfig.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateApigroupAuthuserconfigResponse({}));
  }

  /**
   * Description: 查询api分组授权用户配置
   * Summary: 查询api分组授权用户配置
   */
  async getApigroupAuthuserconfig(request: GetApigroupAuthuserconfigRequest): Promise<GetApigroupAuthuserconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getApigroupAuthuserconfigEx(request, headers, runtime);
  }

  /**
   * Description: 查询api分组授权用户配置
   * Summary: 查询api分组授权用户配置
   */
  async getApigroupAuthuserconfigEx(request: GetApigroupAuthuserconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetApigroupAuthuserconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<GetApigroupAuthuserconfigResponse>(await this.doRequest("1.0", "sofa.apigateway.apigroup.authuserconfig.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetApigroupAuthuserconfigResponse({}));
  }

  /**
   * Description: api分组添加用户
   * Summary: api分组添加用户
   */
  async addApigroupAuthuser(request: AddApigroupAuthuserRequest): Promise<AddApigroupAuthuserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addApigroupAuthuserEx(request, headers, runtime);
  }

  /**
   * Description: api分组添加用户
   * Summary: api分组添加用户
   */
  async addApigroupAuthuserEx(request: AddApigroupAuthuserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddApigroupAuthuserResponse> {
    Util.validateModel(request);
    return $tea.cast<AddApigroupAuthuserResponse>(await this.doRequest("1.0", "sofa.apigateway.apigroup.authuser.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddApigroupAuthuserResponse({}));
  }

  /**
   * Description:  api分组授权用户使用权限
   * Summary:  api分组授权用户使用权限
   */
  async mountApigroupAuthuser(request: MountApigroupAuthuserRequest): Promise<MountApigroupAuthuserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.mountApigroupAuthuserEx(request, headers, runtime);
  }

  /**
   * Description:  api分组授权用户使用权限
   * Summary:  api分组授权用户使用权限
   */
  async mountApigroupAuthuserEx(request: MountApigroupAuthuserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<MountApigroupAuthuserResponse> {
    Util.validateModel(request);
    return $tea.cast<MountApigroupAuthuserResponse>(await this.doRequest("1.0", "sofa.apigateway.apigroup.authuser.mount", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new MountApigroupAuthuserResponse({}));
  }

  /**
   * Description: 
  api解除用户使用权限
   * Summary:  api解除用户使用权限
   */
  async unmountApigroupAuthuser(request: UnmountApigroupAuthuserRequest): Promise<UnmountApigroupAuthuserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.unmountApigroupAuthuserEx(request, headers, runtime);
  }

  /**
   * Description: 
  api解除用户使用权限
   * Summary:  api解除用户使用权限
   */
  async unmountApigroupAuthuserEx(request: UnmountApigroupAuthuserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UnmountApigroupAuthuserResponse> {
    Util.validateModel(request);
    return $tea.cast<UnmountApigroupAuthuserResponse>(await this.doRequest("1.0", "sofa.apigateway.apigroup.authuser.unmount", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UnmountApigroupAuthuserResponse({}));
  }

  /**
   * Description: 查询api分组授权用户分页列表
   * Summary: 查询api分组授权用户分页列表
   */
  async listApigroupAuthuser(request: ListApigroupAuthuserRequest): Promise<ListApigroupAuthuserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listApigroupAuthuserEx(request, headers, runtime);
  }

  /**
   * Description: 查询api分组授权用户分页列表
   * Summary: 查询api分组授权用户分页列表
   */
  async listApigroupAuthuserEx(request: ListApigroupAuthuserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListApigroupAuthuserResponse> {
    Util.validateModel(request);
    return $tea.cast<ListApigroupAuthuserResponse>(await this.doRequest("1.0", "sofa.apigateway.apigroup.authuser.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListApigroupAuthuserResponse({}));
  }

  /**
   * Description: api分组删除用户
   * Summary: api分组删除用户
   */
  async deleteApigroupAuthuser(request: DeleteApigroupAuthuserRequest): Promise<DeleteApigroupAuthuserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteApigroupAuthuserEx(request, headers, runtime);
  }

  /**
   * Description: api分组删除用户
   * Summary: api分组删除用户
   */
  async deleteApigroupAuthuserEx(request: DeleteApigroupAuthuserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteApigroupAuthuserResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteApigroupAuthuserResponse>(await this.doRequest("1.0", "sofa.apigateway.apigroup.authuser.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteApigroupAuthuserResponse({}));
  }

  /**
   * Description: 校验是否有api分组权限
   * Summary: 校验是否有api分组权限
   */
  async verifyApiApigroup(request: VerifyApiApigroupRequest): Promise<VerifyApiApigroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyApiApigroupEx(request, headers, runtime);
  }

  /**
   * Description: 校验是否有api分组权限
   * Summary: 校验是否有api分组权限
   */
  async verifyApiApigroupEx(request: VerifyApiApigroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyApiApigroupResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyApiApigroupResponse>(await this.doRequest("1.0", "sofa.apigateway.api.apigroup.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyApiApigroupResponse({}));
  }

  /**
   * Description: 修改app绑定api加密状态
   * Summary: 修改app绑定api加密状态
   */
  async updateAppAuthapi(request: UpdateAppAuthapiRequest): Promise<UpdateAppAuthapiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAppAuthapiEx(request, headers, runtime);
  }

  /**
   * Description: 修改app绑定api加密状态
   * Summary: 修改app绑定api加密状态
   */
  async updateAppAuthapiEx(request: UpdateAppAuthapiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAppAuthapiResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAppAuthapiResponse>(await this.doRequest("1.0", "sofa.apigateway.app.authapi.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAppAuthapiResponse({}));
  }

  /**
   * Description: 配置zone
   * Summary: 全局配置zone
   */
  async createGwconfig(request: CreateGwconfigRequest): Promise<CreateGwconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createGwconfigEx(request, headers, runtime);
  }

  /**
   * Description: 配置zone
   * Summary: 全局配置zone
   */
  async createGwconfigEx(request: CreateGwconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateGwconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateGwconfigResponse>(await this.doRequest("1.0", "sofa.apigateway.gwconfig.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateGwconfigResponse({}));
  }

  /**
   * Description: 查询全局网关配置
   * Summary: 查询全局网关配置
   */
  async getGwconfig(request: GetGwconfigRequest): Promise<GetGwconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getGwconfigEx(request, headers, runtime);
  }

  /**
   * Description: 查询全局网关配置
   * Summary: 查询全局网关配置
   */
  async getGwconfigEx(request: GetGwconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetGwconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<GetGwconfigResponse>(await this.doRequest("1.0", "sofa.apigateway.gwconfig.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetGwconfigResponse({}));
  }

  /**
   * Description: 更新全局网关配置
   * Summary: 更新全局网关配置
   */
  async updateGwconfig(request: UpdateGwconfigRequest): Promise<UpdateGwconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateGwconfigEx(request, headers, runtime);
  }

  /**
   * Description: 更新全局网关配置
   * Summary: 更新全局网关配置
   */
  async updateGwconfigEx(request: UpdateGwconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateGwconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateGwconfigResponse>(await this.doRequest("1.0", "sofa.apigateway.gwconfig.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateGwconfigResponse({}));
  }

  /**
   * Description: 查询全局网关列表
   * Summary: 查询全局网关列表
   */
  async allGwconfig(request: AllGwconfigRequest): Promise<AllGwconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allGwconfigEx(request, headers, runtime);
  }

  /**
   * Description: 查询全局网关列表
   * Summary: 查询全局网关列表
   */
  async allGwconfigEx(request: AllGwconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllGwconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<AllGwconfigResponse>(await this.doRequest("1.0", "sofa.apigateway.gwconfig.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllGwconfigResponse({}));
  }

  /**
   * Description: 查询instance_id
   * Summary: 查询instance_id
   */
  async getInstance(request: GetInstanceRequest): Promise<GetInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getInstanceEx(request, headers, runtime);
  }

  /**
   * Description: 查询instance_id
   * Summary: 查询instance_id
   */
  async getInstanceEx(request: GetInstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetInstanceResponse>(await this.doRequest("1.0", "sofa.apigateway.instance.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetInstanceResponse({}));
  }

  /**
   * Description: 删除zone、网关效验
   * Summary: 删除zone、网关效验
   */
  async checkGwconfigDelete(request: CheckGwconfigDeleteRequest): Promise<CheckGwconfigDeleteResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkGwconfigDeleteEx(request, headers, runtime);
  }

  /**
   * Description: 删除zone、网关效验
   * Summary: 删除zone、网关效验
   */
  async checkGwconfigDeleteEx(request: CheckGwconfigDeleteRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckGwconfigDeleteResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckGwconfigDeleteResponse>(await this.doRequest("1.0", "sofa.apigateway.gwconfig.delete.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckGwconfigDeleteResponse({}));
  }

  /**
   * Description: 更新zone、网关效验
   * Summary: 更新zone、网关效验
   */
  async checkGwconfigUpdate(request: CheckGwconfigUpdateRequest): Promise<CheckGwconfigUpdateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkGwconfigUpdateEx(request, headers, runtime);
  }

  /**
   * Description: 更新zone、网关效验
   * Summary: 更新zone、网关效验
   */
  async checkGwconfigUpdateEx(request: CheckGwconfigUpdateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckGwconfigUpdateResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckGwconfigUpdateResponse>(await this.doRequest("1.0", "sofa.apigateway.gwconfig.update.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckGwconfigUpdateResponse({}));
  }

  /**
   * Description: 创建跨云互通代理模式
   * Summary: 创建跨云互通代理模式
   */
  async createApiGwconfig(request: CreateApiGwconfigRequest): Promise<CreateApiGwconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createApiGwconfigEx(request, headers, runtime);
  }

  /**
   * Description: 创建跨云互通代理模式
   * Summary: 创建跨云互通代理模式
   */
  async createApiGwconfigEx(request: CreateApiGwconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateApiGwconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateApiGwconfigResponse>(await this.doRequest("1.0", "sofa.apigateway.api.gwconfig.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateApiGwconfigResponse({}));
  }

  /**
   * Description: 更新跨云互通API
   * Summary: 更新跨云互通API
   */
  async updateApiGwconfig(request: UpdateApiGwconfigRequest): Promise<UpdateApiGwconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateApiGwconfigEx(request, headers, runtime);
  }

  /**
   * Description: 更新跨云互通API
   * Summary: 更新跨云互通API
   */
  async updateApiGwconfigEx(request: UpdateApiGwconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateApiGwconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateApiGwconfigResponse>(await this.doRequest("1.0", "sofa.apigateway.api.gwconfig.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateApiGwconfigResponse({}));
  }

  /**
   * Description: 录入api时的参数效验
   * Summary: 录入api时的参数效验
   */
  async checkApi(request: CheckApiRequest): Promise<CheckApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkApiEx(request, headers, runtime);
  }

  /**
   * Description: 录入api时的参数效验
   * Summary: 录入api时的参数效验
   */
  async checkApiEx(request: CheckApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckApiResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckApiResponse>(await this.doRequest("1.0", "sofa.apigateway.api.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckApiResponse({}));
  }

  /**
   * Description: 系统集群修改校验
   * Summary: 系统集群修改校验是否可修改
   */
  async checkSysUpdate(request: CheckSysUpdateRequest): Promise<CheckSysUpdateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkSysUpdateEx(request, headers, runtime);
  }

  /**
   * Description: 系统集群修改校验
   * Summary: 系统集群修改校验是否可修改
   */
  async checkSysUpdateEx(request: CheckSysUpdateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckSysUpdateResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckSysUpdateResponse>(await this.doRequest("1.0", "sofa.apigateway.sys.update.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckSysUpdateResponse({}));
  }

  /**
   * Description: api查看历史版本信息
   * Summary: api查看历史版本信息
   */
  async getApiHistoryversionapi(request: GetApiHistoryversionapiRequest): Promise<GetApiHistoryversionapiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getApiHistoryversionapiEx(request, headers, runtime);
  }

  /**
   * Description: api查看历史版本信息
   * Summary: api查看历史版本信息
   */
  async getApiHistoryversionapiEx(request: GetApiHistoryversionapiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetApiHistoryversionapiResponse> {
    Util.validateModel(request);
    return $tea.cast<GetApiHistoryversionapiResponse>(await this.doRequest("1.0", "sofa.apigateway.api.historyversionapi.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetApiHistoryversionapiResponse({}));
  }

  /**
   * Description: 查询策略列表
   * Summary: 查询策略列表
   */
  async allStrategy(request: AllStrategyRequest): Promise<AllStrategyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allStrategyEx(request, headers, runtime);
  }

  /**
   * Description: 查询策略列表
   * Summary: 查询策略列表
   */
  async allStrategyEx(request: AllStrategyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllStrategyResponse> {
    Util.validateModel(request);
    return $tea.cast<AllStrategyResponse>(await this.doRequest("1.0", "sofa.apigateway.strategy.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllStrategyResponse({}));
  }

  /**
   * Description: 根据strategyID查询API列表
   * Summary: 根据strategyID查询API列表
   */
  async allStrategyApi(request: AllStrategyApiRequest): Promise<AllStrategyApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allStrategyApiEx(request, headers, runtime);
  }

  /**
   * Description: 根据strategyID查询API列表
   * Summary: 根据strategyID查询API列表
   */
  async allStrategyApiEx(request: AllStrategyApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllStrategyApiResponse> {
    Util.validateModel(request);
    return $tea.cast<AllStrategyApiResponse>(await this.doRequest("1.0", "sofa.apigateway.strategy.api.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllStrategyApiResponse({}));
  }

  /**
   * Description: 根据strategyID查询API分页
   * Summary: 根据strategyID查询API分页
   */
  async listStrategyApi(request: ListStrategyApiRequest): Promise<ListStrategyApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listStrategyApiEx(request, headers, runtime);
  }

  /**
   * Description: 根据strategyID查询API分页
   * Summary: 根据strategyID查询API分页
   */
  async listStrategyApiEx(request: ListStrategyApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListStrategyApiResponse> {
    Util.validateModel(request);
    return $tea.cast<ListStrategyApiResponse>(await this.doRequest("1.0", "sofa.apigateway.strategy.api.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListStrategyApiResponse({}));
  }

  /**
   * Description:  根据strategy ID绑定API
   * Summary:  根据strategy ID绑定API
   */
  async mountStrategyApi(request: MountStrategyApiRequest): Promise<MountStrategyApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.mountStrategyApiEx(request, headers, runtime);
  }

  /**
   * Description:  根据strategy ID绑定API
   * Summary:  根据strategy ID绑定API
   */
  async mountStrategyApiEx(request: MountStrategyApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<MountStrategyApiResponse> {
    Util.validateModel(request);
    return $tea.cast<MountStrategyApiResponse>(await this.doRequest("1.0", "sofa.apigateway.strategy.api.mount", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new MountStrategyApiResponse({}));
  }

  /**
   * Description: 根据strategyID 解绑API
   * Summary: 根据strategyID 解绑API
   */
  async unmountStrategyApi(request: UnmountStrategyApiRequest): Promise<UnmountStrategyApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.unmountStrategyApiEx(request, headers, runtime);
  }

  /**
   * Description: 根据strategyID 解绑API
   * Summary: 根据strategyID 解绑API
   */
  async unmountStrategyApiEx(request: UnmountStrategyApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UnmountStrategyApiResponse> {
    Util.validateModel(request);
    return $tea.cast<UnmountStrategyApiResponse>(await this.doRequest("1.0", "sofa.apigateway.strategy.api.unmount", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UnmountStrategyApiResponse({}));
  }

  /**
   * Description:  创建策略
   * Summary:  创建策略
   */
  async createStrategy(request: CreateStrategyRequest): Promise<CreateStrategyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createStrategyEx(request, headers, runtime);
  }

  /**
   * Description:  创建策略
   * Summary:  创建策略
   */
  async createStrategyEx(request: CreateStrategyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateStrategyResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateStrategyResponse>(await this.doRequest("1.0", "sofa.apigateway.strategy.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateStrategyResponse({}));
  }

  /**
   * Description: 删除策略
   * Summary: 删除策略
   */
  async deleteStrategy(request: DeleteStrategyRequest): Promise<DeleteStrategyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteStrategyEx(request, headers, runtime);
  }

  /**
   * Description: 删除策略
   * Summary: 删除策略
   */
  async deleteStrategyEx(request: DeleteStrategyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteStrategyResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteStrategyResponse>(await this.doRequest("1.0", "sofa.apigateway.strategy.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteStrategyResponse({}));
  }

  /**
   * Description: 根据ID查询strategy
   * Summary: 根据ID查询strategy
   */
  async getStrategy(request: GetStrategyRequest): Promise<GetStrategyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getStrategyEx(request, headers, runtime);
  }

  /**
   * Description: 根据ID查询strategy
   * Summary: 根据ID查询strategy
   */
  async getStrategyEx(request: GetStrategyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetStrategyResponse> {
    Util.validateModel(request);
    return $tea.cast<GetStrategyResponse>(await this.doRequest("1.0", "sofa.apigateway.strategy.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetStrategyResponse({}));
  }

  /**
   * Description: 查询strategy分页列表
   * Summary: 查询strategy分页列表
   */
  async listStrategy(request: ListStrategyRequest): Promise<ListStrategyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listStrategyEx(request, headers, runtime);
  }

  /**
   * Description: 查询strategy分页列表
   * Summary: 查询strategy分页列表
   */
  async listStrategyEx(request: ListStrategyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListStrategyResponse> {
    Util.validateModel(request);
    return $tea.cast<ListStrategyResponse>(await this.doRequest("1.0", "sofa.apigateway.strategy.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListStrategyResponse({}));
  }

  /**
   * Description:  编辑strategy
   * Summary:  编辑strategy
   */
  async updateStrategy(request: UpdateStrategyRequest): Promise<UpdateStrategyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateStrategyEx(request, headers, runtime);
  }

  /**
   * Description:  编辑strategy
   * Summary:  编辑strategy
   */
  async updateStrategyEx(request: UpdateStrategyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateStrategyResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateStrategyResponse>(await this.doRequest("1.0", "sofa.apigateway.strategy.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateStrategyResponse({}));
  }

  /**
   * Description: 查询数量
   * Summary: 查询数量
   */
  async getHome(request: GetHomeRequest): Promise<GetHomeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getHomeEx(request, headers, runtime);
  }

  /**
   * Description: 查询数量
   * Summary: 查询数量
   */
  async getHomeEx(request: GetHomeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetHomeResponse> {
    Util.validateModel(request);
    return $tea.cast<GetHomeResponse>(await this.doRequest("1.0", "sofa.apigateway.home.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetHomeResponse({}));
  }

  /**
   * Description: 录入域名时的效验
   * Summary: 录入域名时的效验
   */
  async checkApigroupDomain(request: CheckApigroupDomainRequest): Promise<CheckApigroupDomainResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkApigroupDomainEx(request, headers, runtime);
  }

  /**
   * Description: 录入域名时的效验
   * Summary: 录入域名时的效验
   */
  async checkApigroupDomainEx(request: CheckApigroupDomainRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckApigroupDomainResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckApigroupDomainResponse>(await this.doRequest("1.0", "sofa.apigateway.apigroup.domain.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckApigroupDomainResponse({}));
  }

  /**
   * Description: 查询域名后缀
   * Summary: 查询域名后缀
   */
  async getApigroupDomain(request: GetApigroupDomainRequest): Promise<GetApigroupDomainResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getApigroupDomainEx(request, headers, runtime);
  }

  /**
   * Description: 查询域名后缀
   * Summary: 查询域名后缀
   */
  async getApigroupDomainEx(request: GetApigroupDomainRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetApigroupDomainResponse> {
    Util.validateModel(request);
    return $tea.cast<GetApigroupDomainResponse>(await this.doRequest("1.0", "sofa.apigateway.apigroup.domain.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetApigroupDomainResponse({}));
  }

  /**
   * Description: 查看api生成的swagger文档
   * Summary: 查看api生成的swagger文档
   */
  async getApiSwagger(request: GetApiSwaggerRequest): Promise<GetApiSwaggerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getApiSwaggerEx(request, headers, runtime);
  }

  /**
   * Description: 查看api生成的swagger文档
   * Summary: 查看api生成的swagger文档
   */
  async getApiSwaggerEx(request: GetApiSwaggerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetApiSwaggerResponse> {
    Util.validateModel(request);
    return $tea.cast<GetApiSwaggerResponse>(await this.doRequest("1.0", "sofa.apigateway.api.swagger.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetApiSwaggerResponse({}));
  }

  /**
   * Description: api文档下载
   * Summary: api文档下载
   */
  async downloadApiSwagger(request: DownloadApiSwaggerRequest): Promise<DownloadApiSwaggerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.downloadApiSwaggerEx(request, headers, runtime);
  }

  /**
   * Description: api文档下载
   * Summary: api文档下载
   */
  async downloadApiSwaggerEx(request: DownloadApiSwaggerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DownloadApiSwaggerResponse> {
    Util.validateModel(request);
    return $tea.cast<DownloadApiSwaggerResponse>(await this.doRequest("1.0", "sofa.apigateway.api.swagger.download", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DownloadApiSwaggerResponse({}));
  }

  /**
   * Description: 代码生成
   * Summary: 代码生成
   */
  async downloadApimodelCodegen(request: DownloadApimodelCodegenRequest): Promise<DownloadApimodelCodegenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.downloadApimodelCodegenEx(request, headers, runtime);
  }

  /**
   * Description: 代码生成
   * Summary: 代码生成
   */
  async downloadApimodelCodegenEx(request: DownloadApimodelCodegenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DownloadApimodelCodegenResponse> {
    Util.validateModel(request);
    return $tea.cast<DownloadApimodelCodegenResponse>(await this.doRequest("1.0", "sofa.apigateway.apimodel.codegen.download", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DownloadApimodelCodegenResponse({}));
  }

  /**
   * Description: 获取双网模块开关
   * Summary: 获取双网模块开关
   */
  async getGwconfigGatewayswitch(request: GetGwconfigGatewayswitchRequest): Promise<GetGwconfigGatewayswitchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getGwconfigGatewayswitchEx(request, headers, runtime);
  }

  /**
   * Description: 获取双网模块开关
   * Summary: 获取双网模块开关
   */
  async getGwconfigGatewayswitchEx(request: GetGwconfigGatewayswitchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetGwconfigGatewayswitchResponse> {
    Util.validateModel(request);
    return $tea.cast<GetGwconfigGatewayswitchResponse>(await this.doRequest("1.0", "sofa.apigateway.gwconfig.gatewayswitch.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetGwconfigGatewayswitchResponse({}));
  }

  /**
   * Description: 查询注册中心列表
   * Summary: 查询注册中心列表
   */
  async allRegistry(request: AllRegistryRequest): Promise<AllRegistryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allRegistryEx(request, headers, runtime);
  }

  /**
   * Description: 查询注册中心列表
   * Summary: 查询注册中心列表
   */
  async allRegistryEx(request: AllRegistryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllRegistryResponse> {
    Util.validateModel(request);
    return $tea.cast<AllRegistryResponse>(await this.doRequest("1.0", "sofa.apigateway.registry.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllRegistryResponse({}));
  }

  /**
   * Description: 查询注册中心绑定的集群列表
   * Summary: 查询注册中心绑定的集群列表
   */
  async allRegistrySys(request: AllRegistrySysRequest): Promise<AllRegistrySysResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allRegistrySysEx(request, headers, runtime);
  }

  /**
   * Description: 查询注册中心绑定的集群列表
   * Summary: 查询注册中心绑定的集群列表
   */
  async allRegistrySysEx(request: AllRegistrySysRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllRegistrySysResponse> {
    Util.validateModel(request);
    return $tea.cast<AllRegistrySysResponse>(await this.doRequest("1.0", "sofa.apigateway.registry.sys.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllRegistrySysResponse({}));
  }

  /**
   * Description: 分页查询注册中心绑定的集群列表
   * Summary: 分页查询注册中心绑定的集群列表
   */
  async listRegistrySys(request: ListRegistrySysRequest): Promise<ListRegistrySysResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listRegistrySysEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询注册中心绑定的集群列表
   * Summary: 分页查询注册中心绑定的集群列表
   */
  async listRegistrySysEx(request: ListRegistrySysRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListRegistrySysResponse> {
    Util.validateModel(request);
    return $tea.cast<ListRegistrySysResponse>(await this.doRequest("1.0", "sofa.apigateway.registry.sys.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListRegistrySysResponse({}));
  }

  /**
   * Description: 创建注册中心
   * Summary: 创建注册中心
   */
  async createRegistry(request: CreateRegistryRequest): Promise<CreateRegistryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createRegistryEx(request, headers, runtime);
  }

  /**
   * Description: 创建注册中心
   * Summary: 创建注册中心
   */
  async createRegistryEx(request: CreateRegistryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateRegistryResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateRegistryResponse>(await this.doRequest("1.0", "sofa.apigateway.registry.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateRegistryResponse({}));
  }

  /**
   * Description:  通过ID删除注册中心
   * Summary:  通过ID删除注册中心
   */
  async deleteRegistry(request: DeleteRegistryRequest): Promise<DeleteRegistryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteRegistryEx(request, headers, runtime);
  }

  /**
   * Description:  通过ID删除注册中心
   * Summary:  通过ID删除注册中心
   */
  async deleteRegistryEx(request: DeleteRegistryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteRegistryResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteRegistryResponse>(await this.doRequest("1.0", "sofa.apigateway.registry.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteRegistryResponse({}));
  }

  /**
   * Description: 通过ID查询注册中心
   * Summary: 通过ID查询注册中心
   */
  async getRegistry(request: GetRegistryRequest): Promise<GetRegistryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getRegistryEx(request, headers, runtime);
  }

  /**
   * Description: 通过ID查询注册中心
   * Summary: 通过ID查询注册中心
   */
  async getRegistryEx(request: GetRegistryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetRegistryResponse> {
    Util.validateModel(request);
    return $tea.cast<GetRegistryResponse>(await this.doRequest("1.0", "sofa.apigateway.registry.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetRegistryResponse({}));
  }

  /**
   * Description:  查询注册中心分页列表
   * Summary:  查询注册中心分页列表
   */
  async listRegistry(request: ListRegistryRequest): Promise<ListRegistryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listRegistryEx(request, headers, runtime);
  }

  /**
   * Description:  查询注册中心分页列表
   * Summary:  查询注册中心分页列表
   */
  async listRegistryEx(request: ListRegistryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListRegistryResponse> {
    Util.validateModel(request);
    return $tea.cast<ListRegistryResponse>(await this.doRequest("1.0", "sofa.apigateway.registry.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListRegistryResponse({}));
  }

  /**
   * Description: 更新注册中心
   * Summary: 更新注册中心
   */
  async updateRegistry(request: UpdateRegistryRequest): Promise<UpdateRegistryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateRegistryEx(request, headers, runtime);
  }

  /**
   * Description: 更新注册中心
   * Summary: 更新注册中心
   */
  async updateRegistryEx(request: UpdateRegistryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateRegistryResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateRegistryResponse>(await this.doRequest("1.0", "sofa.apigateway.registry.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateRegistryResponse({}));
  }

  /**
   * Description: 执行流程编排
   * Summary: 执行流程编排
   */
  async execApiflow(request: ExecApiflowRequest): Promise<ExecApiflowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execApiflowEx(request, headers, runtime);
  }

  /**
   * Description: 执行流程编排
   * Summary: 执行流程编排
   */
  async execApiflowEx(request: ExecApiflowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecApiflowResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecApiflowResponse>(await this.doRequest("1.0", "sofa.apigateway.apiflow.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecApiflowResponse({}));
  }

  /**
   * Description: 通过ID删除编排
   * Summary: 通过ID删除编排
   */
  async deleteApiflow(request: DeleteApiflowRequest): Promise<DeleteApiflowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteApiflowEx(request, headers, runtime);
  }

  /**
   * Description: 通过ID删除编排
   * Summary: 通过ID删除编排
   */
  async deleteApiflowEx(request: DeleteApiflowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteApiflowResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteApiflowResponse>(await this.doRequest("1.0", "sofa.apigateway.apiflow.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteApiflowResponse({}));
  }

  /**
   * Description: 查询全部编排列表
   * Summary: 查询全部编排列表
   */
  async allApiflow(request: AllApiflowRequest): Promise<AllApiflowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allApiflowEx(request, headers, runtime);
  }

  /**
   * Description: 查询全部编排列表
   * Summary: 查询全部编排列表
   */
  async allApiflowEx(request: AllApiflowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllApiflowResponse> {
    Util.validateModel(request);
    return $tea.cast<AllApiflowResponse>(await this.doRequest("1.0", "sofa.apigateway.apiflow.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllApiflowResponse({}));
  }

  /**
   * Description: 查询编排分页列表
   * Summary: 查询编排分页列表
   */
  async listApiflow(request: ListApiflowRequest): Promise<ListApiflowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listApiflowEx(request, headers, runtime);
  }

  /**
   * Description: 查询编排分页列表
   * Summary: 查询编排分页列表
   */
  async listApiflowEx(request: ListApiflowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListApiflowResponse> {
    Util.validateModel(request);
    return $tea.cast<ListApiflowResponse>(await this.doRequest("1.0", "sofa.apigateway.apiflow.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListApiflowResponse({}));
  }

  /**
   * Description: 创建API形式的编排
   * Summary: 创建API形式的编排
   */
  async createApiflow(request: CreateApiflowRequest): Promise<CreateApiflowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createApiflowEx(request, headers, runtime);
  }

  /**
   * Description: 创建API形式的编排
   * Summary: 创建API形式的编排
   */
  async createApiflowEx(request: CreateApiflowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateApiflowResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateApiflowResponse>(await this.doRequest("1.0", "sofa.apigateway.apiflow.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateApiflowResponse({}));
  }

  /**
   * Description: 通过ID查询编排
   * Summary: 通过ID查询编排
   */
  async getApiflow(request: GetApiflowRequest): Promise<GetApiflowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getApiflowEx(request, headers, runtime);
  }

  /**
   * Description: 通过ID查询编排
   * Summary: 通过ID查询编排
   */
  async getApiflowEx(request: GetApiflowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetApiflowResponse> {
    Util.validateModel(request);
    return $tea.cast<GetApiflowResponse>(await this.doRequest("1.0", "sofa.apigateway.apiflow.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetApiflowResponse({}));
  }

  /**
   * Description: 更新编排信息
   * Summary: 更新编排信息
   */
  async updateApiflow(request: UpdateApiflowRequest): Promise<UpdateApiflowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateApiflowEx(request, headers, runtime);
  }

  /**
   * Description: 更新编排信息
   * Summary: 更新编排信息
   */
  async updateApiflowEx(request: UpdateApiflowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateApiflowResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateApiflowResponse>(await this.doRequest("1.0", "sofa.apigateway.apiflow.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateApiflowResponse({}));
  }

  /**
   * Description: 数据模型转json
   * Summary: 数据模型转json
   */
  async getApimodelJson(request: GetApimodelJsonRequest): Promise<GetApimodelJsonResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getApimodelJsonEx(request, headers, runtime);
  }

  /**
   * Description: 数据模型转json
   * Summary: 数据模型转json
   */
  async getApimodelJsonEx(request: GetApimodelJsonRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetApimodelJsonResponse> {
    Util.validateModel(request);
    return $tea.cast<GetApimodelJsonResponse>(await this.doRequest("1.0", "sofa.apigateway.apimodel.json.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetApimodelJsonResponse({}));
  }

  /**
   * Description: 替换成apiflow所需的json
   * Summary: 替换成apiflow所需的json
   */
  async replaceApimodelJson(request: ReplaceApimodelJsonRequest): Promise<ReplaceApimodelJsonResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.replaceApimodelJsonEx(request, headers, runtime);
  }

  /**
   * Description: 替换成apiflow所需的json
   * Summary: 替换成apiflow所需的json
   */
  async replaceApimodelJsonEx(request: ReplaceApimodelJsonRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReplaceApimodelJsonResponse> {
    Util.validateModel(request);
    return $tea.cast<ReplaceApimodelJsonResponse>(await this.doRequest("1.0", "sofa.apigateway.apimodel.json.replace", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReplaceApimodelJsonResponse({}));
  }

  /**
   * Description: 获取triple协议开关
   * Summary: 获取triple协议开关
   */
  async getGwconfigTripleswitch(request: GetGwconfigTripleswitchRequest): Promise<GetGwconfigTripleswitchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getGwconfigTripleswitchEx(request, headers, runtime);
  }

  /**
   * Description: 获取triple协议开关
   * Summary: 获取triple协议开关
   */
  async getGwconfigTripleswitchEx(request: GetGwconfigTripleswitchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetGwconfigTripleswitchResponse> {
    Util.validateModel(request);
    return $tea.cast<GetGwconfigTripleswitchResponse>(await this.doRequest("1.0", "sofa.apigateway.gwconfig.tripleswitch.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetGwconfigTripleswitchResponse({}));
  }

  /**
   * Description: 专有云triple查询开关
   * Summary: 专有云triple查询开关
   */
  async queryGwconfigTripleswitch(request: QueryGwconfigTripleswitchRequest): Promise<QueryGwconfigTripleswitchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGwconfigTripleswitchEx(request, headers, runtime);
  }

  /**
   * Description: 专有云triple查询开关
   * Summary: 专有云triple查询开关
   */
  async queryGwconfigTripleswitchEx(request: QueryGwconfigTripleswitchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGwconfigTripleswitchResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGwconfigTripleswitchResponse>(await this.doRequest("1.0", "sofa.apigateway.gwconfig.tripleswitch.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGwconfigTripleswitchResponse({}));
  }

  /**
   * Description: 查询灰度规则配置
   * Summary: 查询灰度规则配置
   */
  async allGrayscale(request: AllGrayscaleRequest): Promise<AllGrayscaleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allGrayscaleEx(request, headers, runtime);
  }

  /**
   * Description: 查询灰度规则配置
   * Summary: 查询灰度规则配置
   */
  async allGrayscaleEx(request: AllGrayscaleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllGrayscaleResponse> {
    Util.validateModel(request);
    return $tea.cast<AllGrayscaleResponse>(await this.doRequest("1.0", "sofa.apigateway.grayscale.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllGrayscaleResponse({}));
  }

  /**
   * Description: 分页查询灰度规则列表
   * Summary: 分页查询灰度规则列表
   */
  async listGrayscale(request: ListGrayscaleRequest): Promise<ListGrayscaleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listGrayscaleEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询灰度规则列表
   * Summary: 分页查询灰度规则列表
   */
  async listGrayscaleEx(request: ListGrayscaleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListGrayscaleResponse> {
    Util.validateModel(request);
    return $tea.cast<ListGrayscaleResponse>(await this.doRequest("1.0", "sofa.apigateway.grayscale.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListGrayscaleResponse({}));
  }

  /**
   * Description: 查询所有region名称
   * Summary: 查询所有region名称
   */
  async allRouterRegion(request: AllRouterRegionRequest): Promise<AllRouterRegionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allRouterRegionEx(request, headers, runtime);
  }

  /**
   * Description: 查询所有region名称
   * Summary: 查询所有region名称
   */
  async allRouterRegionEx(request: AllRouterRegionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllRouterRegionResponse> {
    Util.validateModel(request);
    return $tea.cast<AllRouterRegionResponse>(await this.doRequest("1.0", "sofa.apigateway.router.region.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllRouterRegionResponse({}));
  }

}
