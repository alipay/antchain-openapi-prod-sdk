// This file is auto-generated, don't edit it
import AntchainUtil from '@antchain/alipay-util';
import Util, * as $Util from '@alicloud/tea-util';
import RPCUtil from '@alicloud/rpc-util';
import { Readable } from 'stream';
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

// CA电子签约正文章信息
export class CaSystemMainBodyRequest extends $tea.Model {
  // 签署页码
  posPage: number;
  // 签署区位置横坐标
  posX: string;
  // 签署区位置纵坐标
  posY: string;
  static names(): { [key: string]: string } {
    return {
      posPage: 'pos_page',
      posX: 'pos_x',
      posY: 'pos_y',
    };
  }

  static types(): { [key: string]: any } {
    return {
      posPage: 'number',
      posX: 'string',
      posY: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 骑缝章信息
export class CaSystemCrossPageRequest extends $tea.Model {
  // 签署页码
  posPageStart: number;
  // 结束页码（供骑缝章使用）
  posPageEnd: number;
  // 签署区位置横坐标
  posX: string;
  // 签署区位置纵坐标
  posY: string;
  static names(): { [key: string]: string } {
    return {
      posPageStart: 'pos_page_start',
      posPageEnd: 'pos_page_end',
      posX: 'pos_x',
      posY: 'pos_y',
    };
  }

  static types(): { [key: string]: any } {
    return {
      posPageStart: 'number',
      posPageEnd: 'number',
      posX: 'string',
      posY: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签署区域信息（包括印模信息）
export class CaSystemSignAreaRequest extends $tea.Model {
  // 印章id,联系签署中心获取
  sealId?: string;
  // 用印对齐类型,TOP_LEFT("TOP_LEFT", "左上角对齐"), BOTTOM_LEFT("BOTTOM_LEFT", "左下角对齐"), CENTER("CENTER", "xy值是印章的中心"), TOP_RIGHT("TOP_RIGHT", "xy值是印章右上角"), BOTTOM_RIGHT("BOTTOM_RIGHT", "xy值是印章右下角")
  locationType: string;
  // 签署位置类型，1-正文，2-骑缝
  positionType: string;
  // 骑缝章信息，需要盖骑缝章的时候 请传递此参数
  systemCrossPageRequest?: CaSystemCrossPageRequest;
  // 正文章信息，正文章模式必填
  systemMainBodyRequest?: CaSystemMainBodyRequest;
  static names(): { [key: string]: string } {
    return {
      sealId: 'seal_id',
      locationType: 'location_type',
      positionType: 'position_type',
      systemCrossPageRequest: 'system_cross_page_request',
      systemMainBodyRequest: 'system_main_body_request',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sealId: 'string',
      locationType: 'string',
      positionType: 'string',
      systemCrossPageRequest: CaSystemCrossPageRequest,
      systemMainBodyRequest: CaSystemMainBodyRequest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签署文件信息（包含印模和签署区域）
export class CaSystemSignFileRequest extends $tea.Model {
  // 签署文件id,和签署文件列表fileId呼应
  fileId?: string;
  // 签署文件列表（包含印模和签署区域）
  systemSignAreaRequestList: CaSystemSignAreaRequest[];
  static names(): { [key: string]: string } {
    return {
      fileId: 'file_id',
      systemSignAreaRequestList: 'system_sign_area_request_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fileId: 'string',
      systemSignAreaRequestList: { 'type': 'array', 'itemType': CaSystemSignAreaRequest },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 待签署文件列表
export class CaSignFileRequest extends $tea.Model {
  // 文件名称
  fileName: string;
  // 文件id,映射唯一的文件。多文件签署场景下，fileId必须唯一且和文件一一对应
  fileId: string;
  static names(): { [key: string]: string } {
    return {
      fileName: 'file_name',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fileName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签署方信息
export class SignatoryInfo extends $tea.Model {
  // 页码信息 （骑缝签署页码为1-2这种，其余情况都是数字）
  posPage: string;
  //  x坐标
  posX: string;
  //  y坐标
  posY: string;
  // 签署区宽 (默认为100)
  width?: string;
  static names(): { [key: string]: string } {
    return {
      posPage: 'pos_page',
      posX: 'pos_x',
      posY: 'pos_y',
      width: 'width',
    };
  }

  static types(): { [key: string]: any } {
    return {
      posPage: 'string',
      posX: 'string',
      posY: 'string',
      width: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签署完成的文件
export class CaSignFileResult extends $tea.Model {
  // 文件名称
  fileName?: string;
  // 文件osskey
  fileKey?: string;
  // 文件id
  fileId?: string;
  // 文件http链接
  httpFileUrl?: string;
  static names(): { [key: string]: string } {
    return {
      fileName: 'file_name',
      fileKey: 'file_key',
      fileId: 'file_id',
      httpFileUrl: 'http_file_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fileName: 'string',
      fileKey: 'string',
      fileId: 'string',
      httpFileUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签署人信息
export class CaSignUserInfoRequest extends $tea.Model {
  // 用户类型个人:PERSON 机构:ORG
  signUserType: string;
  // 签署方名称，个人传真实姓名：张三 机构传机构正确的名称：xxx责任有限公司
  signerName: string;
  // 授权签署时的签署人证件类型,签署方证件类型 CRED_PSN_CH_IDCARD(大陆身份证) CRED_ORG_USCC(统一社会信用代码)
  signerCertType: string;
  // 签署方证件号码,签署方证件号码： 个人传递身份证件号 企业传递统一社会信用编码
  signerCertNumber: string;
  // 企业子类型,signUserType为org时必选 企业子类型 * BUS("BUS", "企业"), * SINGLE("SINGLE", "个体工商户"), * GOV("GOV", "党政机关"), * INST("INST", "事业单位"), * COMMON("COMMON", "社会组织"), * OTHER("OTHER", "其他组织")
  signSubType?: string;
  // 是否指定授权人签署
  authorized?: string;
  // authorized=1时必填,签署方名称
  authSignerName?: string;
  // authorized=1 时必填,授权签署时的签署人证件类型
  authSignerCertType?: string;
  // authorized=1 时必填,授权签署方证件号码
  authSignerCertNumber?: string;
  // 手机号，用于发送签署短信
  mobile?: string;
  // 邮箱联系方式
  email?: string;
  // 签署顺序，默认-1无签署顺序
  order?: string;
  // 是否自动签署,ture为需要自动签署，false为手动签署
  autoSign: boolean;
  // 签署文件列表（包含印模和签署区域）
  systemSignFileRequestList: CaSystemSignFileRequest[];
  static names(): { [key: string]: string } {
    return {
      signUserType: 'sign_user_type',
      signerName: 'signer_name',
      signerCertType: 'signer_cert_type',
      signerCertNumber: 'signer_cert_number',
      signSubType: 'sign_sub_type',
      authorized: 'authorized',
      authSignerName: 'auth_signer_name',
      authSignerCertType: 'auth_signer_cert_type',
      authSignerCertNumber: 'auth_signer_cert_number',
      mobile: 'mobile',
      email: 'email',
      order: 'order',
      autoSign: 'auto_sign',
      systemSignFileRequestList: 'system_sign_file_request_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      signUserType: 'string',
      signerName: 'string',
      signerCertType: 'string',
      signerCertNumber: 'string',
      signSubType: 'string',
      authorized: 'string',
      authSignerName: 'string',
      authSignerCertType: 'string',
      authSignerCertNumber: 'string',
      mobile: 'string',
      email: 'string',
      order: 'string',
      autoSign: 'boolean',
      systemSignFileRequestList: { 'type': 'array', 'itemType': CaSystemSignFileRequest },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签署人状态
export class CaSignOperatorResult extends $tea.Model {
  // 签署方UserId
  signUserId: string;
  // 签署方证件号
  signCertNo?: string;
  // 签署方证件名称
  signCertName: string;
  // 签署方证件类型
  signCertType?: string;
  // 是否授权
  authorized?: number;
  // 授权时间
  authorizeTime?: string;
  // 授权人证件号码
  authPersonCertNo?: string;
  // 授权人证件名称
  authPersonCertName?: string;
  // 授权人证件类型
  authPersonCertType?: string;
  // 签署失败原因
  failInfo?: string;
  // SIGNNED
  status?: string;
  // 签署时间
  signTime?: string;
  // 是否我方公司
  ourCorp?: number;
  // 电话联系方式，脱敏显示
  mobileNumber?: string;
  // 邮件联系地址，脱敏展示返回
  emailAddress?: string;
  static names(): { [key: string]: string } {
    return {
      signUserId: 'sign_user_id',
      signCertNo: 'sign_cert_no',
      signCertName: 'sign_cert_name',
      signCertType: 'sign_cert_type',
      authorized: 'authorized',
      authorizeTime: 'authorize_time',
      authPersonCertNo: 'auth_person_cert_no',
      authPersonCertName: 'auth_person_cert_name',
      authPersonCertType: 'auth_person_cert_type',
      failInfo: 'fail_info',
      status: 'status',
      signTime: 'sign_time',
      ourCorp: 'our_corp',
      mobileNumber: 'mobile_number',
      emailAddress: 'email_address',
    };
  }

  static types(): { [key: string]: any } {
    return {
      signUserId: 'string',
      signCertNo: 'string',
      signCertName: 'string',
      signCertType: 'string',
      authorized: 'number',
      authorizeTime: 'string',
      authPersonCertNo: 'string',
      authPersonCertName: 'string',
      authPersonCertType: 'string',
      failInfo: 'string',
      status: 'string',
      signTime: 'string',
      ourCorp: 'number',
      mobileNumber: 'string',
      emailAddress: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签署链接结果
export class CaSignUrlResult extends $tea.Model {
  // 签署方名称
  signCertName?: string;
  // 签署方证件号（脱敏）
  signCertNo?: string;
  // 签署方id
  signUserId?: string;
  // 加密后的签署方证件号(用来关联签署方的签署链接)
  encryptSignCertNo?: string;
  // 签署链接
  signUrl?: string;
  static names(): { [key: string]: string } {
    return {
      signCertName: 'sign_cert_name',
      signCertNo: 'sign_cert_no',
      signUserId: 'sign_user_id',
      encryptSignCertNo: 'encrypt_sign_cert_no',
      signUrl: 'sign_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      signCertName: 'string',
      signCertNo: 'string',
      signUserId: 'string',
      encryptSignCertNo: 'string',
      signUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签署链接类
export class SignUrlResp extends $tea.Model {
  // 0-企业 1-用户
  type: number;
  // 企业名称或用户姓名
  name: string;
  // 社会信用代码或身份证号
  certNo: string;
  // 手动签署url（长链接）
  url?: string;
  // 手动签署url(端链接)
  shortUrl?: string;
  // 电子合同签署区id
  signFiledId: string;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      name: 'name',
      certNo: 'cert_no',
      url: 'url',
      shortUrl: 'short_url',
      signFiledId: 'sign_filed_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'number',
      name: 'string',
      certNo: 'string',
      url: 'string',
      shortUrl: 'string',
      signFiledId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 退保失败订单信息
export class FailOrderInfo extends $tea.Model {
  // 退保失败订单号
  orderNo: string;
  // 失败原因
  failReason: string;
  static names(): { [key: string]: string } {
    return {
      orderNo: 'order_no',
      failReason: 'fail_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderNo: 'string',
      failReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户签署信息
export class SignUserInfo extends $tea.Model {
  // 身份证号
  idNumber: string;
  // 姓名
  name: string;
  // 签署区列表
  signAreaList: SignatoryInfo[];
  static names(): { [key: string]: string } {
    return {
      idNumber: 'id_number',
      name: 'name',
      signAreaList: 'sign_area_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      idNumber: 'string',
      name: 'string',
      signAreaList: { 'type': 'array', 'itemType': SignatoryInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签署发起返回类
export class ContractSignResponse extends $tea.Model {
  // 流程id
  flowId: string;
  // 签署链接数组
  signUrlList: SignUrlResp[];
  static names(): { [key: string]: string } {
    return {
      flowId: 'flow_id',
      signUrlList: 'sign_url_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      flowId: 'string',
      signUrlList: { 'type': 'array', 'itemType': SignUrlResp },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 保险产品类
export class InsureProductInfo extends $tea.Model {
  // 产品名称
  name: string;
  // 产品id
  productId: string;
  // 险种编码: 
  // ACCIDENT: 意外险
  // EMPLOYER: 雇主险
  insuranceTypeCode: string;
  // 推荐编码
  recomFlowNo?: string;
  // 最低价格（分）
  premium?: number;
  // 保额（分）
  sumInsured?: number;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      productId: 'product_id',
      insuranceTypeCode: 'insurance_type_code',
      recomFlowNo: 'recom_flow_no',
      premium: 'premium',
      sumInsured: 'sum_insured',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      productId: 'string',
      insuranceTypeCode: 'string',
      recomFlowNo: 'string',
      premium: 'number',
      sumInsured: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用印子任务受理流水
export class CaSubSignResult extends $tea.Model {
  // 子业务流水号
  subBizNo?: string;
  // 子任务id
  signTaskId?: string;
  // 我方签署方id
  ourUserId?: string;
  // 是否关联业务 true:关联 false：不关联
  relatedBusiness?: boolean;
  // 签署链接结果列表
  caSignUrlResultList?: CaSignUrlResult[];
  static names(): { [key: string]: string } {
    return {
      subBizNo: 'sub_biz_no',
      signTaskId: 'sign_task_id',
      ourUserId: 'our_user_id',
      relatedBusiness: 'related_business',
      caSignUrlResultList: 'ca_sign_url_result_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      subBizNo: 'string',
      signTaskId: 'string',
      ourUserId: 'string',
      relatedBusiness: 'boolean',
      caSignUrlResultList: { 'type': 'array', 'itemType': CaSignUrlResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 模板填充字段实体
export class TemplateFieldConfigRequest extends $tea.Model {
  // 字段拥有者（1个人，2客户，3人资服务商）
  type: number;
  // 字段名称（英文：identityName、identityNumber、phoneNumber、positionName、salary、salaryNumber、examineStandard、projectDesc）
  fieldName: string;
  // 字段名称描述（中文名：姓名、身份证号、手机号、职位、薪资、薪数、考核标准、项目描述）
  fieldNameDesc: string;
  // 字段值
  fieldValue: string;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      fieldName: 'field_name',
      fieldNameDesc: 'field_name_desc',
      fieldValue: 'field_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'number',
      fieldName: 'string',
      fieldNameDesc: 'string',
      fieldValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签署任务结果
export class CaSignTaskResult extends $tea.Model {
  // 子任务流水号
  subBizNo: string;
  // 签署子任务id
  signTaskId: string;
  // 签署子任务的状态
  signTaskStatus?: string;
  // 签署完成的文件列表
  signFileResultList?: CaSignFileResult[];
  // 签署人状态列表
  signOperatorResultList?: CaSignOperatorResult[];
  static names(): { [key: string]: string } {
    return {
      subBizNo: 'sub_biz_no',
      signTaskId: 'sign_task_id',
      signTaskStatus: 'sign_task_status',
      signFileResultList: 'sign_file_result_list',
      signOperatorResultList: 'sign_operator_result_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      subBizNo: 'string',
      signTaskId: 'string',
      signTaskStatus: 'string',
      signFileResultList: { 'type': 'array', 'itemType': CaSignFileResult },
      signOperatorResultList: { 'type': 'array', 'itemType': CaSignOperatorResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签署任务信息
export class CaSignTaskRequest extends $tea.Model {
  // 子业务流水号
  subBizNo: string;
  // 任务描述
  description: string;
  // 签署人信息
  signUserInfoRequestList: CaSignUserInfoRequest[];
  // 待签署文件列表
  signFileRequestList?: CaSignFileRequest[];
  static names(): { [key: string]: string } {
    return {
      subBizNo: 'sub_biz_no',
      description: 'description',
      signUserInfoRequestList: 'sign_user_info_request_list',
      signFileRequestList: 'sign_file_request_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      subBizNo: 'string',
      description: 'string',
      signUserInfoRequestList: { 'type': 'array', 'itemType': CaSignUserInfoRequest },
      signFileRequestList: { 'type': 'array', 'itemType': CaSignFileRequest },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 员工信息
export class InsureEmployeeInfo extends $tea.Model {
  // 姓名
  name: string;
  // 身份证号
  certNo: string;
  // 手机号
  mobile: string;
  // 额外信息
  extraMsg: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      certNo: 'cert_no',
      mobile: 'mobile',
      extraMsg: 'extra_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      certNo: 'string',
      mobile: 'string',
      extraMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签约企业信息
export class SignEnterpriseInfo extends $tea.Model {
  // 公司名称
  organizationName: string;
  // 社会统一信用代码
  uscc: string;
  // 法人姓名
  name: string;
  // 法人身份证号码
  idNumber: string;
  // 签署模式0、自动签署1、手动签署（用户只能手动）
  // 
  signType: number;
  // 签署区列表
  signAreaList: SignatoryInfo[];
  static names(): { [key: string]: string } {
    return {
      organizationName: 'organization_name',
      uscc: 'uscc',
      name: 'name',
      idNumber: 'id_number',
      signType: 'sign_type',
      signAreaList: 'sign_area_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      organizationName: 'string',
      uscc: 'string',
      name: 'string',
      idNumber: 'string',
      signType: 'number',
      signAreaList: { 'type': 'array', 'itemType': SignatoryInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 键值对
export class XNameValuePair extends $tea.Model {
  // 键名
  name: string;
  // 键值
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

export class SignAntsaasStaffingcContractSendRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需要确保唯一（定位订单）
  outBizNo: string;
  // 合同或模版文件
  fileObject?: Readable;
  fileObjectName?: string;
  fileId?: string;
  // 合同类型（1合同文件 2合同模板）
  contractType: number;
  // 合同名称, 必须带上文件名后缀。 .dpf .doc .docx
  contractName: string;
  // 合同文件类型 （pdf、word）
  contractFileType: string;
  // 合同模版参数，json格式，以key value格式存储，合同类型属于模板必填
  simpleFormFields?: string;
  // 签署平台（ALIPAY或H5）
  signPlatform: string;
  // 合同用户信息列表
  signUserList: SignUserInfo[];
  // 合同企业信息列表
  signEnterpriseList: SignEnterpriseInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outBizNo: 'out_biz_no',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      contractType: 'contract_type',
      contractName: 'contract_name',
      contractFileType: 'contract_file_type',
      simpleFormFields: 'simple_form_fields',
      signPlatform: 'sign_platform',
      signUserList: 'sign_user_list',
      signEnterpriseList: 'sign_enterprise_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outBizNo: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      contractType: 'number',
      contractName: 'string',
      contractFileType: 'string',
      simpleFormFields: 'string',
      signPlatform: 'string',
      signUserList: { 'type': 'array', 'itemType': SignUserInfo },
      signEnterpriseList: { 'type': 'array', 'itemType': SignEnterpriseInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SignAntsaasStaffingcContractSendResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发起签约返回结果
  response?: ContractSignResponse;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      response: 'response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      response: ContractSignResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntsaasStaffingcContractSignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程id
  flowId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntsaasStaffingcContractSignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 流程id
  flowId?: string;
  // 文件有效截止日期
  contractValidity?: number;
  // 流程描述
  flowDesc?: string;
  // 流程开始时间
  flowStartTime?: string;
  // 流程结束时间
  flowEndTime?: string;
  // 流程状态（0-草稿、1-签署中、2-完成、3-撤销、4-终止、5-过期、6-删除、7-拒签）
  flowStatus?: number;
  // 合同文件id
  fileId?: string;
  // 合同文件名称
  fileName?: string;
  // 合同文件下载地址（1小时内有效）
  fileUrl?: string;
  // 如果未签署，将返回签署链接
  signUrlList?: SignUrlResp[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      flowId: 'flow_id',
      contractValidity: 'contract_validity',
      flowDesc: 'flow_desc',
      flowStartTime: 'flow_start_time',
      flowEndTime: 'flow_end_time',
      flowStatus: 'flow_status',
      fileId: 'file_id',
      fileName: 'file_name',
      fileUrl: 'file_url',
      signUrlList: 'sign_url_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      flowId: 'string',
      contractValidity: 'number',
      flowDesc: 'string',
      flowStartTime: 'string',
      flowEndTime: 'string',
      flowStatus: 'number',
      fileId: 'string',
      fileName: 'string',
      fileUrl: 'string',
      signUrlList: { 'type': 'array', 'itemType': SignUrlResp },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntsaasStaffingcEpcertificationUrlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 一次认证的唯一标识,在商户调用认证初始化接口的时候获取
  // (如果接口创建接口发生未知异常，可使用out_biz_no替代，查询状态）
  bizNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizNo: 'biz_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntsaasStaffingcEpcertificationUrlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // // 响应为表单格式，可嵌入页面，具体以返回的结果为准
  resultBody?: string;
  // 订单号（但入参为out_biz_no时传入）
  bizNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultBody: 'result_body',
      bizNo: 'biz_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultBody: 'string',
      bizNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntsaasStaffingcEpcertificationAuthorizeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需要保证唯一，外部订单号
  outBizNo: string;
  // 企业全称
  epName: string;
  // 统一社会信用代码或营业执照注册号
  epCertNo: string;
  // 认证完成后，跳转到指定url地址
  returnUrl?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outBizNo: 'out_biz_no',
      epName: 'ep_name',
      epCertNo: 'ep_cert_no',
      returnUrl: 'return_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outBizNo: 'string',
      epName: 'string',
      epCertNo: 'string',
      returnUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntsaasStaffingcEpcertificationAuthorizeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 一次认证的唯一标识
  bizNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizNo: 'biz_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntsaasStaffingcEpcertificationRiskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 一次认证的唯一标识,在调用认证初始化接口的时候获取
  bizNo: string;
  // 企业全称
  epName: string;
  // 统一社会信用代码或营业执照注册号
  epCertNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizNo: 'biz_no',
      epName: 'ep_name',
      epCertNo: 'ep_cert_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizNo: 'string',
      epName: 'string',
      epCertNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntsaasStaffingcEpcertificationRiskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 认证状态，取值如下： SUCCESS，代表成功 INIT，代表初始化 CERTIFYING，代表认证中 FAIL，代表失败
  certifyStatus?: string;
  // 授权状态，从用户授权开始计时，时间窗口3天 取值如下： SUCCESS，代表用户已授权 FAIL，代表用户未授权或授权失效
  authStatus?: string;
  // 企业全称，字段auth_status为SUCCESS时返回
  epName?: string;
  // 统一社会信用代码或营业执照注册号，字段auth_status为SUCCESS时返回
  epCertNo?: string;
  // 法人认证姓名，字段auth_status为SUCCESS时返回
  userName?: string;
  // 法人认证身份证号
  certifyPersonCardNoPostfix?: string;
  // 认证失败原因列表，当certify_status=FAIL时返回
  certifyFailReasons?: string[];
  // 认证风险识别结果集合
  // 枚举值
  // 低风险认证: CERTIFICATION_LOW_RISK
  // 中风险认证: CERTIFICATION_MID_RISK2
  // 高风险认证: CERTIFICATION_HIGH_RISK
  // 批量注册: ONE_ADDR_MULTI_COMP
  // 经营异常: OPERATION_ABNORMAL
  // 交叉任职: CROSS_POSITION
  // 涉嫌洗钱: SUSPECTED_MONEY_LAUNDERING
  // 空壳公司: SHELL_COMPANY
  // 失信被执行: BREACH_PROMISE_EXECUTION
  // 严重违法失信: SERIOUS_BREACH_TRUST
  // 行政处罚: ADMINISTRATIVE_SANCTION
  // 司法冻结: JUDICIAL_FREEZE
  // 违规违禁: VIOLATION_BAN
  // 信贷逾期: CREDIT_OVERDUE
  // 多头借贷: LONG_BORROWING
  // 疑似欺诈: SUSPECTED_FRAUD
  // 疑似涉赌博: SUSPECTED_GAMBLING
  // 企业芝麻证: LI_XIN_CERTIFICATE
  riskIdentifyResult?: string[];
  // 空壳企业等级，描述企业空壳程度。
  // 枚举值
  // 优秀企业，没有空壳企业的常见特征，且有很多正向特征证明其正常经营: A+
  // 较为优秀的企业，没有空壳企业的常见特征，且有较多正向特征证明其正常经营: A
  // 较为优秀的企业，几乎没有空壳企业的常见特征，或者有较多正向特征证明其正常经营: B
  // 普通企业，一般没有空壳企业的常见特征，或者有很少量能反映其正常经营的数据: M+
  // 普通企业或者新注册的企业，一般没有空壳企业的常见特征，但是也没有太多能反映其在正常生产经营的数据: M
  // 普通企业，一般没有明显空壳企业的常见特征，也没有太多能反映其在正常生产经营的数据，可能和空壳企业有少量交集: M-
  // 较差企业，有部分空壳企业特征，可能有较少能反映其在正常生产经营的数据。建议这部分企业酌情考虑风险: C+
  // 差企业，有较多空壳企业特征，几乎没有能反映其在正常生产经营的数据: C
  // 差企业，有很多明显空壳企业特征，几乎没有能反映其在正常生产经营的数据: D
  shellCompanyLevel?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyStatus: 'certify_status',
      authStatus: 'auth_status',
      epName: 'ep_name',
      epCertNo: 'ep_cert_no',
      userName: 'user_name',
      certifyPersonCardNoPostfix: 'certify_person_card_no_postfix',
      certifyFailReasons: 'certify_fail_reasons',
      riskIdentifyResult: 'risk_identify_result',
      shellCompanyLevel: 'shell_company_level',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyStatus: 'string',
      authStatus: 'string',
      epName: 'string',
      epCertNo: 'string',
      userName: 'string',
      certifyPersonCardNoPostfix: 'string',
      certifyFailReasons: { 'type': 'array', 'itemType': 'string' },
      riskIdentifyResult: { 'type': 'array', 'itemType': 'string' },
      shellCompanyLevel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyAntsaasStaffingcInsureSignurlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业名称
  enterpriseName: string;
  // 社会信用代码
  socialCreditCode: string;
  // 签约支付宝账号（企业支付宝是邮箱）
  authAccount: string;
  // 联系手机号（用于接收投保失败等短信通知）
  mobile?: string;
  // 外部业务号(64长度以内）
  // 
  outBizNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      enterpriseName: 'enterprise_name',
      socialCreditCode: 'social_credit_code',
      authAccount: 'auth_account',
      mobile: 'mobile',
      outBizNo: 'out_biz_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      enterpriseName: 'string',
      socialCreditCode: 'string',
      authAccount: 'string',
      mobile: 'string',
      outBizNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyAntsaasStaffingcInsureSignurlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签约地址
  signUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      signUrl: 'sign_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      signUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAntsaasStaffingcInsureProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业名称
  enterpriseName: string;
  // 统一社会信用代码
  socialCreditCode: string;
  // 保险场景码: 
  // FLEXIBLE_EMPLOYMENT-日单（实时生效）
  // INITIATIVE_EMPLOYMENT-长期（次日0点生效）
  bizCode: string;
  // 险种编码:
  //  ACCIDENT: 意外险
  //  EMPLOYER_LIABILITY: 雇主险
  insuranceTypeCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      enterpriseName: 'enterprise_name',
      socialCreditCode: 'social_credit_code',
      bizCode: 'biz_code',
      insuranceTypeCode: 'insurance_type_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      enterpriseName: 'string',
      socialCreditCode: 'string',
      bizCode: 'string',
      insuranceTypeCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAntsaasStaffingcInsureProductResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 保险产品列表
  productList?: InsureProductInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      productList: 'product_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      productList: { 'type': 'array', 'itemType': InsureProductInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntsaasStaffingcInsurePriceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业名称
  enterpriseName: string;
  // 统一社会信用代码
  socialCreditCode: string;
  // 产品ID
  productId: string;
  // 职业编码: 
  // default-1-一类职业;
  // default-2-二类职业;
  // default-3-三类职业;
  // default-4-四类职业;
  jobCode: string;
  // 周期：
  // 1D、
  // 30D、
  // 360D
  period: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      enterpriseName: 'enterprise_name',
      socialCreditCode: 'social_credit_code',
      productId: 'product_id',
      jobCode: 'job_code',
      period: 'period',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      enterpriseName: 'string',
      socialCreditCode: 'string',
      productId: 'string',
      jobCode: 'string',
      period: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntsaasStaffingcInsurePriceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 价格
  price?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      price: 'price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      price: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendAntsaasStaffingcInsureRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部业务号（幂等、异步通知回传）
  outBizNo: string;
  // 企业名称
  enterpriseName: string;
  // 统一社会信用代码
  socialCreditCode: string;
  // 保险场景码: 
  // FLEXIBLE_EMPLOYMENT-日单（实时生效）
  // INITIATIVE_EMPLOYMENT- 长期（次日0点生效）
  bizCode: string;
  // 投保的险种编码:
  // ACCIDENT: 意外险,
  // EMPLOYER_LIABILITY: 雇主险
  insuranceTypeCode: string;
  // 产品ID
  productId: string;
  // 职业编码: 
  // default-1-一类职业; 
  // default-2-二类职业;
  // default-3-三类职业;
  // default-4-四类职业;
  // default-5-五类职业（雇主险60万和80万保额暂不支持）
  jobCode: string;
  // 保障周期：30D、360D（bizCode为长期时必传）
  period?: string;
  // 推荐编码
  recomFlowNo?: string;
  // 地址（bizCode为日单必传）
  address?: string;
  // 投保人列表，extra_msg需传递out_sub_biz_no，外部明细业务号（投保结果通知会回传，自行定义）
  employeeList: InsureEmployeeInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outBizNo: 'out_biz_no',
      enterpriseName: 'enterprise_name',
      socialCreditCode: 'social_credit_code',
      bizCode: 'biz_code',
      insuranceTypeCode: 'insurance_type_code',
      productId: 'product_id',
      jobCode: 'job_code',
      period: 'period',
      recomFlowNo: 'recom_flow_no',
      address: 'address',
      employeeList: 'employee_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outBizNo: 'string',
      enterpriseName: 'string',
      socialCreditCode: 'string',
      bizCode: 'string',
      insuranceTypeCode: 'string',
      productId: 'string',
      jobCode: 'string',
      period: 'string',
      recomFlowNo: 'string',
      address: 'string',
      employeeList: { 'type': 'array', 'itemType': InsureEmployeeInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendAntsaasStaffingcInsureResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 投保失败人员信息，extra_msg会返回failReason，投保失败原因
  failEmployeeList?: InsureEmployeeInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      failEmployeeList: 'fail_employee_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      failEmployeeList: { 'type': 'array', 'itemType': InsureEmployeeInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendAntsaasStaffingcInsureRefundRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部业务号
  outBizNo: string;
  // 企业名称
  enterpriseName: string;
  // 统一社会信用代码
  socialCreditCode: string;
  // 退保订单号列表
  orderNoList: number[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outBizNo: 'out_biz_no',
      enterpriseName: 'enterprise_name',
      socialCreditCode: 'social_credit_code',
      orderNoList: 'order_no_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outBizNo: 'string',
      enterpriseName: 'string',
      socialCreditCode: 'string',
      orderNoList: { 'type': 'array', 'itemType': 'number' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendAntsaasStaffingcInsureRefundResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 失败原因列表
  failOrderInfoList?: FailOrderInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      failOrderInfoList: 'fail_order_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      failOrderInfoList: { 'type': 'array', 'itemType': FailOrderInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SignAntsaasStaffingcContractCaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务名称
  bizName: string;
  // 业务编号
  bizNo: string;
  // 版本
  signVersion: string;
  // 签署任务信息
  signTaskRequestList: CaSignTaskRequest[];
  // 通过文件API上传的文件的file_id
  fileObject?: Readable;
  fileObjectName?: string;
  fileId?: string;
  // 合同模板密钥:若为合同模板该值必填,否则不需要填写
  templateSecretKey?: string;
  // 模板填充字段集合
  templateFieldConfigRequestList?: TemplateFieldConfigRequest[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizName: 'biz_name',
      bizNo: 'biz_no',
      signVersion: 'sign_version',
      signTaskRequestList: 'sign_task_request_list',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      templateSecretKey: 'template_secret_key',
      templateFieldConfigRequestList: 'template_field_config_request_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizName: 'string',
      bizNo: 'string',
      signVersion: 'string',
      signTaskRequestList: { 'type': 'array', 'itemType': CaSignTaskRequest },
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      templateSecretKey: 'string',
      templateFieldConfigRequestList: { 'type': 'array', 'itemType': TemplateFieldConfigRequest },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SignAntsaasStaffingcContractCaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签约流程id
  signFlowId?: string;
  // 业务流水号
  bizNo?: string;
  // 用印子任务受理流水
  subAntSignResultList?: CaSubSignResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      signFlowId: 'sign_flow_id',
      bizNo: 'biz_no',
      subAntSignResultList: 'sub_ant_sign_result_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      signFlowId: 'string',
      bizNo: 'string',
      subAntSignResultList: { 'type': 'array', 'itemType': CaSubSignResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntsaasStaffingcContractCaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 签署流程ID,传值默认查询签署流程下全部任务状态
  signFlowId: string;
  // 签署任务id
  signTaskId: string;
  // 业务唯一流水号
  bizNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      signFlowId: 'sign_flow_id',
      signTaskId: 'sign_task_id',
      bizNo: 'biz_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      signFlowId: 'string',
      signTaskId: 'string',
      bizNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntsaasStaffingcContractCaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签署流程ID
  signFlowId?: string;
  // 签署流程状态
  status?: string;
  // 业务流水号
  bizNo?: string;
  // 签署任务结果列表
  antSignTaskResultList?: CaSignTaskResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      signFlowId: 'sign_flow_id',
      status: 'status',
      bizNo: 'biz_no',
      antSignTaskResultList: 'ant_sign_task_result_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      signFlowId: 'string',
      status: 'string',
      bizNo: 'string',
      antSignTaskResultList: { 'type': 'array', 'itemType': CaSignTaskResult },
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
          sdk_version: "2.1.0",
          _prod_code: "ak_320bc483f2434f39a3af9ec9f04d3cc0",
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
   * Description: 发起签约调用接口
   * Summary: 发起签约
   */
  async signAntsaasStaffingcContractSend(request: SignAntsaasStaffingcContractSendRequest): Promise<SignAntsaasStaffingcContractSendResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.signAntsaasStaffingcContractSendEx(request, headers, runtime);
  }

  /**
   * Description: 发起签约调用接口
   * Summary: 发起签约
   */
  async signAntsaasStaffingcContractSendEx(request: SignAntsaasStaffingcContractSendRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SignAntsaasStaffingcContractSendResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antsaas.staffingc.contract.send.sign",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let signAntsaasStaffingcContractSendResponse = new SignAntsaasStaffingcContractSendResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return signAntsaasStaffingcContractSendResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
    }

    Util.validateModel(request);
    return $tea.cast<SignAntsaasStaffingcContractSendResponse>(await this.doRequest("1.0", "antsaas.staffingc.contract.send.sign", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SignAntsaasStaffingcContractSendResponse({}));
  }

  /**
   * Description: 签约结果查询
   * Summary: 查询签约结果
   */
  async queryAntsaasStaffingcContractSign(request: QueryAntsaasStaffingcContractSignRequest): Promise<QueryAntsaasStaffingcContractSignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntsaasStaffingcContractSignEx(request, headers, runtime);
  }

  /**
   * Description: 签约结果查询
   * Summary: 查询签约结果
   */
  async queryAntsaasStaffingcContractSignEx(request: QueryAntsaasStaffingcContractSignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntsaasStaffingcContractSignResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntsaasStaffingcContractSignResponse>(await this.doRequest("1.0", "antsaas.staffingc.contract.sign.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntsaasStaffingcContractSignResponse({}));
  }

  /**
   * Description: 企业认证授权url查询接口
   * Summary: 企业认证授权url查询接口
   */
  async queryAntsaasStaffingcEpcertificationUrl(request: QueryAntsaasStaffingcEpcertificationUrlRequest): Promise<QueryAntsaasStaffingcEpcertificationUrlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntsaasStaffingcEpcertificationUrlEx(request, headers, runtime);
  }

  /**
   * Description: 企业认证授权url查询接口
   * Summary: 企业认证授权url查询接口
   */
  async queryAntsaasStaffingcEpcertificationUrlEx(request: QueryAntsaasStaffingcEpcertificationUrlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntsaasStaffingcEpcertificationUrlResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntsaasStaffingcEpcertificationUrlResponse>(await this.doRequest("1.0", "antsaas.staffingc.epcertification.url.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntsaasStaffingcEpcertificationUrlResponse({}));
  }

  /**
   * Description: 企业认证创建接口
   * Summary: 企业认证创建接口
   */
  async createAntsaasStaffingcEpcertificationAuthorize(request: CreateAntsaasStaffingcEpcertificationAuthorizeRequest): Promise<CreateAntsaasStaffingcEpcertificationAuthorizeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAntsaasStaffingcEpcertificationAuthorizeEx(request, headers, runtime);
  }

  /**
   * Description: 企业认证创建接口
   * Summary: 企业认证创建接口
   */
  async createAntsaasStaffingcEpcertificationAuthorizeEx(request: CreateAntsaasStaffingcEpcertificationAuthorizeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAntsaasStaffingcEpcertificationAuthorizeResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAntsaasStaffingcEpcertificationAuthorizeResponse>(await this.doRequest("1.0", "antsaas.staffingc.epcertification.authorize.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAntsaasStaffingcEpcertificationAuthorizeResponse({}));
  }

  /**
   * Description: 企业认证风险查询接口
   * Summary: 企业认证风险查询接口
   */
  async queryAntsaasStaffingcEpcertificationRisk(request: QueryAntsaasStaffingcEpcertificationRiskRequest): Promise<QueryAntsaasStaffingcEpcertificationRiskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntsaasStaffingcEpcertificationRiskEx(request, headers, runtime);
  }

  /**
   * Description: 企业认证风险查询接口
   * Summary: 企业认证风险查询接口
   */
  async queryAntsaasStaffingcEpcertificationRiskEx(request: QueryAntsaasStaffingcEpcertificationRiskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntsaasStaffingcEpcertificationRiskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntsaasStaffingcEpcertificationRiskResponse>(await this.doRequest("1.0", "antsaas.staffingc.epcertification.risk.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntsaasStaffingcEpcertificationRiskResponse({}));
  }

  /**
   * Description: 获取保险签约认证连接
   * Summary: 获取保险签约认证连接
   */
  async applyAntsaasStaffingcInsureSignurl(request: ApplyAntsaasStaffingcInsureSignurlRequest): Promise<ApplyAntsaasStaffingcInsureSignurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyAntsaasStaffingcInsureSignurlEx(request, headers, runtime);
  }

  /**
   * Description: 获取保险签约认证连接
   * Summary: 获取保险签约认证连接
   */
  async applyAntsaasStaffingcInsureSignurlEx(request: ApplyAntsaasStaffingcInsureSignurlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyAntsaasStaffingcInsureSignurlResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyAntsaasStaffingcInsureSignurlResponse>(await this.doRequest("1.0", "antsaas.staffingc.insure.signurl.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyAntsaasStaffingcInsureSignurlResponse({}));
  }

  /**
   * Description: 查询可投保的保险产品
   * Summary: 查询可投保的保险产品
   */
  async listAntsaasStaffingcInsureProduct(request: ListAntsaasStaffingcInsureProductRequest): Promise<ListAntsaasStaffingcInsureProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAntsaasStaffingcInsureProductEx(request, headers, runtime);
  }

  /**
   * Description: 查询可投保的保险产品
   * Summary: 查询可投保的保险产品
   */
  async listAntsaasStaffingcInsureProductEx(request: ListAntsaasStaffingcInsureProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAntsaasStaffingcInsureProductResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAntsaasStaffingcInsureProductResponse>(await this.doRequest("1.0", "antsaas.staffingc.insure.product.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAntsaasStaffingcInsureProductResponse({}));
  }

  /**
   * Description: 查询保险产品价格相关信息
   * Summary: 查询保险产品价格相关信息
   */
  async queryAntsaasStaffingcInsurePrice(request: QueryAntsaasStaffingcInsurePriceRequest): Promise<QueryAntsaasStaffingcInsurePriceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntsaasStaffingcInsurePriceEx(request, headers, runtime);
  }

  /**
   * Description: 查询保险产品价格相关信息
   * Summary: 查询保险产品价格相关信息
   */
  async queryAntsaasStaffingcInsurePriceEx(request: QueryAntsaasStaffingcInsurePriceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntsaasStaffingcInsurePriceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntsaasStaffingcInsurePriceResponse>(await this.doRequest("1.0", "antsaas.staffingc.insure.price.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntsaasStaffingcInsurePriceResponse({}));
  }

  /**
   * Description: 执行投保
   * Summary: 执行投保
   */
  async sendAntsaasStaffingcInsure(request: SendAntsaasStaffingcInsureRequest): Promise<SendAntsaasStaffingcInsureResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendAntsaasStaffingcInsureEx(request, headers, runtime);
  }

  /**
   * Description: 执行投保
   * Summary: 执行投保
   */
  async sendAntsaasStaffingcInsureEx(request: SendAntsaasStaffingcInsureRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendAntsaasStaffingcInsureResponse> {
    Util.validateModel(request);
    return $tea.cast<SendAntsaasStaffingcInsureResponse>(await this.doRequest("1.0", "antsaas.staffingc.insure.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendAntsaasStaffingcInsureResponse({}));
  }

  /**
   * Description: 退保接口
   * Summary: 退保接口
   */
  async sendAntsaasStaffingcInsureRefund(request: SendAntsaasStaffingcInsureRefundRequest): Promise<SendAntsaasStaffingcInsureRefundResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendAntsaasStaffingcInsureRefundEx(request, headers, runtime);
  }

  /**
   * Description: 退保接口
   * Summary: 退保接口
   */
  async sendAntsaasStaffingcInsureRefundEx(request: SendAntsaasStaffingcInsureRefundRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendAntsaasStaffingcInsureRefundResponse> {
    Util.validateModel(request);
    return $tea.cast<SendAntsaasStaffingcInsureRefundResponse>(await this.doRequest("1.0", "antsaas.staffingc.insure.refund.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendAntsaasStaffingcInsureRefundResponse({}));
  }

  /**
   * Description: CA电子签
   * Summary: CA电子签约
   */
  async signAntsaasStaffingcContractCa(request: SignAntsaasStaffingcContractCaRequest): Promise<SignAntsaasStaffingcContractCaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.signAntsaasStaffingcContractCaEx(request, headers, runtime);
  }

  /**
   * Description: CA电子签
   * Summary: CA电子签约
   */
  async signAntsaasStaffingcContractCaEx(request: SignAntsaasStaffingcContractCaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SignAntsaasStaffingcContractCaResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antsaas.staffingc.contract.ca.sign",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let signAntsaasStaffingcContractCaResponse = new SignAntsaasStaffingcContractCaResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return signAntsaasStaffingcContractCaResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
    }

    Util.validateModel(request);
    return $tea.cast<SignAntsaasStaffingcContractCaResponse>(await this.doRequest("1.0", "antsaas.staffingc.contract.ca.sign", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SignAntsaasStaffingcContractCaResponse({}));
  }

  /**
   * Description: 查询签约结果
   * Summary: 查询签约结果
   */
  async queryAntsaasStaffingcContractCa(request: QueryAntsaasStaffingcContractCaRequest): Promise<QueryAntsaasStaffingcContractCaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntsaasStaffingcContractCaEx(request, headers, runtime);
  }

  /**
   * Description: 查询签约结果
   * Summary: 查询签约结果
   */
  async queryAntsaasStaffingcContractCaEx(request: QueryAntsaasStaffingcContractCaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntsaasStaffingcContractCaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntsaasStaffingcContractCaResponse>(await this.doRequest("1.0", "antsaas.staffingc.contract.ca.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntsaasStaffingcContractCaResponse({}));
  }

  /**
   * Description: 创建HTTP PUT提交的文件上传
   * Summary: 文件上传创建
   */
  async createAntcloudGatewayxFileUpload(request: CreateAntcloudGatewayxFileUploadRequest): Promise<CreateAntcloudGatewayxFileUploadResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAntcloudGatewayxFileUploadEx(request, headers, runtime);
  }

  /**
   * Description: 创建HTTP PUT提交的文件上传
   * Summary: 文件上传创建
   */
  async createAntcloudGatewayxFileUploadEx(request: CreateAntcloudGatewayxFileUploadRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAntcloudGatewayxFileUploadResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAntcloudGatewayxFileUploadResponse>(await this.doRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAntcloudGatewayxFileUploadResponse({}));
  }

}
