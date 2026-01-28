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

// 阶段评估明细数据
export class EnterpriseLcaAssessmentItem extends $tea.Model {
  // 物料编码
  materialCode: string;
  // 数据明细名称
  assessmentItemName: string;
  // 物料直接碳排放评估量
  emissionAmount: string;
  // 物料运输碳排放评估量
  transportEmissionAmount: string;
  static names(): { [key: string]: string } {
    return {
      materialCode: 'material_code',
      assessmentItemName: 'assessment_item_name',
      emissionAmount: 'emission_amount',
      transportEmissionAmount: 'transport_emission_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      materialCode: 'string',
      assessmentItemName: 'string',
      emissionAmount: 'string',
      transportEmissionAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 运输信息
export class TransportActiveData extends $tea.Model {
  // 运输方式编码
  transportCode: string;
  // 运输设备
  equipment: string;
  // 运输里程
  distance: string;
  // 是否空载
  isEmptyLoad?: boolean;
  static names(): { [key: string]: string } {
    return {
      transportCode: 'transport_code',
      equipment: 'equipment',
      distance: 'distance',
      isEmptyLoad: 'is_empty_load',
    };
  }

  static types(): { [key: string]: any } {
    return {
      transportCode: 'string',
      equipment: 'string',
      distance: 'string',
      isEmptyLoad: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阶段评估数据明细
export class EnterpriseLcaStageAssessmentItem extends $tea.Model {
  // LCA阶段
  lcaStage: string;
  // 阶段排放占比
  lcaStageCarbonRate: string;
  // 阶段排放量
  lcaStageCarbonEmissions: string;
  // 阶段评估明细数据
  lcaAssessmentDatum: EnterpriseLcaAssessmentItem[];
  static names(): { [key: string]: string } {
    return {
      lcaStage: 'lca_stage',
      lcaStageCarbonRate: 'lca_stage_carbon_rate',
      lcaStageCarbonEmissions: 'lca_stage_carbon_emissions',
      lcaAssessmentDatum: 'lca_assessment_datum',
    };
  }

  static types(): { [key: string]: any } {
    return {
      lcaStage: 'string',
      lcaStageCarbonRate: 'string',
      lcaStageCarbonEmissions: 'string',
      lcaAssessmentDatum: { 'type': 'array', 'itemType': EnterpriseLcaAssessmentItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 存证数据字段值
export class DepositFieldValue extends $tea.Model {
  // 存证数据字段名
  name: string;
  // 存证数据字段值
  value?: string;
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

// 输入流活动数据
export class InputStreamActiveData extends $tea.Model {
  // 物料编码
  materialCode: string;
  // 用量，非负，最多6位小数
  amount: string;
  // 单位
  unit: string;
  // 运输信息列表
  transportList?: TransportActiveData[];
  static names(): { [key: string]: string } {
    return {
      materialCode: 'material_code',
      amount: 'amount',
      unit: 'unit',
      transportList: 'transport_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      materialCode: 'string',
      amount: 'string',
      unit: 'string',
      transportList: { 'type': 'array', 'itemType': TransportActiveData },
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

// 逆变器发电量
export class InverterGeneration extends $tea.Model {
  // 逆变器SN
  invSn: string;
  // 生产商名称
  manufacturer: string;
  // 当日发电量，最多3位小数
  daily: string;
  // 累计发电量，最多3位小数
  total: string;
  static names(): { [key: string]: string } {
    return {
      invSn: 'inv_sn',
      manufacturer: 'manufacturer',
      daily: 'daily',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      invSn: 'string',
      manufacturer: 'string',
      daily: 'string',
      total: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分阶段碳排放量
export class LcaStageCarbonItem extends $tea.Model {
  // 生命周期阶段：
  // [MaterialPurchase]-原材料，[ProductManufacture]-生产制造，[ProductSale]-分销，[ProductUsage]-产品使用，[ProductWithdraw]-处置/再生利用
  lcaStageCode: string;
  // 阶段碳排放量
  lcaStageCarbonAmount: string;
  static names(): { [key: string]: string } {
    return {
      lcaStageCode: 'lca_stage_code',
      lcaStageCarbonAmount: 'lca_stage_carbon_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      lcaStageCode: 'string',
      lcaStageCarbonAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 输出流活动数据
export class OutputStreamActiveData extends $tea.Model {
  // 物料编码
  materialCode: string;
  // 用量，非负，最多6位小数
  amount: string;
  // 单位
  unit: string;
  // 单价（仅产品用，产品不传时默认为空）
  unitPrice?: string;
  // 处置方式编码（仅废弃物用）
  disposalTypeCode?: string;
  // 运输信息列表（仅废弃物用）
  transportList?: TransportActiveData[];
  static names(): { [key: string]: string } {
    return {
      materialCode: 'material_code',
      amount: 'amount',
      unit: 'unit',
      unitPrice: 'unit_price',
      disposalTypeCode: 'disposal_type_code',
      transportList: 'transport_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      materialCode: 'string',
      amount: 'string',
      unit: 'string',
      unitPrice: 'string',
      disposalTypeCode: 'string',
      transportList: { 'type': 'array', 'itemType': TransportActiveData },
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

// Lca速算记录
export class LcaCalcResult extends $tea.Model {
  // 速算记录编号
  recordNo: string;
  // 碳足迹排放量
  carbonAmount: string;
  // 各阶段评估数据明细
  lcaStageAssessmentDatum: EnterpriseLcaStageAssessmentItem[];
  // 速算发起时间
  recordDate: string;
  // 自定义业务标识
  customContext?: string;
  static names(): { [key: string]: string } {
    return {
      recordNo: 'record_no',
      carbonAmount: 'carbon_amount',
      lcaStageAssessmentDatum: 'lca_stage_assessment_datum',
      recordDate: 'record_date',
      customContext: 'custom_context',
    };
  }

  static types(): { [key: string]: any } {
    return {
      recordNo: 'string',
      carbonAmount: 'string',
      lcaStageAssessmentDatum: { 'type': 'array', 'itemType': EnterpriseLcaStageAssessmentItem },
      recordDate: 'string',
      customContext: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 转型金融报告详情
export class FinanceReportDetail extends $tea.Model {
  // 文件
  file: EnterpriseDocumentFile;
  // 报告编号
  reportNo: string;
  // 报告名称
  reportName: string;
  // 是否盖章
  hasSealed: boolean;
  // 报告时间
  reportTime: string;
  // 报告提交人
  reportSubmitter: string;
  // 报告生成方式
  generateType: string;
  // 对比年，报告年
  compareYear: string;
  // 基准年
  baseYear: string;
  // 企业名称
  companyName: string;
  // 区域名称
  areaName: string;
  // 行业名称
  industryName: string;
  // 社会统一信用代码
  companyId: string;
  static names(): { [key: string]: string } {
    return {
      file: 'file',
      reportNo: 'report_no',
      reportName: 'report_name',
      hasSealed: 'has_sealed',
      reportTime: 'report_time',
      reportSubmitter: 'report_submitter',
      generateType: 'generate_type',
      compareYear: 'compare_year',
      baseYear: 'base_year',
      companyName: 'company_name',
      areaName: 'area_name',
      industryName: 'industry_name',
      companyId: 'company_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      file: EnterpriseDocumentFile,
      reportNo: 'string',
      reportName: 'string',
      hasSealed: 'boolean',
      reportTime: 'string',
      reportSubmitter: 'string',
      generateType: 'string',
      compareYear: 'string',
      baseYear: 'string',
      companyName: 'string',
      areaName: 'string',
      industryName: 'string',
      companyId: 'string',
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

// 数据资产信息
export class DataAssetInfo extends $tea.Model {
  // 数据资产DID
  datasetDid: string;
  // 数据资产所有方DID
  userDid: string;
  // 数据资产名称
  datasetName: string;
  // 数据类型
  dataType: string;
  static names(): { [key: string]: string } {
    return {
      datasetDid: 'dataset_did',
      userDid: 'user_did',
      datasetName: 'dataset_name',
      dataType: 'data_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      datasetDid: 'string',
      userDid: 'string',
      datasetName: 'string',
      dataType: 'string',
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

// 设备发电量
export class DeviceGeneration extends $tea.Model {
  // 设备内部编号，注册设备后获取
  deviceNo: string;
  // 逆变器发电量列表
  inverterGenerations: InverterGeneration[];
  static names(): { [key: string]: string } {
    return {
      deviceNo: 'device_no',
      inverterGenerations: 'inverter_generations',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deviceNo: 'string',
      inverterGenerations: { 'type': 'array', 'itemType': InverterGeneration },
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

// 数据存证信息
export class DataDepositInfo extends $tea.Model {
  // 存证字段值
  dataValue: DepositFieldValue[];
  // 数据存证区块链交易ID
  txId?: string;
  // 数据存证操作用户ID
  userId: string;
  // 存证数据内容
  depositContent: string;
  // 存证执行状态
  status: string;
  // 存证执行(发起)时间
  timestamp: number;
  static names(): { [key: string]: string } {
    return {
      dataValue: 'data_value',
      txId: 'tx_id',
      userId: 'user_id',
      depositContent: 'deposit_content',
      status: 'status',
      timestamp: 'timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dataValue: { 'type': 'array', 'itemType': DepositFieldValue },
      txId: 'string',
      userId: 'string',
      depositContent: 'string',
      status: 'string',
      timestamp: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 碳普惠补偿采集数据条目
export class CarbonOffsetAcquisitionItem extends $tea.Model {
  // 采集数据单号
  acquisitionItemNo: string;
  // 碳补偿项目编号
  projectNo: string;
  // 参与账户DID
  accountDid: string;
  // 发生时间
  occurrentTime: string;
  // 发生场景编码
  scenarioCode: string;
  // 发生场景名称
  scenarioName: string;
  // 碳普惠平台编码，如果非平台采集数据，则显示为自采编码：Self
  platformNo: string;
  // 活动数据原始值，多个活动数据列表
  activeDatum?: AnyAmountItem[];
  // 减碳量
  offsetVolume?: string;
  // 碳能量值
  carbonEnergy?: number;
  static names(): { [key: string]: string } {
    return {
      acquisitionItemNo: 'acquisition_item_no',
      projectNo: 'project_no',
      accountDid: 'account_did',
      occurrentTime: 'occurrent_time',
      scenarioCode: 'scenario_code',
      scenarioName: 'scenario_name',
      platformNo: 'platform_no',
      activeDatum: 'active_datum',
      offsetVolume: 'offset_volume',
      carbonEnergy: 'carbon_energy',
    };
  }

  static types(): { [key: string]: any } {
    return {
      acquisitionItemNo: 'string',
      projectNo: 'string',
      accountDid: 'string',
      occurrentTime: 'string',
      scenarioCode: 'string',
      scenarioName: 'string',
      platformNo: 'string',
      activeDatum: { 'type': 'array', 'itemType': AnyAmountItem },
      offsetVolume: 'string',
      carbonEnergy: 'number',
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

// 三方平台客户摘要信息
export class PlatformCustomerSummary extends $tea.Model {
  // 三方平台的客户ID
  customerId: string;
  // 三方平台客户名称
  customerName: string;
  // 联系人
  contactPerson: string;
  // 联系电话
  contactTelephone: string;
  // 联系邮箱
  contactEmail?: string;
  // 统一社会信用代码
  socialCreditCode: string;
  static names(): { [key: string]: string } {
    return {
      customerId: 'customer_id',
      customerName: 'customer_name',
      contactPerson: 'contact_person',
      contactTelephone: 'contact_telephone',
      contactEmail: 'contact_email',
      socialCreditCode: 'social_credit_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      customerId: 'string',
      customerName: 'string',
      contactPerson: 'string',
      contactTelephone: 'string',
      contactEmail: 'string',
      socialCreditCode: 'string',
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

// 数据类型
export class DataTypeInfo extends $tea.Model {
  // 数据类型编码
  dataTypeNo: string;
  // 数据类型名称
  dataTypeName: string;
  // 数据类型配置
  dataTypeConfig: string;
  // 数据JSON格式检查
  dataJsonSchema: string;
  static names(): { [key: string]: string } {
    return {
      dataTypeNo: 'data_type_no',
      dataTypeName: 'data_type_name',
      dataTypeConfig: 'data_type_config',
      dataJsonSchema: 'data_json_schema',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dataTypeNo: 'string',
      dataTypeName: 'string',
      dataTypeConfig: 'string',
      dataJsonSchema: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// LCA碳足迹分析计算数据
export class LcaCarbonDatum extends $tea.Model {
  // LCA碳排放总量
  lcaCarbonAmount: string;
  // 足迹报告pdf文件下载地址（30分钟内下载有效）
  lcaReportFileUrl: string;
  // 足迹分析结果详情文件地址（30分钟内下载有效）
  lcaDetailFileUrl: string;
  // B2B-从摇篮到大门，B2C-从摇篮到坟墓
  lifeCycleBoundary: string;
  // 足迹开始时间，格式：yyyyMMdd
  lcaStartDate: string;
  // 足迹结束时间 格式：yyyyMMdd
  lcaEndDate: string;
  // 分阶段碳排放量列表
  lcaStageCarbonDatum: LcaStageCarbonItem[];
  static names(): { [key: string]: string } {
    return {
      lcaCarbonAmount: 'lca_carbon_amount',
      lcaReportFileUrl: 'lca_report_file_url',
      lcaDetailFileUrl: 'lca_detail_file_url',
      lifeCycleBoundary: 'life_cycle_boundary',
      lcaStartDate: 'lca_start_date',
      lcaEndDate: 'lca_end_date',
      lcaStageCarbonDatum: 'lca_stage_carbon_datum',
    };
  }

  static types(): { [key: string]: any } {
    return {
      lcaCarbonAmount: 'string',
      lcaReportFileUrl: 'string',
      lcaDetailFileUrl: 'string',
      lifeCycleBoundary: 'string',
      lcaStartDate: 'string',
      lcaEndDate: 'string',
      lcaStageCarbonDatum: { 'type': 'array', 'itemType': LcaStageCarbonItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 转型路径分析数据
export class TransferPathAnalysis extends $tea.Model {
  // 所属领域
  field: string;
  // 目录编号
  indexNumber: string;
  // 目录内容
  indexContent: string;
  // 技术标准说明
  detail: string;
  // 企业是否采取该路径
  target: string;
  static names(): { [key: string]: string } {
    return {
      field: 'field',
      indexNumber: 'index_number',
      indexContent: 'index_content',
      detail: 'detail',
      target: 'target',
    };
  }

  static types(): { [key: string]: any } {
    return {
      field: 'string',
      indexNumber: 'string',
      indexContent: 'string',
      detail: 'string',
      target: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据授权策略
export class AuthorizePolicy extends $tea.Model {
  // 授权策略ID
  policyId: string;
  // 授权策略描述
  description: string;
  // 授权策略配置
  authorizeConfig: string;
  static names(): { [key: string]: string } {
    return {
      policyId: 'policy_id',
      description: 'description',
      authorizeConfig: 'authorize_config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      policyId: 'string',
      description: 'string',
      authorizeConfig: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 产品概要信息
export class EnterpriseProductOutline extends $tea.Model {
  // 产品自定义编码
  // 
  enterpriseCustomCode: string;
  // 产品名称
  // 
  productName: string;
  // 规格型号
  specification: string;
  // 产品描述
  productDescription?: string;
  // 产品分类名称
  productCategoryName: string;
  // 品牌信息
  brandInformation?: string;
  static names(): { [key: string]: string } {
    return {
      enterpriseCustomCode: 'enterprise_custom_code',
      productName: 'product_name',
      specification: 'specification',
      productDescription: 'product_description',
      productCategoryName: 'product_category_name',
      brandInformation: 'brand_information',
    };
  }

  static types(): { [key: string]: any } {
    return {
      enterpriseCustomCode: 'string',
      productName: 'string',
      specification: 'string',
      productDescription: 'string',
      productCategoryName: 'string',
      brandInformation: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 碳补偿活动数据详情
export class CarbonOffsetActiveDataDetail extends $tea.Model {
  // 活动数据编号
  activeDataNo: string;
  // 活动数据名称
  activeDataName?: string;
  // 活动数据单位
  activeDataUnit?: string;
  // 活动数据描述文案
  description?: string;
  // 活动数据值
  activeDataValue: string;
  static names(): { [key: string]: string } {
    return {
      activeDataNo: 'active_data_no',
      activeDataName: 'active_data_name',
      activeDataUnit: 'active_data_unit',
      description: 'description',
      activeDataValue: 'active_data_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      activeDataNo: 'string',
      activeDataName: 'string',
      activeDataUnit: 'string',
      description: 'string',
      activeDataValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 机构会员资料
export class EnterpriseMemberSummary extends $tea.Model {
  // 机构会员DID
  accountDid: string;
  // 会员姓名，数据脱敏处理返回
  name?: string;
  // 会员手机号码，数据脱敏处理返回
  mobile?: string;
  // 会员注册时间
  registerTime: string;
  static names(): { [key: string]: string } {
    return {
      accountDid: 'account_did',
      name: 'name',
      mobile: 'mobile',
      registerTime: 'register_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accountDid: 'string',
      name: 'string',
      mobile: 'string',
      registerTime: 'string',
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

// 企业产品信息
export class EnterpriseProductSummary extends $tea.Model {
  // 产品自定义编码
  enterpriseCustomCode: string;
  // 产品名称
  productName: string;
  // 规格型号
  specification: string;
  // 产品描述
  productDescription?: string;
  // 产品分类名称
  productCategoryName: string;
  // 品牌信息
  brandInformation?: string;
  // 工艺流程文件路径，上传文件后由上传文件接口提供，最多支持上传3个工艺流程文件
  processFlowFileList?: EnterpriseDocumentFile[];
  // 产品图片文件路径，上传文件后由上传文件接口提供，最多支持上传8个产品图片文件
  productPictureFileList?: EnterpriseDocumentFile[];
  static names(): { [key: string]: string } {
    return {
      enterpriseCustomCode: 'enterprise_custom_code',
      productName: 'product_name',
      specification: 'specification',
      productDescription: 'product_description',
      productCategoryName: 'product_category_name',
      brandInformation: 'brand_information',
      processFlowFileList: 'process_flow_file_list',
      productPictureFileList: 'product_picture_file_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      enterpriseCustomCode: 'string',
      productName: 'string',
      specification: 'string',
      productDescription: 'string',
      productCategoryName: 'string',
      brandInformation: 'string',
      processFlowFileList: { 'type': 'array', 'itemType': EnterpriseDocumentFile },
      productPictureFileList: { 'type': 'array', 'itemType': EnterpriseDocumentFile },
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

// 溯源碳足迹项目
export class LcaProjectTrace extends $tea.Model {
  // 碳足迹编码
  projectNo: string;
  // 碳足迹生命周期边界
  lifeCycleBoundary: string;
  // 产品编码
  productNo: string;
  // 碳足迹项目排放量
  lcaCarbonAmount: string;
  // 产品名称
  productName: string;
  // 产品规格型号
  specification: string;
  // 碳足迹开始时间
  lcaStartDate: string;
  // 碳足迹结束时间
  lcaEndDate: string;
  // 溯源状态
  traceStatus: string;
  static names(): { [key: string]: string } {
    return {
      projectNo: 'project_no',
      lifeCycleBoundary: 'life_cycle_boundary',
      productNo: 'product_no',
      lcaCarbonAmount: 'lca_carbon_amount',
      productName: 'product_name',
      specification: 'specification',
      lcaStartDate: 'lca_start_date',
      lcaEndDate: 'lca_end_date',
      traceStatus: 'trace_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      projectNo: 'string',
      lifeCycleBoundary: 'string',
      productNo: 'string',
      lcaCarbonAmount: 'string',
      productName: 'string',
      specification: 'string',
      lcaStartDate: 'string',
      lcaEndDate: 'string',
      traceStatus: 'string',
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

// 生命周期阶段活动数据
export class LcaStageActiveData extends $tea.Model {
  // LCA阶段
  lcaStage: string;
  // 输入流活动数据列表
  inputStreamList: InputStreamActiveData[];
  // 输出流活动数据列表
  outputStreamList: OutputStreamActiveData[];
  static names(): { [key: string]: string } {
    return {
      lcaStage: 'lca_stage',
      inputStreamList: 'input_stream_list',
      outputStreamList: 'output_stream_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      lcaStage: 'string',
      inputStreamList: { 'type': 'array', 'itemType': InputStreamActiveData },
      outputStreamList: { 'type': 'array', 'itemType': OutputStreamActiveData },
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
  authenticationNo?: string;
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

export class DetailPdcpDepositRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据类型名称，用户标识记录的数据类型。
  dataType: string;
  // 存证数据ID，存证数据唯一标识ID。
  dataId: string;
  // 数据存证区块链交易ID，对应数据版本号。 若未指定，返回最近的版本。
  txId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dataType: 'data_type',
      dataId: 'data_id',
      txId: 'tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataType: 'string',
      dataId: 'string',
      txId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailPdcpDepositResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证数据类型
  dataType?: string;
  // 存证数据唯一ID
  dataId?: string;
  // 存证数据内容
  depositData?: DataDepositInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      dataType: 'data_type',
      dataId: 'data_id',
      depositData: 'deposit_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      dataType: 'string',
      dataId: 'string',
      depositData: DataDepositInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPdcpDtraceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 存证数据类型名称
  dataType: string;
  // 存证数据ID
  dataId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dataType: 'data_type',
      dataId: 'data_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataType: 'string',
      dataId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPdcpDtraceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证数据类型名称
  dataType?: string;
  // 存证数据ID
  dataId?: string;
  // 存证数据版本列表
  versions?: DataDepositInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      dataType: 'data_type',
      dataId: 'data_id',
      versions: 'versions',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      dataType: 'string',
      dataId: 'string',
      versions: { 'type': 'array', 'itemType': DataDepositInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckPdcpDtraceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 存证数据类型名称
  dataType: string;
  // 存证数据ID
  dataId: string;
  // 存证操作区块链交易ID，即存证数据版本号。若未指定，检查当前最新版本。
  txId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dataType: 'data_type',
      dataId: 'data_id',
      txId: 'tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataType: 'string',
      dataId: 'string',
      txId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckPdcpDtraceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证操作内容
  depositData?: DataDepositInfo;
  // 区块链编号
  blockNumber?: number;
  // 数据存证方式
  depositType?: string;
  // 链上数据
  onChainData?: string;
  // 链下数据
  offChainData?: string;
  // 链上-链下数据是否一致
  consistent?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      depositData: 'deposit_data',
      blockNumber: 'block_number',
      depositType: 'deposit_type',
      onChainData: 'on_chain_data',
      offChainData: 'off_chain_data',
      consistent: 'consistent',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      depositData: DataDepositInfo,
      blockNumber: 'number',
      depositType: 'string',
      onChainData: 'string',
      offChainData: 'string',
      consistent: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryPdcpDataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务数据类型，查询该数据类型的授权数据
  dataType: string;
  // 授权方身份ID，若指定查询该用户授权的数据
  authorizerDid?: string;
  // 被授权方身份ID，若指定查询授权给该用户的数据
  authorizedDid?: string;
  // 当前页面，默认1
  pageNumber: number;
  // 分页大小，默认20
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dataType: 'data_type',
      authorizerDid: 'authorizer_did',
      authorizedDid: 'authorized_did',
      pageNumber: 'page_number',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataType: 'string',
      authorizerDid: 'string',
      authorizedDid: 'string',
      pageNumber: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryPdcpDataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总记录条数
  total?: number;
  // 当前页面
  pageNumber?: number;
  // 分页大小
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

export class QueryPdcpOwndataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务数据类型
  dataType: string;
  // 拥有数据的用户
  userDid?: string;
  // 当前分页，默认1
  pageNumber?: number;
  // 分页大小，默认20
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dataType: 'data_type',
      userDid: 'user_did',
      pageNumber: 'page_number',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataType: 'string',
      userDid: 'string',
      pageNumber: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPdcpOwndataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总记录条数
  total?: number;
  // 当前分页
  pageNumber?: number;
  // 分页大小
  pageSize?: number;
  // 数据记录列表
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

export class QueryPdcpDataassetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前页码，默认1
  pageNumber?: number;
  // 页面大小，默认20
  pageSize?: number;
  // 数据类型
  dataTypeNo?: string;
  // 数据资产所有者
  userDid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageNumber: 'page_number',
      pageSize: 'page_size',
      dataTypeNo: 'data_type_no',
      userDid: 'user_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageNumber: 'number',
      pageSize: 'number',
      dataTypeNo: 'string',
      userDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPdcpDataassetResponse extends $tea.Model {
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
  // 数据资产信息
  dataAssetList?: DataAssetInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      total: 'total',
      pageNumber: 'page_number',
      pageSize: 'page_size',
      dataAssetList: 'data_asset_list',
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
      dataAssetList: { 'type': 'array', 'itemType': DataAssetInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterPdcpDataassetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据类型编码
  dataTypeNo: string;
  // 数据资产所有者id
  userDid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dataTypeNo: 'data_type_no',
      userDid: 'user_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataTypeNo: 'string',
      userDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterPdcpDataassetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 资产id
  datasetId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      datasetId: 'dataset_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      datasetId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddAuthAdminRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授权策略ID
  policyId: string;
  // 授权策略描述
  description: string;
  // 授权策略配置
  authorizeConfig: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      policyId: 'policy_id',
      description: 'description',
      authorizeConfig: 'authorize_config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      policyId: 'string',
      description: 'string',
      authorizeConfig: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddAuthAdminResponse extends $tea.Model {
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

export class PagequeryAuthAdminRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前查询页数
  pageNumber?: number;
  // 每页记录条数，默认为20
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageNumber: 'page_number',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageNumber: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryAuthAdminResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授权策略配置
  authorizePolicyList?: AuthorizePolicy[];
  // 总数量
  total?: number;
  // 当前页
  pageNumber?: number;
  // 每页条数
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      authorizePolicyList: 'authorize_policy_list',
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
      authorizePolicyList: { 'type': 'array', 'itemType': AuthorizePolicy },
      total: 'number',
      pageNumber: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAuthAdminRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据授权策略ID
  policyId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      policyId: 'policy_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      policyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAuthAdminResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授权策略
  data?: AuthorizePolicy;
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
      data: AuthorizePolicy,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddDataassetTypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据类型编码
  dataTypeNo: string;
  // 数据类型名称
  dataTypeName: string;
  // 数据类型配置
  dataTypeConfig: string;
  // 数据JSON格式检查
  dataJsonSchema: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dataTypeNo: 'data_type_no',
      dataTypeName: 'data_type_name',
      dataTypeConfig: 'data_type_config',
      dataJsonSchema: 'data_json_schema',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataTypeNo: 'string',
      dataTypeName: 'string',
      dataTypeConfig: 'string',
      dataJsonSchema: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddDataassetTypeResponse extends $tea.Model {
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

export class PagequeryDataassetTypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前查询页数
  pageNumber?: number;
  // 每页记录条数，默认为20
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageNumber: 'page_number',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageNumber: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryDataassetTypeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // DataTypeInfo
  dataTypeInfo?: DataTypeInfo[];
  // 总数量
  total?: number;
  // 1
  pageNumber?: number;
  // pageSize
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      dataTypeInfo: 'data_type_info',
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
      dataTypeInfo: { 'type': 'array', 'itemType': DataTypeInfo },
      total: 'number',
      pageNumber: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartDatasetCollectingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部数据ID
  datasetId: string;
  // 采集数据所属用户ID
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      datasetId: 'dataset_id',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      datasetId: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartDatasetCollectingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据采集任务ID，扩展用
  taskId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDatasetCollectingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部数据ID
  datasetId: string;
  // 操作用户ID
  userId: string;
  // 数据采集任务ID，若无查询最新的采集任务
  taskId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      datasetId: 'dataset_id',
      userId: 'user_id',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      datasetId: 'string',
      userId: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDatasetCollectingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 采集状态
  status?: string;
  // 采集数据记录数
  dataCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      dataCount: 'data_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      dataCount: 'number',
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

export class RegisterEcarEnterprisememberRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 注册会员在蚂蚁DIS服务的DID账号
  accountDid?: string;
  // 注册会员姓名
  name?: string;
  // 注册会员身份证号码
  identityCardCode?: string;
  // 手机号码
  mobile?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountDid: 'account_did',
      name: 'name',
      identityCardCode: 'identity_card_code',
      mobile: 'mobile',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountDid: 'string',
      name: 'string',
      identityCardCode: 'string',
      mobile: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterEcarEnterprisememberResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 蚂蚁DIS服务的DID账号
  accountDid?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accountDid: 'account_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accountDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddEcarOffsetacquisitionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 活动数据采集单号
  acquisitionItemNo: string;
  // 碳普惠减碳项目编号
  projectNo: string;
  // 参与的碳账户DID
  accountDid: string;
  // 发生时间，格式为yyyy-MM-DD HH:MM:SS（到秒）或 yyyy-MM-DD（按日录入）
  occurrentTime: string;
  // 发生场景，需要按照约定的场景编码提交
  scenarioCode: string;
  // 活动数据列表
  activeDataList: AnyAmountItem[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      acquisitionItemNo: 'acquisition_item_no',
      projectNo: 'project_no',
      accountDid: 'account_did',
      occurrentTime: 'occurrent_time',
      scenarioCode: 'scenario_code',
      activeDataList: 'active_data_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      acquisitionItemNo: 'string',
      projectNo: 'string',
      accountDid: 'string',
      occurrentTime: 'string',
      scenarioCode: 'string',
      activeDataList: { 'type': 'array', 'itemType': AnyAmountItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddEcarOffsetacquisitionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 活动数据采集单号
  acquisitionItemNo?: string;
  // 减碳量，最多4位小数
  carbonEmissionAmount?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      acquisitionItemNo: 'acquisition_item_no',
      carbonEmissionAmount: 'carbon_emission_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      acquisitionItemNo: 'string',
      carbonEmissionAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddEcarOffsettranslateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 转移业务流水单号
  translationItemNo: string;
  // 碳补偿项目编号
  projectNo: string;
  // 出账账户DID
  drawingAccountDid: string;
  // 转移入账账户DID
  receiptAccountDid: string;
  // 转移减碳量额度，最多六位小数
  translationAmmount: string;
  // 业务类型包括，默认不需要传入，默认值为Translation
  translationType?: string;
  // 发生时间，格式为yyyy-MM-DD HH:MM:SS
  occurrentTime: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      translationItemNo: 'translation_item_no',
      projectNo: 'project_no',
      drawingAccountDid: 'drawing_account_did',
      receiptAccountDid: 'receipt_account_did',
      translationAmmount: 'translation_ammount',
      translationType: 'translation_type',
      occurrentTime: 'occurrent_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      translationItemNo: 'string',
      projectNo: 'string',
      drawingAccountDid: 'string',
      receiptAccountDid: 'string',
      translationAmmount: 'string',
      translationType: 'string',
      occurrentTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddEcarOffsettranslateResponse extends $tea.Model {
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

export class AuthEcarOffsetdatumRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 会员在蚂蚁DIS服务的账户DID
  accountDid: string;
  // 碳普惠平台编码，如蚂蚁森林编码为Antforest
  carbonOffsetPlatformNo: string;
  // 平台方会员账户ID
  platformAccountId: string;
  // 授权关键数据列表，KV结构列表
  authKeywordList: AnyKeywordItem[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountDid: 'account_did',
      carbonOffsetPlatformNo: 'carbon_offset_platform_no',
      platformAccountId: 'platform_account_id',
      authKeywordList: 'auth_keyword_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountDid: 'string',
      carbonOffsetPlatformNo: 'string',
      platformAccountId: 'string',
      authKeywordList: { 'type': 'array', 'itemType': AnyKeywordItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthEcarOffsetdatumResponse extends $tea.Model {
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

export class ListEcarOffsetdatumRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 碳补偿项目编码
  projectNo?: string;
  // 账户DID
  accountDid?: string;
  // 发生开始时间
  occurrentStartTime?: string;
  // 数据发生截止时间
  occurrentEndTime?: string;
  // 碳普惠平台编码
  carbonOffsetPlatformNo?: string;
  // 发生场景编码，需指定相关碳普惠平台的场景编码，可以指定多个场景
  scenarioCode?: string[];
  // 分页查询数据时的页码，从1开始，不传入时默认值为1
  current?: number;
  // 每页数据量，默认值为20，取值范围为[10,200]
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectNo: 'project_no',
      accountDid: 'account_did',
      occurrentStartTime: 'occurrent_start_time',
      occurrentEndTime: 'occurrent_end_time',
      carbonOffsetPlatformNo: 'carbon_offset_platform_no',
      scenarioCode: 'scenario_code',
      current: 'current',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectNo: 'string',
      accountDid: 'string',
      occurrentStartTime: 'string',
      occurrentEndTime: 'string',
      carbonOffsetPlatformNo: 'string',
      scenarioCode: { 'type': 'array', 'itemType': 'string' },
      current: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListEcarOffsetdatumResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前查询的页码
  current?: number;
  // 每页记录条数
  pageSize?: number;
  // 记录总条数
  total?: number;
  // 碳普惠减碳数据明细
  list?: CarbonOffsetAcquisitionItem[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      current: 'current',
      pageSize: 'page_size',
      total: 'total',
      list: 'list',
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
      list: { 'type': 'array', 'itemType': CarbonOffsetAcquisitionItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListEcarEnterprisememberRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 会员注册开始时间
  registerStartTime?: string;
  // 会员注册结束时间
  registerEndTime?: string;
  // 当前查询页码，默认值为1
  current?: number;
  // 每页记录条数，默认为20，取值范围为[10,200]
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      registerStartTime: 'register_start_time',
      registerEndTime: 'register_end_time',
      current: 'current',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      registerStartTime: 'string',
      registerEndTime: 'string',
      current: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListEcarEnterprisememberResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前查询的页码
  current?: number;
  // 每页记录条数
  pageSize?: number;
  // 记录总条数
  total?: number;
  // 会员资料列表
  list?: EnterpriseMemberSummary[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      current: 'current',
      pageSize: 'page_size',
      total: 'total',
      list: 'list',
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
      list: { 'type': 'array', 'itemType': EnterpriseMemberSummary },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PreviewEcarOffsetdatumRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 碳普惠项目编码
  projectNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectNo: 'project_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PreviewEcarOffsetdatumResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 注册会员总数
  registerMemberTotal?: number;
  // 碳总能量值
  carbonEnergyTotal?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      registerMemberTotal: 'register_member_total',
      carbonEnergyTotal: 'carbon_energy_total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      registerMemberTotal: 'number',
      carbonEnergyTotal: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailEcarEnterprisememberRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 注册会员手机号码
  mobile?: string;
  // 注册会员身份证号码
  identityCardCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      mobile: 'mobile',
      identityCardCode: 'identity_card_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      mobile: 'string',
      identityCardCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailEcarEnterprisememberResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 账户DID
  accountDid?: string;
  // 会员姓名，脱敏处理
  name?: string;
  // 会员手机号码，脱敏处理
  mobile?: string;
  // 注册时间
  registerTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accountDid: 'account_did',
      name: 'name',
      mobile: 'mobile',
      registerTime: 'register_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accountDid: 'string',
      name: 'string',
      mobile: 'string',
      registerTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEcarOffsetaccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 碳普惠项目编码
  projectNo: string;
  // 账户DID
  accountDid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectNo: 'project_no',
      accountDid: 'account_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectNo: 'string',
      accountDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEcarOffsetaccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 碳普惠项目编码
  projectNo?: string;
  // 账户DID
  accountDid?: string;
  // 账户减碳量余额
  offsetBalance?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      projectNo: 'project_no',
      accountDid: 'account_did',
      offsetBalance: 'offset_balance',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      projectNo: 'string',
      accountDid: 'string',
      offsetBalance: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailEcarOffsetdatumRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务发生时的调用方的业务单号
  acquisitionItemNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      acquisitionItemNo: 'acquisition_item_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      acquisitionItemNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailEcarOffsetdatumResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 碳补偿项目编码
  projectNo?: string;
  // 碳普惠项目名称
  projectName?: string;
  // 会员账户DID
  accountDid?: string;
  // 采集数据单号
  // 
  acquisitionItemNo?: string;
  // 发生时间
  occurrentTime?: string;
  // 发生场景编码
  scenarioCode?: string;
  // 发生场景名称
  scenarioName?: string;
  // 碳普惠平台编码，如果非平台采集数据，则显示为自采编码：Self
  platformNo?: string;
  // 减碳量
  offsetVolume?: string;
  // 碳能量值
  carbonEnergy?: number;
  // 活动数据详情列表
  activeDataList?: CarbonOffsetActiveDataDetail[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      projectNo: 'project_no',
      projectName: 'project_name',
      accountDid: 'account_did',
      acquisitionItemNo: 'acquisition_item_no',
      occurrentTime: 'occurrent_time',
      scenarioCode: 'scenario_code',
      scenarioName: 'scenario_name',
      platformNo: 'platform_no',
      offsetVolume: 'offset_volume',
      carbonEnergy: 'carbon_energy',
      activeDataList: 'active_data_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      projectNo: 'string',
      projectName: 'string',
      accountDid: 'string',
      acquisitionItemNo: 'string',
      occurrentTime: 'string',
      scenarioCode: 'string',
      scenarioName: 'string',
      platformNo: 'string',
      offsetVolume: 'string',
      carbonEnergy: 'number',
      activeDataList: { 'type': 'array', 'itemType': CarbonOffsetActiveDataDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailEcarOffsettranslateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 减碳数据转移记录业务方的业务单号
  translationItemNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      translationItemNo: 'translation_item_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      translationItemNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailEcarOffsettranslateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务方的业务单号
  translationItemNo?: string;
  // 发生时间
  occurrenceTime?: string;
  // 业务发生量：转移量
  amount?: string;
  // 碳补偿项目编码
  projectNo?: string;
  // 碳普惠项目名称
  projectName?: string;
  // 转出碳账户DID
  drawingAccountDid?: string;
  // 转入碳账户DID
  receiptAccountDid?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      translationItemNo: 'translation_item_no',
      occurrenceTime: 'occurrence_time',
      amount: 'amount',
      projectNo: 'project_no',
      projectName: 'project_name',
      drawingAccountDid: 'drawing_account_did',
      receiptAccountDid: 'receipt_account_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      translationItemNo: 'string',
      occurrenceTime: 'string',
      amount: 'string',
      projectNo: 'string',
      projectName: 'string',
      drawingAccountDid: 'string',
      receiptAccountDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitEcarLcaassementRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单编号，碳矩阵关联的订单编号，业务主键
  orderNo: string;
  // LCA产品评估状态，返回约定的状态编码
  status: string;
  // 项目摘要信息，包括有关产品详情和报告时间等，JSON格式，按照约定的格式解析成碳矩阵对应的碳足迹项目和产品信息
  projectSummary?: string;
  // 产品工序数据，JSON格式，按照约定的格式解析成碳矩阵对应的工序信息
  processDatum?: string;
  // 碳足迹评估结果数据，JSON格式，按照约定的格式解析成碳矩阵对应的评估结果
  assementResult?: string;
  // 碳足迹评估报告，包括一些报告文件地址等，JSON格式，碳矩阵下载保存对应的报告文件
  assementReport?: string;
  // 扩展信息，JSON格式，预留需提交的数据
  extraDatum?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      status: 'status',
      projectSummary: 'project_summary',
      processDatum: 'process_datum',
      assementResult: 'assement_result',
      assementReport: 'assement_report',
      extraDatum: 'extra_datum',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      status: 'string',
      projectSummary: 'string',
      processDatum: 'string',
      assementResult: 'string',
      assementReport: 'string',
      extraDatum: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitEcarLcaassementResponse extends $tea.Model {
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

export class UploadEcarPlaformfileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 上传的文件名
  fileName?: string;
  // 待上传文件
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileName: 'file_name',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileName: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadEcarPlaformfileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文档名称
  documentName?: string;
  // 文档地址信息
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

export class SubmitEcarLcaorderwithcustomerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户信息
  customer: PlatformCustomerSummary;
  // 产品信息
  product: EnterpriseProductSummary;
  // 订单时间，格式：yyyy-MM-dd HH:mm:ss
  orderTime: string;
  // 订单金额，订单金额只能为有效数字（整数不得大于10位，小数不得大于6位）
  orderAmount: string;
  // 来源于三方平台的订单编号
  sourceOrderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      customer: 'customer',
      product: 'product',
      orderTime: 'order_time',
      orderAmount: 'order_amount',
      sourceOrderNo: 'source_order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      customer: PlatformCustomerSummary,
      product: EnterpriseProductSummary,
      orderTime: 'string',
      orderAmount: 'string',
      sourceOrderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitEcarLcaorderwithcustomerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单编号
  orderNo?: string;
  // 来源于三方平台的订单编号
  sourceOrderNo?: string;
  // 碳账户编号，碳矩阵为客户分配的碳账户编号
  carbonAccountNo?: string;
  // 订单状态，Pending——处理中，Closed——已关闭，Finished——已完成
  orderStatus?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderNo: 'order_no',
      sourceOrderNo: 'source_order_no',
      carbonAccountNo: 'carbon_account_no',
      orderStatus: 'order_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderNo: 'string',
      sourceOrderNo: 'string',
      carbonAccountNo: 'string',
      orderStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetEcarPlaformauthtokenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 三方平台的客户ID
  customerId?: string;
  // 碳账户编号，碳矩阵为客户分配的碳账户编号，跟前面三方平台的客户customer_id必须任意传一个参数，优先使用customer_id查询客户
  carbonAccountNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      customerId: 'customer_id',
      carbonAccountNo: 'carbon_account_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      customerId: 'string',
      carbonAccountNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetEcarPlaformauthtokenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 三方平台客户ID
  customerId?: string;
  // 碳账户编号，碳矩阵为客户分配的碳账户编号
  carbonAccountNo?: string;
  // 授权三方平台客户信登的TOKEN
  accessToken?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      customerId: 'customer_id',
      carbonAccountNo: 'carbon_account_no',
      accessToken: 'access_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      customerId: 'string',
      carbonAccountNo: 'string',
      accessToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEcarLcaorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号码
  orderNo?: string;
  // 来源于三方平台的订单编号，跟前面的订单编号order_no必须任传一个进行订单查询。优先使用碳矩阵平台生成的订单编号查询
  sourceOrderNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      sourceOrderNo: 'source_order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      sourceOrderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEcarLcaorderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // LCA订单单号
  orderNo?: string;
  // 来源于三方平台的订单编号
  sourceOrderNo?: string;
  // 三方平台客户ID，在三方平台唯一
  customerId?: string;
  // 碳账户编号，碳矩阵为客户分配的碳账户编号
  carbonAccountNo?: string;
  // Pending——待分配，Closed——已关闭，Allocated——已分配，Finished——已完成
  orderStatus?: string;
  // 产品概要信息
  product?: EnterpriseProductOutline;
  // 足迹计算信息
  lcaCarbonDatum?: LcaCarbonDatum;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderNo: 'order_no',
      sourceOrderNo: 'source_order_no',
      customerId: 'customer_id',
      carbonAccountNo: 'carbon_account_no',
      orderStatus: 'order_status',
      product: 'product',
      lcaCarbonDatum: 'lca_carbon_datum',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderNo: 'string',
      sourceOrderNo: 'string',
      customerId: 'string',
      carbonAccountNo: 'string',
      orderStatus: 'string',
      product: EnterpriseProductOutline,
      lcaCarbonDatum: LcaCarbonDatum,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateEcarGreencertificategenerationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据发生时间
  date: string;
  // 逆变器发电量列表
  inverterGenerations: InverterGeneration[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      date: 'date',
      inverterGenerations: 'inverter_generations',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      date: 'string',
      inverterGenerations: { 'type': 'array', 'itemType': InverterGeneration },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateEcarGreencertificategenerationResponse extends $tea.Model {
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

export class SubmitEcarLcacalcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 目标产品编码
  materialCode: string;
  // 授权过程编码
  processNo: string;
  // 生命周期边界
  lifeCycleBoundary: string;
  // 产品功能单位
  functionalUnit: string;
  // 功能单位数量
  functionalAmount: string;
  // 各阶段活动数据
  stageActiveDataList: LcaStageActiveData[];
  // 自定义业务标识
  customContext?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      materialCode: 'material_code',
      processNo: 'process_no',
      lifeCycleBoundary: 'life_cycle_boundary',
      functionalUnit: 'functional_unit',
      functionalAmount: 'functional_amount',
      stageActiveDataList: 'stage_active_data_list',
      customContext: 'custom_context',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      materialCode: 'string',
      processNo: 'string',
      lifeCycleBoundary: 'string',
      functionalUnit: 'string',
      functionalAmount: 'string',
      stageActiveDataList: { 'type': 'array', 'itemType': LcaStageActiveData },
      customContext: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitEcarLcacalcResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 速算记录编号
  recordNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      recordNo: 'record_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      recordNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEcarLcacalcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 速算记录编号列表
  recordNoList?: string[];
  // 开始日期，yyyy-MM-dd
  startDate?: string;
  // 结束日期，yyyy-MM-dd
  endDate?: string;
  // 分页查询页码，从1开始，不传时默认为1
  current?: number;
  // 每页记录条数，取值范围[10, 200]，不传时默认为20
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      recordNoList: 'record_no_list',
      startDate: 'start_date',
      endDate: 'end_date',
      current: 'current',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      recordNoList: { 'type': 'array', 'itemType': 'string' },
      startDate: 'string',
      endDate: 'string',
      current: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEcarLcacalcResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前查询页码
  current?: number;
  // 每页记录条数
  pageSize?: number;
  // 记录总条数
  total?: number;
  // 开始日期
  startDate?: string;
  // 结束日期
  endDate?: string;
  // Lca速算记录列表
  list?: LcaCalcResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      current: 'current',
      pageSize: 'page_size',
      total: 'total',
      startDate: 'start_date',
      endDate: 'end_date',
      list: 'list',
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
      startDate: 'string',
      endDate: 'string',
      list: { 'type': 'array', 'itemType': LcaCalcResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitEcarGreencertificategenerationfileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 发电量文件id
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

export class SubmitEcarGreencertificategenerationfileResponse extends $tea.Model {
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

export class QueryLcaprojectTracetenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLcaprojectTracetenantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 租户id
  tenantId?: string;
  // 企业名称
  enterpriseName?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tenantId: 'tenant_id',
      enterpriseName: 'enterprise_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tenantId: 'string',
      enterpriseName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListLcaprojectTraceprojectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  // 产品规格
  specification: string;
  // 列表数量
  limit?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      specification: 'specification',
      limit: 'limit',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      specification: 'string',
      limit: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListLcaprojectTraceprojectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询LCA项目列表
  list?: LcaProjectTrace[];
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
      list: { 'type': 'array', 'itemType': LcaProjectTrace },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailLcaprojectTraceprojectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  // 项目编码
  projectNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      projectNo: 'project_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      projectNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailLcaprojectTraceprojectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 原材料运输排放量
  transportEmissionAmount?: string;
  // 碳足迹总排放量
  emissionAmount?: string;
  // 废弃物运输排放量
  wasteTransportEmissionAmount?: string;
  // 碳足迹排放单位
  emissionUnit?: string;
  // 废弃物处置排放量
  wasteDisposalEmissionAmount?: string;
  // 原材料制造排放量
  manufactureEmissionAmount?: string;
  // 能耗使用排放量
  energyEmissionAmount?: string;
  // 环境排放排放量
  environmentEmissionAmount?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      transportEmissionAmount: 'transport_emission_amount',
      emissionAmount: 'emission_amount',
      wasteTransportEmissionAmount: 'waste_transport_emission_amount',
      emissionUnit: 'emission_unit',
      wasteDisposalEmissionAmount: 'waste_disposal_emission_amount',
      manufactureEmissionAmount: 'manufacture_emission_amount',
      energyEmissionAmount: 'energy_emission_amount',
      environmentEmissionAmount: 'environment_emission_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      transportEmissionAmount: 'string',
      emissionAmount: 'string',
      wasteTransportEmissionAmount: 'string',
      emissionUnit: 'string',
      wasteDisposalEmissionAmount: 'string',
      manufactureEmissionAmount: 'string',
      energyEmissionAmount: 'string',
      environmentEmissionAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateLcaprojectTracebindingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  // 项目编码
  projectNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      projectNo: 'project_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      projectNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateLcaprojectTracebindingResponse extends $tea.Model {
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

export class AddFinanceEmissionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 银行碳账号
  enterpriseNo: string;
  // 企业统一社会信用代码
  companyId: string;
  // 排放盘查方案
  planCode: string;
  // 排放量
  emissionDosage: string;
  // 年份
  year: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      enterpriseNo: 'enterprise_no',
      companyId: 'company_id',
      planCode: 'plan_code',
      emissionDosage: 'emission_dosage',
      year: 'year',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      enterpriseNo: 'string',
      companyId: 'string',
      planCode: 'string',
      emissionDosage: 'string',
      year: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddFinanceEmissionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 碳排放量
  emissionAmount?: string;
  // 订单号
  orderNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      emissionAmount: 'emission_amount',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      emissionAmount: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddFinanceCompanyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 银行碳账户
  enterpriseNo: string;
  // 企业统一信用代码或者项目编号
  companyId: string;
  // 企业名称或者项目名称
  companyName: string;
  // 行业编码，枚举值
  industryCode: string;
  // 地区编码
  areaCode: string;
  // 提交人
  companySubmitter: string;
  // 企业或项目注册年份
  registerYear: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      enterpriseNo: 'enterprise_no',
      companyId: 'company_id',
      companyName: 'company_name',
      industryCode: 'industry_code',
      areaCode: 'area_code',
      companySubmitter: 'company_submitter',
      registerYear: 'register_year',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      enterpriseNo: 'string',
      companyId: 'string',
      companyName: 'string',
      industryCode: 'string',
      areaCode: 'string',
      companySubmitter: 'string',
      registerYear: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddFinanceCompanyResponse extends $tea.Model {
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

export class UpdateFinanceCompanyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 银行碳账户
  enterpriseNo: string;
  // 企业统一信用代码
  companyId: string;
  // 企业或者项目名称
  companyName: string;
  // 行业编码
  industryCode: string;
  // 地区编码
  areaCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      enterpriseNo: 'enterprise_no',
      companyId: 'company_id',
      companyName: 'company_name',
      industryCode: 'industry_code',
      areaCode: 'area_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      enterpriseNo: 'string',
      companyId: 'string',
      companyName: 'string',
      industryCode: 'string',
      areaCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateFinanceCompanyResponse extends $tea.Model {
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

export class DeleteFinanceCompanyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 银行碳账户
  enterpriseNo: string;
  // 企业统一信用代码或者项目id
  companyId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      enterpriseNo: 'enterprise_no',
      companyId: 'company_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      enterpriseNo: 'string',
      companyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteFinanceCompanyResponse extends $tea.Model {
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

export class ListFinanceReportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 银行碳账户
  enterpriseNo: string;
  // 企业统一信用代码或者项目id
  companyId: string;
  // 报告年，当前年，对比年
  compareYear: string;
  // 基准年，被对比年
  baseYear: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      enterpriseNo: 'enterprise_no',
      companyId: 'company_id',
      compareYear: 'compare_year',
      baseYear: 'base_year',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      enterpriseNo: 'string',
      companyId: 'string',
      compareYear: 'string',
      baseYear: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListFinanceReportResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 报告列表
  list?: FinanceReportDetail[];
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
      list: { 'type': 'array', 'itemType': FinanceReportDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFinanceReportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 银行碳账户
  enterpriseNo: string;
  // 企业社会统一信用编码
  companyId: string;
  // 对比年
  compareYear: string;
  // 基准年份
  baseYear: string;
  // 转型路径分析
  transferPathAnalysisList: TransferPathAnalysis[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      enterpriseNo: 'enterprise_no',
      companyId: 'company_id',
      compareYear: 'compare_year',
      baseYear: 'base_year',
      transferPathAnalysisList: 'transfer_path_analysis_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      enterpriseNo: 'string',
      companyId: 'string',
      compareYear: 'string',
      baseYear: 'string',
      transferPathAnalysisList: { 'type': 'array', 'itemType': TransferPathAnalysis },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFinanceReportResponse extends $tea.Model {
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

export class UpdateFinanceReportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 报告单号
  reportNo: string;
  // 银行碳账号
  enterpriseNo: string;
  // 报告盖章人
  reportSinger: string;
  // 可以直接公网可以下载的oss地址
  reportOssUrl: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      reportNo: 'report_no',
      enterpriseNo: 'enterprise_no',
      reportSinger: 'report_singer',
      reportOssUrl: 'report_oss_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      reportNo: 'string',
      enterpriseNo: 'string',
      reportSinger: 'string',
      reportOssUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateFinanceReportResponse extends $tea.Model {
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
          sdk_version: "2.11.4",
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
   * Description: 查询存证数据详情，包括存证内容、存证数据值、存证状态、存证交易等信息。 若指定版本，返回指定版本；若未指定，返回最新版本。
   * Summary: 查询存证数据详情
   */
  async detailPdcpDeposit(request: DetailPdcpDepositRequest): Promise<DetailPdcpDepositResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailPdcpDepositEx(request, headers, runtime);
  }

  /**
   * Description: 查询存证数据详情，包括存证内容、存证数据值、存证状态、存证交易等信息。 若指定版本，返回指定版本；若未指定，返回最新版本。
   * Summary: 查询存证数据详情
   */
  async detailPdcpDepositEx(request: DetailPdcpDepositRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailPdcpDepositResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailPdcpDepositResponse>(await this.doRequest("1.0", "antchain.carbon.pdcp.deposit.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailPdcpDepositResponse({}));
  }

  /**
   * Description: 查询存证数据历史变更
   * Summary: 存证数据变更历史追溯查询
   */
  async queryPdcpDtrace(request: QueryPdcpDtraceRequest): Promise<QueryPdcpDtraceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPdcpDtraceEx(request, headers, runtime);
  }

  /**
   * Description: 查询存证数据历史变更
   * Summary: 存证数据变更历史追溯查询
   */
  async queryPdcpDtraceEx(request: QueryPdcpDtraceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPdcpDtraceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPdcpDtraceResponse>(await this.doRequest("1.0", "antchain.carbon.pdcp.dtrace.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPdcpDtraceResponse({}));
  }

  /**
   * Description: 通过链山存证内容校验存证数据可信性
   * Summary: 存证数据可信校验
   */
  async checkPdcpDtrace(request: CheckPdcpDtraceRequest): Promise<CheckPdcpDtraceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkPdcpDtraceEx(request, headers, runtime);
  }

  /**
   * Description: 通过链山存证内容校验存证数据可信性
   * Summary: 存证数据可信校验
   */
  async checkPdcpDtraceEx(request: CheckPdcpDtraceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckPdcpDtraceResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckPdcpDtraceResponse>(await this.doRequest("1.0", "antchain.carbon.pdcp.dtrace.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckPdcpDtraceResponse({}));
  }

  /**
   * Description: 根据授权方和被授权方授权关系批量查询授权数据
   * Summary: 批量查询授权数据
   */
  async batchqueryPdcpData(request: BatchqueryPdcpDataRequest): Promise<BatchqueryPdcpDataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryPdcpDataEx(request, headers, runtime);
  }

  /**
   * Description: 根据授权方和被授权方授权关系批量查询授权数据
   * Summary: 批量查询授权数据
   */
  async batchqueryPdcpDataEx(request: BatchqueryPdcpDataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryPdcpDataResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryPdcpDataResponse>(await this.doRequest("1.0", "antchain.carbon.pdcp.data.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryPdcpDataResponse({}));
  }

  /**
   * Description: 查询用户拥有的数据记录
   * Summary: 查询拥有的数据
   */
  async queryPdcpOwndata(request: QueryPdcpOwndataRequest): Promise<QueryPdcpOwndataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPdcpOwndataEx(request, headers, runtime);
  }

  /**
   * Description: 查询用户拥有的数据记录
   * Summary: 查询拥有的数据
   */
  async queryPdcpOwndataEx(request: QueryPdcpOwndataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPdcpOwndataResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPdcpOwndataResponse>(await this.doRequest("1.0", "antchain.carbon.pdcp.owndata.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPdcpOwndataResponse({}));
  }

  /**
   * Description: 分页查询数据资产
   * Summary: 数据资产
   */
  async queryPdcpDataasset(request: QueryPdcpDataassetRequest): Promise<QueryPdcpDataassetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPdcpDataassetEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询数据资产
   * Summary: 数据资产
   */
  async queryPdcpDataassetEx(request: QueryPdcpDataassetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPdcpDataassetResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPdcpDataassetResponse>(await this.doRequest("1.0", "antchain.carbon.pdcp.dataasset.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPdcpDataassetResponse({}));
  }

  /**
   * Description: 注册数据资产
   * Summary: 注册数据资产
   */
  async registerPdcpDataasset(request: RegisterPdcpDataassetRequest): Promise<RegisterPdcpDataassetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.registerPdcpDataassetEx(request, headers, runtime);
  }

  /**
   * Description: 注册数据资产
   * Summary: 注册数据资产
   */
  async registerPdcpDataassetEx(request: RegisterPdcpDataassetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RegisterPdcpDataassetResponse> {
    Util.validateModel(request);
    return $tea.cast<RegisterPdcpDataassetResponse>(await this.doRequest("1.0", "antchain.carbon.pdcp.dataasset.register", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RegisterPdcpDataassetResponse({}));
  }

  /**
   * Description: 添加数据授权策略
   * Summary: 添加数据授权策略
   */
  async addAuthAdmin(request: AddAuthAdminRequest): Promise<AddAuthAdminResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addAuthAdminEx(request, headers, runtime);
  }

  /**
   * Description: 添加数据授权策略
   * Summary: 添加数据授权策略
   */
  async addAuthAdminEx(request: AddAuthAdminRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddAuthAdminResponse> {
    Util.validateModel(request);
    return $tea.cast<AddAuthAdminResponse>(await this.doRequest("1.0", "antchain.carbon.auth.admin.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddAuthAdminResponse({}));
  }

  /**
   * Description: 分页查询数据授权策略
   * Summary: 分页查询数据授权策略
   */
  async pagequeryAuthAdmin(request: PagequeryAuthAdminRequest): Promise<PagequeryAuthAdminResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryAuthAdminEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询数据授权策略
   * Summary: 分页查询数据授权策略
   */
  async pagequeryAuthAdminEx(request: PagequeryAuthAdminRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryAuthAdminResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryAuthAdminResponse>(await this.doRequest("1.0", "antchain.carbon.auth.admin.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryAuthAdminResponse({}));
  }

  /**
   * Description: 查询数据授权策略
   * Summary: 查询数据授权策略
   */
  async queryAuthAdmin(request: QueryAuthAdminRequest): Promise<QueryAuthAdminResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAuthAdminEx(request, headers, runtime);
  }

  /**
   * Description: 查询数据授权策略
   * Summary: 查询数据授权策略
   */
  async queryAuthAdminEx(request: QueryAuthAdminRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAuthAdminResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAuthAdminResponse>(await this.doRequest("1.0", "antchain.carbon.auth.admin.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAuthAdminResponse({}));
  }

  /**
   * Description: 数据资产添加数据类型
   * Summary: 添加数据类型
   */
  async addDataassetType(request: AddDataassetTypeRequest): Promise<AddDataassetTypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addDataassetTypeEx(request, headers, runtime);
  }

  /**
   * Description: 数据资产添加数据类型
   * Summary: 添加数据类型
   */
  async addDataassetTypeEx(request: AddDataassetTypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddDataassetTypeResponse> {
    Util.validateModel(request);
    return $tea.cast<AddDataassetTypeResponse>(await this.doRequest("1.0", "antchain.carbon.dataasset.type.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddDataassetTypeResponse({}));
  }

  /**
   * Description: 分页查询数据资产类型
   * Summary: 分页查询数据资产类型
   */
  async pagequeryDataassetType(request: PagequeryDataassetTypeRequest): Promise<PagequeryDataassetTypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryDataassetTypeEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询数据资产类型
   * Summary: 分页查询数据资产类型
   */
  async pagequeryDataassetTypeEx(request: PagequeryDataassetTypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryDataassetTypeResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryDataassetTypeResponse>(await this.doRequest("1.0", "antchain.carbon.dataasset.type.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryDataassetTypeResponse({}));
  }

  /**
   * Description: 启动数据采集任务，从外部数据读取数据并记录到可信存证
   * Summary: 开始采集外部数据
   */
  async startDatasetCollecting(request: StartDatasetCollectingRequest): Promise<StartDatasetCollectingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startDatasetCollectingEx(request, headers, runtime);
  }

  /**
   * Description: 启动数据采集任务，从外部数据读取数据并记录到可信存证
   * Summary: 开始采集外部数据
   */
  async startDatasetCollectingEx(request: StartDatasetCollectingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartDatasetCollectingResponse> {
    Util.validateModel(request);
    return $tea.cast<StartDatasetCollectingResponse>(await this.doRequest("1.0", "antchain.carbon.dataset.collecting.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartDatasetCollectingResponse({}));
  }

  /**
   * Description: 查询外部数据采集状态
   * Summary: 查询外部数据采集状态
   */
  async queryDatasetCollecting(request: QueryDatasetCollectingRequest): Promise<QueryDatasetCollectingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDatasetCollectingEx(request, headers, runtime);
  }

  /**
   * Description: 查询外部数据采集状态
   * Summary: 查询外部数据采集状态
   */
  async queryDatasetCollectingEx(request: QueryDatasetCollectingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDatasetCollectingResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDatasetCollectingResponse>(await this.doRequest("1.0", "antchain.carbon.dataset.collecting.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDatasetCollectingResponse({}));
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
      request.fileObject = null;
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
   * Description: 机构会员注册接口，支持根据蚂蚁DID或者姓名+密码注意企业的终端会员
   * Summary: 机构会员注册
   */
  async registerEcarEnterprisemember(request: RegisterEcarEnterprisememberRequest): Promise<RegisterEcarEnterprisememberResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.registerEcarEnterprisememberEx(request, headers, runtime);
  }

  /**
   * Description: 机构会员注册接口，支持根据蚂蚁DID或者姓名+密码注意企业的终端会员
   * Summary: 机构会员注册
   */
  async registerEcarEnterprisememberEx(request: RegisterEcarEnterprisememberRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RegisterEcarEnterprisememberResponse> {
    Util.validateModel(request);
    return $tea.cast<RegisterEcarEnterprisememberResponse>(await this.doRequest("1.0", "antchain.carbon.ecar.enterprisemember.register", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RegisterEcarEnterprisememberResponse({}));
  }

  /**
   * Description: 碳补偿数据采集，提供给碳普惠业务相关接口，外围系统提交碳普惠数据
   * Summary: 碳补偿数据采集
   */
  async addEcarOffsetacquisition(request: AddEcarOffsetacquisitionRequest): Promise<AddEcarOffsetacquisitionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addEcarOffsetacquisitionEx(request, headers, runtime);
  }

  /**
   * Description: 碳补偿数据采集，提供给碳普惠业务相关接口，外围系统提交碳普惠数据
   * Summary: 碳补偿数据采集
   */
  async addEcarOffsetacquisitionEx(request: AddEcarOffsetacquisitionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddEcarOffsetacquisitionResponse> {
    Util.validateModel(request);
    return $tea.cast<AddEcarOffsetacquisitionResponse>(await this.doRequest("1.0", "antchain.carbon.ecar.offsetacquisition.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddEcarOffsetacquisitionResponse({}));
  }

  /**
   * Description: 碳普惠减碳量转移，减碳量在业务端兑换成权益的场景时可使用此接口
   * Summary: 碳普惠减碳量转移
   */
  async addEcarOffsettranslate(request: AddEcarOffsettranslateRequest): Promise<AddEcarOffsettranslateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addEcarOffsettranslateEx(request, headers, runtime);
  }

  /**
   * Description: 碳普惠减碳量转移，减碳量在业务端兑换成权益的场景时可使用此接口
   * Summary: 碳普惠减碳量转移
   */
  async addEcarOffsettranslateEx(request: AddEcarOffsettranslateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddEcarOffsettranslateResponse> {
    Util.validateModel(request);
    return $tea.cast<AddEcarOffsettranslateResponse>(await this.doRequest("1.0", "antchain.carbon.ecar.offsettranslate.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddEcarOffsettranslateResponse({}));
  }

  /**
   * Description: 碳普惠数据授权，授权三方平台租户可访问相关平台方会员的碳普惠数据
   * Summary: 碳普惠数据授权
   */
  async authEcarOffsetdatum(request: AuthEcarOffsetdatumRequest): Promise<AuthEcarOffsetdatumResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authEcarOffsetdatumEx(request, headers, runtime);
  }

  /**
   * Description: 碳普惠数据授权，授权三方平台租户可访问相关平台方会员的碳普惠数据
   * Summary: 碳普惠数据授权
   */
  async authEcarOffsetdatumEx(request: AuthEcarOffsetdatumRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthEcarOffsetdatumResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthEcarOffsetdatumResponse>(await this.doRequest("1.0", "antchain.carbon.ecar.offsetdatum.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthEcarOffsetdatumResponse({}));
  }

  /**
   * Description: 碳普惠数据列表查询，根据账户DID和日期查询碳补偿数据
   * Summary: 碳普惠数据列表查询
   */
  async listEcarOffsetdatum(request: ListEcarOffsetdatumRequest): Promise<ListEcarOffsetdatumResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listEcarOffsetdatumEx(request, headers, runtime);
  }

  /**
   * Description: 碳普惠数据列表查询，根据账户DID和日期查询碳补偿数据
   * Summary: 碳普惠数据列表查询
   */
  async listEcarOffsetdatumEx(request: ListEcarOffsetdatumRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListEcarOffsetdatumResponse> {
    Util.validateModel(request);
    return $tea.cast<ListEcarOffsetdatumResponse>(await this.doRequest("1.0", "antchain.carbon.ecar.offsetdatum.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListEcarOffsetdatumResponse({}));
  }

  /**
   * Description: 机构会员列表查询，支持分页查询指定时间范围内的会员列表，返回结果按照会员注册时间降序排列
   * Summary: 机构会员列表查询
   */
  async listEcarEnterprisemember(request: ListEcarEnterprisememberRequest): Promise<ListEcarEnterprisememberResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listEcarEnterprisememberEx(request, headers, runtime);
  }

  /**
   * Description: 机构会员列表查询，支持分页查询指定时间范围内的会员列表，返回结果按照会员注册时间降序排列
   * Summary: 机构会员列表查询
   */
  async listEcarEnterprisememberEx(request: ListEcarEnterprisememberRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListEcarEnterprisememberResponse> {
    Util.validateModel(request);
    return $tea.cast<ListEcarEnterprisememberResponse>(await this.doRequest("1.0", "antchain.carbon.ecar.enterprisemember.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListEcarEnterprisememberResponse({}));
  }

  /**
   * Description: 碳普惠项目数据预览，包括注册会员数和累积碳能量值
   * Summary: 碳普惠项目数据预览
   */
  async previewEcarOffsetdatum(request: PreviewEcarOffsetdatumRequest): Promise<PreviewEcarOffsetdatumResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.previewEcarOffsetdatumEx(request, headers, runtime);
  }

  /**
   * Description: 碳普惠项目数据预览，包括注册会员数和累积碳能量值
   * Summary: 碳普惠项目数据预览
   */
  async previewEcarOffsetdatumEx(request: PreviewEcarOffsetdatumRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PreviewEcarOffsetdatumResponse> {
    Util.validateModel(request);
    return $tea.cast<PreviewEcarOffsetdatumResponse>(await this.doRequest("1.0", "antchain.carbon.ecar.offsetdatum.preview", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PreviewEcarOffsetdatumResponse({}));
  }

  /**
   * Description: 单个机构会员信息查询，根据会员关键信息，如手机号码、身份证号码查询会员资料
   * Summary: 单个机构会员信息查询
   */
  async detailEcarEnterprisemember(request: DetailEcarEnterprisememberRequest): Promise<DetailEcarEnterprisememberResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailEcarEnterprisememberEx(request, headers, runtime);
  }

  /**
   * Description: 单个机构会员信息查询，根据会员关键信息，如手机号码、身份证号码查询会员资料
   * Summary: 单个机构会员信息查询
   */
  async detailEcarEnterprisememberEx(request: DetailEcarEnterprisememberRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailEcarEnterprisememberResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailEcarEnterprisememberResponse>(await this.doRequest("1.0", "antchain.carbon.ecar.enterprisemember.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailEcarEnterprisememberResponse({}));
  }

  /**
   * Description: 碳补偿项目账户查询，根据账户DID和项目编码查询账户信息
   * Summary: 碳补偿项目账户查询
   */
  async queryEcarOffsetaccount(request: QueryEcarOffsetaccountRequest): Promise<QueryEcarOffsetaccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEcarOffsetaccountEx(request, headers, runtime);
  }

  /**
   * Description: 碳补偿项目账户查询，根据账户DID和项目编码查询账户信息
   * Summary: 碳补偿项目账户查询
   */
  async queryEcarOffsetaccountEx(request: QueryEcarOffsetaccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEcarOffsetaccountResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEcarOffsetaccountResponse>(await this.doRequest("1.0", "antchain.carbon.ecar.offsetaccount.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEcarOffsetaccountResponse({}));
  }

  /**
   * Description: 查询碳补偿数据详情
   * Summary: 碳补偿数据详情
   */
  async detailEcarOffsetdatum(request: DetailEcarOffsetdatumRequest): Promise<DetailEcarOffsetdatumResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailEcarOffsetdatumEx(request, headers, runtime);
  }

  /**
   * Description: 查询碳补偿数据详情
   * Summary: 碳补偿数据详情
   */
  async detailEcarOffsetdatumEx(request: DetailEcarOffsetdatumRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailEcarOffsetdatumResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailEcarOffsetdatumResponse>(await this.doRequest("1.0", "antchain.carbon.ecar.offsetdatum.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailEcarOffsetdatumResponse({}));
  }

  /**
   * Description: 查询碳普惠减碳量转移记录详情
   * Summary: 碳普惠减碳量转移记录详情
   */
  async detailEcarOffsettranslate(request: DetailEcarOffsettranslateRequest): Promise<DetailEcarOffsettranslateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailEcarOffsettranslateEx(request, headers, runtime);
  }

  /**
   * Description: 查询碳普惠减碳量转移记录详情
   * Summary: 碳普惠减碳量转移记录详情
   */
  async detailEcarOffsettranslateEx(request: DetailEcarOffsettranslateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailEcarOffsettranslateResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailEcarOffsettranslateResponse>(await this.doRequest("1.0", "antchain.carbon.ecar.offsettranslate.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailEcarOffsettranslateResponse({}));
  }

  /**
   * Description: 平台方LCA评估结果提交接口，支持三方平台提交LCA评估结果数据
   * Summary: 平台方LCA评估结果提交
   */
  async submitEcarLcaassement(request: SubmitEcarLcaassementRequest): Promise<SubmitEcarLcaassementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitEcarLcaassementEx(request, headers, runtime);
  }

  /**
   * Description: 平台方LCA评估结果提交接口，支持三方平台提交LCA评估结果数据
   * Summary: 平台方LCA评估结果提交
   */
  async submitEcarLcaassementEx(request: SubmitEcarLcaassementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitEcarLcaassementResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitEcarLcaassementResponse>(await this.doRequest("1.0", "antchain.carbon.ecar.lcaassement.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitEcarLcaassementResponse({}));
  }

  /**
   * Description: 三方平台文件上传
   * Summary: 三方平台文件上传
   */
  async uploadEcarPlaformfile(request: UploadEcarPlaformfileRequest): Promise<UploadEcarPlaformfileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadEcarPlaformfileEx(request, headers, runtime);
  }

  /**
   * Description: 三方平台文件上传
   * Summary: 三方平台文件上传
   */
  async uploadEcarPlaformfileEx(request: UploadEcarPlaformfileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadEcarPlaformfileResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.carbon.ecar.plaformfile.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadEcarPlaformfileResponse = new UploadEcarPlaformfileResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadEcarPlaformfileResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<UploadEcarPlaformfileResponse>(await this.doRequest("1.0", "antchain.carbon.ecar.plaformfile.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadEcarPlaformfileResponse({}));
  }

  /**
   * Description: 三方平台提交LCA订单，同时包括客户入驻信息
   * Summary: LCA订单提交(含客户入驻信息)
   */
  async submitEcarLcaorderwithcustomer(request: SubmitEcarLcaorderwithcustomerRequest): Promise<SubmitEcarLcaorderwithcustomerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitEcarLcaorderwithcustomerEx(request, headers, runtime);
  }

  /**
   * Description: 三方平台提交LCA订单，同时包括客户入驻信息
   * Summary: LCA订单提交(含客户入驻信息)
   */
  async submitEcarLcaorderwithcustomerEx(request: SubmitEcarLcaorderwithcustomerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitEcarLcaorderwithcustomerResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitEcarLcaorderwithcustomerResponse>(await this.doRequest("1.0", "antchain.carbon.ecar.lcaorderwithcustomer.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitEcarLcaorderwithcustomerResponse({}));
  }

  /**
   * Description: 三方平台信登token获取
   * Summary: 三方平台获取信登token
   */
  async getEcarPlaformauthtoken(request: GetEcarPlaformauthtokenRequest): Promise<GetEcarPlaformauthtokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getEcarPlaformauthtokenEx(request, headers, runtime);
  }

  /**
   * Description: 三方平台信登token获取
   * Summary: 三方平台获取信登token
   */
  async getEcarPlaformauthtokenEx(request: GetEcarPlaformauthtokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetEcarPlaformauthtokenResponse> {
    Util.validateModel(request);
    return $tea.cast<GetEcarPlaformauthtokenResponse>(await this.doRequest("1.0", "antchain.carbon.ecar.plaformauthtoken.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetEcarPlaformauthtokenResponse({}));
  }

  /**
   * Description: LCA订单查询
   * Summary: LCA订单查询
   */
  async queryEcarLcaorder(request: QueryEcarLcaorderRequest): Promise<QueryEcarLcaorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEcarLcaorderEx(request, headers, runtime);
  }

  /**
   * Description: LCA订单查询
   * Summary: LCA订单查询
   */
  async queryEcarLcaorderEx(request: QueryEcarLcaorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEcarLcaorderResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEcarLcaorderResponse>(await this.doRequest("1.0", "antchain.carbon.ecar.lcaorder.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEcarLcaorderResponse({}));
  }

  /**
   * Description: 绿证发电量数据上报接口
   * Summary: 绿证发电量数据上报接口
   */
  async batchcreateEcarGreencertificategeneration(request: BatchcreateEcarGreencertificategenerationRequest): Promise<BatchcreateEcarGreencertificategenerationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateEcarGreencertificategenerationEx(request, headers, runtime);
  }

  /**
   * Description: 绿证发电量数据上报接口
   * Summary: 绿证发电量数据上报接口
   */
  async batchcreateEcarGreencertificategenerationEx(request: BatchcreateEcarGreencertificategenerationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateEcarGreencertificategenerationResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateEcarGreencertificategenerationResponse>(await this.doRequest("1.0", "antchain.carbon.ecar.greencertificategeneration.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateEcarGreencertificategenerationResponse({}));
  }

  /**
   * Description: 产品碳足迹速算请求提交
   * Summary: 产品碳足迹速算请求提交
   */
  async submitEcarLcacalc(request: SubmitEcarLcacalcRequest): Promise<SubmitEcarLcacalcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitEcarLcacalcEx(request, headers, runtime);
  }

  /**
   * Description: 产品碳足迹速算请求提交
   * Summary: 产品碳足迹速算请求提交
   */
  async submitEcarLcacalcEx(request: SubmitEcarLcacalcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitEcarLcacalcResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitEcarLcacalcResponse>(await this.doRequest("1.0", "antchain.carbon.ecar.lcacalc.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitEcarLcacalcResponse({}));
  }

  /**
   * Description: 产品碳足迹速算结果查询
   * Summary: 产品碳足迹速算结果查询
   */
  async queryEcarLcacalc(request: QueryEcarLcacalcRequest): Promise<QueryEcarLcacalcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEcarLcacalcEx(request, headers, runtime);
  }

  /**
   * Description: 产品碳足迹速算结果查询
   * Summary: 产品碳足迹速算结果查询
   */
  async queryEcarLcacalcEx(request: QueryEcarLcacalcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEcarLcacalcResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEcarLcacalcResponse>(await this.doRequest("1.0", "antchain.carbon.ecar.lcacalc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEcarLcacalcResponse({}));
  }

  /**
   * Description: 发电数据文件导入开放接口
   * Summary: 发电数据文件导入开放接口
   */
  async submitEcarGreencertificategenerationfile(request: SubmitEcarGreencertificategenerationfileRequest): Promise<SubmitEcarGreencertificategenerationfileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitEcarGreencertificategenerationfileEx(request, headers, runtime);
  }

  /**
   * Description: 发电数据文件导入开放接口
   * Summary: 发电数据文件导入开放接口
   */
  async submitEcarGreencertificategenerationfileEx(request: SubmitEcarGreencertificategenerationfileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitEcarGreencertificategenerationfileResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.carbon.ecar.greencertificategenerationfile.submit",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let submitEcarGreencertificategenerationfileResponse = new SubmitEcarGreencertificategenerationfileResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return submitEcarGreencertificategenerationfileResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<SubmitEcarGreencertificategenerationfileResponse>(await this.doRequest("1.0", "antchain.carbon.ecar.greencertificategenerationfile.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitEcarGreencertificategenerationfileResponse({}));
  }

  /**
   * Description: 溯源检查租户
   * Summary: 溯源检查租户
   */
  async queryLcaprojectTracetenant(request: QueryLcaprojectTracetenantRequest): Promise<QueryLcaprojectTracetenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLcaprojectTracetenantEx(request, headers, runtime);
  }

  /**
   * Description: 溯源检查租户
   * Summary: 溯源检查租户
   */
  async queryLcaprojectTracetenantEx(request: QueryLcaprojectTracetenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLcaprojectTracetenantResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLcaprojectTracetenantResponse>(await this.doRequest("1.0", "antchain.carbon.lcaproject.tracetenant.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLcaprojectTracetenantResponse({}));
  }

  /**
   * Description: 溯源查询LCA项目列表
   * Summary: 查询LCA项目列表
   */
  async listLcaprojectTraceproject(request: ListLcaprojectTraceprojectRequest): Promise<ListLcaprojectTraceprojectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listLcaprojectTraceprojectEx(request, headers, runtime);
  }

  /**
   * Description: 溯源查询LCA项目列表
   * Summary: 查询LCA项目列表
   */
  async listLcaprojectTraceprojectEx(request: ListLcaprojectTraceprojectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListLcaprojectTraceprojectResponse> {
    Util.validateModel(request);
    return $tea.cast<ListLcaprojectTraceprojectResponse>(await this.doRequest("1.0", "antchain.carbon.lcaproject.traceproject.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListLcaprojectTraceprojectResponse({}));
  }

  /**
   * Description: 根据请求参数获取LCA项目跟踪信息
   * Summary: 根据请求参数获取LCA项目信息
   */
  async detailLcaprojectTraceproject(request: DetailLcaprojectTraceprojectRequest): Promise<DetailLcaprojectTraceprojectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailLcaprojectTraceprojectEx(request, headers, runtime);
  }

  /**
   * Description: 根据请求参数获取LCA项目跟踪信息
   * Summary: 根据请求参数获取LCA项目信息
   */
  async detailLcaprojectTraceprojectEx(request: DetailLcaprojectTraceprojectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailLcaprojectTraceprojectResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailLcaprojectTraceprojectResponse>(await this.doRequest("1.0", "antchain.carbon.lcaproject.traceproject.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailLcaprojectTraceprojectResponse({}));
  }

  /**
   * Description: 绑定LCA项目
   * Summary: 绑定LCA项目
   */
  async operateLcaprojectTracebinding(request: OperateLcaprojectTracebindingRequest): Promise<OperateLcaprojectTracebindingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateLcaprojectTracebindingEx(request, headers, runtime);
  }

  /**
   * Description: 绑定LCA项目
   * Summary: 绑定LCA项目
   */
  async operateLcaprojectTracebindingEx(request: OperateLcaprojectTracebindingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateLcaprojectTracebindingResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateLcaprojectTracebindingResponse>(await this.doRequest("1.0", "antchain.carbon.lcaproject.tracebinding.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateLcaprojectTracebindingResponse({}));
  }

  /**
   * Description: 转型金融排放新增
   * Summary: 转型金融排放新增
   */
  async addFinanceEmission(request: AddFinanceEmissionRequest): Promise<AddFinanceEmissionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addFinanceEmissionEx(request, headers, runtime);
  }

  /**
   * Description: 转型金融排放新增
   * Summary: 转型金融排放新增
   */
  async addFinanceEmissionEx(request: AddFinanceEmissionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddFinanceEmissionResponse> {
    Util.validateModel(request);
    return $tea.cast<AddFinanceEmissionResponse>(await this.doRequest("1.0", "antchain.carbon.finance.emission.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddFinanceEmissionResponse({}));
  }

  /**
   * Description: 新增企业或者项目
   * Summary: 新增企业或者项目
   */
  async addFinanceCompany(request: AddFinanceCompanyRequest): Promise<AddFinanceCompanyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addFinanceCompanyEx(request, headers, runtime);
  }

  /**
   * Description: 新增企业或者项目
   * Summary: 新增企业或者项目
   */
  async addFinanceCompanyEx(request: AddFinanceCompanyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddFinanceCompanyResponse> {
    Util.validateModel(request);
    return $tea.cast<AddFinanceCompanyResponse>(await this.doRequest("1.0", "antchain.carbon.finance.company.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddFinanceCompanyResponse({}));
  }

  /**
   * Description: 企业或者项目更新
   * Summary: 企业更新
   */
  async updateFinanceCompany(request: UpdateFinanceCompanyRequest): Promise<UpdateFinanceCompanyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateFinanceCompanyEx(request, headers, runtime);
  }

  /**
   * Description: 企业或者项目更新
   * Summary: 企业更新
   */
  async updateFinanceCompanyEx(request: UpdateFinanceCompanyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateFinanceCompanyResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateFinanceCompanyResponse>(await this.doRequest("1.0", "antchain.carbon.finance.company.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateFinanceCompanyResponse({}));
  }

  /**
   * Description: 删除企业或者项目
   * Summary: 删除企业
   */
  async deleteFinanceCompany(request: DeleteFinanceCompanyRequest): Promise<DeleteFinanceCompanyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteFinanceCompanyEx(request, headers, runtime);
  }

  /**
   * Description: 删除企业或者项目
   * Summary: 删除企业
   */
  async deleteFinanceCompanyEx(request: DeleteFinanceCompanyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteFinanceCompanyResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteFinanceCompanyResponse>(await this.doRequest("1.0", "antchain.carbon.finance.company.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteFinanceCompanyResponse({}));
  }

  /**
   * Description: 排放报告获取
   * Summary: 排放报告获取
   */
  async listFinanceReport(request: ListFinanceReportRequest): Promise<ListFinanceReportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listFinanceReportEx(request, headers, runtime);
  }

  /**
   * Description: 排放报告获取
   * Summary: 排放报告获取
   */
  async listFinanceReportEx(request: ListFinanceReportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListFinanceReportResponse> {
    Util.validateModel(request);
    return $tea.cast<ListFinanceReportResponse>(await this.doRequest("1.0", "antchain.carbon.finance.report.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListFinanceReportResponse({}));
  }

  /**
   * Description: 转型金融报告生成
   * Summary: 转型金融报告生成
   */
  async createFinanceReport(request: CreateFinanceReportRequest): Promise<CreateFinanceReportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createFinanceReportEx(request, headers, runtime);
  }

  /**
   * Description: 转型金融报告生成
   * Summary: 转型金融报告生成
   */
  async createFinanceReportEx(request: CreateFinanceReportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateFinanceReportResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateFinanceReportResponse>(await this.doRequest("1.0", "antchain.carbon.finance.report.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateFinanceReportResponse({}));
  }

  /**
   * Description: 转型报告更新
   * Summary: 转型报告更新
   */
  async updateFinanceReport(request: UpdateFinanceReportRequest): Promise<UpdateFinanceReportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateFinanceReportEx(request, headers, runtime);
  }

  /**
   * Description: 转型报告更新
   * Summary: 转型报告更新
   */
  async updateFinanceReportEx(request: UpdateFinanceReportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateFinanceReportResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateFinanceReportResponse>(await this.doRequest("1.0", "antchain.carbon.finance.report.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateFinanceReportResponse({}));
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
