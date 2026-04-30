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

// 机构联系人信息
export class InstitutionContactInfo extends $tea.Model {
  // 联系人
  contactPerson: string;
  // 联系人邮箱
  contactEmail: string;
  static names(): { [key: string]: string } {
    return {
      contactPerson: 'contact_person',
      contactEmail: 'contact_email',
    };
  }

  static types(): { [key: string]: any } {
    return {
      contactPerson: 'string',
      contactEmail: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 密钥管理项目信息
export class KeyProjectInfo extends $tea.Model {
  // 项目名称
  name: string;
  // key使用类型
  // MINT：发行密钥
  // BURN：赎回密钥
  // TRANSFER：转账密钥
  // MANAGER：管理密钥
  keyType: string;
  // 创建时间
  gmtCreated: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      keyType: 'key_type',
      gmtCreated: 'gmt_created',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      keyType: 'string',
      gmtCreated: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 机构类型
export class InstitutionType extends $tea.Model {
  // 机构类型编码
  // ISSUER/PLATFORM/DISTRIBUTOR
  code: string;
  // 机构类型名称
  //  ISSUER/PLATFORM/DISTRIBUTOR
  name?: string;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      name: 'string',
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
  // 交易类别(LOCK_MINT/BURN_RETRIEVE/INNER_TRANSFER/OTC_TRANSFER)
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

// 用户信息
export class UserInfo extends $tea.Model {
  // 钱包地址
  address: string;
  static names(): { [key: string]: string } {
    return {
      address: 'address',
    };
  }

  static types(): { [key: string]: any } {
    return {
      address: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 登录类型
export class LoginAccountTypeBO extends $tea.Model {
  // 登录类型：EMAIL-邮箱
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
  // 交易类型(LOCK_MINT_BONUS/BURN_RETRIEVE_BONUS/INNER_TRANSFER_BONUS/OTC_TRANSFER_BONUS)
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

// 资产账户明细VO
export class SubUserAccountDetailsVO extends $tea.Model {
  // 明细ID
  id: string;
  // 交易链上Hash
  transactionHash: string;
  // 交易前余额
  preBalance: string;
  // 交易数量
  transactionAmount: string;
  // 交易后余额
  postBalance: string;
  // 交易类别
  transactionType: string;
  // 对手地址
  counterAddress: string;
  // 创建时间
  gmtCreated: number;
  // 更新时间
  gmtModified: number;
  // 交易状态
  transactionStatus: string;
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
      transactionStatus: 'transaction_status',
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
      transactionStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 多币种金额
export class MultiCurrencyMoney extends $tea.Model {
  // 金额，以分为单位
  cent: string;
  // 币种编码
  currency: string;
  // 金额，以元为单位，保留6位小数
  amount: string;
  static names(): { [key: string]: string } {
    return {
      cent: 'cent',
      currency: 'currency',
      amount: 'amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cent: 'string',
      currency: 'string',
      amount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 红利账户明细
export class SubUserBonusAccountDetailVO extends $tea.Model {
  // 明细ID
  id: string;
  // 交易链上Hash
  transactionHash: string;
  // 交易前余额
  preBalance: string;
  // 交易数量
  transactionAmount: string;
  // 交易后余额
  postBalance: string;
  // 交易类别（REPAY/TRANSFER/LOCK/UNLOCK/WITHDRAW/OTC_TRANSFER/TRANSFER_TO_VIRTUAL/WITHDRAW_FROM_VIRTUAL）
  transactionType: string;
  // 对手地址
  counterAddress: string;
  // 创建时间
  gmtCreated: number;
  // 更新时间
  gmtModified: number;
  // 交易状态（PENDING/CONFIRMED/INVALID）
  transactionStatus: string;
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
      transactionStatus: 'transaction_status',
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
      transactionStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 净值信息
export class NetValueInfo extends $tea.Model {
  // 净值
  netValue: string;
  // 币种（目前支持USD、HKD）
  currency: string;
  // 更新时间戳
  updateTime: number;
  static names(): { [key: string]: string } {
    return {
      netValue: 'net_value',
      currency: 'currency',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      netValue: 'string',
      currency: 'string',
      updateTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 密钥详情
export class KeyVO extends $tea.Model {
  // 密钥id
  keyId: string;
  // 密钥名称
  name: string;
  // 创建类型
  // KEY_FILE：上传密钥文件
  // CREATE_NEW_KEY：系统创建密钥
  type: string;
  // 钱包地址
  address: string;
  // 关联项目数量
  quantity: string;
  // 创建时间
  gmtCreated: string;
  // 是否支持删除
  deleteEnable: boolean;
  // 资产项目信息
  assetProjectInfo: KeyProjectInfo;
  static names(): { [key: string]: string } {
    return {
      keyId: 'key_id',
      name: 'name',
      type: 'type',
      address: 'address',
      quantity: 'quantity',
      gmtCreated: 'gmt_created',
      deleteEnable: 'delete_enable',
      assetProjectInfo: 'asset_project_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      keyId: 'string',
      name: 'string',
      type: 'string',
      address: 'string',
      quantity: 'string',
      gmtCreated: 'string',
      deleteEnable: 'boolean',
      assetProjectInfo: KeyProjectInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 机构详情
export class InstitutionVO extends $tea.Model {
  // 机构id
  id: string;
  // 机构名称
  name: string;
  // 简介
  about?: string;
  // 主页
  homePage?: string;
  // 联系人信息
  contacts?: InstitutionContactInfo[];
  // 机构类型
  types: InstitutionType[];
  // 机构用户信息
  users?: UserInfo[];
  // 是否支持删除
  deleteEnable?: boolean;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      about: 'about',
      homePage: 'home_page',
      contacts: 'contacts',
      types: 'types',
      users: 'users',
      deleteEnable: 'delete_enable',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      about: 'string',
      homePage: 'string',
      contacts: { 'type': 'array', 'itemType': InstitutionContactInfo },
      types: { 'type': 'array', 'itemType': InstitutionType },
      users: { 'type': 'array', 'itemType': UserInfo },
      deleteEnable: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 资产项目密钥
export class AssetProjectKey extends $tea.Model {
  // 项目ID
  projectId: string;
  // 项目名称
  projectName: string;
  // 密钥类型(MINT:发行密钥；BURN：赎回密钥；TRANSFER：转账密钥；MANAGER：管理密钥)
  keyType: string;
  // 密钥ID
  keyId: string;
  // 密钥名称
  keyName: string;
  // 密钥地址
  keyAddress: string;
  // 关联时间戳
  correlationTime: number;
  static names(): { [key: string]: string } {
    return {
      projectId: 'project_id',
      projectName: 'project_name',
      keyType: 'key_type',
      keyId: 'key_id',
      keyName: 'key_name',
      keyAddress: 'key_address',
      correlationTime: 'correlation_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      projectId: 'string',
      projectName: 'string',
      keyType: 'string',
      keyId: 'string',
      keyName: 'string',
      keyAddress: 'string',
      correlationTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 虚拟子账户明细
export class SubUserVirtualAccountDetailVO extends $tea.Model {
  // 明细ID
  id?: string;
  // 交易前余额
  preBalance?: string;
  // 交易数量
  transactionAmount?: string;
  // 交易后余额
  postBalance?: string;
  // 交易类型(TRANSFER_IN、TRANSFER_OUT)
  transactionType?: string;
  // 创建时间
  gmtCreated?: number;
  // 更新时间
  gmtModified?: number;
  // 交易状态（PENDING/CONFIRMED/INVALID）
  transactionStatus?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      preBalance: 'pre_balance',
      transactionAmount: 'transaction_amount',
      postBalance: 'post_balance',
      transactionType: 'transaction_type',
      gmtCreated: 'gmt_created',
      gmtModified: 'gmt_modified',
      transactionStatus: 'transaction_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      preBalance: 'string',
      transactionAmount: 'string',
      postBalance: 'string',
      transactionType: 'string',
      gmtCreated: 'number',
      gmtModified: 'number',
      transactionStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 虚拟子账户红利明细
export class SubUserBonusVirtualAccountDetailVO extends $tea.Model {
  // 明细ID
  id?: string;
  // 交易前余额
  preBalance?: string;
  // 交易数量
  transactionAmount?: string;
  // 交易后余额
  postBalance?: string;
  // 交易类型(TRANSFER_IN、TRANSFER_OUT)
  transactionType?: string;
  // 创建时间
  gmtCreated?: number;
  // 更新时间
  gmtModified?: number;
  // 交易状态（PENDING/CONFIRMED/INVALID）
  transactionStatus?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      preBalance: 'pre_balance',
      transactionAmount: 'transaction_amount',
      postBalance: 'post_balance',
      transactionType: 'transaction_type',
      gmtCreated: 'gmt_created',
      gmtModified: 'gmt_modified',
      transactionStatus: 'transaction_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      preBalance: 'string',
      transactionAmount: 'string',
      postBalance: 'string',
      transactionType: 'string',
      gmtCreated: 'number',
      gmtModified: 'number',
      transactionStatus: 'string',
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

// 虚拟子账号信息
export class SubUserVirtualAccountInfoBO extends $tea.Model {
  // 虚拟子账户ID
  subUserVirtualAccountId?: string;
  // 虚拟子账号对应用户ID
  virtualAccountUserId?: string;
  // 虚拟子账户邮箱
  email?: string;
  // 别名
  alias?: string;
  static names(): { [key: string]: string } {
    return {
      subUserVirtualAccountId: 'sub_user_virtual_account_id',
      virtualAccountUserId: 'virtual_account_user_id',
      email: 'email',
      alias: 'alias',
    };
  }

  static types(): { [key: string]: any } {
    return {
      subUserVirtualAccountId: 'string',
      virtualAccountUserId: 'string',
      email: 'string',
      alias: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 密钥信息
export class KeyInfo extends $tea.Model {
  // 密钥ID
  keyId: string;
  // 密钥名称
  keyName: string;
  // 密钥地址
  keyAddress: string;
  // 密钥类型(MINT：发行密钥；BURN：赎回密钥；TRANSFER：转账密钥；MANAGER：管理密钥)
  keyType: string;
  static names(): { [key: string]: string } {
    return {
      keyId: 'key_id',
      keyName: 'key_name',
      keyAddress: 'key_address',
      keyType: 'key_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      keyId: 'string',
      keyName: 'string',
      keyAddress: 'string',
      keyType: 'string',
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

// 跨链账户信息
export class CrossChainAccountsVO extends $tea.Model {
  // 对侧链用户地址
  targetUserAddress?: string;
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
      targetUserAddress: 'target_user_address',
      crossChainUserAccountId: 'cross_chain_user_account_id',
      crossChainUserBonusAccountId: 'cross_chain_user_bonus_account_id',
      crossChainUserAccountsDetails: 'cross_chain_user_accounts_details',
      crossChainBonusAccountsDetails: 'cross_chain_bonus_accounts_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      targetUserAddress: 'string',
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

// 资产项目信息
export class AssetProject extends $tea.Model {
  // 项目ID
  projectId: string;
  // 项目名称
  name: string;
  // 项目代币名称
  tokenName: string;
  // 项目介绍
  info: string;
  // 当前供应量
  supply: string;
  // 最大供应量
  capacity: string;
  // 供应量比例(supply/capacity * 100，保留2位小数)
  radio: number;
  // 持有人数量
  userNumber: number;
  // 资产token合约地址
  assetTokenAddress: string;
  // 资产规则引擎合约地址
  ruleEngineAddress: string;
  // 资产白名单合约地址
  memberListRuleAddress: string;
  // 项目状态(ACTIVE：激活；PAUSED：暂停)
  status: string;
  // 项目净值
  netValue: string;
  // 项目币种(目前支持USD、HKD)
  currency: string;
  // 项目创建时间戳
  gmtCreated: number;
  // 项目修改时间戳
  gmtModified: number;
  static names(): { [key: string]: string } {
    return {
      projectId: 'project_id',
      name: 'name',
      tokenName: 'token_name',
      info: 'info',
      supply: 'supply',
      capacity: 'capacity',
      radio: 'radio',
      userNumber: 'user_number',
      assetTokenAddress: 'asset_token_address',
      ruleEngineAddress: 'rule_engine_address',
      memberListRuleAddress: 'member_list_rule_address',
      status: 'status',
      netValue: 'net_value',
      currency: 'currency',
      gmtCreated: 'gmt_created',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      projectId: 'string',
      name: 'string',
      tokenName: 'string',
      info: 'string',
      supply: 'string',
      capacity: 'string',
      radio: 'number',
      userNumber: 'number',
      assetTokenAddress: 'string',
      ruleEngineAddress: 'string',
      memberListRuleAddress: 'string',
      status: 'string',
      netValue: 'string',
      currency: 'string',
      gmtCreated: 'number',
      gmtModified: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 跨链账号信息
export class CrossChainSubUserAccountInfoBO extends $tea.Model {
  // 跨链账号Id
  crossChainUserAccountId?: string;
  // 跨链账号地址
  targetUserAddress?: string;
  // 目标链所在链
  targetChainName?: string;
  static names(): { [key: string]: string } {
    return {
      crossChainUserAccountId: 'cross_chain_user_account_id',
      targetUserAddress: 'target_user_address',
      targetChainName: 'target_chain_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      crossChainUserAccountId: 'string',
      targetUserAddress: 'string',
      targetChainName: 'string',
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

// 项目报告
export class ReportInfo extends $tea.Model {
  // 项目报告ID
  reportId: string;
  // 项目报告名
  reportName: string;
  // 报告文件ID
  fileId: string;
  // 项目报告创建时间戳
  gmtCreated: number;
  static names(): { [key: string]: string } {
    return {
      reportId: 'report_id',
      reportName: 'report_name',
      fileId: 'file_id',
      gmtCreated: 'gmt_created',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reportId: 'string',
      reportName: 'string',
      fileId: 'string',
      gmtCreated: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 错误信息
export class ErrorMessage extends $tea.Model {
  // 错误码
  displayedCode?: string;
  // 错误描述
  displayedMessage?: string;
  static names(): { [key: string]: string } {
    return {
      displayedCode: 'displayed_code',
      displayedMessage: 'displayed_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      displayedCode: 'string',
      displayedMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 项目资源
export class ProjectResource extends $tea.Model {
  // 资源ID
  id: string;
  // 项目ID
  projectId: string;
  // 资源类型（目前只有PROJECT_REPORT）
  resourceType: string;
  // 资源名称
  resourceName: string;
  // 文件ID
  fileId: string;
  // 创建时间戳
  gmtCreated: number;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      projectId: 'project_id',
      resourceType: 'resource_type',
      resourceName: 'resource_name',
      fileId: 'file_id',
      gmtCreated: 'gmt_created',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      projectId: 'string',
      resourceType: 'string',
      resourceName: 'string',
      fileId: 'string',
      gmtCreated: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 所有系统操作日志
export class OperationLogVO extends $tea.Model {
  // ID主键
  id: string;
  // 创建时间戳（毫秒）
  gmtCreated?: number;
  // 更新时间戳（毫秒）
  gmtModified?: number;
  // 用户id
  userId?: string;
  // 用户地址
  userAddress?: string;
  // 发起操作的URL接口
  requestUrl?: string;
  // 发起操作的URL接口描述code值
  apiDesc?: string;
  // 发起操作的URL接口中文描述
  chDesc?: string;
  // 设备信息
  deviceInfo?: string;
  // 设备Hash
  deviceHash?: string;
  // 操作种类
  operationType?: string;
  // 请求输入
  requestInput?: string;
  // 请求输出
  requestOutput?: string;
  // 操作状态：true/false
  success?: boolean;
  // 操作来源
  requestFrom?: string;
  // 发起IP地址
  ip?: string;
  // 扩展字段
  extInfo?: string;
  // 登录名类型(EMAIL)
  loginAccountType?: string;
  // 登录名
  loginAccount?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      gmtCreated: 'gmt_created',
      gmtModified: 'gmt_modified',
      userId: 'user_id',
      userAddress: 'user_address',
      requestUrl: 'request_url',
      apiDesc: 'api_desc',
      chDesc: 'ch_desc',
      deviceInfo: 'device_info',
      deviceHash: 'device_hash',
      operationType: 'operation_type',
      requestInput: 'request_input',
      requestOutput: 'request_output',
      success: 'success',
      requestFrom: 'request_from',
      ip: 'ip',
      extInfo: 'ext_info',
      loginAccountType: 'login_account_type',
      loginAccount: 'login_account',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      gmtCreated: 'number',
      gmtModified: 'number',
      userId: 'string',
      userAddress: 'string',
      requestUrl: 'string',
      apiDesc: 'string',
      chDesc: 'string',
      deviceInfo: 'string',
      deviceHash: 'string',
      operationType: 'string',
      requestInput: 'string',
      requestOutput: 'string',
      success: 'boolean',
      requestFrom: 'string',
      ip: 'string',
      extInfo: 'string',
      loginAccountType: 'string',
      loginAccount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 二级用户基础信息
export class SubUserAccountBaseVO extends $tea.Model {
  // 二级用户ID
  subUserAccountId: string;
  // 用户地址
  userAddress?: string;
  // 用户邮箱
  contact?: string;
  // 用户昵称
  alias?: string;
  // 项目ID
  assetProjectId: string;
  // 链名称
  chainName: string;
  // 虚拟子账号信息
  subUserVirtualAccountsInfo?: SubUserVirtualAccountInfoBO[];
  // 跨链账号信息
  crossChainSubUserAccountsInfo?: CrossChainSubUserAccountInfoBO[];
  static names(): { [key: string]: string } {
    return {
      subUserAccountId: 'sub_user_account_id',
      userAddress: 'user_address',
      contact: 'contact',
      alias: 'alias',
      assetProjectId: 'asset_project_id',
      chainName: 'chain_name',
      subUserVirtualAccountsInfo: 'sub_user_virtual_accounts_info',
      crossChainSubUserAccountsInfo: 'cross_chain_sub_user_accounts_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      subUserAccountId: 'string',
      userAddress: 'string',
      contact: 'string',
      alias: 'string',
      assetProjectId: 'string',
      chainName: 'string',
      subUserVirtualAccountsInfo: { 'type': 'array', 'itemType': SubUserVirtualAccountInfoBO },
      crossChainSubUserAccountsInfo: { 'type': 'array', 'itemType': CrossChainSubUserAccountInfoBO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 机构分页信息
export class InstitutionPageData extends $tea.Model {
  // 总记录
  total: number;
  // 总页数
  pageCount: number;
  // 当前页码
  pageNum: number;
  // 每页数量
  pageSize: number;
  // 机构列表
  records: InstitutionVO[];
  static names(): { [key: string]: string } {
    return {
      total: 'total',
      pageCount: 'page_count',
      pageNum: 'page_num',
      pageSize: 'page_size',
      records: 'records',
    };
  }

  static types(): { [key: string]: any } {
    return {
      total: 'number',
      pageCount: 'number',
      pageNum: 'number',
      pageSize: 'number',
      records: { 'type': 'array', 'itemType': InstitutionVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 总览历史数据统计项
export class DataSummaryStatisticsItem extends $tea.Model {
  // 日期
  date: string;
  // 原始币种资产价值
  totalValueList: MultiCurrencyMoney[];
  static names(): { [key: string]: string } {
    return {
      date: 'date',
      totalValueList: 'total_value_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      date: 'string',
      totalValueList: { 'type': 'array', 'itemType': MultiCurrencyMoney },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 本侧链持币情况
export class SubUserAccountCeilingBaseVO extends $tea.Model {
  // 项目ID
  assetProjectId?: string;
  // 代币名称
  tokenName?: string;
  // 代币合约地址
  tokenAddress?: string;
  // 用户ID
  userId?: string;
  // 用户地址
  userAddress?: string;
  // 登录名
  loginName?: string;
  // 登录类型
  loginType?: string;
  // 别名
  alias?: string;
  // 实际持有份额
  realShares?: string;
  // 代币名称
  bonusTokenName?: string;
  // 代币合约名称
  bonusTokenAddress?: string;
  // 红利份额
  realBonus?: string;
  // 锁定金额
  lockedAmount?: string;
  // 虚拟子账户余额
  virtualAccountBalance?: string;
  static names(): { [key: string]: string } {
    return {
      assetProjectId: 'asset_project_id',
      tokenName: 'token_name',
      tokenAddress: 'token_address',
      userId: 'user_id',
      userAddress: 'user_address',
      loginName: 'login_name',
      loginType: 'login_type',
      alias: 'alias',
      realShares: 'real_shares',
      bonusTokenName: 'bonus_token_name',
      bonusTokenAddress: 'bonus_token_address',
      realBonus: 'real_bonus',
      lockedAmount: 'locked_amount',
      virtualAccountBalance: 'virtual_account_balance',
    };
  }

  static types(): { [key: string]: any } {
    return {
      assetProjectId: 'string',
      tokenName: 'string',
      tokenAddress: 'string',
      userId: 'string',
      userAddress: 'string',
      loginName: 'string',
      loginType: 'string',
      alias: 'string',
      realShares: 'string',
      bonusTokenName: 'string',
      bonusTokenAddress: 'string',
      realBonus: 'string',
      lockedAmount: 'string',
      virtualAccountBalance: 'string',
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
  // 价格类型：PROJECT_NAV 项目净值 TOKEN_PRICE token
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
  // 项目代币名称
  tokenName?: string;
  // 项目代币符号
  tokenSymbol?: string;
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
      tokenName: 'token_name',
      tokenSymbol: 'token_symbol',
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
      tokenName: 'string',
      tokenSymbol: 'string',
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

// 密钥分页列表
export class KeyPageData extends $tea.Model {
  // 总记录
  total: number;
  // 总页数
  pageCount: number;
  // 当前页码
  pageNum: number;
  // 每页数量
  pageSize: number;
  // 密钥列表
  records: KeyVO[];
  static names(): { [key: string]: string } {
    return {
      total: 'total',
      pageCount: 'page_count',
      pageNum: 'page_num',
      pageSize: 'page_size',
      records: 'records',
    };
  }

  static types(): { [key: string]: any } {
    return {
      total: 'number',
      pageCount: 'number',
      pageNum: 'number',
      pageSize: 'number',
      records: { 'type': 'array', 'itemType': KeyVO },
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

// 资产账户明细与红利账户明细
export class SubUserAccountDetailVO extends $tea.Model {
  // 项目ID
  projectId: string;
  // 资产项目合约地址
  assetProjectAddress?: string;
  // 红利合约地址
  bonusAddress?: string;
  // 用户ID
  userId?: string;
  // 代销机构ID
  distributorInstitutionId?: string;
  // 项目代币名称
  tokenName?: string;
  // 项目代币符号
  tokenSymbol?: string;
  // 发行链名称
  chainName?: string;
  // 投资者用户账户ID
  subUserAccountId?: string;
  // 投资者用户红利账户ID
  subUserBonusAccountId?: string;
  // 资产账户明细
  subUserAccountDetails?: SubUserAccountDetailsVO[];
  // 红利账户明细
  subUserBonusAccountDetails?: SubUserBonusAccountDetailVO[];
  static names(): { [key: string]: string } {
    return {
      projectId: 'project_id',
      assetProjectAddress: 'asset_project_address',
      bonusAddress: 'bonus_address',
      userId: 'user_id',
      distributorInstitutionId: 'distributor_institution_id',
      tokenName: 'token_name',
      tokenSymbol: 'token_symbol',
      chainName: 'chain_name',
      subUserAccountId: 'sub_user_account_id',
      subUserBonusAccountId: 'sub_user_bonus_account_id',
      subUserAccountDetails: 'sub_user_account_details',
      subUserBonusAccountDetails: 'sub_user_bonus_account_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      projectId: 'string',
      assetProjectAddress: 'string',
      bonusAddress: 'string',
      userId: 'string',
      distributorInstitutionId: 'string',
      tokenName: 'string',
      tokenSymbol: 'string',
      chainName: 'string',
      subUserAccountId: 'string',
      subUserBonusAccountId: 'string',
      subUserAccountDetails: { 'type': 'array', 'itemType': SubUserAccountDetailsVO },
      subUserBonusAccountDetails: { 'type': 'array', 'itemType': SubUserBonusAccountDetailVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 支持结算方式信息
export class SupportedSettlementMethodInfo extends $tea.Model {
  // 结算方式枚举：TD或TT
  settlementMethodEnum?: string;
  // 结算银行账户id
  relatedSettlementAccountId?: string;
  static names(): { [key: string]: string } {
    return {
      settlementMethodEnum: 'settlement_method_enum',
      relatedSettlementAccountId: 'related_settlement_account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      settlementMethodEnum: 'string',
      relatedSettlementAccountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 总览统计数据
export class DataSummaryTotal extends $tea.Model {
  // 原始币种资产价值列表
  totalValueList: MultiCurrencyMoney[];
  // 总项目数
  totalProjects: number;
  // 总用户数
  totalHolders: number;
  // 最后更新时间戳
  lastUpdatedTime: number;
  static names(): { [key: string]: string } {
    return {
      totalValueList: 'total_value_list',
      totalProjects: 'total_projects',
      totalHolders: 'total_holders',
      lastUpdatedTime: 'last_updated_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      totalValueList: { 'type': 'array', 'itemType': MultiCurrencyMoney },
      totalProjects: 'number',
      totalHolders: 'number',
      lastUpdatedTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 资产项目详情
export class AssetProjectDetail extends $tea.Model {
  // 项目参与的代销机构列表
  participantInfos: ParticipantInfo[];
  // 发行密钥列表
  mintKeys: KeyInfo[];
  // 赎回密钥列表
  burnKeys: KeyInfo[];
  // 转账密钥列表
  transferKeys: KeyInfo[];
  // 管理密钥列表
  managerKeys: KeyInfo[];
  // 历史净值列表
  historyNetValueList: NetValueInfo[];
  // 项目报告列表
  reportList: ReportInfo[];
  // 项目ID
  projectId: string;
  // 项目名称
  name: string;
  // 项目代币名称
  tokenName: string;
  // 项目介绍
  info: string;
  // 项目描述(markdown格式)
  description?: string;
  // 当前供应量
  supply: string;
  // 最大供应量
  capacity: string;
  // 供应量比例(supply/capacity * 100，保留2位小数）
  radio: number;
  // 持有人数量
  userNumber: number;
  // 资产token合约地址
  assetTokenAddress: string;
  // 资产规则引擎合约地址
  ruleEngineAddress: string;
  // 资产白名单合约地址
  memberListRuleAddress: string;
  // 项目状态(ACTIVE：激活；PAUSED：暂停)
  status: string;
  // 项目净值
  netValue: string;
  // 项目币种(目前支持USD、HKD)
  currency: string;
  // 项目创建时间戳
  gmtCreated: string;
  // 项目修改时间戳
  gmtModified: string;
  static names(): { [key: string]: string } {
    return {
      participantInfos: 'participant_infos',
      mintKeys: 'mint_keys',
      burnKeys: 'burn_keys',
      transferKeys: 'transfer_keys',
      managerKeys: 'manager_keys',
      historyNetValueList: 'history_net_value_list',
      reportList: 'report_list',
      projectId: 'project_id',
      name: 'name',
      tokenName: 'token_name',
      info: 'info',
      description: 'description',
      supply: 'supply',
      capacity: 'capacity',
      radio: 'radio',
      userNumber: 'user_number',
      assetTokenAddress: 'asset_token_address',
      ruleEngineAddress: 'rule_engine_address',
      memberListRuleAddress: 'member_list_rule_address',
      status: 'status',
      netValue: 'net_value',
      currency: 'currency',
      gmtCreated: 'gmt_created',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      participantInfos: { 'type': 'array', 'itemType': ParticipantInfo },
      mintKeys: { 'type': 'array', 'itemType': KeyInfo },
      burnKeys: { 'type': 'array', 'itemType': KeyInfo },
      transferKeys: { 'type': 'array', 'itemType': KeyInfo },
      managerKeys: { 'type': 'array', 'itemType': KeyInfo },
      historyNetValueList: { 'type': 'array', 'itemType': NetValueInfo },
      reportList: { 'type': 'array', 'itemType': ReportInfo },
      projectId: 'string',
      name: 'string',
      tokenName: 'string',
      info: 'string',
      description: 'string',
      supply: 'string',
      capacity: 'string',
      radio: 'number',
      userNumber: 'number',
      assetTokenAddress: 'string',
      ruleEngineAddress: 'string',
      memberListRuleAddress: 'string',
      status: 'string',
      netValue: 'string',
      currency: 'string',
      gmtCreated: 'string',
      gmtModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 资产项目净值
export class ProjectPerformance extends $tea.Model {
  // 项目ID
  projectId: string;
  // 项目净值
  netValue: string;
  // 币种(目前支持USD、HKD)
  currency: string;
  // 净值更新时间戳
  updateTime: number;
  static names(): { [key: string]: string } {
    return {
      projectId: 'project_id',
      netValue: 'net_value',
      currency: 'currency',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      projectId: 'string',
      netValue: 'string',
      currency: 'string',
      updateTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 虚拟子账号明细与红利明细
export class SubUserVirtualAccountListVO extends $tea.Model {
  // 项目ID
  assetProjectId?: string;
  // 资产项目合约地址
  assetProjectAddress?: string;
  // 红利合约地址
  bonusAddress?: string;
  // 用户ID
  userId?: string;
  // 代销机构ID
  distributorInstitutionId?: string;
  // 链名
  chainName?: string;
  // 投资者用户账户ID
  subUserAccountId?: string;
  // 虚拟子账户ID
  subUserVirtualAccountId?: string;
  // 虚拟子账户红利账户ID
  subUserBonusVirtualAccountId?: string;
  // 虚拟子账户明细
  subUserVirtualAccountDetails?: SubUserVirtualAccountDetailVO[];
  // 虚拟子账户红利明细
  subUserBonusVirtualAccountDetails?: SubUserBonusVirtualAccountDetailVO[];
  static names(): { [key: string]: string } {
    return {
      assetProjectId: 'asset_project_id',
      assetProjectAddress: 'asset_project_address',
      bonusAddress: 'bonus_address',
      userId: 'user_id',
      distributorInstitutionId: 'distributor_institution_id',
      chainName: 'chain_name',
      subUserAccountId: 'sub_user_account_id',
      subUserVirtualAccountId: 'sub_user_virtual_account_id',
      subUserBonusVirtualAccountId: 'sub_user_bonus_virtual_account_id',
      subUserVirtualAccountDetails: 'sub_user_virtual_account_details',
      subUserBonusVirtualAccountDetails: 'sub_user_bonus_virtual_account_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      assetProjectId: 'string',
      assetProjectAddress: 'string',
      bonusAddress: 'string',
      userId: 'string',
      distributorInstitutionId: 'string',
      chainName: 'string',
      subUserAccountId: 'string',
      subUserVirtualAccountId: 'string',
      subUserBonusVirtualAccountId: 'string',
      subUserVirtualAccountDetails: { 'type': 'array', 'itemType': SubUserVirtualAccountDetailVO },
      subUserBonusVirtualAccountDetails: { 'type': 'array', 'itemType': SubUserBonusVirtualAccountDetailVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 项目分页信息
export class ProjectPageData extends $tea.Model {
  // 总记录数
  total: number;
  // 总页数
  pageCount: number;
  // 当前页码
  pageNum: number;
  // 每页数量
  pageSize: number;
  // 项目列表
  records: AssetProject[];
  static names(): { [key: string]: string } {
    return {
      total: 'total',
      pageCount: 'page_count',
      pageNum: 'page_num',
      pageSize: 'page_size',
      records: 'records',
    };
  }

  static types(): { [key: string]: any } {
    return {
      total: 'number',
      pageCount: 'number',
      pageNum: 'number',
      pageSize: 'number',
      records: { 'type': 'array', 'itemType': AssetProject },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 二级用户列表
export class SubUserAccountPageData extends $tea.Model {
  // 总记录
  total: number;
  // 总页数
  pageCount: number;
  // 当前页码
  pageNum: number;
  // 每页数量
  pageSize: number;
  // 二级用户列表
  records: SubUserAccountVO[];
  static names(): { [key: string]: string } {
    return {
      total: 'total',
      pageCount: 'page_count',
      pageNum: 'page_num',
      pageSize: 'page_size',
      records: 'records',
    };
  }

  static types(): { [key: string]: any } {
    return {
      total: 'number',
      pageCount: 'number',
      pageNum: 'number',
      pageSize: 'number',
      records: { 'type': 'array', 'itemType': SubUserAccountVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 对侧链持币情况
export class CrossChainSubUserAccountCeilingBaseVO extends $tea.Model {
  // 项目ID
  assetProjectId?: string;
  // 代币名称
  tokenName?: string;
  // 代币合约地址
  tokenAddress?: string;
  // 别名
  alias?: string;
  // 实际持有份额
  realShares?: string;
  // 代币名称
  bonusTokenName?: string;
  // 代币合约名称
  bonusTokenAddress?: string;
  // 红利份额
  realBonus?: string;
  // 目标链
  tagetChainType?: string;
  // 目标链用户地址
  targetUserAddress?: string;
  static names(): { [key: string]: string } {
    return {
      assetProjectId: 'asset_project_id',
      tokenName: 'token_name',
      tokenAddress: 'token_address',
      alias: 'alias',
      realShares: 'real_shares',
      bonusTokenName: 'bonus_token_name',
      bonusTokenAddress: 'bonus_token_address',
      realBonus: 'real_bonus',
      tagetChainType: 'taget_chain_type',
      targetUserAddress: 'target_user_address',
    };
  }

  static types(): { [key: string]: any } {
    return {
      assetProjectId: 'string',
      tokenName: 'string',
      tokenAddress: 'string',
      alias: 'string',
      realShares: 'string',
      bonusTokenName: 'string',
      bonusTokenAddress: 'string',
      realBonus: 'string',
      tagetChainType: 'string',
      targetUserAddress: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// APIKEY试图对象
export class ApiKey extends $tea.Model {
  // 主键
  id: string;
  // AK
  token: string;
  // SK(或公钥)
  secret: string;
  // 创建日期
  gmtCreated: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      token: 'token',
      secret: 'secret',
      gmtCreated: 'gmt_created',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      token: 'string',
      secret: 'string',
      gmtCreated: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 项目基础信息
export class ProjectBaseInfoVO extends $tea.Model {
  // 项目id
  projectId: string;
  // 资产项目合约地址
  // （Launch Network/Shares token ）
  assetProjectAddress?: string;
  // 项目名称
  projectName?: string;
  // 描述
  description?: string;
  // 项目状态
  projectStatus?: string;
  // 项目所在链（Launch Network）
  chainType?: string;
  // 代币名称
  tokenName?: string;
  // 项目代币符号
  tokenSymbol?: string;
  // 总发行量
  capacity?: string;
  // 单钱包最大可持有份额
  maxSubscriptionAmount?: string;
  // 创建时间戳（毫秒）
  gmtCreated?: number;
  static names(): { [key: string]: string } {
    return {
      projectId: 'project_id',
      assetProjectAddress: 'asset_project_address',
      projectName: 'project_name',
      description: 'description',
      projectStatus: 'project_status',
      chainType: 'chain_type',
      tokenName: 'token_name',
      tokenSymbol: 'token_symbol',
      capacity: 'capacity',
      maxSubscriptionAmount: 'max_subscription_amount',
      gmtCreated: 'gmt_created',
    };
  }

  static types(): { [key: string]: any } {
    return {
      projectId: 'string',
      assetProjectAddress: 'string',
      projectName: 'string',
      description: 'string',
      projectStatus: 'string',
      chainType: 'string',
      tokenName: 'string',
      tokenSymbol: 'string',
      capacity: 'string',
      maxSubscriptionAmount: 'string',
      gmtCreated: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 项目密钥分页数据
export class ProjectKeyPageData extends $tea.Model {
  // 总记录数
  total: number;
  // 总页数
  pageCount: number;
  // 当前页码
  pageNum: number;
  // 每页数量
  pageSize: number;
  // 项目密钥列表
  records: AssetProjectKey[];
  static names(): { [key: string]: string } {
    return {
      total: 'total',
      pageCount: 'page_count',
      pageNum: 'page_num',
      pageSize: 'page_size',
      records: 'records',
    };
  }

  static types(): { [key: string]: any } {
    return {
      total: 'number',
      pageCount: 'number',
      pageNum: 'number',
      pageSize: 'number',
      records: { 'type': 'array', 'itemType': AssetProjectKey },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HoldassetAntdigitalWebtrwatradeFundchannelTxnRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // jetco生成的ID,由第一个指示代理分配的唯一标识，用于明确标识在整个银行间链中传递的、不变的交易
  e2eId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      e2eId: 'e2e_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      e2eId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class HoldassetAntdigitalWebtrwatradeFundchannelTxnResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 成功
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

export class PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // jetco生成的ID,由第一个指示代理分配的唯一标识，用于明确标识在整个银行间链中传递的、不变的交易
  e2eId: string;
  // 支付状态
  status: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      e2eId: 'e2e_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      e2eId: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 调用成功
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

export class ReleaseassetAntdigitalWebtrwatradeFundchannelTxnRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // jetco生成的ID,由第一个指示代理分配的唯一标识，用于明确标识在整个银行间链中传递的、不变的交易。
  e2eId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      e2eId: 'e2e_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      e2eId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReleaseassetAntdigitalWebtrwatradeFundchannelTxnResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 成功
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
          sdk_version: "1.0.5",
          _prod_code: "DTRWA",
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
   * Description: 资产锁定
   * Summary: 资产锁定
   */
  async holdassetAntdigitalWebtrwatradeFundchannelTxn(request: HoldassetAntdigitalWebtrwatradeFundchannelTxnRequest): Promise<HoldassetAntdigitalWebtrwatradeFundchannelTxnResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.holdassetAntdigitalWebtrwatradeFundchannelTxnEx(request, headers, runtime);
  }

  /**
   * Description: 资产锁定
   * Summary: 资产锁定
   */
  async holdassetAntdigitalWebtrwatradeFundchannelTxnEx(request: HoldassetAntdigitalWebtrwatradeFundchannelTxnRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<HoldassetAntdigitalWebtrwatradeFundchannelTxnResponse> {
    Util.validateModel(request);
    return $tea.cast<HoldassetAntdigitalWebtrwatradeFundchannelTxnResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.fundchannel.txn.holdasset", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new HoldassetAntdigitalWebtrwatradeFundchannelTxnResponse({}));
  }

  /**
   * Description: 通知支付结果接口
   * Summary: 通知支付结果接口
   */
  async paymentnotificationAntdigitalWebtrwatradeFundchannelTxn(request: PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest): Promise<PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.paymentnotificationAntdigitalWebtrwatradeFundchannelTxnEx(request, headers, runtime);
  }

  /**
   * Description: 通知支付结果接口
   * Summary: 通知支付结果接口
   */
  async paymentnotificationAntdigitalWebtrwatradeFundchannelTxnEx(request: PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnResponse> {
    Util.validateModel(request);
    return $tea.cast<PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.fundchannel.txn.paymentnotification", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PaymentnotificationAntdigitalWebtrwatradeFundchannelTxnResponse({}));
  }

  /**
   * Description: 释放资产
   * Summary: 释放资产
   */
  async releaseassetAntdigitalWebtrwatradeFundchannelTxn(request: ReleaseassetAntdigitalWebtrwatradeFundchannelTxnRequest): Promise<ReleaseassetAntdigitalWebtrwatradeFundchannelTxnResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.releaseassetAntdigitalWebtrwatradeFundchannelTxnEx(request, headers, runtime);
  }

  /**
   * Description: 释放资产
   * Summary: 释放资产
   */
  async releaseassetAntdigitalWebtrwatradeFundchannelTxnEx(request: ReleaseassetAntdigitalWebtrwatradeFundchannelTxnRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReleaseassetAntdigitalWebtrwatradeFundchannelTxnResponse> {
    Util.validateModel(request);
    return $tea.cast<ReleaseassetAntdigitalWebtrwatradeFundchannelTxnResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.fundchannel.txn.releaseasset", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReleaseassetAntdigitalWebtrwatradeFundchannelTxnResponse({}));
  }

}
