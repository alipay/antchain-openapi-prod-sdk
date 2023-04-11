// This file is auto-generated, don't edit it
import AntchainUtil from '@antchain/alipay-util';
import Util, * as $Util from '@alicloud/tea-util';
import RPCUtil from '@alicloud/rpc-util';
import { Readable } from 'stream';
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

// 静态DSL
export class StaticDsl extends $tea.Model {
  //  
  spaceId: string;
  //  
  flowId: string;
  //  
  consentOn: boolean;
  //  
  parameters: string;
  static names(): { [key: string]: string } {
    return {
      spaceId: 'space_id',
      flowId: 'flow_id',
      consentOn: 'consent_on',
      parameters: 'parameters',
    };
  }

  static types(): { [key: string]: any } {
    return {
      spaceId: 'string',
      flowId: 'string',
      consentOn: 'boolean',
      parameters: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 动态工作流配置
export class DynamicDsl extends $tea.Model {
  //  
  flowId: string;
  //  
  instanceId: string;
  //  
  autoStart: boolean;
  //  
  parameters: string;
  static names(): { [key: string]: string } {
    return {
      flowId: 'flow_id',
      instanceId: 'instance_id',
      autoStart: 'auto_start',
      parameters: 'parameters',
    };
  }

  static types(): { [key: string]: any } {
    return {
      flowId: 'string',
      instanceId: 'string',
      autoStart: 'boolean',
      parameters: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 描述cube节点
export class NodeEndpoint extends $tea.Model {
  //  
  ip: string;
  //  
  port: string;
  static names(): { [key: string]: string } {
    return {
      ip: 'ip',
      port: 'port',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ip: 'string',
      port: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// GetNetworkStatus接口输入，包含networkId
export class GetNetworkStatusInput extends $tea.Model {
  // 网络的networkId
  networkId: string;
  static names(): { [key: string]: string } {
    return {
      networkId: 'network_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      networkId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 添加协作参与方到协作空间
export class AddPartyToSpaceInput extends $tea.Model {
  //  
  networkId: string;
  //  
  spaceId: string;
  //  
  nodeId: string;
  //  
  partyId: string;
  static names(): { [key: string]: string } {
    return {
      networkId: 'network_id',
      spaceId: 'space_id',
      nodeId: 'node_id',
      partyId: 'party_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      networkId: 'string',
      spaceId: 'string',
      nodeId: 'string',
      partyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

//  
export class Cnet extends $tea.Model {
  //  
  id: string;
  //  
  blockchainNum: string;
  //  
  myNormalNodeId: string;
  //  
  governanceContract: string;
  //  
  myRole: string;
  //  
  partyList: string[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      blockchainNum: 'blockchain_num',
      myNormalNodeId: 'my_normal_node_id',
      governanceContract: 'governance_contract',
      myRole: 'my_role',
      partyList: 'party_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      blockchainNum: 'string',
      myNormalNodeId: 'string',
      governanceContract: 'string',
      myRole: 'string',
      partyList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 工作流动态配置
export class DynamicFlowConfig extends $tea.Model {
  //  
  networkId: string;
  //  
  spaceId: string;
  //  
  dsl: DynamicDsl;
  static names(): { [key: string]: string } {
    return {
      networkId: 'network_id',
      spaceId: 'space_id',
      dsl: 'dsl',
    };
  }

  static types(): { [key: string]: any } {
    return {
      networkId: 'string',
      spaceId: 'string',
      dsl: DynamicDsl,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 工作流静态配置
export class StaticFlowConfig extends $tea.Model {
  //  
  networkId: string;
  //  
  dsl: StaticDsl;
  static names(): { [key: string]: string } {
    return {
      networkId: 'network_id',
      dsl: 'dsl',
    };
  }

  static types(): { [key: string]: any } {
    return {
      networkId: 'string',
      dsl: StaticDsl,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 初始化客户端配置，提供到FAIR节点的连接配置
export class FairComputeClientConfig extends $tea.Model {
  // 服务host
  host: string;
  // 服务端口
  port: number;
  // TLS连接配置【暂不支持】
  sslCertChain?: string;
  // TLS连接配置【暂不支持】
  sslPrivateKey?: string;
  // TLS连接配置【暂不支持】
  sslTrustCertCollection?: string;
  // TLS连接配置【暂不支持】
  sslAuthority?: string;
  static names(): { [key: string]: string } {
    return {
      host: 'host',
      port: 'port',
      sslCertChain: 'ssl_cert_chain',
      sslPrivateKey: 'ssl_private_key',
      sslTrustCertCollection: 'ssl_trust_cert_collection',
      sslAuthority: 'ssl_authority',
    };
  }

  static types(): { [key: string]: any } {
    return {
      host: 'string',
      port: 'number',
      sslCertChain: 'string',
      sslPrivateKey: 'string',
      sslTrustCertCollection: 'string',
      sslAuthority: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 新建协作空间入参
export class CreateSpaceInput extends $tea.Model {
  //  
  networkId: string;
  //  
  spaceId: string;
  static names(): { [key: string]: string } {
    return {
      networkId: 'network_id',
      spaceId: 'space_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      networkId: 'string',
      spaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 普通节点身份信息，作为加入协作网络提供的材料
export class NormalNodeIdentityInfo extends $tea.Model {
  //  
  nodeId: string;
  //  
  identityInfo: string;
  static names(): { [key: string]: string } {
    return {
      nodeId: 'node_id',
      identityInfo: 'identity_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      nodeId: 'string',
      identityInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 参与方信息
export class PartyInfo extends $tea.Model {
  //  
  partyId: string;
  //  
  desc: string;
  //  
  privateKey: string;
  //  
  privateKeyPasswd: string;
  //  
  recoverKey: string;
  //  
  recoveryKeyPasswd: string;
  static names(): { [key: string]: string } {
    return {
      partyId: 'party_id',
      desc: 'desc',
      privateKey: 'private_key',
      privateKeyPasswd: 'private_key_passwd',
      recoverKey: 'recover_key',
      recoveryKeyPasswd: 'recovery_key_passwd',
    };
  }

  static types(): { [key: string]: any } {
    return {
      partyId: 'string',
      desc: 'string',
      privateKey: 'string',
      privateKeyPasswd: 'string',
      recoverKey: 'string',
      recoveryKeyPasswd: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 工作流实例的定位符
export class FlowInstanceLocator extends $tea.Model {
  //  
  networkId: string;
  //  
  spaceId: string;
  //  
  flowId: string;
  //  
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      networkId: 'network_id',
      spaceId: 'space_id',
      flowId: 'flow_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      networkId: 'string',
      spaceId: 'string',
      flowId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 测试结构体
export class TestStruct extends $tea.Model {
  // 测试名称
  name: string;
  // 消息体
  msg: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      msg: 'msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      msg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 工作流执行状态
export class FlowInstanceStatus extends $tea.Model {
  //  
  spaceId: string;
  //  
  flowId: string;
  //  
  instanceId: string;
  //  
  consentOn: boolean;
  //   
  autoStart: boolean;
  //  
  staticParameters: string;
  //  
  dynamicParameters: string;
  //  
  totalComponents: number;
  //  
  completedComponents: number;
  //  
  errorCode: string;
  //  
  errorMessage: string;
  //  
  status: number;
  static names(): { [key: string]: string } {
    return {
      spaceId: 'space_id',
      flowId: 'flow_id',
      instanceId: 'instance_id',
      consentOn: 'consent_on',
      autoStart: 'auto_start',
      staticParameters: 'static_parameters',
      dynamicParameters: 'dynamic_parameters',
      totalComponents: 'total_components',
      completedComponents: 'completed_components',
      errorCode: 'error_code',
      errorMessage: 'error_message',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      spaceId: 'string',
      flowId: 'string',
      instanceId: 'string',
      consentOn: 'boolean',
      autoStart: 'boolean',
      staticParameters: 'string',
      dynamicParameters: 'string',
      totalComponents: 'number',
      completedComponents: 'number',
      errorCode: 'string',
      errorMessage: 'string',
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// getNetworkStatus接口输出
export class NetworkStatusInfo extends $tea.Model {
  // 协作网络状态枚举类型
  networkStatus: string;
  static names(): { [key: string]: string } {
    return {
      networkStatus: 'network_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      networkStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 协作网络治理节点批准普通节点加入后返回给普通节点的信息
export class NetworkEntranceInfo extends $tea.Model {
  //  
  networkId: string;
  //  
  entranceInfo: string;
  static names(): { [key: string]: string } {
    return {
      networkId: 'network_id',
      entranceInfo: 'entrance_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      networkId: 'string',
      entranceInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 描述一个cube节点
export class CubeNode extends $tea.Model {
  // 无
  domain: string;
  //  
  endpoints: NodeEndpoint[];
  //  
  nodeId: string;
  //  
  nodeIdHash: string;
  //  
  nodePublicKey: string;
  //  
  isConnected: boolean;
  //  
  type: number;
  static names(): { [key: string]: string } {
    return {
      domain: 'domain',
      endpoints: 'endpoints',
      nodeId: 'node_id',
      nodeIdHash: 'node_id_hash',
      nodePublicKey: 'node_public_key',
      isConnected: 'is_connected',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      domain: 'string',
      endpoints: { 'type': 'array', 'itemType': NodeEndpoint },
      nodeId: 'string',
      nodeIdHash: 'string',
      nodePublicKey: 'string',
      isConnected: 'boolean',
      type: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 如果非治理模式启动，返回错误码
export class GetGovernanceModuleNetworkIdOutput extends $tea.Model {
  // networkID
  networkId: string;
  static names(): { [key: string]: string } {
    return {
      networkId: 'network_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      networkId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 键值对
export class XNameValuePair extends $tea.Model {
  // 键名
  name: string;
  // 键值
  value: string;
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

export class StartTestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // TestApi入参
  data: TestStruct;
  // 额外字段
  extra?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      data: 'data',
      extra: 'extra',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      data: TestStruct,
      extra: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartTestResponse extends $tea.Model {
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

export class InitClientConfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  //  
  config: FairComputeClientConfig;
  //  
  extra?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      config: 'config',
      extra: 'extra',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      config: FairComputeClientConfig,
      extra: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitClientConfigResponse extends $tea.Model {
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

export class StartClientRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  //  
  extra?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      extra: 'extra',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      extra: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartClientResponse extends $tea.Model {
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

export class GetGovernancemoduleNetworkidRequest extends $tea.Model {
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

export class GetGovernancemoduleNetworkidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  networkId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      networkId: 'network_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      networkId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetNetworkStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  //  
  networkId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      networkId: 'network_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      networkId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetNetworkStatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //   
  networkStatusInfo?: NetworkStatusInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      networkStatusInfo: 'network_status_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      networkStatusInfo: NetworkStatusInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetMycubenodeInfoRequest extends $tea.Model {
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

export class GetMycubenodeInfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  cubeNode?: CubeNode;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      cubeNode: 'cube_node',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      cubeNode: CubeNode,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddTrustedcubenodeInfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  //  
  cubeNode: CubeNode;
  //  
  extra: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cubeNode: 'cube_node',
      extra: 'extra',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cubeNode: CubeNode,
      extra: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddTrustedcubenodeInfoResponse extends $tea.Model {
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

export class RegisterNormalNodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  //  
  info: NormalNodeIdentityInfo;
  //  
  extra?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      info: 'info',
      extra: 'extra',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      info: NormalNodeIdentityInfo,
      extra: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterNormalNodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  networkEntranceInfo?: NetworkEntranceInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      networkEntranceInfo: 'network_entrance_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      networkEntranceInfo: NetworkEntranceInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSpaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  //  
  networkId: string;
  //  
  spaceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      networkId: 'network_id',
      spaceId: 'space_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      networkId: 'string',
      spaceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSpaceResponse extends $tea.Model {
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

export class AddPartySpaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  //  
  networkId: string;
  //  
  spaceId: string;
  //  
  nodeId: string;
  //  
  partyId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      networkId: 'network_id',
      spaceId: 'space_id',
      nodeId: 'node_id',
      partyId: 'party_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      networkId: 'string',
      spaceId: 'string',
      nodeId: 'string',
      partyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddPartySpaceResponse extends $tea.Model {
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

export class GetNetworkSnapshotRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  //  
  networkId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      networkId: 'network_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      networkId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetNetworkSnapshotResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  cnet?: Cnet;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      cnet: 'cnet',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      cnet: Cnet,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StopClientRequest extends $tea.Model {
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

export class StopClientResponse extends $tea.Model {
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

export class GetNormalmoduleNodeidRequest extends $tea.Model {
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

export class GetNormalmoduleNodeidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  nodeId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      nodeId: 'node_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      nodeId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddPartyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  //  
  info: PartyInfo;
  //  
  extra?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      info: 'info',
      extra: 'extra',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      info: PartyInfo,
      extra: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddPartyResponse extends $tea.Model {
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

export class GetNormalnodeIdentityinfoRequest extends $tea.Model {
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

export class GetNormalnodeIdentityinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  normalNodeIdentityInfo?: NormalNodeIdentityInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      normalNodeIdentityInfo: 'normal_node_identity_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      normalNodeIdentityInfo: NormalNodeIdentityInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddNetworkNormalnodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  //  
  info: NetworkEntranceInfo;
  //  
  extra?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      info: 'info',
      extra: 'extra',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      info: NetworkEntranceInfo,
      extra: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddNetworkNormalnodeResponse extends $tea.Model {
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

export class GetAllcubenodeInfoRequest extends $tea.Model {
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

export class GetAllcubenodeInfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  allCubeNodes?: CubeNode[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      allCubeNodes: 'all_cube_nodes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      allCubeNodes: { 'type': 'array', 'itemType': CubeNode },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyPartyNetworkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  //  
  networkId: string;
  //  
  partyId: string;
  //  
  accountName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      networkId: 'network_id',
      partyId: 'party_id',
      accountName: 'account_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      networkId: 'string',
      partyId: 'string',
      accountName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyPartyNetworkResponse extends $tea.Model {
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

export class CreateFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  //  
  partyId: string;
  //  
  config: StaticFlowConfig;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      partyId: 'party_id',
      config: 'config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      partyId: 'string',
      config: StaticFlowConfig,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFlowResponse extends $tea.Model {
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

export class RunFlowInstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  //  
  partyId: string;
  //  
  config: DynamicFlowConfig;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      partyId: 'party_id',
      config: 'config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      partyId: 'string',
      config: DynamicFlowConfig,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RunFlowInstanceResponse extends $tea.Model {
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

export class StopFlowinstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  //  
  networkId: string;
  //  
  spaceId: string;
  //  
  partyId: string;
  //  
  flowId: string;
  //  
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      networkId: 'network_id',
      spaceId: 'space_id',
      partyId: 'party_id',
      flowId: 'flow_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      networkId: 'string',
      spaceId: 'string',
      partyId: 'string',
      flowId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StopFlowinstanceResponse extends $tea.Model {
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

export class QueryFlowinstanceStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  //  
  config: FlowInstanceLocator;
  //  
  extra?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      config: 'config',
      extra: 'extra',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      config: FlowInstanceLocator,
      extra: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFlowinstanceStatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  status?: FlowInstanceStatus;
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
      status: FlowInstanceStatus,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // file_id
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  // 文件名
  fileName: string;
  // 扩展字段
  extra?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      fileName: 'file_name',
      extra: 'extra',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      fileName: 'string',
      extra: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadFileResponse extends $tea.Model {
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

export class DownloadFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // file_id
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  // 文件名
  fileName: string;
  //  
  extra?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      fileName: 'file_name',
      extra: 'extra',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      fileName: 'string',
      extra: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DownloadFileResponse extends $tea.Model {
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

export class GetNodeListRequest extends $tea.Model {
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

export class GetNodeListResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // nodeId列表
  nodeList?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      nodeList: 'node_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      nodeList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterPartyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 参与方的partyId
  partyId: string;
  // 描述party
  partyDesc: string;
  // 节点的nodeId
  nodeId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      partyId: 'party_id',
      partyDesc: 'party_desc',
      nodeId: 'node_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      partyId: 'string',
      partyDesc: 'string',
      nodeId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterPartyResponse extends $tea.Model {
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

export class QueryPartyRegisterstatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 节点的nodeId
  nodeId: string;
  // 用户的partyId
  partyId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      nodeId: 'node_id',
      partyId: 'party_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      nodeId: 'string',
      partyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPartyRegisterstatusResponse extends $tea.Model {
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

export class CreateAntcloudGatewayxFileUploadRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 上传文件作用的openapi method
  apiCode: string;
  // 文件标签，多个标签;分割
  fileLabel?: string;
  // 自定义的文件元数据
  fileMetadata?: string;
  // 文件名，不传则随机生成文件名
  fileName?: string;
  // 文件的多媒体类型
  mimeType?: string;
  // 产品方的api归属集群，即productInstanceId
  apiCluster?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      apiCode: 'api_code',
      fileLabel: 'file_label',
      fileMetadata: 'file_metadata',
      fileName: 'file_name',
      mimeType: 'mime_type',
      apiCluster: 'api_cluster',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      apiCode: 'string',
      fileLabel: 'string',
      fileMetadata: 'string',
      fileName: 'string',
      mimeType: 'string',
      apiCluster: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntcloudGatewayxFileUploadResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 上传有效期
  expiredTime?: string;
  // 32位文件唯一id
  fileId?: string;
  // 放入http请求头里
  uploadHeaders?: XNameValuePair[];
  // 文件上传地址
  uploadUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      expiredTime: 'expired_time',
      fileId: 'file_id',
      uploadHeaders: 'upload_headers',
      uploadUrl: 'upload_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      expiredTime: 'string',
      fileId: 'string',
      uploadHeaders: { 'type': 'array', 'itemType': XNameValuePair },
      uploadUrl: 'string',
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
          sdk_version: "1.0.4",
          _prod_code: "FAIROPENNET",
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
   * Description: 测试用
   * Summary: 测试用
   */
  async startTest(request: StartTestRequest): Promise<StartTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startTestEx(request, headers, runtime);
  }

  /**
   * Description: 测试用
   * Summary: 测试用
   */
  async startTestEx(request: StartTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartTestResponse> {
    Util.validateModel(request);
    return $tea.cast<StartTestResponse>(await this.doRequest("1.0", "antchain.fairopennet.test.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartTestResponse({}));
  }

  /**
   * Description:  
   * Summary: 初始化客户端配置
   */
  async initClientConfig(request: InitClientConfigRequest): Promise<InitClientConfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initClientConfigEx(request, headers, runtime);
  }

  /**
   * Description:  
   * Summary: 初始化客户端配置
   */
  async initClientConfigEx(request: InitClientConfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitClientConfigResponse> {
    Util.validateModel(request);
    return $tea.cast<InitClientConfigResponse>(await this.doRequest("1.0", "antchain.fairopennet.client.config.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitClientConfigResponse({}));
  }

  /**
   * Description: 启动客户端，测试连接到FAIR节点
   * Summary: 启动客户端
   */
  async startClient(request: StartClientRequest): Promise<StartClientResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startClientEx(request, headers, runtime);
  }

  /**
   * Description: 启动客户端，测试连接到FAIR节点
   * Summary: 启动客户端
   */
  async startClientEx(request: StartClientRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartClientResponse> {
    Util.validateModel(request);
    return $tea.cast<StartClientResponse>(await this.doRequest("1.0", "antchain.fairopennet.client.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartClientResponse({}));
  }

  /**
   * Description: 获取治理模块静态配置自启动协作网络的ID
   * Summary: 获取治理模块静态配置自启动协作网络的ID
   */
  async getGovernancemoduleNetworkid(request: GetGovernancemoduleNetworkidRequest): Promise<GetGovernancemoduleNetworkidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getGovernancemoduleNetworkidEx(request, headers, runtime);
  }

  /**
   * Description: 获取治理模块静态配置自启动协作网络的ID
   * Summary: 获取治理模块静态配置自启动协作网络的ID
   */
  async getGovernancemoduleNetworkidEx(request: GetGovernancemoduleNetworkidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetGovernancemoduleNetworkidResponse> {
    Util.validateModel(request);
    return $tea.cast<GetGovernancemoduleNetworkidResponse>(await this.doRequest("1.0", "antchain.fairopennet.governancemodule.networkid.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetGovernancemoduleNetworkidResponse({}));
  }

  /**
   * Description: 获取协作网络状态
   * Summary: 获取协作网络状态
   */
  async getNetworkStatus(request: GetNetworkStatusRequest): Promise<GetNetworkStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getNetworkStatusEx(request, headers, runtime);
  }

  /**
   * Description: 获取协作网络状态
   * Summary: 获取协作网络状态
   */
  async getNetworkStatusEx(request: GetNetworkStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetNetworkStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<GetNetworkStatusResponse>(await this.doRequest("1.0", "antchain.fairopennet.network.status.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetNetworkStatusResponse({}));
  }

  /**
   * Description: 获取cube节点信息
   * Summary: 获取cube节点信息
   */
  async getMycubenodeInfo(request: GetMycubenodeInfoRequest): Promise<GetMycubenodeInfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getMycubenodeInfoEx(request, headers, runtime);
  }

  /**
   * Description: 获取cube节点信息
   * Summary: 获取cube节点信息
   */
  async getMycubenodeInfoEx(request: GetMycubenodeInfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetMycubenodeInfoResponse> {
    Util.validateModel(request);
    return $tea.cast<GetMycubenodeInfoResponse>(await this.doRequest("1.0", "antchain.fairopennet.mycubenode.info.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetMycubenodeInfoResponse({}));
  }

  /**
   * Description: 手动添加cube节点
   * Summary: 手动添加cube节点
   */
  async addTrustedcubenodeInfo(request: AddTrustedcubenodeInfoRequest): Promise<AddTrustedcubenodeInfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addTrustedcubenodeInfoEx(request, headers, runtime);
  }

  /**
   * Description: 手动添加cube节点
   * Summary: 手动添加cube节点
   */
  async addTrustedcubenodeInfoEx(request: AddTrustedcubenodeInfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddTrustedcubenodeInfoResponse> {
    Util.validateModel(request);
    return $tea.cast<AddTrustedcubenodeInfoResponse>(await this.doRequest("1.0", "antchain.fairopennet.trustedcubenode.info.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddTrustedcubenodeInfoResponse({}));
  }

  /**
   * Description: 将普通节点加入协作网络。治理节点预先批准普通节点的身份信息加入到网络，然后返回EntranceInfo给到普通节点，普通节点根据EntranceInfo连入网络。对应sdk enrollNormalNode接口
   * Summary: 普通节点加入协作网络
   */
  async registerNormalNode(request: RegisterNormalNodeRequest): Promise<RegisterNormalNodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.registerNormalNodeEx(request, headers, runtime);
  }

  /**
   * Description: 将普通节点加入协作网络。治理节点预先批准普通节点的身份信息加入到网络，然后返回EntranceInfo给到普通节点，普通节点根据EntranceInfo连入网络。对应sdk enrollNormalNode接口
   * Summary: 普通节点加入协作网络
   */
  async registerNormalNodeEx(request: RegisterNormalNodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RegisterNormalNodeResponse> {
    Util.validateModel(request);
    return $tea.cast<RegisterNormalNodeResponse>(await this.doRequest("1.0", "antchain.fairopennet.normal.node.register", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RegisterNormalNodeResponse({}));
  }

  /**
   * Description: 后续由各普通节点将其所有的参与方加入到协作网络，然后由治理节点管理哪些参与方可以加入协作空间
   * Summary: 新建协作空间
   */
  async createSpace(request: CreateSpaceRequest): Promise<CreateSpaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSpaceEx(request, headers, runtime);
  }

  /**
   * Description: 后续由各普通节点将其所有的参与方加入到协作网络，然后由治理节点管理哪些参与方可以加入协作空间
   * Summary: 新建协作空间
   */
  async createSpaceEx(request: CreateSpaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSpaceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSpaceResponse>(await this.doRequest("1.0", "antchain.fairopennet.space.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSpaceResponse({}));
  }

  /**
   * Description: 添加协作参与方到协作空间
   * Summary: 添加协作参与方到协作空间
   */
  async addPartySpace(request: AddPartySpaceRequest): Promise<AddPartySpaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addPartySpaceEx(request, headers, runtime);
  }

  /**
   * Description: 添加协作参与方到协作空间
   * Summary: 添加协作参与方到协作空间
   */
  async addPartySpaceEx(request: AddPartySpaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddPartySpaceResponse> {
    Util.validateModel(request);
    return $tea.cast<AddPartySpaceResponse>(await this.doRequest("1.0", "antchain.fairopennet.party.space.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddPartySpaceResponse({}));
  }

  /**
   * Description: 获取协作网络快照，包含整个协作网络最新的全部信息
   * Summary: 获取协作网络快照
   */
  async getNetworkSnapshot(request: GetNetworkSnapshotRequest): Promise<GetNetworkSnapshotResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getNetworkSnapshotEx(request, headers, runtime);
  }

  /**
   * Description: 获取协作网络快照，包含整个协作网络最新的全部信息
   * Summary: 获取协作网络快照
   */
  async getNetworkSnapshotEx(request: GetNetworkSnapshotRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetNetworkSnapshotResponse> {
    Util.validateModel(request);
    return $tea.cast<GetNetworkSnapshotResponse>(await this.doRequest("1.0", "antchain.fairopennet.network.snapshot.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetNetworkSnapshotResponse({}));
  }

  /**
   * Description: shutdown client
   * Summary: shutdown client
   */
  async stopClient(request: StopClientRequest): Promise<StopClientResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.stopClientEx(request, headers, runtime);
  }

  /**
   * Description: shutdown client
   * Summary: shutdown client
   */
  async stopClientEx(request: StopClientRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StopClientResponse> {
    Util.validateModel(request);
    return $tea.cast<StopClientResponse>(await this.doRequest("1.0", "antchain.fairopennet.client.stop", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StopClientResponse({}));
  }

  /**
   * Description: 获取普通节点自身的节点ID
   * Summary: 获取普通节点自身的节点ID
   */
  async getNormalmoduleNodeid(request: GetNormalmoduleNodeidRequest): Promise<GetNormalmoduleNodeidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getNormalmoduleNodeidEx(request, headers, runtime);
  }

  /**
   * Description: 获取普通节点自身的节点ID
   * Summary: 获取普通节点自身的节点ID
   */
  async getNormalmoduleNodeidEx(request: GetNormalmoduleNodeidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetNormalmoduleNodeidResponse> {
    Util.validateModel(request);
    return $tea.cast<GetNormalmoduleNodeidResponse>(await this.doRequest("1.0", "antchain.fairopennet.normalmodule.nodeid.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetNormalmoduleNodeidResponse({}));
  }

  /**
   * Description: 添加协作参与方信息，协作参与方身份为独立身份，通用于未来加入的不同协作网络
   * Summary: 添加协作参与方信息
   */
  async addParty(request: AddPartyRequest): Promise<AddPartyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addPartyEx(request, headers, runtime);
  }

  /**
   * Description: 添加协作参与方信息，协作参与方身份为独立身份，通用于未来加入的不同协作网络
   * Summary: 添加协作参与方信息
   */
  async addPartyEx(request: AddPartyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddPartyResponse> {
    Util.validateModel(request);
    return $tea.cast<AddPartyResponse>(await this.doRequest("1.0", "antchain.fairopennet.party.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddPartyResponse({}));
  }

  /**
   * Description: 获取普通节点身份信息
   * Summary: 获取普通节点身份信息
   */
  async getNormalnodeIdentityinfo(request: GetNormalnodeIdentityinfoRequest): Promise<GetNormalnodeIdentityinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getNormalnodeIdentityinfoEx(request, headers, runtime);
  }

  /**
   * Description: 获取普通节点身份信息
   * Summary: 获取普通节点身份信息
   */
  async getNormalnodeIdentityinfoEx(request: GetNormalnodeIdentityinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetNormalnodeIdentityinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<GetNormalnodeIdentityinfoResponse>(await this.doRequest("1.0", "antchain.fairopennet.normalnode.identityinfo.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetNormalnodeIdentityinfoResponse({}));
  }

  /**
   * Description: 治理节点批准加入网络后，传回网络进入信息，由普通节点加入网络
   * Summary: 普通节点加入网络
   */
  async addNetworkNormalnode(request: AddNetworkNormalnodeRequest): Promise<AddNetworkNormalnodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addNetworkNormalnodeEx(request, headers, runtime);
  }

  /**
   * Description: 治理节点批准加入网络后，传回网络进入信息，由普通节点加入网络
   * Summary: 普通节点加入网络
   */
  async addNetworkNormalnodeEx(request: AddNetworkNormalnodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddNetworkNormalnodeResponse> {
    Util.validateModel(request);
    return $tea.cast<AddNetworkNormalnodeResponse>(await this.doRequest("1.0", "antchain.fairopennet.network.normalnode.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddNetworkNormalnodeResponse({}));
  }

  /**
   * Description: 获取所有cube节点信息
   * Summary: 获取所有cube节点信息
   */
  async getAllcubenodeInfo(request: GetAllcubenodeInfoRequest): Promise<GetAllcubenodeInfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAllcubenodeInfoEx(request, headers, runtime);
  }

  /**
   * Description: 获取所有cube节点信息
   * Summary: 获取所有cube节点信息
   */
  async getAllcubenodeInfoEx(request: GetAllcubenodeInfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAllcubenodeInfoResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAllcubenodeInfoResponse>(await this.doRequest("1.0", "antchain.fairopennet.allcubenode.info.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAllcubenodeInfoResponse({}));
  }

  /**
   * Description: 添加协作参与方到一个区块链协作网络
   * Summary: 添加协作参与方到一个区块链协作网络
   */
  async applyPartyNetwork(request: ApplyPartyNetworkRequest): Promise<ApplyPartyNetworkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyPartyNetworkEx(request, headers, runtime);
  }

  /**
   * Description: 添加协作参与方到一个区块链协作网络
   * Summary: 添加协作参与方到一个区块链协作网络
   */
  async applyPartyNetworkEx(request: ApplyPartyNetworkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyPartyNetworkResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyPartyNetworkResponse>(await this.doRequest("1.0", "antchain.fairopennet.party.network.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyPartyNetworkResponse({}));
  }

  /**
   * Description: 创建一个工作流
   * Summary: 创建一个工作流
   */
  async createFlow(request: CreateFlowRequest): Promise<CreateFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createFlowEx(request, headers, runtime);
  }

  /**
   * Description: 创建一个工作流
   * Summary: 创建一个工作流
   */
  async createFlowEx(request: CreateFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateFlowResponse>(await this.doRequest("1.0", "antchain.fairopennet.flow.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateFlowResponse({}));
  }

  /**
   * Description: 运行工作流实例，提供动态配置
   * Summary: 运行工作流实例，提供动态配置
   */
  async runFlowInstance(request: RunFlowInstanceRequest): Promise<RunFlowInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.runFlowInstanceEx(request, headers, runtime);
  }

  /**
   * Description: 运行工作流实例，提供动态配置
   * Summary: 运行工作流实例，提供动态配置
   */
  async runFlowInstanceEx(request: RunFlowInstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RunFlowInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<RunFlowInstanceResponse>(await this.doRequest("1.0", "antchain.fairopennet.flow.instance.run", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RunFlowInstanceResponse({}));
  }

  /**
   * Description: 停止运行中的工作流实例
   * Summary: 停止运行中的工作流实例
   */
  async stopFlowinstance(request: StopFlowinstanceRequest): Promise<StopFlowinstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.stopFlowinstanceEx(request, headers, runtime);
  }

  /**
   * Description: 停止运行中的工作流实例
   * Summary: 停止运行中的工作流实例
   */
  async stopFlowinstanceEx(request: StopFlowinstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StopFlowinstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<StopFlowinstanceResponse>(await this.doRequest("1.0", "antchain.fairopennet.flowinstance.stop", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StopFlowinstanceResponse({}));
  }

  /**
   * Description: 查询工作流实例状态
   * Summary: 查询工作流实例状态
   */
  async queryFlowinstanceStatus(request: QueryFlowinstanceStatusRequest): Promise<QueryFlowinstanceStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFlowinstanceStatusEx(request, headers, runtime);
  }

  /**
   * Description: 查询工作流实例状态
   * Summary: 查询工作流实例状态
   */
  async queryFlowinstanceStatusEx(request: QueryFlowinstanceStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFlowinstanceStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFlowinstanceStatusResponse>(await this.doRequest("1.0", "antchain.fairopennet.flowinstance.status.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFlowinstanceStatusResponse({}));
  }

  /**
   * Description: 上传文件
   * Summary: 上传文件
   */
  async uploadFile(request: UploadFileRequest): Promise<UploadFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadFileEx(request, headers, runtime);
  }

  /**
   * Description: 上传文件
   * Summary: 上传文件
   */
  async uploadFileEx(request: UploadFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadFileResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.fairopennet.file.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadFileResponse = new UploadFileResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadFileResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
    }

    Util.validateModel(request);
    return $tea.cast<UploadFileResponse>(await this.doRequest("1.0", "antchain.fairopennet.file.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadFileResponse({}));
  }

  /**
   * Description: 下载文件
   * Summary: 下载文件
   */
  async downloadFile(request: DownloadFileRequest): Promise<DownloadFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.downloadFileEx(request, headers, runtime);
  }

  /**
   * Description: 下载文件
   * Summary: 下载文件
   */
  async downloadFileEx(request: DownloadFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DownloadFileResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.fairopennet.file.download",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let downloadFileResponse = new DownloadFileResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return downloadFileResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
    }

    Util.validateModel(request);
    return $tea.cast<DownloadFileResponse>(await this.doRequest("1.0", "antchain.fairopennet.file.download", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DownloadFileResponse({}));
  }

  /**
   * Description: 查询可用的fair节点nodeId
   * Summary: 查询fair node列表
   */
  async getNodeList(request: GetNodeListRequest): Promise<GetNodeListResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getNodeListEx(request, headers, runtime);
  }

  /**
   * Description: 查询可用的fair节点nodeId
   * Summary: 查询fair node列表
   */
  async getNodeListEx(request: GetNodeListRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetNodeListResponse> {
    Util.validateModel(request);
    return $tea.cast<GetNodeListResponse>(await this.doRequest("1.0", "antchain.fairopennet.node.list.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetNodeListResponse({}));
  }

  /**
   * Description: 注册新用户
   * Summary: 注册新用户
   */
  async registerParty(request: RegisterPartyRequest): Promise<RegisterPartyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.registerPartyEx(request, headers, runtime);
  }

  /**
   * Description: 注册新用户
   * Summary: 注册新用户
   */
  async registerPartyEx(request: RegisterPartyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RegisterPartyResponse> {
    Util.validateModel(request);
    return $tea.cast<RegisterPartyResponse>(await this.doRequest("1.0", "antchain.fairopennet.party.register", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RegisterPartyResponse({}));
  }

  /**
   * Description: 查询用户是否注册成功
   * Summary: 查询用户注册进度
   */
  async queryPartyRegisterstatus(request: QueryPartyRegisterstatusRequest): Promise<QueryPartyRegisterstatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPartyRegisterstatusEx(request, headers, runtime);
  }

  /**
   * Description: 查询用户是否注册成功
   * Summary: 查询用户注册进度
   */
  async queryPartyRegisterstatusEx(request: QueryPartyRegisterstatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPartyRegisterstatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPartyRegisterstatusResponse>(await this.doRequest("1.0", "antchain.fairopennet.party.registerstatus.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPartyRegisterstatusResponse({}));
  }

  /**
   * Description: 创建HTTP PUT提交的文件上传
   * Summary: 文件上传创建
   */
  async createAntcloudGatewayxFileUpload(request: CreateAntcloudGatewayxFileUploadRequest): Promise<CreateAntcloudGatewayxFileUploadResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAntcloudGatewayxFileUploadEx(request, headers, runtime);
  }

  /**
   * Description: 创建HTTP PUT提交的文件上传
   * Summary: 文件上传创建
   */
  async createAntcloudGatewayxFileUploadEx(request: CreateAntcloudGatewayxFileUploadRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAntcloudGatewayxFileUploadResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAntcloudGatewayxFileUploadResponse>(await this.doRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAntcloudGatewayxFileUploadResponse({}));
  }

}
