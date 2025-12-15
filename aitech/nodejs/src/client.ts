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

// 主题信息
export class MeiyouTopicWebInfo extends $tea.Model {
  // 内容文本
  content?: string;
  // 当前楼层
  currentFloor?: number;
  // 回复楼层
  callBackFloor?: number;
  // 发布时间戳(毫秒)
  // 
  publishTime?: number;
  // 图片URL数组(JSON字符串)
  images?: string;
  // 用户昵称
  userNickname?: string;
  // 用户ID
  userId?: string;
  // 用户类型
  // 
  userType?: string;
  // 用户头像URL
  userAvatar?: string;
  // 主题ID
  topicId?: number;
  // 回复楼信息
  callBackFloorContent?: string;
  // oss存储地址
  ossImages?: string;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      currentFloor: 'current_floor',
      callBackFloor: 'call_back_floor',
      publishTime: 'publish_time',
      images: 'images',
      userNickname: 'user_nickname',
      userId: 'user_id',
      userType: 'user_type',
      userAvatar: 'user_avatar',
      topicId: 'topic_id',
      callBackFloorContent: 'call_back_floor_content',
      ossImages: 'oss_images',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: 'string',
      currentFloor: 'number',
      callBackFloor: 'number',
      publishTime: 'number',
      images: 'string',
      userNickname: 'string',
      userId: 'string',
      userType: 'string',
      userAvatar: 'string',
      topicId: 'number',
      callBackFloorContent: 'string',
      ossImages: 'string',
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

// 美柚审核信息存储请求
export class MeiyouAuditSaveWebRequest extends $tea.Model {
  // 审核记录ID
  auditId?: number;
  // 主题ID
  topicId?: number;
  // 内容文本
  content?: string;
  // 发布时间戳(毫秒)
  publishTime?: number;
  // 图片URL数组(JSON字符串)
  images?: string;
  // 一级业务
  primaryBusiness?: string;
  // 二级业务
  secondaryBusiness?: string;
  // 用户昵称
  userNickname?: string;
  // 用户ID
  userId?: string;
  // 用户类型
  userType?: string;
  // 用户头像URL
  userAvatar?: string;
  // 操作人
  auditOperator?: string;
  // 审核楼
  auditFloor?: number;
  // 版本
  version?: string;
  // 主题信息
  topicInfos?: MeiyouTopicWebInfo[];
  static names(): { [key: string]: string } {
    return {
      auditId: 'audit_id',
      topicId: 'topic_id',
      content: 'content',
      publishTime: 'publish_time',
      images: 'images',
      primaryBusiness: 'primary_business',
      secondaryBusiness: 'secondary_business',
      userNickname: 'user_nickname',
      userId: 'user_id',
      userType: 'user_type',
      userAvatar: 'user_avatar',
      auditOperator: 'audit_operator',
      auditFloor: 'audit_floor',
      version: 'version',
      topicInfos: 'topic_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      auditId: 'number',
      topicId: 'number',
      content: 'string',
      publishTime: 'number',
      images: 'string',
      primaryBusiness: 'string',
      secondaryBusiness: 'string',
      userNickname: 'string',
      userId: 'string',
      userType: 'string',
      userAvatar: 'string',
      auditOperator: 'string',
      auditFloor: 'number',
      version: 'string',
      topicInfos: { 'type': 'array', 'itemType': MeiyouTopicWebInfo },
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

// 美柚审核信息存储
export class MeiyouAuditSaveWebInfo extends $tea.Model {
  // 主题ID
  topicId?: number;
  // 审核记录ID
  auditId: number;
  // 内容文本
  content?: string;
  // 发布时间戳(毫秒)
  publishTime?: number;
  // 图片URL数组(JSON字符串)
  images?: string;
  // 一级业务
  primaryBusiness?: string;
  // 二级业务
  secondaryBusiness?: string;
  // 用户昵称
  userNickname?: string;
  // 用户ID
  userId?: string;
  // 用户类型
  // 
  userType?: string;
  // 用户头像URL
  userAvatar?: string;
  //  主题信息
  topicInfos?: MeiyouTopicWebInfo;
  static names(): { [key: string]: string } {
    return {
      topicId: 'topic_id',
      auditId: 'audit_id',
      content: 'content',
      publishTime: 'publish_time',
      images: 'images',
      primaryBusiness: 'primary_business',
      secondaryBusiness: 'secondary_business',
      userNickname: 'user_nickname',
      userId: 'user_id',
      userType: 'user_type',
      userAvatar: 'user_avatar',
      topicInfos: 'topic_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      topicId: 'number',
      auditId: 'number',
      content: 'string',
      publishTime: 'number',
      images: 'string',
      primaryBusiness: 'string',
      secondaryBusiness: 'string',
      userNickname: 'string',
      userId: 'string',
      userType: 'string',
      userAvatar: 'string',
      topicInfos: MeiyouTopicWebInfo,
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

// 美柚审核信息
export class MeiyouAuditInfo extends $tea.Model {
  // 主键id
  id: number;
  // 审核记录ID
  auditId: number;
  // 主题ID
  topicId?: number;
  // 内容文本
  content?: string;
  // 发布时间戳
  publishTime?: string;
  // 图片URL数组(JSON字符串)
  images?: string;
  // 一级业务
  primaryBusiness?: string;
  // 二级业务
  secondaryBusiness?: string;
  // 用户昵称
  userNickname?: string;
  // 用户ID
  userId?: string;
  // 用户类型
  userType?: string;
  // 用户头像URL
  userAvatar?: string;
  // 审核结果
  auditResult?: string;
  // 审核原因
  auditReason?: string;
  // 审核原因
  auditReasonMsg?: string;
  // 操作人
  auditOperator?: string;
  // 操作时间戳
  auditTime?: string;
  // oss 转存后的图像地址
  ossImages?: string;
  // 创建时间
  gmtCreate?: string;
  // 更新时间
  gmtModified?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      auditId: 'audit_id',
      topicId: 'topic_id',
      content: 'content',
      publishTime: 'publish_time',
      images: 'images',
      primaryBusiness: 'primary_business',
      secondaryBusiness: 'secondary_business',
      userNickname: 'user_nickname',
      userId: 'user_id',
      userType: 'user_type',
      userAvatar: 'user_avatar',
      auditResult: 'audit_result',
      auditReason: 'audit_reason',
      auditReasonMsg: 'audit_reason_msg',
      auditOperator: 'audit_operator',
      auditTime: 'audit_time',
      ossImages: 'oss_images',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      auditId: 'number',
      topicId: 'number',
      content: 'string',
      publishTime: 'string',
      images: 'string',
      primaryBusiness: 'string',
      secondaryBusiness: 'string',
      userNickname: 'string',
      userId: 'string',
      userType: 'string',
      userAvatar: 'string',
      auditResult: 'string',
      auditReason: 'string',
      auditReasonMsg: 'string',
      auditOperator: 'string',
      auditTime: 'string',
      ossImages: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 更新美柚itag关系信息
export class UpdateMeiyouItagRelationWebInfo extends $tea.Model {
  // 主键id
  id: number;
  // 审核记录ID
  auditId?: string;
  // itag数据ID
  itagDataId?: number;
  // 美柚任务审核结果推送状态
  meiyouAuditState?: string;
  // 审核不通过原因
  refuseReson?: string;
  // 美柚itag关联状态
  auditState?: string;
  // 美柚itag关联状态
  topicState?: string;
  // 审核结果
  auditResult?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      auditId: 'audit_id',
      itagDataId: 'itag_data_id',
      meiyouAuditState: 'meiyou_audit_state',
      refuseReson: 'refuse_reson',
      auditState: 'audit_state',
      topicState: 'topic_state',
      auditResult: 'audit_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      auditId: 'string',
      itagDataId: 'number',
      meiyouAuditState: 'string',
      refuseReson: 'string',
      auditState: 'string',
      topicState: 'string',
      auditResult: 'string',
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
  // 审核时输入的额外信息
  extendInfo?: string;
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
      extendInfo: 'extend_info',
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
      extendInfo: 'string',
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
  // 审核时输入的额外信息
  extendInfo?: string;
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
      extendInfo: 'extend_info',
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
      extendInfo: 'string',
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
  // 审核时输入的额外信息
  extendInfo?: string;
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
      extendInfo: 'extend_info',
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
      extendInfo: 'string',
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
  // 审核时输入的额外信息
  extendInfo?: string;
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
      extendInfo: 'extend_info',
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
      extendInfo: 'string',
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

export class TransferAuditFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户文件路径
  url: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      url: 'url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      url: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class TransferAuditFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 响应信息
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

export class DownloadAuditFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件地址
  url: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      url: 'url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      url: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DownloadAuditFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 响应信息
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

export class SaveAuditMeiyouRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 美柚待审核信息保存请求
  request: MeiyouAuditSaveWebInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      request: 'request',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      request: { 'type': 'array', 'itemType': MeiyouAuditSaveWebInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveAuditMeiyouResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 码值
  errorCode?: string;
  // 错误信息
  errorMessage?: string;
  // 请求ID
  requestId?: string;
  // 响应结果
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      errorCode: 'error_code',
      errorMessage: 'error_message',
      requestId: 'request_id',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      errorCode: 'string',
      errorMessage: 'string',
      requestId: 'string',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAuditMeiyouRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 审核记录ID
  auditId: number;
  // 审核结果
  auditResult?: string;
  // 审核原因
  auditReason?: string;
  // 操作人
  auditOperator?: string;
  // 操作时间戳(毫秒)
  auditTime?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      auditId: 'audit_id',
      auditResult: 'audit_result',
      auditReason: 'audit_reason',
      auditOperator: 'audit_operator',
      auditTime: 'audit_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      auditId: 'number',
      auditResult: 'string',
      auditReason: 'string',
      auditOperator: 'string',
      auditTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAuditMeiyouResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 异常码值
  errorCode?: string;
  // 异常信息
  errorMessage?: string;
  // 请求ID
  requestId?: string;
  // 响应结果
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      errorCode: 'error_code',
      errorMessage: 'error_message',
      requestId: 'request_id',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      errorCode: 'string',
      errorMessage: 'string',
      requestId: 'string',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMeiyouAuditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 审核记录ID
  auditIds?: number[];
  // 美柚itag关联状态
  auditState: string;
  // 开始时间
  gmtCreateStart?: string;
  // 结束时间
  gmtCreateEnd?: string;
  // 最大条数
  maxNum?: number;
  // 数据来源
  source?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      auditIds: 'audit_ids',
      auditState: 'audit_state',
      gmtCreateStart: 'gmt_create_start',
      gmtCreateEnd: 'gmt_create_end',
      maxNum: 'max_num',
      source: 'source',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      auditIds: { 'type': 'array', 'itemType': 'number' },
      auditState: 'string',
      gmtCreateStart: 'string',
      gmtCreateEnd: 'string',
      maxNum: 'number',
      source: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMeiyouAuditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 响应信息
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

export class QueryMeiyouAudittopicRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 主题ID
  topicIds: number[];
  // 美柚itag关联状态
  topicState: string;
  // 数据来源
  source?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      topicIds: 'topic_ids',
      topicState: 'topic_state',
      source: 'source',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      topicIds: { 'type': 'array', 'itemType': 'number' },
      topicState: 'string',
      source: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMeiyouAudittopicResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口响应
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

export class UpdateMeiyouAuditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 主题ID
  topicIds?: number[];
  // 美柚itag关联状态
  topicState?: string;
  // 审核记录ID
  auditIds?: number[];
  // 美柚itag关联状态
  auditState?: string;
  // itag任务ID
  itagTaskId?: number;
  // itag数据集ID
  itagDatasetId?: number;
  // 数据来源
  source?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      topicIds: 'topic_ids',
      topicState: 'topic_state',
      auditIds: 'audit_ids',
      auditState: 'audit_state',
      itagTaskId: 'itag_task_id',
      itagDatasetId: 'itag_dataset_id',
      source: 'source',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      topicIds: { 'type': 'array', 'itemType': 'number' },
      topicState: 'string',
      auditIds: { 'type': 'array', 'itemType': 'number' },
      auditState: 'string',
      itagTaskId: 'number',
      itagDatasetId: 'number',
      source: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMeiyouAuditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口响应
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

export class QueryMeiyouItagrelationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 主键id
  id?: number;
  // 审核记录ID
  auditId?: number;
  // 主题ID
  topicId?: number;
  // itag任务ID
  itagTaskId?: number;
  // itag数据集ID
  itagDatasetId?: number;
  // itag数据ID
  itagDataId?: number;
  // 美柚任务审核结果推送状态
  meiyouAuditState?: string;
  // 审核记录状态
  auditState?: string;
  // 主题记录状态
  topicState?: string;
  // 更新时间-start
  gmtModifiedStart?: string;
  // 更新时间-end 
  gmtModifiedEnd?: string;
  // 操作人
  auditOperator?: string;
  // 数据来源
  source?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      auditId: 'audit_id',
      topicId: 'topic_id',
      itagTaskId: 'itag_task_id',
      itagDatasetId: 'itag_dataset_id',
      itagDataId: 'itag_data_id',
      meiyouAuditState: 'meiyou_audit_state',
      auditState: 'audit_state',
      topicState: 'topic_state',
      gmtModifiedStart: 'gmt_modified_start',
      gmtModifiedEnd: 'gmt_modified_end',
      auditOperator: 'audit_operator',
      source: 'source',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      auditId: 'number',
      topicId: 'number',
      itagTaskId: 'number',
      itagDatasetId: 'number',
      itagDataId: 'number',
      meiyouAuditState: 'string',
      auditState: 'string',
      topicState: 'string',
      gmtModifiedStart: 'string',
      gmtModifiedEnd: 'string',
      auditOperator: 'string',
      source: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMeiyouItagrelationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 响应
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

export class UpdateMeiyouItagrelationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 更新关系信息
  relationInfoList?: UpdateMeiyouItagRelationWebInfo[];
  // 是否更新审核记录信息
  updateAuditFlag: boolean;
  // 数据来源
  source?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      relationInfoList: 'relation_info_list',
      updateAuditFlag: 'update_audit_flag',
      source: 'source',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      relationInfoList: { 'type': 'array', 'itemType': UpdateMeiyouItagRelationWebInfo },
      updateAuditFlag: 'boolean',
      source: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMeiyouItagrelationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 响应结果
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

export class QueryMeiyouAuditresultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 审核ID
  auditIds?: number[];
  // 美柚任务审核结果推送状态
  meiyouAuditState?: string;
  // 审核记录状态
  auditState?: string[];
  // 主题记录状态
  topicState?: string;
  // 开始时间点
  createStart?: string;
  // 结束时间点
  createEnd?: string;
  // 数据来源
  source?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      auditIds: 'audit_ids',
      meiyouAuditState: 'meiyou_audit_state',
      auditState: 'audit_state',
      topicState: 'topic_state',
      createStart: 'create_start',
      createEnd: 'create_end',
      source: 'source',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      auditIds: { 'type': 'array', 'itemType': 'number' },
      meiyouAuditState: 'string',
      auditState: { 'type': 'array', 'itemType': 'string' },
      topicState: 'string',
      createStart: 'string',
      createEnd: 'string',
      source: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMeiyouAuditresultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 响应信息
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

export class PagequeryMeiyouAuditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 主键id
  id?: number;
  // 页面
  pageNum: number;
  // 审核记录ID
  auditId?: number;
  // 大小
  pageSize: number;
  // 主题ID
  topicId?: number;
  // 内容文本
  content?: string;
  // 一级业务
  primaryBusiness?: string;
  // 二级业务
  secondaryBusiness?: string;
  // 审核结果
  auditResult?: string;
  // 审核原因
  auditReason?: string;
  // 创建时间-start
  gmtCreateStart?: string;
  // 创建时间-end
  gmtCreateEnd?: string;
  // 数据来源
  source?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      pageNum: 'page_num',
      auditId: 'audit_id',
      pageSize: 'page_size',
      topicId: 'topic_id',
      content: 'content',
      primaryBusiness: 'primary_business',
      secondaryBusiness: 'secondary_business',
      auditResult: 'audit_result',
      auditReason: 'audit_reason',
      gmtCreateStart: 'gmt_create_start',
      gmtCreateEnd: 'gmt_create_end',
      source: 'source',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      pageNum: 'number',
      auditId: 'number',
      pageSize: 'number',
      topicId: 'number',
      content: 'string',
      primaryBusiness: 'string',
      secondaryBusiness: 'string',
      auditResult: 'string',
      auditReason: 'string',
      gmtCreateStart: 'string',
      gmtCreateEnd: 'string',
      source: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryMeiyouAuditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 响应信息
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

export class SubmitAuditMeiyouRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据来源
  source: string;
  // 美柚审核信息存储请求
  saveInfo?: MeiyouAuditSaveWebRequest[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      source: 'source',
      saveInfo: 'save_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      source: 'string',
      saveInfo: { 'type': 'array', 'itemType': MeiyouAuditSaveWebRequest },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitAuditMeiyouResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 响应
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

export class SubmitAuditDocumentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符 URL地址中不能包含中文，且一次请求请确保仅传入1条URL
  url: string;
  // 审核场景码
  scene: string;
  // 检测对象对应的数据ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
  dataId: string;
  // 客户业务ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
  businessId?: string;
  // 结果通知地址，不指定时需要调用方主动查询结果
  callback?: string;
  // 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
  seed?: string;
  // 审核时输入的额外信息
  extendInfo?: string;
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
      extendInfo: 'extend_info',
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
      extendInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitAuditDocumentResponse extends $tea.Model {
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

export class QueryAuditDocumentRequest extends $tea.Model {
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

export class QueryAuditDocumentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文档审核结果
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

export class QueryAicoguardcloudAdbsinkRequest extends $tea.Model {
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
  // 查询的内容
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

export class QueryAicoguardcloudAdbsinkResponse extends $tea.Model {
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

export class CallbackGuardAliyunRequest extends $tea.Model {
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

export class CallbackGuardAliyunResponse extends $tea.Model {
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

export class CallbackGuardItaskRequest extends $tea.Model {
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

export class CallbackGuardItaskResponse extends $tea.Model {
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

export class QueryGuardAudioRequest extends $tea.Model {
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

export class QueryGuardAudioResponse extends $tea.Model {
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

export class SubmitGuardAudioRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符 说明 ： URL地址中不能包含中文，且一次请求请确保仅传入1条URL
  url: string;
  // 审核场景码，该接口固定输入BASE_AUDIO_AUDIT，其他值无效
  sceneCode: string;
  // 检测对象对应的数据ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
  dataId: string;
  // 用于上游标识应用来源，字符串长度不能超过 128
  appCode?: string;
  // 客户业务ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
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
      sceneCode: 'scene_code',
      dataId: 'data_id',
      appCode: 'app_code',
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
      sceneCode: 'string',
      dataId: 'string',
      appCode: 'string',
      businessId: 'string',
      callback: 'string',
      seed: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitGuardAudioResponse extends $tea.Model {
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

export class QueryGuardImageRequest extends $tea.Model {
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

export class QueryGuardImageResponse extends $tea.Model {
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

export class SubmitGuardImageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符 URL地址中不能包含中文，且一次请求请确保仅传入1条URL
  url: string;
  // 审核场景码，该接口固定输入BASE_IMAGE_AUDIT，其他值无效
  sceneCode: string;
  // 检测对象对应的数据ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
  dataId: string;
  // 标识上游应用来源，字符串长度不能超过 128
  appCode?: string;
  // 客户业务ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
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
      sceneCode: 'scene_code',
      dataId: 'data_id',
      appCode: 'app_code',
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
      sceneCode: 'string',
      dataId: 'string',
      appCode: 'string',
      businessId: 'string',
      callback: 'string',
      seed: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitGuardImageResponse extends $tea.Model {
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

export class QueryGuardTextRequest extends $tea.Model {
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

export class QueryGuardTextResponse extends $tea.Model {
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

export class SubmitGuardTextRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 待人工审核的文本内容，最长不超过10000个字符（包含中文、英文和标点符号）
  content: string;
  // 审核场景码，固定输入BASE_TEXT_AUDIT，其他值无效
  sceneCode: string;
  // 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
  dataId: string;
  // 标识上游应用来源，字符串长度不能超过 128
  appCode?: string;
  // 客户业务ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
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
      sceneCode: 'scene_code',
      dataId: 'data_id',
      appCode: 'app_code',
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
      sceneCode: 'string',
      dataId: 'string',
      appCode: 'string',
      businessId: 'string',
      callback: 'string',
      seed: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitGuardTextResponse extends $tea.Model {
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

export class QueryGuardVideoRequest extends $tea.Model {
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

export class QueryGuardVideoResponse extends $tea.Model {
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

export class SubmitGuardVideoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符 URL地址中不能包含中文，且一次请求请确保仅传入1条URL
  url: string;
  // 审核场景码，该接口固定输入BASE_VIDEO_AUDIT，其他值无效
  sceneCode: string;
  // 检测对象对应的数据ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
  dataId: string;
  // 标识上游应用来源，字符串长度不能超过 128
  appCode?: string;
  // 客户业务ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
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
      sceneCode: 'scene_code',
      dataId: 'data_id',
      appCode: 'app_code',
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
      sceneCode: 'string',
      dataId: 'string',
      appCode: 'string',
      businessId: 'string',
      callback: 'string',
      seed: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitGuardVideoResponse extends $tea.Model {
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

export class QueryGuardAudiobaseRequest extends $tea.Model {
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

export class QueryGuardAudiobaseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 音频机审结果
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

export class SubmitGuardAudiobaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符 说明 ： 1. URL地址中不能包含中文，且一次请求请确保仅传入1条URL 2. 支持音频文件格式：MP3、WAV、AAC、WMA、OGG、M4A、AMR
  url: string;
  // 审核场景类型 目前支持 BASE_AUDIO_SEC：音视频媒体通用检测
  sceneCode: string;
  // 检测对象对应的数据ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
  dataId: string;
  // 标识上游应用来源，字符串长度不能超过 128
  appCode?: string;
  // 客户业务ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
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
      sceneCode: 'scene_code',
      dataId: 'data_id',
      appCode: 'app_code',
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
      sceneCode: 'string',
      dataId: 'string',
      appCode: 'string',
      businessId: 'string',
      callback: 'string',
      seed: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitGuardAudiobaseResponse extends $tea.Model {
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

export class ApplyGuardImagebaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 审核内容链接 目前支持 jpeg、png、jpg、bmp、webp 五种格式 图片的 contentType 必须为 image/xxx 或者 application/octet-stream，其余类型都无法识别
  url: string;
  // 场景，固定填写：BASE_IMAGE_SEC
  sceneCode: string;
  // 数据Id，调用方入审数据的唯一Id
  dataId: string;
  // 标识上游应用来源，字符串长度不能超过 128
  appCode?: string;
  // 客户业务ID 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
  businessId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      url: 'url',
      sceneCode: 'scene_code',
      dataId: 'data_id',
      appCode: 'app_code',
      businessId: 'business_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      url: 'string',
      sceneCode: 'string',
      dataId: 'string',
      appCode: 'string',
      businessId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyGuardImagebaseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 图片机审结果
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

export class ApplyGuardImageadvancedRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 审核内容链接 目前支持 jpeg、png、jpg、bmp、webp 五种格式 图片的 contentType 必须为 image/xxx 或者 application/octet-stream，其余类型都无法识别
  url: string;
  // 场景，固定填写：ADVANCED_IMAGE_SEC
  sceneCode: string;
  // 数据Id，调用方入审数据的唯一Id
  dataId: string;
  // 标识上游应用来源，字符串长度不能超过 128
  appCode?: string;
  // 客户业务ID 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
  businessId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      url: 'url',
      sceneCode: 'scene_code',
      dataId: 'data_id',
      appCode: 'app_code',
      businessId: 'business_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      url: 'string',
      sceneCode: 'string',
      dataId: 'string',
      appCode: 'string',
      businessId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyGuardImageadvancedResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 图片审核增强版结果
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

export class ApplyGuardTextbaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 待审核的文本内容，最长不超过10000个字符（包含中文、英文和标点符号）
  content: string;
  // 审核场景码，建议BASE_TEXT_SEC代指阿里云，文本审核增强版PLUS服务的某一个Service
  sceneCode: string;
  // 检测对象对应的数据ID，由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
  dataId: string;
  // 	
  // 标识上游应用来源，字符串长度不能超过 128
  appCode?: string;
  // 客户业务ID，由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
  businessId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      content: 'content',
      sceneCode: 'scene_code',
      dataId: 'data_id',
      appCode: 'app_code',
      businessId: 'business_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      content: 'string',
      sceneCode: 'string',
      dataId: 'string',
      appCode: 'string',
      businessId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyGuardTextbaseResponse extends $tea.Model {
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

export class QueryGuardVideobaseRequest extends $tea.Model {
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

export class QueryGuardVideobaseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 视频机审结果
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

export class SubmitGuardVideobaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符 说明 ： 1. URL地址中不能包含中文，且一次请求请确保仅传入1条URL 2. 视频文件链接支持以下协议：HTTP和HTTPS。 3. 视频文件支持以下格式：AVI、FLV、MP4、MPG、ASF、WMV、MOV、WMA、RMVB、RM、FLASH、TS。 4. 视频大小限制：默认单个视频大小不超过500 MB。如果您的需求超过500 MB，您可以对视频进行分片处理
  url: string;
  // 审核场景类型 目前支持通用版 BASE_VIDEO_SEC
  sceneCode: string;
  // 划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
  dataId: string;
  // 标识上游应用来源，字符串长度不能超过 128
  appCode?: string;
  // 客户业务ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
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
      sceneCode: 'scene_code',
      dataId: 'data_id',
      appCode: 'app_code',
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
      sceneCode: 'string',
      dataId: 'string',
      appCode: 'string',
      businessId: 'string',
      callback: 'string',
      seed: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitGuardVideobaseResponse extends $tea.Model {
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

export class ApplyGuardImagemultiplyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景，固定填写：SCENE_MULTIPLY_IMAGE_SEC
  sceneCode: string;
  // 数据Id，调用方入审数据的唯一Id
  dataId: string;
  // 鉴定图片内容链接，url 和 content 参数二选一
  url?: string;
  // 标识上游应用来源，字符串长度不能超过 128
  appCode?: string;
  // 客户业务ID 由大小写英文字母、数字、下划线（_）、短划线...
  businessId?: string;
  // 鉴定图片 base64 地址，url 和 content 参数二选一
  content?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneCode: 'scene_code',
      dataId: 'data_id',
      url: 'url',
      appCode: 'app_code',
      businessId: 'business_id',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneCode: 'string',
      dataId: 'string',
      url: 'string',
      appCode: 'string',
      businessId: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyGuardImagemultiplyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 光鉴检测结果
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

export class CheckGuardAnswerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 调用方标识
  appCode: string;
  // 细分调用方标识，可与 appCode 传相同值
  businessId?: string;
  // 文本内容，最大5000字符长度
  content: string;
  // 场景code：
  // ● llm_output_detection：大模型输出通用场景
  sceneCode: string;
  // 是否开启流式检测功能。默认值：N：不开启
  // Y：开启
  // N：不开启
  flowDetect?: string;
  // 会话ID，标记本次请求内容属于同一段流式内容，文本审核引擎会自动拼接后进行审核，拼接文字片段后不超过10000字的部分
  sessionId?: string;
  // 是否要针对大模型输出的CoT、回答进行代答/改写。默认值：N：不开启
  // Y：开启
  // N：不开启
  replyProxy?: string;
  // 是否要针对大模型输出的内容中的隐私数据进行脱敏。默认值：N：不开启
  // Y：开启
  // N：不开启
  privacyDataObfuscation?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appCode: 'app_code',
      businessId: 'business_id',
      content: 'content',
      sceneCode: 'scene_code',
      flowDetect: 'flow_detect',
      sessionId: 'session_id',
      replyProxy: 'reply_proxy',
      privacyDataObfuscation: 'privacy_data_obfuscation',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appCode: 'string',
      businessId: 'string',
      content: 'string',
      sceneCode: 'string',
      flowDetect: 'string',
      sessionId: 'string',
      replyProxy: 'string',
      privacyDataObfuscation: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckGuardAnswerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文本审核结果。返回结果中包含一个需自行转换的Json字符串
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

export class SubmitMeiyouAuditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据Id
  dataId: string;
  // 模态
  modal: string;
  // 场景
  sceneCode: string;
  // 扩展信息
  extInfo?: string;
  // 美柚审核记录信息
  auditInfo: string;
  // 回调函数
  callback: string;
  // 租户
  tenantCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dataId: 'data_id',
      modal: 'modal',
      sceneCode: 'scene_code',
      extInfo: 'ext_info',
      auditInfo: 'audit_info',
      callback: 'callback',
      tenantCode: 'tenant_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataId: 'string',
      modal: 'string',
      sceneCode: 'string',
      extInfo: 'string',
      auditInfo: 'string',
      callback: 'string',
      tenantCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitMeiyouAuditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 响应结果
  result?: string;
  // 码值
  errorCode?: string;
  // 错误信息
  errorMessage?: string;
  // 请求ID
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
      errorCode: 'error_code',
      errorMessage: 'error_message',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: 'string',
      errorCode: 'string',
      errorMessage: 'string',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMeiyouAgentauditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据创建时间-开始时间点
  gmtCreateStart: string;
  // 数据创建时间-结束时间点
  gmtCreateEnd: string;
  // 所属
  owner?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      gmtCreateStart: 'gmt_create_start',
      gmtCreateEnd: 'gmt_create_end',
      owner: 'owner',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      gmtCreateStart: 'string',
      gmtCreateEnd: 'string',
      owner: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMeiyouAgentauditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 响应结果
  result?: string;
  // 码值
  errorCode?: string;
  // 错误信息
  errorMessage?: string;
  // 请求ID
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
      errorCode: 'error_code',
      errorMessage: 'error_message',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: 'string',
      errorCode: 'string',
      errorMessage: 'string',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAicoguardcoreMeiyouRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 更新信息
  resultInfo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      resultInfo: 'result_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      resultInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAicoguardcoreMeiyouResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 响应码值
  errorCode?: string;
  // 响应描述
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

export class SubmitGuardDocumentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符
  // 说明 ：
  // URL地址中不能包含中文，且一次请求请确保仅传入1条URL
  url: string;
  // 审核场景码
  sceneCode: string;
  // 检测对象对应的数据ID。
  // 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
  dataId: string;
  // 标识上游应用来源，字符串长度不能超过 128
  appCode?: string;
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
      sceneCode: 'scene_code',
      dataId: 'data_id',
      appCode: 'app_code',
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
      sceneCode: 'string',
      dataId: 'string',
      appCode: 'string',
      businessId: 'string',
      callback: 'string',
      seed: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitGuardDocumentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务ID
  taskId?: string;
  // 检测对象对应的数据ID。
  // 说明：
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

export class QueryGuardDocumentRequest extends $tea.Model {
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

export class QueryGuardDocumentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文档审核结果
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
          sdk_version: "1.1.51",
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
   * Description: 外部文件转存
   * Summary: 文件转存接口
   */
  async transferAuditFile(request: TransferAuditFileRequest): Promise<TransferAuditFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.transferAuditFileEx(request, headers, runtime);
  }

  /**
   * Description: 外部文件转存
   * Summary: 文件转存接口
   */
  async transferAuditFileEx(request: TransferAuditFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<TransferAuditFileResponse> {
    Util.validateModel(request);
    return $tea.cast<TransferAuditFileResponse>(await this.doRequest("1.0", "aitech.comm.audit.file.transfer", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new TransferAuditFileResponse({}));
  }

  /**
   * Description: 文件下载接口
   * Summary: 文件下载接口
   */
  async downloadAuditFile(request: DownloadAuditFileRequest): Promise<DownloadAuditFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.downloadAuditFileEx(request, headers, runtime);
  }

  /**
   * Description: 文件下载接口
   * Summary: 文件下载接口
   */
  async downloadAuditFileEx(request: DownloadAuditFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DownloadAuditFileResponse> {
    Util.validateModel(request);
    return $tea.cast<DownloadAuditFileResponse>(await this.doRequest("1.0", "aitech.comm.audit.file.download", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DownloadAuditFileResponse({}));
  }

  /**
   * Description: 美柚待审核信息保存
   * Summary: 美柚待审核信息保存接口
   */
  async saveAuditMeiyou(request: SaveAuditMeiyouRequest): Promise<SaveAuditMeiyouResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveAuditMeiyouEx(request, headers, runtime);
  }

  /**
   * Description: 美柚待审核信息保存
   * Summary: 美柚待审核信息保存接口
   */
  async saveAuditMeiyouEx(request: SaveAuditMeiyouRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveAuditMeiyouResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveAuditMeiyouResponse>(await this.doRequest("1.0", "aitech.comm.audit.meiyou.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveAuditMeiyouResponse({}));
  }

  /**
   * Description: 美柚审核信息存储请求
   * Summary: 美柚审核信息存储请求
   */
  async updateAuditMeiyou(request: UpdateAuditMeiyouRequest): Promise<UpdateAuditMeiyouResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAuditMeiyouEx(request, headers, runtime);
  }

  /**
   * Description: 美柚审核信息存储请求
   * Summary: 美柚审核信息存储请求
   */
  async updateAuditMeiyouEx(request: UpdateAuditMeiyouRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAuditMeiyouResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAuditMeiyouResponse>(await this.doRequest("1.0", "aitech.comm.audit.meiyou.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAuditMeiyouResponse({}));
  }

  /**
   * Description: 美柚审核信息查询接口
   * Summary: 美柚审核信息查询接口
   */
  async queryMeiyouAudit(request: QueryMeiyouAuditRequest): Promise<QueryMeiyouAuditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMeiyouAuditEx(request, headers, runtime);
  }

  /**
   * Description: 美柚审核信息查询接口
   * Summary: 美柚审核信息查询接口
   */
  async queryMeiyouAuditEx(request: QueryMeiyouAuditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMeiyouAuditResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMeiyouAuditResponse>(await this.doRequest("1.0", "aitech.comm.meiyou.audit.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMeiyouAuditResponse({}));
  }

  /**
   * Description: 美柚主题信息查询接口
   * Summary: 美柚主题信息查询接口
   */
  async queryMeiyouAudittopic(request: QueryMeiyouAudittopicRequest): Promise<QueryMeiyouAudittopicResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMeiyouAudittopicEx(request, headers, runtime);
  }

  /**
   * Description: 美柚主题信息查询接口
   * Summary: 美柚主题信息查询接口
   */
  async queryMeiyouAudittopicEx(request: QueryMeiyouAudittopicRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMeiyouAudittopicResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMeiyouAudittopicResponse>(await this.doRequest("1.0", "aitech.comm.meiyou.audittopic.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMeiyouAudittopicResponse({}));
  }

  /**
   * Description: 更新美柚itag关联关系接口
   * Summary: 更新美柚itag关联关系接口
   */
  async updateMeiyouAudit(request: UpdateMeiyouAuditRequest): Promise<UpdateMeiyouAuditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateMeiyouAuditEx(request, headers, runtime);
  }

  /**
   * Description: 更新美柚itag关联关系接口
   * Summary: 更新美柚itag关联关系接口
   */
  async updateMeiyouAuditEx(request: UpdateMeiyouAuditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateMeiyouAuditResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateMeiyouAuditResponse>(await this.doRequest("1.0", "aitech.comm.meiyou.audit.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateMeiyouAuditResponse({}));
  }

  /**
   * Description: 查询美柚itag关联信息
   * Summary: 查询美柚itag关联信息
   */
  async queryMeiyouItagrelation(request: QueryMeiyouItagrelationRequest): Promise<QueryMeiyouItagrelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMeiyouItagrelationEx(request, headers, runtime);
  }

  /**
   * Description: 查询美柚itag关联信息
   * Summary: 查询美柚itag关联信息
   */
  async queryMeiyouItagrelationEx(request: QueryMeiyouItagrelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMeiyouItagrelationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMeiyouItagrelationResponse>(await this.doRequest("1.0", "aitech.comm.meiyou.itagrelation.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMeiyouItagrelationResponse({}));
  }

  /**
   * Description: 更新美柚itag关联信息
   * Summary: 更新美柚itag关联信息
   */
  async updateMeiyouItagrelation(request: UpdateMeiyouItagrelationRequest): Promise<UpdateMeiyouItagrelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateMeiyouItagrelationEx(request, headers, runtime);
  }

  /**
   * Description: 更新美柚itag关联信息
   * Summary: 更新美柚itag关联信息
   */
  async updateMeiyouItagrelationEx(request: UpdateMeiyouItagrelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateMeiyouItagrelationResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateMeiyouItagrelationResponse>(await this.doRequest("1.0", "aitech.comm.meiyou.itagrelation.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateMeiyouItagrelationResponse({}));
  }

  /**
   * Description: 美柚审核结果查询
   * Summary: 美柚审核结果查询
   */
  async queryMeiyouAuditresult(request: QueryMeiyouAuditresultRequest): Promise<QueryMeiyouAuditresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMeiyouAuditresultEx(request, headers, runtime);
  }

  /**
   * Description: 美柚审核结果查询
   * Summary: 美柚审核结果查询
   */
  async queryMeiyouAuditresultEx(request: QueryMeiyouAuditresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMeiyouAuditresultResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMeiyouAuditresultResponse>(await this.doRequest("1.0", "aitech.comm.meiyou.auditresult.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMeiyouAuditresultResponse({}));
  }

  /**
   * Description: 分页查询美柚审核信息接口
   * Summary: 分页查询美柚审核信息接口
   */
  async pagequeryMeiyouAudit(request: PagequeryMeiyouAuditRequest): Promise<PagequeryMeiyouAuditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryMeiyouAuditEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询美柚审核信息接口
   * Summary: 分页查询美柚审核信息接口
   */
  async pagequeryMeiyouAuditEx(request: PagequeryMeiyouAuditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryMeiyouAuditResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryMeiyouAuditResponse>(await this.doRequest("1.0", "aitech.comm.meiyou.audit.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryMeiyouAuditResponse({}));
  }

  /**
   * Description: 美柚审核信息存储（仅itask）
   * Summary: 美柚审核信息存储（仅itask）
   */
  async submitAuditMeiyou(request: SubmitAuditMeiyouRequest): Promise<SubmitAuditMeiyouResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitAuditMeiyouEx(request, headers, runtime);
  }

  /**
   * Description: 美柚审核信息存储（仅itask）
   * Summary: 美柚审核信息存储（仅itask）
   */
  async submitAuditMeiyouEx(request: SubmitAuditMeiyouRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitAuditMeiyouResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitAuditMeiyouResponse>(await this.doRequest("1.0", "aitech.comm.audit.meiyou.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitAuditMeiyouResponse({}));
  }

  /**
   * Description: 文档人审入审
   * Summary: 文档人审入审
   */
  async submitAuditDocument(request: SubmitAuditDocumentRequest): Promise<SubmitAuditDocumentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitAuditDocumentEx(request, headers, runtime);
  }

  /**
   * Description: 文档人审入审
   * Summary: 文档人审入审
   */
  async submitAuditDocumentEx(request: SubmitAuditDocumentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitAuditDocumentResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitAuditDocumentResponse>(await this.doRequest("1.0", "aitech.comm.audit.document.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitAuditDocumentResponse({}));
  }

  /**
   * Description: 文档人审查询
   * Summary: 文档人审查询
   */
  async queryAuditDocument(request: QueryAuditDocumentRequest): Promise<QueryAuditDocumentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAuditDocumentEx(request, headers, runtime);
  }

  /**
   * Description: 文档人审查询
   * Summary: 文档人审查询
   */
  async queryAuditDocumentEx(request: QueryAuditDocumentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAuditDocumentResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAuditDocumentResponse>(await this.doRequest("1.0", "aitech.comm.audit.document.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAuditDocumentResponse({}));
  }

  /**
   * Description: 阿里云ADB调用接口
   * Summary: 阿里云ADB调用接口
   */
  async queryAicoguardcloudAdbsink(request: QueryAicoguardcloudAdbsinkRequest): Promise<QueryAicoguardcloudAdbsinkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAicoguardcloudAdbsinkEx(request, headers, runtime);
  }

  /**
   * Description: 阿里云ADB调用接口
   * Summary: 阿里云ADB调用接口
   */
  async queryAicoguardcloudAdbsinkEx(request: QueryAicoguardcloudAdbsinkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAicoguardcloudAdbsinkResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAicoguardcloudAdbsinkResponse>(await this.doRequest("1.0", "aitech.comm.aicoguardcloud.adbsink.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAicoguardcloudAdbsinkResponse({}));
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

  /**
   * Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
   * Summary: 阿里云内容安全回调
   */
  async callbackGuardAliyun(request: CallbackGuardAliyunRequest): Promise<CallbackGuardAliyunResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackGuardAliyunEx(request, headers, runtime);
  }

  /**
   * Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
   * Summary: 阿里云内容安全回调
   */
  async callbackGuardAliyunEx(request: CallbackGuardAliyunRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackGuardAliyunResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackGuardAliyunResponse>(await this.doRequest("1.0", "aitech.comm.guard.aliyun.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackGuardAliyunResponse({}));
  }

  /**
   * Description: 主站ITASK审核能力回调
   * Summary: 主站ITASK审核能力回调
   */
  async callbackGuardItask(request: CallbackGuardItaskRequest): Promise<CallbackGuardItaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackGuardItaskEx(request, headers, runtime);
  }

  /**
   * Description: 主站ITASK审核能力回调
   * Summary: 主站ITASK审核能力回调
   */
  async callbackGuardItaskEx(request: CallbackGuardItaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackGuardItaskResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackGuardItaskResponse>(await this.doRequest("1.0", "aitech.comm.guard.itask.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackGuardItaskResponse({}));
  }

  /**
   * Description: 音频人审查询
   * Summary: 音频人审查询
   */
  async queryGuardAudio(request: QueryGuardAudioRequest): Promise<QueryGuardAudioResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGuardAudioEx(request, headers, runtime);
  }

  /**
   * Description: 音频人审查询
   * Summary: 音频人审查询
   */
  async queryGuardAudioEx(request: QueryGuardAudioRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGuardAudioResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGuardAudioResponse>(await this.doRequest("1.0", "aitech.comm.guard.audio.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGuardAudioResponse({}));
  }

  /**
   * Description: 音频人审入审
   * Summary: 音频人审入审
   */
  async submitGuardAudio(request: SubmitGuardAudioRequest): Promise<SubmitGuardAudioResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitGuardAudioEx(request, headers, runtime);
  }

  /**
   * Description: 音频人审入审
   * Summary: 音频人审入审
   */
  async submitGuardAudioEx(request: SubmitGuardAudioRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitGuardAudioResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitGuardAudioResponse>(await this.doRequest("1.0", "aitech.comm.guard.audio.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitGuardAudioResponse({}));
  }

  /**
   * Description: 图片人审查询
   * Summary: 图片人审查询
   */
  async queryGuardImage(request: QueryGuardImageRequest): Promise<QueryGuardImageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGuardImageEx(request, headers, runtime);
  }

  /**
   * Description: 图片人审查询
   * Summary: 图片人审查询
   */
  async queryGuardImageEx(request: QueryGuardImageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGuardImageResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGuardImageResponse>(await this.doRequest("1.0", "aitech.comm.guard.image.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGuardImageResponse({}));
  }

  /**
   * Description: 图片人审入审
   * Summary: 图片人审入审
   */
  async submitGuardImage(request: SubmitGuardImageRequest): Promise<SubmitGuardImageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitGuardImageEx(request, headers, runtime);
  }

  /**
   * Description: 图片人审入审
   * Summary: 图片人审入审
   */
  async submitGuardImageEx(request: SubmitGuardImageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitGuardImageResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitGuardImageResponse>(await this.doRequest("1.0", "aitech.comm.guard.image.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitGuardImageResponse({}));
  }

  /**
   * Description: 文本人审查询
   * Summary: 文本人审查询
   */
  async queryGuardText(request: QueryGuardTextRequest): Promise<QueryGuardTextResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGuardTextEx(request, headers, runtime);
  }

  /**
   * Description: 文本人审查询
   * Summary: 文本人审查询
   */
  async queryGuardTextEx(request: QueryGuardTextRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGuardTextResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGuardTextResponse>(await this.doRequest("1.0", "aitech.comm.guard.text.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGuardTextResponse({}));
  }

  /**
   * Description: 文本人审提交
   * Summary: 文本人审提交
   */
  async submitGuardText(request: SubmitGuardTextRequest): Promise<SubmitGuardTextResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitGuardTextEx(request, headers, runtime);
  }

  /**
   * Description: 文本人审提交
   * Summary: 文本人审提交
   */
  async submitGuardTextEx(request: SubmitGuardTextRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitGuardTextResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitGuardTextResponse>(await this.doRequest("1.0", "aitech.comm.guard.text.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitGuardTextResponse({}));
  }

  /**
   * Description: 视频人审查询
   * Summary: 视频人审查询
   */
  async queryGuardVideo(request: QueryGuardVideoRequest): Promise<QueryGuardVideoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGuardVideoEx(request, headers, runtime);
  }

  /**
   * Description: 视频人审查询
   * Summary: 视频人审查询
   */
  async queryGuardVideoEx(request: QueryGuardVideoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGuardVideoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGuardVideoResponse>(await this.doRequest("1.0", "aitech.comm.guard.video.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGuardVideoResponse({}));
  }

  /**
   * Description: 视频人审提交
   * Summary: 视频人审提交
   */
  async submitGuardVideo(request: SubmitGuardVideoRequest): Promise<SubmitGuardVideoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitGuardVideoEx(request, headers, runtime);
  }

  /**
   * Description: 视频人审提交
   * Summary: 视频人审提交
   */
  async submitGuardVideoEx(request: SubmitGuardVideoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitGuardVideoResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitGuardVideoResponse>(await this.doRequest("1.0", "aitech.comm.guard.video.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitGuardVideoResponse({}));
  }

  /**
   * Description: 音频机审查询-基础版
   * Summary: 音频机审查询-基础版
   */
  async queryGuardAudiobase(request: QueryGuardAudiobaseRequest): Promise<QueryGuardAudiobaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGuardAudiobaseEx(request, headers, runtime);
  }

  /**
   * Description: 音频机审查询-基础版
   * Summary: 音频机审查询-基础版
   */
  async queryGuardAudiobaseEx(request: QueryGuardAudiobaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGuardAudiobaseResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGuardAudiobaseResponse>(await this.doRequest("1.0", "aitech.comm.guard.audiobase.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGuardAudiobaseResponse({}));
  }

  /**
   * Description: 音频机审入审-基础版
   * Summary: 音频机审入审-基础版
   */
  async submitGuardAudiobase(request: SubmitGuardAudiobaseRequest): Promise<SubmitGuardAudiobaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitGuardAudiobaseEx(request, headers, runtime);
  }

  /**
   * Description: 音频机审入审-基础版
   * Summary: 音频机审入审-基础版
   */
  async submitGuardAudiobaseEx(request: SubmitGuardAudiobaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitGuardAudiobaseResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitGuardAudiobaseResponse>(await this.doRequest("1.0", "aitech.comm.guard.audiobase.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitGuardAudiobaseResponse({}));
  }

  /**
   * Description: 图片机审申请-基础版
   * Summary: 图片机审申请-基础版
   */
  async applyGuardImagebase(request: ApplyGuardImagebaseRequest): Promise<ApplyGuardImagebaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyGuardImagebaseEx(request, headers, runtime);
  }

  /**
   * Description: 图片机审申请-基础版
   * Summary: 图片机审申请-基础版
   */
  async applyGuardImagebaseEx(request: ApplyGuardImagebaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyGuardImagebaseResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyGuardImagebaseResponse>(await this.doRequest("1.0", "aitech.comm.guard.imagebase.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyGuardImagebaseResponse({}));
  }

  /**
   * Description: 图片机审申请-增强版
   * Summary: 图片机审申请-增强版
   */
  async applyGuardImageadvanced(request: ApplyGuardImageadvancedRequest): Promise<ApplyGuardImageadvancedResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyGuardImageadvancedEx(request, headers, runtime);
  }

  /**
   * Description: 图片机审申请-增强版
   * Summary: 图片机审申请-增强版
   */
  async applyGuardImageadvancedEx(request: ApplyGuardImageadvancedRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyGuardImageadvancedResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyGuardImageadvancedResponse>(await this.doRequest("1.0", "aitech.comm.guard.imageadvanced.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyGuardImageadvancedResponse({}));
  }

  /**
   * Description: 文本机审申请-基础版
   * Summary: 文本机审申请-基础版
   */
  async applyGuardTextbase(request: ApplyGuardTextbaseRequest): Promise<ApplyGuardTextbaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyGuardTextbaseEx(request, headers, runtime);
  }

  /**
   * Description: 文本机审申请-基础版
   * Summary: 文本机审申请-基础版
   */
  async applyGuardTextbaseEx(request: ApplyGuardTextbaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyGuardTextbaseResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyGuardTextbaseResponse>(await this.doRequest("1.0", "aitech.comm.guard.textbase.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyGuardTextbaseResponse({}));
  }

  /**
   * Description: 视频机审查询-基础版
   * Summary: 视频机审查询-基础版
   */
  async queryGuardVideobase(request: QueryGuardVideobaseRequest): Promise<QueryGuardVideobaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGuardVideobaseEx(request, headers, runtime);
  }

  /**
   * Description: 视频机审查询-基础版
   * Summary: 视频机审查询-基础版
   */
  async queryGuardVideobaseEx(request: QueryGuardVideobaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGuardVideobaseResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGuardVideobaseResponse>(await this.doRequest("1.0", "aitech.comm.guard.videobase.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGuardVideobaseResponse({}));
  }

  /**
   * Description: 视频机审提交-基础版
   * Summary: 视频机审提交-基础版
   */
  async submitGuardVideobase(request: SubmitGuardVideobaseRequest): Promise<SubmitGuardVideobaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitGuardVideobaseEx(request, headers, runtime);
  }

  /**
   * Description: 视频机审提交-基础版
   * Summary: 视频机审提交-基础版
   */
  async submitGuardVideobaseEx(request: SubmitGuardVideobaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitGuardVideobaseResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitGuardVideobaseResponse>(await this.doRequest("1.0", "aitech.comm.guard.videobase.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitGuardVideobaseResponse({}));
  }

  /**
   * Description: 用于身份证、个人信息识别、防伪等
   * Summary: 图片光鉴识别链路
   */
  async applyGuardImagemultiply(request: ApplyGuardImagemultiplyRequest): Promise<ApplyGuardImagemultiplyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyGuardImagemultiplyEx(request, headers, runtime);
  }

  /**
   * Description: 用于身份证、个人信息识别、防伪等
   * Summary: 图片光鉴识别链路
   */
  async applyGuardImagemultiplyEx(request: ApplyGuardImagemultiplyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyGuardImagemultiplyResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyGuardImagemultiplyResponse>(await this.doRequest("1.0", "aitech.comm.guard.imagemultiply.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyGuardImagemultiplyResponse({}));
  }

  /**
   * Description: 输出文本风险检测
   * Summary: 输出文本风险检测
   */
  async checkGuardAnswer(request: CheckGuardAnswerRequest): Promise<CheckGuardAnswerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkGuardAnswerEx(request, headers, runtime);
  }

  /**
   * Description: 输出文本风险检测
   * Summary: 输出文本风险检测
   */
  async checkGuardAnswerEx(request: CheckGuardAnswerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckGuardAnswerResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckGuardAnswerResponse>(await this.doRequest("1.0", "aitech.comm.guard.answer.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckGuardAnswerResponse({}));
  }

  /**
   * Description: 美柚待审核信息提交
   * Summary: 美柚待审核信息提交
   */
  async submitMeiyouAudit(request: SubmitMeiyouAuditRequest): Promise<SubmitMeiyouAuditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitMeiyouAuditEx(request, headers, runtime);
  }

  /**
   * Description: 美柚待审核信息提交
   * Summary: 美柚待审核信息提交
   */
  async submitMeiyouAuditEx(request: SubmitMeiyouAuditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitMeiyouAuditResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitMeiyouAuditResponse>(await this.doRequest("1.0", "aitech.comm.meiyou.audit.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitMeiyouAuditResponse({}));
  }

  /**
   * Description: 查询美柚审核Agent节点信息
   * Summary: 查询美柚审核Agent节点信息
   */
  async queryMeiyouAgentaudit(request: QueryMeiyouAgentauditRequest): Promise<QueryMeiyouAgentauditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMeiyouAgentauditEx(request, headers, runtime);
  }

  /**
   * Description: 查询美柚审核Agent节点信息
   * Summary: 查询美柚审核Agent节点信息
   */
  async queryMeiyouAgentauditEx(request: QueryMeiyouAgentauditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMeiyouAgentauditResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMeiyouAgentauditResponse>(await this.doRequest("1.0", "aitech.comm.meiyou.agentaudit.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMeiyouAgentauditResponse({}));
  }

  /**
   * Description: 更新美柚审核Agent审核结果
   * Summary: 更新美柚审核Agent审核结果
   */
  async updateAicoguardcoreMeiyou(request: UpdateAicoguardcoreMeiyouRequest): Promise<UpdateAicoguardcoreMeiyouResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAicoguardcoreMeiyouEx(request, headers, runtime);
  }

  /**
   * Description: 更新美柚审核Agent审核结果
   * Summary: 更新美柚审核Agent审核结果
   */
  async updateAicoguardcoreMeiyouEx(request: UpdateAicoguardcoreMeiyouRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAicoguardcoreMeiyouResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAicoguardcoreMeiyouResponse>(await this.doRequest("1.0", "aitech.comm.aicoguardcore.meiyou.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAicoguardcoreMeiyouResponse({}));
  }

  /**
   * Description: 文档人审入审
   * Summary: 文档人审入审
   */
  async submitGuardDocument(request: SubmitGuardDocumentRequest): Promise<SubmitGuardDocumentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitGuardDocumentEx(request, headers, runtime);
  }

  /**
   * Description: 文档人审入审
   * Summary: 文档人审入审
   */
  async submitGuardDocumentEx(request: SubmitGuardDocumentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitGuardDocumentResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitGuardDocumentResponse>(await this.doRequest("1.0", "aitech.comm.guard.document.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitGuardDocumentResponse({}));
  }

  /**
   * Description: 文档人审查询
   * Summary: 文档人审查询
   */
  async queryGuardDocument(request: QueryGuardDocumentRequest): Promise<QueryGuardDocumentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGuardDocumentEx(request, headers, runtime);
  }

  /**
   * Description: 文档人审查询
   * Summary: 文档人审查询
   */
  async queryGuardDocumentEx(request: QueryGuardDocumentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGuardDocumentResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGuardDocumentResponse>(await this.doRequest("1.0", "aitech.comm.guard.document.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGuardDocumentResponse({}));
  }

}
