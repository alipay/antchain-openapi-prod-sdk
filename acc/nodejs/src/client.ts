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

// 文件描述
export class FileDefine extends $tea.Model {
  // 调用方设定，保证文件唯一性。
  // 
  // 
  bizId: string;
  // 文件名称
  fileName: string;
  // 文件大小
  size?: number;
  // 文件key
  osskey: string;
  // 文件类型
  type: string;
  // 预览链接
  url?: string;
  static names(): { [key: string]: string } {
    return {
      bizId: 'biz_id',
      fileName: 'file_name',
      size: 'size',
      osskey: 'osskey',
      type: 'type',
      url: 'url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizId: 'string',
      fileName: 'string',
      size: 'number',
      osskey: 'string',
      type: 'string',
      url: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业奖项
export class Award extends $tea.Model {
  // 奖项名称
  // 
  // 
  awardName: string;
  // 奖项级别（参见附录十四）
  // 
  // 
  awardLevel: string;
  // 颁发日期（yyyy）
  // 
  // 
  issueDate: string;
  // 有效开始日期（yyyy-MM-dd）
  // 
  // 
  effectStartDate: string;
  // 有效结束日期（yyyy-MM-dd）
  // 
  // 
  effectEndDate: string;
  // 文件信息，支持上传多个文件
  // 
  // 
  fileDefines: FileDefine[];
  // key
  awardId: string;
  static names(): { [key: string]: string } {
    return {
      awardName: 'award_name',
      awardLevel: 'award_level',
      issueDate: 'issue_date',
      effectStartDate: 'effect_start_date',
      effectEndDate: 'effect_end_date',
      fileDefines: 'file_defines',
      awardId: 'award_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      awardName: 'string',
      awardLevel: 'string',
      issueDate: 'string',
      effectStartDate: 'string',
      effectEndDate: 'string',
      fileDefines: { 'type': 'array', 'itemType': FileDefine },
      awardId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业施工资质
export class Construction extends $tea.Model {
  // 证书编号
  // 
  // 
  certNum: string;
  // 发证机关
  // 
  // 
  issuingAuthority: string;
  // 资质类别
  certType: string;
  // 等级
  level: string;
  // 有效期开始日期（yyyy-MM-dd）
  // 
  // 
  effectStartDate: string;
  // 有效期结束日期（yyyy-MM-dd）
  // 
  // 
  effectEndDate: string;
  // 文件
  fileDefines?: FileDefine[];
  // key
  constructionId: string;
  // 证件名称
  certName: string;
  static names(): { [key: string]: string } {
    return {
      certNum: 'cert_num',
      issuingAuthority: 'issuing_authority',
      certType: 'cert_type',
      level: 'level',
      effectStartDate: 'effect_start_date',
      effectEndDate: 'effect_end_date',
      fileDefines: 'file_defines',
      constructionId: 'construction_id',
      certName: 'cert_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      certNum: 'string',
      issuingAuthority: 'string',
      certType: 'string',
      level: 'string',
      effectStartDate: 'string',
      effectEndDate: 'string',
      fileDefines: { 'type': 'array', 'itemType': FileDefine },
      constructionId: 'string',
      certName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业资信担保
export class Assure extends $tea.Model {
  // 担保ID
  // 
  // 
  assureId: string;
  // 文件信息，支持上传多个文件
  // 
  // 
  fileDefines: FileDefine[];
  static names(): { [key: string]: string } {
    return {
      assureId: 'assure_id',
      fileDefines: 'file_defines',
    };
  }

  static types(): { [key: string]: any } {
    return {
      assureId: 'string',
      fileDefines: { 'type': 'array', 'itemType': FileDefine },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业银行授信
export class BankCert extends $tea.Model {
  // 银行账号
  // 
  // 
  bankAccount: string;
  // 银行名称
  // 
  // 
  bankName: string;
  // 文件信息，支持上传多个文件
  // 
  // 
  fileDefines: FileDefine[];
  static names(): { [key: string]: string } {
    return {
      bankAccount: 'bank_account',
      bankName: 'bank_name',
      fileDefines: 'file_defines',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bankAccount: 'string',
      bankName: 'string',
      fileDefines: { 'type': 'array', 'itemType': FileDefine },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业资信财报
export class AccountResult extends $tea.Model {
  // 财报ID
  // 
  // 
  accResultId: string;
  // 文件信息，支持上传多个文件
  // 
  // 
  fileDefines: FileDefine[];
  static names(): { [key: string]: string } {
    return {
      accResultId: 'acc_result_id',
      fileDefines: 'file_defines',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accResultId: 'string',
      fileDefines: { 'type': 'array', 'itemType': FileDefine },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 关联企业信息
export class RefFirm extends $tea.Model {
  // 企业Id
  // 
  // 
  firmUserId: number;
  // did
  did: string;
  // 	
  // 企业所在地
  firmAddress: string;
  // 企业认证状态
  firmCertStatus: string;
  // 行业类型
  industryType: string;
  // 企业营业执照注册号
  // 
  // 
  certRegNo: string;
  // 营业执照文件osskey
  // 
  // 
  certRegFileId: string;
  // 营业文件类型(JPEG,JPG)
  // 
  // 
  certRegFileType: string;
  // 法定代表人证件类型
  lpCertType: string;
  // 法人证件号码	
  // 
  lpCertNo: string;
  // 法人姓名
  // 
  // 
  lpName: string;
  // 法人身份证正面图片字节信息，osskeyId
  // 
  // 
  lpCertFileFrontId: string;
  // 法人身份证正面图片文件类型
  // 
  // 
  lpCertFileFrontType: string;
  // 企业法人证件反面图片，osskeyId
  // 
  // 
  lpCertFileReverseId: string;
  // 法人身份证反面图片文件类型
  // 
  // 
  lpCertFileReverseType: string;
  // 施工资质
  // 
  // 
  constructions: Construction[];
  // 企业名称
  // 
  // 
  firmName: string;
  // 关联关系 （参见附录三）
  // 
  // 
  referType: string;
  // 资信-财报
  // 
  // 
  accountResults: AccountResult[];
  // 资信-担保
  // 
  // 
  assures: Assure[];
  // 奖项
  // 
  // 
  awards: Award[];
  // 银行授信
  // 
  // 
  bankCert: BankCert;
  // 类型
  firmType: string;
  // 银行授信状态
  bankCertStatus?: boolean;
  // 资质证书状态
  constructionStatus?: boolean;
  // 资信-财报状态
  accountResultStatus: boolean;
  // 奖项状态
  awardStatus?: boolean;
  static names(): { [key: string]: string } {
    return {
      firmUserId: 'firm_user_id',
      did: 'did',
      firmAddress: 'firm_address',
      firmCertStatus: 'firm_cert_status',
      industryType: 'industry_type',
      certRegNo: 'cert_reg_no',
      certRegFileId: 'cert_reg_file_id',
      certRegFileType: 'cert_reg_file_type',
      lpCertType: 'lp_cert_type',
      lpCertNo: 'lp_cert_no',
      lpName: 'lp_name',
      lpCertFileFrontId: 'lp_cert_file_front_id',
      lpCertFileFrontType: 'lp_cert_file_front_type',
      lpCertFileReverseId: 'lp_cert_file_reverse_id',
      lpCertFileReverseType: 'lp_cert_file_reverse_type',
      constructions: 'constructions',
      firmName: 'firm_name',
      referType: 'refer_type',
      accountResults: 'account_results',
      assures: 'assures',
      awards: 'awards',
      bankCert: 'bank_cert',
      firmType: 'firm_type',
      bankCertStatus: 'bank_cert_status',
      constructionStatus: 'construction_status',
      accountResultStatus: 'account_result_status',
      awardStatus: 'award_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      firmUserId: 'number',
      did: 'string',
      firmAddress: 'string',
      firmCertStatus: 'string',
      industryType: 'string',
      certRegNo: 'string',
      certRegFileId: 'string',
      certRegFileType: 'string',
      lpCertType: 'string',
      lpCertNo: 'string',
      lpName: 'string',
      lpCertFileFrontId: 'string',
      lpCertFileFrontType: 'string',
      lpCertFileReverseId: 'string',
      lpCertFileReverseType: 'string',
      constructions: { 'type': 'array', 'itemType': Construction },
      firmName: 'string',
      referType: 'string',
      accountResults: { 'type': 'array', 'itemType': AccountResult },
      assures: { 'type': 'array', 'itemType': Assure },
      awards: { 'type': 'array', 'itemType': Award },
      bankCert: BankCert,
      firmType: 'string',
      bankCertStatus: 'boolean',
      constructionStatus: 'boolean',
      accountResultStatus: 'boolean',
      awardStatus: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合同流程签名人
export class ContractFlowSigner extends $tea.Model {
  // 签署人账号id
  // 
  signerAccountId: string;
  // 签约主体的账号id（个人/企业）；如签署人本签署，则返回签署人账号id；如签署人代机构签署，则返回机构账号id
  // 
  signerAuthorizedAccountId: string;
  // 签约主体名称
  // 
  signerAuthorizedAccountName: string;
  // 签署主体是否已实名
  // 
  signerAuthorizedAccountRealName: boolean;
  // 签署主体类型, 0-个人, 1-机构
  // 
  signerAuthorizedAccountType: number;
  // 签署人名称
  // 
  signerName: string;
  // 签署人是否已实名
  // 
  signerRealName: boolean;
  // 签署顺序
  // 
  signOrder: number;
  // 签署状态, 0-待签, 1-未签, 2-已签 3-待审批 4-拒签
  // 
  signStatus: number;
  // 本次签署任务对应指定的第三方业务流水号id，当存在多个第三方业务流水号id时，返回多个，并逗号隔开
  // 
  thirdOrderNo: string;
  static names(): { [key: string]: string } {
    return {
      signerAccountId: 'signer_account_id',
      signerAuthorizedAccountId: 'signer_authorized_account_id',
      signerAuthorizedAccountName: 'signer_authorized_account_name',
      signerAuthorizedAccountRealName: 'signer_authorized_account_real_name',
      signerAuthorizedAccountType: 'signer_authorized_account_type',
      signerName: 'signer_name',
      signerRealName: 'signer_real_name',
      signOrder: 'sign_order',
      signStatus: 'sign_status',
      thirdOrderNo: 'third_order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      signerAccountId: 'string',
      signerAuthorizedAccountId: 'string',
      signerAuthorizedAccountName: 'string',
      signerAuthorizedAccountRealName: 'boolean',
      signerAuthorizedAccountType: 'number',
      signerName: 'string',
      signerRealName: 'boolean',
      signOrder: 'number',
      signStatus: 'number',
      thirdOrderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 个人认证信息
export class UserDetailData extends $tea.Model {
  // 账户Id
  userId: number;
  // 统一身份id
  // 
  // 
  did: string;
  // 账户名
  // 
  // 
  loginId: string;
  // 用户姓名
  // 
  // 
  userName: string;
  // 用户类型
  userType: string;
  // 账户类型
  accountType: string;
  // 个人认证状态
  certStatus: string;
  // 邮箱
  email: string;
  // 手机号
  telphone: string;
  // 个人证件类型
  certType: string;
  // 证件号码	
  // 
  certNum: string;
  // cert_file_front_id
  certFileFrontId: string;
  // 个人证件正面类型
  certFileFrontType: string;
  // 个人证件反面图片，osskeyId
  // 
  // 
  certFileReverseId: string;
  // 个人证件反面类型。JPG
  // 
  // 
  certFileReverseType: string;
  // 关联企业信息
  // 
  // 
  refFirms: RefFirm[];
  // 是否有印章
  sealFlag?: boolean;
  static names(): { [key: string]: string } {
    return {
      userId: 'user_id',
      did: 'did',
      loginId: 'login_id',
      userName: 'user_name',
      userType: 'user_type',
      accountType: 'account_type',
      certStatus: 'cert_status',
      email: 'email',
      telphone: 'telphone',
      certType: 'cert_type',
      certNum: 'cert_num',
      certFileFrontId: 'cert_file_front_id',
      certFileFrontType: 'cert_file_front_type',
      certFileReverseId: 'cert_file_reverse_id',
      certFileReverseType: 'cert_file_reverse_type',
      refFirms: 'ref_firms',
      sealFlag: 'seal_flag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userId: 'number',
      did: 'string',
      loginId: 'string',
      userName: 'string',
      userType: 'string',
      accountType: 'string',
      certStatus: 'string',
      email: 'string',
      telphone: 'string',
      certType: 'string',
      certNum: 'string',
      certFileFrontId: 'string',
      certFileFrontType: 'string',
      certFileReverseId: 'string',
      certFileReverseType: 'string',
      refFirms: { 'type': 'array', 'itemType': RefFirm },
      sealFlag: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 返回数据结构体
export class TokenData extends $tea.Model {
  // 授权token
  accessToken: string;
  // 授权类型
  tokenType: string;
  // 过期时间
  expiresln: number;
  // 重新刷新Token
  refreshToken: string;
  // sessionid
  sessionId?: string;
  static names(): { [key: string]: string } {
    return {
      accessToken: 'access_token',
      tokenType: 'token_type',
      expiresln: 'expiresln',
      refreshToken: 'refresh_token',
      sessionId: 'session_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accessToken: 'string',
      tokenType: 'string',
      expiresln: 'number',
      refreshToken: 'string',
      sessionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合同文档地址
export class ContractDocAddress extends $tea.Model {
  // 电子合同文档ID
  // 
  fileId: string;
  // 电子合同文档名称，默认文件名称
  // 
  fileName: string;
  // 电子合同下载文档地址, 有效时间1小时
  // 
  fileUrl: string;
  // 链上hash
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      fileId: 'file_id',
      fileName: 'file_name',
      fileUrl: 'file_url',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fileId: 'string',
      fileName: 'string',
      fileUrl: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 农民工基本信息
export class WorkersBaseInfo extends $tea.Model {
  // 姓名
  fullName: string;
  // 身份证号
  idCard: string;
  // 身份证有效期起
  idCardStartDate?: string;
  // 身份证有效期止
  idCardEndDate?: string;
  // 农民工个人did（实名认证后才有工号id）
  workersDid?: string;
  // 手机号
  mobileNo?: string;
  // 工种
  workType: string[];
  // 工作状态   [1.进场   2.退场]
  workState?: string;
  // 进场时间
  enterTime: string;
  // 退场时间
  quitTime?: string;
  // 合同薪资（单位：元）
  compensation?: string;
  static names(): { [key: string]: string } {
    return {
      fullName: 'full_name',
      idCard: 'id_card',
      idCardStartDate: 'id_card_start_date',
      idCardEndDate: 'id_card_end_date',
      workersDid: 'workers_did',
      mobileNo: 'mobile_no',
      workType: 'work_type',
      workState: 'work_state',
      enterTime: 'enter_time',
      quitTime: 'quit_time',
      compensation: 'compensation',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fullName: 'string',
      idCard: 'string',
      idCardStartDate: 'string',
      idCardEndDate: 'string',
      workersDid: 'string',
      mobileNo: 'string',
      workType: { 'type': 'array', 'itemType': 'string' },
      workState: 'string',
      enterTime: 'string',
      quitTime: 'string',
      compensation: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签约字段
export class ContractSignField extends $tea.Model {
  // account_id
  accountId: string;
  // file_id
  fileId: string;
  // signfield_id
  signfieldId: string;
  static names(): { [key: string]: string } {
    return {
      accountId: 'account_id',
      fileId: 'file_id',
      signfieldId: 'signfield_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accountId: 'string',
      fileId: 'string',
      signfieldId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 农民工工资发放
export class WorkersWagePayment extends $tea.Model {
  // 薪资年月
  payYM: string;
  // 工资是否发放[已发放 未发放]
  payWages: string;
  static names(): { [key: string]: string } {
    return {
      payYM: 'pay_y_m',
      payWages: 'pay_wages',
    };
  }

  static types(): { [key: string]: any } {
    return {
      payYM: 'string',
      payWages: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 账号信息
export class UserData extends $tea.Model {
  // 账号id
  loginId: string;
  // 账号id
  userId: number;
  // 用户类型
  userType: string;
  // 用户姓名
  userName: string;
  // 关联企业
  refFirms: RefFirm[];
  // 认证状态
  certStatus: string;
  // 账户类别
  accountType: string;
  // did
  did: string;
  static names(): { [key: string]: string } {
    return {
      loginId: 'login_id',
      userId: 'user_id',
      userType: 'user_type',
      userName: 'user_name',
      refFirms: 'ref_firms',
      certStatus: 'cert_status',
      accountType: 'account_type',
      did: 'did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      loginId: 'string',
      userId: 'number',
      userType: 'string',
      userName: 'string',
      refFirms: { 'type': 'array', 'itemType': RefFirm },
      certStatus: 'string',
      accountType: 'string',
      did: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合同关联主体
export class Contractaccountapplication extends $tea.Model {
  // 邮箱
  email: string;
  // 身份证号码
  idNumber: string;
  // 身份证类型
  idType: string;
  // 电话号
  mobile: string;
  // 姓名
  name: string;
  // 用户id
  userId: string;
  static names(): { [key: string]: string } {
    return {
      email: 'email',
      idNumber: 'id_number',
      idType: 'id_type',
      mobile: 'mobile',
      name: 'name',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      email: 'string',
      idNumber: 'string',
      idType: 'string',
      mobile: 'string',
      name: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 存证信息
export class ContractNotaryInfo extends $tea.Model {
  // 存证的内容哈希值
  // 
  contentHash: string;
  // 存证相关联的文档ID
  // 
  docId: string;
  // 存证事务ID
  // 
  transactionId: string;
  // 存证地址
  txHash: string;
  static names(): { [key: string]: string } {
    return {
      contentHash: 'content_hash',
      docId: 'doc_id',
      transactionId: 'transaction_id',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      contentHash: 'string',
      docId: 'string',
      transactionId: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ContractSignFieldApplication
export class ContractSignFieldApplication extends $tea.Model {
  // add_sign_time
  addSignTime?: boolean;
  // authorized_account_id
  authorizedAccountId: string;
  // file_id
  fileId: string;
  // order
  order?: string;
  // pos_page
  posPage: string;
  // pos_x
  posX: string;
  // seal_id
  sealId?: string;
  // third_order_no
  thirdOrderNo?: string;
  // pos_y
  posY: string;
  // width
  width?: string;
  // signType
  signType?: number;
  static names(): { [key: string]: string } {
    return {
      addSignTime: 'add_sign_time',
      authorizedAccountId: 'authorized_account_id',
      fileId: 'file_id',
      order: 'order',
      posPage: 'pos_page',
      posX: 'pos_x',
      sealId: 'seal_id',
      thirdOrderNo: 'third_order_no',
      posY: 'pos_y',
      width: 'width',
      signType: 'sign_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      addSignTime: 'boolean',
      authorizedAccountId: 'string',
      fileId: 'string',
      order: 'string',
      posPage: 'string',
      posX: 'string',
      sealId: 'string',
      thirdOrderNo: 'string',
      posY: 'string',
      width: 'string',
      signType: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ContractHandSignFieldApplication
export class ContractHandSignFieldApplication extends $tea.Model {
  // account_id
  accountId: string;
  // file_id
  fileId: string;
  // order
  order?: number;
  // pos_page
  posPage?: string;
  // posX
  posX?: string;
  // posY
  posY?: string;
  // sealId
  sealId?: string;
  // signDateBeanType
  signDateBeanType: number;
  // signDateFontSize
  signDateFontSize: number;
  // sign_date_format
  signDateFormat?: string;
  // signDatePosPage
  signDatePosPage?: number;
  // signDatePosX
  signDatePosX?: string;
  // sign_date_pos_y
  signDatePosY?: string;
  // sign_type
  signType?: number;
  // third_order_no
  thirdOrderNo?: string;
  // width
  width?: string;
  // seal_ids
  sealIds?: string[];
  // 签名字段type
  signFieldType?: number;
  static names(): { [key: string]: string } {
    return {
      accountId: 'account_id',
      fileId: 'file_id',
      order: 'order',
      posPage: 'pos_page',
      posX: 'pos_x',
      posY: 'pos_y',
      sealId: 'seal_id',
      signDateBeanType: 'sign_date_bean_type',
      signDateFontSize: 'sign_date_font_size',
      signDateFormat: 'sign_date_format',
      signDatePosPage: 'sign_date_pos_page',
      signDatePosX: 'sign_date_pos_x',
      signDatePosY: 'sign_date_pos_y',
      signType: 'sign_type',
      thirdOrderNo: 'third_order_no',
      width: 'width',
      sealIds: 'seal_ids',
      signFieldType: 'sign_field_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accountId: 'string',
      fileId: 'string',
      order: 'number',
      posPage: 'string',
      posX: 'string',
      posY: 'string',
      sealId: 'string',
      signDateBeanType: 'number',
      signDateFontSize: 'number',
      signDateFormat: 'string',
      signDatePosPage: 'number',
      signDatePosX: 'string',
      signDatePosY: 'string',
      signType: 'number',
      thirdOrderNo: 'string',
      width: 'string',
      sealIds: { 'type': 'array', 'itemType': 'string' },
      signFieldType: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 农民工考勤
export class WorkersCheckAttendance extends $tea.Model {
  // 考勤类型  [1.入场 2.退场]
  attendanceType: string;
  // 打卡时间
  clockInTime: string;
  static names(): { [key: string]: string } {
    return {
      attendanceType: 'attendance_type',
      clockInTime: 'clock_in_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      attendanceType: 'string',
      clockInTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签署区列表详情
export class ContractSignFieldDetail extends $tea.Model {
  // 签约主体类别，0-个人，1-机构，默认0,2 是不限
  actorIndentityType: number;
  // 添加时间
  addTime: number;
  // 是否指定位置，TRUE表示不允许更新位置，配置项，无默认值
  assignedPosbean: boolean;
  // 是否指定印章数据，TRUE表示不允许更新印章，配置项，无默认值
  assignedSeal: boolean;
  // 签约主体账号标识，将使用该主体账号对应的数字证书完成本次签署，如：当存在签署操作人代某机构签署时，需要传入该机构的账号id
  authorizedAccountId: string;
  // 是否自动执行，TRUE需要静默授权，配置项，无默认值
  autoExecute: boolean;
  // 执行失败原因
  executeFailedReason: string;
  // 文件file id
  fileId: string;
  // 流程id
  flowId: string;
  // 签署区顺序，默认1,且不小于1，顺序越小越先处理
  order: number;
  // 页码信息，可以_,_或_-_分割
  posPage: string;
  // x坐标
  posX: string;
  // y坐标
  posY: string;
  // 印章文件file key
  sealFileKey: string;
  // 印章id
  sealId: string;
  // 印章类型，支持多种类型时逗号分割，0-手绘印章，1-模版印章，为空不限制
  sealType: string;
  // 签署操作人个人账号标识，即操作本次签署的个人，如需e签宝通知用户签署，则系统向该账号下绑定的手机、邮箱发送签署链接
  signerAccountId: string;
  // 签署区Id
  signfieldId: string;
  // 签署类型，0-不限，1-单页签署，2-骑缝签署,4-关键字签署，默认1
  signType: number;
  // 签署区状态（0："等待执行，1："执行中"，2："执行失败"，3："审批中"，4： "执行完成")
  status: number;
  // 状态描述
  statusDescription: string;
  // 签署区宽
  width: string;
  static names(): { [key: string]: string } {
    return {
      actorIndentityType: 'actor_indentity_type',
      addTime: 'add_time',
      assignedPosbean: 'assigned_posbean',
      assignedSeal: 'assigned_seal',
      authorizedAccountId: 'authorized_account_id',
      autoExecute: 'auto_execute',
      executeFailedReason: 'execute_failed_reason',
      fileId: 'file_id',
      flowId: 'flow_id',
      order: 'order',
      posPage: 'pos_page',
      posX: 'pos_x',
      posY: 'pos_y',
      sealFileKey: 'seal_file_key',
      sealId: 'seal_id',
      sealType: 'seal_type',
      signerAccountId: 'signer_account_id',
      signfieldId: 'signfield_id',
      signType: 'sign_type',
      status: 'status',
      statusDescription: 'status_description',
      width: 'width',
    };
  }

  static types(): { [key: string]: any } {
    return {
      actorIndentityType: 'number',
      addTime: 'number',
      assignedPosbean: 'boolean',
      assignedSeal: 'boolean',
      authorizedAccountId: 'string',
      autoExecute: 'boolean',
      executeFailedReason: 'string',
      fileId: 'string',
      flowId: 'string',
      order: 'number',
      posPage: 'string',
      posX: 'string',
      posY: 'string',
      sealFileKey: 'string',
      sealId: 'string',
      sealType: 'string',
      signerAccountId: 'string',
      signfieldId: 'string',
      signType: 'number',
      status: 'number',
      statusDescription: 'string',
      width: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 代扣订单信息
export class ContractPaymentOrderInfo extends $tea.Model {
  // 代扣触发时间，精确到毫秒 java.lang.System#currentTimeMillis()
  // 
  payDate: number;
  // 代扣金额，整数 精确到分
  // 
  payMoney: number;
  // 是否用户签署成功后立即触发第一期代扣
  // 
  triggerImmediately?: number;
  static names(): { [key: string]: string } {
    return {
      payDate: 'pay_date',
      payMoney: 'pay_money',
      triggerImmediately: 'trigger_immediately',
    };
  }

  static types(): { [key: string]: any } {
    return {
      payDate: 'number',
      payMoney: 'number',
      triggerImmediately: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 财报信息
export class FileInfo extends $tea.Model {
  // 业务id
  bizId?: string;
  // 财报文件，base64
  fileStr: string;
  // 文件名称（企业财报.jpg）
  fileName: string;
  // 文件大小(byte长度)
  fileSize: number;
  // 文件类型(jpg)
  fileType: string;
  static names(): { [key: string]: string } {
    return {
      bizId: 'biz_id',
      fileStr: 'file_str',
      fileName: 'file_name',
      fileSize: 'file_size',
      fileType: 'file_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizId: 'string',
      fileStr: 'string',
      fileName: 'string',
      fileSize: 'number',
      fileType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 待签署文件
export class ContractDocument extends $tea.Model {
  // 是否加密，0-不加密，1-加，默认0
  // 
  encryption?: number;
  // 电子合同文档的ID
  // 
  fileId: string;
  // 电子合同文档名称，默认文件名称
  // 
  fileName?: string;
  // 电子合同文档密码, 如果encryption值为1, 文档密码不能为空，默认没有密码
  // 
  filePassword?: string;
  static names(): { [key: string]: string } {
    return {
      encryption: 'encryption',
      fileId: 'file_id',
      fileName: 'file_name',
      filePassword: 'file_password',
    };
  }

  static types(): { [key: string]: any } {
    return {
      encryption: 'number',
      fileId: 'string',
      fileName: 'string',
      filePassword: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// OneStepSignField
export class OneStepSignField extends $tea.Model {
  // accountId
  accountId: string;
  // file_id
  fileId: string;
  // order
  order?: number;
  // posPage
  posPage: string;
  // posX
  posX: string;
  // posY
  posY: string;
  // sealId
  sealId?: string;
  // sign_date_bean_type
  signDateBeanType?: number;
  // sign_date_font_size
  signDateFontSize?: number;
  // sign_date_format
  signDateFormat?: string;
  // sign_date_pos_page
  signDatePosPage?: number;
  // sign_date_pos_x
  signDatePosX?: string;
  //  
  signDatePosY?: string;
  // signType
  signType?: number;
  // third_order_no
  thirdOrderNo?: string;
  // width
  width?: string;
  // auto_execute
  autoExecute?: boolean;
  static names(): { [key: string]: string } {
    return {
      accountId: 'account_id',
      fileId: 'file_id',
      order: 'order',
      posPage: 'pos_page',
      posX: 'pos_x',
      posY: 'pos_y',
      sealId: 'seal_id',
      signDateBeanType: 'sign_date_bean_type',
      signDateFontSize: 'sign_date_font_size',
      signDateFormat: 'sign_date_format',
      signDatePosPage: 'sign_date_pos_page',
      signDatePosX: 'sign_date_pos_x',
      signDatePosY: 'sign_date_pos_y',
      signType: 'sign_type',
      thirdOrderNo: 'third_order_no',
      width: 'width',
      autoExecute: 'auto_execute',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accountId: 'string',
      fileId: 'string',
      order: 'number',
      posPage: 'string',
      posX: 'string',
      posY: 'string',
      sealId: 'string',
      signDateBeanType: 'number',
      signDateFontSize: 'number',
      signDateFormat: 'string',
      signDatePosPage: 'number',
      signDatePosX: 'string',
      signDatePosY: 'string',
      signType: 'number',
      thirdOrderNo: 'string',
      width: 'string',
      autoExecute: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 法人认证信息
export class CertifyLPDTO extends $tea.Model {
  // 认证id
  certifyId: string;
  // 二维码url
  qrUrl: string;
  //  二维码中的Logo的图片地址
  imgUrl: string;
  //  二维码中Logo缩放的比例系数，如5表示长宽最小值的1/5
  ratio: string;
  // 过期时间戳，单位毫秒
  expires: number;
  static names(): { [key: string]: string } {
    return {
      certifyId: 'certify_id',
      qrUrl: 'qr_url',
      imgUrl: 'img_url',
      ratio: 'ratio',
      expires: 'expires',
    };
  }

  static types(): { [key: string]: any } {
    return {
      certifyId: 'string',
      qrUrl: 'string',
      imgUrl: 'string',
      ratio: 'string',
      expires: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合约签约配置
export class Contractsignflowconfig extends $tea.Model {
  // 回调通知地址 ,默认取项目配置通知地址
  // 
  noticeDeveloperUrl?: string;
  // 通知方式，逗号分割，1-短信，2-邮件 。默认值1，请务必请选择一个通知方式，否则客户将接收不到流程的签署通知和审批通知，如果流程需要审批，将导致审批无法完成；如果客户需要不通知，可以设置notice_type为""
  // 
  noticeType: string;
  // 签署成功或者流程结束后的默认重定向地址，默认签署完成停在当前页面
  // 
  redirectUrl?: string;
  // 签署成功或者流程结束后的默认重定向地址，默认签署完成停在当前页面
  // 
  signPlatform?: string;
  // 签署失败时的跳转地址，如果不做单独配置，默认与redirect_url一致（配合twc.notary.contract.signflow.create接口使用）
  // 
  redirectUrlOnFailure?: string;
  // 是否允许自由签署，默认false（配合twc.notary.contract.signflow.create接口使用）
  // 
  freeSignature?: boolean;
  static names(): { [key: string]: string } {
    return {
      noticeDeveloperUrl: 'notice_developer_url',
      noticeType: 'notice_type',
      redirectUrl: 'redirect_url',
      signPlatform: 'sign_platform',
      redirectUrlOnFailure: 'redirect_url_on_failure',
      freeSignature: 'free_signature',
    };
  }

  static types(): { [key: string]: any } {
    return {
      noticeDeveloperUrl: 'string',
      noticeType: 'string',
      redirectUrl: 'string',
      signPlatform: 'string',
      redirectUrlOnFailure: 'string',
      freeSignature: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业银行授信
export class BandCert extends $tea.Model {
  // 银行账号
  // 
  // 
  bankAccount: string;
  // 银行名称
  // 
  // 
  bankName: string;
  // 文件信息，支持上传多个文件
  // 
  // 
  fileDefines: FileDefine[];
  static names(): { [key: string]: string } {
    return {
      bankAccount: 'bank_account',
      bankName: 'bank_name',
      fileDefines: 'file_defines',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bankAccount: 'string',
      bankName: 'string',
      fileDefines: { 'type': 'array', 'itemType': FileDefine },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 保证金对象
export class SecurityFundDto extends $tea.Model {
  // 保证金类型
  type: string;
  // 金额
  amount: string;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      amount: 'amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      amount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合同乙方信息
export class PartyBFirmDto extends $tea.Model {
  // 乙方统一社会信用代码
  partyBBidderCode: string;
  // 乙方名称
  partyBName: string;
  // 乙方授权代表Did
  partyBAuditDid: string;
  static names(): { [key: string]: string } {
    return {
      partyBBidderCode: 'party_b_bidder_code',
      partyBName: 'party_b_name',
      partyBAuditDid: 'party_b_audit_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      partyBBidderCode: 'string',
      partyBName: 'string',
      partyBAuditDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合同企业主体
export class Contractorganizationapplication extends $tea.Model {
  // 执照号码
  idNumber: string;
  // 执照类型
  idType: string;
  // 法人名称
  legalPerson: string;
  // 法人证件号
  legalPersonId: string;
  // 企业名称
  name: string;
  // 组织id
  organizationId: string;
  static names(): { [key: string]: string } {
    return {
      idNumber: 'id_number',
      idType: 'id_type',
      legalPerson: 'legal_person',
      legalPersonId: 'legal_person_id',
      name: 'name',
      organizationId: 'organization_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      idNumber: 'string',
      idType: 'string',
      legalPerson: 'string',
      legalPersonId: 'string',
      name: 'string',
      organizationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyUserPwdRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 登录账号
  loginId: string;
  // 登录密码
  password: string;
  // 过期时间指定(单位 秒)，默认30分钟
  expires?: number;
  // 租户id
  tenantId: string;
  // 公钥名称
  pubkeyName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      loginId: 'login_id',
      password: 'password',
      expires: 'expires',
      tenantId: 'tenant_id',
      pubkeyName: 'pubkey_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      loginId: 'string',
      password: 'string',
      expires: 'number',
      tenantId: 'string',
      pubkeyName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyUserPwdResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回数据
  data?: TokenData;
  // 用户id返回值
  userId?: number;
  // did
  did?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      userId: 'user_id',
      did: 'did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: TokenData,
      userId: 'number',
      did: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyUserSmsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 邮箱 or 短信 二选一
  telphone?: string;
  // 过期时间（单位：秒），默认30分钟
  expires?: number;
  // 重发短信时间（单位：S），默认60s
  intervals?: number;
  // 是否立刻发发送短信(1 立刻发送 0 等待业务触发)
  sendDirect?: number;
  // 租户id
  tenantId: string;
  // 邮箱
  email?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      telphone: 'telphone',
      expires: 'expires',
      intervals: 'intervals',
      sendDirect: 'send_direct',
      tenantId: 'tenant_id',
      email: 'email',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      telphone: 'string',
      expires: 'number',
      intervals: 'number',
      sendDirect: 'number',
      tenantId: 'string',
      email: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyUserSmsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 短信重新触发url
  // 
  // 
  smsResendUrl?: string;
  // 核验id
  // 
  // 
  verifyId?: string;
  // did_24c93459216945468fdf1d899c521910
  did?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      smsResendUrl: 'sms_resend_url',
      verifyId: 'verify_id',
      did: 'did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      smsResendUrl: 'string',
      verifyId: 'string',
      did: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyUserSmsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 核验id，sms_login_apply 产生
  verifyId: string;
  // 短信code
  checkCode: string;
  // 租户id
  tenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      verifyId: 'verify_id',
      checkCode: 'check_code',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      verifyId: 'string',
      checkCode: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyUserSmsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回数据
  data?: TokenData;
  // 新增userId返回值
  userId?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: TokenData,
      userId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthUserRefRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 操作员id，一般是C类用户
  operatorId: number;
  // 待登录的B类账号id
  refUserId: number;
  // operatorId 用户登录时对应的accessToken
  // 
  // 
  accessToken: string;
  // 是否设为默认企业(1 设置默认企业 0 切换临时企业)
  // 
  // 
  setDefault: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      operatorId: 'operator_id',
      refUserId: 'ref_user_id',
      accessToken: 'access_token',
      setDefault: 'set_default',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      operatorId: 'number',
      refUserId: 'number',
      accessToken: 'string',
      setDefault: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthUserRefResponse extends $tea.Model {
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

export class CloseUserLoginRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 账号id
  userId: number;
  // 租户id
  tenantId: string;
  // accessToken
  accessToken: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      tenantId: 'tenant_id',
      accessToken: 'access_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'number',
      tenantId: 'string',
      accessToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CloseUserLoginResponse extends $tea.Model {
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

export class CreateUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 登录名称
  loginId?: string;
  // 非登录账号无需密码
  password?: string;
  // 租户id
  tenantId: string;
  // 用户类型
  userType: string;
  // 用户名称
  userName?: string;
  // 手机号码
  telphone?: string;
  // 用户邮箱
  email?: string;
  // 创建者,一般是C创建B类账号。非提其他主体创建，可以不传
  creatorUserId?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      loginId: 'login_id',
      password: 'password',
      tenantId: 'tenant_id',
      userType: 'user_type',
      userName: 'user_name',
      telphone: 'telphone',
      email: 'email',
      creatorUserId: 'creator_user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      loginId: 'string',
      password: 'string',
      tenantId: 'string',
      userType: 'string',
      userName: 'string',
      telphone: 'string',
      email: 'string',
      creatorUserId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateUserResponse extends $tea.Model {
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

export class GetUserCurrentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 账号id
  userId: number;
  // 租户id
  tenantId: string;
  // 不传默认是 BASE_INFO
  // BASE_INFO 基本信息
  // ORG_CERT_FILE 企业图片
  // LP_CERT_FILE 法人图片
  queryOptions?: string[];
  // 企业用户userId
  firmUserId?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      tenantId: 'tenant_id',
      queryOptions: 'query_options',
      firmUserId: 'firm_user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'number',
      tenantId: 'string',
      queryOptions: { 'type': 'array', 'itemType': 'string' },
      firmUserId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetUserCurrentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回数据
  data?: UserDetailData;
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
      data: UserDetailData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyFirmRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 账号id
  userId: number;
  // 企业名称
  firmName?: string;
  // 企业类型
  firmType?: string;
  // 企业营业执照注册号
  certRegNo?: string;
  // 企业营业执照图片，osskey
  certRegFileId?: string;
  // 法人证件类型
  lpCertType?: string;
  // 证件号码
  lpCertNo?: string;
  // 企业法人证件正面图片
  lpCertFileFrontId?: string;
  // 企业法人证件反面图片
  // 
  // 
  lpCertFileReverseId?: string;
  // JPEG,JPG
  certRegFileType?: string;
  // JPG
  lpCertFileFrontType?: string;
  // 身份证反面文件类型
  lpCertFileReverseType?: string;
  // 法人姓名
  lpName?: string;
  // 租户信息
  tenantId: string;
  // 行业类型
  industryType?: string;
  // 公司所在地
  firmAddress?: string;
  // 提交类型
  operationType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      firmName: 'firm_name',
      firmType: 'firm_type',
      certRegNo: 'cert_reg_no',
      certRegFileId: 'cert_reg_file_id',
      lpCertType: 'lp_cert_type',
      lpCertNo: 'lp_cert_no',
      lpCertFileFrontId: 'lp_cert_file_front_id',
      lpCertFileReverseId: 'lp_cert_file_reverse_id',
      certRegFileType: 'cert_reg_file_type',
      lpCertFileFrontType: 'lp_cert_file_front_type',
      lpCertFileReverseType: 'lp_cert_file_reverse_type',
      lpName: 'lp_name',
      tenantId: 'tenant_id',
      industryType: 'industry_type',
      firmAddress: 'firm_address',
      operationType: 'operation_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'number',
      firmName: 'string',
      firmType: 'string',
      certRegNo: 'string',
      certRegFileId: 'string',
      lpCertType: 'string',
      lpCertNo: 'string',
      lpCertFileFrontId: 'string',
      lpCertFileReverseId: 'string',
      certRegFileType: 'string',
      lpCertFileFrontType: 'string',
      lpCertFileReverseType: 'string',
      lpName: 'string',
      tenantId: 'string',
      industryType: 'string',
      firmAddress: 'string',
      operationType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyFirmResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 企业分布式did
  did?: string;
  // 法人认证信息
  certifyLpDto?: CertifyLPDTO;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      did: 'did',
      certifyLpDto: 'certify_lp_dto',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      did: 'string',
      certifyLpDto: CertifyLPDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 账号id
  userId: number;
  // 个人名称
  name: string;
  // 证件类型
  certType: string;
  // 证件号码
  certNum: string;
  // 个人证件正面图片,osskey值
  // 
  certFileFrontId?: string;
  // 个人证件反面图片,oss的key值
  certFileReverseId?: string;
  // JPG
  certFileFrontType?: string;
  // 个人证件文件反面，文件类型
  certFileReverseType?: string;
  // 租户id
  tenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      name: 'name',
      certType: 'cert_type',
      certNum: 'cert_num',
      certFileFrontId: 'cert_file_front_id',
      certFileReverseId: 'cert_file_reverse_id',
      certFileFrontType: 'cert_file_front_type',
      certFileReverseType: 'cert_file_reverse_type',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'number',
      name: 'string',
      certType: 'string',
      certNum: 'string',
      certFileFrontId: 'string',
      certFileReverseId: 'string',
      certFileFrontType: 'string',
      certFileReverseType: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyUserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 验证成功，颁发个人did
  did?: string;
  // 个人二维码认证信息
  certifyLpDto?: CertifyLPDTO;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      did: 'did',
      certifyLpDto: 'certify_lp_dto',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      did: 'string',
      certifyLpDto: CertifyLPDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RecognizeOcrFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件id
  fileId: string;
  // 文件类型
  fileType: string;
  // 证件类型
  certType: string;
  // 租户id
  tenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileId: 'file_id',
      fileType: 'file_type',
      certType: 'cert_type',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileId: 'string',
      fileType: 'string',
      certType: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RecognizeOcrFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 解析数据结果，对应不同证件
  parseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      parseData: 'parse_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      parseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CertifyCertifyFirmmetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 自定义唯一id
  bizId: string;
  // 租户类型
  tenantId: string;
  // 企业名称
  firmName: string;
  // 企业营业执照号
  certNo: string;
  // 法人姓名
  lpCertName: string;
  // 法人身份证号
  lpCertNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      tenantId: 'tenant_id',
      firmName: 'firm_name',
      certNo: 'cert_no',
      lpCertName: 'lp_cert_name',
      lpCertNo: 'lp_cert_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      tenantId: 'string',
      firmName: 'string',
      certNo: 'string',
      lpCertName: 'string',
      lpCertNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CertifyCertifyFirmmetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 企业did
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

export class CertifyCertifyPersonmetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 自定义唯一id
  bizId: string;
  // 租户类型
  tenantId: string;
  // 姓名
  userName: string;
  // 身份证号
  userCertNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      tenantId: 'tenant_id',
      userName: 'user_name',
      userCertNo: 'user_cert_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      tenantId: 'string',
      userName: 'string',
      userCertNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CertifyCertifyPersonmetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 个人did
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

export class CertifyCertifyFaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 自定义唯一id
  bizId: string;
  // 租户类型
  tenantId: string;
  // 姓名
  userName: string;
  // 身份证号
  userCertNo: string;
  // 前端页面回调地址
  frontCallbackUrl?: string;
  // 后端接口回调地址
  backCallbackUrl?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      tenantId: 'tenant_id',
      userName: 'user_name',
      userCertNo: 'user_cert_no',
      frontCallbackUrl: 'front_callback_url',
      backCallbackUrl: 'back_callback_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      tenantId: 'string',
      userName: 'string',
      userCertNo: 'string',
      frontCallbackUrl: 'string',
      backCallbackUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CertifyCertifyFaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 跳转url
  redirectUrl?: string;
  // 校验id
  verifyId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      redirectUrl: 'redirect_url',
      verifyId: 'verify_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      redirectUrl: 'string',
      verifyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryQueryFacecertifyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 自定义唯一id
  bizId: string;
  // 租户类型
  tenantId: string;
  // 校验id
  verifyId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      tenantId: 'tenant_id',
      verifyId: 'verify_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      tenantId: 'string',
      verifyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryQueryFacecertifyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  // 认证状态
  // VERIFY_SUCCESS：认证成功
  // VERIFY_PROCESSING：正在认证
  // VERIFY_FAILED：认证失败
  verifyStatus?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      verifyStatus: 'verify_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      verifyStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SwitchSwitchFirmidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 账号id
  userId: number;
  // 企业id
  firmId: number;
  // 登录sessionId
  sessionId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      firmId: 'firm_id',
      sessionId: 'session_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'number',
      firmId: 'number',
      sessionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SwitchSwitchFirmidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  // 结果码
  errorCode?: string;
  // 结果消息
  errorMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      errorCode: 'error_code',
      errorMsg: 'error_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      errorCode: 'string',
      errorMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryQueryFirmfinancialRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业Id
  firmId: number;
  // 租户信息
  tenantId: string;
  // 查询类型（1：查询状态，2：财报信息）
  queryOptions: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      firmId: 'firm_id',
      tenantId: 'tenant_id',
      queryOptions: 'query_options',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      firmId: 'number',
      tenantId: 'string',
      queryOptions: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryQueryFirmfinancialResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  // 结果码
  errorCode?: string;
  // 结果消息
  errorMsg?: string;
  // 财报状态(true已上传，false未上传)
  status?: boolean;
  // 查询结果
  accountResult?: FileInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      errorCode: 'error_code',
      errorMsg: 'error_msg',
      status: 'status',
      accountResult: 'account_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      errorCode: 'string',
      errorMsg: 'string',
      status: 'boolean',
      accountResult: { 'type': 'array', 'itemType': FileInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SwitchSwitchFirmfinancialRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业id
  firmId: number;
  // 租户类型
  tenantId: string;
  // 操作类型（新增：add，删除：delete)
  operationType: string;
  // 业务id
  bizId?: string;
  // 财报信息
  fileInfo?: FileInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      firmId: 'firm_id',
      tenantId: 'tenant_id',
      operationType: 'operation_type',
      bizId: 'biz_id',
      fileInfo: 'file_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      firmId: 'number',
      tenantId: 'string',
      operationType: 'string',
      bizId: 'string',
      fileInfo: FileInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SwitchSwitchFirmfinancialResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  // 结果码
  errorCode?: string;
  // 结果消息
  errorMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      errorCode: 'error_code',
      errorMsg: 'error_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      errorCode: 'string',
      errorMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // ⾃定义唯⼀id
  bizId: string;
  // 租户类型
  // 
  tenantType: string;
  // 认证类型，企业：FIRM，个人：PERSON
  certType: string;
  // 企业营业执照号(当认证类型为企业时为必传)
  certRegNum?: string;
  // 法人姓名
  legalName?: string;
  // 法人身份证号
  legalCertNum?: string;
  // 企业名称(当认证类型为企业时为必传)
  firmName?: string;
  // 个人email
  email?: string;
  // 个人身份证号
  certNum: string;
  // 个人手机号
  phone?: string;
  // 个人姓名
  name: string;
  // 个人did(当认证类型为企业时为必传)
  userDid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      tenantType: 'tenant_type',
      certType: 'cert_type',
      certRegNum: 'cert_reg_num',
      legalName: 'legal_name',
      legalCertNum: 'legal_cert_num',
      firmName: 'firm_name',
      email: 'email',
      certNum: 'cert_num',
      phone: 'phone',
      name: 'name',
      userDid: 'user_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      tenantType: 'string',
      certType: 'string',
      certRegNum: 'string',
      legalName: 'string',
      legalCertNum: 'string',
      firmName: 'string',
      email: 'string',
      certNum: 'string',
      phone: 'string',
      name: 'string',
      userDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 企业did/个人did
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

export class CreateContractPlatformRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 创建个人
  creator: Contractaccountapplication;
  // 合同企业信息
  platform: Contractorganizationapplication;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      creator: 'creator',
      platform: 'platform',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      creator: Contractaccountapplication,
      platform: Contractorganizationapplication,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractPlatformResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  // 
  code?: number;
  // 创建人ID
  // 
  creatorId?: string;
  // 业务码信息
  // 
  message?: string;
  // 平台方ID
  // 
  platformId?: string;
  // 平台用户与智能合同服务间鉴权使用的密钥
  // 
  secret?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      creatorId: 'creator_id',
      message: 'message',
      platformId: 'platform_id',
      secret: 'secret',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      creatorId: 'string',
      message: 'string',
      platformId: 'string',
      secret: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddContractDocumentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 待签署文件
  docs: ContractDocument[];
  // 流程ID
  flowId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      docs: 'docs',
      flowId: 'flow_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      docs: { 'type': 'array', 'itemType': ContractDocument },
      flowId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddContractDocumentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddContractFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件名称
  // 
  name: string;
  // 输入项填充内容，以key:value传入
  // 
  simpleFormFields: string;
  // 模板编号
  // 
  templateId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      simpleFormFields: 'simple_form_fields',
      templateId: 'template_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      simpleFormFields: 'string',
      templateId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddContractFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文件下载地址，有效期一小时
  // 
  downloadUrl?: string;
  // 文件id
  // 
  fileId?: string;
  // 文件名称
  // 
  fileName?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      downloadUrl: 'download_url',
      fileId: 'file_id',
      fileName: 'file_name',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      downloadUrl: 'string',
      fileId: 'string',
      fileName: 'string',
      code: 'number',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyContractCallbackkeyRequest extends $tea.Model {
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

export class ApplyContractCallbackkeyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 加签使用的key
  // 
  key?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      key: 'key',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      key: 'string',
      code: 'number',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthContractSignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授权人DID，即个人账号DID或机构账号DID
  // 
  accountId: string;
  // 授权截止时间, 格式为yyyy-MM-dd HH:mm:ss，默认无限期
  // 
  deadline: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountId: 'account_id',
      deadline: 'deadline',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountId: 'string',
      deadline: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthContractSignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务数据, 是否授权成功
  // 
  accepted?: boolean;
  // 业务码，0表示成功
  // 
  code?: number;
  // 业务码信息
  // 
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accepted: 'accepted',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accepted: 'boolean',
      code: 'number',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 模板文件md5值，再做base64编码
  // 
  contentMd5: string;
  // 目标文件的MIME类型
  // 
  contentType: string;
  // 是否需要转成pdf，如果模板文件为.doc/.docx 传true，为pdf传false
  // 
  convert2Pdf: boolean;
  // 文件名称，必须带扩展名如:.pdf,.doc,.docx
  // 
  fileName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      contentMd5: 'content_md5',
      contentType: 'content_type',
      convert2Pdf: 'convert2_pdf',
      fileName: 'file_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      contentMd5: 'string',
      contentType: 'string',
      convert2Pdf: 'boolean',
      fileName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  // 
  code?: number;
  // 业务码信息
  // 
  message?: string;
  // 模板ID
  // 
  templateId?: string;
  // 文件直传地址，需要用此上传地址使用put方式上传文件，只有文件上传后模板才可用
  // 
  uploadUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      templateId: 'template_id',
      uploadUrl: 'upload_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      templateId: 'string',
      uploadUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractSignflowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 是否自动归档，默认false 如设置为true，则在流程开启后，当所有签署人签署完毕，系统自动将流程归档，状态变为“已完成”状态，在流程状态为“已完成”前，可随时添加签署人；如设置为false，则在调用流程开启后，需主动调用签署流程归档接口，将流程状...
  // 
  autoArchive?: boolean;
  // 是否强制代扣
  // 
  autoDeductionForce: boolean;
  // 文件主题
  // 
  businessScene: string;
  // 合同签名配置
  contractSignFlowConfig: Contractsignflowconfig;
  // 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
  // 
  initiatorAccountId?: string;
  // 发起方主体id，如存在个人代机构发起签约，则需传入机构id；如不传，则默认是对接平台
  // 
  initiatorAuthorizedAccountId?: string;
  // 代扣信息
  repaymentOrderInfo: ContractPaymentOrderInfo[];
  // 签署平台，ALIPAY（支付宝小程序）或H5
  // 
  signPlatform?: string;
  // 签署有效截止日期，毫秒，默认3天失效
  // 
  signValidity?: number;
  // 付款方ID（个人）
  // 
  payerTuid?: string;
  // 收款方ID(机构)
  // 
  payeeTuid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      autoArchive: 'auto_archive',
      autoDeductionForce: 'auto_deduction_force',
      businessScene: 'business_scene',
      contractSignFlowConfig: 'contract_sign_flow_config',
      initiatorAccountId: 'initiator_account_id',
      initiatorAuthorizedAccountId: 'initiator_authorized_account_id',
      repaymentOrderInfo: 'repayment_order_info',
      signPlatform: 'sign_platform',
      signValidity: 'sign_validity',
      payerTuid: 'payer_tuid',
      payeeTuid: 'payee_tuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      autoArchive: 'boolean',
      autoDeductionForce: 'boolean',
      businessScene: 'string',
      contractSignFlowConfig: Contractsignflowconfig,
      initiatorAccountId: 'string',
      initiatorAuthorizedAccountId: 'string',
      repaymentOrderInfo: { 'type': 'array', 'itemType': ContractPaymentOrderInfo },
      signPlatform: 'string',
      signValidity: 'number',
      payerTuid: 'string',
      payeeTuid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractSignflowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  // 
  code?: number;
  // 签约流程ID
  flowId?: string;
  // 业务码信息
  // 
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      flowId: 'flow_id',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      flowId: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetContractFileuploadurlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 所属账号did，即个人账号id或机构账号id，如不传，则默认属于对接平台
  // 
  accountId?: string;
  // 先计算文件md5值，在对该md5值进行base64编码
  // 
  contentMd5: string;
  // 目标文件的MIME类型
  // 
  contentType: string;
  // 是否转换成pdf文档，默认false，代表不做转换。转换是异步行为，如果指定要转换，需要调用查询文件信息接口查询状态，转换完成后才可使用。
  // 
  convert2Pdf: string;
  // 文件名称（必须带上文件扩展名，不然会导致后续发起流程校验过不去 示例：合同.pdf ）
  // 
  fileName: string;
  // 文件大小，单位byte
  // 
  fileSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountId: 'account_id',
      contentMd5: 'content_md5',
      contentType: 'content_type',
      convert2Pdf: 'convert_2_pdf',
      fileName: 'file_name',
      fileSize: 'file_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountId: 'string',
      contentMd5: 'string',
      contentType: 'string',
      convert2Pdf: 'string',
      fileName: 'string',
      fileSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetContractFileuploadurlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  // 
  code?: number;
  // 文件Id
  // 
  fileId?: string;
  // 文件直传地址, 可以重复使用，但是只能传一样的文件，有效期一小时
  // 
  message?: string;
  // 上传url
  uploadUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      fileId: 'file_id',
      message: 'message',
      uploadUrl: 'upload_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      fileId: 'string',
      message: 'string',
      uploadUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddContractSignfieldRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 签署流程ID
  // 
  flowId: string;
  // 合同签约字段集合
  signfields: ContractSignFieldApplication[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      signfields: 'signfields',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      signfields: { 'type': 'array', 'itemType': ContractSignFieldApplication },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddContractSignfieldResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  // 
  code?: number;
  // 业务码信息
  // 
  message?: string;
  // 合同签约返回值
  signfields?: ContractSignField[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      signfields: 'signfields',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      signfields: { 'type': 'array', 'itemType': ContractSignField },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractHandsignfieldRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程id
  // 
  flowId: string;
  // 签名参数
  signFields: ContractHandSignFieldApplication[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      signFields: 'sign_fields',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      signFields: { 'type': 'array', 'itemType': ContractHandSignFieldApplication },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractHandsignfieldResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  // 
  code?: number;
  // 业务码信息
  // 
  message?: string;
  // 签署区列表数据
  // 
  signfields?: ContractSignField[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      signfields: 'signfields',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      signfields: { 'type': 'array', 'itemType': ContractSignField },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartContractFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程ID
  // 
  flowId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartContractFlowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  // 
  code?: number;
  // 业务码信息
  // 
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetContractSignurlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 签署人账号id
  // 
  accountId: string;
  // 流程id
  // 
  flowId: string;
  // 默认为空，返回的任务链接仅包含签署人本人需要签署的任务； 传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务； 传入指定机构id，则返回的任务链接包含签署人“本人+指定代签机构”的签署任务
  // 
  organizeId?: string;
  // 是否需要同时返回短链接，默认为false
  // 
  shortUrl?: boolean;
  // 客户账户id
  agentAccountId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountId: 'account_id',
      flowId: 'flow_id',
      organizeId: 'organize_id',
      shortUrl: 'short_url',
      agentAccountId: 'agent_account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountId: 'string',
      flowId: 'string',
      organizeId: 'string',
      shortUrl: 'boolean',
      agentAccountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetContractSignurlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  // 
  code?: number;
  // 业务码信息
  // 
  message?: string;
  // 短链地址
  // 
  shortUrl?: string;
  // 长链地址
  // 
  url?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      shortUrl: 'short_url',
      url: 'url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      shortUrl: 'string',
      url: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DownloadContractDocumentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程ID
  // 
  flowId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DownloadContractDocumentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文档下载地址
  docs?: ContractDocAddress[];
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      docs: 'docs',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      docs: { 'type': 'array', 'itemType': ContractDocAddress },
      code: 'number',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveContractFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程ID
  // 
  flowId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveContractFlowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  // 
  code?: number;
  // 业务码信息
  // 
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程id
  // 
  flowId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractFlowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否自动归档
  // 
  autoArchive?: boolean;
  // 文件主题
  // 
  businessScene?: string;
  // 业务码，0表示成功
  // 
  code?: number;
  // 流程配置信息
  // 
  configInfo?: Contractsignflowconfig;
  // 文件到期前，提前多少小时提醒续签
  // 
  contractRemind?: number;
  // 文件有效截止日期
  // 
  contractValidity?: number;
  // 流程描述, 如果流程已拒签或已撤回, 并且存在拒签或撤回原因, 流程描述显示为原因, 否则默认为流程状态描述
  // 
  flowDesc?: string;
  // 流程结束时间
  // 
  flowEndTime?: string;
  // 流程ID
  // 
  flowId?: string;
  // 流程开始时间
  // 
  flowStartTime?: string;
  // 流程状态,0-草稿 1-签署中 2-完成 3-撤销 4-终止 5-过期 6-删除 7-拒签
  // 
  flowStatus?: number;
  // 发起人账户id
  // 
  initiatorAccountId?: string;
  // 发起方主体id
  // 
  initiatorAuthorizedAccountId?: string;
  // 业务码信息
  // 
  message?: string;
  // 签署有效截止日期
  signValidity?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      autoArchive: 'auto_archive',
      businessScene: 'business_scene',
      code: 'code',
      configInfo: 'config_info',
      contractRemind: 'contract_remind',
      contractValidity: 'contract_validity',
      flowDesc: 'flow_desc',
      flowEndTime: 'flow_end_time',
      flowId: 'flow_id',
      flowStartTime: 'flow_start_time',
      flowStatus: 'flow_status',
      initiatorAccountId: 'initiator_account_id',
      initiatorAuthorizedAccountId: 'initiator_authorized_account_id',
      message: 'message',
      signValidity: 'sign_validity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      autoArchive: 'boolean',
      businessScene: 'string',
      code: 'number',
      configInfo: Contractsignflowconfig,
      contractRemind: 'number',
      contractValidity: 'number',
      flowDesc: 'string',
      flowEndTime: 'string',
      flowId: 'string',
      flowStartTime: 'string',
      flowStatus: 'number',
      initiatorAccountId: 'string',
      initiatorAuthorizedAccountId: 'string',
      message: 'string',
      signValidity: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetContractFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件id
  // 
  fileId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetContractFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  // 
  code?: number;
  // 下载地址
  // 
  downloadUrl?: string;
  // 文件id
  // 
  fileId?: string;
  // 业务码信息
  // 
  message?: string;
  // 文件名称
  // 
  name?: string;
  // pdf文件总页数,仅当文件类型为pdf时有值
  // 
  pdfTotalPages?: number;
  // 文件大小，单位byte
  // 
  size?: number;
  // 文件状态, 0:文件未上传；1:文件上传中 ；2：文件上传已完成,；3：文件上传失败 ；4：文件等待转pdf ；5：文件已转换pdf 。
  // 
  status?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      downloadUrl: 'download_url',
      fileId: 'file_id',
      message: 'message',
      name: 'name',
      pdfTotalPages: 'pdf_total_pages',
      size: 'size',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      downloadUrl: 'string',
      fileId: 'string',
      message: 'string',
      name: 'string',
      pdfTotalPages: 'number',
      size: 'number',
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractNotaryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 签署流程ID
  flowId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractNotaryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  // 
  code?: number;
  // 业务码信息
  // 
  message?: string;
  // 存证信息列表
  notaries?: ContractNotaryInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      notaries: 'notaries',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      notaries: { 'type': 'array', 'itemType': ContractNotaryInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractAccountsealimageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户id
  // 
  accountId: string;
  // 印章别名
  // 
  alias?: string;
  // 印章数据，base64格式字符串，不包含格式前缀
  // 
  data: string;
  // 印章高度, 个人默认95px, 机构默认159px
  // 
  height?: number;
  // 是否对图片进行透明化处理，默认false。仅对图片整体做透明化处理，无法去除图片背景
  // 
  transparentFlag?: boolean;
  // 印章数据类型，BASE64：base64格式
  // 
  type: string;
  // 印章宽度, 个人默认95px, 机构默认159px
  // 
  width?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountId: 'account_id',
      alias: 'alias',
      data: 'data',
      height: 'height',
      transparentFlag: 'transparent_flag',
      type: 'type',
      width: 'width',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountId: 'string',
      alias: 'string',
      data: 'string',
      height: 'number',
      transparentFlag: 'boolean',
      type: 'string',
      width: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractAccountsealimageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 印章fileKey
  // 
  fileKey?: string;
  // 印章高度
  // 
  height?: number;
  // 印章id
  // 
  sealId?: string;
  // 印章下载地址, 有效时间1小时
  // 
  url?: string;
  // 印章宽度
  // 
  width?: number;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      fileKey: 'file_key',
      height: 'height',
      sealId: 'seal_id',
      url: 'url',
      width: 'width',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      fileKey: 'string',
      height: 'number',
      sealId: 'string',
      url: 'string',
      width: 'number',
      code: 'number',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractOnestepflowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 是否自动归档，默认false。
  // 
  autoArchive?: boolean;
  // 是否自动开启，默认false。
  // 
  autoInitiate?: boolean;
  // 文件主题
  // 
  businessScene: string;
  // 流程备注
  // 
  comment?: string;
  // 流程配置
  contractSignFlowConfig: Contractsignflowconfig;
  // 合同文件
  docs: ContractDocument[];
  // 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
  // 
  initiatorAccountId?: string;
  // 发起方主体id，如存在个人代机构发起签约，则需传入机构id；如不传，则默认是对接平台
  // 
  initiatorAuthorizedAccountId?: string;
  // 签署操作人个人账号标识，即操作本次签署的个人
  // 
  signFields: OneStepSignField[];
  // 签署平台，ALIPAY（支付宝小程序）或H5，默认H5
  // 
  signPlatform?: string;
  // 签署有效截止日期，毫秒，默认3天失效
  // 
  signValidity: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      autoArchive: 'auto_archive',
      autoInitiate: 'auto_initiate',
      businessScene: 'business_scene',
      comment: 'comment',
      contractSignFlowConfig: 'contract_sign_flow_config',
      docs: 'docs',
      initiatorAccountId: 'initiator_account_id',
      initiatorAuthorizedAccountId: 'initiator_authorized_account_id',
      signFields: 'sign_fields',
      signPlatform: 'sign_platform',
      signValidity: 'sign_validity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      autoArchive: 'boolean',
      autoInitiate: 'boolean',
      businessScene: 'string',
      comment: 'string',
      contractSignFlowConfig: Contractsignflowconfig,
      docs: { 'type': 'array', 'itemType': ContractDocument },
      initiatorAccountId: 'string',
      initiatorAuthorizedAccountId: 'string',
      signFields: { 'type': 'array', 'itemType': OneStepSignField },
      signPlatform: 'string',
      signValidity: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractOnestepflowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  // 
  code?: number;
  // 流程ID
  // 
  flowId?: string;
  // 业务码信息
  // 
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      flowId: 'flow_id',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      flowId: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractFlowsignerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程id
  // 
  flowId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractFlowsignerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  // 
  code?: number;
  // 业务码信息
  // 
  message?: string;
  // 签署人信息
  signers?: ContractFlowSigner[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      signers: 'signers',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      signers: { 'type': 'array', 'itemType': ContractFlowSigner },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractSignfieldsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 账号id，默认所有签署人
  accountId?: string;
  // 流程id
  flowId: string;
  // 指定签署区id列表，逗号分割，默认所有签署区
  signfieldIds?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountId: 'account_id',
      flowId: 'flow_id',
      signfieldIds: 'signfield_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountId: 'string',
      flowId: 'string',
      signfieldIds: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractSignfieldsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  // 签署区列表数据
  signfields?: ContractSignFieldDetail[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      signfields: 'signfields',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      signfields: { 'type': 'array', 'itemType': ContractSignFieldDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteContractSignerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 签署人ID
  accountId: string;
  // 流程id
  flowId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountId: 'account_id',
      flowId: 'flow_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountId: 'string',
      flowId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteContractSignerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncEcpCloudRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // api_code
  apiCode: string;
  // param_map_json
  paramMapJson: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiCode: 'api_code',
      paramMapJson: 'param_map_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiCode: 'string',
      paramMapJson: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncEcpCloudResponse extends $tea.Model {
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

export class CreateOauthUrlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  // 回调地址
  callbackUrl: string;
  // 登录渠道(web,h5)
  loginChannel: string;
  // 客户端口令
  clientToken: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      callbackUrl: 'callback_url',
      loginChannel: 'login_channel',
      clientToken: 'client_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      callbackUrl: 'string',
      loginChannel: 'string',
      clientToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateOauthUrlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 验权url
  oauthUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      oauthUrl: 'oauth_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      oauthUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetOauthTokenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授权类型
  grantType: string;
  // 授权码
  authCode: string;
  // client端申请oauth时的口令
  clientToken: string;
  // 过期时间
  expires?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      grantType: 'grant_type',
      authCode: 'auth_code',
      clientToken: 'client_token',
      expires: 'expires',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      grantType: 'string',
      authCode: 'string',
      clientToken: 'string',
      expires: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetOauthTokenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回数据
  data?: TokenData;
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
      data: TokenData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetOauthTokendetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授权token
  accessToken: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accessToken: 'access_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accessToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetOauthTokendetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授权token
  accessToken?: string;
  // 授权可查看的用户的信息
  dataGrant?: UserData;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accessToken: 'access_token',
      dataGrant: 'data_grant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accessToken: 'string',
      dataGrant: UserData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckSessionAliveRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  // sessionID
  sessionId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      sessionId: 'session_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      sessionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckSessionAliveResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户id
  userId?: number;
  // 登录时间
  loginTime?: string;
  // 添加用户类型
  userData?: UserData;
  // did
  did?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      userId: 'user_id',
      loginTime: 'login_time',
      userData: 'user_data',
      did: 'did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      userId: 'number',
      loginTime: 'string',
      userData: UserData,
      did: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyPartnerAsyncRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // ZHONGYI
  partnerId: string;
  // 产品code
  productCode: string;
  // 通知内容	
  // 
  notifyContent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      partnerId: 'partner_id',
      productCode: 'product_code',
      notifyContent: 'notify_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      partnerId: 'string',
      productCode: 'string',
      notifyContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyPartnerAsyncResponse extends $tea.Model {
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

export class CreateProjectBaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 唯一业务id
  projectId: number;
  // 项目编号
  projectCode: string;
  // 项目名称
  projectName: string;
  // 项目建立时间
  projectCreateTime: string;
  // 建设单位统一社会信用代码
  partyABidderCode: string;
  // 施工单位统一社会信用代码
  partyBBidderCode: string;
  // 项目所在行政区域代码
  regionCode: string;
  // 项目类型
  projectType: string;
  // 拟开工时间
  startTime: string;
  // 拟建成时间
  endTime: string;
  // 工程造价（单位：元，精确小数点后6位）
  projectPrice: string;
  // 资金来源
  fundSource: string;
  // 行业分类
  indusCategory: string;
  // 项目地址
  projectAddress: string;
  // 争议解决方式
  disputeresolutionType?: string;
  // 资金落实比例
  contributionRatio?: string;
  // 资金落实情况
  fundImpl?: string;
  // 项目规模
  projectScale?: string;
  // 总投资额(单位：元，小数点后六位)
  bidBond?: string;
  // 建设单位的项目联系人
  contactor?: string;
  // 建设单位的项目联系人联系方式
  contactInformation?: string;
  // 是否国有投资
  isGContruction?: string;
  // 担保方式
  guaranteeType?: string;
  // 反担保协议编号
  conterGuarAgreeNo?: string;
  // 创建人did
  createdDid?: string;
  // 数据时间戳
  dataTimestamp: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
      projectCode: 'project_code',
      projectName: 'project_name',
      projectCreateTime: 'project_create_time',
      partyABidderCode: 'party_a_bidder_code',
      partyBBidderCode: 'party_b_bidder_code',
      regionCode: 'region_code',
      projectType: 'project_type',
      startTime: 'start_time',
      endTime: 'end_time',
      projectPrice: 'project_price',
      fundSource: 'fund_source',
      indusCategory: 'indus_category',
      projectAddress: 'project_address',
      disputeresolutionType: 'disputeresolution_type',
      contributionRatio: 'contribution_ratio',
      fundImpl: 'fund_impl',
      projectScale: 'project_scale',
      bidBond: 'bid_bond',
      contactor: 'contactor',
      contactInformation: 'contact_information',
      isGContruction: 'is_g_contruction',
      guaranteeType: 'guarantee_type',
      conterGuarAgreeNo: 'conter_guar_agree_no',
      createdDid: 'created_did',
      dataTimestamp: 'data_timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'number',
      projectCode: 'string',
      projectName: 'string',
      projectCreateTime: 'string',
      partyABidderCode: 'string',
      partyBBidderCode: 'string',
      regionCode: 'string',
      projectType: 'string',
      startTime: 'string',
      endTime: 'string',
      projectPrice: 'string',
      fundSource: 'string',
      indusCategory: 'string',
      projectAddress: 'string',
      disputeresolutionType: 'string',
      contributionRatio: 'string',
      fundImpl: 'string',
      projectScale: 'string',
      bidBond: 'string',
      contactor: 'string',
      contactInformation: 'string',
      isGContruction: 'string',
      guaranteeType: 'string',
      conterGuarAgreeNo: 'string',
      createdDid: 'string',
      dataTimestamp: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateProjectBaseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 信息上链的哈希
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

export class BatchcreateWorkersBaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目编号
  projectCode: string;
  // 农民工基本信息
  workerList: WorkersBaseInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectCode: 'project_code',
      workerList: 'worker_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectCode: 'string',
      workerList: { 'type': 'array', 'itemType': WorkersBaseInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateWorkersBaseResponse extends $tea.Model {
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

export class BatchcreateWorkersAttendanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目编号
  projectCode: string;
  // 身份证号
  idCard: string;
  // 农民工考勤信息
  attendanceList: WorkersCheckAttendance[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectCode: 'project_code',
      idCard: 'id_card',
      attendanceList: 'attendance_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectCode: 'string',
      idCard: 'string',
      attendanceList: { 'type': 'array', 'itemType': WorkersCheckAttendance },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateWorkersAttendanceResponse extends $tea.Model {
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

export class BatchcreateWorkersWageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目编号
  projectCode: string;
  // 身份证号
  idCard: string;
  // 农民工工资发放信息
  wageList: WorkersWagePayment[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectCode: 'project_code',
      idCard: 'id_card',
      wageList: 'wage_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectCode: 'string',
      idCard: 'string',
      wageList: { 'type': 'array', 'itemType': WorkersWagePayment },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateWorkersWageResponse extends $tea.Model {
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

export class CreateProjectFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目编号 
  projectCode: string;
  // 文件id
  fileId: string;
  // 文件业务id
  fileBizId?: string;
  // 文件编号
  fileCode?: string;
  // 文件名称
  fileName?: string;
  // 文件类型
  fileType: string;
  // 扩展字段
  extraData?: string;
  // 数据时间戳
  dataTimestamp: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectCode: 'project_code',
      fileId: 'file_id',
      fileBizId: 'file_biz_id',
      fileCode: 'file_code',
      fileName: 'file_name',
      fileType: 'file_type',
      extraData: 'extra_data',
      dataTimestamp: 'data_timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectCode: 'string',
      fileId: 'string',
      fileBizId: 'string',
      fileCode: 'string',
      fileName: 'string',
      fileType: 'string',
      extraData: 'string',
      dataTimestamp: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateProjectFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 信息上链的哈希
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

export class CreateContractBaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目编号 
  projectCode: string;
  // 合同信息id
  contractInfoId: number;
  // 合同编号
  contractInfoCode: string;
  // 合同名称
  contractName: string;
  // 合同版本,从1起
  contractVersion: number;
  // 变更原因（第一版不传值）
  changeReason?: string;
  // 合同类型
  contractType: string;
  // 甲方统一社会信用代码
  partyABidderCode: string;
  // 甲方名称
  partyAName: string;
  // 甲方授权代表Did
  partyAAuditDid: string;
  // 乙方集合
  partyBFirmDtoList: PartyBFirmDto[];
  // 合同金额
  contractMoney: string;
  // 金额币种代码
  priceCurrency: string;
  // 金额单位
  priceUnit: string;
  // 拟开工时间
  startDate: string;
  // 拟建成时间
  endDate: string;
  // 合同签署时间
  contractSignTime: string;
  // 创建人Did
  createdDid: string;
  // 合同文件
  contractFile: string;
  // 文件存证
  evidence: string;
  // 存证txHash
  txHash?: string;
  // 数据时间戳
  dataTimestamp: string;
  // 保证金对象集合
  securityFundDtoList?: SecurityFundDto[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectCode: 'project_code',
      contractInfoId: 'contract_info_id',
      contractInfoCode: 'contract_info_code',
      contractName: 'contract_name',
      contractVersion: 'contract_version',
      changeReason: 'change_reason',
      contractType: 'contract_type',
      partyABidderCode: 'party_a_bidder_code',
      partyAName: 'party_a_name',
      partyAAuditDid: 'party_a_audit_did',
      partyBFirmDtoList: 'party_b_firm_dto_list',
      contractMoney: 'contract_money',
      priceCurrency: 'price_currency',
      priceUnit: 'price_unit',
      startDate: 'start_date',
      endDate: 'end_date',
      contractSignTime: 'contract_sign_time',
      createdDid: 'created_did',
      contractFile: 'contract_file',
      evidence: 'evidence',
      txHash: 'tx_hash',
      dataTimestamp: 'data_timestamp',
      securityFundDtoList: 'security_fund_dto_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectCode: 'string',
      contractInfoId: 'number',
      contractInfoCode: 'string',
      contractName: 'string',
      contractVersion: 'number',
      changeReason: 'string',
      contractType: 'string',
      partyABidderCode: 'string',
      partyAName: 'string',
      partyAAuditDid: 'string',
      partyBFirmDtoList: { 'type': 'array', 'itemType': PartyBFirmDto },
      contractMoney: 'string',
      priceCurrency: 'string',
      priceUnit: 'string',
      startDate: 'string',
      endDate: 'string',
      contractSignTime: 'string',
      createdDid: 'string',
      contractFile: 'string',
      evidence: 'string',
      txHash: 'string',
      dataTimestamp: 'string',
      securityFundDtoList: { 'type': 'array', 'itemType': SecurityFundDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractBaseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 信息上链的哈希
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

export class CreateContractImplRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合同编号,(确定是哪个合同的收付款，需要唯一标识id)
  contractInfoCode: string;
  // 收付款id
  contractImplId: number;
  // 付款方统一社会信用代码
  partyABidderCode: string;
  // 付款方审核人Did
  partyAAuditDid: string;
  // 付款方名称	
  partyAName: string;
  // 收款方统一社会信用代码
  partyBBidderCode: string;
  // 收款方审核人Did
  partyBAuditDid?: string;
  // 收款方名称
  partyBName: string;
  // 拨付金额
  payMoney: string;
  // 金额币种代码
  priceCurrency: string;
  // 金额单位
  priceUnit: string;
  // 支付说明
  remarks: string;
  // 款项类型
  paymentType: string;
  // 拨付时间
  payTime: string;
  // 创建人Did
  createdDid: string;
  // 付款凭证文件(文件Id)
  file: string;
  // 数据时间戳
  dataTimestamp: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      contractInfoCode: 'contract_info_code',
      contractImplId: 'contract_impl_id',
      partyABidderCode: 'party_a_bidder_code',
      partyAAuditDid: 'party_a_audit_did',
      partyAName: 'party_a_name',
      partyBBidderCode: 'party_b_bidder_code',
      partyBAuditDid: 'party_b_audit_did',
      partyBName: 'party_b_name',
      payMoney: 'pay_money',
      priceCurrency: 'price_currency',
      priceUnit: 'price_unit',
      remarks: 'remarks',
      paymentType: 'payment_type',
      payTime: 'pay_time',
      createdDid: 'created_did',
      file: 'file',
      dataTimestamp: 'data_timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      contractInfoCode: 'string',
      contractImplId: 'number',
      partyABidderCode: 'string',
      partyAAuditDid: 'string',
      partyAName: 'string',
      partyBBidderCode: 'string',
      partyBAuditDid: 'string',
      partyBName: 'string',
      payMoney: 'string',
      priceCurrency: 'string',
      priceUnit: 'string',
      remarks: 'string',
      paymentType: 'string',
      payTime: 'string',
      createdDid: 'string',
      file: 'string',
      dataTimestamp: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractImplResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 信息上链的哈希
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

export class CreateUserCertRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 云蚂账户id
  userId: number;
  // 姓名
  name: string;
  // 个人证件类型
  certType: string;
  // 证件号码
  certNum: string;
  // 个人证件正面图片文件id，应用侧fileId
  certFileFront: number;
  // 个人证件正面类型。JPG
  certFileFrontType: string;
  // 个人证件反面图片文件id，应用侧fileId
  certFileReverse: number;
  // 个人证件反面类型。JPG
  certFileReverseType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      name: 'name',
      certType: 'cert_type',
      certNum: 'cert_num',
      certFileFront: 'cert_file_front',
      certFileFrontType: 'cert_file_front_type',
      certFileReverse: 'cert_file_reverse',
      certFileReverseType: 'cert_file_reverse_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'number',
      name: 'string',
      certType: 'string',
      certNum: 'string',
      certFileFront: 'number',
      certFileFrontType: 'string',
      certFileReverse: 'number',
      certFileReverseType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateUserCertResponse extends $tea.Model {
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

export class UpdateUserInfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 云蚂侧用户id
  // 
  userId: number;
  // 信息同步类型
  // 
  operationType: string;
  // 用户邮箱
  // 
  email?: string;
  // 用户手机号码
  // 
  telphone?: string;
  // 个人认证状态
  // 
  userCertStatus?: string;
  // 个人认证did
  // 
  userDid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      operationType: 'operation_type',
      email: 'email',
      telphone: 'telphone',
      userCertStatus: 'user_cert_status',
      userDid: 'user_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'number',
      operationType: 'string',
      email: 'string',
      telphone: 'string',
      userCertStatus: 'string',
      userDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateUserInfoResponse extends $tea.Model {
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

export class CreateUserRegisterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 默认登录名称
  loginId: string;
  // 用户邮箱
  email?: string;
  // 用户手机号码
  telphone?: string;
  // 云蚂侧用户id
  userId: number;
  // 来源 ： 1 APP注册，2 PC注册，3 后台添加
  source: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      loginId: 'login_id',
      email: 'email',
      telphone: 'telphone',
      userId: 'user_id',
      source: 'source',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      loginId: 'string',
      email: 'string',
      telphone: 'string',
      userId: 'number',
      source: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateUserRegisterResponse extends $tea.Model {
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

export class CreateFirmCertRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 云蚂侧企业id
  firmId: number;
  // 企业名称
  firmName: string;
  // 企业类型
  firmType?: string;
  // 行业类型
  industryType: string;
  // 企业地址省份
  firmAddress: string;
  // 企业营业执照注册号
  certRegNo: string;
  // 营业执照图片id，应用侧fileId
  certRegFile: number;
  // 营业执照图片类型(JPEG,JPG)
  certRegFileType: string;
  // 法定代表人证件类型
  lpCertType: string;
  // 法人证件号码
  lpCertNo: string;
  // 法人姓名
  lpName: string;
  // 法人身份证正面图片id，应用侧FileId
  lpCertFileFront: number;
  // 法人身份证正面图片文件类型(JPEG,JPG)
  lpCertFileFrontType: string;
  // 法人身份证反面图片id，应用侧FileId
  lpCertFileReverse: number;
  // 法人身份证反面图片id，应用侧FileId
  lpCertFileReverseType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      firmId: 'firm_id',
      firmName: 'firm_name',
      firmType: 'firm_type',
      industryType: 'industry_type',
      firmAddress: 'firm_address',
      certRegNo: 'cert_reg_no',
      certRegFile: 'cert_reg_file',
      certRegFileType: 'cert_reg_file_type',
      lpCertType: 'lp_cert_type',
      lpCertNo: 'lp_cert_no',
      lpName: 'lp_name',
      lpCertFileFront: 'lp_cert_file_front',
      lpCertFileFrontType: 'lp_cert_file_front_type',
      lpCertFileReverse: 'lp_cert_file_reverse',
      lpCertFileReverseType: 'lp_cert_file_reverse_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      firmId: 'number',
      firmName: 'string',
      firmType: 'string',
      industryType: 'string',
      firmAddress: 'string',
      certRegNo: 'string',
      certRegFile: 'number',
      certRegFileType: 'string',
      lpCertType: 'string',
      lpCertNo: 'string',
      lpName: 'string',
      lpCertFileFront: 'number',
      lpCertFileFrontType: 'string',
      lpCertFileReverse: 'number',
      lpCertFileReverseType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFirmCertResponse extends $tea.Model {
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

export class UpdateFirmInfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 云蚂侧用户id
  userId: number;
  // 信息同步类型
  operationType: string;
  // 云蚂侧企业id
  firmId: number;
  // 企业名称
  firmName?: string;
  // 企业认证状态
  firmCertStatus?: string;
  // 企业认证did
  firmDid?: string;
  // 账户角色
  referType?: string;
  // 云蚂侧原管理员账户id
  formerAdminId?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      operationType: 'operation_type',
      firmId: 'firm_id',
      firmName: 'firm_name',
      firmCertStatus: 'firm_cert_status',
      firmDid: 'firm_did',
      referType: 'refer_type',
      formerAdminId: 'former_admin_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'number',
      operationType: 'string',
      firmId: 'number',
      firmName: 'string',
      firmCertStatus: 'string',
      firmDid: 'string',
      referType: 'string',
      formerAdminId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateFirmInfoResponse extends $tea.Model {
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

export class QueryChainTransactionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据链上交易hash
  txHash: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChainTransactionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据链上交易hash
  txHash?: string;
  // 数据块高
  blockNumber?: number;
  // 数据上链时间
  timestamp?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      blockNumber: 'block_number',
      timestamp: 'timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      blockNumber: 'number',
      timestamp: 'string',
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
          sdk_version: "1.1.51",
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
   * Description: 账密登录(PWD_LOGIN)
   * Summary: 账密登录
   */
  async verifyUserPwd(request: VerifyUserPwdRequest): Promise<VerifyUserPwdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyUserPwdEx(request, headers, runtime);
  }

  /**
   * Description: 账密登录(PWD_LOGIN)
   * Summary: 账密登录
   */
  async verifyUserPwdEx(request: VerifyUserPwdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyUserPwdResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyUserPwdResponse>(await this.doRequest("1.0", "antchain.acc.user.pwd.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyUserPwdResponse({}));
  }

  /**
   * Description: 短信登录申请
   * Summary: 短信登录申请
   */
  async applyUserSms(request: ApplyUserSmsRequest): Promise<ApplyUserSmsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyUserSmsEx(request, headers, runtime);
  }

  /**
   * Description: 短信登录申请
   * Summary: 短信登录申请
   */
  async applyUserSmsEx(request: ApplyUserSmsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyUserSmsResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyUserSmsResponse>(await this.doRequest("1.0", "antchain.acc.user.sms.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyUserSmsResponse({}));
  }

  /**
   * Description: 短信登录
   * Summary: 短信登录
   */
  async verifyUserSms(request: VerifyUserSmsRequest): Promise<VerifyUserSmsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyUserSmsEx(request, headers, runtime);
  }

  /**
   * Description: 短信登录
   * Summary: 短信登录
   */
  async verifyUserSmsEx(request: VerifyUserSmsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyUserSmsResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyUserSmsResponse>(await this.doRequest("1.0", "antchain.acc.user.sms.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyUserSmsResponse({}));
  }

  /**
   * Description: 关联登录
   * Summary: 关联登录
   */
  async authUserRef(request: AuthUserRefRequest): Promise<AuthUserRefResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authUserRefEx(request, headers, runtime);
  }

  /**
   * Description: 关联登录
   * Summary: 关联登录
   */
  async authUserRefEx(request: AuthUserRefRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthUserRefResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthUserRefResponse>(await this.doRequest("1.0", "antchain.acc.user.ref.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthUserRefResponse({}));
  }

  /**
   * Description: 退出登录
   * Summary: 退出登录
   */
  async closeUserLogin(request: CloseUserLoginRequest): Promise<CloseUserLoginResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.closeUserLoginEx(request, headers, runtime);
  }

  /**
   * Description: 退出登录
   * Summary: 退出登录
   */
  async closeUserLoginEx(request: CloseUserLoginRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CloseUserLoginResponse> {
    Util.validateModel(request);
    return $tea.cast<CloseUserLoginResponse>(await this.doRequest("1.0", "antchain.acc.user.login.close", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CloseUserLoginResponse({}));
  }

  /**
   * Description: 用户注册
   * Summary: 用户注册
   */
  async createUser(request: CreateUserRequest): Promise<CreateUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createUserEx(request, headers, runtime);
  }

  /**
   * Description: 用户注册
   * Summary: 用户注册
   */
  async createUserEx(request: CreateUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateUserResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateUserResponse>(await this.doRequest("1.0", "antchain.acc.user.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateUserResponse({}));
  }

  /**
   * Description: 获取用户信息
   * Summary: 获取用户信息
   */
  async getUserCurrent(request: GetUserCurrentRequest): Promise<GetUserCurrentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getUserCurrentEx(request, headers, runtime);
  }

  /**
   * Description: 获取用户信息
   * Summary: 获取用户信息
   */
  async getUserCurrentEx(request: GetUserCurrentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetUserCurrentResponse> {
    Util.validateModel(request);
    return $tea.cast<GetUserCurrentResponse>(await this.doRequest("1.0", "antchain.acc.user.current.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetUserCurrentResponse({}));
  }

  /**
   * Description: 企业认证
   * Summary: 企业认证
   */
  async verifyFirm(request: VerifyFirmRequest): Promise<VerifyFirmResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyFirmEx(request, headers, runtime);
  }

  /**
   * Description: 企业认证
   * Summary: 企业认证
   */
  async verifyFirmEx(request: VerifyFirmRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyFirmResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyFirmResponse>(await this.doRequest("1.0", "antchain.acc.firm.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyFirmResponse({}));
  }

  /**
   * Description: 个人认证
   * Summary: 个人认证
   */
  async verifyUser(request: VerifyUserRequest): Promise<VerifyUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyUserEx(request, headers, runtime);
  }

  /**
   * Description: 个人认证
   * Summary: 个人认证
   */
  async verifyUserEx(request: VerifyUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyUserResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyUserResponse>(await this.doRequest("1.0", "antchain.acc.user.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyUserResponse({}));
  }

  /**
   * Description: ocr_文件识别接口
   * Summary: ocr_文件识别接口
   */
  async recognizeOcrFile(request: RecognizeOcrFileRequest): Promise<RecognizeOcrFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.recognizeOcrFileEx(request, headers, runtime);
  }

  /**
   * Description: ocr_文件识别接口
   * Summary: ocr_文件识别接口
   */
  async recognizeOcrFileEx(request: RecognizeOcrFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RecognizeOcrFileResponse> {
    Util.validateModel(request);
    return $tea.cast<RecognizeOcrFileResponse>(await this.doRequest("1.0", "antchain.acc.ocr.file.recognize", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RecognizeOcrFileResponse({}));
  }

  /**
   * Description: 输入企业的四要素进行认证。
   * Summary: 企业四要素认证
   */
  async certifyCertifyFirmmeta(request: CertifyCertifyFirmmetaRequest): Promise<CertifyCertifyFirmmetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.certifyCertifyFirmmetaEx(request, headers, runtime);
  }

  /**
   * Description: 输入企业的四要素进行认证。
   * Summary: 企业四要素认证
   */
  async certifyCertifyFirmmetaEx(request: CertifyCertifyFirmmetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CertifyCertifyFirmmetaResponse> {
    Util.validateModel(request);
    return $tea.cast<CertifyCertifyFirmmetaResponse>(await this.doRequest("1.0", "antchain.acc.certify.firmmeta.certify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CertifyCertifyFirmmetaResponse({}));
  }

  /**
   * Description: 输入个人的二要素进行认证。
   * Summary: 个人二要素认证
   */
  async certifyCertifyPersonmeta(request: CertifyCertifyPersonmetaRequest): Promise<CertifyCertifyPersonmetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.certifyCertifyPersonmetaEx(request, headers, runtime);
  }

  /**
   * Description: 输入个人的二要素进行认证。
   * Summary: 个人二要素认证
   */
  async certifyCertifyPersonmetaEx(request: CertifyCertifyPersonmetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CertifyCertifyPersonmetaResponse> {
    Util.validateModel(request);
    return $tea.cast<CertifyCertifyPersonmetaResponse>(await this.doRequest("1.0", "antchain.acc.certify.personmeta.certify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CertifyCertifyPersonmetaResponse({}));
  }

  /**
   * Description: 人脸识别认证
   * Summary: 人脸识别认证
   */
  async certifyCertifyFace(request: CertifyCertifyFaceRequest): Promise<CertifyCertifyFaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.certifyCertifyFaceEx(request, headers, runtime);
  }

  /**
   * Description: 人脸识别认证
   * Summary: 人脸识别认证
   */
  async certifyCertifyFaceEx(request: CertifyCertifyFaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CertifyCertifyFaceResponse> {
    Util.validateModel(request);
    return $tea.cast<CertifyCertifyFaceResponse>(await this.doRequest("1.0", "antchain.acc.certify.face.certify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CertifyCertifyFaceResponse({}));
  }

  /**
   * Description: 查询人脸识别结果
   * Summary: 人脸识别结果查询
   */
  async queryQueryFacecertify(request: QueryQueryFacecertifyRequest): Promise<QueryQueryFacecertifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryQueryFacecertifyEx(request, headers, runtime);
  }

  /**
   * Description: 查询人脸识别结果
   * Summary: 人脸识别结果查询
   */
  async queryQueryFacecertifyEx(request: QueryQueryFacecertifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryQueryFacecertifyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryQueryFacecertifyResponse>(await this.doRequest("1.0", "antchain.acc.query.facecertify.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryQueryFacecertifyResponse({}));
  }

  /**
   * Description: 每次切换企业，同步当前企业id
   * Summary: 控制台切换企业同步
   */
  async switchSwitchFirmid(request: SwitchSwitchFirmidRequest): Promise<SwitchSwitchFirmidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.switchSwitchFirmidEx(request, headers, runtime);
  }

  /**
   * Description: 每次切换企业，同步当前企业id
   * Summary: 控制台切换企业同步
   */
  async switchSwitchFirmidEx(request: SwitchSwitchFirmidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SwitchSwitchFirmidResponse> {
    Util.validateModel(request);
    return $tea.cast<SwitchSwitchFirmidResponse>(await this.doRequest("1.0", "antchain.acc.switch.firmid.switch", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SwitchSwitchFirmidResponse({}));
  }

  /**
   * Description: 企业身份中心查询企业财报
   * Summary: 查询企业财报
   */
  async queryQueryFirmfinancial(request: QueryQueryFirmfinancialRequest): Promise<QueryQueryFirmfinancialResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryQueryFirmfinancialEx(request, headers, runtime);
  }

  /**
   * Description: 企业身份中心查询企业财报
   * Summary: 查询企业财报
   */
  async queryQueryFirmfinancialEx(request: QueryQueryFirmfinancialRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryQueryFirmfinancialResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryQueryFirmfinancialResponse>(await this.doRequest("1.0", "antchain.acc.query.firmfinancial.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryQueryFirmfinancialResponse({}));
  }

  /**
   * Description: 企业身份中心新增或删除企业财报
   * Summary: 新增/删除企业财报
   */
  async switchSwitchFirmfinancial(request: SwitchSwitchFirmfinancialRequest): Promise<SwitchSwitchFirmfinancialResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.switchSwitchFirmfinancialEx(request, headers, runtime);
  }

  /**
   * Description: 企业身份中心新增或删除企业财报
   * Summary: 新增/删除企业财报
   */
  async switchSwitchFirmfinancialEx(request: SwitchSwitchFirmfinancialRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SwitchSwitchFirmfinancialResponse> {
    Util.validateModel(request);
    return $tea.cast<SwitchSwitchFirmfinancialResponse>(await this.doRequest("1.0", "antchain.acc.switch.firmfinancial.switch", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SwitchSwitchFirmfinancialResponse({}));
  }

  /**
   * Description: 生成企业/个人did
   * Summary: 生成企业/个人did
   */
  async createDid(request: CreateDidRequest): Promise<CreateDidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDidEx(request, headers, runtime);
  }

  /**
   * Description: 生成企业/个人did
   * Summary: 生成企业/个人did
   */
  async createDidEx(request: CreateDidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDidResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDidResponse>(await this.doRequest("1.0", "antchain.acc.did.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDidResponse({}));
  }

  /**
   * Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
   * Summary: 电子合同平台方注册
   */
  async createContractPlatform(request: CreateContractPlatformRequest): Promise<CreateContractPlatformResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContractPlatformEx(request, headers, runtime);
  }

  /**
   * Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
   * Summary: 电子合同平台方注册
   */
  async createContractPlatformEx(request: CreateContractPlatformRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContractPlatformResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContractPlatformResponse>(await this.doRequest("1.0", "antchain.acc.contract.platform.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContractPlatformResponse({}));
  }

  /**
   * Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
   * Summary: 向电子合同签署流程中添加待签署文档
   */
  async addContractDocument(request: AddContractDocumentRequest): Promise<AddContractDocumentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addContractDocumentEx(request, headers, runtime);
  }

  /**
   * Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
   * Summary: 向电子合同签署流程中添加待签署文档
   */
  async addContractDocumentEx(request: AddContractDocumentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddContractDocumentResponse> {
    Util.validateModel(request);
    return $tea.cast<AddContractDocumentResponse>(await this.doRequest("1.0", "antchain.acc.contract.document.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddContractDocumentResponse({}));
  }

  /**
   * Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
   * Summary: 通过电子合同模板添加文档
   */
  async addContractFile(request: AddContractFileRequest): Promise<AddContractFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addContractFileEx(request, headers, runtime);
  }

  /**
   * Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
   * Summary: 通过电子合同模板添加文档
   */
  async addContractFileEx(request: AddContractFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddContractFileResponse> {
    Util.validateModel(request);
    return $tea.cast<AddContractFileResponse>(await this.doRequest("1.0", "antchain.acc.contract.file.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddContractFileResponse({}));
  }

  /**
   * Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
   * Summary: 申请区块链合同回调加签key
   */
  async applyContractCallbackkey(request: ApplyContractCallbackkeyRequest): Promise<ApplyContractCallbackkeyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyContractCallbackkeyEx(request, headers, runtime);
  }

  /**
   * Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
   * Summary: 申请区块链合同回调加签key
   */
  async applyContractCallbackkeyEx(request: ApplyContractCallbackkeyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyContractCallbackkeyResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyContractCallbackkeyResponse>(await this.doRequest("1.0", "antchain.acc.contract.callbackkey.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyContractCallbackkeyResponse({}));
  }

  /**
   * Description: 静默签署授权
   * Summary: 静默签署授权
   */
  async authContractSign(request: AuthContractSignRequest): Promise<AuthContractSignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authContractSignEx(request, headers, runtime);
  }

  /**
   * Description: 静默签署授权
   * Summary: 静默签署授权
   */
  async authContractSignEx(request: AuthContractSignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthContractSignResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthContractSignResponse>(await this.doRequest("1.0", "antchain.acc.contract.sign.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthContractSignResponse({}));
  }

  /**
   * Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
   * Summary: 通过文件上传方式创建电子合同签署模板
   */
  async createContractTemplate(request: CreateContractTemplateRequest): Promise<CreateContractTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContractTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
   * Summary: 通过文件上传方式创建电子合同签署模板
   */
  async createContractTemplateEx(request: CreateContractTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContractTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContractTemplateResponse>(await this.doRequest("1.0", "antchain.acc.contract.template.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContractTemplateResponse({}));
  }

  /**
   * Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
   * Summary: 创建签署流程
   */
  async createContractSignflow(request: CreateContractSignflowRequest): Promise<CreateContractSignflowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContractSignflowEx(request, headers, runtime);
  }

  /**
   * Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
   * Summary: 创建签署流程
   */
  async createContractSignflowEx(request: CreateContractSignflowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContractSignflowResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContractSignflowResponse>(await this.doRequest("1.0", "antchain.acc.contract.signflow.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContractSignflowResponse({}));
  }

  /**
   * Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
   * Summary: 通过上传方式创建文件
   */
  async getContractFileuploadurl(request: GetContractFileuploadurlRequest): Promise<GetContractFileuploadurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getContractFileuploadurlEx(request, headers, runtime);
  }

  /**
   * Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
   * Summary: 通过上传方式创建文件
   */
  async getContractFileuploadurlEx(request: GetContractFileuploadurlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetContractFileuploadurlResponse> {
    Util.validateModel(request);
    return $tea.cast<GetContractFileuploadurlResponse>(await this.doRequest("1.0", "antchain.acc.contract.fileuploadurl.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetContractFileuploadurlResponse({}));
  }

  /**
   * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
   * Summary: 添加电子合同签署方自动盖章签署区
   */
  async addContractSignfield(request: AddContractSignfieldRequest): Promise<AddContractSignfieldResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addContractSignfieldEx(request, headers, runtime);
  }

  /**
   * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
   * Summary: 添加电子合同签署方自动盖章签署区
   */
  async addContractSignfieldEx(request: AddContractSignfieldRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddContractSignfieldResponse> {
    Util.validateModel(request);
    return $tea.cast<AddContractSignfieldResponse>(await this.doRequest("1.0", "antchain.acc.contract.signfield.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddContractSignfieldResponse({}));
  }

  /**
   * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
   * Summary: 添加电子合同签署方手动盖章签署区
   */
  async createContractHandsignfield(request: CreateContractHandsignfieldRequest): Promise<CreateContractHandsignfieldResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContractHandsignfieldEx(request, headers, runtime);
  }

  /**
   * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
   * Summary: 添加电子合同签署方手动盖章签署区
   */
  async createContractHandsignfieldEx(request: CreateContractHandsignfieldRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContractHandsignfieldResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContractHandsignfieldResponse>(await this.doRequest("1.0", "antchain.acc.contract.handsignfield.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContractHandsignfieldResponse({}));
  }

  /**
   * Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
   * Summary: 电子合同签署流程开启
   */
  async startContractFlow(request: StartContractFlowRequest): Promise<StartContractFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startContractFlowEx(request, headers, runtime);
  }

  /**
   * Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
   * Summary: 电子合同签署流程开启
   */
  async startContractFlowEx(request: StartContractFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartContractFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<StartContractFlowResponse>(await this.doRequest("1.0", "antchain.acc.contract.flow.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartContractFlowResponse({}));
  }

  /**
   * Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
   * Summary: 获取签署地址
   */
  async getContractSignurl(request: GetContractSignurlRequest): Promise<GetContractSignurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getContractSignurlEx(request, headers, runtime);
  }

  /**
   * Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
   * Summary: 获取签署地址
   */
  async getContractSignurlEx(request: GetContractSignurlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetContractSignurlResponse> {
    Util.validateModel(request);
    return $tea.cast<GetContractSignurlResponse>(await this.doRequest("1.0", "antchain.acc.contract.signurl.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetContractSignurlResponse({}));
  }

  /**
   * Description: 流程归档后，查询和下载签署后的文件
   * Summary: 电子合同流程文档下载
   */
  async downloadContractDocument(request: DownloadContractDocumentRequest): Promise<DownloadContractDocumentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.downloadContractDocumentEx(request, headers, runtime);
  }

  /**
   * Description: 流程归档后，查询和下载签署后的文件
   * Summary: 电子合同流程文档下载
   */
  async downloadContractDocumentEx(request: DownloadContractDocumentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DownloadContractDocumentResponse> {
    Util.validateModel(request);
    return $tea.cast<DownloadContractDocumentResponse>(await this.doRequest("1.0", "antchain.acc.contract.document.download", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DownloadContractDocumentResponse({}));
  }

  /**
   * Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
   * Summary: 电子合同签署流程归档
   */
  async saveContractFlow(request: SaveContractFlowRequest): Promise<SaveContractFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveContractFlowEx(request, headers, runtime);
  }

  /**
   * Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
   * Summary: 电子合同签署流程归档
   */
  async saveContractFlowEx(request: SaveContractFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveContractFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveContractFlowResponse>(await this.doRequest("1.0", "antchain.acc.contract.flow.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveContractFlowResponse({}));
  }

  /**
   * Description: 查询签署流程的详细信息，包括流程配置、签署状态等
   * Summary: 签署流程查询
   */
  async queryContractFlow(request: QueryContractFlowRequest): Promise<QueryContractFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContractFlowEx(request, headers, runtime);
  }

  /**
   * Description: 查询签署流程的详细信息，包括流程配置、签署状态等
   * Summary: 签署流程查询
   */
  async queryContractFlowEx(request: QueryContractFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContractFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContractFlowResponse>(await this.doRequest("1.0", "antchain.acc.contract.flow.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContractFlowResponse({}));
  }

  /**
   * Description: 查询文件详情，包括文件名称、大小、下载地址等
   * Summary: 查询文件详情
   */
  async getContractFile(request: GetContractFileRequest): Promise<GetContractFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getContractFileEx(request, headers, runtime);
  }

  /**
   * Description: 查询文件详情，包括文件名称、大小、下载地址等
   * Summary: 查询文件详情
   */
  async getContractFileEx(request: GetContractFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetContractFileResponse> {
    Util.validateModel(request);
    return $tea.cast<GetContractFileResponse>(await this.doRequest("1.0", "antchain.acc.contract.file.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetContractFileResponse({}));
  }

  /**
   * Description: 通过流程ID查询合同存证信息
   * Summary: 查询合同存证信息
   */
  async queryContractNotary(request: QueryContractNotaryRequest): Promise<QueryContractNotaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContractNotaryEx(request, headers, runtime);
  }

  /**
   * Description: 通过流程ID查询合同存证信息
   * Summary: 查询合同存证信息
   */
  async queryContractNotaryEx(request: QueryContractNotaryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContractNotaryResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContractNotaryResponse>(await this.doRequest("1.0", "antchain.acc.contract.notary.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContractNotaryResponse({}));
  }

  /**
   * Description: 创建个人/机构图片印章
   * Summary: 创建个人/机构图片印章
   */
  async createContractAccountsealimage(request: CreateContractAccountsealimageRequest): Promise<CreateContractAccountsealimageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContractAccountsealimageEx(request, headers, runtime);
  }

  /**
   * Description: 创建个人/机构图片印章
   * Summary: 创建个人/机构图片印章
   */
  async createContractAccountsealimageEx(request: CreateContractAccountsealimageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContractAccountsealimageResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContractAccountsealimageResponse>(await this.doRequest("1.0", "antchain.acc.contract.accountsealimage.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContractAccountsealimageResponse({}));
  }

  /**
   * Description: 快速创建签署流程，完成添加待签文档、流程基本信息、签署方，支持自动开启、自动归档。
   * Summary: 一步创建签署流程接口
   */
  async createContractOnestepflow(request: CreateContractOnestepflowRequest): Promise<CreateContractOnestepflowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContractOnestepflowEx(request, headers, runtime);
  }

  /**
   * Description: 快速创建签署流程，完成添加待签文档、流程基本信息、签署方，支持自动开启、自动归档。
   * Summary: 一步创建签署流程接口
   */
  async createContractOnestepflowEx(request: CreateContractOnestepflowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContractOnestepflowResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContractOnestepflowResponse>(await this.doRequest("1.0", "antchain.acc.contract.onestepflow.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContractOnestepflowResponse({}));
  }

  /**
   * Description: 查询流程所有签署人列表。
   * Summary: 查询流程签署人列表
   */
  async queryContractFlowsigner(request: QueryContractFlowsignerRequest): Promise<QueryContractFlowsignerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContractFlowsignerEx(request, headers, runtime);
  }

  /**
   * Description: 查询流程所有签署人列表。
   * Summary: 查询流程签署人列表
   */
  async queryContractFlowsignerEx(request: QueryContractFlowsignerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContractFlowsignerResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContractFlowsignerResponse>(await this.doRequest("1.0", "antchain.acc.contract.flowsigner.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContractFlowsignerResponse({}));
  }

  /**
   * Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
   * Summary: 查询签署区列表
   */
  async queryContractSignfields(request: QueryContractSignfieldsRequest): Promise<QueryContractSignfieldsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContractSignfieldsEx(request, headers, runtime);
  }

  /**
   * Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
   * Summary: 查询签署区列表
   */
  async queryContractSignfieldsEx(request: QueryContractSignfieldsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContractSignfieldsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContractSignfieldsResponse>(await this.doRequest("1.0", "antchain.acc.contract.signfields.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContractSignfieldsResponse({}));
  }

  /**
   * Description: 执行签署人删除逻辑
   * Summary: 删除签署人
   */
  async deleteContractSigner(request: DeleteContractSignerRequest): Promise<DeleteContractSignerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteContractSignerEx(request, headers, runtime);
  }

  /**
   * Description: 执行签署人删除逻辑
   * Summary: 删除签署人
   */
  async deleteContractSignerEx(request: DeleteContractSignerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteContractSignerResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteContractSignerResponse>(await this.doRequest("1.0", "antchain.acc.contract.signer.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteContractSignerResponse({}));
  }

  /**
   * Description: ecp同步金融云,内部通道
   * Summary: ecp同步金融云,内部通道
   */
  async syncEcpCloud(request: SyncEcpCloudRequest): Promise<SyncEcpCloudResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncEcpCloudEx(request, headers, runtime);
  }

  /**
   * Description: ecp同步金融云,内部通道
   * Summary: ecp同步金融云,内部通道
   */
  async syncEcpCloudEx(request: SyncEcpCloudRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncEcpCloudResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncEcpCloudResponse>(await this.doRequest("1.0", "antchain.acc.ecp.cloud.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncEcpCloudResponse({}));
  }

  /**
   * Description: 生成url跳转登录
   * Summary: 生成url跳转登录
   */
  async createOauthUrl(request: CreateOauthUrlRequest): Promise<CreateOauthUrlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createOauthUrlEx(request, headers, runtime);
  }

  /**
   * Description: 生成url跳转登录
   * Summary: 生成url跳转登录
   */
  async createOauthUrlEx(request: CreateOauthUrlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateOauthUrlResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateOauthUrlResponse>(await this.doRequest("1.0", "antchain.acc.oauth.url.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateOauthUrlResponse({}));
  }

  /**
   * Description: 获取token
   * Summary: 获取token
   */
  async getOauthToken(request: GetOauthTokenRequest): Promise<GetOauthTokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getOauthTokenEx(request, headers, runtime);
  }

  /**
   * Description: 获取token
   * Summary: 获取token
   */
  async getOauthTokenEx(request: GetOauthTokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetOauthTokenResponse> {
    Util.validateModel(request);
    return $tea.cast<GetOauthTokenResponse>(await this.doRequest("1.0", "antchain.acc.oauth.token.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetOauthTokenResponse({}));
  }

  /**
   * Description: token明细获取
   * Summary: token明细获取
   */
  async getOauthTokendetail(request: GetOauthTokendetailRequest): Promise<GetOauthTokendetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getOauthTokendetailEx(request, headers, runtime);
  }

  /**
   * Description: token明细获取
   * Summary: token明细获取
   */
  async getOauthTokendetailEx(request: GetOauthTokendetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetOauthTokendetailResponse> {
    Util.validateModel(request);
    return $tea.cast<GetOauthTokendetailResponse>(await this.doRequest("1.0", "antchain.acc.oauth.tokendetail.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetOauthTokendetailResponse({}));
  }

  /**
   * Description: session判活
   * Summary: session判活
   */
  async checkSessionAlive(request: CheckSessionAliveRequest): Promise<CheckSessionAliveResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkSessionAliveEx(request, headers, runtime);
  }

  /**
   * Description: session判活
   * Summary: session判活
   */
  async checkSessionAliveEx(request: CheckSessionAliveRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckSessionAliveResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckSessionAliveResponse>(await this.doRequest("1.0", "antchain.acc.session.alive.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckSessionAliveResponse({}));
  }

  /**
   * Description: 外部合作伙伴异步通知接口
   * Summary: 外部合作伙伴异步通知接口
   */
  async notifyPartnerAsync(request: NotifyPartnerAsyncRequest): Promise<NotifyPartnerAsyncResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.notifyPartnerAsyncEx(request, headers, runtime);
  }

  /**
   * Description: 外部合作伙伴异步通知接口
   * Summary: 外部合作伙伴异步通知接口
   */
  async notifyPartnerAsyncEx(request: NotifyPartnerAsyncRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<NotifyPartnerAsyncResponse> {
    Util.validateModel(request);
    return $tea.cast<NotifyPartnerAsyncResponse>(await this.doRequest("1.0", "antchain.acc.partner.async.notify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new NotifyPartnerAsyncResponse({}));
  }

  /**
   * Description: 创建一条项目基本信息
   * Summary: 创建一条项目基本信息
   */
  async createProjectBase(request: CreateProjectBaseRequest): Promise<CreateProjectBaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createProjectBaseEx(request, headers, runtime);
  }

  /**
   * Description: 创建一条项目基本信息
   * Summary: 创建一条项目基本信息
   */
  async createProjectBaseEx(request: CreateProjectBaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateProjectBaseResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateProjectBaseResponse>(await this.doRequest("1.0", "antchain.acc.project.base.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateProjectBaseResponse({}));
  }

  /**
   * Description: 批量新增农民工基本信息
   * Summary: 批量新增农民工基本信息
   */
  async batchcreateWorkersBase(request: BatchcreateWorkersBaseRequest): Promise<BatchcreateWorkersBaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateWorkersBaseEx(request, headers, runtime);
  }

  /**
   * Description: 批量新增农民工基本信息
   * Summary: 批量新增农民工基本信息
   */
  async batchcreateWorkersBaseEx(request: BatchcreateWorkersBaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateWorkersBaseResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateWorkersBaseResponse>(await this.doRequest("1.0", "antchain.acc.workers.base.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateWorkersBaseResponse({}));
  }

  /**
   * Description: 批量新增农民工考勤信息
   * Summary: 批量新增农民工考勤信息
   */
  async batchcreateWorkersAttendance(request: BatchcreateWorkersAttendanceRequest): Promise<BatchcreateWorkersAttendanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateWorkersAttendanceEx(request, headers, runtime);
  }

  /**
   * Description: 批量新增农民工考勤信息
   * Summary: 批量新增农民工考勤信息
   */
  async batchcreateWorkersAttendanceEx(request: BatchcreateWorkersAttendanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateWorkersAttendanceResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateWorkersAttendanceResponse>(await this.doRequest("1.0", "antchain.acc.workers.attendance.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateWorkersAttendanceResponse({}));
  }

  /**
   * Description: 批量新增农民工工资发放信息
   * Summary: 批量新增农民工工资发放信息
   */
  async batchcreateWorkersWage(request: BatchcreateWorkersWageRequest): Promise<BatchcreateWorkersWageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateWorkersWageEx(request, headers, runtime);
  }

  /**
   * Description: 批量新增农民工工资发放信息
   * Summary: 批量新增农民工工资发放信息
   */
  async batchcreateWorkersWageEx(request: BatchcreateWorkersWageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateWorkersWageResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateWorkersWageResponse>(await this.doRequest("1.0", "antchain.acc.workers.wage.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateWorkersWageResponse({}));
  }

  /**
   * Description: 创建一条项目文件信息
   * Summary: 创建一条项目文件信息
   */
  async createProjectFile(request: CreateProjectFileRequest): Promise<CreateProjectFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createProjectFileEx(request, headers, runtime);
  }

  /**
   * Description: 创建一条项目文件信息
   * Summary: 创建一条项目文件信息
   */
  async createProjectFileEx(request: CreateProjectFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateProjectFileResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateProjectFileResponse>(await this.doRequest("1.0", "antchain.acc.project.file.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateProjectFileResponse({}));
  }

  /**
   * Description: 合同基本信息流入
   * Summary: 合同基本信息流入
   */
  async createContractBase(request: CreateContractBaseRequest): Promise<CreateContractBaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContractBaseEx(request, headers, runtime);
  }

  /**
   * Description: 合同基本信息流入
   * Summary: 合同基本信息流入
   */
  async createContractBaseEx(request: CreateContractBaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContractBaseResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContractBaseResponse>(await this.doRequest("1.0", "antchain.acc.contract.base.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContractBaseResponse({}));
  }

  /**
   * Description: 合同收付款信息流入
   * Summary: 合同收付款信息流入
   */
  async createContractImpl(request: CreateContractImplRequest): Promise<CreateContractImplResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContractImplEx(request, headers, runtime);
  }

  /**
   * Description: 合同收付款信息流入
   * Summary: 合同收付款信息流入
   */
  async createContractImplEx(request: CreateContractImplRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContractImplResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContractImplResponse>(await this.doRequest("1.0", "antchain.acc.contract.impl.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContractImplResponse({}));
  }

  /**
   * Description: 个人认证信息同步
   * Summary: 个人认证信息同步
   */
  async createUserCert(request: CreateUserCertRequest): Promise<CreateUserCertResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createUserCertEx(request, headers, runtime);
  }

  /**
   * Description: 个人认证信息同步
   * Summary: 个人认证信息同步
   */
  async createUserCertEx(request: CreateUserCertRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateUserCertResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateUserCertResponse>(await this.doRequest("1.0", "antchain.acc.user.cert.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateUserCertResponse({}));
  }

  /**
   * Description: 用户信息变更同步
   * Summary: 用户信息变更同步
   */
  async updateUserInfo(request: UpdateUserInfoRequest): Promise<UpdateUserInfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateUserInfoEx(request, headers, runtime);
  }

  /**
   * Description: 用户信息变更同步
   * Summary: 用户信息变更同步
   */
  async updateUserInfoEx(request: UpdateUserInfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateUserInfoResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateUserInfoResponse>(await this.doRequest("1.0", "antchain.acc.user.info.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateUserInfoResponse({}));
  }

  /**
   * Description: 用户注册信息同步
   * Summary: 用户注册信息同步
   */
  async createUserRegister(request: CreateUserRegisterRequest): Promise<CreateUserRegisterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createUserRegisterEx(request, headers, runtime);
  }

  /**
   * Description: 用户注册信息同步
   * Summary: 用户注册信息同步
   */
  async createUserRegisterEx(request: CreateUserRegisterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateUserRegisterResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateUserRegisterResponse>(await this.doRequest("1.0", "antchain.acc.user.register.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateUserRegisterResponse({}));
  }

  /**
   * Description: 企业认证信息同步
   * Summary: 企业认证信息同步
   */
  async createFirmCert(request: CreateFirmCertRequest): Promise<CreateFirmCertResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createFirmCertEx(request, headers, runtime);
  }

  /**
   * Description: 企业认证信息同步
   * Summary: 企业认证信息同步
   */
  async createFirmCertEx(request: CreateFirmCertRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateFirmCertResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateFirmCertResponse>(await this.doRequest("1.0", "antchain.acc.firm.cert.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateFirmCertResponse({}));
  }

  /**
   * Description: 企业信息变更同步
   * Summary: 企业信息变更同步
   */
  async updateFirmInfo(request: UpdateFirmInfoRequest): Promise<UpdateFirmInfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateFirmInfoEx(request, headers, runtime);
  }

  /**
   * Description: 企业信息变更同步
   * Summary: 企业信息变更同步
   */
  async updateFirmInfoEx(request: UpdateFirmInfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateFirmInfoResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateFirmInfoResponse>(await this.doRequest("1.0", "antchain.acc.firm.info.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateFirmInfoResponse({}));
  }

  /**
   * Description: 查询链上信息
   * Summary: 查询链上信息
   */
  async queryChainTransaction(request: QueryChainTransactionRequest): Promise<QueryChainTransactionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryChainTransactionEx(request, headers, runtime);
  }

  /**
   * Description: 查询链上信息
   * Summary: 查询链上信息
   */
  async queryChainTransactionEx(request: QueryChainTransactionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryChainTransactionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryChainTransactionResponse>(await this.doRequest("1.0", "antchain.acc.chain.transaction.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryChainTransactionResponse({}));
  }

}
