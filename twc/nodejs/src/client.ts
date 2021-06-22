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
  idNumberFile: FileInfo[];
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

// 履约信息
export class PerformanceInfo extends $tea.Model {
  // 支付租金总额
  rentPayTotal: string;
  // 买断金额
  buyoutAmount: string;
  // 租赁分期履约信息
  rentalInstallmentPerformance: RentalInstallmentPerformance[];
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

// 自动进件订单信息
export class LeaseOrderInfo extends $tea.Model {
  // 出租方平台名称
  lessorPlatformName?: string;
  // 订单号
  orderNumber: string;
  // 合同编号
  contractNo: string;
  // 合同名称
  contractName?: string;
  // 订单商品信息列表
  orderItems: OrderItem[];
  // 设备及配件总价（单位元）
  totalDevicePrice: string;
  // 押金金额（单位元）
  depositAmount: string;
  // 免押金额
  freeDeposit: string;
  // 签约时间
  signTime: string;
  // 租期起始时间
  leaseStartTime: string;
  // 租期结束时间
  leaseEndTime: string;
  // 买断金额计算公式
  buyoutAmountFormulaCalc: string;
  // 首付款（单位元）
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
      signTime: 'sign_time',
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
      signTime: 'string',
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

// 平台方自动签署区信息
export class ContractPlatformSignField extends $tea.Model {
  // 是否添加签署时间戳，默认不添加，时间格式如"2019-03-11 10:12:12"
  addSignTime?: boolean;
  // 签署区顺序，默认1,且不小于1，顺序越小越先处理
  order?: number;
  // 页码信息，当签署区signType为2时, 页码可以'-'分割, 其他情况只能是数字
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
  // 页码信息
  posPage?: string;
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
  // 签署类型，0-不限，1-单页签署，2-骑缝签署，默认1
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
  // 页码信息，可以','或'-'分割
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
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      contractHash: 'contract_hash',
      signatory: 'signatory',
      timestamp: 'timestamp',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: 'string',
      contractHash: 'string',
      signatory: 'string',
      timestamp: 'string',
      txHash: 'string',
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
  // 证件类型，默认CRED_ORG_USCC，详见机构证件类型说明 （https://tech.antfin.com/docs/2/155166）
  idType: string;
  // 企业法人名称
  legalPerson?: string;
  // 企业法人证件号
  legalPersonId?: string;
  // 机构名称
  name: string;
  // 机构唯一标识，可传入第三方平台的机构用户id等
  organizationId?: string;
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
  // 签署操作人个人账号标识，即操作本次签署的个人，如需通知用户签署，则系统向该账号下绑定的手机、邮箱发送签署链接
  accountId: string;
  // 电子合同文件ID
  fileId: string;
  // 签署区顺序，默认1,且不小于1，顺序越小越先处理
  order?: number;
  // 页码信息，当签署区signType为2时, 页码可以'-'分割, 其他情况只能是数字。不指定xy坐标签署区可不填写，其他情况需填写。
  posPage?: string;
  // x坐标，页面签章必填，骑缝签章不填写
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
  // 签署类型，0-不限，1-单页签署，2-骑缝签署，默认1
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

// 自动进件证据要素
export class LeaseEvidentialElement extends $tea.Model {
  // 订单信息
  leaseOrderInfo: LeaseOrderInfo;
  // 承诺信息
  commitmentInfo: CommitmentInfo;
  // 物流信息
  logisticsInfo: LogisticsInfo;
  // 履约信息
  performanceInfo: PerformanceInfo;
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
      performanceInfo: PerformanceInfo,
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

// 电子合同文档
export class ContractDoc extends $tea.Model {
  // 是否加密，0-不加密，1-加，默认0
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

// 电子合同签署流程的配置信息
export class ContractSignFlowConfig extends $tea.Model {
  // 回调通知地址 ,默认取项目配置通知地址
  noticeDeveloperUrl?: string;
  // 通知方式，逗号分割，1-短信，2-邮件 。默认值1，请务必请选择一个通知方式，否则客户将接收不到流程的签署通知和审批通知，如果流程需要审批，将导致审批无法完成；如果客户需要不通知，可以设置notice_type为""
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

// 一步创建签署流程的签署区信息
export class OneStepSignField extends $tea.Model {
  // 签署操作人个人账号标识，即操作本次签署的个人
  accountId: string;
  // 电子合同文件ID
  fileId: string;
  // 签署区顺序，默认1,且不小于1，顺序越小越先处理
  order?: number;
  // 页码信息，当签署区signType为2时, 页码可以'-'分割, 其他情况只能是数字
  posPage: string;
  // x坐标
  posX: string;
  // y坐标
  posY: string;
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
  // 签署类型，0-不限，1-单页签署，2-骑缝签署，默认1
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
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      fileNum: 'file_num',
      initiator: 'initiator',
      signatories: 'signatories',
      timestamp: 'timestamp',
      txHash: 'tx_hash',
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
  // 页码信息，当签署区signType为2时, 页码可以'-'分割, 其他情况只能是数字
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
  // 代理商户的账户
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
  // 退款请求对应的码
  outRequestNo: string;
  // 订单id
  outTradeNo: string;
  // 退款金额
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
  // 图片名称
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

export class GetJusticeGetuploadfilepathRequest extends $tea.Model {
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

export class GetJusticeGetuploadfilepathResponse extends $tea.Model {
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
  clearingOrg: string;
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
          sdk_version: "1.5.10",
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
  async getJusticeGetuploadfilepath(request: GetJusticeGetuploadfilepathRequest): Promise<GetJusticeGetuploadfilepathResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getJusticeGetuploadfilepathEx(request, headers, runtime);
  }

  /**
   * Description: 获取oss文件上传路径，返回业务方oss文件上传链接和fileKey
   * Summary: 获取OSS文件上传路径
   */
  async getJusticeGetuploadfilepathEx(request: GetJusticeGetuploadfilepathRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetJusticeGetuploadfilepathResponse> {
    Util.validateModel(request);
    return $tea.cast<GetJusticeGetuploadfilepathResponse>(await this.doRequest("1.0", "twc.notary.justice.getuploadfilepath.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetJusticeGetuploadfilepathResponse({}));
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

}
