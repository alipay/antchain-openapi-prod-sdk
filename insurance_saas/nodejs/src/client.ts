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

// 文件结构
export class FileNode extends $tea.Model {
  // 可访问的文件链接
  url: string;
  // 文件名
  name: string;
  static names(): { [key: string]: string } {
    return {
      url: 'url',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      url: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 被保人
export class Insured extends $tea.Model {
  // 被保人名称
  insuredName: string;
  // 被保人证件类型
  insuredCardType: string;
  // 被保人证件号码
  insuredCardCode: string;
  // 被保人联系方式
  insuredContactInfo?: string;
  static names(): { [key: string]: string } {
    return {
      insuredName: 'insured_name',
      insuredCardType: 'insured_card_type',
      insuredCardCode: 'insured_card_code',
      insuredContactInfo: 'insured_contact_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      insuredName: 'string',
      insuredCardType: 'string',
      insuredCardCode: 'string',
      insuredContactInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 投保人
export class Applicant extends $tea.Model {
  // 投保人名称
  applicantName: string;
  // 投保人证件类型
  applicantCardType: string;
  // 投保人证件号码
  applicantCardCode: string;
  // 投保人联系方式
  applicantContactInfo?: string;
  static names(): { [key: string]: string } {
    return {
      applicantName: 'applicant_name',
      applicantCardType: 'applicant_card_type',
      applicantCardCode: 'applicant_card_code',
      applicantContactInfo: 'applicant_contact_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      applicantName: 'string',
      applicantCardType: 'string',
      applicantCardCode: 'string',
      applicantContactInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 委托险种信息
export class EntrustGuaranteeProduct extends $tea.Model {
  // 保障失效时间
  guaranteeExpiryDate: number;
  // 保障生效时间
  guaranteeEffectiveDate: number;
  // 保险等待期结束时间
  waitingPeriodDeadLine?: number;
  // 保单号
  policyNo?: string;
  // 平台定义产品码值
  guaranteeProductCode?: string;
  // 保险公司的产品code
  insuranceProductCode?: string;
  // 保险公司的产品描述
  insuranceProductName?: string;
  static names(): { [key: string]: string } {
    return {
      guaranteeExpiryDate: 'guarantee_expiry_date',
      guaranteeEffectiveDate: 'guarantee_effective_date',
      waitingPeriodDeadLine: 'waiting_period_dead_line',
      policyNo: 'policy_no',
      guaranteeProductCode: 'guarantee_product_code',
      insuranceProductCode: 'insurance_product_code',
      insuranceProductName: 'insurance_product_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      guaranteeExpiryDate: 'number',
      guaranteeEffectiveDate: 'number',
      waitingPeriodDeadLine: 'number',
      policyNo: 'string',
      guaranteeProductCode: 'string',
      insuranceProductCode: 'string',
      insuranceProductName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInquiryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 询价id
  inquiryNoInner: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      inquiryNoInner: 'inquiry_no_inner',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      inquiryNoInner: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInquiryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 报价内容
  bizResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizResult: 'biz_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitInquiryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // inquiryNo
  inquiryNo: string;
  // 询价平台
  inquirePlatform: string;
  // 单次保额
  singleInsuranceAmount: string;
  // 总保额
  totalInsuranceAmount: string;
  // 询价基础材料列表
  materialList?: string;
  // 询价标的列表
  objectList?: string;
  // 保司编号
  insuranceCompanyNo: string;
  // 保险产品编码
  trustworthyValueInsuranceTypeCode: string;
  // 保司项目代码
  insuranceProjectCode: string;
  // 保司方案代码
  insuranceOptionsCode: string;
  // 询价人(名称、证件号、证件类型)
  inquirer: string;
  // 投保人(可空)
  applicant?: string;
  // 被保人列表(可空)
  insuredList?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      inquiryNo: 'inquiry_no',
      inquirePlatform: 'inquire_platform',
      singleInsuranceAmount: 'single_insurance_amount',
      totalInsuranceAmount: 'total_insurance_amount',
      materialList: 'material_list',
      objectList: 'object_list',
      insuranceCompanyNo: 'insurance_company_no',
      trustworthyValueInsuranceTypeCode: 'trustworthy_value_insurance_type_code',
      insuranceProjectCode: 'insurance_project_code',
      insuranceOptionsCode: 'insurance_options_code',
      inquirer: 'inquirer',
      applicant: 'applicant',
      insuredList: 'insured_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      inquiryNo: 'string',
      inquirePlatform: 'string',
      singleInsuranceAmount: 'string',
      totalInsuranceAmount: 'string',
      materialList: 'string',
      objectList: 'string',
      insuranceCompanyNo: 'string',
      trustworthyValueInsuranceTypeCode: 'string',
      insuranceProjectCode: 'string',
      insuranceOptionsCode: 'string',
      inquirer: 'string',
      applicant: 'string',
      insuredList: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitInquiryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 报价内容
  bizResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizResult: 'biz_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDataDisasterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 行政区域代码
  areaCode: string;
  // 灾害类型：df:⼤⻛，by:暴⾬，xz:雪灾
  disasterType: string;
  // 查询起始日期
  startDate: string;
  // 查询截止日期
  endDate: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      areaCode: 'area_code',
      disasterType: 'disaster_type',
      startDate: 'start_date',
      endDate: 'end_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      areaCode: 'string',
      disasterType: 'string',
      startDate: 'string',
      endDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDataDisasterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 历史灾害内容
  bizResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizResult: 'biz_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDataWeatherRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 行政区域代码
  areaCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      areaCode: 'area_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      areaCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDataWeatherResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 实时气象内容
  bizResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizResult: 'biz_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncQuoteRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 询价申请号
  inquiryNo?: string;
  // 询价平台
  inquirePlatform?: string;
  // 单次保额
  singleInsuranceAmount: string;
  // 总保额
  totalInsuranceAmount: string;
  // 询价基础材料
  materialList?: string;
  // 标的材料列表
  objectList?: string;
  // 保司编号
  insuranceCompanyNo: string;
  // 保险产品编码
  trustworthyValueInsuranceTypeCode: string;
  // 保司项目代码
  insuranceProjectCode: string;
  // 保司方案代码
  insuranceOptionsCode: string;
  // 询价人
  inquirer?: string;
  // 投保人
  applicant?: string;
  // 被保人列表
  insuredList?: string;
  // 报价结果
  quotation?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      inquiryNo: 'inquiry_no',
      inquirePlatform: 'inquire_platform',
      singleInsuranceAmount: 'single_insurance_amount',
      totalInsuranceAmount: 'total_insurance_amount',
      materialList: 'material_list',
      objectList: 'object_list',
      insuranceCompanyNo: 'insurance_company_no',
      trustworthyValueInsuranceTypeCode: 'trustworthy_value_insurance_type_code',
      insuranceProjectCode: 'insurance_project_code',
      insuranceOptionsCode: 'insurance_options_code',
      inquirer: 'inquirer',
      applicant: 'applicant',
      insuredList: 'insured_list',
      quotation: 'quotation',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      inquiryNo: 'string',
      inquirePlatform: 'string',
      singleInsuranceAmount: 'string',
      totalInsuranceAmount: 'string',
      materialList: 'string',
      objectList: 'string',
      insuranceCompanyNo: 'string',
      trustworthyValueInsuranceTypeCode: 'string',
      insuranceProjectCode: 'string',
      insuranceOptionsCode: 'string',
      inquirer: 'string',
      applicant: 'string',
      insuredList: 'string',
      quotation: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncQuoteResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务返回值
  bizResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizResult: 'biz_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyUnderwritingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 报价单编号（蚂蚁内部）
  quotationNoInner?: string;
  // 承保申请号（保司）
  insuranceApplicationNo: string;
  // 保司编码
  insuranceCompanyNo: string;
  // 保险产品编码
  trustworthyValueInsuranceTypeCode: string;
  // 保司项目代码
  insuranceProjectCode: string;
  // 保司方案代码
  insuranceOptionsCode: string;
  // 投保人信息(名称、证件号、证件类型)
  applicant: string;
  // 被保人列表(可空)
  insuredList?: string;
  // 受益人列表(可空)
  beneficiaryList?: string;
  // 投保标的列表
  objectList?: string;
  // 保险起期 yyyy-MM-dd HH:mm:ss
  insurancePeriodStart: string;
  // 保险止期 yyyy-MM-dd HH:mm:ss
  insurancePeriodEnd?: string;
  // 保期（天）
  insurancePeriod: number;
  // 申请保额， {
  // 		"cent": 20000,
  // 		"currency": "CNY"
  // 	}
  appliedInsuranceAmount: string;
  // 保费
  appliedPremium: string;
  // 保费费率
  premiumRate: string;
  // 承保申请的报价相关内容
  quotation?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      quotationNoInner: 'quotation_no_inner',
      insuranceApplicationNo: 'insurance_application_no',
      insuranceCompanyNo: 'insurance_company_no',
      trustworthyValueInsuranceTypeCode: 'trustworthy_value_insurance_type_code',
      insuranceProjectCode: 'insurance_project_code',
      insuranceOptionsCode: 'insurance_options_code',
      applicant: 'applicant',
      insuredList: 'insured_list',
      beneficiaryList: 'beneficiary_list',
      objectList: 'object_list',
      insurancePeriodStart: 'insurance_period_start',
      insurancePeriodEnd: 'insurance_period_end',
      insurancePeriod: 'insurance_period',
      appliedInsuranceAmount: 'applied_insurance_amount',
      appliedPremium: 'applied_premium',
      premiumRate: 'premium_rate',
      quotation: 'quotation',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      quotationNoInner: 'string',
      insuranceApplicationNo: 'string',
      insuranceCompanyNo: 'string',
      trustworthyValueInsuranceTypeCode: 'string',
      insuranceProjectCode: 'string',
      insuranceOptionsCode: 'string',
      applicant: 'string',
      insuredList: 'string',
      beneficiaryList: 'string',
      objectList: 'string',
      insurancePeriodStart: 'string',
      insurancePeriodEnd: 'string',
      insurancePeriod: 'number',
      appliedInsuranceAmount: 'string',
      appliedPremium: 'string',
      premiumRate: 'string',
      quotation: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyUnderwritingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 承保申请结果
  bizResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizResult: 'biz_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUnderwritingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 承保申请号（蚂蚁内部）
  insuranceApplicationNoInner: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      insuranceApplicationNoInner: 'insurance_application_no_inner',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      insuranceApplicationNoInner: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUnderwritingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 承保申请结果
  bizResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizResult: 'biz_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPolicyFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 蚂蚁侧保单唯一ID
  insurancePolicyNoInner: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      insurancePolicyNoInner: 'insurance_policy_no_inner',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      insurancePolicyNoInner: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPolicyFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询的保单信息
  ossUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      ossUrl: 'oss_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      ossUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsureRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 投保申请号-外部，业务侧需保证唯一
  insuranceApplicationNo: string;
  // 保司编码
  insuranceCompanyNo: string;
  // 保险产品编码
  trustworthyValueInsuranceTypeCode: string;
  // 保司项目代码
  insuranceProjectCode: string;
  // 保司方案代码
  insuranceOptionsCode: string;
  // 投保人信息(名称-memberName、证件号-certNo、证件类型-certType、手机号-memberMobileNo)
  applicant: string;
  // 被保人列表(可空)，json格式参见投保人信息
  insuredList?: string;
  // 受益人列表(可空)
  beneficiaryList?: string;
  // 保险起期
  insurancePeriodStart: string;
  // 保险止期
  insurancePeriodEnd?: string;
  // 申请保额，支持多币种， { "cent": 10000, "currency": "CNY" }
  appliedInsuranceAmount: string;
  // 保期，单位：天
  insurancePeriod?: number;
  // 投保标的List，动态字段，根据险种所配置的标的传值
  insuredObjectList?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      insuranceApplicationNo: 'insurance_application_no',
      insuranceCompanyNo: 'insurance_company_no',
      trustworthyValueInsuranceTypeCode: 'trustworthy_value_insurance_type_code',
      insuranceProjectCode: 'insurance_project_code',
      insuranceOptionsCode: 'insurance_options_code',
      applicant: 'applicant',
      insuredList: 'insured_list',
      beneficiaryList: 'beneficiary_list',
      insurancePeriodStart: 'insurance_period_start',
      insurancePeriodEnd: 'insurance_period_end',
      appliedInsuranceAmount: 'applied_insurance_amount',
      insurancePeriod: 'insurance_period',
      insuredObjectList: 'insured_object_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      insuranceApplicationNo: 'string',
      insuranceCompanyNo: 'string',
      trustworthyValueInsuranceTypeCode: 'string',
      insuranceProjectCode: 'string',
      insuranceOptionsCode: 'string',
      applicant: 'string',
      insuredList: 'string',
      beneficiaryList: 'string',
      insurancePeriodStart: 'string',
      insurancePeriodEnd: 'string',
      appliedInsuranceAmount: 'string',
      insurancePeriod: 'number',
      insuredObjectList: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsureResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 投保申请结果，不同险种可能返回不同，具体参见相关文档
  bizResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizResult: 'biz_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyPolicyResultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 蚂蚁承保申请号
  insuranceApplicationNoInner: string;
  // 保单号
  policyNo: string;
  // 保额，JSON格式
  insuranceAmount: string;
  // 保费,json格式
  insurancePremium: string;
  // 保险起期 yyyy-MM-dd HH:mm:ss
  insurancePeriodStart: string;
  // 保险止期 yyyy-MM-dd HH:mm:ss
  insurancePeriodEnd: string;
  // 电子保单URL
  policyUrl?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      insuranceApplicationNoInner: 'insurance_application_no_inner',
      policyNo: 'policy_no',
      insuranceAmount: 'insurance_amount',
      insurancePremium: 'insurance_premium',
      insurancePeriodStart: 'insurance_period_start',
      insurancePeriodEnd: 'insurance_period_end',
      policyUrl: 'policy_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      insuranceApplicationNoInner: 'string',
      policyNo: 'string',
      insuranceAmount: 'string',
      insurancePremium: 'string',
      insurancePeriodStart: 'string',
      insurancePeriodEnd: 'string',
      policyUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyPolicyResultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 保单同步结果
  bizResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizResult: 'biz_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyClaimRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 报案单号
  claimNotificationFormNo: string;
  // 保单号
  insurancePolicyNo: string;
  // 保司编号
  insuranceCompanyNo: string;
  // 保险产品代码
  trustworthyValueInsuranceTypeCode?: string;
  // 保司项目代码
  insuranceOptionsCode?: string;
  //  保司项目代码
  insuranceProjectCode?: string;
  // 出险时间
  lossOccurredTime: string;
  // 出险原因
  lossOccurredReason: string;
  // 出险地点
  lossOccurredAddress: string;
  // 出险标的列表
  objectList?: string;
  // 报案金额
  claimNotificationAmountLocalCurrency: string;
  // 报案人
  reporter: string;
  // 报案材料列表
  materialList?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      claimNotificationFormNo: 'claim_notification_form_no',
      insurancePolicyNo: 'insurance_policy_no',
      insuranceCompanyNo: 'insurance_company_no',
      trustworthyValueInsuranceTypeCode: 'trustworthy_value_insurance_type_code',
      insuranceOptionsCode: 'insurance_options_code',
      insuranceProjectCode: 'insurance_project_code',
      lossOccurredTime: 'loss_occurred_time',
      lossOccurredReason: 'loss_occurred_reason',
      lossOccurredAddress: 'loss_occurred_address',
      objectList: 'object_list',
      claimNotificationAmountLocalCurrency: 'claim_notification_amount_local_currency',
      reporter: 'reporter',
      materialList: 'material_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      claimNotificationFormNo: 'string',
      insurancePolicyNo: 'string',
      insuranceCompanyNo: 'string',
      trustworthyValueInsuranceTypeCode: 'string',
      insuranceOptionsCode: 'string',
      insuranceProjectCode: 'string',
      lossOccurredTime: 'string',
      lossOccurredReason: 'string',
      lossOccurredAddress: 'string',
      objectList: 'string',
      claimNotificationAmountLocalCurrency: 'string',
      reporter: 'string',
      materialList: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyClaimResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 报案响应
  bizResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizResult: 'biz_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelClaimRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 报案单编号（蚂蚁内部）
  claimNotificationFormNoInner: string;
  // 报案撤销附加内容
  bizInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      claimNotificationFormNoInner: 'claim_notification_form_no_inner',
      bizInfo: 'biz_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      claimNotificationFormNoInner: 'string',
      bizInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelClaimResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // biz_result
  bizResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizResult: 'biz_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateClaimMaterialRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 报案单号（蚂蚁内部）
  claimNotificationFormNoInner: string;
  // 报案号（保司）
  claimNotificationNo: string;
  // 报案材料列表
  materialList: string;
  // 不传值，默认（1-已完毕）
  // 0：未完毕
  // 1：已完毕
  isFinished?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      claimNotificationFormNoInner: 'claim_notification_form_no_inner',
      claimNotificationNo: 'claim_notification_no',
      materialList: 'material_list',
      isFinished: 'is_finished',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      claimNotificationFormNoInner: 'string',
      claimNotificationNo: 'string',
      materialList: 'string',
      isFinished: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateClaimMaterialResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // biz_result
  bizResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizResult: 'biz_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmClaimSettleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 报案单编号（蚂蚁内部）
  claimNotificationFormNoInner: string;
  // 附加内容
  bizInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      claimNotificationFormNoInner: 'claim_notification_form_no_inner',
      bizInfo: 'biz_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      claimNotificationFormNoInner: 'string',
      bizInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmClaimSettleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // biz_result
  bizResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizResult: 'biz_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FinishClaimSettleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 报案单编号（蚂蚁内部）
  claimNotificationFormNoInner: string;
  // 报案号（保司）
  claimNotificationNo?: string;
  // 赔付受理结果：01--受理、02--拒赔
  acceptResult: string;
  // 受理结论
  acceptNote?: string;
  // 支付信息
  tradeInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      claimNotificationFormNoInner: 'claim_notification_form_no_inner',
      claimNotificationNo: 'claim_notification_no',
      acceptResult: 'accept_result',
      acceptNote: 'accept_note',
      tradeInfo: 'trade_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      claimNotificationFormNoInner: 'string',
      claimNotificationNo: 'string',
      acceptResult: 'string',
      acceptNote: 'string',
      tradeInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FinishClaimSettleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // biz_result
  bizResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizResult: 'biz_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyEndorsementStrategyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 承保申请编号（蚂蚁内部）
  insuranceApplicationNoInner: string;
  // 投保人信息(名称、证件号、证件类型)
  applicant?: string;
  // 被保人列表
  insuredList?: string;
  // 受益人列表
  beneficiaryList?: string;
  // 投保标的列表
  objectList?: string;
  // 保险起期 yyyy-MM-dd HH:mm:ss
  insurancePeriodStart?: string;
  // 保险止期 yyyy-MM-dd HH:mm:ss
  insurancePeriodEnd?: string;
  // 保期（天）
  insurancePeriod?: number;
  // 申请保额， { "cent": 20000, "currency": "CNY" }
  appliedInsuranceAmount?: string;
  // 保费， { "cent": 20000, "currency": "CNY" }
  appliedPremium?: string;
  // 保费费率
  premiumRate?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      insuranceApplicationNoInner: 'insurance_application_no_inner',
      applicant: 'applicant',
      insuredList: 'insured_list',
      beneficiaryList: 'beneficiary_list',
      objectList: 'object_list',
      insurancePeriodStart: 'insurance_period_start',
      insurancePeriodEnd: 'insurance_period_end',
      insurancePeriod: 'insurance_period',
      appliedInsuranceAmount: 'applied_insurance_amount',
      appliedPremium: 'applied_premium',
      premiumRate: 'premium_rate',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      insuranceApplicationNoInner: 'string',
      applicant: 'string',
      insuredList: 'string',
      beneficiaryList: 'string',
      objectList: 'string',
      insurancePeriodStart: 'string',
      insurancePeriodEnd: 'string',
      insurancePeriod: 'number',
      appliedInsuranceAmount: 'string',
      appliedPremium: 'string',
      premiumRate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyEndorsementStrategyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 承保申请结果
  bizResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizResult: 'biz_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncPolicyResultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 投保申请号-外部，业务侧需保证唯一
  insuranceApplicationNo: string;
  // 保司编码
  insuranceCompanyNo: string;
  // 保险产品编码
  trustworthyValueInsuranceTypeCode: string;
  // 保司项目代码
  insuranceProjectCode: string;
  // 保司方案代码
  insuranceOptionsCode: string;
  // 投保人信息(名称-memberName、证件号-certNo、证件类型-certType、手机号-memberMobileNo)
  applicant: string;
  // 被保人列表(可空)
  insuredList?: string;
  // 受益人列表(可空)
  beneficiaryList?: string;
  // 投保标的List，动态字段，根据险种所配置的标的传值
  objectList: string;
  // 保单号
  policyNo: string;
  // 保额，JSON格式
  insuranceAmount: string;
  // 保费,json格式
  // 
  insurancePremium: string;
  // 保险起期 yyyy-MM-dd HH:mm:ss
  insurancePeriodStart: string;
  // 保险止期 yyyy-MM-dd HH:mm:ss
  insurancePeriodEnd: string;
  // 电子保单URL
  policyUrl?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      insuranceApplicationNo: 'insurance_application_no',
      insuranceCompanyNo: 'insurance_company_no',
      trustworthyValueInsuranceTypeCode: 'trustworthy_value_insurance_type_code',
      insuranceProjectCode: 'insurance_project_code',
      insuranceOptionsCode: 'insurance_options_code',
      applicant: 'applicant',
      insuredList: 'insured_list',
      beneficiaryList: 'beneficiary_list',
      objectList: 'object_list',
      policyNo: 'policy_no',
      insuranceAmount: 'insurance_amount',
      insurancePremium: 'insurance_premium',
      insurancePeriodStart: 'insurance_period_start',
      insurancePeriodEnd: 'insurance_period_end',
      policyUrl: 'policy_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      insuranceApplicationNo: 'string',
      insuranceCompanyNo: 'string',
      trustworthyValueInsuranceTypeCode: 'string',
      insuranceProjectCode: 'string',
      insuranceOptionsCode: 'string',
      applicant: 'string',
      insuredList: 'string',
      beneficiaryList: 'string',
      objectList: 'string',
      policyNo: 'string',
      insuranceAmount: 'string',
      insurancePremium: 'string',
      insurancePeriodStart: 'string',
      insurancePeriodEnd: 'string',
      policyUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncPolicyResultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 保单同步结果
  bizResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizResult: 'biz_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInsureResultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 保险产品编码
  trustworthyValueInsuranceTypeCode: string;
  // 保司编码
  insuranceCompanyNo: string;
  // 通知单号,投保申请时会返回
  noticeNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      trustworthyValueInsuranceTypeCode: 'trustworthy_value_insurance_type_code',
      insuranceCompanyNo: 'insurance_company_no',
      noticeNo: 'notice_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      trustworthyValueInsuranceTypeCode: 'string',
      insuranceCompanyNo: 'string',
      noticeNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInsureResultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 通知单号
  noticeNo?: string;
  // 付款状态
  paymentStatus?: string;
  // 保单号
  policyNo?: string;
  // 保额(人民币)
  insuranceAmount?: string;
  // 保费(人民币)
  insurancePremium?: string;
  // 保险起期
  effectDate?: string;
  // 保险止期
  expireDate?: string;
  // 电子保单URL
  outPolicyUrl?: string;
  // 投保申请号-外部
  insuranceApplicationNo?: string;
  // 交易流水号
  insuranceApplicationNoInner?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      noticeNo: 'notice_no',
      paymentStatus: 'payment_status',
      policyNo: 'policy_no',
      insuranceAmount: 'insurance_amount',
      insurancePremium: 'insurance_premium',
      effectDate: 'effect_date',
      expireDate: 'expire_date',
      outPolicyUrl: 'out_policy_url',
      insuranceApplicationNo: 'insurance_application_no',
      insuranceApplicationNoInner: 'insurance_application_no_inner',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      noticeNo: 'string',
      paymentStatus: 'string',
      policyNo: 'string',
      insuranceAmount: 'string',
      insurancePremium: 'string',
      effectDate: 'string',
      expireDate: 'string',
      outPolicyUrl: 'string',
      insuranceApplicationNo: 'string',
      insuranceApplicationNoInner: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsureTestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // insurance_application_no
  insuranceApplicationNo: string;
  // insurance_company_no
  insuranceCompanyNo: string;
  // trustworthy_value_insurance_type_code
  trustworthyValueInsuranceTypeCode: string;
  // insurance_project_code
  insuranceProjectCode: string;
  // insurance_options_code
  insuranceOptionsCode: string;
  // applicant
  applicant: string;
  // insured_list
  insuredList?: string;
  // beneficiary_list
  beneficiaryList?: string;
  // insurance_period_start
  insurancePeriodStart: string;
  // insurance_period_end
  insurancePeriodEnd?: string;
  // applied_insurance_amount
  appliedInsuranceAmount: string;
  // insurance_period
  insurancePeriod?: string;
  // insured_object_list
  insuredObjectList?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      insuranceApplicationNo: 'insurance_application_no',
      insuranceCompanyNo: 'insurance_company_no',
      trustworthyValueInsuranceTypeCode: 'trustworthy_value_insurance_type_code',
      insuranceProjectCode: 'insurance_project_code',
      insuranceOptionsCode: 'insurance_options_code',
      applicant: 'applicant',
      insuredList: 'insured_list',
      beneficiaryList: 'beneficiary_list',
      insurancePeriodStart: 'insurance_period_start',
      insurancePeriodEnd: 'insurance_period_end',
      appliedInsuranceAmount: 'applied_insurance_amount',
      insurancePeriod: 'insurance_period',
      insuredObjectList: 'insured_object_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      insuranceApplicationNo: 'string',
      insuranceCompanyNo: 'string',
      trustworthyValueInsuranceTypeCode: 'string',
      insuranceProjectCode: 'string',
      insuranceOptionsCode: 'string',
      applicant: 'string',
      insuredList: 'string',
      beneficiaryList: 'string',
      insurancePeriodStart: 'string',
      insurancePeriodEnd: 'string',
      appliedInsuranceAmount: 'string',
      insurancePeriod: 'string',
      insuredObjectList: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsureTestResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // biz_result
  bizResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizResult: 'biz_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitInvestigateCaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 报案号 - 外部唯一ID
  reportNo: string;
  // 外部单据号
  outCaseNo: string;
  // 案件号
  policyNo?: string;
  // 委托的保司ID
  entrustInsuranceCompanyId: string;
  // 要求完成时间，时间戳
  investEndTime: number;
  // 委托联系人
  entrustName: string;
  // 委托联系人电话
  entrustTel: string;
  // 委托时间，时间戳
  entrustTime: number;
  // 出险人电话号码
  accidentTel: string;
  // 出险人姓名
  accidentName: string;
  // 出险人证件号
  accidentCardNo: string;
  // 出险人证件类型，10-身份证/11-户口本/13-军官证/17-港澳通行证/18-台湾通行证/51-护照/99-其他
  accidentCardType: string;
  // 出险经过
  accidentDesc: string;
  // 出险人地址中文名
  accidentAddressInfo: string;
  // 出险人详细住址
  accidentAddressDetail: string;
  // 出险日期，时间戳
  accidentTime: number;
  // 报案人电话号码
  reporterTel: string;
  // 报案人姓名
  reporterName: string;
  // 报案人证件号
  reporterCardNo: string;
  // 报案人证件类型，10-身份证/11-户口本/13-军官证/17-港澳通行证/18-台湾通行证/51-护照/99-其他
  reporterCardType: string;
  // 报案人与出险人的关系
  // 1本人，2配偶，3父母，4子女，5其他
  reporterRelationToAccident: string;
  // 报案时间，时间戳
  reportTime?: number;
  // 事故发生地址中文名，格式：省-市-区，如浙江省-杭州市-西湖区
  eventAddressInfo: string;
  // 事故发生详细地点
  eventAddressDetail: string;
  // 确诊医院
  confirmHospital: string;
  // 确诊医院地址信息，格式：省-市-区，如浙江省-杭州市-西湖区
  confirmHospitalAddressInfo: string;
  // 确诊疾病名称
  confirmIllnessName: string;
  // 产品大类 重疾或者医疗险
  productType: string;
  // 文件列表
  fileList: FileNode[];
  // 委托险种集合信息
  entrustGuaranteeProductList: EntrustGuaranteeProduct[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      reportNo: 'report_no',
      outCaseNo: 'out_case_no',
      policyNo: 'policy_no',
      entrustInsuranceCompanyId: 'entrust_insurance_company_id',
      investEndTime: 'invest_end_time',
      entrustName: 'entrust_name',
      entrustTel: 'entrust_tel',
      entrustTime: 'entrust_time',
      accidentTel: 'accident_tel',
      accidentName: 'accident_name',
      accidentCardNo: 'accident_card_no',
      accidentCardType: 'accident_card_type',
      accidentDesc: 'accident_desc',
      accidentAddressInfo: 'accident_address_info',
      accidentAddressDetail: 'accident_address_detail',
      accidentTime: 'accident_time',
      reporterTel: 'reporter_tel',
      reporterName: 'reporter_name',
      reporterCardNo: 'reporter_card_no',
      reporterCardType: 'reporter_card_type',
      reporterRelationToAccident: 'reporter_relation_to_accident',
      reportTime: 'report_time',
      eventAddressInfo: 'event_address_info',
      eventAddressDetail: 'event_address_detail',
      confirmHospital: 'confirm_hospital',
      confirmHospitalAddressInfo: 'confirm_hospital_address_info',
      confirmIllnessName: 'confirm_illness_name',
      productType: 'product_type',
      fileList: 'file_list',
      entrustGuaranteeProductList: 'entrust_guarantee_product_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      reportNo: 'string',
      outCaseNo: 'string',
      policyNo: 'string',
      entrustInsuranceCompanyId: 'string',
      investEndTime: 'number',
      entrustName: 'string',
      entrustTel: 'string',
      entrustTime: 'number',
      accidentTel: 'string',
      accidentName: 'string',
      accidentCardNo: 'string',
      accidentCardType: 'string',
      accidentDesc: 'string',
      accidentAddressInfo: 'string',
      accidentAddressDetail: 'string',
      accidentTime: 'number',
      reporterTel: 'string',
      reporterName: 'string',
      reporterCardNo: 'string',
      reporterCardType: 'string',
      reporterRelationToAccident: 'string',
      reportTime: 'number',
      eventAddressInfo: 'string',
      eventAddressDetail: 'string',
      confirmHospital: 'string',
      confirmHospitalAddressInfo: 'string',
      confirmIllnessName: 'string',
      productType: 'string',
      fileList: { 'type': 'array', 'itemType': FileNode },
      entrustGuaranteeProductList: { 'type': 'array', 'itemType': EntrustGuaranteeProduct },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitInvestigateCaseResponse extends $tea.Model {
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

export class QueryReverseCommissionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 案件号-外部唯一
  outCaseNo: string;
  // 委托的保司ID
  entrustInsuranceCompanyId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      outCaseNo: 'out_case_no',
      entrustInsuranceCompanyId: 'entrust_insurance_company_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      outCaseNo: 'string',
      entrustInsuranceCompanyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryReverseCommissionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 回销结果
  bizResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizResult: 'biz_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetEmbedcardUrlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 险种编码
  insuranceTypeCode: string;
  // 保司编码
  insuranceCompanyNo: string;
  // 嵌入式产品编码
  embedProductCode: string;
  // 是否需要询价
  isNeedInquiry: boolean;
  // 交易流水号，调用方生成的唯一编码，格式为 yyyyMMdd_身份标识_其他编码，系统会根据该流水号做防重、幂等判断逻辑。 yyyyMMdd请传递当前时间。 身份标识可自定义。 其他编码建议为随机值。 当极端场景中，系统会返回错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
  tradeNo: string;
  // 方案名称
  schemeName: string;
  // 投保人
  applicant: Applicant;
  // 被保人
  insured: Insured;
  // 投保标的
  subjectInfo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      insuranceTypeCode: 'insurance_type_code',
      insuranceCompanyNo: 'insurance_company_no',
      embedProductCode: 'embed_product_code',
      isNeedInquiry: 'is_need_inquiry',
      tradeNo: 'trade_no',
      schemeName: 'scheme_name',
      applicant: 'applicant',
      insured: 'insured',
      subjectInfo: 'subject_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      insuranceTypeCode: 'string',
      insuranceCompanyNo: 'string',
      embedProductCode: 'string',
      isNeedInquiry: 'boolean',
      tradeNo: 'string',
      schemeName: 'string',
      applicant: Applicant,
      insured: Insured,
      subjectInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetEmbedcardUrlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易流水号
  tradeNo?: string;
  // 险种编码
  insuranceTypeCode?: string;
  // 保司编码
  insuranceCompanyNo?: string;
  // 嵌入式产品编码
  embedProductCode?: string;
  // 嵌入式产品URL地址
  embedProductUrl?: string;
  // 方案名称
  schemeName?: string;
  // 保费
  premium?: string;
  // 询价编码
  inquiryNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tradeNo: 'trade_no',
      insuranceTypeCode: 'insurance_type_code',
      insuranceCompanyNo: 'insurance_company_no',
      embedProductCode: 'embed_product_code',
      embedProductUrl: 'embed_product_url',
      schemeName: 'scheme_name',
      premium: 'premium',
      inquiryNo: 'inquiry_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tradeNo: 'string',
      insuranceTypeCode: 'string',
      insuranceCompanyNo: 'string',
      embedProductCode: 'string',
      embedProductUrl: 'string',
      schemeName: 'string',
      premium: 'string',
      inquiryNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class IssueEmbedcardPaysucRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 险种编码
  insuranceTypeCode: string;
  // 保司编码
  insuranceCompanyNo: string;
  // 嵌入式产品编码
  embedProductCode: string;
  // 交易流水号
  tradeNo: string;
  // 方案名称
  schemeName: string;
  // 保费，保留2位小数
  premium: string;
  // 保费支付渠道，01-支付宝、02-微信支付、03-银行卡支付、04-平台账户余额支付
  premiumPaymentChannel: string;
  // 保费支付流水号
  premiumPaymentNo: string;
  // 保费支付金额，保留2位小数
  premiumPaymentAmount: string;
  // 保费支付时间
  premiumPaymentTime: string;
  // 询价编码
  inquiryNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      insuranceTypeCode: 'insurance_type_code',
      insuranceCompanyNo: 'insurance_company_no',
      embedProductCode: 'embed_product_code',
      tradeNo: 'trade_no',
      schemeName: 'scheme_name',
      premium: 'premium',
      premiumPaymentChannel: 'premium_payment_channel',
      premiumPaymentNo: 'premium_payment_no',
      premiumPaymentAmount: 'premium_payment_amount',
      premiumPaymentTime: 'premium_payment_time',
      inquiryNo: 'inquiry_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      insuranceTypeCode: 'string',
      insuranceCompanyNo: 'string',
      embedProductCode: 'string',
      tradeNo: 'string',
      schemeName: 'string',
      premium: 'string',
      premiumPaymentChannel: 'string',
      premiumPaymentNo: 'string',
      premiumPaymentAmount: 'string',
      premiumPaymentTime: 'string',
      inquiryNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class IssueEmbedcardPaysucResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易流水号
  tradeNo?: string;
  // 险种编码
  insuranceTypeCode?: string;
  // 保司编码
  insuranceCompanyNo?: string;
  // 嵌入式产品编码
  embedProductCode?: string;
  // 方案名称
  schemeName?: string;
  // 保险起期
  insureStart?: string;
  // 保险止期
  insureEnd?: string;
  // 保费，保留2位小数
  premium?: string;
  // 保额，保留2位小数
  amount?: string;
  // 询价编码
  inquiryNo?: string;
  // 保险凭证号
  voucherNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tradeNo: 'trade_no',
      insuranceTypeCode: 'insurance_type_code',
      insuranceCompanyNo: 'insurance_company_no',
      embedProductCode: 'embed_product_code',
      schemeName: 'scheme_name',
      insureStart: 'insure_start',
      insureEnd: 'insure_end',
      premium: 'premium',
      amount: 'amount',
      inquiryNo: 'inquiry_no',
      voucherNo: 'voucher_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tradeNo: 'string',
      insuranceTypeCode: 'string',
      insuranceCompanyNo: 'string',
      embedProductCode: 'string',
      schemeName: 'string',
      insureStart: 'string',
      insureEnd: 'string',
      premium: 'string',
      amount: 'string',
      inquiryNo: 'string',
      voucherNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetEmbedoemautoinsuranceUrlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 调用方生成的唯一编码，参考格式： yyyyMMdd_xxxxx，已接口请求的当前日期开头；
  requestNo: string;
  // 产品编码
  productCode: string;
  // 业务参数，json格式
  bizInfo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      requestNo: 'request_no',
      productCode: 'product_code',
      bizInfo: 'biz_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      requestNo: 'string',
      productCode: 'string',
      bizInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetEmbedoemautoinsuranceUrlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // url链接
  url?: string;
  // 请求流水号
  requestNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      url: 'url',
      requestNo: 'request_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      url: 'string',
      requestNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRightplatformUrlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 权益申请编号
  rightApplyNo: string;
  // 申请额度，最多保留小数点后两位
  applyLimitAmount: string;
  // 数据授权方名称
  dataLicensor: string;
  // 回调场景方地址
  callbackUrl: string;
  // 产品编码
  productCode: string;
  // 用户姓名 加密后传输
  tbrName: string;
  // 用户手机号，加密 && 脱敏传输
  tbrPhone: string;
  // 身份证， 加密 && 脱敏传输
  tbrIdCard: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      rightApplyNo: 'right_apply_no',
      applyLimitAmount: 'apply_limit_amount',
      dataLicensor: 'data_licensor',
      callbackUrl: 'callback_url',
      productCode: 'product_code',
      tbrName: 'tbr_name',
      tbrPhone: 'tbr_phone',
      tbrIdCard: 'tbr_id_card',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      rightApplyNo: 'string',
      applyLimitAmount: 'string',
      dataLicensor: 'string',
      callbackUrl: 'string',
      productCode: 'string',
      tbrName: 'string',
      tbrPhone: 'string',
      tbrIdCard: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRightplatformUrlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 权益申请编号
  rightApplyNo?: string;
  // 权益产品地址
  rightUrl?: string;
  // 两轮车延保险产品id
  // 
  productId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      rightApplyNo: 'right_apply_no',
      rightUrl: 'right_url',
      productId: 'product_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      rightApplyNo: 'string',
      rightUrl: 'string',
      productId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateRightplatformApplyinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 申请权益编号
  rightApplyNo: string;
  // 申请额度
  applyLimitAmount: string;
  // 申请额度状态
  applyStatus: string;
  // 投保信息，json字符串
  applyInfo: string;
  // 产品编码
  productCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      rightApplyNo: 'right_apply_no',
      applyLimitAmount: 'apply_limit_amount',
      applyStatus: 'apply_status',
      applyInfo: 'apply_info',
      productCode: 'product_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      rightApplyNo: 'string',
      applyLimitAmount: 'string',
      applyStatus: 'string',
      applyInfo: 'string',
      productCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateRightplatformApplyinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 申请权益编号
  rightApplyNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      rightApplyNo: 'right_apply_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      rightApplyNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyInterestScenesubjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 请求流水号，每次请求不一样
  requestNo: string;
  // 权益流水号
  interestNo: string;
  // 产品编码
  productCode: string;
  // 申请审批额度，单位元
  applyLimitAmount?: string;
  // 申请额度审批状态
  applyLimitStatus: string;
  // 权益标的信息,JSON字符串
  interestSubjectInfo?: string;
  // 权益版本
  interestVersion?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      requestNo: 'request_no',
      interestNo: 'interest_no',
      productCode: 'product_code',
      applyLimitAmount: 'apply_limit_amount',
      applyLimitStatus: 'apply_limit_status',
      interestSubjectInfo: 'interest_subject_info',
      interestVersion: 'interest_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      requestNo: 'string',
      interestNo: 'string',
      productCode: 'string',
      applyLimitAmount: 'string',
      applyLimitStatus: 'string',
      interestSubjectInfo: 'string',
      interestVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyInterestScenesubjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // json字符串
  bizResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizResult: 'biz_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInterestSuppliersubjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 订单号
  orderNo: string;
  // 权益流水号
  interestNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      orderNo: 'order_no',
      interestNo: 'interest_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      orderNo: 'string',
      interestNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInterestSuppliersubjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // json字符串
  bizResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizResult: 'biz_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyInterestSupplierpolicyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 请求流水号，每次推送需要唯一
  requestNo: string;
  // 我方权益申请流水号
  interestNo: string;
  // 保单信息 json字符串
  policyInfo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      requestNo: 'request_no',
      interestNo: 'interest_no',
      policyInfo: 'policy_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      requestNo: 'string',
      interestNo: 'string',
      policyInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyInterestSupplierpolicyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // json字符串
  bizResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizResult: 'biz_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInterestUrlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 权益申请编号，重新提交需要不一样
  rightApplyNo: string;
  // 	
  // 申请额度，最多保留小数点后两位，单位元
  applyLimitAmount: string;
  // 	
  // 数据授权方名称
  dataLicensor: string;
  // 回调场景方地址
  callbackUrl?: string;
  // 权益产品编码，暂时固定
  productCode: string;
  // 用户姓名 明文
  tbrName: string;
  // 用户手机号，明文
  tbrPhone: string;
  // 用户身份证，明文
  tbrIdCard: string;
  // 场景方信息,JSON字符串
  sceneInfo?: string;
  // 权益版本
  interestVersion?: string;
  // 产品信息
  productInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      rightApplyNo: 'right_apply_no',
      applyLimitAmount: 'apply_limit_amount',
      dataLicensor: 'data_licensor',
      callbackUrl: 'callback_url',
      productCode: 'product_code',
      tbrName: 'tbr_name',
      tbrPhone: 'tbr_phone',
      tbrIdCard: 'tbr_id_card',
      sceneInfo: 'scene_info',
      interestVersion: 'interest_version',
      productInfo: 'product_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      rightApplyNo: 'string',
      applyLimitAmount: 'string',
      dataLicensor: 'string',
      callbackUrl: 'string',
      productCode: 'string',
      tbrName: 'string',
      tbrPhone: 'string',
      tbrIdCard: 'string',
      sceneInfo: 'string',
      interestVersion: 'string',
      productInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInterestUrlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // json字符串
  bizResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizResult: 'biz_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInterestSceneorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 请求流水号
  requestNo: string;
  // 我方权益申请流水号
  interestNo: string;
  // 产品编码
  productCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      requestNo: 'request_no',
      interestNo: 'interest_no',
      productCode: 'product_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      requestNo: 'string',
      interestNo: 'string',
      productCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInterestSceneorderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // json字符串
  bizResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizResult: 'biz_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyInterestSupplierorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 请求流水号，每次唯一
  requestNo: string;
  // 贵方订单号
  orderNo: string;
  // 我方权益编号
  interestNo: string;
  // 用户授权状态
  userPermitStatus: string;
  // 权益订单状态
  orderStatus: string;
  // 退款金额，单位元
  refundAmount?: string;
  // 退款时间
  refundTime?: string;
  // 公证状态
  notaryStatus?: string;
  // 支付时间
  paymentTime?: string;
  // 版本号
  interestVersion?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      requestNo: 'request_no',
      orderNo: 'order_no',
      interestNo: 'interest_no',
      userPermitStatus: 'user_permit_status',
      orderStatus: 'order_status',
      refundAmount: 'refund_amount',
      refundTime: 'refund_time',
      notaryStatus: 'notary_status',
      paymentTime: 'payment_time',
      interestVersion: 'interest_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      requestNo: 'string',
      orderNo: 'string',
      interestNo: 'string',
      userPermitStatus: 'string',
      orderStatus: 'string',
      refundAmount: 'string',
      refundTime: 'string',
      notaryStatus: 'string',
      paymentTime: 'string',
      interestVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyInterestSupplierorderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // json字符串
  bizResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizResult: 'biz_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReceiveLeadMarketRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 线索唯一id
  leadId: string;
  // 本次固定传LMKT_LEADS_TRANSFER
  productCode: string;
  // 业务参数，json
  bizContent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      leadId: 'lead_id',
      productCode: 'product_code',
      bizContent: 'biz_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      leadId: 'string',
      productCode: 'string',
      bizContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReceiveLeadMarketResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  bizResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizResult: 'biz_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetMarketingInsureurlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 请求 id，做防重校验逻辑
  // 接口根据 requestId 做防重校验逻辑，若重复会报错
  requestId: string;
  // 产品编码
  productCode: string;
  // 保司编码
  channelCode: string;
  // 保司出单机构编码，若没有同保司编码
  issueOrg: string;
  // 保司产品编码
  channelProductCode: string;
  // 保险产品类型，枚举：
  // STANDARD（均分）
  // PREMIUM（大小均分）
  // GIFT_TRANSFER（赠转商）
  channelProductType: string;
  // 保险方案
  insurancePlan: string;
  // 一级渠道编码
  firstChannel: string;
  // 二级渠道编码
  secondChannel?: string;
  // 三级渠道/广告版位
  advertisingPosition?: string;
  // 设备类型/用户类型，枚举：
  // muid
  // oaid
  // caid
  // imei
  // idfa
  // userid
  deviceType: string;
  // 设备编号/用户编号
  deviceId: string;
  // 点击时间 yyyy-MM-dd HH:mm:ss
  clickTime: string;
  // 订单编号
  sceneOrderNo: string;
  // 投保人姓名
  applicantName?: string;
  // 投保人证件号
  applicantCertNo?: string;
  // 投保人联系方式
  applicantPhone?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      requestId: 'request_id',
      productCode: 'product_code',
      channelCode: 'channel_code',
      issueOrg: 'issue_org',
      channelProductCode: 'channel_product_code',
      channelProductType: 'channel_product_type',
      insurancePlan: 'insurance_plan',
      firstChannel: 'first_channel',
      secondChannel: 'second_channel',
      advertisingPosition: 'advertising_position',
      deviceType: 'device_type',
      deviceId: 'device_id',
      clickTime: 'click_time',
      sceneOrderNo: 'scene_order_no',
      applicantName: 'applicant_name',
      applicantCertNo: 'applicant_cert_no',
      applicantPhone: 'applicant_phone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      requestId: 'string',
      productCode: 'string',
      channelCode: 'string',
      issueOrg: 'string',
      channelProductCode: 'string',
      channelProductType: 'string',
      insurancePlan: 'string',
      firstChannel: 'string',
      secondChannel: 'string',
      advertisingPosition: 'string',
      deviceType: 'string',
      deviceId: 'string',
      clickTime: 'string',
      sceneOrderNo: 'string',
      applicantName: 'string',
      applicantCertNo: 'string',
      applicantPhone: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetMarketingInsureurlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求 id
  requestId?: string;
  // 一级渠道编码
  firstChannel?: string;
  // 二级渠道编码
  secondChannel?: string;
  // 三级渠道/广告版位
  advertisingPosition?: string;
  // 订单号
  sceneOrderNo?: string;
  // 特征编码
  clickId?: string;
  // 投保页面URL
  insureUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestId: 'request_id',
      firstChannel: 'first_channel',
      secondChannel: 'second_channel',
      advertisingPosition: 'advertising_position',
      sceneOrderNo: 'scene_order_no',
      clickId: 'click_id',
      insureUrl: 'insure_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestId: 'string',
      firstChannel: 'string',
      secondChannel: 'string',
      advertisingPosition: 'string',
      sceneOrderNo: 'string',
      clickId: 'string',
      insureUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackMarketingEventRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 请求 id，做防重校验逻辑
  // 接口根据 requestId 做防重校验逻辑，若重复会报错
  // 
  requestId: string;
  // 特征编码
  clickId: string;
  // 点击时间
  clickTime: string;
  // 事件类型，枚举：
  // RESERVATION_CHECK（留资）；
  // FIRST_PICK_FREE（领增）；
  // LOW_INSURANCE（低价险）；
  // HIGH_INSURANCE（高价险）；
  eventCode: string;
  // 事件完成时间（yyyy-MM-dd  HH:mm:ss）
  eventTime: string;
  // 一级渠道编码
  firstChannel: string;
  // 二级渠道编码
  secondChannel?: string;
  // 三级渠道/广告版位
  advertisingPosition?: string;
  // 业务字段，json格式
  eventInfo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      requestId: 'request_id',
      clickId: 'click_id',
      clickTime: 'click_time',
      eventCode: 'event_code',
      eventTime: 'event_time',
      firstChannel: 'first_channel',
      secondChannel: 'second_channel',
      advertisingPosition: 'advertising_position',
      eventInfo: 'event_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      requestId: 'string',
      clickId: 'string',
      clickTime: 'string',
      eventCode: 'string',
      eventTime: 'string',
      firstChannel: 'string',
      secondChannel: 'string',
      advertisingPosition: 'string',
      eventInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackMarketingEventResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求 id
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackMarketingPolicycancelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 请求 id，做防重校验逻辑
  // 接口根据 requestId 做防重校验逻辑，若重复会报错
  requestId: string;
  // 保单号（可脱敏处理）
  policyNo: string;
  // 退保时间（yyyy-MM-dd  HH:mm:ss）
  cancelTime: string;
  // 保险止期（yyyy-MM-dd  HH:mm:ss）
  endTime: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      requestId: 'request_id',
      policyNo: 'policy_no',
      cancelTime: 'cancel_time',
      endTime: 'end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      requestId: 'string',
      policyNo: 'string',
      cancelTime: 'string',
      endTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackMarketingPolicycancelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求 id
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeadMarketRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 产品编码
  productCode: string;
  // 业务参数
  bizContent?: string;
  // 请求流水号，全局唯一
  requestId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productCode: 'product_code',
      bizContent: 'biz_content',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productCode: 'string',
      bizContent: 'string',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeadMarketResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // JSON字符串
  bizResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizResult: 'biz_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizResult: 'string',
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
          sdk_version: "1.11.4",
          _prod_code: "INSURANCE_SAAS",
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
   * Description: 保险询报价结果查询
   * Summary: 保险询报价结果查询
   */
  async queryInquiry(request: QueryInquiryRequest): Promise<QueryInquiryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInquiryEx(request, headers, runtime);
  }

  /**
   * Description: 保险询报价结果查询
   * Summary: 保险询报价结果查询
   */
  async queryInquiryEx(request: QueryInquiryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInquiryResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInquiryResponse>(await this.doRequest("1.0", "antcloud.insurance.inquiry.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInquiryResponse({}));
  }

  /**
   * Description: 保险产品询价
   * Summary: 保险产品询价
   */
  async submitInquiry(request: SubmitInquiryRequest): Promise<SubmitInquiryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitInquiryEx(request, headers, runtime);
  }

  /**
   * Description: 保险产品询价
   * Summary: 保险产品询价
   */
  async submitInquiryEx(request: SubmitInquiryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitInquiryResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitInquiryResponse>(await this.doRequest("1.0", "antcloud.insurance.inquiry.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitInquiryResponse({}));
  }

  /**
   * Description: 历史灾害查询
   * Summary: 历史灾害数据查询
   */
  async queryDataDisaster(request: QueryDataDisasterRequest): Promise<QueryDataDisasterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDataDisasterEx(request, headers, runtime);
  }

  /**
   * Description: 历史灾害查询
   * Summary: 历史灾害数据查询
   */
  async queryDataDisasterEx(request: QueryDataDisasterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDataDisasterResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDataDisasterResponse>(await this.doRequest("1.0", "antcloud.insurance.data.disaster.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDataDisasterResponse({}));
  }

  /**
   * Description: 实时天气预警
   * Summary: 实时天气预警
   */
  async queryDataWeather(request: QueryDataWeatherRequest): Promise<QueryDataWeatherResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDataWeatherEx(request, headers, runtime);
  }

  /**
   * Description: 实时天气预警
   * Summary: 实时天气预警
   */
  async queryDataWeatherEx(request: QueryDataWeatherRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDataWeatherResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDataWeatherResponse>(await this.doRequest("1.0", "antcloud.insurance.data.weather.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDataWeatherResponse({}));
  }

  /**
   * Description: 报价接口同步接口
   * Summary: 报价接口同步接口
   */
  async syncQuote(request: SyncQuoteRequest): Promise<SyncQuoteResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncQuoteEx(request, headers, runtime);
  }

  /**
   * Description: 报价接口同步接口
   * Summary: 报价接口同步接口
   */
  async syncQuoteEx(request: SyncQuoteRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncQuoteResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncQuoteResponse>(await this.doRequest("1.0", "antcloud.insurance.quote.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncQuoteResponse({}));
  }

  /**
   * Description: 承保自核申请接口
   * Summary: 承保自核申请接口
   */
  async applyUnderwriting(request: ApplyUnderwritingRequest): Promise<ApplyUnderwritingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyUnderwritingEx(request, headers, runtime);
  }

  /**
   * Description: 承保自核申请接口
   * Summary: 承保自核申请接口
   */
  async applyUnderwritingEx(request: ApplyUnderwritingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyUnderwritingResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyUnderwritingResponse>(await this.doRequest("1.0", "antcloud.insurance.underwriting.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyUnderwritingResponse({}));
  }

  /**
   * Description: 承保自核结果查询接口
   * Summary: 承保自核结果查询接口
   */
  async queryUnderwriting(request: QueryUnderwritingRequest): Promise<QueryUnderwritingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUnderwritingEx(request, headers, runtime);
  }

  /**
   * Description: 承保自核结果查询接口
   * Summary: 承保自核结果查询接口
   */
  async queryUnderwritingEx(request: QueryUnderwritingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUnderwritingResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUnderwritingResponse>(await this.doRequest("1.0", "antcloud.insurance.underwriting.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUnderwritingResponse({}));
  }

  /**
   * Description: 根据保单号查询保单附件，并返回一个有效期为7天的ossurl
   * Summary: 保险科技保单附件查询接口
   */
  async queryPolicyFile(request: QueryPolicyFileRequest): Promise<QueryPolicyFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPolicyFileEx(request, headers, runtime);
  }

  /**
   * Description: 根据保单号查询保单附件，并返回一个有效期为7天的ossurl
   * Summary: 保险科技保单附件查询接口
   */
  async queryPolicyFileEx(request: QueryPolicyFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPolicyFileResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPolicyFileResponse>(await this.doRequest("1.0", "antcloud.insurance.policy.file.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPolicyFileResponse({}));
  }

  /**
   * Description: 保险SaaS投保申请接口
   * Summary: 投保申请接口
   */
  async applyInsure(request: ApplyInsureRequest): Promise<ApplyInsureResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyInsureEx(request, headers, runtime);
  }

  /**
   * Description: 保险SaaS投保申请接口
   * Summary: 投保申请接口
   */
  async applyInsureEx(request: ApplyInsureRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyInsureResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyInsureResponse>(await this.doRequest("1.0", "antcloud.insurance.insure.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyInsureResponse({}));
  }

  /**
   * Description: 保单结果同步，注意：基于投保信息的保单结果同步。
   * Summary: 保单结果同步（依赖投保申请）
   */
  async notifyPolicyResult(request: NotifyPolicyResultRequest): Promise<NotifyPolicyResultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.notifyPolicyResultEx(request, headers, runtime);
  }

  /**
   * Description: 保单结果同步，注意：基于投保信息的保单结果同步。
   * Summary: 保单结果同步（依赖投保申请）
   */
  async notifyPolicyResultEx(request: NotifyPolicyResultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<NotifyPolicyResultResponse> {
    Util.validateModel(request);
    return $tea.cast<NotifyPolicyResultResponse>(await this.doRequest("1.0", "antcloud.insurance.policy.result.notify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new NotifyPolicyResultResponse({}));
  }

  /**
   * Description: 报案接口
   * Summary: 保险科技 报案接口
   */
  async applyClaim(request: ApplyClaimRequest): Promise<ApplyClaimResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyClaimEx(request, headers, runtime);
  }

  /**
   * Description: 报案接口
   * Summary: 保险科技 报案接口
   */
  async applyClaimEx(request: ApplyClaimRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyClaimResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyClaimResponse>(await this.doRequest("1.0", "antcloud.insurance.claim.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyClaimResponse({}));
  }

  /**
   * Description: 报案撤销（场景端）
   * Summary: 报案撤销（场景端）
   */
  async cancelClaim(request: CancelClaimRequest): Promise<CancelClaimResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelClaimEx(request, headers, runtime);
  }

  /**
   * Description: 报案撤销（场景端）
   * Summary: 报案撤销（场景端）
   */
  async cancelClaimEx(request: CancelClaimRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelClaimResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelClaimResponse>(await this.doRequest("1.0", "antcloud.insurance.claim.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelClaimResponse({}));
  }

  /**
   * Description: 报案材料更新（场景端）
   * Summary: 报案材料更新（场景端）
   */
  async updateClaimMaterial(request: UpdateClaimMaterialRequest): Promise<UpdateClaimMaterialResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateClaimMaterialEx(request, headers, runtime);
  }

  /**
   * Description: 报案材料更新（场景端）
   * Summary: 报案材料更新（场景端）
   */
  async updateClaimMaterialEx(request: UpdateClaimMaterialRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateClaimMaterialResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateClaimMaterialResponse>(await this.doRequest("1.0", "antcloud.insurance.claim.material.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateClaimMaterialResponse({}));
  }

  /**
   * Description: 理赔结果确认（场景端）
   * Summary: 理赔结果确认（场景端）
   */
  async confirmClaimSettle(request: ConfirmClaimSettleRequest): Promise<ConfirmClaimSettleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmClaimSettleEx(request, headers, runtime);
  }

  /**
   * Description: 理赔结果确认（场景端）
   * Summary: 理赔结果确认（场景端）
   */
  async confirmClaimSettleEx(request: ConfirmClaimSettleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmClaimSettleResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmClaimSettleResponse>(await this.doRequest("1.0", "antcloud.insurance.claim.settle.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmClaimSettleResponse({}));
  }

  /**
   * Description: 理赔结案通知（保司端）
   * Summary: 理赔结案通知（保司端）
   */
  async finishClaimSettle(request: FinishClaimSettleRequest): Promise<FinishClaimSettleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.finishClaimSettleEx(request, headers, runtime);
  }

  /**
   * Description: 理赔结案通知（保司端）
   * Summary: 理赔结案通知（保司端）
   */
  async finishClaimSettleEx(request: FinishClaimSettleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<FinishClaimSettleResponse> {
    Util.validateModel(request);
    return $tea.cast<FinishClaimSettleResponse>(await this.doRequest("1.0", "antcloud.insurance.claim.settle.finish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new FinishClaimSettleResponse({}));
  }

  /**
   * Description: 保险批改自核接口
   * Summary: 保险批改自核接口
   */
  async applyEndorsementStrategy(request: ApplyEndorsementStrategyRequest): Promise<ApplyEndorsementStrategyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyEndorsementStrategyEx(request, headers, runtime);
  }

  /**
   * Description: 保险批改自核接口
   * Summary: 保险批改自核接口
   */
  async applyEndorsementStrategyEx(request: ApplyEndorsementStrategyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyEndorsementStrategyResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyEndorsementStrategyResponse>(await this.doRequest("1.0", "antcloud.insurance.endorsement.strategy.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyEndorsementStrategyResponse({}));
  }

  /**
   * Description: 保单信息离线同步
   * Summary: 保单信息离线同步
   */
  async syncPolicyResult(request: SyncPolicyResultRequest): Promise<SyncPolicyResultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncPolicyResultEx(request, headers, runtime);
  }

  /**
   * Description: 保单信息离线同步
   * Summary: 保单信息离线同步
   */
  async syncPolicyResultEx(request: SyncPolicyResultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncPolicyResultResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncPolicyResultResponse>(await this.doRequest("1.0", "antcloud.insurance.policy.result.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncPolicyResultResponse({}));
  }

  /**
   * Description: 基于通知单号查询保险投保结果
   * Summary: 保险投保结果查询
   */
  async queryInsureResult(request: QueryInsureResultRequest): Promise<QueryInsureResultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInsureResultEx(request, headers, runtime);
  }

  /**
   * Description: 基于通知单号查询保险投保结果
   * Summary: 保险投保结果查询
   */
  async queryInsureResultEx(request: QueryInsureResultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInsureResultResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInsureResultResponse>(await this.doRequest("1.0", "antcloud.insurance.insure.result.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInsureResultResponse({}));
  }

  /**
   * Description: 投保测试接口
   * Summary: 投保测试接口
   */
  async applyInsureTest(request: ApplyInsureTestRequest): Promise<ApplyInsureTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyInsureTestEx(request, headers, runtime);
  }

  /**
   * Description: 投保测试接口
   * Summary: 投保测试接口
   */
  async applyInsureTestEx(request: ApplyInsureTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyInsureTestResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyInsureTestResponse>(await this.doRequest("1.0", "antcloud.insurance.insure.test.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyInsureTestResponse({}));
  }

  /**
   * Description: 本接口用于调查报案数据的提交
   * Summary: 调查报案提交接口
   */
  async submitInvestigateCase(request: SubmitInvestigateCaseRequest): Promise<SubmitInvestigateCaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitInvestigateCaseEx(request, headers, runtime);
  }

  /**
   * Description: 本接口用于调查报案数据的提交
   * Summary: 调查报案提交接口
   */
  async submitInvestigateCaseEx(request: SubmitInvestigateCaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitInvestigateCaseResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitInvestigateCaseResponse>(await this.doRequest("1.0", "antcloud.insurance.investigate.case.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitInvestigateCaseResponse({}));
  }

  /**
   * Description: 回销结果查询接口
   * Summary: 回销结果查询接口
   */
  async queryReverseCommission(request: QueryReverseCommissionRequest): Promise<QueryReverseCommissionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryReverseCommissionEx(request, headers, runtime);
  }

  /**
   * Description: 回销结果查询接口
   * Summary: 回销结果查询接口
   */
  async queryReverseCommissionEx(request: QueryReverseCommissionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryReverseCommissionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryReverseCommissionResponse>(await this.doRequest("1.0", "antcloud.insurance.reverse.commission.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryReverseCommissionResponse({}));
  }

  /**
   * Description: 嵌入式保险服务卡片url链接获取
   * Summary: 嵌入式保险服务卡片url链接获取
   */
  async getEmbedcardUrl(request: GetEmbedcardUrlRequest): Promise<GetEmbedcardUrlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getEmbedcardUrlEx(request, headers, runtime);
  }

  /**
   * Description: 嵌入式保险服务卡片url链接获取
   * Summary: 嵌入式保险服务卡片url链接获取
   */
  async getEmbedcardUrlEx(request: GetEmbedcardUrlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetEmbedcardUrlResponse> {
    Util.validateModel(request);
    return $tea.cast<GetEmbedcardUrlResponse>(await this.doRequest("1.0", "antcloud.insurance.embedcard.url.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetEmbedcardUrlResponse({}));
  }

  /**
   * Description: 嵌入式保险服务打款成功出单接口
   * Summary: 嵌入式保险服务打款成功出单接口
   */
  async issueEmbedcardPaysuc(request: IssueEmbedcardPaysucRequest): Promise<IssueEmbedcardPaysucResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.issueEmbedcardPaysucEx(request, headers, runtime);
  }

  /**
   * Description: 嵌入式保险服务打款成功出单接口
   * Summary: 嵌入式保险服务打款成功出单接口
   */
  async issueEmbedcardPaysucEx(request: IssueEmbedcardPaysucRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<IssueEmbedcardPaysucResponse> {
    Util.validateModel(request);
    return $tea.cast<IssueEmbedcardPaysucResponse>(await this.doRequest("1.0", "antcloud.insurance.embedcard.paysuc.issue", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new IssueEmbedcardPaysucResponse({}));
  }

  /**
   * Description: 嵌入式主机厂车险url链接获取
   * Summary: 嵌入式主机厂车险url链接获取
   */
  async getEmbedoemautoinsuranceUrl(request: GetEmbedoemautoinsuranceUrlRequest): Promise<GetEmbedoemautoinsuranceUrlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getEmbedoemautoinsuranceUrlEx(request, headers, runtime);
  }

  /**
   * Description: 嵌入式主机厂车险url链接获取
   * Summary: 嵌入式主机厂车险url链接获取
   */
  async getEmbedoemautoinsuranceUrlEx(request: GetEmbedoemautoinsuranceUrlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetEmbedoemautoinsuranceUrlResponse> {
    Util.validateModel(request);
    return $tea.cast<GetEmbedoemautoinsuranceUrlResponse>(await this.doRequest("1.0", "antcloud.insurance.embedoemautoinsurance.url.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetEmbedoemautoinsuranceUrlResponse({}));
  }

  /**
   * Description: 场景方获取权益链接 
   * Summary: 场景方获取权益链接
   */
  async getRightplatformUrl(request: GetRightplatformUrlRequest): Promise<GetRightplatformUrlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getRightplatformUrlEx(request, headers, runtime);
  }

  /**
   * Description: 场景方获取权益链接 
   * Summary: 场景方获取权益链接
   */
  async getRightplatformUrlEx(request: GetRightplatformUrlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetRightplatformUrlResponse> {
    Util.validateModel(request);
    return $tea.cast<GetRightplatformUrlResponse>(await this.doRequest("1.0", "antcloud.insurance.rightplatform.url.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetRightplatformUrlResponse({}));
  }

  /**
   * Description: 更新申请额度状态&投保人信息
   * Summary: 更新申请额度状态&投保人信息
   */
  async updateRightplatformApplyinfo(request: UpdateRightplatformApplyinfoRequest): Promise<UpdateRightplatformApplyinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateRightplatformApplyinfoEx(request, headers, runtime);
  }

  /**
   * Description: 更新申请额度状态&投保人信息
   * Summary: 更新申请额度状态&投保人信息
   */
  async updateRightplatformApplyinfoEx(request: UpdateRightplatformApplyinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateRightplatformApplyinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateRightplatformApplyinfoResponse>(await this.doRequest("1.0", "antcloud.insurance.rightplatform.applyinfo.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateRightplatformApplyinfoResponse({}));
  }

  /**
   * Description: 场景方标的信息通知
   * Summary: 场景方标的信息通知
   */
  async notifyInterestScenesubject(request: NotifyInterestScenesubjectRequest): Promise<NotifyInterestScenesubjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.notifyInterestScenesubjectEx(request, headers, runtime);
  }

  /**
   * Description: 场景方标的信息通知
   * Summary: 场景方标的信息通知
   */
  async notifyInterestScenesubjectEx(request: NotifyInterestScenesubjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<NotifyInterestScenesubjectResponse> {
    Util.validateModel(request);
    return $tea.cast<NotifyInterestScenesubjectResponse>(await this.doRequest("1.0", "antcloud.insurance.interest.scenesubject.notify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new NotifyInterestScenesubjectResponse({}));
  }

  /**
   * Description: 权益服务商标的信息查询
   * Summary: 权益服务商标的信息查询
   */
  async queryInterestSuppliersubject(request: QueryInterestSuppliersubjectRequest): Promise<QueryInterestSuppliersubjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInterestSuppliersubjectEx(request, headers, runtime);
  }

  /**
   * Description: 权益服务商标的信息查询
   * Summary: 权益服务商标的信息查询
   */
  async queryInterestSuppliersubjectEx(request: QueryInterestSuppliersubjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInterestSuppliersubjectResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInterestSuppliersubjectResponse>(await this.doRequest("1.0", "antcloud.insurance.interest.suppliersubject.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInterestSuppliersubjectResponse({}));
  }

  /**
   * Description: 权益服务商投保后通知保单信息
   * Summary: 权益服务商投保后通知保单信息
   */
  async notifyInterestSupplierpolicy(request: NotifyInterestSupplierpolicyRequest): Promise<NotifyInterestSupplierpolicyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.notifyInterestSupplierpolicyEx(request, headers, runtime);
  }

  /**
   * Description: 权益服务商投保后通知保单信息
   * Summary: 权益服务商投保后通知保单信息
   */
  async notifyInterestSupplierpolicyEx(request: NotifyInterestSupplierpolicyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<NotifyInterestSupplierpolicyResponse> {
    Util.validateModel(request);
    return $tea.cast<NotifyInterestSupplierpolicyResponse>(await this.doRequest("1.0", "antcloud.insurance.interest.supplierpolicy.notify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new NotifyInterestSupplierpolicyResponse({}));
  }

  /**
   * Description: 场景方获取权益链接
   * Summary: 场景方获取权益链接
   */
  async getInterestUrl(request: GetInterestUrlRequest): Promise<GetInterestUrlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getInterestUrlEx(request, headers, runtime);
  }

  /**
   * Description: 场景方获取权益链接
   * Summary: 场景方获取权益链接
   */
  async getInterestUrlEx(request: GetInterestUrlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetInterestUrlResponse> {
    Util.validateModel(request);
    return $tea.cast<GetInterestUrlResponse>(await this.doRequest("1.0", "antcloud.insurance.interest.url.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetInterestUrlResponse({}));
  }

  /**
   * Description: 场景方订单信息查询
   * Summary: 场景方订单信息查询
   */
  async queryInterestSceneorder(request: QueryInterestSceneorderRequest): Promise<QueryInterestSceneorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInterestSceneorderEx(request, headers, runtime);
  }

  /**
   * Description: 场景方订单信息查询
   * Summary: 场景方订单信息查询
   */
  async queryInterestSceneorderEx(request: QueryInterestSceneorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInterestSceneorderResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInterestSceneorderResponse>(await this.doRequest("1.0", "antcloud.insurance.interest.sceneorder.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInterestSceneorderResponse({}));
  }

  /**
   * Description: 权益服务商订单状态通知
   * Summary: 权益服务商订单状态通知
   */
  async notifyInterestSupplierorder(request: NotifyInterestSupplierorderRequest): Promise<NotifyInterestSupplierorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.notifyInterestSupplierorderEx(request, headers, runtime);
  }

  /**
   * Description: 权益服务商订单状态通知
   * Summary: 权益服务商订单状态通知
   */
  async notifyInterestSupplierorderEx(request: NotifyInterestSupplierorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<NotifyInterestSupplierorderResponse> {
    Util.validateModel(request);
    return $tea.cast<NotifyInterestSupplierorderResponse>(await this.doRequest("1.0", "antcloud.insurance.interest.supplierorder.notify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new NotifyInterestSupplierorderResponse({}));
  }

  /**
   * Description: 车险线索营销结果接收
   * Summary: 车险线索营销结果接收
   */
  async receiveLeadMarket(request: ReceiveLeadMarketRequest): Promise<ReceiveLeadMarketResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.receiveLeadMarketEx(request, headers, runtime);
  }

  /**
   * Description: 车险线索营销结果接收
   * Summary: 车险线索营销结果接收
   */
  async receiveLeadMarketEx(request: ReceiveLeadMarketRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReceiveLeadMarketResponse> {
    Util.validateModel(request);
    return $tea.cast<ReceiveLeadMarketResponse>(await this.doRequest("1.0", "antcloud.insurance.lead.market.receive", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReceiveLeadMarketResponse({}));
  }

  /**
   * Description: 营销投保短链获取
   * Summary: 营销投保短链获取
   */
  async getMarketingInsureurl(request: GetMarketingInsureurlRequest): Promise<GetMarketingInsureurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getMarketingInsureurlEx(request, headers, runtime);
  }

  /**
   * Description: 营销投保短链获取
   * Summary: 营销投保短链获取
   */
  async getMarketingInsureurlEx(request: GetMarketingInsureurlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetMarketingInsureurlResponse> {
    Util.validateModel(request);
    return $tea.cast<GetMarketingInsureurlResponse>(await this.doRequest("1.0", "antcloud.insurance.marketing.insureurl.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetMarketingInsureurlResponse({}));
  }

  /**
   * Description: 营销保单出单信息事件回传
   * Summary: 营销保单出单信息事件回传
   */
  async callbackMarketingEvent(request: CallbackMarketingEventRequest): Promise<CallbackMarketingEventResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackMarketingEventEx(request, headers, runtime);
  }

  /**
   * Description: 营销保单出单信息事件回传
   * Summary: 营销保单出单信息事件回传
   */
  async callbackMarketingEventEx(request: CallbackMarketingEventRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackMarketingEventResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackMarketingEventResponse>(await this.doRequest("1.0", "antcloud.insurance.marketing.event.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackMarketingEventResponse({}));
  }

  /**
   * Description: 营销退保信息回传
   * Summary: 营销退保事件回传
   */
  async callbackMarketingPolicycancel(request: CallbackMarketingPolicycancelRequest): Promise<CallbackMarketingPolicycancelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackMarketingPolicycancelEx(request, headers, runtime);
  }

  /**
   * Description: 营销退保信息回传
   * Summary: 营销退保事件回传
   */
  async callbackMarketingPolicycancelEx(request: CallbackMarketingPolicycancelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackMarketingPolicycancelResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackMarketingPolicycancelResponse>(await this.doRequest("1.0", "antcloud.insurance.marketing.policycancel.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackMarketingPolicycancelResponse({}));
  }

  /**
   * Description: 车险线索查询
   * Summary: 车险线索查询
   */
  async queryLeadMarket(request: QueryLeadMarketRequest): Promise<QueryLeadMarketResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLeadMarketEx(request, headers, runtime);
  }

  /**
   * Description: 车险线索查询
   * Summary: 车险线索查询
   */
  async queryLeadMarketEx(request: QueryLeadMarketRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLeadMarketResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLeadMarketResponse>(await this.doRequest("1.0", "antcloud.insurance.lead.market.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLeadMarketResponse({}));
  }

}
