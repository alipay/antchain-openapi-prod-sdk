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

// 键值对，兼容map用
export class NameValuePair extends $tea.Model {
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

// 授权列表键值对
export class AuthorizeRecordsPairs extends $tea.Model {
  // 授权业务
  authBusinessCode: string;
  // 授权密钥
  authBusinessSecret: string;
  static names(): { [key: string]: string } {
    return {
      authBusinessCode: 'auth_business_code',
      authBusinessSecret: 'auth_business_secret',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authBusinessCode: 'string',
      authBusinessSecret: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 核身产品
export class GwValidateProduct extends $tea.Model {
  // 核审产品码，支持多种核身产品。
  // ZK_FACE_VERIFY：人脸识别
  productCode: string;
  // 产品渲染方式：H5、NATIVE 或 PC
  group: string;
  // 核身产品参数，因网关限制，暂只支持Map<String,String>
  productParams?: NameValuePair[];
  static names(): { [key: string]: string } {
    return {
      productCode: 'product_code',
      group: 'group',
      productParams: 'product_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      productCode: 'string',
      group: 'string',
      productParams: { 'type': 'array', 'itemType': NameValuePair },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 规则明细
export class RuleDetail extends $tea.Model {
  // 项目类别
  type: string;
  // 领域
  fieId: string;
  // 级别
  level: string;
  // 资质
  qualifications: string;
  // 保定报价
  priceBd: number;
  // 离岸价格
  fobPrice: number;
  // 离岸价格
  priceTj: number;
  // 北京报价
  priceBj: number;
  // 最少提供人数
  numpeople: number;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      fieId: 'fie_id',
      level: 'level',
      qualifications: 'qualifications',
      priceBd: 'price_bd',
      fobPrice: 'fob_price',
      priceTj: 'price_tj',
      priceBj: 'price_bj',
      numpeople: 'numpeople',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      fieId: 'string',
      level: 'string',
      qualifications: 'string',
      priceBd: 'number',
      fobPrice: 'number',
      priceTj: 'number',
      priceBj: 'number',
      numpeople: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 对账单
export class Reconciliation extends $tea.Model {
  // 供应商
  supCode: string;
  // 供应商名称
  supName: string;
  // 结算金额(单位分)
  settlementAmount: number;
  // 长城确认时间
  confirmDateGw: string;
  // 长城方确认人
  confirmerGw: string;
  // 长城确认状态
  confirmStateGw: string;
  // 服务方确认时间
  confirmDateSup: string;
  // 服务方确认人
  confirmerSup: string;
  // 服务方确认状态
  confirmStateSup: string;
  // 计算时间
  socreDate: string;
  static names(): { [key: string]: string } {
    return {
      supCode: 'sup_code',
      supName: 'sup_name',
      settlementAmount: 'settlement_amount',
      confirmDateGw: 'confirm_date_gw',
      confirmerGw: 'confirmer_gw',
      confirmStateGw: 'confirm_state_gw',
      confirmDateSup: 'confirm_date_sup',
      confirmerSup: 'confirmer_sup',
      confirmStateSup: 'confirm_state_sup',
      socreDate: 'socre_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      supCode: 'string',
      supName: 'string',
      settlementAmount: 'number',
      confirmDateGw: 'string',
      confirmerGw: 'string',
      confirmStateGw: 'string',
      confirmDateSup: 'string',
      confirmerSup: 'string',
      confirmStateSup: 'string',
      socreDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 客户认证结果
export class CustomerAuthResult extends $tea.Model {
  // 账户ID
  accId?: string;
  // 返回code 0:核验成功 1:企业信息有误 2:企业非正常营业
  code: string;
  // 客户ID
  customerId?: string;
  // 客户did
  did?: string;
  // 验证状态
  enterpriseStatus?: string;
  // 开业时间
  openTime: string;
  // 认证结果，是否通过
  pass: boolean;
  // 业务ID
  disReqMsgId?: string;
  static names(): { [key: string]: string } {
    return {
      accId: 'acc_id',
      code: 'code',
      customerId: 'customer_id',
      did: 'did',
      enterpriseStatus: 'enterprise_status',
      openTime: 'open_time',
      pass: 'pass',
      disReqMsgId: 'dis_req_msg_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accId: 'string',
      code: 'string',
      customerId: 'string',
      did: 'string',
      enterpriseStatus: 'string',
      openTime: 'string',
      pass: 'boolean',
      disReqMsgId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 业务授权列表键值对
export class BusinessRecordsPairs extends $tea.Model {
  // 业务编码
  businessCode: string;
  // 业务公钥
  publicKey: string;
  static names(): { [key: string]: string } {
    return {
      businessCode: 'business_code',
      publicKey: 'public_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      businessCode: 'string',
      publicKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 供应商
export class SpProvider extends $tea.Model {
  // 供应商编号
  supCode: string;
  // 供应商名称
  supName: string;
  // 文件名称
  fileName: string;
  // 文件code
  fileCode: string;
  // hash的值
  hashCode: string;
  // 开始时间
  startDate: string;
  // 结束日期
  closingDate: string;
  // 文件路径
  filePath: string;
  // 2021-03-04 11:16:23
  createDate: string;
  // 创建者
  creator: string;
  static names(): { [key: string]: string } {
    return {
      supCode: 'sup_code',
      supName: 'sup_name',
      fileName: 'file_name',
      fileCode: 'file_code',
      hashCode: 'hash_code',
      startDate: 'start_date',
      closingDate: 'closing_date',
      filePath: 'file_path',
      createDate: 'create_date',
      creator: 'creator',
    };
  }

  static types(): { [key: string]: any } {
    return {
      supCode: 'string',
      supName: 'string',
      fileName: 'string',
      fileCode: 'string',
      hashCode: 'string',
      startDate: 'string',
      closingDate: 'string',
      filePath: 'string',
      createDate: 'string',
      creator: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 考核信息
export class Assessment extends $tea.Model {
  // 供应商
  supCode: string;
  // 供应商B
  supName: string;
  // 员工号
  jobNumber: string;
  // 员工姓名
  name?: string;
  // 考核分数
  assessmentNum: number;
  // 级别
  level: string;
  // 创建时间
  createDate: string;
  // 管理员
  creator?: string;
  // 202103
  scoreDate: string;
  // 结果状态
  resultstate: string;
  // 工作地点
  workplace?: string;
  // 状态更新时间
  resultdate: string;
  // 确认人
  resultby: string;
  // 备注
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      supCode: 'sup_code',
      supName: 'sup_name',
      jobNumber: 'job_number',
      name: 'name',
      assessmentNum: 'assessment_num',
      level: 'level',
      createDate: 'create_date',
      creator: 'creator',
      scoreDate: 'score_date',
      resultstate: 'resultstate',
      workplace: 'workplace',
      resultdate: 'resultdate',
      resultby: 'resultby',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      supCode: 'string',
      supName: 'string',
      jobNumber: 'string',
      name: 'string',
      assessmentNum: 'number',
      level: 'string',
      createDate: 'string',
      creator: 'string',
      scoreDate: 'string',
      resultstate: 'string',
      workplace: 'string',
      resultdate: 'string',
      resultby: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 查询功能所用集合
export class QueryMap extends $tea.Model {
  // 查询枚举：QueryTypeEnum
  name: string;
  // 查询参数
  value?: NameValuePair[];
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      value: { 'type': 'array', 'itemType': NameValuePair },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户宠物保单信息模型
export class InsuranceRecordModel extends $tea.Model {
  // 保司编码
  mechanismCode: string;
  // 保单号
  policyNo: string;
  // 保险产品SKU
  thirdPartSku?: string;
  // 保司机构名称
  mechanismName?: string;
  // 保险类型
  insuranceType: string;
  // 用户ID，天猫uid
  sourceUid: string;
  // 渠道来源 TIANMAO（天猫）
  source: string;
  // 用户类型 PERSON
  userType: string;
  // 扩展信息 （保单附件路径）
  extend?: string;
  // 保单生效时间
  policyEffectTime: string;
  // 保单失效时间
  policyInvalidTime: string;
  // 订单总金额 单位为分
  policyTotalAmount: number;
  // 保费支付日期
  policyPayDate: string;
  // 保单支付总期数
  policyTotalStage: number;
  // 每期支付金额
  policyStageAverAmount?: number;
  // 保单已支付期数
  policyPaidStage?: number;
  // 订单时间
  orderTime: string;
  // 活动码 赠险/商业险
  activityCode?: string;
  // 授权类型 0 非授权 1 授权
  authorizationType: number;
  static names(): { [key: string]: string } {
    return {
      mechanismCode: 'mechanism_code',
      policyNo: 'policy_no',
      thirdPartSku: 'third_part_sku',
      mechanismName: 'mechanism_name',
      insuranceType: 'insurance_type',
      sourceUid: 'source_uid',
      source: 'source',
      userType: 'user_type',
      extend: 'extend',
      policyEffectTime: 'policy_effect_time',
      policyInvalidTime: 'policy_invalid_time',
      policyTotalAmount: 'policy_total_amount',
      policyPayDate: 'policy_pay_date',
      policyTotalStage: 'policy_total_stage',
      policyStageAverAmount: 'policy_stage_aver_amount',
      policyPaidStage: 'policy_paid_stage',
      orderTime: 'order_time',
      activityCode: 'activity_code',
      authorizationType: 'authorization_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      mechanismCode: 'string',
      policyNo: 'string',
      thirdPartSku: 'string',
      mechanismName: 'string',
      insuranceType: 'string',
      sourceUid: 'string',
      source: 'string',
      userType: 'string',
      extend: 'string',
      policyEffectTime: 'string',
      policyInvalidTime: 'string',
      policyTotalAmount: 'number',
      policyPayDate: 'string',
      policyTotalStage: 'number',
      policyStageAverAmount: 'number',
      policyPaidStage: 'number',
      orderTime: 'string',
      activityCode: 'string',
      authorizationType: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 考勤信息
export class Attendance extends $tea.Model {
  // 供应商编码
  supCode: string;
  // 供应商A
  supName?: string;
  // 员工编号
  jobNumber: string;
  // 名字
  name?: string;
  // 考勤信息
  attendanceNum: number;
  // 级别
  level?: string;
  // 创建时间
  createDate: string;
  // 创建者
  creator?: string;
  // 时间
  scoreDate: string;
  // 结果状态
  resultstate?: string;
  // 工作地点
  workplace?: string;
  // 结果时间
  resultdate?: string;
  // 确认人
  resultby?: string;
  // 备注
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      supCode: 'sup_code',
      supName: 'sup_name',
      jobNumber: 'job_number',
      name: 'name',
      attendanceNum: 'attendance_num',
      level: 'level',
      createDate: 'create_date',
      creator: 'creator',
      scoreDate: 'score_date',
      resultstate: 'resultstate',
      workplace: 'workplace',
      resultdate: 'resultdate',
      resultby: 'resultby',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      supCode: 'string',
      supName: 'string',
      jobNumber: 'string',
      name: 'string',
      attendanceNum: 'number',
      level: 'string',
      createDate: 'string',
      creator: 'string',
      scoreDate: 'string',
      resultstate: 'string',
      workplace: 'string',
      resultdate: 'string',
      resultby: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 核身渲染结果
export class GwVerifyViewResult extends $tea.Model {
  // 核身上下文id
  verifyId: string;
  // 核审产品码，支持多种核身产品。 ZK_FACE_VERIFY：人脸识别
  productCode: string;
  // 核身分组
  group: string;
  // 返回结果
  responseParams: NameValuePair[];
  // 核身渲染是否调用成功
  success: boolean;
  // 返回码
  resultCode?: string;
  // 返回信息
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      verifyId: 'verify_id',
      productCode: 'product_code',
      group: 'group',
      responseParams: 'response_params',
      success: 'success',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      verifyId: 'string',
      productCode: 'string',
      group: 'string',
      responseParams: { 'type': 'array', 'itemType': NameValuePair },
      success: 'boolean',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 核审场景
export class GwVerifyScene extends $tea.Model {
  // 调用方系统名
  systemName: string;
  // 业务方产品
  bizProduct: string;
  // 业务产品节点
  bizProdNode: string;
  // 业务接入渠道
  accessChannel: string;
  // 业务调用场景的语言版本、CHINESE("中文", "chi")、ENG("英文", "en")
  language: string;
  static names(): { [key: string]: string } {
    return {
      systemName: 'system_name',
      bizProduct: 'biz_product',
      bizProdNode: 'biz_prod_node',
      accessChannel: 'access_channel',
      language: 'language',
    };
  }

  static types(): { [key: string]: any } {
    return {
      systemName: 'string',
      bizProduct: 'string',
      bizProdNode: 'string',
      accessChannel: 'string',
      language: 'string',
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

export class AuthCustomerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 预留业务code
  bizCode?: string;
  // 企业名称
  epCertName: string;
  // 企业证件号码
  epCertNo: string;
  // 企业证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
  epCertNoType: string;
  // 法人姓名
  legalPersonCertName?: string;
  // 法人证件号码
  legalPersonCertNo?: string;
  // 法人证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum	
  // 
  legalPersonCertNoType?: string;
  // 系统名称
  ownerName?: string;
  // 系统租户ID
  ownerUid?: string;
  // 业务唯一ID
  bizId: string;
  // 业务渠道，需提前申请产品码
  channel: string;
  // 认证类型：ENTERPRISE-企业, PERSON-个人
  certifyEnum: string;
  // 客户支付宝ID，如有则填。
  alipayUid?: string;
  // 个人姓名，用于个人认证
  personName?: string;
  // 个人证件号码
  personCertNo?: string;
  // 个人证件类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
  personCertType?: string;
  // 扩展信息
  extensionInfo?: NameValuePair[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizCode: 'biz_code',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
      epCertNoType: 'ep_cert_no_type',
      legalPersonCertName: 'legal_person_cert_name',
      legalPersonCertNo: 'legal_person_cert_no',
      legalPersonCertNoType: 'legal_person_cert_no_type',
      ownerName: 'owner_name',
      ownerUid: 'owner_uid',
      bizId: 'biz_id',
      channel: 'channel',
      certifyEnum: 'certify_enum',
      alipayUid: 'alipay_uid',
      personName: 'person_name',
      personCertNo: 'person_cert_no',
      personCertType: 'person_cert_type',
      extensionInfo: 'extension_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizCode: 'string',
      epCertName: 'string',
      epCertNo: 'string',
      epCertNoType: 'string',
      legalPersonCertName: 'string',
      legalPersonCertNo: 'string',
      legalPersonCertNoType: 'string',
      ownerName: 'string',
      ownerUid: 'string',
      bizId: 'string',
      channel: 'string',
      certifyEnum: 'string',
      alipayUid: 'string',
      personName: 'string',
      personCertNo: 'string',
      personCertType: 'string',
      extensionInfo: { 'type': 'array', 'itemType': NameValuePair },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthCustomerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户认证结果
  result?: CustomerAuthResult;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: CustomerAuthResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCustomerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务渠道，需提前申请产品码
  bizCode: string;
  // 客户类型：ENTERPRISE-企业, PERSON-个人
  // 
  customerType: string;
  // 客户名称
  name: string;
  // 客户证件号码，企业/个人均可
  certNo: string;
  // 客户证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
  certType: string;
  // 法人姓名
  // 
  legalPersonCertName?: string;
  // 法人证件号码
  // 
  legalPersonCertNo?: string;
  // 法人证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
  legalPersonCertNoType: string;
  // 是否需要先认证再注册，默认不认证。
  isAuth: boolean;
  // 业务角色： 买方，卖方，机构，合作伙伴
  businessRole?: string;
  // 客户支付宝ID，如有则填。
  alipayUid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizCode: 'biz_code',
      customerType: 'customer_type',
      name: 'name',
      certNo: 'cert_no',
      certType: 'cert_type',
      legalPersonCertName: 'legal_person_cert_name',
      legalPersonCertNo: 'legal_person_cert_no',
      legalPersonCertNoType: 'legal_person_cert_no_type',
      isAuth: 'is_auth',
      businessRole: 'business_role',
      alipayUid: 'alipay_uid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizCode: 'string',
      customerType: 'string',
      name: 'string',
      certNo: 'string',
      certType: 'string',
      legalPersonCertName: 'string',
      legalPersonCertNo: 'string',
      legalPersonCertNoType: 'string',
      isAuth: 'boolean',
      businessRole: 'string',
      alipayUid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCustomerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 统一客户ID
  customerId?: string;
  // 统一账户ID
  accId?: string;
  // 客户认证结果
  authFourElementsResponse?: CustomerAuthResult;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      customerId: 'customer_id',
      accId: 'acc_id',
      authFourElementsResponse: 'auth_four_elements_response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      customerId: 'string',
      accId: 'string',
      authFourElementsResponse: CustomerAuthResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCustomerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询内容
  conditionMap: QueryMap[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      conditionMap: 'condition_map',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      conditionMap: { 'type': 'array', 'itemType': QueryMap },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCustomerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询结果
  result?: NameValuePair[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: { 'type': 'array', 'itemType': NameValuePair },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitVerifyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 接入场景（主要由接入系统、接入产品、产品节点三部分组成）
  verifyScene: GwVerifyScene;
  // 调用方传入，唯一标识一笔业务，核身平台将bizId与核身token进行绑定，用作防串改校验
  bizId: string;
  // 调用方传入，存放业务扩展参数（callback参数也写入此）
  externParams?: NameValuePair[];
  // 调用方传入，指定核身完成后的回调类型
  callbackEnum?: string;
  // 核身产品列表
  validateFlows: GwValidateProduct[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      verifyScene: 'verify_scene',
      bizId: 'biz_id',
      externParams: 'extern_params',
      callbackEnum: 'callback_enum',
      validateFlows: 'validate_flows',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      verifyScene: GwVerifyScene,
      bizId: 'string',
      externParams: { 'type': 'array', 'itemType': NameValuePair },
      callbackEnum: 'string',
      validateFlows: { 'type': 'array', 'itemType': GwValidateProduct },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitVerifyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 核身id
  verifyId?: string;
  // 核身请求地址url
  verifyUrl?: string;
  // 核身处理状态:INITIAL、PROCESSING、SUCCESS、EXPIRED、FAIL
  verifyStatus?: string;
  // 可用产品集合
  validProd?: GwValidateProduct[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      verifyId: 'verify_id',
      verifyUrl: 'verify_url',
      verifyStatus: 'verify_status',
      validProd: 'valid_prod',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      verifyId: 'string',
      verifyUrl: 'string',
      verifyStatus: 'string',
      validProd: { 'type': 'array', 'itemType': GwValidateProduct },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartVerifyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 核身上下文id
  verifyId: string;
  // 核身模块分组
  group: string;
  // 核身动作：view-渲染，verify-校验，repeat-重新发送
  productAction: string;
  // 业务id
  bizId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      verifyId: 'verify_id',
      group: 'group',
      productAction: 'product_action',
      bizId: 'biz_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      verifyId: 'string',
      group: 'string',
      productAction: 'string',
      bizId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartVerifyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 核身渲染结果
  result?: GwVerifyViewResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: { 'type': 'array', 'itemType': GwVerifyViewResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckVerifyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 核身上下文id
  verifyId: string;
  // 核身模块分组
  group: string;
  // 核身动作：view-渲染，verify-校验，repeat-重新发送
  productAction: string;
  // 业务id
  bizId: string;
  // 核身产品码
  productCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      verifyId: 'verify_id',
      group: 'group',
      productAction: 'product_action',
      bizId: 'biz_id',
      productCode: 'product_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      verifyId: 'string',
      group: 'string',
      productAction: 'string',
      bizId: 'string',
      productCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckVerifyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 核身结果枚举：PASS-核身成功，INITIAL-初始化，PROCESS-处理中，FAIL-失败
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

export class VerifyMetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 预留业务code
  bizCode?: string;
  // 企业名称
  epCertName: string;
  // 企业证件号码
  epCertNo: string;
  // 企业证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
  epCertNoType: string;
  // 法人姓名
  legalPersonCertName?: string;
  // 法人证件号码
  legalPersonCertNo?: string;
  // 法人证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
  legalPersonCertNoType?: string;
  // 系统名称
  ownerName?: string;
  // 系统租户ID
  ownerUid?: string;
  // 业务唯一ID
  bizId: string;
  // 业务渠道，需提前申请产品码
  channel: string;
  // 认证类型：ENTERPRISE-企业, PERSON-个人
  certifyEnum: string;
  // 客户支付宝ID
  alipayUid?: string;
  // 个人姓名，用于个人认证
  personName?: string;
  // 个人证件号码
  personCertNo?: string;
  // 个人证件类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
  personCertType?: string;
  // 扩展信息
  extensionInfo?: NameValuePair;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizCode: 'biz_code',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
      epCertNoType: 'ep_cert_no_type',
      legalPersonCertName: 'legal_person_cert_name',
      legalPersonCertNo: 'legal_person_cert_no',
      legalPersonCertNoType: 'legal_person_cert_no_type',
      ownerName: 'owner_name',
      ownerUid: 'owner_uid',
      bizId: 'biz_id',
      channel: 'channel',
      certifyEnum: 'certify_enum',
      alipayUid: 'alipay_uid',
      personName: 'person_name',
      personCertNo: 'person_cert_no',
      personCertType: 'person_cert_type',
      extensionInfo: 'extension_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizCode: 'string',
      epCertName: 'string',
      epCertNo: 'string',
      epCertNoType: 'string',
      legalPersonCertName: 'string',
      legalPersonCertNo: 'string',
      legalPersonCertNoType: 'string',
      ownerName: 'string',
      ownerUid: 'string',
      bizId: 'string',
      channel: 'string',
      certifyEnum: 'string',
      alipayUid: 'string',
      personName: 'string',
      personCertNo: 'string',
      personCertType: 'string',
      extensionInfo: NameValuePair,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyMetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 要素认证结果
  result?: CustomerAuthResult;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: CustomerAuthResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEnterpriseBusinessinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  bizCode: string;
  // 企业名称
  epCertName: string;
  // 企业唯一编码
  epCertNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizCode: 'biz_code',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizCode: 'string',
      epCertName: 'string',
      epCertNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEnterpriseBusinessinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签名之后的结果
  signature?: string;
  // 国民经济行业代码
  industryCode?: string;
  // 国民经济行业名称
  industryName?: string;
  // 行业门类代码
  industryPhyCode?: string;
  // 行业门类名称
  industryPhyName?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      signature: 'signature',
      industryCode: 'industry_code',
      industryName: 'industry_name',
      industryPhyCode: 'industry_phy_code',
      industryPhyName: 'industry_phy_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      signature: 'string',
      industryCode: 'string',
      industryName: 'string',
      industryPhyCode: 'string',
      industryPhyName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyContractRuleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 服务提供商
  spProvider: SpProvider;
  // 明细
  ruleDetails: RuleDetail[];
  // confirmer
  confirmer: string;
  // 确认时间
  confirmDate: string;
  // confirm_status
  confirmStatus: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      spProvider: 'sp_provider',
      ruleDetails: 'rule_details',
      confirmer: 'confirmer',
      confirmDate: 'confirm_date',
      confirmStatus: 'confirm_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      spProvider: SpProvider,
      ruleDetails: { 'type': 'array', 'itemType': RuleDetail },
      confirmer: 'string',
      confirmDate: 'string',
      confirmStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyContractRuleResponse extends $tea.Model {
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

export class GetContractRuleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 服务商code
  supCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      supCode: 'sup_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      supCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetContractRuleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 服务商
  spProvider?: SpProvider;
  // 规则明细
  ruleDetails?: RuleDetail[];
  // 确认人
  confirmer?: string;
  // 确认状态
  confirmStatus?: string;
  // 确认时间
  confirmDate?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      spProvider: 'sp_provider',
      ruleDetails: 'rule_details',
      confirmer: 'confirmer',
      confirmStatus: 'confirm_status',
      confirmDate: 'confirm_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      spProvider: SpProvider,
      ruleDetails: { 'type': 'array', 'itemType': RuleDetail },
      confirmer: 'string',
      confirmStatus: 'string',
      confirmDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadStaffAttendanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 考勤信息
  attendance: Attendance;
  // uuid就行
  bizId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      attendance: 'attendance',
      bizId: 'biz_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      attendance: Attendance,
      bizId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadStaffAttendanceResponse extends $tea.Model {
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

export class QueryStaffAttendanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 员工工号
  jobNumber: string;
  // 考勤月份
  scoreDates: string[];
  // 供应商
  supCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      jobNumber: 'job_number',
      scoreDates: 'score_dates',
      supCode: 'sup_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      jobNumber: 'string',
      scoreDates: { 'type': 'array', 'itemType': 'string' },
      supCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryStaffAttendanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 考勤信息查询
  attendance?: Attendance[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      attendance: 'attendance',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      attendance: { 'type': 'array', 'itemType': Attendance },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadStaffAssessmentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求时间
  timeStamp: number;
  // 考核信息
  assessment: Assessment;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      timeStamp: 'time_stamp',
      assessment: 'assessment',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      timeStamp: 'number',
      assessment: Assessment,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadStaffAssessmentResponse extends $tea.Model {
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

export class QueryStaffAssessmentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 员工工号
  jobNumber: string;
  // 考核月份
  scoreDates: string[];
  // 供应商
  supCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      jobNumber: 'job_number',
      scoreDates: 'score_dates',
      supCode: 'sup_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      jobNumber: 'string',
      scoreDates: { 'type': 'array', 'itemType': 'string' },
      supCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryStaffAssessmentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 考核结果
  assessments?: Assessment[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      assessments: 'assessments',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      assessments: { 'type': 'array', 'itemType': Assessment },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecContractReconciliationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 供应商
  supCode: string;
  // 结算时间
  scoreDate: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      supCode: 'sup_code',
      scoreDate: 'score_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      supCode: 'string',
      scoreDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecContractReconciliationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结算单
  reconciliation?: Reconciliation;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      reconciliation: 'reconciliation',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      reconciliation: Reconciliation,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmContractReconciliationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 服务商
  supCode: string;
  // 确认时间
  socreDate: string;
  // 确认类型：1、长城  2、服务方
  confirmType: string;
  // 确认者
  confirmer: string;
  // 认证状态
  confirmStatus: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      supCode: 'sup_code',
      socreDate: 'socre_date',
      confirmType: 'confirm_type',
      confirmer: 'confirmer',
      confirmStatus: 'confirm_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      supCode: 'string',
      socreDate: 'string',
      confirmType: 'string',
      confirmer: 'string',
      confirmStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmContractReconciliationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结算单
  reconciliation?: Reconciliation;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      reconciliation: 'reconciliation',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      reconciliation: Reconciliation,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractReconciliationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 供应商code
  supCode: string;
  // 月份
  scoreDates: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      supCode: 'sup_code',
      scoreDates: 'score_dates',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      supCode: 'string',
      scoreDates: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractReconciliationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结算单
  reconciliations?: Reconciliation[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      reconciliations: 'reconciliations',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      reconciliations: { 'type': 'array', 'itemType': Reconciliation },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyCustomerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  bizCode?: string;
  // 支付宝uid
  alipayUid: string;
  // 个人名称
  personName?: string;
  // 个人联系电话
  personPhone?: string;
  // 核验证件号
  personCertNo?: string;
  // 个人身份类型  RESIDENT（身份证）
  personCertType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizCode: 'biz_code',
      alipayUid: 'alipay_uid',
      personName: 'person_name',
      personPhone: 'person_phone',
      personCertNo: 'person_cert_no',
      personCertType: 'person_cert_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizCode: 'string',
      alipayUid: 'string',
      personName: 'string',
      personPhone: 'string',
      personCertNo: 'string',
      personCertType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyCustomerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户生成的did
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

export class MatchDidAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码(YYX)
  bizCode: string;
  // 支付宝uid
  uid: string;
  // 分布式id ，双向check
  did: string;
  // 链id
  chainId?: string;
  // 链账户
  chainAccount: string;
  // 托管情况下包含
  kmsKeyId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizCode: 'biz_code',
      uid: 'uid',
      did: 'did',
      chainId: 'chain_id',
      chainAccount: 'chain_account',
      kmsKeyId: 'kms_key_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizCode: 'string',
      uid: 'string',
      did: 'string',
      chainId: 'string',
      chainAccount: 'string',
      kmsKeyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class MatchDidAccountResponse extends $tea.Model {
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

export class MatchDidAssetsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码(YYX)
  bizCode: string;
  // 支付宝uid
  uid: string;
  // 分布式id ，双向check
  did: string;
  // 链id
  chainId?: string;
  // 链账户
  chainAccount: string;
  // 链资产地址 HASH
  contract: string;
  // 合约类型 0-WASM
  contractType: number;
  // 资产类型
  assertType: string;
  // 上次资产发生变更的区块高度
  blockNumber?: string;
  // 上次资产发生变更的序号
  txIndex: string;
  // 上次资产发生变更的交易序列号
  longIndex: string;
  // 资产名称
  assertName: string;
  // 资产信息（资产描述信息）
  assertData: string;
  // 资产ID
  assertId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizCode: 'biz_code',
      uid: 'uid',
      did: 'did',
      chainId: 'chain_id',
      chainAccount: 'chain_account',
      contract: 'contract',
      contractType: 'contract_type',
      assertType: 'assert_type',
      blockNumber: 'block_number',
      txIndex: 'tx_index',
      longIndex: 'long_index',
      assertName: 'assert_name',
      assertData: 'assert_data',
      assertId: 'assert_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizCode: 'string',
      uid: 'string',
      did: 'string',
      chainId: 'string',
      chainAccount: 'string',
      contract: 'string',
      contractType: 'number',
      assertType: 'string',
      blockNumber: 'string',
      txIndex: 'string',
      longIndex: 'string',
      assertName: 'string',
      assertData: 'string',
      assertId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class MatchDidAssetsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 资产id
  assertId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      assertId: 'assert_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      assertId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDidCustomerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  bizCode: string;
  // 支付宝uid
  alipayUid: string;
  // 个人名称
  personName?: string;
  // 个人联系电话
  personPhone?: string;
  // 核验证件号
  personCertNo?: string;
  // 个人身份类型
  personCertType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizCode: 'biz_code',
      alipayUid: 'alipay_uid',
      personName: 'person_name',
      personPhone: 'person_phone',
      personCertNo: 'person_cert_no',
      personCertType: 'person_cert_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizCode: 'string',
      alipayUid: 'string',
      personName: 'string',
      personPhone: 'string',
      personCertNo: 'string',
      personCertType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDidCustomerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户生成的did	用户的did
  did?: string;
  // 用户昵称
  nickname?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      did: 'did',
      nickname: 'nickname',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      did: 'string',
      nickname: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDidEnterpriseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码
  bizCode: string;
  // 企业唯一编码
  enterpriseCode: string;
  // 企业名称
  enterpriseName?: string;
  // ORG_CERT 全国组织机构代码证书
  certType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizCode: 'biz_code',
      enterpriseCode: 'enterprise_code',
      enterpriseName: 'enterprise_name',
      certType: 'cert_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizCode: 'string',
      enterpriseCode: 'string',
      enterpriseName: 'string',
      certType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDidEnterpriseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 企业用户生成的did
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

export class InitInsuranceUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 保司编码
  businessCode: string;
  // 三方Id，此处为天猫id
  thirdPartId: string;
  // 来源渠道，TIANMAO（天猫）
  channel: string;
  // 埋点信息，JSON格式字符串
  burieds?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      businessCode: 'business_code',
      thirdPartId: 'third_part_id',
      channel: 'channel',
      burieds: 'burieds',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      businessCode: 'string',
      thirdPartId: 'string',
      channel: 'string',
      burieds: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitInsuranceUserResponse extends $tea.Model {
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

export class QueryInsuranceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 保司编码
  mechanismCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      mechanismCode: 'mechanism_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      mechanismCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInsuranceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务授权列表
  businessAuthorizeRecords?: BusinessRecordsPairs[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      businessAuthorizeRecords: 'business_authorize_records',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      businessAuthorizeRecords: { 'type': 'array', 'itemType': BusinessRecordsPairs },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateInsuranceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 保司编码
  mechanismCode?: string;
  // 保单加密信息
  policyEncryptionContext?: string;
  // 保单号
  policyNo?: string;
  // 保险产品SKU
  thirdPartSku?: string;
  // 保险公司名称
  mechanismName?: string;
  // 保单种类，险种
  insuranceType: string;
  // 来源uid，此处指天猫id
  sourceUid: string;
  // 订单来源
  source?: string;
  // 投保人
  userName?: string;
  // 投保人类型  自然人/公司
  userType?: string;
  // 投保人电话号码
  userPhoneNumber?: string;
  // 投保人证件号
  userCertNo?: string;
  // 拓展信息
  extend?: string;
  // 保单生效时间（毫秒值）
  policyEffectTime?: number;
  // 保单失效时间（毫秒值）
  policyInvalidTime?: number;
  // 订单总金额 整型，以分为单位，50000分 = 500.00元
  policyTotalAmount?: number;
  // 订单总期数（一次性付款用1）
  policyTotalStage?: number;
  // 保费支付日期（毫秒值）
  policyPayDate?: number;
  // 已支付保费期数（1代表1期）
  policyPaidStage?: number;
  // 每一期保费金额，整型，以分为单位，50000分 = 500.00元
  policyStageAverAmount?: number;
  // 订单时间（毫秒值）
  orderTime?: number;
  // 操作类型
  // 下单 支付 理赔 退单
  operation?: string;
  // 授权列表
  authorizeRecords?: AuthorizeRecordsPairs[];
  // 活动码/赠险码
  activityCode?: string;
  // 授权类型 1-已授权 2-未授权
  authorizationType: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      mechanismCode: 'mechanism_code',
      policyEncryptionContext: 'policy_encryption_context',
      policyNo: 'policy_no',
      thirdPartSku: 'third_part_sku',
      mechanismName: 'mechanism_name',
      insuranceType: 'insurance_type',
      sourceUid: 'source_uid',
      source: 'source',
      userName: 'user_name',
      userType: 'user_type',
      userPhoneNumber: 'user_phone_number',
      userCertNo: 'user_cert_no',
      extend: 'extend',
      policyEffectTime: 'policy_effect_time',
      policyInvalidTime: 'policy_invalid_time',
      policyTotalAmount: 'policy_total_amount',
      policyTotalStage: 'policy_total_stage',
      policyPayDate: 'policy_pay_date',
      policyPaidStage: 'policy_paid_stage',
      policyStageAverAmount: 'policy_stage_aver_amount',
      orderTime: 'order_time',
      operation: 'operation',
      authorizeRecords: 'authorize_records',
      activityCode: 'activity_code',
      authorizationType: 'authorization_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      mechanismCode: 'string',
      policyEncryptionContext: 'string',
      policyNo: 'string',
      thirdPartSku: 'string',
      mechanismName: 'string',
      insuranceType: 'string',
      sourceUid: 'string',
      source: 'string',
      userName: 'string',
      userType: 'string',
      userPhoneNumber: 'string',
      userCertNo: 'string',
      extend: 'string',
      policyEffectTime: 'number',
      policyInvalidTime: 'number',
      policyTotalAmount: 'number',
      policyTotalStage: 'number',
      policyPayDate: 'number',
      policyPaidStage: 'number',
      policyStageAverAmount: 'number',
      orderTime: 'number',
      operation: 'string',
      authorizeRecords: { 'type': 'array', 'itemType': AuthorizeRecordsPairs },
      activityCode: 'string',
      authorizationType: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateInsuranceResponse extends $tea.Model {
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

export class UploadInsuranceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 保司编码
  mechanismCode: string;
  // 附件信息
  // 
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      mechanismCode: 'mechanism_code',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      mechanismCode: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadInsuranceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文件类型
  fileBizType?: string;
  // 文件名称
  fileName?: string;
  // 文件访问路径
  ossUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      fileBizType: 'file_biz_type',
      fileName: 'file_name',
      ossUrl: 'oss_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      fileBizType: 'string',
      fileName: 'string',
      ossUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncInsuranceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 保司编码
  mechanismCode: string;
  // 理赔加密信息
  policyEncryptionContext: string;
  // 保单号
  policyNo: string;
  // 保险产品SKU
  thirdPartSku?: string;
  // 保司名称
  mechanismName?: string;
  // 保单种类，险种
  insuranceType?: string;
  // 操作类型
  // 下单 支付 理赔 退单
  operation?: string;
  // 赔付单号
  claimOrderNo: string;
  // 理赔申请时间（毫秒值）
  claimApplyTime: number;
  // 理赔赔付时间（毫秒值）
  claimPayTime: number;
  // 理赔申请金额，整型，以分为单位，50000分 = 500.00元
  claimApplyAmount: number;
  // 理赔金额，整型，以分为单位，50000分 = 500.00元
  claimAmount: number;
  // 授权列表
  authorizeRecords?: AuthorizeRecordsPairs[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      mechanismCode: 'mechanism_code',
      policyEncryptionContext: 'policy_encryption_context',
      policyNo: 'policy_no',
      thirdPartSku: 'third_part_sku',
      mechanismName: 'mechanism_name',
      insuranceType: 'insurance_type',
      operation: 'operation',
      claimOrderNo: 'claim_order_no',
      claimApplyTime: 'claim_apply_time',
      claimPayTime: 'claim_pay_time',
      claimApplyAmount: 'claim_apply_amount',
      claimAmount: 'claim_amount',
      authorizeRecords: 'authorize_records',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      mechanismCode: 'string',
      policyEncryptionContext: 'string',
      policyNo: 'string',
      thirdPartSku: 'string',
      mechanismName: 'string',
      insuranceType: 'string',
      operation: 'string',
      claimOrderNo: 'string',
      claimApplyTime: 'number',
      claimPayTime: 'number',
      claimApplyAmount: 'number',
      claimAmount: 'number',
      authorizeRecords: { 'type': 'array', 'itemType': AuthorizeRecordsPairs },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncInsuranceResponse extends $tea.Model {
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

export class CancelInsuranceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 原保单号
  policyNo: string;
  // 保单终止日期 毫秒值
  policyEndTime: number;
  // 退保原因
  reasonForQuit: string;
  // 退保保费金额，单位分
  quitTotalAmount: number;
  // 扩展信息
  extend?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      policyNo: 'policy_no',
      policyEndTime: 'policy_end_time',
      reasonForQuit: 'reason_for_quit',
      quitTotalAmount: 'quit_total_amount',
      extend: 'extend',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      policyNo: 'string',
      policyEndTime: 'number',
      reasonForQuit: 'string',
      quitTotalAmount: 'number',
      extend: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelInsuranceResponse extends $tea.Model {
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

export class QueryInsuranceRecordsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 第三方Id，此处为天猫uid
  sourceUid: string;
  // 保司编码
  mechanismCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sourceUid: 'source_uid',
      mechanismCode: 'mechanism_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sourceUid: 'string',
      mechanismCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInsuranceRecordsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户保单信息集合
  insuranceRecordsList?: InsuranceRecordModel[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      insuranceRecordsList: 'insurance_records_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      insuranceRecordsList: { 'type': 'array', 'itemType': InsuranceRecordModel },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInsuranceChainRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 第三方Id，此处为天猫uid
  sourceUid: string;
  // 保单号
  policyNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sourceUid: 'source_uid',
      policyNo: 'policy_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sourceUid: 'string',
      policyNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInsuranceChainResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 保司编码
  merchanismCode?: string;
  // 订单来源 TIANMAO
  source?: string;
  // 保险类型
  insuraceType?: string;
  // 保单加密信息（加密数据，由保司持有密钥）
  insuranceContext?: string;
  // 退保保单信息（加密数据，由保司持有密钥）
  insuranceClaimContext?: string;
  // 保单理赔信息（加密数据，由保司持有密钥）
  insuranceSurrenderContext?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      merchanismCode: 'merchanism_code',
      source: 'source',
      insuraceType: 'insurace_type',
      insuranceContext: 'insurance_context',
      insuranceClaimContext: 'insurance_claim_context',
      insuranceSurrenderContext: 'insurance_surrender_context',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      merchanismCode: 'string',
      source: 'string',
      insuraceType: 'string',
      insuranceContext: 'string',
      insuranceClaimContext: 'string',
      insuranceSurrenderContext: 'string',
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
          sdk_version: "1.7.26",
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
   * Description: 对企业/个人进行身份认证
   * Summary: 统一客户认证接口
   */
  async authCustomer(request: AuthCustomerRequest): Promise<AuthCustomerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authCustomerEx(request, headers, runtime);
  }

  /**
   * Description: 对企业/个人进行身份认证
   * Summary: 统一客户认证接口
   */
  async authCustomerEx(request: AuthCustomerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthCustomerResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthCustomerResponse>(await this.doRequest("1.0", "antchain.bbp.customer.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthCustomerResponse({}));
  }

  /**
   * Description: 智科统一客户注册
   * Summary: 统一客户注册接口
   */
  async createCustomer(request: CreateCustomerRequest): Promise<CreateCustomerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCustomerEx(request, headers, runtime);
  }

  /**
   * Description: 智科统一客户注册
   * Summary: 统一客户注册接口
   */
  async createCustomerEx(request: CreateCustomerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCustomerResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCustomerResponse>(await this.doRequest("1.0", "antchain.bbp.customer.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCustomerResponse({}));
  }

  /**
   * Description: 客户信息查询
   * Summary: 客户信息查询
   */
  async queryCustomer(request: QueryCustomerRequest): Promise<QueryCustomerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCustomerEx(request, headers, runtime);
  }

  /**
   * Description: 客户信息查询
   * Summary: 客户信息查询
   */
  async queryCustomerEx(request: QueryCustomerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCustomerResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCustomerResponse>(await this.doRequest("1.0", "antchain.bbp.customer.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCustomerResponse({}));
  }

  /**
   * Description: 核身初始化接口
   * Summary: 核身初始化接口
   */
  async initVerify(request: InitVerifyRequest): Promise<InitVerifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initVerifyEx(request, headers, runtime);
  }

  /**
   * Description: 核身初始化接口
   * Summary: 核身初始化接口
   */
  async initVerifyEx(request: InitVerifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitVerifyResponse> {
    Util.validateModel(request);
    return $tea.cast<InitVerifyResponse>(await this.doRequest("1.0", "antchain.bbp.verify.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitVerifyResponse({}));
  }

  /**
   * Description: 核身产品渲染接口
   * Summary: 核身产品渲染接口
   */
  async startVerify(request: StartVerifyRequest): Promise<StartVerifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startVerifyEx(request, headers, runtime);
  }

  /**
   * Description: 核身产品渲染接口
   * Summary: 核身产品渲染接口
   */
  async startVerifyEx(request: StartVerifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartVerifyResponse> {
    Util.validateModel(request);
    return $tea.cast<StartVerifyResponse>(await this.doRequest("1.0", "antchain.bbp.verify.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartVerifyResponse({}));
  }

  /**
   * Description: 核身结果查询
   * Summary: 核身结果查询
   */
  async checkVerify(request: CheckVerifyRequest): Promise<CheckVerifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkVerifyEx(request, headers, runtime);
  }

  /**
   * Description: 核身结果查询
   * Summary: 核身结果查询
   */
  async checkVerifyEx(request: CheckVerifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckVerifyResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckVerifyResponse>(await this.doRequest("1.0", "antchain.bbp.verify.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckVerifyResponse({}));
  }

  /**
   * Description: 对企业身份进行认证
   * Summary: 企业四要素认证
   */
  async verifyMeta(request: VerifyMetaRequest): Promise<VerifyMetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyMetaEx(request, headers, runtime);
  }

  /**
   * Description: 对企业身份进行认证
   * Summary: 企业四要素认证
   */
  async verifyMetaEx(request: VerifyMetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyMetaResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyMetaResponse>(await this.doRequest("1.0", "antchain.bbp.meta.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyMetaResponse({}));
  }

  /**
   * Description: 经营信息查询
   * Summary: 经营信息查询
   */
  async queryEnterpriseBusinessinfo(request: QueryEnterpriseBusinessinfoRequest): Promise<QueryEnterpriseBusinessinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEnterpriseBusinessinfoEx(request, headers, runtime);
  }

  /**
   * Description: 经营信息查询
   * Summary: 经营信息查询
   */
  async queryEnterpriseBusinessinfoEx(request: QueryEnterpriseBusinessinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEnterpriseBusinessinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEnterpriseBusinessinfoResponse>(await this.doRequest("1.0", "antchain.bbp.enterprise.businessinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEnterpriseBusinessinfoResponse({}));
  }

  /**
   * Description: 定义外包的薪资方案接口,以【服务商、项目类别、领域、角色、资质】为unique
   * Summary: 外包薪资规则合约发布接口
   */
  async applyContractRule(request: ApplyContractRuleRequest): Promise<ApplyContractRuleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyContractRuleEx(request, headers, runtime);
  }

  /**
   * Description: 定义外包的薪资方案接口,以【服务商、项目类别、领域、角色、资质】为unique
   * Summary: 外包薪资规则合约发布接口
   */
  async applyContractRuleEx(request: ApplyContractRuleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyContractRuleResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyContractRuleResponse>(await this.doRequest("1.0", "antchain.bbp.contract.rule.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyContractRuleResponse({}));
  }

  /**
   * Description: 调用链上合约接口，查询外包的薪资方案
  
   * Summary: 外包薪资规则合约查询接口
   */
  async getContractRule(request: GetContractRuleRequest): Promise<GetContractRuleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getContractRuleEx(request, headers, runtime);
  }

  /**
   * Description: 调用链上合约接口，查询外包的薪资方案
  
   * Summary: 外包薪资规则合约查询接口
   */
  async getContractRuleEx(request: GetContractRuleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetContractRuleResponse> {
    Util.validateModel(request);
    return $tea.cast<GetContractRuleResponse>(await this.doRequest("1.0", "antchain.bbp.contract.rule.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetContractRuleResponse({}));
  }

  /**
   * Description: 基于人的维度,支持批量接口上传，以{id,name,createDate,resultDate}。具体格式待商议
   * Summary: 长城汽车的考勤信息上传接口
   */
  async uploadStaffAttendance(request: UploadStaffAttendanceRequest): Promise<UploadStaffAttendanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadStaffAttendanceEx(request, headers, runtime);
  }

  /**
   * Description: 基于人的维度,支持批量接口上传，以{id,name,createDate,resultDate}。具体格式待商议
   * Summary: 长城汽车的考勤信息上传接口
   */
  async uploadStaffAttendanceEx(request: UploadStaffAttendanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadStaffAttendanceResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadStaffAttendanceResponse>(await this.doRequest("1.0", "antchain.bbp.staff.attendance.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadStaffAttendanceResponse({}));
  }

  /**
   * Description: 基于人的维度，入参：{用户id,考勤月份}
   * Summary: 长城汽车的考勤信息获取
   */
  async queryStaffAttendance(request: QueryStaffAttendanceRequest): Promise<QueryStaffAttendanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryStaffAttendanceEx(request, headers, runtime);
  }

  /**
   * Description: 基于人的维度，入参：{用户id,考勤月份}
   * Summary: 长城汽车的考勤信息获取
   */
  async queryStaffAttendanceEx(request: QueryStaffAttendanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryStaffAttendanceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryStaffAttendanceResponse>(await this.doRequest("1.0", "antchain.bbp.staff.attendance.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryStaffAttendanceResponse({}));
  }

  /**
   * Description: 长城汽车的考核信息
   * Summary: 长城汽车的考核信息
   */
  async uploadStaffAssessment(request: UploadStaffAssessmentRequest): Promise<UploadStaffAssessmentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadStaffAssessmentEx(request, headers, runtime);
  }

  /**
   * Description: 长城汽车的考核信息
   * Summary: 长城汽车的考核信息
   */
  async uploadStaffAssessmentEx(request: UploadStaffAssessmentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadStaffAssessmentResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadStaffAssessmentResponse>(await this.doRequest("1.0", "antchain.bbp.staff.assessment.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadStaffAssessmentResponse({}));
  }

  /**
   * Description: 考核信息查询
   * Summary: 考核信息查询
   */
  async queryStaffAssessment(request: QueryStaffAssessmentRequest): Promise<QueryStaffAssessmentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryStaffAssessmentEx(request, headers, runtime);
  }

  /**
   * Description: 考核信息查询
   * Summary: 考核信息查询
   */
  async queryStaffAssessmentEx(request: QueryStaffAssessmentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryStaffAssessmentResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryStaffAssessmentResponse>(await this.doRequest("1.0", "antchain.bbp.staff.assessment.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryStaffAssessmentResponse({}));
  }

  /**
   * Description: 对账单执行
   * Summary: 对账单执行接口
   */
  async execContractReconciliation(request: ExecContractReconciliationRequest): Promise<ExecContractReconciliationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execContractReconciliationEx(request, headers, runtime);
  }

  /**
   * Description: 对账单执行
   * Summary: 对账单执行接口
   */
  async execContractReconciliationEx(request: ExecContractReconciliationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecContractReconciliationResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecContractReconciliationResponse>(await this.doRequest("1.0", "antchain.bbp.contract.reconciliation.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecContractReconciliationResponse({}));
  }

  /**
   * Description: 结算单确认
   * Summary: 结算单确认
   */
  async confirmContractReconciliation(request: ConfirmContractReconciliationRequest): Promise<ConfirmContractReconciliationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmContractReconciliationEx(request, headers, runtime);
  }

  /**
   * Description: 结算单确认
   * Summary: 结算单确认
   */
  async confirmContractReconciliationEx(request: ConfirmContractReconciliationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmContractReconciliationResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmContractReconciliationResponse>(await this.doRequest("1.0", "antchain.bbp.contract.reconciliation.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmContractReconciliationResponse({}));
  }

  /**
   * Description: 查询结算单
   * Summary: 查询结算单
   */
  async queryContractReconciliation(request: QueryContractReconciliationRequest): Promise<QueryContractReconciliationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContractReconciliationEx(request, headers, runtime);
  }

  /**
   * Description: 查询结算单
   * Summary: 查询结算单
   */
  async queryContractReconciliationEx(request: QueryContractReconciliationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContractReconciliationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContractReconciliationResponse>(await this.doRequest("1.0", "antchain.bbp.contract.reconciliation.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContractReconciliationResponse({}));
  }

  /**
   * Description: DID创建及核验
   * Summary: DID创建及核验
   */
  async verifyCustomer(request: VerifyCustomerRequest): Promise<VerifyCustomerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyCustomerEx(request, headers, runtime);
  }

  /**
   * Description: DID创建及核验
   * Summary: DID创建及核验
   */
  async verifyCustomerEx(request: VerifyCustomerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyCustomerResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyCustomerResponse>(await this.doRequest("1.0", "antchain.bbp.customer.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyCustomerResponse({}));
  }

  /**
   * Description: 身份关联链上账户
   * Summary: 身份关联链上账户
   */
  async matchDidAccount(request: MatchDidAccountRequest): Promise<MatchDidAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.matchDidAccountEx(request, headers, runtime);
  }

  /**
   * Description: 身份关联链上账户
   * Summary: 身份关联链上账户
   */
  async matchDidAccountEx(request: MatchDidAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<MatchDidAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<MatchDidAccountResponse>(await this.doRequest("1.0", "antchain.bbp.did.account.match", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new MatchDidAccountResponse({}));
  }

  /**
   * Description: 身份关数字资产
   * Summary: 身份关数字资产
   */
  async matchDidAssets(request: MatchDidAssetsRequest): Promise<MatchDidAssetsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.matchDidAssetsEx(request, headers, runtime);
  }

  /**
   * Description: 身份关数字资产
   * Summary: 身份关数字资产
   */
  async matchDidAssetsEx(request: MatchDidAssetsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<MatchDidAssetsResponse> {
    Util.validateModel(request);
    return $tea.cast<MatchDidAssetsResponse>(await this.doRequest("1.0", "antchain.bbp.did.assets.match", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new MatchDidAssetsResponse({}));
  }

  /**
   * Description: DID创建及核验
   * Summary: DID创建及核验
   */
  async createDidCustomer(request: CreateDidCustomerRequest): Promise<CreateDidCustomerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDidCustomerEx(request, headers, runtime);
  }

  /**
   * Description: DID创建及核验
   * Summary: DID创建及核验
   */
  async createDidCustomerEx(request: CreateDidCustomerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDidCustomerResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDidCustomerResponse>(await this.doRequest("1.0", "antchain.bbp.did.customer.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDidCustomerResponse({}));
  }

  /**
   * Description: 企业DID创建及核验
   * Summary: 企业DID创建及核验
   */
  async createDidEnterprise(request: CreateDidEnterpriseRequest): Promise<CreateDidEnterpriseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDidEnterpriseEx(request, headers, runtime);
  }

  /**
   * Description: 企业DID创建及核验
   * Summary: 企业DID创建及核验
   */
  async createDidEnterpriseEx(request: CreateDidEnterpriseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDidEnterpriseResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDidEnterpriseResponse>(await this.doRequest("1.0", "antchain.bbp.did.enterprise.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDidEnterpriseResponse({}));
  }

  /**
   * Description: 记录用户登录保司小程序信息
   * Summary: 用户登陆页面埋点
   */
  async initInsuranceUser(request: InitInsuranceUserRequest): Promise<InitInsuranceUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initInsuranceUserEx(request, headers, runtime);
  }

  /**
   * Description: 记录用户登录保司小程序信息
   * Summary: 用户登陆页面埋点
   */
  async initInsuranceUserEx(request: InitInsuranceUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitInsuranceUserResponse> {
    Util.validateModel(request);
    return $tea.cast<InitInsuranceUserResponse>(await this.doRequest("1.0", "antchain.bbp.insurance.user.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitInsuranceUserResponse({}));
  }

  /**
   * Description: 保司方获取授权信息
   * Summary: 获取授权信息
   */
  async queryInsurance(request: QueryInsuranceRequest): Promise<QueryInsuranceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInsuranceEx(request, headers, runtime);
  }

  /**
   * Description: 保司方获取授权信息
   * Summary: 获取授权信息
   */
  async queryInsuranceEx(request: QueryInsuranceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInsuranceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInsuranceResponse>(await this.doRequest("1.0", "antchain.bbp.insurance.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInsuranceResponse({}));
  }

  /**
   * Description: 保单信息上链，保单信息同步
   * Summary: 保单信息上链
   */
  async operateInsurance(request: OperateInsuranceRequest): Promise<OperateInsuranceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateInsuranceEx(request, headers, runtime);
  }

  /**
   * Description: 保单信息上链，保单信息同步
   * Summary: 保单信息上链
   */
  async operateInsuranceEx(request: OperateInsuranceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateInsuranceResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateInsuranceResponse>(await this.doRequest("1.0", "antchain.bbp.insurance.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateInsuranceResponse({}));
  }

  /**
   * Description: 上传保单附件至阿里云OSS
   * Summary: 上传保单附件
   */
  async uploadInsurance(request: UploadInsuranceRequest): Promise<UploadInsuranceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadInsuranceEx(request, headers, runtime);
  }

  /**
   * Description: 上传保单附件至阿里云OSS
   * Summary: 上传保单附件
   */
  async uploadInsuranceEx(request: UploadInsuranceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadInsuranceResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.bbp.insurance.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadInsuranceResponse = new UploadInsuranceResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadInsuranceResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
    }

    Util.validateModel(request);
    return $tea.cast<UploadInsuranceResponse>(await this.doRequest("1.0", "antchain.bbp.insurance.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadInsuranceResponse({}));
  }

  /**
   * Description: 保险理赔受理信息同步到蚂蚁链
   * Summary: 理赔受理上链
   */
  async syncInsurance(request: SyncInsuranceRequest): Promise<SyncInsuranceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncInsuranceEx(request, headers, runtime);
  }

  /**
   * Description: 保险理赔受理信息同步到蚂蚁链
   * Summary: 理赔受理上链
   */
  async syncInsuranceEx(request: SyncInsuranceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncInsuranceResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncInsuranceResponse>(await this.doRequest("1.0", "antchain.bbp.insurance.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncInsuranceResponse({}));
  }

  /**
   * Description: 同步用户退保信息上链
   * Summary: 保单退保接口
   */
  async cancelInsurance(request: CancelInsuranceRequest): Promise<CancelInsuranceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelInsuranceEx(request, headers, runtime);
  }

  /**
   * Description: 同步用户退保信息上链
   * Summary: 保单退保接口
   */
  async cancelInsuranceEx(request: CancelInsuranceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelInsuranceResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelInsuranceResponse>(await this.doRequest("1.0", "antchain.bbp.insurance.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelInsuranceResponse({}));
  }

  /**
   * Description: 查询用户的数据库保单记录
   * Summary: 用户保单信息列表查询
   */
  async queryInsuranceRecords(request: QueryInsuranceRecordsRequest): Promise<QueryInsuranceRecordsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInsuranceRecordsEx(request, headers, runtime);
  }

  /**
   * Description: 查询用户的数据库保单记录
   * Summary: 用户保单信息列表查询
   */
  async queryInsuranceRecordsEx(request: QueryInsuranceRecordsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInsuranceRecordsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInsuranceRecordsResponse>(await this.doRequest("1.0", "antchain.bbp.insurance.records.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInsuranceRecordsResponse({}));
  }

  /**
   * Description: 保单链上信息查询
   * Summary: 保单链上信息查询
   */
  async queryInsuranceChain(request: QueryInsuranceChainRequest): Promise<QueryInsuranceChainResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInsuranceChainEx(request, headers, runtime);
  }

  /**
   * Description: 保单链上信息查询
   * Summary: 保单链上信息查询
   */
  async queryInsuranceChainEx(request: QueryInsuranceChainRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInsuranceChainResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInsuranceChainResponse>(await this.doRequest("1.0", "antchain.bbp.insurance.chain.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInsuranceChainResponse({}));
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
