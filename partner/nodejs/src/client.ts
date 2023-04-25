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

// 支出配置单商品价格条件属性
export class ExpenditureQuotationOfferPriceConditionAttr extends $tea.Model {
  // 属性code
  attrCode: string;
  // 属性值code
  attrValueCode: string;
  // 属性值名称
  attrValueName: string;
  // 运算符
  operator: string;
  static names(): { [key: string]: string } {
    return {
      attrCode: 'attr_code',
      attrValueCode: 'attr_value_code',
      attrValueName: 'attr_value_name',
      operator: 'operator',
    };
  }

  static types(): { [key: string]: any } {
    return {
      attrCode: 'string',
      attrValueCode: 'string',
      attrValueName: 'string',
      operator: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合作方签约文件
export class PartnerSignFile extends $tea.Model {
  // 文件类型
  type: string;
  // 文件名称
  name: string;
  // 可预览地址
  ossUrl: string;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      name: 'name',
      ossUrl: 'oss_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      name: 'string',
      ossUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 支出配置单商品价格
export class ExpenditureQuotationOfferPrice extends $tea.Model {
  // 定价条件
  conditionAttrs?: ExpenditureQuotationOfferPriceConditionAttr[];
  // 阶梯起始值
  ladderStart: string;
  // 阶梯结束值
  ladderEnd: string;
  // 价格
  price: string;
  // 币种
  currency: string;
  static names(): { [key: string]: string } {
    return {
      conditionAttrs: 'condition_attrs',
      ladderStart: 'ladder_start',
      ladderEnd: 'ladder_end',
      price: 'price',
      currency: 'currency',
    };
  }

  static types(): { [key: string]: any } {
    return {
      conditionAttrs: { 'type': 'array', 'itemType': ExpenditureQuotationOfferPriceConditionAttr },
      ladderStart: 'string',
      ladderEnd: 'string',
      price: 'string',
      currency: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签约记录
export class SignRecord extends $tea.Model {
  // 合同类型：标准、自定义
  contractType: string;
  // 签约模式：ENTITY_SEAL（实体章）、ELECTRONIC_SEAL（电子章）
  sealMode: string;
  // 签约状态
  signStatus: string;
  // 签约记录关联的文件信息
  files: PartnerSignFile[];
  static names(): { [key: string]: string } {
    return {
      contractType: 'contract_type',
      sealMode: 'seal_mode',
      signStatus: 'sign_status',
      files: 'files',
    };
  }

  static types(): { [key: string]: any } {
    return {
      contractType: 'string',
      sealMode: 'string',
      signStatus: 'string',
      files: { 'type': 'array', 'itemType': PartnerSignFile },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 支出结算规则
export class ExpenditureSettlementRule extends $tea.Model {
  // 支付方式
  //     Alipay("01","Alipay","ALIPAYACCOUNT", "企业支付宝账号"),
  //     BankCard("02","BankCard", "BANKCARD", "银行卡账号")
  payType: string;
  // 银行卡账号
  bankNo?: string;
  // 银行用户名称
  bankAccountName?: string;
  // 开户行支行名称
  bankBranchName?: string;
  // 支付宝账号
  alipayAccount?: string;
  static names(): { [key: string]: string } {
    return {
      payType: 'pay_type',
      bankNo: 'bank_no',
      bankAccountName: 'bank_account_name',
      bankBranchName: 'bank_branch_name',
      alipayAccount: 'alipay_account',
    };
  }

  static types(): { [key: string]: any } {
    return {
      payType: 'string',
      bankNo: 'string',
      bankAccountName: 'string',
      bankBranchName: 'string',
      alipayAccount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 支出配置单商品
export class ExpenditureQuotationOffer extends $tea.Model {
  // 支出配置单商品主键id
  id?: number;
  // 一客一价
  personalPrice?: ExpenditureQuotationOfferPrice[];
  // 外部业务单据号
  outBusinessNo?: string;
  // 支出订购id
  arrangementNo?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      personalPrice: 'personal_price',
      outBusinessNo: 'out_business_no',
      arrangementNo: 'arrangement_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      personalPrice: { 'type': 'array', 'itemType': ExpenditureQuotationOfferPrice },
      outBusinessNo: 'string',
      arrangementNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 支出配置单
export class ExpenditureQuotation extends $tea.Model {
  // 支出配置单商品
  quotationOffers?: ExpenditureQuotationOffer[];
  static names(): { [key: string]: string } {
    return {
      quotationOffers: 'quotation_offers',
    };
  }

  static types(): { [key: string]: any } {
    return {
      quotationOffers: { 'type': 'array', 'itemType': ExpenditureQuotationOffer },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合作方（伙伴、商家）基本信息
export class PartnerBasicInformation extends $tea.Model {
  // 行业类型，值列表详见文档：https://yuque.antfin-inc.com/docs/share/684c97a8-bd5f-40e0-aab6-a1a69bc3d881?#
  industry: string;
  // 企业法人
  enterpriseLegalPerson: string;
  // 注册资本
  registeredCapital: string;
  // 人员规模
  employeeCount: string;
  // 企业注册省份
  enterpriseRegisterProvince: string;
  // 企业注册城市
  enterpriseRegisterCity: string;
  // 公司官网地址
  companyUrl: string;
  // 是否上市公司
  listed: boolean;
  // 企业简介
  briefIntroduction: string;
  // 二级行业，值列表详见文档：https://yuque.antfin-inc.com/docs/share/684c97a8-bd5f-40e0-aab6-a1a69bc3d881?# 《合作方企业基本信息说明》
  subIndustry?: string;
  static names(): { [key: string]: string } {
    return {
      industry: 'industry',
      enterpriseLegalPerson: 'enterprise_legal_person',
      registeredCapital: 'registered_capital',
      employeeCount: 'employee_count',
      enterpriseRegisterProvince: 'enterprise_register_province',
      enterpriseRegisterCity: 'enterprise_register_city',
      companyUrl: 'company_url',
      listed: 'listed',
      briefIntroduction: 'brief_introduction',
      subIndustry: 'sub_industry',
    };
  }

  static types(): { [key: string]: any } {
    return {
      industry: 'string',
      enterpriseLegalPerson: 'string',
      registeredCapital: 'string',
      employeeCount: 'string',
      enterpriseRegisterProvince: 'string',
      enterpriseRegisterCity: 'string',
      companyUrl: 'string',
      listed: 'boolean',
      briefIntroduction: 'string',
      subIndustry: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 支出合同
export class ExpenditureContract extends $tea.Model {
  // 支出合同id
  contractId: string;
  // 支出合同名称
  contractName: string;
  // 合同状态：
  //     INIT("INIT","草稿", ""),
  //     VALID("VALID","正式", ""),
  //     INVALID("INVALID","作废", ""),
  //     AUDIT_ING("AUDIT_ING", "审核中","STARTED"),
  //     AUDIT_SUCCESS("AUDIT_SUCCESS", "审核成功","AGREED"),
  //     AUDIT_FAIL("AUDIT_FAIL", "审核不通过", "DISAGREE"),
  status: string;
  // 有效期开始时间
  gmtStart?: string;
  // 有效期结束时间
  gmtEnd?: string;
  // 签约记录
  signingRecord?: SignRecord;
  // 支出结算规则
  settlementRule?: ExpenditureSettlementRule;
  // 扩展信息
  extendInfo?: string;
  static names(): { [key: string]: string } {
    return {
      contractId: 'contract_id',
      contractName: 'contract_name',
      status: 'status',
      gmtStart: 'gmt_start',
      gmtEnd: 'gmt_end',
      signingRecord: 'signing_record',
      settlementRule: 'settlement_rule',
      extendInfo: 'extend_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      contractId: 'string',
      contractName: 'string',
      status: 'string',
      gmtStart: 'string',
      gmtEnd: 'string',
      signingRecord: SignRecord,
      settlementRule: ExpenditureSettlementRule,
      extendInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合作方（伙伴、商家）联系信息
export class PartnerContactInformation extends $tea.Model {
  // 企业联系人姓名
  name: string;
  // 企业联系人手机
  phone: string;
  // 企业联系邮箱
  email: string;
  // 通信邮编
  postCode: string;
  // 通信地址
  address: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      phone: 'phone',
      email: 'email',
      postCode: 'post_code',
      address: 'address',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      phone: 'string',
      email: 'string',
      postCode: 'string',
      address: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 支出配置单对象
export class ExpenditureQuotationItem extends $tea.Model {
  // 外部唯一id，sku-id
  outUniqueId: string;
  // 配置单商品名称
  name: string;
  // 支出配置单对象描述
  description: string;
  // 预估交易金额（分）
  predictTransactionAmount: number;
  static names(): { [key: string]: string } {
    return {
      outUniqueId: 'out_unique_id',
      name: 'name',
      description: 'description',
      predictTransactionAmount: 'predict_transaction_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      outUniqueId: 'string',
      name: 'string',
      description: 'string',
      predictTransactionAmount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 结算请求
export class SettlementRequest extends $tea.Model {
  // 结算方式：
  // 企业支付宝账号 Alipay
  // 银行卡账号 BankCard
  payType: string;
  // 银行卡账号
  bankNo?: string;
  // 银行卡用户名称
  bankAccountName?: string;
  // 银行支行名称
  bankBranchName?: string;
  // 支付宝账号
  alipayAccount?: string;
  static names(): { [key: string]: string } {
    return {
      payType: 'pay_type',
      bankNo: 'bank_no',
      bankAccountName: 'bank_account_name',
      bankBranchName: 'bank_branch_name',
      alipayAccount: 'alipay_account',
    };
  }

  static types(): { [key: string]: any } {
    return {
      payType: 'string',
      bankNo: 'string',
      bankAccountName: 'string',
      bankBranchName: 'string',
      alipayAccount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 银行支行信息
export class PbcInfo extends $tea.Model {
  // 支行名称
  branchName: string;
  // 联行号数据
  bankCode: string;
  static names(): { [key: string]: string } {
    return {
      branchName: 'branch_name',
      bankCode: 'bank_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      branchName: 'string',
      bankCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品及归属政策相关信息
export class CommodityPolicyRelation extends $tea.Model {
  // 商品code
  commodityCode: string;
  // 政策ID
  policyId: string;
  static names(): { [key: string]: string } {
    return {
      commodityCode: 'commodity_code',
      policyId: 'policy_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      commodityCode: 'string',
      policyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 参与人
export class Participant extends $tea.Model {
  // 参与人角色
  role: string;
  // 参与人工号
  workNo: string;
  static names(): { [key: string]: string } {
    return {
      role: 'role',
      workNo: 'work_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      role: 'string',
      workNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合作方标准合同查询扩展选项
export class PartnerStandardContractQueryOption extends $tea.Model {
  // 是否渲染
  renderContract: boolean;
  // 合同渲染上下文，jsonString格式，key值需要提前约定好	
  // 
  renderContext: string;
  static names(): { [key: string]: string } {
    return {
      renderContract: 'render_contract',
      renderContext: 'render_context',
    };
  }

  static types(): { [key: string]: any } {
    return {
      renderContract: 'boolean',
      renderContext: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 支出配置单请求
export class ExpenditureQuotationRequest extends $tea.Model {
  // 定价模式：
  //     Standard("Standard", "标准价"),
  //     Customer("Customer", "自定义价格"),
  priceMode: string;
  // 支出配置单对象列表
  quotationItems: ExpenditureQuotationItem[];
  static names(): { [key: string]: string } {
    return {
      priceMode: 'price_mode',
      quotationItems: 'quotation_items',
    };
  }

  static types(): { [key: string]: any } {
    return {
      priceMode: 'string',
      quotationItems: { 'type': 'array', 'itemType': ExpenditureQuotationItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 省份信息
export class Province extends $tea.Model {
  // 省份名称
  provinceName: string;
  static names(): { [key: string]: string } {
    return {
      provinceName: 'province_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      provinceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 支出项目
export class ExpenditureProject extends $tea.Model {
  // 项目阶段：   
  //     REQUIREMENT_CONFIRM("REQUIREMENT_CONFIRM", "需求确认", "SOLUTION"),
  //     SOLUTION("SOLUTION", "方案沟通", "TALKS"),
  //     TALKS("TALKS", "商务谈判", "SIGNED"),
  //     SIGNED("SIGNED", "签约完成", "SIGNED"),
  //     ABORT("ABORT", "项目终止", "ABORT"),
  // 
  stage: string;
  // 项目状态：
  //     DOING("DOING","进行中"),
  //     ABORTED("ABORTED","已终止"),
  //     FINISHED("FINISHED","已完成"),
  status: string;
  // 支出合同信息
  contract?: ExpenditureContract;
  // 支出配置单信息
  quotation?: ExpenditureQuotation;
  // 合作计划id
  collaborationPlanId?: number;
  static names(): { [key: string]: string } {
    return {
      stage: 'stage',
      status: 'status',
      contract: 'contract',
      quotation: 'quotation',
      collaborationPlanId: 'collaboration_plan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      stage: 'string',
      status: 'string',
      contract: ExpenditureContract,
      quotation: ExpenditureQuotation,
      collaborationPlanId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 银行顶级机构信息
export class Institution extends $tea.Model {
  // 机构id
  instId: string;
  // 机构名称
  instName: string;
  // 机构code
  instCode: string;
  static names(): { [key: string]: string } {
    return {
      instId: 'inst_id',
      instName: 'inst_name',
      instCode: 'inst_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instId: 'string',
      instName: 'string',
      instCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 城市信息
export class City extends $tea.Model {
  // 城市名称
  cityName: string;
  static names(): { [key: string]: string } {
    return {
      cityName: 'city_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cityName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合作方（伙伴、商家）信息
export class PartnerInformation extends $tea.Model {
  // 合作方（商家、伙伴）用户id
  tenantId: string;
  // 合作方（商家、伙伴）基本信息
  basicInformation: PartnerBasicInformation;
  // 联系信息
  contactInformation: PartnerContactInformation;
  // 除约定属性外的，其余商家主要信息
  extendInfo?: string;
  static names(): { [key: string]: string } {
    return {
      tenantId: 'tenant_id',
      basicInformation: 'basic_information',
      contactInformation: 'contact_information',
      extendInfo: 'extend_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tenantId: 'string',
      basicInformation: PartnerBasicInformation,
      contactInformation: PartnerContactInformation,
      extendInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合作方标准合同版本信息
export class PartnerStandardContractVersion extends $tea.Model {
  // 协议名称
  name: string;
  // 协议可预览地址
  previewUrl: string;
  // 协议版本
  version: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      previewUrl: 'preview_url',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      previewUrl: 'string',
      version: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签约请求
export class SignRequest extends $tea.Model {
  // 合同类型
  contractType: string;
  // 签约模式
  sealMode: string;
  static names(): { [key: string]: string } {
    return {
      contractType: 'contract_type',
      sealMode: 'seal_mode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      contractType: 'string',
      sealMode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEcoCommodityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户name
  tenantName: string;
  // 商品信息列表
  offerCodes: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenantName: 'tenant_name',
      offerCodes: 'offer_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenantName: 'string',
      offerCodes: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEcoCommodityResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商品及其归属政策信息
  commodityPolicyInfo?: CommodityPolicyRelation[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      commodityPolicyInfo: 'commodity_policy_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      commodityPolicyInfo: { 'type': 'array', 'itemType': CommodityPolicyRelation },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyPartnerSettleinRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户来源-用于租户隔离
  source: string;
  // 入驻的一级伙伴类型
  l1PartnerType: string;
  // 入驻的二级合作类型
  l2PartnerType: string;
  // 入驻申请业务单据号-幂等使用
  businessNo: string;
  // 合作方信息
  partnerInformation: PartnerInformation;
  // 参与人列表
  participants: Participant[];
  // 签约请求
  signRequest: SignRequest;
  // 入驻申请扩展信息
  extendInfo?: string;
  // 入驻申请时间
  applyTime: string;
  // 入驻申请类型：新签、改签、续签
  applyOperateType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      source: 'source',
      l1PartnerType: 'l1_partner_type',
      l2PartnerType: 'l2_partner_type',
      businessNo: 'business_no',
      partnerInformation: 'partner_information',
      participants: 'participants',
      signRequest: 'sign_request',
      extendInfo: 'extend_info',
      applyTime: 'apply_time',
      applyOperateType: 'apply_operate_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      source: 'string',
      l1PartnerType: 'string',
      l2PartnerType: 'string',
      businessNo: 'string',
      partnerInformation: PartnerInformation,
      participants: { 'type': 'array', 'itemType': Participant },
      signRequest: SignRequest,
      extendInfo: 'string',
      applyTime: 'string',
      applyOperateType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyPartnerSettleinResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果编码
  code?: string;
  // 错误描述
  errorMessage?: string;
  // 入驻申请记录id
  applyId?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errorMessage: 'error_message',
      applyId: 'apply_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      errorMessage: 'string',
      applyId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelPartnerSettleinRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户来源-用于租户隔离
  source: string;
  // 入驻申请id
  applyId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      source: 'source',
      applyId: 'apply_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      source: 'string',
      applyId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelPartnerSettleinResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果码
  code?: string;
  // 错误描述
  errorMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errorMessage: 'error_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      errorMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPartnerSettleinRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户来源-用于租户隔离
  source: string;
  // 入驻申请时，返回的申请id
  applyId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      source: 'source',
      applyId: 'apply_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      source: 'string',
      applyId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPartnerSettleinResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果码
  code?: string;
  // 错误描述
  errorMessage?: string;
  // 签约状态
  status?: string;
  // 开始时间
  gmtStart?: string;
  // 结束时间
  gmtEnd?: string;
  // 签约信息
  signRecord?: SignRecord;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errorMessage: 'error_message',
      status: 'status',
      gmtStart: 'gmt_start',
      gmtEnd: 'gmt_end',
      signRecord: 'sign_record',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      errorMessage: 'string',
      status: 'string',
      gmtStart: 'string',
      gmtEnd: 'string',
      signRecord: SignRecord,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySettleinContractRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户来源-用户租户间功能和数据隔离
  source: string;
  // 一级合作类型
  l1PartnerType: string;
  // 二级合作类型
  l2PartnerType: string;
  // 伙伴标准合同查询扩展选项
  option?: PartnerStandardContractQueryOption;
  // 合同渲染上下文，jsonString格式，key值需要提前约定好
  renderContext?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      source: 'source',
      l1PartnerType: 'l1_partner_type',
      l2PartnerType: 'l2_partner_type',
      option: 'option',
      renderContext: 'render_context',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      source: 'string',
      l1PartnerType: 'string',
      l2PartnerType: 'string',
      option: PartnerStandardContractQueryOption,
      renderContext: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySettleinContractResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果码
  code?: string;
  // 错误描述
  errorMessage?: string;
  // 生效的标准合同版本
  validVersion?: PartnerStandardContractVersion;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errorMessage: 'error_message',
      validVersion: 'valid_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      errorMessage: 'string',
      validVersion: PartnerStandardContractVersion,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateExpenditureProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户来源-用于租户间功能和数据隔离
  source: string;
  // 合作计划id
  cooperationPlanId: number;
  // 业务单据号-用于幂等
  businessNo: string;
  // 合作方-用户id
  tenantId: string;
  // 参与人列表
  participants: Participant[];
  // 支出配置单请求信息
  expenditureQuotationRequest: ExpenditureQuotationRequest;
  // 签约请求
  signRequest: SignRequest;
  // 结算请求
  settlementRequest: SettlementRequest;
  // 生效时间
  validTime?: string;
  // 失效时间
  invalidTime: string;
  // 扩展信息
  extendInfo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      source: 'source',
      cooperationPlanId: 'cooperation_plan_id',
      businessNo: 'business_no',
      tenantId: 'tenant_id',
      participants: 'participants',
      expenditureQuotationRequest: 'expenditure_quotation_request',
      signRequest: 'sign_request',
      settlementRequest: 'settlement_request',
      validTime: 'valid_time',
      invalidTime: 'invalid_time',
      extendInfo: 'extend_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      source: 'string',
      cooperationPlanId: 'number',
      businessNo: 'string',
      tenantId: 'string',
      participants: { 'type': 'array', 'itemType': Participant },
      expenditureQuotationRequest: ExpenditureQuotationRequest,
      signRequest: SignRequest,
      settlementRequest: SettlementRequest,
      validTime: 'string',
      invalidTime: 'string',
      extendInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateExpenditureProjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果码
  code?: string;
  // 错误描述
  errorMessage?: string;
  // 项目id，用于后续交互使用
  projectId?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errorMessage: 'error_message',
      projectId: 'project_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      errorMessage: 'string',
      projectId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryExpenditureProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户来源-用于租户间功能和数据的隔离
  source: string;
  // 项目id
  projectId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      source: 'source',
      projectId: 'project_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      source: 'string',
      projectId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryExpenditureProjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果码
  code?: string;
  // 错误描述
  errorMessage?: string;
  // 支出项目信息
  detail?: ExpenditureProject;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errorMessage: 'error_message',
      detail: 'detail',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      errorMessage: 'string',
      detail: ExpenditureProject,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelExpenditureProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户来源-用于租户间功能和数据的隔离
  source: string;
  // 项目id
  projectId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      source: 'source',
      projectId: 'project_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      source: 'string',
      projectId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelExpenditureProjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果码
  code?: string;
  // 错误描述
  errorMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errorMessage: 'error_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      errorMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmExpenditureProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户
  source: string;
  // 项目id
  projectId: number;
  // 客户确认时间
  confirmTime: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      source: 'source',
      projectId: 'project_id',
      confirmTime: 'confirm_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      source: 'string',
      projectId: 'number',
      confirmTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmExpenditureProjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果码
  code?: string;
  // 错误描述
  errorMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errorMessage: 'error_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      errorMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryStandardAgreementRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户来源-用户租户间功能和数据隔离
  source: string;
  // 一级合作类型
  // 
  l1PartnerType: string;
  // 二级合作类型
  l2PartnerType: string;
  // 标准额合同场景
  scene: string;
  // 伙伴标准合同查询扩展选项
  // 
  option?: PartnerStandardContractQueryOption;
  // 合同渲染上下文，jsonString格式，key值需要提前约定好
  renderContext?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      source: 'source',
      l1PartnerType: 'l1_partner_type',
      l2PartnerType: 'l2_partner_type',
      scene: 'scene',
      option: 'option',
      renderContext: 'render_context',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      source: 'string',
      l1PartnerType: 'string',
      l2PartnerType: 'string',
      scene: 'string',
      option: PartnerStandardContractQueryOption,
      renderContext: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryStandardAgreementResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果码
  code?: string;
  // 错误描述
  errorMessage?: string;
  // 生效的标准合同版本
  validVersion?: PartnerStandardContractVersion;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errorMessage: 'error_message',
      validVersion: 'valid_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      errorMessage: 'string',
      validVersion: PartnerStandardContractVersion,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAreaProvinceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 省份, 空:全部省份, 不为空筛选关键字省份
  province?: string;
  // 租户来源-用于租户间功能和数据的隔离
  source: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      province: 'province',
      source: 'source',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      province: 'string',
      source: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAreaProvinceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 省份信息列表
  provinces?: Province[];
  // 错误描述
  errorMessage?: string;
  // 结果码
  code?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      provinces: 'provinces',
      errorMessage: 'error_message',
      code: 'code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      provinces: { 'type': 'array', 'itemType': Province },
      errorMessage: 'string',
      code: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAreaCityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 省份名称
  province: string;
  // 城市
  city?: string;
  // 租户来源-用于租户间功能和数据的隔离
  source: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      province: 'province',
      city: 'city',
      source: 'source',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      province: 'string',
      city: 'string',
      source: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAreaCityResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 城市列表
  cities?: City[];
  // 结果码
  code?: string;
  // 错误描述
  errorMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      cities: 'cities',
      code: 'code',
      errorMessage: 'error_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      cities: { 'type': 'array', 'itemType': City },
      code: 'string',
      errorMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPbcInstitutionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 机构名称关键字
  instName: string;
  // 租户来源-用于租户间功能和数据的隔离
  source: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      instName: 'inst_name',
      source: 'source',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      instName: 'string',
      source: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPbcInstitutionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 银行机构信息列表
  institutions?: Institution[];
  // 结果码
  code?: string;
  // 错误描述
  errorMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      institutions: 'institutions',
      code: 'code',
      errorMessage: 'error_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      institutions: { 'type': 'array', 'itemType': Institution },
      code: 'string',
      errorMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPbcNameRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 省份名称
  province: string;
  // 城市名称
  city: string;
  // 银行机构id
  instId: string;
  // 支行名称关键字
  branchName: string;
  // 租户来源-用于租户间功能和数据的隔离
  source: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      province: 'province',
      city: 'city',
      instId: 'inst_id',
      branchName: 'branch_name',
      source: 'source',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      province: 'string',
      city: 'string',
      instId: 'string',
      branchName: 'string',
      source: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPbcNameResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询到的支行信息列表
  pbcInfos?: PbcInfo[];
  // 错误描述
  errorMessage?: string;
  // 结果码
  code?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pbcInfos: 'pbc_infos',
      errorMessage: 'error_message',
      code: 'code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pbcInfos: { 'type': 'array', 'itemType': PbcInfo },
      errorMessage: 'string',
      code: 'string',
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
          sdk_version: "1.0.21",
          _prod_code: "PARTNER",
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
   * Description: 获取合作伙伴销售商品对应的政策ID
   * Summary: 获取合作伙伴销售商品对应的政策ID
   */
  async queryEcoCommodity(request: QueryEcoCommodityRequest): Promise<QueryEcoCommodityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEcoCommodityEx(request, headers, runtime);
  }

  /**
   * Description: 获取合作伙伴销售商品对应的政策ID
   * Summary: 获取合作伙伴销售商品对应的政策ID
   */
  async queryEcoCommodityEx(request: QueryEcoCommodityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEcoCommodityResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEcoCommodityResponse>(await this.doRequest("1.0", "antcloud.partner.eco.commodity.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEcoCommodityResponse({}));
  }

  /**
   * Description: 合作方（伙伴、商家等）入驻申请
   * Summary: 合作方（伙伴、商家等）入驻申请
   */
  async applyPartnerSettlein(request: ApplyPartnerSettleinRequest): Promise<ApplyPartnerSettleinResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyPartnerSettleinEx(request, headers, runtime);
  }

  /**
   * Description: 合作方（伙伴、商家等）入驻申请
   * Summary: 合作方（伙伴、商家等）入驻申请
   */
  async applyPartnerSettleinEx(request: ApplyPartnerSettleinRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyPartnerSettleinResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyPartnerSettleinResponse>(await this.doRequest("1.0", "antcloud.partner.partner.settlein.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyPartnerSettleinResponse({}));
  }

  /**
   * Description: 合作方（伙伴、商家等）入驻撤销
   * Summary: 合作方（伙伴、商家等）入驻撤销
   */
  async cancelPartnerSettlein(request: CancelPartnerSettleinRequest): Promise<CancelPartnerSettleinResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelPartnerSettleinEx(request, headers, runtime);
  }

  /**
   * Description: 合作方（伙伴、商家等）入驻撤销
   * Summary: 合作方（伙伴、商家等）入驻撤销
   */
  async cancelPartnerSettleinEx(request: CancelPartnerSettleinRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelPartnerSettleinResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelPartnerSettleinResponse>(await this.doRequest("1.0", "antcloud.partner.partner.settlein.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelPartnerSettleinResponse({}));
  }

  /**
   * Description: 合作方（伙伴、商家等）入驻申请结果查询
   * Summary: 合作方（伙伴、商家等）入驻申请结果查询
   */
  async queryPartnerSettlein(request: QueryPartnerSettleinRequest): Promise<QueryPartnerSettleinResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPartnerSettleinEx(request, headers, runtime);
  }

  /**
   * Description: 合作方（伙伴、商家等）入驻申请结果查询
   * Summary: 合作方（伙伴、商家等）入驻申请结果查询
   */
  async queryPartnerSettleinEx(request: QueryPartnerSettleinRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPartnerSettleinResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPartnerSettleinResponse>(await this.doRequest("1.0", "antcloud.partner.partner.settlein.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPartnerSettleinResponse({}));
  }

  /**
   * Description: 合作方（伙伴、商家等）入驻标准合同查询
   * Summary: 合作方（伙伴、商家等）入驻标准合同查询
   */
  async querySettleinContract(request: QuerySettleinContractRequest): Promise<QuerySettleinContractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySettleinContractEx(request, headers, runtime);
  }

  /**
   * Description: 合作方（伙伴、商家等）入驻标准合同查询
   * Summary: 合作方（伙伴、商家等）入驻标准合同查询
   */
  async querySettleinContractEx(request: QuerySettleinContractRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySettleinContractResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySettleinContractResponse>(await this.doRequest("1.0", "antcloud.partner.settlein.contract.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySettleinContractResponse({}));
  }

  /**
   * Description: 合作方（伙伴、商家等）支出项目创建接口
   * Summary: 合作方（伙伴、商家等）支出项目创建接口
   */
  async createExpenditureProject(request: CreateExpenditureProjectRequest): Promise<CreateExpenditureProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createExpenditureProjectEx(request, headers, runtime);
  }

  /**
   * Description: 合作方（伙伴、商家等）支出项目创建接口
   * Summary: 合作方（伙伴、商家等）支出项目创建接口
   */
  async createExpenditureProjectEx(request: CreateExpenditureProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateExpenditureProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateExpenditureProjectResponse>(await this.doRequest("1.0", "antcloud.partner.expenditure.project.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateExpenditureProjectResponse({}));
  }

  /**
   * Description: 合作方（伙伴、商家等）支出项目查询接口
   * Summary: 合作方（伙伴、商家等）支出项目查询接口
   */
  async queryExpenditureProject(request: QueryExpenditureProjectRequest): Promise<QueryExpenditureProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryExpenditureProjectEx(request, headers, runtime);
  }

  /**
   * Description: 合作方（伙伴、商家等）支出项目查询接口
   * Summary: 合作方（伙伴、商家等）支出项目查询接口
   */
  async queryExpenditureProjectEx(request: QueryExpenditureProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryExpenditureProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryExpenditureProjectResponse>(await this.doRequest("1.0", "antcloud.partner.expenditure.project.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryExpenditureProjectResponse({}));
  }

  /**
   * Description: 合作方（伙伴、商家等）支出项目撤销接口
   * Summary: 合作方（伙伴、商家等）支出项目撤销接口
   */
  async cancelExpenditureProject(request: CancelExpenditureProjectRequest): Promise<CancelExpenditureProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelExpenditureProjectEx(request, headers, runtime);
  }

  /**
   * Description: 合作方（伙伴、商家等）支出项目撤销接口
   * Summary: 合作方（伙伴、商家等）支出项目撤销接口
   */
  async cancelExpenditureProjectEx(request: CancelExpenditureProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelExpenditureProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelExpenditureProjectResponse>(await this.doRequest("1.0", "antcloud.partner.expenditure.project.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelExpenditureProjectResponse({}));
  }

  /**
   * Description: 支出项目合同确认接口
   * Summary: 支出项目合同确认接口
   */
  async confirmExpenditureProject(request: ConfirmExpenditureProjectRequest): Promise<ConfirmExpenditureProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmExpenditureProjectEx(request, headers, runtime);
  }

  /**
   * Description: 支出项目合同确认接口
   * Summary: 支出项目合同确认接口
   */
  async confirmExpenditureProjectEx(request: ConfirmExpenditureProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmExpenditureProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmExpenditureProjectResponse>(await this.doRequest("1.0", "antcloud.partner.expenditure.project.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmExpenditureProjectResponse({}));
  }

  /**
   * Description: 合作方（伙伴、商家等）标准额合同查询接口
   * Summary: 合作方（伙伴、商家等）标准额合同查询接口
   */
  async queryStandardAgreement(request: QueryStandardAgreementRequest): Promise<QueryStandardAgreementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryStandardAgreementEx(request, headers, runtime);
  }

  /**
   * Description: 合作方（伙伴、商家等）标准额合同查询接口
   * Summary: 合作方（伙伴、商家等）标准额合同查询接口
   */
  async queryStandardAgreementEx(request: QueryStandardAgreementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryStandardAgreementResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryStandardAgreementResponse>(await this.doRequest("1.0", "antcloud.partner.standard.agreement.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryStandardAgreementResponse({}));
  }

  /**
   * Description: 生态伙伴区域省份查询接口
   * Summary: 生态伙伴区域省份查询接口
   */
  async queryAreaProvince(request: QueryAreaProvinceRequest): Promise<QueryAreaProvinceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAreaProvinceEx(request, headers, runtime);
  }

  /**
   * Description: 生态伙伴区域省份查询接口
   * Summary: 生态伙伴区域省份查询接口
   */
  async queryAreaProvinceEx(request: QueryAreaProvinceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAreaProvinceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAreaProvinceResponse>(await this.doRequest("1.0", "antcloud.partner.area.province.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAreaProvinceResponse({}));
  }

  /**
   * Description: 合作方（伙伴、商家等）区域信息查询-指定身份关联的城市信息
   * Summary: 合作方（伙伴、商家等）区域信息查询
   */
  async queryAreaCity(request: QueryAreaCityRequest): Promise<QueryAreaCityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAreaCityEx(request, headers, runtime);
  }

  /**
   * Description: 合作方（伙伴、商家等）区域信息查询-指定身份关联的城市信息
   * Summary: 合作方（伙伴、商家等）区域信息查询
   */
  async queryAreaCityEx(request: QueryAreaCityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAreaCityResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAreaCityResponse>(await this.doRequest("1.0", "antcloud.partner.area.city.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAreaCityResponse({}));
  }

  /**
   * Description: 联行号关联银行机构信息查询
   * Summary: 联行号关联银行机构信息查询
   */
  async queryPbcInstitution(request: QueryPbcInstitutionRequest): Promise<QueryPbcInstitutionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPbcInstitutionEx(request, headers, runtime);
  }

  /**
   * Description: 联行号关联银行机构信息查询
   * Summary: 联行号关联银行机构信息查询
   */
  async queryPbcInstitutionEx(request: QueryPbcInstitutionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPbcInstitutionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPbcInstitutionResponse>(await this.doRequest("1.0", "antcloud.partner.pbc.institution.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPbcInstitutionResponse({}));
  }

  /**
   * Description: 输入联行号相关的省市以及机构名称，通过支行名称进行模糊查询联行号相关信息
   * Summary: 合作方（伙伴、商家等）支行信息查询
   */
  async queryPbcName(request: QueryPbcNameRequest): Promise<QueryPbcNameResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPbcNameEx(request, headers, runtime);
  }

  /**
   * Description: 输入联行号相关的省市以及机构名称，通过支行名称进行模糊查询联行号相关信息
   * Summary: 合作方（伙伴、商家等）支行信息查询
   */
  async queryPbcNameEx(request: QueryPbcNameRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPbcNameResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPbcNameResponse>(await this.doRequest("1.0", "antcloud.partner.pbc.name.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPbcNameResponse({}));
  }

}
