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

// 登录类型
export class LoginAccountTypeBO extends $tea.Model {
  // 登录类型
  userLoginType?: string;
  // 登录名称
  loginName?: string;
  static names(): { [key: string]: string } {
    return {
      userLoginType: 'user_login_type',
      loginName: 'login_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userLoginType: 'string',
      loginName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 跨链账号红利明细
export class CrossChainBonusAccountsDetailVO extends $tea.Model {
  // 明细ID
  id?: string;
  // 交易链上Hash
  transactionHash?: string;
  // 交易前余额
  preBalance?: string;
  // 交易数量
  transactionAmount?: string;
  // 交易后余额
  postBalance?: string;
  // 交易类型
  transactionType?: string;
  // 对手地址
  counterAddress?: string;
  // 创建时间
  gmtCreated?: number;
  // 更新时间
  gmtModified?: number;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      transactionHash: 'transaction_hash',
      preBalance: 'pre_balance',
      transactionAmount: 'transaction_amount',
      postBalance: 'post_balance',
      transactionType: 'transaction_type',
      counterAddress: 'counter_address',
      gmtCreated: 'gmt_created',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      transactionHash: 'string',
      preBalance: 'string',
      transactionAmount: 'string',
      postBalance: 'string',
      transactionType: 'string',
      counterAddress: 'string',
      gmtCreated: 'number',
      gmtModified: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 跨链账号明细
export class CrossChainAccountsDetailVO extends $tea.Model {
  // 明细ID
  id?: string;
  // 交易链上Hash
  transactionHash?: string;
  // 交易前余额
  preBalance?: string;
  // 交易数量
  transactionAmount?: string;
  // 交易后余额
  postBalance?: string;
  // 交易类别
  transactionType?: string;
  // 对手地址
  counterAddress?: string;
  // 创建时间
  gmtCreated?: number;
  // 更新时间
  gmtModified?: number;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      transactionHash: 'transaction_hash',
      preBalance: 'pre_balance',
      transactionAmount: 'transaction_amount',
      postBalance: 'post_balance',
      transactionType: 'transaction_type',
      counterAddress: 'counter_address',
      gmtCreated: 'gmt_created',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      transactionHash: 'string',
      preBalance: 'string',
      transactionAmount: 'string',
      postBalance: 'string',
      transactionType: 'string',
      counterAddress: 'string',
      gmtCreated: 'number',
      gmtModified: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 跨链账户信息
export class CrossChainAccountsVO extends $tea.Model {
  // 对侧链用户地址
  crossChainUserAddress?: string;
  // 对侧链账户ID
  crossChainUserAccountId?: string;
  // 对侧链红利账户ID
  crossChainUserBonusAccountId?: string;
  // 对侧链资产账户明细
  crossChainUserAccountsDetails?: CrossChainAccountsDetailVO[];
  // 对侧链账户信息
  crossChainBonusAccountsDetails?: CrossChainBonusAccountsDetailVO[];
  static names(): { [key: string]: string } {
    return {
      crossChainUserAddress: 'cross_chain_user_address',
      crossChainUserAccountId: 'cross_chain_user_account_id',
      crossChainUserBonusAccountId: 'cross_chain_user_bonus_account_id',
      crossChainUserAccountsDetails: 'cross_chain_user_accounts_details',
      crossChainBonusAccountsDetails: 'cross_chain_bonus_accounts_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      crossChainUserAddress: 'string',
      crossChainUserAccountId: 'string',
      crossChainUserBonusAccountId: 'string',
      crossChainUserAccountsDetails: { 'type': 'array', 'itemType': CrossChainAccountsDetailVO },
      crossChainBonusAccountsDetails: { 'type': 'array', 'itemType': CrossChainBonusAccountsDetailVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 操作角色
export class UserOperatorInfoBO extends $tea.Model {
  // userId
  userId?: string;
  // 别名
  alias?: string;
  // 钱包地址
  address?: string;
  // 登录账号类型列表
  userLoginAccountList?: LoginAccountTypeBO[];
  // 机构类型列表
  userInstitutionTypeList?: string[];
  static names(): { [key: string]: string } {
    return {
      userId: 'user_id',
      alias: 'alias',
      address: 'address',
      userLoginAccountList: 'user_login_account_list',
      userInstitutionTypeList: 'user_institution_type_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userId: 'string',
      alias: 'string',
      address: 'string',
      userLoginAccountList: { 'type': 'array', 'itemType': LoginAccountTypeBO },
      userInstitutionTypeList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 项目参与者信息
export class ParticipantInfo extends $tea.Model {
  // 机构id
  id: string;
  // 二级机构类型
  type: string;
  // 机构名称
  name?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      type: 'type',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      type: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 项目角色信息
export class ProjectWithRole extends $tea.Model {
  // 项目id
  projectId?: string;
  // 项目名称
  projcetName?: string;
  // 描述
  description?: string;
  // token名称
  tokenName?: string;
  // 最大供应量
  capacity?: string;
  // 净值
  netValue?: string;
  // 价格类型
  priceType?: string;
  // 项目净值
  projectNetValue?: string;
  // 最大限额
  maxSubscriptionAmount?: string;
  // 部署类型 DIRECT_PUBLIC_CHAIN 直发公链，NORMAL 普通模式
  deploymentType?: string;
  // 项目所在链
  chainType?: string;
  // 操作角色列表
  userOperatorList?: UserOperatorInfoBO[];
  // 代销者机构集合
  participantInfos?: ParticipantInfo[];
  static names(): { [key: string]: string } {
    return {
      projectId: 'project_id',
      projcetName: 'projcet_name',
      description: 'description',
      tokenName: 'token_name',
      capacity: 'capacity',
      netValue: 'net_value',
      priceType: 'price_type',
      projectNetValue: 'project_net_value',
      maxSubscriptionAmount: 'max_subscription_amount',
      deploymentType: 'deployment_type',
      chainType: 'chain_type',
      userOperatorList: 'user_operator_list',
      participantInfos: 'participant_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      projectId: 'string',
      projcetName: 'string',
      description: 'string',
      tokenName: 'string',
      capacity: 'string',
      netValue: 'string',
      priceType: 'string',
      projectNetValue: 'string',
      maxSubscriptionAmount: 'string',
      deploymentType: 'string',
      chainType: 'string',
      userOperatorList: { 'type': 'array', 'itemType': UserOperatorInfoBO },
      participantInfos: { 'type': 'array', 'itemType': ParticipantInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 跨链账号明细
export class CrossAccountListVO extends $tea.Model {
  // 项目ID
  projectId?: string;
  // 资产项目合约地址
  assetProjectAddress?: string;
  // 红利合约地址
  bonusAddress?: string;
  // 用户ID
  userId?: string;
  // 代销机构ID
  distributorInstitutionId?: string;
  // 发行链名称
  chainName?: string;
  // 投资者用户账户ID
  subUserAccountId?: string;
  // 投资者用户红利账户ID
  subUserBonusAccountId?: string;
  // 目标链名称
  targetChainName?: string;
  // 目标链资产合约地址
  targetChainAssetTokenAddress?: string;
  // 目标链红利合约地址
  targetChainBonusAddress?: string;
  // 对侧链账户信息
  crossChainAccountsInfo?: CrossChainAccountsVO[];
  static names(): { [key: string]: string } {
    return {
      projectId: 'project_id',
      assetProjectAddress: 'asset_project_address',
      bonusAddress: 'bonus_address',
      userId: 'user_id',
      distributorInstitutionId: 'distributor_institution_id',
      chainName: 'chain_name',
      subUserAccountId: 'sub_user_account_id',
      subUserBonusAccountId: 'sub_user_bonus_account_id',
      targetChainName: 'target_chain_name',
      targetChainAssetTokenAddress: 'target_chain_asset_token_address',
      targetChainBonusAddress: 'target_chain_bonus_address',
      crossChainAccountsInfo: 'cross_chain_accounts_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      projectId: 'string',
      assetProjectAddress: 'string',
      bonusAddress: 'string',
      userId: 'string',
      distributorInstitutionId: 'string',
      chainName: 'string',
      subUserAccountId: 'string',
      subUserBonusAccountId: 'string',
      targetChainName: 'string',
      targetChainAssetTokenAddress: 'string',
      targetChainBonusAddress: 'string',
      crossChainAccountsInfo: { 'type': 'array', 'itemType': CrossChainAccountsVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 二级用户
export class SubUserAccountVO extends $tea.Model {
  // 用户账户id
  userAccountId: string;
  // 用户id
  userId: string;
  // 用户地址
  userAddress: string;
  // 用户资产配额
  userTarget: string;
  // 用户资产
  userBalance: string;
  // 项目id
  assetProjectId: string;
  // 项目名称
  assetProjectName: string;
  // 用户所属机构id
  institutionId: string;
  // 用户所属机构名称
  institutionName: string;
  static names(): { [key: string]: string } {
    return {
      userAccountId: 'user_account_id',
      userId: 'user_id',
      userAddress: 'user_address',
      userTarget: 'user_target',
      userBalance: 'user_balance',
      assetProjectId: 'asset_project_id',
      assetProjectName: 'asset_project_name',
      institutionId: 'institution_id',
      institutionName: 'institution_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userAccountId: 'string',
      userId: 'string',
      userAddress: 'string',
      userTarget: 'string',
      userBalance: 'string',
      assetProjectId: 'string',
      assetProjectName: 'string',
      institutionId: 'string',
      institutionName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 登入登出接口操作日志回参
export class LoginOperationLogVO extends $tea.Model {
  // 用户ID
  userId: string;
  // 用户地址
  userAddress?: string;
  // 登录名
  loginName?: string;
  // 登录类型
  loginAccountType?: string;
  // 请求URL
  requestURL: string;
  // 是否成功
  success: boolean;
  // 创建时间
  gmtCreated: number;
  static names(): { [key: string]: string } {
    return {
      userId: 'user_id',
      userAddress: 'user_address',
      loginName: 'login_name',
      loginAccountType: 'login_account_type',
      requestURL: 'request_u_r_l',
      success: 'success',
      gmtCreated: 'gmt_created',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userId: 'string',
      userAddress: 'string',
      loginName: 'string',
      loginAccountType: 'string',
      requestURL: 'string',
      success: 'boolean',
      gmtCreated: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntdigitalWebtrwatradeIssuerSubuserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户id
  userId: string;
  // 项目id
  projectId: string;
  // 机构id
  institutionId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      projectId: 'project_id',
      institutionId: 'institution_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
      projectId: 'string',
      institutionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntdigitalWebtrwatradeIssuerSubuserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 二级用户信息
  data?: SubUserAccountVO;
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
      data: SubUserAccountVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntdigitalWebtrwatradeDistributorSubuserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户id
  userId: string;
  // 机构id
  institutionId: string;
  // 项目id
  projectId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      institutionId: 'institution_id',
      projectId: 'project_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
      institutionId: 'string',
      projectId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntdigitalWebtrwatradeDistributorSubuserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 二级用户信息
  data?: SubUserAccountVO;
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
      data: SubUserAccountVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAntdigitalWebtrwatradeIssuerOperationlogRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 开始时间 (时间戳)
  startTimeMills: number;
  // 结束时间 (时间戳)
  endTimeMills: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      startTimeMills: 'start_time_mills',
      endTimeMills: 'end_time_mills',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      startTimeMills: 'number',
      endTimeMills: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAntdigitalWebtrwatradeIssuerOperationlogResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 回参
  data?: LoginOperationLogVO[];
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
      data: { 'type': 'array', 'itemType': LoginOperationLogVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAntdigitalWebtrwatradeDistributorOperationlogRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 开始时间 (时间戳)
  startTimeMills: number;
  // 结束时间 (时间戳)
  endTimeMills: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      startTimeMills: 'start_time_mills',
      endTimeMills: 'end_time_mills',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      startTimeMills: 'number',
      endTimeMills: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAntdigitalWebtrwatradeDistributorOperationlogResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 回参
  data?: LoginOperationLogVO[];
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
      data: { 'type': 'array', 'itemType': LoginOperationLogVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAntdigitalWebtrwatradeIssuerCrossaccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资产项目ID
  assetProjectId?: string;
  // 资产项目合约地址
  assetProjectAddress?: string;
  // 项目所在链
  chainName?: string;
  // 用户ID
  userId?: string;
  // 本侧链用户地址
  userAddress?: string;
  // 登录名
  loginName?: string;
  // 登录名类型(EMAIL)
  loginAccountType?: string;
  // 对侧链用户地址
  crossChainUserAddress?: string;
  // 开始时间 (时间戳)
  startTimeMills: number;
  // 结束时间 (时间戳)
  endTimeMills: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      assetProjectId: 'asset_project_id',
      assetProjectAddress: 'asset_project_address',
      chainName: 'chain_name',
      userId: 'user_id',
      userAddress: 'user_address',
      loginName: 'login_name',
      loginAccountType: 'login_account_type',
      crossChainUserAddress: 'cross_chain_user_address',
      startTimeMills: 'start_time_mills',
      endTimeMills: 'end_time_mills',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      assetProjectId: 'string',
      assetProjectAddress: 'string',
      chainName: 'string',
      userId: 'string',
      userAddress: 'string',
      loginName: 'string',
      loginAccountType: 'string',
      crossChainUserAddress: 'string',
      startTimeMills: 'number',
      endTimeMills: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAntdigitalWebtrwatradeIssuerCrossaccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 跨链账号明细
  data?: CrossAccountListVO[];
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
      data: { 'type': 'array', 'itemType': CrossAccountListVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAntdigitalWebtrwatradeDistributorCrossaccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资产项目ID
  assetProjectId?: string;
  // 资产项目合约地址
  assetProjectAddress?: string;
  // 项目所在链
  chainName?: string;
  // 用户ID
  userId?: string;
  // 本侧链用户地址
  userAddress?: string;
  // 登录名
  loginName?: string;
  // 登录名类型(EMAIL)
  loginAccountType?: string;
  // 对侧链用户地址
  crossChainUserAddress?: string;
  // 开始时间 (时间戳)
  startTimeMills: number;
  // 结束时间 (时间戳)
  endTimeMills: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      assetProjectId: 'asset_project_id',
      assetProjectAddress: 'asset_project_address',
      chainName: 'chain_name',
      userId: 'user_id',
      userAddress: 'user_address',
      loginName: 'login_name',
      loginAccountType: 'login_account_type',
      crossChainUserAddress: 'cross_chain_user_address',
      startTimeMills: 'start_time_mills',
      endTimeMills: 'end_time_mills',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      assetProjectId: 'string',
      assetProjectAddress: 'string',
      chainName: 'string',
      userId: 'string',
      userAddress: 'string',
      loginName: 'string',
      loginAccountType: 'string',
      crossChainUserAddress: 'string',
      startTimeMills: 'number',
      endTimeMills: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAntdigitalWebtrwatradeDistributorCrossaccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 跨链账号明细
  data?: CrossAccountListVO[];
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
      data: { 'type': 'array', 'itemType': CrossAccountListVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目id，项目资产ID和
  // 项目合约地址+所在链组合 二选一
  assetProjectId?: string;
  // 资产项目合约地址，项目资产ID和
  // 项目合约地址+所在链组合 二选一
  assetProjectAddress?: string;
  // 所在链，项目资产ID和
  // 项目合约地址+所在链组合 二选一
  chainName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      assetProjectId: 'asset_project_id',
      assetProjectAddress: 'asset_project_address',
      chainName: 'chain_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      assetProjectId: 'string',
      assetProjectAddress: 'string',
      chainName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 项目角色信息
  data?: ProjectWithRole;
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
      data: ProjectWithRole,
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
          sdk_version: "1.0.0",
          _prod_code: "ak_d3c4f09125a14cd587057c405561809a",
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
   * Description: 查询单个二级用户
   * Summary: 查询单个二级用户
   */
  async queryAntdigitalWebtrwatradeIssuerSubuser(request: QueryAntdigitalWebtrwatradeIssuerSubuserRequest): Promise<QueryAntdigitalWebtrwatradeIssuerSubuserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntdigitalWebtrwatradeIssuerSubuserEx(request, headers, runtime);
  }

  /**
   * Description: 查询单个二级用户
   * Summary: 查询单个二级用户
   */
  async queryAntdigitalWebtrwatradeIssuerSubuserEx(request: QueryAntdigitalWebtrwatradeIssuerSubuserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntdigitalWebtrwatradeIssuerSubuserResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntdigitalWebtrwatradeIssuerSubuserResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.subuser.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntdigitalWebtrwatradeIssuerSubuserResponse({}));
  }

  /**
   * Description: 查询单个二级用户
   * Summary: 查询单个二级用户
   */
  async queryAntdigitalWebtrwatradeDistributorSubuser(request: QueryAntdigitalWebtrwatradeDistributorSubuserRequest): Promise<QueryAntdigitalWebtrwatradeDistributorSubuserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntdigitalWebtrwatradeDistributorSubuserEx(request, headers, runtime);
  }

  /**
   * Description: 查询单个二级用户
   * Summary: 查询单个二级用户
   */
  async queryAntdigitalWebtrwatradeDistributorSubuserEx(request: QueryAntdigitalWebtrwatradeDistributorSubuserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntdigitalWebtrwatradeDistributorSubuserResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntdigitalWebtrwatradeDistributorSubuserResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.distributor.subuser.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntdigitalWebtrwatradeDistributorSubuserResponse({}));
  }

  /**
   * Description: 发行机构查询登录登出操作日志
   * Summary: 发行机构查询登录登出操作日志
   */
  async listAntdigitalWebtrwatradeIssuerOperationlog(request: ListAntdigitalWebtrwatradeIssuerOperationlogRequest): Promise<ListAntdigitalWebtrwatradeIssuerOperationlogResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAntdigitalWebtrwatradeIssuerOperationlogEx(request, headers, runtime);
  }

  /**
   * Description: 发行机构查询登录登出操作日志
   * Summary: 发行机构查询登录登出操作日志
   */
  async listAntdigitalWebtrwatradeIssuerOperationlogEx(request: ListAntdigitalWebtrwatradeIssuerOperationlogRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAntdigitalWebtrwatradeIssuerOperationlogResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAntdigitalWebtrwatradeIssuerOperationlogResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.operationlog.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAntdigitalWebtrwatradeIssuerOperationlogResponse({}));
  }

  /**
   * Description: 代销机构查询登录登出操作日志
   * Summary: 代销机构查询登录登出操作日志
   */
  async listAntdigitalWebtrwatradeDistributorOperationlog(request: ListAntdigitalWebtrwatradeDistributorOperationlogRequest): Promise<ListAntdigitalWebtrwatradeDistributorOperationlogResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAntdigitalWebtrwatradeDistributorOperationlogEx(request, headers, runtime);
  }

  /**
   * Description: 代销机构查询登录登出操作日志
   * Summary: 代销机构查询登录登出操作日志
   */
  async listAntdigitalWebtrwatradeDistributorOperationlogEx(request: ListAntdigitalWebtrwatradeDistributorOperationlogRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAntdigitalWebtrwatradeDistributorOperationlogResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAntdigitalWebtrwatradeDistributorOperationlogResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.distributor.operationlog.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAntdigitalWebtrwatradeDistributorOperationlogResponse({}));
  }

  /**
   * Description: 发行机构跨链账号明细
   * Summary: 发行机构跨链账号明细
   */
  async listAntdigitalWebtrwatradeIssuerCrossaccount(request: ListAntdigitalWebtrwatradeIssuerCrossaccountRequest): Promise<ListAntdigitalWebtrwatradeIssuerCrossaccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAntdigitalWebtrwatradeIssuerCrossaccountEx(request, headers, runtime);
  }

  /**
   * Description: 发行机构跨链账号明细
   * Summary: 发行机构跨链账号明细
   */
  async listAntdigitalWebtrwatradeIssuerCrossaccountEx(request: ListAntdigitalWebtrwatradeIssuerCrossaccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAntdigitalWebtrwatradeIssuerCrossaccountResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAntdigitalWebtrwatradeIssuerCrossaccountResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.crossaccount.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAntdigitalWebtrwatradeIssuerCrossaccountResponse({}));
  }

  /**
   * Description: 代销机构跨链账号明细
   * Summary: 代销机构跨链账号明细
   */
  async listAntdigitalWebtrwatradeDistributorCrossaccount(request: ListAntdigitalWebtrwatradeDistributorCrossaccountRequest): Promise<ListAntdigitalWebtrwatradeDistributorCrossaccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAntdigitalWebtrwatradeDistributorCrossaccountEx(request, headers, runtime);
  }

  /**
   * Description: 代销机构跨链账号明细
   * Summary: 代销机构跨链账号明细
   */
  async listAntdigitalWebtrwatradeDistributorCrossaccountEx(request: ListAntdigitalWebtrwatradeDistributorCrossaccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAntdigitalWebtrwatradeDistributorCrossaccountResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAntdigitalWebtrwatradeDistributorCrossaccountResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.distributor.crossaccount.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAntdigitalWebtrwatradeDistributorCrossaccountResponse({}));
  }

  /**
   * Description: 发行机构查询项目及角色信息
   * Summary: 发行机构查询项目及角色信息
   */
  async detailAntdigitalWebtrwatradeIssuerProjectwithrole(request: DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest): Promise<DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailAntdigitalWebtrwatradeIssuerProjectwithroleEx(request, headers, runtime);
  }

  /**
   * Description: 发行机构查询项目及角色信息
   * Summary: 发行机构查询项目及角色信息
   */
  async detailAntdigitalWebtrwatradeIssuerProjectwithroleEx(request: DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.projectwithrole.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse({}));
  }

}
