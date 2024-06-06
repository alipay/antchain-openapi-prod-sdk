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

// 查询结果
export class QueryResult extends $tea.Model {
  // 工号
  workNo: string;
  // 花名
  nickName?: string;
  // 姓名
  name: string;
  // 域账号
  loginAccount: string;
  // 企业邮箱
  buMail: string;
  // 人员类型
  empType: string;
  static names(): { [key: string]: string } {
    return {
      workNo: 'work_no',
      nickName: 'nick_name',
      name: 'name',
      loginAccount: 'login_account',
      buMail: 'bu_mail',
      empType: 'emp_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      workNo: 'string',
      nickName: 'string',
      name: 'string',
      loginAccount: 'string',
      buMail: 'string',
      empType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Zhx ir 结果
export class ZhxIrResultStruct extends $tea.Model {
  // 日合计交易金额指数
  amtIndexV?: string;
  // 日合计交易笔数指标
  transNumIndexV?: string;
  // 日合计交易人数指数
  userNumIndexV?: string;
  // 时间
  dt?: string;
  // 城市等级
  cityLevel?: string;
  static names(): { [key: string]: string } {
    return {
      amtIndexV: 'amt_index_v',
      transNumIndexV: 'trans_num_index_v',
      userNumIndexV: 'user_num_index_v',
      dt: 'dt',
      cityLevel: 'city_level',
    };
  }

  static types(): { [key: string]: any } {
    return {
      amtIndexV: 'string',
      transNumIndexV: 'string',
      userNumIndexV: 'string',
      dt: 'string',
      cityLevel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户信息查询结果
export class UserInfoResult extends $tea.Model {
  // hr主数据接口调用结果
  success: boolean;
  // 调用信息
  message?: string;
  // 错误码
  errorCode?: string;
  // 查询结果
  queryResultList: QueryResult[];
  static names(): { [key: string]: string } {
    return {
      success: 'success',
      message: 'message',
      errorCode: 'error_code',
      queryResultList: 'query_result_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      success: 'boolean',
      message: 'string',
      errorCode: 'string',
      queryResultList: { 'type': 'array', 'itemType': QueryResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 模型结果
export class ModelResult extends $tea.Model {
  // 分数
  score: string;
  // 模型id
  modelId: string;
  static names(): { [key: string]: string } {
    return {
      score: 'score',
      modelId: 'model_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      score: 'string',
      modelId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDuankaEvaluationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 请求流水ID
  requestId: string;
  // 用户关联订单号
  orderId: string;
  // 请求模型ID列表（目前仅支持每次请求一个模型），逗号分割
  modelList: string;
  // 用户id
  userId: string;
  // 用户id类型：
  // "ID_NO"： 身份证号,
  userIdType: string;
  // 加密类型(目前只支持SHA256):
  // "MD5"：MD5（32位小写）,
  // "SHA256" ： SHA256（密文小写），              "SM3"： SM3（密文小写）
  encryptType: string;
  // 用户授权模版编号
  authTemplateNo: string;
  // 用户授权编码
  authNo: string;
  // 客户发起请求时间, 格式："yyyy-MM-dd HH:mm:ss"
  requestTime: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      requestId: 'request_id',
      orderId: 'order_id',
      modelList: 'model_list',
      userId: 'user_id',
      userIdType: 'user_id_type',
      encryptType: 'encrypt_type',
      authTemplateNo: 'auth_template_no',
      authNo: 'auth_no',
      requestTime: 'request_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      requestId: 'string',
      orderId: 'string',
      modelList: 'string',
      userId: 'string',
      userIdType: 'string',
      encryptType: 'string',
      authTemplateNo: 'string',
      authNo: 'string',
      requestTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDuankaEvaluationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 模型结果，数组返回
  result?: ModelResult[];
  // 请求流水ID
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: { 'type': 'array', 'itemType': ModelResult },
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryHrUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 花名列表
  nickNameList?: string[];
  // 域账户列表
  loginAccountList?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      nickNameList: 'nick_name_list',
      loginAccountList: 'login_account_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      nickNameList: { 'type': 'array', 'itemType': 'string' },
      loginAccountList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryHrUserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询用户信息结果
  userInfoResult?: UserInfoResult;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      userInfoResult: 'user_info_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      userInfoResult: UserInfoResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySkyholdResRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 业务biz_code
  bizCode: string;
  // 查询key
  keyId: string;
  // 渠道code
  channelCode: string;
  // 客户id
  customerId: string;
  // 授权码
  authCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      bizCode: 'biz_code',
      keyId: 'key_id',
      channelCode: 'channel_code',
      customerId: 'customer_id',
      authCode: 'auth_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      bizCode: 'string',
      keyId: 'string',
      channelCode: 'string',
      customerId: 'string',
      authCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySkyholdResResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询结果
  jsonRes?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      jsonRes: 'json_res',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      jsonRes: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCommonScoreRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 用户授权编码
  authNo: string;
  // 模型id
  modelId: string;
  // 用户id（客户身份证号/手机号的md5/sha256散列值）
  userId: string;
  // 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
  userIdType: string;
  // user_id 散列类型: "MD5"：MD5（小写）, "SHA256" ： SHA256（小写）， "SM3"： SM3（小写）
  encryptType: string;
  // 客户编码
  customerCode: string;
  // 流水号，串联链路用，非必填
  transNo?: string;
  // encrypt_type类型的散列后的操作，默认为空不加密。
  // 如启用，需要对散列后的user_id 加密，可选用如下算法，类型1、AES/ECB/PKCS5PADDING 
  // 在加密后的二进制需要以字符集UTF-8，编码base64 方式赋值给user_id传输。
  // 示例：AES秘钥：base64_aes_key = "CZqWzQ5JL8s5Zx2XVpGZGw=="，报文：plaintext = "Hello, 蚂蚁。" ，使用算法： AES/ECB/PKCS5PADDING ；密文：SI1wU1ePSFoMy5YzuxclFkbZ/FIXUHPRDbKBW85WolY=，配置了此项user_id应该传输此密文。
  userIdHashEncrypt?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      authNo: 'auth_no',
      modelId: 'model_id',
      userId: 'user_id',
      userIdType: 'user_id_type',
      encryptType: 'encrypt_type',
      customerCode: 'customer_code',
      transNo: 'trans_no',
      userIdHashEncrypt: 'user_id_hash_encrypt',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      authNo: 'string',
      modelId: 'string',
      userId: 'string',
      userIdType: 'string',
      encryptType: 'string',
      customerCode: 'string',
      transNo: 'string',
      userIdHashEncrypt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCommonScoreResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 模型分数
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

export class SubmitYunfengdieAuditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 接口调用参数
  params: string;
  // 请求头参数
  headers: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      params: 'params',
      headers: 'headers',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      params: 'string',
      headers: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitYunfengdieAuditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 云凤蝶工单提交相应JSON
  result?: string;
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
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportAistudioOssRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 阿里云oss路径
  aliyunOssPath: string;
  // 主站oss路径
  antOssPath: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      aliyunOssPath: 'aliyun_oss_path',
      antOssPath: 'ant_oss_path',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      aliyunOssPath: 'string',
      antOssPath: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportAistudioOssResponse extends $tea.Model {
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

export class CheckAistudioModelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 业务唯一码（可填model_id）
  bizCode: string;
  // 业务类型（TDI平台填TDI）
  bizType: string;
  // 模型类型（1：离线模型，2：在线模型，3：既是离线也是在线）
  modelType: number;
  // 所需要验收服务的list
  // 1. PRESSURE
  // 2. RUNTIMUE
  // 3. SAFETY
  serviceSelector: string;
  // 离线模型oss路径
  offlineModelPath?: string;
  // 在线模型oss路径
  onlineModelPath?: string;
  // 模型脚本oss路径
  scriptPath: string;
  // 验证样本（csv格式，包括保留列、特征列和分数）的OSS路径
  samplePath: string;
  // 验证样本保留列的list
  remainList: string;
  // 验证样本特征列的list
  featureList: string;
  // 验证样本分数列
  scoreCol: string;
  // aistudio docker镜像指定，若未指定，则默认为
  // reg.docker.alibaba-inc.com/aii/aistudio:aistudio-108521006-1633157052-1690290565806
  dockerImage?: string;
  // 在线模型压测核数，默认为1
  pmCore?: number;
  // 在线模型压测内存大小（GB），默认为2
  pmMem?: number;
  // 离线模型批次大小，默认2000
  batchSize?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      bizCode: 'biz_code',
      bizType: 'biz_type',
      modelType: 'model_type',
      serviceSelector: 'service_selector',
      offlineModelPath: 'offline_model_path',
      onlineModelPath: 'online_model_path',
      scriptPath: 'script_path',
      samplePath: 'sample_path',
      remainList: 'remain_list',
      featureList: 'feature_list',
      scoreCol: 'score_col',
      dockerImage: 'docker_image',
      pmCore: 'pm_core',
      pmMem: 'pm_mem',
      batchSize: 'batch_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      bizCode: 'string',
      bizType: 'string',
      modelType: 'number',
      serviceSelector: 'string',
      offlineModelPath: 'string',
      onlineModelPath: 'string',
      scriptPath: 'string',
      samplePath: 'string',
      remainList: 'string',
      featureList: 'string',
      scoreCol: 'string',
      dockerImage: 'string',
      pmCore: 'number',
      pmMem: 'number',
      batchSize: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckAistudioModelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 异步任务id
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

export class QueryAistudioModelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 任务id
  taskId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAistudioModelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务唯一id
  bizCode?: string;
  // 压测报告
  pressureReport?: string;
  // 运行态报告
  runtimeReport?: string;
  // 安全报告
  safetyReport?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizCode: 'biz_code',
      pressureReport: 'pressure_report',
      runtimeReport: 'runtime_report',
      safetyReport: 'safety_report',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizCode: 'string',
      pressureReport: 'string',
      runtimeReport: 'string',
      safetyReport: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBacktrackScoreRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 用户授权编码
  authNo: string;
  // 模型id
  modelId: string;
  // 用户id（客户身份证号/手机号的md5/sha256/sm3散列值）
  userId: string;
  // 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
  userIdType: string;
  // user_id 散列类型: "MD5"：MD5（小写）, "SHA256" ： SHA256（小写）， "SM3"： SM3（小写）
  encryptType: string;
  // 	
  // 客户编码
  customerCode: string;
  // 流水号，串联链路用，非必填
  transNo?: string;
  // encrypt_type类型的散列后的操作，默认为空不加密。 如启用，需要对散列后的user_id 加密，可选用如下算法，类型1、AES/ECB/PKCS5PADDING 在加密后的二进制需要以字符集UTF-8，编码base64 方式赋值给user_id传输。 示例：AES秘钥：base64_aes_key = "CZqWzQ5JL8s5Zx2XVpGZGw=="，报文：plaintext = "Hello, 蚂蚁。" ，使用算法： AES/ECB/PKCS5PADDING ；密文：SI1wU1ePSFoMy5YzuxclFkbZ/FIXUHPRDbKBW85WolY=，配置了此项user_id应该传输此密文。
  userIdHashEncrypt?: string;
  // 回溯采样日期
  sampleDate: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      authNo: 'auth_no',
      modelId: 'model_id',
      userId: 'user_id',
      userIdType: 'user_id_type',
      encryptType: 'encrypt_type',
      customerCode: 'customer_code',
      transNo: 'trans_no',
      userIdHashEncrypt: 'user_id_hash_encrypt',
      sampleDate: 'sample_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      authNo: 'string',
      modelId: 'string',
      userId: 'string',
      userIdType: 'string',
      encryptType: 'string',
      customerCode: 'string',
      transNo: 'string',
      userIdHashEncrypt: 'string',
      sampleDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBacktrackScoreResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 模型分数
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

export class QueryIrBrandRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 品牌MD5的 32位小写
  brandmd5: string;
  // 开始日期，包含填写时间 ，目前与end_date最大间隔不大于7天
  beginDate: string;
  // 结束日期，包含填写时间， 目前与start_date最大间隔不大于7天
  endDate: string;
  // 场景码,brand_overview 品牌汇总；brand_citylevel 品牌城市汇总
  scene: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      brandmd5: 'brandmd5',
      beginDate: 'begin_date',
      endDate: 'end_date',
      scene: 'scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      brandmd5: 'string',
      beginDate: 'string',
      endDate: 'string',
      scene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIrBrandResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果
  dataList?: ZhxIrResultStruct[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      dataList: 'data_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      dataList: { 'type': 'array', 'itemType': ZhxIrResultStruct },
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
          sdk_version: "1.1.0",
          _prod_code: "DUANKA",
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
   * Description: 查询断卡结果
   * Summary: 查询断卡结果
   */
  async queryDuankaEvaluation(request: QueryDuankaEvaluationRequest): Promise<QueryDuankaEvaluationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDuankaEvaluationEx(request, headers, runtime);
  }

  /**
   * Description: 查询断卡结果
   * Summary: 查询断卡结果
   */
  async queryDuankaEvaluationEx(request: QueryDuankaEvaluationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDuankaEvaluationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDuankaEvaluationResponse>(await this.doRequest("1.0", "antcloud.duanka.duanka.evaluation.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDuankaEvaluationResponse({}));
  }

  /**
   * Description: hr主数据用户信息查询接口
   * Summary: hr主数据用户信息查询接口
   */
  async queryHrUser(request: QueryHrUserRequest): Promise<QueryHrUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryHrUserEx(request, headers, runtime);
  }

  /**
   * Description: hr主数据用户信息查询接口
   * Summary: hr主数据用户信息查询接口
   */
  async queryHrUserEx(request: QueryHrUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryHrUserResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryHrUserResponse>(await this.doRequest("1.0", "antcloud.duanka.hr.user.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryHrUserResponse({}));
  }

  /**
   * Description: 天擎数据接口查询
   * Summary: 天擎数据接口查询
   */
  async querySkyholdRes(request: QuerySkyholdResRequest): Promise<QuerySkyholdResResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySkyholdResEx(request, headers, runtime);
  }

  /**
   * Description: 天擎数据接口查询
   * Summary: 天擎数据接口查询
   */
  async querySkyholdResEx(request: QuerySkyholdResRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySkyholdResResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySkyholdResResponse>(await this.doRequest("1.0", "antcloud.duanka.skyhold.res.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySkyholdResResponse({}));
  }

  /**
   * Description: 通用查询
   * Summary: 通用查询
   */
  async queryCommonScore(request: QueryCommonScoreRequest): Promise<QueryCommonScoreResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCommonScoreEx(request, headers, runtime);
  }

  /**
   * Description: 通用查询
   * Summary: 通用查询
   */
  async queryCommonScoreEx(request: QueryCommonScoreRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCommonScoreResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCommonScoreResponse>(await this.doRequest("1.0", "antcloud.duanka.common.score.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCommonScoreResponse({}));
  }

  /**
   * Description: 云凤蝶工单提交接口
   * Summary: 云凤蝶工单提交接口
   */
  async submitYunfengdieAudit(request: SubmitYunfengdieAuditRequest): Promise<SubmitYunfengdieAuditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitYunfengdieAuditEx(request, headers, runtime);
  }

  /**
   * Description: 云凤蝶工单提交接口
   * Summary: 云凤蝶工单提交接口
   */
  async submitYunfengdieAuditEx(request: SubmitYunfengdieAuditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitYunfengdieAuditResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitYunfengdieAuditResponse>(await this.doRequest("1.0", "antcloud.duanka.yunfengdie.audit.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitYunfengdieAuditResponse({}));
  }

  /**
   * Description: 文件转存接口
   * Summary: 文件转存接口
   */
  async importAistudioOss(request: ImportAistudioOssRequest): Promise<ImportAistudioOssResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importAistudioOssEx(request, headers, runtime);
  }

  /**
   * Description: 文件转存接口
   * Summary: 文件转存接口
   */
  async importAistudioOssEx(request: ImportAistudioOssRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportAistudioOssResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportAistudioOssResponse>(await this.doRequest("1.0", "antcloud.duanka.aistudio.oss.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportAistudioOssResponse({}));
  }

  /**
   * Description: 模型验收服务
   * Summary: 模型验收服务
   */
  async checkAistudioModel(request: CheckAistudioModelRequest): Promise<CheckAistudioModelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkAistudioModelEx(request, headers, runtime);
  }

  /**
   * Description: 模型验收服务
   * Summary: 模型验收服务
   */
  async checkAistudioModelEx(request: CheckAistudioModelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckAistudioModelResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckAistudioModelResponse>(await this.doRequest("1.0", "antcloud.duanka.aistudio.model.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckAistudioModelResponse({}));
  }

  /**
   * Description: 模型验收服务结果查询
   * Summary: 模型验收服务结果查询
   */
  async queryAistudioModel(request: QueryAistudioModelRequest): Promise<QueryAistudioModelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAistudioModelEx(request, headers, runtime);
  }

  /**
   * Description: 模型验收服务结果查询
   * Summary: 模型验收服务结果查询
   */
  async queryAistudioModelEx(request: QueryAistudioModelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAistudioModelResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAistudioModelResponse>(await this.doRequest("1.0", "antcloud.duanka.aistudio.model.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAistudioModelResponse({}));
  }

  /**
   * Description: 通用查询-回溯
   * Summary: 通用查询-回溯
   */
  async queryBacktrackScore(request: QueryBacktrackScoreRequest): Promise<QueryBacktrackScoreResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBacktrackScoreEx(request, headers, runtime);
  }

  /**
   * Description: 通用查询-回溯
   * Summary: 通用查询-回溯
   */
  async queryBacktrackScoreEx(request: QueryBacktrackScoreRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBacktrackScoreResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBacktrackScoreResponse>(await this.doRequest("1.0", "antcloud.duanka.backtrack.score.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBacktrackScoreResponse({}));
  }

  /**
   * Description: 品牌研究数据查询
   * Summary: 品牌研究数据查询
   */
  async queryIrBrand(request: QueryIrBrandRequest): Promise<QueryIrBrandResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIrBrandEx(request, headers, runtime);
  }

  /**
   * Description: 品牌研究数据查询
   * Summary: 品牌研究数据查询
   */
  async queryIrBrandEx(request: QueryIrBrandRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIrBrandResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIrBrandResponse>(await this.doRequest("1.0", "antcloud.duanka.ir.brand.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIrBrandResponse({}));
  }

}
