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

// 转化数据条目
export class ConversionDataDTO extends $tea.Model {
  // 转化目标类型
  /**
   * @example
   * FORMBOOK
   */
  conversionType: string;
  // 目标转化量
  /**
   * @example
   * 100
   */
  conversionCount: number;
  static names(): { [key: string]: string } {
    return {
      conversionType: 'conversion_type',
      conversionCount: 'conversion_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      conversionType: 'string',
      conversionCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 文件结构
export class FileNode extends $tea.Model {
  // 可访问的文件链接
  /**
   * @example
   * http://xxxx
   */
  url: string;
  // 文件名
  /**
   * @example
   * xxxxx.pdf
   */
  name: string;
  static names(): { [key: string]: string } {
    return {
      url: 'url',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      url: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 媒体统计数据条目
export class StatisticalDataDTO extends $tea.Model {
  // 项目标识
  /**
   * @example
   * 2026072000000138312001
   */
  project: string;
  // 统计维度id
  /**
   * @example
   * 2026072000000138312001
   */
  dimensionId: string;
  // 时间维度
  /**
   * @example
   * hour
   */
  timePeriod: string;
  // 开始时间
  /**
   * @example
   * yyyy-MM-dd HH:mm
   */
  startTime: string;
  // 结束时间
  /**
   * @example
   * yyyy-MM-dd HH:mm
   */
  endTime: string;
  // 花费金额
  /**
   * @example
   * 6666.66
   */
  costMoney: string;
  // 曝光量
  /**
   * @example
   * 100
   */
  mediaImpressionCount: number;
  // 点击量
  /**
   * @example
   * 100
   */
  mediaClickCount: number;
  // 目标转化量相关数据
  /**
   * @example
   * undefined
   */
  conversionDataList: ConversionDataDTO[];
  static names(): { [key: string]: string } {
    return {
      project: 'project',
      dimensionId: 'dimension_id',
      timePeriod: 'time_period',
      startTime: 'start_time',
      endTime: 'end_time',
      costMoney: 'cost_money',
      mediaImpressionCount: 'media_impression_count',
      mediaClickCount: 'media_click_count',
      conversionDataList: 'conversion_data_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      project: 'string',
      dimensionId: 'string',
      timePeriod: 'string',
      startTime: 'string',
      endTime: 'string',
      costMoney: 'string',
      mediaImpressionCount: 'number',
      mediaClickCount: 'number',
      conversionDataList: { 'type': 'array', 'itemType': ConversionDataDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 被保人
export class Insured extends $tea.Model {
  // 被保人名称
  /**
   * @example
   * 李四
   */
  insuredName: string;
  // 被保人证件类型
  /**
   * @example
   * 01--居民身份证、03--营业执照
   */
  insuredCardType: string;
  // 被保人证件号码
  /**
   * @example
   * 123456789
   */
  insuredCardCode: string;
  // 被保人联系方式
  /**
   * @example
   * 123456789
   */
  insuredContactInfo?: string;
  static names(): { [key: string]: string } {
    return {
      insuredName: 'insured_name',
      insuredCardType: 'insured_card_type',
      insuredCardCode: 'insured_card_code',
      insuredContactInfo: 'insured_contact_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      insuredName: 'string',
      insuredCardType: 'string',
      insuredCardCode: 'string',
      insuredContactInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 投保人
export class Applicant extends $tea.Model {
  // 投保人名称
  /**
   * @example
   * 李三
   */
  applicantName: string;
  // 投保人证件类型
  /**
   * @example
   * 01--居民身份证、03--营业执照
   */
  applicantCardType: string;
  // 投保人证件号码
  /**
   * @example
   * xxxxxx
   */
  applicantCardCode: string;
  // 投保人联系方式
  /**
   * @example
   * 123456789
   */
  applicantContactInfo?: string;
  static names(): { [key: string]: string } {
    return {
      applicantName: 'applicant_name',
      applicantCardType: 'applicant_card_type',
      applicantCardCode: 'applicant_card_code',
      applicantContactInfo: 'applicant_contact_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      applicantName: 'string',
      applicantCardType: 'string',
      applicantCardCode: 'string',
      applicantContactInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 委托险种信息
export class EntrustGuaranteeProduct extends $tea.Model {
  // 保障失效时间
  /**
   * @example
   * 1733711492119
   */
  guaranteeExpiryDate: number;
  // 保障生效时间
  /**
   * @example
   * 1733711492119
   */
  guaranteeEffectiveDate: number;
  // 保险等待期结束时间
  /**
   * @example
   * 1733711492119
   */
  waitingPeriodDeadLine?: number;
  // 保单号
  /**
   * @example
   * xxxxx
   */
  policyNo?: string;
  // 平台定义产品码值
  /**
   * @example
   * 平台定义产品码值
   */
  guaranteeProductCode?: string;
  // 保险公司的产品code
  /**
   * @example
   * 保险公司的产品code
   */
  insuranceProductCode?: string;
  // 保险公司的产品描述
  /**
   * @example
   * 保险公司的产品描述
   */
  insuranceProductName?: string;
  static names(): { [key: string]: string } {
    return {
      guaranteeExpiryDate: 'guarantee_expiry_date',
      guaranteeEffectiveDate: 'guarantee_effective_date',
      waitingPeriodDeadLine: 'waiting_period_dead_line',
      policyNo: 'policy_no',
      guaranteeProductCode: 'guarantee_product_code',
      insuranceProductCode: 'insurance_product_code',
      insuranceProductName: 'insurance_product_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      guaranteeExpiryDate: 'number',
      guaranteeEffectiveDate: 'number',
      waitingPeriodDeadLine: 'number',
      policyNo: 'string',
      guaranteeProductCode: 'string',
      insuranceProductCode: 'string',
      insuranceProductName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 实时营销人群
export class RealtimeMktAudience extends $tea.Model {
  // 加密用户标识
  /**
   * @example
   * xxxxx
   */
  encryptedUserId: string;
  // 扩展信息
  /**
   * @example
   * {}
   */
  extInfo: string;
  static names(): { [key: string]: string } {
    return {
      encryptedUserId: 'encrypted_user_id',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      encryptedUserId: 'string',
      extInfo: 'string',
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

export class UploadAntcloudInsuranceMktFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 文件唯一id
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
  // 业务入参json格式字符串
  bizContent?: string;
  // 请求id，每一次请求保持唯一，若重复，则报错；
  requestId: string;
  // 产品编码，蚂蚁分配
  productCode: string;
  // 数据类型，
  // 营销人群底包--MKT_AUD_SRC，
  // 营销人群托管底包--MKT_AUD_HOSTING_SRC
  dataType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      bizContent: 'biz_content',
      requestId: 'request_id',
      productCode: 'product_code',
      dataType: 'data_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      bizContent: 'string',
      requestId: 'string',
      productCode: 'string',
      dataType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadAntcloudInsuranceMktFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求id
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackAntcloudInsuranceMktEffectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 请求id，每一次请求保持唯一；若重复，则更新原数据；
  requestId: string;
  // 项目ID，待蚂蚁分配
  projectId: string;
  // 营销模式，AI_HANGUP_SMS("AI挂短")，
  // AI_OFFICIAL_ACCOUNT("AI公众号"),
  // BPO_WECHAT("BPO企微"),
  // AI_BPO("AI_BPO")
  marketingMode?: string;
  // 投保特征短链
  insureShortUrl?: string;
  // 加密类型：MD5，32位[小]
  encryptionType: string;
  // 加密用户标识
  encryptedUserId: string;
  // 应以识别当前用户点击投保页面的唯一标识
  landingVisitId: string;
  // 用户点击进入页面时间（格式：yyyy-MM-dd HH:mm:ss）
  clickTime?: string;
  // 事件完成时间（yyyy-MM-dd HH:mm:ss）
  eventTime: string;
  // 节点类型
  nodeType: string;
  // 节点详细信息
  nodeInfo?: string;
  // 产品 ID
  productId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      requestId: 'request_id',
      projectId: 'project_id',
      marketingMode: 'marketing_mode',
      insureShortUrl: 'insure_short_url',
      encryptionType: 'encryption_type',
      encryptedUserId: 'encrypted_user_id',
      landingVisitId: 'landing_visit_id',
      clickTime: 'click_time',
      eventTime: 'event_time',
      nodeType: 'node_type',
      nodeInfo: 'node_info',
      productId: 'product_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      requestId: 'string',
      projectId: 'string',
      marketingMode: 'string',
      insureShortUrl: 'string',
      encryptionType: 'string',
      encryptedUserId: 'string',
      landingVisitId: 'string',
      clickTime: 'string',
      eventTime: 'string',
      nodeType: 'string',
      nodeInfo: 'string',
      productId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackAntcloudInsuranceMktEffectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求id
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackAntcloudInsuranceMktLiveeffectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 请求id，每一次请求保持唯一；若重复，则更新原数据；
  requestId: string;
  // 项目ID，待蚂蚁分配
  projectId: string;
  // 营销模式
  // LIVE_STREAMING("直播")
  // ADVERTISING_TRAFFIC（"广告投流")
  marketingMode: string;
  // 加密类型：MD5，32位[小]
  encryptionType?: string;
  // 加密用户标识
  encryptedUserId?: string;
  // 事件完成时间（yyyy-MM-dd HH:mm:ss）
  eventTime: string;
  // 节点类型
  nodeType: string;
  // 节点详细信息
  nodeInfo?: string;
  // 只需要传输母链
  landingPageUrl: string;
  // N	点击 ID，来自落地页 URL、小程序 path 的埋点
  clickId?: string;
  // 产品 ID-固定参数，与商品详情页的 H5 进行绑定
  // 或者通过埋点数据获取
  productId?: string;
  // 用户 IP
  ip?: string;
  // ua
  ua?: string;
  // 直播间号 - 动参，每日直播时添加至 URL
  liveRoomId?: string;
  // 直播间开播时间 - 动参（yyyy-MM-dd HH:mm:ss）
  liveStartTime?: string;
  // 扩展字段
  extInfo?: string;
  // 直播间开播场次-动参，每日每场直播时添加至 URl（唯一ID 生成规则：直播间 ID 后两位+开播时间的年（后两位）月日时分
  // 举例：若直播间 ID 为 kxz123456，开播时间为 2026-06-18 17：22，此时唯一 ID 为：562606181722
  // ）
  liveSessionId?: string;
  // 媒体渠道
  marketingChannel?: string;
  // 256	rta追踪 ID
  rtaTraceId?: string;
  // rta 实验 ID
  rtaExpId?: string;
  // RTB追踪ID
  rtbTraceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      requestId: 'request_id',
      projectId: 'project_id',
      marketingMode: 'marketing_mode',
      encryptionType: 'encryption_type',
      encryptedUserId: 'encrypted_user_id',
      eventTime: 'event_time',
      nodeType: 'node_type',
      nodeInfo: 'node_info',
      landingPageUrl: 'landing_page_url',
      clickId: 'click_id',
      productId: 'product_id',
      ip: 'ip',
      ua: 'ua',
      liveRoomId: 'live_room_id',
      liveStartTime: 'live_start_time',
      extInfo: 'ext_info',
      liveSessionId: 'live_session_id',
      marketingChannel: 'marketing_channel',
      rtaTraceId: 'rta_trace_id',
      rtaExpId: 'rta_exp_id',
      rtbTraceId: 'rtb_trace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      requestId: 'string',
      projectId: 'string',
      marketingMode: 'string',
      encryptionType: 'string',
      encryptedUserId: 'string',
      eventTime: 'string',
      nodeType: 'string',
      nodeInfo: 'string',
      landingPageUrl: 'string',
      clickId: 'string',
      productId: 'string',
      ip: 'string',
      ua: 'string',
      liveRoomId: 'string',
      liveStartTime: 'string',
      extInfo: 'string',
      liveSessionId: 'string',
      marketingChannel: 'string',
      rtaTraceId: 'string',
      rtaExpId: 'string',
      rtbTraceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackAntcloudInsuranceMktLiveeffectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求id
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyAntcloudInsuranceMktRealtimemktRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 请求id
  requestId: string;
  // 项目ID，待蚂蚁分配
  projectId: string;
  // 加密类型，MD5，32位[小]
  encryptionType: string;
  // 实时营销人群列表
  realtimeMktAudienceList: RealtimeMktAudience[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      requestId: 'request_id',
      projectId: 'project_id',
      encryptionType: 'encryption_type',
      realtimeMktAudienceList: 'realtime_mkt_audience_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      requestId: 'string',
      projectId: 'string',
      encryptionType: 'string',
      realtimeMktAudienceList: { 'type': 'array', 'itemType': RealtimeMktAudience },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyAntcloudInsuranceMktRealtimemktResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求id
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackAntcloudInsuranceMktMonitordataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 回传请求对应id
  requestId: string;
  // 监测数据回传数据类型，仅支持: POLICY_DATA（保单信息）, CANCELLATION_DATA（退保信息）, RENEWAL_DATA（续费信息）
  dataType: string;
  // 监测数据回传内容
  dataContent: string;
  // 与待传营销数据相关联的项目id 结合数科网关租户id进行鉴权
  projectId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      requestId: 'request_id',
      dataType: 'data_type',
      dataContent: 'data_content',
      projectId: 'project_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      requestId: 'string',
      dataType: 'string',
      dataContent: 'string',
      projectId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackAntcloudInsuranceMktMonitordataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 回传请求对应id
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackAntcloudInsuranceMktMediastatisticaldataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 请求id
  requestId: string;
  // 项目id
  projectId: string;
  // 数据渠道来源，广点通(gdt) / 巨量引擎(oceanengine) / 快手(kuaishou) / 百度(baidu)
  mediaSource: string;
  // 统计维度，区分账号（ACCOUNT） 、广告计划(ADVERTISEMENT) 、 素材（MATERIAL）
  dimension: string;
  // 统计数据
  statisticalDataList: StatisticalDataDTO[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      requestId: 'request_id',
      projectId: 'project_id',
      mediaSource: 'media_source',
      dimension: 'dimension',
      statisticalDataList: 'statistical_data_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      requestId: 'string',
      projectId: 'string',
      mediaSource: 'string',
      dimension: 'string',
      statisticalDataList: { 'type': 'array', 'itemType': StatisticalDataDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackAntcloudInsuranceMktMediastatisticaldataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求id
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackAntcloudInsuranceMktEffectsimpleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 请求id，每一次请求保持唯一；若重复，则更新原数据
  requestId: string;
  // 项目ID，待蚂蚁分配
  projectId: string;
  // 营销模式，枚举：LIVE_STREAMING-直播投流、ADVERTISING-广告投流、AI_WECHAT-AI企微、BPO_SHORT_HANG-BPO挂短、BPO_OFFICIAL_ACCOUNT-BPO公众号、SMS-短信
  marketingMode?: string;
  // 投保特征短链，挂短模式必填
  insureShortUrl?: string;
  // 加密类型：MD5，32位[小]
  encryptionType: string;
  // 加密用户标识
  encryptedUserId: string;
  // 用以识别当前用户点击投保页面的唯一标识
  landingVisitId: string;
  // 事件类型（节点类：LIVE_STREAMING_START/LIVE_STREAMING_END/FORM_SUBMIT/POLICY_ISSUE/PREMIUM_PAYMENT/UNDERWRITING；标签类：LABEL_SMS_SEND/LABEL_ADD/LABEL_RENEWAL_M2/LABEL_RENEWAL_M3/LABEL_INTENTION）
  nodeType: string;
  // 事件状态，节点类：0-未完成 1-已完成；标签类：支持1-X格式（X为标签值）
  nodeStatus: string;
  // 事件完成时间（yyyy-MM-dd HH:mm:ss）
  eventTime: string;
  // 扩展json字段，最大2048字符，用于传递isfrommy数据源、年化保费等扩展信息
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      requestId: 'request_id',
      projectId: 'project_id',
      marketingMode: 'marketing_mode',
      insureShortUrl: 'insure_short_url',
      encryptionType: 'encryption_type',
      encryptedUserId: 'encrypted_user_id',
      landingVisitId: 'landing_visit_id',
      nodeType: 'node_type',
      nodeStatus: 'node_status',
      eventTime: 'event_time',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      requestId: 'string',
      projectId: 'string',
      marketingMode: 'string',
      insureShortUrl: 'string',
      encryptionType: 'string',
      encryptedUserId: 'string',
      landingVisitId: 'string',
      nodeType: 'string',
      nodeStatus: 'string',
      eventTime: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackAntcloudInsuranceMktEffectsimpleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求id
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyAntcloudInsuranceMktserviceproviderAudiencecircleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 请求id，每一次请求保持唯一；
  requestId: string;
  // 项目ID，待蚂蚁分配
  projectId: string;
  // 业务场景标识
  bizScene: string;
  // 加密类型，MD5 32位小写
  encryptionType: string;
  // 加密用户标识
  encryptedUserIds: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      requestId: 'request_id',
      projectId: 'project_id',
      bizScene: 'biz_scene',
      encryptionType: 'encryption_type',
      encryptedUserIds: 'encrypted_user_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      requestId: 'string',
      projectId: 'string',
      bizScene: 'string',
      encryptionType: 'string',
      encryptedUserIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求id，每一次请求保持唯一；
  requestId?: string;
  // 批次号
  batchNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestId: 'request_id',
      batchNo: 'batch_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestId: 'string',
      batchNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntcloudInsuranceMktExtresulturlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 请求id，每一次请求保持唯一，若重复，则报错
  requestId: string;
  // 项目ID，蚂蚁分配
  projectId: string;
  // 上传营销标识，来源于上传结果通知中的uploadMktNo
  uploadMktNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      requestId: 'request_id',
      projectId: 'project_id',
      uploadMktNo: 'upload_mkt_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      requestId: 'string',
      projectId: 'string',
      uploadMktNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntcloudInsuranceMktExtresulturlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求id
  requestId: string;
  // 析出文件下载链接（OSS签名URL，当前有效期24小时）；为空表示析出结果尚未生成，请稍后重试。从底包上传开始7日内链接失效仍可继续获取
  fileUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestId: 'request_id',
      fileUrl: 'file_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestId: 'string',
      fileUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReceiveAntcloudInsuranceLeadOpportunitiesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // string
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
  // 请求id，每一次请求保持唯一，若重复，则报错；
  requestId: string;
  // 产品编码，蚂蚁分配
  productCode: string;
  // 业务入参json格式字符串
  bizContent?: string;
  // 固定值：PAST_MED（既往症人群评分）业务场景
  bizType: string;
  // 场景类型:FULL_PUSH-首次下发，携带底包文件,TRIGGER_PUSH-圈客周期变更触发，不携带文件；不传按 FULL_PUSH 处理
  actionType: string;
  // TRIGGER_PUSH 须传,首次 FULL_PUSH 受理回执返回的受理号，蚂蚁校验存在对应首次下发记录（查无记录受理失败）；FULL_PUSH 由蚂蚁生成并随受理回执返回
  acceptNo?: string;
  // 圈客周期,每周示例：{"cycleType":"WEEKLY","cycleValue":3,"time":"10:00"}，每月示例：每月10号	{"cycleType":"MONTHLY","cycleValue":10,"time":"10:00"}
  updateCycle: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      requestId: 'request_id',
      productCode: 'product_code',
      bizContent: 'biz_content',
      bizType: 'biz_type',
      actionType: 'action_type',
      acceptNo: 'accept_no',
      updateCycle: 'update_cycle',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      requestId: 'string',
      productCode: 'string',
      bizContent: 'string',
      bizType: 'string',
      actionType: 'string',
      acceptNo: 'string',
      updateCycle: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReceiveAntcloudInsuranceLeadOpportunitiesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求id
  requestId?: string;
  // 受理号：FULL_PUSH 为蚂蚁生成的受理号；TRIGGER_PUSH 为原批次受理号
  acceptNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestId: 'request_id',
      acceptNo: 'accept_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestId: 'string',
      acceptNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PostbackAntcloudInsuranceLeadReceiveRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // string
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
  // 请求id，每一次请求保持唯一，若重复，则报错；
  requestId: string;
  // 通知类型：固定 LEAD_PUSH_NOTIFY（既往症线索推送通知）
  notifyType: string;
  // 动作类型：首次-FULL_PUSH，周期-TRIGGER_PUSH
  actionType: string;
  // json格式数据updateCycle等字段
  notifyInfo?: string;
  // 客户「既往症线索周期变更」受理号透传，供给方回传结果文件时随请求带回
  acceptNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      requestId: 'request_id',
      notifyType: 'notify_type',
      actionType: 'action_type',
      notifyInfo: 'notify_info',
      acceptNo: 'accept_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      requestId: 'string',
      notifyType: 'string',
      actionType: 'string',
      notifyInfo: 'string',
      acceptNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PostbackAntcloudInsuranceLeadReceiveResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求ID
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestId: 'string',
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
          sdk_version: "1.1.0",
          _prod_code: "INSURANCESAAS",
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
   * @remarks
   * Description: 保险营销文件上传，营销链路中涉及到文件上传，均可使用本接口，根据上传的数据类型做区分
   * Summary: 保险营销文件上传，营销链路中涉及到文件上传，均可使用本接口，根据上传的数据类型做区分
   */
  async uploadAntcloudInsuranceMktFile(request: UploadAntcloudInsuranceMktFileRequest): Promise<UploadAntcloudInsuranceMktFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadAntcloudInsuranceMktFileEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 保险营销文件上传，营销链路中涉及到文件上传，均可使用本接口，根据上传的数据类型做区分
   * Summary: 保险营销文件上传，营销链路中涉及到文件上传，均可使用本接口，根据上传的数据类型做区分
   */
  async uploadAntcloudInsuranceMktFileEx(request: UploadAntcloudInsuranceMktFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadAntcloudInsuranceMktFileResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antcloud.insurance.mkt.file.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadAntcloudInsuranceMktFileResponse = new UploadAntcloudInsuranceMktFileResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadAntcloudInsuranceMktFileResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<UploadAntcloudInsuranceMktFileResponse>(await this.doRequest("1.0", "antcloud.insurance.mkt.file.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadAntcloudInsuranceMktFileResponse({}));
  }

  /**
   * @remarks
   * Description: 保险营销效果回传
   * Summary: 保险营销效果回传
   */
  async callbackAntcloudInsuranceMktEffect(request: CallbackAntcloudInsuranceMktEffectRequest): Promise<CallbackAntcloudInsuranceMktEffectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackAntcloudInsuranceMktEffectEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 保险营销效果回传
   * Summary: 保险营销效果回传
   */
  async callbackAntcloudInsuranceMktEffectEx(request: CallbackAntcloudInsuranceMktEffectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackAntcloudInsuranceMktEffectResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackAntcloudInsuranceMktEffectResponse>(await this.doRequest("1.0", "antcloud.insurance.mkt.effect.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackAntcloudInsuranceMktEffectResponse({}));
  }

  /**
   * @remarks
   * Description: 保险营销效果回传接口——媒体
   * Summary: 保险营销效果回传接口——媒体
   */
  async callbackAntcloudInsuranceMktLiveeffect(request: CallbackAntcloudInsuranceMktLiveeffectRequest): Promise<CallbackAntcloudInsuranceMktLiveeffectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackAntcloudInsuranceMktLiveeffectEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 保险营销效果回传接口——媒体
   * Summary: 保险营销效果回传接口——媒体
   */
  async callbackAntcloudInsuranceMktLiveeffectEx(request: CallbackAntcloudInsuranceMktLiveeffectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackAntcloudInsuranceMktLiveeffectResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackAntcloudInsuranceMktLiveeffectResponse>(await this.doRequest("1.0", "antcloud.insurance.mkt.liveeffect.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackAntcloudInsuranceMktLiveeffectResponse({}));
  }

  /**
   * @remarks
   * Description: 保险实时营销提交
   * Summary: 保险实时营销提交
   */
  async applyAntcloudInsuranceMktRealtimemkt(request: ApplyAntcloudInsuranceMktRealtimemktRequest): Promise<ApplyAntcloudInsuranceMktRealtimemktResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyAntcloudInsuranceMktRealtimemktEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 保险实时营销提交
   * Summary: 保险实时营销提交
   */
  async applyAntcloudInsuranceMktRealtimemktEx(request: ApplyAntcloudInsuranceMktRealtimemktRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyAntcloudInsuranceMktRealtimemktResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyAntcloudInsuranceMktRealtimemktResponse>(await this.doRequest("1.0", "antcloud.insurance.mkt.realtimemkt.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyAntcloudInsuranceMktRealtimemktResponse({}));
  }

  /**
   * @remarks
   * Description: 保司营销监测数据回传
   * Summary: 保司营销监测数据回传
   */
  async callbackAntcloudInsuranceMktMonitordata(request: CallbackAntcloudInsuranceMktMonitordataRequest): Promise<CallbackAntcloudInsuranceMktMonitordataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackAntcloudInsuranceMktMonitordataEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 保司营销监测数据回传
   * Summary: 保司营销监测数据回传
   */
  async callbackAntcloudInsuranceMktMonitordataEx(request: CallbackAntcloudInsuranceMktMonitordataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackAntcloudInsuranceMktMonitordataResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackAntcloudInsuranceMktMonitordataResponse>(await this.doRequest("1.0", "antcloud.insurance.mkt.monitordata.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackAntcloudInsuranceMktMonitordataResponse({}));
  }

  /**
   * @remarks
   * Description: 媒体点击统计数据回传
   * Summary: 媒体点击统计数据回传
   */
  async callbackAntcloudInsuranceMktMediastatisticaldata(request: CallbackAntcloudInsuranceMktMediastatisticaldataRequest): Promise<CallbackAntcloudInsuranceMktMediastatisticaldataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackAntcloudInsuranceMktMediastatisticaldataEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 媒体点击统计数据回传
   * Summary: 媒体点击统计数据回传
   */
  async callbackAntcloudInsuranceMktMediastatisticaldataEx(request: CallbackAntcloudInsuranceMktMediastatisticaldataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackAntcloudInsuranceMktMediastatisticaldataResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackAntcloudInsuranceMktMediastatisticaldataResponse>(await this.doRequest("1.0", "antcloud.insurance.mkt.mediastatisticaldata.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackAntcloudInsuranceMktMediastatisticaldataResponse({}));
  }

  /**
   * @remarks
   * Description: 营销效果节点数据（简版）
   * Summary: 营销效果节点数据（简版）
   */
  async callbackAntcloudInsuranceMktEffectsimple(request: CallbackAntcloudInsuranceMktEffectsimpleRequest): Promise<CallbackAntcloudInsuranceMktEffectsimpleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackAntcloudInsuranceMktEffectsimpleEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 营销效果节点数据（简版）
   * Summary: 营销效果节点数据（简版）
   */
  async callbackAntcloudInsuranceMktEffectsimpleEx(request: CallbackAntcloudInsuranceMktEffectsimpleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackAntcloudInsuranceMktEffectsimpleResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackAntcloudInsuranceMktEffectsimpleResponse>(await this.doRequest("1.0", "antcloud.insurance.mkt.effectsimple.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackAntcloudInsuranceMktEffectsimpleResponse({}));
  }

  /**
   * @remarks
   * Description: 保险营销服务商人群圈选
   * Summary: 保险营销服务商人群圈选
   */
  async applyAntcloudInsuranceMktserviceproviderAudiencecircle(request: ApplyAntcloudInsuranceMktserviceproviderAudiencecircleRequest): Promise<ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyAntcloudInsuranceMktserviceproviderAudiencecircleEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 保险营销服务商人群圈选
   * Summary: 保险营销服务商人群圈选
   */
  async applyAntcloudInsuranceMktserviceproviderAudiencecircleEx(request: ApplyAntcloudInsuranceMktserviceproviderAudiencecircleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse>(await this.doRequest("1.0", "antcloud.insurance.mktserviceprovider.audiencecircle.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse({}));
  }

  /**
   * @remarks
   * Description: 营销人群底包析出结果查询
   * Summary: 营销人群底包析出结果查询
   */
  async getAntcloudInsuranceMktExtresulturl(request: GetAntcloudInsuranceMktExtresulturlRequest): Promise<GetAntcloudInsuranceMktExtresulturlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAntcloudInsuranceMktExtresulturlEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 营销人群底包析出结果查询
   * Summary: 营销人群底包析出结果查询
   */
  async getAntcloudInsuranceMktExtresulturlEx(request: GetAntcloudInsuranceMktExtresulturlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAntcloudInsuranceMktExtresulturlResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAntcloudInsuranceMktExtresulturlResponse>(await this.doRequest("1.0", "antcloud.insurance.mkt.extresulturl.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAntcloudInsuranceMktExtresulturlResponse({}));
  }

  /**
   * @remarks
   * Description: 商机接收-既往症人群评分-对客
   * Summary: 商机接收-既往症人群评分-对客
   */
  async receiveAntcloudInsuranceLeadOpportunities(request: ReceiveAntcloudInsuranceLeadOpportunitiesRequest): Promise<ReceiveAntcloudInsuranceLeadOpportunitiesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.receiveAntcloudInsuranceLeadOpportunitiesEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 商机接收-既往症人群评分-对客
   * Summary: 商机接收-既往症人群评分-对客
   */
  async receiveAntcloudInsuranceLeadOpportunitiesEx(request: ReceiveAntcloudInsuranceLeadOpportunitiesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReceiveAntcloudInsuranceLeadOpportunitiesResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antcloud.insurance.lead.opportunities.receive",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let receiveAntcloudInsuranceLeadOpportunitiesResponse = new ReceiveAntcloudInsuranceLeadOpportunitiesResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return receiveAntcloudInsuranceLeadOpportunitiesResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<ReceiveAntcloudInsuranceLeadOpportunitiesResponse>(await this.doRequest("1.0", "antcloud.insurance.lead.opportunities.receive", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReceiveAntcloudInsuranceLeadOpportunitiesResponse({}));
  }

  /**
   * @remarks
   * Description: 既往症线索供给方评分结果文件回传
   * Summary: 既往症线索供给方评分结果文件回传
   */
  async postbackAntcloudInsuranceLeadReceive(request: PostbackAntcloudInsuranceLeadReceiveRequest): Promise<PostbackAntcloudInsuranceLeadReceiveResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.postbackAntcloudInsuranceLeadReceiveEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 既往症线索供给方评分结果文件回传
   * Summary: 既往症线索供给方评分结果文件回传
   */
  async postbackAntcloudInsuranceLeadReceiveEx(request: PostbackAntcloudInsuranceLeadReceiveRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PostbackAntcloudInsuranceLeadReceiveResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antcloud.insurance.lead.receive.postback",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let postbackAntcloudInsuranceLeadReceiveResponse = new PostbackAntcloudInsuranceLeadReceiveResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return postbackAntcloudInsuranceLeadReceiveResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<PostbackAntcloudInsuranceLeadReceiveResponse>(await this.doRequest("1.0", "antcloud.insurance.lead.receive.postback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PostbackAntcloudInsuranceLeadReceiveResponse({}));
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
