// This file is auto-generated, don't edit it
import AntchainUtil from '@antchain/alipay-util';
import Util, * as $Util from '@alicloud/tea-util';
import RPCUtil from '@alicloud/rpc-util';
import { Readable } from 'stream';
import * as $tea from '@alicloud/tea-typescript';

/**
 * @remarks
 * Model for initing client
 */
export class Config extends $tea.Model {
  /**
   * @remarks
   * accesskey id
   */
  accessKeyId?: string;
  /**
   * @remarks
   * accesskey secret
   */
  accessKeySecret?: string;
  /**
   * @remarks
   * security token
   */
  securityToken?: string;
  /**
   * @remarks
   * http protocol
   * 
   * @example
   * http
   */
  protocol?: string;
  /**
   * @remarks
   * read timeout
   * 
   * @example
   * 10
   */
  readTimeout?: number;
  /**
   * @remarks
   * connect timeout
   * 
   * @example
   * 10
   */
  connectTimeout?: number;
  /**
   * @remarks
   * http proxy
   * 
   * @example
   * http://localhost
   */
  httpProxy?: string;
  /**
   * @remarks
   * https proxy
   * 
   * @example
   * https://localhost
   */
  httpsProxy?: string;
  /**
   * @remarks
   * endpoint
   * 
   * @example
   * cs.aliyuncs.com
   */
  endpoint?: string;
  /**
   * @remarks
   * proxy white list
   * 
   * @example
   * http://localhost
   */
  noProxy?: string;
  /**
   * @remarks
   * max idle conns
   * 
   * @example
   * 3
   */
  maxIdleConns?: number;
  /**
   * @remarks
   * user agent
   * 
   * @example
   * Alibabacloud/1
   */
  userAgent?: string;
  /**
   * @remarks
   * socks5 proxy
   */
  socks5Proxy?: string;
  /**
   * @remarks
   * socks5 network
   * 
   * @example
   * TCP
   */
  socks5NetWork?: string;
  /**
   * @remarks
   * 长链接最大空闲时长
   */
  maxIdleTimeMillis?: number;
  /**
   * @remarks
   * 长链接最大连接时长
   */
  keepAliveDurationMillis?: number;
  /**
   * @remarks
   * 最大连接数（长链接最大总数）
   */
  maxRequests?: number;
  /**
   * @remarks
   * 每个目标主机的最大连接数（分主机域名的长链接最大总数
   */
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

// 产品对应模版字段
export class TemplateContext extends $tea.Model {
  // 模版header头
  /**
   * @example
   * bizCode
   */
  headName: string;
  // 字段描述
  /**
   * @example
   * 加密身份id
   */
  remark?: string;
  // 是否为必填:REQUIRED,ONE_OF
  /**
   * @example
   * ONE_OF
   */
  requireType: string;
  static names(): { [key: string]: string } {
    return {
      headName: 'head_name',
      remark: 'remark',
      requireType: 'require_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      headName: 'string',
      remark: 'string',
      requireType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 最好结果
export class BestModelReport extends $tea.Model {
  // ks信息
  /**
   * @example
   * 0.52
   */
  ks?: string;
  // auc指标
  /**
   * @example
   * 0.8
   */
  auc?: string;
  // lift指标
  /**
   * @example
   * 3.2
   */
  lift?: string;
  static names(): { [key: string]: string } {
    return {
      ks: 'ks',
      auc: 'auc',
      lift: 'lift',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ks: 'string',
      auc: 'string',
      lift: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// IV信息列表
export class IvInfo extends $tea.Model {
  // 轮次
  /**
   * @example
   * 基线
   */
  round?: string;
  // oss下载链接
  /**
   * @example
   * https://antchain-joint-modeling-poc-sh.oss-cn-shanghai.aliyuncs.com/poc
   */
  featureReport?: string;
  static names(): { [key: string]: string } {
    return {
      round: 'round',
      featureReport: 'feature_report',
    };
  }

  static types(): { [key: string]: any } {
    return {
      round: 'string',
      featureReport: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 产品信息
export class ProductContext extends $tea.Model {
  // 产品code
  /**
   * @example
   * aft_v4
   */
  productCode: string;
  // 模版code
  /**
   * @example
   * tb-default
   */
  templateCode: string;
  // 模版内容,数组
  templateContext: TemplateContext[];
  // 产品模型结果字段
  /**
   * @example
   * ["aft_v3_score","aft_v4_score"]
   */
  scoreFields: string[];
  static names(): { [key: string]: string } {
    return {
      productCode: 'product_code',
      templateCode: 'template_code',
      templateContext: 'template_context',
      scoreFields: 'score_fields',
    };
  }

  static types(): { [key: string]: any } {
    return {
      productCode: 'string',
      templateCode: 'string',
      templateContext: { 'type': 'array', 'itemType': TemplateContext },
      scoreFields: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 产品拓展字段信息
export class ProductExtContext extends $tea.Model {
  // 产品code
  /**
   * @example
   * MD-CpFJeF0DAAABl4MFvUs
   */
  productCode: string;
  // 产品名
  /**
   * @example
   * 小微分
   */
  productName: string;
  // 模版code
  /**
   * @example
   * tb-default
   */
  templateCode: string;
  // 模版内容,数组
  templateContext: TemplateContext[];
  // 产品模型结果字段
  /**
   * @example
   * ["aft_v3_score","aft_v4_score"]
   */
  scoreFields: string[];
  // 返回样本模版文件下载url
  /**
   * @example
   * http://oss
   */
  templateFileDownUrl: string;
  static names(): { [key: string]: string } {
    return {
      productCode: 'product_code',
      productName: 'product_name',
      templateCode: 'template_code',
      templateContext: 'template_context',
      scoreFields: 'score_fields',
      templateFileDownUrl: 'template_file_down_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      productCode: 'string',
      productName: 'string',
      templateCode: 'string',
      templateContext: { 'type': 'array', 'itemType': TemplateContext },
      scoreFields: { 'type': 'array', 'itemType': 'string' },
      templateFileDownUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// corlab任务查询结果信息
export class ResultContext extends $tea.Model {
  // 产品码
  /**
   * @example
   * aft_v4
   */
  productCode?: string;
  // 结果文件名
  /**
   * @example
   * 结果文件名
   */
  fileName?: string;
  // 结果文件下载地址
  /**
   * @example
   * oss://xxxxx/xxxx
   */
  fileUrl?: string;
  static names(): { [key: string]: string } {
    return {
      productCode: 'product_code',
      fileName: 'file_name',
      fileUrl: 'file_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      productCode: 'string',
      fileName: 'string',
      fileUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 键值对
export class XNameValuePair extends $tea.Model {
  // 键名
  /**
   * @example
   * key
   */
  name: string;
  // 键值
  /**
   * @example
   * value
   */
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

export class RecognizeModelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部业务唯一标识id
  bizId: string;
  // 业务域
  domainCode: string;
  // 模型状态
  status: string;
  // 待计算的模型uuid
  modelUuid: string;
  // map的映射的json字符串
  inputContext: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      domainCode: 'domain_code',
      status: 'status',
      modelUuid: 'model_uuid',
      inputContext: 'input_context',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      domainCode: 'string',
      status: 'string',
      modelUuid: 'string',
      inputContext: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RecognizeModelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作成功结果
  success?: boolean;
  // 业务码
  responseCode?: string;
  // 数据对象结构体字符串
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      responseCode: 'response_code',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      responseCode: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddModelTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户号
  customerId: string;
  // 回执单号
  receiptNo: string;
  // 模型名称
  modelName: string;
  // 模型文件的路径
  modelFileOssPath: string;
  // 验证文件的oss路径	
  validateFileOssPath: string;
  // 模型输出参数名称
  modelOutputLableName: string;
  // 验证文件的输出列名
  csvOutputLableName: string;
  // 验签字段
  signInfo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      customerId: 'customer_id',
      receiptNo: 'receipt_no',
      modelName: 'model_name',
      modelFileOssPath: 'model_file_oss_path',
      validateFileOssPath: 'validate_file_oss_path',
      modelOutputLableName: 'model_output_lable_name',
      csvOutputLableName: 'csv_output_lable_name',
      signInfo: 'sign_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      customerId: 'string',
      receiptNo: 'string',
      modelName: 'string',
      modelFileOssPath: 'string',
      validateFileOssPath: 'string',
      modelOutputLableName: 'string',
      csvOutputLableName: 'string',
      signInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddModelTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 生成的任务id
  taskId?: string;
  // 执行的状态
  status?: string;
  // 错误信息
  errorInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      status: 'status',
      errorInfo: 'error_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      status: 'string',
      errorInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateModelbackTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件唯一ID
  /**
   * @remarks
   * 待上传文件
   */
  fileObject?: Readable;
  /**
   * @remarks
   * 待上传文件名
   */
  fileObjectName?: string;
  fileId: string;
  // 创建任务时回溯的产品
  productCodes: string[];
  // 样本记录名，不传为file_id
  sampleFileName: string;
  // 目前只支持MD5,SHA_256两种加密方式
  keyType: string;
  // 客户方唯一code
  uniqueCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      productCodes: 'product_codes',
      sampleFileName: 'sample_file_name',
      keyType: 'key_type',
      uniqueCode: 'unique_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      productCodes: { 'type': 'array', 'itemType': 'string' },
      sampleFileName: 'string',
      keyType: 'string',
      uniqueCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateModelbackTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务唯一标识
  bizCode?: string;
  // 任务状态：SUCCESS/RUNNING/FAIL
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizCode: 'biz_code',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizCode: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelbackTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 根据任务唯一id查询
  bizCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizCode: 'biz_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelbackTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务唯一id
  bizCode?: string;
  // 任务状态
  status?: string;
  // 任务对应产品结果信息
  resultContexts?: ResultContext[];
  // 任务完成时间
  finishTime?: string;
  // 异步任务失败后，响应客户任务失败原因错误码，任务正常值为空
  errorCode?: string;
  // 异步任务失败后，响应客户错误失败原因，任务正常值为空
  errorMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizCode: 'biz_code',
      status: 'status',
      resultContexts: 'result_contexts',
      finishTime: 'finish_time',
      errorCode: 'error_code',
      errorMsg: 'error_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizCode: 'string',
      status: 'string',
      resultContexts: { 'type': 'array', 'itemType': ResultContext },
      finishTime: 'string',
      errorCode: 'string',
      errorMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelbackProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 产品码，数组形式
  productCodes?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productCodes: 'product_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productCodes: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelbackProductResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 产品模版信息
  productContext?: ProductContext[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      productContext: 'product_context',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      productContext: { 'type': 'array', 'itemType': ProductContext },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFeatureminingPlanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据来源
  dataSource: string;
  // 业务领域
  riskDomain: string;
  // 业务版块
  riskCategory: string;
  // 业务场景
  riskScene: string;
  // agent目标导向
  demandDetail?: string;
  // 交易表/浏览表
  dependTables: string;
  // 运行小时数
  runHours: number;
  // 15
  runMinutes?: number;
  // 100
  featureNum: number;
  // iv要求
  iv?: string;
  // 1702
  /**
   * @remarks
   * 待上传文件
   */
  fileObject?: Readable;
  /**
   * @remarks
   * 待上传文件名
   */
  fileObjectName?: string;
  fileId: number;
  // 客群
  customerGroup?: string;
  // 是否进行模型评估
  modelEvaluate: boolean;
  // 基模选择
  basicModel: string;
  // baseLine信息
  baseLineIds: number[];
  // 结果判断，后期使用
  direction?: string;
  // 计划开始时间
  startDate: string;
  // 结束时间
  endDate?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dataSource: 'data_source',
      riskDomain: 'risk_domain',
      riskCategory: 'risk_category',
      riskScene: 'risk_scene',
      demandDetail: 'demand_detail',
      dependTables: 'depend_tables',
      runHours: 'run_hours',
      runMinutes: 'run_minutes',
      featureNum: 'feature_num',
      iv: 'iv',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      customerGroup: 'customer_group',
      modelEvaluate: 'model_evaluate',
      basicModel: 'basic_model',
      baseLineIds: 'base_line_ids',
      direction: 'direction',
      startDate: 'start_date',
      endDate: 'end_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataSource: 'string',
      riskDomain: 'string',
      riskCategory: 'string',
      riskScene: 'string',
      demandDetail: 'string',
      dependTables: 'string',
      runHours: 'number',
      runMinutes: 'number',
      featureNum: 'number',
      iv: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'number',
      customerGroup: 'string',
      modelEvaluate: 'boolean',
      basicModel: 'string',
      baseLineIds: { 'type': 'array', 'itemType': 'number' },
      direction: 'string',
      startDate: 'string',
      endDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFeatureminingPlanResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 计划ID
  planNo?: string;
  // RUNNING/SUCCESS/FAILED
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      planNo: 'plan_no',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      planNo: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFeatureminingPlanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 特征计划任务ID
  planNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      planNo: 'plan_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      planNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFeatureminingPlanResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // IV信息，包含每轮信息和特征挖掘报告下载链接
  ivInfo?: IvInfo[];
  // 最好模型效果报告
  bestModelReport?: BestModelReport;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      ivInfo: 'iv_info',
      bestModelReport: 'best_model_report',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      ivInfo: { 'type': 'array', 'itemType': IvInfo },
      bestModelReport: BestModelReport,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelbackProductextRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 通过产品Code查询出相关产品的产品名、模版字段等信息
  productCodes: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productCodes: 'product_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productCodes: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelbackProductextResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 产品内容
  productContext?: ProductExtContext;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      productContext: 'product_context',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      productContext: ProductExtContext,
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
   * @remarks
   * Init client with Config
   * 
   * @param config - config contains the necessary information to create a client
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
   * @remarks
   * Encapsulate the request and invoke the network
   * 
   * @param action - api name
   * @param protocol - http or https
   * @param method - e.g. GET
   * @param pathname - pathname of every api
   * @param request - which contains request params
   * @param runtime - which controls some details of call api, such as retry times
   * @returns the response
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
          sdk_version: "1.3.0",
          _prod_code: "CORLAB",
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
   * @remarks
   * Description: 单次模型预测
   * Summary: 模型预测
   */
  async recognizeModel(request: RecognizeModelRequest): Promise<RecognizeModelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.recognizeModelEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 单次模型预测
   * Summary: 模型预测
   */
  async recognizeModelEx(request: RecognizeModelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RecognizeModelResponse> {
    Util.validateModel(request);
    return $tea.cast<RecognizeModelResponse>(await this.doRequest("1.0", "antdigital.corlab.model.recognize", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RecognizeModelResponse({}));
  }

  /**
   * @remarks
   * Description: 模型投产任务新增
   * Summary: 模型投产任务新增
   */
  async addModelTask(request: AddModelTaskRequest): Promise<AddModelTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addModelTaskEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 模型投产任务新增
   * Summary: 模型投产任务新增
   */
  async addModelTaskEx(request: AddModelTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddModelTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<AddModelTaskResponse>(await this.doRequest("1.0", "antdigital.corlab.model.task.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddModelTaskResponse({}));
  }

  /**
   * @remarks
   * Description: corlab模型回溯任务创建
   * Summary: corlab模型回溯任务创建
   */
  async createModelbackTask(request: CreateModelbackTaskRequest): Promise<CreateModelbackTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createModelbackTaskEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: corlab模型回溯任务创建
   * Summary: corlab模型回溯任务创建
   */
  async createModelbackTaskEx(request: CreateModelbackTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateModelbackTaskResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antdigital.corlab.modelback.task.create",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let createModelbackTaskResponse = new CreateModelbackTaskResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return createModelbackTaskResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<CreateModelbackTaskResponse>(await this.doRequest("1.0", "antdigital.corlab.modelback.task.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateModelbackTaskResponse({}));
  }

  /**
   * @remarks
   * Description: corlab模型回溯任务查询
   * Summary: corlab模型回溯任务查询
   */
  async queryModelbackTask(request: QueryModelbackTaskRequest): Promise<QueryModelbackTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryModelbackTaskEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: corlab模型回溯任务查询
   * Summary: corlab模型回溯任务查询
   */
  async queryModelbackTaskEx(request: QueryModelbackTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryModelbackTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryModelbackTaskResponse>(await this.doRequest("1.0", "antdigital.corlab.modelback.task.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryModelbackTaskResponse({}));
  }

  /**
   * @remarks
   * Description: corlab产品以及产品模版查询
   * Summary: corlab产品以及产品模版查询
   */
  async queryModelbackProduct(request: QueryModelbackProductRequest): Promise<QueryModelbackProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryModelbackProductEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: corlab产品以及产品模版查询
   * Summary: corlab产品以及产品模版查询
   */
  async queryModelbackProductEx(request: QueryModelbackProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryModelbackProductResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryModelbackProductResponse>(await this.doRequest("1.0", "antdigital.corlab.modelback.product.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryModelbackProductResponse({}));
  }

  /**
   * @remarks
   * Description: 特征智探openAPI接口
   * Summary: 特征智探openAPI接口
   */
  async createFeatureminingPlan(request: CreateFeatureminingPlanRequest): Promise<CreateFeatureminingPlanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createFeatureminingPlanEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 特征智探openAPI接口
   * Summary: 特征智探openAPI接口
   */
  async createFeatureminingPlanEx(request: CreateFeatureminingPlanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateFeatureminingPlanResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateFeatureminingPlanResponse>(await this.doRequest("1.0", "antdigital.corlab.featuremining.plan.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateFeatureminingPlanResponse({}));
  }

  /**
   * @remarks
   * Description: 特征智探结果查询
   * Summary: 特征智探结果查询
   */
  async queryFeatureminingPlan(request: QueryFeatureminingPlanRequest): Promise<QueryFeatureminingPlanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFeatureminingPlanEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 特征智探结果查询
   * Summary: 特征智探结果查询
   */
  async queryFeatureminingPlanEx(request: QueryFeatureminingPlanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFeatureminingPlanResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFeatureminingPlanResponse>(await this.doRequest("1.0", "antdigital.corlab.featuremining.plan.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFeatureminingPlanResponse({}));
  }

  /**
   * @remarks
   * Description: 调用该产品接口，实现模型回溯产品相关信息查询
   * Summary: 调用该产品接口，实现模型回溯产品相关信息查询
   */
  async queryModelbackProductext(request: QueryModelbackProductextRequest): Promise<QueryModelbackProductextResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryModelbackProductextEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 调用该产品接口，实现模型回溯产品相关信息查询
   * Summary: 调用该产品接口，实现模型回溯产品相关信息查询
   */
  async queryModelbackProductextEx(request: QueryModelbackProductextRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryModelbackProductextResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryModelbackProductextResponse>(await this.doRequest("1.0", "antdigital.corlab.modelback.productext.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryModelbackProductextResponse({}));
  }

  /**
   * @remarks
   * Description: 创建HTTP PUT提交的文件上传
   * Summary: 文件上传创建
   */
  async createAntcloudGatewayxFileUpload(request: CreateAntcloudGatewayxFileUploadRequest): Promise<CreateAntcloudGatewayxFileUploadResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAntcloudGatewayxFileUploadEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建HTTP PUT提交的文件上传
   * Summary: 文件上传创建
   */
  async createAntcloudGatewayxFileUploadEx(request: CreateAntcloudGatewayxFileUploadRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAntcloudGatewayxFileUploadResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAntcloudGatewayxFileUploadResponse>(await this.doRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAntcloudGatewayxFileUploadResponse({}));
  }

}
