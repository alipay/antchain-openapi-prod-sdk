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

// 集群信息
export class ClusterMeta extends $tea.Model {
  // 集群唯一标识
  clusterId?: string;
  // 集群名字
  clusterName?: string;
  // 区域
  region?: string;
  static names(): { [key: string]: string } {
    return {
      clusterId: 'cluster_id',
      clusterName: 'cluster_name',
      region: 'region',
    };
  }

  static types(): { [key: string]: any } {
    return {
      clusterId: 'string',
      clusterName: 'string',
      region: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// KeyValuePair
export class KeyValuePair extends $tea.Model {
  // key
  key: string;
  // value
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

// 中间件集群
export class MiddlewareCluster extends $tea.Model {
  // 集群id 
  clusterId: string;
  // 集群名字
  clusterName?: string;
  // 支持的region 列表
  enableRegions: string[];
  // 支持的dataCenter 列表
  enableDataCenters?: string[];
  // 支持的zone 列表
  enableZones?: string[];
  // acvip 地址
  acvipEndpoint: string;
  static names(): { [key: string]: string } {
    return {
      clusterId: 'cluster_id',
      clusterName: 'cluster_name',
      enableRegions: 'enable_regions',
      enableDataCenters: 'enable_data_centers',
      enableZones: 'enable_zones',
      acvipEndpoint: 'acvip_endpoint',
    };
  }

  static types(): { [key: string]: any } {
    return {
      clusterId: 'string',
      clusterName: 'string',
      enableRegions: { 'type': 'array', 'itemType': 'string' },
      enableDataCenters: { 'type': 'array', 'itemType': 'string' },
      enableZones: { 'type': 'array', 'itemType': 'string' },
      acvipEndpoint: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 每个instance的endpoint信息
export class AksEndpoint extends $tea.Model {
  // access_key
  accessKey: string;
  // access_secret
  accessSecret: string;
  // acvip的地址
  endpoint: string;
  // 产品id
  instanceId: string;
  // 租户名
  tenant: string;
  // 工作区
  workspace: string;
  // 表示mesh的配置信息, 用key/value的形式给出.
  mesh: KeyValuePair[];
  static names(): { [key: string]: string } {
    return {
      accessKey: 'access_key',
      accessSecret: 'access_secret',
      endpoint: 'endpoint',
      instanceId: 'instance_id',
      tenant: 'tenant',
      workspace: 'workspace',
      mesh: 'mesh',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accessKey: 'string',
      accessSecret: 'string',
      endpoint: 'string',
      instanceId: 'string',
      tenant: 'string',
      workspace: 'string',
      mesh: { 'type': 'array', 'itemType': KeyValuePair },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AccessKey 实体信息
export class AccessKey extends $tea.Model {
  // AK
  accesskey: string;
  // 实体创建者
  creator: string;
  // 创建时间
  gmtcreate: string;
  // 实体Id
  id: number;
  // 实例Id
  instanceid: string;
  // 是否加密
  isencrypted: boolean;
  // 实体名称
  name: string;
  // SK
  secretkey: string;
  static names(): { [key: string]: string } {
    return {
      accesskey: 'accesskey',
      creator: 'creator',
      gmtcreate: 'gmtcreate',
      id: 'id',
      instanceid: 'instanceid',
      isencrypted: 'isencrypted',
      name: 'name',
      secretkey: 'secretkey',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accesskey: 'string',
      creator: 'string',
      gmtcreate: 'string',
      id: 'number',
      instanceid: 'string',
      isencrypted: 'boolean',
      name: 'string',
      secretkey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 产品信息
export class Product extends $tea.Model {
  // 产品id
  id?: number;
  // 产品名称
  productName?: string;
  // 产品代码
  productCode?: string;
  // 开通状态, T为已开通, F为未开通
  openingStatus?: string;
  // 运行状态的枚举值:
  // 					running 正在运行
  // 					stopped 已经停止
  // 					starting 正在启动
  // 					start_fail 启动失败
  // 					stopping 正在停止
  // 					stop_fail 停止失败
  // 					arrearage 因为欠费, 已经停止
  // 					stopping_arr 因为欠费, 正在停止
  // 				
  runningStatus?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      productName: 'product_name',
      productCode: 'product_code',
      openingStatus: 'opening_status',
      runningStatus: 'running_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      productName: 'string',
      productCode: 'string',
      openingStatus: 'string',
      runningStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 绑定实例
export class BindInstance extends $tea.Model {
  // 集群id
  clusterId: string;
  // 集群名字
  clusterName?: string;
  // 支持的region
  regions: string[];
  // 支持的dataCenter 
  dataCenters?: string;
  // 支持的zone 列表
  zones?: string;
  // 绑定后的instanceId 信息
  instanceId: string;
  // acvip 地址
  acvipEndpoint: string;
  // 工作空间组
  workspaceGroup: string;
  // 租户id
  tenantId: string;
  static names(): { [key: string]: string } {
    return {
      clusterId: 'cluster_id',
      clusterName: 'cluster_name',
      regions: 'regions',
      dataCenters: 'data_centers',
      zones: 'zones',
      instanceId: 'instance_id',
      acvipEndpoint: 'acvip_endpoint',
      workspaceGroup: 'workspace_group',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      clusterId: 'string',
      clusterName: 'string',
      regions: { 'type': 'array', 'itemType': 'string' },
      dataCenters: 'string',
      zones: 'string',
      instanceId: 'string',
      acvipEndpoint: 'string',
      workspaceGroup: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 集群模式
export class ClusterMode extends $tea.Model {
  // 集群模式
  clusterMode: string;
  // 区域
  regions: ClusterMeta[];
  static names(): { [key: string]: string } {
    return {
      clusterMode: 'cluster_mode',
      regions: 'regions',
    };
  }

  static types(): { [key: string]: any } {
    return {
      clusterMode: 'string',
      regions: { 'type': 'array', 'itemType': ClusterMeta },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 实例信息
export class Instance extends $tea.Model {
  // 实例id
  instanceId?: string;
  // 租户
  tenant?: string;
  // 工作空间
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      instanceId: 'instance_id',
      tenant: 'tenant',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instanceId: 'string',
      tenant: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInstancesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户
  tenant: string;
  // 工作空间, 选填, 如果指定了工作空间, 就只返回这个工作空间关联的信息
  workspace?: string;
  // 当前页码，默认为1
  pageNum?: number;
  // 分页大小，默认10
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenant: 'tenant',
      workspace: 'workspace',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenant: 'string',
      workspace: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInstancesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户列表
  instances: Instance[];
  // 当前页码
  pageNum: number;
  // 分页大小
  pageSize: number;
  // 记录总数
  totalCount: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      instances: 'instances',
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
      instances: { 'type': 'array', 'itemType': Instance },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryProductsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 产品名称, 选填, 如果指定了产品名称就只返回指定产品的信息
  productName?: string;
  // 实例id
  instanceId: string;
  // 当前页码，默认为1
  pageNum?: number;
  // 分页大小，默认10
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productName: 'product_name',
      instanceId: 'instance_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productName: 'string',
      instanceId: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryProductsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 产品列表
  products: Product[];
  // 当前页码
  pageNum: number;
  // 分页大小
  pageSize: number;
  // 记录总数
  totalCount: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      products: 'products',
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
      products: { 'type': 'array', 'itemType': Product },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEndpointsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 网络类型, classic, vpc
  network: string;
  // 当前页数
  pageNum: number;
  // 分页大小, 考虑到数据量并不多, 建议设置分页足够大(就10几个), 比如100, 一次性拿走所有数据
  pageSize: number;
  // 租户名
  tenant: string;
  // 工作区名称, 如果不填, 则返回全部workspace的信息
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      network: 'network',
      pageNum: 'page_num',
      pageSize: 'page_size',
      tenant: 'tenant',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      network: 'string',
      pageNum: 'number',
      pageSize: 'number',
      tenant: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEndpointsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // endpoint信息
  endpoints: AksEndpoint[];
  // 当前页数
  pageNum: number;
  // 分页大小
  pageSize: number;
  // 总记录数
  totalCount: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      endpoints: 'endpoints',
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
      endpoints: { 'type': 'array', 'itemType': AksEndpoint },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ScaleoutClustersRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据中心
  dataCenter: string;
  // 生效 Domain
  domain: string;
  // 生效 instanceId，如果是需要全局生效使用 ALL_INSTANCE_ID
  instanceId: string;
  // 网络类型，无特殊需求填写 CLASSIC
  networkType: string;
  // 产品名称
  product: string;
  // 扩容 IP
  serviceIp: string;
  // 生效端口
  servicePort: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dataCenter: 'data_center',
      domain: 'domain',
      instanceId: 'instance_id',
      networkType: 'network_type',
      product: 'product',
      serviceIp: 'service_ip',
      servicePort: 'service_port',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataCenter: 'string',
      domain: 'string',
      instanceId: 'string',
      networkType: 'string',
      product: 'string',
      serviceIp: 'string',
      servicePort: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ScaleoutClustersResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作结果
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

export class ScaleinClusterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据中心
  dataCenter: string;
  // 生效 domain
  domain: string;
  // 生效实例 ID，全部生效则为 ALL_INSTANCE_ID
  instanceId: string;
  // 网络类型，无特殊情况填写 CLASSIC
  networkType: string;
  // 产品名称
  product: string;
  // 缩容 IP
  serviceIp: string;
  // 生效端口
  servicePort: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dataCenter: 'data_center',
      domain: 'domain',
      instanceId: 'instance_id',
      networkType: 'network_type',
      product: 'product',
      serviceIp: 'service_ip',
      servicePort: 'service_port',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataCenter: 'string',
      domain: 'string',
      instanceId: 'string',
      networkType: 'string',
      product: 'string',
      serviceIp: 'string',
      servicePort: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ScaleinClusterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作是否成功
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

export class SetClustersRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 生效域名
  domain: string;
  // 开启/关闭
  enable: boolean;
  // 生效实例 ID，如果全部则为 ALL_INSTANCE_ID
  instanceId: string;
  // 作用 IP
  serviceIp: string;
  // 网络类型，如果无特殊需求 CLASSIC
  networkType: string;
  // 产品名称
  product: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      domain: 'domain',
      enable: 'enable',
      instanceId: 'instance_id',
      serviceIp: 'service_ip',
      networkType: 'network_type',
      product: 'product',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      domain: 'string',
      enable: 'boolean',
      instanceId: 'string',
      serviceIp: 'string',
      networkType: 'string',
      product: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetClustersResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作是否成功
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

export class GetInstancesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 共享中间件实例id
  instanceId?: string;
  // 租户name
  middlewareTenant?: string;
  // workspace name
  middlewareWorkspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      middlewareTenant: 'middleware_tenant',
      middlewareWorkspace: 'middleware_workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      middlewareTenant: 'string',
      middlewareWorkspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInstancesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // instance id
  instanceId?: string;
  // 之所以不叫tenant是为了防止和openapi内置的tenant字段冲突.
  middlewareTenant?: string;
  // 之所以不叫workspace是为了防止和openapi内置的workspace字段冲突.
  middlewareWorkspace?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      instanceId: 'instance_id',
      middlewareTenant: 'middleware_tenant',
      middlewareWorkspace: 'middleware_workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      instanceId: 'string',
      middlewareTenant: 'string',
      middlewareWorkspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAccesskeyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 该参数是一个instanceId 
  instanceId: string;
  // 该字段为AK/SK的创建名
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAccesskeyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // AccessKey对象
  accesskey?: AccessKey;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accesskey: 'accesskey',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accesskey: AccessKey,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAccesskeyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 	
  // 该参数是一个instanceId
  instanceId: string;
  // 	
  // 该字段为AK/SK的创建名
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAccesskeyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // AccessKey对象
  accesskey?: AccessKey;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accesskey: 'accesskey',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accesskey: AccessKey,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetMiddlewareMetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id 
  tenantId: string;
  // 工作空间
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

export class GetMiddlewareMetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 租户id
  tenantId?: string;
  // 工作空间
  workspaceId?: string;
  // instanceId
  instanceId?: string;
  // acvip 连接地址
  acvipEndpoint?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tenantId: 'tenant_id',
      workspaceId: 'workspace_id',
      instanceId: 'instance_id',
      acvipEndpoint: 'acvip_endpoint',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tenantId: 'string',
      workspaceId: 'string',
      instanceId: 'string',
      acvipEndpoint: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetWorkspacegroupInstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id 
  tenantId: string;
  // 工作空间组
  workspaceGroup: string;
  // 集群id
  clusterId?: string;
  // 是否需要原始的instanceId
  needReal?: boolean;
  // workspace
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      workspaceGroup: 'workspace_group',
      clusterId: 'cluster_id',
      needReal: 'need_real',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      workspaceGroup: 'string',
      clusterId: 'string',
      needReal: 'boolean',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetWorkspacegroupInstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // instanceId
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

export class QueryMiddlewareClustermodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // XXX
  tenantId: string;
  // workspace_group
  workspaceGroup: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      workspaceGroup: 'workspace_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      workspaceGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMiddlewareClustermodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 集群模式
  data?: ClusterMode;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: ClusterMode,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMiddlewareClustersRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMiddlewareClustersResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 集群列表
  data?: MiddlewareCluster[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': MiddlewareCluster },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindMiddlewareInstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id 
  tenantId: string;
  // 工作空间组
  workspaceGroup: string;
  // region
  clusterId: string;
  // 工作空间，多个中间使用"," 隔开
  workspaces: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      workspaceGroup: 'workspace_group',
      clusterId: 'cluster_id',
      workspaces: 'workspaces',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      workspaceGroup: 'string',
      clusterId: 'string',
      workspaces: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindMiddlewareInstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回绑定实例信息
  data?: BindInstance;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: BindInstance,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnbindMiddlewareInstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id 
  tenantId: string;
  // 工作空间
  workspaceGroup: string;
  // 集群id
  clusterId: string;
  // 工作空间，如果有多个则使用 "," 隔开
  workspaces: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      workspaceGroup: 'workspace_group',
      clusterId: 'cluster_id',
      workspaces: 'workspaces',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      workspaceGroup: 'string',
      clusterId: 'string',
      workspaces: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnbindMiddlewareInstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果
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
          sdk_version: "1.1.5",
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
   * Description: 查询实例信息
   * Summary: 查询实例信息
   */
  async queryInstances(request: QueryInstancesRequest): Promise<QueryInstancesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInstancesEx(request, headers, runtime);
  }

  /**
   * Description: 查询实例信息
   * Summary: 查询实例信息
   */
  async queryInstancesEx(request: QueryInstancesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInstancesResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInstancesResponse>(await this.doRequest("2.0", "sofa.osp.instances.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInstancesResponse({}));
  }

  /**
   * Description: 查询产品信息
   * Summary: 查询产品信息
   */
  async queryProducts(request: QueryProductsRequest): Promise<QueryProductsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryProductsEx(request, headers, runtime);
  }

  /**
   * Description: 查询产品信息
   * Summary: 查询产品信息
   */
  async queryProductsEx(request: QueryProductsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryProductsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryProductsResponse>(await this.doRequest("2.0", "sofa.osp.products.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryProductsResponse({}));
  }

  /**
   * Description: 获取共享中间件参数信息
   * Summary: 获取共享中间件参数信息
   */
  async queryEndpoints(request: QueryEndpointsRequest): Promise<QueryEndpointsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEndpointsEx(request, headers, runtime);
  }

  /**
   * Description: 获取共享中间件参数信息
   * Summary: 获取共享中间件参数信息
   */
  async queryEndpointsEx(request: QueryEndpointsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEndpointsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEndpointsResponse>(await this.doRequest("2.0", "sofa.osp.endpoints.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEndpointsResponse({}));
  }

  /**
   * Description: 针对 domain 进行扩容操作
   * Summary: 扩容接口
   */
  async scaleoutClusters(request: ScaleoutClustersRequest): Promise<ScaleoutClustersResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.scaleoutClustersEx(request, headers, runtime);
  }

  /**
   * Description: 针对 domain 进行扩容操作
   * Summary: 扩容接口
   */
  async scaleoutClustersEx(request: ScaleoutClustersRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ScaleoutClustersResponse> {
    Util.validateModel(request);
    return $tea.cast<ScaleoutClustersResponse>(await this.doRequest("1.0", "sofa.osp.clusters.scaleout", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ScaleoutClustersResponse({}));
  }

  /**
   * Description: 针对 domain 进行缩容
   * Summary: 缩容接口
   */
  async scaleinCluster(request: ScaleinClusterRequest): Promise<ScaleinClusterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.scaleinClusterEx(request, headers, runtime);
  }

  /**
   * Description: 针对 domain 进行缩容
   * Summary: 缩容接口
   */
  async scaleinClusterEx(request: ScaleinClusterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ScaleinClusterResponse> {
    Util.validateModel(request);
    return $tea.cast<ScaleinClusterResponse>(await this.doRequest("1.0", "sofa.osp.cluster.scalein", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ScaleinClusterResponse({}));
  }

  /**
   * Description: 设置节点是否生效（上下线）
   * Summary: 设置节点是否生效（上下线）
   */
  async setClusters(request: SetClustersRequest): Promise<SetClustersResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setClustersEx(request, headers, runtime);
  }

  /**
   * Description: 设置节点是否生效（上下线）
   * Summary: 设置节点是否生效（上下线）
   */
  async setClustersEx(request: SetClustersRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetClustersResponse> {
    Util.validateModel(request);
    return $tea.cast<SetClustersResponse>(await this.doRequest("1.0", "sofa.osp.clusters.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetClustersResponse({}));
  }

  /**
   * Description: 根据instanceId获取对应的tenant和workspace的信息
   * Summary: 获取instance详情
   */
  async getInstances(request: GetInstancesRequest): Promise<GetInstancesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getInstancesEx(request, headers, runtime);
  }

  /**
   * Description: 根据instanceId获取对应的tenant和workspace的信息
   * Summary: 获取instance详情
   */
  async getInstancesEx(request: GetInstancesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetInstancesResponse> {
    Util.validateModel(request);
    return $tea.cast<GetInstancesResponse>(await this.doRequest("1.0", "sofa.osp.instances.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetInstancesResponse({}));
  }

  /**
   * Description: 用户传入 instanceId 和 name 两个参数 ，然后该接口根据这些参数 生成对应的AK/SK 后返回
   * Summary: 创建AK/SK的接口
   */
  async createAccesskey(request: CreateAccesskeyRequest): Promise<CreateAccesskeyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAccesskeyEx(request, headers, runtime);
  }

  /**
   * Description: 用户传入 instanceId 和 name 两个参数 ，然后该接口根据这些参数 生成对应的AK/SK 后返回
   * Summary: 创建AK/SK的接口
   */
  async createAccesskeyEx(request: CreateAccesskeyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAccesskeyResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAccesskeyResponse>(await this.doRequest("1.0", "sofa.osp.accesskey.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAccesskeyResponse({}));
  }

  /**
   * Description: 根据 instanceId 和 name获取AK/SK的接口
   * Summary: 获取AK/SK的接口
   */
  async getAccesskey(request: GetAccesskeyRequest): Promise<GetAccesskeyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAccesskeyEx(request, headers, runtime);
  }

  /**
   * Description: 根据 instanceId 和 name获取AK/SK的接口
   * Summary: 获取AK/SK的接口
   */
  async getAccesskeyEx(request: GetAccesskeyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAccesskeyResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAccesskeyResponse>(await this.doRequest("1.0", "sofa.osp.accesskey.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAccesskeyResponse({}));
  }

  /**
   * Description: 中间件元数据获取
   * Summary: 中间件元数据获取
   */
  async getMiddlewareMeta(request: GetMiddlewareMetaRequest): Promise<GetMiddlewareMetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getMiddlewareMetaEx(request, headers, runtime);
  }

  /**
   * Description: 中间件元数据获取
   * Summary: 中间件元数据获取
   */
  async getMiddlewareMetaEx(request: GetMiddlewareMetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetMiddlewareMetaResponse> {
    Util.validateModel(request);
    return $tea.cast<GetMiddlewareMetaResponse>(await this.doRequest("1.0", "sofa.osp.middleware.meta.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetMiddlewareMetaResponse({}));
  }

  /**
   * Description: 根据workspaceGroup查询instanceId
   * Summary: 查询instanceId
   */
  async getWorkspacegroupInstance(request: GetWorkspacegroupInstanceRequest): Promise<GetWorkspacegroupInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getWorkspacegroupInstanceEx(request, headers, runtime);
  }

  /**
   * Description: 根据workspaceGroup查询instanceId
   * Summary: 查询instanceId
   */
  async getWorkspacegroupInstanceEx(request: GetWorkspacegroupInstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetWorkspacegroupInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetWorkspacegroupInstanceResponse>(await this.doRequest("1.0", "sofa.osp.workspacegroup.instance.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetWorkspacegroupInstanceResponse({}));
  }

  /**
   * Description: 查询中间件集群模式
   * Summary: 查询中间件集群模式
   */
  async queryMiddlewareClustermode(request: QueryMiddlewareClustermodeRequest): Promise<QueryMiddlewareClustermodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMiddlewareClustermodeEx(request, headers, runtime);
  }

  /**
   * Description: 查询中间件集群模式
   * Summary: 查询中间件集群模式
   */
  async queryMiddlewareClustermodeEx(request: QueryMiddlewareClustermodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMiddlewareClustermodeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMiddlewareClustermodeResponse>(await this.doRequest("1.0", "sofa.osp.middleware.clustermode.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMiddlewareClustermodeResponse({}));
  }

  /**
   * Description: 查询中间件集群列表
   * Summary: 查询中间件集群列表
   */
  async queryMiddlewareClusters(request: QueryMiddlewareClustersRequest): Promise<QueryMiddlewareClustersResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMiddlewareClustersEx(request, headers, runtime);
  }

  /**
   * Description: 查询中间件集群列表
   * Summary: 查询中间件集群列表
   */
  async queryMiddlewareClustersEx(request: QueryMiddlewareClustersRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMiddlewareClustersResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMiddlewareClustersResponse>(await this.doRequest("1.0", "sofa.osp.middleware.clusters.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMiddlewareClustersResponse({}));
  }

  /**
   * Description: 绑定中间件列表
   * Summary: 绑定中间件列表
   */
  async bindMiddlewareInstance(request: BindMiddlewareInstanceRequest): Promise<BindMiddlewareInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindMiddlewareInstanceEx(request, headers, runtime);
  }

  /**
   * Description: 绑定中间件列表
   * Summary: 绑定中间件列表
   */
  async bindMiddlewareInstanceEx(request: BindMiddlewareInstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindMiddlewareInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<BindMiddlewareInstanceResponse>(await this.doRequest("1.0", "sofa.osp.middleware.instance.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindMiddlewareInstanceResponse({}));
  }

  /**
   * Description: paas 解绑中间件
   * Summary: 解绑中间件实例
   */
  async unbindMiddlewareInstance(request: UnbindMiddlewareInstanceRequest): Promise<UnbindMiddlewareInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.unbindMiddlewareInstanceEx(request, headers, runtime);
  }

  /**
   * Description: paas 解绑中间件
   * Summary: 解绑中间件实例
   */
  async unbindMiddlewareInstanceEx(request: UnbindMiddlewareInstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UnbindMiddlewareInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<UnbindMiddlewareInstanceResponse>(await this.doRequest("1.0", "sofa.osp.middleware.instance.unbind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UnbindMiddlewareInstanceResponse({}));
  }

}
