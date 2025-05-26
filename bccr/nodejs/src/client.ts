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

// 相似位置信息
export class ResemblePositionData extends $tea.Model {
  // 起始位置
  startPosition: number;
  // 结束位置
  endPosition: number;
  static names(): { [key: string]: string } {
    return {
      startPosition: 'start_position',
      endPosition: 'end_position',
    };
  }

  static types(): { [key: string]: any } {
    return {
      startPosition: 'number',
      endPosition: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 出证用户（申请人，经办人）
export class NotaryUser extends $tea.Model {
  // 用户类型
  userType: string;
  // 用户名称
  userName: string;
  // 用户账号
  userAccount?: string;
  // 证件类型
  certType: string;
  // 证件号
  certNo: string;
  // 联系电话
  phone?: string;
  // 法定代表人姓名,用户类型为机构时必填
  legalPersonName?: string;
  // 法定代表人证件号码,用户类型为机构时必填
  legalPersonCertNo?: string;
  // 法定代表人证件类型
  legalPersonCertType?: string;
  // 身份证正面
  certFrontFile?: string;
  // 身份证反面
  certBackFile?: string;
  // 企业营业执照
  enterpriseCertFile?: string;
  static names(): { [key: string]: string } {
    return {
      userType: 'user_type',
      userName: 'user_name',
      userAccount: 'user_account',
      certType: 'cert_type',
      certNo: 'cert_no',
      phone: 'phone',
      legalPersonName: 'legal_person_name',
      legalPersonCertNo: 'legal_person_cert_no',
      legalPersonCertType: 'legal_person_cert_type',
      certFrontFile: 'cert_front_file',
      certBackFile: 'cert_back_file',
      enterpriseCertFile: 'enterprise_cert_file',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userType: 'string',
      userName: 'string',
      userAccount: 'string',
      certType: 'string',
      certNo: 'string',
      phone: 'string',
      legalPersonName: 'string',
      legalPersonCertNo: 'string',
      legalPersonCertType: 'string',
      certFrontFile: 'string',
      certBackFile: 'string',
      enterpriseCertFile: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 事由
export class Reason extends $tea.Model {
  // 事由ID
  reasonId: string;
  // 事由名称
  reasonName: string;
  // 附件文字说明
  comment: string;
  // 排序
  sort: number;
  // 是否必须上传附件
  isNeedAttachment: boolean;
  static names(): { [key: string]: string } {
    return {
      reasonId: 'reason_id',
      reasonName: 'reason_name',
      comment: 'comment',
      sort: 'sort',
      isNeedAttachment: 'is_need_attachment',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reasonId: 'string',
      reasonName: 'string',
      comment: 'string',
      sort: 'number',
      isNeedAttachment: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 相似的明细结果
export class ResembleDetail extends $tea.Model {
  // 相似分数
  score: string;
  // 长度
  length?: string;
  // 明细类型，例如VIDEO_SEGMENT表示视频区间相似
  type: string;
  // 查询源文件的位置信息
  queryPositionData: ResemblePositionData;
  // 相似文件的位置信息
  matchPositionData: ResemblePositionData;
  static names(): { [key: string]: string } {
    return {
      score: 'score',
      length: 'length',
      type: 'type',
      queryPositionData: 'query_position_data',
      matchPositionData: 'match_position_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      score: 'string',
      length: 'string',
      type: 'string',
      queryPositionData: ResemblePositionData,
      matchPositionData: ResemblePositionData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 收件人信息
export class DeliveryInfo extends $tea.Model {
  // 收件人姓名
  receiveName: string;
  // 联系电话
  contact: string;
  // 省（需要接收纸质文件时必填）
  province?: string;
  // 市（需要接收纸质文件时必填）
  city?: string;
  // 区（需要接收纸质文件时必填）
  area?: string;
  // 详细地址（需要接收纸质文件时必填）
  address?: string;
  // 电子邮箱（需要接收电子文件时必填）
  email?: string;
  static names(): { [key: string]: string } {
    return {
      receiveName: 'receive_name',
      contact: 'contact',
      province: 'province',
      city: 'city',
      area: 'area',
      address: 'address',
      email: 'email',
    };
  }

  static types(): { [key: string]: any } {
    return {
      receiveName: 'string',
      contact: 'string',
      province: 'string',
      city: 'string',
      area: 'string',
      address: 'string',
      email: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 作品相似识别结果
export class ResembleRiskData extends $tea.Model {
  // 重复作品ID
  workId: string;
  // 相似作品的名称
  workName?: string;
  // 相似作品的类型
  workType?: string;
  // 相似值
  score?: string;
  // 相似作品下载凭证
  workFileId?: string;
  // 相似明细
  resembleDetails?: ResembleDetail[];
  static names(): { [key: string]: string } {
    return {
      workId: 'work_id',
      workName: 'work_name',
      workType: 'work_type',
      score: 'score',
      workFileId: 'work_file_id',
      resembleDetails: 'resemble_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      workId: 'string',
      workName: 'string',
      workType: 'string',
      score: 'string',
      workFileId: 'string',
      resembleDetails: { 'type': 'array', 'itemType': ResembleDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 安全识别结果
export class ContentRiskData extends $tea.Model {
  // 风险名称
  riskName: string;
  // 风险是否通过审查
  riskResult: boolean;
  static names(): { [key: string]: string } {
    return {
      riskName: 'risk_name',
      riskResult: 'risk_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      riskName: 'string',
      riskResult: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 作品标签识别结果
export class LabelRiskData extends $tea.Model {
  // 识别出的标签名称
  labelName: string;
  // 识别出的标签是否与用户选择的标签匹配
  isMatch: boolean;
  // 识别出的标签匹配度
  matchValue: string;
  static names(): { [key: string]: string } {
    return {
      labelName: 'label_name',
      isMatch: 'is_match',
      matchValue: 'match_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      labelName: 'string',
      isMatch: 'boolean',
      matchValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 费用分项
export class FeeDetail extends $tea.Model {
  // 费用描述
  feeDesc: string;
  // 费用
  amount: string;
  static names(): { [key: string]: string } {
    return {
      feeDesc: 'fee_desc',
      amount: 'amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      feeDesc: 'string',
      amount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 证据文件信息
export class EvidInfo extends $tea.Model {
  // 取证ID
  evidenceId: string;
  // 取证人
  witness: NotaryUser;
  static names(): { [key: string]: string } {
    return {
      evidenceId: 'evidence_id',
      witness: 'witness',
    };
  }

  static types(): { [key: string]: any } {
    return {
      evidenceId: 'string',
      witness: NotaryUser,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 公证申请出证规则
export class NotaryOrderRule extends $tea.Model {
  // 公证出证支持公证书类型
  orderType?: string;
  static names(): { [key: string]: string } {
    return {
      orderType: 'order_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderType: 'string',
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

// 网页取证具体信息
export class ScreenshotInfo extends $tea.Model {
  // 全链路取证日志文件下载链接
  processLogFile?: string;
  // 全链路取证日志文件哈希
  processLogFileHash?: string;
  // 自清洁文件下载链接
  checkLogFile?: string;
  // 自清洁文件哈希
  checkLogFileHash?: string;
  // 网页截图文件下载链接
  screenshotFile: string;
  // 网页截图文件哈希
  screenshotFileHash?: string;
  // 日志打包文件hash
  logZipFileHash?: string;
  // 日志文件上链hash
  logZipTxHash?: string;
  static names(): { [key: string]: string } {
    return {
      processLogFile: 'process_log_file',
      processLogFileHash: 'process_log_file_hash',
      checkLogFile: 'check_log_file',
      checkLogFileHash: 'check_log_file_hash',
      screenshotFile: 'screenshot_file',
      screenshotFileHash: 'screenshot_file_hash',
      logZipFileHash: 'log_zip_file_hash',
      logZipTxHash: 'log_zip_tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      processLogFile: 'string',
      processLogFileHash: 'string',
      checkLogFile: 'string',
      checkLogFileHash: 'string',
      screenshotFile: 'string',
      screenshotFileHash: 'string',
      logZipFileHash: 'string',
      logZipTxHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 取证网址信息
export class EvidenceWebUrlInfo extends $tea.Model {
  // 取证网址
  webUrl: string;
  // 取证名称
  title?: string;
  static names(): { [key: string]: string } {
    return {
      webUrl: 'web_url',
      title: 'title',
    };
  }

  static types(): { [key: string]: any } {
    return {
      webUrl: 'string',
      title: 'string',
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
  // 全链路取证日志文件哈希
  processLogFileHash?: string;
  // 自清洁文件下载地址
  checkLogFile?: string;
  // 自清洁文件哈希
  checkLogFileHash?: string;
  // 网页截图文件下载链接
  webScreenshotFile?: string;
  // 网页截图文件哈希
  webScreenshotFileHash?: string;
  // 网页源码文件下载链接
  webSourceFile?: string;
  // 网页源码文件哈希
  webSourceFileHash?: string;
  // 视频源文件下载链接
  videoFile?: string;
  // 视频源文件哈希
  videoFileHash?: string;
  // 手机自清洁文件下载链接
  extendDeviceCheckFile?: string;
  // 手机自清洁文件哈希
  extendDeviceCheckFileHash?: string;
  // 手机操作日志下载链接
  extendDeviceProcessFile?: string;
  // 手机操作日志哈希
  extendDeviceProcessFileHash?: string;
  // 日志打包文件hash
  logZipFileHash?: string;
  // 日志打包文件上链hash
  logZipTxHash?: string;
  static names(): { [key: string]: string } {
    return {
      processLogFile: 'process_log_file',
      processLogFileHash: 'process_log_file_hash',
      checkLogFile: 'check_log_file',
      checkLogFileHash: 'check_log_file_hash',
      webScreenshotFile: 'web_screenshot_file',
      webScreenshotFileHash: 'web_screenshot_file_hash',
      webSourceFile: 'web_source_file',
      webSourceFileHash: 'web_source_file_hash',
      videoFile: 'video_file',
      videoFileHash: 'video_file_hash',
      extendDeviceCheckFile: 'extend_device_check_file',
      extendDeviceCheckFileHash: 'extend_device_check_file_hash',
      extendDeviceProcessFile: 'extend_device_process_file',
      extendDeviceProcessFileHash: 'extend_device_process_file_hash',
      logZipFileHash: 'log_zip_file_hash',
      logZipTxHash: 'log_zip_tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      processLogFile: 'string',
      processLogFileHash: 'string',
      checkLogFile: 'string',
      checkLogFileHash: 'string',
      webScreenshotFile: 'string',
      webScreenshotFileHash: 'string',
      webSourceFile: 'string',
      webSourceFileHash: 'string',
      videoFile: 'string',
      videoFileHash: 'string',
      extendDeviceCheckFile: 'string',
      extendDeviceCheckFileHash: 'string',
      extendDeviceProcessFile: 'string',
      extendDeviceProcessFileHash: 'string',
      logZipFileHash: 'string',
      logZipTxHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 出证开票信息
export class NotaryInvoiceInfo extends $tea.Model {
  // 开票类型
  billingType: string;
  // 发票类型
  invoiceType: string;
  // 主体类型
  subjectType: string;
  // 发票抬头
  invoiceName: string;
  // 纳税人识别号
  ratepayerCode?: string;
  // 开户行
  bankType?: string;
  // 开户行账号
  bankAccount?: string;
  // 单位地址
  unitAddress?: string;
  // 单位电话
  unitPhone?: string;
  // 发票收件信息
  delivery?: DeliveryInfo;
  static names(): { [key: string]: string } {
    return {
      billingType: 'billing_type',
      invoiceType: 'invoice_type',
      subjectType: 'subject_type',
      invoiceName: 'invoice_name',
      ratepayerCode: 'ratepayer_code',
      bankType: 'bank_type',
      bankAccount: 'bank_account',
      unitAddress: 'unit_address',
      unitPhone: 'unit_phone',
      delivery: 'delivery',
    };
  }

  static types(): { [key: string]: any } {
    return {
      billingType: 'string',
      invoiceType: 'string',
      subjectType: 'string',
      invoiceName: 'string',
      ratepayerCode: 'string',
      bankType: 'string',
      bankAccount: 'string',
      unitAddress: 'string',
      unitPhone: 'string',
      delivery: DeliveryInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 在售摘要信息
export class SaleDigestData extends $tea.Model {
  // 商品hash值
  hash: string;
  // 物料置信度
  score: string;
  static names(): { [key: string]: string } {
    return {
      hash: 'hash',
      score: 'score',
    };
  }

  static types(): { [key: string]: any } {
    return {
      hash: 'string',
      score: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 取证文件信息
export class EvidenceFile extends $tea.Model {
  // 证据文件名称
  evidenceFileName: string;
  // 证据文件备注
  memo: string;
  // 文件类型
  evidenceFileType: string;
  // 文件大小
  evidenceFileSize: number;
  // 文件时长（单位：秒）
  duration: number;
  // 证据文件指纹
  evidenceFileHash: string;
  // 文件url
  fileUrl: string;
  static names(): { [key: string]: string } {
    return {
      evidenceFileName: 'evidence_file_name',
      memo: 'memo',
      evidenceFileType: 'evidence_file_type',
      evidenceFileSize: 'evidence_file_size',
      duration: 'duration',
      evidenceFileHash: 'evidence_file_hash',
      fileUrl: 'file_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      evidenceFileName: 'string',
      memo: 'string',
      evidenceFileType: 'string',
      evidenceFileSize: 'number',
      duration: 'number',
      evidenceFileHash: 'string',
      fileUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 申办事由
export class BidReason extends $tea.Model {
  // 事由类别ID
  categoryId: string;
  // 分类名称
  categoryName: string;
  // 描述
  desc: string;
  // 文件上传描述
  fileUploadDesc: string;
  // 排序
  rank: number;
  // 是否必须上传证明文件
  isNeedTestifyFile: boolean;
  // reasonArray
  reasonArray: Reason[];
  static names(): { [key: string]: string } {
    return {
      categoryId: 'category_id',
      categoryName: 'category_name',
      desc: 'desc',
      fileUploadDesc: 'file_upload_desc',
      rank: 'rank',
      isNeedTestifyFile: 'is_need_testify_file',
      reasonArray: 'reason_array',
    };
  }

  static types(): { [key: string]: any } {
    return {
      categoryId: 'string',
      categoryName: 'string',
      desc: 'string',
      fileUploadDesc: 'string',
      rank: 'number',
      isNeedTestifyFile: 'boolean',
      reasonArray: { 'type': 'array', 'itemType': Reason },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 存证证明信息
export class EvidenceCertificateInfo extends $tea.Model {
  // 证书编号
  certificateNo: string;
  // 上链时间
  certificateTime: string;
  // 链上交易hash
  certificateHash: string;
  // 证书下载url（有效期3天）
  certificateUrl: string;
  static names(): { [key: string]: string } {
    return {
      certificateNo: 'certificate_no',
      certificateTime: 'certificate_time',
      certificateHash: 'certificate_hash',
      certificateUrl: 'certificate_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      certificateNo: 'string',
      certificateTime: 'string',
      certificateHash: 'string',
      certificateUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 公证书送达信息
export class ReceiveInfo extends $tea.Model {
  // 纸质公证书份数
  copies?: number;
  // 公证书类型
  orderType: string;
  // 收件人信息
  deliveryInfo: DeliveryInfo;
  static names(): { [key: string]: string } {
    return {
      copies: 'copies',
      orderType: 'order_type',
      deliveryInfo: 'delivery_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      copies: 'number',
      orderType: 'string',
      deliveryInfo: DeliveryInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 服务商下工作人员
export class IsvWorkerInfoVO extends $tea.Model {
  // 工作人员账号id
  workerAccountId: string;
  // 工作人员姓名
  workerName: string;
  static names(): { [key: string]: string } {
    return {
      workerAccountId: 'worker_account_id',
      workerName: 'worker_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      workerAccountId: 'string',
      workerName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 日统计数据模型
export class DayStatisticsInfo extends $tea.Model {
  // 日期时间戳
  date: number;
  // 日观看次数
  dayViews: string;
  // 日观看时长
  dayViewDuration: string;
  // 日平均观看时长
  dayAverageViewDuration: string;
  // 日预计收入
  revenue: string;
  static names(): { [key: string]: string } {
    return {
      date: 'date',
      dayViews: 'day_views',
      dayViewDuration: 'day_view_duration',
      dayAverageViewDuration: 'day_average_view_duration',
      revenue: 'revenue',
    };
  }

  static types(): { [key: string]: any } {
    return {
      date: 'number',
      dayViews: 'string',
      dayViewDuration: 'string',
      dayAverageViewDuration: 'string',
      revenue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 作品是否包含图片
export class ContainsImageInfo extends $tea.Model {
  // 是否包含图片
  containsImage?: boolean;
  // 包含图片，处理后的图片副件
  resolvedFileUrl?: string;
  static names(): { [key: string]: string } {
    return {
      containsImage: 'contains_image',
      resolvedFileUrl: 'resolved_file_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      containsImage: 'boolean',
      resolvedFileUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 系列图错误原因
export class SeriesDiagramErrorReason extends $tea.Model {
  // 系列图单个图片所属页码
  imagePdfPageIndex: number;
  // 错误原因英文
  error: string;
  // 错误原因中文
  errorCn: string;
  static names(): { [key: string]: string } {
    return {
      imagePdfPageIndex: 'image_pdf_page_index',
      error: 'error',
      errorCn: 'error_cn',
    };
  }

  static types(): { [key: string]: any } {
    return {
      imagePdfPageIndex: 'number',
      error: 'string',
      errorCn: 'string',
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

// 服务商工作人员列表
export class IsvWorkerInfoVOList extends $tea.Model {
  // 服务商下工作人员信息列表
  isvWorkerInfoList: IsvWorkerInfoVO[];
  static names(): { [key: string]: string } {
    return {
      isvWorkerInfoList: 'isv_worker_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      isvWorkerInfoList: { 'type': 'array', 'itemType': IsvWorkerInfoVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单明细
export class OrderItem extends $tea.Model {
  // 项目ID
  itemId: string;
  // 项目类型（数登申请）
  itemType: string;
  static names(): { [key: string]: string } {
    return {
      itemId: 'item_id',
      itemType: 'item_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      itemId: 'string',
      itemType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 网页截图存证结果
export class ScreenshotCertificateResult extends $tea.Model {
  // 证据类型
  evidenceType: string;
  // 证据状态
  status: string;
  // 网页截取编号
  screenshotId: string;
  // 证据编号
  evidenceId: string;
  // 存证编号
  certificateNo: string;
  // 上链时间
  certificateTime: number;
  // 证据hash
  evidenceHash: string;
  // 链上交易hash
  evidenceTxHash: string;
  // 证书下载链接
  certificateFileUrl: string;
  // 截图文件下载链接
  screenshotFileUrl: string;
  // 证据文件大小
  evidenceFileSize: number;
  // 错误码
  errorCode: string;
  // 错误信息
  errorMessage: string;
  static names(): { [key: string]: string } {
    return {
      evidenceType: 'evidence_type',
      status: 'status',
      screenshotId: 'screenshot_id',
      evidenceId: 'evidence_id',
      certificateNo: 'certificate_no',
      certificateTime: 'certificate_time',
      evidenceHash: 'evidence_hash',
      evidenceTxHash: 'evidence_tx_hash',
      certificateFileUrl: 'certificate_file_url',
      screenshotFileUrl: 'screenshot_file_url',
      evidenceFileSize: 'evidence_file_size',
      errorCode: 'error_code',
      errorMessage: 'error_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      evidenceType: 'string',
      status: 'string',
      screenshotId: 'string',
      evidenceId: 'string',
      certificateNo: 'string',
      certificateTime: 'number',
      evidenceHash: 'string',
      evidenceTxHash: 'string',
      certificateFileUrl: 'string',
      screenshotFileUrl: 'string',
      evidenceFileSize: 'number',
      errorCode: 'string',
      errorMessage: 'string',
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
  // 公证处隶属
  belong: string;
  // 公证处出证规则
  notaryOrderRule?: NotaryOrderRule;
  // 是否允许出证
  allowCertification?: boolean;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      name: 'name',
      province: 'province',
      city: 'city',
      orgName: 'org_name',
      belong: 'belong',
      notaryOrderRule: 'notary_order_rule',
      allowCertification: 'allow_certification',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      name: 'string',
      province: 'string',
      city: 'string',
      orgName: 'string',
      belong: 'string',
      notaryOrderRule: NotaryOrderRule,
      allowCertification: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 本次申请中每一类证据的数量明细
export class NotaryFeeEvidTypeData extends $tea.Model {
  // 证据类型描述
  evidTypeDesc: string;
  // 证据分类及数量详情
  evidTypeDetail: string;
  static names(): { [key: string]: string } {
    return {
      evidTypeDesc: 'evid_type_desc',
      evidTypeDetail: 'evid_type_detail',
    };
  }

  static types(): { [key: string]: any } {
    return {
      evidTypeDesc: 'string',
      evidTypeDetail: 'string',
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
  firstPublicationPlace?: string;
  // 首次发表地点地区编码
  firstPublicationCode: string;
  static names(): { [key: string]: string } {
    return {
      publicationStatus: 'publication_status',
      firstPublicationDate: 'first_publication_date',
      firstPublicationPlace: 'first_publication_place',
      firstPublicationCode: 'first_publication_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      publicationStatus: 'string',
      firstPublicationDate: 'string',
      firstPublicationPlace: 'string',
      firstPublicationCode: 'string',
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
  creationCompletionPlace?: string;
  // 作品创作地点地区编码
  creationCompletionCode: string;
  static names(): { [key: string]: string } {
    return {
      creationNature: 'creation_nature',
      creationCompletionDate: 'creation_completion_date',
      creationCompletionPlace: 'creation_completion_place',
      creationCompletionCode: 'creation_completion_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      creationNature: 'string',
      creationCompletionDate: 'string',
      creationCompletionPlace: 'string',
      creationCompletionCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 本次需支付费用的分项明细
export class NotaryFeeItem extends $tea.Model {
  // 费用分项描述
  feeItemDesc: string;
  // 费用分项金额(分)
  feeItemAmountRmbFen: number;
  // 费用分项详情列表
  feeDetailList: FeeDetail[];
  static names(): { [key: string]: string } {
    return {
      feeItemDesc: 'fee_item_desc',
      feeItemAmountRmbFen: 'fee_item_amount_rmb_fen',
      feeDetailList: 'fee_detail_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      feeItemDesc: 'string',
      feeItemAmountRmbFen: 'number',
      feeDetailList: { 'type': 'array', 'itemType': FeeDetail },
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

// 公证出证拒绝办理信息/终止信息
export class RefuseInfo extends $tea.Model {
  // 拒绝理由/终止备注
  reason: string;
  // 不予办理决定书路径/终止决定书路径
  notificationPath: string;
  static names(): { [key: string]: string } {
    return {
      reason: 'reason',
      notificationPath: 'notification_path',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reason: 'string',
      notificationPath: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 骑行保平台任务详情
export class InsuranceTaskDetailInfo extends $tea.Model {
  // 用户备注
  userMemo?: string;
  // 上门人员姓名
  doorToDoorWorkerName?: string;
  // 电池包装码
  batteryPackagingCode?: string;
  // 电池码
  batteryCode?: string;
  // 图片列表
  installImages?: string[];
  // 任务id
  taskId: string;
  // 任务状态
  taskStatus: string;
  // 电池型号
  batteryType: string;
  // 上门地址
  serviceAddress: string;
  // 租赁人姓名
  batteryRenterName: string;
  // 租赁人电话
  batteryRenterPhone: string;
  // 上门时间
  serviceTime: string;
  // 任务所属服务商账号id
  isvAccountId: string;
  static names(): { [key: string]: string } {
    return {
      userMemo: 'user_memo',
      doorToDoorWorkerName: 'door_to_door_worker_name',
      batteryPackagingCode: 'battery_packaging_code',
      batteryCode: 'battery_code',
      installImages: 'install_images',
      taskId: 'task_id',
      taskStatus: 'task_status',
      batteryType: 'battery_type',
      serviceAddress: 'service_address',
      batteryRenterName: 'battery_renter_name',
      batteryRenterPhone: 'battery_renter_phone',
      serviceTime: 'service_time',
      isvAccountId: 'isv_account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userMemo: 'string',
      doorToDoorWorkerName: 'string',
      batteryPackagingCode: 'string',
      batteryCode: 'string',
      installImages: { 'type': 'array', 'itemType': 'string' },
      taskId: 'string',
      taskStatus: 'string',
      batteryType: 'string',
      serviceAddress: 'string',
      batteryRenterName: 'string',
      batteryRenterPhone: 'string',
      serviceTime: 'string',
      isvAccountId: 'string',
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

// 版权商品库存
export class ItemInventoryVO extends $tea.Model {
  // 库存数量
  stock: number;
  // 生效时间
  gmtValid: string;
  // 失效时间
  gmtInvalid: string;
  static names(): { [key: string]: string } {
    return {
      stock: 'stock',
      gmtValid: 'gmt_valid',
      gmtInvalid: 'gmt_invalid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      stock: 'number',
      gmtValid: 'string',
      gmtInvalid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 出海视频统计数据
export class OverseaContentStatistics extends $tea.Model {
  // 发布视频id
  contentId: string;
  // 总观看次数
  totalViews: string;
  // 总观看时长
  totalViewDuration: string;
  // 总平均观看时长
  totalAverageViewDuration: string;
  // 总预计收入
  totalRevenue: string;
  // 每日详细统计列表
  dayStatisticsList: DayStatisticsInfo[];
  static names(): { [key: string]: string } {
    return {
      contentId: 'content_id',
      totalViews: 'total_views',
      totalViewDuration: 'total_view_duration',
      totalAverageViewDuration: 'total_average_view_duration',
      totalRevenue: 'total_revenue',
      dayStatisticsList: 'day_statistics_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      contentId: 'string',
      totalViews: 'string',
      totalViewDuration: 'string',
      totalAverageViewDuration: 'string',
      totalRevenue: 'string',
      dayStatisticsList: { 'type': 'array', 'itemType': DayStatisticsInfo },
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

// 线下取证存证结果
export class OfflineRegisterResult extends $tea.Model {
  // 取证文件
  evidenceFile?: EvidenceFile;
  // 线下取证ID
  offlineEvidenceId: string;
  // 错误码
  errorCode?: string;
  // 错误信息
  errorMessage?: string;
  // 取证状态
  status: string;
  // 取证时间
  evidenceTime?: number;
  // 委托取证ID
  evidenceAssignmentId?: string;
  // 取证用户ID
  evidenceUserId?: string;
  // 取证名称
  evidenceName?: string;
  // 公证处code
  notaryOfficeCode?: string;
  // 公证处名称
  notaryOfficeName?: string;
  // 经度
  longitude?: string;
  // 纬度
  latitude?: string;
  // 位置
  location?: string;
  // 取证开始时间
  evidenceStartTime?: number;
  // 取证结束时间
  evidenceEndTime?: number;
  // 取证类型
  evidenceType: string;
  // 存证编号
  certificateNo?: string;
  // 	
  // 上链时间
  certificateTime?: number;
  // 证据hash
  evidenceHash?: string;
  // 链上交易hash
  evidenceTxHash?: string;
  // 证书文件下载地址
  certificateFileUrl?: string;
  // 备注
  memo?: string;
  static names(): { [key: string]: string } {
    return {
      evidenceFile: 'evidence_file',
      offlineEvidenceId: 'offline_evidence_id',
      errorCode: 'error_code',
      errorMessage: 'error_message',
      status: 'status',
      evidenceTime: 'evidence_time',
      evidenceAssignmentId: 'evidence_assignment_id',
      evidenceUserId: 'evidence_user_id',
      evidenceName: 'evidence_name',
      notaryOfficeCode: 'notary_office_code',
      notaryOfficeName: 'notary_office_name',
      longitude: 'longitude',
      latitude: 'latitude',
      location: 'location',
      evidenceStartTime: 'evidence_start_time',
      evidenceEndTime: 'evidence_end_time',
      evidenceType: 'evidence_type',
      certificateNo: 'certificate_no',
      certificateTime: 'certificate_time',
      evidenceHash: 'evidence_hash',
      evidenceTxHash: 'evidence_tx_hash',
      certificateFileUrl: 'certificate_file_url',
      memo: 'memo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      evidenceFile: EvidenceFile,
      offlineEvidenceId: 'string',
      errorCode: 'string',
      errorMessage: 'string',
      status: 'string',
      evidenceTime: 'number',
      evidenceAssignmentId: 'string',
      evidenceUserId: 'string',
      evidenceName: 'string',
      notaryOfficeCode: 'string',
      notaryOfficeName: 'string',
      longitude: 'string',
      latitude: 'string',
      location: 'string',
      evidenceStartTime: 'number',
      evidenceEndTime: 'number',
      evidenceType: 'string',
      certificateNo: 'string',
      certificateTime: 'number',
      evidenceHash: 'string',
      evidenceTxHash: 'string',
      certificateFileUrl: 'string',
      memo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发票信息
export class InvoiceInfo extends $tea.Model {
  // 发票类型 InvoiceTypeEnum目前只支持普票
  // (NORMAL,ELC,普票)
  // (SPECIAL,VAT,专票)
  invoiceType: string;
  // 发票抬头（著作权人之一）
  invoiceHeader: string;
  // 纳税人识别号（机构必填）
  taxpayerNumber?: string;
  // 注册地址（专票必填）
  registeredAddress?: string;
  // 注册电话（专票必填）
  registeredTel?: string;
  // 开户电话（专票必填）
  openAccountTel?: string;
  // 开户银行（专票必填）
  openAccountBank?: string;
  // 银行账号（专票必填）
  bankAccount?: string;
  static names(): { [key: string]: string } {
    return {
      invoiceType: 'invoice_type',
      invoiceHeader: 'invoice_header',
      taxpayerNumber: 'taxpayer_number',
      registeredAddress: 'registered_address',
      registeredTel: 'registered_tel',
      openAccountTel: 'open_account_tel',
      openAccountBank: 'open_account_bank',
      bankAccount: 'bank_account',
    };
  }

  static types(): { [key: string]: any } {
    return {
      invoiceType: 'string',
      invoiceHeader: 'string',
      taxpayerNumber: 'string',
      registeredAddress: 'string',
      registeredTel: 'string',
      openAccountTel: 'string',
      openAccountBank: 'string',
      bankAccount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 公证出证送达信息
export class NotaryReceiveInfo extends $tea.Model {
  // 公证书类型
  orderType: string;
  // 公证书送达信息
  receiveInfo: ReceiveInfo;
  // 开票信息
  invoiceInfo?: NotaryInvoiceInfo;
  static names(): { [key: string]: string } {
    return {
      orderType: 'order_type',
      receiveInfo: 'receive_info',
      invoiceInfo: 'invoice_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderType: 'string',
      receiveInfo: ReceiveInfo,
      invoiceInfo: NotaryInvoiceInfo,
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

// 物流信息
export class ExpressInfo extends $tea.Model {
  // 材料类型
  type: string;
  // 收件人姓名
  name: string;
  // 收件人电话号码
  phone: string;
  // 邮箱地址
  email: string;
  // 快递名称
  expressName: string;
  // 快递单号
  trackingNumber: string;
  // 材料发出时间戳
  sendTime: number;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      name: 'name',
      phone: 'phone',
      email: 'email',
      expressName: 'express_name',
      trackingNumber: 'tracking_number',
      sendTime: 'send_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      name: 'string',
      phone: 'string',
      email: 'string',
      expressName: 'string',
      trackingNumber: 'string',
      sendTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 播放列表实体类
export class PlayListEntity extends $tea.Model {
  // 播放列表名称，可包含多个视频
  playListName: string;
  // 表示授权类型，仅支持EXCLUSIVE，表示独家
  // 默认EXCLUSIVE
  authorizeType?: string;
  // 授权类型范围，仅支持OVERSEA，表示全海外
  // 默认OVERSEA
  authorizeScopeType?: string;
  // 维权类型，仅支持CONTAIN_PROTECT，表示包含维权
  // 默认CONTAIN_PROTECT
  protectRightsType?: string;
  // 维权类型范围，仅支持OVERSEA，表示全海外
  // 默认OVERSEA
  protectRightsScopeType?: string;
  // 内容授权开始日期yyyy-MM-dd
  authorizationStartDate: string;
  // 内容授权时长,单位：年，目前支持1~3年，
  // 注意结束时间即开始时间 + 授权时长 不能早于当前时间
  authorizationTimeLength: number;
  // 内容授权平台列表：
  //        默认授权平台都会进行运营，当前仅支持YOUTUBE
  authPlatform?: string[];
  static names(): { [key: string]: string } {
    return {
      playListName: 'play_list_name',
      authorizeType: 'authorize_type',
      authorizeScopeType: 'authorize_scope_type',
      protectRightsType: 'protect_rights_type',
      protectRightsScopeType: 'protect_rights_scope_type',
      authorizationStartDate: 'authorization_start_date',
      authorizationTimeLength: 'authorization_time_length',
      authPlatform: 'auth_platform',
    };
  }

  static types(): { [key: string]: any } {
    return {
      playListName: 'string',
      authorizeType: 'string',
      authorizeScopeType: 'string',
      protectRightsType: 'string',
      protectRightsScopeType: 'string',
      authorizationStartDate: 'string',
      authorizationTimeLength: 'number',
      authPlatform: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 录屏取证结果
export class RecordScreenResult extends $tea.Model {
  // 取证类型(SCREEN_RECORDING：录屏取证)
  evidenceType: string;
  // 取证状态
  status: string;
  // 证据编号
  evidenceId: string;
  // 存证编号
  certificateNo: string;
  // 上链时间
  certificateTime: number;
  // 证据hash
  evidenceHash: string;
  // 链上交易hash
  evidenceTxHash: string;
  // 证书文件下载地址
  certificateFileUrl?: string;
  // 录屏取证文件列表
  evidenceFiles?: EvidenceFile[];
  // 录屏开始时间
  evidenceStartTime: number;
  // 录屏结束时间
  evidenceEndTime: number;
  // 错误码
  errorCode?: string;
  // 错误信息
  errorMessage: string;
  // 云桌面url
  operateUrl: string;
  static names(): { [key: string]: string } {
    return {
      evidenceType: 'evidence_type',
      status: 'status',
      evidenceId: 'evidence_id',
      certificateNo: 'certificate_no',
      certificateTime: 'certificate_time',
      evidenceHash: 'evidence_hash',
      evidenceTxHash: 'evidence_tx_hash',
      certificateFileUrl: 'certificate_file_url',
      evidenceFiles: 'evidence_files',
      evidenceStartTime: 'evidence_start_time',
      evidenceEndTime: 'evidence_end_time',
      errorCode: 'error_code',
      errorMessage: 'error_message',
      operateUrl: 'operate_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      evidenceType: 'string',
      status: 'string',
      evidenceId: 'string',
      certificateNo: 'string',
      certificateTime: 'number',
      evidenceHash: 'string',
      evidenceTxHash: 'string',
      certificateFileUrl: 'string',
      evidenceFiles: { 'type': 'array', 'itemType': EvidenceFile },
      evidenceStartTime: 'number',
      evidenceEndTime: 'number',
      errorCode: 'string',
      errorMessage: 'string',
      operateUrl: 'string',
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
  worksType?: string;
  // 作品类型英文标识
  worksTypeEn?: string;
  static names(): { [key: string]: string } {
    return {
      worksName: 'works_name',
      worksType: 'works_type',
      worksTypeEn: 'works_type_en',
    };
  }

  static types(): { [key: string]: any } {
    return {
      worksName: 'string',
      worksType: 'string',
      worksTypeEn: 'string',
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
  // 个人主页链接
  posterIdUrl?: string;
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
      posterIdUrl: 'poster_id_url',
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
      posterIdUrl: 'string',
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
  // 证据包文件hash
  zipFileHash?: string;
  // 主要核心证据文件名称
  mainEvidenceName?: string;
  // 取证申请单号
  evidenceOrderNum?: string;
  // 补正说明函下载地址
  correctionUrl?: string;
  // 录屏取证准备时间
  gmtReady?: number;
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
      zipFileHash: 'zip_file_hash',
      mainEvidenceName: 'main_evidence_name',
      evidenceOrderNum: 'evidence_order_num',
      correctionUrl: 'correction_url',
      gmtReady: 'gmt_ready',
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
      zipFileHash: 'string',
      mainEvidenceName: 'string',
      evidenceOrderNum: 'string',
      correctionUrl: 'string',
      gmtReady: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 取证三方系统信息
export class EvidenceThirdPartyInfo extends $tea.Model {
  // 三方系统用户提交网址时间
  submitTime: string;
  // 三方系统地址
  systemUrl: string;
  // 三方系统账号
  account: string;
  // 三方系统名称
  systemName: string;
  // 用户取证时登录的时间
  loginTime: string;
  // 用户取证时登录的IP
  loginIp: string;
  static names(): { [key: string]: string } {
    return {
      submitTime: 'submit_time',
      systemUrl: 'system_url',
      account: 'account',
      systemName: 'system_name',
      loginTime: 'login_time',
      loginIp: 'login_ip',
    };
  }

  static types(): { [key: string]: any } {
    return {
      submitTime: 'string',
      systemUrl: 'string',
      account: 'string',
      systemName: 'string',
      loginTime: 'string',
      loginIp: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 推荐分类信息
export class RecommendCategoryDetail extends $tea.Model {
  // 推荐分类类型
  recommendWorkCategory: string;
  // 作品类型相似度，保留2位小数
  categorySimilarRatio: string;
  // 作品类型风险等级
  categoryRiskRank?: string;
  static names(): { [key: string]: string } {
    return {
      recommendWorkCategory: 'recommend_work_category',
      categorySimilarRatio: 'category_similar_ratio',
      categoryRiskRank: 'category_risk_rank',
    };
  }

  static types(): { [key: string]: any } {
    return {
      recommendWorkCategory: 'string',
      categorySimilarRatio: 'string',
      categoryRiskRank: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 地址详细信息
export class DciUserAddressInfo extends $tea.Model {
  // 所在国家
  country?: string;
  // 所在省份
  province?: string;
  // 所在城市
  city?: string;
  // 识别出的地区
  district?: string;
  // 识别出的街道
  town?: string;
  // 识别出的路
  road?: string;
  // 识别出的路号牌
  roadNo?: string;
  // 地址详情
  addressDetail?: string;
  static names(): { [key: string]: string } {
    return {
      country: 'country',
      province: 'province',
      city: 'city',
      district: 'district',
      town: 'town',
      road: 'road',
      roadNo: 'road_no',
      addressDetail: 'address_detail',
    };
  }

  static types(): { [key: string]: any } {
    return {
      country: 'string',
      province: 'string',
      city: 'string',
      district: 'string',
      town: 'string',
      road: 'string',
      roadNo: 'string',
      addressDetail: 'string',
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
  // 证据包文件hash
  zipFileHash?: string;
  // 核心证据文件名称
  mainEvidenceName?: string;
  // 取证申请单号
  evidenceOrderNum?: string;
  // 取证开始时间
  gmtEvidenceStart?: number;
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
      zipFileHash: 'zip_file_hash',
      mainEvidenceName: 'main_evidence_name',
      evidenceOrderNum: 'evidence_order_num',
      gmtEvidenceStart: 'gmt_evidence_start',
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
      zipFileHash: 'string',
      mainEvidenceName: 'string',
      evidenceOrderNum: 'string',
      gmtEvidenceStart: 'number',
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

// 企业法人信息
export class EnterpriseLegalPersonInfo extends $tea.Model {
  // 法人姓名
  legalPersonCertName?: string;
  // 法人证件类型
  legalPersonCertType?: string;
  // 法人证件号
  legalPersonCertNo?: string;
  static names(): { [key: string]: string } {
    return {
      legalPersonCertName: 'legal_person_cert_name',
      legalPersonCertType: 'legal_person_cert_type',
      legalPersonCertNo: 'legal_person_cert_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      legalPersonCertName: 'string',
      legalPersonCertType: 'string',
      legalPersonCertNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 网页截图结果
export class ScreenshotResult extends $tea.Model {
  // 截图文件下载链接
  screenshotFileUrl: string;
  // 网页截取编号
  screenshotId: string;
  // 取证类型(SCREENSHOT: 网页截图)
  screenshotType: string;
  // 取证状态
  status: string;
  // 错误码
  errorCode?: string;
  // 错误信息
  errorMessage?: string;
  // 网页截取名称
  screenshotName: string;
  static names(): { [key: string]: string } {
    return {
      screenshotFileUrl: 'screenshot_file_url',
      screenshotId: 'screenshot_id',
      screenshotType: 'screenshot_type',
      status: 'status',
      errorCode: 'error_code',
      errorMessage: 'error_message',
      screenshotName: 'screenshot_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      screenshotFileUrl: 'string',
      screenshotId: 'string',
      screenshotType: 'string',
      status: 'string',
      errorCode: 'string',
      errorMessage: 'string',
      screenshotName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 取证结果
export class EvidenceResult extends $tea.Model {
  // 取证编号
  evidenceId: string;
  // 取证类型（LIVE：直播，VOD：点播）
  evidenceType: string;
  // 公证处code
  notaryOffice: string;
  // 取证站点url信息
  evidenceUrl: EvidenceWebUrlInfo;
  // 取证结果文件下载url（有效期3天）
  evidenceResultUrl: string;
  // 存证证明信息
  certificateInfo: EvidenceCertificateInfo;
  // 取证开始时间戳
  evidenceStartTime: number;
  // 取证状态(SUCCESS:成功, FAIL:取证失败)
  status: string;
  // 处理结果码
  code?: string;
  // 处理结果信息
  message: string;
  static names(): { [key: string]: string } {
    return {
      evidenceId: 'evidence_id',
      evidenceType: 'evidence_type',
      notaryOffice: 'notary_office',
      evidenceUrl: 'evidence_url',
      evidenceResultUrl: 'evidence_result_url',
      certificateInfo: 'certificate_info',
      evidenceStartTime: 'evidence_start_time',
      status: 'status',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      evidenceId: 'string',
      evidenceType: 'string',
      notaryOffice: 'string',
      evidenceUrl: EvidenceWebUrlInfo,
      evidenceResultUrl: 'string',
      certificateInfo: EvidenceCertificateInfo,
      evidenceStartTime: 'number',
      status: 'string',
      code: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数登上传文件结构体
export class AdditionalFileInfo extends $tea.Model {
  // 内容梗概文件fileId
  contentSummaryFileId?: string;
  // 权利归属证明文件
  ownershipFileIds?: string[];
  // 肖像权授权文件fileId
  portraitAuthFileId?: string;
  // 他人作品授权文件fileId
  othersWorkAuthFileId?: string;
  // 其他文件fileId列表
  otherFileIdList?: string[];
  // 商用授权字体授权文件fileId
  fontAuthorizeFileId?: string;
  static names(): { [key: string]: string } {
    return {
      contentSummaryFileId: 'content_summary_file_id',
      ownershipFileIds: 'ownership_file_ids',
      portraitAuthFileId: 'portrait_auth_file_id',
      othersWorkAuthFileId: 'others_work_auth_file_id',
      otherFileIdList: 'other_file_id_list',
      fontAuthorizeFileId: 'font_authorize_file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      contentSummaryFileId: 'string',
      ownershipFileIds: { 'type': 'array', 'itemType': 'string' },
      portraitAuthFileId: 'string',
      othersWorkAuthFileId: 'string',
      otherFileIdList: { 'type': 'array', 'itemType': 'string' },
      fontAuthorizeFileId: 'string',
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

// 联系人信息
export class ContactInfo extends $tea.Model {
  // 联系人
  contactName: string;
  // 联系电话
  contactPhone: string;
  static names(): { [key: string]: string } {
    return {
      contactName: 'contact_name',
      contactPhone: 'contact_phone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      contactName: 'string',
      contactPhone: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 证书信息
export class CertificateData extends $tea.Model {
  // 任务ID
  taskId: string;
  // 版权用户UID
  userId: string;
  // DCI码
  dciCode: string;
  // 证书下载的链接地址
  certificateUrl: string;
  static names(): { [key: string]: string } {
    return {
      taskId: 'task_id',
      userId: 'user_id',
      dciCode: 'dci_code',
      certificateUrl: 'certificate_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      taskId: 'string',
      userId: 'string',
      dciCode: 'string',
      certificateUrl: 'string',
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

// 公证出证申请信息
export class NotaryApplyInfo extends $tea.Model {
  // 公证处ID
  orgId: string;
  // 取证人和取证信息列表
  evidInfos: EvidInfo[];
  // 申办事由
  bidReason: BidReason;
  // 申请人信息
  applicantInfos: NotaryUser[];
  // 经办人信息
  operatorInfo: NotaryUser;
  // 授权书
  warrantFileList: string[];
  // 权利证明材料
  testifyFileList: string[];
  // 保全内容
  preservationContent: string;
  // 用户申办备注
  comments?: string;
  static names(): { [key: string]: string } {
    return {
      orgId: 'org_id',
      evidInfos: 'evid_infos',
      bidReason: 'bid_reason',
      applicantInfos: 'applicant_infos',
      operatorInfo: 'operator_info',
      warrantFileList: 'warrant_file_list',
      testifyFileList: 'testify_file_list',
      preservationContent: 'preservation_content',
      comments: 'comments',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orgId: 'string',
      evidInfos: { 'type': 'array', 'itemType': EvidInfo },
      bidReason: BidReason,
      applicantInfos: { 'type': 'array', 'itemType': NotaryUser },
      operatorInfo: NotaryUser,
      warrantFileList: { 'type': 'array', 'itemType': 'string' },
      testifyFileList: { 'type': 'array', 'itemType': 'string' },
      preservationContent: 'string',
      comments: 'string',
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

// 公证出证需要用户签署的文件
export class SignDocument extends $tea.Model {
  // 签署文件
  signFile: string;
  // 到期时间戳
  expireTime: number;
  // 签署文件名
  signFileName: string;
  // 签署文件描述
  signFileDesc: string;
  // 签署文件哈希
  signFileHash: string;
  // 签署文件类型
  signFileType: string;
  static names(): { [key: string]: string } {
    return {
      signFile: 'sign_file',
      expireTime: 'expire_time',
      signFileName: 'sign_file_name',
      signFileDesc: 'sign_file_desc',
      signFileHash: 'sign_file_hash',
      signFileType: 'sign_file_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      signFile: 'string',
      expireTime: 'number',
      signFileName: 'string',
      signFileDesc: 'string',
      signFileHash: 'string',
      signFileType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 在售商品的信息
export class SaleData extends $tea.Model {
  // 摘要数据
  saleDigiestData: SaleDigestData;
  static names(): { [key: string]: string } {
    return {
      saleDigiestData: 'sale_digiest_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      saleDigiestData: SaleDigestData,
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

// 审查数据
export class ReviewData extends $tea.Model {
  // 作品名称安全识别结果
  titleRiskData?: ContentRiskData[];
  // 内容安全识别结果
  contentRiskData?: ContentRiskData[];
  // 作品相似识别结果
  resembleRiskData?: ResembleRiskData[];
  // 作品标签识别结果
  labelRiskData?: LabelRiskData[];
  static names(): { [key: string]: string } {
    return {
      titleRiskData: 'title_risk_data',
      contentRiskData: 'content_risk_data',
      resembleRiskData: 'resemble_risk_data',
      labelRiskData: 'label_risk_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      titleRiskData: { 'type': 'array', 'itemType': ContentRiskData },
      contentRiskData: { 'type': 'array', 'itemType': ContentRiskData },
      resembleRiskData: { 'type': 'array', 'itemType': ResembleRiskData },
      labelRiskData: { 'type': 'array', 'itemType': LabelRiskData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 出证的公证书信息
export class NotaryInfo extends $tea.Model {
  // 公证书编号
  notarialDeedNo: string;
  // 电子公证书文件路径
  notaryPaperPath: string;
  // 公证书出证日期（yyyy-MM-dd）
  notaryTime: string;
  static names(): { [key: string]: string } {
    return {
      notarialDeedNo: 'notarial_deed_no',
      notaryPaperPath: 'notary_paper_path',
      notaryTime: 'notary_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      notarialDeedNo: 'string',
      notaryPaperPath: 'string',
      notaryTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数登申请声明：包括创作目的、创作过程、独创性和字体申明
export class DciExplanationInfo extends $tea.Model {
  // 创作目的，描述作品创作的目的
  creationPurpose: string;
  // 创作过程，具体的创作过程
  creationProcess: string;
  // 阐述作品的独创性
  originality: string;
  // 创作过程涉及到字体使用相关版权说明
  fontCopyright?: string;
  // 创作过程涉及到字体使用相关版权说明	
  // 
  fontTypes?: string[];
  static names(): { [key: string]: string } {
    return {
      creationPurpose: 'creation_purpose',
      creationProcess: 'creation_process',
      originality: 'originality',
      fontCopyright: 'font_copyright',
      fontTypes: 'font_types',
    };
  }

  static types(): { [key: string]: any } {
    return {
      creationPurpose: 'string',
      creationProcess: 'string',
      originality: 'string',
      fontCopyright: 'string',
      fontTypes: { 'type': 'array', 'itemType': 'string' },
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

// 线下取证水印结果
export class OfflineEvidenceWatermarkResult extends $tea.Model {
  // 取证编号
  evidenceNo: string;
  // 水印链接
  watermarkUrl?: string;
  // 封面链接
  coverUrl?: string;
  // 失败原因
  failReason?: string;
  static names(): { [key: string]: string } {
    return {
      evidenceNo: 'evidence_no',
      watermarkUrl: 'watermark_url',
      coverUrl: 'cover_url',
      failReason: 'fail_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      evidenceNo: 'string',
      watermarkUrl: 'string',
      coverUrl: 'string',
      failReason: 'string',
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
  // 渠道标签
  channelTerminal?: string;
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
      channelTerminal: 'channel_terminal',
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
      channelTerminal: 'string',
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
  // 补正函下载链接
  correctionUrl?: string;
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
      correctionUrl: 'correction_url',
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
      correctionUrl: 'string',
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
  proxyData?: ProxyData;
  // 幂等字段
  clientToken: string;
  // 作品类型相似度
  categorySimilarRatio?: string;
  // 作品类型风险等级
  categoryRiskRank?: string;
  // 著作权人用户id List
  copyrightOwnerIds: string[];
  // DCI类型
  applyType?: string;
  // 渠道标签
  channelTerminal?: string;
  // 推荐分类明细信息
  recommendCategoryList?: RecommendCategoryDetail[];
  // 证书样式ID
  customizeCertId?: string;
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
      categorySimilarRatio: 'category_similar_ratio',
      categoryRiskRank: 'category_risk_rank',
      copyrightOwnerIds: 'copyright_owner_ids',
      applyType: 'apply_type',
      channelTerminal: 'channel_terminal',
      recommendCategoryList: 'recommend_category_list',
      customizeCertId: 'customize_cert_id',
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
      categorySimilarRatio: 'string',
      categoryRiskRank: 'string',
      copyrightOwnerIds: { 'type': 'array', 'itemType': 'string' },
      applyType: 'string',
      channelTerminal: 'string',
      recommendCategoryList: { 'type': 'array', 'itemType': RecommendCategoryDetail },
      customizeCertId: 'string',
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
  // 错误信息
  errorMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      dciContentId: 'dci_content_id',
      errorMsg: 'error_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      dciContentId: 'string',
      errorMsg: 'string',
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
  dciUserId?: string;
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
  // 预登记证书下载链接
  preRegCertUrl?: string;
  // 预览图oss fileId
  pngFileId?: string;
  // 申请发码时间
  applyObtainDate?: string;
  // DCI码创建时间
  dciCodeObtainDate?: string;
  // 错误原因
  errorReason?: string;
  // 错误中文原因
  errorReasonCn?: string;
  // 公式地址
  publicationUrl?: string;
  // DCI类型
  applyType?: string;
  // 系列图错误原因集合
  seriesDiagramErrorReasonList?: SeriesDiagramErrorReason[];
  // 作品是否包含图片信息
  containsImageInfo?: ContainsImageInfo;
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
      preRegCertUrl: 'pre_reg_cert_url',
      pngFileId: 'png_file_id',
      applyObtainDate: 'apply_obtain_date',
      dciCodeObtainDate: 'dci_code_obtain_date',
      errorReason: 'error_reason',
      errorReasonCn: 'error_reason_cn',
      publicationUrl: 'publication_url',
      applyType: 'apply_type',
      seriesDiagramErrorReasonList: 'series_diagram_error_reason_list',
      containsImageInfo: 'contains_image_info',
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
      preRegCertUrl: 'string',
      pngFileId: 'string',
      applyObtainDate: 'string',
      dciCodeObtainDate: 'string',
      errorReason: 'string',
      errorReasonCn: 'string',
      publicationUrl: 'string',
      applyType: 'string',
      seriesDiagramErrorReasonList: { 'type': 'array', 'itemType': SeriesDiagramErrorReason },
      containsImageInfo: ContainsImageInfo,
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
  certName: string;
  // 证件类型
  certificateType: string;
  // 证件号
  certificateNumber: string;
  // 证件正面OSS fileId
  certificateFrontFileId: string;
  // 证件反面OSS fileId
  certificateBackFileId?: string;
  // 法人名称
  legalPersonCertName?: string;
  // 法人证件类型
  legalPersonCertType?: string;
  // 法人证件号
  legalPersonCertNo?: string;
  // 手机号
  phone: string;
  // 所属地区
  areaType: string;
  // 代理信息
  proxyData?: ProxyData;
  // 版权认证方式:UGC-用户生成内容，AIGC-AI生成内容，SOFTWARE_WORKS-软件作品认证，如果不传默认为UGC
  copyrightCertificationType?: string;
  // 幂等字段
  clientToken: string;
  // 用户名称废弃
  userName?: string;
  // 证件有效期限起始日期
  certificateStartTime?: string;
  // 证件有效期限终止日期
  certificateEndTime?: string;
  // 证件正面OSS fileId废弃
  certificateFrontFilePath?: string;
  // 证件反面OSS filePath废弃
  certificateBackFilePath?: string;
  // 用户身份开始时间
  identityStartTime?: string;
  // 用户类型废弃
  userType?: string;
  // 地址
  address?: string;
  // 证件是否长期有效
  longTermValid?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certName: 'cert_name',
      certificateType: 'certificate_type',
      certificateNumber: 'certificate_number',
      certificateFrontFileId: 'certificate_front_file_id',
      certificateBackFileId: 'certificate_back_file_id',
      legalPersonCertName: 'legal_person_cert_name',
      legalPersonCertType: 'legal_person_cert_type',
      legalPersonCertNo: 'legal_person_cert_no',
      phone: 'phone',
      areaType: 'area_type',
      proxyData: 'proxy_data',
      copyrightCertificationType: 'copyright_certification_type',
      clientToken: 'client_token',
      userName: 'user_name',
      certificateStartTime: 'certificate_start_time',
      certificateEndTime: 'certificate_end_time',
      certificateFrontFilePath: 'certificate_front_file_path',
      certificateBackFilePath: 'certificate_back_file_path',
      identityStartTime: 'identity_start_time',
      userType: 'user_type',
      address: 'address',
      longTermValid: 'long_term_valid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certName: 'string',
      certificateType: 'string',
      certificateNumber: 'string',
      certificateFrontFileId: 'string',
      certificateBackFileId: 'string',
      legalPersonCertName: 'string',
      legalPersonCertType: 'string',
      legalPersonCertNo: 'string',
      phone: 'string',
      areaType: 'string',
      proxyData: ProxyData,
      copyrightCertificationType: 'string',
      clientToken: 'string',
      userName: 'string',
      certificateStartTime: 'string',
      certificateEndTime: 'string',
      certificateFrontFilePath: 'string',
      certificateBackFilePath: 'string',
      identityStartTime: 'string',
      userType: 'string',
      address: 'string',
      longTermValid: 'boolean',
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
  // 版权认证方式:UGC-用户生成内容，AIGC-AI生成内容，SOFTWARE_WORKS：软件作品认证，如果不传默认为UGC
  copyrightCertificationType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certificateType: 'certificate_type',
      certificateNumber: 'certificate_number',
      phone: 'phone',
      copyrightCertificationType: 'copyright_certification_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certificateType: 'string',
      certificateNumber: 'string',
      phone: 'string',
      copyrightCertificationType: 'string',
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
  // 名称
  name?: string;
  // 证件类型
  certificateType?: string;
  // 证件号
  certificateNumber?: string;
  // 地址
  address?: string;
  // 证件有效期开始时间
  certStartTime?: string;
  // 证件有效期结束时间
  certEndTime?: string;
  // 法人名称
  legalPerson?: string;
  // 联系电话
  phone?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      dciUserId: 'dci_user_id',
      dciUserStatus: 'dci_user_status',
      name: 'name',
      certificateType: 'certificate_type',
      certificateNumber: 'certificate_number',
      address: 'address',
      certStartTime: 'cert_start_time',
      certEndTime: 'cert_end_time',
      legalPerson: 'legal_person',
      phone: 'phone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      dciUserId: 'string',
      dciUserStatus: 'string',
      name: 'string',
      certificateType: 'string',
      certificateNumber: 'string',
      address: 'string',
      certStartTime: 'string',
      certEndTime: 'string',
      legalPerson: 'string',
      phone: 'string',
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

export class UpdateDciUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // dci用户ID
  dciUserId: string;
  // 证件正面oss fileId
  certFrontFileId: string;
  // 证件背面oss fileId
  certBackFileId?: string;
  // 手机号
  phone?: string;
  // 客户端令牌
  clientToken?: string;
  // 版权认证方式:UGC-用户生成内容，AIGC-AI生成内容，SOFTWARE_WORKS-软件作品认证，如果不传默认为UGC
  copyrightCertificationType?: string;
  // 法人信息
  legalPersonInfo?: EnterpriseLegalPersonInfo;
  // true,false
  longTermValid?: boolean;
  // 证件有效期开始时间
  certificateStartTime?: string;
  // 证件有效期终止时间
  certificateEndTime?: string;
  // 成立日期或出生日期
  identityStartTime?: string;
  // 地址信息
  address?: string;
  // 著作权人名称
  certName?: string;
  // 著作权人证件号
  certificateNumber?: string;
  // 著作权人证件类型
  certificateType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dciUserId: 'dci_user_id',
      certFrontFileId: 'cert_front_file_id',
      certBackFileId: 'cert_back_file_id',
      phone: 'phone',
      clientToken: 'client_token',
      copyrightCertificationType: 'copyright_certification_type',
      legalPersonInfo: 'legal_person_info',
      longTermValid: 'long_term_valid',
      certificateStartTime: 'certificate_start_time',
      certificateEndTime: 'certificate_end_time',
      identityStartTime: 'identity_start_time',
      address: 'address',
      certName: 'cert_name',
      certificateNumber: 'certificate_number',
      certificateType: 'certificate_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dciUserId: 'string',
      certFrontFileId: 'string',
      certBackFileId: 'string',
      phone: 'string',
      clientToken: 'string',
      copyrightCertificationType: 'string',
      legalPersonInfo: EnterpriseLegalPersonInfo,
      longTermValid: 'boolean',
      certificateStartTime: 'string',
      certificateEndTime: 'string',
      identityStartTime: 'string',
      address: 'string',
      certName: 'string',
      certificateNumber: 'string',
      certificateType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDciUserResponse extends $tea.Model {
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

export class CreateDciRegistrationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // DC123456
  dciContentId: string;
  // 数登申请声明
  explanationInfo: DciExplanationInfo;
  // 补充文件相关信息
  additionalFileInfo?: AdditionalFileInfo;
  // 发票信息--当前支持普票
  invoiceInfo?: InvoiceInfo;
  // 幂等字段
  clientToken: string;
  // 废弃待删除
  creationStatement?: string;
  // 废弃待删除
  ancillaryEvidencePathList?: string[];
  // 申领人联系信息
  applyerContactInfo?: ContactInfo;
  // 代理人联系信息
  platformContactInfo?: ContactInfo;
  // 权利描述
  rightScopeDesc?: string;
  // 是否切换支付方式
  switchPayMethod?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dciContentId: 'dci_content_id',
      explanationInfo: 'explanation_info',
      additionalFileInfo: 'additional_file_info',
      invoiceInfo: 'invoice_info',
      clientToken: 'client_token',
      creationStatement: 'creation_statement',
      ancillaryEvidencePathList: 'ancillary_evidence_path_list',
      applyerContactInfo: 'applyer_contact_info',
      platformContactInfo: 'platform_contact_info',
      rightScopeDesc: 'right_scope_desc',
      switchPayMethod: 'switch_pay_method',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dciContentId: 'string',
      explanationInfo: DciExplanationInfo,
      additionalFileInfo: AdditionalFileInfo,
      invoiceInfo: InvoiceInfo,
      clientToken: 'string',
      creationStatement: 'string',
      ancillaryEvidencePathList: { 'type': 'array', 'itemType': 'string' },
      applyerContactInfo: ContactInfo,
      platformContactInfo: ContactInfo,
      rightScopeDesc: 'string',
      switchPayMethod: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDciRegistrationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数登申请id
  digitalRegisterId?: string;
  // 错误信息
  errorMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      digitalRegisterId: 'digital_register_id',
      errorMsg: 'error_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      digitalRegisterId: 'string',
      errorMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDciRegistrationsubmitRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // dci内容id
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

export class QueryDciRegistrationsubmitResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数登提交状态
  contentStatus?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      contentStatus: 'content_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      contentStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDciRegistrationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数登申请id
  digitalRegisterId?: string;
  // dci申领id
  dciContentId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      digitalRegisterId: 'digital_register_id',
      dciContentId: 'dci_content_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      digitalRegisterId: 'string',
      dciContentId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDciRegistrationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 废弃待删除
  contentStatus?: string;
  // 废弃待删除
  registerCertTxHash?: string;
  // 废弃待删除
  registerCertBlockHeight?: string;
  // 废弃待删除
  registerCertTsr?: string;
  // 废弃待删除
  registerCertPngFileId?: string;
  // 废弃待删除
  registerSampleFileId?: string;
  // 废弃待删除
  registerSamplePngFileId?: string;
  // 废弃待删除
  registerDownloadTimesLeft?: number;
  // 废弃待删除
  errorReason?: string;
  // 废弃待删除
  errorReasonCn?: string;
  // 废弃待删除
  invoiceFileIdList?: string[];
  // 废弃待删除
  applyRegisterTime?: string;
  // 数登登记号
  regNumber?: string;
  // 数登id
  digitalRegisterId?: string;
  // dci申领id
  dciContentId?: string;
  // 数登状态
  digitalRegisterStatus?: string;
  // 数登申请时间
  digitalRegisterApplyTime?: string;
  // 数登完成时间
  digitalRegisterCompletionTime?: string;
  // 数登证书预览图url
  digitalRegisterCertPngUrl?: string;
  // 样本证书预览图url
  digitalRegisterSamplePngUrl?: string;
  // 证书本月剩余下载次数
  downloadTimesLeft?: number;
  // 发票下载链接list
  invoiceUrlList?: string[];
  // 数登失败详情
  failDetail?: string;
  // 补正类型
  amendType?: string;
  // 用户申请表url
  applyFormUrl?: string;
  // 数登流水号
  flowNumber?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      contentStatus: 'content_status',
      registerCertTxHash: 'register_cert_tx_hash',
      registerCertBlockHeight: 'register_cert_block_height',
      registerCertTsr: 'register_cert_tsr',
      registerCertPngFileId: 'register_cert_png_file_id',
      registerSampleFileId: 'register_sample_file_id',
      registerSamplePngFileId: 'register_sample_png_file_id',
      registerDownloadTimesLeft: 'register_download_times_left',
      errorReason: 'error_reason',
      errorReasonCn: 'error_reason_cn',
      invoiceFileIdList: 'invoice_file_id_list',
      applyRegisterTime: 'apply_register_time',
      regNumber: 'reg_number',
      digitalRegisterId: 'digital_register_id',
      dciContentId: 'dci_content_id',
      digitalRegisterStatus: 'digital_register_status',
      digitalRegisterApplyTime: 'digital_register_apply_time',
      digitalRegisterCompletionTime: 'digital_register_completion_time',
      digitalRegisterCertPngUrl: 'digital_register_cert_png_url',
      digitalRegisterSamplePngUrl: 'digital_register_sample_png_url',
      downloadTimesLeft: 'download_times_left',
      invoiceUrlList: 'invoice_url_list',
      failDetail: 'fail_detail',
      amendType: 'amend_type',
      applyFormUrl: 'apply_form_url',
      flowNumber: 'flow_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      contentStatus: 'string',
      registerCertTxHash: 'string',
      registerCertBlockHeight: 'string',
      registerCertTsr: 'string',
      registerCertPngFileId: 'string',
      registerSampleFileId: 'string',
      registerSamplePngFileId: 'string',
      registerDownloadTimesLeft: 'number',
      errorReason: 'string',
      errorReasonCn: 'string',
      invoiceFileIdList: { 'type': 'array', 'itemType': 'string' },
      applyRegisterTime: 'string',
      regNumber: 'string',
      digitalRegisterId: 'string',
      dciContentId: 'string',
      digitalRegisterStatus: 'string',
      digitalRegisterApplyTime: 'string',
      digitalRegisterCompletionTime: 'string',
      digitalRegisterCertPngUrl: 'string',
      digitalRegisterSamplePngUrl: 'string',
      downloadTimesLeft: 'number',
      invoiceUrlList: { 'type': 'array', 'itemType': 'string' },
      failDetail: 'string',
      amendType: 'string',
      applyFormUrl: 'string',
      flowNumber: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDciRegistrationcertRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数登申请id
  digitalRegisterId: string;
  // 幂等字段
  clientToken: string;
  // 废弃待删除
  dciContentId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      digitalRegisterId: 'digital_register_id',
      clientToken: 'client_token',
      dciContentId: 'dci_content_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      digitalRegisterId: 'string',
      clientToken: 'string',
      dciContentId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDciRegistrationcertResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 废弃待删除
  certStatus?: string;
  // 废弃待删除
  certificateUrl?: string;
  // 废弃待删除
  errorReason?: string;
  // 废弃待删除
  errorReasonCn?: string;
  // 数登状态
  digitalRegisterStatus?: string;
  // 数登证书&样本证书压缩包url
  downloadUrl?: string;
  // 剩余下载次数
  downloadTimesLeft?: number;
  // 失败详情
  failDetail?: string;
  // 数登证书下载链接
  digitalRegisterCertUrl?: string;
  // 数登样本证书下载链接
  digitalRegisterSampleUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certStatus: 'cert_status',
      certificateUrl: 'certificate_url',
      errorReason: 'error_reason',
      errorReasonCn: 'error_reason_cn',
      digitalRegisterStatus: 'digital_register_status',
      downloadUrl: 'download_url',
      downloadTimesLeft: 'download_times_left',
      failDetail: 'fail_detail',
      digitalRegisterCertUrl: 'digital_register_cert_url',
      digitalRegisterSampleUrl: 'digital_register_sample_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certStatus: 'string',
      certificateUrl: 'string',
      errorReason: 'string',
      errorReasonCn: 'string',
      digitalRegisterStatus: 'string',
      downloadUrl: 'string',
      downloadTimesLeft: 'number',
      failDetail: 'string',
      digitalRegisterCertUrl: 'string',
      digitalRegisterSampleUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDciContentsecurityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务ID(数登流水号)
  flowNumber: string;
  // 客户端令牌
  clientToken?: string;
  // 任务Id, 已废弃
  taskId?: string;
  // 作品名，已废弃
  workName?: string;
  // 作品Hash，已废弃
  workHash?: string;
  // 作品分类，已废弃
  workCategory?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowNumber: 'flow_number',
      clientToken: 'client_token',
      taskId: 'task_id',
      workName: 'work_name',
      workHash: 'work_hash',
      workCategory: 'work_category',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowNumber: 'string',
      clientToken: 'string',
      taskId: 'string',
      workName: 'string',
      workHash: 'string',
      workCategory: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDciContentsecurityResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 作品类型
  workType?: string;
  // 审查结果
  reviewData?: ReviewData;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      workType: 'work_type',
      reviewData: 'review_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      workType: 'string',
      reviewData: ReviewData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDciRegistrationcertRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务ID
  taskId: string;
  // 版权用户ID
  userId: string;
  // DCI码
  dciCode: string;
  // 登记号
  regNumber: string;
  // 二维码
  qrCodeUrl: string;
  // 客户端token
  clientToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskId: 'task_id',
      userId: 'user_id',
      dciCode: 'dci_code',
      regNumber: 'reg_number',
      qrCodeUrl: 'qr_code_url',
      clientToken: 'client_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskId: 'string',
      userId: 'string',
      dciCode: 'string',
      regNumber: 'string',
      qrCodeUrl: 'string',
      clientToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDciRegistrationcertResponse extends $tea.Model {
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

export class QueryDciRegistrationcertRequest extends $tea.Model {
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

export class QueryDciRegistrationcertResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 证书信息
  certificateData?: CertificateData;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certificateData: 'certificate_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certificateData: CertificateData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDciPayurlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数登申请id
  digitalRegisterId: string;
  // 幂等字段
  clientToken: string;
  // 废弃待删除
  dciUserId?: string;
  // 废弃待删除
  dciContentId?: string;
  // 废弃待删除
  payMent?: string;
  // 废弃待删除
  invoiceInfo?: InvoiceInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      digitalRegisterId: 'digital_register_id',
      clientToken: 'client_token',
      dciUserId: 'dci_user_id',
      dciContentId: 'dci_content_id',
      payMent: 'pay_ment',
      invoiceInfo: 'invoice_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      digitalRegisterId: 'string',
      clientToken: 'string',
      dciUserId: 'string',
      dciContentId: 'string',
      payMent: 'string',
      invoiceInfo: InvoiceInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDciPayurlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 支付链接
  payUrl?: string;
  // 错误信息
  errorMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      payUrl: 'pay_url',
      errorMsg: 'error_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      payUrl: 'string',
      errorMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDciPayRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数登申请id
  digitalRegisterId: string;
  // 废弃待删除
  dciUserId?: string;
  // 废弃待删除
  dciContentId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      digitalRegisterId: 'digital_register_id',
      dciUserId: 'dci_user_id',
      dciContentId: 'dci_content_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      digitalRegisterId: 'string',
      dciUserId: 'string',
      dciContentId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDciPayResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 支付状态
  // （INIT 用户点击支付，待获取链接；GET_PAY_URL_FAIL 获取支付链接失败；PAY_FAIL 支付失败；TIMEOUT 支付超时；PAY_SUCCESS 支付成功；PAYING 支付中；PAY_EXCEPTION	支付异常，待重试）
  payStatus?: string;
  // 废弃待删除
  payState?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      payStatus: 'pay_status',
      payState: 'pay_state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      payStatus: 'string',
      payState: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackDciPayresultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 与中心约定的任务ID，同一个作品可能会发起多次登记
  taskId: string;
  // 平台Id
  appId: string;
  // 订单ID 
  orderId: string;
  // 支付方式 (ALIPAY,0,支付宝)
  payMent: string;
  // 订单金额
  money: string;
  // 结果描述，如：支付成功
  resultContent: string;
  // 状态，2001代表支付成功
  code: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskId: 'task_id',
      appId: 'app_id',
      orderId: 'order_id',
      payMent: 'pay_ment',
      money: 'money',
      resultContent: 'result_content',
      code: 'code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskId: 'string',
      appId: 'string',
      orderId: 'string',
      payMent: 'string',
      money: 'string',
      resultContent: 'string',
      code: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackDciPayresultResponse extends $tea.Model {
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

export class RefuseDciRegistrationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务ID
  taskId: string;
  // 复审失败原因
  code: string;
  // 失败详情
  failDetail: string;
  // 幂等字段
  clientToken: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskId: 'task_id',
      code: 'code',
      failDetail: 'fail_detail',
      clientToken: 'client_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskId: 'string',
      code: 'string',
      failDetail: 'string',
      clientToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RefuseDciRegistrationResponse extends $tea.Model {
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

export class QueryNotaryBidreasonRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 公证处 ID
  orgId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orgId: 'org_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orgId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryNotaryBidreasonResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 申办事由列表
  bidReasonList?: BidReason[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bidReasonList: 'bid_reason_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bidReasonList: { 'type': 'array', 'itemType': BidReason },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryNotaryDocumenttosignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 申请人信息
  applicantList: NotaryUser[];
  // 经办人信息
  agent: NotaryUser;
  // 送达信息
  receiveInfo: ReceiveInfo;
  // 保全内容
  preservation: string;
  // 公证处id
  orgId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applicantList: 'applicant_list',
      agent: 'agent',
      receiveInfo: 'receive_info',
      preservation: 'preservation',
      orgId: 'org_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applicantList: { 'type': 'array', 'itemType': NotaryUser },
      agent: NotaryUser,
      receiveInfo: ReceiveInfo,
      preservation: 'string',
      orgId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryNotaryDocumenttosignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 需要用户签署的文件列表
  signDocumentList?: SignDocument[];
  // 生成文件的时间，需要在提交申办接口传入
  previewTime?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      signDocumentList: 'sign_document_list',
      previewTime: 'preview_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      signDocumentList: { 'type': 'array', 'itemType': SignDocument },
      previewTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyNotaryOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 公证出证申请信息
  notaryApplyInfo: NotaryApplyInfo;
  // 公证出证收件信息
  notaryReceiveInfo: NotaryReceiveInfo;
  // 用户预览签署文件的时间
  previewTime: number;
  // 用户签署文件时间
  agreeTime: number;
  // 客户端令牌
  clientToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      notaryApplyInfo: 'notary_apply_info',
      notaryReceiveInfo: 'notary_receive_info',
      previewTime: 'preview_time',
      agreeTime: 'agree_time',
      clientToken: 'client_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      notaryApplyInfo: NotaryApplyInfo,
      notaryReceiveInfo: NotaryReceiveInfo,
      previewTime: 'number',
      agreeTime: 'number',
      clientToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyNotaryOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 出证申请订单ID
  notaryOrderId?: string;
  // 订单状态
  orderStatus?: string;
  // 支付二维码链接
  payUrl?: string;
  // 支付二维码过期时间
  payUrlExpireTime?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      notaryOrderId: 'notary_order_id',
      orderStatus: 'order_status',
      payUrl: 'pay_url',
      payUrlExpireTime: 'pay_url_expire_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      notaryOrderId: 'string',
      orderStatus: 'string',
      payUrl: 'string',
      payUrlExpireTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryNotaryPayurlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单ID
  notaryOrderId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      notaryOrderId: 'notary_order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      notaryOrderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryNotaryPayurlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 支付二维码链接
  payUrl?: string;
  // 支付二维码链接到期时间
  payUrlExpireTime?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      payUrl: 'pay_url',
      payUrlExpireTime: 'pay_url_expire_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      payUrl: 'string',
      payUrlExpireTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryNotaryFeedetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 公证处ID
  orgId: string;
  // 公证书类型
  orderType: string;
  // 纸质公证书份数
  copies?: number;
  // 证据列表
  evidInfoList: EvidInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orgId: 'org_id',
      orderType: 'order_type',
      copies: 'copies',
      evidInfoList: 'evid_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orgId: 'string',
      orderType: 'string',
      copies: 'number',
      evidInfoList: { 'type': 'array', 'itemType': EvidInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryNotaryFeedetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 本次公证出证需支付的总费用
  totalPriceRmbFen?: number;
  // 本次申请中每一类证据的数量明细列表
  notaryFeeEvidTypeDataList?: NotaryFeeEvidTypeData[];
  // 本次需支付费用的分项明细列表
  notaryFeeItemList?: NotaryFeeItem[];
  // 收费规则描述
  notaryFeeRuleList?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalPriceRmbFen: 'total_price_rmb_fen',
      notaryFeeEvidTypeDataList: 'notary_fee_evid_type_data_list',
      notaryFeeItemList: 'notary_fee_item_list',
      notaryFeeRuleList: 'notary_fee_rule_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalPriceRmbFen: 'number',
      notaryFeeEvidTypeDataList: { 'type': 'array', 'itemType': NotaryFeeEvidTypeData },
      notaryFeeItemList: { 'type': 'array', 'itemType': NotaryFeeItem },
      notaryFeeRuleList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryNotaryOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // acrbasis订单ID
  notaryOrderId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      notaryOrderId: 'notary_order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      notaryOrderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryNotaryOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单状态
  status?: string;
  // 支付状态最后更新时间戳
  payTime?: number;
  // 用户预览签署文件的时间戳
  previewTime?: number;
  // 支付状态
  payStatus?: string;
  // 补充材料说明，当需要补充材料时提供
  materialRemarks?: string;
  // 出证的公证书信息
  notaryInfo?: NotaryInfo;
  // 拒绝办理信息
  rejectInfo?: RefuseInfo;
  // 终止信息
  terminalInfo?: RefuseInfo;
  // 支付方式
  payType?: string;
  // 用户应付的金额
  payableAmount?: number;
  // 用户实际支付的金额
  paidAmount?: number;
  // 公证处物流信息
  notaryExpressList?: ExpressInfo[];
  // 发票物流信息
  invoiceExpressList?: ExpressInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      payTime: 'pay_time',
      previewTime: 'preview_time',
      payStatus: 'pay_status',
      materialRemarks: 'material_remarks',
      notaryInfo: 'notary_info',
      rejectInfo: 'reject_info',
      terminalInfo: 'terminal_info',
      payType: 'pay_type',
      payableAmount: 'payable_amount',
      paidAmount: 'paid_amount',
      notaryExpressList: 'notary_express_list',
      invoiceExpressList: 'invoice_express_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      payTime: 'number',
      previewTime: 'number',
      payStatus: 'string',
      materialRemarks: 'string',
      notaryInfo: NotaryInfo,
      rejectInfo: RefuseInfo,
      terminalInfo: RefuseInfo,
      payType: 'string',
      payableAmount: 'number',
      paidAmount: 'number',
      notaryExpressList: { 'type': 'array', 'itemType': ExpressInfo },
      invoiceExpressList: { 'type': 'array', 'itemType': ExpressInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadNotaryAttachmentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单ID
  notaryOrderId: string;
  // 材料文件
  materialFileList: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      notaryOrderId: 'notary_order_id',
      materialFileList: 'material_file_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      notaryOrderId: 'string',
      materialFileList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadNotaryAttachmentResponse extends $tea.Model {
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

export class OperateNotaryOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单ID
  notaryOrderId: string;
  // 更新状态类型
  type: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      notaryOrderId: 'notary_order_id',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      notaryOrderId: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateNotaryOrderResponse extends $tea.Model {
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

export class QueryDciPreviewRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // dci作品预览id
  dciPreviewId?: string;
  // basis的dci content id
  dciBasisId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dciPreviewId: 'dci_preview_id',
      dciBasisId: 'dci_basis_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dciPreviewId: 'string',
      dciBasisId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDciPreviewResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 作品预览处理状态
  filePreviewStatus?: string;
  // 作品片段预览状态
  filePartPreviewStatus?: string;
  // 作品预览处理结果
  filePreviewUrl?: string;
  // 作品预览截取片段结果
  filePartPreviewUrl?: string;
  // 作品名称
  workName?: string;
  // dci码
  dciCode?: string;
  // 文件类型
  fileType?: string;
  // 当前查询时间
  queryTime?: string;
  // 数登登记号
  regNumber?: string;
  // 著作权人名称列表
  copyrightOwnerNames?: string[];
  // 系列图预览地址
  seriesDiagramPreviewList?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      filePreviewStatus: 'file_preview_status',
      filePartPreviewStatus: 'file_part_preview_status',
      filePreviewUrl: 'file_preview_url',
      filePartPreviewUrl: 'file_part_preview_url',
      workName: 'work_name',
      dciCode: 'dci_code',
      fileType: 'file_type',
      queryTime: 'query_time',
      regNumber: 'reg_number',
      copyrightOwnerNames: 'copyright_owner_names',
      seriesDiagramPreviewList: 'series_diagram_preview_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      filePreviewStatus: 'string',
      filePartPreviewStatus: 'string',
      filePreviewUrl: 'string',
      filePartPreviewUrl: 'string',
      workName: 'string',
      dciCode: 'string',
      fileType: 'string',
      queryTime: 'string',
      regNumber: 'string',
      copyrightOwnerNames: { 'type': 'array', 'itemType': 'string' },
      seriesDiagramPreviewList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryDciRegistrationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 待补正数登申请id
  digitalRegisterId: string;
  // 替换dci申领id
  dciContentId?: string;
  // 数登申请声明
  explanationInfo: DciExplanationInfo;
  // 补充文件信息
  additionalFileInfo?: AdditionalFileInfo;
  // 幂等字段
  clientToken: string;
  // 权利描述
  rightScopeDesc?: string;
  // 申领人联系信息
  applyerContactInfo?: ContactInfo;
  // 代理人联系信息
  platformContactInfo?: ContactInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      digitalRegisterId: 'digital_register_id',
      dciContentId: 'dci_content_id',
      explanationInfo: 'explanation_info',
      additionalFileInfo: 'additional_file_info',
      clientToken: 'client_token',
      rightScopeDesc: 'right_scope_desc',
      applyerContactInfo: 'applyer_contact_info',
      platformContactInfo: 'platform_contact_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      digitalRegisterId: 'string',
      dciContentId: 'string',
      explanationInfo: DciExplanationInfo,
      additionalFileInfo: AdditionalFileInfo,
      clientToken: 'string',
      rightScopeDesc: 'string',
      applyerContactInfo: ContactInfo,
      platformContactInfo: ContactInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryDciRegistrationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误信息
  errorMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      errorMsg: 'error_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      errorMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CloseDciRegistrationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数登id
  digitalRegisterId: string;
  // 退费人名称
  name: string;
  // 联系手机号
  mobileNo: string;
  // 幂等字段
  clientToken: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      digitalRegisterId: 'digital_register_id',
      name: 'name',
      mobileNo: 'mobile_no',
      clientToken: 'client_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      digitalRegisterId: 'string',
      name: 'string',
      mobileNo: 'string',
      clientToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CloseDciRegistrationResponse extends $tea.Model {
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

export class AddDciUsernocertRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户名称
  certificateName: string;
  // 证件类型
  certificateType: string;
  // 证件号
  certificateNumber: string;
  // 企业用户必填
  legalPersonCertName?: string;
  // 企业用户必填
  legalPersonCertType?: string;
  // 企业用户必填
  legalPersonCertNo?: string;
  // 手机号
  phone: string;
  // 代理信息
  proxyData?: ProxyData;
  // 幂等字段
  clientToken: string;
  // 版权认证方式:UGC-用户生成内容，AIGC-AI生成内容，SOFTWARE_WORKS-软件作品认证，如果不传默认为UGC
  copyrightCertificationType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certificateName: 'certificate_name',
      certificateType: 'certificate_type',
      certificateNumber: 'certificate_number',
      legalPersonCertName: 'legal_person_cert_name',
      legalPersonCertType: 'legal_person_cert_type',
      legalPersonCertNo: 'legal_person_cert_no',
      phone: 'phone',
      proxyData: 'proxy_data',
      clientToken: 'client_token',
      copyrightCertificationType: 'copyright_certification_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certificateName: 'string',
      certificateType: 'string',
      certificateNumber: 'string',
      legalPersonCertName: 'string',
      legalPersonCertType: 'string',
      legalPersonCertNo: 'string',
      phone: 'string',
      proxyData: ProxyData,
      clientToken: 'string',
      copyrightCertificationType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddDciUsernocertResponse extends $tea.Model {
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

export class QueryDciSimilarfileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件下载凭证
  workFileId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      workFileId: 'work_file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      workFileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDciSimilarfileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文件下载链接
  workDownloadUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      workDownloadUrl: 'work_download_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      workDownloadUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyDciPromotionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联系人姓名
  contactName: string;
  // 联系人电话
  contactPhone: string;
  // dci ID
  dciContentId: string;
  // 幂等字段
  clientToken: string;
  // 推广渠道
  promotionWay: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      contactName: 'contact_name',
      contactPhone: 'contact_phone',
      dciContentId: 'dci_content_id',
      clientToken: 'client_token',
      promotionWay: 'promotion_way',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      contactName: 'string',
      contactPhone: 'string',
      dciContentId: 'string',
      clientToken: 'string',
      promotionWay: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyDciPromotionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // basis数据ID
  apiTaskId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      apiTaskId: 'api_task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      apiTaskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDciUserbyphoneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 手机号
  phone: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      phone: 'phone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      phone: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDciUserbyphoneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // dci用户id	
  // 
  dciUserId?: string;
  // dci用户状态	
  // 
  dciUserStatus?: string;
  // 名称
  name?: string;
  // 证件类型
  // 
  certificateType?: string;
  // 证件号	
  // 
  certificateNumber?: string;
  // 地址
  address?: string;
  // 证件有效期开始时间
  // 
  certStartTime?: string;
  // 证件有效期结束时间
  // 
  certEndTime?: string;
  // 法人名称
  // 
  legalPerson?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      dciUserId: 'dci_user_id',
      dciUserStatus: 'dci_user_status',
      name: 'name',
      certificateType: 'certificate_type',
      certificateNumber: 'certificate_number',
      address: 'address',
      certStartTime: 'cert_start_time',
      certEndTime: 'cert_end_time',
      legalPerson: 'legal_person',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      dciUserId: 'string',
      dciUserStatus: 'string',
      name: 'string',
      certificateType: 'string',
      certificateNumber: 'string',
      address: 'string',
      certStartTime: 'string',
      certEndTime: 'string',
      legalPerson: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTradeSaleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询文本
  queryText: string;
  // 查询场景
  queryScene: string;
  // 扩展信息，JSON格式
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      queryText: 'query_text',
      queryScene: 'query_scene',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      queryText: 'string',
      queryScene: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTradeSaleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 匹配的商品信息
  saleDataList?: SaleData[];
  // 扩展信息JSON
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      saleDataList: 'sale_data_list',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      saleDataList: { 'type': 'array', 'itemType': SaleData },
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterTradeUsageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 标识某个服务实体的唯一ID，例如dciContentId
  serviceId: string;
  // 服务类型，例如DCI、存证等
  serviceType: string;
  // 业务类型
  bizType: string;
  // 扩展信息，JSON格式
  extInfo?: string;
  // 调用方唯一业务标识
  outBizNo: string;
  // 文件类型，例如音频、视频、图片
  fileType?: string;
  // 待登记的文件Url
  regFileUrl?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceId: 'service_id',
      serviceType: 'service_type',
      bizType: 'biz_type',
      extInfo: 'ext_info',
      outBizNo: 'out_biz_no',
      fileType: 'file_type',
      regFileUrl: 'reg_file_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceId: 'string',
      serviceType: 'string',
      bizType: 'string',
      extInfo: 'string',
      outBizNo: 'string',
      fileType: 'string',
      regFileUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterTradeUsageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 登记Id
  registerId?: string;
  // 登记状态
  status?: string;
  // 扩展信息
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      registerId: 'register_id',
      status: 'status',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      registerId: 'string',
      status: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateEvidenceUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 取证主体证件名称
  certName: string;
  // 取证主体证件号
  certNo: string;
  // 用户类型（个人/企业）
  userType: string;
  // 法人姓名（企业用户必填）
  legalPersonCertName?: string;
  // 法人证件号（企业用户必填）
  legalPersonCertNo?: string;
  // 取证操作人证件姓名（企业用户必填）
  operatorName?: string;
  // 取证操作人证件号（企业用户必填）
  operatorCertNo?: string;
  // 幂等字段
  clientToken: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certName: 'cert_name',
      certNo: 'cert_no',
      userType: 'user_type',
      legalPersonCertName: 'legal_person_cert_name',
      legalPersonCertNo: 'legal_person_cert_no',
      operatorName: 'operator_name',
      operatorCertNo: 'operator_cert_no',
      clientToken: 'client_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certName: 'string',
      certNo: 'string',
      userType: 'string',
      legalPersonCertName: 'string',
      legalPersonCertNo: 'string',
      operatorName: 'string',
      operatorCertNo: 'string',
      clientToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateEvidenceUserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 取证用户id
  evidenceUserId?: string;
  // 外部用户ID
  outUserId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      evidenceUserId: 'evidence_user_id',
      outUserId: 'out_user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      evidenceUserId: 'string',
      outUserId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateEvidenceScreenshotRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 取证用户id
  evidenceUserId: string;
  // 取证公证处
  notaryOffice: string;
  // 取证网址信息
  webUrl: EvidenceWebUrlInfo;
  // 取证三方账号信息
  thirdPartyInfo: EvidenceThirdPartyInfo;
  // 幂等字段
  clientToken: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      evidenceUserId: 'evidence_user_id',
      notaryOffice: 'notary_office',
      webUrl: 'web_url',
      thirdPartyInfo: 'third_party_info',
      clientToken: 'client_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      evidenceUserId: 'string',
      notaryOffice: 'string',
      webUrl: EvidenceWebUrlInfo,
      thirdPartyInfo: EvidenceThirdPartyInfo,
      clientToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateEvidenceScreenshotResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 网页截图id
  screenshotId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      screenshotId: 'screenshot_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      screenshotId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateEvidenceRegisterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 网页截图id
  screenshotId: string;
  // 取证名称
  evidenceName?: string;
  // 幂等字段
  clientToken: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      screenshotId: 'screenshot_id',
      evidenceName: 'evidence_name',
      clientToken: 'client_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      screenshotId: 'string',
      evidenceName: 'string',
      clientToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateEvidenceRegisterResponse extends $tea.Model {
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

export class CreateEvidenceRecordscreenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 取证名称
  name: string;
  // 取证用户id
  evidenceUserId: string;
  // 取证公证处
  notaryOffice: string;
  // 取证网址信息
  webUrls?: EvidenceWebUrlInfo[];
  // 取证三方账号信息
  thirdPartyInfo: EvidenceThirdPartyInfo;
  // 取证服务器地域
  area: string;
  // 最大录屏时间（单位：分钟）
  maxTimeInMin: number;
  // 服务器进入ready状态，指定时间未开始进入abort状态的等待时间，单位为分钟，默认1min，waitInMin不能小于1，不能大于10min
  waitInMin: number;
  // 回调地址
  callbackUrl: string;
  // 幂等字段
  clientToken: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      evidenceUserId: 'evidence_user_id',
      notaryOffice: 'notary_office',
      webUrls: 'web_urls',
      thirdPartyInfo: 'third_party_info',
      area: 'area',
      maxTimeInMin: 'max_time_in_min',
      waitInMin: 'wait_in_min',
      callbackUrl: 'callback_url',
      clientToken: 'client_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      evidenceUserId: 'string',
      notaryOffice: 'string',
      webUrls: { 'type': 'array', 'itemType': EvidenceWebUrlInfo },
      thirdPartyInfo: EvidenceThirdPartyInfo,
      area: 'string',
      maxTimeInMin: 'number',
      waitInMin: 'number',
      callbackUrl: 'string',
      clientToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateEvidenceRecordscreenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 录屏取证操作url
  recordScreenUrl?: string;
  // 取证id
  evidenceId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      recordScreenUrl: 'record_screen_url',
      evidenceId: 'evidence_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      recordScreenUrl: 'string',
      evidenceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelTradeUsageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部业务编号
  outBizNo: string;
  // 业务类型，例如交易检索
  bizType: string;
  // 扩展信息
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outBizNo: 'out_biz_no',
      bizType: 'biz_type',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outBizNo: 'string',
      bizType: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelTradeUsageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 登记Id
  registerId?: string;
  // 扩展信息
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      registerId: 'register_id',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      registerId: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateEvidenceLiveRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 幂等字段
  clientToken: string;
  // 取证用户id
  evidenceUserId: string;
  // 取证公证处
  notaryOffice: string;
  // 取证平台：2：陌陌4：比心，5：小红书，6：lespark
  obtainPlatform?: number;
  // 1：PC、2：移动设备
  obtainDeviceType?: string;
  // 直播取证标题（自定义）
  title?: string;
  // 预定时间：分钟，建议传值范围5-20分钟
  expectedDuration?: number;
  // json字符串，取证平台动态参数，其参数取决于type，具体参数见
  // 附录
  platformDynamicParams?: string;
  // 取证类型（通用直播取证：DEFAULT）（过期，后续版本逐步删除）
  type?: string;
  // 取证网址信息（过期，后续版本逐步删除）
  webUrl?: EvidenceWebUrlInfo;
  // 主播 ID（过期，后续版本逐步删除）
  profileId?: string;
  // 1：视频点播，2：视频直播，3：背景音乐（过期，后续版本逐步删除）
  obtainType?: string;
  // 主播名称（过期，后续版本逐步删除）
  anchorName?: string;
  // 直播取证预计开始时间
  expectedStartTime?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      clientToken: 'client_token',
      evidenceUserId: 'evidence_user_id',
      notaryOffice: 'notary_office',
      obtainPlatform: 'obtain_platform',
      obtainDeviceType: 'obtain_device_type',
      title: 'title',
      expectedDuration: 'expected_duration',
      platformDynamicParams: 'platform_dynamic_params',
      type: 'type',
      webUrl: 'web_url',
      profileId: 'profile_id',
      obtainType: 'obtain_type',
      anchorName: 'anchor_name',
      expectedStartTime: 'expected_start_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      clientToken: 'string',
      evidenceUserId: 'string',
      notaryOffice: 'string',
      obtainPlatform: 'number',
      obtainDeviceType: 'string',
      title: 'string',
      expectedDuration: 'number',
      platformDynamicParams: 'string',
      type: 'string',
      webUrl: EvidenceWebUrlInfo,
      profileId: 'string',
      obtainType: 'string',
      anchorName: 'string',
      expectedStartTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateEvidenceLiveResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 直播取证id
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

export class CreateEvidenceVodRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 取证用户id
  evidenceUserId: string;
  // 公证处code
  notaryOffice: string;
  // 取证类型（通用点播取证：DEFAULT，快手点播取证：KUAISHOU）
  type?: string;
  // 待取证点播网站网址
  webUrl: EvidenceWebUrlInfo;
  // 幂等字段
  clientToken: string;
  // 取证平台
  obtainPlatform?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      evidenceUserId: 'evidence_user_id',
      notaryOffice: 'notary_office',
      type: 'type',
      webUrl: 'web_url',
      clientToken: 'client_token',
      obtainPlatform: 'obtain_platform',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      evidenceUserId: 'string',
      notaryOffice: 'string',
      type: 'string',
      webUrl: EvidenceWebUrlInfo,
      clientToken: 'string',
      obtainPlatform: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateEvidenceVodResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 取证编号
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

export class GetTradeUsageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 服务实体ID，例如DCI
  serviceId: string;
  // 服务类型
  serviceType: string;
  // 扩展信息
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceId: 'service_id',
      serviceType: 'service_type',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceId: 'string',
      serviceType: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTradeUsageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易登记Id
  registerId?: string;
  // 登记状态
  status?: string;
  // 扩展信息
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      registerId: 'register_id',
      status: 'status',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      registerId: 'string',
      status: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetEvidenceInfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 取证编号
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

export class GetEvidenceInfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 取证编号
  evidenceId?: string;
  // 取证类型（LIVE：直播，VOD：点播）
  evidenceType?: string;
  // 取证状态（取证中：DOING，取证成功：SUCCESS，取证失败：FAIL）
  status?: string;
  // 公证处code
  notaryOffice?: string;
  // 取证url信息
  evidenceUrl?: EvidenceWebUrlInfo;
  // 取证结果文件下载url（有效期3天）
  evidenceResultUrl?: string;
  // 存证证明信息
  certificateInfo?: EvidenceCertificateInfo;
  // 取证错误码
  evidenceErrorCode?: string;
  // 取证错误描述
  evidenceErrorMsg?: string;
  // 取证开始时间
  startTime?: number;
  // 取证结束时间
  finishTime?: number;
  // 取证动态参数
  platformDynamicParams?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      evidenceId: 'evidence_id',
      evidenceType: 'evidence_type',
      status: 'status',
      notaryOffice: 'notary_office',
      evidenceUrl: 'evidence_url',
      evidenceResultUrl: 'evidence_result_url',
      certificateInfo: 'certificate_info',
      evidenceErrorCode: 'evidence_error_code',
      evidenceErrorMsg: 'evidence_error_msg',
      startTime: 'start_time',
      finishTime: 'finish_time',
      platformDynamicParams: 'platform_dynamic_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      evidenceId: 'string',
      evidenceType: 'string',
      status: 'string',
      notaryOffice: 'string',
      evidenceUrl: EvidenceWebUrlInfo,
      evidenceResultUrl: 'string',
      certificateInfo: EvidenceCertificateInfo,
      evidenceErrorCode: 'string',
      evidenceErrorMsg: 'string',
      startTime: 'number',
      finishTime: 'number',
      platformDynamicParams: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReplaceDciRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // id
  dciContentId: string;
  // 作品名称
  workName?: string;
  // 作品类别
  workCategory?: string;
  // 创作信息
  creationInfo?: DciCreationInfo;
  // 发表信息
  publicationInfo?: DciPublicationInfo;
  // 申领人id
  dciUserId?: string;
  // 著作权人
  copyrightOwnerIds?: string[];
  // 作者姓名
  authorName?: string;
  // 作者署名
  authorSignature?: string;
  // 权利信息
  rightInfo?: DciRightInfo;
  // 幂等字段
  clientToken: string;
  // 代理信息
  proxyData?: ProxyData;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dciContentId: 'dci_content_id',
      workName: 'work_name',
      workCategory: 'work_category',
      creationInfo: 'creation_info',
      publicationInfo: 'publication_info',
      dciUserId: 'dci_user_id',
      copyrightOwnerIds: 'copyright_owner_ids',
      authorName: 'author_name',
      authorSignature: 'author_signature',
      rightInfo: 'right_info',
      clientToken: 'client_token',
      proxyData: 'proxy_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dciContentId: 'string',
      workName: 'string',
      workCategory: 'string',
      creationInfo: DciCreationInfo,
      publicationInfo: DciPublicationInfo,
      dciUserId: 'string',
      copyrightOwnerIds: { 'type': 'array', 'itemType': 'string' },
      authorName: 'string',
      authorSignature: 'string',
      rightInfo: DciRightInfo,
      clientToken: 'string',
      proxyData: ProxyData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReplaceDciResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误信息
  errorMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      errorMsg: 'error_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      errorMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitDciFeedbackRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务ID
  serviceId: string;
  // 联系人
  contactName: string;
  // 联系电话
  contactPhoneNumber: string;
  // 申诉原因
  message: string;
  // 幂等字段
  clientToken: string;
  // 反馈类型
  feedbackType: string;
  // 邮箱
  email?: string;
  // 代理信息
  proxyData?: ProxyData;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceId: 'service_id',
      contactName: 'contact_name',
      contactPhoneNumber: 'contact_phone_number',
      message: 'message',
      clientToken: 'client_token',
      feedbackType: 'feedback_type',
      email: 'email',
      proxyData: 'proxy_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceId: 'string',
      contactName: 'string',
      contactPhoneNumber: 'string',
      message: 'string',
      clientToken: 'string',
      feedbackType: 'string',
      email: 'string',
      proxyData: ProxyData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitDciFeedbackResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 记录ID
  id?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDciFeedbackRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 申诉ID
  id: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDciFeedbackResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 申诉状态
  feedbackStatus?: string;
  // dciID
  dciContentId?: string;
  // 备注或失败原因
  msg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      feedbackStatus: 'feedback_status',
      dciContentId: 'dci_content_id',
      msg: 'msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      feedbackStatus: 'string',
      dciContentId: 'string',
      msg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecTradeCoverRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 调用方唯一业务标识
  outBizNo: number;
  // 需要抽取封面的文件url
  fileUrl: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outBizNo: 'out_biz_no',
      fileUrl: 'file_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outBizNo: 'number',
      fileUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecTradeCoverResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 调用方唯一业务标识	
  outBizNo?: number;
  // 扩展信息	
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      outBizNo: 'out_biz_no',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      outBizNo: 'number',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 幂等字段
  clientToken: string;
  // 幂等id【标废弃， 幂等id已client_token为准】
  requestId?: string;
  // 发票信息
  invoiceInfo: InvoiceInfo;
  // 订单明细列表
  orderItem: OrderItem[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      clientToken: 'client_token',
      requestId: 'request_id',
      invoiceInfo: 'invoice_info',
      orderItem: 'order_item',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      clientToken: 'string',
      requestId: 'string',
      invoiceInfo: InvoiceInfo,
      orderItem: { 'type': 'array', 'itemType': OrderItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用于查询支付链接
  orderId?: string;
  // 创建订单失败
  errorMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
      errorMsg: 'error_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
      errorMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOrderPayurlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOrderPayurlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 支付链接
  payUrl?: string;
  // 查询支付链接失败
  errorMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      payUrl: 'pay_url',
      errorMsg: 'error_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      payUrl: 'string',
      errorMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FinishDciRegistrationcertRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务ID
  taskId: string;
  // 登记号
  regNumber: string;
  // 数登证书地址
  certificateUrl?: string;
  // 数登样本地址
  sampleUrl?: string;
  // 客户端幂等token
  clientToken: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskId: 'task_id',
      regNumber: 'reg_number',
      certificateUrl: 'certificate_url',
      sampleUrl: 'sample_url',
      clientToken: 'client_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskId: 'string',
      regNumber: 'string',
      certificateUrl: 'string',
      sampleUrl: 'string',
      clientToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FinishDciRegistrationcertResponse extends $tea.Model {
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

export class CancelDciRegistrationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数登申请id
  digitalRegisterId?: string;
  // 幂等id
  clientToken: string;
  // 1111111
  orderId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      digitalRegisterId: 'digital_register_id',
      clientToken: 'client_token',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      digitalRegisterId: 'string',
      clientToken: 'string',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelDciRegistrationResponse extends $tea.Model {
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

export class CreateScreenshotNewRequest extends $tea.Model {
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
  // 取证人电话号码，生成公证处证书需要，公证处需要作登记 格式范例：(86-573)2651630 或 (86)13738258505
  phoneNum?: string;
  // 代理信息
  fileId?: ProxyData;
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
      fileId: 'file_id',
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
      fileId: ProxyData,
      clientToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateScreenshotNewResponse extends $tea.Model {
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

export class CreateCyclinginsuranceServiceorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 来源场景
  scene: string;
  // 请求唯一id
  requestId: string;
  // 调用方应用名
  callerAppName: string;
  // 业务id，用于幂等
  bizId: string;
  // 下单账号
  accountId: string;
  // 商品码
  itemCode: string;
  // 商品属性
  itemAttributes: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
      requestId: 'request_id',
      callerAppName: 'caller_app_name',
      bizId: 'biz_id',
      accountId: 'account_id',
      itemCode: 'item_code',
      itemAttributes: 'item_attributes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
      requestId: 'string',
      callerAppName: 'string',
      bizId: 'string',
      accountId: 'string',
      itemCode: 'string',
      itemAttributes: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCyclinginsuranceServiceorderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单id
  orderId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCyclinginsuranceServiceinventoryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景
  scene: string;
  // 请求id，用于链路追踪，如uuid
  requestId: string;
  // 调用方
  callerAppName: string;
  // 服务商账号id
  accountId: string;
  // 商品code
  itemCode: string;
  // 商品属性
  itemAttributes: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
      requestId: 'request_id',
      callerAppName: 'caller_app_name',
      accountId: 'account_id',
      itemCode: 'item_code',
      itemAttributes: 'item_attributes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
      requestId: 'string',
      callerAppName: 'string',
      accountId: 'string',
      itemCode: 'string',
      itemAttributes: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCyclinginsuranceServiceinventoryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商品库存列表
  itemInventorys?: ItemInventoryVO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      itemInventorys: 'item_inventorys',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      itemInventorys: { 'type': 'array', 'itemType': ItemInventoryVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCyclinginsuranceOrderdetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务场景
  scene: string;
  // 请求id
  requestId: string;
  // 请求方应用名
  callerAppName: string;
  // 订单号
  orderId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
      requestId: 'request_id',
      callerAppName: 'caller_app_name',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
      requestId: 'string',
      callerAppName: 'string',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCyclinginsuranceOrderdetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单号
  orderId?: string;
  // 订单账号
  acoountId?: string;
  // 商品码
  itemCode?: string;
  // 商品属性
  itemAttributes?: string;
  // 订单履约流程信息
  fulfillmentProcessInfo?: string;
  // 附件
  attachments?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
      acoountId: 'acoount_id',
      itemCode: 'item_code',
      itemAttributes: 'item_attributes',
      fulfillmentProcessInfo: 'fulfillment_process_info',
      attachments: 'attachments',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
      acoountId: 'string',
      itemCode: 'string',
      itemAttributes: 'string',
      fulfillmentProcessInfo: 'string',
      attachments: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelCyclinginsuranceServiceorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求唯一Id
  requestId: string;
  // 来源场景
  scene: string;
  // 调用应用名
  callerAppName: string;
  // 外部业务id，用于幂等
  bizId: string;
  // 订单id
  orderId: string;
  // 账号id
  accountId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      requestId: 'request_id',
      scene: 'scene',
      callerAppName: 'caller_app_name',
      bizId: 'biz_id',
      orderId: 'order_id',
      accountId: 'account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      requestId: 'string',
      scene: 'string',
      callerAppName: 'string',
      bizId: 'string',
      orderId: 'string',
      accountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelCyclinginsuranceServiceorderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单取消是否成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddContentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件id
  fileId: string;
  // 内容标题
  title: string;
  // 文件类型
  type: string;
  // 内容标签列表
  keywords?: string[];
  // 内容描述
  description?: string;
  // 内容封面文件id
  coverFileId?: string;
  // 播放列表实体：包括名称和各种授权维权信息
  playListEntity: PlayListEntity;
  // 客户端token，幂等号，用来保证并发请求幂等性
  clientToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileId: 'file_id',
      title: 'title',
      type: 'type',
      keywords: 'keywords',
      description: 'description',
      coverFileId: 'cover_file_id',
      playListEntity: 'play_list_entity',
      clientToken: 'client_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileId: 'string',
      title: 'string',
      type: 'string',
      keywords: { 'type': 'array', 'itemType': 'string' },
      description: 'string',
      coverFileId: 'string',
      playListEntity: PlayListEntity,
      clientToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddContentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 视频内容id
  contentId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      contentId: 'content_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      contentId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContentStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 视频内容id
  contentId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      contentId: 'content_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      contentId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContentStatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 视频内容id
  contentId?: string;
  // 视频状态
  status?: string;
  // 内容标题
  title?: string;
  // 内容类型
  type?: string;
  // 标签列表
  keywords?: string[];
  // 内容描述
  description?: string;
  // 内容封面文件地址
  coverUrl?: string;
  // 存证id
  registerId?: string;
  // 内容授权合同文件地址
  authPdfUrl?: string;
  // 播放列表名称
  playListName?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      contentId: 'content_id',
      status: 'status',
      title: 'title',
      type: 'type',
      keywords: 'keywords',
      description: 'description',
      coverUrl: 'cover_url',
      registerId: 'register_id',
      authPdfUrl: 'auth_pdf_url',
      playListName: 'play_list_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      contentId: 'string',
      status: 'string',
      title: 'string',
      type: 'string',
      keywords: { 'type': 'array', 'itemType': 'string' },
      description: 'string',
      coverUrl: 'string',
      registerId: 'string',
      authPdfUrl: 'string',
      playListName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContentStatisticsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 内容id列表
  contentId: string;
  // 起始日期时间戳
  startTime: number;
  // 截止日期时间戳
  endTime: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      contentId: 'content_id',
      startTime: 'start_time',
      endTime: 'end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      contentId: 'string',
      startTime: 'number',
      endTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContentStatisticsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总观看次数
  totalViews?: string;
  // 总观看时长
  totalViewDuration?: string;
  // 总平均观看时长
  totalAverageViewDuration?: string;
  // 总预计收入
  totalRevenue?: string;
  // 每日详细统计列表
  dayStatisticsList?: DayStatisticsInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalViews: 'total_views',
      totalViewDuration: 'total_view_duration',
      totalAverageViewDuration: 'total_average_view_duration',
      totalRevenue: 'total_revenue',
      dayStatisticsList: 'day_statistics_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalViews: 'string',
      totalViewDuration: 'string',
      totalAverageViewDuration: 'string',
      totalRevenue: 'string',
      dayStatisticsList: { 'type': 'array', 'itemType': DayStatisticsInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContentBatchstatisticsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 内容id列表
  contentIdList: string[];
  // 起始日期时间戳
  startTime: number;
  // 截止日期时间戳
  endTime: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      contentIdList: 'content_id_list',
      startTime: 'start_time',
      endTime: 'end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      contentIdList: { 'type': 'array', 'itemType': 'string' },
      startTime: 'number',
      endTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContentBatchstatisticsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 出海视频统计数据列表
  overseaContentStatisticsList?: OverseaContentStatistics[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      overseaContentStatisticsList: 'oversea_content_statistics_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      overseaContentStatisticsList: { 'type': 'array', 'itemType': OverseaContentStatistics },
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
          sdk_version: "1.19.67",
          _prod_code: "BCCR",
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
   * Description: 更新dci账号信息
   * Summary: 更新dci账号信息
   */
  async updateDciUser(request: UpdateDciUserRequest): Promise<UpdateDciUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateDciUserEx(request, headers, runtime);
  }

  /**
   * Description: 更新dci账号信息
   * Summary: 更新dci账号信息
   */
  async updateDciUserEx(request: UpdateDciUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateDciUserResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDciUserResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.user.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateDciUserResponse({}));
  }

  /**
   * Description: 发起数登申请
   * Summary: 发起数登申请
   */
  async createDciRegistration(request: CreateDciRegistrationRequest): Promise<CreateDciRegistrationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDciRegistrationEx(request, headers, runtime);
  }

  /**
   * Description: 发起数登申请
   * Summary: 发起数登申请
   */
  async createDciRegistrationEx(request: CreateDciRegistrationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDciRegistrationResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDciRegistrationResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.registration.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDciRegistrationResponse({}));
  }

  /**
   * Description: 已废弃接口
   * Summary: 已废弃接口
   */
  async queryDciRegistrationsubmit(request: QueryDciRegistrationsubmitRequest): Promise<QueryDciRegistrationsubmitResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDciRegistrationsubmitEx(request, headers, runtime);
  }

  /**
   * Description: 已废弃接口
   * Summary: 已废弃接口
   */
  async queryDciRegistrationsubmitEx(request: QueryDciRegistrationsubmitRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDciRegistrationsubmitResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDciRegistrationsubmitResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.registrationsubmit.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDciRegistrationsubmitResponse({}));
  }

  /**
   * Description: 查询数登结果
   * Summary: 查询数登结果
   */
  async queryDciRegistration(request: QueryDciRegistrationRequest): Promise<QueryDciRegistrationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDciRegistrationEx(request, headers, runtime);
  }

  /**
   * Description: 查询数登结果
   * Summary: 查询数登结果
   */
  async queryDciRegistrationEx(request: QueryDciRegistrationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDciRegistrationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDciRegistrationResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.registration.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDciRegistrationResponse({}));
  }

  /**
   * Description: 获取数登证书下载链接
   * Summary: 获取数登证书下载链接
   */
  async getDciRegistrationcert(request: GetDciRegistrationcertRequest): Promise<GetDciRegistrationcertResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDciRegistrationcertEx(request, headers, runtime);
  }

  /**
   * Description: 获取数登证书下载链接
   * Summary: 获取数登证书下载链接
   */
  async getDciRegistrationcertEx(request: GetDciRegistrationcertRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDciRegistrationcertResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDciRegistrationcertResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.registrationcert.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDciRegistrationcertResponse({}));
  }

  /**
   * Description: 查询内容安全审核详情
   * Summary: 查询内容安全审核详情
   */
  async queryDciContentsecurity(request: QueryDciContentsecurityRequest): Promise<QueryDciContentsecurityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDciContentsecurityEx(request, headers, runtime);
  }

  /**
   * Description: 查询内容安全审核详情
   * Summary: 查询内容安全审核详情
   */
  async queryDciContentsecurityEx(request: QueryDciContentsecurityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDciContentsecurityResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDciContentsecurityResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.contentsecurity.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDciContentsecurityResponse({}));
  }

  /**
   * Description: 创建数字登记证书
   * Summary: 创建数字登记证书
   */
  async createDciRegistrationcert(request: CreateDciRegistrationcertRequest): Promise<CreateDciRegistrationcertResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDciRegistrationcertEx(request, headers, runtime);
  }

  /**
   * Description: 创建数字登记证书
   * Summary: 创建数字登记证书
   */
  async createDciRegistrationcertEx(request: CreateDciRegistrationcertRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDciRegistrationcertResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDciRegistrationcertResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.registrationcert.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDciRegistrationcertResponse({}));
  }

  /**
   * Description: 已废弃接口
   * Summary: 已废弃接口
   */
  async queryDciRegistrationcert(request: QueryDciRegistrationcertRequest): Promise<QueryDciRegistrationcertResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDciRegistrationcertEx(request, headers, runtime);
  }

  /**
   * Description: 已废弃接口
   * Summary: 已废弃接口
   */
  async queryDciRegistrationcertEx(request: QueryDciRegistrationcertRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDciRegistrationcertResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDciRegistrationcertResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.registrationcert.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDciRegistrationcertResponse({}));
  }

  /**
   * Description: 发起支付，获取支付链接
   * Summary: 数登支付-发起支付
   */
  async getDciPayurl(request: GetDciPayurlRequest): Promise<GetDciPayurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDciPayurlEx(request, headers, runtime);
  }

  /**
   * Description: 发起支付，获取支付链接
   * Summary: 数登支付-发起支付
   */
  async getDciPayurlEx(request: GetDciPayurlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDciPayurlResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDciPayurlResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.payurl.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDciPayurlResponse({}));
  }

  /**
   * Description: 查询数登支付结果
   * Summary: 查询数登支付结果
   */
  async queryDciPay(request: QueryDciPayRequest): Promise<QueryDciPayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDciPayEx(request, headers, runtime);
  }

  /**
   * Description: 查询数登支付结果
   * Summary: 查询数登支付结果
   */
  async queryDciPayEx(request: QueryDciPayRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDciPayResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDciPayResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.pay.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDciPayResponse({}));
  }

  /**
   * Description: 支付结果回调
   * Summary: 数登支付-支付结果回调
   */
  async callbackDciPayresult(request: CallbackDciPayresultRequest): Promise<CallbackDciPayresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackDciPayresultEx(request, headers, runtime);
  }

  /**
   * Description: 支付结果回调
   * Summary: 数登支付-支付结果回调
   */
  async callbackDciPayresultEx(request: CallbackDciPayresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackDciPayresultResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackDciPayresultResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.payresult.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackDciPayresultResponse({}));
  }

  /**
   * Description: 数登审核失败结果回调
   * Summary: 数登审核失败结果回调
   */
  async refuseDciRegistration(request: RefuseDciRegistrationRequest): Promise<RefuseDciRegistrationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.refuseDciRegistrationEx(request, headers, runtime);
  }

  /**
   * Description: 数登审核失败结果回调
   * Summary: 数登审核失败结果回调
   */
  async refuseDciRegistrationEx(request: RefuseDciRegistrationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RefuseDciRegistrationResponse> {
    Util.validateModel(request);
    return $tea.cast<RefuseDciRegistrationResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.registration.refuse", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RefuseDciRegistrationResponse({}));
  }

  /**
   * Description: 版权平台获取申办事由配置
   * Summary: 获取申办事由配置
   */
  async queryNotaryBidreason(request: QueryNotaryBidreasonRequest): Promise<QueryNotaryBidreasonResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryNotaryBidreasonEx(request, headers, runtime);
  }

  /**
   * Description: 版权平台获取申办事由配置
   * Summary: 获取申办事由配置
   */
  async queryNotaryBidreasonEx(request: QueryNotaryBidreasonRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryNotaryBidreasonResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryNotaryBidreasonResponse>(await this.doRequest("1.0", "blockchain.bccr.notary.bidreason.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryNotaryBidreasonResponse({}));
  }

  /**
   * Description: 获取签署文件
   * Summary: 获取签署文件
   */
  async queryNotaryDocumenttosign(request: QueryNotaryDocumenttosignRequest): Promise<QueryNotaryDocumenttosignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryNotaryDocumenttosignEx(request, headers, runtime);
  }

  /**
   * Description: 获取签署文件
   * Summary: 获取签署文件
   */
  async queryNotaryDocumenttosignEx(request: QueryNotaryDocumenttosignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryNotaryDocumenttosignResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryNotaryDocumenttosignResponse>(await this.doRequest("1.0", "blockchain.bccr.notary.documenttosign.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryNotaryDocumenttosignResponse({}));
  }

  /**
   * Description: 提交申办订单
   * Summary: 提交申办订单
   */
  async applyNotaryOrder(request: ApplyNotaryOrderRequest): Promise<ApplyNotaryOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyNotaryOrderEx(request, headers, runtime);
  }

  /**
   * Description: 提交申办订单
   * Summary: 提交申办订单
   */
  async applyNotaryOrderEx(request: ApplyNotaryOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyNotaryOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyNotaryOrderResponse>(await this.doRequest("1.0", "blockchain.bccr.notary.order.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyNotaryOrderResponse({}));
  }

  /**
   * Description: 公证出证重新获取支付链接
   * Summary: 重新获取支付链接
   */
  async queryNotaryPayurl(request: QueryNotaryPayurlRequest): Promise<QueryNotaryPayurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryNotaryPayurlEx(request, headers, runtime);
  }

  /**
   * Description: 公证出证重新获取支付链接
   * Summary: 重新获取支付链接
   */
  async queryNotaryPayurlEx(request: QueryNotaryPayurlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryNotaryPayurlResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryNotaryPayurlResponse>(await this.doRequest("1.0", "blockchain.bccr.notary.payurl.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryNotaryPayurlResponse({}));
  }

  /**
   * Description: 公证出证获取收费标准和明细
   * Summary: 获取收费标准和明细
   */
  async queryNotaryFeedetail(request: QueryNotaryFeedetailRequest): Promise<QueryNotaryFeedetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryNotaryFeedetailEx(request, headers, runtime);
  }

  /**
   * Description: 公证出证获取收费标准和明细
   * Summary: 获取收费标准和明细
   */
  async queryNotaryFeedetailEx(request: QueryNotaryFeedetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryNotaryFeedetailResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryNotaryFeedetailResponse>(await this.doRequest("1.0", "blockchain.bccr.notary.feedetail.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryNotaryFeedetailResponse({}));
  }

  /**
   * Description: 公证出证查询申办订单接口
   * Summary: 查询申办订单接口
   */
  async queryNotaryOrder(request: QueryNotaryOrderRequest): Promise<QueryNotaryOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryNotaryOrderEx(request, headers, runtime);
  }

  /**
   * Description: 公证出证查询申办订单接口
   * Summary: 查询申办订单接口
   */
  async queryNotaryOrderEx(request: QueryNotaryOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryNotaryOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryNotaryOrderResponse>(await this.doRequest("1.0", "blockchain.bccr.notary.order.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryNotaryOrderResponse({}));
  }

  /**
   * Description: 公证出证申请出证材料补齐
   * Summary: 申请出证材料补齐
   */
  async uploadNotaryAttachment(request: UploadNotaryAttachmentRequest): Promise<UploadNotaryAttachmentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadNotaryAttachmentEx(request, headers, runtime);
  }

  /**
   * Description: 公证出证申请出证材料补齐
   * Summary: 申请出证材料补齐
   */
  async uploadNotaryAttachmentEx(request: UploadNotaryAttachmentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadNotaryAttachmentResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadNotaryAttachmentResponse>(await this.doRequest("1.0", "blockchain.bccr.notary.attachment.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadNotaryAttachmentResponse({}));
  }

  /**
   * Description: 公证出证更新申办状态
   * Summary: 更新申办状态
   */
  async operateNotaryOrder(request: OperateNotaryOrderRequest): Promise<OperateNotaryOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateNotaryOrderEx(request, headers, runtime);
  }

  /**
   * Description: 公证出证更新申办状态
   * Summary: 更新申办状态
   */
  async operateNotaryOrderEx(request: OperateNotaryOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateNotaryOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateNotaryOrderResponse>(await this.doRequest("1.0", "blockchain.bccr.notary.order.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateNotaryOrderResponse({}));
  }

  /**
   * Description: 查询DCI作品预览结果
   * Summary: 查询DCI作品预览结果
   */
  async queryDciPreview(request: QueryDciPreviewRequest): Promise<QueryDciPreviewResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDciPreviewEx(request, headers, runtime);
  }

  /**
   * Description: 查询DCI作品预览结果
   * Summary: 查询DCI作品预览结果
   */
  async queryDciPreviewEx(request: QueryDciPreviewRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDciPreviewResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDciPreviewResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.preview.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDciPreviewResponse({}));
  }

  /**
   * Description: 补正数登申请
   * Summary: 补正数登申请
   */
  async retryDciRegistration(request: RetryDciRegistrationRequest): Promise<RetryDciRegistrationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryDciRegistrationEx(request, headers, runtime);
  }

  /**
   * Description: 补正数登申请
   * Summary: 补正数登申请
   */
  async retryDciRegistrationEx(request: RetryDciRegistrationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryDciRegistrationResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryDciRegistrationResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.registration.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryDciRegistrationResponse({}));
  }

  /**
   * Description: 数登停止申请
   * Summary: 数登停止申请
   */
  async closeDciRegistration(request: CloseDciRegistrationRequest): Promise<CloseDciRegistrationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.closeDciRegistrationEx(request, headers, runtime);
  }

  /**
   * Description: 数登停止申请
   * Summary: 数登停止申请
   */
  async closeDciRegistrationEx(request: CloseDciRegistrationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CloseDciRegistrationResponse> {
    Util.validateModel(request);
    return $tea.cast<CloseDciRegistrationResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.registration.close", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CloseDciRegistrationResponse({}));
  }

  /**
   * Description: dci用户无需证件注册
   * Summary: dci用户无需证件注册
   */
  async addDciUsernocert(request: AddDciUsernocertRequest): Promise<AddDciUsernocertResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addDciUsernocertEx(request, headers, runtime);
  }

  /**
   * Description: dci用户无需证件注册
   * Summary: dci用户无需证件注册
   */
  async addDciUsernocertEx(request: AddDciUsernocertRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddDciUsernocertResponse> {
    Util.validateModel(request);
    return $tea.cast<AddDciUsernocertResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.usernocert.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddDciUsernocertResponse({}));
  }

  /**
   * Description: 查询相似作品下载链接
   * Summary: 查询相似作品下载链接
   */
  async queryDciSimilarfile(request: QueryDciSimilarfileRequest): Promise<QueryDciSimilarfileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDciSimilarfileEx(request, headers, runtime);
  }

  /**
   * Description: 查询相似作品下载链接
   * Summary: 查询相似作品下载链接
   */
  async queryDciSimilarfileEx(request: QueryDciSimilarfileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDciSimilarfileResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDciSimilarfileResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.similarfile.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDciSimilarfileResponse({}));
  }

  /**
   * Description: 申请渠道推广
   * Summary: 申请渠道推广
   */
  async applyDciPromotion(request: ApplyDciPromotionRequest): Promise<ApplyDciPromotionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyDciPromotionEx(request, headers, runtime);
  }

  /**
   * Description: 申请渠道推广
   * Summary: 申请渠道推广
   */
  async applyDciPromotionEx(request: ApplyDciPromotionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyDciPromotionResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyDciPromotionResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.promotion.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyDciPromotionResponse({}));
  }

  /**
   * Description: 根据手机号查询dci用户
   * Summary: 根据手机号查询dci用户
   */
  async queryDciUserbyphone(request: QueryDciUserbyphoneRequest): Promise<QueryDciUserbyphoneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDciUserbyphoneEx(request, headers, runtime);
  }

  /**
   * Description: 根据手机号查询dci用户
   * Summary: 根据手机号查询dci用户
   */
  async queryDciUserbyphoneEx(request: QueryDciUserbyphoneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDciUserbyphoneResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDciUserbyphoneResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.userbyphone.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDciUserbyphoneResponse({}));
  }

  /**
   * Description: 支持交易的已进行用途登记的商品查询
   * Summary: 支持交易的商品查询
   */
  async queryTradeSale(request: QueryTradeSaleRequest): Promise<QueryTradeSaleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTradeSaleEx(request, headers, runtime);
  }

  /**
   * Description: 支持交易的已进行用途登记的商品查询
   * Summary: 支持交易的商品查询
   */
  async queryTradeSaleEx(request: QueryTradeSaleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTradeSaleResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTradeSaleResponse>(await this.doRequest("1.0", "blockchain.bccr.trade.sale.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTradeSaleResponse({}));
  }

  /**
   * Description: 商品交易用途登记
   * Summary: 商品交易用途登记
   */
  async registerTradeUsage(request: RegisterTradeUsageRequest): Promise<RegisterTradeUsageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.registerTradeUsageEx(request, headers, runtime);
  }

  /**
   * Description: 商品交易用途登记
   * Summary: 商品交易用途登记
   */
  async registerTradeUsageEx(request: RegisterTradeUsageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RegisterTradeUsageResponse> {
    Util.validateModel(request);
    return $tea.cast<RegisterTradeUsageResponse>(await this.doRequest("1.0", "blockchain.bccr.trade.usage.register", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RegisterTradeUsageResponse({}));
  }

  /**
   * Description: 创建取证用户
   * Summary: 创建取证用户
   */
  async createEvidenceUser(request: CreateEvidenceUserRequest): Promise<CreateEvidenceUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createEvidenceUserEx(request, headers, runtime);
  }

  /**
   * Description: 创建取证用户
   * Summary: 创建取证用户
   */
  async createEvidenceUserEx(request: CreateEvidenceUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateEvidenceUserResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateEvidenceUserResponse>(await this.doRequest("1.0", "blockchain.bccr.evidence.user.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateEvidenceUserResponse({}));
  }

  /**
   * Description: 创建网页截图
   * Summary: 创建网页截图
   */
  async createEvidenceScreenshot(request: CreateEvidenceScreenshotRequest): Promise<CreateEvidenceScreenshotResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createEvidenceScreenshotEx(request, headers, runtime);
  }

  /**
   * Description: 创建网页截图
   * Summary: 创建网页截图
   */
  async createEvidenceScreenshotEx(request: CreateEvidenceScreenshotRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateEvidenceScreenshotResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateEvidenceScreenshotResponse>(await this.doRequest("1.0", "blockchain.bccr.evidence.screenshot.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateEvidenceScreenshotResponse({}));
  }

  /**
   * Description: 创建网页截图存证
   * Summary: 创建网页截图存证
   */
  async createEvidenceRegister(request: CreateEvidenceRegisterRequest): Promise<CreateEvidenceRegisterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createEvidenceRegisterEx(request, headers, runtime);
  }

  /**
   * Description: 创建网页截图存证
   * Summary: 创建网页截图存证
   */
  async createEvidenceRegisterEx(request: CreateEvidenceRegisterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateEvidenceRegisterResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateEvidenceRegisterResponse>(await this.doRequest("1.0", "blockchain.bccr.evidence.register.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateEvidenceRegisterResponse({}));
  }

  /**
   * Description: 创建录屏取证
   * Summary: 创建录屏取证
   */
  async createEvidenceRecordscreen(request: CreateEvidenceRecordscreenRequest): Promise<CreateEvidenceRecordscreenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createEvidenceRecordscreenEx(request, headers, runtime);
  }

  /**
   * Description: 创建录屏取证
   * Summary: 创建录屏取证
   */
  async createEvidenceRecordscreenEx(request: CreateEvidenceRecordscreenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateEvidenceRecordscreenResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateEvidenceRecordscreenResponse>(await this.doRequest("1.0", "blockchain.bccr.evidence.recordscreen.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateEvidenceRecordscreenResponse({}));
  }

  /**
   * Description: 商品交易用途撤销
   * Summary: 商品交易用途撤销
   */
  async cancelTradeUsage(request: CancelTradeUsageRequest): Promise<CancelTradeUsageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelTradeUsageEx(request, headers, runtime);
  }

  /**
   * Description: 商品交易用途撤销
   * Summary: 商品交易用途撤销
   */
  async cancelTradeUsageEx(request: CancelTradeUsageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelTradeUsageResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelTradeUsageResponse>(await this.doRequest("1.0", "blockchain.bccr.trade.usage.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelTradeUsageResponse({}));
  }

  /**
   * Description: 创建自动化直播录屏取证
   * Summary: 创建自动化直播取证
   */
  async createEvidenceLive(request: CreateEvidenceLiveRequest): Promise<CreateEvidenceLiveResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createEvidenceLiveEx(request, headers, runtime);
  }

  /**
   * Description: 创建自动化直播录屏取证
   * Summary: 创建自动化直播取证
   */
  async createEvidenceLiveEx(request: CreateEvidenceLiveRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateEvidenceLiveResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateEvidenceLiveResponse>(await this.doRequest("1.0", "blockchain.bccr.evidence.live.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateEvidenceLiveResponse({}));
  }

  /**
   * Description: 根据点播网站url发起点播取证
   * Summary: 发起点播取证
   */
  async createEvidenceVod(request: CreateEvidenceVodRequest): Promise<CreateEvidenceVodResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createEvidenceVodEx(request, headers, runtime);
  }

  /**
   * Description: 根据点播网站url发起点播取证
   * Summary: 发起点播取证
   */
  async createEvidenceVodEx(request: CreateEvidenceVodRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateEvidenceVodResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateEvidenceVodResponse>(await this.doRequest("1.0", "blockchain.bccr.evidence.vod.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateEvidenceVodResponse({}));
  }

  /**
   * Description: 商品交易用途登记结果查询，目前仅用于测试
   * Summary: 商品交易用途登记结果查询
   */
  async getTradeUsage(request: GetTradeUsageRequest): Promise<GetTradeUsageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTradeUsageEx(request, headers, runtime);
  }

  /**
   * Description: 商品交易用途登记结果查询，目前仅用于测试
   * Summary: 商品交易用途登记结果查询
   */
  async getTradeUsageEx(request: GetTradeUsageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTradeUsageResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTradeUsageResponse>(await this.doRequest("1.0", "blockchain.bccr.trade.usage.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTradeUsageResponse({}));
  }

  /**
   * Description: 查询取证信息
   * Summary: 查询取证信息
   */
  async getEvidenceInfo(request: GetEvidenceInfoRequest): Promise<GetEvidenceInfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getEvidenceInfoEx(request, headers, runtime);
  }

  /**
   * Description: 查询取证信息
   * Summary: 查询取证信息
   */
  async getEvidenceInfoEx(request: GetEvidenceInfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetEvidenceInfoResponse> {
    Util.validateModel(request);
    return $tea.cast<GetEvidenceInfoResponse>(await this.doRequest("1.0", "blockchain.bccr.evidence.info.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetEvidenceInfoResponse({}));
  }

  /**
   * Description: DCI变更
   * Summary: DCI变更
   */
  async replaceDci(request: ReplaceDciRequest): Promise<ReplaceDciResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.replaceDciEx(request, headers, runtime);
  }

  /**
   * Description: DCI变更
   * Summary: DCI变更
   */
  async replaceDciEx(request: ReplaceDciRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReplaceDciResponse> {
    Util.validateModel(request);
    return $tea.cast<ReplaceDciResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.replace", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReplaceDciResponse({}));
  }

  /**
   * Description: 提交作品申诉
   * Summary: 提交作品申诉
   */
  async submitDciFeedback(request: SubmitDciFeedbackRequest): Promise<SubmitDciFeedbackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitDciFeedbackEx(request, headers, runtime);
  }

  /**
   * Description: 提交作品申诉
   * Summary: 提交作品申诉
   */
  async submitDciFeedbackEx(request: SubmitDciFeedbackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitDciFeedbackResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitDciFeedbackResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.feedback.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitDciFeedbackResponse({}));
  }

  /**
   * Description: 查询申诉结果
   * Summary: 查询申诉结果
   */
  async queryDciFeedback(request: QueryDciFeedbackRequest): Promise<QueryDciFeedbackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDciFeedbackEx(request, headers, runtime);
  }

  /**
   * Description: 查询申诉结果
   * Summary: 查询申诉结果
   */
  async queryDciFeedbackEx(request: QueryDciFeedbackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDciFeedbackResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDciFeedbackResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.feedback.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDciFeedbackResponse({}));
  }

  /**
   * Description: 交易商品抽取封面
   * Summary: 交易商品抽取封面
   */
  async execTradeCover(request: ExecTradeCoverRequest): Promise<ExecTradeCoverResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execTradeCoverEx(request, headers, runtime);
  }

  /**
   * Description: 交易商品抽取封面
   * Summary: 交易商品抽取封面
   */
  async execTradeCoverEx(request: ExecTradeCoverRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecTradeCoverResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecTradeCoverResponse>(await this.doRequest("1.0", "blockchain.bccr.trade.cover.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecTradeCoverResponse({}));
  }

  /**
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createOrder(request: CreateOrderRequest): Promise<CreateOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createOrderEx(request, headers, runtime);
  }

  /**
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createOrderEx(request: CreateOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateOrderResponse>(await this.doRequest("1.0", "blockchain.bccr.order.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateOrderResponse({}));
  }

  /**
   * Description: 查询订单支付链接
   * Summary: 查询订单支付链接
   */
  async queryOrderPayurl(request: QueryOrderPayurlRequest): Promise<QueryOrderPayurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryOrderPayurlEx(request, headers, runtime);
  }

  /**
   * Description: 查询订单支付链接
   * Summary: 查询订单支付链接
   */
  async queryOrderPayurlEx(request: QueryOrderPayurlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryOrderPayurlResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryOrderPayurlResponse>(await this.doRequest("1.0", "blockchain.bccr.order.payurl.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryOrderPayurlResponse({}));
  }

  /**
   * Description: 版保完成数登证书回调
   * Summary: 版保完成数登证书回调
   */
  async finishDciRegistrationcert(request: FinishDciRegistrationcertRequest): Promise<FinishDciRegistrationcertResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.finishDciRegistrationcertEx(request, headers, runtime);
  }

  /**
   * Description: 版保完成数登证书回调
   * Summary: 版保完成数登证书回调
   */
  async finishDciRegistrationcertEx(request: FinishDciRegistrationcertRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<FinishDciRegistrationcertResponse> {
    Util.validateModel(request);
    return $tea.cast<FinishDciRegistrationcertResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.registrationcert.finish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new FinishDciRegistrationcertResponse({}));
  }

  /**
   * Description: 数登取消接口，目前在待支付状态下适用
   * Summary: 数登取消
   */
  async cancelDciRegistration(request: CancelDciRegistrationRequest): Promise<CancelDciRegistrationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelDciRegistrationEx(request, headers, runtime);
  }

  /**
   * Description: 数登取消接口，目前在待支付状态下适用
   * Summary: 数登取消
   */
  async cancelDciRegistrationEx(request: CancelDciRegistrationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelDciRegistrationResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelDciRegistrationResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.registration.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelDciRegistrationResponse({}));
  }

  /**
   * Description: 法信云网页取证
   * Summary: 法信云网页取证
   */
  async createScreenshotNew(request: CreateScreenshotNewRequest): Promise<CreateScreenshotNewResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createScreenshotNewEx(request, headers, runtime);
  }

  /**
   * Description: 法信云网页取证
   * Summary: 法信云网页取证
   */
  async createScreenshotNewEx(request: CreateScreenshotNewRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateScreenshotNewResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateScreenshotNewResponse>(await this.doRequest("1.0", "blockchain.bccr.screenshot.new.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateScreenshotNewResponse({}));
  }

  /**
   * Description: 骑行保创建订单接口
   * Summary: 骑行保创建订单接口
   */
  async createCyclinginsuranceServiceorder(request: CreateCyclinginsuranceServiceorderRequest): Promise<CreateCyclinginsuranceServiceorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCyclinginsuranceServiceorderEx(request, headers, runtime);
  }

  /**
   * Description: 骑行保创建订单接口
   * Summary: 骑行保创建订单接口
   */
  async createCyclinginsuranceServiceorderEx(request: CreateCyclinginsuranceServiceorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCyclinginsuranceServiceorderResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCyclinginsuranceServiceorderResponse>(await this.doRequest("1.0", "blockchain.bccr.cyclinginsurance.serviceorder.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCyclinginsuranceServiceorderResponse({}));
  }

  /**
   * Description: 服务商作业人员服务库存查询
   * Summary: 服务商作业人员服务库存查询
   */
  async queryCyclinginsuranceServiceinventory(request: QueryCyclinginsuranceServiceinventoryRequest): Promise<QueryCyclinginsuranceServiceinventoryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCyclinginsuranceServiceinventoryEx(request, headers, runtime);
  }

  /**
   * Description: 服务商作业人员服务库存查询
   * Summary: 服务商作业人员服务库存查询
   */
  async queryCyclinginsuranceServiceinventoryEx(request: QueryCyclinginsuranceServiceinventoryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCyclinginsuranceServiceinventoryResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCyclinginsuranceServiceinventoryResponse>(await this.doRequest("1.0", "blockchain.bccr.cyclinginsurance.serviceinventory.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCyclinginsuranceServiceinventoryResponse({}));
  }

  /**
   * Description: 骑行保查询订单详情
   * Summary: 骑行保查询订单详情
   */
  async queryCyclinginsuranceOrderdetail(request: QueryCyclinginsuranceOrderdetailRequest): Promise<QueryCyclinginsuranceOrderdetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCyclinginsuranceOrderdetailEx(request, headers, runtime);
  }

  /**
   * Description: 骑行保查询订单详情
   * Summary: 骑行保查询订单详情
   */
  async queryCyclinginsuranceOrderdetailEx(request: QueryCyclinginsuranceOrderdetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCyclinginsuranceOrderdetailResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCyclinginsuranceOrderdetailResponse>(await this.doRequest("1.0", "blockchain.bccr.cyclinginsurance.orderdetail.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCyclinginsuranceOrderdetailResponse({}));
  }

  /**
   * Description: 骑行保取消订单接口
   * Summary: 骑行保取消订单接口
   */
  async cancelCyclinginsuranceServiceorder(request: CancelCyclinginsuranceServiceorderRequest): Promise<CancelCyclinginsuranceServiceorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelCyclinginsuranceServiceorderEx(request, headers, runtime);
  }

  /**
   * Description: 骑行保取消订单接口
   * Summary: 骑行保取消订单接口
   */
  async cancelCyclinginsuranceServiceorderEx(request: CancelCyclinginsuranceServiceorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelCyclinginsuranceServiceorderResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelCyclinginsuranceServiceorderResponse>(await this.doRequest("1.0", "blockchain.bccr.cyclinginsurance.serviceorder.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelCyclinginsuranceServiceorderResponse({}));
  }

  /**
   * Description: 添加发布视频内容
   * Summary: 发布视频内容
   */
  async addContent(request: AddContentRequest): Promise<AddContentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addContentEx(request, headers, runtime);
  }

  /**
   * Description: 添加发布视频内容
   * Summary: 发布视频内容
   */
  async addContentEx(request: AddContentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddContentResponse> {
    Util.validateModel(request);
    return $tea.cast<AddContentResponse>(await this.doRequest("1.0", "blockchain.bccr.content.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddContentResponse({}));
  }

  /**
   * Description: 查询视频内容状态
   * Summary: 查询视频内容状态
   */
  async queryContentStatus(request: QueryContentStatusRequest): Promise<QueryContentStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContentStatusEx(request, headers, runtime);
  }

  /**
   * Description: 查询视频内容状态
   * Summary: 查询视频内容状态
   */
  async queryContentStatusEx(request: QueryContentStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContentStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContentStatusResponse>(await this.doRequest("1.0", "blockchain.bccr.content.status.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContentStatusResponse({}));
  }

  /**
   * Description: 查询视频内容统计数据
   * Summary: 查询视频内容统计
   */
  async queryContentStatistics(request: QueryContentStatisticsRequest): Promise<QueryContentStatisticsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContentStatisticsEx(request, headers, runtime);
  }

  /**
   * Description: 查询视频内容统计数据
   * Summary: 查询视频内容统计
   */
  async queryContentStatisticsEx(request: QueryContentStatisticsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContentStatisticsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContentStatisticsResponse>(await this.doRequest("1.0", "blockchain.bccr.content.statistics.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContentStatisticsResponse({}));
  }

  /**
   * Description: 批量查询视频内容统计数据
   * Summary: 批量查询视频统计信息
   */
  async queryContentBatchstatistics(request: QueryContentBatchstatisticsRequest): Promise<QueryContentBatchstatisticsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContentBatchstatisticsEx(request, headers, runtime);
  }

  /**
   * Description: 批量查询视频内容统计数据
   * Summary: 批量查询视频统计信息
   */
  async queryContentBatchstatisticsEx(request: QueryContentBatchstatisticsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContentBatchstatisticsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContentBatchstatisticsResponse>(await this.doRequest("1.0", "blockchain.bccr.content.batchstatistics.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContentBatchstatisticsResponse({}));
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
