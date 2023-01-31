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

// 证书授权产品信息
export class CertProductAuthDO extends $tea.Model {
  // 三方平台产品ID
  productId: string;
  // 三方平台产品名称
  productName: string;
  static names(): { [key: string]: string } {
    return {
      productId: 'product_id',
      productName: 'product_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      productId: 'string',
      productName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分类碳排放量
export class EmissionsCategoryStatistics extends $tea.Model {
  // 排放类型编码
  emissionDategoryNo: string;
  // 排放类型名称
  emissionCategoryName: string;
  // 排放量
  emission: string;
  // 排放占比，可直接换算成百分数即为百分占比
  rate: string;
  // 排放量单位
  unit: string;
  static names(): { [key: string]: string } {
    return {
      emissionDategoryNo: 'emission_dategory_no',
      emissionCategoryName: 'emission_category_name',
      emission: 'emission',
      rate: 'rate',
      unit: 'unit',
    };
  }

  static types(): { [key: string]: any } {
    return {
      emissionDategoryNo: 'string',
      emissionCategoryName: 'string',
      emission: 'string',
      rate: 'string',
      unit: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 证书产品信息，包括证书详情、授权产品信息
export class CertProductInfoDO extends $tea.Model {
  // 同证书信息显示
  certificationNo: string;
  // 同证书信息显示
  certificationType: string;
  // 同证书信息显示
  certificationName: string;
  // 同证书信息显示
  authenticationName: string;
  // 证书颁发时间
  issueTime: string;
  // 证书到期时间
  invalidTime: string;
  // 同证书信息显示
  certificationAgent: string;
  // 同证书信息显示
  manufacturer?: string;
  // 同证书信息显示
  cproductFirm?: string;
  // 同证书信息显示
  certificationLevel?: string;
  // 同证书信息显示
  cproductName?: string;
  // 同证书信息显示
  cproductModel?: string;
  // 证书文件地址
  certificationFileAddress: string;
  // 证书授权的三方平台产品列表
  authProducts?: CertProductAuthDO[];
  static names(): { [key: string]: string } {
    return {
      certificationNo: 'certification_no',
      certificationType: 'certification_type',
      certificationName: 'certification_name',
      authenticationName: 'authentication_name',
      issueTime: 'issue_time',
      invalidTime: 'invalid_time',
      certificationAgent: 'certification_agent',
      manufacturer: 'manufacturer',
      cproductFirm: 'cproduct_firm',
      certificationLevel: 'certification_level',
      cproductName: 'cproduct_name',
      cproductModel: 'cproduct_model',
      certificationFileAddress: 'certification_file_address',
      authProducts: 'auth_products',
    };
  }

  static types(): { [key: string]: any } {
    return {
      certificationNo: 'string',
      certificationType: 'string',
      certificationName: 'string',
      authenticationName: 'string',
      issueTime: 'string',
      invalidTime: 'string',
      certificationAgent: 'string',
      manufacturer: 'string',
      cproductFirm: 'string',
      certificationLevel: 'string',
      cproductName: 'string',
      cproductModel: 'string',
      certificationFileAddress: 'string',
      authProducts: { 'type': 'array', 'itemType': CertProductAuthDO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

//  每月的排放数据
export class AnnualMonthEmissionDatum extends $tea.Model {
  // 统计的年份
  year: string;
  // 统计的月份
  month: string;
  // 统计排放量
  value: string;
  static names(): { [key: string]: string } {
    return {
      year: 'year',
      month: 'month',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      year: 'string',
      month: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 按绿色行为类型统计的绿色行为明细
export class GreenOperationStatisticsByType extends $tea.Model {
  // 绿色行为类型
  greenOperationType: string;
  // 绿色行为类型名称
  greenOperationTypeName: string;
  // 绿色行为产生的绿色能量值
  greenEnergyAmount: number;
  // 相关类型的绿色行为记录数
  greenOperationRecords: number;
  static names(): { [key: string]: string } {
    return {
      greenOperationType: 'green_operation_type',
      greenOperationTypeName: 'green_operation_type_name',
      greenEnergyAmount: 'green_energy_amount',
      greenOperationRecords: 'green_operation_records',
    };
  }

  static types(): { [key: string]: any } {
    return {
      greenOperationType: 'string',
      greenOperationTypeName: 'string',
      greenEnergyAmount: 'number',
      greenOperationRecords: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 减排情况统计
export class EmissionsReductionStatistics extends $tea.Model {
  // 减排方法
  reductionMethod: string;
  // 减排方法名称
  reductionMethodName: string;
  // 减排量
  reductionAmount: string;
  // 减排量占比
  reductionRatio: string;
  // 减排量单位
  dataUnit: string;
  static names(): { [key: string]: string } {
    return {
      reductionMethod: 'reduction_method',
      reductionMethodName: 'reduction_method_name',
      reductionAmount: 'reduction_amount',
      reductionRatio: 'reduction_ratio',
      dataUnit: 'data_unit',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reductionMethod: 'string',
      reductionMethodName: 'string',
      reductionAmount: 'string',
      reductionRatio: 'string',
      dataUnit: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 每日碳排放量
export class DailyEmissions extends $tea.Model {
  // 日期
  date: string;
  // 排放量值
  value: number;
  static names(): { [key: string]: string } {
    return {
      date: 'date',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      date: 'string',
      value: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 碳抵消统计量
export class EmissionCounteractionStatistics extends $tea.Model {
  // 碳抵消类别
  assertType: string;
  // 碳抵消类别名称
  assertTypeName: string;
  // 抵消量
  counteractionAmount: string;
  // 排放量单位，默认为：tCO2e
  dataUnit: string;
  static names(): { [key: string]: string } {
    return {
      assertType: 'assert_type',
      assertTypeName: 'assert_type_name',
      counteractionAmount: 'counteraction_amount',
      dataUnit: 'data_unit',
    };
  }

  static types(): { [key: string]: any } {
    return {
      assertType: 'string',
      assertTypeName: 'string',
      counteractionAmount: 'string',
      dataUnit: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 排放统计项目
export class AnyStatisticalItem extends $tea.Model {
  // 统计项目编码
  itemCode: string;
  // 数据值，按字符串输出，最多保留6位小数
  amount: string;
  // 单位编码
  unit: string;
  // 单位标签
  unitLabel: string;
  static names(): { [key: string]: string } {
    return {
      itemCode: 'item_code',
      amount: 'amount',
      unit: 'unit',
      unitLabel: 'unit_label',
    };
  }

  static types(): { [key: string]: any } {
    return {
      itemCode: 'string',
      amount: 'string',
      unit: 'string',
      unitLabel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 账户信息
export class CarbonAccountInfo extends $tea.Model {
  // 账户did
  userDid: string;
  // 账户名称
  userName: string;
  static names(): { [key: string]: string } {
    return {
      userDid: 'user_did',
      userName: 'user_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userDid: 'string',
      userName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 账户开通返回
export class AccountRegisterResponse extends $tea.Model {
  // 账户did
  userDid: string;
  static names(): { [key: string]: string } {
    return {
      userDid: 'user_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 文档信息
export class EnterpriseDocumentFile extends $tea.Model {
  // 文档名称
  documentName: string;
  // 文件地址
  documentAddress: string;
  static names(): { [key: string]: string } {
    return {
      documentName: 'document_name',
      documentAddress: 'document_address',
    };
  }

  static types(): { [key: string]: any } {
    return {
      documentName: 'string',
      documentAddress: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 区块链信息
export class BlockchainDTO extends $tea.Model {
  // 交易hash
  txHash: string;
  // 当前块高
  blockNumber: number;
  static names(): { [key: string]: string } {
    return {
      txHash: 'tx_hash',
      blockNumber: 'block_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      txHash: 'string',
      blockNumber: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 碳排放分城市统计总量
export class EmissionsCityStatistics extends $tea.Model {
  // 城市编码
  cityNo: string;
  // 城市名称
  cityName: string;
  // 累计排放量
  emissionAmount: string;
  // 今日新增碳排放量
  emissionAmountToday: string;
  // 总减碳量
  reductionAmount: string;
  // 今日减碳量
  reductionAmountToday: string;
  // 总抵消量
  counteractionAmount: string;
  // 今日抵消量
  counteractionAmountToday: string;
  // 排放量单位，默认为：
  dataUnit: string;
  static names(): { [key: string]: string } {
    return {
      cityNo: 'city_no',
      cityName: 'city_name',
      emissionAmount: 'emission_amount',
      emissionAmountToday: 'emission_amount_today',
      reductionAmount: 'reduction_amount',
      reductionAmountToday: 'reduction_amount_today',
      counteractionAmount: 'counteraction_amount',
      counteractionAmountToday: 'counteraction_amount_today',
      dataUnit: 'data_unit',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cityNo: 'string',
      cityName: 'string',
      emissionAmount: 'string',
      emissionAmountToday: 'string',
      reductionAmount: 'string',
      reductionAmountToday: 'string',
      counteractionAmount: 'string',
      counteractionAmountToday: 'string',
      dataUnit: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 授权信息
export class AuthenticationInfoVO extends $tea.Model {
  // 授权记录编码
  authenticationNo: string;
  // 收取方did
  authorizerDid: string;
  // 授权方名称
  authorizerName: string;
  // 被授权方did
  authorizedDid: string;
  // 被授权方名称
  authorizedName: string;
  // 数据协作类型
  dataTransferType: string;
  // 授权详情
  authenticationDeetail: string;
  // 授权状态
  status: string;
  static names(): { [key: string]: string } {
    return {
      authenticationNo: 'authentication_no',
      authorizerDid: 'authorizer_did',
      authorizerName: 'authorizer_name',
      authorizedDid: 'authorized_did',
      authorizedName: 'authorized_name',
      dataTransferType: 'data_transfer_type',
      authenticationDeetail: 'authentication_deetail',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authenticationNo: 'string',
      authorizerDid: 'string',
      authorizerName: 'string',
      authorizedDid: 'string',
      authorizedName: 'string',
      dataTransferType: 'string',
      authenticationDeetail: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据值条目
export class AnyAmountItem extends $tea.Model {
  // 数据项编码
  itemCode: string;
  // 数据值，按字符串输出，最多保留6位小数
  itemAmount: string;
  static names(): { [key: string]: string } {
    return {
      itemCode: 'item_code',
      itemAmount: 'item_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      itemCode: 'string',
      itemAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 排放范围排放数据统计
export class EmissionsScopeStatistics extends $tea.Model {
  // 盘查范围编码
  inventoryScopeNo: string;
  // 盘查范围名称
  inventoryScopeName: string;
  // 碳排放量
  emissions: number;
  // 排放占比
  percentage: number;
  // 范围下各分类排放数据
  categoryEmissionsList: EmissionsCategoryStatistics[];
  static names(): { [key: string]: string } {
    return {
      inventoryScopeNo: 'inventory_scope_no',
      inventoryScopeName: 'inventory_scope_name',
      emissions: 'emissions',
      percentage: 'percentage',
      categoryEmissionsList: 'category_emissions_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      inventoryScopeNo: 'string',
      inventoryScopeName: 'string',
      emissions: 'number',
      percentage: 'number',
      categoryEmissionsList: { 'type': 'array', 'itemType': EmissionsCategoryStatistics },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 碳排放分单元统计总量
export class EmissionsLocationStatistics extends $tea.Model {
  // 盘查单元编码
  locationNo: string;
  // 盘查单元名称
  locationName: string;
  // 盘查单元排放量
  emissionAmount: string;
  // 排放量单位，默认为：tCO2e
  dataUnit: string;
  static names(): { [key: string]: string } {
    return {
      locationNo: 'location_no',
      locationName: 'location_name',
      emissionAmount: 'emission_amount',
      dataUnit: 'data_unit',
    };
  }

  static types(): { [key: string]: any } {
    return {
      locationNo: 'string',
      locationName: 'string',
      emissionAmount: 'string',
      dataUnit: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 任意KV结构对象
export class AnyKeywordItem extends $tea.Model {
  // 项目编码
  itemCode: string;
  // 项目值
  itemValue: string;
  static names(): { [key: string]: string } {
    return {
      itemCode: 'item_code',
      itemValue: 'item_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      itemCode: 'string',
      itemValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 按频率统计的绿色行为明细
export class GreenOperationStatisticsByFrequence extends $tea.Model {
  // 绿色行为发生时期
  occurrencePeriod: string;
  // 绿色行为产生的绿色能量值
  greenEnergyAmount: number;
  // 时期内发生绿色行为的记录条数
  greenOperationRecords: number;
  static names(): { [key: string]: string } {
    return {
      occurrencePeriod: 'occurrence_period',
      greenEnergyAmount: 'green_energy_amount',
      greenOperationRecords: 'green_operation_records',
    };
  }

  static types(): { [key: string]: any } {
    return {
      occurrencePeriod: 'string',
      greenEnergyAmount: 'number',
      greenOperationRecords: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 绿色行为数据摘要
export class GreenOperationRecordSummary extends $tea.Model {
  // 绿色行为记录编码
  greenOperationNo: string;
  // 绿色行为类型
  greenOperationType: string;
  // 绿色行为类型名称
  greenOperationTypeName: string;
  // 发生绿色行为的相关业务单号
  enterpriseBizNo: string;
  // 绿色行为发生时间，格式应如：2021-07-21 12:11:11
  occurrenceTime: string;
  // 绿色行为的绿色能量值
  greenEnergyAmount: number;
  static names(): { [key: string]: string } {
    return {
      greenOperationNo: 'green_operation_no',
      greenOperationType: 'green_operation_type',
      greenOperationTypeName: 'green_operation_type_name',
      enterpriseBizNo: 'enterprise_biz_no',
      occurrenceTime: 'occurrence_time',
      greenEnergyAmount: 'green_energy_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      greenOperationNo: 'string',
      greenOperationType: 'string',
      greenOperationTypeName: 'string',
      enterpriseBizNo: 'string',
      occurrenceTime: 'string',
      greenEnergyAmount: 'number',
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

export class DescribeAcarActivityRequest extends $tea.Model {
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

export class DescribeAcarActivityResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 活动主办方名称
  sponsor?: string;
  // 大型活动名称
  activityName?: string;
  // 当前开展的活动主体名称
  enterpriseName?: string;
  // 当前活动主体编码
  enterpriseNo?: string;
  // 当前主体活动开始日期
  enterpriseStartDate?: string;
  // 当前主体活动结束日期
  enterpriseEndDate?: string;
  // 当前活动是否已经经过碳排放认证
  authed?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sponsor: 'sponsor',
      activityName: 'activity_name',
      enterpriseName: 'enterprise_name',
      enterpriseNo: 'enterprise_no',
      enterpriseStartDate: 'enterprise_start_date',
      enterpriseEndDate: 'enterprise_end_date',
      authed: 'authed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sponsor: 'string',
      activityName: 'string',
      enterpriseName: 'string',
      enterpriseNo: 'string',
      enterpriseStartDate: 'string',
      enterpriseEndDate: 'string',
      authed: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeAcarDailyemissionsRequest extends $tea.Model {
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

export class DescribeAcarDailyemissionsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 净排放量
  netEmissions?: number;
  // 累计到当前时间的总碳排放量
  totalEmissions?: number;
  // 排放量单位
  unit?: string;
  //  当前计算完成时间
  finishTimestamp?: string;
  // 活动期间每日累计的总碳排放量
  dailyEmissionsList?: DailyEmissions[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      netEmissions: 'net_emissions',
      totalEmissions: 'total_emissions',
      unit: 'unit',
      finishTimestamp: 'finish_timestamp',
      dailyEmissionsList: 'daily_emissions_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      netEmissions: 'number',
      totalEmissions: 'number',
      unit: 'string',
      finishTimestamp: 'string',
      dailyEmissionsList: { 'type': 'array', 'itemType': DailyEmissions },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeAcarScopemissionRequest extends $tea.Model {
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

export class DescribeAcarScopemissionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总排放量
  totalEmissions?: number;
  // 单位
  unit?: string;
  // 各范围的排放情况列表
  scopeEmissionsList?: EmissionsScopeStatistics[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalEmissions: 'total_emissions',
      unit: 'unit',
      scopeEmissionsList: 'scope_emissions_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalEmissions: 'number',
      unit: 'string',
      scopeEmissionsList: { 'type': 'array', 'itemType': EmissionsScopeStatistics },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeAcarReductionemissionsRequest extends $tea.Model {
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

export class DescribeAcarReductionemissionsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 减排情况列表
  list?: EmissionsReductionStatistics[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      list: { 'type': 'array', 'itemType': EmissionsReductionStatistics },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeAcarLastemissiondataRequest extends $tea.Model {
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

export class DescribeAcarLastemissiondataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 主体活动编码
  enterpriseNo?: string;
  // 盘查范围编码
  inventoryScopeNo?: string;
  // 盘查范围名称
  inventoryScopeName?: string;
  // 排放类型编码
  emissionCategoryNo?: string;
  // 排放类型名称
  emissionCategoryName?: string;
  // 排放源编码
  emissionSourceNo?: string;
  // 排放源名称
  emissionSourceName?: string;
  // 活动场馆编码
  enterpriseWorkspaceNo?: string;
  // 活动场馆名称
  enterpriseWorkspaceName?: string;
  // 排放量计算要素编码
  emissionsAnalysisFactorNo?: string;
  // 排放量计算要素值
  emissionsAnalysisFactorValue?: string;
  // 发生日期
  occurrenceDate?: string;
  // 排放数据录入明细编码
  emissionDataEntryItemNo?: string;
  // 排放源用量
  emissionDourceDosage?: number;
  // 用量单位：
  // WNm3("万Nm3","天然气消耗用量单位"),
  // GJ("GJ","燃烧产生的热量单位或外购热力单位"),
  // t("t","制冷剂、灭火器填充剂、化石燃料消耗的质量单位，或者化粪池BOD产生量单位"),
  // MWh("MWh","外购电力或数据中心用电量单位"),
  // km("km","公里，通勤用车或员工差旅旅程单位"),
  // tCO2e("tCO2e","吨二氧化碳当量，排放气体产生的二氧化碳当量"),
  // PCT("%","百分比，如碳氧化率，或者气体逸散率");
  dosageUnit?: string;
  // 数据录入人账号
  submitterNo?: string;
  // 提交人姓名
  submitterName?: string;
  // 数据录入时间
  submissionTime?: string;
  // 盘查排放类型的数据录入方式：
  // ManualEntry("手动录入方式"),
  // FileUpload("文件导入方式"),
  // AutoGeneration("自动产生");
  dataEntryType?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      enterpriseNo: 'enterprise_no',
      inventoryScopeNo: 'inventory_scope_no',
      inventoryScopeName: 'inventory_scope_name',
      emissionCategoryNo: 'emission_category_no',
      emissionCategoryName: 'emission_category_name',
      emissionSourceNo: 'emission_source_no',
      emissionSourceName: 'emission_source_name',
      enterpriseWorkspaceNo: 'enterprise_workspace_no',
      enterpriseWorkspaceName: 'enterprise_workspace_name',
      emissionsAnalysisFactorNo: 'emissions_analysis_factor_no',
      emissionsAnalysisFactorValue: 'emissions_analysis_factor_value',
      occurrenceDate: 'occurrence_date',
      emissionDataEntryItemNo: 'emission_data_entry_item_no',
      emissionDourceDosage: 'emission_dource_dosage',
      dosageUnit: 'dosage_unit',
      submitterNo: 'submitter_no',
      submitterName: 'submitter_name',
      submissionTime: 'submission_time',
      dataEntryType: 'data_entry_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      enterpriseNo: 'string',
      inventoryScopeNo: 'string',
      inventoryScopeName: 'string',
      emissionCategoryNo: 'string',
      emissionCategoryName: 'string',
      emissionSourceNo: 'string',
      emissionSourceName: 'string',
      enterpriseWorkspaceNo: 'string',
      enterpriseWorkspaceName: 'string',
      emissionsAnalysisFactorNo: 'string',
      emissionsAnalysisFactorValue: 'string',
      occurrenceDate: 'string',
      emissionDataEntryItemNo: 'string',
      emissionDourceDosage: 'number',
      dosageUnit: 'string',
      submitterNo: 'string',
      submitterName: 'string',
      submissionTime: 'string',
      dataEntryType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEmissionTotalRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 活动编码
  activityNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      activityNo: 'activity_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      activityNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEmissionTotalResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 累计排放量
  totalEmission?: string;
  // 今日新增碳排放量
  totalEmissionToday?: string;
  // 累计减碳量
  totalReduction?: string;
  // 今日减碳量
  totalReductionToday?: string;
  // 累计抵消量
  totalCounteraction?: string;
  // 今日抵消量
  totalCounteractionToday?: string;
  // 排放数据单位
  dataUnit?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalEmission: 'total_emission',
      totalEmissionToday: 'total_emission_today',
      totalReduction: 'total_reduction',
      totalReductionToday: 'total_reduction_today',
      totalCounteraction: 'total_counteraction',
      totalCounteractionToday: 'total_counteraction_today',
      dataUnit: 'data_unit',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalEmission: 'string',
      totalEmissionToday: 'string',
      totalReduction: 'string',
      totalReductionToday: 'string',
      totalCounteraction: 'string',
      totalCounteractionToday: 'string',
      dataUnit: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEmissionGroupbycategoryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 活动编码
  activityNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      activityNo: 'activity_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      activityNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEmissionGroupbycategoryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 按照排放类型分组统计的排放量结果列表
  list?: EmissionsCategoryStatistics[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      list: { 'type': 'array', 'itemType': EmissionsCategoryStatistics },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEmissionGroupbylocationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 活动编码
  activityNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      activityNo: 'activity_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      activityNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEmissionGroupbylocationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 按照排放单元分组统计的碳排放量列表
  list?: EmissionsLocationStatistics[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      list: { 'type': 'array', 'itemType': EmissionsLocationStatistics },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEmissionGroupbycityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 活动编码
  activityNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      activityNo: 'activity_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      activityNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEmissionGroupbycityResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 按城市分组统计的碳排放量列表
  list?: EmissionsCityStatistics[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      list: { 'type': 'array', 'itemType': EmissionsCityStatistics },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEmissionReductionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 活动编码
  activityNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      activityNo: 'activity_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      activityNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEmissionReductionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 减排量按减排方法分组统计
  list?: EmissionsReductionStatistics[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      list: { 'type': 'array', 'itemType': EmissionsReductionStatistics },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEmissionCounteractionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 活动编码
  activityNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      activityNo: 'activity_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      activityNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEmissionCounteractionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 碳抵消量按抵消类型分组统计
  list?: EmissionCounteractionStatistics[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      list: { 'type': 'array', 'itemType': EmissionCounteractionStatistics },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterPdcpAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // PERSON("个人"),
  // ENTERPRISE("企业")
  userType: string;
  // 用户名称
  userName: string;
  // 用户ID
  userId: string;
  // PASSPORT("护照"),
  // RESIDENT("身份证"),
  // NATIONAL_LEGAL_MERGE("统一社会信用代码")
  certType: string;
  // 证件号码
  certNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userType: 'user_type',
      userName: 'user_name',
      userId: 'user_id',
      certType: 'cert_type',
      certNo: 'cert_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userType: 'string',
      userName: 'string',
      userId: 'string',
      certType: 'string',
      certNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterPdcpAccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 账户开通结果
  carbonAccountInfo?: AccountRegisterResponse;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      carbonAccountInfo: 'carbon_account_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      carbonAccountInfo: AccountRegisterResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushPdcpBlockchainRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 消息ID
  txMsgId: string;
  // 用户ID
  userId: string;
  // 数据类型，枚举定义
  dataType: string;
  // 密文类型
  encryptType: string;
  // 待存证数据，根据数据类型序列化为json。并加密传输
  depositData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      txMsgId: 'tx_msg_id',
      userId: 'user_id',
      dataType: 'data_type',
      encryptType: 'encrypt_type',
      depositData: 'deposit_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      txMsgId: 'string',
      userId: 'string',
      dataType: 'string',
      encryptType: 'string',
      depositData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushPdcpBlockchainResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 上链信息: 交易hash，块高
  txData?: BlockchainDTO;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txData: 'tx_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txData: BlockchainDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadPdcpBlockchainRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID
  txMsgId: string;
  // 用户ID
  userId: string;
  // 数据类型
  dataType: string;
  // 加密类型
  encryptType: string;
  // 待存证数据，根据数据类型序列化后加密传输
  depositData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      txMsgId: 'tx_msg_id',
      userId: 'user_id',
      dataType: 'data_type',
      encryptType: 'encrypt_type',
      depositData: 'deposit_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      txMsgId: 'string',
      userId: 'string',
      dataType: 'string',
      encryptType: 'string',
      depositData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadPdcpBlockchainResponse extends $tea.Model {
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

export class GetPdcpBlockchainRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求ID
  txMsgId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      txMsgId: 'tx_msg_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      txMsgId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetPdcpBlockchainResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回上链信息
  txData?: BlockchainDTO;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txData: 'tx_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txData: BlockchainDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPdcpAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户ID
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPdcpAccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 开户结果
  carbonAccountInfo?: AccountRegisterResponse;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      carbonAccountInfo: 'carbon_account_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      carbonAccountInfo: AccountRegisterResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddPdcpAuthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授权记录的唯一标记
  authenticationNo: string;
  // 授权方did
  authorizerDid: string;
  // 被授权方did
  authorizedDid: string;
  // 数据协作类型
  dataTransferType: string;
  // 授权详情
  authenticationDetail: string;
  // 授权状态
  status: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authenticationNo: 'authentication_no',
      authorizerDid: 'authorizer_did',
      authorizedDid: 'authorized_did',
      dataTransferType: 'data_transfer_type',
      authenticationDetail: 'authentication_detail',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authenticationNo: 'string',
      authorizerDid: 'string',
      authorizedDid: 'string',
      dataTransferType: 'string',
      authenticationDetail: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddPdcpAuthResponse extends $tea.Model {
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

export class UpdatePdcpAuthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授权记录编码
  authenticationNo: string;
  // 授权状态
  status: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authenticationNo: 'authentication_no',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authenticationNo: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdatePdcpAuthResponse extends $tea.Model {
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

export class QueryGatewayAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业名称
  userName?: string;
  // 当前页码，默认1
  pageNumber?: number;
  // 页面大小，默认20
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userName: 'user_name',
      pageNumber: 'page_number',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userName: 'string',
      pageNumber: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGatewayAccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 账户信息列表
  accountInfoList?: CarbonAccountInfo[];
  // 总量
  total?: number;
  // 当前页面
  pageNumber?: number;
  // 页面大小
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accountInfoList: 'account_info_list',
      total: 'total',
      pageNumber: 'page_number',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accountInfoList: { 'type': 'array', 'itemType': CarbonAccountInfo },
      total: 'number',
      pageNumber: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPdcpAuthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授权记录编码
  authenticationNo?: string;
  // 授权方did
  authorizerDid?: string;
  // 模糊匹配
  authorizerName?: string;
  // 被授权方did
  authorizedDid?: string;
  // 模糊匹配
  authorizedName?: string;
  // 数据协作类型
  dataTransferType?: string;
  // 授权状态
  status?: string;
  // 当前页面
  pageNumber?: number;
  // 页面大小
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authenticationNo: 'authentication_no',
      authorizerDid: 'authorizer_did',
      authorizerName: 'authorizer_name',
      authorizedDid: 'authorized_did',
      authorizedName: 'authorized_name',
      dataTransferType: 'data_transfer_type',
      status: 'status',
      pageNumber: 'page_number',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authenticationNo: 'string',
      authorizerDid: 'string',
      authorizerName: 'string',
      authorizedDid: 'string',
      authorizedName: 'string',
      dataTransferType: 'string',
      status: 'string',
      pageNumber: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPdcpAuthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总量
  total?: number;
  // 当前页面
  pageNumber?: number;
  // 页面大小
  pageSize?: number;
  // 授权信息
  authenticationInfoList?: AuthenticationInfoVO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      total: 'total',
      pageNumber: 'page_number',
      pageSize: 'page_size',
      authenticationInfoList: 'authentication_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      total: 'number',
      pageNumber: 'number',
      pageSize: 'number',
      authenticationInfoList: { 'type': 'array', 'itemType': AuthenticationInfoVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPdcpDataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授权记录编码
  authenticationNo: string;
  // 数据类型
  dataType: string;
  // 当前页面
  pageNumber?: number;
  // 页面大小
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authenticationNo: 'authentication_no',
      dataType: 'data_type',
      pageNumber: 'page_number',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authenticationNo: 'string',
      dataType: 'string',
      pageNumber: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPdcpDataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总数
  total?: number;
  // 当前页面
  pageNumber?: number;
  // 页面大小
  pageSize?: number;
  // 数据列表
  dataList?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      total: 'total',
      pageNumber: 'page_number',
      pageSize: 'page_size',
      dataList: 'data_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      total: 'number',
      pageNumber: 'number',
      pageSize: 'number',
      dataList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddEcarAvitivedataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 活动数据业务单号
  enterpriseBizNo: string;
  // 盘查排放项编码
  inventoryItemNo: string;
  // 发生起始时间，格式为：yyyy-MM-dd HH:mm:ss
  occurrenceStartTime: string;
  // 发生结束时间，格式为：yyyy-MM-dd HH:mm:ss
  occurrenceEndTime: string;
  // 排放源用量值列表
  emissionSourceDosageList: AnyAmountItem[];
  // 活动数据附加要素值列表
  emissionSourceElementList?: AnyKeywordItem[];
  // 活动数据扩展信息值列表
  extensionValueList?: AnyKeywordItem[];
  // 凭证文件列表，每个文件通过接口/open/api/file/upload上传
  voucherFileList?: EnterpriseDocumentFile[];
  // 备注
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      enterpriseBizNo: 'enterprise_biz_no',
      inventoryItemNo: 'inventory_item_no',
      occurrenceStartTime: 'occurrence_start_time',
      occurrenceEndTime: 'occurrence_end_time',
      emissionSourceDosageList: 'emission_source_dosage_list',
      emissionSourceElementList: 'emission_source_element_list',
      extensionValueList: 'extension_value_list',
      voucherFileList: 'voucher_file_list',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      enterpriseBizNo: 'string',
      inventoryItemNo: 'string',
      occurrenceStartTime: 'string',
      occurrenceEndTime: 'string',
      emissionSourceDosageList: { 'type': 'array', 'itemType': AnyAmountItem },
      emissionSourceElementList: { 'type': 'array', 'itemType': AnyKeywordItem },
      extensionValueList: { 'type': 'array', 'itemType': AnyKeywordItem },
      voucherFileList: { 'type': 'array', 'itemType': EnterpriseDocumentFile },
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddEcarAvitivedataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 排放数据录入明细编码
  emissionDataEntryItemNo?: string;
  // 企业业务单号
  enterpriseBizNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      emissionDataEntryItemNo: 'emission_data_entry_item_no',
      enterpriseBizNo: 'enterprise_biz_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      emissionDataEntryItemNo: 'string',
      enterpriseBizNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailEcarAvitivedataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 排放数据录入明细编码
  emissionDataEntryItemNo?: string;
  // 企业业务单号
  enterpriseBizNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      emissionDataEntryItemNo: 'emission_data_entry_item_no',
      enterpriseBizNo: 'enterprise_biz_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      emissionDataEntryItemNo: 'string',
      enterpriseBizNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailEcarAvitivedataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 企业排放数据录入明细编码
  emissionDataEntryItemNo?: string;
  // 企业业务单号
  enterpriseBizNo?: string;
  // 发生起始时间，格式为：yyyy-MM-dd HH:mm:ss
  occurrenceStartTime?: string;
  // 发生结束时间，格式为：yyyy-MM-dd HH:mm:ss
  occurrenceEndTime?: string;
  // 链上交易Hash
  carbonChainTradeHash?: string;
  // 总的碳排放用量，按字符串输出，最多保留6位小数
  emissionStatisticalAmount?: string;
  // 排放源编码
  emissionSourceNo?: string;
  // 排放源名称
  emissionSourceName?: string;
  // 排放单元编码
  enterpriseLocationNo?: string;
  // 排放单元名称
  enterpriseLocationName?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      emissionDataEntryItemNo: 'emission_data_entry_item_no',
      enterpriseBizNo: 'enterprise_biz_no',
      occurrenceStartTime: 'occurrence_start_time',
      occurrenceEndTime: 'occurrence_end_time',
      carbonChainTradeHash: 'carbon_chain_trade_hash',
      emissionStatisticalAmount: 'emission_statistical_amount',
      emissionSourceNo: 'emission_source_no',
      emissionSourceName: 'emission_source_name',
      enterpriseLocationNo: 'enterprise_location_no',
      enterpriseLocationName: 'enterprise_location_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      emissionDataEntryItemNo: 'string',
      enterpriseBizNo: 'string',
      occurrenceStartTime: 'string',
      occurrenceEndTime: 'string',
      carbonChainTradeHash: 'string',
      emissionStatisticalAmount: 'string',
      emissionSourceNo: 'string',
      emissionSourceName: 'string',
      enterpriseLocationNo: 'string',
      enterpriseLocationName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountEcarActivedataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 盘查排放项编码
  inventoryItemNo: string;
  // 发生起始时间，格式为：yyyy-MM-dd HH:mm:ss，将统计起始时间之后的活动数据
  occurrenceStartTime: string;
  // 发生结束时间，格式为：yyyy-MM-dd HH:mm:ss，将统计结束时间之前、起始时间之后的活动数据
  occurrenceEndTime: string;
  // 活动数据附加要素信息，将统计满足相关要素值的活动数据
  emissionSourceElementList?: AnyKeywordItem[];
  // 活动数据扩展信息，将统计满足相关要素值的活动数据
  extensionValueList?: AnyKeywordItem[];
  // 附加的扩展统计条目，条目K为统计数据结果编码，V为统计计算公式，
  // 公式可用参数：dataEntryCount(统计排放数据条数)、totalEmissions(总碳排放量)、activeDataAmounts.{活动数据编码}（活动数据量）
  // 比如马士基计算百公里排放量公式：totalEmissions/(activeDataAmounts.AD1+activeDataAmounts.AD3)*100
  extraStatisticItemList?: AnyKeywordItem[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      inventoryItemNo: 'inventory_item_no',
      occurrenceStartTime: 'occurrence_start_time',
      occurrenceEndTime: 'occurrence_end_time',
      emissionSourceElementList: 'emission_source_element_list',
      extensionValueList: 'extension_value_list',
      extraStatisticItemList: 'extra_statistic_item_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      inventoryItemNo: 'string',
      occurrenceStartTime: 'string',
      occurrenceEndTime: 'string',
      emissionSourceElementList: { 'type': 'array', 'itemType': AnyKeywordItem },
      extensionValueList: { 'type': 'array', 'itemType': AnyKeywordItem },
      extraStatisticItemList: { 'type': 'array', 'itemType': AnyKeywordItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountEcarActivedataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 指定时间区间内的活动数据笔数
  dataEntryCount?: number;
  // 总碳排放量
  totalEmissions?: string;
  // 各活动数据用量累计
  activeDataAmountList?: AnyStatisticalItem[];
  // 碳排放强度，碳排放总量/订单笔数，按字符串输出，最多保留6位小数
  emissionsIntensity?: string;
  // 每月排放量，排放量总计/指定时间区间内的月份数，按字符串输出，最多保留6位小数
  eachMonthEmissions?: string;
  // 额外统计数据统计结果
  extraStatisticDatumList?: AnyAmountItem[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      dataEntryCount: 'data_entry_count',
      totalEmissions: 'total_emissions',
      activeDataAmountList: 'active_data_amount_list',
      emissionsIntensity: 'emissions_intensity',
      eachMonthEmissions: 'each_month_emissions',
      extraStatisticDatumList: 'extra_statistic_datum_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      dataEntryCount: 'number',
      totalEmissions: 'string',
      activeDataAmountList: { 'type': 'array', 'itemType': AnyStatisticalItem },
      emissionsIntensity: 'string',
      eachMonthEmissions: 'string',
      extraStatisticDatumList: { 'type': 'array', 'itemType': AnyAmountItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadEcarFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // Port的文件内容
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadEcarFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文档名称
  documentName?: string;
  // 碳矩阵存放的文件地址
  documentAddress?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      documentName: 'document_name',
      documentAddress: 'document_address',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      documentName: 'string',
      documentAddress: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddEcarGreenoperationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 绿色行为类型，目前支持包括：
  // ElectronicInvoice(电子发票), 
  // LowCarbonCommodity(低碳商品), 
  // ReusableBag(环保减塑)
  // OfflinePayment(线下支付)
  // GreenOrder(绿色订单，可以同时解析出低碳商品、环保减塑、线下支付等多种绿色行为)
  greenOperationType: string;
  // 绿色行为相关的业务单号
  enterpriseBizNo: string;
  // 发生时间，格式应如：2021-07-21 12:11:11
  occurrenceTime: string;
  // 绿色行为数据扩展信息，必须为JSON格式，碳矩阵将分析解析数据检查获取相关的绿色行为数据
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      greenOperationType: 'green_operation_type',
      enterpriseBizNo: 'enterprise_biz_no',
      occurrenceTime: 'occurrence_time',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      greenOperationType: 'string',
      enterpriseBizNo: 'string',
      occurrenceTime: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddEcarGreenoperationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回记录的多种绿色行为数据摘要信息
  list?: GreenOperationRecordSummary[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      list: { 'type': 'array', 'itemType': GreenOperationRecordSummary },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountEcarGreenoperationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 绿色行为统计频率，可选值：
  // Monthly(分月统计),
  // Daily(按每日统计) 
  // 
  statisticFrequence: string;
  // 统计数据的发生起始时间，格式应如：2021-07-21 12:11:11
  occurrenceStartTime?: string;
  // 统计数据的发生结束时间，格式应如：2021-07-21 12:11:11，不传为当日最近时间
  occurrenceEndTime?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      statisticFrequence: 'statistic_frequence',
      occurrenceStartTime: 'occurrence_start_time',
      occurrenceEndTime: 'occurrence_end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      statisticFrequence: 'string',
      occurrenceStartTime: 'string',
      occurrenceEndTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountEcarGreenoperationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 绿色行为产生的绿色能量总量
  greenEnergyTotal?: number;
  // 绿色能量单位，默认为g
  greenEnergyUnit?: string;
  // 绿色行为记录数据
  greenOperationRecords?: number;
  // 按频率统计的绿色行为数据列表
  statisticsByFrequenceList?: GreenOperationStatisticsByFrequence[];
  // 按绿色行为类型统计的绿色行为数据列表
  statisticsByTypeList?: GreenOperationStatisticsByType[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      greenEnergyTotal: 'green_energy_total',
      greenEnergyUnit: 'green_energy_unit',
      greenOperationRecords: 'green_operation_records',
      statisticsByFrequenceList: 'statistics_by_frequence_list',
      statisticsByTypeList: 'statistics_by_type_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      greenEnergyTotal: 'number',
      greenEnergyUnit: 'string',
      greenOperationRecords: 'number',
      statisticsByFrequenceList: { 'type': 'array', 'itemType': GreenOperationStatisticsByFrequence },
      statisticsByTypeList: { 'type': 'array', 'itemType': GreenOperationStatisticsByType },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListEcarGreenoperationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 限制的记录条数
  limit: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      limit: 'limit',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      limit: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListEcarGreenoperationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 最近发生的绿色行为数据列表
  list?: GreenOperationRecordSummary[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      list: { 'type': 'array', 'itemType': GreenOperationRecordSummary },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PreviewEcarAvitivedataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求统计的年份，默认为当前年份
  year?: number;
  // 统计比较运算是的基准：
  // LastYear(去年同期比较),
  // CriteriaYear(同基准年比较)。
  // 默认与去年同期比较。
  comparisonStandard?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      year: 'year',
      comparisonStandard: 'comparison_standard',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      year: 'number',
      comparisonStandard: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PreviewEcarAvitivedataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总排放量，最多保留6位小数
  totalEmissions?: string;
  // 核减减排量，最多保留6位小数
  subtractReductions?: string;
  // 净排放量，核减后的碳排放量
  netReductions?: string;
  // 年同比
  yearCompareLastPer?: string;
  // 碳排放量单位
  unit?: string;
  // 碳排放量单位显示标签
  unitLabel?: string;
  // 各月份排放数据列表
  list?: AnnualMonthEmissionDatum[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalEmissions: 'total_emissions',
      subtractReductions: 'subtract_reductions',
      netReductions: 'net_reductions',
      yearCompareLastPer: 'year_compare_last_per',
      unit: 'unit',
      unitLabel: 'unit_label',
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalEmissions: 'string',
      subtractReductions: 'string',
      netReductions: 'string',
      yearCompareLastPer: 'string',
      unit: 'string',
      unitLabel: 'string',
      list: { 'type': 'array', 'itemType': AnnualMonthEmissionDatum },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryThirdCertRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 三方平台的产品ID
  productId?: string;
  // GreenProductCertification ：绿色产品认证证书
  // GarbonNeutrality ： 碳中和证书
  // GreenhouseGasInventory 温室气体核查证书
  certificationType?: string;
  // 证书文件中的产品名称
  cproductName?: string;
  // 证书文件中的产品型号
  cproductModel?: string;
  // 证书文件中的生产商名称
  cproductFirm?: string;
  // 三方平台的企业ID
  companyId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productId: 'product_id',
      certificationType: 'certification_type',
      cproductName: 'cproduct_name',
      cproductModel: 'cproduct_model',
      cproductFirm: 'cproduct_firm',
      companyId: 'company_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productId: 'string',
      certificationType: 'string',
      cproductName: 'string',
      cproductModel: 'string',
      cproductFirm: 'string',
      companyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryThirdCertResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 证书列表
  certifications?: CertProductInfoDO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifications: 'certifications',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifications: { 'type': 'array', 'itemType': CertProductInfoDO },
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
          sdk_version: "2.1.2",
          _prod_code: "STLR",
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
   * Description: 查询活动资料描述信息，包括大型会展信息及当前开展的活动日期等等
   * Summary: 查询当前活动资料信息
   */
  async describeAcarActivity(request: DescribeAcarActivityRequest): Promise<DescribeAcarActivityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.describeAcarActivityEx(request, headers, runtime);
  }

  /**
   * Description: 查询活动资料描述信息，包括大型会展信息及当前开展的活动日期等等
   * Summary: 查询当前活动资料信息
   */
  async describeAcarActivityEx(request: DescribeAcarActivityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DescribeAcarActivityResponse> {
    Util.validateModel(request);
    return $tea.cast<DescribeAcarActivityResponse>(await this.doRequest("1.0", "antchain.carbon.acar.activity.describe", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DescribeAcarActivityResponse({}));
  }

  /**
   * Description: 返回当前活动累计的碳排放量，以及每日累计的总排放量。
   * Summary: 查询当前活动的每日碳排放量
   */
  async describeAcarDailyemissions(request: DescribeAcarDailyemissionsRequest): Promise<DescribeAcarDailyemissionsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.describeAcarDailyemissionsEx(request, headers, runtime);
  }

  /**
   * Description: 返回当前活动累计的碳排放量，以及每日累计的总排放量。
   * Summary: 查询当前活动的每日碳排放量
   */
  async describeAcarDailyemissionsEx(request: DescribeAcarDailyemissionsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DescribeAcarDailyemissionsResponse> {
    Util.validateModel(request);
    return $tea.cast<DescribeAcarDailyemissionsResponse>(await this.doRequest("1.0", "antchain.carbon.acar.dailyemissions.describe", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DescribeAcarDailyemissionsResponse({}));
  }

  /**
   * Description: 查询当前活动各范围的碳排放量，返回各范围的排放占比，以及范围下各分类的碳排放量。
   * Summary: 查询当前活动各范围的碳排放量
   */
  async describeAcarScopemission(request: DescribeAcarScopemissionRequest): Promise<DescribeAcarScopemissionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.describeAcarScopemissionEx(request, headers, runtime);
  }

  /**
   * Description: 查询当前活动各范围的碳排放量，返回各范围的排放占比，以及范围下各分类的碳排放量。
   * Summary: 查询当前活动各范围的碳排放量
   */
  async describeAcarScopemissionEx(request: DescribeAcarScopemissionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DescribeAcarScopemissionResponse> {
    Util.validateModel(request);
    return $tea.cast<DescribeAcarScopemissionResponse>(await this.doRequest("1.0", "antchain.carbon.acar.scopemission.describe", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DescribeAcarScopemissionResponse({}));
  }

  /**
   * Description: 获取减排情况，返回多项减排方案实施下相关的减排情况
   * Summary: 获取减排情况
   */
  async describeAcarReductionemissions(request: DescribeAcarReductionemissionsRequest): Promise<DescribeAcarReductionemissionsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.describeAcarReductionemissionsEx(request, headers, runtime);
  }

  /**
   * Description: 获取减排情况，返回多项减排方案实施下相关的减排情况
   * Summary: 获取减排情况
   */
  async describeAcarReductionemissionsEx(request: DescribeAcarReductionemissionsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DescribeAcarReductionemissionsResponse> {
    Util.validateModel(request);
    return $tea.cast<DescribeAcarReductionemissionsResponse>(await this.doRequest("1.0", "antchain.carbon.acar.reductionemissions.describe", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DescribeAcarReductionemissionsResponse({}));
  }

  /**
   * Description: 查询最近排放数据，返回最近排放数据信息
   * Summary: 查询最近排放数据
   */
  async describeAcarLastemissiondata(request: DescribeAcarLastemissiondataRequest): Promise<DescribeAcarLastemissiondataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.describeAcarLastemissiondataEx(request, headers, runtime);
  }

  /**
   * Description: 查询最近排放数据，返回最近排放数据信息
   * Summary: 查询最近排放数据
   */
  async describeAcarLastemissiondataEx(request: DescribeAcarLastemissiondataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DescribeAcarLastemissiondataResponse> {
    Util.validateModel(request);
    return $tea.cast<DescribeAcarLastemissiondataResponse>(await this.doRequest("1.0", "antchain.carbon.acar.lastemissiondata.describe", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DescribeAcarLastemissiondataResponse({}));
  }

  /**
   * Description: 碳总量查询
   * Summary: 碳总量查询
   */
  async queryEmissionTotal(request: QueryEmissionTotalRequest): Promise<QueryEmissionTotalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEmissionTotalEx(request, headers, runtime);
  }

  /**
   * Description: 碳总量查询
   * Summary: 碳总量查询
   */
  async queryEmissionTotalEx(request: QueryEmissionTotalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEmissionTotalResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEmissionTotalResponse>(await this.doRequest("1.0", "antchain.carbon.emission.total.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEmissionTotalResponse({}));
  }

  /**
   * Description: 碳排放总量分类统计
   * Summary: 碳排放总量分类统计
   */
  async queryEmissionGroupbycategory(request: QueryEmissionGroupbycategoryRequest): Promise<QueryEmissionGroupbycategoryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEmissionGroupbycategoryEx(request, headers, runtime);
  }

  /**
   * Description: 碳排放总量分类统计
   * Summary: 碳排放总量分类统计
   */
  async queryEmissionGroupbycategoryEx(request: QueryEmissionGroupbycategoryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEmissionGroupbycategoryResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEmissionGroupbycategoryResponse>(await this.doRequest("1.0", "antchain.carbon.emission.groupbycategory.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEmissionGroupbycategoryResponse({}));
  }

  /**
   * Description: 碳排放总量分单元统计
   * Summary: 碳排放总量分单元统计
   */
  async queryEmissionGroupbylocation(request: QueryEmissionGroupbylocationRequest): Promise<QueryEmissionGroupbylocationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEmissionGroupbylocationEx(request, headers, runtime);
  }

  /**
   * Description: 碳排放总量分单元统计
   * Summary: 碳排放总量分单元统计
   */
  async queryEmissionGroupbylocationEx(request: QueryEmissionGroupbylocationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEmissionGroupbylocationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEmissionGroupbylocationResponse>(await this.doRequest("1.0", "antchain.carbon.emission.groupbylocation.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEmissionGroupbylocationResponse({}));
  }

  /**
   * Description: 碳排放总量分城市统计
   * Summary: 碳排放总量分城市统计
   */
  async queryEmissionGroupbycity(request: QueryEmissionGroupbycityRequest): Promise<QueryEmissionGroupbycityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEmissionGroupbycityEx(request, headers, runtime);
  }

  /**
   * Description: 碳排放总量分城市统计
   * Summary: 碳排放总量分城市统计
   */
  async queryEmissionGroupbycityEx(request: QueryEmissionGroupbycityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEmissionGroupbycityResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEmissionGroupbycityResponse>(await this.doRequest("1.0", "antchain.carbon.emission.groupbycity.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEmissionGroupbycityResponse({}));
  }

  /**
   * Description: 减排统计查询
   * Summary: 减排统计查询
   */
  async queryEmissionReduction(request: QueryEmissionReductionRequest): Promise<QueryEmissionReductionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEmissionReductionEx(request, headers, runtime);
  }

  /**
   * Description: 减排统计查询
   * Summary: 减排统计查询
   */
  async queryEmissionReductionEx(request: QueryEmissionReductionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEmissionReductionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEmissionReductionResponse>(await this.doRequest("1.0", "antchain.carbon.emission.reduction.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEmissionReductionResponse({}));
  }

  /**
   * Description: 碳抵消量统计
   * Summary: 碳抵消量统计
   */
  async queryEmissionCounteraction(request: QueryEmissionCounteractionRequest): Promise<QueryEmissionCounteractionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEmissionCounteractionEx(request, headers, runtime);
  }

  /**
   * Description: 碳抵消量统计
   * Summary: 碳抵消量统计
   */
  async queryEmissionCounteractionEx(request: QueryEmissionCounteractionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEmissionCounteractionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEmissionCounteractionResponse>(await this.doRequest("1.0", "antchain.carbon.emission.counteraction.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEmissionCounteractionResponse({}));
  }

  /**
   * Description: 账户开通接口。开通协作平台和链上账户
   * Summary: 账户开通接口
   */
  async registerPdcpAccount(request: RegisterPdcpAccountRequest): Promise<RegisterPdcpAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.registerPdcpAccountEx(request, headers, runtime);
  }

  /**
   * Description: 账户开通接口。开通协作平台和链上账户
   * Summary: 账户开通接口
   */
  async registerPdcpAccountEx(request: RegisterPdcpAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RegisterPdcpAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<RegisterPdcpAccountResponse>(await this.doRequest("1.0", "antchain.carbon.pdcp.account.register", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RegisterPdcpAccountResponse({}));
  }

  /**
   * Description: 存证接口
   * Summary: 存证接口
   */
  async pushPdcpBlockchain(request: PushPdcpBlockchainRequest): Promise<PushPdcpBlockchainResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushPdcpBlockchainEx(request, headers, runtime);
  }

  /**
   * Description: 存证接口
   * Summary: 存证接口
   */
  async pushPdcpBlockchainEx(request: PushPdcpBlockchainRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushPdcpBlockchainResponse> {
    Util.validateModel(request);
    return $tea.cast<PushPdcpBlockchainResponse>(await this.doRequest("1.0", "antchain.carbon.pdcp.blockchain.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushPdcpBlockchainResponse({}));
  }

  /**
   * Description: 异步存证接口
   * Summary: 异步存证接口
   */
  async uploadPdcpBlockchain(request: UploadPdcpBlockchainRequest): Promise<UploadPdcpBlockchainResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadPdcpBlockchainEx(request, headers, runtime);
  }

  /**
   * Description: 异步存证接口
   * Summary: 异步存证接口
   */
  async uploadPdcpBlockchainEx(request: UploadPdcpBlockchainRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadPdcpBlockchainResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadPdcpBlockchainResponse>(await this.doRequest("1.0", "antchain.carbon.pdcp.blockchain.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadPdcpBlockchainResponse({}));
  }

  /**
   * Description: 查询异步存证结果
   * Summary: 查询异步存证结果
   */
  async getPdcpBlockchain(request: GetPdcpBlockchainRequest): Promise<GetPdcpBlockchainResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getPdcpBlockchainEx(request, headers, runtime);
  }

  /**
   * Description: 查询异步存证结果
   * Summary: 查询异步存证结果
   */
  async getPdcpBlockchainEx(request: GetPdcpBlockchainRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetPdcpBlockchainResponse> {
    Util.validateModel(request);
    return $tea.cast<GetPdcpBlockchainResponse>(await this.doRequest("1.0", "antchain.carbon.pdcp.blockchain.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetPdcpBlockchainResponse({}));
  }

  /**
   * Description: 链上账户查询接口
   * Summary: 链上账户查询接口
   */
  async queryPdcpAccount(request: QueryPdcpAccountRequest): Promise<QueryPdcpAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPdcpAccountEx(request, headers, runtime);
  }

  /**
   * Description: 链上账户查询接口
   * Summary: 链上账户查询接口
   */
  async queryPdcpAccountEx(request: QueryPdcpAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPdcpAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPdcpAccountResponse>(await this.doRequest("1.0", "antchain.carbon.pdcp.account.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPdcpAccountResponse({}));
  }

  /**
   * Description: 新增授权接口
   * Summary: 新增授权接口
   */
  async addPdcpAuth(request: AddPdcpAuthRequest): Promise<AddPdcpAuthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addPdcpAuthEx(request, headers, runtime);
  }

  /**
   * Description: 新增授权接口
   * Summary: 新增授权接口
   */
  async addPdcpAuthEx(request: AddPdcpAuthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddPdcpAuthResponse> {
    Util.validateModel(request);
    return $tea.cast<AddPdcpAuthResponse>(await this.doRequest("1.0", "antchain.carbon.pdcp.auth.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddPdcpAuthResponse({}));
  }

  /**
   * Description: 授权取消、授权审批接口
   * Summary: 授权接口变更
   */
  async updatePdcpAuth(request: UpdatePdcpAuthRequest): Promise<UpdatePdcpAuthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updatePdcpAuthEx(request, headers, runtime);
  }

  /**
   * Description: 授权取消、授权审批接口
   * Summary: 授权接口变更
   */
  async updatePdcpAuthEx(request: UpdatePdcpAuthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdatePdcpAuthResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdatePdcpAuthResponse>(await this.doRequest("1.0", "antchain.carbon.pdcp.auth.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdatePdcpAuthResponse({}));
  }

  /**
   * Description: 路由账户查询接口
   * Summary: 路由账户查询接口
   */
  async queryGatewayAccount(request: QueryGatewayAccountRequest): Promise<QueryGatewayAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGatewayAccountEx(request, headers, runtime);
  }

  /**
   * Description: 路由账户查询接口
   * Summary: 路由账户查询接口
   */
  async queryGatewayAccountEx(request: QueryGatewayAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGatewayAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGatewayAccountResponse>(await this.doRequest("1.0", "antchain.carbon.gateway.account.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGatewayAccountResponse({}));
  }

  /**
   * Description: 授权记录查询
   * Summary: 授权记录查询
   */
  async queryPdcpAuth(request: QueryPdcpAuthRequest): Promise<QueryPdcpAuthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPdcpAuthEx(request, headers, runtime);
  }

  /**
   * Description: 授权记录查询
   * Summary: 授权记录查询
   */
  async queryPdcpAuthEx(request: QueryPdcpAuthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPdcpAuthResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPdcpAuthResponse>(await this.doRequest("1.0", "antchain.carbon.pdcp.auth.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPdcpAuthResponse({}));
  }

  /**
   * Description: 授权数据查询
   * Summary: 授权数据查询
   */
  async queryPdcpData(request: QueryPdcpDataRequest): Promise<QueryPdcpDataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPdcpDataEx(request, headers, runtime);
  }

  /**
   * Description: 授权数据查询
   * Summary: 授权数据查询
   */
  async queryPdcpDataEx(request: QueryPdcpDataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPdcpDataResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPdcpDataResponse>(await this.doRequest("1.0", "antchain.carbon.pdcp.data.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPdcpDataResponse({}));
  }

  /**
   * Description: 新增排放活动数据
   * Summary: 新增排放活动数据
   */
  async addEcarAvitivedata(request: AddEcarAvitivedataRequest): Promise<AddEcarAvitivedataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addEcarAvitivedataEx(request, headers, runtime);
  }

  /**
   * Description: 新增排放活动数据
   * Summary: 新增排放活动数据
   */
  async addEcarAvitivedataEx(request: AddEcarAvitivedataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddEcarAvitivedataResponse> {
    Util.validateModel(request);
    return $tea.cast<AddEcarAvitivedataResponse>(await this.doRequest("1.0", "antchain.carbon.ecar.avitivedata.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddEcarAvitivedataResponse({}));
  }

  /**
   * Description: 查询排放活动数据详情
   * Summary: 查询排放活动数据详情
   */
  async detailEcarAvitivedata(request: DetailEcarAvitivedataRequest): Promise<DetailEcarAvitivedataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailEcarAvitivedataEx(request, headers, runtime);
  }

  /**
   * Description: 查询排放活动数据详情
   * Summary: 查询排放活动数据详情
   */
  async detailEcarAvitivedataEx(request: DetailEcarAvitivedataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailEcarAvitivedataResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailEcarAvitivedataResponse>(await this.doRequest("1.0", "antchain.carbon.ecar.avitivedata.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailEcarAvitivedataResponse({}));
  }

  /**
   * Description: 排放活动数据统计计算
   * Summary: 排放活动数据统计计算
   */
  async countEcarActivedata(request: CountEcarActivedataRequest): Promise<CountEcarActivedataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.countEcarActivedataEx(request, headers, runtime);
  }

  /**
   * Description: 排放活动数据统计计算
   * Summary: 排放活动数据统计计算
   */
  async countEcarActivedataEx(request: CountEcarActivedataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CountEcarActivedataResponse> {
    Util.validateModel(request);
    return $tea.cast<CountEcarActivedataResponse>(await this.doRequest("1.0", "antchain.carbon.ecar.activedata.count", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CountEcarActivedataResponse({}));
  }

  /**
   * Description: 文件上传接口
   * Summary: 文件上传接口
   */
  async uploadEcarFile(request: UploadEcarFileRequest): Promise<UploadEcarFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadEcarFileEx(request, headers, runtime);
  }

  /**
   * Description: 文件上传接口
   * Summary: 文件上传接口
   */
  async uploadEcarFileEx(request: UploadEcarFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadEcarFileResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.carbon.ecar.file.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadEcarFileResponse = new UploadEcarFileResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadEcarFileResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
    }

    Util.validateModel(request);
    return $tea.cast<UploadEcarFileResponse>(await this.doRequest("1.0", "antchain.carbon.ecar.file.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadEcarFileResponse({}));
  }

  /**
   * Description: 录入绿色行为数据，支持绿色定义或电子发票等多种绿色行为类型的数据提交
   * Summary: 录入绿色行为数据
   */
  async addEcarGreenoperation(request: AddEcarGreenoperationRequest): Promise<AddEcarGreenoperationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addEcarGreenoperationEx(request, headers, runtime);
  }

  /**
   * Description: 录入绿色行为数据，支持绿色定义或电子发票等多种绿色行为类型的数据提交
   * Summary: 录入绿色行为数据
   */
  async addEcarGreenoperationEx(request: AddEcarGreenoperationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddEcarGreenoperationResponse> {
    Util.validateModel(request);
    return $tea.cast<AddEcarGreenoperationResponse>(await this.doRequest("1.0", "antchain.carbon.ecar.greenoperation.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddEcarGreenoperationResponse({}));
  }

  /**
   * Description: 统计绿色行为数据，返回时间范围内的、按绿色行为类型统计的绿色行为数据
   * Summary: 统计绿色行为数据
   */
  async countEcarGreenoperation(request: CountEcarGreenoperationRequest): Promise<CountEcarGreenoperationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.countEcarGreenoperationEx(request, headers, runtime);
  }

  /**
   * Description: 统计绿色行为数据，返回时间范围内的、按绿色行为类型统计的绿色行为数据
   * Summary: 统计绿色行为数据
   */
  async countEcarGreenoperationEx(request: CountEcarGreenoperationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CountEcarGreenoperationResponse> {
    Util.validateModel(request);
    return $tea.cast<CountEcarGreenoperationResponse>(await this.doRequest("1.0", "antchain.carbon.ecar.greenoperation.count", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CountEcarGreenoperationResponse({}));
  }

  /**
   * Description: 查询最近发生的绿色行为数据列表，按照请求的记录条数限制查询最近的绿色数据
   * Summary: 查询最近的绿色行为数据
   */
  async listEcarGreenoperation(request: ListEcarGreenoperationRequest): Promise<ListEcarGreenoperationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listEcarGreenoperationEx(request, headers, runtime);
  }

  /**
   * Description: 查询最近发生的绿色行为数据列表，按照请求的记录条数限制查询最近的绿色数据
   * Summary: 查询最近的绿色行为数据
   */
  async listEcarGreenoperationEx(request: ListEcarGreenoperationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListEcarGreenoperationResponse> {
    Util.validateModel(request);
    return $tea.cast<ListEcarGreenoperationResponse>(await this.doRequest("1.0", "antchain.carbon.ecar.greenoperation.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListEcarGreenoperationResponse({}));
  }

  /**
   * Description: 按年度统计排放数据，用于一般的总的预览页展示数据
   * Summary: 预览本年度排放统计
   */
  async previewEcarAvitivedata(request: PreviewEcarAvitivedataRequest): Promise<PreviewEcarAvitivedataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.previewEcarAvitivedataEx(request, headers, runtime);
  }

  /**
   * Description: 按年度统计排放数据，用于一般的总的预览页展示数据
   * Summary: 预览本年度排放统计
   */
  async previewEcarAvitivedataEx(request: PreviewEcarAvitivedataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PreviewEcarAvitivedataResponse> {
    Util.validateModel(request);
    return $tea.cast<PreviewEcarAvitivedataResponse>(await this.doRequest("1.0", "antchain.carbon.ecar.avitivedata.preview", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PreviewEcarAvitivedataResponse({}));
  }

  /**
   * Description: 三方平台调用此接口，查询用户的证书信息
   * Summary: 证书查询
   */
  async queryThirdCert(request: QueryThirdCertRequest): Promise<QueryThirdCertResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryThirdCertEx(request, headers, runtime);
  }

  /**
   * Description: 三方平台调用此接口，查询用户的证书信息
   * Summary: 证书查询
   */
  async queryThirdCertEx(request: QueryThirdCertRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryThirdCertResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryThirdCertResponse>(await this.doRequest("1.0", "antchain.carbon.third.cert.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryThirdCertResponse({}));
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
