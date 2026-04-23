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

// 商品规格选项
export class ProductSpecOption extends $tea.Model {
  // 规格key
  specKey?: string;
  // 规格名称
  displayName?: string;
  // 规格值
  specValue?: string;
  static names(): { [key: string]: string } {
    return {
      specKey: 'spec_key',
      displayName: 'display_name',
      specValue: 'spec_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      specKey: 'string',
      displayName: 'string',
      specValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 文件信息
export class FileInfo extends $tea.Model {
  // 文件名称
  fileName: string;
  // 文件key
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

// 付款项目
export class PaymentItem extends $tea.Model {
  // 付款金额，单位分
  amount?: number;
  // 付款项目类型
  paymentType?: string;
  static names(): { [key: string]: string } {
    return {
      amount: 'amount',
      paymentType: 'payment_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      amount: 'number',
      paymentType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 随时享-商品规格值对象
export class ProductSpecValue extends $tea.Model {
  // 规格值
  specValue?: string;
  // 规格图片key
  imageFileKey?: string;
  // 规格图片http链接
  largeImageFileKey?: string;
  static names(): { [key: string]: string } {
    return {
      specValue: 'spec_value',
      imageFileKey: 'image_file_key',
      largeImageFileKey: 'large_image_file_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      specValue: 'string',
      imageFileKey: 'string',
      largeImageFileKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品租赁价格规格
export class LeasePriceProp extends $tea.Model {
  // 商户商品skuId
  merchantSkuId?: string;
  // 商品规格列表
  productSpecOptionList?: ProductSpecOption[];
  // 规格图片
  specImageFileKey?: string;
  // 规格图片
  largeSpecImageFileKey?: string;
  // 原订单总金额（单位分）
  originTotalRentMoney?: number;
  // 现订单总金额（单位分）
  totalRentMoney?: number;
  // 原日租金（单位分）
  originDailyRentMoney?: number;
  // 现日租金（单位分）
  dailyRentMoney?: number;
  // 库存
  stockQuantity?: number;
  // 续租价（单位分）
  renewPrice?: number;
  // 买断价（单位分）
  buyoutPrice?: number;
  // 是否可售卖
  forSale?: boolean;
  static names(): { [key: string]: string } {
    return {
      merchantSkuId: 'merchant_sku_id',
      productSpecOptionList: 'product_spec_option_list',
      specImageFileKey: 'spec_image_file_key',
      largeSpecImageFileKey: 'large_spec_image_file_key',
      originTotalRentMoney: 'origin_total_rent_money',
      totalRentMoney: 'total_rent_money',
      originDailyRentMoney: 'origin_daily_rent_money',
      dailyRentMoney: 'daily_rent_money',
      stockQuantity: 'stock_quantity',
      renewPrice: 'renew_price',
      buyoutPrice: 'buyout_price',
      forSale: 'for_sale',
    };
  }

  static types(): { [key: string]: any } {
    return {
      merchantSkuId: 'string',
      productSpecOptionList: { 'type': 'array', 'itemType': ProductSpecOption },
      specImageFileKey: 'string',
      largeSpecImageFileKey: 'string',
      originTotalRentMoney: 'number',
      totalRentMoney: 'number',
      originDailyRentMoney: 'number',
      dailyRentMoney: 'number',
      stockQuantity: 'number',
      renewPrice: 'number',
      buyoutPrice: 'number',
      forSale: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 赎回结果信息
export class MerchantPerformanceRedeemResultInfo extends $tea.Model {
  // 回购支付方式	
  // ONLINE-线上
  // OFFLINE-线下
  redeemWay?: string;
  // 回购时间
  redeemTime?: string;
  // 回购原因
  // ACTIVE_REDEEM("ACTIVE_REDEEM", "自主赎回"),
  // RENTING_OUT_REDEEM("RENTING_OUT_REDEEM",
  //                                                                           "退租赎回"),
  // RENTING_AND_RESALE_REDEEM("RENTING_AND_RESALE_REDEEM",
  //                                                                                  "租转售赎回");
  redeemReason?: string;
  // 回购类型
  // TRANSFER，转账代偿
  // WITHHOLD，代扣代偿
  redeemType?: string;
  // 回购金额（分）
  redeemAmount?: number;
  // 回购状态
  // PAYING 回购中
  // SUCCESS 成功
  // FAILED 失败
  redeemStatus?: string;
  static names(): { [key: string]: string } {
    return {
      redeemWay: 'redeem_way',
      redeemTime: 'redeem_time',
      redeemReason: 'redeem_reason',
      redeemType: 'redeem_type',
      redeemAmount: 'redeem_amount',
      redeemStatus: 'redeem_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      redeemWay: 'string',
      redeemTime: 'string',
      redeemReason: 'string',
      redeemType: 'string',
      redeemAmount: 'number',
      redeemStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 单期明细
export class SingleTermDetail extends $tea.Model {
  // 期数
  periodNum: number;
  // 支付金额
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

// 经营分账收入方详情信息(商户控制台订单详情用)
export class OperationDivideTransInDetailInfo extends $tea.Model {
  // 分账收入方名称
  transInName?: string;
  // 分账收入方支付宝用户id, 支付宝2088id
  transInUserId?: string;
  // 分账金额，单位为分
  divideAmount?: number;
  // 分账描述
  desc?: string;
  // INIT("INIT", "初始化"),
  // PROCESSING("PROCESSING", "处理中"),
  // FAILED("FAILED", "失败"),
  // SUCCESS("SUCCESS", "分账成功");
  divideStatus?: string;
  static names(): { [key: string]: string } {
    return {
      transInName: 'trans_in_name',
      transInUserId: 'trans_in_user_id',
      divideAmount: 'divide_amount',
      desc: 'desc',
      divideStatus: 'divide_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      transInName: 'string',
      transInUserId: 'string',
      divideAmount: 'number',
      desc: 'string',
      divideStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 租赁价格方案
export class LeasePricePlan extends $tea.Model {
  // 租赁方案
  rentalPlan?: string;
  // 租赁周期
  rentalPeriod?: number;
  // 租赁价格属性列表
  leasePricePropList?: LeasePriceProp[];
  static names(): { [key: string]: string } {
    return {
      rentalPlan: 'rental_plan',
      rentalPeriod: 'rental_period',
      leasePricePropList: 'lease_price_prop_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      rentalPlan: 'string',
      rentalPeriod: 'number',
      leasePricePropList: { 'type': 'array', 'itemType': LeasePriceProp },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 静态数据模块详情
export class StaticDataModuleDetail extends $tea.Model {
  // 描述
  propertyText: string;
  // 商户类型
  propertyValue: string;
  // 图标
  icon?: string;
  // 置灰图标
  greyIcon?: string;
  // 叶子结点，目前存的一级类目下的二级类目
  childrenDetailList?: string;
  // 是否有叶子结点
  hasChildren?: boolean;
  static names(): { [key: string]: string } {
    return {
      propertyText: 'property_text',
      propertyValue: 'property_value',
      icon: 'icon',
      greyIcon: 'grey_icon',
      childrenDetailList: 'children_detail_list',
      hasChildren: 'has_children',
    };
  }

  static types(): { [key: string]: any } {
    return {
      propertyText: 'string',
      propertyValue: 'string',
      icon: 'string',
      greyIcon: 'string',
      childrenDetailList: 'string',
      hasChildren: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 站点信息
export class SiteInfo extends $tea.Model {
  // 小程序id
  tinyAppId?: string;
  // 站点名称
  siteName?: string;
  // 
  // 截图照片
  screenshotFile?: FileInfo;
  // 站点地址
  siteUrl?: string;
  // 站点类型
  // 网站: 01
  // APP: 02
  // 服务窗: 03
  // 公众号: 04
  // 其他: 05
  // 支付宝小程序: 06
  // 手机网站/H5: 07
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

// 订单所有商品信息模型
export class ScalperQueryOrderItem extends $tea.Model {
  // 订单商品名称
  orderItemsName?: string;
  // 订单商品数量
  orderItemsQuantity?: number;
  // 订单商品价格，单位：分
  orderItemsPrice?: number;
  static names(): { [key: string]: string } {
    return {
      orderItemsName: 'order_items_name',
      orderItemsQuantity: 'order_items_quantity',
      orderItemsPrice: 'order_items_price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderItemsName: 'string',
      orderItemsQuantity: 'number',
      orderItemsPrice: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 随时享-服务商平台报名商家信息对象
export class SignProductMerchant extends $tea.Model {
  // 商户商品spuId
  merchantProductId?: string;
  // 商户品牌
  merchantBrand?: string;
  // 商户logo
  merchantLogo?: string;
  // 商户logo
  largeMerchantLogo?: string;
  // 是否置灰
  grayed?: boolean;
  static names(): { [key: string]: string } {
    return {
      merchantProductId: 'merchant_product_id',
      merchantBrand: 'merchant_brand',
      merchantLogo: 'merchant_logo',
      largeMerchantLogo: 'large_merchant_logo',
      grayed: 'grayed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      merchantProductId: 'string',
      merchantBrand: 'string',
      merchantLogo: 'string',
      largeMerchantLogo: 'string',
      grayed: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 产品规格定义
export class ProductSpecConfig extends $tea.Model {
  // 规格名称
  specKey?: string;
  // 规格名称
  displayName?: string;
  // 允许值列表
  specValueList?: ProductSpecValue[];
  static names(): { [key: string]: string } {
    return {
      specKey: 'spec_key',
      displayName: 'display_name',
      specValueList: 'spec_value_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      specKey: 'string',
      displayName: 'string',
      specValueList: { 'type': 'array', 'itemType': ProductSpecValue },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 智租风控-子风险项
export class SubRentRiskItem extends $tea.Model {
  // 风险名称。枚举值：BASE_PERFORMANCE - 基础履约风险；OVERDUE - 逾期风险；MULTI_RENT - 共租风险。
  riskName: string;
  // 风险等级。枚举值：RANK0-无法判断；RANK1-极低风险；RANK2-低风险；RANK3-中风险；RANK4-高风险；RANK5-极高风险。 
  riskRank: string;
  // 风险描述
  riskDesc: string;
  static names(): { [key: string]: string } {
    return {
      riskName: 'risk_name',
      riskRank: 'risk_rank',
      riskDesc: 'risk_desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      riskName: 'string',
      riskRank: 'string',
      riskDesc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单还款策略
export class OrderRepayStrategy extends $tea.Model {
  // 还款期数
  termIndex?: number;
  // 每期应还租金(分)
  rentalMoney?: number;
  // 每期应付时间
  payDay?: string;
  // 付款项目列表
  paymentItemList?: PaymentItem[];
  // 是否无需履约
  noPerformance?: string;
  static names(): { [key: string]: string } {
    return {
      termIndex: 'term_index',
      rentalMoney: 'rental_money',
      payDay: 'pay_day',
      paymentItemList: 'payment_item_list',
      noPerformance: 'no_performance',
    };
  }

  static types(): { [key: string]: any } {
    return {
      termIndex: 'number',
      rentalMoney: 'number',
      payDay: 'string',
      paymentItemList: { 'type': 'array', 'itemType': PaymentItem },
      noPerformance: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 进件流程信息
export class ExpandProcessInfo extends $tea.Model {
  // TENANT_INDIRECT_MAINCLASS(间联类目)
  // TENANT_ENDPOINT（回调地址）
  // CUSTOM_SERVICE_INFO（客服信息）
  // AGENTCUSTOMERPESONINFO（间联客诉人员）
  // MERCHANT_EXPAND（商户进件）
  processNode?: string;
  // 是否已提交
  isSubmitted?: boolean;
  // 审核通过
  auditStatus?: string;
  static names(): { [key: string]: string } {
    return {
      processNode: 'process_node',
      isSubmitted: 'is_submitted',
      auditStatus: 'audit_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      processNode: 'string',
      isSubmitted: 'boolean',
      auditStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 投保商品信息
export class InsureProductInfo extends $tea.Model {
  // 商品库id
  productId: string;
  // 商品设备编号
  productImeiId: string;
  // 商品采购价，单位：分
  purchaseAmount: number;
  static names(): { [key: string]: string } {
    return {
      productId: 'product_id',
      productImeiId: 'product_imei_id',
      purchaseAmount: 'purchase_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      productId: 'string',
      productImeiId: 'string',
      purchaseAmount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 模板详情
export class TemplateInfo extends $tea.Model {
  // 模板id
  templateId: string;
  // 模板版本，不传取最新模板
  templateVersion?: number;
  // 模板参数，JSON格式，其中key对应模板中的名称，value对应其要渲染的值
  templateArgs?: string;
  // 模板所属商户id
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

// 主订单信息
export class OrderInfo extends $tea.Model {
  // 订单id
  orderId?: string;
  // 订单创建时间
  orderCreateTime?: string;
  // 订单支付时间
  orderPayTime?: string;
  // 租金总额(分)
  totalRentMoney?: number;
  // 租期
  rentTerm?: number;
  // 租期单位
  rentUnit?: string;
  // 订单状态
  orderStatus?: string;
  // 订单子状态
  orderSubStatus?: string;
  // 免押金额（分）
  depositPrice?: number;
  // 到期买断价(分)
  buyOutPrice?: number;
  // 物流方案
  logisticType?: string;
  // 到期形式
  // NA(0, "无意义"),
  // BUYOUT(1, "到期买断或归还"),
  // FREE_ON_RENT(2, "租满即送"),
  // RENEW_LEASE(3, "续租"),;
  dueMode?: number;
  // 首付款金额(分)
  downPayment?: number;
  // 商户统一社会信用代码
  merchantId?: string;
  // 商户名称
  merchantName?: string;
  // 订单开始履约期数
  divideStartTermIndex?: number;
  // 订单关联的营销id
  promotionId?: string;
  // 融资类型
  // SUPPLY_CHAIN_FINANCE
  fundMode?: string;
  // 订单支付渠道
  // ALIPAY
  // JDPAY
  payChannel?: string;
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      orderCreateTime: 'order_create_time',
      orderPayTime: 'order_pay_time',
      totalRentMoney: 'total_rent_money',
      rentTerm: 'rent_term',
      rentUnit: 'rent_unit',
      orderStatus: 'order_status',
      orderSubStatus: 'order_sub_status',
      depositPrice: 'deposit_price',
      buyOutPrice: 'buy_out_price',
      logisticType: 'logistic_type',
      dueMode: 'due_mode',
      downPayment: 'down_payment',
      merchantId: 'merchant_id',
      merchantName: 'merchant_name',
      divideStartTermIndex: 'divide_start_term_index',
      promotionId: 'promotion_id',
      fundMode: 'fund_mode',
      payChannel: 'pay_channel',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      orderCreateTime: 'string',
      orderPayTime: 'string',
      totalRentMoney: 'number',
      rentTerm: 'number',
      rentUnit: 'string',
      orderStatus: 'string',
      orderSubStatus: 'string',
      depositPrice: 'number',
      buyOutPrice: 'number',
      logisticType: 'string',
      dueMode: 'number',
      downPayment: 'number',
      merchantId: 'string',
      merchantName: 'string',
      divideStartTermIndex: 'number',
      promotionId: 'string',
      fundMode: 'string',
      payChannel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 通知信息
export class NoticeInfo extends $tea.Model {
  // 通知id
  noticeId?: number;
  // 通知标题
  title?: string;
  // 通知创建时间
  noticeCreateTime?: string;
  // 是否未读
  unread?: boolean;
  static names(): { [key: string]: string } {
    return {
      noticeId: 'notice_id',
      title: 'title',
      noticeCreateTime: 'notice_create_time',
      unread: 'unread',
    };
  }

  static types(): { [key: string]: any } {
    return {
      noticeId: 'number',
      title: 'string',
      noticeCreateTime: 'string',
      unread: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 审核信息
export class AuditInfo extends $tea.Model {
  // 审核步骤
  stage: string;
  // 审核主体
  auditSubject: string;
  // 审核状态
  status: string;
  // 审核时间
  applyDateStr: string;
  // 审核失败描述
  failReason: string;
  static names(): { [key: string]: string } {
    return {
      stage: 'stage',
      auditSubject: 'audit_subject',
      status: 'status',
      applyDateStr: 'apply_date_str',
      failReason: 'fail_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      stage: 'string',
      auditSubject: 'string',
      status: 'string',
      applyDateStr: 'string',
      failReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 法人信息修改
export class LegalInfoUpdate extends $tea.Model {
  // 法人名称
  legalName?: string;
  // 法人证件号
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

// 资产包履约计划
export class AssetPackagePromisePlan extends $tea.Model {
  // 账期
  periodNum?: number;
  // 还款时间yyyy-MM-dd
  payDay?: string;
  // 计划还款总额，单位为分
  totalAmount?: number;
  // 本金，单位为分
  principalAmount?: number;
  // 利息，单位为分
  interestAmount?: number;
  // 构成订单数
  orderCount?: number;
  static names(): { [key: string]: string } {
    return {
      periodNum: 'period_num',
      payDay: 'pay_day',
      totalAmount: 'total_amount',
      principalAmount: 'principal_amount',
      interestAmount: 'interest_amount',
      orderCount: 'order_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      periodNum: 'number',
      payDay: 'string',
      totalAmount: 'number',
      principalAmount: 'number',
      interestAmount: 'number',
      orderCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 营销抢购风险识别入参模型
export class PurchaseQueryModel extends $tea.Model {
  // 支付宝外部交易号
  outOrderNo?: string;
  // 支付宝内部生成的交易号
  orderNo?: string;
  // 银行卡号
  bankCardNo?: string;
  // 公司名称
  companyName?: string;
  // 金额，用户购买或使用服务时产生的具体金额，单位：分
  salesAmount?: number;
  static names(): { [key: string]: string } {
    return {
      outOrderNo: 'out_order_no',
      orderNo: 'order_no',
      bankCardNo: 'bank_card_no',
      companyName: 'company_name',
      salesAmount: 'sales_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      outOrderNo: 'string',
      orderNo: 'string',
      bankCardNo: 'string',
      companyName: 'string',
      salesAmount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 风险场景的决策结果
export class RiskScene extends $tea.Model {
  // 风险场景编码
  sceneCode: string;
  // 该场景的风险决策结果
  decision: string;
  static names(): { [key: string]: string } {
    return {
      sceneCode: 'scene_code',
      decision: 'decision',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sceneCode: 'string',
      decision: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分账关系页对象
export class RelationPage extends $tea.Model {
  // 分账关系id
  relationId: string;
  // 分账公司名称
  companyName: string;
  // 分账公司名称统一社会信用代码
  merchantId: string;
  // 审核状态
  status: string;
  // 商户公司统一社会信用代码
  subjectMerchantId: string;
  // 商户公司名称
  subjectCompanyName: string;
  // 支付渠道
  // ALIPAY
  // JDPAY
  payChannel?: string;
  static names(): { [key: string]: string } {
    return {
      relationId: 'relation_id',
      companyName: 'company_name',
      merchantId: 'merchant_id',
      status: 'status',
      subjectMerchantId: 'subject_merchant_id',
      subjectCompanyName: 'subject_company_name',
      payChannel: 'pay_channel',
    };
  }

  static types(): { [key: string]: any } {
    return {
      relationId: 'string',
      companyName: 'string',
      merchantId: 'string',
      status: 'string',
      subjectMerchantId: 'string',
      subjectCompanyName: 'string',
      payChannel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 行业履约风险识别入参模型
export class BaddebtQueryModel extends $tea.Model {
  // 服务分类，服务二级分类
  serviceCategory?: string;
  // 总金额，用户购买或使用服务时产生的具体金额
  totalAmount?: number;
  // 商品数量，用户购买或使用服务时产生的具体商品数量
  totalQuantity?: number;
  // 用户姓名
  userName?: string;
  // 服务商 pid
  isvPid?: string;
  // 终端唯一标识
  apdid?: string;
  static names(): { [key: string]: string } {
    return {
      serviceCategory: 'service_category',
      totalAmount: 'total_amount',
      totalQuantity: 'total_quantity',
      userName: 'user_name',
      isvPid: 'isv_pid',
      apdid: 'apdid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      serviceCategory: 'string',
      totalAmount: 'number',
      totalQuantity: 'number',
      userName: 'string',
      isvPid: 'string',
      apdid: 'string',
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
  productMainClass?: string;
  // 公司名称
  companyName?: string;
  // 公司别名
  companyAliasName?: string;
  // 公司数科租户id
  tenantId?: string;
  // 公司联系电话
  companyMobile?: string;
  // 公司联系地址
  companyAddress?: string;
  // 联系人姓名
  contactName?: string;
  // 联系人手机号码
  contactMobile?: string;
  // 商户类型： 01：企业；07：个体工商户 默认不填为01
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

// 分销渠道
export class SalesChannel extends $tea.Model {
  // 渠道码
  channelCode: string;
  // 渠道名称
  channelName: string;
  // 渠道级别，从小到大代表级别由高到低
  channelLevel: number;
  static names(): { [key: string]: string } {
    return {
      channelCode: 'channel_code',
      channelName: 'channel_name',
      channelLevel: 'channel_level',
    };
  }

  static types(): { [key: string]: any } {
    return {
      channelCode: 'string',
      channelName: 'string',
      channelLevel: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商家履约信息
export class MerchantOrderFulfillmentInfo extends $tea.Model {
  // 还款期数
  termIndex?: number;
  // 订单用户租期编号
  leaseTermIndex?: number;
  // 租期归还状态
  rentalReturnState?: string;
  // 还款方式
  returnWay?: string;
  // 支付类型
  payType?: string;
  // 实际到账金额
  totalMoney?: number;
  // 实际还款时间(yyyy-MM-dd HH:mm:ss)
  returnTime?: string;
  // 外部交易流水号
  returnVoucherSerial?: string;
  // 支付宝交易流水号
  alipayTradeNo?: string;
  // 资方公司名称
  fundCompanyName?: string;
  // 支付描述
  paymentDescription?: string;
  static names(): { [key: string]: string } {
    return {
      termIndex: 'term_index',
      leaseTermIndex: 'lease_term_index',
      rentalReturnState: 'rental_return_state',
      returnWay: 'return_way',
      payType: 'pay_type',
      totalMoney: 'total_money',
      returnTime: 'return_time',
      returnVoucherSerial: 'return_voucher_serial',
      alipayTradeNo: 'alipay_trade_no',
      fundCompanyName: 'fund_company_name',
      paymentDescription: 'payment_description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      termIndex: 'number',
      leaseTermIndex: 'number',
      rentalReturnState: 'string',
      returnWay: 'string',
      payType: 'string',
      totalMoney: 'number',
      returnTime: 'string',
      returnVoucherSerial: 'string',
      alipayTradeNo: 'string',
      fundCompanyName: 'string',
      paymentDescription: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户解约申请材料
export class TerminateApplyEvidence extends $tea.Model {
  // 用户申请解约问题类型
  terminateApplyReason?: string;
  // 用户申请解约问题描述
  terminateApplyRefer?: string;
  // 用户联系电话
  userPhoneNum?: string;
  // 用户申请解约证据（图片、视频）
  terminateApplyEvidences?: string[];
  // 用户申请提交材料时间
  terminateOperateTime?: string;
  static names(): { [key: string]: string } {
    return {
      terminateApplyReason: 'terminate_apply_reason',
      terminateApplyRefer: 'terminate_apply_refer',
      userPhoneNum: 'user_phone_num',
      terminateApplyEvidences: 'terminate_apply_evidences',
      terminateOperateTime: 'terminate_operate_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      terminateApplyReason: 'string',
      terminateApplyRefer: 'string',
      userPhoneNum: 'string',
      terminateApplyEvidences: { 'type': 'array', 'itemType': 'string' },
      terminateOperateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单物流信息
export class OrderLogisticInfo extends $tea.Model {
  // 物流单号
  logisticOrderId?: string;
  // 物流状态
  logisticStatus?: string;
  static names(): { [key: string]: string } {
    return {
      logisticOrderId: 'logistic_order_id',
      logisticStatus: 'logistic_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      logisticOrderId: 'string',
      logisticStatus: 'string',
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
  holdingTypeName: string;
  // 控股公司名称
  holdingCompany: string;
  // 证件号码
  certificateNumber: string;
  // 证件是否长期有效
  // 长期true，
  // 否则false
  longDate: boolean;
  // 失效时间
  // 商户控股信息longdate为true 时，可为空 ，格式YYYY-MM-DD
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

// 资产包履约计划分配明细
export class AssetPackagePlanAllocateDetail extends $tea.Model {
  // 订单id
  orderId?: string;
  // 商户租户id
  tenantId?: string;
  // 类型
  // PERFORMANCE 履约
  // ASSET_PACKAGE_EXCESS 资产包超额
  type?: string;
  // 用户还款期数
  periodNum?: number;
  // 用户还款时间yyyy-MM-dd
  payDay?: string;
  // 用户还款金额，单位为分
  payAmount?: number;
  // 分账比例(不存储实时计算)，保留两位小数，比例统一类型。
  divideRatio?: string;
  // 商户履约分账金额
  divideAmount?: number;
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      tenantId: 'tenant_id',
      type: 'type',
      periodNum: 'period_num',
      payDay: 'pay_day',
      payAmount: 'pay_amount',
      divideRatio: 'divide_ratio',
      divideAmount: 'divide_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      tenantId: 'string',
      type: 'string',
      periodNum: 'number',
      payDay: 'string',
      payAmount: 'number',
      divideRatio: 'string',
      divideAmount: 'number',
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
  applicationScene?: string;
  // 小程序id
  tinyAppId?: string;
  // 小程序名称
  siteName?: string;
  // 网站地址（pay_channel=ALIPAY必填）
  sitUrl?: string;
  // 商户名称。（pay_channel=ALIPAY必填）
  // 修改后的商户名称，将同步支付宝代扣签约页面字段展示
  // 
  merchantName?: string;
  // 商户服务名称。（pay_channel=ALIPAY必填）
  // 修改后的商户服务名称，将同步支付宝代扣签约页面字段展示
  merchantServiceName?: string;
  // 商户服务描述。（pay_channel=ALIPAY必填）
  // 修改后的商户服务描述，将同步支付宝代扣签约页面字段展示
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

// 智租风控-商品详情
export class ItemDetail extends $tea.Model {
  // 租赁商品类目，可选类型：
  // RENT_PHONE - 手机租赁；RENT_COMPUTER - 电脑/平板租赁；RENT_CAMERA - 数码摄像租赁；RENT_DIGITAL - 数码其他租赁；RENT_STATIONERY - 电子词典/电纸书/文化用品租赁；RENT_CLOTHING - 服装租赁
  goodsCategory?: string;
  // 租赁商品名称
  itemName?: string;
  // 租赁商品数量
  quantity?: number;
  static names(): { [key: string]: string } {
    return {
      goodsCategory: 'goods_category',
      itemName: 'item_name',
      quantity: 'quantity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      goodsCategory: 'string',
      itemName: 'string',
      quantity: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 云 api 风控查询响应
export class RiskGoModel extends $tea.Model {
  // 风险类型。
  // 枚举值：MARKETING_PURCHASE_COMMON 营销抢购风险识别；INDUSTRY_SCALPER_COMMON 行业黄牛风险识别；MARKETING_AWARDING_COMMON 营销发奖风险识别；INDUSTRY_FARMING_COMMON 行业刷单风险识别；INDUSTRY_BADDEBT_COMMON 履约坏账风险识别
  riskType: string;
  // 风险等级。
  // 枚举：rank0 无法判断；rank1 极低风险；rank2 较低风险；rank3 中风险；rank4 高风险；rank5 极高风险
  riskValue: string;
  // 风险描述
  riskDesc: string;
  // 风险标签
  infoCode?: string;
  static names(): { [key: string]: string } {
    return {
      riskType: 'risk_type',
      riskValue: 'risk_value',
      riskDesc: 'risk_desc',
      infoCode: 'info_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      riskType: 'string',
      riskValue: 'string',
      riskDesc: 'string',
      infoCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 单期取消模型
export class SingleCancelModel extends $tea.Model {
  // 第几期
  periodNum: number;
  // 其他方式还款的时间
  gmtPay: string;
  // 取消订单某一期代扣计划中以其他方式还款金额，单位为分
  payOffAmount: number;
  // 变更其他方式还款WECHAT:微信; BANK:银行
  // ALIPAY:支付宝
  // CASH:现金
  payOffType?: string;
  // 通过其他方式还款单号;例如银行流水号或微信流水号
  payOffNo?: string;
  // 其他方式还款银行名称，还款方式为银行时必填
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

// 模型结果详情
export class RiskModel extends $tea.Model {
  // 风险场景编码
  sceneCode: string;
  // 该风险场景的风险分值
  score: string;
  // 逾期率
  delinquencyRate?: string;
  // 风险建议
  riskAdvice?: string;
  // 风险等级
  riskRank?: string;
  // 流程id
  flowId: string;
  // 拒量模型捞回分
  mobThreeScore?: string;
  // 拒量模型首逾分
  fpdThirtyScore?: string;
  static names(): { [key: string]: string } {
    return {
      sceneCode: 'scene_code',
      score: 'score',
      delinquencyRate: 'delinquency_rate',
      riskAdvice: 'risk_advice',
      riskRank: 'risk_rank',
      flowId: 'flow_id',
      mobThreeScore: 'mob_three_score',
      fpdThirtyScore: 'fpd_thirty_score',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sceneCode: 'string',
      score: 'string',
      delinquencyRate: 'string',
      riskAdvice: 'string',
      riskRank: 'string',
      flowId: 'string',
      mobThreeScore: 'string',
      fpdThirtyScore: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 随时享-服务商平台场景商品列表resp
export class SceneProductInfoResp extends $tea.Model {
  // 平台商品id
  platformProductId?: string;
  // 商品名称
  productName?: string;
  // 封面首图url链接
  firstCoverImageUrl?: string;
  // 封面首图url链接
  largeFirstCoverImageUrl?: string;
  // 产品规格列表
  specConfigList?: ProductSpecConfig[];
  // 租赁方案
  rentalPlan?: string[];
  // 租赁周期
  rentalPeriod?: number[];
  // 可续租
  supportRenew?: boolean;
  // 可买断
  supportBuyout?: boolean;
  // 最低日租金
  lowestDailyRentMoney?: number;
  // 最低日租金
  lowestDailyRentMoneyYuan?: string;
  // 最高日租金
  highestDailyRentMoney?: number;
  // 最高日租金
  highestDailyRentMoneyYuan?: string;
  // 添加标志
  addedFlag?: boolean;
  // 报名商家列表
  signProductMerchantList?: SignProductMerchant[];
  // 报名商家数量
  signProductMerchantCount?: number;
  // 适用商家列表
  applyProductMerchantList?: SignProductMerchant[];
  // 适用商家数量
  applyProductMerchantCount?: number;
  // 场景商品上下架状态
  displayStatus?: string;
  // 推广方式
  deliveryMode?: string;
  static names(): { [key: string]: string } {
    return {
      platformProductId: 'platform_product_id',
      productName: 'product_name',
      firstCoverImageUrl: 'first_cover_image_url',
      largeFirstCoverImageUrl: 'large_first_cover_image_url',
      specConfigList: 'spec_config_list',
      rentalPlan: 'rental_plan',
      rentalPeriod: 'rental_period',
      supportRenew: 'support_renew',
      supportBuyout: 'support_buyout',
      lowestDailyRentMoney: 'lowest_daily_rent_money',
      lowestDailyRentMoneyYuan: 'lowest_daily_rent_money_yuan',
      highestDailyRentMoney: 'highest_daily_rent_money',
      highestDailyRentMoneyYuan: 'highest_daily_rent_money_yuan',
      addedFlag: 'added_flag',
      signProductMerchantList: 'sign_product_merchant_list',
      signProductMerchantCount: 'sign_product_merchant_count',
      applyProductMerchantList: 'apply_product_merchant_list',
      applyProductMerchantCount: 'apply_product_merchant_count',
      displayStatus: 'display_status',
      deliveryMode: 'delivery_mode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      platformProductId: 'string',
      productName: 'string',
      firstCoverImageUrl: 'string',
      largeFirstCoverImageUrl: 'string',
      specConfigList: { 'type': 'array', 'itemType': ProductSpecConfig },
      rentalPlan: { 'type': 'array', 'itemType': 'string' },
      rentalPeriod: { 'type': 'array', 'itemType': 'number' },
      supportRenew: 'boolean',
      supportBuyout: 'boolean',
      lowestDailyRentMoney: 'number',
      lowestDailyRentMoneyYuan: 'string',
      highestDailyRentMoney: 'number',
      highestDailyRentMoneyYuan: 'string',
      addedFlag: 'boolean',
      signProductMerchantList: { 'type': 'array', 'itemType': SignProductMerchant },
      signProductMerchantCount: 'number',
      applyProductMerchantList: { 'type': 'array', 'itemType': SignProductMerchant },
      applyProductMerchantCount: 'number',
      displayStatus: 'string',
      deliveryMode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 行业黄牛风险识别入参模型
export class ScalperQueryModel extends $tea.Model {
  // 注册手机号，填写咨询对象所关联的注册手机号
  registrationPhone?: string;
  // 认证时间，填写风险咨询对象所关联的账号的真实身份认证时间
  certificateDate?: string;
  // 登录手机号，填写风险咨询对象关联账号的登录手机号
  loginPhone?: string;
  // 注册账号身份证，填写风险咨询对象所关联账号的注册身份证信息
  registrationCert?: string;
  // 登录账号身份证，登录账号的身份证号码
  loginCert?: string;
  // 注册时间，填写风险咨询对象所关联的账号的注册时间
  registrationDate?: string;
  // 证件类型；枚举值：1 - 身份证；2 - 护照
  certType?: number;
  // 银行卡号
  bankCardNo?: string;
  // 用户邮箱
  emailAddress?: string;
  // 手机序列号
  imei?: string;
  // 国际移动用户识别码
  imsi?: string;
  // mac 地址或设备唯一标识
  macAddress?: string;
  // 设备号，设备唯一号码
  apdid?: string;
  // 支付宝外部交易号
  outOrderNo?: string;
  // 所咨询的唯一支付宝交易号
  orderNo?: string;
  // 用户购买或使用服务时产生的具体金额总数，单位：分
  salesAmount?: number;
  // 用户姓名
  userName?: string;
  // 收货手机号，用于区分 mobile_no 所填的手机号
  mailingPhone?: string;
  // 收货地址
  mailingAddress?: string;
  // 是否为员工账号，枚举值：1 - 是
  isEmployee?: string;
  // 渠道，枚举值：alipay - 支付宝；app - 自有app；pc - 电脑端
  channel?: string;
  // 服务商 pid
  isvPid?: string;
  // 门店行业类目，枚举值：CATERING - 餐饮；LEISURE - 休闲；MEDICAL - 医疗
  storeMccDesc?: string;
  // 消费者 id，外部会员账号
  customerId?: string;
  // 订单所有商品信息列表
  orderItemsInfoList?: ScalperQueryOrderItem[];
  static names(): { [key: string]: string } {
    return {
      registrationPhone: 'registration_phone',
      certificateDate: 'certificate_date',
      loginPhone: 'login_phone',
      registrationCert: 'registration_cert',
      loginCert: 'login_cert',
      registrationDate: 'registration_date',
      certType: 'cert_type',
      bankCardNo: 'bank_card_no',
      emailAddress: 'email_address',
      imei: 'imei',
      imsi: 'imsi',
      macAddress: 'mac_address',
      apdid: 'apdid',
      outOrderNo: 'out_order_no',
      orderNo: 'order_no',
      salesAmount: 'sales_amount',
      userName: 'user_name',
      mailingPhone: 'mailing_phone',
      mailingAddress: 'mailing_address',
      isEmployee: 'is_employee',
      channel: 'channel',
      isvPid: 'isv_pid',
      storeMccDesc: 'store_mcc_desc',
      customerId: 'customer_id',
      orderItemsInfoList: 'order_items_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      registrationPhone: 'string',
      certificateDate: 'string',
      loginPhone: 'string',
      registrationCert: 'string',
      loginCert: 'string',
      registrationDate: 'string',
      certType: 'number',
      bankCardNo: 'string',
      emailAddress: 'string',
      imei: 'string',
      imsi: 'string',
      macAddress: 'string',
      apdid: 'string',
      outOrderNo: 'string',
      orderNo: 'string',
      salesAmount: 'number',
      userName: 'string',
      mailingPhone: 'string',
      mailingAddress: 'string',
      isEmployee: 'string',
      channel: 'string',
      isvPid: 'string',
      storeMccDesc: 'string',
      customerId: 'string',
      orderItemsInfoList: { 'type': 'array', 'itemType': ScalperQueryOrderItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 同步订单中的下单人信息
export class UserSyncInfo extends $tea.Model {
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

// 公司信息
export class CompanyInfo extends $tea.Model {
  // 营业执照文件信息
  businessLicenseFile: FileInfo;
  // 证件是否长期有效  
  // true：长期，false：非长期
  // payChannel =JDPAY必填
  businessLicenseCertExpireFlag?: boolean;
  // 证件有效期开始日期(payChannel =JDPAY)
  // 1.certExpireFlag=false时必填，时间格式:yyyy-MM-dd
  // 2. 商户为企业个体户时，无论certExpireFlag是否长期，该字段均必填
  businessLicenseCertEffectDate?: string;
  // 证件有效期结束日期（payChannel =JDPAY选填参数）
  // certExpireFlag为false必填，时间格式：yyyy-MM-dd
  businessLicenseCertExpireDate?: string;
  // 业务类型 枚举
  productMainClass: string;
  // 公司名称
  companyName: string;
  // 公司别名
  companyAliasName: string;
  // 公司数科租户id
  tenantId?: string;
  // 统一社会信用代码
  merchantId: string;
  // 商户类型： 01：企业；07：个体工商户
  // 默认不填为01
  merchantType?: string;
  // 公司联系电话
  companyMobile?: string;
  // 公司联系地址
  companyAddress?: string;
  // 联系人姓名
  contactName: string;
  // 联系人手机号码
  contactMobile: string;
  // 联系地址-省份code(payChannel =JDPAY必填)
  contactAddressProvinceCode?: string;
  // 联系地址-省份名称（payChannel =JDPAY必填）
  contactAddressProvinceName?: string;
  // 联系地址-市code（payChannel =JDPAY必填）
  // 
  contactAddressCityCode?: string;
  // 联系人地址-市名称（payChannel =JDPAY必填）
  contactAddressCityName?: string;
  // 联系人详细地址（payChannel =JDPAY必填）
  contactAddressDetail?: string;
  // 联系人邮箱（pay_channel=JDPAY必填）
  contactEmail?: string;
  // 绑定企业支付宝账号（pay_channel=ALIPAY必填）
  bindAlipayNo?: string;
  // 结算企业支付宝账号（pay_channel=ALIPAY必填）
  settleAlipayNo?: string;
  // 绑定支付宝uid（pay_channel=ALIPAY必填）
  bindAlipayUid?: string;
  // 经营范围
  // payChannel =JDPAY必填
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

// 商户进件记录分页对象
export class MerchantExpandSummaryPage extends $tea.Model {
  // 进件id
  payExpandId: string;
  // 支付渠道
  // JDPAY
  // ALIPAY
  payChannel: string;
  // 进件审核状态
  status: string;
  // 创建时间
  createTime: string;
  // 最后修改时间
  updateTime: string;
  static names(): { [key: string]: string } {
    return {
      payExpandId: 'pay_expand_id',
      payChannel: 'pay_channel',
      status: 'status',
      createTime: 'create_time',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      payExpandId: 'string',
      payChannel: 'string',
      status: 'string',
      createTime: 'string',
      updateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户履约信息
export class UserPerformanceInfo extends $tea.Model {
  // 履约期数
  periodNum: number;
  // 履约时间，格式 yyyy-MM-dd
  // 针对签收日作为起租日模式,未签收时：以签收日开始计算
  payDate: string;
  // 履约金额，单位为分
  payMoney: number;
  static names(): { [key: string]: string } {
    return {
      periodNum: 'period_num',
      payDate: 'pay_date',
      payMoney: 'pay_money',
    };
  }

  static types(): { [key: string]: any } {
    return {
      periodNum: 'number',
      payDate: 'string',
      payMoney: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 营销分查询对象
export class MarketingScoreQueryInfo extends $tea.Model {
  // 手机号码
  phoneNum?: string;
  static names(): { [key: string]: string } {
    return {
      phoneNum: 'phone_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      phoneNum: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 保单信息
export class InsureOrderInfo extends $tea.Model {
  // 商家订单ID
  orderId?: string;
  // 投保编号（承保id）
  insureId?: string;
  // 商品名称
  productName?: string;
  // 保险开始时间
  insureStartTime?: string;
  // 保险终止时间
  insureEndTime?: string;
  // 投保金额（保额），单位分 100代表1元
  insureAmount?: number;
  // 投保费用（保费），单位分 100代表1元
  insurePremium?: number;
  // 投保状态枚举
  status?: string;
  // 电子保单下载链接
  policyUrl?: string;
  // 验真码
  validateCode?: string;
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      insureId: 'insure_id',
      productName: 'product_name',
      insureStartTime: 'insure_start_time',
      insureEndTime: 'insure_end_time',
      insureAmount: 'insure_amount',
      insurePremium: 'insure_premium',
      status: 'status',
      policyUrl: 'policy_url',
      validateCode: 'validate_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      insureId: 'string',
      productName: 'string',
      insureStartTime: 'string',
      insureEndTime: 'string',
      insureAmount: 'number',
      insurePremium: 'number',
      status: 'string',
      policyUrl: 'string',
      validateCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签署链接结果
export class SignUrlResult extends $tea.Model {
  // 签署（长）链接
  url?: string;
  // 签署短链接
  shortUrl?: string;
  // 签署链接提示信息
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

// 数据下载信息
export class DataDownloadInfo extends $tea.Model {
  // 商户社会统一信用代码
  merchantId?: string;
  // 流水号
  bizNo?: string;
  //  状态
  status?: string;
  // TRADE_PROMISE_BILL: 交易履约账单
  type?: string;
  // 筛选开始时间
  startTime?: string;
  // 筛选结束时间
  endTime?: string;
  // 任务创建时间
  createTime?: string;
  // 下载结果
  resultInfo?: string;
  // 融资类型
  fundMode?: string;
  // 放款渠道
  loanChannel?: string;
  // 资方社会统一信用代码
  fundId?: string;
  // 公司名称
  merchantName?: string;
  // 资方公司名称
  fundName?: string;
  static names(): { [key: string]: string } {
    return {
      merchantId: 'merchant_id',
      bizNo: 'biz_no',
      status: 'status',
      type: 'type',
      startTime: 'start_time',
      endTime: 'end_time',
      createTime: 'create_time',
      resultInfo: 'result_info',
      fundMode: 'fund_mode',
      loanChannel: 'loan_channel',
      fundId: 'fund_id',
      merchantName: 'merchant_name',
      fundName: 'fund_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      merchantId: 'string',
      bizNo: 'string',
      status: 'string',
      type: 'string',
      startTime: 'string',
      endTime: 'string',
      createTime: 'string',
      resultInfo: 'string',
      fundMode: 'string',
      loanChannel: 'string',
      fundId: 'string',
      merchantName: 'string',
      fundName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 客诉处理人员信息
export class CustomerPersonInfo extends $tea.Model {
  // 客诉处理员支付宝账号
  alipayLogonId: string;
  // 客诉处理员支付宝绑定手机号
  alipayBindMobile: string;
  // 客服人员名称
  customerServiceName: string;
  static names(): { [key: string]: string } {
    return {
      alipayLogonId: 'alipay_logon_id',
      alipayBindMobile: 'alipay_bind_mobile',
      customerServiceName: 'customer_service_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      alipayLogonId: 'string',
      alipayBindMobile: 'string',
      customerServiceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 随时享-服务商平台适用商家选择配置信息
export class ApplySceneProductMerchantInfo extends $tea.Model {
  // 商户商品spuId
  merchantProductId?: string;
  // 商户品牌
  merchantBrand?: string;
  // logo
  merchantLogo?: string;
  // logo
  largeMerchantLogo?: string;
  // 是否置灰
  grayed?: boolean;
  // 是否勾选
  choosed?: boolean;
  static names(): { [key: string]: string } {
    return {
      merchantProductId: 'merchant_product_id',
      merchantBrand: 'merchant_brand',
      merchantLogo: 'merchant_logo',
      largeMerchantLogo: 'large_merchant_logo',
      grayed: 'grayed',
      choosed: 'choosed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      merchantProductId: 'string',
      merchantBrand: 'string',
      merchantLogo: 'string',
      largeMerchantLogo: 'string',
      grayed: 'boolean',
      choosed: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用信息修改
export class ApplicationInfoUpdate extends $tea.Model {
  // 应用场景 MINI_APP 小程序 APP 自有app ALL 两种都有
  applicationScene?: string;
  // 小程序id
  tinyAppId?: string;
  // 小程序名称
  siteName?: string;
  // http://asdasas.com
  sitUrl?: string;
  // 商户名称。 修改后的商户名称，将同步支付宝代扣签约页面字段展示
  merchantName?: string;
  // 商户服务名称。 修改后的商户服务名称，将同步支付宝代扣签约页面字段展示
  merchantServiceName?: string;
  // 商户服务描述。 修改后的商户服务描述，将同步支付宝代扣签约页面字段展示
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

// 资产包资金方案内容
export class AssetPackageFinancePlan extends $tea.Model {
  // 版本号，从1开始
  version?: number;
  // 状态，ENABLE：启用，不启用时默认null
  status?: string;
  // 放款比例
  // 0~100，保留小数2位
  loanRate?: string;
  // 放款金额，单位分
  loanMoney?: number;
  // 放款金额，单位元
  loanMoneyYuan?: string;
  // 计息方式，枚举：
  // ● 年化利率：APR
  // ● 固定金额：FIXED_AMOUNT
  // ● 固定比例：FIXED_RATE
  interestAccrualMethod?: string;
  // 年计息天数
  dayCountConvention?: number;
  // 息费率
  allinFinancingCostRate?: string;
  // 还款方式，枚举：
  // ● 等额本息：EQUAL_INSTALLMENT_METHOD
  repaymentMethod?: string;
  // 还款频率，枚举：
  // ● 按月：MONTH
  repaymentFrequency?: string;
  // 融资期数，范围0~36
  financeNum?: number;
  // 计划还款日期，范围1～28
  payDay?: number;
  // 触发商家代偿时间，单位天
  merchantCompensationDay?: number;
  // 订单未还款总金额，单位分
  unreleasedAmount?: number;
  static names(): { [key: string]: string } {
    return {
      version: 'version',
      status: 'status',
      loanRate: 'loan_rate',
      loanMoney: 'loan_money',
      loanMoneyYuan: 'loan_money_yuan',
      interestAccrualMethod: 'interest_accrual_method',
      dayCountConvention: 'day_count_convention',
      allinFinancingCostRate: 'allin_financing_cost_rate',
      repaymentMethod: 'repayment_method',
      repaymentFrequency: 'repayment_frequency',
      financeNum: 'finance_num',
      payDay: 'pay_day',
      merchantCompensationDay: 'merchant_compensation_day',
      unreleasedAmount: 'unreleased_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      version: 'number',
      status: 'string',
      loanRate: 'string',
      loanMoney: 'number',
      loanMoneyYuan: 'string',
      interestAccrualMethod: 'string',
      dayCountConvention: 'number',
      allinFinancingCostRate: 'string',
      repaymentMethod: 'string',
      repaymentFrequency: 'string',
      financeNum: 'number',
      payDay: 'number',
      merchantCompensationDay: 'number',
      unreleasedAmount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单包含的单个商品模型
export class OrderGoodsModel extends $tea.Model {
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

// 随时享-平台商品信息
export class PlatformProductInfoResp extends $tea.Model {
  // 申请单状态
  applyStatus?: string;
  // 审核原因
  refuseReason?: string;
  // 平台商品id
  platformProductId?: string;
  // 商家商品id
  merchantProductId?: string;
  // 商品名称
  productName?: string;
  // 封面首图url链接
  firstCoverImageUrl?: string;
  // 封面首图url链接
  largeFirstCoverImageUrl?: string;
  // 商品上架状态
  displayStatus?: string;
  // 产品规格列表
  specConfigList?: ProductSpecConfig[];
  // 租赁方案
  rentalPlan?: string[];
  // 租赁周期
  rentalPeriod?: number[];
  // 可续租
  supportRenew?: boolean;
  // 可买断
  supportBuyout?: boolean;
  // 最低日租金(单位分)
  lowestDailyRentMoney?: number;
  // 最低日租金(单位元)
  lowestDailyRentMoneyYuan?: string;
  // 最高日租金(单位分)
  highestDailyRentMoney?: number;
  // 最高日租金(单位元)
  highestDailyRentMoneyYuan?: string;
  static names(): { [key: string]: string } {
    return {
      applyStatus: 'apply_status',
      refuseReason: 'refuse_reason',
      platformProductId: 'platform_product_id',
      merchantProductId: 'merchant_product_id',
      productName: 'product_name',
      firstCoverImageUrl: 'first_cover_image_url',
      largeFirstCoverImageUrl: 'large_first_cover_image_url',
      displayStatus: 'display_status',
      specConfigList: 'spec_config_list',
      rentalPlan: 'rental_plan',
      rentalPeriod: 'rental_period',
      supportRenew: 'support_renew',
      supportBuyout: 'support_buyout',
      lowestDailyRentMoney: 'lowest_daily_rent_money',
      lowestDailyRentMoneyYuan: 'lowest_daily_rent_money_yuan',
      highestDailyRentMoney: 'highest_daily_rent_money',
      highestDailyRentMoneyYuan: 'highest_daily_rent_money_yuan',
    };
  }

  static types(): { [key: string]: any } {
    return {
      applyStatus: 'string',
      refuseReason: 'string',
      platformProductId: 'string',
      merchantProductId: 'string',
      productName: 'string',
      firstCoverImageUrl: 'string',
      largeFirstCoverImageUrl: 'string',
      displayStatus: 'string',
      specConfigList: { 'type': 'array', 'itemType': ProductSpecConfig },
      rentalPlan: { 'type': 'array', 'itemType': 'string' },
      rentalPeriod: { 'type': 'array', 'itemType': 'number' },
      supportRenew: 'boolean',
      supportBuyout: 'boolean',
      lowestDailyRentMoney: 'number',
      lowestDailyRentMoneyYuan: 'string',
      highestDailyRentMoney: 'number',
      highestDailyRentMoneyYuan: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 智租风控-物流信息
export class DeliveryDetail extends $tea.Model {
  // 收件人姓名
  receiverName?: string;
  // 收件人手机号
  receiverMobile?: string;
  // 收件人地址
  receiverAddress?: string;
  static names(): { [key: string]: string } {
    return {
      receiverName: 'receiver_name',
      receiverMobile: 'receiver_mobile',
      receiverAddress: 'receiver_address',
    };
  }

  static types(): { [key: string]: any } {
    return {
      receiverName: 'string',
      receiverMobile: 'string',
      receiverAddress: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户线索根据-平台订单、派发和备注返回结果信息
export class PlatformOrderLeadResultInfo extends $tea.Model {
  // 场景名称
  sceneName?: string;
  // 平台订单号
  platformOrderId?: string;
  // 平台订单派发id
  deliveryId?: string;
  // 商品名称
  productTitle?: string;
  // 订单提交时间
  orderCreateTime?: string;
  // 用户姓名（脱敏）
  userName?: string;
  // 用户手机号（脱敏）
  userPhone?: string;
  // 商家品牌名称
  merchantBrandName?: string;
  // 商家品牌logoUrl
  merchantBrandLogoUrl?: string;
  // 审核状态
  approvalStatus?: string;
  // 备注
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      sceneName: 'scene_name',
      platformOrderId: 'platform_order_id',
      deliveryId: 'delivery_id',
      productTitle: 'product_title',
      orderCreateTime: 'order_create_time',
      userName: 'user_name',
      userPhone: 'user_phone',
      merchantBrandName: 'merchant_brand_name',
      merchantBrandLogoUrl: 'merchant_brand_logo_url',
      approvalStatus: 'approval_status',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sceneName: 'string',
      platformOrderId: 'string',
      deliveryId: 'string',
      productTitle: 'string',
      orderCreateTime: 'string',
      userName: 'string',
      userPhone: 'string',
      merchantBrandName: 'string',
      merchantBrandLogoUrl: 'string',
      approvalStatus: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 批量放款结果数据
export class BatchLoanResultData extends $tea.Model {
  // 流水号
  bizNo?: string;
  // 状态
  status?: string;
  // FUND_BATCH_LOAN: 批量放款
  type?: string;
  // 任务创建时间
  createTime?: string;
  //  同意放款数据
  agreeLoanCount?: number;
  // 拒绝放款数量
  rejectLoanCount?: number;
  // 放款失败数量
  loanFailCount?: number;
  // 放款失败结果文件
  fileUrl?: string;
  static names(): { [key: string]: string } {
    return {
      bizNo: 'biz_no',
      status: 'status',
      type: 'type',
      createTime: 'create_time',
      agreeLoanCount: 'agree_loan_count',
      rejectLoanCount: 'reject_loan_count',
      loanFailCount: 'loan_fail_count',
      fileUrl: 'file_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizNo: 'string',
      status: 'string',
      type: 'string',
      createTime: 'string',
      agreeLoanCount: 'number',
      rejectLoanCount: 'number',
      loanFailCount: 'number',
      fileUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 行业刷单风险识别入参模型
export class FarmingQueryModel extends $tea.Model {
  // 支付宝外部交易号
  outOrderNo?: string;
  // 支付宝内部交易号
  orderNo?: string;
  // 金额，用户购买或使用服务时产生的具体金额，单位：分
  salesAmount?: number;
  // 银行卡号
  bankCardNo?: string;
  // 服务商 pid
  isvPid?: string;
  // 门店行业类目，枚举值：CATERING - 餐饮；LEISURE - 休闲；MEDICAL - 医疗
  storeMccDesc?: string;
  // 门店地址；不需要传城市和行政区
  outletAddress?: string;
  // 公司名称
  companyName?: string;
  // 店铺名称
  storeName?: string;
  static names(): { [key: string]: string } {
    return {
      outOrderNo: 'out_order_no',
      orderNo: 'order_no',
      salesAmount: 'sales_amount',
      bankCardNo: 'bank_card_no',
      isvPid: 'isv_pid',
      storeMccDesc: 'store_mcc_desc',
      outletAddress: 'outlet_address',
      companyName: 'company_name',
      storeName: 'store_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      outOrderNo: 'string',
      orderNo: 'string',
      salesAmount: 'number',
      bankCardNo: 'string',
      isvPid: 'string',
      storeMccDesc: 'string',
      outletAddress: 'string',
      companyName: 'string',
      storeName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 文本域（组件）
export class TemplateTextAreaComponent extends $tea.Model {
  // 模板编码
  templateCode: string;
  // 模版版本号
  templateVersion: string;
  // 组件类型，INPUT:单行文本 TEXTAREA:多行文本
  componentType: string;
  // 组件名称（占位符）
  componentName: string;
  // 是否必填
  required: boolean;
  // 预估文本行数
  line?: number;
  // 多行文本域名称
  multiName: string;
  // 前端传入的文本域映射字段
  preElementCode: string;
  static names(): { [key: string]: string } {
    return {
      templateCode: 'template_code',
      templateVersion: 'template_version',
      componentType: 'component_type',
      componentName: 'component_name',
      required: 'required',
      line: 'line',
      multiName: 'multi_name',
      preElementCode: 'pre_element_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      templateCode: 'string',
      templateVersion: 'string',
      componentType: 'string',
      componentName: 'string',
      required: 'boolean',
      line: 'number',
      multiName: 'string',
      preElementCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单商品
export class OrderProductInfo extends $tea.Model {
  // 商品编码
  productId?: string;
  // 商品名称
  productName?: string;
  // 商品数量
  productNumber?: number;
  static names(): { [key: string]: string } {
    return {
      productId: 'product_id',
      productName: 'product_name',
      productNumber: 'product_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      productId: 'string',
      productName: 'string',
      productNumber: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单商品信息
export class GoodsInfo extends $tea.Model {
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

// (异步)解约申请信息对象
export class AgreementTerminateApplyInfo extends $tea.Model {
  // 订单ID
  orderId?: string;
  // 解约申请号
  terminateApplyId?: string;
  // 订单创建时间
  orderGmtCreate?: string;
  // 解约申请时间
  gmtTerminateApply?: string;
  // 处理状态
  handleStatus?: string;
  // 商家处理超时时长
  merchantHandleDuration?: string;
  // 商家处理超时时长
  merchantHandleDurationType?: string;
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      terminateApplyId: 'terminate_apply_id',
      orderGmtCreate: 'order_gmt_create',
      gmtTerminateApply: 'gmt_terminate_apply',
      handleStatus: 'handle_status',
      merchantHandleDuration: 'merchant_handle_duration',
      merchantHandleDurationType: 'merchant_handle_duration_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      terminateApplyId: 'string',
      orderGmtCreate: 'string',
      gmtTerminateApply: 'string',
      handleStatus: 'string',
      merchantHandleDuration: 'string',
      merchantHandleDurationType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 法人信息
export class LegalInfo extends $tea.Model {
  // 法人名称
  legalName: string;
  // 法人证件号
  legalCertNo: string;
  // 法人证件正面（人像面）
  legalCertFrontFile: FileInfo;
  // 法人证件反面
  legalCertBackFile: FileInfo;
  // 法人证件是否长期有效（payChannel =JDPAY必填）
  // true：长期，false：非长期
  // 
  legalCertExpireFlag?: boolean;
  // 法人手机号（payChannel =JDPAY必填）
  legalMobile?: string;
  // 证件有效期开始日期（payChannel =JDPAY必填）
  // legalCertExpireFlag=false/true时都必填，时间格式:yyyy-MM-dd
  legalEffectDate?: string;
  // 证件有效期结束（payChannel =JDPAY选填）
  // legalCertExpireFlag=false时必填，时间格式:yyyy-MM-dd
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

// 订单融资信息
export class OrderFinanceInfo extends $tea.Model {
  // 放款金额
  totalMoney?: number;
  // 放款状态
  applyStatus?: string;
  // 融资申请时间(yyyy-MM-dd HH:mm:ss)
  loanApplyDate?: string;
  // 放款时间(yyyy-MM-dd HH:mm:ss)
  loanTime?: string;
  // 放款交易流水号
  loanSerialNumber?: string;
  // 资方分账户登录号
  fundDivideAlipayLogonId?: string;
  // 资方分账户uid
  fundDivideAlipayUid?: string;
  // 资方代扣户登录号
  fundWithholdAlipayLogonId?: string;
  // 资方代扣户uid
  fundWithholdAlipayUid?: string;
  // 手续费支付方
  feePaidRole?: string;
  // 放款渠道
  loanChannel?: string;
  // 放款账户
  loanPayeeAccount?: string;
  // 付款公司统一社会信用代码
  paidCompanyId?: string;
  // 银行名称
  bankName?: string;
  // 融资状态
  financeStatus?: string;
  // 收款项目列表
  paymentItemList?: string[];
  // 转账代偿收款类型
  transferCompensateInAccountType?: string;
  static names(): { [key: string]: string } {
    return {
      totalMoney: 'total_money',
      applyStatus: 'apply_status',
      loanApplyDate: 'loan_apply_date',
      loanTime: 'loan_time',
      loanSerialNumber: 'loan_serial_number',
      fundDivideAlipayLogonId: 'fund_divide_alipay_logon_id',
      fundDivideAlipayUid: 'fund_divide_alipay_uid',
      fundWithholdAlipayLogonId: 'fund_withhold_alipay_logon_id',
      fundWithholdAlipayUid: 'fund_withhold_alipay_uid',
      feePaidRole: 'fee_paid_role',
      loanChannel: 'loan_channel',
      loanPayeeAccount: 'loan_payee_account',
      paidCompanyId: 'paid_company_id',
      bankName: 'bank_name',
      financeStatus: 'finance_status',
      paymentItemList: 'payment_item_list',
      transferCompensateInAccountType: 'transfer_compensate_in_account_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      totalMoney: 'number',
      applyStatus: 'string',
      loanApplyDate: 'string',
      loanTime: 'string',
      loanSerialNumber: 'string',
      fundDivideAlipayLogonId: 'string',
      fundDivideAlipayUid: 'string',
      fundWithholdAlipayLogonId: 'string',
      fundWithholdAlipayUid: 'string',
      feePaidRole: 'string',
      loanChannel: 'string',
      loanPayeeAccount: 'string',
      paidCompanyId: 'string',
      bankName: 'string',
      financeStatus: 'string',
      paymentItemList: { 'type': 'array', 'itemType': 'string' },
      transferCompensateInAccountType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 智租风控模型结构体
export class AppletRiskModel extends $tea.Model {
  // 智租风控调用结果码，10000 表示调用成功。
  code: string;
  // 风险咨询事件ID
  recordId: string;
  // 风险等级。枚举值：RANK0-无法判断；RANK1-极低风险；RANK2-低风险；RANK3-中风险；RANK4-高风险；RANK5-极高风险
  riskRank: string;
  // 风险名称
  riskName: string;
  // 风险等级中文描述
  riskDesc: string;
  // 流程id
  flowId: string;
  // 子风险结果列表
  subRiskResultList?: SubRentRiskItem[];
  // 调用失败错误提示信息，仅调用失败时返回该字段信息。
  errorMsg?: string;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      recordId: 'record_id',
      riskRank: 'risk_rank',
      riskName: 'risk_name',
      riskDesc: 'risk_desc',
      flowId: 'flow_id',
      subRiskResultList: 'sub_risk_result_list',
      errorMsg: 'error_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      recordId: 'string',
      riskRank: 'string',
      riskName: 'string',
      riskDesc: 'string',
      flowId: 'string',
      subRiskResultList: { 'type': 'array', 'itemType': SubRentRiskItem },
      errorMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单代扣协议信息
export class OrderWithholdContractInfo extends $tea.Model {
  // 支付宝外部代扣协议号
  withholdingContractId?: string;
  // 用户代扣协议状态
  contractStatus?: string;
  static names(): { [key: string]: string } {
    return {
      withholdingContractId: 'withholding_contract_id',
      contractStatus: 'contract_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      withholdingContractId: 'string',
      contractStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商户还款策略
export class MerchantOrderRepayStrategy extends $tea.Model {
  // 分账期数(关联商户履约)
  termIndex?: number;
  // 还款期数(关联用户还款承诺)
  leaseTermIndex?: number;
  // 分账金额
  payMoney?: number;
  // 转代偿时间，yyyy-MM-dd
  toCompensateDate?: string;
  // 资方社会统一信用代码
  fundId?: string;
  // 资方公司名称
  fundCompanyName?: string;
  static names(): { [key: string]: string } {
    return {
      termIndex: 'term_index',
      leaseTermIndex: 'lease_term_index',
      payMoney: 'pay_money',
      toCompensateDate: 'to_compensate_date',
      fundId: 'fund_id',
      fundCompanyName: 'fund_company_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      termIndex: 'number',
      leaseTermIndex: 'number',
      payMoney: 'number',
      toCompensateDate: 'string',
      fundId: 'string',
      fundCompanyName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商户已进件支付渠道信息
export class MerchantPayChannelInfo extends $tea.Model {
  // ALIPAY 支付宝
  // JDPAY京东支付
  payChannel: string;
  // 绑定企业支付宝账号
  bindAlipayNo?: string;
  // 结算企业支付宝账号
  settleAlipayNo?: string;
  // 绑定支付宝uid
  bindAlipayUid?: string;
  // 结算银行卡账号
  bankNum?: string;
  // 联行号
  bankCnap?: string;
  // 结算账户类型 
  // merchant_type=01企业时：ENTERPRISE
  // 03:民办非企业：ENTERPRISE
  // 07个体工商户时：PERSON或 ENTERPRISE
  bankAccountType?: string;
  // 二级商户id
  subMerchantId?: string;
  // 进件流水号
  payExpandId?: string;
  static names(): { [key: string]: string } {
    return {
      payChannel: 'pay_channel',
      bindAlipayNo: 'bind_alipay_no',
      settleAlipayNo: 'settle_alipay_no',
      bindAlipayUid: 'bind_alipay_uid',
      bankNum: 'bank_num',
      bankCnap: 'bank_cnap',
      bankAccountType: 'bank_account_type',
      subMerchantId: 'sub_merchant_id',
      payExpandId: 'pay_expand_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      payChannel: 'string',
      bindAlipayNo: 'string',
      settleAlipayNo: 'string',
      bindAlipayUid: 'string',
      bankNum: 'string',
      bankCnap: 'string',
      bankAccountType: 'string',
      subMerchantId: 'string',
      payExpandId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分账关系绑定收入方信息
export class DivideBindingTransInInfo extends $tea.Model {
  // 分账方支付宝pid
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

// 随时享-服务商平台场景商品租赁配置详情信息
export class SignMerchantLeaseConfig extends $tea.Model {
  // 商户商品spuId
  merchantProductId?: string;
  // 商户品牌
  merchantBrand?: string;
  // logo
  merchantLogo?: string;
  // logo
  largeMerchantLogo?: string;
  // 是否置灰
  grayed?: boolean;
  // 租赁方案
  rentalPlan?: string[];
  // 租赁方案说明
  rentalPlanIntro?: string;
  // 租赁周期
  rentalPeriod?: number[];
  // 可续租
  supportRenew?: boolean;
  // 可买断
  supportBuyout?: boolean;
  // 租赁价格方案列表
  leasePricePlanList?: LeasePricePlan[];
  // 寄出是否包邮
  freeShippingOut?: boolean;
  // 寄回是否包邮
  freeShippingBack?: boolean;
  // 发货时效
  shippingDurationType?: string;
  // 增值服务介绍
  valueAddedServiceIntro?: string;
  // 详情页介绍
  detailPageIntro?: string;
  // 服务承诺
  servicePromiseIntro?: string[];
  static names(): { [key: string]: string } {
    return {
      merchantProductId: 'merchant_product_id',
      merchantBrand: 'merchant_brand',
      merchantLogo: 'merchant_logo',
      largeMerchantLogo: 'large_merchant_logo',
      grayed: 'grayed',
      rentalPlan: 'rental_plan',
      rentalPlanIntro: 'rental_plan_intro',
      rentalPeriod: 'rental_period',
      supportRenew: 'support_renew',
      supportBuyout: 'support_buyout',
      leasePricePlanList: 'lease_price_plan_list',
      freeShippingOut: 'free_shipping_out',
      freeShippingBack: 'free_shipping_back',
      shippingDurationType: 'shipping_duration_type',
      valueAddedServiceIntro: 'value_added_service_intro',
      detailPageIntro: 'detail_page_intro',
      servicePromiseIntro: 'service_promise_intro',
    };
  }

  static types(): { [key: string]: any } {
    return {
      merchantProductId: 'string',
      merchantBrand: 'string',
      merchantLogo: 'string',
      largeMerchantLogo: 'string',
      grayed: 'boolean',
      rentalPlan: { 'type': 'array', 'itemType': 'string' },
      rentalPlanIntro: 'string',
      rentalPeriod: { 'type': 'array', 'itemType': 'number' },
      supportRenew: 'boolean',
      supportBuyout: 'boolean',
      leasePricePlanList: { 'type': 'array', 'itemType': LeasePricePlan },
      freeShippingOut: 'boolean',
      freeShippingBack: 'boolean',
      shippingDurationType: 'string',
      valueAddedServiceIntro: 'string',
      detailPageIntro: 'string',
      servicePromiseIntro: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 模板组件（文本域）
export class TemplateComponent extends $tea.Model {
  // 模板编码
  templateCode: string;
  // 组件（文本域）id
  id: string;
  // 组件（文本域）名称
  name: string;
  // 组件（文本域）的唯一标识
  uk?: string;
  // 占位符，组件（文本域）的展示样式值
  placeholder?: string;
  // 组件（文本域）是否可以编辑。取值：Y/N
  enableEdit?: string;
  // 是否必填，取值：Y/N
  required?: string;
  // 组件（文本域）类型，INPUT:单行文本 TEXTAREA:多行文本
  type?: string;
  // 组件（文本域）值
  value: string;
  static names(): { [key: string]: string } {
    return {
      templateCode: 'template_code',
      id: 'id',
      name: 'name',
      uk: 'uk',
      placeholder: 'placeholder',
      enableEdit: 'enable_edit',
      required: 'required',
      type: 'type',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      templateCode: 'string',
      id: 'string',
      name: 'string',
      uk: 'string',
      placeholder: 'string',
      enableEdit: 'string',
      required: 'string',
      type: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 静态数据
export class StaticData extends $tea.Model {
  // 商户类型
  moduleName: string;
  // 静态数据详情
  moduleDetailList: StaticDataModuleDetail[];
  static names(): { [key: string]: string } {
    return {
      moduleName: 'module_name',
      moduleDetailList: 'module_detail_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      moduleName: 'string',
      moduleDetailList: { 'type': 'array', 'itemType': StaticDataModuleDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 进件分页对象
export class MerchantAgentPage extends $tea.Model {
  // 进件id
  payExpandId: string;
  // 	
  // 代理企业名称
  agentName: string;
  // 租户8位id
  tenantId: string;
  // 业务类型
  bizType: string;
  // 进件审核状态 枚举
  payExpandStatus: string;
  static names(): { [key: string]: string } {
    return {
      payExpandId: 'pay_expand_id',
      agentName: 'agent_name',
      tenantId: 'tenant_id',
      bizType: 'biz_type',
      payExpandStatus: 'pay_expand_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      payExpandId: 'string',
      agentName: 'string',
      tenantId: 'string',
      bizType: 'string',
      payExpandStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单还款承诺
export class OrderPromiseInfo extends $tea.Model {
  // 订单还款策略
  repayStrategyList?: OrderRepayStrategy[];
  static names(): { [key: string]: string } {
    return {
      repayStrategyList: 'repay_strategy_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      repayStrategyList: { 'type': 'array', 'itemType': OrderRepayStrategy },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品信息
export class ProductInfo extends $tea.Model {
  // 商家社会统一信用代码
  merchantId?: string;
  // 商品名称
  productName?: string;
  // 商品id
  productId?: string;
  // 商品规格
  productModel?: string;
  // 商品版本
  productVersion?: string;
  // 指导价(单位分)
  productPrice?: number;
  // 一级类目
  mainClass?: string;
  // 二级类目
  subClass?: string;
  // 品牌
  productBrand?: string;
  static names(): { [key: string]: string } {
    return {
      merchantId: 'merchant_id',
      productName: 'product_name',
      productId: 'product_id',
      productModel: 'product_model',
      productVersion: 'product_version',
      productPrice: 'product_price',
      mainClass: 'main_class',
      subClass: 'sub_class',
      productBrand: 'product_brand',
    };
  }

  static types(): { [key: string]: any } {
    return {
      merchantId: 'string',
      productName: 'string',
      productId: 'string',
      productModel: 'string',
      productVersion: 'string',
      productPrice: 'number',
      mainClass: 'string',
      subClass: 'string',
      productBrand: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 内部使用接口资产凭证信息
export class InnerCreditInfo extends $tea.Model {
  // 凭证内容id
  contentId?: string;
  // 资产凭证的类型，可支持：FILE(文件)、TEXT(文本)、JSON_TEXT(JSON文本)
  contentType?: string;
  // 资产凭证名称
  creditName?: string;
  // 凭证文件下载链接
  creditFileUrl?: string;
  // 上传的文本内容
  creditContent?: string;
  // 凭证创建时间(yyyy-MM-dd HH:mm:ss)
  createTime?: string;
  static names(): { [key: string]: string } {
    return {
      contentId: 'content_id',
      contentType: 'content_type',
      creditName: 'credit_name',
      creditFileUrl: 'credit_file_url',
      creditContent: 'credit_content',
      createTime: 'create_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      contentId: 'string',
      contentType: 'string',
      creditName: 'string',
      creditFileUrl: 'string',
      creditContent: 'string',
      createTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单还款计划
export class PromiseInfo extends $tea.Model {
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

// 资产报告详情
export class FundAssertReport extends $tea.Model {
  // 投放月份 (整月)
  deliveryMonth: string;
  // 账单金额
  totalBillAmount: number;
  // 平均期限
  averageTerm: string;
  // 状态为取消的账单金额
  cancelledBillAmount: number;
  // Y期的订单的账单金额
  totalBillAmountYPeriod: number;
  // 已到Y期订单中Y期平均期限(y期订单的平均期限)
  averageTermYPeriod: string;
  // Y期的订单中状态为取消的账单金额
  cancelledBillAmountYPeriod: number;
  // 状态为逾期1天及以上的账单金额
  billAmountOverdueBy1dayOrMore: string;
  // Y期的订单中状态为逾期1天及以上的账单金额
  billAmountOverdueBy1dayOrMoreYPeriod: string;
  // 状态为逾期30天及以上的账单金额
  billAmountOverdueBy30DaysOrMore: string;
  // Y期的订单中状态为逾期30天及以上的账单金额
  billAmountOverdueBy30DaysOrMoreYPeriod: string;
  static names(): { [key: string]: string } {
    return {
      deliveryMonth: 'delivery_month',
      totalBillAmount: 'total_bill_amount',
      averageTerm: 'average_term',
      cancelledBillAmount: 'cancelled_bill_amount',
      totalBillAmountYPeriod: 'total_bill_amount_y_period',
      averageTermYPeriod: 'average_term_y_period',
      cancelledBillAmountYPeriod: 'cancelled_bill_amount_y_period',
      billAmountOverdueBy1dayOrMore: 'bill_amount_overdue_by1day_or_more',
      billAmountOverdueBy1dayOrMoreYPeriod: 'bill_amount_overdue_by1day_or_more_y_period',
      billAmountOverdueBy30DaysOrMore: 'bill_amount_overdue_by30_days_or_more',
      billAmountOverdueBy30DaysOrMoreYPeriod: 'bill_amount_overdue_by30_days_or_more_y_period',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deliveryMonth: 'string',
      totalBillAmount: 'number',
      averageTerm: 'string',
      cancelledBillAmount: 'number',
      totalBillAmountYPeriod: 'number',
      averageTermYPeriod: 'string',
      cancelledBillAmountYPeriod: 'number',
      billAmountOverdueBy1dayOrMore: 'string',
      billAmountOverdueBy1dayOrMoreYPeriod: 'string',
      billAmountOverdueBy30DaysOrMore: 'string',
      billAmountOverdueBy30DaysOrMoreYPeriod: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 客服信息
export class CustomerServiceInfo extends $tea.Model {
  // 公司社会统一信息代码
  merchantId?: string;
  // 公司名称
  merchantName?: string;
  // 处理类型:
  // MERCHANT_PROCESS("MERCHANT_PROCESS", "商家处理"),
  // PROXY_PROCESS("PROXY_PROCESS", "服务商代处理"),
  processType?: string;
  static names(): { [key: string]: string } {
    return {
      merchantId: 'merchant_id',
      merchantName: 'merchant_name',
      processType: 'process_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      merchantId: 'string',
      merchantName: 'string',
      processType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 经营分账收入模型
export class OperationDivideTransInModel extends $tea.Model {
  // 分账收入方支付宝用户id, 支付宝2088id
  transInUserId: string;
  // 分账金额，单位为分
  // 
  divideAmount: number;
  // 分账描述
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

// 智能体二期-用户基础信息
export class MerchantBaseInfo extends $tea.Model {
  // 租户id
  tenantId?: string;
  // 品牌名称
  brandName?: string;
  // 品牌logo
  brandLogo?: string;
  // 商家小程序链接
  merchantAppLink?: string;
  // 商家更新电话
  merchantPhone?: string;
  // 提交时间
  submitTime?: string;
  // 审核状态
  status?: string;
  // 品牌名称-审核中
  brandNameSnapshot?: string;
  // 品牌logo-审核中
  brandLogoSnapshot?: string;
  // 商家小程序链接_审核中
  merchantAppLinkSnapshot?: string;
  // 商家电话_审核中
  merchantPhoneSnapshot?: string;
  // 更新时间_审核中
  submitTimeSnapshot?: string;
  // 驳回原因_审核中
  refuseReasonSnapshot?: string;
  static names(): { [key: string]: string } {
    return {
      tenantId: 'tenant_id',
      brandName: 'brand_name',
      brandLogo: 'brand_logo',
      merchantAppLink: 'merchant_app_link',
      merchantPhone: 'merchant_phone',
      submitTime: 'submit_time',
      status: 'status',
      brandNameSnapshot: 'brand_name_snapshot',
      brandLogoSnapshot: 'brand_logo_snapshot',
      merchantAppLinkSnapshot: 'merchant_app_link_snapshot',
      merchantPhoneSnapshot: 'merchant_phone_snapshot',
      submitTimeSnapshot: 'submit_time_snapshot',
      refuseReasonSnapshot: 'refuse_reason_snapshot',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tenantId: 'string',
      brandName: 'string',
      brandLogo: 'string',
      merchantAppLink: 'string',
      merchantPhone: 'string',
      submitTime: 'string',
      status: 'string',
      brandNameSnapshot: 'string',
      brandLogoSnapshot: 'string',
      merchantAppLinkSnapshot: 'string',
      merchantPhoneSnapshot: 'string',
      submitTimeSnapshot: 'string',
      refuseReasonSnapshot: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 资产订单信息
export class AssetPackageOrderInfo extends $tea.Model {
  // 订单id
  orderId: string;
  // 订单状态
  status: string;
  // 出包原因
  outReason?: string;
  // 订单用信额度
  orderCreditLine?: number;
  // 商户应还款金额
  orderMerchantRepaymentMoney?: number;
  // 订单分账起始账期
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

// 经营分账信息
export class OperateDivideInfo extends $tea.Model {
  // 当前用户履约的租期编号
  periodNum?: number;
  // 经营分账收入方结果信息
  operationDivideTransInList?: OperationDivideTransInDetailInfo[];
  static names(): { [key: string]: string } {
    return {
      periodNum: 'period_num',
      operationDivideTransInList: 'operation_divide_trans_in_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      periodNum: 'number',
      operationDivideTransInList: { 'type': 'array', 'itemType': OperationDivideTransInDetailInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单履约
export class OrderFulfillmentInfo extends $tea.Model {
  // 租期编号
  leaseTermIndex?: number;
  // 租期归还状态
  rentalReturnState?: string;
  // 实际还款金额(分)
  realRepayMoney?: number;
  // 租金(分)
  rentalMoney?: number;
  // 每期实付时间
  returnTime?: string;
  // 周期性代扣
  returnWay?: string;
  // 还款流水号
  returnVoucherSerial?: string;
  // 支付宝协议号
  alipayTradeNo?: string;
  static names(): { [key: string]: string } {
    return {
      leaseTermIndex: 'lease_term_index',
      rentalReturnState: 'rental_return_state',
      realRepayMoney: 'real_repay_money',
      rentalMoney: 'rental_money',
      returnTime: 'return_time',
      returnWay: 'return_way',
      returnVoucherSerial: 'return_voucher_serial',
      alipayTradeNo: 'alipay_trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      leaseTermIndex: 'number',
      rentalReturnState: 'string',
      realRepayMoney: 'number',
      rentalMoney: 'number',
      returnTime: 'string',
      returnWay: 'string',
      returnVoucherSerial: 'string',
      alipayTradeNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 公司概要信息
export class CompanySummaryInfo extends $tea.Model {
  // 社会统一信用代码
  merchantId?: string;
  // 公司名称
  merchantName?: string;
  static names(): { [key: string]: string } {
    return {
      merchantId: 'merchant_id',
      merchantName: 'merchant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      merchantId: 'string',
      merchantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单搜索信息
export class OrderSearchInfo extends $tea.Model {
  // 订单id
  orderId?: string;
  // 支付宝代扣协议号
  agreementNo?: string;
  // 订单创建时间
  orderCreateTime?: string;
  // 租金总额（单位分）
  totalRentMoney?: number;
  // 租期
  rentTerm?: number;
  // 租期单位
  rentUnit?: string;
  // 订单状态
  orderStatus?: string;
  // 承租人名称
  userName?: string;
  // 承租人手机号
  userPhoneNumber?: string;
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      agreementNo: 'agreement_no',
      orderCreateTime: 'order_create_time',
      totalRentMoney: 'total_rent_money',
      rentTerm: 'rent_term',
      rentUnit: 'rent_unit',
      orderStatus: 'order_status',
      userName: 'user_name',
      userPhoneNumber: 'user_phone_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      agreementNo: 'string',
      orderCreateTime: 'string',
      totalRentMoney: 'number',
      rentTerm: 'number',
      rentUnit: 'string',
      orderStatus: 'string',
      userName: 'string',
      userPhoneNumber: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 营销场景
export class PromotionScene extends $tea.Model {
  // 租户id
  tenantId?: string;
  // 场景码
  sceneCode?: string;
  // 场景名称
  sceneName?: string;
  // 场景备注
  sceneRemark?: string;
  // 场景商品数量
  sceneProductAmount?: number;
  // 已上线场景商品数量
  onlineSceneProductAmount?: number;
  static names(): { [key: string]: string } {
    return {
      tenantId: 'tenant_id',
      sceneCode: 'scene_code',
      sceneName: 'scene_name',
      sceneRemark: 'scene_remark',
      sceneProductAmount: 'scene_product_amount',
      onlineSceneProductAmount: 'online_scene_product_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tenantId: 'string',
      sceneCode: 'string',
      sceneName: 'string',
      sceneRemark: 'string',
      sceneProductAmount: 'number',
      onlineSceneProductAmount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商户履约订单其他还款支持信息
export class MerchantPerformanceRepaySupportInfo extends $tea.Model {
  // 是否支持还款取消
  supportRepay?: boolean;
  // 商户履约期数
  termIndex?: number;
  static names(): { [key: string]: string } {
    return {
      supportRepay: 'support_repay',
      termIndex: 'term_index',
    };
  }

  static types(): { [key: string]: any } {
    return {
      supportRepay: 'boolean',
      termIndex: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用信查询订单履约信息结构体
export class OrderPromiseExcelInfo extends $tea.Model {
  // 文件下载地址
  downloadUrl?: string;
  // 文件类型,订单明细表:ORDER_DETAIL 还款记录表:ORDER_FULFILLMENT
  fileType: string;
  // 任务状态
  // ● RUNNING:生成中
  // ● SUCCESS:已生成
  // ● FAILED:失败
  taskStatus: string;
  static names(): { [key: string]: string } {
    return {
      downloadUrl: 'download_url',
      fileType: 'file_type',
      taskStatus: 'task_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      downloadUrl: 'string',
      fileType: 'string',
      taskStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 资产包创建履约计划参数
export class AssetPackageCreatePromisePlanParams extends $tea.Model {
  // 账期
  periodNum?: number;
  // 还款时间yyyy-MM-dd
  payDay?: string;
  // 计划还款总额，单位为分
  totalAmount?: number;
  // 本金，单位为分
  principalAmount?: number;
  // 利息，单位为分
  interestAmount?: number;
  static names(): { [key: string]: string } {
    return {
      periodNum: 'period_num',
      payDay: 'pay_day',
      totalAmount: 'total_amount',
      principalAmount: 'principal_amount',
      interestAmount: 'interest_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      periodNum: 'number',
      payDay: 'string',
      totalAmount: 'number',
      principalAmount: 'number',
      interestAmount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 策略结果详情
export class RiskStrategy extends $tea.Model {
  // 策略ID
  id: string;
  // 策略名称
  name: string;
  // 策略决策结果
  decision: string;
  // 风险场景编码
  sceneCode: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      decision: 'decision',
      sceneCode: 'scene_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      decision: 'string',
      sceneCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 京东进件商家结算信息
export class MerchantSettleInfo extends $tea.Model {
  // 结算银行卡账号
  bankNum: string;
  // 联行号 
  bankCnap: string;
  // 结算账户类型 
  // merchant_type=01企业时：ENTERPRISE
  // 03:民办非企业：ENTERPRISE
  // 07个体工商户时：PERSON或 ENTERPRISE
  bankAccountType: string;
  // 支行名称
  bankBranchName?: string;
  // 银行名称
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

// 智能体二期-知识点信息
export class KnowledgeInfo extends $tea.Model {
  // 租户id
  tenantId?: string;
  // 主键id
  id?: number;
  // 类型
  type?: string;
  // 问题
  question?: string;
  // 答案
  answer?: string;
  // 是否选择订单
  hasOrder?: boolean;
  // 是否带小程序链接
  hasAppLink?: boolean;
  // 是否转人工
  hasManual?: boolean;
  // 状态
  status?: string;
  // 驳回原因
  refuseReason?: string;
  static names(): { [key: string]: string } {
    return {
      tenantId: 'tenant_id',
      id: 'id',
      type: 'type',
      question: 'question',
      answer: 'answer',
      hasOrder: 'has_order',
      hasAppLink: 'has_app_link',
      hasManual: 'has_manual',
      status: 'status',
      refuseReason: 'refuse_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tenantId: 'string',
      id: 'number',
      type: 'string',
      question: 'string',
      answer: 'string',
      hasOrder: 'boolean',
      hasAppLink: 'boolean',
      hasManual: 'boolean',
      status: 'string',
      refuseReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 营销分对象
export class MarketingScoreInfo extends $tea.Model {
  // 手机号
  phoneNum?: string;
  // 营销分
  score?: string;
  static names(): { [key: string]: string } {
    return {
      phoneNum: 'phone_num',
      score: 'score',
    };
  }

  static types(): { [key: string]: any } {
    return {
      phoneNum: 'string',
      score: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商家举证材料
export class MerchantSupportEvidence extends $tea.Model {
  // 商家操作(拒绝)时间
  merchantOperateTime?: string;
  // 商家拒绝原因
  merchantRefuseReason?: string;
  // 商家拒绝举证材料
  merchantRefuseEvidences?: string[];
  static names(): { [key: string]: string } {
    return {
      merchantOperateTime: 'merchant_operate_time',
      merchantRefuseReason: 'merchant_refuse_reason',
      merchantRefuseEvidences: 'merchant_refuse_evidences',
    };
  }

  static types(): { [key: string]: any } {
    return {
      merchantOperateTime: 'string',
      merchantRefuseReason: 'string',
      merchantRefuseEvidences: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单电子合同信息对象
export class OrderContractInfo extends $tea.Model {
  // 电子合同签署单号
  signNo?: string;
  // 签署时间
  signTime?: string;
  // 合同签署类型
  contractType?: string;
  // 文件合同类型
  agreementType?: string;
  // 模板ID
  templateId?: string;
  // 模板文件名称
  fileName?: string;
  // 合同文件下载地址
  downloadUrl?: string;
  static names(): { [key: string]: string } {
    return {
      signNo: 'sign_no',
      signTime: 'sign_time',
      contractType: 'contract_type',
      agreementType: 'agreement_type',
      templateId: 'template_id',
      fileName: 'file_name',
      downloadUrl: 'download_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      signNo: 'string',
      signTime: 'string',
      contractType: 'string',
      agreementType: 'string',
      templateId: 'string',
      fileName: 'string',
      downloadUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商户履约赎回信息
export class MerchantPerformanceRedeemInfo extends $tea.Model {
  // 是否展示“剩余账期提前回购”
  supportRedeem?: boolean;
  // 可选回购类型
  // TRANSFER("TRANSFER", "转账代偿"),
  // WITHHOLD("WITHHOLD", "代扣代偿"),
  supportRedeemTypeList?: string[];
  // 商户履约赎回结果信息
  merchantPerformanceRedeemResultInfo?: MerchantPerformanceRedeemResultInfo;
  static names(): { [key: string]: string } {
    return {
      supportRedeem: 'support_redeem',
      supportRedeemTypeList: 'support_redeem_type_list',
      merchantPerformanceRedeemResultInfo: 'merchant_performance_redeem_result_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      supportRedeem: 'boolean',
      supportRedeemTypeList: { 'type': 'array', 'itemType': 'string' },
      merchantPerformanceRedeemResultInfo: MerchantPerformanceRedeemResultInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 待办信息
export class PendingEventInfo extends $tea.Model {
  // 事件id
  eventId?: string;
  // 通知:NOTIFICATION
  // 确认函:CONFIRMATION
  type?: string;
  // ("PENDING","待办中"),  ("CONFIRMED","确认"),  
  // ("REJECTED","已拒绝")
  // ("FAILED","失败"),("EXPIRED","已过期");
  status?: string;
  // 待办内容主题
  contentSubject?: string;
  // 事件有效期开始
  effectiveStartTime?: string;
  // 事件有效期结束
  effectiveEndTime?: string;
  // 待办类型
  // text
  // link
  contentType?: string;
  // 待办详情，
  // content_type=text，是富文本
  // content_type=link，是fileKey,通过antchain.ato.inner.file.download获取文件访问链接
  contentDetails?: string;
  static names(): { [key: string]: string } {
    return {
      eventId: 'event_id',
      type: 'type',
      status: 'status',
      contentSubject: 'content_subject',
      effectiveStartTime: 'effective_start_time',
      effectiveEndTime: 'effective_end_time',
      contentType: 'content_type',
      contentDetails: 'content_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      eventId: 'string',
      type: 'string',
      status: 'string',
      contentSubject: 'string',
      effectiveStartTime: 'string',
      effectiveEndTime: 'string',
      contentType: 'string',
      contentDetails: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 智租风控-商品价格
export class PriceDetail extends $tea.Model {
  // 商品租赁期数
  periodNum: number;
  // 押金，单位：分。
  depositPrice: number;
  // 买断价格，单位：分
  buyoutPrice: number;
  // 首期租金，单位：分
  initialRentPrice: number;
  static names(): { [key: string]: string } {
    return {
      periodNum: 'period_num',
      depositPrice: 'deposit_price',
      buyoutPrice: 'buyout_price',
      initialRentPrice: 'initial_rent_price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      periodNum: 'number',
      depositPrice: 'number',
      buyoutPrice: 'number',
      initialRentPrice: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单消息结构体
export class OrderMsgInfo extends $tea.Model {
  // 订单id
  // 
  orderId: string;
  // 消息ID
  // 
  msgId: string;
  // 消息类型
  // 
  msgPublishType: string;
  // 消息创建时间
  // 
  msgCreateTime: string;
  // 消息投递状态 SUCCESS 成功 FAIL 失败 WAIT 等待投递重试
  msgStatus: string;
  // 消息重投次数
  // 
  msgRetryTime: number;
  // 消息体内容
  msgContent: string;
  // 消息回调地址
  msgCallbackUrl: string;
  // 新回调地址
  newMsgCallbackUrl: string;
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      msgId: 'msg_id',
      msgPublishType: 'msg_publish_type',
      msgCreateTime: 'msg_create_time',
      msgStatus: 'msg_status',
      msgRetryTime: 'msg_retry_time',
      msgContent: 'msg_content',
      msgCallbackUrl: 'msg_callback_url',
      newMsgCallbackUrl: 'new_msg_callback_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      msgId: 'string',
      msgPublishType: 'string',
      msgCreateTime: 'string',
      msgStatus: 'string',
      msgRetryTime: 'number',
      msgContent: 'string',
      msgCallbackUrl: 'string',
      newMsgCallbackUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 营销发奖风险识别入参模型
export class AwardingQueryModel extends $tea.Model {
  // 对方支付宝账户 uid，用于表示两个账户在业务交互中的对方账户，如人传人活动用户A会拉用户B来注册领奖，其中用户B为对方账户
  opposingUserid?: string;
  // 对方支付宝账户openid，营销发奖风险识别场景，userid 与 open_id 至少传入一个
  opposingOpenId?: string;
  // 服务二级分类
  serviceCategory?: string;
  // 服务商 pid
  isvPid?: string;
  // 银行卡号
  bankCardNo?: string;
  // 手机序列号
  imei?: string;
  // 国际移动用户识别码
  imsi?: string;
  // 金额，用户购买或使用服务时产生的具体金额，单位：分
  salesAmount?: number;
  // 用户姓名
  userName?: string;
  // 门店行业类目，枚举值：CATERING - 餐饮；LEISURE - 休闲；MEDICAL - 医疗
  storeMccDesc?: string;
  // 消费者 id，外部会员账号
  customerId: string;
  // 填入想要咨询风控的二维码值，需为唯一值
  qrCode?: string;
  static names(): { [key: string]: string } {
    return {
      opposingUserid: 'opposing_userid',
      opposingOpenId: 'opposing_open_id',
      serviceCategory: 'service_category',
      isvPid: 'isv_pid',
      bankCardNo: 'bank_card_no',
      imei: 'imei',
      imsi: 'imsi',
      salesAmount: 'sales_amount',
      userName: 'user_name',
      storeMccDesc: 'store_mcc_desc',
      customerId: 'customer_id',
      qrCode: 'qr_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      opposingUserid: 'string',
      opposingOpenId: 'string',
      serviceCategory: 'string',
      isvPid: 'string',
      bankCardNo: 'string',
      imei: 'string',
      imsi: 'string',
      salesAmount: 'number',
      userName: 'string',
      storeMccDesc: 'string',
      customerId: 'string',
      qrCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单用户信息
export class OrderUserInfo extends $tea.Model {
  // 承租人名称
  userName?: string;
  // 承租人手机号
  userPhoneNumber?: string;
  // 地址
  userAddress?: string;
  // 支付宝账号
  alipayUid?: string;
  // 租赁类别
  // 1:个人用户
  // 2:企业用户
  lesseeType?: number;
  // 承租人身份证
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      userName: 'user_name',
      userPhoneNumber: 'user_phone_number',
      userAddress: 'user_address',
      alipayUid: 'alipay_uid',
      lesseeType: 'lessee_type',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userName: 'string',
      userPhoneNumber: 'string',
      userAddress: 'string',
      alipayUid: 'string',
      lesseeType: 'number',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 租户协议分页对象
export class AgreementPage extends $tea.Model {
  // 协议id
  agreementId: string;
  // 代理企业名称
  merchantName: string;
  // 租户8位id
  tenantId: string;
  // 业务类型 枚举
  productMainClass: string;
  // 协议类型 枚举
  agreementType: string;
  // 租户签约状态 枚举
  signStatus: string;
  static names(): { [key: string]: string } {
    return {
      agreementId: 'agreement_id',
      merchantName: 'merchant_name',
      tenantId: 'tenant_id',
      productMainClass: 'product_main_class',
      agreementType: 'agreement_type',
      signStatus: 'sign_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      agreementId: 'string',
      merchantName: 'string',
      tenantId: 'string',
      productMainClass: 'string',
      agreementType: 'string',
      signStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 资方后台融资结果
export class FundMngLoanApplyResult extends $tea.Model {
  // 放款状态
  loanApplyStatus?: string;
  // 融资申请失败原因
  loanFailReason?: string;
  static names(): { [key: string]: string } {
    return {
      loanApplyStatus: 'loan_apply_status',
      loanFailReason: 'loan_fail_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      loanApplyStatus: 'string',
      loanFailReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签署人账户
export class SignAccount extends $tea.Model {
  // 公司统一社会信用代码（userType=ORGANIZATION必传）
  companyId?: string;
  // 公司角色（userType=ORGANIZATION必传） MERCHANT=商户;FINANCIER=资方
  companyRole?: string;
  // 用户姓名（userType=PERSON必传，需要RSA加密）
  userName?: string;
  // 用户身份证号（userType=PERSON必传，需要RSA加密）
  userIdNumber?: string;
  // 签署人类型，PERSON=个人;ORGANIZATION=机构
  userType: string;
  // 用户邮箱（userType=PERSON必传，需要RSA加密）
  userEmail?: string;
  // 用户手机号（userType=PERSON必传，需要RSA加密）
  userMobile?: string;
  // 签署标签（对应模版配置中的tag）
  tag: string;
  // 是否获取签署链接
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
  orderId: string;
  // 订单用信额度，单位为分
  orderCreditLine: number;
  // 订单商户应还金额，单位为分
  orderMerchantRepaymentMoney: number;
  // 分账起始日期
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

// 主动支付单据
export class ActivePayOrder extends $tea.Model {
  // 支付宝支付订单号，用于拉起主动支付页面
  tradeNo: string;
  // 状态
  // INIT：交易创建
  // FAILED：付款失败
  // SUCCESS：付款成功
  tradeStatus: string;
  // 状态原因码
  statusReasonCode?: string;
  // 超时关闭
  statusReasonMsg?: string;
  // 本次交易支付的订单金额，单位为分
  // 付款成功或付款成功之后的状态必填
  totalAmount?: number;
  // 用户在交易中支付的金额，单位为分
  // 付款成功的状态必填
  paidAmount?: number;
  // 商家在交易中实际收到的款项，单位为分
  // 付款成功的状态必填
  receiptAmount?: number;
  // 交易支付时间
  // 付款成功的状态必填
  gmtPay?: string;
  // 支付单据创建时间
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

// 拒量模型
export class RejectRiskModel extends $tea.Model {
  //  拒量模型捞回分
  mobThreeScore: string;
  // 拒量模型首逾分
  fpdThirtyScore: string;
  static names(): { [key: string]: string } {
    return {
      mobThreeScore: 'mob_three_score',
      fpdThirtyScore: 'fpd_thirty_score',
    };
  }

  static types(): { [key: string]: any } {
    return {
      mobThreeScore: 'string',
      fpdThirtyScore: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分页查询对象
export class PageQuery extends $tea.Model {
  // 页大小
  pageSize: number;
  // 当前页
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

// 合同签署模板和渲染参数
export class TemplateArgs extends $tea.Model {
  // 模板id
  templateId: string;
  // 模板版本
  templateVersion?: string;
  // 模板参数，JSON格式，其中key对应模板中的名称，value对应其要渲染的值
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

export class QueryAntchainAtoPromotionUserunvisitedappidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 支付宝用户uid
  userId: string;
  // 订阅的appid列表，不支持的appid会自动忽略
  appIdList: string[];
  // 默认appid，无法判断推荐结果时返回此默认值
  defaultAppId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      appIdList: 'app_id_list',
      defaultAppId: 'default_app_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
      appIdList: { 'type': 'array', 'itemType': 'string' },
      defaultAppId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoPromotionUserunvisitedappidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 推荐的appid
  recommendAppId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      recommendAppId: 'recommend_app_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      recommendAppId: 'string',
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
          _prod_code: "SMARTPROMOTION",
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
   * Description: 智能营销，查询用户未访问过的appid
   * Summary: 智能营销，查询用户未访问过的appid
   */
  async queryAntchainAtoPromotionUserunvisitedappid(request: QueryAntchainAtoPromotionUserunvisitedappidRequest): Promise<QueryAntchainAtoPromotionUserunvisitedappidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainAtoPromotionUserunvisitedappidEx(request, headers, runtime);
  }

  /**
   * Description: 智能营销，查询用户未访问过的appid
   * Summary: 智能营销，查询用户未访问过的appid
   */
  async queryAntchainAtoPromotionUserunvisitedappidEx(request: QueryAntchainAtoPromotionUserunvisitedappidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainAtoPromotionUserunvisitedappidResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainAtoPromotionUserunvisitedappidResponse>(await this.doRequest("1.0", "antchain.ato.promotion.userunvisitedappid.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainAtoPromotionUserunvisitedappidResponse({}));
  }

}
