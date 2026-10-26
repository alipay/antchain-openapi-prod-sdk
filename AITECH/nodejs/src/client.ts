// This file is auto-generated, don't edit it
import AntchainUtil from '@antchain/alipay-util';
import Util, * as $Util from '@alicloud/tea-util';
import RPCUtil from '@alicloud/rpc-util';
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

// 二维码详情
export class QRCodeDetail extends $tea.Model {
  // 位置，Top、Left、Width、Height
  location: number[];
  // 二维码类型
  /**
   * @example
   * 二维码类型
   */
  type: string;
  // 二维码内容
  /**
   * @example
   * 二维码内容
   */
  content: string;
  // 置信度
  /**
   * @example
   * 置信度
   */
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
  /**
   * @example
   * LOGO类型
   */
  type: string;
  // 置信度
  /**
   * @example
   * 置信度
   */
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
  /**
   * @example
   * 123123
   */
  messageId: string;
  // 请求ID
  /**
   * @example
   * 4564546
   */
  requestId: string;
  // 会话ID
  /**
   * @example
   * 312414124
   */
  sessionId: string;
  // 应答内容
  /**
   * @example
   * 你可以问我信息安全的问题
   */
  answer: string;
  // 应答内容格式
  /**
   * @example
   * PLAINTEXT
   */
  answerFormat: string;
  // 是否回答结束
  /**
   * @example
   * true, false
   */
  answerEnd: boolean;
  // 是否问题有风险
  /**
   * @example
   * true, false
   */
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
  /**
   * @example
   * sex
   */
  label: string;
  // 检测到单个风险标签的置信度：66.25
  /**
   * @example
   * 66.25
   */
  probability: number;
  // 风险标签说明
  /**
   * @example
   * 疑似色情内容
   */
  description?: string;
  // 检测到的敏感词，多个词用逗号分隔，部分标签不会返回敏感词：AA,BB,CC
  /**
   * @example
   * AA,BB,CC
   */
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

// 攻击手法二级标签
export class AttackSubLabel extends $tea.Model {
  // 提示词攻击手法二级标签
  /**
   * @example
   * role_play：角色扮演
   */
  attackSubLabel?: string;
  static names(): { [key: string]: string } {
    return {
      attackSubLabel: 'attack_sub_label',
    };
  }

  static types(): { [key: string]: any } {
    return {
      attackSubLabel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 主题信息
export class MeiyouTopicWebInfo extends $tea.Model {
  // 内容文本
  /**
   * @example
   * 内容文本
   */
  content?: string;
  // 当前楼层
  /**
   * @example
   * 1
   */
  currentFloor?: number;
  // 回复楼层
  /**
   * @example
   * 1
   */
  callBackFloor?: number;
  // 发布时间戳(毫秒)
  // 
  publishTime?: number;
  // 图片URL数组(JSON字符串)
  /**
   * @example
   * {}
   */
  images?: string;
  // 用户昵称
  /**
   * @example
   * a
   */
  userNickname?: string;
  // 用户ID
  /**
   * @example
   * 1
   */
  userId?: string;
  // 用户类型
  // 
  /**
   * @example
   * q
   */
  userType?: string;
  // 用户头像URL
  /**
   * @example
   * http://test
   */
  userAvatar?: string;
  // 主题ID
  /**
   * @example
   * 1
   */
  topicId?: number;
  // 回复楼信息
  /**
   * @example
   * test
   */
  callBackFloorContent?: string;
  // oss存储地址
  /**
   * @example
   * {}
   */
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
  /**
   * @example
   * true, false
   */
  success: boolean;
  // 错误码
  /**
   * @example
   * 10002
   */
  errorCode: string;
  // 错误信息
  /**
   * @example
   * maya平台调用失败
   */
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

// 二级标签结构
export class SubLabelModel extends $tea.Model {
  // 二级标签
  /**
   * @example
   * 正常
   */
  subLabel: string;
  // 风险关键词列表
  riskWords?: string[];
  // 风险关键词索引列表
  riskWordsIndex?: string[];
  // 三级标签列表
  thirdLabels?: string[];
  static names(): { [key: string]: string } {
    return {
      subLabel: 'sub_label',
      riskWords: 'risk_words',
      riskWordsIndex: 'risk_words_index',
      thirdLabels: 'third_labels',
    };
  }

  static types(): { [key: string]: any } {
    return {
      subLabel: 'string',
      riskWords: { 'type': 'array', 'itemType': 'string' },
      riskWordsIndex: { 'type': 'array', 'itemType': 'string' },
      thirdLabels: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 提示词攻击手法二级标签
export class AttackSubLabelModel extends $tea.Model {
  // 提示词攻击手法二级标签
  /**
   * @example
   * jailbreak_attack
   */
  attackSubLabel?: string;
  static names(): { [key: string]: string } {
    return {
      attackSubLabel: 'attack_sub_label',
    };
  }

  static types(): { [key: string]: any } {
    return {
      attackSubLabel: 'string',
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

// 图像排黑排白检测结果
export class ImageBlackWhiteResult extends $tea.Model {
  // 是否命中（任一维度命中即 true）
  /**
   * @example
   * true
   */
  matched?: boolean;
  // 命中名单类型
  /**
   * @example
   * WHITE
   */
  matchType?: string;
  // 命中向量来源
  /**
   * @example
   * FULL_IMAGE
   */
  matchSource?: string;
  // 命中得分（ES 返回 score 经归一化后值）
  /**
   * @example
   * 1.1
   */
  matchScore?: number;
  // 命中所用阈值
  /**
   * @example
   * 1.1
   */
  matchThreshold?: number;
  // 命中图片 id
  /**
   * @example
   * 1
   */
  matchedImageId?: string;
  // 命中图库名称
  /**
   * @example
   * test
   */
  matchedLibraryName?: string;
  // 是否执行了全图维度（存在启用的全图库）
  /**
   * @example
   * true
   */
  executedFullImage?: boolean;
  // 是否执行了人脸维度（存在启用的人脸库）
  /**
   * @example
   * true
   */
  executedFace?: boolean;
  // 人脸检测结果
  /**
   * @example
   * true
   */
  faceDetected?: boolean;
  // 全图向量化状态
  /**
   * @example
   * SUCCESS
   */
  fullImageEmbedStatus?: string;
  // 人脸向量化状态
  /**
   * @example
   * SUCCESS
   */
  faceEmbedStatus?: string;
  // 全图维度 ES 最高分
  /**
   * @example
   * 1.2
   */
  fullImageTopScore?: number;
  // 全图维度阈值
  /**
   * @example
   * 1.2
   */
  fullImageThreshold?: number;
  // 人脸维度 ES 最高分
  /**
   * @example
   * 1.2
   */
  faceTopScore?: number;
  // 人脸维度阈值
  /**
   * @example
   * 1
   */
  faceThreshold?: number;
  // 是否降级
  /**
   * @example
   * true
   */
  degraded?: boolean;
  // 降级或短路原因
  /**
   * @example
   * 参数缺失
   */
  degradeReason?: string;
  static names(): { [key: string]: string } {
    return {
      matched: 'matched',
      matchType: 'match_type',
      matchSource: 'match_source',
      matchScore: 'match_score',
      matchThreshold: 'match_threshold',
      matchedImageId: 'matched_image_id',
      matchedLibraryName: 'matched_library_name',
      executedFullImage: 'executed_full_image',
      executedFace: 'executed_face',
      faceDetected: 'face_detected',
      fullImageEmbedStatus: 'full_image_embed_status',
      faceEmbedStatus: 'face_embed_status',
      fullImageTopScore: 'full_image_top_score',
      fullImageThreshold: 'full_image_threshold',
      faceTopScore: 'face_top_score',
      faceThreshold: 'face_threshold',
      degraded: 'degraded',
      degradeReason: 'degrade_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      matched: 'boolean',
      matchType: 'string',
      matchSource: 'string',
      matchScore: 'number',
      matchThreshold: 'number',
      matchedImageId: 'string',
      matchedLibraryName: 'string',
      executedFullImage: 'boolean',
      executedFace: 'boolean',
      faceDetected: 'boolean',
      fullImageEmbedStatus: 'string',
      faceEmbedStatus: 'string',
      fullImageTopScore: 'number',
      fullImageThreshold: 'number',
      faceTopScore: 'number',
      faceThreshold: 'number',
      degraded: 'boolean',
      degradeReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 领域信息
export class FieldModel extends $tea.Model {
  // 领域一级标签
  /**
   * @example
   * 金融
   */
  fieldCategory?: string;
  // 领域二级标签
  /**
   * @example
   * 金融
   */
  fieldLabel?: string;
  // 领域一级标签的等级分数
  fieldScore?: number;
  static names(): { [key: string]: string } {
    return {
      fieldCategory: 'field_category',
      fieldLabel: 'field_label',
      fieldScore: 'field_score',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fieldCategory: 'string',
      fieldLabel: 'string',
      fieldScore: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 美柚审核信息存储请求
export class MeiyouAuditSaveWebRequest extends $tea.Model {
  // 审核记录ID
  /**
   * @example
   * 1
   */
  auditId?: number;
  // 主题ID
  /**
   * @example
   * 1
   */
  topicId?: number;
  // 内容文本
  /**
   * @example
   * test
   */
  content?: string;
  // 发布时间戳(毫秒)
  /**
   * @example
   * 1
   */
  publishTime?: number;
  // 图片URL数组(JSON字符串)
  /**
   * @example
   * {}
   */
  images?: string;
  // 一级业务
  /**
   * @example
   * test
   */
  primaryBusiness?: string;
  // 二级业务
  /**
   * @example
   * 1
   */
  secondaryBusiness?: string;
  // 用户昵称
  /**
   * @example
   * 小蜜
   */
  userNickname?: string;
  // 用户ID
  /**
   * @example
   * 1
   */
  userId?: string;
  // 用户类型
  /**
   * @example
   * INIT
   */
  userType?: string;
  // 用户头像URL
  /**
   * @example
   * http://test
   */
  userAvatar?: string;
  // 操作人
  /**
   * @example
   * 小蜜
   */
  auditOperator?: string;
  // 审核楼
  /**
   * @example
   * 1
   */
  auditFloor?: number;
  // 版本
  /**
   * @example
   * 1
   */
  version?: string;
  // 主题信息
  /**
   * @example
   * {}
   */
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
  /**
   * @example
   * 5Okl4F2SNc9L2zrWCF8xZ+QPUyA=
   */
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

// 提示词攻击手法
export class AttackLabelModel extends $tea.Model {
  // 提示词攻击手法一级标签
  /**
   * @example
   * jailbreak_attack
   */
  attackLabel?: string;
  // 提示词攻击手法二级标签
  /**
   * @example
   * {}
   */
  attackSubLabels?: AttackSubLabelModel[];
  static names(): { [key: string]: string } {
    return {
      attackLabel: 'attack_label',
      attackSubLabels: 'attack_sub_labels',
    };
  }

  static types(): { [key: string]: any } {
    return {
      attackLabel: 'string',
      attackSubLabels: { 'type': 'array', 'itemType': AttackSubLabelModel },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 单次接口请求内的模型 token 汇总。
export class TokenUsageSummary extends $tea.Model {
  // 标识该对象是请求级汇总，便于 BI 侧过滤代理阶段日志。
  /**
   * @example
   * REQUEST
   */
  scope?: string;
  // 提示词token
  /**
   * @example
   * 1
   */
  promptTokens?: number;
  // 模型生成回答时输出的 token 数量
  /**
   * @example
   * 1
   */
  completionTokens?: number;
  // 总tokens
  /**
   * @example
   * 1
   */
  totalTokens?: number;
  // 护栏内部模型（含 Embedding）总 token。
  /**
   * @example
   * 1
   */
  guardTotalTokens?: number;
  // 代理转发的上游大模型总 token。
  /**
   * @example
   * 1
   */
  upstreamTotalTokens?: number;
  // 已实际发起的模型调用数，包括尚未返回的调用
  /**
   * @example
   * 1
   */
  modelCallCount?: number;
  // 能够确定 total_tokens 的模型调用数。
  /**
   * @example
   * 1
   */
  reportedCallCount?: number;
  // 已结束但无法确定 total_tokens 的模型调用数
  /**
   * @example
   * 1
   */
  unreportedCallCount?: number;
  // 当前快照时仍在执行的模型调用数。
  /**
   * @example
   * 1
   */
  inFlightCallCount?: number;
  // 仅当所有已发起调用都结束且均能确定 total_tokens，并且业务未发生提前返回时为 true。
  /**
   * @example
   * true
   */
  complete?: boolean;
  static names(): { [key: string]: string } {
    return {
      scope: 'scope',
      promptTokens: 'prompt_tokens',
      completionTokens: 'completion_tokens',
      totalTokens: 'total_tokens',
      guardTotalTokens: 'guard_total_tokens',
      upstreamTotalTokens: 'upstream_total_tokens',
      modelCallCount: 'model_call_count',
      reportedCallCount: 'reported_call_count',
      unreportedCallCount: 'unreported_call_count',
      inFlightCallCount: 'in_flight_call_count',
      complete: 'complete',
    };
  }

  static types(): { [key: string]: any } {
    return {
      scope: 'string',
      promptTokens: 'number',
      completionTokens: 'number',
      totalTokens: 'number',
      guardTotalTokens: 'number',
      upstreamTotalTokens: 'number',
      modelCallCount: 'number',
      reportedCallCount: 'number',
      unreportedCallCount: 'number',
      inFlightCallCount: 'number',
      complete: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 一级标签信息
export class LabelModel extends $tea.Model {
  // 一级标签
  /**
   * @example
   * 正常
   */
  label?: string;
  // 子标签
  subLabels?: SubLabelModel[];
  static names(): { [key: string]: string } {
    return {
      label: 'label',
      subLabels: 'sub_labels',
    };
  }

  static types(): { [key: string]: any } {
    return {
      label: 'string',
      subLabels: { 'type': 'array', 'itemType': SubLabelModel },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 文本同步审核结果
export class TextSyncAuditResult extends $tea.Model {
  // 任务id
  /**
   * @example
   * 123
   */
  taskId: string;
  // 数据Id
  /**
   * @example
   * 123
   */
  dataId: string;
  // 业务Id - 调用方透传
  /**
   * @example
   * 123
   */
  businessId: string;
  // 风险等级，根据设置的高低风险分返回，返回值包括： - high：高风险（若命中自定义词库，风险等级默认为高风险） - medium：中风险 - low：低风险 - none：未检测到风险
  /**
   * @example
   * high
   */
  riskLevel: string;
  // 审核标签列表
  /**
   * @example
   * [{"label":"sex", "probability":66.5, "description":"疑似色情内容", "riskWords":"AA,BB,CC"}]
   */
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
  /**
   * @example
   * 1
   */
  topicId?: number;
  // 审核记录ID
  /**
   * @example
   * 1
   */
  auditId: number;
  // 内容文本
  /**
   * @example
   * 小蜜
   */
  content?: string;
  // 发布时间戳(毫秒)
  publishTime?: number;
  // 图片URL数组(JSON字符串)
  /**
   * @example
   * {}
   */
  images?: string;
  // 一级业务
  /**
   * @example
   * 一级业务
   */
  primaryBusiness?: string;
  // 二级业务
  /**
   * @example
   * 二级业务
   */
  secondaryBusiness?: string;
  // 用户昵称
  /**
   * @example
   * 用户昵称
   */
  userNickname?: string;
  // 用户ID
  /**
   * @example
   * 用户ID
   */
  userId?: string;
  // 用户类型
  // 
  /**
   * @example
   * 用户类型
   */
  userType?: string;
  // 用户头像URL
  /**
   * @example
   * http://
   */
  userAvatar?: string;
  //  主题信息
  /**
   * @example
   *  主题信息
   */
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
  /**
   * @example
   * 任务ID
   */
  taskId: string;
  // 数据ID
  /**
   * @example
   * 数据ID
   */
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

// 提示词攻击手法一级标签
export class AttackLabel extends $tea.Model {
  // 提示词攻击手法一级标签
  /**
   * @example
   * jailbreak：越狱攻击
   */
  attackLabel?: string;
  // 提示词攻击手法二级标签列表
  attackSubLabels?: AttackSubLabel;
  static names(): { [key: string]: string } {
    return {
      attackLabel: 'attack_label',
      attackSubLabels: 'attack_sub_labels',
    };
  }

  static types(): { [key: string]: any } {
    return {
      attackLabel: 'string',
      attackSubLabels: AttackSubLabel,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 美柚审核信息
export class MeiyouAuditInfo extends $tea.Model {
  // 主键id
  /**
   * @example
   * 1
   */
  id: number;
  // 审核记录ID
  /**
   * @example
   * 1
   */
  auditId: number;
  // 主题ID
  /**
   * @example
   * 1
   */
  topicId?: number;
  // 内容文本
  /**
   * @example
   * 内容文本
   */
  content?: string;
  // 发布时间戳
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  publishTime?: string;
  // 图片URL数组(JSON字符串)
  /**
   * @example
   * {}
   */
  images?: string;
  // 一级业务
  /**
   * @example
   * 1
   */
  primaryBusiness?: string;
  // 二级业务
  /**
   * @example
   * 2
   */
  secondaryBusiness?: string;
  // 用户昵称
  /**
   * @example
   * 小蜜
   */
  userNickname?: string;
  // 用户ID
  /**
   * @example
   * 1
   */
  userId?: string;
  // 用户类型
  /**
   * @example
   * test
   */
  userType?: string;
  // 用户头像URL
  /**
   * @example
   * http://test
   */
  userAvatar?: string;
  // 审核结果
  /**
   * @example
   * OK
   */
  auditResult?: string;
  // 审核原因
  /**
   * @example
   * 30
   */
  auditReason?: string;
  // 审核原因
  /**
   * @example
   * test
   */
  auditReasonMsg?: string;
  // 操作人
  /**
   * @example
   * 小蜜
   */
  auditOperator?: string;
  // 操作时间戳
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  auditTime?: string;
  // oss 转存后的图像地址
  /**
   * @example
   * {}
   */
  ossImages?: string;
  // 创建时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  gmtCreate?: string;
  // 更新时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
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
  /**
   * @example
   * 1
   */
  id: number;
  // 审核记录ID
  /**
   * @example
   * 1
   */
  auditId?: string;
  // itag数据ID
  /**
   * @example
   * 1
   */
  itagDataId?: number;
  // 美柚任务审核结果推送状态
  /**
   * @example
   * INIT
   */
  meiyouAuditState?: string;
  // 审核不通过原因
  /**
   * @example
   * 34
   */
  refuseReson?: string;
  // 审核不通过图片序号
  /**
   * @example
   * ["1","2"]
   */
  refuseImages?: string;
  // 美柚itag关联状态
  /**
   * @example
   * 1
   */
  auditState?: string;
  // 美柚itag关联状态
  /**
   * @example
   * 1
   */
  topicState?: string;
  // 审核结果
  /**
   * @example
   * 1
   */
  auditResult?: string;
  // 审核人员
  /**
   * @example
   * 1
   */
  auditUser?: string;
  // 审核时间
  /**
   * @example
   * 1
   */
  auditTime?: number;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      auditId: 'audit_id',
      itagDataId: 'itag_data_id',
      meiyouAuditState: 'meiyou_audit_state',
      refuseReson: 'refuse_reson',
      refuseImages: 'refuse_images',
      auditState: 'audit_state',
      topicState: 'topic_state',
      auditResult: 'audit_result',
      auditUser: 'audit_user',
      auditTime: 'audit_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      auditId: 'string',
      itagDataId: 'number',
      meiyouAuditState: 'string',
      refuseReson: 'string',
      refuseImages: 'string',
      auditState: 'string',
      topicState: 'string',
      auditResult: 'string',
      auditUser: 'string',
      auditTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAdvisormarketDataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询类型STATION_LIST、STATION_DETAIL、REACHABLE_ROADS、VEHICLE_TYPE_DISTRIBUTION、ENTRY_FLOW、FRONT_FLOW、SURROUNDING_FLOW、NEW_ENTRY_VEHICLES、FREQUENT_ENTRY、INFREQUENT_ENTRY
  type: string;
  // 行政区名称，如“浙江省”、“杭州市”；type=STATION_LIST时必填
  region?: string;
  // 品牌清单筛选，如 ["中石油", "中石化"]；不传则返回所有品牌；仅 type=STATION_LIST 时生效
  brands?: string[];
  // 站点名称列表，支持批量查询；type 非 STATION_LIST 时必填
  names?: string[];
  // 起始日期，yyyy-MM-dd；时间类查询时必填
  startdate?: string;
  // 结束日期，yyyy-MM-dd；时间类查询时必填
  enddate?: string;
  // 最低进站次数阈值，默认 3；仅 type=FREQUENT_ENTRY 时生效
  mintimes?: string;
  // 最高进站次数阈值（不含），默认 3；仅 type=INFREQUENT_ENTRY 时生效
  maxtimes?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      type: 'type',
      region: 'region',
      brands: 'brands',
      names: 'names',
      startdate: 'startdate',
      enddate: 'enddate',
      mintimes: 'mintimes',
      maxtimes: 'maxtimes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      type: 'string',
      region: 'string',
      brands: { 'type': 'array', 'itemType': 'string' },
      names: { 'type': 'array', 'itemType': 'string' },
      startdate: 'string',
      enddate: 'string',
      mintimes: 'string',
      maxtimes: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAdvisormarketDataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码，"0" 表示成功，非 "0" 为失败
  code?: string;
  // 状态描述
  message?: string;
  // 请求追踪ID，用于问题排查
  requestid?: string;
  // 服务端响应时间戳（毫秒）
  timestamp?: string;
  // 业务数据 JSON 字符串，调用方需反序列化后使用，具体结构见各 type 定义
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      requestid: 'requestid',
      timestamp: 'timestamp',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      message: 'string',
      requestid: 'string',
      timestamp: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushAdvisormarketAnalysisRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 分析能力标识。当前仅支持 YINLI_CROWD_ANALYSIS。
  analysisType: string;
  // UTF-8 JSON 对象字符串，禁止二次编码。示例：{"city":"深圳","time_range":{"start_date":"2026-09-01","end_date":"2026-09-30"},"business_area":{"name":"中心商圈","aoi":{"geometry":{"type":"Polygon","coordinates":[[[114,22],[115,22],[114,23],[114,22]]]}},"reachable_aoi":{"geometry":{"type":"Polygon","coordinates":[[[113,21],[116,21],[113,24],[113,21]]]}}},"audience_path":"/a.txt.pgp"}。日期格式为 YYYY-MM-DD；两个 coordinates 均为闭合的 GeoJSON Polygon；audience_path 必须以 .txt.pgp 结尾。
  input: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      analysisType: 'analysis_type',
      input: 'input',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      analysisType: 'string',
      input: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushAdvisormarketAnalysisResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建成功后生成的任务唯一 ID。请保存该值，并在查询接口中作为 task_id 使用。
  taskId?: string;
  // 创建成功固定返回 QUEUED，表示任务已进入待人工处理队列，尚未产出分析结果。
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAdvisormarketAnalysisRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 创建接口返回的任务 ID。type=result 时必填；type=status 时用于精确查询，不能与 task_status 同时传入。
  taskId?: string;
  // 查询模式。status 查询状态或任务列表；result 查询指定成功任务的结果下载地址。可选值：status、result。
  type: string;
  // 状态列表筛选条件，仅在 type=status 且未传 task_id 时使用。可选值：QUEUED、PROCESSING、SUCCESS、FAILED；不要传 CLOSED。
  taskStatus?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskId: 'task_id',
      type: 'type',
      taskStatus: 'task_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskId: 'string',
      type: 'string',
      taskStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAdvisormarketAnalysisResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // JSON 数组字符串，调用方需再次解析。示例：[{"task_id":"ana_01K5A1B2","display_name":"中心商圈","analysis_type":"YINLI_CROWD_ANALYSIS","status":"PROCESSING","result_url":null,"created_at":"2026-09-14 15:30:00"}]。无数据返回 []；仅 SUCCESS 任务的结果查询会返回 result_url。
  data?: string;
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
      data: 'string',
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
  // 产品子业务场景ID
  subBusinessId?: string;
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
      subBusinessId: 'sub_business_id',
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
      subBusinessId: 'string',
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
  // 子业务场景
  subBusinessId?: string;
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
      subBusinessId: 'sub_business_id',
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
      subBusinessId: 'string',
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
  // 子业务场景
  subBusinessId?: string;
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
      subBusinessId: 'sub_business_id',
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
      subBusinessId: 'string',
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
  // 子业务场景ID
  subBusinessId?: string;
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
      subBusinessId: 'sub_business_id',
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
      subBusinessId: 'string',
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
  // 操作人
  auditOperators?: string[];
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
      auditOperators: 'audit_operators',
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
      auditOperators: { 'type': 'array', 'itemType': 'string' },
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

export class QuerySecurityQuestionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 调用方唯一标示
  enterprise?: string;
  // 提问内容
  question: string;
  // 调用方标示
  businessId: string;
  // 场景code
  sceneCode: string;
  // 标示是否是同一个
  messageId?: string;
  // 会话ID
  sessionId?: string;
  // 是否开启流式检测功能。默认值：N：不开启，Y：开启
  multiSessionDetect?: string;
  // 是否开启针对大模型输入文本的的安全改写和增强功能。默认值：N：不开启，Y：开启
  promptReword?: string;
  // 是否需要针对提问内容的进行金融合规检测。默认值：N：不开启，Y：开启
  financeComplianceDetection?: string;
  // 是否需要针对提问内容的进行领域识别
  fieldIdentify?: string;
  // 是否开启提示词攻击防御功能
  promptAttackDefense?: string;
  // 是否开启隐私数据泄露的专项检测
  privacyDataDetection?: string;
  // 是否开启安全代答功能
  securityAnswer?: string;
  // 自定义白库检测，默认开启，仅 N 关闭
  customWhiteCheck?: string;
  // 自定义黑词检测，默认开启，仅 N 关闭
  customBlackWordCheck?: string;
  // 前置知识库代答，默认开启，仅 N 关闭
  preSecurityAnswer?: string;
  // Universal/金融图谱案例召回，默认开启，仅 N 关闭
  graphCaseRecall?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      enterprise: 'enterprise',
      question: 'question',
      businessId: 'business_id',
      sceneCode: 'scene_code',
      messageId: 'message_id',
      sessionId: 'session_id',
      multiSessionDetect: 'multi_session_detect',
      promptReword: 'prompt_reword',
      financeComplianceDetection: 'finance_compliance_detection',
      fieldIdentify: 'field_identify',
      promptAttackDefense: 'prompt_attack_defense',
      privacyDataDetection: 'privacy_data_detection',
      securityAnswer: 'security_answer',
      customWhiteCheck: 'custom_white_check',
      customBlackWordCheck: 'custom_black_word_check',
      preSecurityAnswer: 'pre_security_answer',
      graphCaseRecall: 'graph_case_recall',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      enterprise: 'string',
      question: 'string',
      businessId: 'string',
      sceneCode: 'string',
      messageId: 'string',
      sessionId: 'string',
      multiSessionDetect: 'string',
      promptReword: 'string',
      financeComplianceDetection: 'string',
      fieldIdentify: 'string',
      promptAttackDefense: 'string',
      privacyDataDetection: 'string',
      securityAnswer: 'string',
      customWhiteCheck: 'string',
      customBlackWordCheck: 'string',
      preSecurityAnswer: 'string',
      graphCaseRecall: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySecurityQuestionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 代表风险等级和建议的处置结论，PASS：安全无风险，BLOCK：绝对风险，建议直接拦截，SECURITY_ANSWER：泛风险，回答内容存在敏感要素
  actionCode?: string;
  // 命中的自定义黑词列表
  customizeRiskWord?: string[];
  // 风险标签
  labels?: LabelModel[];
  // 会话Id
  sessionId?: string;
  // 表示是同一个Q&A
  messageId?: string;
  // 兜底话术
  limitAnswer?: string;
  // 有风险时的安全代答
  securityAnswer?: string;
  // 当请求参数 promptReword=Y 时返回，为安全改写后的内容
  securityPrompt?: string;
  // 提示词攻击手法标签
  attackLabels?: AttackLabel;
  // 领域标签信息
  fieldInfo?: FieldModel;
  // 安全代答匹配到的Q
  matchQ?: string;
  // 越狱手法标签
  jailbreakLabel?: string;
  // universal模型请求参数
  universalPrompt?: string;
  // universal模型返回结果
  universalOutput?: string;
  // 金融V3模型请求参数
  financePrompt?: string;
  // 金融V3模型返回结果
  financeOutput?: string;
  // 策略版本号
  strategyVersion?: string;
  // 本次接口请求内所有大模型及 Embedding 调用的 token 汇总。
  tokenUsage?: TokenUsageSummary;
  // 调试信息 对应的结果为Map转化的JSON字符串
  debugInfo?: string;
  // 金融合规深度审核——命中的风险点列表（JSON 数组字符串；仅深审开时返回，非深审场景不输出）
  findeepdiveResult?: string;
  // 金融合规深度审核——整体结论
  finDeepDiveOverall?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      actionCode: 'action_code',
      customizeRiskWord: 'customize_risk_word',
      labels: 'labels',
      sessionId: 'session_id',
      messageId: 'message_id',
      limitAnswer: 'limit_answer',
      securityAnswer: 'security_answer',
      securityPrompt: 'security_prompt',
      attackLabels: 'attack_labels',
      fieldInfo: 'field_info',
      matchQ: 'match_q',
      jailbreakLabel: 'jailbreak_label',
      universalPrompt: 'universal_prompt',
      universalOutput: 'universal_output',
      financePrompt: 'finance_prompt',
      financeOutput: 'finance_output',
      strategyVersion: 'strategy_version',
      tokenUsage: 'token_usage',
      debugInfo: 'debug_info',
      findeepdiveResult: 'findeepdive_result',
      finDeepDiveOverall: 'fin_deep_dive_overall',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      actionCode: 'string',
      customizeRiskWord: { 'type': 'array', 'itemType': 'string' },
      labels: { 'type': 'array', 'itemType': LabelModel },
      sessionId: 'string',
      messageId: 'string',
      limitAnswer: 'string',
      securityAnswer: 'string',
      securityPrompt: 'string',
      attackLabels: AttackLabel,
      fieldInfo: FieldModel,
      matchQ: 'string',
      jailbreakLabel: 'string',
      universalPrompt: 'string',
      universalOutput: 'string',
      financePrompt: 'string',
      financeOutput: 'string',
      strategyVersion: 'string',
      tokenUsage: TokenUsageSummary,
      debugInfo: 'string',
      findeepdiveResult: 'string',
      finDeepDiveOverall: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySecurityAnswerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 调用标示
  enterprise?: string;
  // 细分调用方标识
  businessId: string;
  // 当前回答内容，最大长度40000个字符
  content: string;
  // 场景code
  sceneCode: string;
  // 是否开启流式检测功能。默认值：N：不开启，Y：开启
  flowDetect?: string;
  // 会话id
  flowMsgId?: string;
  // 流失内容结束标示
  flowEnd?: string;
  // 表示是同一个Q&A
  messageId?: string;
  // 是否要针对大模型输出的内容中的隐私数据进行脱敏。默认值：N：不开启，Y：开启
  privacyDataObfuscation?: string;
  // 是否开启隐私数据泄露的专项检测（新字段，老privacy废弃）
  privacyDataDetection?: string;
  // 用户原提问（输出 max 接口必需，用于医疗合规检测送模型）
  question?: string;
  // 自定义白库检测，默认开启，仅 N 关闭
  customWhiteCheck?: string;
  // 自定义黑词检测，默认开启，仅 N 关闭
  customBlackWordCheck?: string;
  // Universal金融图谱案例召回，默认开启，仅 N 关闭
  graphCaseRecall?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      enterprise: 'enterprise',
      businessId: 'business_id',
      content: 'content',
      sceneCode: 'scene_code',
      flowDetect: 'flow_detect',
      flowMsgId: 'flow_msg_id',
      flowEnd: 'flow_end',
      messageId: 'message_id',
      privacyDataObfuscation: 'privacy_data_obfuscation',
      privacyDataDetection: 'privacy_data_detection',
      question: 'question',
      customWhiteCheck: 'custom_white_check',
      customBlackWordCheck: 'custom_black_word_check',
      graphCaseRecall: 'graph_case_recall',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      enterprise: 'string',
      businessId: 'string',
      content: 'string',
      sceneCode: 'string',
      flowDetect: 'string',
      flowMsgId: 'string',
      flowEnd: 'string',
      messageId: 'string',
      privacyDataObfuscation: 'string',
      privacyDataDetection: 'string',
      question: 'string',
      customWhiteCheck: 'string',
      customBlackWordCheck: 'string',
      graphCaseRecall: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySecurityAnswerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 代表风险等级和建议的处置结论，PASS：安全无风险，BLOCK：绝对风险，建议直接拦截，SECURITY_ANSWER：泛风险，回答内容存在敏感要素
  actionCode?: string;
  // 风险标签
  labels?: LabelModel[];
  // 命中的自定义黑词列表
  customizeRiskWord?: string[];
  // 针对流式输入的处理状态，针对流式输入的处理状态，当请求参数 flowDetect=Y 时返回，结果信息如下：
  // 1. processing：等待处理中，暂无风险检测结果，可能是输入的文本信息不足一句
  // 2. done：处理完成，请参考actionCode及对应的风险标签信息
  flowProcessState?: string;
  // 流式内容ID
  flowMsgId?: string;
  // 表示是同一个Q&A
  messageId?: string;
  // 兜底话术
  securityAnswer?: string;
  // universal模型请求参数
  universalPrompt?: string;
  // universal模型返回结果
  universalOutput?: string;
  // 金融V3模型请求参数
  financePrompt?: string;
  // 金融V3模型返回结果
  financeOutput?: string;
  // 策略版本号
  strategyVersion?: string;
  // 本次接口请求内所有大模型及 Embedding 调用的 token 汇总。
  tokenUsage?: TokenUsageSummary;
  // 调试信息（X-Debug-Mode: true 时返回；语音检测内含 audioAsrInfo 子结构） 
  // 对应的结果为Map转化的JSON字符串
  debugInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      actionCode: 'action_code',
      labels: 'labels',
      customizeRiskWord: 'customize_risk_word',
      flowProcessState: 'flow_process_state',
      flowMsgId: 'flow_msg_id',
      messageId: 'message_id',
      securityAnswer: 'security_answer',
      universalPrompt: 'universal_prompt',
      universalOutput: 'universal_output',
      financePrompt: 'finance_prompt',
      financeOutput: 'finance_output',
      strategyVersion: 'strategy_version',
      tokenUsage: 'token_usage',
      debugInfo: 'debug_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      actionCode: 'string',
      labels: { 'type': 'array', 'itemType': LabelModel },
      customizeRiskWord: { 'type': 'array', 'itemType': 'string' },
      flowProcessState: 'string',
      flowMsgId: 'string',
      messageId: 'string',
      securityAnswer: 'string',
      universalPrompt: 'string',
      universalOutput: 'string',
      financePrompt: 'string',
      financeOutput: 'string',
      strategyVersion: 'string',
      tokenUsage: TokenUsageSummary,
      debugInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySecurityImageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 调用方唯一标示
  enterprise?: string;
  // 租户id
  businessId: string;
  // 图片风险监测code
  sceneCode: string;
  // 标示是否是同一个Q&A
  messageId: string;
  // 待检测图片地址
  imageUrl: string;
  // 图片检测内容
  content?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      enterprise: 'enterprise',
      businessId: 'business_id',
      sceneCode: 'scene_code',
      messageId: 'message_id',
      imageUrl: 'image_url',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      enterprise: 'string',
      businessId: 'string',
      sceneCode: 'string',
      messageId: 'string',
      imageUrl: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySecurityImageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 代表风险等级和建议的处置结论
  actionCode?: string;
  // 排黑排白命中结果（命中时携带详细信息，未命中或未启用为 null）
  imageBlackWhiteResult?: ImageBlackWhiteResult;
  // 本次接口请求内所有大模型调用的 token 汇总。
  tokenUsage?: TokenUsageSummary;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      actionCode: 'action_code',
      imageBlackWhiteResult: 'image_black_white_result',
      tokenUsage: 'token_usage',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      actionCode: 'string',
      imageBlackWhiteResult: ImageBlackWhiteResult,
      tokenUsage: TokenUsageSummary,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadSecurityQuestionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // txt和pdf 文件
  fileUrl: string;
  // 归一化后须 question 前缀，否则兜底 LLM_INPUT_DETECTION
  sceneCode: string;
  // 租户标识（老值兼容替换）
  businessId: string;
  // 企业标识
  enterprise?: string;
  // 访问控制维度
  accountId?: string;
  // 消息 ID
  messageId?: string;
  // 多轮会话 ID
  sessionId?: string;
  // 多轮检测开关
  multiSessionDetect?: string;
  // 安全改写开关
  promptReword?: string;
  // 安全代答开关
  securityAnswer?: string;
  // 领域识别开关
  fieldIdentify?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileUrl: 'file_url',
      sceneCode: 'scene_code',
      businessId: 'business_id',
      enterprise: 'enterprise',
      accountId: 'account_id',
      messageId: 'message_id',
      sessionId: 'session_id',
      multiSessionDetect: 'multi_session_detect',
      promptReword: 'prompt_reword',
      securityAnswer: 'security_answer',
      fieldIdentify: 'field_identify',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileUrl: 'string',
      sceneCode: 'string',
      businessId: 'string',
      enterprise: 'string',
      accountId: 'string',
      messageId: 'string',
      sessionId: 'string',
      multiSessionDetect: 'string',
      promptReword: 'string',
      securityAnswer: 'string',
      fieldIdentify: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadSecurityQuestionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // PASS
  actionCode?: string;
  // 风险标签
  labels?: LabelModel[];
  // 命中自定义风险词
  customizeRiskWord?: string[];
  // 拒答话术
  limitAnswer?: string;
  // 回传消息 ID
  messageId?: string;
  // 知识库匹配提问
  matchQ?: string;
  // 安全代答内容
  securityAnswer?: string;
  // 安全提示
  securityPrompt?: string;
  // 越狱标签（旧字段）
  jailbreakLabel?: string;
  // 攻击标签
  attackLabels?: AttackLabelModel[];
  // 领域识别
  fieldInfo?: FieldModel;
  // 回传会话 ID
  sessionId?: string;
  // 本次接口请求内所有大模型及 Embedding 调用的 token 汇总。
  tokenUsage?: TokenUsageSummary;
  // ASR 转写文本
  transcribedText?: string;
  // 调试信息
  debugInfo?: string;
  // 金融深挖结果
  findeepdiveResult?: string;
  // 金融深挖总览
  finDeepDiveOverall?: string;
  // Universal 调试-提示词
  universalPrompt?: string;
  // Universal 调试-输出
  universalOutput?: string;
  // 金融调试-提示词
  financePrompt?: string;
  // 金融调试-输出
  financeOutput?: string;
  // 策略版本
  strategyVersion?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      actionCode: 'action_code',
      labels: 'labels',
      customizeRiskWord: 'customize_risk_word',
      limitAnswer: 'limit_answer',
      messageId: 'message_id',
      matchQ: 'match_q',
      securityAnswer: 'security_answer',
      securityPrompt: 'security_prompt',
      jailbreakLabel: 'jailbreak_label',
      attackLabels: 'attack_labels',
      fieldInfo: 'field_info',
      sessionId: 'session_id',
      tokenUsage: 'token_usage',
      transcribedText: 'transcribed_text',
      debugInfo: 'debug_info',
      findeepdiveResult: 'findeepdive_result',
      finDeepDiveOverall: 'fin_deep_dive_overall',
      universalPrompt: 'universal_prompt',
      universalOutput: 'universal_output',
      financePrompt: 'finance_prompt',
      financeOutput: 'finance_output',
      strategyVersion: 'strategy_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      actionCode: 'string',
      labels: { 'type': 'array', 'itemType': LabelModel },
      customizeRiskWord: { 'type': 'array', 'itemType': 'string' },
      limitAnswer: 'string',
      messageId: 'string',
      matchQ: 'string',
      securityAnswer: 'string',
      securityPrompt: 'string',
      jailbreakLabel: 'string',
      attackLabels: { 'type': 'array', 'itemType': AttackLabelModel },
      fieldInfo: FieldModel,
      sessionId: 'string',
      tokenUsage: TokenUsageSummary,
      transcribedText: 'string',
      debugInfo: 'string',
      findeepdiveResult: 'string',
      finDeepDiveOverall: 'string',
      universalPrompt: 'string',
      universalOutput: 'string',
      financePrompt: 'string',
      financeOutput: 'string',
      strategyVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadSecurityAnswerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // txt和pdf 文件
  fileUrl: string;
  // 须 answer 前缀，否则兜底 LLM_OUTPUT_DETECTION_LITE
  sceneCode: string;
  // 租户标识
  businessId: string;
  // 企业标识
  enterprise?: string;
  // 访问控制维度
  accountId?: string;
  // 消息 ID
  messageId?: string;
  // 流式消息 ID
  flowMsgId?: string;
  // 流式检测开关
  flowDetect?: string;
  // 流结束标记
  flowEnd?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileUrl: 'file_url',
      sceneCode: 'scene_code',
      businessId: 'business_id',
      enterprise: 'enterprise',
      accountId: 'account_id',
      messageId: 'message_id',
      flowMsgId: 'flow_msg_id',
      flowDetect: 'flow_detect',
      flowEnd: 'flow_end',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileUrl: 'string',
      sceneCode: 'string',
      businessId: 'string',
      enterprise: 'string',
      accountId: 'string',
      messageId: 'string',
      flowMsgId: 'string',
      flowDetect: 'string',
      flowEnd: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadSecurityAnswerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 四种动作码
  actionCode?: string;
  // 风险标签
  labels?: LabelModel[];
  // 命中自定义风险词
  customizeRiskWord?: string[];
  // 拒答话术
  limitAnswer?: string;
  // 回传
  messageId?: string;
  // 回传
  flowMsgId?: string;
  // 脱敏后内容
  obfuscationData?: string;
  // 流式处理状态（终态 done）
  flowProcessState?: string;
  // 调试字段
  universalPrompt?: string;
  // 调试字段
  universalOutput?: string;
  // 调试字段
  financePrompt?: string;
  // 调试字段
  financeOutput?: string;
  // 策略版本
  strategyVersion?: string;
  // token 用量
  tokenUsage?: TokenUsageSummary;
  // 调试信息
  debugInfo?: string;
  // ASR 转写文本
  transcribedText?: string;
  // 金融深挖结果
  findeepdiveResult?: string;
  // 金融深挖总览
  finDeepDiveOverall?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      actionCode: 'action_code',
      labels: 'labels',
      customizeRiskWord: 'customize_risk_word',
      limitAnswer: 'limit_answer',
      messageId: 'message_id',
      flowMsgId: 'flow_msg_id',
      obfuscationData: 'obfuscation_data',
      flowProcessState: 'flow_process_state',
      universalPrompt: 'universal_prompt',
      universalOutput: 'universal_output',
      financePrompt: 'finance_prompt',
      financeOutput: 'finance_output',
      strategyVersion: 'strategy_version',
      tokenUsage: 'token_usage',
      debugInfo: 'debug_info',
      transcribedText: 'transcribed_text',
      findeepdiveResult: 'findeepdive_result',
      finDeepDiveOverall: 'fin_deep_dive_overall',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      actionCode: 'string',
      labels: { 'type': 'array', 'itemType': LabelModel },
      customizeRiskWord: { 'type': 'array', 'itemType': 'string' },
      limitAnswer: 'string',
      messageId: 'string',
      flowMsgId: 'string',
      obfuscationData: 'string',
      flowProcessState: 'string',
      universalPrompt: 'string',
      universalOutput: 'string',
      financePrompt: 'string',
      financeOutput: 'string',
      strategyVersion: 'string',
      tokenUsage: TokenUsageSummary,
      debugInfo: 'string',
      transcribedText: 'string',
      findeepdiveResult: 'string',
      finDeepDiveOverall: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadSecurityImageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 直传或 PDF 逐页转图片
  fileUrl: string;
  // 归一化后须 image 前缀，否则拒绝
  sceneCode: string;
  // 租户标识
  businessId: string;
  // 企业标识
  enterprise?: string;
  // 访问控制维度
  accountId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileUrl: 'file_url',
      sceneCode: 'scene_code',
      businessId: 'business_id',
      enterprise: 'enterprise',
      accountId: 'account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileUrl: 'string',
      sceneCode: 'string',
      businessId: 'string',
      enterprise: 'string',
      accountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadSecurityImageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // PASS
  actionCode?: string;
  // 黑白库命中明细（18 字段）
  imageBlackWhiteResult?: ImageBlackWhiteResult;
  // token 用量（11 字段）
  tokenUsage?: TokenUsageSummary;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      actionCode: 'action_code',
      imageBlackWhiteResult: 'image_black_white_result',
      tokenUsage: 'token_usage',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      actionCode: 'string',
      imageBlackWhiteResult: ImageBlackWhiteResult,
      tokenUsage: TokenUsageSummary,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySecurityTextdetoxificationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 待祛毒语料文本
  question: string;
  // 租户标识
  businessId?: string;
  // 应用码
  appCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      question: 'question',
      businessId: 'business_id',
      appCode: 'app_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      question: 'string',
      businessId: 'string',
      appCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySecurityTextdetoxificationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否安全无风险
  safe?: boolean;
  // 一级风险分类
  riskCategory?: string;
  // 二级风险明细分类
  riskLabel?: string;
  // 风险分数
  riskScore?: number;
  // 风险关键词列表
  riskWords?: string[];
  // 关键词索引
  riskWordsIndex?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      safe: 'safe',
      riskCategory: 'risk_category',
      riskLabel: 'risk_label',
      riskScore: 'risk_score',
      riskWords: 'risk_words',
      riskWordsIndex: 'risk_words_index',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      safe: 'boolean',
      riskCategory: 'string',
      riskLabel: 'string',
      riskScore: 'number',
      riskWords: { 'type': 'array', 'itemType': 'string' },
      riskWordsIndex: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySecurityVideoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 视频公开访问 URL
  videoUrl: string;
  // 归一化后须 video 前缀，否则拒绝
  sceneCode: string;
  // 租户标识（老值兼容替换）
  businessId?: string;
  // 应用码
  appCode?: string;
  // 消息 ID
  messageId?: string;
  // 企业标识
  enterprise?: string;
  // 访问控制维度
  accountId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      videoUrl: 'video_url',
      sceneCode: 'scene_code',
      businessId: 'business_id',
      appCode: 'app_code',
      messageId: 'message_id',
      enterprise: 'enterprise',
      accountId: 'account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      videoUrl: 'string',
      sceneCode: 'string',
      businessId: 'string',
      appCode: 'string',
      messageId: 'string',
      enterprise: 'string',
      accountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySecurityVideoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // PASS/BLOCK
  actionCode?: string;
  // token 用量（11 字段）
  tokenUsage?: TokenUsageSummary;
  // 黑白库命中明细（18 字段）
  imageBlackWhiteResult?: ImageBlackWhiteResult;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      actionCode: 'action_code',
      tokenUsage: 'token_usage',
      imageBlackWhiteResult: 'image_black_white_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      actionCode: 'string',
      tokenUsage: TokenUsageSummary,
      imageBlackWhiteResult: ImageBlackWhiteResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadSecurityVideoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 视频文件 URL
  fileUrl: string;
  // 须 video 前缀
  sceneCode: string;
  // 租户标识
  businessId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileUrl: 'file_url',
      sceneCode: 'scene_code',
      businessId: 'business_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileUrl: 'string',
      sceneCode: 'string',
      businessId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadSecurityVideoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // PASS
  actionCode?: string;
  // 黑白库命中明细（18 字段）
  imageBlackWhiteResult?: ImageBlackWhiteResult;
  // token 用量（11 字段）
  tokenUsage?: TokenUsageSummary;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      actionCode: 'action_code',
      imageBlackWhiteResult: 'image_black_white_result',
      tokenUsage: 'token_usage',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      actionCode: 'string',
      imageBlackWhiteResult: ImageBlackWhiteResult,
      tokenUsage: TokenUsageSummary,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySecurityAudioRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 音频公网 URL
  audioUrl: string;
  // 缺省从 URL 后缀或 magic number 推断
  audioFormat?: string;
  // Boolean 降噪（null 时服务端默认 true）
  denoise?: string;
  // 须 audio 前缀，
  sceneCode: string;
  // 租户标识（老值兼容替换）
  businessId: string;
  // 应用码
  appCode?: string;
  // 消息 ID
  messageId?: string;
  // 企业标识
  enterprise?: string;
  // 访问控制维度
  accountId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      audioUrl: 'audio_url',
      audioFormat: 'audio_format',
      denoise: 'denoise',
      sceneCode: 'scene_code',
      businessId: 'business_id',
      appCode: 'app_code',
      messageId: 'message_id',
      enterprise: 'enterprise',
      accountId: 'account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      audioUrl: 'string',
      audioFormat: 'string',
      denoise: 'string',
      sceneCode: 'string',
      businessId: 'string',
      appCode: 'string',
      messageId: 'string',
      enterprise: 'string',
      accountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySecurityAudioResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 检测结果,使用JSON字符串反馈给调用方,由对应的调用方进行解析使用
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

export class UploadSecurityAudioRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 音频文件 URL
  fileUrl: string;
  // 须 audio 前缀
  sceneCode: string;
  // 租户标识
  businessId: string;
  // 降噪开关
  denoise?: string;
  // 音频格式
  audioFormat?: string;
  // 消息 ID
  messageId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileUrl: 'file_url',
      sceneCode: 'scene_code',
      businessId: 'business_id',
      denoise: 'denoise',
      audioFormat: 'audio_format',
      messageId: 'message_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileUrl: 'string',
      sceneCode: 'string',
      businessId: 'string',
      denoise: 'string',
      audioFormat: 'string',
      messageId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadSecurityAudioResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 检测结果,使用JSON字符串反馈给调用方,由对应的调用方进行解析使用
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
          sdk_version: "1.1.70",
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
   * @remarks
   * Description: 客户统计结果查询
   * Summary: 客户统计结果查询
   */
  async queryAdvisormarketData(request: QueryAdvisormarketDataRequest): Promise<QueryAdvisormarketDataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAdvisormarketDataEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 客户统计结果查询
   * Summary: 客户统计结果查询
   */
  async queryAdvisormarketDataEx(request: QueryAdvisormarketDataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAdvisormarketDataResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAdvisormarketDataResponse>(await this.doRequest("1.0", "aitech.comm.advisormarket.data.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAdvisormarketDataResponse({}));
  }

  /**
   * @remarks
   * Description: 创建异步商圈客群分析任务。接口仅校验参数并创建 QUEUED 任务，不同步执行分析。请保存返回的 task_id，并使用查询接口查询状态或结果。
   * Summary: 创建异步商圈客群分析任务。接口仅校验参数并创建 QUEUED 任务，不同步执行分析。请保存返回的 task_id，并使用查询接口查询状态或结果。
   */
  async pushAdvisormarketAnalysis(request: PushAdvisormarketAnalysisRequest): Promise<PushAdvisormarketAnalysisResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushAdvisormarketAnalysisEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建异步商圈客群分析任务。接口仅校验参数并创建 QUEUED 任务，不同步执行分析。请保存返回的 task_id，并使用查询接口查询状态或结果。
   * Summary: 创建异步商圈客群分析任务。接口仅校验参数并创建 QUEUED 任务，不同步执行分析。请保存返回的 task_id，并使用查询接口查询状态或结果。
   */
  async pushAdvisormarketAnalysisEx(request: PushAdvisormarketAnalysisRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushAdvisormarketAnalysisResponse> {
    Util.validateModel(request);
    return $tea.cast<PushAdvisormarketAnalysisResponse>(await this.doRequest("1.0", "aitech.comm.advisormarket.analysis.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushAdvisormarketAnalysisResponse({}));
  }

  /**
   * @remarks
   * Description: 查询当前租户的异步商圈客群分析任务。
   * Summary: 查询当前租户的异步商圈客群分析任务。
   */
  async queryAdvisormarketAnalysis(request: QueryAdvisormarketAnalysisRequest): Promise<QueryAdvisormarketAnalysisResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAdvisormarketAnalysisEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询当前租户的异步商圈客群分析任务。
   * Summary: 查询当前租户的异步商圈客群分析任务。
   */
  async queryAdvisormarketAnalysisEx(request: QueryAdvisormarketAnalysisRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAdvisormarketAnalysisResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAdvisormarketAnalysisResponse>(await this.doRequest("1.0", "aitech.comm.advisormarket.analysis.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAdvisormarketAnalysisResponse({}));
  }

  /**
   * @remarks
   * Description: LOGO/二维码审核
   * Summary: LOGO/二维码审核
   */
  async applyAuditImage(request: ApplyAuditImageRequest): Promise<ApplyAuditImageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyAuditImageEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: LOGO/二维码审核
   * Summary: LOGO/二维码审核
   */
  async applyAuditImageEx(request: ApplyAuditImageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyAuditImageResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyAuditImageResponse>(await this.doRequest("1.0", "aitech.comm.audit.image.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyAuditImageResponse({}));
  }

  /**
   * @remarks
   * Description: 主站审核能力回调
   * Summary: 主站审核能力回调
   */
  async callbackSofaAudit(request: CallbackSofaAuditRequest): Promise<CallbackSofaAuditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackSofaAuditEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 主站审核能力回调
   * Summary: 主站审核能力回调
   */
  async callbackSofaAuditEx(request: CallbackSofaAuditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackSofaAuditResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackSofaAuditResponse>(await this.doRequest("1.0", "aitech.comm.sofa.audit.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackSofaAuditResponse({}));
  }

  /**
   * @remarks
   * Description: 文本审核入审
   * Summary: 文本审核入审
   */
  async submitAuditText(request: SubmitAuditTextRequest): Promise<SubmitAuditTextResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitAuditTextEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 文本审核入审
   * Summary: 文本审核入审
   */
  async submitAuditTextEx(request: SubmitAuditTextRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitAuditTextResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitAuditTextResponse>(await this.doRequest("1.0", "aitech.comm.audit.text.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitAuditTextResponse({}));
  }

  /**
   * @remarks
   * Description: 文本审核查询
   * Summary: 文本审核查询
   */
  async queryAuditText(request: QueryAuditTextRequest): Promise<QueryAuditTextResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAuditTextEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 文本审核查询
   * Summary: 文本审核查询
   */
  async queryAuditTextEx(request: QueryAuditTextRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAuditTextResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAuditTextResponse>(await this.doRequest("1.0", "aitech.comm.audit.text.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAuditTextResponse({}));
  }

  /**
   * @remarks
   * Description: 图片审核入审
   * Summary: 图片审核入审
   */
  async submitAuditImage(request: SubmitAuditImageRequest): Promise<SubmitAuditImageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitAuditImageEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 图片审核入审
   * Summary: 图片审核入审
   */
  async submitAuditImageEx(request: SubmitAuditImageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitAuditImageResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitAuditImageResponse>(await this.doRequest("1.0", "aitech.comm.audit.image.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitAuditImageResponse({}));
  }

  /**
   * @remarks
   * Description: 图片审核查询
   * Summary: 图片审核查询
   */
  async queryAuditImage(request: QueryAuditImageRequest): Promise<QueryAuditImageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAuditImageEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 图片审核查询
   * Summary: 图片审核查询
   */
  async queryAuditImageEx(request: QueryAuditImageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAuditImageResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAuditImageResponse>(await this.doRequest("1.0", "aitech.comm.audit.image.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAuditImageResponse({}));
  }

  /**
   * @remarks
   * Description: 音频审核入审
   * Summary: 音频审核入审
   */
  async submitAuditAudio(request: SubmitAuditAudioRequest): Promise<SubmitAuditAudioResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitAuditAudioEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 音频审核入审
   * Summary: 音频审核入审
   */
  async submitAuditAudioEx(request: SubmitAuditAudioRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitAuditAudioResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitAuditAudioResponse>(await this.doRequest("1.0", "aitech.comm.audit.audio.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitAuditAudioResponse({}));
  }

  /**
   * @remarks
   * Description: 音频审核查询
   * Summary: 音频审核查询
   */
  async queryAuditAudio(request: QueryAuditAudioRequest): Promise<QueryAuditAudioResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAuditAudioEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 音频审核查询
   * Summary: 音频审核查询
   */
  async queryAuditAudioEx(request: QueryAuditAudioRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAuditAudioResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAuditAudioResponse>(await this.doRequest("1.0", "aitech.comm.audit.audio.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAuditAudioResponse({}));
  }

  /**
   * @remarks
   * Description: 视频审核入审
   * Summary: 视频审核入审
   */
  async submitAuditVideo(request: SubmitAuditVideoRequest): Promise<SubmitAuditVideoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitAuditVideoEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 视频审核入审
   * Summary: 视频审核入审
   */
  async submitAuditVideoEx(request: SubmitAuditVideoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitAuditVideoResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitAuditVideoResponse>(await this.doRequest("1.0", "aitech.comm.audit.video.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitAuditVideoResponse({}));
  }

  /**
   * @remarks
   * Description: 视频审核查询
   * Summary: 视频审核查询
   */
  async queryAuditVideo(request: QueryAuditVideoRequest): Promise<QueryAuditVideoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAuditVideoEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 视频审核查询
   * Summary: 视频审核查询
   */
  async queryAuditVideoEx(request: QueryAuditVideoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAuditVideoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAuditVideoResponse>(await this.doRequest("1.0", "aitech.comm.audit.video.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAuditVideoResponse({}));
  }

  /**
   * @remarks
   * Description: 文本同步审核接口，调用阿里云内容安全审核增强版
   * Summary: 文本同步审核
   */
  async applyAuditText(request: ApplyAuditTextRequest): Promise<ApplyAuditTextResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyAuditTextEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 文本同步审核接口，调用阿里云内容安全审核增强版
   * Summary: 文本同步审核
   */
  async applyAuditTextEx(request: ApplyAuditTextRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyAuditTextResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyAuditTextResponse>(await this.doRequest("1.0", "aitech.comm.audit.text.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyAuditTextResponse({}));
  }

  /**
   * @remarks
   * Description: 同步接口，只调用机审能力
   * Summary: 图片机审基础版
   */
  async applyAuditImagebase(request: ApplyAuditImagebaseRequest): Promise<ApplyAuditImagebaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyAuditImagebaseEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 同步接口，只调用机审能力
   * Summary: 图片机审基础版
   */
  async applyAuditImagebaseEx(request: ApplyAuditImagebaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyAuditImagebaseResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyAuditImagebaseResponse>(await this.doRequest("1.0", "aitech.comm.audit.imagebase.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyAuditImagebaseResponse({}));
  }

  /**
   * @remarks
   * Description: 同步接口，只调用机审能力
   * Summary: 图片审核增强版
   */
  async applyAuditImageadvanced(request: ApplyAuditImageadvancedRequest): Promise<ApplyAuditImageadvancedResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyAuditImageadvancedEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 同步接口，只调用机审能力
   * Summary: 图片审核增强版
   */
  async applyAuditImageadvancedEx(request: ApplyAuditImageadvancedRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyAuditImageadvancedResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyAuditImageadvancedResponse>(await this.doRequest("1.0", "aitech.comm.audit.imageadvanced.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyAuditImageadvancedResponse({}));
  }

  /**
   * @remarks
   * Description: 异步接口，只调用机审能力
   * Summary: 音频审核通用版入审
   */
  async submitAuditAudiobase(request: SubmitAuditAudiobaseRequest): Promise<SubmitAuditAudiobaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitAuditAudiobaseEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 异步接口，只调用机审能力
   * Summary: 音频审核通用版入审
   */
  async submitAuditAudiobaseEx(request: SubmitAuditAudiobaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitAuditAudiobaseResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitAuditAudiobaseResponse>(await this.doRequest("1.0", "aitech.comm.audit.audiobase.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitAuditAudiobaseResponse({}));
  }

  /**
   * @remarks
   * Description: 异步接口，只调用机审能力
   * Summary: 音频审核通用版查询
   */
  async queryAuditAudiobase(request: QueryAuditAudiobaseRequest): Promise<QueryAuditAudiobaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAuditAudiobaseEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 异步接口，只调用机审能力
   * Summary: 音频审核通用版查询
   */
  async queryAuditAudiobaseEx(request: QueryAuditAudiobaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAuditAudiobaseResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAuditAudiobaseResponse>(await this.doRequest("1.0", "aitech.comm.audit.audiobase.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAuditAudiobaseResponse({}));
  }

  /**
   * @remarks
   * Description: 异步通知，只调用机审能力
   * Summary: 视频审核通用版入审
   */
  async submitAuditVideobase(request: SubmitAuditVideobaseRequest): Promise<SubmitAuditVideobaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitAuditVideobaseEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 异步通知，只调用机审能力
   * Summary: 视频审核通用版入审
   */
  async submitAuditVideobaseEx(request: SubmitAuditVideobaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitAuditVideobaseResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitAuditVideobaseResponse>(await this.doRequest("1.0", "aitech.comm.audit.videobase.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitAuditVideobaseResponse({}));
  }

  /**
   * @remarks
   * Description: 异步查询
   * Summary: 视频审核通用版查询
   */
  async queryAuditVideobase(request: QueryAuditVideobaseRequest): Promise<QueryAuditVideobaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAuditVideobaseEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 异步查询
   * Summary: 视频审核通用版查询
   */
  async queryAuditVideobaseEx(request: QueryAuditVideobaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAuditVideobaseResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAuditVideobaseResponse>(await this.doRequest("1.0", "aitech.comm.audit.videobase.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAuditVideobaseResponse({}));
  }

  /**
   * @remarks
   * Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
   * Summary: 阿里云内容审核回调
   */
  async callbackAliyunAudit(request: CallbackAliyunAuditRequest): Promise<CallbackAliyunAuditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackAliyunAuditEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
   * Summary: 阿里云内容审核回调
   */
  async callbackAliyunAuditEx(request: CallbackAliyunAuditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackAliyunAuditResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackAliyunAuditResponse>(await this.doRequest("1.0", "aitech.comm.aliyun.audit.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackAliyunAuditResponse({}));
  }

  /**
   * @remarks
   * Description: 外部文件转存
   * Summary: 文件转存接口
   */
  async transferAuditFile(request: TransferAuditFileRequest): Promise<TransferAuditFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.transferAuditFileEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 外部文件转存
   * Summary: 文件转存接口
   */
  async transferAuditFileEx(request: TransferAuditFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<TransferAuditFileResponse> {
    Util.validateModel(request);
    return $tea.cast<TransferAuditFileResponse>(await this.doRequest("1.0", "aitech.comm.audit.file.transfer", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new TransferAuditFileResponse({}));
  }

  /**
   * @remarks
   * Description: 文件下载接口
   * Summary: 文件下载接口
   */
  async downloadAuditFile(request: DownloadAuditFileRequest): Promise<DownloadAuditFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.downloadAuditFileEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 文件下载接口
   * Summary: 文件下载接口
   */
  async downloadAuditFileEx(request: DownloadAuditFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DownloadAuditFileResponse> {
    Util.validateModel(request);
    return $tea.cast<DownloadAuditFileResponse>(await this.doRequest("1.0", "aitech.comm.audit.file.download", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DownloadAuditFileResponse({}));
  }

  /**
   * @remarks
   * Description: 美柚待审核信息保存
   * Summary: 美柚待审核信息保存接口
   */
  async saveAuditMeiyou(request: SaveAuditMeiyouRequest): Promise<SaveAuditMeiyouResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveAuditMeiyouEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 美柚待审核信息保存
   * Summary: 美柚待审核信息保存接口
   */
  async saveAuditMeiyouEx(request: SaveAuditMeiyouRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveAuditMeiyouResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveAuditMeiyouResponse>(await this.doRequest("1.0", "aitech.comm.audit.meiyou.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveAuditMeiyouResponse({}));
  }

  /**
   * @remarks
   * Description: 美柚审核信息存储请求
   * Summary: 美柚审核信息存储请求
   */
  async updateAuditMeiyou(request: UpdateAuditMeiyouRequest): Promise<UpdateAuditMeiyouResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAuditMeiyouEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 美柚审核信息存储请求
   * Summary: 美柚审核信息存储请求
   */
  async updateAuditMeiyouEx(request: UpdateAuditMeiyouRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAuditMeiyouResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAuditMeiyouResponse>(await this.doRequest("1.0", "aitech.comm.audit.meiyou.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAuditMeiyouResponse({}));
  }

  /**
   * @remarks
   * Description: 美柚审核信息查询接口
   * Summary: 美柚审核信息查询接口
   */
  async queryMeiyouAudit(request: QueryMeiyouAuditRequest): Promise<QueryMeiyouAuditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMeiyouAuditEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 美柚审核信息查询接口
   * Summary: 美柚审核信息查询接口
   */
  async queryMeiyouAuditEx(request: QueryMeiyouAuditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMeiyouAuditResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMeiyouAuditResponse>(await this.doRequest("1.0", "aitech.comm.meiyou.audit.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMeiyouAuditResponse({}));
  }

  /**
   * @remarks
   * Description: 美柚主题信息查询接口
   * Summary: 美柚主题信息查询接口
   */
  async queryMeiyouAudittopic(request: QueryMeiyouAudittopicRequest): Promise<QueryMeiyouAudittopicResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMeiyouAudittopicEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 美柚主题信息查询接口
   * Summary: 美柚主题信息查询接口
   */
  async queryMeiyouAudittopicEx(request: QueryMeiyouAudittopicRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMeiyouAudittopicResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMeiyouAudittopicResponse>(await this.doRequest("1.0", "aitech.comm.meiyou.audittopic.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMeiyouAudittopicResponse({}));
  }

  /**
   * @remarks
   * Description: 更新美柚itag关联关系接口
   * Summary: 更新美柚itag关联关系接口
   */
  async updateMeiyouAudit(request: UpdateMeiyouAuditRequest): Promise<UpdateMeiyouAuditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateMeiyouAuditEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 更新美柚itag关联关系接口
   * Summary: 更新美柚itag关联关系接口
   */
  async updateMeiyouAuditEx(request: UpdateMeiyouAuditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateMeiyouAuditResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateMeiyouAuditResponse>(await this.doRequest("1.0", "aitech.comm.meiyou.audit.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateMeiyouAuditResponse({}));
  }

  /**
   * @remarks
   * Description: 查询美柚itag关联信息
   * Summary: 查询美柚itag关联信息
   */
  async queryMeiyouItagrelation(request: QueryMeiyouItagrelationRequest): Promise<QueryMeiyouItagrelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMeiyouItagrelationEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询美柚itag关联信息
   * Summary: 查询美柚itag关联信息
   */
  async queryMeiyouItagrelationEx(request: QueryMeiyouItagrelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMeiyouItagrelationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMeiyouItagrelationResponse>(await this.doRequest("1.0", "aitech.comm.meiyou.itagrelation.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMeiyouItagrelationResponse({}));
  }

  /**
   * @remarks
   * Description: 更新美柚itag关联信息
   * Summary: 更新美柚itag关联信息
   */
  async updateMeiyouItagrelation(request: UpdateMeiyouItagrelationRequest): Promise<UpdateMeiyouItagrelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateMeiyouItagrelationEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 更新美柚itag关联信息
   * Summary: 更新美柚itag关联信息
   */
  async updateMeiyouItagrelationEx(request: UpdateMeiyouItagrelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateMeiyouItagrelationResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateMeiyouItagrelationResponse>(await this.doRequest("1.0", "aitech.comm.meiyou.itagrelation.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateMeiyouItagrelationResponse({}));
  }

  /**
   * @remarks
   * Description: 美柚审核结果查询
   * Summary: 美柚审核结果查询
   */
  async queryMeiyouAuditresult(request: QueryMeiyouAuditresultRequest): Promise<QueryMeiyouAuditresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMeiyouAuditresultEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 美柚审核结果查询
   * Summary: 美柚审核结果查询
   */
  async queryMeiyouAuditresultEx(request: QueryMeiyouAuditresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMeiyouAuditresultResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMeiyouAuditresultResponse>(await this.doRequest("1.0", "aitech.comm.meiyou.auditresult.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMeiyouAuditresultResponse({}));
  }

  /**
   * @remarks
   * Description: 分页查询美柚审核信息接口
   * Summary: 分页查询美柚审核信息接口
   */
  async pagequeryMeiyouAudit(request: PagequeryMeiyouAuditRequest): Promise<PagequeryMeiyouAuditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryMeiyouAuditEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 分页查询美柚审核信息接口
   * Summary: 分页查询美柚审核信息接口
   */
  async pagequeryMeiyouAuditEx(request: PagequeryMeiyouAuditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryMeiyouAuditResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryMeiyouAuditResponse>(await this.doRequest("1.0", "aitech.comm.meiyou.audit.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryMeiyouAuditResponse({}));
  }

  /**
   * @remarks
   * Description: 美柚审核信息存储（仅itask）
   * Summary: 美柚审核信息存储（仅itask）
   */
  async submitAuditMeiyou(request: SubmitAuditMeiyouRequest): Promise<SubmitAuditMeiyouResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitAuditMeiyouEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 美柚审核信息存储（仅itask）
   * Summary: 美柚审核信息存储（仅itask）
   */
  async submitAuditMeiyouEx(request: SubmitAuditMeiyouRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitAuditMeiyouResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitAuditMeiyouResponse>(await this.doRequest("1.0", "aitech.comm.audit.meiyou.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitAuditMeiyouResponse({}));
  }

  /**
   * @remarks
   * Description: 文档人审入审
   * Summary: 文档人审入审
   */
  async submitAuditDocument(request: SubmitAuditDocumentRequest): Promise<SubmitAuditDocumentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitAuditDocumentEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 文档人审入审
   * Summary: 文档人审入审
   */
  async submitAuditDocumentEx(request: SubmitAuditDocumentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitAuditDocumentResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitAuditDocumentResponse>(await this.doRequest("1.0", "aitech.comm.audit.document.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitAuditDocumentResponse({}));
  }

  /**
   * @remarks
   * Description: 文档人审查询
   * Summary: 文档人审查询
   */
  async queryAuditDocument(request: QueryAuditDocumentRequest): Promise<QueryAuditDocumentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAuditDocumentEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 文档人审查询
   * Summary: 文档人审查询
   */
  async queryAuditDocumentEx(request: QueryAuditDocumentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAuditDocumentResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAuditDocumentResponse>(await this.doRequest("1.0", "aitech.comm.audit.document.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAuditDocumentResponse({}));
  }

  /**
   * @remarks
   * Description: 阿里云ADB调用接口
   * Summary: 阿里云ADB调用接口
   */
  async queryAicoguardcloudAdbsink(request: QueryAicoguardcloudAdbsinkRequest): Promise<QueryAicoguardcloudAdbsinkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAicoguardcloudAdbsinkEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 阿里云ADB调用接口
   * Summary: 阿里云ADB调用接口
   */
  async queryAicoguardcloudAdbsinkEx(request: QueryAicoguardcloudAdbsinkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAicoguardcloudAdbsinkResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAicoguardcloudAdbsinkResponse>(await this.doRequest("1.0", "aitech.comm.aicoguardcloud.adbsink.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAicoguardcloudAdbsinkResponse({}));
  }

  /**
   * @remarks
   * Description: 红色GPT流式调用网关接口
   * Summary: 红色GPT网关方式调用接口
   */
  async queryGuardcoreRedgpt(request: QueryGuardcoreRedgptRequest): Promise<QueryGuardcoreRedgptResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGuardcoreRedgptEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 红色GPT流式调用网关接口
   * Summary: 红色GPT网关方式调用接口
   */
  async queryGuardcoreRedgptEx(request: QueryGuardcoreRedgptRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGuardcoreRedgptResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGuardcoreRedgptResponse>(await this.doRequest("1.0", "aitech.comm.guardcore.redgpt.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGuardcoreRedgptResponse({}));
  }

  /**
   * @remarks
   * Description: 阿里云ADB调用接口
   * Summary: 阿里云ADB调用接口
   */
  async queryAicoguardAdbsink(request: QueryAicoguardAdbsinkRequest): Promise<QueryAicoguardAdbsinkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAicoguardAdbsinkEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 阿里云ADB调用接口
   * Summary: 阿里云ADB调用接口
   */
  async queryAicoguardAdbsinkEx(request: QueryAicoguardAdbsinkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAicoguardAdbsinkResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAicoguardAdbsinkResponse>(await this.doRequest("1.0", "aitech.comm.aicoguard.adbsink.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAicoguardAdbsinkResponse({}));
  }

  /**
   * @remarks
   * Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
   * Summary: 阿里云内容安全回调
   */
  async callbackGuardAliyun(request: CallbackGuardAliyunRequest): Promise<CallbackGuardAliyunResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackGuardAliyunEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
   * Summary: 阿里云内容安全回调
   */
  async callbackGuardAliyunEx(request: CallbackGuardAliyunRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackGuardAliyunResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackGuardAliyunResponse>(await this.doRequest("1.0", "aitech.comm.guard.aliyun.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackGuardAliyunResponse({}));
  }

  /**
   * @remarks
   * Description: 主站ITASK审核能力回调
   * Summary: 主站ITASK审核能力回调
   */
  async callbackGuardItask(request: CallbackGuardItaskRequest): Promise<CallbackGuardItaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackGuardItaskEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 主站ITASK审核能力回调
   * Summary: 主站ITASK审核能力回调
   */
  async callbackGuardItaskEx(request: CallbackGuardItaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackGuardItaskResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackGuardItaskResponse>(await this.doRequest("1.0", "aitech.comm.guard.itask.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackGuardItaskResponse({}));
  }

  /**
   * @remarks
   * Description: 音频人审查询
   * Summary: 音频人审查询
   */
  async queryGuardAudio(request: QueryGuardAudioRequest): Promise<QueryGuardAudioResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGuardAudioEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 音频人审查询
   * Summary: 音频人审查询
   */
  async queryGuardAudioEx(request: QueryGuardAudioRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGuardAudioResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGuardAudioResponse>(await this.doRequest("1.0", "aitech.comm.guard.audio.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGuardAudioResponse({}));
  }

  /**
   * @remarks
   * Description: 音频人审入审
   * Summary: 音频人审入审
   */
  async submitGuardAudio(request: SubmitGuardAudioRequest): Promise<SubmitGuardAudioResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitGuardAudioEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 音频人审入审
   * Summary: 音频人审入审
   */
  async submitGuardAudioEx(request: SubmitGuardAudioRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitGuardAudioResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitGuardAudioResponse>(await this.doRequest("1.0", "aitech.comm.guard.audio.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitGuardAudioResponse({}));
  }

  /**
   * @remarks
   * Description: 图片人审查询
   * Summary: 图片人审查询
   */
  async queryGuardImage(request: QueryGuardImageRequest): Promise<QueryGuardImageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGuardImageEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 图片人审查询
   * Summary: 图片人审查询
   */
  async queryGuardImageEx(request: QueryGuardImageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGuardImageResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGuardImageResponse>(await this.doRequest("1.0", "aitech.comm.guard.image.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGuardImageResponse({}));
  }

  /**
   * @remarks
   * Description: 图片人审入审
   * Summary: 图片人审入审
   */
  async submitGuardImage(request: SubmitGuardImageRequest): Promise<SubmitGuardImageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitGuardImageEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 图片人审入审
   * Summary: 图片人审入审
   */
  async submitGuardImageEx(request: SubmitGuardImageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitGuardImageResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitGuardImageResponse>(await this.doRequest("1.0", "aitech.comm.guard.image.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitGuardImageResponse({}));
  }

  /**
   * @remarks
   * Description: 文本人审查询
   * Summary: 文本人审查询
   */
  async queryGuardText(request: QueryGuardTextRequest): Promise<QueryGuardTextResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGuardTextEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 文本人审查询
   * Summary: 文本人审查询
   */
  async queryGuardTextEx(request: QueryGuardTextRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGuardTextResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGuardTextResponse>(await this.doRequest("1.0", "aitech.comm.guard.text.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGuardTextResponse({}));
  }

  /**
   * @remarks
   * Description: 文本人审提交
   * Summary: 文本人审提交
   */
  async submitGuardText(request: SubmitGuardTextRequest): Promise<SubmitGuardTextResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitGuardTextEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 文本人审提交
   * Summary: 文本人审提交
   */
  async submitGuardTextEx(request: SubmitGuardTextRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitGuardTextResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitGuardTextResponse>(await this.doRequest("1.0", "aitech.comm.guard.text.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitGuardTextResponse({}));
  }

  /**
   * @remarks
   * Description: 视频人审查询
   * Summary: 视频人审查询
   */
  async queryGuardVideo(request: QueryGuardVideoRequest): Promise<QueryGuardVideoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGuardVideoEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 视频人审查询
   * Summary: 视频人审查询
   */
  async queryGuardVideoEx(request: QueryGuardVideoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGuardVideoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGuardVideoResponse>(await this.doRequest("1.0", "aitech.comm.guard.video.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGuardVideoResponse({}));
  }

  /**
   * @remarks
   * Description: 视频人审提交
   * Summary: 视频人审提交
   */
  async submitGuardVideo(request: SubmitGuardVideoRequest): Promise<SubmitGuardVideoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitGuardVideoEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 视频人审提交
   * Summary: 视频人审提交
   */
  async submitGuardVideoEx(request: SubmitGuardVideoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitGuardVideoResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitGuardVideoResponse>(await this.doRequest("1.0", "aitech.comm.guard.video.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitGuardVideoResponse({}));
  }

  /**
   * @remarks
   * Description: 音频机审查询-基础版
   * Summary: 音频机审查询-基础版
   */
  async queryGuardAudiobase(request: QueryGuardAudiobaseRequest): Promise<QueryGuardAudiobaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGuardAudiobaseEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 音频机审查询-基础版
   * Summary: 音频机审查询-基础版
   */
  async queryGuardAudiobaseEx(request: QueryGuardAudiobaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGuardAudiobaseResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGuardAudiobaseResponse>(await this.doRequest("1.0", "aitech.comm.guard.audiobase.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGuardAudiobaseResponse({}));
  }

  /**
   * @remarks
   * Description: 音频机审入审-基础版
   * Summary: 音频机审入审-基础版
   */
  async submitGuardAudiobase(request: SubmitGuardAudiobaseRequest): Promise<SubmitGuardAudiobaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitGuardAudiobaseEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 音频机审入审-基础版
   * Summary: 音频机审入审-基础版
   */
  async submitGuardAudiobaseEx(request: SubmitGuardAudiobaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitGuardAudiobaseResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitGuardAudiobaseResponse>(await this.doRequest("1.0", "aitech.comm.guard.audiobase.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitGuardAudiobaseResponse({}));
  }

  /**
   * @remarks
   * Description: 图片机审申请-基础版
   * Summary: 图片机审申请-基础版
   */
  async applyGuardImagebase(request: ApplyGuardImagebaseRequest): Promise<ApplyGuardImagebaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyGuardImagebaseEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 图片机审申请-基础版
   * Summary: 图片机审申请-基础版
   */
  async applyGuardImagebaseEx(request: ApplyGuardImagebaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyGuardImagebaseResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyGuardImagebaseResponse>(await this.doRequest("1.0", "aitech.comm.guard.imagebase.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyGuardImagebaseResponse({}));
  }

  /**
   * @remarks
   * Description: 图片机审申请-增强版
   * Summary: 图片机审申请-增强版
   */
  async applyGuardImageadvanced(request: ApplyGuardImageadvancedRequest): Promise<ApplyGuardImageadvancedResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyGuardImageadvancedEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 图片机审申请-增强版
   * Summary: 图片机审申请-增强版
   */
  async applyGuardImageadvancedEx(request: ApplyGuardImageadvancedRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyGuardImageadvancedResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyGuardImageadvancedResponse>(await this.doRequest("1.0", "aitech.comm.guard.imageadvanced.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyGuardImageadvancedResponse({}));
  }

  /**
   * @remarks
   * Description: 文本机审申请-基础版
   * Summary: 文本机审申请-基础版
   */
  async applyGuardTextbase(request: ApplyGuardTextbaseRequest): Promise<ApplyGuardTextbaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyGuardTextbaseEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 文本机审申请-基础版
   * Summary: 文本机审申请-基础版
   */
  async applyGuardTextbaseEx(request: ApplyGuardTextbaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyGuardTextbaseResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyGuardTextbaseResponse>(await this.doRequest("1.0", "aitech.comm.guard.textbase.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyGuardTextbaseResponse({}));
  }

  /**
   * @remarks
   * Description: 视频机审查询-基础版
   * Summary: 视频机审查询-基础版
   */
  async queryGuardVideobase(request: QueryGuardVideobaseRequest): Promise<QueryGuardVideobaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGuardVideobaseEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 视频机审查询-基础版
   * Summary: 视频机审查询-基础版
   */
  async queryGuardVideobaseEx(request: QueryGuardVideobaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGuardVideobaseResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGuardVideobaseResponse>(await this.doRequest("1.0", "aitech.comm.guard.videobase.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGuardVideobaseResponse({}));
  }

  /**
   * @remarks
   * Description: 视频机审提交-基础版
   * Summary: 视频机审提交-基础版
   */
  async submitGuardVideobase(request: SubmitGuardVideobaseRequest): Promise<SubmitGuardVideobaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitGuardVideobaseEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 视频机审提交-基础版
   * Summary: 视频机审提交-基础版
   */
  async submitGuardVideobaseEx(request: SubmitGuardVideobaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitGuardVideobaseResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitGuardVideobaseResponse>(await this.doRequest("1.0", "aitech.comm.guard.videobase.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitGuardVideobaseResponse({}));
  }

  /**
   * @remarks
   * Description: 用于身份证、个人信息识别、防伪等
   * Summary: 图片光鉴识别链路
   */
  async applyGuardImagemultiply(request: ApplyGuardImagemultiplyRequest): Promise<ApplyGuardImagemultiplyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyGuardImagemultiplyEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 用于身份证、个人信息识别、防伪等
   * Summary: 图片光鉴识别链路
   */
  async applyGuardImagemultiplyEx(request: ApplyGuardImagemultiplyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyGuardImagemultiplyResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyGuardImagemultiplyResponse>(await this.doRequest("1.0", "aitech.comm.guard.imagemultiply.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyGuardImagemultiplyResponse({}));
  }

  /**
   * @remarks
   * Description: 输出文本风险检测
   * Summary: 输出文本风险检测
   */
  async checkGuardAnswer(request: CheckGuardAnswerRequest): Promise<CheckGuardAnswerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkGuardAnswerEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 输出文本风险检测
   * Summary: 输出文本风险检测
   */
  async checkGuardAnswerEx(request: CheckGuardAnswerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckGuardAnswerResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckGuardAnswerResponse>(await this.doRequest("1.0", "aitech.comm.guard.answer.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckGuardAnswerResponse({}));
  }

  /**
   * @remarks
   * Description: 美柚待审核信息提交
   * Summary: 美柚待审核信息提交
   */
  async submitMeiyouAudit(request: SubmitMeiyouAuditRequest): Promise<SubmitMeiyouAuditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitMeiyouAuditEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 美柚待审核信息提交
   * Summary: 美柚待审核信息提交
   */
  async submitMeiyouAuditEx(request: SubmitMeiyouAuditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitMeiyouAuditResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitMeiyouAuditResponse>(await this.doRequest("1.0", "aitech.comm.meiyou.audit.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitMeiyouAuditResponse({}));
  }

  /**
   * @remarks
   * Description: 查询美柚审核Agent节点信息
   * Summary: 查询美柚审核Agent节点信息
   */
  async queryMeiyouAgentaudit(request: QueryMeiyouAgentauditRequest): Promise<QueryMeiyouAgentauditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMeiyouAgentauditEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询美柚审核Agent节点信息
   * Summary: 查询美柚审核Agent节点信息
   */
  async queryMeiyouAgentauditEx(request: QueryMeiyouAgentauditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMeiyouAgentauditResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMeiyouAgentauditResponse>(await this.doRequest("1.0", "aitech.comm.meiyou.agentaudit.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMeiyouAgentauditResponse({}));
  }

  /**
   * @remarks
   * Description: 更新美柚审核Agent审核结果
   * Summary: 更新美柚审核Agent审核结果
   */
  async updateAicoguardcoreMeiyou(request: UpdateAicoguardcoreMeiyouRequest): Promise<UpdateAicoguardcoreMeiyouResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAicoguardcoreMeiyouEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 更新美柚审核Agent审核结果
   * Summary: 更新美柚审核Agent审核结果
   */
  async updateAicoguardcoreMeiyouEx(request: UpdateAicoguardcoreMeiyouRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAicoguardcoreMeiyouResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAicoguardcoreMeiyouResponse>(await this.doRequest("1.0", "aitech.comm.aicoguardcore.meiyou.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAicoguardcoreMeiyouResponse({}));
  }

  /**
   * @remarks
   * Description: 文档人审入审
   * Summary: 文档人审入审
   */
  async submitGuardDocument(request: SubmitGuardDocumentRequest): Promise<SubmitGuardDocumentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitGuardDocumentEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 文档人审入审
   * Summary: 文档人审入审
   */
  async submitGuardDocumentEx(request: SubmitGuardDocumentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitGuardDocumentResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitGuardDocumentResponse>(await this.doRequest("1.0", "aitech.comm.guard.document.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitGuardDocumentResponse({}));
  }

  /**
   * @remarks
   * Description: 文档人审查询
   * Summary: 文档人审查询
   */
  async queryGuardDocument(request: QueryGuardDocumentRequest): Promise<QueryGuardDocumentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGuardDocumentEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 文档人审查询
   * Summary: 文档人审查询
   */
  async queryGuardDocumentEx(request: QueryGuardDocumentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGuardDocumentResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGuardDocumentResponse>(await this.doRequest("1.0", "aitech.comm.guard.document.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGuardDocumentResponse({}));
  }

  /**
   * @remarks
   * Description: 天鉴SaaS提问检测
   * Summary: 天鉴SaaS提问检测
   */
  async querySecurityQuestion(request: QuerySecurityQuestionRequest): Promise<QuerySecurityQuestionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySecurityQuestionEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 天鉴SaaS提问检测
   * Summary: 天鉴SaaS提问检测
   */
  async querySecurityQuestionEx(request: QuerySecurityQuestionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySecurityQuestionResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySecurityQuestionResponse>(await this.doRequest("1.0", "aitech.comm.security.question.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySecurityQuestionResponse({}));
  }

  /**
   * @remarks
   * Description: 天鉴SaaS回答检测
   * Summary: 天鉴SaaS回答检测
   */
  async querySecurityAnswer(request: QuerySecurityAnswerRequest): Promise<QuerySecurityAnswerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySecurityAnswerEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 天鉴SaaS回答检测
   * Summary: 天鉴SaaS回答检测
   */
  async querySecurityAnswerEx(request: QuerySecurityAnswerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySecurityAnswerResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySecurityAnswerResponse>(await this.doRequest("1.0", "aitech.comm.security.answer.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySecurityAnswerResponse({}));
  }

  /**
   * @remarks
   * Description: 天鉴图片检测功能saas版本
   * Summary: 天鉴图片检测功能saas版本
   */
  async querySecurityImage(request: QuerySecurityImageRequest): Promise<QuerySecurityImageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySecurityImageEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 天鉴图片检测功能saas版本
   * Summary: 天鉴图片检测功能saas版本
   */
  async querySecurityImageEx(request: QuerySecurityImageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySecurityImageResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySecurityImageResponse>(await this.doRequest("1.0", "aitech.comm.security.image.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySecurityImageResponse({}));
  }

  /**
   * @remarks
   * Description: 提问检测-文件上传
   * Summary: 提问检测-文件上传
   */
  async uploadSecurityQuestion(request: UploadSecurityQuestionRequest): Promise<UploadSecurityQuestionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadSecurityQuestionEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 提问检测-文件上传
   * Summary: 提问检测-文件上传
   */
  async uploadSecurityQuestionEx(request: UploadSecurityQuestionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadSecurityQuestionResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadSecurityQuestionResponse>(await this.doRequest("1.0", "aitech.comm.security.question.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadSecurityQuestionResponse({}));
  }

  /**
   * @remarks
   * Description: 回答检测-文件上传
   * Summary: 回答检测-文件上传
   */
  async uploadSecurityAnswer(request: UploadSecurityAnswerRequest): Promise<UploadSecurityAnswerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadSecurityAnswerEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 回答检测-文件上传
   * Summary: 回答检测-文件上传
   */
  async uploadSecurityAnswerEx(request: UploadSecurityAnswerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadSecurityAnswerResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadSecurityAnswerResponse>(await this.doRequest("1.0", "aitech.comm.security.answer.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadSecurityAnswerResponse({}));
  }

  /**
   * @remarks
   * Description: 图片/PDF 检测-文件上传
   * Summary: 图片/PDF 检测-文件上传
   */
  async uploadSecurityImage(request: UploadSecurityImageRequest): Promise<UploadSecurityImageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadSecurityImageEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 图片/PDF 检测-文件上传
   * Summary: 图片/PDF 检测-文件上传
   */
  async uploadSecurityImageEx(request: UploadSecurityImageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadSecurityImageResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadSecurityImageResponse>(await this.doRequest("1.0", "aitech.comm.security.image.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadSecurityImageResponse({}));
  }

  /**
   * @remarks
   * Description: 语料祛毒
   * Summary: 语料祛毒
   */
  async querySecurityTextdetoxification(request: QuerySecurityTextdetoxificationRequest): Promise<QuerySecurityTextdetoxificationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySecurityTextdetoxificationEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 语料祛毒
   * Summary: 语料祛毒
   */
  async querySecurityTextdetoxificationEx(request: QuerySecurityTextdetoxificationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySecurityTextdetoxificationResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySecurityTextdetoxificationResponse>(await this.doRequest("1.0", "aitech.comm.security.textdetoxification.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySecurityTextdetoxificationResponse({}));
  }

  /**
   * @remarks
   * Description: 视频公开访问 URL
   * Summary: 视频公开访问 URL
   */
  async querySecurityVideo(request: QuerySecurityVideoRequest): Promise<QuerySecurityVideoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySecurityVideoEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 视频公开访问 URL
   * Summary: 视频公开访问 URL
   */
  async querySecurityVideoEx(request: QuerySecurityVideoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySecurityVideoResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySecurityVideoResponse>(await this.doRequest("1.0", "aitech.comm.security.video.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySecurityVideoResponse({}));
  }

  /**
   * @remarks
   * Description: 视频检测-文件上传
   * Summary: 视频检测-文件上传
   */
  async uploadSecurityVideo(request: UploadSecurityVideoRequest): Promise<UploadSecurityVideoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadSecurityVideoEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 视频检测-文件上传
   * Summary: 视频检测-文件上传
   */
  async uploadSecurityVideoEx(request: UploadSecurityVideoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadSecurityVideoResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadSecurityVideoResponse>(await this.doRequest("1.0", "aitech.comm.security.video.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadSecurityVideoResponse({}));
  }

  /**
   * @remarks
   * Description: 语音检测-JSON 模式
   * Summary: 语音检测-JSON 模式
   */
  async querySecurityAudio(request: QuerySecurityAudioRequest): Promise<QuerySecurityAudioResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySecurityAudioEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 语音检测-JSON 模式
   * Summary: 语音检测-JSON 模式
   */
  async querySecurityAudioEx(request: QuerySecurityAudioRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySecurityAudioResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySecurityAudioResponse>(await this.doRequest("1.0", "aitech.comm.security.audio.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySecurityAudioResponse({}));
  }

  /**
   * @remarks
   * Description: 语音检测-文件上传
   * Summary: 语音检测-文件上传
   */
  async uploadSecurityAudio(request: UploadSecurityAudioRequest): Promise<UploadSecurityAudioResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadSecurityAudioEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 语音检测-文件上传
   * Summary: 语音检测-文件上传
   */
  async uploadSecurityAudioEx(request: UploadSecurityAudioRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadSecurityAudioResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadSecurityAudioResponse>(await this.doRequest("1.0", "aitech.comm.security.audio.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadSecurityAudioResponse({}));
  }

}
