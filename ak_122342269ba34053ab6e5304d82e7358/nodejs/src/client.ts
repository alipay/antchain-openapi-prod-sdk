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

// 可访问数据关系信息
export class AccessChainInfo extends $tea.Model {
  // 授权访问链关系ID
  aclId: string;
  // 详细描述
  description?: string;
  // 关系创建时间
  gmtCreate: string;
  // 被授权的链的链域名
  grantDomain: string;
  // 授权链链域名
  ownerDomain: string;
  // 授权可以访问的数据类型
  resourceType: string;
  static names(): { [key: string]: string } {
    return {
      aclId: 'acl_id',
      description: 'description',
      gmtCreate: 'gmt_create',
      grantDomain: 'grant_domain',
      ownerDomain: 'owner_domain',
      resourceType: 'resource_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      aclId: 'string',
      description: 'string',
      gmtCreate: 'string',
      grantDomain: 'string',
      ownerDomain: 'string',
      resourceType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 作为返回值的MyChain信息
export class MyChainInfo extends $tea.Model {
  // 区块链id
  blockchainId?: string;
  // 详细描述
  description?: string;
  // 链域名
  domain?: string;
  // 创建日期
  gmtCreate?: string;
  // 注册状态INIT, INIT_FAILED, REGISTRING, REGISTERED, REGISTRATION_FAILED
  regStatus?: string;
  // 链类型：MYCHAIN_010, FABRIC_14
  // 
  type?: string;
  static names(): { [key: string]: string } {
    return {
      blockchainId: 'blockchain_id',
      description: 'description',
      domain: 'domain',
      gmtCreate: 'gmt_create',
      regStatus: 'reg_status',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      blockchainId: 'string',
      description: 'string',
      domain: 'string',
      gmtCreate: 'string',
      regStatus: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 域名证书信息
export class DomainCert extends $tea.Model {
  // 链域名
  // 
  domain?: string;
  // 签发者公钥
  issuerPublicKey?: string;
  // 签发者签名
  issuerSignature?: string;
  // 接受者公钥
  subjectPublicKey?: string;
  static names(): { [key: string]: string } {
    return {
      domain: 'domain',
      issuerPublicKey: 'issuer_public_key',
      issuerSignature: 'issuer_signature',
      subjectPublicKey: 'subject_public_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      domain: 'string',
      issuerPublicKey: 'string',
      issuerSignature: 'string',
      subjectPublicKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 跨链信息结构体
export class CrossChainInfo extends $tea.Model {
  // 授权映射关系id
  aclId: string;
  // 详细描述
  description?: string;
  // 授权关系创建时间
  gmtCreate: string;
  // 授权链的链域名
  grantDomain: string;
  // 授权合约在授权链上地址
  grantIdentity: string;
  // 自有链链域名
  ownerDomain: string;
  // 自有合约在链上地址
  ownerIdentity: string;
  static names(): { [key: string]: string } {
    return {
      aclId: 'acl_id',
      description: 'description',
      gmtCreate: 'gmt_create',
      grantDomain: 'grant_domain',
      grantIdentity: 'grant_identity',
      ownerDomain: 'owner_domain',
      ownerIdentity: 'owner_identity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      aclId: 'string',
      description: 'string',
      gmtCreate: 'string',
      grantDomain: 'string',
      grantIdentity: 'string',
      ownerDomain: 'string',
      ownerIdentity: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Odats中注册的区块链信息
export class OdatsRegisteredBlockChainInfo extends $tea.Model {
  // 区块链id
  blockchainId: string;
  // 详细描述
  description?: string;
  // 链域名
  domain: string;
  // 注册时间
  gmtCreate: string;
  // 链注册状态
  // INIT, INIT_FAILED, REGISTRING, REGISTERED, REGISTRATION_FAILED
  regStatus: string;
  // 链类型
  type: string;
  static names(): { [key: string]: string } {
    return {
      blockchainId: 'blockchain_id',
      description: 'description',
      domain: 'domain',
      gmtCreate: 'gmt_create',
      regStatus: 'reg_status',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      blockchainId: 'string',
      description: 'string',
      domain: 'string',
      gmtCreate: 'string',
      regStatus: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 区块链基本信息
export class BlockchainBasicInfo extends $tea.Model {
  // 链id
  blockchainId?: string;
  // 描述
  description?: string;
  // 链域名
  domain?: string;
  // 创建时间，13位时间戳
  gmtCreate?: string;
  // 根据type会返回不通的json格式，表示不同类型的链配置； mychain: { "bizid": "", "tlsCert": "", "tlsCaCert": "", "account": "", "anchoredBlockHeight": 19876, "anchoredBlockHash": "" } fabric: { "channel": "", "userMspId": "", "userCert": "" }
  info?: string;
  // 注册状态
  // 
  regStatus?: string;
  // 链类型
  // 
  type?: string;
  static names(): { [key: string]: string } {
    return {
      blockchainId: 'blockchain_id',
      description: 'description',
      domain: 'domain',
      gmtCreate: 'gmt_create',
      info: 'info',
      regStatus: 'reg_status',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      blockchainId: 'string',
      description: 'string',
      domain: 'string',
      gmtCreate: 'string',
      info: 'string',
      regStatus: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 返回的解析后的yaml信息
export class ConfigYamlInfo extends $tea.Model {
  // 通道列表
  channelNameList?: string[];
  // 验证节点名称列表
  validatorPeerNameList?: string[];
  static names(): { [key: string]: string } {
    return {
      channelNameList: 'channel_name_list',
      validatorPeerNameList: 'validator_peer_name_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      channelNameList: { 'type': 'array', 'itemType': 'string' },
      validatorPeerNameList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// udns cert 相关属性信息
export class UdnsCert extends $tea.Model {
  // 锚定块hash
  anchoredBlockHash?: string;
  // 锚定块高度。
  anchoredBlockHeight?: number;
  // 区块链id
  blockchainId?: string;
  // fabric 链码
  chaincode?: string;
  // 通道名。
  channel?: string;
  // {"anchoredBlockcHeight": 12345, "anchoredBlockHash": "abcefgh", "poaCertPublicKeyHashList": ["abcdefg","abcdefg"]}
  detailInfo?: string;
  // 链域名
  domain?: string;
  // 证书公钥列表	
  // 
  poaCertPublicKeyHashList?: string[];
  // 目标公钥
  subjectPublicKey?: string;
  // 目标svn
  svn?: number;
  // 区块链类型：MYCHAIN_010, FABRIC_14	
  // 
  type?: string;
  // base64编码后的udns
  udnsBase64?: string;
  // 验证者证书列表
  validatorCertList?: number;
  // 版本号
  version?: string;
  static names(): { [key: string]: string } {
    return {
      anchoredBlockHash: 'anchored_block_hash',
      anchoredBlockHeight: 'anchored_block_height',
      blockchainId: 'blockchain_id',
      chaincode: 'chaincode',
      channel: 'channel',
      detailInfo: 'detail_info',
      domain: 'domain',
      poaCertPublicKeyHashList: 'poa_cert_public_key_hash_list',
      subjectPublicKey: 'subject_public_key',
      svn: 'svn',
      type: 'type',
      udnsBase64: 'udns_base64',
      validatorCertList: 'validator_cert_list',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      anchoredBlockHash: 'string',
      anchoredBlockHeight: 'number',
      blockchainId: 'string',
      chaincode: 'string',
      channel: 'string',
      detailInfo: 'string',
      domain: 'string',
      poaCertPublicKeyHashList: { 'type': 'array', 'itemType': 'string' },
      subjectPublicKey: 'string',
      svn: 'number',
      type: 'string',
      udnsBase64: 'string',
      validatorCertList: 'number',
      version: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 返回fabric chain info的信息
export class FabricChainInfo extends $tea.Model {
  // 区块链id	
  // 
  blockchainId?: string;
  // 描述
  description?: string;
  // 链域名
  domain?: string;
  // 创建时间
  gmtCreate?: string;
  // 链注册状态INIT, INIT_FAILED, REGISTRING, REGISTERED, REGISTRATION_FAILED
  regStatus?: string;
  // 区块链类型：MYCHAIN_010, FABRIC_14
  type?: string;
  static names(): { [key: string]: string } {
    return {
      blockchainId: 'blockchain_id',
      description: 'description',
      domain: 'domain',
      gmtCreate: 'gmt_create',
      regStatus: 'reg_status',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      blockchainId: 'string',
      description: 'string',
      domain: 'string',
      gmtCreate: 'string',
      regStatus: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 区块链合约信息
export class BlockchainContractInfo extends $tea.Model {
  // mychain上系统合约“am合约”的地址
  amContractAddress?: string;
  // 区块链id
  blockchainId?: string;
  // fabric合约
  chainCode?: string;
  // mychain系统合约“oracle合约”地址
  // 
  oracleContractAddress?: string;
  // mychain链上系统合约“p2p合约”地址
  // 
  p2pContractAddress?: string;
  // mychain上wasm版系统合约“am合约”的链上地址
  wasmAmContractAddress?: string;
  // mychain wasm版系统合约“orcale合约”地址
  wasmOracleContractAddress?: string;
  // mychain上wasm版系统合约“p2p合约”链上地址
  wasmP2pContractAddress?: string;
  static names(): { [key: string]: string } {
    return {
      amContractAddress: 'am_contract_address',
      blockchainId: 'blockchain_id',
      chainCode: 'chain_code',
      oracleContractAddress: 'oracle_contract_address',
      p2pContractAddress: 'p2p_contract_address',
      wasmAmContractAddress: 'wasm_am_contract_address',
      wasmOracleContractAddress: 'wasm_oracle_contract_address',
      wasmP2pContractAddress: 'wasm_p2p_contract_address',
    };
  }

  static types(): { [key: string]: any } {
    return {
      amContractAddress: 'string',
      blockchainId: 'string',
      chainCode: 'string',
      oracleContractAddress: 'string',
      p2pContractAddress: 'string',
      wasmAmContractAddress: 'string',
      wasmOracleContractAddress: 'string',
      wasmP2pContractAddress: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartBaasOdatsAccesschainAuthorizeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 详细描述
  description?: string;
  // 被授权链domain
  grantDomain: string;
  // 授权链域名
  ownerDomain: string;
  // 资源类型
  resourceType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      description: 'description',
      grantDomain: 'grant_domain',
      ownerDomain: 'owner_domain',
      resourceType: 'resource_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      description: 'string',
      grantDomain: 'string',
      ownerDomain: 'string',
      resourceType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartBaasOdatsAccesschainAuthorizeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 跨链数据访问授权信息
  data?: AccessChainInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: AccessChainInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasOdatsAccesschainAuthorizeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授权关系id
  aclId: string;
  // 详细描述
  description?: string;
  // 授权资源类型
  resourceType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      aclId: 'acl_id',
      description: 'description',
      resourceType: 'resource_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      aclId: 'string',
      description: 'string',
      resourceType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasOdatsAccesschainAuthorizeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 跨链访问数据授权信息
  data?: AccessChainInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: AccessChainInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListBaasOdatsAccesschainAuthorizedRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 自有链链域名
  ownerDomain: string;
  // 页码
  pageNum: number;
  // 分页大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      ownerDomain: 'owner_domain',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      ownerDomain: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListBaasOdatsAccesschainAuthorizedResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 访问链权限信息列表
  data?: AccessChainInfo[];
  // 分页页码。
  pageNum?: number;
  // 当前页大小
  pageSize?: number;
  // 总行数
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
      data: { 'type': 'array', 'itemType': AccessChainInfo },
      pageNum: 'number',
      pageSize: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListBaasOdatsAccesschainGrantedRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 被授权链的链域名
  grantDomain: string;
  // 页码
  pageNum: number;
  // 分页大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      grantDomain: 'grant_domain',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      grantDomain: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListBaasOdatsAccesschainGrantedResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授权访问链列表
  data?: AccessChainInfo[];
  // 当前页码
  pageNum?: number;
  // 页大小
  pageSize?: number;
  // 总行数
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
      data: { 'type': 'array', 'itemType': AccessChainInfo },
      pageNum: 'number',
      pageSize: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListBaasOdatsAccesschainResourcetypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链域名
  domain: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      domain: 'domain',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      domain: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListBaasOdatsAccesschainResourcetypeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 可以访问的数据类型
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

export class DisableBaasOdatsAclRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授权关系id
  aclId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      aclId: 'acl_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      aclId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DisableBaasOdatsAclResponse extends $tea.Model {
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

export class QueryBaasOdatsActivestatusRequest extends $tea.Model {
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

export class QueryBaasOdatsActivestatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回开通状态， NOT_ACTIVATED： 未开通；PENDING_APPROVAL：待审批；  ACTIVATED：开通
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

export class QueryBaasOdatsAgreementRequest extends $tea.Model {
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

export class QueryBaasOdatsAgreementResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户同意授权状态
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

export class SaveBaasOdatsAgreementRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户是否同意服务协议
  status?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBaasOdatsAgreementResponse extends $tea.Model {
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

export class QueryBaasOdatsBlockchainBaseinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 区块链id
  blockchainId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      blockchainId: 'blockchain_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      blockchainId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasOdatsBlockchainBaseinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回的区块链基本信息
  data?: BlockchainBasicInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: BlockchainBasicInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasOdatsBlockchainContractinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 区块链id
  blockchainId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      blockchainId: 'blockchain_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      blockchainId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasOdatsBlockchainContractinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回的区块链合约信息
  data?: BlockchainContractInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: BlockchainContractInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasOdatsCrosschaimAuthorizeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 待更新授权关系ID
  aclId: string;
  // 详细描述
  description?: string;
  // 被授权合约链上地址
  grantIdentity: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      aclId: 'acl_id',
      description: 'description',
      grantIdentity: 'grant_identity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      aclId: 'string',
      description: 'string',
      grantIdentity: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasOdatsCrosschaimAuthorizeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 跨链调用授权信息
  data?: CrossChainInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: CrossChainInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartBaasOdatsCrosschainAuthorizeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 详细描述
  description?: string;
  // 被授权链域名
  grantDomain: string;
  // 被授权合约链上地址
  grantIdentity: string;
  // 授权链的链域名
  ownerDomain: string;
  // 授权合约链上地址
  ownerIdentity: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      description: 'description',
      grantDomain: 'grant_domain',
      grantIdentity: 'grant_identity',
      ownerDomain: 'owner_domain',
      ownerIdentity: 'owner_identity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      description: 'string',
      grantDomain: 'string',
      grantIdentity: 'string',
      ownerDomain: 'string',
      ownerIdentity: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartBaasOdatsCrosschainAuthorizeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 跨链调用信息结构体
  data?: CrossChainInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: CrossChainInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListBaasOdatsCrosschainAuthorizedRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 自有链的链域名
  ownerDomain: string;
  // 分页页码
  pageNum: number;
  // 分页大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      ownerDomain: 'owner_domain',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      ownerDomain: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListBaasOdatsCrosschainAuthorizedResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 跨链信息列表
  data?: CrossChainInfo[];
  // 页码
  pageNum?: number;
  // 页大小
  pageSize?: number;
  // 总行数
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
      data: { 'type': 'array', 'itemType': CrossChainInfo },
      pageNum: 'number',
      pageSize: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListBaasOdatsCrosschainGrantedRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 被授权链的链域名
  grantDomain: string;
  // 页码
  pageNum: number;
  // 分页大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      grantDomain: 'grant_domain',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      grantDomain: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListBaasOdatsCrosschainGrantedResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 跨链调用授权列表
  data?: CrossChainInfo[];
  // 当前页码
  pageNum?: number;
  // 页大小
  pageSize?: number;
  // 总行数
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
      data: { 'type': 'array', 'itemType': CrossChainInfo },
      pageNum: 'number',
      pageSize: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasOdatsDomaincertRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链域名
  domain: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      domain: 'domain',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      domain: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasOdatsDomaincertResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 域名证书信息
  data?: DomainCert;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: DomainCert,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasOdatsFabricCcRequest extends $tea.Model {
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

export class QueryBaasOdatsFabricCcResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 合约内容
  chaincode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      chaincode: 'chaincode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      chaincode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasOdatsFabricChaincodepathRequest extends $tea.Model {
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

export class QueryBaasOdatsFabricChaincodepathResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 上次cc的oss临时路径
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

export class StartBaasOdatsFabricConfigyamlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // fabir yaml配置文件
  configYaml: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      configYaml: 'config_yaml',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      configYaml: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartBaasOdatsFabricConfigyamlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 解析后的fabric 信息
  data?: ConfigYamlInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: ConfigYamlInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartBaasOdatsFabricRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 通道名
  channelName: string;
  // fabric yaml 配置文件
  configYaml: string;
  // 详细描述
  description: string;
  // 链域名
  domain: string;
  // fabric 密码
  secret?: string;
  // fabir链接用户名
  username?: string;
  // fabric用户证书
  userCert?: string;
  // fabric用户密钥
  userKey?: string;
  // 验证节点列表
  validatorPeerNameList: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      channelName: 'channel_name',
      configYaml: 'config_yaml',
      description: 'description',
      domain: 'domain',
      secret: 'secret',
      username: 'username',
      userCert: 'user_cert',
      userKey: 'user_key',
      validatorPeerNameList: 'validator_peer_name_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      channelName: 'string',
      configYaml: 'string',
      description: 'string',
      domain: 'string',
      secret: 'string',
      username: 'string',
      userCert: 'string',
      userKey: 'string',
      validatorPeerNameList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartBaasOdatsFabricResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // fabric chain info的信息
  data?: FabricChainInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: FabricChainInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartBaasOdatsMychainRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 锚定块高
  anchoredBlockHeight?: number;
  // 链id
  bizid?: string;
  // 详细描述
  description: string;
  // 链域名
  domain: string;
  // {"mychainInfo":{"caCert":" mychain对应的cacert ","consensusNodeInfo":[{"ip":"","port":""},{"ip":"","port":""}]},"mychainAccount":{"account":"使用的链上账户","privateKey":"","privateKeyPwd":"","publicKey":"","recoveryPrivateKey":"","recoveryPrivateKeyPwd":"","recoveryPublicKey":""},"mychainTlsCert":{"cert":"链接链的证书","privateKey":"","privateKeyPwd":""}}
  mychainInfo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      anchoredBlockHeight: 'anchored_block_height',
      bizid: 'bizid',
      description: 'description',
      domain: 'domain',
      mychainInfo: 'mychain_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      anchoredBlockHeight: 'number',
      bizid: 'string',
      description: 'string',
      domain: 'string',
      mychainInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartBaasOdatsMychainResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回注册的mychain的信息
  data?: MyChainInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: MyChainInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListBaasOdatsRegisteredblockchainRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前页码
  pageNum: number;
  // 页大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListBaasOdatsRegisteredblockchainResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 注册list列表
  data?: OdatsRegisteredBlockChainInfo[];
  // 当前页码。
  pageNum?: number;
  // 当前页大小
  pageSize?: number;
  // 总行数
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
      data: { 'type': 'array', 'itemType': OdatsRegisteredBlockChainInfo },
      pageNum: 'number',
      pageSize: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasOdatsUdnscertRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链域名
  domain: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      domain: 'domain',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      domain: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasOdatsUdnscertResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // udns cert 信息
  data?: UdnsCert;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: UdnsCert,
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
          sdk_version: "1.0.0",
          _prod_code: "ak_122342269ba34053ab6e5304d82e7358",
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
   * Description: 授权跨链数据访问
   * Summary: 授权跨链数据访问
   */
  async startBaasOdatsAccesschainAuthorize(request: StartBaasOdatsAccesschainAuthorizeRequest): Promise<StartBaasOdatsAccesschainAuthorizeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startBaasOdatsAccesschainAuthorizeEx(request, headers, runtime);
  }

  /**
   * Description: 授权跨链数据访问
   * Summary: 授权跨链数据访问
   */
  async startBaasOdatsAccesschainAuthorizeEx(request: StartBaasOdatsAccesschainAuthorizeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartBaasOdatsAccesschainAuthorizeResponse> {
    Util.validateModel(request);
    return $tea.cast<StartBaasOdatsAccesschainAuthorizeResponse>(await this.doRequest("1.0", "baas.odats.accesschain.authorize.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartBaasOdatsAccesschainAuthorizeResponse({}));
  }

  /**
   * Description: 更新跨链数据访问权限
   * Summary: 更新跨链数据访问权限
   */
  async updateBaasOdatsAccesschainAuthorize(request: UpdateBaasOdatsAccesschainAuthorizeRequest): Promise<UpdateBaasOdatsAccesschainAuthorizeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateBaasOdatsAccesschainAuthorizeEx(request, headers, runtime);
  }

  /**
   * Description: 更新跨链数据访问权限
   * Summary: 更新跨链数据访问权限
   */
  async updateBaasOdatsAccesschainAuthorizeEx(request: UpdateBaasOdatsAccesschainAuthorizeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateBaasOdatsAccesschainAuthorizeResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBaasOdatsAccesschainAuthorizeResponse>(await this.doRequest("1.0", "baas.odats.accesschain.authorize.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateBaasOdatsAccesschainAuthorizeResponse({}));
  }

  /**
   * Description: 获取链授权访问的链列表
   * Summary: 获取链授权访问的链列表
   */
  async listBaasOdatsAccesschainAuthorized(request: ListBaasOdatsAccesschainAuthorizedRequest): Promise<ListBaasOdatsAccesschainAuthorizedResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listBaasOdatsAccesschainAuthorizedEx(request, headers, runtime);
  }

  /**
   * Description: 获取链授权访问的链列表
   * Summary: 获取链授权访问的链列表
   */
  async listBaasOdatsAccesschainAuthorizedEx(request: ListBaasOdatsAccesschainAuthorizedRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListBaasOdatsAccesschainAuthorizedResponse> {
    Util.validateModel(request);
    return $tea.cast<ListBaasOdatsAccesschainAuthorizedResponse>(await this.doRequest("1.0", "baas.odats.accesschain.authorized.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListBaasOdatsAccesschainAuthorizedResponse({}));
  }

  /**
   * Description: 查询被授权访问数据的映射关系列表
   * Summary: 查询被授权访问数据的映射关系列表
   */
  async listBaasOdatsAccesschainGranted(request: ListBaasOdatsAccesschainGrantedRequest): Promise<ListBaasOdatsAccesschainGrantedResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listBaasOdatsAccesschainGrantedEx(request, headers, runtime);
  }

  /**
   * Description: 查询被授权访问数据的映射关系列表
   * Summary: 查询被授权访问数据的映射关系列表
   */
  async listBaasOdatsAccesschainGrantedEx(request: ListBaasOdatsAccesschainGrantedRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListBaasOdatsAccesschainGrantedResponse> {
    Util.validateModel(request);
    return $tea.cast<ListBaasOdatsAccesschainGrantedResponse>(await this.doRequest("1.0", "baas.odats.accesschain.granted.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListBaasOdatsAccesschainGrantedResponse({}));
  }

  /**
   * Description: 获取指定链提供的可访问的资源类型
   * Summary: 获取指定链提供的可访问的资源类型
   */
  async listBaasOdatsAccesschainResourcetype(request: ListBaasOdatsAccesschainResourcetypeRequest): Promise<ListBaasOdatsAccesschainResourcetypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listBaasOdatsAccesschainResourcetypeEx(request, headers, runtime);
  }

  /**
   * Description: 获取指定链提供的可访问的资源类型
   * Summary: 获取指定链提供的可访问的资源类型
   */
  async listBaasOdatsAccesschainResourcetypeEx(request: ListBaasOdatsAccesschainResourcetypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListBaasOdatsAccesschainResourcetypeResponse> {
    Util.validateModel(request);
    return $tea.cast<ListBaasOdatsAccesschainResourcetypeResponse>(await this.doRequest("1.0", "baas.odats.accesschain.resourcetype.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListBaasOdatsAccesschainResourcetypeResponse({}));
  }

  /**
   * Description: 撤销跨链访问数据/调用权限
   * Summary: 撤销跨链访问数据/调用权限
   */
  async disableBaasOdatsAcl(request: DisableBaasOdatsAclRequest): Promise<DisableBaasOdatsAclResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.disableBaasOdatsAclEx(request, headers, runtime);
  }

  /**
   * Description: 撤销跨链访问数据/调用权限
   * Summary: 撤销跨链访问数据/调用权限
   */
  async disableBaasOdatsAclEx(request: DisableBaasOdatsAclRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DisableBaasOdatsAclResponse> {
    Util.validateModel(request);
    return $tea.cast<DisableBaasOdatsAclResponse>(await this.doRequest("1.0", "baas.odats.acl.disable", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DisableBaasOdatsAclResponse({}));
  }

  /**
   * Description: 查询用户是否已经开通odats服务
   * Summary: 查询用户是否已经开通odats服务
   */
  async queryBaasOdatsActivestatus(request: QueryBaasOdatsActivestatusRequest): Promise<QueryBaasOdatsActivestatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBaasOdatsActivestatusEx(request, headers, runtime);
  }

  /**
   * Description: 查询用户是否已经开通odats服务
   * Summary: 查询用户是否已经开通odats服务
   */
  async queryBaasOdatsActivestatusEx(request: QueryBaasOdatsActivestatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBaasOdatsActivestatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasOdatsActivestatusResponse>(await this.doRequest("1.0", "baas.odats.activestatus.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBaasOdatsActivestatusResponse({}));
  }

  /**
   * Description: 查询用户是否已经同意odats服务协议
   * Summary: 查询用户是否已经同意odats服务协议
   */
  async queryBaasOdatsAgreement(request: QueryBaasOdatsAgreementRequest): Promise<QueryBaasOdatsAgreementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBaasOdatsAgreementEx(request, headers, runtime);
  }

  /**
   * Description: 查询用户是否已经同意odats服务协议
   * Summary: 查询用户是否已经同意odats服务协议
   */
  async queryBaasOdatsAgreementEx(request: QueryBaasOdatsAgreementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBaasOdatsAgreementResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasOdatsAgreementResponse>(await this.doRequest("1.0", "baas.odats.agreement.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBaasOdatsAgreementResponse({}));
  }

  /**
   * Description: 用户同意授权之后保持状态
   * Summary: 用户同意授权之后保持状态
   */
  async saveBaasOdatsAgreement(request: SaveBaasOdatsAgreementRequest): Promise<SaveBaasOdatsAgreementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveBaasOdatsAgreementEx(request, headers, runtime);
  }

  /**
   * Description: 用户同意授权之后保持状态
   * Summary: 用户同意授权之后保持状态
   */
  async saveBaasOdatsAgreementEx(request: SaveBaasOdatsAgreementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveBaasOdatsAgreementResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveBaasOdatsAgreementResponse>(await this.doRequest("1.0", "baas.odats.agreement.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveBaasOdatsAgreementResponse({}));
  }

  /**
   * Description: 查询注册的链的基本信息
   * Summary: 查询注册的链的基本信息
   */
  async queryBaasOdatsBlockchainBaseinfo(request: QueryBaasOdatsBlockchainBaseinfoRequest): Promise<QueryBaasOdatsBlockchainBaseinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBaasOdatsBlockchainBaseinfoEx(request, headers, runtime);
  }

  /**
   * Description: 查询注册的链的基本信息
   * Summary: 查询注册的链的基本信息
   */
  async queryBaasOdatsBlockchainBaseinfoEx(request: QueryBaasOdatsBlockchainBaseinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBaasOdatsBlockchainBaseinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasOdatsBlockchainBaseinfoResponse>(await this.doRequest("1.0", "baas.odats.blockchain.baseinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBaasOdatsBlockchainBaseinfoResponse({}));
  }

  /**
   * Description: 获取跨链合约信息
   * Summary: 获取跨链合约信息
   */
  async queryBaasOdatsBlockchainContractinfo(request: QueryBaasOdatsBlockchainContractinfoRequest): Promise<QueryBaasOdatsBlockchainContractinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBaasOdatsBlockchainContractinfoEx(request, headers, runtime);
  }

  /**
   * Description: 获取跨链合约信息
   * Summary: 获取跨链合约信息
   */
  async queryBaasOdatsBlockchainContractinfoEx(request: QueryBaasOdatsBlockchainContractinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBaasOdatsBlockchainContractinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasOdatsBlockchainContractinfoResponse>(await this.doRequest("1.0", "baas.odats.blockchain.contractinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBaasOdatsBlockchainContractinfoResponse({}));
  }

  /**
   * Description: 更新跨链访问权限
   * Summary: 更新跨链访问权限
   */
  async updateBaasOdatsCrosschaimAuthorize(request: UpdateBaasOdatsCrosschaimAuthorizeRequest): Promise<UpdateBaasOdatsCrosschaimAuthorizeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateBaasOdatsCrosschaimAuthorizeEx(request, headers, runtime);
  }

  /**
   * Description: 更新跨链访问权限
   * Summary: 更新跨链访问权限
   */
  async updateBaasOdatsCrosschaimAuthorizeEx(request: UpdateBaasOdatsCrosschaimAuthorizeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateBaasOdatsCrosschaimAuthorizeResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBaasOdatsCrosschaimAuthorizeResponse>(await this.doRequest("1.0", "baas.odats.crosschaim.authorize.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateBaasOdatsCrosschaimAuthorizeResponse({}));
  }

  /**
   * Description: 授权跨链合约调用权限
   * Summary: 授权跨链合约调用权限
   */
  async startBaasOdatsCrosschainAuthorize(request: StartBaasOdatsCrosschainAuthorizeRequest): Promise<StartBaasOdatsCrosschainAuthorizeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startBaasOdatsCrosschainAuthorizeEx(request, headers, runtime);
  }

  /**
   * Description: 授权跨链合约调用权限
   * Summary: 授权跨链合约调用权限
   */
  async startBaasOdatsCrosschainAuthorizeEx(request: StartBaasOdatsCrosschainAuthorizeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartBaasOdatsCrosschainAuthorizeResponse> {
    Util.validateModel(request);
    return $tea.cast<StartBaasOdatsCrosschainAuthorizeResponse>(await this.doRequest("1.0", "baas.odats.crosschain.authorize.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartBaasOdatsCrosschainAuthorizeResponse({}));
  }

  /**
   * Description: 获取指定自有链已授权的信息列表
   * Summary: 获取指定自有链已授权的信息列表
   */
  async listBaasOdatsCrosschainAuthorized(request: ListBaasOdatsCrosschainAuthorizedRequest): Promise<ListBaasOdatsCrosschainAuthorizedResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listBaasOdatsCrosschainAuthorizedEx(request, headers, runtime);
  }

  /**
   * Description: 获取指定自有链已授权的信息列表
   * Summary: 获取指定自有链已授权的信息列表
   */
  async listBaasOdatsCrosschainAuthorizedEx(request: ListBaasOdatsCrosschainAuthorizedRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListBaasOdatsCrosschainAuthorizedResponse> {
    Util.validateModel(request);
    return $tea.cast<ListBaasOdatsCrosschainAuthorizedResponse>(await this.doRequest("1.0", "baas.odats.crosschain.authorized.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListBaasOdatsCrosschainAuthorizedResponse({}));
  }

  /**
   * Description: 获取目标链被授权的映射关系列表
   * Summary: 获取目标链被授权的映射关系列表
   */
  async listBaasOdatsCrosschainGranted(request: ListBaasOdatsCrosschainGrantedRequest): Promise<ListBaasOdatsCrosschainGrantedResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listBaasOdatsCrosschainGrantedEx(request, headers, runtime);
  }

  /**
   * Description: 获取目标链被授权的映射关系列表
   * Summary: 获取目标链被授权的映射关系列表
   */
  async listBaasOdatsCrosschainGrantedEx(request: ListBaasOdatsCrosschainGrantedRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListBaasOdatsCrosschainGrantedResponse> {
    Util.validateModel(request);
    return $tea.cast<ListBaasOdatsCrosschainGrantedResponse>(await this.doRequest("1.0", "baas.odats.crosschain.granted.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListBaasOdatsCrosschainGrantedResponse({}));
  }

  /**
   * Description: 获取域名证书
   * Summary: 获取域名证书
   */
  async queryBaasOdatsDomaincert(request: QueryBaasOdatsDomaincertRequest): Promise<QueryBaasOdatsDomaincertResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBaasOdatsDomaincertEx(request, headers, runtime);
  }

  /**
   * Description: 获取域名证书
   * Summary: 获取域名证书
   */
  async queryBaasOdatsDomaincertEx(request: QueryBaasOdatsDomaincertRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBaasOdatsDomaincertResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasOdatsDomaincertResponse>(await this.doRequest("1.0", "baas.odats.domaincert.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBaasOdatsDomaincertResponse({}));
  }

  /**
   * Description: 查询跨链合约
   * Summary: 查询跨链CC
   */
  async queryBaasOdatsFabricCc(request: QueryBaasOdatsFabricCcRequest): Promise<QueryBaasOdatsFabricCcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBaasOdatsFabricCcEx(request, headers, runtime);
  }

  /**
   * Description: 查询跨链合约
   * Summary: 查询跨链CC
   */
  async queryBaasOdatsFabricCcEx(request: QueryBaasOdatsFabricCcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBaasOdatsFabricCcResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasOdatsFabricCcResponse>(await this.doRequest("1.0", "baas.odats.fabric.cc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBaasOdatsFabricCcResponse({}));
  }

  /**
   * Description: 查询fabric CC的oss路径
   * Summary: 查询fabric CC的oss路径
   */
  async queryBaasOdatsFabricChaincodepath(request: QueryBaasOdatsFabricChaincodepathRequest): Promise<QueryBaasOdatsFabricChaincodepathResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBaasOdatsFabricChaincodepathEx(request, headers, runtime);
  }

  /**
   * Description: 查询fabric CC的oss路径
   * Summary: 查询fabric CC的oss路径
   */
  async queryBaasOdatsFabricChaincodepathEx(request: QueryBaasOdatsFabricChaincodepathRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBaasOdatsFabricChaincodepathResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasOdatsFabricChaincodepathResponse>(await this.doRequest("1.0", "baas.odats.fabric.chaincodepath.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBaasOdatsFabricChaincodepathResponse({}));
  }

  /**
   * Description: 处理fabric配置文件
   * Summary: 处理fabric配置文件
   */
  async startBaasOdatsFabricConfigyaml(request: StartBaasOdatsFabricConfigyamlRequest): Promise<StartBaasOdatsFabricConfigyamlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startBaasOdatsFabricConfigyamlEx(request, headers, runtime);
  }

  /**
   * Description: 处理fabric配置文件
   * Summary: 处理fabric配置文件
   */
  async startBaasOdatsFabricConfigyamlEx(request: StartBaasOdatsFabricConfigyamlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartBaasOdatsFabricConfigyamlResponse> {
    Util.validateModel(request);
    return $tea.cast<StartBaasOdatsFabricConfigyamlResponse>(await this.doRequest("1.0", "baas.odats.fabric.configyaml.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartBaasOdatsFabricConfigyamlResponse({}));
  }

  /**
   * Description: 注册fabric链
   * Summary: 注册fabric链
   */
  async startBaasOdatsFabric(request: StartBaasOdatsFabricRequest): Promise<StartBaasOdatsFabricResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startBaasOdatsFabricEx(request, headers, runtime);
  }

  /**
   * Description: 注册fabric链
   * Summary: 注册fabric链
   */
  async startBaasOdatsFabricEx(request: StartBaasOdatsFabricRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartBaasOdatsFabricResponse> {
    Util.validateModel(request);
    return $tea.cast<StartBaasOdatsFabricResponse>(await this.doRequest("1.0", "baas.odats.fabric.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartBaasOdatsFabricResponse({}));
  }

  /**
   * Description: 向odats注册mychain链
   * Summary: 向odats注册mychain链
   */
  async startBaasOdatsMychain(request: StartBaasOdatsMychainRequest): Promise<StartBaasOdatsMychainResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startBaasOdatsMychainEx(request, headers, runtime);
  }

  /**
   * Description: 向odats注册mychain链
   * Summary: 向odats注册mychain链
   */
  async startBaasOdatsMychainEx(request: StartBaasOdatsMychainRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartBaasOdatsMychainResponse> {
    Util.validateModel(request);
    return $tea.cast<StartBaasOdatsMychainResponse>(await this.doRequest("1.0", "baas.odats.mychain.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartBaasOdatsMychainResponse({}));
  }

  /**
   * Description: 查询注册的blockchain列表
   * Summary: 查询注册的blockchain列表
   */
  async listBaasOdatsRegisteredblockchain(request: ListBaasOdatsRegisteredblockchainRequest): Promise<ListBaasOdatsRegisteredblockchainResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listBaasOdatsRegisteredblockchainEx(request, headers, runtime);
  }

  /**
   * Description: 查询注册的blockchain列表
   * Summary: 查询注册的blockchain列表
   */
  async listBaasOdatsRegisteredblockchainEx(request: ListBaasOdatsRegisteredblockchainRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListBaasOdatsRegisteredblockchainResponse> {
    Util.validateModel(request);
    return $tea.cast<ListBaasOdatsRegisteredblockchainResponse>(await this.doRequest("1.0", "baas.odats.registeredblockchain.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListBaasOdatsRegisteredblockchainResponse({}));
  }

  /**
   * Description: 获取udns证书
   * Summary: 获取udns证书
   */
  async queryBaasOdatsUdnscert(request: QueryBaasOdatsUdnscertRequest): Promise<QueryBaasOdatsUdnscertResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBaasOdatsUdnscertEx(request, headers, runtime);
  }

  /**
   * Description: 获取udns证书
   * Summary: 获取udns证书
   */
  async queryBaasOdatsUdnscertEx(request: QueryBaasOdatsUdnscertRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBaasOdatsUdnscertResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasOdatsUdnscertResponse>(await this.doRequest("1.0", "baas.odats.udnscert.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBaasOdatsUdnscertResponse({}));
  }

}
