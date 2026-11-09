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

// 文件信息
export class FileInfo extends $tea.Model {
  // 文件名称
  /**
   * @example
   * asasd.jpg
   */
  fileName: string;
  // 文件key
  /**
   * @example
   * adadqweqw12sads1
   */
  fileKey: string;
  static names(): { [key: string]: string } {
    return {
      fileName: 'file_name',
      fileKey: 'file_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fileName: 'string',
      fileKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 单期明细
export class SingleTermDetail extends $tea.Model {
  // 期数
  /**
   * @example
   * 1
   */
  periodNum: number;
  // 支付金额
  /**
   * @example
   * 1
   */
  payAmount: number;
  static names(): { [key: string]: string } {
    return {
      periodNum: 'period_num',
      payAmount: 'pay_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      periodNum: 'number',
      payAmount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 站点信息
export class SiteInfo extends $tea.Model {
  // 小程序id
  /**
   * @example
   * 123456789
   */
  tinyAppId?: string;
  // 站点名称
  /**
   * @example
   * 站点名称
   */
  siteName?: string;
  // 
  // 截图照片
  /**
   * @example
   * c6c0c7a1-b9d5-4e5d-b9d4-9eed39f00e65.jpg
   */
  screenshotFile?: FileInfo;
  // 站点地址
  /**
   * @example
   * https://open.alipay.com
   */
  siteUrl?: string;
  // 站点类型
  // 网站: 01
  // APP: 02
  // 服务窗: 03
  // 公众号: 04
  // 其他: 05
  // 支付宝小程序: 06
  // 手机网站/H5: 07
  /**
   * @example
   * 02
   */
  siteType?: string;
  static names(): { [key: string]: string } {
    return {
      tinyAppId: 'tiny_app_id',
      siteName: 'site_name',
      screenshotFile: 'screenshot_file',
      siteUrl: 'site_url',
      siteType: 'site_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tinyAppId: 'string',
      siteName: 'string',
      screenshotFile: FileInfo,
      siteUrl: 'string',
      siteType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 公司信息
export class CompanyInfo extends $tea.Model {
  // 营业执照文件信息
  businessLicenseFile: FileInfo;
  // 证件是否长期有效  
  // true：长期，false：非长期
  // payChannel =JDPAY必填
  /**
   * @example
   * true, false
   */
  businessLicenseCertExpireFlag?: boolean;
  // 证件有效期开始日期(payChannel =JDPAY)
  // 1.certExpireFlag=false时必填，时间格式:yyyy-MM-dd
  // 2. 商户为企业个体户时，无论certExpireFlag是否长期，该字段均必填
  /**
   * @example
   * 2024-10-17
   */
  businessLicenseCertEffectDate?: string;
  // 证件有效期结束日期（payChannel =JDPAY选填参数）
  // certExpireFlag为false必填，时间格式：yyyy-MM-dd
  /**
   * @example
   * 2024-10-17
   */
  businessLicenseCertExpireDate?: string;
  // 业务类型 枚举
  /**
   * @example
   * 业务类型
   */
  productMainClass: string;
  // 公司名称
  /**
   * @example
   * xx公司
   */
  companyName: string;
  // 公司别名
  /**
   * @example
   * 公司别名
   */
  companyAliasName: string;
  // 公司数科租户id
  /**
   * @example
   * ASSDDDAS
   */
  tenantId?: string;
  // 统一社会信用代码
  /**
   * @example
   * 9121asd231231231231
   */
  merchantId: string;
  // 商户类型： 01：企业；07：个体工商户
  // 默认不填为01
  /**
   * @example
   * 01
   */
  merchantType?: string;
  // 公司联系电话
  /**
   * @example
   * 1231xx2322
   */
  companyMobile?: string;
  // 公司联系地址
  /**
   * @example
   * xx市xx区
   */
  companyAddress?: string;
  // 联系人姓名
  /**
   * @example
   * 李xx
   */
  contactName: string;
  // 联系人手机号码
  /**
   * @example
   * 132xx2312312
   */
  contactMobile: string;
  // 联系地址-省份code(payChannel =JDPAY必填)
  /**
   * @example
   * 430000
   */
  contactAddressProvinceCode?: string;
  // 联系地址-省份名称（payChannel =JDPAY必填）
  /**
   * @example
   * 浙江省
   */
  contactAddressProvinceName?: string;
  // 联系地址-市code（payChannel =JDPAY必填）
  // 
  /**
   * @example
   * 403100
   */
  contactAddressCityCode?: string;
  // 联系人地址-市名称（payChannel =JDPAY必填）
  /**
   * @example
   * 杭州市
   */
  contactAddressCityName?: string;
  // 联系人详细地址（payChannel =JDPAY必填）
  /**
   * @example
   * 杭州市余杭区xxx
   */
  contactAddressDetail?: string;
  // 联系人邮箱（pay_channel=JDPAY必填）
  /**
   * @example
   * 123123122134@163.com
   */
  contactEmail?: string;
  // 绑定企业支付宝账号（pay_channel=ALIPAY必填）
  /**
   * @example
   * 绑定企业支付宝账号
   */
  bindAlipayNo?: string;
  // 结算企业支付宝账号（pay_channel=ALIPAY必填）
  /**
   * @example
   * 结算企业支付宝账号
   */
  settleAlipayNo?: string;
  // 绑定支付宝uid（pay_channel=ALIPAY必填）
  /**
   * @example
   * 绑定支付宝uid
   */
  bindAlipayUid?: string;
  // 经营范围
  // payChannel =JDPAY必填
  /**
   * @example
   * 经营租赁等业务
   */
  businessScope?: string;
  // 开户许可证（payChannel =JDPAY必填）
  // 
  bankOpeningLicenseFile?: FileInfo;
  // 商户和租赁平台合作协议图片（pay_channel=JDPAY必填）
  // 
  cooperationAgreementFile?: FileInfo;
  static names(): { [key: string]: string } {
    return {
      businessLicenseFile: 'business_license_file',
      businessLicenseCertExpireFlag: 'business_license_cert_expire_flag',
      businessLicenseCertEffectDate: 'business_license_cert_effect_date',
      businessLicenseCertExpireDate: 'business_license_cert_expire_date',
      productMainClass: 'product_main_class',
      companyName: 'company_name',
      companyAliasName: 'company_alias_name',
      tenantId: 'tenant_id',
      merchantId: 'merchant_id',
      merchantType: 'merchant_type',
      companyMobile: 'company_mobile',
      companyAddress: 'company_address',
      contactName: 'contact_name',
      contactMobile: 'contact_mobile',
      contactAddressProvinceCode: 'contact_address_province_code',
      contactAddressProvinceName: 'contact_address_province_name',
      contactAddressCityCode: 'contact_address_city_code',
      contactAddressCityName: 'contact_address_city_name',
      contactAddressDetail: 'contact_address_detail',
      contactEmail: 'contact_email',
      bindAlipayNo: 'bind_alipay_no',
      settleAlipayNo: 'settle_alipay_no',
      bindAlipayUid: 'bind_alipay_uid',
      businessScope: 'business_scope',
      bankOpeningLicenseFile: 'bank_opening_license_file',
      cooperationAgreementFile: 'cooperation_agreement_file',
    };
  }

  static types(): { [key: string]: any } {
    return {
      businessLicenseFile: FileInfo,
      businessLicenseCertExpireFlag: 'boolean',
      businessLicenseCertEffectDate: 'string',
      businessLicenseCertExpireDate: 'string',
      productMainClass: 'string',
      companyName: 'string',
      companyAliasName: 'string',
      tenantId: 'string',
      merchantId: 'string',
      merchantType: 'string',
      companyMobile: 'string',
      companyAddress: 'string',
      contactName: 'string',
      contactMobile: 'string',
      contactAddressProvinceCode: 'string',
      contactAddressProvinceName: 'string',
      contactAddressCityCode: 'string',
      contactAddressCityName: 'string',
      contactAddressDetail: 'string',
      contactEmail: 'string',
      bindAlipayNo: 'string',
      settleAlipayNo: 'string',
      bindAlipayUid: 'string',
      businessScope: 'string',
      bankOpeningLicenseFile: FileInfo,
      cooperationAgreementFile: FileInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 经营分账收入模型
export class OperationDivideTransInModel extends $tea.Model {
  // 分账收入方支付宝用户id, 支付宝2088id
  /**
   * @example
   * 2088****1
   */
  transInUserId: string;
  // 分账金额，单位为分
  // 
  /**
   * @example
   * 100
   */
  divideAmount: number;
  // 分账描述
  /**
   * @example
   * 分账给经营商
   */
  desc?: string;
  static names(): { [key: string]: string } {
    return {
      transInUserId: 'trans_in_user_id',
      divideAmount: 'divide_amount',
      desc: 'desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      transInUserId: 'string',
      divideAmount: 'number',
      desc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 资产订单信息
export class AssetPackageOrderInfo extends $tea.Model {
  // 订单id
  /**
   * @example
   * 123
   */
  orderId: string;
  // 订单状态
  /**
   * @example
   * 123
   */
  status: string;
  // 出包原因
  /**
   * @example
   * 123
   */
  outReason?: string;
  // 订单用信额度
  /**
   * @example
   * 123
   */
  orderCreditLine?: number;
  // 商户应还款金额
  /**
   * @example
   * 123
   */
  orderMerchantRepaymentMoney?: number;
  // 订单分账起始账期
  /**
   * @example
   * 123
   */
  divideStartTermIndex?: number;
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      status: 'status',
      outReason: 'out_reason',
      orderCreditLine: 'order_credit_line',
      orderMerchantRepaymentMoney: 'order_merchant_repayment_money',
      divideStartTermIndex: 'divide_start_term_index',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      status: 'string',
      outReason: 'string',
      orderCreditLine: 'number',
      orderMerchantRepaymentMoney: 'number',
      divideStartTermIndex: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分账关系绑定收入方信息
export class DivideBindingTransInInfo extends $tea.Model {
  // 分账方支付宝pid
  /**
   * @example
   * 2088123456789
   */
  alipayPid: string;
  static names(): { [key: string]: string } {
    return {
      alipayPid: 'alipay_pid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      alipayPid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 京东进件商家结算信息
export class MerchantSettleInfo extends $tea.Model {
  // 结算银行卡账号
  /**
   * @example
   * 123123122134
   */
  bankNum: string;
  // 联行号 
  /**
   * @example
   * 123123122134
   */
  bankCnap: string;
  // 结算账户类型 
  // merchant_type=01企业时：ENTERPRISE
  // 03:民办非企业：ENTERPRISE
  // 07个体工商户时：PERSON或 ENTERPRISE
  /**
   * @example
   * ENTERPRISE
   */
  bankAccountType: string;
  // 支行名称
  /**
   * @example
   * 招商银行上海支行
   */
  bankBranchName?: string;
  // 银行名称
  /**
   * @example
   * 招商银行
   */
  bankName?: string;
  static names(): { [key: string]: string } {
    return {
      bankNum: 'bank_num',
      bankCnap: 'bank_cnap',
      bankAccountType: 'bank_account_type',
      bankBranchName: 'bank_branch_name',
      bankName: 'bank_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bankNum: 'string',
      bankCnap: 'string',
      bankAccountType: 'string',
      bankBranchName: 'string',
      bankName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签署链接结果
export class SignUrlResult extends $tea.Model {
  // 签署（长）链接
  /**
   * @example
   * https://xxxx.com
   */
  url?: string;
  // 签署短链接
  /**
   * @example
   * https://xxxx.com
   */
  shortUrl?: string;
  // 签署链接提示信息
  /**
   * @example
   * 签署链接创建成功
   */
  signMsg?: string;
  static names(): { [key: string]: string } {
    return {
      url: 'url',
      shortUrl: 'short_url',
      signMsg: 'sign_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      url: 'string',
      shortUrl: 'string',
      signMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 模板详情
export class TemplateInfo extends $tea.Model {
  // 模板id
  /**
   * @example
   * T20240712134030001693
   */
  templateId: string;
  // 模板版本，不传取最新模板
  /**
   * @example
   * 1
   */
  templateVersion?: number;
  // 模板参数，JSON格式，其中key对应模板中的名称，value对应其要渲染的值
  /**
   * @example
   * {"模板key":"模板value"}
   */
  templateArgs?: string;
  // 模板所属商户id
  /**
   * @example
   * 91310101MA1FPCXA3G
   */
  merchantId?: string;
  static names(): { [key: string]: string } {
    return {
      templateId: 'template_id',
      templateVersion: 'template_version',
      templateArgs: 'template_args',
      merchantId: 'merchant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      templateId: 'string',
      templateVersion: 'number',
      templateArgs: 'string',
      merchantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

//  公司信息修改
export class CompanyInfoUpdate extends $tea.Model {
  // 营业执照文件信息
  businessLicenseFile?: FileInfo;
  // 业务类型 枚举
  /**
   * @example
   * 业务类型
   */
  productMainClass?: string;
  // 公司名称
  /**
   * @example
   * xx公司
   */
  companyName?: string;
  // 公司别名
  /**
   * @example
   * 公司别名
   */
  companyAliasName?: string;
  // 公司数科租户id
  /**
   * @example
   * ASSDDDAS
   */
  tenantId?: string;
  // 公司联系电话
  /**
   * @example
   * 1231xx2322
   */
  companyMobile?: string;
  // 公司联系地址
  /**
   * @example
   * xx市xx区
   */
  companyAddress?: string;
  // 联系人姓名
  /**
   * @example
   * 李xx
   */
  contactName?: string;
  // 联系人手机号码
  /**
   * @example
   * 132xx2312312
   */
  contactMobile?: string;
  // 商户类型： 01：企业；07：个体工商户 默认不填为01
  /**
   * @example
   * 01
   */
  merchantType?: string;
  static names(): { [key: string]: string } {
    return {
      businessLicenseFile: 'business_license_file',
      productMainClass: 'product_main_class',
      companyName: 'company_name',
      companyAliasName: 'company_alias_name',
      tenantId: 'tenant_id',
      companyMobile: 'company_mobile',
      companyAddress: 'company_address',
      contactName: 'contact_name',
      contactMobile: 'contact_mobile',
      merchantType: 'merchant_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      businessLicenseFile: FileInfo,
      productMainClass: 'string',
      companyName: 'string',
      companyAliasName: 'string',
      tenantId: 'string',
      companyMobile: 'string',
      companyAddress: 'string',
      contactName: 'string',
      contactMobile: 'string',
      merchantType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签署人账户
export class SignAccount extends $tea.Model {
  // 公司统一社会信用代码（userType=ORGANIZATION必传）
  /**
   * @example
   * 91310101MA1FPCXA3G
   */
  companyId?: string;
  // 公司角色（userType=ORGANIZATION必传） MERCHANT=商户;FINANCIER=资方
  /**
   * @example
   * MERCHANT
   */
  companyRole?: string;
  // 用户姓名（userType=PERSON必传，需要RSA加密）
  /**
   * @example
   * RSA(用户姓名)
   */
  userName?: string;
  // 用户身份证号（userType=PERSON必传，需要RSA加密）
  /**
   * @example
   * RSA(用户身份证号)
   */
  userIdNumber?: string;
  // 签署人类型，PERSON=个人;ORGANIZATION=机构
  /**
   * @example
   * PERSON
   */
  userType: string;
  // 用户邮箱（userType=PERSON必传，需要RSA加密）
  /**
   * @example
   * RSA(用户邮箱)
   */
  userEmail?: string;
  // 用户手机号（userType=PERSON必传，需要RSA加密）
  /**
   * @example
   * RSA(用户手机号)
   */
  userMobile?: string;
  // 签署标签（对应模版配置中的tag）
  /**
   * @example
   * jiafang
   */
  tag: string;
  // 是否获取签署链接
  /**
   * @example
   * true, false
   */
  getSignUrl?: boolean;
  static names(): { [key: string]: string } {
    return {
      companyId: 'company_id',
      companyRole: 'company_role',
      userName: 'user_name',
      userIdNumber: 'user_id_number',
      userType: 'user_type',
      userEmail: 'user_email',
      userMobile: 'user_mobile',
      tag: 'tag',
      getSignUrl: 'get_sign_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      companyId: 'string',
      companyRole: 'string',
      userName: 'string',
      userIdNumber: 'string',
      userType: 'string',
      userEmail: 'string',
      userMobile: 'string',
      tag: 'string',
      getSignUrl: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用信订单信息
export class CreditUtilizationOrder extends $tea.Model {
  // 123
  /**
   * @example
   * 123
   */
  orderId: string;
  // 订单用信额度，单位为分
  /**
   * @example
   * 100
   */
  orderCreditLine: number;
  // 订单商户应还金额，单位为分
  /**
   * @example
   * 100
   */
  orderMerchantRepaymentMoney: number;
  // 分账起始日期
  /**
   * @example
   * 1
   */
  divideStartTermIndex: number;
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      orderCreditLine: 'order_credit_line',
      orderMerchantRepaymentMoney: 'order_merchant_repayment_money',
      divideStartTermIndex: 'divide_start_term_index',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      orderCreditLine: 'number',
      orderMerchantRepaymentMoney: 'number',
      divideStartTermIndex: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商户控股信息（京东商户进件）
export class MerchantHoldingInfo extends $tea.Model {
  // 控股类型名称
  // 企业股东:ENTERPRISE_SHAREHOLDER
  // 个人股东:PERSONAL_SHAREHOLDER
  /**
   * @example
   * ENTERPRISE_SHAREHOLDER
   */
  holdingTypeName: string;
  // 控股公司名称
  /**
   * @example
   * xxx公司
   */
  holdingCompany: string;
  // 证件号码
  /**
   * @example
   * 91301010101010101A
   */
  certificateNumber: string;
  // 证件是否长期有效
  // 长期true，
  // 否则false
  /**
   * @example
   * true, false
   */
  longDate: boolean;
  // 失效时间
  // 商户控股信息longdate为true 时，可为空 ，格式YYYY-MM-DD
  /**
   * @example
   * 2022-10-10
   */
  expireDate?: string;
  static names(): { [key: string]: string } {
    return {
      holdingTypeName: 'holding_type_name',
      holdingCompany: 'holding_company',
      certificateNumber: 'certificate_number',
      longDate: 'long_date',
      expireDate: 'expire_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      holdingTypeName: 'string',
      holdingCompany: 'string',
      certificateNumber: 'string',
      longDate: 'boolean',
      expireDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 主动支付单据
export class ActivePayOrder extends $tea.Model {
  // 支付宝支付订单号，用于拉起主动支付页面
  /**
   * @example
   * f28038577d664015bfc1034c4a125121
   */
  tradeNo: string;
  // 状态
  // INIT：交易创建
  // FAILED：付款失败
  // SUCCESS：付款成功
  /**
   * @example
   * INIT
   */
  tradeStatus: string;
  // 状态原因码
  /**
   * @example
   * TIMEOUT
   */
  statusReasonCode?: string;
  // 超时关闭
  /**
   * @example
   * 状态原因描述
   */
  statusReasonMsg?: string;
  // 本次交易支付的订单金额，单位为分
  // 付款成功或付款成功之后的状态必填
  /**
   * @example
   * 100
   */
  totalAmount?: number;
  // 用户在交易中支付的金额，单位为分
  // 付款成功的状态必填
  /**
   * @example
   * 100
   */
  paidAmount?: number;
  // 商家在交易中实际收到的款项，单位为分
  // 付款成功的状态必填
  /**
   * @example
   * 100
   */
  receiptAmount?: number;
  // 交易支付时间
  // 付款成功的状态必填
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  gmtPay?: string;
  // 支付单据创建时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  gmtCreate?: string;
  // 多期合并支付明细
  multiPayDetail?: SingleTermDetail[];
  static names(): { [key: string]: string } {
    return {
      tradeNo: 'trade_no',
      tradeStatus: 'trade_status',
      statusReasonCode: 'status_reason_code',
      statusReasonMsg: 'status_reason_msg',
      totalAmount: 'total_amount',
      paidAmount: 'paid_amount',
      receiptAmount: 'receipt_amount',
      gmtPay: 'gmt_pay',
      gmtCreate: 'gmt_create',
      multiPayDetail: 'multi_pay_detail',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tradeNo: 'string',
      tradeStatus: 'string',
      statusReasonCode: 'string',
      statusReasonMsg: 'string',
      totalAmount: 'number',
      paidAmount: 'number',
      receiptAmount: 'number',
      gmtPay: 'string',
      gmtCreate: 'string',
      multiPayDetail: { 'type': 'array', 'itemType': SingleTermDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用信息
export class ApplicationInfo extends $tea.Model {
  // 应用场景（payChannel =JDPAY仅支持MINI_APP）
  // MINI_APP 小程序
  // APP 自有app
  // ALL 两种都有
  /**
   * @example
   * ALL
   */
  applicationScene?: string;
  // 小程序id
  /**
   * @example
   * 小程序id
   */
  tinyAppId?: string;
  // 小程序名称
  /**
   * @example
   * xx小程序
   */
  siteName?: string;
  // 网站地址（pay_channel=ALIPAY必填）
  /**
   * @example
   * http://asdasas.com
   */
  sitUrl?: string;
  // 商户名称。（pay_channel=ALIPAY必填）
  // 修改后的商户名称，将同步支付宝代扣签约页面字段展示
  // 
  /**
   * @example
   * xx商户
   */
  merchantName?: string;
  // 商户服务名称。（pay_channel=ALIPAY必填）
  // 修改后的商户服务名称，将同步支付宝代扣签约页面字段展示
  /**
   * @example
   * xx商户服务
   */
  merchantServiceName?: string;
  // 商户服务描述。（pay_channel=ALIPAY必填）
  // 修改后的商户服务描述，将同步支付宝代扣签约页面字段展示
  /**
   * @example
   * xx服务描述
   */
  merchantServiceDesc?: string;
  // 站点信息
  siteInfo?: SiteInfo[];
  static names(): { [key: string]: string } {
    return {
      applicationScene: 'application_scene',
      tinyAppId: 'tiny_app_id',
      siteName: 'site_name',
      sitUrl: 'sit_url',
      merchantName: 'merchant_name',
      merchantServiceName: 'merchant_service_name',
      merchantServiceDesc: 'merchant_service_desc',
      siteInfo: 'site_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      applicationScene: 'string',
      tinyAppId: 'string',
      siteName: 'string',
      sitUrl: 'string',
      merchantName: 'string',
      merchantServiceName: 'string',
      merchantServiceDesc: 'string',
      siteInfo: { 'type': 'array', 'itemType': SiteInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分页查询对象
export class PageQuery extends $tea.Model {
  // 页大小
  /**
   * @example
   * 10
   */
  pageSize: number;
  // 当前页
  /**
   * @example
   * 2
   */
  pageIndex: number;
  static names(): { [key: string]: string } {
    return {
      pageSize: 'page_size',
      pageIndex: 'page_index',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageSize: 'number',
      pageIndex: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用信息修改
export class ApplicationInfoUpdate extends $tea.Model {
  // 应用场景 MINI_APP 小程序 APP 自有app ALL 两种都有
  /**
   * @example
   * ALL
   */
  applicationScene?: string;
  // 小程序id
  /**
   * @example
   * 小程序id
   */
  tinyAppId?: string;
  // 小程序名称
  /**
   * @example
   * xx小程序
   */
  siteName?: string;
  // http://asdasas.com
  /**
   * @example
   * http://asdasas.com
   */
  sitUrl?: string;
  // 商户名称。 修改后的商户名称，将同步支付宝代扣签约页面字段展示
  /**
   * @example
   * xx商户
   */
  merchantName?: string;
  // 商户服务名称。 修改后的商户服务名称，将同步支付宝代扣签约页面字段展示
  /**
   * @example
   * xx商户服务
   */
  merchantServiceName?: string;
  // 商户服务描述。 修改后的商户服务描述，将同步支付宝代扣签约页面字段展示
  /**
   * @example
   * xx服务描述
   */
  merchantServiceDesc?: string;
  // 站点信息
  siteInfo?: SiteInfo[];
  static names(): { [key: string]: string } {
    return {
      applicationScene: 'application_scene',
      tinyAppId: 'tiny_app_id',
      siteName: 'site_name',
      sitUrl: 'sit_url',
      merchantName: 'merchant_name',
      merchantServiceName: 'merchant_service_name',
      merchantServiceDesc: 'merchant_service_desc',
      siteInfo: 'site_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      applicationScene: 'string',
      tinyAppId: 'string',
      siteName: 'string',
      sitUrl: 'string',
      merchantName: 'string',
      merchantServiceName: 'string',
      merchantServiceDesc: 'string',
      siteInfo: { 'type': 'array', 'itemType': SiteInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 法人信息
export class LegalInfo extends $tea.Model {
  // 法人名称
  /**
   * @example
   * 法人名称
   */
  legalName: string;
  // 法人证件号
  /**
   * @example
   * 法人证件号
   */
  legalCertNo: string;
  // 法人证件正面（人像面）
  legalCertFrontFile: FileInfo;
  // 法人证件反面
  legalCertBackFile: FileInfo;
  // 法人证件是否长期有效（payChannel =JDPAY必填）
  // true：长期，false：非长期
  // 
  /**
   * @example
   * true, false
   */
  legalCertExpireFlag?: boolean;
  // 法人手机号（payChannel =JDPAY必填）
  /**
   * @example
   * 15679375832
   */
  legalMobile?: string;
  // 证件有效期开始日期（payChannel =JDPAY必填）
  // legalCertExpireFlag=false/true时都必填，时间格式:yyyy-MM-dd
  /**
   * @example
   * 2025-10-31
   */
  legalEffectDate?: string;
  // 证件有效期结束（payChannel =JDPAY选填）
  // legalCertExpireFlag=false时必填，时间格式:yyyy-MM-dd
  /**
   * @example
   * 2025-10-31
   */
  legalExpireDate?: string;
  static names(): { [key: string]: string } {
    return {
      legalName: 'legal_name',
      legalCertNo: 'legal_cert_no',
      legalCertFrontFile: 'legal_cert_front_file',
      legalCertBackFile: 'legal_cert_back_file',
      legalCertExpireFlag: 'legal_cert_expire_flag',
      legalMobile: 'legal_mobile',
      legalEffectDate: 'legal_effect_date',
      legalExpireDate: 'legal_expire_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      legalName: 'string',
      legalCertNo: 'string',
      legalCertFrontFile: FileInfo,
      legalCertBackFile: FileInfo,
      legalCertExpireFlag: 'boolean',
      legalMobile: 'string',
      legalEffectDate: 'string',
      legalExpireDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 单期取消模型
export class SingleCancelModel extends $tea.Model {
  // 第几期
  /**
   * @example
   * 1
   */
  periodNum: number;
  // 其他方式还款的时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  gmtPay: string;
  // 取消订单某一期代扣计划中以其他方式还款金额，单位为分
  /**
   * @example
   * 100
   */
  payOffAmount: number;
  // 变更其他方式还款WECHAT:微信; BANK:银行
  // ALIPAY:支付宝
  // CASH:现金
  /**
   * @example
   * WECHAT
   */
  payOffType?: string;
  // 通过其他方式还款单号;例如银行流水号或微信流水号
  /**
   * @example
   * 1234
   */
  payOffNo?: string;
  // 其他方式还款银行名称，还款方式为银行时必填
  /**
   * @example
   * 中国银行
   */
  payOffBankName?: string;
  static names(): { [key: string]: string } {
    return {
      periodNum: 'period_num',
      gmtPay: 'gmt_pay',
      payOffAmount: 'pay_off_amount',
      payOffType: 'pay_off_type',
      payOffNo: 'pay_off_no',
      payOffBankName: 'pay_off_bank_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      periodNum: 'number',
      gmtPay: 'string',
      payOffAmount: 'number',
      payOffType: 'string',
      payOffNo: 'string',
      payOffBankName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合同签署模板和渲染参数
export class TemplateArgs extends $tea.Model {
  // 模板id
  /**
   * @example
   * T1762152216
   */
  templateId: string;
  // 模板版本
  /**
   * @example
   * 1
   */
  templateVersion?: string;
  // 模板参数，JSON格式，其中key对应模板中的名称，value对应其要渲染的值
  /**
   * @example
   * {"模板key":"模板value"}
   */
  templateArgs?: string;
  static names(): { [key: string]: string } {
    return {
      templateId: 'template_id',
      templateVersion: 'template_version',
      templateArgs: 'template_args',
    };
  }

  static types(): { [key: string]: any } {
    return {
      templateId: 'string',
      templateVersion: 'string',
      templateArgs: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 法人信息修改
export class LegalInfoUpdate extends $tea.Model {
  // 法人名称
  /**
   * @example
   * 法人名称
   */
  legalName?: string;
  // 法人证件号
  /**
   * @example
   * 法人证件号
   */
  legalCertNo?: string;
  // 法人证件正面
  legalCertFrontFile?: FileInfo;
  // 法人证件反面
  legalCertBackFile?: FileInfo;
  static names(): { [key: string]: string } {
    return {
      legalName: 'legal_name',
      legalCertNo: 'legal_cert_no',
      legalCertFrontFile: 'legal_cert_front_file',
      legalCertBackFile: 'legal_cert_back_file',
    };
  }

  static types(): { [key: string]: any } {
    return {
      legalName: 'string',
      legalCertNo: 'string',
      legalCertFrontFile: FileInfo,
      legalCertBackFile: FileInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 键值对
export class NameValuePair extends $tea.Model {
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

export class SyncAntchainAtoTradeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务字段，具体传入信息需参考文档
  // 传入格式需为json字符串
  bizContent: string;
  // 接口执行类型
  // 
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

export class SyncAntchainAtoTradeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // resp信息
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

export class GetAntchainAtoTradeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询信息，必须遵循json字符串格式
  bizContent: string;
  // 接口类型
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

export class GetAntchainAtoTradeResponse extends $tea.Model {
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

export class CreateAntchainAtoRealpersonFacevrfRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实人认证方案枚举
  // APP（客户端android/ios方案）
  // H5（网页）
  // ZFB（支付宝客户端H5方案）
  solutionType: string;
  // 真实姓名
  certName: string;
  // 证件号码
  certNo: string;
  // 身份信息来源类型
  // IDENTITY_CARD（身份证）
  certType: string;
  // 【solution_type=ZFB使用】
  // reserve（保存活体人脸 默认值）
  // never（不保存活体人脸）
  faceReserveStrategy?: string;
  // 【solution_type=ZFB使用】
  // 认证成功后需要跳转的地址
  returnUrl?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      solutionType: 'solution_type',
      certName: 'cert_name',
      certNo: 'cert_no',
      certType: 'cert_type',
      faceReserveStrategy: 'face_reserve_strategy',
      returnUrl: 'return_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      solutionType: 'string',
      certName: 'string',
      certNo: 'string',
      certType: 'string',
      faceReserveStrategy: 'string',
      returnUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntchainAtoRealpersonFacevrfResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求唯一ID标识，为空则是异常
  realPersonVerificationCode?: string;
  // 【solution_type=H5 | ZFB返回】
  // 人脸核身url地址
  webUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      realPersonVerificationCode: 'real_person_verification_code',
      webUrl: 'web_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      realPersonVerificationCode: 'string',
      webUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoRealpersonFacevrfRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 可信实人认证的唯一标识
  realPersonVerificationCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      realPersonVerificationCode: 'real_person_verification_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      realPersonVerificationCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoRealpersonFacevrfResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 实人认证结果
  // PROCESSING（初始化）
  // SUCCESS（认证通过）FAIL（认证不通过）
  certifyState?: string;
  // 【solution_type=H5 | APP 返回】
  // 本次认证是否存在安全风险
  // true(检测到安全风险)
  // false(未检测到安全风险)
  attackFlag?: string;
  // 【solution_type=H5 | APP 返回】
  // base64过后的二值化图片
  alivePhoto?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyState: 'certify_state',
      attackFlag: 'attack_flag',
      alivePhoto: 'alive_photo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyState: 'string',
      attackFlag: 'string',
      alivePhoto: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllAntchainAtoSignTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合同类型，如果不传则返回所有
  contractType?: string;
  // 商户统一社会信用代码，SIT环境，非融必填
  merchantId?: string;
  // 查询融资类型时，需要传入资方统一社会信用代码
  fundId?: string;
  // -FINANCE 融资
  // -NON_FINANCE 非融资
  fundType?: string;
  // 模板id
  templateId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      contractType: 'contract_type',
      merchantId: 'merchant_id',
      fundId: 'fund_id',
      fundType: 'fund_type',
      templateId: 'template_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      contractType: 'string',
      merchantId: 'string',
      fundId: 'string',
      fundType: 'string',
      templateId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllAntchainAtoSignTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // List<JSONObject>格式内容
  templateList?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      templateList: 'template_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      templateList: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitAntchainAtoSignFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderId: string;
  // CRED_PSN_CH_IDCARD大陆身份证
  userIdType?: string;
  // 用户证件号，需要采用RSA加密传输
  userIdNumber?: string;
  // 姓名，需要采用RSA加密传输
  userName?: string;
  // 用户手机号，可不传；传的话需要采用RSA加密传输
  userMobile?: string;
  // 用户的电子邮箱，可不传；传的话需要采用RSA加密传输
  userEmail?: string;
  // 签署有效期，时间戳，例如：new Date().getTime()
  signValidity?: string;
  // 1-短信；2-邮件
  flowNotifyType?: string;
  // 业务场景，电子合同签署协议的时候的标题
  businessScene: string;
  // 签署完成跳转链接
  signedRedirectUrl?: string;
  // 签署的电子合同模板信息，JSONArray格式，可以传入多个templateId和templateArgs。注意templateArgs的格式为key-value，其中key为模板文件中表单域的名称，value为需要填充的值。
  templateList: string;
  // 用户的支付宝uid
  alipayUserId?: string;
  // 公司名称
  merchantName: string;
  // 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
  merchantTag?: string;
  // 商户需要盖的印章ID
  merchantSealId?: string;
  // 电子合同签署顺序，如果只有1方企业签署，传入1即可。如果是多方，并且需要设置签署顺序，则需要将这个值以及thirdSigner中的signOrder做一个签署顺序。
  merchantSignOrder?: number;
  // CRED_ORG_USCC：统一社会信用代码，CRED_ORG_REGCODE：工商注册号，只支持这两个值
  merchantIdType: string;
  // 商户证件号，需要采用RSA加密传输
  merchantIdNumber: string;
  // 法人姓名，需要RSA加密传输
  merchantLegalName?: string;
  // 法人证件号，需要采用RSA加密传输
  merchantLegalIdNumber?: string;
  // 除商户以外的第三方签署信息，需要通过此字段传入，需要使用JSONArray格式。注意其中orgIdNumber、orgLegalName、orgLegalIdNumber需要RSA加密。
  thirdSigner?: string;
  // 支付宝用户 open_id
  userOpenId?: string;
  // 商户支付宝应用 id
  merchantAppId?: string;
  // 用户类型，个人或企业，默认是个人
  userType?: string;
  // (企业作为消费者时)公司名称
  userOrgName?: string;
  // (企业作为消费者时)公司证件类型
  userOrgIdType?: string;
  // (企业作为消费者时)公司证件号，无需加密
  userOrgIdNumber?: string;
  // 合并签署是否开启人脸识别（默认true-开启）,非合并签署无需设值
  needFace?: boolean;
  // 0-手绘签名 
  // 1-模板印章签名
  // 多种类型时逗号分割，为空不限制
  sealType?: string;
  // 代扣签约场景，JDbindCardH5：京东一键绑卡_H5；JDAPPSignH5：京东APP签约_H5
  withholdSignScene?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      userIdType: 'user_id_type',
      userIdNumber: 'user_id_number',
      userName: 'user_name',
      userMobile: 'user_mobile',
      userEmail: 'user_email',
      signValidity: 'sign_validity',
      flowNotifyType: 'flow_notify_type',
      businessScene: 'business_scene',
      signedRedirectUrl: 'signed_redirect_url',
      templateList: 'template_list',
      alipayUserId: 'alipay_user_id',
      merchantName: 'merchant_name',
      merchantTag: 'merchant_tag',
      merchantSealId: 'merchant_seal_id',
      merchantSignOrder: 'merchant_sign_order',
      merchantIdType: 'merchant_id_type',
      merchantIdNumber: 'merchant_id_number',
      merchantLegalName: 'merchant_legal_name',
      merchantLegalIdNumber: 'merchant_legal_id_number',
      thirdSigner: 'third_signer',
      userOpenId: 'user_open_id',
      merchantAppId: 'merchant_app_id',
      userType: 'user_type',
      userOrgName: 'user_org_name',
      userOrgIdType: 'user_org_id_type',
      userOrgIdNumber: 'user_org_id_number',
      needFace: 'need_face',
      sealType: 'seal_type',
      withholdSignScene: 'withhold_sign_scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      userIdType: 'string',
      userIdNumber: 'string',
      userName: 'string',
      userMobile: 'string',
      userEmail: 'string',
      signValidity: 'string',
      flowNotifyType: 'string',
      businessScene: 'string',
      signedRedirectUrl: 'string',
      templateList: 'string',
      alipayUserId: 'string',
      merchantName: 'string',
      merchantTag: 'string',
      merchantSealId: 'string',
      merchantSignOrder: 'number',
      merchantIdType: 'string',
      merchantIdNumber: 'string',
      merchantLegalName: 'string',
      merchantLegalIdNumber: 'string',
      thirdSigner: 'string',
      userOpenId: 'string',
      merchantAppId: 'string',
      userType: 'string',
      userOrgName: 'string',
      userOrgIdType: 'string',
      userOrgIdNumber: 'string',
      needFace: 'boolean',
      sealType: 'string',
      withholdSignScene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitAntchainAtoSignFlowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签署合同单号
  signNo?: string;
  // 电子签署流程ID
  flowId?: string;
  // 签署用户ID
  accountId?: string;
  // 签署信息，包括短链接、长链接、小程序链接等。
  signInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      signNo: 'sign_no',
      flowId: 'flow_id',
      accountId: 'account_id',
      signInfo: 'sign_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      signNo: 'string',
      flowId: 'string',
      accountId: 'string',
      signInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntchainAtoSignFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 签署合同单号
  signNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      signNo: 'sign_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      signNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntchainAtoSignFlowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签署合同单号
  signNo?: string;
  // 订单号
  orderId?: string;
  // 签署用户ID
  accountId?: string;
  // 状态：DRAFT - 草稿； SIGNING - 签署中； FINISH - 签署完成；UNDO - 撤销； TERMINATE - 终止； EXPIRE - 过期； REJECTED - 拒签； CANCELLED - 解约
  // 
  status?: string;
  // 签署流程ID
  flowId?: string;
  // 签署文件列表，参考：
  // _[{"fileItemNo":"10090801000001699892007791144960","agreementType":"COMMON","fileName":"xxx合同","fileSize":228530,"signAccountId":"fe2eb3814c4e49edba2bc012f790771f","fileId":"2c7684461a0f4d33bc02f6d77f7b3937","downloadUrl":"https://dev.oss-cn-shanghai.aliyuncs.com/ag/ord/xxx/16939683744483057_%E6%B5%8B%E8%AF%95%E6%A8%A1%E6%9D%BF%E4%B9%8B%E5%8D%8F%E8%AE%AE%E7%AD%BE%E7%BD%B2%E8%AF%81%E6%98%8E.pdf?Expires=1693971989&OSSAccessKeyId=LTAI5tR3hHiaXPAh8YsY9Dce&Signature=i%2FfAgDem33guI%2F0KjIFj24XZNCc%3D"}]_
  docList?: string;
  // 业务场景，主要用于签署合同的标题描述
  businessScene?: string;
  // 签署合同中的订单的uid。
  alipayUserId?: string;
  // 签署扩展信息，用于获取签署链接等。JSON格式字符串。
  signInfo?: string;
  // 发起人账户id
  initiatorAccountId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      signNo: 'sign_no',
      orderId: 'order_id',
      accountId: 'account_id',
      status: 'status',
      flowId: 'flow_id',
      docList: 'doc_list',
      businessScene: 'business_scene',
      alipayUserId: 'alipay_user_id',
      signInfo: 'sign_info',
      initiatorAccountId: 'initiator_account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      signNo: 'string',
      orderId: 'string',
      accountId: 'string',
      status: 'string',
      flowId: 'string',
      docList: 'string',
      businessScene: 'string',
      alipayUserId: 'string',
      signInfo: 'string',
      initiatorAccountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntchainAtoWithholdSignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 长度不可超过50
  orderId: string;
  // 支付宝商户id，使用签约能力前时候进行向平台申请
  alipayMerchantId?: string;
  // 支付宝商户名称，会展示在支付并签约界面
  alipayMerchantName?: string;
  // 支付宝商户服务名称，会展示在支付并签约界面
  alipayMerchantServiceName?: string;
  // 支付宝商户服务描述，会展示在支付并签约界面
  alipayMerchantServiceDescription?: string;
  // 支付宝uid，非必填。paychannel=JDPAY此字段无需传入，paychannel=ALIPAY，当订单创建及合同创建未传入时，此字段必填。否则要求此字段与订单创建或合同创建传入的uid一致。
  alipayUserId?: string;
  // paychannel=JDPAY时必传，商户跳转的数科h5签约业务地址。paychannel=ALIPAY，签约完成后的跳转地址，注意只有在h5跳转场景下才有意义其他场景通过方法回调处理业务；无需使用此字段。
  returnUrl?: string;
  // 支付宝用户 open_id，非必填。paychannel=JDPAY此字段无需传入，paychannel=ALIPAY，当订单创建及合同创建未传入 alipay_user_id 以及 user_open_id 时，代扣阶段必须选择传入有效的alipay_user_id 或者 user_open_id(二选一)。
  userOpenId?: string;
  // 商户支付宝应用 id。paychannel=JDPAY此字段无需传入，paychannel=ALIPAY，如果传入了 user_open_id，则此字段必传。
  merchantAppId?: string;
  // 代扣签约场景, 当payChannel=JDPAY时，该字段必填
  // JDbindCardH5：京东一键绑卡_H5
  // JDAPPSignH5：京东APP签约_H5
  // 
  withholdSignScene?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      alipayMerchantId: 'alipay_merchant_id',
      alipayMerchantName: 'alipay_merchant_name',
      alipayMerchantServiceName: 'alipay_merchant_service_name',
      alipayMerchantServiceDescription: 'alipay_merchant_service_description',
      alipayUserId: 'alipay_user_id',
      returnUrl: 'return_url',
      userOpenId: 'user_open_id',
      merchantAppId: 'merchant_app_id',
      withholdSignScene: 'withhold_sign_scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      alipayMerchantId: 'string',
      alipayMerchantName: 'string',
      alipayMerchantServiceName: 'string',
      alipayMerchantServiceDescription: 'string',
      alipayUserId: 'string',
      returnUrl: 'string',
      userOpenId: 'string',
      merchantAppId: 'string',
      withholdSignScene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntchainAtoWithholdSignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签约字符串，当sign_str_type的值是H5_SIGN时，sign_str是h5签约地址，可以直接打开页面签约
  signStr?: string;
  // 签约字符串类型。SIGN_ONLY:仅签约;PAY_SIGN:支付并签约;H5_SIGN h5签约
  signStrType?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      signStr: 'sign_str',
      signStrType: 'sign_str_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      signStr: 'string',
      signStrType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoWithholdSignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 长度不可超过50
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

export class QueryAntchainAtoWithholdSignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 协议当前状态
  // 1. UNSIGNED：未签约
  // 2. SIGNED：已签约；
  // 3. TERMINATED：已解约
  status?: string;
  // 协议签署时间
  signTime?: string;
  // 协议生效时间
  validTime?: string;
  // 协议失效时间
  invalidTime?: string;
  // 代扣协议号
  agreementNo?: string;
  // 代扣签约场景
  // JDbindCardH5：京东一键绑卡_H5
  // JDAPPSignH5：京东APP签约_H5
  withholdSignScene?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      signTime: 'sign_time',
      validTime: 'valid_time',
      invalidTime: 'invalid_time',
      agreementNo: 'agreement_no',
      withholdSignScene: 'withhold_sign_scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      signTime: 'string',
      validTime: 'string',
      invalidTime: 'string',
      agreementNo: 'string',
      withholdSignScene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthAntchainAtoSignFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 签署的电子合同ID
  signNo: string;
  // 签署区域的tag，和发起签署流程的机构的tag对应。
  tag?: string;
  // 电子合同签署服务返回的biz_flow_id
  bizFlowId?: string;
  // 电子合同签署服务的返回的account_id
  accountId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      signNo: 'sign_no',
      tag: 'tag',
      bizFlowId: 'biz_flow_id',
      accountId: 'account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      signNo: 'string',
      tag: 'string',
      bizFlowId: 'string',
      accountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthAntchainAtoSignFlowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签署最后落签的签署区域id列表
  signFieldIds?: string;
  // 手动签署链接，区块链合同签署方式，企业未进行静默授权，会返回一个手动签署链接
  // 如果已授权或者不是区块链签署方式，该字段为空
  orgSignUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      signFieldIds: 'sign_field_ids',
      orgSignUrl: 'org_sign_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      signFieldIds: 'string',
      orgSignUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnbindAntchainAtoWithholdSignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 长度不可超过50
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

export class UnbindAntchainAtoWithholdSignResponse extends $tea.Model {
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

export class CancelAntchainAtoWithholdPlanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当发现跨天继续提交
  orderId: string;
  // 取消原因
  // RENTING_OUT:退租
  // RENTING_AND_RESALE:租转售
  // 
  // 
  cancelReason: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      cancelReason: 'cancel_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      cancelReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelAntchainAtoWithholdPlanResponse extends $tea.Model {
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

export class RepayAntchainAtoWithholdPlanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 长度不可超过50
  orderId: string;
  // 第几期，单期取消必填
  periodNum?: number;
  // 取其他方式还款的时间，单期取消必填
  gmtPay?: string;
  // 取消订单某一期代扣计划中以其他方式还款金额，单位为分
  payOffAmount?: number;
  // 变更其他方式还款
  // WECHAT:微信;
  // BANK:银行
  // ALIPAY:支付宝
  payOffType?: string;
  // 通过其他方式还款单号;例如银行流水号或微信流水号
  payOffNo?: string;
  // 其他方式还款银行名称，还款方式为银行时必填
  payOffBankName?: string;
  // 操作，默认为单期取消；
  // 多期取消：MULTI_CANCEL
  // 单期取消：SINGLE_CANCEL
  operation?: string;
  // 取消列表，多期取消必填
  cancelList?: SingleCancelModel[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      periodNum: 'period_num',
      gmtPay: 'gmt_pay',
      payOffAmount: 'pay_off_amount',
      payOffType: 'pay_off_type',
      payOffNo: 'pay_off_no',
      payOffBankName: 'pay_off_bank_name',
      operation: 'operation',
      cancelList: 'cancel_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      periodNum: 'number',
      gmtPay: 'string',
      payOffAmount: 'number',
      payOffType: 'string',
      payOffNo: 'string',
      payOffBankName: 'string',
      operation: 'string',
      cancelList: { 'type': 'array', 'itemType': SingleCancelModel },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RepayAntchainAtoWithholdPlanResponse extends $tea.Model {
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

export class SubmitAntchainAtoFrontSignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户的订单号
  orderId: string;
  // CRED_PSN_CH_IDCARD： 大陆身份证 
  // CRED_PSN_CH_TWCARD：台湾来往大陆通行证 
  // CRED_PSN_CH_MACAO"：澳门来往大陆通行证 
  // CRED_PSN_CH_HONGKONG：香港来往大陆通行证 
  // CRED_PSN_PASSPORT：护照
  userIdType: string;
  // 用户证件号，需要采用RSA加密传输
  userIdNumber: string;
  // 姓名，需要采用RSA加密传输
  // 
  userName: string;
  // 用户手机号，可不传；传的话需要采用RSA加密传输
  // 
  userMobile?: string;
  // 用户的电子邮箱，可不传；传的话需要采用RSA加密传输
  // 
  userEmail?: string;
  // 签署有效期，时间戳，例如：new Date().getTime()
  signValidity?: string;
  // 1-短信；2-邮件
  flowNotifyType?: string;
  // 业务场景，电子合同签署协议的时候的标题
  // 
  businessScene: string;
  // 签署完成跳转链接
  // 
  signedRedirectUrl?: string;
  // 签署的电子合同模板信息，JSONArray格式，可以传入多个templateId和templateArgs。注意templateArgs的格式为key-value，其中key为模板文件中表单域的名称，value为需要填充的值。
  templateList: string;
  // 用户的支付宝uid
  alipayUserId?: string;
  // 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
  merchantName: string;
  // 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
  merchantTag?: string;
  // 电子合同签署顺序，如果只有1方企业签署，传入1即可。如果是多方，并且需要设置签署顺序，则需要将这个值以及thirdSigner中的signOrder做一个签署顺序。
  merchantSignOrder?: number;
  // 商户需要盖的印章ID
  merchantSealId?: string;
  // CRED_ORG_USCC：统一社会信用代码，
  // CRED_ORG_REGCODE：工商注册号，
  // 只支持这两个值
  merchantIdType?: string;
  // 商户证件号，需要采用RSA加密传输
  merchantIdNumber?: string;
  // 法人姓名，需要RSA加密传输
  // 
  merchantLegalName?: string;
  // 法人证件号，需要采用RSA加密传输
  // 
  merchantLegalIdNumber?: string;
  // 除商户以外的第三方签署信息，需要通过此字段传入，需要使用JSONArray格式。注意其中orgIdNumber、orgLegalName、orgLegalIdNumber需要RSA加密。
  thirdSigner?: string;
  // 用户在支付宝开放平台下应用的 open_id
  userOpenId?: string;
  // 商户支付宝应用 id
  merchantAppId?: string;
  // 用户类型，个人或企业，默认是个人
  userType?: string;
  // (企业作为消费者时)公司证件号，无需加密
  userOrgIdNumber?: string;
  // (企业作为消费者时)公司证件类型
  userOrgIdType?: string;
  // (企业作为消费者时)公司名称
  userOrgName?: string;
  // 合并签署是否开启人脸识别（默认true-开启）,非合并签署无需设值
  needFace?: boolean;
  // 0-手绘签名 
  // 1-模板印章签名
  // 多种类型时逗号分割，为空不限制
  sealType?: string;
  // 代扣签约场景，JDbindCardH5：京东一键绑卡_H5；JDAPPSignH5：京东APP签约_H5
  withholdSignScene?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      userIdType: 'user_id_type',
      userIdNumber: 'user_id_number',
      userName: 'user_name',
      userMobile: 'user_mobile',
      userEmail: 'user_email',
      signValidity: 'sign_validity',
      flowNotifyType: 'flow_notify_type',
      businessScene: 'business_scene',
      signedRedirectUrl: 'signed_redirect_url',
      templateList: 'template_list',
      alipayUserId: 'alipay_user_id',
      merchantName: 'merchant_name',
      merchantTag: 'merchant_tag',
      merchantSignOrder: 'merchant_sign_order',
      merchantSealId: 'merchant_seal_id',
      merchantIdType: 'merchant_id_type',
      merchantIdNumber: 'merchant_id_number',
      merchantLegalName: 'merchant_legal_name',
      merchantLegalIdNumber: 'merchant_legal_id_number',
      thirdSigner: 'third_signer',
      userOpenId: 'user_open_id',
      merchantAppId: 'merchant_app_id',
      userType: 'user_type',
      userOrgIdNumber: 'user_org_id_number',
      userOrgIdType: 'user_org_id_type',
      userOrgName: 'user_org_name',
      needFace: 'need_face',
      sealType: 'seal_type',
      withholdSignScene: 'withhold_sign_scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      userIdType: 'string',
      userIdNumber: 'string',
      userName: 'string',
      userMobile: 'string',
      userEmail: 'string',
      signValidity: 'string',
      flowNotifyType: 'string',
      businessScene: 'string',
      signedRedirectUrl: 'string',
      templateList: 'string',
      alipayUserId: 'string',
      merchantName: 'string',
      merchantTag: 'string',
      merchantSignOrder: 'number',
      merchantSealId: 'string',
      merchantIdType: 'string',
      merchantIdNumber: 'string',
      merchantLegalName: 'string',
      merchantLegalIdNumber: 'string',
      thirdSigner: 'string',
      userOpenId: 'string',
      merchantAppId: 'string',
      userType: 'string',
      userOrgIdNumber: 'string',
      userOrgIdType: 'string',
      userOrgName: 'string',
      needFace: 'boolean',
      sealType: 'string',
      withholdSignScene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitAntchainAtoFrontSignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签署合同单号
  // 
  signNo?: string;
  // 电子签署流程ID
  // 
  flowId?: string;
  // 签署用户ID
  // 
  accountId?: string;
  // 签署信息，包括短链接、长链接、小程序链接等。
  signInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      signNo: 'sign_no',
      flowId: 'flow_id',
      accountId: 'account_id',
      signInfo: 'sign_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      signNo: 'string',
      flowId: 'string',
      accountId: 'string',
      signInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoFrontTradeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 类型
  // 1. orderFullInfo ， 订单所有信息同步
  type: string;
  // json.toString
  bizContent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      type: 'type',
      bizContent: 'biz_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      type: 'string',
      bizContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoFrontTradeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回信息
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

export class RetryAntchainAtoWithholdPlanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 长度不可超过50
  orderId: string;
  // 第几期
  periodNum: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      periodNum: 'period_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      periodNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryAntchainAtoWithholdPlanResponse extends $tea.Model {
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

export class ConfirmAntchainAtoWithholdSignasyncunsignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 操作动作
  // 同意：AGREE
  // 拒绝：REFUSE
  operate: string;
  // 拒绝原因码,商户拒绝时必填。
  // USER_OWE_MONEY：用户账户存在欠费订单
  // USER_IN_SERVICE：用户有进行的订单
  refuseReasonCode?: string;
  // 用户欠款金额，单位为分
  // refuse_reason_code=USER_OWE_MONEY时必填
  userOweMoney?: number;
  // 用户进行中的服务
  // refuse_reason_code=USER_IN_SERVICE时必填
  userInService?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      operate: 'operate',
      refuseReasonCode: 'refuse_reason_code',
      userOweMoney: 'user_owe_money',
      userInService: 'user_in_service',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      operate: 'string',
      refuseReasonCode: 'string',
      userOweMoney: 'number',
      userInService: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmAntchainAtoWithholdSignasyncunsignResponse extends $tea.Model {
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

export class UploadAntchainAtoFundFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单所属商户的统一社会信用代码
  merchantId: string;
  // 商户的订单号
  orderId: string;
  // 签署合同单号
  signNo: string;
  // 返回的文件fileItemNo编号
  fileItemNo: string;
  // 上传的pdf文件，需要以.pdf后缀结尾
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
  // 资方统一社会信用代码
  fundId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantId: 'merchant_id',
      orderId: 'order_id',
      signNo: 'sign_no',
      fileItemNo: 'file_item_no',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      fundId: 'fund_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantId: 'string',
      orderId: 'string',
      signNo: 'string',
      fileItemNo: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      fundId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadAntchainAtoFundFlowResponse extends $tea.Model {
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

export class GetAntchainAtoFundFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单所属商户的统一社会信用代码
  merchantId: string;
  // 商户的订单号
  orderId: string;
  // 合同类型
  contractType?: string;
  // 资方统一社会信用代码
  fundId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantId: 'merchant_id',
      orderId: 'order_id',
      contractType: 'contract_type',
      fundId: 'fund_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantId: 'string',
      orderId: 'string',
      contractType: 'string',
      fundId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntchainAtoFundFlowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商户的订单号
  orderId?: string;
  // 需要落章的合同列表，需要status状态为FINISH可以落章
  contractList?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
      contractList: 'contract_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
      contractList: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RefuseAntchainAtoFundFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单所属商户的统一社会信用代码
  merchantId: string;
  // 商户的订单号
  orderId: string;
  // 签署合同单号
  signNo: string;
  // 填写拒绝落章原因，如果同意则不用填写
  signReason?: string;
  // 资方统一社会信用代码
  fundId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantId: 'merchant_id',
      orderId: 'order_id',
      signNo: 'sign_no',
      signReason: 'sign_reason',
      fundId: 'fund_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantId: 'string',
      orderId: 'string',
      signNo: 'string',
      signReason: 'string',
      fundId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RefuseAntchainAtoFundFlowResponse extends $tea.Model {
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

export class AuthAntchainAtoFundFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单所属商户的统一社会信用代码
  merchantId: string;
  // 商户的订单号
  orderId: string;
  // 签署的电子合同ID
  signNo: string;
  // 签署区域的tag，和发起签署流程的机构的tag对应
  tag: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantId: 'merchant_id',
      orderId: 'order_id',
      signNo: 'sign_no',
      tag: 'tag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantId: 'string',
      orderId: 'string',
      signNo: 'string',
      tag: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthAntchainAtoFundFlowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签署最后落签的签署区域id列表
  signFieldIds?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      signFieldIds: 'sign_field_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      signFieldIds: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntchainAtoWithholdActivepayRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 长度不可超过50
  orderId: string;
  // 第几期,当支付类型为PERFORMANCE或为空必填
  periodNum?: number;
  // 支付类型
  payType?: string;
  // 支付渠道，非必填。可选值：JSAPI-JSAPI支付，APP-APP支付。默认值：JSAPI
  payChannel?: string;
  // 支付金额，单位为分
  // 当支付类型非PERFORMANCE或为空必填
  payAmount?: number;
  // 经营分账标识Y/N
  // 当pay_type=BUYOUT、PENALTY、MULTI_PAY必填。
  operationDivideFlag?: string;
  // 当operation_divide_flag=Y 必填
  // 经营分账收入列表，最多10条，分账比例与正常限制一致。
  operationDivideTransInList?: OperationDivideTransInModel[];
  // 单期支付明细列表
  // 当pay_type=MULTI_PAY必填。
  multiPayDetail?: SingleTermDetail[];
  // 支付申请号，用于区分在一笔订单同一支付类型的多笔支付请求。
  // 当支付类型非MULTI_PAY或为空时必填
  payApplyNo?: number;
  // 回调地址
  returnUrl?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      periodNum: 'period_num',
      payType: 'pay_type',
      payChannel: 'pay_channel',
      payAmount: 'pay_amount',
      operationDivideFlag: 'operation_divide_flag',
      operationDivideTransInList: 'operation_divide_trans_in_list',
      multiPayDetail: 'multi_pay_detail',
      payApplyNo: 'pay_apply_no',
      returnUrl: 'return_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      periodNum: 'number',
      payType: 'string',
      payChannel: 'string',
      payAmount: 'number',
      operationDivideFlag: 'string',
      operationDivideTransInList: { 'type': 'array', 'itemType': OperationDivideTransInModel },
      multiPayDetail: { 'type': 'array', 'itemType': SingleTermDetail },
      payApplyNo: 'number',
      returnUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntchainAtoWithholdActivepayResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 支付宝支付订单号，用于拉起主动支付页面
  tradeNo?: string;
  // 单据支付字符串
  // app场景：返回签名字符串
  // h5场景：返回支付链接
  orderStr?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tradeNo: 'trade_no',
      orderStr: 'order_str',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tradeNo: 'string',
      orderStr: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoWithholdActivepayRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 长度不可超过50
  orderId: string;
  // 第几期,当支付类型为PERFORMANCE或为空必填
  periodNum?: number;
  // 支付宝支付订单号，当传递此单号时，只会返回当前单据
  tradeNo?: string;
  // 支付类型
  payType?: string;
  // 无用字段，无需关注
  payChannel?: string;
  // 支付申请号，用于区分在一笔订单同一支付类型的多笔支付请求。
  // 当支付类型非MULTI_PAY或为空时必填
  payApplyNo?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      periodNum: 'period_num',
      tradeNo: 'trade_no',
      payType: 'pay_type',
      payChannel: 'pay_channel',
      payApplyNo: 'pay_apply_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      periodNum: 'number',
      tradeNo: 'string',
      payType: 'string',
      payChannel: 'string',
      payApplyNo: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoWithholdActivepayResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前支付单
  currentOrder?: ActivePayOrder;
  // 主动支付单列表，当不通过trade_no查询时有值
  orders?: ActivePayOrder[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      currentOrder: 'current_order',
      orders: 'orders',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      currentOrder: ActivePayOrder,
      orders: { 'type': 'array', 'itemType': ActivePayOrder },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelAntchainAtoWithholdActivepayRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 长度不可超过50
  orderId: string;
  // 第几期
  periodNum?: number;
  // 支付宝支付订单号，当传递此单号时，只会取消指定单据号，不传递时取消当前代扣
  tradeNo?: string;
  // 支付类型，默认履约
  payType?: string;
  // 支付申请号，在多期支付场景必填
  payApplyNo?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      periodNum: 'period_num',
      tradeNo: 'trade_no',
      payType: 'pay_type',
      payApplyNo: 'pay_apply_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      periodNum: 'number',
      tradeNo: 'string',
      payType: 'string',
      payApplyNo: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelAntchainAtoWithholdActivepayResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 取消的单号
  tradeNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tradeNo: 'trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tradeNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelAntchainAtoFundPlanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 长度不可超过50
  orderId: string;
  // 订单所属商户的社会信用代码
  merchantId: string;
  // 取消原因 
  // ACTIVE_REDEEM:自主赎回
  // RENTING_OUT_REDEEM:退租赎回
  // RENTING_AND_RESALE_REDEEM:租转售赎回
  cancelReason: string;
  // 融资单的资方社会信用代码
  fundId?: string;
  // 操作
  operation?: string;
  // 赎回金额,单位为分,取消并赎回时必填
  redeemAmount?: number;
  // 赎回类型，为空默认为 TRANSFER 
  // 转账代偿：TRANSFER
  // 代扣代偿：WITHHOLD
  redeemType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      cancelReason: 'cancel_reason',
      fundId: 'fund_id',
      operation: 'operation',
      redeemAmount: 'redeem_amount',
      redeemType: 'redeem_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
      cancelReason: 'string',
      fundId: 'string',
      operation: 'string',
      redeemAmount: 'number',
      redeemType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelAntchainAtoFundPlanResponse extends $tea.Model {
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

export class CallbackAntchainAtoFundNotifyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // ASYNC_UNSIGN_APPLY
  type: string;
  // 数据
  data: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      type: 'type',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      type: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackAntchainAtoFundNotifyResponse extends $tea.Model {
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

export class SyncAntchainAtoTradeFinanceloanapplyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 
  orderId?: string;
  // 订单所属商户的社会信用代码
  merchantId: string;
  // 融资放款申请接口
  merchantName: string;
  // 资方的社会信用代码
  fundId?: string;
  // 类型
  // ● 默认为：ORDER, 单订单申请
  // ● PACKAGE_ORDER , 资产包订单模式
  type?: string;
  // 资产包id
  // type = PACKAGE_ORDER ， 必填
  assetPackageId?: string;
  // type = PACKAGE_ORDER ， 必填
  // 
  // ● APPEND: 追加订单列表
  // ● FINIISH : 结束
  stage?: string;
  // 订单id列表的jsonArray
  orderIdList?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      merchantName: 'merchant_name',
      fundId: 'fund_id',
      type: 'type',
      assetPackageId: 'asset_package_id',
      stage: 'stage',
      orderIdList: 'order_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
      merchantName: 'string',
      fundId: 'string',
      type: 'string',
      assetPackageId: 'string',
      stage: 'string',
      orderIdList: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoTradeFinanceloanapplyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单id
  orderId?: string;
  // 订单所属商户的社会信用代码
  merchantId?: string;
  // 非法的订单列表
  illegalOrderIdList?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      illegalOrderIdList: 'illegal_order_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
      merchantId: 'string',
      illegalOrderIdList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntchainAtoTradeMerchantfulfillmentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 订单所属商户的社会信用代码
  merchantId: string;
  // 履约期数，不填返回为所有履约期的履约信息
  // - 如果有填写，返回当前期数的履约信息，列表长度为1
  termIdx?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      termIdx: 'term_idx',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
      termIdx: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntchainAtoTradeMerchantfulfillmentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回值为 「MerchantFulfillmentResp」的json字符串
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

export class SyncAntchainAtoFundMerchantpromiseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 
  orderId: string;
  // 订单所属商户的社会信用代码
  merchantId: string;
  // json字符串,填入「MerchantPromiseReq」的json字符串
  bizContent: string;
  // 资方公司社会信用代码
  fundId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      bizContent: 'biz_content',
      fundId: 'fund_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
      bizContent: 'string',
      fundId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoFundMerchantpromiseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单id
  orderId?: string;
  // 订单所属商家社会信用代码
  merchantId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
      merchantId: 'merchant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
      merchantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoFundFinanceloanresultsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 商家的社会信用代码
  merchantId: string;
  // json字符串,填入「FinanceLoanResultsReq」的json字符串
  bizContent: string;
  // 资方的社会信用代码
  fundId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      bizContent: 'biz_content',
      fundId: 'fund_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
      bizContent: 'string',
      fundId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoFundFinanceloanresultsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单id
  orderId?: string;
  // 订单所属商户的社会信用代码
  merchantId?: string;
  // "ERROR": 放款同步异常
  // “SUCCESS":放款同步成功
  loanResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      loanResult: 'loan_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
      merchantId: 'string',
      loanResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntchainAtoFundUserpromiseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 订单所属商户的社会信用代码
  merchantId: string;
  // 资方的社会信用代码
  fundId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      fundId: 'fund_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
      fundId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntchainAtoFundUserpromiseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回值为「OrderPromise」的json字符串
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

export class GetAntchainAtoTradeUserperformanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 商家公司社会信用代码
  merchantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntchainAtoTradeUserperformanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 「UserPerformanceInfo」的json字符串
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

export class GetAntchainAtoTradeMerchantperformanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 订单所属商户的社会信用代码
  merchantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntchainAtoTradeMerchantperformanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 「MerchantPerformanceInfo」的json字符串
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

export class GetAntchainAtoFundUserperformanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 
  orderId: string;
  // 订单所属商户的社会信用代码
  merchantId: string;
  // 订单所属融资公司的社会信用代码
  fundId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      fundId: 'fund_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
      fundId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntchainAtoFundUserperformanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 「UserPerformanceInfo」的json字符串
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

export class GetAntchainAtoFundMerchantperformanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 
  orderId: string;
  // 订单所属商户的社会信用代码
  merchantId: string;
  // 订单所属融资方的社会信用代码
  fundId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      fundId: 'fund_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
      fundId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntchainAtoFundMerchantperformanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 「MerchantPerformanceInfo」的json字符串
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

export class GetAntchainAtoFundOrderfullinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单Id
  orderId: string;
  // 订单所属商户的社会信用代码
  merchantId: string;
  // 订单所属商户的社会信用代码
  fundId: string;
  // 123
  bizType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      fundId: 'fund_id',
      bizType: 'biz_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
      fundId: 'string',
      bizType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntchainAtoFundOrderfullinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // OrderFullInfoResp的json字符串
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

export class UploadAntchainAtoSignFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 	
  // 订单所属商户的统一社会信用代码
  merchantId: string;
  // 	
  // 商户的订单号
  orderId: string;
  // 签署合同单号
  signNo: string;
  // 模板id
  templateId: string;
  // 合同签署时间，格式为yyyy-MM-dd HH:mm:ss
  signTime: string;
  // 上传的pdf文件，需要以.pdf后缀结尾
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
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantId: 'merchant_id',
      orderId: 'order_id',
      signNo: 'sign_no',
      templateId: 'template_id',
      signTime: 'sign_time',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantId: 'string',
      orderId: 'string',
      signNo: 'string',
      templateId: 'string',
      signTime: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadAntchainAtoSignFlowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文件编号
  fileItemNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      fileItemNo: 'file_item_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      fileItemNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntchainAtoWithholdRefundRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 第几期
  // 针对用户履约的第几期进行退款申请
  periodNum?: number;
  // 外部系统传入的退款请求号
  refundRequestNo: string;
  // 本次请求的退款金额，单位为分
  // 1234=12.34元
  refundMoney: number;
  // 退款原因
  refundReason?: string;
  // 支付类型
  // ORDER_BUYOUT:买断金
  // ORDER_PENALTY:违约金
  // PERFORMANCE:正常履约（默认）
  payType?: string;
  // 多期合并支付第几期
  payApplyNo?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      periodNum: 'period_num',
      refundRequestNo: 'refund_request_no',
      refundMoney: 'refund_money',
      refundReason: 'refund_reason',
      payType: 'pay_type',
      payApplyNo: 'pay_apply_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      periodNum: 'number',
      refundRequestNo: 'string',
      refundMoney: 'number',
      refundReason: 'string',
      payType: 'string',
      payApplyNo: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntchainAtoWithholdRefundResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 外部系统传入的退款请求号
  refundRequestNo?: string;
  // ACCEPT : 受理成功
  status?: string;
  // 请求支付宝的退款单据号
  refundOrderNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      refundRequestNo: 'refund_request_no',
      status: 'status',
      refundOrderNo: 'refund_order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      refundRequestNo: 'string',
      status: 'string',
      refundOrderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoWithholdRefundRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 几期
  // 针对用户履约的第几期进行退款申请
  periodNum?: number;
  // 外部系统传入的退款请求号
  refundRequestNo: string;
  // 支付类型
  // ORDER_BUYOUT:买断金
  // ORDER_PENALTY:违约金
  // PERFORMANCE:正常履约（默认）
  payType?: string;
  // 第几次多期合并支付申请号
  payApplyNo?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      periodNum: 'period_num',
      refundRequestNo: 'refund_request_no',
      payType: 'pay_type',
      payApplyNo: 'pay_apply_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      periodNum: 'number',
      refundRequestNo: 'string',
      payType: 'string',
      payApplyNo: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoWithholdRefundResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 外部系统传入的退款请求号
  refundRequestNo?: string;
  // 请求支付宝的退款单据号
  refundOrderNo?: string;
  // 退款请求状态
  // ● ACCEPT: 受理成功
  // ● PENDING: 需人工介入
  // ● SUCCESS: 成功
  // ● FAILED : 失败
  status?: string;
  // 退款失败原因
  refundErrorMsg?: string;
  // 本笔交易总退款金额，单位为分
  // 12300=123元
  totalRefundAmount?: number;
  // 本次退款申请的实际退款金额，单位为分
  // 12300=123元
  sendBackAmount?: number;
  // 实际退款时间,13位时间戳（毫秒）
  gmtRefundPay?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      refundRequestNo: 'refund_request_no',
      refundOrderNo: 'refund_order_no',
      status: 'status',
      refundErrorMsg: 'refund_error_msg',
      totalRefundAmount: 'total_refund_amount',
      sendBackAmount: 'send_back_amount',
      gmtRefundPay: 'gmt_refund_pay',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      refundRequestNo: 'string',
      refundOrderNo: 'string',
      status: 'string',
      refundErrorMsg: 'string',
      totalRefundAmount: 'number',
      sendBackAmount: 'number',
      gmtRefundPay: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAntchainAtoTradeUserpromiseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 商家社会信用代码
  merchantId: string;
  // 修改的用户履约期数
  termIdx: number;
  // 更新后的租金，单位为分
  // 1234=12.34元
  updatedRentalMoney: number;
  // 调整原因，枚举
  // ● A01 : 违章罚金
  // ● A02 : 水电煤费用
  reason: string;
  // 调整说明，本说明同步到支付宝账户备注中，需准确填写
  desc: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      termIdx: 'term_idx',
      updatedRentalMoney: 'updated_rental_money',
      reason: 'reason',
      desc: 'desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
      termIdx: 'number',
      updatedRentalMoney: 'number',
      reason: 'string',
      desc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAntchainAtoTradeUserpromiseResponse extends $tea.Model {
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

export class AllAntchainAtoInnerTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 分页查询结构体
  pageInfo: PageQuery;
  // 商户对应租户ID
  tenantId: string;
  // 魔法库模板code
  templateCode?: string;
  // 魔法库模板文件名称
  templateName?: string;
  // 线上模板ID
  templateCodeProd?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageInfo: 'page_info',
      tenantId: 'tenant_id',
      templateCode: 'template_code',
      templateName: 'template_name',
      templateCodeProd: 'template_code_prod',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageInfo: PageQuery,
      tenantId: 'string',
      templateCode: 'string',
      templateName: 'string',
      templateCodeProd: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllAntchainAtoInnerTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 模板列表数据
  templateList?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      templateList: 'template_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      templateList: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAntchainAtoInnerTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 分页查询
  pageInfo: PageQuery;
  // 商户对应租户ID
  tenantId: string;
  // 魔法库模板code
  templateCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageInfo: 'page_info',
      tenantId: 'tenant_id',
      templateCode: 'template_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageInfo: PageQuery,
      tenantId: 'string',
      templateCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAntchainAtoInnerTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 模板列表数据
  templateList?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      templateList: 'template_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      templateList: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailAntchainAtoInnerTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 	
  // 商户对应租户ID
  tenantId: string;
  // 魔法库模板code
  templateCode: string;
  // 魔法库模板版本
  templateVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      templateCode: 'template_code',
      templateVersion: 'template_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      templateCode: 'string',
      templateVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailAntchainAtoInnerTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 模板详情信息
  templateInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      templateInfo: 'template_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      templateInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntchainAtoInnerTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 	
  // 商户对应租户ID
  tenantId: string;
  // 创建的模板名称
  templateName: string;
  // 文件oss存储的key
  fileKey?: string;
  // 模板文件的名称
  fileName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      templateName: 'template_name',
      fileKey: 'file_key',
      fileName: 'file_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      templateName: 'string',
      fileKey: 'string',
      fileName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntchainAtoInnerTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 魔法库模板code
  templateCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      templateCode: 'template_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      templateCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveAntchainAtoInnerTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户对应租户ID
  tenantId: string;
  // 魔法库模板code
  templateCode: string;
  // 魔法库模板版本
  templateVersion: string;
  // 文件预览地址
  previewAddress: string;
  // 创建模板的元素列表
  templateElementList?: string;
  // 文件oss存储的key
  fileKey: string;
  // 是否确认保存。点击”保存“按钮传false、点击”下一步“按钮传true
  confirm: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      templateCode: 'template_code',
      templateVersion: 'template_version',
      previewAddress: 'preview_address',
      templateElementList: 'template_element_list',
      fileKey: 'file_key',
      confirm: 'confirm',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      templateCode: 'string',
      templateVersion: 'string',
      previewAddress: 'string',
      templateElementList: 'string',
      fileKey: 'string',
      confirm: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveAntchainAtoInnerTemplateResponse extends $tea.Model {
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

export class PublishAntchainAtoInnerTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户对应租户ID
  tenantId: string;
  // 魔法库模板code
  templateCode: string;
  // 魔法库版本id
  templateVersionId: string;
  // 合同模板制作版本id
  templateVersion?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      templateCode: 'template_code',
      templateVersionId: 'template_version_id',
      templateVersion: 'template_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      templateCode: 'string',
      templateVersionId: 'string',
      templateVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishAntchainAtoInnerTemplateResponse extends $tea.Model {
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

export class PreviewAntchainAtoInnerTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户对应租户ID
  tenantId: string;
  // 文件oss存储的key
  fileKey: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      fileKey: 'file_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      fileKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PreviewAntchainAtoInnerTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 预览接口返回
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

export class DeleteAntchainAtoInnerTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户对应租户ID
  tenantId: string;
  // 魔法库模板code
  templateCode: string;
  // 魔法库模板版本
  templateVersion: string;
  // 魔法库模板版本id
  templateVersionId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      templateCode: 'template_code',
      templateVersion: 'template_version',
      templateVersionId: 'template_version_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      templateCode: 'string',
      templateVersion: 'string',
      templateVersionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAntchainAtoInnerTemplateResponse extends $tea.Model {
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

export class CloneAntchainAtoInnerTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户对应租户ID
  tenantId: string;
  // 模板code
  templateCode: string;
  // 魔法库对应模板的模板复制id
  voucherId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      templateCode: 'template_code',
      voucherId: 'voucher_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      templateCode: 'string',
      voucherId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CloneAntchainAtoInnerTemplateResponse extends $tea.Model {
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

export class NotifyAntchainAtoFundFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单所属商户的统一社会信用代码
  merchantId: string;
  // 商户的订单号
  orderId: string;
  // 签署合同单号
  signNo: string;
  // 返回的文件fileItemNo编号
  fileItemNo: string;
  // 资方统一社会信用代码
  fundId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantId: 'merchant_id',
      orderId: 'order_id',
      signNo: 'sign_no',
      fileItemNo: 'file_item_no',
      fundId: 'fund_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantId: 'string',
      orderId: 'string',
      signNo: 'string',
      fileItemNo: 'string',
      fundId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyAntchainAtoFundFlowResponse extends $tea.Model {
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

export class QueryAntchainAtoInnerTemplateimageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户对应租户ID
  tenantId: string;
  // 分页查询结构体
  pageInfo: PageQuery;
  // 魔法库模板code
  templateCode: string;
  // 魔法库模板版本
  templateVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      pageInfo: 'page_info',
      templateCode: 'template_code',
      templateVersion: 'template_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      pageInfo: PageQuery,
      templateCode: 'string',
      templateVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoInnerTemplateimageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 模板图片列表
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

export class SyncAntchainAtoFrontIndirectorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务参数,json.toString
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

export class SyncAntchainAtoFrontIndirectorderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回值，json字符串
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

export class SyncAntchainAtoTradeIndirectorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务参数,json.toString
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

export class SyncAntchainAtoTradeIndirectorderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回业务参数，json.toString
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

export class RegisterAntchainAtoMerchantexpandMerchantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 公司信息
  companyInfo: CompanyInfo;
  // 法人信息
  legalInfo: LegalInfo;
  // 应用信息
  applicationInfo?: ApplicationInfo;
  // 进件模式 DIRECT(直连进件) AGENT(代理进件)
  expandMode: string;
  // expand_mode=_AGENT_ 必填
  subTenantId?: string;
  // 京东商家控股信息
  merchantHoldingInfo?: MerchantHoldingInfo;
  // 京东商家结算信息
  merchantSettleInfo?: MerchantSettleInfo;
  // 支付渠道
  // ALIPAY（默认）
  // JDPAY
  // RECEIPT_COUPON（立减金金融）
  payChannel?: string;
  // 角色
  // MERCHANT（默认）
  // FINANCIER
  role?: string;
  // 商家进件时，可自行选择是否需要开通周期代扣产品，默认开通
  // false：不开通
  needWithholding?: boolean;
  // 是否开通“预授权支付”,默认否
  needPreAuthPay?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyInfo: 'company_info',
      legalInfo: 'legal_info',
      applicationInfo: 'application_info',
      expandMode: 'expand_mode',
      subTenantId: 'sub_tenant_id',
      merchantHoldingInfo: 'merchant_holding_info',
      merchantSettleInfo: 'merchant_settle_info',
      payChannel: 'pay_channel',
      role: 'role',
      needWithholding: 'need_withholding',
      needPreAuthPay: 'need_pre_auth_pay',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      companyInfo: CompanyInfo,
      legalInfo: LegalInfo,
      applicationInfo: ApplicationInfo,
      expandMode: 'string',
      subTenantId: 'string',
      merchantHoldingInfo: MerchantHoldingInfo,
      merchantSettleInfo: MerchantSettleInfo,
      payChannel: 'string',
      role: 'string',
      needWithholding: 'boolean',
      needPreAuthPay: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterAntchainAtoMerchantexpandMerchantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 进件流水号
  payExpandId?: string;
  // 进件状态
  // INIT 入驻中 
  // SUCCESS 入驻成功 
  // FAIL 入驻失败
  enrollmentStatus?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      payExpandId: 'pay_expand_id',
      enrollmentStatus: 'enrollment_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      payExpandId: 'string',
      enrollmentStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadAntchainAtoMerchantexpandFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件名称 包含后缀
  fileName: string;
  // ● BUSINESS_LICENSE 营业执照 ● CARD_FRONT 身份证正面 ● CARD_BACK 身份证反面 ● SPLITTING 分账 
  bizScene: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileName: 'file_name',
      bizScene: 'biz_scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileName: 'string',
      bizScene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadAntchainAtoMerchantexpandFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 临时上传文件地址
  uploadUrl?: string;
  // 文件key
  fileKey?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      uploadUrl: 'upload_url',
      fileKey: 'file_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      uploadUrl: 'string',
      fileKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoMerchantexpandMerchantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户入驻返回的进件编号 expand_mode=AGENT必填
  payExpandId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      payExpandId: 'pay_expand_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      payExpandId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoMerchantexpandMerchantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商户入驻状态
  // INIT 入驻中
  // SUCCESS 入驻成功
  // FAIL 入驻失败
  // MERCHANT_CONFIRM 待商户B站确认
  // SUB_MERCHANT_CREDIT 二级户商户签约中
  enrollmentStatus?: string;
  // 入驻失败原因
  failReason?: string;
  // 商户进件流程待办事件跳转链接
  pendingEventLink?: string;
  // 京东进件成功二级商户id
  subMerchantId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      enrollmentStatus: 'enrollment_status',
      failReason: 'fail_reason',
      pendingEventLink: 'pending_event_link',
      subMerchantId: 'sub_merchant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      enrollmentStatus: 'string',
      failReason: 'string',
      pendingEventLink: 'string',
      subMerchantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoInnerTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户对应租户ID
  tenantId: string;
  // 来源魔法库模板code
  sourceTemplateCode: string;
  // 目标魔法库模板名称
  targetTemplateName?: string;
  // 模板同步的场景，值参考：CREATE_TEMPLATE、SYNC_PROD
  scene: string;
  // 魔法库来源模板版本
  sourceTemplateVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      sourceTemplateCode: 'source_template_code',
      targetTemplateName: 'target_template_name',
      scene: 'scene',
      sourceTemplateVersion: 'source_template_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      sourceTemplateCode: 'string',
      targetTemplateName: 'string',
      scene: 'string',
      sourceTemplateVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoInnerTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 同步后的新模板code
  targetTemplateCode?: string;
  // 模板同步上线时(强管控字段)校验结果
  validResult?: boolean;
  // 校验结果明细JSONStr
  validFieldDetail?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      targetTemplateCode: 'target_template_code',
      validResult: 'valid_result',
      validFieldDetail: 'valid_field_detail',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      targetTemplateCode: 'string',
      validResult: 'boolean',
      validFieldDetail: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAntchainAtoInnerTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户对应租户ID
  tenantId: string;
  // 模板名称
  templateName: string;
  // 模板code
  templateCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      templateName: 'template_name',
      templateCode: 'template_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      templateName: 'string',
      templateCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAntchainAtoInnerTemplateResponse extends $tea.Model {
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

export class UploadAntchainAtoSignTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单所属商户的统一社会信用代码
  merchantId: string;
  // 合同类型
  contractType?: string;
  // 模板类型
  agreementType?: string;
  // 签署区坐标配置
  posConf: string;
  // 模板参数
  templateArgs?: string;
  // 上传的pdf文件，需要以.pdf后缀结尾
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
  // 资方统一社会信用代码，默认为空
  fundId?: string;
  // 是否需要资方签署，默认为否
  fundSign?: boolean;
  // 资方签署区坐标，默认为空
  fundPosConf?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantId: 'merchant_id',
      contractType: 'contract_type',
      agreementType: 'agreement_type',
      posConf: 'pos_conf',
      templateArgs: 'template_args',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      fundId: 'fund_id',
      fundSign: 'fund_sign',
      fundPosConf: 'fund_pos_conf',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantId: 'string',
      contractType: 'string',
      agreementType: 'string',
      posConf: 'string',
      templateArgs: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      fundId: 'string',
      fundSign: 'boolean',
      fundPosConf: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadAntchainAtoSignTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 上传模板后返回的模板id
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

export class QueryAntchainAtoInnerTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 模板code
  templateCode: string;
  // 租户8位id
  tenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      templateCode: 'template_code',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      templateCode: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoInnerTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 模板的基本信息，json格式
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

export class QueryAntchainAtoInnerTemplateelementlinkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  // 模板code
  templateCode: string;
  // 模板版本
  templateVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      templateCode: 'template_code',
      templateVersion: 'template_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      templateCode: 'string',
      templateVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoInnerTemplateelementlinkResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 模板元素列表，json格式
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

export class UploadAntchainAtoFundCreditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号类型
  orderNoType: string;
  // 订单号，或资产包号
  orderNo: string;
  // 资方统一社会信用代码
  fundId: string;
  // 凭证类型
  creditType: string;
  // 凭证名称
  creditName?: string;
  // 文本类型
  contentType: string;
  // 文本下载链接，如果类型是FILE则必填
  fileUrl?: string;
  // 内容数据，格式为JSON类型文本，如果类型是JSON_TEXT则必填
  content?: string;
  // 商户统一社会信用代码
  merchantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNoType: 'order_no_type',
      orderNo: 'order_no',
      fundId: 'fund_id',
      creditType: 'credit_type',
      creditName: 'credit_name',
      contentType: 'content_type',
      fileUrl: 'file_url',
      content: 'content',
      merchantId: 'merchant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNoType: 'string',
      orderNo: 'string',
      fundId: 'string',
      creditType: 'string',
      creditName: 'string',
      contentType: 'string',
      fileUrl: 'string',
      content: 'string',
      merchantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadAntchainAtoFundCreditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 凭证内容id
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

export class UploadAntchainAtoSignCreditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号类型
  orderNoType: string;
  // 订单号，或资产包号
  orderNo: string;
  // 凭证合同类型
  creditType: string;
  // 凭证名称
  creditName?: string;
  // 文本类型
  contentType: string;
  // 文本下载链接，如果类型是FILE则必填
  fileUrl?: string;
  // 内容数据，格式为JSON类型文本，如果类型是JSON_TEXT则必填
  content?: string;
  // 商户统一社会信用代码
  merchantId?: string;
  // 扩展信息
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNoType: 'order_no_type',
      orderNo: 'order_no',
      creditType: 'credit_type',
      creditName: 'credit_name',
      contentType: 'content_type',
      fileUrl: 'file_url',
      content: 'content',
      merchantId: 'merchant_id',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNoType: 'string',
      orderNo: 'string',
      creditType: 'string',
      creditName: 'string',
      contentType: 'string',
      fileUrl: 'string',
      content: 'string',
      merchantId: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadAntchainAtoSignCreditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 凭证内容id
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

export class QueryAntchainAtoFundCreditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号类型
  orderNoType: string;
  // 订单号，或资产包号
  orderNo: string;
  // 资方统一社会信用代码
  fundId: string;
  // 商户统一社会信用代码
  merchantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNoType: 'order_no_type',
      orderNo: 'order_no',
      fundId: 'fund_id',
      merchantId: 'merchant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNoType: 'string',
      orderNo: 'string',
      fundId: 'string',
      merchantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoFundCreditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 内容信息
  contentInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      contentInfo: 'content_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      contentInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoSignCreditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号类型
  orderNoType: string;
  // 订单号，或资产包号
  orderNo: string;
  // 商户统一社会信用代码
  merchantId?: string;
  // 扩展信息json格式
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNoType: 'order_no_type',
      orderNo: 'order_no',
      merchantId: 'merchant_id',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNoType: 'string',
      orderNo: 'string',
      merchantId: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoSignCreditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 内容信息
  contentInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      contentInfo: 'content_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      contentInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAntchainAtoMerchantexpandMerchantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 公司信息
  companyInfo: CompanyInfoUpdate;
  // 法人信息
  legalInfo: LegalInfoUpdate;
  // 应用信息
  applicationInfo: ApplicationInfoUpdate;
  // 进件流水号
  payExpandId: string;
  // 社会统一信用代码
  merchantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyInfo: 'company_info',
      legalInfo: 'legal_info',
      applicationInfo: 'application_info',
      payExpandId: 'pay_expand_id',
      merchantId: 'merchant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      companyInfo: CompanyInfoUpdate,
      legalInfo: LegalInfoUpdate,
      applicationInfo: ApplicationInfoUpdate,
      payExpandId: 'string',
      merchantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAntchainAtoMerchantexpandMerchantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 进件流水号
  payExpandId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      payExpandId: 'pay_expand_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      payExpandId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelAntchainAtoSignFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 签署合同单号
  signNo: string;
  // 默认:“撤销”，最大长度50
  revokeReason?: string;
  // 发起人账户id，即发起本次签署的操作人个人账号id；如不传，默认由对接平台发起
  operatorId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      signNo: 'sign_no',
      revokeReason: 'revoke_reason',
      operatorId: 'operator_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      signNo: 'string',
      revokeReason: 'string',
      operatorId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelAntchainAtoSignFlowResponse extends $tea.Model {
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

export class ReplaceAntchainAtoTradeUserpromiseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // json字符串
  bizContent: string;
  // order_id
  orderId: string;
  // 订单所属商户社会信用代码
  merchantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
      orderId: 'order_id',
      merchantId: 'merchant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
      orderId: 'string',
      merchantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReplaceAntchainAtoTradeUserpromiseResponse extends $tea.Model {
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

export class ApplyAntchainAtoTradeFinanceprecheckRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 长度大于6，小于50
  orderId: string;
  // 订单所属商户的社会信用代码
  merchantId: string;
  // 提交预审的资方的社会信用代码
  fundId: string;
  // 透传到资方，不做格式限制
  transparentInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      fundId: 'fund_id',
      transparentInfo: 'transparent_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
      fundId: 'string',
      transparentInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyAntchainAtoTradeFinanceprecheckResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // ● EXEMPTION ： 资方免预审
  // ● SUBMIT_SUCCESS: 异步预审提交成功
  responseData?: string;
  // order_id
  orderId?: string;
  // merchant_id
  merchantId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
      orderId: 'order_id',
      merchantId: 'merchant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
      orderId: 'string',
      merchantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoFundFinanceprecheckresultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 长度不可超过50
  orderId: string;
  // 订单所属商户的社会信用代码
  merchantId: string;
  // 资方的社会信用代码
  fundId: string;
  // 预审结果
  // ● APPROVAL ： 通过
  // ● REFUSE ：拒绝
  result: string;
  // 拒绝原因
  refuseReason?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      fundId: 'fund_id',
      result: 'result',
      refuseReason: 'refuse_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
      fundId: 'string',
      result: 'string',
      refuseReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoFundFinanceprecheckresultResponse extends $tea.Model {
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

export class QueryAntchainAtoFundCompensateaccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资方社会信用代码
  fundId: string;
  // 商户社会信用代码
  merchantId: string;
  // 商户租户id
  merchantTenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fundId: 'fund_id',
      merchantId: 'merchant_id',
      merchantTenantId: 'merchant_tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fundId: 'string',
      merchantId: 'string',
      merchantTenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoFundCompensateaccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 可用余额，单位为分
  availableAmount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      availableAmount: 'available_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      availableAmount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoWithholdCompensateaccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户社会信用代码
  merchantId: string;
  // 资方社会信用代码
  fundId: string;
  // 资方租户id
  fundTenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantId: 'merchant_id',
      fundId: 'fund_id',
      fundTenantId: 'fund_tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantId: 'string',
      fundId: 'string',
      fundTenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoWithholdCompensateaccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 代偿卡号
  cardNo?: string;
  // 可用余额，单位为分
  availableAmount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      cardNo: 'card_no',
      availableAmount: 'available_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      cardNo: 'string',
      availableAmount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntchainAtoSignContractcertificateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 流程id
  signNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      signNo: 'sign_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      signNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntchainAtoSignContractcertificateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 下载文件地址(一小时内有效)
  url?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      url: 'url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      url: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class TransferAntchainAtoTradeFinanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 公司社会信用代码
  merchantId: string;
  // 待预审资方列表
  fundIdList: string[];
  // 融资签署模式
  fundSignMode: string;
  // 商户分账起始期数
  divideStartTermIndex: number;
  // 融资模式
  fundMode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      fundIdList: 'fund_id_list',
      fundSignMode: 'fund_sign_mode',
      divideStartTermIndex: 'divide_start_term_index',
      fundMode: 'fund_mode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
      fundIdList: { 'type': 'array', 'itemType': 'string' },
      fundSignMode: 'string',
      divideStartTermIndex: 'number',
      fundMode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class TransferAntchainAtoTradeFinanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // order_id
  orderId?: string;
  // merchant_id
  merchantId?: string;
  // jsonArray.toString
  fundCandidates?: string;
  // 转融资结果
  transferResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      fundCandidates: 'fund_candidates',
      transferResult: 'transfer_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
      merchantId: 'string',
      fundCandidates: 'string',
      transferResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAntchainAtoTradeOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // order_id
  orderId: string;
  // merchant_id
  merchantId: string;
  // json字符串
  updateOrderInfo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      updateOrderInfo: 'update_order_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
      updateOrderInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAntchainAtoTradeOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // order_id
  orderId?: string;
  // merchant_id
  merchantId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
      merchantId: 'merchant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
      merchantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddAntchainAtoTradeFinanceprecheckRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // order_id
  orderId: string;
  // merchant_id
  merchantId: string;
  // ["1","2"]
  fundIdList: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      fundIdList: 'fund_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
      fundIdList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddAntchainAtoTradeFinanceprecheckResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // merchant_id
  merchantId?: string;
  // order_id
  orderId?: string;
  // fund_candidates
  // List<FundCompanyInfo> 的jsonArray.toString
  fundCandidates?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      merchantId: 'merchant_id',
      orderId: 'order_id',
      fundCandidates: 'fund_candidates',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      merchantId: 'string',
      orderId: 'string',
      fundCandidates: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntchainAtoTradeOrderfinanceinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单Id
  orderId: string;
  // 商户社会信用代码
  merchantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntchainAtoTradeOrderfinanceinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单融资信息
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

export class GetAntchainAtoFundOrderfinanceinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // order_id
  orderId: string;
  // merchant_id
  merchantId: string;
  // fund_id
  fundId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      fundId: 'fund_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
      fundId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntchainAtoFundOrderfinanceinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // {}
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

export class SyncAntchainAtoTradeUserpromisedelayRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // order_id
  orderId: string;
  // merchant_id
  merchantId: string;
  // 1
  delayStartPeriod: number;
  // 延期时间单位
  delayTimeUnit: string;
  // 延期时间数值
  delayTimeValue: number;
  // 原因描述
  reason: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      delayStartPeriod: 'delay_start_period',
      delayTimeUnit: 'delay_time_unit',
      delayTimeValue: 'delay_time_value',
      reason: 'reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
      delayStartPeriod: 'number',
      delayTimeUnit: 'string',
      delayTimeValue: 'number',
      reason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoTradeUserpromisedelayResponse extends $tea.Model {
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

export class PauseAntchainAtoTradeUserpromiseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 社会信用代码
  merchantId: string;
  // 理由
  reason: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      reason: 'reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
      reason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PauseAntchainAtoTradeUserpromiseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 暂停后自动重启时间
  autoResumeDay?: string;
  // 暂停后自动执行代扣时间，为autoResumeDay的第二天重新开始执行代扣计划
  autoWithholdRestartDay?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      autoResumeDay: 'auto_resume_day',
      autoWithholdRestartDay: 'auto_withhold_restart_day',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      autoResumeDay: 'string',
      autoWithholdRestartDay: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ResumeAntchainAtoTradeUserpromiseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // order_id
  orderId: string;
  // merchant_id
  merchantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ResumeAntchainAtoTradeUserpromiseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单重启时间
  resumeDay?: string;
  // withhold_restart_day
  withholdRestartDay?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resumeDay: 'resume_day',
      withholdRestartDay: 'withhold_restart_day',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resumeDay: 'string',
      withholdRestartDay: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddAntchainAtoMerchantexpandDividerelationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 被分账方社会统一信用代码
  merchantId: string;
  // 分账方信息，最多支持10组
  divideBindingTransInInfoList: DivideBindingTransInInfo[];
  // 分账比例上限
  divideRadio?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantId: 'merchant_id',
      divideBindingTransInInfoList: 'divide_binding_trans_in_info_list',
      divideRadio: 'divide_radio',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantId: 'string',
      divideBindingTransInInfoList: { 'type': 'array', 'itemType': DivideBindingTransInInfo },
      divideRadio: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddAntchainAtoMerchantexpandDividerelationResponse extends $tea.Model {
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

export class QueryAntchainAtoMerchantexpandDividerelationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 被分账方社会统一信用代码
  merchantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantId: 'merchant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoMerchantexpandDividerelationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分账绑定关系支付宝pid
  alipayPidList?: string[];
  // 分账比例上限
  divideRadio?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      alipayPidList: 'alipay_pid_list',
      divideRadio: 'divide_radio',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      alipayPidList: { 'type': 'array', 'itemType': 'string' },
      divideRadio: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddAntchainAtoInnerTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  // 合同模板code
  templateCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      templateCode: 'template_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      templateCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddAntchainAtoInnerTemplateResponse extends $tea.Model {
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

export class ApplyAntchainAtoFundCreditutilizationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单列表
  orderList: CreditUtilizationOrder[];
  // 商户租户id
  tenantId: string;
  // 商户统一社会信用代码
  merchantId: string;
  // 资方统一社会信用代码
  fundId: string;
  // 授信Id
  grantingId: string;
  // 用信授权id
  utilizationAuthId: string;
  // 用信id, 需保证唯一性
  utilizationId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderList: 'order_list',
      tenantId: 'tenant_id',
      merchantId: 'merchant_id',
      fundId: 'fund_id',
      grantingId: 'granting_id',
      utilizationAuthId: 'utilization_auth_id',
      utilizationId: 'utilization_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderList: { 'type': 'array', 'itemType': CreditUtilizationOrder },
      tenantId: 'string',
      merchantId: 'string',
      fundId: 'string',
      grantingId: 'string',
      utilizationAuthId: 'string',
      utilizationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyAntchainAtoFundCreditutilizationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用信Id
  utilizationId?: string;
  // 用信授权id
  utilizationAuthId?: string;
  // 资产包id
  assetPackageId?: string;
  // 商户授权链接
  merchantAuthUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      utilizationId: 'utilization_id',
      utilizationAuthId: 'utilization_auth_id',
      assetPackageId: 'asset_package_id',
      merchantAuthUrl: 'merchant_auth_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      utilizationId: 'string',
      utilizationAuthId: 'string',
      assetPackageId: 'string',
      merchantAuthUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoFundCreditgrantingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授信id
  grantingId: string;
  // 授信授权id
  authId: string;
  // 资方社会信用代码
  fundId: string;
  // 商户社会信用代码
  merchantId: string;
  // 商户租户id
  tenantId: string;
  // 授信额度，单位为分
  grantingLine?: number;
  // 授信有效期开始时间(yyyy-MM-dd HH:mm:ss)
  effectStartTime?: string;
  // 授信有效期结束时间(yyyy-MM-dd HH:mm:ss)
  effectEndTime?: string;
  // 审核结果
  reviewResult?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      grantingId: 'granting_id',
      authId: 'auth_id',
      fundId: 'fund_id',
      merchantId: 'merchant_id',
      tenantId: 'tenant_id',
      grantingLine: 'granting_line',
      effectStartTime: 'effect_start_time',
      effectEndTime: 'effect_end_time',
      reviewResult: 'review_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      grantingId: 'string',
      authId: 'string',
      fundId: 'string',
      merchantId: 'string',
      tenantId: 'string',
      grantingLine: 'number',
      effectStartTime: 'string',
      effectEndTime: 'string',
      reviewResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoFundCreditgrantingResponse extends $tea.Model {
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

export class AuthAntchainAtoFundCreditgrantingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId: string;
  // 商户统一社会信用代码
  merchantId: string;
  // 资方统一社会信用代码
  fundId: string;
  // 授权id
  authId: string;
  // 授权开始时间，格式为yyyy-MM-dd
  authBeginTime?: string;
  // 授权结束时间，格式为yyyy-MM-dd
  authEndTime?: string;
  // 订单查询开始时间，格式为yyyy-MM-dd HH:mm:ss，需要在auth_begin_time之后。
  orderQueryBegin: string;
  // 订单查询结束时间，格式为yyyy-MM-dd HH:mm:ss，需要在auth_end_time之前
  orderQueryEnd?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      merchantId: 'merchant_id',
      fundId: 'fund_id',
      authId: 'auth_id',
      authBeginTime: 'auth_begin_time',
      authEndTime: 'auth_end_time',
      orderQueryBegin: 'order_query_begin',
      orderQueryEnd: 'order_query_end',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      merchantId: 'string',
      fundId: 'string',
      authId: 'string',
      authBeginTime: 'string',
      authEndTime: 'string',
      orderQueryBegin: 'string',
      orderQueryEnd: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthAntchainAtoFundCreditgrantingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商家授权链接
  merchantAuthUrl?: string;
  // 传入的auth_id
  authId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      merchantAuthUrl: 'merchant_auth_url',
      authId: 'auth_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      merchantAuthUrl: 'string',
      authId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoFundCreditgrantingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授信id
  grantingId: string;
  // 资方社会信用代码
  fundId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      grantingId: 'granting_id',
      fundId: 'fund_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      grantingId: 'string',
      fundId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoFundCreditgrantingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授信id
  grantingId?: string;
  // 授信授权id
  authId?: string;
  // 资方社会信用代码
  fundId?: string;
  // 商户社会信用代码
  merchantId?: string;
  // 商户租户id
  // 
  tenantId?: string;
  // 授信额度，单位为分
  grantingLine?: number;
  // 授信有效期开始时间(yyyy-MM-dd HH:mm:ss)
  effectStartTime?: string;
  // 授信有效期结束时间(yyyy-MM-dd HH:mm:ss)
  effectEndTime?: string;
  // 授信状态
  // CREDITED:已授信
  status?: string;
  // 授信业务
  bizType?: string;
  // 授信额外数据
  creditExtraData?: string;
  // 相关文件列表
  creditInfoList?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      grantingId: 'granting_id',
      authId: 'auth_id',
      fundId: 'fund_id',
      merchantId: 'merchant_id',
      tenantId: 'tenant_id',
      grantingLine: 'granting_line',
      effectStartTime: 'effect_start_time',
      effectEndTime: 'effect_end_time',
      status: 'status',
      bizType: 'biz_type',
      creditExtraData: 'credit_extra_data',
      creditInfoList: 'credit_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      grantingId: 'string',
      authId: 'string',
      fundId: 'string',
      merchantId: 'string',
      tenantId: 'string',
      grantingLine: 'number',
      effectStartTime: 'string',
      effectEndTime: 'string',
      status: 'string',
      bizType: 'string',
      creditExtraData: 'string',
      creditInfoList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoFundCreditauthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资方社会引用代码
  fundId: string;
  // 授权id
  authId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fundId: 'fund_id',
      authId: 'auth_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fundId: 'string',
      authId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoFundCreditauthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授权id
  authId?: string;
  // 授权类型
  // ● CREDIT_GRANTING 授信
  // ● CREDIT_UTILIZATION 用信
  authType?: string;
  // 授权结果
  // AUTHORIZED 已同意
  // REJECTED 已拒绝
  // EXPIRED 已过期
  authResult?: string;
  // 授权开始时间
  authBeginTime?: string;
  // 授权结束时间
  authEndTime?: string;
  // 授权申请过期时间
  authApplyExpireTime?: string;
  // 授信/用信授权信息,json结构
  authInfo?: string;
  // merchant_id
  merchantId?: string;
  // fund_id
  fundId?: string;
  // json字符串
  authContract?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      authId: 'auth_id',
      authType: 'auth_type',
      authResult: 'auth_result',
      authBeginTime: 'auth_begin_time',
      authEndTime: 'auth_end_time',
      authApplyExpireTime: 'auth_apply_expire_time',
      authInfo: 'auth_info',
      merchantId: 'merchant_id',
      fundId: 'fund_id',
      authContract: 'auth_contract',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      authId: 'string',
      authType: 'string',
      authResult: 'string',
      authBeginTime: 'string',
      authEndTime: 'string',
      authApplyExpireTime: 'string',
      authInfo: 'string',
      merchantId: 'string',
      fundId: 'string',
      authContract: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoFundAssetpackageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资方社会信用代码
  fundId: string;
  // 商家统一社会信用代码
  merchantId: string;
  // 商户的租户id
  tenantId: string;
  // 用信id
  utilizationId?: string;
  // 资产包id
  assetPackageId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fundId: 'fund_id',
      merchantId: 'merchant_id',
      tenantId: 'tenant_id',
      utilizationId: 'utilization_id',
      assetPackageId: 'asset_package_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fundId: 'string',
      merchantId: 'string',
      tenantId: 'string',
      utilizationId: 'string',
      assetPackageId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoFundAssetpackageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 资产包id
  assetPackageId?: string;
  // 用信id
  utilizationId?: string;
  // 资产包状态
  status?: string;
  // 组包完成时间， yyyy-MM-dd HH:mm:ss
  gmtGroupingEnd?: string;
  // 订单列表
  orderList?: AssetPackageOrderInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      assetPackageId: 'asset_package_id',
      utilizationId: 'utilization_id',
      status: 'status',
      gmtGroupingEnd: 'gmt_grouping_end',
      orderList: 'order_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      assetPackageId: 'string',
      utilizationId: 'string',
      status: 'string',
      gmtGroupingEnd: 'string',
      orderList: { 'type': 'array', 'itemType': AssetPackageOrderInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RepayAntchainAtoFundPlanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 长度不可超过50
  orderId: string;
  // 订单所属商户的社会信用代码
  merchantId: string;
  // 融资单的资方社会信用代码
  fundId: string;
  // 商户履约的期数
  termIndex: number;
  // 还款金额
  amount: number;
  // 支付描述
  paymentDescription: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      fundId: 'fund_id',
      termIndex: 'term_index',
      amount: 'amount',
      paymentDescription: 'payment_description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
      fundId: 'string',
      termIndex: 'number',
      amount: 'number',
      paymentDescription: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RepayAntchainAtoFundPlanResponse extends $tea.Model {
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

export class GetAntchainAtoFundCompensatesignurlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  //  资方社会统一信用代码
  fundId: string;
  // 商户租户id
  merchantTenantId: string;
  // 商户社会统一信用代码
  merchantId: string;
  // 签约串类型
  // TRANSFER:转账代偿签约串
  // WITHHOLD:代扣代偿签约串
  type: string;
  // 支付宝uid
  alipayUid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fundId: 'fund_id',
      merchantTenantId: 'merchant_tenant_id',
      merchantId: 'merchant_id',
      type: 'type',
      alipayUid: 'alipay_uid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fundId: 'string',
      merchantTenantId: 'string',
      merchantId: 'string',
      type: 'string',
      alipayUid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntchainAtoFundCompensatesignurlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签约链接
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

export class ConfirmAntchainAtoFundCompensateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资方社会统一信用代码
  fundId: string;
  // 商户租户id
  merchantTenantId: string;
  // 商户社会统一信用代码
  merchantId: string;
  // 签约串类型 
  // TRANSFER:转账代偿签约串 
  // WITHHOLD:代扣代偿签约串
  type?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fundId: 'fund_id',
      merchantTenantId: 'merchant_tenant_id',
      merchantId: 'merchant_id',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fundId: 'string',
      merchantTenantId: 'string',
      merchantId: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmAntchainAtoFundCompensateResponse extends $tea.Model {
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

export class RetryAntchainAtoWithholdPlanpendingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 第几期
  periodNum: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      periodNum: 'period_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      periodNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryAntchainAtoWithholdPlanpendingResponse extends $tea.Model {
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

export class RetryAntchainAtoWithholdDividependingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 第几期
  periodNum: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      periodNum: 'period_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      periodNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetryAntchainAtoWithholdDividependingResponse extends $tea.Model {
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

export class SyncAntchainAtoTradePromoorderinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户社会信用代码
  merchantId: string;
  // 订单id
  orderId: string;
  // 营销id
  promotionId: string;
  // 订单创建时间
  orderCreateTime: string;
  // 买断价，单位为分
  buyOutPrice: number;
  // 代扣履约总金额，单位为分
  orderPromiseTotalMoney: number;
  // 商户公司的名字
  merchantName: string;
  // verification_token
  verificationToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantId: 'merchant_id',
      orderId: 'order_id',
      promotionId: 'promotion_id',
      orderCreateTime: 'order_create_time',
      buyOutPrice: 'buy_out_price',
      orderPromiseTotalMoney: 'order_promise_total_money',
      merchantName: 'merchant_name',
      verificationToken: 'verification_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantId: 'string',
      orderId: 'string',
      promotionId: 'string',
      orderCreateTime: 'string',
      buyOutPrice: 'number',
      orderPromiseTotalMoney: 'number',
      merchantName: 'string',
      verificationToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoTradePromoorderinfoResponse extends $tea.Model {
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

export class BindAntchainAtoMerchantexpandSettlecardRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 社会统一信用代码
  merchantId: string;
  // 银行卡号
  accountNo: string;
  // 银行账户名称
  accountName: string;
  // 开户行所在省
  bankProvince: string;
  // 开户行所在地-市
  bankCity: string;
  // 账号使用类型
  // 对公: 01
  // 对私: 02
  usageType: string;
  // 卡类型
  // 借记卡: DC
  // 信用卡: CC
  accountType: string;
  // 开户支行名
  bankBranchName: string;
  // 银行名称
  bankName: string;
  // 开户行简称缩写
  bankInstId: string;
  // 联行号
  bankCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantId: 'merchant_id',
      accountNo: 'account_no',
      accountName: 'account_name',
      bankProvince: 'bank_province',
      bankCity: 'bank_city',
      usageType: 'usage_type',
      accountType: 'account_type',
      bankBranchName: 'bank_branch_name',
      bankName: 'bank_name',
      bankInstId: 'bank_inst_id',
      bankCode: 'bank_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantId: 'string',
      accountNo: 'string',
      accountName: 'string',
      bankProvince: 'string',
      bankCity: 'string',
      usageType: 'string',
      accountType: 'string',
      bankBranchName: 'string',
      bankName: 'string',
      bankInstId: 'string',
      bankCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindAntchainAtoMerchantexpandSettlecardResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 流水号
  payExpandId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      payExpandId: 'pay_expand_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      payExpandId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoTradeReceiptorderfullinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 商户社会信用代码
  merchantId: string;
  // 商户公司名字
  merchantName: string;
  // 场景码
  bizScene: string;
  // 业务类型
  bizType: string;
  // 主订单信息，资产订单定义
  receiptOrderInfo: string;
  // 订单包含的商品信息
  productInfo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      merchantName: 'merchant_name',
      bizScene: 'biz_scene',
      bizType: 'biz_type',
      receiptOrderInfo: 'receipt_order_info',
      productInfo: 'product_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
      merchantName: 'string',
      bizScene: 'string',
      bizType: 'string',
      receiptOrderInfo: 'string',
      productInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoTradeReceiptorderfullinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回字符串
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

export class GetAntchainAtoTradeOrderfullinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // merchant_id
  merchantId: string;
  // 订单业务类型
  bizType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      bizType: 'biz_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
      bizType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntchainAtoTradeOrderfullinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回对象
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

export class SubmitAntchainAtoFundFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户租户id
  tenantId: string;
  // 订单id
  orderId: string;
  // 商户id
  merchantId: string;
  // 商家签署tag
  merchantSignTag: string;
  // 资方id
  fundId: string;
  // 资方签署tag
  fundSignTag: string;
  // 资方是否自动签署
  fundAutoSign?: boolean;
  // 模板参数列表，需要传入模板id和对应的渲染参数，如果有多个文件则传入多个值
  templateList: TemplateArgs[];
  // xxx合同
  businessScene: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      merchantSignTag: 'merchant_sign_tag',
      fundId: 'fund_id',
      fundSignTag: 'fund_sign_tag',
      fundAutoSign: 'fund_auto_sign',
      templateList: 'template_list',
      businessScene: 'business_scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      orderId: 'string',
      merchantId: 'string',
      merchantSignTag: 'string',
      fundId: 'string',
      fundSignTag: 'string',
      fundAutoSign: 'boolean',
      templateList: { 'type': 'array', 'itemType': TemplateArgs },
      businessScene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitAntchainAtoFundFlowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签署编号
  signNo?: string;
  // 签署信息，包括短链接、长链接、小程序链接等。
  signInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      signNo: 'sign_no',
      signInfo: 'sign_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      signNo: 'string',
      signInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelAntchainAtoFundFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 签署合同单号
  signNo: string;
  // 资方统一社会信用代码
  fundId: string;
  // 撤销原因
  revokeReason?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      signNo: 'sign_no',
      fundId: 'fund_id',
      revokeReason: 'revoke_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      signNo: 'string',
      fundId: 'string',
      revokeReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelAntchainAtoFundFlowResponse extends $tea.Model {
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

export class SyncAntchainAtoFundFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 商户统一社会信用代码
  merchantId: string;
  // 资方统一社会信用代码
  fundId: string;
  // 电子签署流程ID, 业务方唯一id，每一个签署流程唯一确定一个flowId
  flowId: string;
  // 合同待签署url
  signUrl: string;
  // 合同类型
  // TRANSFER(传授信合同)、AUTHORIZATION(授权函)、CREDIT_UTILIZATION(用信合同)、OTHER(其他)
  contractType: string;
  // 合同名称，资方可自行命名，传授信合同/征信授权函/保理合同/其他
  contractName: string;
  // json格式 拓展信息 由资方自行推送补充内容，例如签署最晚时间、签署要求等
  extendInfo: string;
  // 商户租户id
  tenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantId: 'merchant_id',
      fundId: 'fund_id',
      flowId: 'flow_id',
      signUrl: 'sign_url',
      contractType: 'contract_type',
      contractName: 'contract_name',
      extendInfo: 'extend_info',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantId: 'string',
      fundId: 'string',
      flowId: 'string',
      signUrl: 'string',
      contractType: 'string',
      contractName: 'string',
      extendInfo: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoFundFlowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签署的电子合同ID
  signNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      signNo: 'sign_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      signNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SignAntchainAtoFundFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 资方统一社会信用代码
  fundId: string;
  // 合同待签署url
  signDocUrl?: string;
  // 签署状态 FINISH-已签署 UNDO-作废
  signStatus: string;
  // 签约id
  signNo: string;
  // 商户租户id
  tenantId: string;
  // 文件名 非必填，sign_doc_url传了，此字段必传
  contractName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      fundId: 'fund_id',
      signDocUrl: 'sign_doc_url',
      signStatus: 'sign_status',
      signNo: 'sign_no',
      tenantId: 'tenant_id',
      contractName: 'contract_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      fundId: 'string',
      signDocUrl: 'string',
      signStatus: 'string',
      signNo: 'string',
      tenantId: 'string',
      contractName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SignAntchainAtoFundFlowResponse extends $tea.Model {
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

export class ApplyAntchainAtoTradeCreditgrantingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授信id
  grantingId: string;
  // merchant_id
  merchantId: string;
  // merchant_name
  merchantName: string;
  // fund_id
  fundId: string;
  // auth_id
  authId: string;
  // 授信附加信息
  creditExtraData?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      grantingId: 'granting_id',
      merchantId: 'merchant_id',
      merchantName: 'merchant_name',
      fundId: 'fund_id',
      authId: 'auth_id',
      creditExtraData: 'credit_extra_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      grantingId: 'string',
      merchantId: 'string',
      merchantName: 'string',
      fundId: 'string',
      authId: 'string',
      creditExtraData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyAntchainAtoTradeCreditgrantingResponse extends $tea.Model {
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

export class QueryAntchainAtoTradeCreditgrantingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // granting_id
  grantingId: string;
  // merchant_id
  merchantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      grantingId: 'granting_id',
      merchantId: 'merchant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      grantingId: 'string',
      merchantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoTradeCreditgrantingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // CreditGrantingInfo
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

export class AuthAntchainAtoTradeCreditgrantingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // merchant_id
  merchantId: string;
  // fund_id
  fundId: string;
  // auth_id
  authId: string;
  // apply_role
  applyRole: string;
  // auth_sign_type
  authSignType: string;
  // auth_begin_date
  // 授权开始时间
  // yyyy-MM-dd HH:mm:ss
  // 非空，不可早于当前时间
  // 为空，设置为当前时间
  authBeginDate?: string;
  // 授权结束时间
  // yyyy-MM-dd HH:mm:ss
  // 非空，不可早于authBeginDate
  authEndDate?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantId: 'merchant_id',
      fundId: 'fund_id',
      authId: 'auth_id',
      applyRole: 'apply_role',
      authSignType: 'auth_sign_type',
      authBeginDate: 'auth_begin_date',
      authEndDate: 'auth_end_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantId: 'string',
      fundId: 'string',
      authId: 'string',
      applyRole: 'string',
      authSignType: 'string',
      authBeginDate: 'string',
      authEndDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthAntchainAtoTradeCreditgrantingResponse extends $tea.Model {
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

export class QueryAntchainAtoTradeCreditauthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // merchant_id
  merchantId: string;
  // auth_id
  authId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantId: 'merchant_id',
      authId: 'auth_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantId: 'string',
      authId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoTradeCreditauthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授权id
  authId?: string;
  // 商户统一社会信用代码
  merchantId?: string;
  // 资方统一社会信用代码
  fundId?: string;
  // 授权类型
  authType?: string;
  // 授权结果
  authResult?: string;
  // 授权开始时间
  authBeginTime?: string;
  // 授权结束时间
  authEndTime?: string;
  // 授权申请过期时间
  authApplyExpireTime?: string;
  // 授权信息
  authInfo?: string;
  // 合同信息
  authContract?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      authId: 'auth_id',
      merchantId: 'merchant_id',
      fundId: 'fund_id',
      authType: 'auth_type',
      authResult: 'auth_result',
      authBeginTime: 'auth_begin_time',
      authEndTime: 'auth_end_time',
      authApplyExpireTime: 'auth_apply_expire_time',
      authInfo: 'auth_info',
      authContract: 'auth_contract',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      authId: 'string',
      merchantId: 'string',
      fundId: 'string',
      authType: 'string',
      authResult: 'string',
      authBeginTime: 'string',
      authEndTime: 'string',
      authApplyExpireTime: 'string',
      authInfo: 'string',
      authContract: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntchainAtoSignFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户协议
  signFlowTitle: string;
  // 签署有效期毫秒时间戳，不传默认7天有效期
  signValidity?: number;
  // 签署完成后的跳转链接
  redirectUrl?: string;
  // 业务id，可以是订单id或其他业务id
  businessId: string;
  // 签署业务场景
  businessScene: string;
  // 签署人列表
  signAccountList: SignAccount[];
  // 签署模板列表
  templateInfoList: TemplateInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      signFlowTitle: 'sign_flow_title',
      signValidity: 'sign_validity',
      redirectUrl: 'redirect_url',
      businessId: 'business_id',
      businessScene: 'business_scene',
      signAccountList: 'sign_account_list',
      templateInfoList: 'template_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      signFlowTitle: 'string',
      signValidity: 'number',
      redirectUrl: 'string',
      businessId: 'string',
      businessScene: 'string',
      signAccountList: { 'type': 'array', 'itemType': SignAccount },
      templateInfoList: { 'type': 'array', 'itemType': TemplateInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntchainAtoSignFlowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 合同签署编号，作为合同查询的依据
  signNo?: string;
  // 签署链接结果
  signUrlResult?: SignUrlResult;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      signNo: 'sign_no',
      signUrlResult: 'sign_url_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      signNo: 'string',
      signUrlResult: SignUrlResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitAntchainAtoFundAlipaysettletocardRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 统一社会信用代码
  merchantId: string;
  // 支付渠道: ALIPAY-支付宝支付 JDPAY-京东支付
  payChannel: string;
  // 京东二级商户号,当pay_channel=JDPAY时，该字段必填
  subMerchantId?: string;
  // 账单开始日期, 格式：YYYY-MM-DD
  gmtPlan: string;
  // 账单结束日期；格式：YYYY-MM-DD
  gmtFinish: string;
  // 交易流水:SETTLE
  billType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantId: 'merchant_id',
      payChannel: 'pay_channel',
      subMerchantId: 'sub_merchant_id',
      gmtPlan: 'gmt_plan',
      gmtFinish: 'gmt_finish',
      billType: 'bill_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantId: 'string',
      payChannel: 'string',
      subMerchantId: 'string',
      gmtPlan: 'string',
      gmtFinish: 'string',
      billType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitAntchainAtoFundAlipaysettletocardResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务id
  taskId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoFundAlipaysettletocardRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 统一社会信用代码
  merchantId: string;
  // 任务id
  taskId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantId: 'merchant_id',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantId: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoFundAlipaysettletocardResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 账单下载地址
  downloadUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      downloadUrl: 'download_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      downloadUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitAntchainAtoTradeSettletocardRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 统一社会信用代码
  merchantId: string;
  // 支付渠道: ALIPAY-支付宝支付 JDPAY-京东支付
  payChannel: string;
  // 京东二级商户号,当pay_channel=JDPAY时，该字段必填
  subMerchantId?: string;
  // 账单开始日期, 格式：YYYY-MM-DD
  gmtPlan: string;
  // 账单结束日期；格式：YYYY-MM-DD
  gmtFinish: string;
  // 交易流水:TRADE,结算流水:SETTLE
  billType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantId: 'merchant_id',
      payChannel: 'pay_channel',
      subMerchantId: 'sub_merchant_id',
      gmtPlan: 'gmt_plan',
      gmtFinish: 'gmt_finish',
      billType: 'bill_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantId: 'string',
      payChannel: 'string',
      subMerchantId: 'string',
      gmtPlan: 'string',
      gmtFinish: 'string',
      billType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitAntchainAtoTradeSettletocardResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务id
  taskId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoTradeSettletocardRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 统一社会信用代码
  merchantId: string;
  // 任务id
  taskId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantId: 'merchant_id',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantId: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoTradeSettletocardResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 账单下载地址
  downloadUrl?: string;
  // 任务状态：FINISH(成功)、FAILURE(失败)、查询中(EXEC)
  taskStatus?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      downloadUrl: 'download_url',
      taskStatus: 'task_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      downloadUrl: 'string',
      taskStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAntchainAtoFundPlanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 长度不可超过50
  orderId: string;
  // 资方社会统一信用代码
  fundId: string;
  // 商户社会统一信用代码
  merchantId: string;
  // 商户履约的期数
  termIndex: number;
  // 签约串类型 
  // TRANSFER:转账代偿签约串 
  // WITHHOLD:代扣代偿签约串
  retryType: string;
  // 支付类型：
  // ● PERFORMANCE:正常履约
  // ● EXCESS：超额
  payType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      fundId: 'fund_id',
      merchantId: 'merchant_id',
      termIndex: 'term_index',
      retryType: 'retry_type',
      payType: 'pay_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      fundId: 'string',
      merchantId: 'string',
      termIndex: 'number',
      retryType: 'string',
      payType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAntchainAtoFundPlanResponse extends $tea.Model {
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

export class CreateAntcloudGatewayxFileUploadRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 产品方的api归属集群，即productInstanceId
  apiCluster?: string;
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
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      apiCluster: 'api_cluster',
      apiCode: 'api_code',
      fileLabel: 'file_label',
      fileMetadata: 'file_metadata',
      fileName: 'file_name',
      mimeType: 'mime_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      apiCluster: 'string',
      apiCode: 'string',
      fileLabel: 'string',
      fileMetadata: 'string',
      fileName: 'string',
      mimeType: 'string',
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
  uploadHeaders?: NameValuePair[];
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
      uploadHeaders: { 'type': 'array', 'itemType': NameValuePair },
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
          sdk_version: "1.8.8",
          _prod_code: "ak_195dff03d395462ea294bafdba69df3f",
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
   * @remarks
   * Description: 对账saas交易信息同步接口
   * Summary: 对账saas交易信息同步接口
   */
  async syncAntchainAtoTrade(request: SyncAntchainAtoTradeRequest): Promise<SyncAntchainAtoTradeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncAntchainAtoTradeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 对账saas交易信息同步接口
   * Summary: 对账saas交易信息同步接口
   */
  async syncAntchainAtoTradeEx(request: SyncAntchainAtoTradeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncAntchainAtoTradeResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncAntchainAtoTradeResponse>(await this.doRequest("1.0", "antchain.ato.trade.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncAntchainAtoTradeResponse({}));
  }

  /**
   * @remarks
   * Description: 获取详情
   * Summary: 获取详情
   */
  async getAntchainAtoTrade(request: GetAntchainAtoTradeRequest): Promise<GetAntchainAtoTradeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAntchainAtoTradeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 获取详情
   * Summary: 获取详情
   */
  async getAntchainAtoTradeEx(request: GetAntchainAtoTradeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAntchainAtoTradeResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAntchainAtoTradeResponse>(await this.doRequest("1.0", "antchain.ato.trade.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAntchainAtoTradeResponse({}));
  }

  /**
   * @remarks
   * Description: 可信身份认证，创建认证
   * Summary: 创建认证
   */
  async createAntchainAtoRealpersonFacevrf(request: CreateAntchainAtoRealpersonFacevrfRequest): Promise<CreateAntchainAtoRealpersonFacevrfResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAntchainAtoRealpersonFacevrfEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 可信身份认证，创建认证
   * Summary: 创建认证
   */
  async createAntchainAtoRealpersonFacevrfEx(request: CreateAntchainAtoRealpersonFacevrfRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAntchainAtoRealpersonFacevrfResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAntchainAtoRealpersonFacevrfResponse>(await this.doRequest("1.0", "antchain.ato.realperson.facevrf.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAntchainAtoRealpersonFacevrfResponse({}));
  }

  /**
   * @remarks
   * Description: 查询认证的结果和相关信息
   * Summary: 查询认证结果
   */
  async queryAntchainAtoRealpersonFacevrf(request: QueryAntchainAtoRealpersonFacevrfRequest): Promise<QueryAntchainAtoRealpersonFacevrfResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainAtoRealpersonFacevrfEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询认证的结果和相关信息
   * Summary: 查询认证结果
   */
  async queryAntchainAtoRealpersonFacevrfEx(request: QueryAntchainAtoRealpersonFacevrfRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainAtoRealpersonFacevrfResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainAtoRealpersonFacevrfResponse>(await this.doRequest("1.0", "antchain.ato.realperson.facevrf.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainAtoRealpersonFacevrfResponse({}));
  }

  /**
   * @remarks
   * Description: 电子合同签署的合同模板查询服务
   * Summary: 电子合同签署的合同模板查询服务
   */
  async allAntchainAtoSignTemplate(request: AllAntchainAtoSignTemplateRequest): Promise<AllAntchainAtoSignTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allAntchainAtoSignTemplateEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 电子合同签署的合同模板查询服务
   * Summary: 电子合同签署的合同模板查询服务
   */
  async allAntchainAtoSignTemplateEx(request: AllAntchainAtoSignTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllAntchainAtoSignTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<AllAntchainAtoSignTemplateResponse>(await this.doRequest("1.0", "antchain.ato.sign.template.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllAntchainAtoSignTemplateResponse({}));
  }

  /**
   * @remarks
   * Description: 提交电子合同的签署流程(后置签署模式)
   * Summary: 提交电子合同的签署流程（后置签署模式）
   */
  async submitAntchainAtoSignFlow(request: SubmitAntchainAtoSignFlowRequest): Promise<SubmitAntchainAtoSignFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitAntchainAtoSignFlowEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 提交电子合同的签署流程(后置签署模式)
   * Summary: 提交电子合同的签署流程（后置签署模式）
   */
  async submitAntchainAtoSignFlowEx(request: SubmitAntchainAtoSignFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitAntchainAtoSignFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitAntchainAtoSignFlowResponse>(await this.doRequest("1.0", "antchain.ato.sign.flow.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitAntchainAtoSignFlowResponse({}));
  }

  /**
   * @remarks
   * Description: 查询签署流程详情
   * Summary: 查询签署流程详情
   */
  async getAntchainAtoSignFlow(request: GetAntchainAtoSignFlowRequest): Promise<GetAntchainAtoSignFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAntchainAtoSignFlowEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询签署流程详情
   * Summary: 查询签署流程详情
   */
  async getAntchainAtoSignFlowEx(request: GetAntchainAtoSignFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAntchainAtoSignFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAntchainAtoSignFlowResponse>(await this.doRequest("1.0", "antchain.ato.sign.flow.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAntchainAtoSignFlowResponse({}));
  }

  /**
   * @remarks
   * Description: 代扣签约创建
   * Summary: 代扣签约
   */
  async createAntchainAtoWithholdSign(request: CreateAntchainAtoWithholdSignRequest): Promise<CreateAntchainAtoWithholdSignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAntchainAtoWithholdSignEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 代扣签约创建
   * Summary: 代扣签约
   */
  async createAntchainAtoWithholdSignEx(request: CreateAntchainAtoWithholdSignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAntchainAtoWithholdSignResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAntchainAtoWithholdSignResponse>(await this.doRequest("1.0", "antchain.ato.withhold.sign.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAntchainAtoWithholdSignResponse({}));
  }

  /**
   * @remarks
   * Description: 代扣签约查询
   * Summary: 代扣签约查询
   */
  async queryAntchainAtoWithholdSign(request: QueryAntchainAtoWithholdSignRequest): Promise<QueryAntchainAtoWithholdSignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainAtoWithholdSignEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 代扣签约查询
   * Summary: 代扣签约查询
   */
  async queryAntchainAtoWithholdSignEx(request: QueryAntchainAtoWithholdSignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainAtoWithholdSignResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainAtoWithholdSignResponse>(await this.doRequest("1.0", "antchain.ato.withhold.sign.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainAtoWithholdSignResponse({}));
  }

  /**
   * @remarks
   * Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
   * Summary: 电子合同签署模块，机构调用这个接口进行签署的授权落签
   */
  async authAntchainAtoSignFlow(request: AuthAntchainAtoSignFlowRequest): Promise<AuthAntchainAtoSignFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authAntchainAtoSignFlowEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
   * Summary: 电子合同签署模块，机构调用这个接口进行签署的授权落签
   */
  async authAntchainAtoSignFlowEx(request: AuthAntchainAtoSignFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthAntchainAtoSignFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthAntchainAtoSignFlowResponse>(await this.doRequest("1.0", "antchain.ato.sign.flow.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthAntchainAtoSignFlowResponse({}));
  }

  /**
   * @remarks
   * Description: 订单关闭后,可以通过此接口解绑签约
   * Summary: 代扣签约解绑
   */
  async unbindAntchainAtoWithholdSign(request: UnbindAntchainAtoWithholdSignRequest): Promise<UnbindAntchainAtoWithholdSignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.unbindAntchainAtoWithholdSignEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 订单关闭后,可以通过此接口解绑签约
   * Summary: 代扣签约解绑
   */
  async unbindAntchainAtoWithholdSignEx(request: UnbindAntchainAtoWithholdSignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UnbindAntchainAtoWithholdSignResponse> {
    Util.validateModel(request);
    return $tea.cast<UnbindAntchainAtoWithholdSignResponse>(await this.doRequest("1.0", "antchain.ato.withhold.sign.unbind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UnbindAntchainAtoWithholdSignResponse({}));
  }

  /**
   * @remarks
   * Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
   * Summary: 取消代扣计划
   */
  async cancelAntchainAtoWithholdPlan(request: CancelAntchainAtoWithholdPlanRequest): Promise<CancelAntchainAtoWithholdPlanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelAntchainAtoWithholdPlanEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
   * Summary: 取消代扣计划
   */
  async cancelAntchainAtoWithholdPlanEx(request: CancelAntchainAtoWithholdPlanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelAntchainAtoWithholdPlanResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelAntchainAtoWithholdPlanResponse>(await this.doRequest("1.0", "antchain.ato.withhold.plan.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelAntchainAtoWithholdPlanResponse({}));
  }

  /**
   * @remarks
   * Description: 重要说明：
   * 1.这个接口是取消订单某一、多期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
   * 2.对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
   * Summary: 重要说明：
   * 1.这个接口是取消订单某一、多期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
   * 2.对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
   */
  async repayAntchainAtoWithholdPlan(request: RepayAntchainAtoWithholdPlanRequest): Promise<RepayAntchainAtoWithholdPlanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.repayAntchainAtoWithholdPlanEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 重要说明：
   * 1.这个接口是取消订单某一、多期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
   * 2.对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
   * Summary: 重要说明：
   * 1.这个接口是取消订单某一、多期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
   * 2.对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
   */
  async repayAntchainAtoWithholdPlanEx(request: RepayAntchainAtoWithholdPlanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RepayAntchainAtoWithholdPlanResponse> {
    Util.validateModel(request);
    return $tea.cast<RepayAntchainAtoWithholdPlanResponse>(await this.doRequest("1.0", "antchain.ato.withhold.plan.repay", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RepayAntchainAtoWithholdPlanResponse({}));
  }

  /**
   * @remarks
   * Description: 提交前置签署的电子合同签署流程（前置签署模式）
   * Summary: 提交签署的电子合同签署流程（前置签署）
   */
  async submitAntchainAtoFrontSign(request: SubmitAntchainAtoFrontSignRequest): Promise<SubmitAntchainAtoFrontSignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitAntchainAtoFrontSignEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 提交前置签署的电子合同签署流程（前置签署模式）
   * Summary: 提交签署的电子合同签署流程（前置签署）
   */
  async submitAntchainAtoFrontSignEx(request: SubmitAntchainAtoFrontSignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitAntchainAtoFrontSignResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitAntchainAtoFrontSignResponse>(await this.doRequest("1.0", "antchain.ato.front.sign.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitAntchainAtoFrontSignResponse({}));
  }

  /**
   * @remarks
   * Description: 订单创建，前置签署
   * Summary: 前置签署订单创建
   */
  async syncAntchainAtoFrontTrade(request: SyncAntchainAtoFrontTradeRequest): Promise<SyncAntchainAtoFrontTradeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncAntchainAtoFrontTradeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 订单创建，前置签署
   * Summary: 前置签署订单创建
   */
  async syncAntchainAtoFrontTradeEx(request: SyncAntchainAtoFrontTradeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncAntchainAtoFrontTradeResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncAntchainAtoFrontTradeResponse>(await this.doRequest("1.0", "antchain.ato.front.trade.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncAntchainAtoFrontTradeResponse({}));
  }

  /**
   * @remarks
   * Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
   * Summary: 扣款计划重试
   */
  async retryAntchainAtoWithholdPlan(request: RetryAntchainAtoWithholdPlanRequest): Promise<RetryAntchainAtoWithholdPlanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryAntchainAtoWithholdPlanEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
   * Summary: 扣款计划重试
   */
  async retryAntchainAtoWithholdPlanEx(request: RetryAntchainAtoWithholdPlanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryAntchainAtoWithholdPlanResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryAntchainAtoWithholdPlanResponse>(await this.doRequest("1.0", "antchain.ato.withhold.plan.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryAntchainAtoWithholdPlanResponse({}));
  }

  /**
   * @remarks
   * Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
   * Summary: 代扣签约的异步解约确认
   */
  async confirmAntchainAtoWithholdSignasyncunsign(request: ConfirmAntchainAtoWithholdSignasyncunsignRequest): Promise<ConfirmAntchainAtoWithholdSignasyncunsignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmAntchainAtoWithholdSignasyncunsignEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
   * Summary: 代扣签约的异步解约确认
   */
  async confirmAntchainAtoWithholdSignasyncunsignEx(request: ConfirmAntchainAtoWithholdSignasyncunsignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmAntchainAtoWithholdSignasyncunsignResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmAntchainAtoWithholdSignasyncunsignResponse>(await this.doRequest("1.0", "antchain.ato.withhold.signasyncunsign.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmAntchainAtoWithholdSignasyncunsignResponse({}));
  }

  /**
   * @remarks
   * Description: 用于资方将盖章后的合同文件上传
   * Summary: 资方合同文件上传接口
   */
  async uploadAntchainAtoFundFlow(request: UploadAntchainAtoFundFlowRequest): Promise<UploadAntchainAtoFundFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadAntchainAtoFundFlowEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 用于资方将盖章后的合同文件上传
   * Summary: 资方合同文件上传接口
   */
  async uploadAntchainAtoFundFlowEx(request: UploadAntchainAtoFundFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadAntchainAtoFundFlowResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.ato.fund.flow.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadAntchainAtoFundFlowResponse = new UploadAntchainAtoFundFlowResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadAntchainAtoFundFlowResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<UploadAntchainAtoFundFlowResponse>(await this.doRequest("1.0", "antchain.ato.fund.flow.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadAntchainAtoFundFlowResponse({}));
  }

  /**
   * @remarks
   * Description: 获取商户签署后的合同文件，用于资方签署落章
   * Summary: 资方合同文件获取接口
   */
  async getAntchainAtoFundFlow(request: GetAntchainAtoFundFlowRequest): Promise<GetAntchainAtoFundFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAntchainAtoFundFlowEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 获取商户签署后的合同文件，用于资方签署落章
   * Summary: 资方合同文件获取接口
   */
  async getAntchainAtoFundFlowEx(request: GetAntchainAtoFundFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAntchainAtoFundFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAntchainAtoFundFlowResponse>(await this.doRequest("1.0", "antchain.ato.fund.flow.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAntchainAtoFundFlowResponse({}));
  }

  /**
   * @remarks
   * Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
   * Summary: 资方合同签署状态通知
   */
  async refuseAntchainAtoFundFlow(request: RefuseAntchainAtoFundFlowRequest): Promise<RefuseAntchainAtoFundFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.refuseAntchainAtoFundFlowEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
   * Summary: 资方合同签署状态通知
   */
  async refuseAntchainAtoFundFlowEx(request: RefuseAntchainAtoFundFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RefuseAntchainAtoFundFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<RefuseAntchainAtoFundFlowResponse>(await this.doRequest("1.0", "antchain.ato.fund.flow.refuse", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RefuseAntchainAtoFundFlowResponse({}));
  }

  /**
   * @remarks
   * Description: 资方合同落签
   * Summary: 资方合同落签
   */
  async authAntchainAtoFundFlow(request: AuthAntchainAtoFundFlowRequest): Promise<AuthAntchainAtoFundFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authAntchainAtoFundFlowEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 资方合同落签
   * Summary: 资方合同落签
   */
  async authAntchainAtoFundFlowEx(request: AuthAntchainAtoFundFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthAntchainAtoFundFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthAntchainAtoFundFlowResponse>(await this.doRequest("1.0", "antchain.ato.fund.flow.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthAntchainAtoFundFlowResponse({}));
  }

  /**
   * @remarks
   * Description: 主动支付创建
   * Summary: 主动支付创建
   */
  async createAntchainAtoWithholdActivepay(request: CreateAntchainAtoWithholdActivepayRequest): Promise<CreateAntchainAtoWithholdActivepayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAntchainAtoWithholdActivepayEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 主动支付创建
   * Summary: 主动支付创建
   */
  async createAntchainAtoWithholdActivepayEx(request: CreateAntchainAtoWithholdActivepayRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAntchainAtoWithholdActivepayResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAntchainAtoWithholdActivepayResponse>(await this.doRequest("1.0", "antchain.ato.withhold.activepay.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAntchainAtoWithholdActivepayResponse({}));
  }

  /**
   * @remarks
   * Description: 主动支付查询
   * Summary: 主动支付查询
   */
  async queryAntchainAtoWithholdActivepay(request: QueryAntchainAtoWithholdActivepayRequest): Promise<QueryAntchainAtoWithholdActivepayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainAtoWithholdActivepayEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 主动支付查询
   * Summary: 主动支付查询
   */
  async queryAntchainAtoWithholdActivepayEx(request: QueryAntchainAtoWithholdActivepayRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainAtoWithholdActivepayResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainAtoWithholdActivepayResponse>(await this.doRequest("1.0", "antchain.ato.withhold.activepay.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainAtoWithholdActivepayResponse({}));
  }

  /**
   * @remarks
   * Description: 主动支付取消
   * Summary: 主动支付取消
   */
  async cancelAntchainAtoWithholdActivepay(request: CancelAntchainAtoWithholdActivepayRequest): Promise<CancelAntchainAtoWithholdActivepayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelAntchainAtoWithholdActivepayEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 主动支付取消
   * Summary: 主动支付取消
   */
  async cancelAntchainAtoWithholdActivepayEx(request: CancelAntchainAtoWithholdActivepayRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelAntchainAtoWithholdActivepayResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelAntchainAtoWithholdActivepayResponse>(await this.doRequest("1.0", "antchain.ato.withhold.activepay.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelAntchainAtoWithholdActivepayResponse({}));
  }

  /**
   * @remarks
   * Description: 资方调用，取消商户履约计划
   * Summary: 商户履约计划取消
   */
  async cancelAntchainAtoFundPlan(request: CancelAntchainAtoFundPlanRequest): Promise<CancelAntchainAtoFundPlanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelAntchainAtoFundPlanEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 资方调用，取消商户履约计划
   * Summary: 商户履约计划取消
   */
  async cancelAntchainAtoFundPlanEx(request: CancelAntchainAtoFundPlanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelAntchainAtoFundPlanResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelAntchainAtoFundPlanResponse>(await this.doRequest("1.0", "antchain.ato.fund.plan.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelAntchainAtoFundPlanResponse({}));
  }

  /**
   * @remarks
   * Description: 通知回调
   * Summary: 通知回调
   */
  async callbackAntchainAtoFundNotify(request: CallbackAntchainAtoFundNotifyRequest): Promise<CallbackAntchainAtoFundNotifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackAntchainAtoFundNotifyEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 通知回调
   * Summary: 通知回调
   */
  async callbackAntchainAtoFundNotifyEx(request: CallbackAntchainAtoFundNotifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackAntchainAtoFundNotifyResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackAntchainAtoFundNotifyResponse>(await this.doRequest("1.0", "antchain.ato.fund.notify.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackAntchainAtoFundNotifyResponse({}));
  }

  /**
   * @remarks
   * Description: 融资放款申请接口
   * Summary: 融资放款申请接口
   */
  async syncAntchainAtoTradeFinanceloanapply(request: SyncAntchainAtoTradeFinanceloanapplyRequest): Promise<SyncAntchainAtoTradeFinanceloanapplyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncAntchainAtoTradeFinanceloanapplyEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 融资放款申请接口
   * Summary: 融资放款申请接口
   */
  async syncAntchainAtoTradeFinanceloanapplyEx(request: SyncAntchainAtoTradeFinanceloanapplyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncAntchainAtoTradeFinanceloanapplyResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncAntchainAtoTradeFinanceloanapplyResponse>(await this.doRequest("1.0", "antchain.ato.trade.financeloanapply.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncAntchainAtoTradeFinanceloanapplyResponse({}));
  }

  /**
   * @remarks
   * Description: 商户履约查询
   * Summary: 商户履约查询
   */
  async getAntchainAtoTradeMerchantfulfillment(request: GetAntchainAtoTradeMerchantfulfillmentRequest): Promise<GetAntchainAtoTradeMerchantfulfillmentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAntchainAtoTradeMerchantfulfillmentEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 商户履约查询
   * Summary: 商户履约查询
   */
  async getAntchainAtoTradeMerchantfulfillmentEx(request: GetAntchainAtoTradeMerchantfulfillmentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAntchainAtoTradeMerchantfulfillmentResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAntchainAtoTradeMerchantfulfillmentResponse>(await this.doRequest("1.0", "antchain.ato.trade.merchantfulfillment.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAntchainAtoTradeMerchantfulfillmentResponse({}));
  }

  /**
   * @remarks
   * Description: 商户还款承诺同步
   * Summary: 商户还款承诺同步
   */
  async syncAntchainAtoFundMerchantpromise(request: SyncAntchainAtoFundMerchantpromiseRequest): Promise<SyncAntchainAtoFundMerchantpromiseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncAntchainAtoFundMerchantpromiseEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 商户还款承诺同步
   * Summary: 商户还款承诺同步
   */
  async syncAntchainAtoFundMerchantpromiseEx(request: SyncAntchainAtoFundMerchantpromiseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncAntchainAtoFundMerchantpromiseResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncAntchainAtoFundMerchantpromiseResponse>(await this.doRequest("1.0", "antchain.ato.fund.merchantpromise.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncAntchainAtoFundMerchantpromiseResponse({}));
  }

  /**
   * @remarks
   * Description: 融资放款结果同步
   * Summary: 融资放款结果同步
   */
  async syncAntchainAtoFundFinanceloanresults(request: SyncAntchainAtoFundFinanceloanresultsRequest): Promise<SyncAntchainAtoFundFinanceloanresultsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncAntchainAtoFundFinanceloanresultsEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 融资放款结果同步
   * Summary: 融资放款结果同步
   */
  async syncAntchainAtoFundFinanceloanresultsEx(request: SyncAntchainAtoFundFinanceloanresultsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncAntchainAtoFundFinanceloanresultsResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncAntchainAtoFundFinanceloanresultsResponse>(await this.doRequest("1.0", "antchain.ato.fund.financeloanresults.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncAntchainAtoFundFinanceloanresultsResponse({}));
  }

  /**
   * @remarks
   * Description: 查询用户承诺
   * Summary: 查询用户承诺
   */
  async getAntchainAtoFundUserpromise(request: GetAntchainAtoFundUserpromiseRequest): Promise<GetAntchainAtoFundUserpromiseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAntchainAtoFundUserpromiseEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询用户承诺
   * Summary: 查询用户承诺
   */
  async getAntchainAtoFundUserpromiseEx(request: GetAntchainAtoFundUserpromiseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAntchainAtoFundUserpromiseResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAntchainAtoFundUserpromiseResponse>(await this.doRequest("1.0", "antchain.ato.fund.userpromise.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAntchainAtoFundUserpromiseResponse({}));
  }

  /**
   * @remarks
   * Description: 用户履约信息查询（履约承诺+记录）
   * Summary: 用户履约信息查询（履约承诺+记录）
   */
  async getAntchainAtoTradeUserperformance(request: GetAntchainAtoTradeUserperformanceRequest): Promise<GetAntchainAtoTradeUserperformanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAntchainAtoTradeUserperformanceEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 用户履约信息查询（履约承诺+记录）
   * Summary: 用户履约信息查询（履约承诺+记录）
   */
  async getAntchainAtoTradeUserperformanceEx(request: GetAntchainAtoTradeUserperformanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAntchainAtoTradeUserperformanceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAntchainAtoTradeUserperformanceResponse>(await this.doRequest("1.0", "antchain.ato.trade.userperformance.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAntchainAtoTradeUserperformanceResponse({}));
  }

  /**
   * @remarks
   * Description: 商户履约信息查询（履约承诺+履约记录）
   * Summary: 商户履约信息查询（履约承诺+履约记录）
   */
  async getAntchainAtoTradeMerchantperformance(request: GetAntchainAtoTradeMerchantperformanceRequest): Promise<GetAntchainAtoTradeMerchantperformanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAntchainAtoTradeMerchantperformanceEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 商户履约信息查询（履约承诺+履约记录）
   * Summary: 商户履约信息查询（履约承诺+履约记录）
   */
  async getAntchainAtoTradeMerchantperformanceEx(request: GetAntchainAtoTradeMerchantperformanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAntchainAtoTradeMerchantperformanceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAntchainAtoTradeMerchantperformanceResponse>(await this.doRequest("1.0", "antchain.ato.trade.merchantperformance.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAntchainAtoTradeMerchantperformanceResponse({}));
  }

  /**
   * @remarks
   * Description: 用户履约信息查询（履约承诺+履约记录）
   * Summary: 用户履约信息查询（履约承诺+履约记录）
   */
  async getAntchainAtoFundUserperformance(request: GetAntchainAtoFundUserperformanceRequest): Promise<GetAntchainAtoFundUserperformanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAntchainAtoFundUserperformanceEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 用户履约信息查询（履约承诺+履约记录）
   * Summary: 用户履约信息查询（履约承诺+履约记录）
   */
  async getAntchainAtoFundUserperformanceEx(request: GetAntchainAtoFundUserperformanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAntchainAtoFundUserperformanceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAntchainAtoFundUserperformanceResponse>(await this.doRequest("1.0", "antchain.ato.fund.userperformance.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAntchainAtoFundUserperformanceResponse({}));
  }

  /**
   * @remarks
   * Description: 商户履约信息查询（履约承诺+履约记录）
   * Summary: 商户履约信息查询（履约承诺+履约记录）
   */
  async getAntchainAtoFundMerchantperformance(request: GetAntchainAtoFundMerchantperformanceRequest): Promise<GetAntchainAtoFundMerchantperformanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAntchainAtoFundMerchantperformanceEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 商户履约信息查询（履约承诺+履约记录）
   * Summary: 商户履约信息查询（履约承诺+履约记录）
   */
  async getAntchainAtoFundMerchantperformanceEx(request: GetAntchainAtoFundMerchantperformanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAntchainAtoFundMerchantperformanceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAntchainAtoFundMerchantperformanceResponse>(await this.doRequest("1.0", "antchain.ato.fund.merchantperformance.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAntchainAtoFundMerchantperformanceResponse({}));
  }

  /**
   * @remarks
   * Description: 资方调用、订单详情获取
   * Summary: 资方调用、订单详情获取
   */
  async getAntchainAtoFundOrderfullinfo(request: GetAntchainAtoFundOrderfullinfoRequest): Promise<GetAntchainAtoFundOrderfullinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAntchainAtoFundOrderfullinfoEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 资方调用、订单详情获取
   * Summary: 资方调用、订单详情获取
   */
  async getAntchainAtoFundOrderfullinfoEx(request: GetAntchainAtoFundOrderfullinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAntchainAtoFundOrderfullinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAntchainAtoFundOrderfullinfoResponse>(await this.doRequest("1.0", "antchain.ato.fund.orderfullinfo.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAntchainAtoFundOrderfullinfoResponse({}));
  }

  /**
   * @remarks
   * Description: 调用该接口，追加上传无法在原有链路上签署的合同
   * Summary: 商户调用合同追加接口
   */
  async uploadAntchainAtoSignFlow(request: UploadAntchainAtoSignFlowRequest): Promise<UploadAntchainAtoSignFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadAntchainAtoSignFlowEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 调用该接口，追加上传无法在原有链路上签署的合同
   * Summary: 商户调用合同追加接口
   */
  async uploadAntchainAtoSignFlowEx(request: UploadAntchainAtoSignFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadAntchainAtoSignFlowResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.ato.sign.flow.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadAntchainAtoSignFlowResponse = new UploadAntchainAtoSignFlowResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadAntchainAtoSignFlowResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<UploadAntchainAtoSignFlowResponse>(await this.doRequest("1.0", "antchain.ato.sign.flow.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadAntchainAtoSignFlowResponse({}));
  }

  /**
   * @remarks
   * Description: 创建退款请求
   * Summary: 创建退款申请
   */
  async createAntchainAtoWithholdRefund(request: CreateAntchainAtoWithholdRefundRequest): Promise<CreateAntchainAtoWithholdRefundResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAntchainAtoWithholdRefundEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建退款请求
   * Summary: 创建退款申请
   */
  async createAntchainAtoWithholdRefundEx(request: CreateAntchainAtoWithholdRefundRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAntchainAtoWithholdRefundResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAntchainAtoWithholdRefundResponse>(await this.doRequest("1.0", "antchain.ato.withhold.refund.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAntchainAtoWithholdRefundResponse({}));
  }

  /**
   * @remarks
   * Description: 退款申请结果查询
   * Summary: 退款申请结果查询
   */
  async queryAntchainAtoWithholdRefund(request: QueryAntchainAtoWithholdRefundRequest): Promise<QueryAntchainAtoWithholdRefundResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainAtoWithholdRefundEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 退款申请结果查询
   * Summary: 退款申请结果查询
   */
  async queryAntchainAtoWithholdRefundEx(request: QueryAntchainAtoWithholdRefundRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainAtoWithholdRefundResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainAtoWithholdRefundResponse>(await this.doRequest("1.0", "antchain.ato.withhold.refund.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainAtoWithholdRefundResponse({}));
  }

  /**
   * @remarks
   * Description: 商户调用，修改订单的用户还款承诺
   * Summary: 用户还款承诺信息修改
   */
  async updateAntchainAtoTradeUserpromise(request: UpdateAntchainAtoTradeUserpromiseRequest): Promise<UpdateAntchainAtoTradeUserpromiseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAntchainAtoTradeUserpromiseEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 商户调用，修改订单的用户还款承诺
   * Summary: 用户还款承诺信息修改
   */
  async updateAntchainAtoTradeUserpromiseEx(request: UpdateAntchainAtoTradeUserpromiseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAntchainAtoTradeUserpromiseResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAntchainAtoTradeUserpromiseResponse>(await this.doRequest("1.0", "antchain.ato.trade.userpromise.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAntchainAtoTradeUserpromiseResponse({}));
  }

  /**
   * @remarks
   * Description: 内部接口，根据租户查询合同模板列表
   * Summary: 查询模板列表
   */
  async allAntchainAtoInnerTemplate(request: AllAntchainAtoInnerTemplateRequest): Promise<AllAntchainAtoInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allAntchainAtoInnerTemplateEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 内部接口，根据租户查询合同模板列表
   * Summary: 查询模板列表
   */
  async allAntchainAtoInnerTemplateEx(request: AllAntchainAtoInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllAntchainAtoInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<AllAntchainAtoInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllAntchainAtoInnerTemplateResponse({}));
  }

  /**
   * @remarks
   * Description: 内部接口，根据模板code查询合同模板版本列表
   * Summary: 查询魔法库某一模板版本列表
   */
  async listAntchainAtoInnerTemplate(request: ListAntchainAtoInnerTemplateRequest): Promise<ListAntchainAtoInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAntchainAtoInnerTemplateEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 内部接口，根据模板code查询合同模板版本列表
   * Summary: 查询魔法库某一模板版本列表
   */
  async listAntchainAtoInnerTemplateEx(request: ListAntchainAtoInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAntchainAtoInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAntchainAtoInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAntchainAtoInnerTemplateResponse({}));
  }

  /**
   * @remarks
   * Description: 内部接口，根据模板code查询指定版本的模板详情
   * Summary: 查询魔法库模板详情
   */
  async detailAntchainAtoInnerTemplate(request: DetailAntchainAtoInnerTemplateRequest): Promise<DetailAntchainAtoInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailAntchainAtoInnerTemplateEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 内部接口，根据模板code查询指定版本的模板详情
   * Summary: 查询魔法库模板详情
   */
  async detailAntchainAtoInnerTemplateEx(request: DetailAntchainAtoInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailAntchainAtoInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailAntchainAtoInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailAntchainAtoInnerTemplateResponse({}));
  }

  /**
   * @remarks
   * Description: 内部接口，创建魔法库模板
   * Summary: 创建模板
   */
  async createAntchainAtoInnerTemplate(request: CreateAntchainAtoInnerTemplateRequest): Promise<CreateAntchainAtoInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAntchainAtoInnerTemplateEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 内部接口，创建魔法库模板
   * Summary: 创建模板
   */
  async createAntchainAtoInnerTemplateEx(request: CreateAntchainAtoInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAntchainAtoInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAntchainAtoInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAntchainAtoInnerTemplateResponse({}));
  }

  /**
   * @remarks
   * Description: 内部接口，保存魔法库模板
   * Summary: 保存魔法库模板
   */
  async saveAntchainAtoInnerTemplate(request: SaveAntchainAtoInnerTemplateRequest): Promise<SaveAntchainAtoInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveAntchainAtoInnerTemplateEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 内部接口，保存魔法库模板
   * Summary: 保存魔法库模板
   */
  async saveAntchainAtoInnerTemplateEx(request: SaveAntchainAtoInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveAntchainAtoInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveAntchainAtoInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveAntchainAtoInnerTemplateResponse({}));
  }

  /**
   * @remarks
   * Description: 内部接口，发布魔法库模板
   * Summary: 发布魔法库模板
   */
  async publishAntchainAtoInnerTemplate(request: PublishAntchainAtoInnerTemplateRequest): Promise<PublishAntchainAtoInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.publishAntchainAtoInnerTemplateEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 内部接口，发布魔法库模板
   * Summary: 发布魔法库模板
   */
  async publishAntchainAtoInnerTemplateEx(request: PublishAntchainAtoInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PublishAntchainAtoInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<PublishAntchainAtoInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.publish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PublishAntchainAtoInnerTemplateResponse({}));
  }

  /**
   * @remarks
   * Description: 内部接口，根据code预览对应魔法库模板
   * Summary: 预览魔法库模板
   */
  async previewAntchainAtoInnerTemplate(request: PreviewAntchainAtoInnerTemplateRequest): Promise<PreviewAntchainAtoInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.previewAntchainAtoInnerTemplateEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 内部接口，根据code预览对应魔法库模板
   * Summary: 预览魔法库模板
   */
  async previewAntchainAtoInnerTemplateEx(request: PreviewAntchainAtoInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PreviewAntchainAtoInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<PreviewAntchainAtoInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.preview", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PreviewAntchainAtoInnerTemplateResponse({}));
  }

  /**
   * @remarks
   * Description: 内部接口，根据code删除对应魔法库模板
   * Summary: 删除魔法库模板
   */
  async deleteAntchainAtoInnerTemplate(request: DeleteAntchainAtoInnerTemplateRequest): Promise<DeleteAntchainAtoInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteAntchainAtoInnerTemplateEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 内部接口，根据code删除对应魔法库模板
   * Summary: 删除魔法库模板
   */
  async deleteAntchainAtoInnerTemplateEx(request: DeleteAntchainAtoInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteAntchainAtoInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteAntchainAtoInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteAntchainAtoInnerTemplateResponse({}));
  }

  /**
   * @remarks
   * Description: 内部接口，复制一个魔法库模板
   * Summary: 复制魔法库模板
   */
  async cloneAntchainAtoInnerTemplate(request: CloneAntchainAtoInnerTemplateRequest): Promise<CloneAntchainAtoInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cloneAntchainAtoInnerTemplateEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 内部接口，复制一个魔法库模板
   * Summary: 复制魔法库模板
   */
  async cloneAntchainAtoInnerTemplateEx(request: CloneAntchainAtoInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CloneAntchainAtoInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<CloneAntchainAtoInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.clone", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CloneAntchainAtoInnerTemplateResponse({}));
  }

  /**
   * @remarks
   * Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
   * Summary: 资方合同文件已上传确认接口
   */
  async notifyAntchainAtoFundFlow(request: NotifyAntchainAtoFundFlowRequest): Promise<NotifyAntchainAtoFundFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.notifyAntchainAtoFundFlowEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
   * Summary: 资方合同文件已上传确认接口
   */
  async notifyAntchainAtoFundFlowEx(request: NotifyAntchainAtoFundFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<NotifyAntchainAtoFundFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<NotifyAntchainAtoFundFlowResponse>(await this.doRequest("1.0", "antchain.ato.fund.flow.notify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new NotifyAntchainAtoFundFlowResponse({}));
  }

  /**
   * @remarks
   * Description: 获取模板的图片列表
   * Summary: 获取模板的图片列表
   */
  async queryAntchainAtoInnerTemplateimage(request: QueryAntchainAtoInnerTemplateimageRequest): Promise<QueryAntchainAtoInnerTemplateimageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainAtoInnerTemplateimageEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 获取模板的图片列表
   * Summary: 获取模板的图片列表
   */
  async queryAntchainAtoInnerTemplateimageEx(request: QueryAntchainAtoInnerTemplateimageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainAtoInnerTemplateimageResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainAtoInnerTemplateimageResponse>(await this.doRequest("1.0", "antchain.ato.inner.templateimage.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainAtoInnerTemplateimageResponse({}));
  }

  /**
   * @remarks
   * Description: 前置签署间联模式订单进件
   * Summary: 前置签署间联模式订单进件
   */
  async syncAntchainAtoFrontIndirectorder(request: SyncAntchainAtoFrontIndirectorderRequest): Promise<SyncAntchainAtoFrontIndirectorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncAntchainAtoFrontIndirectorderEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 前置签署间联模式订单进件
   * Summary: 前置签署间联模式订单进件
   */
  async syncAntchainAtoFrontIndirectorderEx(request: SyncAntchainAtoFrontIndirectorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncAntchainAtoFrontIndirectorderResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncAntchainAtoFrontIndirectorderResponse>(await this.doRequest("1.0", "antchain.ato.front.indirectorder.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncAntchainAtoFrontIndirectorderResponse({}));
  }

  /**
   * @remarks
   * Description: 间联模式-后置模式订单进件
   * Summary: 间联模式-后置模式订单进件
   */
  async syncAntchainAtoTradeIndirectorder(request: SyncAntchainAtoTradeIndirectorderRequest): Promise<SyncAntchainAtoTradeIndirectorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncAntchainAtoTradeIndirectorderEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 间联模式-后置模式订单进件
   * Summary: 间联模式-后置模式订单进件
   */
  async syncAntchainAtoTradeIndirectorderEx(request: SyncAntchainAtoTradeIndirectorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncAntchainAtoTradeIndirectorderResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncAntchainAtoTradeIndirectorderResponse>(await this.doRequest("1.0", "antchain.ato.trade.indirectorder.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncAntchainAtoTradeIndirectorderResponse({}));
  }

  /**
   * @remarks
   * Description: 商户入驻
   * Summary: 商户入驻
   */
  async registerAntchainAtoMerchantexpandMerchant(request: RegisterAntchainAtoMerchantexpandMerchantRequest): Promise<RegisterAntchainAtoMerchantexpandMerchantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.registerAntchainAtoMerchantexpandMerchantEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 商户入驻
   * Summary: 商户入驻
   */
  async registerAntchainAtoMerchantexpandMerchantEx(request: RegisterAntchainAtoMerchantexpandMerchantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RegisterAntchainAtoMerchantexpandMerchantResponse> {
    Util.validateModel(request);
    return $tea.cast<RegisterAntchainAtoMerchantexpandMerchantResponse>(await this.doRequest("1.0", "antchain.ato.merchantexpand.merchant.register", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RegisterAntchainAtoMerchantexpandMerchantResponse({}));
  }

  /**
   * @remarks
   * Description: 获取临时上传文件链接
   * Summary: 获取临时上传文件链接
   */
  async uploadAntchainAtoMerchantexpandFile(request: UploadAntchainAtoMerchantexpandFileRequest): Promise<UploadAntchainAtoMerchantexpandFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadAntchainAtoMerchantexpandFileEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 获取临时上传文件链接
   * Summary: 获取临时上传文件链接
   */
  async uploadAntchainAtoMerchantexpandFileEx(request: UploadAntchainAtoMerchantexpandFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadAntchainAtoMerchantexpandFileResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadAntchainAtoMerchantexpandFileResponse>(await this.doRequest("1.0", "antchain.ato.merchantexpand.file.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadAntchainAtoMerchantexpandFileResponse({}));
  }

  /**
   * @remarks
   * Description: 商户入驻查询
   * Summary: 商户入驻查询
   */
  async queryAntchainAtoMerchantexpandMerchant(request: QueryAntchainAtoMerchantexpandMerchantRequest): Promise<QueryAntchainAtoMerchantexpandMerchantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainAtoMerchantexpandMerchantEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 商户入驻查询
   * Summary: 商户入驻查询
   */
  async queryAntchainAtoMerchantexpandMerchantEx(request: QueryAntchainAtoMerchantexpandMerchantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainAtoMerchantexpandMerchantResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainAtoMerchantexpandMerchantResponse>(await this.doRequest("1.0", "antchain.ato.merchantexpand.merchant.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainAtoMerchantexpandMerchantResponse({}));
  }

  /**
   * @remarks
   * Description: 同步已发布的模板
   * Summary: 同步已发布的模板
   */
  async syncAntchainAtoInnerTemplate(request: SyncAntchainAtoInnerTemplateRequest): Promise<SyncAntchainAtoInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncAntchainAtoInnerTemplateEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 同步已发布的模板
   * Summary: 同步已发布的模板
   */
  async syncAntchainAtoInnerTemplateEx(request: SyncAntchainAtoInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncAntchainAtoInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncAntchainAtoInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncAntchainAtoInnerTemplateResponse({}));
  }

  /**
   * @remarks
   * Description: 更新魔法库模板基本信息
   * Summary: 更新魔法库模板基本信息
   */
  async updateAntchainAtoInnerTemplate(request: UpdateAntchainAtoInnerTemplateRequest): Promise<UpdateAntchainAtoInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAntchainAtoInnerTemplateEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 更新魔法库模板基本信息
   * Summary: 更新魔法库模板基本信息
   */
  async updateAntchainAtoInnerTemplateEx(request: UpdateAntchainAtoInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAntchainAtoInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAntchainAtoInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAntchainAtoInnerTemplateResponse({}));
  }

  /**
   * @remarks
   * Description: 商户合同模板上传接口
   * Summary: 商户合同模板上传
   */
  async uploadAntchainAtoSignTemplate(request: UploadAntchainAtoSignTemplateRequest): Promise<UploadAntchainAtoSignTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadAntchainAtoSignTemplateEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 商户合同模板上传接口
   * Summary: 商户合同模板上传
   */
  async uploadAntchainAtoSignTemplateEx(request: UploadAntchainAtoSignTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadAntchainAtoSignTemplateResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.ato.sign.template.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadAntchainAtoSignTemplateResponse = new UploadAntchainAtoSignTemplateResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadAntchainAtoSignTemplateResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<UploadAntchainAtoSignTemplateResponse>(await this.doRequest("1.0", "antchain.ato.sign.template.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadAntchainAtoSignTemplateResponse({}));
  }

  /**
   * @remarks
   * Description: 通过模板code更新模板的基本信息，比如模板名称等
   * Summary: 查询模板的基本信息
   */
  async queryAntchainAtoInnerTemplate(request: QueryAntchainAtoInnerTemplateRequest): Promise<QueryAntchainAtoInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainAtoInnerTemplateEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 通过模板code更新模板的基本信息，比如模板名称等
   * Summary: 查询模板的基本信息
   */
  async queryAntchainAtoInnerTemplateEx(request: QueryAntchainAtoInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainAtoInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainAtoInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainAtoInnerTemplateResponse({}));
  }

  /**
   * @remarks
   * Description: 获取模板关联的元素列表信息，包括组件信息
   * Summary: 获取模板关联的元素列表信息
   */
  async queryAntchainAtoInnerTemplateelementlink(request: QueryAntchainAtoInnerTemplateelementlinkRequest): Promise<QueryAntchainAtoInnerTemplateelementlinkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainAtoInnerTemplateelementlinkEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 获取模板关联的元素列表信息，包括组件信息
   * Summary: 获取模板关联的元素列表信息
   */
  async queryAntchainAtoInnerTemplateelementlinkEx(request: QueryAntchainAtoInnerTemplateelementlinkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainAtoInnerTemplateelementlinkResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainAtoInnerTemplateelementlinkResponse>(await this.doRequest("1.0", "antchain.ato.inner.templateelementlink.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainAtoInnerTemplateelementlinkResponse({}));
  }

  /**
   * @remarks
   * Description: 资方资产凭证上传，可以是文本或文件
   * Summary: 资方资产凭证上传
   */
  async uploadAntchainAtoFundCredit(request: UploadAntchainAtoFundCreditRequest): Promise<UploadAntchainAtoFundCreditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadAntchainAtoFundCreditEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 资方资产凭证上传，可以是文本或文件
   * Summary: 资方资产凭证上传
   */
  async uploadAntchainAtoFundCreditEx(request: UploadAntchainAtoFundCreditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadAntchainAtoFundCreditResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadAntchainAtoFundCreditResponse>(await this.doRequest("1.0", "antchain.ato.fund.credit.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadAntchainAtoFundCreditResponse({}));
  }

  /**
   * @remarks
   * Description: 商户资产凭证上传，可以是文本或文件
   * Summary: 商户资产凭证上传，可以是文本或文件
   */
  async uploadAntchainAtoSignCredit(request: UploadAntchainAtoSignCreditRequest): Promise<UploadAntchainAtoSignCreditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadAntchainAtoSignCreditEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 商户资产凭证上传，可以是文本或文件
   * Summary: 商户资产凭证上传，可以是文本或文件
   */
  async uploadAntchainAtoSignCreditEx(request: UploadAntchainAtoSignCreditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadAntchainAtoSignCreditResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadAntchainAtoSignCreditResponse>(await this.doRequest("1.0", "antchain.ato.sign.credit.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadAntchainAtoSignCreditResponse({}));
  }

  /**
   * @remarks
   * Description: 资方资产凭证查询，需要提供订单号或资产包号
   * Summary: 资方资产凭证查询
   */
  async queryAntchainAtoFundCredit(request: QueryAntchainAtoFundCreditRequest): Promise<QueryAntchainAtoFundCreditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainAtoFundCreditEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 资方资产凭证查询，需要提供订单号或资产包号
   * Summary: 资方资产凭证查询
   */
  async queryAntchainAtoFundCreditEx(request: QueryAntchainAtoFundCreditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainAtoFundCreditResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainAtoFundCreditResponse>(await this.doRequest("1.0", "antchain.ato.fund.credit.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainAtoFundCreditResponse({}));
  }

  /**
   * @remarks
   * Description: 商户资产凭证查询，需要提供订单号或资产包号
   * Summary: 商户资产凭证查询，需要提供订单号或资产包号
   */
  async queryAntchainAtoSignCredit(request: QueryAntchainAtoSignCreditRequest): Promise<QueryAntchainAtoSignCreditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainAtoSignCreditEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 商户资产凭证查询，需要提供订单号或资产包号
   * Summary: 商户资产凭证查询，需要提供订单号或资产包号
   */
  async queryAntchainAtoSignCreditEx(request: QueryAntchainAtoSignCreditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainAtoSignCreditResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainAtoSignCreditResponse>(await this.doRequest("1.0", "antchain.ato.sign.credit.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainAtoSignCreditResponse({}));
  }

  /**
   * @remarks
   * Description: 商家信息修改
   * Summary: 商家信息修改
   */
  async updateAntchainAtoMerchantexpandMerchant(request: UpdateAntchainAtoMerchantexpandMerchantRequest): Promise<UpdateAntchainAtoMerchantexpandMerchantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAntchainAtoMerchantexpandMerchantEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 商家信息修改
   * Summary: 商家信息修改
   */
  async updateAntchainAtoMerchantexpandMerchantEx(request: UpdateAntchainAtoMerchantexpandMerchantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAntchainAtoMerchantexpandMerchantResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAntchainAtoMerchantexpandMerchantResponse>(await this.doRequest("1.0", "antchain.ato.merchantexpand.merchant.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAntchainAtoMerchantexpandMerchantResponse({}));
  }

  /**
   * @remarks
   * Description: 撤销签署流程
   * Summary: 撤销签署流程
   */
  async cancelAntchainAtoSignFlow(request: CancelAntchainAtoSignFlowRequest): Promise<CancelAntchainAtoSignFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelAntchainAtoSignFlowEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 撤销签署流程
   * Summary: 撤销签署流程
   */
  async cancelAntchainAtoSignFlowEx(request: CancelAntchainAtoSignFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelAntchainAtoSignFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelAntchainAtoSignFlowResponse>(await this.doRequest("1.0", "antchain.ato.sign.flow.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelAntchainAtoSignFlowResponse({}));
  }

  /**
   * @remarks
   * Description: 用户履约承诺替换更新
   * Summary: 用户履约承诺替换更新
   */
  async replaceAntchainAtoTradeUserpromise(request: ReplaceAntchainAtoTradeUserpromiseRequest): Promise<ReplaceAntchainAtoTradeUserpromiseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.replaceAntchainAtoTradeUserpromiseEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 用户履约承诺替换更新
   * Summary: 用户履约承诺替换更新
   */
  async replaceAntchainAtoTradeUserpromiseEx(request: ReplaceAntchainAtoTradeUserpromiseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReplaceAntchainAtoTradeUserpromiseResponse> {
    Util.validateModel(request);
    return $tea.cast<ReplaceAntchainAtoTradeUserpromiseResponse>(await this.doRequest("1.0", "antchain.ato.trade.userpromise.replace", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReplaceAntchainAtoTradeUserpromiseResponse({}));
  }

  /**
   * @remarks
   * Description: 订单融资预审申请接口
   * Summary: 订单融资预审申请接口
   */
  async applyAntchainAtoTradeFinanceprecheck(request: ApplyAntchainAtoTradeFinanceprecheckRequest): Promise<ApplyAntchainAtoTradeFinanceprecheckResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyAntchainAtoTradeFinanceprecheckEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 订单融资预审申请接口
   * Summary: 订单融资预审申请接口
   */
  async applyAntchainAtoTradeFinanceprecheckEx(request: ApplyAntchainAtoTradeFinanceprecheckRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyAntchainAtoTradeFinanceprecheckResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyAntchainAtoTradeFinanceprecheckResponse>(await this.doRequest("1.0", "antchain.ato.trade.financeprecheck.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyAntchainAtoTradeFinanceprecheckResponse({}));
  }

  /**
   * @remarks
   * Description: 融资预审结果同步
   * Summary: 融资预审结果同步
   */
  async syncAntchainAtoFundFinanceprecheckresult(request: SyncAntchainAtoFundFinanceprecheckresultRequest): Promise<SyncAntchainAtoFundFinanceprecheckresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncAntchainAtoFundFinanceprecheckresultEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 融资预审结果同步
   * Summary: 融资预审结果同步
   */
  async syncAntchainAtoFundFinanceprecheckresultEx(request: SyncAntchainAtoFundFinanceprecheckresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncAntchainAtoFundFinanceprecheckresultResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncAntchainAtoFundFinanceprecheckresultResponse>(await this.doRequest("1.0", "antchain.ato.fund.financeprecheckresult.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncAntchainAtoFundFinanceprecheckresultResponse({}));
  }

  /**
   * @remarks
   * Description: 资方查询代偿户余额
   * Summary: 代偿户查询
   */
  async queryAntchainAtoFundCompensateaccount(request: QueryAntchainAtoFundCompensateaccountRequest): Promise<QueryAntchainAtoFundCompensateaccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainAtoFundCompensateaccountEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 资方查询代偿户余额
   * Summary: 代偿户查询
   */
  async queryAntchainAtoFundCompensateaccountEx(request: QueryAntchainAtoFundCompensateaccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainAtoFundCompensateaccountResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainAtoFundCompensateaccountResponse>(await this.doRequest("1.0", "antchain.ato.fund.compensateaccount.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainAtoFundCompensateaccountResponse({}));
  }

  /**
   * @remarks
   * Description: 代偿户账户查询
   * Summary: 代偿户账户查询
   */
  async queryAntchainAtoWithholdCompensateaccount(request: QueryAntchainAtoWithholdCompensateaccountRequest): Promise<QueryAntchainAtoWithholdCompensateaccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainAtoWithholdCompensateaccountEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 代偿户账户查询
   * Summary: 代偿户账户查询
   */
  async queryAntchainAtoWithholdCompensateaccountEx(request: QueryAntchainAtoWithholdCompensateaccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainAtoWithholdCompensateaccountResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainAtoWithholdCompensateaccountResponse>(await this.doRequest("1.0", "antchain.ato.withhold.compensateaccount.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainAtoWithholdCompensateaccountResponse({}));
  }

  /**
   * @remarks
   * Description: 获取合同存证证明
   * Summary: 获取合同存证证明
   */
  async getAntchainAtoSignContractcertificate(request: GetAntchainAtoSignContractcertificateRequest): Promise<GetAntchainAtoSignContractcertificateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAntchainAtoSignContractcertificateEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 获取合同存证证明
   * Summary: 获取合同存证证明
   */
  async getAntchainAtoSignContractcertificateEx(request: GetAntchainAtoSignContractcertificateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAntchainAtoSignContractcertificateResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAntchainAtoSignContractcertificateResponse>(await this.doRequest("1.0", "antchain.ato.sign.contractcertificate.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAntchainAtoSignContractcertificateResponse({}));
  }

  /**
   * @remarks
   * Description: 非融转融资
   * Summary: 非融转融资
   */
  async transferAntchainAtoTradeFinance(request: TransferAntchainAtoTradeFinanceRequest): Promise<TransferAntchainAtoTradeFinanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.transferAntchainAtoTradeFinanceEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 非融转融资
   * Summary: 非融转融资
   */
  async transferAntchainAtoTradeFinanceEx(request: TransferAntchainAtoTradeFinanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<TransferAntchainAtoTradeFinanceResponse> {
    Util.validateModel(request);
    return $tea.cast<TransferAntchainAtoTradeFinanceResponse>(await this.doRequest("1.0", "antchain.ato.trade.finance.transfer", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new TransferAntchainAtoTradeFinanceResponse({}));
  }

  /**
   * @remarks
   * Description: 更新订单信息
   * Summary: 更新订单信息
   */
  async updateAntchainAtoTradeOrder(request: UpdateAntchainAtoTradeOrderRequest): Promise<UpdateAntchainAtoTradeOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAntchainAtoTradeOrderEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 更新订单信息
   * Summary: 更新订单信息
   */
  async updateAntchainAtoTradeOrderEx(request: UpdateAntchainAtoTradeOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAntchainAtoTradeOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAntchainAtoTradeOrderResponse>(await this.doRequest("1.0", "antchain.ato.trade.order.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAntchainAtoTradeOrderResponse({}));
  }

  /**
   * @remarks
   * Description: 融资订单追加预审资金方
   * Summary: 融资订单追加预审资金方
   */
  async addAntchainAtoTradeFinanceprecheck(request: AddAntchainAtoTradeFinanceprecheckRequest): Promise<AddAntchainAtoTradeFinanceprecheckResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addAntchainAtoTradeFinanceprecheckEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 融资订单追加预审资金方
   * Summary: 融资订单追加预审资金方
   */
  async addAntchainAtoTradeFinanceprecheckEx(request: AddAntchainAtoTradeFinanceprecheckRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddAntchainAtoTradeFinanceprecheckResponse> {
    Util.validateModel(request);
    return $tea.cast<AddAntchainAtoTradeFinanceprecheckResponse>(await this.doRequest("1.0", "antchain.ato.trade.financeprecheck.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddAntchainAtoTradeFinanceprecheckResponse({}));
  }

  /**
   * @remarks
   * Description: 订单融资信息查询接口
   * Summary: 订单融资信息查询接口
   */
  async getAntchainAtoTradeOrderfinanceinfo(request: GetAntchainAtoTradeOrderfinanceinfoRequest): Promise<GetAntchainAtoTradeOrderfinanceinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAntchainAtoTradeOrderfinanceinfoEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 订单融资信息查询接口
   * Summary: 订单融资信息查询接口
   */
  async getAntchainAtoTradeOrderfinanceinfoEx(request: GetAntchainAtoTradeOrderfinanceinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAntchainAtoTradeOrderfinanceinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAntchainAtoTradeOrderfinanceinfoResponse>(await this.doRequest("1.0", "antchain.ato.trade.orderfinanceinfo.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAntchainAtoTradeOrderfinanceinfoResponse({}));
  }

  /**
   * @remarks
   * Description: 资方查询订单融资信息
   * Summary: 资方查询订单融资信息
   */
  async getAntchainAtoFundOrderfinanceinfo(request: GetAntchainAtoFundOrderfinanceinfoRequest): Promise<GetAntchainAtoFundOrderfinanceinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAntchainAtoFundOrderfinanceinfoEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 资方查询订单融资信息
   * Summary: 资方查询订单融资信息
   */
  async getAntchainAtoFundOrderfinanceinfoEx(request: GetAntchainAtoFundOrderfinanceinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAntchainAtoFundOrderfinanceinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAntchainAtoFundOrderfinanceinfoResponse>(await this.doRequest("1.0", "antchain.ato.fund.orderfinanceinfo.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAntchainAtoFundOrderfinanceinfoResponse({}));
  }

  /**
   * @remarks
   * Description: 订单代扣计划延期
   * Summary: 订单代扣计划延期
   */
  async syncAntchainAtoTradeUserpromisedelay(request: SyncAntchainAtoTradeUserpromisedelayRequest): Promise<SyncAntchainAtoTradeUserpromisedelayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncAntchainAtoTradeUserpromisedelayEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 订单代扣计划延期
   * Summary: 订单代扣计划延期
   */
  async syncAntchainAtoTradeUserpromisedelayEx(request: SyncAntchainAtoTradeUserpromisedelayRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncAntchainAtoTradeUserpromisedelayResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncAntchainAtoTradeUserpromisedelayResponse>(await this.doRequest("1.0", "antchain.ato.trade.userpromisedelay.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncAntchainAtoTradeUserpromisedelayResponse({}));
  }

  /**
   * @remarks
   * Description: 订单代扣计划暂停
   * Summary: 订单代扣计划暂停
   */
  async pauseAntchainAtoTradeUserpromise(request: PauseAntchainAtoTradeUserpromiseRequest): Promise<PauseAntchainAtoTradeUserpromiseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pauseAntchainAtoTradeUserpromiseEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 订单代扣计划暂停
   * Summary: 订单代扣计划暂停
   */
  async pauseAntchainAtoTradeUserpromiseEx(request: PauseAntchainAtoTradeUserpromiseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PauseAntchainAtoTradeUserpromiseResponse> {
    Util.validateModel(request);
    return $tea.cast<PauseAntchainAtoTradeUserpromiseResponse>(await this.doRequest("1.0", "antchain.ato.trade.userpromise.pause", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PauseAntchainAtoTradeUserpromiseResponse({}));
  }

  /**
   * @remarks
   * Description: 代扣计划重启
   * Summary: 代扣计划重启
   */
  async resumeAntchainAtoTradeUserpromise(request: ResumeAntchainAtoTradeUserpromiseRequest): Promise<ResumeAntchainAtoTradeUserpromiseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.resumeAntchainAtoTradeUserpromiseEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 代扣计划重启
   * Summary: 代扣计划重启
   */
  async resumeAntchainAtoTradeUserpromiseEx(request: ResumeAntchainAtoTradeUserpromiseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ResumeAntchainAtoTradeUserpromiseResponse> {
    Util.validateModel(request);
    return $tea.cast<ResumeAntchainAtoTradeUserpromiseResponse>(await this.doRequest("1.0", "antchain.ato.trade.userpromise.resume", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ResumeAntchainAtoTradeUserpromiseResponse({}));
  }

  /**
   * @remarks
   * Description: 添加分账绑定关系
   * Summary: 添加分账绑定关系
   */
  async addAntchainAtoMerchantexpandDividerelation(request: AddAntchainAtoMerchantexpandDividerelationRequest): Promise<AddAntchainAtoMerchantexpandDividerelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addAntchainAtoMerchantexpandDividerelationEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 添加分账绑定关系
   * Summary: 添加分账绑定关系
   */
  async addAntchainAtoMerchantexpandDividerelationEx(request: AddAntchainAtoMerchantexpandDividerelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddAntchainAtoMerchantexpandDividerelationResponse> {
    Util.validateModel(request);
    return $tea.cast<AddAntchainAtoMerchantexpandDividerelationResponse>(await this.doRequest("1.0", "antchain.ato.merchantexpand.dividerelation.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddAntchainAtoMerchantexpandDividerelationResponse({}));
  }

  /**
   * @remarks
   * Description: 分账绑定关系查询
   * Summary: 分账绑定关系查询
   */
  async queryAntchainAtoMerchantexpandDividerelation(request: QueryAntchainAtoMerchantexpandDividerelationRequest): Promise<QueryAntchainAtoMerchantexpandDividerelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainAtoMerchantexpandDividerelationEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 分账绑定关系查询
   * Summary: 分账绑定关系查询
   */
  async queryAntchainAtoMerchantexpandDividerelationEx(request: QueryAntchainAtoMerchantexpandDividerelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainAtoMerchantexpandDividerelationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainAtoMerchantexpandDividerelationResponse>(await this.doRequest("1.0", "antchain.ato.merchantexpand.dividerelation.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainAtoMerchantexpandDividerelationResponse({}));
  }

  /**
   * @remarks
   * Description: 合同模板制作根据已有模板新增合同模板文件
   * Summary: 根据已有模板新增合同模板文件
   */
  async addAntchainAtoInnerTemplate(request: AddAntchainAtoInnerTemplateRequest): Promise<AddAntchainAtoInnerTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addAntchainAtoInnerTemplateEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 合同模板制作根据已有模板新增合同模板文件
   * Summary: 根据已有模板新增合同模板文件
   */
  async addAntchainAtoInnerTemplateEx(request: AddAntchainAtoInnerTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddAntchainAtoInnerTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<AddAntchainAtoInnerTemplateResponse>(await this.doRequest("1.0", "antchain.ato.inner.template.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddAntchainAtoInnerTemplateResponse({}));
  }

  /**
   * @remarks
   * Description: ● 本接口获取用信授权
   * ●本接口返回成功后，仅代表用信申请成功；不代表订单融资发起申请成功，融资申请结果通过异步消息通知
   * Summary: 用信申请接口
   */
  async applyAntchainAtoFundCreditutilization(request: ApplyAntchainAtoFundCreditutilizationRequest): Promise<ApplyAntchainAtoFundCreditutilizationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyAntchainAtoFundCreditutilizationEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: ● 本接口获取用信授权
   * ●本接口返回成功后，仅代表用信申请成功；不代表订单融资发起申请成功，融资申请结果通过异步消息通知
   * Summary: 用信申请接口
   */
  async applyAntchainAtoFundCreditutilizationEx(request: ApplyAntchainAtoFundCreditutilizationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyAntchainAtoFundCreditutilizationResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyAntchainAtoFundCreditutilizationResponse>(await this.doRequest("1.0", "antchain.ato.fund.creditutilization.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyAntchainAtoFundCreditutilizationResponse({}));
  }

  /**
   * @remarks
   * Description: 调用说明：
   * ●本接口用于授信额度试算完成后同步授信结果。
   * Summary: 授信结果同步接口
   */
  async syncAntchainAtoFundCreditgranting(request: SyncAntchainAtoFundCreditgrantingRequest): Promise<SyncAntchainAtoFundCreditgrantingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncAntchainAtoFundCreditgrantingEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 调用说明：
   * ●本接口用于授信额度试算完成后同步授信结果。
   * Summary: 授信结果同步接口
   */
  async syncAntchainAtoFundCreditgrantingEx(request: SyncAntchainAtoFundCreditgrantingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncAntchainAtoFundCreditgrantingResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncAntchainAtoFundCreditgrantingResponse>(await this.doRequest("1.0", "antchain.ato.fund.creditgranting.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncAntchainAtoFundCreditgrantingResponse({}));
  }

  /**
   * @remarks
   * Description: 本接口用于授信授权。本接口返回成功后，代表授权申请已发起。如果授权通过，会发送异步通知。
   * Summary: 授信授权申请接口
   */
  async authAntchainAtoFundCreditgranting(request: AuthAntchainAtoFundCreditgrantingRequest): Promise<AuthAntchainAtoFundCreditgrantingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authAntchainAtoFundCreditgrantingEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 本接口用于授信授权。本接口返回成功后，代表授权申请已发起。如果授权通过，会发送异步通知。
   * Summary: 授信授权申请接口
   */
  async authAntchainAtoFundCreditgrantingEx(request: AuthAntchainAtoFundCreditgrantingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthAntchainAtoFundCreditgrantingResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthAntchainAtoFundCreditgrantingResponse>(await this.doRequest("1.0", "antchain.ato.fund.creditgranting.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthAntchainAtoFundCreditgrantingResponse({}));
  }

  /**
   * @remarks
   * Description: 本接口用于查询授信结果
   * Summary: 授信结果查询
   */
  async queryAntchainAtoFundCreditgranting(request: QueryAntchainAtoFundCreditgrantingRequest): Promise<QueryAntchainAtoFundCreditgrantingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainAtoFundCreditgrantingEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 本接口用于查询授信结果
   * Summary: 授信结果查询
   */
  async queryAntchainAtoFundCreditgrantingEx(request: QueryAntchainAtoFundCreditgrantingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainAtoFundCreditgrantingResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainAtoFundCreditgrantingResponse>(await this.doRequest("1.0", "antchain.ato.fund.creditgranting.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainAtoFundCreditgrantingResponse({}));
  }

  /**
   * @remarks
   * Description: 授权信息查询
   * Summary: 授权信息查询
   */
  async queryAntchainAtoFundCreditauth(request: QueryAntchainAtoFundCreditauthRequest): Promise<QueryAntchainAtoFundCreditauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainAtoFundCreditauthEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 授权信息查询
   * Summary: 授权信息查询
   */
  async queryAntchainAtoFundCreditauthEx(request: QueryAntchainAtoFundCreditauthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainAtoFundCreditauthResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainAtoFundCreditauthResponse>(await this.doRequest("1.0", "antchain.ato.fund.creditauth.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainAtoFundCreditauthResponse({}));
  }

  /**
   * @remarks
   * Description: 资产包详情查询
   * Summary: 资产包详情查询
   */
  async queryAntchainAtoFundAssetpackage(request: QueryAntchainAtoFundAssetpackageRequest): Promise<QueryAntchainAtoFundAssetpackageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainAtoFundAssetpackageEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 资产包详情查询
   * Summary: 资产包详情查询
   */
  async queryAntchainAtoFundAssetpackageEx(request: QueryAntchainAtoFundAssetpackageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainAtoFundAssetpackageResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainAtoFundAssetpackageResponse>(await this.doRequest("1.0", "antchain.ato.fund.assetpackage.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainAtoFundAssetpackageResponse({}));
  }

  /**
   * @remarks
   * Description: 调用说明：
   * 1.当商户通过其他方式还款后，通过次接口同步信息，同步完成后会将扣款进行取消
   * Summary: 商户履约其他方式还款（单期取消）
   */
  async repayAntchainAtoFundPlan(request: RepayAntchainAtoFundPlanRequest): Promise<RepayAntchainAtoFundPlanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.repayAntchainAtoFundPlanEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 调用说明：
   * 1.当商户通过其他方式还款后，通过次接口同步信息，同步完成后会将扣款进行取消
   * Summary: 商户履约其他方式还款（单期取消）
   */
  async repayAntchainAtoFundPlanEx(request: RepayAntchainAtoFundPlanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RepayAntchainAtoFundPlanResponse> {
    Util.validateModel(request);
    return $tea.cast<RepayAntchainAtoFundPlanResponse>(await this.doRequest("1.0", "antchain.ato.fund.plan.repay", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RepayAntchainAtoFundPlanResponse({}));
  }

  /**
   * @remarks
   * Description: 资方代偿签约链接获取
   * Summary: 资方代偿签约链接获取
   */
  async getAntchainAtoFundCompensatesignurl(request: GetAntchainAtoFundCompensatesignurlRequest): Promise<GetAntchainAtoFundCompensatesignurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAntchainAtoFundCompensatesignurlEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 资方代偿签约链接获取
   * Summary: 资方代偿签约链接获取
   */
  async getAntchainAtoFundCompensatesignurlEx(request: GetAntchainAtoFundCompensatesignurlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAntchainAtoFundCompensatesignurlResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAntchainAtoFundCompensatesignurlResponse>(await this.doRequest("1.0", "antchain.ato.fund.compensatesignurl.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAntchainAtoFundCompensatesignurlResponse({}));
  }

  /**
   * @remarks
   * Description: 转账代偿签约结果确认
   * Summary: 转账代偿签约结果确认
   */
  async confirmAntchainAtoFundCompensate(request: ConfirmAntchainAtoFundCompensateRequest): Promise<ConfirmAntchainAtoFundCompensateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmAntchainAtoFundCompensateEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 转账代偿签约结果确认
   * Summary: 转账代偿签约结果确认
   */
  async confirmAntchainAtoFundCompensateEx(request: ConfirmAntchainAtoFundCompensateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmAntchainAtoFundCompensateResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmAntchainAtoFundCompensateResponse>(await this.doRequest("1.0", "antchain.ato.fund.compensate.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmAntchainAtoFundCompensateResponse({}));
  }

  /**
   * @remarks
   * Description: 重试pending状态的代扣计划
   * Summary: 重试pending状态的代扣计划
   */
  async retryAntchainAtoWithholdPlanpending(request: RetryAntchainAtoWithholdPlanpendingRequest): Promise<RetryAntchainAtoWithholdPlanpendingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryAntchainAtoWithholdPlanpendingEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 重试pending状态的代扣计划
   * Summary: 重试pending状态的代扣计划
   */
  async retryAntchainAtoWithholdPlanpendingEx(request: RetryAntchainAtoWithholdPlanpendingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryAntchainAtoWithholdPlanpendingResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryAntchainAtoWithholdPlanpendingResponse>(await this.doRequest("1.0", "antchain.ato.withhold.planpending.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryAntchainAtoWithholdPlanpendingResponse({}));
  }

  /**
   * @remarks
   * Description: 分账pending重试
   * Summary: 分账pending重试
   */
  async retryAntchainAtoWithholdDividepending(request: RetryAntchainAtoWithholdDividependingRequest): Promise<RetryAntchainAtoWithholdDividependingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retryAntchainAtoWithholdDividependingEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 分账pending重试
   * Summary: 分账pending重试
   */
  async retryAntchainAtoWithholdDividependingEx(request: RetryAntchainAtoWithholdDividependingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetryAntchainAtoWithholdDividependingResponse> {
    Util.validateModel(request);
    return $tea.cast<RetryAntchainAtoWithholdDividependingResponse>(await this.doRequest("1.0", "antchain.ato.withhold.dividepending.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetryAntchainAtoWithholdDividependingResponse({}));
  }

  /**
   * @remarks
   * Description: promo订单信息同步
   * Summary: promo订单信息同步
   */
  async syncAntchainAtoTradePromoorderinfo(request: SyncAntchainAtoTradePromoorderinfoRequest): Promise<SyncAntchainAtoTradePromoorderinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncAntchainAtoTradePromoorderinfoEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: promo订单信息同步
   * Summary: promo订单信息同步
   */
  async syncAntchainAtoTradePromoorderinfoEx(request: SyncAntchainAtoTradePromoorderinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncAntchainAtoTradePromoorderinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncAntchainAtoTradePromoorderinfoResponse>(await this.doRequest("1.0", "antchain.ato.trade.promoorderinfo.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncAntchainAtoTradePromoorderinfoResponse({}));
  }

  /**
   * @remarks
   * Description: 二级户进件绑定结算卡信息
   * Summary: 二级户进件绑定结算卡信息
   */
  async bindAntchainAtoMerchantexpandSettlecard(request: BindAntchainAtoMerchantexpandSettlecardRequest): Promise<BindAntchainAtoMerchantexpandSettlecardResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindAntchainAtoMerchantexpandSettlecardEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 二级户进件绑定结算卡信息
   * Summary: 二级户进件绑定结算卡信息
   */
  async bindAntchainAtoMerchantexpandSettlecardEx(request: BindAntchainAtoMerchantexpandSettlecardRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindAntchainAtoMerchantexpandSettlecardResponse> {
    Util.validateModel(request);
    return $tea.cast<BindAntchainAtoMerchantexpandSettlecardResponse>(await this.doRequest("1.0", "antchain.ato.merchantexpand.settlecard.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindAntchainAtoMerchantexpandSettlecardResponse({}));
  }

  /**
   * @remarks
   * Description: 资产订单同步
   * Summary: 资产订单同步
   */
  async syncAntchainAtoTradeReceiptorderfullinfo(request: SyncAntchainAtoTradeReceiptorderfullinfoRequest): Promise<SyncAntchainAtoTradeReceiptorderfullinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncAntchainAtoTradeReceiptorderfullinfoEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 资产订单同步
   * Summary: 资产订单同步
   */
  async syncAntchainAtoTradeReceiptorderfullinfoEx(request: SyncAntchainAtoTradeReceiptorderfullinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncAntchainAtoTradeReceiptorderfullinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncAntchainAtoTradeReceiptorderfullinfoResponse>(await this.doRequest("1.0", "antchain.ato.trade.receiptorderfullinfo.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncAntchainAtoTradeReceiptorderfullinfoResponse({}));
  }

  /**
   * @remarks
   * Description: 订单信息查询（新）
   * Summary: 订单获取
   */
  async getAntchainAtoTradeOrderfullinfo(request: GetAntchainAtoTradeOrderfullinfoRequest): Promise<GetAntchainAtoTradeOrderfullinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAntchainAtoTradeOrderfullinfoEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 订单信息查询（新）
   * Summary: 订单获取
   */
  async getAntchainAtoTradeOrderfullinfoEx(request: GetAntchainAtoTradeOrderfullinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAntchainAtoTradeOrderfullinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAntchainAtoTradeOrderfullinfoResponse>(await this.doRequest("1.0", "antchain.ato.trade.orderfullinfo.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAntchainAtoTradeOrderfullinfoResponse({}));
  }

  /**
   * @remarks
   * Description: 资方提交合同签署
   * Summary: 资方提交合同签署
   */
  async submitAntchainAtoFundFlow(request: SubmitAntchainAtoFundFlowRequest): Promise<SubmitAntchainAtoFundFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitAntchainAtoFundFlowEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 资方提交合同签署
   * Summary: 资方提交合同签署
   */
  async submitAntchainAtoFundFlowEx(request: SubmitAntchainAtoFundFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitAntchainAtoFundFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitAntchainAtoFundFlowResponse>(await this.doRequest("1.0", "antchain.ato.fund.flow.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitAntchainAtoFundFlowResponse({}));
  }

  /**
   * @remarks
   * Description: 资方合同流程撤销
   * Summary: 资方合同流程撤销
   */
  async cancelAntchainAtoFundFlow(request: CancelAntchainAtoFundFlowRequest): Promise<CancelAntchainAtoFundFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelAntchainAtoFundFlowEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 资方合同流程撤销
   * Summary: 资方合同流程撤销
   */
  async cancelAntchainAtoFundFlowEx(request: CancelAntchainAtoFundFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelAntchainAtoFundFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelAntchainAtoFundFlowResponse>(await this.doRequest("1.0", "antchain.ato.fund.flow.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelAntchainAtoFundFlowResponse({}));
  }

  /**
   * @remarks
   * Description: 资方自有合同同步
   * Summary: 资方自有合同同步
   */
  async syncAntchainAtoFundFlow(request: SyncAntchainAtoFundFlowRequest): Promise<SyncAntchainAtoFundFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncAntchainAtoFundFlowEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 资方自有合同同步
   * Summary: 资方自有合同同步
   */
  async syncAntchainAtoFundFlowEx(request: SyncAntchainAtoFundFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncAntchainAtoFundFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncAntchainAtoFundFlowResponse>(await this.doRequest("1.0", "antchain.ato.fund.flow.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncAntchainAtoFundFlowResponse({}));
  }

  /**
   * @remarks
   * Description: 资方自有合同签署
   * Summary: 资方自有合同签署
   */
  async signAntchainAtoFundFlow(request: SignAntchainAtoFundFlowRequest): Promise<SignAntchainAtoFundFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.signAntchainAtoFundFlowEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 资方自有合同签署
   * Summary: 资方自有合同签署
   */
  async signAntchainAtoFundFlowEx(request: SignAntchainAtoFundFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SignAntchainAtoFundFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<SignAntchainAtoFundFlowResponse>(await this.doRequest("1.0", "antchain.ato.fund.flow.sign", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SignAntchainAtoFundFlowResponse({}));
  }

  /**
   * @remarks
   * Description: 提交授信申请
   * Summary: 提交授信申请
   */
  async applyAntchainAtoTradeCreditgranting(request: ApplyAntchainAtoTradeCreditgrantingRequest): Promise<ApplyAntchainAtoTradeCreditgrantingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyAntchainAtoTradeCreditgrantingEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 提交授信申请
   * Summary: 提交授信申请
   */
  async applyAntchainAtoTradeCreditgrantingEx(request: ApplyAntchainAtoTradeCreditgrantingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyAntchainAtoTradeCreditgrantingResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyAntchainAtoTradeCreditgrantingResponse>(await this.doRequest("1.0", "antchain.ato.trade.creditgranting.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyAntchainAtoTradeCreditgrantingResponse({}));
  }

  /**
   * @remarks
   * Description: 授信信息查询
   * Summary: 授信信息查询
   */
  async queryAntchainAtoTradeCreditgranting(request: QueryAntchainAtoTradeCreditgrantingRequest): Promise<QueryAntchainAtoTradeCreditgrantingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainAtoTradeCreditgrantingEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 授信信息查询
   * Summary: 授信信息查询
   */
  async queryAntchainAtoTradeCreditgrantingEx(request: QueryAntchainAtoTradeCreditgrantingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainAtoTradeCreditgrantingResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainAtoTradeCreditgrantingResponse>(await this.doRequest("1.0", "antchain.ato.trade.creditgranting.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainAtoTradeCreditgrantingResponse({}));
  }

  /**
   * @remarks
   * Description: 授信授权申请
   * Summary: 授信授权申请
   */
  async authAntchainAtoTradeCreditgranting(request: AuthAntchainAtoTradeCreditgrantingRequest): Promise<AuthAntchainAtoTradeCreditgrantingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authAntchainAtoTradeCreditgrantingEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 授信授权申请
   * Summary: 授信授权申请
   */
  async authAntchainAtoTradeCreditgrantingEx(request: AuthAntchainAtoTradeCreditgrantingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthAntchainAtoTradeCreditgrantingResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthAntchainAtoTradeCreditgrantingResponse>(await this.doRequest("1.0", "antchain.ato.trade.creditgranting.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthAntchainAtoTradeCreditgrantingResponse({}));
  }

  /**
   * @remarks
   * Description: 商户查询授权
   * Summary: 商户查询授权
   */
  async queryAntchainAtoTradeCreditauth(request: QueryAntchainAtoTradeCreditauthRequest): Promise<QueryAntchainAtoTradeCreditauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainAtoTradeCreditauthEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 商户查询授权
   * Summary: 商户查询授权
   */
  async queryAntchainAtoTradeCreditauthEx(request: QueryAntchainAtoTradeCreditauthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainAtoTradeCreditauthResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainAtoTradeCreditauthResponse>(await this.doRequest("1.0", "antchain.ato.trade.creditauth.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainAtoTradeCreditauthResponse({}));
  }

  /**
   * @remarks
   * Description: 标准合同创建接口
   * Summary: 标准合同创建接口
   */
  async createAntchainAtoSignFlow(request: CreateAntchainAtoSignFlowRequest): Promise<CreateAntchainAtoSignFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAntchainAtoSignFlowEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 标准合同创建接口
   * Summary: 标准合同创建接口
   */
  async createAntchainAtoSignFlowEx(request: CreateAntchainAtoSignFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAntchainAtoSignFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAntchainAtoSignFlowResponse>(await this.doRequest("1.0", "antchain.ato.sign.flow.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAntchainAtoSignFlowResponse({}));
  }

  /**
   * @remarks
   * Description: 支付宝结算到卡交易流水任务创建接口
   * Summary: 支付宝结算到卡交易流水任务创建接口
   */
  async initAntchainAtoFundAlipaysettletocard(request: InitAntchainAtoFundAlipaysettletocardRequest): Promise<InitAntchainAtoFundAlipaysettletocardResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initAntchainAtoFundAlipaysettletocardEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 支付宝结算到卡交易流水任务创建接口
   * Summary: 支付宝结算到卡交易流水任务创建接口
   */
  async initAntchainAtoFundAlipaysettletocardEx(request: InitAntchainAtoFundAlipaysettletocardRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitAntchainAtoFundAlipaysettletocardResponse> {
    Util.validateModel(request);
    return $tea.cast<InitAntchainAtoFundAlipaysettletocardResponse>(await this.doRequest("1.0", "antchain.ato.fund.alipaysettletocard.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitAntchainAtoFundAlipaysettletocardResponse({}));
  }

  /**
   * @remarks
   * Description: 支付宝结算到卡流水任务结果查询接口
   * Summary: 支付宝结算到卡流水任务结果查询接口
   */
  async queryAntchainAtoFundAlipaysettletocard(request: QueryAntchainAtoFundAlipaysettletocardRequest): Promise<QueryAntchainAtoFundAlipaysettletocardResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainAtoFundAlipaysettletocardEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 支付宝结算到卡流水任务结果查询接口
   * Summary: 支付宝结算到卡流水任务结果查询接口
   */
  async queryAntchainAtoFundAlipaysettletocardEx(request: QueryAntchainAtoFundAlipaysettletocardRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainAtoFundAlipaysettletocardResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainAtoFundAlipaysettletocardResponse>(await this.doRequest("1.0", "antchain.ato.fund.alipaysettletocard.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainAtoFundAlipaysettletocardResponse({}));
  }

  /**
   * @remarks
   * Description: 创建结算到卡交易流水任务接口
   * Summary: 创建结算到卡交易流水任务接口
   */
  async initAntchainAtoTradeSettletocard(request: InitAntchainAtoTradeSettletocardRequest): Promise<InitAntchainAtoTradeSettletocardResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initAntchainAtoTradeSettletocardEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建结算到卡交易流水任务接口
   * Summary: 创建结算到卡交易流水任务接口
   */
  async initAntchainAtoTradeSettletocardEx(request: InitAntchainAtoTradeSettletocardRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitAntchainAtoTradeSettletocardResponse> {
    Util.validateModel(request);
    return $tea.cast<InitAntchainAtoTradeSettletocardResponse>(await this.doRequest("1.0", "antchain.ato.trade.settletocard.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitAntchainAtoTradeSettletocardResponse({}));
  }

  /**
   * @remarks
   * Description: 下载结算到卡流水任务接口
   * Summary: 下载结算到卡流水任务接口
   */
  async queryAntchainAtoTradeSettletocard(request: QueryAntchainAtoTradeSettletocardRequest): Promise<QueryAntchainAtoTradeSettletocardResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainAtoTradeSettletocardEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 下载结算到卡流水任务接口
   * Summary: 下载结算到卡流水任务接口
   */
  async queryAntchainAtoTradeSettletocardEx(request: QueryAntchainAtoTradeSettletocardRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainAtoTradeSettletocardResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainAtoTradeSettletocardResponse>(await this.doRequest("1.0", "antchain.ato.trade.settletocard.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainAtoTradeSettletocardResponse({}));
  }

  /**
   * @remarks
   * Description: 新融资状态机资方主动重试接口
   * Summary: 新融资状态机资方主动重试接口
   */
  async execAntchainAtoFundPlan(request: ExecAntchainAtoFundPlanRequest): Promise<ExecAntchainAtoFundPlanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execAntchainAtoFundPlanEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 新融资状态机资方主动重试接口
   * Summary: 新融资状态机资方主动重试接口
   */
  async execAntchainAtoFundPlanEx(request: ExecAntchainAtoFundPlanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecAntchainAtoFundPlanResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecAntchainAtoFundPlanResponse>(await this.doRequest("1.0", "antchain.ato.fund.plan.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecAntchainAtoFundPlanResponse({}));
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
