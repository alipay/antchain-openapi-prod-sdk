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

// 司法纠纷平台通用文件信息结构体
export class JudicialFileInfo extends $tea.Model {
  // 文件全名, 包含后缀
  fileName?: string;
  // 文件key
  fileKey?: string;
  // 文件下载地址
  downloadUrl?: string;
  // 司法纠纷平台文件类型
  judicialFileType?: string;
  static names(): { [key: string]: string } {
    return {
      fileName: 'file_name',
      fileKey: 'file_key',
      downloadUrl: 'download_url',
      judicialFileType: 'judicial_file_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fileName: 'string',
      fileKey: 'string',
      downloadUrl: 'string',
      judicialFileType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 文件key和文件名称
export class FileInfo extends $tea.Model {
  // 文件key
  fileKey: string;
  // 文件名称
  fileName: string;
  static names(): { [key: string]: string } {
    return {
      fileKey: 'file_key',
      fileName: 'file_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fileKey: 'string',
      fileName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 租赁分期履约信息
export class RentalInstallmentPerformance extends $tea.Model {
  // 被申请人还款期数
  repaymentPeriod: number;
  // 被申请人第几期租金支付方式
  rentPaymentType: string;
  // 被申请人第几期还款时间
  appliedRepaymentTime: string;
  // 被申请人第几期还款金额
  appliedRepaymentAmount: string;
  static names(): { [key: string]: string } {
    return {
      repaymentPeriod: 'repayment_period',
      rentPaymentType: 'rent_payment_type',
      appliedRepaymentTime: 'applied_repayment_time',
      appliedRepaymentAmount: 'applied_repayment_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      repaymentPeriod: 'number',
      rentPaymentType: 'string',
      appliedRepaymentTime: 'string',
      appliedRepaymentAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单商品信息
export class OrderItem extends $tea.Model {
  // 产品名称
  productName: string;
  // 商品品牌
  commodityBrand: string;
  // 商品版本
  commodityVersion: string;
  // 商品规格
  commoditySpecification: string;
  // 商品颜色
  commodityColor?: string;
  // 商品详情
  commodityDetails?: string;
  // 商品官方价格
  commodityOfficialPrice: string;
  // 租赁物数量
  leaseNumber: number;
  static names(): { [key: string]: string } {
    return {
      productName: 'product_name',
      commodityBrand: 'commodity_brand',
      commodityVersion: 'commodity_version',
      commoditySpecification: 'commodity_specification',
      commodityColor: 'commodity_color',
      commodityDetails: 'commodity_details',
      commodityOfficialPrice: 'commodity_official_price',
      leaseNumber: 'lease_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      productName: 'string',
      commodityBrand: 'string',
      commodityVersion: 'string',
      commoditySpecification: 'string',
      commodityColor: 'string',
      commodityDetails: 'string',
      commodityOfficialPrice: 'string',
      leaseNumber: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 租赁分期信息
export class RentalStagingInformation extends $tea.Model {
  // 分期期数
  installmentsNumber: number;
  // 租金每期应还款时间
  paymentTimeEachCycle: string;
  // 租金每期应还款额
  paymentEachCycle: string;
  static names(): { [key: string]: string } {
    return {
      installmentsNumber: 'installments_number',
      paymentTimeEachCycle: 'payment_time_each_cycle',
      paymentEachCycle: 'payment_each_cycle',
    };
  }

  static types(): { [key: string]: any } {
    return {
      installmentsNumber: 'number',
      paymentTimeEachCycle: 'string',
      paymentEachCycle: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 存证关联实体（个人/企业）的身份识别信息
export class NotaryUser extends $tea.Model {
  // 用户类型，PERSON或者ENTERPRISE
  userType: string;
  // 证件类型
  // ● 个人：支持身份证IDENTITY_CARD
  // ● 企业：支持UNIFIED_SOCIAL_CREDIT_CODE（统一社会信用代码）和ENTERPRISE_REGISTERED_NUMBER（企业工商注册号）
  certType: string;
  // 证件用户名称
  // ● 个人：身份证姓名
  // ● 企业：企业名称
  certName: string;
  // 证件号
  // ● 个人：身份证号
  // ● 企业：社会统一信用代码或企业工商注册号，与证件类型保持一致即可
  certNo: string;
  // 个人必填，用户手机号码
  personMobileNo?: string;
  // 企业选填，法人证件类型，仅支持身份证，IDENTITY_CARD
  legalPersonCertType?: string;
  // 企业选填，法人身份证姓名
  legalPersonCertName?: string;
  // 企业选填，法人身份证号
  legalPersonCertNo?: string;
  // 企业选填，法人手机号
  legalPersonMobileNo?: string;
  // 扩展属性
  properties?: string;
  static names(): { [key: string]: string } {
    return {
      userType: 'user_type',
      certType: 'cert_type',
      certName: 'cert_name',
      certNo: 'cert_no',
      personMobileNo: 'person_mobile_no',
      legalPersonCertType: 'legal_person_cert_type',
      legalPersonCertName: 'legal_person_cert_name',
      legalPersonCertNo: 'legal_person_cert_no',
      legalPersonMobileNo: 'legal_person_mobile_no',
      properties: 'properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userType: 'string',
      certType: 'string',
      certName: 'string',
      certNo: 'string',
      personMobileNo: 'string',
      legalPersonCertType: 'string',
      legalPersonCertName: 'string',
      legalPersonCertNo: 'string',
      legalPersonMobileNo: 'string',
      properties: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单信息
export class OrderInfo extends $tea.Model {
  // 出租方平台名称
  lessorPlatformName: string;
  // 订单号
  orderNumber: string;
  // 合同编号
  contractNo: string;
  // 合同名称
  contractName: string;
  // 订单商品信息
  orderItems: OrderItem[];
  // 设备及配件总价
  totalDevicePrice: string;
  // 押金金额
  depositAmount: string;
  // 免押金额
  freeDeposit: string;
  // 签约时间
  signingTime: string;
  // 租期起始时间
  leaseStartTime: string;
  // 租期结束时间
  leaseEndTime: string;
  // 买断金额计算公式
  buyoutAmountFormulaCalc: string;
  // 首付款
  payInAdvance: string;
  static names(): { [key: string]: string } {
    return {
      lessorPlatformName: 'lessor_platform_name',
      orderNumber: 'order_number',
      contractNo: 'contract_no',
      contractName: 'contract_name',
      orderItems: 'order_items',
      totalDevicePrice: 'total_device_price',
      depositAmount: 'deposit_amount',
      freeDeposit: 'free_deposit',
      signingTime: 'signing_time',
      leaseStartTime: 'lease_start_time',
      leaseEndTime: 'lease_end_time',
      buyoutAmountFormulaCalc: 'buyout_amount_formula_calc',
      payInAdvance: 'pay_in_advance',
    };
  }

  static types(): { [key: string]: any } {
    return {
      lessorPlatformName: 'string',
      orderNumber: 'string',
      contractNo: 'string',
      contractName: 'string',
      orderItems: { 'type': 'array', 'itemType': OrderItem },
      totalDevicePrice: 'string',
      depositAmount: 'string',
      freeDeposit: 'string',
      signingTime: 'string',
      leaseStartTime: 'string',
      leaseEndTime: 'string',
      buyoutAmountFormulaCalc: 'string',
      payInAdvance: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 物流信息
export class LogisticsInfo extends $tea.Model {
  // 发货时间
  deliveryTime: string;
  // 快递物流公司
  expressLogisticsCompany: string;
  // 快递单号
  courierNumber: string;
  // 签收时间
  signTime: string;
  static names(): { [key: string]: string } {
    return {
      deliveryTime: 'delivery_time',
      expressLogisticsCompany: 'express_logistics_company',
      courierNumber: 'courier_number',
      signTime: 'sign_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deliveryTime: 'string',
      expressLogisticsCompany: 'string',
      courierNumber: 'string',
      signTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 文件验签签名数据
export class ContractDocSignVerifySignatureInfo extends $tea.Model {
  // 是否篡改
  isModify?: boolean;
  // 签署时间来源
  timeFrom?: string;
  // 签署时间
  signDate?: string;
  static names(): { [key: string]: string } {
    return {
      isModify: 'is_modify',
      timeFrom: 'time_from',
      signDate: 'sign_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      isModify: 'boolean',
      timeFrom: 'string',
      signDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 履约信息
export class PerformanceInfo extends $tea.Model {
  // 支付租金总额
  rentPayTotal: string;
  // 买断金额
  buyoutAmount: string;
  // 租赁分期履约信息
  rentalInstallmentPerformance?: RentalInstallmentPerformance[];
  static names(): { [key: string]: string } {
    return {
      rentPayTotal: 'rent_pay_total',
      buyoutAmount: 'buyout_amount',
      rentalInstallmentPerformance: 'rental_installment_performance',
    };
  }

  static types(): { [key: string]: any } {
    return {
      rentPayTotal: 'string',
      buyoutAmount: 'string',
      rentalInstallmentPerformance: { 'type': 'array', 'itemType': RentalInstallmentPerformance },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 文本签证书信息
export class ContractTextSignVerifyCertInfo extends $tea.Model {
  // 证书所有者
  owner?: string;
  // 证书序列号
  serial?: string;
  // 证书有效期开始时间
  startDate?: string;
  // 证书有效期结束时间
  endDate?: string;
  // 证书发布者名称
  issuerCn?: string;
  static names(): { [key: string]: string } {
    return {
      owner: 'owner',
      serial: 'serial',
      startDate: 'start_date',
      endDate: 'end_date',
      issuerCn: 'issuer_cn',
    };
  }

  static types(): { [key: string]: any } {
    return {
      owner: 'string',
      serial: 'string',
      startDate: 'string',
      endDate: 'string',
      issuerCn: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 自动进件订单信息
export class LeaseOrderInfo extends $tea.Model {
  // 出租方平台名称
  lessorPlatformName?: string;
  // 订单号
  orderNumber: string;
  // 合同编号
  contractNo?: string;
  // 合同名称
  contractName?: string;
  // 订单商品信息列表
  orderItems: OrderItem[];
  // 设备及配件总价（单位元）
  totalDevicePrice: string;
  // 押金金额（单位元）
  depositAmount?: string;
  // 免押金额
  freeDeposit?: string;
  // 签约时间
  signTime?: string;
  // 租期起始时间
  leaseStartTime?: string;
  // 租期结束时间
  leaseEndTime?: string;
  // 买断金额计算公式
  buyoutAmountFormulaCalc?: string;
  // 首付款（单位元）
  payInAdvance?: string;
  // 创建时间
  orderCreateTime?: string;
  // 到期买断价 保留两位小数 单位元
  buyOutPrice?: string;
  static names(): { [key: string]: string } {
    return {
      lessorPlatformName: 'lessor_platform_name',
      orderNumber: 'order_number',
      contractNo: 'contract_no',
      contractName: 'contract_name',
      orderItems: 'order_items',
      totalDevicePrice: 'total_device_price',
      depositAmount: 'deposit_amount',
      freeDeposit: 'free_deposit',
      signTime: 'sign_time',
      leaseStartTime: 'lease_start_time',
      leaseEndTime: 'lease_end_time',
      buyoutAmountFormulaCalc: 'buyout_amount_formula_calc',
      payInAdvance: 'pay_in_advance',
      orderCreateTime: 'order_create_time',
      buyOutPrice: 'buy_out_price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      lessorPlatformName: 'string',
      orderNumber: 'string',
      contractNo: 'string',
      contractName: 'string',
      orderItems: { 'type': 'array', 'itemType': OrderItem },
      totalDevicePrice: 'string',
      depositAmount: 'string',
      freeDeposit: 'string',
      signTime: 'string',
      leaseStartTime: 'string',
      leaseEndTime: 'string',
      buyoutAmountFormulaCalc: 'string',
      payInAdvance: 'string',
      orderCreateTime: 'string',
      buyOutPrice: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 司法纠纷平台自然人通用结构体
export class JudicialPersonInfo extends $tea.Model {
  // 姓名
  name: string;
  // 身份证号码
  certNumber?: string;
  // 联系电话
  phone?: string;
  // 民族
  nationality?: string;
  // 通讯地址
  address?: string;
  // 身份证明
  identityCertification?: JudicialFileInfo;
  // 职务
  jobTitle?: string;
  // 任职证明
  jobCertification?: JudicialFileInfo;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      certNumber: 'cert_number',
      phone: 'phone',
      nationality: 'nationality',
      address: 'address',
      identityCertification: 'identity_certification',
      jobTitle: 'job_title',
      jobCertification: 'job_certification',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      certNumber: 'string',
      phone: 'string',
      nationality: 'string',
      address: 'string',
      identityCertification: JudicialFileInfo,
      jobTitle: 'string',
      jobCertification: JudicialFileInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 承诺信息
export class CommitmentInfo extends $tea.Model {
  // 租金总额
  totalRent: string;
  // 租赁分期信息
  rentalStagingInformation: RentalStagingInformation[];
  static names(): { [key: string]: string } {
    return {
      totalRent: 'total_rent',
      rentalStagingInformation: 'rental_staging_information',
    };
  }

  static types(): { [key: string]: any } {
    return {
      totalRent: 'string',
      rentalStagingInformation: { 'type': 'array', 'itemType': RentalStagingInformation },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 当被申请人为法人
export class LegalPerson extends $tea.Model {
  // 被申请人姓名
  name: string;
  // 法人统一社会信用编码
  idNumber: string;
  // 法定代表人姓名
  representativeName?: string;
  // 联系方式
  legalPhoneNumber?: string;
  // 住所地（同营业执照地址）
  legalAddress?: string;
  // 企业经营地址
  legalBusinessAddress?: string;
  // 营业执照照片
  // 文件信息列表（先调用接口获取上传url和fileKey）
  legalIdNumberFile?: FileInfo[];
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      idNumber: 'id_number',
      representativeName: 'representative_name',
      legalPhoneNumber: 'legal_phone_number',
      legalAddress: 'legal_address',
      legalBusinessAddress: 'legal_business_address',
      legalIdNumberFile: 'legal_id_number_file',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      idNumber: 'string',
      representativeName: 'string',
      legalPhoneNumber: 'string',
      legalAddress: 'string',
      legalBusinessAddress: 'string',
      legalIdNumberFile: { 'type': 'array', 'itemType': FileInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 司法纠纷平台银行信息结构体
export class JudicialBankInfo extends $tea.Model {
  // 开户行
  accountBank: string;
  // 开户账号
  accountNumber: string;
  // 开户名称
  accountName: string;
  // 开户联系电话
  accountContactPhone: string;
  static names(): { [key: string]: string } {
    return {
      accountBank: 'account_bank',
      accountNumber: 'account_number',
      accountName: 'account_name',
      accountContactPhone: 'account_contact_phone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accountBank: 'string',
      accountNumber: 'string',
      accountName: 'string',
      accountContactPhone: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 文本签签名信息
export class ContractTextSignVerifySignatureInfo extends $tea.Model {
  // 是否被篡改
  isModify?: boolean;
  static names(): { [key: string]: string } {
    return {
      isModify: 'is_modify',
    };
  }

  static types(): { [key: string]: any } {
    return {
      isModify: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阶段存证内容类表，根据模板定义传入
export class PhaseNotary extends $tea.Model {
  // 阶段编号，与模板阶段编号保持一致，不同阶段阶段编号不一样，要与阶段存证内容保持一致
  phaseNo: number;
  // 阶段存证内容，如果模板数据类型定义是Hash(哈希)则填入Hash即可，如果定义是Structure(结构化)，则填入模板所有字段json对象的字符串Base64后的值
  notaryContent: string;
  // 业务方原始数据ID，业务方确保唯一，方便与业务方进行数据核对使用
  // 
  originDataId: string;
  static names(): { [key: string]: string } {
    return {
      phaseNo: 'phase_no',
      notaryContent: 'notary_content',
      originDataId: 'origin_data_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      phaseNo: 'number',
      notaryContent: 'string',
      originDataId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 自动进件履约信息
export class LeasePerformanceInfo extends $tea.Model {
  // 支付租金总额
  rentPayTotal: string;
  // 买断金额
  buyoutAmount?: string;
  // 租赁分期履约信息
  rentalInstallmentPerformance?: RentalInstallmentPerformance[];
  static names(): { [key: string]: string } {
    return {
      rentPayTotal: 'rent_pay_total',
      buyoutAmount: 'buyout_amount',
      rentalInstallmentPerformance: 'rental_installment_performance',
    };
  }

  static types(): { [key: string]: any } {
    return {
      rentPayTotal: 'string',
      buyoutAmount: 'string',
      rentalInstallmentPerformance: { 'type': 'array', 'itemType': RentalInstallmentPerformance },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 答辩人为自然人对象
export class NaturalPerson extends $tea.Model {
  // 自然人姓名
  name: string;
  // 自然人手机号码
  mobileNumber: string;
  // 自然人身份号码
  idNumber: string;
  // 自然人民族
  nation?: string;
  // 自然人身份地址
  address?: string;
  // 自然人电子邮箱
  email?: string;
  // 自然人身份证正反面照片
  // 文件信息 列表（先调用接口获取上传url和fileKey）
  idNumberFile?: FileInfo[];
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      mobileNumber: 'mobile_number',
      idNumber: 'id_number',
      nation: 'nation',
      address: 'address',
      email: 'email',
      idNumberFile: 'id_number_file',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      mobileNumber: 'string',
      idNumber: 'string',
      nation: 'string',
      address: 'string',
      email: 'string',
      idNumberFile: { 'type': 'array', 'itemType': FileInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 文件签验签证书结构体
export class ContractDocSignVerifyCertInfo extends $tea.Model {
  // 证书所有者
  owner?: string;
  // 证书序列号
  serial?: string;
  // 证书开始日期
  startDate?: string;
  // 证书结束日期
  endDate?: string;
  // 证书颁发机构
  issuerCn?: string;
  static names(): { [key: string]: string } {
    return {
      owner: 'owner',
      serial: 'serial',
      startDate: 'start_date',
      endDate: 'end_date',
      issuerCn: 'issuer_cn',
    };
  }

  static types(): { [key: string]: any } {
    return {
      owner: 'string',
      serial: 'string',
      startDate: 'string',
      endDate: 'string',
      issuerCn: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 可信存证存证地点信息
export class Location extends $tea.Model {
  // 所在城市
  city?: string;
  // 使用设备的IMEI号
  imei?: string;
  // 使用设备的IMSI号
  imsi?: string;
  // 使用设备的IP地址
  ip?: string;
  // 纬度
  latitude?: string;
  // 经度
  longitude?: string;
  // 使用设备的Wi-Fi物理地址
  macAddr?: string;
  // 扩展属性
  properties?: string;
  static names(): { [key: string]: string } {
    return {
      city: 'city',
      imei: 'imei',
      imsi: 'imsi',
      ip: 'ip',
      latitude: 'latitude',
      longitude: 'longitude',
      macAddr: 'mac_addr',
      properties: 'properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      city: 'string',
      imei: 'string',
      imsi: 'string',
      ip: 'string',
      latitude: 'string',
      longitude: 'string',
      macAddr: 'string',
      properties: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 自动进件案件基础信息
export class CaseBasicInfo extends $tea.Model {
  // 案件租户id
  bizTenantId: string;
  // 案件类型:LEASE：租赁，FINANCIAL：金融，OTHER：其他
  caseType: string;
  // 标的金额（单位元）
  amount?: string;
  // 业务来源主键
  inputSourceId: string;
  // 案件进件来源 
  inputSource: string;
  // 根据业务来源主键对应订单号下的租赁事实报告和证据列表页面的嵌入URL
  caseExt?: string;
  static names(): { [key: string]: string } {
    return {
      bizTenantId: 'biz_tenant_id',
      caseType: 'case_type',
      amount: 'amount',
      inputSourceId: 'input_source_id',
      inputSource: 'input_source',
      caseExt: 'case_ext',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizTenantId: 'string',
      caseType: 'string',
      amount: 'string',
      inputSourceId: 'string',
      inputSource: 'string',
      caseExt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 电子合同存证代扣计划执行操作信息
export class ContractNotaryDeductExecutionInfo extends $tea.Model {
  // 付款方的区块链合同签署账号
  payerId: string;
  // 扣款金额，单位分
  amount: number;
  // 扣款渠道
  channel: string;
  // 扣款操作是否成功
  result: boolean;
  // 扣款操作发起时间
  timestamp: string;
  // 代扣计划ID
  order: string;
  static names(): { [key: string]: string } {
    return {
      payerId: 'payer_id',
      amount: 'amount',
      channel: 'channel',
      result: 'result',
      timestamp: 'timestamp',
      order: 'order',
    };
  }

  static types(): { [key: string]: any } {
    return {
      payerId: 'string',
      amount: 'number',
      channel: 'string',
      result: 'boolean',
      timestamp: 'string',
      order: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数字票根计量字段
export class MetricInfo extends $tea.Model {
  // 实际计收金额，单位：分。如传100，即为100分，1元
  collectAmount: number;
  // 计收受理时间
  collectTime: string;
  // 计收的订单流水号
  collectSerialNumber: string;
  static names(): { [key: string]: string } {
    return {
      collectAmount: 'collect_amount',
      collectTime: 'collect_time',
      collectSerialNumber: 'collect_serial_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      collectAmount: 'number',
      collectTime: 'string',
      collectSerialNumber: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 融资租赁资方承诺
export class LeaseCreditPromiseInfo extends $tea.Model {
  // 租期index
  term: number;
  // 应还金额
  payMoney: number;
  // 应还款时间
  payDate: string;
  // 垫付日
  payInAdvanceTime: string;
  // 垫付金额
  payInAdvanceMoney: number;
  static names(): { [key: string]: string } {
    return {
      term: 'term',
      payMoney: 'pay_money',
      payDate: 'pay_date',
      payInAdvanceTime: 'pay_in_advance_time',
      payInAdvanceMoney: 'pay_in_advance_money',
    };
  }

  static types(): { [key: string]: any } {
    return {
      term: 'number',
      payMoney: 'number',
      payDate: 'string',
      payInAdvanceTime: 'string',
      payInAdvanceMoney: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 融资租赁订单额外信息
export class LeaseOrderExtra extends $tea.Model {
  // 额外信息的主键
  key: string;
  // 额外信息的值
  value: string;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发起人对象
export class ProposerObject extends $tea.Model {
  // 申请人姓名
  name: string;
  // 统一社会信用代码
  idNumber: string;
  // 联系电话
  phoneNumber?: string;
  // 电子邮箱地址
  email?: string;
  // 经营地址
  businessAddress?: string;
  // 营业执照照片
  // 文件信息 列表
  idNumberFile?: FileInfo[];
  // 法定代表人姓名
  representativeName?: string;
  // 法定代表人性别
  // 0: 男 1: 女
  representativeSex?: number;
  // 法定代表人身份证号码
  representativeIdNumber?: string;
  // 法定代表人手机号码
  representativeMobileNumber?: string;
  // 法定代表人代表身份证明
  // 文件信息列表
  representativeIdNumberFile?: FileInfo[];
  // 法定代表人职务
  representativePost?: string;
  // 法定代表人职务证明
  // 文件信息列表
  representativePostFile?: FileInfo[];
  // 签章管理员姓名
  signatureManagerName?: string;
  // 签章管理员身份证号码
  signatureManagerIdCard?: string;
  // 签章管理员手机号码
  signatureManagerPhone?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      idNumber: 'id_number',
      phoneNumber: 'phone_number',
      email: 'email',
      businessAddress: 'business_address',
      idNumberFile: 'id_number_file',
      representativeName: 'representative_name',
      representativeSex: 'representative_sex',
      representativeIdNumber: 'representative_id_number',
      representativeMobileNumber: 'representative_mobile_number',
      representativeIdNumberFile: 'representative_id_number_file',
      representativePost: 'representative_post',
      representativePostFile: 'representative_post_file',
      signatureManagerName: 'signature_manager_name',
      signatureManagerIdCard: 'signature_manager_id_card',
      signatureManagerPhone: 'signature_manager_phone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      idNumber: 'string',
      phoneNumber: 'string',
      email: 'string',
      businessAddress: 'string',
      idNumberFile: { 'type': 'array', 'itemType': FileInfo },
      representativeName: 'string',
      representativeSex: 'number',
      representativeIdNumber: 'string',
      representativeMobileNumber: 'string',
      representativeIdNumberFile: { 'type': 'array', 'itemType': FileInfo },
      representativePost: 'string',
      representativePostFile: { 'type': 'array', 'itemType': FileInfo },
      signatureManagerName: 'string',
      signatureManagerIdCard: 'string',
      signatureManagerPhone: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 融资租赁人脸认证提前还款租期记录
export class FinanceCertifyRentalInfo extends $tea.Model {
  // 租期
  rentTerm: number;
  // 本期扣款金额，123400表示12.34元
  rentalMoney: number;
  // 还款日期，格式为"2019-07-31 12:00:00"
  rentalReturnTime: string;
  static names(): { [key: string]: string } {
    return {
      rentTerm: 'rent_term',
      rentalMoney: 'rental_money',
      rentalReturnTime: 'rental_return_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      rentTerm: 'number',
      rentalMoney: 'number',
      rentalReturnTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 创建电子合同签署盖章区时的申请信息
export class ContractSignFieldApplication extends $tea.Model {
  // 是否添加签署时间戳，默认不添加，时间格式如"2019-03-11 10:12:12"
  addSignTime?: boolean;
  // 签约主体账号标识， 将使用该主体账号对应的数字证书完成本次签署，如：当存在签署操作人代某机构签署时，需要传入该机构的账号id
  authorizedAccountId: string;
  // 电子合同文件ID
  fileId: string;
  // 签署区顺序，默认1,且不小于1，顺序越小越先处理
  order?: number;
  // 页码信息：当签署区signType为2时, 页码可以_-_分割, 例如1到15页，填"1-15"； 其他情况只能是数字
  posPage: string;
  // x坐标转为字符串的值，默认空，页面签章必填，骑缝签章不填写
  posX?: string;
  // y坐标转为字符串的值
  posY: string;
  // 印章id ，如不传，则采用账号下的默认印章
  sealId?: string;
  // 第三方业务流水号id，保证相同签署人、相同签约主体、相同签署顺序的任务，对应的第三方业务流水id唯一，默认空
  thirdOrderNo?: string;
  // 签署区宽，默认印章宽度	
  width?: string;
  // 签署类型，1-单页签署，2-骑缝签署，默认1
  signType?: number;
  static names(): { [key: string]: string } {
    return {
      addSignTime: 'add_sign_time',
      authorizedAccountId: 'authorized_account_id',
      fileId: 'file_id',
      order: 'order',
      posPage: 'pos_page',
      posX: 'pos_x',
      posY: 'pos_y',
      sealId: 'seal_id',
      thirdOrderNo: 'third_order_no',
      width: 'width',
      signType: 'sign_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      addSignTime: 'boolean',
      authorizedAccountId: 'string',
      fileId: 'string',
      order: 'number',
      posPage: 'string',
      posX: 'string',
      posY: 'string',
      sealId: 'string',
      thirdOrderNo: 'string',
      width: 'string',
      signType: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 机构信息
export class ContractUserOrganizationApplication extends $tea.Model {
  // 证件号，该字段只有为空才允许修改
  idNumber?: string;
  // 证件类型 ，默认CRED_ORG_USCC
  idType?: string;
  // 企业法定代表人名称
  legalPerson?: string;
  // 企业法定代表人证件号
  legalPersonId?: string;
  // 机构名称
  name?: string;
  // 机构账号id
  organizationId: string;
  static names(): { [key: string]: string } {
    return {
      idNumber: 'id_number',
      idType: 'id_type',
      legalPerson: 'legal_person',
      legalPersonId: 'legal_person_id',
      name: 'name',
      organizationId: 'organization_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      idNumber: 'string',
      idType: 'string',
      legalPerson: 'string',
      legalPersonId: 'string',
      name: 'string',
      organizationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 自动进件证据要素
export class LeaseEvidentialElement extends $tea.Model {
  // 订单信息
  leaseOrderInfo: LeaseOrderInfo;
  // 承诺信息
  commitmentInfo: CommitmentInfo;
  // 物流信息
  logisticsInfo: LogisticsInfo;
  // 履约信息
  performanceInfo: LeasePerformanceInfo;
  static names(): { [key: string]: string } {
    return {
      leaseOrderInfo: 'lease_order_info',
      commitmentInfo: 'commitment_info',
      logisticsInfo: 'logistics_info',
      performanceInfo: 'performance_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      leaseOrderInfo: LeaseOrderInfo,
      commitmentInfo: CommitmentInfo,
      logisticsInfo: LogisticsInfo,
      performanceInfo: LeasePerformanceInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 电子合同签署盖章区
export class ContractSignField extends $tea.Model {
  // 电子合同用户ID
  accountId: string;
  // 电子合同文档ID
  fileId: string;
  // 电子合同签署区id
  signfieldId: string;
  static names(): { [key: string]: string } {
    return {
      accountId: 'account_id',
      fileId: 'file_id',
      signfieldId: 'signfield_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accountId: 'string',
      fileId: 'string',
      signfieldId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签署区详情
export class ContractSignFieldDetail extends $tea.Model {
  // 签约主体类别，0-个人，1-机构，默认0,2 是不限
  actorIndentityType?: number;
  // 添加时间
  addTime?: number;
  // 是否指定位置，TRUE表示不允许更新位置，配置项，无默认值
  assignedPosbean?: boolean;
  // 是否指定印章数据，TRUE表示不允许更新印章，配置项，无默认值
  assignedSeal?: boolean;
  // 签约主体账号标识，将使用该主体账号对应的数字证书完成本次签署，如：当存在签署操作人代某机构签署时，需要传入该机构的账号id
  authorizedAccountId?: string;
  // 是否自动执行，TRUE需要静默授权，配置项，无默认值
  autoExecute?: boolean;
  // 执行失败原因
  executeFailedReason?: string;
  // 文件file id
  fileId?: string;
  // 流程id
  flowId?: string;
  // 签署区顺序，默认1,且不小于1，顺序越小越先处理
  order?: number;
  // 页码信息，可以_,_或_-_分割
  posPage?: string;
  // x坐标
  posX?: string;
  // y坐标
  posY?: string;
  // 印章文件file key
  sealFileKey?: string;
  // 印章id
  sealId?: string;
  // 印章类型，支持多种类型时逗号分割，0-手绘印章，1-模版印章，为空不限制
  sealType?: string;
  // 签署操作人个人账号标识，即操作本次签署的个人，如需e签宝通知用户签署，则系统向该账号下绑定的手机、邮箱发送签署链接
  signerAccountId?: string;
  // 签署区Id
  signfieldId?: string;
  // 签署类型，0-不限，1-单页签署，2-骑缝签署,4-关键字签署，默认1
  signType?: number;
  // 签署区状态（0："等待执行，1："执行中"，2："执行失败"，3："审批中"，4： "执行完成"）
  status?: number;
  // 状态描述
  statusDescription?: string;
  // 签署区宽
  width?: string;
  static names(): { [key: string]: string } {
    return {
      actorIndentityType: 'actor_indentity_type',
      addTime: 'add_time',
      assignedPosbean: 'assigned_posbean',
      assignedSeal: 'assigned_seal',
      authorizedAccountId: 'authorized_account_id',
      autoExecute: 'auto_execute',
      executeFailedReason: 'execute_failed_reason',
      fileId: 'file_id',
      flowId: 'flow_id',
      order: 'order',
      posPage: 'pos_page',
      posX: 'pos_x',
      posY: 'pos_y',
      sealFileKey: 'seal_file_key',
      sealId: 'seal_id',
      sealType: 'seal_type',
      signerAccountId: 'signer_account_id',
      signfieldId: 'signfield_id',
      signType: 'sign_type',
      status: 'status',
      statusDescription: 'status_description',
      width: 'width',
    };
  }

  static types(): { [key: string]: any } {
    return {
      actorIndentityType: 'number',
      addTime: 'number',
      assignedPosbean: 'boolean',
      assignedSeal: 'boolean',
      authorizedAccountId: 'string',
      autoExecute: 'boolean',
      executeFailedReason: 'string',
      fileId: 'string',
      flowId: 'string',
      order: 'number',
      posPage: 'string',
      posX: 'string',
      posY: 'string',
      sealFileKey: 'string',
      sealId: 'string',
      sealType: 'string',
      signerAccountId: 'string',
      signfieldId: 'string',
      signType: 'number',
      status: 'number',
      statusDescription: 'string',
      width: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 采购供应商初始化 
export class SupplierInfo extends $tea.Model {
  // 供应商id
  agentSupplierId: string;
  // 被代理机构社会统一信用码
  agentSupplierCorpId: string;
  // 被代理机构名称
  agentSupplierCorpName: string;
  // 被代理供应商名称
  agentSupplierName: string;
  // 被代理机构的法人名称
  agentSupplierCorpOwnerName: string;
  // 额外信息
  extraInfo?: string;
  static names(): { [key: string]: string } {
    return {
      agentSupplierId: 'agent_supplier_id',
      agentSupplierCorpId: 'agent_supplier_corp_id',
      agentSupplierCorpName: 'agent_supplier_corp_name',
      agentSupplierName: 'agent_supplier_name',
      agentSupplierCorpOwnerName: 'agent_supplier_corp_owner_name',
      extraInfo: 'extra_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      agentSupplierId: 'string',
      agentSupplierCorpId: 'string',
      agentSupplierCorpName: 'string',
      agentSupplierName: 'string',
      agentSupplierCorpOwnerName: 'string',
      extraInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 电子合同存证代扣计划信息
export class ContractNotaryDeductPlanInfo extends $tea.Model {
  // PAYERIDNUMBER
  payerId: string;
  // “总金额：”+总金额“+”“总期数：”+总期数，“+”每期金额时间（X期金额，时间）
  deductPlanInfo: string;
  // AGREEMEND_ID_NUMBER
  agreementNo: string;
  // 代扣计划发起时间
  timestamp: string;
  static names(): { [key: string]: string } {
    return {
      payerId: 'payer_id',
      deductPlanInfo: 'deduct_plan_info',
      agreementNo: 'agreement_no',
      timestamp: 'timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      payerId: 'string',
      deductPlanInfo: 'string',
      agreementNo: 'string',
      timestamp: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 电子合同存证结束信息
export class ContractNotaryFinishInfo extends $tea.Model {
  // 本阶段存证内容哈希值
  content: string;
  // 签署文件份数
  fileNum: number;
  // 发起人ID
  initiator: string;
  // 签署人ID（支持多个，不同ID间用“,”分隔开）
  signatories: string;
  // 存证阶段发生时间，UNIX时间戳(毫秒)
  timestamp: string;
  // 存证凭据，仅在批量核验时需要填写
  txHash?: string;
  // signatories对应的用户类型
  userTypes?: string;
  // 签署合同所属行业
  businessType?: string;
  // 合同对应的金额，如果不涉及金额，填充为0，个数与file_num对应
  amounts?: string;
  // 签署方数量
  signPartyCount?: number;
  // 发起人名称
  intiatorName?: string;
  // 签署人名称,多个逗号隔开
  signatorNames?: string;
  // 详细文件哈希
  detailInfoFileHash?: string;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      fileNum: 'file_num',
      initiator: 'initiator',
      signatories: 'signatories',
      timestamp: 'timestamp',
      txHash: 'tx_hash',
      userTypes: 'user_types',
      businessType: 'business_type',
      amounts: 'amounts',
      signPartyCount: 'sign_party_count',
      intiatorName: 'intiator_name',
      signatorNames: 'signator_names',
      detailInfoFileHash: 'detail_info_file_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: 'string',
      fileNum: 'number',
      initiator: 'string',
      signatories: 'string',
      timestamp: 'string',
      txHash: 'string',
      userTypes: 'string',
      businessType: 'string',
      amounts: 'string',
      signPartyCount: 'number',
      intiatorName: 'string',
      signatorNames: 'string',
      detailInfoFileHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 见证流程文档检验数据
export class WitnessDocs extends $tea.Model {
  // 文档摘要值
  docHash: string;
  // 第三方文档id
  thirdDocId: string;
  static names(): { [key: string]: string } {
    return {
      docHash: 'doc_hash',
      thirdDocId: 'third_doc_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      docHash: 'string',
      thirdDocId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 平台方自动签署区信息
export class ContractPlatformSignField extends $tea.Model {
  // 是否添加签署时间戳，默认不添加，时间格式如"2019-03-11 10:12:12"
  addSignTime?: boolean;
  // 签署区顺序，默认1,且不小于1，顺序越小越先处理
  order?: number;
  // 页码信息，当签署区signType为2时, 页码可以_-_分割, 其他情况只能是数字
  posPage: string;
  // x坐标转为字符串的值，默认空
  posX?: string;
  // y坐标转为字符串的值
  posY: string;
  // 印章id ，如不传，则采用账号下的默认印章
  sealId?: string;
  // 第三方业务流水号id，保证相同签署人、相同签约主体、相同签署顺序的任务，对应的第三方业务流水id唯一，默认空
  thirdOrderNo?: string;
  // 签署区宽，默认印章宽度
  width?: string;
  static names(): { [key: string]: string } {
    return {
      addSignTime: 'add_sign_time',
      order: 'order',
      posPage: 'pos_page',
      posX: 'pos_x',
      posY: 'pos_y',
      sealId: 'seal_id',
      thirdOrderNo: 'third_order_no',
      width: 'width',
    };
  }

  static types(): { [key: string]: any } {
    return {
      addSignTime: 'boolean',
      order: 'number',
      posPage: 'string',
      posX: 'string',
      posY: 'string',
      sealId: 'string',
      thirdOrderNo: 'string',
      width: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 文件签署签署信息,包含证书与签名
export class ContractDocSignVerifyInfo extends $tea.Model {
  // 证书信息
  cert?: ContractDocSignVerifyCertInfo;
  // 签名信息
  signature?: ContractDocSignVerifySignatureInfo;
  // 印章数据
  sealData?: string;
  static names(): { [key: string]: string } {
    return {
      cert: 'cert',
      signature: 'signature',
      sealData: 'seal_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cert: ContractDocSignVerifyCertInfo,
      signature: ContractDocSignVerifySignatureInfo,
      sealData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 见证流程签署数据
export class WitnessSignData extends $tea.Model {
  // 印章图片fileKey列表
  sealFileKeys?: string[];
  // 印章id列表
  sealIds?: string[];
  // 待签署文档摘要值，批量签时必传
  signHash?: string;
  // 签署位置信息
  signPosData?: string;
  // 第三方文档id，批量签时必传
  thirdDocId?: string;
  static names(): { [key: string]: string } {
    return {
      sealFileKeys: 'seal_file_keys',
      sealIds: 'seal_ids',
      signHash: 'sign_hash',
      signPosData: 'sign_pos_data',
      thirdDocId: 'third_doc_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sealFileKeys: { 'type': 'array', 'itemType': 'string' },
      sealIds: { 'type': 'array', 'itemType': 'string' },
      signHash: 'string',
      signPosData: 'string',
      thirdDocId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 案件基础信息
export class CaseBaseInfo extends $tea.Model {
  // caseID
  caseId: string;
  // PENDING_RIGHTS_PROTECTION(1, "待发起维权"),
  // TO_BE_SUBMITTED(2, "待提交"),
  // ACCEPTED_AND_PROCESSED(3, "收案处理中"),
  // RESULTS_TO_BE_CONFIRMED(4, "结果待确认"),
  // CLOSED(5, "已关闭"),
  casePhase: string;
  // 维权ID
  recordId: string;
  // MEDIATION(1, "调解"),
  // LITIGATION(2, "诉讼"),
  // ARBITRATION(3, "仲裁"),
  // CARRIED_OUT(4, "执行"),
  recordType: string;
  // MATERIAL_PREPARATION(1, "材料准备中"),
  // SUBMITTED(2, "已提交"),
  // FILED(3, "已立案"),
  // CLOSED(4, "已结案"),
  // WITHDRAW_THE_CASE(5, "撤案"),
  // REVOKE(6, "撤销"),
  // INADMISSIBLE(7, "不予受理"),
  // SUBMITTING(8, "提交中"),
  // SUBMISSION_FAILED(9, "提交失败"),
  // FINAL_RULING(10, "裁定终本"),
  // CARRIED_OUT_FINISHED(11, "执行完毕"),
  // TO_BE_SIGNED(12, "签署中"),
  // SIGNING_TIMED_OUT(13, "签署超时"),
  // SIGN_REJECTED(14, "签署被拒绝"),
  // SIGN_REVOCATION(15, "签署撤销"),
  // WITHDRAW_THE_CASE_ING(16, "撤案处理中"),
  // WITHDRAW_SIGNING_TIMED_OUT(17, "撤案签署超时"),
  // WITHDRAW_SIGN_REJECTED(18, "撤案签署被拒绝"),
  // WITHDRAW_SIGN_REVOCATION(19, "撤案签署撤销"),
  // SIGNED(20, "签署完成"),
  // WITHDRAW_SIGNED(21, "撤案签署完成"),
  caseStatus: string;
  // 案件提交时间
  submitTime: string;
  // 维权机构
  arbitralBody: string;
  // 结案时间 如没有则为""
  closeTime?: string;
  // 案号 如没有则为""
  acceptanceNumber?: string;
  // 案件回款金额,两位小数 单位(元) 如没有则为""
  casePaymentActualAmount?: string;
  // 是否能够下载 true可以下载 false没有可下载文件
  canDownload: string;
  static names(): { [key: string]: string } {
    return {
      caseId: 'case_id',
      casePhase: 'case_phase',
      recordId: 'record_id',
      recordType: 'record_type',
      caseStatus: 'case_status',
      submitTime: 'submit_time',
      arbitralBody: 'arbitral_body',
      closeTime: 'close_time',
      acceptanceNumber: 'acceptance_number',
      casePaymentActualAmount: 'case_payment_actual_amount',
      canDownload: 'can_download',
    };
  }

  static types(): { [key: string]: any } {
    return {
      caseId: 'string',
      casePhase: 'string',
      recordId: 'string',
      recordType: 'string',
      caseStatus: 'string',
      submitTime: 'string',
      arbitralBody: 'string',
      closeTime: 'string',
      acceptanceNumber: 'string',
      casePaymentActualAmount: 'string',
      canDownload: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 电子合同存证合同文档信息
export class ContractNotaryDocumentInfo extends $tea.Model {
  // 签署完成的合同hash
  content: string;
  // 签署人ID（支持多个，不同ID间用“,”分隔开）
  signatories: string;
  // 存证结束时间，UNIX时间戳(毫秒)
  timestamp: string;
  // 存证凭据，仅在批量核验时需要填写
  txHash?: string;
  // 签署的文件ID
  fileId: string;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      signatories: 'signatories',
      timestamp: 'timestamp',
      txHash: 'tx_hash',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: 'string',
      signatories: 'string',
      timestamp: 'string',
      txHash: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 关键字位置列表
export class KeywordsPosition extends $tea.Model {
  // 关键字
  keyword: string;
  // 页码
  pageIndex: number;
  // x坐标
  posX: string;
  // y坐标
  posY: string;
  static names(): { [key: string]: string } {
    return {
      keyword: 'keyword',
      pageIndex: 'page_index',
      posX: 'pos_x',
      posY: 'pos_y',
    };
  }

  static types(): { [key: string]: any } {
    return {
      keyword: 'string',
      pageIndex: 'number',
      posX: 'string',
      posY: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 电子合同文档的下载地址
export class ContractDocAddress extends $tea.Model {
  // 电子合同文档ID
  fileId: string;
  // 电子合同文档名称，默认文件名称
  fileName: string;
  // 电子合同下载文档地址, 有效时间1小时
  fileUrl: string;
  // 合同文件的存证地址
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      fileId: 'file_id',
      fileName: 'file_name',
      fileUrl: 'file_url',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fileId: 'string',
      fileName: 'string',
      fileUrl: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数字票根通用字段
export class StubCommonInfo extends $tea.Model {
  // 项目名称
  projectName: string;
  // 客户名称（三方合约中甲方名称：景区或服务商）
  sceneName: string;
  // 业务类型。目前只有数字票根这一个情景，枚举为：TICKET_STUB
  bizType: string;
  // 业务来源；Alipay：支付宝，Scene：景区
  bizSource: string;
  // 订单id。若bizSource为支付宝情况下传支付宝流水号（业务系统的出票流水号）；若bizSource为景区时传上游生成的订单号
  orderId: string;
  // 订单名称
  orderName?: string;
  // 订单总金额，单位：分。如传100，即为100分，1元
  orderAmount: number;
  // 下单时间
  orderTime: string;
  // 待分账金额，单位：分。如传100，即为100分，1元
  stubAmount: number;
  // 客户id。支付宝情况下传支付宝id，2088打头；景区时可传自定义的客户id
  customerId: string;
  // 景区支付宝id，当biz_source为Alipay时，该字段必填
  sceneAlipayId?: string;
  static names(): { [key: string]: string } {
    return {
      projectName: 'project_name',
      sceneName: 'scene_name',
      bizType: 'biz_type',
      bizSource: 'biz_source',
      orderId: 'order_id',
      orderName: 'order_name',
      orderAmount: 'order_amount',
      orderTime: 'order_time',
      stubAmount: 'stub_amount',
      customerId: 'customer_id',
      sceneAlipayId: 'scene_alipay_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      projectName: 'string',
      sceneName: 'string',
      bizType: 'string',
      bizSource: 'string',
      orderId: 'string',
      orderName: 'string',
      orderAmount: 'number',
      orderTime: 'string',
      stubAmount: 'number',
      customerId: 'string',
      sceneAlipayId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 见证流程创建响应数据
export class WitnessFlowConfig extends $tea.Model {
  // 企业实名认证方式,对公打款：1；企业芝麻认证：3；法定代表授权：4；
  organRealnameTypes?: number[];
  // 个人实名认证方式, 银行四要素：2；芝麻认证-人脸识别：3；微众-人脸识别：4；
  personRealnameTypes?: number[];
  // 是否需要实名认证
  realNameCert?: boolean;
  // 意愿认证方式, 芝麻认证-人脸识别：2；短信验证码：3；微众-人脸识别：4；ukey认证：5；签署密码认证：6；
  willingnessTypes?: number[];
  static names(): { [key: string]: string } {
    return {
      organRealnameTypes: 'organ_realname_types',
      personRealnameTypes: 'person_realname_types',
      realNameCert: 'real_name_cert',
      willingnessTypes: 'willingness_types',
    };
  }

  static types(): { [key: string]: any } {
    return {
      organRealnameTypes: { 'type': 'array', 'itemType': 'number' },
      personRealnameTypes: { 'type': 'array', 'itemType': 'number' },
      realNameCert: 'boolean',
      willingnessTypes: { 'type': 'array', 'itemType': 'number' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 见证流程审批数据
export class WitnessApprovalData extends $tea.Model {
  // 审批流程id
  approvalFlowId?: string;
  // 印章id列表
  sealIds?: string[];
  static names(): { [key: string]: string } {
    return {
      approvalFlowId: 'approval_flow_id',
      sealIds: 'seal_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      approvalFlowId: 'string',
      sealIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 供应商商品信息
export class SupplierProductItem extends $tea.Model {
  // 供应商名称
  supplierName?: string;
  // 商品型号
  productModel: string;
  // 供应商id
  supplierId?: string;
  // 商品唯一id
  productId: string;
  // 3C
  mainClass: string;
  // 预计发货量
  estimatedShipment?: number;
  // 二级类目
  subClass: string;
  // 商品详情
  productDetailInfo: string;
  // 商品品牌
  productBrand: string;
  // 商品来源
  productOrigin: number;
  // 商品名称
  productName: string;
  // 商品版本
  productVersion: number;
  // 商品安装费用
  installPrice?: number;
  // 实际库存
  realStock?: number;
  // 保证金
  depositPrice?: number;
  // 商品url
  productUrl?: string;
  // 官网价
  productPrice: number;
  // 商品预留字段
  extraInfo?: string;
  static names(): { [key: string]: string } {
    return {
      supplierName: 'supplier_name',
      productModel: 'product_model',
      supplierId: 'supplier_id',
      productId: 'product_id',
      mainClass: 'main_class',
      estimatedShipment: 'estimated_shipment',
      subClass: 'sub_class',
      productDetailInfo: 'product_detail_info',
      productBrand: 'product_brand',
      productOrigin: 'product_origin',
      productName: 'product_name',
      productVersion: 'product_version',
      installPrice: 'install_price',
      realStock: 'real_stock',
      depositPrice: 'deposit_price',
      productUrl: 'product_url',
      productPrice: 'product_price',
      extraInfo: 'extra_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      supplierName: 'string',
      productModel: 'string',
      supplierId: 'string',
      productId: 'string',
      mainClass: 'string',
      estimatedShipment: 'number',
      subClass: 'string',
      productDetailInfo: 'string',
      productBrand: 'string',
      productOrigin: 'number',
      productName: 'string',
      productVersion: 'number',
      installPrice: 'number',
      realStock: 'number',
      depositPrice: 'number',
      productUrl: 'string',
      productPrice: 'number',
      extraInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阶段存证进度查询结果
export class PhaseQueryResult extends $tea.Model {
  // 阶段ID
  phaseId: string;
  // 阶段存证的链上交易Hash，只有status为FINISH才会返回
  txHash: string;
  // 阶段存证状态
  status: string;
  // 阶段注册成功时间戳
  registerTime: number;
  static names(): { [key: string]: string } {
    return {
      phaseId: 'phase_id',
      txHash: 'tx_hash',
      status: 'status',
      registerTime: 'register_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      phaseId: 'string',
      txHash: 'string',
      status: 'string',
      registerTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 采购商品信息
export class ApplySupplierOrderProductInput extends $tea.Model {
  // 采购商品id
  productId: string;
  // 采购商品数量
  productNum: number;
  static names(): { [key: string]: string } {
    return {
      productId: 'product_id',
      productNum: 'product_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      productId: 'string',
      productNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 智能合同机构账户创建申请信息
export class ContractOrganizationApplication extends $tea.Model {
  // 证件号
  idNumber: string;
  // 证件类型，默认CRED_ORG_USCC，详见机构证件类型说明 （https://antchain.antgroup.com/docs/2/424437#）
  idType: string;
  // 企业法人名称
  legalPerson?: string;
  // 企业法人证件号
  legalPersonId?: string;
  // 机构名称
  name: string;
  // 机构唯一标识，可传入第三方平台的机构用户id等
  organizationId?: string;
  // 机构子类型：ENTERPRISE（企业）、SELF-EMPLOYED（个体工商户）、SUBSIDIARY（分公司）、OTHERORG（其他机构）。若填入这些类型，将会进行相应参数校验，例如：企业类型要求进行企业四要素校验，企业证件号必须是91开头，并且企业类型在签署时会需要授权后才可进行签署；个体工商户要求证件号必须是92开头，其余类型无其他校验。不填入此参数不会进行校验。
  orgType?: string;
  static names(): { [key: string]: string } {
    return {
      idNumber: 'id_number',
      idType: 'id_type',
      legalPerson: 'legal_person',
      legalPersonId: 'legal_person_id',
      name: 'name',
      organizationId: 'organization_id',
      orgType: 'org_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      idNumber: 'string',
      idType: 'string',
      legalPerson: 'string',
      legalPersonId: 'string',
      name: 'string',
      organizationId: 'string',
      orgType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阶段存证结果
export class PhaseCreateResult extends $tea.Model {
  // 阶段编号，与模板阶段编号保持一致，不同阶段阶段编号不一样，要与阶段存证内容保持一致
  phaseNo: number;
  // 阶段ID，阶段存证的唯一标记
  phaseId: string;
  // 业务方原始数据ID，方便与业务方进行数据核对使用，并且如果同一个阶段多次存证，则需要根据业务方原始数据ID识别不同的阶段存证响应
  originDataId: string;
  static names(): { [key: string]: string } {
    return {
      phaseNo: 'phase_no',
      phaseId: 'phase_id',
      originDataId: 'origin_data_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      phaseNo: 'number',
      phaseId: 'string',
      originDataId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 证据清单
export class EvidentialCheckList extends $tea.Model {
  // 证据名称英文 
  evidentialNameEn: string;
  // 文件名称
  ossFileName: string;
  // 文件fileKey ，调用获取文件上传链接时对应的fileKey
  ossFileKey: string;
  // 证据来源
  // BUSINESS_UPLOAD	业务传入
  // ADD_MANULLY	手动添加
  sourcesOfEvidence: string;
  // 证据类型
  // BLOCKCHAIN_DEPOSIT	区块链存证
  // USER_UPLOAD	用户上传
  evidenceType: string;
  // 存证类型
  // TEXT	文本
  // FILE	文件
  depositType: string;
  // 存证哈希 当为区块链存证必填
  txHash?: string;
  // 存证时间 当为区块链存证必填
  depositTime?: string;
  static names(): { [key: string]: string } {
    return {
      evidentialNameEn: 'evidential_name_en',
      ossFileName: 'oss_file_name',
      ossFileKey: 'oss_file_key',
      sourcesOfEvidence: 'sources_of_evidence',
      evidenceType: 'evidence_type',
      depositType: 'deposit_type',
      txHash: 'tx_hash',
      depositTime: 'deposit_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      evidentialNameEn: 'string',
      ossFileName: 'string',
      ossFileKey: 'string',
      sourcesOfEvidence: 'string',
      evidenceType: 'string',
      depositType: 'string',
      txHash: 'string',
      depositTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 见证流程签署结果数据
export class WitnessSignResult extends $tea.Model {
  // 签名结果，外部用户签署返回
  signResult?: string;
  // 签署日志id，外部用户签署返回
  signlogId?: string;
  // 第三方文档id
  thirdDocId?: string;
  static names(): { [key: string]: string } {
    return {
      signResult: 'sign_result',
      signlogId: 'signlog_id',
      thirdDocId: 'third_doc_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      signResult: 'string',
      signlogId: 'string',
      thirdDocId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 核验请求时对应的存证元数据
export class NotaryCheckMeta extends $tea.Model {
  // 对应的法院编号
  agencyCode?: string;
  // 哈希算法, notary_type 为 HASH 时此参数必填
  hashAlgorithm?: string;
  // 存证内容
  notaryContent: string;
  // 交易哈希
  txHash: string;
  // 应用ID
  applicationCode?: string;
  static names(): { [key: string]: string } {
    return {
      agencyCode: 'agency_code',
      hashAlgorithm: 'hash_algorithm',
      notaryContent: 'notary_content',
      txHash: 'tx_hash',
      applicationCode: 'application_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      agencyCode: 'string',
      hashAlgorithm: 'string',
      notaryContent: 'string',
      txHash: 'string',
      applicationCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 电子合同存证代扣计划退款信息
export class ContractNotaryDeductRefundInfo extends $tea.Model {
  // PAYERIDNUMBER
  payerId: string;
  // 退款金额，单位分
  amount: number;
  // 代扣计划ID
  order: string;
  // 退款操作发起时间
  timestamp: string;
  static names(): { [key: string]: string } {
    return {
      payerId: 'payer_id',
      amount: 'amount',
      order: 'order',
      timestamp: 'timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      payerId: 'string',
      amount: 'number',
      order: 'string',
      timestamp: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 共享项目，资产端的采购平台回传的物流信息
export class SupplierLogisticInfo extends $tea.Model {
  // 采购平台的物流单号
  logisticOrderId: string;
  static names(): { [key: string]: string } {
    return {
      logisticOrderId: 'logistic_order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      logisticOrderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 司法纠纷平台案件维权事件响应信息
export class JudicialEventOperateInfo extends $tea.Model {
  // 响应类型:
  // 司法调解
  //   延期确认: DELAY_CONFIRM
  //   回款确认: CASH_CONFIRM
  // 
  operateType: string;
  // 响应内容
  // 延期确认
  //   确认-CONFIRM
  //   否认-DENY
  // 回款确认:
  //   确认-CONFIRM
  //   有异议-DISSENT
  operateOpinion: string;
  // 当延期申请不同意,回款确认有异议时填写原因
  operateReason?: string;
  // 回款记录编号,回款确认时必填
  reqBizNo?: string;
  static names(): { [key: string]: string } {
    return {
      operateType: 'operate_type',
      operateOpinion: 'operate_opinion',
      operateReason: 'operate_reason',
      reqBizNo: 'req_biz_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      operateType: 'string',
      operateOpinion: 'string',
      operateReason: 'string',
      reqBizNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 电子合同签署流程的配置信息
export class ContractSignFlowConfig extends $tea.Model {
  // 回调通知地址 ,默认取项目配置通知地址
  noticeDeveloperUrl?: string;
  // 签署通知和审批通知的通知方式，传 "" 表示不需要通知，传"1"表示短信通知。短信功能需要联系售后开白名单才会生效。
  noticeType: string;
  // 签署成功或者流程结束后的默认重定向地址，默认签署完成停在当前页面
  redirectUrl?: string;
  // 签署平台，逗号分割，1-开放服务h5，2-支付宝签 ，默认值1
  signPlatform?: string;
  // 签署失败时的跳转地址，如果不做单独配置，默认与redirect_url一致（配合twc.notary.contract.signflow.create接口使用）
  redirectUrlOnFailure?: string;
  // 是否允许自由签署，默认false（配合twc.notary.contract.signflow.create接口使用）
  freeSignature?: boolean;
  static names(): { [key: string]: string } {
    return {
      noticeDeveloperUrl: 'notice_developer_url',
      noticeType: 'notice_type',
      redirectUrl: 'redirect_url',
      signPlatform: 'sign_platform',
      redirectUrlOnFailure: 'redirect_url_on_failure',
      freeSignature: 'free_signature',
    };
  }

  static types(): { [key: string]: any } {
    return {
      noticeDeveloperUrl: 'string',
      noticeType: 'string',
      redirectUrl: 'string',
      signPlatform: 'string',
      redirectUrlOnFailure: 'string',
      freeSignature: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 融资租赁商品出租详细信息
export class RentInfo extends $tea.Model {
  // 租金
  rentPrice: number;
  // 租期
  rentTerm: number;
  // 手续费
  commission: number;
  // 买断价
  buyoutPrice: number;
  // 留购价
  retainedPrice: number;
  static names(): { [key: string]: string } {
    return {
      rentPrice: 'rent_price',
      rentTerm: 'rent_term',
      commission: 'commission',
      buyoutPrice: 'buyout_price',
      retainedPrice: 'retained_price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      rentPrice: 'number',
      rentTerm: 'number',
      commission: 'number',
      buyoutPrice: 'number',
      retainedPrice: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 融资租赁清分信息
export class LeaseClearingInfo extends $tea.Model {
  // 还款批次
  returnIndex: number;
  // 清分状态
  clearingState: number;
  // 清分金额,精确到毫厘，即123400表示12.34元
  clearingMoney: number;
  // 开始清分时间
  startTime: string;
  // 结束清分时间
  endTime: string;
  // 清分单号
  clearingOrderId: string;
  // 清分收款账号
  clearingAccount: string;
  // 清分额外说明
  memo: string;
  static names(): { [key: string]: string } {
    return {
      returnIndex: 'return_index',
      clearingState: 'clearing_state',
      clearingMoney: 'clearing_money',
      startTime: 'start_time',
      endTime: 'end_time',
      clearingOrderId: 'clearing_order_id',
      clearingAccount: 'clearing_account',
      memo: 'memo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      returnIndex: 'number',
      clearingState: 'number',
      clearingMoney: 'number',
      startTime: 'string',
      endTime: 'string',
      clearingOrderId: 'string',
      clearingAccount: 'string',
      memo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阶段详情信息
export class PhaseDetail extends $tea.Model {
  // 阶段id
  phaseId: string;
  // 阶段编号
  phaseNo: number;
  // 阶段存证时间
  registerTime: number;
  // 阶段存证凭据
  txHash: string;
  // 模板字段类型，Hash/Structure，(Hash->哈希,Structure->结构化)
  dataType: string;
  // 阶段存证内容
  // 如果模板数据类型定义是Hash(哈希)则返回存证时Hash
  // 如果定义是Structure(结构化)，则返回所有字段json对象的字符串Base64后的值
  notaryContent: string;
  // 模板字段类型为Structure时才有值，结构化数据里面英文key对应的中文名称关系，json格式，key为字段英文名，value为字段中文名称
  dataTypeKey: string;
  static names(): { [key: string]: string } {
    return {
      phaseId: 'phase_id',
      phaseNo: 'phase_no',
      registerTime: 'register_time',
      txHash: 'tx_hash',
      dataType: 'data_type',
      notaryContent: 'notary_content',
      dataTypeKey: 'data_type_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      phaseId: 'string',
      phaseNo: 'number',
      registerTime: 'number',
      txHash: 'string',
      dataType: 'string',
      notaryContent: 'string',
      dataTypeKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业四要素校验
export class CompanyFourMetaInfo extends $tea.Model {
  // 企业证件名称
  companyCertName: string;
  // 企业证件号码
  companyCertNo: string;
  // 证件类型, 默认社会统一信用代码  NATIONAL_LEGAL_MERGE:统一社会信用代码，NATIONAL_LEGAL：营业执照号码
  companyCertType?: string;
  // 法人证件名称
  legalPersonCertName: string;
  // 法人证件号码
  legalPersonCertNo: string;
  // 法人证件类型 RESIDENT：居民身份证号，PASSPORT：护照，MILITARY：军官证
  legalPersonCertType?: string;
  static names(): { [key: string]: string } {
    return {
      companyCertName: 'company_cert_name',
      companyCertNo: 'company_cert_no',
      companyCertType: 'company_cert_type',
      legalPersonCertName: 'legal_person_cert_name',
      legalPersonCertNo: 'legal_person_cert_no',
      legalPersonCertType: 'legal_person_cert_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      companyCertName: 'string',
      companyCertNo: 'string',
      companyCertType: 'string',
      legalPersonCertName: 'string',
      legalPersonCertNo: 'string',
      legalPersonCertType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 案件进度查询返回结果
export class MediationCaseDetailInfo extends $tea.Model {
  // 案件编码
  caseNumber: string;
  // 案号
  caseCode: string;
  // 案由
  causeActionName: string;
  // 案件状态
  caseTatus: string;
  // 调解平台
  mediationPlatform: string;
  // 调解机构
  mediationOrg: string;
  // 调解员
  mediator: string;
  // 申请时间
  applyTime: number;
  // 调解结果
  mediationResult: string;
  // 申请人意向金额
  accuserIntentAmount: number;
  // 被申请人意向金额
  accusedIntentAmount: number;
  // 和解金额
  mediationAmount: number;
  // 已确认事实
  confirmFact: string;
  // 调解协议（已达成调解协议或未达成原因）
  mediationAgreement: string;
  static names(): { [key: string]: string } {
    return {
      caseNumber: 'case_number',
      caseCode: 'case_code',
      causeActionName: 'cause_action_name',
      caseTatus: 'case_tatus',
      mediationPlatform: 'mediation_platform',
      mediationOrg: 'mediation_org',
      mediator: 'mediator',
      applyTime: 'apply_time',
      mediationResult: 'mediation_result',
      accuserIntentAmount: 'accuser_intent_amount',
      accusedIntentAmount: 'accused_intent_amount',
      mediationAmount: 'mediation_amount',
      confirmFact: 'confirm_fact',
      mediationAgreement: 'mediation_agreement',
    };
  }

  static types(): { [key: string]: any } {
    return {
      caseNumber: 'string',
      caseCode: 'string',
      causeActionName: 'string',
      caseTatus: 'string',
      mediationPlatform: 'string',
      mediationOrg: 'string',
      mediator: 'string',
      applyTime: 'number',
      mediationResult: 'string',
      accuserIntentAmount: 'number',
      accusedIntentAmount: 'number',
      mediationAmount: 'number',
      confirmFact: 'string',
      mediationAgreement: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 答辩人对象
export class PleaderObject extends $tea.Model {
  // 法人或自然人标识，法人为1，自然人为0
  partyType: number;
  // 自然人信息
  // 当partyType=1必填
  naturalPerson?: NaturalPerson;
  // 法人信息
  // 当partyType=0必填
  legalPerson?: LegalPerson;
  static names(): { [key: string]: string } {
    return {
      partyType: 'party_type',
      naturalPerson: 'natural_person',
      legalPerson: 'legal_person',
    };
  }

  static types(): { [key: string]: any } {
    return {
      partyType: 'number',
      naturalPerson: NaturalPerson,
      legalPerson: LegalPerson,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 电子合同存证签署信息
export class ContractNotarySignInfo extends $tea.Model {
  // 本阶段存证内容哈希值
  content: string;
  // 电子合同文件hash，可能一次性签署多个文件，不同文件的hash间用“,”分隔开
  contractHash: string;
  // 签署人ID
  signatory: string;
  // 存证阶段发生时间，UNIX时间戳(毫秒)
  timestamp: string;
  // 存证凭据，仅在批量核验时需要填写
  txHash?: string;
  // 发起人名称
  intiatorName?: string;
  // 签署人名称,多个逗号隔开
  signatorNames?: string;
  // 详细文件哈希
  detailInfoFileHash?: string;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      contractHash: 'contract_hash',
      signatory: 'signatory',
      timestamp: 'timestamp',
      txHash: 'tx_hash',
      intiatorName: 'intiator_name',
      signatorNames: 'signator_names',
      detailInfoFileHash: 'detail_info_file_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: 'string',
      contractHash: 'string',
      signatory: 'string',
      timestamp: 'string',
      txHash: 'string',
      intiatorName: 'string',
      signatorNames: 'string',
      detailInfoFileHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 存证信息说明
export class NotaryInfo extends $tea.Model {
  // 存证内容的哈希值，默认采用SHA256算法
  contentHash: string;
  // 合作人（版权存证函专用），会展示在存证证明中
  cooperation?: string;
  // 作品名称类型（版权存证函使用），会展示在存证证明中
  creationType?: string;
  // 如果是文件存证，可填写文件名称
  fileName?: string;
  // 计算content_hash的哈希算法，目前只支持SHA256
  hashAlgorithm?: string;
  // 申请平台名，用于在存证函上显示用名称
  platform?: string;
  // 文件容量，默认为0
  size?: number;
  // 发起存证成功后，返回的存证凭据
  txHash: string;
  // 存证事务ID
  transactionId: string;
  static names(): { [key: string]: string } {
    return {
      contentHash: 'content_hash',
      cooperation: 'cooperation',
      creationType: 'creation_type',
      fileName: 'file_name',
      hashAlgorithm: 'hash_algorithm',
      platform: 'platform',
      size: 'size',
      txHash: 'tx_hash',
      transactionId: 'transaction_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      contentHash: 'string',
      cooperation: 'string',
      creationType: 'string',
      fileName: 'string',
      hashAlgorithm: 'string',
      platform: 'string',
      size: 'number',
      txHash: 'string',
      transactionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 司法纠纷平台企业信息通用结构体
export class JudicialOrgInfo extends $tea.Model {
  // 企业名称
  orgName: string;
  // 企业或机构社会统一信用代码
  orgCertNum: string;
  // 企业联系电话
  orgPhone: string;
  // 企业联系邮箱
  orgEmail?: string;
  // 企业通讯地址
  orgAddress?: string;
  // 企业或机构营业执照信息
  orgBizLicenseInfo?: JudicialFileInfo;
  // 企业法人信息
  orgLegalPersonInfo?: JudicialPersonInfo;
  // 企业或机构签章管理员信息
  orgSignatureManagerPersonInfo?: JudicialPersonInfo;
  // 企业或机构收款银行账户信息
  orgBankInfo?: JudicialBankInfo;
  static names(): { [key: string]: string } {
    return {
      orgName: 'org_name',
      orgCertNum: 'org_cert_num',
      orgPhone: 'org_phone',
      orgEmail: 'org_email',
      orgAddress: 'org_address',
      orgBizLicenseInfo: 'org_biz_license_info',
      orgLegalPersonInfo: 'org_legal_person_info',
      orgSignatureManagerPersonInfo: 'org_signature_manager_person_info',
      orgBankInfo: 'org_bank_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orgName: 'string',
      orgCertNum: 'string',
      orgPhone: 'string',
      orgEmail: 'string',
      orgAddress: 'string',
      orgBizLicenseInfo: JudicialFileInfo,
      orgLegalPersonInfo: JudicialPersonInfo,
      orgSignatureManagerPersonInfo: JudicialPersonInfo,
      orgBankInfo: JudicialBankInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合同存证信息
export class ContractNotaryInfo extends $tea.Model {
  // 存证地址
  txHash: string;
  // 存证相关联的文档ID
  docId?: string;
  // 存证的内容哈希值
  contentHash?: string;
  // 存证事务ID
  transactionId: string;
  static names(): { [key: string]: string } {
    return {
      txHash: 'tx_hash',
      docId: 'doc_id',
      contentHash: 'content_hash',
      transactionId: 'transaction_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      txHash: 'string',
      docId: 'string',
      contentHash: 'string',
      transactionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 个人信息
export class PersonInfo extends $tea.Model {
  // 个人证件名称
  certName: string;
  // 个人证件号码
  certNo: string;
  // 证件类型, 默认身份证 RESIDENT：居民身份证号，PASSPORT：护照，MILITARY：军官证
  certType?: string;
  static names(): { [key: string]: string } {
    return {
      certName: 'cert_name',
      certNo: 'cert_no',
      certType: 'cert_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      certName: 'string',
      certNo: 'string',
      certType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 共享项目，资产端的采购平台回传的订单商品信息
export class SupplierOrderProductInfo extends $tea.Model {
  // 商品id
  productId: string;
  // 商品采购单价，单位：毫厘
  productPrice: number;
  // 商品的sn信息
  snList: string[];
  static names(): { [key: string]: string } {
    return {
      productId: 'product_id',
      productPrice: 'product_price',
      snList: 'sn_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      productId: 'string',
      productPrice: 'number',
      snList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 电子合同文档
export class ContractDoc extends $tea.Model {
  // 上传的电子合同文档是否被加密过，0-未被加密，1-被加密过，默认0
  encryption?: number;
  // 电子合同文档的ID
  fileId: string;
  // 电子合同文档名称，默认文件名称
  fileName?: string;
  // 电子合同文档密码, 如果encryption值为1, 文档密码不能为空，默认没有密码
  filePassword?: string;
  static names(): { [key: string]: string } {
    return {
      encryption: 'encryption',
      fileId: 'file_id',
      fileName: 'file_name',
      filePassword: 'file_password',
    };
  }

  static types(): { [key: string]: any } {
    return {
      encryption: 'number',
      fileId: 'string',
      fileName: 'string',
      filePassword: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合同印章
export class ContractSeal extends $tea.Model {
  // 印章别名
  alias?: string;
  // 印章创建时间
  createDate?: number;
  // 默认印章标识
  defaultFlag?: boolean;
  // 印章fileKey
  fileKey?: string;
  // 印章高度
  height?: number;
  // 印章宽度
  width?: number;
  // 印章id
  sealId?: string;
  // 印章类型，1-机构模板章，2-个人模板章，3-自定义印章，4-手绘章
  sealType?: number;
  // 印章下载地址, 有效时间1小时
  url?: string;
  // 印章业务类型，CANCELLATION-作废章，COMMON-其它
  sealBizType?: string;
  static names(): { [key: string]: string } {
    return {
      alias: 'alias',
      createDate: 'create_date',
      defaultFlag: 'default_flag',
      fileKey: 'file_key',
      height: 'height',
      width: 'width',
      sealId: 'seal_id',
      sealType: 'seal_type',
      url: 'url',
      sealBizType: 'seal_biz_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      alias: 'string',
      createDate: 'number',
      defaultFlag: 'boolean',
      fileKey: 'string',
      height: 'number',
      width: 'number',
      sealId: 'string',
      sealType: 'number',
      url: 'string',
      sealBizType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 智能合同个人账户创建申请信息
export class ContractAccountApplication extends $tea.Model {
  // 邮箱地址，默认空
  email?: string;
  // 证件号
  idNumber: string;
  // 目前仅支持CRED_PSN_CH_IDCARD，即身份证号码
  idType: string;
  // 手机号码，默认空
  mobile?: string;
  // 姓名
  name: string;
  // 用户唯一标识，可传入第三方平台的个人用户id等
  userId: string;
  static names(): { [key: string]: string } {
    return {
      email: 'email',
      idNumber: 'id_number',
      idType: 'id_type',
      mobile: 'mobile',
      name: 'name',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      email: 'string',
      idNumber: 'string',
      idType: 'string',
      mobile: 'string',
      name: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签署区列表数据
export class ContractPlatformSignFieldApplication extends $tea.Model {
  // 文件file id
  fileId: string;
  // 签署顺序，默认1,且不小于1，顺序越小越先处理
  order?: number;
  // 印章id， 仅限企业公章，暂不支持指定企业法定代表人印章 ，如不传，则采用账号下的默认印章
  sealId?: string;
  // 第三方业务流水号id，保证相同签署人、相同签约主体、相同签署顺序的任务，对应的第三方业务流水id唯一，默认空
  thirdOrderNo?: string;
  // 页码信息，当签署区signType为2时, 页码可以_-_分割, 其他情况只能是数字
  posPage: string;
  // x坐标，默认空
  posX?: string;
  // y坐标
  posY: string;
  // 签署区宽，默认印章宽度
  width?: string;
  // 是否添加签署时间戳， 默认不添加，默认格式 yyyy-MM-dd HH : mm : ss
  addSignTime?: boolean;
  // 签署类型， 1-单页签署，2-骑缝签署，默认1
  signType?: number;
  static names(): { [key: string]: string } {
    return {
      fileId: 'file_id',
      order: 'order',
      sealId: 'seal_id',
      thirdOrderNo: 'third_order_no',
      posPage: 'pos_page',
      posX: 'pos_x',
      posY: 'pos_y',
      width: 'width',
      addSignTime: 'add_sign_time',
      signType: 'sign_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fileId: 'string',
      order: 'number',
      sealId: 'string',
      thirdOrderNo: 'string',
      posPage: 'string',
      posX: 'string',
      posY: 'string',
      width: 'string',
      addSignTime: 'boolean',
      signType: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 租赁业务存证信息记录
export class LeaseNotaryRecord extends $tea.Model {
  // 存证阶段
  phase: string;
  // 交易哈希，存证记录唯一标识
  txHash: string;
  static names(): { [key: string]: string } {
    return {
      phase: 'phase',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      phase: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 证据要素
export class EvidentialElement extends $tea.Model {
  // 订单信息
  orderInfo: OrderInfo;
  // 承诺信息
  commitmentInfo: CommitmentInfo;
  // 物流信息
  logisticsInfo: LogisticsInfo;
  // 履约信息
  performanceInfo: PerformanceInfo;
  static names(): { [key: string]: string } {
    return {
      orderInfo: 'order_info',
      commitmentInfo: 'commitment_info',
      logisticsInfo: 'logistics_info',
      performanceInfo: 'performance_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderInfo: OrderInfo,
      commitmentInfo: CommitmentInfo,
      logisticsInfo: LogisticsInfo,
      performanceInfo: PerformanceInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 创建电子合同手动签署盖章区时的申请信息
export class ContractHandSignFieldApplication extends $tea.Model {
  // 签署操作人个人账号标识，即操作本次签署的个人
  accountId: string;
  // 电子合同文件ID
  fileId: string;
  // 签署区顺序，默认1,且不小于1，顺序越小越先处理
  order?: number;
  // 页码信息：当签署区signType为2时, 页码可以_-_分割, 例如1到15页，填"1-15"； 其他情况只能是数字；不指定xy坐标签署区可不填写
  posPage?: string;
  // x坐标，页面签章必填，骑缝签章不填写
  posX?: string;
  // y坐标
  posY?: string;
  // 印章id
  sealId?: string;
  // 是否需要添加签署日期，0-禁止 1-必须 ，默认0
  signDateBeanType?: number;
  // 签章日期字体大小,默认12
  signDateFontSize?: number;
  // 签章日期格式，yyyy年MM月dd日
  signDateFormat?: string;
  // 页码信息，当signDateBeanType为1时，代表签署的印章必须展示签署日期，默认放在印章正下方，签署人可拖拽日期到当前页面的其他位置，如果发起方指定签署位置的同时，需要同时指定日期盖章位置，则需传入日期盖章页码（与印章页码相同），在传入X\Y坐标即可。
  signDatePosPage?: number;
  // 签章日期x坐标，默认0	
  signDatePosX?: string;
  // 签章日期y坐标，默认0
  signDatePosY?: string;
  // 签署类型，1-单页签署，2-骑缝签署，默认1
  signType?: number;
  // 第三方业务流水号id，保证相同签署人、相同签约主体、相同签署顺序的任务，对应的第三方业务流水id唯一，默认空
  thirdOrderNo?: string;
  // 签署区宽，默认印章宽度
  width?: string;
  // 印章ids，只支持企业用户进行印章ID列表的设置；用于手动签署时，指定企业印章进行展示，实现手动选择印章进行签署。
  sealIds?: string[];
  // 签署区预设xy坐标类型，0：不指定X/Y坐标 1：指定X/Y坐标 默认：指定X/Y坐标 ; 签署区设置时可以不指定XY坐标，签署方在签署时拖拽确定最终签署区域，支持在页面任何区域拖拽，个人和企业签署用印都支持
  signFieldType?: number;
  static names(): { [key: string]: string } {
    return {
      accountId: 'account_id',
      fileId: 'file_id',
      order: 'order',
      posPage: 'pos_page',
      posX: 'pos_x',
      posY: 'pos_y',
      sealId: 'seal_id',
      signDateBeanType: 'sign_date_bean_type',
      signDateFontSize: 'sign_date_font_size',
      signDateFormat: 'sign_date_format',
      signDatePosPage: 'sign_date_pos_page',
      signDatePosX: 'sign_date_pos_x',
      signDatePosY: 'sign_date_pos_y',
      signType: 'sign_type',
      thirdOrderNo: 'third_order_no',
      width: 'width',
      sealIds: 'seal_ids',
      signFieldType: 'sign_field_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accountId: 'string',
      fileId: 'string',
      order: 'number',
      posPage: 'string',
      posX: 'string',
      posY: 'string',
      sealId: 'string',
      signDateBeanType: 'number',
      signDateFontSize: 'number',
      signDateFormat: 'string',
      signDatePosPage: 'number',
      signDatePosX: 'string',
      signDatePosY: 'string',
      signType: 'number',
      thirdOrderNo: 'string',
      width: 'string',
      sealIds: { 'type': 'array', 'itemType': 'string' },
      signFieldType: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 再融资订单信息
export class RefinanceOrderInfoResponse extends $tea.Model {
  // 订单id
  orderId: string;
  // 合约id
  applicationId: string;
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      applicationId: 'application_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      applicationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 供应商对应的产品详细信息
export class SupplierProductInfo extends $tea.Model {
  // 产品额外信息
  extraInfo?: string;
  // 产品id
  productId: string;
  // 电子商品唯一标识码
  productImeiId: string;
  // 产品名称
  productName: string;
  // 采购产品的个数
  productNumber: number;
  // 采购产品的价格，精确到毫厘，如12.34元表示为123400
  productPrice: number;
  // 产品版本
  supplierVersion?: string;
  static names(): { [key: string]: string } {
    return {
      extraInfo: 'extra_info',
      productId: 'product_id',
      productImeiId: 'product_imei_id',
      productName: 'product_name',
      productNumber: 'product_number',
      productPrice: 'product_price',
      supplierVersion: 'supplier_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      extraInfo: 'string',
      productId: 'string',
      productImeiId: 'string',
      productName: 'string',
      productNumber: 'number',
      productPrice: 'number',
      supplierVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单商品
export class LeaseOrderProductInfo extends $tea.Model {
  // 商品编码 长度不可超过50
  productId: string;
  // 产品版本，每个版本可以对应一个价格 长度不可超过50，版本号未正整数，示例"123"
  productVersion: string;
  // 商品名称 长度不可超过50
  productName: string;
  // 采购价  精确到毫厘，即123400表示12.34元
  productPrice: number;
  // 供应商Id，用以做索引 长度不可超过50
  supplierIsvAccount: string;
  static names(): { [key: string]: string } {
    return {
      productId: 'product_id',
      productVersion: 'product_version',
      productName: 'product_name',
      productPrice: 'product_price',
      supplierIsvAccount: 'supplier_isv_account',
    };
  }

  static types(): { [key: string]: any } {
    return {
      productId: 'string',
      productVersion: 'string',
      productName: 'string',
      productPrice: 'number',
      supplierIsvAccount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数字票根一键全流程存证相关参数
export class OnestepFlowNotaryInfo extends $tea.Model {
  // 全流程模板id，需要提前创建好模板才能获取
  templateId: string;
  // 流程名称，同一个租户下同一个模板，建议唯一不重复
  flowName: string;
  // 存证关联实体（个人/企业）的身份识别信息
  notaryUser: NotaryUser;
  // 阶段存证内容列表，根据模板定义传入
  phaseNotaryList: PhaseNotary[];
  // 扩展属性
  properties?: string;
  static names(): { [key: string]: string } {
    return {
      templateId: 'template_id',
      flowName: 'flow_name',
      notaryUser: 'notary_user',
      phaseNotaryList: 'phase_notary_list',
      properties: 'properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      templateId: 'string',
      flowName: 'string',
      notaryUser: NotaryUser,
      phaseNotaryList: { 'type': 'array', 'itemType': PhaseNotary },
      properties: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 更新后平台方经办人信息
export class ContractCreatorApplication extends $tea.Model {
  // 邮箱地址
  email?: string;
  // 证件号
  idNumber: string;
  // 证件类型
  idType: string;
  // 手机号码
  mobile?: string;
  // 姓名
  name: string;
  // 创建人ID
  creatorId: string;
  static names(): { [key: string]: string } {
    return {
      email: 'email',
      idNumber: 'id_number',
      idType: 'id_type',
      mobile: 'mobile',
      name: 'name',
      creatorId: 'creator_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      email: 'string',
      idNumber: 'string',
      idType: 'string',
      mobile: 'string',
      name: 'string',
      creatorId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 融资租赁里的产品详细信息
export class ProductInfo extends $tea.Model {
  // 是否需要创建did
  needDid?: boolean;
  // 产品品牌，长度不超过50
  productBrand?: string;
  // 产品Id，长度不超过50
  productId: string;
  // 唯一标识码，imeiID，长度不超过50
  productImeiId?: string;
  // 产品规格型号，长度不超过255
  productModel?: string;
  // 产品名称，长度不超过50
  productName: string;
  // 产品数量
  productNumber: number;
  // 产品采购含税价 精确到毫厘，即123400表示12.34元
  productPrice: number;
  // 供应商id
  supplierId?: string;
  // 供应商对应的产品版本，每个版本可以对应一个价格
  supplierVersion?: string;
  // 额外字段
  extraInfo?: string;
  static names(): { [key: string]: string } {
    return {
      needDid: 'need_did',
      productBrand: 'product_brand',
      productId: 'product_id',
      productImeiId: 'product_imei_id',
      productModel: 'product_model',
      productName: 'product_name',
      productNumber: 'product_number',
      productPrice: 'product_price',
      supplierId: 'supplier_id',
      supplierVersion: 'supplier_version',
      extraInfo: 'extra_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      needDid: 'boolean',
      productBrand: 'string',
      productId: 'string',
      productImeiId: 'string',
      productModel: 'string',
      productName: 'string',
      productNumber: 'number',
      productPrice: 'number',
      supplierId: 'string',
      supplierVersion: 'string',
      extraInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 支付扣款详情
export class PaymentDetail extends $tea.Model {
  // 业务自定义扣款id，长度不能超过64
  bizTradeId: string;
  // 扣款期数
  period: number;
  // 支付金额，单位：分
  payMoney: number;
  // 计划扣款时间，格式"yyyy-MM-dd HH:mm:ss"
  payDate: string;
  static names(): { [key: string]: string } {
    return {
      bizTradeId: 'biz_trade_id',
      period: 'period',
      payMoney: 'pay_money',
      payDate: 'pay_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizTradeId: 'string',
      period: 'number',
      payMoney: 'number',
      payDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 电子合同代扣计划取消操作信息
export class ContractNotaryDeductCancelInfo extends $tea.Model {
  // 付款方的区块链合同签署账号
  payerId: string;
  // 是否取消成功
  cancelStatus: boolean;
  // 取消操作发起时间
  timestamp: string;
  // 代扣订单号，多个订单号之间以‘,’隔开
  orders: string;
  static names(): { [key: string]: string } {
    return {
      payerId: 'payer_id',
      cancelStatus: 'cancel_status',
      timestamp: 'timestamp',
      orders: 'orders',
    };
  }

  static types(): { [key: string]: any } {
    return {
      payerId: 'string',
      cancelStatus: 'boolean',
      timestamp: 'string',
      orders: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 平台方经办人信息
export class ContractPlatformAccountApplication extends $tea.Model {
  // 邮箱地址
  email?: string;
  // 证件号
  idNumber: string;
  // 证件类型
  idType: string;
  // 手机号码
  mobile?: string;
  // 姓名
  name: string;
  // 用户唯一标识，可传入第三方平台的个人用户id等
  userId: string;
  static names(): { [key: string]: string } {
    return {
      email: 'email',
      idNumber: 'id_number',
      idType: 'id_type',
      mobile: 'mobile',
      name: 'name',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      email: 'string',
      idNumber: 'string',
      idType: 'string',
      mobile: 'string',
      name: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 更新后平台方企业信息
export class ContractPlatformApplication extends $tea.Model {
  // 证件号
  idNumber: string;
  // 证件类型
  idType: string;
  // 企业法人名称
  orgLegalName?: string;
  // 企业法人证件号
  orgLegalIdNumber?: string;
  // 机构名称
  name: string;
  // 平台方账号id
  platformId: string;
  static names(): { [key: string]: string } {
    return {
      idNumber: 'id_number',
      idType: 'id_type',
      orgLegalName: 'org_legal_name',
      orgLegalIdNumber: 'org_legal_id_number',
      name: 'name',
      platformId: 'platform_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      idNumber: 'string',
      idType: 'string',
      orgLegalName: 'string',
      orgLegalIdNumber: 'string',
      name: 'string',
      platformId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 融资租赁用户侧还款条目
export class LeaseRentalInfo extends $tea.Model {
  // 租期编号
  term: number;
  // 租金归还状态，1.足额归还2.部分归还3.未归还
  rentalReturnState: number;
  // 租金归还金额,精确到毫厘，即123400表示12.34元
  rentalMoney: number;
  // 归还时间
  returnTime: string;
  // 归还方式，1.预授权代扣2.支付宝代扣3.主动还款4.其他，5网商直付通代扣
  returnWay: number;
  // 还款凭证类型，1.支付宝2.平台代收（客户主动还款）3.其他
  returnVoucherType: number;
  // 还款凭证编号，不超过128字符，支付宝流水号
  returnVoucherSerial: string;
  // 剩余归还期数
  remainTerm: number;
  static names(): { [key: string]: string } {
    return {
      term: 'term',
      rentalReturnState: 'rental_return_state',
      rentalMoney: 'rental_money',
      returnTime: 'return_time',
      returnWay: 'return_way',
      returnVoucherType: 'return_voucher_type',
      returnVoucherSerial: 'return_voucher_serial',
      remainTerm: 'remain_term',
    };
  }

  static types(): { [key: string]: any } {
    return {
      term: 'number',
      rentalReturnState: 'number',
      rentalMoney: 'number',
      returnTime: 'string',
      returnWay: 'number',
      returnVoucherType: 'number',
      returnVoucherSerial: 'string',
      remainTerm: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 核验结果
export class NotaryCheckResult extends $tea.Model {
  // 存证所在区块高度
  blockHeight: number;
  // 核验结果错误码
  errorCode: number;
  // 错误信息
  errorMessage: string;
  // 存证时间
  notaryTime: string;
  // 存证类型
  notaryType: string;
  // 核验是否成功
  result: boolean;
  // 存证事务ID
  transactionId: string;
  // 交易哈希
  txHash: string;
  // 区块哈希
  blockHash: string;
  // 存证阶段
  phase: string;
  static names(): { [key: string]: string } {
    return {
      blockHeight: 'block_height',
      errorCode: 'error_code',
      errorMessage: 'error_message',
      notaryTime: 'notary_time',
      notaryType: 'notary_type',
      result: 'result',
      transactionId: 'transaction_id',
      txHash: 'tx_hash',
      blockHash: 'block_hash',
      phase: 'phase',
    };
  }

  static types(): { [key: string]: any } {
    return {
      blockHeight: 'number',
      errorCode: 'number',
      errorMessage: 'string',
      notaryTime: 'string',
      notaryType: 'string',
      result: 'boolean',
      transactionId: 'string',
      txHash: 'string',
      blockHash: 'string',
      phase: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 融资租赁资金方还款条目信息
export class LeaseRepaymentInfo extends $tea.Model {
  // 融资租赁还款流水
  repaymentUniqueId: string;
  // 还款批次
  returnIndex: string;
  // 还款日期
  returnTime: string;
  // 还款总额,本金+利息，精确到毫厘，即123400表示12.34元
  returnMoney: number;
  // 还款结果状态,1.成功 2.失败
  returnStatus: number;
  // 还款结果简要描述,长度不超过256
  returnDescription: string;
  // 还款来源,1.共管账号，2.网商清分
  source: number;
  // 剩余应还期数
  remainReturnTerm: number;
  // 本期剩余应还金额，精确到毫厘，即123400表示12.34元
  remainReturnMoney: number;
  // 逾期状态,0为未逾期，1表示逾期
  overdueStatus: number;
  // 逾期利率（日利率）,精确到小数点后四位 12.34% 表示为1234
  overdueRate: number;
  // 逾期天数,支用到期日开始计算
  overdueDay: number;
  // 逾期应还款总额,本金+利息+逾期利息,精确到毫厘，即123400表示12.34元
  overdueMoney: number;
  static names(): { [key: string]: string } {
    return {
      repaymentUniqueId: 'repayment_unique_id',
      returnIndex: 'return_index',
      returnTime: 'return_time',
      returnMoney: 'return_money',
      returnStatus: 'return_status',
      returnDescription: 'return_description',
      source: 'source',
      remainReturnTerm: 'remain_return_term',
      remainReturnMoney: 'remain_return_money',
      overdueStatus: 'overdue_status',
      overdueRate: 'overdue_rate',
      overdueDay: 'overdue_day',
      overdueMoney: 'overdue_money',
    };
  }

  static types(): { [key: string]: any } {
    return {
      repaymentUniqueId: 'string',
      returnIndex: 'string',
      returnTime: 'string',
      returnMoney: 'number',
      returnStatus: 'number',
      returnDescription: 'string',
      source: 'number',
      remainReturnTerm: 'number',
      remainReturnMoney: 'number',
      overdueStatus: 'number',
      overdueRate: 'number',
      overdueDay: 'number',
      overdueMoney: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数字票根扩展字段
export class StubExtraInfo extends $tea.Model {
  // 票面视觉
  ticketVision?: string;
  static names(): { [key: string]: string } {
    return {
      ticketVision: 'ticket_vision',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ticketVision: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 文本签信息, 包含证书与签名
export class ContractTextSignVerifySignInfo extends $tea.Model {
  // 签名信息
  signature?: ContractTextSignVerifySignatureInfo;
  // 证书信息
  cert?: ContractTextSignVerifyCertInfo;
  static names(): { [key: string]: string } {
    return {
      signature: 'signature',
      cert: 'cert',
    };
  }

  static types(): { [key: string]: any } {
    return {
      signature: ContractTextSignVerifySignatureInfo,
      cert: ContractTextSignVerifyCertInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户端承诺信息
export class LeasePromiseInfo extends $tea.Model {
  // 租期index
  term: number;
  // 应还款金额
  payMoney: number;
  // 应还款时间
  payDate: string;
  static names(): { [key: string]: string } {
    return {
      term: 'term',
      payMoney: 'pay_money',
      payDate: 'pay_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      term: 'number',
      payMoney: 'number',
      payDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 个人信息
export class ContractUserAccountApplication extends $tea.Model {
  // 邮箱地址，默认不变
  email?: string;
  // 证件号，该字段只有为空才允许修改
  idNumber?: string;
  // 证件类型，默认为身份证
  idType?: string;
  // 手机号码，默认不变
  mobile?: string;
  // 姓名，默认不变
  name?: string;
  // 用户/经办人账号id
  userId: string;
  static names(): { [key: string]: string } {
    return {
      email: 'email',
      idNumber: 'id_number',
      idType: 'id_type',
      mobile: 'mobile',
      name: 'name',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      email: 'string',
      idNumber: 'string',
      idType: 'string',
      mobile: 'string',
      name: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合约核验结果
export class ContractCheckResult extends $tea.Model {
  // 交易hash
  txHash: string;
  // 订单id
  orderId: string;
  // 合约执行结果，Base64编码后的
  contentBase64?: string;
  // 块高
  blockNumber?: number;
  // 消耗gas量
  gasUsed?: number;
  // log信息
  logBase64?: string;
  static names(): { [key: string]: string } {
    return {
      txHash: 'tx_hash',
      orderId: 'order_id',
      contentBase64: 'content_base64',
      blockNumber: 'block_number',
      gasUsed: 'gas_used',
      logBase64: 'log_base64',
    };
  }

  static types(): { [key: string]: any } {
    return {
      txHash: 'string',
      orderId: 'string',
      contentBase64: 'string',
      blockNumber: 'number',
      gasUsed: 'number',
      logBase64: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业信息
export class CompanyTwoMetaInfo extends $tea.Model {
  // 企业证件名称
  certName: string;
  // 企业证件号码
  certNo: string;
  // 证件类型, 默认社会统一信用代码  NATIONAL_LEGAL_MERGE:统一社会信用代码，NATIONAL_LEGAL：营业执照号码
  certType?: string;
  static names(): { [key: string]: string } {
    return {
      certName: 'cert_name',
      certNo: 'cert_no',
      certType: 'cert_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      certName: 'string',
      certNo: 'string',
      certType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签字人
export class ContractFlowSigner extends $tea.Model {
  // 签署顺序
  signOrder?: number;
  // 签署状态, 0-待签, 1-未签, 2-已签 3-待审批 4-拒签
  signStatus?: number;
  // 签署人账号id
  signerAccountId?: string;
  // 签署人名称
  signerName?: string;
  // 签署人是否已实名
  signerRealName?: boolean;
  // 签约主体的账号id（个人/企业）；如签署人本签署，则返回签署人账号id；如签署人代机构签署，则返回机构账号id
  signerAuthorizedAccountId?: string;
  // 签约主体名称
  signerAuthorizedAccountName?: string;
  // 签署主体是否已实名
  signerAuthorizedAccountRealName?: boolean;
  // 签署主体类型, 0-个人, 1-机构
  signerAuthorizedAccountType?: number;
  // 本次签署任务对应指定的第三方业务流水号id，当存在多个第三方业务流水号id时，返回多个，并逗号隔开
  thirdOrderNo?: string;
  static names(): { [key: string]: string } {
    return {
      signOrder: 'sign_order',
      signStatus: 'sign_status',
      signerAccountId: 'signer_account_id',
      signerName: 'signer_name',
      signerRealName: 'signer_real_name',
      signerAuthorizedAccountId: 'signer_authorized_account_id',
      signerAuthorizedAccountName: 'signer_authorized_account_name',
      signerAuthorizedAccountRealName: 'signer_authorized_account_real_name',
      signerAuthorizedAccountType: 'signer_authorized_account_type',
      thirdOrderNo: 'third_order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      signOrder: 'number',
      signStatus: 'number',
      signerAccountId: 'string',
      signerName: 'string',
      signerRealName: 'boolean',
      signerAuthorizedAccountId: 'string',
      signerAuthorizedAccountName: 'string',
      signerAuthorizedAccountRealName: 'boolean',
      signerAuthorizedAccountType: 'number',
      thirdOrderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 普通代扣规则
export class RepaymentOrderRequest extends $tea.Model {
  // 代扣触发时间，精确到毫秒
  // java.lang.System#currentTimeMillis()
  payDate: number;
  // 代扣金额，整数 精确到分
  payMoney: number;
  // 是否用户签署成功后立即触发第一期代扣
  triggerImmediately?: number;
  static names(): { [key: string]: string } {
    return {
      payDate: 'pay_date',
      payMoney: 'pay_money',
      triggerImmediately: 'trigger_immediately',
    };
  }

  static types(): { [key: string]: any } {
    return {
      payDate: 'number',
      payMoney: 'number',
      triggerImmediately: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 一步创建签署流程的签署区信息
export class OneStepSignField extends $tea.Model {
  // 签署操作人个人账号标识，即操作本次签署的个人
  accountId: string;
  // 电子合同文件ID
  fileId: string;
  // 签署区顺序，默认1,且不小于1，顺序越小越先处理
  order?: number;
  // 页码信息：当签署区signType为2时, 页码可以_-_分割, 例如1到15页，填"1-15"； 其他情况只能是数字；不指定xy坐标签署区可不填写
  posPage?: string;
  // x坐标
  posX?: string;
  // y坐标
  posY?: string;
  // 印章id
  sealId?: string;
  // 是否需要添加签署日期，0-禁止 1-必须 2-不限制，默认0
  signDateBeanType?: number;
  // 签章日期字体大小,默认12
  signDateFontSize?: number;
  // 签章日期格式，yyyy年MM月dd日
  signDateFormat?: string;
  // 页码信息，当signDateBeanType为1时，代表签署的印章必须展示签署日期，默认放在印章正下方，签署人可拖拽日期到当前页面的其他位置，如果发起方指定签署位置的同时，需要同时指定日期盖章位置，则需传入日期盖章页码（与印章页码相同），在传入X\Y坐标即可。
  signDatePosPage?: number;
  // 签章日期x坐标，默认0
  signDatePosX?: string;
  // 签章日期y坐标，默认0
  signDatePosY?: string;
  // 签署类型，1-单页签署，2-骑缝签署，默认1
  signType?: number;
  // 第三方业务流水号id，保证相同签署人、相同签约主体、相同签署顺序的任务，对应的第三方业务流水id唯一，默认空
  thirdOrderNo?: string;
  // 签署区宽，默认印章宽度
  width?: string;
  // 是否自动执行签署，默认false，false-手动签署，true-自动签署
  autoExecute?: boolean;
  static names(): { [key: string]: string } {
    return {
      accountId: 'account_id',
      fileId: 'file_id',
      order: 'order',
      posPage: 'pos_page',
      posX: 'pos_x',
      posY: 'pos_y',
      sealId: 'seal_id',
      signDateBeanType: 'sign_date_bean_type',
      signDateFontSize: 'sign_date_font_size',
      signDateFormat: 'sign_date_format',
      signDatePosPage: 'sign_date_pos_page',
      signDatePosX: 'sign_date_pos_x',
      signDatePosY: 'sign_date_pos_y',
      signType: 'sign_type',
      thirdOrderNo: 'third_order_no',
      width: 'width',
      autoExecute: 'auto_execute',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accountId: 'string',
      fileId: 'string',
      order: 'number',
      posPage: 'string',
      posX: 'string',
      posY: 'string',
      sealId: 'string',
      signDateBeanType: 'number',
      signDateFontSize: 'number',
      signDateFormat: 'string',
      signDatePosPage: 'number',
      signDatePosX: 'string',
      signDatePosY: 'string',
      signType: 'number',
      thirdOrderNo: 'string',
      width: 'string',
      autoExecute: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 电子合同存证初始化信息
export class ContractNotaryInitInfo extends $tea.Model {
  // 本阶段存证内容哈希值
  content: string;
  // 签署文件份数
  fileNum: number;
  // 签署流程发起人ID
  initiator: string;
  // 签署人ID（支持多个，不同ID间用“,”分隔开），由于流程中签署人可后续追加，最终以ContractNotaryFinishInfo中的singatories信息为准。
  signatories?: string;
  // 存证阶段发生时间，UNIX时间戳(毫秒)
  timestamp: string;
  // 存证凭据，仅在批量核验时需要填写
  txHash?: string;
  // 发起人名称
  intiatorName?: string;
  // 签署人名称,多个逗号隔开
  signatorNames?: string;
  // 详细文件哈希
  detailInfoFileHash?: string;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      fileNum: 'file_num',
      initiator: 'initiator',
      signatories: 'signatories',
      timestamp: 'timestamp',
      txHash: 'tx_hash',
      intiatorName: 'intiator_name',
      signatorNames: 'signator_names',
      detailInfoFileHash: 'detail_info_file_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: 'string',
      fileNum: 'number',
      initiator: 'string',
      signatories: 'string',
      timestamp: 'string',
      txHash: 'string',
      intiatorName: 'string',
      signatorNames: 'string',
      detailInfoFileHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 可信存证身份识别信息
export class Identity extends $tea.Model {
  // 经办人姓名，企业认证选填
  agent?: string;
  // 经办人身份证，企业认证选填
  agentId?: string;
  // 用户名称
  certName: string;
  // 证件号
  certNo: string;
  // 证件类型，个人只支持身份证IDENTITY_CARD，企业支持UNIFIED_SOCIAL_CREDIT_CODE（统一社会信用代码）和ENTERPRISE_REGISTERED_NUMBER（企业工商注册号）
  certType: string;
  // 法人姓名，企业认证必选
  legalPerson?: string;
  // 法人身份证，企业认证必选
  legalPersonId?: string;
  // 用户手机号码
  mobileNo?: string;
  // 扩展属性
  properties?: string;
  // 用户类型，PERSON或者ENTERPRISE
  userType: string;
  // 经办人证件类型，企业认证选填
  agentCertType?: string;
  // 法人证件类型，企业认证必选
  legalPersonCertType?: string;
  static names(): { [key: string]: string } {
    return {
      agent: 'agent',
      agentId: 'agent_id',
      certName: 'cert_name',
      certNo: 'cert_no',
      certType: 'cert_type',
      legalPerson: 'legal_person',
      legalPersonId: 'legal_person_id',
      mobileNo: 'mobile_no',
      properties: 'properties',
      userType: 'user_type',
      agentCertType: 'agent_cert_type',
      legalPersonCertType: 'legal_person_cert_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      agent: 'string',
      agentId: 'string',
      certName: 'string',
      certNo: 'string',
      certType: 'string',
      legalPerson: 'string',
      legalPersonId: 'string',
      mobileNo: 'string',
      properties: 'string',
      userType: 'string',
      agentCertType: 'string',
      legalPersonCertType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 存证证明的证书信息
export class CertificateInfo extends $tea.Model {
  // 存证证明的证书内容的SHA256哈希值
  hash: string;
  // 存证证明的证书文件名
  resourceName: string;
  // 存证证明的证书下载地址
  resourceUrl: string;
  static names(): { [key: string]: string } {
    return {
      hash: 'hash',
      resourceName: 'resource_name',
      resourceUrl: 'resource_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      hash: 'string',
      resourceName: 'string',
      resourceUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 采购订单信息
export class ApplySupplierOrderProductOutput extends $tea.Model {
  // 订单id
  orderId: string;
  // 链上采购单id
  purOrderId: string;
  // 待采购：READY_DELIVER
  // 已采购：DELIVERED
  // 已拒发：REJECTED
  // 已退货：RETURNED
  // 已取消：CANCELED
  purOrderStatus: string;
  // 供应商id
  supplierId?: string;
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      purOrderId: 'pur_order_id',
      purOrderStatus: 'pur_order_status',
      supplierId: 'supplier_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      purOrderId: 'string',
      purOrderStatus: 'string',
      supplierId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 平台方企业信息
export class ContractPlatformOrganizationApplication extends $tea.Model {
  // 证件号
  idNumber: string;
  // 证件类型
  idType: string;
  // 企业法人名称
  orgLegalName?: string;
  // 企业法人证件号
  orgLegalIdNumber?: string;
  // 机构名称
  name: string;
  static names(): { [key: string]: string } {
    return {
      idNumber: 'id_number',
      idType: 'id_type',
      orgLegalName: 'org_legal_name',
      orgLegalIdNumber: 'org_legal_id_number',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      idNumber: 'string',
      idType: 'string',
      orgLegalName: 'string',
      orgLegalIdNumber: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签署区列表包含印章id数据
export class ContractSignFieldSealId extends $tea.Model {
  // 文件file id
  fileId?: string;
  // 流程id
  flowId?: string;
  // 印章id
  sealId?: string;
  // 印章类型，支持多种类型时逗号分割，0-手绘印章，1-模版印章，为空不限制
  sealType?: string;
  // 签署区Id
  signfieldId?: string;
  static names(): { [key: string]: string } {
    return {
      fileId: 'file_id',
      flowId: 'flow_id',
      sealId: 'seal_id',
      sealType: 'seal_type',
      signfieldId: 'signfield_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fileId: 'string',
      flowId: 'string',
      sealId: 'string',
      sealType: 'string',
      signfieldId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 文件模板中的输入项组件
export class ContractTemplateStructComponent extends $tea.Model {
  // 填充字体,默认1，1-宋体，2-新宋体,4-黑体，5-楷体
  font?: number;
  // 填充字体大小,默认12
  fontSize?: string;
  // 输入项组件高度
  height?: string;
  // 输入项组件id，使用时可用id填充，为空时表示添加，不为空时表示修改
  id?: string;
  // 模板下输入项组件唯一标识，使用模板时也可用根据key值填充
  key?: string;
  // 输入项组件显示名称
  label?: string;
  // 输入项组件type=2,type=3时填充格式校验规则;数字格式如：#,#00.0# 日期格式如： yyyy-MM-dd
  limit?: string;
  // 页码
  page?: number;
  // 是否必填，默认true
  required?: boolean;
  // 字体颜色，默认#000000黑色
  textColor?: string;
  // 输入项组件类型，1-文本，2-数字,3-日期，6-签约区
  type?: number;
  // 输入项组件宽度
  width?: string;
  // x轴坐标，左下角为原点
  x?: string;
  // y轴坐标，左下角为原点
  y?: string;
  static names(): { [key: string]: string } {
    return {
      font: 'font',
      fontSize: 'font_size',
      height: 'height',
      id: 'id',
      key: 'key',
      label: 'label',
      limit: 'limit',
      page: 'page',
      required: 'required',
      textColor: 'text_color',
      type: 'type',
      width: 'width',
      x: 'x',
      y: 'y',
    };
  }

  static types(): { [key: string]: any } {
    return {
      font: 'number',
      fontSize: 'string',
      height: 'string',
      id: 'string',
      key: 'string',
      label: 'string',
      limit: 'string',
      page: 'number',
      required: 'boolean',
      textColor: 'string',
      type: 'number',
      width: 'string',
      x: 'string',
      y: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 可信时间信息结构
export class TsrResponse extends $tea.Model {
  // 可信时间请求结果状态吗
  code: string;
  // hash后的信息
  hashedMessage: string;
  // 哈希算法
  hashAlgorithm: string;
  // 请求失败时候的错误信息
  message?: string;
  // 时间
  ts: string;
  // 精简后的时间戳完整编码（在校验时需要提交）
  ctsr: string;
  // 凭证序列号 （在校验的时需要先填写凭证编号）
  // 
  sn: string;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      hashedMessage: 'hashed_message',
      hashAlgorithm: 'hash_algorithm',
      message: 'message',
      ts: 'ts',
      ctsr: 'ctsr',
      sn: 'sn',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      hashedMessage: 'string',
      hashAlgorithm: 'string',
      message: 'string',
      ts: 'string',
      ctsr: 'string',
      sn: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 融资租赁中IOT设备详情
export class LeaseIotItemInfo extends $tea.Model {
  // 证据的时间
  date: string;
  // 证据的txHash
  txHash: string;
  // 证据的原始数据，默认为空或加密状态，除非调用方为授权用户（如出资方等
  rawData: string;
  static names(): { [key: string]: string } {
    return {
      date: 'date',
      txHash: 'tx_hash',
      rawData: 'raw_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      date: 'string',
      txHash: 'string',
      rawData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 见证流程文档确认数据
export class WitnessConfirmData extends $tea.Model {
  // 文档fileKey
  docFileKey?: string;
  // 文档摘要算法，SHA256
  hashAlgorithm: string;
  // 签署后文档摘要值
  signedHash: string;
  // 第三方文档id
  thirdDocId: string;
  static names(): { [key: string]: string } {
    return {
      docFileKey: 'doc_file_key',
      hashAlgorithm: 'hash_algorithm',
      signedHash: 'signed_hash',
      thirdDocId: 'third_doc_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      docFileKey: 'string',
      hashAlgorithm: 'string',
      signedHash: 'string',
      thirdDocId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 智能合同个人账号信息
export class ContractAccount extends $tea.Model {
  static names(): { [key: string]: string } {
    return {
    };
  }

  static types(): { [key: string]: any } {
    return {
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 司法调解基础参数
export class JudicialMediationBaseParamInfo extends $tea.Model {
  // 委托调解时长(天), 仅支持:30,60,90
  mediationDayLimit: number;
  // 调解总标的金额
  mediationTotalAmount: string;
  // 可接受最低调解回款金额
  minAmount: string;
  static names(): { [key: string]: string } {
    return {
      mediationDayLimit: 'mediation_day_limit',
      mediationTotalAmount: 'mediation_total_amount',
      minAmount: 'min_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      mediationDayLimit: 'number',
      mediationTotalAmount: 'string',
      minAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackArbitrationStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 案件文书号
  acceptanceNumber?: string;
  // 案件编号
  caseNo: string;
  // 确认时间时间戳
  confirmTime?: number;
  // 预处理案号
  preacceptanceNumber?: string;
  // 发送时间时间戳
  sendTime?: number;
  // 案件状态
  status: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      acceptanceNumber: 'acceptance_number',
      caseNo: 'case_no',
      confirmTime: 'confirm_time',
      preacceptanceNumber: 'preacceptance_number',
      sendTime: 'send_time',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      acceptanceNumber: 'string',
      caseNo: 'string',
      confirmTime: 'number',
      preacceptanceNumber: 'string',
      sendTime: 'number',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackArbitrationStatusResponse extends $tea.Model {
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

export class CallbackArbitrationSignstatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 案件号
  caseNo: string;
  // 签署文件代码 01 申请书 04 撤案申请书
  docCode: string;
  // 处理结果码 10000成功 其余都是签署失败
  resCode: string;
  // 失败原因
  message: string;
  // 发送时间 yyyy-MM-dd
  sendTime: string;
  // 签名,采用公钥验签
  signature: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      caseNo: 'case_no',
      docCode: 'doc_code',
      resCode: 'res_code',
      message: 'message',
      sendTime: 'send_time',
      signature: 'signature',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      caseNo: 'string',
      docCode: 'string',
      resCode: 'string',
      message: 'string',
      sendTime: 'string',
      signature: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackArbitrationSignstatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否处理回调成功 true成功
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

export class CreateContractAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 邮箱地址，默认空	
  email?: string;
  // 证件号
  idNumber: string;
  // 证件类型，默认CRED_PSN_CH_IDCARD，详见个人证件类型说明文档（https://tech.antfin.com/docs/2/155166）
  idType: string;
  // 手机号码，默认空
  mobile?: string;
  // 姓名
  name: string;
  // 用户唯一标识，可传入第三方平台的个人用户id、证件号、手机号、邮箱等，如果设置则作为账号唯一性字段，相同信息不可重复创建。（个人用户与机构的唯一标识不可重复）
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      email: 'email',
      idNumber: 'id_number',
      idType: 'id_type',
      mobile: 'mobile',
      name: 'name',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      email: 'string',
      idNumber: 'string',
      idType: 'string',
      mobile: 'string',
      name: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractAccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 个人账号ID
  accountId?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accountId: 'account_id',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accountId: 'string',
      code: 'number',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractAccountsealRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 电子合同用户ID（在twc.notary.contract.account.create接口中创建）
  accountId: string;
  // 印章别名
  alias?: string;
  // 印章颜色，RED-红色， BLUE-蓝色，BLACK-黑色
  color: string;
  // 印章高度, 默认95px
  height?: number;
  // 印章宽度, 默认95px
  width?: number;
  // 模板类型, 详见个人印章样式说明 SQUARE, BORDERLESS, FZKC, HWLS, HWXK, HWXKBORDER, HYLSF, RECTANGLE, YGYJFCS, YGYMBXS, YYGXSF
  type: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountId: 'account_id',
      alias: 'alias',
      color: 'color',
      height: 'height',
      width: 'width',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountId: 'string',
      alias: 'string',
      color: 'string',
      height: 'number',
      width: 'number',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractAccountsealResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  // 印章fileKey
  fileKey?: string;
  // 印章id
  sealId?: string;
  // 印章下载地址, 有效时间1小时
  url?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      fileKey: 'file_key',
      sealId: 'seal_id',
      url: 'url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      fileKey: 'string',
      sealId: 'string',
      url: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractOrganizationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 创建人个人账号ID，也就是调用个人账号创建接口（twc.notary.contract.account.create
  // ）返回的accountId
  creator: string;
  // 证件号
  idNumber: string;
  // 证件类型，默认CRED_ORG_USCC，详见机构证件类型说明 （https://tech.antfin.com/docs/2/155166）
  idType: string;
  // 企业法人名称
  legalPerson?: string;
  // 企业法人证件号
  legalPersonId?: string;
  // 机构名称
  name: string;
  // 机构唯一标识，可传入第三方平台机构id、企业证件号、企业邮箱等如果设置则作为账号唯一性字段，相同id不可重复创建。（个人用户与机构的唯一标识不可重复）
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      creator: 'creator',
      idNumber: 'id_number',
      idType: 'id_type',
      legalPerson: 'legal_person',
      legalPersonId: 'legal_person_id',
      name: 'name',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      creator: 'string',
      idNumber: 'string',
      idType: 'string',
      legalPerson: 'string',
      legalPersonId: 'string',
      name: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractOrganizationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  // 机构账号ID
  orgId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      orgId: 'org_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      orgId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractOrgsealRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 印章别名
  alias?: string;
  // 中心图案类型，STAR-圆形有五角星，NONE-圆形无五角星， 详见机构印章样式说明
  central: string;
  // 印章颜色，RED-红色，BLUE-蓝色，BLACK-黑色
  color: string;
  // 印章高度，默认159px
  height?: number;
  // 横向文，可设置0-8个字，企业名称超出25个字后，不支持设置横向文
  htext?: string;
  // 机构ID
  orgId: string;
  // 下弦文，可设置0-20个字，企业企业名称超出25个字后，不支持设置下弦文	
  qtext?: string;
  // 模板类型，TEMPLATE_ROUND-圆章，TEMPLATE_OVAL-椭圆章， 详见机构印章样式说明	
  type: string;
  // 印章宽度，默认159px
  width?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      alias: 'alias',
      central: 'central',
      color: 'color',
      height: 'height',
      htext: 'htext',
      orgId: 'org_id',
      qtext: 'qtext',
      type: 'type',
      width: 'width',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      alias: 'string',
      central: 'string',
      color: 'string',
      height: 'number',
      htext: 'string',
      orgId: 'string',
      qtext: 'string',
      type: 'string',
      width: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractOrgsealResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 印章fileKey
  fileKey?: string;
  // 业务码信息
  message?: string;
  // 印章ID
  sealId?: string;
  // 印章下载地址, 有效时间1小时
  url?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      fileKey: 'file_key',
      message: 'message',
      sealId: 'seal_id',
      url: 'url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      fileKey: 'string',
      message: 'string',
      sealId: 'string',
      url: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthContractSignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授权人ID，即个人账号ID或机构账号ID
  accountId: string;
  // 授权截止时间, 格式为yyyy-MM-dd HH:mm:ss，默认无限期
  deadline?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountId: 'account_id',
      deadline: 'deadline',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountId: 'string',
      deadline: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthContractSignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  // 业务数据, 是否授权成功
  accepted?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      accepted: 'accepted',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      accepted: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 模板文件md5值，再做base64编码
  contentMd5: string;
  // 目标文件的MIME类型
  contentType: string;
  // 是否需要转成pdf，如果模板文件为.doc/.docx 传true，为pdf传false
  convert2Pdf: boolean;
  // 文件名称，必须带扩展名如:.pdf,.doc,.docx
  fileName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      contentMd5: 'content_md5',
      contentType: 'content_type',
      convert2Pdf: 'convert2_pdf',
      fileName: 'file_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      contentMd5: 'string',
      contentType: 'string',
      convert2Pdf: 'boolean',
      fileName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  // 模板ID
  templateId?: string;
  // 文件直传地址，需要用此上传地址使用put方式上传文件，只有文件上传后模板才可用
  uploadUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      templateId: 'template_id',
      uploadUrl: 'upload_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      templateId: 'string',
      uploadUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 是否自动归档，默认false。如设置为true，则在调用签署流程开启(twc.notary.contract.flow.start)后，当所有签署人签署完毕，系统自动将流程归档，状态变为“已完成”状态，在流程状态为“已完成”前，可随时添加签署人；如设置为false，则在调用签署流程开启后，需主动调用签署流程归档接口，将流程状态变更为“已完成”，归档前可随时添加签署人；已完成的流程才可下载签署后的文件
  autoArchive?: boolean;
  // 文件主题
  businessScene: string;
  // 任务配置信息
  configInfo?: ContractSignFlowConfig;
  // 文件到期前，提前多久回调提醒续签，单位为小时，时间区间：1小时——15天（360小时），默认不提醒
  contractRemind?: number;
  // 文件有效截止日期,毫秒，默认不失效
  contractValidity?: number;
  // 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
  initiatorAccountId?: string;
  // 发起方主体id，如存在个人代机构发起签约，则需传入机构id；如不传，则默认是对接平台
  initiatorAuthorizedAccountId?: string;
  // 签署有效截止日期,毫秒，默认不失效
  signValidity?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      autoArchive: 'auto_archive',
      businessScene: 'business_scene',
      configInfo: 'config_info',
      contractRemind: 'contract_remind',
      contractValidity: 'contract_validity',
      initiatorAccountId: 'initiator_account_id',
      initiatorAuthorizedAccountId: 'initiator_authorized_account_id',
      signValidity: 'sign_validity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      autoArchive: 'boolean',
      businessScene: 'string',
      configInfo: ContractSignFlowConfig,
      contractRemind: 'number',
      contractValidity: 'number',
      initiatorAccountId: 'string',
      initiatorAuthorizedAccountId: 'string',
      signValidity: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractFlowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  // 流程ID
  flowId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      flowId: 'flow_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      flowId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddContractDocumentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程ID
  flowId: string;
  // 文档列表数据
  docs: ContractDoc[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      docs: 'docs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      docs: { 'type': 'array', 'itemType': ContractDoc },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddContractDocumentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddContractSignfieldRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 签署流程ID
  flowId: string;
  // 签署区列表数据
  signfields: ContractSignFieldApplication[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      signfields: 'signfields',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      signfields: { 'type': 'array', 'itemType': ContractSignFieldApplication },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddContractSignfieldResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  // 签署区列表数据
  signfields?: ContractSignField[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      signfields: 'signfields',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      signfields: { 'type': 'array', 'itemType': ContractSignField },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartContractFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程ID
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

export class StartContractFlowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveContractFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程ID
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

export class SaveContractFlowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DownloadContractDocumentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程ID
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

export class DownloadContractDocumentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 文档下载地址信息列表
  docs?: ContractDocAddress[];
  // 业务码信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      docs: 'docs',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      docs: { 'type': 'array', 'itemType': ContractDocAddress },
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddContractFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件名称
  name: string;
  // 模板编号
  templateId: string;
  // 输入项填充内容，以key:value传入
  simpleFormFields: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      templateId: 'template_id',
      simpleFormFields: 'simple_form_fields',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      templateId: 'string',
      simpleFormFields: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddContractFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文件下载地址，有效期一小时
  downloadUrl?: string;
  // 文件id
  fileId?: string;
  // 文件名称
  fileName?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      downloadUrl: 'download_url',
      fileId: 'file_id',
      fileName: 'file_name',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      downloadUrl: 'string',
      fileId: 'string',
      fileName: 'string',
      code: 'number',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractPlatformRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 平台方经办人信息
  creator: ContractAccountApplication;
  // 平台机构信息
  platform: ContractOrganizationApplication;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      creator: 'creator',
      platform: 'platform',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      creator: ContractAccountApplication,
      platform: ContractOrganizationApplication,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractPlatformResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建人ID
  creatorId?: string;
  // 平台方ID
  platformId?: string;
  // 平台用户与智能合同服务间鉴权使用的密钥
  secret?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      creatorId: 'creator_id',
      platformId: 'platform_id',
      secret: 'secret',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      creatorId: 'string',
      platformId: 'string',
      secret: 'string',
      code: 'number',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户类型为机构时，填写机构信息
  organization?: ContractOrganizationApplication;
  // 用户类型为个人时，则为个人用户信息；用户类型为机构时，则为机构账号经办人信息
  user: ContractAccountApplication;
  // 用户类型，个人（PERSON）或机构（ORGANIZATION）
  userType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      organization: 'organization',
      user: 'user',
      userType: 'user_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      organization: ContractOrganizationApplication,
      user: ContractAccountApplication,
      userType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractUserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 机构账号
  organizationId?: string;
  // 用户类型为个人时返回用户账号；用户类型为机构时返回经办人账号
  userId?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      organizationId: 'organization_id',
      userId: 'user_id',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      organizationId: 'string',
      userId: 'string',
      code: 'number',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartContractHandsignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 代理商户账户
  agentAccountId?: string;
  // 是否自动归档，默认为true
  autoArchive?: boolean;
  // 合同文件主题
  businessScene: string;
  // 文件到期前，提前多少小时回调提醒续签，小时（时间区间：1小时——15天），默认不提醒
  contractRemind?: number;
  // 签署流程任务配置信息
  contractSignFlowConfig?: ContractSignFlowConfig;
  // 文件有效截止日期,毫秒，默认不失效
  contractValidity?: number;
  // 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
  initiatorAccountId?: string;
  // 发起方主体id，如存在个人代机构发起签约，则需传入机构id；如不传，则默认是对接平台
  // 
  // 
  initiatorAuthorizedAccountId?: string;
  // 代扣规则详情，不可为空
  repaymentOrderInfo?: RepaymentOrderRequest[];
  // 签署平台，ALIPAY（支付宝小程序）或H5，默认H5
  signPlatform?: string;
  // 签署有效截止日期,毫秒，默认不失效
  signValidity?: string;
  // 输入项填充内容，以key:value传入
  simpleFormFields: string;
  // 待签署的智能合同模板ID
  template: string;
  // 待签署客户的账户ID
  userAccount: string;
  // 是否需要短网址
  shortUrl?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      agentAccountId: 'agent_account_id',
      autoArchive: 'auto_archive',
      businessScene: 'business_scene',
      contractRemind: 'contract_remind',
      contractSignFlowConfig: 'contract_sign_flow_config',
      contractValidity: 'contract_validity',
      initiatorAccountId: 'initiator_account_id',
      initiatorAuthorizedAccountId: 'initiator_authorized_account_id',
      repaymentOrderInfo: 'repayment_order_info',
      signPlatform: 'sign_platform',
      signValidity: 'sign_validity',
      simpleFormFields: 'simple_form_fields',
      template: 'template',
      userAccount: 'user_account',
      shortUrl: 'short_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      agentAccountId: 'string',
      autoArchive: 'boolean',
      businessScene: 'string',
      contractRemind: 'number',
      contractSignFlowConfig: ContractSignFlowConfig,
      contractValidity: 'number',
      initiatorAccountId: 'string',
      initiatorAuthorizedAccountId: 'string',
      repaymentOrderInfo: { 'type': 'array', 'itemType': RepaymentOrderRequest },
      signPlatform: 'string',
      signValidity: 'string',
      simpleFormFields: 'string',
      template: 'string',
      userAccount: 'string',
      shortUrl: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartContractHandsignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 签署流程ID
  flowId?: string;
  // 业务码信息
  message?: string;
  // 手动签约唤起地址
  url?: string;
  // 唤起签约地址短网址
  shortUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      flowId: 'flow_id',
      message: 'message',
      url: 'url',
      shortUrl: 'short_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      flowId: 'string',
      message: 'string',
      url: 'string',
      shortUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractFlowRequest extends $tea.Model {
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

export class QueryContractFlowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否自动归档
  autoArchive?: boolean;
  // 文件主题
  businessScene?: string;
  // 业务码，0表示成功
  code?: number;
  // 流程配置信息
  configInfo?: ContractSignFlowConfig;
  // 文件到期前，提前多少小时提醒续签
  contractRemind?: number;
  // 文件有效截止日期
  contractValidity?: number;
  // 流程描述, 如果流程已拒签或已撤回, 并且存在拒签或撤回原因, 流程描述显示为原因, 否则默认为流程状态描述
  flowDesc?: string;
  // 流程结束时间
  flowEndTime?: string;
  // 流程ID
  flowId?: string;
  // 流程开始时间
  flowStartTime?: string;
  // 流程状态,0-草稿 1-签署中 2-完成 3-撤销 4-终止 5-过期 6-删除 7-拒签
  flowStatus?: number;
  // 发起人账户id
  initiatorAccountId?: string;
  // 发起方主体id
  initiatorAuthorizedAccountId?: string;
  // 业务码信息
  message?: string;
  // 签署有效截止日期
  signValidity?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      autoArchive: 'auto_archive',
      businessScene: 'business_scene',
      code: 'code',
      configInfo: 'config_info',
      contractRemind: 'contract_remind',
      contractValidity: 'contract_validity',
      flowDesc: 'flow_desc',
      flowEndTime: 'flow_end_time',
      flowId: 'flow_id',
      flowStartTime: 'flow_start_time',
      flowStatus: 'flow_status',
      initiatorAccountId: 'initiator_account_id',
      initiatorAuthorizedAccountId: 'initiator_authorized_account_id',
      message: 'message',
      signValidity: 'sign_validity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      autoArchive: 'boolean',
      businessScene: 'string',
      code: 'number',
      configInfo: ContractSignFlowConfig,
      contractRemind: 'number',
      contractValidity: 'number',
      flowDesc: 'string',
      flowEndTime: 'string',
      flowId: 'string',
      flowStartTime: 'string',
      flowStatus: 'number',
      initiatorAccountId: 'string',
      initiatorAuthorizedAccountId: 'string',
      message: 'string',
      signValidity: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractAccountsealimageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户id
  accountId: string;
  // 印章别名
  alias?: string;
  // 印章高度, 个人默认95px, 机构默认159px
  height?: number;
  // 印章宽度, 个人默认95px, 机构默认159px
  width?: number;
  // 印章数据类型，BASE64：base64格式
  type: string;
  // 印章数据，base64格式字符串，不包含格式前缀
  data: string;
  // 是否对图片进行透明化处理，默认false。仅对图片整体做透明化处理，无法去除图片背景
  transparentFlag?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountId: 'account_id',
      alias: 'alias',
      height: 'height',
      width: 'width',
      type: 'type',
      data: 'data',
      transparentFlag: 'transparent_flag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountId: 'string',
      alias: 'string',
      height: 'number',
      width: 'number',
      type: 'string',
      data: 'string',
      transparentFlag: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractAccountsealimageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  // 印章fileKey
  fileKey?: string;
  // 印章id
  sealId?: string;
  // 印章下载地址, 有效时间1小时
  url?: string;
  // 印章高度
  height?: number;
  // 印章宽度
  width?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      fileKey: 'file_key',
      sealId: 'seal_id',
      url: 'url',
      height: 'height',
      width: 'width',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      fileKey: 'string',
      sealId: 'string',
      url: 'string',
      height: 'number',
      width: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetContractFileuploadurlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 所属账号id，即个人账号id或机构账号id，如不传，则默认属于对接平台
  accountId?: string;
  // 先计算文件md5值，在对该md5值进行base64编码
  contentMd5: string;
  // 目标文件的MIME类型
  contentType: string;
  // 是否转换成pdf文档，默认false，代表不做转换。转换是异步行为，如果指定要转换，需要调用查询文件信息接口查询状态，转换完成后才可使用。
  convert2Pdf: string;
  // 文件大小，单位byte
  fileSize: number;
  // 文件名称（必须带上文件扩展名，不然会导致后续发起流程校验过不去 示例：合同.pdf ）
  fileName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountId: 'account_id',
      contentMd5: 'content_md5',
      contentType: 'content_type',
      convert2Pdf: 'convert_2_pdf',
      fileSize: 'file_size',
      fileName: 'file_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountId: 'string',
      contentMd5: 'string',
      contentType: 'string',
      convert2Pdf: 'string',
      fileSize: 'number',
      fileName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetContractFileuploadurlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 文件Id
  fileId?: string;
  // 业务码信息
  message?: string;
  // 文件直传地址, 可以重复使用，但是只能传一样的文件，有效期一小时
  uploadUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      fileId: 'file_id',
      message: 'message',
      uploadUrl: 'upload_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      fileId: 'string',
      message: 'string',
      uploadUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddContractPlatformsignfieldsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程id
  flowId: string;
  // 签署区列表数据
  signfields: ContractPlatformSignFieldApplication;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      signfields: 'signfields',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      signfields: ContractPlatformSignFieldApplication,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddContractPlatformsignfieldsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  // 签署区列表数据
  signfields?: ContractSignField[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      signfields: 'signfields',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      signfields: { 'type': 'array', 'itemType': ContractSignField },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetContractFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件id
  fileId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetContractFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  // 文件id
  fileId?: string;
  // 文件名称
  name?: string;
  // 下载地址
  downloadUrl?: string;
  // 文件大小，单位byte
  size?: number;
  // 文件状态, 0:文件未上传；1:文件上传中 ；2：文件上传已完成,；3：文件上传失败 ；4：文件等待转pdf ；5：文件已转换pdf 。
  status?: number;
  // pdf文件总页数,仅当文件类型为pdf时有值
  pdfTotalPages?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      fileId: 'file_id',
      name: 'name',
      downloadUrl: 'download_url',
      size: 'size',
      status: 'status',
      pdfTotalPages: 'pdf_total_pages',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      fileId: 'string',
      name: 'string',
      downloadUrl: 'string',
      size: 'number',
      status: 'number',
      pdfTotalPages: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractAccountsealsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户id
  accountId: string;
  // 分页起始位置
  offset: number;
  // 单页数量
  size: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountId: 'account_id',
      offset: 'offset',
      size: 'size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountId: 'string',
      offset: 'number',
      size: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractAccountsealsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  // 查询总数
  total?: number;
  // 印章列表
  seals?: ContractSeal[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      total: 'total',
      seals: 'seals',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      total: 'number',
      seals: { 'type': 'array', 'itemType': ContractSeal },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractOrganizationsealsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 机构id
  orgId: string;
  // 分页起始位置
  offset: number;
  // 单页数量
  size: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orgId: 'org_id',
      offset: 'offset',
      size: 'size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orgId: 'string',
      offset: 'number',
      size: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractOrganizationsealsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  // 查询总数
  total?: number;
  // 印章列表
  seals?: ContractSeal[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      total: 'total',
      seals: 'seals',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      total: 'number',
      seals: { 'type': 'array', 'itemType': ContractSeal },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractFlowsignerRequest extends $tea.Model {
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

export class QueryContractFlowsignerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  // 签字人列表
  signers?: ContractFlowSigner[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      signers: 'signers',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      signers: { 'type': 'array', 'itemType': ContractFlowSigner },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractSignfieldsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程id
  flowId: string;
  // 账号id，默认所有签署人
  accountId?: string;
  // 指定签署区id列表，逗号分割，默认所有签署区
  signfieldIds?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      accountId: 'account_id',
      signfieldIds: 'signfield_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      accountId: 'string',
      signfieldIds: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractSignfieldsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  // 签署区列表数据
  signfields?: ContractSignFieldDetail[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      signfields: 'signfields',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      signfields: { 'type': 'array', 'itemType': ContractSignFieldDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 个人账号id
  accountId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountId: 'account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractAccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  // 个人账号id
  accountId?: string;
  // 姓名
  name?: string;
  // 证件类型，详见个人证件类型说明
  idType?: string;
  // 证件号
  idNumber?: string;
  // 联系方式，手机号码
  mobile?: string;
  // 联系方式，邮箱地址
  email?: string;
  // 第三方平台的用户id
  thirdPartyUserId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      accountId: 'account_id',
      name: 'name',
      idType: 'id_type',
      idNumber: 'id_number',
      mobile: 'mobile',
      email: 'email',
      thirdPartyUserId: 'third_party_user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      accountId: 'string',
      name: 'string',
      idType: 'string',
      idNumber: 'string',
      mobile: 'string',
      email: 'string',
      thirdPartyUserId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractOrganizationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 机构账号id
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

export class QueryContractOrganizationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  // 机构账号Id
  orgId?: string;
  // 机构名称
  name?: string;
  // 证件类型，详见机构证件类型说明
  idType?: string;
  // 证件号
  idNumber?: string;
  // 企业法人证件号
  orgLegalIdNumber?: string;
  // 企业法人名称
  orgLegalName?: string;
  // 第三方平台的机构id
  thirdPartyUserId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      orgId: 'org_id',
      name: 'name',
      idType: 'id_type',
      idNumber: 'id_number',
      orgLegalIdNumber: 'org_legal_id_number',
      orgLegalName: 'org_legal_name',
      thirdPartyUserId: 'third_party_user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      orgId: 'string',
      name: 'string',
      idType: 'string',
      idNumber: 'string',
      orgLegalIdNumber: 'string',
      orgLegalName: 'string',
      thirdPartyUserId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 模板id
  templateId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      templateId: 'template_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      templateId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 创建时间
  createTime?: number;
  // 模板文件下载地址
  downloadUrl?: string;
  // 模板文件大小
  fileSize?: number;
  // 业务码信息
  message?: string;
  // 文件模板中的输入项组件列表
  structComponents?: ContractTemplateStructComponent[];
  // 模板id
  templateId?: string;
  // 模板名称
  templateName?: string;
  // 更新时间
  updateTime?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      createTime: 'create_time',
      downloadUrl: 'download_url',
      fileSize: 'file_size',
      message: 'message',
      structComponents: 'struct_components',
      templateId: 'template_id',
      templateName: 'template_name',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      createTime: 'number',
      downloadUrl: 'string',
      fileSize: 'number',
      message: 'string',
      structComponents: { 'type': 'array', 'itemType': ContractTemplateStructComponent },
      templateId: 'string',
      templateName: 'string',
      updateTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractSignflowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 是否自动归档，默认false 如设置为true，则在流程开启后，当所有签署人签署完毕，系统自动将流程归档，状态变为“已完成”状态，在流程状态为“已完成”前，可随时添加签署人；如设置为false，则在调用流程开启后，需主动调用签署流程归档接口，将流程状态变更为“已完成”，归档前可随时添加签署人；已完成的流程才可下载签署后的文件
  autoArchive?: boolean;
  // 是否强制代扣
  autoDeductionForce?: boolean;
  // 文件主题
  businessScene: string;
  // 任务配置信息
  contractSignFlowConfig?: ContractSignFlowConfig;
  // 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
  initiatorAccountId?: string;
  // 发起方主体id，如存在个人代机构发起签约，则需传入机构id；如不传，则默认是对接平台
  initiatorAuthorizedAccountId?: string;
  // 代扣规则详情
  repaymentOrderInfo?: RepaymentOrderRequest[];
  // 签署平台，ALIPAY（支付宝小程序）或H5
  signPlatform?: string;
  // 签署有效截止日期，毫秒，默认3天失效
  signValidity?: number;
  //  付款方ID（个人）
  payerTuid?: string;
  // 收款方ID(机构)
  payeeTuid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      autoArchive: 'auto_archive',
      autoDeductionForce: 'auto_deduction_force',
      businessScene: 'business_scene',
      contractSignFlowConfig: 'contract_sign_flow_config',
      initiatorAccountId: 'initiator_account_id',
      initiatorAuthorizedAccountId: 'initiator_authorized_account_id',
      repaymentOrderInfo: 'repayment_order_info',
      signPlatform: 'sign_platform',
      signValidity: 'sign_validity',
      payerTuid: 'payer_tuid',
      payeeTuid: 'payee_tuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      autoArchive: 'boolean',
      autoDeductionForce: 'boolean',
      businessScene: 'string',
      contractSignFlowConfig: ContractSignFlowConfig,
      initiatorAccountId: 'string',
      initiatorAuthorizedAccountId: 'string',
      repaymentOrderInfo: { 'type': 'array', 'itemType': RepaymentOrderRequest },
      signPlatform: 'string',
      signValidity: 'number',
      payerTuid: 'string',
      payeeTuid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractSignflowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 签约流程ID
  flowId?: string;
  // 业务码信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      flowId: 'flow_id',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      flowId: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractRegisterzftRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 地址。商户详细经营地址或人员所在地点
  address: string;
  // 代理商户的账户。如为isv商家入驻，需要传agent_account_id字段，agent_account_id是isv为商家用户注册返回的机构id
  agentAccountId?: string;
  // 商户别名
  aliasName: string;
  // 商户支付宝账户
  alipayLogonId: string;
  // 申请时间
  applyTime: string;
  // 二级商户支付宝账户，用于协议确认。目前商业场景（除医疗、中小学教育等）下必填。本字段要求与商户名称name同名，且是实名认证支付宝账户
  bindingAlipayLogonId: string;
  // 结算卡id
  cardAliasNo?: string;
  // 营业执照图片url，本业务接口中，如果是特殊行业必填。其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
  certImage: string;
  // 商户社会信用码
  certNo: string;
  // 商户证件类型，取值范围：201：营业执照；2011:营业执照(统一社会信用代码)；204：民办非企业登记证书；206：社会团体法人登记证书；218：事业单位法人证书；219：党政机关批准设立文件/行政执法主体资格证；100：个人商户身份证
  certType: string;
  // 城市编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。
  // （参考资料：
  // http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
  cityCode: string;
  // 电子邮箱
  contactEmail: string;
  // 商户联系人信息
  contactMobile: string;
  // 联系人名字	
  contactName: string;
  // 商户联系人电话信息
  contactPhone: string;
  // 商户联系人业务标识枚举，表示商户联系人的职责。异议处理接口人:02;商户关键联系人:06;数据反馈接口人:11;服务联动接口人:08
  contactTag: string;
  // 联系人类型，取值范围：LEGAL_PERSON：法人；CONTROLLER：实际控制人；AGENT：代理人；OTHER：其他
  contactType: string;
  // 区县编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。
  // （参考资料：
  // http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
  districtCode: string;
  // 返回申请单相关参数。当前返回内容有cardAliasNo，smid	
  extInfo: string;
  // 商户角色id。审核通过后生成。间连商户或平台商二级商户业务中，本字段表示smid
  ipRoleId: string;
  // 法人身份证反面url，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。本业务接口中，如果是特殊行业必填
  legalCertBackImage: string;
  // 法人身份证正面url，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。本业务接口中，如果是特殊行业必填
  legalCertFrontImage: string;
  // 法人身份证号
  legalCertNo: string;
  // 法人名称
  legalName: string;
  // 商户类别码mcc，参见附件描述中的“类目code” https://gw.alipayobjects.com/os/basement_prod/82cb70f7-abbd-417a-91ba-73c1849f07ea.xlsx 如果要求资质一栏不为空，表明是特殊行业，会有人工审核。注：文档更新可能有滞后性，以实际为准
  mcc: string;
  // 蚂蚁金服（杭*****术有限公司
  merchantName: string;
  // 商家类型：01：企业；02：事业单位；03：民办非企业组织；04：社会团体；05：党政及国家机关；06：个人商户；07：个体工商户
  merchantType: string;
  // 商户名称
  name: string;
  // 申请单id
  orderId: string;
  // 外部业务号。比如某种业务标准外部订单号,比如交易外部订单号，代表服务商端自己订单号。用于做并发控制，防止一笔外部订单发起两次进件。非必要场景禁止传入本字段，如要使用务必理清场景及字段生成规则，与蚂蚁金服对接人咨询。
  outBizNo: string;
  // 门头照，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。如果使用当面付服务则必填
  outDoorImage: string;
  // 商户在智能合同平台唯一id
  platformTuid: string;
  // 省份编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。
  // （参考资料：
  // http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
  provinceCode: string;
  // 商户使用服务，可选值有：当面付、app支付、wap支付、电脑支付
  service: string;
  // 客服电话	
  servicePhone: string;
  // 二级商户与服务商的签约时间
  signTimeWithIsv: string;
  // 站点名称
  siteName: string;
  // 网站：01
  // APP : 02
  // 服务窗:03
  // 公众号:04
  // 其他:05
  // 支付宝小程序:06
  siteType: string;
  // 站点地址
  siteUrl: string;
  // 二级商户id
  smid: string;
  // 申请单状态。99:已完结;-1:失败;031:已提交审核
  status: string;
  // 0表示不更新，1表示强制更新
  update: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      address: 'address',
      agentAccountId: 'agent_account_id',
      aliasName: 'alias_name',
      alipayLogonId: 'alipay_logon_id',
      applyTime: 'apply_time',
      bindingAlipayLogonId: 'binding_alipay_logon_id',
      cardAliasNo: 'card_alias_no',
      certImage: 'cert_image',
      certNo: 'cert_no',
      certType: 'cert_type',
      cityCode: 'city_code',
      contactEmail: 'contact_email',
      contactMobile: 'contact_mobile',
      contactName: 'contact_name',
      contactPhone: 'contact_phone',
      contactTag: 'contact_tag',
      contactType: 'contact_type',
      districtCode: 'district_code',
      extInfo: 'ext_info',
      ipRoleId: 'ip_role_id',
      legalCertBackImage: 'legal_cert_back_image',
      legalCertFrontImage: 'legal_cert_front_image',
      legalCertNo: 'legal_cert_no',
      legalName: 'legal_name',
      mcc: 'mcc',
      merchantName: 'merchant_name',
      merchantType: 'merchant_type',
      name: 'name',
      orderId: 'order_id',
      outBizNo: 'out_biz_no',
      outDoorImage: 'out_door_image',
      platformTuid: 'platform_tuid',
      provinceCode: 'province_code',
      service: 'service',
      servicePhone: 'service_phone',
      signTimeWithIsv: 'sign_time_with_isv',
      siteName: 'site_name',
      siteType: 'site_type',
      siteUrl: 'site_url',
      smid: 'smid',
      status: 'status',
      update: 'update',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      address: 'string',
      agentAccountId: 'string',
      aliasName: 'string',
      alipayLogonId: 'string',
      applyTime: 'string',
      bindingAlipayLogonId: 'string',
      cardAliasNo: 'string',
      certImage: 'string',
      certNo: 'string',
      certType: 'string',
      cityCode: 'string',
      contactEmail: 'string',
      contactMobile: 'string',
      contactName: 'string',
      contactPhone: 'string',
      contactTag: 'string',
      contactType: 'string',
      districtCode: 'string',
      extInfo: 'string',
      ipRoleId: 'string',
      legalCertBackImage: 'string',
      legalCertFrontImage: 'string',
      legalCertNo: 'string',
      legalName: 'string',
      mcc: 'string',
      merchantName: 'string',
      merchantType: 'string',
      name: 'string',
      orderId: 'string',
      outBizNo: 'string',
      outDoorImage: 'string',
      platformTuid: 'string',
      provinceCode: 'string',
      service: 'string',
      servicePhone: 'string',
      signTimeWithIsv: 'string',
      siteName: 'string',
      siteType: 'string',
      siteUrl: 'string',
      smid: 'string',
      status: 'string',
      update: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractRegisterzftResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误码
  code?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractPlatformtemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 是否包含代扣规则，如果设置为true，则在创建手动签署流程时，必须传入代扣规则。默认为false
  autoDeduction?: boolean;
  // Base64编码的模板文件的MD5值
  contentMd5: string;
  // 目标文件的MIME类型
  contentType: string;
  // 是否需要转成pdf，如果模板文件为.doc/.docx 传true，为pdf传false
  convert2Pdf: boolean;
  // 文件名称，必须带扩展名如:.pdf,.doc,.docx
  fileName: string;
  // 平台方的签署信息列表
  signFields: ContractPlatformSignField[];
  // 用户需要签章的页面列表（默认为最后一页）
  userSignPages?: number[];
  // 是否强制用户选择代扣
  autoDeductionForce?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      autoDeduction: 'auto_deduction',
      contentMd5: 'content_md5',
      contentType: 'content_type',
      convert2Pdf: 'convert2_pdf',
      fileName: 'file_name',
      signFields: 'sign_fields',
      userSignPages: 'user_sign_pages',
      autoDeductionForce: 'auto_deduction_force',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      autoDeduction: 'boolean',
      contentMd5: 'string',
      contentType: 'string',
      convert2Pdf: 'boolean',
      fileName: 'string',
      signFields: { 'type': 'array', 'itemType': ContractPlatformSignField },
      userSignPages: { 'type': 'array', 'itemType': 'number' },
      autoDeductionForce: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractPlatformtemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  // 模板ID
  templateId?: string;
  // 文件直传地址，需要用此上传地址使用put方式上传文件，只有文件上传后模板才可用
  uploadUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      templateId: 'template_id',
      uploadUrl: 'upload_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      templateId: 'string',
      uploadUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractMerchantzftRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 代理商户账户
  agentAccountId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      agentAccountId: 'agent_account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      agentAccountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractMerchantzftResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 0表示成功，其他为失败
  code?: number;
  // 商户入驻查询信息
  data?: string;
  // 错误信息描述
  errMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      data: 'data',
      errMessage: 'err_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      data: 'string',
      errMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListContractOuttradeidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合同id
  flowId: string;
  // 分页第几页
  pageIndex: number;
  // 每页的大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      pageIndex: 'page_index',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      pageIndex: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListContractOuttradeidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误码
  code?: number;
  // 错误信息描述
  errMessage?: string;
  // 总符合条件的交易个数
  total?: number;
  // 所有符合条件交易相关的id
  outTradeNo?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      total: 'total',
      outTradeNo: 'out_trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      total: 'number',
      outTradeNo: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractTradedetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合同id
  flowId: string;
  // out_trade_no
  outTradeNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      outTradeNo: 'out_trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      outTradeNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractTradedetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误码
  code?: number;
  // 订单详情
  data?: string;
  // 错误信息描述
  errMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      data: 'data',
      errMessage: 'err_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      data: 'string',
      errMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractMerchantrefundRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合同id
  flowId: string;
  // 退款请求对应的第三方ID（也叫退款ID），需保证同一平台方下唯一
  outRequestNo: string;
  // 订单id
  outTradeNo: string;
  // 退款金额（单位：分）
  refundAmount: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      outRequestNo: 'out_request_no',
      outTradeNo: 'out_trade_no',
      refundAmount: 'refund_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      outRequestNo: 'string',
      outTradeNo: 'string',
      refundAmount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractMerchantrefundResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误码
  code?: number;
  // 错误信息描述
  message?: string;
  // 本次请求对应的操作单号
  outRequestNo?: string;
  // 订单id
  outTradeNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      outRequestNo: 'out_request_no',
      outTradeNo: 'out_trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      outRequestNo: 'string',
      outTradeNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractAdminaccountRequest extends $tea.Model {
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

export class CreateContractAdminaccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误码
  code?: number;
  // 错误信息描述
  errMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListContractTradeidsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合同id
  flowId: string;
  // 1
  pageIndex: number;
  // 页面大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      pageIndex: 'page_index',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      pageIndex: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListContractTradeidsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 0表示成功
  code?: number;
  // 错误信息描述
  errMessage?: string;
  // 所有item的个数
  total?: number;
  // 所有满足条件的订单
  outTradeNo?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      total: 'total',
      outTradeNo: 'out_trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      total: 'number',
      outTradeNo: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractCommontriggerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 代扣规则详情
  repaymentOrderInfo: RepaymentOrderRequest[];
  // 合同id
  flowId: string;
  // 用户在智能合同平台的身份
  userTuid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      repaymentOrderInfo: 'repayment_order_info',
      flowId: 'flow_id',
      userTuid: 'user_tuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      repaymentOrderInfo: { 'type': 'array', 'itemType': RepaymentOrderRequest },
      flowId: 'string',
      userTuid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractCommontriggerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误码
  code?: number;
  // 错误信息描述
  errMessage?: string;
  // 合同id
  flowId?: string;
  // 商户在智能合同平台id
  platformTuid?: string;
  // 用户在智能合同平台的id
  userTuid?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      flowId: 'flow_id',
      platformTuid: 'platform_tuid',
      userTuid: 'user_tuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      flowId: 'string',
      platformTuid: 'string',
      userTuid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractMerchantindirectzftRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 入驻材料
  bizContent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractMerchantindirectzftResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 传入参数内容
  body?: string;
  // 错误码
  code?: number;
  // 错误信息描述
  message?: string;
  // 订单id
  orderId?: string;
  // 支付宝返回的二级错误信息
  subCode?: string;
  // 支付宝返回的二级错误信息描述
  subMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      body: 'body',
      code: 'code',
      message: 'message',
      orderId: 'order_id',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      body: 'string',
      code: 'number',
      message: 'string',
      orderId: 'string',
      subCode: 'string',
      subMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractMerchantindirectzftRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户入驻查询订单id
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

export class QueryContractMerchantindirectzftResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误状态码，0表示成功
  code?: number;
  // 错误信息描述
  message?: string;
  // 额外信息，包含smid
  extInfo?: string;
  // 支付宝的ipRoleId
  ipRoleId?: string[];
  // 申请时间
  applyId?: string;
  // 商户名称
  merchantName?: string;
  // 直付通商户进件的状态
  status?: string;
  // 支付宝返回的错误状态码
  subCode?: string;
  // 支付宝返回的错误信息描述
  subMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      extInfo: 'ext_info',
      ipRoleId: 'ip_role_id',
      applyId: 'apply_id',
      merchantName: 'merchant_name',
      status: 'status',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      extInfo: 'string',
      ipRoleId: { 'type': 'array', 'itemType': 'string' },
      applyId: 'string',
      merchantName: 'string',
      status: 'string',
      subCode: 'string',
      subMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPayresultfileurlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 对账日期
  billDate: string;
  // 交易类型
  billType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      billDate: 'bill_date',
      billType: 'bill_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      billDate: 'string',
      billType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPayresultfileurlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 对账文件的下载地址
  payUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      payUrl: 'pay_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      payUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractMerchantimageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 图片内容，base64
  content: string;
  // 图片名称，必须带标准图片后缀
  fileName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      content: 'content',
      fileName: 'file_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      content: 'string',
      fileName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractMerchantimageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 图片在oss上的id
  imageId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      imageId: 'image_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      imageId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelContractPaytradeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 智能合同id
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

export class CancelContractPaytradeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误码
  code?: number;
  // 错误信息描述
  errMessage?: string;
  // 取消的代扣条目
  canceledOutTradeNo?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      canceledOutTradeNo: 'canceled_out_trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      canceledOutTradeNo: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractHandsignflowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 是否自动归档，默认false。如设置为true，当所有签署人签署完毕，系统自动将流程归档，状态变为“已完成”状态，在流程状态为“已完成”前，可随时添加签署人；如设置为false，则在调用签署流程开启后，需主动调用签署流程归档接口，将流程状态变更为“已完成”，归档前可随时添加签署人；已完成的流程才可下载签署后的文件。
  autoArchive?: boolean;
  // 文件主题
  businessScene: string;
  // 任务配置信息
  configInfo?: ContractSignFlowConfig;
  // 文件到期前，提前多久回调提醒续签，单位为小时，时间区间：1小时——15天（360小时），默认不提醒
  contractRemind?: number;
  // 文件有效截止日期,毫秒，默认不失效
  contractValidity?: number;
  // 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
  initiatorAccountId?: string;
  // 发起方主体id，如存在个人代机构发起签约，则需传入机构id；如不传，则默认是对接平台
  initiatorAuthorizedAccountId?: string;
  // 签署有效截止日期,毫秒，默认不失效
  signValidity?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      autoArchive: 'auto_archive',
      businessScene: 'business_scene',
      configInfo: 'config_info',
      contractRemind: 'contract_remind',
      contractValidity: 'contract_validity',
      initiatorAccountId: 'initiator_account_id',
      initiatorAuthorizedAccountId: 'initiator_authorized_account_id',
      signValidity: 'sign_validity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      autoArchive: 'boolean',
      businessScene: 'string',
      configInfo: ContractSignFlowConfig,
      contractRemind: 'number',
      contractValidity: 'number',
      initiatorAccountId: 'string',
      initiatorAuthorizedAccountId: 'string',
      signValidity: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractHandsignflowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 流程ID
  flowId?: string;
  // 业务码信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      flowId: 'flow_id',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      flowId: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractHandsignfieldRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程id
  flowId: string;
  // 签署区列表数据
  signFields: ContractHandSignFieldApplication[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      signFields: 'sign_fields',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      signFields: { 'type': 'array', 'itemType': ContractHandSignFieldApplication },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractHandsignfieldResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  // 签署区列表数据
  signfields?: ContractSignField[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      signfields: 'signfields',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      signfields: { 'type': 'array', 'itemType': ContractSignField },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetContractSignurlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 签署人账号id
  accountId: string;
  // 流程id
  flowId: string;
  // 存量参数，已废弃
  organizeId?: string;
  // 是否需要同时返回短链接，默认为false
  shortUrl?: boolean;
  // 本功能需要单独审批开放。当account_id为机构账户时，可以在执行签署时单独指定经办人账户，代为完成本次签署操作。
  agentAccountId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountId: 'account_id',
      flowId: 'flow_id',
      organizeId: 'organize_id',
      shortUrl: 'short_url',
      agentAccountId: 'agent_account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountId: 'string',
      flowId: 'string',
      organizeId: 'string',
      shortUrl: 'boolean',
      agentAccountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetContractSignurlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  // 长链地址
  url?: string;
  // 短链地址
  shortUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      url: 'url',
      shortUrl: 'short_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      url: 'string',
      shortUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateWithholdAgreementRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授信总金额，单位元
  creditAmount: string;
  // 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）
  externalAgreementNo: string;
  // 收款方账号类型，可取值：ALIPAY_USER_ID（支付宝uid);商户id，2088123412341234
  merchantId: string;
  // 商户名称
  merchantName: string;
  // 对服务产品的描述
  merchantServiceDescription?: string;
  // 商户的服务名称，滴滴出行免密支付
  merchantServiceName: string;
  // 姓名和身份证号拼接sha256的hash
  nameCertHash: string;
  // 还款计划的链接
  repaymentUrl: string;
  // 签约成功后回调的地址
  returnUrl?: string;
  // 第三方用户id
  thirdPartyId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      creditAmount: 'credit_amount',
      externalAgreementNo: 'external_agreement_no',
      merchantId: 'merchant_id',
      merchantName: 'merchant_name',
      merchantServiceDescription: 'merchant_service_description',
      merchantServiceName: 'merchant_service_name',
      nameCertHash: 'name_cert_hash',
      repaymentUrl: 'repayment_url',
      returnUrl: 'return_url',
      thirdPartyId: 'third_party_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      creditAmount: 'string',
      externalAgreementNo: 'string',
      merchantId: 'string',
      merchantName: 'string',
      merchantServiceDescription: 'string',
      merchantServiceName: 'string',
      nameCertHash: 'string',
      repaymentUrl: 'string',
      returnUrl: 'string',
      thirdPartyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateWithholdAgreementResponse extends $tea.Model {
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

export class QueryWithholdAgreementRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）
  externalAgreementNo: string;
  // 第三方用户id
  thirdPartyId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      externalAgreementNo: 'external_agreement_no',
      thirdPartyId: 'third_party_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      externalAgreementNo: 'string',
      thirdPartyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWithholdAgreementResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总授信金额
  creditAmount?: string;
  // 商家的支付宝uid
  merchantId?: string;
  // 商户名称
  merchantName?: string;
  // 商户的服务名称
  merchantServiceName?: string;
  // 姓名身份证号拼接后的hash
  nameCertHash?: string;
  // 还款计划的超链接
  repaymentUrl?: string;
  // 协议的状态，如果签署成功返回success,未签是空
  status?: string;
  // 第三方的用户id
  thirdPartyId?: string;
  // 商家请求的协议号
  externalAgreementNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      creditAmount: 'credit_amount',
      merchantId: 'merchant_id',
      merchantName: 'merchant_name',
      merchantServiceName: 'merchant_service_name',
      nameCertHash: 'name_cert_hash',
      repaymentUrl: 'repayment_url',
      status: 'status',
      thirdPartyId: 'third_party_id',
      externalAgreementNo: 'external_agreement_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      creditAmount: 'string',
      merchantId: 'string',
      merchantName: 'string',
      merchantServiceName: 'string',
      nameCertHash: 'string',
      repaymentUrl: 'string',
      status: 'string',
      thirdPartyId: 'string',
      externalAgreementNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWithholdAgreementurlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）
  externalAgreementNo: string;
  // 第三方用户id
  thirdPartyId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      externalAgreementNo: 'external_agreement_no',
      thirdPartyId: 'third_party_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      externalAgreementNo: 'string',
      thirdPartyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWithholdAgreementurlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 成功
  resultMessage?: string;
  // 代扣协议签署的入口
  url?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultMessage: 'result_message',
      url: 'url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultMessage: 'string',
      url: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateWithholdOverduetimeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 首款方id
  merchantId: string;
  // 商家名称
  merchantName: string;
  // 商家提供的产品名称
  merchantServiceName: string;
  // 租户id
  tenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantId: 'merchant_id',
      merchantName: 'merchant_name',
      merchantServiceName: 'merchant_service_name',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantId: 'string',
      merchantName: 'string',
      merchantServiceName: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateWithholdOverduetimeResponse extends $tea.Model {
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

export class SendWithholdDeductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 委托支付订单总金额，单位为元，精确到小数点后两位
  amount: string;
  // JSON格式，传递业务扩展参数
  businessParams?: string;
  // 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）
  externalAgreementNo: string;
  // 订单标题信息
  orderTitle?: string;
  // 外部订单号,请求方保证唯一性
  outBizNo: string;
  // 备注
  remark?: string;
  // 第三方的用户id
  thirdPartyId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      amount: 'amount',
      businessParams: 'business_params',
      externalAgreementNo: 'external_agreement_no',
      orderTitle: 'order_title',
      outBizNo: 'out_biz_no',
      remark: 'remark',
      thirdPartyId: 'third_party_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      amount: 'string',
      businessParams: 'string',
      externalAgreementNo: 'string',
      orderTitle: 'string',
      outBizNo: 'string',
      remark: 'string',
      thirdPartyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendWithholdDeductResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 该笔转账在支付宝系统内部的单据ID
  entrustOrderId?: string;
  // INIT：受理成功，扣款中
  // FINISHED：扣款成功
  // CLOSED：商户已关单
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      entrustOrderId: 'entrust_order_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      entrustOrderId: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWithholdPayresultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求扣款时，返回的委托单号,该笔转账在支付宝系统内部的单据ID
  entrustOrderId: string;
  // 外部订单号,请求方保证唯一性
  outBizNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      entrustOrderId: 'entrust_order_id',
      outBizNo: 'out_biz_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      entrustOrderId: 'string',
      outBizNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWithholdPayresultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 支付完成日期
  payDate?: string;
  // 支付宝支付单据号
  payOrderId?: string;
  // INIT：受理成功，扣款中
  // FINISHED：扣款成功
  // CLOSED：商户已关单
  status?: string;
  // 扣款金额
  transAmount?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      payDate: 'pay_date',
      payOrderId: 'pay_order_id',
      status: 'status',
      transAmount: 'trans_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      payDate: 'string',
      payOrderId: 'string',
      status: 'string',
      transAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendWithholdRefundRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 支付宝支付单据号
  orderId: string;
  // 外部订单号,请求方保证唯一性
  outRequestNo: string;
  // 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数
  refundAmount: string;
  // 退款备注
  remark: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      outRequestNo: 'out_request_no',
      refundAmount: 'refund_amount',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      outRequestNo: 'string',
      refundAmount: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendWithholdRefundResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数
  refundAmount?: string;
  // 退款成功的日期
  refundDate?: string;
  // 退款的支付宝系统内部单据id
  refundOrderId?: string;
  // FINISHED,退款成功的状态值
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      refundAmount: 'refund_amount',
      refundDate: 'refund_date',
      refundOrderId: 'refund_order_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      refundAmount: 'string',
      refundDate: 'string',
      refundOrderId: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendContractInvitationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务方id，重定向和回调时都回传这个id
  bizProcessId?: string;
  // 回调接口地址，默认为空，不回调
  callbackUrl?: string;
  // 被邀请人邮箱，若手机号和邮箱都传入，则仅手机号有效
  email?: string;
  // 被邀请人证件号
  idNumber?: string;
  // 被邀请人证件类型，详见个人证件类型说明 ，默认CRED_PSN_CH_IDCARD
  inviteeCertType?: string;
  // 邀请个人实名为PERSON，邀请企业为ORGAN
  inviteType: string;
  // 企业法定代表人证件类型，详见个人证件类型说明 ，默认CRED_PSN_CH_IDCARD
  legalCertType?: string;
  // 企业法定代表人姓名
  legalName?: string;
  // 企业法定代表人证件号
  legalNo?: string;
  // 被邀请人手机号
  mobile?: string;
  // 被邀请人姓名
  name?: string;
  // 默认为空，传入“sms”表示短信，“email”表示邮件，若两者都传入，则只发送短信
  notifyType?: string;
  // 企业证件号
  organCertNo?: string;
  // 企业证件类型，详见机构证件类型说明 ，默认CRED_ORG_USCC
  organCertType?: string;
  // 企业名称
  organName?: string;
  // 结束后重定向地址（需加前缀https:// 或 http:// ），默认停留在当前页面
  redirectUrl?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizProcessId: 'biz_process_id',
      callbackUrl: 'callback_url',
      email: 'email',
      idNumber: 'id_number',
      inviteeCertType: 'invitee_cert_type',
      inviteType: 'invite_type',
      legalCertType: 'legal_cert_type',
      legalName: 'legal_name',
      legalNo: 'legal_no',
      mobile: 'mobile',
      name: 'name',
      notifyType: 'notify_type',
      organCertNo: 'organ_cert_no',
      organCertType: 'organ_cert_type',
      organName: 'organ_name',
      redirectUrl: 'redirect_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizProcessId: 'string',
      callbackUrl: 'string',
      email: 'string',
      idNumber: 'string',
      inviteeCertType: 'string',
      inviteType: 'string',
      legalCertType: 'string',
      legalName: 'string',
      legalNo: 'string',
      mobile: 'string',
      name: 'string',
      notifyType: 'string',
      organCertNo: 'string',
      organCertType: 'string',
      organName: 'string',
      redirectUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendContractInvitationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 邀请任务id
  invitationId?: string;
  // 邀请链接
  invitationUrl?: string;
  // 业务码信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      invitationId: 'invitation_id',
      invitationUrl: 'invitation_url',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      invitationId: 'string',
      invitationUrl: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListContractPayruleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // flowId
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

export class ListContractPayruleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码，0表示成功
  code?: number;
  // ""
  errMessage?: string;
  // 代扣规则描述json表示
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateWithholdQrcodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 第三方的用户id
  thirdPartyId: string;
  // 请求签约的协议号
  externalAgreementNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      thirdPartyId: 'third_party_id',
      externalAgreementNo: 'external_agreement_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      thirdPartyId: 'string',
      externalAgreementNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateWithholdQrcodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 二维码图片链接地址
  qrCodeUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      qrCodeUrl: 'qr_code_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      qrCodeUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelContractPaysingletradeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 智能合同id
  flowId: string;
  // 被取消的某一期的代扣id
  cancelOutOrderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      cancelOutOrderNo: 'cancel_out_order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      cancelOutOrderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelContractPaysingletradeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误码，0表示成功
  code?: number;
  // 错误信息描述
  errMessage?: string;
  // 被取消的某一期代扣订单id
  canceledOutTradeNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      canceledOutTradeNo: 'canceled_out_trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      canceledOutTradeNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyContractCallbackkeyRequest extends $tea.Model {
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

export class ApplyContractCallbackkeyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 加签使用的key
  key?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      key: 'key',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      key: 'string',
      code: 'number',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractOnestepflowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 是否自动归档，默认false。
  autoArchive?: boolean;
  // 是否自动开启，默认false。
  autoInitiate?: boolean;
  // 文件主题
  businessScene: string;
  // 流程备注
  comment?: string;
  // 任务配置信息
  contractSignFlowConfig?: ContractSignFlowConfig;
  // 待签文档信息
  docs?: ContractDoc[];
  // 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
  initiatorAccountId?: string;
  // 发起方主体id，如存在个人代机构发起签约，则需传入机构id；如不传，则默认是对接平台
  initiatorAuthorizedAccountId?: string;
  // 流程中的签署区信息
  signFields?: OneStepSignField[];
  // 签署平台，ALIPAY（支付宝小程序）或H5，默认H5
  signPlatform?: string;
  // 签署有效截止日期，毫秒，默认3天失效
  signValidity?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      autoArchive: 'auto_archive',
      autoInitiate: 'auto_initiate',
      businessScene: 'business_scene',
      comment: 'comment',
      contractSignFlowConfig: 'contract_sign_flow_config',
      docs: 'docs',
      initiatorAccountId: 'initiator_account_id',
      initiatorAuthorizedAccountId: 'initiator_authorized_account_id',
      signFields: 'sign_fields',
      signPlatform: 'sign_platform',
      signValidity: 'sign_validity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      autoArchive: 'boolean',
      autoInitiate: 'boolean',
      businessScene: 'string',
      comment: 'string',
      contractSignFlowConfig: ContractSignFlowConfig,
      docs: { 'type': 'array', 'itemType': ContractDoc },
      initiatorAccountId: 'string',
      initiatorAuthorizedAccountId: 'string',
      signFields: { 'type': 'array', 'itemType': OneStepSignField },
      signPlatform: 'string',
      signValidity: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractOnestepflowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 流程ID
  flowId?: string;
  // 业务码信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      flowId: 'flow_id',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      flowId: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractNotaryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 签署流程ID
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

export class QueryContractNotaryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  // 存证信息列表
  notaries?: ContractNotaryInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      notaries: 'notaries',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      notaries: { 'type': 'array', 'itemType': ContractNotaryInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateEcocontractTransRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 存证关联实体（个人/企业）的身份识别信息
  customer: Identity;
  // 扩展属性
  properties?: string;
  // 业务子类型标识
  subBizId?: string;
  // 是否使用可信时间戳，默认为false
  tsr?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      customer: 'customer',
      properties: 'properties',
      subBizId: 'sub_biz_id',
      tsr: 'tsr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      customer: Identity,
      properties: 'string',
      subBizId: 'string',
      tsr: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateEcocontractTransResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回事务ID，全局唯一
  transactionId?: string;
  // 可信时间信息
  tsr?: TsrResponse;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      transactionId: 'transaction_id',
      tsr: 'tsr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      transactionId: 'string',
      tsr: TsrResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateEcocontractTextRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 签署结束信息，phase为FINISH时必选
  finishInfo?: ContractNotaryFinishInfo;
  // 签署流程ID
  flowId: string;
  // 签署发起信息，phase为INIT时必选
  initInfo?: ContractNotaryInitInfo;
  // 存证阶段，分为INIT(发起)，SIGN(签署)，FINISH(结束)
  phase: string;
  // 签署过程信息，phase为SIGN时必选
  signInfo?: ContractNotarySignInfo;
  // 存证事务ID
  transactionId: string;
  // 签署文件存档阶段存证核验信息
  documentInfo?: ContractNotaryDocumentInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      finishInfo: 'finish_info',
      flowId: 'flow_id',
      initInfo: 'init_info',
      phase: 'phase',
      signInfo: 'sign_info',
      transactionId: 'transaction_id',
      documentInfo: 'document_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      finishInfo: ContractNotaryFinishInfo,
      flowId: 'string',
      initInfo: ContractNotaryInitInfo,
      phase: 'string',
      signInfo: ContractNotarySignInfo,
      transactionId: 'string',
      documentInfo: ContractNotaryDocumentInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateEcocontractTextResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证凭据,
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractWordspositionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文档id
  fileId: string;
  // 关键字列表，逗号分割；注意要英文的逗号，不能中文逗号；关键字建议不要设置特殊字符，因Adobe无法识别部分符号，某些特殊字符会因解析失败从而导致搜索不到
  keywords: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileId: 'file_id',
      keywords: 'keywords',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileId: 'string',
      keywords: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractWordspositionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  // 文档id
  fileId?: string;
  // 关键字位置列表
  data?: KeywordsPosition[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      fileId: 'file_id',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      fileId: 'string',
      data: { 'type': 'array', 'itemType': KeywordsPosition },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteContractSignerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 签署流程ID
  flowId: string;
  // 签署人ID
  accountId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      accountId: 'account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      accountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteContractSignerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetContractCertificateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 签署流程ID
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

export class GetContractCertificateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 下载文件地址(一小时内有效)
  url?: string;
  // 状态值
  code?: number;
  // 	状态信息描述
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      url: 'url',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      url: 'string',
      code: 'number',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractSignfieldsealidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程id
  flowId: string;
  // 账号id，默认所有签署人
  accountId?: string;
  // 指定签署区id列表，逗号分割，默认所有签署区
  signfieldIds?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      accountId: 'account_id',
      signfieldIds: 'signfield_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      accountId: 'string',
      signfieldIds: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractSignfieldsealidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: string;
  // 业务码信息
  message?: string;
  // 签署区列表数据
  signfields?: ContractSignFieldSealId[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      signfields: 'signfields',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      message: 'string',
      signfields: { 'type': 'array', 'itemType': ContractSignFieldSealId },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyContractSignerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合同签署流程ID
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

export class NotifyContractSignerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功。
  code?: number;
  // 业务码信息
  message?: string;
  // 发送通知的用户账号列表
  accountList?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      accountList: 'account_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      accountList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateContractPlatformRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 平台方企业信息
  platform: ContractPlatformOrganizationApplication;
  // 平台方经办人信息
  creator?: ContractPlatformAccountApplication;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      platform: 'platform',
      creator: 'creator',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      platform: ContractPlatformOrganizationApplication,
      creator: ContractPlatformAccountApplication,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateContractPlatformResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码
  code?: string;
  // 状态信息
  message?: string;
  // 更新后平台方企业信息
  platform?: ContractPlatformApplication;
  // 更新后平台方经办人信息
  creator?: ContractCreatorApplication;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      platform: 'platform',
      creator: 'creator',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      message: 'string',
      platform: ContractPlatformApplication,
      creator: ContractCreatorApplication,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateContractUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 邮箱地址，默认不变
  email?: string;
  // 证件号，该字段只有为空才允许修改
  idNumber?: string;
  // 证件类型，默认为身份证
  idType?: string;
  // 手机号码，默认不变
  mobile?: string;
  // 姓名，默认不变
  name?: string;
  // 用户账号id，注册用户返回的个人账号id
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      email: 'email',
      idNumber: 'id_number',
      idType: 'id_type',
      mobile: 'mobile',
      name: 'name',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      email: 'string',
      idNumber: 'string',
      idType: 'string',
      mobile: 'string',
      name: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateContractUserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码
  code?: string;
  // 状态信息
  message?: string;
  // 邮箱地址
  email?: string;
  // 证件号
  idNumber?: string;
  // 证件类型
  idType?: string;
  // 手机号码
  mobile?: string;
  // 姓名
  name?: string;
  // 用户账号id
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      email: 'email',
      idNumber: 'id_number',
      idType: 'id_type',
      mobile: 'mobile',
      name: 'name',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      message: 'string',
      email: 'string',
      idNumber: 'string',
      idType: 'string',
      mobile: 'string',
      name: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateContractOrganizationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 证件号，该字段只有为空才允许修改
  idNumber?: string;
  // 证件类型 ，默认CRED_ORG_USCC
  idType?: string;
  // 企业法定代表人名称
  legalPerson?: string;
  // 企业法定代表人证件号
  legalPersonId?: string;
  // 机构名称
  name?: string;
  // 机构账号id，注册机构账户时返回的机构账号id
  organizationId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      idNumber: 'id_number',
      idType: 'id_type',
      legalPerson: 'legal_person',
      legalPersonId: 'legal_person_id',
      name: 'name',
      organizationId: 'organization_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      idNumber: 'string',
      idType: 'string',
      legalPerson: 'string',
      legalPersonId: 'string',
      name: 'string',
      organizationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateContractOrganizationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 证件号
  idNumber?: string;
  // 证件类型
  idType?: string;
  // 企业法人名称
  legalPerson?: string;
  // 企业法人证件号
  legalPersonId?: string;
  // 机构名称
  name?: string;
  // 机构账号id
  organizationId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      idNumber: 'id_number',
      idType: 'id_type',
      legalPerson: 'legal_person',
      legalPersonId: 'legal_person_id',
      name: 'name',
      organizationId: 'organization_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      idNumber: 'string',
      idType: 'string',
      legalPerson: 'string',
      legalPersonId: 'string',
      name: 'string',
      organizationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyContractMerchantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 入驻信息，必须是json字符串
  bizContent: string;
  // 代理商户账户ID，此参数传null默认平台机构账户入驻，不允许传空字符串
  agentAccountId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
      agentAccountId: 'agent_account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
      agentAccountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyContractMerchantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否进件成功
  success?: boolean;
  // 进件子结果码，0 成功，1 代理商户已进件，2 商户已进件，请走挂接接口进行代理商挂接，3 商户进件中
  subCode?: number;
  // 进件失败原因
  subMsg?: string;
  // 已进件商户信息（当cert_no对应的商户已经进件过，会返回完整的已进件的商户信息）
  merchantInfo?: string;
  // 已进件成功的商户ID（当cert_no表示的商户已经进件过，会返回进件生成的商户ID）
  smid?: string;
  // 订单ID
  orderId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
      merchantInfo: 'merchant_info',
      smid: 'smid',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      subCode: 'number',
      subMsg: 'string',
      merchantInfo: 'string',
      smid: 'string',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmContractMerchantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户入驻查询订单id
  orderId: string;
  // 代理商户账户ID，此参数不填默认平台机构账户入驻
  agentAccountId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      agentAccountId: 'agent_account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      agentAccountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmContractMerchantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 额外信息，包含smid
  extInfo?: string;
  // 支付宝的ipRoleId
  ipRoleId?: string[];
  // 申请时间
  applyId?: string;
  // 商户名称
  merchantName?: string;
  // 直付通商户进件的状态
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      extInfo: 'ext_info',
      ipRoleId: 'ip_role_id',
      applyId: 'apply_id',
      merchantName: 'merchant_name',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      extInfo: 'string',
      ipRoleId: { 'type': 'array', 'itemType': 'string' },
      applyId: 'string',
      merchantName: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreatePrivatecontractTransRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 存证关联实体（个人/企业）的身份识别信息
  customer: Identity;
  // 扩展属性
  properties?: string;
  // 业务子类型标识
  subBizId?: string;
  // 是否使用可信时间戳，默认为false
  tsr?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      customer: 'customer',
      properties: 'properties',
      subBizId: 'sub_biz_id',
      tsr: 'tsr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      customer: Identity,
      properties: 'string',
      subBizId: 'string',
      tsr: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreatePrivatecontractTransResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回事务ID，全局唯一
  transactionId?: string;
  // 可信时间信息
  tsr?: TsrResponse;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      transactionId: 'transaction_id',
      tsr: 'tsr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      transactionId: 'string',
      tsr: TsrResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreatePrivatecontractTextRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 签署结束信息，phase为FINISH时必选
  finishInfo?: ContractNotaryFinishInfo;
  // 签署流程ID
  flowId: string;
  // 	签署发起信息，phase为INIT时必选
  initInfo?: ContractNotaryInitInfo;
  // 存证阶段，分为INIT(发起)，SIGN(签署)，FINISH(结束)
  phase: string;
  // 签署过程信息，phase为SIGN时必选
  signInfo?: ContractNotarySignInfo;
  // 存证事务ID
  transactionId: string;
  // 签署文件存档阶段存证核验信息
  documentInfo?: ContractNotaryDocumentInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      finishInfo: 'finish_info',
      flowId: 'flow_id',
      initInfo: 'init_info',
      phase: 'phase',
      signInfo: 'sign_info',
      transactionId: 'transaction_id',
      documentInfo: 'document_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      finishInfo: ContractNotaryFinishInfo,
      flowId: 'string',
      initInfo: ContractNotaryInitInfo,
      phase: 'string',
      signInfo: ContractNotarySignInfo,
      transactionId: 'string',
      documentInfo: ContractNotaryDocumentInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreatePrivatecontractTextResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证凭据,
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyPrivatepersonTwometaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 个人信息
  personInfo: PersonInfo;
  // 私有云实例id
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      personInfo: 'person_info',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      personInfo: PersonInfo,
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyPrivatepersonTwometaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 调用返回值。"0"为调用成功。
  code?: string;
  // 校验是否通过。
  pass?: boolean;
  // 错误信息描述
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      pass: 'pass',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      pass: 'boolean',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyPrivatecompanyTwometaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 私有云实例id
  instanceId: string;
  // 企业信息
  companyTwoMetaInfo: CompanyTwoMetaInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      companyTwoMetaInfo: 'company_two_meta_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      companyTwoMetaInfo: CompanyTwoMetaInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyPrivatecompanyTwometaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 调用返回值。"0"为调用成功。
  code?: string;
  // 校验是否通过。
  pass?: boolean;
  // 错误信息描述
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      pass: 'pass',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      pass: 'boolean',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyPrivatecompanyFourmetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 私有云实例id
  instanceId: string;
  // 企业信息
  companyFourMetaInfo: CompanyFourMetaInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      companyFourMetaInfo: 'company_four_meta_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      companyFourMetaInfo: CompanyFourMetaInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyPrivatecompanyFourmetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 调用返回值。"0"为调用成功。
  code?: string;
  // 校验是否通过。
  pass?: boolean;
  // 错误信息描述
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      pass: 'pass',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      pass: 'boolean',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyPrivatecontractCertRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 私有云实例id
  instanceId: string;
  // 私有云系统内部生成的id
  userInnerId: string;
  // 用户类型,个人PERSON，企业ORG
  userType: string;
  // 用户名称, 个人为个人名称，企业为企业名称
  userName: string;
  // 用户证件类型，默认个人,身份证CRED_PSN_CH_IDCARD；
  // 企业,统一社会信用代码,CRED_ORG_USCC
  userCertType: string;
  // 证件号码
  userCertNumber: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      userInnerId: 'user_inner_id',
      userType: 'user_type',
      userName: 'user_name',
      userCertType: 'user_cert_type',
      userCertNumber: 'user_cert_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      userInnerId: 'string',
      userType: 'string',
      userName: 'string',
      userCertType: 'string',
      userCertNumber: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyPrivatecontractCertResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 注册是否成功
  success?: boolean;
  // 返回code,200成功，其他均为失败
  code?: string;
  // 返回信息，成功返回success，错误时会返回详细信息。
  message?: string;
  // 用户的CA证书办法机构
  certAuthOrg?: string;
  // 用户的CA证书序列号
  certSerialNumber?: string;
  // 用户证书过期时间
  certEndTime?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      code: 'code',
      message: 'message',
      certAuthOrg: 'cert_auth_org',
      certSerialNumber: 'cert_serial_number',
      certEndTime: 'cert_end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      code: 'string',
      message: 'string',
      certAuthOrg: 'string',
      certSerialNumber: 'string',
      certEndTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractTradestatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 代扣计划外部订单号
  outTradeNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outTradeNo: 'out_trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outTradeNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractTradestatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 代扣计划的外部订单号
  outTradeNo?: string;
  // 最近一次扣款触发时间戳（单位：ms）
  deductTime?: string;
  // 创建代扣计划时设置的扣款时间戳（单位：ms）
  payDate?: string;
  // 计划扣款金额（单位：分）
  payMoney?: number;
  // 扣款状态
  // PAY_TOBE_TRIGGER 初始未扣款
  // PAY_TRIGGERING 准备扣款状态
  // WAIT_BUYER_PAY 扣款中状态
  // PAY_SYNC_TRADE_SUCCESS 扣款中状态
  // TRADE_REFUNDED 已发生退款
  // TRADE_CLOSED 交易终止（未成功）
  // TRADE_SUCCESS 扣款成功
  // PAY_FAIL 扣款失败
  // TRADE_FINISHED 交易终止（扣款成功）
  // TRADE_CANCEL 代扣取消
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      outTradeNo: 'out_trade_no',
      deductTime: 'deduct_time',
      payDate: 'pay_date',
      payMoney: 'pay_money',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      outTradeNo: 'string',
      deductTime: 'string',
      payDate: 'string',
      payMoney: 'number',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractRefundRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 退款ID，用户调用退款接口时传入的自定义第三方id
  refundId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      refundId: 'refund_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      refundId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractRefundResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 退款id
  refundId?: string;
  // 退款时间（时间戳，单位：ms）
  refundTime?: string;
  // 本次退款请求的退款金额（单位：分）
  refundAmount?: number;
  // 退款状态
  // REFUNDING 退款中
  // SUCCESS 退款成功
  // FAIL 退款失败
  status?: string;
  // 退款错误信息
  errMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      refundId: 'refund_id',
      refundTime: 'refund_time',
      refundAmount: 'refund_amount',
      status: 'status',
      errMsg: 'err_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      refundId: 'string',
      refundTime: 'string',
      refundAmount: 'number',
      status: 'string',
      errMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetPrivatecontractSignurlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 私有云实例id
  instanceId: string;
  // 签署流程ID
  flowId: string;
  // 签署用户的内部ID
  userInnerId: string;
  // 签署平台，默认为H5页面，浏览器打开；也可填写ALIPAY，使用支付宝小程序打开
  signPlatform?: string;
  // 签署流程过期时间
  expirationTime: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      flowId: 'flow_id',
      userInnerId: 'user_inner_id',
      signPlatform: 'sign_platform',
      expirationTime: 'expiration_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      flowId: 'string',
      userInnerId: 'string',
      signPlatform: 'string',
      expirationTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetPrivatecontractSignurlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 流程签署地址
  signUrl?: string;
  // 返回code,200成功，其他均为失败
  code?: string;
  // 返回信息，成功返回success，错误时会返回详细信息。
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      signUrl: 'sign_url',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      signUrl: 'string',
      code: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractMerchantorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 申请单id，通过twc.notary.contract.merchant.apply或者twc.notary.contract.merchantindirectzft.create接口返回的order_id
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

export class QueryContractMerchantorderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 申请单id
  orderId?: string;
  // 外部商户id
  externalId?: string;
  // 进件时填写的商户名称
  merchantName?: string;
  // 申请总体状态。99:已完结;-1:失败;031:审核中
  status?: string;
  // 申请单创建时间
  applyTime?: string;
  // 风控审核状态。CREATE：已创建待审批、SKIP：跳过风控审批步骤、PASS：风控审核通过、REJECT：风控审批拒绝
  fkAudit?: string;
  // 风控审批备注，如有则返回
  fkAuditMemo?: string;
  // 客资审核状态。CREATE：已创建待审批、SKIP：跳过客资审批步骤、PASS：客资审核通过、REJECT：客资审批拒绝
  kzAudit?: string;
  // 客资审批备注，如有则返回
  kzAuditMemo?: string;
  // 二级商户确认状态。CREATE：已发起二级商户确认、SKIP：无需确认、FAIL：签约失败、NOT_CONFIRM：商户未确认、FINISH签约完成
  subConfirm?: string;
  // 进件生成的卡编号，在发起结算时可以作为结算账号
  cardAliasNo?: string;
  // 二级商户id。当总体申请状态status为99时，smid才算进件完成
  smid?: string;
  // 本申请单的请求类型。一般可选值包括ZHIFUTONG_CONSULT（直付通商户预校验）/ZHIFUTONG_CREATE（直付通商户创建）/ZHIFUTONG_MODIFY（直付通商户修改）
  applyType?: string;
  // 申请单处理失败时，通过此此段返回具体的失败理由；与kf_audit_memo和kz_audit_memo配合使用
  reason?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
      externalId: 'external_id',
      merchantName: 'merchant_name',
      status: 'status',
      applyTime: 'apply_time',
      fkAudit: 'fk_audit',
      fkAuditMemo: 'fk_audit_memo',
      kzAudit: 'kz_audit',
      kzAuditMemo: 'kz_audit_memo',
      subConfirm: 'sub_confirm',
      cardAliasNo: 'card_alias_no',
      smid: 'smid',
      applyType: 'apply_type',
      reason: 'reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
      externalId: 'string',
      merchantName: 'string',
      status: 'string',
      applyTime: 'string',
      fkAudit: 'string',
      fkAuditMemo: 'string',
      kzAudit: 'string',
      kzAuditMemo: 'string',
      subConfirm: 'string',
      cardAliasNo: 'string',
      smid: 'string',
      applyType: 'string',
      reason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateContractMerchantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 内容和商户进件信息类似，唯一区别在于此接口biz_content不要传external_id，改为传之前进件获取到的商户id信息smid，具体可见示例。
  bizContent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateContractMerchantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 修改进件信息会产生修改订单，此字段标识修改订单id
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

export class BindContractMerchantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户ID
  smid: string;
  // 商户证件号
  certNo: string;
  // 代理用户id，传null默认挂接平台方，不允许传空字符串
  agentAccountId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      smid: 'smid',
      certNo: 'cert_no',
      agentAccountId: 'agent_account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      smid: 'string',
      certNo: 'string',
      agentAccountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindContractMerchantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否挂接成功
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

export class InitPrivatecontractIntanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 私有化服务地址（可不上传，后续通过更新实例信息的接口进行服务地址填充）
  serviceUrl?: string;
  // 开通服务的用户租户ID
  tenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceUrl: 'service_url',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceUrl: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitPrivatecontractIntanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 私有化服务实例ID
  instanceId?: string;
  // 签名私钥的base64格式字符串
  privateKey?: string;
  // 验签公钥的base64格式字符串
  publicKey?: string;
  // 回调使用的签名私钥
  privateKeyCallback?: string;
  // 回调使用的验签公钥
  publicKeyCallback?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      instanceId: 'instance_id',
      privateKey: 'private_key',
      publicKey: 'public_key',
      privateKeyCallback: 'private_key_callback',
      publicKeyCallback: 'public_key_callback',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      instanceId: 'string',
      privateKey: 'string',
      publicKey: 'string',
      privateKeyCallback: 'string',
      publicKeyCallback: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdatePrivatecontractIntanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 私有化服务地址
  serviceUrl: string;
  // 实例ID
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceUrl: 'service_url',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceUrl: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdatePrivatecontractIntanceResponse extends $tea.Model {
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

export class UpdatePrivatecontractCertRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 私有云实例id
  instanceId: string;
  // 私有云系统内部生成的用户id	
  // 
  userInnerId: string;
  // 用户类型,个人PERSON，企业ORG	
  userType: string;
  // 用户名称, 个人为个人名称，企业为企业名称	
  // 
  userName: string;
  // 用户证件类型，默认个人,身份证CRED_PSN_CH_IDCARD； 企业,统一社会信用代码,CRED_ORG_USCC	
  // 
  userCertType: string;
  // 证件号码	
  userCertNumber: string;
  // 是否需要更新机构印模
  updateOrgSeal: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      userInnerId: 'user_inner_id',
      userType: 'user_type',
      userName: 'user_name',
      userCertType: 'user_cert_type',
      userCertNumber: 'user_cert_number',
      updateOrgSeal: 'update_org_seal',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      userInnerId: 'string',
      userType: 'string',
      userName: 'string',
      userCertType: 'string',
      userCertNumber: 'string',
      updateOrgSeal: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdatePrivatecontractCertResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 更新是否成功	
  // 
  success?: boolean;
  // 返回code,0成功，其他均为失败	
  // 
  code?: string;
  // 返回信息，成功返回success，错误时会返回详细信息。
  message?: string;
  // 用户的CA证书办法机构	
  certAuthOrg?: string;
  // 用户的CA证书序列号
  certSerialNumber?: string;
  // 用户证书过期时间	
  certEndTime?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      code: 'code',
      message: 'message',
      certAuthOrg: 'cert_auth_org',
      certSerialNumber: 'cert_serial_number',
      certEndTime: 'cert_end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      code: 'string',
      message: 'string',
      certAuthOrg: 'string',
      certSerialNumber: 'string',
      certEndTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ResetContractMerchantapplyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 进件或进件修改申请订单id，从进件申请接口的返回字段中获取
  orderId: string;
  // 进件类型,1 创建、2 修改、3 申请创建、4 申请修改
  applyType: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      applyType: 'apply_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      applyType: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ResetContractMerchantapplyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
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

export class CheckPrivatecontractProvisionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 私有云合同服务实例ID
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckPrivatecontractProvisionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 服务开通状态，0未找到，1已开通，2停服，3已释放
  status?: number;
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
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushPrivatecontractGaugeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 私有云合同服务实例ID
  instanceId: string;
  // 计量数量
  amount: number;
  // 本次上报的唯一订单幂等ID，用流程ID和文件ID拼接生成
  orderId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      amount: 'amount',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      amount: 'number',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushPrivatecontractGaugeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否上报成功
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

export class CheckContractCourtdeductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 付款账户人姓名
  payerName: string;
  // 付款人银行账户
  payerAccount: string;
  // 银行类型：icbc(工行)
  bankType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      payerName: 'payer_name',
      payerAccount: 'payer_account',
      bankType: 'bank_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      payerName: 'string',
      payerAccount: 'string',
      bankType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckContractCourtdeductResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否预校验成功
  success?: boolean;
  // 预校验详细信息
  checkMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      checkMsg: 'check_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      checkMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractCourtdeductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程id
  flowId: string;
  // 客户自定义案件id
  caseId: string;
  // 案件名称
  caseName: string;
  // 收款方人姓名
  payeeName: string;
  // 收款方人银行账户
  payeeAccount: string;
  // 收款方银行类型
  payeeBankType: string;
  // 付款方人姓名
  payerName: string;
  // 付款方银行账户
  payerAccount: string;
  // 付款方银行类型，例如：icbc（工行）
  payerBankType: string;
  // 扣款计划详情列表
  paymentDetailList: PaymentDetail[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      caseId: 'case_id',
      caseName: 'case_name',
      payeeName: 'payee_name',
      payeeAccount: 'payee_account',
      payeeBankType: 'payee_bank_type',
      payerName: 'payer_name',
      payerAccount: 'payer_account',
      payerBankType: 'payer_bank_type',
      paymentDetailList: 'payment_detail_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      caseId: 'string',
      caseName: 'string',
      payeeName: 'string',
      payeeAccount: 'string',
      payeeBankType: 'string',
      payerName: 'string',
      payerAccount: 'string',
      payerBankType: 'string',
      paymentDetailList: { 'type': 'array', 'itemType': PaymentDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractCourtdeductResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 给工行上传的调解书文件名
  fileName?: string;
  // 存证txHash，存证核验时需要
  txHash?: string;
  // 存证原文
  notaryContent?: string;
  // 存证原文hash
  notaryContentHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      fileName: 'file_name',
      txHash: 'tx_hash',
      notaryContent: 'notary_content',
      notaryContentHash: 'notary_content_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      fileName: 'string',
      txHash: 'string',
      notaryContent: 'string',
      notaryContentHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecContractCourtdeductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 付款银行卡类型，例如：icbc（工行）
  bankType: string;
  // 自定义交易id
  bizTradeId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bankType: 'bank_type',
      bizTradeId: 'biz_trade_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bankType: 'string',
      bizTradeId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecContractCourtdeductResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否执行成功
  success?: boolean;
  // 扣款金额，单位：分
  payMoney?: number;
  // 扣款详情信息
  payDetailMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      payMoney: 'pay_money',
      payDetailMsg: 'pay_detail_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      payMoney: 'number',
      payDetailMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetContractTextsignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 平台方注册的用户ID
  accountId: string;
  // 待签名的原文本
  originText: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountId: 'account_id',
      originText: 'origin_text',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountId: 'string',
      originText: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetContractTextsignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务结果码, 成功: 0
  code?: number;
  // 业务结果信息
  message?: string;
  // 签名结果值
  signResult?: string;
  // 签名流程id
  flowId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      signResult: 'sign_result',
      flowId: 'flow_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      signResult: 'string',
      flowId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyContractTextsignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 注册的平台方用户id
  accountId: string;
  // 签名原文本
  originText: string;
  // 文本签名值
  signResult: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountId: 'account_id',
      originText: 'origin_text',
      signResult: 'sign_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountId: 'string',
      originText: 'string',
      signResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyContractTextsignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务结果码, 成功0
  code?: number;
  // 结果信息
  message?: string;
  // 签署信息, 包含签名与证书
  signInfo?: ContractTextSignVerifySignInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      signInfo: 'sign_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      signInfo: ContractTextSignVerifySignInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyContractDocsignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件id
  fileId: string;
  // 平台方用户注册id
  accountId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileId: 'file_id',
      accountId: 'account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileId: 'string',
      accountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyContractDocsignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果码
  code?: number;
  // 结果信息
  message?: string;
  // 文件签署信息
  signInfos?: ContractDocSignVerifyInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      signInfos: 'sign_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      signInfos: { 'type': 'array', 'itemType': ContractDocSignVerifyInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteContractSignfieldRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 签署流程id
  flowId: string;
  // 删除签署区id列表
  deleteSignfields: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      deleteSignfields: 'delete_signfields',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      deleteSignfields: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteContractSignfieldResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否操作成功
  success?: boolean;
  // 结果码(数字), 成功0
  code?: number;
  // 结果备注（具体错误解释）
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      code: 'number',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncInnerTransRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 事务id
  id: number;
  // 存证事务id
  transactionId: string;
  // 存证的用户id
  accountId: string;
  // 业务id
  bizId: number;
  // 子业务id
  subBizId?: string;
  // 存证主体的json字符串
  customer?: string;
  // 存证初始化时间
  registerTime: number;
  // 到期时间
  expireTime?: number;
  // 扩展属性
  properties?: string;
  // 是否有效
  active?: boolean;
  // 交易hash
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      transactionId: 'transaction_id',
      accountId: 'account_id',
      bizId: 'biz_id',
      subBizId: 'sub_biz_id',
      customer: 'customer',
      registerTime: 'register_time',
      expireTime: 'expire_time',
      properties: 'properties',
      active: 'active',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      transactionId: 'string',
      accountId: 'string',
      bizId: 'number',
      subBizId: 'string',
      customer: 'string',
      registerTime: 'number',
      expireTime: 'number',
      properties: 'string',
      active: 'boolean',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncInnerTransResponse extends $tea.Model {
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

export class SyncInnerNotaryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // DB的存证id
  id: number;
  // 事务id
  transactionId: string;
  // 交易hash
  txHash?: string;
  // 阶段
  phase: string;
  // 内容hash
  contentHash: string;
  // 创建时间
  createTime?: number;
  // 存证类型
  notaryType: string;
  // 大小
  notarySize?: number;
  // 用户id
  accountId: string;
  // 业务id
  bizId: number;
  // 子业务id
  subBizId?: string;
  // 是否需要可信时间
  tsr?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      transactionId: 'transaction_id',
      txHash: 'tx_hash',
      phase: 'phase',
      contentHash: 'content_hash',
      createTime: 'create_time',
      notaryType: 'notary_type',
      notarySize: 'notary_size',
      accountId: 'account_id',
      bizId: 'biz_id',
      subBizId: 'sub_biz_id',
      tsr: 'tsr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      transactionId: 'string',
      txHash: 'string',
      phase: 'string',
      contentHash: 'string',
      createTime: 'number',
      notaryType: 'string',
      notarySize: 'number',
      accountId: 'string',
      bizId: 'number',
      subBizId: 'string',
      tsr: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncInnerNotaryResponse extends $tea.Model {
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

export class SyncInnerTwcopenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // id
  id: number;
  // 租户id
  tenantId: string;
  // 产品code
  productCode: string;
  // 状态
  status: string;
  // 业务id
  bizId: number;
  // 开通渠道
  orderChannel: number;
  // 创建时间
  gmtCreate: number;
  // 修改时间
  gmtModified: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      tenantId: 'tenant_id',
      productCode: 'product_code',
      status: 'status',
      bizId: 'biz_id',
      orderChannel: 'order_channel',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      tenantId: 'string',
      productCode: 'string',
      status: 'string',
      bizId: 'number',
      orderChannel: 'number',
      gmtCreate: 'number',
      gmtModified: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncInnerTwcopenResponse extends $tea.Model {
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

export class SyncInnerProvisionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 自增id
  id: number;
  // 创建时间
  gmtCreate: number;
  // 修改时间
  gmtModified?: number;
  // 租户id
  tenantId: string;
  // 租户名称
  tenantName?: string;
  // 产品码
  productCode: string;
  // 是否正式账号
  isOfficial?: boolean;
  // 业务分类
  bizId: number;
  // 是否法院节点
  legalAccount?: boolean;
  // 服务状态
  status: number;
  // 商品开通实例id
  instanceId?: string;
  // 订单渠道
  orderChannel?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      tenantId: 'tenant_id',
      tenantName: 'tenant_name',
      productCode: 'product_code',
      isOfficial: 'is_official',
      bizId: 'biz_id',
      legalAccount: 'legal_account',
      status: 'status',
      instanceId: 'instance_id',
      orderChannel: 'order_channel',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      gmtCreate: 'number',
      gmtModified: 'number',
      tenantId: 'string',
      tenantName: 'string',
      productCode: 'string',
      isOfficial: 'boolean',
      bizId: 'number',
      legalAccount: 'boolean',
      status: 'number',
      instanceId: 'string',
      orderChannel: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncInnerProvisionResponse extends $tea.Model {
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

export class SyncInnerTsrRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // tsr的token信息
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

export class SyncInnerTsrResponse extends $tea.Model {
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

export class CheckEpidentityTwometaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 认证企业名称。
  epCertName: string;
  // 企业证件号码。
  epCertNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      epCertName: 'string',
      epCertNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckEpidentityTwometaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 企业状态。
  enterpriseStatus?: string;
  // 营业期限。
  openTime?: string;
  // 核验是否通过。
  passed?: boolean;
  // 0:核验成功 1:企业信息有误 2:企业非正常营业
  code?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      enterpriseStatus: 'enterprise_status',
      openTime: 'open_time',
      passed: 'passed',
      code: 'code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      enterpriseStatus: 'string',
      openTime: 'string',
      passed: 'boolean',
      code: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckEpidentityThreemetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 认证企业名称。
  epCertName: string;
  // 企业证件号码。
  epCertNo: string;
  // 企业法人姓名。
  legalPersonCertName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
      legalPersonCertName: 'legal_person_cert_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      epCertName: 'string',
      epCertNo: 'string',
      legalPersonCertName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckEpidentityThreemetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 企业状态。
  enterpriseStatus?: string;
  // 营业期限。
  openTime?: string;
  // 核验是否通过。
  passed?: boolean;
  // 0:核验成功 1:企业信息有误 2:企业非正常营业
  code?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      enterpriseStatus: 'enterprise_status',
      openTime: 'open_time',
      passed: 'passed',
      code: 'code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      enterpriseStatus: 'string',
      openTime: 'string',
      passed: 'boolean',
      code: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckEpidentityFourmetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 认证企业名称。
  epCertName: string;
  // 企业证件号码。
  epCertNo: string;
  // 企业法人姓名。
  legalPersonCertName: string;
  // 企业法人身份证号码。
  legalPersonCertNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
      legalPersonCertName: 'legal_person_cert_name',
      legalPersonCertNo: 'legal_person_cert_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      epCertName: 'string',
      epCertNo: 'string',
      legalPersonCertName: 'string',
      legalPersonCertNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckEpidentityFourmetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 企业状态。
  enterpriseStatus?: string;
  // 营业期限。
  openTime?: string;
  // 核验是否通过。
  passed?: boolean;
  // 0:核验成功 1:企业信息有误 2:企业非正常营业
  code?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      enterpriseStatus: 'enterprise_status',
      openTime: 'open_time',
      passed: 'passed',
      code: 'code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      enterpriseStatus: 'string',
      openTime: 'string',
      passed: 'boolean',
      code: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckNotarizationOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 公证订单ID号
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

export class CheckNotarizationOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 下单的业务类型ID列表
  bizId?: string[];
  // 实人认证接口调用授权码，与公证订单一一对应，有效次数默认为3次，超过调用次数则失效
  faceAuthCode?: string;
  // 下单客户的账号ID
  userId?: string;
  // 是否为合法订单
  valid?: boolean;
  // 平台公证机构ID
  orgId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizId: 'biz_id',
      faceAuthCode: 'face_auth_code',
      userId: 'user_id',
      valid: 'valid',
      orgId: 'org_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizId: { 'type': 'array', 'itemType': 'string' },
      faceAuthCode: 'string',
      userId: 'string',
      valid: 'boolean',
      orgId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateNotarizationOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 公证订单ID
  orderId: string;
  // 如果出证失败，需要给出失败原因
  reason?: string;
  // 出证状态的枚举值
  status: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      reason: 'reason',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      reason: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateNotarizationOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态是否更新成功
  accepted?: boolean;
  // 如更新失败，返回失败原因
  reason?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accepted: 'accepted',
      reason: 'reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accepted: 'boolean',
      reason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetNotarizationOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 公证事项ID
  bizCode?: string;
  // 需设置的属性名称
  key: string;
  // 公证订单ID
  orderId: string;
  // 被设置字段的值
  value: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizCode: 'biz_code',
      key: 'key',
      orderId: 'order_id',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizCode: 'string',
      key: 'string',
      orderId: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetNotarizationOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否设置成功
  accepted?: boolean;
  // 如设置失败，返回失败原因
  reason?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accepted: 'accepted',
      reason: 'reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accepted: 'boolean',
      reason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitIdentificationFaceauthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 认证人的姓名
  certName: string;
  // 被验证者的身份证号码
  certNo: string;
  // 授权码，针对某些特定场景使用，非必填
  authCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certName: 'cert_name',
      certNo: 'cert_no',
      authCode: 'auth_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certName: 'string',
      certNo: 'string',
      authCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitIdentificationFaceauthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发起一个实人认证流程，获取到流程ID
  certifyId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyId: 'certify_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CertifyIdentificationFaceauthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实人认证流程ID
  certifyId: string;
  // 认证流程结束回调通知地址，非必传
  callbackUrl?: string;
  // 认证结束后跳转地址，非必填
  redirectUrl?: string;
  // 授权码，针对某些特定场景使用，非必填
  authCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certifyId: 'certify_id',
      callbackUrl: 'callback_url',
      redirectUrl: 'redirect_url',
      authCode: 'auth_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certifyId: 'string',
      callbackUrl: 'string',
      redirectUrl: 'string',
      authCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CertifyIdentificationFaceauthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 实人认证流程ID
  certifyId?: string;
  // 发起实人认证的地址
  verifyUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyId: 'certify_id',
      verifyUrl: 'verify_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyId: 'string',
      verifyUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIdentificationFaceauthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实人认证流程ID
  certifyId: string;
  // 授权码，针对某些特定场景使用，非必填
  authCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certifyId: 'certify_id',
      authCode: 'auth_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certifyId: 'string',
      authCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIdentificationFaceauthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 实人认证流程ID
  certifyId?: string;
  // 是否通过实人认证
  passed?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyId: 'certify_id',
      passed: 'passed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyId: 'string',
      passed: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEnterpriseFaceauthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业法人认证查询
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

export class QueryEnterpriseFaceauthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 认证唯一性标识
  bizNo?: string;
  // 认证失败错误码
  failedCode?: string;
  // 认证是否通过
  passed?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizNo: 'biz_no',
      failedCode: 'failed_code',
      passed: 'passed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizNo: 'string',
      failedCode: 'string',
      passed: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitEnterpriseFaceauthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业名称
  epCertName: string;
  // 企业证件号
  epCertNo: string;
  // 企业证件类型（NATIONAL_LEGAL（工商注册号）或 NATIONAL_LEGAL_MERGE （ 社会统一信用代码））
  epCertType: string;
  // 企业法人姓名
  legalPersonCertName: string;
  // 企业法人身份证号（目前仅支持身份证号）
  legalPersonCertNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
      epCertType: 'ep_cert_type',
      legalPersonCertName: 'legal_person_cert_name',
      legalPersonCertNo: 'legal_person_cert_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      epCertName: 'string',
      epCertNo: 'string',
      epCertType: 'string',
      legalPersonCertName: 'string',
      legalPersonCertNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitEnterpriseFaceauthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 本次认证的业务唯一性标示
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

export class CertifyEnterpriseFaceauthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务唯一性标识
  bizNo: string;
  // 回调通知地址
  callbackUrl?: string;
  // 认证完成后回跳地址
  redirectUrl?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizNo: 'biz_no',
      callbackUrl: 'callback_url',
      redirectUrl: 'redirect_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizNo: 'string',
      callbackUrl: 'string',
      redirectUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CertifyEnterpriseFaceauthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务唯一性标识
  bizNo?: string;
  // 认证 url
  verifyUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizNo: 'biz_no',
      verifyUrl: 'verify_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizNo: 'string',
      verifyUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 账号标识，可弃用
  accountId?: string;
  // 支付宝交易金额
  alipayOrderAmount: number;
  // 支付宝订单号
  alipayOrderNo: string;
  // 支付宝交易总金额
  alipayOrderTotalAmount: number;
  // 免押金额
  depositWaiveAmount: number;
  // 订单总保额，单位分，insured为True时必填
  insuranceCoverage?: number;
  // 保单号，insured为True时必填，仅支持数字和字母
  insuranceOrderNo?: string;
  // 商品名称
  itemName: string;
  // 商品市场价格
  itemPrice: number;
  // 商品类目
  itemType: string;
  // 商户支付宝账号
  merchantAlipayAccount: string;
  // 商户支付宝ID
  merchantAlipayId: string;
  // 商户名称
  merchantName: string;
  // 商户单号
  merchantOrderNo?: string;
  // 支付渠道，包括支付宝（Alipay）、第三方收单机构（ThirdParty）、信用卡（CreditCard）、银行转账（BankTransfer）、微信（WeChatPay）、其他（Other）
  paymentChannel?: string;
  // 租约结束日期
  tenancyTermEnd: number;
  // 租约起始日期
  tenancyTermStart: number;
  // 是否投保，默认为True
  insured?: boolean;
  // 保单查询地址，insured为True时必填
  insuranceOrderUrl?: string;
  // 保险缴费单号，insured为True时必填，仅支持数字和字母，长度20
  insuranceBillNo?: string;
  // 保险缴费北京时间，格式为"YYYYMMDDHHMISS"，时区为UTC+8
  insuranceBillTime?: string;
  // 保险缴费金额，单位分
  insuranceBillAmount?: number;
  // 订单产品保额，单位分，insured为True时必填
  insuranceProductCoverage?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountId: 'account_id',
      alipayOrderAmount: 'alipay_order_amount',
      alipayOrderNo: 'alipay_order_no',
      alipayOrderTotalAmount: 'alipay_order_total_amount',
      depositWaiveAmount: 'deposit_waive_amount',
      insuranceCoverage: 'insurance_coverage',
      insuranceOrderNo: 'insurance_order_no',
      itemName: 'item_name',
      itemPrice: 'item_price',
      itemType: 'item_type',
      merchantAlipayAccount: 'merchant_alipay_account',
      merchantAlipayId: 'merchant_alipay_id',
      merchantName: 'merchant_name',
      merchantOrderNo: 'merchant_order_no',
      paymentChannel: 'payment_channel',
      tenancyTermEnd: 'tenancy_term_end',
      tenancyTermStart: 'tenancy_term_start',
      insured: 'insured',
      insuranceOrderUrl: 'insurance_order_url',
      insuranceBillNo: 'insurance_bill_no',
      insuranceBillTime: 'insurance_bill_time',
      insuranceBillAmount: 'insurance_bill_amount',
      insuranceProductCoverage: 'insurance_product_coverage',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountId: 'string',
      alipayOrderAmount: 'number',
      alipayOrderNo: 'string',
      alipayOrderTotalAmount: 'number',
      depositWaiveAmount: 'number',
      insuranceCoverage: 'number',
      insuranceOrderNo: 'string',
      itemName: 'string',
      itemPrice: 'number',
      itemType: 'string',
      merchantAlipayAccount: 'string',
      merchantAlipayId: 'string',
      merchantName: 'string',
      merchantOrderNo: 'string',
      paymentChannel: 'string',
      tenancyTermEnd: 'number',
      tenancyTermStart: 'number',
      insured: 'boolean',
      insuranceOrderUrl: 'string',
      insuranceBillNo: 'string',
      insuranceBillTime: 'string',
      insuranceBillAmount: 'number',
      insuranceProductCoverage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
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

export class CreateNotarizationBillRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 支付宝交易订单号
  alipayOrderNo?: string;
  // 支付宝用户ID
  alipayUid?: string;
  // 申请者名称
  certName?: string;
  // 申请者证件号码：身份证号码（个人用户）或企业统一社会信用代码（企业用户）
  certNo?: string;
  // 电子公证书业务细项，如“200”对应出生公证
  eNotarizationBiz?: string;
  // 电子公证书下载地址
  eNotarizationDownloadUrl?: string;
  // 电子公证书编号
  eNotarizationNo?: string;
  // 电子公证书页数
  eNotarizationPageNo?: string;
  // 电子公证书状态码
  eNotarizationStatus?: string;
  // 电子公证书业务用途
  eNotarizationUsage?: string;
  // 电子公证书有效期
  eNotarizationValidDate?: string;
  // 企业法人姓名（企业用户必填）
  legalPersonName?: string;
  // 出证订单ID
  orderId?: string;
  // 出证机构ID
  orgId?: string;
  // 支付宝交易订单支付金额（人民币），单位为分
  paymentAmount?: number;
  // 联系电话
  phone?: string;
  // 场景枚举：E_NOTARIZATION（电子公证），NOTARY_CERTIFICATION（存证证明）
  scenario: string;
  // 申请者身份类型，1个人，2企业
  userType?: number;
  // 是否为酬金分润方式，是则按照订金额一定比例分润，否则直接支付订单金额
  feeSplitting: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      alipayOrderNo: 'alipay_order_no',
      alipayUid: 'alipay_uid',
      certName: 'cert_name',
      certNo: 'cert_no',
      eNotarizationBiz: 'e_notarization_biz',
      eNotarizationDownloadUrl: 'e_notarization_download_url',
      eNotarizationNo: 'e_notarization_no',
      eNotarizationPageNo: 'e_notarization_page_no',
      eNotarizationStatus: 'e_notarization_status',
      eNotarizationUsage: 'e_notarization_usage',
      eNotarizationValidDate: 'e_notarization_valid_date',
      legalPersonName: 'legal_person_name',
      orderId: 'order_id',
      orgId: 'org_id',
      paymentAmount: 'payment_amount',
      phone: 'phone',
      scenario: 'scenario',
      userType: 'user_type',
      feeSplitting: 'fee_splitting',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      alipayOrderNo: 'string',
      alipayUid: 'string',
      certName: 'string',
      certNo: 'string',
      eNotarizationBiz: 'string',
      eNotarizationDownloadUrl: 'string',
      eNotarizationNo: 'string',
      eNotarizationPageNo: 'string',
      eNotarizationStatus: 'string',
      eNotarizationUsage: 'string',
      eNotarizationValidDate: 'string',
      legalPersonName: 'string',
      orderId: 'string',
      orgId: 'string',
      paymentAmount: 'number',
      phone: 'string',
      scenario: 'string',
      userType: 'number',
      feeSplitting: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateNotarizationBillResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 计费订单是否创建成功
  accepted?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accepted: 'accepted',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accepted: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitCertificationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 申请人的身份信息
  applier: Identity;
  // 存证证明所要展示的存证信息，可填多个
  notaryInfo: NotaryInfo[];
  // 存证证明的类型：STANDARD（标准存证证明）或COPYRIGHT（版权存证证明），默认为COPYRIGHT
  type?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applier: 'applier',
      notaryInfo: 'notary_info',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applier: Identity,
      notaryInfo: { 'type': 'array', 'itemType': NotaryInfo },
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitCertificationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回值状态码，0000则为成功
  code?: string;
  // 异常状态时的错误信息
  message?: string;
  // 后端生成的存证证明申请订单ID
  orderId?: string;
  // 如果是记账模式则为空，其余情况返回支付宝SDK生成的支付内容信息
  payContent?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      orderId: 'order_id',
      payContent: 'pay_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      message: 'string',
      orderId: 'string',
      payContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCertificationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 存证证明申请的订单ID
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

export class QueryCertificationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证证明的证书信息列表
  certificateInfo?: CertificateInfo[];
  // 返回值状态码，0000则为成功
  code?: string;
  // 异常状态时的错误信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certificateInfo: 'certificate_info',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certificateInfo: { 'type': 'array', 'itemType': CertificateInfo },
      code: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTsrCertificateRequest extends $tea.Model {
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

export class GetTsrCertificateResponse extends $tea.Model {
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

export class CreateIdentificationRealpersonRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 认证人的姓名
  certName: string;
  // 被验证者的身份证号码
  certNo: string;
  // 授权码，针对某些特定场景使用，非必填
  authCode?: string;
  // 认证流程结束回调通知地址，非必传
  callbackUrl?: string;
  // 认证结束后跳转地址，非必填
  returnUrl?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certName: 'cert_name',
      certNo: 'cert_no',
      authCode: 'auth_code',
      callbackUrl: 'callback_url',
      returnUrl: 'return_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certName: 'string',
      certNo: 'string',
      authCode: 'string',
      callbackUrl: 'string',
      returnUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateIdentificationRealpersonResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 实人认证流程ID
  certifyId?: string;
  // 发起实人认证的地址
  certifyUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyId: 'certify_id',
      certifyUrl: 'certify_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyId: 'string',
      certifyUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIdentificationRealpersonRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实人认证流程ID
  certifyId: string;
  // 授权码，针对某些特定场景使用，非必填
  authCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certifyId: 'certify_id',
      authCode: 'auth_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certifyId: 'string',
      authCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIdentificationRealpersonResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 实人认证流程ID
  certifyId?: string;
  // 是否通过实人认证
  passed?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyId: 'certify_id',
      passed: 'passed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyId: 'string',
      passed: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveJointconstraintRecordRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 收款账户
  beneficiaryAccountCode?: string;
  // 收款账户类型
  // 
  // 1：支付宝
  beneficiaryAccountType?: number;
  // 应收方证件号码
  // 
  // 
  beneficiaryCertNumber: string;
  // 应收方证件类型
  // 
  // 0：统一社会信用代码
  // 
  // 1：身份证号码
  beneficiaryCertType: number;
  // 	
  // 应收方类型
  // 
  // 0：企业
  // 
  // 1：个人
  beneficiaryType: number;
  // 合同编号
  contractCode: string;
  // 合同履行记录标签
  contractFulfillmentCode: string;
  // 合同名称
  contractName: string;
  // 合同存证哈希
  contractTxhash: string;
  // 商户端合同链接
  // 
  // 从智能合同小程序中跳转至商户端查看合同内容链接
  externalUrl?: string;
  // 所属行业，来自合同
  // 
  // 
  industryCode?: string;
  // 已付金额
  // 
  // 
  paidAmount?: string;
  // 支付凭据
  // 
  // 
  paidProof?: string;
  // 付款时间
  // 
  // 
  paidTime?: string;
  // 付款账户
  // 
  // 
  payerAccountCode?: string;
  // 	
  // 付款账户类型
  // 
  // 1：支付宝
  payerAccountType?: number;
  // 应付方证件号码
  // 
  // 
  payerCertNumber: string;
  // 应付方证件类型
  // 
  // 0：统一社会信用代码
  // 
  // 1：身份证号码
  payerCertType: number;
  // 应付方类型
  // 
  // 0：企业
  // 
  // 1：个人
  payerType: number;
  // 履约标的金额
  // 
  // 
  paymentAmount: string;
  // 履约宽限期，单位：天
  // 
  // 
  paymentDateBuffer?: number;
  // 目标履约日期
  // 
  // 
  paymentDeadline: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      beneficiaryAccountCode: 'beneficiary_account_code',
      beneficiaryAccountType: 'beneficiary_account_type',
      beneficiaryCertNumber: 'beneficiary_cert_number',
      beneficiaryCertType: 'beneficiary_cert_type',
      beneficiaryType: 'beneficiary_type',
      contractCode: 'contract_code',
      contractFulfillmentCode: 'contract_fulfillment_code',
      contractName: 'contract_name',
      contractTxhash: 'contract_txhash',
      externalUrl: 'external_url',
      industryCode: 'industry_code',
      paidAmount: 'paid_amount',
      paidProof: 'paid_proof',
      paidTime: 'paid_time',
      payerAccountCode: 'payer_account_code',
      payerAccountType: 'payer_account_type',
      payerCertNumber: 'payer_cert_number',
      payerCertType: 'payer_cert_type',
      payerType: 'payer_type',
      paymentAmount: 'payment_amount',
      paymentDateBuffer: 'payment_date_buffer',
      paymentDeadline: 'payment_deadline',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      beneficiaryAccountCode: 'string',
      beneficiaryAccountType: 'number',
      beneficiaryCertNumber: 'string',
      beneficiaryCertType: 'number',
      beneficiaryType: 'number',
      contractCode: 'string',
      contractFulfillmentCode: 'string',
      contractName: 'string',
      contractTxhash: 'string',
      externalUrl: 'string',
      industryCode: 'string',
      paidAmount: 'string',
      paidProof: 'string',
      paidTime: 'string',
      payerAccountCode: 'string',
      payerAccountType: 'number',
      payerCertNumber: 'string',
      payerCertType: 'number',
      payerType: 'number',
      paymentAmount: 'string',
      paymentDateBuffer: 'number',
      paymentDeadline: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveJointconstraintRecordResponse extends $tea.Model {
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

export class DeleteJointconstraintRecordRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合同编号
  // 
  // 
  contractCode: string;
  // 合同履行记录标签
  // 
  // 
  contractFulfillmentCode: string;
  // 应付方证件号码
  // 
  // 
  payerCertNumber: string;
  // 应付方证件类型
  // 
  // 0：统一社会信用代码
  // 
  // 1：身份证号码
  payerCertType: number;
  // 应付方类型
  // 
  // 0：企业
  // 
  // 1：个人
  payerType: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      contractCode: 'contract_code',
      contractFulfillmentCode: 'contract_fulfillment_code',
      payerCertNumber: 'payer_cert_number',
      payerCertType: 'payer_cert_type',
      payerType: 'payer_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      contractCode: 'string',
      contractFulfillmentCode: 'string',
      payerCertNumber: 'string',
      payerCertType: 'number',
      payerType: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteJointconstraintRecordResponse extends $tea.Model {
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

export class QueryJointconstraintBreachrecordRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询对象实体类型
  // 
  // 0：企业
  // 
  // 1：个人
  entityType: number;
  // 对象实体证件类型
  // 
  // 0：统一社会信用代码
  // 
  // 1：身份证号码
  certType: number;
  // 对象实体证件号码
  // 
  // 
  certNumber: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      entityType: 'entity_type',
      certType: 'cert_type',
      certNumber: 'cert_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      entityType: 'number',
      certType: 'number',
      certNumber: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryJointconstraintBreachrecordResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否存在履行记录
  // 
  // 
  hasRecord?: boolean;
  // 违约次数
  // 
  // 
  breachCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      hasRecord: 'has_record',
      breachCount: 'breach_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      hasRecord: 'boolean',
      breachCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyJusticeMediationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 机构码 由蚂蚁分配
  productCode: string;
  // 法院代码 由蚂蚁提供
  courtCode: string;
  // 案件内容 JsonString 格式{"agencyRelations":[],"agents":[],"caseInfo":{},"litigants":{}} 
  caseBody: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productCode: 'product_code',
      courtCode: 'court_code',
      caseBody: 'case_body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productCode: 'string',
      courtCode: 'string',
      caseBody: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyJusticeMediationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryJusticeMediationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 产品码 由蚂蚁分配
  // 
  productCode: string;
  // 案件编号
  caseNumber: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productCode: 'product_code',
      caseNumber: 'case_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productCode: 'string',
      caseNumber: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryJusticeMediationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 	业务码信息
  message?: string;
  // 案件处理进度信息对象
  mediationCaseDetailInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      mediationCaseDetailInfo: 'mediation_case_detail_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      mediationCaseDetailInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryJusticeCaseinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。
  clientToken: string;
  // 案件编号
  caseNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      clientToken: 'client_token',
      caseNo: 'case_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      clientToken: 'string',
      caseNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryJusticeCaseinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询的案件编号
  caseNo?: string;
  // 证据要素
  evidentialElement?: EvidentialElement;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      caseNo: 'case_no',
      evidentialElement: 'evidential_element',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      caseNo: 'string',
      evidentialElement: EvidentialElement,
      code: 'number',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetJusticeUploadfilepathRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件名称（最长128个字符）
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

export class GetJusticeUploadfilepathResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // OSS上传链接
  uploadFileUrl?: string;
  // 文件key
  fileKey?: string;
  // 业务码 0表示成功
  code?: number;
  // 业务码描述
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      uploadFileUrl: 'upload_file_url',
      fileKey: 'file_key',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      uploadFileUrl: 'string',
      fileKey: 'string',
      code: 'number',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateJusticeCasewritebackRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。
  clientToken: string;
  // 自动进件案件基础信息
  caseBasicInfo: CaseBasicInfo;
  // 发起人对象列表
  proposerObjects: ProposerObject[];
  // 答辩人对象列表
  pleaderObjects: PleaderObject[];
  // 自动进件证据要素
  leaseEvidentialElement: LeaseEvidentialElement;
  // 证据清单列表
  evidentialCheckList: EvidentialCheckList[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      clientToken: 'client_token',
      caseBasicInfo: 'case_basic_info',
      proposerObjects: 'proposer_objects',
      pleaderObjects: 'pleader_objects',
      leaseEvidentialElement: 'lease_evidential_element',
      evidentialCheckList: 'evidential_check_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      clientToken: 'string',
      caseBasicInfo: CaseBasicInfo,
      proposerObjects: { 'type': 'array', 'itemType': ProposerObject },
      pleaderObjects: { 'type': 'array', 'itemType': PleaderObject },
      leaseEvidentialElement: LeaseEvidentialElement,
      evidentialCheckList: { 'type': 'array', 'itemType': EvidentialCheckList },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateJusticeCasewritebackResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建成功状态
  // success, fail
  createStatus?: string;
  // 创建状态说明
  createStatusMessage?: string;
  // 创建时间（如创建成功，则返回创建日期时间）
  createTime?: string;
  // 业务来源主键
  inputSourceId?: string;
  // 案件ID
  caseId?: string;
  // 业务码 0表示成功
  code?: number;
  // 业务码描述
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      createStatus: 'create_status',
      createStatusMessage: 'create_status_message',
      createTime: 'create_time',
      inputSourceId: 'input_source_id',
      caseId: 'case_id',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      createStatus: 'string',
      createStatusMessage: 'string',
      createTime: 'string',
      inputSourceId: 'string',
      caseId: 'string',
      code: 'number',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryJusticeBasecaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 针对案件信息查询的索引方式，01为根据案件caseID索引，02为根据申请人的统一社会信用代码与业务订单号进行索引
  indexMethod: string;
  // 纠纷处理平台后台唯一的caseID 当索引方式为01时必填
  caseId?: string;
  // 案件申请人（企业）的统一社会信用代码 当索引方式为02时必填
  idNumber?: string;
  // 案件的业务订单ID 当索引方式为02时必填
  businessNumber?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      indexMethod: 'index_method',
      caseId: 'case_id',
      idNumber: 'id_number',
      businessNumber: 'business_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      indexMethod: 'string',
      caseId: 'string',
      idNumber: 'string',
      businessNumber: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryJusticeBasecaseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功 其余都是代表失败
  code?: number;
  // 案件基础信息出参
  caseBaseInfoList?: CaseBaseInfo[];
  // 响应的详细信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      caseBaseInfoList: 'case_base_info_list',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      caseBaseInfoList: { 'type': 'array', 'itemType': CaseBaseInfo },
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DownloadJusticeCasefileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 案件id
  caseId: string;
  // 维权记录id
  recordId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      caseId: 'case_id',
      recordId: 'record_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      caseId: 'string',
      recordId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DownloadJusticeCasefileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务码，0表示成功 其余都是代表失败
  code?: number;
  // 文件下载地址 默认24小时内有效
  downloadUrl?: string;
  // 响应的详细信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      downloadUrl: 'download_url',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      downloadUrl: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OpenInternalJudicialRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授权开通纠纷行业的真实租户ID
  tenantId: string;
  // 调用接口的授权码
  authCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      authCode: 'auth_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      authCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OpenInternalJudicialResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务响应码 0成功 其余都是失败
  code?: string;
  // 状态码描述
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveJusticePartyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 委托申请方配置ID
  partyId?: number;
  // 委托申请方类型,目前仅支持企业.
  // 个人: PERSON
  // 企业:ORG
  partyType: string;
  // 企业信息实体;
  // 当申请方类型为企业时,该字段必填;
  partyOrganizationInfo: JudicialOrgInfo;
  // 案件协同工作联系人信息实体
  coordinatorPersonInfo: JudicialPersonInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      partyId: 'party_id',
      partyType: 'party_type',
      partyOrganizationInfo: 'party_organization_info',
      coordinatorPersonInfo: 'coordinator_person_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      partyId: 'number',
      partyType: 'string',
      partyOrganizationInfo: JudicialOrgInfo,
      coordinatorPersonInfo: JudicialPersonInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveJusticePartyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否保存成功,true,false
  success?: boolean;
  // 委托申请方配置ID
  partyId?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      partyId: 'party_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      partyId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateJusticeNormalcaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 案由
  caseReason: string;
  // 业务类型
  // 1- 租赁
  // 2 - 金融
  caseType: number;
  // 外部业务ID
  externalBizId: string;
  // 业务描述,用于案件的补充描述; 没有则不填
  caseDesc?: string;
  // 针对对应业务类型的证据要素补充.
  caseBizElementInfo: string;
  // 当事人(申请人)ID, 案件填充信息返回
  partyId: number;
  // 答辩人类型, 目前仅支持个人.
  // PERSON , 个人
  // ORG , 机构
  pleaderType: string;
  // 答辩人(自然人)信息, 类型为个人时必填
  pleaderPersonInfo?: JudicialPersonInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      caseReason: 'case_reason',
      caseType: 'case_type',
      externalBizId: 'external_biz_id',
      caseDesc: 'case_desc',
      caseBizElementInfo: 'case_biz_element_info',
      partyId: 'party_id',
      pleaderType: 'pleader_type',
      pleaderPersonInfo: 'pleader_person_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      caseReason: 'string',
      caseType: 'number',
      externalBizId: 'string',
      caseDesc: 'string',
      caseBizElementInfo: 'string',
      partyId: 'number',
      pleaderType: 'string',
      pleaderPersonInfo: JudicialPersonInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateJusticeNormalcaseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 案件创建是否成功
  success?: boolean;
  // 案件ID, 创建成功后, 返回的案件ID
  caseId?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      caseId: 'case_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      caseId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateJusticeChaincaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 案由
  caseReason: string;
  // 业务类型
  // 1- 租赁
  // 2 - 金融
  caseType: number;
  // 外部业务ID
  externalBizId: string;
  // 业务描述,用于案件的补充描述; 没有则不填
  caseDesc?: string;
  // 当事人(申请人)ID, 案件填充信息返回
  partyId: number;
  // 全流程存证信息, 内容为字符串;
  // 格式: "全流程存证模板id:全流程存证id"
  notaryFlowInfos: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      caseReason: 'case_reason',
      caseType: 'case_type',
      externalBizId: 'external_biz_id',
      caseDesc: 'case_desc',
      partyId: 'party_id',
      notaryFlowInfos: 'notary_flow_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      caseReason: 'string',
      caseType: 'number',
      externalBizId: 'string',
      caseDesc: 'string',
      partyId: 'number',
      notaryFlowInfos: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateJusticeChaincaseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 案件创建是否成功
  success?: boolean;
  // 案件ID, 创建成功后, 返回的案件ID
  caseId?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      caseId: 'case_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      caseId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartJusticeCaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 案件Id,创建案件返回的id
  caseId: number;
  // 处置端租户ID
  isvTenantId: string;
  // 处置方式, 5-司法调解
  judicialBizType: number;
  // 司法调解基础参数, 当处置方式为5, 必填.
  judiciallMediationParam?: JudicialMediationBaseParamInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      caseId: 'case_id',
      isvTenantId: 'isv_tenant_id',
      judicialBizType: 'judicial_biz_type',
      judiciallMediationParam: 'judiciall_mediation_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      caseId: 'number',
      isvTenantId: 'string',
      judicialBizType: 'number',
      judiciallMediationParam: JudicialMediationBaseParamInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartJusticeCaseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 维权记录ID, 维权成功后,返回的对应的维权记录ID
  recordId?: number;
  // 案件发起是否成功,true,false
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      recordId: 'record_id',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      recordId: 'number',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryJusticeCaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 案件Id,创建案件返回的id
  caseId: number;
  // 维权记录ID, 维权成功后,返回的对应的维权记录ID
  recordId?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      caseId: 'case_id',
      recordId: 'record_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      caseId: 'number',
      recordId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryJusticeCaseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 案件ID
  caseId?: number;
  // 维权记录ID
  recordId?: number;
  // 外部业务id
  externalBizId?: string;
  // 案件阶段
  // 待发起维权
  // 待提交
  // 收案处理中
  // 结果待确认
  // 已关闭
  casePhaseDesc?: string;
  // 维权方式, (目前仅支持司法调解)
  // 诉讼-2
  // 仲裁-3
  // 仲裁执行-4
  // 司法调解-5
  judicialRecordTypeDesc?: string;
  // 维权状态字段描述.
  // 
  judicialRecordStatusDesc?: string;
  // "yyyy-MM-dd" , 当前的状态更新时间
  judicialRecordStatusTime?: string;
  // 维权过程中的文件列表
  judicialFiles?: JudicialFileInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      caseId: 'case_id',
      recordId: 'record_id',
      externalBizId: 'external_biz_id',
      casePhaseDesc: 'case_phase_desc',
      judicialRecordTypeDesc: 'judicial_record_type_desc',
      judicialRecordStatusDesc: 'judicial_record_status_desc',
      judicialRecordStatusTime: 'judicial_record_status_time',
      judicialFiles: 'judicial_files',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      caseId: 'number',
      recordId: 'number',
      externalBizId: 'string',
      casePhaseDesc: 'string',
      judicialRecordTypeDesc: 'string',
      judicialRecordStatusDesc: 'string',
      judicialRecordStatusTime: 'string',
      judicialFiles: { 'type': 'array', 'itemType': JudicialFileInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateJusticeEventRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 案件Id,创建案件返回的id
  caseId: number;
  // 维权记录id,发起维权返回的Id
  recordId: number;
  // 事件类型(目前仅支持司法调解类):
  // 司法调解-JUDICIAL_MEDIATION
  // 仲裁-ARBITRATION
  // 执行-CARRIED_OUT
  // 补证-SUPPLEMENT
  eventType: string;
  // 针对事件响应的信息
  operateInfo: JudicialEventOperateInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      caseId: 'case_id',
      recordId: 'record_id',
      eventType: 'event_type',
      operateInfo: 'operate_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      caseId: 'number',
      recordId: 'number',
      eventType: 'string',
      operateInfo: JudicialEventOperateInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateJusticeEventResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 触发响应是否成功
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

export class CreateJusticeCasetemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 案件要素模板名称
  name: string;
  // 模板业务类型名称
  bizType: string;
  // 全流程存证模板ID列表，多个用“,”隔开
  flowTemplates: string;
  // 模板文件下载地址
  templateFileUrl: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      bizType: 'biz_type',
      flowTemplates: 'flow_templates',
      templateFileUrl: 'template_file_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      bizType: 'string',
      flowTemplates: 'string',
      templateFileUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateJusticeCasetemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 案件要素模板ID，创建成功时返回
  templateId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      templateId: 'template_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      templateId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateJusticeRightprotecttemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 维权要素模板名称
  name: string;
  // 维权要素模板业务类型
  bizType: string;
  // 维权措施，枚举值，包括：
  // ARBITRATION，仲裁
  // ARBITRATION_EXECUTION，仲裁执行
  // MEDIATION，调解
  rightProtectType: string;
  // 要素模板关联的案件要素模板ID，要素模板和案件模板必须属于同一个业务类型才可以关联
  caseTemplateId: string;
  // 维权要素模板文件下载地址，文件为excel格式，包含维权要素的所有算法信息、字段信息和文件附件信息
  templateFileUrl: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      bizType: 'biz_type',
      rightProtectType: 'right_protect_type',
      caseTemplateId: 'case_template_id',
      templateFileUrl: 'template_file_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      bizType: 'string',
      rightProtectType: 'string',
      caseTemplateId: 'string',
      templateFileUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateJusticeRightprotecttemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 维权要素模板ID，创建成功时返回
  templateId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      templateId: 'template_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      templateId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetJusticeFileuploadurlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 上传文件全名
  fileName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileName: 'file_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetJusticeFileuploadurlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 获取的文件key, 请妥善保存, 用于后续接口调用.
  fileKey?: string;
  // 文件上传链接url
  uploadUrl?: string;
  // 链接失效日期: "yyyy-MM-dd HH:mm:ss"
  expiredTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      fileKey: 'file_key',
      uploadUrl: 'upload_url',
      expiredTime: 'expired_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      fileKey: 'string',
      uploadUrl: 'string',
      expiredTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseProductinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合约id
  applicationId?: string;
  // 保证金  精确到毫厘，即123400表示12.34元
  depositPrice: number;
  // 安装拆卸费 精确到毫厘，即123400表示12.34元
  installPrice: number;
  // 租赁服务平台id
  leaseId: string;
  // 一级分类
  mainClass: string;
  // 商品编码 长度不可超过50
  productId: string;
  // 商品名称
  productName: string;
  // 采购价  精确到毫厘，即123400表示12.34元
  productPrice: number;
  // 出租详细信息
  rentinfos: RentInfo[];
  // 二级分类
  subClass: string;
  // 供应商id
  supplierId?: string;
  // 供应商
  supplierName: string;
  // 供应商对该产品版本
  supplierVersion?: string;
  // 商品目录额外信息
  extraInfo?: string;
  // 商品规格
  productModel?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applicationId: 'application_id',
      depositPrice: 'deposit_price',
      installPrice: 'install_price',
      leaseId: 'lease_id',
      mainClass: 'main_class',
      productId: 'product_id',
      productName: 'product_name',
      productPrice: 'product_price',
      rentinfos: 'rentinfos',
      subClass: 'sub_class',
      supplierId: 'supplier_id',
      supplierName: 'supplier_name',
      supplierVersion: 'supplier_version',
      extraInfo: 'extra_info',
      productModel: 'product_model',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applicationId: 'string',
      depositPrice: 'number',
      installPrice: 'number',
      leaseId: 'string',
      mainClass: 'string',
      productId: 'string',
      productName: 'string',
      productPrice: 'number',
      rentinfos: { 'type': 'array', 'itemType': RentInfo },
      subClass: 'string',
      supplierId: 'string',
      supplierName: 'string',
      supplierVersion: 'string',
      extraInfo: 'string',
      productModel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseProductinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码 0表示成功
  code?: number;
  // 错误信息
  errMessage?: string;
  // 用户信息存储到合约中对应的区块链交易哈希
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateLeaseContractRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 被升级的合约名称
  contractId: string;
  // 合约业务层id
  applicationId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      contractId: 'contract_id',
      applicationId: 'application_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      contractId: 'string',
      applicationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateLeaseContractResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码 0表示成功
  code?: number;
  // 错误信息
  // 
  errMessage?: string;
  // 升级合约所在的区块链交易哈希
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseAssetagentregisterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 被代理机构的金融科技租户id
  agentLeaseId: string;
  // 代理合同id，作为存证使用
  contractId: string;
  // 被代理租赁机构统一社会信用码
  // 
  // 
  leaseCorpId: string;
  // 被代理租赁机构名称
  leaseCorpName: string;
  // 被代理租赁机构法人姓名
  leaseCorpOwnerName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      agentLeaseId: 'agent_lease_id',
      contractId: 'contract_id',
      leaseCorpId: 'lease_corp_id',
      leaseCorpName: 'lease_corp_name',
      leaseCorpOwnerName: 'lease_corp_owner_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      agentLeaseId: 'string',
      contractId: 'string',
      leaseCorpId: 'string',
      leaseCorpName: 'string',
      leaseCorpOwnerName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseAssetagentregisterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务层错误码
  bizErrorCode?: string;
  // 错误信息描述
  bizErrorMsg?: string;
  // 代理关系链上存证哈希
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizErrorCode: 'biz_error_code',
      bizErrorMsg: 'biz_error_msg',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizErrorCode: 'string',
      bizErrorMsg: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseProductinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商品id
  productId: string;
  // 供应商本版号
  supplierVersion: number;
  // 合约id
  applicationId: string;
  // 租赁方id
  leaseId: string;
  // 资方id
  creditId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productId: 'product_id',
      supplierVersion: 'supplier_version',
      applicationId: 'application_id',
      leaseId: 'lease_id',
      creditId: 'credit_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productId: 'string',
      supplierVersion: 'number',
      applicationId: 'string',
      leaseId: 'string',
      creditId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseProductinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码200表示成功
  code?: number;
  // 错误信息
  errMessage?: string;
  // 商品信息
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncLeaseSupplierorderstatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 订单采购状态，已取消[CANCEL，已拒收REFUSE_DELIVER，待发货TOBE_DELIVER，已退货RETURN_BACK]
  supplierStatus: string;
  // 租赁商家金融科技租户id
  leaseId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      supplierStatus: 'supplier_status',
      leaseId: 'lease_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      supplierStatus: 'string',
      leaseId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncLeaseSupplierorderstatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码,0表示正常
  code?: number;
  // 错误信息描述
  errMessage?: string;
  // CANCEL：可以取消  REFUSE：不能取消
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitLeaseSupplierRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 供应商来源
  origin: string;
  // 供应商信息
  supplier: SupplierInfo;
  // 额外信息
  extraInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      origin: 'origin',
      supplier: 'supplier',
      extraInfo: 'extra_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      origin: 'string',
      supplier: SupplierInfo,
      extraInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitLeaseSupplierResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码 0表示成功
  code?: number;
  // 错误信息描述
  errMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FinishLeaseSupplierstatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 采购订单id，由采购平台生成
  supplierOrderNo: string;
  // 租赁订单id
  orderId: string;
  // 租赁方id，非采购平台
  leaseId: string;
  // 当前的采购状态
  supplierOrderStatus: string;
  // 物流订单id
  supplierLogisticInfo: SupplierLogisticInfo;
  // 采购平台回传的商品订单信息
  supplierOrderProductInfos: SupplierOrderProductInfo[];
  // 供应商id
  supplierId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      supplierOrderNo: 'supplier_order_no',
      orderId: 'order_id',
      leaseId: 'lease_id',
      supplierOrderStatus: 'supplier_order_status',
      supplierLogisticInfo: 'supplier_logistic_info',
      supplierOrderProductInfos: 'supplier_order_product_infos',
      supplierId: 'supplier_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      supplierOrderNo: 'string',
      orderId: 'string',
      leaseId: 'string',
      supplierOrderStatus: 'string',
      supplierLogisticInfo: SupplierLogisticInfo,
      supplierOrderProductInfos: { 'type': 'array', 'itemType': SupplierOrderProductInfo },
      supplierId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FinishLeaseSupplierstatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 租赁信息上链后，链上对应的txHash
  responseData?: string;
  // 错误码
  code?: string;
  // 错误信息描述
  errMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
      code: 'code',
      errMessage: 'err_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
      code: 'string',
      errMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseSupplierproductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 系统来源
  origin: string;
  // 采购商品信息
  productInfo: SupplierProductItem;
  // 本阶段额外信息
  extraInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      origin: 'origin',
      productInfo: 'product_info',
      extraInfo: 'extra_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      origin: 'string',
      productInfo: SupplierProductItem,
      extraInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseSupplierproductResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码 0为成功
  code?: number;
  // 状态错误信息
  errMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyLeaseSupplierorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 供应商id
  supplierId: string;
  // 商品信息
  productInfos: ApplySupplierOrderProductInput[];
  // isv代理模式
  mode?: string;
  // 被代理的租户id
  agentLeaseId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      supplierId: 'supplier_id',
      productInfos: 'product_infos',
      mode: 'mode',
      agentLeaseId: 'agent_lease_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      supplierId: 'string',
      productInfos: { 'type': 'array', 'itemType': ApplySupplierOrderProductInput },
      mode: 'string',
      agentLeaseId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyLeaseSupplierorderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单信息
  orderInfo?: ApplySupplierOrderProductOutput;
  // 错误码，0表示成功
  code?: number;
  // 错误信息描述
  errMessage?: string;
  // 商户本次采购的所有商品信息
  productInfos?: ApplySupplierOrderProductInput[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderInfo: 'order_info',
      code: 'code',
      errMessage: 'err_message',
      productInfos: 'product_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderInfo: ApplySupplierOrderProductOutput,
      code: 'number',
      errMessage: 'string',
      productInfos: { 'type': 'array', 'itemType': ApplySupplierOrderProductInput },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseFinancecertifyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 融资租赁合约id
  applicationId: string;
  // 直付通代扣协议号
  agreementNo: string;
  // 还款类型
  rentalReturnType: string;
  // 认证类型
  certifyWay: string;
  // 承租人姓名
  userName: string;
  // 承租人身份证
  userId: string;
  // 人脸识别认证id
  certifyId: string;
  // 承租人支付宝uid
  alipayUid: string;
  // 提前还款信息
  rentalInfos: FinanceCertifyRentalInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      applicationId: 'application_id',
      agreementNo: 'agreement_no',
      rentalReturnType: 'rental_return_type',
      certifyWay: 'certify_way',
      userName: 'user_name',
      userId: 'user_id',
      certifyId: 'certify_id',
      alipayUid: 'alipay_uid',
      rentalInfos: 'rental_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      applicationId: 'string',
      agreementNo: 'string',
      rentalReturnType: 'string',
      certifyWay: 'string',
      userName: 'string',
      userId: 'string',
      certifyId: 'string',
      alipayUid: 'string',
      rentalInfos: { 'type': 'array', 'itemType': FinanceCertifyRentalInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseFinancecertifyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 本次认证是否通过
  certifyResult?: string;
  // 通过的人脸认证id
  leaseCertifyId?: string;
  // 本次调用核验结果码
  code?: string;
  // 错误信息描述
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyResult: 'certify_result',
      leaseCertifyId: 'lease_certify_id',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyResult: 'string',
      leaseCertifyId: 'string',
      code: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseFinancecertifyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 租赁商户金融科技租户id
  leaseId?: string;
  // 核验凭证
  leaseCertifyId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      leaseId: 'lease_id',
      leaseCertifyId: 'lease_certify_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      leaseId: 'string',
      leaseCertifyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseFinancecertifyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 核验结果
  certifyResult?: string;
  // 1636600547
  certifyTime?: number;
  // 还款信息详情
  rentalInfos?: FinanceCertifyRentalInfo[];
  // 错误码
  code?: string;
  // 错误码描述
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyResult: 'certify_result',
      certifyTime: 'certify_time',
      rentalInfos: 'rental_infos',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyResult: 'string',
      certifyTime: 'number',
      rentalInfos: { 'type': 'array', 'itemType': FinanceCertifyRentalInfo },
      code: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseFinancecertifyincontractRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合约id
  applicationId: string;
  // 订单id
  orderId: string;
  // 核验id
  leaseCertifyId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applicationId: 'application_id',
      orderId: 'order_id',
      leaseCertifyId: 'lease_certify_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applicationId: 'string',
      orderId: 'string',
      leaseCertifyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseFinancecertifyincontractResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 核验结果
  responseData?: string;
  // 错误码
  code?: string;
  // 错误信息描述
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
      code: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 租赁机构id
  leaseId: string;
  // 合约id
  applicationId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      leaseId: 'lease_id',
      applicationId: 'application_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      leaseId: 'string',
      applicationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseUserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单id
  orderId?: string;
  // 用户登录名，租赁平台会员ID/若支付宝ID必传 长度不可超过50
  loginId?: string;
  // 用户登录名类型 1.商户会员2.支付宝3.其他
  loginType?: string;
  // 用户登录时间 格式为2019-8-31 12:00:00
  loginTime?: string;
  // 承租人姓名，加密返回
  userName?: string;
  // 承租人身份证号，加密返回
  userId?: string;
  // 承租人手机号
  userPhoneNumber?: string;
  // 身份认证类型 1支付宝实人，2芝麻实人，3非蚂蚁实人
  userType?: string;
  // 承租人支付宝账号信息
  alipayUid?: string;
  // 出租企业名称
  leaseCorpName?: string;
  // 出租企业法人名称
  leaseCorpOwnerName?: string;
  // 承租企业统一社会信用代码 长度不可超过50
  leaseCorpId?: string;
  // 错误码
  code?: string;
  // 错误信息描述
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
      loginId: 'login_id',
      loginType: 'login_type',
      loginTime: 'login_time',
      userName: 'user_name',
      userId: 'user_id',
      userPhoneNumber: 'user_phone_number',
      userType: 'user_type',
      alipayUid: 'alipay_uid',
      leaseCorpName: 'lease_corp_name',
      leaseCorpOwnerName: 'lease_corp_owner_name',
      leaseCorpId: 'lease_corp_id',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
      loginId: 'string',
      loginType: 'string',
      loginTime: 'string',
      userName: 'string',
      userId: 'string',
      userPhoneNumber: 'string',
      userType: 'string',
      alipayUid: 'string',
      leaseCorpName: 'string',
      leaseCorpOwnerName: 'string',
      leaseCorpId: 'string',
      code: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseOrderdetailinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 融资租赁租赁机构id
  leaseId: string;
  // 融资租赁合约id
  applicationId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      leaseId: 'lease_id',
      applicationId: 'application_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      leaseId: 'string',
      applicationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseOrderdetailinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 融资租赁订单id
  orderId?: string;
  // 订单创建时间 
  orderCreateTime?: string;
  // 订单支付时间 格式为
  orderPayTime?: string;
  // 支付订单id
  orderPayId?: string;
  // 订单支付类型 1 预授权，2信用套餐，3支付宝代扣，4其他，5网商直付通代扣
  orderPayType?: number;
  // 免押金额，芝麻信用免押金额 精确到毫厘，即123400表示12.34元
  depositFree?: number;
  // 实际预授权金额，芝麻信用免押金额 精确到毫厘，即123400表示12.34元
  acutalPreAuthFree?: number;
  // 租期单位月
  rentTerm?: number;
  // 月租金 精确到毫厘，即123400表示12.34元
  rentPricePerMonth?: number;
  // 到期买断价
  buyOutPrice?: number;
  // 承租人收货地址
  userAddress?: string;
  // 省份编码
  provinceCode?: string;
  // 城市编码
  cityCode?: string;
  // 地区编码
  districtCode?: string;
  // 租赁合同链接
  rentContractUrl?: string;
  // 保险单号
  insuranceNumber?: string;
  // 保险链接
  insuranceUrl?: string;
  // 采购合同协议
  purchaseContractUrl?: string;
  // 蚁盾分数
  yidunScore?: number;
  // 物流订单id
  outStoreDeliverNumber?: string;
  // 物流发货时间
  outStoreTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
      orderCreateTime: 'order_create_time',
      orderPayTime: 'order_pay_time',
      orderPayId: 'order_pay_id',
      orderPayType: 'order_pay_type',
      depositFree: 'deposit_free',
      acutalPreAuthFree: 'acutal_pre_auth_free',
      rentTerm: 'rent_term',
      rentPricePerMonth: 'rent_price_per_month',
      buyOutPrice: 'buy_out_price',
      userAddress: 'user_address',
      provinceCode: 'province_code',
      cityCode: 'city_code',
      districtCode: 'district_code',
      rentContractUrl: 'rent_contract_url',
      insuranceNumber: 'insurance_number',
      insuranceUrl: 'insurance_url',
      purchaseContractUrl: 'purchase_contract_url',
      yidunScore: 'yidun_score',
      outStoreDeliverNumber: 'out_store_deliver_number',
      outStoreTime: 'out_store_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
      orderCreateTime: 'string',
      orderPayTime: 'string',
      orderPayId: 'string',
      orderPayType: 'number',
      depositFree: 'number',
      acutalPreAuthFree: 'number',
      rentTerm: 'number',
      rentPricePerMonth: 'number',
      buyOutPrice: 'number',
      userAddress: 'string',
      provinceCode: 'string',
      cityCode: 'string',
      districtCode: 'string',
      rentContractUrl: 'string',
      insuranceNumber: 'string',
      insuranceUrl: 'string',
      purchaseContractUrl: 'string',
      yidunScore: 'number',
      outStoreDeliverNumber: 'string',
      outStoreTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseLeasepromiseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 租赁机构id
  leaseId: string;
  // 融资租赁合约id
  applicationId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      leaseId: 'lease_id',
      applicationId: 'application_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      leaseId: 'string',
      applicationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseLeasepromiseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单id
  orderId?: string;
  // 用户端承诺
  leasePromiseInfo?: LeasePromiseInfo[];
  // 租期
  payPeriod?: number;
  // 租赁机构支付宝uid
  leaseAlipayUid?: string;
  // 错误码
  code?: string;
  // 错误信息描述
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
      leasePromiseInfo: 'lease_promise_info',
      payPeriod: 'pay_period',
      leaseAlipayUid: 'lease_alipay_uid',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
      leasePromiseInfo: { 'type': 'array', 'itemType': LeasePromiseInfo },
      payPeriod: 'number',
      leaseAlipayUid: 'string',
      code: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseCreditpromiseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 租赁机构id
  leaseId: string;
  // 融资租赁合约id
  applicationId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      leaseId: 'lease_id',
      applicationId: 'application_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      leaseId: 'string',
      applicationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseCreditpromiseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单id
  orderId?: string;
  // 融资租赁资方承诺列表
  leaseCreditPromiseInfo?: LeaseCreditPromiseInfo[];
  // 错误码
  code?: string;
  // 错误信息描述
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
      leaseCreditPromiseInfo: 'lease_credit_promise_info',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
      leaseCreditPromiseInfo: { 'type': 'array', 'itemType': LeaseCreditPromiseInfo },
      code: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseClearingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 租赁机构id
  leaseId: string;
  // 融资租赁合约id
  applicationId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      leaseId: 'lease_id',
      applicationId: 'application_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      leaseId: 'string',
      applicationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseClearingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单id
  orderId?: string;
  // 融资租赁清分信息
  cleearingInfos?: LeaseClearingInfo[];
  // 错误码
  code?: string;
  // 错误信息描述
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
      cleearingInfos: 'cleearing_infos',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
      cleearingInfos: { 'type': 'array', 'itemType': LeaseClearingInfo },
      code: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseRentalinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 融资租赁合约id
  applicationId?: string;
  // 租赁机构id
  leaseId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      applicationId: 'application_id',
      leaseId: 'lease_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      applicationId: 'string',
      leaseId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseRentalinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 融资租赁订单id
  orderId?: string;
  // 用户侧还款信息
  rentalInfos?: LeaseRentalInfo[];
  // 错误码
  code?: string;
  // 错误信息描述
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
      rentalInfos: 'rental_infos',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
      rentalInfos: { 'type': 'array', 'itemType': LeaseRentalInfo },
      code: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseRepaymentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 租赁机构id
  leaseId: string;
  // 融资租赁合约id
  applicationId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      leaseId: 'lease_id',
      applicationId: 'application_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      leaseId: 'string',
      applicationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseRepaymentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单id
  orderId?: string;
  // 租赁机构端还款信息
  repaymentInfos?: LeaseRepaymentInfo[];
  // 错误码
  code?: string;
  // 错误信息描述
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
      repaymentInfos: 'repayment_infos',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
      repaymentInfos: { 'type': 'array', 'itemType': LeaseRepaymentInfo },
      code: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseOrderproductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 租赁机构id
  leaseId: string;
  // 合约id
  applicationId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      leaseId: 'lease_id',
      applicationId: 'application_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      leaseId: 'string',
      applicationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseOrderproductResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误码
  code?: string;
  // 返回信息描述
  message?: string;
  // 订单id
  orderId?: string;
  // 订单商品信息的数组
  productInfos?: LeaseOrderProductInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      orderId: 'order_id',
      productInfos: 'product_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      message: 'string',
      orderId: 'string',
      productInfos: { 'type': 'array', 'itemType': LeaseOrderProductInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseFinancecreditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 租赁机构金融科技租户id
  leaseId: string;
  // 融资租赁合约id
  applicationId?: string;
  // 融资租赁清分期数
  term: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      leaseId: 'lease_id',
      applicationId: 'application_id',
      term: 'term',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      leaseId: 'string',
      applicationId: 'string',
      term: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseFinancecreditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 融资租赁资金方金融科技租户id
  creditId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      creditId: 'credit_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      creditId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRefinanceOrderidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资产包id
  packageId: string;
  // 从第0页开始
  page: number;
  // 每次max最多查询的个数
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      packageId: 'package_id',
      page: 'page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      packageId: 'string',
      page: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRefinanceOrderidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单id列表
  orderInfoList?: RefinanceOrderInfoResponse[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderInfoList: 'order_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderInfoList: { 'type': 'array', 'itemType': RefinanceOrderInfoResponse },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRefinanceOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资产包id
  packageId: string;
  // 订单id
  orderId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      packageId: 'package_id',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      packageId: 'string',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRefinanceOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // json串，详见接口文档
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

export class QueryRefinanceProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资产包id
  packageId: string;
  // 订单id
  orderId: string;
  // 合约id
  applicationId: string;
  // 商品id
  productId: string;
  // 商品版本号
  productVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      packageId: 'package_id',
      orderId: 'order_id',
      applicationId: 'application_id',
      productId: 'product_id',
      productVersion: 'product_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      packageId: 'string',
      orderId: 'string',
      applicationId: 'string',
      productId: 'string',
      productVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRefinanceProductResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商品信息，json格式
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyRefinancePackageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资产包id
  packageId: string;
  // AUDIT_SUCCESS(审核通过), AUDIT_REFUSE（审核驳回）
  auditStatus: string;
  // 放款金额，单位毫厘
  recreditLimit?: number;
  // 再融资放款流水号
  recreditSerialNumber?: string;
  // 额外审核信息说明
  auditMessage?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      packageId: 'package_id',
      auditStatus: 'audit_status',
      recreditLimit: 'recredit_limit',
      recreditSerialNumber: 'recredit_serial_number',
      auditMessage: 'audit_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      packageId: 'string',
      auditStatus: 'string',
      recreditLimit: 'number',
      recreditSerialNumber: 'string',
      auditMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyRefinancePackageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 资产包当前的状态
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

export class QueryLeaseOrderclearingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 期数
  term: number;
  // 融资租赁合约id
  applicationId?: string;
  // 清分单号
  clearingOrderId: string;
  // 租赁机构id
  leaseId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      term: 'term',
      applicationId: 'application_id',
      clearingOrderId: 'clearing_order_id',
      leaseId: 'lease_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      term: 'number',
      applicationId: 'string',
      clearingOrderId: 'string',
      leaseId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseOrderclearingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单清分信息
  data?: string;
  // 错误信息描述
  code?: string;
  // 错误信息描述
  errMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      code: 'code',
      errMessage: 'err_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      code: 'string',
      errMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseRepaymentstatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 融资租赁合约id
  applicationId?: string;
  // 租赁机构id
  leaseId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      applicationId: 'application_id',
      leaseId: 'lease_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      applicationId: 'string',
      leaseId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseRepaymentstatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单结清详细信息
  data?: string;
  // 错误码
  code?: string;
  // 错误信息描述
  errMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      code: 'code',
      errMessage: 'err_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      code: 'string',
      errMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseUserperformanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 本次融资的订单号
  orderId: string;
  // 首租订单号
  firstOrderId: string;
  // 本次融资双方的合约id
  applicationId: string;
  // 商家的租户id
  leaseId: string;
  // 首次融资的合约id
  firstApplicationId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      firstOrderId: 'first_order_id',
      applicationId: 'application_id',
      leaseId: 'lease_id',
      firstApplicationId: 'first_application_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      firstOrderId: 'string',
      applicationId: 'string',
      leaseId: 'string',
      firstApplicationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseUserperformanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上不存在该订单，该订单存在链上，但未获取链上融资，全部履约，累积逾期次数
  resultMessage?: string;
  // 预期次数
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultMessage: 'result_message',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultMessage: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseRentalverifyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 约定的合约id
  applicationId: string;
  // 订单id
  orderId: string;
  // 核验类型
  proofType: string;
  // 还款流水号
  returnVoucherSerial: string;
  // 归还期数
  returnTerm: number;
  // 租赁商户的id
  leaseId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applicationId: 'application_id',
      orderId: 'order_id',
      proofType: 'proof_type',
      returnVoucherSerial: 'return_voucher_serial',
      returnTerm: 'return_term',
      leaseId: 'lease_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applicationId: 'string',
      orderId: 'string',
      proofType: 'string',
      returnVoucherSerial: 'string',
      returnTerm: 'number',
      leaseId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseRentalverifyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误信息
  resultMessage?: string;
  // 不匹配的时候，相应的信息
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultMessage: 'result_message',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultMessage: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseInstallmentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合约id
  applicationId?: string;
  // 订单id
  orderId: string;
  // 归还的第几期
  term: string;
  // 商家租户id
  leaseId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applicationId: 'application_id',
      orderId: 'order_id',
      term: 'term',
      leaseId: 'lease_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applicationId: 'string',
      orderId: 'string',
      term: 'string',
      leaseId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseInstallmentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回对应的
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateWitnessFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务场景，最大255长度
  businessScene: string;
  // 客户端名称，比如签章客户端，最长长度50
  clientName?: string;
  // 客户端版本
  clientVersion?: string;
  // 合同有效截止时间，时间戳
  contractValidity?: string;
  // 流程id
  flowId?: string;
  // 发起方账号id
  initiatorAccountId?: string;
  // 发起端，TIANYIN_H5 - H5端，TIANYIN_WEB - WEB端，TIANYIN_API - API
  launchEndpoint: string;
  // 发起ip
  launchIp: string;
  // 手机盾逻辑版本，0-不支持用印审批、需要扣费，1-支持用印审批、无需扣费，默认0
  mobileShieldVersion?: number;
  // 扣费方账号id
  payerAccountId?: string;
  // 签署截止时间，时间戳
  signDeadline?: string;
  // 签署顺序，SIGN_SEQUENCE-顺序签署，SIGN_NON_SEQUENCE-无序签署
  signOrder: string;
  // 流程类型，0-签署流程，1-作废流程，默认0
  type?: number;
  // 发起请求的实例应用ID
  appId: string;
  // 发起请求的鉴权token
  token: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      businessScene: 'business_scene',
      clientName: 'client_name',
      clientVersion: 'client_version',
      contractValidity: 'contract_validity',
      flowId: 'flow_id',
      initiatorAccountId: 'initiator_account_id',
      launchEndpoint: 'launch_endpoint',
      launchIp: 'launch_ip',
      mobileShieldVersion: 'mobile_shield_version',
      payerAccountId: 'payer_account_id',
      signDeadline: 'sign_deadline',
      signOrder: 'sign_order',
      type: 'type',
      appId: 'app_id',
      token: 'token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      businessScene: 'string',
      clientName: 'string',
      clientVersion: 'string',
      contractValidity: 'string',
      flowId: 'string',
      initiatorAccountId: 'string',
      launchEndpoint: 'string',
      launchIp: 'string',
      mobileShieldVersion: 'number',
      payerAccountId: 'string',
      signDeadline: 'string',
      signOrder: 'string',
      type: 'number',
      appId: 'string',
      token: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateWitnessFlowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误码
  code?: number;
  // 流程配置
  flowConfig?: WitnessFlowConfig;
  // 流程创建响应数据
  message?: string;
  // 见证流程
  witnessFlowId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      flowConfig: 'flow_config',
      message: 'message',
      witnessFlowId: 'witness_flow_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      flowConfig: WitnessFlowConfig,
      message: 'string',
      witnessFlowId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveWitnessSnapshotRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 快照数据
  data: string;
  // 快照步骤，最大20长度，START-开始，UPDATE-更新，FINISH-结束，允许自定义
  step: string;
  // 快照步骤描述，最大40长度
  stepDescription: string;
  // 见证流程id
  witnessFlowId: string;
  // 发起请求的实例应用ID
  appId: string;
  // 发起请求的鉴权token
  token: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      data: 'data',
      step: 'step',
      stepDescription: 'step_description',
      witnessFlowId: 'witness_flow_id',
      appId: 'app_id',
      token: 'token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      data: 'string',
      step: 'string',
      stepDescription: 'string',
      witnessFlowId: 'string',
      appId: 'string',
      token: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveWitnessSnapshotResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误码
  code?: number;
  // 错误信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckWitnessSignaccessRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 审批流程id
  approvalFlowId?: string;
  // 审批结果通知
  approvalNotifyUrl?: string;
  // 签署文档信息
  docs: WitnessDocs[];
  // 签署端，TIANYIN_H5 - H5端，TIANYIN_WEB - WEB端，TIANYIN_API - API
  endpoint: string;
  // 是否发起审批，默认TRUE
  launchApproval?: boolean;
  // 手机盾任务id，用于手机盾审批场景
  mobileShieldTaskId?: string;
  // 实名认证凭证
  realnameAuthCode?: string;
  // 印章id列表
  sealIds?: string[];
  // 签署人账号id
  signerAccountId: string;
  // 签署人ip
  signerIp: string;
  // 签署人类型，1-私有云用户，2-公有云用户，3-手机盾用户
  signerType: number;
  // 签署预览地址
  signPreviewUrl?: string;
  // 意愿认证凭证
  willAuthCode?: string;
  // 见证流程id
  witnessFlowId: string;
  // 发起请求的实例应用ID
  appId: string;
  // 发起请求的鉴权token
  token: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      approvalFlowId: 'approval_flow_id',
      approvalNotifyUrl: 'approval_notify_url',
      docs: 'docs',
      endpoint: 'endpoint',
      launchApproval: 'launch_approval',
      mobileShieldTaskId: 'mobile_shield_task_id',
      realnameAuthCode: 'realname_auth_code',
      sealIds: 'seal_ids',
      signerAccountId: 'signer_account_id',
      signerIp: 'signer_ip',
      signerType: 'signer_type',
      signPreviewUrl: 'sign_preview_url',
      willAuthCode: 'will_auth_code',
      witnessFlowId: 'witness_flow_id',
      appId: 'app_id',
      token: 'token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      approvalFlowId: 'string',
      approvalNotifyUrl: 'string',
      docs: { 'type': 'array', 'itemType': WitnessDocs },
      endpoint: 'string',
      launchApproval: 'boolean',
      mobileShieldTaskId: 'string',
      realnameAuthCode: 'string',
      sealIds: { 'type': 'array', 'itemType': 'string' },
      signerAccountId: 'string',
      signerIp: 'string',
      signerType: 'number',
      signPreviewUrl: 'string',
      willAuthCode: 'string',
      witnessFlowId: 'string',
      appId: 'string',
      token: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckWitnessSignaccessResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 有权限的印章id列表
  accessSealIds?: string[];
  // 审批数据
  approvalDatas?: WitnessApprovalData[];
  // 错误码
  code?: number;
  // 错误信息
  message?: string;
  // 签署票证
  signTicket?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accessSealIds: 'access_seal_ids',
      approvalDatas: 'approval_datas',
      code: 'code',
      message: 'message',
      signTicket: 'sign_ticket',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accessSealIds: { 'type': 'array', 'itemType': 'string' },
      approvalDatas: { 'type': 'array', 'itemType': WitnessApprovalData },
      code: 'number',
      message: 'string',
      signTicket: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthWitnessFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 发起请求的实例应用ID
  appId: string;
  // 证书id
  certId?: string;
  // 签署页码，单个签时必传
  page?: string;
  // 签署x坐标，单个签时必传
  posX?: string;
  // 签署y坐标，单个签时必传
  posY?: string;
  // 印章图片key
  sealFileKey?: string;
  // 印章id
  sealId?: string;
  // 印章类型，1-模板，2-手绘
  sealType: number;
  // 签署类型，单个签时必传
  signatureType?: string;
  // 批量签署信息，批量签时必传
  signDatas?: string;
  // 待签署文档摘要值，单个签时必传
  signHash?: string;
  // 签署票证
  signTicket: string;
  // 签署主体账号id
  subjectAccountId?: string;
  // 第三方文档id，单个签时必传
  thirdDocId?: string;
  // 发起请求的鉴权token
  token: string;
  // 见证流程id
  witnessFlowId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appId: 'app_id',
      certId: 'cert_id',
      page: 'page',
      posX: 'pos_x',
      posY: 'pos_y',
      sealFileKey: 'seal_file_key',
      sealId: 'seal_id',
      sealType: 'seal_type',
      signatureType: 'signature_type',
      signDatas: 'sign_datas',
      signHash: 'sign_hash',
      signTicket: 'sign_ticket',
      subjectAccountId: 'subject_account_id',
      thirdDocId: 'third_doc_id',
      token: 'token',
      witnessFlowId: 'witness_flow_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appId: 'string',
      certId: 'string',
      page: 'string',
      posX: 'string',
      posY: 'string',
      sealFileKey: 'string',
      sealId: 'string',
      sealType: 'number',
      signatureType: 'string',
      signDatas: 'string',
      signHash: 'string',
      signTicket: 'string',
      subjectAccountId: 'string',
      thirdDocId: 'string',
      token: 'string',
      witnessFlowId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthWitnessFlowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误码
  code?: number;
  // 错误信息
  message?: string;
  // 二维码内容
  qrcodeContent?: string;
  // 签署日志id，外部用户签署返回
  signlogId?: string;
  // 签名结果，外部用户签署返回
  signResult?: string;
  // 签署结果，批量签署返回
  signResults?: WitnessSignResult[];
  // 签署方式，1-单个签署，2-批量签署
  signWay?: number;
  // 手机盾用户签署返回
  taskId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      qrcodeContent: 'qrcode_content',
      signlogId: 'signlog_id',
      signResult: 'sign_result',
      signResults: 'sign_results',
      signWay: 'sign_way',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      qrcodeContent: 'string',
      signlogId: 'string',
      signResult: 'string',
      signResults: { 'type': 'array', 'itemType': WitnessSignResult },
      signWay: 'number',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmWitnessFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 签署确认数据
  confirmDatas: WitnessConfirmData[];
  // 证据id列表，内部用户必传
  evidenceIds?: string[];
  // 签署记录id列表，外部用户必传
  signlogIds?: string[];
  // 签署票证
  signTicket: string;
  // 见证流程id
  witnessFlowId: string;
  // 发起请求的实例应用ID
  appId: string;
  // 发起请求的鉴权token
  token: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      confirmDatas: 'confirm_datas',
      evidenceIds: 'evidence_ids',
      signlogIds: 'signlog_ids',
      signTicket: 'sign_ticket',
      witnessFlowId: 'witness_flow_id',
      appId: 'app_id',
      token: 'token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      confirmDatas: { 'type': 'array', 'itemType': WitnessConfirmData },
      evidenceIds: { 'type': 'array', 'itemType': 'string' },
      signlogIds: { 'type': 'array', 'itemType': 'string' },
      signTicket: 'string',
      witnessFlowId: 'string',
      appId: 'string',
      token: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmWitnessFlowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误码
  code?: number;
  // 错误信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTransRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 存证关联实体（个人/企业）的身份识别信息
  customer: Identity;
  // 扩展属性
  properties?: string;
  // 业务子类型标识
  subBizId?: string;
  // 是否使用可信时间戳，默认为false
  tsr?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      customer: 'customer',
      properties: 'properties',
      subBizId: 'sub_biz_id',
      tsr: 'tsr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      customer: Identity,
      properties: 'string',
      subBizId: 'string',
      tsr: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTransResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回事务ID，全局唯一
  transactionId?: string;
  // 可信时间信息
  tsr?: TsrResponse;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      transactionId: 'transaction_id',
      tsr: 'tsr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      transactionId: 'string',
      tsr: TsrResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTransRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 存证事务ID
  transactionId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      transactionId: 'transaction_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      transactionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTransResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回文件下载路径列表
  fileUrl?: string[];
  // 存证事务ID
  transactionId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      fileUrl: 'file_url',
      transactionId: 'transaction_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      fileUrl: { 'type': 'array', 'itemType': 'string' },
      transactionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTextRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
  location?: Location;
  // 存证内容
  notaryContent: string;
  // 描述本条存证在存证事务中的阶段，用户可自行维护
  phase: string;
  // 扩展属性
  properties?: string;
  // 存证事务id
  transactionId: string;
  // 是否使用可信时间戳，默认为false
  tsr?: boolean;
  // 文本存证类型，支持源文本/文本哈希
  textNotaryType?: string;
  // 哈希算法，目前仅支持 SHA256
  hashAlgorithm?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      location: 'location',
      notaryContent: 'notary_content',
      phase: 'phase',
      properties: 'properties',
      transactionId: 'transaction_id',
      tsr: 'tsr',
      textNotaryType: 'text_notary_type',
      hashAlgorithm: 'hash_algorithm',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      location: Location,
      notaryContent: 'string',
      phase: 'string',
      properties: 'string',
      transactionId: 'string',
      tsr: 'boolean',
      textNotaryType: 'string',
      hashAlgorithm: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTextResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 可信时间信息
  tsr?: TsrResponse;
  // 存证凭据
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tsr: 'tsr',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tsr: TsrResponse,
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTextRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
  location?: Location;
  // 描述本条存证在存证事务中的阶段，用户可自行维护
  phase?: string;
  // 扩展属性
  properties?: string;
  // 存证事务id
  transactionId?: string;
  // 存证凭据
  txHash: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      location: 'location',
      phase: 'phase',
      properties: 'properties',
      transactionId: 'transaction_id',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      location: Location,
      phase: 'string',
      properties: 'string',
      transactionId: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTextResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证信息
  content?: string;
  // 可信信息
  tsr?: TsrResponse;
  // 文本存证类型
  textNotaryType?: string;
  // 哈希算法
  hashAlgorithm?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      content: 'content',
      tsr: 'tsr',
      textNotaryType: 'text_notary_type',
      hashAlgorithm: 'hash_algorithm',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      content: 'string',
      tsr: TsrResponse,
      textNotaryType: 'string',
      hashAlgorithm: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件存证模式，目前仅支持 FILE_RAW 和 FILE_HASH
  fileNotaryType?: string;
  // 当文件存证模式为FILE_HASH时，用户可以指定该参数。当前服务仅支持 SHA256，若不填写，则默认值为 SHA256。
  hashAlgorithm?: string;
  // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
  location?: Location;
  // 存证文件内容，对文件内容做base64编码后得到。例如FILE_RAW模式下，文件内容为“test”，那么base64编码后的结果则为“dGVzdA==”。如果是FILE_HASh模式，则该字段直接为文件hash。
  notaryFile: string;
  // 存证文件名称
  notaryName: string;
  // 描述本条存证在存证事务中的阶段，用户可自行维护
  phase: string;
  // 扩展属性
  properties?: string;
  // 存证事务ID
  transactionId: string;
  // 是否使用可信时间戳，默认为false
  tsr?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileNotaryType: 'file_notary_type',
      hashAlgorithm: 'hash_algorithm',
      location: 'location',
      notaryFile: 'notary_file',
      notaryName: 'notary_name',
      phase: 'phase',
      properties: 'properties',
      transactionId: 'transaction_id',
      tsr: 'tsr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileNotaryType: 'string',
      hashAlgorithm: 'string',
      location: Location,
      notaryFile: 'string',
      notaryName: 'string',
      phase: 'string',
      properties: 'string',
      transactionId: 'string',
      tsr: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 可信时间信息
  tsr?: TsrResponse;
  // 存证凭证
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tsr: 'tsr',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tsr: TsrResponse,
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
  location?: Location;
  // 描述本条存证在存证事务中的阶段，用户可自行维护
  phase?: string;
  // 扩展属性
  properties?: string;
  // 存证事务ID
  transactionId?: string;
  // 存证凭据
  txHash: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      location: 'location',
      phase: 'phase',
      properties: 'properties',
      transactionId: 'transaction_id',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      location: Location,
      phase: 'string',
      properties: 'string',
      transactionId: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文件哈希，当 file_notary_type 为 FILE_HASH 时才有此值。
  fileHash?: string;
  // 文件存证模式，有 FILE_RAW 和 FILE_HASH 两种可能值。
  fileNotaryType?: string;
  // 哈希算法，当 file_notary_type 为 FILE_HASH 时，此返回值才有效。
  hashAlgorithm?: string;
  // 文件下载地址，当 file_notary_type 为 FILE_RAW 时才有此值。
  ossPath?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      fileHash: 'file_hash',
      fileNotaryType: 'file_notary_type',
      hashAlgorithm: 'hash_algorithm',
      ossPath: 'oss_path',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      fileHash: 'string',
      fileNotaryType: 'string',
      hashAlgorithm: 'string',
      ossPath: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSourceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
  location?: Location;
  // 描述本条存证在存证事务中的阶段，用户可自行维护
  phase: string;
  // 扩展属性
  properties?: string;
  // 原文文件描述
  sourceDesc: string;
  // 存证文件内容，对文件内容做base64编码后得到。例如文件内容为“test”，那么base64编码后的结果则为“dGVzdA==”
  sourceFile: string;
  // 存证原文名称
  sourceName: string;
  // 存证事务ID
  transactionId: string;
  // 是否使用可信时间戳，默认为false
  tsr?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      location: 'location',
      phase: 'phase',
      properties: 'properties',
      sourceDesc: 'source_desc',
      sourceFile: 'source_file',
      sourceName: 'source_name',
      transactionId: 'transaction_id',
      tsr: 'tsr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      location: Location,
      phase: 'string',
      properties: 'string',
      sourceDesc: 'string',
      sourceFile: 'string',
      sourceName: 'string',
      transactionId: 'string',
      tsr: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSourceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 可信时间信息
  tsr?: TsrResponse;
  // 存证凭据
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tsr: 'tsr',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tsr: TsrResponse,
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSourceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
  location?: Location;
  // 描述本条存证在存证事务中的阶段，用户可自行维护
  phase?: string;
  // 扩展属性
  properties?: string;
  // 存证事务id
  transactionId?: string;
  // 存证凭据
  txHash: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      location: 'location',
      phase: 'phase',
      properties: 'properties',
      transactionId: 'transaction_id',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      location: Location,
      phase: 'string',
      properties: 'string',
      transactionId: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSourceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文件下载地址
  ossPath?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      ossPath: 'oss_path',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      ossPath: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 存证核验数据组
  notaryCheckMetaList: NotaryCheckMeta[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      notaryCheckMetaList: 'notary_check_meta_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      notaryCheckMetaList: { 'type': 'array', 'itemType': NotaryCheckMeta },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckStatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证核验结果
  notaryCheckResults?: NotaryCheckResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      notaryCheckResults: 'notary_check_results',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      notaryCheckResults: { 'type': 'array', 'itemType': NotaryCheckResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeployLeaseContractRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租赁服务平台对应的合约ID
  contractId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      contractId: 'contract_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      contractId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeployLeaseContractResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码
  // 0表示成功
  code?: number;
  // 错误信息
  errMessage?: string;
  // 合约部署成功的交易哈希
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthLeaseContractRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 融资服务平台ID 长度不可超过50
  creditId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      creditId: 'credit_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      creditId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthLeaseContractResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码
  // 0表示成功
  code?: number;
  // 错误信息
  errMessage?: string;
  // 授权信息存储到合约中对应的区块链交易哈希
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseUserinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 支付宝账号信息
  alipayUid: string;
  // 融资租赁业务id，由资方控制台生成返回
  applicationId?: string;
  // 是否启动异步
  async?: number;
  // 融资租赁用户信息额外字段
  extraInfo?: string;
  // 承租企业统一社会信用代码 长度不可超过50
  leaseCorpId: string;
  // 承租企业名称 长度不可超过50
  leaseCorpName: string;
  // 承租法定代表人姓名 长度不可超过50
  leaseCorpOwnerName: string;
  // 用户登录名，租赁平台会员ID/支付宝ID 长度不可超过50
  loginId: string;
  // 用户登录时间 格式为2019-8-31 12:00:00
  loginTime: string;
  // 用户登录名类型 1.商户会员2.支付宝3.其他
  loginType: number;
  // 订单id 长度不可超过50
  orderId: string;
  // 区块链认证Hash，若为支付宝实人，必填
  userBlockchainVerifyHash?: string;
  // 承租人电子邮件，法院/仲裁电子送达必填项，长度不超过5
  userEmail?: string;
  // 承租人身份证
  userId: string;
  // 承租人身份证照片哈希
  userImageHash: string;
  // 承租人身份证照片存证交易哈希
  userImageTxHash: string;
  // 承租人姓名 长度不可超过10
  userName: string;
  // 承租人手机号
  userPhoneNumber: string;
  // 身份认证类型 1支付宝实人，2芝麻实人，3非蚂蚁实人
  userType: number;
  // 额外通知第三方，如果需要通知相关方外的第三方，需要在此设置关联方的租户id，若不设置则只通知资方
  relatedNotify?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      alipayUid: 'alipay_uid',
      applicationId: 'application_id',
      async: 'async',
      extraInfo: 'extra_info',
      leaseCorpId: 'lease_corp_id',
      leaseCorpName: 'lease_corp_name',
      leaseCorpOwnerName: 'lease_corp_owner_name',
      loginId: 'login_id',
      loginTime: 'login_time',
      loginType: 'login_type',
      orderId: 'order_id',
      userBlockchainVerifyHash: 'user_blockchain_verify_hash',
      userEmail: 'user_email',
      userId: 'user_id',
      userImageHash: 'user_image_hash',
      userImageTxHash: 'user_image_tx_hash',
      userName: 'user_name',
      userPhoneNumber: 'user_phone_number',
      userType: 'user_type',
      relatedNotify: 'related_notify',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      alipayUid: 'string',
      applicationId: 'string',
      async: 'number',
      extraInfo: 'string',
      leaseCorpId: 'string',
      leaseCorpName: 'string',
      leaseCorpOwnerName: 'string',
      loginId: 'string',
      loginTime: 'string',
      loginType: 'number',
      orderId: 'string',
      userBlockchainVerifyHash: 'string',
      userEmail: 'string',
      userId: 'string',
      userImageHash: 'string',
      userImageTxHash: 'string',
      userName: 'string',
      userPhoneNumber: 'string',
      userType: 'number',
      relatedNotify: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseUserinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码 0表示成功
  code?: number;
  // 错误信息
  errMessage?: string;
  // 用户信息存储到合约中对应的区块链交易哈希
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseOrderinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实际预授权金额，芝麻信用免押金额 精确到毫厘，即123400表示12.34元
  acutalPreAuthFree: number;
  // 融资租赁业务id，由资方控制台创建返回
  applicationId?: string;
  // 是否启动异步处理订单
  async?: number;
  // 采购发票地址
  billUrl?: string;
  // 到期买断价 精确到毫厘，即123400表示12.34元
  buyOutPrice: number;
  // 市编码
  cityCode?: string;
  // 免押金额 精确到毫厘，即123400表示12.34元
  depositFree: number;
  // 区编码
  districtCode?: string;
  // 融资租赁额外字段
  extraInfo?: string;
  // 安装服务记录哈希
  installHash?: string;
  // 安装拆卸费 精确到毫厘，即123400表示12.34元
  installPrice?: number;
  // 安装服务记录链上存证交易哈希
  installTxHash?: string;
  // 保险单号
  insuranceNumber?: string;
  // 保险链接
  insuranceUrl?: string;
  // 租赁物入库日  格式为2019-8-31 12:00:00
  inStoreTime?: string;
  // 订单额外信息
  leaseOrderExtra?: LeaseOrderExtra[];
  // 融资租赁及服务协议之补充协议文件
  leaseServiceAdditionalFileHash?: string;
  // 融资租赁及服务协议之补充协议文件链上存证交易哈希
  leaseServiceAdditionalFileTxHash?: string;
  // 融资租赁及服务协议文件hash，三方协议
  leaseServiceFileHash: string;
  // 融资租赁及服务协议文件链上存证交易哈希
  leaseServiceFileTxHash: string;
  // 订单创建时间 格式为2019-8-31 12:00:00
  orderCreateTime: string;
  // 订单id 长度不可超过50
  orderId: string;
  // 支付订单ID
  orderPayId?: string;
  // 订单支付时间 格式为2019-8-31 12:00:00
  orderPayTime: string;
  // 订单支付类型 1 预授权，2信用套餐，3支付宝代扣，4其他
  orderPayType?: number;
  // 租赁物出库物流编号
  outStoreDeliverNumber?: string;
  // 租赁物出库日  格式为2019-8-31 12:00:00
  outStoreTime?: string;
  // 支付凭证地址
  payProofUrl?: string;
  // 预授权支付订单ID
  preAuthPayOrderId?: string;
  // 产品详细信息
  productInfo: ProductInfo[];
  // 省编码
  provinceCode?: string;
  // 采购发票文件哈希
  purchaseContractBillHash?: string;
  // 采购发票文件链上存证交易哈希
  purchaseContractBillTxHash?: string;
  // 采购合同文件哈希
  purchaseContractHash?: string;
  // 采购合同文件链上存证交易哈希
  purchaseContractTxHash?: string;
  // 采购合同地址
  purchaseContractUrl?: string;
  // 额外通知第三方，如果需要通知相关方外的第三方，需要在此设置关联方的租户id，若不设置则只通知资方	
  // 
  relatedNotify?: string[];
  // 租赁合同地址
  rentContractUrl?: string;
  // 月租金 精确到毫厘，即123400表示12.34元
  rentPricePerMonth: number;
  // 租期
  rentTerm: number;
  // 承租人签收记录哈希
  signHash?: string;
  // 承租人签收时间  格式为2019-8-31 12:00:00
  signTime?: string;
  // 承租人签收记录链上存证哈希
  signTxHash?: string;
  // 仓库类型 1实体仓 2虚拟仓
  storeType?: number;
  // 补充协议地址
  supplementProtocolUrl?: string;
  // 供应商对应的金融科技租户id，若有此字段，则会授权相应的供应商上传采购等相关信息
  supplierIsvAccount?: string;
  // 承租人收货地址
  userAddress: string;
  // 智能合同的合同id
  leaseServiceContractId?: string;
  // 网商直付通模式的代扣协议号
  agreementNo?: string;
  // 直付通代扣受理订单号
  agreementOrderId?: string;
  // 单位是毫厘，123400
  downPayment?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      acutalPreAuthFree: 'acutal_pre_auth_free',
      applicationId: 'application_id',
      async: 'async',
      billUrl: 'bill_url',
      buyOutPrice: 'buy_out_price',
      cityCode: 'city_code',
      depositFree: 'deposit_free',
      districtCode: 'district_code',
      extraInfo: 'extra_info',
      installHash: 'install_hash',
      installPrice: 'install_price',
      installTxHash: 'install_tx_hash',
      insuranceNumber: 'insurance_number',
      insuranceUrl: 'insurance_url',
      inStoreTime: 'in_store_time',
      leaseOrderExtra: 'lease_order_extra',
      leaseServiceAdditionalFileHash: 'lease_service_additional_file_hash',
      leaseServiceAdditionalFileTxHash: 'lease_service_additional_file_tx_hash',
      leaseServiceFileHash: 'lease_service_file_hash',
      leaseServiceFileTxHash: 'lease_service_file_tx_hash',
      orderCreateTime: 'order_create_time',
      orderId: 'order_id',
      orderPayId: 'order_pay_id',
      orderPayTime: 'order_pay_time',
      orderPayType: 'order_pay_type',
      outStoreDeliverNumber: 'out_store_deliver_number',
      outStoreTime: 'out_store_time',
      payProofUrl: 'pay_proof_url',
      preAuthPayOrderId: 'pre_auth_pay_order_id',
      productInfo: 'product_info',
      provinceCode: 'province_code',
      purchaseContractBillHash: 'purchase_contract_bill_hash',
      purchaseContractBillTxHash: 'purchase_contract_bill_tx_hash',
      purchaseContractHash: 'purchase_contract_hash',
      purchaseContractTxHash: 'purchase_contract_tx_hash',
      purchaseContractUrl: 'purchase_contract_url',
      relatedNotify: 'related_notify',
      rentContractUrl: 'rent_contract_url',
      rentPricePerMonth: 'rent_price_per_month',
      rentTerm: 'rent_term',
      signHash: 'sign_hash',
      signTime: 'sign_time',
      signTxHash: 'sign_tx_hash',
      storeType: 'store_type',
      supplementProtocolUrl: 'supplement_protocol_url',
      supplierIsvAccount: 'supplier_isv_account',
      userAddress: 'user_address',
      leaseServiceContractId: 'lease_service_contract_id',
      agreementNo: 'agreement_no',
      agreementOrderId: 'agreement_order_id',
      downPayment: 'down_payment',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      acutalPreAuthFree: 'number',
      applicationId: 'string',
      async: 'number',
      billUrl: 'string',
      buyOutPrice: 'number',
      cityCode: 'string',
      depositFree: 'number',
      districtCode: 'string',
      extraInfo: 'string',
      installHash: 'string',
      installPrice: 'number',
      installTxHash: 'string',
      insuranceNumber: 'string',
      insuranceUrl: 'string',
      inStoreTime: 'string',
      leaseOrderExtra: { 'type': 'array', 'itemType': LeaseOrderExtra },
      leaseServiceAdditionalFileHash: 'string',
      leaseServiceAdditionalFileTxHash: 'string',
      leaseServiceFileHash: 'string',
      leaseServiceFileTxHash: 'string',
      orderCreateTime: 'string',
      orderId: 'string',
      orderPayId: 'string',
      orderPayTime: 'string',
      orderPayType: 'number',
      outStoreDeliverNumber: 'string',
      outStoreTime: 'string',
      payProofUrl: 'string',
      preAuthPayOrderId: 'string',
      productInfo: { 'type': 'array', 'itemType': ProductInfo },
      provinceCode: 'string',
      purchaseContractBillHash: 'string',
      purchaseContractBillTxHash: 'string',
      purchaseContractHash: 'string',
      purchaseContractTxHash: 'string',
      purchaseContractUrl: 'string',
      relatedNotify: { 'type': 'array', 'itemType': 'string' },
      rentContractUrl: 'string',
      rentPricePerMonth: 'number',
      rentTerm: 'number',
      signHash: 'string',
      signTime: 'string',
      signTxHash: 'string',
      storeType: 'number',
      supplementProtocolUrl: 'string',
      supplierIsvAccount: 'string',
      userAddress: 'string',
      leaseServiceContractId: 'string',
      agreementNo: 'string',
      agreementOrderId: 'string',
      downPayment: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseOrderinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码
  // 0 表示成功
  code?: number;
  // 错误信息
  errMessage?: string;
  // 订单产品/服务信息存储到合约中对应的区块链交易哈希
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeasePromiseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 融资租赁业务id，由资方控制台生成返回
  applicationId?: string;
  // 审核方式,0为系统自动审核，1为人工审核
  auditMode: number;
  // 清分机构金融科技租户ID
  clearingOrg?: string;
  // 放款机构金融科技租户ID
  creditOrg: string;
  // 第一次还款时的日期
  firstPayDate?: string;
  // 融资机构的阿里uid
  leaseAlipayUid: string;
  // 宽限期，精确到毫秒
  limit: number;
  // 订单id 长度不可超过50
  orderId: string;
  // 应付租金，精确到毫厘，即123400表示12.34元
  payDateList: string[];
  // 租赁方承诺额外字段
  payExtraInfoList?: string[];
  // 应付租金 精确到毫厘，即123400表示12.34元	
  // 
  payMoney?: number;
  // 应付租金 精确到毫厘，即123400表示12.34元
  payMoneyList: number[];
  // 应付租金的期数
  payPeriod: number;
  // 是否启动异步订单处理
  async?: number;
  // 首付款代扣流水号，最大长度是128
  downPaymentSerialNumber?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applicationId: 'application_id',
      auditMode: 'audit_mode',
      clearingOrg: 'clearing_org',
      creditOrg: 'credit_org',
      firstPayDate: 'first_pay_date',
      leaseAlipayUid: 'lease_alipay_uid',
      limit: 'limit',
      orderId: 'order_id',
      payDateList: 'pay_date_list',
      payExtraInfoList: 'pay_extra_info_list',
      payMoney: 'pay_money',
      payMoneyList: 'pay_money_list',
      payPeriod: 'pay_period',
      async: 'async',
      downPaymentSerialNumber: 'down_payment_serial_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applicationId: 'string',
      auditMode: 'number',
      clearingOrg: 'string',
      creditOrg: 'string',
      firstPayDate: 'string',
      leaseAlipayUid: 'string',
      limit: 'number',
      orderId: 'string',
      payDateList: { 'type': 'array', 'itemType': 'string' },
      payExtraInfoList: { 'type': 'array', 'itemType': 'string' },
      payMoney: 'number',
      payMoneyList: { 'type': 'array', 'itemType': 'number' },
      payPeriod: 'number',
      async: 'number',
      downPaymentSerialNumber: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeasePromiseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码
  code?: number;
  // 错误信息
  errMessage?: string;
  // 租方承诺信息存储到合约中对应的区块链交易哈希
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseVerifyinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 融资租赁业务id，由资方控制台生成返回
  applicationId?: string;
  // 是否启动订单的异步处理
  async?: number;
  // 放款账户
  cardNumber?: string;
  // 授信终止时间，格式为"2019-07-31 12:00:00"
  creditEndTime?: string;
  // 授信额度，精确到毫厘，即123400表示12.34元
  creditLimit?: number;
  // 授信起始时间，格式为"2019-07-31 12:00:00"
  creditStartTime?: string;
  // 融资租赁审贷信息额外字段
  extraInfo?: string;
  // 承租企业统一社会信用代码 长度不可超过50
  leaseCorpId?: string;
  // 承租企业名称 长度不可超过50
  leaseCorpName?: string;
  // 承租法定代表人姓名 长度不可超过50
  leaseCorpOwnerName?: string;
  // 租赁服务平台id
  leaseId: string;
  // 放款流水单号
  loan?: string;
  // 订单id 长度不可超过50
  orderId: string;
  // 还款计划文件哈希
  payBackHash?: string;
  // 还款计划文件存证交易哈希
  payBackTxHash?: string;
  // 承租人身份证
  userId?: string;
  // 承租人姓名 长度不可超过10
  userName?: string;
  // 承租人手机号
  userPhoneNumber?: string;
  // 是否通过，0表示不通过，1表示通过
  verifyResult: number;
  // 付款汇款凭证 民盛转账成功后上传
  voucher?: string;
  // 拒绝的理由
  verifyRefuseDesc?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applicationId: 'application_id',
      async: 'async',
      cardNumber: 'card_number',
      creditEndTime: 'credit_end_time',
      creditLimit: 'credit_limit',
      creditStartTime: 'credit_start_time',
      extraInfo: 'extra_info',
      leaseCorpId: 'lease_corp_id',
      leaseCorpName: 'lease_corp_name',
      leaseCorpOwnerName: 'lease_corp_owner_name',
      leaseId: 'lease_id',
      loan: 'loan',
      orderId: 'order_id',
      payBackHash: 'pay_back_hash',
      payBackTxHash: 'pay_back_tx_hash',
      userId: 'user_id',
      userName: 'user_name',
      userPhoneNumber: 'user_phone_number',
      verifyResult: 'verify_result',
      voucher: 'voucher',
      verifyRefuseDesc: 'verify_refuse_desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applicationId: 'string',
      async: 'number',
      cardNumber: 'string',
      creditEndTime: 'string',
      creditLimit: 'number',
      creditStartTime: 'string',
      extraInfo: 'string',
      leaseCorpId: 'string',
      leaseCorpName: 'string',
      leaseCorpOwnerName: 'string',
      leaseId: 'string',
      loan: 'string',
      orderId: 'string',
      payBackHash: 'string',
      payBackTxHash: 'string',
      userId: 'string',
      userName: 'string',
      userPhoneNumber: 'string',
      verifyResult: 'number',
      voucher: 'string',
      verifyRefuseDesc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseVerifyinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码
  // 0表示成功
  code?: number;
  // 错误信息
  errMessage?: string;
  // 审贷信息存储到合约中对应的区块链交易哈希
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseCreditpromiseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 融资租赁业务id，由资方控制台创建返回
  applicationId?: string;
  // 融资租赁承诺额外字段
  creditPromiseExtraInfoList?: string[];
  // 租赁平台金融科技id
  leaseId: string;
  // 订单id 长度不可超过50
  orderId: string;
  // 垫付金额
  payInAdvanceMoney?: number;
  // 垫付金额，精确到毫厘，即123400表示12.34元
  payInAdvanceMoneyList?: number[];
  // 垫付日期
  payInAdvanceTime?: string;
  // 垫付日  格式为2019-8-31 12:00:00
  payInAdvanceTimeList: string[];
  // 根据融资租赁合同及其补充协议哈希
  promiseHash: string;
  // 根据融资租赁合同及其补充协议存证交易hash
  promiseTxHash: string;
  // 归还金额
  returnMoney?: number;
  // 还款金额，精确到毫厘，即123400表示12.34元
  returnMoneyList: number[];
  // 还款比例，精确到小数点后四位 12.34% 表示为1234
  returnRate?: number;
  // 归还日，格式为"2019-07-31 12:00:00"
  returnTime?: string;
  // 归还日，格式为"2019-07-31 12:00:00"
  returnTimeList: string[];
  // 是否启动异步订单处理
  async?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applicationId: 'application_id',
      creditPromiseExtraInfoList: 'credit_promise_extra_info_list',
      leaseId: 'lease_id',
      orderId: 'order_id',
      payInAdvanceMoney: 'pay_in_advance_money',
      payInAdvanceMoneyList: 'pay_in_advance_money_list',
      payInAdvanceTime: 'pay_in_advance_time',
      payInAdvanceTimeList: 'pay_in_advance_time_list',
      promiseHash: 'promise_hash',
      promiseTxHash: 'promise_tx_hash',
      returnMoney: 'return_money',
      returnMoneyList: 'return_money_list',
      returnRate: 'return_rate',
      returnTime: 'return_time',
      returnTimeList: 'return_time_list',
      async: 'async',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applicationId: 'string',
      creditPromiseExtraInfoList: { 'type': 'array', 'itemType': 'string' },
      leaseId: 'string',
      orderId: 'string',
      payInAdvanceMoney: 'number',
      payInAdvanceMoneyList: { 'type': 'array', 'itemType': 'number' },
      payInAdvanceTime: 'string',
      payInAdvanceTimeList: { 'type': 'array', 'itemType': 'string' },
      promiseHash: 'string',
      promiseTxHash: 'string',
      returnMoney: 'number',
      returnMoneyList: { 'type': 'array', 'itemType': 'number' },
      returnRate: 'number',
      returnTime: 'string',
      returnTimeList: { 'type': 'array', 'itemType': 'string' },
      async: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseCreditpromiseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码
  // 0表示成功
  code?: number;
  // 错误信息
  errMessage?: string;
  // 资方承诺信息存储到合约中对应的区块链交易哈希
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseDisburseinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 共管账户，网商清分
  activeAccount: string;
  // 对结果的简要描述信息
  activeResultDesc: string;
  // 成功/失败 0表示失败，1表示成功
  activeResultStatus: number;
  // 授信成功日期，格式为"2019-07-31 12:00:00"
  activeReturnDate: string;
  // 本金+利息，精确到毫厘，即123400表示12.34元
  activeReturnMoney: number;
  // 支用期限，精确到毫秒
  disburseLimit: number;
  // 支用金额，精确到毫厘，即123400表示12.34元
  disburseMoney: number;
  // 支用科目，服务费/租金，精确到毫厘，即123400表示12.34元
  disburseService: number;
  // 逾期天数，支用到期日开始计算，天数为单位
  exceedDuration: number;
  // 1未还款，2已还款
  exceedPayBackStatus: number;
  // 逾期利率，精确到小数点后四位 12.34% 表示为1234
  exceedRate: number;
  // 逾期应还款总额，本金+利息+逾期利息，精确到毫厘，即123400表示12.34元
  exceedReturnMoney: number;
  // 贷款利率,银行同步利率，年化8%-15%,精确到小数点后四位 12.34% 表示为1234
  loanRate: number;
  // 订单id 长度不可超过50
  orderId: string;
  // 到期还款日，T+支用期限，节假日顺延至第一个工作日，格式为"2019-07-31 12:00:00"
  payBackDate: string;
  // 到期还款金额，本金+利息，精确到毫厘，即123400表示12.34元
  payBackMoney: number;
  // 应还利息，系统自动计算当日应还利息（T+1），精确到毫厘，即123400表示12.34元
  returnInterest: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      activeAccount: 'active_account',
      activeResultDesc: 'active_result_desc',
      activeResultStatus: 'active_result_status',
      activeReturnDate: 'active_return_date',
      activeReturnMoney: 'active_return_money',
      disburseLimit: 'disburse_limit',
      disburseMoney: 'disburse_money',
      disburseService: 'disburse_service',
      exceedDuration: 'exceed_duration',
      exceedPayBackStatus: 'exceed_pay_back_status',
      exceedRate: 'exceed_rate',
      exceedReturnMoney: 'exceed_return_money',
      loanRate: 'loan_rate',
      orderId: 'order_id',
      payBackDate: 'pay_back_date',
      payBackMoney: 'pay_back_money',
      returnInterest: 'return_interest',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      activeAccount: 'string',
      activeResultDesc: 'string',
      activeResultStatus: 'number',
      activeReturnDate: 'string',
      activeReturnMoney: 'number',
      disburseLimit: 'number',
      disburseMoney: 'number',
      disburseService: 'number',
      exceedDuration: 'number',
      exceedPayBackStatus: 'number',
      exceedRate: 'number',
      exceedReturnMoney: 'number',
      loanRate: 'number',
      orderId: 'string',
      payBackDate: 'string',
      payBackMoney: 'number',
      returnInterest: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseDisburseinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码
  // 0表示成功
  code?: number;
  // 错误信息描述
  errMessage?: string;
  // 贷后字段存储到合约中对应的区块链交易哈希
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseOrderinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 融资租赁业务id，由资方控制台生成返回
  applicationId?: string;
  // 租赁平台金融科技租户id
  leaseId: string;
  // 订单id 长度不可超过50
  orderId: string;
  // 阶段描述
  phaseInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applicationId: 'application_id',
      leaseId: 'lease_id',
      orderId: 'order_id',
      phaseInfo: 'phase_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applicationId: 'string',
      leaseId: 'string',
      orderId: 'string',
      phaseInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseOrderinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误码
  // 0表示成功
  code?: number;
  // 错误信息描述
  errMessage?: string;
  // 订单详细信息
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFinanceTextnotaryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 反欺诈查询对应的身份证号码
  certNo?: string;
  // 哈希算法
  hashAlgorithm: string;
  // 位置描述信息
  location?: Location;
  // 反欺诈查询需要的手机号码
  mobile?: string;
  // 存证阶段，用户可自行维护
  phase: string;
  // 扩展属性
  properties?: string;
  // 文本哈希
  textHash: string;
  // 存证事务ID
  transactionId: string;
  // 是否使用可信时间戳
  tsr?: boolean;
  // 反欺诈查询需要的姓名
  userName?: string;
  // 本次请求的唯一id
  thirdMessageId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certNo: 'cert_no',
      hashAlgorithm: 'hash_algorithm',
      location: 'location',
      mobile: 'mobile',
      phase: 'phase',
      properties: 'properties',
      textHash: 'text_hash',
      transactionId: 'transaction_id',
      tsr: 'tsr',
      userName: 'user_name',
      thirdMessageId: 'third_message_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certNo: 'string',
      hashAlgorithm: 'string',
      location: Location,
      mobile: 'string',
      phase: 'string',
      properties: 'string',
      textHash: 'string',
      transactionId: 'string',
      tsr: 'boolean',
      userName: 'string',
      thirdMessageId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFinanceTextnotaryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 反欺诈对应的信用值
  creditRiskScore?: string;
  // 可信时间戳
  tsr?: TsrResponse;
  // 交易哈希
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      creditRiskScore: 'credit_risk_score',
      tsr: 'tsr',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      creditRiskScore: 'string',
      tsr: TsrResponse,
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFinanceTextnotaryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 位置信息
  location?: Location;
  // 存证阶段
  phase?: string;
  // 扩展属性，用户可自行维护
  properties?: string;
  // 存证事务ID
  transactionId?: string;
  // 交易哈希
  txHash: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      location: 'location',
      phase: 'phase',
      properties: 'properties',
      transactionId: 'transaction_id',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      location: Location,
      phase: 'string',
      properties: 'string',
      transactionId: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFinanceTextnotaryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 哈希算法
  hashAlgorithm?: string;
  // 文本哈希
  textHash?: string;
  // 可信时间戳
  tsr?: TsrResponse;
  // 存证阶段
  phase?: string;
  // 扩展属性
  properties?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      hashAlgorithm: 'hash_algorithm',
      textHash: 'text_hash',
      tsr: 'tsr',
      phase: 'phase',
      properties: 'properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      hashAlgorithm: 'string',
      textHash: 'string',
      tsr: TsrResponse,
      phase: 'string',
      properties: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFinanceFilenotaryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 反欺诈需要的证件号码
  certNo?: string;
  // 创建日期，时间戳类型，单位毫秒
  createdDate: number;
  // 存证文件名称
  fileName: string;
  // 文件存证类型，支持小于 1M 源文件或者文件哈希
  fileNotaryType: string;
  // 文件大小，单位 Bytes
  fileSize?: number;
  // 文件类型
  fileType: string;
  // 文件地址
  fileUrl?: string;
  // 哈希算法
  hashAlgorithm?: string;
  // 位置信息
  location?: Location;
  // 反欺诈查询需要的手机号
  mobile?: string;
  // 文件存证内容
  notaryContent: string;
  // 存证阶段
  phase: string;
  // 扩展属性，用户可自行维护
  properties?: string;
  // 存证事务ID
  transactionId: string;
  // 是否使用可信时间戳
  tsr?: boolean;
  // 反欺诈查询需要的证件上的姓名
  userName?: string;
  // 本次请求的唯一ID
  thirdMessageId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certNo: 'cert_no',
      createdDate: 'created_date',
      fileName: 'file_name',
      fileNotaryType: 'file_notary_type',
      fileSize: 'file_size',
      fileType: 'file_type',
      fileUrl: 'file_url',
      hashAlgorithm: 'hash_algorithm',
      location: 'location',
      mobile: 'mobile',
      notaryContent: 'notary_content',
      phase: 'phase',
      properties: 'properties',
      transactionId: 'transaction_id',
      tsr: 'tsr',
      userName: 'user_name',
      thirdMessageId: 'third_message_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certNo: 'string',
      createdDate: 'number',
      fileName: 'string',
      fileNotaryType: 'string',
      fileSize: 'number',
      fileType: 'string',
      fileUrl: 'string',
      hashAlgorithm: 'string',
      location: Location,
      mobile: 'string',
      notaryContent: 'string',
      phase: 'string',
      properties: 'string',
      transactionId: 'string',
      tsr: 'boolean',
      userName: 'string',
      thirdMessageId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFinanceFilenotaryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 反欺诈查询返回的信用值
  creditRiskScore?: string;
  // 可信时间戳
  tsr?: TsrResponse;
  // 交易哈希
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      creditRiskScore: 'credit_risk_score',
      tsr: 'tsr',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      creditRiskScore: 'string',
      tsr: TsrResponse,
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFinanceFilenotaryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 位置信息
  location?: Location;
  // 存证状态
  phase?: string;
  // 扩展属性，用户自行维护
  properties?: string;
  // 存证事务ID
  transactionId?: string;
  // 交易哈希
  txHash: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      location: 'location',
      phase: 'phase',
      properties: 'properties',
      transactionId: 'transaction_id',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      location: Location,
      phase: 'string',
      properties: 'string',
      transactionId: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFinanceFilenotaryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证文件名称
  fileName?: string;
  // 文件存证类型
  fileNotaryType?: string;
  // 哈希算法
  hashAlgorithm?: string;
  // FILE_HASH 模式时该值为文件哈希；FILE_RAW 模式时该值为临时 oss 下载地址
  notaryContent?: string;
  // 存证阶段
  phase?: string;
  // 扩展属性
  properties?: string;
  // 可信时间戳
  tsr?: TsrResponse;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      fileName: 'file_name',
      fileNotaryType: 'file_notary_type',
      hashAlgorithm: 'hash_algorithm',
      notaryContent: 'notary_content',
      phase: 'phase',
      properties: 'properties',
      tsr: 'tsr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      fileName: 'string',
      fileNotaryType: 'string',
      hashAlgorithm: 'string',
      notaryContent: 'string',
      phase: 'string',
      properties: 'string',
      tsr: TsrResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckIndustryNotaryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 行业类型
  industryType: string;
  // 核验数据列表
  notaryCheckMetaList: NotaryCheckMeta[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      industryType: 'industry_type',
      notaryCheckMetaList: 'notary_check_meta_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      industryType: 'string',
      notaryCheckMetaList: { 'type': 'array', 'itemType': NotaryCheckMeta },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckIndustryNotaryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 核验结果数组
  notaryCheckResults?: NotaryCheckResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      notaryCheckResults: 'notary_check_results',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      notaryCheckResults: { 'type': 'array', 'itemType': NotaryCheckResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSueBreakpromiseinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合同唯一标识
  // 
  orderId: string;
  // 当事人身份证号
  userId: string;
  // 当事人姓名
  userName: string;
  // 当事人手机号
  phoneNumber: string;
  // 当事人邮箱地址
  email: string;
  // 诉前Id
  preSueId: string;
  // 应履约日期，格式为"2019-07-31 12:00:00"
  promiseDate: string;
  // 宽限期(天数，从应履约日期到进行诉前违约惩戒的自然日数）
  promiseLimit: number;
  // 起诉期，格式为"2019-07-31 12:00:00"
  // 
  sueDate: string;
  // 商户统一社会信用代码或个人身份证
  initiatorId: string;
  // 商户或个人名称
  // 
  initiatorName: string;
  // 管辖法院名称
  courtName: string;
  // 法院唯一标识
  courtId: string;
  // 违约金额，精确到毫厘，即123400表示12.34元
  breakPromiseMoney: number;
  // 所属行业
  businessClass: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      userId: 'user_id',
      userName: 'user_name',
      phoneNumber: 'phone_number',
      email: 'email',
      preSueId: 'pre_sue_id',
      promiseDate: 'promise_date',
      promiseLimit: 'promise_limit',
      sueDate: 'sue_date',
      initiatorId: 'initiator_id',
      initiatorName: 'initiator_name',
      courtName: 'court_name',
      courtId: 'court_id',
      breakPromiseMoney: 'break_promise_money',
      businessClass: 'business_class',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      userId: 'string',
      userName: 'string',
      phoneNumber: 'string',
      email: 'string',
      preSueId: 'string',
      promiseDate: 'string',
      promiseLimit: 'number',
      sueDate: 'string',
      initiatorId: 'string',
      initiatorName: 'string',
      courtName: 'string',
      courtId: 'string',
      breakPromiseMoney: 'number',
      businessClass: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSueBreakpromiseinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 成功插入违约数据到区块链的交易哈希
  responseData?: string;
  // 状态码,0表示成功
  // 
  code?: string;
  // 错误信息
  errMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
      code: 'code',
      errMessage: 'err_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
      code: 'string',
      errMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSueBreakpromiseinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合同唯一标识，不可更新
  // 
  orderId: string;
  // 当事人手机号
  phoneNumber: string;
  // 当事人电子邮箱地址
  email: string;
  // 诉前Id，不可更新
  // 
  preSueId: string;
  // 应履约日期，格式为"2019-07-31 12:00:00"
  promiseDate: string;
  // 宽限期(天数，从应履约日期到进行诉前违约惩戒的自然日数）
  promiseLimit: number;
  // 起诉期，格式为"2019-07-31 12:00:00"
  sueDate: string;
  // 违约金额，精确到毫厘，即123400表示12.34元
  breakPromiseMoney: number;
  // 所属行业
  // 
  businessClass: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      phoneNumber: 'phone_number',
      email: 'email',
      preSueId: 'pre_sue_id',
      promiseDate: 'promise_date',
      promiseLimit: 'promise_limit',
      sueDate: 'sue_date',
      breakPromiseMoney: 'break_promise_money',
      businessClass: 'business_class',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      phoneNumber: 'string',
      email: 'string',
      preSueId: 'string',
      promiseDate: 'string',
      promiseLimit: 'number',
      sueDate: 'string',
      breakPromiseMoney: 'number',
      businessClass: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSueBreakpromiseinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 违约案件信息提交对应的区块链交易哈希
  responseData?: string;
  // 状态码,0表示成功
  // 
  code?: number;
  // 错误信息
  errMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
      code: 'code',
      errMessage: 'err_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
      code: 'number',
      errMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSueBreakpromiseinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合同唯一标识，不可更新
  orderId: string;
  // 诉前id，不可更新
  preSueId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      preSueId: 'pre_sue_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      preSueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSueBreakpromiseinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 违约案件信息提交对应的区块链交易哈希
  responseData?: string;
  // 状态码 0表示成功
  code?: number;
  // 错误信息
  errMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
      code: 'code',
      errMessage: 'err_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
      code: 'number',
      errMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySueUserinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 被查者身份证号
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySueUserinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码 0表示成功
  code?: number;
  // 错误信息
  errMessage?: string;
  // 用户违约个数
  responseData?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      responseData: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSueExeplarycontractRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合约名称
  contractId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      contractId: 'contract_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      contractId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSueExeplarycontractResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 0xabcdef123324234
  responseData?: string;
  // 状态码 0表示成功
  code?: number;
  // 错误信息
  errMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
      code: 'code',
      errMessage: 'err_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
      code: 'number',
      errMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSueExemplaryrevertRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户管理合约id
  contractId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      contractId: 'contract_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      contractId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSueExemplaryrevertResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 回退合约所对应的区块链交易哈希
  responseData?: string;
  // 错误码 0表示成功
  code?: number;
  // 错误信息描述
  errMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
      code: 'code',
      errMessage: 'err_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
      code: 'number',
      errMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseAuditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 融资租赁业务id，由资方控制台创建返回
  applicationId?: string;
  // 是否启动订单的异步处理
  async?: number;
  // 融资机构审核批次
  // 
  batchIndex?: string;
  // 当前订单处于本批次中的index
  currentAuditIndex?: number;
  // 融资租赁额外字段
  extraInfo?: string;
  // 租赁服务平台ID 长度不可超过50
  leaseId: string;
  // 融资机构审核状态，0.审核中1.审核失败2.审核成功
  manualAudit: number;
  // 融资结构审核说明，非必填，审核失败必填失败原因
  manualAuditComments?: string;
  // 订单id 长度不可超过50
  // 
  orderId: string;
  // 总审核的个数
  totalAuditNumber?: number;
  // 额外通知第三方，如果需要通知相关方外的第三方，需要在此设置关联方的租户id，若不设置则只通知资方	
  // 
  relatedNotify?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applicationId: 'application_id',
      async: 'async',
      batchIndex: 'batch_index',
      currentAuditIndex: 'current_audit_index',
      extraInfo: 'extra_info',
      leaseId: 'lease_id',
      manualAudit: 'manual_audit',
      manualAuditComments: 'manual_audit_comments',
      orderId: 'order_id',
      totalAuditNumber: 'total_audit_number',
      relatedNotify: 'related_notify',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applicationId: 'string',
      async: 'number',
      batchIndex: 'string',
      currentAuditIndex: 'number',
      extraInfo: 'string',
      leaseId: 'string',
      manualAudit: 'number',
      manualAuditComments: 'string',
      orderId: 'string',
      totalAuditNumber: 'number',
      relatedNotify: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseAuditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 0表示成功
  code?: number;
  // 错误信息
  // 
  errMessage?: string;
  // 融资平台审核订单信息存储到合约中对应的区块链交易哈希
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeasePaymentfileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 融资租赁业务id，由资方控制台生成
  applicationId?: string;
  // 是否启动订单的异步处理
  async?: number;
  // 融资租赁额外字段
  extraInfo?: string;
  // 租赁服务平台ID 长度不可超过50
  leaseId: string;
  // 订单id 长度不可超过50
  orderId: string;
  // 付款通知书加签完电子签名后，PDF文件hash
  paymentFileHash?: string;
  // 付款通知书存证交易哈希
  paymentFileTxHash?: string;
  // 付款通知所在路径
  paymentUrl?: string;
  // 额外通知第三方，如果需要通知相关方外的第三方，需要在此设置关联方的租户id，若不设置则只通知资方	
  // 
  relatedNotify?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applicationId: 'application_id',
      async: 'async',
      extraInfo: 'extra_info',
      leaseId: 'lease_id',
      orderId: 'order_id',
      paymentFileHash: 'payment_file_hash',
      paymentFileTxHash: 'payment_file_tx_hash',
      paymentUrl: 'payment_url',
      relatedNotify: 'related_notify',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applicationId: 'string',
      async: 'number',
      extraInfo: 'string',
      leaseId: 'string',
      orderId: 'string',
      paymentFileHash: 'string',
      paymentFileTxHash: 'string',
      paymentUrl: 'string',
      relatedNotify: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeasePaymentfileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码 0表示成功
  // 
  code?: number;
  // 错误信息
  // 
  errMessage?: string;
  // 租赁平台上传付款通知到合约中对应
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseRentalRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 融资租赁业务id，由资方控制台生成返回
  applicationId?: string;
  // 手续费，如通过预授权、代扣的方式规划，必填
  charge: number;
  // 融资租赁用户还款额外字段
  extraInfo?: string;
  // 是否本订单所有租金还款状态结束
  isFinish: boolean;
  // 租期编号，从1开始
  leaseTermIndex: number;
  // 订单id 长度不可超过50
  orderId: string;
  // 剩余租金总数,会核验剩余租金与承诺等额
  remainRental: number;
  // 剩余归还期数
  remainTerm: number;
  // 租金归还金额,精确到毫厘，即123400表示12.34元
  rentalMoney: number;
  // 租金归还状态，1.足额归还2.部分归还3.未归还
  rentalReturnState: number;
  // 归还时间，格式为"2019-07-31 12:00:00"
  returnTime: string;
  // 还款凭证编号，不超过128字符，1.支付宝流水号
  returnVoucherSerial: string;
  // 还款凭证类型，1.支付宝2.平台代收（客户主动还款）3.其他
  returnVoucherType: number;
  // 归还方式，1.预授权代扣2.支付宝代扣3.主动还款4.其他
  returnWay: number;
  // 是否启动订单的异步处理
  async?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applicationId: 'application_id',
      charge: 'charge',
      extraInfo: 'extra_info',
      isFinish: 'is_finish',
      leaseTermIndex: 'lease_term_index',
      orderId: 'order_id',
      remainRental: 'remain_rental',
      remainTerm: 'remain_term',
      rentalMoney: 'rental_money',
      rentalReturnState: 'rental_return_state',
      returnTime: 'return_time',
      returnVoucherSerial: 'return_voucher_serial',
      returnVoucherType: 'return_voucher_type',
      returnWay: 'return_way',
      async: 'async',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applicationId: 'string',
      charge: 'number',
      extraInfo: 'string',
      isFinish: 'boolean',
      leaseTermIndex: 'number',
      orderId: 'string',
      remainRental: 'number',
      remainTerm: 'number',
      rentalMoney: 'number',
      rentalReturnState: 'number',
      returnTime: 'string',
      returnVoucherSerial: 'string',
      returnVoucherType: 'number',
      returnWay: 'number',
      async: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseRentalResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码 0表示成功
  code?: number;
  // 错误信息
  // 
  errMessage?: string;
  // 租金归还记录上传到链上的哈希
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseClearingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 融资租赁业务id，由资方控制台创建返回
  applicationId?: string;
  // 清分收款账号 长度不超过64
  clearingAccount: string;
  // 清分金额,精确到毫厘，即123400表示12.34元
  clearingMoney: number;
  // 清分订单号 长度不超过128
  clearingOrderIds: string[];
  // 清分状态,1.足额2.部分3.零
  clearingState?: number;
  // 结束时间，格式为"2019-07-31 12:00:00"
  endTime: string;
  // 融资租赁额外字段
  extraInfo?: string;
  // 租赁平台商户Id 长度不可超过50
  leaseId: string;
  // 订单id 长度不可超过50
  // 
  orderId: string;
  // 还款批次
  returnIndex: number;
  // 开始时间，格式为"2019-07-31 12:00:00"
  startTime: string;
  // 是否启动订单的异步处理
  async?: number;
  // 清分资金的来源，比如用户xx元，商家yy元
  memo?: string;
  // 融资租赁资金方id
  creditId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applicationId: 'application_id',
      clearingAccount: 'clearing_account',
      clearingMoney: 'clearing_money',
      clearingOrderIds: 'clearing_order_ids',
      clearingState: 'clearing_state',
      endTime: 'end_time',
      extraInfo: 'extra_info',
      leaseId: 'lease_id',
      orderId: 'order_id',
      returnIndex: 'return_index',
      startTime: 'start_time',
      async: 'async',
      memo: 'memo',
      creditId: 'credit_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applicationId: 'string',
      clearingAccount: 'string',
      clearingMoney: 'number',
      clearingOrderIds: { 'type': 'array', 'itemType': 'string' },
      clearingState: 'number',
      endTime: 'string',
      extraInfo: 'string',
      leaseId: 'string',
      orderId: 'string',
      returnIndex: 'number',
      startTime: 'string',
      async: 'number',
      memo: 'string',
      creditId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseClearingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码 0表示成功
  code?: number;
  // 错误信息
  // 
  errMessage?: string;
  // 清分信息链上交易哈希
  // 
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseRepaymentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 融资租赁业务id，由资方控制台生成返回
  applicationId?: string;
  // 融资租赁租户还款额外字段
  extraInfo?: string;
  // 是否最终订单还款结束
  isFinish: boolean;
  // 租赁平台商户Id 长度不可超过50
  leaseId: string;
  // 订单id 长度不可超过50
  // 
  orderId: string;
  // 逾期天数,支用到期日开始计算
  overdueDay?: number;
  // 逾期应还款总额,本金+利息+逾期利息,精确到毫厘，即123400表示12.34元
  overdueMoney?: number;
  // 逾期利率（日利率）,精确到小数点后四位 12.34% 表示为1234
  overdueRate?: number;
  // 逾期状态,暂时都以0处理，目前不处理
  overdueStatus?: number;
  // 剩余应还金额，精确到毫厘，即123400表示12.34元
  remainReturnMoney: number;
  // 剩余应还期数
  // 
  remainReturnTerm: number;
  // 每次还款流水凭证，需要融资方确认，id一样则不处理
  repaymentUniqueId: string;
  // 还款结果简要描述,长度不超过256
  returnDescription: string;
  // 还款批次
  // 
  returnIndex: number;
  // 还款总额,本金+利息，精确到毫厘，即123400表示12.34元
  returnMoney: number;
  // 还款结果状态,1.成功 2.失败
  returnStatus: number;
  // 还款日期，格式为"2019-07-31 12:00:00"
  returnTime: string;
  // 还款来源,1.共管账号，2.网商清分
  source: number;
  // 逾期后还款状态,1未还款,2已还款
  status?: number;
  // 是否启动订单的异步处理
  async?: number;
  // 原所有权id
  // 
  // 
  oldOwnershipId?: string;
  // 现所有权id
  // 
  // 
  newOwnershipId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applicationId: 'application_id',
      extraInfo: 'extra_info',
      isFinish: 'is_finish',
      leaseId: 'lease_id',
      orderId: 'order_id',
      overdueDay: 'overdue_day',
      overdueMoney: 'overdue_money',
      overdueRate: 'overdue_rate',
      overdueStatus: 'overdue_status',
      remainReturnMoney: 'remain_return_money',
      remainReturnTerm: 'remain_return_term',
      repaymentUniqueId: 'repayment_unique_id',
      returnDescription: 'return_description',
      returnIndex: 'return_index',
      returnMoney: 'return_money',
      returnStatus: 'return_status',
      returnTime: 'return_time',
      source: 'source',
      status: 'status',
      async: 'async',
      oldOwnershipId: 'old_ownership_id',
      newOwnershipId: 'new_ownership_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applicationId: 'string',
      extraInfo: 'string',
      isFinish: 'boolean',
      leaseId: 'string',
      orderId: 'string',
      overdueDay: 'number',
      overdueMoney: 'number',
      overdueRate: 'number',
      overdueStatus: 'number',
      remainReturnMoney: 'number',
      remainReturnTerm: 'number',
      repaymentUniqueId: 'string',
      returnDescription: 'string',
      returnIndex: 'number',
      returnMoney: 'number',
      returnStatus: 'number',
      returnTime: 'string',
      source: 'number',
      status: 'number',
      async: 'number',
      oldOwnershipId: 'string',
      newOwnershipId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseRepaymentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码 0表示成功
  code?: number;
  // 错误信息
  errMessage?: string;
  // 融资租赁金融机构上传还款信息链上交易哈希值
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseNotifyregisterRequest extends $tea.Model {
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

export class CreateLeaseNotifyregisterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 0表示成功
  code?: number;
  // 错误描述
  errMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseIotinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询截止时间
  endTime: string;
  // 设备唯一id imei id
  productImeiId: string;
  // 查询开启时间
  startTime: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      endTime: 'end_time',
      productImeiId: 'product_imei_id',
      startTime: 'start_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      endTime: 'string',
      productImeiId: 'string',
      startTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseIotinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误码
  code?: number;
  // ""
  errMessage?: string;
  // 设备详情
  leaseIotItemInfo?: LeaseIotItemInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      leaseIotItemInfo: 'lease_iot_item_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      leaseIotItemInfo: { 'type': 'array', 'itemType': LeaseIotItemInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCourtTextnotaryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 对应的法院编号
  agencyCode?: string;
  // 对应的法院应用ID
  applicationCode?: string;
  // 业务类型标识
  businessType?: string;
  // 数据类型标识
  dataType?: string;
  // 地理位置信息
  location?: Location;
  // 存证阶段
  phase: string;
  // 扩展属性
  properties?: string;
  // 文本数据
  textContent: string;
  // 存证事务ID
  transactionId: string;
  // 是否使用可信时间戳
  tsr?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      agencyCode: 'agency_code',
      applicationCode: 'application_code',
      businessType: 'business_type',
      dataType: 'data_type',
      location: 'location',
      phase: 'phase',
      properties: 'properties',
      textContent: 'text_content',
      transactionId: 'transaction_id',
      tsr: 'tsr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      agencyCode: 'string',
      applicationCode: 'string',
      businessType: 'string',
      dataType: 'string',
      location: Location,
      phase: 'string',
      properties: 'string',
      textContent: 'string',
      transactionId: 'string',
      tsr: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCourtTextnotaryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 可信时间戳
  tsr?: TsrResponse;
  // 交易哈希
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tsr: 'tsr',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tsr: TsrResponse,
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCourtTextnotaryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 地理位置信息
  location?: Location;
  // 存证阶段
  phase?: string;
  // 扩展属性
  properties?: string;
  // 存证事务ID
  transactionId?: string;
  // 交易哈希
  txHash: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      location: 'location',
      phase: 'phase',
      properties: 'properties',
      transactionId: 'transaction_id',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      location: Location,
      phase: 'string',
      properties: 'string',
      transactionId: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCourtTextnotaryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务类型标识
  businessType?: string;
  // 数据类型标识
  dataType?: string;
  // 文本数据
  textContent?: string;
  // 可信时间戳
  tsr?: TsrResponse;
  // 对应的法院编号
  agencyCode?: string;
  // 对应的法院应用ID
  applicationCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      businessType: 'business_type',
      dataType: 'data_type',
      textContent: 'text_content',
      tsr: 'tsr',
      agencyCode: 'agency_code',
      applicationCode: 'application_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      businessType: 'string',
      dataType: 'string',
      textContent: 'string',
      tsr: TsrResponse,
      agencyCode: 'string',
      applicationCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCourtFilenotaryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 对应的法院编号
  agencyCode?: string;
  // 对应的法院应用ID	
  applicationCode?: string;
  // 业务类型标识
  businessType?: string;
  // 数据类型标识
  dataType?: string;
  // 文件哈希
  fileHash: string;
  // 文件名
  fileName: string;
  // 哈希算法，目前仅支持SHA256
  hashAlgorithm: string;
  // 地理位置信息
  location?: Location;
  // 存证阶段
  phase: string;
  // 扩展属性
  properties?: string;
  // 存证事务ID
  transactionId: string;
  // 是否使用可信时间戳
  tsr?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      agencyCode: 'agency_code',
      applicationCode: 'application_code',
      businessType: 'business_type',
      dataType: 'data_type',
      fileHash: 'file_hash',
      fileName: 'file_name',
      hashAlgorithm: 'hash_algorithm',
      location: 'location',
      phase: 'phase',
      properties: 'properties',
      transactionId: 'transaction_id',
      tsr: 'tsr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      agencyCode: 'string',
      applicationCode: 'string',
      businessType: 'string',
      dataType: 'string',
      fileHash: 'string',
      fileName: 'string',
      hashAlgorithm: 'string',
      location: Location,
      phase: 'string',
      properties: 'string',
      transactionId: 'string',
      tsr: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCourtFilenotaryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 可信时间戳
  tsr?: TsrResponse;
  // 交易哈希
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tsr: 'tsr',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tsr: TsrResponse,
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCourtFilenotaryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 地理位置信息
  location?: Location;
  // 存证阶段
  phase?: string;
  // 扩展属性
  properties?: string;
  // 存证事务ID
  transactionId?: string;
  // 交易哈希
  txHash: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      location: 'location',
      phase: 'phase',
      properties: 'properties',
      transactionId: 'transaction_id',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      location: Location,
      phase: 'string',
      properties: 'string',
      transactionId: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCourtFilenotaryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务类型标识
  businessType?: string;
  // 数据类型标识
  dataType?: string;
  // 文件哈希
  fileHash?: string;
  // 文件名
  fileName?: string;
  // 可信时间戳
  tsr?: TsrResponse;
  // 对应的法院编号
  agencyCode?: string;
  // 对应的法院应用ID
  applicationCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      businessType: 'business_type',
      dataType: 'data_type',
      fileHash: 'file_hash',
      fileName: 'file_name',
      tsr: 'tsr',
      agencyCode: 'agency_code',
      applicationCode: 'application_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      businessType: 'string',
      dataType: 'string',
      fileHash: 'string',
      fileName: 'string',
      tsr: TsrResponse,
      agencyCode: 'string',
      applicationCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseRouteRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 方法名
  route: string;
  // 具体业务字段，json形式
  bizContent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      route: 'route',
      bizContent: 'biz_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      route: 'string',
      bizContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseRouteResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码
  // 
  code?: number;
  // 错误信息
  // 
  errMessage?: string;
  // 租方承诺信息存储到合约中对应的区块链交易哈希
  // 
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseEncryptedinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 被查询的租赁公司对应的租户ID
  leaseId: string;
  // 订单id
  orderId: string;
  // 融资租赁业务id，由资方控制台创建返回
  applicationId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      leaseId: 'lease_id',
      orderId: 'order_id',
      applicationId: 'application_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      leaseId: 'string',
      orderId: 'string',
      applicationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseEncryptedinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误码
  code?: number;
  // 错误描述信息
  errMessage?: string;
  // 对应的加密后的具体信息
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractTextRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 签署结束信息，phase为FINISH时必选
  finishInfo?: ContractNotaryFinishInfo;
  // 签署流程ID
  flowId: string;
  // 签署发起信息，phase为INIT时必选
  initInfo?: ContractNotaryInitInfo;
  // 存证阶段，分为INIT(发起)，SIGN(签署)，FINISH(结束)
  phase: string;
  // 签署过程信息，phase为SIGN时必选
  signInfo?: ContractNotarySignInfo;
  // 存证事务ID
  transactionId: string;
  // 签署文件存档阶段存证核验信息
  documentInfo?: ContractNotaryDocumentInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      finishInfo: 'finish_info',
      flowId: 'flow_id',
      initInfo: 'init_info',
      phase: 'phase',
      signInfo: 'sign_info',
      transactionId: 'transaction_id',
      documentInfo: 'document_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      finishInfo: ContractNotaryFinishInfo,
      flowId: 'string',
      initInfo: ContractNotaryInitInfo,
      phase: 'string',
      signInfo: ContractNotarySignInfo,
      transactionId: 'string',
      documentInfo: ContractNotaryDocumentInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateContractTextResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证凭据
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyContractReportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 签署文件存档阶段存证核验信息
  documentInfo?: ContractNotaryDocumentInfo[];
  // 签署结束阶段存证核验信息
  finishInfo: ContractNotaryFinishInfo;
  // 签署流程ID
  flowId: string;
  // 签署发起阶段存证核验信息
  initInfo: ContractNotaryInitInfo;
  // 签署过程阶段存证核验信息
  signInfo: ContractNotarySignInfo[];
  // 存证事务ID
  transactionId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      documentInfo: 'document_info',
      finishInfo: 'finish_info',
      flowId: 'flow_id',
      initInfo: 'init_info',
      signInfo: 'sign_info',
      transactionId: 'transaction_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      documentInfo: { 'type': 'array', 'itemType': ContractNotaryDocumentInfo },
      finishInfo: ContractNotaryFinishInfo,
      flowId: 'string',
      initInfo: ContractNotaryInitInfo,
      signInfo: { 'type': 'array', 'itemType': ContractNotarySignInfo },
      transactionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyContractReportResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 出证报告授权码，通过核验后获得
  authCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      authCode: 'auth_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      authCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetContractTextRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 存证凭据
  txHash: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetContractTextResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证信息对象的JSON序列化形式
  notaryData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      notaryData: 'notary_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      notaryData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInternalTransRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 存证关联实体（个人/企业）的身份识别信息
  customer: Identity;
  // 扩展属性
  properties?: string;
  // 业务子类型标识
  subBizId?: string;
  // 是否使用可信时间戳，默认为false
  tsr?: boolean;
  // 代理客户存证时，实际用户的租户ID
  realTenant?: string;
  // 授权码
  authCode?: string;
  // 授权码对应的产品码
  product?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      customer: 'customer',
      properties: 'properties',
      subBizId: 'sub_biz_id',
      tsr: 'tsr',
      realTenant: 'real_tenant',
      authCode: 'auth_code',
      product: 'product',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      customer: Identity,
      properties: 'string',
      subBizId: 'string',
      tsr: 'boolean',
      realTenant: 'string',
      authCode: 'string',
      product: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInternalTransResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回事务ID，全局唯一
  transactionId?: string;
  // 可信时间信息
  tsr?: TsrResponse;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      transactionId: 'transaction_id',
      tsr: 'tsr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      transactionId: 'string',
      tsr: TsrResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInternalTextRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 哈希算法，目前仅支持 SHA256
  hashAlgorithm?: string;
  // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
  location?: Location;
  // 存证内容
  notaryContent: string;
  // 描述本条存证在存证事务中的阶段，用户可自行维护
  phase: string;
  // 扩展属性
  properties?: string;
  // 文本存证类型，支持源文本/文本哈希
  textNotaryType?: string;
  // 存证事务id
  transactionId: string;
  // 是否使用可信时间戳，默认为false
  tsr?: boolean;
  // 代理客户存证时，实际用户的租户ID
  realTenant?: string;
  // 授权码
  authCode?: string;
  // 授权码对应产品码
  product?: string;
  // 版权文本存证支持hash存证
  bizCategory?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      hashAlgorithm: 'hash_algorithm',
      location: 'location',
      notaryContent: 'notary_content',
      phase: 'phase',
      properties: 'properties',
      textNotaryType: 'text_notary_type',
      transactionId: 'transaction_id',
      tsr: 'tsr',
      realTenant: 'real_tenant',
      authCode: 'auth_code',
      product: 'product',
      bizCategory: 'biz_category',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      hashAlgorithm: 'string',
      location: Location,
      notaryContent: 'string',
      phase: 'string',
      properties: 'string',
      textNotaryType: 'string',
      transactionId: 'string',
      tsr: 'boolean',
      realTenant: 'string',
      authCode: 'string',
      product: 'string',
      bizCategory: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInternalTextResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 可信时间信息
  tsr?: TsrResponse;
  // 存证凭据
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tsr: 'tsr',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tsr: TsrResponse,
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseTextRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 哈希算法，目前仅支持 SHA256
  hashAlgorithm?: string;
  // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
  location?: Location;
  // 存证内容
  notaryContent: string;
  // 描述本条存证在存证事务中的阶段，用户可自行维护
  phase: string;
  // 扩展属性
  properties?: string;
  // 文本存证类型，支持源文本/文本哈希
  textNotaryType?: string;
  // 存证事务id
  transactionId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      hashAlgorithm: 'hash_algorithm',
      location: 'location',
      notaryContent: 'notary_content',
      phase: 'phase',
      properties: 'properties',
      textNotaryType: 'text_notary_type',
      transactionId: 'transaction_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      hashAlgorithm: 'string',
      location: Location,
      notaryContent: 'string',
      phase: 'string',
      properties: 'string',
      textNotaryType: 'string',
      transactionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseTextResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 入参中传入的存证阶段，可同用于租赁存证列表(twc.notary.lease.notary.list)的记录对账
  phase?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      phase: 'phase',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      phase: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件存证模式，目前仅支持 FILE_RAW 和 FILE_HASH
  fileNotaryType?: string;
  // 当文件存证模式为FILE_HASH时，用户可以指定该参数。当前服务仅支持 SHA256，若不填写，则默认值为 SHA256。
  hashAlgorithm?: string;
  // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
  location?: Location;
  // 存证文件内容，对文件内容做base64编码后得到。例如FILE_RAW模式下，文件内容为“test”，那么base64编码后的结果则为“dGVzdA==”。如果是FILE_HASh模式，则该字段直接为文件hash。
  notaryFile: string;
  // 存证文件名称
  notaryName: string;
  // 描述本条存证在存证事务中的阶段，用户可自行维护
  phase: string;
  // 扩展属性
  properties?: string;
  // 存证事务ID
  transactionId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileNotaryType: 'file_notary_type',
      hashAlgorithm: 'hash_algorithm',
      location: 'location',
      notaryFile: 'notary_file',
      notaryName: 'notary_name',
      phase: 'phase',
      properties: 'properties',
      transactionId: 'transaction_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileNotaryType: 'string',
      hashAlgorithm: 'string',
      location: Location,
      notaryFile: 'string',
      notaryName: 'string',
      phase: 'string',
      properties: 'string',
      transactionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 入参中的存证阶段信息，可同用于租赁存证列表(twc.notary.lease.notary.list)的记录对账
  phase?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      phase: 'phase',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      phase: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListLeaseNotaryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户订单号，需要同twc.notary.lease.order.create接口的传参一致
  merchantOrderNo?: string;
  // 接口订单号，需要同twc.notary.lease.order.create接口的传参一致
  orderNo: string;
  // 支付渠道，默认支持Alipay|ThirdParty|CreditCard|BankTransfer|WeChatPay|Other，需要同twc.notary.lease.order.create接口的传参一致
  paymentChannel?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantOrderNo: 'merchant_order_no',
      orderNo: 'order_no',
      paymentChannel: 'payment_channel',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantOrderNo: 'string',
      orderNo: 'string',
      paymentChannel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListLeaseNotaryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证记录列表
  records?: LeaseNotaryRecord[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      records: 'records',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      records: { 'type': 'array', 'itemType': LeaseNotaryRecord },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseApplicationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 每页的大小
  pageSize: number;
  // 起始id
  startId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageSize: 'page_size',
      startId: 'start_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageSize: 'number',
      startId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseApplicationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误码
  code?: number;
  // 错误描述
  errMessage?: string;
  // 返回值
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseApplicationdetailinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合约id
  applicationId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applicationId: 'application_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applicationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseApplicationdetailinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误码
  code?: number;
  // 错误描述
  errMessage?: string;
  // 合约定义详情
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetLeaseRepaymentstatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租赁机构金融科技租户Id
  leaseId: string;
  // 融资租赁对应的合约id
  applicationId?: string;
  // 融资租赁对应的订单id
  orderId: string;
  // finish只能为0或1，0表示订单重置此状态下订单可以被再次操作【如清分记录上传、还款记录上传等】，1表示订单结束，在1的状态下不会再进行清分、还款记录上传等操作
  finish: number;
  // 原所有权人金融科技租户id
  oldOwnershipId?: string;
  // 新所有权人租户id
  newOwnershipId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      leaseId: 'lease_id',
      applicationId: 'application_id',
      orderId: 'order_id',
      finish: 'finish',
      oldOwnershipId: 'old_ownership_id',
      newOwnershipId: 'new_ownership_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      leaseId: 'string',
      applicationId: 'string',
      orderId: 'string',
      finish: 'number',
      oldOwnershipId: 'string',
      newOwnershipId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetLeaseRepaymentstatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态重置对应的链上交易哈希
  responseData?: string;
  // 状态码，0表示成功
  code?: number;
  // 错误信息描述
  errMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
      code: 'code',
      errMessage: 'err_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
      code: 'number',
      errMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseSupplierinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租赁方及资方定义的合约id
  applicationId: string;
  // 额外字段定义
  extraInfo?: string;
  // 供应商发货的物流单号
  logisticsOrderId: string;
  // 用户的租赁订单id
  orderId: string;
  // 额外字段定义对应的阶段，请咨询对应的资方
  phase: string;
  // 采购订单id
  purchaseOrderId: string;
  // 产品详细信息
  supplierProductList: SupplierProductInfo[];
  // 1自有物流 2顺丰
  maintainedBySupplier: number;
  // 发货时间
  deliverTime: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applicationId: 'application_id',
      extraInfo: 'extra_info',
      logisticsOrderId: 'logistics_order_id',
      orderId: 'order_id',
      phase: 'phase',
      purchaseOrderId: 'purchase_order_id',
      supplierProductList: 'supplier_product_list',
      maintainedBySupplier: 'maintained_by_supplier',
      deliverTime: 'deliver_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applicationId: 'string',
      extraInfo: 'string',
      logisticsOrderId: 'string',
      orderId: 'string',
      phase: 'string',
      purchaseOrderId: 'string',
      supplierProductList: { 'type': 'array', 'itemType': SupplierProductInfo },
      maintainedBySupplier: 'number',
      deliverTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseSupplierinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误码，0表示成功
  code?: number;
  // 错误信息描述
  errMessage?: string;
  // 供应商上传采购等相关信息对应的链上哈希
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeployMytfTappRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // tappId
  tappId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tappId: 'tapp_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tappId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeployMytfTappResponse extends $tea.Model {
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

export class CreateLeaseSupplierdynamicinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合约id
  applicationId: string;
  // 签收记录哈希，已签收需要必填
  arriveConfirmHash?: string;
  // 用户签收时间，格式为2019-8-31 12:00:00，已签收需要必填
  arriveConfirmTime?: string;
  // 签收记录存证哈希，已签收需要必填
  arriveConfirmTxHash?: string;
  // 签收记录对应的url，已签收需要必填
  arriveConfirmUrl?: string;
  // 物流状态额外信息
  extraInfo?: string;
  // 物流状态，1.已发货 2运输中 3已签收 0其他
  logisticStatus: string;
  // 订单id
  orderId: string;
  // 阶段名称
  phase: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applicationId: 'application_id',
      arriveConfirmHash: 'arrive_confirm_hash',
      arriveConfirmTime: 'arrive_confirm_time',
      arriveConfirmTxHash: 'arrive_confirm_tx_hash',
      arriveConfirmUrl: 'arrive_confirm_url',
      extraInfo: 'extra_info',
      logisticStatus: 'logistic_status',
      orderId: 'order_id',
      phase: 'phase',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applicationId: 'string',
      arriveConfirmHash: 'string',
      arriveConfirmTime: 'string',
      arriveConfirmTxHash: 'string',
      arriveConfirmUrl: 'string',
      extraInfo: 'string',
      logisticStatus: 'string',
      orderId: 'string',
      phase: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseSupplierdynamicinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码
  code?: number;
  // 错误信息描述
  errMessage?: string;
  // 链上哈希
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseBizRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租赁订单相关内容，以json形式发送
  bizContent: string;
  // 租赁订单所属阶段
  type: string;
  // 租赁订单操作类型
  operationType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
      type: 'type',
      operationType: 'operation_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
      type: 'string',
      operationType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseBizResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 租赁信息上链后，链上对应的txHash
  responseData?: string;
  // 错误码
  code?: string;
  // 错误信息描述
  errMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
      code: 'code',
      errMessage: 'err_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
      code: 'string',
      errMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseProofRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务逻辑的订单id
  orderId: string;
  // 2020
  applicationId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      applicationId: 'application_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      applicationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseProofResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 核验结果数据
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLargefileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 上传至中枢文件扩展服务后得到的文件ID
  fileId: string;
  // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
  location?: Location;
  // 存证事务ID
  transactionId: string;
  // 是否使用可信时间戳，默认为false
  tsr?: boolean;
  // 存证文件名称
  notaryName: string;
  // 描述本条存证在存证事务中的阶段，用户可自行维护
  phase: string;
  // 扩展属性
  properties?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileId: 'file_id',
      location: 'location',
      transactionId: 'transaction_id',
      tsr: 'tsr',
      notaryName: 'notary_name',
      phase: 'phase',
      properties: 'properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileId: 'string',
      location: Location,
      transactionId: 'string',
      tsr: 'boolean',
      notaryName: 'string',
      phase: 'string',
      properties: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLargefileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 可信时间信息
  tsr?: TsrResponse;
  // 存证凭证
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tsr: 'tsr',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tsr: TsrResponse,
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseBizRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租赁订单相关内容，以json形式发送
  bizContent: string;
  // 租赁订单所属阶段
  type: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeaseBizResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回的查询值
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseBiznotaryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 要存证的文件哈希
  hash: string;
  // 租赁机构社会统一信用码
  leaseCorpId: string;
  // 租赁机构公司名称
  leaseCorpName: string;
  // 租赁机构法人姓名
  leaseCorpOwnerName: string;
  // 被代理机构金融科技租户id
  agentLeaseId?: string;
  // 模式，代理模式为isvMode
  mode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      hash: 'hash',
      leaseCorpId: 'lease_corp_id',
      leaseCorpName: 'lease_corp_name',
      leaseCorpOwnerName: 'lease_corp_owner_name',
      agentLeaseId: 'agent_lease_id',
      mode: 'mode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      hash: 'string',
      leaseCorpId: 'string',
      leaseCorpName: 'string',
      leaseCorpOwnerName: 'string',
      agentLeaseId: 'string',
      mode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseBiznotaryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否租赁宝存证哈希成功，成功则为0，否则不为0
  code?: number;
  // 错误码具体详情
  errMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInternalContractRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 签署结束信息，phase为FINISH时必选
  finishInfo?: ContractNotaryFinishInfo;
  // 签署流程ID
  flowId: string;
  // 签署发起信息，phase为INIT时必选
  initInfo?: ContractNotaryInitInfo;
  // 存证阶段，分为INIT(发起)，SIGN(签署)，FINISH(结束)，DOCUMENT(正式合同文件)，DEDUCT_CANCEL(代扣计划取消)，DEDUCT_EXECUTION(代扣计划执行)，DEDUCT_PLAN(代扣计划保存)，DEDUCT_REFUND(代扣计划退款)
  phase: string;
  // 签署过程信息，phase为SIGN时必选
  signInfo?: ContractNotarySignInfo;
  // 存证事务ID
  transactionId: string;
  // 签署文件存档阶段存证核验信息
  documentInfo?: ContractNotaryDocumentInfo;
  // 电子合同代扣计划取消操作信息
  cancelInfo?: ContractNotaryDeductCancelInfo;
  // 电子合同存证代扣计划执行操作信息
  executionInfo?: ContractNotaryDeductExecutionInfo;
  // 电子合同存证代扣计划信息
  planInfo?: ContractNotaryDeductPlanInfo;
  // 电子合同存证代扣计划退款信息
  refundInfo?: ContractNotaryDeductRefundInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      finishInfo: 'finish_info',
      flowId: 'flow_id',
      initInfo: 'init_info',
      phase: 'phase',
      signInfo: 'sign_info',
      transactionId: 'transaction_id',
      documentInfo: 'document_info',
      cancelInfo: 'cancel_info',
      executionInfo: 'execution_info',
      planInfo: 'plan_info',
      refundInfo: 'refund_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      finishInfo: ContractNotaryFinishInfo,
      flowId: 'string',
      initInfo: ContractNotaryInitInfo,
      phase: 'string',
      signInfo: ContractNotarySignInfo,
      transactionId: 'string',
      documentInfo: ContractNotaryDocumentInfo,
      cancelInfo: ContractNotaryDeductCancelInfo,
      executionInfo: ContractNotaryDeductExecutionInfo,
      planInfo: ContractNotaryDeductPlanInfo,
      refundInfo: ContractNotaryDeductRefundInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInternalContractResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证凭据
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseZftagreementsignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 合约id
  applicationId: string;
  // 网商直付通代扣协议号
  agreementNo: string;
  // 实际签署协议的用户支付宝uid
  alipayUserId?: string;
  // 签署时间
  signTime?: string;
  // 协议生效时间
  validTime?: string;
  // 协议失效时间
  invalidTime?: string;
  // 租赁方金融科技租户id
  leaseId: string;
  // 核验结果，1表示通过，-1表示不通过
  agreementStatus: number;
  // 租赁机构支付宝uid
  leaseCorpAlipayUid?: string;
  // 直付通代扣协议核验结果说明
  failMessage?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      applicationId: 'application_id',
      agreementNo: 'agreement_no',
      alipayUserId: 'alipay_user_id',
      signTime: 'sign_time',
      validTime: 'valid_time',
      invalidTime: 'invalid_time',
      leaseId: 'lease_id',
      agreementStatus: 'agreement_status',
      leaseCorpAlipayUid: 'lease_corp_alipay_uid',
      failMessage: 'fail_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      applicationId: 'string',
      agreementNo: 'string',
      alipayUserId: 'string',
      signTime: 'string',
      validTime: 'string',
      invalidTime: 'string',
      leaseId: 'string',
      agreementStatus: 'number',
      leaseCorpAlipayUid: 'string',
      failMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseZftagreementsignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误码描述
  errMessage?: string;
  // 错误码
  code?: number;
  // 协议上链哈希
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      errMessage: 'err_message',
      code: 'code',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      errMessage: 'string',
      code: 'number',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseZftagreementunsignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 合约id
  applicationId: string;
  // 租赁方金融科技租户id
  leaseId: string;
  // 直付通网商模式代扣协议号
  agreementNo: string;
  // 直付通代扣协议解约时间
  unsignTime: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      applicationId: 'application_id',
      leaseId: 'lease_id',
      agreementNo: 'agreement_no',
      unsignTime: 'unsign_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      applicationId: 'string',
      leaseId: 'string',
      agreementNo: 'string',
      unsignTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeaseZftagreementunsignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误码描述信息
  errMessage?: string;
  // 错误码
  code?: number;
  // 网商直付通解约链上哈希
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      errMessage: 'err_message',
      code: 'code',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      errMessage: 'string',
      code: 'number',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCertificateDetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 存证哈希地址
  txHash: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCertificateDetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证证明下载地址
  url?: string;
  // 状态值
  code?: number;
  // 状态信息描述
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      url: 'url',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      url: 'string',
      code: 'number',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInternalTextRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
  location?: Location;
  // 描述本条存证在存证事务中的阶段，用户可自行维护
  phase?: string;
  // 扩展属性
  properties?: string;
  // 存证事务id
  transactionId?: string;
  // 存证凭据
  txHash: string;
  // 租户
  realTenant?: string;
  // 授权码
  authCode?: string;
  // 产品码
  product?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      location: 'location',
      phase: 'phase',
      properties: 'properties',
      transactionId: 'transaction_id',
      txHash: 'tx_hash',
      realTenant: 'real_tenant',
      authCode: 'auth_code',
      product: 'product',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      location: Location,
      phase: 'string',
      properties: 'string',
      transactionId: 'string',
      txHash: 'string',
      realTenant: 'string',
      authCode: 'string',
      product: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInternalTextResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证信息
  content?: string;
  // 可信信息
  tsr?: TsrResponse;
  // 文本存证类型
  textNotaryType?: string;
  // 哈希算法
  hashAlgorithm?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      content: 'content',
      tsr: 'tsr',
      textNotaryType: 'text_notary_type',
      hashAlgorithm: 'hash_algorithm',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      content: 'string',
      tsr: TsrResponse,
      textNotaryType: 'string',
      hashAlgorithm: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OpenInternalTwcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授权开通的租户ID
  tenantId: string;
  // 授权开通的产品码
  product: string;
  // 授权开通的行业类型（版权/租赁）
  customerBizId: string;
  // 授权码
  authCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      product: 'product',
      customerBizId: 'customer_biz_id',
      authCode: 'auth_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      product: 'string',
      customerBizId: 'string',
      authCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OpenInternalTwcResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态值
  code?: string;
  // 状态信息描述
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSpecifyTransRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 存证关联实体（个人/企业）的身份识别信息
  customer: Identity;
  // 扩展属性
  properties?: string;
  // 业务子类型标识
  subBizId?: string;
  // 是否使用可信时间戳，默认为false
  tsr?: boolean;
  // 链账户名称
  chainAccount: string;
  // 指定的上链节点ip
  nodeIp?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      customer: 'customer',
      properties: 'properties',
      subBizId: 'sub_biz_id',
      tsr: 'tsr',
      chainAccount: 'chain_account',
      nodeIp: 'node_ip',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      customer: Identity,
      properties: 'string',
      subBizId: 'string',
      tsr: 'boolean',
      chainAccount: 'string',
      nodeIp: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSpecifyTransResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回事务ID，全局唯一
  transactionId?: string;
  // 可信时间信息
  tsr?: TsrResponse;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      transactionId: 'transaction_id',
      tsr: 'tsr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      transactionId: 'string',
      tsr: TsrResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSpecifyTextRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
  location?: Location;
  // 存证内容
  notaryContent: string;
  // 描述本条存证在存证事务中的阶段，用户可自行维护
  phase: string;
  // 扩展属性
  properties?: string;
  // 存证事务id
  transactionId: string;
  // 是否使用可信时间戳，默认为false
  tsr?: boolean;
  // 文本存证类型，支持源文本/文本哈希
  textNotaryType?: string;
  // 哈希算法，目前仅支持 SHA256
  hashAlgorithm?: string;
  // 链账户名称
  chainAccount: string;
  // 指定上链的节点ip，固定只能传一个，不传则按照链账号绑定ip随机上链
  nodeIp?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      location: 'location',
      notaryContent: 'notary_content',
      phase: 'phase',
      properties: 'properties',
      transactionId: 'transaction_id',
      tsr: 'tsr',
      textNotaryType: 'text_notary_type',
      hashAlgorithm: 'hash_algorithm',
      chainAccount: 'chain_account',
      nodeIp: 'node_ip',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      location: Location,
      notaryContent: 'string',
      phase: 'string',
      properties: 'string',
      transactionId: 'string',
      tsr: 'boolean',
      textNotaryType: 'string',
      hashAlgorithm: 'string',
      chainAccount: 'string',
      nodeIp: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSpecifyTextResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 可信时间信息
  tsr?: TsrResponse;
  // 存证凭据
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tsr: 'tsr',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tsr: TsrResponse,
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInternalFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 存证事务id
  transactionId: string;
  // 描述本条存证在存证事务中的阶段，用户可自行维护
  phase: string;
  // 存证文件内容，对文件内容做base64编码后得到。例如FILE_RAW模式下，文件内容为“test”，那么base64编码后的结果则为“dGVzdA==”。如果是FILE_HASh模式，则该字段直接为文件hash。
  notaryFile: string;
  // 存证文件名称
  notaryName: string;
  // 文件存证模式，目前仅支持 FILE_RAW(文件原文内容) 和 FILE_HASH(文件hash)，建议填写，不填默认是FILE_RAW
  fileNotaryType?: string;
  // 哈希算法，当 fileNotaryType 为 FILE_HASH 时填写，目前仅支持 SHA256
  hashAlgorithm?: string;
  // 是否使用可信时间戳，默认为false
  tsr?: boolean;
  // 存证地点信息(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
  location?: Location;
  // 扩展属性
  properties?: string;
  // 代理客户存证时，实际用户的租户ID
  realTenant?: string;
  // 授权码
  authCode?: string;
  // 授权码对应产品码
  product?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      transactionId: 'transaction_id',
      phase: 'phase',
      notaryFile: 'notary_file',
      notaryName: 'notary_name',
      fileNotaryType: 'file_notary_type',
      hashAlgorithm: 'hash_algorithm',
      tsr: 'tsr',
      location: 'location',
      properties: 'properties',
      realTenant: 'real_tenant',
      authCode: 'auth_code',
      product: 'product',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      transactionId: 'string',
      phase: 'string',
      notaryFile: 'string',
      notaryName: 'string',
      fileNotaryType: 'string',
      hashAlgorithm: 'string',
      tsr: 'boolean',
      location: Location,
      properties: 'string',
      realTenant: 'string',
      authCode: 'string',
      product: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateInternalFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证凭据，存证交易Hash值
  txHash?: string;
  // 可信时间信息
  tsr?: TsrResponse;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      tsr: 'tsr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      tsr: TsrResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInternalFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 存证凭据，需要先调用内部文本存证接口twc.notary.internal.file.create创建存证
  txHash: string;
  // 描述本条存证在存证事务中的阶段，用户可自行维护
  phase?: string;
  // 存证事务id，通过twc.notary.internal.trans.create(创建存证事务)获得
  transactionId?: string;
  // 存证地点信息(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
  location?: Location;
  // 扩展属性
  properties?: string;
  // 代理客户存证时，实际用户的租户ID
  realTenant?: string;
  // 授权码
  // 
  authCode?: string;
  // 授权码对应产品码
  product?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      txHash: 'tx_hash',
      phase: 'phase',
      transactionId: 'transaction_id',
      location: 'location',
      properties: 'properties',
      realTenant: 'real_tenant',
      authCode: 'auth_code',
      product: 'product',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      txHash: 'string',
      phase: 'string',
      transactionId: 'string',
      location: Location,
      properties: 'string',
      realTenant: 'string',
      authCode: 'string',
      product: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetInternalFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文件存证模式，FILE_RAW(文件原文内容) 和 FILE_HASH(文件hash)
  fileNotaryType?: string;
  // 文件下载地址，当fileNotaryType 为 FILE_RAW 时才有此值，下载链接有效期1个小时
  ossPath?: string;
  // 文件哈希，当 fileNotaryType 为 FILE_HASH 时才有此值
  fileHash?: string;
  // 哈希算法，当 fileNotaryType 为 FILE_HASH 时，此返回值才有效
  hashAlgorithm?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      fileNotaryType: 'file_notary_type',
      ossPath: 'oss_path',
      fileHash: 'file_hash',
      hashAlgorithm: 'hash_algorithm',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      fileNotaryType: 'string',
      ossPath: 'string',
      fileHash: 'string',
      hashAlgorithm: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFlowInstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 全流程模板id，需要提前创建好模板才能获取
  templateId: string;
  // 流程名称，同一个租户下同一个模板，建议唯一不重复
  flowName: string;
  // 存证关联实体（个人/企业）的身份识别信息
  notaryUser: NotaryUser;
  // 扩展属性
  properties?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      templateId: 'template_id',
      flowName: 'flow_name',
      notaryUser: 'notary_user',
      properties: 'properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      templateId: 'string',
      flowName: 'string',
      notaryUser: NotaryUser,
      properties: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFlowInstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 流程ID，全局唯一
  flowId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      flowId: 'flow_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      flowId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FinishFlowInstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程id，通过twc.notary.instance.create(创建存证流程实例)获取
  flowId: string;
  // 是否需要legal标，默认为false，如果需要则填true
  needLegalLogo?: boolean;
  // 证据包类型，默认为空，不需要证据包，如果需要则按需填写，目前支持ChainEvidencePack(链上证据包)，其他包括LocalEvidencePack(链下证据包)，链下证据包前置依赖链上证据包，因此填写链下证据包会先生成链上证据包。
  // 链上证据包，即全流程所有阶段存证关系链上固化，生成全流程链上证据统一txHash；
  // 链下证据包，即全流程所有内容生成链下压缩包文件。
  evidencePackType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      needLegalLogo: 'need_legal_logo',
      evidencePackType: 'evidence_pack_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      needLegalLogo: 'boolean',
      evidencePackType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FinishFlowInstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // legal标URL，只有当入参needLegalLogo为true且响应resultCode=200时才会返回
  legalLogoUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      legalLogoUrl: 'legal_logo_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      legalLogoUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitFlowPhaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程id，通过twc.notary.instance.create(创建存证流程实例)获取
  flowId: string;
  // 阶段编号，与模板阶段编号保持一致，不同阶段阶段编号不一样，要与阶段存证内容保持一致
  phaseNo: number;
  // 阶段存证内容，如果模板数据类型定义是Hash(哈希)则填入Hash即可，如果定义是Structure(结构化)，则填入模板所有字段json对象的字符串Base64后的值
  notaryContent: string;
  // 业务方原始数据ID，方便与业务方进行数据核对使用
  originDataId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      phaseNo: 'phase_no',
      notaryContent: 'notary_content',
      originDataId: 'origin_data_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      phaseNo: 'number',
      notaryContent: 'string',
      originDataId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitFlowPhaseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 阶段id
  phaseId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      phaseId: 'phase_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      phaseId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFlowPhaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程id，通过twc.notary.instance.create(创建存证流程实例)获取
  flowId: string;
  // 阶段id，通过twc.notary.flow.phase.init获取
  phaseId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      phaseId: 'phase_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      phaseId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFlowPhaseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易Hash
  txHash?: string;
  // 存证状态，FINISH(生成完毕)、INIT(初始化中)、FAILED(生成失败)
  status?: string;
  // 阶段注册成功时间戳
  registerTime?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      status: 'status',
      registerTime: 'register_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      status: 'string',
      registerTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailFlowPhaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程id，通过twc.notary.instance.create(创建存证流程实例)获取
  flowId: string;
  // 阶段ID，通过twc.notary.flow.phase.create(创建阶段存证)创建了阶段存证获取
  phaseId: string;
  // 链上交易Hash，必须成功阶段存证后，通过twc.notary.flow.phase.query获取
  txHash: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      phaseId: 'phase_id',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      phaseId: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailFlowPhaseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 阶段存证交易hash
  txHash?: string;
  // 模板字段类型，Hash/Structure，(Hash->哈希,Structure->结构化)
  dataType?: string;
  // 阶段存证内容，如果模板数据类型定义是Hash(哈希)则返回存证时Hash，如果定义是Structure(结构化)，则返回所有字段json对象的字符串Base64后的值
  notaryContent?: string;
  // 结构化数据里面英文key对应的中文名称关系，json格式，key为字段英文名，value为字段中文名称
  // 
  dataTypeKey?: string;
  // 阶段存证内容csv下载地址，暂时预留，存证内容过大时采用文件形式输出，有效期1个小时
  url?: string;
  // 交易所在的区块Hash
  blockHash?: string;
  // 交易所在的区块高
  blockHeight?: string;
  // 阶段注册成功时间戳
  registerTime?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      dataType: 'data_type',
      notaryContent: 'notary_content',
      dataTypeKey: 'data_type_key',
      url: 'url',
      blockHash: 'block_hash',
      blockHeight: 'block_height',
      registerTime: 'register_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      dataType: 'string',
      notaryContent: 'string',
      dataTypeKey: 'string',
      url: 'string',
      blockHash: 'string',
      blockHeight: 'string',
      registerTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFlowOnestepnotaryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 全流程模板id，需要提前创建好模板才能获取
  templateId: string;
  // 流程名称，同一个租户下同一个模板，建议唯一不重复
  flowName: string;
  // 存证关联实体（个人/企业）的身份识别信息
  notaryUser: NotaryUser;
  // 阶段存证内容列表，根据模板定义传入
  phaseNotaryList: PhaseNotary[];
  // 扩展属性
  properties?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      templateId: 'template_id',
      flowName: 'flow_name',
      notaryUser: 'notary_user',
      phaseNotaryList: 'phase_notary_list',
      properties: 'properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      templateId: 'string',
      flowName: 'string',
      notaryUser: NotaryUser,
      phaseNotaryList: { 'type': 'array', 'itemType': PhaseNotary },
      properties: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFlowOnestepnotaryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回流程ID，全局唯一
  flowId?: string;
  // 阶段存证结果列表
  phaseCreateResultList?: PhaseCreateResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      flowId: 'flow_id',
      phaseCreateResultList: 'phase_create_result_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      flowId: 'string',
      phaseCreateResultList: { 'type': 'array', 'itemType': PhaseCreateResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFlowOnestepnotaryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程id，通过twc.notary.flow.onestepnotary.create接口获取
  flowId: string;
  // 是否需要legal标，默认为false，如果需要则填true
  needLegalLogo?: boolean;
  // 证据包类型，默认为空，不需要证据包，如果需要则按需填写，目前支持ChainEvidencePack(链上证据包)，其他包括LocalEvidencePack(链下证据包)，链下证据包前置依赖链上证据包，因此填写链下证据包会先生成链上证据包。
  // 链上证据包，即全流程所有阶段存证关系链上固化，生成全流程链上证据统一txHash；
  // 链下证据包，即全流程所有内容生成链下压缩包文件。
  evidencePackType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      needLegalLogo: 'need_legal_logo',
      evidencePackType: 'evidence_pack_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      needLegalLogo: 'boolean',
      evidencePackType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFlowOnestepnotaryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证全流程状态，FINISH(完结)、PROCESSING(上链中)、DISABLE(失效)、FAILED(失败)
  status?: string;
  // 阶段存证查询结果列表
  phaseQueryResultList?: PhaseQueryResult[];
  // legal标URL，只有当入参needLegalLogo为true且响应status为FINISH时才会返回
  legalLogoUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      phaseQueryResultList: 'phase_query_result_list',
      legalLogoUrl: 'legal_logo_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      phaseQueryResultList: { 'type': 'array', 'itemType': PhaseQueryResult },
      legalLogoUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyFlowCertificateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程id
  flowId: string;
  // 证书类型，AntchainCertification（蚂蚁链存证证明）、OrgCertification（公证处存证证明），目前支持公证处
  certificationType: string;
  // 公证处ID，OrgCertification（公证处存证证明）选填，不填则为默认公证处
  orgId?: string;
  // 是否需要legal码，默认为false即不需要，true表示需要
  needLegalCode?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      certificationType: 'certification_type',
      orgId: 'org_id',
      needLegalCode: 'need_legal_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      certificationType: 'string',
      orgId: 'string',
      needLegalCode: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyFlowCertificateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 出证订单号
  orderNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFlowCertificateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程id
  flowId: string;
  // 证书类型，AntchainCertification（蚂蚁链存证证明）、OrgCertification（公证处存证证明），目前支持公证处
  certificationType: string;
  // 通过twc.notary.flow.certificate.apply(存证全流程证明申请)获取到的订单号
  orderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      certificationType: 'certification_type',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      certificationType: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFlowCertificateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证证明下载地址，有效期1个小时
  certificateUrl?: string;
  // Legal码H5页面URL
  legalCodeUrl?: string;
  // Legal码证书H5页面URL
  legalShowUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certificateUrl: 'certificate_url',
      legalCodeUrl: 'legal_code_url',
      legalShowUrl: 'legal_show_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certificateUrl: 'string',
      legalCodeUrl: 'string',
      legalShowUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyStubCertificateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程id
  flowId: string;
  // 证书类型，AntchainCertification（蚂蚁链存证证明）、OrgCertification（公证处存证证明），目前支持公证处
  certificationType: string;
  // 公证处ID，OrgCertification（公证处存证证明）选填，不填则为默认公证处
  orgId?: string;
  // 是否需要legal码，默认为false即不需要，true表示需要
  needLegalCode?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      certificationType: 'certification_type',
      orgId: 'org_id',
      needLegalCode: 'need_legal_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      certificationType: 'string',
      orgId: 'string',
      needLegalCode: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyStubCertificateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 出证订单号
  orderNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryStubCertificateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程id
  flowId: string;
  // 证书类型，AntchainCertification（蚂蚁链存证证明）、OrgCertification（公证处存证证明），目前支持公证处
  certificationType: string;
  // 通过twc.notary.stub.certificate.apply(数字票根全流程出证申请)获取到的订单号
  orderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      certificationType: 'certification_type',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      certificationType: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryStubCertificateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证证明下载地址，有效期1个小时
  certificateUrl?: string;
  // Legal码H5页面URL
  legalCodeUrl?: string;
  // Legal码证书H5页面URL
  legalShowUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certificateUrl: 'certificate_url',
      legalCodeUrl: 'legal_code_url',
      legalShowUrl: 'legal_show_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certificateUrl: 'string',
      legalCodeUrl: 'string',
      legalShowUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryStubRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程id，通过twc.notary.stub.create接口获取
  flowId: string;
  // 是否需要legal标，默认为false，如果需要则填true
  needLegalLogo?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      needLegalLogo: 'need_legal_logo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      needLegalLogo: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryStubResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数字票根存证全流程状态，FINISH(完结)、PROCESSING(上链中)、DISABLE(失效)、FAILED(失败)
  status?: string;
  // 阶段存证查询结果列表
  phaseQueryResultList?: PhaseQueryResult[];
  // legal标URL，只有当入参needLegalLogo为true且响应status为FINISH时才会返回
  legalLogoUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      phaseQueryResultList: 'phase_query_result_list',
      legalLogoUrl: 'legal_logo_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      phaseQueryResultList: { 'type': 'array', 'itemType': PhaseQueryResult },
      legalLogoUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateStubRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数字票根全流程存证内容
  onestepFlowNotaryInfo: OnestepFlowNotaryInfo;
  // 数字票根通用业务字段
  stubCommonInfo: StubCommonInfo;
  // 数字票根扩展字段
  stubExtraInfo?: StubExtraInfo;
  // 数字票根计量字段
  metricInfo?: MetricInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      onestepFlowNotaryInfo: 'onestep_flow_notary_info',
      stubCommonInfo: 'stub_common_info',
      stubExtraInfo: 'stub_extra_info',
      metricInfo: 'metric_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      onestepFlowNotaryInfo: OnestepFlowNotaryInfo,
      stubCommonInfo: StubCommonInfo,
      stubExtraInfo: StubExtraInfo,
      metricInfo: MetricInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateStubResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回流程ID，全局唯一
  flowId?: string;
  // 阶段存证结果列表
  phaseCreateResultList?: PhaseCreateResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      flowId: 'flow_id',
      phaseCreateResultList: 'phase_create_result_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      flowId: 'string',
      phaseCreateResultList: { 'type': 'array', 'itemType': PhaseCreateResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExistStubRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程id
  flowId: string;
  // 客户id。支付宝情况下传支付宝id，2088打头；景区情况下为自定义的客户id
  customerId: string;
  // 景区名称
  sceneName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      customerId: 'customer_id',
      sceneName: 'scene_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      customerId: 'string',
      sceneName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExistStubResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否存在数字票根。true：存在；false：不存在
  exist?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      exist: 'exist',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      exist: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateStubClearingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程id
  flowId: string;
  // 待分账金额，单位：分。如传100，即为100分，1元
  stubAmount: number;
  // 清分状态，CLEARING_SUCCESS（清分成功）；CLEARING_FAIL（清分失败）；CLEARING_NONEED（不需要进行清分）
  clearingStatus: string;
  // 数字票根计量字段，当clearing_status为CLEARING_SUCCESS时，该字段必填
  metricInfo?: MetricInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      stubAmount: 'stub_amount',
      clearingStatus: 'clearing_status',
      metricInfo: 'metric_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      stubAmount: 'number',
      clearingStatus: 'string',
      metricInfo: MetricInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateStubClearingResponse extends $tea.Model {
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

export class ApplyFlowEvidenceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程id
  flowId: string;
  // 证据包类型，默认为ChainEvidencePack(链上证据包)，按需填写，目前支持ChainEvidencePack(链上证据包)，其他包括LocalEvidencePack(链下证据包)，链下证据包前置依赖链上证据包，因此填写链下证据包会先生成链上证据包。
  // 链上证据包，即全流程所有阶段存证关系链上固化，生成全流程链上证据统一txHash；
  // 链下证据包，即全流程所有内容生成链下压缩包文件。
  evidencePackType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      evidencePackType: 'evidence_pack_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      evidencePackType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyFlowEvidenceResponse extends $tea.Model {
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

export class QueryFlowEvidenceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程id
  flowId: string;
  // 证据包类型，默认为ChainEvidencePack(链上证据包)，其他包括LocalEvidencePack(链下证据包)，链下证据包前置依赖链上证据包，因此链下证据包会返回链上证据包，但如果查询链下证据包，则只有等链下证据包完整生成才会返回，否则返回都是生成中。
  evidencePackType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      evidencePackType: 'evidence_pack_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      evidencePackType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFlowEvidenceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上证据包对应的链上交易Hash，只有resultMsg为success时才返回
  chainPackTxHash?: string;
  // 暂不支持，预留字段，链下证据包对应的可下载链接，有效期3小时，只有申请时选择了链下证据包、查询入参evidencePackType选择LocalEvidencePack及resultMsg为success时才返回
  localPackUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      chainPackTxHash: 'chain_pack_tx_hash',
      localPackUrl: 'local_pack_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      chainPackTxHash: 'string',
      localPackUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyFlowAuthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程id
  flowId: string;
  // 链上证据包对应的链上交易Hash，通过twc.notary.flow.evidence.query(全流程证据包生成进度查询)获取
  chainPackTxHash: string;
  // 授权时间长度，单位为s，默认72小时，即259200s，有效期为接口调用时间开始，接口调用时间+授权时间长度的时间为结束时间，例如当前时间为2022-08-18 00:00:00，授权时间长度为86400s(即一天)，则授权截止时间为2022-08-19 00:00:00
  authTimePeriod?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      chainPackTxHash: 'chain_pack_tx_hash',
      authTimePeriod: 'auth_time_period',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      chainPackTxHash: 'string',
      authTimePeriod: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyFlowAuthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上证据包授权码，只有resultMsg为success时才返回
  authCode?: string;
  // 链上证据包授权码过期时间
  expireTime?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      authCode: 'auth_code',
      expireTime: 'expire_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      authCode: 'string',
      expireTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailFlowInstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程id
  flowId: string;
  // 链上证据包对应的链上交易Hash，通过twc.notary.flow.evidence.query(全流程证据包生成进度查询)获取
  chainPackTxHash: string;
  // 链上证据包授权码，不传默认按照当前租户校验，填写则按照授权租户检查
  authCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      flowId: 'flow_id',
      chainPackTxHash: 'chain_pack_tx_hash',
      authCode: 'auth_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      flowId: 'string',
      chainPackTxHash: 'string',
      authCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailFlowInstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 本次存证的存证主体信息
  notaryUser?: NotaryUser;
  // 本次全流程的阶段存证详情列表
  phaseDetailList?: PhaseDetail[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      notaryUser: 'notary_user',
      phaseDetailList: 'phase_detail_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      notaryUser: NotaryUser,
      phaseDetailList: { 'type': 'array', 'itemType': PhaseDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckContractRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链路由字段，如：copyright、judicatory、contract
  chain: string;
  // 是否跨链，目前仅支持跨链：true
  crossChain: boolean;
  // 业务合约id，当crossChain为false时，该字段必填
  contractId?: string;
  // 业务合约方法名称，当crossChain为false时，该字段必填
  contractMethod?: string;
  // 业务合约方法入参，当crossChain为false时，该字段必填
  contractParam?: string;
  // 业务合约方法的返回值类型
  contractOutTypes?: string;
  // 跨链的业务合约的contractId，contractMethod，contractParam，contractOutTypes的JSON组合。当crossChain为true时，该字段必填。
  crossParam?: string;
  // 是否本地执行
  local?: boolean;
  // 链上账户名称
  contractAccount?: string;
  // 业务订单id
  bizOrderId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chain: 'chain',
      crossChain: 'cross_chain',
      contractId: 'contract_id',
      contractMethod: 'contract_method',
      contractParam: 'contract_param',
      contractOutTypes: 'contract_out_types',
      crossParam: 'cross_param',
      local: 'local',
      contractAccount: 'contract_account',
      bizOrderId: 'biz_order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chain: 'string',
      crossChain: 'boolean',
      contractId: 'string',
      contractMethod: 'string',
      contractParam: 'string',
      contractOutTypes: 'string',
      crossParam: 'string',
      local: 'boolean',
      contractAccount: 'string',
      bizOrderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckContractResponse extends $tea.Model {
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

export class QueryContractStatusRequest extends $tea.Model {
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

export class QueryContractStatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易hash
  txHash?: string;
  // 订单id
  orderId?: string;
  // 合约执行结果，Base64编码后的
  contentBase64?: string;
  // 块高
  blockNumber?: number;
  // 消耗gas量
  gasUsed?: number;
  // log信息
  logBase64?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      orderId: 'order_id',
      contentBase64: 'content_base64',
      blockNumber: 'block_number',
      gasUsed: 'gas_used',
      logBase64: 'log_base64',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      orderId: 'string',
      contentBase64: 'string',
      blockNumber: 'number',
      gasUsed: 'number',
      logBase64: 'string',
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
          sdk_version: "1.7.74",
          _prod_code: "TWC",
          _prod_channel: "undefined",
        };
        if (!Util.empty(this._securityToken)) {
          request_.query["security_token"] = this._securityToken;
        }

        request_.headers = {
          host: Util.defaultString(this._endpoint, "twc-openapi.antchain.antgroup.com"),
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
   * Description: 提供给第三方仲裁isv的仲裁申请状态变化回调接口
   * Summary: 仲裁状态信息变更回调接口
   */
  async callbackArbitrationStatus(request: CallbackArbitrationStatusRequest): Promise<CallbackArbitrationStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackArbitrationStatusEx(request, headers, runtime);
  }

  /**
   * Description: 提供给第三方仲裁isv的仲裁申请状态变化回调接口
   * Summary: 仲裁状态信息变更回调接口
   */
  async callbackArbitrationStatusEx(request: CallbackArbitrationStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackArbitrationStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackArbitrationStatusResponse>(await this.doRequest("1.0", "twc.notary.arbitration.status.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackArbitrationStatusResponse({}));
  }

  /**
   * Description: 仲裁签署状态信息变更回调接口
   * Summary: 仲裁签署状态信息变更回调接口
   */
  async callbackArbitrationSignstatus(request: CallbackArbitrationSignstatusRequest): Promise<CallbackArbitrationSignstatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackArbitrationSignstatusEx(request, headers, runtime);
  }

  /**
   * Description: 仲裁签署状态信息变更回调接口
   * Summary: 仲裁签署状态信息变更回调接口
   */
  async callbackArbitrationSignstatusEx(request: CallbackArbitrationSignstatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackArbitrationSignstatusResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackArbitrationSignstatusResponse>(await this.doRequest("1.0", "twc.notary.arbitration.signstatus.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackArbitrationSignstatusResponse({}));
  }

  /**
   * Description: 调用本接口创建个人账号，后续有关该用户的所有操作都需使用该用户的accountId。如提供用户证件信息，则将根据提供的用户证件信息申请数字证书。
   * Summary: 创建电子合同签署个人帐户
   */
  async createContractAccount(request: CreateContractAccountRequest): Promise<CreateContractAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContractAccountEx(request, headers, runtime);
  }

  /**
   * Description: 调用本接口创建个人账号，后续有关该用户的所有操作都需使用该用户的accountId。如提供用户证件信息，则将根据提供的用户证件信息申请数字证书。
   * Summary: 创建电子合同签署个人帐户
   */
  async createContractAccountEx(request: CreateContractAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContractAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContractAccountResponse>(await this.doRequest("1.0", "twc.notary.contract.account.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContractAccountResponse({}));
  }

  /**
   * Description: 通过模版参数，创建个人印章
   * Summary: 创建电子合同个人帐户印章
   */
  async createContractAccountseal(request: CreateContractAccountsealRequest): Promise<CreateContractAccountsealResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContractAccountsealEx(request, headers, runtime);
  }

  /**
   * Description: 通过模版参数，创建个人印章
   * Summary: 创建电子合同个人帐户印章
   */
  async createContractAccountsealEx(request: CreateContractAccountsealRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContractAccountsealResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContractAccountsealResponse>(await this.doRequest("1.0", "twc.notary.contract.accountseal.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContractAccountsealResponse({}));
  }

  /**
   * Description: 对接方调用本接口创建机构账号，后续有关该机构的所有操作都需使用该机构的orgId。如提供机构证件信息，则将根据提供的机构证件信息申请数字证书。
  创建机构账号前需要先创建一个个人账号并通过本接口传给服务器，该个人账号将作为该机构签署的经办人，代表企业完成实名认证和意愿认证，并完成签署操作。
   * Summary: 创建电子合同签署机构帐户
   */
  async createContractOrganization(request: CreateContractOrganizationRequest): Promise<CreateContractOrganizationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContractOrganizationEx(request, headers, runtime);
  }

  /**
   * Description: 对接方调用本接口创建机构账号，后续有关该机构的所有操作都需使用该机构的orgId。如提供机构证件信息，则将根据提供的机构证件信息申请数字证书。
  创建机构账号前需要先创建一个个人账号并通过本接口传给服务器，该个人账号将作为该机构签署的经办人，代表企业完成实名认证和意愿认证，并完成签署操作。
   * Summary: 创建电子合同签署机构帐户
   */
  async createContractOrganizationEx(request: CreateContractOrganizationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContractOrganizationResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContractOrganizationResponse>(await this.doRequest("1.0", "twc.notary.contract.organization.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContractOrganizationResponse({}));
  }

  /**
   * Description: 通过模版参数，创建机构印章
   * Summary: 创建电子合同机构帐户印章
   */
  async createContractOrgseal(request: CreateContractOrgsealRequest): Promise<CreateContractOrgsealResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContractOrgsealEx(request, headers, runtime);
  }

  /**
   * Description: 通过模版参数，创建机构印章
   * Summary: 创建电子合同机构帐户印章
   */
  async createContractOrgsealEx(request: CreateContractOrgsealRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContractOrgsealResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContractOrgsealResponse>(await this.doRequest("1.0", "twc.notary.contract.orgseal.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContractOrgsealResponse({}));
  }

  /**
   * Description: 静默签署授权
   * Summary: 静默签署授权
   */
  async authContractSign(request: AuthContractSignRequest): Promise<AuthContractSignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authContractSignEx(request, headers, runtime);
  }

  /**
   * Description: 静默签署授权
   * Summary: 静默签署授权
   */
  async authContractSignEx(request: AuthContractSignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthContractSignResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthContractSignResponse>(await this.doRequest("1.0", "twc.notary.contract.sign.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthContractSignResponse({}));
  }

  /**
   * Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
   * Summary: 通过文件上传方式创建电子合同签署模板
   */
  async createContractTemplate(request: CreateContractTemplateRequest): Promise<CreateContractTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContractTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
   * Summary: 通过文件上传方式创建电子合同签署模板
   */
  async createContractTemplateEx(request: CreateContractTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContractTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContractTemplateResponse>(await this.doRequest("1.0", "twc.notary.contract.template.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContractTemplateResponse({}));
  }

  /**
   * Description: 创建签署流程
   * Summary: 创建电子合同签署流程
   */
  async createContractFlow(request: CreateContractFlowRequest): Promise<CreateContractFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContractFlowEx(request, headers, runtime);
  }

  /**
   * Description: 创建签署流程
   * Summary: 创建电子合同签署流程
   */
  async createContractFlowEx(request: CreateContractFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContractFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContractFlowResponse>(await this.doRequest("1.0", "twc.notary.contract.flow.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContractFlowResponse({}));
  }

  /**
   * Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
   * Summary: 向电子合同签署流程中添加待签署文档
   */
  async addContractDocument(request: AddContractDocumentRequest): Promise<AddContractDocumentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addContractDocumentEx(request, headers, runtime);
  }

  /**
   * Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
   * Summary: 向电子合同签署流程中添加待签署文档
   */
  async addContractDocumentEx(request: AddContractDocumentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddContractDocumentResponse> {
    Util.validateModel(request);
    return $tea.cast<AddContractDocumentResponse>(await this.doRequest("1.0", "twc.notary.contract.document.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddContractDocumentResponse({}));
  }

  /**
   * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
   * Summary: 添加电子合同签署方自动盖章签署区
   */
  async addContractSignfield(request: AddContractSignfieldRequest): Promise<AddContractSignfieldResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addContractSignfieldEx(request, headers, runtime);
  }

  /**
   * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
   * Summary: 添加电子合同签署方自动盖章签署区
   */
  async addContractSignfieldEx(request: AddContractSignfieldRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddContractSignfieldResponse> {
    Util.validateModel(request);
    return $tea.cast<AddContractSignfieldResponse>(await this.doRequest("1.0", "twc.notary.contract.signfield.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddContractSignfieldResponse({}));
  }

  /**
   * Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
   * Summary: 电子合同签署流程开启
   */
  async startContractFlow(request: StartContractFlowRequest): Promise<StartContractFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startContractFlowEx(request, headers, runtime);
  }

  /**
   * Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
   * Summary: 电子合同签署流程开启
   */
  async startContractFlowEx(request: StartContractFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartContractFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<StartContractFlowResponse>(await this.doRequest("1.0", "twc.notary.contract.flow.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartContractFlowResponse({}));
  }

  /**
   * Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
   * Summary: 电子合同签署流程归档
   */
  async saveContractFlow(request: SaveContractFlowRequest): Promise<SaveContractFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveContractFlowEx(request, headers, runtime);
  }

  /**
   * Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
   * Summary: 电子合同签署流程归档
   */
  async saveContractFlowEx(request: SaveContractFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveContractFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveContractFlowResponse>(await this.doRequest("1.0", "twc.notary.contract.flow.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveContractFlowResponse({}));
  }

  /**
   * Description: 流程归档后，查询和下载签署后的文件
   * Summary: 电子合同流程文档下载
   */
  async downloadContractDocument(request: DownloadContractDocumentRequest): Promise<DownloadContractDocumentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.downloadContractDocumentEx(request, headers, runtime);
  }

  /**
   * Description: 流程归档后，查询和下载签署后的文件
   * Summary: 电子合同流程文档下载
   */
  async downloadContractDocumentEx(request: DownloadContractDocumentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DownloadContractDocumentResponse> {
    Util.validateModel(request);
    return $tea.cast<DownloadContractDocumentResponse>(await this.doRequest("1.0", "twc.notary.contract.document.download", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DownloadContractDocumentResponse({}));
  }

  /**
   * Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
   * Summary: 通过电子合同模板添加文档
   */
  async addContractFile(request: AddContractFileRequest): Promise<AddContractFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addContractFileEx(request, headers, runtime);
  }

  /**
   * Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
   * Summary: 通过电子合同模板添加文档
   */
  async addContractFileEx(request: AddContractFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddContractFileResponse> {
    Util.validateModel(request);
    return $tea.cast<AddContractFileResponse>(await this.doRequest("1.0", "twc.notary.contract.file.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddContractFileResponse({}));
  }

  /**
   * Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
   * Summary: 电子合同平台方注册
   */
  async createContractPlatform(request: CreateContractPlatformRequest): Promise<CreateContractPlatformResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContractPlatformEx(request, headers, runtime);
  }

  /**
   * Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
   * Summary: 电子合同平台方注册
   */
  async createContractPlatformEx(request: CreateContractPlatformRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContractPlatformResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContractPlatformResponse>(await this.doRequest("1.0", "twc.notary.contract.platform.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContractPlatformResponse({}));
  }

  /**
   * Description: 电子合同平台方提供用户信息，注册成为平台用户
   * Summary: 电子合同平台方的用户注册
   */
  async createContractUser(request: CreateContractUserRequest): Promise<CreateContractUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContractUserEx(request, headers, runtime);
  }

  /**
   * Description: 电子合同平台方提供用户信息，注册成为平台用户
   * Summary: 电子合同平台方的用户注册
   */
  async createContractUserEx(request: CreateContractUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContractUserResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContractUserResponse>(await this.doRequest("1.0", "twc.notary.contract.user.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContractUserResponse({}));
  }

  /**
   * Description: 电子合同平台方发起签署流程，用户在H5页面完成手动签署
   * Summary: 电子合同平台方发起手动签署流程
   */
  async startContractHandsign(request: StartContractHandsignRequest): Promise<StartContractHandsignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startContractHandsignEx(request, headers, runtime);
  }

  /**
   * Description: 电子合同平台方发起签署流程，用户在H5页面完成手动签署
   * Summary: 电子合同平台方发起手动签署流程
   */
  async startContractHandsignEx(request: StartContractHandsignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartContractHandsignResponse> {
    Util.validateModel(request);
    return $tea.cast<StartContractHandsignResponse>(await this.doRequest("1.0", "twc.notary.contract.handsign.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartContractHandsignResponse({}));
  }

  /**
   * Description: 查询签署流程的详细信息，包括流程配置、签署状态等
   * Summary: 签署流程查询
   */
  async queryContractFlow(request: QueryContractFlowRequest): Promise<QueryContractFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContractFlowEx(request, headers, runtime);
  }

  /**
   * Description: 查询签署流程的详细信息，包括流程配置、签署状态等
   * Summary: 签署流程查询
   */
  async queryContractFlowEx(request: QueryContractFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContractFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContractFlowResponse>(await this.doRequest("1.0", "twc.notary.contract.flow.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContractFlowResponse({}));
  }

  /**
   * Description: 创建个人/机构图片印章
   * Summary: 创建个人/机构图片印章
   */
  async createContractAccountsealimage(request: CreateContractAccountsealimageRequest): Promise<CreateContractAccountsealimageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContractAccountsealimageEx(request, headers, runtime);
  }

  /**
   * Description: 创建个人/机构图片印章
   * Summary: 创建个人/机构图片印章
   */
  async createContractAccountsealimageEx(request: CreateContractAccountsealimageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContractAccountsealimageResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContractAccountsealimageResponse>(await this.doRequest("1.0", "twc.notary.contract.accountsealimage.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContractAccountsealimageResponse({}));
  }

  /**
   * Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
   * Summary: 通过上传方式创建文件
   */
  async getContractFileuploadurl(request: GetContractFileuploadurlRequest): Promise<GetContractFileuploadurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getContractFileuploadurlEx(request, headers, runtime);
  }

  /**
   * Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
   * Summary: 通过上传方式创建文件
   */
  async getContractFileuploadurlEx(request: GetContractFileuploadurlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetContractFileuploadurlResponse> {
    Util.validateModel(request);
    return $tea.cast<GetContractFileuploadurlResponse>(await this.doRequest("1.0", "twc.notary.contract.fileuploadurl.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetContractFileuploadurlResponse({}));
  }

  /**
   * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息（平台自动签无需指定签署人信息，默认签署人是对接的企业）。
  签署区创建完成，流程开启后，系统将自动完成“对接平台自动盖章签署区”的盖章，对接平台可全程无感完成本次签署。
   * Summary: 添加平台自动盖章签署区
   */
  async addContractPlatformsignfields(request: AddContractPlatformsignfieldsRequest): Promise<AddContractPlatformsignfieldsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addContractPlatformsignfieldsEx(request, headers, runtime);
  }

  /**
   * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息（平台自动签无需指定签署人信息，默认签署人是对接的企业）。
  签署区创建完成，流程开启后，系统将自动完成“对接平台自动盖章签署区”的盖章，对接平台可全程无感完成本次签署。
   * Summary: 添加平台自动盖章签署区
   */
  async addContractPlatformsignfieldsEx(request: AddContractPlatformsignfieldsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddContractPlatformsignfieldsResponse> {
    Util.validateModel(request);
    return $tea.cast<AddContractPlatformsignfieldsResponse>(await this.doRequest("1.0", "twc.notary.contract.platformsignfields.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddContractPlatformsignfieldsResponse({}));
  }

  /**
   * Description: 查询文件详情，包括文件名称、大小、下载地址等
   * Summary: 查询文件详情
   */
  async getContractFile(request: GetContractFileRequest): Promise<GetContractFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getContractFileEx(request, headers, runtime);
  }

  /**
   * Description: 查询文件详情，包括文件名称、大小、下载地址等
   * Summary: 查询文件详情
   */
  async getContractFileEx(request: GetContractFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetContractFileResponse> {
    Util.validateModel(request);
    return $tea.cast<GetContractFileResponse>(await this.doRequest("1.0", "twc.notary.contract.file.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetContractFileResponse({}));
  }

  /**
   * Description: 查询个人所有印章
   * Summary: 查询个人印章
   */
  async queryContractAccountseals(request: QueryContractAccountsealsRequest): Promise<QueryContractAccountsealsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContractAccountsealsEx(request, headers, runtime);
  }

  /**
   * Description: 查询个人所有印章
   * Summary: 查询个人印章
   */
  async queryContractAccountsealsEx(request: QueryContractAccountsealsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContractAccountsealsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContractAccountsealsResponse>(await this.doRequest("1.0", "twc.notary.contract.accountseals.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContractAccountsealsResponse({}));
  }

  /**
   * Description: 查询机构所有印章
   * Summary: 查询机构印章
   */
  async queryContractOrganizationseals(request: QueryContractOrganizationsealsRequest): Promise<QueryContractOrganizationsealsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContractOrganizationsealsEx(request, headers, runtime);
  }

  /**
   * Description: 查询机构所有印章
   * Summary: 查询机构印章
   */
  async queryContractOrganizationsealsEx(request: QueryContractOrganizationsealsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContractOrganizationsealsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContractOrganizationsealsResponse>(await this.doRequest("1.0", "twc.notary.contract.organizationseals.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContractOrganizationsealsResponse({}));
  }

  /**
   * Description: 查询流程所有签署人列表。
   * Summary: 查询流程签署人列表
   */
  async queryContractFlowsigner(request: QueryContractFlowsignerRequest): Promise<QueryContractFlowsignerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContractFlowsignerEx(request, headers, runtime);
  }

  /**
   * Description: 查询流程所有签署人列表。
   * Summary: 查询流程签署人列表
   */
  async queryContractFlowsignerEx(request: QueryContractFlowsignerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContractFlowsignerResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContractFlowsignerResponse>(await this.doRequest("1.0", "twc.notary.contract.flowsigner.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContractFlowsignerResponse({}));
  }

  /**
   * Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
   * Summary: 查询签署区列表
   */
  async queryContractSignfields(request: QueryContractSignfieldsRequest): Promise<QueryContractSignfieldsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContractSignfieldsEx(request, headers, runtime);
  }

  /**
   * Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
   * Summary: 查询签署区列表
   */
  async queryContractSignfieldsEx(request: QueryContractSignfieldsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContractSignfieldsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContractSignfieldsResponse>(await this.doRequest("1.0", "twc.notary.contract.signfields.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContractSignfieldsResponse({}));
  }

  /**
   * Description: 使用创建账号返回的账号id查询用户的账号。
   * Summary: 查询个人账号
   */
  async queryContractAccount(request: QueryContractAccountRequest): Promise<QueryContractAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContractAccountEx(request, headers, runtime);
  }

  /**
   * Description: 使用创建账号返回的账号id查询用户的账号。
   * Summary: 查询个人账号
   */
  async queryContractAccountEx(request: QueryContractAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContractAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContractAccountResponse>(await this.doRequest("1.0", "twc.notary.contract.account.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContractAccountResponse({}));
  }

  /**
   * Description: 使用创建账号返回的账号id查询机构账号。
   * Summary: 查询机构账号
   */
  async queryContractOrganization(request: QueryContractOrganizationRequest): Promise<QueryContractOrganizationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContractOrganizationEx(request, headers, runtime);
  }

  /**
   * Description: 使用创建账号返回的账号id查询机构账号。
   * Summary: 查询机构账号
   */
  async queryContractOrganizationEx(request: QueryContractOrganizationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContractOrganizationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContractOrganizationResponse>(await this.doRequest("1.0", "twc.notary.contract.organization.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContractOrganizationResponse({}));
  }

  /**
   * Description: 查询模板详情，包括文件模板基本信息和输入项组件信息
   * Summary: 查询模板详情详情
   */
  async queryContractTemplate(request: QueryContractTemplateRequest): Promise<QueryContractTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContractTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 查询模板详情，包括文件模板基本信息和输入项组件信息
   * Summary: 查询模板详情详情
   */
  async queryContractTemplateEx(request: QueryContractTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContractTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContractTemplateResponse>(await this.doRequest("1.0", "twc.notary.contract.template.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContractTemplateResponse({}));
  }

  /**
   * Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
   * Summary: 创建签署流程
   */
  async createContractSignflow(request: CreateContractSignflowRequest): Promise<CreateContractSignflowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContractSignflowEx(request, headers, runtime);
  }

  /**
   * Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
   * Summary: 创建签署流程
   */
  async createContractSignflowEx(request: CreateContractSignflowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContractSignflowResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContractSignflowResponse>(await this.doRequest("1.0", "twc.notary.contract.signflow.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContractSignflowResponse({}));
  }

  /**
   * Description: 商户签署直付通协议
   * Summary: 商户签署直付通协议
   */
  async createContractRegisterzft(request: CreateContractRegisterzftRequest): Promise<CreateContractRegisterzftResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContractRegisterzftEx(request, headers, runtime);
  }

  /**
   * Description: 商户签署直付通协议
   * Summary: 商户签署直付通协议
   */
  async createContractRegisterzftEx(request: CreateContractRegisterzftRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContractRegisterzftResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContractRegisterzftResponse>(await this.doRequest("1.0", "twc.notary.contract.registerzft.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContractRegisterzftResponse({}));
  }

  /**
   * Description: 创建模板的同时，指定平台方签署信息，完成智能合同模板创建
   * Summary: 创建智能合同模板
   */
  async createContractPlatformtemplate(request: CreateContractPlatformtemplateRequest): Promise<CreateContractPlatformtemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContractPlatformtemplateEx(request, headers, runtime);
  }

  /**
   * Description: 创建模板的同时，指定平台方签署信息，完成智能合同模板创建
   * Summary: 创建智能合同模板
   */
  async createContractPlatformtemplateEx(request: CreateContractPlatformtemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContractPlatformtemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContractPlatformtemplateResponse>(await this.doRequest("1.0", "twc.notary.contract.platformtemplate.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContractPlatformtemplateResponse({}));
  }

  /**
   * Description: 查询商户直付通入驻信息
   * Summary: 查询商户直付通入驻信息
   */
  async queryContractMerchantzft(request: QueryContractMerchantzftRequest): Promise<QueryContractMerchantzftResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContractMerchantzftEx(request, headers, runtime);
  }

  /**
   * Description: 查询商户直付通入驻信息
   * Summary: 查询商户直付通入驻信息
   */
  async queryContractMerchantzftEx(request: QueryContractMerchantzftRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContractMerchantzftResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContractMerchantzftResponse>(await this.doRequest("1.0", "twc.notary.contract.merchantzft.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContractMerchantzftResponse({}));
  }

  /**
   * Description: 列举本租户合同相关交易
   * Summary: 列举本租户合同相关交易
   */
  async listContractOuttradeid(request: ListContractOuttradeidRequest): Promise<ListContractOuttradeidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listContractOuttradeidEx(request, headers, runtime);
  }

  /**
   * Description: 列举本租户合同相关交易
   * Summary: 列举本租户合同相关交易
   */
  async listContractOuttradeidEx(request: ListContractOuttradeidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListContractOuttradeidResponse> {
    Util.validateModel(request);
    return $tea.cast<ListContractOuttradeidResponse>(await this.doRequest("1.0", "twc.notary.contract.outtradeid.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListContractOuttradeidResponse({}));
  }

  /**
   * Description: 根据订单id查询订单代扣详情
   * Summary: 根据订单id查询订单代扣详情
   */
  async queryContractTradedetail(request: QueryContractTradedetailRequest): Promise<QueryContractTradedetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContractTradedetailEx(request, headers, runtime);
  }

  /**
   * Description: 根据订单id查询订单代扣详情
   * Summary: 根据订单id查询订单代扣详情
   */
  async queryContractTradedetailEx(request: QueryContractTradedetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContractTradedetailResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContractTradedetailResponse>(await this.doRequest("1.0", "twc.notary.contract.tradedetail.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContractTradedetailResponse({}));
  }

  /**
   * Description: 商户根据订单id退款
   * Summary: 商户根据订单id退款
   */
  async createContractMerchantrefund(request: CreateContractMerchantrefundRequest): Promise<CreateContractMerchantrefundResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContractMerchantrefundEx(request, headers, runtime);
  }

  /**
   * Description: 商户根据订单id退款
   * Summary: 商户根据订单id退款
   */
  async createContractMerchantrefundEx(request: CreateContractMerchantrefundRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContractMerchantrefundResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContractMerchantrefundResponse>(await this.doRequest("1.0", "twc.notary.contract.merchantrefund.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContractMerchantrefundResponse({}));
  }

  /**
   * Description: 创建蚂蚁区块链账户
   * Summary: 创建蚂蚁区块链账户
   */
  async createContractAdminaccount(request: CreateContractAdminaccountRequest): Promise<CreateContractAdminaccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContractAdminaccountEx(request, headers, runtime);
  }

  /**
   * Description: 创建蚂蚁区块链账户
   * Summary: 创建蚂蚁区块链账户
   */
  async createContractAdminaccountEx(request: CreateContractAdminaccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContractAdminaccountResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContractAdminaccountResponse>(await this.doRequest("1.0", "twc.notary.contract.adminaccount.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContractAdminaccountResponse({}));
  }

  /**
   * Description: 商户根据合同id列举所有的tradeId
   * Summary: 商户根据合同id列举所有的tradeId
   */
  async listContractTradeids(request: ListContractTradeidsRequest): Promise<ListContractTradeidsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listContractTradeidsEx(request, headers, runtime);
  }

  /**
   * Description: 商户根据合同id列举所有的tradeId
   * Summary: 商户根据合同id列举所有的tradeId
   */
  async listContractTradeidsEx(request: ListContractTradeidsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListContractTradeidsResponse> {
    Util.validateModel(request);
    return $tea.cast<ListContractTradeidsResponse>(await this.doRequest("1.0", "twc.notary.contract.tradeids.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListContractTradeidsResponse({}));
  }

  /**
   * Description: 商户上传代扣规则
   * Summary: 商户上传代扣规则
   */
  async createContractCommontrigger(request: CreateContractCommontriggerRequest): Promise<CreateContractCommontriggerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContractCommontriggerEx(request, headers, runtime);
  }

  /**
   * Description: 商户上传代扣规则
   * Summary: 商户上传代扣规则
   */
  async createContractCommontriggerEx(request: CreateContractCommontriggerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContractCommontriggerResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContractCommontriggerResponse>(await this.doRequest("1.0", "twc.notary.contract.commontrigger.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContractCommontriggerResponse({}));
  }

  /**
   * Description: 商户入驻直付通
   * Summary: 商户入驻直付通
   */
  async createContractMerchantindirectzft(request: CreateContractMerchantindirectzftRequest): Promise<CreateContractMerchantindirectzftResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContractMerchantindirectzftEx(request, headers, runtime);
  }

  /**
   * Description: 商户入驻直付通
   * Summary: 商户入驻直付通
   */
  async createContractMerchantindirectzftEx(request: CreateContractMerchantindirectzftRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContractMerchantindirectzftResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContractMerchantindirectzftResponse>(await this.doRequest("1.0", "twc.notary.contract.merchantindirectzft.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContractMerchantindirectzftResponse({}));
  }

  /**
   * Description: 根据订单id查询直付通商户入驻信息
   * Summary: 根据订单id查询直付通商户入驻信息
   */
  async queryContractMerchantindirectzft(request: QueryContractMerchantindirectzftRequest): Promise<QueryContractMerchantindirectzftResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContractMerchantindirectzftEx(request, headers, runtime);
  }

  /**
   * Description: 根据订单id查询直付通商户入驻信息
   * Summary: 根据订单id查询直付通商户入驻信息
   */
  async queryContractMerchantindirectzftEx(request: QueryContractMerchantindirectzftRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContractMerchantindirectzftResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContractMerchantindirectzftResponse>(await this.doRequest("1.0", "twc.notary.contract.merchantindirectzft.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContractMerchantindirectzftResponse({}));
  }

  /**
   * Description: 获取支付对账文件的url
   * Summary: 获取支付对账文件的url
   */
  async queryPayresultfileurl(request: QueryPayresultfileurlRequest): Promise<QueryPayresultfileurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPayresultfileurlEx(request, headers, runtime);
  }

  /**
   * Description: 获取支付对账文件的url
   * Summary: 获取支付对账文件的url
   */
  async queryPayresultfileurlEx(request: QueryPayresultfileurlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPayresultfileurlResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPayresultfileurlResponse>(await this.doRequest("1.0", "twc.notary.payresultfileurl.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPayresultfileurlResponse({}));
  }

  /**
   * Description: 智能合同图片上传
   * Summary: 智能合同图片上传
   */
  async createContractMerchantimage(request: CreateContractMerchantimageRequest): Promise<CreateContractMerchantimageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContractMerchantimageEx(request, headers, runtime);
  }

  /**
   * Description: 智能合同图片上传
   * Summary: 智能合同图片上传
   */
  async createContractMerchantimageEx(request: CreateContractMerchantimageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContractMerchantimageResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContractMerchantimageResponse>(await this.doRequest("1.0", "twc.notary.contract.merchantimage.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContractMerchantimageResponse({}));
  }

  /**
   * Description: 取消智能合同剩余代扣条目
   * Summary: 取消智能合同剩余代扣条目
   */
  async cancelContractPaytrade(request: CancelContractPaytradeRequest): Promise<CancelContractPaytradeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelContractPaytradeEx(request, headers, runtime);
  }

  /**
   * Description: 取消智能合同剩余代扣条目
   * Summary: 取消智能合同剩余代扣条目
   */
  async cancelContractPaytradeEx(request: CancelContractPaytradeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelContractPaytradeResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelContractPaytradeResponse>(await this.doRequest("1.0", "twc.notary.contract.paytrade.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelContractPaytradeResponse({}));
  }

  /**
   * Description: 创建手动签署流程
   * Summary: 创建手动签署流程
   */
  async createContractHandsignflow(request: CreateContractHandsignflowRequest): Promise<CreateContractHandsignflowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContractHandsignflowEx(request, headers, runtime);
  }

  /**
   * Description: 创建手动签署流程
   * Summary: 创建手动签署流程
   */
  async createContractHandsignflowEx(request: CreateContractHandsignflowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContractHandsignflowResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContractHandsignflowResponse>(await this.doRequest("1.0", "twc.notary.contract.handsignflow.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContractHandsignflowResponse({}));
  }

  /**
   * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
   * Summary: 添加电子合同签署方手动盖章签署区
   */
  async createContractHandsignfield(request: CreateContractHandsignfieldRequest): Promise<CreateContractHandsignfieldResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContractHandsignfieldEx(request, headers, runtime);
  }

  /**
   * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
   * Summary: 添加电子合同签署方手动盖章签署区
   */
  async createContractHandsignfieldEx(request: CreateContractHandsignfieldRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContractHandsignfieldResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContractHandsignfieldResponse>(await this.doRequest("1.0", "twc.notary.contract.handsignfield.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContractHandsignfieldResponse({}));
  }

  /**
   * Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
   * Summary: 获取签署地址
   */
  async getContractSignurl(request: GetContractSignurlRequest): Promise<GetContractSignurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getContractSignurlEx(request, headers, runtime);
  }

  /**
   * Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
   * Summary: 获取签署地址
   */
  async getContractSignurlEx(request: GetContractSignurlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetContractSignurlResponse> {
    Util.validateModel(request);
    return $tea.cast<GetContractSignurlResponse>(await this.doRequest("1.0", "twc.notary.contract.signurl.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetContractSignurlResponse({}));
  }

  /**
   * Description: 可信付代扣规则内容创建
   * Summary: 可信付代扣规则内容创建
   */
  async createWithholdAgreement(request: CreateWithholdAgreementRequest): Promise<CreateWithholdAgreementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createWithholdAgreementEx(request, headers, runtime);
  }

  /**
   * Description: 可信付代扣规则内容创建
   * Summary: 可信付代扣规则内容创建
   */
  async createWithholdAgreementEx(request: CreateWithholdAgreementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateWithholdAgreementResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateWithholdAgreementResponse>(await this.doRequest("1.0", "twc.notary.withhold.agreement.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateWithholdAgreementResponse({}));
  }

  /**
   * Description: 查询消金代扣协议
   * Summary: 查询可信付代扣协议内容
   */
  async queryWithholdAgreement(request: QueryWithholdAgreementRequest): Promise<QueryWithholdAgreementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryWithholdAgreementEx(request, headers, runtime);
  }

  /**
   * Description: 查询消金代扣协议
   * Summary: 查询可信付代扣协议内容
   */
  async queryWithholdAgreementEx(request: QueryWithholdAgreementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryWithholdAgreementResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryWithholdAgreementResponse>(await this.doRequest("1.0", "twc.notary.withhold.agreement.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryWithholdAgreementResponse({}));
  }

  /**
   * Description: 查询可信付协议的入口
   * Summary: 查询可信付协议的入口
   */
  async queryWithholdAgreementurl(request: QueryWithholdAgreementurlRequest): Promise<QueryWithholdAgreementurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryWithholdAgreementurlEx(request, headers, runtime);
  }

  /**
   * Description: 查询可信付协议的入口
   * Summary: 查询可信付协议的入口
   */
  async queryWithholdAgreementurlEx(request: QueryWithholdAgreementurlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryWithholdAgreementurlResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryWithholdAgreementurlResponse>(await this.doRequest("1.0", "twc.notary.withhold.agreementurl.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryWithholdAgreementurlResponse({}));
  }

  /**
   * Description: 后台录入商家的产品的逾期日
   * Summary: 后台录入商家的产品的逾期日
   */
  async createWithholdOverduetime(request: CreateWithholdOverduetimeRequest): Promise<CreateWithholdOverduetimeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createWithholdOverduetimeEx(request, headers, runtime);
  }

  /**
   * Description: 后台录入商家的产品的逾期日
   * Summary: 后台录入商家的产品的逾期日
   */
  async createWithholdOverduetimeEx(request: CreateWithholdOverduetimeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateWithholdOverduetimeResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateWithholdOverduetimeResponse>(await this.doRequest("1.0", "twc.notary.withhold.overduetime.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateWithholdOverduetimeResponse({}));
  }

  /**
   * Description: 可信付代扣的扣费请求
   * Summary: 发送代扣请求
   */
  async sendWithholdDeduct(request: SendWithholdDeductRequest): Promise<SendWithholdDeductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendWithholdDeductEx(request, headers, runtime);
  }

  /**
   * Description: 可信付代扣的扣费请求
   * Summary: 发送代扣请求
   */
  async sendWithholdDeductEx(request: SendWithholdDeductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendWithholdDeductResponse> {
    Util.validateModel(request);
    return $tea.cast<SendWithholdDeductResponse>(await this.doRequest("1.0", "twc.notary.withhold.deduct.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendWithholdDeductResponse({}));
  }

  /**
   * Description: 可信付代扣结果查询
   * Summary: 可信付代扣结果查询
   */
  async queryWithholdPayresult(request: QueryWithholdPayresultRequest): Promise<QueryWithholdPayresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryWithholdPayresultEx(request, headers, runtime);
  }

  /**
   * Description: 可信付代扣结果查询
   * Summary: 可信付代扣结果查询
   */
  async queryWithholdPayresultEx(request: QueryWithholdPayresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryWithholdPayresultResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryWithholdPayresultResponse>(await this.doRequest("1.0", "twc.notary.withhold.payresult.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryWithholdPayresultResponse({}));
  }

  /**
   * Description: 可信付退款请求
   * Summary: 可信付退款请求
   */
  async sendWithholdRefund(request: SendWithholdRefundRequest): Promise<SendWithholdRefundResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendWithholdRefundEx(request, headers, runtime);
  }

  /**
   * Description: 可信付退款请求
   * Summary: 可信付退款请求
   */
  async sendWithholdRefundEx(request: SendWithholdRefundRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendWithholdRefundResponse> {
    Util.validateModel(request);
    return $tea.cast<SendWithholdRefundResponse>(await this.doRequest("1.0", "twc.notary.withhold.refund.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendWithholdRefundResponse({}));
  }

  /**
   * Description: 创建邀请任务，被邀请人收到通知后需要注册并完成实名认证方可开通电子签名服务。
   * Summary: 创建注册邀请任务
   */
  async sendContractInvitation(request: SendContractInvitationRequest): Promise<SendContractInvitationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendContractInvitationEx(request, headers, runtime);
  }

  /**
   * Description: 创建邀请任务，被邀请人收到通知后需要注册并完成实名认证方可开通电子签名服务。
   * Summary: 创建注册邀请任务
   */
  async sendContractInvitationEx(request: SendContractInvitationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendContractInvitationResponse> {
    Util.validateModel(request);
    return $tea.cast<SendContractInvitationResponse>(await this.doRequest("1.0", "twc.notary.contract.invitation.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendContractInvitationResponse({}));
  }

  /**
   * Description: 查询代扣规则
   * Summary: 查询代扣规则
   */
  async listContractPayrule(request: ListContractPayruleRequest): Promise<ListContractPayruleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listContractPayruleEx(request, headers, runtime);
  }

  /**
   * Description: 查询代扣规则
   * Summary: 查询代扣规则
   */
  async listContractPayruleEx(request: ListContractPayruleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListContractPayruleResponse> {
    Util.validateModel(request);
    return $tea.cast<ListContractPayruleResponse>(await this.doRequest("1.0", "twc.notary.contract.payrule.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListContractPayruleResponse({}));
  }

  /**
   * Description: 获取可信付免签协议的二维码
   * Summary: 获取可信付免签协议的二维码
   */
  async createWithholdQrcode(request: CreateWithholdQrcodeRequest): Promise<CreateWithholdQrcodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createWithholdQrcodeEx(request, headers, runtime);
  }

  /**
   * Description: 获取可信付免签协议的二维码
   * Summary: 获取可信付免签协议的二维码
   */
  async createWithholdQrcodeEx(request: CreateWithholdQrcodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateWithholdQrcodeResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateWithholdQrcodeResponse>(await this.doRequest("1.0", "twc.notary.withhold.qrcode.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateWithholdQrcodeResponse({}));
  }

  /**
   * Description: 取消某一期的代扣规则
   * Summary: 取消某一期的代扣规则
   */
  async cancelContractPaysingletrade(request: CancelContractPaysingletradeRequest): Promise<CancelContractPaysingletradeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelContractPaysingletradeEx(request, headers, runtime);
  }

  /**
   * Description: 取消某一期的代扣规则
   * Summary: 取消某一期的代扣规则
   */
  async cancelContractPaysingletradeEx(request: CancelContractPaysingletradeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelContractPaysingletradeResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelContractPaysingletradeResponse>(await this.doRequest("1.0", "twc.notary.contract.paysingletrade.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelContractPaysingletradeResponse({}));
  }

  /**
   * Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
   * Summary: 申请区块链合同回调加签key
   */
  async applyContractCallbackkey(request: ApplyContractCallbackkeyRequest): Promise<ApplyContractCallbackkeyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyContractCallbackkeyEx(request, headers, runtime);
  }

  /**
   * Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
   * Summary: 申请区块链合同回调加签key
   */
  async applyContractCallbackkeyEx(request: ApplyContractCallbackkeyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyContractCallbackkeyResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyContractCallbackkeyResponse>(await this.doRequest("1.0", "twc.notary.contract.callbackkey.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyContractCallbackkeyResponse({}));
  }

  /**
   * Description: 快速创建签署流程，完成添加待签文档、流程基本信息、签署方，支持自动开启、自动归档。
   * Summary: 一步创建签署流程接口
   */
  async createContractOnestepflow(request: CreateContractOnestepflowRequest): Promise<CreateContractOnestepflowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContractOnestepflowEx(request, headers, runtime);
  }

  /**
   * Description: 快速创建签署流程，完成添加待签文档、流程基本信息、签署方，支持自动开启、自动归档。
   * Summary: 一步创建签署流程接口
   */
  async createContractOnestepflowEx(request: CreateContractOnestepflowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContractOnestepflowResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContractOnestepflowResponse>(await this.doRequest("1.0", "twc.notary.contract.onestepflow.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContractOnestepflowResponse({}));
  }

  /**
   * Description: 通过流程ID查询合同存证信息
   * Summary: 查询合同存证信息
   */
  async queryContractNotary(request: QueryContractNotaryRequest): Promise<QueryContractNotaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContractNotaryEx(request, headers, runtime);
  }

  /**
   * Description: 通过流程ID查询合同存证信息
   * Summary: 查询合同存证信息
   */
  async queryContractNotaryEx(request: QueryContractNotaryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContractNotaryResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContractNotaryResponse>(await this.doRequest("1.0", "twc.notary.contract.notary.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContractNotaryResponse({}));
  }

  /**
   * Description: 获取合同存证事务ID
   * Summary: 获取合同存证事务ID
   */
  async createEcocontractTrans(request: CreateEcocontractTransRequest): Promise<CreateEcocontractTransResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createEcocontractTransEx(request, headers, runtime);
  }

  /**
   * Description: 获取合同存证事务ID
   * Summary: 获取合同存证事务ID
   */
  async createEcocontractTransEx(request: CreateEcocontractTransRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateEcocontractTransResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateEcocontractTransResponse>(await this.doRequest("1.0", "twc.notary.ecocontract.trans.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateEcocontractTransResponse({}));
  }

  /**
   * Description: 合同文本存证
   * Summary: 合同文本存证
   */
  async createEcocontractText(request: CreateEcocontractTextRequest): Promise<CreateEcocontractTextResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createEcocontractTextEx(request, headers, runtime);
  }

  /**
   * Description: 合同文本存证
   * Summary: 合同文本存证
   */
  async createEcocontractTextEx(request: CreateEcocontractTextRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateEcocontractTextResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateEcocontractTextResponse>(await this.doRequest("1.0", "twc.notary.ecocontract.text.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateEcocontractTextResponse({}));
  }

  /**
   * Description: 搜索关键字坐标，以关键字左下角为原点去查询坐标
   * Summary: 搜索关键字坐标
   */
  async queryContractWordsposition(request: QueryContractWordspositionRequest): Promise<QueryContractWordspositionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContractWordspositionEx(request, headers, runtime);
  }

  /**
   * Description: 搜索关键字坐标，以关键字左下角为原点去查询坐标
   * Summary: 搜索关键字坐标
   */
  async queryContractWordspositionEx(request: QueryContractWordspositionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContractWordspositionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContractWordspositionResponse>(await this.doRequest("1.0", "twc.notary.contract.wordsposition.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContractWordspositionResponse({}));
  }

  /**
   * Description: 执行签署人删除逻辑
   * Summary: 删除签署人
   */
  async deleteContractSigner(request: DeleteContractSignerRequest): Promise<DeleteContractSignerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteContractSignerEx(request, headers, runtime);
  }

  /**
   * Description: 执行签署人删除逻辑
   * Summary: 删除签署人
   */
  async deleteContractSignerEx(request: DeleteContractSignerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteContractSignerResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteContractSignerResponse>(await this.doRequest("1.0", "twc.notary.contract.signer.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteContractSignerResponse({}));
  }

  /**
   * Description: 获取区块链合同存证证明
   * Summary: 获取区块链合同存证证明
   */
  async getContractCertificate(request: GetContractCertificateRequest): Promise<GetContractCertificateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getContractCertificateEx(request, headers, runtime);
  }

  /**
   * Description: 获取区块链合同存证证明
   * Summary: 获取区块链合同存证证明
   */
  async getContractCertificateEx(request: GetContractCertificateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetContractCertificateResponse> {
    Util.validateModel(request);
    return $tea.cast<GetContractCertificateResponse>(await this.doRequest("1.0", "twc.notary.contract.certificate.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetContractCertificateResponse({}));
  }

  /**
   * Description: 已归档的合同，支持根据合同流程签署区查询已使用的印章id
   * Summary: 根据合同流程签署区查询已使用的印章id
   */
  async queryContractSignfieldsealid(request: QueryContractSignfieldsealidRequest): Promise<QueryContractSignfieldsealidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContractSignfieldsealidEx(request, headers, runtime);
  }

  /**
   * Description: 已归档的合同，支持根据合同流程签署区查询已使用的印章id
   * Summary: 根据合同流程签署区查询已使用的印章id
   */
  async queryContractSignfieldsealidEx(request: QueryContractSignfieldsealidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContractSignfieldsealidResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContractSignfieldsealidResponse>(await this.doRequest("1.0", "twc.notary.contract.signfieldsealid.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContractSignfieldsealidResponse({}));
  }

  /**
   * Description: 本接口功能默认不开启，如有需求请联系技术支持。添加手动签署区，并启动签署流程之后，触发通知，提醒签署方执行签署。通知方式以创建流程时的配置为准（目前仅支持短信）。
   * Summary: 通知签署方执行合同签署
   */
  async notifyContractSigner(request: NotifyContractSignerRequest): Promise<NotifyContractSignerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.notifyContractSignerEx(request, headers, runtime);
  }

  /**
   * Description: 本接口功能默认不开启，如有需求请联系技术支持。添加手动签署区，并启动签署流程之后，触发通知，提醒签署方执行签署。通知方式以创建流程时的配置为准（目前仅支持短信）。
   * Summary: 通知签署方执行合同签署
   */
  async notifyContractSignerEx(request: NotifyContractSignerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<NotifyContractSignerResponse> {
    Util.validateModel(request);
    return $tea.cast<NotifyContractSignerResponse>(await this.doRequest("1.0", "twc.notary.contract.signer.notify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new NotifyContractSignerResponse({}));
  }

  /**
   * Description: 通过配置白名单，临时允许修改证件号/名称等所有字段以及经办人的信息，修改后从白名单中去除
   * Summary: 修改平台方注册信息
   */
  async updateContractPlatform(request: UpdateContractPlatformRequest): Promise<UpdateContractPlatformResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateContractPlatformEx(request, headers, runtime);
  }

  /**
   * Description: 通过配置白名单，临时允许修改证件号/名称等所有字段以及经办人的信息，修改后从白名单中去除
   * Summary: 修改平台方注册信息
   */
  async updateContractPlatformEx(request: UpdateContractPlatformRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateContractPlatformResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateContractPlatformResponse>(await this.doRequest("1.0", "twc.notary.contract.platform.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateContractPlatformResponse({}));
  }

  /**
   * Description: 个人的注册信息中证件信息为空时允许修改姓名、证件等各项信息，如果不为空，则不允许修改
   * Summary: 修改用户注册信息
   */
  async updateContractUser(request: UpdateContractUserRequest): Promise<UpdateContractUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateContractUserEx(request, headers, runtime);
  }

  /**
   * Description: 个人的注册信息中证件信息为空时允许修改姓名、证件等各项信息，如果不为空，则不允许修改
   * Summary: 修改用户注册信息
   */
  async updateContractUserEx(request: UpdateContractUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateContractUserResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateContractUserResponse>(await this.doRequest("1.0", "twc.notary.contract.user.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateContractUserResponse({}));
  }

  /**
   * Description: 机构的注册信息中证件信息为空时允许修改机构名、证件等各项信息，但不允许修改经办人信息，如果不为空，则无法修改  
   * Summary: 修改机构用户注册信息
   */
  async updateContractOrganization(request: UpdateContractOrganizationRequest): Promise<UpdateContractOrganizationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateContractOrganizationEx(request, headers, runtime);
  }

  /**
   * Description: 机构的注册信息中证件信息为空时允许修改机构名、证件等各项信息，但不允许修改经办人信息，如果不为空，则无法修改  
   * Summary: 修改机构用户注册信息
   */
  async updateContractOrganizationEx(request: UpdateContractOrganizationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateContractOrganizationResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateContractOrganizationResponse>(await this.doRequest("1.0", "twc.notary.contract.organization.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateContractOrganizationResponse({}));
  }

  /**
   * Description: 商户入驻直付通新接口，通过此接口创建的商户，签约模式默认走单独签约授权模式（即不同商户都需要进行单独的代扣签约授权）。
   * Summary: 商户入驻直付通新接口
   */
  async applyContractMerchant(request: ApplyContractMerchantRequest): Promise<ApplyContractMerchantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyContractMerchantEx(request, headers, runtime);
  }

  /**
   * Description: 商户入驻直付通新接口，通过此接口创建的商户，签约模式默认走单独签约授权模式（即不同商户都需要进行单独的代扣签约授权）。
   * Summary: 商户入驻直付通新接口
   */
  async applyContractMerchantEx(request: ApplyContractMerchantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyContractMerchantResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyContractMerchantResponse>(await this.doRequest("1.0", "twc.notary.contract.merchant.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyContractMerchantResponse({}));
  }

  /**
   * Description: 直付通商户入驻确认（确认成功则表明入驻成功）
   * Summary: 直付通商户入驻确认
   */
  async confirmContractMerchant(request: ConfirmContractMerchantRequest): Promise<ConfirmContractMerchantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmContractMerchantEx(request, headers, runtime);
  }

  /**
   * Description: 直付通商户入驻确认（确认成功则表明入驻成功）
   * Summary: 直付通商户入驻确认
   */
  async confirmContractMerchantEx(request: ConfirmContractMerchantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmContractMerchantResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmContractMerchantResponse>(await this.doRequest("1.0", "twc.notary.contract.merchant.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmContractMerchantResponse({}));
  }

  /**
   * Description: 创建合同存证事务ID。私有云使用。
   * Summary: 创建合同存证事务ID。私有云使用。
   */
  async createPrivatecontractTrans(request: CreatePrivatecontractTransRequest): Promise<CreatePrivatecontractTransResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createPrivatecontractTransEx(request, headers, runtime);
  }

  /**
   * Description: 创建合同存证事务ID。私有云使用。
   * Summary: 创建合同存证事务ID。私有云使用。
   */
  async createPrivatecontractTransEx(request: CreatePrivatecontractTransRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreatePrivatecontractTransResponse> {
    Util.validateModel(request);
    return $tea.cast<CreatePrivatecontractTransResponse>(await this.doRequest("1.0", "twc.notary.privatecontract.trans.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreatePrivatecontractTransResponse({}));
  }

  /**
   * Description: 合同文本存证。私有云使用。
   * Summary: 合同文本存证。私有云使用。
   */
  async createPrivatecontractText(request: CreatePrivatecontractTextRequest): Promise<CreatePrivatecontractTextResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createPrivatecontractTextEx(request, headers, runtime);
  }

  /**
   * Description: 合同文本存证。私有云使用。
   * Summary: 合同文本存证。私有云使用。
   */
  async createPrivatecontractTextEx(request: CreatePrivatecontractTextRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreatePrivatecontractTextResponse> {
    Util.validateModel(request);
    return $tea.cast<CreatePrivatecontractTextResponse>(await this.doRequest("1.0", "twc.notary.privatecontract.text.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreatePrivatecontractTextResponse({}));
  }

  /**
   * Description: 个人二要素校验
   * Summary: 个人二要素校验
   */
  async verifyPrivatepersonTwometa(request: VerifyPrivatepersonTwometaRequest): Promise<VerifyPrivatepersonTwometaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyPrivatepersonTwometaEx(request, headers, runtime);
  }

  /**
   * Description: 个人二要素校验
   * Summary: 个人二要素校验
   */
  async verifyPrivatepersonTwometaEx(request: VerifyPrivatepersonTwometaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyPrivatepersonTwometaResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyPrivatepersonTwometaResponse>(await this.doRequest("1.0", "twc.notary.privateperson.twometa.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyPrivatepersonTwometaResponse({}));
  }

  /**
   * Description: 企业二要素校验
   * Summary: 企业二要素校验
   */
  async verifyPrivatecompanyTwometa(request: VerifyPrivatecompanyTwometaRequest): Promise<VerifyPrivatecompanyTwometaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyPrivatecompanyTwometaEx(request, headers, runtime);
  }

  /**
   * Description: 企业二要素校验
   * Summary: 企业二要素校验
   */
  async verifyPrivatecompanyTwometaEx(request: VerifyPrivatecompanyTwometaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyPrivatecompanyTwometaResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyPrivatecompanyTwometaResponse>(await this.doRequest("1.0", "twc.notary.privatecompany.twometa.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyPrivatecompanyTwometaResponse({}));
  }

  /**
   * Description: 企业四要素校验
   * Summary: 企业四要素校验
   */
  async verifyPrivatecompanyFourmeta(request: VerifyPrivatecompanyFourmetaRequest): Promise<VerifyPrivatecompanyFourmetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyPrivatecompanyFourmetaEx(request, headers, runtime);
  }

  /**
   * Description: 企业四要素校验
   * Summary: 企业四要素校验
   */
  async verifyPrivatecompanyFourmetaEx(request: VerifyPrivatecompanyFourmetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyPrivatecompanyFourmetaResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyPrivatecompanyFourmetaResponse>(await this.doRequest("1.0", "twc.notary.privatecompany.fourmeta.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyPrivatecompanyFourmetaResponse({}));
  }

  /**
   * Description: 开放给私有云的外部用户的注册接口.
   * Summary: 私有云的外部用户注册接口.
   */
  async applyPrivatecontractCert(request: ApplyPrivatecontractCertRequest): Promise<ApplyPrivatecontractCertResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyPrivatecontractCertEx(request, headers, runtime);
  }

  /**
   * Description: 开放给私有云的外部用户的注册接口.
   * Summary: 私有云的外部用户注册接口.
   */
  async applyPrivatecontractCertEx(request: ApplyPrivatecontractCertRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyPrivatecontractCertResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyPrivatecontractCertResponse>(await this.doRequest("1.0", "twc.notary.privatecontract.cert.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyPrivatecontractCertResponse({}));
  }

  /**
   * Description: 代扣计划状态查询接口，仅能查询到由新状态机执行的代扣计划，未切换到新状态机的老数据查询不到
   * Summary: 代扣计划状态查询
   */
  async queryContractTradestatus(request: QueryContractTradestatusRequest): Promise<QueryContractTradestatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContractTradestatusEx(request, headers, runtime);
  }

  /**
   * Description: 代扣计划状态查询接口，仅能查询到由新状态机执行的代扣计划，未切换到新状态机的老数据查询不到
   * Summary: 代扣计划状态查询
   */
  async queryContractTradestatusEx(request: QueryContractTradestatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContractTradestatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContractTradestatusResponse>(await this.doRequest("1.0", "twc.notary.contract.tradestatus.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContractTradestatusResponse({}));
  }

  /**
   * Description: 代扣退款查询，仅支持新代扣状态机处理过的数据，老状态机处理的数据无法查到。
   * Summary: 代扣退款查询
   */
  async queryContractRefund(request: QueryContractRefundRequest): Promise<QueryContractRefundResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContractRefundEx(request, headers, runtime);
  }

  /**
   * Description: 代扣退款查询，仅支持新代扣状态机处理过的数据，老状态机处理的数据无法查到。
   * Summary: 代扣退款查询
   */
  async queryContractRefundEx(request: QueryContractRefundRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContractRefundResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContractRefundResponse>(await this.doRequest("1.0", "twc.notary.contract.refund.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContractRefundResponse({}));
  }

  /**
   * Description: 私有云合同服务通过调用公有云合同服务，获取可公网访问的外部客户的签署地址
   * Summary: 私有云服务获取外部用户签署地址
   */
  async getPrivatecontractSignurl(request: GetPrivatecontractSignurlRequest): Promise<GetPrivatecontractSignurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getPrivatecontractSignurlEx(request, headers, runtime);
  }

  /**
   * Description: 私有云合同服务通过调用公有云合同服务，获取可公网访问的外部客户的签署地址
   * Summary: 私有云服务获取外部用户签署地址
   */
  async getPrivatecontractSignurlEx(request: GetPrivatecontractSignurlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetPrivatecontractSignurlResponse> {
    Util.validateModel(request);
    return $tea.cast<GetPrivatecontractSignurlResponse>(await this.doRequest("1.0", "twc.notary.privatecontract.signurl.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetPrivatecontractSignurlResponse({}));
  }

  /**
   * Description: 商户入驻直付通进度查询，替代twc.notary.contract.merchantindirectzft.query
   * Summary: 商户入驻直付通进度查询
   */
  async queryContractMerchantorder(request: QueryContractMerchantorderRequest): Promise<QueryContractMerchantorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContractMerchantorderEx(request, headers, runtime);
  }

  /**
   * Description: 商户入驻直付通进度查询，替代twc.notary.contract.merchantindirectzft.query
   * Summary: 商户入驻直付通进度查询
   */
  async queryContractMerchantorderEx(request: QueryContractMerchantorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContractMerchantorderResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContractMerchantorderResponse>(await this.doRequest("1.0", "twc.notary.contract.merchantorder.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContractMerchantorderResponse({}));
  }

  /**
   * Description: 修改商户进件信息，单商户可能被多个用户代理，信息修改会生效到所有代理用户上。
   * Summary: 商户进件信息修改
   */
  async updateContractMerchant(request: UpdateContractMerchantRequest): Promise<UpdateContractMerchantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateContractMerchantEx(request, headers, runtime);
  }

  /**
   * Description: 修改商户进件信息，单商户可能被多个用户代理，信息修改会生效到所有代理用户上。
   * Summary: 商户进件信息修改
   */
  async updateContractMerchantEx(request: UpdateContractMerchantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateContractMerchantResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateContractMerchantResponse>(await this.doRequest("1.0", "twc.notary.contract.merchant.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateContractMerchantResponse({}));
  }

  /**
   * Description: 一个二级商户可以挂接多个平台方用户，此接口可以对已进件的商户进行挂接操作。
   * Summary: 二级商户代理挂接接口
   */
  async bindContractMerchant(request: BindContractMerchantRequest): Promise<BindContractMerchantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindContractMerchantEx(request, headers, runtime);
  }

  /**
   * Description: 一个二级商户可以挂接多个平台方用户，此接口可以对已进件的商户进行挂接操作。
   * Summary: 二级商户代理挂接接口
   */
  async bindContractMerchantEx(request: BindContractMerchantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindContractMerchantResponse> {
    Util.validateModel(request);
    return $tea.cast<BindContractMerchantResponse>(await this.doRequest("1.0", "twc.notary.contract.merchant.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindContractMerchantResponse({}));
  }

  /**
   * Description: 初始化私有化合同服务实例，生成服务验签的公/私钥，以及回调使用的公/私钥
   * Summary: 初始化新的私有化合同服务实例
   */
  async initPrivatecontractIntance(request: InitPrivatecontractIntanceRequest): Promise<InitPrivatecontractIntanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initPrivatecontractIntanceEx(request, headers, runtime);
  }

  /**
   * Description: 初始化私有化合同服务实例，生成服务验签的公/私钥，以及回调使用的公/私钥
   * Summary: 初始化新的私有化合同服务实例
   */
  async initPrivatecontractIntanceEx(request: InitPrivatecontractIntanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitPrivatecontractIntanceResponse> {
    Util.validateModel(request);
    return $tea.cast<InitPrivatecontractIntanceResponse>(await this.doRequest("1.0", "twc.notary.privatecontract.intance.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitPrivatecontractIntanceResponse({}));
  }

  /**
   * Description: 更新已有的私有化合同服务实例信息，如私有化服务地址
   * Summary: 更新私有化合同服务实例信息
   */
  async updatePrivatecontractIntance(request: UpdatePrivatecontractIntanceRequest): Promise<UpdatePrivatecontractIntanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updatePrivatecontractIntanceEx(request, headers, runtime);
  }

  /**
   * Description: 更新已有的私有化合同服务实例信息，如私有化服务地址
   * Summary: 更新私有化合同服务实例信息
   */
  async updatePrivatecontractIntanceEx(request: UpdatePrivatecontractIntanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdatePrivatecontractIntanceResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdatePrivatecontractIntanceResponse>(await this.doRequest("1.0", "twc.notary.privatecontract.intance.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdatePrivatecontractIntanceResponse({}));
  }

  /**
   * Description: 开放给私有云的外部用户的证书更新接口.
   * Summary: 私有云用户证书更新接口.
   */
  async updatePrivatecontractCert(request: UpdatePrivatecontractCertRequest): Promise<UpdatePrivatecontractCertResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updatePrivatecontractCertEx(request, headers, runtime);
  }

  /**
   * Description: 开放给私有云的外部用户的证书更新接口.
   * Summary: 私有云用户证书更新接口.
   */
  async updatePrivatecontractCertEx(request: UpdatePrivatecontractCertRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdatePrivatecontractCertResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdatePrivatecontractCertResponse>(await this.doRequest("1.0", "twc.notary.privatecontract.cert.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdatePrivatecontractCertResponse({}));
  }

  /**
   * Description: 修改商户进件申请信息状态数据，只允许超管租户操作
   * Summary: 商户进件申请信息重置
   */
  async resetContractMerchantapply(request: ResetContractMerchantapplyRequest): Promise<ResetContractMerchantapplyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.resetContractMerchantapplyEx(request, headers, runtime);
  }

  /**
   * Description: 修改商户进件申请信息状态数据，只允许超管租户操作
   * Summary: 商户进件申请信息重置
   */
  async resetContractMerchantapplyEx(request: ResetContractMerchantapplyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ResetContractMerchantapplyResponse> {
    Util.validateModel(request);
    return $tea.cast<ResetContractMerchantapplyResponse>(await this.doRequest("1.0", "twc.notary.contract.merchantapply.reset", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ResetContractMerchantapplyResponse({}));
  }

  /**
   * Description: 内部接口，校验私有化合同服务实例权限状态，可能为开通/释放/恢复/停服等
   * Summary: 校验私有化合同服务实例权限情况
   */
  async checkPrivatecontractProvision(request: CheckPrivatecontractProvisionRequest): Promise<CheckPrivatecontractProvisionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkPrivatecontractProvisionEx(request, headers, runtime);
  }

  /**
   * Description: 内部接口，校验私有化合同服务实例权限状态，可能为开通/释放/恢复/停服等
   * Summary: 校验私有化合同服务实例权限情况
   */
  async checkPrivatecontractProvisionEx(request: CheckPrivatecontractProvisionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckPrivatecontractProvisionResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckPrivatecontractProvisionResponse>(await this.doRequest("1.0", "twc.notary.privatecontract.provision.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckPrivatecontractProvisionResponse({}));
  }

  /**
   * Description: 私有化合同服务实例计量数据推送
   * Summary: 私有化合同服务实例计量数据推送
   */
  async pushPrivatecontractGauge(request: PushPrivatecontractGaugeRequest): Promise<PushPrivatecontractGaugeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushPrivatecontractGaugeEx(request, headers, runtime);
  }

  /**
   * Description: 私有化合同服务实例计量数据推送
   * Summary: 私有化合同服务实例计量数据推送
   */
  async pushPrivatecontractGaugeEx(request: PushPrivatecontractGaugeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushPrivatecontractGaugeResponse> {
    Util.validateModel(request);
    return $tea.cast<PushPrivatecontractGaugeResponse>(await this.doRequest("1.0", "twc.notary.privatecontract.gauge.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushPrivatecontractGaugeResponse({}));
  }

  /**
   * Description: 法院代扣链路，扣款前需要进行账户预校验，验证此接口是否可以进行付款
   * Summary: 法院代扣账户扣款预校验
   */
  async checkContractCourtdeduct(request: CheckContractCourtdeductRequest): Promise<CheckContractCourtdeductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkContractCourtdeductEx(request, headers, runtime);
  }

  /**
   * Description: 法院代扣链路，扣款前需要进行账户预校验，验证此接口是否可以进行付款
   * Summary: 法院代扣账户扣款预校验
   */
  async checkContractCourtdeductEx(request: CheckContractCourtdeductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckContractCourtdeductResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckContractCourtdeductResponse>(await this.doRequest("1.0", "twc.notary.contract.courtdeduct.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckContractCourtdeductResponse({}));
  }

  /**
   * Description: 法院代扣计划创建
   * Summary: 法院代扣计划创建
   */
  async createContractCourtdeduct(request: CreateContractCourtdeductRequest): Promise<CreateContractCourtdeductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContractCourtdeductEx(request, headers, runtime);
  }

  /**
   * Description: 法院代扣计划创建
   * Summary: 法院代扣计划创建
   */
  async createContractCourtdeductEx(request: CreateContractCourtdeductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContractCourtdeductResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContractCourtdeductResponse>(await this.doRequest("1.0", "twc.notary.contract.courtdeduct.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContractCourtdeductResponse({}));
  }

  /**
   * Description: 法院代扣执行扣款
   * Summary: 法院代扣执行扣款
   */
  async execContractCourtdeduct(request: ExecContractCourtdeductRequest): Promise<ExecContractCourtdeductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execContractCourtdeductEx(request, headers, runtime);
  }

  /**
   * Description: 法院代扣执行扣款
   * Summary: 法院代扣执行扣款
   */
  async execContractCourtdeductEx(request: ExecContractCourtdeductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecContractCourtdeductResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecContractCourtdeductResponse>(await this.doRequest("1.0", "twc.notary.contract.courtdeduct.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecContractCourtdeductResponse({}));
  }

  /**
   * Description: 文本签名
   * Summary: 文本签接口
   */
  async getContractTextsign(request: GetContractTextsignRequest): Promise<GetContractTextsignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getContractTextsignEx(request, headers, runtime);
  }

  /**
   * Description: 文本签名
   * Summary: 文本签接口
   */
  async getContractTextsignEx(request: GetContractTextsignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetContractTextsignResponse> {
    Util.validateModel(request);
    return $tea.cast<GetContractTextsignResponse>(await this.doRequest("1.0", "twc.notary.contract.textsign.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetContractTextsignResponse({}));
  }

  /**
   * Description: 文本验签
   * Summary: 文本验签接口
   */
  async verifyContractTextsign(request: VerifyContractTextsignRequest): Promise<VerifyContractTextsignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyContractTextsignEx(request, headers, runtime);
  }

  /**
   * Description: 文本验签
   * Summary: 文本验签接口
   */
  async verifyContractTextsignEx(request: VerifyContractTextsignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyContractTextsignResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyContractTextsignResponse>(await this.doRequest("1.0", "twc.notary.contract.textsign.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyContractTextsignResponse({}));
  }

  /**
   * Description: 文件签验签
   * Summary: 文件签验签
   */
  async verifyContractDocsign(request: VerifyContractDocsignRequest): Promise<VerifyContractDocsignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyContractDocsignEx(request, headers, runtime);
  }

  /**
   * Description: 文件签验签
   * Summary: 文件签验签
   */
  async verifyContractDocsignEx(request: VerifyContractDocsignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyContractDocsignResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyContractDocsignResponse>(await this.doRequest("1.0", "twc.notary.contract.docsign.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyContractDocsignResponse({}));
  }

  /**
   * Description: 删除签署区
   * Summary: 删除签署区
   */
  async deleteContractSignfield(request: DeleteContractSignfieldRequest): Promise<DeleteContractSignfieldResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteContractSignfieldEx(request, headers, runtime);
  }

  /**
   * Description: 删除签署区
   * Summary: 删除签署区
   */
  async deleteContractSignfieldEx(request: DeleteContractSignfieldRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteContractSignfieldResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteContractSignfieldResponse>(await this.doRequest("1.0", "twc.notary.contract.signfield.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteContractSignfieldResponse({}));
  }

  /**
   * Description: baas-notary向notarycore同步生成的事务数据，仅做数据同步使用
   * Summary: 向notarycore同步事务数据
   */
  async syncInnerTrans(request: SyncInnerTransRequest): Promise<SyncInnerTransResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncInnerTransEx(request, headers, runtime);
  }

  /**
   * Description: baas-notary向notarycore同步生成的事务数据，仅做数据同步使用
   * Summary: 向notarycore同步事务数据
   */
  async syncInnerTransEx(request: SyncInnerTransRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncInnerTransResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncInnerTransResponse>(await this.doRequest("1.0", "twc.notary.inner.trans.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncInnerTransResponse({}));
  }

  /**
   * Description: 从baas-notary向notarycore同步存证数据
   * Summary: 向notarycore同步存证数据
   */
  async syncInnerNotary(request: SyncInnerNotaryRequest): Promise<SyncInnerNotaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncInnerNotaryEx(request, headers, runtime);
  }

  /**
   * Description: 从baas-notary向notarycore同步存证数据
   * Summary: 向notarycore同步存证数据
   */
  async syncInnerNotaryEx(request: SyncInnerNotaryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncInnerNotaryResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncInnerNotaryResponse>(await this.doRequest("1.0", "twc.notary.inner.notary.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncInnerNotaryResponse({}));
  }

  /**
   * Description: 从baas-notary向notarycore同步自租户信息
   * Summary: 向notarycore同步子租户数据
   */
  async syncInnerTwcopen(request: SyncInnerTwcopenRequest): Promise<SyncInnerTwcopenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncInnerTwcopenEx(request, headers, runtime);
  }

  /**
   * Description: 从baas-notary向notarycore同步自租户信息
   * Summary: 向notarycore同步子租户数据
   */
  async syncInnerTwcopenEx(request: SyncInnerTwcopenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncInnerTwcopenResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncInnerTwcopenResponse>(await this.doRequest("1.0", "twc.notary.inner.twcopen.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncInnerTwcopenResponse({}));
  }

  /**
   * Description: 从baas-notary向notarycore同步租户权限数据
   * Summary: 向notarycore同步租户数据
   */
  async syncInnerProvision(request: SyncInnerProvisionRequest): Promise<SyncInnerProvisionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncInnerProvisionEx(request, headers, runtime);
  }

  /**
   * Description: 从baas-notary向notarycore同步租户权限数据
   * Summary: 向notarycore同步租户数据
   */
  async syncInnerProvisionEx(request: SyncInnerProvisionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncInnerProvisionResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncInnerProvisionResponse>(await this.doRequest("1.0", "twc.notary.inner.provision.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncInnerProvisionResponse({}));
  }

  /**
   * Description: 从baas-notary向notarycore同步tsr数据
   * Summary: 向notarycore同步tsr数据
   */
  async syncInnerTsr(request: SyncInnerTsrRequest): Promise<SyncInnerTsrResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncInnerTsrEx(request, headers, runtime);
  }

  /**
   * Description: 从baas-notary向notarycore同步tsr数据
   * Summary: 向notarycore同步tsr数据
   */
  async syncInnerTsrEx(request: SyncInnerTsrRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncInnerTsrResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncInnerTsrResponse>(await this.doRequest("1.0", "twc.notary.inner.tsr.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncInnerTsrResponse({}));
  }

  /**
   * Description: 输入企业名+证件号，发起企业二要素认证请求。
   * Summary: 企业二要素认证
   */
  async checkEpidentityTwometa(request: CheckEpidentityTwometaRequest): Promise<CheckEpidentityTwometaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkEpidentityTwometaEx(request, headers, runtime);
  }

  /**
   * Description: 输入企业名+证件号，发起企业二要素认证请求。
   * Summary: 企业二要素认证
   */
  async checkEpidentityTwometaEx(request: CheckEpidentityTwometaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckEpidentityTwometaResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckEpidentityTwometaResponse>(await this.doRequest("1.0", "twc.notary.epidentity.twometa.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckEpidentityTwometaResponse({}));
  }

  /**
   * Description: 输入企业名+证件号+企业法人姓名，发起企业三要素认证请求。
   * Summary: 企业三要素认证
   */
  async checkEpidentityThreemeta(request: CheckEpidentityThreemetaRequest): Promise<CheckEpidentityThreemetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkEpidentityThreemetaEx(request, headers, runtime);
  }

  /**
   * Description: 输入企业名+证件号+企业法人姓名，发起企业三要素认证请求。
   * Summary: 企业三要素认证
   */
  async checkEpidentityThreemetaEx(request: CheckEpidentityThreemetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckEpidentityThreemetaResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckEpidentityThreemetaResponse>(await this.doRequest("1.0", "twc.notary.epidentity.threemeta.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckEpidentityThreemetaResponse({}));
  }

  /**
   * Description: 输入企业名+证件号+企业法人姓+法人证件号，发起企业四要素认证请求。
   * Summary: 企业四要素认证
   */
  async checkEpidentityFourmeta(request: CheckEpidentityFourmetaRequest): Promise<CheckEpidentityFourmetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkEpidentityFourmetaEx(request, headers, runtime);
  }

  /**
   * Description: 输入企业名+证件号+企业法人姓+法人证件号，发起企业四要素认证请求。
   * Summary: 企业四要素认证
   */
  async checkEpidentityFourmetaEx(request: CheckEpidentityFourmetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckEpidentityFourmetaResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckEpidentityFourmetaResponse>(await this.doRequest("1.0", "twc.notary.epidentity.fourmeta.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckEpidentityFourmetaResponse({}));
  }

  /**
   * Description: 查询公证订单的有效性
   * Summary: 查询公证订单的有效性
   */
  async checkNotarizationOrder(request: CheckNotarizationOrderRequest): Promise<CheckNotarizationOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkNotarizationOrderEx(request, headers, runtime);
  }

  /**
   * Description: 查询公证订单的有效性
   * Summary: 查询公证订单的有效性
   */
  async checkNotarizationOrderEx(request: CheckNotarizationOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckNotarizationOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckNotarizationOrderResponse>(await this.doRequest("1.0", "twc.notary.notarization.order.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckNotarizationOrderResponse({}));
  }

  /**
   * Description: 更新公证订单状态
   * Summary: 更新公证订单状态
   */
  async updateNotarizationOrder(request: UpdateNotarizationOrderRequest): Promise<UpdateNotarizationOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateNotarizationOrderEx(request, headers, runtime);
  }

  /**
   * Description: 更新公证订单状态
   * Summary: 更新公证订单状态
   */
  async updateNotarizationOrderEx(request: UpdateNotarizationOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateNotarizationOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateNotarizationOrderResponse>(await this.doRequest("1.0", "twc.notary.notarization.order.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateNotarizationOrderResponse({}));
  }

  /**
   * Description: 设置订单属性
   * Summary: 设置订单属性
   */
  async setNotarizationOrder(request: SetNotarizationOrderRequest): Promise<SetNotarizationOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setNotarizationOrderEx(request, headers, runtime);
  }

  /**
   * Description: 设置订单属性
   * Summary: 设置订单属性
   */
  async setNotarizationOrderEx(request: SetNotarizationOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetNotarizationOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<SetNotarizationOrderResponse>(await this.doRequest("1.0", "twc.notary.notarization.order.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetNotarizationOrderResponse({}));
  }

  /**
   * Description: 实人认证初始化
   * Summary: 实人认证初始化
   */
  async initIdentificationFaceauth(request: InitIdentificationFaceauthRequest): Promise<InitIdentificationFaceauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initIdentificationFaceauthEx(request, headers, runtime);
  }

  /**
   * Description: 实人认证初始化
   * Summary: 实人认证初始化
   */
  async initIdentificationFaceauthEx(request: InitIdentificationFaceauthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitIdentificationFaceauthResponse> {
    Util.validateModel(request);
    return $tea.cast<InitIdentificationFaceauthResponse>(await this.doRequest("1.0", "twc.notary.identification.faceauth.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitIdentificationFaceauthResponse({}));
  }

  /**
   * Description: 发起实人认证
   * Summary: 发起实人认证
   */
  async certifyIdentificationFaceauth(request: CertifyIdentificationFaceauthRequest): Promise<CertifyIdentificationFaceauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.certifyIdentificationFaceauthEx(request, headers, runtime);
  }

  /**
   * Description: 发起实人认证
   * Summary: 发起实人认证
   */
  async certifyIdentificationFaceauthEx(request: CertifyIdentificationFaceauthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CertifyIdentificationFaceauthResponse> {
    Util.validateModel(request);
    return $tea.cast<CertifyIdentificationFaceauthResponse>(await this.doRequest("1.0", "twc.notary.identification.faceauth.certify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CertifyIdentificationFaceauthResponse({}));
  }

  /**
   * Description: 查询实人认证结果
   * Summary: 查询实人认证结果
   */
  async queryIdentificationFaceauth(request: QueryIdentificationFaceauthRequest): Promise<QueryIdentificationFaceauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIdentificationFaceauthEx(request, headers, runtime);
  }

  /**
   * Description: 查询实人认证结果
   * Summary: 查询实人认证结果
   */
  async queryIdentificationFaceauthEx(request: QueryIdentificationFaceauthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIdentificationFaceauthResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIdentificationFaceauthResponse>(await this.doRequest("1.0", "twc.notary.identification.faceauth.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIdentificationFaceauthResponse({}));
  }

  /**
   * Description: 企业法人认证查询结果接口
   * Summary: 企业法人认证查询
   */
  async queryEnterpriseFaceauth(request: QueryEnterpriseFaceauthRequest): Promise<QueryEnterpriseFaceauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEnterpriseFaceauthEx(request, headers, runtime);
  }

  /**
   * Description: 企业法人认证查询结果接口
   * Summary: 企业法人认证查询
   */
  async queryEnterpriseFaceauthEx(request: QueryEnterpriseFaceauthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEnterpriseFaceauthResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEnterpriseFaceauthResponse>(await this.doRequest("1.0", "twc.notary.enterprise.faceauth.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEnterpriseFaceauthResponse({}));
  }

  /**
   * Description: 企业法人认证初始化接口
   * Summary: 企业法人认证初始化
   */
  async initEnterpriseFaceauth(request: InitEnterpriseFaceauthRequest): Promise<InitEnterpriseFaceauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initEnterpriseFaceauthEx(request, headers, runtime);
  }

  /**
   * Description: 企业法人认证初始化接口
   * Summary: 企业法人认证初始化
   */
  async initEnterpriseFaceauthEx(request: InitEnterpriseFaceauthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitEnterpriseFaceauthResponse> {
    Util.validateModel(request);
    return $tea.cast<InitEnterpriseFaceauthResponse>(await this.doRequest("1.0", "twc.notary.enterprise.faceauth.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitEnterpriseFaceauthResponse({}));
  }

  /**
   * Description: 企业法人认证开始接口
   * Summary: 企业法人认证开始
   */
  async certifyEnterpriseFaceauth(request: CertifyEnterpriseFaceauthRequest): Promise<CertifyEnterpriseFaceauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.certifyEnterpriseFaceauthEx(request, headers, runtime);
  }

  /**
   * Description: 企业法人认证开始接口
   * Summary: 企业法人认证开始
   */
  async certifyEnterpriseFaceauthEx(request: CertifyEnterpriseFaceauthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CertifyEnterpriseFaceauthResponse> {
    Util.validateModel(request);
    return $tea.cast<CertifyEnterpriseFaceauthResponse>(await this.doRequest("1.0", "twc.notary.enterprise.faceauth.certify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CertifyEnterpriseFaceauthResponse({}));
  }

  /**
   * Description: 创建租赁订单
   * Summary: 租赁订单创建
   */
  async createLeaseOrder(request: CreateLeaseOrderRequest): Promise<CreateLeaseOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLeaseOrderEx(request, headers, runtime);
  }

  /**
   * Description: 创建租赁订单
   * Summary: 租赁订单创建
   */
  async createLeaseOrderEx(request: CreateLeaseOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLeaseOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLeaseOrderResponse>(await this.doRequest("1.0", "twc.notary.lease.order.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLeaseOrderResponse({}));
  }

  /**
   * Description: 电子公证或存证证明场景中，用户通过回传相关信息创建收费订单。
   * Summary: 公证场景创建收费订单
   */
  async createNotarizationBill(request: CreateNotarizationBillRequest): Promise<CreateNotarizationBillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createNotarizationBillEx(request, headers, runtime);
  }

  /**
   * Description: 电子公证或存证证明场景中，用户通过回传相关信息创建收费订单。
   * Summary: 公证场景创建收费订单
   */
  async createNotarizationBillEx(request: CreateNotarizationBillRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateNotarizationBillResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateNotarizationBillResponse>(await this.doRequest("1.0", "twc.notary.notarization.bill.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateNotarizationBillResponse({}));
  }

  /**
   * Description: 提供必要的存证信息，初始化一个存证证明的订单，提交公证处审核，并返回订单号
   * Summary: 初始化存证证明订单
   */
  async initCertification(request: InitCertificationRequest): Promise<InitCertificationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initCertificationEx(request, headers, runtime);
  }

  /**
   * Description: 提供必要的存证信息，初始化一个存证证明的订单，提交公证处审核，并返回订单号
   * Summary: 初始化存证证明订单
   */
  async initCertificationEx(request: InitCertificationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitCertificationResponse> {
    Util.validateModel(request);
    return $tea.cast<InitCertificationResponse>(await this.doRequest("1.0", "twc.notary.certification.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitCertificationResponse({}));
  }

  /**
   * Description: 输入申请ID，查询存证证明申请状态，成功后返回下载地址等信息
   * Summary: 查询存证证明申请状态
   */
  async queryCertification(request: QueryCertificationRequest): Promise<QueryCertificationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCertificationEx(request, headers, runtime);
  }

  /**
   * Description: 输入申请ID，查询存证证明申请状态，成功后返回下载地址等信息
   * Summary: 查询存证证明申请状态
   */
  async queryCertificationEx(request: QueryCertificationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCertificationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCertificationResponse>(await this.doRequest("1.0", "twc.notary.certification.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCertificationResponse({}));
  }

  /**
   * Description: 可以根据存证过程中获得当可信时间戳凭证，获取国家授时中心颁发的PDF格式可信时间证书
   * Summary: 可信时间凭证服务 - 获取时间凭证证书
   */
  async getTsrCertificate(request: GetTsrCertificateRequest): Promise<GetTsrCertificateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTsrCertificateEx(request, headers, runtime);
  }

  /**
   * Description: 可以根据存证过程中获得当可信时间戳凭证，获取国家授时中心颁发的PDF格式可信时间证书
   * Summary: 可信时间凭证服务 - 获取时间凭证证书
   */
  async getTsrCertificateEx(request: GetTsrCertificateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTsrCertificateResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTsrCertificateResponse>(await this.doRequest("1.0", "twc.notary.tsr.certificate.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTsrCertificateResponse({}));
  }

  /**
   * Description: 发起实人认证，这是改造后的接口
   * Summary: 实人认证创建
   */
  async createIdentificationRealperson(request: CreateIdentificationRealpersonRequest): Promise<CreateIdentificationRealpersonResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createIdentificationRealpersonEx(request, headers, runtime);
  }

  /**
   * Description: 发起实人认证，这是改造后的接口
   * Summary: 实人认证创建
   */
  async createIdentificationRealpersonEx(request: CreateIdentificationRealpersonRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateIdentificationRealpersonResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateIdentificationRealpersonResponse>(await this.doRequest("1.0", "twc.notary.identification.realperson.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateIdentificationRealpersonResponse({}));
  }

  /**
   * Description: 查询实人认证结果
   * Summary: 查询实人认证结果
   */
  async queryIdentificationRealperson(request: QueryIdentificationRealpersonRequest): Promise<QueryIdentificationRealpersonResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIdentificationRealpersonEx(request, headers, runtime);
  }

  /**
   * Description: 查询实人认证结果
   * Summary: 查询实人认证结果
   */
  async queryIdentificationRealpersonEx(request: QueryIdentificationRealpersonRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIdentificationRealpersonResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIdentificationRealpersonResponse>(await this.doRequest("1.0", "twc.notary.identification.realperson.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIdentificationRealpersonResponse({}));
  }

  /**
   * Description: 新增/修改履行记录，依据contractCode与contractFulfillmentCode判断唯一性
   * Summary: 联合执行履行记录新增/修改接口
   */
  async saveJointconstraintRecord(request: SaveJointconstraintRecordRequest): Promise<SaveJointconstraintRecordResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveJointconstraintRecordEx(request, headers, runtime);
  }

  /**
   * Description: 新增/修改履行记录，依据contractCode与contractFulfillmentCode判断唯一性
   * Summary: 联合执行履行记录新增/修改接口
   */
  async saveJointconstraintRecordEx(request: SaveJointconstraintRecordRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveJointconstraintRecordResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveJointconstraintRecordResponse>(await this.doRequest("1.0", "twc.notary.jointconstraint.record.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveJointconstraintRecordResponse({}));
  }

  /**
   * Description: 删除履行记录
   * Summary: 履行记录删除接口
   */
  async deleteJointconstraintRecord(request: DeleteJointconstraintRecordRequest): Promise<DeleteJointconstraintRecordResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteJointconstraintRecordEx(request, headers, runtime);
  }

  /**
   * Description: 删除履行记录
   * Summary: 履行记录删除接口
   */
  async deleteJointconstraintRecordEx(request: DeleteJointconstraintRecordRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteJointconstraintRecordResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteJointconstraintRecordResponse>(await this.doRequest("1.0", "twc.notary.jointconstraint.record.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteJointconstraintRecordResponse({}));
  }

  /**
   * Description: 查询违约记录
   * Summary: 违约记录查询接口
   */
  async queryJointconstraintBreachrecord(request: QueryJointconstraintBreachrecordRequest): Promise<QueryJointconstraintBreachrecordResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryJointconstraintBreachrecordEx(request, headers, runtime);
  }

  /**
   * Description: 查询违约记录
   * Summary: 违约记录查询接口
   */
  async queryJointconstraintBreachrecordEx(request: QueryJointconstraintBreachrecordRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryJointconstraintBreachrecordResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryJointconstraintBreachrecordResponse>(await this.doRequest("1.0", "twc.notary.jointconstraint.breachrecord.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryJointconstraintBreachrecordResponse({}));
  }

  /**
   * Description: 提供给第三方调解申请提交
   * Summary: 调解申请
   */
  async applyJusticeMediation(request: ApplyJusticeMediationRequest): Promise<ApplyJusticeMediationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyJusticeMediationEx(request, headers, runtime);
  }

  /**
   * Description: 提供给第三方调解申请提交
   * Summary: 调解申请
   */
  async applyJusticeMediationEx(request: ApplyJusticeMediationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyJusticeMediationResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyJusticeMediationResponse>(await this.doRequest("1.0", "twc.notary.justice.mediation.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyJusticeMediationResponse({}));
  }

  /**
   * Description: 调解申请进度查询
   * Summary: 调解申请进度查询
   */
  async queryJusticeMediation(request: QueryJusticeMediationRequest): Promise<QueryJusticeMediationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryJusticeMediationEx(request, headers, runtime);
  }

  /**
   * Description: 调解申请进度查询
   * Summary: 调解申请进度查询
   */
  async queryJusticeMediationEx(request: QueryJusticeMediationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryJusticeMediationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryJusticeMediationResponse>(await this.doRequest("1.0", "twc.notary.justice.mediation.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryJusticeMediationResponse({}));
  }

  /**
   * Description: 汇裁证据要素查询接口
   * Summary: 汇裁证据要素查询接口
   */
  async queryJusticeCaseinfo(request: QueryJusticeCaseinfoRequest): Promise<QueryJusticeCaseinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryJusticeCaseinfoEx(request, headers, runtime);
  }

  /**
   * Description: 汇裁证据要素查询接口
   * Summary: 汇裁证据要素查询接口
   */
  async queryJusticeCaseinfoEx(request: QueryJusticeCaseinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryJusticeCaseinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryJusticeCaseinfoResponse>(await this.doRequest("1.0", "twc.notary.justice.caseinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryJusticeCaseinfoResponse({}));
  }

  /**
   * Description: 获取oss文件上传路径，返回业务方oss文件上传链接和fileKey
   * Summary: 获取OSS文件上传路径
   */
  async getJusticeUploadfilepath(request: GetJusticeUploadfilepathRequest): Promise<GetJusticeUploadfilepathResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getJusticeUploadfilepathEx(request, headers, runtime);
  }

  /**
   * Description: 获取oss文件上传路径，返回业务方oss文件上传链接和fileKey
   * Summary: 获取OSS文件上传路径
   */
  async getJusticeUploadfilepathEx(request: GetJusticeUploadfilepathRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetJusticeUploadfilepathResponse> {
    Util.validateModel(request);
    return $tea.cast<GetJusticeUploadfilepathResponse>(await this.doRequest("1.0", "twc.notary.justice.uploadfilepath.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetJusticeUploadfilepathResponse({}));
  }

  /**
   * Description: 纠纷处理平台提供回调接口供业务平台自动插入案件模型中，业务方需要调用回写接口创建案件。
   * Summary: 自动进件案件回写
   */
  async createJusticeCasewriteback(request: CreateJusticeCasewritebackRequest): Promise<CreateJusticeCasewritebackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createJusticeCasewritebackEx(request, headers, runtime);
  }

  /**
   * Description: 纠纷处理平台提供回调接口供业务平台自动插入案件模型中，业务方需要调用回写接口创建案件。
   * Summary: 自动进件案件回写
   */
  async createJusticeCasewritebackEx(request: CreateJusticeCasewritebackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateJusticeCasewritebackResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateJusticeCasewritebackResponse>(await this.doRequest("1.0", "twc.notary.justice.casewriteback.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateJusticeCasewritebackResponse({}));
  }

  /**
   * Description: 案件基础信息查询
   * Summary: 案件基础信息查询
   */
  async queryJusticeBasecase(request: QueryJusticeBasecaseRequest): Promise<QueryJusticeBasecaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryJusticeBasecaseEx(request, headers, runtime);
  }

  /**
   * Description: 案件基础信息查询
   * Summary: 案件基础信息查询
   */
  async queryJusticeBasecaseEx(request: QueryJusticeBasecaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryJusticeBasecaseResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryJusticeBasecaseResponse>(await this.doRequest("1.0", "twc.notary.justice.basecase.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryJusticeBasecaseResponse({}));
  }

  /**
   * Description: 案件材料下载
   * Summary: 案件材料下载
   */
  async downloadJusticeCasefile(request: DownloadJusticeCasefileRequest): Promise<DownloadJusticeCasefileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.downloadJusticeCasefileEx(request, headers, runtime);
  }

  /**
   * Description: 案件材料下载
   * Summary: 案件材料下载
   */
  async downloadJusticeCasefileEx(request: DownloadJusticeCasefileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DownloadJusticeCasefileResponse> {
    Util.validateModel(request);
    return $tea.cast<DownloadJusticeCasefileResponse>(await this.doRequest("1.0", "twc.notary.justice.casefile.download", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DownloadJusticeCasefileResponse({}));
  }

  /**
   * Description: 开通纠纷平台使用权限
   * Summary: 开通纠纷平台使用权限
   */
  async openInternalJudicial(request: OpenInternalJudicialRequest): Promise<OpenInternalJudicialResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.openInternalJudicialEx(request, headers, runtime);
  }

  /**
   * Description: 开通纠纷平台使用权限
   * Summary: 开通纠纷平台使用权限
   */
  async openInternalJudicialEx(request: OpenInternalJudicialRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OpenInternalJudicialResponse> {
    Util.validateModel(request);
    return $tea.cast<OpenInternalJudicialResponse>(await this.doRequest("1.0", "twc.notary.internal.judicial.open", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OpenInternalJudicialResponse({}));
  }

  /**
   * Description: 案件当事人信息保存
   * Summary: 案件当事人信息保存
   */
  async saveJusticeParty(request: SaveJusticePartyRequest): Promise<SaveJusticePartyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveJusticePartyEx(request, headers, runtime);
  }

  /**
   * Description: 案件当事人信息保存
   * Summary: 案件当事人信息保存
   */
  async saveJusticePartyEx(request: SaveJusticePartyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveJusticePartyResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveJusticePartyResponse>(await this.doRequest("1.0", "twc.notary.justice.party.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveJusticePartyResponse({}));
  }

  /**
   * Description: 普通案件创建
   * Summary: 普通案件创建
   */
  async createJusticeNormalcase(request: CreateJusticeNormalcaseRequest): Promise<CreateJusticeNormalcaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createJusticeNormalcaseEx(request, headers, runtime);
  }

  /**
   * Description: 普通案件创建
   * Summary: 普通案件创建
   */
  async createJusticeNormalcaseEx(request: CreateJusticeNormalcaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateJusticeNormalcaseResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateJusticeNormalcaseResponse>(await this.doRequest("1.0", "twc.notary.justice.normalcase.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateJusticeNormalcaseResponse({}));
  }

  /**
   * Description: 链上案件创建
   * Summary: 链上案件创建
   */
  async createJusticeChaincase(request: CreateJusticeChaincaseRequest): Promise<CreateJusticeChaincaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createJusticeChaincaseEx(request, headers, runtime);
  }

  /**
   * Description: 链上案件创建
   * Summary: 链上案件创建
   */
  async createJusticeChaincaseEx(request: CreateJusticeChaincaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateJusticeChaincaseResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateJusticeChaincaseResponse>(await this.doRequest("1.0", "twc.notary.justice.chaincase.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateJusticeChaincaseResponse({}));
  }

  /**
   * Description: 案件维权发起
   * Summary: 案件维权发起
   */
  async startJusticeCase(request: StartJusticeCaseRequest): Promise<StartJusticeCaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startJusticeCaseEx(request, headers, runtime);
  }

  /**
   * Description: 案件维权发起
   * Summary: 案件维权发起
   */
  async startJusticeCaseEx(request: StartJusticeCaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartJusticeCaseResponse> {
    Util.validateModel(request);
    return $tea.cast<StartJusticeCaseResponse>(await this.doRequest("1.0", "twc.notary.justice.case.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartJusticeCaseResponse({}));
  }

  /**
   * Description: 案件查询
   * Summary: 案件查询
   */
  async queryJusticeCase(request: QueryJusticeCaseRequest): Promise<QueryJusticeCaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryJusticeCaseEx(request, headers, runtime);
  }

  /**
   * Description: 案件查询
   * Summary: 案件查询
   */
  async queryJusticeCaseEx(request: QueryJusticeCaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryJusticeCaseResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryJusticeCaseResponse>(await this.doRequest("1.0", "twc.notary.justice.case.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryJusticeCaseResponse({}));
  }

  /**
   * Description: 案件事件响应
   * Summary: 案件事件响应
   */
  async operateJusticeEvent(request: OperateJusticeEventRequest): Promise<OperateJusticeEventResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateJusticeEventEx(request, headers, runtime);
  }

  /**
   * Description: 案件事件响应
   * Summary: 案件事件响应
   */
  async operateJusticeEventEx(request: OperateJusticeEventRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateJusticeEventResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateJusticeEventResponse>(await this.doRequest("1.0", "twc.notary.justice.event.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateJusticeEventResponse({}));
  }

  /**
   * Description: 司法解纷平台API服务，创建案件要素模板接口
   * Summary: 创建案件要素模板
   */
  async createJusticeCasetemplate(request: CreateJusticeCasetemplateRequest): Promise<CreateJusticeCasetemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createJusticeCasetemplateEx(request, headers, runtime);
  }

  /**
   * Description: 司法解纷平台API服务，创建案件要素模板接口
   * Summary: 创建案件要素模板
   */
  async createJusticeCasetemplateEx(request: CreateJusticeCasetemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateJusticeCasetemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateJusticeCasetemplateResponse>(await this.doRequest("1.0", "twc.notary.justice.casetemplate.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateJusticeCasetemplateResponse({}));
  }

  /**
   * Description: 司法解纷平台API服务，创建维权要素模板接口
   * Summary: 创建维权要素模板
   */
  async createJusticeRightprotecttemplate(request: CreateJusticeRightprotecttemplateRequest): Promise<CreateJusticeRightprotecttemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createJusticeRightprotecttemplateEx(request, headers, runtime);
  }

  /**
   * Description: 司法解纷平台API服务，创建维权要素模板接口
   * Summary: 创建维权要素模板
   */
  async createJusticeRightprotecttemplateEx(request: CreateJusticeRightprotecttemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateJusticeRightprotecttemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateJusticeRightprotecttemplateResponse>(await this.doRequest("1.0", "twc.notary.justice.rightprotecttemplate.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateJusticeRightprotecttemplateResponse({}));
  }

  /**
   * Description: 获取司法文件上传链接
   * Summary: 获取司法文件上传链接
   */
  async getJusticeFileuploadurl(request: GetJusticeFileuploadurlRequest): Promise<GetJusticeFileuploadurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getJusticeFileuploadurlEx(request, headers, runtime);
  }

  /**
   * Description: 获取司法文件上传链接
   * Summary: 获取司法文件上传链接
   */
  async getJusticeFileuploadurlEx(request: GetJusticeFileuploadurlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetJusticeFileuploadurlResponse> {
    Util.validateModel(request);
    return $tea.cast<GetJusticeFileuploadurlResponse>(await this.doRequest("1.0", "twc.notary.justice.fileuploadurl.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetJusticeFileuploadurlResponse({}));
  }

  /**
   * Description: 融资服务平台上传商品类别信息
   * Summary: 融资服务平台上传商品类别信息
   */
  async createLeaseProductinfo(request: CreateLeaseProductinfoRequest): Promise<CreateLeaseProductinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLeaseProductinfoEx(request, headers, runtime);
  }

  /**
   * Description: 融资服务平台上传商品类别信息
   * Summary: 融资服务平台上传商品类别信息
   */
  async createLeaseProductinfoEx(request: CreateLeaseProductinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLeaseProductinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLeaseProductinfoResponse>(await this.doRequest("1.0", "twc.notary.lease.productinfo.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLeaseProductinfoResponse({}));
  }

  /**
   * Description: 升级融资租赁合约
   * Summary: 升级融资租赁合约
   */
  async updateLeaseContract(request: UpdateLeaseContractRequest): Promise<UpdateLeaseContractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateLeaseContractEx(request, headers, runtime);
  }

  /**
   * Description: 升级融资租赁合约
   * Summary: 升级融资租赁合约
   */
  async updateLeaseContractEx(request: UpdateLeaseContractRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateLeaseContractResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateLeaseContractResponse>(await this.doRequest("1.0", "twc.notary.lease.contract.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateLeaseContractResponse({}));
  }

  /**
   * Description: 租赁平台isv模式代理商户入驻
   * Summary: 租赁平台isv模式代理商户入驻
   */
  async createLeaseAssetagentregister(request: CreateLeaseAssetagentregisterRequest): Promise<CreateLeaseAssetagentregisterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLeaseAssetagentregisterEx(request, headers, runtime);
  }

  /**
   * Description: 租赁平台isv模式代理商户入驻
   * Summary: 租赁平台isv模式代理商户入驻
   */
  async createLeaseAssetagentregisterEx(request: CreateLeaseAssetagentregisterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLeaseAssetagentregisterResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLeaseAssetagentregisterResponse>(await this.doRequest("1.0", "twc.notary.lease.assetagentregister.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLeaseAssetagentregisterResponse({}));
  }

  /**
   * Description: 融资租赁商品信息查询接口
   * Summary: 融资租赁商品信息查询接口
   */
  async queryLeaseProductinfo(request: QueryLeaseProductinfoRequest): Promise<QueryLeaseProductinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLeaseProductinfoEx(request, headers, runtime);
  }

  /**
   * Description: 融资租赁商品信息查询接口
   * Summary: 融资租赁商品信息查询接口
   */
  async queryLeaseProductinfoEx(request: QueryLeaseProductinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLeaseProductinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLeaseProductinfoResponse>(await this.doRequest("1.0", "twc.notary.lease.productinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLeaseProductinfoResponse({}));
  }

  /**
   * Description: 同步采购平台订单状态
   * Summary: 同步采购平台订单状态
   */
  async syncLeaseSupplierorderstatus(request: SyncLeaseSupplierorderstatusRequest): Promise<SyncLeaseSupplierorderstatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncLeaseSupplierorderstatusEx(request, headers, runtime);
  }

  /**
   * Description: 同步采购平台订单状态
   * Summary: 同步采购平台订单状态
   */
  async syncLeaseSupplierorderstatusEx(request: SyncLeaseSupplierorderstatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncLeaseSupplierorderstatusResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncLeaseSupplierorderstatusResponse>(await this.doRequest("1.0", "twc.notary.lease.supplierorderstatus.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncLeaseSupplierorderstatusResponse({}));
  }

  /**
   * Description: 采购供应商初始化 
   * Summary: 采购供应商初始化 
   */
  async initLeaseSupplier(request: InitLeaseSupplierRequest): Promise<InitLeaseSupplierResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initLeaseSupplierEx(request, headers, runtime);
  }

  /**
   * Description: 采购供应商初始化 
   * Summary: 采购供应商初始化 
   */
  async initLeaseSupplierEx(request: InitLeaseSupplierRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitLeaseSupplierResponse> {
    Util.validateModel(request);
    return $tea.cast<InitLeaseSupplierResponse>(await this.doRequest("1.0", "twc.notary.lease.supplier.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitLeaseSupplierResponse({}));
  }

  /**
   * Description: 租赁订单接收采购平台的采购状态信息，完成采购流程
   * Summary: 租赁订单接收采购状态信息，完成采购流程
   */
  async finishLeaseSupplierstatus(request: FinishLeaseSupplierstatusRequest): Promise<FinishLeaseSupplierstatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.finishLeaseSupplierstatusEx(request, headers, runtime);
  }

  /**
   * Description: 租赁订单接收采购平台的采购状态信息，完成采购流程
   * Summary: 租赁订单接收采购状态信息，完成采购流程
   */
  async finishLeaseSupplierstatusEx(request: FinishLeaseSupplierstatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<FinishLeaseSupplierstatusResponse> {
    Util.validateModel(request);
    return $tea.cast<FinishLeaseSupplierstatusResponse>(await this.doRequest("1.0", "twc.notary.lease.supplierstatus.finish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new FinishLeaseSupplierstatusResponse({}));
  }

  /**
   * Description: 采购商品初始化 
   * Summary: 采购商品初始化 
   */
  async createLeaseSupplierproduct(request: CreateLeaseSupplierproductRequest): Promise<CreateLeaseSupplierproductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLeaseSupplierproductEx(request, headers, runtime);
  }

  /**
   * Description: 采购商品初始化 
   * Summary: 采购商品初始化 
   */
  async createLeaseSupplierproductEx(request: CreateLeaseSupplierproductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLeaseSupplierproductResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLeaseSupplierproductResponse>(await this.doRequest("1.0", "twc.notary.lease.supplierproduct.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLeaseSupplierproductResponse({}));
  }

  /**
   * Description: 链上采购申请
   * Summary: 链上采购申请
   */
  async applyLeaseSupplierorder(request: ApplyLeaseSupplierorderRequest): Promise<ApplyLeaseSupplierorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyLeaseSupplierorderEx(request, headers, runtime);
  }

  /**
   * Description: 链上采购申请
   * Summary: 链上采购申请
   */
  async applyLeaseSupplierorderEx(request: ApplyLeaseSupplierorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyLeaseSupplierorderResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyLeaseSupplierorderResponse>(await this.doRequest("1.0", "twc.notary.lease.supplierorder.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyLeaseSupplierorderResponse({}));
  }

  /**
   * Description: 创建融资租赁提前还款人脸认证信息
   * Summary: 创建融资租赁提前还款人脸认证信息
   */
  async createLeaseFinancecertify(request: CreateLeaseFinancecertifyRequest): Promise<CreateLeaseFinancecertifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLeaseFinancecertifyEx(request, headers, runtime);
  }

  /**
   * Description: 创建融资租赁提前还款人脸认证信息
   * Summary: 创建融资租赁提前还款人脸认证信息
   */
  async createLeaseFinancecertifyEx(request: CreateLeaseFinancecertifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLeaseFinancecertifyResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLeaseFinancecertifyResponse>(await this.doRequest("1.0", "twc.notary.lease.financecertify.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLeaseFinancecertifyResponse({}));
  }

  /**
   * Description: 融资租赁提前还款人脸识别核验
   * Summary: 融资租赁提前还款人脸识别核验
   */
  async queryLeaseFinancecertify(request: QueryLeaseFinancecertifyRequest): Promise<QueryLeaseFinancecertifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLeaseFinancecertifyEx(request, headers, runtime);
  }

  /**
   * Description: 融资租赁提前还款人脸识别核验
   * Summary: 融资租赁提前还款人脸识别核验
   */
  async queryLeaseFinancecertifyEx(request: QueryLeaseFinancecertifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLeaseFinancecertifyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLeaseFinancecertifyResponse>(await this.doRequest("1.0", "twc.notary.lease.financecertify.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLeaseFinancecertifyResponse({}));
  }

  /**
   * Description: 查询融资租赁合约内核验结果
   * Summary: 查询融资租赁合约内核验结果
   */
  async queryLeaseFinancecertifyincontract(request: QueryLeaseFinancecertifyincontractRequest): Promise<QueryLeaseFinancecertifyincontractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLeaseFinancecertifyincontractEx(request, headers, runtime);
  }

  /**
   * Description: 查询融资租赁合约内核验结果
   * Summary: 查询融资租赁合约内核验结果
   */
  async queryLeaseFinancecertifyincontractEx(request: QueryLeaseFinancecertifyincontractRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLeaseFinancecertifyincontractResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLeaseFinancecertifyincontractResponse>(await this.doRequest("1.0", "twc.notary.lease.financecertifyincontract.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLeaseFinancecertifyincontractResponse({}));
  }

  /**
   * Description: 融资租赁用户信息查询
   * Summary: 融资租赁用户信息查询
   */
  async queryLeaseUser(request: QueryLeaseUserRequest): Promise<QueryLeaseUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLeaseUserEx(request, headers, runtime);
  }

  /**
   * Description: 融资租赁用户信息查询
   * Summary: 融资租赁用户信息查询
   */
  async queryLeaseUserEx(request: QueryLeaseUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLeaseUserResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLeaseUserResponse>(await this.doRequest("1.0", "twc.notary.lease.user.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLeaseUserResponse({}));
  }

  /**
   * Description: 融资租赁订单详情查询
   * Summary: 融资租赁订单详情查询
   */
  async queryLeaseOrderdetailinfo(request: QueryLeaseOrderdetailinfoRequest): Promise<QueryLeaseOrderdetailinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLeaseOrderdetailinfoEx(request, headers, runtime);
  }

  /**
   * Description: 融资租赁订单详情查询
   * Summary: 融资租赁订单详情查询
   */
  async queryLeaseOrderdetailinfoEx(request: QueryLeaseOrderdetailinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLeaseOrderdetailinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLeaseOrderdetailinfoResponse>(await this.doRequest("1.0", "twc.notary.lease.orderdetailinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLeaseOrderdetailinfoResponse({}));
  }

  /**
   * Description: 融资租赁租赁机构承诺查询
   * Summary: 融资租赁租赁机构承诺查询
   */
  async queryLeaseLeasepromise(request: QueryLeaseLeasepromiseRequest): Promise<QueryLeaseLeasepromiseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLeaseLeasepromiseEx(request, headers, runtime);
  }

  /**
   * Description: 融资租赁租赁机构承诺查询
   * Summary: 融资租赁租赁机构承诺查询
   */
  async queryLeaseLeasepromiseEx(request: QueryLeaseLeasepromiseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLeaseLeasepromiseResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLeaseLeasepromiseResponse>(await this.doRequest("1.0", "twc.notary.lease.leasepromise.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLeaseLeasepromiseResponse({}));
  }

  /**
   * Description: 融资租赁资方承诺查询
   * Summary: 融资租赁资方承诺查询
   */
  async queryLeaseCreditpromise(request: QueryLeaseCreditpromiseRequest): Promise<QueryLeaseCreditpromiseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLeaseCreditpromiseEx(request, headers, runtime);
  }

  /**
   * Description: 融资租赁资方承诺查询
   * Summary: 融资租赁资方承诺查询
   */
  async queryLeaseCreditpromiseEx(request: QueryLeaseCreditpromiseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLeaseCreditpromiseResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLeaseCreditpromiseResponse>(await this.doRequest("1.0", "twc.notary.lease.creditpromise.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLeaseCreditpromiseResponse({}));
  }

  /**
   * Description: 融资租赁订单清分信息查询
   * Summary: 融资租赁订单清分信息查询
   */
  async queryLeaseClearing(request: QueryLeaseClearingRequest): Promise<QueryLeaseClearingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLeaseClearingEx(request, headers, runtime);
  }

  /**
   * Description: 融资租赁订单清分信息查询
   * Summary: 融资租赁订单清分信息查询
   */
  async queryLeaseClearingEx(request: QueryLeaseClearingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLeaseClearingResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLeaseClearingResponse>(await this.doRequest("1.0", "twc.notary.lease.clearing.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLeaseClearingResponse({}));
  }

  /**
   * Description: 融资租赁用户侧还款信息
   * Summary: 融资租赁用户侧还款信息
   */
  async queryLeaseRentalinfo(request: QueryLeaseRentalinfoRequest): Promise<QueryLeaseRentalinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLeaseRentalinfoEx(request, headers, runtime);
  }

  /**
   * Description: 融资租赁用户侧还款信息
   * Summary: 融资租赁用户侧还款信息
   */
  async queryLeaseRentalinfoEx(request: QueryLeaseRentalinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLeaseRentalinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLeaseRentalinfoResponse>(await this.doRequest("1.0", "twc.notary.lease.rentalinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLeaseRentalinfoResponse({}));
  }

  /**
   * Description: 融资租赁资方还款信息查询
   * Summary: 融资租赁资方还款信息查询
   */
  async queryLeaseRepayment(request: QueryLeaseRepaymentRequest): Promise<QueryLeaseRepaymentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLeaseRepaymentEx(request, headers, runtime);
  }

  /**
   * Description: 融资租赁资方还款信息查询
   * Summary: 融资租赁资方还款信息查询
   */
  async queryLeaseRepaymentEx(request: QueryLeaseRepaymentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLeaseRepaymentResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLeaseRepaymentResponse>(await this.doRequest("1.0", "twc.notary.lease.repayment.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLeaseRepaymentResponse({}));
  }

  /**
   * Description: 查询订单商品信息
   * Summary: 查询订单商品信息
   */
  async queryLeaseOrderproduct(request: QueryLeaseOrderproductRequest): Promise<QueryLeaseOrderproductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLeaseOrderproductEx(request, headers, runtime);
  }

  /**
   * Description: 查询订单商品信息
   * Summary: 查询订单商品信息
   */
  async queryLeaseOrderproductEx(request: QueryLeaseOrderproductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLeaseOrderproductResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLeaseOrderproductResponse>(await this.doRequest("1.0", "twc.notary.lease.orderproduct.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLeaseOrderproductResponse({}));
  }

  /**
   * Description: 融资租赁查询资金方信息
   * Summary: 融资租赁查询资金方信息
   */
  async queryLeaseFinancecredit(request: QueryLeaseFinancecreditRequest): Promise<QueryLeaseFinancecreditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLeaseFinancecreditEx(request, headers, runtime);
  }

  /**
   * Description: 融资租赁查询资金方信息
   * Summary: 融资租赁查询资金方信息
   */
  async queryLeaseFinancecreditEx(request: QueryLeaseFinancecreditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLeaseFinancecreditResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLeaseFinancecreditResponse>(await this.doRequest("1.0", "twc.notary.lease.financecredit.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLeaseFinancecreditResponse({}));
  }

  /**
   * Description: 根据资产包id分页查询再融资订单id
   * Summary: 分页查询再融资订单id
   */
  async queryRefinanceOrderid(request: QueryRefinanceOrderidRequest): Promise<QueryRefinanceOrderidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRefinanceOrderidEx(request, headers, runtime);
  }

  /**
   * Description: 根据资产包id分页查询再融资订单id
   * Summary: 分页查询再融资订单id
   */
  async queryRefinanceOrderidEx(request: QueryRefinanceOrderidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRefinanceOrderidResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRefinanceOrderidResponse>(await this.doRequest("1.0", "twc.notary.refinance.orderid.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRefinanceOrderidResponse({}));
  }

  /**
   * Description: 资产明细查询
   * Summary: 资产明细
   */
  async queryRefinanceOrder(request: QueryRefinanceOrderRequest): Promise<QueryRefinanceOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRefinanceOrderEx(request, headers, runtime);
  }

  /**
   * Description: 资产明细查询
   * Summary: 资产明细
   */
  async queryRefinanceOrderEx(request: QueryRefinanceOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRefinanceOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRefinanceOrderResponse>(await this.doRequest("1.0", "twc.notary.refinance.order.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRefinanceOrderResponse({}));
  }

  /**
   * Description: 再融资的商品信息查询
   * Summary: 再融资的商品信息查询
   */
  async queryRefinanceProduct(request: QueryRefinanceProductRequest): Promise<QueryRefinanceProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRefinanceProductEx(request, headers, runtime);
  }

  /**
   * Description: 再融资的商品信息查询
   * Summary: 再融资的商品信息查询
   */
  async queryRefinanceProductEx(request: QueryRefinanceProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRefinanceProductResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRefinanceProductResponse>(await this.doRequest("1.0", "twc.notary.refinance.product.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRefinanceProductResponse({}));
  }

  /**
   * Description: 资产包的受让/驳回资产包
   * Summary: 资产包的受让/驳回资产包
   */
  async verifyRefinancePackage(request: VerifyRefinancePackageRequest): Promise<VerifyRefinancePackageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyRefinancePackageEx(request, headers, runtime);
  }

  /**
   * Description: 资产包的受让/驳回资产包
   * Summary: 资产包的受让/驳回资产包
   */
  async verifyRefinancePackageEx(request: VerifyRefinancePackageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyRefinancePackageResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyRefinancePackageResponse>(await this.doRequest("1.0", "twc.notary.refinance.package.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyRefinancePackageResponse({}));
  }

  /**
   * Description: 融资租赁查询清分信息
   * Summary: 融资租赁查询清分信息
   */
  async queryLeaseOrderclearing(request: QueryLeaseOrderclearingRequest): Promise<QueryLeaseOrderclearingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLeaseOrderclearingEx(request, headers, runtime);
  }

  /**
   * Description: 融资租赁查询清分信息
   * Summary: 融资租赁查询清分信息
   */
  async queryLeaseOrderclearingEx(request: QueryLeaseOrderclearingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLeaseOrderclearingResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLeaseOrderclearingResponse>(await this.doRequest("1.0", "twc.notary.lease.orderclearing.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLeaseOrderclearingResponse({}));
  }

  /**
   * Description: 融资租赁提前还款详情查询
   * Summary: 融资租赁提前还款详情查询
   */
  async queryLeaseRepaymentstatus(request: QueryLeaseRepaymentstatusRequest): Promise<QueryLeaseRepaymentstatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLeaseRepaymentstatusEx(request, headers, runtime);
  }

  /**
   * Description: 融资租赁提前还款详情查询
   * Summary: 融资租赁提前还款详情查询
   */
  async queryLeaseRepaymentstatusEx(request: QueryLeaseRepaymentstatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLeaseRepaymentstatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLeaseRepaymentstatusResponse>(await this.doRequest("1.0", "twc.notary.lease.repaymentstatus.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLeaseRepaymentstatusResponse({}));
  }

  /**
   * Description: 续租过程中，当前资方希望查询用户历史的履约表现
   * Summary: 核验链上用户的履约情况
   */
  async queryLeaseUserperformance(request: QueryLeaseUserperformanceRequest): Promise<QueryLeaseUserperformanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLeaseUserperformanceEx(request, headers, runtime);
  }

  /**
   * Description: 续租过程中，当前资方希望查询用户历史的履约表现
   * Summary: 核验链上用户的履约情况
   */
  async queryLeaseUserperformanceEx(request: QueryLeaseUserperformanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLeaseUserperformanceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLeaseUserperformanceResponse>(await this.doRequest("1.0", "twc.notary.lease.userperformance.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLeaseUserperformanceResponse({}));
  }

  /**
   * Description: 履约流水核验查询
   * Summary: 履约流水核验查询
   */
  async queryLeaseRentalverify(request: QueryLeaseRentalverifyRequest): Promise<QueryLeaseRentalverifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLeaseRentalverifyEx(request, headers, runtime);
  }

  /**
   * Description: 履约流水核验查询
   * Summary: 履约流水核验查询
   */
  async queryLeaseRentalverifyEx(request: QueryLeaseRentalverifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLeaseRentalverifyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLeaseRentalverifyResponse>(await this.doRequest("1.0", "twc.notary.lease.rentalverify.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLeaseRentalverifyResponse({}));
  }

  /**
   * Description: 分期查询用户归还记录 资方还款 清分信息
   * Summary: 分期查询用户归还记录 资方还款 清分信息
   */
  async queryLeaseInstallment(request: QueryLeaseInstallmentRequest): Promise<QueryLeaseInstallmentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLeaseInstallmentEx(request, headers, runtime);
  }

  /**
   * Description: 分期查询用户归还记录 资方还款 清分信息
   * Summary: 分期查询用户归还记录 资方还款 清分信息
   */
  async queryLeaseInstallmentEx(request: QueryLeaseInstallmentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLeaseInstallmentResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLeaseInstallmentResponse>(await this.doRequest("1.0", "twc.notary.lease.installment.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLeaseInstallmentResponse({}));
  }

  /**
   * Description: 创建签署见证流程
   * Summary: 创建见证流程
   */
  async createWitnessFlow(request: CreateWitnessFlowRequest): Promise<CreateWitnessFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createWitnessFlowEx(request, headers, runtime);
  }

  /**
   * Description: 创建签署见证流程
   * Summary: 创建见证流程
   */
  async createWitnessFlowEx(request: CreateWitnessFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateWitnessFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateWitnessFlowResponse>(await this.doRequest("1.0", "twc.notary.witness.flow.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateWitnessFlowResponse({}));
  }

  /**
   * Description: 保存见证流程快照数据
   * Summary: 保存见证流程快照数据
   */
  async saveWitnessSnapshot(request: SaveWitnessSnapshotRequest): Promise<SaveWitnessSnapshotResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveWitnessSnapshotEx(request, headers, runtime);
  }

  /**
   * Description: 保存见证流程快照数据
   * Summary: 保存见证流程快照数据
   */
  async saveWitnessSnapshotEx(request: SaveWitnessSnapshotRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveWitnessSnapshotResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveWitnessSnapshotResponse>(await this.doRequest("1.0", "twc.notary.witness.snapshot.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveWitnessSnapshotResponse({}));
  }

  /**
   * Description: 见证流程签署权限校验
   * Summary: 见证流程签署权限校验
   */
  async checkWitnessSignaccess(request: CheckWitnessSignaccessRequest): Promise<CheckWitnessSignaccessResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkWitnessSignaccessEx(request, headers, runtime);
  }

  /**
   * Description: 见证流程签署权限校验
   * Summary: 见证流程签署权限校验
   */
  async checkWitnessSignaccessEx(request: CheckWitnessSignaccessRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckWitnessSignaccessResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckWitnessSignaccessResponse>(await this.doRequest("1.0", "twc.notary.witness.signaccess.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckWitnessSignaccessResponse({}));
  }

  /**
   * Description: 见证流程签署
   * Summary: 见证流程签署
   */
  async authWitnessFlow(request: AuthWitnessFlowRequest): Promise<AuthWitnessFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authWitnessFlowEx(request, headers, runtime);
  }

  /**
   * Description: 见证流程签署
   * Summary: 见证流程签署
   */
  async authWitnessFlowEx(request: AuthWitnessFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthWitnessFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthWitnessFlowResponse>(await this.doRequest("1.0", "twc.notary.witness.flow.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthWitnessFlowResponse({}));
  }

  /**
   * Description: 见证流程签署确认
   * Summary: 见证流程签署确认
   */
  async confirmWitnessFlow(request: ConfirmWitnessFlowRequest): Promise<ConfirmWitnessFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmWitnessFlowEx(request, headers, runtime);
  }

  /**
   * Description: 见证流程签署确认
   * Summary: 见证流程签署确认
   */
  async confirmWitnessFlowEx(request: ConfirmWitnessFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmWitnessFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmWitnessFlowResponse>(await this.doRequest("1.0", "twc.notary.witness.flow.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmWitnessFlowResponse({}));
  }

  /**
   * Description: 获取存证事务ID
   * Summary: 获取存证事务ID
   */
  async createTrans(request: CreateTransRequest): Promise<CreateTransResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createTransEx(request, headers, runtime);
  }

  /**
   * Description: 获取存证事务ID
   * Summary: 获取存证事务ID
   */
  async createTransEx(request: CreateTransRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateTransResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTransResponse>(await this.doRequest("1.0", "twc.notary.trans.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateTransResponse({}));
  }

  /**
   * Description: 通过存证事务Token，获取事务中所有的存证信息
   * Summary: 获取事务中所有的存证信息
   */
  async getTrans(request: GetTransRequest): Promise<GetTransResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTransEx(request, headers, runtime);
  }

  /**
   * Description: 通过存证事务Token，获取事务中所有的存证信息
   * Summary: 获取事务中所有的存证信息
   */
  async getTransEx(request: GetTransRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTransResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTransResponse>(await this.doRequest("1.0", "twc.notary.trans.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTransResponse({}));
  }

  /**
   * Description: 发起文本存证，将文本内容存证上链
   * Summary: 文本存证，将文本内容存证上链
   */
  async createText(request: CreateTextRequest): Promise<CreateTextResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createTextEx(request, headers, runtime);
  }

  /**
   * Description: 发起文本存证，将文本内容存证上链
   * Summary: 文本存证，将文本内容存证上链
   */
  async createTextEx(request: CreateTextRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateTextResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTextResponse>(await this.doRequest("1.0", "twc.notary.text.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateTextResponse({}));
  }

  /**
   * Description: 用户通过交易哈希获取自己上传的文本存证内容
   * Summary: 获取文本存证内容
   */
  async getText(request: GetTextRequest): Promise<GetTextResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTextEx(request, headers, runtime);
  }

  /**
   * Description: 用户通过交易哈希获取自己上传的文本存证内容
   * Summary: 获取文本存证内容
   */
  async getTextEx(request: GetTextRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTextResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTextResponse>(await this.doRequest("1.0", "twc.notary.text.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTextResponse({}));
  }

  /**
   * Description: 发起文件存证，将文件内容存证上链
   * Summary: 文件内容存证上链
   */
  async createFile(request: CreateFileRequest): Promise<CreateFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createFileEx(request, headers, runtime);
  }

  /**
   * Description: 发起文件存证，将文件内容存证上链
   * Summary: 文件内容存证上链
   */
  async createFileEx(request: CreateFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateFileResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateFileResponse>(await this.doRequest("1.0", "twc.notary.file.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateFileResponse({}));
  }

  /**
   * Description: 用户通过交易哈希获取自己上传的文件存证oss下载地址
   * Summary: 获取文件存证oss下载地址
   */
  async getFile(request: GetFileRequest): Promise<GetFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getFileEx(request, headers, runtime);
  }

  /**
   * Description: 用户通过交易哈希获取自己上传的文件存证oss下载地址
   * Summary: 获取文件存证oss下载地址
   */
  async getFileEx(request: GetFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetFileResponse> {
    Util.validateModel(request);
    return $tea.cast<GetFileResponse>(await this.doRequest("1.0", "twc.notary.file.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetFileResponse({}));
  }

  /**
   * Description: 发起原文存证，将原文内容存证上链
   * Summary: 原文内容存证
   */
  async createSource(request: CreateSourceRequest): Promise<CreateSourceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSourceEx(request, headers, runtime);
  }

  /**
   * Description: 发起原文存证，将原文内容存证上链
   * Summary: 原文内容存证
   */
  async createSourceEx(request: CreateSourceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSourceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSourceResponse>(await this.doRequest("1.0", "twc.notary.source.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSourceResponse({}));
  }

  /**
   * Description: 用户通过交易哈希获取自己上传的原文存证oss下载地址
   * Summary: 获取原文存证oss下载地址
   */
  async getSource(request: GetSourceRequest): Promise<GetSourceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getSourceEx(request, headers, runtime);
  }

  /**
   * Description: 用户通过交易哈希获取自己上传的原文存证oss下载地址
   * Summary: 获取原文存证oss下载地址
   */
  async getSourceEx(request: GetSourceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetSourceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetSourceResponse>(await this.doRequest("1.0", "twc.notary.source.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetSourceResponse({}));
  }

  /**
   * Description: 创建存证后，使用存证凭据核验存证状态。
   * Summary: 存证内容核验
   */
  async checkStatus(request: CheckStatusRequest): Promise<CheckStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkStatusEx(request, headers, runtime);
  }

  /**
   * Description: 创建存证后，使用存证凭据核验存证状态。
   * Summary: 存证内容核验
   */
  async checkStatusEx(request: CheckStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckStatusResponse>(await this.doRequest("1.0", "twc.notary.status.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckStatusResponse({}));
  }

  /**
   * Description: 融资服务平台部署合约
   * Summary: 融资服务平台部署合约
   */
  async deployLeaseContract(request: DeployLeaseContractRequest): Promise<DeployLeaseContractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deployLeaseContractEx(request, headers, runtime);
  }

  /**
   * Description: 融资服务平台部署合约
   * Summary: 融资服务平台部署合约
   */
  async deployLeaseContractEx(request: DeployLeaseContractRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeployLeaseContractResponse> {
    Util.validateModel(request);
    return $tea.cast<DeployLeaseContractResponse>(await this.doRequest("1.0", "twc.notary.lease.contract.deploy", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeployLeaseContractResponse({}));
  }

  /**
   * Description: 租赁服务平台授权融资服务平台
   * Summary: 租赁服务平台授权融资服务平台
   */
  async authLeaseContract(request: AuthLeaseContractRequest): Promise<AuthLeaseContractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authLeaseContractEx(request, headers, runtime);
  }

  /**
   * Description: 租赁服务平台授权融资服务平台
   * Summary: 租赁服务平台授权融资服务平台
   */
  async authLeaseContractEx(request: AuthLeaseContractRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthLeaseContractResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthLeaseContractResponse>(await this.doRequest("1.0", "twc.notary.lease.contract.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthLeaseContractResponse({}));
  }

  /**
   * Description: 租赁服务平台上传用户信息
   * Summary: 租赁服务平台上传用户信息
   */
  async createLeaseUserinfo(request: CreateLeaseUserinfoRequest): Promise<CreateLeaseUserinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLeaseUserinfoEx(request, headers, runtime);
  }

  /**
   * Description: 租赁服务平台上传用户信息
   * Summary: 租赁服务平台上传用户信息
   */
  async createLeaseUserinfoEx(request: CreateLeaseUserinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLeaseUserinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLeaseUserinfoResponse>(await this.doRequest("1.0", "twc.notary.lease.userinfo.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLeaseUserinfoResponse({}));
  }

  /**
   * Description: 租赁服务平台上传订单产品/服务信息
   * Summary: 租赁服务平台上传订单产品/服务信息
   */
  async createLeaseOrderinfo(request: CreateLeaseOrderinfoRequest): Promise<CreateLeaseOrderinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLeaseOrderinfoEx(request, headers, runtime);
  }

  /**
   * Description: 租赁服务平台上传订单产品/服务信息
   * Summary: 租赁服务平台上传订单产品/服务信息
   */
  async createLeaseOrderinfoEx(request: CreateLeaseOrderinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLeaseOrderinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLeaseOrderinfoResponse>(await this.doRequest("1.0", "twc.notary.lease.orderinfo.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLeaseOrderinfoResponse({}));
  }

  /**
   * Description: 租赁服务平台上传承诺信息
   * Summary: 租赁服务平台上传承诺信息
   */
  async createLeasePromise(request: CreateLeasePromiseRequest): Promise<CreateLeasePromiseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLeasePromiseEx(request, headers, runtime);
  }

  /**
   * Description: 租赁服务平台上传承诺信息
   * Summary: 租赁服务平台上传承诺信息
   */
  async createLeasePromiseEx(request: CreateLeasePromiseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLeasePromiseResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLeasePromiseResponse>(await this.doRequest("1.0", "twc.notary.lease.promise.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLeasePromiseResponse({}));
  }

  /**
   * Description: 融资平台上传租赁物购买贷款订单信息
   * Summary: 融资平台上传租赁物购买贷款订单信息
   */
  async createLeaseVerifyinfo(request: CreateLeaseVerifyinfoRequest): Promise<CreateLeaseVerifyinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLeaseVerifyinfoEx(request, headers, runtime);
  }

  /**
   * Description: 融资平台上传租赁物购买贷款订单信息
   * Summary: 融资平台上传租赁物购买贷款订单信息
   */
  async createLeaseVerifyinfoEx(request: CreateLeaseVerifyinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLeaseVerifyinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLeaseVerifyinfoResponse>(await this.doRequest("1.0", "twc.notary.lease.verifyinfo.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLeaseVerifyinfoResponse({}));
  }

  /**
   * Description: 融资方上传承诺信息
   * Summary: 融资方上传承诺信息
   */
  async createLeaseCreditpromise(request: CreateLeaseCreditpromiseRequest): Promise<CreateLeaseCreditpromiseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLeaseCreditpromiseEx(request, headers, runtime);
  }

  /**
   * Description: 融资方上传承诺信息
   * Summary: 融资方上传承诺信息
   */
  async createLeaseCreditpromiseEx(request: CreateLeaseCreditpromiseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLeaseCreditpromiseResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLeaseCreditpromiseResponse>(await this.doRequest("1.0", "twc.notary.lease.creditpromise.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLeaseCreditpromiseResponse({}));
  }

  /**
   * Description: 租赁平台上传支用/还款信息
   * Summary: 租赁平台上传支用/还款信息
   */
  async createLeaseDisburseinfo(request: CreateLeaseDisburseinfoRequest): Promise<CreateLeaseDisburseinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLeaseDisburseinfoEx(request, headers, runtime);
  }

  /**
   * Description: 租赁平台上传支用/还款信息
   * Summary: 租赁平台上传支用/还款信息
   */
  async createLeaseDisburseinfoEx(request: CreateLeaseDisburseinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLeaseDisburseinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLeaseDisburseinfoResponse>(await this.doRequest("1.0", "twc.notary.lease.disburseinfo.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLeaseDisburseinfoResponse({}));
  }

  /**
   * Description:  查询订单详细信息
   * Summary:  查询订单详细信息
   */
  async queryLeaseOrderinfo(request: QueryLeaseOrderinfoRequest): Promise<QueryLeaseOrderinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLeaseOrderinfoEx(request, headers, runtime);
  }

  /**
   * Description:  查询订单详细信息
   * Summary:  查询订单详细信息
   */
  async queryLeaseOrderinfoEx(request: QueryLeaseOrderinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLeaseOrderinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLeaseOrderinfoResponse>(await this.doRequest("1.0", "twc.notary.lease.orderinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLeaseOrderinfoResponse({}));
  }

  /**
   * Description: 创建金融行业标准文本存证
   * Summary: 创建金融行业文本存证
   */
  async createFinanceTextnotary(request: CreateFinanceTextnotaryRequest): Promise<CreateFinanceTextnotaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createFinanceTextnotaryEx(request, headers, runtime);
  }

  /**
   * Description: 创建金融行业标准文本存证
   * Summary: 创建金融行业文本存证
   */
  async createFinanceTextnotaryEx(request: CreateFinanceTextnotaryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateFinanceTextnotaryResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateFinanceTextnotaryResponse>(await this.doRequest("1.0", "twc.notary.finance.textnotary.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateFinanceTextnotaryResponse({}));
  }

  /**
   * Description: 获取金融行业文本存证接口描述
   * Summary: 获取金融行业文本存证
   */
  async getFinanceTextnotary(request: GetFinanceTextnotaryRequest): Promise<GetFinanceTextnotaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getFinanceTextnotaryEx(request, headers, runtime);
  }

  /**
   * Description: 获取金融行业文本存证接口描述
   * Summary: 获取金融行业文本存证
   */
  async getFinanceTextnotaryEx(request: GetFinanceTextnotaryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetFinanceTextnotaryResponse> {
    Util.validateModel(request);
    return $tea.cast<GetFinanceTextnotaryResponse>(await this.doRequest("1.0", "twc.notary.finance.textnotary.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetFinanceTextnotaryResponse({}));
  }

  /**
   * Description: 创建金融行业文件存证接口描述
   * Summary: 创建金融行业文件存证
   */
  async createFinanceFilenotary(request: CreateFinanceFilenotaryRequest): Promise<CreateFinanceFilenotaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createFinanceFilenotaryEx(request, headers, runtime);
  }

  /**
   * Description: 创建金融行业文件存证接口描述
   * Summary: 创建金融行业文件存证
   */
  async createFinanceFilenotaryEx(request: CreateFinanceFilenotaryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateFinanceFilenotaryResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateFinanceFilenotaryResponse>(await this.doRequest("1.0", "twc.notary.finance.filenotary.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateFinanceFilenotaryResponse({}));
  }

  /**
   * Description: 获取金融行业文件存证接口描述
   * Summary: 获取金融行业文件存证
   */
  async getFinanceFilenotary(request: GetFinanceFilenotaryRequest): Promise<GetFinanceFilenotaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getFinanceFilenotaryEx(request, headers, runtime);
  }

  /**
   * Description: 获取金融行业文件存证接口描述
   * Summary: 获取金融行业文件存证
   */
  async getFinanceFilenotaryEx(request: GetFinanceFilenotaryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetFinanceFilenotaryResponse> {
    Util.validateModel(request);
    return $tea.cast<GetFinanceFilenotaryResponse>(await this.doRequest("1.0", "twc.notary.finance.filenotary.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetFinanceFilenotaryResponse({}));
  }

  /**
   * Description: 统一存证核验接口
   * Summary: 统一存证核验接口（已下架）
   */
  async checkIndustryNotary(request: CheckIndustryNotaryRequest): Promise<CheckIndustryNotaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkIndustryNotaryEx(request, headers, runtime);
  }

  /**
   * Description: 统一存证核验接口
   * Summary: 统一存证核验接口（已下架）
   */
  async checkIndustryNotaryEx(request: CheckIndustryNotaryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckIndustryNotaryResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckIndustryNotaryResponse>(await this.doRequest("1.0", "twc.notary.industry.notary.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckIndustryNotaryResponse({}));
  }

  /**
   * Description: 违约案件信息提交服务
   * Summary: 违约案件信息提交服务
   */
  async createSueBreakpromiseinfo(request: CreateSueBreakpromiseinfoRequest): Promise<CreateSueBreakpromiseinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSueBreakpromiseinfoEx(request, headers, runtime);
  }

  /**
   * Description: 违约案件信息提交服务
   * Summary: 违约案件信息提交服务
   */
  async createSueBreakpromiseinfoEx(request: CreateSueBreakpromiseinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSueBreakpromiseinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSueBreakpromiseinfoResponse>(await this.doRequest("1.0", "twc.notary.sue.breakpromiseinfo.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSueBreakpromiseinfoResponse({}));
  }

  /**
   * Description: 违约案件信息修改服务
   * Summary: 违约案件信息修改服务
   */
  async updateSueBreakpromiseinfo(request: UpdateSueBreakpromiseinfoRequest): Promise<UpdateSueBreakpromiseinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSueBreakpromiseinfoEx(request, headers, runtime);
  }

  /**
   * Description: 违约案件信息修改服务
   * Summary: 违约案件信息修改服务
   */
  async updateSueBreakpromiseinfoEx(request: UpdateSueBreakpromiseinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSueBreakpromiseinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSueBreakpromiseinfoResponse>(await this.doRequest("1.0", "twc.notary.sue.breakpromiseinfo.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSueBreakpromiseinfoResponse({}));
  }

  /**
   * Description: 违约案件信息删除服务
   * Summary: 违约案件信息删除服务
   */
  async deleteSueBreakpromiseinfo(request: DeleteSueBreakpromiseinfoRequest): Promise<DeleteSueBreakpromiseinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSueBreakpromiseinfoEx(request, headers, runtime);
  }

  /**
   * Description: 违约案件信息删除服务
   * Summary: 违约案件信息删除服务
   */
  async deleteSueBreakpromiseinfoEx(request: DeleteSueBreakpromiseinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSueBreakpromiseinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSueBreakpromiseinfoResponse>(await this.doRequest("1.0", "twc.notary.sue.breakpromiseinfo.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSueBreakpromiseinfoResponse({}));
  }

  /**
   * Description: 查询惩戒信息
   * Summary: 查询惩戒信息
   */
  async querySueUserinfo(request: QuerySueUserinfoRequest): Promise<QuerySueUserinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySueUserinfoEx(request, headers, runtime);
  }

  /**
   * Description: 查询惩戒信息
   * Summary: 查询惩戒信息
   */
  async querySueUserinfoEx(request: QuerySueUserinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySueUserinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySueUserinfoResponse>(await this.doRequest("1.0", "twc.notary.sue.userinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySueUserinfoResponse({}));
  }

  /**
   * Description: 升级用户管理合约
   * Summary: 升级用户管理合约
   */
  async updateSueExeplarycontract(request: UpdateSueExeplarycontractRequest): Promise<UpdateSueExeplarycontractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSueExeplarycontractEx(request, headers, runtime);
  }

  /**
   * Description: 升级用户管理合约
   * Summary: 升级用户管理合约
   */
  async updateSueExeplarycontractEx(request: UpdateSueExeplarycontractRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSueExeplarycontractResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSueExeplarycontractResponse>(await this.doRequest("1.0", "twc.notary.sue.exeplarycontract.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSueExeplarycontractResponse({}));
  }

  /**
   * Description: 回退用户管理合约
   * Summary: 回退用户管理合约
   */
  async updateSueExemplaryrevert(request: UpdateSueExemplaryrevertRequest): Promise<UpdateSueExemplaryrevertResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSueExemplaryrevertEx(request, headers, runtime);
  }

  /**
   * Description: 回退用户管理合约
   * Summary: 回退用户管理合约
   */
  async updateSueExemplaryrevertEx(request: UpdateSueExemplaryrevertRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSueExemplaryrevertResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSueExemplaryrevertResponse>(await this.doRequest("1.0", "twc.notary.sue.exemplaryrevert.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSueExemplaryrevertResponse({}));
  }

  /**
   * Description: 融资平台审核订单信息
   * Summary: 融资平台审核订单信息
   */
  async createLeaseAudit(request: CreateLeaseAuditRequest): Promise<CreateLeaseAuditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLeaseAuditEx(request, headers, runtime);
  }

  /**
   * Description: 融资平台审核订单信息
   * Summary: 融资平台审核订单信息
   */
  async createLeaseAuditEx(request: CreateLeaseAuditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLeaseAuditResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLeaseAuditResponse>(await this.doRequest("1.0", "twc.notary.lease.audit.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLeaseAuditResponse({}));
  }

  /**
   * Description: 租赁平台上传付款通知信息
   * Summary: 租赁平台上传付款通知信息
   */
  async createLeasePaymentfile(request: CreateLeasePaymentfileRequest): Promise<CreateLeasePaymentfileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLeasePaymentfileEx(request, headers, runtime);
  }

  /**
   * Description: 租赁平台上传付款通知信息
   * Summary: 租赁平台上传付款通知信息
   */
  async createLeasePaymentfileEx(request: CreateLeasePaymentfileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLeasePaymentfileResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLeasePaymentfileResponse>(await this.doRequest("1.0", "twc.notary.lease.paymentfile.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLeasePaymentfileResponse({}));
  }

  /**
   * Description: 租赁系统上传租金归还记录 分期调用
   * Summary: 租赁系统上传租金归还记录 分期调用
   */
  async createLeaseRental(request: CreateLeaseRentalRequest): Promise<CreateLeaseRentalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLeaseRentalEx(request, headers, runtime);
  }

  /**
   * Description: 租赁系统上传租金归还记录 分期调用
   * Summary: 租赁系统上传租金归还记录 分期调用
   */
  async createLeaseRentalEx(request: CreateLeaseRentalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLeaseRentalResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLeaseRentalResponse>(await this.doRequest("1.0", "twc.notary.lease.rental.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLeaseRentalResponse({}));
  }

  /**
   * Description: 清分服务机构上传资金清算记录，分期
   * Summary: 清分服务机构上传资金清算记录，分期
   */
  async createLeaseClearing(request: CreateLeaseClearingRequest): Promise<CreateLeaseClearingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLeaseClearingEx(request, headers, runtime);
  }

  /**
   * Description: 清分服务机构上传资金清算记录，分期
   * Summary: 清分服务机构上传资金清算记录，分期
   */
  async createLeaseClearingEx(request: CreateLeaseClearingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLeaseClearingResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLeaseClearingResponse>(await this.doRequest("1.0", "twc.notary.lease.clearing.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLeaseClearingResponse({}));
  }

  /**
   * Description: 融资金融机构上传还款信息 每期
   * Summary: 融资金融机构上传还款信息 每期
   */
  async createLeaseRepayment(request: CreateLeaseRepaymentRequest): Promise<CreateLeaseRepaymentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLeaseRepaymentEx(request, headers, runtime);
  }

  /**
   * Description: 融资金融机构上传还款信息 每期
   * Summary: 融资金融机构上传还款信息 每期
   */
  async createLeaseRepaymentEx(request: CreateLeaseRepaymentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLeaseRepaymentResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLeaseRepaymentResponse>(await this.doRequest("1.0", "twc.notary.lease.repayment.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLeaseRepaymentResponse({}));
  }

  /**
   * Description: 融资租赁通知系统注册
   * Summary: 融资租赁通知系统注册
   */
  async createLeaseNotifyregister(request: CreateLeaseNotifyregisterRequest): Promise<CreateLeaseNotifyregisterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLeaseNotifyregisterEx(request, headers, runtime);
  }

  /**
   * Description: 融资租赁通知系统注册
   * Summary: 融资租赁通知系统注册
   */
  async createLeaseNotifyregisterEx(request: CreateLeaseNotifyregisterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLeaseNotifyregisterResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLeaseNotifyregisterResponse>(await this.doRequest("1.0", "twc.notary.lease.notifyregister.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLeaseNotifyregisterResponse({}));
  }

  /**
   * Description: 根据imeiID查询iot设备的详情
   * Summary: 根据imeiID查询iot设备的详情
   */
  async queryLeaseIotinfo(request: QueryLeaseIotinfoRequest): Promise<QueryLeaseIotinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLeaseIotinfoEx(request, headers, runtime);
  }

  /**
   * Description: 根据imeiID查询iot设备的详情
   * Summary: 根据imeiID查询iot设备的详情
   */
  async queryLeaseIotinfoEx(request: QueryLeaseIotinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLeaseIotinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLeaseIotinfoResponse>(await this.doRequest("1.0", "twc.notary.lease.iotinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLeaseIotinfoResponse({}));
  }

  /**
   * Description: 创建法院通用文本存证
   * Summary: 法院通用文本存证创建接口
   */
  async createCourtTextnotary(request: CreateCourtTextnotaryRequest): Promise<CreateCourtTextnotaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCourtTextnotaryEx(request, headers, runtime);
  }

  /**
   * Description: 创建法院通用文本存证
   * Summary: 法院通用文本存证创建接口
   */
  async createCourtTextnotaryEx(request: CreateCourtTextnotaryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCourtTextnotaryResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCourtTextnotaryResponse>(await this.doRequest("1.0", "twc.notary.court.textnotary.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCourtTextnotaryResponse({}));
  }

  /**
   * Description: 获取法院通用文本存证
   * Summary: 法院通用文本存证获取接口
   */
  async getCourtTextnotary(request: GetCourtTextnotaryRequest): Promise<GetCourtTextnotaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getCourtTextnotaryEx(request, headers, runtime);
  }

  /**
   * Description: 获取法院通用文本存证
   * Summary: 法院通用文本存证获取接口
   */
  async getCourtTextnotaryEx(request: GetCourtTextnotaryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetCourtTextnotaryResponse> {
    Util.validateModel(request);
    return $tea.cast<GetCourtTextnotaryResponse>(await this.doRequest("1.0", "twc.notary.court.textnotary.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetCourtTextnotaryResponse({}));
  }

  /**
   * Description: 创建法院通用文件存证接口
   * Summary: 法院通用文件存证创建接口
   */
  async createCourtFilenotary(request: CreateCourtFilenotaryRequest): Promise<CreateCourtFilenotaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCourtFilenotaryEx(request, headers, runtime);
  }

  /**
   * Description: 创建法院通用文件存证接口
   * Summary: 法院通用文件存证创建接口
   */
  async createCourtFilenotaryEx(request: CreateCourtFilenotaryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCourtFilenotaryResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCourtFilenotaryResponse>(await this.doRequest("1.0", "twc.notary.court.filenotary.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCourtFilenotaryResponse({}));
  }

  /**
   * Description: 获取法院通用文件存证
   * Summary: 法院通用文件存证获取接口
   */
  async getCourtFilenotary(request: GetCourtFilenotaryRequest): Promise<GetCourtFilenotaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getCourtFilenotaryEx(request, headers, runtime);
  }

  /**
   * Description: 获取法院通用文件存证
   * Summary: 法院通用文件存证获取接口
   */
  async getCourtFilenotaryEx(request: GetCourtFilenotaryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetCourtFilenotaryResponse> {
    Util.validateModel(request);
    return $tea.cast<GetCourtFilenotaryResponse>(await this.doRequest("1.0", "twc.notary.court.filenotary.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetCourtFilenotaryResponse({}));
  }

  /**
   * Description: 融资租赁定制化统一入口
   * Summary: 融资租赁定制化统一入口
   */
  async createLeaseRoute(request: CreateLeaseRouteRequest): Promise<CreateLeaseRouteResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLeaseRouteEx(request, headers, runtime);
  }

  /**
   * Description: 融资租赁定制化统一入口
   * Summary: 融资租赁定制化统一入口
   */
  async createLeaseRouteEx(request: CreateLeaseRouteRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLeaseRouteResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLeaseRouteResponse>(await this.doRequest("1.0", "twc.notary.lease.route.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLeaseRouteResponse({}));
  }

  /**
   * Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密
   * Summary: 查询用户等加密信息
   */
  async queryLeaseEncryptedinfo(request: QueryLeaseEncryptedinfoRequest): Promise<QueryLeaseEncryptedinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLeaseEncryptedinfoEx(request, headers, runtime);
  }

  /**
   * Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密
   * Summary: 查询用户等加密信息
   */
  async queryLeaseEncryptedinfoEx(request: QueryLeaseEncryptedinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLeaseEncryptedinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLeaseEncryptedinfoResponse>(await this.doRequest("1.0", "twc.notary.lease.encryptedinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLeaseEncryptedinfoResponse({}));
  }

  /**
   * Description: 电子合同文本存证
   * Summary: 电子合同文本存证
   */
  async createContractText(request: CreateContractTextRequest): Promise<CreateContractTextResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createContractTextEx(request, headers, runtime);
  }

  /**
   * Description: 电子合同文本存证
   * Summary: 电子合同文本存证
   */
  async createContractTextEx(request: CreateContractTextRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateContractTextResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateContractTextResponse>(await this.doRequest("1.0", "twc.notary.contract.text.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateContractTextResponse({}));
  }

  /**
   * Description: 全流程存证后，批量提交全流程核验信息，申请出证报告授权码。成功后可生成全流程上链报告
   * Summary: 申请电子合同存证报告
   */
  async applyContractReport(request: ApplyContractReportRequest): Promise<ApplyContractReportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyContractReportEx(request, headers, runtime);
  }

  /**
   * Description: 全流程存证后，批量提交全流程核验信息，申请出证报告授权码。成功后可生成全流程上链报告
   * Summary: 申请电子合同存证报告
   */
  async applyContractReportEx(request: ApplyContractReportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyContractReportResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyContractReportResponse>(await this.doRequest("1.0", "twc.notary.contract.report.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyContractReportResponse({}));
  }

  /**
   * Description: 下载合同存证某个环节的内容，得到存证信息对象最终上链的JSON序列化形式，该内容可用于统一核验
   * Summary: 下载合同存证
   */
  async getContractText(request: GetContractTextRequest): Promise<GetContractTextResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getContractTextEx(request, headers, runtime);
  }

  /**
   * Description: 下载合同存证某个环节的内容，得到存证信息对象最终上链的JSON序列化形式，该内容可用于统一核验
   * Summary: 下载合同存证
   */
  async getContractTextEx(request: GetContractTextRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetContractTextResponse> {
    Util.validateModel(request);
    return $tea.cast<GetContractTextResponse>(await this.doRequest("1.0", "twc.notary.contract.text.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetContractTextResponse({}));
  }

  /**
   * Description: 获取存证事务ID内部接口
   * Summary: 获取存证事务ID内部接口
   */
  async createInternalTrans(request: CreateInternalTransRequest): Promise<CreateInternalTransResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createInternalTransEx(request, headers, runtime);
  }

  /**
   * Description: 获取存证事务ID内部接口
   * Summary: 获取存证事务ID内部接口
   */
  async createInternalTransEx(request: CreateInternalTransRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateInternalTransResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateInternalTransResponse>(await this.doRequest("1.0", "twc.notary.internal.trans.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateInternalTransResponse({}));
  }

  /**
   * Description: 文本存证内部接口，将文本内容存证上链
   * Summary: 文本存证内部接口，将文本内容存证上链
   */
  async createInternalText(request: CreateInternalTextRequest): Promise<CreateInternalTextResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createInternalTextEx(request, headers, runtime);
  }

  /**
   * Description: 文本存证内部接口，将文本内容存证上链
   * Summary: 文本存证内部接口，将文本内容存证上链
   */
  async createInternalTextEx(request: CreateInternalTextRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateInternalTextResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateInternalTextResponse>(await this.doRequest("1.0", "twc.notary.internal.text.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateInternalTextResponse({}));
  }

  /**
   * Description: 发起文本存证，将文本内容存证上链，租赁业务专用。
   * Summary: 租赁业务文本存证，将文本内容存证上链
   */
  async createLeaseText(request: CreateLeaseTextRequest): Promise<CreateLeaseTextResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLeaseTextEx(request, headers, runtime);
  }

  /**
   * Description: 发起文本存证，将文本内容存证上链，租赁业务专用。
   * Summary: 租赁业务文本存证，将文本内容存证上链
   */
  async createLeaseTextEx(request: CreateLeaseTextRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLeaseTextResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLeaseTextResponse>(await this.doRequest("1.0", "twc.notary.lease.text.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLeaseTextResponse({}));
  }

  /**
   * Description: 发起文件存证，将文件内容存证上链，租赁业务专用。
   * Summary: 租赁业务文件内容存证上链
   */
  async createLeaseFile(request: CreateLeaseFileRequest): Promise<CreateLeaseFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLeaseFileEx(request, headers, runtime);
  }

  /**
   * Description: 发起文件存证，将文件内容存证上链，租赁业务专用。
   * Summary: 租赁业务文件内容存证上链
   */
  async createLeaseFileEx(request: CreateLeaseFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLeaseFileResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLeaseFileResponse>(await this.doRequest("1.0", "twc.notary.lease.file.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLeaseFileResponse({}));
  }

  /**
   * Description: 使用接口查询订单存证的信息，需要在完成订单回传后才可返回。获取到txhash后，用户可使用 获取文本存证、存证核验 等存证服务功能。
   * Summary: 租赁业务获取订单存证列表
   */
  async listLeaseNotary(request: ListLeaseNotaryRequest): Promise<ListLeaseNotaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listLeaseNotaryEx(request, headers, runtime);
  }

  /**
   * Description: 使用接口查询订单存证的信息，需要在完成订单回传后才可返回。获取到txhash后，用户可使用 获取文本存证、存证核验 等存证服务功能。
   * Summary: 租赁业务获取订单存证列表
   */
  async listLeaseNotaryEx(request: ListLeaseNotaryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListLeaseNotaryResponse> {
    Util.validateModel(request);
    return $tea.cast<ListLeaseNotaryResponse>(await this.doRequest("1.0", "twc.notary.lease.notary.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListLeaseNotaryResponse({}));
  }

  /**
   * Description: 查询融资租赁application
   * Summary: 查询融资租赁application
   */
  async queryLeaseApplication(request: QueryLeaseApplicationRequest): Promise<QueryLeaseApplicationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLeaseApplicationEx(request, headers, runtime);
  }

  /**
   * Description: 查询融资租赁application
   * Summary: 查询融资租赁application
   */
  async queryLeaseApplicationEx(request: QueryLeaseApplicationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLeaseApplicationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLeaseApplicationResponse>(await this.doRequest("1.0", "twc.notary.lease.application.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLeaseApplicationResponse({}));
  }

  /**
   * Description: 查询融资租赁application的定义详情
   * Summary: 查询application的定义详情
   */
  async queryLeaseApplicationdetailinfo(request: QueryLeaseApplicationdetailinfoRequest): Promise<QueryLeaseApplicationdetailinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLeaseApplicationdetailinfoEx(request, headers, runtime);
  }

  /**
   * Description: 查询融资租赁application的定义详情
   * Summary: 查询application的定义详情
   */
  async queryLeaseApplicationdetailinfoEx(request: QueryLeaseApplicationdetailinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLeaseApplicationdetailinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLeaseApplicationdetailinfoResponse>(await this.doRequest("1.0", "twc.notary.lease.applicationdetailinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLeaseApplicationdetailinfoResponse({}));
  }

  /**
   * Description: 融资租赁资方重置订单状态
   * Summary: 融资租赁资方重置订单状态
   */
  async setLeaseRepaymentstatus(request: SetLeaseRepaymentstatusRequest): Promise<SetLeaseRepaymentstatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setLeaseRepaymentstatusEx(request, headers, runtime);
  }

  /**
   * Description: 融资租赁资方重置订单状态
   * Summary: 融资租赁资方重置订单状态
   */
  async setLeaseRepaymentstatusEx(request: SetLeaseRepaymentstatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetLeaseRepaymentstatusResponse> {
    Util.validateModel(request);
    return $tea.cast<SetLeaseRepaymentstatusResponse>(await this.doRequest("1.0", "twc.notary.lease.repaymentstatus.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetLeaseRepaymentstatusResponse({}));
  }

  /**
   * Description: 供应商上传采购等相关信息
   * Summary: 供应商上传采购等相关信息
   */
  async createLeaseSupplierinfo(request: CreateLeaseSupplierinfoRequest): Promise<CreateLeaseSupplierinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLeaseSupplierinfoEx(request, headers, runtime);
  }

  /**
   * Description: 供应商上传采购等相关信息
   * Summary: 供应商上传采购等相关信息
   */
  async createLeaseSupplierinfoEx(request: CreateLeaseSupplierinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLeaseSupplierinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLeaseSupplierinfoResponse>(await this.doRequest("1.0", "twc.notary.lease.supplierinfo.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLeaseSupplierinfoResponse({}));
  }

  /**
   * Description: mytf的tapp部署
   * Summary: mytf的tapp部署
   */
  async deployMytfTapp(request: DeployMytfTappRequest): Promise<DeployMytfTappResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deployMytfTappEx(request, headers, runtime);
  }

  /**
   * Description: mytf的tapp部署
   * Summary: mytf的tapp部署
   */
  async deployMytfTappEx(request: DeployMytfTappRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeployMytfTappResponse> {
    Util.validateModel(request);
    return $tea.cast<DeployMytfTappResponse>(await this.doRequest("1.0", "twc.notary.mytf.tapp.deploy", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeployMytfTappResponse({}));
  }

  /**
   * Description: 供应商更新物流状态、签收记录等信息
   * Summary: 供应商更新物流状态、签收记录等信息
   */
  async createLeaseSupplierdynamicinfo(request: CreateLeaseSupplierdynamicinfoRequest): Promise<CreateLeaseSupplierdynamicinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLeaseSupplierdynamicinfoEx(request, headers, runtime);
  }

  /**
   * Description: 供应商更新物流状态、签收记录等信息
   * Summary: 供应商更新物流状态、签收记录等信息
   */
  async createLeaseSupplierdynamicinfoEx(request: CreateLeaseSupplierdynamicinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLeaseSupplierdynamicinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLeaseSupplierdynamicinfoResponse>(await this.doRequest("1.0", "twc.notary.lease.supplierdynamicinfo.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLeaseSupplierdynamicinfoResponse({}));
  }

  /**
   * Description: 创建租赁订单相关信息，融资租赁的前置条件
   * Summary: 创建租赁订单相关信息，融资租赁的前置条件
   */
  async createLeaseBiz(request: CreateLeaseBizRequest): Promise<CreateLeaseBizResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLeaseBizEx(request, headers, runtime);
  }

  /**
   * Description: 创建租赁订单相关信息，融资租赁的前置条件
   * Summary: 创建租赁订单相关信息，融资租赁的前置条件
   */
  async createLeaseBizEx(request: CreateLeaseBizRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLeaseBizResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLeaseBizResponse>(await this.doRequest("1.0", "twc.notary.lease.biz.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLeaseBizResponse({}));
  }

  /**
   * Description: 查询核验结果
   * Summary: 查询核验结果
   */
  async queryLeaseProof(request: QueryLeaseProofRequest): Promise<QueryLeaseProofResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLeaseProofEx(request, headers, runtime);
  }

  /**
   * Description: 查询核验结果
   * Summary: 查询核验结果
   */
  async queryLeaseProofEx(request: QueryLeaseProofRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLeaseProofResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLeaseProofResponse>(await this.doRequest("1.0", "twc.notary.lease.proof.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLeaseProofResponse({}));
  }

  /**
   * Description: 发起文件存证，将文件内容存证上链，可存证10M以内的文件
   * Summary: 大文件内容存证接口
   */
  async createLargefile(request: CreateLargefileRequest): Promise<CreateLargefileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLargefileEx(request, headers, runtime);
  }

  /**
   * Description: 发起文件存证，将文件内容存证上链，可存证10M以内的文件
   * Summary: 大文件内容存证接口
   */
  async createLargefileEx(request: CreateLargefileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLargefileResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLargefileResponse>(await this.doRequest("1.0", "twc.notary.largefile.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLargefileResponse({}));
  }

  /**
   * Description: 租赁平台查询接口
   * Summary: 租赁平台查询接口
   */
  async queryLeaseBiz(request: QueryLeaseBizRequest): Promise<QueryLeaseBizResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLeaseBizEx(request, headers, runtime);
  }

  /**
   * Description: 租赁平台查询接口
   * Summary: 租赁平台查询接口
   */
  async queryLeaseBizEx(request: QueryLeaseBizRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLeaseBizResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLeaseBizResponse>(await this.doRequest("1.0", "twc.notary.lease.biz.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLeaseBizResponse({}));
  }

  /**
   * Description: 租赁宝哈希存证
   * Summary: 租赁宝哈希存证
   */
  async createLeaseBiznotary(request: CreateLeaseBiznotaryRequest): Promise<CreateLeaseBiznotaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLeaseBiznotaryEx(request, headers, runtime);
  }

  /**
   * Description: 租赁宝哈希存证
   * Summary: 租赁宝哈希存证
   */
  async createLeaseBiznotaryEx(request: CreateLeaseBiznotaryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLeaseBiznotaryResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLeaseBiznotaryResponse>(await this.doRequest("1.0", "twc.notary.lease.biznotary.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLeaseBiznotaryResponse({}));
  }

  /**
   * Description: 合同内部文本存证
   * Summary: 合同内部文本存证
   */
  async createInternalContract(request: CreateInternalContractRequest): Promise<CreateInternalContractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createInternalContractEx(request, headers, runtime);
  }

  /**
   * Description: 合同内部文本存证
   * Summary: 合同内部文本存证
   */
  async createInternalContractEx(request: CreateInternalContractRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateInternalContractResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateInternalContractResponse>(await this.doRequest("1.0", "twc.notary.internal.contract.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateInternalContractResponse({}));
  }

  /**
   * Description: 资方上传网商直付通代扣协议核验结果
   * Summary: 资方上传网商直付通代扣协议核验结果
   */
  async createLeaseZftagreementsign(request: CreateLeaseZftagreementsignRequest): Promise<CreateLeaseZftagreementsignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLeaseZftagreementsignEx(request, headers, runtime);
  }

  /**
   * Description: 资方上传网商直付通代扣协议核验结果
   * Summary: 资方上传网商直付通代扣协议核验结果
   */
  async createLeaseZftagreementsignEx(request: CreateLeaseZftagreementsignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLeaseZftagreementsignResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLeaseZftagreementsignResponse>(await this.doRequest("1.0", "twc.notary.lease.zftagreementsign.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLeaseZftagreementsignResponse({}));
  }

  /**
   * Description: 资方上传网商直付通代扣协议解约相关信息
   * Summary: 资方上传网商直付通代扣协议解约相关信息
   */
  async createLeaseZftagreementunsign(request: CreateLeaseZftagreementunsignRequest): Promise<CreateLeaseZftagreementunsignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLeaseZftagreementunsignEx(request, headers, runtime);
  }

  /**
   * Description: 资方上传网商直付通代扣协议解约相关信息
   * Summary: 资方上传网商直付通代扣协议解约相关信息
   */
  async createLeaseZftagreementunsignEx(request: CreateLeaseZftagreementunsignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLeaseZftagreementunsignResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLeaseZftagreementunsignResponse>(await this.doRequest("1.0", "twc.notary.lease.zftagreementunsign.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLeaseZftagreementunsignResponse({}));
  }

  /**
   * Description: 获取蚂蚁链版存证证明
   * Summary: 获取蚂蚁链版存证证明
   */
  async getCertificateDetail(request: GetCertificateDetailRequest): Promise<GetCertificateDetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getCertificateDetailEx(request, headers, runtime);
  }

  /**
   * Description: 获取蚂蚁链版存证证明
   * Summary: 获取蚂蚁链版存证证明
   */
  async getCertificateDetailEx(request: GetCertificateDetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetCertificateDetailResponse> {
    Util.validateModel(request);
    return $tea.cast<GetCertificateDetailResponse>(await this.doRequest("1.0", "twc.notary.certificate.detail.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetCertificateDetailResponse({}));
  }

  /**
   * Description: 用户通过交易哈希获取自己上传的文本存证内容
   * Summary: 获取文本存证内容
   */
  async getInternalText(request: GetInternalTextRequest): Promise<GetInternalTextResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getInternalTextEx(request, headers, runtime);
  }

  /**
   * Description: 用户通过交易哈希获取自己上传的文本存证内容
   * Summary: 获取文本存证内容
   */
  async getInternalTextEx(request: GetInternalTextRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetInternalTextResponse> {
    Util.validateModel(request);
    return $tea.cast<GetInternalTextResponse>(await this.doRequest("1.0", "twc.notary.internal.text.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetInternalTextResponse({}));
  }

  /**
   * Description: 三方服务获取开通权限，标记开通状态。
   * Summary: 三方服务获取开通权限，标记开通状态。
   */
  async openInternalTwc(request: OpenInternalTwcRequest): Promise<OpenInternalTwcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.openInternalTwcEx(request, headers, runtime);
  }

  /**
   * Description: 三方服务获取开通权限，标记开通状态。
   * Summary: 三方服务获取开通权限，标记开通状态。
   */
  async openInternalTwcEx(request: OpenInternalTwcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OpenInternalTwcResponse> {
    Util.validateModel(request);
    return $tea.cast<OpenInternalTwcResponse>(await this.doRequest("1.0", "twc.notary.internal.twc.open", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OpenInternalTwcResponse({}));
  }

  /**
   * Description: 指定节点获取存证事务Id
   * Summary: 指定节点获取存证事务id
   */
  async createSpecifyTrans(request: CreateSpecifyTransRequest): Promise<CreateSpecifyTransResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSpecifyTransEx(request, headers, runtime);
  }

  /**
   * Description: 指定节点获取存证事务Id
   * Summary: 指定节点获取存证事务id
   */
  async createSpecifyTransEx(request: CreateSpecifyTransRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSpecifyTransResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSpecifyTransResponse>(await this.doRequest("1.0", "twc.notary.specify.trans.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSpecifyTransResponse({}));
  }

  /**
   * Description: 指定节点文本存证
   * Summary: 指定节点文本存证
   */
  async createSpecifyText(request: CreateSpecifyTextRequest): Promise<CreateSpecifyTextResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSpecifyTextEx(request, headers, runtime);
  }

  /**
   * Description: 指定节点文本存证
   * Summary: 指定节点文本存证
   */
  async createSpecifyTextEx(request: CreateSpecifyTextRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSpecifyTextResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSpecifyTextResponse>(await this.doRequest("1.0", "twc.notary.specify.text.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSpecifyTextResponse({}));
  }

  /**
   * Description: 文件存证大租户内部接口
   * Summary: 文件存证内部接口
   */
  async createInternalFile(request: CreateInternalFileRequest): Promise<CreateInternalFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createInternalFileEx(request, headers, runtime);
  }

  /**
   * Description: 文件存证大租户内部接口
   * Summary: 文件存证内部接口
   */
  async createInternalFileEx(request: CreateInternalFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateInternalFileResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateInternalFileResponse>(await this.doRequest("1.0", "twc.notary.internal.file.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateInternalFileResponse({}));
  }

  /**
   * Description: 获取文件存证内容内部接口
   * Summary: 获取文件存证内容内部接口
   */
  async getInternalFile(request: GetInternalFileRequest): Promise<GetInternalFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getInternalFileEx(request, headers, runtime);
  }

  /**
   * Description: 获取文件存证内容内部接口
   * Summary: 获取文件存证内容内部接口
   */
  async getInternalFileEx(request: GetInternalFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetInternalFileResponse> {
    Util.validateModel(request);
    return $tea.cast<GetInternalFileResponse>(await this.doRequest("1.0", "twc.notary.internal.file.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetInternalFileResponse({}));
  }

  /**
   * Description: 创建存证流程实例
   * Summary: 创建存证流程实例
   */
  async createFlowInstance(request: CreateFlowInstanceRequest): Promise<CreateFlowInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createFlowInstanceEx(request, headers, runtime);
  }

  /**
   * Description: 创建存证流程实例
   * Summary: 创建存证流程实例
   */
  async createFlowInstanceEx(request: CreateFlowInstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateFlowInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateFlowInstanceResponse>(await this.doRequest("1.0", "twc.notary.flow.instance.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateFlowInstanceResponse({}));
  }

  /**
   * Description: 存证流程实例完结
   * Summary: 存证流程实例完结
   */
  async finishFlowInstance(request: FinishFlowInstanceRequest): Promise<FinishFlowInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.finishFlowInstanceEx(request, headers, runtime);
  }

  /**
   * Description: 存证流程实例完结
   * Summary: 存证流程实例完结
   */
  async finishFlowInstanceEx(request: FinishFlowInstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<FinishFlowInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<FinishFlowInstanceResponse>(await this.doRequest("1.0", "twc.notary.flow.instance.finish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new FinishFlowInstanceResponse({}));
  }

  /**
   * Description: 创建阶段存证
   * Summary: 创建阶段存证
   */
  async initFlowPhase(request: InitFlowPhaseRequest): Promise<InitFlowPhaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initFlowPhaseEx(request, headers, runtime);
  }

  /**
   * Description: 创建阶段存证
   * Summary: 创建阶段存证
   */
  async initFlowPhaseEx(request: InitFlowPhaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitFlowPhaseResponse> {
    Util.validateModel(request);
    return $tea.cast<InitFlowPhaseResponse>(await this.doRequest("1.0", "twc.notary.flow.phase.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitFlowPhaseResponse({}));
  }

  /**
   * Description: 查询阶段存证结果
   * Summary: 查询阶段存证结果
   */
  async queryFlowPhase(request: QueryFlowPhaseRequest): Promise<QueryFlowPhaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFlowPhaseEx(request, headers, runtime);
  }

  /**
   * Description: 查询阶段存证结果
   * Summary: 查询阶段存证结果
   */
  async queryFlowPhaseEx(request: QueryFlowPhaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFlowPhaseResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFlowPhaseResponse>(await this.doRequest("1.0", "twc.notary.flow.phase.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFlowPhaseResponse({}));
  }

  /**
   * Description: 阶段存证数据详情
   * Summary: 阶段存证数据详情
   */
  async detailFlowPhase(request: DetailFlowPhaseRequest): Promise<DetailFlowPhaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailFlowPhaseEx(request, headers, runtime);
  }

  /**
   * Description: 阶段存证数据详情
   * Summary: 阶段存证数据详情
   */
  async detailFlowPhaseEx(request: DetailFlowPhaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailFlowPhaseResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailFlowPhaseResponse>(await this.doRequest("1.0", "twc.notary.flow.phase.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailFlowPhaseResponse({}));
  }

  /**
   * Description: 一键创建全流程存证实例和阶段存证
   * Summary: 一键创建全流程存证实例和阶段存证
   */
  async createFlowOnestepnotary(request: CreateFlowOnestepnotaryRequest): Promise<CreateFlowOnestepnotaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createFlowOnestepnotaryEx(request, headers, runtime);
  }

  /**
   * Description: 一键创建全流程存证实例和阶段存证
   * Summary: 一键创建全流程存证实例和阶段存证
   */
  async createFlowOnestepnotaryEx(request: CreateFlowOnestepnotaryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateFlowOnestepnotaryResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateFlowOnestepnotaryResponse>(await this.doRequest("1.0", "twc.notary.flow.onestepnotary.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateFlowOnestepnotaryResponse({}));
  }

  /**
   * Description: 查询一键创建全流程存证进度状态
   * Summary: 查询一键创建全流程存证进度状态
   */
  async queryFlowOnestepnotary(request: QueryFlowOnestepnotaryRequest): Promise<QueryFlowOnestepnotaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFlowOnestepnotaryEx(request, headers, runtime);
  }

  /**
   * Description: 查询一键创建全流程存证进度状态
   * Summary: 查询一键创建全流程存证进度状态
   */
  async queryFlowOnestepnotaryEx(request: QueryFlowOnestepnotaryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFlowOnestepnotaryResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFlowOnestepnotaryResponse>(await this.doRequest("1.0", "twc.notary.flow.onestepnotary.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFlowOnestepnotaryResponse({}));
  }

  /**
   * Description: 存证全流程证明申请
   * Summary: 存证全流程证明申请
   */
  async applyFlowCertificate(request: ApplyFlowCertificateRequest): Promise<ApplyFlowCertificateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyFlowCertificateEx(request, headers, runtime);
  }

  /**
   * Description: 存证全流程证明申请
   * Summary: 存证全流程证明申请
   */
  async applyFlowCertificateEx(request: ApplyFlowCertificateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyFlowCertificateResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyFlowCertificateResponse>(await this.doRequest("1.0", "twc.notary.flow.certificate.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyFlowCertificateResponse({}));
  }

  /**
   * Description: 存证全流程证明出证进度查询
   * Summary: 存证全流程证明出证进度查询
   */
  async queryFlowCertificate(request: QueryFlowCertificateRequest): Promise<QueryFlowCertificateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFlowCertificateEx(request, headers, runtime);
  }

  /**
   * Description: 存证全流程证明出证进度查询
   * Summary: 存证全流程证明出证进度查询
   */
  async queryFlowCertificateEx(request: QueryFlowCertificateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFlowCertificateResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFlowCertificateResponse>(await this.doRequest("1.0", "twc.notary.flow.certificate.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFlowCertificateResponse({}));
  }

  /**
   * Description: 数字票根全流程出证申请
   * Summary: 数字票根全流程出证申请
   */
  async applyStubCertificate(request: ApplyStubCertificateRequest): Promise<ApplyStubCertificateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyStubCertificateEx(request, headers, runtime);
  }

  /**
   * Description: 数字票根全流程出证申请
   * Summary: 数字票根全流程出证申请
   */
  async applyStubCertificateEx(request: ApplyStubCertificateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyStubCertificateResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyStubCertificateResponse>(await this.doRequest("1.0", "twc.notary.stub.certificate.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyStubCertificateResponse({}));
  }

  /**
   * Description: 数字票根全流程证明出证进度查询
   * Summary: 数字票根全流程证明出证进度查询
   */
  async queryStubCertificate(request: QueryStubCertificateRequest): Promise<QueryStubCertificateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryStubCertificateEx(request, headers, runtime);
  }

  /**
   * Description: 数字票根全流程证明出证进度查询
   * Summary: 数字票根全流程证明出证进度查询
   */
  async queryStubCertificateEx(request: QueryStubCertificateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryStubCertificateResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryStubCertificateResponse>(await this.doRequest("1.0", "twc.notary.stub.certificate.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryStubCertificateResponse({}));
  }

  /**
   * Description: 数字票根全流程存证进度查询
   * Summary: 数字票根全流程存证进度查询
   */
  async queryStub(request: QueryStubRequest): Promise<QueryStubResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryStubEx(request, headers, runtime);
  }

  /**
   * Description: 数字票根全流程存证进度查询
   * Summary: 数字票根全流程存证进度查询
   */
  async queryStubEx(request: QueryStubRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryStubResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryStubResponse>(await this.doRequest("1.0", "twc.notary.stub.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryStubResponse({}));
  }

  /**
   * Description: 数字票根全流程存证创建
   * Summary: 数字票根全流程存证创建
   */
  async createStub(request: CreateStubRequest): Promise<CreateStubResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createStubEx(request, headers, runtime);
  }

  /**
   * Description: 数字票根全流程存证创建
   * Summary: 数字票根全流程存证创建
   */
  async createStubEx(request: CreateStubRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateStubResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateStubResponse>(await this.doRequest("1.0", "twc.notary.stub.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateStubResponse({}));
  }

  /**
   * Description: 查询数字票根是否存在
   * Summary: 查询数字票根是否存在
   */
  async existStub(request: ExistStubRequest): Promise<ExistStubResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.existStubEx(request, headers, runtime);
  }

  /**
   * Description: 查询数字票根是否存在
   * Summary: 查询数字票根是否存在
   */
  async existStubEx(request: ExistStubRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExistStubResponse> {
    Util.validateModel(request);
    return $tea.cast<ExistStubResponse>(await this.doRequest("1.0", "twc.notary.stub.exist", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExistStubResponse({}));
  }

  /**
   * Description: 数字票根-清分接口
   * Summary: 数字票根-清分接口
   */
  async createStubClearing(request: CreateStubClearingRequest): Promise<CreateStubClearingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createStubClearingEx(request, headers, runtime);
  }

  /**
   * Description: 数字票根-清分接口
   * Summary: 数字票根-清分接口
   */
  async createStubClearingEx(request: CreateStubClearingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateStubClearingResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateStubClearingResponse>(await this.doRequest("1.0", "twc.notary.stub.clearing.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateStubClearingResponse({}));
  }

  /**
   * Description: 申请全流程证据包，包括链上证据包和链下证据包
   * Summary: 申请全流程证据包
   */
  async applyFlowEvidence(request: ApplyFlowEvidenceRequest): Promise<ApplyFlowEvidenceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyFlowEvidenceEx(request, headers, runtime);
  }

  /**
   * Description: 申请全流程证据包，包括链上证据包和链下证据包
   * Summary: 申请全流程证据包
   */
  async applyFlowEvidenceEx(request: ApplyFlowEvidenceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyFlowEvidenceResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyFlowEvidenceResponse>(await this.doRequest("1.0", "twc.notary.flow.evidence.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyFlowEvidenceResponse({}));
  }

  /**
   * Description: 全流程证据包生成进度查询
   * Summary: 全流程证据包生成进度查询
   */
  async queryFlowEvidence(request: QueryFlowEvidenceRequest): Promise<QueryFlowEvidenceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFlowEvidenceEx(request, headers, runtime);
  }

  /**
   * Description: 全流程证据包生成进度查询
   * Summary: 全流程证据包生成进度查询
   */
  async queryFlowEvidenceEx(request: QueryFlowEvidenceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFlowEvidenceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFlowEvidenceResponse>(await this.doRequest("1.0", "twc.notary.flow.evidence.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFlowEvidenceResponse({}));
  }

  /**
   * Description: 全流程证据授权码申请
   * Summary: 全流程证据授权码申请
   */
  async applyFlowAuth(request: ApplyFlowAuthRequest): Promise<ApplyFlowAuthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyFlowAuthEx(request, headers, runtime);
  }

  /**
   * Description: 全流程证据授权码申请
   * Summary: 全流程证据授权码申请
   */
  async applyFlowAuthEx(request: ApplyFlowAuthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyFlowAuthResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyFlowAuthResponse>(await this.doRequest("1.0", "twc.notary.flow.auth.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyFlowAuthResponse({}));
  }

  /**
   * Description: 全流程详情查询
   * Summary: 全流程详情查询
   */
  async detailFlowInstance(request: DetailFlowInstanceRequest): Promise<DetailFlowInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailFlowInstanceEx(request, headers, runtime);
  }

  /**
   * Description: 全流程详情查询
   * Summary: 全流程详情查询
   */
  async detailFlowInstanceEx(request: DetailFlowInstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailFlowInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailFlowInstanceResponse>(await this.doRequest("1.0", "twc.notary.flow.instance.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailFlowInstanceResponse({}));
  }

  /**
   * Description: 合约校验接口
   * Summary: 合约校验接口
   */
  async checkContract(request: CheckContractRequest): Promise<CheckContractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkContractEx(request, headers, runtime);
  }

  /**
   * Description: 合约校验接口
   * Summary: 合约校验接口
   */
  async checkContractEx(request: CheckContractRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckContractResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckContractResponse>(await this.doRequest("1.0", "twc.notary.contract.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckContractResponse({}));
  }

  /**
   * Description: 查询合约核验结果
   * Summary: 查询合约核验结果
   */
  async queryContractStatus(request: QueryContractStatusRequest): Promise<QueryContractStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContractStatusEx(request, headers, runtime);
  }

  /**
   * Description: 查询合约核验结果
   * Summary: 查询合约核验结果
   */
  async queryContractStatusEx(request: QueryContractStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContractStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContractStatusResponse>(await this.doRequest("1.0", "twc.notary.contract.status.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContractStatusResponse({}));
  }

}
