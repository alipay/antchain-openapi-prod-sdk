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

export class AuthAntchainBbpCustomerRequest extends $tea.Model {
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

export class AuthAntchainBbpCustomerResponse extends $tea.Model {
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

export class CreateAntchainBbpCustomerRequest extends $tea.Model {
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

export class CreateAntchainBbpCustomerResponse extends $tea.Model {
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

export class QueryAntchainBbpCustomerRequest extends $tea.Model {
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

export class QueryAntchainBbpCustomerResponse extends $tea.Model {
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

export class MatchAntchainBbpDidAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码(YYX)
  bizCode?: string;
  // 支付宝uid
  uid: string;
  // 分布式id ，双向check
  did: string;
  // 链id
  chainId: string;
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

export class MatchAntchainBbpDidAccountResponse extends $tea.Model {
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

export class OperateAntchainBbpInsuranceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 保司编码
  mechanismCode: string;
  // 保单加密信息
  policyEncryptionContext: string;
  // 保单号
  policyNo: string;
  // 保险产品SKU
  thirdpartSku: string;
  // 保险公司名称
  mechanismName?: string;
  // 保单种类，险种
  insuranceType?: string;
  // 来源uid，此处指天猫id
  sourceUid?: string;
  // 订单来源
  source?: string;
  // 投保人
  userName?: string;
  // 投保人类型  自然人/公司
  userType: string;
  // 投保人电话号码
  userPhonenumber?: string;
  // 投保人证件号
  userCertNo?: string;
  // 拓展信息
  extend?: string;
  // 保单生效时间（毫秒值）
  policyEffectTime: number;
  // 保单失效时间（毫秒值）
  policyInvalidTime: number;
  // 订单总金额 BigDecimal
  policyTotalAmount: number;
  // 订单总期数（一次性付款用1）
  policyTotalStage: number;
  // 保费支付日期（毫秒值）
  policyPayDate: number;
  // 已支付保费期数（1代表1期）
  policyPaidStage?: number;
  // 每一期保费金额BigDecimal
  policyStageAverAmount?: number;
  // 订单时间（毫秒值）
  orderTime?: number;
  // 操作类型
  // 下单 支付 理赔 退单
  operation?: string;
  // 赔付单号(对于赔付操作来说是必填项)
  claimOrderNo?: string;
  // 理赔申请时间 理赔操作必填
  claimApplyTime?: number;
  // 理赔赔付时间 理赔操作必填
  claimPayTime?: number;
  // 理赔申请金额BigDecimal，单位元，保留小数点两位  理赔操作必填
  claimApplyAmount?: number;
  // 理赔金额BigDecimal，理赔操作必填
  claimAmount?: number;
  // 授权列表
  authorizeRecords?: AuthorizeRecordsPairs[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      mechanismCode: 'mechanism_code',
      policyEncryptionContext: 'policy_encryption_context',
      policyNo: 'policy_no',
      thirdpartSku: 'thirdpart_sku',
      mechanismName: 'mechanism_name',
      insuranceType: 'insurance_type',
      sourceUid: 'source_uid',
      source: 'source',
      userName: 'user_name',
      userType: 'user_type',
      userPhonenumber: 'user_phonenumber',
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
      thirdpartSku: 'string',
      mechanismName: 'string',
      insuranceType: 'string',
      sourceUid: 'string',
      source: 'string',
      userName: 'string',
      userType: 'string',
      userPhonenumber: 'string',
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

export class OperateAntchainBbpInsuranceResponse extends $tea.Model {
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

export class SyncAntchainBbpInsuranceRequest extends $tea.Model {
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
  thirdpartSku: string;
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
  claimPayTime: string;
  // 理赔申请金额，单位元，保留小数点两位BigDecimal
  claimApplyAmount: number;
  // 理赔金额
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
      thirdpartSku: 'thirdpart_sku',
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
      thirdpartSku: 'string',
      mechanismName: 'string',
      insuranceType: 'string',
      operation: 'string',
      claimOrderNo: 'string',
      claimApplyTime: 'number',
      claimPayTime: 'string',
      claimApplyAmount: 'number',
      claimAmount: 'number',
      authorizeRecords: { 'type': 'array', 'itemType': AuthorizeRecordsPairs },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainBbpInsuranceResponse extends $tea.Model {
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

export class UploadAntchainBbpInsuranceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 保司编码
  mechanismCode: string;
  // 保单加密信息
  policyEncryptionContext: string;
  // 保单号
  policyNo: string;
  // 保险产品SKU
  thirdpartSku: string;
  // 保司名称
  mechanismName?: string;
  // 保单种类，险种
  insuranceType?: string;
  // 来源uid，此处指天猫id
  sourceUid?: string;
  // 订单来源
  source?: string;
  // 投保人
  userName?: string;
  // 投保人类型  自然人/公司
  userType: string;
  // 投保人电话号码
  userPhonenumber?: string;
  // 投保人证件号
  userCertNo?: string;
  // 拓展信息
  extend?: string;
  // 保单生效时间（毫秒值）
  policyEffectTime: number;
  // 保单失效时间
  policyInvalidTime: number;
  // 订单总金额BigDecimal
  policyTotalAmount: number;
  // 订单总期数（一次性付款用1）
  policyTotalStage: number;
  // 保费支付日期（毫秒值）
  policyPayDate: number;
  // 已支付保费期数
  policyPaidStage?: number;
  // 每一期保费金额BigDecimal
  policyStageAverAmount?: number;
  // 订单时间（毫秒值）
  orderTime?: number;
  // 操作类型
  // 下单 支付 理赔 退单
  operation?: string;
  // 赔付单号 理赔操作必填
  claimOrderNo?: string;
  // 理赔申请时间（毫秒值） 理赔操作必填
  claimApplyTime?: number;
  // 理赔赔付时间（毫秒值） 理赔操作必填
  claimPayTime?: number;
  // 理赔申请金额，单位元，保留小数点两位 BigDecimal	理赔操作必填
  claimApplyAmount?: string;
  // 理赔金额 BigDecimal	理赔操作必填
  claimAmount?: string;
  // 授权列表
  authorizeRecords?: AuthorizeRecordsPairs[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      mechanismCode: 'mechanism_code',
      policyEncryptionContext: 'policy_encryption_context',
      policyNo: 'policy_no',
      thirdpartSku: 'thirdpart_sku',
      mechanismName: 'mechanism_name',
      insuranceType: 'insurance_type',
      sourceUid: 'source_uid',
      source: 'source',
      userName: 'user_name',
      userType: 'user_type',
      userPhonenumber: 'user_phonenumber',
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
      thirdpartSku: 'string',
      mechanismName: 'string',
      insuranceType: 'string',
      sourceUid: 'string',
      source: 'string',
      userName: 'string',
      userType: 'string',
      userPhonenumber: 'string',
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
      claimOrderNo: 'string',
      claimApplyTime: 'number',
      claimPayTime: 'number',
      claimApplyAmount: 'string',
      claimAmount: 'string',
      authorizeRecords: { 'type': 'array', 'itemType': AuthorizeRecordsPairs },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadAntchainBbpInsuranceResponse extends $tea.Model {
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

export class InitAntchainBbpInsuranceUserRequest extends $tea.Model {
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

export class InitAntchainBbpInsuranceUserResponse extends $tea.Model {
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

export class CheckAntchainBbpVerifyRequest extends $tea.Model {
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

export class CheckAntchainBbpVerifyResponse extends $tea.Model {
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

export class InitAntchainBbpVerifyRequest extends $tea.Model {
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

export class InitAntchainBbpVerifyResponse extends $tea.Model {
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

export class StartAntchainBbpVerifyRequest extends $tea.Model {
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

export class StartAntchainBbpVerifyResponse extends $tea.Model {
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
          _prod_code: "ak_b14fc97503f943f48147eb72b47b244d",
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
   * Description: 对企业/个人进行身份认证
   * Summary: 统一客户认证接口
   */
  async authAntchainBbpCustomer(request: AuthAntchainBbpCustomerRequest): Promise<AuthAntchainBbpCustomerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authAntchainBbpCustomerEx(request, headers, runtime);
  }

  /**
   * Description: 对企业/个人进行身份认证
   * Summary: 统一客户认证接口
   */
  async authAntchainBbpCustomerEx(request: AuthAntchainBbpCustomerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthAntchainBbpCustomerResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthAntchainBbpCustomerResponse>(await this.doRequest("1.0", "antchain.bbp.customer.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthAntchainBbpCustomerResponse({}));
  }

  /**
   * Description: 智科统一客户注册
   * Summary: 统一客户注册接口
   */
  async createAntchainBbpCustomer(request: CreateAntchainBbpCustomerRequest): Promise<CreateAntchainBbpCustomerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAntchainBbpCustomerEx(request, headers, runtime);
  }

  /**
   * Description: 智科统一客户注册
   * Summary: 统一客户注册接口
   */
  async createAntchainBbpCustomerEx(request: CreateAntchainBbpCustomerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAntchainBbpCustomerResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAntchainBbpCustomerResponse>(await this.doRequest("1.0", "antchain.bbp.customer.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAntchainBbpCustomerResponse({}));
  }

  /**
   * Description: 客户信息查询
   * Summary: 客户信息查询
   */
  async queryAntchainBbpCustomer(request: QueryAntchainBbpCustomerRequest): Promise<QueryAntchainBbpCustomerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainBbpCustomerEx(request, headers, runtime);
  }

  /**
   * Description: 客户信息查询
   * Summary: 客户信息查询
   */
  async queryAntchainBbpCustomerEx(request: QueryAntchainBbpCustomerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainBbpCustomerResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainBbpCustomerResponse>(await this.doRequest("1.0", "antchain.bbp.customer.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainBbpCustomerResponse({}));
  }

  /**
   * Description: 身份关联链上账户
   * Summary: 身份关联链上账户
   */
  async matchAntchainBbpDidAccount(request: MatchAntchainBbpDidAccountRequest): Promise<MatchAntchainBbpDidAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.matchAntchainBbpDidAccountEx(request, headers, runtime);
  }

  /**
   * Description: 身份关联链上账户
   * Summary: 身份关联链上账户
   */
  async matchAntchainBbpDidAccountEx(request: MatchAntchainBbpDidAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<MatchAntchainBbpDidAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<MatchAntchainBbpDidAccountResponse>(await this.doRequest("1.0", "antchain.bbp.did.account.match", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new MatchAntchainBbpDidAccountResponse({}));
  }

  /**
   * Description: 保单信息上链，保单信息同步
   * Summary: 保单信息上链
   */
  async operateAntchainBbpInsurance(request: OperateAntchainBbpInsuranceRequest): Promise<OperateAntchainBbpInsuranceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateAntchainBbpInsuranceEx(request, headers, runtime);
  }

  /**
   * Description: 保单信息上链，保单信息同步
   * Summary: 保单信息上链
   */
  async operateAntchainBbpInsuranceEx(request: OperateAntchainBbpInsuranceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateAntchainBbpInsuranceResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateAntchainBbpInsuranceResponse>(await this.doRequest("1.0", "antchain.bbp.insurance.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateAntchainBbpInsuranceResponse({}));
  }

  /**
   * Description: 保险理赔受理信息同步到蚂蚁链
   * Summary: 理赔受理上链
   */
  async syncAntchainBbpInsurance(request: SyncAntchainBbpInsuranceRequest): Promise<SyncAntchainBbpInsuranceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncAntchainBbpInsuranceEx(request, headers, runtime);
  }

  /**
   * Description: 保险理赔受理信息同步到蚂蚁链
   * Summary: 理赔受理上链
   */
  async syncAntchainBbpInsuranceEx(request: SyncAntchainBbpInsuranceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncAntchainBbpInsuranceResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncAntchainBbpInsuranceResponse>(await this.doRequest("1.0", "antchain.bbp.insurance.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncAntchainBbpInsuranceResponse({}));
  }

  /**
   * Description: 上传保单附件至阿里云OSS
   * Summary: 上传保单附件
   */
  async uploadAntchainBbpInsurance(request: UploadAntchainBbpInsuranceRequest): Promise<UploadAntchainBbpInsuranceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadAntchainBbpInsuranceEx(request, headers, runtime);
  }

  /**
   * Description: 上传保单附件至阿里云OSS
   * Summary: 上传保单附件
   */
  async uploadAntchainBbpInsuranceEx(request: UploadAntchainBbpInsuranceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadAntchainBbpInsuranceResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadAntchainBbpInsuranceResponse>(await this.doRequest("1.0", "antchain.bbp.insurance.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadAntchainBbpInsuranceResponse({}));
  }

  /**
   * Description: 记录用户登录保司小程序信息
   * Summary: 用户登陆页面埋点
   */
  async initAntchainBbpInsuranceUser(request: InitAntchainBbpInsuranceUserRequest): Promise<InitAntchainBbpInsuranceUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initAntchainBbpInsuranceUserEx(request, headers, runtime);
  }

  /**
   * Description: 记录用户登录保司小程序信息
   * Summary: 用户登陆页面埋点
   */
  async initAntchainBbpInsuranceUserEx(request: InitAntchainBbpInsuranceUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitAntchainBbpInsuranceUserResponse> {
    Util.validateModel(request);
    return $tea.cast<InitAntchainBbpInsuranceUserResponse>(await this.doRequest("1.0", "antchain.bbp.insurance.user.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitAntchainBbpInsuranceUserResponse({}));
  }

  /**
   * Description: 核身结果查询
   * Summary: 核身结果查询
   */
  async checkAntchainBbpVerify(request: CheckAntchainBbpVerifyRequest): Promise<CheckAntchainBbpVerifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkAntchainBbpVerifyEx(request, headers, runtime);
  }

  /**
   * Description: 核身结果查询
   * Summary: 核身结果查询
   */
  async checkAntchainBbpVerifyEx(request: CheckAntchainBbpVerifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckAntchainBbpVerifyResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckAntchainBbpVerifyResponse>(await this.doRequest("1.0", "antchain.bbp.verify.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckAntchainBbpVerifyResponse({}));
  }

  /**
   * Description: 核身初始化接口
   * Summary: 核身初始化接口
   */
  async initAntchainBbpVerify(request: InitAntchainBbpVerifyRequest): Promise<InitAntchainBbpVerifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initAntchainBbpVerifyEx(request, headers, runtime);
  }

  /**
   * Description: 核身初始化接口
   * Summary: 核身初始化接口
   */
  async initAntchainBbpVerifyEx(request: InitAntchainBbpVerifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitAntchainBbpVerifyResponse> {
    Util.validateModel(request);
    return $tea.cast<InitAntchainBbpVerifyResponse>(await this.doRequest("1.0", "antchain.bbp.verify.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitAntchainBbpVerifyResponse({}));
  }

  /**
   * Description: 核身产品渲染接口
   * Summary: 核身产品渲染接口
   */
  async startAntchainBbpVerify(request: StartAntchainBbpVerifyRequest): Promise<StartAntchainBbpVerifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startAntchainBbpVerifyEx(request, headers, runtime);
  }

  /**
   * Description: 核身产品渲染接口
   * Summary: 核身产品渲染接口
   */
  async startAntchainBbpVerifyEx(request: StartAntchainBbpVerifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartAntchainBbpVerifyResponse> {
    Util.validateModel(request);
    return $tea.cast<StartAntchainBbpVerifyResponse>(await this.doRequest("1.0", "antchain.bbp.verify.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartAntchainBbpVerifyResponse({}));
  }

}
