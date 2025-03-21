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

// 特征集信息
export class FeatureSetInfo extends $tea.Model {
  // 特征集编码
  featuresetCode: string;
  // 名称
  featuresetName: string;
  // 数量
  nums: string;
  // 描述
  desc: string;
  static names(): { [key: string]: string } {
    return {
      featuresetCode: 'featureset_code',
      featuresetName: 'featureset_name',
      nums: 'nums',
      desc: 'desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      featuresetCode: 'string',
      featuresetName: 'string',
      nums: 'string',
      desc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 指标数据
export class IndexData extends $tea.Model {
  // 月份
  // 
  month: string;
  // 高低线
  cityTier: string;
  // 省份编码
  provinceCode: string;
  // 总交易笔数指数
  totalCnt: string;
  // 总交易金额指数
  totalAmt: string;
  // 总店铺数指数
  totalShop: string;
  // 去重用户数指数
  totalCsm: string;
  // 其中老店店铺总交易笔数指数
  existingCnt: string;
  // 其中老店店铺总交易金额
  existingAmt: string;
  // 其中老店店铺数量指数
  existingShop: string;
  // 当月新增店铺数指数
  newShop: string;
  // 分金额段指数
  amtRange: string;
  // 店铺标签指数
  shopTag: string;
  static names(): { [key: string]: string } {
    return {
      month: 'month',
      cityTier: 'city_tier',
      provinceCode: 'province_code',
      totalCnt: 'total_cnt',
      totalAmt: 'total_amt',
      totalShop: 'total_shop',
      totalCsm: 'total_csm',
      existingCnt: 'existing_cnt',
      existingAmt: 'existing_amt',
      existingShop: 'existing_shop',
      newShop: 'new_shop',
      amtRange: 'amt_range',
      shopTag: 'shop_tag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      month: 'string',
      cityTier: 'string',
      provinceCode: 'string',
      totalCnt: 'string',
      totalAmt: 'string',
      totalShop: 'string',
      totalCsm: 'string',
      existingCnt: 'string',
      existingAmt: 'string',
      existingShop: 'string',
      newShop: 'string',
      amtRange: 'string',
      shopTag: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 调用统计
export class GwCallDataStats extends $tea.Model {
  // 租户
  invokeTenant?: string;
  // 租户ID
  invokeTenantId?: string;
  // 公key
  accessKey?: string;
  // 调用数量
  invokeCount?: string;
  // 调用查得统计
  successCount?: string;
  // id
  id: string;
  static names(): { [key: string]: string } {
    return {
      invokeTenant: 'invoke_tenant',
      invokeTenantId: 'invoke_tenant_id',
      accessKey: 'access_key',
      invokeCount: 'invoke_count',
      successCount: 'success_count',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      invokeTenant: 'string',
      invokeTenantId: 'string',
      accessKey: 'string',
      invokeCount: 'string',
      successCount: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分页信息
export class PageInfo extends $tea.Model {
  // 总数量
  total?: number;
  // 当前页
  pageIndex: number;
  // 页容量
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      total: 'total',
      pageIndex: 'page_index',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      total: 'number',
      pageIndex: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIndexresearchBrandRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 品牌编码
  brandCode: string;
  // 时间月份yyyyMM
  month: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      brandCode: 'brand_code',
      month: 'month',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      brandCode: 'string',
      month: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIndexresearchBrandResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 指标数据
  indexData?: IndexData[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      indexData: 'index_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      indexData: { 'type': 'array', 'itemType': IndexData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLocationInternalRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // md5加密的身份证号
  idNumber?: string;
  // md5加密的手机号
  phoneNo?: string;
  // 定位时间范围开始时间
  startTime: string;
  // 定位时间范围结束时间
  endTime: string;
  // 核查中心位置（经度,纬度）
  centerPosition?: string;
  // 核查省市区县范围
  distinctCounty?: string;
  // 协查类型：
  // 0: 为经纬度精准定位协查 (默认)
  // 1:  为区县定位 (省-市-区/县) 协查
  invType?: number;
  // 服务级别与结果值定义
  apiServiceLevel: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      idNumber: 'id_number',
      phoneNo: 'phone_no',
      startTime: 'start_time',
      endTime: 'end_time',
      centerPosition: 'center_position',
      distinctCounty: 'distinct_county',
      invType: 'inv_type',
      apiServiceLevel: 'api_service_level',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      idNumber: 'string',
      phoneNo: 'string',
      startTime: 'string',
      endTime: 'string',
      centerPosition: 'string',
      distinctCounty: 'string',
      invType: 'number',
      apiServiceLevel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLocationInternalResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 置信度取值：A/B/C
  confidenceValue?: string;
  // 扩展字段，其他信息
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      confidenceValue: 'confidence_value',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      confidenceValue: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLocationTradeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // md5加密的身份证号
  idNumber?: string;
  // md5加密的手机号
  phoneNo?: string;
  // 调用者用户ID（或外部系统业务ID）
  callerId: string;
  // 定位时间范围开始时间
  startTime: string;
  // 定位时间范围结束时间
  endTime: string;
  // 核查中心位置（经度,纬度）
  centerPosition?: string;
  // 核查省市区县范围
  distinctCounty?: string;
  // 协查类型：
  // 0: 为经纬度精准定位协查 (默认)
  // 1:  为区县定位 (省-市-区/县) 协查
  invType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      idNumber: 'id_number',
      phoneNo: 'phone_no',
      callerId: 'caller_id',
      startTime: 'start_time',
      endTime: 'end_time',
      centerPosition: 'center_position',
      distinctCounty: 'distinct_county',
      invType: 'inv_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      idNumber: 'string',
      phoneNo: 'string',
      callerId: 'string',
      startTime: 'string',
      endTime: 'string',
      centerPosition: 'string',
      distinctCounty: 'string',
      invType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLocationTradeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 置信度取值：A/B/C
  confidenceValue?: string;
  // 扩展字段，其他信息
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      confidenceValue: 'confidence_value',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      confidenceValue: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushModelSamplefileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // 开始日期：示例 YYYYMMDD
  beginDate: string;
  // 样本内采样日期截止日：YYYYMMDD
  endDate: string;
  // 样本数据量
  orgNums: number;
  // 样本批次号，唯一，建议：租户code+时间戳
  sampleCode: string;
  // 文件路径，bucket 下路径
  filePath: string;
  // 文件名,以.csv结尾，分隔符为  ","号
  fileName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      beginDate: 'begin_date',
      endDate: 'end_date',
      orgNums: 'org_nums',
      sampleCode: 'sample_code',
      filePath: 'file_path',
      fileName: 'file_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      beginDate: 'string',
      endDate: 'string',
      orgNums: 'number',
      sampleCode: 'string',
      filePath: 'string',
      fileName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushModelSamplefileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 轮训编码
  loopCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      loopCode: 'loop_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      loopCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecModelSampletaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // 样本批次号，唯一，建议：租户code+时间戳
  sampleCode: string;
  // 特征集编码或模型编码，依据类型使用
  taskCode: string;
  // 任务类型：特征集 FEATURESET、模型分 MODEL
  taskType: string;
  // 本次事件序号编码
  sampleTaskCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      sampleCode: 'sample_code',
      taskCode: 'task_code',
      taskType: 'task_type',
      sampleTaskCode: 'sample_task_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      sampleCode: 'string',
      taskCode: 'string',
      taskType: 'string',
      sampleTaskCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecModelSampletaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 轮训编码
  loopCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      loopCode: 'loop_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      loopCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelSampletaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // 事件查询序号编码，在有loop_code接口返回值的异步接口的值
  // 如：antchain.zkcollabinv.model.samplefile.push、antchain.zkcollabinv.model.sampletask.exec
  loopCode: string;
  // 阶段：poc_050 样本提交阶段，poc_500 任务跑批阶段
  phase: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      loopCode: 'loop_code',
      phase: 'phase',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      loopCode: 'string',
      phase: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelSampletaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务进度
  progress?: string;
  // 有输出的时候会有值
  files?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      progress: 'progress',
      files: 'files',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      progress: 'string',
      files: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelFeaturesetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // 分页信息
  pageInfo: PageInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      pageInfo: PageInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelFeaturesetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 特征列表
  featuresets?: FeatureSetInfo[];
  // 分页信息
  pageInfo?: PageInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      featuresets: 'featuresets',
      pageInfo: 'page_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      featuresets: { 'type': 'array', 'itemType': FeatureSetInfo },
      pageInfo: PageInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitModelInstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // 模型文件路径
  modelFilePath: string;
  // 特征集路径
  featuresFilePath: string;
  // 示例文件路径
  demoFilePath?: string;
  // 模型编码，同一租户下唯一，后续回溯生产调用标记
  modelCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      modelFilePath: 'model_file_path',
      featuresFilePath: 'features_file_path',
      demoFilePath: 'demo_file_path',
      modelCode: 'model_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      modelFilePath: 'string',
      featuresFilePath: 'string',
      demoFilePath: 'string',
      modelCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitModelInstanceResponse extends $tea.Model {
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

export class QueryModelStatsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // yyyyMMdd
  invokeDay: string;
  // 类型：TENANT  租户；AK key维度
  type: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      invokeDay: 'invoke_day',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      invokeDay: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelStatsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据
  datas?: GwCallDataStats[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      datas: 'datas',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      datas: { 'type': 'array', 'itemType': GwCallDataStats },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelCommonscoreRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户授权编码
  authNo: string;
  // 模型编码
  modelCode: string;
  // 用户id（客户身份证号/手机号的md5/sha256散列值）
  userId: string;
  // 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
  userIdType: string;
  // user_id 散列类型: "MD5"：MD5（小写）, "SHA256" ： SHA256（小写）， "SM3"： SM3（小写）
  hashType: string;
  // 客户编码
  customerCode: string;
  // 流水号，串联链路用，非必填
  transNo?: string;
  // hash_type类型的散列后的操作，默认为空不加密。 如启用，需要对散列后的user_id 加密，可选用如下算法，类型1、AES/ECB/PKCS5PADDING 在加密后的二进制需要以字符集UTF-8，编码base64 方式赋值给user_id传输。 示例：AES秘钥：base64_aes_key = "CZqWzQ5JL8s5Zx2XVpGZGw=="，报文：plaintext = "Hello, 蚂蚁。" ，使用算法： AES/ECB/PKCS5PADDING ；密文：SI1wU1ePSFoMy5YzuxclFkbZ/FIXUHPRDbKBW85WolY=，配置了此项user_id应该传输此密文。
  userIdEncryptType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authNo: 'auth_no',
      modelCode: 'model_code',
      userId: 'user_id',
      userIdType: 'user_id_type',
      hashType: 'hash_type',
      customerCode: 'customer_code',
      transNo: 'trans_no',
      userIdEncryptType: 'user_id_encrypt_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authNo: 'string',
      modelCode: 'string',
      userId: 'string',
      userIdType: 'string',
      hashType: 'string',
      customerCode: 'string',
      transNo: 'string',
      userIdEncryptType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelCommonscoreResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 模型分
  score?: string;
  // 流水号
  transNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      score: 'score',
      transNo: 'trans_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      score: 'string',
      transNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryModelCommonscoreRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户ID
  userIds: string[];
  // 用户授权编码
  authNos?: string[];
  // 模型编码
  modelCode: string;
  // 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
  userIdType: string;
  // user_id 散列类型: "MD5"：MD5（小写）, "SHA256" ： SHA256（小写）， "SM3"： SM3（小写）
  hashType: string;
  // 客户编码
  customerCode: string;
  // 流水号，串联链路用，非必填
  transNo?: string;
  // hash_type类型的散列后的操作，默认为空不加密。 如启用，需要对散列后的user_id 加密，可选用如下算法，类型1、AES/ECB/PKCS5PADDING 在加密后的二进制需要以字符集UTF-8，编码base64 方式赋值给user_id传输。 示例：AES秘钥：base64_aes_key = "CZqWzQ5JL8s5Zx2XVpGZGw=="，报文：plaintext = "Hello, 蚂蚁。" ，使用算法： AES/ECB/PKCS5PADDING ；密文：SI1wU1ePSFoMy5YzuxclFkbZ/FIXUHPRDbKBW85WolY=，配置了此项user_id应该传输此密文。
  userIdEncryptType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userIds: 'user_ids',
      authNos: 'auth_nos',
      modelCode: 'model_code',
      userIdType: 'user_id_type',
      hashType: 'hash_type',
      customerCode: 'customer_code',
      transNo: 'trans_no',
      userIdEncryptType: 'user_id_encrypt_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userIds: { 'type': 'array', 'itemType': 'string' },
      authNos: { 'type': 'array', 'itemType': 'string' },
      modelCode: 'string',
      userIdType: 'string',
      hashType: 'string',
      customerCode: 'string',
      transNo: 'string',
      userIdEncryptType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryModelCommonscoreResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分数
  scores?: string[];
  // 意向
  ratings?: string[];
  // 流水号
  transNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      scores: 'scores',
      ratings: 'ratings',
      transNo: 'trans_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      scores: { 'type': 'array', 'itemType': 'string' },
      ratings: { 'type': 'array', 'itemType': 'string' },
      transNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelMultiscoreRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户授权编码（授权渠道）
  // 
  authNo: string;
  // 规格编码(相应对接人负责)
  specCode: string;
  // 用户id（客户身份证号/手机号的md5/sha256散列值）
  userId: string;
  // 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
  userIdType: string;
  // user_id 散列类型: "MD5"：MD5（小写）, "SHA256" ： SHA256（小写）， "SM3"： SM3（小写）
  hashType: string;
  // 客户编码
  // 
  customerCode: string;
  // 流水号，串联链路用，非必填
  transNo?: string;
  // hash_type类型的散列后的操作，默认为空不加密。 如启用，需要对散列后的user_id 加密，可选用如下算法，类型1、AES/ECB/PKCS5PADDING 在加密后的二进制需要以字符集UTF-8，编码base64 方式赋值给user_id传输。 示例：AES秘钥：base64_aes_key = "CZqWzQ5JL8s5Zx2XVpGZGw=="，报文：plaintext = "Hello, 蚂蚁。" ，使用算法： AES/ECB/PKCS5PADDING ；密文：SI1wU1ePSFoMy5YzuxclFkbZ/FIXUHPRDbKBW85WolY=，配置了此项user_id应该传输此密文。
  userIdEncryptType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authNo: 'auth_no',
      specCode: 'spec_code',
      userId: 'user_id',
      userIdType: 'user_id_type',
      hashType: 'hash_type',
      customerCode: 'customer_code',
      transNo: 'trans_no',
      userIdEncryptType: 'user_id_encrypt_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authNo: 'string',
      specCode: 'string',
      userId: 'string',
      userIdType: 'string',
      hashType: 'string',
      customerCode: 'string',
      transNo: 'string',
      userIdEncryptType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelMultiscoreResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 模型分
  score?: string;
  // 流水号
  transNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      score: 'score',
      transNo: 'trans_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      score: 'string',
      transNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelFusionmodelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 融合模型编码
  fusionModelCode: string;
  // 模型调用的id，一般是用户id 可能是用户手机号或者身份照号码的md5
  identity: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fusionModelCode: 'fusion_model_code',
      identity: 'identity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fusionModelCode: 'string',
      identity: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelFusionmodelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 融合模型调用结果
  result?: string;
  // 流水号
  transNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
      transNo: 'trans_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: 'string',
      transNo: 'string',
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
          sdk_version: "1.0.14",
          _prod_code: "COLLABINV",
          _prod_channel: "default",
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
   * Description: 投行研究，品牌调用
   * Summary: 投行研究，品牌调用
   */
  async queryIndexresearchBrand(request: QueryIndexresearchBrandRequest): Promise<QueryIndexresearchBrandResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIndexresearchBrandEx(request, headers, runtime);
  }

  /**
   * Description: 投行研究，品牌调用
   * Summary: 投行研究，品牌调用
   */
  async queryIndexresearchBrandEx(request: QueryIndexresearchBrandRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIndexresearchBrandResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIndexresearchBrandResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.indexresearch.brand.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIndexresearchBrandResponse({}));
  }

  /**
   * Description: 基于交易数据的定位信息协查
   * Summary: 定位协查
   */
  async queryLocationInternal(request: QueryLocationInternalRequest): Promise<QueryLocationInternalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLocationInternalEx(request, headers, runtime);
  }

  /**
   * Description: 基于交易数据的定位信息协查
   * Summary: 定位协查
   */
  async queryLocationInternalEx(request: QueryLocationInternalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLocationInternalResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLocationInternalResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.location.internal.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLocationInternalResponse({}));
  }

  /**
   * Description: 基于交易数据的定位信息协查对外接口
   * Summary: 定位协查对外接口
   */
  async queryLocationTrade(request: QueryLocationTradeRequest): Promise<QueryLocationTradeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLocationTradeEx(request, headers, runtime);
  }

  /**
   * Description: 基于交易数据的定位信息协查对外接口
   * Summary: 定位协查对外接口
   */
  async queryLocationTradeEx(request: QueryLocationTradeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLocationTradeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLocationTradeResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.location.trade.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLocationTradeResponse({}));
  }

  /**
   * Description: 样本文件摘要
   * Summary: 样本文件摘要
   */
  async pushModelSamplefile(request: PushModelSamplefileRequest): Promise<PushModelSamplefileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushModelSamplefileEx(request, headers, runtime);
  }

  /**
   * Description: 样本文件摘要
   * Summary: 样本文件摘要
   */
  async pushModelSamplefileEx(request: PushModelSamplefileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushModelSamplefileResponse> {
    Util.validateModel(request);
    return $tea.cast<PushModelSamplefileResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.model.samplefile.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushModelSamplefileResponse({}));
  }

  /**
   * Description: 样本任务执行
   * Summary: 样本任务执行
   */
  async execModelSampletask(request: ExecModelSampletaskRequest): Promise<ExecModelSampletaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execModelSampletaskEx(request, headers, runtime);
  }

  /**
   * Description: 样本任务执行
   * Summary: 样本任务执行
   */
  async execModelSampletaskEx(request: ExecModelSampletaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecModelSampletaskResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecModelSampletaskResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.model.sampletask.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecModelSampletaskResponse({}));
  }

  /**
   * Description: 任务状态查询
   * Summary: 任务状态查询
   */
  async queryModelSampletask(request: QueryModelSampletaskRequest): Promise<QueryModelSampletaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryModelSampletaskEx(request, headers, runtime);
  }

  /**
   * Description: 任务状态查询
   * Summary: 任务状态查询
   */
  async queryModelSampletaskEx(request: QueryModelSampletaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryModelSampletaskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryModelSampletaskResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.model.sampletask.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryModelSampletaskResponse({}));
  }

  /**
   * Description: 特征集查询
   * Summary: 特征集查询
   */
  async queryModelFeatureset(request: QueryModelFeaturesetRequest): Promise<QueryModelFeaturesetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryModelFeaturesetEx(request, headers, runtime);
  }

  /**
   * Description: 特征集查询
   * Summary: 特征集查询
   */
  async queryModelFeaturesetEx(request: QueryModelFeaturesetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryModelFeaturesetResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryModelFeaturesetResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.model.featureset.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryModelFeaturesetResponse({}));
  }

  /**
   * Description: 模型保存
   * Summary: 模型保存
   */
  async submitModelInstance(request: SubmitModelInstanceRequest): Promise<SubmitModelInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitModelInstanceEx(request, headers, runtime);
  }

  /**
   * Description: 模型保存
   * Summary: 模型保存
   */
  async submitModelInstanceEx(request: SubmitModelInstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitModelInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitModelInstanceResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.model.instance.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitModelInstanceResponse({}));
  }

  /**
   * Description: 模型调用统计查询
   * Summary: 模型调用统计查询
   */
  async queryModelStats(request: QueryModelStatsRequest): Promise<QueryModelStatsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryModelStatsEx(request, headers, runtime);
  }

  /**
   * Description: 模型调用统计查询
   * Summary: 模型调用统计查询
   */
  async queryModelStatsEx(request: QueryModelStatsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryModelStatsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryModelStatsResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.model.stats.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryModelStatsResponse({}));
  }

  /**
   * Description: 通用查询
   * Summary: 通用查询
   */
  async queryModelCommonscore(request: QueryModelCommonscoreRequest): Promise<QueryModelCommonscoreResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryModelCommonscoreEx(request, headers, runtime);
  }

  /**
   * Description: 通用查询
   * Summary: 通用查询
   */
  async queryModelCommonscoreEx(request: QueryModelCommonscoreRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryModelCommonscoreResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryModelCommonscoreResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.model.commonscore.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryModelCommonscoreResponse({}));
  }

  /**
   * Description: 通用查询批次，仅针对外部使用PIR场景
   * Summary: 通用查询批次
   */
  async batchqueryModelCommonscore(request: BatchqueryModelCommonscoreRequest): Promise<BatchqueryModelCommonscoreResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryModelCommonscoreEx(request, headers, runtime);
  }

  /**
   * Description: 通用查询批次，仅针对外部使用PIR场景
   * Summary: 通用查询批次
   */
  async batchqueryModelCommonscoreEx(request: BatchqueryModelCommonscoreRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryModelCommonscoreResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryModelCommonscoreResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.model.commonscore.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryModelCommonscoreResponse({}));
  }

  /**
   * Description: 多模型预测值
   * Summary: 多模型预测值
   */
  async queryModelMultiscore(request: QueryModelMultiscoreRequest): Promise<QueryModelMultiscoreResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryModelMultiscoreEx(request, headers, runtime);
  }

  /**
   * Description: 多模型预测值
   * Summary: 多模型预测值
   */
  async queryModelMultiscoreEx(request: QueryModelMultiscoreRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryModelMultiscoreResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryModelMultiscoreResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.model.multiscore.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryModelMultiscoreResponse({}));
  }

  /**
   * Description: 融合模型的调用
   * Summary: 融合模型调用
   */
  async queryModelFusionmodel(request: QueryModelFusionmodelRequest): Promise<QueryModelFusionmodelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryModelFusionmodelEx(request, headers, runtime);
  }

  /**
   * Description: 融合模型的调用
   * Summary: 融合模型调用
   */
  async queryModelFusionmodelEx(request: QueryModelFusionmodelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryModelFusionmodelResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryModelFusionmodelResponse>(await this.doRequest("1.0", "antchain.zkcollabinv.model.fusionmodel.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryModelFusionmodelResponse({}));
  }

}
