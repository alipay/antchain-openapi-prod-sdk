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

// 网页取证具体信息
export class ScreenshotInfo extends $tea.Model {
  // 全链路取证日志文件下载链接
  processLogFile?: string;
  // 自清洁文件下载链接
  checkLogFile?: string;
  // 网页截图文件下载链接
  screenshotFile: string;
  static names(): { [key: string]: string } {
    return {
      processLogFile: 'process_log_file',
      checkLogFile: 'check_log_file',
      screenshotFile: 'screenshot_file',
    };
  }

  static types(): { [key: string]: any } {
    return {
      processLogFile: 'string',
      checkLogFile: 'string',
      screenshotFile: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 取证文件信息
export class ScreenInfo extends $tea.Model {
  // 全链路取证日志文件下载链接
  processLogFile?: string;
  // 自清洁文件下载地址
  checkLogFile?: string;
  // 网页截图文件下载链接
  webScreenshotFile?: string;
  // 网页源码文件下载链接
  webSourceFile?: string;
  // 视频源文件下载链接
  videoFile?: string;
  static names(): { [key: string]: string } {
    return {
      processLogFile: 'process_log_file',
      checkLogFile: 'check_log_file',
      webScreenshotFile: 'web_screenshot_file',
      webSourceFile: 'web_source_file',
      videoFile: 'video_file',
    };
  }

  static types(): { [key: string]: any } {
    return {
      processLogFile: 'string',
      checkLogFile: 'string',
      webScreenshotFile: 'string',
      webSourceFile: 'string',
      videoFile: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 监测提供商能力
export class MonitorProviderCapability extends $tea.Model {
  // 供应商id
  providerId: string;
  // 供应商名称
  providerName: string;
  // 供应商描述
  providerDescription: string;
  // 是否推荐供应商
  isProvided: boolean;
  static names(): { [key: string]: string } {
    return {
      providerId: 'provider_id',
      providerName: 'provider_name',
      providerDescription: 'provider_description',
      isProvided: 'is_provided',
    };
  }

  static types(): { [key: string]: any } {
    return {
      providerId: 'string',
      providerName: 'string',
      providerDescription: 'string',
      isProvided: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 录屏取证信息
export class RecordScreenData extends $tea.Model {
  // 错误原因（状态为FAIL才有数据）
  errorReason?: string;
  // 录屏文件Hash值
  fileHash?: string;
  // 录屏结束时间
  gmtEnd: number;
  // 录屏开始时间
  gmtStart: number;
  // OS版本号
  osVersion: string;
  // 录屏文件信息
  screenInfo?: ScreenInfo;
  // 证据包下载地址（状态为SUCCESS 才有数据）
  screenZip?: string;
  // 录屏软件版本号
  swVersion: string;
  // 可信时间戳的返回对象
  tsr?: string;
  // 统一证据编号
  txHash?: string;
  // 录屏文件大小
  fileSize?: number;
  // 录屏文件存证块高
  blockHeight?: number;
  // 录屏文件上链时间
  timestamp?: number;
  // 录屏文件公证处证书下载链接
  certificateUrl?: string;
  // 公证处证书编号
  certificateStorageNo?: string;
  // 证据包存证交易hash
  zipTxHash?: string;
  // 取证备注信息
  inventory?: string;
  static names(): { [key: string]: string } {
    return {
      errorReason: 'error_reason',
      fileHash: 'file_hash',
      gmtEnd: 'gmt_end',
      gmtStart: 'gmt_start',
      osVersion: 'os_version',
      screenInfo: 'screen_info',
      screenZip: 'screen_zip',
      swVersion: 'sw_version',
      tsr: 'tsr',
      txHash: 'tx_hash',
      fileSize: 'file_size',
      blockHeight: 'block_height',
      timestamp: 'timestamp',
      certificateUrl: 'certificate_url',
      certificateStorageNo: 'certificate_storage_no',
      zipTxHash: 'zip_tx_hash',
      inventory: 'inventory',
    };
  }

  static types(): { [key: string]: any } {
    return {
      errorReason: 'string',
      fileHash: 'string',
      gmtEnd: 'number',
      gmtStart: 'number',
      osVersion: 'string',
      screenInfo: ScreenInfo,
      screenZip: 'string',
      swVersion: 'string',
      tsr: 'string',
      txHash: 'string',
      fileSize: 'number',
      blockHeight: 'number',
      timestamp: 'number',
      certificateUrl: 'string',
      certificateStorageNo: 'string',
      zipTxHash: 'string',
      inventory: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 权利声明核验信息
export class VerifyStatementData extends $tea.Model {
  // 权利声明书存证交易HASH
  statementTxHash?: string;
  // 权利声明书文件ID（和statementFileId 二选一,如果都传使用statementFileHash）
  statementFileId?: string;
  // 权利声明书文件HASH（和statementFileId 二选一,如果都传使用statementFileHash）
  statementFileHash?: string;
  static names(): { [key: string]: string } {
    return {
      statementTxHash: 'statement_tx_hash',
      statementFileId: 'statement_file_id',
      statementFileHash: 'statement_file_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      statementTxHash: 'string',
      statementFileId: 'string',
      statementFileHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品sku信息
export class GoodSkuInfo extends $tea.Model {
  // 授权规格序号
  skuNum: string;
  // 授权规格价格(单位：分)
  price: number;
  static names(): { [key: string]: string } {
    return {
      skuNum: 'sku_num',
      price: 'price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      skuNum: 'string',
      price: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 公证处信息
export class NotaryPublicOffice extends $tea.Model {
  // 公证处code
  code: string;
  // 公证处名称
  name: string;
  // 公证处所在省（直辖市）
  province: string;
  // 公证处所在市
  city: string;
  // 公证处完整名称
  orgName: string;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      name: 'name',
      province: 'province',
      city: 'city',
      orgName: 'org_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      name: 'string',
      province: 'string',
      city: 'string',
      orgName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 网页取证数据
export class ScreenshotData extends $tea.Model {
  // 取证地址
  url: string;
  // 网页取证时间
  gmtEvidence?: number;
  // 网页取证文件Hash值
  fileHash?: string;
  // 网页取证文件大小
  fileSize?: number;
  // 统一证据编号
  txHash?: string;
  // 网页取证文件存证块高
  blockHeight?: number;
  // 网页取证文件上链时间
  timestamp?: number;
  // 可信时间戳的返回对象
  tsr?: string;
  // 网页截图文件公证处证书下载链接
  certificateUrl?: string;
  // 公证处证书编号
  certificateStorageNo?: string;
  // 网页取证工具软件版本号
  toolVersion?: string;
  // 证据包下载地址（状态为SUCCESS 才有数据）
  screenshotZip?: string;
  // 取证文件信息
  screenshotInfo?: ScreenshotInfo;
  // 网页title
  headTitle?: string;
  // 证据包交易hash
  zipTxHash?: string;
  // 网页取证失败原因
  errorReason?: string;
  // 中文失败原因
  errorReasonCn?: string;
  static names(): { [key: string]: string } {
    return {
      url: 'url',
      gmtEvidence: 'gmt_evidence',
      fileHash: 'file_hash',
      fileSize: 'file_size',
      txHash: 'tx_hash',
      blockHeight: 'block_height',
      timestamp: 'timestamp',
      tsr: 'tsr',
      certificateUrl: 'certificate_url',
      certificateStorageNo: 'certificate_storage_no',
      toolVersion: 'tool_version',
      screenshotZip: 'screenshot_zip',
      screenshotInfo: 'screenshot_info',
      headTitle: 'head_title',
      zipTxHash: 'zip_tx_hash',
      errorReason: 'error_reason',
      errorReasonCn: 'error_reason_cn',
    };
  }

  static types(): { [key: string]: any } {
    return {
      url: 'string',
      gmtEvidence: 'number',
      fileHash: 'string',
      fileSize: 'number',
      txHash: 'string',
      blockHeight: 'number',
      timestamp: 'number',
      tsr: 'string',
      certificateUrl: 'string',
      certificateStorageNo: 'string',
      toolVersion: 'string',
      screenshotZip: 'string',
      screenshotInfo: ScreenshotInfo,
      headTitle: 'string',
      zipTxHash: 'string',
      errorReason: 'string',
      errorReasonCn: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 类型对应供应商
export class MonitorProviderType extends $tea.Model {
  // 监测文件类型
  fileType: string;
  // 提交类型
  submitType: string;
  // 文件格式
  fileFormat?: string;
  // 支持的服务商列表，已排序
  monitorProviders: MonitorProviderCapability[];
  static names(): { [key: string]: string } {
    return {
      fileType: 'file_type',
      submitType: 'submit_type',
      fileFormat: 'file_format',
      monitorProviders: 'monitor_providers',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fileType: 'string',
      submitType: 'string',
      fileFormat: 'string',
      monitorProviders: { 'type': 'array', 'itemType': MonitorProviderCapability },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// dci作品发表信息
export class DciPublicationInfo extends $tea.Model {
  // 作品发表状态
  publicationStatus: string;
  // 首次发表日期
  firstPublicationDate: string;
  // 首次发表地址
  firstPublicationPlace: string;
  static names(): { [key: string]: string } {
    return {
      publicationStatus: 'publication_status',
      firstPublicationDate: 'first_publication_date',
      firstPublicationPlace: 'first_publication_place',
    };
  }

  static types(): { [key: string]: any } {
    return {
      publicationStatus: 'string',
      firstPublicationDate: 'string',
      firstPublicationPlace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// dci作品创作信息
export class DciCreationInfo extends $tea.Model {
  // 作品创作性质
  creationNature: string;
  // 创作完成日期
  creationCompletionDate: string;
  // 创作完成地点
  creationCompletionPlace: string;
  static names(): { [key: string]: string } {
    return {
      creationNature: 'creation_nature',
      creationCompletionDate: 'creation_completion_date',
      creationCompletionPlace: 'creation_completion_place',
    };
  }

  static types(): { [key: string]: any } {
    return {
      creationNature: 'string',
      creationCompletionDate: 'string',
      creationCompletionPlace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 权利信息
export class RightsInfo extends $tea.Model {
  // 作品创作完成时间
  completedTime: number;
  // 作品创作完成地点（最长128个字符）
  completedPlace: string;
  // 是否发表
  isPublish: boolean;
  // 发表时间（如果isPublish为true则必填）
  publishTime?: number;
  // 发表地点（如果isPublish为true则必填，最长128个字符）
  publishPlace?: string;
  // 发表网址（如果isPublish为true则必填，最长1024个字符）
  publishWeb?: string;
  // 是否是作者
  isAuthor: boolean;
  // 作者姓名（如果isAuthor为true则必填，最长32个字符）
  authorCertName?: string;
  // 作者身份证号（如果isAuthor为true则必填）
  authorCertNo?: string;
  static names(): { [key: string]: string } {
    return {
      completedTime: 'completed_time',
      completedPlace: 'completed_place',
      isPublish: 'is_publish',
      publishTime: 'publish_time',
      publishPlace: 'publish_place',
      publishWeb: 'publish_web',
      isAuthor: 'is_author',
      authorCertName: 'author_cert_name',
      authorCertNo: 'author_cert_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      completedTime: 'number',
      completedPlace: 'string',
      isPublish: 'boolean',
      publishTime: 'number',
      publishPlace: 'string',
      publishWeb: 'string',
      isAuthor: 'boolean',
      authorCertName: 'string',
      authorCertNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 核验用户信息
export class VerifyUserData extends $tea.Model {
  // 证件名称
  certName?: string;
  // 证件号码
  certNo?: string;
  // 证件类型
  certType?: string;
  // 登记人信息存证交易HASH
  registerPersonTxHash?: string;
  static names(): { [key: string]: string } {
    return {
      certName: 'cert_name',
      certNo: 'cert_no',
      certType: 'cert_type',
      registerPersonTxHash: 'register_person_tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      certName: 'string',
      certNo: 'string',
      certType: 'string',
      registerPersonTxHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 授权信息
export class AuthInfo extends $tea.Model {
  // 授权权利项
  rightCode: string;
  // 许可地域，默认中国境内，不包括香港等
  regionCode?: string;
  // 许可方式
  usageCode: string;
  // 许可终端
  terminalCode: string;
  // 传播媒介，默认互联网
  mediaCode?: string;
  // 是否独占,默认 普通专有 GENERAL
  rightItemCharacter?: string;
  // 是否可转让,默认不可转让
  transferStatus?: string;
  static names(): { [key: string]: string } {
    return {
      rightCode: 'right_code',
      regionCode: 'region_code',
      usageCode: 'usage_code',
      terminalCode: 'terminal_code',
      mediaCode: 'media_code',
      rightItemCharacter: 'right_item_character',
      transferStatus: 'transfer_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      rightCode: 'string',
      regionCode: 'string',
      usageCode: 'string',
      terminalCode: 'string',
      mediaCode: 'string',
      rightItemCharacter: 'string',
      transferStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 放弃取证信息
export class ScreenCancelInfo extends $tea.Model {
  // 允许放弃时长（分钟）
  cancelInMin: number;
  // 可用放弃次数
  cancelAttemptLeft: number;
  static names(): { [key: string]: string } {
    return {
      cancelInMin: 'cancel_in_min',
      cancelAttemptLeft: 'cancel_attempt_left',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cancelInMin: 'number',
      cancelAttemptLeft: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 取证网址信息
export class EvidenceUrlInfo extends $tea.Model {
  // 取证网址
  url: string;
  // 音视频取证时间
  autoSurfingMinute?: number;
  static names(): { [key: string]: string } {
    return {
      url: 'url',
      autoSurfingMinute: 'auto_surfing_minute',
    };
  }

  static types(): { [key: string]: any } {
    return {
      url: 'string',
      autoSurfingMinute: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 定向监测结果
export class DirectMonitorResult extends $tea.Model {
  // 监测结果id
  monitorResultId: string;
  // 相似的资源链接
  similarResourceUrl: string;
  // 相似资源所在的网址链接
  similarWebUrl: string;
  // 资源标题
  title?: string;
  // 资源作者
  author?: string;
  // 资源上传时间，格式yyyy-MM-dd HH:mm:ss
  uploadTime?: string;
  static names(): { [key: string]: string } {
    return {
      monitorResultId: 'monitor_result_id',
      similarResourceUrl: 'similar_resource_url',
      similarWebUrl: 'similar_web_url',
      title: 'title',
      author: 'author',
      uploadTime: 'upload_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      monitorResultId: 'string',
      similarResourceUrl: 'string',
      similarWebUrl: 'string',
      title: 'string',
      author: 'string',
      uploadTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 内容安全信息
export class SecurityData extends $tea.Model {
  // 内容安全检查结果
  result: string;
  // 有风险的内容
  riskData?: string[];
  static names(): { [key: string]: string } {
    return {
      result: 'result',
      riskData: 'risk_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      result: 'string',
      riskData: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 账号信息
export class AccountData extends $tea.Model {
  // 账号id
  accountId: string;
  // 账号名称
  accountName: string;
  // 账号平台（支付宝，淘宝，微信，抖音等）
  accountPlatform: string;
  static names(): { [key: string]: string } {
    return {
      accountId: 'account_id',
      accountName: 'account_name',
      accountPlatform: 'account_platform',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accountId: 'string',
      accountName: 'string',
      accountPlatform: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 代理信息
export class ProxyData extends $tea.Model {
  // 金融云租户id
  tenantId: string;
  // 租户名称
  tenantName: string;
  // 是否计量
  ifMeasure?: boolean;
  static names(): { [key: string]: string } {
    return {
      tenantId: 'tenant_id',
      tenantName: 'tenant_name',
      ifMeasure: 'if_measure',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tenantId: 'string',
      tenantName: 'string',
      ifMeasure: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 著作权人证件信息
export class CopyrightCertInfo extends $tea.Model {
  // 证件号码
  certNo: string;
  // 证件名称
  certName: string;
  // 证件类型
  certType: string;
  static names(): { [key: string]: string } {
    return {
      certNo: 'cert_no',
      certName: 'cert_name',
      certType: 'cert_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      certNo: 'string',
      certName: 'string',
      certType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 监测任务信息
export class MonitorTask extends $tea.Model {
  // 内容表述
  // 
  // 
  contentDesc?: string;
  // 监测任务标题
  // 
  // 
  contentTitle?: string;
  // 监测文件时长，主要用于视频监测、音频监测的时长记录
  fileLengthInSecond?: number;
  // 监测关键字
  // 
  // 
  keywords: string[];
  // 监测任务ID
  // 
  monitorTaskId: string;
  // 任务名称
  // 
  // 
  name: string;
  // 监测供应商id
  providerId?: string;
  // 监测结果数量
  // 
  // 
  resultCount?: number;
  // 监测范围
  // 
  // 
  scopes: string[];
  // 任务状态
  // 
  // INIT
  // 
  // WORKING
  // 
  // FINISH
  // 
  // FAILURE
  // 
  // DELETE
  status: string;
  // 监测时长(天)
  // 
  // 
  taskDuration: number;
  // 任务结束时间
  // 
  // 
  taskEnd?: number;
  // 任务开始时间
  // 
  // 
  taskStart?: number;
  // 文件类别
  // 
  // IMAGE
  // 
  // TEXT
  // 
  // VIDEO
  fileType: string;
  // 文件大小
  fileSize?: number;
  // submitType是url就是url地址 submitType 是file就是oss fileId
  submitContent: string;
  // 提交任务的类型:FILE/URL
  // 不填为FILE
  // FILE表示文件上传素材，URL表示上传URL
  submitType?: string;
  // 当status为failure时的具体错误信息（中文描述）
  failureMsg?: string;
  // 当status为failure时的具体错误信息（错误枚举）
  failureCode?: string;
  static names(): { [key: string]: string } {
    return {
      contentDesc: 'content_desc',
      contentTitle: 'content_title',
      fileLengthInSecond: 'file_length_in_second',
      keywords: 'keywords',
      monitorTaskId: 'monitor_task_id',
      name: 'name',
      providerId: 'provider_id',
      resultCount: 'result_count',
      scopes: 'scopes',
      status: 'status',
      taskDuration: 'task_duration',
      taskEnd: 'task_end',
      taskStart: 'task_start',
      fileType: 'file_type',
      fileSize: 'file_size',
      submitContent: 'submit_content',
      submitType: 'submit_type',
      failureMsg: 'failure_msg',
      failureCode: 'failure_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      contentDesc: 'string',
      contentTitle: 'string',
      fileLengthInSecond: 'number',
      keywords: { 'type': 'array', 'itemType': 'string' },
      monitorTaskId: 'string',
      name: 'string',
      providerId: 'string',
      resultCount: 'number',
      scopes: { 'type': 'array', 'itemType': 'string' },
      status: 'string',
      taskDuration: 'number',
      taskEnd: 'number',
      taskStart: 'number',
      fileType: 'string',
      fileSize: 'number',
      submitContent: 'string',
      submitType: 'string',
      failureMsg: 'string',
      failureCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 核验取证信息
export class VerifyEvidenceData extends $tea.Model {
  // 操作日志交易HASH
  processLogTxHash?: string;
  // 自清洁日志交易HASH
  checkLogTxHash?: string;
  static names(): { [key: string]: string } {
    return {
      processLogTxHash: 'process_log_tx_hash',
      checkLogTxHash: 'check_log_tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      processLogTxHash: 'string',
      checkLogTxHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品信息
export class GoodsInfo extends $tea.Model {
  // 商品id
  goodsId?: string;
  // 商品名称
  goodsName?: string;
  // 商品状态
  goodsStatus?: string;
  // 商品分类
  classification?: string;
  // 售卖数量
  totalSoldNum?: number;
  // 售价（分）
  standardPriceInCent?: number;
  // 商品标题
  title?: string;
  // 授权期限起始时间
  authStartTime?: number;
  // 授权期限结束时间
  authEndTime?: number;
  // 发布时间
  publishTime?: number;
  static names(): { [key: string]: string } {
    return {
      goodsId: 'goods_id',
      goodsName: 'goods_name',
      goodsStatus: 'goods_status',
      classification: 'classification',
      totalSoldNum: 'total_sold_num',
      standardPriceInCent: 'standard_price_in_cent',
      title: 'title',
      authStartTime: 'auth_start_time',
      authEndTime: 'auth_end_time',
      publishTime: 'publish_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      goodsId: 'string',
      goodsName: 'string',
      goodsStatus: 'string',
      classification: 'string',
      totalSoldNum: 'number',
      standardPriceInCent: 'number',
      title: 'string',
      authStartTime: 'number',
      authEndTime: 'number',
      publishTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 作品信息
export class WorksInfo extends $tea.Model {
  // 作品名称
  worksName: string;
  // 作品类型
  worksType: string;
  static names(): { [key: string]: string } {
    return {
      worksName: 'works_name',
      worksType: 'works_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      worksName: 'string',
      worksType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// dci权利信息
export class DciRightInfo extends $tea.Model {
  // 作品权利范围
  rightScope: string;
  // 权利取得方式
  rightObtainWay: string;
  // 权利归属方式
  ownershipWay: string;
  static names(): { [key: string]: string } {
    return {
      rightScope: 'right_scope',
      rightObtainWay: 'right_obtain_way',
      ownershipWay: 'ownership_way',
    };
  }

  static types(): { [key: string]: any } {
    return {
      rightScope: 'string',
      rightObtainWay: 'string',
      ownershipWay: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 监测任务结果
export class MonitorResult extends $tea.Model {
  // 监测任务ID
  // 
  monitorTaskId: string;
  // 监测结果ID
  // 
  monitorResultId: string;
  // 侵权网址
  // 
  // 
  infrUrl?: string;
  // 侵权主体
  // 
  // 
  infrHost?: string;
  // 侵权标题
  // 
  // 
  infrTitle?: string;
  // 侵权内容上传时间
  // 
  // 
  infrTime?: number;
  // 侵权详情
  // 
  detail?: string;
  // 发布者
  poster?: string;
  // 侵权内容发布时间
  postDate?: number;
  // 侵权内容发现时间
  findDate?: number;
  // 观看数
  viewCount?: number;
  // 点赞数
  likeCount?: number;
  // 评论数
  commentCount?: number;
  // 转发数
  repostCount?: number;
  // 侵权文件下载链接
  downloadUrl?: string;
  // 疑似侵权反馈时间
  infrFeedbackTime?: number;
  static names(): { [key: string]: string } {
    return {
      monitorTaskId: 'monitor_task_id',
      monitorResultId: 'monitor_result_id',
      infrUrl: 'infr_url',
      infrHost: 'infr_host',
      infrTitle: 'infr_title',
      infrTime: 'infr_time',
      detail: 'detail',
      poster: 'poster',
      postDate: 'post_date',
      findDate: 'find_date',
      viewCount: 'view_count',
      likeCount: 'like_count',
      commentCount: 'comment_count',
      repostCount: 'repost_count',
      downloadUrl: 'download_url',
      infrFeedbackTime: 'infr_feedback_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      monitorTaskId: 'string',
      monitorResultId: 'string',
      infrUrl: 'string',
      infrHost: 'string',
      infrTitle: 'string',
      infrTime: 'number',
      detail: 'string',
      poster: 'string',
      postDate: 'number',
      findDate: 'number',
      viewCount: 'number',
      likeCount: 'number',
      commentCount: 'number',
      repostCount: 'number',
      downloadUrl: 'string',
      infrFeedbackTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户信息
export class UserData extends $tea.Model {
  // 用户账号
  account: string;
  // 账号类型
  accountType: string;
  // 证件名称
  certName: string;
  // 证件号码
  certNo: string;
  // 证件类型
  certType: string;
  // 联系方式
  contactInfo?: string;
  // 企业法人
  legalPerson?: string;
  // 注册时间
  regTime: number;
  // 账号状态
  status: string;
  // 用户类型
  type: string;
  static names(): { [key: string]: string } {
    return {
      account: 'account',
      accountType: 'account_type',
      certName: 'cert_name',
      certNo: 'cert_no',
      certType: 'cert_type',
      contactInfo: 'contact_info',
      legalPerson: 'legal_person',
      regTime: 'reg_time',
      status: 'status',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      account: 'string',
      accountType: 'string',
      certName: 'string',
      certNo: 'string',
      certType: 'string',
      contactInfo: 'string',
      legalPerson: 'string',
      regTime: 'number',
      status: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 监测文件类型
export class MonitorType extends $tea.Model {
  // 文件类型
  fileType: string;
  // 提交类型
  submitType: string;
  static names(): { [key: string]: string } {
    return {
      fileType: 'file_type',
      submitType: 'submit_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fileType: 'string',
      submitType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetUploadurlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件名称
  fileName: string;
  // 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。
  clientToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileName: 'file_name',
      clientToken: 'client_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileName: 'string',
      clientToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetUploadurlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授权访问oss链接
  url?: string;
  // OSS 文件id
  fileId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      url: 'url',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      url: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddHashregisterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件SHA256 hash
  hash: string;
  // 文件大小
  length: number;
  // hash算法
  hashType: string;
  // 文件类型
  type: string;
  // 文件名称
  name: string;
  // 备注
  memo?: string;
  // 证件名称
  certName: string;
  // 证件号码
  certNo: string;
  // 证件类型
  certType: string;
  // 是否自动创建公证保管函
  createCertificate?: boolean;
  // 证书类型
  certificateType?: string;
  // 是否创建证据包，默认否
  createPackage?: boolean;
  // 	
  // 公证处Id
  orgId?: string;
  // 电话号码
  phoneNum?: string;
  // 作品信息
  worksInfo?: WorksInfo;
  // 是否创建权利声明书（默认否，选是需要rightsInfo传递对应信息）
  createStatement?: boolean;
  // 权利信息
  rightsInfo?: RightsInfo;
  // 企业经办人姓名（如果certType为BUSINESS_LICENSE并且createStatement为true则必传）
  managerName?: string;
  // 企业经办人身份证号（如果certType为BUSINESS_LICENSE并且createStatement为true则必传）
  managerNo?: string;
  // 附属证据信息（最多5个文件，传递的是FileId）
  ancillaryEvidence?: string[];
  // 著作权人信息
  copyrightOwnerInfo?: CopyrightCertInfo;
  // 幂等字段
  clientToken?: string;
  // 特征文件oss id
  featureFileId?: string;
  // 代理信息
  proxyInfo?: ProxyData;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      hash: 'hash',
      length: 'length',
      hashType: 'hash_type',
      type: 'type',
      name: 'name',
      memo: 'memo',
      certName: 'cert_name',
      certNo: 'cert_no',
      certType: 'cert_type',
      createCertificate: 'create_certificate',
      certificateType: 'certificate_type',
      createPackage: 'create_package',
      orgId: 'org_id',
      phoneNum: 'phone_num',
      worksInfo: 'works_info',
      createStatement: 'create_statement',
      rightsInfo: 'rights_info',
      managerName: 'manager_name',
      managerNo: 'manager_no',
      ancillaryEvidence: 'ancillary_evidence',
      copyrightOwnerInfo: 'copyright_owner_info',
      clientToken: 'client_token',
      featureFileId: 'feature_file_id',
      proxyInfo: 'proxy_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      hash: 'string',
      length: 'number',
      hashType: 'string',
      type: 'string',
      name: 'string',
      memo: 'string',
      certName: 'string',
      certNo: 'string',
      certType: 'string',
      createCertificate: 'boolean',
      certificateType: 'string',
      createPackage: 'boolean',
      orgId: 'string',
      phoneNum: 'string',
      worksInfo: WorksInfo,
      createStatement: 'boolean',
      rightsInfo: RightsInfo,
      managerName: 'string',
      managerNo: 'string',
      ancillaryEvidence: { 'type': 'array', 'itemType': 'string' },
      copyrightOwnerInfo: CopyrightCertInfo,
      clientToken: 'string',
      featureFileId: 'string',
      proxyInfo: ProxyData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddHashregisterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 登记id
  registerId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      registerId: 'register_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      registerId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddRegisterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件oss id
  fileId: string;
  // 是否自动创建公证书,默认否
  createCertificate?: boolean;
  // 证书类型
  certificateType?: string;
  // 是否创建证据包，默认否
  createPackage?: boolean;
  // 公证处id
  orgId?: string;
  // 文件名称
  name: string;
  // 文件类型
  type: string;
  // 备注
  memo?: string;
  // 证件名称
  certName: string;
  // 证件号码
  certNo: string;
  // 证件类型
  certType: string;
  // 电话号码
  phoneNum?: string;
  // 作品信息
  worksInfo?: WorksInfo;
  // 是否创建权利声明书（默认否，选是需要rightsInfo传递对应信息）
  createStatement?: boolean;
  // 企业经办人姓名（如果certType为BUSINESS_LICENSE并且createStatement为true则必传）
  managerName?: string;
  // 企业经办人身份证号（如果certType为BUSINESS_LICENSE并且createStatement为true则必传）
  managerNo?: string;
  // 权利信息
  rightsInfo?: RightsInfo;
  // 附属证据信息（最多5个文件，传递的是FileId）
  ancillaryEvidence?: string[];
  // 著作权人信息
  copyrightOwnerInfo?: CopyrightCertInfo;
  // 幂等
  clientToken?: string;
  // 同步账号信息
  syncInfo?: AccountData;
  // 代理信息
  proxyInfo?: ProxyData;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileId: 'file_id',
      createCertificate: 'create_certificate',
      certificateType: 'certificate_type',
      createPackage: 'create_package',
      orgId: 'org_id',
      name: 'name',
      type: 'type',
      memo: 'memo',
      certName: 'cert_name',
      certNo: 'cert_no',
      certType: 'cert_type',
      phoneNum: 'phone_num',
      worksInfo: 'works_info',
      createStatement: 'create_statement',
      managerName: 'manager_name',
      managerNo: 'manager_no',
      rightsInfo: 'rights_info',
      ancillaryEvidence: 'ancillary_evidence',
      copyrightOwnerInfo: 'copyright_owner_info',
      clientToken: 'client_token',
      syncInfo: 'sync_info',
      proxyInfo: 'proxy_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileId: 'string',
      createCertificate: 'boolean',
      certificateType: 'string',
      createPackage: 'boolean',
      orgId: 'string',
      name: 'string',
      type: 'string',
      memo: 'string',
      certName: 'string',
      certNo: 'string',
      certType: 'string',
      phoneNum: 'string',
      worksInfo: WorksInfo,
      createStatement: 'boolean',
      managerName: 'string',
      managerNo: 'string',
      rightsInfo: RightsInfo,
      ancillaryEvidence: { 'type': 'array', 'itemType': 'string' },
      copyrightOwnerInfo: CopyrightCertInfo,
      clientToken: 'string',
      syncInfo: AccountData,
      proxyInfo: ProxyData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddRegisterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 登记id
  registerId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      registerId: 'register_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      registerId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRegisterstatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 登记id
  registerId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      registerId: 'register_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      registerId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRegisterstatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 登记状态
  status?: string;
  // 存证时间
  timestamp?: number;
  // 文件hash
  hash?: string;
  // 统一证据编号（存证交易HASH）
  txHash?: string;
  // 存证块高
  blockHeight?: number;
  // tsr信息
  tsr?: string;
  // 公证处证书下载链接
  certificateUrl?: string;
  // 公证处证书编号
  certificateStorageNo?: string;
  // 授时中心证书下载链接
  certificateTimeUrl?: string;
  // 证据包下载地址（状态为SUCCESS并且请求要求生成证据包才有数据）
  packageUrl?: string;
  // 证据包存证交易HASH  注意只有生成了证据包才会返回
  packageTxHash?: string;
  // 权利声明书下载地址 注意只有传递了权利信息并且生成了权利声明书才会返回
  statementUrl?: string;
  // 安全信息
  security?: SecurityData;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      timestamp: 'timestamp',
      hash: 'hash',
      txHash: 'tx_hash',
      blockHeight: 'block_height',
      tsr: 'tsr',
      certificateUrl: 'certificate_url',
      certificateStorageNo: 'certificate_storage_no',
      certificateTimeUrl: 'certificate_time_url',
      packageUrl: 'package_url',
      packageTxHash: 'package_tx_hash',
      statementUrl: 'statement_url',
      security: 'security',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      timestamp: 'number',
      hash: 'string',
      txHash: 'string',
      blockHeight: 'number',
      tsr: 'string',
      certificateUrl: 'string',
      certificateStorageNo: 'string',
      certificateTimeUrl: 'string',
      packageUrl: 'string',
      packageTxHash: 'string',
      statementUrl: 'string',
      security: SecurityData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCertificateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 版权登记id
  registerId: string;
  // 证书类型
  certificateType: string;
  // 功能类型
  featuresType: string;
  // 公证处id
  orgId?: string;
  // 代理信息
  proxyInfo?: ProxyData;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      registerId: 'register_id',
      certificateType: 'certificate_type',
      featuresType: 'features_type',
      orgId: 'org_id',
      proxyInfo: 'proxy_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      registerId: 'string',
      certificateType: 'string',
      featuresType: 'string',
      orgId: 'string',
      proxyInfo: ProxyData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCertificateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 生成证书结果
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCertificateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 证书类型
  certificateType: string;
  // 功能类型
  featuresType: string;
  // 版权登记id
  registerId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certificateType: 'certificate_type',
      featuresType: 'features_type',
      registerId: 'register_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certificateType: 'string',
      featuresType: 'string',
      registerId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCertificateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 证书下载链接
  url?: string;
  // 证书生成状态
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      url: 'url',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      url: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateMonitorTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // submitType是url就传 url地址 submitType 是file就传 oss fileId
  submitContent: string;
  // 提交任务的类型:FILE/URL
  // 不填为FILE
  // FILE表示文件上传素材，URL表示上传URL
  submitType?: string;
  // 文件类别
  // 
  // IMAGE
  // 
  // TEXT
  // 
  // VIDEO
  fileType: string;
  // 任务名称(不超过100字符)
  taskName: string;
  // 监测任务标题(不超过100字符)
  contentTitle: string;
  // 关键词(不超过200字符)
  keywords: string[];
  // 内容表述(不超过1000字符)
  contentDesc?: string;
  // 监测供应商id
  providerId?: string;
  // 监测范围 默认全部：ALL；PC网站：SITE；APP应用：APP
  scopes?: string[];
  // 任务开始时间，如当前时间戳，不传则取服务器当前时间戳，单位毫秒
  taskStart?: number;
  // 任务持续时间，单位天，默认90天
  // 
  // 一次性监测：0
  taskDuration?: number;
  // 代理信息
  proxyInfo?: ProxyData;
  // 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
  clientToken: string;
  // 原监测任务id
  originMonitorTaskId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      submitContent: 'submit_content',
      submitType: 'submit_type',
      fileType: 'file_type',
      taskName: 'task_name',
      contentTitle: 'content_title',
      keywords: 'keywords',
      contentDesc: 'content_desc',
      providerId: 'provider_id',
      scopes: 'scopes',
      taskStart: 'task_start',
      taskDuration: 'task_duration',
      proxyInfo: 'proxy_info',
      clientToken: 'client_token',
      originMonitorTaskId: 'origin_monitor_task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      submitContent: 'string',
      submitType: 'string',
      fileType: 'string',
      taskName: 'string',
      contentTitle: 'string',
      keywords: { 'type': 'array', 'itemType': 'string' },
      contentDesc: 'string',
      providerId: 'string',
      scopes: { 'type': 'array', 'itemType': 'string' },
      taskStart: 'number',
      taskDuration: 'number',
      proxyInfo: ProxyData,
      clientToken: 'string',
      originMonitorTaskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateMonitorTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 监测任务Id
  monitorTaskId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      monitorTaskId: 'monitor_task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      monitorTaskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StopMonitorTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 监测任务Id
  // 
  monitorTaskId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      monitorTaskId: 'monitor_task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      monitorTaskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StopMonitorTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 停止结果
  result?: boolean;
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
      result: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMonitorTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 监测任务Id
  // 
  monitorTaskId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      monitorTaskId: 'monitor_task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      monitorTaskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMonitorTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 监测任务信息
  // 
  // 
  monitorTask?: MonitorTask;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      monitorTask: 'monitor_task',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      monitorTask: MonitorTask,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMonitorResultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 监测任务Id
  monitorTaskId: string;
  // 页序号(>0)
  // 
  // 
  pageIndex: number;
  // 页大小(1-200)
  // 
  // 
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      monitorTaskId: 'monitor_task_id',
      pageIndex: 'page_index',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      monitorTaskId: 'string',
      pageIndex: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMonitorResultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 监测任务信息
  monitorResultList?: MonitorResult[];
  // 页序号(>0)
  pageIndex?: number;
  // 页大小(1-200)
  pageSize?: number;
  // 监测结果数量
  resultCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      monitorResultList: 'monitor_result_list',
      pageIndex: 'page_index',
      pageSize: 'page_size',
      resultCount: 'result_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      monitorResultList: { 'type': 'array', 'itemType': MonitorResult },
      pageIndex: 'number',
      pageSize: 'number',
      resultCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListMonitorProviderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需监测文件类型
  monitorTypes: MonitorType[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      monitorTypes: 'monitor_types',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      monitorTypes: { 'type': 'array', 'itemType': MonitorType },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListMonitorProviderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 监测能力提供方类型列表
  providerList?: MonitorProviderType[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      providerList: 'provider_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      providerList: { 'type': 'array', 'itemType': MonitorProviderType },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRecodescreenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 取证名称（最长128个字符）
  name: string;
  // 取证备注（最长512个字符）
  memo?: string;
  // 预校验网址和预打开网页（不能大于10条）
  url?: string[];
  // 取证类型 具体见附录 RecordScreenType
  type: string;
  // 取证服务器地域 具体见附录 RecordScreenArea
  area: string;
  // 定制录屏桌面识别码，目前取值只有默认值：DEFAULT
  screenCode?: string;
  // 最大录屏时间，maxTimeInMin不能小于6min，不能大于300min
  maxTimeInMin: number;
  // 服务器进入ready状态，指定时间未开始进入abort状态的等待时间，单位为分钟，默认1min，waitInMin不能小于1，不能大于10min
  waitInMin?: number;
  // 当所选地域无机器资源时，是否使用其它地域
  // 
  // 目前取值只有默认值：FORBID
  crossRegion?: string;
  // ip地域取值
  // 
  // 目前取值只有默认值：ANY
  ipType?: string;
  // 回调地址
  callbackUrl?: string;
  // 公证处Id
  orgId?: string;
  // 取证人证件名称
  certName: string;
  // 	
  // 取证人证件号码
  certNo: string;
  // 取证人证件类型 具体见附录CertType
  certType: string;
  // 企业法人代表姓名(如果certType为BUSINESS_LICENSE 则必传)
  legalPersonName?: string;
  // 企业法人代表身份证号(如果certType为BUSINESS_LICENSE 则必传)
  legalPersonNo?: string;
  // 企业用户取证人姓名(如果certType为BUSINESS_LICENSE 则必传)
  agent?: string;
  // 企业用户取证人身份证号(如果certType为BUSINESS_LICENSE 则必传)
  agentNo?: string;
  // 取证人电话号码，生成公证处证书需要，公证处需要作登记 格式范例：(86-573)2651630   或  (86)13738258505
  phoneNum?: string;
  // 代理信息
  proxyInfo?: ProxyData;
  // 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
  clientToken: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      memo: 'memo',
      url: 'url',
      type: 'type',
      area: 'area',
      screenCode: 'screen_code',
      maxTimeInMin: 'max_time_in_min',
      waitInMin: 'wait_in_min',
      crossRegion: 'cross_region',
      ipType: 'ip_type',
      callbackUrl: 'callback_url',
      orgId: 'org_id',
      certName: 'cert_name',
      certNo: 'cert_no',
      certType: 'cert_type',
      legalPersonName: 'legal_person_name',
      legalPersonNo: 'legal_person_no',
      agent: 'agent',
      agentNo: 'agent_no',
      phoneNum: 'phone_num',
      proxyInfo: 'proxy_info',
      clientToken: 'client_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      memo: 'string',
      url: { 'type': 'array', 'itemType': 'string' },
      type: 'string',
      area: 'string',
      screenCode: 'string',
      maxTimeInMin: 'number',
      waitInMin: 'number',
      crossRegion: 'string',
      ipType: 'string',
      callbackUrl: 'string',
      orgId: 'string',
      certName: 'string',
      certNo: 'string',
      certType: 'string',
      legalPersonName: 'string',
      legalPersonNo: 'string',
      agent: 'string',
      agentNo: 'string',
      phoneNum: 'string',
      proxyInfo: ProxyData,
      clientToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRecodescreenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 取证id
  evidenceId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      evidenceId: 'evidence_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      evidenceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRecodescreenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 取证id
  evidenceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      evidenceId: 'evidence_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      evidenceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRecodescreenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 取证id
  evidenceId?: string;
  // 取证状态 具体见附录 RecordScreenStatus
  status?: string;
  // 取证操作Url （状态为INIT和DOING 时返回 可以重复打开使用）
  operateUrl?: string;
  // 取证详情（状态为PACKAGING,SUCCESS,FAIL才有数据）
  data?: RecordScreenData;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      evidenceId: 'evidence_id',
      status: 'status',
      operateUrl: 'operate_url',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      evidenceId: 'string',
      status: 'string',
      operateUrl: 'string',
      data: RecordScreenData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户token，从cookie或者重定向链接获取
  token: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      token: 'token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      token: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否登录
  login?: boolean;
  // 用户信息
  user?: UserData;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      login: 'login',
      user: 'user',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      login: 'boolean',
      user: UserData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUserListRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 页码，从1开始
  pageIndex: number;
  // 每页数据，1~100
  pageSize: number;
  // 用户状态
  status?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageIndex: 'page_index',
      pageSize: 'page_size',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageIndex: 'number',
      pageSize: 'number',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUserListResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 页码，从1开始
  pageIndex?: number;
  // 每页数据，1~100
  pageSize?: number;
  // 总数量
  totalCount?: number;
  // 用户信息列表
  userList?: UserData[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pageIndex: 'page_index',
      pageSize: 'page_size',
      totalCount: 'total_count',
      userList: 'user_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pageIndex: 'number',
      pageSize: 'number',
      totalCount: 'number',
      userList: { 'type': 'array', 'itemType': UserData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateScreenshotRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 取证名称（最长128个字符）
  name: string;
  // 取证备注（最长512个字符）
  memo?: string;
  // 取证地址（最长2048个字符）
  url: string;
  // 公证处Id
  orgId?: string;
  // 取证人证件名称
  certName: string;
  // 取证人证件号码
  certNo: string;
  // 取证人证件类型
  certType: string;
  // 法人代表姓名(如果certType为BUSINESS_LICENSE 则必传)
  legalPersonName?: string;
  // 法人代表身份证号(如果certType为BUSINESS_LICENSE 则必传)
  legalPersonNo?: string;
  // 法人证件类型
  legalPersonType?: string;
  // 企业用户取证人姓名(如果certType为BUSINESS_LICENSE 则必传)
  agentName?: string;
  // 企业用户取证人身份证号(如果certType为BUSINESS_LICENSE 则必传)
  agentNo?: string;
  // 取证人电话号码，生成公证处证书需要，公证处需要作登记 格式范例：(86-573)2651630   或  (86)13738258505
  phoneNum?: string;
  // 代理信息
  proxyInfo?: ProxyData;
  // 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符
  clientToken: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      memo: 'memo',
      url: 'url',
      orgId: 'org_id',
      certName: 'cert_name',
      certNo: 'cert_no',
      certType: 'cert_type',
      legalPersonName: 'legal_person_name',
      legalPersonNo: 'legal_person_no',
      legalPersonType: 'legal_person_type',
      agentName: 'agent_name',
      agentNo: 'agent_no',
      phoneNum: 'phone_num',
      proxyInfo: 'proxy_info',
      clientToken: 'client_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      memo: 'string',
      url: 'string',
      orgId: 'string',
      certName: 'string',
      certNo: 'string',
      certType: 'string',
      legalPersonName: 'string',
      legalPersonNo: 'string',
      legalPersonType: 'string',
      agentName: 'string',
      agentNo: 'string',
      phoneNum: 'string',
      proxyInfo: ProxyData,
      clientToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateScreenshotResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 取证id
  evidenceId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      evidenceId: 'evidence_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      evidenceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryScreenshotRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 取证id
  evidenceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      evidenceId: 'evidence_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      evidenceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryScreenshotResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 取证id
  evidenceId?: string;
  // 取证状态
  status?: string;
  // 网页截图信息
  data?: ScreenshotData;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      evidenceId: 'evidence_id',
      status: 'status',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      evidenceId: 'string',
      status: 'string',
      data: ScreenshotData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyBlockchainRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 统一证据编号（存证交易HASH）
  txHash: string;
  // 文件HASH，使用HEX的完整表示，如 6460c949f8a347eb...
  // 
  // (和fileId 二选一，必传一个，都传按fileHash为准)
  fileHash?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      txHash: 'tx_hash',
      fileHash: 'file_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      txHash: 'string',
      fileHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyBlockchainResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 统一证据编号（存证交易HASH）
  txHash?: string;
  // 核验结果
  status?: string;
  // 所在区块hash
  blockHash?: string;
  // 区块链高度
  blockHeight?: number;
  // 存证类型
  dataType?: string;
  // 存证时间
  timestamp?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      status: 'status',
      blockHash: 'block_hash',
      blockHeight: 'block_height',
      dataType: 'data_type',
      timestamp: 'timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      status: 'string',
      blockHash: 'string',
      blockHeight: 'number',
      dataType: 'string',
      timestamp: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRecordscreenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 取证名称（最长128个字符）
  name: string;
  // 取证备注（最长512个字符）
  memo?: string;
  // 预校验网址和预打开网页（不能大于10条），如果automatic为true 则必填
  url?: string[];
  // 取证类型 具体见附录 RecordScreenType
  type: string;
  // 取证服务器地域 具体见附录 RecordScreenArea
  area: string;
  // 定制录屏桌面识别码，目前取值只有默认值：DEFAULT
  screenCode?: string;
  // 最大录屏时间，maxTimeInMin不能小于6min，不能大于300min
  maxTimeInMin: number;
  // 服务器进入ready状态，指定时间未开始进入abort状态的等待时间，单位为分钟，默认1min，waitInMin不能小于1，不能大于10min
  waitInMin?: number;
  // 当所选地域无机器资源时，是否使用其它地域 目前取值只有默认值：FORBID
  crossRegion?: string;
  // ip地域取值 目前取值只有默认值：ANY
  ipType?: string;
  // 回调地址
  callbackUrl?: string;
  // 公证处Id
  orgId?: string;
  // 取证人证件名称
  certName: string;
  // 取证人证件号码
  certNo: string;
  // 取证人证件类型 具体见附录CertType
  certType: string;
  // 企业法人代表姓名(如果certType为BUSINESS_LICENSE 则必传)
  legalPersonName?: string;
  // 企业法人代表身份证号(如果certType为BUSINESS_LICENSE 则必传)
  legalPersonNo?: string;
  // 法人证件类型（非必传，默认IDENTITY_CARD）
  legalPersonType?: string;
  // 企业用户取证人姓名(如果certType为BUSINESS_LICENSE 则必传)
  agentName?: string;
  // 企业用户取证人身份证号(如果certType为BUSINESS_LICENSE 则必传)
  agentNo?: string;
  // 取证人电话号码，生成公证处证书需要，公证处需要作登记 格式范例：(86-573)2651630 或 (86)13738258505
  phoneNum?: string;
  // 是否自动化取证
  automatic?: boolean;
  // 取证目标类型： 微信公众号：WEIXIN_MP 其它：OTHER
  // 
  targetType?: string;
  // 是否支持UAC通行 默认false
  supportUac?: boolean;
  // 取证脚本集Id
  scriptsPackageId?: string;
  // 代理信息
  proxyInfo?: ProxyData;
  // 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
  clientToken: string;
  // 其他取证网址
  inventory?: string;
  // 音视频取证信息
  audioVideoInfos?: EvidenceUrlInfo[];
  // 放弃取证信息
  screenCancelInfo?: ScreenCancelInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      memo: 'memo',
      url: 'url',
      type: 'type',
      area: 'area',
      screenCode: 'screen_code',
      maxTimeInMin: 'max_time_in_min',
      waitInMin: 'wait_in_min',
      crossRegion: 'cross_region',
      ipType: 'ip_type',
      callbackUrl: 'callback_url',
      orgId: 'org_id',
      certName: 'cert_name',
      certNo: 'cert_no',
      certType: 'cert_type',
      legalPersonName: 'legal_person_name',
      legalPersonNo: 'legal_person_no',
      legalPersonType: 'legal_person_type',
      agentName: 'agent_name',
      agentNo: 'agent_no',
      phoneNum: 'phone_num',
      automatic: 'automatic',
      targetType: 'target_type',
      supportUac: 'support_uac',
      scriptsPackageId: 'scripts_package_id',
      proxyInfo: 'proxy_info',
      clientToken: 'client_token',
      inventory: 'inventory',
      audioVideoInfos: 'audio_video_infos',
      screenCancelInfo: 'screen_cancel_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      memo: 'string',
      url: { 'type': 'array', 'itemType': 'string' },
      type: 'string',
      area: 'string',
      screenCode: 'string',
      maxTimeInMin: 'number',
      waitInMin: 'number',
      crossRegion: 'string',
      ipType: 'string',
      callbackUrl: 'string',
      orgId: 'string',
      certName: 'string',
      certNo: 'string',
      certType: 'string',
      legalPersonName: 'string',
      legalPersonNo: 'string',
      legalPersonType: 'string',
      agentName: 'string',
      agentNo: 'string',
      phoneNum: 'string',
      automatic: 'boolean',
      targetType: 'string',
      supportUac: 'boolean',
      scriptsPackageId: 'string',
      proxyInfo: ProxyData,
      clientToken: 'string',
      inventory: 'string',
      audioVideoInfos: { 'type': 'array', 'itemType': EvidenceUrlInfo },
      screenCancelInfo: ScreenCancelInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRecordscreenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 取证id
  evidenceId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      evidenceId: 'evidence_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      evidenceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRecordscreenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 取证id
  evidenceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      evidenceId: 'evidence_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      evidenceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRecordscreenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 取证id
  evidenceId?: string;
  // 取证状态 具体见附录 RecordScreenStatus
  status?: string;
  // 取证操作Url （状态为INIT和DOING 时返回 可以重复打开使用）
  operateUrl?: string;
  // 取证详情（状态为PACKAGING,SUCCESS,FAIL才有数据）
  data?: RecordScreenData;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      evidenceId: 'evidence_id',
      status: 'status',
      operateUrl: 'operate_url',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      evidenceId: 'string',
      status: 'string',
      operateUrl: 'string',
      data: RecordScreenData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListNotaryRequest extends $tea.Model {
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

export class ListNotaryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 公证处列表
  notaryList?: NotaryPublicOffice[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      notaryList: 'notary_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      notaryList: { 'type': 'array', 'itemType': NotaryPublicOffice },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDirectmonitorTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 提交类型，FILE/URL
  // 
  submitType: string;
  // submitType 是FILE就传 oss fileId，是URL就传url地址
  submitContent: string;
  // 文件名称
  fileName: string;
  // 文件类别 IMAGE/TEXT/VIDEO/AUDIO
  // 
  fileType: string;
  // 详细文件类型，在fileType为IMAGE时，当前仅支持MARKETING_IMAGE营销图片
  detailFileType: string;
  // 定向监测任务名称
  taskName?: string;
  // 幂等号，用于保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
  clientToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      submitType: 'submit_type',
      submitContent: 'submit_content',
      fileName: 'file_name',
      fileType: 'file_type',
      detailFileType: 'detail_file_type',
      taskName: 'task_name',
      clientToken: 'client_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      submitType: 'string',
      submitContent: 'string',
      fileName: 'string',
      fileType: 'string',
      detailFileType: 'string',
      taskName: 'string',
      clientToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDirectmonitorTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 监测任务id
  monitorTaskId?: string;
  // 是否存在相似结果
  isExistSimilar?: boolean;
  // 监测结果总数量
  monitorResultCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      monitorTaskId: 'monitor_task_id',
      isExistSimilar: 'is_exist_similar',
      monitorResultCount: 'monitor_result_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      monitorTaskId: 'string',
      isExistSimilar: 'boolean',
      monitorResultCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDirectmonitorResultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 监测任务id
  monitorTaskId: string;
  // 页面大小(1-200)
  pageSize: number;
  // 页码(>0)
  pageIndex: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      monitorTaskId: 'monitor_task_id',
      pageSize: 'page_size',
      pageIndex: 'page_index',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      monitorTaskId: 'string',
      pageSize: 'number',
      pageIndex: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDirectmonitorResultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 监测任务id
  monitorTaskId?: string;
  // 当前页面监测结果数量
  resultCount?: number;
  // 监测结果列表
  monitorResultList?: DirectMonitorResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      monitorTaskId: 'monitor_task_id',
      resultCount: 'result_count',
      monitorResultList: 'monitor_result_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      monitorTaskId: 'string',
      resultCount: 'number',
      monitorResultList: { 'type': 'array', 'itemType': DirectMonitorResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDciPreregistrationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 作品名称
  workName: string;
  // 作品类型
  workCategory: string;
  // 推荐作品分类
  recommendWorkCategory?: string;
  // 作品oss文件Id
  workFileId: string;
  // 文件类型
  fileType: string;
  // 创作信息
  creationInfo: DciCreationInfo;
  // 发表信息
  publicationInfo: DciPublicationInfo;
  // 作者姓名
  authorName: string;
  // 作者署名
  authorSignature?: string;
  // 原创声明
  originalStatement?: string;
  // 权利信息
  rightInfo: DciRightInfo;
  // 真实意愿表达信息
  preRegistrationTrueWill: string;
  // dci用户id
  dciUserId: string;
  // 代理信息
  proxyData: ProxyData;
  // 幂等字段
  clientToken: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      workName: 'work_name',
      workCategory: 'work_category',
      recommendWorkCategory: 'recommend_work_category',
      workFileId: 'work_file_id',
      fileType: 'file_type',
      creationInfo: 'creation_info',
      publicationInfo: 'publication_info',
      authorName: 'author_name',
      authorSignature: 'author_signature',
      originalStatement: 'original_statement',
      rightInfo: 'right_info',
      preRegistrationTrueWill: 'pre_registration_true_will',
      dciUserId: 'dci_user_id',
      proxyData: 'proxy_data',
      clientToken: 'client_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      workName: 'string',
      workCategory: 'string',
      recommendWorkCategory: 'string',
      workFileId: 'string',
      fileType: 'string',
      creationInfo: DciCreationInfo,
      publicationInfo: DciPublicationInfo,
      authorName: 'string',
      authorSignature: 'string',
      originalStatement: 'string',
      rightInfo: DciRightInfo,
      preRegistrationTrueWill: 'string',
      dciUserId: 'string',
      proxyData: ProxyData,
      clientToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDciPreregistrationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // dci内容id
  dciContentId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      dciContentId: 'dci_content_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      dciContentId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDciPreregistrationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // dci用户id
  dciUserId: string;
  // dci内容id
  dciContentId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dciUserId: 'dci_user_id',
      dciContentId: 'dci_content_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dciUserId: 'string',
      dciContentId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDciPreregistrationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 预登记状态
  status?: string;
  // 文件哈希
  fileHash?: string;
  // 文件哈希存证txHash
  fileHashTxHash?: string;
  // 文件哈希存证区块高度
  fileHashBlockHeight?: string;
  // dci编码
  dciCode?: string;
  // DCI码存证txHash
  dciCodeTxHash?: string;
  // DCI码存证高度
  dciCodeBlockHeight?: string;
  // DCI码fileHash存证txHash
  dciCodeFileTxHash?: string;
  // DCI码fileHash存证高度
  dciCodeFileBlockHeight?: string;
  // 预登记证书txhash
  preRegCertTxHash?: string;
  // 预登记证书存证高度
  preRegCertBlockHeight?: string;
  // 预登记取消txHash
  cancelTxHash?: string;
  // 预登记取消存证高度
  cancelBlockHeight?: string;
  // dciCode的可信时间戳信息
  dciCodeTsr?: string;
  // dciCode fileHash的可信时间戳信息
  dciCodeFileTsr?: string;
  // 预登记证书可信时间戳信息
  preRegCertTsr?: string;
  // 预登记证书oss fileId
  preRegCertFileId?: string;
  // 预登记证书fileHash
  preRegCertFileHash?: string;
  // 预览图oss fileId
  pngFileId?: string;
  // 公示地址
  publicationUrl?: string;
  // 申请发码时间
  applyObtainDate?: string;
  // DCI码创建时间
  dciCodeObtainDate?: string;
  // 错误原因
  errorReason?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      fileHash: 'file_hash',
      fileHashTxHash: 'file_hash_tx_hash',
      fileHashBlockHeight: 'file_hash_block_height',
      dciCode: 'dci_code',
      dciCodeTxHash: 'dci_code_tx_hash',
      dciCodeBlockHeight: 'dci_code_block_height',
      dciCodeFileTxHash: 'dci_code_file_tx_hash',
      dciCodeFileBlockHeight: 'dci_code_file_block_height',
      preRegCertTxHash: 'pre_reg_cert_tx_hash',
      preRegCertBlockHeight: 'pre_reg_cert_block_height',
      cancelTxHash: 'cancel_tx_hash',
      cancelBlockHeight: 'cancel_block_height',
      dciCodeTsr: 'dci_code_tsr',
      dciCodeFileTsr: 'dci_code_file_tsr',
      preRegCertTsr: 'pre_reg_cert_tsr',
      preRegCertFileId: 'pre_reg_cert_file_id',
      preRegCertFileHash: 'pre_reg_cert_file_hash',
      pngFileId: 'png_file_id',
      publicationUrl: 'publication_url',
      applyObtainDate: 'apply_obtain_date',
      dciCodeObtainDate: 'dci_code_obtain_date',
      errorReason: 'error_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      fileHash: 'string',
      fileHashTxHash: 'string',
      fileHashBlockHeight: 'string',
      dciCode: 'string',
      dciCodeTxHash: 'string',
      dciCodeBlockHeight: 'string',
      dciCodeFileTxHash: 'string',
      dciCodeFileBlockHeight: 'string',
      preRegCertTxHash: 'string',
      preRegCertBlockHeight: 'string',
      cancelTxHash: 'string',
      cancelBlockHeight: 'string',
      dciCodeTsr: 'string',
      dciCodeFileTsr: 'string',
      preRegCertTsr: 'string',
      preRegCertFileId: 'string',
      preRegCertFileHash: 'string',
      pngFileId: 'string',
      publicationUrl: 'string',
      applyObtainDate: 'string',
      dciCodeObtainDate: 'string',
      errorReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddDciUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户名称
  userName: string;
  // 用户类型
  userType: string;
  // 证件类型
  certificateType: string;
  // 证件号
  certificateNumber: string;
  // 证件有效期限起始日期
  certificateStartTime?: string;
  // 证件有效期限终止日期
  certificateEndTime?: string;
  // 证件正面OSS filePath
  certificateFrontFilePath: string;
  // 证件反面OSS filePath
  certificateBackFilePath?: string;
  // 手机号
  phone: string;
  // 地址
  address: string;
  // 用户身份开始时间
  identityStartTime: string;
  // 所属地区
  areaType: string;
  // 代理信息
  proxyData: ProxyData;
  // 幂等字段
  clientToken: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userName: 'user_name',
      userType: 'user_type',
      certificateType: 'certificate_type',
      certificateNumber: 'certificate_number',
      certificateStartTime: 'certificate_start_time',
      certificateEndTime: 'certificate_end_time',
      certificateFrontFilePath: 'certificate_front_file_path',
      certificateBackFilePath: 'certificate_back_file_path',
      phone: 'phone',
      address: 'address',
      identityStartTime: 'identity_start_time',
      areaType: 'area_type',
      proxyData: 'proxy_data',
      clientToken: 'client_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userName: 'string',
      userType: 'string',
      certificateType: 'string',
      certificateNumber: 'string',
      certificateStartTime: 'string',
      certificateEndTime: 'string',
      certificateFrontFilePath: 'string',
      certificateBackFilePath: 'string',
      phone: 'string',
      address: 'string',
      identityStartTime: 'string',
      areaType: 'string',
      proxyData: ProxyData,
      clientToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddDciUserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // dci用户id
  dciUserId?: string;
  // dci用户状态
  dciUserStatus?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      dciUserId: 'dci_user_id',
      dciUserStatus: 'dci_user_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      dciUserId: 'string',
      dciUserStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryDciPreregistrationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // dci用户id
  dciUserId: string;
  // dci内容id
  dciContentId: string;
  // 代理信息
  proxyData: ProxyData;
  // 幂等信息
  clientToken: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dciUserId: 'dci_user_id',
      dciContentId: 'dci_content_id',
      proxyData: 'proxy_data',
      clientToken: 'client_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dciUserId: 'string',
      dciContentId: 'string',
      proxyData: ProxyData,
      clientToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryDciPreregistrationResponse extends $tea.Model {
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

export class QueryDciUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 证件类型
  certificateType: string;
  // 证件号
  certificateNumber: string;
  // 手机号
  phone: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certificateType: 'certificate_type',
      certificateNumber: 'certificate_number',
      phone: 'phone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certificateType: 'string',
      certificateNumber: 'string',
      phone: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDciUserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // dci用户id
  dciUserId?: string;
  // dci用户状态
  dciUserStatus?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      dciUserId: 'dci_user_id',
      dciUserStatus: 'dci_user_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      dciUserId: 'string',
      dciUserStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDciPreregpublicationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 作品id
  dciContentId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dciContentId: 'dci_content_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dciContentId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDciPreregpublicationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 供核验公示地址
  publicationUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      publicationUrl: 'publication_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      publicationUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishGoodRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件id,最长64个字符
  fileId: string;
  // 商品标题，最长64个字符
  title: string;
  // 商品名称
  goodsName: string;
  // 商品分类
  classification?: string;
  // 售价（分）
  standardPriceInCent: number;
  // 上架/下架，默认上架
  goodsStatus?: string;
  // 发布时间，默认直接发布
  publishTime?: number;
  // 授权期限起始时间
  authStartTime: number;
  // 授权期限结束时间（传-1 则为永久）
  authEndTime: number;
  // 是否是作者
  isAuthor: boolean;
  // 作者姓名，如果isAuthor为false则必填，最长30个字符
  authorCertName?: string;
  // 作者身份证号,如果isAuthor为false则必填
  authorCertNo?: string;
  // 幂等号，可以保证请求的幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
  clientToken?: string;
  // 授权信息
  authInfo: AuthInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileId: 'file_id',
      title: 'title',
      goodsName: 'goods_name',
      classification: 'classification',
      standardPriceInCent: 'standard_price_in_cent',
      goodsStatus: 'goods_status',
      publishTime: 'publish_time',
      authStartTime: 'auth_start_time',
      authEndTime: 'auth_end_time',
      isAuthor: 'is_author',
      authorCertName: 'author_cert_name',
      authorCertNo: 'author_cert_no',
      clientToken: 'client_token',
      authInfo: 'auth_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileId: 'string',
      title: 'string',
      goodsName: 'string',
      classification: 'string',
      standardPriceInCent: 'number',
      goodsStatus: 'string',
      publishTime: 'number',
      authStartTime: 'number',
      authEndTime: 'number',
      isAuthor: 'boolean',
      authorCertName: 'string',
      authorCertNo: 'string',
      clientToken: 'string',
      authInfo: { 'type': 'array', 'itemType': AuthInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishGoodResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发布id
  pubilshId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pubilshId: 'pubilsh_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pubilshId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGoodsPublishRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 发布id
  pubilshId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pubilshId: 'pubilsh_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pubilshId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGoodsPublishResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发布id
  pubilshId?: string;
  // 发布状态
  publishStatus?: string;
  // 商品id
  goodsId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pubilshId: 'pubilsh_id',
      publishStatus: 'publish_status',
      goodsId: 'goods_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pubilshId: 'string',
      publishStatus: 'string',
      goodsId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateGoodsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商品id
  goodsId: string;
  // 商品价格（分）
  standardPriceInCent?: number;
  // 商品状态:上架，下架
  goodsStatus?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      goodsId: 'goods_id',
      standardPriceInCent: 'standard_price_in_cent',
      goodsStatus: 'goods_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      goodsId: 'string',
      standardPriceInCent: 'number',
      goodsStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateGoodsResponse extends $tea.Model {
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

export class QueryGoodsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商品id
  goodsId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      goodsId: 'goods_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      goodsId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGoodsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商品信息
  goodsInfo?: GoodsInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      goodsInfo: 'goods_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      goodsInfo: GoodsInfo,
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
          sdk_version: "1.15.11",
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
   * Description: 调用接口获取版权开放平台授权访问oss链接
   * Summary: 获取授权访问oss链接
   */
  async getUploadurl(request: GetUploadurlRequest): Promise<GetUploadurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getUploadurlEx(request, headers, runtime);
  }

  /**
   * Description: 调用接口获取版权开放平台授权访问oss链接
   * Summary: 获取授权访问oss链接
   */
  async getUploadurlEx(request: GetUploadurlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetUploadurlResponse> {
    Util.validateModel(request);
    return $tea.cast<GetUploadurlResponse>(await this.doRequest("1.0", "blockchain.bccr.uploadurl.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetUploadurlResponse({}));
  }

  /**
   * Description: 版权开发平台hash登记
   * Summary: 新增HASH版权登记
   */
  async addHashregister(request: AddHashregisterRequest): Promise<AddHashregisterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addHashregisterEx(request, headers, runtime);
  }

  /**
   * Description: 版权开发平台hash登记
   * Summary: 新增HASH版权登记
   */
  async addHashregisterEx(request: AddHashregisterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddHashregisterResponse> {
    Util.validateModel(request);
    return $tea.cast<AddHashregisterResponse>(await this.doRequest("1.0", "blockchain.bccr.hashregister.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddHashregisterResponse({}));
  }

  /**
   * Description: 版权平台新增版权登记
   * Summary: 新增版权登记
   */
  async addRegister(request: AddRegisterRequest): Promise<AddRegisterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addRegisterEx(request, headers, runtime);
  }

  /**
   * Description: 版权平台新增版权登记
   * Summary: 新增版权登记
   */
  async addRegisterEx(request: AddRegisterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddRegisterResponse> {
    Util.validateModel(request);
    return $tea.cast<AddRegisterResponse>(await this.doRequest("1.0", "blockchain.bccr.register.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddRegisterResponse({}));
  }

  /**
   * Description: 版权平台查询版权登记状态
   * Summary: 查询版权登记状态
   */
  async queryRegisterstatus(request: QueryRegisterstatusRequest): Promise<QueryRegisterstatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRegisterstatusEx(request, headers, runtime);
  }

  /**
   * Description: 版权平台查询版权登记状态
   * Summary: 查询版权登记状态
   */
  async queryRegisterstatusEx(request: QueryRegisterstatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRegisterstatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRegisterstatusResponse>(await this.doRequest("1.0", "blockchain.bccr.registerstatus.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRegisterstatusResponse({}));
  }

  /**
   * Description: 版权平台生成版权登记证书
   * Summary: 生成版权登记证书
   */
  async createCertificate(request: CreateCertificateRequest): Promise<CreateCertificateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCertificateEx(request, headers, runtime);
  }

  /**
   * Description: 版权平台生成版权登记证书
   * Summary: 生成版权登记证书
   */
  async createCertificateEx(request: CreateCertificateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCertificateResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCertificateResponse>(await this.doRequest("1.0", "blockchain.bccr.certificate.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCertificateResponse({}));
  }

  /**
   * Description: 版权平台获取版权登记证书
   * Summary: 获取版权登记证书
   */
  async getCertificate(request: GetCertificateRequest): Promise<GetCertificateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getCertificateEx(request, headers, runtime);
  }

  /**
   * Description: 版权平台获取版权登记证书
   * Summary: 获取版权登记证书
   */
  async getCertificateEx(request: GetCertificateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetCertificateResponse> {
    Util.validateModel(request);
    return $tea.cast<GetCertificateResponse>(await this.doRequest("1.0", "blockchain.bccr.certificate.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetCertificateResponse({}));
  }

  /**
   * Description: 新增版权监测任务
   * Summary: 新增版权监测
   */
  async createMonitorTask(request: CreateMonitorTaskRequest): Promise<CreateMonitorTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createMonitorTaskEx(request, headers, runtime);
  }

  /**
   * Description: 新增版权监测任务
   * Summary: 新增版权监测
   */
  async createMonitorTaskEx(request: CreateMonitorTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateMonitorTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateMonitorTaskResponse>(await this.doRequest("1.0", "blockchain.bccr.monitor.task.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateMonitorTaskResponse({}));
  }

  /**
   * Description: 停止版权监测任务
   * Summary: 停止版权监测
   */
  async stopMonitorTask(request: StopMonitorTaskRequest): Promise<StopMonitorTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.stopMonitorTaskEx(request, headers, runtime);
  }

  /**
   * Description: 停止版权监测任务
   * Summary: 停止版权监测
   */
  async stopMonitorTaskEx(request: StopMonitorTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StopMonitorTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<StopMonitorTaskResponse>(await this.doRequest("1.0", "blockchain.bccr.monitor.task.stop", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StopMonitorTaskResponse({}));
  }

  /**
   * Description: 查询版权监测任务
   * Summary: 查询版权监测
   */
  async queryMonitorTask(request: QueryMonitorTaskRequest): Promise<QueryMonitorTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMonitorTaskEx(request, headers, runtime);
  }

  /**
   * Description: 查询版权监测任务
   * Summary: 查询版权监测
   */
  async queryMonitorTaskEx(request: QueryMonitorTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMonitorTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMonitorTaskResponse>(await this.doRequest("1.0", "blockchain.bccr.monitor.task.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMonitorTaskResponse({}));
  }

  /**
   * Description: 查询版权任务监测结果
   * Summary: 查询版权监测结果
   */
  async queryMonitorResult(request: QueryMonitorResultRequest): Promise<QueryMonitorResultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMonitorResultEx(request, headers, runtime);
  }

  /**
   * Description: 查询版权任务监测结果
   * Summary: 查询版权监测结果
   */
  async queryMonitorResultEx(request: QueryMonitorResultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMonitorResultResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMonitorResultResponse>(await this.doRequest("1.0", "blockchain.bccr.monitor.result.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMonitorResultResponse({}));
  }

  /**
   * Description: 获取传播监测能力服务商列表
   * Summary: 获取传播监测能力服务商列表
   */
  async listMonitorProvider(request: ListMonitorProviderRequest): Promise<ListMonitorProviderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listMonitorProviderEx(request, headers, runtime);
  }

  /**
   * Description: 获取传播监测能力服务商列表
   * Summary: 获取传播监测能力服务商列表
   */
  async listMonitorProviderEx(request: ListMonitorProviderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListMonitorProviderResponse> {
    Util.validateModel(request);
    return $tea.cast<ListMonitorProviderResponse>(await this.doRequest("1.0", "blockchain.bccr.monitor.provider.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListMonitorProviderResponse({}));
  }

  /**
   * Description: 创建录屏取证(废弃)
   * Summary: 创建录屏取证(废弃)
   */
  async createRecodescreen(request: CreateRecodescreenRequest): Promise<CreateRecodescreenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createRecodescreenEx(request, headers, runtime);
  }

  /**
   * Description: 创建录屏取证(废弃)
   * Summary: 创建录屏取证(废弃)
   */
  async createRecodescreenEx(request: CreateRecodescreenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateRecodescreenResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateRecodescreenResponse>(await this.doRequest("1.0", "blockchain.bccr.recodescreen.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateRecodescreenResponse({}));
  }

  /**
   * Description: 查询录屏取证(废弃)
   * Summary: 查询录屏取证(废弃)
   */
  async queryRecodescreen(request: QueryRecodescreenRequest): Promise<QueryRecodescreenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRecodescreenEx(request, headers, runtime);
  }

  /**
   * Description: 查询录屏取证(废弃)
   * Summary: 查询录屏取证(废弃)
   */
  async queryRecodescreenEx(request: QueryRecodescreenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRecodescreenResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRecodescreenResponse>(await this.doRequest("1.0", "blockchain.bccr.recodescreen.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRecodescreenResponse({}));
  }

  /**
   * Description: 用户信息查询
   * Summary: 用户信息查询
   */
  async queryUser(request: QueryUserRequest): Promise<QueryUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUserEx(request, headers, runtime);
  }

  /**
   * Description: 用户信息查询
   * Summary: 用户信息查询
   */
  async queryUserEx(request: QueryUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUserResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUserResponse>(await this.doRequest("1.0", "blockchain.bccr.user.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUserResponse({}));
  }

  /**
   * Description: 查询用户信息列表
   * Summary: 查询用户信息列表
   */
  async queryUserList(request: QueryUserListRequest): Promise<QueryUserListResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUserListEx(request, headers, runtime);
  }

  /**
   * Description: 查询用户信息列表
   * Summary: 查询用户信息列表
   */
  async queryUserListEx(request: QueryUserListRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUserListResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUserListResponse>(await this.doRequest("1.0", "blockchain.bccr.user.list.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUserListResponse({}));
  }

  /**
   * Description: 创建网页取证
   * Summary: 创建网页取证
   */
  async createScreenshot(request: CreateScreenshotRequest): Promise<CreateScreenshotResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createScreenshotEx(request, headers, runtime);
  }

  /**
   * Description: 创建网页取证
   * Summary: 创建网页取证
   */
  async createScreenshotEx(request: CreateScreenshotRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateScreenshotResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateScreenshotResponse>(await this.doRequest("1.0", "blockchain.bccr.screenshot.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateScreenshotResponse({}));
  }

  /**
   * Description: 查询网页取证
   * Summary: 查询网页取证
   */
  async queryScreenshot(request: QueryScreenshotRequest): Promise<QueryScreenshotResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryScreenshotEx(request, headers, runtime);
  }

  /**
   * Description: 查询网页取证
   * Summary: 查询网页取证
   */
  async queryScreenshotEx(request: QueryScreenshotRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryScreenshotResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryScreenshotResponse>(await this.doRequest("1.0", "blockchain.bccr.screenshot.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryScreenshotResponse({}));
  }

  /**
   * Description: 链上核验
   * Summary: 链上核验
   */
  async verifyBlockchain(request: VerifyBlockchainRequest): Promise<VerifyBlockchainResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyBlockchainEx(request, headers, runtime);
  }

  /**
   * Description: 链上核验
   * Summary: 链上核验
   */
  async verifyBlockchainEx(request: VerifyBlockchainRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyBlockchainResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyBlockchainResponse>(await this.doRequest("1.0", "blockchain.bccr.blockchain.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyBlockchainResponse({}));
  }

  /**
   * Description: 创建录屏取证
   * Summary: 创建录屏取证
   */
  async createRecordscreen(request: CreateRecordscreenRequest): Promise<CreateRecordscreenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createRecordscreenEx(request, headers, runtime);
  }

  /**
   * Description: 创建录屏取证
   * Summary: 创建录屏取证
   */
  async createRecordscreenEx(request: CreateRecordscreenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateRecordscreenResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateRecordscreenResponse>(await this.doRequest("1.0", "blockchain.bccr.recordscreen.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateRecordscreenResponse({}));
  }

  /**
   * Description: 查询录屏取证
   * Summary: 查询录屏取证
   */
  async queryRecordscreen(request: QueryRecordscreenRequest): Promise<QueryRecordscreenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRecordscreenEx(request, headers, runtime);
  }

  /**
   * Description: 查询录屏取证
   * Summary: 查询录屏取证
   */
  async queryRecordscreenEx(request: QueryRecordscreenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRecordscreenResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRecordscreenResponse>(await this.doRequest("1.0", "blockchain.bccr.recordscreen.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRecordscreenResponse({}));
  }

  /**
   * Description: 获取支持的公证处列表
   * Summary: 获取支持的公证处列表
   */
  async listNotary(request: ListNotaryRequest): Promise<ListNotaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listNotaryEx(request, headers, runtime);
  }

  /**
   * Description: 获取支持的公证处列表
   * Summary: 获取支持的公证处列表
   */
  async listNotaryEx(request: ListNotaryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListNotaryResponse> {
    Util.validateModel(request);
    return $tea.cast<ListNotaryResponse>(await this.doRequest("1.0", "blockchain.bccr.notary.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListNotaryResponse({}));
  }

  /**
   * Description: 新增版权定向监测任务
   * Summary: 新增版权定向监测
   */
  async createDirectmonitorTask(request: CreateDirectmonitorTaskRequest): Promise<CreateDirectmonitorTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDirectmonitorTaskEx(request, headers, runtime);
  }

  /**
   * Description: 新增版权定向监测任务
   * Summary: 新增版权定向监测
   */
  async createDirectmonitorTaskEx(request: CreateDirectmonitorTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDirectmonitorTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDirectmonitorTaskResponse>(await this.doRequest("1.0", "blockchain.bccr.directmonitor.task.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDirectmonitorTaskResponse({}));
  }

  /**
   * Description: 查询版权定向监测结果
   * Summary: 查询版权定向监测结果
   */
  async queryDirectmonitorResult(request: QueryDirectmonitorResultRequest): Promise<QueryDirectmonitorResultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDirectmonitorResultEx(request, headers, runtime);
  }

  /**
   * Description: 查询版权定向监测结果
   * Summary: 查询版权定向监测结果
   */
  async queryDirectmonitorResultEx(request: QueryDirectmonitorResultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDirectmonitorResultResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDirectmonitorResultResponse>(await this.doRequest("1.0", "blockchain.bccr.directmonitor.result.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDirectmonitorResultResponse({}));
  }

  /**
   * Description: DCI预登记
   * Summary: dci预登记
   */
  async createDciPreregistration(request: CreateDciPreregistrationRequest): Promise<CreateDciPreregistrationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDciPreregistrationEx(request, headers, runtime);
  }

  /**
   * Description: DCI预登记
   * Summary: dci预登记
   */
  async createDciPreregistrationEx(request: CreateDciPreregistrationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDciPreregistrationResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDciPreregistrationResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.preregistration.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDciPreregistrationResponse({}));
  }

  /**
   * Description: 查询dci预登记信息
   * Summary: 查询dci预登记信息
   */
  async queryDciPreregistration(request: QueryDciPreregistrationRequest): Promise<QueryDciPreregistrationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDciPreregistrationEx(request, headers, runtime);
  }

  /**
   * Description: 查询dci预登记信息
   * Summary: 查询dci预登记信息
   */
  async queryDciPreregistrationEx(request: QueryDciPreregistrationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDciPreregistrationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDciPreregistrationResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.preregistration.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDciPreregistrationResponse({}));
  }

  /**
   * Description: 注册dci账号
   * Summary: 注册dci账号
   */
  async addDciUser(request: AddDciUserRequest): Promise<AddDciUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addDciUserEx(request, headers, runtime);
  }

  /**
   * Description: 注册dci账号
   * Summary: 注册dci账号
   */
  async addDciUserEx(request: AddDciUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddDciUserResponse> {
    Util.validateModel(request);
    return $tea.cast<AddDciUserResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.user.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddDciUserResponse({}));
  }

  /**
   * Description: dci预登记再确认
   * Summary: dci预登记再确认
   */
  async retryDciPreregistration(request: RetryDciPreregistrationRequest): Promise<RetryDciPreregistrationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryDciPreregistrationEx(request, headers, runtime);
  }

  /**
   * Description: dci预登记再确认
   * Summary: dci预登记再确认
   */
  async retryDciPreregistrationEx(request: RetryDciPreregistrationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryDciPreregistrationResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryDciPreregistrationResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.preregistration.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryDciPreregistrationResponse({}));
  }

  /**
   * Description: 查询dci账号信息
   * Summary: 查询dci账号信息
   */
  async queryDciUser(request: QueryDciUserRequest): Promise<QueryDciUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDciUserEx(request, headers, runtime);
  }

  /**
   * Description: 查询dci账号信息
   * Summary: 查询dci账号信息
   */
  async queryDciUserEx(request: QueryDciUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDciUserResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDciUserResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.user.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDciUserResponse({}));
  }

  /**
   * Description: Dci预登记公示地址查询
   * Summary: Dci预登记公示地址查询
   */
  async queryDciPreregpublication(request: QueryDciPreregpublicationRequest): Promise<QueryDciPreregpublicationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDciPreregpublicationEx(request, headers, runtime);
  }

  /**
   * Description: Dci预登记公示地址查询
   * Summary: Dci预登记公示地址查询
   */
  async queryDciPreregpublicationEx(request: QueryDciPreregpublicationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDciPreregpublicationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDciPreregpublicationResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.preregpublication.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDciPreregpublicationResponse({}));
  }

  /**
   * Description: 商品发布
   * Summary: 商品发布
   */
  async publishGood(request: PublishGoodRequest): Promise<PublishGoodResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.publishGoodEx(request, headers, runtime);
  }

  /**
   * Description: 商品发布
   * Summary: 商品发布
   */
  async publishGoodEx(request: PublishGoodRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PublishGoodResponse> {
    Util.validateModel(request);
    return $tea.cast<PublishGoodResponse>(await this.doRequest("1.0", "blockchain.bccr.good.publish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PublishGoodResponse({}));
  }

  /**
   * Description: 商品发布查询
   * Summary: 商品发布查询
   */
  async queryGoodsPublish(request: QueryGoodsPublishRequest): Promise<QueryGoodsPublishResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGoodsPublishEx(request, headers, runtime);
  }

  /**
   * Description: 商品发布查询
   * Summary: 商品发布查询
   */
  async queryGoodsPublishEx(request: QueryGoodsPublishRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGoodsPublishResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGoodsPublishResponse>(await this.doRequest("1.0", "blockchain.bccr.goods.publish.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGoodsPublishResponse({}));
  }

  /**
   * Description: 商品更新
   * Summary: 商品更新
   */
  async updateGoods(request: UpdateGoodsRequest): Promise<UpdateGoodsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateGoodsEx(request, headers, runtime);
  }

  /**
   * Description: 商品更新
   * Summary: 商品更新
   */
  async updateGoodsEx(request: UpdateGoodsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateGoodsResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateGoodsResponse>(await this.doRequest("1.0", "blockchain.bccr.goods.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateGoodsResponse({}));
  }

  /**
   * Description: 商品查询
   * Summary: 商品查询
   */
  async queryGoods(request: QueryGoodsRequest): Promise<QueryGoodsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGoodsEx(request, headers, runtime);
  }

  /**
   * Description: 商品查询
   * Summary: 商品查询
   */
  async queryGoodsEx(request: QueryGoodsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGoodsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGoodsResponse>(await this.doRequest("1.0", "blockchain.bccr.goods.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGoodsResponse({}));
  }

}
