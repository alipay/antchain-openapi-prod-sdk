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

export class CreateBlockchainBccrDciRegistrationRequest extends $tea.Model {
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBlockchainBccrDciRegistrationResponse extends $tea.Model {
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

export class QueryBlockchainBccrDciRegistrationsubmitRequest extends $tea.Model {
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

export class QueryBlockchainBccrDciRegistrationsubmitResponse extends $tea.Model {
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

export class QueryBlockchainBccrDciRegistrationRequest extends $tea.Model {
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

export class QueryBlockchainBccrDciRegistrationResponse extends $tea.Model {
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

export class GetBlockchainBccrDciRegistrationcertRequest extends $tea.Model {
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

export class GetBlockchainBccrDciRegistrationcertResponse extends $tea.Model {
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

export class CreateBlockchainBccrDciRegistrationcertRequest extends $tea.Model {
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

export class CreateBlockchainBccrDciRegistrationcertResponse extends $tea.Model {
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

export class QueryBlockchainBccrDciRegistrationcertRequest extends $tea.Model {
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

export class QueryBlockchainBccrDciRegistrationcertResponse extends $tea.Model {
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

export class GetBlockchainBccrDciPayurlRequest extends $tea.Model {
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

export class GetBlockchainBccrDciPayurlResponse extends $tea.Model {
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

export class QueryBlockchainBccrDciPayRequest extends $tea.Model {
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

export class QueryBlockchainBccrDciPayResponse extends $tea.Model {
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

export class CallbackBlockchainBccrDciPayresultRequest extends $tea.Model {
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

export class CallbackBlockchainBccrDciPayresultResponse extends $tea.Model {
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

export class RefuseBlockchainBccrDciRegistrationRequest extends $tea.Model {
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

export class RefuseBlockchainBccrDciRegistrationResponse extends $tea.Model {
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

export class RetryBlockchainBccrDciRegistrationRequest extends $tea.Model {
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

export class RetryBlockchainBccrDciRegistrationResponse extends $tea.Model {
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

export class CloseBlockchainBccrDciRegistrationRequest extends $tea.Model {
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

export class CloseBlockchainBccrDciRegistrationResponse extends $tea.Model {
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

export class CreateBlockchainBccrOrderRequest extends $tea.Model {
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

export class CreateBlockchainBccrOrderResponse extends $tea.Model {
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

export class QueryBlockchainBccrOrderPayurlRequest extends $tea.Model {
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

export class QueryBlockchainBccrOrderPayurlResponse extends $tea.Model {
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

export class FinishBlockchainBccrDciRegistrationcertRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
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

export class FinishBlockchainBccrDciRegistrationcertResponse extends $tea.Model {
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
          sdk_version: "1.0.0",
          _prod_code: "ak_9705ae7650f74f47b1e8158151cc122f",
          _prod_channel: "saas",
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
   * Description: 发起数登申请
   * Summary: 发起数登申请
   */
  async createBlockchainBccrDciRegistration(request: CreateBlockchainBccrDciRegistrationRequest): Promise<CreateBlockchainBccrDciRegistrationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBlockchainBccrDciRegistrationEx(request, headers, runtime);
  }

  /**
   * Description: 发起数登申请
   * Summary: 发起数登申请
   */
  async createBlockchainBccrDciRegistrationEx(request: CreateBlockchainBccrDciRegistrationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBlockchainBccrDciRegistrationResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBlockchainBccrDciRegistrationResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.registration.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBlockchainBccrDciRegistrationResponse({}));
  }

  /**
   * Description: 已废弃接口
   * Summary: 已废弃接口
   */
  async queryBlockchainBccrDciRegistrationsubmit(request: QueryBlockchainBccrDciRegistrationsubmitRequest): Promise<QueryBlockchainBccrDciRegistrationsubmitResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBlockchainBccrDciRegistrationsubmitEx(request, headers, runtime);
  }

  /**
   * Description: 已废弃接口
   * Summary: 已废弃接口
   */
  async queryBlockchainBccrDciRegistrationsubmitEx(request: QueryBlockchainBccrDciRegistrationsubmitRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBlockchainBccrDciRegistrationsubmitResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBlockchainBccrDciRegistrationsubmitResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.registrationsubmit.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBlockchainBccrDciRegistrationsubmitResponse({}));
  }

  /**
   * Description: 查询数登结果
   * Summary: 查询数登结果
   */
  async queryBlockchainBccrDciRegistration(request: QueryBlockchainBccrDciRegistrationRequest): Promise<QueryBlockchainBccrDciRegistrationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBlockchainBccrDciRegistrationEx(request, headers, runtime);
  }

  /**
   * Description: 查询数登结果
   * Summary: 查询数登结果
   */
  async queryBlockchainBccrDciRegistrationEx(request: QueryBlockchainBccrDciRegistrationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBlockchainBccrDciRegistrationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBlockchainBccrDciRegistrationResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.registration.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBlockchainBccrDciRegistrationResponse({}));
  }

  /**
   * Description: 获取数登证书下载链接
   * Summary: 获取数登证书下载链接
   */
  async getBlockchainBccrDciRegistrationcert(request: GetBlockchainBccrDciRegistrationcertRequest): Promise<GetBlockchainBccrDciRegistrationcertResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getBlockchainBccrDciRegistrationcertEx(request, headers, runtime);
  }

  /**
   * Description: 获取数登证书下载链接
   * Summary: 获取数登证书下载链接
   */
  async getBlockchainBccrDciRegistrationcertEx(request: GetBlockchainBccrDciRegistrationcertRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetBlockchainBccrDciRegistrationcertResponse> {
    Util.validateModel(request);
    return $tea.cast<GetBlockchainBccrDciRegistrationcertResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.registrationcert.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetBlockchainBccrDciRegistrationcertResponse({}));
  }

  /**
   * Description: 创建数字登记证书
   * Summary: 创建数字登记证书
   */
  async createBlockchainBccrDciRegistrationcert(request: CreateBlockchainBccrDciRegistrationcertRequest): Promise<CreateBlockchainBccrDciRegistrationcertResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBlockchainBccrDciRegistrationcertEx(request, headers, runtime);
  }

  /**
   * Description: 创建数字登记证书
   * Summary: 创建数字登记证书
   */
  async createBlockchainBccrDciRegistrationcertEx(request: CreateBlockchainBccrDciRegistrationcertRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBlockchainBccrDciRegistrationcertResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBlockchainBccrDciRegistrationcertResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.registrationcert.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBlockchainBccrDciRegistrationcertResponse({}));
  }

  /**
   * Description: 已废弃接口
   * Summary: 已废弃接口
   */
  async queryBlockchainBccrDciRegistrationcert(request: QueryBlockchainBccrDciRegistrationcertRequest): Promise<QueryBlockchainBccrDciRegistrationcertResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBlockchainBccrDciRegistrationcertEx(request, headers, runtime);
  }

  /**
   * Description: 已废弃接口
   * Summary: 已废弃接口
   */
  async queryBlockchainBccrDciRegistrationcertEx(request: QueryBlockchainBccrDciRegistrationcertRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBlockchainBccrDciRegistrationcertResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBlockchainBccrDciRegistrationcertResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.registrationcert.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBlockchainBccrDciRegistrationcertResponse({}));
  }

  /**
   * Description: 发起支付，获取支付链接
   * Summary: 数登支付-发起支付
   */
  async getBlockchainBccrDciPayurl(request: GetBlockchainBccrDciPayurlRequest): Promise<GetBlockchainBccrDciPayurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getBlockchainBccrDciPayurlEx(request, headers, runtime);
  }

  /**
   * Description: 发起支付，获取支付链接
   * Summary: 数登支付-发起支付
   */
  async getBlockchainBccrDciPayurlEx(request: GetBlockchainBccrDciPayurlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetBlockchainBccrDciPayurlResponse> {
    Util.validateModel(request);
    return $tea.cast<GetBlockchainBccrDciPayurlResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.payurl.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetBlockchainBccrDciPayurlResponse({}));
  }

  /**
   * Description: 查询数登支付结果
   * Summary: 查询数登支付结果
   */
  async queryBlockchainBccrDciPay(request: QueryBlockchainBccrDciPayRequest): Promise<QueryBlockchainBccrDciPayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBlockchainBccrDciPayEx(request, headers, runtime);
  }

  /**
   * Description: 查询数登支付结果
   * Summary: 查询数登支付结果
   */
  async queryBlockchainBccrDciPayEx(request: QueryBlockchainBccrDciPayRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBlockchainBccrDciPayResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBlockchainBccrDciPayResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.pay.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBlockchainBccrDciPayResponse({}));
  }

  /**
   * Description: 支付结果回调
   * Summary: 数登支付-支付结果回调
   */
  async callbackBlockchainBccrDciPayresult(request: CallbackBlockchainBccrDciPayresultRequest): Promise<CallbackBlockchainBccrDciPayresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackBlockchainBccrDciPayresultEx(request, headers, runtime);
  }

  /**
   * Description: 支付结果回调
   * Summary: 数登支付-支付结果回调
   */
  async callbackBlockchainBccrDciPayresultEx(request: CallbackBlockchainBccrDciPayresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackBlockchainBccrDciPayresultResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackBlockchainBccrDciPayresultResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.payresult.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackBlockchainBccrDciPayresultResponse({}));
  }

  /**
   * Description: 数登审核失败结果回调
   * Summary: 数登审核失败结果回调
   */
  async refuseBlockchainBccrDciRegistration(request: RefuseBlockchainBccrDciRegistrationRequest): Promise<RefuseBlockchainBccrDciRegistrationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.refuseBlockchainBccrDciRegistrationEx(request, headers, runtime);
  }

  /**
   * Description: 数登审核失败结果回调
   * Summary: 数登审核失败结果回调
   */
  async refuseBlockchainBccrDciRegistrationEx(request: RefuseBlockchainBccrDciRegistrationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RefuseBlockchainBccrDciRegistrationResponse> {
    Util.validateModel(request);
    return $tea.cast<RefuseBlockchainBccrDciRegistrationResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.registration.refuse", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RefuseBlockchainBccrDciRegistrationResponse({}));
  }

  /**
   * Description: 补正数登申请
   * Summary: 补正数登申请
   */
  async retryBlockchainBccrDciRegistration(request: RetryBlockchainBccrDciRegistrationRequest): Promise<RetryBlockchainBccrDciRegistrationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryBlockchainBccrDciRegistrationEx(request, headers, runtime);
  }

  /**
   * Description: 补正数登申请
   * Summary: 补正数登申请
   */
  async retryBlockchainBccrDciRegistrationEx(request: RetryBlockchainBccrDciRegistrationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryBlockchainBccrDciRegistrationResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryBlockchainBccrDciRegistrationResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.registration.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryBlockchainBccrDciRegistrationResponse({}));
  }

  /**
   * Description: 数登停止申请
   * Summary: 数登停止申请
   */
  async closeBlockchainBccrDciRegistration(request: CloseBlockchainBccrDciRegistrationRequest): Promise<CloseBlockchainBccrDciRegistrationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.closeBlockchainBccrDciRegistrationEx(request, headers, runtime);
  }

  /**
   * Description: 数登停止申请
   * Summary: 数登停止申请
   */
  async closeBlockchainBccrDciRegistrationEx(request: CloseBlockchainBccrDciRegistrationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CloseBlockchainBccrDciRegistrationResponse> {
    Util.validateModel(request);
    return $tea.cast<CloseBlockchainBccrDciRegistrationResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.registration.close", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CloseBlockchainBccrDciRegistrationResponse({}));
  }

  /**
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBlockchainBccrOrder(request: CreateBlockchainBccrOrderRequest): Promise<CreateBlockchainBccrOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBlockchainBccrOrderEx(request, headers, runtime);
  }

  /**
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBlockchainBccrOrderEx(request: CreateBlockchainBccrOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBlockchainBccrOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBlockchainBccrOrderResponse>(await this.doRequest("1.0", "blockchain.bccr.order.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBlockchainBccrOrderResponse({}));
  }

  /**
   * Description: 查询订单支付链接
   * Summary: 查询订单支付链接
   */
  async queryBlockchainBccrOrderPayurl(request: QueryBlockchainBccrOrderPayurlRequest): Promise<QueryBlockchainBccrOrderPayurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBlockchainBccrOrderPayurlEx(request, headers, runtime);
  }

  /**
   * Description: 查询订单支付链接
   * Summary: 查询订单支付链接
   */
  async queryBlockchainBccrOrderPayurlEx(request: QueryBlockchainBccrOrderPayurlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBlockchainBccrOrderPayurlResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBlockchainBccrOrderPayurlResponse>(await this.doRequest("1.0", "blockchain.bccr.order.payurl.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBlockchainBccrOrderPayurlResponse({}));
  }

  /**
   * Description: 版保完成数登证书回调
   * Summary: 版保完成数登证书回调
   */
  async finishBlockchainBccrDciRegistrationcert(request: FinishBlockchainBccrDciRegistrationcertRequest): Promise<FinishBlockchainBccrDciRegistrationcertResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.finishBlockchainBccrDciRegistrationcertEx(request, headers, runtime);
  }

  /**
   * Description: 版保完成数登证书回调
   * Summary: 版保完成数登证书回调
   */
  async finishBlockchainBccrDciRegistrationcertEx(request: FinishBlockchainBccrDciRegistrationcertRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<FinishBlockchainBccrDciRegistrationcertResponse> {
    Util.validateModel(request);
    return $tea.cast<FinishBlockchainBccrDciRegistrationcertResponse>(await this.doRequest("1.0", "blockchain.bccr.dci.registrationcert.finish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new FinishBlockchainBccrDciRegistrationcertResponse({}));
  }

}
