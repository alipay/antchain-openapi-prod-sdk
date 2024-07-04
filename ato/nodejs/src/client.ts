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

// 文件信息
export class FileInfo extends $tea.Model {
  // 文件名称
  fileName: string;
  // 文件key
  fileKey: string;
  static names(): { [key: string]: string } {
    return {
      fileName: 'file_name',
      fileKey: 'file_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fileName: 'string',
      fileKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单还款计划
export class PromiseInfo extends $tea.Model {
  static names(): { [key: string]: string } {
    return {
    };
  }

  static types(): { [key: string]: any } {
    return {
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 同步订单中的下单人信息
export class UserSyncInfo extends $tea.Model {
  static names(): { [key: string]: string } {
    return {
    };
  }

  static types(): { [key: string]: any } {
    return {
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 公司信息
export class CompanyInfo extends $tea.Model {
  // 营业执照文件信息
  businessLicenseFile: FileInfo;
  // 业务类型 枚举
  productMainClass: string;
  // 公司名称
  companyName: string;
  // 公司别名
  companyAliasName: string;
  // 公司数科租户id
  tenantId?: string;
  // 统一社会信用代码
  merchantId: string;
  // 公司联系电话
  companyMobile: string;
  // 公司联系地址
  companyAddress: string;
  // 联系人姓名
  contactName: string;
  // 联系人手机号码
  contactMobile: string;
  // 绑定企业支付宝账号
  bindAlipayNo: string;
  // 结算企业支付宝账号
  settleAlipayNo: string;
  // 绑定支付宝uid
  bindAlipayUid: string;
  static names(): { [key: string]: string } {
    return {
      businessLicenseFile: 'business_license_file',
      productMainClass: 'product_main_class',
      companyName: 'company_name',
      companyAliasName: 'company_alias_name',
      tenantId: 'tenant_id',
      merchantId: 'merchant_id',
      companyMobile: 'company_mobile',
      companyAddress: 'company_address',
      contactName: 'contact_name',
      contactMobile: 'contact_mobile',
      bindAlipayNo: 'bind_alipay_no',
      settleAlipayNo: 'settle_alipay_no',
      bindAlipayUid: 'bind_alipay_uid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      businessLicenseFile: FileInfo,
      productMainClass: 'string',
      companyName: 'string',
      companyAliasName: 'string',
      tenantId: 'string',
      merchantId: 'string',
      companyMobile: 'string',
      companyAddress: 'string',
      contactName: 'string',
      contactMobile: 'string',
      bindAlipayNo: 'string',
      settleAlipayNo: 'string',
      bindAlipayUid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 租户协议分页对象
export class AgreementPage extends $tea.Model {
  // 协议id
  agreementId: string;
  // 代理企业名称
  merchantName: string;
  // 租户8位id
  tenantId: string;
  // 业务类型 枚举
  productMainClass: string;
  // 协议类型 枚举
  agreementType: string;
  // 租户签约状态 枚举
  signStatus: string;
  static names(): { [key: string]: string } {
    return {
      agreementId: 'agreement_id',
      merchantName: 'merchant_name',
      tenantId: 'tenant_id',
      productMainClass: 'product_main_class',
      agreementType: 'agreement_type',
      signStatus: 'sign_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      agreementId: 'string',
      merchantName: 'string',
      tenantId: 'string',
      productMainClass: 'string',
      agreementType: 'string',
      signStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 风险场景的决策结果
export class RiskScene extends $tea.Model {
  // 风险场景编码
  sceneCode: string;
  // 该场景的风险决策结果
  decision: string;
  static names(): { [key: string]: string } {
    return {
      sceneCode: 'scene_code',
      decision: 'decision',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sceneCode: 'string',
      decision: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 策略结果详情
export class RiskStrategy extends $tea.Model {
  // 策略ID
  id: string;
  // 策略名称
  name: string;
  // 策略决策结果
  decision: string;
  // 风险场景编码
  sceneCode: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      decision: 'decision',
      sceneCode: 'scene_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      decision: 'string',
      sceneCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分账关系页对象
export class RelationPage extends $tea.Model {
  // 分账关系id
  relationId: string;
  // 分账公司名称
  companyName: string;
  // 分账公司名称统一社会信用代码
  merchantId: string;
  // 审核状态
  status: string;
  static names(): { [key: string]: string } {
    return {
      relationId: 'relation_id',
      companyName: 'company_name',
      merchantId: 'merchant_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      relationId: 'string',
      companyName: 'string',
      merchantId: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 进件分页对象
export class MerchantAgentPage extends $tea.Model {
  // 进件id
  payExpandId: string;
  // 	
  // 代理企业名称
  agentName: string;
  // 租户8位id
  tenantId: string;
  // 业务类型
  bizType: string;
  // 进件审核状态 枚举
  payExpandStatus: string;
  static names(): { [key: string]: string } {
    return {
      payExpandId: 'pay_expand_id',
      agentName: 'agent_name',
      tenantId: 'tenant_id',
      bizType: 'biz_type',
      payExpandStatus: 'pay_expand_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      payExpandId: 'string',
      agentName: 'string',
      tenantId: 'string',
      bizType: 'string',
      payExpandStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单消息结构体
export class OrderMsgInfo extends $tea.Model {
  // 订单id
  // 
  orderId: string;
  // 消息ID
  // 
  msgId: string;
  // 消息类型
  // 
  msgPublishType: string;
  // 消息创建时间
  // 
  msgCreateTime: string;
  // 消息投递状态 SUCCESS 成功 FAIL 失败 WAIT 等待投递重试
  msgStatus: string;
  // 消息重投次数
  // 
  msgRetryTime: number;
  // 消息回调地址
  msgCallbackUrl: string;
  // 消息体内容
  msgContent: string;
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      msgId: 'msg_id',
      msgPublishType: 'msg_publish_type',
      msgCreateTime: 'msg_create_time',
      msgStatus: 'msg_status',
      msgRetryTime: 'msg_retry_time',
      msgCallbackUrl: 'msg_callback_url',
      msgContent: 'msg_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      msgId: 'string',
      msgPublishType: 'string',
      msgCreateTime: 'string',
      msgStatus: 'string',
      msgRetryTime: 'number',
      msgCallbackUrl: 'string',
      msgContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 主订单信息
export class OrderInfo extends $tea.Model {
  static names(): { [key: string]: string } {
    return {
    };
  }

  static types(): { [key: string]: any } {
    return {
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 主动支付单据
export class ActivePayOrder extends $tea.Model {
  // 支付宝支付订单号，用于拉起主动支付页面
  tradeNo: string;
  // 状态
  // INIT：交易创建
  // FAILED：付款失败
  // SUCCESS：付款成功
  tradeStatus: string;
  // 状态原因码
  statusReasonCode?: string;
  // 超时关闭
  statusReasonMsg?: string;
  // 本次交易支付的订单金额，单位为分
  // 付款成功或付款成功之后的状态必填
  totalAmount?: number;
  // 用户在交易中支付的金额，单位为分
  // 付款成功的状态必填
  paidAmount?: number;
  // 商家在交易中实际收到的款项，单位为分
  // 付款成功的状态必填
  receiptAmount?: number;
  // 交易支付时间
  // 付款成功的状态必填
  gmtPay?: string;
  static names(): { [key: string]: string } {
    return {
      tradeNo: 'trade_no',
      tradeStatus: 'trade_status',
      statusReasonCode: 'status_reason_code',
      statusReasonMsg: 'status_reason_msg',
      totalAmount: 'total_amount',
      paidAmount: 'paid_amount',
      receiptAmount: 'receipt_amount',
      gmtPay: 'gmt_pay',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tradeNo: 'string',
      tradeStatus: 'string',
      statusReasonCode: 'string',
      statusReasonMsg: 'string',
      totalAmount: 'number',
      paidAmount: 'number',
      receiptAmount: 'number',
      gmtPay: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用信息
export class ApplicationInfo extends $tea.Model {
  // 应用场景
  // MINI_APP 小程序
  // APP 自有app
  // ALL 两种都有
  applicationScene: string;
  // 小程序id
  tinyAppId: string;
  // 小程序名称
  siteName: string;
  // 网站地址
  sitUrl: string;
  // 商户名称
  merchantName: string;
  // 商户服务名称
  merchantServiceName: string;
  // 商户服务描述
  merchantServiceDesc: string;
  static names(): { [key: string]: string } {
    return {
      applicationScene: 'application_scene',
      tinyAppId: 'tiny_app_id',
      siteName: 'site_name',
      sitUrl: 'sit_url',
      merchantName: 'merchant_name',
      merchantServiceName: 'merchant_service_name',
      merchantServiceDesc: 'merchant_service_desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      applicationScene: 'string',
      tinyAppId: 'string',
      siteName: 'string',
      sitUrl: 'string',
      merchantName: 'string',
      merchantServiceName: 'string',
      merchantServiceDesc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单商品信息
export class GoodsInfo extends $tea.Model {
  static names(): { [key: string]: string } {
    return {
    };
  }

  static types(): { [key: string]: any } {
    return {
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分页查询对象
export class PageQuery extends $tea.Model {
  // 页大小
  pageSize: number;
  // 当前页
  pageIndex: number;
  static names(): { [key: string]: string } {
    return {
      pageSize: 'page_size',
      pageIndex: 'page_index',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageSize: 'number',
      pageIndex: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 法人信息
export class LegalInfo extends $tea.Model {
  // 法人名称
  legalName: string;
  // 法人证件号
  legalCertNo: string;
  // 法人证件正面
  legalCertFrontFile: FileInfo;
  // 法人证件反面
  legalCertBackFile: FileInfo;
  static names(): { [key: string]: string } {
    return {
      legalName: 'legal_name',
      legalCertNo: 'legal_cert_no',
      legalCertFrontFile: 'legal_cert_front_file',
      legalCertBackFile: 'legal_cert_back_file',
    };
  }

  static types(): { [key: string]: any } {
    return {
      legalName: 'string',
      legalCertNo: 'string',
      legalCertFrontFile: FileInfo,
      legalCertBackFile: FileInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 审核信息
export class AuditInfo extends $tea.Model {
  // 审核步骤
  stage: string;
  // 审核主体
  auditSubject: string;
  // 审核状态
  status: string;
  // 审核时间
  applyDateStr: string;
  // 审核失败描述
  failReason: string;
  static names(): { [key: string]: string } {
    return {
      stage: 'stage',
      auditSubject: 'audit_subject',
      status: 'status',
      applyDateStr: 'apply_date_str',
      failReason: 'fail_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      stage: 'string',
      auditSubject: 'string',
      status: 'string',
      applyDateStr: 'string',
      failReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 模型结果详情
export class RiskModel extends $tea.Model {
  // 风险场景编码
  sceneCode: string;
  // 该风险场景的风险分值
  score: string;
  static names(): { [key: string]: string } {
    return {
      sceneCode: 'scene_code',
      score: 'score',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sceneCode: 'string',
      score: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单包含的单个商品模型
export class OrderGoodsModel extends $tea.Model {
  static names(): { [key: string]: string } {
    return {
    };
  }

  static types(): { [key: string]: any } {
    return {
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

export class SyncFundSplittingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资方订单号
  fundNo: string;
  // 商户的订单号
  orderId: string;
  // 商户的数科租户ID
  merchantTenantId: string;
  // 第几期，例如：2表示第二期
  termNum: number;
  // 扣款时间， yyyy-MM-dd HH:mm:ss 格式
  deductionTime: string;
  // 扣款金额，单位精确到分， 例如：12462300为124623.00元
  deductionAmount: number;
  // 商户分账金额，单位精确到分，比如：666601 = 6666.01元
  merchantSplitAmount: number;
  // 资方分账金额，单位精确到分。比如：666610 = 6666.10元
  fundSplitAmount: number;
  // 其他参与方分账信息，JSON格式的数组，样例：
  // [{"participants":"参与方A","amount":666600,"accountNo":"777223","accountType":"ICBC"}]
  otherSplitInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fundNo: 'fund_no',
      orderId: 'order_id',
      merchantTenantId: 'merchant_tenant_id',
      termNum: 'term_num',
      deductionTime: 'deduction_time',
      deductionAmount: 'deduction_amount',
      merchantSplitAmount: 'merchant_split_amount',
      fundSplitAmount: 'fund_split_amount',
      otherSplitInfo: 'other_split_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fundNo: 'string',
      orderId: 'string',
      merchantTenantId: 'string',
      termNum: 'number',
      deductionTime: 'string',
      deductionAmount: 'number',
      merchantSplitAmount: 'number',
      fundSplitAmount: 'number',
      otherSplitInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncFundSplittingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 流水同步描述信息
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncFundOrderfinancialRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderId: string;
  // 商户在数科的租户ID
  merchantTenantId: string;
  // 订单融资唯一标识
  applicationId: string;
  // 订单融资状态：1-成功；2-失败
  status: number;
  // 融资结果描述，长度不超过64
  reason?: string;
  // 额外信息
  extras?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantTenantId: 'merchant_tenant_id',
      applicationId: 'application_id',
      status: 'status',
      reason: 'reason',
      extras: 'extras',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantTenantId: 'string',
      applicationId: 'string',
      status: 'number',
      reason: 'string',
      extras: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncFundOrderfinancialResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果描述信息
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncFundWithholdingcontractRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderId: string;
  // 商家在数科注册的租户id
  merchantTenantId: string;
  // 代扣协议号
  withholdingContractId: string;
  // json的字符串，存储额外信息
  extraInfo?: string;
  // 签署状态：
  // - ACCEPT : 接受
  // - REFUSE : 拒绝
  // - TIMEOUT : 超时
  status: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantTenantId: 'merchant_tenant_id',
      withholdingContractId: 'withholding_contract_id',
      extraInfo: 'extra_info',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantTenantId: 'string',
      withholdingContractId: 'string',
      extraInfo: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncFundWithholdingcontractResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存储成功
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncFundOrderfulfillmentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户id
  merchantTenantId: string;
  // 订单id
  orderId: string;
  // 租期编号
  leaseTermIndex: number;
  // 剩余归还期数
  remainTerm: number;
  // 总期数
  totalTerm: number;
  // 租金归还状态，
  // RETURN_FULL : 足额归还 【终态】
  // NOT_RETURN : 未归还
  // CANCEL : 取消 【终态】
  rentalReturnState: string;
  // 租金归还金额,精确到分，即1234表示12.34元
  rentalMoney: number;
  // 罚息金额，分，1234表示12.34元
  penaltyFeeMoney: number;
  // 总金额，单位分
  totalMoney: number;
  // 归还时间，格式为"2019-07-31 12:00:00"
  returnTime?: string;
  // 归还方式，
  // ANTDIGITAL： 数科代扣
  // FUND : 资方代扣
  // BANK : 银行转账
  // WECHAT : 微信支付
  returnWay?: string;
  // 还款凭证编号
  returnVoucherSerial?: string;
  // 银行名字
  bankName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantTenantId: 'merchant_tenant_id',
      orderId: 'order_id',
      leaseTermIndex: 'lease_term_index',
      remainTerm: 'remain_term',
      totalTerm: 'total_term',
      rentalReturnState: 'rental_return_state',
      rentalMoney: 'rental_money',
      penaltyFeeMoney: 'penalty_fee_money',
      totalMoney: 'total_money',
      returnTime: 'return_time',
      returnWay: 'return_way',
      returnVoucherSerial: 'return_voucher_serial',
      bankName: 'bank_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantTenantId: 'string',
      orderId: 'string',
      leaseTermIndex: 'number',
      remainTerm: 'number',
      totalTerm: 'number',
      rentalReturnState: 'string',
      rentalMoney: 'number',
      penaltyFeeMoney: 'number',
      totalMoney: 'number',
      returnTime: 'string',
      returnWay: 'string',
      returnVoucherSerial: 'string',
      bankName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncFundOrderfulfillmentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 添加成功
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFundOrderfulfillmentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 租赁订单所属商家租户id
  merchantTenantId: string;
  // 期数
  // 如果填入，获取term_idx下的履约记录
  // 如果不填入，获取order_id下的所有履约记录
  termIdx?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantTenantId: 'merchant_tenant_id',
      termIdx: 'term_idx',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantTenantId: 'string',
      termIdx: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFundOrderfulfillmentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单履约信息的列表数组
  // List<OrderFulfillment> 的jsonArray.toString
  orderFulfillmentDataList?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderFulfillmentDataList: 'order_fulfillment_data_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderFulfillmentDataList: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadFundFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单所属商户的统一社会信用代码
  merchantId: string;
  // 商户的订单号
  orderId: string;
  // 签署合同单号
  signNo: string;
  // 返回的文件fileItemNo编号
  fileItemNo: string;
  // 上传的pdf文件，需要以.pdf后缀结尾
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  // 资方统一社会信用代码
  fundId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantId: 'merchant_id',
      orderId: 'order_id',
      signNo: 'sign_no',
      fileItemNo: 'file_item_no',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      fundId: 'fund_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantId: 'string',
      orderId: 'string',
      signNo: 'string',
      fileItemNo: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      fundId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadFundFlowResponse extends $tea.Model {
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

export class GetFundFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单所属商户的统一社会信用代码
  merchantId: string;
  // 商户的订单号
  orderId: string;
  // 合同类型
  contractType?: string;
  // 资方统一社会信用代码
  fundId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantId: 'merchant_id',
      orderId: 'order_id',
      contractType: 'contract_type',
      fundId: 'fund_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantId: 'string',
      orderId: 'string',
      contractType: 'string',
      fundId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFundFlowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商户的订单号
  orderId?: string;
  // 需要落章的合同列表，需要status状态为FINISH可以落章
  contractList?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
      contractList: 'contract_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
      contractList: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RefuseFundFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单所属商户的统一社会信用代码
  merchantId: string;
  // 商户的订单号
  orderId: string;
  // 签署合同单号
  signNo: string;
  // 填写拒绝落章原因，如果同意则不用填写
  signReason?: string;
  // 资方统一社会信用代码
  fundId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantId: 'merchant_id',
      orderId: 'order_id',
      signNo: 'sign_no',
      signReason: 'sign_reason',
      fundId: 'fund_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantId: 'string',
      orderId: 'string',
      signNo: 'string',
      signReason: 'string',
      fundId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RefuseFundFlowResponse extends $tea.Model {
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

export class AuthFundFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单所属商户的统一社会信用代码
  merchantId: string;
  // 商户的订单号
  orderId: string;
  // 签署的电子合同ID
  signNo: string;
  // 签署区域的tag，和发起签署流程的机构的tag对应
  tag: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantId: 'merchant_id',
      orderId: 'order_id',
      signNo: 'sign_no',
      tag: 'tag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantId: 'string',
      orderId: 'string',
      signNo: 'string',
      tag: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthFundFlowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签署最后落签的签署区域id列表
  signFieldIds?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      signFieldIds: 'sign_field_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      signFieldIds: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelFundPlanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 长度不可超过50
  orderId: string;
  // 订单所属商户的社会信用代码
  merchantId: string;
  // 取消原因 
  // ACTIVE_REDEEM:自主赎回
  // RENTING_OUT_REDEEM:退租赎回
  // RENTING_AND_RESALE_REDEEM:租转售赎回
  cancelReason: string;
  // 融资单的资方社会信用代码
  fundId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      cancelReason: 'cancel_reason',
      fundId: 'fund_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
      cancelReason: 'string',
      fundId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelFundPlanResponse extends $tea.Model {
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

export class CallbackFundNotifyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // ASYNC_UNSIGN_APPLY
  type: string;
  // 数据
  data: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      type: 'type',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      type: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackFundNotifyResponse extends $tea.Model {
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

export class SyncFundMerchantpromiseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 
  orderId: string;
  // 订单所属商户的社会信用代码
  merchantId: string;
  // json字符串,填入「MerchantPromiseReq」的json字符串
  bizContent: string;
  // 资方公司社会信用代码
  fundId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      bizContent: 'biz_content',
      fundId: 'fund_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
      bizContent: 'string',
      fundId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncFundMerchantpromiseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单id
  orderId?: string;
  // 订单所属商家社会信用代码
  merchantId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
      merchantId: 'merchant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
      merchantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncFundFinanceloanresultsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 商家的社会信用代码
  merchantId: string;
  // json字符串,填入「FinanceLoanResultsReq」的json字符串
  bizContent: string;
  // 资方的社会信用代码
  fundId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      bizContent: 'biz_content',
      fundId: 'fund_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
      bizContent: 'string',
      fundId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncFundFinanceloanresultsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单id
  orderId?: string;
  // 订单所属商户的社会信用代码
  merchantId?: string;
  // "ERROR": 放款同步异常
  // “SUCCESS":放款同步成功
  loanResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      loanResult: 'loan_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
      merchantId: 'string',
      loanResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFundUserpromiseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 订单所属商户的社会信用代码
  merchantId: string;
  // 资方的社会信用代码
  fundId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      fundId: 'fund_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
      fundId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFundUserpromiseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回值为「OrderPromise」的json字符串
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFundUserperformanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 
  orderId: string;
  // 订单所属商户的社会信用代码
  merchantId: string;
  // 订单所属融资公司的社会信用代码
  fundId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      fundId: 'fund_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
      fundId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFundUserperformanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 「UserPerformanceInfo」的json字符串
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFundMerchantperformanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 
  orderId: string;
  // 订单所属商户的社会信用代码
  merchantId: string;
  // 订单所属融资方的社会信用代码
  fundId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      fundId: 'fund_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
      fundId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFundMerchantperformanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 「MerchantPerformanceInfo」的json字符串
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFundOrderfullinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单Id
  orderId: string;
  // 订单所属商户的社会信用代码
  merchantId: string;
  // 订单所属商户的社会信用代码
  fundId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      fundId: 'fund_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
      fundId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFundOrderfullinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // OrderFullInfoResp的json字符串
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyFundFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单所属商户的统一社会信用代码
  merchantId: string;
  // 商户的订单号
  orderId: string;
  // 签署合同单号
  signNo: string;
  // 返回的文件fileItemNo编号
  fileItemNo: string;
  // 资方统一社会信用代码
  fundId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantId: 'merchant_id',
      orderId: 'order_id',
      signNo: 'sign_no',
      fileItemNo: 'file_item_no',
      fundId: 'fund_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantId: 'string',
      orderId: 'string',
      signNo: 'string',
      fileItemNo: 'string',
      fundId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyFundFlowResponse extends $tea.Model {
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

export class UploadFundCreditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号类型
  orderNoType: string;
  // 订单号，或资产包号
  orderNo: string;
  // 资方统一社会信用代码
  fundId: string;
  // 凭证类型
  creditType: string;
  // 凭证名称
  creditName?: string;
  // 文本类型
  contentType: string;
  // 文本下载链接，如果类型是FILE则必填
  fileUrl?: string;
  // 内容数据，格式为JSON类型文本，如果类型是JSON_TEXT则必填
  content?: string;
  // 商户统一社会信用代码
  merchantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNoType: 'order_no_type',
      orderNo: 'order_no',
      fundId: 'fund_id',
      creditType: 'credit_type',
      creditName: 'credit_name',
      contentType: 'content_type',
      fileUrl: 'file_url',
      content: 'content',
      merchantId: 'merchant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNoType: 'string',
      orderNo: 'string',
      fundId: 'string',
      creditType: 'string',
      creditName: 'string',
      contentType: 'string',
      fileUrl: 'string',
      content: 'string',
      merchantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadFundCreditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 凭证内容id
  contentId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      contentId: 'content_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      contentId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFundCreditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号类型
  orderNoType: string;
  // 订单号，或资产包号
  orderNo: string;
  // 资方统一社会信用代码
  fundId: string;
  // 商户统一社会信用代码
  merchantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNoType: 'order_no_type',
      orderNo: 'order_no',
      fundId: 'fund_id',
      merchantId: 'merchant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNoType: 'string',
      orderNo: 'string',
      fundId: 'string',
      merchantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFundCreditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 内容信息
  contentInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      contentInfo: 'content_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      contentInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInnerProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户在数科的租户id
  merchantTenantId: string;
  // 商户统一社会信用代码
  merchantId: string;
  // 商品id
  productId: string;
  // 商品版本
  productVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantTenantId: 'merchant_tenant_id',
      merchantId: 'merchant_id',
      productId: 'product_id',
      productVersion: 'product_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantTenantId: 'string',
      merchantId: 'string',
      productId: 'string',
      productVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInnerProductResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // {}json字符串
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInnerTenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户在数科的租户id
  merchantTenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantTenantId: 'merchant_tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantTenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInnerTenantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // {}租户信息
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncInnerMeterforwholeorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户租户id
  merchantTenantId: string;
  // 商户统一社会信用代码
  merchantId: string;
  // 商户购买的产品code
  meterProductCode: string;
  // 订单id
  orderId: string;
  // 订单总租期
  orderRentTerm: number;
  // 订单总租金，单位为分
  orderTotalMoney: number;
  // 系统名称
  sysName: string;
  // 订单产品的二级类目
  orderProductSubclass: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantTenantId: 'merchant_tenant_id',
      merchantId: 'merchant_id',
      meterProductCode: 'meter_product_code',
      orderId: 'order_id',
      orderRentTerm: 'order_rent_term',
      orderTotalMoney: 'order_total_money',
      sysName: 'sys_name',
      orderProductSubclass: 'order_product_subclass',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantTenantId: 'string',
      merchantId: 'string',
      meterProductCode: 'string',
      orderId: 'string',
      orderRentTerm: 'number',
      orderTotalMoney: 'number',
      sysName: 'string',
      orderProductSubclass: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncInnerMeterforwholeorderResponse extends $tea.Model {
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

export class SyncInnerMeterforagsignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户租户id
  merchantTenantId: string;
  // 商户社会信用代码
  merchantId: string;
  // 计量上报Code
  meterProductCode: string;
  // 系统名字
  sysName: string;
  // 订单id
  orderId: string;
  // 合同编号
  signNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantTenantId: 'merchant_tenant_id',
      merchantId: 'merchant_id',
      meterProductCode: 'meter_product_code',
      sysName: 'sys_name',
      orderId: 'order_id',
      signNo: 'sign_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantTenantId: 'string',
      merchantId: 'string',
      meterProductCode: 'string',
      sysName: 'string',
      orderId: 'string',
      signNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncInnerMeterforagsignResponse extends $tea.Model {
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

export class AllInnerTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 分页查询结构体
  pageInfo: PageQuery;
  // 商户对应租户ID
  tenantId: string;
  // 魔法库模板code
  templateCode?: string;
  // 魔法库模板文件名称
  templateName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageInfo: 'page_info',
      tenantId: 'tenant_id',
      templateCode: 'template_code',
      templateName: 'template_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageInfo: PageQuery,
      tenantId: 'string',
      templateCode: 'string',
      templateName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllInnerTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 模板列表数据
  templateList?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      templateList: 'template_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      templateList: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListInnerTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 分页查询
  pageInfo: PageQuery;
  // 商户对应租户ID
  tenantId: string;
  // 魔法库模板code
  templateCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageInfo: 'page_info',
      tenantId: 'tenant_id',
      templateCode: 'template_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageInfo: PageQuery,
      tenantId: 'string',
      templateCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListInnerTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 模板列表数据
  templateList?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      templateList: 'template_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      templateList: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailInnerTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 	
  // 商户对应租户ID
  tenantId: string;
  // 魔法库模板code
  templateCode: string;
  // 魔法库模板版本
  templateVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      templateCode: 'template_code',
      templateVersion: 'template_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      templateCode: 'string',
      templateVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailInnerTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 模板详情信息
  templateInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      templateInfo: 'template_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      templateInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInnerTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 	
  // 商户对应租户ID
  tenantId: string;
  // 创建的模板名称
  templateName: string;
  // 文件oss存储的key
  fileKey?: string;
  // 模板文件的名称
  fileName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      templateName: 'template_name',
      fileKey: 'file_key',
      fileName: 'file_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      templateName: 'string',
      fileKey: 'string',
      fileName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInnerTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 魔法库模板code
  templateCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      templateCode: 'template_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      templateCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveInnerTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户对应租户ID
  tenantId: string;
  // 魔法库模板code
  templateCode: string;
  // 魔法库模板版本
  templateVersion: string;
  // 文件预览地址
  previewAddress: string;
  // 创建模板的元素列表
  templateElementList?: string;
  // 文件oss存储的key
  fileKey: string;
  // 是否确认保存。点击”保存“按钮传false、点击”下一步“按钮传true
  confirm: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      templateCode: 'template_code',
      templateVersion: 'template_version',
      previewAddress: 'preview_address',
      templateElementList: 'template_element_list',
      fileKey: 'file_key',
      confirm: 'confirm',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      templateCode: 'string',
      templateVersion: 'string',
      previewAddress: 'string',
      templateElementList: 'string',
      fileKey: 'string',
      confirm: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveInnerTemplateResponse extends $tea.Model {
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

export class SaveInnerSignfieldsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户对应租户ID
  tenantId: string;
  // 魔法库模板code
  templateCode: string;
  // 魔法库模板版本
  templateVersion: string;
  // 模板签署区列表
  signFieldList: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      templateCode: 'template_code',
      templateVersion: 'template_version',
      signFieldList: 'sign_field_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      templateCode: 'string',
      templateVersion: 'string',
      signFieldList: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveInnerSignfieldsResponse extends $tea.Model {
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

export class PublishInnerTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户对应租户ID
  tenantId: string;
  // 魔法库模板code
  templateCode: string;
  // 魔法库版本id
  templateVersionId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      templateCode: 'template_code',
      templateVersionId: 'template_version_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      templateCode: 'string',
      templateVersionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishInnerTemplateResponse extends $tea.Model {
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

export class PreviewInnerTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户对应租户ID
  tenantId: string;
  // 文件oss存储的key
  fileKey: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      fileKey: 'file_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      fileKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PreviewInnerTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 预览接口返回
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

export class DeleteInnerTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户对应租户ID
  tenantId: string;
  // 魔法库模板code
  templateCode: string;
  // 魔法库模板版本
  templateVersion: string;
  // 魔法库模板版本id
  templateVersionId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      templateCode: 'template_code',
      templateVersion: 'template_version',
      templateVersionId: 'template_version_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      templateCode: 'string',
      templateVersion: 'string',
      templateVersionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteInnerTemplateResponse extends $tea.Model {
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

export class CloneInnerTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户对应租户ID
  tenantId: string;
  // 模板code
  templateCode: string;
  // 魔法库对应模板的模板复制id
  voucherId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      templateCode: 'template_code',
      voucherId: 'voucher_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      templateCode: 'string',
      voucherId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CloneInnerTemplateResponse extends $tea.Model {
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

export class UploadInnerFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户8位id
  tenantId: string;
  // 文件名称
  fileName: string;
  // ● BUSINESS_LICENSE 营业执照
  // ● CARD_FRONT 身份证正面
  // ● CARD_BACK 身份证反面
  // ● SPLITTING 分账
  // ● CONTRACT_TEMPLATE 合同模板
  bizScene: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      fileName: 'file_name',
      bizScene: 'biz_scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      fileName: 'string',
      bizScene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadInnerFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 临时上传地址
  uploadUrl?: string;
  // 文件key
  fileKey?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      uploadUrl: 'upload_url',
      fileKey: 'file_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      uploadUrl: 'string',
      fileKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DownloadInnerFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户8位id
  tenantId: string;
  // 文件key
  fileKey: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      fileKey: 'file_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      fileKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DownloadInnerFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文件临时下载地址
  downloadUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      downloadUrl: 'download_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      downloadUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInnerTemplateofficeurlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 	
  // 商户对应租户ID
  tenantId: string;
  // 魔法库模板code
  templateCode: string;
  // 魔法库模板版本
  templateVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      templateCode: 'template_code',
      templateVersion: 'template_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      templateCode: 'string',
      templateVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInnerTemplateofficeurlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回值
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

export class RefreshInnerTemplatetokenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户对应租户ID
  tenantId: string;
  // accessToken
  accessToken: string;
  // refreshToekn
  refreshToken: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      accessToken: 'access_token',
      refreshToken: 'refresh_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      accessToken: 'string',
      refreshToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RefreshInnerTemplatetokenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回值
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

export class CreateInnerTemplatetextareaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户对应租户ID
  tenantId: string;
  // 模板编码
  templateCode: string;
  // 模板版本号
  templateVersion: string;
  // 组件类型，INPUT:单行文本 TEXTAREA:多行文本
  componentType: string;
  // 组件名称（占位符）
  componentName: string;
  // 是否必填
  required: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      templateCode: 'template_code',
      templateVersion: 'template_version',
      componentType: 'component_type',
      componentName: 'component_name',
      required: 'required',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      templateCode: 'string',
      templateVersion: 'string',
      componentType: 'string',
      componentName: 'string',
      required: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInnerTemplatetextareaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建成功的文本域组件信息
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

export class QueryInnerTemplateimageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户对应租户ID
  tenantId: string;
  // 分页查询结构体
  pageInfo: PageQuery;
  // 魔法库模板code
  templateCode: string;
  // 魔法库模板版本
  templateVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      pageInfo: 'page_info',
      templateCode: 'template_code',
      templateVersion: 'template_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      pageInfo: PageQuery,
      templateCode: 'string',
      templateVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInnerTemplateimageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 模板图片列表
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

export class CreateInnerFunddividerelationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户8位id
  tenantId: string;
  // 第一次暂存或提交可以不传，由后端生成
  relationId?: string;
  // 分账公司名称
  companyName?: string;
  // 分账公司社会信用代码
  merchantId?: string;
  // 分账合同或协议
  contractFiles?: FileInfo[];
  // 分账关系说明
  desc?: string;
  // 分账方企业pid
  alipayPid?: string;
  // 分账方企业支付宝账号
  alipayAccount?: string;
  // 是否直接提交
  // SUBMITTED 直接提交
  // STAGE 暂存
  submit: string;
  // 操作人名称
  userName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      relationId: 'relation_id',
      companyName: 'company_name',
      merchantId: 'merchant_id',
      contractFiles: 'contract_files',
      desc: 'desc',
      alipayPid: 'alipay_pid',
      alipayAccount: 'alipay_account',
      submit: 'submit',
      userName: 'user_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      relationId: 'string',
      companyName: 'string',
      merchantId: 'string',
      contractFiles: { 'type': 'array', 'itemType': FileInfo },
      desc: 'string',
      alipayPid: 'string',
      alipayAccount: 'string',
      submit: 'string',
      userName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInnerFunddividerelationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分账关系id
  relationId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      relationId: 'relation_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      relationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitInnerFunddividerelationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户8位id
  tenantId: string;
  // 分账关系id
  relationId: string;
  // 操作人名称
  userName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      relationId: 'relation_id',
      userName: 'user_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      relationId: 'string',
      userName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitInnerFunddividerelationResponse extends $tea.Model {
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

export class QueryInnerFunddividerelationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户8位id
  tenantId: string;
  // 分账关系id
  relationId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      relationId: 'relation_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      relationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInnerFunddividerelationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分账公司名称
  companyName?: string;
  // 分账主体企业统一社会信用代码
  subjectMerchantId?: string;
  // 分账对象统一社会信用代码
  merchantId?: string;
  // 分账合同或协议
  contractFiles?: FileInfo[];
  // 分账关系说明
  desc?: string;
  // 分账方企业pid
  alipayPid?: string;
  // 分账方企业支付宝账号
  alipayAccount?: string;
  // 审核列表
  auditInfos?: AuditInfo[];
  // INIT:待提交 AUDIT:审批中 AUDIT_PASSED:审批通过 AUDIT_NOT_PASSED:审批不通过
  relationStatus?: string;
  // 分账关系绑定失败原因
  relationFailReason?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      companyName: 'company_name',
      subjectMerchantId: 'subject_merchant_id',
      merchantId: 'merchant_id',
      contractFiles: 'contract_files',
      desc: 'desc',
      alipayPid: 'alipay_pid',
      alipayAccount: 'alipay_account',
      auditInfos: 'audit_infos',
      relationStatus: 'relation_status',
      relationFailReason: 'relation_fail_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      companyName: 'string',
      subjectMerchantId: 'string',
      merchantId: 'string',
      contractFiles: { 'type': 'array', 'itemType': FileInfo },
      desc: 'string',
      alipayPid: 'string',
      alipayAccount: 'string',
      auditInfos: { 'type': 'array', 'itemType': AuditInfo },
      relationStatus: 'string',
      relationFailReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryInnerFunddividerelationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户8位id
  tenantId: string;
  // 分页查询对象
  pageInfo: PageQuery;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      pageInfo: PageQuery,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryInnerFunddividerelationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据总量
  totalSize?: number;
  // 分账关系页对象列表
  relations?: RelationPage[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalSize: 'total_size',
      relations: 'relations',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalSize: 'number',
      relations: { 'type': 'array', 'itemType': RelationPage },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInnerMerchantagreementRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户8位id
  tenantId: string;
  // 协议编号
  agreementId: string;
  // 签署动作
  signAction: string;
  // 操作人名称
  userName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      agreementId: 'agreement_id',
      signAction: 'sign_action',
      userName: 'user_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      agreementId: 'string',
      signAction: 'string',
      userName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInnerMerchantagreementResponse extends $tea.Model {
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

export class QueryInnerMerchantagreementRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户8位id
  tenantId: string;
  // 协议id
  agreementId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      agreementId: 'agreement_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      agreementId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInnerMerchantagreementResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签约状态 枚举
  // TOBE 待签
  // FAIL 签约失败
  // SUCCESS 签约成功
  signStatus?: string;
  // 签约时间
  signDateStr?: string;
  // 协议内容 富文本
  agreementContent?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      signStatus: 'sign_status',
      signDateStr: 'sign_date_str',
      agreementContent: 'agreement_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      signStatus: 'string',
      signDateStr: 'string',
      agreementContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryInnerMerchantagreementRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户8位id
  tenantId: string;
  // 分页对象
  pageInfo: PageQuery;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      pageInfo: PageQuery,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryInnerMerchantagreementResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据总量
  totalSize?: number;
  // 协议分页对象
  agreementPage?: AgreementPage[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalSize: 'total_size',
      agreementPage: 'agreement_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalSize: 'number',
      agreementPage: { 'type': 'array', 'itemType': AgreementPage },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInnerMerchantpayexpandRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户ID
  tenantId: string;
  // 公司信息
  companyInfo: CompanyInfo;
  // 法人信息
  legalInfo: LegalInfo;
  // 应用信息
  applicationInfo: ApplicationInfo;
  // 是否直接提交
  // SUBMITTED 直接提交
  // STAGE 暂存
  submit: string;
  // 进件模式
  // DIRECT(直连进件)
  // AGENT(代理进件)
  expandMode: string;
  // expand_mode=_AGENT_ 必填
  subTenantId?: string;
  // 操作人名称
  userName: string;
  // 第一次暂存或保存可以不传，后端直接生成
  payExpandId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      companyInfo: 'company_info',
      legalInfo: 'legal_info',
      applicationInfo: 'application_info',
      submit: 'submit',
      expandMode: 'expand_mode',
      subTenantId: 'sub_tenant_id',
      userName: 'user_name',
      payExpandId: 'pay_expand_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      companyInfo: CompanyInfo,
      legalInfo: LegalInfo,
      applicationInfo: ApplicationInfo,
      submit: 'string',
      expandMode: 'string',
      subTenantId: 'string',
      userName: 'string',
      payExpandId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInnerMerchantpayexpandResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 进件流水号
  payExpandId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      payExpandId: 'pay_expand_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      payExpandId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitInnerMerchantpayexpandRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户8位id
  tenantId: string;
  // 进件id
  payExpandId: string;
  // 操作人名称
  userName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      payExpandId: 'pay_expand_id',
      userName: 'user_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      payExpandId: 'string',
      userName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitInnerMerchantpayexpandResponse extends $tea.Model {
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

export class QueryInnerMerchantpayexpandRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户8位id
  tenantId: string;
  // 进件id expand_mode=AGENT 必填 DIRECT可以根据tenant_id推断
  payExpandId?: string;
  // 进件模式 DIRECT(直连进件) AGENT(代理进件)
  expandMode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      payExpandId: 'pay_expand_id',
      expandMode: 'expand_mode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      payExpandId: 'string',
      expandMode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInnerMerchantpayexpandResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 公司信息
  companyInfo?: CompanyInfo;
  // 法人信息
  legalInfo?: LegalInfo;
  // 应用信息
  applicationInfo?: ApplicationInfo;
  // 审核列表
  auditInfos?: AuditInfo[];
  // 进件流水号
  payExpandId?: string;
  // 进件模式 DIRECT(直连进件) AGENT(代理进件)
  expandMode?: string;
  // INIT:草稿态 SUB_MERCHANT_CREDIT:二级户商户签约中 AUDIT:审核中 AUDIT_PASSED:进件成功 AUDIT_NOT_PASSED:进件失败 MERCHANT_CONFIRM:待商户确认
  expandStatus?: string;
  // 进件失败描述
  expandFailReason?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      companyInfo: 'company_info',
      legalInfo: 'legal_info',
      applicationInfo: 'application_info',
      auditInfos: 'audit_infos',
      payExpandId: 'pay_expand_id',
      expandMode: 'expand_mode',
      expandStatus: 'expand_status',
      expandFailReason: 'expand_fail_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      companyInfo: CompanyInfo,
      legalInfo: LegalInfo,
      applicationInfo: ApplicationInfo,
      auditInfos: { 'type': 'array', 'itemType': AuditInfo },
      payExpandId: 'string',
      expandMode: 'string',
      expandStatus: 'string',
      expandFailReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryInnerMerchantagentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户8位id
  tenantId: string;
  // 代理商户名称
  agentName: string;
  // 分页对象
  pageInfo: PageQuery;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      agentName: 'agent_name',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      agentName: 'string',
      pageInfo: PageQuery,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryInnerMerchantagentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据总量
  totalSize?: number;
  // 代理租户分页对象
  merchantAgentPage?: MerchantAgentPage[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalSize: 'total_size',
      merchantAgentPage: 'merchant_agent_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalSize: 'number',
      merchantAgentPage: { 'type': 'array', 'itemType': MerchantAgentPage },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CloneInnerTemplatefileaddressRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户对应租户ID
  tenantId: string;
  // 模板编码
  templateCode: string;
  // 文件key
  fileKey: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      templateCode: 'template_code',
      fileKey: 'file_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      templateCode: 'string',
      fileKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CloneInnerTemplatefileaddressResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 拷贝后的文件key
  fileKey?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      fileKey: 'file_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      fileKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInnerSignfieldsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户对应租户ID
  tenantId: string;
  // 魔法库模板code
  templateCode: string;
  // 魔法库模板版本
  templateVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      templateCode: 'template_code',
      templateVersion: 'template_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      templateCode: 'string',
      templateVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInnerSignfieldsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签署区列表
  signFieldList?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      signFieldList: 'sign_field_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      signFieldList: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncInnerTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户对应租户ID
  tenantId: string;
  // 来源魔法库模板code
  sourceTemplateCode: string;
  // 目标魔法库模板名称
  targetTemplateName?: string;
  // 模板同步的场景，值参考：CREATE_TEMPLATE、SYNC_PROD
  scene: string;
  // 魔法库来源模板版本
  sourceTemplateVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      sourceTemplateCode: 'source_template_code',
      targetTemplateName: 'target_template_name',
      scene: 'scene',
      sourceTemplateVersion: 'source_template_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      sourceTemplateCode: 'string',
      targetTemplateName: 'string',
      scene: 'string',
      sourceTemplateVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncInnerTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 同步后的新模板code
  targetTemplateCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      targetTemplateCode: 'target_template_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      targetTemplateCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateInnerTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户对应租户ID
  tenantId: string;
  // 魔法库版本id
  templateVersionId: string;
  // 模板名称
  templateName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      templateVersionId: 'template_version_id',
      templateName: 'template_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      templateVersionId: 'string',
      templateName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateInnerTemplateResponse extends $tea.Model {
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

export class QueryInnerTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 模板code
  templateCode: string;
  // 租户8位id
  tenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      templateCode: 'template_code',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      templateCode: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInnerTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 模板的基本信息，json格式
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

export class QueryInnerTemplateelementlinkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  // 模板code
  templateCode: string;
  // 模板版本
  templateVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      templateCode: 'template_code',
      templateVersion: 'template_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      templateCode: 'string',
      templateVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInnerTemplateelementlinkResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 模板元素列表，json格式
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

export class QueryInnerTemplateversionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  // 模板编码
  templateCode: string;
  // 模板的版本号，示例：1、2、3等
  templateVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      templateCode: 'template_code',
      templateVersion: 'template_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      templateCode: 'string',
      templateVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInnerTemplateversionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 模板的版本详情信息
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

export class PagequeryInnerOrdermsgRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户8位id
  // 
  tenantId: string;
  // 订单ID
  orderId: string;
  // 消息类型
  msgPublishType?: string;
  // 消息创建时间起始
  msgCreateTimeFrom?: string;
  // 消息创建时间结束
  msgCreateTimeTo?: string;
  // SANDBOX 沙箱 ；PROD 生产
  env: string;
  // 分页查询对象
  pageInfo: PageQuery;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      orderId: 'order_id',
      msgPublishType: 'msg_publish_type',
      msgCreateTimeFrom: 'msg_create_time_from',
      msgCreateTimeTo: 'msg_create_time_to',
      env: 'env',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      orderId: 'string',
      msgPublishType: 'string',
      msgCreateTimeFrom: 'string',
      msgCreateTimeTo: 'string',
      env: 'string',
      pageInfo: PageQuery,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryInnerOrdermsgResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据总量
  totalSize?: number;
  // 消息内容列表
  orderMsgInfos?: OrderMsgInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalSize: 'total_size',
      orderMsgInfos: 'order_msg_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalSize: 'number',
      orderMsgInfos: { 'type': 'array', 'itemType': OrderMsgInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryInnerOrdermsgRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户ID
  tenantId: string;
  // SANDBOX 沙箱 PROD 生产
  env: string;
  // 订单id
  // 
  orderId: string;
  // 消息ID
  // 
  msgId: string;
  // 使用租户新回调地址
  usingNewCallbackUrl: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      env: 'env',
      orderId: 'order_id',
      msgId: 'msg_id',
      usingNewCallbackUrl: 'using_new_callback_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      env: 'string',
      orderId: 'string',
      msgId: 'string',
      usingNewCallbackUrl: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryInnerOrdermsgResponse extends $tea.Model {
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

export class RegisterMerchantexpandMerchantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 公司信息
  companyInfo: CompanyInfo;
  // 法人信息
  legalInfo: LegalInfo;
  // 应用信息
  applicationInfo: ApplicationInfo;
  // 进件模式 DIRECT(直连进件) AGENT(代理进件)
  expandMode: string;
  // expand_mode=_AGENT_ 必填
  subTenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyInfo: 'company_info',
      legalInfo: 'legal_info',
      applicationInfo: 'application_info',
      expandMode: 'expand_mode',
      subTenantId: 'sub_tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      companyInfo: CompanyInfo,
      legalInfo: LegalInfo,
      applicationInfo: ApplicationInfo,
      expandMode: 'string',
      subTenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterMerchantexpandMerchantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 进件流水号
  payExpandId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      payExpandId: 'pay_expand_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      payExpandId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadMerchantexpandFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件名称 包含后缀
  fileName: string;
  // ● BUSINESS_LICENSE 营业执照 ● CARD_FRONT 身份证正面 ● CARD_BACK 身份证反面 ● SPLITTING 分账 
  bizScene: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileName: 'file_name',
      bizScene: 'biz_scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileName: 'string',
      bizScene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadMerchantexpandFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 临时上传文件地址
  uploadUrl?: string;
  // 文件key
  fileKey?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      uploadUrl: 'upload_url',
      fileKey: 'file_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      uploadUrl: 'string',
      fileKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMerchantexpandMerchantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户入驻返回的进件编号 expand_mode=AGENT必填
  payExpandId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      payExpandId: 'pay_expand_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      payExpandId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMerchantexpandMerchantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商户入驻状态
  // INIT 入驻中
  // SUCCESS 入驻成功
  // FAIL 入驻失败
  enrollmentStatus?: string;
  // 入驻失败原因
  failReason?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      enrollmentStatus: 'enrollment_status',
      failReason: 'fail_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      enrollmentStatus: 'string',
      failReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRealpersonFacevrfRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 真实姓名
  certName: string;
  // 证件号码
  certNo: string;
  // 身份信息来源类型，当前仅支持证件（CERT_INFO）
  identityType: string;
  // 证件类型，当前仅支持身份证（IDENTITY_CARD）
  certType: string;
  // 商户请求的唯一标识。
  // 
  // 值为 32 位长度的字母数字组合。其中，前面几位字符是商户自定义的简称，中间几位可以使用一段时间，后段可以使用一个随机或递增序列。该值也可以使用 UUID。
  outerOrderNo: string;
  // 认证结束回跳地址
  returnUrl: string;
  // 订单id 长度不可超过50
  orderId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certName: 'cert_name',
      certNo: 'cert_no',
      identityType: 'identity_type',
      certType: 'cert_type',
      outerOrderNo: 'outer_order_no',
      returnUrl: 'return_url',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certName: 'string',
      certNo: 'string',
      identityType: 'string',
      certType: 'string',
      outerOrderNo: 'string',
      returnUrl: 'string',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRealpersonFacevrfResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务返回字段，JSON格式
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

export class QueryRealpersonFacevrfRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 可信实人认证的唯一标识
  certifyId: string;
  // 商户请求的唯一标识。
  // 
  // 值为 32 位长度的字母数字组合。其中，前面几位字符是商户自定义的简称，中间几位可以使用一段时间，后段可以使用一个随机或递增序列。该值也可以使用 UUID。
  outerOrderNo: string;
  // 订单id 长度不可超过50
  orderId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certifyId: 'certify_id',
      outerOrderNo: 'outer_order_no',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certifyId: 'string',
      outerOrderNo: 'string',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRealpersonFacevrfResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务返回字段，JSON格式
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

export class QueryRiskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 账户ID
  userId?: string;
  // 用户姓名
  userName: string;
  // 用户证件号码
  certNo: string;
  // 用户手机号码
  mobile: string;
  // 用户ip地址
  ip?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      userName: 'user_name',
      certNo: 'cert_no',
      mobile: 'mobile',
      ip: 'ip',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
      userName: 'string',
      certNo: 'string',
      mobile: 'string',
      ip: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRiskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求唯一ID标识，为空则是异常
  securityId?: string;
  // 总风险决策结果，枚举值为：reject[拒绝],validate[待定],accept[通过]。
  decision?: string;
  // 风险场景的决策结果
  scenes?: RiskScene[];
  // 策略结果详情
  strategies?: RiskStrategy[];
  // 模型结果详情
  models?: RiskModel[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      securityId: 'security_id',
      decision: 'decision',
      scenes: 'scenes',
      strategies: 'strategies',
      models: 'models',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      securityId: 'string',
      decision: 'string',
      scenes: { 'type': 'array', 'itemType': RiskScene },
      strategies: { 'type': 'array', 'itemType': RiskStrategy },
      models: { 'type': 'array', 'itemType': RiskModel },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllSignTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合同类型，如果不传则返回所有
  contractType?: string;
  // 商户统一社会信用代码，SIT环境，非融必填
  merchantId?: string;
  // ● FINANCE 融资
  // ● NON_FINANCE 非融资
  fundType?: string;
  // 查询融资类型时，需要传入资方统一社会信用代码
  fundId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      contractType: 'contract_type',
      merchantId: 'merchant_id',
      fundType: 'fund_type',
      fundId: 'fund_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      contractType: 'string',
      merchantId: 'string',
      fundType: 'string',
      fundId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllSignTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // List<Object>格式，详细参考：
  // [
  //         {
  //             "templateCode": "TEST_001",
  //             "tenantId": "BIPCCOQY",
  //             "agreementType": "SERVICE_LEASE",
  //             "fileName": "测试模板之协议签署证明",
  //             "templateId": "f28038577d664015bfc1034c4a125121",
  //             "fieldArgs": "{\"sceneName\":\"测试协议合同签署\",\"title\":\"这是一份证明协议\"}",
  //             "userPos": "[{\"required\":true,\"posPage\":\"1\",\"posX\":\"162.44\",\"posY\":\"425\"}]",
  //             "orgPos": "[{\"required\":true,\"posPage\":\"1\",\"posX\":\"449.99\",\"posY\":\"420.03\"}]"
  //         }
  //     ]
  templateList?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      templateList: 'template_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      templateList: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitSignFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderId: string;
  // CRED_PSN_CH_IDCARD： 大陆身份证
  // CRED_PSN_CH_TWCARD：台湾来往大陆通行证
  // CRED_PSN_CH_MACAO"：澳门来往大陆通行证
  // CRED_PSN_CH_HONGKONG：香港来往大陆通行证
  // CRED_PSN_PASSPORT：护照
  userIdType: string;
  // 用户证件号，需要采用RSA加密传输
  userIdNumber: string;
  // 姓名，需要采用RSA加密传输
  userName: string;
  // 用户手机号，可不传；传的话需要采用RSA加密传输
  userMobile?: string;
  // 用户的电子邮箱，可不传；传的话需要采用RSA加密传输
  userEmail?: string;
  // 签署有效期，时间戳，例如：new Date().getTime()
  signValidity?: string;
  // 1-短信；2-邮件
  flowNotifyType?: string;
  // 业务场景，电子合同签署协议的时候的标题
  businessScene: string;
  // 签署完成跳转链接
  signedRedirectUrl?: string;
  // 签署的电子合同模板信息，List<Object>的JSON格式，Object如下：
  // {
  // templateId:__, // String格式
  // templateArgs: {
  //     "模板参数key":"模板参数值", // 必须为String
  //   }
  // }
  templateList: string;
  // 用户的支付宝uid
  alipayUserId?: string;
  // 公司名称
  merchantName: string;
  // 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
  merchantTag?: string;
  // 商户需要盖的印章ID
  merchantSealId?: string;
  // 电子合同签署顺序，如果只有1方企业签署，传入1即可。如果是多方，并且需要设置签署顺序，则需要将这个值以及thirdSigner中的signOrder做一个签署顺序。
  merchantSignOrder?: number;
  // CRED_ORG_USCC：统一社会信用代码，CRED_ORG_REGCODE：工商注册号，只支持这两个值
  merchantIdType: string;
  // 商户证件号，需要采用RSA加密传输
  merchantIdNumber: string;
  // 法人姓名，需要RSA加密传输
  merchantLegalName?: string;
  // 法人证件号，需要采用RSA加密传输
  merchantLegalIdNumber?: string;
  // 多方签署的其他参与方的签署信息，json的array格式，参考：[{"tag":"zf_a","orgName":"上海网络科技有限公司","orgIdType":"CRED_ORG_REGCODE","orgIdNumber":"12098760923","orgLegalName":"王大浪","orgLegalIdNumber":"107120196708289012"}]，其中：orgIdNumber、orgLegalName、orgLegalIdNumber需要加密传输。
  thirdSigner?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      userIdType: 'user_id_type',
      userIdNumber: 'user_id_number',
      userName: 'user_name',
      userMobile: 'user_mobile',
      userEmail: 'user_email',
      signValidity: 'sign_validity',
      flowNotifyType: 'flow_notify_type',
      businessScene: 'business_scene',
      signedRedirectUrl: 'signed_redirect_url',
      templateList: 'template_list',
      alipayUserId: 'alipay_user_id',
      merchantName: 'merchant_name',
      merchantTag: 'merchant_tag',
      merchantSealId: 'merchant_seal_id',
      merchantSignOrder: 'merchant_sign_order',
      merchantIdType: 'merchant_id_type',
      merchantIdNumber: 'merchant_id_number',
      merchantLegalName: 'merchant_legal_name',
      merchantLegalIdNumber: 'merchant_legal_id_number',
      thirdSigner: 'third_signer',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      userIdType: 'string',
      userIdNumber: 'string',
      userName: 'string',
      userMobile: 'string',
      userEmail: 'string',
      signValidity: 'string',
      flowNotifyType: 'string',
      businessScene: 'string',
      signedRedirectUrl: 'string',
      templateList: 'string',
      alipayUserId: 'string',
      merchantName: 'string',
      merchantTag: 'string',
      merchantSealId: 'string',
      merchantSignOrder: 'number',
      merchantIdType: 'string',
      merchantIdNumber: 'string',
      merchantLegalName: 'string',
      merchantLegalIdNumber: 'string',
      thirdSigner: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitSignFlowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签署合同单号
  signNo?: string;
  // 电子签署流程ID
  flowId?: string;
  // 签署用户ID
  accountId?: string;
  // 签署附加信息，用于获取签署链接等。JSON格式的字符串。
  signInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      signNo: 'sign_no',
      flowId: 'flow_id',
      accountId: 'account_id',
      signInfo: 'sign_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      signNo: 'string',
      flowId: 'string',
      accountId: 'string',
      signInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSignFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 签署合同单号
  signNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      signNo: 'sign_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      signNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSignFlowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签署合同单号
  signNo?: string;
  // 订单号
  orderId?: string;
  // 签署用户ID
  accountId?: string;
  // 状态：DRAFT - 草稿； SIGNING - 签署中； FINISH - 签署完成；UNDO - 撤销； TERMINATE - 终止； EXPIRE - 过期； REJECTED - 拒签； CANCELLED - 解约
  // 
  status?: string;
  // 签署流程ID
  flowId?: string;
  // 签署文件列表，参考：
  // _[{"fileItemNo":"10090801000001699892007791144960","agreementType":"COMMON","fileName":"xxx合同","fileSize":228530,"signAccountId":"fe2eb3814c4e49edba2bc012f790771f","fileId":"2c7684461a0f4d33bc02f6d77f7b3937","downloadUrl":"https://dev.oss-cn-shanghai.aliyuncs.com/ag/ord/xxx/16939683744483057_%E6%B5%8B%E8%AF%95%E6%A8%A1%E6%9D%BF%E4%B9%8B%E5%8D%8F%E8%AE%AE%E7%AD%BE%E7%BD%B2%E8%AF%81%E6%98%8E.pdf?Expires=1693971989&OSSAccessKeyId=LTAI5tR3hHiaXPAh8YsY9Dce&Signature=i%2FfAgDem33guI%2F0KjIFj24XZNCc%3D"}]_
  docList?: string;
  // 业务场景，主要用于签署合同的标题描述
  businessScene?: string;
  // 签署合同中的订单的uid。
  alipayUserId?: string;
  // 签署扩展信息，用于获取签署链接等。JSON格式字符串。
  signInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      signNo: 'sign_no',
      orderId: 'order_id',
      accountId: 'account_id',
      status: 'status',
      flowId: 'flow_id',
      docList: 'doc_list',
      businessScene: 'business_scene',
      alipayUserId: 'alipay_user_id',
      signInfo: 'sign_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      signNo: 'string',
      orderId: 'string',
      accountId: 'string',
      status: 'string',
      flowId: 'string',
      docList: 'string',
      businessScene: 'string',
      alipayUserId: 'string',
      signInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthSignFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 签署的电子合同ID
  signNo: string;
  // 签署区域的tag，和发起签署流程的机构的tag对应。
  tag?: string;
  // 电子合同签署服务返回的biz_flow_id
  bizFlowId?: string;
  // 电子合同签署服务的返回的account_id
  accountId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      signNo: 'sign_no',
      tag: 'tag',
      bizFlowId: 'biz_flow_id',
      accountId: 'account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      signNo: 'string',
      tag: 'string',
      bizFlowId: 'string',
      accountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthSignFlowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签署最后落签的签署区域id列表
  signFieldIds?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      signFieldIds: 'sign_field_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      signFieldIds: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitFrontSignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户的订单号
  orderId: string;
  // CRED_PSN_CH_IDCARD： 大陆身份证 
  // CRED_PSN_CH_TWCARD：台湾来往大陆通行证 
  // CRED_PSN_CH_MACAO"：澳门来往大陆通行证 
  // CRED_PSN_CH_HONGKONG：香港来往大陆通行证 
  // CRED_PSN_PASSPORT：护照
  userIdType: string;
  // 用户证件号，需要采用RSA加密传输
  userIdNumber: string;
  // 姓名，需要采用RSA加密传输
  // 
  userName: string;
  // 用户手机号，可不传；传的话需要采用RSA加密传输
  // 
  userMobile?: string;
  // 用户的电子邮箱，可不传；传的话需要采用RSA加密传输
  // 
  userEmail?: string;
  // 签署有效期，时间戳，例如：new Date().getTime()
  signValidity?: string;
  // 1-短信；2-邮件
  flowNotifyType?: string;
  // 业务场景，电子合同签署协议的时候的标题
  // 
  businessScene: string;
  // 签署完成跳转链接
  // 
  signedRedirectUrl?: string;
  // 签署的电子合同模板信息，List<Object>的JSON格式，Object如下： { templateId:__, // String格式 templateArgs: { "模板参数key":"模板参数值", // 必须为String } }
  templateList: string;
  // 用户的支付宝uid
  alipayUserId?: string;
  // 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
  merchantName: string;
  // 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
  merchantTag?: string;
  // 电子合同签署顺序，如果只有1方企业签署，传入1即可。如果是多方，并且需要设置签署顺序，则需要将这个值以及thirdSigner中的signOrder做一个签署顺序。
  merchantSignOrder?: number;
  // 商户需要盖的印章ID
  merchantSealId?: string;
  // CRED_ORG_USCC：统一社会信用代码，
  // CRED_ORG_REGCODE：工商注册号，
  // 只支持这两个值
  merchantIdType: string;
  // 商户证件号，需要采用RSA加密传输
  merchantIdNumber: string;
  // 法人姓名，需要RSA加密传输
  // 
  merchantLegalName?: string;
  // 法人证件号，需要采用RSA加密传输
  // 
  merchantLegalIdNumber?: string;
  // 多方签署的其他参与方的签署信息，json的array格式，参考：[{"tag":"zf_a","orgName":"上海网络科技有限公司","orgIdType":"CRED_ORG_REGCODE","orgIdNumber":"12098760923","orgLegalName":"王大浪","orgLegalIdNumber":"107120196708289012","sealIds":["12b2317-0000-3333-2222-ec087dc97d8b"]}]，其中：orgIdNumber、orgLegalName、orgLegalIdNumber需要加密传输。
  thirdSigner?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      userIdType: 'user_id_type',
      userIdNumber: 'user_id_number',
      userName: 'user_name',
      userMobile: 'user_mobile',
      userEmail: 'user_email',
      signValidity: 'sign_validity',
      flowNotifyType: 'flow_notify_type',
      businessScene: 'business_scene',
      signedRedirectUrl: 'signed_redirect_url',
      templateList: 'template_list',
      alipayUserId: 'alipay_user_id',
      merchantName: 'merchant_name',
      merchantTag: 'merchant_tag',
      merchantSignOrder: 'merchant_sign_order',
      merchantSealId: 'merchant_seal_id',
      merchantIdType: 'merchant_id_type',
      merchantIdNumber: 'merchant_id_number',
      merchantLegalName: 'merchant_legal_name',
      merchantLegalIdNumber: 'merchant_legal_id_number',
      thirdSigner: 'third_signer',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      userIdType: 'string',
      userIdNumber: 'string',
      userName: 'string',
      userMobile: 'string',
      userEmail: 'string',
      signValidity: 'string',
      flowNotifyType: 'string',
      businessScene: 'string',
      signedRedirectUrl: 'string',
      templateList: 'string',
      alipayUserId: 'string',
      merchantName: 'string',
      merchantTag: 'string',
      merchantSignOrder: 'number',
      merchantSealId: 'string',
      merchantIdType: 'string',
      merchantIdNumber: 'string',
      merchantLegalName: 'string',
      merchantLegalIdNumber: 'string',
      thirdSigner: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitFrontSignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签署合同单号
  // 
  signNo?: string;
  // 电子签署流程ID
  // 
  flowId?: string;
  // 签署用户ID
  // 
  accountId?: string;
  // 签署扩展信息，用于获取签署链接等。JSON格式字符串。
  signInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      signNo: 'sign_no',
      flowId: 'flow_id',
      accountId: 'account_id',
      signInfo: 'sign_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      signNo: 'string',
      flowId: 'string',
      accountId: 'string',
      signInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadSignFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 	
  // 订单所属商户的统一社会信用代码
  merchantId: string;
  // 	
  // 商户的订单号
  orderId: string;
  // 签署合同单号
  signNo: string;
  // 模板id
  templateId: string;
  // 合同签署时间，格式为yyyy-MM-dd HH:mm:ss
  signTime: string;
  // 上传的pdf文件，需要以.pdf后缀结尾
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantId: 'merchant_id',
      orderId: 'order_id',
      signNo: 'sign_no',
      templateId: 'template_id',
      signTime: 'sign_time',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantId: 'string',
      orderId: 'string',
      signNo: 'string',
      templateId: 'string',
      signTime: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadSignFlowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文件编号
  fileItemNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      fileItemNo: 'file_item_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      fileItemNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadSignTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单所属商户的统一社会信用代码
  merchantId: string;
  // 合同类型
  contractType: string;
  // 模板类型
  agreementType: string;
  // 签署区坐标配置
  posConf: string;
  // 模板参数
  templateArgs?: string;
  // 上传的pdf文件，需要以.pdf后缀结尾
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantId: 'merchant_id',
      contractType: 'contract_type',
      agreementType: 'agreement_type',
      posConf: 'pos_conf',
      templateArgs: 'template_args',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantId: 'string',
      contractType: 'string',
      agreementType: 'string',
      posConf: 'string',
      templateArgs: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadSignTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 上传模板后返回的模板id
  templateId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      templateId: 'template_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      templateId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadSignCreditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号类型
  orderNoType: string;
  // 订单号，或资产包号
  orderNo: string;
  // 凭证合同类型
  creditType: string;
  // 凭证名称
  creditName?: string;
  // 文本类型
  contentType: string;
  // 文本下载链接，如果类型是FILE则必填
  fileUrl?: string;
  // 内容数据，格式为JSON类型文本，如果类型是JSON_TEXT则必填
  content?: string;
  // 商户统一社会信用代码
  merchantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNoType: 'order_no_type',
      orderNo: 'order_no',
      creditType: 'credit_type',
      creditName: 'credit_name',
      contentType: 'content_type',
      fileUrl: 'file_url',
      content: 'content',
      merchantId: 'merchant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNoType: 'string',
      orderNo: 'string',
      creditType: 'string',
      creditName: 'string',
      contentType: 'string',
      fileUrl: 'string',
      content: 'string',
      merchantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadSignCreditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 凭证内容id
  contentId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      contentId: 'content_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      contentId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySignCreditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号类型
  orderNoType: string;
  // 订单号，或资产包号
  orderNo: string;
  // 商户统一社会信用代码
  merchantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNoType: 'order_no_type',
      orderNo: 'order_no',
      merchantId: 'merchant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNoType: 'string',
      orderNo: 'string',
      merchantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySignCreditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 内容信息
  contentInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      contentInfo: 'content_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      contentInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncTradeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务字段，具体传入信息需参考文档
  // 传入格式需为json字符串
  bizContent: string;
  // 接口执行类型
  // 
  type: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncTradeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // resp信息
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTradeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询信息，必须遵循json字符串格式
  bizContent: string;
  // 接口类型
  type: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTradeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回的查询值
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncFrontTradeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 类型
  // 1. orderFullInfo ， 订单所有信息同步
  type: string;
  // json.toString
  bizContent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      type: 'type',
      bizContent: 'biz_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      type: 'string',
      bizContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncFrontTradeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回信息
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncTradeFinanceloanapplyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 
  orderId?: string;
  // 订单所属商户的社会信用代码
  merchantId: string;
  // 融资放款申请接口
  merchantName: string;
  // 资方的社会信用代码
  fundId?: string;
  // 类型
  // ● 默认为：ORDER, 单订单申请
  // ● PACKAGE_ORDER , 资产包订单模式
  type?: string;
  // 资产包id
  // type = PACKAGE_ORDER ， 必填
  assetPackageId?: string;
  // type = PACKAGE_ORDER ， 必填
  // 
  // ● APPEND: 追加订单列表
  // ● FINIISH : 结束
  stage?: string;
  // 订单id列表的jsonArray
  orderIdList?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      merchantName: 'merchant_name',
      fundId: 'fund_id',
      type: 'type',
      assetPackageId: 'asset_package_id',
      stage: 'stage',
      orderIdList: 'order_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
      merchantName: 'string',
      fundId: 'string',
      type: 'string',
      assetPackageId: 'string',
      stage: 'string',
      orderIdList: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncTradeFinanceloanapplyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单id
  orderId?: string;
  // 订单所属商户的社会信用代码
  merchantId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
      merchantId: 'merchant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
      merchantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTradeMerchantfulfillmentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 订单所属商户的社会信用代码
  merchantId: string;
  // 履约期数，不填返回为所有履约期的履约信息
  // - 如果有填写，返回当前期数的履约信息，列表长度为1
  termIdx?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      termIdx: 'term_idx',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
      termIdx: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTradeMerchantfulfillmentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回值为 「MerchantFulfillmentResp」的json字符串
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTradeUserperformanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 商家公司社会信用代码
  merchantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTradeUserperformanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 「UserPerformanceInfo」的json字符串
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTradeMerchantperformanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 订单所属商户的社会信用代码
  merchantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTradeMerchantperformanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 「MerchantPerformanceInfo」的json字符串
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTradeUserpromiseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 商家社会信用代码
  merchantId: string;
  // 修改的用户履约期数
  termIdx: number;
  // 更新后的租金，单位为分
  // 1234=12.34元
  updatedRentalMoney: number;
  // 调整原因，枚举
  // ● A01 : 违章罚金
  // ● A02 : 水电煤费用
  reason: string;
  // 调整说明，本说明同步到支付宝账户备注中，需准确填写
  desc: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      termIdx: 'term_idx',
      updatedRentalMoney: 'updated_rental_money',
      reason: 'reason',
      desc: 'desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
      termIdx: 'number',
      updatedRentalMoney: 'number',
      reason: 'string',
      desc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTradeUserpromiseResponse extends $tea.Model {
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

export class SyncFrontIndirectorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务参数,json.toString
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

export class SyncFrontIndirectorderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回值，json字符串
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncTradeIndirectorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务参数,json.toString
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

export class SyncTradeIndirectorderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回业务参数，json.toString
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateWithholdSignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 长度不可超过50
  orderId: string;
  // 支付宝商户id，使用签约能力前时候进行向平台申请
  alipayMerchantId?: string;
  // 支付宝商户名称，会展示在支付并签约界面
  alipayMerchantName?: string;
  // 支付宝商户服务名称，会展示在支付并签约界面
  alipayMerchantServiceName?: string;
  // 支付宝商户服务描述，会展示在支付并签约界面
  alipayMerchantServiceDescription?: string;
  // 支付宝uid，非必填
  alipayUserId?: string;
  // 签约完成后的跳转地址，注意只有在h5跳转场景下才有意义其他场景通过方法回调处理业务；无需使用此字段。
  returnUrl?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      alipayMerchantId: 'alipay_merchant_id',
      alipayMerchantName: 'alipay_merchant_name',
      alipayMerchantServiceName: 'alipay_merchant_service_name',
      alipayMerchantServiceDescription: 'alipay_merchant_service_description',
      alipayUserId: 'alipay_user_id',
      returnUrl: 'return_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      alipayMerchantId: 'string',
      alipayMerchantName: 'string',
      alipayMerchantServiceName: 'string',
      alipayMerchantServiceDescription: 'string',
      alipayUserId: 'string',
      returnUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateWithholdSignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签约字符串
  signStr?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      signStr: 'sign_str',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      signStr: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWithholdSignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 长度不可超过50
  orderId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWithholdSignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 协议当前状态
  // 1. UNSIGNED：未签约
  // 2. SIGNED：已签约；
  // 3. TERMINATED：已解约
  status?: string;
  // 协议签署时间
  signTime?: string;
  // 协议生效时间
  validTime?: string;
  // 协议失效时间
  invalidTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      signTime: 'sign_time',
      validTime: 'valid_time',
      invalidTime: 'invalid_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      signTime: 'string',
      validTime: 'string',
      invalidTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnbindWithholdSignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 长度不可超过50
  orderId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnbindWithholdSignResponse extends $tea.Model {
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

export class CancelWithholdPlanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当发现跨天继续提交
  orderId: string;
  // 取消原因
  // RENTING_OUT:退租
  // RENTING_AND_RESALE:租转售
  // 
  // 
  cancelReason: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      cancelReason: 'cancel_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      cancelReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelWithholdPlanResponse extends $tea.Model {
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

export class RepayWithholdPlanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 长度不可超过50
  orderId: string;
  // 第几期
  periodNum: number;
  // 其他方式还款的时间
  gmtPay: string;
  // 取消订单某一期代扣计划中以其他方式还款金额，单位为分
  payOffAmount: number;
  // 变更其他方式还款
  // WECHAT:微信;
  // BANK:银行
  // ALIPAY:支付宝
  payOffType?: string;
  // 通过其他方式还款单号;例如银行流水号或微信流水号
  payOffNo?: string;
  // 其他方式还款银行名称，还款方式为银行时必填
  payOffBankName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      periodNum: 'period_num',
      gmtPay: 'gmt_pay',
      payOffAmount: 'pay_off_amount',
      payOffType: 'pay_off_type',
      payOffNo: 'pay_off_no',
      payOffBankName: 'pay_off_bank_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      periodNum: 'number',
      gmtPay: 'string',
      payOffAmount: 'number',
      payOffType: 'string',
      payOffNo: 'string',
      payOffBankName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RepayWithholdPlanResponse extends $tea.Model {
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

export class RetryWithholdPlanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 长度不可超过50
  orderId: string;
  // 第几期
  periodNum: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      periodNum: 'period_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      periodNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryWithholdPlanResponse extends $tea.Model {
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

export class ConfirmWithholdSignasyncunsignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 操作动作
  // 同意：AGREE
  // 拒绝：REFUSE
  operate: string;
  // 拒绝原因码,商户拒绝时必填。
  // USER_OWE_MONEY：用户账户存在欠费订单
  // USER_IN_SERVICE：用户有进行的订单
  refuseReasonCode?: string;
  // 用户欠款金额，单位为分
  // refuse_reason_code=USER_OWE_MONEY时必填
  userOweMoney?: number;
  // 用户进行中的服务
  // refuse_reason_code=USER_IN_SERVICE时必填
  userInService?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      operate: 'operate',
      refuseReasonCode: 'refuse_reason_code',
      userOweMoney: 'user_owe_money',
      userInService: 'user_in_service',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      operate: 'string',
      refuseReasonCode: 'string',
      userOweMoney: 'number',
      userInService: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmWithholdSignasyncunsignResponse extends $tea.Model {
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

export class CreateWithholdActivepayRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 长度不可超过50
  orderId: string;
  // 第几期
  periodNum: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      periodNum: 'period_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      periodNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateWithholdActivepayResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 支付宝支付订单号，用于拉起主动支付页面
  tradeNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tradeNo: 'trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tradeNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWithholdActivepayRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 长度不可超过50
  orderId: string;
  // 第几期
  periodNum: number;
  // 支付宝支付订单号，当传递此单号时，只会返回当前单据
  tradeNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      periodNum: 'period_num',
      tradeNo: 'trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      periodNum: 'number',
      tradeNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWithholdActivepayResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前支付单
  currentOrder?: ActivePayOrder;
  // 主动支付单列表，当不通过trade_no查询时有值
  orders?: ActivePayOrder[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      currentOrder: 'current_order',
      orders: 'orders',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      currentOrder: ActivePayOrder,
      orders: { 'type': 'array', 'itemType': ActivePayOrder },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelWithholdActivepayRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 长度不可超过50
  orderId: string;
  // 第几期
  periodNum: number;
  // 支付宝支付订单号，当传递此单号时，只会取消指定单据号，不传递时取消当前代扣
  tradeNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      periodNum: 'period_num',
      tradeNo: 'trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      periodNum: 'number',
      tradeNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelWithholdActivepayResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 取消的单号
  tradeNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tradeNo: 'trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tradeNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateWithholdRefundRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 第几期
  // 针对用户履约的第几期进行退款申请
  periodNum: number;
  // 外部系统传入的退款请求号
  refundRequestNo: string;
  // 本次请求的退款金额，单位为分
  // 1234=12.34元
  refundMoney: number;
  // 退款原因
  refundReason?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      periodNum: 'period_num',
      refundRequestNo: 'refund_request_no',
      refundMoney: 'refund_money',
      refundReason: 'refund_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      periodNum: 'number',
      refundRequestNo: 'string',
      refundMoney: 'number',
      refundReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateWithholdRefundResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 外部系统传入的退款请求号
  refundRequestNo?: string;
  // ACCEPT : 受理成功
  status?: string;
  // 请求支付宝的退款单据号
  refundOrderNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      refundRequestNo: 'refund_request_no',
      status: 'status',
      refundOrderNo: 'refund_order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      refundRequestNo: 'string',
      status: 'string',
      refundOrderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWithholdRefundRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 几期
  // 针对用户履约的第几期进行退款申请
  periodNum: number;
  // 外部系统传入的退款请求号
  refundRequestNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      periodNum: 'period_num',
      refundRequestNo: 'refund_request_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      periodNum: 'number',
      refundRequestNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWithholdRefundResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 外部系统传入的退款请求号
  refundRequestNo?: string;
  // 请求支付宝的退款单据号
  refundOrderNo?: string;
  // 退款请求状态
  // ● ACCEPT: 受理成功
  // ● PENDING: 需人工介入
  // ● SUCCESS: 成功
  // ● FAILED : 失败
  status?: string;
  // 退款失败原因
  refundErrorMsg?: string;
  // 本笔交易总退款金额，单位为分
  // 12300=123元
  totalRefundAmount?: number;
  // 本次退款申请的实际退款金额，单位为分
  // 12300=123元
  sendBackAmount?: number;
  // 实际退款时间,13位时间戳（毫秒）
  gmtRefundPay?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      refundRequestNo: 'refund_request_no',
      refundOrderNo: 'refund_order_no',
      status: 'status',
      refundErrorMsg: 'refund_error_msg',
      totalRefundAmount: 'total_refund_amount',
      sendBackAmount: 'send_back_amount',
      gmtRefundPay: 'gmt_refund_pay',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      refundRequestNo: 'string',
      refundOrderNo: 'string',
      status: 'string',
      refundErrorMsg: 'string',
      totalRefundAmount: 'number',
      sendBackAmount: 'number',
      gmtRefundPay: 'number',
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
          sdk_version: "1.8.81",
          _prod_code: "ATO",
          _prod_channel: "undefined",
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
   * Description: 分账流水同步
   * Summary: 【仅测试环境生效】分账流水同步
   */
  async syncFundSplitting(request: SyncFundSplittingRequest): Promise<SyncFundSplittingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncFundSplittingEx(request, headers, runtime);
  }

  /**
   * Description: 分账流水同步
   * Summary: 【仅测试环境生效】分账流水同步
   */
  async syncFundSplittingEx(request: SyncFundSplittingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncFundSplittingResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncFundSplittingResponse>(await this.doRequest("1.0", "antchain.ato.fund.splitting.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncFundSplittingResponse({}));
  }

  /**
   * Description: 提供给融资资金方，用以订单融资结果同步
   * Summary: 【废弃】订单融资结果同步
   */
  async syncFundOrderfinancial(request: SyncFundOrderfinancialRequest): Promise<SyncFundOrderfinancialResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncFundOrderfinancialEx(request, headers, runtime);
  }

  /**
   * Description: 提供给融资资金方，用以订单融资结果同步
   * Summary: 【废弃】订单融资结果同步
   */
  async syncFundOrderfinancialEx(request: SyncFundOrderfinancialRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncFundOrderfinancialResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncFundOrderfinancialResponse>(await this.doRequest("1.0", "antchain.ato.fund.orderfinancial.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncFundOrderfinancialResponse({}));
  }

  /**
   * Description: 同步租赁订单的代扣协议
   * Summary: 【仅测试环境生效】同步租赁订单的代扣协议
   */
  async syncFundWithholdingcontract(request: SyncFundWithholdingcontractRequest): Promise<SyncFundWithholdingcontractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncFundWithholdingcontractEx(request, headers, runtime);
  }

  /**
   * Description: 同步租赁订单的代扣协议
   * Summary: 【仅测试环境生效】同步租赁订单的代扣协议
   */
  async syncFundWithholdingcontractEx(request: SyncFundWithholdingcontractRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncFundWithholdingcontractResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncFundWithholdingcontractResponse>(await this.doRequest("1.0", "antchain.ato.fund.withholdingcontract.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncFundWithholdingcontractResponse({}));
  }

  /**
   * Description: 资方回传一条订单还款履约信息
   * Summary: 【仅测试环境生效】同步订单还款履约信息
   */
  async syncFundOrderfulfillment(request: SyncFundOrderfulfillmentRequest): Promise<SyncFundOrderfulfillmentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncFundOrderfulfillmentEx(request, headers, runtime);
  }

  /**
   * Description: 资方回传一条订单还款履约信息
   * Summary: 【仅测试环境生效】同步订单还款履约信息
   */
  async syncFundOrderfulfillmentEx(request: SyncFundOrderfulfillmentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncFundOrderfulfillmentResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncFundOrderfulfillmentResponse>(await this.doRequest("1.0", "antchain.ato.fund.orderfulfillment.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncFundOrderfulfillmentResponse({}));
  }

  /**
   * Description: 获取订单的履约信息
   * Summary: 【仅测试环境生效】获取订单的履约信息
   */
  async getFundOrderfulfillment(request: GetFundOrderfulfillmentRequest): Promise<GetFundOrderfulfillmentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getFundOrderfulfillmentEx(request, headers, runtime);
  }

  /**
   * Description: 获取订单的履约信息
   * Summary: 【仅测试环境生效】获取订单的履约信息
   */
  async getFundOrderfulfillmentEx(request: GetFundOrderfulfillmentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetFundOrderfulfillmentResponse> {
    Util.validateModel(request);
    return $tea.cast<GetFundOrderfulfillmentResponse>(await this.doRequest("1.0", "antchain.ato.fund.orderfulfillment.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetFundOrderfulfillmentResponse({}));
  }

  /**
   * Description: 用于资方将盖章后的合同文件上传
   * Summary: 资方合同文件上传接口
   */
  async uploadFundFlow(request: UploadFundFlowRequest): Promise<UploadFundFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadFundFlowEx(request, headers, runtime);
  }

  /**
   * Description: 用于资方将盖章后的合同文件上传
   * Summary: 资方合同文件上传接口
   */
  async uploadFundFlowEx(request: UploadFundFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadFundFlowResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.ato.fund.flow.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadFundFlowResponse = new UploadFundFlowResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadFundFlowResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
    }

    Util.validateModel(request);
    return $tea.cast<UploadFundFlowResponse>(await this.doRequest("1.0", "antchain.ato.fund.flow.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadFundFlowResponse({}));
  }

  /**
   * Description: 获取商户签署后的合同文件，用于资方签署落章
   * Summary: 资方合同文件获取接口
   */
  async getFundFlow(request: GetFundFlowRequest): Promise<GetFundFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getFundFlowEx(request, headers, runtime);
  }

  /**
   * Description: 获取商户签署后的合同文件，用于资方签署落章
   * Summary: 资方合同文件获取接口
   */
  async getFundFlowEx(request: GetFundFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetFundFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<GetFundFlowResponse>(await this.doRequest("1.0", "antchain.ato.fund.flow.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetFundFlowResponse({}));
  }

  /**
   * Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
   * Summary: 资方合同签署状态通知
   */
  async refuseFundFlow(request: RefuseFundFlowRequest): Promise<RefuseFundFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.refuseFundFlowEx(request, headers, runtime);
  }

  /**
   * Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
   * Summary: 资方合同签署状态通知
   */
  async refuseFundFlowEx(request: RefuseFundFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RefuseFundFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<RefuseFundFlowResponse>(await this.doRequest("1.0", "antchain.ato.fund.flow.refuse", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RefuseFundFlowResponse({}));
  }

  /**
   * Description: 资方调用，授权通过e签宝进行落签
   * Summary: 资方e签宝落签接口
   */
  async authFundFlow(request: AuthFundFlowRequest): Promise<AuthFundFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authFundFlowEx(request, headers, runtime);
  }

  /**
   * Description: 资方调用，授权通过e签宝进行落签
   * Summary: 资方e签宝落签接口
   */
  async authFundFlowEx(request: AuthFundFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthFundFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthFundFlowResponse>(await this.doRequest("1.0", "antchain.ato.fund.flow.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthFundFlowResponse({}));
  }

  /**
   * Description: 资方调用，取消商户履约计划
   * Summary: 商户履约计划取消
   */
  async cancelFundPlan(request: CancelFundPlanRequest): Promise<CancelFundPlanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelFundPlanEx(request, headers, runtime);
  }

  /**
   * Description: 资方调用，取消商户履约计划
   * Summary: 商户履约计划取消
   */
  async cancelFundPlanEx(request: CancelFundPlanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelFundPlanResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelFundPlanResponse>(await this.doRequest("1.0", "antchain.ato.fund.plan.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelFundPlanResponse({}));
  }

  /**
   * Description: 通知回调
   * Summary: 通知回调
   */
  async callbackFundNotify(request: CallbackFundNotifyRequest): Promise<CallbackFundNotifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackFundNotifyEx(request, headers, runtime);
  }

  /**
   * Description: 通知回调
   * Summary: 通知回调
   */
  async callbackFundNotifyEx(request: CallbackFundNotifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackFundNotifyResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackFundNotifyResponse>(await this.doRequest("1.0", "antchain.ato.fund.notify.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackFundNotifyResponse({}));
  }

  /**
   * Description: 商户还款承诺同步
   * Summary: 商户还款承诺同步
   */
  async syncFundMerchantpromise(request: SyncFundMerchantpromiseRequest): Promise<SyncFundMerchantpromiseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncFundMerchantpromiseEx(request, headers, runtime);
  }

  /**
   * Description: 商户还款承诺同步
   * Summary: 商户还款承诺同步
   */
  async syncFundMerchantpromiseEx(request: SyncFundMerchantpromiseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncFundMerchantpromiseResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncFundMerchantpromiseResponse>(await this.doRequest("1.0", "antchain.ato.fund.merchantpromise.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncFundMerchantpromiseResponse({}));
  }

  /**
   * Description: 融资放款结果同步
   * Summary: 融资放款结果同步
   */
  async syncFundFinanceloanresults(request: SyncFundFinanceloanresultsRequest): Promise<SyncFundFinanceloanresultsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncFundFinanceloanresultsEx(request, headers, runtime);
  }

  /**
   * Description: 融资放款结果同步
   * Summary: 融资放款结果同步
   */
  async syncFundFinanceloanresultsEx(request: SyncFundFinanceloanresultsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncFundFinanceloanresultsResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncFundFinanceloanresultsResponse>(await this.doRequest("1.0", "antchain.ato.fund.financeloanresults.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncFundFinanceloanresultsResponse({}));
  }

  /**
   * Description: 查询用户承诺
   * Summary: 查询用户承诺
   */
  async getFundUserpromise(request: GetFundUserpromiseRequest): Promise<GetFundUserpromiseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getFundUserpromiseEx(request, headers, runtime);
  }

  /**
   * Description: 查询用户承诺
   * Summary: 查询用户承诺
   */
  async getFundUserpromiseEx(request: GetFundUserpromiseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetFundUserpromiseResponse> {
    Util.validateModel(request);
    return $tea.cast<GetFundUserpromiseResponse>(await this.doRequest("1.0", "antchain.ato.fund.userpromise.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetFundUserpromiseResponse({}));
  }

  /**
   * Description: 用户履约信息查询（履约承诺+履约记录）
   * Summary: 用户履约信息查询（履约承诺+履约记录）
   */
  async getFundUserperformance(request: GetFundUserperformanceRequest): Promise<GetFundUserperformanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getFundUserperformanceEx(request, headers, runtime);
  }

  /**
   * Description: 用户履约信息查询（履约承诺+履约记录）
   * Summary: 用户履约信息查询（履约承诺+履约记录）
   */
  async getFundUserperformanceEx(request: GetFundUserperformanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetFundUserperformanceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetFundUserperformanceResponse>(await this.doRequest("1.0", "antchain.ato.fund.userperformance.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetFundUserperformanceResponse({}));
  }

  /**
   * Description: 商户履约信息查询（履约承诺+履约记录）
   * Summary: 商户履约信息查询（履约承诺+履约记录）
   */
  async getFundMerchantperformance(request: GetFundMerchantperformanceRequest): Promise<GetFundMerchantperformanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getFundMerchantperformanceEx(request, headers, runtime);
  }

  /**
   * Description: 商户履约信息查询（履约承诺+履约记录）
   * Summary: 商户履约信息查询（履约承诺+履约记录）
   */
  async getFundMerchantperformanceEx(request: GetFundMerchantperformanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetFundMerchantperformanceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetFundMerchantperformanceResponse>(await this.doRequest("1.0", "antchain.ato.fund.merchantperformance.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetFundMerchantperformanceResponse({}));
  }

  /**
   * Description: 资方查询订单详情
   * Summary: 资方查询订单详情
   */
  async getFundOrderfullinfo(request: GetFundOrderfullinfoRequest): Promise<GetFundOrderfullinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getFundOrderfullinfoEx(request, headers, runtime);
  }

  /**
   * Description: 资方查询订单详情
   * Summary: 资方查询订单详情
   */
  async getFundOrderfullinfoEx(request: GetFundOrderfullinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetFundOrderfullinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<GetFundOrderfullinfoResponse>(await this.doRequest("1.0", "antchain.ato.fund.orderfullinfo.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetFundOrderfullinfoResponse({}));
  }

  /**
   * Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
   * Summary: 资方合同文件已上传确认接口
   */
  async notifyFundFlow(request: NotifyFundFlowRequest): Promise<NotifyFundFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.notifyFundFlowEx(request, headers, runtime);
  }

  /**
   * Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
   * Summary: 资方合同文件已上传确认接口
   */
  async notifyFundFlowEx(request: NotifyFundFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<NotifyFundFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<NotifyFundFlowResponse>(await this.doRequest("1.0", "antchain.ato.fund.flow.notify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new NotifyFundFlowResponse({}));
  }

  /**
   * Description: 资方资产凭证上传，可以是文本或文件
   * Summary: 资方资产凭证上传
   */
  async uploadFundCredit(request: UploadFundCreditRequest): Promise<UploadFundCreditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadFundCreditEx(request, headers, runtime);
  }

  /**
   * Description: 资方资产凭证上传，可以是文本或文件
   * Summary: 资方资产凭证上传
   */
  async uploadFundCreditEx(request: UploadFundCreditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadFundCreditResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadFundCreditResponse>(await this.doRequest("1.0", "antchain.ato.fund.credit.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadFundCreditResponse({}));
  }

  /**
   * Description: 资方资产凭证查询，需要提供订单号或资产包号
   * Summary: 资方资产凭证查询
   */
  async queryFundCredit(request: QueryFundCreditRequest): Promise<QueryFundCreditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFundCreditEx(request, headers, runtime);
  }

  /**
   * Description: 资方资产凭证查询，需要提供订单号或资产包号
   * Summary: 资方资产凭证查询
   */
  async queryFundCreditEx(request: QueryFundCreditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFundCreditResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFundCreditResponse>(await this.doRequest("1.0", "antchain.ato.fund.credit.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFundCreditResponse({}));
  }

  /**
   * Description: 内部调用,商品信息获取
   * Summary: 商品信息获取
   */
  async getInnerProduct(request: GetInnerProductRequest): Promise<GetInnerProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getInnerProductEx(request, headers, runtime);
  }

  /**
   * Description: 内部调用,商品信息获取
   * Summary: 商品信息获取
   */
  async getInnerProductEx(request: GetInnerProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetInnerProductResponse> {
    Util.validateModel(request);
    return $tea.cast<GetInnerProductResponse>(await this.doRequest("1.0", "antchain.ato.inner.product.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetInnerProductResponse({}));
  }

  /**
   * Description: ato内部服务，客户系统不可访问；租户信息获取
   * Summary: 租户信息获取
   */
  async getInnerTenant(request: GetInnerTenantRequest): Promise<GetInnerTenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getInnerTenantEx(request, headers, runtime);
  }

  /**
   * Description: ato内部服务，客户系统不可访问；租户信息获取
   * Summary: 租户信息获取
   */
  async getInnerTenantEx(request: GetInnerTenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetInnerTenantResponse> {
    Util.validateModel(request);
    return $tea.cast<GetInnerTenantResponse>(await this.doRequest("1.0", "antchain.ato.inner.tenant.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetInnerTenantResponse({}));
  }

  /**
   * Description: 内部接口，客户系统不能调用。上报整单结算计量信息
   * Summary: 上报整单结算计量信息
   */
  async syncInnerMeterforwholeorder(request: SyncInnerMeterforwholeorderRequest): Promise<SyncInnerMeterforwholeorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncInnerMeterforwholeorderEx(request, headers, runtime);
  }

  /**
   * Description: 内部接口，客户系统不能调用。上报整单结算计量信息
   * Summary: 上报整单结算计量信息
   */
  async syncInnerMeterforwholeorderEx(request: SyncInnerMeterforwholeorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncInnerMeterforwholeorderResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncInnerMeterforwholeorderResponse>(await this.doRequest("1.0", "antchain.ato.inner.meterforwholeorder.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncInnerMeterforwholeorderResponse({}));
  }

  /**
   * Description: 内部调用，合同签署计量上报接口
   * Summary: 合同签署计量上报同步接口
   */
  async syncInnerMeterforagsign(request: SyncInnerMeterforagsignRequest): Promise<SyncInnerMeterforagsignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncInnerMeterforagsignEx(request, headers, runtime);
  }

  /**
   * Description: 内部调用，合同签署计量上报接口
   * Summary: 合同签署计量上报同步接口
   */
  async syncInnerMeterforagsignEx(request: SyncInnerMeterforagsignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncInnerMeterforagsignResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncInnerMeterforagsignResponse>(await this.doRequest("1.0", "antchain.ato.inner.meterforagsign.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncInnerMeterforagsignResponse({}));
  }

  /**
   * Description: 内部接口，根据租户查询合同模板列表
   * Summary: 查询模板列表
   */
  async allInnerTemplate(request: AllInnerTemplateRequest): Promise<AllInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allInnerTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 内部接口，根据租户查询合同模板列表
   * Summary: 查询模板列表
   */
  async allInnerTemplateEx(request: AllInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<AllInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllInnerTemplateResponse({}));
  }

  /**
   * Description: 内部接口，根据模板code查询合同模板版本列表
   * Summary: 查询魔法库某一模板版本列表
   */
  async listInnerTemplate(request: ListInnerTemplateRequest): Promise<ListInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listInnerTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 内部接口，根据模板code查询合同模板版本列表
   * Summary: 查询魔法库某一模板版本列表
   */
  async listInnerTemplateEx(request: ListInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<ListInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListInnerTemplateResponse({}));
  }

  /**
   * Description: 内部接口，根据模板code查询指定版本的模板详情
   * Summary: 查询魔法库模板详情
   */
  async detailInnerTemplate(request: DetailInnerTemplateRequest): Promise<DetailInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailInnerTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 内部接口，根据模板code查询指定版本的模板详情
   * Summary: 查询魔法库模板详情
   */
  async detailInnerTemplateEx(request: DetailInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailInnerTemplateResponse({}));
  }

  /**
   * Description: 内部接口，创建魔法库模板
   * Summary: 创建模板
   */
  async createInnerTemplate(request: CreateInnerTemplateRequest): Promise<CreateInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createInnerTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 内部接口，创建魔法库模板
   * Summary: 创建模板
   */
  async createInnerTemplateEx(request: CreateInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateInnerTemplateResponse({}));
  }

  /**
   * Description: 内部接口，保存魔法库模板
   * Summary: 保存魔法库模板
   */
  async saveInnerTemplate(request: SaveInnerTemplateRequest): Promise<SaveInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveInnerTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 内部接口，保存魔法库模板
   * Summary: 保存魔法库模板
   */
  async saveInnerTemplateEx(request: SaveInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveInnerTemplateResponse({}));
  }

  /**
   * Description: 内部接口，保存魔法库模板签署区
   * Summary: 保存魔法库模板签署区
   */
  async saveInnerSignfields(request: SaveInnerSignfieldsRequest): Promise<SaveInnerSignfieldsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveInnerSignfieldsEx(request, headers, runtime);
  }

  /**
   * Description: 内部接口，保存魔法库模板签署区
   * Summary: 保存魔法库模板签署区
   */
  async saveInnerSignfieldsEx(request: SaveInnerSignfieldsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveInnerSignfieldsResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveInnerSignfieldsResponse>(await this.doRequest("1.0", "antchain.ato.inner.signfields.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveInnerSignfieldsResponse({}));
  }

  /**
   * Description: 内部接口，发布魔法库模板
   * Summary: 发布魔法库模板
   */
  async publishInnerTemplate(request: PublishInnerTemplateRequest): Promise<PublishInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.publishInnerTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 内部接口，发布魔法库模板
   * Summary: 发布魔法库模板
   */
  async publishInnerTemplateEx(request: PublishInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PublishInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<PublishInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.publish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PublishInnerTemplateResponse({}));
  }

  /**
   * Description: 内部接口，根据code预览对应魔法库模板
   * Summary: 预览魔法库模板
   */
  async previewInnerTemplate(request: PreviewInnerTemplateRequest): Promise<PreviewInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.previewInnerTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 内部接口，根据code预览对应魔法库模板
   * Summary: 预览魔法库模板
   */
  async previewInnerTemplateEx(request: PreviewInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PreviewInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<PreviewInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.preview", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PreviewInnerTemplateResponse({}));
  }

  /**
   * Description: 内部接口，根据code删除对应魔法库模板
   * Summary: 删除魔法库模板
   */
  async deleteInnerTemplate(request: DeleteInnerTemplateRequest): Promise<DeleteInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteInnerTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 内部接口，根据code删除对应魔法库模板
   * Summary: 删除魔法库模板
   */
  async deleteInnerTemplateEx(request: DeleteInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteInnerTemplateResponse({}));
  }

  /**
   * Description: 内部接口，复制一个魔法库模板
   * Summary: 复制魔法库模板
   */
  async cloneInnerTemplate(request: CloneInnerTemplateRequest): Promise<CloneInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cloneInnerTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 内部接口，复制一个魔法库模板
   * Summary: 复制魔法库模板
   */
  async cloneInnerTemplateEx(request: CloneInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CloneInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<CloneInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.clone", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CloneInnerTemplateResponse({}));
  }

  /**
   * Description: ato文件上传
   * Summary: ato文件上传
   */
  async uploadInnerFile(request: UploadInnerFileRequest): Promise<UploadInnerFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadInnerFileEx(request, headers, runtime);
  }

  /**
   * Description: ato文件上传
   * Summary: ato文件上传
   */
  async uploadInnerFileEx(request: UploadInnerFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadInnerFileResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadInnerFileResponse>(await this.doRequest("1.0", "antchain.ato.inner.file.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadInnerFileResponse({}));
  }

  /**
   * Description: ato文件下载
   * Summary: ato文件下载
   */
  async downloadInnerFile(request: DownloadInnerFileRequest): Promise<DownloadInnerFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.downloadInnerFileEx(request, headers, runtime);
  }

  /**
   * Description: ato文件下载
   * Summary: ato文件下载
   */
  async downloadInnerFileEx(request: DownloadInnerFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DownloadInnerFileResponse> {
    Util.validateModel(request);
    return $tea.cast<DownloadInnerFileResponse>(await this.doRequest("1.0", "antchain.ato.inner.file.download", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DownloadInnerFileResponse({}));
  }

  /**
   * Description: 获取 webofficeURL（透传）
   * Summary: 获取 webofficeURL
   */
  async getInnerTemplateofficeurl(request: GetInnerTemplateofficeurlRequest): Promise<GetInnerTemplateofficeurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getInnerTemplateofficeurlEx(request, headers, runtime);
  }

  /**
   * Description: 获取 webofficeURL（透传）
   * Summary: 获取 webofficeURL
   */
  async getInnerTemplateofficeurlEx(request: GetInnerTemplateofficeurlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetInnerTemplateofficeurlResponse> {
    Util.validateModel(request);
    return $tea.cast<GetInnerTemplateofficeurlResponse>(await this.doRequest("1.0", "antchain.ato.inner.templateofficeurl.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetInnerTemplateofficeurlResponse({}));
  }

  /**
   * Description: 魔法库控制台刷新token
   * Summary: 刷新token
   */
  async refreshInnerTemplatetoken(request: RefreshInnerTemplatetokenRequest): Promise<RefreshInnerTemplatetokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.refreshInnerTemplatetokenEx(request, headers, runtime);
  }

  /**
   * Description: 魔法库控制台刷新token
   * Summary: 刷新token
   */
  async refreshInnerTemplatetokenEx(request: RefreshInnerTemplatetokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RefreshInnerTemplatetokenResponse> {
    Util.validateModel(request);
    return $tea.cast<RefreshInnerTemplatetokenResponse>(await this.doRequest("1.0", "antchain.ato.inner.templatetoken.refresh", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RefreshInnerTemplatetokenResponse({}));
  }

  /**
   * Description: 创建文本域（组件）
   * Summary: 创建文本域
   */
  async createInnerTemplatetextarea(request: CreateInnerTemplatetextareaRequest): Promise<CreateInnerTemplatetextareaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createInnerTemplatetextareaEx(request, headers, runtime);
  }

  /**
   * Description: 创建文本域（组件）
   * Summary: 创建文本域
   */
  async createInnerTemplatetextareaEx(request: CreateInnerTemplatetextareaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateInnerTemplatetextareaResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateInnerTemplatetextareaResponse>(await this.doRequest("1.0", "antchain.ato.inner.templatetextarea.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateInnerTemplatetextareaResponse({}));
  }

  /**
   * Description: 获取模板的图片列表
   * Summary: 获取模板的图片列表
   */
  async queryInnerTemplateimage(request: QueryInnerTemplateimageRequest): Promise<QueryInnerTemplateimageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInnerTemplateimageEx(request, headers, runtime);
  }

  /**
   * Description: 获取模板的图片列表
   * Summary: 获取模板的图片列表
   */
  async queryInnerTemplateimageEx(request: QueryInnerTemplateimageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInnerTemplateimageResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInnerTemplateimageResponse>(await this.doRequest("1.0", "antchain.ato.inner.templateimage.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInnerTemplateimageResponse({}));
  }

  /**
   * Description: 保存/编辑分账关系信息
   * Summary: 保存/编辑分账关系信息
   */
  async createInnerFunddividerelation(request: CreateInnerFunddividerelationRequest): Promise<CreateInnerFunddividerelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createInnerFunddividerelationEx(request, headers, runtime);
  }

  /**
   * Description: 保存/编辑分账关系信息
   * Summary: 保存/编辑分账关系信息
   */
  async createInnerFunddividerelationEx(request: CreateInnerFunddividerelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateInnerFunddividerelationResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateInnerFunddividerelationResponse>(await this.doRequest("1.0", "antchain.ato.inner.funddividerelation.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateInnerFunddividerelationResponse({}));
  }

  /**
   * Description: 提交分账关系信息
   * Summary: 提交分账关系信息
   */
  async submitInnerFunddividerelation(request: SubmitInnerFunddividerelationRequest): Promise<SubmitInnerFunddividerelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitInnerFunddividerelationEx(request, headers, runtime);
  }

  /**
   * Description: 提交分账关系信息
   * Summary: 提交分账关系信息
   */
  async submitInnerFunddividerelationEx(request: SubmitInnerFunddividerelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitInnerFunddividerelationResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitInnerFunddividerelationResponse>(await this.doRequest("1.0", "antchain.ato.inner.funddividerelation.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitInnerFunddividerelationResponse({}));
  }

  /**
   * Description: 查询分账关系信息
   * Summary: 查询分账关系信息
   */
  async queryInnerFunddividerelation(request: QueryInnerFunddividerelationRequest): Promise<QueryInnerFunddividerelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInnerFunddividerelationEx(request, headers, runtime);
  }

  /**
   * Description: 查询分账关系信息
   * Summary: 查询分账关系信息
   */
  async queryInnerFunddividerelationEx(request: QueryInnerFunddividerelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInnerFunddividerelationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInnerFunddividerelationResponse>(await this.doRequest("1.0", "antchain.ato.inner.funddividerelation.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInnerFunddividerelationResponse({}));
  }

  /**
   * Description: 查询分账关系分页列表
   * Summary: 查询分账关系分页列表
   */
  async pagequeryInnerFunddividerelation(request: PagequeryInnerFunddividerelationRequest): Promise<PagequeryInnerFunddividerelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryInnerFunddividerelationEx(request, headers, runtime);
  }

  /**
   * Description: 查询分账关系分页列表
   * Summary: 查询分账关系分页列表
   */
  async pagequeryInnerFunddividerelationEx(request: PagequeryInnerFunddividerelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryInnerFunddividerelationResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryInnerFunddividerelationResponse>(await this.doRequest("1.0", "antchain.ato.inner.funddividerelation.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryInnerFunddividerelationResponse({}));
  }

  /**
   * Description: 保存租户签约信息
   * Summary: 保存租户签约信息
   */
  async createInnerMerchantagreement(request: CreateInnerMerchantagreementRequest): Promise<CreateInnerMerchantagreementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createInnerMerchantagreementEx(request, headers, runtime);
  }

  /**
   * Description: 保存租户签约信息
   * Summary: 保存租户签约信息
   */
  async createInnerMerchantagreementEx(request: CreateInnerMerchantagreementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateInnerMerchantagreementResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateInnerMerchantagreementResponse>(await this.doRequest("1.0", "antchain.ato.inner.merchantagreement.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateInnerMerchantagreementResponse({}));
  }

  /**
   * Description: 查询租户签约信息
   * Summary: 查询租户签约信息
   */
  async queryInnerMerchantagreement(request: QueryInnerMerchantagreementRequest): Promise<QueryInnerMerchantagreementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInnerMerchantagreementEx(request, headers, runtime);
  }

  /**
   * Description: 查询租户签约信息
   * Summary: 查询租户签约信息
   */
  async queryInnerMerchantagreementEx(request: QueryInnerMerchantagreementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInnerMerchantagreementResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInnerMerchantagreementResponse>(await this.doRequest("1.0", "antchain.ato.inner.merchantagreement.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInnerMerchantagreementResponse({}));
  }

  /**
   * Description: 查询租户签约协议分页列表
   * Summary: 查询租户签约协议分页列表
   */
  async pagequeryInnerMerchantagreement(request: PagequeryInnerMerchantagreementRequest): Promise<PagequeryInnerMerchantagreementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryInnerMerchantagreementEx(request, headers, runtime);
  }

  /**
   * Description: 查询租户签约协议分页列表
   * Summary: 查询租户签约协议分页列表
   */
  async pagequeryInnerMerchantagreementEx(request: PagequeryInnerMerchantagreementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryInnerMerchantagreementResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryInnerMerchantagreementResponse>(await this.doRequest("1.0", "antchain.ato.inner.merchantagreement.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryInnerMerchantagreementResponse({}));
  }

  /**
   * Description: 保存/编辑进件信息
   * Summary: 保存/编辑进件信息
   */
  async createInnerMerchantpayexpand(request: CreateInnerMerchantpayexpandRequest): Promise<CreateInnerMerchantpayexpandResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createInnerMerchantpayexpandEx(request, headers, runtime);
  }

  /**
   * Description: 保存/编辑进件信息
   * Summary: 保存/编辑进件信息
   */
  async createInnerMerchantpayexpandEx(request: CreateInnerMerchantpayexpandRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateInnerMerchantpayexpandResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateInnerMerchantpayexpandResponse>(await this.doRequest("1.0", "antchain.ato.inner.merchantpayexpand.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateInnerMerchantpayexpandResponse({}));
  }

  /**
   * Description: 提交进件信息
   * Summary: 提交进件信息
   */
  async submitInnerMerchantpayexpand(request: SubmitInnerMerchantpayexpandRequest): Promise<SubmitInnerMerchantpayexpandResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitInnerMerchantpayexpandEx(request, headers, runtime);
  }

  /**
   * Description: 提交进件信息
   * Summary: 提交进件信息
   */
  async submitInnerMerchantpayexpandEx(request: SubmitInnerMerchantpayexpandRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitInnerMerchantpayexpandResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitInnerMerchantpayexpandResponse>(await this.doRequest("1.0", "antchain.ato.inner.merchantpayexpand.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitInnerMerchantpayexpandResponse({}));
  }

  /**
   * Description: 查询进件信息
   * Summary: 查询进件信息
   */
  async queryInnerMerchantpayexpand(request: QueryInnerMerchantpayexpandRequest): Promise<QueryInnerMerchantpayexpandResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInnerMerchantpayexpandEx(request, headers, runtime);
  }

  /**
   * Description: 查询进件信息
   * Summary: 查询进件信息
   */
  async queryInnerMerchantpayexpandEx(request: QueryInnerMerchantpayexpandRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInnerMerchantpayexpandResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInnerMerchantpayexpandResponse>(await this.doRequest("1.0", "antchain.ato.inner.merchantpayexpand.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInnerMerchantpayexpandResponse({}));
  }

  /**
   * Description: 查询代理商户分页列表-间连商户使用
   * Summary: 查询代理商户分页列表-间连商户使用
   */
  async pagequeryInnerMerchantagent(request: PagequeryInnerMerchantagentRequest): Promise<PagequeryInnerMerchantagentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryInnerMerchantagentEx(request, headers, runtime);
  }

  /**
   * Description: 查询代理商户分页列表-间连商户使用
   * Summary: 查询代理商户分页列表-间连商户使用
   */
  async pagequeryInnerMerchantagentEx(request: PagequeryInnerMerchantagentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryInnerMerchantagentResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryInnerMerchantagentResponse>(await this.doRequest("1.0", "antchain.ato.inner.merchantagent.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryInnerMerchantagentResponse({}));
  }

  /**
   * Description: 拷贝模板文件，可用于保存模板的入参
   * Summary: 拷贝模板文件
   */
  async cloneInnerTemplatefileaddress(request: CloneInnerTemplatefileaddressRequest): Promise<CloneInnerTemplatefileaddressResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cloneInnerTemplatefileaddressEx(request, headers, runtime);
  }

  /**
   * Description: 拷贝模板文件，可用于保存模板的入参
   * Summary: 拷贝模板文件
   */
  async cloneInnerTemplatefileaddressEx(request: CloneInnerTemplatefileaddressRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CloneInnerTemplatefileaddressResponse> {
    Util.validateModel(request);
    return $tea.cast<CloneInnerTemplatefileaddressResponse>(await this.doRequest("1.0", "antchain.ato.inner.templatefileaddress.clone", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CloneInnerTemplatefileaddressResponse({}));
  }

  /**
   * Description: 查询签署区
   * Summary: 查询签署区
   */
  async queryInnerSignfields(request: QueryInnerSignfieldsRequest): Promise<QueryInnerSignfieldsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInnerSignfieldsEx(request, headers, runtime);
  }

  /**
   * Description: 查询签署区
   * Summary: 查询签署区
   */
  async queryInnerSignfieldsEx(request: QueryInnerSignfieldsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInnerSignfieldsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInnerSignfieldsResponse>(await this.doRequest("1.0", "antchain.ato.inner.signfields.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInnerSignfieldsResponse({}));
  }

  /**
   * Description: 同步已发布的模板
   * Summary: 同步已发布的模板
   */
  async syncInnerTemplate(request: SyncInnerTemplateRequest): Promise<SyncInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncInnerTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 同步已发布的模板
   * Summary: 同步已发布的模板
   */
  async syncInnerTemplateEx(request: SyncInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncInnerTemplateResponse({}));
  }

  /**
   * Description: 更新魔法库模板基本信息
   * Summary: 更新魔法库模板基本信息
   */
  async updateInnerTemplate(request: UpdateInnerTemplateRequest): Promise<UpdateInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateInnerTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 更新魔法库模板基本信息
   * Summary: 更新魔法库模板基本信息
   */
  async updateInnerTemplateEx(request: UpdateInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateInnerTemplateResponse({}));
  }

  /**
   * Description: 通过模板code更新模板的基本信息，比如模板名称等
   * Summary: 查询模板的基本信息
   */
  async queryInnerTemplate(request: QueryInnerTemplateRequest): Promise<QueryInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInnerTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 通过模板code更新模板的基本信息，比如模板名称等
   * Summary: 查询模板的基本信息
   */
  async queryInnerTemplateEx(request: QueryInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInnerTemplateResponse({}));
  }

  /**
   * Description: 获取模板关联的元素列表信息，包括组件信息
   * Summary: 获取模板关联的元素列表信息
   */
  async queryInnerTemplateelementlink(request: QueryInnerTemplateelementlinkRequest): Promise<QueryInnerTemplateelementlinkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInnerTemplateelementlinkEx(request, headers, runtime);
  }

  /**
   * Description: 获取模板关联的元素列表信息，包括组件信息
   * Summary: 获取模板关联的元素列表信息
   */
  async queryInnerTemplateelementlinkEx(request: QueryInnerTemplateelementlinkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInnerTemplateelementlinkResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInnerTemplateelementlinkResponse>(await this.doRequest("1.0", "antchain.ato.inner.templateelementlink.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInnerTemplateelementlinkResponse({}));
  }

  /**
   * Description: 通过模板code、模板版本号获取模板某个版本的详情信息，包括id、文件地址等
   * Summary: 查询模板的版本详情
   */
  async queryInnerTemplateversion(request: QueryInnerTemplateversionRequest): Promise<QueryInnerTemplateversionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInnerTemplateversionEx(request, headers, runtime);
  }

  /**
   * Description: 通过模板code、模板版本号获取模板某个版本的详情信息，包括id、文件地址等
   * Summary: 查询模板的版本详情
   */
  async queryInnerTemplateversionEx(request: QueryInnerTemplateversionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInnerTemplateversionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInnerTemplateversionResponse>(await this.doRequest("1.0", "antchain.ato.inner.templateversion.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInnerTemplateversionResponse({}));
  }

  /**
   * Description: 订单消息查询
   * Summary: 订单消息查询
   */
  async pagequeryInnerOrdermsg(request: PagequeryInnerOrdermsgRequest): Promise<PagequeryInnerOrdermsgResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryInnerOrdermsgEx(request, headers, runtime);
  }

  /**
   * Description: 订单消息查询
   * Summary: 订单消息查询
   */
  async pagequeryInnerOrdermsgEx(request: PagequeryInnerOrdermsgRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryInnerOrdermsgResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryInnerOrdermsgResponse>(await this.doRequest("1.0", "antchain.ato.inner.ordermsg.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryInnerOrdermsgResponse({}));
  }

  /**
   * Description: 订单消息重试
   * Summary: 订单消息重试
   */
  async retryInnerOrdermsg(request: RetryInnerOrdermsgRequest): Promise<RetryInnerOrdermsgResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryInnerOrdermsgEx(request, headers, runtime);
  }

  /**
   * Description: 订单消息重试
   * Summary: 订单消息重试
   */
  async retryInnerOrdermsgEx(request: RetryInnerOrdermsgRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryInnerOrdermsgResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryInnerOrdermsgResponse>(await this.doRequest("1.0", "antchain.ato.inner.ordermsg.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryInnerOrdermsgResponse({}));
  }

  /**
   * Description: 商户入驻
   * Summary: 商户入驻
   */
  async registerMerchantexpandMerchant(request: RegisterMerchantexpandMerchantRequest): Promise<RegisterMerchantexpandMerchantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.registerMerchantexpandMerchantEx(request, headers, runtime);
  }

  /**
   * Description: 商户入驻
   * Summary: 商户入驻
   */
  async registerMerchantexpandMerchantEx(request: RegisterMerchantexpandMerchantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RegisterMerchantexpandMerchantResponse> {
    Util.validateModel(request);
    return $tea.cast<RegisterMerchantexpandMerchantResponse>(await this.doRequest("1.0", "antchain.ato.merchantexpand.merchant.register", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RegisterMerchantexpandMerchantResponse({}));
  }

  /**
   * Description: 获取临时上传文件链接
   * Summary: 获取临时上传文件链接
   */
  async uploadMerchantexpandFile(request: UploadMerchantexpandFileRequest): Promise<UploadMerchantexpandFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadMerchantexpandFileEx(request, headers, runtime);
  }

  /**
   * Description: 获取临时上传文件链接
   * Summary: 获取临时上传文件链接
   */
  async uploadMerchantexpandFileEx(request: UploadMerchantexpandFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadMerchantexpandFileResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadMerchantexpandFileResponse>(await this.doRequest("1.0", "antchain.ato.merchantexpand.file.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadMerchantexpandFileResponse({}));
  }

  /**
   * Description: 商户入驻查询
   * Summary: 商户入驻查询
   */
  async queryMerchantexpandMerchant(request: QueryMerchantexpandMerchantRequest): Promise<QueryMerchantexpandMerchantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMerchantexpandMerchantEx(request, headers, runtime);
  }

  /**
   * Description: 商户入驻查询
   * Summary: 商户入驻查询
   */
  async queryMerchantexpandMerchantEx(request: QueryMerchantexpandMerchantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMerchantexpandMerchantResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMerchantexpandMerchantResponse>(await this.doRequest("1.0", "antchain.ato.merchantexpand.merchant.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMerchantexpandMerchantResponse({}));
  }

  /**
   * Description: 可信身份认证，创建认证
   * Summary: 创建认证
   */
  async createRealpersonFacevrf(request: CreateRealpersonFacevrfRequest): Promise<CreateRealpersonFacevrfResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createRealpersonFacevrfEx(request, headers, runtime);
  }

  /**
   * Description: 可信身份认证，创建认证
   * Summary: 创建认证
   */
  async createRealpersonFacevrfEx(request: CreateRealpersonFacevrfRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateRealpersonFacevrfResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateRealpersonFacevrfResponse>(await this.doRequest("1.0", "antchain.ato.realperson.facevrf.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateRealpersonFacevrfResponse({}));
  }

  /**
   * Description: 查询认证的结果和相关信息
   * Summary: 查询认证结果
   */
  async queryRealpersonFacevrf(request: QueryRealpersonFacevrfRequest): Promise<QueryRealpersonFacevrfResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRealpersonFacevrfEx(request, headers, runtime);
  }

  /**
   * Description: 查询认证的结果和相关信息
   * Summary: 查询认证结果
   */
  async queryRealpersonFacevrfEx(request: QueryRealpersonFacevrfRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRealpersonFacevrfResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRealpersonFacevrfResponse>(await this.doRequest("1.0", "antchain.ato.realperson.facevrf.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRealpersonFacevrfResponse({}));
  }

  /**
   * Description: 发起风控分析，获取风险分
   * Summary: 发起风控分析，获取风险分
   */
  async queryRisk(request: QueryRiskRequest): Promise<QueryRiskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRiskEx(request, headers, runtime);
  }

  /**
   * Description: 发起风控分析，获取风险分
   * Summary: 发起风控分析，获取风险分
   */
  async queryRiskEx(request: QueryRiskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRiskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRiskResponse>(await this.doRequest("1.0", "antchain.ato.risk.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRiskResponse({}));
  }

  /**
   * Description: 电子合同签署的合同模板查询服务
   * Summary: 电子合同签署的合同模板查询服务
   */
  async allSignTemplate(request: AllSignTemplateRequest): Promise<AllSignTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allSignTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 电子合同签署的合同模板查询服务
   * Summary: 电子合同签署的合同模板查询服务
   */
  async allSignTemplateEx(request: AllSignTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllSignTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<AllSignTemplateResponse>(await this.doRequest("1.0", "antchain.ato.sign.template.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllSignTemplateResponse({}));
  }

  /**
   * Description: 提交电子合同的签署流程(后置签署模式)
   * Summary: 提交电子合同的签署流程（后置签署模式）
   */
  async submitSignFlow(request: SubmitSignFlowRequest): Promise<SubmitSignFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitSignFlowEx(request, headers, runtime);
  }

  /**
   * Description: 提交电子合同的签署流程(后置签署模式)
   * Summary: 提交电子合同的签署流程（后置签署模式）
   */
  async submitSignFlowEx(request: SubmitSignFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitSignFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitSignFlowResponse>(await this.doRequest("1.0", "antchain.ato.sign.flow.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitSignFlowResponse({}));
  }

  /**
   * Description: 查询签署流程详情
   * Summary: 查询签署流程详情
   */
  async getSignFlow(request: GetSignFlowRequest): Promise<GetSignFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getSignFlowEx(request, headers, runtime);
  }

  /**
   * Description: 查询签署流程详情
   * Summary: 查询签署流程详情
   */
  async getSignFlowEx(request: GetSignFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetSignFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<GetSignFlowResponse>(await this.doRequest("1.0", "antchain.ato.sign.flow.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetSignFlowResponse({}));
  }

  /**
   * Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
   * Summary: 电子合同签署流程落签操作
   */
  async authSignFlow(request: AuthSignFlowRequest): Promise<AuthSignFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authSignFlowEx(request, headers, runtime);
  }

  /**
   * Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
   * Summary: 电子合同签署流程落签操作
   */
  async authSignFlowEx(request: AuthSignFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthSignFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthSignFlowResponse>(await this.doRequest("1.0", "antchain.ato.sign.flow.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthSignFlowResponse({}));
  }

  /**
   * Description: 提交前置签署的电子合同签署流程（前置签署模式）
   * Summary: 提交签署的电子合同签署流程（前置签署）
   */
  async submitFrontSign(request: SubmitFrontSignRequest): Promise<SubmitFrontSignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitFrontSignEx(request, headers, runtime);
  }

  /**
   * Description: 提交前置签署的电子合同签署流程（前置签署模式）
   * Summary: 提交签署的电子合同签署流程（前置签署）
   */
  async submitFrontSignEx(request: SubmitFrontSignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitFrontSignResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitFrontSignResponse>(await this.doRequest("1.0", "antchain.ato.front.sign.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitFrontSignResponse({}));
  }

  /**
   * Description: 调用该接口，追加上传无法在原有链路上签署的合同
   * Summary: 商户调用合同追加接口
   */
  async uploadSignFlow(request: UploadSignFlowRequest): Promise<UploadSignFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadSignFlowEx(request, headers, runtime);
  }

  /**
   * Description: 调用该接口，追加上传无法在原有链路上签署的合同
   * Summary: 商户调用合同追加接口
   */
  async uploadSignFlowEx(request: UploadSignFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadSignFlowResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.ato.sign.flow.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadSignFlowResponse = new UploadSignFlowResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadSignFlowResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
    }

    Util.validateModel(request);
    return $tea.cast<UploadSignFlowResponse>(await this.doRequest("1.0", "antchain.ato.sign.flow.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadSignFlowResponse({}));
  }

  /**
   * Description: 商户合同模板上传接口
   * Summary: 商户合同模板上传
   */
  async uploadSignTemplate(request: UploadSignTemplateRequest): Promise<UploadSignTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadSignTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 商户合同模板上传接口
   * Summary: 商户合同模板上传
   */
  async uploadSignTemplateEx(request: UploadSignTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadSignTemplateResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.ato.sign.template.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadSignTemplateResponse = new UploadSignTemplateResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadSignTemplateResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
    }

    Util.validateModel(request);
    return $tea.cast<UploadSignTemplateResponse>(await this.doRequest("1.0", "antchain.ato.sign.template.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadSignTemplateResponse({}));
  }

  /**
   * Description: 商户资产凭证上传，可以是文本或文件
   * Summary: 商户资产凭证上传
   */
  async uploadSignCredit(request: UploadSignCreditRequest): Promise<UploadSignCreditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadSignCreditEx(request, headers, runtime);
  }

  /**
   * Description: 商户资产凭证上传，可以是文本或文件
   * Summary: 商户资产凭证上传
   */
  async uploadSignCreditEx(request: UploadSignCreditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadSignCreditResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadSignCreditResponse>(await this.doRequest("1.0", "antchain.ato.sign.credit.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadSignCreditResponse({}));
  }

  /**
   * Description: 商户资产凭证查询，需要提供订单号或资产包号
   * Summary: 商户资产凭证查询
   */
  async querySignCredit(request: QuerySignCreditRequest): Promise<QuerySignCreditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySignCreditEx(request, headers, runtime);
  }

  /**
   * Description: 商户资产凭证查询，需要提供订单号或资产包号
   * Summary: 商户资产凭证查询
   */
  async querySignCreditEx(request: QuerySignCreditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySignCreditResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySignCreditResponse>(await this.doRequest("1.0", "antchain.ato.sign.credit.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySignCreditResponse({}));
  }

  /**
   * Description: 对账saas交易信息同步接口
   * Summary: 对账saas交易信息同步接口
   */
  async syncTrade(request: SyncTradeRequest): Promise<SyncTradeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncTradeEx(request, headers, runtime);
  }

  /**
   * Description: 对账saas交易信息同步接口
   * Summary: 对账saas交易信息同步接口
   */
  async syncTradeEx(request: SyncTradeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncTradeResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncTradeResponse>(await this.doRequest("1.0", "antchain.ato.trade.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncTradeResponse({}));
  }

  /**
   * Description: 获取详情
   * Summary: 获取详情
   */
  async getTrade(request: GetTradeRequest): Promise<GetTradeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTradeEx(request, headers, runtime);
  }

  /**
   * Description: 获取详情
   * Summary: 获取详情
   */
  async getTradeEx(request: GetTradeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTradeResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTradeResponse>(await this.doRequest("1.0", "antchain.ato.trade.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTradeResponse({}));
  }

  /**
   * Description: 订单创建，前置签署
   * Summary: 前置签署订单创建
   */
  async syncFrontTrade(request: SyncFrontTradeRequest): Promise<SyncFrontTradeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncFrontTradeEx(request, headers, runtime);
  }

  /**
   * Description: 订单创建，前置签署
   * Summary: 前置签署订单创建
   */
  async syncFrontTradeEx(request: SyncFrontTradeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncFrontTradeResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncFrontTradeResponse>(await this.doRequest("1.0", "antchain.ato.front.trade.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncFrontTradeResponse({}));
  }

  /**
   * Description: 融资放款申请接口
   * Summary: 融资放款申请接口
   */
  async syncTradeFinanceloanapply(request: SyncTradeFinanceloanapplyRequest): Promise<SyncTradeFinanceloanapplyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncTradeFinanceloanapplyEx(request, headers, runtime);
  }

  /**
   * Description: 融资放款申请接口
   * Summary: 融资放款申请接口
   */
  async syncTradeFinanceloanapplyEx(request: SyncTradeFinanceloanapplyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncTradeFinanceloanapplyResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncTradeFinanceloanapplyResponse>(await this.doRequest("1.0", "antchain.ato.trade.financeloanapply.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncTradeFinanceloanapplyResponse({}));
  }

  /**
   * Description: 商户履约查询
   * Summary: 商户履约查询
   */
  async getTradeMerchantfulfillment(request: GetTradeMerchantfulfillmentRequest): Promise<GetTradeMerchantfulfillmentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTradeMerchantfulfillmentEx(request, headers, runtime);
  }

  /**
   * Description: 商户履约查询
   * Summary: 商户履约查询
   */
  async getTradeMerchantfulfillmentEx(request: GetTradeMerchantfulfillmentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTradeMerchantfulfillmentResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTradeMerchantfulfillmentResponse>(await this.doRequest("1.0", "antchain.ato.trade.merchantfulfillment.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTradeMerchantfulfillmentResponse({}));
  }

  /**
   * Description: 用户履约信息查询（履约承诺+记录）
   * Summary: 用户履约信息查询（履约承诺+记录）
   */
  async getTradeUserperformance(request: GetTradeUserperformanceRequest): Promise<GetTradeUserperformanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTradeUserperformanceEx(request, headers, runtime);
  }

  /**
   * Description: 用户履约信息查询（履约承诺+记录）
   * Summary: 用户履约信息查询（履约承诺+记录）
   */
  async getTradeUserperformanceEx(request: GetTradeUserperformanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTradeUserperformanceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTradeUserperformanceResponse>(await this.doRequest("1.0", "antchain.ato.trade.userperformance.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTradeUserperformanceResponse({}));
  }

  /**
   * Description: 商户履约信息查询（履约承诺+履约记录）
   * Summary: 商户履约信息查询（履约承诺+履约记录）
   */
  async getTradeMerchantperformance(request: GetTradeMerchantperformanceRequest): Promise<GetTradeMerchantperformanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTradeMerchantperformanceEx(request, headers, runtime);
  }

  /**
   * Description: 商户履约信息查询（履约承诺+履约记录）
   * Summary: 商户履约信息查询（履约承诺+履约记录）
   */
  async getTradeMerchantperformanceEx(request: GetTradeMerchantperformanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTradeMerchantperformanceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTradeMerchantperformanceResponse>(await this.doRequest("1.0", "antchain.ato.trade.merchantperformance.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTradeMerchantperformanceResponse({}));
  }

  /**
   * Description: 商户调用，修改订单的用户还款承诺
   * Summary: 用户还款承诺信息修改
   */
  async updateTradeUserpromise(request: UpdateTradeUserpromiseRequest): Promise<UpdateTradeUserpromiseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateTradeUserpromiseEx(request, headers, runtime);
  }

  /**
   * Description: 商户调用，修改订单的用户还款承诺
   * Summary: 用户还款承诺信息修改
   */
  async updateTradeUserpromiseEx(request: UpdateTradeUserpromiseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateTradeUserpromiseResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateTradeUserpromiseResponse>(await this.doRequest("1.0", "antchain.ato.trade.userpromise.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateTradeUserpromiseResponse({}));
  }

  /**
   * Description: 前置签署间联模式订单进件
   * Summary: 前置签署间联模式订单进件
   */
  async syncFrontIndirectorder(request: SyncFrontIndirectorderRequest): Promise<SyncFrontIndirectorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncFrontIndirectorderEx(request, headers, runtime);
  }

  /**
   * Description: 前置签署间联模式订单进件
   * Summary: 前置签署间联模式订单进件
   */
  async syncFrontIndirectorderEx(request: SyncFrontIndirectorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncFrontIndirectorderResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncFrontIndirectorderResponse>(await this.doRequest("1.0", "antchain.ato.front.indirectorder.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncFrontIndirectorderResponse({}));
  }

  /**
   * Description: 间联模式-后置模式订单进件
   * Summary: 间联模式-后置模式订单进件
   */
  async syncTradeIndirectorder(request: SyncTradeIndirectorderRequest): Promise<SyncTradeIndirectorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncTradeIndirectorderEx(request, headers, runtime);
  }

  /**
   * Description: 间联模式-后置模式订单进件
   * Summary: 间联模式-后置模式订单进件
   */
  async syncTradeIndirectorderEx(request: SyncTradeIndirectorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncTradeIndirectorderResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncTradeIndirectorderResponse>(await this.doRequest("1.0", "antchain.ato.trade.indirectorder.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncTradeIndirectorderResponse({}));
  }

  /**
   * Description: 代扣签约创建
   * Summary: 代扣签约
   */
  async createWithholdSign(request: CreateWithholdSignRequest): Promise<CreateWithholdSignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createWithholdSignEx(request, headers, runtime);
  }

  /**
   * Description: 代扣签约创建
   * Summary: 代扣签约
   */
  async createWithholdSignEx(request: CreateWithholdSignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateWithholdSignResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateWithholdSignResponse>(await this.doRequest("1.0", "antchain.ato.withhold.sign.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateWithholdSignResponse({}));
  }

  /**
   * Description: 代扣签约查询
   * Summary: 代扣签约查询
   */
  async queryWithholdSign(request: QueryWithholdSignRequest): Promise<QueryWithholdSignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryWithholdSignEx(request, headers, runtime);
  }

  /**
   * Description: 代扣签约查询
   * Summary: 代扣签约查询
   */
  async queryWithholdSignEx(request: QueryWithholdSignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryWithholdSignResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryWithholdSignResponse>(await this.doRequest("1.0", "antchain.ato.withhold.sign.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryWithholdSignResponse({}));
  }

  /**
   * Description: 订单关闭后,可以通过此接口解绑签约
   * Summary: 代扣签约解绑
   */
  async unbindWithholdSign(request: UnbindWithholdSignRequest): Promise<UnbindWithholdSignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.unbindWithholdSignEx(request, headers, runtime);
  }

  /**
   * Description: 订单关闭后,可以通过此接口解绑签约
   * Summary: 代扣签约解绑
   */
  async unbindWithholdSignEx(request: UnbindWithholdSignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UnbindWithholdSignResponse> {
    Util.validateModel(request);
    return $tea.cast<UnbindWithholdSignResponse>(await this.doRequest("1.0", "antchain.ato.withhold.sign.unbind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UnbindWithholdSignResponse({}));
  }

  /**
   * Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
   * Summary: 取消代扣计划
   */
  async cancelWithholdPlan(request: CancelWithholdPlanRequest): Promise<CancelWithholdPlanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelWithholdPlanEx(request, headers, runtime);
  }

  /**
   * Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
   * Summary: 取消代扣计划
   */
  async cancelWithholdPlanEx(request: CancelWithholdPlanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelWithholdPlanResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelWithholdPlanResponse>(await this.doRequest("1.0", "antchain.ato.withhold.plan.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelWithholdPlanResponse({}));
  }

  /**
   * Description: 重要说明：
      1. 这个接口是取消订单某一期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
      2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
   * Summary: 单期代扣取消
   */
  async repayWithholdPlan(request: RepayWithholdPlanRequest): Promise<RepayWithholdPlanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.repayWithholdPlanEx(request, headers, runtime);
  }

  /**
   * Description: 重要说明：
      1. 这个接口是取消订单某一期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
      2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
   * Summary: 单期代扣取消
   */
  async repayWithholdPlanEx(request: RepayWithholdPlanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RepayWithholdPlanResponse> {
    Util.validateModel(request);
    return $tea.cast<RepayWithholdPlanResponse>(await this.doRequest("1.0", "antchain.ato.withhold.plan.repay", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RepayWithholdPlanResponse({}));
  }

  /**
   * Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
   * Summary: 扣款计划重试
   */
  async retryWithholdPlan(request: RetryWithholdPlanRequest): Promise<RetryWithholdPlanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryWithholdPlanEx(request, headers, runtime);
  }

  /**
   * Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
   * Summary: 扣款计划重试
   */
  async retryWithholdPlanEx(request: RetryWithholdPlanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryWithholdPlanResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryWithholdPlanResponse>(await this.doRequest("1.0", "antchain.ato.withhold.plan.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryWithholdPlanResponse({}));
  }

  /**
   * Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
   * Summary: 代扣签约的异步解约确认
   */
  async confirmWithholdSignasyncunsign(request: ConfirmWithholdSignasyncunsignRequest): Promise<ConfirmWithholdSignasyncunsignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmWithholdSignasyncunsignEx(request, headers, runtime);
  }

  /**
   * Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
   * Summary: 代扣签约的异步解约确认
   */
  async confirmWithholdSignasyncunsignEx(request: ConfirmWithholdSignasyncunsignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmWithholdSignasyncunsignResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmWithholdSignasyncunsignResponse>(await this.doRequest("1.0", "antchain.ato.withhold.signasyncunsign.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmWithholdSignasyncunsignResponse({}));
  }

  /**
   * Description: 代扣主动支付创建
   * Summary: 代扣主动支付创建
   */
  async createWithholdActivepay(request: CreateWithholdActivepayRequest): Promise<CreateWithholdActivepayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createWithholdActivepayEx(request, headers, runtime);
  }

  /**
   * Description: 代扣主动支付创建
   * Summary: 代扣主动支付创建
   */
  async createWithholdActivepayEx(request: CreateWithholdActivepayRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateWithholdActivepayResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateWithholdActivepayResponse>(await this.doRequest("1.0", "antchain.ato.withhold.activepay.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateWithholdActivepayResponse({}));
  }

  /**
   * Description: 代扣主动支付查询
   * Summary: 代扣主动支付查询
   */
  async queryWithholdActivepay(request: QueryWithholdActivepayRequest): Promise<QueryWithholdActivepayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryWithholdActivepayEx(request, headers, runtime);
  }

  /**
   * Description: 代扣主动支付查询
   * Summary: 代扣主动支付查询
   */
  async queryWithholdActivepayEx(request: QueryWithholdActivepayRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryWithholdActivepayResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryWithholdActivepayResponse>(await this.doRequest("1.0", "antchain.ato.withhold.activepay.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryWithholdActivepayResponse({}));
  }

  /**
   * Description: 代扣主动支付取消
   * Summary: 代扣主动支付取消
   */
  async cancelWithholdActivepay(request: CancelWithholdActivepayRequest): Promise<CancelWithholdActivepayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelWithholdActivepayEx(request, headers, runtime);
  }

  /**
   * Description: 代扣主动支付取消
   * Summary: 代扣主动支付取消
   */
  async cancelWithholdActivepayEx(request: CancelWithholdActivepayRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelWithholdActivepayResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelWithholdActivepayResponse>(await this.doRequest("1.0", "antchain.ato.withhold.activepay.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelWithholdActivepayResponse({}));
  }

  /**
   * Description: 创建退款请求
   * Summary: 创建退款申请
   */
  async createWithholdRefund(request: CreateWithholdRefundRequest): Promise<CreateWithholdRefundResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createWithholdRefundEx(request, headers, runtime);
  }

  /**
   * Description: 创建退款请求
   * Summary: 创建退款申请
   */
  async createWithholdRefundEx(request: CreateWithholdRefundRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateWithholdRefundResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateWithholdRefundResponse>(await this.doRequest("1.0", "antchain.ato.withhold.refund.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateWithholdRefundResponse({}));
  }

  /**
   * Description: 退款申请结果查询
   * Summary: 退款申请结果查询
   */
  async queryWithholdRefund(request: QueryWithholdRefundRequest): Promise<QueryWithholdRefundResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryWithholdRefundEx(request, headers, runtime);
  }

  /**
   * Description: 退款申请结果查询
   * Summary: 退款申请结果查询
   */
  async queryWithholdRefundEx(request: QueryWithholdRefundRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryWithholdRefundResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryWithholdRefundResponse>(await this.doRequest("1.0", "antchain.ato.withhold.refund.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryWithholdRefundResponse({}));
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
