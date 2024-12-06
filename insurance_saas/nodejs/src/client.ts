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
          sdk_version: "1.7.10",
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

}
