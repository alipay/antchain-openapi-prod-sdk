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
  gmtModified: string;
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
      gmtModified: 'string',
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
  // 交易类别
  transactionType: string;
  // 对手地址
  counterAddress: string;
  // 创建时间
  gmtCreated: number;
  // 更新时间
  gmtModified: number;
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

export class CreateIssuerProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目名称
  name: string;
  // 项目名称
  info: string;
  // 项目描述(markdown格式)
  description?: string;
  // 代币名称
  tokenName: string;
  // 最大供应量
  capacity: string;
  // 净值
  netValue?: string;
  // 币种(目前支持USD、HKD、CNY)
  currency: string;
  // 项目参与者列表(代销机构，最多3个)
  participants: ParticipantInfo[];
  // 发行密钥ID列表(最多3个)
  mintKeys: string[];
  // 赎回密钥ID列表(最多3个)
  burnKeys: string[];
  // 转账密钥ID列表(最多3个)
  transferKeys: string[];
  // 管理密钥ID列表(最多3个)
  managerKeys: string[];
  // 项目封面文件id
  projectCoverFileId: string;
  // 是否限购
  maxSubscriptionLimited: boolean;
  // 最大可认购份额
  maxSubscriptionAmount: string;
  // 项目支持的结算方式
  settlementMethods: SupportedSettlementMethodInfo[];
  // crossChain
  crossChain: boolean;
  // 目标链名称列表（跨链项目必填）
  targetChainNameList?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      info: 'info',
      description: 'description',
      tokenName: 'token_name',
      capacity: 'capacity',
      netValue: 'net_value',
      currency: 'currency',
      participants: 'participants',
      mintKeys: 'mint_keys',
      burnKeys: 'burn_keys',
      transferKeys: 'transfer_keys',
      managerKeys: 'manager_keys',
      projectCoverFileId: 'project_cover_file_id',
      maxSubscriptionLimited: 'max_subscription_limited',
      maxSubscriptionAmount: 'max_subscription_amount',
      settlementMethods: 'settlement_methods',
      crossChain: 'cross_chain',
      targetChainNameList: 'target_chain_name_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      info: 'string',
      description: 'string',
      tokenName: 'string',
      capacity: 'string',
      netValue: 'string',
      currency: 'string',
      participants: { 'type': 'array', 'itemType': ParticipantInfo },
      mintKeys: { 'type': 'array', 'itemType': 'string' },
      burnKeys: { 'type': 'array', 'itemType': 'string' },
      transferKeys: { 'type': 'array', 'itemType': 'string' },
      managerKeys: { 'type': 'array', 'itemType': 'string' },
      projectCoverFileId: 'string',
      maxSubscriptionLimited: 'boolean',
      maxSubscriptionAmount: 'string',
      settlementMethods: { 'type': 'array', 'itemType': SupportedSettlementMethodInfo },
      crossChain: 'boolean',
      targetChainNameList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateIssuerProjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 项目ID
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

export class PagequeryIssuerProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目名称模糊查询条件
  name?: string;
  // 项目状态(ACTIVE：激活；PAUSED：暂停)
  status?: string;
  // 当前页码(默认为第一页)
  pageNum?: number;
  // 页面显示条数(默认10，最小为5)
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      status: 'status',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      status: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryIssuerProjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 项目分页信息
  data?: ProjectPageData;
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
      data: ProjectPageData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryDistributorProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目名称
  name?: string;
  // 项目状态（ACTIVE：激活；PAUSED：暂停）
  status?: string;
  // 当前页码(默认为第一页)
  pageNum: number;
  // 页面显示条数(默认10，最小为5)
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      status: 'status',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      status: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryDistributorProjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 项目分页信息
  data?: ProjectPageData;
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
      data: ProjectPageData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PauseIssuerProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目ID
  projectId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PauseIssuerProjectResponse extends $tea.Model {
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

export class EnableIssuerProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目ID
  projectId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class EnableIssuerProjectResponse extends $tea.Model {
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

export class DetailIssuerProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目ID
  projectId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailIssuerProjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 资产项目详情
  data?: AssetProjectDetail;
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
      data: AssetProjectDetail,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailDistributorProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目ID
  projectId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailDistributorProjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 资产项目详情
  data?: AssetProject;
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
      data: AssetProject,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryPlatformProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目名称
  name?: string;
  // 项目状态（ACTIVE：激活；PAUSED：暂停）
  status?: string;
  // 当前页码(默认为第一页)
  pageNum: number;
  // 页面显示条数(默认10，最小为5)
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      status: 'status',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      status: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryPlatformProjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 项目分页信息
  data?: ProjectPageData;
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
      data: ProjectPageData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailIssuerProjectwithroleRequest extends $tea.Model {
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

export class DetailIssuerProjectwithroleResponse extends $tea.Model {
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

export class ListIssuerCrossaccountRequest extends $tea.Model {
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

export class ListIssuerCrossaccountResponse extends $tea.Model {
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

export class ListDistributorCrossaccountRequest extends $tea.Model {
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

export class ListDistributorCrossaccountResponse extends $tea.Model {
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

export class CountIssuerDatasummaryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 币种（目前支持USD、HKD）
  currency?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      currency: 'currency',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      currency: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountIssuerDatasummaryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总览统计数据项
  data?: DataSummaryTotal;
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
      data: DataSummaryTotal,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountDistributorDatasummaryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 币种（目前支持USD、HKD）
  currency?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      currency: 'currency',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      currency: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountDistributorDatasummaryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总览统计数据项
  data?: DataSummaryTotal;
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
      data: DataSummaryTotal,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListIssuerDatasummaryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 币种（目前支持USD、HKD）
  currency?: string;
  // 开始时间(格式：YYYY-MM-DD)
  beginDate?: string;
  // 截止时间(格式：YYYY-MM-DD)
  endDate?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      currency: 'currency',
      beginDate: 'begin_date',
      endDate: 'end_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      currency: 'string',
      beginDate: 'string',
      endDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListIssuerDatasummaryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 历史资产统计列表
  data?: DataSummaryStatisticsItem[];
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
      data: { 'type': 'array', 'itemType': DataSummaryStatisticsItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDistributorDatasummaryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 币种（目前支持USD、HKD）
  currency?: string;
  // 开始时间
  beginDate?: string;
  // 截止时间
  endDate?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      currency: 'currency',
      beginDate: 'begin_date',
      endDate: 'end_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      currency: 'string',
      beginDate: 'string',
      endDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDistributorDatasummaryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 历史资产统计列表
  data?: DataSummaryStatisticsItem[];
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
      data: { 'type': 'array', 'itemType': DataSummaryStatisticsItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListIssuerInstitutionRequest extends $tea.Model {
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

export class ListIssuerInstitutionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 机构列表
  data?: InstitutionVO[];
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
      data: { 'type': 'array', 'itemType': InstitutionVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryIssuerKeyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前页码(默认为第一页)
  pageNum: number;
  // 页面显示条数(默认10，最小为5)
  pageSize: number;
  // 排序字段
  sortField?: string;
  // 密钥名称
  keyName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
      sortField: 'sort_field',
      keyName: 'key_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageNum: 'number',
      pageSize: 'number',
      sortField: 'string',
      keyName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryIssuerKeyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 密钥分页列表
  data?: KeyPageData;
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
      data: KeyPageData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailIssuerKeyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 密钥id
  keyId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      keyId: 'key_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      keyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailIssuerKeyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 密钥详情
  data?: KeyVO;
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
      data: KeyVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateIssuerKeyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 密钥名称
  name: string;
  // 创建类型
  // KEY_FILE：上传密钥文件"
  // CREATE_NEW_KEY：系统创建密钥"
  type: string;
  // 文件流
  fileObject?: Readable;
  fileObjectName?: string;
  fileId?: string;
  // 文件解密密码
  password?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      type: 'type',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      password: 'password',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      type: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      password: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateIssuerKeyResponse extends $tea.Model {
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

export class DeleteIssuerKeyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 密钥id
  keyId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      keyId: 'key_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      keyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteIssuerKeyResponse extends $tea.Model {
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

export class ListIssuerOperationlogRequest extends $tea.Model {
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

export class ListIssuerOperationlogResponse extends $tea.Model {
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

export class ListDistributorOperationlogRequest extends $tea.Model {
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

export class ListDistributorOperationlogResponse extends $tea.Model {
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

export class AddIssuerProjectkeyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目ID
  projectId: string;
  // 密钥ID
  keyId: string;
  // 密钥类型(MINT:发行密钥；BURN：赎回密钥；TRANSFER：转账密钥；MANAGER：管理密钥)
  keyType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
      keyId: 'key_id',
      keyType: 'key_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
      keyId: 'string',
      keyType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddIssuerProjectkeyResponse extends $tea.Model {
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

export class DeleteIssuerProjectkeyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目密钥ID
  id: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteIssuerProjectkeyResponse extends $tea.Model {
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

export class ListIssuerProjectkeyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目ID
  projectId: string;
  // 密钥类型(MINT:发行密钥；BURN：赎回密钥；TRANSFER：转账密钥；MANAGER：管理密钥)
  keyType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
      keyType: 'key_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
      keyType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListIssuerProjectkeyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 项目密钥列表
  data?: AssetProjectKey[];
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
      data: { 'type': 'array', 'itemType': AssetProjectKey },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryIssuerProjectkeyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 密钥ID
  keyId: string;
  // 当前页码(默认为第一页)
  pageNum: number;
  // 页面显示条数(默认10，最小为5)
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      keyId: 'key_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      keyId: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryIssuerProjectkeyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 项目密钥分页信息
  data?: ProjectKeyPageData;
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
      data: ProjectKeyPageData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateIssuerNetvalueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目ID
  projectId: string;
  // 项目净值
  netValue: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
      netValue: 'net_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
      netValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateIssuerNetvalueResponse extends $tea.Model {
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

export class ListIssuerNetvalueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目ID
  projectId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListIssuerNetvalueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 资产历史净值列表
  data?: ProjectPerformance[];
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
      data: { 'type': 'array', 'itemType': ProjectPerformance },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadIssuerReportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目ID
  projectId: string;
  // 文件名
  fileName: string;
  // 文件内容(base64)
  fileContent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
      fileName: 'file_name',
      fileContent: 'file_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
      fileName: 'string',
      fileContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadIssuerReportResponse extends $tea.Model {
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

export class ListIssuerReportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目ID
  projectId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListIssuerReportResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 项目报告资源列表
  data?: ProjectResource[];
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
      data: { 'type': 'array', 'itemType': ProjectResource },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDistributorReportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目ID
  projectId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDistributorReportResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 项目报告资源列表
  data?: ProjectResource[];
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
      data: { 'type': 'array', 'itemType': ProjectResource },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DownloadIssuerReportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资源ID
  resourceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      resourceId: 'resource_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      resourceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DownloadIssuerReportResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 报告文件下载地址
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

export class PreviewIssuerReportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资源ID
  resourceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      resourceId: 'resource_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      resourceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PreviewIssuerReportResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 报告文件预览地址
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

export class DownloadDistributorReportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资源ID
  resourceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      resourceId: 'resource_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      resourceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DownloadDistributorReportResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 报告文件下载地址
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

export class PreviewDistributorReportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资源ID
  resourceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      resourceId: 'resource_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      resourceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PreviewDistributorReportResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 报告文件预览地址
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

export class PagequeryIssuerSubuserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前页码(默认为第一页)
  pageNum: number;
  // 页面显示条数(默认10，最小为5)
  pageSize: number;
  // 钱包地址
  walletAddress?: string;
  // 项目合约地址
  assetProjectAddress?: string;
  // 项目名称
  projectName?: string;
  // 项目id
  projectId?: string;
  // 数据类型 
  // REDEEM
  // ISSUE
  // 不传为全部
  transactionType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
      walletAddress: 'wallet_address',
      assetProjectAddress: 'asset_project_address',
      projectName: 'project_name',
      projectId: 'project_id',
      transactionType: 'transaction_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageNum: 'number',
      pageSize: 'number',
      walletAddress: 'string',
      assetProjectAddress: 'string',
      projectName: 'string',
      projectId: 'string',
      transactionType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryIssuerSubuserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 二级用户列表
  data?: SubUserAccountPageData;
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
      data: SubUserAccountPageData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryDistributorSubuserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前页码(默认为第一页)
  pageNum: number;
  // 页面显示条数(默认10，最小为5)
  pageSize: number;
  // 钱包地址
  walletAddress?: string;
  // 项目合约地址
  assetProjectAddress?: string;
  // 项目名称
  projectName?: string;
  // 项目id
  projectId?: string;
  // 数据类型 
  // REDEEM 
  // ISSUE 
  // 不传为全部
  transactionType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
      walletAddress: 'wallet_address',
      assetProjectAddress: 'asset_project_address',
      projectName: 'project_name',
      projectId: 'project_id',
      transactionType: 'transaction_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageNum: 'number',
      pageSize: 'number',
      walletAddress: 'string',
      assetProjectAddress: 'string',
      projectName: 'string',
      projectId: 'string',
      transactionType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryDistributorSubuserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 二级用户列表
  data?: SubUserAccountPageData;
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
      data: SubUserAccountPageData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIssuerSubuserRequest extends $tea.Model {
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

export class QueryIssuerSubuserResponse extends $tea.Model {
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

export class QueryDistributorSubuserRequest extends $tea.Model {
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

export class QueryDistributorSubuserResponse extends $tea.Model {
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

export class UpdateDistributorSubuserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 二级用户账号
  subUserAccountId: string;
  // 用户id
  subUserId?: string;
  // 二级用户钱包地址
  subUserAddress?: string;
  // assetProjectId
  assetProjectId: string;
  // userTarget
  userTarget: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      subUserAccountId: 'sub_user_account_id',
      subUserId: 'sub_user_id',
      subUserAddress: 'sub_user_address',
      assetProjectId: 'asset_project_id',
      userTarget: 'user_target',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      subUserAccountId: 'string',
      subUserId: 'string',
      subUserAddress: 'string',
      assetProjectId: 'string',
      userTarget: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDistributorSubuserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
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

export class CreateDistributorSubuserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 钱包地址
  walletAddress: string;
  // 项目名称
  projectName?: string;
  // 项目id
  projectId: string;
  // 用户资产配额
  userTarget: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      walletAddress: 'wallet_address',
      projectName: 'project_name',
      projectId: 'project_id',
      userTarget: 'user_target',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      walletAddress: 'string',
      projectName: 'string',
      projectId: 'string',
      userTarget: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDistributorSubuserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
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

export class DeleteDistributorSubuserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 二级用户账号
  subUserAccountId: string;
  // 用户id
  subUserId?: string;
  // 二级用户钱包地址
  subUserAddress?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      subUserAccountId: 'sub_user_account_id',
      subUserId: 'sub_user_id',
      subUserAddress: 'sub_user_address',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      subUserAccountId: 'string',
      subUserId: 'string',
      subUserAddress: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteDistributorSubuserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否删除成功
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

export class CountDistributorSubusertargetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目id
  projectId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountDistributorSubusertargetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户配额
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

export class QueryIssuerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资产项目ID
  assetProjectId?: string;
  // 资产项目合约地址
  assetProjectAddress?: string;
  // 用户ID
  userId?: string;
  // 用户地址
  userAddress?: string;
  // 登录名
  loginName?: string;
  // 登录名类型(EMAIL)
  loginAccoutType?: string;
  // 开始时间 (时间戳)
  startTimeMills: number;
  // 结束时间 (时间戳)
  endTimeMills: number;
  // 项目所在链
  chainName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      assetProjectId: 'asset_project_id',
      assetProjectAddress: 'asset_project_address',
      userId: 'user_id',
      userAddress: 'user_address',
      loginName: 'login_name',
      loginAccoutType: 'login_accout_type',
      startTimeMills: 'start_time_mills',
      endTimeMills: 'end_time_mills',
      chainName: 'chain_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      assetProjectId: 'string',
      assetProjectAddress: 'string',
      userId: 'string',
      userAddress: 'string',
      loginName: 'string',
      loginAccoutType: 'string',
      startTimeMills: 'number',
      endTimeMills: 'number',
      chainName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIssuerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 账户明细列表
  data?: SubUserAccountDetailVO[];
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
      data: { 'type': 'array', 'itemType': SubUserAccountDetailVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDistributorRequest extends $tea.Model {
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
  // 用户地址
  userAddress?: string;
  // 登录名
  loginName?: string;
  // 登录名类型(EMAIL)
  loginAccoutType?: string;
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
      loginAccoutType: 'login_accout_type',
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
      loginAccoutType: 'string',
      startTimeMills: 'number',
      endTimeMills: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDistributorResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 账户明细列表
  data?: SubUserAccountDetailVO[];
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
      data: { 'type': 'array', 'itemType': SubUserAccountDetailVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class IssueIssuerSubusertradeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 二级用户地址
  subUserAddress: string;
  // 二级用户账户ID
  subUserAccountId: string;
  // 发行数量
  issueAmount: string;
  // 资产项目ID
  assetProjectId: string;
  // 资产项目链上合约地址
  assetProjectAddress?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      subUserAddress: 'sub_user_address',
      subUserAccountId: 'sub_user_account_id',
      issueAmount: 'issue_amount',
      assetProjectId: 'asset_project_id',
      assetProjectAddress: 'asset_project_address',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      subUserAddress: 'string',
      subUserAccountId: 'string',
      issueAmount: 'string',
      assetProjectId: 'string',
      assetProjectAddress: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class IssueIssuerSubusertradeResponse extends $tea.Model {
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

export class RedeemIssuerSubusertradeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 二级用户地址
  subUserAddress: string;
  // 二级用户账户ID
  subUserAccountId: string;
  // 赎回数量
  redeemAmount: string;
  // 资产项目ID
  assetProjectId: string;
  // 资产项目链上合约地址
  assetProjectAddress?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      subUserAddress: 'sub_user_address',
      subUserAccountId: 'sub_user_account_id',
      redeemAmount: 'redeem_amount',
      assetProjectId: 'asset_project_id',
      assetProjectAddress: 'asset_project_address',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      subUserAddress: 'string',
      subUserAccountId: 'string',
      redeemAmount: 'string',
      assetProjectId: 'string',
      assetProjectAddress: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RedeemIssuerSubusertradeResponse extends $tea.Model {
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

export class TransferIssuerSubusertradeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // from二级用户地址
  fromSubUserAddress: string;
  // from二级用户账户ID
  fromSubUserAccountId: string;
  // to二级用户地址
  toSubUserAddress: string;
  // to二级用户账户ID
  toSubUserAccountId?: string;
  // 转移数量
  transferAmount: string;
  // 资产项目ID
  assetProjectId: string;
  // 资产项目链上合约地址
  assetProjectAddress?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fromSubUserAddress: 'from_sub_user_address',
      fromSubUserAccountId: 'from_sub_user_account_id',
      toSubUserAddress: 'to_sub_user_address',
      toSubUserAccountId: 'to_sub_user_account_id',
      transferAmount: 'transfer_amount',
      assetProjectId: 'asset_project_id',
      assetProjectAddress: 'asset_project_address',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fromSubUserAddress: 'string',
      fromSubUserAccountId: 'string',
      toSubUserAddress: 'string',
      toSubUserAccountId: 'string',
      transferAmount: 'string',
      assetProjectId: 'string',
      assetProjectAddress: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class TransferIssuerSubusertradeResponse extends $tea.Model {
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
          sdk_version: "1.0.26",
          _prod_code: "WEBTRWATRADE",
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
   * Description: 发行机构创建资产项目
   * Summary: 发行机构创建资产项目
   */
  async createIssuerProject(request: CreateIssuerProjectRequest): Promise<CreateIssuerProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createIssuerProjectEx(request, headers, runtime);
  }

  /**
   * Description: 发行机构创建资产项目
   * Summary: 发行机构创建资产项目
   */
  async createIssuerProjectEx(request: CreateIssuerProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateIssuerProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateIssuerProjectResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.project.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateIssuerProjectResponse({}));
  }

  /**
   * Description: 分页查询发行机构持有的资产项目信息
   * Summary: 分页查询发行机构项目信息
   */
  async pagequeryIssuerProject(request: PagequeryIssuerProjectRequest): Promise<PagequeryIssuerProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryIssuerProjectEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询发行机构持有的资产项目信息
   * Summary: 分页查询发行机构项目信息
   */
  async pagequeryIssuerProjectEx(request: PagequeryIssuerProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryIssuerProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryIssuerProjectResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.project.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryIssuerProjectResponse({}));
  }

  /**
   * Description: 分页查询代销机构代销的资产项目信息
   * Summary: 分页查询代销机构项目信息
   */
  async pagequeryDistributorProject(request: PagequeryDistributorProjectRequest): Promise<PagequeryDistributorProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryDistributorProjectEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询代销机构代销的资产项目信息
   * Summary: 分页查询代销机构项目信息
   */
  async pagequeryDistributorProjectEx(request: PagequeryDistributorProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryDistributorProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryDistributorProjectResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.distributor.project.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryDistributorProjectResponse({}));
  }

  /**
   * Description: 发行机构暂停项目
   * Summary: 发行机构暂停项目
   */
  async pauseIssuerProject(request: PauseIssuerProjectRequest): Promise<PauseIssuerProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pauseIssuerProjectEx(request, headers, runtime);
  }

  /**
   * Description: 发行机构暂停项目
   * Summary: 发行机构暂停项目
   */
  async pauseIssuerProjectEx(request: PauseIssuerProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PauseIssuerProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<PauseIssuerProjectResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.project.pause", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PauseIssuerProjectResponse({}));
  }

  /**
   * Description: 发行机构激活项目(使项目生效)
   * Summary: 发行机构激活项目
   */
  async enableIssuerProject(request: EnableIssuerProjectRequest): Promise<EnableIssuerProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.enableIssuerProjectEx(request, headers, runtime);
  }

  /**
   * Description: 发行机构激活项目(使项目生效)
   * Summary: 发行机构激活项目
   */
  async enableIssuerProjectEx(request: EnableIssuerProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<EnableIssuerProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<EnableIssuerProjectResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.project.enable", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new EnableIssuerProjectResponse({}));
  }

  /**
   * Description: 发行机构查询项目详情
   * Summary: 发行机构查询项目详情
   */
  async detailIssuerProject(request: DetailIssuerProjectRequest): Promise<DetailIssuerProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailIssuerProjectEx(request, headers, runtime);
  }

  /**
   * Description: 发行机构查询项目详情
   * Summary: 发行机构查询项目详情
   */
  async detailIssuerProjectEx(request: DetailIssuerProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailIssuerProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailIssuerProjectResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.project.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailIssuerProjectResponse({}));
  }

  /**
   * Description: 代销机构查询项目详情
   * Summary: 代销机构查询项目详情
   */
  async detailDistributorProject(request: DetailDistributorProjectRequest): Promise<DetailDistributorProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailDistributorProjectEx(request, headers, runtime);
  }

  /**
   * Description: 代销机构查询项目详情
   * Summary: 代销机构查询项目详情
   */
  async detailDistributorProjectEx(request: DetailDistributorProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailDistributorProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailDistributorProjectResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.distributor.project.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailDistributorProjectResponse({}));
  }

  /**
   * Description: 平台管理员分页查询所有项目
   * Summary: 平台管理分页查询项目
   */
  async pagequeryPlatformProject(request: PagequeryPlatformProjectRequest): Promise<PagequeryPlatformProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryPlatformProjectEx(request, headers, runtime);
  }

  /**
   * Description: 平台管理员分页查询所有项目
   * Summary: 平台管理分页查询项目
   */
  async pagequeryPlatformProjectEx(request: PagequeryPlatformProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryPlatformProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryPlatformProjectResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.platform.project.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryPlatformProjectResponse({}));
  }

  /**
   * Description: 发行机构查询项目及角色信息
   * Summary: 发行机构查询项目及角色信息
   */
  async detailIssuerProjectwithrole(request: DetailIssuerProjectwithroleRequest): Promise<DetailIssuerProjectwithroleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailIssuerProjectwithroleEx(request, headers, runtime);
  }

  /**
   * Description: 发行机构查询项目及角色信息
   * Summary: 发行机构查询项目及角色信息
   */
  async detailIssuerProjectwithroleEx(request: DetailIssuerProjectwithroleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailIssuerProjectwithroleResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailIssuerProjectwithroleResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.projectwithrole.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailIssuerProjectwithroleResponse({}));
  }

  /**
   * Description: 发行机构跨链账号明细
   * Summary: 发行机构跨链账号明细
   */
  async listIssuerCrossaccount(request: ListIssuerCrossaccountRequest): Promise<ListIssuerCrossaccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listIssuerCrossaccountEx(request, headers, runtime);
  }

  /**
   * Description: 发行机构跨链账号明细
   * Summary: 发行机构跨链账号明细
   */
  async listIssuerCrossaccountEx(request: ListIssuerCrossaccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListIssuerCrossaccountResponse> {
    Util.validateModel(request);
    return $tea.cast<ListIssuerCrossaccountResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.crossaccount.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListIssuerCrossaccountResponse({}));
  }

  /**
   * Description: 代销机构跨链账号明细
   * Summary: 代销机构跨链账号明细
   */
  async listDistributorCrossaccount(request: ListDistributorCrossaccountRequest): Promise<ListDistributorCrossaccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listDistributorCrossaccountEx(request, headers, runtime);
  }

  /**
   * Description: 代销机构跨链账号明细
   * Summary: 代销机构跨链账号明细
   */
  async listDistributorCrossaccountEx(request: ListDistributorCrossaccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListDistributorCrossaccountResponse> {
    Util.validateModel(request);
    return $tea.cast<ListDistributorCrossaccountResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.distributor.crossaccount.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListDistributorCrossaccountResponse({}));
  }

  /**
   * Description: 发行机构获取总览统计数据项
   * Summary: 发行机构获取总览统计数据项
   */
  async countIssuerDatasummary(request: CountIssuerDatasummaryRequest): Promise<CountIssuerDatasummaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.countIssuerDatasummaryEx(request, headers, runtime);
  }

  /**
   * Description: 发行机构获取总览统计数据项
   * Summary: 发行机构获取总览统计数据项
   */
  async countIssuerDatasummaryEx(request: CountIssuerDatasummaryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CountIssuerDatasummaryResponse> {
    Util.validateModel(request);
    return $tea.cast<CountIssuerDatasummaryResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.datasummary.count", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CountIssuerDatasummaryResponse({}));
  }

  /**
   * Description: 代销机构获取总览统计数据项
   * Summary: 代销机构获取总览统计数据项
   */
  async countDistributorDatasummary(request: CountDistributorDatasummaryRequest): Promise<CountDistributorDatasummaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.countDistributorDatasummaryEx(request, headers, runtime);
  }

  /**
   * Description: 代销机构获取总览统计数据项
   * Summary: 代销机构获取总览统计数据项
   */
  async countDistributorDatasummaryEx(request: CountDistributorDatasummaryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CountDistributorDatasummaryResponse> {
    Util.validateModel(request);
    return $tea.cast<CountDistributorDatasummaryResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.distributor.datasummary.count", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CountDistributorDatasummaryResponse({}));
  }

  /**
   * Description: 发行机构获取历史资产价值
   * Summary: 发行机构获取历史资产价值
   */
  async listIssuerDatasummary(request: ListIssuerDatasummaryRequest): Promise<ListIssuerDatasummaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listIssuerDatasummaryEx(request, headers, runtime);
  }

  /**
   * Description: 发行机构获取历史资产价值
   * Summary: 发行机构获取历史资产价值
   */
  async listIssuerDatasummaryEx(request: ListIssuerDatasummaryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListIssuerDatasummaryResponse> {
    Util.validateModel(request);
    return $tea.cast<ListIssuerDatasummaryResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.datasummary.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListIssuerDatasummaryResponse({}));
  }

  /**
   * Description: 代销机构获取历史资产价值
   * Summary: 代销机构获取历史资产价值
   */
  async listDistributorDatasummary(request: ListDistributorDatasummaryRequest): Promise<ListDistributorDatasummaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listDistributorDatasummaryEx(request, headers, runtime);
  }

  /**
   * Description: 代销机构获取历史资产价值
   * Summary: 代销机构获取历史资产价值
   */
  async listDistributorDatasummaryEx(request: ListDistributorDatasummaryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListDistributorDatasummaryResponse> {
    Util.validateModel(request);
    return $tea.cast<ListDistributorDatasummaryResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.distributor.datasummary.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListDistributorDatasummaryResponse({}));
  }

  /**
   * Description: 查询代销机构列表
   * Summary: 查询代销机构列表
   */
  async listIssuerInstitution(request: ListIssuerInstitutionRequest): Promise<ListIssuerInstitutionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listIssuerInstitutionEx(request, headers, runtime);
  }

  /**
   * Description: 查询代销机构列表
   * Summary: 查询代销机构列表
   */
  async listIssuerInstitutionEx(request: ListIssuerInstitutionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListIssuerInstitutionResponse> {
    Util.validateModel(request);
    return $tea.cast<ListIssuerInstitutionResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.institution.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListIssuerInstitutionResponse({}));
  }

  /**
   * Description: 分页查询密钥
   * Summary: 分页查询密钥
   */
  async pagequeryIssuerKey(request: PagequeryIssuerKeyRequest): Promise<PagequeryIssuerKeyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryIssuerKeyEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询密钥
   * Summary: 分页查询密钥
   */
  async pagequeryIssuerKeyEx(request: PagequeryIssuerKeyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryIssuerKeyResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryIssuerKeyResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.key.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryIssuerKeyResponse({}));
  }

  /**
   * Description: 查询密钥详情
   * Summary: 查询密钥详情
   */
  async detailIssuerKey(request: DetailIssuerKeyRequest): Promise<DetailIssuerKeyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailIssuerKeyEx(request, headers, runtime);
  }

  /**
   * Description: 查询密钥详情
   * Summary: 查询密钥详情
   */
  async detailIssuerKeyEx(request: DetailIssuerKeyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailIssuerKeyResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailIssuerKeyResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.key.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailIssuerKeyResponse({}));
  }

  /**
   * Description: 创建密钥
   * Summary: 创建密钥
   */
  async createIssuerKey(request: CreateIssuerKeyRequest): Promise<CreateIssuerKeyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createIssuerKeyEx(request, headers, runtime);
  }

  /**
   * Description: 创建密钥
   * Summary: 创建密钥
   */
  async createIssuerKeyEx(request: CreateIssuerKeyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateIssuerKeyResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateIssuerKeyResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.key.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateIssuerKeyResponse({}));
  }

  /**
   * Description: 删除密钥
   * Summary: 删除密钥
   */
  async deleteIssuerKey(request: DeleteIssuerKeyRequest): Promise<DeleteIssuerKeyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteIssuerKeyEx(request, headers, runtime);
  }

  /**
   * Description: 删除密钥
   * Summary: 删除密钥
   */
  async deleteIssuerKeyEx(request: DeleteIssuerKeyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteIssuerKeyResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteIssuerKeyResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.key.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteIssuerKeyResponse({}));
  }

  /**
   * Description: 发行机构查询登录登出操作日志
   * Summary: 发行机构查询登录登出操作日志
   */
  async listIssuerOperationlog(request: ListIssuerOperationlogRequest): Promise<ListIssuerOperationlogResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listIssuerOperationlogEx(request, headers, runtime);
  }

  /**
   * Description: 发行机构查询登录登出操作日志
   * Summary: 发行机构查询登录登出操作日志
   */
  async listIssuerOperationlogEx(request: ListIssuerOperationlogRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListIssuerOperationlogResponse> {
    Util.validateModel(request);
    return $tea.cast<ListIssuerOperationlogResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.operationlog.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListIssuerOperationlogResponse({}));
  }

  /**
   * Description: 代销机构查询登录登出操作日志
   * Summary: 代销机构查询登录登出操作日志
   */
  async listDistributorOperationlog(request: ListDistributorOperationlogRequest): Promise<ListDistributorOperationlogResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listDistributorOperationlogEx(request, headers, runtime);
  }

  /**
   * Description: 代销机构查询登录登出操作日志
   * Summary: 代销机构查询登录登出操作日志
   */
  async listDistributorOperationlogEx(request: ListDistributorOperationlogRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListDistributorOperationlogResponse> {
    Util.validateModel(request);
    return $tea.cast<ListDistributorOperationlogResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.distributor.operationlog.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListDistributorOperationlogResponse({}));
  }

  /**
   * Description: 发行机构添加项目密钥
   * Summary: 发行机构添加项目密钥
   */
  async addIssuerProjectkey(request: AddIssuerProjectkeyRequest): Promise<AddIssuerProjectkeyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addIssuerProjectkeyEx(request, headers, runtime);
  }

  /**
   * Description: 发行机构添加项目密钥
   * Summary: 发行机构添加项目密钥
   */
  async addIssuerProjectkeyEx(request: AddIssuerProjectkeyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddIssuerProjectkeyResponse> {
    Util.validateModel(request);
    return $tea.cast<AddIssuerProjectkeyResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.projectkey.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddIssuerProjectkeyResponse({}));
  }

  /**
   * Description: 发行机构删除项目密钥
   * Summary: 发行机构删除项目密钥
   */
  async deleteIssuerProjectkey(request: DeleteIssuerProjectkeyRequest): Promise<DeleteIssuerProjectkeyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteIssuerProjectkeyEx(request, headers, runtime);
  }

  /**
   * Description: 发行机构删除项目密钥
   * Summary: 发行机构删除项目密钥
   */
  async deleteIssuerProjectkeyEx(request: DeleteIssuerProjectkeyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteIssuerProjectkeyResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteIssuerProjectkeyResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.projectkey.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteIssuerProjectkeyResponse({}));
  }

  /**
   * Description: 发行机构获取项目密钥列表
   * Summary: 发行机构获取项目密钥列表
   */
  async listIssuerProjectkey(request: ListIssuerProjectkeyRequest): Promise<ListIssuerProjectkeyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listIssuerProjectkeyEx(request, headers, runtime);
  }

  /**
   * Description: 发行机构获取项目密钥列表
   * Summary: 发行机构获取项目密钥列表
   */
  async listIssuerProjectkeyEx(request: ListIssuerProjectkeyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListIssuerProjectkeyResponse> {
    Util.validateModel(request);
    return $tea.cast<ListIssuerProjectkeyResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.projectkey.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListIssuerProjectkeyResponse({}));
  }

  /**
   * Description: 发行机构分页查询密钥关联的项目
   * Summary: 发行机构分页查询密钥关联的项目
   */
  async pagequeryIssuerProjectkey(request: PagequeryIssuerProjectkeyRequest): Promise<PagequeryIssuerProjectkeyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryIssuerProjectkeyEx(request, headers, runtime);
  }

  /**
   * Description: 发行机构分页查询密钥关联的项目
   * Summary: 发行机构分页查询密钥关联的项目
   */
  async pagequeryIssuerProjectkeyEx(request: PagequeryIssuerProjectkeyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryIssuerProjectkeyResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryIssuerProjectkeyResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.projectkey.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryIssuerProjectkeyResponse({}));
  }

  /**
   * Description: 更新项目净值
   * Summary: 更新项目净值
   */
  async updateIssuerNetvalue(request: UpdateIssuerNetvalueRequest): Promise<UpdateIssuerNetvalueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateIssuerNetvalueEx(request, headers, runtime);
  }

  /**
   * Description: 更新项目净值
   * Summary: 更新项目净值
   */
  async updateIssuerNetvalueEx(request: UpdateIssuerNetvalueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateIssuerNetvalueResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateIssuerNetvalueResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.netvalue.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateIssuerNetvalueResponse({}));
  }

  /**
   * Description: 获取净值列表
   * Summary: 获取净值列表
   */
  async listIssuerNetvalue(request: ListIssuerNetvalueRequest): Promise<ListIssuerNetvalueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listIssuerNetvalueEx(request, headers, runtime);
  }

  /**
   * Description: 获取净值列表
   * Summary: 获取净值列表
   */
  async listIssuerNetvalueEx(request: ListIssuerNetvalueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListIssuerNetvalueResponse> {
    Util.validateModel(request);
    return $tea.cast<ListIssuerNetvalueResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.netvalue.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListIssuerNetvalueResponse({}));
  }

  /**
   * Description: 上传项目报告
   * Summary: 上传项目报告
   */
  async uploadIssuerReport(request: UploadIssuerReportRequest): Promise<UploadIssuerReportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadIssuerReportEx(request, headers, runtime);
  }

  /**
   * Description: 上传项目报告
   * Summary: 上传项目报告
   */
  async uploadIssuerReportEx(request: UploadIssuerReportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadIssuerReportResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadIssuerReportResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.report.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadIssuerReportResponse({}));
  }

  /**
   * Description: 发行机构获取历史报告列表
   * Summary: 发行机构获取历史报告列表
   */
  async listIssuerReport(request: ListIssuerReportRequest): Promise<ListIssuerReportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listIssuerReportEx(request, headers, runtime);
  }

  /**
   * Description: 发行机构获取历史报告列表
   * Summary: 发行机构获取历史报告列表
   */
  async listIssuerReportEx(request: ListIssuerReportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListIssuerReportResponse> {
    Util.validateModel(request);
    return $tea.cast<ListIssuerReportResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.report.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListIssuerReportResponse({}));
  }

  /**
   * Description: 代销机构获取历史项目报告
   * Summary: 代销机构获取历史项目报告
   */
  async listDistributorReport(request: ListDistributorReportRequest): Promise<ListDistributorReportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listDistributorReportEx(request, headers, runtime);
  }

  /**
   * Description: 代销机构获取历史项目报告
   * Summary: 代销机构获取历史项目报告
   */
  async listDistributorReportEx(request: ListDistributorReportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListDistributorReportResponse> {
    Util.validateModel(request);
    return $tea.cast<ListDistributorReportResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.distributor.report.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListDistributorReportResponse({}));
  }

  /**
   * Description: 发行机构获取报告文件下载URL
   * Summary: 发行机构获取报告文件下载URL
   */
  async downloadIssuerReport(request: DownloadIssuerReportRequest): Promise<DownloadIssuerReportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.downloadIssuerReportEx(request, headers, runtime);
  }

  /**
   * Description: 发行机构获取报告文件下载URL
   * Summary: 发行机构获取报告文件下载URL
   */
  async downloadIssuerReportEx(request: DownloadIssuerReportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DownloadIssuerReportResponse> {
    Util.validateModel(request);
    return $tea.cast<DownloadIssuerReportResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.report.download", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DownloadIssuerReportResponse({}));
  }

  /**
   * Description: 发行机构获取报告文件预览URL
   * Summary: 发行机构获取报告文件预览URL
   */
  async previewIssuerReport(request: PreviewIssuerReportRequest): Promise<PreviewIssuerReportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.previewIssuerReportEx(request, headers, runtime);
  }

  /**
   * Description: 发行机构获取报告文件预览URL
   * Summary: 发行机构获取报告文件预览URL
   */
  async previewIssuerReportEx(request: PreviewIssuerReportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PreviewIssuerReportResponse> {
    Util.validateModel(request);
    return $tea.cast<PreviewIssuerReportResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.report.preview", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PreviewIssuerReportResponse({}));
  }

  /**
   * Description: 代销机构获取报告文件下载URL
   * Summary: 代销机构获取报告文件下载URL
   */
  async downloadDistributorReport(request: DownloadDistributorReportRequest): Promise<DownloadDistributorReportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.downloadDistributorReportEx(request, headers, runtime);
  }

  /**
   * Description: 代销机构获取报告文件下载URL
   * Summary: 代销机构获取报告文件下载URL
   */
  async downloadDistributorReportEx(request: DownloadDistributorReportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DownloadDistributorReportResponse> {
    Util.validateModel(request);
    return $tea.cast<DownloadDistributorReportResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.distributor.report.download", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DownloadDistributorReportResponse({}));
  }

  /**
   * Description: 代销机构获取报告文件预览URL
   * Summary: 代销机构获取报告文件预览URL
   */
  async previewDistributorReport(request: PreviewDistributorReportRequest): Promise<PreviewDistributorReportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.previewDistributorReportEx(request, headers, runtime);
  }

  /**
   * Description: 代销机构获取报告文件预览URL
   * Summary: 代销机构获取报告文件预览URL
   */
  async previewDistributorReportEx(request: PreviewDistributorReportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PreviewDistributorReportResponse> {
    Util.validateModel(request);
    return $tea.cast<PreviewDistributorReportResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.distributor.report.preview", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PreviewDistributorReportResponse({}));
  }

  /**
   * Description: 分页查询二级用户列表
   * Summary: 分页查询二级用户列表
   */
  async pagequeryIssuerSubuser(request: PagequeryIssuerSubuserRequest): Promise<PagequeryIssuerSubuserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryIssuerSubuserEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询二级用户列表
   * Summary: 分页查询二级用户列表
   */
  async pagequeryIssuerSubuserEx(request: PagequeryIssuerSubuserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryIssuerSubuserResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryIssuerSubuserResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.subuser.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryIssuerSubuserResponse({}));
  }

  /**
   * Description: 分页查询二级用户列表
   * Summary: 分页查询二级用户列表
   */
  async pagequeryDistributorSubuser(request: PagequeryDistributorSubuserRequest): Promise<PagequeryDistributorSubuserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryDistributorSubuserEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询二级用户列表
   * Summary: 分页查询二级用户列表
   */
  async pagequeryDistributorSubuserEx(request: PagequeryDistributorSubuserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryDistributorSubuserResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryDistributorSubuserResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.distributor.subuser.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryDistributorSubuserResponse({}));
  }

  /**
   * Description: 查询单个二级用户
   * Summary: 查询单个二级用户
   */
  async queryIssuerSubuser(request: QueryIssuerSubuserRequest): Promise<QueryIssuerSubuserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIssuerSubuserEx(request, headers, runtime);
  }

  /**
   * Description: 查询单个二级用户
   * Summary: 查询单个二级用户
   */
  async queryIssuerSubuserEx(request: QueryIssuerSubuserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIssuerSubuserResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIssuerSubuserResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.subuser.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIssuerSubuserResponse({}));
  }

  /**
   * Description: 查询单个二级用户
   * Summary: 查询单个二级用户
   */
  async queryDistributorSubuser(request: QueryDistributorSubuserRequest): Promise<QueryDistributorSubuserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDistributorSubuserEx(request, headers, runtime);
  }

  /**
   * Description: 查询单个二级用户
   * Summary: 查询单个二级用户
   */
  async queryDistributorSubuserEx(request: QueryDistributorSubuserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDistributorSubuserResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDistributorSubuserResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.distributor.subuser.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDistributorSubuserResponse({}));
  }

  /**
   * Description: 更新二级用户
   * Summary: 更新二级用户
   */
  async updateDistributorSubuser(request: UpdateDistributorSubuserRequest): Promise<UpdateDistributorSubuserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateDistributorSubuserEx(request, headers, runtime);
  }

  /**
   * Description: 更新二级用户
   * Summary: 更新二级用户
   */
  async updateDistributorSubuserEx(request: UpdateDistributorSubuserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateDistributorSubuserResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDistributorSubuserResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.distributor.subuser.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateDistributorSubuserResponse({}));
  }

  /**
   * Description: 添加二级用户
   * Summary: 添加二级用户
   */
  async createDistributorSubuser(request: CreateDistributorSubuserRequest): Promise<CreateDistributorSubuserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDistributorSubuserEx(request, headers, runtime);
  }

  /**
   * Description: 添加二级用户
   * Summary: 添加二级用户
   */
  async createDistributorSubuserEx(request: CreateDistributorSubuserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDistributorSubuserResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDistributorSubuserResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.distributor.subuser.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDistributorSubuserResponse({}));
  }

  /**
   * Description: 删除二级用户
   * Summary: 删除二级用户
   */
  async deleteDistributorSubuser(request: DeleteDistributorSubuserRequest): Promise<DeleteDistributorSubuserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteDistributorSubuserEx(request, headers, runtime);
  }

  /**
   * Description: 删除二级用户
   * Summary: 删除二级用户
   */
  async deleteDistributorSubuserEx(request: DeleteDistributorSubuserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteDistributorSubuserResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteDistributorSubuserResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.distributor.subuser.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteDistributorSubuserResponse({}));
  }

  /**
   * Description: 获取二级用户配额
   * Summary: 获取二级用户配额
   */
  async countDistributorSubusertarget(request: CountDistributorSubusertargetRequest): Promise<CountDistributorSubusertargetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.countDistributorSubusertargetEx(request, headers, runtime);
  }

  /**
   * Description: 获取二级用户配额
   * Summary: 获取二级用户配额
   */
  async countDistributorSubusertargetEx(request: CountDistributorSubusertargetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CountDistributorSubusertargetResponse> {
    Util.validateModel(request);
    return $tea.cast<CountDistributorSubusertargetResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.distributor.subusertarget.count", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CountDistributorSubusertargetResponse({}));
  }

  /**
   * Description: 发行机构获取二级用户详情数据
   * Summary: 发行机构获取二级用户详情数据
   */
  async queryIssuer(request: QueryIssuerRequest): Promise<QueryIssuerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIssuerEx(request, headers, runtime);
  }

  /**
   * Description: 发行机构获取二级用户详情数据
   * Summary: 发行机构获取二级用户详情数据
   */
  async queryIssuerEx(request: QueryIssuerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIssuerResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIssuerResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIssuerResponse({}));
  }

  /**
   * Description: 代销机构获取二级用户详情数据
   * Summary: 代销机构获取二级用户详情数据
   */
  async queryDistributor(request: QueryDistributorRequest): Promise<QueryDistributorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDistributorEx(request, headers, runtime);
  }

  /**
   * Description: 代销机构获取二级用户详情数据
   * Summary: 代销机构获取二级用户详情数据
   */
  async queryDistributorEx(request: QueryDistributorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDistributorResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDistributorResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.distributor.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDistributorResponse({}));
  }

  /**
   * Description: 发行token
   * Summary: 发行token
   */
  async issueIssuerSubusertrade(request: IssueIssuerSubusertradeRequest): Promise<IssueIssuerSubusertradeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.issueIssuerSubusertradeEx(request, headers, runtime);
  }

  /**
   * Description: 发行token
   * Summary: 发行token
   */
  async issueIssuerSubusertradeEx(request: IssueIssuerSubusertradeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<IssueIssuerSubusertradeResponse> {
    Util.validateModel(request);
    return $tea.cast<IssueIssuerSubusertradeResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.subusertrade.issue", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new IssueIssuerSubusertradeResponse({}));
  }

  /**
   * Description: 赎回token
   * Summary: 赎回token
   */
  async redeemIssuerSubusertrade(request: RedeemIssuerSubusertradeRequest): Promise<RedeemIssuerSubusertradeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.redeemIssuerSubusertradeEx(request, headers, runtime);
  }

  /**
   * Description: 赎回token
   * Summary: 赎回token
   */
  async redeemIssuerSubusertradeEx(request: RedeemIssuerSubusertradeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RedeemIssuerSubusertradeResponse> {
    Util.validateModel(request);
    return $tea.cast<RedeemIssuerSubusertradeResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.subusertrade.redeem", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RedeemIssuerSubusertradeResponse({}));
  }

  /**
   * Description: 转移token
   * Summary: 转移token
   */
  async transferIssuerSubusertrade(request: TransferIssuerSubusertradeRequest): Promise<TransferIssuerSubusertradeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.transferIssuerSubusertradeEx(request, headers, runtime);
  }

  /**
   * Description: 转移token
   * Summary: 转移token
   */
  async transferIssuerSubusertradeEx(request: TransferIssuerSubusertradeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<TransferIssuerSubusertradeResponse> {
    Util.validateModel(request);
    return $tea.cast<TransferIssuerSubusertradeResponse>(await this.doRequest("1.0", "antdigital.webtrwatrade.issuer.subusertrade.transfer", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new TransferIssuerSubusertradeResponse({}));
  }

}
