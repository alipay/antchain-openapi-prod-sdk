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

// NameValuePair
export class NameValuePair extends $tea.Model {
  // 字段名称
  name: string;
  // 字段值
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

// 用户可访问Channel信息
export class UserChannelDTO extends $tea.Model {
  // 通道名称
  channelName: string;
  // 通道是否公开可访问
  publicAcl: boolean;
  // 创建通道的用户did
  creatorDid: string;
  // 权限到期时间
  validTime: string;
  static names(): { [key: string]: string } {
    return {
      channelName: 'channel_name',
      publicAcl: 'public_acl',
      creatorDid: 'creator_did',
      validTime: 'valid_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      channelName: 'string',
      publicAcl: 'boolean',
      creatorDid: 'string',
      validTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用于MyPocket返回链上账户
export class AccountEntry extends $tea.Model {
  // mychain的账户名字
  accountName: string;
  // account_name的hash的hex string
  accountId: string;
  static names(): { [key: string]: string } {
    return {
      accountName: 'account_name',
      accountId: 'account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accountName: 'string',
      accountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 访问权限过滤器
export class AccessFilterDTO extends $tea.Model {
  // 过滤器名称
  filterName: string;
  // 要过滤的字段路径
  path: string;
  // 路径字段的取值范围
  target: string[];
  static names(): { [key: string]: string } {
    return {
      filterName: 'filter_name',
      path: 'path',
      target: 'target',
    };
  }

  static types(): { [key: string]: any } {
    return {
      filterName: 'string',
      path: 'string',
      target: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 结果返回过滤
export class ResultFilterDTO extends $tea.Model {
  // 过滤器名称
  filterName: string;
  // 要返回的字段路径列表
  pathList: string[];
  static names(): { [key: string]: string } {
    return {
      filterName: 'filter_name',
      pathList: 'path_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      filterName: 'string',
      pathList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据通道Channel
export class ChannelDTO extends $tea.Model {
  // 通道名称
  channelName: string;
  // 通道是否公开访问
  publicAcl: boolean;
  // 通道创建账户
  userDid: string;
  static names(): { [key: string]: string } {
    return {
      channelName: 'channel_name',
      publicAcl: 'public_acl',
      userDid: 'user_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      channelName: 'string',
      publicAcl: 'boolean',
      userDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据状态驱动
export class StatusDrive extends $tea.Model {
  // 起始状态
  fromStatus: string;
  // 下一状态
  toStatus: string;
  // 驱动上链记录哈希
  driveHash: string;
  // 链上时间戳
  timestamp: number;
  static names(): { [key: string]: string } {
    return {
      fromStatus: 'from_status',
      toStatus: 'to_status',
      driveHash: 'drive_hash',
      timestamp: 'timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fromStatus: 'string',
      toStatus: 'string',
      driveHash: 'string',
      timestamp: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据归属权
export class DataTransferObject extends $tea.Model {
  // 发起方
  from: string;
  // 转交方
  to: string;
  // 流转备注
  formBody: string;
  // 链上流转记录
  txHash: string;
  // 链上时间戳
  // 
  timestamp: number;
  static names(): { [key: string]: string } {
    return {
      from: 'from',
      to: 'to',
      formBody: 'form_body',
      txHash: 'tx_hash',
      timestamp: 'timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      from: 'string',
      to: 'string',
      formBody: 'string',
      txHash: 'string',
      timestamp: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 存证记录
export class NotaryRecord extends $tea.Model {
  // 存证记录
  attributes: NameValuePair[];
  // 二维码链接
  qrCodeUrl: string;
  static names(): { [key: string]: string } {
    return {
      attributes: 'attributes',
      qrCodeUrl: 'qr_code_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      attributes: { 'type': 'array', 'itemType': NameValuePair },
      qrCodeUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 自定义流程入参DTO
export class FlowTemplate extends $tea.Model {
  // 业务单据类型
  type: string;
  // 起始状态
  fromStatus: string;
  // 目标状态
  toStatus: string;
  // 是否为状态流起始节点
  startNode: boolean;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      fromStatus: 'from_status',
      toStatus: 'to_status',
      startNode: 'start_node',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      fromStatus: 'string',
      toStatus: 'string',
      startNode: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 表单链下链上锚定索引
export class FormIndexDTO extends $tea.Model {
  // 业务表单ID
  formId: string;
  // 业务表单类型
  formType: string;
  // 块高
  blockHeight: number;
  // 交易hash
  txHash: string;
  // 交易时间戳
  txTimestamp: string;
  static names(): { [key: string]: string } {
    return {
      formId: 'form_id',
      formType: 'form_type',
      blockHeight: 'block_height',
      txHash: 'tx_hash',
      txTimestamp: 'tx_timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      formId: 'string',
      formType: 'string',
      blockHeight: 'number',
      txHash: 'string',
      txTimestamp: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateMypocketChainaccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户的MyPocket账户对应的DID
  did: string;
  // 区块链在MyPocket中的唯一ID
  chainId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      did: 'did',
      chainId: 'chain_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      did: 'string',
      chainId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateMypocketChainaccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // mychain账户名字
  accountName?: string;
  // account_name hash的hex字符串
  accountId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accountName: 'account_name',
      accountId: 'account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accountName: 'string',
      accountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMypocketChainaccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 要查询的链账户绑定的DID
  did: string;
  // 要查询的区块链账户所在的链ID
  chainId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      did: 'did',
      chainId: 'chain_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      did: 'string',
      chainId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMypocketChainaccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 包含链账户的name和id
  chainAccounts?: AccountEntry[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      chainAccounts: 'chain_accounts',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      chainAccounts: { 'type': 'array', 'itemType': AccountEntry },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindMypocketKmsaccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户的DID
  did: string;
  // 区块链ID
  chainId: string;
  // 用户的链上账户
  chainAccount: string;
  // 该链账户在BaaS服务的KMS ID 
  kmsId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      did: 'did',
      chainId: 'chain_id',
      chainAccount: 'chain_account',
      kmsId: 'kms_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      did: 'string',
      chainId: 'string',
      chainAccount: 'string',
      kmsId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindMypocketKmsaccountResponse extends $tea.Model {
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

export class CreateMypocketDidaccountbyalipayRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 支付宝Uid
  alipayUid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      alipayUid: 'alipay_uid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      alipayUid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateMypocketDidaccountbyalipayResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户的DID
  did?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      did: 'did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      did: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMypocketDidaccountbyalipayRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 支付宝Uid
  alipayUid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      alipayUid: 'alipay_uid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      alipayUid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMypocketDidaccountbyalipayResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 外部DApp应用通过支付宝UID查询普通用户did
  did?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      did: 'did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      did: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateMypocketEscrowchainaccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户did
  did: string;
  // 链id
  chainId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      did: 'did',
      chainId: 'chain_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      did: 'string',
      chainId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateMypocketEscrowchainaccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 账户名称
  accountName?: string;
  // 链上id
  accountId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accountName: 'account_name',
      accountId: 'account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accountName: 'string',
      accountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMypocketEscrowchainaccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户did
  did: string;
  // 链id
  chainId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      did: 'did',
      chainId: 'chain_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      did: 'string',
      chainId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMypocketEscrowchainaccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // DID对应的所有链上账户
  chainAccounts?: AccountEntry[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      chainAccounts: 'chain_accounts',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      chainAccounts: { 'type': 'array', 'itemType': AccountEntry },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateUserDidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联盟标识（联盟ID）
  unionId: number;
  // 参与方的业务类型，如仓库WMS, 电商平台PSP，银行BANK
  type: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      unionId: 'union_id',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      unionId: 'number',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateUserDidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户创建的账户身份DID，用于向区块链上发交易
  userDid?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      userDid: 'user_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      userDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateUnionApplyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 协作联盟名称
  name: string;
  // 联盟描述
  description: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      description: 'description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      description: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateUnionApplyResponse extends $tea.Model {
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

export class ConfirmUnionApplyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 审核是否通过，SUCCESS,FAILURE,FREEZE
  status: string;
  // 联盟id
  unionId: number;
  // 区块链ID，status为SUCCESS时需要传入
  chainId?: string;
  // COMMON:普通链
  // TEE：TEE链
  // status为SUCCESS时需要填充
  chainType?: string;
  // TEE场景下要部署的链上合约名称，chain_type为TEE时需要传入
  contractName?: string;
  // 合约版本，TEE场景下需要传入
  contractVersion?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      status: 'status',
      unionId: 'union_id',
      chainId: 'chain_id',
      chainType: 'chain_type',
      contractName: 'contract_name',
      contractVersion: 'contract_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      status: 'string',
      unionId: 'number',
      chainId: 'string',
      chainType: 'string',
      contractName: 'string',
      contractVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmUnionApplyResponse extends $tea.Model {
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

export class CreateUnionChannelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联盟ID
  unionId: number;
  // 通信通道的名称
  channelName: string;
  // 发起创建channel的用户
  userDid: string;
  // Channel中数据是否联盟内公开，true为公开可访问，支持后续更新是否公开
  publicAcl: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      unionId: 'union_id',
      channelName: 'channel_name',
      userDid: 'user_did',
      publicAcl: 'public_acl',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      unionId: 'number',
      channelName: 'string',
      userDid: 'string',
      publicAcl: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateUnionChannelResponse extends $tea.Model {
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

export class ListUserChannelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联盟ID
  unionId: number;
  // 发起账户
  userDid: string;
  // 操作权限类型读、写，入参为WRITE, READ
  operateType: string;
  // 页码，从1开始，不传默认查询第一页
  pageNum?: number;
  // 页大小，不传的话默认100，页大小上限100
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      unionId: 'union_id',
      userDid: 'user_did',
      operateType: 'operate_type',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      unionId: 'number',
      userDid: 'string',
      operateType: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListUserChannelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 页码
  pageNum?: number;
  // 页大小
  pageSize?: number;
  // 总页数
  totalPage?: number;
  // 用户有读或写权限的非公开访问通道列表
  channelList?: UserChannelDTO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalPage: 'total_page',
      channelList: 'channel_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pageNum: 'number',
      pageSize: 'number',
      totalPage: 'number',
      channelList: { 'type': 'array', 'itemType': UserChannelDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListUnionPubchannelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联盟ID
  unionId: number;
  // 发起查询的账户
  userDid: string;
  // 页码，不传默认为第一页
  pageNum?: number;
  // 页大小，不传默认为100，页大小上限为100
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      unionId: 'union_id',
      userDid: 'user_did',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      unionId: 'number',
      userDid: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListUnionPubchannelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 页码
  pageNum?: number;
  // 页大小
  pageSize?: number;
  // 总页数
  totalPage?: number;
  // 公开可访问Channel列表
  channelList?: ChannelDTO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalPage: 'total_page',
      channelList: 'channel_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pageNum: 'number',
      pageSize: 'number',
      totalPage: 'number',
      channelList: { 'type': 'array', 'itemType': ChannelDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthChannelUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联盟ID
  unionId: number;
  // Channel名称
  channelName: string;
  // 发起授权操作的账户
  userDid: string;
  // 要授权的账户
  targetUserDid: string;
  // 要给用户分配读或写权限
  // READ,
  // WRITE;
  operateType: string;
  // 授权有效期，为空时表示永久有效
  validTime?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      unionId: 'union_id',
      channelName: 'channel_name',
      userDid: 'user_did',
      targetUserDid: 'target_user_did',
      operateType: 'operate_type',
      validTime: 'valid_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      unionId: 'number',
      channelName: 'string',
      userDid: 'string',
      targetUserDid: 'string',
      operateType: 'string',
      validTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthChannelUserResponse extends $tea.Model {
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

export class CancelChannelUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联盟ID
  unionId: number;
  // Channel名称
  channelName: string;
  // 发起方账户
  userDid: string;
  // 要取消授权的账户
  targetUserDid: string;
  // 要取消的操作权限类型
  operateType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      unionId: 'union_id',
      channelName: 'channel_name',
      userDid: 'user_did',
      targetUserDid: 'target_user_did',
      operateType: 'operate_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      unionId: 'number',
      channelName: 'string',
      userDid: 'string',
      targetUserDid: 'string',
      operateType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelChannelUserResponse extends $tea.Model {
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

export class CreateUnionFormRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 上链账户
  userDid: string;
  // 联盟ID
  unionId: number;
  // Channel名称
  channelName: string;
  // 业务单据号
  formId: string;
  // 业务单据类型
  formType: string;
  // 原生单据json字符串
  formBody: string;
  // 用户自定义的图ID，开启图功能时传入
  graphId?: string;
  // 用户自定义的LineNode名称
  lineNode?: string;
  // 业务数据关联键，一个业务流产生的表单用相同的traceId进行关联
  traceId?: string;
  // 表单的直接上游节点formId
  parentFormIdList?: string[];
  // 表单的直接下游节点formId
  childFormIdList?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userDid: 'user_did',
      unionId: 'union_id',
      channelName: 'channel_name',
      formId: 'form_id',
      formType: 'form_type',
      formBody: 'form_body',
      graphId: 'graph_id',
      lineNode: 'line_node',
      traceId: 'trace_id',
      parentFormIdList: 'parent_form_id_list',
      childFormIdList: 'child_form_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userDid: 'string',
      unionId: 'number',
      channelName: 'string',
      formId: 'string',
      formType: 'string',
      formBody: 'string',
      graphId: 'string',
      lineNode: 'string',
      traceId: 'string',
      parentFormIdList: { 'type': 'array', 'itemType': 'string' },
      childFormIdList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateUnionFormResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上交易Hash
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUnionFormRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 发起方账户
  userDid: string;
  // 联盟ID
  unionId: number;
  // 业务单据ID
  formId: string;
  // 业务单据类型
  formType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userDid: 'user_did',
      unionId: 'union_id',
      formId: 'form_id',
      formType: 'form_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userDid: 'string',
      unionId: 'number',
      formId: 'string',
      formType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUnionFormResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 块高
  blockHeight?: number;
  // 交易hash
  txHash?: string;
  // 交易时间戳
  txTimestamp?: string;
  // 业务表单ID
  formId?: string;
  // 业务单据类型
  formType?: string;
  // 解密后原始表单内容
  content?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      blockHeight: 'block_height',
      txHash: 'tx_hash',
      txTimestamp: 'tx_timestamp',
      formId: 'form_id',
      formType: 'form_type',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      blockHeight: 'number',
      txHash: 'string',
      txTimestamp: 'string',
      formId: 'string',
      formType: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListChannelUserformRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 发起方的账户
  userDid: string;
  // 联盟ID
  unionId: number;
  // Channel名称
  channelName: string;
  // 页码，默认1
  pageNum?: number;
  // 页大小，默认100
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userDid: 'user_did',
      unionId: 'union_id',
      channelName: 'channel_name',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userDid: 'string',
      unionId: 'number',
      channelName: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListChannelUserformResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 页码
  pageNum?: number;
  // 页大小
  pageSize?: number;
  // 总页数
  totalPage?: number;
  // 表单列表
  formList?: FormIndexDTO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalPage: 'total_page',
      formList: 'form_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pageNum: 'number',
      pageSize: 'number',
      totalPage: 'number',
      formList: { 'type': 'array', 'itemType': FormIndexDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateObjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 区块链身份
  // 
  // 
  userDid: string;
  // 联盟标识（联盟码）	
  unionId: string;
  // 归属权要流转的表单ID
  // 
  // 
  formId: string;
  // 物的信息
  // 
  // 
  formBody: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userDid: 'user_did',
      unionId: 'union_id',
      formId: 'form_id',
      formBody: 'form_body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userDid: 'string',
      unionId: 'string',
      formId: 'string',
      formBody: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateObjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易哈希，物的链上身份
  objectHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      objectHash: 'object_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      objectHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateObjectTransferRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 区块链身份
  userDid: string;
  // 联盟标识（联盟码）	
  unionId: string;
  // 链上物体的身份，即物体（物权）上链接口返回的交易哈希
  objectHash: string;
  // 流转备注信息
  formBody?: string;
  // 数据归属权流转到的Did
  toDid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userDid: 'user_did',
      unionId: 'union_id',
      objectHash: 'object_hash',
      formBody: 'form_body',
      toDid: 'to_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userDid: 'string',
      unionId: 'string',
      objectHash: 'string',
      formBody: 'string',
      toDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateObjectTransferResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易Hash
  // 
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListObjectTransferRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 区块链身份
  userDid: string;
  // 联盟标识（联盟码）
  unionId: string;
  // 链上物体的身份
  objectHash: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userDid: 'user_did',
      unionId: 'union_id',
      objectHash: 'object_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userDid: 'string',
      unionId: 'string',
      objectHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListObjectTransferResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据归属权流转列表
  // 
  dataTransferList?: DataTransferObject[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      dataTransferList: 'data_transfer_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      dataTransferList: { 'type': 'array', 'itemType': DataTransferObject },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateStatusflowTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联盟ID
  unionId: string;
  // 状态流模版名称
  flowName: string;
  // 自定义流程入参DTO
  flowTemplate: FlowTemplate[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      unionId: 'union_id',
      flowName: 'flow_name',
      flowTemplate: 'flow_template',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      unionId: 'string',
      flowName: 'string',
      flowTemplate: { 'type': 'array', 'itemType': FlowTemplate },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateStatusflowTemplateResponse extends $tea.Model {
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

export class DeleteStatusflowTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联盟ID
  unionId: string;
  // 状态流模版名称
  flowName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      unionId: 'union_id',
      flowName: 'flow_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      unionId: 'string',
      flowName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteStatusflowTemplateResponse extends $tea.Model {
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

export class QueryStatusflowTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联盟ID
  unionId: string;
  // 状态流模版名称
  flowName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      unionId: 'union_id',
      flowName: 'flow_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      unionId: 'string',
      flowName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryStatusflowTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 联盟ID
  unionId?: string;
  // 状态流模版名称
  flowName?: string;
  // 自定义流程返回DTO
  listTemplateProcess?: FlowTemplate[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      unionId: 'union_id',
      flowName: 'flow_name',
      listTemplateProcess: 'list_template_process',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      unionId: 'string',
      flowName: 'string',
      listTemplateProcess: { 'type': 'array', 'itemType': FlowTemplate },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartDatastatusDriveRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 区块链身份
  userDid: string;
  // 联盟标识（联盟码）
  unionId: string;
  // 链上物体的身份，即物体（物权）上链接口返回的交易哈希
  objectHash: string;
  // 进行驱动状态的环节业务类型
  formType: string;
  // 驱动状态的信息备注
  formBody: string;
  // 是否驱动状态流转，前置条件配置了状态流转模版
  driveStatus: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userDid: 'user_did',
      unionId: 'union_id',
      objectHash: 'object_hash',
      formType: 'form_type',
      formBody: 'form_body',
      driveStatus: 'drive_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userDid: 'string',
      unionId: 'string',
      objectHash: 'string',
      formType: 'string',
      formBody: 'string',
      driveStatus: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartDatastatusDriveResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易Hash
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDatastatusDriveRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 区块链身份
  // 
  userDid: string;
  // 联盟标识（联盟码）
  // 
  unionId: string;
  // 链上数据的身份
  // 
  txHash: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userDid: 'user_did',
      unionId: 'union_id',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userDid: 'string',
      unionId: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDatastatusDriveResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据状态流转
  // 
  dataStatusDriveList?: StatusDrive[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      dataStatusDriveList: 'data_status_drive_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      dataStatusDriveList: { 'type': 'array', 'itemType': StatusDrive },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAsynformFormRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 上链账户
  userDid: string;
  // 联盟ID
  // 
  unionId: number;
  // Channel名称
  // 
  channelName: string;
  // 业务单据号
  // 
  formId: string;
  // 业务单据类型
  // 
  formType: string;
  // 原生单据json字符串
  formBody: string;
  // 用户自定义的图ID，开启图功能时传入
  // 
  graphId?: string;
  // 用户自定义的LineNode名称
  // 
  lineNode?: string;
  // 业务数据关联键，一个业务流产生的表单用相同的traceId进行关联
  traceId?: string;
  // 表单的直接上游节点formId
  // 
  parentFormIdList?: string[];
  // 表单的直接下游节点formId
  // 
  childFormIdList?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userDid: 'user_did',
      unionId: 'union_id',
      channelName: 'channel_name',
      formId: 'form_id',
      formType: 'form_type',
      formBody: 'form_body',
      graphId: 'graph_id',
      lineNode: 'line_node',
      traceId: 'trace_id',
      parentFormIdList: 'parent_form_id_list',
      childFormIdList: 'child_form_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userDid: 'string',
      unionId: 'number',
      channelName: 'string',
      formId: 'string',
      formType: 'string',
      formBody: 'string',
      graphId: 'string',
      lineNode: 'string',
      traceId: 'string',
      parentFormIdList: { 'type': 'array', 'itemType': 'string' },
      childFormIdList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAsynformFormResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易Hash
  // 
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryUnionFormRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联盟ID
  // 
  unionId: number;
  // 业务数据关联键，一个业务流产生的表单用相同的traceId进行关联
  traceId?: string;
  // 过滤时间段开始时间点
  startTime?: string;
  // 过滤时间段结束时间点
  endTime?: string;
  // 页码，默认从1开始
  pageNum: number;
  // 页大小，默认100，最大值限制为100
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      unionId: 'union_id',
      traceId: 'trace_id',
      startTime: 'start_time',
      endTime: 'end_time',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      unionId: 'number',
      traceId: 'string',
      startTime: 'string',
      endTime: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryUnionFormResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 页码
  pageNum?: number;
  // 页大小
  pageSize?: number;
  // 总页数
  totalPage?: number;
  // 单据索引列表
  formList?: FormIndexDTO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalPage: 'total_page',
      formList: 'form_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pageNum: 'number',
      pageSize: 'number',
      totalPage: 'number',
      formList: { 'type': 'array', 'itemType': FormIndexDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAsynformStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 发起方账户
  // 
  userDid: string;
  // 联盟ID
  // 
  unionId: number;
  // 业务单据ID
  // 
  formId: string;
  // 业务单据类型
  // 
  formType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userDid: 'user_did',
      unionId: 'union_id',
      formId: 'form_id',
      formType: 'form_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userDid: 'string',
      unionId: 'number',
      formId: 'string',
      formType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAsynformStatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 块高
  // 
  blockHeight?: number;
  // 交易hash
  // 
  txHash?: string;
  // 上传时间
  // 
  createTime?: string;
  // SUCCESS:上链成功, FAILURE:上链失败，UPLOADING:上链中
  status?: string;
  // 交易时间戳，成功上链时间
  // 
  txTimestamp?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      blockHeight: 'block_height',
      txHash: 'tx_hash',
      createTime: 'create_time',
      status: 'status',
      txTimestamp: 'tx_timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      blockHeight: 'number',
      txHash: 'string',
      createTime: 'string',
      status: 'string',
      txTimestamp: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySolutionFastnotaryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用did
  // 
  appDid: string;
  // 索引字段的值
  // 
  bizIndexKeyValue: string;
  // 名称
  schemaName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appDid: 'app_did',
      bizIndexKeyValue: 'biz_index_key_value',
      schemaName: 'schema_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appDid: 'string',
      bizIndexKeyValue: 'string',
      schemaName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySolutionFastnotaryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证记录
  notaryRecord?: NotaryRecord;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      notaryRecord: 'notary_record',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      notaryRecord: NotaryRecord,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveSolutionFastnotaryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用did
  // 
  appDid: string;
  // 表名
  schemaName: string;
  // 存证数据
  attributes: NameValuePair[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appDid: 'app_did',
      schemaName: 'schema_name',
      attributes: 'attributes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appDid: 'string',
      schemaName: 'string',
      attributes: { 'type': 'array', 'itemType': NameValuePair },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveSolutionFastnotaryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易哈希
  // 
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitSolutionFilenotaryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用did
  appDid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appDid: 'app_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitSolutionFilenotaryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文件存证id
  fileNotaryId?: string;
  // 上传url
  url?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      fileNotaryId: 'file_notary_id',
      url: 'url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      fileNotaryId: 'string',
      url: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncSolutionFilenotaryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用did
  // 
  appDid: string;
  // 文件存证id
  // 
  fileNotaryId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appDid: 'app_did',
      fileNotaryId: 'file_notary_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appDid: 'string',
      fileNotaryId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncSolutionFilenotaryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否被接收
  // 
  accepted?: boolean;
  // 拒绝原因
  // 
  deniedReason?: string;
  // 文件存证id
  // 
  fileNotaryId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accepted: 'accepted',
      deniedReason: 'denied_reason',
      fileNotaryId: 'file_notary_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accepted: 'boolean',
      deniedReason: 'string',
      fileNotaryId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSolutionFilenotarystatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用did
  // 
  appDid: string;
  // 文件存证id
  // 
  fileNotaryId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appDid: 'app_did',
      fileNotaryId: 'file_notary_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appDid: 'string',
      fileNotaryId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSolutionFilenotarystatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证是否接受
  // 
  accepted?: boolean;
  // 存证拒绝原因
  // 
  deniedReason?: string;
  // 文件存证id
  // 
  fileNotaryId?: string;
  // 存证是否完成
  finished?: boolean;
  // 存证哈希，存证未完成时为空
  // 
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accepted: 'accepted',
      deniedReason: 'denied_reason',
      fileNotaryId: 'file_notary_id',
      finished: 'finished',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accepted: 'boolean',
      deniedReason: 'string',
      fileNotaryId: 'string',
      finished: 'boolean',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySolutionFilenotaryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用did
  // 
  appDid: string;
  // 存证哈希
  // 
  txHash: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appDid: 'app_did',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appDid: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySolutionFilenotaryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文件sha256哈希
  // 
  fileContentHash?: string;
  // 小程序二维码对应的url
  // 
  qrCodeUrl?: string;
  // 下载url
  url?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      fileContentHash: 'file_content_hash',
      qrCodeUrl: 'qr_code_url',
      url: 'url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      fileContentHash: 'string',
      qrCodeUrl: 'string',
      url: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecContractServiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用did
  appDid: string;
  // 合约方法名
  contractMethod: string;
  // 合约名称，当一个应用有多个合约时需要传入
  contractName?: string;
  // 1.同步交易，2.异步交易，3.Local
  // 如果不理解以上交易方式之间的区别请不要传入该参数，默认为同步交易
  execType?: number;
  // 合约入参（格式为json）
  requestBody: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appDid: 'app_did',
      contractMethod: 'contract_method',
      contractName: 'contract_name',
      execType: 'exec_type',
      requestBody: 'request_body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appDid: 'string',
      contractMethod: 'string',
      contractName: 'string',
      execType: 'number',
      requestBody: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecContractServiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 合约执行结果
  responseBody?: string;
  // 交易hash
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseBody: 'response_body',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseBody: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitSolutionBmsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizid: string;
  // 账户名称
  account: string;
  // 合约ID
  contractId: string;
  // 合约名称
  contractName: string;
  // 合约临时url
  contractUrl: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      account: 'account',
      contractId: 'contract_id',
      contractName: 'contract_name',
      contractUrl: 'contract_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      account: 'string',
      contractId: 'string',
      contractName: 'string',
      contractUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitSolutionBmsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 应用ID
  appDid?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appDid: 'app_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySolutionBmsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizid: string;
  // 合约ID
  contractId: string;
  // 合约名称
  contractName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      contractId: 'contract_id',
      contractName: 'contract_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      contractId: 'string',
      contractName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySolutionBmsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 合约oss存储url
  tempContractUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tempContractUrl: 'temp_contract_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tempContractUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeploySolutionContractRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizid: string;
  // 链操作者信息
  operator: string;
  // 合约名称
  contractName: string;
  // 提交记录ID
  commitId: string;
  // 当前分支
  branch: string;
  // 合约仓库路径
  gitRepo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      operator: 'operator',
      contractName: 'contract_name',
      commitId: 'commit_id',
      branch: 'branch',
      gitRepo: 'git_repo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      operator: 'string',
      contractName: 'string',
      commitId: 'string',
      branch: 'string',
      gitRepo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeploySolutionContractResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否部署成功
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
          sdk_version: "1.3.3",
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
   * Description: 为用户在MyPocket创建链上账户
   * Summary: MyPocket创建链上账户
   */
  async createMypocketChainaccount(request: CreateMypocketChainaccountRequest): Promise<CreateMypocketChainaccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createMypocketChainaccountEx(request, headers, runtime);
  }

  /**
   * Description: 为用户在MyPocket创建链上账户
   * Summary: MyPocket创建链上账户
   */
  async createMypocketChainaccountEx(request: CreateMypocketChainaccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateMypocketChainaccountResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateMypocketChainaccountResponse>(await this.doRequest("1.0", "blockchain.appex.mypocket.chainaccount.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateMypocketChainaccountResponse({}));
  }

  /**
   * Description: 用户根据DID和chainID，查询区块链账户
   * Summary: 用户查询区块链账户
   */
  async queryMypocketChainaccount(request: QueryMypocketChainaccountRequest): Promise<QueryMypocketChainaccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMypocketChainaccountEx(request, headers, runtime);
  }

  /**
   * Description: 用户根据DID和chainID，查询区块链账户
   * Summary: 用户查询区块链账户
   */
  async queryMypocketChainaccountEx(request: QueryMypocketChainaccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMypocketChainaccountResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMypocketChainaccountResponse>(await this.doRequest("1.0", "blockchain.appex.mypocket.chainaccount.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMypocketChainaccountResponse({}));
  }

  /**
   * Description: 外部DApp应用绑定链账户至did
   * Summary: 外部DApp应用绑定链账户至did
   */
  async bindMypocketKmsaccount(request: BindMypocketKmsaccountRequest): Promise<BindMypocketKmsaccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindMypocketKmsaccountEx(request, headers, runtime);
  }

  /**
   * Description: 外部DApp应用绑定链账户至did
   * Summary: 外部DApp应用绑定链账户至did
   */
  async bindMypocketKmsaccountEx(request: BindMypocketKmsaccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindMypocketKmsaccountResponse> {
    Util.validateModel(request);
    return $tea.cast<BindMypocketKmsaccountResponse>(await this.doRequest("1.0", "blockchain.appex.mypocket.kmsaccount.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindMypocketKmsaccountResponse({}));
  }

  /**
   * Description: 外部DApp应用通过支付宝UID创建普通用户did账户
   * Summary: 创建普通用户DID账户（支付宝UID）
   */
  async createMypocketDidaccountbyalipay(request: CreateMypocketDidaccountbyalipayRequest): Promise<CreateMypocketDidaccountbyalipayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createMypocketDidaccountbyalipayEx(request, headers, runtime);
  }

  /**
   * Description: 外部DApp应用通过支付宝UID创建普通用户did账户
   * Summary: 创建普通用户DID账户（支付宝UID）
   */
  async createMypocketDidaccountbyalipayEx(request: CreateMypocketDidaccountbyalipayRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateMypocketDidaccountbyalipayResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateMypocketDidaccountbyalipayResponse>(await this.doRequest("1.0", "blockchain.appex.mypocket.didaccountbyalipay.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateMypocketDidaccountbyalipayResponse({}));
  }

  /**
   * Description: 外部DApp应用通过支付宝UID查询普通用户did
   * Summary: 查询普通用户did（支付宝UID）
   */
  async queryMypocketDidaccountbyalipay(request: QueryMypocketDidaccountbyalipayRequest): Promise<QueryMypocketDidaccountbyalipayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMypocketDidaccountbyalipayEx(request, headers, runtime);
  }

  /**
   * Description: 外部DApp应用通过支付宝UID查询普通用户did
   * Summary: 查询普通用户did（支付宝UID）
   */
  async queryMypocketDidaccountbyalipayEx(request: QueryMypocketDidaccountbyalipayRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMypocketDidaccountbyalipayResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMypocketDidaccountbyalipayResponse>(await this.doRequest("1.0", "blockchain.appex.mypocket.didaccountbyalipay.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMypocketDidaccountbyalipayResponse({}));
  }

  /**
   * Description: 外部DApp应用创建用户链上账户
   * Summary: 外部DApp应用创建用户链上账户
   */
  async createMypocketEscrowchainaccount(request: CreateMypocketEscrowchainaccountRequest): Promise<CreateMypocketEscrowchainaccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createMypocketEscrowchainaccountEx(request, headers, runtime);
  }

  /**
   * Description: 外部DApp应用创建用户链上账户
   * Summary: 外部DApp应用创建用户链上账户
   */
  async createMypocketEscrowchainaccountEx(request: CreateMypocketEscrowchainaccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateMypocketEscrowchainaccountResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateMypocketEscrowchainaccountResponse>(await this.doRequest("1.0", "blockchain.appex.mypocket.escrowchainaccount.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateMypocketEscrowchainaccountResponse({}));
  }

  /**
   * Description: 外部DApp应用查询did在指定链上关联的账户
   * Summary: 外部查询did在指定链上关联的账户
   */
  async queryMypocketEscrowchainaccount(request: QueryMypocketEscrowchainaccountRequest): Promise<QueryMypocketEscrowchainaccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMypocketEscrowchainaccountEx(request, headers, runtime);
  }

  /**
   * Description: 外部DApp应用查询did在指定链上关联的账户
   * Summary: 外部查询did在指定链上关联的账户
   */
  async queryMypocketEscrowchainaccountEx(request: QueryMypocketEscrowchainaccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMypocketEscrowchainaccountResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMypocketEscrowchainaccountResponse>(await this.doRequest("1.0", "blockchain.appex.mypocket.escrowchainaccount.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMypocketEscrowchainaccountResponse({}));
  }

  /**
   * Description: 区块链身份创建
   * Summary: 区块链身份创建
   */
  async createUserDid(request: CreateUserDidRequest): Promise<CreateUserDidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createUserDidEx(request, headers, runtime);
  }

  /**
   * Description: 区块链身份创建
   * Summary: 区块链身份创建
   */
  async createUserDidEx(request: CreateUserDidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateUserDidResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateUserDidResponse>(await this.doRequest("1.0", "blockchain.appex.user.did.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateUserDidResponse({}));
  }

  /**
   * Description: 协作联盟创建申请
   * Summary: 协作联盟创建申请
   */
  async createUnionApply(request: CreateUnionApplyRequest): Promise<CreateUnionApplyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createUnionApplyEx(request, headers, runtime);
  }

  /**
   * Description: 协作联盟创建申请
   * Summary: 协作联盟创建申请
   */
  async createUnionApplyEx(request: CreateUnionApplyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateUnionApplyResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateUnionApplyResponse>(await this.doRequest("1.0", "blockchain.appex.union.apply.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateUnionApplyResponse({}));
  }

  /**
   * Description: 联盟创建申请审核，仅内部租户可调用
   * Summary: 联盟创建申请审核
   */
  async confirmUnionApply(request: ConfirmUnionApplyRequest): Promise<ConfirmUnionApplyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmUnionApplyEx(request, headers, runtime);
  }

  /**
   * Description: 联盟创建申请审核，仅内部租户可调用
   * Summary: 联盟创建申请审核
   */
  async confirmUnionApplyEx(request: ConfirmUnionApplyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmUnionApplyResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmUnionApplyResponse>(await this.doRequest("1.0", "blockchain.appex.union.apply.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmUnionApplyResponse({}));
  }

  /**
   * Description: 在联盟中创建信息通道Channel
   * Summary: 在联盟中创建信息通道Channel
   */
  async createUnionChannel(request: CreateUnionChannelRequest): Promise<CreateUnionChannelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createUnionChannelEx(request, headers, runtime);
  }

  /**
   * Description: 在联盟中创建信息通道Channel
   * Summary: 在联盟中创建信息通道Channel
   */
  async createUnionChannelEx(request: CreateUnionChannelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateUnionChannelResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateUnionChannelResponse>(await this.doRequest("1.0", "blockchain.appex.union.channel.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateUnionChannelResponse({}));
  }

  /**
   * Description: 成员查询自己拥有读或写权限的channel，返回非公开访问的可读Channel集。如果需要查询公开访问的Channel集可以使用blockchain.appex.union.publicChannel.list
   * Summary: 成员查询自己拥有访问权限的channel
   */
  async listUserChannel(request: ListUserChannelRequest): Promise<ListUserChannelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listUserChannelEx(request, headers, runtime);
  }

  /**
   * Description: 成员查询自己拥有读或写权限的channel，返回非公开访问的可读Channel集。如果需要查询公开访问的Channel集可以使用blockchain.appex.union.publicChannel.list
   * Summary: 成员查询自己拥有访问权限的channel
   */
  async listUserChannelEx(request: ListUserChannelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListUserChannelResponse> {
    Util.validateModel(request);
    return $tea.cast<ListUserChannelResponse>(await this.doRequest("1.0", "blockchain.appex.user.channel.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListUserChannelResponse({}));
  }

  /**
   * Description: 联盟公开Channel查询
   * Summary: 联盟公开Channel查询
   */
  async listUnionPubchannel(request: ListUnionPubchannelRequest): Promise<ListUnionPubchannelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listUnionPubchannelEx(request, headers, runtime);
  }

  /**
   * Description: 联盟公开Channel查询
   * Summary: 联盟公开Channel查询
   */
  async listUnionPubchannelEx(request: ListUnionPubchannelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListUnionPubchannelResponse> {
    Util.validateModel(request);
    return $tea.cast<ListUnionPubchannelResponse>(await this.doRequest("1.0", "blockchain.appex.union.pubchannel.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListUnionPubchannelResponse({}));
  }

  /**
   * Description: Channel授权给用户
   * Summary: Channel授权给用户
   */
  async authChannelUser(request: AuthChannelUserRequest): Promise<AuthChannelUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authChannelUserEx(request, headers, runtime);
  }

  /**
   * Description: Channel授权给用户
   * Summary: Channel授权给用户
   */
  async authChannelUserEx(request: AuthChannelUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthChannelUserResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthChannelUserResponse>(await this.doRequest("1.0", "blockchain.appex.channel.user.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthChannelUserResponse({}));
  }

  /**
   * Description: 取消用户访问Channel的权限
   * Summary: 取消用户访问Channel的权限
   */
  async cancelChannelUser(request: CancelChannelUserRequest): Promise<CancelChannelUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelChannelUserEx(request, headers, runtime);
  }

  /**
   * Description: 取消用户访问Channel的权限
   * Summary: 取消用户访问Channel的权限
   */
  async cancelChannelUserEx(request: CancelChannelUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelChannelUserResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelChannelUserResponse>(await this.doRequest("1.0", "blockchain.appex.channel.user.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelChannelUserResponse({}));
  }

  /**
   * Description: 单据加密上链
   * Summary: 单据加密上链
   */
  async createUnionForm(request: CreateUnionFormRequest): Promise<CreateUnionFormResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createUnionFormEx(request, headers, runtime);
  }

  /**
   * Description: 单据加密上链
   * Summary: 单据加密上链
   */
  async createUnionFormEx(request: CreateUnionFormRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateUnionFormResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateUnionFormResponse>(await this.doRequest("1.0", "blockchain.appex.union.form.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateUnionFormResponse({}));
  }

  /**
   * Description: 查询单个表单
   * Summary: 查询单个表单
   */
  async queryUnionForm(request: QueryUnionFormRequest): Promise<QueryUnionFormResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUnionFormEx(request, headers, runtime);
  }

  /**
   * Description: 查询单个表单
   * Summary: 查询单个表单
   */
  async queryUnionFormEx(request: QueryUnionFormRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUnionFormResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUnionFormResponse>(await this.doRequest("1.0", "blockchain.appex.union.form.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUnionFormResponse({}));
  }

  /**
   * Description: 通道中用户可以访问的表单列表
   * Summary: 通道中用户可以访问的表单列表
   */
  async listChannelUserform(request: ListChannelUserformRequest): Promise<ListChannelUserformResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listChannelUserformEx(request, headers, runtime);
  }

  /**
   * Description: 通道中用户可以访问的表单列表
   * Summary: 通道中用户可以访问的表单列表
   */
  async listChannelUserformEx(request: ListChannelUserformRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListChannelUserformResponse> {
    Util.validateModel(request);
    return $tea.cast<ListChannelUserformResponse>(await this.doRequest("1.0", "blockchain.appex.channel.userform.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListChannelUserformResponse({}));
  }

  /**
   * Description: 物上链，链上数字物体创建
   * Summary: 物权上链
   */
  async createObject(request: CreateObjectRequest): Promise<CreateObjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createObjectEx(request, headers, runtime);
  }

  /**
   * Description: 物上链，链上数字物体创建
   * Summary: 物权上链
   */
  async createObjectEx(request: CreateObjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateObjectResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateObjectResponse>(await this.doRequest("1.0", "blockchain.appex.object.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateObjectResponse({}));
  }

  /**
   * Description: 数据归属权流转
   * Summary: 数据归属权流转
   */
  async createObjectTransfer(request: CreateObjectTransferRequest): Promise<CreateObjectTransferResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createObjectTransferEx(request, headers, runtime);
  }

  /**
   * Description: 数据归属权流转
   * Summary: 数据归属权流转
   */
  async createObjectTransferEx(request: CreateObjectTransferRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateObjectTransferResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateObjectTransferResponse>(await this.doRequest("1.0", "blockchain.appex.object.transfer.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateObjectTransferResponse({}));
  }

  /**
   * Description: 数据归属权流转记录查询
   * Summary: 数据归属权流转记录查询
   */
  async listObjectTransfer(request: ListObjectTransferRequest): Promise<ListObjectTransferResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listObjectTransferEx(request, headers, runtime);
  }

  /**
   * Description: 数据归属权流转记录查询
   * Summary: 数据归属权流转记录查询
   */
  async listObjectTransferEx(request: ListObjectTransferRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListObjectTransferResponse> {
    Util.validateModel(request);
    return $tea.cast<ListObjectTransferResponse>(await this.doRequest("1.0", "blockchain.appex.object.transfer.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListObjectTransferResponse({}));
  }

  /**
   * Description: 状态流驱动模版新增
   * Summary: 状态流驱动模版新增
   */
  async createStatusflowTemplate(request: CreateStatusflowTemplateRequest): Promise<CreateStatusflowTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createStatusflowTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 状态流驱动模版新增
   * Summary: 状态流驱动模版新增
   */
  async createStatusflowTemplateEx(request: CreateStatusflowTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateStatusflowTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateStatusflowTemplateResponse>(await this.doRequest("1.0", "blockchain.appex.statusflow.template.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateStatusflowTemplateResponse({}));
  }

  /**
   * Description: 状态流驱动模版删除
   * Summary: 状态流驱动模版删除
   */
  async deleteStatusflowTemplate(request: DeleteStatusflowTemplateRequest): Promise<DeleteStatusflowTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteStatusflowTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 状态流驱动模版删除
   * Summary: 状态流驱动模版删除
   */
  async deleteStatusflowTemplateEx(request: DeleteStatusflowTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteStatusflowTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteStatusflowTemplateResponse>(await this.doRequest("1.0", "blockchain.appex.statusflow.template.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteStatusflowTemplateResponse({}));
  }

  /**
   * Description: 状态流驱动模版查询
   * Summary: 状态流驱动模版查询
   */
  async queryStatusflowTemplate(request: QueryStatusflowTemplateRequest): Promise<QueryStatusflowTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryStatusflowTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 状态流驱动模版查询
   * Summary: 状态流驱动模版查询
   */
  async queryStatusflowTemplateEx(request: QueryStatusflowTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryStatusflowTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryStatusflowTemplateResponse>(await this.doRequest("1.0", "blockchain.appex.statusflow.template.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryStatusflowTemplateResponse({}));
  }

  /**
   * Description: 数据状态驱动
   * Summary: 数据状态驱动
   */
  async startDatastatusDrive(request: StartDatastatusDriveRequest): Promise<StartDatastatusDriveResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startDatastatusDriveEx(request, headers, runtime);
  }

  /**
   * Description: 数据状态驱动
   * Summary: 数据状态驱动
   */
  async startDatastatusDriveEx(request: StartDatastatusDriveRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartDatastatusDriveResponse> {
    Util.validateModel(request);
    return $tea.cast<StartDatastatusDriveResponse>(await this.doRequest("1.0", "blockchain.appex.datastatus.drive.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartDatastatusDriveResponse({}));
  }

  /**
   * Description: 查询数据状态流转记录
   * Summary: 查询数据状态流转记录
   */
  async listDatastatusDrive(request: ListDatastatusDriveRequest): Promise<ListDatastatusDriveResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listDatastatusDriveEx(request, headers, runtime);
  }

  /**
   * Description: 查询数据状态流转记录
   * Summary: 查询数据状态流转记录
   */
  async listDatastatusDriveEx(request: ListDatastatusDriveRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListDatastatusDriveResponse> {
    Util.validateModel(request);
    return $tea.cast<ListDatastatusDriveResponse>(await this.doRequest("1.0", "blockchain.appex.datastatus.drive.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListDatastatusDriveResponse({}));
  }

  /**
   * Description: 单据加密异步上链，返回哈希，后续需要查询上链状态以确定是否成功上链
   * Summary: 单据加密异步上链
   */
  async createAsynformForm(request: CreateAsynformFormRequest): Promise<CreateAsynformFormResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAsynformFormEx(request, headers, runtime);
  }

  /**
   * Description: 单据加密异步上链，返回哈希，后续需要查询上链状态以确定是否成功上链
   * Summary: 单据加密异步上链
   */
  async createAsynformFormEx(request: CreateAsynformFormRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAsynformFormResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAsynformFormResponse>(await this.doRequest("1.0", "blockchain.appex.asynform.form.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAsynformFormResponse({}));
  }

  /**
   * Description: 单据分页查询，支持关联ID(trace_id)和时间段过滤
   * Summary: 单据分页查询
   */
  async pagequeryUnionForm(request: PagequeryUnionFormRequest): Promise<PagequeryUnionFormResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryUnionFormEx(request, headers, runtime);
  }

  /**
   * Description: 单据分页查询，支持关联ID(trace_id)和时间段过滤
   * Summary: 单据分页查询
   */
  async pagequeryUnionFormEx(request: PagequeryUnionFormRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryUnionFormResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryUnionFormResponse>(await this.doRequest("1.0", "blockchain.appex.union.form.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryUnionFormResponse({}));
  }

  /**
   * Description: 单据上链状态查询，异步上链后查询交易是否成功上链
   * Summary: 单据上链状态查询
   */
  async queryAsynformStatus(request: QueryAsynformStatusRequest): Promise<QueryAsynformStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAsynformStatusEx(request, headers, runtime);
  }

  /**
   * Description: 单据上链状态查询，异步上链后查询交易是否成功上链
   * Summary: 单据上链状态查询
   */
  async queryAsynformStatusEx(request: QueryAsynformStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAsynformStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAsynformStatusResponse>(await this.doRequest("1.0", "blockchain.appex.asynform.status.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAsynformStatusResponse({}));
  }

  /**
   * Description: 结构化存证查询
   * Summary: 结构化存证查询
   */
  async querySolutionFastnotary(request: QuerySolutionFastnotaryRequest): Promise<QuerySolutionFastnotaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySolutionFastnotaryEx(request, headers, runtime);
  }

  /**
   * Description: 结构化存证查询
   * Summary: 结构化存证查询
   */
  async querySolutionFastnotaryEx(request: QuerySolutionFastnotaryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySolutionFastnotaryResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySolutionFastnotaryResponse>(await this.doRequest("1.0", "blockchain.appex.solution.fastnotary.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySolutionFastnotaryResponse({}));
  }

  /**
   * Description: 发起结构化存证
   * Summary: 发起结构化存证
   */
  async saveSolutionFastnotary(request: SaveSolutionFastnotaryRequest): Promise<SaveSolutionFastnotaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveSolutionFastnotaryEx(request, headers, runtime);
  }

  /**
   * Description: 发起结构化存证
   * Summary: 发起结构化存证
   */
  async saveSolutionFastnotaryEx(request: SaveSolutionFastnotaryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveSolutionFastnotaryResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveSolutionFastnotaryResponse>(await this.doRequest("1.0", "blockchain.appex.solution.fastnotary.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveSolutionFastnotaryResponse({}));
  }

  /**
   * Description: 初始化文件存证
   * Summary: 初始化文件存证
   */
  async initSolutionFilenotary(request: InitSolutionFilenotaryRequest): Promise<InitSolutionFilenotaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initSolutionFilenotaryEx(request, headers, runtime);
  }

  /**
   * Description: 初始化文件存证
   * Summary: 初始化文件存证
   */
  async initSolutionFilenotaryEx(request: InitSolutionFilenotaryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitSolutionFilenotaryResponse> {
    Util.validateModel(request);
    return $tea.cast<InitSolutionFilenotaryResponse>(await this.doRequest("1.0", "blockchain.appex.solution.filenotary.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitSolutionFilenotaryResponse({}));
  }

  /**
   * Description: 通知文件上传完成
   * Summary: 通知文件上传完成
   */
  async syncSolutionFilenotary(request: SyncSolutionFilenotaryRequest): Promise<SyncSolutionFilenotaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncSolutionFilenotaryEx(request, headers, runtime);
  }

  /**
   * Description: 通知文件上传完成
   * Summary: 通知文件上传完成
   */
  async syncSolutionFilenotaryEx(request: SyncSolutionFilenotaryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncSolutionFilenotaryResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncSolutionFilenotaryResponse>(await this.doRequest("1.0", "blockchain.appex.solution.filenotary.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncSolutionFilenotaryResponse({}));
  }

  /**
   * Description: 获取文件存证的状态
   * Summary: 获取文件存证的状态
   */
  async getSolutionFilenotarystatus(request: GetSolutionFilenotarystatusRequest): Promise<GetSolutionFilenotarystatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getSolutionFilenotarystatusEx(request, headers, runtime);
  }

  /**
   * Description: 获取文件存证的状态
   * Summary: 获取文件存证的状态
   */
  async getSolutionFilenotarystatusEx(request: GetSolutionFilenotarystatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetSolutionFilenotarystatusResponse> {
    Util.validateModel(request);
    return $tea.cast<GetSolutionFilenotarystatusResponse>(await this.doRequest("1.0", "blockchain.appex.solution.filenotarystatus.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetSolutionFilenotarystatusResponse({}));
  }

  /**
   * Description: 查询文件存证
   * Summary: 查询文件存证
   */
  async querySolutionFilenotary(request: QuerySolutionFilenotaryRequest): Promise<QuerySolutionFilenotaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySolutionFilenotaryEx(request, headers, runtime);
  }

  /**
   * Description: 查询文件存证
   * Summary: 查询文件存证
   */
  async querySolutionFilenotaryEx(request: QuerySolutionFilenotaryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySolutionFilenotaryResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySolutionFilenotaryResponse>(await this.doRequest("1.0", "blockchain.appex.solution.filenotary.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySolutionFilenotaryResponse({}));
  }

  /**
   * Description: 合约服务调用
   * Summary: 合约服务调用
   */
  async execContractService(request: ExecContractServiceRequest): Promise<ExecContractServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execContractServiceEx(request, headers, runtime);
  }

  /**
   * Description: 合约服务调用
   * Summary: 合约服务调用
   */
  async execContractServiceEx(request: ExecContractServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecContractServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecContractServiceResponse>(await this.doRequest("1.0", "blockchain.appex.contract.service.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecContractServiceResponse({}));
  }

  /**
   * Description: 速搭平台支持openapi创建应用
   * Summary: 创建合约应用
   */
  async initSolutionBms(request: InitSolutionBmsRequest): Promise<InitSolutionBmsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initSolutionBmsEx(request, headers, runtime);
  }

  /**
   * Description: 速搭平台支持openapi创建应用
   * Summary: 创建合约应用
   */
  async initSolutionBmsEx(request: InitSolutionBmsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitSolutionBmsResponse> {
    Util.validateModel(request);
    return $tea.cast<InitSolutionBmsResponse>(await this.doRequest("1.0", "blockchain.appex.solution.bms.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitSolutionBmsResponse({}));
  }

  /**
   * Description: 获取合约临时oss url
   * Summary: 获取合约临时oss url
   */
  async querySolutionBms(request: QuerySolutionBmsRequest): Promise<QuerySolutionBmsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySolutionBmsEx(request, headers, runtime);
  }

  /**
   * Description: 获取合约临时oss url
   * Summary: 获取合约临时oss url
   */
  async querySolutionBmsEx(request: QuerySolutionBmsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySolutionBmsResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySolutionBmsResponse>(await this.doRequest("1.0", "blockchain.appex.solution.bms.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySolutionBmsResponse({}));
  }

  /**
   * Description: 应用速搭平台部署合约接口
   * Summary: 应用速搭平台部署合约接口
   */
  async deploySolutionContract(request: DeploySolutionContractRequest): Promise<DeploySolutionContractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deploySolutionContractEx(request, headers, runtime);
  }

  /**
   * Description: 应用速搭平台部署合约接口
   * Summary: 应用速搭平台部署合约接口
   */
  async deploySolutionContractEx(request: DeploySolutionContractRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeploySolutionContractResponse> {
    Util.validateModel(request);
    return $tea.cast<DeploySolutionContractResponse>(await this.doRequest("1.0", "blockchain.appex.solution.contract.deploy", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeploySolutionContractResponse({}));
  }

}
