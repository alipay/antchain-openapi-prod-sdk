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

// 区块链response
export class QueryBlockchainResponse extends $tea.Model {
  // 链名称
  blockchain: string;
  // 链类型
  chainType: string;
  static names(): { [key: string]: string } {
    return {
      blockchain: 'blockchain',
      chainType: 'chain_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      blockchain: 'string',
      chainType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// WithdrawalOrderDetail
// 
export class WithdrawalOrderDetail extends $tea.Model {
  // withdrawalAmount
  withdrawalAmount: string;
  static names(): { [key: string]: string } {
    return {
      withdrawalAmount: 'withdrawal_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      withdrawalAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 查询白名单详细信息响应体
export class QueryWhitelistAddressResponse extends $tea.Model {
  // 白名单地址
  whitelistAddress: string;
  // 区块链列表信息
  blockchainList: QueryBlockchainResponse[];
  static names(): { [key: string]: string } {
    return {
      whitelistAddress: 'whitelist_address',
      blockchainList: 'blockchain_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      whitelistAddress: 'string',
      blockchainList: { 'type': 'array', 'itemType': QueryBlockchainResponse },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 币种response
export class QueryTokenSymbolResponse extends $tea.Model {
  // 链名称
  blockchain: string;
  // 币种
  tokenSymbol: string;
  static names(): { [key: string]: string } {
    return {
      blockchain: 'blockchain',
      tokenSymbol: 'token_symbol',
    };
  }

  static types(): { [key: string]: any } {
    return {
      blockchain: 'string',
      tokenSymbol: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 查询deposit订单响应体
export class QueryDepositOrderInfoResponse extends $tea.Model {
  // 订单id
  orderId: string;
  // 订单类型
  orderType: string;
  // 区块链名称
  blockchain: string;
  // 代币名称
  tokenSymbol: string;
  // deposit数量
  amount: string;
  // deposit交易hash
  txHash: string;
  // 交易发起地址，为白名单地址
  fromAddress: string;
  // 交易接收地址，为托管钱包地址
  toAddress: string;
  // 订单创建时间
  createTime: string;
  // 订单状态
  orderStatus: string;
  // 订单备注
  remark: string;
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      orderType: 'order_type',
      blockchain: 'blockchain',
      tokenSymbol: 'token_symbol',
      amount: 'amount',
      txHash: 'tx_hash',
      fromAddress: 'from_address',
      toAddress: 'to_address',
      createTime: 'create_time',
      orderStatus: 'order_status',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      orderType: 'string',
      blockchain: 'string',
      tokenSymbol: 'string',
      amount: 'string',
      txHash: 'string',
      fromAddress: 'string',
      toAddress: 'string',
      createTime: 'string',
      orderStatus: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// WithdrawalOrderDTO
export class WithdrawalOrderDTO extends $tea.Model {
  // orderId
  orderId: string;
  // orderDesc
  orderDesc: string;
  // orderType
  orderType: string;
  // orderStatus:INIT PENDING_CONFIRMATION PENDING_DEPOSIT RUNNING SUCCESS FAILED EXPIRED_CLOSED REFUND REJECTED
  orderStatus: string;
  // withdrawal Amount
  withdrawalAmount: string;
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      orderDesc: 'order_desc',
      orderType: 'order_type',
      orderStatus: 'order_status',
      withdrawalAmount: 'withdrawal_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      orderDesc: 'string',
      orderType: 'string',
      orderStatus: 'string',
      withdrawalAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class WithdrawDacVaultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // customerId of The DAC System
  externalCustomerId: string;
  // blockchain:Ethereum Ploygen
  blockchain: string;
  // Token Token Token identification
  tokenSymbol: string;
  // withdrawal token amount
  withdrawalAmount: string;
  // description of requisition and withdrawal application
  withdrawTokenDesc?: string;
  // the address on the wallet chain of the user_s money withdrawal.
  withdrawalWhitelistAddress: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      externalCustomerId: 'external_customer_id',
      blockchain: 'blockchain',
      tokenSymbol: 'token_symbol',
      withdrawalAmount: 'withdrawal_amount',
      withdrawTokenDesc: 'withdraw_token_desc',
      withdrawalWhitelistAddress: 'withdrawal_whitelist_address',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      externalCustomerId: 'string',
      blockchain: 'string',
      tokenSymbol: 'string',
      withdrawalAmount: 'string',
      withdrawTokenDesc: 'string',
      withdrawalWhitelistAddress: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class WithdrawDacVaultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // withdrawal order detail
  withdrawalOrderDetail?: WithdrawalOrderDetail;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      withdrawalOrderDetail: 'withdrawal_order_detail',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      withdrawalOrderDetail: WithdrawalOrderDetail,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OpenActivateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 地址
  address: string;
  // 外部客户id
  externalCustomerId: string;
  // 客户性别
  sex: string;
  // 用户名
  username: string;
  // 出生日期
  birthDate: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      address: 'address',
      externalCustomerId: 'external_customer_id',
      sex: 'sex',
      username: 'username',
      birthDate: 'birth_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      address: 'string',
      externalCustomerId: 'string',
      sex: 'string',
      username: 'string',
      birthDate: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OpenActivateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 表单id
  applyFormId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      applyFormId: 'apply_form_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      applyFormId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StopActivateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部客户id
  externalCustomerId: string;
  // 备注
  remark: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      externalCustomerId: 'external_customer_id',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      externalCustomerId: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StopActivateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 表单id
  applyFormId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      applyFormId: 'apply_form_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      applyFormId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryDacBlockchainRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前页
  current: number;
  // 每页大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      current: 'current',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      current: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryDacBlockchainResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前页
  current?: string;
  // 每页大小
  pageSize?: string;
  // 总数
  total?: number;
  // 链信息
  list?: QueryBlockchainResponse[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      current: 'current',
      pageSize: 'page_size',
      total: 'total',
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      current: 'string',
      pageSize: 'string',
      total: 'number',
      list: { 'type': 'array', 'itemType': QueryBlockchainResponse },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryDacTokenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前页
  current: number;
  // 每页大小
  pageSize: number;
  // 链名称
  blockchain?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      current: 'current',
      pageSize: 'page_size',
      blockchain: 'blockchain',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      current: 'number',
      pageSize: 'number',
      blockchain: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryDacTokenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前页
  current?: number;
  // 每页大小
  pageSize?: number;
  // 总数
  total?: number;
  // 币种信息
  list?: QueryTokenSymbolResponse[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      current: 'current',
      pageSize: 'page_size',
      total: 'total',
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      current: 'number',
      pageSize: 'number',
      total: 'number',
      list: { 'type': 'array', 'itemType': QueryTokenSymbolResponse },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddDacWhitelistRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部客户id
  externalCustId: string;
  // 外部客户名称
  externalCustName: string;
  // 白名单地址
  address: string;
  // 区块链网络列表
  blockchainList: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      externalCustId: 'external_cust_id',
      externalCustName: 'external_cust_name',
      address: 'address',
      blockchainList: 'blockchain_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      externalCustId: 'string',
      externalCustName: 'string',
      address: 'string',
      blockchainList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddDacWhitelistResponse extends $tea.Model {
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

export class CheckDacWhitelistRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 公钥地址
  address: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      address: 'address',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      address: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckDacWhitelistResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 公钥地址
  address?: string;
  // 支持的链列表
  blockchainList?: string[];
  // 检查结果类型
  checkResultType?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      address: 'address',
      blockchainList: 'blockchain_list',
      checkResultType: 'check_result_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      address: 'string',
      blockchainList: { 'type': 'array', 'itemType': 'string' },
      checkResultType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDacQuotaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // your company external customer id
  externalCustomerId: string;
  // blockchain:Ethereum,Polygon,etc
  blockchain: string;
  // token symbol:USDC,USDT,etc
  tokenSymbol: string;
  // quotaType:DEPOSIT/WITHDRAWAL
  quotaType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      externalCustomerId: 'external_customer_id',
      blockchain: 'blockchain',
      tokenSymbol: 'token_symbol',
      quotaType: 'quota_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      externalCustomerId: 'string',
      blockchain: 'string',
      tokenSymbol: 'string',
      quotaType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDacQuotaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // quotaType:DEPOSIT/WITHDRAWAL
  quotaType?: string;
  // quotaAmount
  quotaAmount?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      quotaType: 'quota_type',
      quotaAmount: 'quota_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      quotaType: 'string',
      quotaAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDacCustodyaddressRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 区块链名称
  blockchain: string;
  // 外部客户唯一id
  externalCustomerId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      blockchain: 'blockchain',
      externalCustomerId: 'external_customer_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      blockchain: 'string',
      externalCustomerId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDacCustodyaddressResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户特定区块链的托管钱包地址，用于deposit转账使用
  custodyAddress?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      custodyAddress: 'custody_address',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      custodyAddress: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDacDepositRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 白名单地址为交易from的地址，用于发起转账操作
  whitelistAddress: string;
  // 存入的金额，可以为整数，或者携带小数位，除以精度之后的值
  depositAmount: string;
  // 区块链名称
  blockchain: string;
  // token名称
  tokenSymbol: string;
  // 外部客户唯一id
  externalCustomerId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      whitelistAddress: 'whitelist_address',
      depositAmount: 'deposit_amount',
      blockchain: 'blockchain',
      tokenSymbol: 'token_symbol',
      externalCustomerId: 'external_customer_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      whitelistAddress: 'string',
      depositAmount: 'string',
      blockchain: 'string',
      tokenSymbol: 'string',
      externalCustomerId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDacDepositResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单id，订单创建失败时这个值为空
  orderId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryDacDepositRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询第几页，从1开始
  current: number;
  // 每页展示多少条，默认10
  pageSize: number;
  // 外部用户唯一id
  externalCustomerId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      current: 'current',
      pageSize: 'page_size',
      externalCustomerId: 'external_customer_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      current: 'number',
      pageSize: 'number',
      externalCustomerId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryDacDepositResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前第几页，为请求的参数值
  current?: number;
  // 默认每页展示多少条，为请求的参数值
  pageSize?: number;
  // 一共列表有多少条数据
  total?: number;
  // deposit订单信息列表
  list?: QueryDepositOrderInfoResponse[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      current: 'current',
      pageSize: 'page_size',
      total: 'total',
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      current: 'number',
      pageSize: 'number',
      total: 'number',
      list: { 'type': 'array', 'itemType': QueryDepositOrderInfoResponse },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDacDepositlimitsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部用户唯一id
  externalCustomerId: string;
  // 代币名称
  tokenSymbol: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      externalCustomerId: 'external_customer_id',
      tokenSymbol: 'token_symbol',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      externalCustomerId: 'string',
      tokenSymbol: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDacDepositlimitsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 可以deposit的最大金额
  depositMaxAmount?: string;
  // 可以deposit的最小金额
  depositMinAmount?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      depositMaxAmount: 'deposit_max_amount',
      depositMinAmount: 'deposit_min_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      depositMaxAmount: 'string',
      depositMinAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryDacWhitelistRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前第几个分页，默认为1
  current: number;
  // 每页展示条数，默认为10
  pageSize: number;
  // 外部用户唯一id
  externalCustomerId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      current: 'current',
      pageSize: 'page_size',
      externalCustomerId: 'external_customer_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      current: 'number',
      pageSize: 'number',
      externalCustomerId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryDacWhitelistResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前第几页，为前端的请求值
  current?: number;
  // 每页展示多少条，为前端的请求值
  pageSize?: number;
  // 总共有多少条数据
  total?: number;
  // 返回白名单列表
  list?: QueryWhitelistAddressResponse[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      current: 'current',
      pageSize: 'page_size',
      total: 'total',
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      current: 'number',
      pageSize: 'number',
      total: 'number',
      list: { 'type': 'array', 'itemType': QueryWhitelistAddressResponse },
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
          sdk_version: "1.0.7",
          _prod_code: "WEBTTS",
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
   * Description: Withdraw Token
   * Summary: Withdraw Token
   */
  async withdrawDacVault(request: WithdrawDacVaultRequest): Promise<WithdrawDacVaultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.withdrawDacVaultEx(request, headers, runtime);
  }

  /**
   * Description: Withdraw Token
   * Summary: Withdraw Token
   */
  async withdrawDacVaultEx(request: WithdrawDacVaultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<WithdrawDacVaultResponse> {
    Util.validateModel(request);
    return $tea.cast<WithdrawDacVaultResponse>(await this.doRequest("1.0", "antdigital.webtts.dac.vault.withdraw", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new WithdrawDacVaultResponse({}));
  }

  /**
   * Description: 开通托管服务
   * Summary: 开通托管服务
   */
  async openActivate(request: OpenActivateRequest): Promise<OpenActivateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.openActivateEx(request, headers, runtime);
  }

  /**
   * Description: 开通托管服务
   * Summary: 开通托管服务
   */
  async openActivateEx(request: OpenActivateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OpenActivateResponse> {
    Util.validateModel(request);
    return $tea.cast<OpenActivateResponse>(await this.doRequest("1.0", "antdigital.webtts.activate.open", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OpenActivateResponse({}));
  }

  /**
   * Description: 关闭托管服务
   * Summary: 关闭托管服务
   */
  async stopActivate(request: StopActivateRequest): Promise<StopActivateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.stopActivateEx(request, headers, runtime);
  }

  /**
   * Description: 关闭托管服务
   * Summary: 关闭托管服务
   */
  async stopActivateEx(request: StopActivateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StopActivateResponse> {
    Util.validateModel(request);
    return $tea.cast<StopActivateResponse>(await this.doRequest("1.0", "antdigital.webtts.activate.stop", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StopActivateResponse({}));
  }

  /**
   * Description: 分页查询支持的区块链
   * Summary: 分页查询支持的区块链
   */
  async pagequeryDacBlockchain(request: PagequeryDacBlockchainRequest): Promise<PagequeryDacBlockchainResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryDacBlockchainEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询支持的区块链
   * Summary: 分页查询支持的区块链
   */
  async pagequeryDacBlockchainEx(request: PagequeryDacBlockchainRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryDacBlockchainResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryDacBlockchainResponse>(await this.doRequest("1.0", "antdigital.webtts.dac.blockchain.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryDacBlockchainResponse({}));
  }

  /**
   * Description: 分页查询支持的币种
   * Summary: 分页查询支持的币种
   */
  async pagequeryDacToken(request: PagequeryDacTokenRequest): Promise<PagequeryDacTokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryDacTokenEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询支持的币种
   * Summary: 分页查询支持的币种
   */
  async pagequeryDacTokenEx(request: PagequeryDacTokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryDacTokenResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryDacTokenResponse>(await this.doRequest("1.0", "antdigital.webtts.dac.token.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryDacTokenResponse({}));
  }

  /**
   * Description: 添加白名单服务
   * Summary: 添加白名单服务
   */
  async addDacWhitelist(request: AddDacWhitelistRequest): Promise<AddDacWhitelistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addDacWhitelistEx(request, headers, runtime);
  }

  /**
   * Description: 添加白名单服务
   * Summary: 添加白名单服务
   */
  async addDacWhitelistEx(request: AddDacWhitelistRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddDacWhitelistResponse> {
    Util.validateModel(request);
    return $tea.cast<AddDacWhitelistResponse>(await this.doRequest("1.0", "antdigital.webtts.dac.whitelist.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddDacWhitelistResponse({}));
  }

  /**
   * Description: 白名单地址检查
   * Summary: 白名单地址检查
   */
  async checkDacWhitelist(request: CheckDacWhitelistRequest): Promise<CheckDacWhitelistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkDacWhitelistEx(request, headers, runtime);
  }

  /**
   * Description: 白名单地址检查
   * Summary: 白名单地址检查
   */
  async checkDacWhitelistEx(request: CheckDacWhitelistRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckDacWhitelistResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckDacWhitelistResponse>(await this.doRequest("1.0", "antdigital.webtts.dac.whitelist.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckDacWhitelistResponse({}));
  }

  /**
   * Description: Query customer quota and return the comparative balance between customer quota and customer balance
  查询提现最大金额，会对比个人提现额度和自有余额，取最小值。
   * Summary: 查询提现最大金额
   */
  async queryDacQuota(request: QueryDacQuotaRequest): Promise<QueryDacQuotaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDacQuotaEx(request, headers, runtime);
  }

  /**
   * Description: Query customer quota and return the comparative balance between customer quota and customer balance
  查询提现最大金额，会对比个人提现额度和自有余额，取最小值。
   * Summary: 查询提现最大金额
   */
  async queryDacQuotaEx(request: QueryDacQuotaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDacQuotaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDacQuotaResponse>(await this.doRequest("1.0", "antdigital.webtts.dac.quota.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDacQuotaResponse({}));
  }

  /**
   * Description: 查询指定用户和区块链的托管钱包地址
   * Summary: 查询托管地址
   */
  async queryDacCustodyaddress(request: QueryDacCustodyaddressRequest): Promise<QueryDacCustodyaddressResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDacCustodyaddressEx(request, headers, runtime);
  }

  /**
   * Description: 查询指定用户和区块链的托管钱包地址
   * Summary: 查询托管地址
   */
  async queryDacCustodyaddressEx(request: QueryDacCustodyaddressRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDacCustodyaddressResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDacCustodyaddressResponse>(await this.doRequest("1.0", "antdigital.webtts.dac.custodyaddress.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDacCustodyaddressResponse({}));
  }

  /**
   * Description: 创建deposit订单
   * Summary: 创建deposit订单
   */
  async createDacDeposit(request: CreateDacDepositRequest): Promise<CreateDacDepositResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDacDepositEx(request, headers, runtime);
  }

  /**
   * Description: 创建deposit订单
   * Summary: 创建deposit订单
   */
  async createDacDepositEx(request: CreateDacDepositRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDacDepositResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDacDepositResponse>(await this.doRequest("1.0", "antdigital.webtts.dac.deposit.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDacDepositResponse({}));
  }

  /**
   * Description: 分页查询deposit订单列表
   * Summary: 分页查询deposit订单列表
   */
  async pagequeryDacDeposit(request: PagequeryDacDepositRequest): Promise<PagequeryDacDepositResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryDacDepositEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询deposit订单列表
   * Summary: 分页查询deposit订单列表
   */
  async pagequeryDacDepositEx(request: PagequeryDacDepositRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryDacDepositResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryDacDepositResponse>(await this.doRequest("1.0", "antdigital.webtts.dac.deposit.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryDacDepositResponse({}));
  }

  /**
   * Description: 查询最大/最小可以deposit的数量
   * Summary: 查询最大/最小可以deposit的数量
   */
  async queryDacDepositlimits(request: QueryDacDepositlimitsRequest): Promise<QueryDacDepositlimitsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDacDepositlimitsEx(request, headers, runtime);
  }

  /**
   * Description: 查询最大/最小可以deposit的数量
   * Summary: 查询最大/最小可以deposit的数量
   */
  async queryDacDepositlimitsEx(request: QueryDacDepositlimitsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDacDepositlimitsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDacDepositlimitsResponse>(await this.doRequest("1.0", "antdigital.webtts.dac.depositlimits.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDacDepositlimitsResponse({}));
  }

  /**
   * Description: 白名单分页列表查询
   * Summary: 白名单分页列表查询
   */
  async pagequeryDacWhitelist(request: PagequeryDacWhitelistRequest): Promise<PagequeryDacWhitelistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryDacWhitelistEx(request, headers, runtime);
  }

  /**
   * Description: 白名单分页列表查询
   * Summary: 白名单分页列表查询
   */
  async pagequeryDacWhitelistEx(request: PagequeryDacWhitelistRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryDacWhitelistResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryDacWhitelistResponse>(await this.doRequest("1.0", "antdigital.webtts.dac.whitelist.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryDacWhitelistResponse({}));
  }

}
