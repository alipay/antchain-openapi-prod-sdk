// This file is auto-generated, don't edit it
import AlipayUtil from '@antchain/alipay-util';
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签字人
export class ContractFlowSigner extends $tea.Model {
  // 签署人账号id
  signerAccountId?: string;
  // 签约主体的账号id（个人/企业）；如签署人本签署，则返回签署人账号id；如签署人代机构签署，则返回机构账号id
  signerAuthorizedAccountId?: string;
  // 签约主体名称
  signerAuthorizedAccountName?: string;
  // 签署主体是否已实名
  signerAuthorizedAccountRealName?: boolean;
  // 签署主体类型, 0-个人, 1-机构
  signerAuthorizedAccountType?: number;
  // 签署人名称
  signerName?: string;
  // 签署人是否已实名
  signerRealName?: boolean;
  // 签署顺序
  signOrder?: number;
  // 签署状态, 0-待签, 1-未签, 2-已签 3-待审批 4-拒签
  signStatus?: number;
  // 本次签署任务对应指定的第三方业务流水号id，当存在多个第三方业务流水号id时，返回多个，并逗号隔开
  thirdOrderNo?: string;
  static names(): { [key: string]: string } {
    return {
      signerAccountId: 'signer_account_id',
      signerAuthorizedAccountId: 'signer_authorized_account_id',
      signerAuthorizedAccountName: 'signer_authorized_account_name',
      signerAuthorizedAccountRealName: 'signer_authorized_account_real_name',
      signerAuthorizedAccountType: 'signer_authorized_account_type',
      signerName: 'signer_name',
      signerRealName: 'signer_real_name',
      signOrder: 'sign_order',
      signStatus: 'sign_status',
      thirdOrderNo: 'third_order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      signerAccountId: 'string',
      signerAuthorizedAccountId: 'string',
      signerAuthorizedAccountName: 'string',
      signerAuthorizedAccountRealName: 'boolean',
      signerAuthorizedAccountType: 'number',
      signerName: 'string',
      signerRealName: 'boolean',
      signOrder: 'number',
      signStatus: 'number',
      thirdOrderNo: 'string',
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
  // 应用ID
  applicationCode?: string;
  // 哈希算法, notary_type 为 HASH 时此参数必填
  hashAlgorithm?: string;
  // 存证内容
  notaryContent?: string;
  // 交易哈希
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      agencyCode: 'agency_code',
      applicationCode: 'application_code',
      hashAlgorithm: 'hash_algorithm',
      notaryContent: 'notary_content',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      agencyCode: 'string',
      applicationCode: 'string',
      hashAlgorithm: 'string',
      notaryContent: 'string',
      txHash: 'string',
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
  productId?: string;
  // 电子商品唯一标识码
  productImeiId?: string;
  // 产品名称
  productName?: string;
  // 采购产品的个数
  productNumber?: number;
  // 采购产品的价格，精确到毫厘，如12.34元表示为123400
  productPrice?: number;
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
  // 经办人证件类型，企业认证选填
  agentCertType?: string;
  // 经办人身份证，企业认证选填
  agentId?: string;
  // 用户名称
  certName?: string;
  // 证件号
  certNo?: string;
  // 证件类型，个人只支持身份证IDENTITY_CARD，企业支持UNIFIED_SOCIAL_CREDIT_CODE（统一社会信用代码）和ENTERPRISE_REGISTERED_NUMBER（企业工商注册号）
  certType?: string;
  // 法人姓名，企业认证必选
  legalPerson?: string;
  // 法人证件类型，企业认证必选
  legalPersonCertType?: string;
  // 法人身份证，企业认证必选
  legalPersonId?: string;
  // 用户手机号码
  mobileNo?: string;
  // 扩展属性
  properties?: string;
  // 用户类型，PERSON或者ENTERPRISE
  userType?: string;
  static names(): { [key: string]: string } {
    return {
      agent: 'agent',
      agentCertType: 'agent_cert_type',
      agentId: 'agent_id',
      certName: 'cert_name',
      certNo: 'cert_no',
      certType: 'cert_type',
      legalPerson: 'legal_person',
      legalPersonCertType: 'legal_person_cert_type',
      legalPersonId: 'legal_person_id',
      mobileNo: 'mobile_no',
      properties: 'properties',
      userType: 'user_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      agent: 'string',
      agentCertType: 'string',
      agentId: 'string',
      certName: 'string',
      certNo: 'string',
      certType: 'string',
      legalPerson: 'string',
      legalPersonCertType: 'string',
      legalPersonId: 'string',
      mobileNo: 'string',
      properties: 'string',
      userType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 电子合同文档的下载地址
export class ContractDocAddress extends $tea.Model {
  // 电子合同文档ID
  fileId?: string;
  // 电子合同文档名称，默认文件名称
  fileName?: string;
  // 电子合同下载文档地址, 有效时间1小时
  fileUrl?: string;
  static names(): { [key: string]: string } {
    return {
      fileId: 'file_id',
      fileName: 'file_name',
      fileUrl: 'file_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fileId: 'string',
      fileName: 'string',
      fileUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 融资租赁订单额外信息
export class LeaseOrderExtra extends $tea.Model {
  // 额外信息的主键
  key?: string;
  // 额外信息的值
  value?: string;
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
  posPage?: string;
  // x坐标转为字符串的值，默认空
  posX?: string;
  // y坐标转为字符串的值
  posY?: string;
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

// 核验结果
export class NotaryCheckResult extends $tea.Model {
  // 区块哈希
  blockHash?: string;
  // 存证所在区块高度
  blockHeight?: number;
  // 核验结果错误码
  errorCode?: number;
  // 错误信息
  errorMessage?: string;
  // 存证时间
  notaryTime?: string;
  // 存证类型
  notaryType?: string;
  // 存证阶段
  phase?: string;
  // 核验是否成功
  result?: boolean;
  // 存证事务ID
  transactionId?: string;
  // 交易哈希
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      blockHash: 'block_hash',
      blockHeight: 'block_height',
      errorCode: 'error_code',
      errorMessage: 'error_message',
      notaryTime: 'notary_time',
      notaryType: 'notary_type',
      phase: 'phase',
      result: 'result',
      transactionId: 'transaction_id',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      blockHash: 'string',
      blockHeight: 'number',
      errorCode: 'number',
      errorMessage: 'string',
      notaryTime: 'string',
      notaryType: 'string',
      phase: 'string',
      result: 'boolean',
      transactionId: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 电子合同签署盖章区
export class ContractSignField extends $tea.Model {
  // 电子合同用户ID
  accountId?: string;
  // 电子合同文档ID
  fileId?: string;
  // 电子合同签署区id
  signfieldId?: string;
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

// 电子合同存证签署信息
export class ContractNotarySignInfo extends $tea.Model {
  // 本阶段存证内容哈希值
  content?: string;
  // 电子合同文件hash，可能一次性签署多个文件，不同文件的hash间用“,”分隔开
  contractHash?: string;
  // 签署人ID
  signatory?: string;
  // 存证阶段发生时间，UNIX时间戳(毫秒)
  timestamp?: string;
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

// 智能合同机构账户创建申请信息
export class ContractOrganizationApplication extends $tea.Model {
  // 证件号
  idNumber?: string;
  // 证件类型，默认CRED_ORG_USCC，详见机构证件类型说明 （https://tech.antfin.com/docs/2/155166）
  idType?: string;
  // 企业法人名称
  legalPerson?: string;
  // 企业法人证件号
  legalPersonId?: string;
  // 机构名称
  name?: string;
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

// 电子合同存证结束信息
export class ContractNotaryFinishInfo extends $tea.Model {
  // 本阶段存证内容哈希值
  content?: string;
  // 签署文件份数
  fileNum?: number;
  // 发起人ID
  initiator?: string;
  // 签署人ID（支持多个，不同ID间用“,”分隔开）
  signatories?: string;
  // 存证阶段发生时间，UNIX时间戳(毫秒)
  timestamp?: string;
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

// 创建电子合同签署盖章区时的申请信息
export class ContractSignFieldApplication extends $tea.Model {
  // 是否添加签署时间戳，默认不添加，时间格式如"2019-03-11 10:12:12"
  addSignTime?: boolean;
  // 签约主体账号标识， 将使用该主体账号对应的数字证书完成本次签署，如：当存在签署操作人代某机构签署时，需要传入该机构的账号id
  authorizedAccountId?: string;
  // 电子合同文件ID
  fileId?: string;
  // 签署区顺序，默认1,且不小于1，顺序越小越先处理
  order?: number;
  // 页码信息
  posPage?: string;
  // x坐标转为字符串的值，默认空
  posX?: string;
  // y坐标转为字符串的值
  posY?: string;
  // 印章id ，如不传，则采用账号下的默认印章
  sealId?: string;
  // 第三方业务流水号id，保证相同签署人、相同签约主体、相同签署顺序的任务，对应的第三方业务流水id唯一，默认空
  thirdOrderNo?: string;
  // 签署区宽，默认印章宽度	
  width?: string;
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 创建电子合同手动签署盖章区时的申请信息
export class ContractHandSignFieldApplication extends $tea.Model {
  // 签署操作人个人账号标识，即操作本次签署的个人，如需通知用户签署，则系统向该账号下绑定的手机、邮箱发送签署链接
  accountId?: string;
  // 电子合同文件ID
  fileId?: string;
  // 签署区顺序，默认1,且不小于1，顺序越小越先处理
  order?: number;
  // 页码信息，当签署区signType为2时, 页码可以'-'分割, 其他情况只能是数字
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
  // 签署类型，0-不限，1-单页签署，2-骑缝签署，默认1
  signType?: number;
  // 第三方业务流水号id，保证相同签署人、相同签约主体、相同签署顺序的任务，对应的第三方业务流水id唯一，默认空
  thirdOrderNo?: string;
  // 签署区宽，默认印章宽度
  width?: string;
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 融资租赁商品出租详细信息
export class RentInfo extends $tea.Model {
  // 买断价
  buyoutPrice?: number;
  // 手续费
  commission?: number;
  // 租金
  rentPrice?: number;
  // 租期
  rentTerm?: number;
  // 留购价
  retainedPrice?: number;
  static names(): { [key: string]: string } {
    return {
      buyoutPrice: 'buyout_price',
      commission: 'commission',
      rentPrice: 'rent_price',
      rentTerm: 'rent_term',
      retainedPrice: 'retained_price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      buyoutPrice: 'number',
      commission: 'number',
      rentPrice: 'number',
      rentTerm: 'number',
      retainedPrice: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 存证信息说明
export class NotaryInfo extends $tea.Model {
  // 存证内容的哈希值，默认采用SHA256算法
  contentHash?: string;
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
  // 存证事务ID
  transactionId?: string;
  // 发起存证成功后，返回的存证凭据
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      contentHash: 'content_hash',
      cooperation: 'cooperation',
      creationType: 'creation_type',
      fileName: 'file_name',
      hashAlgorithm: 'hash_algorithm',
      platform: 'platform',
      size: 'size',
      transactionId: 'transaction_id',
      txHash: 'tx_hash',
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
      transactionId: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 融资租赁里的产品详细信息
export class ProductInfo extends $tea.Model {
  // 额外字段
  extraInfo?: string;
  // 是否需要创建did
  needDid?: boolean;
  // 产品品牌，长度不超过50
  productBrand?: string;
  // 产品Id，长度不超过50
  productId?: string;
  // 唯一标识码，imeiID，长度不超过50
  productImeiId?: string;
  // 产品规格型号，长度不超过255
  productModel?: string;
  // 产品名称，长度不超过50
  productName?: string;
  // 产品数量
  productNumber?: number;
  // 产品采购含税价 精确到毫厘，即123400表示12.34元
  productPrice?: number;
  // 供应商id
  supplierId?: string;
  // 供应商对应的产品版本，每个版本可以对应一个价格
  supplierVersion?: string;
  static names(): { [key: string]: string } {
    return {
      extraInfo: 'extra_info',
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
    };
  }

  static types(): { [key: string]: any } {
    return {
      extraInfo: 'string',
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
  fileId?: string;
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

// 租赁业务存证信息记录
export class LeaseNotaryRecord extends $tea.Model {
  // 存证阶段
  phase?: string;
  // 交易哈希，存证记录唯一标识
  txHash?: string;
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
  idNumber?: string;
  // 目前仅支持CRED_PSN_CH_IDCARD，即身份证号码
  idType?: string;
  // 手机号码，默认空
  mobile?: string;
  // 姓名
  name?: string;
  // 用户唯一标识，可传入第三方平台的个人用户id等
  userId?: string;
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

// 电子合同签署流程的配置信息
export class ContractSignFlowConfig extends $tea.Model {
  // 回调通知地址 ,默认取项目配置通知地址
  noticeDeveloperUrl?: string;
  // 通知方式，逗号分割，1-短信，2-邮件 。默认值1，请务必请选择一个通知方式，否则客户将接收不到流程的签署通知和审批通知，如果流程需要审批，将导致审批无法完成；如果客户需要不通知，可以设置notice_type为""
  noticeType?: string;
  // 签署完成重定向地址,默认签署完成停在当前页面
  redirectUrl?: string;
  // 签署平台，逗号分割，1-开放服务h5，2-支付宝签 ，默认值1
  signPlatform?: string;
  static names(): { [key: string]: string } {
    return {
      noticeDeveloperUrl: 'notice_developer_url',
      noticeType: 'notice_type',
      redirectUrl: 'redirect_url',
      signPlatform: 'sign_platform',
    };
  }

  static types(): { [key: string]: any } {
    return {
      noticeDeveloperUrl: 'string',
      noticeType: 'string',
      redirectUrl: 'string',
      signPlatform: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 融资租赁中IOT设备详情
export class LeaseIotItemInfo extends $tea.Model {
  // 证据的时间
  date?: string;
  // 证据的原始数据，默认为空或加密状态，除非调用方为授权用户（如出资方等
  rawData?: string;
  // 证据的txHash
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      date: 'date',
      rawData: 'raw_data',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      date: 'string',
      rawData: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 存证证明的证书信息
export class CertificateInfo extends $tea.Model {
  // 存证证明的证书内容的SHA256哈希值
  hash?: string;
  // 存证证明的证书文件名
  resourceName?: string;
  // 存证证明的证书下载地址
  resourceUrl?: string;
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

// 电子合同存证初始化信息
export class ContractNotaryInitInfo extends $tea.Model {
  // 本阶段存证内容哈希值
  content?: string;
  // 签署文件份数
  fileNum?: number;
  // 签署流程发起人ID
  initiator?: string;
  // 签署人ID（支持多个，不同ID间用“,”分隔开），由于流程中签署人可后续追加，最终以ContractNotaryFinishInfo中的singatories信息为准。
  signatories?: string;
  // 存证阶段发生时间，UNIX时间戳(毫秒)
  timestamp?: string;
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
  // 印章业务类型，CANCELLATION-作废章，COMMON-其它
  sealBizType?: string;
  // 印章id
  sealId?: string;
  // 印章类型，1-机构模板章，2-个人模板章，3-自定义印章，4-手绘章
  sealType?: number;
  // 印章下载地址, 有效时间1小时
  url?: string;
  // 印章宽度
  width?: number;
  static names(): { [key: string]: string } {
    return {
      alias: 'alias',
      createDate: 'create_date',
      defaultFlag: 'default_flag',
      fileKey: 'file_key',
      height: 'height',
      sealBizType: 'seal_biz_type',
      sealId: 'seal_id',
      sealType: 'seal_type',
      url: 'url',
      width: 'width',
    };
  }

  static types(): { [key: string]: any } {
    return {
      alias: 'string',
      createDate: 'number',
      defaultFlag: 'boolean',
      fileKey: 'string',
      height: 'number',
      sealBizType: 'string',
      sealId: 'string',
      sealType: 'number',
      url: 'string',
      width: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签署区列表数据
export class ContractPlatformSignFieldApplication extends $tea.Model {
  // 是否添加签署时间戳， 默认不添加，默认格式 yyyy-MM-dd HH : mm : ss
  addSignTime?: boolean;
  // 文件file id
  fileId?: string;
  // 签署顺序，默认1,且不小于1，顺序越小越先处理
  order?: number;
  // 页码信息，当签署区signType为2时, 页码可以'-'分割, 其他情况只能是数字
  posPage?: string;
  // x坐标，默认空
  posX?: string;
  // y坐标
  posY?: string;
  // 印章id， 仅限企业公章，暂不支持指定企业法定代表人印章 ，如不传，则采用账号下的默认印章
  sealId?: string;
  // 签署类型， 1-单页签署，2-骑缝签署，默认1
  signType?: number;
  // 第三方业务流水号id，保证相同签署人、相同签约主体、相同签署顺序的任务，对应的第三方业务流水id唯一，默认空
  thirdOrderNo?: string;
  // 签署区宽，默认印章宽度
  width?: string;
  static names(): { [key: string]: string } {
    return {
      addSignTime: 'add_sign_time',
      fileId: 'file_id',
      order: 'order',
      posPage: 'pos_page',
      posX: 'pos_x',
      posY: 'pos_y',
      sealId: 'seal_id',
      signType: 'sign_type',
      thirdOrderNo: 'third_order_no',
      width: 'width',
    };
  }

  static types(): { [key: string]: any } {
    return {
      addSignTime: 'boolean',
      fileId: 'string',
      order: 'number',
      posPage: 'string',
      posX: 'string',
      posY: 'string',
      sealId: 'string',
      signType: 'number',
      thirdOrderNo: 'string',
      width: 'string',
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
  payDate?: number;
  // 代扣金额，整数 精确到分
  payMoney?: number;
  static names(): { [key: string]: string } {
    return {
      payDate: 'pay_date',
      payMoney: 'pay_money',
    };
  }

  static types(): { [key: string]: any } {
    return {
      payDate: 'number',
      payMoney: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 可信时间信息结构
export class TsrResponse extends $tea.Model {
  // 可信时间请求结果状态吗
  code?: string;
  // 精简后的时间戳完整编码（在校验时需要提交）
  ctsr?: string;
  // hash后的信息
  hashedMessage?: string;
  // 哈希算法
  hashAlgorithm?: string;
  // 请求失败时候的错误信息
  message?: string;
  // 凭证序列号 （在校验的时需要先填写凭证编号）
  // 
  sn?: string;
  // 时间
  ts?: string;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      ctsr: 'ctsr',
      hashedMessage: 'hashed_message',
      hashAlgorithm: 'hash_algorithm',
      message: 'message',
      sn: 'sn',
      ts: 'ts',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      ctsr: 'string',
      hashedMessage: 'string',
      hashAlgorithm: 'string',
      message: 'string',
      sn: 'string',
      ts: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackTwcNotaryArbitrationStatusRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 案件文书号
  acceptanceNumber?: string;
  // 案件编号
  caseNo?: string;
  // 确认时间时间戳
  confirmTime?: number;
  // 预处理案号
  preacceptanceNumber?: string;
  // 发送时间时间戳
  sendTime?: number;
  // 案件状态
  status?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CallbackTwcNotaryArbitrationStatusResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryContractAccountRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 邮箱地址，默认空	
  email?: string;
  // 证件号
  idNumber?: string;
  // 证件类型，默认CRED_PSN_CH_IDCARD，详见个人证件类型说明文档（https://tech.antfin.com/docs/2/155166）
  idType?: string;
  // 手机号码，默认空
  mobile?: string;
  // 姓名
  name?: string;
  // 用户唯一标识，可传入第三方平台的个人用户id、证件号、手机号、邮箱等，如果设置则作为账号唯一性字段，相同信息不可重复创建。（个人用户与机构的唯一标识不可重复）
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateTwcNotaryContractAccountResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryContractAccountsealRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 电子合同用户ID（在twc.notary.contract.account.create接口中创建）
  accountId?: string;
  // 印章别名
  alias?: string;
  // 印章颜色，RED-红色， BLUE-蓝色，BLACK-黑色
  color?: string;
  // 印章高度, 默认95px
  height?: number;
  // 模板类型, 详见个人印章样式说明 SQUARE, BORDERLESS, FZKC, HWLS, HWXK, HWXKBORDER, HYLSF, RECTANGLE, YGYJFCS, YGYMBXS, YYGXSF
  type?: string;
  // 印章宽度, 默认95px
  width?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      accountId: 'account_id',
      alias: 'alias',
      color: 'color',
      height: 'height',
      type: 'type',
      width: 'width',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      accountId: 'string',
      alias: 'string',
      color: 'string',
      height: 'number',
      type: 'string',
      width: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryContractAccountsealResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 印章fileKey
  fileKey?: string;
  // 业务码信息
  message?: string;
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

export class CreateTwcNotaryContractOrganizationRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 创建人个人账号ID，也就是调用个人账号创建接口（twc.notary.contract.account.create
  // ）返回的accountId
  creator?: string;
  // 证件号
  idNumber?: string;
  // 证件类型，默认CRED_ORG_USCC，详见机构证件类型说明 （https://tech.antfin.com/docs/2/155166）
  idType?: string;
  // 企业法人名称
  legalPerson?: string;
  // 企业法人证件号
  legalPersonId?: string;
  // 机构名称
  name?: string;
  // 机构唯一标识，可传入第三方平台机构id、企业证件号、企业邮箱等如果设置则作为账号唯一性字段，相同id不可重复创建。（个人用户与机构的唯一标识不可重复）
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateTwcNotaryContractOrganizationResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryContractOrgsealRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 印章别名
  alias?: string;
  // 中心图案类型，STAR-圆形有五角星，NONE-圆形无五角星， 详见机构印章样式说明
  central?: string;
  // 印章颜色，RED-红色，BLUE-蓝色，BLACK-黑色
  color?: string;
  // 印章高度，默认159px
  height?: number;
  // 横向文，可设置0-8个字，企业名称超出25个字后，不支持设置横向文
  htext?: string;
  // 机构ID
  orgId?: string;
  // 下弦文，可设置0-20个字，企业企业名称超出25个字后，不支持设置下弦文	
  qtext?: string;
  // 模板类型，TEMPLATE_ROUND-圆章，TEMPLATE_OVAL-椭圆章， 详见机构印章样式说明	
  type?: string;
  // 印章宽度，默认159px
  width?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateTwcNotaryContractOrgsealResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class AuthTwcNotaryContractSignRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 授权人ID，即个人账号ID或机构账号ID
  accountId?: string;
  // 授权截止时间, 格式为yyyy-MM-dd HH:mm:ss，默认无限期
  deadline?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      accountId: 'account_id',
      deadline: 'deadline',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      accountId: 'string',
      deadline: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthTwcNotaryContractSignResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 业务数据, 是否授权成功
  accepted?: boolean;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accepted: 'accepted',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accepted: 'boolean',
      code: 'number',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryContractTemplateRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 模板文件md5值，再做base64编码
  contentMd5?: string;
  // 目标文件的MIME类型
  contentType?: string;
  // 是否需要转成pdf，如果模板文件为.doc/.docx 传true，为pdf传false
  convert2Pdf?: boolean;
  // 文件名称，必须带扩展名如:.pdf,.doc,.docx
  fileName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateTwcNotaryContractTemplateResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryContractFlowRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 是否自动归档，默认false。如设置为true，则在调用签署流程开启(twc.notary.contract.flow.start)后，当所有签署人签署完毕，系统自动将流程归档，状态变为“已完成”状态，在流程状态为“已完成”前，可随时添加签署人；如设置为false，则在调用签署流程开启后，需主动调用签署流程归档接口，将流程状态变更为“已完成”，归档前可随时添加签署人；已完成的流程才可下载签署后的文件
  autoArchive?: boolean;
  // 文件主题
  businessScene?: string;
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
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateTwcNotaryContractFlowResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class AddTwcNotaryContractDocumentRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 文档列表数据
  docs?: ContractDoc[];
  // 流程ID
  flowId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      docs: 'docs',
      flowId: 'flow_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      docs: { 'type': 'array', 'itemType': ContractDoc },
      flowId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddTwcNotaryContractDocumentResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class AddTwcNotaryContractSignfieldRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 签署流程ID
  flowId?: string;
  // 签署区列表数据
  signfields?: ContractSignFieldApplication[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      flowId: 'flow_id',
      signfields: 'signfields',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      flowId: 'string',
      signfields: { 'type': 'array', 'itemType': ContractSignFieldApplication },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddTwcNotaryContractSignfieldResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class StartTwcNotaryContractFlowRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 流程ID
  flowId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      flowId: 'flow_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      flowId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartTwcNotaryContractFlowResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class SaveTwcNotaryContractFlowRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 流程ID
  flowId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      flowId: 'flow_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      flowId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveTwcNotaryContractFlowResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class DownloadTwcNotaryContractDocumentRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 流程ID
  flowId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      flowId: 'flow_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      flowId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DownloadTwcNotaryContractDocumentResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class AddTwcNotaryContractFileRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 文件名称
  name?: string;
  // 输入项填充内容，以key:value传入
  simpleFormFields?: string;
  // 模板编号
  templateId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      name: 'name',
      simpleFormFields: 'simple_form_fields',
      templateId: 'template_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      name: 'string',
      simpleFormFields: 'string',
      templateId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddTwcNotaryContractFileResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 文件下载地址，有效期一小时
  downloadUrl?: string;
  // 文件id
  fileId?: string;
  // 文件名称
  fileName?: string;
  // 业务码信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      downloadUrl: 'download_url',
      fileId: 'file_id',
      fileName: 'file_name',
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
      fileId: 'string',
      fileName: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryContractPlatformRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 平台方经办人信息
  creator?: ContractAccountApplication;
  // 平台机构信息
  platform?: ContractOrganizationApplication;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      creator: 'creator',
      platform: 'platform',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      creator: ContractAccountApplication,
      platform: ContractOrganizationApplication,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryContractPlatformResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 创建人ID
  creatorId?: string;
  // 业务码信息
  message?: string;
  // 平台方ID
  platformId?: string;
  // 平台用户与智能合同服务间鉴权使用的密钥
  secret?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      creatorId: 'creator_id',
      message: 'message',
      platformId: 'platform_id',
      secret: 'secret',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      creatorId: 'string',
      message: 'string',
      platformId: 'string',
      secret: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryContractUserRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 用户类型为机构时，填写机构信息
  organization?: ContractOrganizationApplication;
  // 用户类型为个人时，则为个人用户信息；用户类型为机构时，则为机构账号经办人信息
  user?: ContractAccountApplication;
  // 用户类型，个人（PERSON）或机构（ORGANIZATION）
  userType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      organization: 'organization',
      user: 'user',
      userType: 'user_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      organization: ContractOrganizationApplication,
      user: ContractAccountApplication,
      userType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryContractUserResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  // 机构账号
  organizationId?: string;
  // 用户类型为个人时返回用户账号；用户类型为机构时返回经办人账号
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      organizationId: 'organization_id',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      organizationId: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartTwcNotaryContractHandsignRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 代理商户账户
  agentAccountId?: string;
  // 是否自动归档，默认为true
  autoArchive?: boolean;
  // 合同文件主题
  businessScene?: string;
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
  simpleFormFields?: string;
  // 待签署的智能合同模板ID
  template?: string;
  // 待签署客户的账户ID
  userAccount?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartTwcNotaryContractHandsignResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 签署流程ID
  flowId?: string;
  // 业务码信息
  message?: string;
  // 手动签约唤起地址
  url?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      flowId: 'flow_id',
      message: 'message',
      url: 'url',
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotaryContractFlowRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 流程id
  flowId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      flowId: 'flow_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      flowId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotaryContractFlowResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryContractAccountsealimageRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 用户id
  accountId?: string;
  // 印章别名
  alias?: string;
  // 印章数据，base64格式字符串，不包含格式前缀
  data?: string;
  // 印章高度, 个人默认95px, 机构默认159px
  height?: number;
  // 是否对图片进行透明化处理，默认false。仅对图片整体做透明化处理，无法去除图片背景
  transparentFlag?: boolean;
  // 印章数据类型，BASE64：base64格式
  type?: string;
  // 印章宽度, 个人默认95px, 机构默认159px
  width?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      accountId: 'account_id',
      alias: 'alias',
      data: 'data',
      height: 'height',
      transparentFlag: 'transparent_flag',
      type: 'type',
      width: 'width',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      accountId: 'string',
      alias: 'string',
      data: 'string',
      height: 'number',
      transparentFlag: 'boolean',
      type: 'string',
      width: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryContractAccountsealimageResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 印章fileKey
  fileKey?: string;
  // 印章高度
  height?: number;
  // 业务码信息
  message?: string;
  // 印章id
  sealId?: string;
  // 印章下载地址, 有效时间1小时
  url?: string;
  // 印章宽度
  width?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      fileKey: 'file_key',
      height: 'height',
      message: 'message',
      sealId: 'seal_id',
      url: 'url',
      width: 'width',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      fileKey: 'string',
      height: 'number',
      message: 'string',
      sealId: 'string',
      url: 'string',
      width: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTwcNotaryContractFileuploadurlRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 所属账号id，即个人账号id或机构账号id，如不传，则默认属于对接平台
  accountId?: string;
  // 先计算文件md5值，在对该md5值进行base64编码
  contentMd5?: string;
  // 目标文件的MIME类型
  contentType?: string;
  // 是否转换成pdf文档，默认false，代表不做转换。转换是异步行为，如果指定要转换，需要调用查询文件信息接口查询状态，转换完成后才可使用。
  convert2Pdf?: string;
  // 文件名称（必须带上文件扩展名，不然会导致后续发起流程校验过不去 示例：合同.pdf ）
  fileName?: string;
  // 文件大小，单位byte
  fileSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      accountId: 'account_id',
      contentMd5: 'content_md5',
      contentType: 'content_type',
      convert2Pdf: 'convert_2_pdf',
      fileName: 'file_name',
      fileSize: 'file_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      accountId: 'string',
      contentMd5: 'string',
      contentType: 'string',
      convert2Pdf: 'string',
      fileName: 'string',
      fileSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTwcNotaryContractFileuploadurlResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class AddTwcNotaryContractPlatformsignfieldsRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 流程id
  flowId?: string;
  // 签署区列表数据
  signfields?: ContractPlatformSignFieldApplication;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      flowId: 'flow_id',
      signfields: 'signfields',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      flowId: 'string',
      signfields: ContractPlatformSignFieldApplication,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddTwcNotaryContractPlatformsignfieldsResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class GetTwcNotaryContractFileRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 文件id
  fileId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTwcNotaryContractFileResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 下载地址
  downloadUrl?: string;
  // 文件id
  fileId?: string;
  // 业务码信息
  message?: string;
  // 文件名称
  name?: string;
  // pdf文件总页数,仅当文件类型为pdf时有值
  pdfTotalPages?: number;
  // 文件大小，单位byte
  size?: number;
  // 文件状态, 0:文件未上传；1:文件上传中 ；2：文件上传已完成,；3：文件上传失败 ；4：文件等待转pdf ；5：文件已转换pdf 。
  status?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      downloadUrl: 'download_url',
      fileId: 'file_id',
      message: 'message',
      name: 'name',
      pdfTotalPages: 'pdf_total_pages',
      size: 'size',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      downloadUrl: 'string',
      fileId: 'string',
      message: 'string',
      name: 'string',
      pdfTotalPages: 'number',
      size: 'number',
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotaryContractAccountsealsRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 用户id
  accountId?: string;
  // 分页起始位置
  offset?: number;
  // 单页数量
  size?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      accountId: 'account_id',
      offset: 'offset',
      size: 'size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      accountId: 'string',
      offset: 'number',
      size: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotaryContractAccountsealsResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  // 印章列表
  seals?: ContractSeal[];
  // 查询总数
  total?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      seals: 'seals',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      seals: { 'type': 'array', 'itemType': ContractSeal },
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotaryContractOrganizationsealsRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 分页起始位置
  offset?: number;
  // 机构id
  orgId?: string;
  // 单页数量
  size?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      offset: 'offset',
      orgId: 'org_id',
      size: 'size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      offset: 'number',
      orgId: 'string',
      size: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotaryContractOrganizationsealsResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  // 印章列表
  seals?: ContractSeal[];
  // 查询总数
  total?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
      seals: 'seals',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      message: 'string',
      seals: { 'type': 'array', 'itemType': ContractSeal },
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotaryContractFlowsignerRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 流程id
  flowId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      flowId: 'flow_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      flowId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotaryContractFlowsignerResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryTwcNotaryContractSignfieldsRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 账号id，默认所有签署人
  accountId?: string;
  // 流程id
  flowId?: string;
  // 指定签署区id列表，逗号分割，默认所有签署区
  signfieldIds?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      accountId: 'account_id',
      flowId: 'flow_id',
      signfieldIds: 'signfield_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      accountId: 'string',
      flowId: 'string',
      signfieldIds: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotaryContractSignfieldsResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryTwcNotaryContractAccountRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 个人账号id
  accountId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      accountId: 'account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      accountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotaryContractAccountResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 个人账号id
  accountId?: string;
  // 业务码，0表示成功
  code?: number;
  // 联系方式，邮箱地址
  email?: string;
  // 证件号
  idNumber?: string;
  // 证件类型，详见个人证件类型说明
  idType?: string;
  // 业务码信息
  message?: string;
  // 联系方式，手机号码
  mobile?: string;
  // 姓名
  name?: string;
  // 第三方平台的用户id
  thirdPartyUserId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accountId: 'account_id',
      code: 'code',
      email: 'email',
      idNumber: 'id_number',
      idType: 'id_type',
      message: 'message',
      mobile: 'mobile',
      name: 'name',
      thirdPartyUserId: 'third_party_user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accountId: 'string',
      code: 'number',
      email: 'string',
      idNumber: 'string',
      idType: 'string',
      message: 'string',
      mobile: 'string',
      name: 'string',
      thirdPartyUserId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotaryContractOrganizationRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 机构账号id
  orgId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      orgId: 'org_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      orgId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotaryContractOrganizationResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 证件号
  idNumber?: string;
  // 证件类型，详见机构证件类型说明
  idType?: string;
  // 业务码信息
  message?: string;
  // 机构名称
  name?: string;
  // 机构账号Id
  orgId?: string;
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
      idNumber: 'id_number',
      idType: 'id_type',
      message: 'message',
      name: 'name',
      orgId: 'org_id',
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
      idNumber: 'string',
      idType: 'string',
      message: 'string',
      name: 'string',
      orgId: 'string',
      orgLegalIdNumber: 'string',
      orgLegalName: 'string',
      thirdPartyUserId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotaryContractTemplateRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 模板id
  templateId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      templateId: 'template_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      templateId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotaryContractTemplateResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryContractSignflowRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 是否自动归档，默认false 如设置为true，则在流程开启后，当所有签署人签署完毕，系统自动将流程归档，状态变为“已完成”状态，在流程状态为“已完成”前，可随时添加签署人；如设置为false，则在调用流程开启后，需主动调用签署流程归档接口，将流程状态变更为“已完成”，归档前可随时添加签署人；已完成的流程才可下载签署后的文件
  autoArchive?: boolean;
  // 文件主题
  businessScene?: string;
  // 任务配置信息
  contractSignFlowConfig?: ContractSignFlowConfig;
  // 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
  initiatorAccountId?: string;
  // 发起方主体id，如存在个人代机构发起签约，则需传入机构id；如不传，则默认是对接平台
  initiatorAuthorizedAccountId?: string;
  // 签署平台，ALIPAY（支付宝小程序）或H5
  signPlatform?: string;
  // 签署有效截止日期，毫秒，默认3天失效
  signValidity?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      autoArchive: 'auto_archive',
      businessScene: 'business_scene',
      contractSignFlowConfig: 'contract_sign_flow_config',
      initiatorAccountId: 'initiator_account_id',
      initiatorAuthorizedAccountId: 'initiator_authorized_account_id',
      signPlatform: 'sign_platform',
      signValidity: 'sign_validity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      autoArchive: 'boolean',
      businessScene: 'string',
      contractSignFlowConfig: ContractSignFlowConfig,
      initiatorAccountId: 'string',
      initiatorAuthorizedAccountId: 'string',
      signPlatform: 'string',
      signValidity: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryContractSignflowResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryContractRegisterzftRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 地址。商户详细经营地址或人员所在地点
  address?: string;
  // 代理商户的账户
  agentAccountId?: string;
  // 商户别名
  aliasName?: string;
  // 商户支付宝账户
  alipayLogonId?: string;
  // 申请时间
  applyTime?: string;
  // 二级商户支付宝账户，用于协议确认。目前商业场景（除医疗、中小学教育等）下必填。本字段要求与商户名称name同名，且是实名认证支付宝账户
  bindingAlipayLogonId?: string;
  // 结算卡id
  cardAliasNo?: string;
  // 营业执照图片url，本业务接口中，如果是特殊行业必填。其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
  certImage?: string;
  // 商户社会信用码
  certNo?: string;
  // 商户证件类型，取值范围：201：营业执照；2011:营业执照(统一社会信用代码)；204：民办非企业登记证书；206：社会团体法人登记证书；218：事业单位法人证书；219：党政机关批准设立文件/行政执法主体资格证；100：个人商户身份证
  certType?: string;
  // 城市编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。
  // （参考资料：
  // http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
  cityCode?: string;
  // 电子邮箱
  contactEmail?: string;
  // 商户联系人信息
  contactMobile?: string;
  // 联系人名字	
  contactName?: string;
  // 商户联系人电话信息
  contactPhone?: string;
  // 商户联系人业务标识枚举，表示商户联系人的职责。异议处理接口人:02;商户关键联系人:06;数据反馈接口人:11;服务联动接口人:08
  contactTag?: string;
  // 联系人类型，取值范围：LEGAL_PERSON：法人；CONTROLLER：实际控制人；AGENT：代理人；OTHER：其他
  contactType?: string;
  // 区县编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。
  // （参考资料：
  // http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
  districtCode?: string;
  // 返回申请单相关参数。当前返回内容有cardAliasNo，smid	
  extInfo?: string;
  // 商户角色id。审核通过后生成。间连商户或平台商二级商户业务中，本字段表示smid
  ipRoleId?: string;
  // 法人身份证反面url，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。本业务接口中，如果是特殊行业必填
  legalCertBackImage?: string;
  // 法人身份证正面url，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。本业务接口中，如果是特殊行业必填
  legalCertFrontImage?: string;
  // 法人身份证号
  legalCertNo?: string;
  // 法人名称
  legalName?: string;
  // 商户类别码mcc，参见附件描述中的“类目code” https://gw.alipayobjects.com/os/basement_prod/82cb70f7-abbd-417a-91ba-73c1849f07ea.xlsx 如果要求资质一栏不为空，表明是特殊行业，会有人工审核。注：文档更新可能有滞后性，以实际为准
  mcc?: string;
  // 蚂蚁金服（杭*****术有限公司
  merchantName?: string;
  // 商家类型：01：企业；02：事业单位；03：民办非企业组织；04：社会团体；05：党政及国家机关；06：个人商户；07：个体工商户
  merchantType?: string;
  // 商户名称
  name?: string;
  // 申请单id
  orderId?: string;
  // 外部业务号。比如某种业务标准外部订单号,比如交易外部订单号，代表服务商端自己订单号。用于做并发控制，防止一笔外部订单发起两次进件。非必要场景禁止传入本字段，如要使用务必理清场景及字段生成规则，与蚂蚁金服对接人咨询。
  outBizNo?: string;
  // 门头照，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。如果使用当面付服务则必填
  outDoorImage?: string;
  // 商户在智能合同平台唯一id
  platformTuid?: string;
  // 省份编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。
  // （参考资料：
  // http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
  provinceCode?: string;
  // 商户使用服务，可选值有：当面付、app支付、wap支付、电脑支付
  service?: string;
  // 客服电话	
  servicePhone?: string;
  // 二级商户与服务商的签约时间
  signTimeWithIsv?: string;
  // 站点名称
  siteName?: string;
  // 网站：01
  // APP : 02
  // 服务窗:03
  // 公众号:04
  // 其他:05
  // 支付宝小程序:06
  siteType?: string;
  // 站点地址
  siteUrl?: string;
  // 二级商户id
  smid?: string;
  // 申请单状态。99:已完结;-1:失败;031:已提交审核
  status?: string;
  // 0表示不更新，1表示强制更新
  update?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateTwcNotaryContractRegisterzftResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryContractPlatformtemplateRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 是否包含代扣规则，如果设置为true，则在创建手动签署流程时，必须传入代扣规则。默认为false
  autoDeduction?: boolean;
  // 是否强制用户选择代扣
  autoDeductionForce?: boolean;
  // Base64编码的模板文件的MD5值
  contentMd5?: string;
  // 目标文件的MIME类型
  contentType?: string;
  // 是否需要转成pdf，如果模板文件为.doc/.docx 传true，为pdf传false
  convert2Pdf?: boolean;
  // 文件名称，必须带扩展名如:.pdf,.doc,.docx
  fileName?: string;
  // 平台方的签署信息列表
  signFields?: ContractPlatformSignField[];
  // 用户需要签章的页面列表（默认为最后一页）
  userSignPages?: number[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      autoDeduction: 'auto_deduction',
      autoDeductionForce: 'auto_deduction_force',
      contentMd5: 'content_md5',
      contentType: 'content_type',
      convert2Pdf: 'convert2_pdf',
      fileName: 'file_name',
      signFields: 'sign_fields',
      userSignPages: 'user_sign_pages',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      autoDeduction: 'boolean',
      autoDeductionForce: 'boolean',
      contentMd5: 'string',
      contentType: 'string',
      convert2Pdf: 'boolean',
      fileName: 'string',
      signFields: { 'type': 'array', 'itemType': ContractPlatformSignField },
      userSignPages: { 'type': 'array', 'itemType': 'number' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryContractPlatformtemplateResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryTwcNotaryContractMerchantzftRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 代理商户账户
  agentAccountId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      agentAccountId: 'agent_account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      agentAccountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotaryContractMerchantzftResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ListTwcNotaryContractOuttradeidRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 合同id
  flowId?: string;
  // 分页第几页
  pageIndex?: number;
  // 每页的大小
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      flowId: 'flow_id',
      pageIndex: 'page_index',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      flowId: 'string',
      pageIndex: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListTwcNotaryContractOuttradeidResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 错误码
  code?: number;
  // 错误信息描述
  errMessage?: string;
  // 所有符合条件交易相关的id
  outTradeNo?: string[];
  // 总符合条件的交易个数
  total?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      outTradeNo: 'out_trade_no',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      outTradeNo: { 'type': 'array', 'itemType': 'string' },
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotaryContractTradedetailRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 合同id
  flowId?: string;
  // out_trade_no
  outTradeNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      flowId: 'flow_id',
      outTradeNo: 'out_trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      flowId: 'string',
      outTradeNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotaryContractTradedetailResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryContractMerchantrefundRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 合同id
  flowId?: string;
  // 退款请求对应的码
  outRequestNo?: string;
  // 订单id
  outTradeNo?: string;
  // 退款金额
  refundAmount?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateTwcNotaryContractMerchantrefundResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryContractAdminaccountRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryContractAdminaccountResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ListTwcNotaryContractTradeidsRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 合同id
  flowId?: string;
  // 1
  pageIndex?: number;
  // 页面大小
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      flowId: 'flow_id',
      pageIndex: 'page_index',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      flowId: 'string',
      pageIndex: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListTwcNotaryContractTradeidsResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 0表示成功
  code?: number;
  // 错误信息描述
  errMessage?: string;
  // 所有满足条件的订单
  outTradeNo?: string[];
  // 所有item的个数
  total?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      errMessage: 'err_message',
      outTradeNo: 'out_trade_no',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      errMessage: 'string',
      outTradeNo: { 'type': 'array', 'itemType': 'string' },
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryContractCommontriggerRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 合同id
  flowId?: string;
  // 代扣规则详情
  repaymentOrderInfo?: RepaymentOrderRequest[];
  // 用户在智能合同平台的身份
  userTuid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      flowId: 'flow_id',
      repaymentOrderInfo: 'repayment_order_info',
      userTuid: 'user_tuid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      flowId: 'string',
      repaymentOrderInfo: { 'type': 'array', 'itemType': RepaymentOrderRequest },
      userTuid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryContractCommontriggerResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryContractMerchantindirectzftRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 入驻材料
  bizContent?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      bizContent: 'biz_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      bizContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryContractMerchantindirectzftResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryTwcNotaryContractMerchantindirectzftRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 商户入驻查询订单id
  orderId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotaryContractMerchantindirectzftResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 申请时间
  applyId?: string;
  // 错误状态码，0表示成功
  code?: number;
  // 额外信息，包含smid
  extInfo?: string;
  // 支付宝的ipRoleId
  ipRoleId?: string[];
  // 商户名称
  merchantName?: string;
  // 错误信息描述
  message?: string;
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
      applyId: 'apply_id',
      code: 'code',
      extInfo: 'ext_info',
      ipRoleId: 'ip_role_id',
      merchantName: 'merchant_name',
      message: 'message',
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
      applyId: 'string',
      code: 'number',
      extInfo: 'string',
      ipRoleId: { 'type': 'array', 'itemType': 'string' },
      merchantName: 'string',
      message: 'string',
      status: 'string',
      subCode: 'string',
      subMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotaryPayresultfileurlRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 对账日期
  billDate?: string;
  // 交易类型
  billType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      billDate: 'bill_date',
      billType: 'bill_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      billDate: 'string',
      billType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotaryPayresultfileurlResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryContractMerchantimageRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 图片内容，base64
  content?: string;
  // 图片名称
  fileName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      content: 'content',
      fileName: 'file_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      content: 'string',
      fileName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryContractMerchantimageResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CancelTwcNotaryContractPaytradeRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 智能合同id
  flowId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      flowId: 'flow_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      flowId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelTwcNotaryContractPaytradeResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 取消的代扣条目
  canceledOutTradeNo?: string[];
  // 错误码
  code?: number;
  // 错误信息描述
  errMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      canceledOutTradeNo: 'canceled_out_trade_no',
      code: 'code',
      errMessage: 'err_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      canceledOutTradeNo: { 'type': 'array', 'itemType': 'string' },
      code: 'number',
      errMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryContractHandsignflowRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 是否自动归档，默认false。如设置为true，当所有签署人签署完毕，系统自动将流程归档，状态变为“已完成”状态，在流程状态为“已完成”前，可随时添加签署人；如设置为false，则在调用签署流程开启后，需主动调用签署流程归档接口，将流程状态变更为“已完成”，归档前可随时添加签署人；已完成的流程才可下载签署后的文件。
  autoArchive?: boolean;
  // 文件主题
  businessScene?: string;
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
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateTwcNotaryContractHandsignflowResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryContractHandsignfieldRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 流程id
  flowId?: string;
  // 签署区列表数据
  signFields?: ContractHandSignFieldApplication[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      flowId: 'flow_id',
      signFields: 'sign_fields',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      flowId: 'string',
      signFields: { 'type': 'array', 'itemType': ContractHandSignFieldApplication },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryContractHandsignfieldResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class GetTwcNotaryContractSignurlRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 签署人账号id
  accountId?: string;
  // 流程id
  flowId?: string;
  // 默认为空，返回的任务链接仅包含签署人本人需要签署的任务； 传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务； 传入指定机构id，则返回的任务链接包含签署人“本人+指定代签机构”的签署任务
  organizeId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      accountId: 'account_id',
      flowId: 'flow_id',
      organizeId: 'organize_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      accountId: 'string',
      flowId: 'string',
      organizeId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTwcNotaryContractSignurlResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 业务码信息
  message?: string;
  // 长链地址
  url?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      message: 'message',
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
      url: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryWithholdAgreementRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 授信总金额，单位元
  creditAmount?: string;
  // 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）
  externalAgreementNo?: string;
  // 收款方账号类型，可取值：ALIPAY_USER_ID（支付宝uid);商户id，2088123412341234
  merchantId?: string;
  // 商户名称
  merchantName?: string;
  // 对服务产品的描述
  merchantServiceDescription?: string;
  // 商户的服务名称，滴滴出行免密支付
  merchantServiceName?: string;
  // 姓名和身份证号拼接sha256的hash
  nameCertHash?: string;
  // 还款计划的链接
  repaymentUrl?: string;
  // 签约成功后回调的地址
  returnUrl?: string;
  // 第三方用户id
  thirdPartyId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateTwcNotaryWithholdAgreementResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryTwcNotaryWithholdAgreementRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）
  externalAgreementNo?: string;
  // 第三方用户id
  thirdPartyId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      externalAgreementNo: 'external_agreement_no',
      thirdPartyId: 'third_party_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      externalAgreementNo: 'string',
      thirdPartyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotaryWithholdAgreementResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 总授信金额
  creditAmount?: string;
  // 商家请求的协议号
  externalAgreementNo?: string;
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
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      creditAmount: 'credit_amount',
      externalAgreementNo: 'external_agreement_no',
      merchantId: 'merchant_id',
      merchantName: 'merchant_name',
      merchantServiceName: 'merchant_service_name',
      nameCertHash: 'name_cert_hash',
      repaymentUrl: 'repayment_url',
      status: 'status',
      thirdPartyId: 'third_party_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      creditAmount: 'string',
      externalAgreementNo: 'string',
      merchantId: 'string',
      merchantName: 'string',
      merchantServiceName: 'string',
      nameCertHash: 'string',
      repaymentUrl: 'string',
      status: 'string',
      thirdPartyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotaryWithholdAgreementurlRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）
  externalAgreementNo?: string;
  // 第三方用户id
  thirdPartyId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      externalAgreementNo: 'external_agreement_no',
      thirdPartyId: 'third_party_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      externalAgreementNo: 'string',
      thirdPartyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotaryWithholdAgreementurlResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryWithholdOverduetimeRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 首款方id
  merchantId?: string;
  // 商家名称
  merchantName?: string;
  // 商家提供的产品名称
  merchantServiceName?: string;
  // 租户id
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateTwcNotaryWithholdOverduetimeResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class SendTwcNotaryWithholdDeductRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 委托支付订单总金额，单位为元，精确到小数点后两位
  amount?: string;
  // JSON格式，传递业务扩展参数
  businessParams?: string;
  // 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）
  externalAgreementNo?: string;
  // 订单标题信息
  orderTitle?: string;
  // 外部订单号,请求方保证唯一性
  outBizNo?: string;
  // 备注
  remark?: string;
  // 第三方的用户id
  thirdPartyId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class SendTwcNotaryWithholdDeductResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryTwcNotaryWithholdPayresultRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 请求扣款时，返回的委托单号,该笔转账在支付宝系统内部的单据ID
  entrustOrderId?: string;
  // 外部订单号,请求方保证唯一性
  outBizNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      entrustOrderId: 'entrust_order_id',
      outBizNo: 'out_biz_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      entrustOrderId: 'string',
      outBizNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotaryWithholdPayresultResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class SendTwcNotaryWithholdRefundRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 支付宝支付单据号
  orderId?: string;
  // 外部订单号,请求方保证唯一性
  outRequestNo?: string;
  // 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数
  refundAmount?: string;
  // 退款备注
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class SendTwcNotaryWithholdRefundResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class SendTwcNotaryContractInvitationRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
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
  inviteType?: string;
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
      regionName: 'region_name',
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
      regionName: 'string',
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

export class SendTwcNotaryContractInvitationResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ListTwcNotaryContractPayruleRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // flowId
  flowId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      flowId: 'flow_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      flowId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListTwcNotaryContractPayruleResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryWithholdQrcodeRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 请求签约的协议号
  externalAgreementNo?: string;
  // 第三方的用户id
  thirdPartyId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      externalAgreementNo: 'external_agreement_no',
      thirdPartyId: 'third_party_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      externalAgreementNo: 'string',
      thirdPartyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryWithholdQrcodeResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CancelTwcNotaryContractPaysingletradeRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 被取消的某一期的代扣id
  cancelOutOrderNo?: string;
  // 智能合同id
  flowId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      cancelOutOrderNo: 'cancel_out_order_no',
      flowId: 'flow_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      cancelOutOrderNo: 'string',
      flowId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelTwcNotaryContractPaysingletradeResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 被取消的某一期代扣订单id
  canceledOutTradeNo?: string;
  // 错误码，0表示成功
  code?: number;
  // 错误信息描述
  errMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      canceledOutTradeNo: 'canceled_out_trade_no',
      code: 'code',
      errMessage: 'err_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      canceledOutTradeNo: 'string',
      code: 'number',
      errMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyTwcNotaryContractCallbackkeyRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyTwcNotaryContractCallbackkeyResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 业务码，0表示成功
  code?: number;
  // 加签使用的key
  key?: string;
  // 业务码信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      key: 'key',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'number',
      key: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeployTwcNotaryMytfTappRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // tappId
  tappId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      tappId: 'tapp_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      tappId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeployTwcNotaryMytfTappResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CheckTwcNotaryEpidentityTwometaRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 认证企业名称。
  epCertName?: string;
  // 企业证件号码。
  epCertNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      epCertName: 'string',
      epCertNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckTwcNotaryEpidentityTwometaResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 0:核验成功 1:企业信息有误 2:企业非正常营业
  code?: string;
  // 企业状态。
  enterpriseStatus?: string;
  // 营业期限。
  openTime?: string;
  // 核验是否通过。
  passed?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      enterpriseStatus: 'enterprise_status',
      openTime: 'open_time',
      passed: 'passed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      enterpriseStatus: 'string',
      openTime: 'string',
      passed: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckTwcNotaryEpidentityThreemetaRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 认证企业名称。
  epCertName?: string;
  // 企业证件号码。
  epCertNo?: string;
  // 企业法人姓名。
  legalPersonCertName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
      legalPersonCertName: 'legal_person_cert_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      epCertName: 'string',
      epCertNo: 'string',
      legalPersonCertName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckTwcNotaryEpidentityThreemetaResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 0:核验成功 1:企业信息有误 2:企业非正常营业
  code?: string;
  // 企业状态。
  enterpriseStatus?: string;
  // 营业期限。
  openTime?: string;
  // 核验是否通过。
  passed?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      enterpriseStatus: 'enterprise_status',
      openTime: 'open_time',
      passed: 'passed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      enterpriseStatus: 'string',
      openTime: 'string',
      passed: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckTwcNotaryEpidentityFourmetaRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 认证企业名称。
  epCertName?: string;
  // 企业证件号码。
  epCertNo?: string;
  // 企业法人姓名。
  legalPersonCertName?: string;
  // 企业法人身份证号码。
  legalPersonCertNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CheckTwcNotaryEpidentityFourmetaResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 0:核验成功 1:企业信息有误 2:企业非正常营业
  code?: string;
  // 企业状态。
  enterpriseStatus?: string;
  // 营业期限。
  openTime?: string;
  // 核验是否通过。
  passed?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      enterpriseStatus: 'enterprise_status',
      openTime: 'open_time',
      passed: 'passed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      enterpriseStatus: 'string',
      openTime: 'string',
      passed: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckTwcNotaryNotarizationOrderRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 公证订单ID号
  orderId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckTwcNotaryNotarizationOrderResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 下单的业务类型ID列表
  bizId?: string[];
  // 实人认证接口调用授权码，与公证订单一一对应，有效次数默认为3次，超过调用次数则失效
  faceAuthCode?: string;
  // 平台公证机构ID
  orgId?: string;
  // 下单客户的账号ID
  userId?: string;
  // 是否为合法订单
  valid?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizId: 'biz_id',
      faceAuthCode: 'face_auth_code',
      orgId: 'org_id',
      userId: 'user_id',
      valid: 'valid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizId: { 'type': 'array', 'itemType': 'string' },
      faceAuthCode: 'string',
      orgId: 'string',
      userId: 'string',
      valid: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTwcNotaryNotarizationOrderRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 公证订单ID
  orderId?: string;
  // 如果出证失败，需要给出失败原因
  reason?: string;
  // 出证状态的枚举值
  status?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      orderId: 'order_id',
      reason: 'reason',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      orderId: 'string',
      reason: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTwcNotaryNotarizationOrderResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class SetTwcNotaryNotarizationOrderRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 公证事项ID
  bizCode?: string;
  // 需设置的属性名称
  key?: string;
  // 公证订单ID
  orderId?: string;
  // 被设置字段的值
  value?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class SetTwcNotaryNotarizationOrderResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class InitTwcNotaryIdentificationFaceauthRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 授权码，针对某些特定场景使用，非必填
  authCode?: string;
  // 认证人的姓名
  certName?: string;
  // 被验证者的身份证号码
  certNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      authCode: 'auth_code',
      certName: 'cert_name',
      certNo: 'cert_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      authCode: 'string',
      certName: 'string',
      certNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitTwcNotaryIdentificationFaceauthResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CertifyTwcNotaryIdentificationFaceauthRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 授权码，针对某些特定场景使用，非必填
  authCode?: string;
  // 认证流程结束回调通知地址，非必传
  callbackUrl?: string;
  // 实人认证流程ID
  certifyId?: string;
  // 认证结束后跳转地址，非必填
  redirectUrl?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      authCode: 'auth_code',
      callbackUrl: 'callback_url',
      certifyId: 'certify_id',
      redirectUrl: 'redirect_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      authCode: 'string',
      callbackUrl: 'string',
      certifyId: 'string',
      redirectUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CertifyTwcNotaryIdentificationFaceauthResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryTwcNotaryIdentificationFaceauthRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 授权码，针对某些特定场景使用，非必填
  authCode?: string;
  // 实人认证流程ID
  certifyId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      authCode: 'auth_code',
      certifyId: 'certify_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      authCode: 'string',
      certifyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotaryIdentificationFaceauthResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryTwcNotaryEnterpriseFaceauthRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 企业法人认证查询
  bizNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      bizNo: 'biz_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      bizNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotaryEnterpriseFaceauthResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class InitTwcNotaryEnterpriseFaceauthRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 企业名称
  epCertName?: string;
  // 企业证件号
  epCertNo?: string;
  // 企业证件类型（NATIONAL_LEGAL（工商注册号）或 NATIONAL_LEGAL_MERGE （ 社会统一信用代码））
  epCertType?: string;
  // 企业法人姓名
  legalPersonCertName?: string;
  // 企业法人身份证号（目前仅支持身份证号）
  legalPersonCertNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class InitTwcNotaryEnterpriseFaceauthResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CertifyTwcNotaryEnterpriseFaceauthRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 业务唯一性标识
  bizNo?: string;
  // 回调通知地址
  callbackUrl?: string;
  // 认证完成后回跳地址
  redirectUrl?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      bizNo: 'biz_no',
      callbackUrl: 'callback_url',
      redirectUrl: 'redirect_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      bizNo: 'string',
      callbackUrl: 'string',
      redirectUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CertifyTwcNotaryEnterpriseFaceauthResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryLeaseOrderRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 账号标识，可弃用
  accountId?: string;
  // 支付宝交易金额
  alipayOrderAmount?: number;
  // 支付宝订单号
  alipayOrderNo?: string;
  // 支付宝交易总金额
  alipayOrderTotalAmount?: number;
  // 免押金额
  depositWaiveAmount?: number;
  // 保险缴费金额，单位分
  insuranceBillAmount?: number;
  // 保险缴费单号，insured为True时必填，仅支持数字和字母，长度20
  insuranceBillNo?: string;
  // 保险缴费北京时间，格式为"YYYYMMDDHHMISS"，时区为UTC+8
  insuranceBillTime?: string;
  // 订单总保额，单位分，insured为True时必填
  insuranceCoverage?: number;
  // 保单号，insured为True时必填，仅支持数字和字母
  insuranceOrderNo?: string;
  // 保单查询地址，insured为True时必填
  insuranceOrderUrl?: string;
  // 订单产品保额，单位分，insured为True时必填
  insuranceProductCoverage?: number;
  // 是否投保，默认为True
  insured?: boolean;
  // 商品名称
  itemName?: string;
  // 商品市场价格
  itemPrice?: number;
  // 商品类目
  itemType?: string;
  // 商户支付宝账号
  merchantAlipayAccount?: string;
  // 商户支付宝ID
  merchantAlipayId?: string;
  // 商户名称
  merchantName?: string;
  // 商户单号
  merchantOrderNo?: string;
  // 支付渠道，包括支付宝（Alipay）、第三方收单机构（ThirdParty）、信用卡（CreditCard）、银行转账（BankTransfer）、微信（WeChatPay）、其他（Other）
  paymentChannel?: string;
  // 租约结束日期
  tenancyTermEnd?: number;
  // 租约起始日期
  tenancyTermStart?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      accountId: 'account_id',
      alipayOrderAmount: 'alipay_order_amount',
      alipayOrderNo: 'alipay_order_no',
      alipayOrderTotalAmount: 'alipay_order_total_amount',
      depositWaiveAmount: 'deposit_waive_amount',
      insuranceBillAmount: 'insurance_bill_amount',
      insuranceBillNo: 'insurance_bill_no',
      insuranceBillTime: 'insurance_bill_time',
      insuranceCoverage: 'insurance_coverage',
      insuranceOrderNo: 'insurance_order_no',
      insuranceOrderUrl: 'insurance_order_url',
      insuranceProductCoverage: 'insurance_product_coverage',
      insured: 'insured',
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
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      accountId: 'string',
      alipayOrderAmount: 'number',
      alipayOrderNo: 'string',
      alipayOrderTotalAmount: 'number',
      depositWaiveAmount: 'number',
      insuranceBillAmount: 'number',
      insuranceBillNo: 'string',
      insuranceBillTime: 'string',
      insuranceCoverage: 'number',
      insuranceOrderNo: 'string',
      insuranceOrderUrl: 'string',
      insuranceProductCoverage: 'number',
      insured: 'boolean',
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryLeaseOrderResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryNotarizationBillRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
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
  // 是否为酬金分润方式，是则按照订金额一定比例分润，否则直接支付订单金额
  feeSplitting?: boolean;
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
  scenario?: string;
  // 申请者身份类型，1个人，2企业
  userType?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      feeSplitting: 'fee_splitting',
      legalPersonName: 'legal_person_name',
      orderId: 'order_id',
      orgId: 'org_id',
      paymentAmount: 'payment_amount',
      phone: 'phone',
      scenario: 'scenario',
      userType: 'user_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
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
      feeSplitting: 'boolean',
      legalPersonName: 'string',
      orderId: 'string',
      orgId: 'string',
      paymentAmount: 'number',
      phone: 'string',
      scenario: 'string',
      userType: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryNotarizationBillResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class InitTwcNotaryCertificationRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 申请人的身份信息
  applier?: Identity;
  // 存证证明所要展示的存证信息，可填多个
  notaryInfo?: NotaryInfo[];
  // 存证证明的类型：STANDARD（标准存证证明）或COPYRIGHT（版权存证证明），默认为COPYRIGHT
  type?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      applier: 'applier',
      notaryInfo: 'notary_info',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      applier: Identity,
      notaryInfo: { 'type': 'array', 'itemType': NotaryInfo },
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitTwcNotaryCertificationResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryTwcNotaryCertificationRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 存证证明申请的订单ID
  orderId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotaryCertificationResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class GetTwcNotaryTsrCertificateRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTwcNotaryTsrCertificateResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class SaveTwcNotaryJointconstraintRecordRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 收款账户
  beneficiaryAccountCode?: string;
  // 收款账户类型
  // 
  // 1：支付宝
  beneficiaryAccountType?: number;
  // 应收方证件号码
  // 
  // 
  beneficiaryCertNumber?: string;
  // 应收方证件类型
  // 
  // 0：统一社会信用代码
  // 
  // 1：身份证号码
  beneficiaryCertType?: number;
  // 	
  // 应收方类型
  // 
  // 0：企业
  // 
  // 1：个人
  beneficiaryType?: number;
  // 合同编号
  contractCode?: string;
  // 合同履行记录标签
  contractFulfillmentCode?: string;
  // 合同名称
  contractName?: string;
  // 合同存证哈希
  contractTxhash?: string;
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
  payerCertNumber?: string;
  // 应付方证件类型
  // 
  // 0：统一社会信用代码
  // 
  // 1：身份证号码
  payerCertType?: number;
  // 应付方类型
  // 
  // 0：企业
  // 
  // 1：个人
  payerType?: number;
  // 履约标的金额
  // 
  // 
  paymentAmount?: string;
  // 履约宽限期，单位：天
  // 
  // 
  paymentDateBuffer?: number;
  // 目标履约日期
  // 
  // 
  paymentDeadline?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class SaveTwcNotaryJointconstraintRecordResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class DeleteTwcNotaryJointconstraintRecordRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 合同编号
  // 
  // 
  contractCode?: string;
  // 合同履行记录标签
  // 
  // 
  contractFulfillmentCode?: string;
  // 应付方证件号码
  // 
  // 
  payerCertNumber?: string;
  // 应付方证件类型
  // 
  // 0：统一社会信用代码
  // 
  // 1：身份证号码
  payerCertType?: number;
  // 应付方类型
  // 
  // 0：企业
  // 
  // 1：个人
  payerType?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class DeleteTwcNotaryJointconstraintRecordResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryTwcNotaryJointconstraintBreachrecordRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 对象实体证件号码
  // 
  // 
  certNumber?: string;
  // 对象实体证件类型
  // 
  // 0：统一社会信用代码
  // 
  // 1：身份证号码
  certType?: number;
  // 查询对象实体类型
  // 
  // 0：企业
  // 
  // 1：个人
  entityType?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      certNumber: 'cert_number',
      certType: 'cert_type',
      entityType: 'entity_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      certNumber: 'string',
      certType: 'number',
      entityType: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotaryJointconstraintBreachrecordResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 违约次数
  // 
  // 
  breachCount?: number;
  // 是否存在履行记录
  // 
  // 
  hasRecord?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      breachCount: 'breach_count',
      hasRecord: 'has_record',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      breachCount: 'number',
      hasRecord: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryTransRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 存证关联实体（个人/企业）的身份识别信息
  customer?: Identity;
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
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateTwcNotaryTransResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class GetTwcNotaryTransRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 存证事务ID
  transactionId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      transactionId: 'transaction_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      transactionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTwcNotaryTransResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryTextRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 哈希算法，目前仅支持 SHA256
  hashAlgorithm?: string;
  // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
  location?: Location;
  // 存证内容
  notaryContent?: string;
  // 描述本条存证在存证事务中的阶段，用户可自行维护
  phase?: string;
  // 扩展属性
  properties?: string;
  // 文本存证类型，支持源文本/文本哈希
  textNotaryType?: string;
  // 存证事务id
  transactionId?: string;
  // 是否使用可信时间戳，默认为false
  tsr?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      hashAlgorithm: 'hash_algorithm',
      location: 'location',
      notaryContent: 'notary_content',
      phase: 'phase',
      properties: 'properties',
      textNotaryType: 'text_notary_type',
      transactionId: 'transaction_id',
      tsr: 'tsr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      hashAlgorithm: 'string',
      location: Location,
      notaryContent: 'string',
      phase: 'string',
      properties: 'string',
      textNotaryType: 'string',
      transactionId: 'string',
      tsr: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryTextResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class GetTwcNotaryTextRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
  location?: Location;
  // 描述本条存证在存证事务中的阶段，用户可自行维护
  phase?: string;
  // 扩展属性
  properties?: string;
  // 存证事务id
  transactionId?: string;
  // 存证凭据
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class GetTwcNotaryTextResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 存证信息
  content?: string;
  // 哈希算法
  hashAlgorithm?: string;
  // 文本存证类型
  textNotaryType?: string;
  // 可信信息
  tsr?: TsrResponse;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      content: 'content',
      hashAlgorithm: 'hash_algorithm',
      textNotaryType: 'text_notary_type',
      tsr: 'tsr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      content: 'string',
      hashAlgorithm: 'string',
      textNotaryType: 'string',
      tsr: TsrResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryFileRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 文件存证模式，目前仅支持 FILE_RAW 和 FILE_HASH
  fileNotaryType?: string;
  // 当文件存证模式为FILE_HASH时，用户可以指定该参数。当前服务仅支持 SHA256，若不填写，则默认值为 SHA256。
  hashAlgorithm?: string;
  // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
  location?: Location;
  // 存证文件内容，对文件内容做base64编码后得到。例如FILE_RAW模式下，文件内容为“test”，那么base64编码后的结果则为“dGVzdA==”。如果是FILE_HASh模式，则该字段直接为文件hash。
  notaryFile?: string;
  // 存证文件名称
  notaryName?: string;
  // 描述本条存证在存证事务中的阶段，用户可自行维护
  phase?: string;
  // 扩展属性
  properties?: string;
  // 存证事务ID
  transactionId?: string;
  // 是否使用可信时间戳，默认为false
  tsr?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateTwcNotaryFileResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class GetTwcNotaryFileRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
  location?: Location;
  // 描述本条存证在存证事务中的阶段，用户可自行维护
  phase?: string;
  // 扩展属性
  properties?: string;
  // 存证事务ID
  transactionId?: string;
  // 存证凭据
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class GetTwcNotaryFileResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotarySourceRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
  location?: Location;
  // 描述本条存证在存证事务中的阶段，用户可自行维护
  phase?: string;
  // 扩展属性
  properties?: string;
  // 原文文件描述
  sourceDesc?: string;
  // 存证文件内容，对文件内容做base64编码后得到。例如文件内容为“test”，那么base64编码后的结果则为“dGVzdA==”
  sourceFile?: string;
  // 存证原文名称
  sourceName?: string;
  // 存证事务ID
  transactionId?: string;
  // 是否使用可信时间戳，默认为false
  tsr?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateTwcNotarySourceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class GetTwcNotarySourceRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
  location?: Location;
  // 描述本条存证在存证事务中的阶段，用户可自行维护
  phase?: string;
  // 扩展属性
  properties?: string;
  // 存证事务id
  transactionId?: string;
  // 存证凭据
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class GetTwcNotarySourceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CheckTwcNotaryStatusRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 存证核验数据组
  notaryCheckMetaList?: NotaryCheckMeta[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      notaryCheckMetaList: 'notary_check_meta_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      notaryCheckMetaList: { 'type': 'array', 'itemType': NotaryCheckMeta },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckTwcNotaryStatusResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class DeployTwcNotaryLeaseContractRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 租赁服务平台对应的合约ID
  contractId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      contractId: 'contract_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      contractId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeployTwcNotaryLeaseContractResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryLeaseProductinfoRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 合约id
  applicationId?: string;
  // 保证金  精确到毫厘，即123400表示12.34元
  depositPrice?: number;
  // 商品目录额外信息
  extraInfo?: string;
  // 安装拆卸费 精确到毫厘，即123400表示12.34元
  installPrice?: number;
  // 租赁服务平台id
  leaseId?: string;
  // 一级分类
  mainClass?: string;
  // 商品编码 长度不可超过50
  productId?: string;
  // 商品名称
  productName?: string;
  // 采购价  精确到毫厘，即123400表示12.34元
  productPrice?: number;
  // 出租详细信息
  rentinfos?: RentInfo[];
  // 二级分类
  subClass?: string;
  // 供应商id
  supplierId?: string;
  // 供应商
  supplierName?: string;
  // 供应商对该产品版本
  supplierVersion?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      applicationId: 'application_id',
      depositPrice: 'deposit_price',
      extraInfo: 'extra_info',
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
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      applicationId: 'string',
      depositPrice: 'number',
      extraInfo: 'string',
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryLeaseProductinfoResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class AuthTwcNotaryLeaseContractRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 融资服务平台ID 长度不可超过50
  creditId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      creditId: 'credit_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      creditId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthTwcNotaryLeaseContractResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryLeaseUserinfoRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 支付宝账号信息
  alipayUid?: string;
  // 融资租赁业务id，由资方控制台生成返回
  applicationId?: string;
  // 是否启动异步
  async?: number;
  // 融资租赁用户信息额外字段
  extraInfo?: string;
  // 承租企业统一社会信用代码 长度不可超过50
  leaseCorpId?: string;
  // 承租企业名称 长度不可超过50
  leaseCorpName?: string;
  // 承租法定代表人姓名 长度不可超过50
  leaseCorpOwnerName?: string;
  // 用户登录名，租赁平台会员ID/支付宝ID 长度不可超过50
  loginId?: string;
  // 用户登录时间 格式为2019-8-31 12:00:00
  loginTime?: string;
  // 用户登录名类型 1.商户会员2.支付宝3.其他
  loginType?: number;
  // 订单id 长度不可超过50
  orderId?: string;
  // 额外通知第三方，如果需要通知相关方外的第三方，需要在此设置关联方的租户id，若不设置则只通知资方
  relatedNotify?: string[];
  // 区块链认证Hash，若为支付宝实人，必填
  userBlockchainVerifyHash?: string;
  // 承租人电子邮件，法院/仲裁电子送达必填项，长度不超过5
  userEmail?: string;
  // 承租人身份证
  userId?: string;
  // 承租人身份证照片哈希
  userImageHash?: string;
  // 承租人身份证照片存证交易哈希
  userImageTxHash?: string;
  // 承租人姓名 长度不可超过10
  userName?: string;
  // 承租人手机号
  userPhoneNumber?: string;
  // 身份认证类型 1支付宝实人，2芝麻实人，3非蚂蚁实人
  userType?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      relatedNotify: 'related_notify',
      userBlockchainVerifyHash: 'user_blockchain_verify_hash',
      userEmail: 'user_email',
      userId: 'user_id',
      userImageHash: 'user_image_hash',
      userImageTxHash: 'user_image_tx_hash',
      userName: 'user_name',
      userPhoneNumber: 'user_phone_number',
      userType: 'user_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
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
      relatedNotify: { 'type': 'array', 'itemType': 'string' },
      userBlockchainVerifyHash: 'string',
      userEmail: 'string',
      userId: 'string',
      userImageHash: 'string',
      userImageTxHash: 'string',
      userName: 'string',
      userPhoneNumber: 'string',
      userType: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryLeaseUserinfoResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryLeaseOrderinfoRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 实际预授权金额，芝麻信用免押金额 精确到毫厘，即123400表示12.34元
  acutalPreAuthFree?: number;
  // 融资租赁业务id，由资方控制台创建返回
  applicationId?: string;
  // 是否启动异步处理订单
  async?: number;
  // 采购发票地址
  billUrl?: string;
  // 到期买断价 精确到毫厘，即123400表示12.34元
  buyOutPrice?: number;
  // 市编码
  cityCode?: string;
  // 免押金额 精确到毫厘，即123400表示12.34元
  depositFree?: number;
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
  leaseServiceFileHash?: string;
  // 融资租赁及服务协议文件链上存证交易哈希
  leaseServiceFileTxHash?: string;
  // 订单创建时间 格式为2019-8-31 12:00:00
  orderCreateTime?: string;
  // 订单id 长度不可超过50
  orderId?: string;
  // 支付订单ID
  orderPayId?: string;
  // 订单支付时间 格式为2019-8-31 12:00:00
  orderPayTime?: string;
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
  productInfo?: ProductInfo[];
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
  rentPricePerMonth?: number;
  // 租期
  rentTerm?: number;
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
  userAddress?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryLeaseOrderinfoResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryLeasePromiseRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 融资租赁业务id，由资方控制台生成返回
  applicationId?: string;
  // 是否启动异步订单处理
  async?: number;
  // 审核方式,0为系统自动审核，1为人工审核
  auditMode?: number;
  // 清分机构金融科技租户ID
  clearingOrg?: string;
  // 放款机构金融科技租户ID
  creditOrg?: string;
  // 第一次还款时的日期
  firstPayDate?: string;
  // 融资机构的阿里uid
  leaseAlipayUid?: string;
  // 宽限期，精确到毫秒
  limit?: number;
  // 订单id 长度不可超过50
  orderId?: string;
  // 应付租金，精确到毫厘，即123400表示12.34元
  payDateList?: string[];
  // 租赁方承诺额外字段
  payExtraInfoList?: string[];
  // 应付租金 精确到毫厘，即123400表示12.34元	
  // 
  payMoney?: number;
  // 应付租金 精确到毫厘，即123400表示12.34元
  payMoneyList?: number[];
  // 应付租金的期数
  payPeriod?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      applicationId: 'application_id',
      async: 'async',
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
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      applicationId: 'string',
      async: 'number',
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryLeasePromiseResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryLeaseVerifyinfoRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
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
  leaseId?: string;
  // 放款流水单号
  loan?: string;
  // 订单id 长度不可超过50
  orderId?: string;
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
  verifyResult?: number;
  // 付款汇款凭证 民盛转账成功后上传
  voucher?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryLeaseVerifyinfoResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryLeaseCreditpromiseRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 融资租赁业务id，由资方控制台创建返回
  applicationId?: string;
  // 是否启动异步订单处理
  async?: number;
  // 融资租赁承诺额外字段
  creditPromiseExtraInfoList?: string[];
  // 租赁平台金融科技id
  leaseId?: string;
  // 订单id 长度不可超过50
  orderId?: string;
  // 垫付金额
  payInAdvanceMoney?: number;
  // 垫付金额，精确到毫厘，即123400表示12.34元
  payInAdvanceMoneyList?: number[];
  // 垫付日期
  payInAdvanceTime?: string;
  // 垫付日  格式为2019-8-31 12:00:00
  payInAdvanceTimeList?: string[];
  // 根据融资租赁合同及其补充协议哈希
  promiseHash?: string;
  // 根据融资租赁合同及其补充协议存证交易hash
  promiseTxHash?: string;
  // 归还金额
  returnMoney?: number;
  // 还款金额，精确到毫厘，即123400表示12.34元
  returnMoneyList?: number[];
  // 还款比例，精确到小数点后四位 12.34% 表示为1234
  returnRate?: number;
  // 归还日，格式为"2019-07-31 12:00:00"
  returnTime?: string;
  // 归还日，格式为"2019-07-31 12:00:00"
  returnTimeList?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      applicationId: 'application_id',
      async: 'async',
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
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      applicationId: 'string',
      async: 'number',
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryLeaseCreditpromiseResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryLeaseDisburseinfoRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 共管账户，网商清分
  activeAccount?: string;
  // 对结果的简要描述信息
  activeResultDesc?: string;
  // 成功/失败 0表示失败，1表示成功
  activeResultStatus?: number;
  // 授信成功日期，格式为"2019-07-31 12:00:00"
  activeReturnDate?: string;
  // 本金+利息，精确到毫厘，即123400表示12.34元
  activeReturnMoney?: number;
  // 支用期限，精确到毫秒
  disburseLimit?: number;
  // 支用金额，精确到毫厘，即123400表示12.34元
  disburseMoney?: number;
  // 支用科目，服务费/租金，精确到毫厘，即123400表示12.34元
  disburseService?: number;
  // 逾期天数，支用到期日开始计算，天数为单位
  exceedDuration?: number;
  // 1未还款，2已还款
  exceedPayBackStatus?: number;
  // 逾期利率，精确到小数点后四位 12.34% 表示为1234
  exceedRate?: number;
  // 逾期应还款总额，本金+利息+逾期利息，精确到毫厘，即123400表示12.34元
  exceedReturnMoney?: number;
  // 贷款利率,银行同步利率，年化8%-15%,精确到小数点后四位 12.34% 表示为1234
  loanRate?: number;
  // 订单id 长度不可超过50
  orderId?: string;
  // 到期还款日，T+支用期限，节假日顺延至第一个工作日，格式为"2019-07-31 12:00:00"
  payBackDate?: string;
  // 到期还款金额，本金+利息，精确到毫厘，即123400表示12.34元
  payBackMoney?: number;
  // 应还利息，系统自动计算当日应还利息（T+1），精确到毫厘，即123400表示12.34元
  returnInterest?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateTwcNotaryLeaseDisburseinfoResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryTwcNotaryLeaseOrderinfoRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 融资租赁业务id，由资方控制台生成返回
  applicationId?: string;
  // 租赁平台金融科技租户id
  leaseId?: string;
  // 订单id 长度不可超过50
  orderId?: string;
  // 阶段描述
  phaseInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class QueryTwcNotaryLeaseOrderinfoResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryFinanceTextnotaryRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 反欺诈查询对应的身份证号码
  certNo?: string;
  // 哈希算法
  hashAlgorithm?: string;
  // 位置描述信息
  location?: Location;
  // 反欺诈查询需要的手机号码
  mobile?: string;
  // 存证阶段，用户可自行维护
  phase?: string;
  // 扩展属性
  properties?: string;
  // 文本哈希
  textHash?: string;
  // 本次请求的唯一id
  thirdMessageId?: string;
  // 存证事务ID
  transactionId?: string;
  // 是否使用可信时间戳
  tsr?: boolean;
  // 反欺诈查询需要的姓名
  userName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      certNo: 'cert_no',
      hashAlgorithm: 'hash_algorithm',
      location: 'location',
      mobile: 'mobile',
      phase: 'phase',
      properties: 'properties',
      textHash: 'text_hash',
      thirdMessageId: 'third_message_id',
      transactionId: 'transaction_id',
      tsr: 'tsr',
      userName: 'user_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      certNo: 'string',
      hashAlgorithm: 'string',
      location: Location,
      mobile: 'string',
      phase: 'string',
      properties: 'string',
      textHash: 'string',
      thirdMessageId: 'string',
      transactionId: 'string',
      tsr: 'boolean',
      userName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryFinanceTextnotaryResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class GetTwcNotaryFinanceTextnotaryRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 位置信息
  location?: Location;
  // 存证阶段
  phase?: string;
  // 扩展属性，用户可自行维护
  properties?: string;
  // 存证事务ID
  transactionId?: string;
  // 交易哈希
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class GetTwcNotaryFinanceTextnotaryResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 哈希算法
  hashAlgorithm?: string;
  // 存证阶段
  phase?: string;
  // 扩展属性
  properties?: string;
  // 文本哈希
  textHash?: string;
  // 可信时间戳
  tsr?: TsrResponse;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      hashAlgorithm: 'hash_algorithm',
      phase: 'phase',
      properties: 'properties',
      textHash: 'text_hash',
      tsr: 'tsr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      hashAlgorithm: 'string',
      phase: 'string',
      properties: 'string',
      textHash: 'string',
      tsr: TsrResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryFinanceFilenotaryRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 反欺诈需要的证件号码
  certNo?: string;
  // 创建日期，时间戳类型，单位毫秒
  createdDate?: number;
  // 存证文件名称
  fileName?: string;
  // 文件存证类型，支持小于 1M 源文件或者文件哈希
  fileNotaryType?: string;
  // 文件大小，单位 Bytes
  fileSize?: number;
  // 文件类型
  fileType?: string;
  // 文件地址
  fileUrl?: string;
  // 哈希算法
  hashAlgorithm?: string;
  // 位置信息
  location?: Location;
  // 反欺诈查询需要的手机号
  mobile?: string;
  // 文件存证内容
  notaryContent?: string;
  // 存证阶段
  phase?: string;
  // 扩展属性，用户可自行维护
  properties?: string;
  // 本次请求的唯一ID
  thirdMessageId?: string;
  // 存证事务ID
  transactionId?: string;
  // 是否使用可信时间戳
  tsr?: boolean;
  // 反欺诈查询需要的证件上的姓名
  userName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      thirdMessageId: 'third_message_id',
      transactionId: 'transaction_id',
      tsr: 'tsr',
      userName: 'user_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
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
      thirdMessageId: 'string',
      transactionId: 'string',
      tsr: 'boolean',
      userName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryFinanceFilenotaryResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class GetTwcNotaryFinanceFilenotaryRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 位置信息
  location?: Location;
  // 存证状态
  phase?: string;
  // 扩展属性，用户自行维护
  properties?: string;
  // 存证事务ID
  transactionId?: string;
  // 交易哈希
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class GetTwcNotaryFinanceFilenotaryResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CheckTwcNotaryIndustryNotaryRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 行业类型
  industryType?: string;
  // 核验数据列表
  notaryCheckMetaList?: NotaryCheckMeta[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      industryType: 'industry_type',
      notaryCheckMetaList: 'notary_check_meta_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      industryType: 'string',
      notaryCheckMetaList: { 'type': 'array', 'itemType': NotaryCheckMeta },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckTwcNotaryIndustryNotaryResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UpdateTwcNotaryLeaseContractRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 合约业务层id
  applicationId?: string;
  // 被升级的合约名称
  contractId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      applicationId: 'application_id',
      contractId: 'contract_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      applicationId: 'string',
      contractId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTwcNotaryLeaseContractResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotarySueBreakpromiseinfoRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 违约金额，精确到毫厘，即123400表示12.34元
  breakPromiseMoney?: number;
  // 所属行业
  businessClass?: string;
  // 法院唯一标识
  courtId?: string;
  // 管辖法院名称
  courtName?: string;
  // 当事人邮箱地址
  email?: string;
  // 商户统一社会信用代码或个人身份证
  initiatorId?: string;
  // 商户或个人名称
  // 
  initiatorName?: string;
  // 合同唯一标识
  // 
  orderId?: string;
  // 当事人手机号
  phoneNumber?: string;
  // 诉前Id
  preSueId?: string;
  // 应履约日期，格式为"2019-07-31 12:00:00"
  promiseDate?: string;
  // 宽限期(天数，从应履约日期到进行诉前违约惩戒的自然日数）
  promiseLimit?: number;
  // 起诉期，格式为"2019-07-31 12:00:00"
  // 
  sueDate?: string;
  // 当事人身份证号
  userId?: string;
  // 当事人姓名
  userName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      breakPromiseMoney: 'break_promise_money',
      businessClass: 'business_class',
      courtId: 'court_id',
      courtName: 'court_name',
      email: 'email',
      initiatorId: 'initiator_id',
      initiatorName: 'initiator_name',
      orderId: 'order_id',
      phoneNumber: 'phone_number',
      preSueId: 'pre_sue_id',
      promiseDate: 'promise_date',
      promiseLimit: 'promise_limit',
      sueDate: 'sue_date',
      userId: 'user_id',
      userName: 'user_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      breakPromiseMoney: 'number',
      businessClass: 'string',
      courtId: 'string',
      courtName: 'string',
      email: 'string',
      initiatorId: 'string',
      initiatorName: 'string',
      orderId: 'string',
      phoneNumber: 'string',
      preSueId: 'string',
      promiseDate: 'string',
      promiseLimit: 'number',
      sueDate: 'string',
      userId: 'string',
      userName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotarySueBreakpromiseinfoResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 状态码,0表示成功
  // 
  code?: string;
  // 错误信息
  errMessage?: string;
  // 成功插入违约数据到区块链的交易哈希
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
      code: 'string',
      errMessage: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTwcNotarySueBreakpromiseinfoRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 违约金额，精确到毫厘，即123400表示12.34元
  breakPromiseMoney?: number;
  // 所属行业
  // 
  businessClass?: string;
  // 当事人电子邮箱地址
  email?: string;
  // 合同唯一标识，不可更新
  // 
  orderId?: string;
  // 当事人手机号
  phoneNumber?: string;
  // 诉前Id，不可更新
  // 
  preSueId?: string;
  // 应履约日期，格式为"2019-07-31 12:00:00"
  promiseDate?: string;
  // 宽限期(天数，从应履约日期到进行诉前违约惩戒的自然日数）
  promiseLimit?: number;
  // 起诉期，格式为"2019-07-31 12:00:00"
  sueDate?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      breakPromiseMoney: 'break_promise_money',
      businessClass: 'business_class',
      email: 'email',
      orderId: 'order_id',
      phoneNumber: 'phone_number',
      preSueId: 'pre_sue_id',
      promiseDate: 'promise_date',
      promiseLimit: 'promise_limit',
      sueDate: 'sue_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      breakPromiseMoney: 'number',
      businessClass: 'string',
      email: 'string',
      orderId: 'string',
      phoneNumber: 'string',
      preSueId: 'string',
      promiseDate: 'string',
      promiseLimit: 'number',
      sueDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTwcNotarySueBreakpromiseinfoResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 状态码,0表示成功
  // 
  code?: number;
  // 错误信息
  errMessage?: string;
  // 违约案件信息提交对应的区块链交易哈希
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

export class DeleteTwcNotarySueBreakpromiseinfoRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 合同唯一标识，不可更新
  orderId?: string;
  // 诉前id，不可更新
  preSueId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      orderId: 'order_id',
      preSueId: 'pre_sue_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      orderId: 'string',
      preSueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteTwcNotarySueBreakpromiseinfoResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 状态码 0表示成功
  code?: number;
  // 错误信息
  errMessage?: string;
  // 违约案件信息提交对应的区块链交易哈希
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

export class QueryTwcNotarySueUserinfoRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 被查者身份证号
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotarySueUserinfoResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UpdateTwcNotarySueExeplarycontractRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 合约名称
  contractId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      contractId: 'contract_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      contractId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTwcNotarySueExeplarycontractResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 状态码 0表示成功
  code?: number;
  // 错误信息
  errMessage?: string;
  // 0xabcdef123324234
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

export class UpdateTwcNotarySueExemplaryrevertRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 用户管理合约id
  contractId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      contractId: 'contract_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      contractId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTwcNotarySueExemplaryrevertResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 错误码 0表示成功
  code?: number;
  // 错误信息描述
  errMessage?: string;
  // 回退合约所对应的区块链交易哈希
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

export class CreateTwcNotaryLeaseAuditRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
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
  leaseId?: string;
  // 融资机构审核状态，0.审核中1.审核失败2.审核成功
  manualAudit?: number;
  // 融资结构审核说明，非必填，审核失败必填失败原因
  manualAuditComments?: string;
  // 订单id 长度不可超过50
  // 
  orderId?: string;
  // 额外通知第三方，如果需要通知相关方外的第三方，需要在此设置关联方的租户id，若不设置则只通知资方	
  // 
  relatedNotify?: string[];
  // 总审核的个数
  totalAuditNumber?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      applicationId: 'application_id',
      async: 'async',
      batchIndex: 'batch_index',
      currentAuditIndex: 'current_audit_index',
      extraInfo: 'extra_info',
      leaseId: 'lease_id',
      manualAudit: 'manual_audit',
      manualAuditComments: 'manual_audit_comments',
      orderId: 'order_id',
      relatedNotify: 'related_notify',
      totalAuditNumber: 'total_audit_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      applicationId: 'string',
      async: 'number',
      batchIndex: 'string',
      currentAuditIndex: 'number',
      extraInfo: 'string',
      leaseId: 'string',
      manualAudit: 'number',
      manualAuditComments: 'string',
      orderId: 'string',
      relatedNotify: { 'type': 'array', 'itemType': 'string' },
      totalAuditNumber: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryLeaseAuditResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryLeasePaymentfileRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 融资租赁业务id，由资方控制台生成
  applicationId?: string;
  // 是否启动订单的异步处理
  async?: number;
  // 融资租赁额外字段
  extraInfo?: string;
  // 租赁服务平台ID 长度不可超过50
  leaseId?: string;
  // 订单id 长度不可超过50
  orderId?: string;
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
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateTwcNotaryLeasePaymentfileResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryLeaseRentalRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 融资租赁业务id，由资方控制台生成返回
  applicationId?: string;
  // 是否启动订单的异步处理
  async?: number;
  // 手续费，如通过预授权、代扣的方式规划，必填
  charge?: number;
  // 融资租赁用户还款额外字段
  extraInfo?: string;
  // 是否本订单所有租金还款状态结束
  isFinish?: boolean;
  // 租期编号，从1开始
  leaseTermIndex?: number;
  // 订单id 长度不可超过50
  orderId?: string;
  // 剩余租金总数,会核验剩余租金与承诺等额
  remainRental?: number;
  // 剩余归还期数
  remainTerm?: number;
  // 租金归还金额,精确到毫厘，即123400表示12.34元
  rentalMoney?: number;
  // 租金归还状态，1.足额归还2.部分归还3.未归还
  rentalReturnState?: number;
  // 归还时间，格式为"2019-07-31 12:00:00"
  returnTime?: string;
  // 还款凭证编号，不超过128字符，1.支付宝流水号
  returnVoucherSerial?: string;
  // 还款凭证类型，1.支付宝2.平台代收（客户主动还款）3.其他
  returnVoucherType?: number;
  // 归还方式，1.预授权代扣2.支付宝代扣3.主动还款4.其他
  returnWay?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      applicationId: 'application_id',
      async: 'async',
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
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      applicationId: 'string',
      async: 'number',
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryLeaseRentalResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryLeaseClearingRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 融资租赁业务id，由资方控制台创建返回
  applicationId?: string;
  // 是否启动订单的异步处理
  async?: number;
  // 清分收款账号 长度不超过64
  clearingAccount?: string;
  // 清分金额,精确到毫厘，即123400表示12.34元
  clearingMoney?: number;
  // 清分订单号 长度不超过128
  clearingOrderIds?: string[];
  // 清分状态,1.足额2.部分3.零
  clearingState?: number;
  // 结束时间，格式为"2019-07-31 12:00:00"
  endTime?: string;
  // 融资租赁额外字段
  extraInfo?: string;
  // 租赁平台商户Id 长度不可超过50
  leaseId?: string;
  // 订单id 长度不可超过50
  // 
  orderId?: string;
  // 还款批次
  returnIndex?: number;
  // 开始时间，格式为"2019-07-31 12:00:00"
  startTime?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      applicationId: 'application_id',
      async: 'async',
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
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      applicationId: 'string',
      async: 'number',
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryLeaseClearingResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryLeaseRepaymentRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 融资租赁业务id，由资方控制台生成返回
  applicationId?: string;
  // 是否启动订单的异步处理
  async?: number;
  // 融资租赁租户还款额外字段
  extraInfo?: string;
  // 是否最终订单还款结束
  isFinish?: boolean;
  // 租赁平台商户Id 长度不可超过50
  leaseId?: string;
  // 订单id 长度不可超过50
  // 
  orderId?: string;
  // 逾期天数,支用到期日开始计算
  overdueDay?: number;
  // 逾期应还款总额,本金+利息+逾期利息,精确到毫厘，即123400表示12.34元
  overdueMoney?: number;
  // 逾期利率（日利率）,精确到小数点后四位 12.34% 表示为1234
  overdueRate?: number;
  // 逾期状态,暂时都以0处理，目前不处理
  overdueStatus?: number;
  // 剩余应还金额，精确到毫厘，即123400表示12.34元
  remainReturnMoney?: number;
  // 剩余应还期数
  // 
  remainReturnTerm?: number;
  // 每次还款流水凭证，需要融资方确认，id一样则不处理
  repaymentUniqueId?: string;
  // 还款结果简要描述,长度不超过256
  returnDescription?: string;
  // 还款批次
  // 
  returnIndex?: number;
  // 还款总额,本金+利息，精确到毫厘，即123400表示12.34元
  returnMoney?: number;
  // 还款结果状态,1.成功 2.失败
  returnStatus?: number;
  // 还款日期，格式为"2019-07-31 12:00:00"
  returnTime?: string;
  // 还款来源,1.共管账号，2.网商清分
  source?: number;
  // 逾期后还款状态,1未还款,2已还款
  status?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      applicationId: 'application_id',
      async: 'async',
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
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      applicationId: 'string',
      async: 'number',
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryLeaseRepaymentResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryLeaseNotifyregisterRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryLeaseNotifyregisterResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryTwcNotaryLeaseIotinfoRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 查询截止时间
  endTime?: string;
  // 设备唯一id imei id
  productImeiId?: string;
  // 查询开启时间
  startTime?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      endTime: 'end_time',
      productImeiId: 'product_imei_id',
      startTime: 'start_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      endTime: 'string',
      productImeiId: 'string',
      startTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotaryLeaseIotinfoResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryCourtTextnotaryRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
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
  phase?: string;
  // 扩展属性
  properties?: string;
  // 文本数据
  textContent?: string;
  // 存证事务ID
  transactionId?: string;
  // 是否使用可信时间戳
  tsr?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateTwcNotaryCourtTextnotaryResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class GetTwcNotaryCourtTextnotaryRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 地理位置信息
  location?: Location;
  // 存证阶段
  phase?: string;
  // 扩展属性
  properties?: string;
  // 存证事务ID
  transactionId?: string;
  // 交易哈希
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class GetTwcNotaryCourtTextnotaryResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 对应的法院编号
  agencyCode?: string;
  // 对应的法院应用ID
  applicationCode?: string;
  // 业务类型标识
  businessType?: string;
  // 数据类型标识
  dataType?: string;
  // 文本数据
  textContent?: string;
  // 可信时间戳
  tsr?: TsrResponse;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      agencyCode: 'agency_code',
      applicationCode: 'application_code',
      businessType: 'business_type',
      dataType: 'data_type',
      textContent: 'text_content',
      tsr: 'tsr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      agencyCode: 'string',
      applicationCode: 'string',
      businessType: 'string',
      dataType: 'string',
      textContent: 'string',
      tsr: TsrResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryCourtFilenotaryRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 对应的法院编号
  agencyCode?: string;
  // 对应的法院应用ID	
  applicationCode?: string;
  // 业务类型标识
  businessType?: string;
  // 数据类型标识
  dataType?: string;
  // 文件哈希
  fileHash?: string;
  // 文件名
  fileName?: string;
  // 哈希算法，目前仅支持SHA256
  hashAlgorithm?: string;
  // 地理位置信息
  location?: Location;
  // 存证阶段
  phase?: string;
  // 扩展属性
  properties?: string;
  // 存证事务ID
  transactionId?: string;
  // 是否使用可信时间戳
  tsr?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateTwcNotaryCourtFilenotaryResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class GetTwcNotaryCourtFilenotaryRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 地理位置信息
  location?: Location;
  // 存证阶段
  phase?: string;
  // 扩展属性
  properties?: string;
  // 存证事务ID
  transactionId?: string;
  // 交易哈希
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class GetTwcNotaryCourtFilenotaryResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 对应的法院编号
  agencyCode?: string;
  // 对应的法院应用ID
  applicationCode?: string;
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
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      agencyCode: 'agency_code',
      applicationCode: 'application_code',
      businessType: 'business_type',
      dataType: 'data_type',
      fileHash: 'file_hash',
      fileName: 'file_name',
      tsr: 'tsr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      agencyCode: 'string',
      applicationCode: 'string',
      businessType: 'string',
      dataType: 'string',
      fileHash: 'string',
      fileName: 'string',
      tsr: TsrResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryLeaseRouteRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 具体业务字段，json形式
  bizContent?: string;
  // 方法名
  route?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      bizContent: 'biz_content',
      route: 'route',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      bizContent: 'string',
      route: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryLeaseRouteResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryTwcNotaryLeaseEncryptedinfoRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 融资租赁业务id，由资方控制台创建返回
  applicationId?: string;
  // 被查询的租赁公司对应的租户ID
  leaseId?: string;
  // 订单id
  orderId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      applicationId: 'application_id',
      leaseId: 'lease_id',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      applicationId: 'string',
      leaseId: 'string',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotaryLeaseEncryptedinfoResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryContractTextRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 签署结束信息，phase为FINISH时必选
  finishInfo?: ContractNotaryFinishInfo;
  // 签署流程ID
  flowId?: string;
  // 签署发起信息，phase为INIT时必选
  initInfo?: ContractNotaryInitInfo;
  // 存证阶段，分为INIT(发起)，SIGN(签署)，FINISH(结束)
  phase?: string;
  // 签署过程信息，phase为SIGN时必选
  signInfo?: ContractNotarySignInfo;
  // 存证事务ID
  transactionId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      finishInfo: 'finish_info',
      flowId: 'flow_id',
      initInfo: 'init_info',
      phase: 'phase',
      signInfo: 'sign_info',
      transactionId: 'transaction_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      finishInfo: ContractNotaryFinishInfo,
      flowId: 'string',
      initInfo: ContractNotaryInitInfo,
      phase: 'string',
      signInfo: ContractNotarySignInfo,
      transactionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryContractTextResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ApplyTwcNotaryContractReportRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 签署结束阶段存证核验信息
  finishInfo?: ContractNotaryFinishInfo;
  // 签署流程ID
  flowId?: string;
  // 签署发起阶段存证核验信息
  initInfo?: ContractNotaryInitInfo;
  // 签署过程阶段存证核验信息
  signInfo?: ContractNotarySignInfo[];
  // 存证事务ID
  transactionId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class ApplyTwcNotaryContractReportResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class GetTwcNotaryContractTextRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 存证凭据
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTwcNotaryContractTextResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryInternalTransRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 存证关联实体（个人/企业）的身份识别信息
  customer?: Identity;
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
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateTwcNotaryInternalTransResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryInternalTextRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 哈希算法，目前仅支持 SHA256
  hashAlgorithm?: string;
  // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
  location?: Location;
  // 存证内容
  notaryContent?: string;
  // 描述本条存证在存证事务中的阶段，用户可自行维护
  phase?: string;
  // 扩展属性
  properties?: string;
  // 文本存证类型，支持源文本/文本哈希
  textNotaryType?: string;
  // 存证事务id
  transactionId?: string;
  // 是否使用可信时间戳，默认为false
  tsr?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      hashAlgorithm: 'hash_algorithm',
      location: 'location',
      notaryContent: 'notary_content',
      phase: 'phase',
      properties: 'properties',
      textNotaryType: 'text_notary_type',
      transactionId: 'transaction_id',
      tsr: 'tsr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      hashAlgorithm: 'string',
      location: Location,
      notaryContent: 'string',
      phase: 'string',
      properties: 'string',
      textNotaryType: 'string',
      transactionId: 'string',
      tsr: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryInternalTextResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryLeaseTextRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 哈希算法，目前仅支持 SHA256
  hashAlgorithm?: string;
  // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
  location?: Location;
  // 存证内容
  notaryContent?: string;
  // 描述本条存证在存证事务中的阶段，用户可自行维护
  phase?: string;
  // 扩展属性
  properties?: string;
  // 文本存证类型，支持源文本/文本哈希
  textNotaryType?: string;
  // 存证事务id
  transactionId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateTwcNotaryLeaseTextResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateTwcNotaryLeaseFileRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 文件存证模式，目前仅支持 FILE_RAW 和 FILE_HASH
  fileNotaryType?: string;
  // 当文件存证模式为FILE_HASH时，用户可以指定该参数。当前服务仅支持 SHA256，若不填写，则默认值为 SHA256。
  hashAlgorithm?: string;
  // 存证地点(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
  location?: Location;
  // 存证文件内容，对文件内容做base64编码后得到。例如FILE_RAW模式下，文件内容为“test”，那么base64编码后的结果则为“dGVzdA==”。如果是FILE_HASh模式，则该字段直接为文件hash。
  notaryFile?: string;
  // 存证文件名称
  notaryName?: string;
  // 描述本条存证在存证事务中的阶段，用户可自行维护
  phase?: string;
  // 扩展属性
  properties?: string;
  // 存证事务ID
  transactionId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateTwcNotaryLeaseFileResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ListTwcNotaryLeaseNotaryRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 商户订单号，需要同twc.notary.lease.order.create接口的传参一致
  merchantOrderNo?: string;
  // 接口订单号，需要同twc.notary.lease.order.create接口的传参一致
  orderNo?: string;
  // 支付渠道，默认支持Alipay|ThirdParty|CreditCard|BankTransfer|WeChatPay|Other，需要同twc.notary.lease.order.create接口的传参一致
  paymentChannel?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      merchantOrderNo: 'merchant_order_no',
      orderNo: 'order_no',
      paymentChannel: 'payment_channel',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      merchantOrderNo: 'string',
      orderNo: 'string',
      paymentChannel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListTwcNotaryLeaseNotaryResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryTwcNotaryLeaseApplicationRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 每页的大小
  pageSize?: number;
  // 起始id
  startId?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      pageSize: 'page_size',
      startId: 'start_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      pageSize: 'number',
      startId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotaryLeaseApplicationResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryTwcNotaryLeaseApplicationdetailinfoRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 合约id
  applicationId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      applicationId: 'application_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      applicationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTwcNotaryLeaseApplicationdetailinfoResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class SetTwcNotaryLeaseRepaymentstatusRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 融资租赁对应的合约id
  applicationId?: string;
  // finish只能为0或1，0表示订单重置此状态下订单可以被再次操作【如清分记录上传、还款记录上传等】，1表示订单结束，在1的状态下不会再进行清分、还款记录上传等操作
  finish?: number;
  // 租赁机构金融科技租户Id
  leaseId?: string;
  // 融资租赁对应的订单id
  orderId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      applicationId: 'application_id',
      finish: 'finish',
      leaseId: 'lease_id',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      applicationId: 'string',
      finish: 'number',
      leaseId: 'string',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetTwcNotaryLeaseRepaymentstatusResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 状态码，0表示成功
  code?: number;
  // 错误信息描述
  errMessage?: string;
  // 状态重置对应的链上交易哈希
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

export class CreateTwcNotaryLeaseSupplierinfoRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 租赁方及资方定义的合约id
  applicationId?: string;
  // 额外字段定义
  extraInfo?: string;
  // 供应商发货的物流单号
  logisticsOrderId?: string;
  // 用户的租赁订单id
  orderId?: string;
  // 额外字段定义对应的阶段，请咨询对应的资方
  phase?: string;
  // 采购订单id
  purchaseOrderId?: string;
  // 产品详细信息
  supplierProductList?: SupplierProductInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      applicationId: 'application_id',
      extraInfo: 'extra_info',
      logisticsOrderId: 'logistics_order_id',
      orderId: 'order_id',
      phase: 'phase',
      purchaseOrderId: 'purchase_order_id',
      supplierProductList: 'supplier_product_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      applicationId: 'string',
      extraInfo: 'string',
      logisticsOrderId: 'string',
      orderId: 'string',
      phase: 'string',
      purchaseOrderId: 'string',
      supplierProductList: { 'type': 'array', 'itemType': SupplierProductInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTwcNotaryLeaseSupplierinfoResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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
    this._readTimeout = config.readTimeout;
    this._connectTimeout = config.connectTimeout;
    this._httpProxy = config.httpProxy;
    this._httpsProxy = config.httpsProxy;
    this._noProxy = config.noProxy;
    this._socks5Proxy = config.socks5Proxy;
    this._socks5NetWork = config.socks5NetWork;
    this._maxIdleConns = config.maxIdleConns;
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
  async doRequest(version: string, action: string, protocol: string, method: string, pathname: string, request: {[key: string]: any}, runtime: $Util.RuntimeOptions): Promise<{[key: string]: any}> {
    let _runtime: { [key: string]: any } = {
      timeouted: "retry",
      readTimeout: Util.defaultNumber(runtime.readTimeout, this._readTimeout),
      connectTimeout: Util.defaultNumber(runtime.connectTimeout, this._connectTimeout),
      httpProxy: Util.defaultString(runtime.httpProxy, this._httpProxy),
      httpsProxy: Util.defaultString(runtime.httpsProxy, this._httpsProxy),
      noProxy: Util.defaultString(runtime.noProxy, this._noProxy),
      maxIdleConns: Util.defaultNumber(runtime.maxIdleConns, this._maxIdleConns),
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
          req_time: AlipayUtil.getTimestamp(),
          req_msg_id: Util.getNonce(),
          access_key: this._accessKeyId,
          charset: "UTF-8",
          baseSdkVersion: "Tea-SDK",
          sdkVersion: "Tea-SDK-20200902",
        };
        if (!Util.empty(this._securityToken)) {
          request_.query["security_token"] = this._securityToken;
        }

        request_.headers = {
          host: this._endpoint,
          'user-agent': this.getUserAgent(),
        };
        let tmp = Util.anyifyMapValue(RPCUtil.query(request));
        request_.body = new $tea.BytesReadable(Util.toFormString(tmp));
        request_.headers["content-type"] = "application/x-www-form-urlencoded";
        let signedParam = {
          ...request_.query,
          ...RPCUtil.query(request),
        };
        request_.query["sign"] = AlipayUtil.getSignature(signedParam, this._accessKeySecret);
        _lastRequest = request_;
        let response_ = await $tea.doAction(request_, _runtime);

        let obj = await Util.readAsJSON(response_.body);
        let res = Util.assertAsMap(obj);
        let resp = Util.assertAsMap(res["response"]);
        if (AlipayUtil.hasError(res)) {
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
   * Get user agent
   * @return user agent
   */
  getUserAgent(): string {
    let userAgent = "TeaClient/1.0.0";
    return Util.getUserAgent(userAgent);
  }

  /**
   * Description: 提供给第三方仲裁isv的仲裁申请状态变化回调接口
   * Summary: 仲裁状态信息变更回调接口
   */
  async callbackTwcNotaryArbitrationStatus(request: CallbackTwcNotaryArbitrationStatusRequest): Promise<CallbackTwcNotaryArbitrationStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.callbackTwcNotaryArbitrationStatusEx(request, runtime);
  }

  /**
   * Description: 提供给第三方仲裁isv的仲裁申请状态变化回调接口
   * Summary: 仲裁状态信息变更回调接口
   */
  async callbackTwcNotaryArbitrationStatusEx(request: CallbackTwcNotaryArbitrationStatusRequest, runtime: $Util.RuntimeOptions): Promise<CallbackTwcNotaryArbitrationStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackTwcNotaryArbitrationStatusResponse>(await this.doRequest("1.0", "twc.notary.arbitration.status.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CallbackTwcNotaryArbitrationStatusResponse({}));
  }

  /**
   * Description: 调用本接口创建个人账号，后续有关该用户的所有操作都需使用该用户的accountId。如提供用户证件信息，则将根据提供的用户证件信息申请数字证书。
   * Summary: 创建电子合同签署个人帐户
   */
  async createTwcNotaryContractAccount(request: CreateTwcNotaryContractAccountRequest): Promise<CreateTwcNotaryContractAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryContractAccountEx(request, runtime);
  }

  /**
   * Description: 调用本接口创建个人账号，后续有关该用户的所有操作都需使用该用户的accountId。如提供用户证件信息，则将根据提供的用户证件信息申请数字证书。
   * Summary: 创建电子合同签署个人帐户
   */
  async createTwcNotaryContractAccountEx(request: CreateTwcNotaryContractAccountRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryContractAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryContractAccountResponse>(await this.doRequest("1.0", "twc.notary.contract.account.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryContractAccountResponse({}));
  }

  /**
   * Description: 通过模版参数，创建个人印章
   * Summary: 创建电子合同个人帐户印章
   */
  async createTwcNotaryContractAccountseal(request: CreateTwcNotaryContractAccountsealRequest): Promise<CreateTwcNotaryContractAccountsealResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryContractAccountsealEx(request, runtime);
  }

  /**
   * Description: 通过模版参数，创建个人印章
   * Summary: 创建电子合同个人帐户印章
   */
  async createTwcNotaryContractAccountsealEx(request: CreateTwcNotaryContractAccountsealRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryContractAccountsealResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryContractAccountsealResponse>(await this.doRequest("1.0", "twc.notary.contract.accountseal.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryContractAccountsealResponse({}));
  }

  /**
   * Description: 对接方调用本接口创建机构账号，后续有关该机构的所有操作都需使用该机构的orgId。如提供机构证件信息，则将根据提供的机构证件信息申请数字证书。
  创建机构账号前需要先创建一个个人账号并通过本接口传给服务器，该个人账号将作为该机构签署的经办人，代表企业完成实名认证和意愿认证，并完成签署操作。
   * Summary: 创建电子合同签署机构帐户
   */
  async createTwcNotaryContractOrganization(request: CreateTwcNotaryContractOrganizationRequest): Promise<CreateTwcNotaryContractOrganizationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryContractOrganizationEx(request, runtime);
  }

  /**
   * Description: 对接方调用本接口创建机构账号，后续有关该机构的所有操作都需使用该机构的orgId。如提供机构证件信息，则将根据提供的机构证件信息申请数字证书。
  创建机构账号前需要先创建一个个人账号并通过本接口传给服务器，该个人账号将作为该机构签署的经办人，代表企业完成实名认证和意愿认证，并完成签署操作。
   * Summary: 创建电子合同签署机构帐户
   */
  async createTwcNotaryContractOrganizationEx(request: CreateTwcNotaryContractOrganizationRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryContractOrganizationResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryContractOrganizationResponse>(await this.doRequest("1.0", "twc.notary.contract.organization.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryContractOrganizationResponse({}));
  }

  /**
   * Description: 通过模版参数，创建机构印章
   * Summary: 创建电子合同机构帐户印章
   */
  async createTwcNotaryContractOrgseal(request: CreateTwcNotaryContractOrgsealRequest): Promise<CreateTwcNotaryContractOrgsealResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryContractOrgsealEx(request, runtime);
  }

  /**
   * Description: 通过模版参数，创建机构印章
   * Summary: 创建电子合同机构帐户印章
   */
  async createTwcNotaryContractOrgsealEx(request: CreateTwcNotaryContractOrgsealRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryContractOrgsealResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryContractOrgsealResponse>(await this.doRequest("1.0", "twc.notary.contract.orgseal.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryContractOrgsealResponse({}));
  }

  /**
   * Description: 静默签署授权
   * Summary: 静默签署授权
   */
  async authTwcNotaryContractSign(request: AuthTwcNotaryContractSignRequest): Promise<AuthTwcNotaryContractSignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.authTwcNotaryContractSignEx(request, runtime);
  }

  /**
   * Description: 静默签署授权
   * Summary: 静默签署授权
   */
  async authTwcNotaryContractSignEx(request: AuthTwcNotaryContractSignRequest, runtime: $Util.RuntimeOptions): Promise<AuthTwcNotaryContractSignResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthTwcNotaryContractSignResponse>(await this.doRequest("1.0", "twc.notary.contract.sign.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new AuthTwcNotaryContractSignResponse({}));
  }

  /**
   * Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
   * Summary: 通过文件上传方式创建电子合同签署模板
   */
  async createTwcNotaryContractTemplate(request: CreateTwcNotaryContractTemplateRequest): Promise<CreateTwcNotaryContractTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryContractTemplateEx(request, runtime);
  }

  /**
   * Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
   * Summary: 通过文件上传方式创建电子合同签署模板
   */
  async createTwcNotaryContractTemplateEx(request: CreateTwcNotaryContractTemplateRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryContractTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryContractTemplateResponse>(await this.doRequest("1.0", "twc.notary.contract.template.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryContractTemplateResponse({}));
  }

  /**
   * Description: 创建签署流程
   * Summary: 创建电子合同签署流程
   */
  async createTwcNotaryContractFlow(request: CreateTwcNotaryContractFlowRequest): Promise<CreateTwcNotaryContractFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryContractFlowEx(request, runtime);
  }

  /**
   * Description: 创建签署流程
   * Summary: 创建电子合同签署流程
   */
  async createTwcNotaryContractFlowEx(request: CreateTwcNotaryContractFlowRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryContractFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryContractFlowResponse>(await this.doRequest("1.0", "twc.notary.contract.flow.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryContractFlowResponse({}));
  }

  /**
   * Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
   * Summary: 向电子合同签署流程中添加待签署文档
   */
  async addTwcNotaryContractDocument(request: AddTwcNotaryContractDocumentRequest): Promise<AddTwcNotaryContractDocumentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.addTwcNotaryContractDocumentEx(request, runtime);
  }

  /**
   * Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
   * Summary: 向电子合同签署流程中添加待签署文档
   */
  async addTwcNotaryContractDocumentEx(request: AddTwcNotaryContractDocumentRequest, runtime: $Util.RuntimeOptions): Promise<AddTwcNotaryContractDocumentResponse> {
    Util.validateModel(request);
    return $tea.cast<AddTwcNotaryContractDocumentResponse>(await this.doRequest("1.0", "twc.notary.contract.document.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new AddTwcNotaryContractDocumentResponse({}));
  }

  /**
   * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
   * Summary: 添加电子合同签署方自动盖章签署区
   */
  async addTwcNotaryContractSignfield(request: AddTwcNotaryContractSignfieldRequest): Promise<AddTwcNotaryContractSignfieldResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.addTwcNotaryContractSignfieldEx(request, runtime);
  }

  /**
   * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
   * Summary: 添加电子合同签署方自动盖章签署区
   */
  async addTwcNotaryContractSignfieldEx(request: AddTwcNotaryContractSignfieldRequest, runtime: $Util.RuntimeOptions): Promise<AddTwcNotaryContractSignfieldResponse> {
    Util.validateModel(request);
    return $tea.cast<AddTwcNotaryContractSignfieldResponse>(await this.doRequest("1.0", "twc.notary.contract.signfield.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new AddTwcNotaryContractSignfieldResponse({}));
  }

  /**
   * Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
   * Summary: 电子合同签署流程开启
   */
  async startTwcNotaryContractFlow(request: StartTwcNotaryContractFlowRequest): Promise<StartTwcNotaryContractFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.startTwcNotaryContractFlowEx(request, runtime);
  }

  /**
   * Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
   * Summary: 电子合同签署流程开启
   */
  async startTwcNotaryContractFlowEx(request: StartTwcNotaryContractFlowRequest, runtime: $Util.RuntimeOptions): Promise<StartTwcNotaryContractFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<StartTwcNotaryContractFlowResponse>(await this.doRequest("1.0", "twc.notary.contract.flow.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new StartTwcNotaryContractFlowResponse({}));
  }

  /**
   * Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
   * Summary: 电子合同签署流程归档
   */
  async saveTwcNotaryContractFlow(request: SaveTwcNotaryContractFlowRequest): Promise<SaveTwcNotaryContractFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.saveTwcNotaryContractFlowEx(request, runtime);
  }

  /**
   * Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
   * Summary: 电子合同签署流程归档
   */
  async saveTwcNotaryContractFlowEx(request: SaveTwcNotaryContractFlowRequest, runtime: $Util.RuntimeOptions): Promise<SaveTwcNotaryContractFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveTwcNotaryContractFlowResponse>(await this.doRequest("1.0", "twc.notary.contract.flow.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new SaveTwcNotaryContractFlowResponse({}));
  }

  /**
   * Description: 流程归档后，查询和下载签署后的文件
   * Summary: 电子合同流程文档下载
   */
  async downloadTwcNotaryContractDocument(request: DownloadTwcNotaryContractDocumentRequest): Promise<DownloadTwcNotaryContractDocumentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.downloadTwcNotaryContractDocumentEx(request, runtime);
  }

  /**
   * Description: 流程归档后，查询和下载签署后的文件
   * Summary: 电子合同流程文档下载
   */
  async downloadTwcNotaryContractDocumentEx(request: DownloadTwcNotaryContractDocumentRequest, runtime: $Util.RuntimeOptions): Promise<DownloadTwcNotaryContractDocumentResponse> {
    Util.validateModel(request);
    return $tea.cast<DownloadTwcNotaryContractDocumentResponse>(await this.doRequest("1.0", "twc.notary.contract.document.download", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new DownloadTwcNotaryContractDocumentResponse({}));
  }

  /**
   * Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
   * Summary: 通过电子合同模板添加文档
   */
  async addTwcNotaryContractFile(request: AddTwcNotaryContractFileRequest): Promise<AddTwcNotaryContractFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.addTwcNotaryContractFileEx(request, runtime);
  }

  /**
   * Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
   * Summary: 通过电子合同模板添加文档
   */
  async addTwcNotaryContractFileEx(request: AddTwcNotaryContractFileRequest, runtime: $Util.RuntimeOptions): Promise<AddTwcNotaryContractFileResponse> {
    Util.validateModel(request);
    return $tea.cast<AddTwcNotaryContractFileResponse>(await this.doRequest("1.0", "twc.notary.contract.file.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new AddTwcNotaryContractFileResponse({}));
  }

  /**
   * Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
   * Summary: 电子合同平台方注册
   */
  async createTwcNotaryContractPlatform(request: CreateTwcNotaryContractPlatformRequest): Promise<CreateTwcNotaryContractPlatformResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryContractPlatformEx(request, runtime);
  }

  /**
   * Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
   * Summary: 电子合同平台方注册
   */
  async createTwcNotaryContractPlatformEx(request: CreateTwcNotaryContractPlatformRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryContractPlatformResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryContractPlatformResponse>(await this.doRequest("1.0", "twc.notary.contract.platform.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryContractPlatformResponse({}));
  }

  /**
   * Description: 电子合同平台方提供用户信息，注册成为平台用户
   * Summary: 电子合同平台方的用户注册
   */
  async createTwcNotaryContractUser(request: CreateTwcNotaryContractUserRequest): Promise<CreateTwcNotaryContractUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryContractUserEx(request, runtime);
  }

  /**
   * Description: 电子合同平台方提供用户信息，注册成为平台用户
   * Summary: 电子合同平台方的用户注册
   */
  async createTwcNotaryContractUserEx(request: CreateTwcNotaryContractUserRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryContractUserResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryContractUserResponse>(await this.doRequest("1.0", "twc.notary.contract.user.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryContractUserResponse({}));
  }

  /**
   * Description: 电子合同平台方发起签署流程，用户在H5页面完成手动签署
   * Summary: 电子合同平台方发起手动签署流程
   */
  async startTwcNotaryContractHandsign(request: StartTwcNotaryContractHandsignRequest): Promise<StartTwcNotaryContractHandsignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.startTwcNotaryContractHandsignEx(request, runtime);
  }

  /**
   * Description: 电子合同平台方发起签署流程，用户在H5页面完成手动签署
   * Summary: 电子合同平台方发起手动签署流程
   */
  async startTwcNotaryContractHandsignEx(request: StartTwcNotaryContractHandsignRequest, runtime: $Util.RuntimeOptions): Promise<StartTwcNotaryContractHandsignResponse> {
    Util.validateModel(request);
    return $tea.cast<StartTwcNotaryContractHandsignResponse>(await this.doRequest("1.0", "twc.notary.contract.handsign.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new StartTwcNotaryContractHandsignResponse({}));
  }

  /**
   * Description: 查询签署流程的详细信息，包括流程配置、签署状态等
   * Summary: 签署流程查询
   */
  async queryTwcNotaryContractFlow(request: QueryTwcNotaryContractFlowRequest): Promise<QueryTwcNotaryContractFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryTwcNotaryContractFlowEx(request, runtime);
  }

  /**
   * Description: 查询签署流程的详细信息，包括流程配置、签署状态等
   * Summary: 签署流程查询
   */
  async queryTwcNotaryContractFlowEx(request: QueryTwcNotaryContractFlowRequest, runtime: $Util.RuntimeOptions): Promise<QueryTwcNotaryContractFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTwcNotaryContractFlowResponse>(await this.doRequest("1.0", "twc.notary.contract.flow.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryTwcNotaryContractFlowResponse({}));
  }

  /**
   * Description: 创建个人/机构图片印章
   * Summary: 创建个人/机构图片印章
   */
  async createTwcNotaryContractAccountsealimage(request: CreateTwcNotaryContractAccountsealimageRequest): Promise<CreateTwcNotaryContractAccountsealimageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryContractAccountsealimageEx(request, runtime);
  }

  /**
   * Description: 创建个人/机构图片印章
   * Summary: 创建个人/机构图片印章
   */
  async createTwcNotaryContractAccountsealimageEx(request: CreateTwcNotaryContractAccountsealimageRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryContractAccountsealimageResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryContractAccountsealimageResponse>(await this.doRequest("1.0", "twc.notary.contract.accountsealimage.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryContractAccountsealimageResponse({}));
  }

  /**
   * Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
   * Summary: 通过上传方式创建文件
   */
  async getTwcNotaryContractFileuploadurl(request: GetTwcNotaryContractFileuploadurlRequest): Promise<GetTwcNotaryContractFileuploadurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.getTwcNotaryContractFileuploadurlEx(request, runtime);
  }

  /**
   * Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
   * Summary: 通过上传方式创建文件
   */
  async getTwcNotaryContractFileuploadurlEx(request: GetTwcNotaryContractFileuploadurlRequest, runtime: $Util.RuntimeOptions): Promise<GetTwcNotaryContractFileuploadurlResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTwcNotaryContractFileuploadurlResponse>(await this.doRequest("1.0", "twc.notary.contract.fileuploadurl.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new GetTwcNotaryContractFileuploadurlResponse({}));
  }

  /**
   * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息（平台自动签无需指定签署人信息，默认签署人是对接的企业）。
  签署区创建完成，流程开启后，系统将自动完成“对接平台自动盖章签署区”的盖章，对接平台可全程无感完成本次签署。
   * Summary: 添加平台自动盖章签署区
   */
  async addTwcNotaryContractPlatformsignfields(request: AddTwcNotaryContractPlatformsignfieldsRequest): Promise<AddTwcNotaryContractPlatformsignfieldsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.addTwcNotaryContractPlatformsignfieldsEx(request, runtime);
  }

  /**
   * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息（平台自动签无需指定签署人信息，默认签署人是对接的企业）。
  签署区创建完成，流程开启后，系统将自动完成“对接平台自动盖章签署区”的盖章，对接平台可全程无感完成本次签署。
   * Summary: 添加平台自动盖章签署区
   */
  async addTwcNotaryContractPlatformsignfieldsEx(request: AddTwcNotaryContractPlatformsignfieldsRequest, runtime: $Util.RuntimeOptions): Promise<AddTwcNotaryContractPlatformsignfieldsResponse> {
    Util.validateModel(request);
    return $tea.cast<AddTwcNotaryContractPlatformsignfieldsResponse>(await this.doRequest("1.0", "twc.notary.contract.platformsignfields.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new AddTwcNotaryContractPlatformsignfieldsResponse({}));
  }

  /**
   * Description: 查询文件详情，包括文件名称、大小、下载地址等
   * Summary: 查询文件详情
   */
  async getTwcNotaryContractFile(request: GetTwcNotaryContractFileRequest): Promise<GetTwcNotaryContractFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.getTwcNotaryContractFileEx(request, runtime);
  }

  /**
   * Description: 查询文件详情，包括文件名称、大小、下载地址等
   * Summary: 查询文件详情
   */
  async getTwcNotaryContractFileEx(request: GetTwcNotaryContractFileRequest, runtime: $Util.RuntimeOptions): Promise<GetTwcNotaryContractFileResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTwcNotaryContractFileResponse>(await this.doRequest("1.0", "twc.notary.contract.file.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new GetTwcNotaryContractFileResponse({}));
  }

  /**
   * Description: 查询个人所有印章
   * Summary: 查询个人印章
   */
  async queryTwcNotaryContractAccountseals(request: QueryTwcNotaryContractAccountsealsRequest): Promise<QueryTwcNotaryContractAccountsealsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryTwcNotaryContractAccountsealsEx(request, runtime);
  }

  /**
   * Description: 查询个人所有印章
   * Summary: 查询个人印章
   */
  async queryTwcNotaryContractAccountsealsEx(request: QueryTwcNotaryContractAccountsealsRequest, runtime: $Util.RuntimeOptions): Promise<QueryTwcNotaryContractAccountsealsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTwcNotaryContractAccountsealsResponse>(await this.doRequest("1.0", "twc.notary.contract.accountseals.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryTwcNotaryContractAccountsealsResponse({}));
  }

  /**
   * Description: 查询机构所有印章
   * Summary: 查询机构印章
   */
  async queryTwcNotaryContractOrganizationseals(request: QueryTwcNotaryContractOrganizationsealsRequest): Promise<QueryTwcNotaryContractOrganizationsealsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryTwcNotaryContractOrganizationsealsEx(request, runtime);
  }

  /**
   * Description: 查询机构所有印章
   * Summary: 查询机构印章
   */
  async queryTwcNotaryContractOrganizationsealsEx(request: QueryTwcNotaryContractOrganizationsealsRequest, runtime: $Util.RuntimeOptions): Promise<QueryTwcNotaryContractOrganizationsealsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTwcNotaryContractOrganizationsealsResponse>(await this.doRequest("1.0", "twc.notary.contract.organizationseals.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryTwcNotaryContractOrganizationsealsResponse({}));
  }

  /**
   * Description: 查询流程所有签署人列表。
   * Summary: 查询流程签署人列表
   */
  async queryTwcNotaryContractFlowsigner(request: QueryTwcNotaryContractFlowsignerRequest): Promise<QueryTwcNotaryContractFlowsignerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryTwcNotaryContractFlowsignerEx(request, runtime);
  }

  /**
   * Description: 查询流程所有签署人列表。
   * Summary: 查询流程签署人列表
   */
  async queryTwcNotaryContractFlowsignerEx(request: QueryTwcNotaryContractFlowsignerRequest, runtime: $Util.RuntimeOptions): Promise<QueryTwcNotaryContractFlowsignerResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTwcNotaryContractFlowsignerResponse>(await this.doRequest("1.0", "twc.notary.contract.flowsigner.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryTwcNotaryContractFlowsignerResponse({}));
  }

  /**
   * Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
   * Summary: 查询签署区列表
   */
  async queryTwcNotaryContractSignfields(request: QueryTwcNotaryContractSignfieldsRequest): Promise<QueryTwcNotaryContractSignfieldsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryTwcNotaryContractSignfieldsEx(request, runtime);
  }

  /**
   * Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
   * Summary: 查询签署区列表
   */
  async queryTwcNotaryContractSignfieldsEx(request: QueryTwcNotaryContractSignfieldsRequest, runtime: $Util.RuntimeOptions): Promise<QueryTwcNotaryContractSignfieldsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTwcNotaryContractSignfieldsResponse>(await this.doRequest("1.0", "twc.notary.contract.signfields.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryTwcNotaryContractSignfieldsResponse({}));
  }

  /**
   * Description: 使用创建账号返回的账号id查询用户的账号。
   * Summary: 查询个人账号
   */
  async queryTwcNotaryContractAccount(request: QueryTwcNotaryContractAccountRequest): Promise<QueryTwcNotaryContractAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryTwcNotaryContractAccountEx(request, runtime);
  }

  /**
   * Description: 使用创建账号返回的账号id查询用户的账号。
   * Summary: 查询个人账号
   */
  async queryTwcNotaryContractAccountEx(request: QueryTwcNotaryContractAccountRequest, runtime: $Util.RuntimeOptions): Promise<QueryTwcNotaryContractAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTwcNotaryContractAccountResponse>(await this.doRequest("1.0", "twc.notary.contract.account.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryTwcNotaryContractAccountResponse({}));
  }

  /**
   * Description: 使用创建账号返回的账号id查询机构账号。
   * Summary: 查询机构账号
   */
  async queryTwcNotaryContractOrganization(request: QueryTwcNotaryContractOrganizationRequest): Promise<QueryTwcNotaryContractOrganizationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryTwcNotaryContractOrganizationEx(request, runtime);
  }

  /**
   * Description: 使用创建账号返回的账号id查询机构账号。
   * Summary: 查询机构账号
   */
  async queryTwcNotaryContractOrganizationEx(request: QueryTwcNotaryContractOrganizationRequest, runtime: $Util.RuntimeOptions): Promise<QueryTwcNotaryContractOrganizationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTwcNotaryContractOrganizationResponse>(await this.doRequest("1.0", "twc.notary.contract.organization.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryTwcNotaryContractOrganizationResponse({}));
  }

  /**
   * Description: 查询模板详情，包括文件模板基本信息和输入项组件信息
   * Summary: 查询模板详情详情
   */
  async queryTwcNotaryContractTemplate(request: QueryTwcNotaryContractTemplateRequest): Promise<QueryTwcNotaryContractTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryTwcNotaryContractTemplateEx(request, runtime);
  }

  /**
   * Description: 查询模板详情，包括文件模板基本信息和输入项组件信息
   * Summary: 查询模板详情详情
   */
  async queryTwcNotaryContractTemplateEx(request: QueryTwcNotaryContractTemplateRequest, runtime: $Util.RuntimeOptions): Promise<QueryTwcNotaryContractTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTwcNotaryContractTemplateResponse>(await this.doRequest("1.0", "twc.notary.contract.template.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryTwcNotaryContractTemplateResponse({}));
  }

  /**
   * Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
   * Summary: 创建签署流程
   */
  async createTwcNotaryContractSignflow(request: CreateTwcNotaryContractSignflowRequest): Promise<CreateTwcNotaryContractSignflowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryContractSignflowEx(request, runtime);
  }

  /**
   * Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
   * Summary: 创建签署流程
   */
  async createTwcNotaryContractSignflowEx(request: CreateTwcNotaryContractSignflowRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryContractSignflowResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryContractSignflowResponse>(await this.doRequest("1.0", "twc.notary.contract.signflow.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryContractSignflowResponse({}));
  }

  /**
   * Description: 商户签署直付通协议
   * Summary: 商户签署直付通协议
   */
  async createTwcNotaryContractRegisterzft(request: CreateTwcNotaryContractRegisterzftRequest): Promise<CreateTwcNotaryContractRegisterzftResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryContractRegisterzftEx(request, runtime);
  }

  /**
   * Description: 商户签署直付通协议
   * Summary: 商户签署直付通协议
   */
  async createTwcNotaryContractRegisterzftEx(request: CreateTwcNotaryContractRegisterzftRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryContractRegisterzftResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryContractRegisterzftResponse>(await this.doRequest("1.0", "twc.notary.contract.registerzft.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryContractRegisterzftResponse({}));
  }

  /**
   * Description: 创建模板的同时，指定平台方签署信息，完成智能合同模板创建
   * Summary: 创建智能合同模板
   */
  async createTwcNotaryContractPlatformtemplate(request: CreateTwcNotaryContractPlatformtemplateRequest): Promise<CreateTwcNotaryContractPlatformtemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryContractPlatformtemplateEx(request, runtime);
  }

  /**
   * Description: 创建模板的同时，指定平台方签署信息，完成智能合同模板创建
   * Summary: 创建智能合同模板
   */
  async createTwcNotaryContractPlatformtemplateEx(request: CreateTwcNotaryContractPlatformtemplateRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryContractPlatformtemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryContractPlatformtemplateResponse>(await this.doRequest("1.0", "twc.notary.contract.platformtemplate.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryContractPlatformtemplateResponse({}));
  }

  /**
   * Description: 查询商户直付通入驻信息
   * Summary: 查询商户直付通入驻信息
   */
  async queryTwcNotaryContractMerchantzft(request: QueryTwcNotaryContractMerchantzftRequest): Promise<QueryTwcNotaryContractMerchantzftResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryTwcNotaryContractMerchantzftEx(request, runtime);
  }

  /**
   * Description: 查询商户直付通入驻信息
   * Summary: 查询商户直付通入驻信息
   */
  async queryTwcNotaryContractMerchantzftEx(request: QueryTwcNotaryContractMerchantzftRequest, runtime: $Util.RuntimeOptions): Promise<QueryTwcNotaryContractMerchantzftResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTwcNotaryContractMerchantzftResponse>(await this.doRequest("1.0", "twc.notary.contract.merchantzft.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryTwcNotaryContractMerchantzftResponse({}));
  }

  /**
   * Description: 列举本租户合同相关交易
   * Summary: 列举本租户合同相关交易
   */
  async listTwcNotaryContractOuttradeid(request: ListTwcNotaryContractOuttradeidRequest): Promise<ListTwcNotaryContractOuttradeidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.listTwcNotaryContractOuttradeidEx(request, runtime);
  }

  /**
   * Description: 列举本租户合同相关交易
   * Summary: 列举本租户合同相关交易
   */
  async listTwcNotaryContractOuttradeidEx(request: ListTwcNotaryContractOuttradeidRequest, runtime: $Util.RuntimeOptions): Promise<ListTwcNotaryContractOuttradeidResponse> {
    Util.validateModel(request);
    return $tea.cast<ListTwcNotaryContractOuttradeidResponse>(await this.doRequest("1.0", "twc.notary.contract.outtradeid.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ListTwcNotaryContractOuttradeidResponse({}));
  }

  /**
   * Description: 根据订单id查询订单代扣详情
   * Summary: 根据订单id查询订单代扣详情
   */
  async queryTwcNotaryContractTradedetail(request: QueryTwcNotaryContractTradedetailRequest): Promise<QueryTwcNotaryContractTradedetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryTwcNotaryContractTradedetailEx(request, runtime);
  }

  /**
   * Description: 根据订单id查询订单代扣详情
   * Summary: 根据订单id查询订单代扣详情
   */
  async queryTwcNotaryContractTradedetailEx(request: QueryTwcNotaryContractTradedetailRequest, runtime: $Util.RuntimeOptions): Promise<QueryTwcNotaryContractTradedetailResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTwcNotaryContractTradedetailResponse>(await this.doRequest("1.0", "twc.notary.contract.tradedetail.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryTwcNotaryContractTradedetailResponse({}));
  }

  /**
   * Description: 商户根据订单id退款
   * Summary: 商户根据订单id退款
   */
  async createTwcNotaryContractMerchantrefund(request: CreateTwcNotaryContractMerchantrefundRequest): Promise<CreateTwcNotaryContractMerchantrefundResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryContractMerchantrefundEx(request, runtime);
  }

  /**
   * Description: 商户根据订单id退款
   * Summary: 商户根据订单id退款
   */
  async createTwcNotaryContractMerchantrefundEx(request: CreateTwcNotaryContractMerchantrefundRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryContractMerchantrefundResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryContractMerchantrefundResponse>(await this.doRequest("1.0", "twc.notary.contract.merchantrefund.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryContractMerchantrefundResponse({}));
  }

  /**
   * Description: 创建蚂蚁区块链账户
   * Summary: 创建蚂蚁区块链账户
   */
  async createTwcNotaryContractAdminaccount(request: CreateTwcNotaryContractAdminaccountRequest): Promise<CreateTwcNotaryContractAdminaccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryContractAdminaccountEx(request, runtime);
  }

  /**
   * Description: 创建蚂蚁区块链账户
   * Summary: 创建蚂蚁区块链账户
   */
  async createTwcNotaryContractAdminaccountEx(request: CreateTwcNotaryContractAdminaccountRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryContractAdminaccountResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryContractAdminaccountResponse>(await this.doRequest("1.0", "twc.notary.contract.adminaccount.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryContractAdminaccountResponse({}));
  }

  /**
   * Description: 商户根据合同id列举所有的tradeId
   * Summary: 商户根据合同id列举所有的tradeId
   */
  async listTwcNotaryContractTradeids(request: ListTwcNotaryContractTradeidsRequest): Promise<ListTwcNotaryContractTradeidsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.listTwcNotaryContractTradeidsEx(request, runtime);
  }

  /**
   * Description: 商户根据合同id列举所有的tradeId
   * Summary: 商户根据合同id列举所有的tradeId
   */
  async listTwcNotaryContractTradeidsEx(request: ListTwcNotaryContractTradeidsRequest, runtime: $Util.RuntimeOptions): Promise<ListTwcNotaryContractTradeidsResponse> {
    Util.validateModel(request);
    return $tea.cast<ListTwcNotaryContractTradeidsResponse>(await this.doRequest("1.0", "twc.notary.contract.tradeids.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ListTwcNotaryContractTradeidsResponse({}));
  }

  /**
   * Description: 商户上传代扣规则
   * Summary: 商户上传代扣规则
   */
  async createTwcNotaryContractCommontrigger(request: CreateTwcNotaryContractCommontriggerRequest): Promise<CreateTwcNotaryContractCommontriggerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryContractCommontriggerEx(request, runtime);
  }

  /**
   * Description: 商户上传代扣规则
   * Summary: 商户上传代扣规则
   */
  async createTwcNotaryContractCommontriggerEx(request: CreateTwcNotaryContractCommontriggerRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryContractCommontriggerResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryContractCommontriggerResponse>(await this.doRequest("1.0", "twc.notary.contract.commontrigger.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryContractCommontriggerResponse({}));
  }

  /**
   * Description: 商户入驻直付通，仅供管理员调用
   * Summary: 商户入驻直付通，仅供管理员调用
   */
  async createTwcNotaryContractMerchantindirectzft(request: CreateTwcNotaryContractMerchantindirectzftRequest): Promise<CreateTwcNotaryContractMerchantindirectzftResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryContractMerchantindirectzftEx(request, runtime);
  }

  /**
   * Description: 商户入驻直付通，仅供管理员调用
   * Summary: 商户入驻直付通，仅供管理员调用
   */
  async createTwcNotaryContractMerchantindirectzftEx(request: CreateTwcNotaryContractMerchantindirectzftRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryContractMerchantindirectzftResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryContractMerchantindirectzftResponse>(await this.doRequest("1.0", "twc.notary.contract.merchantindirectzft.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryContractMerchantindirectzftResponse({}));
  }

  /**
   * Description: 根据订单id查询直付通商户入驻信息
   * Summary: 根据订单id查询直付通商户入驻信息
   */
  async queryTwcNotaryContractMerchantindirectzft(request: QueryTwcNotaryContractMerchantindirectzftRequest): Promise<QueryTwcNotaryContractMerchantindirectzftResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryTwcNotaryContractMerchantindirectzftEx(request, runtime);
  }

  /**
   * Description: 根据订单id查询直付通商户入驻信息
   * Summary: 根据订单id查询直付通商户入驻信息
   */
  async queryTwcNotaryContractMerchantindirectzftEx(request: QueryTwcNotaryContractMerchantindirectzftRequest, runtime: $Util.RuntimeOptions): Promise<QueryTwcNotaryContractMerchantindirectzftResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTwcNotaryContractMerchantindirectzftResponse>(await this.doRequest("1.0", "twc.notary.contract.merchantindirectzft.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryTwcNotaryContractMerchantindirectzftResponse({}));
  }

  /**
   * Description: 获取支付对账文件的url
   * Summary: 获取支付对账文件的url
   */
  async queryTwcNotaryPayresultfileurl(request: QueryTwcNotaryPayresultfileurlRequest): Promise<QueryTwcNotaryPayresultfileurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryTwcNotaryPayresultfileurlEx(request, runtime);
  }

  /**
   * Description: 获取支付对账文件的url
   * Summary: 获取支付对账文件的url
   */
  async queryTwcNotaryPayresultfileurlEx(request: QueryTwcNotaryPayresultfileurlRequest, runtime: $Util.RuntimeOptions): Promise<QueryTwcNotaryPayresultfileurlResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTwcNotaryPayresultfileurlResponse>(await this.doRequest("1.0", "twc.notary.payresultfileurl.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryTwcNotaryPayresultfileurlResponse({}));
  }

  /**
   * Description: 智能合同图片上传
   * Summary: 智能合同图片上传
   */
  async createTwcNotaryContractMerchantimage(request: CreateTwcNotaryContractMerchantimageRequest): Promise<CreateTwcNotaryContractMerchantimageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryContractMerchantimageEx(request, runtime);
  }

  /**
   * Description: 智能合同图片上传
   * Summary: 智能合同图片上传
   */
  async createTwcNotaryContractMerchantimageEx(request: CreateTwcNotaryContractMerchantimageRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryContractMerchantimageResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryContractMerchantimageResponse>(await this.doRequest("1.0", "twc.notary.contract.merchantimage.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryContractMerchantimageResponse({}));
  }

  /**
   * Description: 取消智能合同剩余代扣条目
   * Summary: 取消智能合同剩余代扣条目
   */
  async cancelTwcNotaryContractPaytrade(request: CancelTwcNotaryContractPaytradeRequest): Promise<CancelTwcNotaryContractPaytradeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.cancelTwcNotaryContractPaytradeEx(request, runtime);
  }

  /**
   * Description: 取消智能合同剩余代扣条目
   * Summary: 取消智能合同剩余代扣条目
   */
  async cancelTwcNotaryContractPaytradeEx(request: CancelTwcNotaryContractPaytradeRequest, runtime: $Util.RuntimeOptions): Promise<CancelTwcNotaryContractPaytradeResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelTwcNotaryContractPaytradeResponse>(await this.doRequest("1.0", "twc.notary.contract.paytrade.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CancelTwcNotaryContractPaytradeResponse({}));
  }

  /**
   * Description: 创建手动签署流程
   * Summary: 创建手动签署流程
   */
  async createTwcNotaryContractHandsignflow(request: CreateTwcNotaryContractHandsignflowRequest): Promise<CreateTwcNotaryContractHandsignflowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryContractHandsignflowEx(request, runtime);
  }

  /**
   * Description: 创建手动签署流程
   * Summary: 创建手动签署流程
   */
  async createTwcNotaryContractHandsignflowEx(request: CreateTwcNotaryContractHandsignflowRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryContractHandsignflowResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryContractHandsignflowResponse>(await this.doRequest("1.0", "twc.notary.contract.handsignflow.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryContractHandsignflowResponse({}));
  }

  /**
   * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
   * Summary: 添加电子合同签署方手动盖章签署区
   */
  async createTwcNotaryContractHandsignfield(request: CreateTwcNotaryContractHandsignfieldRequest): Promise<CreateTwcNotaryContractHandsignfieldResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryContractHandsignfieldEx(request, runtime);
  }

  /**
   * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
   * Summary: 添加电子合同签署方手动盖章签署区
   */
  async createTwcNotaryContractHandsignfieldEx(request: CreateTwcNotaryContractHandsignfieldRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryContractHandsignfieldResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryContractHandsignfieldResponse>(await this.doRequest("1.0", "twc.notary.contract.handsignfield.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryContractHandsignfieldResponse({}));
  }

  /**
   * Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
   * Summary: 获取签署地址
   */
  async getTwcNotaryContractSignurl(request: GetTwcNotaryContractSignurlRequest): Promise<GetTwcNotaryContractSignurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.getTwcNotaryContractSignurlEx(request, runtime);
  }

  /**
   * Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
   * Summary: 获取签署地址
   */
  async getTwcNotaryContractSignurlEx(request: GetTwcNotaryContractSignurlRequest, runtime: $Util.RuntimeOptions): Promise<GetTwcNotaryContractSignurlResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTwcNotaryContractSignurlResponse>(await this.doRequest("1.0", "twc.notary.contract.signurl.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new GetTwcNotaryContractSignurlResponse({}));
  }

  /**
   * Description: 可信付代扣规则内容创建
   * Summary: 可信付代扣规则内容创建
   */
  async createTwcNotaryWithholdAgreement(request: CreateTwcNotaryWithholdAgreementRequest): Promise<CreateTwcNotaryWithholdAgreementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryWithholdAgreementEx(request, runtime);
  }

  /**
   * Description: 可信付代扣规则内容创建
   * Summary: 可信付代扣规则内容创建
   */
  async createTwcNotaryWithholdAgreementEx(request: CreateTwcNotaryWithholdAgreementRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryWithholdAgreementResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryWithholdAgreementResponse>(await this.doRequest("1.0", "twc.notary.withhold.agreement.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryWithholdAgreementResponse({}));
  }

  /**
   * Description: 查询消金代扣协议
   * Summary: 查询可信付代扣协议内容
   */
  async queryTwcNotaryWithholdAgreement(request: QueryTwcNotaryWithholdAgreementRequest): Promise<QueryTwcNotaryWithholdAgreementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryTwcNotaryWithholdAgreementEx(request, runtime);
  }

  /**
   * Description: 查询消金代扣协议
   * Summary: 查询可信付代扣协议内容
   */
  async queryTwcNotaryWithholdAgreementEx(request: QueryTwcNotaryWithholdAgreementRequest, runtime: $Util.RuntimeOptions): Promise<QueryTwcNotaryWithholdAgreementResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTwcNotaryWithholdAgreementResponse>(await this.doRequest("1.0", "twc.notary.withhold.agreement.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryTwcNotaryWithholdAgreementResponse({}));
  }

  /**
   * Description: 查询可信付协议的入口
   * Summary: 查询可信付协议的入口
   */
  async queryTwcNotaryWithholdAgreementurl(request: QueryTwcNotaryWithholdAgreementurlRequest): Promise<QueryTwcNotaryWithholdAgreementurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryTwcNotaryWithholdAgreementurlEx(request, runtime);
  }

  /**
   * Description: 查询可信付协议的入口
   * Summary: 查询可信付协议的入口
   */
  async queryTwcNotaryWithholdAgreementurlEx(request: QueryTwcNotaryWithholdAgreementurlRequest, runtime: $Util.RuntimeOptions): Promise<QueryTwcNotaryWithholdAgreementurlResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTwcNotaryWithholdAgreementurlResponse>(await this.doRequest("1.0", "twc.notary.withhold.agreementurl.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryTwcNotaryWithholdAgreementurlResponse({}));
  }

  /**
   * Description: 后台录入商家的产品的逾期日
   * Summary: 后台录入商家的产品的逾期日
   */
  async createTwcNotaryWithholdOverduetime(request: CreateTwcNotaryWithholdOverduetimeRequest): Promise<CreateTwcNotaryWithholdOverduetimeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryWithholdOverduetimeEx(request, runtime);
  }

  /**
   * Description: 后台录入商家的产品的逾期日
   * Summary: 后台录入商家的产品的逾期日
   */
  async createTwcNotaryWithholdOverduetimeEx(request: CreateTwcNotaryWithholdOverduetimeRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryWithholdOverduetimeResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryWithholdOverduetimeResponse>(await this.doRequest("1.0", "twc.notary.withhold.overduetime.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryWithholdOverduetimeResponse({}));
  }

  /**
   * Description: 可信付代扣的扣费请求
   * Summary: 发送代扣请求
   */
  async sendTwcNotaryWithholdDeduct(request: SendTwcNotaryWithholdDeductRequest): Promise<SendTwcNotaryWithholdDeductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.sendTwcNotaryWithholdDeductEx(request, runtime);
  }

  /**
   * Description: 可信付代扣的扣费请求
   * Summary: 发送代扣请求
   */
  async sendTwcNotaryWithholdDeductEx(request: SendTwcNotaryWithholdDeductRequest, runtime: $Util.RuntimeOptions): Promise<SendTwcNotaryWithholdDeductResponse> {
    Util.validateModel(request);
    return $tea.cast<SendTwcNotaryWithholdDeductResponse>(await this.doRequest("1.0", "twc.notary.withhold.deduct.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new SendTwcNotaryWithholdDeductResponse({}));
  }

  /**
   * Description: 可信付代扣结果查询
   * Summary: 可信付代扣结果查询
   */
  async queryTwcNotaryWithholdPayresult(request: QueryTwcNotaryWithholdPayresultRequest): Promise<QueryTwcNotaryWithholdPayresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryTwcNotaryWithholdPayresultEx(request, runtime);
  }

  /**
   * Description: 可信付代扣结果查询
   * Summary: 可信付代扣结果查询
   */
  async queryTwcNotaryWithholdPayresultEx(request: QueryTwcNotaryWithholdPayresultRequest, runtime: $Util.RuntimeOptions): Promise<QueryTwcNotaryWithholdPayresultResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTwcNotaryWithholdPayresultResponse>(await this.doRequest("1.0", "twc.notary.withhold.payresult.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryTwcNotaryWithholdPayresultResponse({}));
  }

  /**
   * Description: 可信付退款请求
   * Summary: 可信付退款请求
   */
  async sendTwcNotaryWithholdRefund(request: SendTwcNotaryWithholdRefundRequest): Promise<SendTwcNotaryWithholdRefundResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.sendTwcNotaryWithholdRefundEx(request, runtime);
  }

  /**
   * Description: 可信付退款请求
   * Summary: 可信付退款请求
   */
  async sendTwcNotaryWithholdRefundEx(request: SendTwcNotaryWithholdRefundRequest, runtime: $Util.RuntimeOptions): Promise<SendTwcNotaryWithholdRefundResponse> {
    Util.validateModel(request);
    return $tea.cast<SendTwcNotaryWithholdRefundResponse>(await this.doRequest("1.0", "twc.notary.withhold.refund.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new SendTwcNotaryWithholdRefundResponse({}));
  }

  /**
   * Description: 创建邀请任务，被邀请人收到通知后需要注册并完成实名认证方可开通电子签名服务。
   * Summary: 创建注册邀请任务
   */
  async sendTwcNotaryContractInvitation(request: SendTwcNotaryContractInvitationRequest): Promise<SendTwcNotaryContractInvitationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.sendTwcNotaryContractInvitationEx(request, runtime);
  }

  /**
   * Description: 创建邀请任务，被邀请人收到通知后需要注册并完成实名认证方可开通电子签名服务。
   * Summary: 创建注册邀请任务
   */
  async sendTwcNotaryContractInvitationEx(request: SendTwcNotaryContractInvitationRequest, runtime: $Util.RuntimeOptions): Promise<SendTwcNotaryContractInvitationResponse> {
    Util.validateModel(request);
    return $tea.cast<SendTwcNotaryContractInvitationResponse>(await this.doRequest("1.0", "twc.notary.contract.invitation.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new SendTwcNotaryContractInvitationResponse({}));
  }

  /**
   * Description: 查询代扣规则
   * Summary: 查询代扣规则
   */
  async listTwcNotaryContractPayrule(request: ListTwcNotaryContractPayruleRequest): Promise<ListTwcNotaryContractPayruleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.listTwcNotaryContractPayruleEx(request, runtime);
  }

  /**
   * Description: 查询代扣规则
   * Summary: 查询代扣规则
   */
  async listTwcNotaryContractPayruleEx(request: ListTwcNotaryContractPayruleRequest, runtime: $Util.RuntimeOptions): Promise<ListTwcNotaryContractPayruleResponse> {
    Util.validateModel(request);
    return $tea.cast<ListTwcNotaryContractPayruleResponse>(await this.doRequest("1.0", "twc.notary.contract.payrule.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ListTwcNotaryContractPayruleResponse({}));
  }

  /**
   * Description: 获取可信付免签协议的二维码
   * Summary: 获取可信付免签协议的二维码
   */
  async createTwcNotaryWithholdQrcode(request: CreateTwcNotaryWithholdQrcodeRequest): Promise<CreateTwcNotaryWithholdQrcodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryWithholdQrcodeEx(request, runtime);
  }

  /**
   * Description: 获取可信付免签协议的二维码
   * Summary: 获取可信付免签协议的二维码
   */
  async createTwcNotaryWithholdQrcodeEx(request: CreateTwcNotaryWithholdQrcodeRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryWithholdQrcodeResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryWithholdQrcodeResponse>(await this.doRequest("1.0", "twc.notary.withhold.qrcode.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryWithholdQrcodeResponse({}));
  }

  /**
   * Description: 取消某一期的代扣规则
   * Summary: 取消某一期的代扣规则
   */
  async cancelTwcNotaryContractPaysingletrade(request: CancelTwcNotaryContractPaysingletradeRequest): Promise<CancelTwcNotaryContractPaysingletradeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.cancelTwcNotaryContractPaysingletradeEx(request, runtime);
  }

  /**
   * Description: 取消某一期的代扣规则
   * Summary: 取消某一期的代扣规则
   */
  async cancelTwcNotaryContractPaysingletradeEx(request: CancelTwcNotaryContractPaysingletradeRequest, runtime: $Util.RuntimeOptions): Promise<CancelTwcNotaryContractPaysingletradeResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelTwcNotaryContractPaysingletradeResponse>(await this.doRequest("1.0", "twc.notary.contract.paysingletrade.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CancelTwcNotaryContractPaysingletradeResponse({}));
  }

  /**
   * Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
   * Summary: 申请区块链合同回调加签key
   */
  async applyTwcNotaryContractCallbackkey(request: ApplyTwcNotaryContractCallbackkeyRequest): Promise<ApplyTwcNotaryContractCallbackkeyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.applyTwcNotaryContractCallbackkeyEx(request, runtime);
  }

  /**
   * Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
   * Summary: 申请区块链合同回调加签key
   */
  async applyTwcNotaryContractCallbackkeyEx(request: ApplyTwcNotaryContractCallbackkeyRequest, runtime: $Util.RuntimeOptions): Promise<ApplyTwcNotaryContractCallbackkeyResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyTwcNotaryContractCallbackkeyResponse>(await this.doRequest("1.0", "twc.notary.contract.callbackkey.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ApplyTwcNotaryContractCallbackkeyResponse({}));
  }

  /**
   * Description: mytf的tapp部署
   * Summary: mytf的tapp部署
   */
  async deployTwcNotaryMytfTapp(request: DeployTwcNotaryMytfTappRequest): Promise<DeployTwcNotaryMytfTappResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.deployTwcNotaryMytfTappEx(request, runtime);
  }

  /**
   * Description: mytf的tapp部署
   * Summary: mytf的tapp部署
   */
  async deployTwcNotaryMytfTappEx(request: DeployTwcNotaryMytfTappRequest, runtime: $Util.RuntimeOptions): Promise<DeployTwcNotaryMytfTappResponse> {
    Util.validateModel(request);
    return $tea.cast<DeployTwcNotaryMytfTappResponse>(await this.doRequest("1.0", "twc.notary.mytf.tapp.deploy", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new DeployTwcNotaryMytfTappResponse({}));
  }

  /**
   * Description: 输入企业名+证件号，发起企业二要素认证请求。
   * Summary: 企业二要素认证
   */
  async checkTwcNotaryEpidentityTwometa(request: CheckTwcNotaryEpidentityTwometaRequest): Promise<CheckTwcNotaryEpidentityTwometaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.checkTwcNotaryEpidentityTwometaEx(request, runtime);
  }

  /**
   * Description: 输入企业名+证件号，发起企业二要素认证请求。
   * Summary: 企业二要素认证
   */
  async checkTwcNotaryEpidentityTwometaEx(request: CheckTwcNotaryEpidentityTwometaRequest, runtime: $Util.RuntimeOptions): Promise<CheckTwcNotaryEpidentityTwometaResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckTwcNotaryEpidentityTwometaResponse>(await this.doRequest("1.0", "twc.notary.epidentity.twometa.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CheckTwcNotaryEpidentityTwometaResponse({}));
  }

  /**
   * Description: 输入企业名+证件号+企业法人姓名，发起企业三要素认证请求。
   * Summary: 企业三要素认证
   */
  async checkTwcNotaryEpidentityThreemeta(request: CheckTwcNotaryEpidentityThreemetaRequest): Promise<CheckTwcNotaryEpidentityThreemetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.checkTwcNotaryEpidentityThreemetaEx(request, runtime);
  }

  /**
   * Description: 输入企业名+证件号+企业法人姓名，发起企业三要素认证请求。
   * Summary: 企业三要素认证
   */
  async checkTwcNotaryEpidentityThreemetaEx(request: CheckTwcNotaryEpidentityThreemetaRequest, runtime: $Util.RuntimeOptions): Promise<CheckTwcNotaryEpidentityThreemetaResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckTwcNotaryEpidentityThreemetaResponse>(await this.doRequest("1.0", "twc.notary.epidentity.threemeta.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CheckTwcNotaryEpidentityThreemetaResponse({}));
  }

  /**
   * Description: 输入企业名+证件号+企业法人姓+法人证件号，发起企业四要素认证请求。
   * Summary: 企业四要素认证
   */
  async checkTwcNotaryEpidentityFourmeta(request: CheckTwcNotaryEpidentityFourmetaRequest): Promise<CheckTwcNotaryEpidentityFourmetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.checkTwcNotaryEpidentityFourmetaEx(request, runtime);
  }

  /**
   * Description: 输入企业名+证件号+企业法人姓+法人证件号，发起企业四要素认证请求。
   * Summary: 企业四要素认证
   */
  async checkTwcNotaryEpidentityFourmetaEx(request: CheckTwcNotaryEpidentityFourmetaRequest, runtime: $Util.RuntimeOptions): Promise<CheckTwcNotaryEpidentityFourmetaResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckTwcNotaryEpidentityFourmetaResponse>(await this.doRequest("1.0", "twc.notary.epidentity.fourmeta.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CheckTwcNotaryEpidentityFourmetaResponse({}));
  }

  /**
   * Description: 查询公证订单的有效性
   * Summary: 查询公证订单的有效性
   */
  async checkTwcNotaryNotarizationOrder(request: CheckTwcNotaryNotarizationOrderRequest): Promise<CheckTwcNotaryNotarizationOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.checkTwcNotaryNotarizationOrderEx(request, runtime);
  }

  /**
   * Description: 查询公证订单的有效性
   * Summary: 查询公证订单的有效性
   */
  async checkTwcNotaryNotarizationOrderEx(request: CheckTwcNotaryNotarizationOrderRequest, runtime: $Util.RuntimeOptions): Promise<CheckTwcNotaryNotarizationOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckTwcNotaryNotarizationOrderResponse>(await this.doRequest("1.0", "twc.notary.notarization.order.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CheckTwcNotaryNotarizationOrderResponse({}));
  }

  /**
   * Description: 更新公证订单状态
   * Summary: 更新公证订单状态
   */
  async updateTwcNotaryNotarizationOrder(request: UpdateTwcNotaryNotarizationOrderRequest): Promise<UpdateTwcNotaryNotarizationOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateTwcNotaryNotarizationOrderEx(request, runtime);
  }

  /**
   * Description: 更新公证订单状态
   * Summary: 更新公证订单状态
   */
  async updateTwcNotaryNotarizationOrderEx(request: UpdateTwcNotaryNotarizationOrderRequest, runtime: $Util.RuntimeOptions): Promise<UpdateTwcNotaryNotarizationOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateTwcNotaryNotarizationOrderResponse>(await this.doRequest("1.0", "twc.notary.notarization.order.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateTwcNotaryNotarizationOrderResponse({}));
  }

  /**
   * Description: 设置订单属性
   * Summary: 设置订单属性
   */
  async setTwcNotaryNotarizationOrder(request: SetTwcNotaryNotarizationOrderRequest): Promise<SetTwcNotaryNotarizationOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.setTwcNotaryNotarizationOrderEx(request, runtime);
  }

  /**
   * Description: 设置订单属性
   * Summary: 设置订单属性
   */
  async setTwcNotaryNotarizationOrderEx(request: SetTwcNotaryNotarizationOrderRequest, runtime: $Util.RuntimeOptions): Promise<SetTwcNotaryNotarizationOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<SetTwcNotaryNotarizationOrderResponse>(await this.doRequest("1.0", "twc.notary.notarization.order.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new SetTwcNotaryNotarizationOrderResponse({}));
  }

  /**
   * Description: 实人认证初始化
   * Summary: 实人认证初始化
   */
  async initTwcNotaryIdentificationFaceauth(request: InitTwcNotaryIdentificationFaceauthRequest): Promise<InitTwcNotaryIdentificationFaceauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.initTwcNotaryIdentificationFaceauthEx(request, runtime);
  }

  /**
   * Description: 实人认证初始化
   * Summary: 实人认证初始化
   */
  async initTwcNotaryIdentificationFaceauthEx(request: InitTwcNotaryIdentificationFaceauthRequest, runtime: $Util.RuntimeOptions): Promise<InitTwcNotaryIdentificationFaceauthResponse> {
    Util.validateModel(request);
    return $tea.cast<InitTwcNotaryIdentificationFaceauthResponse>(await this.doRequest("1.0", "twc.notary.identification.faceauth.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new InitTwcNotaryIdentificationFaceauthResponse({}));
  }

  /**
   * Description: 发起实人认证
   * Summary: 发起实人认证
   */
  async certifyTwcNotaryIdentificationFaceauth(request: CertifyTwcNotaryIdentificationFaceauthRequest): Promise<CertifyTwcNotaryIdentificationFaceauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.certifyTwcNotaryIdentificationFaceauthEx(request, runtime);
  }

  /**
   * Description: 发起实人认证
   * Summary: 发起实人认证
   */
  async certifyTwcNotaryIdentificationFaceauthEx(request: CertifyTwcNotaryIdentificationFaceauthRequest, runtime: $Util.RuntimeOptions): Promise<CertifyTwcNotaryIdentificationFaceauthResponse> {
    Util.validateModel(request);
    return $tea.cast<CertifyTwcNotaryIdentificationFaceauthResponse>(await this.doRequest("1.0", "twc.notary.identification.faceauth.certify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CertifyTwcNotaryIdentificationFaceauthResponse({}));
  }

  /**
   * Description: 查询实人认证结果
   * Summary: 查询实人认证结果
   */
  async queryTwcNotaryIdentificationFaceauth(request: QueryTwcNotaryIdentificationFaceauthRequest): Promise<QueryTwcNotaryIdentificationFaceauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryTwcNotaryIdentificationFaceauthEx(request, runtime);
  }

  /**
   * Description: 查询实人认证结果
   * Summary: 查询实人认证结果
   */
  async queryTwcNotaryIdentificationFaceauthEx(request: QueryTwcNotaryIdentificationFaceauthRequest, runtime: $Util.RuntimeOptions): Promise<QueryTwcNotaryIdentificationFaceauthResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTwcNotaryIdentificationFaceauthResponse>(await this.doRequest("1.0", "twc.notary.identification.faceauth.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryTwcNotaryIdentificationFaceauthResponse({}));
  }

  /**
   * Description: 企业法人认证查询结果接口
   * Summary: 企业法人认证查询
   */
  async queryTwcNotaryEnterpriseFaceauth(request: QueryTwcNotaryEnterpriseFaceauthRequest): Promise<QueryTwcNotaryEnterpriseFaceauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryTwcNotaryEnterpriseFaceauthEx(request, runtime);
  }

  /**
   * Description: 企业法人认证查询结果接口
   * Summary: 企业法人认证查询
   */
  async queryTwcNotaryEnterpriseFaceauthEx(request: QueryTwcNotaryEnterpriseFaceauthRequest, runtime: $Util.RuntimeOptions): Promise<QueryTwcNotaryEnterpriseFaceauthResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTwcNotaryEnterpriseFaceauthResponse>(await this.doRequest("1.0", "twc.notary.enterprise.faceauth.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryTwcNotaryEnterpriseFaceauthResponse({}));
  }

  /**
   * Description: 企业法人认证初始化接口
   * Summary: 企业法人认证初始化
   */
  async initTwcNotaryEnterpriseFaceauth(request: InitTwcNotaryEnterpriseFaceauthRequest): Promise<InitTwcNotaryEnterpriseFaceauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.initTwcNotaryEnterpriseFaceauthEx(request, runtime);
  }

  /**
   * Description: 企业法人认证初始化接口
   * Summary: 企业法人认证初始化
   */
  async initTwcNotaryEnterpriseFaceauthEx(request: InitTwcNotaryEnterpriseFaceauthRequest, runtime: $Util.RuntimeOptions): Promise<InitTwcNotaryEnterpriseFaceauthResponse> {
    Util.validateModel(request);
    return $tea.cast<InitTwcNotaryEnterpriseFaceauthResponse>(await this.doRequest("1.0", "twc.notary.enterprise.faceauth.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new InitTwcNotaryEnterpriseFaceauthResponse({}));
  }

  /**
   * Description: 企业法人认证开始接口
   * Summary: 企业法人认证开始
   */
  async certifyTwcNotaryEnterpriseFaceauth(request: CertifyTwcNotaryEnterpriseFaceauthRequest): Promise<CertifyTwcNotaryEnterpriseFaceauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.certifyTwcNotaryEnterpriseFaceauthEx(request, runtime);
  }

  /**
   * Description: 企业法人认证开始接口
   * Summary: 企业法人认证开始
   */
  async certifyTwcNotaryEnterpriseFaceauthEx(request: CertifyTwcNotaryEnterpriseFaceauthRequest, runtime: $Util.RuntimeOptions): Promise<CertifyTwcNotaryEnterpriseFaceauthResponse> {
    Util.validateModel(request);
    return $tea.cast<CertifyTwcNotaryEnterpriseFaceauthResponse>(await this.doRequest("1.0", "twc.notary.enterprise.faceauth.certify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CertifyTwcNotaryEnterpriseFaceauthResponse({}));
  }

  /**
   * Description: 创建租赁订单
   * Summary: 租赁订单创建
   */
  async createTwcNotaryLeaseOrder(request: CreateTwcNotaryLeaseOrderRequest): Promise<CreateTwcNotaryLeaseOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryLeaseOrderEx(request, runtime);
  }

  /**
   * Description: 创建租赁订单
   * Summary: 租赁订单创建
   */
  async createTwcNotaryLeaseOrderEx(request: CreateTwcNotaryLeaseOrderRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryLeaseOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryLeaseOrderResponse>(await this.doRequest("1.0", "twc.notary.lease.order.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryLeaseOrderResponse({}));
  }

  /**
   * Description: 电子公证或存证证明场景中，用户通过回传相关信息创建收费订单。
   * Summary: 公证场景创建收费订单
   */
  async createTwcNotaryNotarizationBill(request: CreateTwcNotaryNotarizationBillRequest): Promise<CreateTwcNotaryNotarizationBillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryNotarizationBillEx(request, runtime);
  }

  /**
   * Description: 电子公证或存证证明场景中，用户通过回传相关信息创建收费订单。
   * Summary: 公证场景创建收费订单
   */
  async createTwcNotaryNotarizationBillEx(request: CreateTwcNotaryNotarizationBillRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryNotarizationBillResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryNotarizationBillResponse>(await this.doRequest("1.0", "twc.notary.notarization.bill.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryNotarizationBillResponse({}));
  }

  /**
   * Description: 提供必要的存证信息，初始化一个存证证明的订单，提交公证处审核，并返回订单号
   * Summary: 初始化存证证明订单
   */
  async initTwcNotaryCertification(request: InitTwcNotaryCertificationRequest): Promise<InitTwcNotaryCertificationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.initTwcNotaryCertificationEx(request, runtime);
  }

  /**
   * Description: 提供必要的存证信息，初始化一个存证证明的订单，提交公证处审核，并返回订单号
   * Summary: 初始化存证证明订单
   */
  async initTwcNotaryCertificationEx(request: InitTwcNotaryCertificationRequest, runtime: $Util.RuntimeOptions): Promise<InitTwcNotaryCertificationResponse> {
    Util.validateModel(request);
    return $tea.cast<InitTwcNotaryCertificationResponse>(await this.doRequest("1.0", "twc.notary.certification.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new InitTwcNotaryCertificationResponse({}));
  }

  /**
   * Description: 输入申请ID，查询存证证明申请状态，成功后返回下载地址等信息
   * Summary: 查询存证证明申请状态
   */
  async queryTwcNotaryCertification(request: QueryTwcNotaryCertificationRequest): Promise<QueryTwcNotaryCertificationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryTwcNotaryCertificationEx(request, runtime);
  }

  /**
   * Description: 输入申请ID，查询存证证明申请状态，成功后返回下载地址等信息
   * Summary: 查询存证证明申请状态
   */
  async queryTwcNotaryCertificationEx(request: QueryTwcNotaryCertificationRequest, runtime: $Util.RuntimeOptions): Promise<QueryTwcNotaryCertificationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTwcNotaryCertificationResponse>(await this.doRequest("1.0", "twc.notary.certification.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryTwcNotaryCertificationResponse({}));
  }

  /**
   * Description: 可以根据存证过程中获得当可信时间戳凭证，获取国家授时中心颁发的PDF格式可信时间证书
   * Summary: 可信时间凭证服务 - 获取时间凭证证书
   */
  async getTwcNotaryTsrCertificate(request: GetTwcNotaryTsrCertificateRequest): Promise<GetTwcNotaryTsrCertificateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.getTwcNotaryTsrCertificateEx(request, runtime);
  }

  /**
   * Description: 可以根据存证过程中获得当可信时间戳凭证，获取国家授时中心颁发的PDF格式可信时间证书
   * Summary: 可信时间凭证服务 - 获取时间凭证证书
   */
  async getTwcNotaryTsrCertificateEx(request: GetTwcNotaryTsrCertificateRequest, runtime: $Util.RuntimeOptions): Promise<GetTwcNotaryTsrCertificateResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTwcNotaryTsrCertificateResponse>(await this.doRequest("1.0", "twc.notary.tsr.certificate.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new GetTwcNotaryTsrCertificateResponse({}));
  }

  /**
   * Description: 新增/修改履行记录，依据contractCode与contractFulfillmentCode判断唯一性
   * Summary: 联合执行履行记录新增/修改接口
   */
  async saveTwcNotaryJointconstraintRecord(request: SaveTwcNotaryJointconstraintRecordRequest): Promise<SaveTwcNotaryJointconstraintRecordResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.saveTwcNotaryJointconstraintRecordEx(request, runtime);
  }

  /**
   * Description: 新增/修改履行记录，依据contractCode与contractFulfillmentCode判断唯一性
   * Summary: 联合执行履行记录新增/修改接口
   */
  async saveTwcNotaryJointconstraintRecordEx(request: SaveTwcNotaryJointconstraintRecordRequest, runtime: $Util.RuntimeOptions): Promise<SaveTwcNotaryJointconstraintRecordResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveTwcNotaryJointconstraintRecordResponse>(await this.doRequest("1.0", "twc.notary.jointconstraint.record.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new SaveTwcNotaryJointconstraintRecordResponse({}));
  }

  /**
   * Description: 删除履行记录
   * Summary: 履行记录删除接口
   */
  async deleteTwcNotaryJointconstraintRecord(request: DeleteTwcNotaryJointconstraintRecordRequest): Promise<DeleteTwcNotaryJointconstraintRecordResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.deleteTwcNotaryJointconstraintRecordEx(request, runtime);
  }

  /**
   * Description: 删除履行记录
   * Summary: 履行记录删除接口
   */
  async deleteTwcNotaryJointconstraintRecordEx(request: DeleteTwcNotaryJointconstraintRecordRequest, runtime: $Util.RuntimeOptions): Promise<DeleteTwcNotaryJointconstraintRecordResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteTwcNotaryJointconstraintRecordResponse>(await this.doRequest("1.0", "twc.notary.jointconstraint.record.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new DeleteTwcNotaryJointconstraintRecordResponse({}));
  }

  /**
   * Description: 查询违约记录
   * Summary: 违约记录查询接口
   */
  async queryTwcNotaryJointconstraintBreachrecord(request: QueryTwcNotaryJointconstraintBreachrecordRequest): Promise<QueryTwcNotaryJointconstraintBreachrecordResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryTwcNotaryJointconstraintBreachrecordEx(request, runtime);
  }

  /**
   * Description: 查询违约记录
   * Summary: 违约记录查询接口
   */
  async queryTwcNotaryJointconstraintBreachrecordEx(request: QueryTwcNotaryJointconstraintBreachrecordRequest, runtime: $Util.RuntimeOptions): Promise<QueryTwcNotaryJointconstraintBreachrecordResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTwcNotaryJointconstraintBreachrecordResponse>(await this.doRequest("1.0", "twc.notary.jointconstraint.breachrecord.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryTwcNotaryJointconstraintBreachrecordResponse({}));
  }

  /**
   * Description: 获取存证事务ID
   * Summary: 获取存证事务ID
   */
  async createTwcNotaryTrans(request: CreateTwcNotaryTransRequest): Promise<CreateTwcNotaryTransResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryTransEx(request, runtime);
  }

  /**
   * Description: 获取存证事务ID
   * Summary: 获取存证事务ID
   */
  async createTwcNotaryTransEx(request: CreateTwcNotaryTransRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryTransResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryTransResponse>(await this.doRequest("1.0", "twc.notary.trans.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryTransResponse({}));
  }

  /**
   * Description: 通过存证事务Token，获取事务中所有的存证信息
   * Summary: 获取事务中所有的存证信息
   */
  async getTwcNotaryTrans(request: GetTwcNotaryTransRequest): Promise<GetTwcNotaryTransResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.getTwcNotaryTransEx(request, runtime);
  }

  /**
   * Description: 通过存证事务Token，获取事务中所有的存证信息
   * Summary: 获取事务中所有的存证信息
   */
  async getTwcNotaryTransEx(request: GetTwcNotaryTransRequest, runtime: $Util.RuntimeOptions): Promise<GetTwcNotaryTransResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTwcNotaryTransResponse>(await this.doRequest("1.0", "twc.notary.trans.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new GetTwcNotaryTransResponse({}));
  }

  /**
   * Description: 发起文本存证，将文本内容存证上链
   * Summary: 文本存证，将文本内容存证上链
   */
  async createTwcNotaryText(request: CreateTwcNotaryTextRequest): Promise<CreateTwcNotaryTextResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryTextEx(request, runtime);
  }

  /**
   * Description: 发起文本存证，将文本内容存证上链
   * Summary: 文本存证，将文本内容存证上链
   */
  async createTwcNotaryTextEx(request: CreateTwcNotaryTextRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryTextResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryTextResponse>(await this.doRequest("1.0", "twc.notary.text.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryTextResponse({}));
  }

  /**
   * Description: 用户通过交易哈希获取自己上传的文本存证内容
   * Summary: 获取文本存证内容
   */
  async getTwcNotaryText(request: GetTwcNotaryTextRequest): Promise<GetTwcNotaryTextResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.getTwcNotaryTextEx(request, runtime);
  }

  /**
   * Description: 用户通过交易哈希获取自己上传的文本存证内容
   * Summary: 获取文本存证内容
   */
  async getTwcNotaryTextEx(request: GetTwcNotaryTextRequest, runtime: $Util.RuntimeOptions): Promise<GetTwcNotaryTextResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTwcNotaryTextResponse>(await this.doRequest("1.0", "twc.notary.text.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new GetTwcNotaryTextResponse({}));
  }

  /**
   * Description: 发起文件存证，将文件内容存证上链
   * Summary: 文件内容存证上链
   */
  async createTwcNotaryFile(request: CreateTwcNotaryFileRequest): Promise<CreateTwcNotaryFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryFileEx(request, runtime);
  }

  /**
   * Description: 发起文件存证，将文件内容存证上链
   * Summary: 文件内容存证上链
   */
  async createTwcNotaryFileEx(request: CreateTwcNotaryFileRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryFileResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryFileResponse>(await this.doRequest("1.0", "twc.notary.file.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryFileResponse({}));
  }

  /**
   * Description: 用户通过交易哈希获取自己上传的文件存证oss下载地址
   * Summary: 获取文件存证oss下载地址
   */
  async getTwcNotaryFile(request: GetTwcNotaryFileRequest): Promise<GetTwcNotaryFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.getTwcNotaryFileEx(request, runtime);
  }

  /**
   * Description: 用户通过交易哈希获取自己上传的文件存证oss下载地址
   * Summary: 获取文件存证oss下载地址
   */
  async getTwcNotaryFileEx(request: GetTwcNotaryFileRequest, runtime: $Util.RuntimeOptions): Promise<GetTwcNotaryFileResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTwcNotaryFileResponse>(await this.doRequest("1.0", "twc.notary.file.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new GetTwcNotaryFileResponse({}));
  }

  /**
   * Description: 发起原文存证，将原文内容存证上链
   * Summary: 原文内容存证
   */
  async createTwcNotarySource(request: CreateTwcNotarySourceRequest): Promise<CreateTwcNotarySourceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotarySourceEx(request, runtime);
  }

  /**
   * Description: 发起原文存证，将原文内容存证上链
   * Summary: 原文内容存证
   */
  async createTwcNotarySourceEx(request: CreateTwcNotarySourceRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotarySourceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotarySourceResponse>(await this.doRequest("1.0", "twc.notary.source.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotarySourceResponse({}));
  }

  /**
   * Description: 用户通过交易哈希获取自己上传的原文存证oss下载地址
   * Summary: 获取原文存证oss下载地址
   */
  async getTwcNotarySource(request: GetTwcNotarySourceRequest): Promise<GetTwcNotarySourceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.getTwcNotarySourceEx(request, runtime);
  }

  /**
   * Description: 用户通过交易哈希获取自己上传的原文存证oss下载地址
   * Summary: 获取原文存证oss下载地址
   */
  async getTwcNotarySourceEx(request: GetTwcNotarySourceRequest, runtime: $Util.RuntimeOptions): Promise<GetTwcNotarySourceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTwcNotarySourceResponse>(await this.doRequest("1.0", "twc.notary.source.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new GetTwcNotarySourceResponse({}));
  }

  /**
   * Description: 创建存证后，使用存证凭据核验存证状态。
   * Summary: 存证内容核验
   */
  async checkTwcNotaryStatus(request: CheckTwcNotaryStatusRequest): Promise<CheckTwcNotaryStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.checkTwcNotaryStatusEx(request, runtime);
  }

  /**
   * Description: 创建存证后，使用存证凭据核验存证状态。
   * Summary: 存证内容核验
   */
  async checkTwcNotaryStatusEx(request: CheckTwcNotaryStatusRequest, runtime: $Util.RuntimeOptions): Promise<CheckTwcNotaryStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckTwcNotaryStatusResponse>(await this.doRequest("1.0", "twc.notary.status.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CheckTwcNotaryStatusResponse({}));
  }

  /**
   * Description: 融资服务平台部署合约
   * Summary: 融资服务平台部署合约
   */
  async deployTwcNotaryLeaseContract(request: DeployTwcNotaryLeaseContractRequest): Promise<DeployTwcNotaryLeaseContractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.deployTwcNotaryLeaseContractEx(request, runtime);
  }

  /**
   * Description: 融资服务平台部署合约
   * Summary: 融资服务平台部署合约
   */
  async deployTwcNotaryLeaseContractEx(request: DeployTwcNotaryLeaseContractRequest, runtime: $Util.RuntimeOptions): Promise<DeployTwcNotaryLeaseContractResponse> {
    Util.validateModel(request);
    return $tea.cast<DeployTwcNotaryLeaseContractResponse>(await this.doRequest("1.0", "twc.notary.lease.contract.deploy", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new DeployTwcNotaryLeaseContractResponse({}));
  }

  /**
   * Description: 融资服务平台上传商品类别信息
   * Summary: 融资服务平台上传商品类别信息
   */
  async createTwcNotaryLeaseProductinfo(request: CreateTwcNotaryLeaseProductinfoRequest): Promise<CreateTwcNotaryLeaseProductinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryLeaseProductinfoEx(request, runtime);
  }

  /**
   * Description: 融资服务平台上传商品类别信息
   * Summary: 融资服务平台上传商品类别信息
   */
  async createTwcNotaryLeaseProductinfoEx(request: CreateTwcNotaryLeaseProductinfoRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryLeaseProductinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryLeaseProductinfoResponse>(await this.doRequest("1.0", "twc.notary.lease.productinfo.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryLeaseProductinfoResponse({}));
  }

  /**
   * Description: 租赁服务平台授权融资服务平台
   * Summary: 租赁服务平台授权融资服务平台
   */
  async authTwcNotaryLeaseContract(request: AuthTwcNotaryLeaseContractRequest): Promise<AuthTwcNotaryLeaseContractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.authTwcNotaryLeaseContractEx(request, runtime);
  }

  /**
   * Description: 租赁服务平台授权融资服务平台
   * Summary: 租赁服务平台授权融资服务平台
   */
  async authTwcNotaryLeaseContractEx(request: AuthTwcNotaryLeaseContractRequest, runtime: $Util.RuntimeOptions): Promise<AuthTwcNotaryLeaseContractResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthTwcNotaryLeaseContractResponse>(await this.doRequest("1.0", "twc.notary.lease.contract.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new AuthTwcNotaryLeaseContractResponse({}));
  }

  /**
   * Description: 租赁服务平台上传用户信息
   * Summary: 租赁服务平台上传用户信息
   */
  async createTwcNotaryLeaseUserinfo(request: CreateTwcNotaryLeaseUserinfoRequest): Promise<CreateTwcNotaryLeaseUserinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryLeaseUserinfoEx(request, runtime);
  }

  /**
   * Description: 租赁服务平台上传用户信息
   * Summary: 租赁服务平台上传用户信息
   */
  async createTwcNotaryLeaseUserinfoEx(request: CreateTwcNotaryLeaseUserinfoRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryLeaseUserinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryLeaseUserinfoResponse>(await this.doRequest("1.0", "twc.notary.lease.userinfo.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryLeaseUserinfoResponse({}));
  }

  /**
   * Description: 租赁服务平台上传订单产品/服务信息
   * Summary: 租赁服务平台上传订单产品/服务信息
   */
  async createTwcNotaryLeaseOrderinfo(request: CreateTwcNotaryLeaseOrderinfoRequest): Promise<CreateTwcNotaryLeaseOrderinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryLeaseOrderinfoEx(request, runtime);
  }

  /**
   * Description: 租赁服务平台上传订单产品/服务信息
   * Summary: 租赁服务平台上传订单产品/服务信息
   */
  async createTwcNotaryLeaseOrderinfoEx(request: CreateTwcNotaryLeaseOrderinfoRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryLeaseOrderinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryLeaseOrderinfoResponse>(await this.doRequest("1.0", "twc.notary.lease.orderinfo.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryLeaseOrderinfoResponse({}));
  }

  /**
   * Description: 租赁服务平台上传承诺信息
   * Summary: 租赁服务平台上传承诺信息
   */
  async createTwcNotaryLeasePromise(request: CreateTwcNotaryLeasePromiseRequest): Promise<CreateTwcNotaryLeasePromiseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryLeasePromiseEx(request, runtime);
  }

  /**
   * Description: 租赁服务平台上传承诺信息
   * Summary: 租赁服务平台上传承诺信息
   */
  async createTwcNotaryLeasePromiseEx(request: CreateTwcNotaryLeasePromiseRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryLeasePromiseResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryLeasePromiseResponse>(await this.doRequest("1.0", "twc.notary.lease.promise.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryLeasePromiseResponse({}));
  }

  /**
   * Description: 融资平台上传租赁物购买贷款订单信息
   * Summary: 融资平台上传租赁物购买贷款订单信息
   */
  async createTwcNotaryLeaseVerifyinfo(request: CreateTwcNotaryLeaseVerifyinfoRequest): Promise<CreateTwcNotaryLeaseVerifyinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryLeaseVerifyinfoEx(request, runtime);
  }

  /**
   * Description: 融资平台上传租赁物购买贷款订单信息
   * Summary: 融资平台上传租赁物购买贷款订单信息
   */
  async createTwcNotaryLeaseVerifyinfoEx(request: CreateTwcNotaryLeaseVerifyinfoRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryLeaseVerifyinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryLeaseVerifyinfoResponse>(await this.doRequest("1.0", "twc.notary.lease.verifyinfo.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryLeaseVerifyinfoResponse({}));
  }

  /**
   * Description: 融资方上传承诺信息
   * Summary: 融资方上传承诺信息
   */
  async createTwcNotaryLeaseCreditpromise(request: CreateTwcNotaryLeaseCreditpromiseRequest): Promise<CreateTwcNotaryLeaseCreditpromiseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryLeaseCreditpromiseEx(request, runtime);
  }

  /**
   * Description: 融资方上传承诺信息
   * Summary: 融资方上传承诺信息
   */
  async createTwcNotaryLeaseCreditpromiseEx(request: CreateTwcNotaryLeaseCreditpromiseRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryLeaseCreditpromiseResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryLeaseCreditpromiseResponse>(await this.doRequest("1.0", "twc.notary.lease.creditpromise.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryLeaseCreditpromiseResponse({}));
  }

  /**
   * Description: 租赁平台上传支用/还款信息
   * Summary: 租赁平台上传支用/还款信息
   */
  async createTwcNotaryLeaseDisburseinfo(request: CreateTwcNotaryLeaseDisburseinfoRequest): Promise<CreateTwcNotaryLeaseDisburseinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryLeaseDisburseinfoEx(request, runtime);
  }

  /**
   * Description: 租赁平台上传支用/还款信息
   * Summary: 租赁平台上传支用/还款信息
   */
  async createTwcNotaryLeaseDisburseinfoEx(request: CreateTwcNotaryLeaseDisburseinfoRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryLeaseDisburseinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryLeaseDisburseinfoResponse>(await this.doRequest("1.0", "twc.notary.lease.disburseinfo.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryLeaseDisburseinfoResponse({}));
  }

  /**
   * Description:  查询订单详细信息
   * Summary:  查询订单详细信息
   */
  async queryTwcNotaryLeaseOrderinfo(request: QueryTwcNotaryLeaseOrderinfoRequest): Promise<QueryTwcNotaryLeaseOrderinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryTwcNotaryLeaseOrderinfoEx(request, runtime);
  }

  /**
   * Description:  查询订单详细信息
   * Summary:  查询订单详细信息
   */
  async queryTwcNotaryLeaseOrderinfoEx(request: QueryTwcNotaryLeaseOrderinfoRequest, runtime: $Util.RuntimeOptions): Promise<QueryTwcNotaryLeaseOrderinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTwcNotaryLeaseOrderinfoResponse>(await this.doRequest("1.0", "twc.notary.lease.orderinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryTwcNotaryLeaseOrderinfoResponse({}));
  }

  /**
   * Description: 创建金融行业标准文本存证
   * Summary: 创建金融行业文本存证
   */
  async createTwcNotaryFinanceTextnotary(request: CreateTwcNotaryFinanceTextnotaryRequest): Promise<CreateTwcNotaryFinanceTextnotaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryFinanceTextnotaryEx(request, runtime);
  }

  /**
   * Description: 创建金融行业标准文本存证
   * Summary: 创建金融行业文本存证
   */
  async createTwcNotaryFinanceTextnotaryEx(request: CreateTwcNotaryFinanceTextnotaryRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryFinanceTextnotaryResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryFinanceTextnotaryResponse>(await this.doRequest("1.0", "twc.notary.finance.textnotary.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryFinanceTextnotaryResponse({}));
  }

  /**
   * Description: 获取金融行业文本存证接口描述
   * Summary: 获取金融行业文本存证
   */
  async getTwcNotaryFinanceTextnotary(request: GetTwcNotaryFinanceTextnotaryRequest): Promise<GetTwcNotaryFinanceTextnotaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.getTwcNotaryFinanceTextnotaryEx(request, runtime);
  }

  /**
   * Description: 获取金融行业文本存证接口描述
   * Summary: 获取金融行业文本存证
   */
  async getTwcNotaryFinanceTextnotaryEx(request: GetTwcNotaryFinanceTextnotaryRequest, runtime: $Util.RuntimeOptions): Promise<GetTwcNotaryFinanceTextnotaryResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTwcNotaryFinanceTextnotaryResponse>(await this.doRequest("1.0", "twc.notary.finance.textnotary.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new GetTwcNotaryFinanceTextnotaryResponse({}));
  }

  /**
   * Description: 创建金融行业文件存证接口描述
   * Summary: 创建金融行业文件存证
   */
  async createTwcNotaryFinanceFilenotary(request: CreateTwcNotaryFinanceFilenotaryRequest): Promise<CreateTwcNotaryFinanceFilenotaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryFinanceFilenotaryEx(request, runtime);
  }

  /**
   * Description: 创建金融行业文件存证接口描述
   * Summary: 创建金融行业文件存证
   */
  async createTwcNotaryFinanceFilenotaryEx(request: CreateTwcNotaryFinanceFilenotaryRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryFinanceFilenotaryResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryFinanceFilenotaryResponse>(await this.doRequest("1.0", "twc.notary.finance.filenotary.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryFinanceFilenotaryResponse({}));
  }

  /**
   * Description: 获取金融行业文件存证接口描述
   * Summary: 获取金融行业文件存证
   */
  async getTwcNotaryFinanceFilenotary(request: GetTwcNotaryFinanceFilenotaryRequest): Promise<GetTwcNotaryFinanceFilenotaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.getTwcNotaryFinanceFilenotaryEx(request, runtime);
  }

  /**
   * Description: 获取金融行业文件存证接口描述
   * Summary: 获取金融行业文件存证
   */
  async getTwcNotaryFinanceFilenotaryEx(request: GetTwcNotaryFinanceFilenotaryRequest, runtime: $Util.RuntimeOptions): Promise<GetTwcNotaryFinanceFilenotaryResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTwcNotaryFinanceFilenotaryResponse>(await this.doRequest("1.0", "twc.notary.finance.filenotary.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new GetTwcNotaryFinanceFilenotaryResponse({}));
  }

  /**
   * Description: 统一存证核验接口
   * Summary: 统一存证核验接口（已下架）
   */
  async checkTwcNotaryIndustryNotary(request: CheckTwcNotaryIndustryNotaryRequest): Promise<CheckTwcNotaryIndustryNotaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.checkTwcNotaryIndustryNotaryEx(request, runtime);
  }

  /**
   * Description: 统一存证核验接口
   * Summary: 统一存证核验接口（已下架）
   */
  async checkTwcNotaryIndustryNotaryEx(request: CheckTwcNotaryIndustryNotaryRequest, runtime: $Util.RuntimeOptions): Promise<CheckTwcNotaryIndustryNotaryResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckTwcNotaryIndustryNotaryResponse>(await this.doRequest("1.0", "twc.notary.industry.notary.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CheckTwcNotaryIndustryNotaryResponse({}));
  }

  /**
   * Description: 升级融资租赁合约
   * Summary: 升级融资租赁合约
   */
  async updateTwcNotaryLeaseContract(request: UpdateTwcNotaryLeaseContractRequest): Promise<UpdateTwcNotaryLeaseContractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateTwcNotaryLeaseContractEx(request, runtime);
  }

  /**
   * Description: 升级融资租赁合约
   * Summary: 升级融资租赁合约
   */
  async updateTwcNotaryLeaseContractEx(request: UpdateTwcNotaryLeaseContractRequest, runtime: $Util.RuntimeOptions): Promise<UpdateTwcNotaryLeaseContractResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateTwcNotaryLeaseContractResponse>(await this.doRequest("1.0", "twc.notary.lease.contract.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateTwcNotaryLeaseContractResponse({}));
  }

  /**
   * Description: 违约案件信息提交服务
   * Summary: 违约案件信息提交服务
   */
  async createTwcNotarySueBreakpromiseinfo(request: CreateTwcNotarySueBreakpromiseinfoRequest): Promise<CreateTwcNotarySueBreakpromiseinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotarySueBreakpromiseinfoEx(request, runtime);
  }

  /**
   * Description: 违约案件信息提交服务
   * Summary: 违约案件信息提交服务
   */
  async createTwcNotarySueBreakpromiseinfoEx(request: CreateTwcNotarySueBreakpromiseinfoRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotarySueBreakpromiseinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotarySueBreakpromiseinfoResponse>(await this.doRequest("1.0", "twc.notary.sue.breakpromiseinfo.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotarySueBreakpromiseinfoResponse({}));
  }

  /**
   * Description: 违约案件信息修改服务
   * Summary: 违约案件信息修改服务
   */
  async updateTwcNotarySueBreakpromiseinfo(request: UpdateTwcNotarySueBreakpromiseinfoRequest): Promise<UpdateTwcNotarySueBreakpromiseinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateTwcNotarySueBreakpromiseinfoEx(request, runtime);
  }

  /**
   * Description: 违约案件信息修改服务
   * Summary: 违约案件信息修改服务
   */
  async updateTwcNotarySueBreakpromiseinfoEx(request: UpdateTwcNotarySueBreakpromiseinfoRequest, runtime: $Util.RuntimeOptions): Promise<UpdateTwcNotarySueBreakpromiseinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateTwcNotarySueBreakpromiseinfoResponse>(await this.doRequest("1.0", "twc.notary.sue.breakpromiseinfo.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateTwcNotarySueBreakpromiseinfoResponse({}));
  }

  /**
   * Description: 违约案件信息删除服务
   * Summary: 违约案件信息删除服务
   */
  async deleteTwcNotarySueBreakpromiseinfo(request: DeleteTwcNotarySueBreakpromiseinfoRequest): Promise<DeleteTwcNotarySueBreakpromiseinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.deleteTwcNotarySueBreakpromiseinfoEx(request, runtime);
  }

  /**
   * Description: 违约案件信息删除服务
   * Summary: 违约案件信息删除服务
   */
  async deleteTwcNotarySueBreakpromiseinfoEx(request: DeleteTwcNotarySueBreakpromiseinfoRequest, runtime: $Util.RuntimeOptions): Promise<DeleteTwcNotarySueBreakpromiseinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteTwcNotarySueBreakpromiseinfoResponse>(await this.doRequest("1.0", "twc.notary.sue.breakpromiseinfo.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new DeleteTwcNotarySueBreakpromiseinfoResponse({}));
  }

  /**
   * Description: 查询惩戒信息
   * Summary: 查询惩戒信息
   */
  async queryTwcNotarySueUserinfo(request: QueryTwcNotarySueUserinfoRequest): Promise<QueryTwcNotarySueUserinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryTwcNotarySueUserinfoEx(request, runtime);
  }

  /**
   * Description: 查询惩戒信息
   * Summary: 查询惩戒信息
   */
  async queryTwcNotarySueUserinfoEx(request: QueryTwcNotarySueUserinfoRequest, runtime: $Util.RuntimeOptions): Promise<QueryTwcNotarySueUserinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTwcNotarySueUserinfoResponse>(await this.doRequest("1.0", "twc.notary.sue.userinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryTwcNotarySueUserinfoResponse({}));
  }

  /**
   * Description: 升级用户管理合约
   * Summary: 升级用户管理合约
   */
  async updateTwcNotarySueExeplarycontract(request: UpdateTwcNotarySueExeplarycontractRequest): Promise<UpdateTwcNotarySueExeplarycontractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateTwcNotarySueExeplarycontractEx(request, runtime);
  }

  /**
   * Description: 升级用户管理合约
   * Summary: 升级用户管理合约
   */
  async updateTwcNotarySueExeplarycontractEx(request: UpdateTwcNotarySueExeplarycontractRequest, runtime: $Util.RuntimeOptions): Promise<UpdateTwcNotarySueExeplarycontractResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateTwcNotarySueExeplarycontractResponse>(await this.doRequest("1.0", "twc.notary.sue.exeplarycontract.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateTwcNotarySueExeplarycontractResponse({}));
  }

  /**
   * Description: 回退用户管理合约
   * Summary: 回退用户管理合约
   */
  async updateTwcNotarySueExemplaryrevert(request: UpdateTwcNotarySueExemplaryrevertRequest): Promise<UpdateTwcNotarySueExemplaryrevertResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateTwcNotarySueExemplaryrevertEx(request, runtime);
  }

  /**
   * Description: 回退用户管理合约
   * Summary: 回退用户管理合约
   */
  async updateTwcNotarySueExemplaryrevertEx(request: UpdateTwcNotarySueExemplaryrevertRequest, runtime: $Util.RuntimeOptions): Promise<UpdateTwcNotarySueExemplaryrevertResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateTwcNotarySueExemplaryrevertResponse>(await this.doRequest("1.0", "twc.notary.sue.exemplaryrevert.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateTwcNotarySueExemplaryrevertResponse({}));
  }

  /**
   * Description: 融资平台审核订单信息
   * Summary: 融资平台审核订单信息
   */
  async createTwcNotaryLeaseAudit(request: CreateTwcNotaryLeaseAuditRequest): Promise<CreateTwcNotaryLeaseAuditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryLeaseAuditEx(request, runtime);
  }

  /**
   * Description: 融资平台审核订单信息
   * Summary: 融资平台审核订单信息
   */
  async createTwcNotaryLeaseAuditEx(request: CreateTwcNotaryLeaseAuditRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryLeaseAuditResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryLeaseAuditResponse>(await this.doRequest("1.0", "twc.notary.lease.audit.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryLeaseAuditResponse({}));
  }

  /**
   * Description: 租赁平台上传付款通知信息
   * Summary: 租赁平台上传付款通知信息
   */
  async createTwcNotaryLeasePaymentfile(request: CreateTwcNotaryLeasePaymentfileRequest): Promise<CreateTwcNotaryLeasePaymentfileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryLeasePaymentfileEx(request, runtime);
  }

  /**
   * Description: 租赁平台上传付款通知信息
   * Summary: 租赁平台上传付款通知信息
   */
  async createTwcNotaryLeasePaymentfileEx(request: CreateTwcNotaryLeasePaymentfileRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryLeasePaymentfileResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryLeasePaymentfileResponse>(await this.doRequest("1.0", "twc.notary.lease.paymentfile.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryLeasePaymentfileResponse({}));
  }

  /**
   * Description: 租赁系统上传租金归还记录 分期调用
   * Summary: 租赁系统上传租金归还记录 分期调用
   */
  async createTwcNotaryLeaseRental(request: CreateTwcNotaryLeaseRentalRequest): Promise<CreateTwcNotaryLeaseRentalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryLeaseRentalEx(request, runtime);
  }

  /**
   * Description: 租赁系统上传租金归还记录 分期调用
   * Summary: 租赁系统上传租金归还记录 分期调用
   */
  async createTwcNotaryLeaseRentalEx(request: CreateTwcNotaryLeaseRentalRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryLeaseRentalResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryLeaseRentalResponse>(await this.doRequest("1.0", "twc.notary.lease.rental.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryLeaseRentalResponse({}));
  }

  /**
   * Description: 清分服务机构上传资金清算记录，分期
   * Summary: 清分服务机构上传资金清算记录，分期
   */
  async createTwcNotaryLeaseClearing(request: CreateTwcNotaryLeaseClearingRequest): Promise<CreateTwcNotaryLeaseClearingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryLeaseClearingEx(request, runtime);
  }

  /**
   * Description: 清分服务机构上传资金清算记录，分期
   * Summary: 清分服务机构上传资金清算记录，分期
   */
  async createTwcNotaryLeaseClearingEx(request: CreateTwcNotaryLeaseClearingRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryLeaseClearingResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryLeaseClearingResponse>(await this.doRequest("1.0", "twc.notary.lease.clearing.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryLeaseClearingResponse({}));
  }

  /**
   * Description: 融资金融机构上传还款信息 每期
   * Summary: 融资金融机构上传还款信息 每期
   */
  async createTwcNotaryLeaseRepayment(request: CreateTwcNotaryLeaseRepaymentRequest): Promise<CreateTwcNotaryLeaseRepaymentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryLeaseRepaymentEx(request, runtime);
  }

  /**
   * Description: 融资金融机构上传还款信息 每期
   * Summary: 融资金融机构上传还款信息 每期
   */
  async createTwcNotaryLeaseRepaymentEx(request: CreateTwcNotaryLeaseRepaymentRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryLeaseRepaymentResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryLeaseRepaymentResponse>(await this.doRequest("1.0", "twc.notary.lease.repayment.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryLeaseRepaymentResponse({}));
  }

  /**
   * Description: 融资租赁通知系统注册
   * Summary: 融资租赁通知系统注册
   */
  async createTwcNotaryLeaseNotifyregister(request: CreateTwcNotaryLeaseNotifyregisterRequest): Promise<CreateTwcNotaryLeaseNotifyregisterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryLeaseNotifyregisterEx(request, runtime);
  }

  /**
   * Description: 融资租赁通知系统注册
   * Summary: 融资租赁通知系统注册
   */
  async createTwcNotaryLeaseNotifyregisterEx(request: CreateTwcNotaryLeaseNotifyregisterRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryLeaseNotifyregisterResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryLeaseNotifyregisterResponse>(await this.doRequest("1.0", "twc.notary.lease.notifyregister.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryLeaseNotifyregisterResponse({}));
  }

  /**
   * Description: 根据imeiID查询iot设备的详情
   * Summary: 根据imeiID查询iot设备的详情
   */
  async queryTwcNotaryLeaseIotinfo(request: QueryTwcNotaryLeaseIotinfoRequest): Promise<QueryTwcNotaryLeaseIotinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryTwcNotaryLeaseIotinfoEx(request, runtime);
  }

  /**
   * Description: 根据imeiID查询iot设备的详情
   * Summary: 根据imeiID查询iot设备的详情
   */
  async queryTwcNotaryLeaseIotinfoEx(request: QueryTwcNotaryLeaseIotinfoRequest, runtime: $Util.RuntimeOptions): Promise<QueryTwcNotaryLeaseIotinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTwcNotaryLeaseIotinfoResponse>(await this.doRequest("1.0", "twc.notary.lease.iotinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryTwcNotaryLeaseIotinfoResponse({}));
  }

  /**
   * Description: 创建法院通用文本存证
   * Summary: 法院通用文本存证创建接口
   */
  async createTwcNotaryCourtTextnotary(request: CreateTwcNotaryCourtTextnotaryRequest): Promise<CreateTwcNotaryCourtTextnotaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryCourtTextnotaryEx(request, runtime);
  }

  /**
   * Description: 创建法院通用文本存证
   * Summary: 法院通用文本存证创建接口
   */
  async createTwcNotaryCourtTextnotaryEx(request: CreateTwcNotaryCourtTextnotaryRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryCourtTextnotaryResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryCourtTextnotaryResponse>(await this.doRequest("1.0", "twc.notary.court.textnotary.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryCourtTextnotaryResponse({}));
  }

  /**
   * Description: 获取法院通用文本存证
   * Summary: 法院通用文本存证获取接口
   */
  async getTwcNotaryCourtTextnotary(request: GetTwcNotaryCourtTextnotaryRequest): Promise<GetTwcNotaryCourtTextnotaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.getTwcNotaryCourtTextnotaryEx(request, runtime);
  }

  /**
   * Description: 获取法院通用文本存证
   * Summary: 法院通用文本存证获取接口
   */
  async getTwcNotaryCourtTextnotaryEx(request: GetTwcNotaryCourtTextnotaryRequest, runtime: $Util.RuntimeOptions): Promise<GetTwcNotaryCourtTextnotaryResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTwcNotaryCourtTextnotaryResponse>(await this.doRequest("1.0", "twc.notary.court.textnotary.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new GetTwcNotaryCourtTextnotaryResponse({}));
  }

  /**
   * Description: 创建法院通用文件存证接口
   * Summary: 法院通用文件存证创建接口
   */
  async createTwcNotaryCourtFilenotary(request: CreateTwcNotaryCourtFilenotaryRequest): Promise<CreateTwcNotaryCourtFilenotaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryCourtFilenotaryEx(request, runtime);
  }

  /**
   * Description: 创建法院通用文件存证接口
   * Summary: 法院通用文件存证创建接口
   */
  async createTwcNotaryCourtFilenotaryEx(request: CreateTwcNotaryCourtFilenotaryRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryCourtFilenotaryResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryCourtFilenotaryResponse>(await this.doRequest("1.0", "twc.notary.court.filenotary.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryCourtFilenotaryResponse({}));
  }

  /**
   * Description: 获取法院通用文件存证
   * Summary: 法院通用文件存证获取接口
   */
  async getTwcNotaryCourtFilenotary(request: GetTwcNotaryCourtFilenotaryRequest): Promise<GetTwcNotaryCourtFilenotaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.getTwcNotaryCourtFilenotaryEx(request, runtime);
  }

  /**
   * Description: 获取法院通用文件存证
   * Summary: 法院通用文件存证获取接口
   */
  async getTwcNotaryCourtFilenotaryEx(request: GetTwcNotaryCourtFilenotaryRequest, runtime: $Util.RuntimeOptions): Promise<GetTwcNotaryCourtFilenotaryResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTwcNotaryCourtFilenotaryResponse>(await this.doRequest("1.0", "twc.notary.court.filenotary.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new GetTwcNotaryCourtFilenotaryResponse({}));
  }

  /**
   * Description: 融资租赁定制化统一入口
   * Summary: 融资租赁定制化统一入口
   */
  async createTwcNotaryLeaseRoute(request: CreateTwcNotaryLeaseRouteRequest): Promise<CreateTwcNotaryLeaseRouteResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryLeaseRouteEx(request, runtime);
  }

  /**
   * Description: 融资租赁定制化统一入口
   * Summary: 融资租赁定制化统一入口
   */
  async createTwcNotaryLeaseRouteEx(request: CreateTwcNotaryLeaseRouteRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryLeaseRouteResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryLeaseRouteResponse>(await this.doRequest("1.0", "twc.notary.lease.route.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryLeaseRouteResponse({}));
  }

  /**
   * Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密
   * Summary: 查询用户等加密信息
   */
  async queryTwcNotaryLeaseEncryptedinfo(request: QueryTwcNotaryLeaseEncryptedinfoRequest): Promise<QueryTwcNotaryLeaseEncryptedinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryTwcNotaryLeaseEncryptedinfoEx(request, runtime);
  }

  /**
   * Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密
   * Summary: 查询用户等加密信息
   */
  async queryTwcNotaryLeaseEncryptedinfoEx(request: QueryTwcNotaryLeaseEncryptedinfoRequest, runtime: $Util.RuntimeOptions): Promise<QueryTwcNotaryLeaseEncryptedinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTwcNotaryLeaseEncryptedinfoResponse>(await this.doRequest("1.0", "twc.notary.lease.encryptedinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryTwcNotaryLeaseEncryptedinfoResponse({}));
  }

  /**
   * Description: 电子合同文本存证
   * Summary: 电子合同文本存证
   */
  async createTwcNotaryContractText(request: CreateTwcNotaryContractTextRequest): Promise<CreateTwcNotaryContractTextResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryContractTextEx(request, runtime);
  }

  /**
   * Description: 电子合同文本存证
   * Summary: 电子合同文本存证
   */
  async createTwcNotaryContractTextEx(request: CreateTwcNotaryContractTextRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryContractTextResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryContractTextResponse>(await this.doRequest("1.0", "twc.notary.contract.text.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryContractTextResponse({}));
  }

  /**
   * Description: 全流程存证后，批量提交全流程核验信息，申请出证报告授权码。成功后可生成全流程上链报告
   * Summary: 申请电子合同存证报告
   */
  async applyTwcNotaryContractReport(request: ApplyTwcNotaryContractReportRequest): Promise<ApplyTwcNotaryContractReportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.applyTwcNotaryContractReportEx(request, runtime);
  }

  /**
   * Description: 全流程存证后，批量提交全流程核验信息，申请出证报告授权码。成功后可生成全流程上链报告
   * Summary: 申请电子合同存证报告
   */
  async applyTwcNotaryContractReportEx(request: ApplyTwcNotaryContractReportRequest, runtime: $Util.RuntimeOptions): Promise<ApplyTwcNotaryContractReportResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyTwcNotaryContractReportResponse>(await this.doRequest("1.0", "twc.notary.contract.report.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ApplyTwcNotaryContractReportResponse({}));
  }

  /**
   * Description: 下载合同存证某个环节的内容，得到存证信息对象最终上链的JSON序列化形式，该内容可用于统一核验
   * Summary: 下载合同存证
   */
  async getTwcNotaryContractText(request: GetTwcNotaryContractTextRequest): Promise<GetTwcNotaryContractTextResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.getTwcNotaryContractTextEx(request, runtime);
  }

  /**
   * Description: 下载合同存证某个环节的内容，得到存证信息对象最终上链的JSON序列化形式，该内容可用于统一核验
   * Summary: 下载合同存证
   */
  async getTwcNotaryContractTextEx(request: GetTwcNotaryContractTextRequest, runtime: $Util.RuntimeOptions): Promise<GetTwcNotaryContractTextResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTwcNotaryContractTextResponse>(await this.doRequest("1.0", "twc.notary.contract.text.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new GetTwcNotaryContractTextResponse({}));
  }

  /**
   * Description: 获取存证事务ID内部接口
   * Summary: 获取存证事务ID内部接口
   */
  async createTwcNotaryInternalTrans(request: CreateTwcNotaryInternalTransRequest): Promise<CreateTwcNotaryInternalTransResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryInternalTransEx(request, runtime);
  }

  /**
   * Description: 获取存证事务ID内部接口
   * Summary: 获取存证事务ID内部接口
   */
  async createTwcNotaryInternalTransEx(request: CreateTwcNotaryInternalTransRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryInternalTransResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryInternalTransResponse>(await this.doRequest("1.0", "twc.notary.internal.trans.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryInternalTransResponse({}));
  }

  /**
   * Description: 文本存证内部接口，将文本内容存证上链
   * Summary: 文本存证内部接口，将文本内容存证上链
   */
  async createTwcNotaryInternalText(request: CreateTwcNotaryInternalTextRequest): Promise<CreateTwcNotaryInternalTextResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryInternalTextEx(request, runtime);
  }

  /**
   * Description: 文本存证内部接口，将文本内容存证上链
   * Summary: 文本存证内部接口，将文本内容存证上链
   */
  async createTwcNotaryInternalTextEx(request: CreateTwcNotaryInternalTextRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryInternalTextResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryInternalTextResponse>(await this.doRequest("1.0", "twc.notary.internal.text.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryInternalTextResponse({}));
  }

  /**
   * Description: 发起文本存证，将文本内容存证上链，租赁业务专用。
   * Summary: 租赁业务文本存证，将文本内容存证上链
   */
  async createTwcNotaryLeaseText(request: CreateTwcNotaryLeaseTextRequest): Promise<CreateTwcNotaryLeaseTextResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryLeaseTextEx(request, runtime);
  }

  /**
   * Description: 发起文本存证，将文本内容存证上链，租赁业务专用。
   * Summary: 租赁业务文本存证，将文本内容存证上链
   */
  async createTwcNotaryLeaseTextEx(request: CreateTwcNotaryLeaseTextRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryLeaseTextResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryLeaseTextResponse>(await this.doRequest("1.0", "twc.notary.lease.text.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryLeaseTextResponse({}));
  }

  /**
   * Description: 发起文件存证，将文件内容存证上链，租赁业务专用。
   * Summary: 租赁业务文件内容存证上链
   */
  async createTwcNotaryLeaseFile(request: CreateTwcNotaryLeaseFileRequest): Promise<CreateTwcNotaryLeaseFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryLeaseFileEx(request, runtime);
  }

  /**
   * Description: 发起文件存证，将文件内容存证上链，租赁业务专用。
   * Summary: 租赁业务文件内容存证上链
   */
  async createTwcNotaryLeaseFileEx(request: CreateTwcNotaryLeaseFileRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryLeaseFileResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryLeaseFileResponse>(await this.doRequest("1.0", "twc.notary.lease.file.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryLeaseFileResponse({}));
  }

  /**
   * Description: 使用接口查询订单存证的信息，需要在完成订单回传后才可返回。获取到txhash后，用户可使用 获取文本存证、存证核验 等存证服务功能。
   * Summary: 租赁业务获取订单存证列表
   */
  async listTwcNotaryLeaseNotary(request: ListTwcNotaryLeaseNotaryRequest): Promise<ListTwcNotaryLeaseNotaryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.listTwcNotaryLeaseNotaryEx(request, runtime);
  }

  /**
   * Description: 使用接口查询订单存证的信息，需要在完成订单回传后才可返回。获取到txhash后，用户可使用 获取文本存证、存证核验 等存证服务功能。
   * Summary: 租赁业务获取订单存证列表
   */
  async listTwcNotaryLeaseNotaryEx(request: ListTwcNotaryLeaseNotaryRequest, runtime: $Util.RuntimeOptions): Promise<ListTwcNotaryLeaseNotaryResponse> {
    Util.validateModel(request);
    return $tea.cast<ListTwcNotaryLeaseNotaryResponse>(await this.doRequest("1.0", "twc.notary.lease.notary.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ListTwcNotaryLeaseNotaryResponse({}));
  }

  /**
   * Description: 查询融资租赁application
   * Summary: 查询融资租赁application
   */
  async queryTwcNotaryLeaseApplication(request: QueryTwcNotaryLeaseApplicationRequest): Promise<QueryTwcNotaryLeaseApplicationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryTwcNotaryLeaseApplicationEx(request, runtime);
  }

  /**
   * Description: 查询融资租赁application
   * Summary: 查询融资租赁application
   */
  async queryTwcNotaryLeaseApplicationEx(request: QueryTwcNotaryLeaseApplicationRequest, runtime: $Util.RuntimeOptions): Promise<QueryTwcNotaryLeaseApplicationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTwcNotaryLeaseApplicationResponse>(await this.doRequest("1.0", "twc.notary.lease.application.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryTwcNotaryLeaseApplicationResponse({}));
  }

  /**
   * Description: 查询融资租赁application的定义详情
   * Summary: 查询application的定义详情
   */
  async queryTwcNotaryLeaseApplicationdetailinfo(request: QueryTwcNotaryLeaseApplicationdetailinfoRequest): Promise<QueryTwcNotaryLeaseApplicationdetailinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryTwcNotaryLeaseApplicationdetailinfoEx(request, runtime);
  }

  /**
   * Description: 查询融资租赁application的定义详情
   * Summary: 查询application的定义详情
   */
  async queryTwcNotaryLeaseApplicationdetailinfoEx(request: QueryTwcNotaryLeaseApplicationdetailinfoRequest, runtime: $Util.RuntimeOptions): Promise<QueryTwcNotaryLeaseApplicationdetailinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTwcNotaryLeaseApplicationdetailinfoResponse>(await this.doRequest("1.0", "twc.notary.lease.applicationdetailinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryTwcNotaryLeaseApplicationdetailinfoResponse({}));
  }

  /**
   * Description: 融资租赁资方重置订单状态
   * Summary: 融资租赁资方重置订单状态
   */
  async setTwcNotaryLeaseRepaymentstatus(request: SetTwcNotaryLeaseRepaymentstatusRequest): Promise<SetTwcNotaryLeaseRepaymentstatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.setTwcNotaryLeaseRepaymentstatusEx(request, runtime);
  }

  /**
   * Description: 融资租赁资方重置订单状态
   * Summary: 融资租赁资方重置订单状态
   */
  async setTwcNotaryLeaseRepaymentstatusEx(request: SetTwcNotaryLeaseRepaymentstatusRequest, runtime: $Util.RuntimeOptions): Promise<SetTwcNotaryLeaseRepaymentstatusResponse> {
    Util.validateModel(request);
    return $tea.cast<SetTwcNotaryLeaseRepaymentstatusResponse>(await this.doRequest("1.0", "twc.notary.lease.repaymentstatus.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new SetTwcNotaryLeaseRepaymentstatusResponse({}));
  }

  /**
   * Description: 供应商上传采购等相关信息
   * Summary: 供应商上传采购等相关信息
   */
  async createTwcNotaryLeaseSupplierinfo(request: CreateTwcNotaryLeaseSupplierinfoRequest): Promise<CreateTwcNotaryLeaseSupplierinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createTwcNotaryLeaseSupplierinfoEx(request, runtime);
  }

  /**
   * Description: 供应商上传采购等相关信息
   * Summary: 供应商上传采购等相关信息
   */
  async createTwcNotaryLeaseSupplierinfoEx(request: CreateTwcNotaryLeaseSupplierinfoRequest, runtime: $Util.RuntimeOptions): Promise<CreateTwcNotaryLeaseSupplierinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTwcNotaryLeaseSupplierinfoResponse>(await this.doRequest("1.0", "twc.notary.lease.supplierinfo.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateTwcNotaryLeaseSupplierinfoResponse({}));
  }

}
