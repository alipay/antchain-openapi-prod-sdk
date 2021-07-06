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

// 区块信息
export class BlockInfo extends $tea.Model {
  // 区块链唯一性标识
  bizId: string;
  // 区块哈希
  blockHash: string;
  // 上一个区块的hash
  parentHash: string;
  // 块高
  height: number;
  // 出块时间
  timestamp: number;
  // 业务数据
  bizData: string;
  // 包含交易数
  transactionSize: number;
  // 版本
  version: string;
  // size
  size: number;
  static names(): { [key: string]: string } {
    return {
      bizId: 'biz_id',
      blockHash: 'block_hash',
      parentHash: 'parent_hash',
      height: 'height',
      timestamp: 'timestamp',
      bizData: 'biz_data',
      transactionSize: 'transaction_size',
      version: 'version',
      size: 'size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizId: 'string',
      blockHash: 'string',
      parentHash: 'string',
      height: 'number',
      timestamp: 'number',
      bizData: 'string',
      transactionSize: 'number',
      version: 'string',
      size: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 机构（可以为银行或地区）
export class Institution extends $tea.Model {
  // 人行联行号/行政地区编码
  code: string;
  // 银行全称/行政地区名称
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

// 侵权结果
export class AntiPiracyResultObject extends $tea.Model {
  // 侵权主体
  infrHost?: string;
  // 侵权内容上传时间，number of milliseconds since the epoch of 1970-01-01T00:00:00Z
  infrTime?: number;
  // 侵权标题
  infrTitle?: string;
  // 侵权网址
  infrUrl?: string;
  // 默认值：VIDEO
  productionType?: string;
  // 相似度
  similarity?: string;
  static names(): { [key: string]: string } {
    return {
      infrHost: 'infr_host',
      infrTime: 'infr_time',
      infrTitle: 'infr_title',
      infrUrl: 'infr_url',
      productionType: 'production_type',
      similarity: 'similarity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      infrHost: 'string',
      infrTime: 'number',
      infrTitle: 'string',
      infrUrl: 'string',
      productionType: 'string',
      similarity: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 命中结果详情
export class HitDetectItems extends $tea.Model {
  // RULEORMODEL("RULEORMODEL", "规则或模型"), KEYWORDS("KEYWORDS", "关键字检测 "), REPEAT_MODEL("REPEAT_MODEL", "防重复模型"), REGEX("regex", "正则表达式"), URL("url", "URL检测"), SEXY_PIC("sexyPic", "黄图检测"), SAMPLE_PIC("samplePic", "样图检测"), OCR("ocr", "图文识别"), PICTURE_FACE("picture_face","图片人脸检测"), QRCODE("QRCode", "二维码检测"), MDP_MODEL("mdpModel", "mdp检测"), ANTI_SPAM_MODEL("anti_spam_model", "反垃圾模型");
  detectTypeCode?: string;
  // 命中的检测项的资源： 如命中关键字，则存关键字，如命中正则表达式，则保存正则表达式
  hitDetectResource?: string;
  // 保存被命中的内容： 如正则表达式，则保存被正则表达式命中的内容
  hitContent?: string;
  // 级别
  detectResourceLevel?: string;
  static names(): { [key: string]: string } {
    return {
      detectTypeCode: 'detect_type_code',
      hitDetectResource: 'hit_detect_resource',
      hitContent: 'hit_content',
      detectResourceLevel: 'detect_resource_level',
    };
  }

  static types(): { [key: string]: any } {
    return {
      detectTypeCode: 'string',
      hitDetectResource: 'string',
      hitContent: 'string',
      detectResourceLevel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用于内部业务统计的信息，外部商户请忽略
export class BizInfo extends $tea.Model {
  // BPWZPFCN
  clientTenent?: string;
  // 业务代码
  code?: string;
  // 内部产品码
  productCode?: string;
  static names(): { [key: string]: string } {
    return {
      clientTenent: 'client_tenent',
      code: 'code',
      productCode: 'product_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      clientTenent: 'string',
      code: 'string',
      productCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 携带自己定义的服务类型
export class DidDocServicesInfo extends $tea.Model {
  // 服务的扩展字段
  extension?: string;
  // 服务ID，必须保证该服务ID在did doc中是唯一的。对于保留类型服务： DidAuthService， 有且只能有一个，并且id必须为didauth-1； VerifiableClaimRepository， 有且只有一个，并且id必须为vcrepository-1;
  id: string;
  // 服务的可访问地址
  serviceEndpoint: string;
  // 服务类型，必须是已经注册的服务类型，或者是默认保留的服务类型
  type: string;
  static names(): { [key: string]: string } {
    return {
      extension: 'extension',
      id: 'id',
      serviceEndpoint: 'service_endpoint',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      extension: 'string',
      id: 'string',
      serviceEndpoint: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBmpbrowserPrivilegeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // bizid
  bizid: string;
  // 取消查看权限的支付宝电话号码集合
  phoneNumbers: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      phoneNumbers: 'phone_numbers',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      phoneNumbers: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBmpbrowserPrivilegeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 批量更新权限成功与否
  status?: number;
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
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIndividualidInternalmaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用于内部统计的参数，外部用户请忽略
  bizInfo: BizInfo;
  // 被核验人身份证号码后四位
  certNo: string;
  // 被核验人手机号码
  mobile: string;
  // 被核验人姓名的一部分
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizInfo: 'biz_info',
      certNo: 'cert_no',
      mobile: 'mobile',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizInfo: BizInfo,
      certNo: 'string',
      mobile: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIndividualidInternalmaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否通过
  accepted?: boolean;
  //  
  verifyUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accepted: 'accepted',
      verifyUrl: 'verify_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accepted: 'boolean',
      verifyUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEnterpriseidInternalfourmetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用于内部统计的参数，外部用户请忽略
  bizInfo: BizInfo;
  // 企业名称
  epCertName: string;
  // 企业证件号
  epCertNo: string;
  // 企业证件类型（NATIONAL_LEGAL（工商注册号）或 NATIONAL_LEGAL_MERGE （ 社会统一信用代码））
  epCertType: string;
  // 法人姓名
  legalPersonCertName: string;
  // 企业法人身份证号码
  legalPersonCertNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizInfo: 'biz_info',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
      epCertType: 'ep_cert_type',
      legalPersonCertName: 'legal_person_cert_name',
      legalPersonCertNo: 'legal_person_cert_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizInfo: BizInfo,
      epCertName: 'string',
      epCertNo: 'string',
      epCertType: 'string',
      legalPersonCertName: 'string',
      legalPersonCertNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEnterpriseidInternalfourmetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 企业经营状态
  enterpriseStatus?: string;
  // 营业期限
  openTime?: string;
  // 认证是否通过
  passed?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      enterpriseStatus: 'enterprise_status',
      openTime: 'open_time',
      passed: 'passed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      enterpriseStatus: 'string',
      openTime: 'string',
      passed: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEnterpriseidInternalthreemetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用于内部统计的参数，外部用户请忽略
  bizInfo?: BizInfo;
  // 企业名称
  epCertName: string;
  // 企业证件号
  epCertNo: string;
  // 证件类型
  epCertType: string;
  // 法人姓名
  legalPersonCertName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizInfo: 'biz_info',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
      epCertType: 'ep_cert_type',
      legalPersonCertName: 'legal_person_cert_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizInfo: BizInfo,
      epCertName: 'string',
      epCertNo: 'string',
      epCertType: 'string',
      legalPersonCertName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEnterpriseidInternalthreemetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 经营状态
  enterpriseStatus?: string;
  // 营业期限
  openTime?: string;
  // 认证是否通过
  passed?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      enterpriseStatus: 'enterprise_status',
      openTime: 'open_time',
      passed: 'passed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      enterpriseStatus: 'string',
      openTime: 'string',
      passed: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEnterpriseidInternaltwometaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用于内部统计的参数，外部用户请忽略
  bizInfo: BizInfo;
  // 企业名称
  epCertName: string;
  // 企业证件号
  epCertNo: string;
  // 企业证件类型（NATIONAL_LEGAL（工商注册号）或 NATIONAL_LEGAL_MERGE （ 社会统一信用代码
  epCertType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizInfo: 'biz_info',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
      epCertType: 'ep_cert_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizInfo: BizInfo,
      epCertName: 'string',
      epCertNo: 'string',
      epCertType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEnterpriseidInternaltwometaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 经营状态
  enterpriseStatus?: string;
  // 营业期限
  openTime?: string;
  // 认证是否通过
  passed?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      enterpriseStatus: 'enterprise_status',
      openTime: 'open_time',
      passed: 'passed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      enterpriseStatus: 'string',
      openTime: 'string',
      passed: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitEnterpriseidFaceauthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业名称
  epCertName: string;
  // 企业证件号
  epCertNo: string;
  // 企业证件类型（NATIONAL_LEGAL（工商注册号）或 NATIONAL_LEGAL_MERGE （ 社会统一信用代码））
  epCertType: string;
  // 企业法人姓名
  legalPersonCertName: string;
  // 企业法人身份证号（目前只支持身份证号）
  legalPersonCertNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
      epCertType: 'ep_cert_type',
      legalPersonCertName: 'legal_person_cert_name',
      legalPersonCertNo: 'legal_person_cert_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      epCertName: 'string',
      epCertNo: 'string',
      epCertType: 'string',
      legalPersonCertName: 'string',
      legalPersonCertNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitEnterpriseidFaceauthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 本次认证的业务唯一性标示
  bizNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizNo: 'biz_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEnterpriseidFaceauthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 认证的唯一性标示
  bizNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizNo: 'biz_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEnterpriseidFaceauthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 认证的唯一性标示
  bizNo?: string;
  // 认证失败错误码
  failedCode?: string;
  // 认证失败原因信息
  failedMessage?: string;
  // 是否认证通过
  passed?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizNo: 'biz_no',
      failedCode: 'failed_code',
      failedMessage: 'failed_message',
      passed: 'passed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizNo: 'string',
      failedCode: 'string',
      failedMessage: 'string',
      passed: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIndividualidInternalfourmetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 被核验人银行卡号
  bankCardNo: string;
  // 用于内部统计的参数，外部用户请忽略
  bizInfo: BizInfo;
  // 被核验人身份证号码
  certNo: string;
  // 被核验人手机号码
  mobile: string;
  // 被核验人姓名
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bankCardNo: 'bank_card_no',
      bizInfo: 'biz_info',
      certNo: 'cert_no',
      mobile: 'mobile',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bankCardNo: 'string',
      bizInfo: BizInfo,
      certNo: 'string',
      mobile: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIndividualidInternalfourmetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否通过
  accepted?: boolean;
  //  
  verifyUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accepted: 'accepted',
      verifyUrl: 'verify_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accepted: 'boolean',
      verifyUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIndividualidInternalthreemetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用于内部统计的参数，外部用户请忽略
  bizInfo: BizInfo;
  // 被核验人身份证号码
  certNo: string;
  // 被核验人手机号码
  mobile: string;
  // 被核验人姓名
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizInfo: 'biz_info',
      certNo: 'cert_no',
      mobile: 'mobile',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizInfo: BizInfo,
      certNo: 'string',
      mobile: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIndividualidInternalthreemetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否通过
  accepted?: boolean;
  //  
  verifyUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accepted: 'accepted',
      verifyUrl: 'verify_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accepted: 'boolean',
      verifyUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIndividualidInternaltwometaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用于内部统计的参数，外部用户请忽略
  bizInfo: BizInfo;
  // 被核验人身份证号码
  certNo: string;
  // 被核验人姓名
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizInfo: 'biz_info',
      certNo: 'cert_no',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizInfo: BizInfo,
      certNo: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIndividualidInternaltwometaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否通过
  accepted?: boolean;
  //  
  verifyUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accepted: 'accepted',
      verifyUrl: 'verify_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accepted: 'boolean',
      verifyUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaicorpInternalevaluationasyncRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景ID
  bizId: string;
  // 内部的业务代码
  bizInfo: BizInfo;
  // 回调地址。由于存在异步调用，部分结果通过回调返回数据。例如图片和视频。
  callback?: string;
  // 回调参数
  callbackParam?: string;
  // 业务自定义id，便于识别返回数据对应关系
  customId: string;
  // 待检测内容RAW数据，目前仅用于text类型，entity_url和entity_data不可同时存在
  entityData?: string;
  // 待评估内容类型
  entityType: string;
  // 检测内容url，支持HTTPS, entity_url和entity_data不可同时存在
  entityUrl?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      bizInfo: 'biz_info',
      callback: 'callback',
      callbackParam: 'callback_param',
      customId: 'custom_id',
      entityData: 'entity_data',
      entityType: 'entity_type',
      entityUrl: 'entity_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      bizInfo: BizInfo,
      callback: 'string',
      callbackParam: 'string',
      customId: 'string',
      entityData: 'string',
      entityType: 'string',
      entityUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaicorpInternalevaluationasyncResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 内容质量分
  contentScore?: string;
  // 质量分描述
  contentScoreDesc?: string;
  // 业务自定义id
  customId?: string;
  // 导致重复的原因
  repeatReason?: string;
  // 是否重复
  repeatResult?: boolean;
  // 风险识别结果
  riskResult?: string;
  // 风险识别结果描述
  riskResultDesc?: string;
  // 监测任务ID
  taskId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      contentScore: 'content_score',
      contentScoreDesc: 'content_score_desc',
      customId: 'custom_id',
      repeatReason: 'repeat_reason',
      repeatResult: 'repeat_result',
      riskResult: 'risk_result',
      riskResultDesc: 'risk_result_desc',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      contentScore: 'string',
      contentScoreDesc: 'string',
      customId: 'string',
      repeatReason: 'string',
      repeatResult: 'boolean',
      riskResult: 'string',
      riskResultDesc: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaicorpInternalmonitorasyncRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景id
  bizId?: string;
  // 用于内部业务统计的信息
  bizInfo: BizInfo;
  // 监测传播时间，单位暂定天
  broadcastTime?: number;
  // 基于安全考虑，填充NonceId
  customId?: string;
  // 待检测内容RAW数据
  entityData?: string;
  // 待监测内容类型
  entityType: string;
  // 待检测内容url，支持HTTP和OSS，OSS从默认源拉取,input_url和input_data不可同时存在
  entityUrl?: string;
  // 监测输入的多个关键词
  keyWords: string[];
  // 匹配时长，单位秒
  matchedDuration?: number;
  // 监测时长，单位为天
  monitorDuration?: number;
  // 监测频次，单位暂定天
  monitorFrequency: number;
  // 监测范围
  monitorScope?: string[];
  // 监测事件发送时的回调通知URL，若为空则不发送通知，24小时内最少发送成功一次
  notifyUrl?: string;
  // provider id
  providerId?: string;
  // 监测启动日期，若为空，则立刻开始，从1970开始的毫秒数。
  startDate?: number;
  // 业务方任务id，业务方保证唯一
  taskId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      bizInfo: 'biz_info',
      broadcastTime: 'broadcast_time',
      customId: 'custom_id',
      entityData: 'entity_data',
      entityType: 'entity_type',
      entityUrl: 'entity_url',
      keyWords: 'key_words',
      matchedDuration: 'matched_duration',
      monitorDuration: 'monitor_duration',
      monitorFrequency: 'monitor_frequency',
      monitorScope: 'monitor_scope',
      notifyUrl: 'notify_url',
      providerId: 'provider_id',
      startDate: 'start_date',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      bizInfo: BizInfo,
      broadcastTime: 'number',
      customId: 'string',
      entityData: 'string',
      entityType: 'string',
      entityUrl: 'string',
      keyWords: { 'type': 'array', 'itemType': 'string' },
      matchedDuration: 'number',
      monitorDuration: 'number',
      monitorFrequency: 'number',
      monitorScope: { 'type': 'array', 'itemType': 'string' },
      notifyUrl: 'string',
      providerId: 'string',
      startDate: 'number',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaicorpInternalmonitorasyncResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 检测时长，单位为天
  monitorDuration?: number;
  // 监测启动日期，若为空，则立刻开始，从1970开始的毫秒数。
  startDate?: number;
  // 业务方任务id，业务方保证唯一
  taskId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      monitorDuration: 'monitor_duration',
      startDate: 'start_date',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      monitorDuration: 'number',
      startDate: 'number',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaicorpInternalevaluationasyncRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 产品ID
  bizId: string;
  // bizinfo
  bizInfo: BizInfo;
  // 基于安全考虑，填充NonceId
  customId: string;
  // 监测任务Id
  taskId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      bizInfo: 'biz_info',
      customId: 'custom_id',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      bizInfo: BizInfo,
      customId: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaicorpInternalevaluationasyncResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务自定义id
  customId?: string;
  // 风险识别结果
  riskResult?: string;
  // 风险识别结果描述
  riskResultDesc?: string;
  // 监测任务ID
  taskId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      customId: 'custom_id',
      riskResult: 'risk_result',
      riskResultDesc: 'risk_result_desc',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      customId: 'string',
      riskResult: 'string',
      riskResultDesc: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaicorpInternalmonitorasyncRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务方产品ID
  bizId: string;
  // 业务方任务id，业务方保证唯一
  taskId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaicorpInternalmonitorasyncResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据
  data?: AntiPiracyResultObject[];
  // 如果字段status == "failed"，该字段保存相关错误信息
  errMsg?: string;
  // success 数据入库成功，后续处于被检测状态；
  // continue 数据处于被检测状态，data 字段包含监测结果
  // failed 任务失败
  status?: string;
  // 任务ID
  taskId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      errMsg: 'err_msg',
      status: 'status',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': AntiPiracyResultObject },
      errMsg: 'string',
      status: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CertifyEnterpriseidFaceauthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 认证的唯一性标示
  bizNo: string;
  // 回调通知地址
  callbackUrl?: string;
  // 认证完成后回跳地址
  // 
  redirectUrl?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizNo: 'biz_no',
      callbackUrl: 'callback_url',
      redirectUrl: 'redirect_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizNo: 'string',
      callbackUrl: 'string',
      redirectUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CertifyEnterpriseidFaceauthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 认证的唯一性标示
  // 
  bizNo?: string;
  // 认证url
  // 
  verifyUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizNo: 'biz_no',
      verifyUrl: 'verify_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizNo: 'string',
      verifyUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitIndividualidFaceauthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 姓名
  certName: string;
  // 身份证号
  certNo: string;
  // 认证方式,FACE表示在支付宝内进行认证,FACE_SDK表示在客户的应用中进行认证
  // 默认为FACE
  bizCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certName: 'cert_name',
      certNo: 'cert_no',
      bizCode: 'biz_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certName: 'string',
      certNo: 'string',
      bizCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitIndividualidFaceauthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 认证的唯一性id
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

export class CertifyIndividualidFaceauthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 回调通知地址
  callbackUrl?: string;
  // 认证的唯一性id
  certifyId: string;
  // 认证完成后回跳地址
  // 
  redirectUrl?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      callbackUrl: 'callback_url',
      certifyId: 'certify_id',
      redirectUrl: 'redirect_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      callbackUrl: 'string',
      certifyId: 'string',
      redirectUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CertifyIndividualidFaceauthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 认证的唯一性id
  certifyId?: string;
  // 认证url
  verifyUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyId: 'certify_id',
      verifyUrl: 'verify_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyId: 'string',
      verifyUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIndividualidFaceauthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 认证的唯一性id
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

export class QueryIndividualidFaceauthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 认证的唯一性id
  // 
  certifyId?: string;
  // 是否认证通过
  passed?: boolean;
  // 用户是否完成刷脸
  finished?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyId: 'certify_id',
      passed: 'passed',
      finished: 'finished',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyId: 'string',
      passed: 'boolean',
      finished: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDataserviceBlockchainheightRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 区块链的唯一性标示
  bizid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDataserviceBlockchainheightResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 区块链块高
  data?: number;
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
      data: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDataserviceTransactioncountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 区块链唯一性标示
  bizid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDataserviceTransactioncountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易总数
  data?: number;
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
      data: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDataserviceTransactioninfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 区块链唯一性标识
  bizid: string;
  // 交易hash
  hash: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      hash: 'hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      hash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDataserviceTransactioninfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 区块链唯一性标识
  bizid?: string;
  // category
  category?: number;
  // 交易发起时间
  createTime?: number;
  // 交易发起方哈希
  fromHash?: string;
  // 交易哈希
  hash?: string;
  // 块高
  height?: number;
  // 交易接收方哈希
  toHash?: string;
  // 交易类型
  type?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizid: 'bizid',
      category: 'category',
      createTime: 'create_time',
      fromHash: 'from_hash',
      hash: 'hash',
      height: 'height',
      toHash: 'to_hash',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizid: 'string',
      category: 'number',
      createTime: 'number',
      fromHash: 'string',
      hash: 'string',
      height: 'number',
      toHash: 'string',
      type: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDataserviceLastblocksRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 区块链唯一性标识
  bizid: string;
  // 区块个数
  size: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      size: 'size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      size: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDataserviceLastblocksResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 区块信息
  lastBlockList?: BlockInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      lastBlockList: 'last_block_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      lastBlockList: { 'type': 'array', 'itemType': BlockInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTasAttestationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 摘要算法默认，（sha256或者sm3 默认sm3）
  algorithm?: string;
  // tsr中是否保存证书，true表示保存，false表示不保存（默认为false）
  certReq?: boolean;
  // 返回tsr是否压缩精简，true表示要压缩精简，false表示不压缩精简 （默认为true）
  compress?: boolean;
  // 事物hash(支持sha256或sm3摘要算法),长度64个字符。
  rid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      algorithm: 'algorithm',
      certReq: 'cert_req',
      compress: 'compress',
      rid: 'rid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      algorithm: 'string',
      certReq: 'boolean',
      compress: 'boolean',
      rid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTasAttestationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 精简后的时间戳完整编码（在校验时需要提交）
  ctsr?: string;
  // serialNumber，凭证编号 （在校验的时需要先填写凭证编号）
  sn?: string;
  // 时间信息，从1970年1月1日起至当前时间的毫秒数(13位数字)
  ts?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      ctsr: 'ctsr',
      sn: 'sn',
      ts: 'ts',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      ctsr: 'string',
      sn: 'string',
      ts: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyTasCtsrRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求时间凭证接口返回的ctsr参数
  ctsr: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      ctsr: 'ctsr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      ctsr: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyTasCtsrResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 应用名
  appName?: string;
  // 公司名
  companyName?: string;
  // 事务步骤的描述
  desc?: string;
  // 请求时间凭证时传入的事物hash
  hashValue?: string;
  // serialNumber，凭证编号 （在校验的时需要先填写凭证编号）
  sn?: string;
  // 时间信息，从1970年1月1日起至当前时间的毫秒数(13位数字)
  ts?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appName: 'app_name',
      companyName: 'company_name',
      desc: 'desc',
      hashValue: 'hash_value',
      sn: 'sn',
      ts: 'ts',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appName: 'string',
      companyName: 'string',
      desc: 'string',
      hashValue: 'string',
      sn: 'string',
      ts: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTasCertificateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // serialNumber，凭证编号 （在校验的时需要先填写凭证编号）
  sn: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sn: 'sn',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sn: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTasCertificateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 下载pdf格式证书的临时url
  url?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      url: 'url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      url: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTasTransactionattestationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 事物hash(支持sha256或sm3摘要算法)
  // 长度64个字符。
  rid: string;
  // 摘要算法默认，（sha256或者sm3 默认sm3）
  algorithm?: string;
  // 返回tsr是否压缩精简，true表示要压缩精简，false表示不压缩精简 （默认为true）
  compress?: boolean;
  // tsr中是否保存证书，true表示保存，false表示不保存（默认为false）
  certReq?: boolean;
  // 事务id，允许大小写数字且小于十位的字符串
  transId: string;
  // 对事务的描述，长度小于20位
  desc: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      rid: 'rid',
      algorithm: 'algorithm',
      compress: 'compress',
      certReq: 'cert_req',
      transId: 'trans_id',
      desc: 'desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      rid: 'string',
      algorithm: 'string',
      compress: 'boolean',
      certReq: 'boolean',
      transId: 'string',
      desc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTasTransactionattestationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // serialNumber，凭证编号 （在校验的时需要先填写凭证编号）
  sn?: string;
  // 精简后的时间戳完整编码（在校验时需要提交）
  ctsr?: string;
  // 时间信息，从1970年1月1日起至当前时间的毫秒数(13位数字)
  ts?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sn: 'sn',
      ctsr: 'ctsr',
      ts: 'ts',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sn: 'string',
      ctsr: 'string',
      ts: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEverifyFourmetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 某某有限公司	
  epCertName: string;
  // 企业证件号
  epCertNo: string;
  // 法人姓名
  legalPersonCertName: string;
  // 企业法人身份证号码
  legalPersonCertNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
      legalPersonCertName: 'legal_person_cert_name',
      legalPersonCertNo: 'legal_person_cert_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      epCertName: 'string',
      epCertNo: 'string',
      legalPersonCertName: 'string',
      legalPersonCertNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEverifyFourmetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 0:核验成功
  // 1:企业信息有误
  // 2:企业非正常营业
  code?: string;
  // 企业经营状态
  enterpriseStatus?: string;
  // 营业期限
  openTime?: string;
  // 认证是否通过
  passed?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      enterpriseStatus: 'enterprise_status',
      openTime: 'open_time',
      passed: 'passed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      enterpriseStatus: 'string',
      openTime: 'string',
      passed: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEverifyThreemetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业名称
  epCertName: string;
  // 企业证件号
  epCertNo: string;
  // 法人姓名
  legalPersonCertName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
      legalPersonCertName: 'legal_person_cert_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      epCertName: 'string',
      epCertNo: 'string',
      legalPersonCertName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEverifyThreemetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 0:核验成功
  // 1:企业信息有误
  // 2:企业非正常营业
  code?: string;
  // 经营状态
  enterpriseStatus?: string;
  // 营业期限
  openTime?: string;
  // 认证是否通过
  passed?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      enterpriseStatus: 'enterprise_status',
      openTime: 'open_time',
      passed: 'passed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      enterpriseStatus: 'string',
      openTime: 'string',
      passed: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEverifyTwometaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业名称
  epCertName: string;
  // 企业证件号
  epCertNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      epCertName: 'string',
      epCertNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEverifyTwometaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 经营状态
  enterpriseStatus?: string;
  // 营业期限
  openTime?: string;
  // 认证是否通过
  passed?: boolean;
  // 0:核验成功
  // 1:企业信息有误
  // 2:企业非正常营业
  code?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      enterpriseStatus: 'enterprise_status',
      openTime: 'open_time',
      passed: 'passed',
      code: 'code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      enterpriseStatus: 'string',
      openTime: 'string',
      passed: 'boolean',
      code: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaicorpInternalsearchlibraryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 账户ID，账户粒度ID。
  accountId: string;
  // 产品ID
  bizId: string;
  // 商户ID，即平台用户ID。
  companyId: string;
  //  内容ID
  contentId: string;
  // 基于安全考虑，填充NonceId
  customId: string;
  // 待检测内容的raw data，这期暂不使用
  entityData?: string;
  // 待检测字段的描述信息，包括标题、描述或关键词，json格式字符串
  entityDesc?: string;
  // 待检测内容类型，[TEXT, PICTURE, VIDEO, HTML]
  entityType: string;
  // 1、待检测内容oss url（后续可以扩展为非oss的文件url）
  // 2、假如使用AK访问，此处填写fileid。
  entityUrl: string;
  // 时间戳
  timestamp: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountId: 'account_id',
      bizId: 'biz_id',
      companyId: 'company_id',
      contentId: 'content_id',
      customId: 'custom_id',
      entityData: 'entity_data',
      entityDesc: 'entity_desc',
      entityType: 'entity_type',
      entityUrl: 'entity_url',
      timestamp: 'timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountId: 'string',
      bizId: 'string',
      companyId: 'string',
      contentId: 'string',
      customId: 'string',
      entityData: 'string',
      entityDesc: 'string',
      entityType: 'string',
      entityUrl: 'string',
      timestamp: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaicorpInternalsearchlibraryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // NoucelId
  customId?: string;
  // 采用的模型以及版本说明
  modelInfo?: string;
  // 重复列表，json list格式
  repeatInfo?: string;
  // 相似度信息列表，json list格式
  similarityInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      customId: 'custom_id',
      modelInfo: 'model_info',
      repeatInfo: 'repeat_info',
      similarityInfo: 'similarity_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      customId: 'string',
      modelInfo: 'string',
      repeatInfo: 'string',
      similarityInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaicorpInternalsearchlibraryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 账户ID，账户粒度ID。
  accountId: string;
  // 产品ID，[BANQUAN, PAIPAI]
  bizId: string;
  // 商户ID，即平台用户ID。
  companyId: string;
  // 内容ID
  contentId: string;
  // 	
  // 基于安全考虑，填充NonceId。
  customId: string;
  // 待检测内容的raw data，这期暂不使用
  entityData: string;
  // 待检测字段的描述信息，包括标题、描述或关键词，json格式字符串。
  entityDesc: string;
  // 待检测内容类型，[TEXT, PICTURE, VIDEO, HTML]
  entityType: string;
  // 1.待检测内容oss url（后续可以扩展为非oss的文件url）。
  // 2.假如使用AK访问，此处填写fileid。
  entityUrl: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountId: 'account_id',
      bizId: 'biz_id',
      companyId: 'company_id',
      contentId: 'content_id',
      customId: 'custom_id',
      entityData: 'entity_data',
      entityDesc: 'entity_desc',
      entityType: 'entity_type',
      entityUrl: 'entity_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountId: 'string',
      bizId: 'string',
      companyId: 'string',
      contentId: 'string',
      customId: 'string',
      entityData: 'string',
      entityDesc: 'string',
      entityType: 'string',
      entityUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaicorpInternalsearchlibraryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // NounceId
  customId?: string;
  // 更新是否成功
  updateResult?: string;
  // 更新描述、更新失败原因
  updateDesc?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      customId: 'custom_id',
      updateResult: 'update_result',
      updateDesc: 'update_desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      customId: 'string',
      updateResult: 'string',
      updateDesc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEpayauthRootbankRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 支持全称，或部分名称 如果不传名称，系统默认将返回热门银行，如果用户期望的银行不是热门银行，可以建议用户输入银行名称进行查询。
  bankName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bankName: 'bank_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bankName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEpayauthRootbankResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 银行列表
  bankDetails?: Institution[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bankDetails: 'bank_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bankDetails: { 'type': 'array', 'itemType': Institution },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryYdapplyprotEcapplyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户证件号码
  certNo: string;
  // 用户手机号码
  mobile: string;
  // 用户姓名
  userName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certNo: 'cert_no',
      mobile: 'mobile',
      userName: 'user_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certNo: 'string',
      mobile: 'string',
      userName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryYdapplyprotEcapplyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 核验是否通过
  passed?: boolean;
  // 风险分
  score?: string;
  // 命中的策略列表
  strategies?: string[];
  // 风险决策结果
  decision?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      passed: 'passed',
      score: 'score',
      strategies: 'strategies',
      decision: 'decision',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      passed: 'boolean',
      score: 'string',
      strategies: { 'type': 'array', 'itemType': 'string' },
      decision: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryYdpacprotEcpacRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户手机号
  mobile: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      mobile: 'mobile',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      mobile: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryYdpacprotEcpacResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 认证是否通过
  passed?: boolean;
  // 模型分数
  score?: string;
  // 命中策略列表
  strategies?: string[];
  // 风险决策结果
  decision?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      passed: 'passed',
      score: 'score',
      strategies: 'strategies',
      decision: 'decision',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      passed: 'boolean',
      score: 'string',
      strategies: { 'type': 'array', 'itemType': 'string' },
      decision: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryYdauthprotTwometaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 被核验用户的身份证号
  certNo: string;
  // 被核验用户的姓名
  userName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certNo: 'cert_no',
      userName: 'user_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certNo: 'string',
      userName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryYdauthprotTwometaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 核验是否通过
  passed?: boolean;
  // 风险分
  score?: string;
  // 命中的策略列表
  strategies?: string[];
  // 风险决策结果
  decision?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      passed: 'passed',
      score: 'score',
      strategies: 'strategies',
      decision: 'decision',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      passed: 'boolean',
      score: 'string',
      strategies: { 'type': 'array', 'itemType': 'string' },
      decision: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryYdauthprotThreemetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 被核验用户的身份证号
  certNo: string;
  // 被核验用户的手机号
  mobile: string;
  // 被核验用户姓名
  userName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certNo: 'cert_no',
      mobile: 'mobile',
      userName: 'user_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certNo: 'string',
      mobile: 'string',
      userName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryYdauthprotThreemetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 核验是否通过
  passed?: boolean;
  // 风险分
  score?: string;
  // 命中的策略列表
  strategies?: string[];
  // 风险决策结果
  decision?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      passed: 'passed',
      score: 'score',
      strategies: 'strategies',
      decision: 'decision',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      passed: 'boolean',
      score: 'string',
      strategies: { 'type': 'array', 'itemType': 'string' },
      decision: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryYdauthprotFourmetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 被核验用户的银行卡号
  cardNo: string;
  // 被核验用户的身份证号
  certNo: string;
  // 被核验用户的手机号
  mobile: string;
  // 被核验用户的姓名
  userName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cardNo: 'card_no',
      certNo: 'cert_no',
      mobile: 'mobile',
      userName: 'user_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cardNo: 'string',
      certNo: 'string',
      mobile: 'string',
      userName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryYdauthprotFourmetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 核验是否通过
  passed?: boolean;
  // 风险分
  score?: string;
  // 命中的策略列表
  strategies?: string[];
  // 风险决策结果
  decision?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      passed: 'passed',
      score: 'score',
      strategies: 'strategies',
      decision: 'decision',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      passed: 'boolean',
      score: 'string',
      strategies: { 'type': 'array', 'itemType': 'string' },
      decision: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryYdmktprotEcmarketcampaignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户手机号
  mobile: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      mobile: 'mobile',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      mobile: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryYdmktprotEcmarketcampaignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 核验是否通过
  passed?: boolean;
  // 风险分
  score?: string;
  // 命中的策略列表
  strategies?: string[];
  // 风险决策结果
  decision?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      passed: 'passed',
      score: 'score',
      strategies: 'strategies',
      decision: 'decision',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      passed: 'boolean',
      score: 'string',
      strategies: { 'type': 'array', 'itemType': 'string' },
      decision: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryYdregprotEcregisterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户手机号
  mobile: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      mobile: 'mobile',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      mobile: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryYdregprotEcregisterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否核验通过
  passed?: boolean;
  // 风险分
  score?: string;
  // 命中的策略列表
  strategies?: string[];
  // 风险决策结果
  decision?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      passed: 'passed',
      score: 'score',
      strategies: 'strategies',
      decision: 'decision',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      passed: 'boolean',
      score: 'string',
      strategies: { 'type': 'array', 'itemType': 'string' },
      decision: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEpayauthBranchbankRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 银行名称，支持全称，或部分名称
  // bank_name和district_code至少有一个不为空
  bankName?: string;
  // 行政地区编码
  // bank_name和district_code至少有一个不为空
  districtCode?: string;
  // 总行联行号
  rootBankCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bankName: 'bank_name',
      districtCode: 'district_code',
      rootBankCode: 'root_bank_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bankName: 'string',
      districtCode: 'string',
      rootBankCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEpayauthBranchbankResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // Institution列表
  bankDetails?: Institution[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bankDetails: 'bank_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bankDetails: { 'type': 'array', 'itemType': Institution },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEpayauthDistrictRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 父级行政地区编码。 不填则默认查询省级行政地区编码，支持省市县三级查询。
  parentCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      parentCode: 'parent_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      parentCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEpayauthDistrictResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // District列表
  districtDetails?: Institution[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      districtDetails: 'district_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      districtDetails: { 'type': 'array', 'itemType': Institution },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitEpayauthVerifyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 待认证银行卡号
  // 
  bankCardNo: string;
  // 人行联行号
  bankCode: string;
  // 回调通知地址
  callbackUrl: string;
  // 企业名称
  epCertName: string;
  // 企业证件号
  epCertNo: string;
  // 法人姓名
  legalPersonCertName: string;
  // 企业法人身份证号码
  legalPersonCertNo: string;
  // 手机号码 用于接收打款验证通知短信
  mobile?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bankCardNo: 'bank_card_no',
      bankCode: 'bank_code',
      callbackUrl: 'callback_url',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
      legalPersonCertName: 'legal_person_cert_name',
      legalPersonCertNo: 'legal_person_cert_no',
      mobile: 'mobile',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bankCardNo: 'string',
      bankCode: 'string',
      callbackUrl: 'string',
      epCertName: 'string',
      epCertNo: 'string',
      legalPersonCertName: 'string',
      legalPersonCertNo: 'string',
      mobile: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitEpayauthVerifyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 2017070610120520200000000051240001626725
  verifyId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      verifyId: 'verify_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      verifyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEpayauthVerifyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 打款金额，只支持两位小数点的正数，单位：元
  amount: string;
  // 支付币种
  currency: string;
  // 打款验证ID 打款验证受理后生成的一个唯一标识
  verifyId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      amount: 'amount',
      currency: 'currency',
      verifyId: 'verify_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      amount: 'string',
      currency: 'string',
      verifyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEpayauthVerifyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 验证是否成功
  valid?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      valid: 'valid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      valid: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBmpbrowserTransactionqrcodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 蚂蚁区块链的唯一链id
  bizid: string;
  // 链上合约id
  contractId?: string;
  // 蚂蚁区块链的链上交易hash值
  hash: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      contractId: 'contract_id',
      hash: 'hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      contractId: 'string',
      hash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBmpbrowserTransactionqrcodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易二维码二进制内容的Base64编码
  qrCodeDownloadUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      qrCodeDownloadUrl: 'qr_code_download_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      qrCodeDownloadUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddBmpbrowserPrivilegeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 蚂蚁区块链的唯一链id
  bizid: string;
  // 授权查看权限的支付宝电话号码集合
  phoneNumbers: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      phoneNumbers: 'phone_numbers',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      phoneNumbers: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddBmpbrowserPrivilegeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 批量添加权限成功与否
  status?: number;
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
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIdcocrIdcardRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 身份证图片base64编码内容
  imageContent: string;
  // face: 身份证正面
  // back: 身份证反面
  side: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      imageContent: 'image_content',
      side: 'side',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      imageContent: 'string',
      side: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIdcocrIdcardResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 地址
  address?: string;
  // 出生年月日
  birth?: string;
  // 信息抽取失败后详细错误原因
  errorContent?: string;
  // 身份证号码
  num?: string;
  // 性别：男/女
  sex?: string;
  // 解析成功
  success?: boolean;
  // 有效期截止时间
  endDate?: string;
  // 公安局分案
  issue?: string;
  // 有效期开始时间
  startDate?: string;
  // 民族
  nationality?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      address: 'address',
      birth: 'birth',
      errorContent: 'error_content',
      num: 'num',
      sex: 'sex',
      success: 'success',
      endDate: 'end_date',
      issue: 'issue',
      startDate: 'start_date',
      nationality: 'nationality',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      address: 'string',
      birth: 'string',
      errorContent: 'string',
      num: 'string',
      sex: 'string',
      success: 'boolean',
      endDate: 'string',
      issue: 'string',
      startDate: 'string',
      nationality: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitCaCertificateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务唯一性uuid，用于后续的证书查询
  bizUuid: string;
  // 证书请求(CSR)
  command: string;
  // 8B75D2EEDF1658CC9C1B7C05AA600856  区块链-baasplus平台对外持牌证书服务场景
  // 2D25EFFD786590991542CAE2D14CB18E   区块链-baasplus平台对外非持牌证书服务场景
  configId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizUuid: 'biz_uuid',
      command: 'command',
      configId: 'config_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizUuid: 'string',
      command: 'string',
      configId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitCaCertificateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 证书序列号
  certSn?: string;
  // 证书内容
  p10?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certSn: 'cert_sn',
      p10: 'p10',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certSn: 'string',
      p10: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitContentriskInternalRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 进行识别的音频地址
  audioUrls?: string;
  // 内部字段
  bizInfo: BizInfo;
  // 待校验连接
  linkUrls?: string;
  // 图片连接
  pictureUrls?: string;
  // 场景码
  sceneCode: string;
  // 待校验文本
  text?: string;
  // 进行识别的视频地址
  videoUrls?: string;
  // 用户id
  accountId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      audioUrls: 'audio_urls',
      bizInfo: 'biz_info',
      linkUrls: 'link_urls',
      pictureUrls: 'picture_urls',
      sceneCode: 'scene_code',
      text: 'text',
      videoUrls: 'video_urls',
      accountId: 'account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      audioUrls: 'string',
      bizInfo: BizInfo,
      linkUrls: 'string',
      pictureUrls: 'string',
      sceneCode: 'string',
      text: 'string',
      videoUrls: 'string',
      accountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitContentriskInternalResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 内容ID，用于查询异步识别结果时作为查询ID
  appSceneDataId?: string;
  // 内容安全同步检测返回的事件id，用于异步获取检测结果
  eventId?: string;
  // 命中结果详情
  hitDetectItems?: HitDetectItems[];
  // 是否需要进行异步查询的标志位 need: 需要等待60秒之后进行异步查询 no_need: 不需要，已经同步返回结果
  needQuery?: string;
  // PASSED("数据识别通过，可以在网站上正常显示")
  // 
  // REJECTED("被拒绝的数据，比如内容出现违禁词；不能出现在我们网站上")
  // 
  // CC("CC表示用户发表数据后，提示成功，自己能看到这条消息，但其它人接收不到本条消息或看不见这条消息。")
  // 
  // DELETE("删除数据, 为了不扩大化数据的传播，删除历史已经发出去的数据。")
  // 
  // REPLACE("替换部分词为 ***")
  // 
  // WARNING("提示数据，表示内容存在可疑，提示用户操作")
  // 
  // RECOVER("恢复数据，将误判断的内容，恢复回来")
  resultAction?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appSceneDataId: 'app_scene_data_id',
      eventId: 'event_id',
      hitDetectItems: 'hit_detect_items',
      needQuery: 'need_query',
      resultAction: 'result_action',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appSceneDataId: 'string',
      eventId: 'string',
      hitDetectItems: { 'type': 'array', 'itemType': HitDetectItems },
      needQuery: 'string',
      resultAction: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContentriskInternalRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  sceneCode: string;
  // 内容业务ID，用于进行异步识别结果的索引查询
  appSceneDataId: string;
  // 内部参数
  bizInfo: BizInfo;
  // 内容检测事件id，根据此id查询异步检测结果
  eventId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneCode: 'scene_code',
      appSceneDataId: 'app_scene_data_id',
      bizInfo: 'biz_info',
      eventId: 'event_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneCode: 'string',
      appSceneDataId: 'string',
      bizInfo: BizInfo,
      eventId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContentriskInternalResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 命中结果详情
  hitDetectItems?: HitDetectItems[];
  // PASSED("数据识别通过，可以在网站上正常显示") REJECTED("被拒绝的数据，比如内容出现违禁词；不能出现在我们网站上")
  resultAction?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      hitDetectItems: 'hit_detect_items',
      resultAction: 'result_action',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      hitDetectItems: { 'type': 'array', 'itemType': HitDetectItems },
      resultAction: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitIndividualidImageauthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 姓名
  certName: string;
  // 身份证号
  certNo: string;
  // Base64编码的人脸正面照片
  encodedFacialPictureFront: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certName: 'cert_name',
      certNo: 'cert_no',
      encodedFacialPictureFront: 'encoded_facial_picture_front',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certName: 'string',
      certNo: 'string',
      encodedFacialPictureFront: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitIndividualidImageauthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 认证的唯一性id
  certifyId?: string;
  // 认证是否成功
  passed?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyId: 'certify_id',
      passed: 'passed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyId: 'string',
      passed: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddIotcseAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 序列化的json string
  bizContent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddIotcseAccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回
  rawResponse?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      rawResponse: 'raw_response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      rawResponse: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveIotcseEvidenceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 序列化的json string
  bizContent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveIotcseEvidenceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回
  rawResponse?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      rawResponse: 'raw_response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      rawResponse: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIotcseEvidenceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 序列化的json string
  bizContent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIotcseEvidenceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回
  rawResponse?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      rawResponse: 'raw_response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      rawResponse: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDidCorporatedidagentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 扩展字段
  // { "nation": "CN", //企业注册地址 "type": "LimitedCompany", //企业类型 "name": "演示用户名", //必选字段，企业名 "licenceNo": "1111", //营业执照 "address": "1111", //企业地址 "parentName": "", //<-必选字段 业务方名 需要提前协商 "linkType": "indirect", //<- 连接类型，direct直链企业， indirect间链企业 "certifyDate": "2019-1-1", //证书颁发时间 "licenceExpireDate": "2020-1-1", //证书到期时间 "businessScope": "1111", //企业经营范围 "businessAddress": "1111", //企业经营地址 "corporateBusinessType": 0, //<- 企业类型：0 一般企业， 1 个人商户 "channelName": "" //<- 必选字段 业务渠道 需要提前沟通 }
  extensionInfo: string;
  // 所有需要关联的外键，外键必须已did auth key controller的did作为前缀+“sidekey:”+外键
  indexs?: string[];
  // 企业名称
  ownerName?: string;
  // 自定义企业唯一id，企业在自有模式下的唯一号bid的hash值，调用者需要保证其唯一性
  ownerUid: string;
  // 携带自己定义的服务类型
  services?: DidDocServicesInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      extensionInfo: 'extension_info',
      indexs: 'indexs',
      ownerName: 'owner_name',
      ownerUid: 'owner_uid',
      services: 'services',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      extensionInfo: 'string',
      indexs: { 'type': 'array', 'itemType': 'string' },
      ownerName: 'string',
      ownerUid: 'string',
      services: { 'type': 'array', 'itemType': DidDocServicesInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDidCorporatedidagentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 生成的did字符串
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

export class InitIndividualidFaceauthinternalRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 认证方式,FACE表示在支付宝内进行认证,FACE_SDK表示在客户的应用中进行认证 默认为FACE
  bizCode?: string;
  // 姓名
  certName: string;
  // 身份证号
  certNo: string;
  // 内部字段
  bizInfo: BizInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizCode: 'biz_code',
      certName: 'cert_name',
      certNo: 'cert_no',
      bizInfo: 'biz_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizCode: 'string',
      certName: 'string',
      certNo: 'string',
      bizInfo: BizInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitIndividualidFaceauthinternalResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 认证的唯一性id
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

export class CertifyIndividualidFaceauthinternalRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 回调通知地址
  callbackUrl?: string;
  // 认证的唯一性id
  // 
  certifyId: string;
  // 认证完成后回跳地址
  redirectUrl?: string;
  // 内部字段
  bizInfo: BizInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      callbackUrl: 'callback_url',
      certifyId: 'certify_id',
      redirectUrl: 'redirect_url',
      bizInfo: 'biz_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      callbackUrl: 'string',
      certifyId: 'string',
      redirectUrl: 'string',
      bizInfo: BizInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CertifyIndividualidFaceauthinternalResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 认证的唯一性id
  certifyId?: string;
  // 认证url
  verifyUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyId: 'certify_id',
      verifyUrl: 'verify_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyId: 'string',
      verifyUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIndividualidFaceauthinternalRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 内部字段
  bizInfo: BizInfo;
  // 认证的唯一性id
  certifyId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizInfo: 'biz_info',
      certifyId: 'certify_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizInfo: BizInfo,
      certifyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIndividualidFaceauthinternalResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 认证的唯一性id
  certifyId?: string;
  // 是否认证通过
  passed?: boolean;
  // 用户是否完成刷脸
  finished?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyId: 'certify_id',
      passed: 'passed',
      finished: 'finished',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyId: 'string',
      passed: 'boolean',
      finished: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitEnterpriseidFaceauthinternalRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业名称
  epCertName: string;
  // 企业证件号
  epCertNo: string;
  // 企业证件类型（NATIONAL_LEGAL（工商注册号）或 NATIONAL_LEGAL_MERGE （ 社会统一信用代码））
  epCertType: string;
  // 企业法人姓名
  legalPersonCertName: string;
  // 企业法人身份证号（目前只支持身份证号）
  // 
  legalPersonCertNo: string;
  // 内部字段
  bizInfo: BizInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
      epCertType: 'ep_cert_type',
      legalPersonCertName: 'legal_person_cert_name',
      legalPersonCertNo: 'legal_person_cert_no',
      bizInfo: 'biz_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      epCertName: 'string',
      epCertNo: 'string',
      epCertType: 'string',
      legalPersonCertName: 'string',
      legalPersonCertNo: 'string',
      bizInfo: BizInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitEnterpriseidFaceauthinternalResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 本次认证的业务唯一性标示
  // 
  bizNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizNo: 'biz_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CertifyEnterpriseidFaceauthinternalRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 内部字段
  bizInfo: BizInfo;
  // 认证的唯一性标示
  bizNo: string;
  // 回调通知地址
  // 
  callbackUrl?: string;
  // https://www.example.com/redircet	
  redirectUrl?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizInfo: 'biz_info',
      bizNo: 'biz_no',
      callbackUrl: 'callback_url',
      redirectUrl: 'redirect_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizInfo: BizInfo,
      bizNo: 'string',
      callbackUrl: 'string',
      redirectUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CertifyEnterpriseidFaceauthinternalResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 认证的唯一性标示
  bizNo?: string;
  // 认证url
  verifyUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizNo: 'biz_no',
      verifyUrl: 'verify_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizNo: 'string',
      verifyUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEverifyTwometainternalRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业名称
  // 
  epCertName: string;
  // 企业证件号
  // 
  epCertNo: string;
  // 内部字段
  bizInfo: BizInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
      bizInfo: 'biz_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      epCertName: 'string',
      epCertNo: 'string',
      bizInfo: BizInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEverifyTwometainternalResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 0:核验成功 1:企业信息有误 2:企业非正常营业
  code?: string;
  // 经营状态
  // 
  enterpriseStatus?: string;
  // 营业期限
  // 
  openTime?: string;
  // 认证是否通过
  passed?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      enterpriseStatus: 'enterprise_status',
      openTime: 'open_time',
      passed: 'passed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      enterpriseStatus: 'string',
      openTime: 'string',
      passed: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEverifyThreemetainternalRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业名称
  // 
  epCertName: string;
  // 企业证件号
  // 
  epCertNo: string;
  // 法人姓名
  legalPersonCertName: string;
  // 内部字段
  bizInfo: BizInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
      legalPersonCertName: 'legal_person_cert_name',
      bizInfo: 'biz_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      epCertName: 'string',
      epCertNo: 'string',
      legalPersonCertName: 'string',
      bizInfo: BizInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEverifyThreemetainternalResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 0:核验成功 1:企业信息有误 2:企业非正常营业
  code?: string;
  // 经营状态
  // 
  enterpriseStatus?: string;
  // 营业期限
  // 
  openTime?: string;
  // 认证是否通过
  // 
  passed?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      enterpriseStatus: 'enterprise_status',
      openTime: 'open_time',
      passed: 'passed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      enterpriseStatus: 'string',
      openTime: 'string',
      passed: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEverifyFourmetainternalRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业名称
  epCertName: string;
  // 企业证件号
  // 
  epCertNo: string;
  // 法人姓名
  // 
  legalPersonCertName: string;
  // 企业法人身份证号码
  // 
  legalPersonCertNo: string;
  // 内部字段
  bizInfo: BizInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
      legalPersonCertName: 'legal_person_cert_name',
      legalPersonCertNo: 'legal_person_cert_no',
      bizInfo: 'biz_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      epCertName: 'string',
      epCertNo: 'string',
      legalPersonCertName: 'string',
      legalPersonCertNo: 'string',
      bizInfo: BizInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEverifyFourmetainternalResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 0:核验成功 1:企业信息有误 2:企业非正常营业
  // 
  code?: string;
  // 企业经营状态
  // 
  enterpriseStatus?: string;
  // 营业期限
  // 
  openTime?: string;
  // 认证是否通过
  // 
  passed?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      enterpriseStatus: 'enterprise_status',
      openTime: 'open_time',
      passed: 'passed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      enterpriseStatus: 'string',
      openTime: 'string',
      passed: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEnterpriseidFaceauthinternalRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 认证的唯一性标示
  bizNo: string;
  // 内部字段
  bizInfo: BizInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizNo: 'biz_no',
      bizInfo: 'biz_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizNo: 'string',
      bizInfo: BizInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEnterpriseidFaceauthinternalResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 	
  // 认证的唯一性标示
  bizNo?: string;
  // 认证失败错误码
  // 
  failedCode?: string;
  // 认证失败原因信息
  // 
  failedMessage?: string;
  // 是否认证通过
  passed?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizNo: 'biz_no',
      failedCode: 'failed_code',
      failedMessage: 'failed_message',
      passed: 'passed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizNo: 'string',
      failedCode: 'string',
      failedMessage: 'string',
      passed: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddIotcseThingsdidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 序列化的json string
  bizContent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddIotcseThingsdidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 暂无
  rawResponse?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      rawResponse: 'raw_response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      rawResponse: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateIotcseThingsdidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 暂无
  bizContent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateIotcseThingsdidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 暂无
  rawResponse?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      rawResponse: 'raw_response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      rawResponse: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIotcseThingsdidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 暂无
  bizContent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIotcseThingsdidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 暂无
  rawResponse?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      rawResponse: 'raw_response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      rawResponse: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIotcseAsyncprocessRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // {"key":"value"}
  bizContent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIotcseAsyncprocessResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 暂无
  rawResponse?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      rawResponse: 'raw_response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      rawResponse: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecIotcseGroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 暂无
  bizContent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecIotcseGroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 暂无
  rawResponse?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      rawResponse: 'raw_response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      rawResponse: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIotcseGroupdeviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 暂无
  bizContent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIotcseGroupdeviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 暂无
  rawResponse?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      rawResponse: 'raw_response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      rawResponse: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIotcseDevicegroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 暂无
  bizContent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIotcseDevicegroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 暂无
  rawResponse?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      rawResponse: 'raw_response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      rawResponse: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIotcseTenantdeviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 暂无
  bizContent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIotcseTenantdeviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 暂无
  rawResponse?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      rawResponse: 'raw_response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      rawResponse: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateIotcseDevicestatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 暂无
  bizContent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateIotcseDevicestatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 暂无
  rawResponse?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      rawResponse: 'raw_response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      rawResponse: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIotcseDevicemodelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 暂无
  bizContent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIotcseDevicemodelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 暂无
  rawResponse?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      rawResponse: 'raw_response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      rawResponse: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateIotcseDevicespaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 暂无
  bizContent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateIotcseDevicespaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 暂无
  rawResponse?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      rawResponse: 'raw_response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      rawResponse: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIotcseEvidencebatchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 暂无
  bizContent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIotcseEvidencebatchResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 暂无
  rawResponse?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      rawResponse: 'raw_response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      rawResponse: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBlocrBusinesslicenseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件二进制内容 + base64
  imageRaw?: string;
  // 图片下载url
  imageUrl?: string;
  // 服务调用来源(需要咨询服务提供方)
  source: string;
  // 单次调用唯一标示，用于异常问题排查，调用方需要负责生成并且记录在调用日志里
  traceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      imageRaw: 'image_raw',
      imageUrl: 'image_url',
      source: 'source',
      traceId: 'trace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      imageRaw: 'string',
      imageUrl: 'string',
      source: 'string',
      traceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBlocrBusinesslicenseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 算法错误信息
  algoMsg?: string;
  // 算法异常错误码
  algoRet?: number;
  // 框架错误信息
  message?: string;
  // 算法结果,JSON String
  result?: string;
  // 框架inference服务错误码，0为正常
  ret?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      algoMsg: 'algo_msg',
      algoRet: 'algo_ret',
      message: 'message',
      result: 'result',
      ret: 'ret',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      algoMsg: 'string',
      algoRet: 'number',
      message: 'string',
      result: 'string',
      ret: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInvoicesocrVatinvoiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件二进制内容 + base64
  imageRaw?: string;
  // 图片下载url
  imageUrl?: string;
  // 服务调用来源(需要咨询服务提供方)
  source?: string;
  // 单次调用唯一标示，用于异常问题排查，调用方需要负责生成并且记录在调用日志里
  traceId: string;
  // 目前只支持pdf、jpg两种file_type的识别能力，根据具体传入的发票的格式传入正确的值
  fileType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      imageRaw: 'image_raw',
      imageUrl: 'image_url',
      source: 'source',
      traceId: 'trace_id',
      fileType: 'file_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      imageRaw: 'string',
      imageUrl: 'string',
      source: 'string',
      traceId: 'string',
      fileType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInvoicesocrVatinvoiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 算法错误信息
  algoMsg?: string;
  // 算法异常错误码
  // 
  algoRet?: string;
  // 框架错误信息
  // 
  message?: string;
  // 算法结果,JSON String
  result?: string;
  // 框架inference服务错误码，0为正常
  ret?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      algoMsg: 'algo_msg',
      algoRet: 'algo_ret',
      message: 'message',
      result: 'result',
      ret: 'ret',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      algoMsg: 'string',
      algoRet: 'string',
      message: 'string',
      result: 'string',
      ret: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBmpbrowserPrivilegeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 蚂蚁区块链的唯一链id
  // 
  bizid: string;
  // 查看权限的支付宝电话号码
  // 
  phoneNumber: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      phoneNumber: 'phone_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      phoneNumber: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBmpbrowserPrivilegeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 权限成功与否
  // 
  status?: number;
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
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelBmpbrowserPrivilegeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 蚂蚁区块链的唯一链id
  // 
  bizid: string;
  // 取消查看权限的支付宝电话号码集合
  // 
  phoneNumbers: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      phoneNumbers: 'phone_numbers',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      phoneNumbers: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelBmpbrowserPrivilegeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 批量取消权限成功与否
  status?: number;
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
      status: 'number',
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
          sdk_version: "1.1.2",
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
   * Description: 链上交易移动端权限修改
   * Summary: 链上交易移动端权限修改
   */
  async updateBmpbrowserPrivilege(request: UpdateBmpbrowserPrivilegeRequest): Promise<UpdateBmpbrowserPrivilegeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateBmpbrowserPrivilegeEx(request, headers, runtime);
  }

  /**
   * Description: 链上交易移动端权限修改
   * Summary: 链上交易移动端权限修改
   */
  async updateBmpbrowserPrivilegeEx(request: UpdateBmpbrowserPrivilegeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateBmpbrowserPrivilegeResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBmpbrowserPrivilegeResponse>(await this.doRequest("1.0", "baas.plus.bmpbrowser.privilege.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateBmpbrowserPrivilegeResponse({}));
  }

  /**
   * Description: 提供个人脱敏信息身份核验服务（1.姓名的一部分 2.手机号 3.身份证号码后四位）
   * Summary: 个人脱敏信息身份核验（数据来自蚁盾）
   */
  async queryIndividualidInternalmask(request: QueryIndividualidInternalmaskRequest): Promise<QueryIndividualidInternalmaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIndividualidInternalmaskEx(request, headers, runtime);
  }

  /**
   * Description: 提供个人脱敏信息身份核验服务（1.姓名的一部分 2.手机号 3.身份证号码后四位）
   * Summary: 个人脱敏信息身份核验（数据来自蚁盾）
   */
  async queryIndividualidInternalmaskEx(request: QueryIndividualidInternalmaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIndividualidInternalmaskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIndividualidInternalmaskResponse>(await this.doRequest("1.0", "baas.plus.individualid.internalmask.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIndividualidInternalmaskResponse({}));
  }

  /**
   * Description: 企业认证四要素
   * Summary: 企业认证四要素（数据来自数据枢纽）
   */
  async queryEnterpriseidInternalfourmeta(request: QueryEnterpriseidInternalfourmetaRequest): Promise<QueryEnterpriseidInternalfourmetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEnterpriseidInternalfourmetaEx(request, headers, runtime);
  }

  /**
   * Description: 企业认证四要素
   * Summary: 企业认证四要素（数据来自数据枢纽）
   */
  async queryEnterpriseidInternalfourmetaEx(request: QueryEnterpriseidInternalfourmetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEnterpriseidInternalfourmetaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEnterpriseidInternalfourmetaResponse>(await this.doRequest("1.0", "baas.plus.enterpriseid.internalfourmeta.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEnterpriseidInternalfourmetaResponse({}));
  }

  /**
   * Description: 企业认证三要素
   * Summary: 企业认证三要素（数据来自数据枢纽）
   */
  async queryEnterpriseidInternalthreemeta(request: QueryEnterpriseidInternalthreemetaRequest): Promise<QueryEnterpriseidInternalthreemetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEnterpriseidInternalthreemetaEx(request, headers, runtime);
  }

  /**
   * Description: 企业认证三要素
   * Summary: 企业认证三要素（数据来自数据枢纽）
   */
  async queryEnterpriseidInternalthreemetaEx(request: QueryEnterpriseidInternalthreemetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEnterpriseidInternalthreemetaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEnterpriseidInternalthreemetaResponse>(await this.doRequest("1.0", "baas.plus.enterpriseid.internalthreemeta.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEnterpriseidInternalthreemetaResponse({}));
  }

  /**
   * Description: 企业认证二要素
   * Summary: 企业认证二要素（数据来自数据枢纽）
   */
  async queryEnterpriseidInternaltwometa(request: QueryEnterpriseidInternaltwometaRequest): Promise<QueryEnterpriseidInternaltwometaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEnterpriseidInternaltwometaEx(request, headers, runtime);
  }

  /**
   * Description: 企业认证二要素
   * Summary: 企业认证二要素（数据来自数据枢纽）
   */
  async queryEnterpriseidInternaltwometaEx(request: QueryEnterpriseidInternaltwometaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEnterpriseidInternaltwometaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEnterpriseidInternaltwometaResponse>(await this.doRequest("1.0", "baas.plus.enterpriseid.internaltwometa.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEnterpriseidInternaltwometaResponse({}));
  }

  /**
   * Description: 企业认证四要素-法人实人认证初始化
   * Summary: 企业认证四要素-法人实人认证初始化
   */
  async initEnterpriseidFaceauth(request: InitEnterpriseidFaceauthRequest): Promise<InitEnterpriseidFaceauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initEnterpriseidFaceauthEx(request, headers, runtime);
  }

  /**
   * Description: 企业认证四要素-法人实人认证初始化
   * Summary: 企业认证四要素-法人实人认证初始化
   */
  async initEnterpriseidFaceauthEx(request: InitEnterpriseidFaceauthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitEnterpriseidFaceauthResponse> {
    Util.validateModel(request);
    return $tea.cast<InitEnterpriseidFaceauthResponse>(await this.doRequest("1.0", "baas.plus.enterpriseid.faceauth.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitEnterpriseidFaceauthResponse({}));
  }

  /**
   * Description: 查询企业认证四要素—法人实人认证结果
   * Summary: 查询企业认证四要素—法人实人认证结果
   */
  async queryEnterpriseidFaceauth(request: QueryEnterpriseidFaceauthRequest): Promise<QueryEnterpriseidFaceauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEnterpriseidFaceauthEx(request, headers, runtime);
  }

  /**
   * Description: 查询企业认证四要素—法人实人认证结果
   * Summary: 查询企业认证四要素—法人实人认证结果
   */
  async queryEnterpriseidFaceauthEx(request: QueryEnterpriseidFaceauthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEnterpriseidFaceauthResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEnterpriseidFaceauthResponse>(await this.doRequest("1.0", "baas.plus.enterpriseid.faceauth.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEnterpriseidFaceauthResponse({}));
  }

  /**
   * Description: 个人实名认证四要素
   * Summary: 个人实名认证四要素（数据来自蚁盾）
   */
  async queryIndividualidInternalfourmeta(request: QueryIndividualidInternalfourmetaRequest): Promise<QueryIndividualidInternalfourmetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIndividualidInternalfourmetaEx(request, headers, runtime);
  }

  /**
   * Description: 个人实名认证四要素
   * Summary: 个人实名认证四要素（数据来自蚁盾）
   */
  async queryIndividualidInternalfourmetaEx(request: QueryIndividualidInternalfourmetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIndividualidInternalfourmetaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIndividualidInternalfourmetaResponse>(await this.doRequest("1.0", "baas.plus.individualid.internalfourmeta.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIndividualidInternalfourmetaResponse({}));
  }

  /**
   * Description: 个人实名认证三要素
   * Summary: 个人实名认证三要素（数据来自蚁盾）
   */
  async queryIndividualidInternalthreemeta(request: QueryIndividualidInternalthreemetaRequest): Promise<QueryIndividualidInternalthreemetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIndividualidInternalthreemetaEx(request, headers, runtime);
  }

  /**
   * Description: 个人实名认证三要素
   * Summary: 个人实名认证三要素（数据来自蚁盾）
   */
  async queryIndividualidInternalthreemetaEx(request: QueryIndividualidInternalthreemetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIndividualidInternalthreemetaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIndividualidInternalthreemetaResponse>(await this.doRequest("1.0", "baas.plus.individualid.internalthreemeta.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIndividualidInternalthreemetaResponse({}));
  }

  /**
   * Description: 个人实名认证二要素
   * Summary: 个人实名认证二要素
   */
  async queryIndividualidInternaltwometa(request: QueryIndividualidInternaltwometaRequest): Promise<QueryIndividualidInternaltwometaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIndividualidInternaltwometaEx(request, headers, runtime);
  }

  /**
   * Description: 个人实名认证二要素
   * Summary: 个人实名认证二要素
   */
  async queryIndividualidInternaltwometaEx(request: QueryIndividualidInternaltwometaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIndividualidInternaltwometaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIndividualidInternaltwometaResponse>(await this.doRequest("1.0", "baas.plus.individualid.internaltwometa.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIndividualidInternaltwometaResponse({}));
  }

  /**
   * Description: 发起内容评估（BAI），仅内部调用
   * Summary: 发起内容评估
   */
  async createBaicorpInternalevaluationasync(request: CreateBaicorpInternalevaluationasyncRequest): Promise<CreateBaicorpInternalevaluationasyncResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBaicorpInternalevaluationasyncEx(request, headers, runtime);
  }

  /**
   * Description: 发起内容评估（BAI），仅内部调用
   * Summary: 发起内容评估
   */
  async createBaicorpInternalevaluationasyncEx(request: CreateBaicorpInternalevaluationasyncRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBaicorpInternalevaluationasyncResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBaicorpInternalevaluationasyncResponse>(await this.doRequest("1.0", "baas.plus.baicorp.internalevaluationasync.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBaicorpInternalevaluationasyncResponse({}));
  }

  /**
   * Description: 提交内容监测任务
   * Summary: 提交内容监测任务接口
   */
  async createBaicorpInternalmonitorasync(request: CreateBaicorpInternalmonitorasyncRequest): Promise<CreateBaicorpInternalmonitorasyncResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBaicorpInternalmonitorasyncEx(request, headers, runtime);
  }

  /**
   * Description: 提交内容监测任务
   * Summary: 提交内容监测任务接口
   */
  async createBaicorpInternalmonitorasyncEx(request: CreateBaicorpInternalmonitorasyncRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBaicorpInternalmonitorasyncResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBaicorpInternalmonitorasyncResponse>(await this.doRequest("1.0", "baas.plus.baicorp.internalmonitorasync.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBaicorpInternalmonitorasyncResponse({}));
  }

  /**
   * Description: 查询内容评估结果
   * Summary: 查询内容评估结果
   */
  async queryBaicorpInternalevaluationasync(request: QueryBaicorpInternalevaluationasyncRequest): Promise<QueryBaicorpInternalevaluationasyncResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBaicorpInternalevaluationasyncEx(request, headers, runtime);
  }

  /**
   * Description: 查询内容评估结果
   * Summary: 查询内容评估结果
   */
  async queryBaicorpInternalevaluationasyncEx(request: QueryBaicorpInternalevaluationasyncRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBaicorpInternalevaluationasyncResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaicorpInternalevaluationasyncResponse>(await this.doRequest("1.0", "baas.plus.baicorp.internalevaluationasync.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBaicorpInternalevaluationasyncResponse({}));
  }

  /**
   * Description: 查询内容监测任务结果
   * Summary: 查询内容监测任务结果
   */
  async queryBaicorpInternalmonitorasync(request: QueryBaicorpInternalmonitorasyncRequest): Promise<QueryBaicorpInternalmonitorasyncResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBaicorpInternalmonitorasyncEx(request, headers, runtime);
  }

  /**
   * Description: 查询内容监测任务结果
   * Summary: 查询内容监测任务结果
   */
  async queryBaicorpInternalmonitorasyncEx(request: QueryBaicorpInternalmonitorasyncRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBaicorpInternalmonitorasyncResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaicorpInternalmonitorasyncResponse>(await this.doRequest("1.0", "baas.plus.baicorp.internalmonitorasync.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBaicorpInternalmonitorasyncResponse({}));
  }

  /**
   * Description: 企业认证四要素-法人实人认证开始
   * Summary: 企业认证四要素-法人实人认证开始
   */
  async certifyEnterpriseidFaceauth(request: CertifyEnterpriseidFaceauthRequest): Promise<CertifyEnterpriseidFaceauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.certifyEnterpriseidFaceauthEx(request, headers, runtime);
  }

  /**
   * Description: 企业认证四要素-法人实人认证开始
   * Summary: 企业认证四要素-法人实人认证开始
   */
  async certifyEnterpriseidFaceauthEx(request: CertifyEnterpriseidFaceauthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CertifyEnterpriseidFaceauthResponse> {
    Util.validateModel(request);
    return $tea.cast<CertifyEnterpriseidFaceauthResponse>(await this.doRequest("1.0", "baas.plus.enterpriseid.faceauth.certify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CertifyEnterpriseidFaceauthResponse({}));
  }

  /**
   * Description: 个人实人刷脸认证——认证初始化
   * Summary: 个人实人刷脸认证-认证初始化
   */
  async initIndividualidFaceauth(request: InitIndividualidFaceauthRequest): Promise<InitIndividualidFaceauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initIndividualidFaceauthEx(request, headers, runtime);
  }

  /**
   * Description: 个人实人刷脸认证——认证初始化
   * Summary: 个人实人刷脸认证-认证初始化
   */
  async initIndividualidFaceauthEx(request: InitIndividualidFaceauthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitIndividualidFaceauthResponse> {
    Util.validateModel(request);
    return $tea.cast<InitIndividualidFaceauthResponse>(await this.doRequest("1.0", "baas.plus.individualid.faceauth.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitIndividualidFaceauthResponse({}));
  }

  /**
   * Description: 个人实人刷脸认证——认证开始
   * Summary: 个人实人刷脸认证-认证开始
   */
  async certifyIndividualidFaceauth(request: CertifyIndividualidFaceauthRequest): Promise<CertifyIndividualidFaceauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.certifyIndividualidFaceauthEx(request, headers, runtime);
  }

  /**
   * Description: 个人实人刷脸认证——认证开始
   * Summary: 个人实人刷脸认证-认证开始
   */
  async certifyIndividualidFaceauthEx(request: CertifyIndividualidFaceauthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CertifyIndividualidFaceauthResponse> {
    Util.validateModel(request);
    return $tea.cast<CertifyIndividualidFaceauthResponse>(await this.doRequest("1.0", "baas.plus.individualid.faceauth.certify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CertifyIndividualidFaceauthResponse({}));
  }

  /**
   * Description: 个人实人刷脸认证——查询认证结果
   * Summary: 个人实人刷脸认证-查询认证结果
   */
  async queryIndividualidFaceauth(request: QueryIndividualidFaceauthRequest): Promise<QueryIndividualidFaceauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIndividualidFaceauthEx(request, headers, runtime);
  }

  /**
   * Description: 个人实人刷脸认证——查询认证结果
   * Summary: 个人实人刷脸认证-查询认证结果
   */
  async queryIndividualidFaceauthEx(request: QueryIndividualidFaceauthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIndividualidFaceauthResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIndividualidFaceauthResponse>(await this.doRequest("1.0", "baas.plus.individualid.faceauth.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIndividualidFaceauthResponse({}));
  }

  /**
   * Description: 获取区块链当前块高
   * Summary: 区块链数据服务-获取区块链当前块高
   */
  async getDataserviceBlockchainheight(request: GetDataserviceBlockchainheightRequest): Promise<GetDataserviceBlockchainheightResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDataserviceBlockchainheightEx(request, headers, runtime);
  }

  /**
   * Description: 获取区块链当前块高
   * Summary: 区块链数据服务-获取区块链当前块高
   */
  async getDataserviceBlockchainheightEx(request: GetDataserviceBlockchainheightRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDataserviceBlockchainheightResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDataserviceBlockchainheightResponse>(await this.doRequest("1.0", "baas.plus.dataservice.blockchainheight.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDataserviceBlockchainheightResponse({}));
  }

  /**
   * Description: 获取链交易总数
   * Summary: 区块链数据服务-获取链交易总数
   */
  async getDataserviceTransactioncount(request: GetDataserviceTransactioncountRequest): Promise<GetDataserviceTransactioncountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDataserviceTransactioncountEx(request, headers, runtime);
  }

  /**
   * Description: 获取链交易总数
   * Summary: 区块链数据服务-获取链交易总数
   */
  async getDataserviceTransactioncountEx(request: GetDataserviceTransactioncountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDataserviceTransactioncountResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDataserviceTransactioncountResponse>(await this.doRequest("1.0", "baas.plus.dataservice.transactioncount.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDataserviceTransactioncountResponse({}));
  }

  /**
   * Description: 根据交易hash获取交易详情
   * Summary: 区块链数据服务-获取交易详情
   */
  async getDataserviceTransactioninfo(request: GetDataserviceTransactioninfoRequest): Promise<GetDataserviceTransactioninfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDataserviceTransactioninfoEx(request, headers, runtime);
  }

  /**
   * Description: 根据交易hash获取交易详情
   * Summary: 区块链数据服务-获取交易详情
   */
  async getDataserviceTransactioninfoEx(request: GetDataserviceTransactioninfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDataserviceTransactioninfoResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDataserviceTransactioninfoResponse>(await this.doRequest("1.0", "baas.plus.dataservice.transactioninfo.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDataserviceTransactioninfoResponse({}));
  }

  /**
   * Description: 获取链最近n条块信息
   * Summary: 区块链数据服务-获取链最近n条块信息
   */
  async listDataserviceLastblocks(request: ListDataserviceLastblocksRequest): Promise<ListDataserviceLastblocksResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listDataserviceLastblocksEx(request, headers, runtime);
  }

  /**
   * Description: 获取链最近n条块信息
   * Summary: 区块链数据服务-获取链最近n条块信息
   */
  async listDataserviceLastblocksEx(request: ListDataserviceLastblocksRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListDataserviceLastblocksResponse> {
    Util.validateModel(request);
    return $tea.cast<ListDataserviceLastblocksResponse>(await this.doRequest("1.0", "baas.plus.dataservice.lastblocks.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListDataserviceLastblocksResponse({}));
  }

  /**
   * Description: 可信时间服务——获取时间凭证
   * Summary: 可信时间凭证服务-获取时间凭证
   */
  async getTasAttestation(request: GetTasAttestationRequest): Promise<GetTasAttestationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTasAttestationEx(request, headers, runtime);
  }

  /**
   * Description: 可信时间服务——获取时间凭证
   * Summary: 可信时间凭证服务-获取时间凭证
   */
  async getTasAttestationEx(request: GetTasAttestationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTasAttestationResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTasAttestationResponse>(await this.doRequest("1.0", "baas.plus.tas.attestation.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTasAttestationResponse({}));
  }

  /**
   * Description: 可信时间 ——校验时间凭证接口
   * Summary: 可信时间凭证服务-校验时间凭证接口
   */
  async verifyTasCtsr(request: VerifyTasCtsrRequest): Promise<VerifyTasCtsrResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyTasCtsrEx(request, headers, runtime);
  }

  /**
   * Description: 可信时间 ——校验时间凭证接口
   * Summary: 可信时间凭证服务-校验时间凭证接口
   */
  async verifyTasCtsrEx(request: VerifyTasCtsrRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyTasCtsrResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyTasCtsrResponse>(await this.doRequest("1.0", "baas.plus.tas.ctsr.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyTasCtsrResponse({}));
  }

  /**
   * Description: 通过sn下载时间凭证证书（pdf格式）
   * Summary: 可信时间凭证服务-下载时间凭证证书
   */
  async getTasCertificate(request: GetTasCertificateRequest): Promise<GetTasCertificateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTasCertificateEx(request, headers, runtime);
  }

  /**
   * Description: 通过sn下载时间凭证证书（pdf格式）
   * Summary: 可信时间凭证服务-下载时间凭证证书
   */
  async getTasCertificateEx(request: GetTasCertificateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTasCertificateResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTasCertificateResponse>(await this.doRequest("1.0", "baas.plus.tas.certificate.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTasCertificateResponse({}));
  }

  /**
   * Description: 可信时间——获取带事务的时间凭证
   * Summary: 可信时间——获取带事务的时间凭证
   */
  async getTasTransactionattestation(request: GetTasTransactionattestationRequest): Promise<GetTasTransactionattestationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTasTransactionattestationEx(request, headers, runtime);
  }

  /**
   * Description: 可信时间——获取带事务的时间凭证
   * Summary: 可信时间——获取带事务的时间凭证
   */
  async getTasTransactionattestationEx(request: GetTasTransactionattestationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTasTransactionattestationResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTasTransactionattestationResponse>(await this.doRequest("1.0", "baas.plus.tas.transactionattestation.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTasTransactionattestationResponse({}));
  }

  /**
   * Description: 企业认证四要素
   * Summary: 企业认证四要素
   */
  async queryEverifyFourmeta(request: QueryEverifyFourmetaRequest): Promise<QueryEverifyFourmetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEverifyFourmetaEx(request, headers, runtime);
  }

  /**
   * Description: 企业认证四要素
   * Summary: 企业认证四要素
   */
  async queryEverifyFourmetaEx(request: QueryEverifyFourmetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEverifyFourmetaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEverifyFourmetaResponse>(await this.doRequest("1.0", "baas.plus.everify.fourmeta.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEverifyFourmetaResponse({}));
  }

  /**
   * Description: 企业认证三要素
   * Summary: 企业认证三要素
   */
  async queryEverifyThreemeta(request: QueryEverifyThreemetaRequest): Promise<QueryEverifyThreemetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEverifyThreemetaEx(request, headers, runtime);
  }

  /**
   * Description: 企业认证三要素
   * Summary: 企业认证三要素
   */
  async queryEverifyThreemetaEx(request: QueryEverifyThreemetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEverifyThreemetaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEverifyThreemetaResponse>(await this.doRequest("1.0", "baas.plus.everify.threemeta.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEverifyThreemetaResponse({}));
  }

  /**
   * Description: 企业认证二要素
   * Summary: 企业认证二要素
   */
  async queryEverifyTwometa(request: QueryEverifyTwometaRequest): Promise<QueryEverifyTwometaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEverifyTwometaEx(request, headers, runtime);
  }

  /**
   * Description: 企业认证二要素
   * Summary: 企业认证二要素
   */
  async queryEverifyTwometaEx(request: QueryEverifyTwometaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEverifyTwometaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEverifyTwometaResponse>(await this.doRequest("1.0", "baas.plus.everify.twometa.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEverifyTwometaResponse({}));
  }

  /**
   * Description: 内容搜索查询接口
   * Summary: 内容搜索查询接口
   */
  async queryBaicorpInternalsearchlibrary(request: QueryBaicorpInternalsearchlibraryRequest): Promise<QueryBaicorpInternalsearchlibraryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBaicorpInternalsearchlibraryEx(request, headers, runtime);
  }

  /**
   * Description: 内容搜索查询接口
   * Summary: 内容搜索查询接口
   */
  async queryBaicorpInternalsearchlibraryEx(request: QueryBaicorpInternalsearchlibraryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBaicorpInternalsearchlibraryResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaicorpInternalsearchlibraryResponse>(await this.doRequest("1.0", "baas.plus.baicorp.internalsearchlibrary.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBaicorpInternalsearchlibraryResponse({}));
  }

  /**
   * Description: 更新检索
   * Summary: 更新检索
   */
  async updateBaicorpInternalsearchlibrary(request: UpdateBaicorpInternalsearchlibraryRequest): Promise<UpdateBaicorpInternalsearchlibraryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateBaicorpInternalsearchlibraryEx(request, headers, runtime);
  }

  /**
   * Description: 更新检索
   * Summary: 更新检索
   */
  async updateBaicorpInternalsearchlibraryEx(request: UpdateBaicorpInternalsearchlibraryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateBaicorpInternalsearchlibraryResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBaicorpInternalsearchlibraryResponse>(await this.doRequest("1.0", "baas.plus.baicorp.internalsearchlibrary.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateBaicorpInternalsearchlibraryResponse({}));
  }

  /**
   * Description: 对公打款-总行查询
   * Summary: 对公打款-总行查询
   */
  async queryEpayauthRootbank(request: QueryEpayauthRootbankRequest): Promise<QueryEpayauthRootbankResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEpayauthRootbankEx(request, headers, runtime);
  }

  /**
   * Description: 对公打款-总行查询
   * Summary: 对公打款-总行查询
   */
  async queryEpayauthRootbankEx(request: QueryEpayauthRootbankRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEpayauthRootbankResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEpayauthRootbankResponse>(await this.doRequest("1.0", "baas.plus.epayauth.rootbank.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEpayauthRootbankResponse({}));
  }

  /**
   * Description: 利用信贷违约数据、多头数据、涉黑数据，刻画基于身份证、手机号、设备等多维度风险特征池、使用机器学习模型自动学习用户背后的风险信息和模式，获得信贷欺诈评分。
   * Summary: 业务申请保护
   */
  async queryYdapplyprotEcapply(request: QueryYdapplyprotEcapplyRequest): Promise<QueryYdapplyprotEcapplyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryYdapplyprotEcapplyEx(request, headers, runtime);
  }

  /**
   * Description: 利用信贷违约数据、多头数据、涉黑数据，刻画基于身份证、手机号、设备等多维度风险特征池、使用机器学习模型自动学习用户背后的风险信息和模式，获得信贷欺诈评分。
   * Summary: 业务申请保护
   */
  async queryYdapplyprotEcapplyEx(request: QueryYdapplyprotEcapplyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryYdapplyprotEcapplyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryYdapplyprotEcapplyResponse>(await this.doRequest("1.0", "baas.plus.ydapplyprot.ecapply.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryYdapplyprotEcapplyResponse({}));
  }

  /**
   * Description: 基于用户行为日志分析，有效识别逃单、恶意退款、无法履约等风险用户，在先享后付、消费金融、网约车先享后付场景有较好的识别效果
   * Summary: 先享后付保护
   */
  async queryYdpacprotEcpac(request: QueryYdpacprotEcpacRequest): Promise<QueryYdpacprotEcpacResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryYdpacprotEcpacEx(request, headers, runtime);
  }

  /**
   * Description: 基于用户行为日志分析，有效识别逃单、恶意退款、无法履约等风险用户，在先享后付、消费金融、网约车先享后付场景有较好的识别效果
   * Summary: 先享后付保护
   */
  async queryYdpacprotEcpacEx(request: QueryYdpacprotEcpacRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryYdpacprotEcpacResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryYdpacprotEcpacResponse>(await this.doRequest("1.0", "baas.plus.ydpacprot.ecpac.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryYdpacprotEcpacResponse({}));
  }

  /**
   * Description: 支持二要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
   * Summary: 身份认证保护
   */
  async queryYdauthprotTwometa(request: QueryYdauthprotTwometaRequest): Promise<QueryYdauthprotTwometaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryYdauthprotTwometaEx(request, headers, runtime);
  }

  /**
   * Description: 支持二要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
   * Summary: 身份认证保护
   */
  async queryYdauthprotTwometaEx(request: QueryYdauthprotTwometaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryYdauthprotTwometaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryYdauthprotTwometaResponse>(await this.doRequest("1.0", "baas.plus.ydauthprot.twometa.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryYdauthprotTwometaResponse({}));
  }

  /**
   * Description: 支持三要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
   * Summary: 身份认证保护
   */
  async queryYdauthprotThreemeta(request: QueryYdauthprotThreemetaRequest): Promise<QueryYdauthprotThreemetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryYdauthprotThreemetaEx(request, headers, runtime);
  }

  /**
   * Description: 支持三要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
   * Summary: 身份认证保护
   */
  async queryYdauthprotThreemetaEx(request: QueryYdauthprotThreemetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryYdauthprotThreemetaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryYdauthprotThreemetaResponse>(await this.doRequest("1.0", "baas.plus.ydauthprot.threemeta.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryYdauthprotThreemetaResponse({}));
  }

  /**
   * Description: 支持四要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
   * Summary: 身份认证保护
   */
  async queryYdauthprotFourmeta(request: QueryYdauthprotFourmetaRequest): Promise<QueryYdauthprotFourmetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryYdauthprotFourmetaEx(request, headers, runtime);
  }

  /**
   * Description: 支持四要素验证，，覆盖账户实名、银行卡绑定、海淘报关等场景，为电商、银行、互金行业提供真实身份验证。
   * Summary: 身份认证保护
   */
  async queryYdauthprotFourmetaEx(request: QueryYdauthprotFourmetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryYdauthprotFourmetaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryYdauthprotFourmetaResponse>(await this.doRequest("1.0", "baas.plus.ydauthprot.fourmeta.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryYdauthprotFourmetaResponse({}));
  }

  /**
   * Description: 营销保护
   * Summary: 营销保护
   */
  async queryYdmktprotEcmarketcampaign(request: QueryYdmktprotEcmarketcampaignRequest): Promise<QueryYdmktprotEcmarketcampaignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryYdmktprotEcmarketcampaignEx(request, headers, runtime);
  }

  /**
   * Description: 营销保护
   * Summary: 营销保护
   */
  async queryYdmktprotEcmarketcampaignEx(request: QueryYdmktprotEcmarketcampaignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryYdmktprotEcmarketcampaignResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryYdmktprotEcmarketcampaignResponse>(await this.doRequest("1.0", "baas.plus.ydmktprot.ecmarketcampaign.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryYdmktprotEcmarketcampaignResponse({}));
  }

  /**
   * Description: 注册保护
   * Summary: 注册保护
   */
  async queryYdregprotEcregister(request: QueryYdregprotEcregisterRequest): Promise<QueryYdregprotEcregisterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryYdregprotEcregisterEx(request, headers, runtime);
  }

  /**
   * Description: 注册保护
   * Summary: 注册保护
   */
  async queryYdregprotEcregisterEx(request: QueryYdregprotEcregisterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryYdregprotEcregisterResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryYdregprotEcregisterResponse>(await this.doRequest("1.0", "baas.plus.ydregprot.ecregister.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryYdregprotEcregisterResponse({}));
  }

  /**
   * Description: 用户需要选择支行时，业务平台调用此接口查询列表，供用户选择。
   * Summary: 支行查询
   */
  async queryEpayauthBranchbank(request: QueryEpayauthBranchbankRequest): Promise<QueryEpayauthBranchbankResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEpayauthBranchbankEx(request, headers, runtime);
  }

  /**
   * Description: 用户需要选择支行时，业务平台调用此接口查询列表，供用户选择。
   * Summary: 支行查询
   */
  async queryEpayauthBranchbankEx(request: QueryEpayauthBranchbankRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEpayauthBranchbankResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEpayauthBranchbankResponse>(await this.doRequest("1.0", "baas.plus.epayauth.branchbank.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEpayauthBranchbankResponse({}));
  }

  /**
   * Description: 用户需要选择省市时，业务平台调用此接口查询列表，供用户选择。
   * Summary: 行政地区编码查询
   */
  async queryEpayauthDistrict(request: QueryEpayauthDistrictRequest): Promise<QueryEpayauthDistrictResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEpayauthDistrictEx(request, headers, runtime);
  }

  /**
   * Description: 用户需要选择省市时，业务平台调用此接口查询列表，供用户选择。
   * Summary: 行政地区编码查询
   */
  async queryEpayauthDistrictEx(request: QueryEpayauthDistrictRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEpayauthDistrictResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEpayauthDistrictResponse>(await this.doRequest("1.0", "baas.plus.epayauth.district.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEpayauthDistrictResponse({}));
  }

  /**
   * Description: 用户输入银行卡相关信息后，业务平台调用此接口申请打款验证，网商端收到请求后依预设规则向指定银行卡打款，金额随机。
   * Summary: 发起打款验证申请
   */
  async initEpayauthVerify(request: InitEpayauthVerifyRequest): Promise<InitEpayauthVerifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initEpayauthVerifyEx(request, headers, runtime);
  }

  /**
   * Description: 用户输入银行卡相关信息后，业务平台调用此接口申请打款验证，网商端收到请求后依预设规则向指定银行卡打款，金额随机。
   * Summary: 发起打款验证申请
   */
  async initEpayauthVerifyEx(request: InitEpayauthVerifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitEpayauthVerifyResponse> {
    Util.validateModel(request);
    return $tea.cast<InitEpayauthVerifyResponse>(await this.doRequest("1.0", "baas.plus.epayauth.verify.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitEpayauthVerifyResponse({}));
  }

  /**
   * Description: 用户输入收到的打款金额后，业务平台调用此接口进行金额校验。
   * Summary: 打款验证金额校验
   */
  async queryEpayauthVerify(request: QueryEpayauthVerifyRequest): Promise<QueryEpayauthVerifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEpayauthVerifyEx(request, headers, runtime);
  }

  /**
   * Description: 用户输入收到的打款金额后，业务平台调用此接口进行金额校验。
   * Summary: 打款验证金额校验
   */
  async queryEpayauthVerifyEx(request: QueryEpayauthVerifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEpayauthVerifyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEpayauthVerifyResponse>(await this.doRequest("1.0", "baas.plus.epayauth.verify.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEpayauthVerifyResponse({}));
  }

  /**
   * Description: 依据入参，生成链上交易二维码，可通过支付宝端扫码查看交易详情
   * Summary: 链上交易二维码生成
   */
  async queryBmpbrowserTransactionqrcode(request: QueryBmpbrowserTransactionqrcodeRequest): Promise<QueryBmpbrowserTransactionqrcodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBmpbrowserTransactionqrcodeEx(request, headers, runtime);
  }

  /**
   * Description: 依据入参，生成链上交易二维码，可通过支付宝端扫码查看交易详情
   * Summary: 链上交易二维码生成
   */
  async queryBmpbrowserTransactionqrcodeEx(request: QueryBmpbrowserTransactionqrcodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBmpbrowserTransactionqrcodeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBmpbrowserTransactionqrcodeResponse>(await this.doRequest("1.0", "baas.plus.bmpbrowser.transactionqrcode.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBmpbrowserTransactionqrcodeResponse({}));
  }

  /**
   * Description: 依据入参手机号，开通对应支付宝账号查看链上交易的权限
   * Summary: 批量开通 链上交易移动端查看权限
   */
  async addBmpbrowserPrivilege(request: AddBmpbrowserPrivilegeRequest): Promise<AddBmpbrowserPrivilegeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addBmpbrowserPrivilegeEx(request, headers, runtime);
  }

  /**
   * Description: 依据入参手机号，开通对应支付宝账号查看链上交易的权限
   * Summary: 批量开通 链上交易移动端查看权限
   */
  async addBmpbrowserPrivilegeEx(request: AddBmpbrowserPrivilegeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddBmpbrowserPrivilegeResponse> {
    Util.validateModel(request);
    return $tea.cast<AddBmpbrowserPrivilegeResponse>(await this.doRequest("1.0", "baas.plus.bmpbrowser.privilege.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddBmpbrowserPrivilegeResponse({}));
  }

  /**
   * Description: 身份证信息识别
   * Summary: 身份证信息识别
   */
  async queryIdcocrIdcard(request: QueryIdcocrIdcardRequest): Promise<QueryIdcocrIdcardResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIdcocrIdcardEx(request, headers, runtime);
  }

  /**
   * Description: 身份证信息识别
   * Summary: 身份证信息识别
   */
  async queryIdcocrIdcardEx(request: QueryIdcocrIdcardRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIdcocrIdcardResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIdcocrIdcardResponse>(await this.doRequest("1.0", "baas.plus.idcocr.idcard.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIdcocrIdcardResponse({}));
  }

  /**
   * Description: 申请证书
   * Summary: 申请证书
   */
  async initCaCertificate(request: InitCaCertificateRequest): Promise<InitCaCertificateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initCaCertificateEx(request, headers, runtime);
  }

  /**
   * Description: 申请证书
   * Summary: 申请证书
   */
  async initCaCertificateEx(request: InitCaCertificateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitCaCertificateResponse> {
    Util.validateModel(request);
    return $tea.cast<InitCaCertificateResponse>(await this.doRequest("1.0", "baas.plus.ca.certificate.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitCaCertificateResponse({}));
  }

  /**
   * Description: 内容风险识别接口服务可提供针对垃圾广告、（钓鱼、广告）链接、暴恐政、黄赌毒等内容的风险识别服务。
   * Summary: 内容风险识别接口服务
   */
  async initContentriskInternal(request: InitContentriskInternalRequest): Promise<InitContentriskInternalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initContentriskInternalEx(request, headers, runtime);
  }

  /**
   * Description: 内容风险识别接口服务可提供针对垃圾广告、（钓鱼、广告）链接、暴恐政、黄赌毒等内容的风险识别服务。
   * Summary: 内容风险识别接口服务
   */
  async initContentriskInternalEx(request: InitContentriskInternalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitContentriskInternalResponse> {
    Util.validateModel(request);
    return $tea.cast<InitContentriskInternalResponse>(await this.doRequest("1.0", "baas.plus.contentrisk.internal.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitContentriskInternalResponse({}));
  }

  /**
   * Description: 配合内容风险识别接口服务，进行图片、视频等针对暴恐政、黄赌毒等内容的异步识别结果查询接口。
   * Summary: 内容风险识别结果查询接口服务
   */
  async queryContentriskInternal(request: QueryContentriskInternalRequest): Promise<QueryContentriskInternalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContentriskInternalEx(request, headers, runtime);
  }

  /**
   * Description: 配合内容风险识别接口服务，进行图片、视频等针对暴恐政、黄赌毒等内容的异步识别结果查询接口。
   * Summary: 内容风险识别结果查询接口服务
   */
  async queryContentriskInternalEx(request: QueryContentriskInternalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContentriskInternalResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContentriskInternalResponse>(await this.doRequest("1.0", "baas.plus.contentrisk.internal.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContentriskInternalResponse({}));
  }

  /**
   * Description: 个人实人认证服务端比对-认证开始
   * Summary: 个人实人认证服务端比对-认证开始
   */
  async initIndividualidImageauth(request: InitIndividualidImageauthRequest): Promise<InitIndividualidImageauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initIndividualidImageauthEx(request, headers, runtime);
  }

  /**
   * Description: 个人实人认证服务端比对-认证开始
   * Summary: 个人实人认证服务端比对-认证开始
   */
  async initIndividualidImageauthEx(request: InitIndividualidImageauthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitIndividualidImageauthResponse> {
    Util.validateModel(request);
    return $tea.cast<InitIndividualidImageauthResponse>(await this.doRequest("1.0", "baas.plus.individualid.imageauth.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitIndividualidImageauthResponse({}));
  }

  /**
   * Description: 访问账户生成
   * Summary: 访问账户生成
   */
  async addIotcseAccount(request: AddIotcseAccountRequest): Promise<AddIotcseAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addIotcseAccountEx(request, headers, runtime);
  }

  /**
   * Description: 访问账户生成
   * Summary: 访问账户生成
   */
  async addIotcseAccountEx(request: AddIotcseAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddIotcseAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<AddIotcseAccountResponse>(await this.doRequest("1.0", "baas.plus.iotcse.account.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddIotcseAccountResponse({}));
  }

  /**
   * Description: 存证上链
   * Summary: 存证上链
   */
  async saveIotcseEvidence(request: SaveIotcseEvidenceRequest): Promise<SaveIotcseEvidenceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveIotcseEvidenceEx(request, headers, runtime);
  }

  /**
   * Description: 存证上链
   * Summary: 存证上链
   */
  async saveIotcseEvidenceEx(request: SaveIotcseEvidenceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveIotcseEvidenceResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveIotcseEvidenceResponse>(await this.doRequest("1.0", "baas.plus.iotcse.evidence.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveIotcseEvidenceResponse({}));
  }

  /**
   * Description: 存证上链查询
   * Summary: 存证上链查询
   */
  async queryIotcseEvidence(request: QueryIotcseEvidenceRequest): Promise<QueryIotcseEvidenceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIotcseEvidenceEx(request, headers, runtime);
  }

  /**
   * Description: 存证上链查询
   * Summary: 存证上链查询
   */
  async queryIotcseEvidenceEx(request: QueryIotcseEvidenceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIotcseEvidenceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIotcseEvidenceResponse>(await this.doRequest("1.0", "baas.plus.iotcse.evidence.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIotcseEvidenceResponse({}));
  }

  /**
   * Description: 代理创建企业did
   * Summary: 代理创建企业did
   */
  async createDidCorporatedidagent(request: CreateDidCorporatedidagentRequest): Promise<CreateDidCorporatedidagentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDidCorporatedidagentEx(request, headers, runtime);
  }

  /**
   * Description: 代理创建企业did
   * Summary: 代理创建企业did
   */
  async createDidCorporatedidagentEx(request: CreateDidCorporatedidagentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDidCorporatedidagentResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDidCorporatedidagentResponse>(await this.doRequest("1.0", "baas.plus.did.corporatedidagent.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDidCorporatedidagentResponse({}));
  }

  /**
   * Description: 个人实人刷脸认证-认证初始化
   * Summary: 个人实人刷脸认证-认证初始化
   */
  async initIndividualidFaceauthinternal(request: InitIndividualidFaceauthinternalRequest): Promise<InitIndividualidFaceauthinternalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initIndividualidFaceauthinternalEx(request, headers, runtime);
  }

  /**
   * Description: 个人实人刷脸认证-认证初始化
   * Summary: 个人实人刷脸认证-认证初始化
   */
  async initIndividualidFaceauthinternalEx(request: InitIndividualidFaceauthinternalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitIndividualidFaceauthinternalResponse> {
    Util.validateModel(request);
    return $tea.cast<InitIndividualidFaceauthinternalResponse>(await this.doRequest("1.0", "baas.plus.individualid.faceauthinternal.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitIndividualidFaceauthinternalResponse({}));
  }

  /**
   * Description: 个人实人刷脸认证-认证开始
   * Summary: 个人实人刷脸认证-认证开始
   */
  async certifyIndividualidFaceauthinternal(request: CertifyIndividualidFaceauthinternalRequest): Promise<CertifyIndividualidFaceauthinternalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.certifyIndividualidFaceauthinternalEx(request, headers, runtime);
  }

  /**
   * Description: 个人实人刷脸认证-认证开始
   * Summary: 个人实人刷脸认证-认证开始
   */
  async certifyIndividualidFaceauthinternalEx(request: CertifyIndividualidFaceauthinternalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CertifyIndividualidFaceauthinternalResponse> {
    Util.validateModel(request);
    return $tea.cast<CertifyIndividualidFaceauthinternalResponse>(await this.doRequest("1.0", "baas.plus.individualid.faceauthinternal.certify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CertifyIndividualidFaceauthinternalResponse({}));
  }

  /**
   * Description: 个人实人刷脸认证-查询认证结果
   * Summary: 个人实人刷脸认证-查询认证结果
   */
  async queryIndividualidFaceauthinternal(request: QueryIndividualidFaceauthinternalRequest): Promise<QueryIndividualidFaceauthinternalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIndividualidFaceauthinternalEx(request, headers, runtime);
  }

  /**
   * Description: 个人实人刷脸认证-查询认证结果
   * Summary: 个人实人刷脸认证-查询认证结果
   */
  async queryIndividualidFaceauthinternalEx(request: QueryIndividualidFaceauthinternalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIndividualidFaceauthinternalResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIndividualidFaceauthinternalResponse>(await this.doRequest("1.0", "baas.plus.individualid.faceauthinternal.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIndividualidFaceauthinternalResponse({}));
  }

  /**
   * Description: 企业认证四要素-法人实人认证初始化
   * Summary: 企业认证四要素-法人实人认证初始化
   */
  async initEnterpriseidFaceauthinternal(request: InitEnterpriseidFaceauthinternalRequest): Promise<InitEnterpriseidFaceauthinternalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initEnterpriseidFaceauthinternalEx(request, headers, runtime);
  }

  /**
   * Description: 企业认证四要素-法人实人认证初始化
   * Summary: 企业认证四要素-法人实人认证初始化
   */
  async initEnterpriseidFaceauthinternalEx(request: InitEnterpriseidFaceauthinternalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitEnterpriseidFaceauthinternalResponse> {
    Util.validateModel(request);
    return $tea.cast<InitEnterpriseidFaceauthinternalResponse>(await this.doRequest("1.0", "baas.plus.enterpriseid.faceauthinternal.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitEnterpriseidFaceauthinternalResponse({}));
  }

  /**
   * Description: 企业认证四要素-法人实人认证开始
   * Summary: 企业认证四要素-法人实人认证开始
   */
  async certifyEnterpriseidFaceauthinternal(request: CertifyEnterpriseidFaceauthinternalRequest): Promise<CertifyEnterpriseidFaceauthinternalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.certifyEnterpriseidFaceauthinternalEx(request, headers, runtime);
  }

  /**
   * Description: 企业认证四要素-法人实人认证开始
   * Summary: 企业认证四要素-法人实人认证开始
   */
  async certifyEnterpriseidFaceauthinternalEx(request: CertifyEnterpriseidFaceauthinternalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CertifyEnterpriseidFaceauthinternalResponse> {
    Util.validateModel(request);
    return $tea.cast<CertifyEnterpriseidFaceauthinternalResponse>(await this.doRequest("1.0", "baas.plus.enterpriseid.faceauthinternal.certify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CertifyEnterpriseidFaceauthinternalResponse({}));
  }

  /**
   * Description: 企业认证二要素
   * Summary: 企业认证二要素
   */
  async queryEverifyTwometainternal(request: QueryEverifyTwometainternalRequest): Promise<QueryEverifyTwometainternalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEverifyTwometainternalEx(request, headers, runtime);
  }

  /**
   * Description: 企业认证二要素
   * Summary: 企业认证二要素
   */
  async queryEverifyTwometainternalEx(request: QueryEverifyTwometainternalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEverifyTwometainternalResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEverifyTwometainternalResponse>(await this.doRequest("1.0", "baas.plus.everify.twometainternal.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEverifyTwometainternalResponse({}));
  }

  /**
   * Description: 企业认证三要素
   * Summary: 企业认证三要素
   */
  async queryEverifyThreemetainternal(request: QueryEverifyThreemetainternalRequest): Promise<QueryEverifyThreemetainternalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEverifyThreemetainternalEx(request, headers, runtime);
  }

  /**
   * Description: 企业认证三要素
   * Summary: 企业认证三要素
   */
  async queryEverifyThreemetainternalEx(request: QueryEverifyThreemetainternalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEverifyThreemetainternalResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEverifyThreemetainternalResponse>(await this.doRequest("1.0", "baas.plus.everify.threemetainternal.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEverifyThreemetainternalResponse({}));
  }

  /**
   * Description: 企业认证四要素
   * Summary: 企业认证四要素
   */
  async queryEverifyFourmetainternal(request: QueryEverifyFourmetainternalRequest): Promise<QueryEverifyFourmetainternalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEverifyFourmetainternalEx(request, headers, runtime);
  }

  /**
   * Description: 企业认证四要素
   * Summary: 企业认证四要素
   */
  async queryEverifyFourmetainternalEx(request: QueryEverifyFourmetainternalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEverifyFourmetainternalResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEverifyFourmetainternalResponse>(await this.doRequest("1.0", "baas.plus.everify.fourmetainternal.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEverifyFourmetainternalResponse({}));
  }

  /**
   * Description: 查询企业认证四要素—法人实人认证结果
   * Summary: 查询企业认证四要素—法人实人认证结果
   */
  async queryEnterpriseidFaceauthinternal(request: QueryEnterpriseidFaceauthinternalRequest): Promise<QueryEnterpriseidFaceauthinternalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEnterpriseidFaceauthinternalEx(request, headers, runtime);
  }

  /**
   * Description: 查询企业认证四要素—法人实人认证结果
   * Summary: 查询企业认证四要素—法人实人认证结果
   */
  async queryEnterpriseidFaceauthinternalEx(request: QueryEnterpriseidFaceauthinternalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEnterpriseidFaceauthinternalResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEnterpriseidFaceauthinternalResponse>(await this.doRequest("1.0", "baas.plus.enterpriseid.faceauthinternal.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEnterpriseidFaceauthinternalResponse({}));
  }

  /**
   * Description: 物联网区块链身份注册
   * Summary: 物联网区块链身份注册
   */
  async addIotcseThingsdid(request: AddIotcseThingsdidRequest): Promise<AddIotcseThingsdidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addIotcseThingsdidEx(request, headers, runtime);
  }

  /**
   * Description: 物联网区块链身份注册
   * Summary: 物联网区块链身份注册
   */
  async addIotcseThingsdidEx(request: AddIotcseThingsdidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddIotcseThingsdidResponse> {
    Util.validateModel(request);
    return $tea.cast<AddIotcseThingsdidResponse>(await this.doRequest("1.0", "baas.plus.iotcse.thingsdid.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddIotcseThingsdidResponse({}));
  }

  /**
   * Description: 物联网区块链身份更新
   * Summary: 物联网区块链身份更新
   */
  async updateIotcseThingsdid(request: UpdateIotcseThingsdidRequest): Promise<UpdateIotcseThingsdidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateIotcseThingsdidEx(request, headers, runtime);
  }

  /**
   * Description: 物联网区块链身份更新
   * Summary: 物联网区块链身份更新
   */
  async updateIotcseThingsdidEx(request: UpdateIotcseThingsdidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateIotcseThingsdidResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateIotcseThingsdidResponse>(await this.doRequest("1.0", "baas.plus.iotcse.thingsdid.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateIotcseThingsdidResponse({}));
  }

  /**
   * Description: 物联网区块链身份查询
   * Summary: 物联网区块链身份查询
   */
  async queryIotcseThingsdid(request: QueryIotcseThingsdidRequest): Promise<QueryIotcseThingsdidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIotcseThingsdidEx(request, headers, runtime);
  }

  /**
   * Description: 物联网区块链身份查询
   * Summary: 物联网区块链身份查询
   */
  async queryIotcseThingsdidEx(request: QueryIotcseThingsdidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIotcseThingsdidResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIotcseThingsdidResponse>(await this.doRequest("1.0", "baas.plus.iotcse.thingsdid.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIotcseThingsdidResponse({}));
  }

  /**
   * Description: 异步轮询请求
  智能合约执行完后异步轮询
   * Summary: 异步轮询请求
   */
  async queryIotcseAsyncprocess(request: QueryIotcseAsyncprocessRequest): Promise<QueryIotcseAsyncprocessResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIotcseAsyncprocessEx(request, headers, runtime);
  }

  /**
   * Description: 异步轮询请求
  智能合约执行完后异步轮询
   * Summary: 异步轮询请求
   */
  async queryIotcseAsyncprocessEx(request: QueryIotcseAsyncprocessRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIotcseAsyncprocessResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIotcseAsyncprocessResponse>(await this.doRequest("1.0", "baas.plus.iotcse.asyncprocess.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIotcseAsyncprocessResponse({}));
  }

  /**
   * Description: 物联网区块链身份分组
   * Summary: 物联网区块链身份分组
   */
  async execIotcseGroup(request: ExecIotcseGroupRequest): Promise<ExecIotcseGroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execIotcseGroupEx(request, headers, runtime);
  }

  /**
   * Description: 物联网区块链身份分组
   * Summary: 物联网区块链身份分组
   */
  async execIotcseGroupEx(request: ExecIotcseGroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecIotcseGroupResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecIotcseGroupResponse>(await this.doRequest("1.0", "baas.plus.iotcse.group.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecIotcseGroupResponse({}));
  }

  /**
   * Description: 物联网区块链分组设备查询
   * Summary: 物联网区块链分组设备查询
   */
  async queryIotcseGroupdevice(request: QueryIotcseGroupdeviceRequest): Promise<QueryIotcseGroupdeviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIotcseGroupdeviceEx(request, headers, runtime);
  }

  /**
   * Description: 物联网区块链分组设备查询
   * Summary: 物联网区块链分组设备查询
   */
  async queryIotcseGroupdeviceEx(request: QueryIotcseGroupdeviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIotcseGroupdeviceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIotcseGroupdeviceResponse>(await this.doRequest("1.0", "baas.plus.iotcse.groupdevice.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIotcseGroupdeviceResponse({}));
  }

  /**
   * Description: 物联网区块链身份设备分组查询
   * Summary: 物联网区块链身份设备分组查询
   */
  async queryIotcseDevicegroup(request: QueryIotcseDevicegroupRequest): Promise<QueryIotcseDevicegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIotcseDevicegroupEx(request, headers, runtime);
  }

  /**
   * Description: 物联网区块链身份设备分组查询
   * Summary: 物联网区块链身份设备分组查询
   */
  async queryIotcseDevicegroupEx(request: QueryIotcseDevicegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIotcseDevicegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIotcseDevicegroupResponse>(await this.doRequest("1.0", "baas.plus.iotcse.devicegroup.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIotcseDevicegroupResponse({}));
  }

  /**
   * Description: 物联网区块链身份租户设备查询
   * Summary: 物联网区块链身份租户设备查询
   */
  async queryIotcseTenantdevice(request: QueryIotcseTenantdeviceRequest): Promise<QueryIotcseTenantdeviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIotcseTenantdeviceEx(request, headers, runtime);
  }

  /**
   * Description: 物联网区块链身份租户设备查询
   * Summary: 物联网区块链身份租户设备查询
   */
  async queryIotcseTenantdeviceEx(request: QueryIotcseTenantdeviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIotcseTenantdeviceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIotcseTenantdeviceResponse>(await this.doRequest("1.0", "baas.plus.iotcse.tenantdevice.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIotcseTenantdeviceResponse({}));
  }

  /**
   * Description: 物联网区块链身份设备状态更新
   * Summary: 物联网区块链身份设备状态更新
   */
  async updateIotcseDevicestatus(request: UpdateIotcseDevicestatusRequest): Promise<UpdateIotcseDevicestatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateIotcseDevicestatusEx(request, headers, runtime);
  }

  /**
   * Description: 物联网区块链身份设备状态更新
   * Summary: 物联网区块链身份设备状态更新
   */
  async updateIotcseDevicestatusEx(request: UpdateIotcseDevicestatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateIotcseDevicestatusResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateIotcseDevicestatusResponse>(await this.doRequest("1.0", "baas.plus.iotcse.devicestatus.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateIotcseDevicestatusResponse({}));
  }

  /**
   * Description: 物联网区块链身份设备物模型查询
   * Summary: 物联网区块链身份设备物模型查询
   */
  async queryIotcseDevicemodel(request: QueryIotcseDevicemodelRequest): Promise<QueryIotcseDevicemodelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIotcseDevicemodelEx(request, headers, runtime);
  }

  /**
   * Description: 物联网区块链身份设备物模型查询
   * Summary: 物联网区块链身份设备物模型查询
   */
  async queryIotcseDevicemodelEx(request: QueryIotcseDevicemodelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIotcseDevicemodelResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIotcseDevicemodelResponse>(await this.doRequest("1.0", "baas.plus.iotcse.devicemodel.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIotcseDevicemodelResponse({}));
  }

  /**
   * Description: 物联网区块链身份设备空间关联
   * Summary: 物联网区块链身份设备空间关联
   */
  async updateIotcseDevicespace(request: UpdateIotcseDevicespaceRequest): Promise<UpdateIotcseDevicespaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateIotcseDevicespaceEx(request, headers, runtime);
  }

  /**
   * Description: 物联网区块链身份设备空间关联
   * Summary: 物联网区块链身份设备空间关联
   */
  async updateIotcseDevicespaceEx(request: UpdateIotcseDevicespaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateIotcseDevicespaceResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateIotcseDevicespaceResponse>(await this.doRequest("1.0", "baas.plus.iotcse.devicespace.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateIotcseDevicespaceResponse({}));
  }

  /**
   * Description: 物联网区块链身份批量存证数据读取
   * Summary: 物联网区块链身份批量存证数据读取
   */
  async queryIotcseEvidencebatch(request: QueryIotcseEvidencebatchRequest): Promise<QueryIotcseEvidencebatchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIotcseEvidencebatchEx(request, headers, runtime);
  }

  /**
   * Description: 物联网区块链身份批量存证数据读取
   * Summary: 物联网区块链身份批量存证数据读取
   */
  async queryIotcseEvidencebatchEx(request: QueryIotcseEvidencebatchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIotcseEvidencebatchResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIotcseEvidencebatchResponse>(await this.doRequest("1.0", "baas.plus.iotcse.evidencebatch.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIotcseEvidencebatchResponse({}));
  }

  /**
   * Description: AI认知服务营业执照ocr服务
   * Summary: AI认知服务营业执照ocr服务
   */
  async queryBlocrBusinesslicense(request: QueryBlocrBusinesslicenseRequest): Promise<QueryBlocrBusinesslicenseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBlocrBusinesslicenseEx(request, headers, runtime);
  }

  /**
   * Description: AI认知服务营业执照ocr服务
   * Summary: AI认知服务营业执照ocr服务
   */
  async queryBlocrBusinesslicenseEx(request: QueryBlocrBusinesslicenseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBlocrBusinesslicenseResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBlocrBusinesslicenseResponse>(await this.doRequest("1.0", "baas.plus.blocr.businesslicense.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBlocrBusinesslicenseResponse({}));
  }

  /**
   * Description: AI认知服务增值税发票ocr识别
   * Summary: AI认知服务增值税发票ocr识别
   */
  async queryInvoicesocrVatinvoice(request: QueryInvoicesocrVatinvoiceRequest): Promise<QueryInvoicesocrVatinvoiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInvoicesocrVatinvoiceEx(request, headers, runtime);
  }

  /**
   * Description: AI认知服务增值税发票ocr识别
   * Summary: AI认知服务增值税发票ocr识别
   */
  async queryInvoicesocrVatinvoiceEx(request: QueryInvoicesocrVatinvoiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInvoicesocrVatinvoiceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInvoicesocrVatinvoiceResponse>(await this.doRequest("1.0", "baas.plus.invoicesocr.vatinvoice.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInvoicesocrVatinvoiceResponse({}));
  }

  /**
   * Description: 查询用户链上交易移动端查看权限
   * Summary: 查询用户链上交易移动端查看权限
   */
  async queryBmpbrowserPrivilege(request: QueryBmpbrowserPrivilegeRequest): Promise<QueryBmpbrowserPrivilegeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBmpbrowserPrivilegeEx(request, headers, runtime);
  }

  /**
   * Description: 查询用户链上交易移动端查看权限
   * Summary: 查询用户链上交易移动端查看权限
   */
  async queryBmpbrowserPrivilegeEx(request: QueryBmpbrowserPrivilegeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBmpbrowserPrivilegeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBmpbrowserPrivilegeResponse>(await this.doRequest("1.0", "baas.plus.bmpbrowser.privilege.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBmpbrowserPrivilegeResponse({}));
  }

  /**
   * Description: 批量取消 链上交易移动端查看权限
   * Summary: 批量取消 链上交易移动端查看权限
   */
  async cancelBmpbrowserPrivilege(request: CancelBmpbrowserPrivilegeRequest): Promise<CancelBmpbrowserPrivilegeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelBmpbrowserPrivilegeEx(request, headers, runtime);
  }

  /**
   * Description: 批量取消 链上交易移动端查看权限
   * Summary: 批量取消 链上交易移动端查看权限
   */
  async cancelBmpbrowserPrivilegeEx(request: CancelBmpbrowserPrivilegeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelBmpbrowserPrivilegeResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelBmpbrowserPrivilegeResponse>(await this.doRequest("1.0", "baas.plus.bmpbrowser.privilege.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelBmpbrowserPrivilegeResponse({}));
  }

}
