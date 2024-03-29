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

// 公积金中心编码名称
export class TdmCpfEncodeNameVO extends $tea.Model {
  // 公积金中心编码
  code: string;
  // 公积金中心名称
  name: string;
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

// 公积金中心城市编码列表
export class TdmCpfCitysVO extends $tea.Model {
  // 城市编码
  code: string;
  // 城市名称
  name: string;
  // 公积金中心城市列表
  cpfs: TdmCpfEncodeNameVO[];
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      name: 'name',
      cpfs: 'cpfs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      name: 'string',
      cpfs: { 'type': 'array', 'itemType': TdmCpfEncodeNameVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 链的信息
export class ChainInfo extends $tea.Model {
  // 块高
  blockHeight?: string;
  // 交易时间
  translateDate?: string;
  // hash(64位)
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      blockHeight: 'block_height',
      translateDate: 'translate_date',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      blockHeight: 'string',
      translateDate: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 授权协议
export class AuthAgreement extends $tea.Model {
  // 授权协议code
  authAgreementCode: string;
  // 授权协议类型：
  // TIME、时间授权
  // COUNT、次数授权
  // TIME_COUNT、时间范围内次数授权
  authAgreementType: string;
  // 授权开始ishi见
  authBeginTime?: string;
  // 授权截止日期
  // 
  // 
  authEndTime?: string;
  // 授权次数
  // 
  // 
  authCount?: number;
  // 剩余授权次数
  authBalanceCount?: number;
  static names(): { [key: string]: string } {
    return {
      authAgreementCode: 'auth_agreement_code',
      authAgreementType: 'auth_agreement_type',
      authBeginTime: 'auth_begin_time',
      authEndTime: 'auth_end_time',
      authCount: 'auth_count',
      authBalanceCount: 'auth_balance_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authAgreementCode: 'string',
      authAgreementType: 'string',
      authBeginTime: 'string',
      authEndTime: 'string',
      authCount: 'number',
      authBalanceCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 证明文件使用记录保存参数 extendParams
export class CertUseParams extends $tea.Model {
  // 证明文件ID
  issueId: string;
  static names(): { [key: string]: string } {
    return {
      issueId: 'issue_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      issueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 授权使用记录
// 
// 
export class AuthUsedRecord extends $tea.Model {
  // 被授权租户名称：
  // 
  // 身份证号/统一社会组织机构信用码
  // 
  // 
  authorizedName: string;
  // 授权码
  // 
  // 
  authCode: string;
  // 链的信息
  chainInfo: ChainInfo;
  // 扩展字段
  extendParams: string;
  // 标的物,产品码名称
  // 
  // 
  targetName: string;
  // 授权可信内容
  teeData?: string;
  // 数据使用时间
  // 
  // 
  useDate: string;
  static names(): { [key: string]: string } {
    return {
      authorizedName: 'authorized_name',
      authCode: 'auth_code',
      chainInfo: 'chain_info',
      extendParams: 'extend_params',
      targetName: 'target_name',
      teeData: 'tee_data',
      useDate: 'use_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authorizedName: 'string',
      authCode: 'string',
      chainInfo: ChainInfo,
      extendParams: 'string',
      targetName: 'string',
      teeData: 'string',
      useDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 贷款记录信息查询接口参数(神玥：公积金中心查询银行系统用户贷款信息记录)
export class CpfGrdkcxQueryExtendParams extends $tea.Model {
  // 住建部中心编码
  zjbzxbm: string;
  // 姓名
  xingming: string;
  // 证件类型
  zjlx: string;
  // 证件号码
  zjhm: string;
  // 贷款合同编号
  dkhtbh: string;
  static names(): { [key: string]: string } {
    return {
      zjbzxbm: 'zjbzxbm',
      xingming: 'xingming',
      zjlx: 'zjlx',
      zjhm: 'zjhm',
      dkhtbh: 'dkhtbh',
    };
  }

  static types(): { [key: string]: any } {
    return {
      zjbzxbm: 'string',
      xingming: 'string',
      zjlx: 'string',
      zjhm: 'string',
      dkhtbh: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 证明列表查询返回
export class CertSummary extends $tea.Model {
  // 证明文件ID
  issueId: string;
  // 证明文件类型
  issueCertType: string;
  // 证明文件描述
  issueCertTypeDesc: string;
  // 证明开具时间
  issueTime: string;
  // 证明图标（未使用）
  issueIcon?: string;
  static names(): { [key: string]: string } {
    return {
      issueId: 'issue_id',
      issueCertType: 'issue_cert_type',
      issueCertTypeDesc: 'issue_cert_type_desc',
      issueTime: 'issue_time',
      issueIcon: 'issue_icon',
    };
  }

  static types(): { [key: string]: any } {
    return {
      issueId: 'string',
      issueCertType: 'string',
      issueCertTypeDesc: 'string',
      issueTime: 'string',
      issueIcon: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 公积金基本信息查询接口参数
export class CpfBaseInfoQueryExtendParams extends $tea.Model {
  // 住建部中心编码
  zjbzxbm: string;
  // 业务流水号
  yhlsh: string;
  // 姓名
  xingming: string;
  // 证件号码
  zjhm: string;
  // 银行程序标志
  appid: string;
  static names(): { [key: string]: string } {
    return {
      zjbzxbm: 'zjbzxbm',
      yhlsh: 'yhlsh',
      xingming: 'xingming',
      zjhm: 'zjhm',
      appid: 'appid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      zjbzxbm: 'string',
      yhlsh: 'string',
      xingming: 'string',
      zjhm: 'string',
      appid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 授权记录
export class AuthRecord extends $tea.Model {
  // 被授权租户名称：
  // 身份证号/统一社会组织机构信用码
  authorizedName: string;
  // 授权协议规则
  authAgreement: AuthAgreement;
  // 授权码
  // 
  // 
  authCode: string;
  // 授权时间	
  // 
  authDate: string;
  // 授权有效状态：
  // 1、生效中、
  // 0、失效
  // 
  // 
  authStatus: string;
  // 链的信息
  chainInfo: ChainInfo;
  // 授权租户身份ID：
  // 身份证号/统一社会组织机构信用码
  dataOwnerIdentity: string;
  // 授权用户名称
  dataOwnerName: string;
  // 扩展字段，与target_name拼成可见的授权详情name
  // 
  // 
  extendParams: string;
  // 标的物名称
  // 
  // 
  targetName: string;
  // 授权可信数据
  teeData?: string;
  static names(): { [key: string]: string } {
    return {
      authorizedName: 'authorized_name',
      authAgreement: 'auth_agreement',
      authCode: 'auth_code',
      authDate: 'auth_date',
      authStatus: 'auth_status',
      chainInfo: 'chain_info',
      dataOwnerIdentity: 'data_owner_identity',
      dataOwnerName: 'data_owner_name',
      extendParams: 'extend_params',
      targetName: 'target_name',
      teeData: 'tee_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authorizedName: 'string',
      authAgreement: AuthAgreement,
      authCode: 'string',
      authDate: 'string',
      authStatus: 'string',
      chainInfo: ChainInfo,
      dataOwnerIdentity: 'string',
      dataOwnerName: 'string',
      extendParams: 'string',
      targetName: 'string',
      teeData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 公积金中心用户信息
export class CpfUserAccountInfo extends $tea.Model {
  // 账户状态
  accountStatus: string;
  // 账户余额
  balance: string;
  // 缴纳单位名称
  instName: string;
  // 个人账户
  accountId: string;
  static names(): { [key: string]: string } {
    return {
      accountStatus: 'account_status',
      balance: 'balance',
      instName: 'inst_name',
      accountId: 'account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accountStatus: 'string',
      balance: 'string',
      instName: 'string',
      accountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 证明使用记录返回结果
export class CertUsageLogVO extends $tea.Model {
  // 使用方名称
  userName: string;
  // 使用时间
  usageTime: string;
  // 证明类型
  issueCertType: string;
  // 证明类型描述
  issueCertTypeDesc: string;
  // 证明开具时间
  issueTime: string;
  // 用途
  purpose: string;
  // 业务流水号
  bizId: string;
  static names(): { [key: string]: string } {
    return {
      userName: 'user_name',
      usageTime: 'usage_time',
      issueCertType: 'issue_cert_type',
      issueCertTypeDesc: 'issue_cert_type_desc',
      issueTime: 'issue_time',
      purpose: 'purpose',
      bizId: 'biz_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userName: 'string',
      usageTime: 'string',
      issueCertType: 'string',
      issueCertTypeDesc: 'string',
      issueTime: 'string',
      purpose: 'string',
      bizId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 证明开具信息
export class IssueCertInfo extends $tea.Model {
  // 证明文件ID
  issueId: string;
  // 证明开具时间
  issueTime: string;
  // 证明开具单位
  providerName?: string;
  // 证明类型
  issueCertType: string;
  // 证明抬头
  depositCertTag?: string;
  // 证明文件png图片存储地址
  depositCert?: string;
  // 证明文件pdf获取地址(不带二维码)
  depositCertPdf?: string;
  // 证明文件pdf获取地址(带验真码)
  depositCertPdfQr?: string;
  static names(): { [key: string]: string } {
    return {
      issueId: 'issue_id',
      issueTime: 'issue_time',
      providerName: 'provider_name',
      issueCertType: 'issue_cert_type',
      depositCertTag: 'deposit_cert_tag',
      depositCert: 'deposit_cert',
      depositCertPdf: 'deposit_cert_pdf',
      depositCertPdfQr: 'deposit_cert_pdf_qr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      issueId: 'string',
      issueTime: 'string',
      providerName: 'string',
      issueCertType: 'string',
      depositCertTag: 'string',
      depositCert: 'string',
      depositCertPdf: 'string',
      depositCertPdfQr: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 属性
export class AuthProperty extends $tea.Model {
  // 地区
  key: string;
  // {"山西","广东"}
  value: string[];
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户贷款信息
export class CpfUserLoanInfo extends $tea.Model {
  // 用户证件号码
  userId: string;
  // 证件类型
  userName: string;
  // 配偶证件号码
  poId: string;
  // 配偶姓名
  poName: string;
  // 贷款合同编号
  loanId: string;
  // 贷款余额
  loanBalance: string;
  // 贷款合同状态
  loanStatus: string;
  static names(): { [key: string]: string } {
    return {
      userId: 'user_id',
      userName: 'user_name',
      poId: 'po_id',
      poName: 'po_name',
      loanId: 'loan_id',
      loanBalance: 'loan_balance',
      loanStatus: 'loan_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userId: 'string',
      userName: 'string',
      poId: 'string',
      poName: 'string',
      loanId: 'string',
      loanBalance: 'string',
      loanStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 异地贷款缴存证明查询接口参数(神玥)
export class CpfYddkjczmQueryExtendParams extends $tea.Model {
  // 住建部中心编码
  zjbzxbm: string;
  // 姓名
  xingming: string;
  // 证件号码
  zjhm: string;
  static names(): { [key: string]: string } {
    return {
      zjbzxbm: 'zjbzxbm',
      xingming: 'xingming',
      zjhm: 'zjhm',
    };
  }

  static types(): { [key: string]: any } {
    return {
      zjbzxbm: 'string',
      xingming: 'string',
      zjhm: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 核身信息, 授权时传入
export class CertificationInfo extends $tea.Model {
  // 是否授权
  certificationFlag?: boolean;
  // 实人认证唯一标识
  certifyId?: string;
  static names(): { [key: string]: string } {
    return {
      certificationFlag: 'certification_flag',
      certifyId: 'certify_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      certificationFlag: 'boolean',
      certifyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 证明开具参数，填入证明开具接口的 extendParams 部分
export class IssueCertParams extends $tea.Model {
  // 贷款合同编号
  dkhtbh?: string;
  // 公积金中心个人账户
  grzh?: string;
  // 查询开始日期
  ksrq?: string;
  // 查询结束日期
  jsrq?: string;
  // 公积金贷款中心
  gjjdkzx?: string;
  // 贷款金额，单位 万元
  dkje?: string;
  // 贷款期限，单位 年
  dkqx?: string;
  static names(): { [key: string]: string } {
    return {
      dkhtbh: 'dkhtbh',
      grzh: 'grzh',
      ksrq: 'ksrq',
      jsrq: 'jsrq',
      gjjdkzx: 'gjjdkzx',
      dkje: 'dkje',
      dkqx: 'dkqx',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dkhtbh: 'string',
      grzh: 'string',
      ksrq: 'string',
      jsrq: 'string',
      gjjdkzx: 'string',
      dkje: 'string',
      dkqx: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 公积金中心省市列表
export class TdmCpfProvinceVO extends $tea.Model {
  // 省编码
  code: string;
  // 省名称
  name: string;
  // 公积金中心列表
  areas: TdmCpfCitysVO[];
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      name: 'name',
      areas: 'areas',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      name: 'string',
      areas: { 'type': 'array', 'itemType': TdmCpfCitysVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 公积金月数接口签名信息
export class CpfDataUseReqSign extends $tea.Model {
  // 机构签名ID
  mSyAppId: string;
  // 签名service, 需要颁发
  mSyService: string;
  // 签名信息
  mSySign: string;
  static names(): { [key: string]: string } {
    return {
      mSyAppId: 'm_sy_app_id',
      mSyService: 'm_sy_service',
      mSySign: 'm_sy_sign',
    };
  }

  static types(): { [key: string]: any } {
    return {
      mSyAppId: 'string',
      mSyService: 'string',
      mSySign: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 核身初始化请求信息
export class CertificationRequest extends $tea.Model {
  // 认证模式
  bizCode: string;
  static names(): { [key: string]: string } {
    return {
      bizCode: 'biz_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 异地公积金贷款信息查询接口参数
export class CpfYdgjjdkxxQueryExtendParams extends $tea.Model {
  // 住建部中心编码
  zjbzxbm: string;
  // 姓名
  xingming: string;
  // 证件号码
  zjhm: string;
  // 贷款合同编号
  dkhtbh: string;
  static names(): { [key: string]: string } {
    return {
      zjbzxbm: 'zjbzxbm',
      xingming: 'xingming',
      zjhm: 'zjhm',
      dkhtbh: 'dkhtbh',
    };
  }

  static types(): { [key: string]: any } {
    return {
      zjbzxbm: 'string',
      xingming: 'string',
      zjhm: 'string',
      dkhtbh: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 机构用数记录查询结果（公积金业务）
export class CpfDataUsageLogVO extends $tea.Model {
  // 使用方名称
  userName: string;
  // 使用时间
  usageTime: string;
  // 数据项描述
  dataDesc: string;
  // 用途
  purpose: string;
  // 业务流水号
  bizId: string;
  static names(): { [key: string]: string } {
    return {
      userName: 'user_name',
      usageTime: 'usage_time',
      dataDesc: 'data_desc',
      purpose: 'purpose',
      bizId: 'biz_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userName: 'string',
      usageTime: 'string',
      dataDesc: 'string',
      purpose: 'string',
      bizId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 核身初始化结果
export class CertificationInitResponse extends $tea.Model {
  // 核身认证唯一标识
  certifyId: string;
  // 商户请求唯一标识
  outerOrderNo: string;
  // 场景ID
  sceneId: string;
  static names(): { [key: string]: string } {
    return {
      certifyId: 'certify_id',
      outerOrderNo: 'outer_order_no',
      sceneId: 'scene_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      certifyId: 'string',
      outerOrderNo: 'string',
      sceneId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 核身记录查询结果
export class TdmVerifyLogVO extends $tea.Model {
  // 1:核身创建成功 2:核身验证通过 3:核身验证失败
  status: string;
  // 核身结果描述信息
  remark: string;
  static names(): { [key: string]: string } {
    return {
      status: 'status',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      status: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OpenCpfCertRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 端ID
  terminalIdentity: string;
  // 证明类型
  issueCertType: string;
  // 公积金中心ID
  providerId: string;
  // 证件类型
  dataOwnerIdentityType: string;
  // 数据拥有者ID（身份证ID）
  dataOwnerIdentity: string;
  // 数据拥有者姓名（真实姓名）
  dataOwnerName: string;
  // 请求结构体序列化
  extendParams?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      terminalIdentity: 'terminal_identity',
      issueCertType: 'issue_cert_type',
      providerId: 'provider_id',
      dataOwnerIdentityType: 'data_owner_identity_type',
      dataOwnerIdentity: 'data_owner_identity',
      dataOwnerName: 'data_owner_name',
      extendParams: 'extend_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      terminalIdentity: 'string',
      issueCertType: 'string',
      providerId: 'string',
      dataOwnerIdentityType: 'string',
      dataOwnerIdentity: 'string',
      dataOwnerName: 'string',
      extendParams: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OpenCpfCertResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 证明文件ID
  issueId?: string;
  // 证明文件获取地址
  depositCert?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      issueId: 'issue_id',
      depositCert: 'deposit_cert',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      issueId: 'string',
      depositCert: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCpfCertRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 端ID
  terminalIdentity: string;
  // 身份证ID
  dataOwnerIdentity: string;
  // 证明类型
  issueCertType: string;
  // 当前页码，默认1
  currentPage?: number;
  // 每页展示数量，默认10
  pageSize?: number;
  // 时间筛选枚举类型，默认全部
  optionTime?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      terminalIdentity: 'terminal_identity',
      dataOwnerIdentity: 'data_owner_identity',
      issueCertType: 'issue_cert_type',
      currentPage: 'current_page',
      pageSize: 'page_size',
      optionTime: 'option_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      terminalIdentity: 'string',
      dataOwnerIdentity: 'string',
      issueCertType: 'string',
      currentPage: 'number',
      pageSize: 'number',
      optionTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCpfCertResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前页码
  current?: number;
  // 每页数量
  pageSize?: number;
  // 记录总数
  total?: number;
  // 证明开具信息列表
  certList?: CertSummary[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      current: 'current',
      pageSize: 'page_size',
      total: 'total',
      certList: 'cert_list',
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
      certList: { 'type': 'array', 'itemType': CertSummary },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckCpfCertRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部业务流水
  bizId?: string;
  // 扫码验真类型
  type: string;
  // 端ID
  terminalIdentity: string;
  // 证明ID
  issueId: string;
  // 身份证ID
  dataOwnerIdentity: string;
  // 使用方ID
  dataUserIdentity?: string;
  // 使用方名称
  dataUserName?: string;
  // 用途
  purpose?: string;
  // 使用时间
  useTime?: string;
  // 扩展字段
  extendParams?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      type: 'type',
      terminalIdentity: 'terminal_identity',
      issueId: 'issue_id',
      dataOwnerIdentity: 'data_owner_identity',
      dataUserIdentity: 'data_user_identity',
      dataUserName: 'data_user_name',
      purpose: 'purpose',
      useTime: 'use_time',
      extendParams: 'extend_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      type: 'string',
      terminalIdentity: 'string',
      issueId: 'string',
      dataOwnerIdentity: 'string',
      dataUserIdentity: 'string',
      dataUserName: 'string',
      purpose: 'string',
      useTime: 'string',
      extendParams: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckCpfCertResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 证明ID
  issueId?: string;
  // 证明文件获取地址
  depositCert?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      issueId: 'issue_id',
      depositCert: 'deposit_cert',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      issueId: 'string',
      depositCert: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveCpfCertuseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务流水号
  bizId: string;
  // 身份证ID
  dataOwnerIdentity: string;
  // 姓名
  dataOwnerName: string;
  // 用数机构ID
  dataUserIdentity: string;
  // 用数机构名称
  dataUserName: string;
  // 用数端ID
  terminalIdentity: string;
  // 用数目的
  purpose: string;
  // 用数时间
  operateTime: string;
  // 扩展字段
  extendParams?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      dataOwnerIdentity: 'data_owner_identity',
      dataOwnerName: 'data_owner_name',
      dataUserIdentity: 'data_user_identity',
      dataUserName: 'data_user_name',
      terminalIdentity: 'terminal_identity',
      purpose: 'purpose',
      operateTime: 'operate_time',
      extendParams: 'extend_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      dataOwnerIdentity: 'string',
      dataOwnerName: 'string',
      dataUserIdentity: 'string',
      dataUserName: 'string',
      terminalIdentity: 'string',
      purpose: 'string',
      operateTime: 'string',
      extendParams: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveCpfCertuseResponse extends $tea.Model {
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

export class GetCpfCertuseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务流水号
  bizId?: string;
  // 端ID
  terminalIdentity: string;
  // 用数机构ID
  dataUserIdentity: string;
  // 用数机构
  dataUserName: string;
  // 证明文件ID
  issueId: string;
  // 使用目的
  purpose?: string;
  // 使用时间
  useTime?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      terminalIdentity: 'terminal_identity',
      dataUserIdentity: 'data_user_identity',
      dataUserName: 'data_user_name',
      issueId: 'issue_id',
      purpose: 'purpose',
      useTime: 'use_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      terminalIdentity: 'string',
      dataUserIdentity: 'string',
      dataUserName: 'string',
      issueId: 'string',
      purpose: 'string',
      useTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCpfCertuseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 原始文件pdf
  depositCert?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      depositCert: 'deposit_cert',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      depositCert: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCpfCertRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 证明文件ID
  issueId: string;
  // 证明文件存储类型
  fileType: string;
  // 端ID
  terminalIdentity: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      issueId: 'issue_id',
      fileType: 'file_type',
      terminalIdentity: 'terminal_identity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      issueId: 'string',
      fileType: 'string',
      terminalIdentity: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCpfCertResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 证明文件ID
  issueId?: string;
  // 证明文件获取地址
  depositCert?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      issueId: 'issue_id',
      depositCert: 'deposit_cert',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      issueId: 'string',
      depositCert: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCpfCertuseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 端ID
  terminalIdentity: string;
  // 证明ID
  issueId: string;
  // 筛选时间 按月份筛选
  optionTime?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      terminalIdentity: 'terminal_identity',
      issueId: 'issue_id',
      optionTime: 'option_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      terminalIdentity: 'string',
      issueId: 'string',
      optionTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCpfCertuseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用证记录列表
  useRecords?: CertUsageLogVO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      useRecords: 'use_records',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      useRecords: { 'type': 'array', 'itemType': CertUsageLogVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCpfDataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 端ID
  terminalIdentity?: string;
  // 业务流水号
  bizId?: string;
  // 使用方ID
  dataUserIdentity: string;
  // 使用方名称
  dataUserName: string;
  // 证件类型
  dataOwnerIdentityType: string;
  // 用户ID
  dataOwnerIdentity: string;
  // 用户姓名
  dataOwnerName: string;
  // 数据源ID
  providerId: string;
  // 数据项code
  dataCode: string;
  // 授权码
  targetCode: string;
  // 扩展字段。
  extendParams?: string;
  // 用数请求签名信息
  reqSign?: CpfDataUseReqSign;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      terminalIdentity: 'terminal_identity',
      bizId: 'biz_id',
      dataUserIdentity: 'data_user_identity',
      dataUserName: 'data_user_name',
      dataOwnerIdentityType: 'data_owner_identity_type',
      dataOwnerIdentity: 'data_owner_identity',
      dataOwnerName: 'data_owner_name',
      providerId: 'provider_id',
      dataCode: 'data_code',
      targetCode: 'target_code',
      extendParams: 'extend_params',
      reqSign: 'req_sign',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      terminalIdentity: 'string',
      bizId: 'string',
      dataUserIdentity: 'string',
      dataUserName: 'string',
      dataOwnerIdentityType: 'string',
      dataOwnerIdentity: 'string',
      dataOwnerName: 'string',
      providerId: 'string',
      dataCode: 'string',
      targetCode: 'string',
      extendParams: 'string',
      reqSign: CpfDataUseReqSign,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCpfDataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // PDF、或结构化信息、或加密数据
  trustData?: string;
  // 数据hash，数据验真时用
  dataHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      trustData: 'trust_data',
      dataHash: 'data_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      trustData: 'string',
      dataHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCpfDatauseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 端ID
  terminalIdentity?: string;
  // 使用方ID
  dataUserIdentity: string;
  // 用户身份证ID
  dataOwnerIdentity?: string;
  // 筛选时间，按月份筛选，默认当前月份
  optionTime?: string;
  // 数据类型
  type?: string;
  // 数据类型
  dataCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      terminalIdentity: 'terminal_identity',
      dataUserIdentity: 'data_user_identity',
      dataOwnerIdentity: 'data_owner_identity',
      optionTime: 'option_time',
      type: 'type',
      dataCode: 'data_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      terminalIdentity: 'string',
      dataUserIdentity: 'string',
      dataOwnerIdentity: 'string',
      optionTime: 'string',
      type: 'string',
      dataCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCpfDatauseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 机构用数记录
  useRecords?: CpfDataUsageLogVO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      useRecords: 'use_records',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      useRecords: { 'type': 'array', 'itemType': CpfDataUsageLogVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCpfUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 端ID
  terminalIdentity: string;
  // 数据源ID
  providerId: string;
  // 用户身份证ID
  dataOwnerIdentity: string;
  // 用户姓名
  dataOwnerName: string;
  // 证件类型
  dataOwnerIdentityType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      terminalIdentity: 'terminal_identity',
      providerId: 'provider_id',
      dataOwnerIdentity: 'data_owner_identity',
      dataOwnerName: 'data_owner_name',
      dataOwnerIdentityType: 'data_owner_identity_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      terminalIdentity: 'string',
      providerId: 'string',
      dataOwnerIdentity: 'string',
      dataOwnerName: 'string',
      dataOwnerIdentityType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCpfUserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 个人账户信息
  userAccountInfo?: CpfUserAccountInfo[];
  // 贷款信息
  userLoanInfo?: CpfUserLoanInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      userAccountInfo: 'user_account_info',
      userLoanInfo: 'user_loan_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      userAccountInfo: { 'type': 'array', 'itemType': CpfUserAccountInfo },
      userLoanInfo: { 'type': 'array', 'itemType': CpfUserLoanInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecCpfAuthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流水号
  requestId: string;
  // 用户身份证ID
  dataOwnerIdentity: string;
  // 用户姓名
  dataOwnerName?: string;
  // 被授权机构ID
  authorizedIdentity: string;
  // 被授权机构名称
  authorizedName?: string;
  // 端ID
  authorizedPlatformIdentity?: string;
  // 授权标的
  targetCode: string;
  // 授权协议
  authAgreement: AuthAgreement;
  // 核身信息
  certificationInfo?: CertificationInfo;
  // 扩展字段
  content?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      requestId: 'request_id',
      dataOwnerIdentity: 'data_owner_identity',
      dataOwnerName: 'data_owner_name',
      authorizedIdentity: 'authorized_identity',
      authorizedName: 'authorized_name',
      authorizedPlatformIdentity: 'authorized_platform_identity',
      targetCode: 'target_code',
      authAgreement: 'auth_agreement',
      certificationInfo: 'certification_info',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      requestId: 'string',
      dataOwnerIdentity: 'string',
      dataOwnerName: 'string',
      authorizedIdentity: 'string',
      authorizedName: 'string',
      authorizedPlatformIdentity: 'string',
      targetCode: 'string',
      authAgreement: AuthAgreement,
      certificationInfo: CertificationInfo,
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecCpfAuthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授权码
  authCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      authCode: 'auth_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      authCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelCpfAuthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流水号
  requestId: string;
  // 身份证ID
  dataOwnerIdentity: string;
  // 端ID
  authorizedPlatformIdentity?: string;
  // 授权接口返回的授权码
  authCode: string;
  // 核身信息
  certificationInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      requestId: 'request_id',
      dataOwnerIdentity: 'data_owner_identity',
      authorizedPlatformIdentity: 'authorized_platform_identity',
      authCode: 'auth_code',
      certificationInfo: 'certification_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      requestId: 'string',
      dataOwnerIdentity: 'string',
      authorizedPlatformIdentity: 'string',
      authCode: 'string',
      certificationInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelCpfAuthResponse extends $tea.Model {
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

export class QueryCpfAuthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 身份证ID
  dataOwnerIdentity: string;
  // 被授权机构ID
  authorizedIdentity?: string;
  // 端ID
  authorizedPlatformIdentity?: string;
  // 标的产品码
  targetCode?: string;
  // 扩展字段
  extendParams?: string;
  // 授权状态
  authState: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dataOwnerIdentity: 'data_owner_identity',
      authorizedIdentity: 'authorized_identity',
      authorizedPlatformIdentity: 'authorized_platform_identity',
      targetCode: 'target_code',
      extendParams: 'extend_params',
      authState: 'auth_state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataOwnerIdentity: 'string',
      authorizedIdentity: 'string',
      authorizedPlatformIdentity: 'string',
      targetCode: 'string',
      extendParams: 'string',
      authState: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCpfAuthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授权记录列表
  authRecords?: AuthRecord[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      authRecords: 'auth_records',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      authRecords: { 'type': 'array', 'itemType': AuthRecord },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyCpfAuthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务流水
  requestId: string;
  // 用户身份证ID
  dataOwnerIdentity: string;
  // 授权机构ID
  authorizedIdentity: string;
  // 授权端ID
  authorizedPlatformIdentity?: string;
  // 授权业务码
  targetCode: string;
  // 授权协议
  authAgreement: AuthAgreement;
  // 扩展参数
  content: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      requestId: 'request_id',
      dataOwnerIdentity: 'data_owner_identity',
      authorizedIdentity: 'authorized_identity',
      authorizedPlatformIdentity: 'authorized_platform_identity',
      targetCode: 'target_code',
      authAgreement: 'auth_agreement',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      requestId: 'string',
      dataOwnerIdentity: 'string',
      authorizedIdentity: 'string',
      authorizedPlatformIdentity: 'string',
      targetCode: 'string',
      authAgreement: AuthAgreement,
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyCpfAuthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否授权结果
  ifAuth?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      ifAuth: 'if_auth',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      ifAuth: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveCpfDatauseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 端ID
  terminalIdentity: string;
  // 业务流水号
  bizId: string;
  // 使用方ID
  dataUserIdentity: string;
  // 使用方名称
  dataUserName: string;
  // 证件类型
  dataOwnerIdentityType: string;
  // 数据拥有方ID
  dataOwnerIdentity: string;
  // 数据拥有方名称
  dataOwnerName: string;
  // 数据源ID
  providerId: string;
  // 数据项code
  dataCode: string;
  // 授权码
  targetCode: string;
  // 存证数据hash
  dataHash: string;
  // 扩展字段
  extendParams?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      terminalIdentity: 'terminal_identity',
      bizId: 'biz_id',
      dataUserIdentity: 'data_user_identity',
      dataUserName: 'data_user_name',
      dataOwnerIdentityType: 'data_owner_identity_type',
      dataOwnerIdentity: 'data_owner_identity',
      dataOwnerName: 'data_owner_name',
      providerId: 'provider_id',
      dataCode: 'data_code',
      targetCode: 'target_code',
      dataHash: 'data_hash',
      extendParams: 'extend_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      terminalIdentity: 'string',
      bizId: 'string',
      dataUserIdentity: 'string',
      dataUserName: 'string',
      dataOwnerIdentityType: 'string',
      dataOwnerIdentity: 'string',
      dataOwnerName: 'string',
      providerId: 'string',
      dataCode: 'string',
      targetCode: 'string',
      dataHash: 'string',
      extendParams: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveCpfDatauseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 区块链链信息
  chainInfo?: ChainInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      chainInfo: 'chain_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      chainInfo: ChainInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmCpfDatauseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 验证端ID
  terminalIdentity: string;
  // 区块链交易hash
  txHash: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      terminalIdentity: 'terminal_identity',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      terminalIdentity: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmCpfDatauseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 使用方ID
  dataUserIdentity?: string;
  // 使用方名称
  dataUserName?: string;
  // 数据拥有者ID，用户身份证ID
  dataOwnerIdentity?: string;
  // 数据拥有者名称，用户名称
  dataOwnerName?: string;
  // 数据源ID
  providerId?: string;
  // 数据源名称
  providerName?: string;
  // 存证端ID
  terminalIdentity?: string;
  // 业务描述
  dataDesc?: string;
  // 存证数据hash
  dataHash?: string;
  // 链信息
  chainInfo?: ChainInfo;
  // 扩展字段
  extendParams?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      dataUserIdentity: 'data_user_identity',
      dataUserName: 'data_user_name',
      dataOwnerIdentity: 'data_owner_identity',
      dataOwnerName: 'data_owner_name',
      providerId: 'provider_id',
      providerName: 'provider_name',
      terminalIdentity: 'terminal_identity',
      dataDesc: 'data_desc',
      dataHash: 'data_hash',
      chainInfo: 'chain_info',
      extendParams: 'extend_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      dataUserIdentity: 'string',
      dataUserName: 'string',
      dataOwnerIdentity: 'string',
      dataOwnerName: 'string',
      providerId: 'string',
      providerName: 'string',
      terminalIdentity: 'string',
      dataDesc: 'string',
      dataHash: 'string',
      chainInfo: ChainInfo,
      extendParams: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckCpfAuthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流水ID
  requestId: string;
  // 用户ID
  dataOwnerIdentity: string;
  // 授权机构ID
  authorizedIdentity: string;
  // 授权端ID
  authorizedPlatformIdentity?: string;
  // 授权业务码
  targetCode: string;
  // 授权协议
  authAgreement?: AuthAgreement;
  // 扩展字段
  content: AuthProperty;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      requestId: 'request_id',
      dataOwnerIdentity: 'data_owner_identity',
      authorizedIdentity: 'authorized_identity',
      authorizedPlatformIdentity: 'authorized_platform_identity',
      targetCode: 'target_code',
      authAgreement: 'auth_agreement',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      requestId: 'string',
      dataOwnerIdentity: 'string',
      authorizedIdentity: 'string',
      authorizedPlatformIdentity: 'string',
      targetCode: 'string',
      authAgreement: AuthAgreement,
      content: AuthProperty,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckCpfAuthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否授权
  ifAuth?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      ifAuth: 'if_auth',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      ifAuth: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCpfSourceRequest extends $tea.Model {
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

export class ListCpfSourceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商业机构公积金中心列表查询结果
  cpfList?: TdmCpfProvinceVO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      cpfList: 'cpf_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      cpfList: { 'type': 'array', 'itemType': TdmCpfProvinceVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCpfVerifyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户身份证ID(目前只支持身份证ID)
  userId: string;
  // 用户姓名
  userName: string;
  // 环境参数，需要通过客户端 SDK 获取
  metaInfo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      userName: 'user_name',
      metaInfo: 'meta_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
      userName: 'string',
      metaInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCpfVerifyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 可信实人认证唯一标识
  certifyId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyId: 'certify_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCpfVerifyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 可信实人认证唯一标识
  certifyId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certifyId: 'certify_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certifyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCpfVerifyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 核身结果
  verifyVo?: TdmVerifyLogVO;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      verifyVo: 'verify_vo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      verifyVo: TdmVerifyLogVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RecognizeCpfAuthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务流水
  requestId: string;
  // 用户身份证ID
  dataOwnerIdentity: string;
  // 用户姓名
  dataOwnerName?: string;
  // 被授权机构ID
  authorizedIdentity: string;
  // 被授权机构名称
  authorizedName?: string;
  // 被授权标
  targetCode: string;
  // 授权协议
  authAgreement: AuthAgreement;
  // 核身信息
  certificationInfo: CertificationInfo;
  // 扩展字段
  content?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      requestId: 'request_id',
      dataOwnerIdentity: 'data_owner_identity',
      dataOwnerName: 'data_owner_name',
      authorizedIdentity: 'authorized_identity',
      authorizedName: 'authorized_name',
      targetCode: 'target_code',
      authAgreement: 'auth_agreement',
      certificationInfo: 'certification_info',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      requestId: 'string',
      dataOwnerIdentity: 'string',
      dataOwnerName: 'string',
      authorizedIdentity: 'string',
      authorizedName: 'string',
      targetCode: 'string',
      authAgreement: AuthAgreement,
      certificationInfo: CertificationInfo,
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RecognizeCpfAuthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授权码
  authCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      authCode: 'auth_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      authCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAuthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 被授权租户身份ID：
  // 
  // 身份证号/统一社会组织机构信用码
  authorizedIdentity: string;
  // 分配code
  // 
  // 
  authorizedPlatformIdentity: string;
  // 授权协议
  authAgreement: AuthAgreement;
  // 扩展字段,目前是一个json串，传入相关附加信息，如果对应的附加信息key不需要，可以不传，
  // 
  // key对应的value数据字典由平台提供
  content: string;
  // 授权租户身份ID：
  // 身份证号/统一社会组织机构信用码
  // 
  // 
  dataOwnerIdentity: string;
  // 请求流水号(64位 由平台方定义)_
  // 幂等标示
  requestId: string;
  // 标的物
  // 
  // 
  targetCode: string;
  // 核身产品类型
  certificationType?: string;
  // 核身信息
  // 
  // 
  certificationInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authorizedIdentity: 'authorized_identity',
      authorizedPlatformIdentity: 'authorized_platform_identity',
      authAgreement: 'auth_agreement',
      content: 'content',
      dataOwnerIdentity: 'data_owner_identity',
      requestId: 'request_id',
      targetCode: 'target_code',
      certificationType: 'certification_type',
      certificationInfo: 'certification_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authorizedIdentity: 'string',
      authorizedPlatformIdentity: 'string',
      authAgreement: AuthAgreement,
      content: 'string',
      dataOwnerIdentity: 'string',
      requestId: 'string',
      targetCode: 'string',
      certificationType: 'string',
      certificationInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAuthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授权码
  // 
  // 
  authCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      authCode: 'auth_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      authCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelAuthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授权租户身份ID：
  // 身份证号/统一社会组织机构信用码
  dataOwnerIdentity: string;
  // 分配code
  authorizedPlatformIdentity: string;
  // 标的物，查询授权接口返回
  // 
  // 
  authCode: string;
  // 核身信息
  // 
  certificationInfo: string;
  // 请求流水号
  // 
  // 幂等标示
  // 
  // 
  requestId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dataOwnerIdentity: 'data_owner_identity',
      authorizedPlatformIdentity: 'authorized_platform_identity',
      authCode: 'auth_code',
      certificationInfo: 'certification_info',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataOwnerIdentity: 'string',
      authorizedPlatformIdentity: 'string',
      authCode: 'string',
      certificationInfo: 'string',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelAuthResponse extends $tea.Model {
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

export class QueryAuthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 被授权租户身份ID：
  // 身份证号/统一社会组织机构信用码
  authorizedIdentity: string;
  // 分配code
  // 
  // 
  authorizedPlatformIdentity: string;
  // 授权租户身份ID：
  // 身份证号/统一社会组织机构信用码
  dataOwnerIdentity: string;
  // 扩展信息
  extendParams: string;
  // 标的物
  // 
  // 
  targetCode: string;
  // 请求流水号幂等标示
  requestId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authorizedIdentity: 'authorized_identity',
      authorizedPlatformIdentity: 'authorized_platform_identity',
      dataOwnerIdentity: 'data_owner_identity',
      extendParams: 'extend_params',
      targetCode: 'target_code',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authorizedIdentity: 'string',
      authorizedPlatformIdentity: 'string',
      dataOwnerIdentity: 'string',
      extendParams: 'string',
      targetCode: 'string',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAuthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 缴存证明数据(json格式数据)
  trustData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      trustData: 'trust_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      trustData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAuthOwnerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 	
  // 授权租户身份ID：
  // 身份证号/统一社会组织机构信用码
  dataOwnerIdentity: string;
  // 被授权租户身份ID：
  // 身份证号/统一社会组织机构信用码
  authorizedIdentity?: string;
  // 分配code
  // 
  // 
  authorizedPlatformIdentity: string;
  // 标的物
  // 
  // 
  targetCode?: string;
  // 扩展字段
  // 
  // 
  extendParams?: string;
  // "1", "授权激活状态"
  // "2", "授权取消"
  // "3", "授权过期"
  authState: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dataOwnerIdentity: 'data_owner_identity',
      authorizedIdentity: 'authorized_identity',
      authorizedPlatformIdentity: 'authorized_platform_identity',
      targetCode: 'target_code',
      extendParams: 'extend_params',
      authState: 'auth_state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataOwnerIdentity: 'string',
      authorizedIdentity: 'string',
      authorizedPlatformIdentity: 'string',
      targetCode: 'string',
      extendParams: 'string',
      authState: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAuthOwnerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授权记录集合
  authRecords?: AuthRecord[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      authRecords: 'auth_records',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      authRecords: { 'type': 'array', 'itemType': AuthRecord },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAuthuseOwnerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 分配code
  // 
  // 
  authorizedPlatformIdentity: string;
  // 授权码
  // 
  // 
  authCode: string;
  // 授权租户身份ID：
  // 
  // 身份证号/统一社会组织机构信用码
  dataOwnerIdentity: string;
  // 扩展字段
  extendParams?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authorizedPlatformIdentity: 'authorized_platform_identity',
      authCode: 'auth_code',
      dataOwnerIdentity: 'data_owner_identity',
      extendParams: 'extend_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authorizedPlatformIdentity: 'string',
      authCode: 'string',
      dataOwnerIdentity: 'string',
      extendParams: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAuthuseOwnerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授权使用记录
  // 
  // 
  useRecords?: AuthUsedRecord[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      useRecords: 'use_records',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      useRecords: { 'type': 'array', 'itemType': AuthUsedRecord },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAuthuseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 被授权租户身份ID：
  // 
  // 身份证号/统一社会组织机构信用码
  // 
  // 
  authorizedIdentity: string;
  // 分配code
  // 
  // 
  authorizedPlatformIdentity: string;
  // 授权租户身份ID：
  // 身份证号/统一社会组织机构信用码
  dataOwnerIdentity: string;
  // 扩展字段
  // 
  // 
  extendParams: string;
  // 请求流水号
  // 
  // 幂等标示
  // 
  // 
  requestId: string;
  // 标的物
  // 
  // 
  targetCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authorizedIdentity: 'authorized_identity',
      authorizedPlatformIdentity: 'authorized_platform_identity',
      dataOwnerIdentity: 'data_owner_identity',
      extendParams: 'extend_params',
      requestId: 'request_id',
      targetCode: 'target_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authorizedIdentity: 'string',
      authorizedPlatformIdentity: 'string',
      dataOwnerIdentity: 'string',
      extendParams: 'string',
      requestId: 'string',
      targetCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAuthuseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 缴存证明数据
  // 
  // 
  trustData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      trustData: 'trust_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      trustData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitCpfVerifyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 核身初始化请求信息
  certificationRequest: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certificationRequest: 'certification_request',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certificationRequest: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitCpfVerifyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 核身初始化返回信息
  resultObj?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultObj: 'result_obj',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultObj: 'string',
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
          sdk_version: "1.1.8",
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
   * Description: 公积金证明开具接口
   * Summary: 公积金证明开具接口
   */
  async openCpfCert(request: OpenCpfCertRequest): Promise<OpenCpfCertResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.openCpfCertEx(request, headers, runtime);
  }

  /**
   * Description: 公积金证明开具接口
   * Summary: 公积金证明开具接口
   */
  async openCpfCertEx(request: OpenCpfCertRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OpenCpfCertResponse> {
    Util.validateModel(request);
    return $tea.cast<OpenCpfCertResponse>(await this.doRequest("1.0", "antchain.tdm.cpf.cert.open", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OpenCpfCertResponse({}));
  }

  /**
   * Description: 证明列表查询接口
   * Summary: 证明列表查询接口
   */
  async listCpfCert(request: ListCpfCertRequest): Promise<ListCpfCertResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listCpfCertEx(request, headers, runtime);
  }

  /**
   * Description: 证明列表查询接口
   * Summary: 证明列表查询接口
   */
  async listCpfCertEx(request: ListCpfCertRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListCpfCertResponse> {
    Util.validateModel(request);
    return $tea.cast<ListCpfCertResponse>(await this.doRequest("1.0", "antchain.tdm.cpf.cert.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListCpfCertResponse({}));
  }

  /**
   * Description: 扫码验真
   * Summary: 扫码验真
   */
  async checkCpfCert(request: CheckCpfCertRequest): Promise<CheckCpfCertResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkCpfCertEx(request, headers, runtime);
  }

  /**
   * Description: 扫码验真
   * Summary: 扫码验真
   */
  async checkCpfCertEx(request: CheckCpfCertRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckCpfCertResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckCpfCertResponse>(await this.doRequest("1.0", "antchain.tdm.cpf.cert.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckCpfCertResponse({}));
  }

  /**
   * Description: 证明使用记录保存
   * Summary: 证明使用记录保存
   */
  async saveCpfCertuse(request: SaveCpfCertuseRequest): Promise<SaveCpfCertuseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveCpfCertuseEx(request, headers, runtime);
  }

  /**
   * Description: 证明使用记录保存
   * Summary: 证明使用记录保存
   */
  async saveCpfCertuseEx(request: SaveCpfCertuseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveCpfCertuseResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveCpfCertuseResponse>(await this.doRequest("1.0", "antchain.tdm.cpf.certuse.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveCpfCertuseResponse({}));
  }

  /**
   * Description: 机构扫码用证
   * Summary: 扫码用证接口
   */
  async getCpfCertuse(request: GetCpfCertuseRequest): Promise<GetCpfCertuseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getCpfCertuseEx(request, headers, runtime);
  }

  /**
   * Description: 机构扫码用证
   * Summary: 扫码用证接口
   */
  async getCpfCertuseEx(request: GetCpfCertuseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetCpfCertuseResponse> {
    Util.validateModel(request);
    return $tea.cast<GetCpfCertuseResponse>(await this.doRequest("1.0", "antchain.tdm.cpf.certuse.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetCpfCertuseResponse({}));
  }

  /**
   * Description: 已开具证明查询
   * Summary: 已开具证明查询
   */
  async getCpfCert(request: GetCpfCertRequest): Promise<GetCpfCertResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getCpfCertEx(request, headers, runtime);
  }

  /**
   * Description: 已开具证明查询
   * Summary: 已开具证明查询
   */
  async getCpfCertEx(request: GetCpfCertRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetCpfCertResponse> {
    Util.validateModel(request);
    return $tea.cast<GetCpfCertResponse>(await this.doRequest("1.0", "antchain.tdm.cpf.cert.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetCpfCertResponse({}));
  }

  /**
   * Description: 证明使用记录查询
   * Summary: 证明使用记录查询
   */
  async listCpfCertuse(request: ListCpfCertuseRequest): Promise<ListCpfCertuseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listCpfCertuseEx(request, headers, runtime);
  }

  /**
   * Description: 证明使用记录查询
   * Summary: 证明使用记录查询
   */
  async listCpfCertuseEx(request: ListCpfCertuseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListCpfCertuseResponse> {
    Util.validateModel(request);
    return $tea.cast<ListCpfCertuseResponse>(await this.doRequest("1.0", "antchain.tdm.cpf.certuse.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListCpfCertuseResponse({}));
  }

  /**
   * Description: 机构获取用户公积金数据（授权、用数分离时接口）
   * Summary: 数据使用
   */
  async getCpfData(request: GetCpfDataRequest): Promise<GetCpfDataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getCpfDataEx(request, headers, runtime);
  }

  /**
   * Description: 机构获取用户公积金数据（授权、用数分离时接口）
   * Summary: 数据使用
   */
  async getCpfDataEx(request: GetCpfDataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetCpfDataResponse> {
    Util.validateModel(request);
    return $tea.cast<GetCpfDataResponse>(await this.doRequest("1.0", "antchain.tdm.cpf.data.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetCpfDataResponse({}));
  }

  /**
   * Description: 机构用数记录查询
   * Summary: 数据使用记录查询
   */
  async listCpfDatause(request: ListCpfDatauseRequest): Promise<ListCpfDatauseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listCpfDatauseEx(request, headers, runtime);
  }

  /**
   * Description: 机构用数记录查询
   * Summary: 数据使用记录查询
   */
  async listCpfDatauseEx(request: ListCpfDatauseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListCpfDatauseResponse> {
    Util.validateModel(request);
    return $tea.cast<ListCpfDatauseResponse>(await this.doRequest("1.0", "antchain.tdm.cpf.datause.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListCpfDatauseResponse({}));
  }

  /**
   * Description: 查询用户在公积金中心的个人账户、贷款合同信息
   * Summary: 公积金中心用户信息查询
   */
  async queryCpfUser(request: QueryCpfUserRequest): Promise<QueryCpfUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCpfUserEx(request, headers, runtime);
  }

  /**
   * Description: 查询用户在公积金中心的个人账户、贷款合同信息
   * Summary: 公积金中心用户信息查询
   */
  async queryCpfUserEx(request: QueryCpfUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCpfUserResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCpfUserResponse>(await this.doRequest("1.0", "antchain.tdm.cpf.user.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCpfUserResponse({}));
  }

  /**
   * Description: 公积金业务授权接口
   * Summary: 授权接口
   */
  async execCpfAuth(request: ExecCpfAuthRequest): Promise<ExecCpfAuthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execCpfAuthEx(request, headers, runtime);
  }

  /**
   * Description: 公积金业务授权接口
   * Summary: 授权接口
   */
  async execCpfAuthEx(request: ExecCpfAuthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecCpfAuthResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecCpfAuthResponse>(await this.doRequest("1.0", "antchain.tdm.cpf.auth.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecCpfAuthResponse({}));
  }

  /**
   * Description: 取消授权
   * Summary: 取消授权
   */
  async cancelCpfAuth(request: CancelCpfAuthRequest): Promise<CancelCpfAuthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelCpfAuthEx(request, headers, runtime);
  }

  /**
   * Description: 取消授权
   * Summary: 取消授权
   */
  async cancelCpfAuthEx(request: CancelCpfAuthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelCpfAuthResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelCpfAuthResponse>(await this.doRequest("1.0", "antchain.tdm.cpf.auth.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelCpfAuthResponse({}));
  }

  /**
   * Description: 个人授权记录查询
   * Summary: 个人授权记录查询
   */
  async queryCpfAuth(request: QueryCpfAuthRequest): Promise<QueryCpfAuthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCpfAuthEx(request, headers, runtime);
  }

  /**
   * Description: 个人授权记录查询
   * Summary: 个人授权记录查询
   */
  async queryCpfAuthEx(request: QueryCpfAuthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCpfAuthResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCpfAuthResponse>(await this.doRequest("1.0", "antchain.tdm.cpf.auth.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCpfAuthResponse({}));
  }

  /**
   * Description: 验证授权是否存在
   * Summary: 授权查验
   */
  async verifyCpfAuth(request: VerifyCpfAuthRequest): Promise<VerifyCpfAuthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyCpfAuthEx(request, headers, runtime);
  }

  /**
   * Description: 验证授权是否存在
   * Summary: 授权查验
   */
  async verifyCpfAuthEx(request: VerifyCpfAuthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyCpfAuthResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyCpfAuthResponse>(await this.doRequest("1.0", "antchain.tdm.cpf.auth.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyCpfAuthResponse({}));
  }

  /**
   * Description: 用数存证
   * Summary: 用数存证
   */
  async saveCpfDatause(request: SaveCpfDatauseRequest): Promise<SaveCpfDatauseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveCpfDatauseEx(request, headers, runtime);
  }

  /**
   * Description: 用数存证
   * Summary: 用数存证
   */
  async saveCpfDatauseEx(request: SaveCpfDatauseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveCpfDatauseResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveCpfDatauseResponse>(await this.doRequest("1.0", "antchain.tdm.cpf.datause.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveCpfDatauseResponse({}));
  }

  /**
   * Description: 交易验证
   * Summary: 用数存证验证接口
   */
  async confirmCpfDatause(request: ConfirmCpfDatauseRequest): Promise<ConfirmCpfDatauseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmCpfDatauseEx(request, headers, runtime);
  }

  /**
   * Description: 交易验证
   * Summary: 用数存证验证接口
   */
  async confirmCpfDatauseEx(request: ConfirmCpfDatauseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmCpfDatauseResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmCpfDatauseResponse>(await this.doRequest("1.0", "antchain.tdm.cpf.datause.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmCpfDatauseResponse({}));
  }

  /**
   * Description: 鉴权、权限查询
   * Summary: 鉴权接口
   */
  async checkCpfAuth(request: CheckCpfAuthRequest): Promise<CheckCpfAuthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkCpfAuthEx(request, headers, runtime);
  }

  /**
   * Description: 鉴权、权限查询
   * Summary: 鉴权接口
   */
  async checkCpfAuthEx(request: CheckCpfAuthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckCpfAuthResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckCpfAuthResponse>(await this.doRequest("1.0", "antchain.tdm.cpf.auth.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckCpfAuthResponse({}));
  }

  /**
   * Description: 商业机构公积金中心列表查询
   * Summary: 商业机构公积金中心列表查询
   */
  async listCpfSource(request: ListCpfSourceRequest): Promise<ListCpfSourceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listCpfSourceEx(request, headers, runtime);
  }

  /**
   * Description: 商业机构公积金中心列表查询
   * Summary: 商业机构公积金中心列表查询
   */
  async listCpfSourceEx(request: ListCpfSourceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListCpfSourceResponse> {
    Util.validateModel(request);
    return $tea.cast<ListCpfSourceResponse>(await this.doRequest("1.0", "antchain.tdm.cpf.source.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListCpfSourceResponse({}));
  }

  /**
   * Description: 商业核身平台核身认证创建
   * Summary: 商业核身平台核身认证创建
   */
  async createCpfVerify(request: CreateCpfVerifyRequest): Promise<CreateCpfVerifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCpfVerifyEx(request, headers, runtime);
  }

  /**
   * Description: 商业核身平台核身认证创建
   * Summary: 商业核身平台核身认证创建
   */
  async createCpfVerifyEx(request: CreateCpfVerifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCpfVerifyResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCpfVerifyResponse>(await this.doRequest("1.0", "antchain.tdm.cpf.verify.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCpfVerifyResponse({}));
  }

  /**
   * Description: 核身记录查询
   * Summary: 商业核身平台核身记录查询
   */
  async queryCpfVerify(request: QueryCpfVerifyRequest): Promise<QueryCpfVerifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCpfVerifyEx(request, headers, runtime);
  }

  /**
   * Description: 核身记录查询
   * Summary: 商业核身平台核身记录查询
   */
  async queryCpfVerifyEx(request: QueryCpfVerifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCpfVerifyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCpfVerifyResponse>(await this.doRequest("1.0", "antchain.tdm.cpf.verify.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCpfVerifyResponse({}));
  }

  /**
   * Description: 公积金业务授权接口（必须带核身vid），商业机构专用
   * Summary: 公积金业务授权接口（必须带核身vid）
   */
  async recognizeCpfAuth(request: RecognizeCpfAuthRequest): Promise<RecognizeCpfAuthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.recognizeCpfAuthEx(request, headers, runtime);
  }

  /**
   * Description: 公积金业务授权接口（必须带核身vid），商业机构专用
   * Summary: 公积金业务授权接口（必须带核身vid）
   */
  async recognizeCpfAuthEx(request: RecognizeCpfAuthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RecognizeCpfAuthResponse> {
    Util.validateModel(request);
    return $tea.cast<RecognizeCpfAuthResponse>(await this.doRequest("1.0", "antchain.tdm.cpf.auth.recognize", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RecognizeCpfAuthResponse({}));
  }

  /**
   * Description: 可信数据流转授权
   * Summary: 授权
   */
  async execAuth(request: ExecAuthRequest): Promise<ExecAuthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execAuthEx(request, headers, runtime);
  }

  /**
   * Description: 可信数据流转授权
   * Summary: 授权
   */
  async execAuthEx(request: ExecAuthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecAuthResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecAuthResponse>(await this.doRequest("1.0", "antchain.tdm.auth.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecAuthResponse({}));
  }

  /**
   * Description: 取消授权
   * Summary: 取消授权
   */
  async cancelAuth(request: CancelAuthRequest): Promise<CancelAuthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelAuthEx(request, headers, runtime);
  }

  /**
   * Description: 取消授权
   * Summary: 取消授权
   */
  async cancelAuthEx(request: CancelAuthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelAuthResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelAuthResponse>(await this.doRequest("1.0", "antchain.tdm.auth.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelAuthResponse({}));
  }

  /**
   * Description: 用权
   * Summary: 用权
   */
  async queryAuth(request: QueryAuthRequest): Promise<QueryAuthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAuthEx(request, headers, runtime);
  }

  /**
   * Description: 用权
   * Summary: 用权
   */
  async queryAuthEx(request: QueryAuthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAuthResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAuthResponse>(await this.doRequest("1.0", "antchain.tdm.auth.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAuthResponse({}));
  }

  /**
   * Description: 授权记录查询（个人授权记录查询）
   * Summary: 授权记录查询
   */
  async queryAuthOwner(request: QueryAuthOwnerRequest): Promise<QueryAuthOwnerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAuthOwnerEx(request, headers, runtime);
  }

  /**
   * Description: 授权记录查询（个人授权记录查询）
   * Summary: 授权记录查询
   */
  async queryAuthOwnerEx(request: QueryAuthOwnerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAuthOwnerResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAuthOwnerResponse>(await this.doRequest("1.0", "antchain.tdm.auth.owner.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAuthOwnerResponse({}));
  }

  /**
   * Description: 授权使用记录查询（个人查询维度）
   * Summary: 授权使用记录查询
   */
  async queryAuthuseOwner(request: QueryAuthuseOwnerRequest): Promise<QueryAuthuseOwnerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAuthuseOwnerEx(request, headers, runtime);
  }

  /**
   * Description: 授权使用记录查询（个人查询维度）
   * Summary: 授权使用记录查询
   */
  async queryAuthuseOwnerEx(request: QueryAuthuseOwnerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAuthuseOwnerResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAuthuseOwnerResponse>(await this.doRequest("1.0", "antchain.tdm.authuse.owner.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAuthuseOwnerResponse({}));
  }

  /**
   * Description: 授权数据使用
   * Summary: 授权数据使用
   */
  async execAuthuse(request: ExecAuthuseRequest): Promise<ExecAuthuseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execAuthuseEx(request, headers, runtime);
  }

  /**
   * Description: 授权数据使用
   * Summary: 授权数据使用
   */
  async execAuthuseEx(request: ExecAuthuseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecAuthuseResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecAuthuseResponse>(await this.doRequest("1.0", "antchain.tdm.authuse.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecAuthuseResponse({}));
  }

  /**
   * Description: 核身初始化接口
   * Summary: 核身初始化接口
   */
  async initCpfVerify(request: InitCpfVerifyRequest): Promise<InitCpfVerifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initCpfVerifyEx(request, headers, runtime);
  }

  /**
   * Description: 核身初始化接口
   * Summary: 核身初始化接口
   */
  async initCpfVerifyEx(request: InitCpfVerifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitCpfVerifyResponse> {
    Util.validateModel(request);
    return $tea.cast<InitCpfVerifyResponse>(await this.doRequest("1.0", "antchain.tdm.cpf.verify.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitCpfVerifyResponse({}));
  }

}
