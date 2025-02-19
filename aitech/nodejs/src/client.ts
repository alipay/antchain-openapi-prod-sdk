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

// 二维码详情
export class QRCodeDetail extends $tea.Model {
  // 位置，Top、Left、Width、Height
  location: number[];
  // 二维码类型
  type: string;
  // 二维码内容
  content: string;
  // 置信度
  probability: string;
  static names(): { [key: string]: string } {
    return {
      location: 'location',
      type: 'type',
      content: 'content',
      probability: 'probability',
    };
  }

  static types(): { [key: string]: any } {
    return {
      location: { 'type': 'array', 'itemType': 'number' },
      type: 'string',
      content: 'string',
      probability: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Logo详情
export class LogoDetail extends $tea.Model {
  // 位置，Top、Left、Width、Height
  location: number[];
  // 类型
  type: string;
  // 置信度
  probability: string;
  static names(): { [key: string]: string } {
    return {
      location: 'location',
      type: 'type',
      probability: 'probability',
    };
  }

  static types(): { [key: string]: any } {
    return {
      location: { 'type': 'array', 'itemType': 'number' },
      type: 'string',
      probability: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// maya响应体
export class MayaRedGptResponseDTO extends $tea.Model {
  // 消息的ID
  messageId: string;
  // 请求ID
  requestId: string;
  // 会话ID
  sessionId: string;
  // 应答内容
  answer: string;
  // 应答内容格式
  answerFormat: string;
  // 是否回答结束
  answerEnd: boolean;
  // 是否问题有风险
  safe: boolean;
  static names(): { [key: string]: string } {
    return {
      messageId: 'message_id',
      requestId: 'request_id',
      sessionId: 'session_id',
      answer: 'answer',
      answerFormat: 'answer_format',
      answerEnd: 'answer_end',
      safe: 'safe',
    };
  }

  static types(): { [key: string]: any } {
    return {
      messageId: 'string',
      requestId: 'string',
      sessionId: 'string',
      answer: 'string',
      answerFormat: 'string',
      answerEnd: 'boolean',
      safe: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// maya流式响应结果
export class MayaStreamResult extends $tea.Model {
  // maya响应数据
  data: MayaRedGptResponseDTO;
  // 是否成功
  success: boolean;
  // 错误码
  errorCode: string;
  // 错误信息
  errorMsg: string;
  static names(): { [key: string]: string } {
    return {
      data: 'data',
      success: 'success',
      errorCode: 'error_code',
      errorMsg: 'error_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      data: MayaRedGptResponseDTO,
      success: 'boolean',
      errorCode: 'string',
      errorMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 审核同步标签列表
export class AuditSyncLabel extends $tea.Model {
  // 标签名：sex-色情
  label: string;
  // 检测到单个风险标签的置信度：66.25
  probability: number;
  // 风险标签说明
  description?: string;
  // 检测到的敏感词，多个词用逗号分隔，部分标签不会返回敏感词：AA,BB,CC
  riskWords: string;
  static names(): { [key: string]: string } {
    return {
      label: 'label',
      probability: 'probability',
      description: 'description',
      riskWords: 'risk_words',
    };
  }

  static types(): { [key: string]: any } {
    return {
      label: 'string',
      probability: 'number',
      description: 'string',
      riskWords: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// QRCode审核结果
export class QRCodeAuditResult extends $tea.Model {
  // 检测到二维码个数
  detectNum: number;
  // 二维码详情
  details: QRCodeDetail[];
  static names(): { [key: string]: string } {
    return {
      detectNum: 'detect_num',
      details: 'details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      detectNum: 'number',
      details: { 'type': 'array', 'itemType': QRCodeDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// logo审核结果
export class LogoAuditResult extends $tea.Model {
  // 检测到LOGO个数
  detectNum: number;
  // LOGO详情
  details: LogoDetail[];
  static names(): { [key: string]: string } {
    return {
      detectNum: 'detect_num',
      details: 'details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      detectNum: 'number',
      details: { 'type': 'array', 'itemType': LogoDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 网关响应模型
export class AntCloudProdProviderHttpResponse extends $tea.Model {
  // maya返回结果
  response: MayaStreamResult;
  // 签名
  sign: string;
  static names(): { [key: string]: string } {
    return {
      response: 'response',
      sign: 'sign',
    };
  }

  static types(): { [key: string]: any } {
    return {
      response: MayaStreamResult,
      sign: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 图片审核结果
export class ImageAuditResult extends $tea.Model {
  // 任务ID
  taskId: string;
  // 数据ID
  dataId: string;
  // LOGO审核结果
  logoAuditResult: LogoAuditResult;
  // QRCode审核结果
  qrCodeAuditResult: QRCodeAuditResult;
  static names(): { [key: string]: string } {
    return {
      taskId: 'task_id',
      dataId: 'data_id',
      logoAuditResult: 'logo_audit_result',
      qrCodeAuditResult: 'qr_code_audit_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      taskId: 'string',
      dataId: 'string',
      logoAuditResult: LogoAuditResult,
      qrCodeAuditResult: QRCodeAuditResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 文本同步审核结果
export class TextSyncAuditResult extends $tea.Model {
  // 任务id
  taskId: string;
  // 数据Id
  dataId: string;
  // 业务Id - 调用方透传
  businessId: string;
  // 风险等级，根据设置的高低风险分返回，返回值包括： - high：高风险（若命中自定义词库，风险等级默认为高风险） - medium：中风险 - low：低风险 - none：未检测到风险
  riskLevel: string;
  // 审核标签列表
  labels: AuditSyncLabel[];
  static names(): { [key: string]: string } {
    return {
      taskId: 'task_id',
      dataId: 'data_id',
      businessId: 'business_id',
      riskLevel: 'risk_level',
      labels: 'labels',
    };
  }

  static types(): { [key: string]: any } {
    return {
      taskId: 'string',
      dataId: 'string',
      businessId: 'string',
      riskLevel: 'string',
      labels: { 'type': 'array', 'itemType': AuditSyncLabel },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyAuditImageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 审核内容链接
  url: string;
  // 审核类型列表
  secTypes: string[];
  // 场景信息
  scene: string;
  // 数据Id,客户传入，唯一标识
  dataId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      url: 'url',
      secTypes: 'sec_types',
      scene: 'scene',
      dataId: 'data_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      url: 'string',
      secTypes: { 'type': 'array', 'itemType': 'string' },
      scene: 'string',
      dataId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyAuditImageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务ID，必须唯一
  taskId?: string;
  // 数据ID，必须唯一
  dataId?: string;
  // 审核内容类型
  contentType?: string;
  // 审核结果
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      dataId: 'data_id',
      contentType: 'content_type',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      dataId: 'string',
      contentType: 'string',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackSofaAuditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 回执原文
  payload: string;
  // 回执场景
  bizScene: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      payload: 'payload',
      bizScene: 'biz_scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      payload: 'string',
      bizScene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackSofaAuditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误码
  errorCode?: string;
  // 错误原因
  errorMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      errorCode: 'error_code',
      errorMessage: 'error_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      errorCode: 'string',
      errorMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitAuditTextRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 待人工审核的文本内容，最长不超过10000个字符（包含中文、英文和标点符号）
  content: string;
  // 审核场景码，该接口固定输入BASE_TEXT_AUDIT，其他值无效
  scene: string;
  // 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
  dataId: string;
  // 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
  businessId?: string;
  // 结果通知地址，不指定时需要调用方主动查询结果
  callback?: string;
  // 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
  seed?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      content: 'content',
      scene: 'scene',
      dataId: 'data_id',
      businessId: 'business_id',
      callback: 'callback',
      seed: 'seed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      content: 'string',
      scene: 'string',
      dataId: 'string',
      businessId: 'string',
      callback: 'string',
      seed: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitAuditTextResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务ID
  taskId?: string;
  // 检测对象对应的数据ID
  dataId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      dataId: 'data_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      dataId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAuditTextRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务ID
  taskId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAuditTextResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文本审核结果
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

export class SubmitAuditImageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符
  // URL地址中不能包含中文，且一次请求请确保仅传入1条URL
  url: string;
  // 审核场景码，该接口固定输入BASE_IMAGE_AUDIT，其他值无效
  scene: string;
  // 检测对象对应的数据ID。
  // 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
  dataId: string;
  // 客户业务ID。
  // 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
  businessId?: string;
  // 结果通知地址，不指定时需要调用方主动查询结果
  callback?: string;
  // 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
  seed?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      url: 'url',
      scene: 'scene',
      dataId: 'data_id',
      businessId: 'business_id',
      callback: 'callback',
      seed: 'seed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      url: 'string',
      scene: 'string',
      dataId: 'string',
      businessId: 'string',
      callback: 'string',
      seed: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitAuditImageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务ID
  taskId?: string;
  // 检测对象对应的数据ID。
  // 如果在提交审核任务的请求参数中传入了dataId，则此处返回对应dataId
  dataId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      dataId: 'data_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      dataId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAuditImageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务ID
  taskId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAuditImageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 图片审核结果
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

export class SubmitAuditAudioRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符
  // 说明 ：
  // URL地址中不能包含中文，且一次请求请确保仅传入1条URL
  url: string;
  // 审核场景码，该接口固定输入BASE_AUDIO_AUDIT，其他值无效
  scene: string;
  // 检测对象对应的数据ID。
  // 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
  dataId: string;
  // 客户业务ID。
  // 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
  businessId?: string;
  // 结果通知地址，不指定时需要调用方主动查询结果
  callback?: string;
  // 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
  seed?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      url: 'url',
      scene: 'scene',
      dataId: 'data_id',
      businessId: 'business_id',
      callback: 'callback',
      seed: 'seed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      url: 'string',
      scene: 'string',
      dataId: 'string',
      businessId: 'string',
      callback: 'string',
      seed: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitAuditAudioResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务ID
  taskId?: string;
  // 检测对象对应的数据ID。
  // 如果在提交审核任务的请求参数中传入了dataId，则此处返回对应dataId
  dataId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      dataId: 'data_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      dataId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAuditAudioRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务ID
  taskId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAuditAudioResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 音频审核结果
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

export class SubmitAuditVideoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符
  // URL地址中不能包含中文，且一次请求请确保仅传入1条URL
  url: string;
  // 审核场景码，该接口固定输入BASE_VIDEO_AUDIT，其他值无效
  scene: string;
  // 检测对象对应的数据ID。
  // 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
  dataId: string;
  // 客户业务ID。
  // 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
  businessId?: string;
  // 结果通知地址，不指定时需要调用方主动查询结果
  callback?: string;
  // 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
  seed?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      url: 'url',
      scene: 'scene',
      dataId: 'data_id',
      businessId: 'business_id',
      callback: 'callback',
      seed: 'seed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      url: 'string',
      scene: 'string',
      dataId: 'string',
      businessId: 'string',
      callback: 'string',
      seed: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitAuditVideoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务ID
  taskId?: string;
  // 检测对象对应的数据ID。
  // 如果在提交审核任务的请求参数中传入了dataId，则此处返回对应dataId
  dataId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      dataId: 'data_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      dataId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAuditVideoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务ID
  taskId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAuditVideoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 视频审核结果
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

export class ApplyAuditTextRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 待人工审核的文本内容，最长不超过10000个字符（包含中文、英文和标点符号）
  content: string;
  // 审核场景码，建议BASE_TEXT_SEC代指阿里云，文本审核增强版PLUS服务的某一个Service
  scene: string;
  // 检测对象对应的数据ID，由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
  dataId: string;
  // 客户业务ID，由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
  businessId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      content: 'content',
      scene: 'scene',
      dataId: 'data_id',
      businessId: 'business_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      content: 'string',
      scene: 'string',
      dataId: 'string',
      businessId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyAuditTextResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文本同步审核结果，字段含义见：TextSyncAuditResult
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

export class ApplyAuditImagebaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 审核内容链接
  // 目前支持 jpeg、png、jpg、bmp、webp 五种格式
  // 图片的 contentType 必须为 image/xxx 或者 application/octet-stream，其余类型都无法识别
  url: string;
  // 场景，固定填写：BASE_IMAGE_SEC
  scene: string;
  // 数据Id，调用方入审数据的唯一Id
  dataId: string;
  // 客户业务ID
  // 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
  businessId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      url: 'url',
      scene: 'scene',
      dataId: 'data_id',
      businessId: 'business_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      url: 'string',
      scene: 'string',
      dataId: 'string',
      businessId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyAuditImagebaseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 图片基础版审核结果
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

export class ApplyAuditImageadvancedRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 审核内容链接
  // 目前支持 jpeg、png、jpg、bmp、webp 五种格式
  // 图片的 contentType 必须为 image/xxx 或者 application/octet-stream，其余类型都无法识别
  url: string;
  // 场景，固定填写：ADVANCED_IMAGE_SEC
  scene: string;
  // 数据Id，调用方入审数据的唯一Id
  dataId: string;
  // 客户业务ID
  // 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
  businessId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      url: 'url',
      scene: 'scene',
      dataId: 'data_id',
      businessId: 'business_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      url: 'string',
      scene: 'string',
      dataId: 'string',
      businessId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyAuditImageadvancedResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 图片增强版审核结果
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

export class SubmitAuditAudiobaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符
  // 说明 ：
  // 1. URL地址中不能包含中文，且一次请求请确保仅传入1条URL
  // 2. 支持音频文件格式：MP3、WAV、AAC、WMA、OGG、M4A、AMR
  url: string;
  // 审核场景类型
  // 目前支持 BASE_AUDIO_SEC：音视频媒体通用检测
  scene: string;
  // 检测对象对应的数据ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
  dataId: string;
  // 客户业务ID
  // 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
  businessId?: string;
  // 结果通知地址，不指定时需要调用方主动查询结果
  callback?: string;
  // 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
  seed?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      url: 'url',
      scene: 'scene',
      dataId: 'data_id',
      businessId: 'business_id',
      callback: 'callback',
      seed: 'seed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      url: 'string',
      scene: 'string',
      dataId: 'string',
      businessId: 'string',
      callback: 'string',
      seed: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitAuditAudiobaseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务ID
  taskId?: string;
  // 检测对象对应的数据ID。 如果在提交审核任务的请求参数中传入了dataId，则此处返回对应dataId
  dataId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      dataId: 'data_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      dataId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAuditAudiobaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务ID
  taskId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAuditAudiobaseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 音频通用版审核结果
  // 
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

export class SubmitAuditVideobaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符
  // 说明 ：
  // 1. URL地址中不能包含中文，且一次请求请确保仅传入1条URL
  // 2. 视频文件链接支持以下协议：HTTP和HTTPS。
  // 3. 视频文件支持以下格式：AVI、FLV、MP4、MPG、ASF、WMV、MOV、WMA、RMVB、RM、FLASH、TS。
  // 4. 视频大小限制：默认单个视频大小不超过500 MB。如果您的需求超过500 MB，您可以对视频进行分片处理
  url: string;
  // 审核场景类型
  // 目前支持通用版 BASE_VIDEO_SEC
  scene: string;
  // 检测对象对应的数据ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
  dataId: string;
  // 客户业务ID 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
  businessId?: string;
  // 结果通知地址，不指定时需要调用方主动查询结果
  callback?: string;
  // 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
  seed?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      url: 'url',
      scene: 'scene',
      dataId: 'data_id',
      businessId: 'business_id',
      callback: 'callback',
      seed: 'seed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      url: 'string',
      scene: 'string',
      dataId: 'string',
      businessId: 'string',
      callback: 'string',
      seed: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitAuditVideobaseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务ID
  taskId?: string;
  // 检测对象对应的数据ID。 如果在提交审核任务的请求参数中传入了dataId，则此处返回对应dataId
  dataId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      dataId: 'data_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      dataId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAuditVideobaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务ID
  taskId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAuditVideobaseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 视频通用版审核结果
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

export class CallbackAliyunAuditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 回执原文
  payload: string;
  // 回执场景，固定填写 ALIYUN"
  bizScene: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      payload: 'payload',
      bizScene: 'biz_scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      payload: 'string',
      bizScene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackAliyunAuditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误码
  errorCode?: string;
  // 错误原因
  errorMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      errorCode: 'error_code',
      errorMessage: 'error_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      errorCode: 'string',
      errorMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGuardcoreRedgptRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 唯一请求ID
  requestId: string;
  // 多轮对话会话ID
  sessionId: string;
  // 场景code
  sceneCode: string;
  // 调用方AppCode
  appCode: string;
  // 提问内容
  question: string;
  // 提问内容格式,当前仅支持PLAINTEXT
  questionFormat: string;
  // 加密的调用方业务UserId
  userId: string;
  // 是否流式输出
  stream: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      requestId: 'request_id',
      sessionId: 'session_id',
      sceneCode: 'scene_code',
      appCode: 'app_code',
      question: 'question',
      questionFormat: 'question_format',
      userId: 'user_id',
      stream: 'stream',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      requestId: 'string',
      sessionId: 'string',
      sceneCode: 'string',
      appCode: 'string',
      question: 'string',
      questionFormat: 'string',
      userId: 'string',
      stream: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGuardcoreRedgptResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // maya流式调用结果集
  data?: MayaStreamResult;
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
      data: MayaStreamResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAicoguardAdbsinkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 区域id
  regionId: string;
  // DB实例id
  dbInstanceId: string;
  // 数据库空间名称
  nameSpace: string;
  // 数据库空间密码
  nameSpacePassword: string;
  // 数据库表名
  collectionName: string;
  // 要查询的内容
  content: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionId: 'region_id',
      dbInstanceId: 'db_instance_id',
      nameSpace: 'name_space',
      nameSpacePassword: 'name_space_password',
      collectionName: 'collection_name',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionId: 'string',
      dbInstanceId: 'string',
      nameSpace: 'string',
      nameSpacePassword: 'string',
      collectionName: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAicoguardAdbsinkResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求的问题
  question?: string;
  // 代答结果
  answer?: string;
  // 匹配度分数
  score?: string;
  // adb的请求id
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      question: 'question',
      answer: 'answer',
      score: 'score',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      question: 'string',
      answer: 'string',
      score: 'string',
      requestId: 'string',
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
          sdk_version: "1.1.10",
          _prod_code: "AITECH",
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
   * Description: LOGO/二维码审核
   * Summary: LOGO/二维码审核
   */
  async applyAuditImage(request: ApplyAuditImageRequest): Promise<ApplyAuditImageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyAuditImageEx(request, headers, runtime);
  }

  /**
   * Description: LOGO/二维码审核
   * Summary: LOGO/二维码审核
   */
  async applyAuditImageEx(request: ApplyAuditImageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyAuditImageResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyAuditImageResponse>(await this.doRequest("1.0", "aitech.comm.audit.image.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyAuditImageResponse({}));
  }

  /**
   * Description: 主站审核能力回调
   * Summary: 主站审核能力回调
   */
  async callbackSofaAudit(request: CallbackSofaAuditRequest): Promise<CallbackSofaAuditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackSofaAuditEx(request, headers, runtime);
  }

  /**
   * Description: 主站审核能力回调
   * Summary: 主站审核能力回调
   */
  async callbackSofaAuditEx(request: CallbackSofaAuditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackSofaAuditResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackSofaAuditResponse>(await this.doRequest("1.0", "aitech.comm.sofa.audit.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackSofaAuditResponse({}));
  }

  /**
   * Description: 文本审核入审
   * Summary: 文本审核入审
   */
  async submitAuditText(request: SubmitAuditTextRequest): Promise<SubmitAuditTextResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitAuditTextEx(request, headers, runtime);
  }

  /**
   * Description: 文本审核入审
   * Summary: 文本审核入审
   */
  async submitAuditTextEx(request: SubmitAuditTextRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitAuditTextResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitAuditTextResponse>(await this.doRequest("1.0", "aitech.comm.audit.text.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitAuditTextResponse({}));
  }

  /**
   * Description: 文本审核查询
   * Summary: 文本审核查询
   */
  async queryAuditText(request: QueryAuditTextRequest): Promise<QueryAuditTextResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAuditTextEx(request, headers, runtime);
  }

  /**
   * Description: 文本审核查询
   * Summary: 文本审核查询
   */
  async queryAuditTextEx(request: QueryAuditTextRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAuditTextResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAuditTextResponse>(await this.doRequest("1.0", "aitech.comm.audit.text.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAuditTextResponse({}));
  }

  /**
   * Description: 图片审核入审
   * Summary: 图片审核入审
   */
  async submitAuditImage(request: SubmitAuditImageRequest): Promise<SubmitAuditImageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitAuditImageEx(request, headers, runtime);
  }

  /**
   * Description: 图片审核入审
   * Summary: 图片审核入审
   */
  async submitAuditImageEx(request: SubmitAuditImageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitAuditImageResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitAuditImageResponse>(await this.doRequest("1.0", "aitech.comm.audit.image.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitAuditImageResponse({}));
  }

  /**
   * Description: 图片审核查询
   * Summary: 图片审核查询
   */
  async queryAuditImage(request: QueryAuditImageRequest): Promise<QueryAuditImageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAuditImageEx(request, headers, runtime);
  }

  /**
   * Description: 图片审核查询
   * Summary: 图片审核查询
   */
  async queryAuditImageEx(request: QueryAuditImageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAuditImageResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAuditImageResponse>(await this.doRequest("1.0", "aitech.comm.audit.image.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAuditImageResponse({}));
  }

  /**
   * Description: 音频审核入审
   * Summary: 音频审核入审
   */
  async submitAuditAudio(request: SubmitAuditAudioRequest): Promise<SubmitAuditAudioResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitAuditAudioEx(request, headers, runtime);
  }

  /**
   * Description: 音频审核入审
   * Summary: 音频审核入审
   */
  async submitAuditAudioEx(request: SubmitAuditAudioRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitAuditAudioResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitAuditAudioResponse>(await this.doRequest("1.0", "aitech.comm.audit.audio.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitAuditAudioResponse({}));
  }

  /**
   * Description: 音频审核查询
   * Summary: 音频审核查询
   */
  async queryAuditAudio(request: QueryAuditAudioRequest): Promise<QueryAuditAudioResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAuditAudioEx(request, headers, runtime);
  }

  /**
   * Description: 音频审核查询
   * Summary: 音频审核查询
   */
  async queryAuditAudioEx(request: QueryAuditAudioRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAuditAudioResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAuditAudioResponse>(await this.doRequest("1.0", "aitech.comm.audit.audio.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAuditAudioResponse({}));
  }

  /**
   * Description: 视频审核入审
   * Summary: 视频审核入审
   */
  async submitAuditVideo(request: SubmitAuditVideoRequest): Promise<SubmitAuditVideoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitAuditVideoEx(request, headers, runtime);
  }

  /**
   * Description: 视频审核入审
   * Summary: 视频审核入审
   */
  async submitAuditVideoEx(request: SubmitAuditVideoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitAuditVideoResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitAuditVideoResponse>(await this.doRequest("1.0", "aitech.comm.audit.video.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitAuditVideoResponse({}));
  }

  /**
   * Description: 视频审核查询
   * Summary: 视频审核查询
   */
  async queryAuditVideo(request: QueryAuditVideoRequest): Promise<QueryAuditVideoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAuditVideoEx(request, headers, runtime);
  }

  /**
   * Description: 视频审核查询
   * Summary: 视频审核查询
   */
  async queryAuditVideoEx(request: QueryAuditVideoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAuditVideoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAuditVideoResponse>(await this.doRequest("1.0", "aitech.comm.audit.video.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAuditVideoResponse({}));
  }

  /**
   * Description: 文本同步审核接口，调用阿里云内容安全审核增强版
   * Summary: 文本同步审核
   */
  async applyAuditText(request: ApplyAuditTextRequest): Promise<ApplyAuditTextResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyAuditTextEx(request, headers, runtime);
  }

  /**
   * Description: 文本同步审核接口，调用阿里云内容安全审核增强版
   * Summary: 文本同步审核
   */
  async applyAuditTextEx(request: ApplyAuditTextRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyAuditTextResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyAuditTextResponse>(await this.doRequest("1.0", "aitech.comm.audit.text.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyAuditTextResponse({}));
  }

  /**
   * Description: 同步接口，只调用机审能力
   * Summary: 图片机审基础版
   */
  async applyAuditImagebase(request: ApplyAuditImagebaseRequest): Promise<ApplyAuditImagebaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyAuditImagebaseEx(request, headers, runtime);
  }

  /**
   * Description: 同步接口，只调用机审能力
   * Summary: 图片机审基础版
   */
  async applyAuditImagebaseEx(request: ApplyAuditImagebaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyAuditImagebaseResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyAuditImagebaseResponse>(await this.doRequest("1.0", "aitech.comm.audit.imagebase.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyAuditImagebaseResponse({}));
  }

  /**
   * Description: 同步接口，只调用机审能力
   * Summary: 图片审核增强版
   */
  async applyAuditImageadvanced(request: ApplyAuditImageadvancedRequest): Promise<ApplyAuditImageadvancedResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyAuditImageadvancedEx(request, headers, runtime);
  }

  /**
   * Description: 同步接口，只调用机审能力
   * Summary: 图片审核增强版
   */
  async applyAuditImageadvancedEx(request: ApplyAuditImageadvancedRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyAuditImageadvancedResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyAuditImageadvancedResponse>(await this.doRequest("1.0", "aitech.comm.audit.imageadvanced.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyAuditImageadvancedResponse({}));
  }

  /**
   * Description: 异步接口，只调用机审能力
   * Summary: 音频审核通用版入审
   */
  async submitAuditAudiobase(request: SubmitAuditAudiobaseRequest): Promise<SubmitAuditAudiobaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitAuditAudiobaseEx(request, headers, runtime);
  }

  /**
   * Description: 异步接口，只调用机审能力
   * Summary: 音频审核通用版入审
   */
  async submitAuditAudiobaseEx(request: SubmitAuditAudiobaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitAuditAudiobaseResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitAuditAudiobaseResponse>(await this.doRequest("1.0", "aitech.comm.audit.audiobase.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitAuditAudiobaseResponse({}));
  }

  /**
   * Description: 异步接口，只调用机审能力
   * Summary: 音频审核通用版查询
   */
  async queryAuditAudiobase(request: QueryAuditAudiobaseRequest): Promise<QueryAuditAudiobaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAuditAudiobaseEx(request, headers, runtime);
  }

  /**
   * Description: 异步接口，只调用机审能力
   * Summary: 音频审核通用版查询
   */
  async queryAuditAudiobaseEx(request: QueryAuditAudiobaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAuditAudiobaseResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAuditAudiobaseResponse>(await this.doRequest("1.0", "aitech.comm.audit.audiobase.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAuditAudiobaseResponse({}));
  }

  /**
   * Description: 异步通知，只调用机审能力
   * Summary: 视频审核通用版入审
   */
  async submitAuditVideobase(request: SubmitAuditVideobaseRequest): Promise<SubmitAuditVideobaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitAuditVideobaseEx(request, headers, runtime);
  }

  /**
   * Description: 异步通知，只调用机审能力
   * Summary: 视频审核通用版入审
   */
  async submitAuditVideobaseEx(request: SubmitAuditVideobaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitAuditVideobaseResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitAuditVideobaseResponse>(await this.doRequest("1.0", "aitech.comm.audit.videobase.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitAuditVideobaseResponse({}));
  }

  /**
   * Description: 异步查询
   * Summary: 视频审核通用版查询
   */
  async queryAuditVideobase(request: QueryAuditVideobaseRequest): Promise<QueryAuditVideobaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAuditVideobaseEx(request, headers, runtime);
  }

  /**
   * Description: 异步查询
   * Summary: 视频审核通用版查询
   */
  async queryAuditVideobaseEx(request: QueryAuditVideobaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAuditVideobaseResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAuditVideobaseResponse>(await this.doRequest("1.0", "aitech.comm.audit.videobase.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAuditVideobaseResponse({}));
  }

  /**
   * Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
   * Summary: 阿里云内容审核回调
   */
  async callbackAliyunAudit(request: CallbackAliyunAuditRequest): Promise<CallbackAliyunAuditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackAliyunAuditEx(request, headers, runtime);
  }

  /**
   * Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
   * Summary: 阿里云内容审核回调
   */
  async callbackAliyunAuditEx(request: CallbackAliyunAuditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackAliyunAuditResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackAliyunAuditResponse>(await this.doRequest("1.0", "aitech.comm.aliyun.audit.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackAliyunAuditResponse({}));
  }

  /**
   * Description: 红色GPT流式调用网关接口
   * Summary: 红色GPT网关方式调用接口
   */
  async queryGuardcoreRedgpt(request: QueryGuardcoreRedgptRequest): Promise<QueryGuardcoreRedgptResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGuardcoreRedgptEx(request, headers, runtime);
  }

  /**
   * Description: 红色GPT流式调用网关接口
   * Summary: 红色GPT网关方式调用接口
   */
  async queryGuardcoreRedgptEx(request: QueryGuardcoreRedgptRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGuardcoreRedgptResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGuardcoreRedgptResponse>(await this.doRequest("1.0", "aitech.comm.guardcore.redgpt.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGuardcoreRedgptResponse({}));
  }

  /**
   * Description: 阿里云ADB调用接口
   * Summary: 阿里云ADB调用接口
   */
  async queryAicoguardAdbsink(request: QueryAicoguardAdbsinkRequest): Promise<QueryAicoguardAdbsinkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAicoguardAdbsinkEx(request, headers, runtime);
  }

  /**
   * Description: 阿里云ADB调用接口
   * Summary: 阿里云ADB调用接口
   */
  async queryAicoguardAdbsinkEx(request: QueryAicoguardAdbsinkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAicoguardAdbsinkResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAicoguardAdbsinkResponse>(await this.doRequest("1.0", "aitech.comm.aicoguard.adbsink.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAicoguardAdbsinkResponse({}));
  }

}
