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

// 只计一次的请求级费用明细
export class RequestItems extends $tea.Model {
  // 规则编码
  /**
   * @example
   * 规则编码
   */
  priceRuleCode?: string;
  // 收费项编码
  /**
   * @example
   * 收费项编码
   */
  chargeItemCode?: string;
  // 计量指标类型
  /**
   * @example
   * 计量指标类型
   */
  metricType?: string;
  // 原始计量数量
  /**
   * @example
   * 原始计量数量
   */
  quantity?: string;
  // 免费额度
  /**
   * @example
   * 免费额度
   */
  freeQuota?: string;
  // 计费数量（扣除免费额度后的值）
  /**
   * @example
   * 计费数量（扣除免费额度后的值）
   */
  billableQuantity?: string;
  // 计费单位大小
  /**
   * @example
   * 计费单位大小
   */
  unitSize?: string;
  // 单价
  /**
   * @example
   * 单价
   */
  unitPrice?: string;
  // 币种
  /**
   * @example
   * 币种
   */
  currency?: string;
  // 单项金额
  /**
   * @example
   * 单项金额
   */
  amount?: string;
  static names(): { [key: string]: string } {
    return {
      priceRuleCode: 'price_rule_code',
      chargeItemCode: 'charge_item_code',
      metricType: 'metric_type',
      quantity: 'quantity',
      freeQuota: 'free_quota',
      billableQuantity: 'billable_quantity',
      unitSize: 'unit_size',
      unitPrice: 'unit_price',
      currency: 'currency',
      amount: 'amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      priceRuleCode: 'string',
      chargeItemCode: 'string',
      metricType: 'string',
      quantity: 'string',
      freeQuota: 'string',
      billableQuantity: 'string',
      unitSize: 'string',
      unitPrice: 'string',
      currency: 'string',
      amount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// content 内 type 为 image_url﻿、audio_url、video_url﻿ 所需要的 url
export class ContentUrl extends $tea.Model {
  // url
  /**
   * @example
   * www.test.com/123
   */
  url?: string;
  static names(): { [key: string]: string } {
    return {
      url: 'url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      url: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 生图任务， 图片 URL 列表
export class ImageUrlsList extends $tea.Model {
  // 图片 URL 列表
  imageUrls?: string[];
  static names(): { [key: string]: string } {
    return {
      imageUrls: 'image_urls',
    };
  }

  static types(): { [key: string]: any } {
    return {
      imageUrls: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 消耗
export class ChatUsage extends $tea.Model {
  // 输入 token 数
  /**
   * @example
   * 121212
   */
  promptTokens?: string;
  // 输出 token 数
  /**
   * @example
   * 1111
   */
  completionTokens?: string;
  // 总 token 数
  /**
   * @example
   * 121212
   */
  totalTokens?: string;
  // 本次调用实际消耗金额
  /**
   * @example
   * 11.01
   */
  originalPrice?: string;
  // 币种
  /**
   * @example
   * CNY
   */
  currency?: string;
  static names(): { [key: string]: string } {
    return {
      promptTokens: 'prompt_tokens',
      completionTokens: 'completion_tokens',
      totalTokens: 'total_tokens',
      originalPrice: 'original_price',
      currency: 'currency',
    };
  }

  static types(): { [key: string]: any } {
    return {
      promptTokens: 'string',
      completionTokens: 'string',
      totalTokens: 'string',
      originalPrice: 'string',
      currency: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 各输出单元的试算明细
export class UnitEstimates extends $tea.Model {
  // 从 0 开始，与请求的 units[] 顺序一致
  /**
   * @example
   * 1
   */
  unitIndex?: number;
  // 当前单元是否命中
  /**
   * @example
   * true
   */
  matched?: boolean;
  // 当前单元是否命中兜底规则
  /**
   * @example
   * true
   */
  fallback?: boolean;
  // 规则编码
  /**
   * @example
   * 规则编码
   */
  priceRuleCode?: string;
  // 规则版本
  /**
   * @example
   * 1
   */
  matchedRuleVersion?: number;
  // 规则名称
  /**
   * @example
   * 规则名称
   */
  ruleName?: string;
  // 规则优先级
  /**
   * @example
   * 1
   */
  priority?: number;
  // 费用明细
  /**
   * @example
   * undefined
   */
  items?: RequestItems[];
  // 当前单元金额
  /**
   * @example
   * 当前单元金额
   */
  amount?: string;
  // 未命中或部分命中时的提示
  /**
   * @example
   * 未命中或部分命中时的提示
   */
  message?: string;
  static names(): { [key: string]: string } {
    return {
      unitIndex: 'unit_index',
      matched: 'matched',
      fallback: 'fallback',
      priceRuleCode: 'price_rule_code',
      matchedRuleVersion: 'matched_rule_version',
      ruleName: 'rule_name',
      priority: 'priority',
      items: 'items',
      amount: 'amount',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      unitIndex: 'number',
      matched: 'boolean',
      fallback: 'boolean',
      priceRuleCode: 'string',
      matchedRuleVersion: 'number',
      ruleName: 'string',
      priority: 'number',
      items: { 'type': 'array', 'itemType': RequestItems },
      amount: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 音频消耗
export class AudioUsage extends $tea.Model {
  // 用量类型
  /**
   * @example
   * AUDIO_GENERATION
   */
  usageType?: string;
  // 计量单位
  /**
   * @example
   * SECOND
   */
  unit?: string;
  // 音频时长（秒）
  /**
   * @example
   * 10.6
   */
  durationSeconds?: string;
  // 音频数量
  /**
   * @example
   * 1
   */
  count?: number;
  // 本次音频生成的实际消耗金额（必返）
  /**
   * @example
   * 10.11
   */
  originalPrice?: string;
  // 币种
  /**
   * @example
   * CNY
   */
  currency?: string;
  static names(): { [key: string]: string } {
    return {
      usageType: 'usage_type',
      unit: 'unit',
      durationSeconds: 'duration_seconds',
      count: 'count',
      originalPrice: 'original_price',
      currency: 'currency',
    };
  }

  static types(): { [key: string]: any } {
    return {
      usageType: 'string',
      unit: 'string',
      durationSeconds: 'string',
      count: 'number',
      originalPrice: 'string',
      currency: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 非空内容列表，至少含文本或素材
export class ContentInfo extends $tea.Model {
  // 类型
  /**
   * @example
   * text
   */
  type: string;
  // type=text 时提供，文本
  /**
   * @example
   * 生成一只猫
   */
  text?: string;
  // type=image_url 时提供
  /**
   * @example
   * www.test.com/123
   */
  imageUrl?: ContentUrl;
  // type=audio_url 时提供
  /**
   * @example
   * www.test.com/123
   */
  audioUrl?: ContentUrl;
  // type=video_url 时提供
  /**
   * @example
   * www.test.com/123
   */
  videoUrl?: ContentUrl;
  // 角色
  /**
   * @example
   * reference_image
   */
  role?: string;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      text: 'text',
      imageUrl: 'image_url',
      audioUrl: 'audio_url',
      videoUrl: 'video_url',
      role: 'role',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      text: 'string',
      imageUrl: ContentUrl,
      audioUrl: ContentUrl,
      videoUrl: ContentUrl,
      role: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 视频生成返回
export class VideoUsage extends $tea.Model {
  // 用量类型
  /**
   * @example
   * VIDEO_GENERATION
   */
  usageType?: string;
  // 计量单位
  /**
   * @example
   * SECOND
   */
  unit?: string;
  // 视频时长（秒）
  /**
   * @example
   * 10
   */
  durationSeconds?: string;
  // 本次视频生成的实际消耗金额
  /**
   * @example
   * 0.11
   */
  originalPrice?: string;
  // 币种
  /**
   * @example
   * CNY
   */
  currency?: string;
  static names(): { [key: string]: string } {
    return {
      usageType: 'usage_type',
      unit: 'unit',
      durationSeconds: 'duration_seconds',
      originalPrice: 'original_price',
      currency: 'currency',
    };
  }

  static types(): { [key: string]: any } {
    return {
      usageType: 'string',
      unit: 'string',
      durationSeconds: 'string',
      originalPrice: 'string',
      currency: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 音频信息
export class AudioList extends $tea.Model {
  // 音频 URL 列表
  /**
   * @example
   * www.test.com/123
   */
  audioUrl?: string;
  // 音频格式
  /**
   * @example
   * wav
   */
  audioFormat?: string;
  // 处理后播放时长（秒）
  /**
   * @example
   * 10.6
   */
  durationSeconds?: string;
  static names(): { [key: string]: string } {
    return {
      audioUrl: 'audio_url',
      audioFormat: 'audio_format',
      durationSeconds: 'duration_seconds',
    };
  }

  static types(): { [key: string]: any } {
    return {
      audioUrl: 'string',
      audioFormat: 'string',
      durationSeconds: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 视频 URL（成功时返回）
export class VideoUrl extends $tea.Model {
  // 视频 URL（成功时返回）
  /**
   * @example
   * https://example.com/output.mp4
   */
  videoUrl?: string;
  static names(): { [key: string]: string } {
    return {
      videoUrl: 'video_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      videoUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 输出单元列表
export class PriceUnits extends $tea.Model {
  // 当前输出单元定价维度
  /**
   * @example
   * {"test":"1"}
   */
  dimensions?: string;
  // 当前输出单元计量指标
  /**
   * @example
   * {"test":"1"}
   */
  metrics?: string;
  static names(): { [key: string]: string } {
    return {
      dimensions: 'dimensions',
      metrics: 'metrics',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dimensions: 'string',
      metrics: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 附加信息
export class ExtraInfo extends $tea.Model {
  // 原厂任务ID
  /**
   * @example
   * xxx-xxx-xxx
   */
  originalTaskId?: string;
  // 原厂视频输出URL
  /**
   * @example
   * https://xxx
   */
  originalVideoUrl?: string;
  // 原厂响应体快照
  /**
   * @example
   * "{"task_id":"csg-xxx-xx"...}"
   */
  originalResponseSnapshot?: string;
  static names(): { [key: string]: string } {
    return {
      originalTaskId: 'original_task_id',
      originalVideoUrl: 'original_video_url',
      originalResponseSnapshot: 'original_response_snapshot',
    };
  }

  static types(): { [key: string]: any } {
    return {
      originalTaskId: 'string',
      originalVideoUrl: 'string',
      originalResponseSnapshot: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 处理失败时返回，包含 code / message
export class Error extends $tea.Model {
  // 错误码
  /**
   * @example
   * INVALID_PARAMETER
   */
  code?: string;
  // 错误信息
  /**
   * @example
   * 参数无效
   */
  message?: string;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 1
export class ImageUrl extends $tea.Model {
  // test
  /**
   * @example
   * undefined
   */
  imageUrl?: ContentUrl;
  static names(): { [key: string]: string } {
    return {
      imageUrl: 'image_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      imageUrl: ContentUrl,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 非空消息列表
export class ChatMessages extends $tea.Model {
  // 角色
  /**
   * @example
   * user
   */
  role: string;
  // 文本内容
  /**
   * @example
   * 文本内容
   */
  content: string;
  static names(): { [key: string]: string } {
    return {
      role: 'role',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      role: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用量数组
export class ImageUsage extends $tea.Model {
  // 用量类型
  /**
   * @example
   * IMAGE_GENERATION
   */
  usageType?: string;
  // 计量单位
  /**
   * @example
   * IMAGE_COUNT
   */
  unit?: string;
  // 图片张数
  /**
   * @example
   * 1
   */
  imageCount?: number;
  // 本次图片生成的实际消耗金额
  /**
   * @example
   * 10.11
   */
  originalPrice?: string;
  // 币种
  /**
   * @example
   * CNY
   */
  currency?: string;
  static names(): { [key: string]: string } {
    return {
      usageType: 'usage_type',
      unit: 'unit',
      imageCount: 'image_count',
      originalPrice: 'original_price',
      currency: 'currency',
    };
  }

  static types(): { [key: string]: any } {
    return {
      usageType: 'string',
      unit: 'string',
      imageCount: 'number',
      originalPrice: 'string',
      currency: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用量信息
export class Usage extends $tea.Model {
  // 分辨率
  /**
   * @example
   * 720p，1080p
   */
  resolution?: string;
  // 视频时长（单位：秒）
  /**
   * @example
   * 15
   */
  duration?: number;
  // 视频比例
  /**
   * @example
   * 16:9
   */
  ratio?: string;
  // 消耗 token 数
  /**
   * @example
   * 10800
   */
  completionTokens?: number;
  // 消耗credit数
  /**
   * @example
   * 7
   */
  completionCredits?: number;
  static names(): { [key: string]: string } {
    return {
      resolution: 'resolution',
      duration: 'duration',
      ratio: 'ratio',
      completionTokens: 'completion_tokens',
      completionCredits: 'completion_credits',
    };
  }

  static types(): { [key: string]: any } {
    return {
      resolution: 'string',
      duration: 'number',
      ratio: 'string',
      completionTokens: 'number',
      completionCredits: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushVideogenerationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 模型标识，如 ：doubao-seedance-2-0-260128
  model: string;
  // 文本提示词
  prompt?: string;
  // 图生视频参考图片 URL
  imageUrl?: string[];
  // 视频参考/续写时传入视频 URL
  videoUrl?: string[];
  // 参考音频URL列表
  audioUrl?: string[];
  // 比例
  ratio?: string;
  // 视频时长（秒）
  duration?: number;
  // 请求追踪 ID，用于幂等去重
  requestId?: string;
  // 扩展JSON
  ext?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      model: 'model',
      prompt: 'prompt',
      imageUrl: 'image_url',
      videoUrl: 'video_url',
      audioUrl: 'audio_url',
      ratio: 'ratio',
      duration: 'duration',
      requestId: 'request_id',
      ext: 'ext',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      model: 'string',
      prompt: 'string',
      imageUrl: { 'type': 'array', 'itemType': 'string' },
      videoUrl: { 'type': 'array', 'itemType': 'string' },
      audioUrl: { 'type': 'array', 'itemType': 'string' },
      ratio: 'string',
      duration: 'number',
      requestId: 'string',
      ext: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushVideogenerationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务 ID，后续查询结果通过此参数获取
  taskId?: string;
  // 任务状态：pending（等待中）、processing（处理中）、succeeded（已成功）、failed（已失败）
  status?: string;
  // 模型名称
  model?: string;
  // 扩展JSON
  ext?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      status: 'status',
      model: 'model',
      ext: 'ext',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      status: 'string',
      model: 'string',
      ext: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryVideogenerationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询的任务ID
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

export class QueryVideogenerationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务ID
  taskId?: string;
  // 任务状态
  status?: string;
  // 视频输出URL
  videoUrl?: string;
  // 错误码
  errorCode?: string;
  // 错误信息
  errorMessage?: string;
  // 用量信息
  usage?: Usage;
  // 附加信息
  extraInfo?: ExtraInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      status: 'status',
      videoUrl: 'video_url',
      errorCode: 'error_code',
      errorMessage: 'error_message',
      usage: 'usage',
      extraInfo: 'extra_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      status: 'string',
      videoUrl: 'string',
      errorCode: 'string',
      errorMessage: 'string',
      usage: Usage,
      extraInfo: ExtraInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadAssetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资产类型
  assetType: string;
  // 公网可访问的文件URL
  fileUrl: string;
  // 资产名称
  assetName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      assetType: 'asset_type',
      fileUrl: 'file_url',
      assetName: 'asset_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      assetType: 'string',
      fileUrl: 'string',
      assetName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadAssetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 资产ID
  assetId?: string;
  // 资产状态
  status?: string;
  // 资产类型
  assetType?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      assetId: 'asset_id',
      status: 'status',
      assetType: 'asset_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      assetId: 'string',
      status: 'string',
      assetType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAssetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资产ID
  assetId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      assetId: 'asset_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      assetId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAssetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 资产ID
  assetId?: string;
  // 资产状态
  status?: string;
  // 资产类型
  assetType?: string;
  // 资产类型
  assetUrl?: string;
  // 错误信息
  errorMessage?: string;
  // 错误码
  errorCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      assetId: 'asset_id',
      status: 'status',
      assetType: 'asset_type',
      assetUrl: 'asset_url',
      errorMessage: 'error_message',
      errorCode: 'error_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      assetId: 'string',
      status: 'string',
      assetType: 'string',
      assetUrl: 'string',
      errorMessage: 'string',
      errorCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadMaasAssetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 幂等标识，由客户端生成
  requestId: string;
  // 文件公网可访问 URL
  fileUrl: string;
  // 资产类型
  assetType: string;
  // 资产名称
  assetName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      requestId: 'request_id',
      fileUrl: 'file_url',
      assetType: 'asset_type',
      assetName: 'asset_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      requestId: 'string',
      fileUrl: 'string',
      assetType: 'string',
      assetName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadMaasAssetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 平台素材 ID
  assetId?: string;
  // 状态
  status?: string;
  // 资产类型
  assetType?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      assetId: 'asset_id',
      status: 'status',
      assetType: 'asset_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      assetId: 'string',
      status: 'string',
      assetType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMaasAssetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资产 ID
  assetId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      assetId: 'asset_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      assetId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMaasAssetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 资产 ID
  assetId?: string;
  // 状态
  status?: string;
  // 资产类型
  assetType?: string;
  // 资产访问 URL，仅在已取得可访问地址时返回
  url?: string;
  // 素材名称，可选
  name?: string;
  // 创建时间，Unix 秒级时间戳，可选
  createdAt?: string;
  // 更新时间，Unix 秒级时间戳，可选
  updatedAt?: string;
  // 处理失败时返回，包含 code / message
  error?: Error;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      assetId: 'asset_id',
      status: 'status',
      assetType: 'asset_type',
      url: 'url',
      name: 'name',
      createdAt: 'created_at',
      updatedAt: 'updated_at',
      error: 'error',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      assetId: 'string',
      status: 'string',
      assetType: 'string',
      url: 'string',
      name: 'string',
      createdAt: 'string',
      updatedAt: 'string',
      error: Error,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushMaasVideoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 幂等标识，由客户端生成
  requestId: string;
  // 视频模型编码
  model: string;
  // 类型
  capabilityType: string;
  // 非空内容列表，至少含文本或素材
  content: ContentInfo[];
  // 视频时长（秒）
  duration?: string;
  // 宽高比，如 16:9、9:16
  ratio?: string;
  // 分辨率，如 720P、1080P
  resolution?: string;
  // 是否生成音轨，默认 false
  generateAudio?: boolean;
  // 是否添加水印
  watermark?: boolean;
  // 扩展参数 JSON 字符串
  extParams?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      requestId: 'request_id',
      model: 'model',
      capabilityType: 'capability_type',
      content: 'content',
      duration: 'duration',
      ratio: 'ratio',
      resolution: 'resolution',
      generateAudio: 'generate_audio',
      watermark: 'watermark',
      extParams: 'ext_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      requestId: 'string',
      model: 'string',
      capabilityType: 'string',
      content: { 'type': 'array', 'itemType': ContentInfo },
      duration: 'string',
      ratio: 'string',
      resolution: 'string',
      generateAudio: 'boolean',
      watermark: 'boolean',
      extParams: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushMaasVideoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 视频任务 ID
  taskId?: string;
  // 任务状态
  status?: string;
  // 实际使用的模型
  model?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      status: 'status',
      model: 'model',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      status: 'string',
      model: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMaasVideoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 视频任务 ID
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

export class QueryMaasVideoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 视频任务 ID
  taskId?: string;
  // 任务状态
  status?: string;
  // 实际使用的模型
  model?: string;
  // 创建时间，Unix 秒级时间戳
  createdAt?: string;
  // 更新时间，Unix 秒级时间戳
  updatedAt?: string;
  // 视频 URL（成功时返回）
  content?: VideoUrl;
  // 视频时长（秒
  duration?: string;
  // 宽高比
  ratio?: string;
  // 分辨率
  resolution?: string;
  // 是否生成音轨
  generateAudio?: boolean;
  // 用量数组
  usage?: VideoUsage[];
  // 非标准化补充信息，JSON 字符串
  extraInfo?: string;
  // 失败时返回
  error?: Error;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      status: 'status',
      model: 'model',
      createdAt: 'created_at',
      updatedAt: 'updated_at',
      content: 'content',
      duration: 'duration',
      ratio: 'ratio',
      resolution: 'resolution',
      generateAudio: 'generate_audio',
      usage: 'usage',
      extraInfo: 'extra_info',
      error: 'error',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      status: 'string',
      model: 'string',
      createdAt: 'string',
      updatedAt: 'string',
      content: VideoUrl,
      duration: 'string',
      ratio: 'string',
      resolution: 'string',
      generateAudio: 'boolean',
      usage: { 'type': 'array', 'itemType': VideoUsage },
      extraInfo: 'string',
      error: Error,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushMaasImageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 幂等标识，由客户端生成
  requestId: string;
  // 图片模型编码
  model: string;
  // 类型
  capabilityType: string;
  // 生成模式
  generateMode?: string;
  // 图片生成或编辑提示词
  prompt: string;
  // 图片地址
  imageUrls?: string[];
  // 图片尺寸
  size?: string;
  // 图片张数
  n?: number;
  // 扩展参数 JSON 字符串
  extParams?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      requestId: 'request_id',
      model: 'model',
      capabilityType: 'capability_type',
      generateMode: 'generate_mode',
      prompt: 'prompt',
      imageUrls: 'image_urls',
      size: 'size',
      n: 'n',
      extParams: 'ext_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      requestId: 'string',
      model: 'string',
      capabilityType: 'string',
      generateMode: 'string',
      prompt: 'string',
      imageUrls: { 'type': 'array', 'itemType': 'string' },
      size: 'string',
      n: 'number',
      extParams: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushMaasImageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 图片任务 ID
  taskId?: string;
  // 任务状态
  status?: string;
  // 实际使用的模型
  model?: string;
  // 图片 URL 列表
  content?: ImageUrlsList;
  // 用量数组
  usage?: ImageUsage[];
  // 失败时返回
  error?: Error;
  // 非标准化补充信息，JSON 字符串
  extraInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      status: 'status',
      model: 'model',
      content: 'content',
      usage: 'usage',
      error: 'error',
      extraInfo: 'extra_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      status: 'string',
      model: 'string',
      content: ImageUrlsList,
      usage: { 'type': 'array', 'itemType': ImageUsage },
      error: Error,
      extraInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMaasImageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 图片任务 ID
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

export class QueryMaasImageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 图片任务 ID
  taskId?: string;
  // 任务状态
  status?: string;
  // 实际使用的模型
  model?: string;
  // 创建时间，Unix 秒级时间戳
  createdAt?: string;
  // 图片 URL 列表（成功时返回）
  content?: ImageUrlsList;
  // 用量数组
  usage?: ImageUsage[];
  // 非标准化补充信息，JSON 字符串
  extraInfo?: string;
  // 失败时返回
  error?: Error;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      status: 'status',
      model: 'model',
      createdAt: 'created_at',
      content: 'content',
      usage: 'usage',
      extraInfo: 'extra_info',
      error: 'error',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      status: 'string',
      model: 'string',
      createdAt: 'string',
      content: ImageUrlsList,
      usage: { 'type': 'array', 'itemType': ImageUsage },
      extraInfo: 'string',
      error: Error,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushMaasAudioRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 幂等标识，由客户端生成
  requestId: string;
  // 音频模型编码
  model: string;
  // 类型
  capabilityType: string;
  // 音频生成提示词
  prompt: string;
  // 需要朗读的文本，仅支持该参数的模型使用
  text?: string;
  // 音频链接，REFERENCE_TO_AUDIO 时非空
  audioUrls?: string[];
  // 图片链接，IMAGE_TO_AUDIO 时非空
  imageUrls?: string[];
  // 扩展参数 JSON 字符串，内容按模型扩展参数对象组织
  extParams?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      requestId: 'request_id',
      model: 'model',
      capabilityType: 'capability_type',
      prompt: 'prompt',
      text: 'text',
      audioUrls: 'audio_urls',
      imageUrls: 'image_urls',
      extParams: 'ext_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      requestId: 'string',
      model: 'string',
      capabilityType: 'string',
      prompt: 'string',
      text: 'string',
      audioUrls: { 'type': 'array', 'itemType': 'string' },
      imageUrls: { 'type': 'array', 'itemType': 'string' },
      extParams: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushMaasAudioResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 音频任务 ID
  taskId?: string;
  // 任务状态
  status?: string;
  // 实际使用的模型
  model?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      status: 'status',
      model: 'model',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      status: 'string',
      model: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMaasAudioRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 音频任务 ID
  taskId?: string;
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

export class QueryMaasAudioResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 音频任务 ID
  taskId?: string;
  // 任务状态
  status?: string;
  // 实际使用的模型
  model?: string;
  // 创建时间，Unix 秒级时间戳
  createdAt?: string;
  // 音频信息
  content?: AudioList[];
  // 用量
  usage?: AudioUsage[];
  // 非标准化补充信息，JSON 字符串
  extraInfo?: string;
  // 失败时返回
  error?: Error;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      status: 'status',
      model: 'model',
      createdAt: 'created_at',
      content: 'content',
      usage: 'usage',
      extraInfo: 'extra_info',
      error: 'error',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      status: 'string',
      model: 'string',
      createdAt: 'string',
      content: { 'type': 'array', 'itemType': AudioList },
      usage: { 'type': 'array', 'itemType': AudioUsage },
      extraInfo: 'string',
      error: Error,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecMaasChatsyncRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 幂等标识，由客户端生成
  requestId: string;
  // 文本模型编码
  model: string;
  // 非空消息列表
  messages: ChatMessages[];
  // 模型参数 JSON 字符串
  extParams?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      requestId: 'request_id',
      model: 'model',
      messages: 'messages',
      extParams: 'ext_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      requestId: 'string',
      model: 'string',
      messages: { 'type': 'array', 'itemType': ChatMessages },
      extParams: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecMaasChatsyncResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 本次模型调用 ID
  id?: string;
  // 实际使用的模型
  model?: string;
  // 完整文本
  content?: string;
  // 结束原因
  finishReason?: string;
  // 用量
  usage?: ChatUsage;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      id: 'id',
      model: 'model',
      content: 'content',
      finishReason: 'finish_reason',
      usage: 'usage',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      id: 'string',
      model: 'string',
      content: 'string',
      finishReason: 'string',
      usage: ChatUsage,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecMaasPriceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 模型名称
  modelName: string;
  // 请求级定价维度
  requestDimensions?: string;
  // 请求级计量指标
  requestMetrics?: string;
  // 输出单元列表
  units?: PriceUnits[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      modelName: 'model_name',
      requestDimensions: 'request_dimensions',
      requestMetrics: 'request_metrics',
      units: 'units',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      modelName: 'string',
      requestDimensions: 'string',
      requestMetrics: 'string',
      units: { 'type': 'array', 'itemType': PriceUnits },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecMaasPriceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 至少一个输出单元命中
  matched?: boolean;
  // 首个输出单元是否命中兜底规则
  fallback?: boolean;
  // 命中规则编码
  priceRuleCode?: string;
  // 规则版本
  matchedRuleVersion?: number;
  // 规则名称
  ruleName?: string;
  // 规则优先级
  priority?: number;
  // 只计一次的请求级费用明细
  requestItems?: RequestItems[];
  // 各输出单元的试算明细
  unitEstimates?: UnitEstimates[];
  // 试算总金额
  totalAmount?: string;
  // 币种
  currency?: string;
  // 未命中或部分命中时的提示
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      matched: 'matched',
      fallback: 'fallback',
      priceRuleCode: 'price_rule_code',
      matchedRuleVersion: 'matched_rule_version',
      ruleName: 'rule_name',
      priority: 'priority',
      requestItems: 'request_items',
      unitEstimates: 'unit_estimates',
      totalAmount: 'total_amount',
      currency: 'currency',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      matched: 'boolean',
      fallback: 'boolean',
      priceRuleCode: 'string',
      matchedRuleVersion: 'number',
      ruleName: 'string',
      priority: 'number',
      requestItems: { 'type': 'array', 'itemType': RequestItems },
      unitEstimates: { 'type': 'array', 'itemType': UnitEstimates },
      totalAmount: 'string',
      currency: 'string',
      message: 'string',
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
          sdk_version: "1.1.0",
          _prod_code: "CREATIVE",
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
   * Description: 内容创作平台-视频生成-推送
   * Summary: 内容创作平台-视频生成-推送
   */
  async pushVideogeneration(request: PushVideogenerationRequest): Promise<PushVideogenerationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushVideogenerationEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 内容创作平台-视频生成-推送
   * Summary: 内容创作平台-视频生成-推送
   */
  async pushVideogenerationEx(request: PushVideogenerationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushVideogenerationResponse> {
    Util.validateModel(request);
    return $tea.cast<PushVideogenerationResponse>(await this.doRequest("1.0", "antdigital.creative.videogeneration.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushVideogenerationResponse({}));
  }

  /**
   * @remarks
   * Description: 视频创作接口查询
   * Summary: 视频创作接口查询
   */
  async queryVideogeneration(request: QueryVideogenerationRequest): Promise<QueryVideogenerationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryVideogenerationEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 视频创作接口查询
   * Summary: 视频创作接口查询
   */
  async queryVideogenerationEx(request: QueryVideogenerationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryVideogenerationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryVideogenerationResponse>(await this.doRequest("1.0", "antdigital.creative.videogeneration.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryVideogenerationResponse({}));
  }

  /**
   * @remarks
   * Description: 资产上传接口
   * Summary: 资产上传接口
   */
  async uploadAsset(request: UploadAssetRequest): Promise<UploadAssetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadAssetEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 资产上传接口
   * Summary: 资产上传接口
   */
  async uploadAssetEx(request: UploadAssetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadAssetResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadAssetResponse>(await this.doRequest("1.0", "antdigital.creative.asset.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadAssetResponse({}));
  }

  /**
   * @remarks
   * Description: 资产查询接口
   * Summary: 资产查询接口
   */
  async queryAsset(request: QueryAssetRequest): Promise<QueryAssetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAssetEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 资产查询接口
   * Summary: 资产查询接口
   */
  async queryAssetEx(request: QueryAssetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAssetResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAssetResponse>(await this.doRequest("1.0", "antdigital.creative.asset.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAssetResponse({}));
  }

  /**
   * @remarks
   * Description: 上传资产
   * Summary: 上传资产
   */
  async uploadMaasAsset(request: UploadMaasAssetRequest): Promise<UploadMaasAssetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadMaasAssetEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 上传资产
   * Summary: 上传资产
   */
  async uploadMaasAssetEx(request: UploadMaasAssetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadMaasAssetResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadMaasAssetResponse>(await this.doRequest("1.0", "antdigital.creative.maas.asset.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadMaasAssetResponse({}));
  }

  /**
   * @remarks
   * Description: 查询资产
   * Summary: 查询资产
   */
  async queryMaasAsset(request: QueryMaasAssetRequest): Promise<QueryMaasAssetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMaasAssetEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询资产
   * Summary: 查询资产
   */
  async queryMaasAssetEx(request: QueryMaasAssetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMaasAssetResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMaasAssetResponse>(await this.doRequest("1.0", "antdigital.creative.maas.asset.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMaasAssetResponse({}));
  }

  /**
   * @remarks
   * Description: 创建视频任务
   * Summary: 创建视频任务
   */
  async pushMaasVideo(request: PushMaasVideoRequest): Promise<PushMaasVideoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushMaasVideoEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建视频任务
   * Summary: 创建视频任务
   */
  async pushMaasVideoEx(request: PushMaasVideoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushMaasVideoResponse> {
    Util.validateModel(request);
    return $tea.cast<PushMaasVideoResponse>(await this.doRequest("1.0", "antdigital.creative.maas.video.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushMaasVideoResponse({}));
  }

  /**
   * @remarks
   * Description: 查询视频任务
   * Summary: 查询视频任务
   */
  async queryMaasVideo(request: QueryMaasVideoRequest): Promise<QueryMaasVideoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMaasVideoEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询视频任务
   * Summary: 查询视频任务
   */
  async queryMaasVideoEx(request: QueryMaasVideoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMaasVideoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMaasVideoResponse>(await this.doRequest("1.0", "antdigital.creative.maas.video.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMaasVideoResponse({}));
  }

  /**
   * @remarks
   * Description: 生成图片
   * Summary: 生成图片
   */
  async pushMaasImage(request: PushMaasImageRequest): Promise<PushMaasImageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushMaasImageEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 生成图片
   * Summary: 生成图片
   */
  async pushMaasImageEx(request: PushMaasImageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushMaasImageResponse> {
    Util.validateModel(request);
    return $tea.cast<PushMaasImageResponse>(await this.doRequest("1.0", "antdigital.creative.maas.image.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushMaasImageResponse({}));
  }

  /**
   * @remarks
   * Description: 查询图片任务
   * Summary: 查询图片任务
   */
  async queryMaasImage(request: QueryMaasImageRequest): Promise<QueryMaasImageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMaasImageEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询图片任务
   * Summary: 查询图片任务
   */
  async queryMaasImageEx(request: QueryMaasImageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMaasImageResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMaasImageResponse>(await this.doRequest("1.0", "antdigital.creative.maas.image.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMaasImageResponse({}));
  }

  /**
   * @remarks
   * Description: 创建音频任务
   * Summary: 创建音频任务
   */
  async pushMaasAudio(request: PushMaasAudioRequest): Promise<PushMaasAudioResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushMaasAudioEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建音频任务
   * Summary: 创建音频任务
   */
  async pushMaasAudioEx(request: PushMaasAudioRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushMaasAudioResponse> {
    Util.validateModel(request);
    return $tea.cast<PushMaasAudioResponse>(await this.doRequest("1.0", "antdigital.creative.maas.audio.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushMaasAudioResponse({}));
  }

  /**
   * @remarks
   * Description: 查询音频任务
   * Summary: 查询音频任务
   */
  async queryMaasAudio(request: QueryMaasAudioRequest): Promise<QueryMaasAudioResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMaasAudioEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询音频任务
   * Summary: 查询音频任务
   */
  async queryMaasAudioEx(request: QueryMaasAudioRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMaasAudioResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMaasAudioResponse>(await this.doRequest("1.0", "antdigital.creative.maas.audio.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMaasAudioResponse({}));
  }

  /**
   * @remarks
   * Description: 文本同步调用
   * Summary: 文本同步调用
   */
  async execMaasChatsync(request: ExecMaasChatsyncRequest): Promise<ExecMaasChatsyncResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execMaasChatsyncEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 文本同步调用
   * Summary: 文本同步调用
   */
  async execMaasChatsyncEx(request: ExecMaasChatsyncRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecMaasChatsyncResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecMaasChatsyncResponse>(await this.doRequest("1.0", "antdigital.creative.maas.chatsync.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecMaasChatsyncResponse({}));
  }

  /**
   * @remarks
   * Description: 价格试算
   * Summary: 价格试算
   */
  async execMaasPrice(request: ExecMaasPriceRequest): Promise<ExecMaasPriceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execMaasPriceEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 价格试算
   * Summary: 价格试算
   */
  async execMaasPriceEx(request: ExecMaasPriceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecMaasPriceResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecMaasPriceResponse>(await this.doRequest("1.0", "antdigital.creative.maas.price.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecMaasPriceResponse({}));
  }

}
