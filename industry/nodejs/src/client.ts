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

// 银行卡信息
export class CardInfo extends $tea.Model {
  // 卡户名
  accountHolderName: string;
  // 卡号
  accountNo: string;
  // 银行名称
  accountInstName: string;
  // 银行缩写
  accountInstId: string;
  // 账号使用类型
  // 对公-01
  // 对私-02
  usageType: string;
  // 联行号
  bankCode?: string;
  // 开户行所在省份
  accountInstProvince: string;
  // 开户行所在城市
  accountInstCity: string;
  // 开户行支行名称
  accountBranchName: string;
  static names(): { [key: string]: string } {
    return {
      accountHolderName: 'account_holder_name',
      accountNo: 'account_no',
      accountInstName: 'account_inst_name',
      accountInstId: 'account_inst_id',
      usageType: 'usage_type',
      bankCode: 'bank_code',
      accountInstProvince: 'account_inst_province',
      accountInstCity: 'account_inst_city',
      accountBranchName: 'account_branch_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accountHolderName: 'string',
      accountNo: 'string',
      accountInstName: 'string',
      accountInstId: 'string',
      usageType: 'string',
      bankCode: 'string',
      accountInstProvince: 'string',
      accountInstCity: 'string',
      accountBranchName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 地址信息
export class AddressInfo extends $tea.Model {
  // 省份编码
  provinceCode: string;
  // 城市编码
  cityCode: string;
  // 区域编码
  districtCode: string;
  // 详细地址
  address: string;
  static names(): { [key: string]: string } {
    return {
      provinceCode: 'province_code',
      cityCode: 'city_code',
      districtCode: 'district_code',
      address: 'address',
    };
  }

  static types(): { [key: string]: any } {
    return {
      provinceCode: 'string',
      cityCode: 'string',
      districtCode: 'string',
      address: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 结算规则
export class SettleRule extends $tea.Model {
  // 结算类型， bankCard-表示结算到银行卡；alipayAccount-表示结算到支付宝账号
  defaultSettleType: string;
  // 结算目标
  // 如果settle_type = bankCard, 这里填写银行卡卡号;
  // 如果settle_type = alipayAccount, 这里填写支付宝账号登录号, 且要求与商户名称name同名
  defaultSettleTarget: string;
  static names(): { [key: string]: string } {
    return {
      defaultSettleType: 'default_settle_type',
      defaultSettleTarget: 'default_settle_target',
    };
  }

  static types(): { [key: string]: any } {
    return {
      defaultSettleType: 'string',
      defaultSettleTarget: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 联系人信息
export class ContactInfo extends $tea.Model {
  // 联系人姓名
  name: string;
  // 联系人手机号码
  mobile: string;
  // 联系人电话号码
  phone?: string;
  // 联系人类型, LEGAL_PERSON-法人；CONTROLLER-实际控制人；AGENT-代理人；OTHER-其他
  type: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      mobile: 'mobile',
      phone: 'phone',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      mobile: 'string',
      phone: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 二级商户进件申请单
export class MerchantOrderInfo extends $tea.Model {
  // 申请单id
  orderId: string;
  // 平台方的用户id, 保持唯一
  merchantUserId: string;
  // 申请状态 99-已完结;-1-失败;031-审核中
  status: string;
  // 风控审批状态。CREATE：已创建待审批、SKIP：跳过风控审批步骤、PASS：风控审核通过、REJECT：风控审批拒绝
  fkAudit?: string;
  // 风控审批备注
  fkAuditMemo?: string;
  // 客资审核状态。CREATE：已创建待审批、SKIP：跳过客资审批步骤、PASS：客资审核通过、REJECT：客资审批拒绝客资审核状态。CREATE：已创建待审批、SKIP：跳过客资审批步骤、PASS：客资审核通过、REJECT：客资审批拒绝
  kzAudit?: string;
  // 客资审批备注
  kzAuditMemo?: string;
  // 二级商户确认状态。CREATE：已发起二级商户确认、SKIP：无需确认、FAIL：签约失败、NOT_CONFIRM：商户未确认、FINISH签约完成
  subConfirm?: string;
  // 进件备注, 主要用于保存审核拒绝原因
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      merchantUserId: 'merchant_user_id',
      status: 'status',
      fkAudit: 'fk_audit',
      fkAuditMemo: 'fk_audit_memo',
      kzAudit: 'kz_audit',
      kzAuditMemo: 'kz_audit_memo',
      subConfirm: 'sub_confirm',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      merchantUserId: 'string',
      status: 'string',
      fkAudit: 'string',
      fkAuditMemo: 'string',
      kzAudit: 'string',
      kzAuditMemo: 'string',
      subConfirm: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商户资质信息
export class QualificationInfo extends $tea.Model {
  // 商户行业资质类型,  参考https://mif-pub.alipayobjects.com/QualificationType.xlsx
  industryQualificationType: string;
  // 商户行业资质图片
  industryQualificationImage: string;
  static names(): { [key: string]: string } {
    return {
      industryQualificationType: 'industry_qualification_type',
      industryQualificationImage: 'industry_qualification_image',
    };
  }

  static types(): { [key: string]: any } {
    return {
      industryQualificationType: 'string',
      industryQualificationImage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 站点信息
export class SiteInfo extends $tea.Model {
  // 站点类型 网站-01 APP-02 服务窗-03 公众号-04 其他-05 支付宝小程序-06
  siteType: string;
  // 站点名称
  siteName?: string;
  // 站点地址
  siteUrl: string;
  static names(): { [key: string]: string } {
    return {
      siteType: 'site_type',
      siteName: 'site_name',
      siteUrl: 'site_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      siteType: 'string',
      siteName: 'string',
      siteUrl: 'string',
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

export class CreateMerchantSellerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // source, 由中台为业务方分配, 作为业务来源标识
  source: string;
  // 平台方下的用户id, 唯一， 跟merchant_login_name不能同时为空
  merchantUserId?: string;
  // 商户登录账号, 跟merchant_user_id不能同时为空
  merchantLoginName?: string;
  // 商户别名, 会展示在账单以及支付结果页中
  merchantAliasName: string;
  // 商户类别码mcc，参见https://gw.alipayobjects.com/os/bmw-prod/05c9a32e-42d1-436b-ace7-13101d91f672.xlsx
  mcc: string;
  // 法人姓名，merchant_type = 01时必填
  legalName?: string;
  // 默认可不填，认为legal_cert_no是大陆身份证。类型包括：100 大陆身份证；105 港澳居民往来内地通行证；106 台湾同胞往来大陆通行证；108 外国人居留证
  legalCertType?: string;
  // 商户法人身份证号码, merchant_type = 01时必填
  legalCertNo?: string;
  // 商户经营地址
  businessAddress: AddressInfo;
  // 商户联系人信息
  contactInfos: ContactInfo[];
  // 商户使用服务 当面付、app支付、wap支付、电脑支付
  service: string[];
  // 默认结算规则
  defaultSettleRule: SettleRule;
  // 银行卡结算信息, 结算到银行卡时必填, 当前仅支持填入一张卡
  bizCards?: CardInfo;
  // 请求单据号，32位。
  requestId: string;
  // 商户证件图片，如果是特殊行业必填
  certImage?: string;
  // 法人身份证正面图片 ，如果是特殊行业必填
  legalCertFrontImage?: string;
  // 法人身份证反面图片，如果是特殊行业必填
  legalCertBackImage?: string;
  // 商户行业资质, 如果是特殊行业必填
  qualifications?: QualificationInfo[];
  // 授权函图片。当商户名与结算卡户名不一致（模板参考https://gw.alipayobjects.com/os/skylark-tools/public/files/d5fcbe7463d7159a0d362da417d157ed.docx），或涉及外籍法人（这种情况上传任意能证明身份的图片）时必填
  licenseAuthLetterImage?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      source: 'source',
      merchantUserId: 'merchant_user_id',
      merchantLoginName: 'merchant_login_name',
      merchantAliasName: 'merchant_alias_name',
      mcc: 'mcc',
      legalName: 'legal_name',
      legalCertType: 'legal_cert_type',
      legalCertNo: 'legal_cert_no',
      businessAddress: 'business_address',
      contactInfos: 'contact_infos',
      service: 'service',
      defaultSettleRule: 'default_settle_rule',
      bizCards: 'biz_cards',
      requestId: 'request_id',
      certImage: 'cert_image',
      legalCertFrontImage: 'legal_cert_front_image',
      legalCertBackImage: 'legal_cert_back_image',
      qualifications: 'qualifications',
      licenseAuthLetterImage: 'license_auth_letter_image',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      source: 'string',
      merchantUserId: 'string',
      merchantLoginName: 'string',
      merchantAliasName: 'string',
      mcc: 'string',
      legalName: 'string',
      legalCertType: 'string',
      legalCertNo: 'string',
      businessAddress: AddressInfo,
      contactInfos: { 'type': 'array', 'itemType': ContactInfo },
      service: { 'type': 'array', 'itemType': 'string' },
      defaultSettleRule: SettleRule,
      bizCards: CardInfo,
      requestId: 'string',
      certImage: 'string',
      legalCertFrontImage: 'string',
      legalCertBackImage: 'string',
      qualifications: { 'type': 'array', 'itemType': QualificationInfo },
      licenseAuthLetterImage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateMerchantSellerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 申请单id
  orderId?: string;
  // 商户user_id
  merchantUserId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
      merchantUserId: 'merchant_user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
      merchantUserId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMerchantSignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // source, 由中台为业务方分配, 标识业务来源
  source: string;
  // 申请单id, 跟merchant_user_id不能同时为空
  orderId?: string;
  // 平台方下的用户id, 保持唯一，跟order_id不能同时为空; 如果只传该字段, 获取该用户id的最新一次进件结果
  merchantUserId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      source: 'source',
      orderId: 'order_id',
      merchantUserId: 'merchant_user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      source: 'string',
      orderId: 'string',
      merchantUserId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMerchantSignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 进件申请单信息
  orderInfo?: MerchantOrderInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderInfo: 'order_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderInfo: MerchantOrderInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadMerchantImageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // source, 由中台为业务方分配, 作为业务来源标识
  source: string;
  // file_id
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      source: 'source',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      source: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadMerchantImageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 图片id
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

export class SignMerchantAgreementRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 来源场景码, 由中台为业务方分配
  source: string;
  // 商家pid
  merchantUserId: string;
  // 个人签约产品码，商户代扣场景固定GENERAL_WITHHOLDING_P
  personalProductCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      source: 'source',
      merchantUserId: 'merchant_user_id',
      personalProductCode: 'personal_product_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      source: 'string',
      merchantUserId: 'string',
      personalProductCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SignMerchantAgreementResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签约字符串
  signStr?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      signStr: 'sign_str',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      signStr: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PayTradePageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 来源场景码,IP版权默认传IP_COPYRIGHT
  source: string;
  // 渠道 自营平台、第三方平台等
  channel: string;
  // 支付成功后returl地址
  returnUrl: string;
  // 外部单据号。32 个字符以内的大小，仅支持字母、数字。需保证该参数在业务侧不重复。
  merchantOrderNo: string;
  // 收单金额，"10.11"代表10.11元,最小粒度到分,小数点后2位，不支持高精度和负数
  totalAmount: string;
  // 交易标题等。注意：不可使用特殊字符，如 /，=，& 等。不超过256
  subject: string;
  // 支付渠道产品码；
  // 目前只支持直付通，code= ZFT;
  payProductCode: string;
  // 默认：人民币（156）
  transCurrency?: string;
  // 平台方下的用户id (即商家id)
  merchantUserId: string;
  // 订单描述。不超过128长度
  body?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      source: 'source',
      channel: 'channel',
      returnUrl: 'return_url',
      merchantOrderNo: 'merchant_order_no',
      totalAmount: 'total_amount',
      subject: 'subject',
      payProductCode: 'pay_product_code',
      transCurrency: 'trans_currency',
      merchantUserId: 'merchant_user_id',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      source: 'string',
      channel: 'string',
      returnUrl: 'string',
      merchantOrderNo: 'string',
      totalAmount: 'string',
      subject: 'string',
      payProductCode: 'string',
      transCurrency: 'string',
      merchantUserId: 'string',
      body: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PayTradePageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 收银台页面String
  form?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      form: 'form',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      form: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTradeOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 中台颁发的场景码，IP_COPYRIGHT
  source: string;
  // 外部商户订单号，不超32位
  merchantOrderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      source: 'source',
      merchantOrderNo: 'merchant_order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      source: 'string',
      merchantOrderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTradeOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 支付宝交易号
  tradeNo?: string;
  // 交易状态：WAIT_BUYER_PAY（交易创建，等待买家付款）、TRADE_CLOSED（未付款交易超时关闭，或支付完成后全额退款）、TRADE_SUCCESS（交易支付成功）
  tradeStatus?: string;
  // 交易金额，"10.11"
  totalAmount?: string;
  // 商户订单号out_trade_no
  outTradeNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tradeNo: 'trade_no',
      tradeStatus: 'trade_status',
      totalAmount: 'total_amount',
      outTradeNo: 'out_trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tradeNo: 'string',
      tradeStatus: 'string',
      totalAmount: 'string',
      outTradeNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTradeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 来源场景码, 由中台分配给业务方
  source: string;
  // 渠道 自营平台、第三方平台等
  channel: string;
  // 支付成功后returl地址
  returnUrl?: string;
  // 外部单据号。32 个字符以内的大小，仅支持字母、数字。需保证该参数在业务侧不重复。
  merchantOrderNo: string;
  // 收单金额，"10.11"代表10.11元,最小粒度到分,小数点后2位，不支持高精度和负数
  totalAmount: string;
  // 交易标题等。注意：不可使用特殊字符，如 /，=，& 等。不超过256
  subject: string;
  // 支付渠道产品码； 目前只支持直付通，code= ZFT;
  payProductCode?: string;
  // 交易币种，默认：人民币（156）
  transCurrency?: string;
  // 平台方下的商家id
  merchantUserId: string;
  // 买家的支付宝唯一用户号（2088开头的16位纯数字）。
  // 小程序支付场景必填。
  buyerId?: string;
  // 对一笔交易的具体描述信息。如果是多种商品，请将商品描述字符串累加传给body。
  body?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      source: 'source',
      channel: 'channel',
      returnUrl: 'return_url',
      merchantOrderNo: 'merchant_order_no',
      totalAmount: 'total_amount',
      subject: 'subject',
      payProductCode: 'pay_product_code',
      transCurrency: 'trans_currency',
      merchantUserId: 'merchant_user_id',
      buyerId: 'buyer_id',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      source: 'string',
      channel: 'string',
      returnUrl: 'string',
      merchantOrderNo: 'string',
      totalAmount: 'string',
      subject: 'string',
      payProductCode: 'string',
      transCurrency: 'string',
      merchantUserId: 'string',
      buyerId: 'string',
      body: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTradeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 支付宝交易号，64位以内
  tradeNo?: string;
  // 外部单据号。32 个字符以内的大小，仅支持字母、数字。需保证该参数在业务侧不重复。
  merchantOrderNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tradeNo: 'trade_no',
      merchantOrderNo: 'merchant_order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tradeNo: 'string',
      merchantOrderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PayTradeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 来源场景码, 由中台分配给业务方
  source: string;
  // 外部单据号。32 个字符以内的大小，仅支持字母、数字。需保证该参数在业务侧不重复。
  merchantOrderNo: string;
  // 收单金额，"10.11"代表10.11元,最小粒度到分,小数点后2位，不支持高精度和负数
  totalAmount: string;
  // 交易标题等。注意：不可使用特殊字符，如 /，=，& 等。不超过256
  subject: string;
  // 平台方下的商家id
  merchantUserId: string;
  // 交易币种，默认：人民币（156）
  transCurrency?: string;
  // 买家支付宝uid
  buyerId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      source: 'source',
      merchantOrderNo: 'merchant_order_no',
      totalAmount: 'total_amount',
      subject: 'subject',
      merchantUserId: 'merchant_user_id',
      transCurrency: 'trans_currency',
      buyerId: 'buyer_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      source: 'string',
      merchantOrderNo: 'string',
      totalAmount: 'string',
      subject: 'string',
      merchantUserId: 'string',
      transCurrency: 'string',
      buyerId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PayTradeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 支付宝交易号，64位以内
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
          sdk_version: "1.1.5",
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
   * Description: 商业卖家商户注册
   * Summary: 行业卖家商户注册
   */
  async createMerchantSeller(request: CreateMerchantSellerRequest): Promise<CreateMerchantSellerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createMerchantSellerEx(request, headers, runtime);
  }

  /**
   * Description: 商业卖家商户注册
   * Summary: 行业卖家商户注册
   */
  async createMerchantSellerEx(request: CreateMerchantSellerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateMerchantSellerResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateMerchantSellerResponse>(await this.doRequest("1.0", "antcloud.industry.merchant.seller.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateMerchantSellerResponse({}));
  }

  /**
   * Description: 行业卖家商户注册结果查询服务
   * Summary: 行业卖家商户注册结果查询服务
   */
  async queryMerchantSign(request: QueryMerchantSignRequest): Promise<QueryMerchantSignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMerchantSignEx(request, headers, runtime);
  }

  /**
   * Description: 行业卖家商户注册结果查询服务
   * Summary: 行业卖家商户注册结果查询服务
   */
  async queryMerchantSignEx(request: QueryMerchantSignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMerchantSignResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMerchantSignResponse>(await this.doRequest("1.0", "antcloud.industry.merchant.sign.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMerchantSignResponse({}));
  }

  /**
   * Description: 行业商家图片上传
   * Summary: 行业商家图片上传
   */
  async uploadMerchantImage(request: UploadMerchantImageRequest): Promise<UploadMerchantImageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadMerchantImageEx(request, headers, runtime);
  }

  /**
   * Description: 行业商家图片上传
   * Summary: 行业商家图片上传
   */
  async uploadMerchantImageEx(request: UploadMerchantImageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadMerchantImageResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antcloud.industry.merchant.image.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadMerchantImageResponse = new UploadMerchantImageResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadMerchantImageResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
    }

    Util.validateModel(request);
    return $tea.cast<UploadMerchantImageResponse>(await this.doRequest("1.0", "antcloud.industry.merchant.image.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadMerchantImageResponse({}));
  }

  /**
   * Description: 支付宝个人协议页面签约接口
   * Summary: 支付宝个人协议页面签约接口
   */
  async signMerchantAgreement(request: SignMerchantAgreementRequest): Promise<SignMerchantAgreementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.signMerchantAgreementEx(request, headers, runtime);
  }

  /**
   * Description: 支付宝个人协议页面签约接口
   * Summary: 支付宝个人协议页面签约接口
   */
  async signMerchantAgreementEx(request: SignMerchantAgreementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SignMerchantAgreementResponse> {
    Util.validateModel(request);
    return $tea.cast<SignMerchantAgreementResponse>(await this.doRequest("1.0", "antcloud.industry.merchant.agreement.sign", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SignMerchantAgreementResponse({}));
  }

  /**
   * Description: 买家卖家收单交易，直接收款给卖家过渡户
   * Summary: 买家卖家收单交易-电脑版
   */
  async payTradePage(request: PayTradePageRequest): Promise<PayTradePageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.payTradePageEx(request, headers, runtime);
  }

  /**
   * Description: 买家卖家收单交易，直接收款给卖家过渡户
   * Summary: 买家卖家收单交易-电脑版
   */
  async payTradePageEx(request: PayTradePageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PayTradePageResponse> {
    Util.validateModel(request);
    return $tea.cast<PayTradePageResponse>(await this.doRequest("1.0", "antcloud.industry.trade.page.pay", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PayTradePageResponse({}));
  }

  /**
   * Description: 交易支付结果查询接口
   * Summary: 交易结果查询
   */
  async queryTradeOrder(request: QueryTradeOrderRequest): Promise<QueryTradeOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTradeOrderEx(request, headers, runtime);
  }

  /**
   * Description: 交易支付结果查询接口
   * Summary: 交易结果查询
   */
  async queryTradeOrderEx(request: QueryTradeOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTradeOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTradeOrderResponse>(await this.doRequest("1.0", "antcloud.industry.trade.order.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTradeOrderResponse({}));
  }

  /**
   * Description: 买家卖家收单交易
   * Summary: 统一收单交易创建
   */
  async createTrade(request: CreateTradeRequest): Promise<CreateTradeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createTradeEx(request, headers, runtime);
  }

  /**
   * Description: 买家卖家收单交易
   * Summary: 统一收单交易创建
   */
  async createTradeEx(request: CreateTradeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateTradeResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTradeResponse>(await this.doRequest("1.0", "antcloud.industry.trade.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateTradeResponse({}));
  }

  /**
   * Description: 统一收单交易支付接口
   * Summary: 统一收单交易支付接口
   */
  async payTrade(request: PayTradeRequest): Promise<PayTradeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.payTradeEx(request, headers, runtime);
  }

  /**
   * Description: 统一收单交易支付接口
   * Summary: 统一收单交易支付接口
   */
  async payTradeEx(request: PayTradeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PayTradeResponse> {
    Util.validateModel(request);
    return $tea.cast<PayTradeResponse>(await this.doRequest("1.0", "antcloud.industry.trade.pay", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PayTradeResponse({}));
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
